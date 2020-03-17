package com.mushbird.sinsege.base.module.reward.model.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.io.Serializable;
import java.util.Date;

public abstract class CouponIssueConditionEntity extends CouponIssueConditionKey implements Serializable {
    private String cpnIsuCondVal;

    @JsonIgnore
    private Date regDt;

    @JsonIgnore
    private String regId;

    private static final long serialVersionUID = com.mushbird.sinsege.base.constant.AppConst.UID;

    public String getCpnIsuCondVal() {
        return cpnIsuCondVal;
    }

    public void setCpnIsuCondVal(String cpnIsuCondVal) {
        this.cpnIsuCondVal = cpnIsuCondVal == null ? null : cpnIsuCondVal.trim();
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
        sb.append(", cpnIsuCondVal=").append(cpnIsuCondVal);
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
        CouponIssueConditionEntity other = (CouponIssueConditionEntity) that;
        return (this.getCpnId() == null ? other.getCpnId() == null : this.getCpnId().equals(other.getCpnId()))
            && (this.getCpnIsuCondCd() == null ? other.getCpnIsuCondCd() == null : this.getCpnIsuCondCd().equals(other.getCpnIsuCondCd()))
            && (this.getCpnIsuCondVal() == null ? other.getCpnIsuCondVal() == null : this.getCpnIsuCondVal().equals(other.getCpnIsuCondVal()))
            && (this.getRegDt() == null ? other.getRegDt() == null : this.getRegDt().equals(other.getRegDt()))
            && (this.getRegId() == null ? other.getRegId() == null : this.getRegId().equals(other.getRegId()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getCpnId() == null) ? 0 : getCpnId().hashCode());
        result = prime * result + ((getCpnIsuCondCd() == null) ? 0 : getCpnIsuCondCd().hashCode());
        result = prime * result + ((getCpnIsuCondVal() == null) ? 0 : getCpnIsuCondVal().hashCode());
        result = prime * result + ((getRegDt() == null) ? 0 : getRegDt().hashCode());
        result = prime * result + ((getRegId() == null) ? 0 : getRegId().hashCode());
        return result;
    }
}