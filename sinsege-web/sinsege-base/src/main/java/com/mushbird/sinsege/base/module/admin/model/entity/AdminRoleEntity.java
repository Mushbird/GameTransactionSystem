package com.mushbird.sinsege.base.module.admin.model.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.mushbird.sinsege.base.model.BaseEntity;
import java.io.Serializable;
import java.util.Date;

public abstract class AdminRoleEntity extends BaseEntity implements Serializable {
    private Integer admRoleId;

    private String admRoleCd;

    private String admRoleNm;

    private String psnlInfoHndlYn;

    private String dashbdTpCd;

    private String dpYn;

    private String fixGrpYn;

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

    public Integer getAdmRoleId() {
        return admRoleId;
    }

    public void setAdmRoleId(Integer admRoleId) {
        this.admRoleId = admRoleId;
    }

    public String getAdmRoleCd() {
        return admRoleCd;
    }

    public void setAdmRoleCd(String admRoleCd) {
        this.admRoleCd = admRoleCd == null ? null : admRoleCd.trim();
    }

    public String getAdmRoleNm() {
        return admRoleNm;
    }

    public void setAdmRoleNm(String admRoleNm) {
        this.admRoleNm = admRoleNm == null ? null : admRoleNm.trim();
    }

    public String getPsnlInfoHndlYn() {
        return psnlInfoHndlYn;
    }

    public void setPsnlInfoHndlYn(String psnlInfoHndlYn) {
        this.psnlInfoHndlYn = psnlInfoHndlYn == null ? null : psnlInfoHndlYn.trim();
    }

    public String getDashbdTpCd() {
        return dashbdTpCd;
    }

    public void setDashbdTpCd(String dashbdTpCd) {
        this.dashbdTpCd = dashbdTpCd == null ? null : dashbdTpCd.trim();
    }

    public String getDpYn() {
        return dpYn;
    }

    public void setDpYn(String dpYn) {
        this.dpYn = dpYn == null ? null : dpYn.trim();
    }

    public String getFixGrpYn() {
        return fixGrpYn;
    }

    public void setFixGrpYn(String fixGrpYn) {
        this.fixGrpYn = fixGrpYn == null ? null : fixGrpYn.trim();
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
        sb.append(", admRoleId=").append(admRoleId);
        sb.append(", admRoleCd=").append(admRoleCd);
        sb.append(", admRoleNm=").append(admRoleNm);
        sb.append(", psnlInfoHndlYn=").append(psnlInfoHndlYn);
        sb.append(", dashbdTpCd=").append(dashbdTpCd);
        sb.append(", dpYn=").append(dpYn);
        sb.append(", fixGrpYn=").append(fixGrpYn);
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
        AdminRoleEntity other = (AdminRoleEntity) that;
        return (this.getAdmRoleId() == null ? other.getAdmRoleId() == null : this.getAdmRoleId().equals(other.getAdmRoleId()))
            && (this.getAdmRoleCd() == null ? other.getAdmRoleCd() == null : this.getAdmRoleCd().equals(other.getAdmRoleCd()))
            && (this.getAdmRoleNm() == null ? other.getAdmRoleNm() == null : this.getAdmRoleNm().equals(other.getAdmRoleNm()))
            && (this.getPsnlInfoHndlYn() == null ? other.getPsnlInfoHndlYn() == null : this.getPsnlInfoHndlYn().equals(other.getPsnlInfoHndlYn()))
            && (this.getDashbdTpCd() == null ? other.getDashbdTpCd() == null : this.getDashbdTpCd().equals(other.getDashbdTpCd()))
            && (this.getDpYn() == null ? other.getDpYn() == null : this.getDpYn().equals(other.getDpYn()))
            && (this.getFixGrpYn() == null ? other.getFixGrpYn() == null : this.getFixGrpYn().equals(other.getFixGrpYn()))
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
        result = prime * result + ((getAdmRoleId() == null) ? 0 : getAdmRoleId().hashCode());
        result = prime * result + ((getAdmRoleCd() == null) ? 0 : getAdmRoleCd().hashCode());
        result = prime * result + ((getAdmRoleNm() == null) ? 0 : getAdmRoleNm().hashCode());
        result = prime * result + ((getPsnlInfoHndlYn() == null) ? 0 : getPsnlInfoHndlYn().hashCode());
        result = prime * result + ((getDashbdTpCd() == null) ? 0 : getDashbdTpCd().hashCode());
        result = prime * result + ((getDpYn() == null) ? 0 : getDpYn().hashCode());
        result = prime * result + ((getFixGrpYn() == null) ? 0 : getFixGrpYn().hashCode());
        result = prime * result + ((getRegDt() == null) ? 0 : getRegDt().hashCode());
        result = prime * result + ((getRegId() == null) ? 0 : getRegId().hashCode());
        result = prime * result + ((getModDt() == null) ? 0 : getModDt().hashCode());
        result = prime * result + ((getModId() == null) ? 0 : getModId().hashCode());
        result = prime * result + ((getUseYn() == null) ? 0 : getUseYn().hashCode());
        return result;
    }
}