/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nullcipher;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/**
 *
 * @author kostis
 */
public class AthleteService {
    
    AthleteDao adao = new AthleteDao();
    
    
   public List<Athlete> getAthletes(){
        return adao.printAthlete();
    }
   
   public void createAthlete(String athlete_name,String age, String height,String weight,String dob,String team) throws ParseException {
       int timi = Integer.parseInt(age);
       int height1 = Integer.parseInt(height);
       int weight1 = Integer.parseInt(weight);
       int team1 = Integer.parseInt(team);
       DateFormat format = new SimpleDateFormat("MMMM d, yyyy", Locale.ENGLISH);
       Date date = format.parse(dob);
       
       Team team2 = adao.findTeambyId(team1);
       
       Athlete athlete = new Athlete(athlete_name, timi,height1,weight1,date,team2);
       adao.createAthlete(athlete);
    }
}
