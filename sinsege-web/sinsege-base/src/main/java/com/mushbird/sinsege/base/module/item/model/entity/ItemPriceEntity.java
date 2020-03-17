package com.mushbird.sinsege.base.module.item.model.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.mushbird.sinsege.base.model.BaseEntity;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public abstract class ItemPriceEntity extends BaseEntity implements Serializable {
    private Integer itemPrcId;

    private Integer itemId;

    private Integer itemSetId;

    private Integer dpChId;

    private String itemPrcTpCd;

    private Integer splyUprc;

    private Integer splyPrc;

    private Integer sellPrc;

    private BigDecimal dcRate;

    private BigDecimal comsRate;

    private Integer comsAmt;

    private String aplyYn;

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

    public Integer getItemPrcId() {
        return itemPrcId;
    }

    public void setItemPrcId(Integer itemPrcId) {
        this.itemPrcId = itemPrcId;
    }

    public Integer getItemId() {
        return itemId;
    }

    public void setItemId(Integer itemId) {
        this.itemId = itemId;
    }

    public Integer getItemSetId() {
        return itemSetId;
    }

    public void setItemSetId(Integer itemSetId) {
        this.itemSetId = itemSetId;
    }

    public Integer getDpChId() {
        return dpChId;
    }

    public void setDpChId(Integer dpChId) {
        this.dpChId = dpChId;
    }

    public String getItemPrcTpCd() {
        return itemPrcTpCd;
    }

    public void setItemPrcTpCd(String itemPrcTpCd) {
        this.itemPrcTpCd = itemPrcTpCd == null ? null : itemPrcTpCd.trim();
    }

    public Integer getSplyUprc() {
        return splyUprc;
    }

    public void setSplyUprc(Integer splyUprc) {
        this.splyUprc = splyUprc;
    }

    public Integer getSplyPrc() {
        return splyPrc;
    }

    public void setSplyPrc(Integer splyPrc) {
        this.splyPrc = splyPrc;
    }

    public Integer getSellPrc() {
        return sellPrc;
    }

    public void setSellPrc(Integer sellPrc) {
        this.sellPrc = sellPrc;
    }

    public BigDecimal getDcRate() {
        return dcRate;
    }

    public void setDcRate(BigDecimal dcRate) {
        this.dcRate = dcRate;
    }

    public BigDecimal getComsRate() {
        return comsRate;
    }

    public void setComsRate(BigDecimal comsRate) {
        this.comsRate = comsRate;
    }

    public Integer getComsAmt() {
        return comsAmt;
    }

    public void setComsAmt(Integer comsAmt) {
        this.comsAmt = comsAmt;
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
        sb.append(", itemPrcId=").append(itemPrcId);
        sb.append(", itemId=").append(itemId);
        sb.append(", itemSetId=").append(itemSetId);
        sb.append(", dpChId=").append(dpChId);
        sb.append(", itemPrcTpCd=").append(itemPrcTpCd);
        sb.append(", splyUprc=").append(splyUprc);
        sb.append(", splyPrc=").append(splyPrc);
        sb.append(", sellPrc=").append(sellPrc);
        sb.append(", dcRate=").append(dcRate);
        sb.append(", comsRate=").append(comsRate);
        sb.append(", comsAmt=").append(comsAmt);
        sb.append(", aplyYn=").append(aplyYn);
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
        ItemPriceEntity other = (ItemPriceEntity) that;
        return (this.getItemPrcId() == null ? other.getItemPrcId() == null : this.getItemPrcId().equals(other.getItemPrcId()))
            && (this.getItemId() == null ? other.getItemId() == null : this.getItemId().equals(other.getItemId()))
            && (this.getItemSetId() == null ? other.getItemSetId() == null : this.getItemSetId().equals(other.getItemSetId()))
            && (this.getDpChId() == null ? other.getDpChId() == null : this.getDpChId().equals(other.getDpChId()))
            && (this.getItemPrcTpCd() == null ? other.getItemPrcTpCd() == null : this.getItemPrcTpCd().equals(other.getItemPrcTpCd()))
            && (this.getSplyUprc() == null ? other.getSplyUprc() == null : this.getSplyUprc().equals(other.getSplyUprc()))
            && (this.getSplyPrc() == null ? other.getSplyPrc() == null : this.getSplyPrc().equals(other.getSplyPrc()))
            && (this.getSellPrc() == null ? other.getSellPrc() == null : this.getSellPrc().equals(other.getSellPrc()))
            && (this.getDcRate() == null ? other.getDcRate() == null : this.getDcRate().equals(other.getDcRate()))
            && (this.getComsRate() == null ? other.getComsRate() == null : this.getComsRate().equals(other.getComsRate()))
            && (this.getComsAmt() == null ? other.getComsAmt() == null : this.getComsAmt().equals(other.getComsAmt()))
            && (this.getAplyYn() == null ? other.getAplyYn() == null : this.getAplyYn().equals(other.getAplyYn()))
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
        result = prime * result + ((getItemPrcId() == null) ? 0 : getItemPrcId().hashCode());
        result = prime * result + ((getItemId() == null) ? 0 : getItemId().hashCode());
        result = prime * result + ((getItemSetId() == null) ? 0 : getItemSetId().hashCode());
        result = prime * result + ((getDpChId() == null) ? 0 : getDpChId().hashCode());
        result = prime * result + ((getItemPrcTpCd() == null) ? 0 : getItemPrcTpCd().hashCode());
        result = prime * result + ((getSplyUprc() == null) ? 0 : getSplyUprc().hashCode());
        result = prime * result + ((getSplyPrc() == null) ? 0 : getSplyPrc().hashCode());
        result = prime * result + ((getSellPrc() == null) ? 0 : getSellPrc().hashCode());
        result = prime * result + ((getDcRate() == null) ? 0 : getDcRate().hashCode());
        result = prime * result + ((getComsRate() == null) ? 0 : getComsRate().hashCode());
        result = prime * result + ((getComsAmt() == null) ? 0 : getComsAmt().hashCode());
        result = prime * result + ((getAplyYn() == null) ? 0 : getAplyYn().hashCode());
        result = prime * result + ((getRegDt() == null) ? 0 : getRegDt().hashCode());
        result = prime * result + ((getRegId() == null) ? 0 : getRegId().hashCode());
        result = prime * result + ((getModDt() == null) ? 0 : getModDt().hashCode());
        result = prime * result + ((getModId() == null) ? 0 : getModId().hashCode());
        result = prime * result + ((getUseYn() == null) ? 0 : getUseYn().hashCode());
        return result;
    }
}