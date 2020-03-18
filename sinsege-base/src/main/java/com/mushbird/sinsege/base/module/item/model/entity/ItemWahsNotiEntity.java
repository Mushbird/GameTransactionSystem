package com.mushbird.sinsege.base.module.item.model.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.mushbird.sinsege.base.model.BaseEntity;
import java.io.Serializable;
import java.util.Date;

public abstract class ItemWahsNotiEntity extends BaseEntity implements Serializable {
    private Integer itemWahsNotiId;

    private Integer itemId;

    private Integer itemOptId;

    private String mbrId;

    private String itemWahsNotiStatCd;

    private String cpNo;

    private String psnlInfoHndlPcyAgrYn;

    private Date notiReqDt;

    private String notiPerdStYmd;

    private String notiPerdEdYmd;

    private Date notiSndDt;

    @JsonIgnore
    private Date regDt;

    @JsonIgnore
    private String regId;

    private String useYn;

    private static final long serialVersionUID = com.mushbird.sinsege.base.constant.AppConst.UID;

    public Integer getItemWahsNotiId() {
        return itemWahsNotiId;
    }

    public void setItemWahsNotiId(Integer itemWahsNotiId) {
        this.itemWahsNotiId = itemWahsNotiId;
    }

    public Integer getItemId() {
        return itemId;
    }

    public void setItemId(Integer itemId) {
        this.itemId = itemId;
    }

    public Integer getItemOptId() {
        return itemOptId;
    }

    public void setItemOptId(Integer itemOptId) {
        this.itemOptId = itemOptId;
    }

    public String getMbrId() {
        return mbrId;
    }

    public void setMbrId(String mbrId) {
        this.mbrId = mbrId == null ? null : mbrId.trim();
    }

    public String getItemWahsNotiStatCd() {
        return itemWahsNotiStatCd;
    }

    public void setItemWahsNotiStatCd(String itemWahsNotiStatCd) {
        this.itemWahsNotiStatCd = itemWahsNotiStatCd == null ? null : itemWahsNotiStatCd.trim();
    }

    public String getCpNo() {
        return cpNo;
    }

    public void setCpNo(String cpNo) {
        this.cpNo = cpNo == null ? null : cpNo.trim();
    }

    public String getPsnlInfoHndlPcyAgrYn() {
        return psnlInfoHndlPcyAgrYn;
    }

    public void setPsnlInfoHndlPcyAgrYn(String psnlInfoHndlPcyAgrYn) {
        this.psnlInfoHndlPcyAgrYn = psnlInfoHndlPcyAgrYn == null ? null : psnlInfoHndlPcyAgrYn.trim();
    }

    public Date getNotiReqDt() {
        return notiReqDt;
    }

    public void setNotiReqDt(Date notiReqDt) {
        this.notiReqDt = notiReqDt;
    }

    public String getNotiPerdStYmd() {
        return notiPerdStYmd;
    }

    public void setNotiPerdStYmd(String notiPerdStYmd) {
        this.notiPerdStYmd = notiPerdStYmd == null ? null : notiPerdStYmd.trim();
    }

    public String getNotiPerdEdYmd() {
        return notiPerdEdYmd;
    }

    public void setNotiPerdEdYmd(String notiPerdEdYmd) {
        this.notiPerdEdYmd = notiPerdEdYmd == null ? null : notiPerdEdYmd.trim();
    }

    public Date getNotiSndDt() {
        return notiSndDt;
    }

