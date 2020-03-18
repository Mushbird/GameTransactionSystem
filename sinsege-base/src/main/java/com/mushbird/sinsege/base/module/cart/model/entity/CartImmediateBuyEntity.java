package com.mushbird.sinsege.base.module.cart.model.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.mushbird.sinsege.base.model.BaseEntity;
import java.io.Serializable;
import java.util.Date;

public abstract class CartImmediateBuyEntity extends BaseEntity implements Serializable {
    private Integer cartImmeBuyId;

    private String cartTpCd;

    private Integer dpChId;

    private Integer itemId;

    private Integer itemOptId;

    private Integer itemQty;

    private String mbrId;

    @JsonIgnore
    private Date regDt;

    @JsonIgnore
    private String regId;

    private static final long serialVersionUID = com.mushbird.sinsege.base.constant.AppConst.UID;

    public Integer getCartImmeBuyId() {
        return cartImmeBuyId;
    }

    public void setCartImmeBuyId(Integer cartImmeBuyId) {
        this.cartImmeBuyId = cartImmeBuyId;
    }

    public String getCartTpCd() {
        return cartTpCd;
    }

    public void setCartTpCd(String cartTpCd) {
        this.cartTpCd = cartTpCd == null ? null : cartTpCd.trim();
    }

    public Integer getDpChId() {
        return dpChId;
    }

    public void setDpChId(Integer dpChId) {
        this.dpChId = dpChId;
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

    public Integer getItemQty() {
        return itemQty;
    }

    public void setItemQty(Integer itemQty) {
        this.itemQty = itemQty;
    }

    public String getMbrId() {
        return mbrId;
    }

    public void setMbrId(String mbrId) {
        this.mbrId = mbrId == null ? null : mbrId.trim();
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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", cartImmeBuyId=").append(cartImmeBuyId);
        sb.append(", cartTpCd=").append(cartTpCd);
        sb.append(", dpChId=").append(dpChId);
        sb.append(", itemId=").append(itemId);
        sb.append(", itemOptId=").append(itemOptId);
        sb.append(", itemQty=").append(itemQty);
        sb.append(", mbrId=").append(mbrId);
        sb.append(", regDt=").append(regDt);
        sb.append(", regId=").append(regId);
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
        CartImmediateBuyEntity other = (CartImmediateBuyEntity) that;
        return (this.getCartImmeBuyId() == null ? other.getCartImmeBuyId() == null : this.getCartImmeBuyId().equals(other.getCartImmeBuyId()))
            && (this.getCartTpCd() == null ? other.getCartTpCd() == null : this.getCartTpCd().equals(other.getCartTpCd()))
            && (this.getDpChId() == null ? other.getDpChId() == null : this.getDpChId().equals(other.getDpChId()))
            && (this.getItemId() == null ? other.getItemId() == null : this.getItemId().equals(other.getItemId()))
            && (this.getItemOptId() == null ? other.getItemOptId() == null : this.getItemOptId().equals(other.getItemOptId()))
            && (this.getItemQty() == null ? other.getItemQty() == null : this.getItemQty().equals(other.getItemQty()))
            && (this.getMbrId() == null ? other.getMbrId() == null : this.getMbrId().equals(other.getMbrId()))
            && (this.getRegDt() == null ? other.getRegDt() == null : this.getRegDt().equals(other.getRegDt()))
            && (this.getRegId() == null ? other.getRegId() == null : this.getRegId().equals(other.getRegId()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getCartImmeBuyId() == null) ? 0 : getCartImmeBuyId().hashCode());
        result = prime * result + ((getCartTpCd() == null) ? 0 : getCartTpCd().hashCode());
        result = prime * result + ((getDpChId() == null) ? 0 : getDpChId().hashCode());
        result = prime * result + ((getItemId() == null) ? 0 : getItemId().hashCode());
        result = prime * result + ((getItemOptId() == null) ? 0 : getItemOptId().hashCode());
        result = prime * result + ((getItemQty() == null) ? 0 : getItemQty().hashCode());
        result = prime * result + ((getMbrId() == null) ? 0 : getMbrId().hashCode());
        result = prime * result + ((getRegDt() == null) ? 0 : getRegDt().hashCode());
        result = prime * result + ((getRegId() == null) ? 0 : getRegId().hashCode());
        return result;
    }
}