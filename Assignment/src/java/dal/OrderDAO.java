package dal;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import model.Order;
import model.OrderDetails;

public class OrderDAO extends DBContext{
    
    public int saveOrder(Order order){
        int orderId = 0;
        String sql = "insert into Orders(UserID, StatusID, TotalMoney) values(?, ?, ?)";
        try{
            PreparedStatement st = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            st.setInt(1, order.getUserId());
            st.setInt(2, order.getStatusId());
            st.setFloat(3, order.getTotalprice());
            st.executeUpdate();
            ResultSet r = st.getGeneratedKeys();
            if(r.next()){
                orderId = r.getInt(1);
            }
        }catch(SQLException e){
            System.out.println(e);
        }
        return orderId;
    }
    

    
    public boolean add(OrderDetails orderdetail){
        String sql2 = "insert into [Order Details] values (?,?,?,?,?)";
        int check = 0;
        try{
            PreparedStatement st = connection.prepareStatement(sql2);
            st.setInt(1, orderdetail.getOrderId());
            st.setInt(2, orderdetail.getProductId());
            st.setString(3, orderdetail.getProductName());
            st.setFloat(4, orderdetail.getPrice());
            st.setInt(5, orderdetail.getQuantity());
            check = st.executeUpdate();
        }catch(SQLException e){
            System.out.println(e);
        }
        return check > 0;
    }
    
    public ArrayList<Order> getAll(){
        ArrayList<Order> listOrder = new ArrayList<>();
        String sql  = "select * from Orders";
        try{
            PreparedStatement st = connection.prepareStatement(sql);
            ResultSet r = st.executeQuery();
            while(r.next()){
                Order order = new Order(r.getInt("id"), r.getDate("createDate"), r.getInt("userId"), (int) r.getFloat("totalprice"), r.getInt("statusId"));
                listOrder.add(order);
            }
            return listOrder;
        }catch(SQLException e){
            System.out.println(e);
        }
        return null;
    }
    
    public ArrayList<Order> getAllOrderPaging(int pageIndex, int pageSize) {
        ArrayList<Order> listOrder = new ArrayList<>();
        String sql = "select * from (\n"
                + "    select ROW_NUMBER() over (order by ID ASC) as rn, *\n"
                + "    from Orders\n"
                + ") as x\n"
                + "where rn between (?-1)*? +1 "
                + "and ? * ?";
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            st.setInt(1, pageIndex);
            st.setInt(2, pageSize);
            st.setInt(3, pageIndex);
            st.setInt(4, pageSize);
            ResultSet r = st.executeQuery();
            System.out.println(sql);
            while (r.next()) {
                Order order = new Order(r.getInt("id"), r.getDate("createDate"), r.getInt("userId"), r.getFloat("totalprice"), r.getInt("statusId"));
                listOrder.add(order);
            }

        } catch (SQLException e) {
            System.out.println(e);
        }
        return listOrder;
    }
    
}
