package com.xiaobai.model;

import java.io.Serializable;

/**
 * 学生
 *
 * @author 余修文
 * @date 2019/4/23 16:48
 */
public class Student implements Serializable {

    private String id;

    private String name;

    private Integer age;

    private boolean sex;

    public Student(String id, String name, Integer age, boolean sex) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public Student() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public boolean getSex() {
        return sex;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }
}
