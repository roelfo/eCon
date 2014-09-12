package br.upf.JPA.controller;

import br.upf.JPA.EntityManagerUtil;
import br.upf.model.bean.Cidade;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;

public class CidadeJPA {

    EntityManager em;

    public CidadeJPA() {
        em = EntityManagerUtil.getEntityManager();
    }

    public Integer persistirCidade(Cidade c) {
        String act;
        if (em == null) {
            em = EntityManagerUtil.getEntityManager();
        }
        try {
            em.getTransaction().begin();
            if (c.getId() == null) {
                em.persist(c);
                act = "PERSIST";
            } else {
                em.merge(c);
                act = "MERGE";
            }
            em.getTransaction().commit();
            new GravaLog(act + " CIDADE", c.getNome() + " - " + c.getCep(), this.getClass());
            return 1;
        } catch (Exception e) {
            em.getTransaction().rollback();
            return 0;
        } finally {
            try {
                em.close();
            } catch (Exception e) {
            }
        }
    }

    public List<Cidade> buscarTodasCidades() {
        if (em == null) {
            em = EntityManagerUtil.getEntityManager();
        }
        List<Cidade> lista = em.createQuery("from Cidade order by nome").getResultList();
        return lista;
    }

    public List<Cidade> buscaID(Integer id) {
        if (em == null) {
            em = EntityManagerUtil.getEntityManager();
        }
        String hql = "from Cidade where id = :id";
        Query query = em.createQuery(hql);
        query.setParameter("id", id);

        List<Cidade> lista = query.getResultList();
        return lista;
    }

    public Integer excluirCidade(Cidade cidade) {
        if (em == null) {
            em = EntityManagerUtil.getEntityManager();
        }
        try {
            em.getTransaction().begin();
            em.remove(em.getReference(Cidade.class, cidade.getId()));
            em.getTransaction().commit();
            new GravaLog("DELETE CIDADE", cidade.getNome() + " - " + cidade.getCep(), this.getClass());
            return 1;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return 0;
        } finally {
            em.close();
        }
    }
}
