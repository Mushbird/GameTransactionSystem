package com.mushbird.sinsege.base.module.board.model.entity;

import com.mushbird.sinsege.base.model.BaseEntity;
import java.io.Serializable;
import java.util.Date;

public abstract class BoardArticleEntity extends BaseEntity implements Serializable {
    private Integer bbsArtId;

    private String bbsCd;

    private String mbrId;

    private String admId;

    private Integer rmkId;

    private String wrtrNm;

    private String artTit;

    private String artCont;

    private String linkUrlAddr;

    private String cate1Cd;

    private String cate2Cd;

    private Integer atchGid;

    private String dpYn;

    private Date dpStDt;

    private Date dpEdDt;

    private Integer readCnt;

    private Integer sord;

    private Date regDt;

    private String regId;

    private Date modDt;

    private String modId;

    private String useYn;

    private static final long serialVersionUID = com.mushbird.sinsege.base.constant.AppConst.UID;

    public Integer getBbsArtId() {
        return bbsArtId;
    }

    public void setBbsArtId(Integer bbsArtId) {
        this.bbsArtId = bbsArtId;
    }

    public String getBbsCd() {
        return bbsCd;
    }

    public void setBbsCd(String bbsCd) {
        this.bbsCd = bbsCd == null ? null : bbsCd.trim();
    }

    public String getMbrId() {
        return mbrId;
    }

    public void setMbrId(String mbrId) {
        this.mbrId = mbrId == null ? null : mbrId.trim();
    }

    public String getAdmId() {
        return admId;
    }

    public void setAdmId(String admId) {
        this.admId = admId == null ? null : admId.trim();
    }

    public Integer getRmkId() {
        return rmkId;
    }

    public void setRmkId(Integer rmkId) {
        this.rmkId = rmkId;
    }

    public String getWrtrNm() {
        return wrtrNm;
    }

    public void setWrtrNm(String wrtrNm) {
        this.wrtrNm = wrtrNm == null ? null : wrtrNm.trim();
    }

    public String getArtTit() {
        return artTit;
    }

    public void setArtTit(String artTit) {
        this.artTit = artTit == null ? null : artTit.trim();
    }

    public String getArtCont() {
        return artCont;
    }

    public void setArtCont(String artCont) {
        this.artCont = artCont == null ? null : artCont.trim();
    }

    public String getLinkUrlAddr() {
        return linkUrlAddr;
    }

    public void setLinkUrlAddr(String linkUrlAddr) {
        this.linkUrlAddr = linkUrlAddr == null ? null : linkUrlAddr.trim();
    }

    public String getCate1Cd() {
        return cate1Cd;
    }

    public void setCate1Cd(String cate1Cd) {
        this.cate1Cd = cate1Cd == null ? null : cate1Cd.trim();
    }

    public String getCate2Cd() {
        return cate2Cd;
    }

    public void setCate2Cd(String cate2Cd) {
        this.cate2Cd = cate2Cd == null ? null : cate2Cd.trim();
    }

    public Integer getAtchGid() {
        return atchGid;
    }

    public void setAtchGid(Integer atchGid) {
        this.atchGid = atchGid;
    }

    public String getDpYn() {
        return dpYn;
    }

