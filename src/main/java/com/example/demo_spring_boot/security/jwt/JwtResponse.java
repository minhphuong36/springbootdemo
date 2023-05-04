package com.example.demo_spring_boot.security.jwt;

public class JwtResponse {
    private int id;
    private String accessToken;
    private String tokenType = "Bearer";
    private String userName;
    private String name;


    public JwtResponse(int id, String accessToken, String userName, String name) {
        this.id = id;
        this.accessToken = accessToken;
        this.userName = userName;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAccessToken() {
        return accessToken;
    }

    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }

    public String getTokenType() {
        return tokenType;
    }

    public void setTokenType(String tokenType) {
        this.tokenType = tokenType;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
