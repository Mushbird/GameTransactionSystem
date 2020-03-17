package com.mushbird.sinsege.base.module.member.model.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.io.Serializable;
import java.util.Date;

public abstract class MemberTypeEntity extends MemberTypeKey implements Serializable {
    private Integer authRefId;

    private Date authDt;

    private String admId;

    @JsonIgnore
    private Date regDt;

    @JsonIgnore
    private String regId;

    @JsonIgnore
    private Date modDt;

    @JsonIgnore
    private String modId;

    private static final long serialVersionUID = com.mushbird.sinsege.base.constant.AppConst.UID;

    public Integer getAuthRefId() {
        return authRefId;
    }

    public void setAuthRefId(Integer authRefId) {
        this.authRefId = authRefId;
    }

    public Date getAuthDt() {
        return authDt;
    }

    public void setAuthDt(Date authDt) {
        this.authDt = authDt;
    }

    public String getAdmId() {
        return admId;
    }

    public void setAdmId(String admId) {
        this.admId = admId == null ? null : admId.trim();
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
        sb.append(", authRefId=").append(authRefId);
        sb.append(", authDt=").append(authDt);
        sb.append(", admId=").append(admId);
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
        MemberTypeEntity other = (MemberTypeEntity) that;
        return (this.getMbrId() == null ? other.getMbrId() == null : this.getMbrId().equals(other.getMbrId()))
            && (this.getMbrTpCd() == null ? other.getMbrTpCd() == null : this.getMbrTpCd().equals(other.getMbrTpCd()))
            && (this.getAuthRefId() == null ? other.getAuthRefId() == null : this.getAuthRefId().equals(other.getAuthRefId()))
            && (this.getAuthDt() == null ? other.getAuthDt() == null : this.getAuthDt().equals(other.getAuthDt()))
            && (this.getAdmId() == null ? other.getAdmId() == null : this.getAdmId().equals(other.getAdmId()))
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
        result = prime * result + ((getMbrTpCd() == null) ? 0 : getMbrTpCd().hashCode());
        result = prime * result + ((getAuthRefId() == null) ? 0 : getAuthRefId().hashCode());
        result = prime * result + ((getAuthDt() == null) ? 0 : getAuthDt().hashCode());
        result = prime * result + ((getAdmId() == null) ? 0 : getAdmId().hashCode());
        result = prime * result + ((getRegDt() == null) ? 0 : getRegDt().hashCode());
        result = prime * result + ((getRegId() == null) ? 0 : getRegId().hashCode());
        result = prime * result + ((getModDt() == null) ? 0 : getModDt().hashCode());
        result = prime * result + ((getModId() == null) ? 0 : getModId().hashCode());
        return result;
    }
}