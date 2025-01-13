package com.example.fpoly.entity;

public class User {
    String fullname;
    boolean gender;
    String country;

    public User() {
    }

    public User(String fullname, boolean gender, String country) {
        this.fullname = fullname;
        this.gender = gender;
        this.country = country;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
