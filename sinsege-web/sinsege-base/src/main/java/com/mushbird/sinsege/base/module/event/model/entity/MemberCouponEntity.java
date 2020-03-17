package com.mushbird.sinsege.base.module.event.model.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.mushbird.sinsege.base.model.BaseEntity;
import java.io.Serializable;
import java.util.Date;

public abstract class MemberCouponEntity extends BaseEntity implements Serializable {
    private Integer mbrCpnId;

    private String mbrId;

    private Integer cpnId;

    private String mbrCpnNo;

    private String cpnIsuMethCd;

    private String cpnIsuRsnCont;

    private Date cpnIsuDt;

    private Date cpnUseVldStDt;

    private Date cpnUseVldEdDt;

    private String cpnUseYn;

    private Date cpnUseDt;

    @JsonIgnore
    private Date regDt;

    @JsonIgnore
    private String regId;

    @JsonIgnore
    private Date modDt;

    @JsonIgnore
    private String modId;

    @JsonIgnore
    private String useYn;

    private static final long serialVersionUID = com.mushbird.sinsege.base.constant.AppConst.UID;

    public Integer getMbrCpnId() {
        return mbrCpnId;
    }

    public void setMbrCpnId(Integer mbrCpnId) {
        this.mbrCpnId = mbrCpnId;
    }

    public String getMbrId() {
        return mbrId;
    }

    public void setMbrId(String mbrId) {
        this.mbrId = mbrId == null ? null : mbrId.trim();
    }

    public Integer getCpnId() {
        return cpnId;
    }

    public void setCpnId(Integer cpnId) {
        this.cpnId = cpnId;
    }

    public String getMbrCpnNo() {
        return mbrCpnNo;
    }

    public void setMbrCpnNo(String mbrCpnNo) {
        this.mbrCpnNo = mbrCpnNo == null ? null : mbrCpnNo.trim();
    }

    public String getCpnIsuMethCd() {
        return cpnIsuMethCd;
    }

    public void setCpnIsuMethCd(String cpnIsuMethCd) {
        this.cpnIsuMethCd = cpnIsuMethCd == null ? null : cpnIsuMethCd.trim();
    }

    public String getCpnIsuRsnCont() {
        return cpnIsuRsnCont;
    }

    public void setCpnIsuRsnCont(String cpnIsuRsnCont) {
        this.cpnIsuRsnCont = cpnIsuRsnCont == null ? null : cpnIsuRsnCont.trim();
    }

    public Date getCpnIsuDt() {
        return cpnIsuDt;
    }

    public void setCpnIsuDt(Date cpnIsuDt) {
        this.cpnIsuDt = cpnIsuDt;
    }

    public Date getCpnUseVldStDt() {
        return cpnUseVldStDt;
    }

    public void setCpnUseVldStDt(Date cpnUseVldStDt) {
        this.cpnUseVldStDt = cpnUseVldStDt;
    }

    public Date getCpnUseVldEdDt() {
        return cpnUseVldEdDt;
    }

    public void setCpnUseVldEdDt(Date cpnUseVldEdDt) {
        this.cpnUseVldEdDt = cpnUseVldEdDt;
    }

    public String getCpnUseYn() {
        return cpnUseYn;
    }

    public void setCpnUseYn(String cpnUseYn) {
        this.cpnUseYn = cpnUseYn == null ? null : cpnUseYn.trim();
    }

    public Date getCpnUseDt() {
        return cpnUseDt;
    }

