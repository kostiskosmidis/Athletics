/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nullcipher;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author kostis
 */
@WebServlet(name = "TeamServlet", urlPatterns = {"/TeamServlet"})
public class TeamServlet extends HttpServlet {
private TeamService service = new TeamService();
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       
        String sport = req.getParameter("sport");
        service.createTeam(sport);
        //service.createAthlete(athlete_name, age);//Store Product in DB
        String contextPath = req.getContextPath();
        resp.sendRedirect(contextPath+"/AthleteServlet");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Team> listOfTeams = service.getTeams();
         
           req.setAttribute("teams", listOfTeams);
//        Pass the request to the JSP page to show the list of products. How? Use a RequestDispatcher object
          RequestDispatcher dispatcher = req.getRequestDispatcher("/Teamjsp.jsp");
          dispatcher.forward(req, resp);
        
        
    }

   
}
