package com.mushbird.sinsege.base.module.member.model.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.mushbird.sinsege.base.model.BaseEntity;
import java.io.Serializable;
import java.util.Date;

public abstract class MemberChangeHistoryEntity extends BaseEntity implements Serializable {
    private Integer mbrChistId;

    private String mbrId;

    private String mbrGrdCd;

    private String mbrNm;

    private String cpNo;

    private String email;

    private String badMbrYn;

    private String badMbrRsn;

    private String mktRcvAgrYn1;

    private String mktRcvAgrYn2;

    @JsonIgnore
    private Date regDt;

    @JsonIgnore
    private String regId;

    private static final long serialVersionUID = com.mushbird.sinsege.base.constant.AppConst.UID;

    public Integer getMbrChistId() {
        return mbrChistId;
    }

    public void setMbrChistId(Integer mbrChistId) {
        this.mbrChistId = mbrChistId;
    }

    public String getMbrId() {
        return mbrId;
    }

    public void setMbrId(String mbrId) {
        this.mbrId = mbrId == null ? null : mbrId.trim();
    }

    public String getMbrGrdCd() {
        return mbrGrdCd;
    }

    public void setMbrGrdCd(String mbrGrdCd) {
        this.mbrGrdCd = mbrGrdCd == null ? null : mbrGrdCd.trim();
    }

    public String getMbrNm() {
        return mbrNm;
    }

    public void setMbrNm(String mbrNm) {
        this.mbrNm = mbrNm == null ? null : mbrNm.trim();
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

    public String getBadMbrYn() {
        return badMbrYn;
    }

    public void setBadMbrYn(String badMbrYn) {
        this.badMbrYn = badMbrYn == null ? null : badMbrYn.trim();
    }

    public String getBadMbrRsn() {
        return badMbrRsn;
    }

    public void setBadMbrRsn(String badMbrRsn) {
        this.badMbrRsn = badMbrRsn == null ? null : badMbrRsn.trim();
    }

    public String getMktRcvAgrYn1() {
        return mktRcvAgrYn1;
    }

    public void setMktRcvAgrYn1(String mktRcvAgrYn1) {
        this.mktRcvAgrYn1 = mktRcvAgrYn1 == null ? null : mktRcvAgrYn1.trim();
    }

    public String getMktRcvAgrYn2() {
        return mktRcvAgrYn2;
    }

    public void setMktRcvAgrYn2(String mktRcvAgrYn2) {
        this.mktRcvAgrYn2 = mktRcvAgrYn2 == null ? null : mktRcvAgrYn2.trim();
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
        sb.append(", mbrChistId=").append(mbrChistId);
        sb.append(", mbrId=").append(mbrId);
        sb.append(", mbrGrdCd=").append(mbrGrdCd);
        sb.append(", mbrNm=").append(mbrNm);
        sb.append(", cpNo=").append(cpNo);
        sb.append(", email=").append(email);
        sb.append(", badMbrYn=").append(badMbrYn);
        sb.append(", badMbrRsn=").append(badMbrRsn);
        sb.append(", mktRcvAgrYn1=").append(mktRcvAgrYn1);
        sb.append(", mktRcvAgrYn2=").append(mktRcvAgrYn2);
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
        MemberChangeHistoryEntity other = (MemberChangeHistoryEntity) that;
        return (this.getMbrChistId() == null ? other.getMbrChistId() == null : this.getMbrChistId().equals(other.getMbrChistId()))
            && (this.getMbrId() == null ? other.getMbrId() == null : this.getMbrId().equals(other.getMbrId()))
            && (this.getMbrGrdCd() == null ? other.getMbrGrdCd() == null : this.getMbrGrdCd().equals(other.getMbrGrdCd()))
            && (this.getMbrNm() == null ? other.getMbrNm() == null : this.getMbrNm().equals(other.getMbrNm()))
            && (this.getCpNo() == null ? other.getCpNo() == null : this.getCpNo().equals(other.getCpNo()))
            && (this.getEmail() == null ? other.getEmail() == null : this.getEmail().equals(other.getEmail()))
            && (this.getBadMbrYn() == null ? other.getBadMbrYn() == null : this.getBadMbrYn().equals(other.getBadMbrYn()))
            && (this.getBadMbrRsn() == null ? other.getBadMbrRsn() == null : this.getBadMbrRsn().equals(other.getBadMbrRsn()))
            && (this.getMktRcvAgrYn1() == null ? other.getMktRcvAgrYn1() == null : this.getMktRcvAgrYn1().equals(other.getMktRcvAgrYn1()))
            && (this.getMktRcvAgrYn2() == null ? other.getMktRcvAgrYn2() == null : this.getMktRcvAgrYn2().equals(other.getMktRcvAgrYn2()))
            && (this.getRegDt() == null ? other.getRegDt() == null : this.getRegDt().equals(other.getRegDt()))
            && (this.getRegId() == null ? other.getRegId() == null : this.getRegId().equals(other.getRegId()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getMbrChistId() == null) ? 0 : getMbrChistId().hashCode());
        result = prime * result + ((getMbrId() == null) ? 0 : getMbrId().hashCode());
        result = prime * result + ((getMbrGrdCd() == null) ? 0 : getMbrGrdCd().hashCode());
        result = prime * result + ((getMbrNm() == null) ? 0 : getMbrNm().hashCode());
        result = prime * result + ((getCpNo() == null) ? 0 : getCpNo().hashCode());
        result = prime * result + ((getEmail() == null) ? 0 : getEmail().hashCode());
        result = prime * result + ((getBadMbrYn() == null) ? 0 : getBadMbrYn().hashCode());
        result = prime * result + ((getBadMbrRsn() == null) ? 0 : getBadMbrRsn().hashCode());
        result = prime * result + ((getMktRcvAgrYn1() == null) ? 0 : getMktRcvAgrYn1().hashCode());
        result = prime * result + ((getMktRcvAgrYn2() == null) ? 0 : getMktRcvAgrYn2().hashCode());
        result = prime * result + ((getRegDt() == null) ? 0 : getRegDt().hashCode());
        result = prime * result + ((getRegId() == null) ? 0 : getRegId().hashCode());
        return result;
    }
}