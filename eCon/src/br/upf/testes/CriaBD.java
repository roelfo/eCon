/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.upf.testes;

import br.upf.JPA.EntityManagerUtil;
import br.upf.model.bean.Cidade;
import javax.persistence.EntityManager;

/**
 *
 * @author Rodrigo
 */
public class CriaBD {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        EntityManager em = EntityManagerUtil.getEntityManager();
        Cidade c = new Cidade();
        c.setNome("Nova Prata");
        c.setCep("95320000");
        try {
            em.getTransaction().begin();
            em.persist(c);
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
        } finally{
            em.close();
        }

    }

}
