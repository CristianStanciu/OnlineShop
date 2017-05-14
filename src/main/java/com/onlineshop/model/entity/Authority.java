package com.onlineshop.model.entity;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by smc on 5/9/2017.
 */

@Entity
@Table(name = "AUTHORITY")
public class Authority implements Serializable{

    private static final long serialVersionUID = 7543014505287483443L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "AUTHORITY_ID")
    private int authorityId;

    @JoinColumn(name = "USERNAME", nullable = false)
    private String username;

    @Column(name = "AUTHORITY", nullable = false)
    private String authority;

    public Authority() {
    }

    public Authority(String username, String authority) {
        this.username = username;
        this.authority = authority;
    }

    public int getAuthorityId() {
        return authorityId;
    }

    public void setAuthorityId(int authorityId) {
        this.authorityId = authorityId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getAuthority() {
        return authority;
    }

    public void setAuthority(String authority) {
        this.authority = authority;
    }
}
