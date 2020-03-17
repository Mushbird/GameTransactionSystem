package com.mushbird.sinsege.base.module.display.model.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.mushbird.sinsege.base.model.BaseEntity;
import java.io.Serializable;
import java.util.Date;

public abstract class DpClosePageEntity extends BaseEntity implements Serializable {
    private Integer dpChId;

    private String pageDesc;

    private Date prgsStDt;

    private Date prgsEdDt;

    private String accsCd;

    private String accsUrl;

    private String accsUrlQrcd;

    private String mbrTgtCd;

    private String pageContPc;

    private String pageContMob;

    private String dpYn;

    @JsonIgnore
    private Date regDt;

    @JsonIgnore
    private String regId;

    @JsonIgnore
    private Date modDt;

    @JsonIgnore
    private String modId;

    private static final long serialVersionUID = com.mushbird.sinsege.base.constant.AppConst.UID;

    public Integer getDpChId() {
        return dpChId;
    }

    public void setDpChId(Integer dpChId) {
        this.dpChId = dpChId;
    }

    public String getPageDesc() {
        return pageDesc;
    }

    public void setPageDesc(String pageDesc) {
        this.pageDesc = pageDesc == null ? null : pageDesc.trim();
    }

    public Date getPrgsStDt() {
        return prgsStDt;
    }

    public void setPrgsStDt(Date prgsStDt) {
        this.prgsStDt = prgsStDt;
    }

    public Date getPrgsEdDt() {
        return prgsEdDt;
    }

    public void setPrgsEdDt(Date prgsEdDt) {
        this.prgsEdDt = prgsEdDt;
    }

    public String getAccsCd() {
        return accsCd;
    }

    public void setAccsCd(String accsCd) {
        this.accsCd = accsCd == null ? null : accsCd.trim();
    }

    public String getAccsUrl() {
        return accsUrl;
    }

    public void setAccsUrl(String accsUrl) {
        this.accsUrl = accsUrl == null ? null : accsUrl.trim();
    }

    public String getAccsUrlQrcd() {
        return accsUrlQrcd;
    }

    public void setAccsUrlQrcd(String accsUrlQrcd) {
        this.accsUrlQrcd = accsUrlQrcd == null ? null : accsUrlQrcd.trim();
    }

    public String getMbrTgtCd() {
        return mbrTgtCd;
    }

    public void setMbrTgtCd(String mbrTgtCd) {
        this.mbrTgtCd = mbrTgtCd == null ? null : mbrTgtCd.trim();
    }

    public String getPageContPc() {
        return pageContPc;
    }

    public void setPageContPc(String pageContPc) {
        this.pageContPc = pageContPc == null ? null : pageContPc.trim();
    }

    public String getPageContMob() {
        return pageContMob;
    }

    public void setPageContMob(String pageContMob) {
        this.pageContMob = pageContMob == null ? null : pageContMob.trim();
    }

    public String getDpYn() {
        return dpYn;
    }

    public void setDpYn(String dpYn) {
        this.dpYn = dpYn == null ? null : dpYn.trim();
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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", dpChId=").append(dpChId);
        sb.append(", pageDesc=").append(pageDesc);
        sb.append(", prgsStDt=").append(prgsStDt);
        sb.append(", prgsEdDt=").append(prgsEdDt);
        sb.append(", accsCd=").append(accsCd);
        sb.append(", accsUrl=").append(accsUrl);
        sb.append(", accsUrlQrcd=").append(accsUrlQrcd);
        sb.append(", mbrTgtCd=").append(mbrTgtCd);
        sb.append(", pageContPc=").append(pageContPc);
        sb.append(", pageContMob=").append(pageContMob);
        sb.append(", dpYn=").append(dpYn);
        sb.append(", regDt=").append(regDt);
        sb.append(", regId=").append(regId);
        sb.append(", modDt=").append(modDt);
        sb.append(", modId=").append(modId);
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
        DpClosePageEntity other = (DpClosePageEntity) that;
        return (this.getDpChId() == null ? other.getDpChId() == null : this.getDpChId().equals(other.getDpChId()))
            && (this.getPageDesc() == null ? other.getPageDesc() == null : this.getPageDesc().equals(other.getPageDesc()))
            && (this.getPrgsStDt() == null ? other.getPrgsStDt() == null : this.getPrgsStDt().equals(other.getPrgsStDt()))
            && (this.getPrgsEdDt() == null ? other.getPrgsEdDt() == null : this.getPrgsEdDt().equals(other.getPrgsEdDt()))
            && (this.getAccsCd() == null ? other.getAccsCd() == null : this.getAccsCd().equals(other.getAccsCd()))
            && (this.getAccsUrl() == null ? other.getAccsUrl() == null : this.getAccsUrl().equals(other.getAccsUrl()))
            && (this.getAccsUrlQrcd() == null ? other.getAccsUrlQrcd() == null : this.getAccsUrlQrcd().equals(other.getAccsUrlQrcd()))
            && (this.getMbrTgtCd() == null ? other.getMbrTgtCd() == null : this.getMbrTgtCd().equals(other.getMbrTgtCd()))
            && (this.getPageContPc() == null ? other.getPageContPc() == null : this.getPageContPc().equals(other.getPageContPc()))
            && (this.getPageContMob() == null ? other.getPageContMob() == null : this.getPageContMob().equals(other.getPageContMob()))
            && (this.getDpYn() == null ? other.getDpYn() == null : this.getDpYn().equals(other.getDpYn()))
            && (this.getRegDt() == null ? other.getRegDt() == null : this.getRegDt().equals(other.getRegDt()))
            && (this.getRegId() == null ? other.getRegId() == null : this.getRegId().equals(other.getRegId()))
            && (this.getModDt() == null ? other.getModDt() == null : this.getModDt().equals(other.getModDt()))
            && (this.getModId() == null ? other.getModId() == null : this.getModId().equals(other.getModId()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getDpChId() == null) ? 0 : getDpChId().hashCode());
        result = prime * result + ((getPageDesc() == null) ? 0 : getPageDesc().hashCode());
        result = prime * result + ((getPrgsStDt() == null) ? 0 : getPrgsStDt().hashCode());
        result = prime * result + ((getPrgsEdDt() == null) ? 0 : getPrgsEdDt().hashCode());
        result = prime * result + ((getAccsCd() == null) ? 0 : getAccsCd().hashCode());
        result = prime * result + ((getAccsUrl() == null) ? 0 : getAccsUrl().hashCode());
        result = prime * result + ((getAccsUrlQrcd() == null) ? 0 : getAccsUrlQrcd().hashCode());
        result = prime * result + ((getMbrTgtCd() == null) ? 0 : getMbrTgtCd().hashCode());
        result = prime * result + ((getPageContPc() == null) ? 0 : getPageContPc().hashCode());
        result = prime * result + ((getPageContMob() == null) ? 0 : getPageContMob().hashCode());
        result = prime * result + ((getDpYn() == null) ? 0 : getDpYn().hashCode());
        result = prime * result + ((getRegDt() == null) ? 0 : getRegDt().hashCode());
        result = prime * result + ((getRegId() == null) ? 0 : getRegId().hashCode());
        result = prime * result + ((getModDt() == null) ? 0 : getModDt().hashCode());
        result = prime * result + ((getModId() == null) ? 0 : getModId().hashCode());
        return result;
    }
}