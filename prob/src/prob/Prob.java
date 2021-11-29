/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prob;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

/**
 *
 * @author julia
 */
public class Prob {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Prueba p = new Prueba();
        p.setNombre("Holo");
        
        try {
            EntityManager em =
            Persistence.createEntityManagerFactory("nombreUnidadDePersistencia").createEntityManager();
            
            em.getTransaction().begin();
            em.persist(p);
            em.getTransaction().commit();
            em.close();
        } catch(Exception e) {
            
        }
    }
    
}
