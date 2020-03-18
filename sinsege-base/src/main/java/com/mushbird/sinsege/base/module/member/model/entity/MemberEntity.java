package com.mushbird.sinsege.base.module.member.model.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.mushbird.sinsege.base.model.BaseEntity;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Date;

public abstract class MemberEntity extends BaseEntity implements Serializable {
    private String mbrId;

    private String mbrStatCd;

    private String mbrGrdCd;

    private String mbrLgnId;

    private String mbrNm;

    private String email;

    private String brthYmd;

    private String gndrCd;

    private String telNo;

    private String cpCarrCd;

    private String cpNo;

    private String idvrfYn;

    private String idvrfTpCd;

    private Date idvrfDt;

    private String ciVal;

    private String diVal;

    private String badMbrYn;

    private String rcmndeCd;

    private String supPathClCd;

    private String supPathCd;

    private String supPathNm;

    private Date supDt;

    private Date mbrGrdChgDt;

    private Date pwModDt;

    private Date pwModGdeDt;

    private Date lastLgnDt;

    private Date lastInfoModDt;

    private Integer lgnRtryCnt;

    private String admId;

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

    private byte[] pw;

    private static final long serialVersionUID = com.mushbird.sinsege.base.constant.AppConst.UID;

    public String getMbrId() {
        return mbrId;
    }

    public void setMbrId(String mbrId) {
        this.mbrId = mbrId == null ? null : mbrId.trim();
    }

    public String getMbrStatCd() {
        return mbrStatCd;
    }

    public void setMbrStatCd(String mbrStatCd) {
        this.mbrStatCd = mbrStatCd == null ? null : mbrStatCd.trim();
    }

    public String getMbrGrdCd() {
        return mbrGrdCd;
    }

    public void setMbrGrdCd(String mbrGrdCd) {
        this.mbrGrdCd = mbrGrdCd == null ? null : mbrGrdCd.trim();
    }

    public String getMbrLgnId() {
        return mbrLgnId;
    }

    public void setMbrLgnId(String mbrLgnId) {
        this.mbrLgnId = mbrLgnId == null ? null : mbrLgnId.trim();
    }

    public String getMbrNm() {
        return mbrNm;
    }

