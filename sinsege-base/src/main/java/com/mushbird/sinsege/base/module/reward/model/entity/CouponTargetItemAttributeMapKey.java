package com.mushbird.sinsege.base.module.reward.model.entity;

import com.mushbird.sinsege.base.model.BaseEntity;
import java.io.Serializable;

public class CouponTargetItemAttributeMapKey extends BaseEntity implements Serializable {
    private Integer cpnId;

    private String itemAttrTpCd;

    private static final long serialVersionUID = com.mushbird.sinsege.base.constant.AppConst.UID;

    public Integer getCpnId() {
        return cpnId;
    }

    public void setCpnId(Integer cpnId) {
        this.cpnId = cpnId;
    }

    public String getItemAttrTpCd() {
        return itemAttrTpCd;
    }

    public void setItemAttrTpCd(String itemAttrTpCd) {
        this.itemAttrTpCd = itemAttrTpCd == null ? null : itemAttrTpCd.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", cpnId=").append(cpnId);
        sb.append(", itemAttrTpCd=").append(itemAttrTpCd);
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
        CouponTargetItemAttributeMapKey other = (CouponTargetItemAttributeMapKey) that;
        return (this.getCpnId() == null ? other.getCpnId() == null : this.getCpnId().equals(other.getCpnId()))
            && (this.getItemAttrTpCd() == null ? other.getItemAttrTpCd() == null : this.getItemAttrTpCd().equals(other.getItemAttrTpCd()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getCpnId() == null) ? 0 : getCpnId().hashCode());
        result = prime * result + ((getItemAttrTpCd() == null) ? 0 : getItemAttrTpCd().hashCode());
        return result;
    }

    public CouponTargetItemAttributeMapKey(Integer cpnId, String itemAttrTpCd) {
        this.cpnId = cpnId;
        this.itemAttrTpCd = itemAttrTpCd;
    }

    public CouponTargetItemAttributeMapKey() {
        super();
    }
}