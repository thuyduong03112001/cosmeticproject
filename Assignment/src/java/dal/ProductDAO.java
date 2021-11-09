package dal;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.Contact;
import model.News;
import model.Products;
import model.User;

public class ProductDAO extends DBContext {
    public List<Products> getAll(){
        List<Products> list = new ArrayList<>();
        String sql="select * from Products";
        try{
           PreparedStatement st = connection.prepareStatement(sql);
           ResultSet r = st.executeQuery();
           while(r.next()){
               Products p = new Products();
               p.setProductId(r.getInt("productId"));
               p.setProductName(r.getString("productName"));
               p.setPrice(r.getFloat("price"));
               p.setAmount(r.getInt("amount"));
               p.setImages(r.getString("images"));
               p.setDescription(r.getString("description"));
               p.setCategoryId(r.getInt("categoryId"));
               list.add(p);
           }
        }catch(SQLException e){
            System.out.println(e);
        }
        return list;
    }
    
    public List<Products> getByCatID(int id) {
        List<Products> list = new ArrayList<>();
        String sql = "select * from Products where CategoryID = ?";
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            st.setInt(1, id);
            ResultSet r = st.executeQuery();
            while (r.next()) {
               Products p = new Products();
               p.setProductId(r.getInt("productId"));
               p.setProductName(r.getString("productName"));
               p.setPrice(r.getFloat("price"));
               p.setAmount(r.getInt("amount"));
               p.setImages(r.getString("images"));
               p.setDescription(r.getString("description"));
               p.setCategoryId(r.getInt("categoryId"));
               list.add(p);
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        return list;
    }
    
    public List<Products> getProductDeal(){
        List<Products> list = new ArrayList<>();
        String sql="select top 5 * from Products Where CategoryID between 110 and 120 order by Price asc";
        try{
           PreparedStatement st = connection.prepareStatement(sql);
           ResultSet r = st.executeQuery();
           while(r.next()){
               Products p = new Products();
               p.setProductId(r.getInt("productId"));
               p.setProductName(r.getString("productName"));
               p.setPrice(r.getFloat("price"));
               p.setAmount(r.getInt("amount"));
               p.setImages(r.getString("images"));
               p.setDescription(r.getString("description"));
               p.setCategoryId(r.getInt("categoryId"));
               list.add(p);
           }
        }catch(SQLException e){
            System.out.println(e);
        }
        return list;
    }
    
    public List<User> getAllAccount(){
        List<User> list = new ArrayList<>();
        String sql = "select * from [User]";
        try{
           PreparedStatement st = connection.prepareStatement(sql);
           ResultSet r = st.executeQuery();
           while(r.next()){
               list.add(new User(r.getInt("AccountID"), r.getString("fullName"), r.getString("address"), r.getString("phone"), r.getString("Name"), r.getString("Password"), r.getInt("Admin")));
           }
        }catch(SQLException e){
            System.out.println(e);
        }
        return list;
    }
    
    
    public List<Products> getProductHome(){
        List<Products> list = new ArrayList<>();
        String sql="select top 12 * from Products Where CategoryID between 100 and 130 and Price between 270000 and 800000";
        try{
           PreparedStatement st = connection.prepareStatement(sql);
           ResultSet r = st.executeQuery();
           while(r.next()){
               Products p = new Products();
               p.setProductId(r.getInt("productId"));
               p.setProductName(r.getString("productName"));
               p.setPrice(r.getFloat("price"));
               p.setAmount(r.getInt("amount"));
               p.setImages(r.getString("images"));
               p.setDescription(r.getString("description"));
               p.setCategoryId(r.getInt("categoryId"));
               list.add(p);
           }
        }catch(SQLException e){
            System.out.println(e);
        }
        return list;
    }
    
    public boolean update(Products product, int id){
        String sql = "UPDATE Products SET ProductName = ?, Price = ?, "
                + "Amount = ?, Images = ?, [Description] = ?, "
                + "CategoryID = ? WHERE ProductID = ?";
        int check = 0;
        try{
            PreparedStatement st = connection.prepareStatement(sql);
            st.setString(1, product.getProductName());
            st.setFloat(2, product.getPrice());
            st.setInt(3, product.getAmount());
            st.setString(4, product.getImages());
            st.setString(5, product.getDescription());
            st.setInt(6, product.getCategoryId());
            st.setInt(7, id);
            check = st.executeUpdate();
        }catch(SQLException e){
            System.out.println(e);
        }
        return check > 0;
    }
    
    public List<News> getNews(){
        List<News> ls = new ArrayList<>();
        String sql = "select * from News";
         try{
           PreparedStatement st = connection.prepareStatement(sql);
           ResultSet r = st.executeQuery();
           while(r.next()){
               News n = new News();
               n.setNewsId(r.getInt("newsId"));
               n.setTitle(r.getString("title"));
               n.setContent(r.getString("content"));
               ls.add(n);
           }
        }catch(SQLException e){
            System.out.println(e);
        }
        return ls;
    }
     
     public List<Products> getListByPage(ArrayList<Products> list,
            int start, int end) {
        ArrayList<Products> arr = new ArrayList<>();
        for (int i = start; i < end; i++) {
            arr.add(list.get(i));
        }
        return arr;
    }    
     
    public void insertContact(Contact c){
        try{
            String sql = "insert into Contact values (?, ?, ?, ?)";   
            PreparedStatement st = connection.prepareStatement(sql);
            st.setString(1, c.getName());
            st.setString(2, c.getEmail());
            st.setString(3, c.getSubject());
            st.setString(4, c.getMessage());
            st.executeUpdate();
        }catch(SQLException e){
            System.out.println(e);
        }
    }
    
    public List<Products> searchByName(String key){
        List<Products> list = new ArrayList<>();
        String sql = "select * from Products where ProductName like ?";
        try{
            PreparedStatement st = connection.prepareStatement(sql);
            st.setString(1, "%"+key+"%");
            ResultSet rs = st.executeQuery();
            while (rs.next()){
                Products p = new Products();
                p.setProductId(rs.getInt("productId"));
                p.setProductName(rs.getString("productName"));
                p.setPrice(rs.getFloat("price"));
                p.setAmount(rs.getInt("amount"));
                p.setImages(rs.getString("images"));
                p.setDescription(rs.getString("description"));
                p.setCategoryId(rs.getInt("categoryId"));
                list.add(p);
            }
        }catch(SQLException e){
            System.out.println(e);
        }
        return list;        
    } 
    
    public Products getProductById(int proId){
        String sql ="select * from products where ProductID=?";
        try{
            PreparedStatement st = connection.prepareStatement(sql);
            st.setInt(1, proId);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                return new Products(rs.getInt("productId"),
                        rs.getString("productName"),
                        rs.getFloat("price"),
                        rs.getInt("amount"),
                        rs.getString("images"),
                        rs.getString("description"),
                        rs.getInt("categoryId"));
            }
        }catch(SQLException e){
            System.out.println(e);
        }
        return null;
    }
    
