package com.example.competition.bean;

import java.sql.Timestamp;

/**
 * 描述:
 * competition_info
 *
 * @author zhaojianyu
 * @create 2019-12-18 4:19 PM
 */
public class competition_info {
    private String compName;
    private String compLevel;
    private int teacId;
    private int stuId;
    private String awardCert;
    private String guideCert;
    private String gameCert;
    private Timestamp subTime;

    public competition_info() {
    }

    public competition_info(String compName, String compLevel, int teacId, int stuId, String awardCert, String guideCert, String gameCert, Timestamp subTime) {
        this.compName = compName;
        this.compLevel = compLevel;
        this.teacId = teacId;
        this.stuId = stuId;
        this.awardCert = awardCert;
        this.guideCert = guideCert;
        this.gameCert = gameCert;
        this.subTime = subTime;
    }

    public String getCompName() {
        return compName;
    }

    public void setCompName(String compName) {
        this.compName = compName;
    }

    public String getCompLevel() {
        return compLevel;
    }

    public void setCompLevel(String compLevel) {
        this.compLevel = compLevel;
    }

    public int getTeacId() {
        return teacId;
    }

    public void setTeacId(int teacId) {
        this.teacId = teacId;
    }

    public int getStuId() {
        return stuId;
    }

    public void setStuId(int stuId) {
        this.stuId = stuId;
    }

    public String getAwardCert() {
        return awardCert;
    }

    public void setAwardCert(String awardCert) {
        this.awardCert = awardCert;
    }

    public String getGuideCert() {
        return guideCert;
    }

    public void setGuideCert(String guideCert) {
        this.guideCert = guideCert;
    }

    public String getGameCert() {
        return gameCert;
    }

    public void setGameCert(String gameCert) {
        this.gameCert = gameCert;
    }

    public Timestamp getSubTime() {
        return subTime;
    }

    public void setSubTime(Timestamp subTime) {
        this.subTime = subTime;
    }

    @Override
    public String toString() {
        return "competition_info{" +
                "compName='" + compName + '\'' +
                ", compLevel='" + compLevel + '\'' +
                ", teacId=" + teacId +
                ", stuId=" + stuId +
                ", awardCert='" + awardCert + '\'' +
                ", guideCert='" + guideCert + '\'' +
                ", gameCert='" + gameCert + '\'' +
                ", subTime=" + subTime +
                '}';
    }
}
