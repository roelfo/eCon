package br.upf.JPA;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Rodrigo
 */
public class EntityManagerUtil {

    static EntityManagerFactory emf = null;

    public static javax.persistence.EntityManager getEntityManager() {
        if (emf == null) {
            try {
                emf
                        = Persistence.createEntityManagerFactory("eConPU");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return emf.createEntityManager();
    }
}
