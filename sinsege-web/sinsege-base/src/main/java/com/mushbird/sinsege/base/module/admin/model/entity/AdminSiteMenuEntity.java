package com.mushbird.sinsege.base.module.admin.model.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.mushbird.sinsege.base.model.BaseEntity;
import java.io.Serializable;
import java.util.Date;

public abstract class AdminSiteMenuEntity extends BaseEntity implements Serializable {
    private Integer admSiteMenuId;

    private Integer refAdmSiteMenuId;

    private String menuNm;

    private String urlAddr;

    private Integer sord;

    private String dpYn;

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

    public Integer getAdmSiteMenuId() {
        return admSiteMenuId;
    }

    public void setAdmSiteMenuId(Integer admSiteMenuId) {
        this.admSiteMenuId = admSiteMenuId;
    }

    public Integer getRefAdmSiteMenuId() {
        return refAdmSiteMenuId;
    }

    public void setRefAdmSiteMenuId(Integer refAdmSiteMenuId) {
        this.refAdmSiteMenuId = refAdmSiteMenuId;
    }

    public String getMenuNm() {
        return menuNm;
    }

    public void setMenuNm(String menuNm) {
        this.menuNm = menuNm == null ? null : menuNm.trim();
    }

    public String getUrlAddr() {
        return urlAddr;
    }

    public void setUrlAddr(String urlAddr) {
        this.urlAddr = urlAddr == null ? null : urlAddr.trim();
    }

    public Integer getSord() {
        return sord;
    }

    public void setSord(Integer sord) {
        this.sord = sord;
    }

    public String getDpYn() {
        return dpYn;
    }

    public void setDpYn(String dpYn) {
        this.dpYn = dpYn == null ? null : dpYn.trim();
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
        sb.append(", admSiteMenuId=").append(admSiteMenuId);
        sb.append(", refAdmSiteMenuId=").append(refAdmSiteMenuId);
        sb.append(", menuNm=").append(menuNm);
        sb.append(", urlAddr=").append(urlAddr);
        sb.append(", sord=").append(sord);
        sb.append(", dpYn=").append(dpYn);
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
        AdminSiteMenuEntity other = (AdminSiteMenuEntity) that;
        return (this.getAdmSiteMenuId() == null ? other.getAdmSiteMenuId() == null : this.getAdmSiteMenuId().equals(other.getAdmSiteMenuId()))
            && (this.getRefAdmSiteMenuId() == null ? other.getRefAdmSiteMenuId() == null : this.getRefAdmSiteMenuId().equals(other.getRefAdmSiteMenuId()))
            && (this.getMenuNm() == null ? other.getMenuNm() == null : this.getMenuNm().equals(other.getMenuNm()))
            && (this.getUrlAddr() == null ? other.getUrlAddr() == null : this.getUrlAddr().equals(other.getUrlAddr()))
            && (this.getSord() == null ? other.getSord() == null : this.getSord().equals(other.getSord()))
            && (this.getDpYn() == null ? other.getDpYn() == null : this.getDpYn().equals(other.getDpYn()))
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
        result = prime * result + ((getAdmSiteMenuId() == null) ? 0 : getAdmSiteMenuId().hashCode());
        result = prime * result + ((getRefAdmSiteMenuId() == null) ? 0 : getRefAdmSiteMenuId().hashCode());
        result = prime * result + ((getMenuNm() == null) ? 0 : getMenuNm().hashCode());
        result = prime * result + ((getUrlAddr() == null) ? 0 : getUrlAddr().hashCode());
        result = prime * result + ((getSord() == null) ? 0 : getSord().hashCode());
        result = prime * result + ((getDpYn() == null) ? 0 : getDpYn().hashCode());
        result = prime * result + ((getRegDt() == null) ? 0 : getRegDt().hashCode());
        result = prime * result + ((getRegId() == null) ? 0 : getRegId().hashCode());
        result = prime * result + ((getModDt() == null) ? 0 : getModDt().hashCode());
        result = prime * result + ((getModId() == null) ? 0 : getModId().hashCode());
        result = prime * result + ((getUseYn() == null) ? 0 : getUseYn().hashCode());
        return result;
    }
}