    public void setDpYn(String dpYn) {
        this.dpYn = dpYn == null ? null : dpYn.trim();
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

    public Integer getReadCnt() {
        return readCnt;
    }

    public void setReadCnt(Integer readCnt) {
        this.readCnt = readCnt;
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
        sb.append(", bbsArtId=").append(bbsArtId);
        sb.append(", bbsCd=").append(bbsCd);
        sb.append(", mbrId=").append(mbrId);
        sb.append(", admId=").append(admId);
        sb.append(", rmkId=").append(rmkId);
        sb.append(", wrtrNm=").append(wrtrNm);
        sb.append(", artTit=").append(artTit);
        sb.append(", artCont=").append(artCont);
        sb.append(", linkUrlAddr=").append(linkUrlAddr);
        sb.append(", cate1Cd=").append(cate1Cd);
        sb.append(", cate2Cd=").append(cate2Cd);
        sb.append(", atchGid=").append(atchGid);
        sb.append(", dpYn=").append(dpYn);
        sb.append(", dpStDt=").append(dpStDt);
        sb.append(", dpEdDt=").append(dpEdDt);
        sb.append(", readCnt=").append(readCnt);
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
        BoardArticleEntity other = (BoardArticleEntity) that;
        return (this.getBbsArtId() == null ? other.getBbsArtId() == null : this.getBbsArtId().equals(other.getBbsArtId()))
            && (this.getBbsCd() == null ? other.getBbsCd() == null : this.getBbsCd().equals(other.getBbsCd()))
            && (this.getMbrId() == null ? other.getMbrId() == null : this.getMbrId().equals(other.getMbrId()))
            && (this.getAdmId() == null ? other.getAdmId() == null : this.getAdmId().equals(other.getAdmId()))
            && (this.getRmkId() == null ? other.getRmkId() == null : this.getRmkId().equals(other.getRmkId()))
            && (this.getWrtrNm() == null ? other.getWrtrNm() == null : this.getWrtrNm().equals(other.getWrtrNm()))
            && (this.getArtTit() == null ? other.getArtTit() == null : this.getArtTit().equals(other.getArtTit()))
            && (this.getArtCont() == null ? other.getArtCont() == null : this.getArtCont().equals(other.getArtCont()))
            && (this.getLinkUrlAddr() == null ? other.getLinkUrlAddr() == null : this.getLinkUrlAddr().equals(other.getLinkUrlAddr()))
            && (this.getCate1Cd() == null ? other.getCate1Cd() == null : this.getCate1Cd().equals(other.getCate1Cd()))
            && (this.getCate2Cd() == null ? other.getCate2Cd() == null : this.getCate2Cd().equals(other.getCate2Cd()))
            && (this.getAtchGid() == null ? other.getAtchGid() == null : this.getAtchGid().equals(other.getAtchGid()))
            && (this.getDpYn() == null ? other.getDpYn() == null : this.getDpYn().equals(other.getDpYn()))
            && (this.getDpStDt() == null ? other.getDpStDt() == null : this.getDpStDt().equals(other.getDpStDt()))
            && (this.getDpEdDt() == null ? other.getDpEdDt() == null : this.getDpEdDt().equals(other.getDpEdDt()))
            && (this.getReadCnt() == null ? other.getReadCnt() == null : this.getReadCnt().equals(other.getReadCnt()))
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
        result = prime * result + ((getBbsArtId() == null) ? 0 : getBbsArtId().hashCode());
        result = prime * result + ((getBbsCd() == null) ? 0 : getBbsCd().hashCode());
        result = prime * result + ((getMbrId() == null) ? 0 : getMbrId().hashCode());
        result = prime * result + ((getAdmId() == null) ? 0 : getAdmId().hashCode());
        result = prime * result + ((getRmkId() == null) ? 0 : getRmkId().hashCode());
        result = prime * result + ((getWrtrNm() == null) ? 0 : getWrtrNm().hashCode());
        result = prime * result + ((getArtTit() == null) ? 0 : getArtTit().hashCode());
        result = prime * result + ((getArtCont() == null) ? 0 : getArtCont().hashCode());
        result = prime * result + ((getLinkUrlAddr() == null) ? 0 : getLinkUrlAddr().hashCode());
        result = prime * result + ((getCate1Cd() == null) ? 0 : getCate1Cd().hashCode());
        result = prime * result + ((getCate2Cd() == null) ? 0 : getCate2Cd().hashCode());
        result = prime * result + ((getAtchGid() == null) ? 0 : getAtchGid().hashCode());
        result = prime * result + ((getDpYn() == null) ? 0 : getDpYn().hashCode());
        result = prime * result + ((getDpStDt() == null) ? 0 : getDpStDt().hashCode());
        result = prime * result + ((getDpEdDt() == null) ? 0 : getDpEdDt().hashCode());
        result = prime * result + ((getReadCnt() == null) ? 0 : getReadCnt().hashCode());
        result = prime * result + ((getSord() == null) ? 0 : getSord().hashCode());
        result = prime * result + ((getRegDt() == null) ? 0 : getRegDt().hashCode());
        result = prime * result + ((getRegId() == null) ? 0 : getRegId().hashCode());
        result = prime * result + ((getModDt() == null) ? 0 : getModDt().hashCode());
        result = prime * result + ((getModId() == null) ? 0 : getModId().hashCode());
        result = prime * result + ((getUseYn() == null) ? 0 : getUseYn().hashCode());
        return result;
    }
}