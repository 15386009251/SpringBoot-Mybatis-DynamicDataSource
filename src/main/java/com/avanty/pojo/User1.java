package com.avanty.pojo;

import java.io.Serializable;
import java.sql.Timestamp;

/**
 * @author zhan
 */

public class User1 implements Serializable {

    private int id;
    private String username;
    private int age;
    private Timestamp create_time;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserName() {
        return username;
    }

    public void setUserName(String username) {
        this.username = username;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Timestamp getCreate_time() {
        return create_time;
    }

    public void setCreate_time(Timestamp create_time) {
        this.create_time = create_time;
    }

    @Override
    public String toString() {
        return "User1{" +
                "id=" + id +
                ", name='" + username + '\'' +
                ", age=" + age +
                ", create_time=" + create_time +
                '}';
    }
}
