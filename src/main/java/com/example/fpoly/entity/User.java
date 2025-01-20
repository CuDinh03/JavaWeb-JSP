package com.example.fpoly.entity;

public class User {
    String fullname;
    boolean gender;
    String country;

    String hobbies;

    public User() {
    }

    public User(String fullname, boolean gender, String country, String hobbies) {
        this.fullname = fullname;
        this.gender = gender;
        this.country = country;
        this.hobbies = hobbies;
    }

    public String getFullname() {
        return fullname;
    }

    public String getHobbies() {
        return hobbies;
    }

    public void setHobbies(String hobbies) {
        this.hobbies = hobbies;
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
