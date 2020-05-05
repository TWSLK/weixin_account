package com.weixin.code.model;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class Account implements Serializable {
    private Integer id;

    private String spendWay;
    @JsonFormat(pattern="yyyy-MM-dd",timezone = "GMT+8")
    private Date date;

    private String remarks;

    private BigDecimal spendMoney;

    private String spendWayImg;

    private String openId;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSpendWay() {
        return spendWay;
    }

    public void setSpendWay(String spendWay) {
        this.spendWay = spendWay == null ? null : spendWay.trim();
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks == null ? null : remarks.trim();
    }

    public BigDecimal getSpendMoney() {
        return spendMoney;
    }

    public void setSpendMoney(BigDecimal spendMoney) {
        this.spendMoney = spendMoney;
    }

    public String getSpendWayImg() {
        return spendWayImg;
    }

    public void setSpendWayImg(String spendWayImg) {
        this.spendWayImg = spendWayImg == null ? null : spendWayImg.trim();
    }

    public String getOpenId() {
        return openId;
    }

    public void setOpenId(String openId) {
        this.openId = openId == null ? null : openId.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", spendWay=").append(spendWay);
        sb.append(", date=").append(date);
        sb.append(", remarks=").append(remarks);
        sb.append(", spendMoney=").append(spendMoney);
        sb.append(", spendWayImg=").append(spendWayImg);
        sb.append(", openId=").append(openId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}