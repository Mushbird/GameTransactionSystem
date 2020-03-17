package com.mushbird.sinsege.base.module.display.model.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.mushbird.sinsege.base.model.BaseEntity;
import java.io.Serializable;
import java.util.Date;

public abstract class DpCornerMapEntity extends BaseEntity implements Serializable {
    private Integer dpConrMapId;

    private String dpConrCd;

    private Integer mapId;

    private String mapCl;

    private Integer dpConrMapGid;

    private String dpYn;

    private Integer sord;

    @JsonIgnore
    private Date regDt;

    @JsonIgnore
    private String regId;

    private static final long serialVersionUID = com.mushbird.sinsege.base.constant.AppConst.UID;

    public Integer getDpConrMapId() {
        return dpConrMapId;
    }

    public void setDpConrMapId(Integer dpConrMapId) {
        this.dpConrMapId = dpConrMapId;
    }

    public String getDpConrCd() {
        return dpConrCd;
    }

    public void setDpConrCd(String dpConrCd) {
        this.dpConrCd = dpConrCd == null ? null : dpConrCd.trim();
    }

    public Integer getMapId() {
        return mapId;
    }

    public void setMapId(Integer mapId) {
        this.mapId = mapId;
    }

    public String getMapCl() {
        return mapCl;
    }

    public void setMapCl(String mapCl) {
        this.mapCl = mapCl == null ? null : mapCl.trim();
    }

    public Integer getDpConrMapGid() {
        return dpConrMapGid;
    }

    public void setDpConrMapGid(Integer dpConrMapGid) {
        this.dpConrMapGid = dpConrMapGid;
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
        sb.append(", dpConrMapId=").append(dpConrMapId);
        sb.append(", dpConrCd=").append(dpConrCd);
        sb.append(", mapId=").append(mapId);
        sb.append(", mapCl=").append(mapCl);
        sb.append(", dpConrMapGid=").append(dpConrMapGid);
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
        DpCornerMapEntity other = (DpCornerMapEntity) that;
        return (this.getDpConrMapId() == null ? other.getDpConrMapId() == null : this.getDpConrMapId().equals(other.getDpConrMapId()))
            && (this.getDpConrCd() == null ? other.getDpConrCd() == null : this.getDpConrCd().equals(other.getDpConrCd()))
            && (this.getMapId() == null ? other.getMapId() == null : this.getMapId().equals(other.getMapId()))
            && (this.getMapCl() == null ? other.getMapCl() == null : this.getMapCl().equals(other.getMapCl()))
            && (this.getDpConrMapGid() == null ? other.getDpConrMapGid() == null : this.getDpConrMapGid().equals(other.getDpConrMapGid()))
            && (this.getDpYn() == null ? other.getDpYn() == null : this.getDpYn().equals(other.getDpYn()))
            && (this.getSord() == null ? other.getSord() == null : this.getSord().equals(other.getSord()))
            && (this.getRegDt() == null ? other.getRegDt() == null : this.getRegDt().equals(other.getRegDt()))
            && (this.getRegId() == null ? other.getRegId() == null : this.getRegId().equals(other.getRegId()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getDpConrMapId() == null) ? 0 : getDpConrMapId().hashCode());
        result = prime * result + ((getDpConrCd() == null) ? 0 : getDpConrCd().hashCode());
        result = prime * result + ((getMapId() == null) ? 0 : getMapId().hashCode());
        result = prime * result + ((getMapCl() == null) ? 0 : getMapCl().hashCode());
        result = prime * result + ((getDpConrMapGid() == null) ? 0 : getDpConrMapGid().hashCode());
        result = prime * result + ((getDpYn() == null) ? 0 : getDpYn().hashCode());
        result = prime * result + ((getSord() == null) ? 0 : getSord().hashCode());
        result = prime * result + ((getRegDt() == null) ? 0 : getRegDt().hashCode());
        result = prime * result + ((getRegId() == null) ? 0 : getRegId().hashCode());
        return result;
    }
}