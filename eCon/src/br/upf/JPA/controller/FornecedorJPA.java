/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.upf.JPA.controller;

import br.upf.JPA.EntityManagerUtil;
import br.upf.model.bean.Fornecedor;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;

/**
 *
 * @author Rodrigo
 */
public class FornecedorJPA {

    EntityManager em;

    public FornecedorJPA() {
        em = EntityManagerUtil.getEntityManager();
    }

    public Integer persistirFornecedor(Fornecedor f) {
        if (em == null) {
            em = EntityManagerUtil.getEntityManager();
        }
        try {
            System.out.println(f.getCidade());
            em.getTransaction().begin();
            if(f.getId() == null){
                em.persist(f);
            } else {
                em.merge(f);
            }
            em.getTransaction().commit();
            return 1;
        } catch (Exception e) {
            em.getTransaction().rollback();
            System.out.println("Erro: " + e.getMessage());
            return 0;
        } finally {
            try {
                em.close();
            } catch (Exception e) {
            }
        }
    }

    public List<Fornecedor> buscarTodosFornecedores() {
        if (em == null) {
            em = EntityManagerUtil.getEntityManager();
        }
        List<Fornecedor> lista = em.createQuery("from Fornecedor order by id").getResultList();
        return lista;
    }

    public List<Fornecedor> getByID(int id) {
        if (em == null) {
            em = EntityManagerUtil.getEntityManager();
        }
        String hql = "from Fornecedor where id = :id";
        Query query = em.createQuery(hql);
        query.setParameter("id", id);
        
        List<Fornecedor> lista = query.getResultList();
        return lista;
    }
    
    public int excluir(Fornecedor fornecedor){
        if (em == null) {
            em = EntityManagerUtil.getEntityManager();
        }
        try {
            em.getTransaction().begin();
            em.remove(em.getReference(Fornecedor.class, fornecedor.getId()));
            em.getTransaction().commit();
            return 1;
        } catch (Exception e) {
            em.getTransaction().rollback();
            return 0;
        } finally {
            em.close();
        }
    }

}
