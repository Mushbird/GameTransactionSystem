package com.mushbird.sinsege.base.module.reward.model.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.mushbird.sinsege.base.model.BaseEntity;
import java.io.Serializable;
import java.util.Date;

public abstract class CouponRandomNumberEntity extends BaseEntity implements Serializable {
    private Integer cpnRdnbId;

    private Integer cpnId;

    private Integer mbrCpnId;

    private String cpnRdnb;

    private String aplyYn;

    @JsonIgnore
    private Date regDt;

    @JsonIgnore
    private String regId;

    @JsonIgnore
    private String useYn;

    private static final long serialVersionUID = com.mushbird.sinsege.base.constant.AppConst.UID;

    public Integer getCpnRdnbId() {
        return cpnRdnbId;
    }

    public void setCpnRdnbId(Integer cpnRdnbId) {
        this.cpnRdnbId = cpnRdnbId;
    }

    public Integer getCpnId() {
        return cpnId;
    }

    public void setCpnId(Integer cpnId) {
        this.cpnId = cpnId;
    }

    public Integer getMbrCpnId() {
        return mbrCpnId;
    }

    public void setMbrCpnId(Integer mbrCpnId) {
        this.mbrCpnId = mbrCpnId;
    }

    public String getCpnRdnb() {
        return cpnRdnb;
    }

    public void setCpnRdnb(String cpnRdnb) {
        this.cpnRdnb = cpnRdnb == null ? null : cpnRdnb.trim();
    }

    public String getAplyYn() {
        return aplyYn;
    }

    public void setAplyYn(String aplyYn) {
        this.aplyYn = aplyYn == null ? null : aplyYn.trim();
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

    public String getUseYn() {
        return useYn;
    }

    public void setUseYn(String useYn) {
        this.useYn = useYn == null ? null : useYn.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", cpnRdnbId=").append(cpnRdnbId);
        sb.append(", cpnId=").append(cpnId);
        sb.append(", mbrCpnId=").append(mbrCpnId);
        sb.append(", cpnRdnb=").append(cpnRdnb);
        sb.append(", aplyYn=").append(aplyYn);
        sb.append(", regDt=").append(regDt);
        sb.append(", regId=").append(regId);
        sb.append(", useYn=").append(useYn);
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
        CouponRandomNumberEntity other = (CouponRandomNumberEntity) that;
        return (this.getCpnRdnbId() == null ? other.getCpnRdnbId() == null : this.getCpnRdnbId().equals(other.getCpnRdnbId()))
            && (this.getCpnId() == null ? other.getCpnId() == null : this.getCpnId().equals(other.getCpnId()))
            && (this.getMbrCpnId() == null ? other.getMbrCpnId() == null : this.getMbrCpnId().equals(other.getMbrCpnId()))
            && (this.getCpnRdnb() == null ? other.getCpnRdnb() == null : this.getCpnRdnb().equals(other.getCpnRdnb()))
            && (this.getAplyYn() == null ? other.getAplyYn() == null : this.getAplyYn().equals(other.getAplyYn()))
            && (this.getRegDt() == null ? other.getRegDt() == null : this.getRegDt().equals(other.getRegDt()))
            && (this.getRegId() == null ? other.getRegId() == null : this.getRegId().equals(other.getRegId()))
            && (this.getUseYn() == null ? other.getUseYn() == null : this.getUseYn().equals(other.getUseYn()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getCpnRdnbId() == null) ? 0 : getCpnRdnbId().hashCode());
        result = prime * result + ((getCpnId() == null) ? 0 : getCpnId().hashCode());
        result = prime * result + ((getMbrCpnId() == null) ? 0 : getMbrCpnId().hashCode());
        result = prime * result + ((getCpnRdnb() == null) ? 0 : getCpnRdnb().hashCode());
        result = prime * result + ((getAplyYn() == null) ? 0 : getAplyYn().hashCode());
        result = prime * result + ((getRegDt() == null) ? 0 : getRegDt().hashCode());
        result = prime * result + ((getRegId() == null) ? 0 : getRegId().hashCode());
        result = prime * result + ((getUseYn() == null) ? 0 : getUseYn().hashCode());
        return result;
    }
}