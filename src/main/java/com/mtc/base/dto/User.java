package com.mtc.base.dto;

/**
 * Created by majun on 10/16/16.
 */
public class User {

    private Long id;

    private String name;

    private String country;

    private String sex;

    private Long age;

    public Long getAge() {
        return age;
    }

    public void setAge(Long age) {
        this.age = age;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public User(Long id, String name, String sex,Long age, String country) {
        this.age = age;
        this.country = country;
        this.id = id;
        this.name = name;
        this.sex = sex;
    }
}
