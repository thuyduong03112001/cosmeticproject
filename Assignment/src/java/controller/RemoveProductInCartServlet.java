/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dal.CategoryDAO;
import dal.ProductDAO;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.Cart;
import model.Categories;
import model.Products;

/**
 *
 * @author DELL
 */
public class RemoveProductInCartServlet extends HttpServlet {

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
        String id_raw = request.getParameter("id");
            int id;
            if (id_raw == null) {
                id = 100;
            } else {
                id = Integer.parseInt(id_raw);
            }
            ProductDAO pdb = new ProductDAO();
            CategoryDAO cdb = new CategoryDAO();
            List<Categories> list1 = cdb.getAll();
            List<Products> list2 = pdb.getAll();
            List<Products> deal = pdb.getProductDeal();
            request.setAttribute("id", id);
            request.setAttribute("data1", list1);
            request.setAttribute("list", list2);
            request.setAttribute("data", deal);
            String id1 = request.getParameter("productId");
            int productId = 0;
            try {
                productId = Integer.parseInt(id1);
            } catch (Exception e) {
            }
            HttpSession session = request.getSession(true);
            ArrayList<Cart> listCart = (ArrayList<Cart>) session.getAttribute("listCart");
            int total = 0;
            for (Cart c : listCart) {
                if (productId == c.getProductId()) {
                    listCart.remove(c);
                    break;
                }

            }
            for (Cart c : listCart) {
                int price = c.getQuantity() * (int) c.getPrice();
                total += price;
            }
            session.setAttribute("totalPrice", total);
            response.sendRedirect("shoppingcart");
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
