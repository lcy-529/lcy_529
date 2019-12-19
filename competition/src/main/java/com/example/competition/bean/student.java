package com.example.competition.bean;

/**
 * 描述:
 * student
 *
 * @author zhaojianyu
 * @create 2019-12-18 4:19 PM
 */
public class student {
    private int stuId;
    private String stuName;
    private String stuClass;

    public student() {
    }

    public student(int stuId, String stuName, String stuClass) {
        this.stuId = stuId;
        this.stuName = stuName;
        this.stuClass = stuClass;
    }

    public int getStuId() {
        return stuId;
    }

    public void setStuId(int stuId) {
        this.stuId = stuId;
    }

    public String getStuName() {
        return stuName;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName;
    }

    public String getStuClass() {
        return stuClass;
    }

    public void setStuClass(String stuClass) {
        this.stuClass = stuClass;
    }

    @Override
    public String toString() {
        return "student{" +
                "stuId=" + stuId +
                ", stuName='" + stuName + '\'' +
                ", stuClass='" + stuClass + '\'' +
                '}';
    }
}