    public void setNotiSndDt(Date notiSndDt) {
        this.notiSndDt = notiSndDt;
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
        sb.append(", itemWahsNotiId=").append(itemWahsNotiId);
        sb.append(", itemId=").append(itemId);
        sb.append(", itemOptId=").append(itemOptId);
        sb.append(", mbrId=").append(mbrId);
        sb.append(", itemWahsNotiStatCd=").append(itemWahsNotiStatCd);
        sb.append(", cpNo=").append(cpNo);
        sb.append(", psnlInfoHndlPcyAgrYn=").append(psnlInfoHndlPcyAgrYn);
        sb.append(", notiReqDt=").append(notiReqDt);
        sb.append(", notiPerdStYmd=").append(notiPerdStYmd);
        sb.append(", notiPerdEdYmd=").append(notiPerdEdYmd);
        sb.append(", notiSndDt=").append(notiSndDt);
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
        ItemWahsNotiEntity other = (ItemWahsNotiEntity) that;
        return (this.getItemWahsNotiId() == null ? other.getItemWahsNotiId() == null : this.getItemWahsNotiId().equals(other.getItemWahsNotiId()))
            && (this.getItemId() == null ? other.getItemId() == null : this.getItemId().equals(other.getItemId()))
            && (this.getItemOptId() == null ? other.getItemOptId() == null : this.getItemOptId().equals(other.getItemOptId()))
            && (this.getMbrId() == null ? other.getMbrId() == null : this.getMbrId().equals(other.getMbrId()))
            && (this.getItemWahsNotiStatCd() == null ? other.getItemWahsNotiStatCd() == null : this.getItemWahsNotiStatCd().equals(other.getItemWahsNotiStatCd()))
            && (this.getCpNo() == null ? other.getCpNo() == null : this.getCpNo().equals(other.getCpNo()))
            && (this.getPsnlInfoHndlPcyAgrYn() == null ? other.getPsnlInfoHndlPcyAgrYn() == null : this.getPsnlInfoHndlPcyAgrYn().equals(other.getPsnlInfoHndlPcyAgrYn()))
            && (this.getNotiReqDt() == null ? other.getNotiReqDt() == null : this.getNotiReqDt().equals(other.getNotiReqDt()))
            && (this.getNotiPerdStYmd() == null ? other.getNotiPerdStYmd() == null : this.getNotiPerdStYmd().equals(other.getNotiPerdStYmd()))
            && (this.getNotiPerdEdYmd() == null ? other.getNotiPerdEdYmd() == null : this.getNotiPerdEdYmd().equals(other.getNotiPerdEdYmd()))
            && (this.getNotiSndDt() == null ? other.getNotiSndDt() == null : this.getNotiSndDt().equals(other.getNotiSndDt()))
            && (this.getRegDt() == null ? other.getRegDt() == null : this.getRegDt().equals(other.getRegDt()))
            && (this.getRegId() == null ? other.getRegId() == null : this.getRegId().equals(other.getRegId()))
            && (this.getUseYn() == null ? other.getUseYn() == null : this.getUseYn().equals(other.getUseYn()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getItemWahsNotiId() == null) ? 0 : getItemWahsNotiId().hashCode());
        result = prime * result + ((getItemId() == null) ? 0 : getItemId().hashCode());
        result = prime * result + ((getItemOptId() == null) ? 0 : getItemOptId().hashCode());
        result = prime * result + ((getMbrId() == null) ? 0 : getMbrId().hashCode());
        result = prime * result + ((getItemWahsNotiStatCd() == null) ? 0 : getItemWahsNotiStatCd().hashCode());
        result = prime * result + ((getCpNo() == null) ? 0 : getCpNo().hashCode());
        result = prime * result + ((getPsnlInfoHndlPcyAgrYn() == null) ? 0 : getPsnlInfoHndlPcyAgrYn().hashCode());
        result = prime * result + ((getNotiReqDt() == null) ? 0 : getNotiReqDt().hashCode());
        result = prime * result + ((getNotiPerdStYmd() == null) ? 0 : getNotiPerdStYmd().hashCode());
        result = prime * result + ((getNotiPerdEdYmd() == null) ? 0 : getNotiPerdEdYmd().hashCode());
        result = prime * result + ((getNotiSndDt() == null) ? 0 : getNotiSndDt().hashCode());
        result = prime * result + ((getRegDt() == null) ? 0 : getRegDt().hashCode());
        result = prime * result + ((getRegId() == null) ? 0 : getRegId().hashCode());
        result = prime * result + ((getUseYn() == null) ? 0 : getUseYn().hashCode());
        return result;
    }
}