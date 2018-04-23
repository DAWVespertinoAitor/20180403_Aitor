/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.albarregas.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Daw2
 */
@WebServlet(name = "ListaIdiomas", urlPatterns = {"/ListaIdiomas"})
public class ListaIdiomas extends HttpServlet {
    
    Locale lista[] = SimpleDateFormat.getAvailableLocales();
    
    public void init(ServletConfig config) throws ServletException{
        
        super.init(config);
        
        
        System.out.println("______________________________________");
        for (int i = 0; i < lista.length; i++) {
          System.out.println(lista[i].toString());
        }
        
        System.out.println("______________________________________");

        for (int i = 0; i < lista.length; i++) {
          System.out.println(lista[i].getDisplayName());
        }
        System.out.println("______________________________________");

        for (int i = 0; i < lista.length; i++) {
          System.out.println(lista[i].getDisplayName(Locale.FRANCE));
        }
        System.out.println("______________________________________");
    }
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
        String url = "/JSTL/internacionalizacion.jsp";
        
        request.setAttribute("codigo", lista);
        request.getRequestDispatcher(url).forward(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
        Date fecha = new Date();
        String escogido = request.getParameter("idioma");
        String url = "/JSTL/visualizarIdioma.jsp";
        if(escogido != null){
            request.setAttribute("escogido", escogido);
            request.setAttribute("fechaHoy", fecha);
            request.getRequestDispatcher(url).forward(request, response);
        }
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
