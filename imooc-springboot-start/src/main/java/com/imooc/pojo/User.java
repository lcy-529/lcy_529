package com.imooc.pojo;

import javax.persistence.*;

public class User {
    @Column(name = "teaId")
    private Integer teaid;

    private String password;

    private String name;

    private String role;

    private Integer state;

    /**
     * @return teaId
     */
    public Integer getTeaid() {
        return teaid;
    }

    /**
     * @param teaid
     */
    public void setTeaid(Integer teaid) {
        this.teaid = teaid;
    }

    /**
     * @return password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return role
     */
    public String getRole() {
        return role;
    }

    /**
     * @param role
     */
    public void setRole(String role) {
        this.role = role;
    }

    /**
     * @return state
     */
    public Integer getState() {
        return state;
    }

    /**
     * @param state
     */
    public void setState(Integer state) {
        this.state = state;
    }
}