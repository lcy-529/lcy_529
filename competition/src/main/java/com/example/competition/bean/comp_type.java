package com.example.competition.bean;

/**
 * 描述:
 * comp_type
 *
 * @author zhaojianyu
 * @create 2019-12-18 4:18 PM
 */
public class comp_type {
    private String compName;
    private int compType;

    public comp_type() {
    }

    public comp_type(String compName, int compType) {
        this.compName = compName;
        this.compType = compType;
    }

    public String getCompName() {
        return compName;
    }

    public void setCompName(String compName) {
        this.compName = compName;
    }

    public int getCompType() {
        return compType;
    }

    public void setCompType(int compType) {
        this.compType = compType;
    }

    @Override
    public String toString() {
        return "comp_type{" +
                "compName='" + compName + '\'' +
                ", compType=" + compType +
                '}';
    }
}
