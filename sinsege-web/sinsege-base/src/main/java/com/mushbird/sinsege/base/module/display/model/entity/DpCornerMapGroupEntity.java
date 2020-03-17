package com.mushbird.sinsege.base.module.display.model.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.mushbird.sinsege.base.model.BaseEntity;
import java.io.Serializable;
import java.util.Date;

public abstract class DpCornerMapGroupEntity extends BaseEntity implements Serializable {
    private Integer dpConrMapGid;

    private String dpConrCd;

    private String mapGrpNm;

    private String dpYn;

    private Integer sord;

    @JsonIgnore
    private Date regDt;

    @JsonIgnore
    private String regId;

    private static final long serialVersionUID = com.mushbird.sinsege.base.constant.AppConst.UID;

    public Integer getDpConrMapGid() {
        return dpConrMapGid;
    }

    public void setDpConrMapGid(Integer dpConrMapGid) {
        this.dpConrMapGid = dpConrMapGid;
    }

    public String getDpConrCd() {
        return dpConrCd;
    }

    public void setDpConrCd(String dpConrCd) {
        this.dpConrCd = dpConrCd == null ? null : dpConrCd.trim();
    }

    public String getMapGrpNm() {
        return mapGrpNm;
    }

    public void setMapGrpNm(String mapGrpNm) {
        this.mapGrpNm = mapGrpNm == null ? null : mapGrpNm.trim();
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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", dpConrMapGid=").append(dpConrMapGid);
        sb.append(", dpConrCd=").append(dpConrCd);
        sb.append(", mapGrpNm=").append(mapGrpNm);
        sb.append(", dpYn=").append(dpYn);
        sb.append(", sord=").append(sord);
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
        DpCornerMapGroupEntity other = (DpCornerMapGroupEntity) that;
        return (this.getDpConrMapGid() == null ? other.getDpConrMapGid() == null : this.getDpConrMapGid().equals(other.getDpConrMapGid()))
            && (this.getDpConrCd() == null ? other.getDpConrCd() == null : this.getDpConrCd().equals(other.getDpConrCd()))
            && (this.getMapGrpNm() == null ? other.getMapGrpNm() == null : this.getMapGrpNm().equals(other.getMapGrpNm()))
            && (this.getDpYn() == null ? other.getDpYn() == null : this.getDpYn().equals(other.getDpYn()))
            && (this.getSord() == null ? other.getSord() == null : this.getSord().equals(other.getSord()))
            && (this.getRegDt() == null ? other.getRegDt() == null : this.getRegDt().equals(other.getRegDt()))
            && (this.getRegId() == null ? other.getRegId() == null : this.getRegId().equals(other.getRegId()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getDpConrMapGid() == null) ? 0 : getDpConrMapGid().hashCode());
        result = prime * result + ((getDpConrCd() == null) ? 0 : getDpConrCd().hashCode());
        result = prime * result + ((getMapGrpNm() == null) ? 0 : getMapGrpNm().hashCode());
        result = prime * result + ((getDpYn() == null) ? 0 : getDpYn().hashCode());
        result = prime * result + ((getSord() == null) ? 0 : getSord().hashCode());
        result = prime * result + ((getRegDt() == null) ? 0 : getRegDt().hashCode());
        result = prime * result + ((getRegId() == null) ? 0 : getRegId().hashCode());
        return result;
    }
}