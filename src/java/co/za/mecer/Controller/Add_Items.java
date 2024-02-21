/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.za.mecer.Controller;

import co.za.mecer.client.Customer;
import co.za.mecer.client.test;
import co.za.mecer.service.RegisterImpl;
import co.za.mecer.service.RegisterService;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import co.za.mecer.item.Item;
import co.za.mecer.service.ItemService;
import co.za.mecer.service.ItemServiceImplement;

/**
 *
 * @author TRAIN 02
 */
@WebServlet(name = "Add_Items", urlPatterns = {"/Add_Items"})
public class Add_Items extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        Connection con = test.getConnection();

        ItemService itemServ = new ItemServiceImplement();
        if (request.getParameter("addItem") != null) {
            String item_Name = request.getParameter("item_name");
            String description = request.getParameter("item_desc");
            double price = Double.parseDouble(request.getParameter("item_price"));
            int quantity = Integer.parseInt(request.getParameter("item_quantity"));
            String info = request.getParameter("item_nutrients");
            String Allergens = request.getParameter("item_ingredients");

            Item item = new Item(item_Name, price ,quantity, Allergens, description,info);
            itemServ.add(item);
            RequestDispatcher view = request.getRequestDispatcher("dash.jsp");
            view.forward(request, response);

        }
        
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
