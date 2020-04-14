package com.hospital.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

/**
 * 药品
 */
@Entity
public class Medicine {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String mNo;
    private String mName;
    /**
     * 规格
     */
    private String mSize;
    /**
     * 收费类别
     */
    private Integer mType;
    /**
     * 采购价
     */
    private float mBuy;
    /**
     * 售药价
     */
    private float mSell;
    /**
     * 生产厂家
     */
    private String mFactory;
    private int status;
    private Date createTime;
    //库存
    private Integer stock;

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getmNo() {
        return mNo;
    }

    public void setmNo(String mNo) {
        this.mNo = mNo;
    }

    public String getmName() {
        return mName;
    }

    public void setmName(String mName) {
        this.mName = mName;
    }

    public String getmSize() {
        return mSize;
    }

    public void setmSize(String mSize) {
        this.mSize = mSize;
    }

    public Integer getmType() {
        return mType;
    }

    public void setmType(Integer mType) {
        this.mType = mType;
    }

    public float getmBuy() {
        return mBuy;
    }

    public void setmBuy(float mBuy) {
        this.mBuy = mBuy;
    }

    public float getmSell() {
        return mSell;
    }

    public void setmSell(float mSell) {
        this.mSell = mSell;
    }

    public String getmFactory() {
        return mFactory;
    }

    public void setmFactory(String mFactory) {
        this.mFactory = mFactory;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}
