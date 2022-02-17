package com.tauber.javaee.crud.javaeecrud.bean;

import java.util.ArrayList;
import java.util.List;

public class UserBean {
    private String name;
    private String email;
    private String password;
    private List<TelBean> tells = new ArrayList<>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<TelBean> getTells() {
        return tells;
    }

    public void setTells(List<TelBean> tells) {
        this.tells = tells;
    }
}
