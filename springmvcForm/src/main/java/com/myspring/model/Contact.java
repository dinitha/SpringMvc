package com.myspring.model;

/**
 * Created by D on 3/4/2017.
 */
public class Contact {

    private int Id;
    private  String Name;
    private  String Address;
    private  String Email;
    private  String Telephone;

    public Contact() {
    }

    public Contact(int id, String name, String address, String email, String telephone) {
        Id = id;
        Name = name;
        Address = address;
        Email = email;
        Telephone = telephone;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getTelephone() {
        return Telephone;
    }

    public void setTelephone(String telephone) {
        Telephone = telephone;
    }
}
