package com.mushbird.sinsege.base.module.item.model.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.mushbird.sinsege.base.model.BaseEntity;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public abstract class ItemCommentEntity extends BaseEntity implements Serializable {
    private Integer itemCmtId;

    private Integer itemId;

    private String mbrId;

    private Integer ordItemId;

    private String itemCmtTpCd;

    private String tit;

    private String cont;

    private BigDecimal starPt;

    private String regEnvCd;

    private String dpYn;

    private Integer atchGid;

    private Date regDt;

    private String regId;

    @JsonIgnore
    private Date modDt;

    @JsonIgnore
    private String modId;

    @JsonIgnore
    private String useYn;

    private static final long serialVersionUID = com.mushbird.sinsege.base.constant.AppConst.UID;

    public Integer getItemCmtId() {
        return itemCmtId;
    }

    public void setItemCmtId(Integer itemCmtId) {
        this.itemCmtId = itemCmtId;
    }

    public Integer getItemId() {
        return itemId;
    }

    public void setItemId(Integer itemId) {
        this.itemId = itemId;
    }

    public String getMbrId() {
        return mbrId;
    }

    public void setMbrId(String mbrId) {
        this.mbrId = mbrId == null ? null : mbrId.trim();
    }

    public Integer getOrdItemId() {
        return ordItemId;
    }

    public void setOrdItemId(Integer ordItemId) {
        this.ordItemId = ordItemId;
    }

    public String getItemCmtTpCd() {
        return itemCmtTpCd;
    }

    public void setItemCmtTpCd(String itemCmtTpCd) {
        this.itemCmtTpCd = itemCmtTpCd == null ? null : itemCmtTpCd.trim();
    }

    public String getTit() {
        return tit;
    }

    public void setTit(String tit) {
        this.tit = tit == null ? null : tit.trim();
    }

    public String getCont() {
        return cont;
    }

    public void setCont(String cont) {
        this.cont = cont == null ? null : cont.trim();
    }

    public BigDecimal getStarPt() {
        return starPt;
    }

    public void setStarPt(BigDecimal starPt) {
        this.starPt = starPt;
    }

    public String getRegEnvCd() {
        return regEnvCd;
    }

    public void setRegEnvCd(String regEnvCd) {
        this.regEnvCd = regEnvCd == null ? null : regEnvCd.trim();
    }

    public String getDpYn() {
        return dpYn;
    }

    public void setDpYn(String dpYn) {
        this.dpYn = dpYn == null ? null : dpYn.trim();
    }

    public Integer getAtchGid() {
        return atchGid;
    }

    public void setAtchGid(Integer atchGid) {
        this.atchGid = atchGid;
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
        sb.append(", itemCmtId=").append(itemCmtId);
        sb.append(", itemId=").append(itemId);
        sb.append(", mbrId=").append(mbrId);
        sb.append(", ordItemId=").append(ordItemId);
        sb.append(", itemCmtTpCd=").append(itemCmtTpCd);
        sb.append(", tit=").append(tit);
        sb.append(", cont=").append(cont);
        sb.append(", starPt=").append(starPt);
        sb.append(", regEnvCd=").append(regEnvCd);
        sb.append(", dpYn=").append(dpYn);
        sb.append(", atchGid=").append(atchGid);
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
        ItemCommentEntity other = (ItemCommentEntity) that;
        return (this.getItemCmtId() == null ? other.getItemCmtId() == null : this.getItemCmtId().equals(other.getItemCmtId()))
            && (this.getItemId() == null ? other.getItemId() == null : this.getItemId().equals(other.getItemId()))
            && (this.getMbrId() == null ? other.getMbrId() == null : this.getMbrId().equals(other.getMbrId()))
            && (this.getOrdItemId() == null ? other.getOrdItemId() == null : this.getOrdItemId().equals(other.getOrdItemId()))
            && (this.getItemCmtTpCd() == null ? other.getItemCmtTpCd() == null : this.getItemCmtTpCd().equals(other.getItemCmtTpCd()))
            && (this.getTit() == null ? other.getTit() == null : this.getTit().equals(other.getTit()))
            && (this.getCont() == null ? other.getCont() == null : this.getCont().equals(other.getCont()))
            && (this.getStarPt() == null ? other.getStarPt() == null : this.getStarPt().equals(other.getStarPt()))
            && (this.getRegEnvCd() == null ? other.getRegEnvCd() == null : this.getRegEnvCd().equals(other.getRegEnvCd()))
            && (this.getDpYn() == null ? other.getDpYn() == null : this.getDpYn().equals(other.getDpYn()))
            && (this.getAtchGid() == null ? other.getAtchGid() == null : this.getAtchGid().equals(other.getAtchGid()))
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
        result = prime * result + ((getItemCmtId() == null) ? 0 : getItemCmtId().hashCode());
        result = prime * result + ((getItemId() == null) ? 0 : getItemId().hashCode());
        result = prime * result + ((getMbrId() == null) ? 0 : getMbrId().hashCode());
        result = prime * result + ((getOrdItemId() == null) ? 0 : getOrdItemId().hashCode());
        result = prime * result + ((getItemCmtTpCd() == null) ? 0 : getItemCmtTpCd().hashCode());
        result = prime * result + ((getTit() == null) ? 0 : getTit().hashCode());
        result = prime * result + ((getCont() == null) ? 0 : getCont().hashCode());
        result = prime * result + ((getStarPt() == null) ? 0 : getStarPt().hashCode());
        result = prime * result + ((getRegEnvCd() == null) ? 0 : getRegEnvCd().hashCode());
        result = prime * result + ((getDpYn() == null) ? 0 : getDpYn().hashCode());
        result = prime * result + ((getAtchGid() == null) ? 0 : getAtchGid().hashCode());
        result = prime * result + ((getRegDt() == null) ? 0 : getRegDt().hashCode());
        result = prime * result + ((getRegId() == null) ? 0 : getRegId().hashCode());
        result = prime * result + ((getModDt() == null) ? 0 : getModDt().hashCode());
        result = prime * result + ((getModId() == null) ? 0 : getModId().hashCode());
        result = prime * result + ((getUseYn() == null) ? 0 : getUseYn().hashCode());
        return result;
    }
}