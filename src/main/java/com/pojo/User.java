package com.pojo;

import java.util.Date;

public class User {
//    user_id, user_name, email, cellphone, password, salt, state, create_time
    private int user_id;
    private String user_name;
    private String email;
    private String cellphone;
    private String password;
    private String salt;
    private int state;
    private Date create_time;

    @Override
    public String toString() {
        return "User{" +
                "user_id=" + user_id +
                ", user_name='" + user_name + '\'' +
                ", email='" + email + '\'' +
                ", cellphone='" + cellphone + '\'' +
                ", password='" + password + '\'' +
                ", salt='" + salt + '\'' +
                ", state=" + state +
                ", create_time=" + create_time +
                '}';
    }

    public User(int user_id, String user_name, String email, String cellphone, String password, String salt, int state, Date create_time) {
        this.user_id = user_id;
        this.user_name = user_name;
        this.email = email;
        this.cellphone = cellphone;
        this.password = password;
        this.salt = salt;
        this.state = state;
        this.create_time = create_time;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCellphone() {
        return cellphone;
    }

    public void setCellphone(String cellphone) {
        this.cellphone = cellphone;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public Date getCreate_time() {
        return create_time;
    }

    public void setCreate_time(Date create_time) {
        this.create_time = create_time;
    }
}
