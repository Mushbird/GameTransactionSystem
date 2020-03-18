package com.mushbird.sinsege.base.module.member.model.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.mushbird.sinsege.base.model.BaseEntity;
import java.io.Serializable;
import java.util.Date;

public abstract class MemberLoginTokenEntity extends BaseEntity implements Serializable {
    private String mbrLgnTkn;

    private String mbrId;

    private Date xprDt;

    @JsonIgnore
    private Date regDt;

    private static final long serialVersionUID = com.mushbird.sinsege.base.constant.AppConst.UID;

    public String getMbrLgnTkn() {
        return mbrLgnTkn;
    }

    public void setMbrLgnTkn(String mbrLgnTkn) {
        this.mbrLgnTkn = mbrLgnTkn == null ? null : mbrLgnTkn.trim();
    }

    public String getMbrId() {
        return mbrId;
    }

    public void setMbrId(String mbrId) {
        this.mbrId = mbrId == null ? null : mbrId.trim();
    }

    public Date getXprDt() {
        return xprDt;
    }

    public void setXprDt(Date xprDt) {
        this.xprDt = xprDt;
    }

    public Date getRegDt() {
        return regDt;
    }

    public void setRegDt(Date regDt) {
        this.regDt = regDt;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", mbrLgnTkn=").append(mbrLgnTkn);
        sb.append(", mbrId=").append(mbrId);
        sb.append(", xprDt=").append(xprDt);
        sb.append(", regDt=").append(regDt);
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
        MemberLoginTokenEntity other = (MemberLoginTokenEntity) that;
        return (this.getMbrLgnTkn() == null ? other.getMbrLgnTkn() == null : this.getMbrLgnTkn().equals(other.getMbrLgnTkn()))
            && (this.getMbrId() == null ? other.getMbrId() == null : this.getMbrId().equals(other.getMbrId()))
            && (this.getXprDt() == null ? other.getXprDt() == null : this.getXprDt().equals(other.getXprDt()))
            && (this.getRegDt() == null ? other.getRegDt() == null : this.getRegDt().equals(other.getRegDt()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getMbrLgnTkn() == null) ? 0 : getMbrLgnTkn().hashCode());
        result = prime * result + ((getMbrId() == null) ? 0 : getMbrId().hashCode());
        result = prime * result + ((getXprDt() == null) ? 0 : getXprDt().hashCode());
        result = prime * result + ((getRegDt() == null) ? 0 : getRegDt().hashCode());
        return result;
    }
}