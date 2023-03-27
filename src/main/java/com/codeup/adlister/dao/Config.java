package com.codeup.adlister.dao;

public class Config {

    final String url = "jdbc:mysql://localhost:3306/adlister_db?allowPublicKeyRetrieval=true&useSSL=false";

    final String user = "root";

    final String password = "codeup";

    public String getUrl() {
        return url;
    }
    public String getUser() {
        return user;
    }
    public String getPassword() {
        return password;
    }
}