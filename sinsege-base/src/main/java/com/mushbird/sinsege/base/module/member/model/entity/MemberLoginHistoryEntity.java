package com.mushbird.sinsege.base.module.member.model.entity;

import com.mushbird.sinsege.base.model.BaseEntity;
import java.io.Serializable;
import java.util.Date;

public abstract class MemberLoginHistoryEntity extends BaseEntity implements Serializable {
    private Integer mbrLgnHistId;

    private String mbrId;

    private Date lgnDt;

    private String ipAddr;

    private String userEnvCd;

    private String uaVal;

    private static final long serialVersionUID = com.mushbird.sinsege.base.constant.AppConst.UID;

    public Integer getMbrLgnHistId() {
        return mbrLgnHistId;
    }

    public void setMbrLgnHistId(Integer mbrLgnHistId) {
        this.mbrLgnHistId = mbrLgnHistId;
    }

    public String getMbrId() {
        return mbrId;
    }

    public void setMbrId(String mbrId) {
        this.mbrId = mbrId == null ? null : mbrId.trim();
    }

    public Date getLgnDt() {
        return lgnDt;
    }

    public void setLgnDt(Date lgnDt) {
        this.lgnDt = lgnDt;
    }

    public String getIpAddr() {
        return ipAddr;
    }

    public void setIpAddr(String ipAddr) {
        this.ipAddr = ipAddr == null ? null : ipAddr.trim();
    }

    public String getUserEnvCd() {
        return userEnvCd;
    }

    public void setUserEnvCd(String userEnvCd) {
        this.userEnvCd = userEnvCd == null ? null : userEnvCd.trim();
    }

    public String getUaVal() {
        return uaVal;
    }

    public void setUaVal(String uaVal) {
        this.uaVal = uaVal == null ? null : uaVal.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", mbrLgnHistId=").append(mbrLgnHistId);
        sb.append(", mbrId=").append(mbrId);
        sb.append(", lgnDt=").append(lgnDt);
        sb.append(", ipAddr=").append(ipAddr);
        sb.append(", userEnvCd=").append(userEnvCd);
        sb.append(", uaVal=").append(uaVal);
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
        MemberLoginHistoryEntity other = (MemberLoginHistoryEntity) that;
        return (this.getMbrLgnHistId() == null ? other.getMbrLgnHistId() == null : this.getMbrLgnHistId().equals(other.getMbrLgnHistId()))
            && (this.getMbrId() == null ? other.getMbrId() == null : this.getMbrId().equals(other.getMbrId()))
            && (this.getLgnDt() == null ? other.getLgnDt() == null : this.getLgnDt().equals(other.getLgnDt()))
            && (this.getIpAddr() == null ? other.getIpAddr() == null : this.getIpAddr().equals(other.getIpAddr()))
            && (this.getUserEnvCd() == null ? other.getUserEnvCd() == null : this.getUserEnvCd().equals(other.getUserEnvCd()))
            && (this.getUaVal() == null ? other.getUaVal() == null : this.getUaVal().equals(other.getUaVal()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getMbrLgnHistId() == null) ? 0 : getMbrLgnHistId().hashCode());
        result = prime * result + ((getMbrId() == null) ? 0 : getMbrId().hashCode());
        result = prime * result + ((getLgnDt() == null) ? 0 : getLgnDt().hashCode());
        result = prime * result + ((getIpAddr() == null) ? 0 : getIpAddr().hashCode());
        result = prime * result + ((getUserEnvCd() == null) ? 0 : getUserEnvCd().hashCode());
        result = prime * result + ((getUaVal() == null) ? 0 : getUaVal().hashCode());
        return result;
    }
}