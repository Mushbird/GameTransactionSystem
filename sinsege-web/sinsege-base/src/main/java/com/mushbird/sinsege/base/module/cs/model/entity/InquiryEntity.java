package com.mushbird.sinsege.base.module.cs.model.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.mushbird.sinsege.base.model.BaseEntity;
import java.io.Serializable;
import java.util.Date;

public abstract class InquiryEntity extends BaseEntity implements Serializable {
    private Integer inqId;

    private String inqTpCd;

    private String inqStatCd;

    private String inqClCd;

    private String inqClDtlCd;

    private Integer rmkId;

    private String mbrYn;

    private String mbrId;

    private String wrtrIdVal;

    private String wrtrNm;

    private String cpCarrCd;

    private String cpNo;

    private String email;

    private String tit;

    private String cont;

    private String rplyNotiYn;

    private String pubYn;

    private String dpYn;

    private String regEnvCd;

    private Integer atchGid;

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

    public Integer getInqId() {
        return inqId;
    }

    public void setInqId(Integer inqId) {
        this.inqId = inqId;
    }

    public String getInqTpCd() {
        return inqTpCd;
    }

    public void setInqTpCd(String inqTpCd) {
        this.inqTpCd = inqTpCd == null ? null : inqTpCd.trim();
    }

    public String getInqStatCd() {
        return inqStatCd;
    }

    public void setInqStatCd(String inqStatCd) {
        this.inqStatCd = inqStatCd == null ? null : inqStatCd.trim();
    }

    public String getInqClCd() {
        return inqClCd;
    }

    public void setInqClCd(String inqClCd) {
        this.inqClCd = inqClCd == null ? null : inqClCd.trim();
    }

    public String getInqClDtlCd() {
        return inqClDtlCd;
    }

    public void setInqClDtlCd(String inqClDtlCd) {
        this.inqClDtlCd = inqClDtlCd == null ? null : inqClDtlCd.trim();
    }

    public Integer getRmkId() {
        return rmkId;
    }

    public void setRmkId(Integer rmkId) {
        this.rmkId = rmkId;
    }

    public String getMbrYn() {
        return mbrYn;
    }

    public void setMbrYn(String mbrYn) {
        this.mbrYn = mbrYn == null ? null : mbrYn.trim();
    }

    public String getMbrId() {
        return mbrId;
    }

    public void setMbrId(String mbrId) {
        this.mbrId = mbrId == null ? null : mbrId.trim();
    }

    public String getWrtrIdVal() {
        return wrtrIdVal;
    }

    public void setWrtrIdVal(String wrtrIdVal) {
        this.wrtrIdVal = wrtrIdVal == null ? null : wrtrIdVal.trim();
    }

    public String getWrtrNm() {
        return wrtrNm;
    }

    public void setWrtrNm(String wrtrNm) {
        this.wrtrNm = wrtrNm == null ? null : wrtrNm.trim();
    }

    public String getCpCarrCd() {
        return cpCarrCd;
    }

    public void setCpCarrCd(String cpCarrCd) {
        this.cpCarrCd = cpCarrCd == null ? null : cpCarrCd.trim();
    }

    public String getCpNo() {
        return cpNo;
    }

