package com.example.competition.bean;

/**
 * 描述:
 * comp_para
 *
 * @author zhaojianyu
 * @create 2019-12-18 4:18 PM
 */
public class comp_para {
    private int compType;
    private String compLevel;
    private float parameter;
    private float base;

    public comp_para() {
    }

    public comp_para(int compType, String compLevel, float parameter, float base) {
        this.compType = compType;
        this.compLevel = compLevel;
        this.parameter = parameter;
        this.base = base;
    }

    public int getCompType() {
        return compType;
    }

    public void setCompType(int compType) {
        this.compType = compType;
    }

    public String getCompLevel() {
        return compLevel;
    }

    public void setCompLevel(String compLevel) {
        this.compLevel = compLevel;
    }

    public float getParameter() {
        return parameter;
    }

    public void setParameter(float parameter) {
        this.parameter = parameter;
    }

    public float getBase() {
        return base;
    }

    public void setBase(float base) {
        this.base = base;
    }

    @Override
    public String toString() {
        return "comp_para{" +
                "compType=" + compType +
                ", compLevel='" + compLevel + '\'' +
                ", parameter=" + parameter +
                ", base=" + base +
                '}';
    }
}
