package com.mushbird.sinsege.base.module.display.model.entity;

import com.mushbird.sinsege.base.model.BaseEntity;
import java.io.Serializable;
import java.util.Date;

public abstract class DpBrandEntity extends BaseEntity implements Serializable {
    private Integer dpBrndId;

    private Integer venId;

    private String brndNm;

    private String brndNmGrpCd;

    private String brndEngNm;

    private String brndDesc;

    private String brndDtlDesc;

    private String brndStoryPc;

    private String brndStoryMob;

    private Integer dpCateId;

    private Integer banrLAtchGidPc;

    private Integer banrLAtchGidMob;

    private Integer banrMAtchGidPc;

    private Integer banrMAtchGidMob;

    private String linkUrlAddr;

    private String linkNwinYn;

    private Integer sord;

    private String dpYn;

    private Date regDt;

    private String regId;

    private Date modDt;

    private String modId;

    private String useYn;

    private static final long serialVersionUID = com.mushbird.sinsege.base.constant.AppConst.UID;

    public Integer getDpBrndId() {
        return dpBrndId;
    }

    public void setDpBrndId(Integer dpBrndId) {
        this.dpBrndId = dpBrndId;
    }

    public Integer getVenId() {
        return venId;
    }

    public void setVenId(Integer venId) {
        this.venId = venId;
    }

    public String getBrndNm() {
        return brndNm;
    }

    public void setBrndNm(String brndNm) {
        this.brndNm = brndNm == null ? null : brndNm.trim();
    }

    public String getBrndNmGrpCd() {
        return brndNmGrpCd;
    }

    public void setBrndNmGrpCd(String brndNmGrpCd) {
        this.brndNmGrpCd = brndNmGrpCd == null ? null : brndNmGrpCd.trim();
    }

    public String getBrndEngNm() {
        return brndEngNm;
    }

    public void setBrndEngNm(String brndEngNm) {
        this.brndEngNm = brndEngNm == null ? null : brndEngNm.trim();
    }

    public String getBrndDesc() {
        return brndDesc;
    }

    public void setBrndDesc(String brndDesc) {
        this.brndDesc = brndDesc == null ? null : brndDesc.trim();
    }

    public String getBrndDtlDesc() {
        return brndDtlDesc;
    }

    public void setBrndDtlDesc(String brndDtlDesc) {
        this.brndDtlDesc = brndDtlDesc == null ? null : brndDtlDesc.trim();
    }

    public String getBrndStoryPc() {
        return brndStoryPc;
    }

    public void setBrndStoryPc(String brndStoryPc) {
        this.brndStoryPc = brndStoryPc == null ? null : brndStoryPc.trim();
    }

    public String getBrndStoryMob() {
        return brndStoryMob;
    }

    public void setBrndStoryMob(String brndStoryMob) {
        this.brndStoryMob = brndStoryMob == null ? null : brndStoryMob.trim();
    }

    public Integer getDpCateId() {
        return dpCateId;
    }

    public void setDpCateId(Integer dpCateId) {
        this.dpCateId = dpCateId;
    }

    public Integer getBanrLAtchGidPc() {
        return banrLAtchGidPc;
    }

    public void setBanrLAtchGidPc(Integer banrLAtchGidPc) {
        this.banrLAtchGidPc = banrLAtchGidPc;
    }

    public Integer getBanrLAtchGidMob() {
        return banrLAtchGidMob;
    }

    public void setBanrLAtchGidMob(Integer banrLAtchGidMob) {
        this.banrLAtchGidMob = banrLAtchGidMob;
    }

    public Integer getBanrMAtchGidPc() {
        return banrMAtchGidPc;
    }

    public void setBanrMAtchGidPc(Integer banrMAtchGidPc) {
        this.banrMAtchGidPc = banrMAtchGidPc;
    }

    public Integer getBanrMAtchGidMob() {
        return banrMAtchGidMob;
    }

