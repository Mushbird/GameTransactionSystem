package com.mushbird.sinsege.base.module.reward.model.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.mushbird.sinsege.base.model.BaseEntity;
import java.io.Serializable;
import java.util.Date;

public abstract class PointAdminProcessEntity extends BaseEntity implements Serializable {
    private Integer ptAdmProcId;

    private String ptProcTpCd;

    private String mbrGrdCd;

    private String ptRsnTpCd;

    private String ptRsn;

    private String note;

    private Integer ptAmt;

    @JsonIgnore
    private Date regDt;

    @JsonIgnore
    private String regId;

    @JsonIgnore
    private Date modDt;

    @JsonIgnore
    private String modId;

    @JsonIgnore
    private String useYn;

    private static final long serialVersionUID = com.mushbird.sinsege.base.constant.AppConst.UID;

    public Integer getPtAdmProcId() {
        return ptAdmProcId;
    }

    public void setPtAdmProcId(Integer ptAdmProcId) {
        this.ptAdmProcId = ptAdmProcId;
    }

    public String getPtProcTpCd() {
        return ptProcTpCd;
    }

    public void setPtProcTpCd(String ptProcTpCd) {
        this.ptProcTpCd = ptProcTpCd == null ? null : ptProcTpCd.trim();
    }

    public String getMbrGrdCd() {
        return mbrGrdCd;
    }

    public void setMbrGrdCd(String mbrGrdCd) {
        this.mbrGrdCd = mbrGrdCd == null ? null : mbrGrdCd.trim();
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

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note == null ? null : note.trim();
    }

    public Integer getPtAmt() {
        return ptAmt;
    }

    public void setPtAmt(Integer ptAmt) {
        this.ptAmt = ptAmt;
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

    public String getUseYn() {
        return useYn;
    }

    public void setUseYn(String useYn) {
        this.useYn = useYn == null ? null : useYn.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", ptAdmProcId=").append(ptAdmProcId);
        sb.append(", ptProcTpCd=").append(ptProcTpCd);
        sb.append(", mbrGrdCd=").append(mbrGrdCd);
        sb.append(", ptRsnTpCd=").append(ptRsnTpCd);
        sb.append(", ptRsn=").append(ptRsn);
        sb.append(", note=").append(note);
        sb.append(", ptAmt=").append(ptAmt);
        sb.append(", regDt=").append(regDt);
        sb.append(", regId=").append(regId);
        sb.append(", modDt=").append(modDt);
        sb.append(", modId=").append(modId);
        sb.append(", useYn=").append(useYn);
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
        PointAdminProcessEntity other = (PointAdminProcessEntity) that;
        return (this.getPtAdmProcId() == null ? other.getPtAdmProcId() == null : this.getPtAdmProcId().equals(other.getPtAdmProcId()))
            && (this.getPtProcTpCd() == null ? other.getPtProcTpCd() == null : this.getPtProcTpCd().equals(other.getPtProcTpCd()))
            && (this.getMbrGrdCd() == null ? other.getMbrGrdCd() == null : this.getMbrGrdCd().equals(other.getMbrGrdCd()))
            && (this.getPtRsnTpCd() == null ? other.getPtRsnTpCd() == null : this.getPtRsnTpCd().equals(other.getPtRsnTpCd()))
            && (this.getPtRsn() == null ? other.getPtRsn() == null : this.getPtRsn().equals(other.getPtRsn()))
            && (this.getNote() == null ? other.getNote() == null : this.getNote().equals(other.getNote()))
            && (this.getPtAmt() == null ? other.getPtAmt() == null : this.getPtAmt().equals(other.getPtAmt()))
            && (this.getRegDt() == null ? other.getRegDt() == null : this.getRegDt().equals(other.getRegDt()))
            && (this.getRegId() == null ? other.getRegId() == null : this.getRegId().equals(other.getRegId()))
            && (this.getModDt() == null ? other.getModDt() == null : this.getModDt().equals(other.getModDt()))
            && (this.getModId() == null ? other.getModId() == null : this.getModId().equals(other.getModId()))
            && (this.getUseYn() == null ? other.getUseYn() == null : this.getUseYn().equals(other.getUseYn()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getPtAdmProcId() == null) ? 0 : getPtAdmProcId().hashCode());
        result = prime * result + ((getPtProcTpCd() == null) ? 0 : getPtProcTpCd().hashCode());
        result = prime * result + ((getMbrGrdCd() == null) ? 0 : getMbrGrdCd().hashCode());
        result = prime * result + ((getPtRsnTpCd() == null) ? 0 : getPtRsnTpCd().hashCode());
        result = prime * result + ((getPtRsn() == null) ? 0 : getPtRsn().hashCode());
        result = prime * result + ((getNote() == null) ? 0 : getNote().hashCode());
        result = prime * result + ((getPtAmt() == null) ? 0 : getPtAmt().hashCode());
        result = prime * result + ((getRegDt() == null) ? 0 : getRegDt().hashCode());
        result = prime * result + ((getRegId() == null) ? 0 : getRegId().hashCode());
        result = prime * result + ((getModDt() == null) ? 0 : getModDt().hashCode());
        result = prime * result + ((getModId() == null) ? 0 : getModId().hashCode());
        result = prime * result + ((getUseYn() == null) ? 0 : getUseYn().hashCode());
        return result;
    }
}