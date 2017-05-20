package com.onlineshop.model.vo;

/**
 * Created by smc on 5/9/2017.
 */

public class AuthorityVO {

    private int authorityId;

    private String username;

    private String authority;

    public AuthorityVO() {
    }

    public AuthorityVO(String username, String authority) {
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


