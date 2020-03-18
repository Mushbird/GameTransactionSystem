package com.mushbird.sinsege.base.module.display.model.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.mushbird.sinsege.base.model.BaseEntity;
import java.io.Serializable;
import java.util.Date;

public abstract class DpCategoryEntity extends BaseEntity implements Serializable {
    private Integer dpCateId;

    private Integer refDpCateId;

    private String dpCateNm;

    private String hrchyPath;

    private String hrchyPathNm;

    private Integer dpConrBanrId;

    private String lwrCateAplyYn;

    private Integer sord;

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

    public Integer getDpCateId() {
        return dpCateId;
    }

    public void setDpCateId(Integer dpCateId) {
        this.dpCateId = dpCateId;
    }

    public Integer getRefDpCateId() {
        return refDpCateId;
    }

    public void setRefDpCateId(Integer refDpCateId) {
        this.refDpCateId = refDpCateId;
    }

    public String getDpCateNm() {
        return dpCateNm;
    }

    public void setDpCateNm(String dpCateNm) {
        this.dpCateNm = dpCateNm == null ? null : dpCateNm.trim();
    }

    public String getHrchyPath() {
        return hrchyPath;
    }

    public void setHrchyPath(String hrchyPath) {
        this.hrchyPath = hrchyPath == null ? null : hrchyPath.trim();
    }

    public String getHrchyPathNm() {
        return hrchyPathNm;
    }

    public void setHrchyPathNm(String hrchyPathNm) {
        this.hrchyPathNm = hrchyPathNm == null ? null : hrchyPathNm.trim();
    }

    public Integer getDpConrBanrId() {
        return dpConrBanrId;
    }

    public void setDpConrBanrId(Integer dpConrBanrId) {
        this.dpConrBanrId = dpConrBanrId;
    }

    public String getLwrCateAplyYn() {
        return lwrCateAplyYn;
    }

    public void setLwrCateAplyYn(String lwrCateAplyYn) {
        this.lwrCateAplyYn = lwrCateAplyYn == null ? null : lwrCateAplyYn.trim();
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
        sb.append(", dpCateId=").append(dpCateId);
        sb.append(", refDpCateId=").append(refDpCateId);
        sb.append(", dpCateNm=").append(dpCateNm);
        sb.append(", hrchyPath=").append(hrchyPath);
        sb.append(", hrchyPathNm=").append(hrchyPathNm);
        sb.append(", dpConrBanrId=").append(dpConrBanrId);
        sb.append(", lwrCateAplyYn=").append(lwrCateAplyYn);
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
        DpCategoryEntity other = (DpCategoryEntity) that;
        return (this.getDpCateId() == null ? other.getDpCateId() == null : this.getDpCateId().equals(other.getDpCateId()))
            && (this.getRefDpCateId() == null ? other.getRefDpCateId() == null : this.getRefDpCateId().equals(other.getRefDpCateId()))
            && (this.getDpCateNm() == null ? other.getDpCateNm() == null : this.getDpCateNm().equals(other.getDpCateNm()))
            && (this.getHrchyPath() == null ? other.getHrchyPath() == null : this.getHrchyPath().equals(other.getHrchyPath()))
            && (this.getHrchyPathNm() == null ? other.getHrchyPathNm() == null : this.getHrchyPathNm().equals(other.getHrchyPathNm()))
            && (this.getDpConrBanrId() == null ? other.getDpConrBanrId() == null : this.getDpConrBanrId().equals(other.getDpConrBanrId()))
            && (this.getLwrCateAplyYn() == null ? other.getLwrCateAplyYn() == null : this.getLwrCateAplyYn().equals(other.getLwrCateAplyYn()))
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
        result = prime * result + ((getDpCateId() == null) ? 0 : getDpCateId().hashCode());
        result = prime * result + ((getRefDpCateId() == null) ? 0 : getRefDpCateId().hashCode());
        result = prime * result + ((getDpCateNm() == null) ? 0 : getDpCateNm().hashCode());
        result = prime * result + ((getHrchyPath() == null) ? 0 : getHrchyPath().hashCode());
        result = prime * result + ((getHrchyPathNm() == null) ? 0 : getHrchyPathNm().hashCode());
        result = prime * result + ((getDpConrBanrId() == null) ? 0 : getDpConrBanrId().hashCode());
        result = prime * result + ((getLwrCateAplyYn() == null) ? 0 : getLwrCateAplyYn().hashCode());
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