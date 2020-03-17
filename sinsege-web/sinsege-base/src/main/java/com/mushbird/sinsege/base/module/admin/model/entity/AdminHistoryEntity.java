package com.mushbird.sinsege.base.module.admin.model.entity;

import com.mushbird.sinsege.base.model.BaseEntity;
import java.io.Serializable;
import java.util.Date;

public abstract class AdminHistoryEntity extends BaseEntity implements Serializable {
    private Integer admHistId;

    private String admId;

    private Integer admRoleId;

    private String admRoleCd;

    private String aprvGrdCd;

    private String admHistTpCd;

    private String urlAddr;

    private String cont;

    private Date admHistDt;

    private static final long serialVersionUID = com.mushbird.sinsege.base.constant.AppConst.UID;

    public Integer getAdmHistId() {
        return admHistId;
    }

    public void setAdmHistId(Integer admHistId) {
        this.admHistId = admHistId;
    }

    public String getAdmId() {
        return admId;
    }

    public void setAdmId(String admId) {
        this.admId = admId == null ? null : admId.trim();
    }

    public Integer getAdmRoleId() {
        return admRoleId;
    }

    public void setAdmRoleId(Integer admRoleId) {
        this.admRoleId = admRoleId;
    }

    public String getAdmRoleCd() {
        return admRoleCd;
    }

    public void setAdmRoleCd(String admRoleCd) {
        this.admRoleCd = admRoleCd == null ? null : admRoleCd.trim();
    }

    public String getAprvGrdCd() {
        return aprvGrdCd;
    }

    public void setAprvGrdCd(String aprvGrdCd) {
        this.aprvGrdCd = aprvGrdCd == null ? null : aprvGrdCd.trim();
    }

    public String getAdmHistTpCd() {
        return admHistTpCd;
    }

    public void setAdmHistTpCd(String admHistTpCd) {
        this.admHistTpCd = admHistTpCd == null ? null : admHistTpCd.trim();
    }

    public String getUrlAddr() {
        return urlAddr;
    }

    public void setUrlAddr(String urlAddr) {
        this.urlAddr = urlAddr == null ? null : urlAddr.trim();
    }

    public String getCont() {
        return cont;
    }

    public void setCont(String cont) {
        this.cont = cont == null ? null : cont.trim();
    }

    public Date getAdmHistDt() {
        return admHistDt;
    }

    public void setAdmHistDt(Date admHistDt) {
        this.admHistDt = admHistDt;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", admHistId=").append(admHistId);
        sb.append(", admId=").append(admId);
        sb.append(", admRoleId=").append(admRoleId);
        sb.append(", admRoleCd=").append(admRoleCd);
        sb.append(", aprvGrdCd=").append(aprvGrdCd);
        sb.append(", admHistTpCd=").append(admHistTpCd);
        sb.append(", urlAddr=").append(urlAddr);
        sb.append(", cont=").append(cont);
        sb.append(", admHistDt=").append(admHistDt);
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
        AdminHistoryEntity other = (AdminHistoryEntity) that;
        return (this.getAdmHistId() == null ? other.getAdmHistId() == null : this.getAdmHistId().equals(other.getAdmHistId()))
            && (this.getAdmId() == null ? other.getAdmId() == null : this.getAdmId().equals(other.getAdmId()))
            && (this.getAdmRoleId() == null ? other.getAdmRoleId() == null : this.getAdmRoleId().equals(other.getAdmRoleId()))
            && (this.getAdmRoleCd() == null ? other.getAdmRoleCd() == null : this.getAdmRoleCd().equals(other.getAdmRoleCd()))
            && (this.getAprvGrdCd() == null ? other.getAprvGrdCd() == null : this.getAprvGrdCd().equals(other.getAprvGrdCd()))
            && (this.getAdmHistTpCd() == null ? other.getAdmHistTpCd() == null : this.getAdmHistTpCd().equals(other.getAdmHistTpCd()))
            && (this.getUrlAddr() == null ? other.getUrlAddr() == null : this.getUrlAddr().equals(other.getUrlAddr()))
            && (this.getCont() == null ? other.getCont() == null : this.getCont().equals(other.getCont()))
            && (this.getAdmHistDt() == null ? other.getAdmHistDt() == null : this.getAdmHistDt().equals(other.getAdmHistDt()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getAdmHistId() == null) ? 0 : getAdmHistId().hashCode());
        result = prime * result + ((getAdmId() == null) ? 0 : getAdmId().hashCode());
        result = prime * result + ((getAdmRoleId() == null) ? 0 : getAdmRoleId().hashCode());
        result = prime * result + ((getAdmRoleCd() == null) ? 0 : getAdmRoleCd().hashCode());
        result = prime * result + ((getAprvGrdCd() == null) ? 0 : getAprvGrdCd().hashCode());
        result = prime * result + ((getAdmHistTpCd() == null) ? 0 : getAdmHistTpCd().hashCode());
        result = prime * result + ((getUrlAddr() == null) ? 0 : getUrlAddr().hashCode());
        result = prime * result + ((getCont() == null) ? 0 : getCont().hashCode());
        result = prime * result + ((getAdmHistDt() == null) ? 0 : getAdmHistDt().hashCode());
        return result;
    }
}