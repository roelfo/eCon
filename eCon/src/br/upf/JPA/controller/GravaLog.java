package br.upf.JPA.controller;

import br.upf.JPA.EntityManagerUtil;
import br.upf.acessibilidade.functions;
import br.upf.model.bean.Log;
import br.upf.model.bean.Usuario;
import br.upf.session.Session;
import java.util.List;
import javax.persistence.EntityManager;
import javax.swing.JFrame;

public class GravaLog {

    private Log log;
    private EntityManager em;

    public GravaLog(String acao, String sql, JFrame tela) {
        Usuario User = Session.getInstance().getUser();
        String timestamp = functions.getAtualTime();
        String classe = tela.getClass().getCanonicalName();
        this.log = new Log(acao, sql, classe, User, timestamp);
        insere();
    }

    public GravaLog(String acao, String sql, Class tela) {
        Usuario User = Session.getInstance().getUser();
        String timestamp = functions.getAtualTime();
        String classe = tela.getClass().getCanonicalName();
        this.log = new Log(acao, sql, classe, User, timestamp);
        insere();
    }

    public GravaLog() {
    }
    

    private void insere() {
        if (em == null) {
            em = EntityManagerUtil.getEntityManager();
        }
        try {
            em.getTransaction().begin();
            em.persist(log);
            em.getTransaction().commit();
        } catch (Exception e) {
            try {
                em.getTransaction().rollback();
            } catch (Exception ex) {
            }
        } finally {
            em.close();
        }
    }

    public List<Log> todosLog() {
        if (em == null) {
            em = EntityManagerUtil.getEntityManager();
        }
        return em.createQuery("from Log order by id").getResultList();
    }
}
