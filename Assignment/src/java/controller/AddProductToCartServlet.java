/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dal.ProductDAO;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.Cart;
import model.Products;

/**
 *
 * @author DELL
 */
public class AddProductToCartServlet extends HttpServlet {

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
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {

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
            
            String productId = request.getParameter("productId");
            String quan = request.getParameter("quantity");

            int id = 0;
            int quantity = 1; 
            try {
                id = Integer.parseInt(productId);
            } catch (NumberFormatException e) {
            }
            try {
                quantity = Integer.parseInt(quan);
                System.out.println("quantity : " + quantity);
            } catch (Exception e) {
            }

            ProductDAO pdb = new ProductDAO();
            Products p = pdb.getProductById(id);

            HttpSession session = request.getSession();

            ArrayList<Cart> listCart = (ArrayList<Cart>) session.getAttribute("listCart");
            Cart cart = new Cart(id, p.getProductName(), (int) p.getPrice(), quantity, p.getImages()); 

            boolean flag = false;
            if (listCart == null) { 
                listCart = new ArrayList<>();
                listCart.add(cart);
                session.setAttribute("listCart", listCart);
            } else { 
                for (Cart c : listCart) {
                    if (c.getProductId() == id) {
                        System.out.println("Sản phẩm đã tồn tại trong giỏ hàng");
                        flag = true;
                    }
                }

                if (!flag) {
                    listCart.add(cart);
                    flag = false;
                }

                session.setAttribute("listCart", listCart);
            }
            if (quan != null) {                
                request.setAttribute("productId", productId);
                request.getRequestDispatcher("productdetail").forward(request, response);
            } else { 
                request.getRequestDispatcher("home").forward(request, response);
            }   
           
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
