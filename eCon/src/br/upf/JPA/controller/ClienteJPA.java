/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template clienteile, choose Tools | Templates
 * and open the template in the editor.
 */
package br.upf.JPA.controller;

import br.upf.JPA.EntityManagerUtil;
import br.upf.model.bean.Cliente;
import br.upf.JPA.EntityManagerUtil;
import br.upf.model.bean.Cliente;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;

/**
 *
 * @author Rodrigo
 */
public class ClienteJPA {

    EntityManager em;

    public ClienteJPA() {
        em = EntityManagerUtil.getEntityManager();
    }

    public Integer persistirCliente(Cliente cliente) {
        if(em == null) {
            em = EntityManagerUtil.getEntityManager();
        }
        try {
            System.out.println(cliente.getCidade());
            em.getTransaction().begin();
            if(cliente.getId() == null){
                em.persist(cliente);
            } else {
                em.merge(cliente);
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

    public List<Cliente> buscarTodosClientes() {
        if (em == null) {
            em = EntityManagerUtil.getEntityManager();
        }
        List<Cliente> lista = em.createQuery("from Cliente order by id").getResultList();
        return lista;
    }

    public List<Cliente> getByID(int id) {
        if (em == null) {
            em = EntityManagerUtil.getEntityManager();
        }
        String hql = "from Cliente where id = :id";
        Query query = em.createQuery(hql);
        query.setParameter("id", id);
        
        List<Cliente> lista = query.getResultList();
        return lista;
    }
    
    public int excluir(Cliente cliente){
        if (em == null) {
            em = EntityManagerUtil.getEntityManager();
        }
        try {
            em.getTransaction().begin();
            em.remove(em.getReference(Cliente.class, cliente.getId()));
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
