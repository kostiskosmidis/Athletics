/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nullcipher;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
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
@WebServlet(name = "AthleteServlet", urlPatterns = {"/AthleteServlet"})
public class AthleteServlet extends HttpServlet {
    
    private AthleteService service = new AthleteService();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        
         List<Athlete> listOfAthletes = service.getAthletes();
         
           req.setAttribute("athletes", listOfAthletes);
//        Pass the request to the JSP page to show the list of products. How? Use a RequestDispatcher object
          RequestDispatcher dispatcher = req.getRequestDispatcher("/Athletejsp.jsp");
          dispatcher.forward(req, resp);
        
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
          
        String athlete_name = req.getParameter("athlete_name");
        String age = req.getParameter("age");
        String height = req.getParameter("height");
        String weight = req.getParameter("weight");
        String dob = req.getParameter("dob");
        String team = req.getParameter("team");
        try {
            service.createAthlete(athlete_name, age,height,weight,dob,team);
        } catch (ParseException ex) {
            Logger.getLogger(AthleteServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
          
          RequestDispatcher dispatcher = req.getRequestDispatcher("/Athletejsp.jsp");
          dispatcher.forward(req, resp);
    }

  

}
