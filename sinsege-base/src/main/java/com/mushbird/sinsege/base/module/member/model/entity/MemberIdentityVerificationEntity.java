package com.mushbird.sinsege.base.module.member.model.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.mushbird.sinsege.base.model.BaseEntity;
import java.io.Serializable;
import java.util.Date;

public abstract class MemberIdentityVerificationEntity extends BaseEntity implements Serializable {
    private Integer mbrIdvrfId;

    private String mbrId;

    private String idvrfTpCd;

    private String lnmNm;

    private String brthYmd;

    private String gndrCl;

    private String lfrnrCl;

    private String reqNo;

    private String cpCarr;

    private String cpNo;

    private Date authDt;

    private String ciVal;

    private String diVal;

    private String rsltCdVal;

    private String rsltMsg;

    private String addVar;

    @JsonIgnore
    private Date regDt;

    @JsonIgnore
    private String regId;

    private static final long serialVersionUID = com.mushbird.sinsege.base.constant.AppConst.UID;

    public Integer getMbrIdvrfId() {
        return mbrIdvrfId;
    }

    public void setMbrIdvrfId(Integer mbrIdvrfId) {
        this.mbrIdvrfId = mbrIdvrfId;
    }

    public String getMbrId() {
        return mbrId;
    }

    public void setMbrId(String mbrId) {
        this.mbrId = mbrId == null ? null : mbrId.trim();
    }

    public String getIdvrfTpCd() {
        return idvrfTpCd;
    }

    public void setIdvrfTpCd(String idvrfTpCd) {
        this.idvrfTpCd = idvrfTpCd == null ? null : idvrfTpCd.trim();
    }

    public String getLnmNm() {
        return lnmNm;
    }

    public void setLnmNm(String lnmNm) {
        this.lnmNm = lnmNm == null ? null : lnmNm.trim();
    }

    public String getBrthYmd() {
        return brthYmd;
    }

    public void setBrthYmd(String brthYmd) {
        this.brthYmd = brthYmd == null ? null : brthYmd.trim();
    }

    public String getGndrCl() {
        return gndrCl;
    }

    public void setGndrCl(String gndrCl) {
        this.gndrCl = gndrCl == null ? null : gndrCl.trim();
    }

    public String getLfrnrCl() {
        return lfrnrCl;
    }

    public void setLfrnrCl(String lfrnrCl) {
        this.lfrnrCl = lfrnrCl == null ? null : lfrnrCl.trim();
    }

    public String getReqNo() {
        return reqNo;
    }

    public void setReqNo(String reqNo) {
        this.reqNo = reqNo == null ? null : reqNo.trim();
    }

    public String getCpCarr() {
        return cpCarr;
    }

    public void setCpCarr(String cpCarr) {
        this.cpCarr = cpCarr == null ? null : cpCarr.trim();
    }

    public String getCpNo() {
        return cpNo;
    }

    public void setCpNo(String cpNo) {
        this.cpNo = cpNo == null ? null : cpNo.trim();
    }

    public Date getAuthDt() {
        return authDt;
    }

    public void setAuthDt(Date authDt) {
        this.authDt = authDt;
    }

    public String getCiVal() {
        return ciVal;
    }

    public void setCiVal(String ciVal) {
        this.ciVal = ciVal == null ? null : ciVal.trim();
    }

    public String getDiVal() {
        return diVal;
    }

    public void setDiVal(String diVal) {
        this.diVal = diVal == null ? null : diVal.trim();
    }

    public String getRsltCdVal() {
        return rsltCdVal;
    }

    public void setRsltCdVal(String rsltCdVal) {
        this.rsltCdVal = rsltCdVal == null ? null : rsltCdVal.trim();
    }

    public String getRsltMsg() {
        return rsltMsg;
    }

    public void setRsltMsg(String rsltMsg) {
        this.rsltMsg = rsltMsg == null ? null : rsltMsg.trim();
    }

    public String getAddVar() {
        return addVar;
    }

