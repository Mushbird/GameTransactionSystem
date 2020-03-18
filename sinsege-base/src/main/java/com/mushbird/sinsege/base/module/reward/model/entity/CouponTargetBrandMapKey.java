package com.mushbird.sinsege.base.module.reward.model.entity;

import com.mushbird.sinsege.base.model.BaseEntity;
import java.io.Serializable;

public class CouponTargetBrandMapKey extends BaseEntity implements Serializable {
    private Integer cpnId;

    private Integer dpBrndId;

    private static final long serialVersionUID = com.mushbird.sinsege.base.constant.AppConst.UID;

    public Integer getCpnId() {
        return cpnId;
    }

    public void setCpnId(Integer cpnId) {
        this.cpnId = cpnId;
    }

    public Integer getDpBrndId() {
        return dpBrndId;
    }

    public void setDpBrndId(Integer dpBrndId) {
        this.dpBrndId = dpBrndId;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", cpnId=").append(cpnId);
        sb.append(", dpBrndId=").append(dpBrndId);
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
        CouponTargetBrandMapKey other = (CouponTargetBrandMapKey) that;
        return (this.getCpnId() == null ? other.getCpnId() == null : this.getCpnId().equals(other.getCpnId()))
            && (this.getDpBrndId() == null ? other.getDpBrndId() == null : this.getDpBrndId().equals(other.getDpBrndId()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getCpnId() == null) ? 0 : getCpnId().hashCode());
        result = prime * result + ((getDpBrndId() == null) ? 0 : getDpBrndId().hashCode());
        return result;
    }

    public CouponTargetBrandMapKey(Integer cpnId, Integer dpBrndId) {
        this.cpnId = cpnId;
        this.dpBrndId = dpBrndId;
    }

    public CouponTargetBrandMapKey() {
        super();
    }
}