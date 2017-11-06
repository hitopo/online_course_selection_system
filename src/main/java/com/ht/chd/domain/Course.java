package com.ht.chd.domain;

/**
 * 课程实体类
 */
public class Course {
    //课程号
    private int id;
    //课程名称
    private String name;
    //学时
    private int hour;
    //学分
    private int credit;
    //课程描述
    private String desc;

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

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public int getCredit() {
        return credit;
    }

    public void setCredit(int credit) {
        this.credit = credit;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    @Override
    public String toString() {
        return "Course{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", hour=" + hour +
                ", credit=" + credit +
                ", desc='" + desc + '\'' +
                '}';
    }
}
