package com.project.scm.entities;

import jakarta.persistence.*;

@Entity
public class Contact {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int cid;
    private String name;
    private String nickName;
    private String work;
    private String email;
    private String cImageUrl;
    @Column(length = 500)
    private String description;
    private String phone;

    @ManyToOne
    private User user;
    public Contact() {

    }

    public Contact(int cid, String name, String nickName, String work, String email, String cImageUrl, String description, String phone) {
        this.cid = cid;
        this.name = name;
        this.nickName = nickName;
        this.work = work;
        this.email = email;
        this.cImageUrl = cImageUrl;
        this.description = description;
        this.phone = phone;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getWork() {
        return work;
    }

    public void setWork(String work) {
        this.work = work;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getcImageUrl() {
        return cImageUrl;
    }

    public void setcImageUrl(String cImageUrl) {
        this.cImageUrl = cImageUrl;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "cid=" + cid +
                ", name='" + name + '\'' +
                ", nickName='" + nickName + '\'' +
                ", work='" + work + '\'' +
                ", email='" + email + '\'' +
                ", cImageUrl='" + cImageUrl + '\'' +
                ", description='" + description + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
}
