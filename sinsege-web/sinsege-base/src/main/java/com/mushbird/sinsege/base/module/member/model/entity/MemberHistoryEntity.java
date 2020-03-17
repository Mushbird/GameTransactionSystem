package com.mushbird.sinsege.base.module.member.model.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.mushbird.sinsege.base.model.BaseEntity;
import java.io.Serializable;
import java.util.Date;

public abstract class MemberHistoryEntity extends BaseEntity implements Serializable {
    private Integer mbrHistId;

    private String mbrId;

    private String admId;

    private String mbrHistTpCd;

    private Date mbrHistDt;

    private String cont;

    @JsonIgnore
    private Date regDt;

    @JsonIgnore
    private String regId;

    private static final long serialVersionUID = com.mushbird.sinsege.base.constant.AppConst.UID;

    public Integer getMbrHistId() {
        return mbrHistId;
    }

    public void setMbrHistId(Integer mbrHistId) {
        this.mbrHistId = mbrHistId;
    }

    public String getMbrId() {
        return mbrId;
    }

    public void setMbrId(String mbrId) {
        this.mbrId = mbrId == null ? null : mbrId.trim();
    }

    public String getAdmId() {
        return admId;
    }

    public void setAdmId(String admId) {
        this.admId = admId == null ? null : admId.trim();
    }

    public String getMbrHistTpCd() {
        return mbrHistTpCd;
    }

    public void setMbrHistTpCd(String mbrHistTpCd) {
        this.mbrHistTpCd = mbrHistTpCd == null ? null : mbrHistTpCd.trim();
    }

    public Date getMbrHistDt() {
        return mbrHistDt;
    }

    public void setMbrHistDt(Date mbrHistDt) {
        this.mbrHistDt = mbrHistDt;
    }

    public String getCont() {
        return cont;
    }

    public void setCont(String cont) {
        this.cont = cont == null ? null : cont.trim();
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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", mbrHistId=").append(mbrHistId);
        sb.append(", mbrId=").append(mbrId);
        sb.append(", admId=").append(admId);
        sb.append(", mbrHistTpCd=").append(mbrHistTpCd);
        sb.append(", mbrHistDt=").append(mbrHistDt);
        sb.append(", cont=").append(cont);
        sb.append(", regDt=").append(regDt);
        sb.append(", regId=").append(regId);
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
        MemberHistoryEntity other = (MemberHistoryEntity) that;
        return (this.getMbrHistId() == null ? other.getMbrHistId() == null : this.getMbrHistId().equals(other.getMbrHistId()))
            && (this.getMbrId() == null ? other.getMbrId() == null : this.getMbrId().equals(other.getMbrId()))
            && (this.getAdmId() == null ? other.getAdmId() == null : this.getAdmId().equals(other.getAdmId()))
            && (this.getMbrHistTpCd() == null ? other.getMbrHistTpCd() == null : this.getMbrHistTpCd().equals(other.getMbrHistTpCd()))
            && (this.getMbrHistDt() == null ? other.getMbrHistDt() == null : this.getMbrHistDt().equals(other.getMbrHistDt()))
            && (this.getCont() == null ? other.getCont() == null : this.getCont().equals(other.getCont()))
            && (this.getRegDt() == null ? other.getRegDt() == null : this.getRegDt().equals(other.getRegDt()))
            && (this.getRegId() == null ? other.getRegId() == null : this.getRegId().equals(other.getRegId()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getMbrHistId() == null) ? 0 : getMbrHistId().hashCode());
        result = prime * result + ((getMbrId() == null) ? 0 : getMbrId().hashCode());
        result = prime * result + ((getAdmId() == null) ? 0 : getAdmId().hashCode());
        result = prime * result + ((getMbrHistTpCd() == null) ? 0 : getMbrHistTpCd().hashCode());
        result = prime * result + ((getMbrHistDt() == null) ? 0 : getMbrHistDt().hashCode());
        result = prime * result + ((getCont() == null) ? 0 : getCont().hashCode());
        result = prime * result + ((getRegDt() == null) ? 0 : getRegDt().hashCode());
        result = prime * result + ((getRegId() == null) ? 0 : getRegId().hashCode());
        return result;
    }
}