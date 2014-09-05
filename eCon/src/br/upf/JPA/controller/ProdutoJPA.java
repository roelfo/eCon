package br.upf.JPA.controller;

import br.upf.JPA.EntityManagerUtil;
import br.upf.model.bean.Produto;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;

public class ProdutoJPA {

    EntityManager em;

    public ProdutoJPA() {
        em = EntityManagerUtil.getEntityManager();
    }

    public Integer persistirProduto(Produto p) {
        if (em == null) {
            em = EntityManagerUtil.getEntityManager();
        }
        try {
            em.getTransaction().begin();
            if (p.getId() == null) {
                em.persist(p);
            } else {
                em.merge(p);
            }
            em.getTransaction().commit();
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

    public List<Produto> buscarTodasProdutos() {
        if (em == null) {
            em = EntityManagerUtil.getEntityManager();
        }
        List<Produto> lista = em.createQuery("from Produto order by nome").getResultList();
        return lista;
    }

    public List<Produto> getByID(Integer id) {
        if (em == null) {
            em = EntityManagerUtil.getEntityManager();
        }
        String hql = "from Produto where id = :id";
        Query query = em.createQuery(hql);
        query.setParameter("id", id);

        List<Produto> lista = query.getResultList();
        return lista;
    }

    public Integer excluirProduto(Produto produto) {
        if (em == null) {
            em = EntityManagerUtil.getEntityManager();
        }
        try {
            em.getTransaction().begin();
            em.remove(em.getReference(Produto.class, produto.getId()));
            em.getTransaction().commit();
            return 1;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return 0;
        } finally {
            em.close();
        }
    }
}
