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
public class AthleteDao {
    
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
    
    public List<Athlete> printAthlete() {
        openEntityManagerFactory();
        openEntityManager();
        String sql = "SELECT a FROM Athlete a";//JPQL: Java Persistence Query Language
        Query query = em.createQuery(sql, Athlete.class);//We create Object TypedQuery from EntityManager
        List<Athlete> list = query.getResultList();//Execute the query and get the result
        System.out.println("******************");
        for (Athlete s : list) {
            System.out.println(s);
        }
        System.out.println("******************");
        closeEntityManager();
        closeEmf();
        
        return list;
    }
    
    public Team findTeambyId(int id){
        openEntityManagerFactory();
        openEntityManager();
        Team team = em.find(Team.class, id);
        closeEntityManager();
        closeEmf();
        return team;}
    
    public void createAthlete(Athlete a) {
        openEntityManagerFactory();
        openEntityManager();
        em.getTransaction().begin();
        em.persist(a);//Add student
        em.getTransaction().commit();
        closeEntityManager();
        closeEmf();
    }
}
