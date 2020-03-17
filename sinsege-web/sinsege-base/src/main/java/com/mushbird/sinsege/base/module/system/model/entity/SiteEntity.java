package com.mushbird.sinsege.base.module.system.model.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.mushbird.sinsege.base.model.BaseEntity;
import java.io.Serializable;
import java.util.Date;

public abstract class SiteEntity extends BaseEntity implements Serializable {
    private String siteId;

    private String bizNm;

    private String repNm;

    private String repTel;

    private String faxNo;

    private String bizNo;

    private String bizLocAddr;

    private String cisoNm;

    private String email;

    private String csoTelNo;

    private String seoTit;

    private String seoDesc;

    private String seoKwd;

    private Integer seoOgAtchGid;

    @JsonIgnore
    private Date regDt;

    @JsonIgnore
    private String regId;

    @JsonIgnore
    private Date modDt;

    @JsonIgnore
    private String modId;

    private static final long serialVersionUID = com.mushbird.sinsege.base.constant.AppConst.UID;

    public String getSiteId() {
        return siteId;
    }

    public void setSiteId(String siteId) {
        this.siteId = siteId == null ? null : siteId.trim();
    }

    public String getBizNm() {
        return bizNm;
    }

    public void setBizNm(String bizNm) {
        this.bizNm = bizNm == null ? null : bizNm.trim();
    }

    public String getRepNm() {
        return repNm;
    }

    public void setRepNm(String repNm) {
        this.repNm = repNm == null ? null : repNm.trim();
    }

    public String getRepTel() {
        return repTel;
    }

    public void setRepTel(String repTel) {
        this.repTel = repTel == null ? null : repTel.trim();
    }

    public String getFaxNo() {
        return faxNo;
    }

    public void setFaxNo(String faxNo) {
        this.faxNo = faxNo == null ? null : faxNo.trim();
    }

    public String getBizNo() {
        return bizNo;
    }

    public void setBizNo(String bizNo) {
        this.bizNo = bizNo == null ? null : bizNo.trim();
    }

    public String getBizLocAddr() {
        return bizLocAddr;
    }

    public void setBizLocAddr(String bizLocAddr) {
        this.bizLocAddr = bizLocAddr == null ? null : bizLocAddr.trim();
    }

    public String getCisoNm() {
        return cisoNm;
    }

