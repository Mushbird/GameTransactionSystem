package com.mushbird.sinsege.base.module.display.model.entity;

import com.mushbird.sinsege.base.model.BaseEntity;
import java.io.Serializable;

public class DpClosePageMemberTargetKey extends BaseEntity implements Serializable {
    private Integer dpChId;

    private String mbrTgtCd;

    private static final long serialVersionUID = com.mushbird.sinsege.base.constant.AppConst.UID;

    public Integer getDpChId() {
        return dpChId;
    }

    public void setDpChId(Integer dpChId) {
        this.dpChId = dpChId;
    }

    public String getMbrTgtCd() {
        return mbrTgtCd;
    }

    public void setMbrTgtCd(String mbrTgtCd) {
        this.mbrTgtCd = mbrTgtCd == null ? null : mbrTgtCd.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", dpChId=").append(dpChId);
        sb.append(", mbrTgtCd=").append(mbrTgtCd);
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
        DpClosePageMemberTargetKey other = (DpClosePageMemberTargetKey) that;
        return (this.getDpChId() == null ? other.getDpChId() == null : this.getDpChId().equals(other.getDpChId()))
            && (this.getMbrTgtCd() == null ? other.getMbrTgtCd() == null : this.getMbrTgtCd().equals(other.getMbrTgtCd()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getDpChId() == null) ? 0 : getDpChId().hashCode());
        result = prime * result + ((getMbrTgtCd() == null) ? 0 : getMbrTgtCd().hashCode());
        return result;
    }

    public DpClosePageMemberTargetKey(Integer dpChId, String mbrTgtCd) {
        this.dpChId = dpChId;
        this.mbrTgtCd = mbrTgtCd;
    }

    public DpClosePageMemberTargetKey() {
        super();
    }
}