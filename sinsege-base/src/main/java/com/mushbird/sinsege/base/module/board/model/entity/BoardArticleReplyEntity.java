package com.mushbird.sinsege.base.module.board.model.entity;

import com.mushbird.sinsege.base.model.BaseEntity;
import java.io.Serializable;
import java.util.Date;

public abstract class BoardArticleReplyEntity extends BaseEntity implements Serializable {
    private Integer bbsArtRplyId;

    private Integer bbsArtId;

    private String mbrId;

    private String admId;

    private String rplyCont;

    private String rplyStatCd;

    private Integer atchGid;

    private Date regDt;

    private String regId;

    private Date modDt;

    private String modId;

    private String useYn;

    private static final long serialVersionUID = com.mushbird.sinsege.base.constant.AppConst.UID;

    public Integer getBbsArtRplyId() {
        return bbsArtRplyId;
    }

    public void setBbsArtRplyId(Integer bbsArtRplyId) {
        this.bbsArtRplyId = bbsArtRplyId;
    }

    public Integer getBbsArtId() {
        return bbsArtId;
    }

    public void setBbsArtId(Integer bbsArtId) {
        this.bbsArtId = bbsArtId;
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

    public String getRplyCont() {
        return rplyCont;
    }

    public void setRplyCont(String rplyCont) {
        this.rplyCont = rplyCont == null ? null : rplyCont.trim();
    }

    public String getRplyStatCd() {
        return rplyStatCd;
    }

    public void setRplyStatCd(String rplyStatCd) {
        this.rplyStatCd = rplyStatCd == null ? null : rplyStatCd.trim();
    }

    public Integer getAtchGid() {
        return atchGid;
    }

    public void setAtchGid(Integer atchGid) {
        this.atchGid = atchGid;
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
        sb.append(", bbsArtRplyId=").append(bbsArtRplyId);
        sb.append(", bbsArtId=").append(bbsArtId);
        sb.append(", mbrId=").append(mbrId);
        sb.append(", admId=").append(admId);
        sb.append(", rplyCont=").append(rplyCont);
        sb.append(", rplyStatCd=").append(rplyStatCd);
        sb.append(", atchGid=").append(atchGid);
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
        BoardArticleReplyEntity other = (BoardArticleReplyEntity) that;
        return (this.getBbsArtRplyId() == null ? other.getBbsArtRplyId() == null : this.getBbsArtRplyId().equals(other.getBbsArtRplyId()))
            && (this.getBbsArtId() == null ? other.getBbsArtId() == null : this.getBbsArtId().equals(other.getBbsArtId()))
            && (this.getMbrId() == null ? other.getMbrId() == null : this.getMbrId().equals(other.getMbrId()))
            && (this.getAdmId() == null ? other.getAdmId() == null : this.getAdmId().equals(other.getAdmId()))
            && (this.getRplyCont() == null ? other.getRplyCont() == null : this.getRplyCont().equals(other.getRplyCont()))
            && (this.getRplyStatCd() == null ? other.getRplyStatCd() == null : this.getRplyStatCd().equals(other.getRplyStatCd()))
            && (this.getAtchGid() == null ? other.getAtchGid() == null : this.getAtchGid().equals(other.getAtchGid()))
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
        result = prime * result + ((getBbsArtRplyId() == null) ? 0 : getBbsArtRplyId().hashCode());
        result = prime * result + ((getBbsArtId() == null) ? 0 : getBbsArtId().hashCode());
        result = prime * result + ((getMbrId() == null) ? 0 : getMbrId().hashCode());
        result = prime * result + ((getAdmId() == null) ? 0 : getAdmId().hashCode());
        result = prime * result + ((getRplyCont() == null) ? 0 : getRplyCont().hashCode());
        result = prime * result + ((getRplyStatCd() == null) ? 0 : getRplyStatCd().hashCode());
        result = prime * result + ((getAtchGid() == null) ? 0 : getAtchGid().hashCode());
        result = prime * result + ((getRegDt() == null) ? 0 : getRegDt().hashCode());
        result = prime * result + ((getRegId() == null) ? 0 : getRegId().hashCode());
        result = prime * result + ((getModDt() == null) ? 0 : getModDt().hashCode());
        result = prime * result + ((getModId() == null) ? 0 : getModId().hashCode());
        result = prime * result + ((getUseYn() == null) ? 0 : getUseYn().hashCode());
        return result;
    }
}