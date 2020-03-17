package com.mushbird.sinsege.base.module.item.model.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.mushbird.sinsege.base.model.BaseEntity;
import java.io.Serializable;
import java.util.Date;

public abstract class ItemAprvHistEntity extends BaseEntity implements Serializable {
    private Integer itemAprvHistId;

    private Integer itemId;

    private String aprvReqCd;

    private String aprvStatCd;

    private Date aprvReqDt;

    private Date aprvProcDt;

    private String aprvAdmId;

    private String rtnRsn;

    @JsonIgnore
    private Date regDt;

    @JsonIgnore
    private String regId;

    private Date modDt;

    private String modId;

    private static final long serialVersionUID = com.mushbird.sinsege.base.constant.AppConst.UID;

    public Integer getItemAprvHistId() {
        return itemAprvHistId;
    }

    public void setItemAprvHistId(Integer itemAprvHistId) {
        this.itemAprvHistId = itemAprvHistId;
    }

    public Integer getItemId() {
        return itemId;
    }

    public void setItemId(Integer itemId) {
        this.itemId = itemId;
    }

    public String getAprvReqCd() {
        return aprvReqCd;
    }

    public void setAprvReqCd(String aprvReqCd) {
        this.aprvReqCd = aprvReqCd == null ? null : aprvReqCd.trim();
    }

    public String getAprvStatCd() {
        return aprvStatCd;
    }

    public void setAprvStatCd(String aprvStatCd) {
        this.aprvStatCd = aprvStatCd == null ? null : aprvStatCd.trim();
    }

    public Date getAprvReqDt() {
        return aprvReqDt;
    }

    public void setAprvReqDt(Date aprvReqDt) {
        this.aprvReqDt = aprvReqDt;
    }

    public Date getAprvProcDt() {
        return aprvProcDt;
    }

    public void setAprvProcDt(Date aprvProcDt) {
        this.aprvProcDt = aprvProcDt;
    }

    public String getAprvAdmId() {
        return aprvAdmId;
    }

    public void setAprvAdmId(String aprvAdmId) {
        this.aprvAdmId = aprvAdmId == null ? null : aprvAdmId.trim();
    }

    public String getRtnRsn() {
        return rtnRsn;
    }

    public void setRtnRsn(String rtnRsn) {
        this.rtnRsn = rtnRsn == null ? null : rtnRsn.trim();
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
        sb.append(", itemAprvHistId=").append(itemAprvHistId);
        sb.append(", itemId=").append(itemId);
        sb.append(", aprvReqCd=").append(aprvReqCd);
        sb.append(", aprvStatCd=").append(aprvStatCd);
        sb.append(", aprvReqDt=").append(aprvReqDt);
        sb.append(", aprvProcDt=").append(aprvProcDt);
        sb.append(", aprvAdmId=").append(aprvAdmId);
        sb.append(", rtnRsn=").append(rtnRsn);
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
        ItemAprvHistEntity other = (ItemAprvHistEntity) that;
        return (this.getItemAprvHistId() == null ? other.getItemAprvHistId() == null : this.getItemAprvHistId().equals(other.getItemAprvHistId()))
            && (this.getItemId() == null ? other.getItemId() == null : this.getItemId().equals(other.getItemId()))
            && (this.getAprvReqCd() == null ? other.getAprvReqCd() == null : this.getAprvReqCd().equals(other.getAprvReqCd()))
            && (this.getAprvStatCd() == null ? other.getAprvStatCd() == null : this.getAprvStatCd().equals(other.getAprvStatCd()))
            && (this.getAprvReqDt() == null ? other.getAprvReqDt() == null : this.getAprvReqDt().equals(other.getAprvReqDt()))
            && (this.getAprvProcDt() == null ? other.getAprvProcDt() == null : this.getAprvProcDt().equals(other.getAprvProcDt()))
            && (this.getAprvAdmId() == null ? other.getAprvAdmId() == null : this.getAprvAdmId().equals(other.getAprvAdmId()))
            && (this.getRtnRsn() == null ? other.getRtnRsn() == null : this.getRtnRsn().equals(other.getRtnRsn()))
            && (this.getRegDt() == null ? other.getRegDt() == null : this.getRegDt().equals(other.getRegDt()))
            && (this.getRegId() == null ? other.getRegId() == null : this.getRegId().equals(other.getRegId()))
            && (this.getModDt() == null ? other.getModDt() == null : this.getModDt().equals(other.getModDt()))
            && (this.getModId() == null ? other.getModId() == null : this.getModId().equals(other.getModId()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getItemAprvHistId() == null) ? 0 : getItemAprvHistId().hashCode());
        result = prime * result + ((getItemId() == null) ? 0 : getItemId().hashCode());
        result = prime * result + ((getAprvReqCd() == null) ? 0 : getAprvReqCd().hashCode());
        result = prime * result + ((getAprvStatCd() == null) ? 0 : getAprvStatCd().hashCode());
        result = prime * result + ((getAprvReqDt() == null) ? 0 : getAprvReqDt().hashCode());
        result = prime * result + ((getAprvProcDt() == null) ? 0 : getAprvProcDt().hashCode());
        result = prime * result + ((getAprvAdmId() == null) ? 0 : getAprvAdmId().hashCode());
        result = prime * result + ((getRtnRsn() == null) ? 0 : getRtnRsn().hashCode());
        result = prime * result + ((getRegDt() == null) ? 0 : getRegDt().hashCode());
        result = prime * result + ((getRegId() == null) ? 0 : getRegId().hashCode());
        result = prime * result + ((getModDt() == null) ? 0 : getModDt().hashCode());
        result = prime * result + ((getModId() == null) ? 0 : getModId().hashCode());
        return result;
    }
}