package com.mushbird.sinsege.base.module.reward.model.entity;

import com.mushbird.sinsege.base.model.BaseEntity;
import java.io.Serializable;

public class CouponUseEnvironmentKey extends BaseEntity implements Serializable {
    private Integer cpnId;

    private String cpnUseEnvCd;

    private static final long serialVersionUID = com.mushbird.sinsege.base.constant.AppConst.UID;

    public Integer getCpnId() {
        return cpnId;
    }

    public void setCpnId(Integer cpnId) {
        this.cpnId = cpnId;
    }

    public String getCpnUseEnvCd() {
        return cpnUseEnvCd;
    }

    public void setCpnUseEnvCd(String cpnUseEnvCd) {
        this.cpnUseEnvCd = cpnUseEnvCd == null ? null : cpnUseEnvCd.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", cpnId=").append(cpnId);
        sb.append(", cpnUseEnvCd=").append(cpnUseEnvCd);
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
        CouponUseEnvironmentKey other = (CouponUseEnvironmentKey) that;
        return (this.getCpnId() == null ? other.getCpnId() == null : this.getCpnId().equals(other.getCpnId()))
            && (this.getCpnUseEnvCd() == null ? other.getCpnUseEnvCd() == null : this.getCpnUseEnvCd().equals(other.getCpnUseEnvCd()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getCpnId() == null) ? 0 : getCpnId().hashCode());
        result = prime * result + ((getCpnUseEnvCd() == null) ? 0 : getCpnUseEnvCd().hashCode());
        return result;
    }

    public CouponUseEnvironmentKey(Integer cpnId, String cpnUseEnvCd) {
        this.cpnId = cpnId;
        this.cpnUseEnvCd = cpnUseEnvCd;
    }

    public CouponUseEnvironmentKey() {
        super();
    }
}