package com.mushbird.sinsege.base.module.order.model.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.mushbird.sinsege.base.model.BaseEntity;
import java.io.Serializable;
import java.util.Date;

public abstract class OrderClaimItemFreegiftEntity extends BaseEntity implements Serializable {
    private Integer ordClmItemFrgtId;

    private Integer ordClmItemId;

    private Integer ordItemFrgtId;

    @JsonIgnore
    private Date regDt;

    @JsonIgnore
    private String regId;

    private static final long serialVersionUID = com.mushbird.sinsege.base.constant.AppConst.UID;

    public Integer getOrdClmItemFrgtId() {
        return ordClmItemFrgtId;
    }

    public void setOrdClmItemFrgtId(Integer ordClmItemFrgtId) {
        this.ordClmItemFrgtId = ordClmItemFrgtId;
    }

    public Integer getOrdClmItemId() {
        return ordClmItemId;
    }

    public void setOrdClmItemId(Integer ordClmItemId) {
        this.ordClmItemId = ordClmItemId;
    }

    public Integer getOrdItemFrgtId() {
        return ordItemFrgtId;
    }

    public void setOrdItemFrgtId(Integer ordItemFrgtId) {
        this.ordItemFrgtId = ordItemFrgtId;
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
        sb.append(", ordClmItemFrgtId=").append(ordClmItemFrgtId);
        sb.append(", ordClmItemId=").append(ordClmItemId);
        sb.append(", ordItemFrgtId=").append(ordItemFrgtId);
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
        OrderClaimItemFreegiftEntity other = (OrderClaimItemFreegiftEntity) that;
        return (this.getOrdClmItemFrgtId() == null ? other.getOrdClmItemFrgtId() == null : this.getOrdClmItemFrgtId().equals(other.getOrdClmItemFrgtId()))
            && (this.getOrdClmItemId() == null ? other.getOrdClmItemId() == null : this.getOrdClmItemId().equals(other.getOrdClmItemId()))
            && (this.getOrdItemFrgtId() == null ? other.getOrdItemFrgtId() == null : this.getOrdItemFrgtId().equals(other.getOrdItemFrgtId()))
            && (this.getRegDt() == null ? other.getRegDt() == null : this.getRegDt().equals(other.getRegDt()))
            && (this.getRegId() == null ? other.getRegId() == null : this.getRegId().equals(other.getRegId()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getOrdClmItemFrgtId() == null) ? 0 : getOrdClmItemFrgtId().hashCode());
        result = prime * result + ((getOrdClmItemId() == null) ? 0 : getOrdClmItemId().hashCode());
        result = prime * result + ((getOrdItemFrgtId() == null) ? 0 : getOrdItemFrgtId().hashCode());
        result = prime * result + ((getRegDt() == null) ? 0 : getRegDt().hashCode());
        result = prime * result + ((getRegId() == null) ? 0 : getRegId().hashCode());
        return result;
    }
}