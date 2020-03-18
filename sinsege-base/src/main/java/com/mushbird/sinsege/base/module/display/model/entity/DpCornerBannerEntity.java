package com.mushbird.sinsege.base.module.display.model.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.mushbird.sinsege.base.model.BaseEntity;
import java.io.Serializable;
import java.util.Date;

public abstract class DpCornerBannerEntity extends BaseEntity implements Serializable {
    private Integer dpConrBanrId;

    private String dpConrCd;

    private String dpEnvCd;

    private String banrNm;

    private String banrTitPc;

    private String banrTitMob;

    private Integer banrAtchGidPc;

    private Integer banrAtchGidMob;

    private String bgColorVal;

    private String linkUrlAddr;

    private String linkNwinYn;

    private String kwdVal;

    private Date dpStDt;

    private Date dpEdDt;

    private String dpYn;

    private Integer sord;

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

    public Integer getDpConrBanrId() {
        return dpConrBanrId;
    }

    public void setDpConrBanrId(Integer dpConrBanrId) {
        this.dpConrBanrId = dpConrBanrId;
    }

    public String getDpConrCd() {
        return dpConrCd;
    }

    public void setDpConrCd(String dpConrCd) {
        this.dpConrCd = dpConrCd == null ? null : dpConrCd.trim();
    }

    public String getDpEnvCd() {
        return dpEnvCd;
    }

    public void setDpEnvCd(String dpEnvCd) {
        this.dpEnvCd = dpEnvCd == null ? null : dpEnvCd.trim();
    }

    public String getBanrNm() {
        return banrNm;
    }

    public void setBanrNm(String banrNm) {
        this.banrNm = banrNm == null ? null : banrNm.trim();
    }

    public String getBanrTitPc() {
        return banrTitPc;
    }

    public void setBanrTitPc(String banrTitPc) {
        this.banrTitPc = banrTitPc == null ? null : banrTitPc.trim();
    }

    public String getBanrTitMob() {
        return banrTitMob;
    }

    public void setBanrTitMob(String banrTitMob) {
        this.banrTitMob = banrTitMob == null ? null : banrTitMob.trim();
    }

    public Integer getBanrAtchGidPc() {
        return banrAtchGidPc;
    }

    public void setBanrAtchGidPc(Integer banrAtchGidPc) {
        this.banrAtchGidPc = banrAtchGidPc;
    }

    public Integer getBanrAtchGidMob() {
        return banrAtchGidMob;
    }

    public void setBanrAtchGidMob(Integer banrAtchGidMob) {
        this.banrAtchGidMob = banrAtchGidMob;
    }

    public String getBgColorVal() {
        return bgColorVal;
    }

