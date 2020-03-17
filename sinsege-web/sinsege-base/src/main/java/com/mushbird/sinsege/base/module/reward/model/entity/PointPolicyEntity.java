package com.mushbird.sinsege.base.module.reward.model.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.mushbird.sinsege.base.model.BaseEntity;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public abstract class PointPolicyEntity extends BaseEntity implements Serializable {
    private String ptTpCd;

    private String saveUnitCd;

    private BigDecimal saveRate;

    private Integer saveAmt;

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

    public String getPtTpCd() {
        return ptTpCd;
    }

    public void setPtTpCd(String ptTpCd) {
        this.ptTpCd = ptTpCd == null ? null : ptTpCd.trim();
    }

    public String getSaveUnitCd() {
        return saveUnitCd;
    }

    public void setSaveUnitCd(String saveUnitCd) {
        this.saveUnitCd = saveUnitCd == null ? null : saveUnitCd.trim();
    }

    public BigDecimal getSaveRate() {
        return saveRate;
    }

    public void setSaveRate(BigDecimal saveRate) {
        this.saveRate = saveRate;
    }

    public Integer getSaveAmt() {
        return saveAmt;
    }

    public void setSaveAmt(Integer saveAmt) {
        this.saveAmt = saveAmt;
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
        sb.append(", ptTpCd=").append(ptTpCd);
        sb.append(", saveUnitCd=").append(saveUnitCd);
        sb.append(", saveRate=").append(saveRate);
        sb.append(", saveAmt=").append(saveAmt);
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
        PointPolicyEntity other = (PointPolicyEntity) that;
        return (this.getPtTpCd() == null ? other.getPtTpCd() == null : this.getPtTpCd().equals(other.getPtTpCd()))
            && (this.getSaveUnitCd() == null ? other.getSaveUnitCd() == null : this.getSaveUnitCd().equals(other.getSaveUnitCd()))
            && (this.getSaveRate() == null ? other.getSaveRate() == null : this.getSaveRate().equals(other.getSaveRate()))
            && (this.getSaveAmt() == null ? other.getSaveAmt() == null : this.getSaveAmt().equals(other.getSaveAmt()))
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
        result = prime * result + ((getPtTpCd() == null) ? 0 : getPtTpCd().hashCode());
        result = prime * result + ((getSaveUnitCd() == null) ? 0 : getSaveUnitCd().hashCode());
        result = prime * result + ((getSaveRate() == null) ? 0 : getSaveRate().hashCode());
        result = prime * result + ((getSaveAmt() == null) ? 0 : getSaveAmt().hashCode());
        result = prime * result + ((getRegDt() == null) ? 0 : getRegDt().hashCode());
        result = prime * result + ((getRegId() == null) ? 0 : getRegId().hashCode());
        result = prime * result + ((getModDt() == null) ? 0 : getModDt().hashCode());
        result = prime * result + ((getModId() == null) ? 0 : getModId().hashCode());
        result = prime * result + ((getUseYn() == null) ? 0 : getUseYn().hashCode());
        return result;
    }
}