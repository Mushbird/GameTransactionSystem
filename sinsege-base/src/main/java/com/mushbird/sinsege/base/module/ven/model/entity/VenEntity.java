package com.mushbird.sinsege.base.module.ven.model.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.mushbird.sinsege.base.model.BaseEntity;
import java.io.Serializable;
import java.util.Date;

public abstract class VenEntity extends BaseEntity implements Serializable {
    private Integer venId;

    private String venTpCd;

    private String etrVenClCd;

    private String venStatCd;

    private String venCd;

    private String venNm;

    private String repNm;

    private String telNo;

    private String cpNo;

    private String faxNo;

    private String email;

    private String zipcd;

    private String addr;

    private String bizClCd;

    private String bizNo;

    private String incNo;

    private String bizCond;

    private String bizTp;

    private String taxClCd;

    private String affVenCdUsePdLimYn;

    private String affVenCdUsePdStDay;

    private String affVenCdUsePdEdDay;

    private Date etrDt;

    private String repVenYn;

    @JsonIgnore
    private Date regDt;

    @JsonIgnore
    private String regId;

    @JsonIgnore
    private Date modDt;

    @JsonIgnore
    private String modId;

    private String useYn;

    private static final long serialVersionUID = com.mushbird.sinsege.base.constant.AppConst.UID;

    public Integer getVenId() {
        return venId;
    }

    public void setVenId(Integer venId) {
        this.venId = venId;
    }

    public String getVenTpCd() {
        return venTpCd;
    }

    public void setVenTpCd(String venTpCd) {
        this.venTpCd = venTpCd == null ? null : venTpCd.trim();
    }

    public String getEtrVenClCd() {
        return etrVenClCd;
    }

    public void setEtrVenClCd(String etrVenClCd) {
        this.etrVenClCd = etrVenClCd == null ? null : etrVenClCd.trim();
    }

    public String getVenStatCd() {
        return venStatCd;
    }

    public void setVenStatCd(String venStatCd) {
        this.venStatCd = venStatCd == null ? null : venStatCd.trim();
    }

    public String getVenCd() {
        return venCd;
    }

    public void setVenCd(String venCd) {
        this.venCd = venCd == null ? null : venCd.trim();
    }

    public String getVenNm() {
        return venNm;
    }

    public void setVenNm(String venNm) {
        this.venNm = venNm == null ? null : venNm.trim();
    }

    public String getRepNm() {
        return repNm;
    }

    public void setRepNm(String repNm) {
        this.repNm = repNm == null ? null : repNm.trim();
    }

    public String getTelNo() {
        return telNo;
    }

    public void setTelNo(String telNo) {
        this.telNo = telNo == null ? null : telNo.trim();
    }

    public String getCpNo() {
        return cpNo;
    }

    public void setCpNo(String cpNo) {
        this.cpNo = cpNo == null ? null : cpNo.trim();
    }

    public String getFaxNo() {
        return faxNo;
    }

