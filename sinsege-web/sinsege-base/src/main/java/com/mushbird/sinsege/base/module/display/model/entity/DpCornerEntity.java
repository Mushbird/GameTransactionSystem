package com.mushbird.sinsege.base.module.display.model.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.mushbird.sinsege.base.model.BaseEntity;
import java.io.Serializable;
import java.util.Date;

public abstract class DpCornerEntity extends BaseEntity implements Serializable {
    private String dpConrCd;

    private Integer dpChId;

    private String conrNm;

    private String conrGrpClCd;

    private String conrNmDpYn;

    private String conrDesc;

    private String conrContPc;

    private String conrContMob;

    private String linkUrlAddr;

    private String linkNwinYn;

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

    public String getDpConrCd() {
        return dpConrCd;
    }

    public void setDpConrCd(String dpConrCd) {
        this.dpConrCd = dpConrCd == null ? null : dpConrCd.trim();
    }

    public Integer getDpChId() {
        return dpChId;
    }

    public void setDpChId(Integer dpChId) {
        this.dpChId = dpChId;
    }

    public String getConrNm() {
        return conrNm;
    }

    public void setConrNm(String conrNm) {
        this.conrNm = conrNm == null ? null : conrNm.trim();
    }

    public String getConrGrpClCd() {
        return conrGrpClCd;
    }

    public void setConrGrpClCd(String conrGrpClCd) {
        this.conrGrpClCd = conrGrpClCd == null ? null : conrGrpClCd.trim();
    }

    public String getConrNmDpYn() {
        return conrNmDpYn;
    }

    public void setConrNmDpYn(String conrNmDpYn) {
        this.conrNmDpYn = conrNmDpYn == null ? null : conrNmDpYn.trim();
    }

    public String getConrDesc() {
        return conrDesc;
    }

    public void setConrDesc(String conrDesc) {
        this.conrDesc = conrDesc == null ? null : conrDesc.trim();
    }

    public String getConrContPc() {
        return conrContPc;
    }

    public void setConrContPc(String conrContPc) {
        this.conrContPc = conrContPc == null ? null : conrContPc.trim();
    }

    public String getConrContMob() {
        return conrContMob;
    }

    public void setConrContMob(String conrContMob) {
        this.conrContMob = conrContMob == null ? null : conrContMob.trim();
    }

    public String getLinkUrlAddr() {
        return linkUrlAddr;
    }

    public void setLinkUrlAddr(String linkUrlAddr) {
        this.linkUrlAddr = linkUrlAddr == null ? null : linkUrlAddr.trim();
    }

    public String getLinkNwinYn() {
        return linkNwinYn;
    }

    public void setLinkNwinYn(String linkNwinYn) {
        this.linkNwinYn = linkNwinYn == null ? null : linkNwinYn.trim();
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
        sb.append(", dpConrCd=").append(dpConrCd);
        sb.append(", dpChId=").append(dpChId);
        sb.append(", conrNm=").append(conrNm);
        sb.append(", conrGrpClCd=").append(conrGrpClCd);
        sb.append(", conrNmDpYn=").append(conrNmDpYn);
        sb.append(", conrDesc=").append(conrDesc);
        sb.append(", conrContPc=").append(conrContPc);
        sb.append(", conrContMob=").append(conrContMob);
        sb.append(", linkUrlAddr=").append(linkUrlAddr);
        sb.append(", linkNwinYn=").append(linkNwinYn);
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
        DpCornerEntity other = (DpCornerEntity) that;
        return (this.getDpConrCd() == null ? other.getDpConrCd() == null : this.getDpConrCd().equals(other.getDpConrCd()))
            && (this.getDpChId() == null ? other.getDpChId() == null : this.getDpChId().equals(other.getDpChId()))
            && (this.getConrNm() == null ? other.getConrNm() == null : this.getConrNm().equals(other.getConrNm()))
            && (this.getConrGrpClCd() == null ? other.getConrGrpClCd() == null : this.getConrGrpClCd().equals(other.getConrGrpClCd()))
            && (this.getConrNmDpYn() == null ? other.getConrNmDpYn() == null : this.getConrNmDpYn().equals(other.getConrNmDpYn()))
            && (this.getConrDesc() == null ? other.getConrDesc() == null : this.getConrDesc().equals(other.getConrDesc()))
            && (this.getConrContPc() == null ? other.getConrContPc() == null : this.getConrContPc().equals(other.getConrContPc()))
            && (this.getConrContMob() == null ? other.getConrContMob() == null : this.getConrContMob().equals(other.getConrContMob()))
            && (this.getLinkUrlAddr() == null ? other.getLinkUrlAddr() == null : this.getLinkUrlAddr().equals(other.getLinkUrlAddr()))
            && (this.getLinkNwinYn() == null ? other.getLinkNwinYn() == null : this.getLinkNwinYn().equals(other.getLinkNwinYn()))
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
        result = prime * result + ((getDpConrCd() == null) ? 0 : getDpConrCd().hashCode());
        result = prime * result + ((getDpChId() == null) ? 0 : getDpChId().hashCode());
        result = prime * result + ((getConrNm() == null) ? 0 : getConrNm().hashCode());
        result = prime * result + ((getConrGrpClCd() == null) ? 0 : getConrGrpClCd().hashCode());
        result = prime * result + ((getConrNmDpYn() == null) ? 0 : getConrNmDpYn().hashCode());
        result = prime * result + ((getConrDesc() == null) ? 0 : getConrDesc().hashCode());
        result = prime * result + ((getConrContPc() == null) ? 0 : getConrContPc().hashCode());
        result = prime * result + ((getConrContMob() == null) ? 0 : getConrContMob().hashCode());
        result = prime * result + ((getLinkUrlAddr() == null) ? 0 : getLinkUrlAddr().hashCode());
        result = prime * result + ((getLinkNwinYn() == null) ? 0 : getLinkNwinYn().hashCode());
        result = prime * result + ((getDpYn() == null) ? 0 : getDpYn().hashCode());
        result = prime * result + ((getRegDt() == null) ? 0 : getRegDt().hashCode());
        result = prime * result + ((getRegId() == null) ? 0 : getRegId().hashCode());
        result = prime * result + ((getModDt() == null) ? 0 : getModDt().hashCode());
        result = prime * result + ((getModId() == null) ? 0 : getModId().hashCode());
        result = prime * result + ((getUseYn() == null) ? 0 : getUseYn().hashCode());
        return result;
    }
}