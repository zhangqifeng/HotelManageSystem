package com.example.entity;
<<<<<<< HEAD

=======
>>>>>>> f4e2c91d433cc0c81d7089310b8122f5fcda505f
import java.io.Serializable;

public class Hotel extends Account implements Serializable {
    private static final long serialVersionUID = 1L;

<<<<<<< HEAD
    /** ID */
    private Integer id;
    /** 酒店账号 */
    private String username;
    /** 密码 */
    private String password;
    /** 酒店名称 */
    private String name;
    /** 电话 */
    private String phone;
    /** 邮箱 */
    private String email;
    /** 酒店图片 */
    private String avatar;
    /** 角色标识 */
    private String role;
    /** 价格 */
    private Double price;
    /** 官网 */
    private String url;
    /** 介绍 */
    private String description;
    /** 审核状态 */
    private String status;

    public Hotel() {
    }

    public Hotel(Integer id, String username, String password, String name, String phone, String email, String avatar, String role, Double price, String url, String description, String status) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.name = name;
        this.phone = phone;
        this.email = email;
        this.avatar = avatar;
        this.role = role;
        this.price = price;
        this.url = url;
        this.description = description;
        this.status = status;
    }

=======

    private Integer id;
    private String username;
    private String password;
    private String name;
    private String phone;
    private String email;
    private String avatar;
    private String role;
    private Double price;
    private String url;
    private String description;

    private String status;

>>>>>>> f4e2c91d433cc0c81d7089310b8122f5fcda505f
    @Override
    public Integer getId() {
        return id;
    }

    @Override
    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public String getUsername() {
        return username;
    }

    @Override
    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public String getPassword() {
        return password;
    }

    @Override
    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String getAvatar() {
        return avatar;
    }

    @Override
    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    @Override
    public String getRole() {
        return role;
    }

    @Override
    public void setRole(String role) {
        this.role = role;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
