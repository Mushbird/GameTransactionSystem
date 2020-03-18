package com.mushbird.sinsege.base.module.member.model.entity;

import com.mushbird.sinsege.base.model.BaseEntity;
import java.io.Serializable;

public class MemberAuthTokenKey extends BaseEntity implements Serializable {
    private String mbrId;

    private String mbrAuthTkn;

    private static final long serialVersionUID = com.mushbird.sinsege.base.constant.AppConst.UID;

    public String getMbrId() {
        return mbrId;
    }

    public void setMbrId(String mbrId) {
        this.mbrId = mbrId == null ? null : mbrId.trim();
    }

    public String getMbrAuthTkn() {
        return mbrAuthTkn;
    }

    public void setMbrAuthTkn(String mbrAuthTkn) {
        this.mbrAuthTkn = mbrAuthTkn == null ? null : mbrAuthTkn.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", mbrId=").append(mbrId);
        sb.append(", mbrAuthTkn=").append(mbrAuthTkn);
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
        MemberAuthTokenKey other = (MemberAuthTokenKey) that;
        return (this.getMbrId() == null ? other.getMbrId() == null : this.getMbrId().equals(other.getMbrId()))
            && (this.getMbrAuthTkn() == null ? other.getMbrAuthTkn() == null : this.getMbrAuthTkn().equals(other.getMbrAuthTkn()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getMbrId() == null) ? 0 : getMbrId().hashCode());
        result = prime * result + ((getMbrAuthTkn() == null) ? 0 : getMbrAuthTkn().hashCode());
        return result;
    }

    public MemberAuthTokenKey(String mbrId, String mbrAuthTkn) {
        this.mbrId = mbrId;
        this.mbrAuthTkn = mbrAuthTkn;
    }

    public MemberAuthTokenKey() {
        super();
    }
}