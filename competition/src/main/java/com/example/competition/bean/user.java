package com.example.competition.bean;

/**
 * 描述:
 * user
 *
 * @author zhaojianyu
 * @create 2019-12-18 4:19 PM
 */
public class user {
    private Integer teacId;
    private String password;
    private String name;
    private String role;
    private int status;

    public user(Integer teacId, String password, String name, String role, int status) {
        this.teacId = teacId;
        this.password = password;
        this.name = name;
        this.role = role;
        this.status = status;
    }

    public user() {
    }

    public Integer getTeacId() {
        return teacId;
    }

    public void setTeacId(Integer teacId) {
        this.teacId = teacId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "user{" +
                "teacId=" + teacId +
                ", password='" + password + '\'' +
                ", name='" + name + '\'' +
                ", role='" + role + '\'' +
                ", status=" + status +
                '}';
    }
}
