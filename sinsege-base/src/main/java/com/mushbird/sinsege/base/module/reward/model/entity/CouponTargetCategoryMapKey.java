package com.mushbird.sinsege.base.module.reward.model.entity;

import com.mushbird.sinsege.base.model.BaseEntity;
import java.io.Serializable;

public class CouponTargetCategoryMapKey extends BaseEntity implements Serializable {
    private Integer cpnId;

    private Integer dpCateId;

    private static final long serialVersionUID = com.mushbird.sinsege.base.constant.AppConst.UID;

    public Integer getCpnId() {
        return cpnId;
    }

    public void setCpnId(Integer cpnId) {
        this.cpnId = cpnId;
    }

    public Integer getDpCateId() {
        return dpCateId;
    }

    public void setDpCateId(Integer dpCateId) {
        this.dpCateId = dpCateId;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", cpnId=").append(cpnId);
        sb.append(", dpCateId=").append(dpCateId);
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
        CouponTargetCategoryMapKey other = (CouponTargetCategoryMapKey) that;
        return (this.getCpnId() == null ? other.getCpnId() == null : this.getCpnId().equals(other.getCpnId()))
            && (this.getDpCateId() == null ? other.getDpCateId() == null : this.getDpCateId().equals(other.getDpCateId()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getCpnId() == null) ? 0 : getCpnId().hashCode());
        result = prime * result + ((getDpCateId() == null) ? 0 : getDpCateId().hashCode());
        return result;
    }

    public CouponTargetCategoryMapKey(Integer cpnId, Integer dpCateId) {
        this.cpnId = cpnId;
        this.dpCateId = dpCateId;
    }

    public CouponTargetCategoryMapKey() {
        super();
    }
}