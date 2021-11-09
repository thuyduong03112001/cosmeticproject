package model;

public class OrderDetails {
    private int id;
    private int orderId;
    private int productId;
    private String productName;
    private String name;
    private String address;
    private String phone;
    private float price;
    private int quantity;

    public OrderDetails() {
    }

    public OrderDetails(int id, int orderId, int productId, String productName, String name, String address, String phone, float price, int quantity) {
        this.id = id;
        this.orderId = orderId;
        this.productId = productId;
        this.productName = productName;
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.price = price;
        this.quantity = quantity;
    }

    public OrderDetails(int orderId, int productId, String productName, float price, int quantity) {
        this.orderId = orderId;
        this.productId = productId;
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
    }

    public OrderDetails(int orderId, int productId, String productName, String name, String address, String phone, float price, int quantity) {
        this.orderId = orderId;
        this.productId = productId;
        this.productName = productName;
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.price = price;
        this.quantity = quantity;
    }
    
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    
    
}
