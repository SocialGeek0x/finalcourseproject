/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.controller;

import java.io.IOException;
import javax.ejb.EJB;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Empresa;
import model.EmpresaFacade;

/**
 *
 * @author lager
 */
@WebServlet(name = "AddEmpresa", urlPatterns = {"/AddEmpresa"})
public class AddEmpresa extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    private final String PATH = "resultAddEmpresaOk.jsp";
    @EJB
    EmpresaFacade misEmpresas;
    Empresa e;

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

        String nombreEmpresa = request.getParameter("nombreForm").trim();
        String cifEmpresa = request.getParameter("cifEmpresaForm").trim();
        String sectorEmpresa = request.getParameter("sectorEmpresaForm").trim();
        Integer telefonoEmpresa = Integer.parseInt(request.getParameter("telefonoEmpresaForm"));
        e = new Empresa(nombreEmpresa, cifEmpresa, sectorEmpresa, telefonoEmpresa);

        misEmpresas.create(e);
        request.setAttribute("empresa", e);
        RequestDispatcher dispatcher = request.getRequestDispatcher(PATH);
        dispatcher.forward(request, response); // utilizamos el dispatcher para añadir el objeto empresa a la request y poderlo leer en el jsp correspondiente
        // en este caso resultAddEmpresaOk.jsp

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