    public void setFaxNo(String faxNo) {
        this.faxNo = faxNo == null ? null : faxNo.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getZipcd() {
        return zipcd;
    }

    public void setZipcd(String zipcd) {
        this.zipcd = zipcd == null ? null : zipcd.trim();
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr == null ? null : addr.trim();
    }

    public String getBizClCd() {
        return bizClCd;
    }

    public void setBizClCd(String bizClCd) {
        this.bizClCd = bizClCd == null ? null : bizClCd.trim();
    }

    public String getBizNo() {
        return bizNo;
    }

    public void setBizNo(String bizNo) {
        this.bizNo = bizNo == null ? null : bizNo.trim();
    }

    public String getIncNo() {
        return incNo;
    }

    public void setIncNo(String incNo) {
        this.incNo = incNo == null ? null : incNo.trim();
    }

    public String getBizCond() {
        return bizCond;
    }

    public void setBizCond(String bizCond) {
        this.bizCond = bizCond == null ? null : bizCond.trim();
    }

    public String getBizTp() {
        return bizTp;
    }

    public void setBizTp(String bizTp) {
        this.bizTp = bizTp == null ? null : bizTp.trim();
    }

    public String getTaxClCd() {
        return taxClCd;
    }

    public void setTaxClCd(String taxClCd) {
        this.taxClCd = taxClCd == null ? null : taxClCd.trim();
    }

    public String getAffVenCdUsePdLimYn() {
        return affVenCdUsePdLimYn;
    }

    public void setAffVenCdUsePdLimYn(String affVenCdUsePdLimYn) {
        this.affVenCdUsePdLimYn = affVenCdUsePdLimYn == null ? null : affVenCdUsePdLimYn.trim();
    }

    public String getAffVenCdUsePdStDay() {
        return affVenCdUsePdStDay;
    }

    public void setAffVenCdUsePdStDay(String affVenCdUsePdStDay) {
        this.affVenCdUsePdStDay = affVenCdUsePdStDay == null ? null : affVenCdUsePdStDay.trim();
    }

    public String getAffVenCdUsePdEdDay() {
        return affVenCdUsePdEdDay;
    }

    public void setAffVenCdUsePdEdDay(String affVenCdUsePdEdDay) {
        this.affVenCdUsePdEdDay = affVenCdUsePdEdDay == null ? null : affVenCdUsePdEdDay.trim();
    }

    public Date getEtrDt() {
        return etrDt;
    }

    public void setEtrDt(Date etrDt) {
        this.etrDt = etrDt;
    }

    public String getRepVenYn() {
        return repVenYn;
    }

    public void setRepVenYn(String repVenYn) {
        this.repVenYn = repVenYn == null ? null : repVenYn.trim();
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
        sb.append(", venId=").append(venId);
        sb.append(", venTpCd=").append(venTpCd);
        sb.append(", etrVenClCd=").append(etrVenClCd);
        sb.append(", venStatCd=").append(venStatCd);
        sb.append(", venCd=").append(venCd);
        sb.append(", venNm=").append(venNm);
        sb.append(", repNm=").append(repNm);
        sb.append(", telNo=").append(telNo);
        sb.append(", cpNo=").append(cpNo);
        sb.append(", faxNo=").append(faxNo);
        sb.append(", email=").append(email);
        sb.append(", zipcd=").append(zipcd);
        sb.append(", addr=").append(addr);
        sb.append(", bizClCd=").append(bizClCd);
        sb.append(", bizNo=").append(bizNo);
        sb.append(", incNo=").append(incNo);
        sb.append(", bizCond=").append(bizCond);
        sb.append(", bizTp=").append(bizTp);
        sb.append(", taxClCd=").append(taxClCd);
        sb.append(", affVenCdUsePdLimYn=").append(affVenCdUsePdLimYn);
        sb.append(", affVenCdUsePdStDay=").append(affVenCdUsePdStDay);
        sb.append(", affVenCdUsePdEdDay=").append(affVenCdUsePdEdDay);
        sb.append(", etrDt=").append(etrDt);
        sb.append(", repVenYn=").append(repVenYn);
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
        VenEntity other = (VenEntity) that;
        return (this.getVenId() == null ? other.getVenId() == null : this.getVenId().equals(other.getVenId()))
            && (this.getVenTpCd() == null ? other.getVenTpCd() == null : this.getVenTpCd().equals(other.getVenTpCd()))
            && (this.getEtrVenClCd() == null ? other.getEtrVenClCd() == null : this.getEtrVenClCd().equals(other.getEtrVenClCd()))
            && (this.getVenStatCd() == null ? other.getVenStatCd() == null : this.getVenStatCd().equals(other.getVenStatCd()))
            && (this.getVenCd() == null ? other.getVenCd() == null : this.getVenCd().equals(other.getVenCd()))
            && (this.getVenNm() == null ? other.getVenNm() == null : this.getVenNm().equals(other.getVenNm()))
            && (this.getRepNm() == null ? other.getRepNm() == null : this.getRepNm().equals(other.getRepNm()))
            && (this.getTelNo() == null ? other.getTelNo() == null : this.getTelNo().equals(other.getTelNo()))
            && (this.getCpNo() == null ? other.getCpNo() == null : this.getCpNo().equals(other.getCpNo()))
            && (this.getFaxNo() == null ? other.getFaxNo() == null : this.getFaxNo().equals(other.getFaxNo()))
            && (this.getEmail() == null ? other.getEmail() == null : this.getEmail().equals(other.getEmail()))
            && (this.getZipcd() == null ? other.getZipcd() == null : this.getZipcd().equals(other.getZipcd()))
            && (this.getAddr() == null ? other.getAddr() == null : this.getAddr().equals(other.getAddr()))
            && (this.getBizClCd() == null ? other.getBizClCd() == null : this.getBizClCd().equals(other.getBizClCd()))
            && (this.getBizNo() == null ? other.getBizNo() == null : this.getBizNo().equals(other.getBizNo()))
            && (this.getIncNo() == null ? other.getIncNo() == null : this.getIncNo().equals(other.getIncNo()))
            && (this.getBizCond() == null ? other.getBizCond() == null : this.getBizCond().equals(other.getBizCond()))
            && (this.getBizTp() == null ? other.getBizTp() == null : this.getBizTp().equals(other.getBizTp()))
            && (this.getTaxClCd() == null ? other.getTaxClCd() == null : this.getTaxClCd().equals(other.getTaxClCd()))
            && (this.getAffVenCdUsePdLimYn() == null ? other.getAffVenCdUsePdLimYn() == null : this.getAffVenCdUsePdLimYn().equals(other.getAffVenCdUsePdLimYn()))
            && (this.getAffVenCdUsePdStDay() == null ? other.getAffVenCdUsePdStDay() == null : this.getAffVenCdUsePdStDay().equals(other.getAffVenCdUsePdStDay()))
            && (this.getAffVenCdUsePdEdDay() == null ? other.getAffVenCdUsePdEdDay() == null : this.getAffVenCdUsePdEdDay().equals(other.getAffVenCdUsePdEdDay()))
            && (this.getEtrDt() == null ? other.getEtrDt() == null : this.getEtrDt().equals(other.getEtrDt()))
            && (this.getRepVenYn() == null ? other.getRepVenYn() == null : this.getRepVenYn().equals(other.getRepVenYn()))
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
        result = prime * result + ((getVenId() == null) ? 0 : getVenId().hashCode());
        result = prime * result + ((getVenTpCd() == null) ? 0 : getVenTpCd().hashCode());
        result = prime * result + ((getEtrVenClCd() == null) ? 0 : getEtrVenClCd().hashCode());
        result = prime * result + ((getVenStatCd() == null) ? 0 : getVenStatCd().hashCode());
        result = prime * result + ((getVenCd() == null) ? 0 : getVenCd().hashCode());
        result = prime * result + ((getVenNm() == null) ? 0 : getVenNm().hashCode());
        result = prime * result + ((getRepNm() == null) ? 0 : getRepNm().hashCode());
        result = prime * result + ((getTelNo() == null) ? 0 : getTelNo().hashCode());
        result = prime * result + ((getCpNo() == null) ? 0 : getCpNo().hashCode());
        result = prime * result + ((getFaxNo() == null) ? 0 : getFaxNo().hashCode());
        result = prime * result + ((getEmail() == null) ? 0 : getEmail().hashCode());
        result = prime * result + ((getZipcd() == null) ? 0 : getZipcd().hashCode());
        result = prime * result + ((getAddr() == null) ? 0 : getAddr().hashCode());
        result = prime * result + ((getBizClCd() == null) ? 0 : getBizClCd().hashCode());
        result = prime * result + ((getBizNo() == null) ? 0 : getBizNo().hashCode());
        result = prime * result + ((getIncNo() == null) ? 0 : getIncNo().hashCode());
        result = prime * result + ((getBizCond() == null) ? 0 : getBizCond().hashCode());
        result = prime * result + ((getBizTp() == null) ? 0 : getBizTp().hashCode());
        result = prime * result + ((getTaxClCd() == null) ? 0 : getTaxClCd().hashCode());
        result = prime * result + ((getAffVenCdUsePdLimYn() == null) ? 0 : getAffVenCdUsePdLimYn().hashCode());
        result = prime * result + ((getAffVenCdUsePdStDay() == null) ? 0 : getAffVenCdUsePdStDay().hashCode());
        result = prime * result + ((getAffVenCdUsePdEdDay() == null) ? 0 : getAffVenCdUsePdEdDay().hashCode());
        result = prime * result + ((getEtrDt() == null) ? 0 : getEtrDt().hashCode());
        result = prime * result + ((getRepVenYn() == null) ? 0 : getRepVenYn().hashCode());
        result = prime * result + ((getRegDt() == null) ? 0 : getRegDt().hashCode());
        result = prime * result + ((getRegId() == null) ? 0 : getRegId().hashCode());
        result = prime * result + ((getModDt() == null) ? 0 : getModDt().hashCode());
        result = prime * result + ((getModId() == null) ? 0 : getModId().hashCode());
        result = prime * result + ((getUseYn() == null) ? 0 : getUseYn().hashCode());
        return result;
    }
}