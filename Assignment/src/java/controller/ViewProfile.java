/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dal.OrderDAO;
import dal.ProductDAO;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.Order;
import model.User;

/**
 *
 * @author DELL
 */
public class ViewProfile extends HttpServlet {

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
            ProductDAO pdb = new ProductDAO();
            OrderDAO order = new OrderDAO();
            String fullName = request.getParameter("fullname");
            String phone = request.getParameter("phone");
            String address = request.getParameter("address");
            String viewHistory = request.getParameter("viewHistory");
            System.out.println("viewHistory : " + viewHistory);
            if (viewHistory != null) {
                ArrayList<Order> listOrder = order.getAllOrderPaging(1, 6);
                request.setAttribute("listOrder", listOrder);
                request.setAttribute("viewHistory", "true");
                request.getRequestDispatcher("profile.jsp").forward(request, response);
            } else {
                if (fullName != null || phone != null || address != null) {
                    HttpSession session = request.getSession(true);
                    User account = (User) session.getAttribute("acc");
                    account.setFullName(fullName);
                    account.setPhone(phone);
                    account.setAddress(address);
                    boolean check = pdb.updateProfile(account, account.getAccountID());
                    if (check) {
                        session.setAttribute("acc", account);
                        request.getRequestDispatcher("profile.jsp").forward(request, response);
                        System.out.println("Update thành công");
                    } else {
                        System.out.println("Update thất bại");
                    }
                } else {
                    response.sendRedirect("profile.jsp");
                }
            }

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
//        ProductDAO pdb = new ProductDAO();
//        OrderDAO order = new OrderDAO();
//        String fullName = request.getParameter("fullname");
//        String phone = request.getParameter("phone");
//        String address = request.getParameter("address");
//        String viewHistory = request.getParameter("viewHistory");
//        System.out.println("viewHistory : " + viewHistory);
//        if (viewHistory != null) {
//            ArrayList<Order> listOrder = order.getAllOrderPaging(1, 6);
//            request.setAttribute("listOrder", listOrder);
//            request.setAttribute("viewHistory", "true");
//            request.getRequestDispatcher("profile.jsp").forward(request, response);
//        } else {
//            if (fullName != null || phone != null || address != null) {
//                HttpSession session = request.getSession(true);
//                User account = (User) session.getAttribute("acc");
//                account.setFullName(fullName);
//                account.setPhone(phone);
//                account.setAddress(address);
//                boolean check = pdb.updateProfile(account, account.getAccountID());
//                if (check) {
//                    session.setAttribute("acc", account);
//                    request.getRequestDispatcher("profile.jsp").forward(request, response);
//                    System.out.println("Update thành công");
//                } else {
//                    System.out.println("Update thất bại");
//                }
//            } else {
//                response.sendRedirect("profile.jsp");
//            }
//        }
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
