/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nullcipher;

import java.util.List;

/**
 *
 * @author kostis
 */
public class TeamService {

    TeamDao tdao = new TeamDao();

    public void createTeam(String sport) {
        Team team = new Team(sport);
        tdao.createTeam(team);
        // Athlete athlete = new Athlete(athlete_name, timi, team);
        //adao.createAthlete(athlete);
    }

    public List<Team> getTeams() {
        return tdao.printTeam();
    }
}
