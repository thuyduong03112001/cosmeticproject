package model;

public class Products {
    private int productId;
    private String productName;
    private float price;
    private int amount;
    private String images;
    private String description;
    private int categoryId;

    public Products() {
        
    }  

    public Products(int productId, String productName, float price, int amount, String images, String description, int categoryId) {
        this.productId = productId;
        this.productName = productName;
        this.price = price;
        this.amount = amount;
        this.images = images;
        this.description = description;
        this.categoryId = categoryId;
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

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getImages() {
        return images;
    }

    public void setImages(String images) {
        this.images = images;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }
}

    