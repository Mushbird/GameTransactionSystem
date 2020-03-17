package com.mushbird.sinsege.base.module.member.model.entity;

import com.mushbird.sinsege.base.model.BaseEntity;
import java.io.Serializable;
import java.util.Date;

public abstract class MemberCloseEntity extends BaseEntity implements Serializable {
    private Integer mbrCloseId;

    private String mbrId;

    private String mbrLgnId;

    private String closePathCd;

    private String closeAgrYn;

    private Date closeAgrDt;

    private Date closeDt;

    private String closeIpAddr;

    private Date regDt;

    private String regId;

    private static final long serialVersionUID = com.mushbird.sinsege.base.constant.AppConst.UID;

    public Integer getMbrCloseId() {
        return mbrCloseId;
    }

    public void setMbrCloseId(Integer mbrCloseId) {
        this.mbrCloseId = mbrCloseId;
    }

    public String getMbrId() {
        return mbrId;
    }

    public void setMbrId(String mbrId) {
        this.mbrId = mbrId == null ? null : mbrId.trim();
    }

    public String getMbrLgnId() {
        return mbrLgnId;
    }

    public void setMbrLgnId(String mbrLgnId) {
        this.mbrLgnId = mbrLgnId == null ? null : mbrLgnId.trim();
    }

    public String getClosePathCd() {
        return closePathCd;
    }

    public void setClosePathCd(String closePathCd) {
        this.closePathCd = closePathCd == null ? null : closePathCd.trim();
    }

    public String getCloseAgrYn() {
        return closeAgrYn;
    }

    public void setCloseAgrYn(String closeAgrYn) {
        this.closeAgrYn = closeAgrYn == null ? null : closeAgrYn.trim();
    }

    public Date getCloseAgrDt() {
        return closeAgrDt;
    }

    public void setCloseAgrDt(Date closeAgrDt) {
        this.closeAgrDt = closeAgrDt;
    }

    public Date getCloseDt() {
        return closeDt;
    }

    public void setCloseDt(Date closeDt) {
        this.closeDt = closeDt;
    }

    public String getCloseIpAddr() {
        return closeIpAddr;
    }

    public void setCloseIpAddr(String closeIpAddr) {
        this.closeIpAddr = closeIpAddr == null ? null : closeIpAddr.trim();
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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", mbrCloseId=").append(mbrCloseId);
        sb.append(", mbrId=").append(mbrId);
        sb.append(", mbrLgnId=").append(mbrLgnId);
        sb.append(", closePathCd=").append(closePathCd);
        sb.append(", closeAgrYn=").append(closeAgrYn);
        sb.append(", closeAgrDt=").append(closeAgrDt);
        sb.append(", closeDt=").append(closeDt);
        sb.append(", closeIpAddr=").append(closeIpAddr);
        sb.append(", regDt=").append(regDt);
        sb.append(", regId=").append(regId);
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
        MemberCloseEntity other = (MemberCloseEntity) that;
        return (this.getMbrCloseId() == null ? other.getMbrCloseId() == null : this.getMbrCloseId().equals(other.getMbrCloseId()))
            && (this.getMbrId() == null ? other.getMbrId() == null : this.getMbrId().equals(other.getMbrId()))
            && (this.getMbrLgnId() == null ? other.getMbrLgnId() == null : this.getMbrLgnId().equals(other.getMbrLgnId()))
            && (this.getClosePathCd() == null ? other.getClosePathCd() == null : this.getClosePathCd().equals(other.getClosePathCd()))
            && (this.getCloseAgrYn() == null ? other.getCloseAgrYn() == null : this.getCloseAgrYn().equals(other.getCloseAgrYn()))
            && (this.getCloseAgrDt() == null ? other.getCloseAgrDt() == null : this.getCloseAgrDt().equals(other.getCloseAgrDt()))
            && (this.getCloseDt() == null ? other.getCloseDt() == null : this.getCloseDt().equals(other.getCloseDt()))
            && (this.getCloseIpAddr() == null ? other.getCloseIpAddr() == null : this.getCloseIpAddr().equals(other.getCloseIpAddr()))
            && (this.getRegDt() == null ? other.getRegDt() == null : this.getRegDt().equals(other.getRegDt()))
            && (this.getRegId() == null ? other.getRegId() == null : this.getRegId().equals(other.getRegId()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getMbrCloseId() == null) ? 0 : getMbrCloseId().hashCode());
        result = prime * result + ((getMbrId() == null) ? 0 : getMbrId().hashCode());
        result = prime * result + ((getMbrLgnId() == null) ? 0 : getMbrLgnId().hashCode());
        result = prime * result + ((getClosePathCd() == null) ? 0 : getClosePathCd().hashCode());
        result = prime * result + ((getCloseAgrYn() == null) ? 0 : getCloseAgrYn().hashCode());
        result = prime * result + ((getCloseAgrDt() == null) ? 0 : getCloseAgrDt().hashCode());
        result = prime * result + ((getCloseDt() == null) ? 0 : getCloseDt().hashCode());
        result = prime * result + ((getCloseIpAddr() == null) ? 0 : getCloseIpAddr().hashCode());
        result = prime * result + ((getRegDt() == null) ? 0 : getRegDt().hashCode());
        result = prime * result + ((getRegId() == null) ? 0 : getRegId().hashCode());
        return result;
    }
}