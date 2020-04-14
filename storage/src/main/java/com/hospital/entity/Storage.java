package com.hospital.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class Storage {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String sNo;
    private String sType;
    private String sProvider;
    private Integer sPerson;
    private float sBuy;
    private float sSell;
    private Integer sPeople;
    private Date createTime;
    /**
     * 审核状态：0：未审核，1：审核通过，2：审核未通过
     */
    private int status;

    private String person;
    private String people;

    public String getPerson() {
        return person;
    }

    public void setPerson(String person) {
        this.person = person;
    }

    public String getPeople() {
        return people;
    }

    public void setPeople(String people) {
        this.people = people;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getsNo() {
        return sNo;
    }

    public void setsNo(String sNo) {
        this.sNo = sNo;
    }

    public String getsType() {
        return sType;
    }

    public void setsType(String sType) {
        this.sType = sType;
    }

    public String getsProvider() {
        return sProvider;
    }

    public void setsProvider(String sProvider) {
        this.sProvider = sProvider;
    }

    public Integer getsPerson() {
        return sPerson;
    }

    public void setsPerson(Integer sPerson) {
        this.sPerson = sPerson;
    }

    public float getsBuy() {
        return sBuy;
    }

    public void setsBuy(float sBuy) {
        this.sBuy = sBuy;
    }

    public float getsSell() {
        return sSell;
    }

    public void setsSell(float sSell) {
        this.sSell = sSell;
    }

    public Integer getsPeople() {
        return sPeople;
    }

    public void setsPeople(Integer sPeople) {
        this.sPeople = sPeople;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
}
