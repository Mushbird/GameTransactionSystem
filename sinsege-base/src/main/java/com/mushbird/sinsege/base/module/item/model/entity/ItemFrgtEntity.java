package com.mushbird.sinsege.base.module.item.model.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.mushbird.sinsege.base.model.BaseEntity;
import java.io.Serializable;
import java.util.Date;

public abstract class ItemFrgtEntity extends BaseEntity implements Serializable {
    private Integer itemFrgtId;

    private Integer venId;

    private String frgtTpCd;

    private String itemNm;

    private Integer stkQty;

    private Integer atchGid;

    private Date regDt;

    @JsonIgnore
    private String regId;

    private Date modDt;

    private String modId;

    private String useYn;

    private static final long serialVersionUID = com.mushbird.sinsege.base.constant.AppConst.UID;

    public Integer getItemFrgtId() {
        return itemFrgtId;
    }

    public void setItemFrgtId(Integer itemFrgtId) {
        this.itemFrgtId = itemFrgtId;
    }

    public Integer getVenId() {
        return venId;
    }

    public void setVenId(Integer venId) {
        this.venId = venId;
    }

    public String getFrgtTpCd() {
        return frgtTpCd;
    }

    public void setFrgtTpCd(String frgtTpCd) {
        this.frgtTpCd = frgtTpCd == null ? null : frgtTpCd.trim();
    }

    public String getItemNm() {
        return itemNm;
    }

    public void setItemNm(String itemNm) {
        this.itemNm = itemNm == null ? null : itemNm.trim();
    }

    public Integer getStkQty() {
        return stkQty;
    }

    public void setStkQty(Integer stkQty) {
        this.stkQty = stkQty;
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
        sb.append(", itemFrgtId=").append(itemFrgtId);
        sb.append(", venId=").append(venId);
        sb.append(", frgtTpCd=").append(frgtTpCd);
        sb.append(", itemNm=").append(itemNm);
        sb.append(", stkQty=").append(stkQty);
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
        ItemFrgtEntity other = (ItemFrgtEntity) that;
        return (this.getItemFrgtId() == null ? other.getItemFrgtId() == null : this.getItemFrgtId().equals(other.getItemFrgtId()))
            && (this.getVenId() == null ? other.getVenId() == null : this.getVenId().equals(other.getVenId()))
            && (this.getFrgtTpCd() == null ? other.getFrgtTpCd() == null : this.getFrgtTpCd().equals(other.getFrgtTpCd()))
            && (this.getItemNm() == null ? other.getItemNm() == null : this.getItemNm().equals(other.getItemNm()))
            && (this.getStkQty() == null ? other.getStkQty() == null : this.getStkQty().equals(other.getStkQty()))
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
        result = prime * result + ((getItemFrgtId() == null) ? 0 : getItemFrgtId().hashCode());
        result = prime * result + ((getVenId() == null) ? 0 : getVenId().hashCode());
        result = prime * result + ((getFrgtTpCd() == null) ? 0 : getFrgtTpCd().hashCode());
        result = prime * result + ((getItemNm() == null) ? 0 : getItemNm().hashCode());
        result = prime * result + ((getStkQty() == null) ? 0 : getStkQty().hashCode());
        result = prime * result + ((getAtchGid() == null) ? 0 : getAtchGid().hashCode());
        result = prime * result + ((getRegDt() == null) ? 0 : getRegDt().hashCode());
        result = prime * result + ((getRegId() == null) ? 0 : getRegId().hashCode());
        result = prime * result + ((getModDt() == null) ? 0 : getModDt().hashCode());
        result = prime * result + ((getModId() == null) ? 0 : getModId().hashCode());
        result = prime * result + ((getUseYn() == null) ? 0 : getUseYn().hashCode());
        return result;
    }
}