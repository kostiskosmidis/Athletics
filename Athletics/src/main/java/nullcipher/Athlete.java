/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nullcipher;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "athlete")
public class Athlete implements Serializable {
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   @Column(name = "aid")
   private int aid;
   @Column(name = "athlete_name")
   private String athlete_name;
   @Column(name = "age")
   private int age;
   @Column(name = "height")
   private int height;
   @Column(name = "weight")
   private int weight;
   @Column(name = "dob")
   private Date dob;

    @ManyToOne
    @JoinColumn(name = "team_id")
    private Team team;
    
    public Athlete() {
    }

    public Athlete(String athlete_name, int age) {
        this.athlete_name = athlete_name;
        this.age = age;
        
    }
    
    

    public Athlete(String athlete_name, int age, Team team) {
        this.athlete_name = athlete_name;
        this.age = age;
        this.team = team;
    }

    public Athlete(String athlete_name, int age, int height, int weight, Date dob, Team team) {
        this.athlete_name = athlete_name;
        this.age = age;
        this.height = height;
        this.weight = weight;
        this.dob = dob;
        this.team = team;
    }
    
    

    public int getAid() {
        return aid;
    }

    public void setAid(int aid) {
        this.aid = aid;
    }

    public String getAthlete_name() {
        return athlete_name;
    }

    public void setAthlete_name(String athlete_name) {
        this.athlete_name = athlete_name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    @Override
    public String toString() {
        return "Athlete{" + "aid=" + aid + ", athlete_name=" + athlete_name + ", age=" + age + ", height=" + height + ", weight=" + weight + ", dob=" + dob + '}';
    }
   
   
   
}
