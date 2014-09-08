package br.upf.JPA.controller;

import br.upf.JPA.EntityManagerUtil;
import br.upf.messages.Mensagens;
import br.upf.model.bean.Usuario;
import javax.persistence.EntityManager;

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

    public void excluir(Usuario u) {
        if (em == null) {
            em = EntityManagerUtil.getEntityManager();
        }

    }

    public void buscar() {
        if (em == null) {
            em = EntityManagerUtil.getEntityManager();
        }
    }

    public void findByID(Integer id) {
        if (em == null) {
            em = EntityManagerUtil.getEntityManager();
        }
    }

    public void login(Usuario u) {
        if (em == null) {
            em = EntityManagerUtil.getEntityManager();
        }
    }

}
