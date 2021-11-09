/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dal.CategoryDAO;
import dal.OrderDAO;
import dal.ProductDAO;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.Cart;
import model.Categories;
import model.Order;
import model.OrderDetails;
import model.Products;
import model.User;

/**
 *
 * @author DELL
 */
public class PaymentServlet extends HttpServlet {

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
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet HomeServlet</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet HomeServlet at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
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
        OrderDAO o = new OrderDAO();
        ProductDAO pdb = new ProductDAO();
        String totalPrice = request.getParameter("totalPrice");
        int totalPricePay = 0;
        try {
            totalPricePay = Integer.parseInt(totalPrice);
        } catch (NumberFormatException e) {
            System.out.println(e);
        }
        HttpSession session = request.getSession(true);
        ArrayList<Cart> listCart = (ArrayList<Cart>) session.getAttribute("listCart");
        User current = (User) session.getAttribute("acc");
        Order order = new Order(current.getAccountID(), totalPricePay, 1);
        int orderId = o.saveOrder(order);
        if (orderId != 0) {
            for (Cart cart : listCart) {
                Products product = pdb.getProductById(cart.getProductId());
                int quantityOfProduct = product.getAmount();
                int quantityPayment = cart.getQuantity();
                if (quantityOfProduct > 0 && quantityPayment < quantityOfProduct) {
                    OrderDetails orderDetail = new OrderDetails(orderId, cart.getProductId(), product.getProductName(), product.getPrice(), cart.getQuantity());
                    o.add(orderDetail);
                    int restQuantity = quantityOfProduct - quantityPayment;
                    product.setAmount(restQuantity);
                    pdb.update(product, cart.getProductId());
                } else {

                }
            }
            String id_raw = request.getParameter("id");
            int id;
            if (id_raw == null) {
                id = 100;
            } else {
                id = Integer.parseInt(id_raw);
            }
            CategoryDAO cdb = new CategoryDAO();
            List<Categories> list1 = cdb.getAll();
            List<Products> list2 = pdb.getAll();
            List<Products> deal = pdb.getProductDeal();
            request.setAttribute("id", id);
            request.setAttribute("data1", list1);
            request.setAttribute("list", list2);
            request.setAttribute("data", deal);
            request.setAttribute("message", "Hệ thống đã ghi nhận đơn hàng của bạn, bạn vui lòng chờ cuộc gọi từ bên chúng tôi");
            session.removeAttribute("listCart");
            request.getRequestDispatcher("shoppingcart.jsp").forward(request, response);
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
