package com.willing.model;

/**
 * Created by willingLin on 2016/10/7.
 */
public class Account {

    private Integer id;
    private String login;
    private String name;
    private String pass;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public Account(String login, String name, String pass) {
        this.login = login;
        this.name = name;
        this.pass = pass;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", login='" + login + '\'' +
                ", name='" + name + '\'' +
                ", pass='" + pass + '\'' +
                '}';
    }
}
