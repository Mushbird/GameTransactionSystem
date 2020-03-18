package com.mushbird.sinsege.base.module.reward.model.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.mushbird.sinsege.base.model.BaseEntity;
import java.io.Serializable;
import java.util.Date;

public abstract class PointEntity extends BaseEntity implements Serializable {
    private Integer ptId;

    private String mbrId;

    private String ptTpCd;

    private String ptProcTpCd;

    private String ptRsnTpCd;

    private String ptRsn;

    private Integer ptAmt;

    private Date ptVldEdDt;

    private Integer ptUsePsblAmt;

    private Integer venId;

    private Integer ordItemId;

    private Integer itemId;

    private Integer ptAdmProcId;

    private Integer evntAtndId;

    @JsonIgnore
    private Date regDt;

    @JsonIgnore
    private String regId;

    @JsonIgnore
    private Date modDt;

    @JsonIgnore
    private String modId;

    private static final long serialVersionUID = com.mushbird.sinsege.base.constant.AppConst.UID;

    public Integer getPtId() {
        return ptId;
    }

    public void setPtId(Integer ptId) {
        this.ptId = ptId;
    }

    public String getMbrId() {
        return mbrId;
    }

    public void setMbrId(String mbrId) {
        this.mbrId = mbrId == null ? null : mbrId.trim();
    }

    public String getPtTpCd() {
        return ptTpCd;
    }

    public void setPtTpCd(String ptTpCd) {
        this.ptTpCd = ptTpCd == null ? null : ptTpCd.trim();
    }

    public String getPtProcTpCd() {
        return ptProcTpCd;
    }

    public void setPtProcTpCd(String ptProcTpCd) {
        this.ptProcTpCd = ptProcTpCd == null ? null : ptProcTpCd.trim();
    }

    public String getPtRsnTpCd() {
        return ptRsnTpCd;
    }

    public void setPtRsnTpCd(String ptRsnTpCd) {
        this.ptRsnTpCd = ptRsnTpCd == null ? null : ptRsnTpCd.trim();
    }

    public String getPtRsn() {
        return ptRsn;
    }

    public void setPtRsn(String ptRsn) {
        this.ptRsn = ptRsn == null ? null : ptRsn.trim();
    }

    public Integer getPtAmt() {
        return ptAmt;
    }

    public void setPtAmt(Integer ptAmt) {
        this.ptAmt = ptAmt;
    }

    public Date getPtVldEdDt() {
        return ptVldEdDt;
    }

    public void setPtVldEdDt(Date ptVldEdDt) {
        this.ptVldEdDt = ptVldEdDt;
    }

    public Integer getPtUsePsblAmt() {
        return ptUsePsblAmt;
    }

    public void setPtUsePsblAmt(Integer ptUsePsblAmt) {
        this.ptUsePsblAmt = ptUsePsblAmt;
    }

    public Integer getVenId() {
        return venId;
    }

    public void setVenId(Integer venId) {
        this.venId = venId;
    }

    public Integer getOrdItemId() {
        return ordItemId;
    }

    public void setOrdItemId(Integer ordItemId) {
        this.ordItemId = ordItemId;
    }

    public Integer getItemId() {
        return itemId;
    }

    public void setItemId(Integer itemId) {
        this.itemId = itemId;
    }

    public Integer getPtAdmProcId() {
        return ptAdmProcId;
    }

    public void setPtAdmProcId(Integer ptAdmProcId) {
        this.ptAdmProcId = ptAdmProcId;
    }

    public Integer getEvntAtndId() {
        return evntAtndId;
    }

