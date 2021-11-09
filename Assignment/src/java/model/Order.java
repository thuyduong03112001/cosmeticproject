package model;

import java.sql.Date;

public class Order {
    private int id;
    private Date createDate;
    private int userId;
    private float totalprice;
    private int statusId;

    public Order() {
    }

    public Order(int id, Date createDate, int userId, float totalprice, int statusId) {
        this.id = id;
        this.createDate = createDate;
        this.userId = userId;
        this.totalprice = totalprice;
        this.statusId = statusId;
    }
    
    public Order(Date createDate, int userId, float totalprice, int statusId) {
        this.createDate = createDate;
        this.userId = userId;
        this.totalprice = totalprice;
        this.statusId = statusId;
    }

    public Order(int userId, float totalprice, int statusId) {
        this.userId = userId;
        this.totalprice = totalprice;
        this.statusId = statusId;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }
    
    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }
    
    public int getStatusId() {
        return statusId;
    }

    public void setStatusId(int statusId) {
        this.statusId = statusId;
    }

    public float getTotalprice() {
        return totalprice;
    }

    public void setTotalprice(float totalprice) {
        this.totalprice = totalprice;
    }

    

    
    
}
