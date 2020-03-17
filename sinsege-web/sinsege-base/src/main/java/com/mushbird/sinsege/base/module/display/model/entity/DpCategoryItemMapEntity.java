package com.mushbird.sinsege.base.module.display.model.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.io.Serializable;
import java.util.Date;

public abstract class DpCategoryItemMapEntity extends DpCategoryItemMapKey implements Serializable {
    private String repCateYn;

    private Integer sord;

    @JsonIgnore
    private Date regDt;

    @JsonIgnore
    private String regId;

    @JsonIgnore
    private Date modDt;

    @JsonIgnore
    private String modId;

    private static final long serialVersionUID = com.mushbird.sinsege.base.constant.AppConst.UID;

    public String getRepCateYn() {
        return repCateYn;
    }

    public void setRepCateYn(String repCateYn) {
        this.repCateYn = repCateYn == null ? null : repCateYn.trim();
    }

    public Integer getSord() {
        return sord;
    }

    public void setSord(Integer sord) {
        this.sord = sord;
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
        sb.append(", repCateYn=").append(repCateYn);
        sb.append(", sord=").append(sord);
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
        DpCategoryItemMapEntity other = (DpCategoryItemMapEntity) that;
        return (this.getDpCateId() == null ? other.getDpCateId() == null : this.getDpCateId().equals(other.getDpCateId()))
            && (this.getItemId() == null ? other.getItemId() == null : this.getItemId().equals(other.getItemId()))
            && (this.getRepCateYn() == null ? other.getRepCateYn() == null : this.getRepCateYn().equals(other.getRepCateYn()))
            && (this.getSord() == null ? other.getSord() == null : this.getSord().equals(other.getSord()))
            && (this.getRegDt() == null ? other.getRegDt() == null : this.getRegDt().equals(other.getRegDt()))
            && (this.getRegId() == null ? other.getRegId() == null : this.getRegId().equals(other.getRegId()))
            && (this.getModDt() == null ? other.getModDt() == null : this.getModDt().equals(other.getModDt()))
            && (this.getModId() == null ? other.getModId() == null : this.getModId().equals(other.getModId()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getDpCateId() == null) ? 0 : getDpCateId().hashCode());
        result = prime * result + ((getItemId() == null) ? 0 : getItemId().hashCode());
        result = prime * result + ((getRepCateYn() == null) ? 0 : getRepCateYn().hashCode());
        result = prime * result + ((getSord() == null) ? 0 : getSord().hashCode());
        result = prime * result + ((getRegDt() == null) ? 0 : getRegDt().hashCode());
        result = prime * result + ((getRegId() == null) ? 0 : getRegId().hashCode());
        result = prime * result + ((getModDt() == null) ? 0 : getModDt().hashCode());
        result = prime * result + ((getModId() == null) ? 0 : getModId().hashCode());
        return result;
    }
}