package com.cognizant.masterclass.webdemoexercise.models;

public class User {
    private String first_name;
    private String last_name;
    private String email;
    private String address;

    public User (String first_name, String last_name, String email, String address){
        this.first_name = first_name;
        this.last_name = last_name;
        this.email = email;
        this.address = address;
    }

    public String getFirstName() {
        return first_name;
    }

    public void setFirstName(String first_name) {
        this.first_name = first_name;
    }

    public String getLastName() {
        return last_name;
    }

    public void setLastName(String last_name) {
        this.last_name = last_name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
