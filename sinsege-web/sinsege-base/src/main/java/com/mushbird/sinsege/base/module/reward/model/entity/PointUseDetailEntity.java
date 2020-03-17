package com.mushbird.sinsege.base.module.reward.model.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.mushbird.sinsege.base.model.BaseEntity;
import java.io.Serializable;
import java.util.Date;

public abstract class PointUseDetailEntity extends BaseEntity implements Serializable {
    private Integer ptUseDtlId;

    private Integer ptUseId;

    private Integer ptSaveId;

    private Integer fstPtUseAmt;

    private Integer ptUseAmt;

    @JsonIgnore
    private Date regDt;

    @JsonIgnore
    private String regId;

    @JsonIgnore
    private Date modDt;

    @JsonIgnore
    private String modId;

    private static final long serialVersionUID = com.mushbird.sinsege.base.constant.AppConst.UID;

    public Integer getPtUseDtlId() {
        return ptUseDtlId;
    }

    public void setPtUseDtlId(Integer ptUseDtlId) {
        this.ptUseDtlId = ptUseDtlId;
    }

    public Integer getPtUseId() {
        return ptUseId;
    }

    public void setPtUseId(Integer ptUseId) {
        this.ptUseId = ptUseId;
    }

    public Integer getPtSaveId() {
        return ptSaveId;
    }

    public void setPtSaveId(Integer ptSaveId) {
        this.ptSaveId = ptSaveId;
    }

    public Integer getFstPtUseAmt() {
        return fstPtUseAmt;
    }

    public void setFstPtUseAmt(Integer fstPtUseAmt) {
        this.fstPtUseAmt = fstPtUseAmt;
    }

    public Integer getPtUseAmt() {
        return ptUseAmt;
    }

    public void setPtUseAmt(Integer ptUseAmt) {
        this.ptUseAmt = ptUseAmt;
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
        sb.append(", ptUseDtlId=").append(ptUseDtlId);
        sb.append(", ptUseId=").append(ptUseId);
        sb.append(", ptSaveId=").append(ptSaveId);
        sb.append(", fstPtUseAmt=").append(fstPtUseAmt);
        sb.append(", ptUseAmt=").append(ptUseAmt);
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
        PointUseDetailEntity other = (PointUseDetailEntity) that;
        return (this.getPtUseDtlId() == null ? other.getPtUseDtlId() == null : this.getPtUseDtlId().equals(other.getPtUseDtlId()))
            && (this.getPtUseId() == null ? other.getPtUseId() == null : this.getPtUseId().equals(other.getPtUseId()))
            && (this.getPtSaveId() == null ? other.getPtSaveId() == null : this.getPtSaveId().equals(other.getPtSaveId()))
            && (this.getFstPtUseAmt() == null ? other.getFstPtUseAmt() == null : this.getFstPtUseAmt().equals(other.getFstPtUseAmt()))
            && (this.getPtUseAmt() == null ? other.getPtUseAmt() == null : this.getPtUseAmt().equals(other.getPtUseAmt()))
            && (this.getRegDt() == null ? other.getRegDt() == null : this.getRegDt().equals(other.getRegDt()))
            && (this.getRegId() == null ? other.getRegId() == null : this.getRegId().equals(other.getRegId()))
            && (this.getModDt() == null ? other.getModDt() == null : this.getModDt().equals(other.getModDt()))
            && (this.getModId() == null ? other.getModId() == null : this.getModId().equals(other.getModId()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getPtUseDtlId() == null) ? 0 : getPtUseDtlId().hashCode());
        result = prime * result + ((getPtUseId() == null) ? 0 : getPtUseId().hashCode());
        result = prime * result + ((getPtSaveId() == null) ? 0 : getPtSaveId().hashCode());
        result = prime * result + ((getFstPtUseAmt() == null) ? 0 : getFstPtUseAmt().hashCode());
        result = prime * result + ((getPtUseAmt() == null) ? 0 : getPtUseAmt().hashCode());
        result = prime * result + ((getRegDt() == null) ? 0 : getRegDt().hashCode());
        result = prime * result + ((getRegId() == null) ? 0 : getRegId().hashCode());
        result = prime * result + ((getModDt() == null) ? 0 : getModDt().hashCode());
        result = prime * result + ((getModId() == null) ? 0 : getModId().hashCode());
        return result;
    }
}