    public void setCpNo(String cpNo) {
        this.cpNo = cpNo == null ? null : cpNo.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getTit() {
        return tit;
    }

    public void setTit(String tit) {
        this.tit = tit == null ? null : tit.trim();
    }

    public String getCont() {
        return cont;
    }

    public void setCont(String cont) {
        this.cont = cont == null ? null : cont.trim();
    }

    public String getRplyNotiYn() {
        return rplyNotiYn;
    }

    public void setRplyNotiYn(String rplyNotiYn) {
        this.rplyNotiYn = rplyNotiYn == null ? null : rplyNotiYn.trim();
    }

    public String getPubYn() {
        return pubYn;
    }

    public void setPubYn(String pubYn) {
        this.pubYn = pubYn == null ? null : pubYn.trim();
    }

    public String getDpYn() {
        return dpYn;
    }

    public void setDpYn(String dpYn) {
        this.dpYn = dpYn == null ? null : dpYn.trim();
    }

    public String getRegEnvCd() {
        return regEnvCd;
    }

    public void setRegEnvCd(String regEnvCd) {
        this.regEnvCd = regEnvCd == null ? null : regEnvCd.trim();
    }

    public Integer getAtchGid() {
        return atchGid;
    }

    public void setAtchGid(Integer atchGid) {
        this.atchGid = atchGid;
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
        sb.append(", inqId=").append(inqId);
        sb.append(", inqTpCd=").append(inqTpCd);
        sb.append(", inqStatCd=").append(inqStatCd);
        sb.append(", inqClCd=").append(inqClCd);
        sb.append(", inqClDtlCd=").append(inqClDtlCd);
        sb.append(", rmkId=").append(rmkId);
        sb.append(", mbrYn=").append(mbrYn);
        sb.append(", mbrId=").append(mbrId);
        sb.append(", wrtrIdVal=").append(wrtrIdVal);
        sb.append(", wrtrNm=").append(wrtrNm);
        sb.append(", cpCarrCd=").append(cpCarrCd);
        sb.append(", cpNo=").append(cpNo);
        sb.append(", email=").append(email);
        sb.append(", tit=").append(tit);
        sb.append(", cont=").append(cont);
        sb.append(", rplyNotiYn=").append(rplyNotiYn);
        sb.append(", pubYn=").append(pubYn);
        sb.append(", dpYn=").append(dpYn);
        sb.append(", regEnvCd=").append(regEnvCd);
        sb.append(", atchGid=").append(atchGid);
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
        InquiryEntity other = (InquiryEntity) that;
        return (this.getInqId() == null ? other.getInqId() == null : this.getInqId().equals(other.getInqId()))
            && (this.getInqTpCd() == null ? other.getInqTpCd() == null : this.getInqTpCd().equals(other.getInqTpCd()))
            && (this.getInqStatCd() == null ? other.getInqStatCd() == null : this.getInqStatCd().equals(other.getInqStatCd()))
            && (this.getInqClCd() == null ? other.getInqClCd() == null : this.getInqClCd().equals(other.getInqClCd()))
            && (this.getInqClDtlCd() == null ? other.getInqClDtlCd() == null : this.getInqClDtlCd().equals(other.getInqClDtlCd()))
            && (this.getRmkId() == null ? other.getRmkId() == null : this.getRmkId().equals(other.getRmkId()))
            && (this.getMbrYn() == null ? other.getMbrYn() == null : this.getMbrYn().equals(other.getMbrYn()))
            && (this.getMbrId() == null ? other.getMbrId() == null : this.getMbrId().equals(other.getMbrId()))
            && (this.getWrtrIdVal() == null ? other.getWrtrIdVal() == null : this.getWrtrIdVal().equals(other.getWrtrIdVal()))
            && (this.getWrtrNm() == null ? other.getWrtrNm() == null : this.getWrtrNm().equals(other.getWrtrNm()))
            && (this.getCpCarrCd() == null ? other.getCpCarrCd() == null : this.getCpCarrCd().equals(other.getCpCarrCd()))
            && (this.getCpNo() == null ? other.getCpNo() == null : this.getCpNo().equals(other.getCpNo()))
            && (this.getEmail() == null ? other.getEmail() == null : this.getEmail().equals(other.getEmail()))
            && (this.getTit() == null ? other.getTit() == null : this.getTit().equals(other.getTit()))
            && (this.getCont() == null ? other.getCont() == null : this.getCont().equals(other.getCont()))
            && (this.getRplyNotiYn() == null ? other.getRplyNotiYn() == null : this.getRplyNotiYn().equals(other.getRplyNotiYn()))
            && (this.getPubYn() == null ? other.getPubYn() == null : this.getPubYn().equals(other.getPubYn()))
            && (this.getDpYn() == null ? other.getDpYn() == null : this.getDpYn().equals(other.getDpYn()))
            && (this.getRegEnvCd() == null ? other.getRegEnvCd() == null : this.getRegEnvCd().equals(other.getRegEnvCd()))
            && (this.getAtchGid() == null ? other.getAtchGid() == null : this.getAtchGid().equals(other.getAtchGid()))
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
        result = prime * result + ((getInqId() == null) ? 0 : getInqId().hashCode());
        result = prime * result + ((getInqTpCd() == null) ? 0 : getInqTpCd().hashCode());
        result = prime * result + ((getInqStatCd() == null) ? 0 : getInqStatCd().hashCode());
        result = prime * result + ((getInqClCd() == null) ? 0 : getInqClCd().hashCode());
        result = prime * result + ((getInqClDtlCd() == null) ? 0 : getInqClDtlCd().hashCode());
        result = prime * result + ((getRmkId() == null) ? 0 : getRmkId().hashCode());
        result = prime * result + ((getMbrYn() == null) ? 0 : getMbrYn().hashCode());
        result = prime * result + ((getMbrId() == null) ? 0 : getMbrId().hashCode());
        result = prime * result + ((getWrtrIdVal() == null) ? 0 : getWrtrIdVal().hashCode());
        result = prime * result + ((getWrtrNm() == null) ? 0 : getWrtrNm().hashCode());
        result = prime * result + ((getCpCarrCd() == null) ? 0 : getCpCarrCd().hashCode());
        result = prime * result + ((getCpNo() == null) ? 0 : getCpNo().hashCode());
        result = prime * result + ((getEmail() == null) ? 0 : getEmail().hashCode());
        result = prime * result + ((getTit() == null) ? 0 : getTit().hashCode());
        result = prime * result + ((getCont() == null) ? 0 : getCont().hashCode());
        result = prime * result + ((getRplyNotiYn() == null) ? 0 : getRplyNotiYn().hashCode());
        result = prime * result + ((getPubYn() == null) ? 0 : getPubYn().hashCode());
        result = prime * result + ((getDpYn() == null) ? 0 : getDpYn().hashCode());
        result = prime * result + ((getRegEnvCd() == null) ? 0 : getRegEnvCd().hashCode());
        result = prime * result + ((getAtchGid() == null) ? 0 : getAtchGid().hashCode());
        result = prime * result + ((getRegDt() == null) ? 0 : getRegDt().hashCode());
        result = prime * result + ((getRegId() == null) ? 0 : getRegId().hashCode());
        result = prime * result + ((getModDt() == null) ? 0 : getModDt().hashCode());
        result = prime * result + ((getModId() == null) ? 0 : getModId().hashCode());
        result = prime * result + ((getUseYn() == null) ? 0 : getUseYn().hashCode());
        return result;
    }
}