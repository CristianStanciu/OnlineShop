package com.onlineshop.model.vo;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;

/**
 * Created by smc on 5/9/2017.
 */

public class UserVO implements Serializable {

    private static final long serialVersionUID = 6351227651929551660L;

    private int userId;

    private String userName;

    private String password;

    private boolean active;

    private int customerId;

    public UserVO() {
    }

    public UserVO(String userName, String password, boolean active, int customerId) {
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


}

