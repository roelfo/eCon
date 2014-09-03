package br.upf.controller;

import br.upf.JPA.EntityManagerUtil;
import br.upf.model.bean.Cidade;
import java.util.List;
import javax.persistence.EntityManager;

/**
 *
 * @author Rodrigo
 */
public class ControleCidade {

    Cidade cidade;
    EntityManager em;

    public ControleCidade() {
        cidade = new Cidade();
        em = EntityManagerUtil.getEntityManager();
    }

    public boolean inserirCidade(Cidade c) {
        this.cidade = c;

        try {
            em.getTransaction().begin();
            em.persist(cidade);
            em.getTransaction().commit();
            return true;
        } catch (Exception e) {
            if(em.getTransaction().isActive() == false){
                em.getTransaction().begin();
            }
            em.getTransaction().rollback();
            return false;
        } finally {
            em.close();
        }
        
    }

    public boolean atualizarCidade(Cidade c) {
        this.cidade = c;
        
        try {
            em.getTransaction().begin();
            em.merge(cidade);
            em.getTransaction().commit();
            return true;
        } catch (Exception e) {
            em.getTransaction().rollback();
            return false;
        } finally {
            em.close();
        }
    }
    
    public boolean removerCidade(Cidade c) {
        this.cidade = c;
        
        try {
            em.getTransaction().begin();
            em.remove(cidade);
            em.getTransaction().commit();
            return true;
        } catch (Exception e) {
            em.getTransaction().rollback();
            return false;
        } finally {
            em.close();
        }
    }
    
    public List<Cidade> buscarCidade() {
        return em.createQuery("from Cidade order by id").getResultList();
    }
}
