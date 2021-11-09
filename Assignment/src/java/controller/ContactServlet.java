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
import model.Contact;
import model.Products;

/**
 *
 * @author DELL
 */
public class ContactServlet extends HttpServlet {

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
            out.println("<title>Servlet ContactServlet</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet ContactServlet at " + request.getContextPath() + "</h1>");
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
        request.getRequestDispatcher("contact.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
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
     
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String subject = request.getParameter("subject");
        String message = request.getParameter("message");
        Contact c = new Contact();
        c.setName(name);
        c.setEmail(email);
        c.setSubject(subject);
        c.setMessage(message);
        ProductDAO d = new ProductDAO();
        d.insertContact(c);
        String valid = "Hệ thống đã nhận được thông tin của bạn";
        request.setAttribute("valid", valid);
        request.getRequestDispatcher("contact.jsp").forward(request, response);
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
