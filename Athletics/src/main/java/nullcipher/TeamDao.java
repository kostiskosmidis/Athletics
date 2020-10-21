/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nullcipher;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

/**
 *
 * @author kostis
 */
public class TeamDao {
    private static EntityManagerFactory emf;
    private static EntityManager em;
    
    private static void openEntityManager() {
        em = emf.createEntityManager();
    }

    private static void closeEntityManager() {
        em.close();
    }

    private static void openEntityManagerFactory() {
        System.out.println("Opening EntityManagerFactory...");
        emf = Persistence.createEntityManagerFactory("mainPU");
    }

    private static void closeEmf() {
        emf.close();
        System.out.println("Closing EntityManagerFactory...");
    }
    
      public List<Team> printTeam() {
        openEntityManagerFactory();
        openEntityManager();
        String sql = "SELECT t FROM Team t";//JPQL: Java Persistence Query Language
        Query query = em.createQuery(sql, Team.class);//We create Object TypedQuery from EntityManager
        List<Team> list = query.getResultList();//Execute the query and get the result
        System.out.println("******************");
        for (Team t : list) {
            System.out.println(t);
        }
        System.out.println("******************");
        closeEntityManager();
        closeEmf();
        
        return list;
    }
    
    
      public void createTeam(Team t) {
        openEntityManagerFactory();
        openEntityManager();
        em.getTransaction().begin();
        em.persist(t);//Add student
        em.getTransaction().commit();
        closeEntityManager();
        closeEmf();
    }
}
