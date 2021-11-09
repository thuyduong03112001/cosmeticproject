package dal;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.Categories;

public class CategoryDAO extends DBContext {
    public List<Categories> getAll(){
        List<Categories> list = new ArrayList<>();
        String sql="select * from Categories";
        try{
           PreparedStatement st = connection.prepareStatement(sql);
           ResultSet rs = st.executeQuery();
           while(rs.next()){
               Categories c = new Categories();
               c.setCategoryID(rs.getInt("CategoryID"));
               c.setCategoryName(rs.getString("CategoryName"));        
               list.add(c);
           }
        }catch(SQLException e){
            System.out.println(e);
        }
        return list;
    }
     public static void main(String[] args){
        CategoryDAO p = new CategoryDAO();
        List<Categories> ls = p.getAll();
        System.out.println(ls.get(0).getCategoryName());
    }
}