    public void setMbrNm(String mbrNm) {
        this.mbrNm = mbrNm == null ? null : mbrNm.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getBrthYmd() {
        return brthYmd;
    }

    public void setBrthYmd(String brthYmd) {
        this.brthYmd = brthYmd == null ? null : brthYmd.trim();
    }

    public String getGndrCd() {
        return gndrCd;
    }

    public void setGndrCd(String gndrCd) {
        this.gndrCd = gndrCd == null ? null : gndrCd.trim();
    }

    public String getTelNo() {
        return telNo;
    }

    public void setTelNo(String telNo) {
        this.telNo = telNo == null ? null : telNo.trim();
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

    public String getIdvrfYn() {
        return idvrfYn;
    }

    public void setIdvrfYn(String idvrfYn) {
        this.idvrfYn = idvrfYn == null ? null : idvrfYn.trim();
    }

    public String getIdvrfTpCd() {
        return idvrfTpCd;
    }

    public void setIdvrfTpCd(String idvrfTpCd) {
        this.idvrfTpCd = idvrfTpCd == null ? null : idvrfTpCd.trim();
    }

    public Date getIdvrfDt() {
        return idvrfDt;
    }

    public void setIdvrfDt(Date idvrfDt) {
        this.idvrfDt = idvrfDt;
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

    public String getBadMbrYn() {
        return badMbrYn;
    }

    public void setBadMbrYn(String badMbrYn) {
        this.badMbrYn = badMbrYn == null ? null : badMbrYn.trim();
    }

    public String getRcmndeCd() {
        return rcmndeCd;
    }

    public void setRcmndeCd(String rcmndeCd) {
        this.rcmndeCd = rcmndeCd == null ? null : rcmndeCd.trim();
    }

    public String getSupPathClCd() {
        return supPathClCd;
    }

    public void setSupPathClCd(String supPathClCd) {
        this.supPathClCd = supPathClCd == null ? null : supPathClCd.trim();
    }

    public String getSupPathCd() {
        return supPathCd;
    }

    public void setSupPathCd(String supPathCd) {
        this.supPathCd = supPathCd == null ? null : supPathCd.trim();
    }

    public String getSupPathNm() {
        return supPathNm;
    }

    public void setSupPathNm(String supPathNm) {
        this.supPathNm = supPathNm == null ? null : supPathNm.trim();
    }

    public Date getSupDt() {
        return supDt;
    }

    public void setSupDt(Date supDt) {
        this.supDt = supDt;
    }

    public Date getMbrGrdChgDt() {
        return mbrGrdChgDt;
    }

    public void setMbrGrdChgDt(Date mbrGrdChgDt) {
        this.mbrGrdChgDt = mbrGrdChgDt;
    }

    public Date getPwModDt() {
        return pwModDt;
    }

    public void setPwModDt(Date pwModDt) {
        this.pwModDt = pwModDt;
    }

    public Date getPwModGdeDt() {
        return pwModGdeDt;
    }

    public void setPwModGdeDt(Date pwModGdeDt) {
        this.pwModGdeDt = pwModGdeDt;
    }

    public Date getLastLgnDt() {
        return lastLgnDt;
    }

    public void setLastLgnDt(Date lastLgnDt) {
        this.lastLgnDt = lastLgnDt;
    }

    public Date getLastInfoModDt() {
        return lastInfoModDt;
    }

    public void setLastInfoModDt(Date lastInfoModDt) {
        this.lastInfoModDt = lastInfoModDt;
    }

    public Integer getLgnRtryCnt() {
        return lgnRtryCnt;
    }

    public void setLgnRtryCnt(Integer lgnRtryCnt) {
        this.lgnRtryCnt = lgnRtryCnt;
    }

    public String getAdmId() {
        return admId;
    }

    public void setAdmId(String admId) {
        this.admId = admId == null ? null : admId.trim();
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

    public byte[] getPw() {
        return pw;
    }

    public void setPw(byte[] pw) {
        this.pw = pw;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", mbrId=").append(mbrId);
        sb.append(", mbrStatCd=").append(mbrStatCd);
        sb.append(", mbrGrdCd=").append(mbrGrdCd);
        sb.append(", mbrLgnId=").append(mbrLgnId);
        sb.append(", mbrNm=").append(mbrNm);
        sb.append(", email=").append(email);
        sb.append(", brthYmd=").append(brthYmd);
        sb.append(", gndrCd=").append(gndrCd);
        sb.append(", telNo=").append(telNo);
        sb.append(", cpCarrCd=").append(cpCarrCd);
        sb.append(", cpNo=").append(cpNo);
        sb.append(", idvrfYn=").append(idvrfYn);
        sb.append(", idvrfTpCd=").append(idvrfTpCd);
        sb.append(", idvrfDt=").append(idvrfDt);
        sb.append(", ciVal=").append(ciVal);
        sb.append(", diVal=").append(diVal);
        sb.append(", badMbrYn=").append(badMbrYn);
        sb.append(", rcmndeCd=").append(rcmndeCd);
        sb.append(", supPathClCd=").append(supPathClCd);
        sb.append(", supPathCd=").append(supPathCd);
        sb.append(", supPathNm=").append(supPathNm);
        sb.append(", supDt=").append(supDt);
        sb.append(", mbrGrdChgDt=").append(mbrGrdChgDt);
        sb.append(", pwModDt=").append(pwModDt);
        sb.append(", pwModGdeDt=").append(pwModGdeDt);
        sb.append(", lastLgnDt=").append(lastLgnDt);
        sb.append(", lastInfoModDt=").append(lastInfoModDt);
        sb.append(", lgnRtryCnt=").append(lgnRtryCnt);
        sb.append(", admId=").append(admId);
        sb.append(", regDt=").append(regDt);
        sb.append(", regId=").append(regId);
        sb.append(", modDt=").append(modDt);
        sb.append(", modId=").append(modId);
        sb.append(", useYn=").append(useYn);
        sb.append(", pw=").append(pw);
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
        MemberEntity other = (MemberEntity) that;
        return (this.getMbrId() == null ? other.getMbrId() == null : this.getMbrId().equals(other.getMbrId()))
            && (this.getMbrStatCd() == null ? other.getMbrStatCd() == null : this.getMbrStatCd().equals(other.getMbrStatCd()))
            && (this.getMbrGrdCd() == null ? other.getMbrGrdCd() == null : this.getMbrGrdCd().equals(other.getMbrGrdCd()))
            && (this.getMbrLgnId() == null ? other.getMbrLgnId() == null : this.getMbrLgnId().equals(other.getMbrLgnId()))
            && (this.getMbrNm() == null ? other.getMbrNm() == null : this.getMbrNm().equals(other.getMbrNm()))
            && (this.getEmail() == null ? other.getEmail() == null : this.getEmail().equals(other.getEmail()))
            && (this.getBrthYmd() == null ? other.getBrthYmd() == null : this.getBrthYmd().equals(other.getBrthYmd()))
            && (this.getGndrCd() == null ? other.getGndrCd() == null : this.getGndrCd().equals(other.getGndrCd()))
            && (this.getTelNo() == null ? other.getTelNo() == null : this.getTelNo().equals(other.getTelNo()))
            && (this.getCpCarrCd() == null ? other.getCpCarrCd() == null : this.getCpCarrCd().equals(other.getCpCarrCd()))
            && (this.getCpNo() == null ? other.getCpNo() == null : this.getCpNo().equals(other.getCpNo()))
            && (this.getIdvrfYn() == null ? other.getIdvrfYn() == null : this.getIdvrfYn().equals(other.getIdvrfYn()))
            && (this.getIdvrfTpCd() == null ? other.getIdvrfTpCd() == null : this.getIdvrfTpCd().equals(other.getIdvrfTpCd()))
            && (this.getIdvrfDt() == null ? other.getIdvrfDt() == null : this.getIdvrfDt().equals(other.getIdvrfDt()))
            && (this.getCiVal() == null ? other.getCiVal() == null : this.getCiVal().equals(other.getCiVal()))
            && (this.getDiVal() == null ? other.getDiVal() == null : this.getDiVal().equals(other.getDiVal()))
            && (this.getBadMbrYn() == null ? other.getBadMbrYn() == null : this.getBadMbrYn().equals(other.getBadMbrYn()))
            && (this.getRcmndeCd() == null ? other.getRcmndeCd() == null : this.getRcmndeCd().equals(other.getRcmndeCd()))
            && (this.getSupPathClCd() == null ? other.getSupPathClCd() == null : this.getSupPathClCd().equals(other.getSupPathClCd()))
            && (this.getSupPathCd() == null ? other.getSupPathCd() == null : this.getSupPathCd().equals(other.getSupPathCd()))
            && (this.getSupPathNm() == null ? other.getSupPathNm() == null : this.getSupPathNm().equals(other.getSupPathNm()))
            && (this.getSupDt() == null ? other.getSupDt() == null : this.getSupDt().equals(other.getSupDt()))
            && (this.getMbrGrdChgDt() == null ? other.getMbrGrdChgDt() == null : this.getMbrGrdChgDt().equals(other.getMbrGrdChgDt()))
            && (this.getPwModDt() == null ? other.getPwModDt() == null : this.getPwModDt().equals(other.getPwModDt()))
            && (this.getPwModGdeDt() == null ? other.getPwModGdeDt() == null : this.getPwModGdeDt().equals(other.getPwModGdeDt()))
            && (this.getLastLgnDt() == null ? other.getLastLgnDt() == null : this.getLastLgnDt().equals(other.getLastLgnDt()))
            && (this.getLastInfoModDt() == null ? other.getLastInfoModDt() == null : this.getLastInfoModDt().equals(other.getLastInfoModDt()))
            && (this.getLgnRtryCnt() == null ? other.getLgnRtryCnt() == null : this.getLgnRtryCnt().equals(other.getLgnRtryCnt()))
            && (this.getAdmId() == null ? other.getAdmId() == null : this.getAdmId().equals(other.getAdmId()))
            && (this.getRegDt() == null ? other.getRegDt() == null : this.getRegDt().equals(other.getRegDt()))
            && (this.getRegId() == null ? other.getRegId() == null : this.getRegId().equals(other.getRegId()))
            && (this.getModDt() == null ? other.getModDt() == null : this.getModDt().equals(other.getModDt()))
            && (this.getModId() == null ? other.getModId() == null : this.getModId().equals(other.getModId()))
            && (this.getUseYn() == null ? other.getUseYn() == null : this.getUseYn().equals(other.getUseYn()))
            && (Arrays.equals(this.getPw(), other.getPw()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getMbrId() == null) ? 0 : getMbrId().hashCode());
        result = prime * result + ((getMbrStatCd() == null) ? 0 : getMbrStatCd().hashCode());
        result = prime * result + ((getMbrGrdCd() == null) ? 0 : getMbrGrdCd().hashCode());
        result = prime * result + ((getMbrLgnId() == null) ? 0 : getMbrLgnId().hashCode());
        result = prime * result + ((getMbrNm() == null) ? 0 : getMbrNm().hashCode());
        result = prime * result + ((getEmail() == null) ? 0 : getEmail().hashCode());
        result = prime * result + ((getBrthYmd() == null) ? 0 : getBrthYmd().hashCode());
        result = prime * result + ((getGndrCd() == null) ? 0 : getGndrCd().hashCode());
        result = prime * result + ((getTelNo() == null) ? 0 : getTelNo().hashCode());
        result = prime * result + ((getCpCarrCd() == null) ? 0 : getCpCarrCd().hashCode());
        result = prime * result + ((getCpNo() == null) ? 0 : getCpNo().hashCode());
        result = prime * result + ((getIdvrfYn() == null) ? 0 : getIdvrfYn().hashCode());
        result = prime * result + ((getIdvrfTpCd() == null) ? 0 : getIdvrfTpCd().hashCode());
        result = prime * result + ((getIdvrfDt() == null) ? 0 : getIdvrfDt().hashCode());
        result = prime * result + ((getCiVal() == null) ? 0 : getCiVal().hashCode());
        result = prime * result + ((getDiVal() == null) ? 0 : getDiVal().hashCode());
        result = prime * result + ((getBadMbrYn() == null) ? 0 : getBadMbrYn().hashCode());
        result = prime * result + ((getRcmndeCd() == null) ? 0 : getRcmndeCd().hashCode());
        result = prime * result + ((getSupPathClCd() == null) ? 0 : getSupPathClCd().hashCode());
        result = prime * result + ((getSupPathCd() == null) ? 0 : getSupPathCd().hashCode());
        result = prime * result + ((getSupPathNm() == null) ? 0 : getSupPathNm().hashCode());
        result = prime * result + ((getSupDt() == null) ? 0 : getSupDt().hashCode());
        result = prime * result + ((getMbrGrdChgDt() == null) ? 0 : getMbrGrdChgDt().hashCode());
        result = prime * result + ((getPwModDt() == null) ? 0 : getPwModDt().hashCode());
        result = prime * result + ((getPwModGdeDt() == null) ? 0 : getPwModGdeDt().hashCode());
        result = prime * result + ((getLastLgnDt() == null) ? 0 : getLastLgnDt().hashCode());
        result = prime * result + ((getLastInfoModDt() == null) ? 0 : getLastInfoModDt().hashCode());
        result = prime * result + ((getLgnRtryCnt() == null) ? 0 : getLgnRtryCnt().hashCode());
        result = prime * result + ((getAdmId() == null) ? 0 : getAdmId().hashCode());
        result = prime * result + ((getRegDt() == null) ? 0 : getRegDt().hashCode());
        result = prime * result + ((getRegId() == null) ? 0 : getRegId().hashCode());
        result = prime * result + ((getModDt() == null) ? 0 : getModDt().hashCode());
        result = prime * result + ((getModId() == null) ? 0 : getModId().hashCode());
        result = prime * result + ((getUseYn() == null) ? 0 : getUseYn().hashCode());
        result = prime * result + (Arrays.hashCode(getPw()));
        return result;
    }
}