    public List<Products> getProductBySellId(int id){
        List<Products> list = new ArrayList<>();
        String sql ="select * from Products where SellID = ?";
        try{
            PreparedStatement st = connection.prepareStatement(sql);
            st.setInt(1, id);
            ResultSet rs = st.executeQuery();
            while(rs.next()){
                Products p = new Products();
                p.setProductId(rs.getInt("productId"));
                p.setProductName(rs.getString("productName"));
                p.setPrice(rs.getFloat("price"));
                p.setAmount(rs.getInt("amount"));
                p.setImages(rs.getString("images"));
                p.setDescription(rs.getString("description"));
                p.setCategoryId(rs.getInt("categoryId"));
                list.add(p);
            }
        }catch(SQLException e){
            System.out.println(e);
        }
        return list;
    }
    
    public User login(String name, String password){
        String sql = "select * from [User] where [Name] = ? and [Password] = ?";
        try{
            PreparedStatement st = connection.prepareStatement(sql);
            st.setString(1, name);
            st.setString(2, password);
            ResultSet rs = st.executeQuery();
            while(rs.next()){
                return new User(rs.getInt("AccountID"),
                        rs.getString("fullName"),
                        rs.getString("address"),
                        rs.getString("phone"),
                        rs.getString("Name"), 
                        rs.getString("Password"), 
                        rs.getInt("Admin"));
            }
        }catch(SQLException e){
            System.out.println(e);
        }
        return null;
    }
    
