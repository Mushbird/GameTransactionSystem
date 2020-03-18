package com.mushbird.sinsege.base.module.display.model.entity;

import com.mushbird.sinsege.base.model.BaseEntity;
import java.io.Serializable;
import java.util.Date;

public abstract class DpPopEntity extends BaseEntity implements Serializable {
    private Integer dpPopId;

    private String popDpEnvCd;

    private String popTit;

    private Integer atchGid;

    private Short popLocXa;

    private Short popLocYa;

    private String linkUrlAddr;

    private String linkNwinYn;

    private Date dpStDt;

    private Date dpEdDt;

    private String dpYn;

    private Date regDt;

    private String regId;

    private Date modDt;

    private String modId;

    private String useYn;

    private static final long serialVersionUID = com.mushbird.sinsege.base.constant.AppConst.UID;

    public Integer getDpPopId() {
        return dpPopId;
    }

    public void setDpPopId(Integer dpPopId) {
        this.dpPopId = dpPopId;
    }

    public String getPopDpEnvCd() {
        return popDpEnvCd;
    }

    public void setPopDpEnvCd(String popDpEnvCd) {
        this.popDpEnvCd = popDpEnvCd == null ? null : popDpEnvCd.trim();
    }

    public String getPopTit() {
        return popTit;
    }

    public void setPopTit(String popTit) {
        this.popTit = popTit == null ? null : popTit.trim();
    }

    public Integer getAtchGid() {
        return atchGid;
    }

    public void setAtchGid(Integer atchGid) {
        this.atchGid = atchGid;
    }

    public Short getPopLocXa() {
        return popLocXa;
    }

    public void setPopLocXa(Short popLocXa) {
        this.popLocXa = popLocXa;
    }

    public Short getPopLocYa() {
        return popLocYa;
    }

    public void setPopLocYa(Short popLocYa) {
        this.popLocYa = popLocYa;
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
        sb.append(", dpPopId=").append(dpPopId);
        sb.append(", popDpEnvCd=").append(popDpEnvCd);
        sb.append(", popTit=").append(popTit);
        sb.append(", atchGid=").append(atchGid);
        sb.append(", popLocXa=").append(popLocXa);
        sb.append(", popLocYa=").append(popLocYa);
        sb.append(", linkUrlAddr=").append(linkUrlAddr);
        sb.append(", linkNwinYn=").append(linkNwinYn);
        sb.append(", dpStDt=").append(dpStDt);
        sb.append(", dpEdDt=").append(dpEdDt);
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
        DpPopEntity other = (DpPopEntity) that;
        return (this.getDpPopId() == null ? other.getDpPopId() == null : this.getDpPopId().equals(other.getDpPopId()))
            && (this.getPopDpEnvCd() == null ? other.getPopDpEnvCd() == null : this.getPopDpEnvCd().equals(other.getPopDpEnvCd()))
            && (this.getPopTit() == null ? other.getPopTit() == null : this.getPopTit().equals(other.getPopTit()))
            && (this.getAtchGid() == null ? other.getAtchGid() == null : this.getAtchGid().equals(other.getAtchGid()))
            && (this.getPopLocXa() == null ? other.getPopLocXa() == null : this.getPopLocXa().equals(other.getPopLocXa()))
            && (this.getPopLocYa() == null ? other.getPopLocYa() == null : this.getPopLocYa().equals(other.getPopLocYa()))
            && (this.getLinkUrlAddr() == null ? other.getLinkUrlAddr() == null : this.getLinkUrlAddr().equals(other.getLinkUrlAddr()))
            && (this.getLinkNwinYn() == null ? other.getLinkNwinYn() == null : this.getLinkNwinYn().equals(other.getLinkNwinYn()))
            && (this.getDpStDt() == null ? other.getDpStDt() == null : this.getDpStDt().equals(other.getDpStDt()))
            && (this.getDpEdDt() == null ? other.getDpEdDt() == null : this.getDpEdDt().equals(other.getDpEdDt()))
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
        result = prime * result + ((getDpPopId() == null) ? 0 : getDpPopId().hashCode());
        result = prime * result + ((getPopDpEnvCd() == null) ? 0 : getPopDpEnvCd().hashCode());
        result = prime * result + ((getPopTit() == null) ? 0 : getPopTit().hashCode());
        result = prime * result + ((getAtchGid() == null) ? 0 : getAtchGid().hashCode());
        result = prime * result + ((getPopLocXa() == null) ? 0 : getPopLocXa().hashCode());
        result = prime * result + ((getPopLocYa() == null) ? 0 : getPopLocYa().hashCode());
        result = prime * result + ((getLinkUrlAddr() == null) ? 0 : getLinkUrlAddr().hashCode());
        result = prime * result + ((getLinkNwinYn() == null) ? 0 : getLinkNwinYn().hashCode());
        result = prime * result + ((getDpStDt() == null) ? 0 : getDpStDt().hashCode());
        result = prime * result + ((getDpEdDt() == null) ? 0 : getDpEdDt().hashCode());
        result = prime * result + ((getDpYn() == null) ? 0 : getDpYn().hashCode());
        result = prime * result + ((getRegDt() == null) ? 0 : getRegDt().hashCode());
        result = prime * result + ((getRegId() == null) ? 0 : getRegId().hashCode());
        result = prime * result + ((getModDt() == null) ? 0 : getModDt().hashCode());
        result = prime * result + ((getModId() == null) ? 0 : getModId().hashCode());
        result = prime * result + ((getUseYn() == null) ? 0 : getUseYn().hashCode());
        return result;
    }
}