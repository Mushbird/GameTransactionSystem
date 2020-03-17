package com.mushbird.sinsege.base.module.member.model.entity;

import com.mushbird.sinsege.base.model.BaseEntity;
import java.io.Serializable;

public class MemberAgreeKey extends BaseEntity implements Serializable {
    private String mbrId;

    private String agrCd;

    private static final long serialVersionUID = com.mushbird.sinsege.base.constant.AppConst.UID;

    public String getMbrId() {
        return mbrId;
    }

    public void setMbrId(String mbrId) {
        this.mbrId = mbrId == null ? null : mbrId.trim();
    }

    public String getAgrCd() {
        return agrCd;
    }

    public void setAgrCd(String agrCd) {
        this.agrCd = agrCd == null ? null : agrCd.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", mbrId=").append(mbrId);
        sb.append(", agrCd=").append(agrCd);
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
        MemberAgreeKey other = (MemberAgreeKey) that;
        return (this.getMbrId() == null ? other.getMbrId() == null : this.getMbrId().equals(other.getMbrId()))
            && (this.getAgrCd() == null ? other.getAgrCd() == null : this.getAgrCd().equals(other.getAgrCd()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getMbrId() == null) ? 0 : getMbrId().hashCode());
        result = prime * result + ((getAgrCd() == null) ? 0 : getAgrCd().hashCode());
        return result;
    }

    public MemberAgreeKey(String mbrId, String agrCd) {
        this.mbrId = mbrId;
        this.agrCd = agrCd;
    }

    public MemberAgreeKey() {
        super();
    }
}