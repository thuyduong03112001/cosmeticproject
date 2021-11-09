/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dal.CategoryDAO;
import dal.ProductDAO;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Categories;
import model.News;
import model.Products;

/**
 *
 * @author DELL
 */
public class SearchServlet extends HttpServlet {

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
        request.setCharacterEncoding("UTF-8");
        String key = request.getParameter("txt");
        if(key== null){
            key="";
        }
        String id_raw = request.getParameter("id");
        int id;
        if(id_raw==null){
            id = 100;
        }else
            id=Integer.parseInt(id_raw);
        ProductDAO pdb= new ProductDAO();
        CategoryDAO cdb= new CategoryDAO();
        List<Products> list4 = pdb.searchByName(key);
        List<Categories> list1 = cdb.getAll();
        List<Products> list2 = pdb.getAll();
        List<Products> deal = pdb.getProductDeal();
        List<News> news = pdb.getNews();
        request.setAttribute("news", news);
        request.setAttribute("box", key);
        request.setAttribute("list1", list4);
        request.setAttribute("id", id);
        request.setAttribute("data1", list1);
        request.setAttribute("list", list2);
        request.setAttribute("data", deal);
        request.getRequestDispatcher("home.jsp").forward(request, response);
        
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
