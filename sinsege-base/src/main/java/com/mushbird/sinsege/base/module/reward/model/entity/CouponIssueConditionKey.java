package com.mushbird.sinsege.base.module.reward.model.entity;

import com.mushbird.sinsege.base.model.BaseEntity;
import java.io.Serializable;

public class CouponIssueConditionKey extends BaseEntity implements Serializable {
    private Integer cpnId;

    private String cpnIsuCondCd;

    private static final long serialVersionUID = com.mushbird.sinsege.base.constant.AppConst.UID;

    public Integer getCpnId() {
        return cpnId;
    }

    public void setCpnId(Integer cpnId) {
        this.cpnId = cpnId;
    }

    public String getCpnIsuCondCd() {
        return cpnIsuCondCd;
    }

    public void setCpnIsuCondCd(String cpnIsuCondCd) {
        this.cpnIsuCondCd = cpnIsuCondCd == null ? null : cpnIsuCondCd.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", cpnId=").append(cpnId);
        sb.append(", cpnIsuCondCd=").append(cpnIsuCondCd);
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
        CouponIssueConditionKey other = (CouponIssueConditionKey) that;
        return (this.getCpnId() == null ? other.getCpnId() == null : this.getCpnId().equals(other.getCpnId()))
            && (this.getCpnIsuCondCd() == null ? other.getCpnIsuCondCd() == null : this.getCpnIsuCondCd().equals(other.getCpnIsuCondCd()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getCpnId() == null) ? 0 : getCpnId().hashCode());
        result = prime * result + ((getCpnIsuCondCd() == null) ? 0 : getCpnIsuCondCd().hashCode());
        return result;
    }

    public CouponIssueConditionKey(Integer cpnId, String cpnIsuCondCd) {
        this.cpnId = cpnId;
        this.cpnIsuCondCd = cpnIsuCondCd;
    }

    public CouponIssueConditionKey() {
        super();
    }
}