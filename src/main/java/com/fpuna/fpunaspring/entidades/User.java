package com.fpuna.fpunaspring.entidades;


public class User {

    private Long id;
    private String name;
    private Integer type;
    private String phone;

    

    public Long getId() {
        return id;
    }

    public User setId(Long id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public User setName(String name) {
        this.name = name;
        return this;
    }

    public Integer getType() {
        return type;
    }

    public User setType(Integer type) {
        this.type = type;
        return this;
    }

    public String getPhone() {
        return phone;
    }

    public User setPhone(String phone) {
        this.phone = phone;
        return this;
    }

    

    public User copyFrom(User user) {
        if (user.name != null) {
            this.name = user.name;
        }
        if (user.type != null) {
            this.type = user.type;
        }
        if (user.phone != null) {
            this.phone = user.phone;
        }
       
        return this;
    }

}
