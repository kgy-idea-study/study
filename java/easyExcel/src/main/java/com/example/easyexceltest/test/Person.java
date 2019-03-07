package com.example.easyexceltest.test;

import cn.afterturn.easypoi.excel.annotation.Excel;

import java.util.Date;

/**
 * @author kouguangyuan
 * @date 2019/3/7 16:51
 */
public class Person {

    @Excel(name = "姓名", orderNum = "0")
    private String name;

    @Excel(name = "性别", replace = {"男_1", "女_2"}, orderNum = "1")
    private String sex;

    @Excel(name = "生日", orderNum = "2")
    private String birthday;

    public Person(String name, String sex, String birthday) {
        this.name = name;
        this.sex = sex;
        this.birthday = birthday;
    }

    public Person() {
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

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", birthday=" + birthday +
                '}';
    }
}
