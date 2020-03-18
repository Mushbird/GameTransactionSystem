package com.mushbird.sinsege.base.module.reward.model.entity;

import com.mushbird.sinsege.base.model.BaseEntity;
import java.io.Serializable;

public class CouponTargetFreegiftMapKey extends BaseEntity implements Serializable {
    private Integer cpnId;

    private Integer itemFrgtId;

    private static final long serialVersionUID = com.mushbird.sinsege.base.constant.AppConst.UID;

    public Integer getCpnId() {
        return cpnId;
    }

    public void setCpnId(Integer cpnId) {
        this.cpnId = cpnId;
    }

    public Integer getItemFrgtId() {
        return itemFrgtId;
    }

    public void setItemFrgtId(Integer itemFrgtId) {
        this.itemFrgtId = itemFrgtId;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", cpnId=").append(cpnId);
        sb.append(", itemFrgtId=").append(itemFrgtId);
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
        CouponTargetFreegiftMapKey other = (CouponTargetFreegiftMapKey) that;
        return (this.getCpnId() == null ? other.getCpnId() == null : this.getCpnId().equals(other.getCpnId()))
            && (this.getItemFrgtId() == null ? other.getItemFrgtId() == null : this.getItemFrgtId().equals(other.getItemFrgtId()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getCpnId() == null) ? 0 : getCpnId().hashCode());
        result = prime * result + ((getItemFrgtId() == null) ? 0 : getItemFrgtId().hashCode());
        return result;
    }

    public CouponTargetFreegiftMapKey(Integer cpnId, Integer itemFrgtId) {
        this.cpnId = cpnId;
        this.itemFrgtId = itemFrgtId;
    }

    public CouponTargetFreegiftMapKey() {
        super();
    }
}