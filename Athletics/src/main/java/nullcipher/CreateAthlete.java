/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nullcipher;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author kostis
 */
@WebServlet(name = "CreateAthlete", urlPatterns = {"/athlete/create"})
public class CreateAthlete extends HttpServlet {
  private AthleteService service = new AthleteService();
    
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        
        String athlete_name = req.getParameter("athlete_name");
        String age = req.getParameter("age");
        String height = req.getParameter("height");
        String weight= req.getParameter("weight");
        String dob = req.getParameter("dob");
        String team = req.getParameter("team");
      try {
          service.createAthlete(athlete_name, age,height,weight,dob,team);//Store Product in DB
      } catch (ParseException ex) {
          Logger.getLogger(CreateAthlete.class.getName()).log(Level.SEVERE, null, ex);
      }
        String contextPath = req.getContextPath();
        resp.sendRedirect(contextPath+"/AthleteServlet");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        
    }

   
}
