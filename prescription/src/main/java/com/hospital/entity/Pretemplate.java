package com.hospital.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

/**
 * 处方模板
 */
@Entity
public class Pretemplate {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String temNo;
    private String temName;
    private String temType;
    /**
     * 诊断
     */
    private String temDiag;
    /**
     * 模板权限
     */
    private String temPermission;
    private Date createTime;
    private Integer createPerson;
    private String emName;
    private String description;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTemNo() {
        return temNo;
    }

    public void setTemNo(String temNo) {
        this.temNo = temNo;
    }

    public String getTemName() {
        return temName;
    }

    public void setTemName(String temName) {
        this.temName = temName;
    }

    public String getTemType() {
        return temType;
    }

    public void setTemType(String temType) {
        this.temType = temType;
    }

    public String getTemDiag() {
        return temDiag;
    }

    public void setTemDiag(String temDiag) {
        this.temDiag = temDiag;
    }

    public String getTemPermission() {
        return temPermission;
    }

    public void setTemPermission(String temPermission) {
        this.temPermission = temPermission;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getCreatePerson() {
        return createPerson;
    }

    public void setCreatePerson(Integer createPerson) {
        this.createPerson = createPerson;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getEmName() {
        return emName;
    }

    public void setEmName(String emName) {
        this.emName = emName;
    }
}
