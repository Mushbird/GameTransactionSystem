package com.mushbird.sinsege.base.module.order.model.entity;

import com.mushbird.sinsege.base.model.BaseEntity;
import java.io.Serializable;
import java.util.Date;

public abstract class OrderHistoryEntity extends BaseEntity implements Serializable {
    private Integer ordHistId;

    private Integer ordId;

    private Integer ordItemId;

    private Integer ordClmItemId;

    private String mbrId;

    private String admId;

    private String ordHistTpCd;

    private String ordHistCd;

    private Date ordHistDt;

    private String ordHistIp;

    private String cont;

    private Date regDt;

    private String regId;

    private static final long serialVersionUID = com.mushbird.sinsege.base.constant.AppConst.UID;

    public Integer getOrdHistId() {
        return ordHistId;
    }

    public void setOrdHistId(Integer ordHistId) {
        this.ordHistId = ordHistId;
    }

    public Integer getOrdId() {
        return ordId;
    }

    public void setOrdId(Integer ordId) {
        this.ordId = ordId;
    }

    public Integer getOrdItemId() {
        return ordItemId;
    }

    public void setOrdItemId(Integer ordItemId) {
        this.ordItemId = ordItemId;
    }

    public Integer getOrdClmItemId() {
        return ordClmItemId;
    }

    public void setOrdClmItemId(Integer ordClmItemId) {
        this.ordClmItemId = ordClmItemId;
    }

    public String getMbrId() {
        return mbrId;
    }

    public void setMbrId(String mbrId) {
        this.mbrId = mbrId == null ? null : mbrId.trim();
    }

    public String getAdmId() {
        return admId;
    }

    public void setAdmId(String admId) {
        this.admId = admId == null ? null : admId.trim();
    }

    public String getOrdHistTpCd() {
        return ordHistTpCd;
    }

    public void setOrdHistTpCd(String ordHistTpCd) {
        this.ordHistTpCd = ordHistTpCd == null ? null : ordHistTpCd.trim();
    }

    public String getOrdHistCd() {
        return ordHistCd;
    }

    public void setOrdHistCd(String ordHistCd) {
        this.ordHistCd = ordHistCd == null ? null : ordHistCd.trim();
    }

    public Date getOrdHistDt() {
        return ordHistDt;
    }

    public void setOrdHistDt(Date ordHistDt) {
        this.ordHistDt = ordHistDt;
    }

    public String getOrdHistIp() {
        return ordHistIp;
    }

    public void setOrdHistIp(String ordHistIp) {
        this.ordHistIp = ordHistIp == null ? null : ordHistIp.trim();
    }

    public String getCont() {
        return cont;
    }

    public void setCont(String cont) {
        this.cont = cont == null ? null : cont.trim();
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
        sb.append(", ordHistId=").append(ordHistId);
        sb.append(", ordId=").append(ordId);
        sb.append(", ordItemId=").append(ordItemId);
        sb.append(", ordClmItemId=").append(ordClmItemId);
        sb.append(", mbrId=").append(mbrId);
        sb.append(", admId=").append(admId);
        sb.append(", ordHistTpCd=").append(ordHistTpCd);
        sb.append(", ordHistCd=").append(ordHistCd);
        sb.append(", ordHistDt=").append(ordHistDt);
        sb.append(", ordHistIp=").append(ordHistIp);
        sb.append(", cont=").append(cont);
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
        OrderHistoryEntity other = (OrderHistoryEntity) that;
        return (this.getOrdHistId() == null ? other.getOrdHistId() == null : this.getOrdHistId().equals(other.getOrdHistId()))
            && (this.getOrdId() == null ? other.getOrdId() == null : this.getOrdId().equals(other.getOrdId()))
            && (this.getOrdItemId() == null ? other.getOrdItemId() == null : this.getOrdItemId().equals(other.getOrdItemId()))
            && (this.getOrdClmItemId() == null ? other.getOrdClmItemId() == null : this.getOrdClmItemId().equals(other.getOrdClmItemId()))
            && (this.getMbrId() == null ? other.getMbrId() == null : this.getMbrId().equals(other.getMbrId()))
            && (this.getAdmId() == null ? other.getAdmId() == null : this.getAdmId().equals(other.getAdmId()))
            && (this.getOrdHistTpCd() == null ? other.getOrdHistTpCd() == null : this.getOrdHistTpCd().equals(other.getOrdHistTpCd()))
            && (this.getOrdHistCd() == null ? other.getOrdHistCd() == null : this.getOrdHistCd().equals(other.getOrdHistCd()))
            && (this.getOrdHistDt() == null ? other.getOrdHistDt() == null : this.getOrdHistDt().equals(other.getOrdHistDt()))
            && (this.getOrdHistIp() == null ? other.getOrdHistIp() == null : this.getOrdHistIp().equals(other.getOrdHistIp()))
            && (this.getCont() == null ? other.getCont() == null : this.getCont().equals(other.getCont()))
            && (this.getRegDt() == null ? other.getRegDt() == null : this.getRegDt().equals(other.getRegDt()))
            && (this.getRegId() == null ? other.getRegId() == null : this.getRegId().equals(other.getRegId()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getOrdHistId() == null) ? 0 : getOrdHistId().hashCode());
        result = prime * result + ((getOrdId() == null) ? 0 : getOrdId().hashCode());
        result = prime * result + ((getOrdItemId() == null) ? 0 : getOrdItemId().hashCode());
        result = prime * result + ((getOrdClmItemId() == null) ? 0 : getOrdClmItemId().hashCode());
        result = prime * result + ((getMbrId() == null) ? 0 : getMbrId().hashCode());
        result = prime * result + ((getAdmId() == null) ? 0 : getAdmId().hashCode());
        result = prime * result + ((getOrdHistTpCd() == null) ? 0 : getOrdHistTpCd().hashCode());
        result = prime * result + ((getOrdHistCd() == null) ? 0 : getOrdHistCd().hashCode());
        result = prime * result + ((getOrdHistDt() == null) ? 0 : getOrdHistDt().hashCode());
        result = prime * result + ((getOrdHistIp() == null) ? 0 : getOrdHistIp().hashCode());
        result = prime * result + ((getCont() == null) ? 0 : getCont().hashCode());
        result = prime * result + ((getRegDt() == null) ? 0 : getRegDt().hashCode());
        result = prime * result + ((getRegId() == null) ? 0 : getRegId().hashCode());
        return result;
    }
}