/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nullcipher;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "stadium")
public class Stadium implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "sid")
    private int sid;
    @Column(name = "location")
    private String location;

    @ManyToMany(mappedBy = "stadiums")
    private List<Team> teams = new ArrayList<>();
    
    public Stadium() {
    }

    public Stadium(int sid, String location) {
        this.sid = sid;
        this.location = location;
    }

    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return "Stadium{" + "sid=" + sid + ", location=" + location + '}';
    }
    
    
}
