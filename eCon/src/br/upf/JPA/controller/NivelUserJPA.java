package br.upf.JPA.controller;

import br.upf.JPA.EntityManagerUtil;
import br.upf.messages.Mensagens;
import br.upf.model.bean.Cidade;
import br.upf.model.bean.NivelAdmin;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;

public class NivelUserJPA {

    private EntityManager em;

    public NivelUserJPA() {
        em = EntityManagerUtil.getEntityManager();
    }

    public List buscarTodosNiveis() {
        if (em == null) {
            em = EntityManagerUtil.getEntityManager();
        }
        return em.createQuery("FROM NivelAdmin ORDER BY id").getResultList();
    }

    public Integer inserirNivel(NivelAdmin nivel) {
        if (em == null) {
            em = EntityManagerUtil.getEntityManager();
        }
        try {
            em.getTransaction().begin();
            if(nivel.getId() == null){
                em.persist(nivel);
            } else {
                em.merge(nivel);
            }
            em.getTransaction().commit();
            return 1;
        } catch (Exception e) {
            new Mensagens(null).exceptionDB(e.getMessage());
            return 0;
        } finally {
            em.close();
        }
    }
    
    public List<NivelAdmin> findByID(Integer id) {
        if (em == null) {
            em = EntityManagerUtil.getEntityManager();
        }
        String hql = "from NivelAdmin where id = :id";
        Query query = em.createQuery(hql);
        query.setParameter("id", id);

        List<NivelAdmin> lista = query.getResultList();
        return lista;
    }

}