    public void setAddVar(String addVar) {
        this.addVar = addVar == null ? null : addVar.trim();
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
        sb.append(", mbrIdvrfId=").append(mbrIdvrfId);
        sb.append(", mbrId=").append(mbrId);
        sb.append(", idvrfTpCd=").append(idvrfTpCd);
        sb.append(", lnmNm=").append(lnmNm);
        sb.append(", brthYmd=").append(brthYmd);
        sb.append(", gndrCl=").append(gndrCl);
        sb.append(", lfrnrCl=").append(lfrnrCl);
        sb.append(", reqNo=").append(reqNo);
        sb.append(", cpCarr=").append(cpCarr);
        sb.append(", cpNo=").append(cpNo);
        sb.append(", authDt=").append(authDt);
        sb.append(", ciVal=").append(ciVal);
        sb.append(", diVal=").append(diVal);
        sb.append(", rsltCdVal=").append(rsltCdVal);
        sb.append(", rsltMsg=").append(rsltMsg);
        sb.append(", addVar=").append(addVar);
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
        MemberIdentityVerificationEntity other = (MemberIdentityVerificationEntity) that;
        return (this.getMbrIdvrfId() == null ? other.getMbrIdvrfId() == null : this.getMbrIdvrfId().equals(other.getMbrIdvrfId()))
            && (this.getMbrId() == null ? other.getMbrId() == null : this.getMbrId().equals(other.getMbrId()))
            && (this.getIdvrfTpCd() == null ? other.getIdvrfTpCd() == null : this.getIdvrfTpCd().equals(other.getIdvrfTpCd()))
            && (this.getLnmNm() == null ? other.getLnmNm() == null : this.getLnmNm().equals(other.getLnmNm()))
            && (this.getBrthYmd() == null ? other.getBrthYmd() == null : this.getBrthYmd().equals(other.getBrthYmd()))
            && (this.getGndrCl() == null ? other.getGndrCl() == null : this.getGndrCl().equals(other.getGndrCl()))
            && (this.getLfrnrCl() == null ? other.getLfrnrCl() == null : this.getLfrnrCl().equals(other.getLfrnrCl()))
            && (this.getReqNo() == null ? other.getReqNo() == null : this.getReqNo().equals(other.getReqNo()))
            && (this.getCpCarr() == null ? other.getCpCarr() == null : this.getCpCarr().equals(other.getCpCarr()))
            && (this.getCpNo() == null ? other.getCpNo() == null : this.getCpNo().equals(other.getCpNo()))
            && (this.getAuthDt() == null ? other.getAuthDt() == null : this.getAuthDt().equals(other.getAuthDt()))
            && (this.getCiVal() == null ? other.getCiVal() == null : this.getCiVal().equals(other.getCiVal()))
            && (this.getDiVal() == null ? other.getDiVal() == null : this.getDiVal().equals(other.getDiVal()))
            && (this.getRsltCdVal() == null ? other.getRsltCdVal() == null : this.getRsltCdVal().equals(other.getRsltCdVal()))
            && (this.getRsltMsg() == null ? other.getRsltMsg() == null : this.getRsltMsg().equals(other.getRsltMsg()))
            && (this.getAddVar() == null ? other.getAddVar() == null : this.getAddVar().equals(other.getAddVar()))
            && (this.getRegDt() == null ? other.getRegDt() == null : this.getRegDt().equals(other.getRegDt()))
            && (this.getRegId() == null ? other.getRegId() == null : this.getRegId().equals(other.getRegId()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getMbrIdvrfId() == null) ? 0 : getMbrIdvrfId().hashCode());
        result = prime * result + ((getMbrId() == null) ? 0 : getMbrId().hashCode());
        result = prime * result + ((getIdvrfTpCd() == null) ? 0 : getIdvrfTpCd().hashCode());
        result = prime * result + ((getLnmNm() == null) ? 0 : getLnmNm().hashCode());
        result = prime * result + ((getBrthYmd() == null) ? 0 : getBrthYmd().hashCode());
        result = prime * result + ((getGndrCl() == null) ? 0 : getGndrCl().hashCode());
        result = prime * result + ((getLfrnrCl() == null) ? 0 : getLfrnrCl().hashCode());
        result = prime * result + ((getReqNo() == null) ? 0 : getReqNo().hashCode());
        result = prime * result + ((getCpCarr() == null) ? 0 : getCpCarr().hashCode());
        result = prime * result + ((getCpNo() == null) ? 0 : getCpNo().hashCode());
        result = prime * result + ((getAuthDt() == null) ? 0 : getAuthDt().hashCode());
        result = prime * result + ((getCiVal() == null) ? 0 : getCiVal().hashCode());
        result = prime * result + ((getDiVal() == null) ? 0 : getDiVal().hashCode());
        result = prime * result + ((getRsltCdVal() == null) ? 0 : getRsltCdVal().hashCode());
        result = prime * result + ((getRsltMsg() == null) ? 0 : getRsltMsg().hashCode());
        result = prime * result + ((getAddVar() == null) ? 0 : getAddVar().hashCode());
        result = prime * result + ((getRegDt() == null) ? 0 : getRegDt().hashCode());
        result = prime * result + ((getRegId() == null) ? 0 : getRegId().hashCode());
        return result;
    }
}