package com.mushbird.sinsege.base.module.system.model.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.mushbird.sinsege.base.model.BaseEntity;
import java.io.Serializable;
import java.util.Date;

public abstract class SiteBenefitEntity extends BaseEntity implements Serializable {
    private String siteId;

    private String siteBenfTpCd;

    private String benfNm;

    private Integer imgAtchGidPc;

    private Integer imgAtchGidMob;

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

    public String getSiteId() {
        return siteId;
    }

    public void setSiteId(String siteId) {
        this.siteId = siteId == null ? null : siteId.trim();
    }

    public String getSiteBenfTpCd() {
        return siteBenfTpCd;
    }

    public void setSiteBenfTpCd(String siteBenfTpCd) {
        this.siteBenfTpCd = siteBenfTpCd == null ? null : siteBenfTpCd.trim();
    }

    public String getBenfNm() {
        return benfNm;
    }

    public void setBenfNm(String benfNm) {
        this.benfNm = benfNm == null ? null : benfNm.trim();
    }

    public Integer getImgAtchGidPc() {
        return imgAtchGidPc;
    }

    public void setImgAtchGidPc(Integer imgAtchGidPc) {
        this.imgAtchGidPc = imgAtchGidPc;
    }

    public Integer getImgAtchGidMob() {
        return imgAtchGidMob;
    }

    public void setImgAtchGidMob(Integer imgAtchGidMob) {
        this.imgAtchGidMob = imgAtchGidMob;
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
        sb.append(", siteId=").append(siteId);
        sb.append(", siteBenfTpCd=").append(siteBenfTpCd);
        sb.append(", benfNm=").append(benfNm);
        sb.append(", imgAtchGidPc=").append(imgAtchGidPc);
        sb.append(", imgAtchGidMob=").append(imgAtchGidMob);
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
        SiteBenefitEntity other = (SiteBenefitEntity) that;
        return (this.getSiteId() == null ? other.getSiteId() == null : this.getSiteId().equals(other.getSiteId()))
            && (this.getSiteBenfTpCd() == null ? other.getSiteBenfTpCd() == null : this.getSiteBenfTpCd().equals(other.getSiteBenfTpCd()))
            && (this.getBenfNm() == null ? other.getBenfNm() == null : this.getBenfNm().equals(other.getBenfNm()))
            && (this.getImgAtchGidPc() == null ? other.getImgAtchGidPc() == null : this.getImgAtchGidPc().equals(other.getImgAtchGidPc()))
            && (this.getImgAtchGidMob() == null ? other.getImgAtchGidMob() == null : this.getImgAtchGidMob().equals(other.getImgAtchGidMob()))
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
        result = prime * result + ((getSiteId() == null) ? 0 : getSiteId().hashCode());
        result = prime * result + ((getSiteBenfTpCd() == null) ? 0 : getSiteBenfTpCd().hashCode());
        result = prime * result + ((getBenfNm() == null) ? 0 : getBenfNm().hashCode());
        result = prime * result + ((getImgAtchGidPc() == null) ? 0 : getImgAtchGidPc().hashCode());
        result = prime * result + ((getImgAtchGidMob() == null) ? 0 : getImgAtchGidMob().hashCode());
        result = prime * result + ((getRegDt() == null) ? 0 : getRegDt().hashCode());
        result = prime * result + ((getRegId() == null) ? 0 : getRegId().hashCode());
        result = prime * result + ((getModDt() == null) ? 0 : getModDt().hashCode());
        result = prime * result + ((getModId() == null) ? 0 : getModId().hashCode());
        result = prime * result + ((getUseYn() == null) ? 0 : getUseYn().hashCode());
        return result;
    }
}