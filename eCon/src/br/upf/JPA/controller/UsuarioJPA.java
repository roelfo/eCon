package br.upf.JPA.controller;

import br.upf.JPA.EntityManagerUtil;
import br.upf.messages.Mensagens;
import br.upf.model.bean.Usuario;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;

public class UsuarioJPA {

    private EntityManager em;

    public UsuarioJPA() {
        em = EntityManagerUtil.getEntityManager();
    }

    public Integer inserir(Usuario u) {
        if (em == null) {
            em = EntityManagerUtil.getEntityManager();
        }
        try {
            em.getTransaction().begin();
            if (u.getId() == null) {
                em.persist(u);
            } else {
                em.merge(u);
            }
            em.getTransaction().commit();
            return 1;
        } catch (Exception e) {
            new Mensagens(null).exceptionDB(e.getMessage());
            em.getTransaction().rollback();
            return 0;
        } finally {
            em.close();
        }
    }

    public int excluir(Usuario u) {
        if (em == null) {
            em = EntityManagerUtil.getEntityManager();
        }
        try {
            em.getTransaction().begin();
            em.remove(em.getReference(Usuario.class, u.getId()));
            em.getTransaction().commit();
            return 1;
        } catch (Exception e) {
            try {
                em.getTransaction().rollback();
                new Mensagens(null).exceptionDB(e.getMessage());
            } catch (Exception ex) {
            }
            return 0;
        } finally {
            em.close();
        }
    }

    public List<Usuario> buscar() {
        if (em == null) {
            em = EntityManagerUtil.getEntityManager();
        }
        List<Usuario> lista = em.createQuery("from Usuario order by id").getResultList();
        return lista;
    }

    public List<Usuario> findByID(int id) {
        if (em == null) {
            em = EntityManagerUtil.getEntityManager();
        }
        String hql = "from Usuario where id = :id";
        Query query = em.createQuery(hql);
        query.setParameter("id", id);

        List<Usuario> lista = query.getResultList();

        return lista;
    }

    public void login(Usuario u) {
        if (em == null) {
            em = EntityManagerUtil.getEntityManager();
        }
    }

}
