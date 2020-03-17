package com.mushbird.sinsege.base.module.item.model.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.mushbird.sinsege.base.model.BaseEntity;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public abstract class ItemEntity extends BaseEntity implements Serializable {
    private Integer itemId;

    private Integer venId;

    private String itemTpCd;

    private String itemStatCd;

    private String itemAprvStatCd;

    private String itemCd;

    private String itemNm;

    private String itemSubNm;

    private String manu;

    private Integer dpBrndId;

    private String itemCmtRegYn;

    private String inqRegYn;

    private String optSttYn;

    private String frgtYn;

    private String dpYn;

    private String dpEnvCd;

    private String cstmdYn;

    private String taxClCd;

    private Integer sellUnitQty;

    private String sellPerdLimYn;

    private Date sellPerdLimStDt;

    private Date sellPerdLimEdDt;

    private String cpnUsePsblYn;

    private String ptSaveTpCd;

    private String ptSaveMethCd;

    private BigDecimal ptSaveRate;

    private Integer ptSaveAmt;

    private Integer ordResMaxQty;

    private String wahsNotiYn;

    private String itemInfoNotiInptMethCd;

    private Date itemInfoNotiRegDt;

    private String memo;

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

    public Integer getItemId() {
        return itemId;
    }

    public void setItemId(Integer itemId) {
        this.itemId = itemId;
    }

    public Integer getVenId() {
        return venId;
    }

    public void setVenId(Integer venId) {
        this.venId = venId;
    }

    public String getItemTpCd() {
        return itemTpCd;
    }

    public void setItemTpCd(String itemTpCd) {
        this.itemTpCd = itemTpCd == null ? null : itemTpCd.trim();
    }

    public String getItemStatCd() {
        return itemStatCd;
    }

    public void setItemStatCd(String itemStatCd) {
        this.itemStatCd = itemStatCd == null ? null : itemStatCd.trim();
    }

    public String getItemAprvStatCd() {
        return itemAprvStatCd;
    }

    public void setItemAprvStatCd(String itemAprvStatCd) {
        this.itemAprvStatCd = itemAprvStatCd == null ? null : itemAprvStatCd.trim();
    }

    public String getItemCd() {
        return itemCd;
    }

    public void setItemCd(String itemCd) {
        this.itemCd = itemCd == null ? null : itemCd.trim();
    }

    public String getItemNm() {
        return itemNm;
    }

    public void setItemNm(String itemNm) {
        this.itemNm = itemNm == null ? null : itemNm.trim();
    }

    public String getItemSubNm() {
        return itemSubNm;
    }

    public void setItemSubNm(String itemSubNm) {
        this.itemSubNm = itemSubNm == null ? null : itemSubNm.trim();
    }

    public String getManu() {
        return manu;
    }

    public void setManu(String manu) {
        this.manu = manu == null ? null : manu.trim();
    }

    public Integer getDpBrndId() {
        return dpBrndId;
    }

    public void setDpBrndId(Integer dpBrndId) {
        this.dpBrndId = dpBrndId;
    }

    public String getItemCmtRegYn() {
        return itemCmtRegYn;
    }

    public void setItemCmtRegYn(String itemCmtRegYn) {
        this.itemCmtRegYn = itemCmtRegYn == null ? null : itemCmtRegYn.trim();
    }

    public String getInqRegYn() {
        return inqRegYn;
    }

    public void setInqRegYn(String inqRegYn) {
        this.inqRegYn = inqRegYn == null ? null : inqRegYn.trim();
    }

    public String getOptSttYn() {
        return optSttYn;
    }

    public void setOptSttYn(String optSttYn) {
        this.optSttYn = optSttYn == null ? null : optSttYn.trim();
    }

    public String getFrgtYn() {
        return frgtYn;
    }

    public void setFrgtYn(String frgtYn) {
        this.frgtYn = frgtYn == null ? null : frgtYn.trim();
    }

    public String getDpYn() {
        return dpYn;
    }

    public void setDpYn(String dpYn) {
        this.dpYn = dpYn == null ? null : dpYn.trim();
    }

    public String getDpEnvCd() {
        return dpEnvCd;
    }

    public void setDpEnvCd(String dpEnvCd) {
        this.dpEnvCd = dpEnvCd == null ? null : dpEnvCd.trim();
    }

    public String getCstmdYn() {
        return cstmdYn;
    }

    public void setCstmdYn(String cstmdYn) {
        this.cstmdYn = cstmdYn == null ? null : cstmdYn.trim();
    }

    public String getTaxClCd() {
        return taxClCd;
    }

    public void setTaxClCd(String taxClCd) {
        this.taxClCd = taxClCd == null ? null : taxClCd.trim();
    }

    public Integer getSellUnitQty() {
        return sellUnitQty;
    }

    public void setSellUnitQty(Integer sellUnitQty) {
        this.sellUnitQty = sellUnitQty;
    }

    public String getSellPerdLimYn() {
        return sellPerdLimYn;
    }

    public void setSellPerdLimYn(String sellPerdLimYn) {
        this.sellPerdLimYn = sellPerdLimYn == null ? null : sellPerdLimYn.trim();
    }

    public Date getSellPerdLimStDt() {
        return sellPerdLimStDt;
    }

    public void setSellPerdLimStDt(Date sellPerdLimStDt) {
        this.sellPerdLimStDt = sellPerdLimStDt;
    }

    public Date getSellPerdLimEdDt() {
        return sellPerdLimEdDt;
    }

    public void setSellPerdLimEdDt(Date sellPerdLimEdDt) {
        this.sellPerdLimEdDt = sellPerdLimEdDt;
    }

    public String getCpnUsePsblYn() {
        return cpnUsePsblYn;
    }

    public void setCpnUsePsblYn(String cpnUsePsblYn) {
        this.cpnUsePsblYn = cpnUsePsblYn == null ? null : cpnUsePsblYn.trim();
    }

    public String getPtSaveTpCd() {
        return ptSaveTpCd;
    }

    public void setPtSaveTpCd(String ptSaveTpCd) {
        this.ptSaveTpCd = ptSaveTpCd == null ? null : ptSaveTpCd.trim();
    }

    public String getPtSaveMethCd() {
        return ptSaveMethCd;
    }

    public void setPtSaveMethCd(String ptSaveMethCd) {
        this.ptSaveMethCd = ptSaveMethCd == null ? null : ptSaveMethCd.trim();
    }

    public BigDecimal getPtSaveRate() {
        return ptSaveRate;
    }

    public void setPtSaveRate(BigDecimal ptSaveRate) {
        this.ptSaveRate = ptSaveRate;
    }

    public Integer getPtSaveAmt() {
        return ptSaveAmt;
    }

    public void setPtSaveAmt(Integer ptSaveAmt) {
        this.ptSaveAmt = ptSaveAmt;
    }

    public Integer getOrdResMaxQty() {
        return ordResMaxQty;
    }

    public void setOrdResMaxQty(Integer ordResMaxQty) {
        this.ordResMaxQty = ordResMaxQty;
    }

    public String getWahsNotiYn() {
        return wahsNotiYn;
    }

    public void setWahsNotiYn(String wahsNotiYn) {
        this.wahsNotiYn = wahsNotiYn == null ? null : wahsNotiYn.trim();
    }

    public String getItemInfoNotiInptMethCd() {
        return itemInfoNotiInptMethCd;
    }

    public void setItemInfoNotiInptMethCd(String itemInfoNotiInptMethCd) {
        this.itemInfoNotiInptMethCd = itemInfoNotiInptMethCd == null ? null : itemInfoNotiInptMethCd.trim();
    }

    public Date getItemInfoNotiRegDt() {
        return itemInfoNotiRegDt;
    }

    public void setItemInfoNotiRegDt(Date itemInfoNotiRegDt) {
        this.itemInfoNotiRegDt = itemInfoNotiRegDt;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo == null ? null : memo.trim();
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
        sb.append(", itemId=").append(itemId);
        sb.append(", venId=").append(venId);
        sb.append(", itemTpCd=").append(itemTpCd);
        sb.append(", itemStatCd=").append(itemStatCd);
        sb.append(", itemAprvStatCd=").append(itemAprvStatCd);
        sb.append(", itemCd=").append(itemCd);
        sb.append(", itemNm=").append(itemNm);
        sb.append(", itemSubNm=").append(itemSubNm);
        sb.append(", manu=").append(manu);
        sb.append(", dpBrndId=").append(dpBrndId);
        sb.append(", itemCmtRegYn=").append(itemCmtRegYn);
        sb.append(", inqRegYn=").append(inqRegYn);
        sb.append(", optSttYn=").append(optSttYn);
        sb.append(", frgtYn=").append(frgtYn);
        sb.append(", dpYn=").append(dpYn);
        sb.append(", dpEnvCd=").append(dpEnvCd);
        sb.append(", cstmdYn=").append(cstmdYn);
        sb.append(", taxClCd=").append(taxClCd);
        sb.append(", sellUnitQty=").append(sellUnitQty);
        sb.append(", sellPerdLimYn=").append(sellPerdLimYn);
        sb.append(", sellPerdLimStDt=").append(sellPerdLimStDt);
        sb.append(", sellPerdLimEdDt=").append(sellPerdLimEdDt);
        sb.append(", cpnUsePsblYn=").append(cpnUsePsblYn);
        sb.append(", ptSaveTpCd=").append(ptSaveTpCd);
        sb.append(", ptSaveMethCd=").append(ptSaveMethCd);
        sb.append(", ptSaveRate=").append(ptSaveRate);
        sb.append(", ptSaveAmt=").append(ptSaveAmt);
        sb.append(", ordResMaxQty=").append(ordResMaxQty);
        sb.append(", wahsNotiYn=").append(wahsNotiYn);
        sb.append(", itemInfoNotiInptMethCd=").append(itemInfoNotiInptMethCd);
        sb.append(", itemInfoNotiRegDt=").append(itemInfoNotiRegDt);
        sb.append(", memo=").append(memo);
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
        ItemEntity other = (ItemEntity) that;
        return (this.getItemId() == null ? other.getItemId() == null : this.getItemId().equals(other.getItemId()))
            && (this.getVenId() == null ? other.getVenId() == null : this.getVenId().equals(other.getVenId()))
            && (this.getItemTpCd() == null ? other.getItemTpCd() == null : this.getItemTpCd().equals(other.getItemTpCd()))
            && (this.getItemStatCd() == null ? other.getItemStatCd() == null : this.getItemStatCd().equals(other.getItemStatCd()))
            && (this.getItemAprvStatCd() == null ? other.getItemAprvStatCd() == null : this.getItemAprvStatCd().equals(other.getItemAprvStatCd()))
            && (this.getItemCd() == null ? other.getItemCd() == null : this.getItemCd().equals(other.getItemCd()))
            && (this.getItemNm() == null ? other.getItemNm() == null : this.getItemNm().equals(other.getItemNm()))
            && (this.getItemSubNm() == null ? other.getItemSubNm() == null : this.getItemSubNm().equals(other.getItemSubNm()))
            && (this.getManu() == null ? other.getManu() == null : this.getManu().equals(other.getManu()))
            && (this.getDpBrndId() == null ? other.getDpBrndId() == null : this.getDpBrndId().equals(other.getDpBrndId()))
            && (this.getItemCmtRegYn() == null ? other.getItemCmtRegYn() == null : this.getItemCmtRegYn().equals(other.getItemCmtRegYn()))
            && (this.getInqRegYn() == null ? other.getInqRegYn() == null : this.getInqRegYn().equals(other.getInqRegYn()))
            && (this.getOptSttYn() == null ? other.getOptSttYn() == null : this.getOptSttYn().equals(other.getOptSttYn()))
            && (this.getFrgtYn() == null ? other.getFrgtYn() == null : this.getFrgtYn().equals(other.getFrgtYn()))
            && (this.getDpYn() == null ? other.getDpYn() == null : this.getDpYn().equals(other.getDpYn()))
            && (this.getDpEnvCd() == null ? other.getDpEnvCd() == null : this.getDpEnvCd().equals(other.getDpEnvCd()))
            && (this.getCstmdYn() == null ? other.getCstmdYn() == null : this.getCstmdYn().equals(other.getCstmdYn()))
            && (this.getTaxClCd() == null ? other.getTaxClCd() == null : this.getTaxClCd().equals(other.getTaxClCd()))
            && (this.getSellUnitQty() == null ? other.getSellUnitQty() == null : this.getSellUnitQty().equals(other.getSellUnitQty()))
            && (this.getSellPerdLimYn() == null ? other.getSellPerdLimYn() == null : this.getSellPerdLimYn().equals(other.getSellPerdLimYn()))
            && (this.getSellPerdLimStDt() == null ? other.getSellPerdLimStDt() == null : this.getSellPerdLimStDt().equals(other.getSellPerdLimStDt()))
            && (this.getSellPerdLimEdDt() == null ? other.getSellPerdLimEdDt() == null : this.getSellPerdLimEdDt().equals(other.getSellPerdLimEdDt()))
            && (this.getCpnUsePsblYn() == null ? other.getCpnUsePsblYn() == null : this.getCpnUsePsblYn().equals(other.getCpnUsePsblYn()))
            && (this.getPtSaveTpCd() == null ? other.getPtSaveTpCd() == null : this.getPtSaveTpCd().equals(other.getPtSaveTpCd()))
            && (this.getPtSaveMethCd() == null ? other.getPtSaveMethCd() == null : this.getPtSaveMethCd().equals(other.getPtSaveMethCd()))
            && (this.getPtSaveRate() == null ? other.getPtSaveRate() == null : this.getPtSaveRate().equals(other.getPtSaveRate()))
            && (this.getPtSaveAmt() == null ? other.getPtSaveAmt() == null : this.getPtSaveAmt().equals(other.getPtSaveAmt()))
            && (this.getOrdResMaxQty() == null ? other.getOrdResMaxQty() == null : this.getOrdResMaxQty().equals(other.getOrdResMaxQty()))
            && (this.getWahsNotiYn() == null ? other.getWahsNotiYn() == null : this.getWahsNotiYn().equals(other.getWahsNotiYn()))
            && (this.getItemInfoNotiInptMethCd() == null ? other.getItemInfoNotiInptMethCd() == null : this.getItemInfoNotiInptMethCd().equals(other.getItemInfoNotiInptMethCd()))
            && (this.getItemInfoNotiRegDt() == null ? other.getItemInfoNotiRegDt() == null : this.getItemInfoNotiRegDt().equals(other.getItemInfoNotiRegDt()))
            && (this.getMemo() == null ? other.getMemo() == null : this.getMemo().equals(other.getMemo()))
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
        result = prime * result + ((getItemId() == null) ? 0 : getItemId().hashCode());
        result = prime * result + ((getVenId() == null) ? 0 : getVenId().hashCode());
        result = prime * result + ((getItemTpCd() == null) ? 0 : getItemTpCd().hashCode());
        result = prime * result + ((getItemStatCd() == null) ? 0 : getItemStatCd().hashCode());
        result = prime * result + ((getItemAprvStatCd() == null) ? 0 : getItemAprvStatCd().hashCode());
        result = prime * result + ((getItemCd() == null) ? 0 : getItemCd().hashCode());
        result = prime * result + ((getItemNm() == null) ? 0 : getItemNm().hashCode());
        result = prime * result + ((getItemSubNm() == null) ? 0 : getItemSubNm().hashCode());
        result = prime * result + ((getManu() == null) ? 0 : getManu().hashCode());
        result = prime * result + ((getDpBrndId() == null) ? 0 : getDpBrndId().hashCode());
        result = prime * result + ((getItemCmtRegYn() == null) ? 0 : getItemCmtRegYn().hashCode());
        result = prime * result + ((getInqRegYn() == null) ? 0 : getInqRegYn().hashCode());
        result = prime * result + ((getOptSttYn() == null) ? 0 : getOptSttYn().hashCode());
        result = prime * result + ((getFrgtYn() == null) ? 0 : getFrgtYn().hashCode());
        result = prime * result + ((getDpYn() == null) ? 0 : getDpYn().hashCode());
        result = prime * result + ((getDpEnvCd() == null) ? 0 : getDpEnvCd().hashCode());
        result = prime * result + ((getCstmdYn() == null) ? 0 : getCstmdYn().hashCode());
        result = prime * result + ((getTaxClCd() == null) ? 0 : getTaxClCd().hashCode());
        result = prime * result + ((getSellUnitQty() == null) ? 0 : getSellUnitQty().hashCode());
        result = prime * result + ((getSellPerdLimYn() == null) ? 0 : getSellPerdLimYn().hashCode());
        result = prime * result + ((getSellPerdLimStDt() == null) ? 0 : getSellPerdLimStDt().hashCode());
        result = prime * result + ((getSellPerdLimEdDt() == null) ? 0 : getSellPerdLimEdDt().hashCode());
        result = prime * result + ((getCpnUsePsblYn() == null) ? 0 : getCpnUsePsblYn().hashCode());
        result = prime * result + ((getPtSaveTpCd() == null) ? 0 : getPtSaveTpCd().hashCode());
        result = prime * result + ((getPtSaveMethCd() == null) ? 0 : getPtSaveMethCd().hashCode());
        result = prime * result + ((getPtSaveRate() == null) ? 0 : getPtSaveRate().hashCode());
        result = prime * result + ((getPtSaveAmt() == null) ? 0 : getPtSaveAmt().hashCode());
        result = prime * result + ((getOrdResMaxQty() == null) ? 0 : getOrdResMaxQty().hashCode());
        result = prime * result + ((getWahsNotiYn() == null) ? 0 : getWahsNotiYn().hashCode());
        result = prime * result + ((getItemInfoNotiInptMethCd() == null) ? 0 : getItemInfoNotiInptMethCd().hashCode());
        result = prime * result + ((getItemInfoNotiRegDt() == null) ? 0 : getItemInfoNotiRegDt().hashCode());
        result = prime * result + ((getMemo() == null) ? 0 : getMemo().hashCode());
        result = prime * result + ((getRegDt() == null) ? 0 : getRegDt().hashCode());
        result = prime * result + ((getRegId() == null) ? 0 : getRegId().hashCode());
        result = prime * result + ((getModDt() == null) ? 0 : getModDt().hashCode());
        result = prime * result + ((getModId() == null) ? 0 : getModId().hashCode());
        result = prime * result + ((getUseYn() == null) ? 0 : getUseYn().hashCode());
        return result;
    }
}