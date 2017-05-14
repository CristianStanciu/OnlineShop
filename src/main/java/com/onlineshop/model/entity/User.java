package com.onlineshop.model.entity;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by smc on 5/9/2017.
 */

@Entity
@Table(name = "USER")
public class User implements Serializable{

    private static final long serialVersionUID = -8278042220802663951L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "USER_ID")
    private int userId;

    @Column(name = "USERNAME", nullable = false)
    private String userName;

    @Column(name = "PASSWORD", nullable = false)
    private String password;

    @Column(name = "ACTIVE", nullable = false)
    private boolean active;

    @Column(name = "CUSTOMER_ID")
    private int customerId;

    public User() {
    }

    public User(String userName, String password, boolean active, int customerId) {
        this.userName = userName;
        this.password = password;
        this.active = active;
        this.customerId = customerId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", active=" + active +
                ", customerId=" + customerId +
                '}';
    }
}