    public void setBgColorVal(String bgColorVal) {
        this.bgColorVal = bgColorVal == null ? null : bgColorVal.trim();
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

    public String getKwdVal() {
        return kwdVal;
    }

    public void setKwdVal(String kwdVal) {
        this.kwdVal = kwdVal == null ? null : kwdVal.trim();
    }

    public Date getDpStDt() {
        return dpStDt;
    }

    public void setDpStDt(Date dpStDt) {
        this.dpStDt = dpStDt;
    }

    public Date getDpEdDt() {
        return dpEdDt;
    }

    public void setDpEdDt(Date dpEdDt) {
        this.dpEdDt = dpEdDt;
    }

    public String getDpYn() {
        return dpYn;
    }

    public void setDpYn(String dpYn) {
        this.dpYn = dpYn == null ? null : dpYn.trim();
    }

    public Integer getSord() {
        return sord;
    }

    public void setSord(Integer sord) {
        this.sord = sord;
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
        sb.append(", dpConrBanrId=").append(dpConrBanrId);
        sb.append(", dpConrCd=").append(dpConrCd);
        sb.append(", dpEnvCd=").append(dpEnvCd);
        sb.append(", banrNm=").append(banrNm);
        sb.append(", banrTitPc=").append(banrTitPc);
        sb.append(", banrTitMob=").append(banrTitMob);
        sb.append(", banrAtchGidPc=").append(banrAtchGidPc);
        sb.append(", banrAtchGidMob=").append(banrAtchGidMob);
        sb.append(", bgColorVal=").append(bgColorVal);
        sb.append(", linkUrlAddr=").append(linkUrlAddr);
        sb.append(", linkNwinYn=").append(linkNwinYn);
        sb.append(", kwdVal=").append(kwdVal);
        sb.append(", dpStDt=").append(dpStDt);
        sb.append(", dpEdDt=").append(dpEdDt);
        sb.append(", dpYn=").append(dpYn);
        sb.append(", sord=").append(sord);
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
        DpCornerBannerEntity other = (DpCornerBannerEntity) that;
        return (this.getDpConrBanrId() == null ? other.getDpConrBanrId() == null : this.getDpConrBanrId().equals(other.getDpConrBanrId()))
            && (this.getDpConrCd() == null ? other.getDpConrCd() == null : this.getDpConrCd().equals(other.getDpConrCd()))
            && (this.getDpEnvCd() == null ? other.getDpEnvCd() == null : this.getDpEnvCd().equals(other.getDpEnvCd()))
            && (this.getBanrNm() == null ? other.getBanrNm() == null : this.getBanrNm().equals(other.getBanrNm()))
            && (this.getBanrTitPc() == null ? other.getBanrTitPc() == null : this.getBanrTitPc().equals(other.getBanrTitPc()))
            && (this.getBanrTitMob() == null ? other.getBanrTitMob() == null : this.getBanrTitMob().equals(other.getBanrTitMob()))
            && (this.getBanrAtchGidPc() == null ? other.getBanrAtchGidPc() == null : this.getBanrAtchGidPc().equals(other.getBanrAtchGidPc()))
            && (this.getBanrAtchGidMob() == null ? other.getBanrAtchGidMob() == null : this.getBanrAtchGidMob().equals(other.getBanrAtchGidMob()))
            && (this.getBgColorVal() == null ? other.getBgColorVal() == null : this.getBgColorVal().equals(other.getBgColorVal()))
            && (this.getLinkUrlAddr() == null ? other.getLinkUrlAddr() == null : this.getLinkUrlAddr().equals(other.getLinkUrlAddr()))
            && (this.getLinkNwinYn() == null ? other.getLinkNwinYn() == null : this.getLinkNwinYn().equals(other.getLinkNwinYn()))
            && (this.getKwdVal() == null ? other.getKwdVal() == null : this.getKwdVal().equals(other.getKwdVal()))
            && (this.getDpStDt() == null ? other.getDpStDt() == null : this.getDpStDt().equals(other.getDpStDt()))
            && (this.getDpEdDt() == null ? other.getDpEdDt() == null : this.getDpEdDt().equals(other.getDpEdDt()))
            && (this.getDpYn() == null ? other.getDpYn() == null : this.getDpYn().equals(other.getDpYn()))
            && (this.getSord() == null ? other.getSord() == null : this.getSord().equals(other.getSord()))
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
        result = prime * result + ((getDpConrBanrId() == null) ? 0 : getDpConrBanrId().hashCode());
        result = prime * result + ((getDpConrCd() == null) ? 0 : getDpConrCd().hashCode());
        result = prime * result + ((getDpEnvCd() == null) ? 0 : getDpEnvCd().hashCode());
        result = prime * result + ((getBanrNm() == null) ? 0 : getBanrNm().hashCode());
        result = prime * result + ((getBanrTitPc() == null) ? 0 : getBanrTitPc().hashCode());
        result = prime * result + ((getBanrTitMob() == null) ? 0 : getBanrTitMob().hashCode());
        result = prime * result + ((getBanrAtchGidPc() == null) ? 0 : getBanrAtchGidPc().hashCode());
        result = prime * result + ((getBanrAtchGidMob() == null) ? 0 : getBanrAtchGidMob().hashCode());
        result = prime * result + ((getBgColorVal() == null) ? 0 : getBgColorVal().hashCode());
        result = prime * result + ((getLinkUrlAddr() == null) ? 0 : getLinkUrlAddr().hashCode());
        result = prime * result + ((getLinkNwinYn() == null) ? 0 : getLinkNwinYn().hashCode());
        result = prime * result + ((getKwdVal() == null) ? 0 : getKwdVal().hashCode());
        result = prime * result + ((getDpStDt() == null) ? 0 : getDpStDt().hashCode());
        result = prime * result + ((getDpEdDt() == null) ? 0 : getDpEdDt().hashCode());
        result = prime * result + ((getDpYn() == null) ? 0 : getDpYn().hashCode());
        result = prime * result + ((getSord() == null) ? 0 : getSord().hashCode());
        result = prime * result + ((getRegDt() == null) ? 0 : getRegDt().hashCode());
        result = prime * result + ((getRegId() == null) ? 0 : getRegId().hashCode());
        result = prime * result + ((getModDt() == null) ? 0 : getModDt().hashCode());
        result = prime * result + ((getModId() == null) ? 0 : getModId().hashCode());
        result = prime * result + ((getUseYn() == null) ? 0 : getUseYn().hashCode());
        return result;
    }
}