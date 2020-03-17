package com.mushbird.sinsege.base.module.member.model.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.io.Serializable;
import java.util.Date;

public abstract class MemberAgreeEntity extends MemberAgreeKey implements Serializable {
    private String agrYn;

    private Date agrChgDt;

    private Integer retntUsePdNoy;

    @JsonIgnore
    private Date regDt;

    @JsonIgnore
    private String regId;

    @JsonIgnore
    private Date modDt;

    @JsonIgnore
    private String modId;

    private static final long serialVersionUID = com.mushbird.sinsege.base.constant.AppConst.UID;

    public String getAgrYn() {
        return agrYn;
    }

    public void setAgrYn(String agrYn) {
        this.agrYn = agrYn == null ? null : agrYn.trim();
    }

    public Date getAgrChgDt() {
        return agrChgDt;
    }

    public void setAgrChgDt(Date agrChgDt) {
        this.agrChgDt = agrChgDt;
    }

    public Integer getRetntUsePdNoy() {
        return retntUsePdNoy;
    }

    public void setRetntUsePdNoy(Integer retntUsePdNoy) {
        this.retntUsePdNoy = retntUsePdNoy;
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
        sb.append(", agrYn=").append(agrYn);
        sb.append(", agrChgDt=").append(agrChgDt);
        sb.append(", retntUsePdNoy=").append(retntUsePdNoy);
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
        MemberAgreeEntity other = (MemberAgreeEntity) that;
        return (this.getMbrId() == null ? other.getMbrId() == null : this.getMbrId().equals(other.getMbrId()))
            && (this.getAgrCd() == null ? other.getAgrCd() == null : this.getAgrCd().equals(other.getAgrCd()))
            && (this.getAgrYn() == null ? other.getAgrYn() == null : this.getAgrYn().equals(other.getAgrYn()))
            && (this.getAgrChgDt() == null ? other.getAgrChgDt() == null : this.getAgrChgDt().equals(other.getAgrChgDt()))
            && (this.getRetntUsePdNoy() == null ? other.getRetntUsePdNoy() == null : this.getRetntUsePdNoy().equals(other.getRetntUsePdNoy()))
            && (this.getRegDt() == null ? other.getRegDt() == null : this.getRegDt().equals(other.getRegDt()))
            && (this.getRegId() == null ? other.getRegId() == null : this.getRegId().equals(other.getRegId()))
            && (this.getModDt() == null ? other.getModDt() == null : this.getModDt().equals(other.getModDt()))
            && (this.getModId() == null ? other.getModId() == null : this.getModId().equals(other.getModId()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getMbrId() == null) ? 0 : getMbrId().hashCode());
        result = prime * result + ((getAgrCd() == null) ? 0 : getAgrCd().hashCode());
        result = prime * result + ((getAgrYn() == null) ? 0 : getAgrYn().hashCode());
        result = prime * result + ((getAgrChgDt() == null) ? 0 : getAgrChgDt().hashCode());
        result = prime * result + ((getRetntUsePdNoy() == null) ? 0 : getRetntUsePdNoy().hashCode());
        result = prime * result + ((getRegDt() == null) ? 0 : getRegDt().hashCode());
        result = prime * result + ((getRegId() == null) ? 0 : getRegId().hashCode());
        result = prime * result + ((getModDt() == null) ? 0 : getModDt().hashCode());
        result = prime * result + ((getModId() == null) ? 0 : getModId().hashCode());
        return result;
    }
}