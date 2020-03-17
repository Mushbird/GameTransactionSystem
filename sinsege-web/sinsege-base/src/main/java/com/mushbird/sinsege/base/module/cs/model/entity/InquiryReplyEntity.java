package com.mushbird.sinsege.base.module.cs.model.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.mushbird.sinsege.base.model.BaseEntity;
import java.io.Serializable;
import java.util.Date;

public abstract class InquiryReplyEntity extends BaseEntity implements Serializable {
    private Integer inqRplyId;

    private Integer inqId;

    private String admId;

    private String cont;

    private String tempSaveYn;

    private Integer atchGid;

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

    public Integer getInqRplyId() {
        return inqRplyId;
    }

    public void setInqRplyId(Integer inqRplyId) {
        this.inqRplyId = inqRplyId;
    }

    public Integer getInqId() {
        return inqId;
    }

    public void setInqId(Integer inqId) {
        this.inqId = inqId;
    }

    public String getAdmId() {
        return admId;
    }

    public void setAdmId(String admId) {
        this.admId = admId == null ? null : admId.trim();
    }

    public String getCont() {
        return cont;
    }

    public void setCont(String cont) {
        this.cont = cont == null ? null : cont.trim();
    }

    public String getTempSaveYn() {
        return tempSaveYn;
    }

    public void setTempSaveYn(String tempSaveYn) {
        this.tempSaveYn = tempSaveYn == null ? null : tempSaveYn.trim();
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
        sb.append(", inqRplyId=").append(inqRplyId);
        sb.append(", inqId=").append(inqId);
        sb.append(", admId=").append(admId);
        sb.append(", cont=").append(cont);
        sb.append(", tempSaveYn=").append(tempSaveYn);
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
        InquiryReplyEntity other = (InquiryReplyEntity) that;
        return (this.getInqRplyId() == null ? other.getInqRplyId() == null : this.getInqRplyId().equals(other.getInqRplyId()))
            && (this.getInqId() == null ? other.getInqId() == null : this.getInqId().equals(other.getInqId()))
            && (this.getAdmId() == null ? other.getAdmId() == null : this.getAdmId().equals(other.getAdmId()))
            && (this.getCont() == null ? other.getCont() == null : this.getCont().equals(other.getCont()))
            && (this.getTempSaveYn() == null ? other.getTempSaveYn() == null : this.getTempSaveYn().equals(other.getTempSaveYn()))
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
        result = prime * result + ((getInqRplyId() == null) ? 0 : getInqRplyId().hashCode());
        result = prime * result + ((getInqId() == null) ? 0 : getInqId().hashCode());
        result = prime * result + ((getAdmId() == null) ? 0 : getAdmId().hashCode());
        result = prime * result + ((getCont() == null) ? 0 : getCont().hashCode());
        result = prime * result + ((getTempSaveYn() == null) ? 0 : getTempSaveYn().hashCode());
        result = prime * result + ((getAtchGid() == null) ? 0 : getAtchGid().hashCode());
        result = prime * result + ((getRegDt() == null) ? 0 : getRegDt().hashCode());
        result = prime * result + ((getRegId() == null) ? 0 : getRegId().hashCode());
        result = prime * result + ((getModDt() == null) ? 0 : getModDt().hashCode());
        result = prime * result + ((getModId() == null) ? 0 : getModId().hashCode());
        result = prime * result + ((getUseYn() == null) ? 0 : getUseYn().hashCode());
        return result;
    }
}