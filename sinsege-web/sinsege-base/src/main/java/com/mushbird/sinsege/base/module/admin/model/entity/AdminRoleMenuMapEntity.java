package com.mushbird.sinsege.base.module.admin.model.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.io.Serializable;
import java.util.Date;

public abstract class AdminRoleMenuMapEntity extends AdminRoleMenuMapKey implements Serializable {
    private String athrReg;

    private String athrRead;

    private String athrMod;

    private String athrDel;

    private String athrExcel;

    @JsonIgnore
    private Date regDt;

    @JsonIgnore
    private String regId;

    private static final long serialVersionUID = com.mushbird.sinsege.base.constant.AppConst.UID;

    public String getAthrReg() {
        return athrReg;
    }

    public void setAthrReg(String athrReg) {
        this.athrReg = athrReg == null ? null : athrReg.trim();
    }

    public String getAthrRead() {
        return athrRead;
    }

    public void setAthrRead(String athrRead) {
        this.athrRead = athrRead == null ? null : athrRead.trim();
    }

    public String getAthrMod() {
        return athrMod;
    }

    public void setAthrMod(String athrMod) {
        this.athrMod = athrMod == null ? null : athrMod.trim();
    }

    public String getAthrDel() {
        return athrDel;
    }

    public void setAthrDel(String athrDel) {
        this.athrDel = athrDel == null ? null : athrDel.trim();
    }

    public String getAthrExcel() {
        return athrExcel;
    }

    public void setAthrExcel(String athrExcel) {
        this.athrExcel = athrExcel == null ? null : athrExcel.trim();
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
        sb.append(", athrReg=").append(athrReg);
        sb.append(", athrRead=").append(athrRead);
        sb.append(", athrMod=").append(athrMod);
        sb.append(", athrDel=").append(athrDel);
        sb.append(", athrExcel=").append(athrExcel);
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
        AdminRoleMenuMapEntity other = (AdminRoleMenuMapEntity) that;
        return (this.getAdmRoleId() == null ? other.getAdmRoleId() == null : this.getAdmRoleId().equals(other.getAdmRoleId()))
            && (this.getAdmSiteMenuId() == null ? other.getAdmSiteMenuId() == null : this.getAdmSiteMenuId().equals(other.getAdmSiteMenuId()))
            && (this.getAthrReg() == null ? other.getAthrReg() == null : this.getAthrReg().equals(other.getAthrReg()))
            && (this.getAthrRead() == null ? other.getAthrRead() == null : this.getAthrRead().equals(other.getAthrRead()))
            && (this.getAthrMod() == null ? other.getAthrMod() == null : this.getAthrMod().equals(other.getAthrMod()))
            && (this.getAthrDel() == null ? other.getAthrDel() == null : this.getAthrDel().equals(other.getAthrDel()))
            && (this.getAthrExcel() == null ? other.getAthrExcel() == null : this.getAthrExcel().equals(other.getAthrExcel()))
            && (this.getRegDt() == null ? other.getRegDt() == null : this.getRegDt().equals(other.getRegDt()))
            && (this.getRegId() == null ? other.getRegId() == null : this.getRegId().equals(other.getRegId()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getAdmRoleId() == null) ? 0 : getAdmRoleId().hashCode());
        result = prime * result + ((getAdmSiteMenuId() == null) ? 0 : getAdmSiteMenuId().hashCode());
        result = prime * result + ((getAthrReg() == null) ? 0 : getAthrReg().hashCode());
        result = prime * result + ((getAthrRead() == null) ? 0 : getAthrRead().hashCode());
        result = prime * result + ((getAthrMod() == null) ? 0 : getAthrMod().hashCode());
        result = prime * result + ((getAthrDel() == null) ? 0 : getAthrDel().hashCode());
        result = prime * result + ((getAthrExcel() == null) ? 0 : getAthrExcel().hashCode());
        result = prime * result + ((getRegDt() == null) ? 0 : getRegDt().hashCode());
        result = prime * result + ((getRegId() == null) ? 0 : getRegId().hashCode());
        return result;
    }
}