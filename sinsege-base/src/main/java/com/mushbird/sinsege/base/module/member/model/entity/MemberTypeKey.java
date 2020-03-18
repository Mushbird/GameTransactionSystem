package com.mushbird.sinsege.base.module.member.model.entity;

import com.mushbird.sinsege.base.model.BaseEntity;
import java.io.Serializable;

public class MemberTypeKey extends BaseEntity implements Serializable {
    private String mbrId;

    private String mbrTpCd;

    private static final long serialVersionUID = com.mushbird.sinsege.base.constant.AppConst.UID;

    public String getMbrId() {
        return mbrId;
    }

    public void setMbrId(String mbrId) {
        this.mbrId = mbrId == null ? null : mbrId.trim();
    }

    public String getMbrTpCd() {
        return mbrTpCd;
    }

    public void setMbrTpCd(String mbrTpCd) {
        this.mbrTpCd = mbrTpCd == null ? null : mbrTpCd.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", mbrId=").append(mbrId);
        sb.append(", mbrTpCd=").append(mbrTpCd);
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
        MemberTypeKey other = (MemberTypeKey) that;
        return (this.getMbrId() == null ? other.getMbrId() == null : this.getMbrId().equals(other.getMbrId()))
            && (this.getMbrTpCd() == null ? other.getMbrTpCd() == null : this.getMbrTpCd().equals(other.getMbrTpCd()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getMbrId() == null) ? 0 : getMbrId().hashCode());
        result = prime * result + ((getMbrTpCd() == null) ? 0 : getMbrTpCd().hashCode());
        return result;
    }

    public MemberTypeKey(String mbrId, String mbrTpCd) {
        this.mbrId = mbrId;
        this.mbrTpCd = mbrTpCd;
    }

    public MemberTypeKey() {
        super();
    }
}