    public void setCisoNm(String cisoNm) {
        this.cisoNm = cisoNm == null ? null : cisoNm.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getCsoTelNo() {
        return csoTelNo;
    }

    public void setCsoTelNo(String csoTelNo) {
        this.csoTelNo = csoTelNo == null ? null : csoTelNo.trim();
    }

    public String getSeoTit() {
        return seoTit;
    }

    public void setSeoTit(String seoTit) {
        this.seoTit = seoTit == null ? null : seoTit.trim();
    }

    public String getSeoDesc() {
        return seoDesc;
    }

    public void setSeoDesc(String seoDesc) {
        this.seoDesc = seoDesc == null ? null : seoDesc.trim();
    }

    public String getSeoKwd() {
        return seoKwd;
    }

    public void setSeoKwd(String seoKwd) {
        this.seoKwd = seoKwd == null ? null : seoKwd.trim();
    }

    public Integer getSeoOgAtchGid() {
        return seoOgAtchGid;
    }

    public void setSeoOgAtchGid(Integer seoOgAtchGid) {
        this.seoOgAtchGid = seoOgAtchGid;
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
        sb.append(", siteId=").append(siteId);
        sb.append(", bizNm=").append(bizNm);
        sb.append(", repNm=").append(repNm);
        sb.append(", repTel=").append(repTel);
        sb.append(", faxNo=").append(faxNo);
        sb.append(", bizNo=").append(bizNo);
        sb.append(", bizLocAddr=").append(bizLocAddr);
        sb.append(", cisoNm=").append(cisoNm);
        sb.append(", email=").append(email);
        sb.append(", csoTelNo=").append(csoTelNo);
        sb.append(", seoTit=").append(seoTit);
        sb.append(", seoDesc=").append(seoDesc);
        sb.append(", seoKwd=").append(seoKwd);
        sb.append(", seoOgAtchGid=").append(seoOgAtchGid);
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
        SiteEntity other = (SiteEntity) that;
        return (this.getSiteId() == null ? other.getSiteId() == null : this.getSiteId().equals(other.getSiteId()))
            && (this.getBizNm() == null ? other.getBizNm() == null : this.getBizNm().equals(other.getBizNm()))
            && (this.getRepNm() == null ? other.getRepNm() == null : this.getRepNm().equals(other.getRepNm()))
            && (this.getRepTel() == null ? other.getRepTel() == null : this.getRepTel().equals(other.getRepTel()))
            && (this.getFaxNo() == null ? other.getFaxNo() == null : this.getFaxNo().equals(other.getFaxNo()))
            && (this.getBizNo() == null ? other.getBizNo() == null : this.getBizNo().equals(other.getBizNo()))
            && (this.getBizLocAddr() == null ? other.getBizLocAddr() == null : this.getBizLocAddr().equals(other.getBizLocAddr()))
            && (this.getCisoNm() == null ? other.getCisoNm() == null : this.getCisoNm().equals(other.getCisoNm()))
            && (this.getEmail() == null ? other.getEmail() == null : this.getEmail().equals(other.getEmail()))
            && (this.getCsoTelNo() == null ? other.getCsoTelNo() == null : this.getCsoTelNo().equals(other.getCsoTelNo()))
            && (this.getSeoTit() == null ? other.getSeoTit() == null : this.getSeoTit().equals(other.getSeoTit()))
            && (this.getSeoDesc() == null ? other.getSeoDesc() == null : this.getSeoDesc().equals(other.getSeoDesc()))
            && (this.getSeoKwd() == null ? other.getSeoKwd() == null : this.getSeoKwd().equals(other.getSeoKwd()))
            && (this.getSeoOgAtchGid() == null ? other.getSeoOgAtchGid() == null : this.getSeoOgAtchGid().equals(other.getSeoOgAtchGid()))
            && (this.getRegDt() == null ? other.getRegDt() == null : this.getRegDt().equals(other.getRegDt()))
            && (this.getRegId() == null ? other.getRegId() == null : this.getRegId().equals(other.getRegId()))
            && (this.getModDt() == null ? other.getModDt() == null : this.getModDt().equals(other.getModDt()))
            && (this.getModId() == null ? other.getModId() == null : this.getModId().equals(other.getModId()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getSiteId() == null) ? 0 : getSiteId().hashCode());
        result = prime * result + ((getBizNm() == null) ? 0 : getBizNm().hashCode());
        result = prime * result + ((getRepNm() == null) ? 0 : getRepNm().hashCode());
        result = prime * result + ((getRepTel() == null) ? 0 : getRepTel().hashCode());
        result = prime * result + ((getFaxNo() == null) ? 0 : getFaxNo().hashCode());
        result = prime * result + ((getBizNo() == null) ? 0 : getBizNo().hashCode());
        result = prime * result + ((getBizLocAddr() == null) ? 0 : getBizLocAddr().hashCode());
        result = prime * result + ((getCisoNm() == null) ? 0 : getCisoNm().hashCode());
        result = prime * result + ((getEmail() == null) ? 0 : getEmail().hashCode());
        result = prime * result + ((getCsoTelNo() == null) ? 0 : getCsoTelNo().hashCode());
        result = prime * result + ((getSeoTit() == null) ? 0 : getSeoTit().hashCode());
        result = prime * result + ((getSeoDesc() == null) ? 0 : getSeoDesc().hashCode());
        result = prime * result + ((getSeoKwd() == null) ? 0 : getSeoKwd().hashCode());
        result = prime * result + ((getSeoOgAtchGid() == null) ? 0 : getSeoOgAtchGid().hashCode());
        result = prime * result + ((getRegDt() == null) ? 0 : getRegDt().hashCode());
        result = prime * result + ((getRegId() == null) ? 0 : getRegId().hashCode());
        result = prime * result + ((getModDt() == null) ? 0 : getModDt().hashCode());
        result = prime * result + ((getModId() == null) ? 0 : getModId().hashCode());
        return result;
    }
}