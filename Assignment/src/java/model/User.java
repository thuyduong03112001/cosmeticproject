package model;

public class User {
    private int AccountID;
    private String fullName;
    private String address;
    private String phone;
    private String Name;
    private String Password;
    private int Admin;

    public User() {
    }

    public User(int AccountID, String fullName, String address, String phone, String Name, String Password, int Admin) {
        this.AccountID = AccountID;
        this.fullName = fullName;
        this.address = address;
        this.phone = phone;
        this.Name = Name;
        this.Password = Password;
        this.Admin = Admin;
    }

    public int getAccountID() {
        return AccountID;
    }

    public void setAccountID(int AccountID) {
        this.AccountID = AccountID;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
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

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public int getAdmin() {
        return Admin;
    }

    public void setAdmin(int Admin) {
        this.Admin = Admin;
    }

    
}