    public void setCpnUseDt(Date cpnUseDt) {
        this.cpnUseDt = cpnUseDt;
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

    public Date getModDt() {
        return modDt;
    }

    public void setModDt(Date modDt) {
        this.modDt = modDt;
    }

    public String getModId() {
        return modId;
    }

    public void setModId(String modId) {
        this.modId = modId == null ? null : modId.trim();
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
        sb.append(", mbrCpnId=").append(mbrCpnId);
        sb.append(", mbrId=").append(mbrId);
        sb.append(", cpnId=").append(cpnId);
        sb.append(", mbrCpnNo=").append(mbrCpnNo);
        sb.append(", cpnIsuMethCd=").append(cpnIsuMethCd);
        sb.append(", cpnIsuRsnCont=").append(cpnIsuRsnCont);
        sb.append(", cpnIsuDt=").append(cpnIsuDt);
        sb.append(", cpnUseVldStDt=").append(cpnUseVldStDt);
        sb.append(", cpnUseVldEdDt=").append(cpnUseVldEdDt);
        sb.append(", cpnUseYn=").append(cpnUseYn);
        sb.append(", cpnUseDt=").append(cpnUseDt);
        sb.append(", regDt=").append(regDt);
        sb.append(", regId=").append(regId);
        sb.append(", modDt=").append(modDt);
        sb.append(", modId=").append(modId);
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
        MemberCouponEntity other = (MemberCouponEntity) that;
        return (this.getMbrCpnId() == null ? other.getMbrCpnId() == null : this.getMbrCpnId().equals(other.getMbrCpnId()))
            && (this.getMbrId() == null ? other.getMbrId() == null : this.getMbrId().equals(other.getMbrId()))
            && (this.getCpnId() == null ? other.getCpnId() == null : this.getCpnId().equals(other.getCpnId()))
            && (this.getMbrCpnNo() == null ? other.getMbrCpnNo() == null : this.getMbrCpnNo().equals(other.getMbrCpnNo()))
            && (this.getCpnIsuMethCd() == null ? other.getCpnIsuMethCd() == null : this.getCpnIsuMethCd().equals(other.getCpnIsuMethCd()))
            && (this.getCpnIsuRsnCont() == null ? other.getCpnIsuRsnCont() == null : this.getCpnIsuRsnCont().equals(other.getCpnIsuRsnCont()))
            && (this.getCpnIsuDt() == null ? other.getCpnIsuDt() == null : this.getCpnIsuDt().equals(other.getCpnIsuDt()))
            && (this.getCpnUseVldStDt() == null ? other.getCpnUseVldStDt() == null : this.getCpnUseVldStDt().equals(other.getCpnUseVldStDt()))
            && (this.getCpnUseVldEdDt() == null ? other.getCpnUseVldEdDt() == null : this.getCpnUseVldEdDt().equals(other.getCpnUseVldEdDt()))
            && (this.getCpnUseYn() == null ? other.getCpnUseYn() == null : this.getCpnUseYn().equals(other.getCpnUseYn()))
            && (this.getCpnUseDt() == null ? other.getCpnUseDt() == null : this.getCpnUseDt().equals(other.getCpnUseDt()))
            && (this.getRegDt() == null ? other.getRegDt() == null : this.getRegDt().equals(other.getRegDt()))
            && (this.getRegId() == null ? other.getRegId() == null : this.getRegId().equals(other.getRegId()))
            && (this.getModDt() == null ? other.getModDt() == null : this.getModDt().equals(other.getModDt()))
            && (this.getModId() == null ? other.getModId() == null : this.getModId().equals(other.getModId()))
            && (this.getUseYn() == null ? other.getUseYn() == null : this.getUseYn().equals(other.getUseYn()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getMbrCpnId() == null) ? 0 : getMbrCpnId().hashCode());
        result = prime * result + ((getMbrId() == null) ? 0 : getMbrId().hashCode());
        result = prime * result + ((getCpnId() == null) ? 0 : getCpnId().hashCode());
        result = prime * result + ((getMbrCpnNo() == null) ? 0 : getMbrCpnNo().hashCode());
        result = prime * result + ((getCpnIsuMethCd() == null) ? 0 : getCpnIsuMethCd().hashCode());
        result = prime * result + ((getCpnIsuRsnCont() == null) ? 0 : getCpnIsuRsnCont().hashCode());
        result = prime * result + ((getCpnIsuDt() == null) ? 0 : getCpnIsuDt().hashCode());
        result = prime * result + ((getCpnUseVldStDt() == null) ? 0 : getCpnUseVldStDt().hashCode());
        result = prime * result + ((getCpnUseVldEdDt() == null) ? 0 : getCpnUseVldEdDt().hashCode());
        result = prime * result + ((getCpnUseYn() == null) ? 0 : getCpnUseYn().hashCode());
        result = prime * result + ((getCpnUseDt() == null) ? 0 : getCpnUseDt().hashCode());
        result = prime * result + ((getRegDt() == null) ? 0 : getRegDt().hashCode());
        result = prime * result + ((getRegId() == null) ? 0 : getRegId().hashCode());
        result = prime * result + ((getModDt() == null) ? 0 : getModDt().hashCode());
        result = prime * result + ((getModId() == null) ? 0 : getModId().hashCode());
        result = prime * result + ((getUseYn() == null) ? 0 : getUseYn().hashCode());
        return result;
    }
}