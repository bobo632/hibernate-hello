package com.sunyx.domain;

import java.sql.Date;
import java.sql.Timestamp;

/**
 * Created by liuli on 2019/1/2.
 */
public class Emp {
    private Integer id;
    private String name;
    private Integer age;
    private Double salary;
    private Boolean marry;
    private Date birthday;
    private Timestamp login;

    public Boolean getMarry() {
        return marry;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setMarry(Boolean marry) {
        this.marry = marry;
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

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public Timestamp getLogin() {
        return login;
    }

    public void setLogin(Timestamp login) {
        this.login = login;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                ", marry=" + marry +
                ", birthday=" + birthday +
                ", login=" + login +
                '}';
    }
}