    public void setBanrMAtchGidMob(Integer banrMAtchGidMob) {
        this.banrMAtchGidMob = banrMAtchGidMob;
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
        sb.append(", dpBrndId=").append(dpBrndId);
        sb.append(", venId=").append(venId);
        sb.append(", brndNm=").append(brndNm);
        sb.append(", brndNmGrpCd=").append(brndNmGrpCd);
        sb.append(", brndEngNm=").append(brndEngNm);
        sb.append(", brndDesc=").append(brndDesc);
        sb.append(", brndDtlDesc=").append(brndDtlDesc);
        sb.append(", brndStoryPc=").append(brndStoryPc);
        sb.append(", brndStoryMob=").append(brndStoryMob);
        sb.append(", dpCateId=").append(dpCateId);
        sb.append(", banrLAtchGidPc=").append(banrLAtchGidPc);
        sb.append(", banrLAtchGidMob=").append(banrLAtchGidMob);
        sb.append(", banrMAtchGidPc=").append(banrMAtchGidPc);
        sb.append(", banrMAtchGidMob=").append(banrMAtchGidMob);
        sb.append(", linkUrlAddr=").append(linkUrlAddr);
        sb.append(", linkNwinYn=").append(linkNwinYn);
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
        DpBrandEntity other = (DpBrandEntity) that;
        return (this.getDpBrndId() == null ? other.getDpBrndId() == null : this.getDpBrndId().equals(other.getDpBrndId()))
            && (this.getVenId() == null ? other.getVenId() == null : this.getVenId().equals(other.getVenId()))
            && (this.getBrndNm() == null ? other.getBrndNm() == null : this.getBrndNm().equals(other.getBrndNm()))
            && (this.getBrndNmGrpCd() == null ? other.getBrndNmGrpCd() == null : this.getBrndNmGrpCd().equals(other.getBrndNmGrpCd()))
            && (this.getBrndEngNm() == null ? other.getBrndEngNm() == null : this.getBrndEngNm().equals(other.getBrndEngNm()))
            && (this.getBrndDesc() == null ? other.getBrndDesc() == null : this.getBrndDesc().equals(other.getBrndDesc()))
            && (this.getBrndDtlDesc() == null ? other.getBrndDtlDesc() == null : this.getBrndDtlDesc().equals(other.getBrndDtlDesc()))
            && (this.getBrndStoryPc() == null ? other.getBrndStoryPc() == null : this.getBrndStoryPc().equals(other.getBrndStoryPc()))
            && (this.getBrndStoryMob() == null ? other.getBrndStoryMob() == null : this.getBrndStoryMob().equals(other.getBrndStoryMob()))
            && (this.getDpCateId() == null ? other.getDpCateId() == null : this.getDpCateId().equals(other.getDpCateId()))
            && (this.getBanrLAtchGidPc() == null ? other.getBanrLAtchGidPc() == null : this.getBanrLAtchGidPc().equals(other.getBanrLAtchGidPc()))
            && (this.getBanrLAtchGidMob() == null ? other.getBanrLAtchGidMob() == null : this.getBanrLAtchGidMob().equals(other.getBanrLAtchGidMob()))
            && (this.getBanrMAtchGidPc() == null ? other.getBanrMAtchGidPc() == null : this.getBanrMAtchGidPc().equals(other.getBanrMAtchGidPc()))
            && (this.getBanrMAtchGidMob() == null ? other.getBanrMAtchGidMob() == null : this.getBanrMAtchGidMob().equals(other.getBanrMAtchGidMob()))
            && (this.getLinkUrlAddr() == null ? other.getLinkUrlAddr() == null : this.getLinkUrlAddr().equals(other.getLinkUrlAddr()))
            && (this.getLinkNwinYn() == null ? other.getLinkNwinYn() == null : this.getLinkNwinYn().equals(other.getLinkNwinYn()))
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
        result = prime * result + ((getDpBrndId() == null) ? 0 : getDpBrndId().hashCode());
        result = prime * result + ((getVenId() == null) ? 0 : getVenId().hashCode());
        result = prime * result + ((getBrndNm() == null) ? 0 : getBrndNm().hashCode());
        result = prime * result + ((getBrndNmGrpCd() == null) ? 0 : getBrndNmGrpCd().hashCode());
        result = prime * result + ((getBrndEngNm() == null) ? 0 : getBrndEngNm().hashCode());
        result = prime * result + ((getBrndDesc() == null) ? 0 : getBrndDesc().hashCode());
        result = prime * result + ((getBrndDtlDesc() == null) ? 0 : getBrndDtlDesc().hashCode());
        result = prime * result + ((getBrndStoryPc() == null) ? 0 : getBrndStoryPc().hashCode());
        result = prime * result + ((getBrndStoryMob() == null) ? 0 : getBrndStoryMob().hashCode());
        result = prime * result + ((getDpCateId() == null) ? 0 : getDpCateId().hashCode());
        result = prime * result + ((getBanrLAtchGidPc() == null) ? 0 : getBanrLAtchGidPc().hashCode());
        result = prime * result + ((getBanrLAtchGidMob() == null) ? 0 : getBanrLAtchGidMob().hashCode());
        result = prime * result + ((getBanrMAtchGidPc() == null) ? 0 : getBanrMAtchGidPc().hashCode());
        result = prime * result + ((getBanrMAtchGidMob() == null) ? 0 : getBanrMAtchGidMob().hashCode());
        result = prime * result + ((getLinkUrlAddr() == null) ? 0 : getLinkUrlAddr().hashCode());
        result = prime * result + ((getLinkNwinYn() == null) ? 0 : getLinkNwinYn().hashCode());
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