    public void setEvntAtndId(Integer evntAtndId) {
        this.evntAtndId = evntAtndId;
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
        sb.append(", ptId=").append(ptId);
        sb.append(", mbrId=").append(mbrId);
        sb.append(", ptTpCd=").append(ptTpCd);
        sb.append(", ptProcTpCd=").append(ptProcTpCd);
        sb.append(", ptRsnTpCd=").append(ptRsnTpCd);
        sb.append(", ptRsn=").append(ptRsn);
        sb.append(", ptAmt=").append(ptAmt);
        sb.append(", ptVldEdDt=").append(ptVldEdDt);
        sb.append(", ptUsePsblAmt=").append(ptUsePsblAmt);
        sb.append(", venId=").append(venId);
        sb.append(", ordItemId=").append(ordItemId);
        sb.append(", itemId=").append(itemId);
        sb.append(", ptAdmProcId=").append(ptAdmProcId);
        sb.append(", evntAtndId=").append(evntAtndId);
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
        PointEntity other = (PointEntity) that;
        return (this.getPtId() == null ? other.getPtId() == null : this.getPtId().equals(other.getPtId()))
            && (this.getMbrId() == null ? other.getMbrId() == null : this.getMbrId().equals(other.getMbrId()))
            && (this.getPtTpCd() == null ? other.getPtTpCd() == null : this.getPtTpCd().equals(other.getPtTpCd()))
            && (this.getPtProcTpCd() == null ? other.getPtProcTpCd() == null : this.getPtProcTpCd().equals(other.getPtProcTpCd()))
            && (this.getPtRsnTpCd() == null ? other.getPtRsnTpCd() == null : this.getPtRsnTpCd().equals(other.getPtRsnTpCd()))
            && (this.getPtRsn() == null ? other.getPtRsn() == null : this.getPtRsn().equals(other.getPtRsn()))
            && (this.getPtAmt() == null ? other.getPtAmt() == null : this.getPtAmt().equals(other.getPtAmt()))
            && (this.getPtVldEdDt() == null ? other.getPtVldEdDt() == null : this.getPtVldEdDt().equals(other.getPtVldEdDt()))
            && (this.getPtUsePsblAmt() == null ? other.getPtUsePsblAmt() == null : this.getPtUsePsblAmt().equals(other.getPtUsePsblAmt()))
            && (this.getVenId() == null ? other.getVenId() == null : this.getVenId().equals(other.getVenId()))
            && (this.getOrdItemId() == null ? other.getOrdItemId() == null : this.getOrdItemId().equals(other.getOrdItemId()))
            && (this.getItemId() == null ? other.getItemId() == null : this.getItemId().equals(other.getItemId()))
            && (this.getPtAdmProcId() == null ? other.getPtAdmProcId() == null : this.getPtAdmProcId().equals(other.getPtAdmProcId()))
            && (this.getEvntAtndId() == null ? other.getEvntAtndId() == null : this.getEvntAtndId().equals(other.getEvntAtndId()))
            && (this.getRegDt() == null ? other.getRegDt() == null : this.getRegDt().equals(other.getRegDt()))
            && (this.getRegId() == null ? other.getRegId() == null : this.getRegId().equals(other.getRegId()))
            && (this.getModDt() == null ? other.getModDt() == null : this.getModDt().equals(other.getModDt()))
            && (this.getModId() == null ? other.getModId() == null : this.getModId().equals(other.getModId()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getPtId() == null) ? 0 : getPtId().hashCode());
        result = prime * result + ((getMbrId() == null) ? 0 : getMbrId().hashCode());
        result = prime * result + ((getPtTpCd() == null) ? 0 : getPtTpCd().hashCode());
        result = prime * result + ((getPtProcTpCd() == null) ? 0 : getPtProcTpCd().hashCode());
        result = prime * result + ((getPtRsnTpCd() == null) ? 0 : getPtRsnTpCd().hashCode());
        result = prime * result + ((getPtRsn() == null) ? 0 : getPtRsn().hashCode());
        result = prime * result + ((getPtAmt() == null) ? 0 : getPtAmt().hashCode());
        result = prime * result + ((getPtVldEdDt() == null) ? 0 : getPtVldEdDt().hashCode());
        result = prime * result + ((getPtUsePsblAmt() == null) ? 0 : getPtUsePsblAmt().hashCode());
        result = prime * result + ((getVenId() == null) ? 0 : getVenId().hashCode());
        result = prime * result + ((getOrdItemId() == null) ? 0 : getOrdItemId().hashCode());
        result = prime * result + ((getItemId() == null) ? 0 : getItemId().hashCode());
        result = prime * result + ((getPtAdmProcId() == null) ? 0 : getPtAdmProcId().hashCode());
        result = prime * result + ((getEvntAtndId() == null) ? 0 : getEvntAtndId().hashCode());
        result = prime * result + ((getRegDt() == null) ? 0 : getRegDt().hashCode());
        result = prime * result + ((getRegId() == null) ? 0 : getRegId().hashCode());
        result = prime * result + ((getModDt() == null) ? 0 : getModDt().hashCode());
        result = prime * result + ((getModId() == null) ? 0 : getModId().hashCode());
        return result;
    }
}