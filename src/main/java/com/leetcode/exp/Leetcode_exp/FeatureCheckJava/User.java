package com.leetcode.exp.Leetcode_exp.FeatureCheckJava;

import java.util.List;

public class User {
    int id;
    String name;
    List<String> email;
    int age;
    public User(int id, String name, List<String> email, int age) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.age = age;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    public List<String> getEmail() {
        return email;
    }
    public void setEmail(List<String> email) {
        this.email = email;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    @Override
    public String toString() {
        return "User [id=" + id + ", name=" + name + ", email=" + email + ", age=" + age + "]";
    }
    
    
}