    public User checkUserExist(String account){
        String sql = "select * from [User] where [Name] = ?";
        try{
            PreparedStatement st = connection.prepareStatement(sql);
            st.setString(1, account);
            ResultSet rs = st.executeQuery();
            while(rs.next()){
                return new User(rs.getInt("AccountID"), 
                        rs.getString("fullName"),
                        rs.getString("address"),
                        rs.getString("phone"),
                        rs.getString("Name"), 
                        rs.getString("Password"), 
                        rs.getInt("Admin"));
            }
        }catch(SQLException e){
            System.out.println(e);
        }
        return null;
    }
    
    public void signup(String fullname, String phone, String address, String name, String pass){
        String sql = "insert into [User] values(?,?,?,?,?,0)";
        try{
           PreparedStatement st = connection.prepareStatement(sql);
           st.setString(1, fullname);
           st.setString(2, phone);
           st.setString(3, address);
           st.setString(4, name);
           st.setString(5, pass);
           ResultSet rs = st.executeQuery();
        }catch(SQLException e){
            System.out.println(e);
        }
    }
    
    public boolean updateProfile(User u, int id) {
        String sql = "UPDATE User SET FullName = ? ,Phone = ?, [Address] = ?, [Name] = ? , [Password] = ? WHERE AccountID = ?";
        int check = 0;
        try { 
            PreparedStatement st = connection.prepareStatement(sql);
            st.setString(1, u.getFullName());
            st.setString(2, u.getAddress());
            st.setString(3, u.getPhone());
            st.setString(4, u.getName());
            st.setString(5, u.getPassword());
            st.setInt(6, id);
            check = st.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e);
        }
        return check > 0;
    }
       
    
    public void addProduct(int productId, String productName, float price, String images, String description, String category, int sid){
        String sql = "insert into Products(ProductID, ProductName, Price, Images, [Description], CategoryID, SellID)\n" +
" values (?, ?, ?, ?, ?, ?, ?)";
        try{
            PreparedStatement st = connection.prepareStatement(sql);
            st.setInt(1, productId);
            st.setString(2, productName);
            st.setFloat(3, price);
            st.setString(4, images);
            st.setString(5, description);
            st.setString(6, category);
            st.setInt(7, sid);
            st.executeQuery();
        }catch(SQLException e){
            System.out.println(e);
        }       
    }
    
    public void editProduct(String productName, float price, String images, String description, String categoryID, String productId){
        String sql = "UPDATE Products SET ProductName = ?, Price = ?, Images = ?, [Description] = ?, CategoryID = ? WHERE ProductID = ?";
        try{
        PreparedStatement st = connection.prepareStatement(sql);
            st.setString(1, productName);
            st.setFloat(2, price);
            st.setString(3, images);
            st.setString(4, description);
            st.setString(5, categoryID);
            st.setString(6, productId);
            st.executeQuery();
        }catch(SQLException e){
            System.out.println(e);
        }
               
    }
    
    public void deleteProduct(String productId){
        String sql = "delete from Products where ProductID = ?";
        try{
            PreparedStatement st = connection.prepareStatement(sql);
            st.setString(1, productId);
            st.executeQuery();
        }catch(SQLException e){
            System.out.println(e);
        }
    }
    
    
    public static void main(String[] args){
        ProductDAO p = new ProductDAO();
        List<Products> ls = p.getAll();
        System.out.println(ls.get(0).getProductName());
    }
}
