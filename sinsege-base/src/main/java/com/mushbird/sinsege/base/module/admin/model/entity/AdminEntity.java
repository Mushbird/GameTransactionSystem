package com.mushbird.sinsege.base.module.admin.model.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.mushbird.sinsege.base.model.BaseEntity;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Date;

public abstract class AdminEntity extends BaseEntity implements Serializable {
    private String admId;

    private Integer venId;

    private String admTpCd;

    private String admStatCd;

    private String admLgnId;

    private String admNm;

    private String email;

    private String cpCarrCd;

    private String cpNo;

    private String admSiteCd;

    private Integer admRoleId;

    private String aprvGrdCd;

    private Date supDt;

    private Date pwModDt;

    private Date lastLgnDt;

    private Date lastInfoModDt;

    private Integer lgnRtryCnt;

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

    public String getAdmId() {
        return admId;
    }

    public void setAdmId(String admId) {
        this.admId = admId == null ? null : admId.trim();
    }

    public Integer getVenId() {
        return venId;
    }

    public void setVenId(Integer venId) {
        this.venId = venId;
    }

    public String getAdmTpCd() {
        return admTpCd;
    }

    public void setAdmTpCd(String admTpCd) {
        this.admTpCd = admTpCd == null ? null : admTpCd.trim();
    }

    public String getAdmStatCd() {
        return admStatCd;
    }

    public void setAdmStatCd(String admStatCd) {
        this.admStatCd = admStatCd == null ? null : admStatCd.trim();
    }

    public String getAdmLgnId() {
        return admLgnId;
    }

    public void setAdmLgnId(String admLgnId) {
        this.admLgnId = admLgnId == null ? null : admLgnId.trim();
    }

    public String getAdmNm() {
        return admNm;
    }

