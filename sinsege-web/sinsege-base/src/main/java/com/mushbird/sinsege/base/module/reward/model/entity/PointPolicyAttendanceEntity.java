package com.mushbird.sinsege.base.module.reward.model.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.mushbird.sinsege.base.model.BaseEntity;
import java.io.Serializable;
import java.util.Date;

public abstract class PointPolicyAttendanceEntity extends BaseEntity implements Serializable {
    private String ptTpCd;

    private String ptChgDt;

    private Integer ptChgBfAmt;

    private String atndPrgsYn;

    private Date atndPrgsStopDt;

    private String dpYn;

    @JsonIgnore
    private Date regDt;

    @JsonIgnore
    private String regId;

    private Date modDt;

    private String modId;

    private static final long serialVersionUID = com.mushbird.sinsege.base.constant.AppConst.UID;

    public String getPtTpCd() {
        return ptTpCd;
    }

    public void setPtTpCd(String ptTpCd) {
        this.ptTpCd = ptTpCd == null ? null : ptTpCd.trim();
    }

    public String getPtChgDt() {
        return ptChgDt;
    }

    public void setPtChgDt(String ptChgDt) {
        this.ptChgDt = ptChgDt == null ? null : ptChgDt.trim();
    }

    public Integer getPtChgBfAmt() {
        return ptChgBfAmt;
    }

    public void setPtChgBfAmt(Integer ptChgBfAmt) {
        this.ptChgBfAmt = ptChgBfAmt;
    }

    public String getAtndPrgsYn() {
        return atndPrgsYn;
    }

    public void setAtndPrgsYn(String atndPrgsYn) {
        this.atndPrgsYn = atndPrgsYn == null ? null : atndPrgsYn.trim();
    }

    public Date getAtndPrgsStopDt() {
        return atndPrgsStopDt;
    }

    public void setAtndPrgsStopDt(Date atndPrgsStopDt) {
        this.atndPrgsStopDt = atndPrgsStopDt;
    }

    public String getDpYn() {
        return dpYn;
    }

    public void setDpYn(String dpYn) {
        this.dpYn = dpYn == null ? null : dpYn.trim();
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
        sb.append(", ptTpCd=").append(ptTpCd);
        sb.append(", ptChgDt=").append(ptChgDt);
        sb.append(", ptChgBfAmt=").append(ptChgBfAmt);
        sb.append(", atndPrgsYn=").append(atndPrgsYn);
        sb.append(", atndPrgsStopDt=").append(atndPrgsStopDt);
        sb.append(", dpYn=").append(dpYn);
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
        PointPolicyAttendanceEntity other = (PointPolicyAttendanceEntity) that;
        return (this.getPtTpCd() == null ? other.getPtTpCd() == null : this.getPtTpCd().equals(other.getPtTpCd()))
            && (this.getPtChgDt() == null ? other.getPtChgDt() == null : this.getPtChgDt().equals(other.getPtChgDt()))
            && (this.getPtChgBfAmt() == null ? other.getPtChgBfAmt() == null : this.getPtChgBfAmt().equals(other.getPtChgBfAmt()))
            && (this.getAtndPrgsYn() == null ? other.getAtndPrgsYn() == null : this.getAtndPrgsYn().equals(other.getAtndPrgsYn()))
            && (this.getAtndPrgsStopDt() == null ? other.getAtndPrgsStopDt() == null : this.getAtndPrgsStopDt().equals(other.getAtndPrgsStopDt()))
            && (this.getDpYn() == null ? other.getDpYn() == null : this.getDpYn().equals(other.getDpYn()))
            && (this.getRegDt() == null ? other.getRegDt() == null : this.getRegDt().equals(other.getRegDt()))
            && (this.getRegId() == null ? other.getRegId() == null : this.getRegId().equals(other.getRegId()))
            && (this.getModDt() == null ? other.getModDt() == null : this.getModDt().equals(other.getModDt()))
            && (this.getModId() == null ? other.getModId() == null : this.getModId().equals(other.getModId()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getPtTpCd() == null) ? 0 : getPtTpCd().hashCode());
        result = prime * result + ((getPtChgDt() == null) ? 0 : getPtChgDt().hashCode());
        result = prime * result + ((getPtChgBfAmt() == null) ? 0 : getPtChgBfAmt().hashCode());
        result = prime * result + ((getAtndPrgsYn() == null) ? 0 : getAtndPrgsYn().hashCode());
        result = prime * result + ((getAtndPrgsStopDt() == null) ? 0 : getAtndPrgsStopDt().hashCode());
        result = prime * result + ((getDpYn() == null) ? 0 : getDpYn().hashCode());
        result = prime * result + ((getRegDt() == null) ? 0 : getRegDt().hashCode());
        result = prime * result + ((getRegId() == null) ? 0 : getRegId().hashCode());
        result = prime * result + ((getModDt() == null) ? 0 : getModDt().hashCode());
        result = prime * result + ((getModId() == null) ? 0 : getModId().hashCode());
        return result;
    }
}