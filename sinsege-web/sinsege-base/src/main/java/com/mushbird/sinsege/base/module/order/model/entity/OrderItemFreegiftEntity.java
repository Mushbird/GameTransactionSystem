package com.mushbird.sinsege.base.module.order.model.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.mushbird.sinsege.base.model.BaseEntity;
import java.io.Serializable;
import java.util.Date;

public abstract class OrderItemFreegiftEntity extends BaseEntity implements Serializable {
    private Integer ordItemFrgtId;

    private Integer ordItemId;

    private Integer itemFrgtId;

    private String ssgCd;

    private String frgtNm;

    private String ordCfmSndYn;

    @JsonIgnore
    private Date regDt;

    @JsonIgnore
    private String regId;

    @JsonIgnore
    private Date modDt;

    @JsonIgnore
    private String modId;

    private static final long serialVersionUID = com.mushbird.sinsege.base.constant.AppConst.UID;

    public Integer getOrdItemFrgtId() {
        return ordItemFrgtId;
    }

    public void setOrdItemFrgtId(Integer ordItemFrgtId) {
        this.ordItemFrgtId = ordItemFrgtId;
    }

    public Integer getOrdItemId() {
        return ordItemId;
    }

    public void setOrdItemId(Integer ordItemId) {
        this.ordItemId = ordItemId;
    }

    public Integer getItemFrgtId() {
        return itemFrgtId;
    }

    public void setItemFrgtId(Integer itemFrgtId) {
        this.itemFrgtId = itemFrgtId;
    }

    public String getSsgCd() {
        return ssgCd;
    }

    public void setSsgCd(String ssgCd) {
        this.ssgCd = ssgCd == null ? null : ssgCd.trim();
    }

    public String getFrgtNm() {
        return frgtNm;
    }

    public void setFrgtNm(String frgtNm) {
        this.frgtNm = frgtNm == null ? null : frgtNm.trim();
    }

    public String getOrdCfmSndYn() {
        return ordCfmSndYn;
    }

    public void setOrdCfmSndYn(String ordCfmSndYn) {
        this.ordCfmSndYn = ordCfmSndYn == null ? null : ordCfmSndYn.trim();
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
        sb.append(", ordItemFrgtId=").append(ordItemFrgtId);
        sb.append(", ordItemId=").append(ordItemId);
        sb.append(", itemFrgtId=").append(itemFrgtId);
        sb.append(", ssgCd=").append(ssgCd);
        sb.append(", frgtNm=").append(frgtNm);
        sb.append(", ordCfmSndYn=").append(ordCfmSndYn);
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
        OrderItemFreegiftEntity other = (OrderItemFreegiftEntity) that;
        return (this.getOrdItemFrgtId() == null ? other.getOrdItemFrgtId() == null : this.getOrdItemFrgtId().equals(other.getOrdItemFrgtId()))
            && (this.getOrdItemId() == null ? other.getOrdItemId() == null : this.getOrdItemId().equals(other.getOrdItemId()))
            && (this.getItemFrgtId() == null ? other.getItemFrgtId() == null : this.getItemFrgtId().equals(other.getItemFrgtId()))
            && (this.getSsgCd() == null ? other.getSsgCd() == null : this.getSsgCd().equals(other.getSsgCd()))
            && (this.getFrgtNm() == null ? other.getFrgtNm() == null : this.getFrgtNm().equals(other.getFrgtNm()))
            && (this.getOrdCfmSndYn() == null ? other.getOrdCfmSndYn() == null : this.getOrdCfmSndYn().equals(other.getOrdCfmSndYn()))
            && (this.getRegDt() == null ? other.getRegDt() == null : this.getRegDt().equals(other.getRegDt()))
            && (this.getRegId() == null ? other.getRegId() == null : this.getRegId().equals(other.getRegId()))
            && (this.getModDt() == null ? other.getModDt() == null : this.getModDt().equals(other.getModDt()))
            && (this.getModId() == null ? other.getModId() == null : this.getModId().equals(other.getModId()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getOrdItemFrgtId() == null) ? 0 : getOrdItemFrgtId().hashCode());
        result = prime * result + ((getOrdItemId() == null) ? 0 : getOrdItemId().hashCode());
        result = prime * result + ((getItemFrgtId() == null) ? 0 : getItemFrgtId().hashCode());
        result = prime * result + ((getSsgCd() == null) ? 0 : getSsgCd().hashCode());
        result = prime * result + ((getFrgtNm() == null) ? 0 : getFrgtNm().hashCode());
        result = prime * result + ((getOrdCfmSndYn() == null) ? 0 : getOrdCfmSndYn().hashCode());
        result = prime * result + ((getRegDt() == null) ? 0 : getRegDt().hashCode());
        result = prime * result + ((getRegId() == null) ? 0 : getRegId().hashCode());
        result = prime * result + ((getModDt() == null) ? 0 : getModDt().hashCode());
        result = prime * result + ((getModId() == null) ? 0 : getModId().hashCode());
        return result;
    }
}