    public void setAdmNm(String admNm) {
        this.admNm = admNm == null ? null : admNm.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
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

    public String getAdmSiteCd() {
        return admSiteCd;
    }

    public void setAdmSiteCd(String admSiteCd) {
        this.admSiteCd = admSiteCd == null ? null : admSiteCd.trim();
    }

    public Integer getAdmRoleId() {
        return admRoleId;
    }

    public void setAdmRoleId(Integer admRoleId) {
        this.admRoleId = admRoleId;
    }

    public String getAprvGrdCd() {
        return aprvGrdCd;
    }

    public void setAprvGrdCd(String aprvGrdCd) {
        this.aprvGrdCd = aprvGrdCd == null ? null : aprvGrdCd.trim();
    }

    public Date getSupDt() {
        return supDt;
    }

    public void setSupDt(Date supDt) {
        this.supDt = supDt;
    }

    public Date getPwModDt() {
        return pwModDt;
    }

    public void setPwModDt(Date pwModDt) {
        this.pwModDt = pwModDt;
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
        sb.append(", admId=").append(admId);
        sb.append(", venId=").append(venId);
        sb.append(", admTpCd=").append(admTpCd);
        sb.append(", admStatCd=").append(admStatCd);
        sb.append(", admLgnId=").append(admLgnId);
        sb.append(", admNm=").append(admNm);
        sb.append(", email=").append(email);
        sb.append(", cpCarrCd=").append(cpCarrCd);
        sb.append(", cpNo=").append(cpNo);
        sb.append(", admSiteCd=").append(admSiteCd);
        sb.append(", admRoleId=").append(admRoleId);
        sb.append(", aprvGrdCd=").append(aprvGrdCd);
        sb.append(", supDt=").append(supDt);
        sb.append(", pwModDt=").append(pwModDt);
        sb.append(", lastLgnDt=").append(lastLgnDt);
        sb.append(", lastInfoModDt=").append(lastInfoModDt);
        sb.append(", lgnRtryCnt=").append(lgnRtryCnt);
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
        AdminEntity other = (AdminEntity) that;
        return (this.getAdmId() == null ? other.getAdmId() == null : this.getAdmId().equals(other.getAdmId()))
            && (this.getVenId() == null ? other.getVenId() == null : this.getVenId().equals(other.getVenId()))
            && (this.getAdmTpCd() == null ? other.getAdmTpCd() == null : this.getAdmTpCd().equals(other.getAdmTpCd()))
            && (this.getAdmStatCd() == null ? other.getAdmStatCd() == null : this.getAdmStatCd().equals(other.getAdmStatCd()))
            && (this.getAdmLgnId() == null ? other.getAdmLgnId() == null : this.getAdmLgnId().equals(other.getAdmLgnId()))
            && (this.getAdmNm() == null ? other.getAdmNm() == null : this.getAdmNm().equals(other.getAdmNm()))
            && (this.getEmail() == null ? other.getEmail() == null : this.getEmail().equals(other.getEmail()))
            && (this.getCpCarrCd() == null ? other.getCpCarrCd() == null : this.getCpCarrCd().equals(other.getCpCarrCd()))
            && (this.getCpNo() == null ? other.getCpNo() == null : this.getCpNo().equals(other.getCpNo()))
            && (this.getAdmSiteCd() == null ? other.getAdmSiteCd() == null : this.getAdmSiteCd().equals(other.getAdmSiteCd()))
            && (this.getAdmRoleId() == null ? other.getAdmRoleId() == null : this.getAdmRoleId().equals(other.getAdmRoleId()))
            && (this.getAprvGrdCd() == null ? other.getAprvGrdCd() == null : this.getAprvGrdCd().equals(other.getAprvGrdCd()))
            && (this.getSupDt() == null ? other.getSupDt() == null : this.getSupDt().equals(other.getSupDt()))
            && (this.getPwModDt() == null ? other.getPwModDt() == null : this.getPwModDt().equals(other.getPwModDt()))
            && (this.getLastLgnDt() == null ? other.getLastLgnDt() == null : this.getLastLgnDt().equals(other.getLastLgnDt()))
            && (this.getLastInfoModDt() == null ? other.getLastInfoModDt() == null : this.getLastInfoModDt().equals(other.getLastInfoModDt()))
            && (this.getLgnRtryCnt() == null ? other.getLgnRtryCnt() == null : this.getLgnRtryCnt().equals(other.getLgnRtryCnt()))
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
        result = prime * result + ((getAdmId() == null) ? 0 : getAdmId().hashCode());
        result = prime * result + ((getVenId() == null) ? 0 : getVenId().hashCode());
        result = prime * result + ((getAdmTpCd() == null) ? 0 : getAdmTpCd().hashCode());
        result = prime * result + ((getAdmStatCd() == null) ? 0 : getAdmStatCd().hashCode());
        result = prime * result + ((getAdmLgnId() == null) ? 0 : getAdmLgnId().hashCode());
        result = prime * result + ((getAdmNm() == null) ? 0 : getAdmNm().hashCode());
        result = prime * result + ((getEmail() == null) ? 0 : getEmail().hashCode());
        result = prime * result + ((getCpCarrCd() == null) ? 0 : getCpCarrCd().hashCode());
        result = prime * result + ((getCpNo() == null) ? 0 : getCpNo().hashCode());
        result = prime * result + ((getAdmSiteCd() == null) ? 0 : getAdmSiteCd().hashCode());
        result = prime * result + ((getAdmRoleId() == null) ? 0 : getAdmRoleId().hashCode());
        result = prime * result + ((getAprvGrdCd() == null) ? 0 : getAprvGrdCd().hashCode());
        result = prime * result + ((getSupDt() == null) ? 0 : getSupDt().hashCode());
        result = prime * result + ((getPwModDt() == null) ? 0 : getPwModDt().hashCode());
        result = prime * result + ((getLastLgnDt() == null) ? 0 : getLastLgnDt().hashCode());
        result = prime * result + ((getLastInfoModDt() == null) ? 0 : getLastInfoModDt().hashCode());
        result = prime * result + ((getLgnRtryCnt() == null) ? 0 : getLgnRtryCnt().hashCode());
        result = prime * result + ((getRegDt() == null) ? 0 : getRegDt().hashCode());
        result = prime * result + ((getRegId() == null) ? 0 : getRegId().hashCode());
        result = prime * result + ((getModDt() == null) ? 0 : getModDt().hashCode());
        result = prime * result + ((getModId() == null) ? 0 : getModId().hashCode());
        result = prime * result + ((getUseYn() == null) ? 0 : getUseYn().hashCode());
        result = prime * result + (Arrays.hashCode(getPw()));
        return result;
    }
}