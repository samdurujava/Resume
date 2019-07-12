package com.example.demo;

import org.springframework.lang.NonNull;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.ArrayList;
import javax.persistence.Entity;
import javax.validation.constraints.NotNull;
import javax.persistence.GeneratedValue;
import java.util.Date;


@Entity
public class Resume {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @NonNull
    private String fname;

    @NonNull
    private String lname;

    @NonNull
    private String email;

    @NonNull
    private int phone;

    @NonNull
    private String school;

    @NonNull
    private String degree;

    @NonNull
    private int year;

    @NonNull
    private String company;

    @NonNull
    private String title;

    @NonNull
    private Date date;

    @NonNull
    private String description;

    @NonNull
    private String skill;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getSkill() {
        return skill;
    }

    public void setSkill(String skill) {
        this.skill = skill;
    }
}