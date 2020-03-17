package com.mushbird.sinsege.base.module.order.model.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.mushbird.sinsege.base.model.BaseEntity;
import java.io.Serializable;
import java.util.Date;

public abstract class OrderSheetEntity extends BaseEntity implements Serializable {
    private Integer ordId;

    private String mbrId;

    private String ordNo;

    private String ordShtCont;

    private String buyrIpAddr;

    private String ordRsltCdVal;

    private String ordRsltMsgCont;

    @JsonIgnore
    private Date regDt;

    @JsonIgnore
    private String regId;

    private Date modDt;

    private String modId;

    private static final long serialVersionUID = com.mushbird.sinsege.base.constant.AppConst.UID;

    public Integer getOrdId() {
        return ordId;
    }

    public void setOrdId(Integer ordId) {
        this.ordId = ordId;
    }

    public String getMbrId() {
        return mbrId;
    }

    public void setMbrId(String mbrId) {
        this.mbrId = mbrId == null ? null : mbrId.trim();
    }

    public String getOrdNo() {
        return ordNo;
    }

    public void setOrdNo(String ordNo) {
        this.ordNo = ordNo == null ? null : ordNo.trim();
    }

    public String getOrdShtCont() {
        return ordShtCont;
    }

    public void setOrdShtCont(String ordShtCont) {
        this.ordShtCont = ordShtCont == null ? null : ordShtCont.trim();
    }

    public String getBuyrIpAddr() {
        return buyrIpAddr;
    }

    public void setBuyrIpAddr(String buyrIpAddr) {
        this.buyrIpAddr = buyrIpAddr == null ? null : buyrIpAddr.trim();
    }

    public String getOrdRsltCdVal() {
        return ordRsltCdVal;
    }

    public void setOrdRsltCdVal(String ordRsltCdVal) {
        this.ordRsltCdVal = ordRsltCdVal == null ? null : ordRsltCdVal.trim();
    }

    public String getOrdRsltMsgCont() {
        return ordRsltMsgCont;
    }

    public void setOrdRsltMsgCont(String ordRsltMsgCont) {
        this.ordRsltMsgCont = ordRsltMsgCont == null ? null : ordRsltMsgCont.trim();
    }

    public Date getRegDt() {
        return regDt;
    }

    public void setRegDt(Date regDt) {
        this.regDt = regDt;
    }

    public String getRegId() {
        return regId;
    }

    public void setRegId(String regId) {
        this.regId = regId == null ? null : regId.trim();
    }

    public Date getModDt() {
        return modDt;
    }

    public void setModDt(Date modDt) {
        this.modDt = modDt;
    }

    public String getModId() {
        return modId;
    }

    public void setModId(String modId) {
        this.modId = modId == null ? null : modId.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", ordId=").append(ordId);
        sb.append(", mbrId=").append(mbrId);
        sb.append(", ordNo=").append(ordNo);
        sb.append(", ordShtCont=").append(ordShtCont);
        sb.append(", buyrIpAddr=").append(buyrIpAddr);
        sb.append(", ordRsltCdVal=").append(ordRsltCdVal);
        sb.append(", ordRsltMsgCont=").append(ordRsltMsgCont);
        sb.append(", regDt=").append(regDt);
        sb.append(", regId=").append(regId);
        sb.append(", modDt=").append(modDt);
        sb.append(", modId=").append(modId);
        sb.append("]");
        return sb.toString();
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        OrderSheetEntity other = (OrderSheetEntity) that;
        return (this.getOrdId() == null ? other.getOrdId() == null : this.getOrdId().equals(other.getOrdId()))
            && (this.getMbrId() == null ? other.getMbrId() == null : this.getMbrId().equals(other.getMbrId()))
            && (this.getOrdNo() == null ? other.getOrdNo() == null : this.getOrdNo().equals(other.getOrdNo()))
            && (this.getOrdShtCont() == null ? other.getOrdShtCont() == null : this.getOrdShtCont().equals(other.getOrdShtCont()))
            && (this.getBuyrIpAddr() == null ? other.getBuyrIpAddr() == null : this.getBuyrIpAddr().equals(other.getBuyrIpAddr()))
            && (this.getOrdRsltCdVal() == null ? other.getOrdRsltCdVal() == null : this.getOrdRsltCdVal().equals(other.getOrdRsltCdVal()))
            && (this.getOrdRsltMsgCont() == null ? other.getOrdRsltMsgCont() == null : this.getOrdRsltMsgCont().equals(other.getOrdRsltMsgCont()))
            && (this.getRegDt() == null ? other.getRegDt() == null : this.getRegDt().equals(other.getRegDt()))
            && (this.getRegId() == null ? other.getRegId() == null : this.getRegId().equals(other.getRegId()))
            && (this.getModDt() == null ? other.getModDt() == null : this.getModDt().equals(other.getModDt()))
            && (this.getModId() == null ? other.getModId() == null : this.getModId().equals(other.getModId()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getOrdId() == null) ? 0 : getOrdId().hashCode());
        result = prime * result + ((getMbrId() == null) ? 0 : getMbrId().hashCode());
        result = prime * result + ((getOrdNo() == null) ? 0 : getOrdNo().hashCode());
        result = prime * result + ((getOrdShtCont() == null) ? 0 : getOrdShtCont().hashCode());
        result = prime * result + ((getBuyrIpAddr() == null) ? 0 : getBuyrIpAddr().hashCode());
        result = prime * result + ((getOrdRsltCdVal() == null) ? 0 : getOrdRsltCdVal().hashCode());
        result = prime * result + ((getOrdRsltMsgCont() == null) ? 0 : getOrdRsltMsgCont().hashCode());
        result = prime * result + ((getRegDt() == null) ? 0 : getRegDt().hashCode());
        result = prime * result + ((getRegId() == null) ? 0 : getRegId().hashCode());
        result = prime * result + ((getModDt() == null) ? 0 : getModDt().hashCode());
        result = prime * result + ((getModId() == null) ? 0 : getModId().hashCode());
        return result;
    }
}