package com.mushbird.sinsege.base.module.order.model.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.mushbird.sinsege.base.model.BaseEntity;
import java.io.Serializable;
import java.util.Date;

public abstract class OrderCouponItemMappingEntity extends BaseEntity implements Serializable {
    private Integer ordCpnItemMapId;

    private Integer ordCpnId;

    private Integer ordItemId;

    private Integer ordClmId;

    private String ordCpnAplyCd;

    private Integer fstCpnDcAmt;

    private Integer cpnDcAmt;

    private Integer cpnRtnAmt;

    @JsonIgnore
    private Date regDt;

    @JsonIgnore
    private String regId;

    @JsonIgnore
    private Date modDt;

    @JsonIgnore
    private String modId;

    private static final long serialVersionUID = com.mushbird.sinsege.base.constant.AppConst.UID;

    public Integer getOrdCpnItemMapId() {
        return ordCpnItemMapId;
    }

    public void setOrdCpnItemMapId(Integer ordCpnItemMapId) {
        this.ordCpnItemMapId = ordCpnItemMapId;
    }

    public Integer getOrdCpnId() {
        return ordCpnId;
    }

    public void setOrdCpnId(Integer ordCpnId) {
        this.ordCpnId = ordCpnId;
    }

    public Integer getOrdItemId() {
        return ordItemId;
    }

    public void setOrdItemId(Integer ordItemId) {
        this.ordItemId = ordItemId;
    }

    public Integer getOrdClmId() {
        return ordClmId;
    }

    public void setOrdClmId(Integer ordClmId) {
        this.ordClmId = ordClmId;
    }

    public String getOrdCpnAplyCd() {
        return ordCpnAplyCd;
    }

    public void setOrdCpnAplyCd(String ordCpnAplyCd) {
        this.ordCpnAplyCd = ordCpnAplyCd == null ? null : ordCpnAplyCd.trim();
    }

    public Integer getFstCpnDcAmt() {
        return fstCpnDcAmt;
    }

    public void setFstCpnDcAmt(Integer fstCpnDcAmt) {
        this.fstCpnDcAmt = fstCpnDcAmt;
    }

    public Integer getCpnDcAmt() {
        return cpnDcAmt;
    }

    public void setCpnDcAmt(Integer cpnDcAmt) {
        this.cpnDcAmt = cpnDcAmt;
    }

    public Integer getCpnRtnAmt() {
        return cpnRtnAmt;
    }

    public void setCpnRtnAmt(Integer cpnRtnAmt) {
        this.cpnRtnAmt = cpnRtnAmt;
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
        sb.append(", ordCpnItemMapId=").append(ordCpnItemMapId);
        sb.append(", ordCpnId=").append(ordCpnId);
        sb.append(", ordItemId=").append(ordItemId);
        sb.append(", ordClmId=").append(ordClmId);
        sb.append(", ordCpnAplyCd=").append(ordCpnAplyCd);
        sb.append(", fstCpnDcAmt=").append(fstCpnDcAmt);
        sb.append(", cpnDcAmt=").append(cpnDcAmt);
        sb.append(", cpnRtnAmt=").append(cpnRtnAmt);
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
        OrderCouponItemMappingEntity other = (OrderCouponItemMappingEntity) that;
        return (this.getOrdCpnItemMapId() == null ? other.getOrdCpnItemMapId() == null : this.getOrdCpnItemMapId().equals(other.getOrdCpnItemMapId()))
            && (this.getOrdCpnId() == null ? other.getOrdCpnId() == null : this.getOrdCpnId().equals(other.getOrdCpnId()))
            && (this.getOrdItemId() == null ? other.getOrdItemId() == null : this.getOrdItemId().equals(other.getOrdItemId()))
            && (this.getOrdClmId() == null ? other.getOrdClmId() == null : this.getOrdClmId().equals(other.getOrdClmId()))
            && (this.getOrdCpnAplyCd() == null ? other.getOrdCpnAplyCd() == null : this.getOrdCpnAplyCd().equals(other.getOrdCpnAplyCd()))
            && (this.getFstCpnDcAmt() == null ? other.getFstCpnDcAmt() == null : this.getFstCpnDcAmt().equals(other.getFstCpnDcAmt()))
            && (this.getCpnDcAmt() == null ? other.getCpnDcAmt() == null : this.getCpnDcAmt().equals(other.getCpnDcAmt()))
            && (this.getCpnRtnAmt() == null ? other.getCpnRtnAmt() == null : this.getCpnRtnAmt().equals(other.getCpnRtnAmt()))
            && (this.getRegDt() == null ? other.getRegDt() == null : this.getRegDt().equals(other.getRegDt()))
            && (this.getRegId() == null ? other.getRegId() == null : this.getRegId().equals(other.getRegId()))
            && (this.getModDt() == null ? other.getModDt() == null : this.getModDt().equals(other.getModDt()))
            && (this.getModId() == null ? other.getModId() == null : this.getModId().equals(other.getModId()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getOrdCpnItemMapId() == null) ? 0 : getOrdCpnItemMapId().hashCode());
        result = prime * result + ((getOrdCpnId() == null) ? 0 : getOrdCpnId().hashCode());
        result = prime * result + ((getOrdItemId() == null) ? 0 : getOrdItemId().hashCode());
        result = prime * result + ((getOrdClmId() == null) ? 0 : getOrdClmId().hashCode());
        result = prime * result + ((getOrdCpnAplyCd() == null) ? 0 : getOrdCpnAplyCd().hashCode());
        result = prime * result + ((getFstCpnDcAmt() == null) ? 0 : getFstCpnDcAmt().hashCode());
        result = prime * result + ((getCpnDcAmt() == null) ? 0 : getCpnDcAmt().hashCode());
        result = prime * result + ((getCpnRtnAmt() == null) ? 0 : getCpnRtnAmt().hashCode());
        result = prime * result + ((getRegDt() == null) ? 0 : getRegDt().hashCode());
        result = prime * result + ((getRegId() == null) ? 0 : getRegId().hashCode());
        result = prime * result + ((getModDt() == null) ? 0 : getModDt().hashCode());
        result = prime * result + ((getModId() == null) ? 0 : getModId().hashCode());
        return result;
    }
}