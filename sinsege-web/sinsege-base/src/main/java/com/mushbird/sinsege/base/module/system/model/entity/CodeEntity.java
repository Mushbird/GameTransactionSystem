package com.mushbird.sinsege.base.module.system.model.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.mushbird.sinsege.base.model.BaseEntity;
import java.io.Serializable;
import java.util.Date;

public abstract class CodeEntity extends BaseEntity implements Serializable {
    private String cd;

    private String refCd;

    private String cdNm;

    private String cdAdd1Val;

    private String cdAdd2Val;

    private String cdAdd3Val;

    private Integer sord;

    private String dpYn;

    private String sysCdYn;

    private String note;

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

    public String getCd() {
        return cd;
    }

    public void setCd(String cd) {
        this.cd = cd == null ? null : cd.trim();
    }

    public String getRefCd() {
        return refCd;
    }

    public void setRefCd(String refCd) {
        this.refCd = refCd == null ? null : refCd.trim();
    }

    public String getCdNm() {
        return cdNm;
    }

    public void setCdNm(String cdNm) {
        this.cdNm = cdNm == null ? null : cdNm.trim();
    }

    public String getCdAdd1Val() {
        return cdAdd1Val;
    }

    public void setCdAdd1Val(String cdAdd1Val) {
        this.cdAdd1Val = cdAdd1Val == null ? null : cdAdd1Val.trim();
    }

    public String getCdAdd2Val() {
        return cdAdd2Val;
    }

    public void setCdAdd2Val(String cdAdd2Val) {
        this.cdAdd2Val = cdAdd2Val == null ? null : cdAdd2Val.trim();
    }

    public String getCdAdd3Val() {
        return cdAdd3Val;
    }

    public void setCdAdd3Val(String cdAdd3Val) {
        this.cdAdd3Val = cdAdd3Val == null ? null : cdAdd3Val.trim();
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

    public String getSysCdYn() {
        return sysCdYn;
    }

    public void setSysCdYn(String sysCdYn) {
        this.sysCdYn = sysCdYn == null ? null : sysCdYn.trim();
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note == null ? null : note.trim();
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
        sb.append(", cd=").append(cd);
        sb.append(", refCd=").append(refCd);
        sb.append(", cdNm=").append(cdNm);
        sb.append(", cdAdd1Val=").append(cdAdd1Val);
        sb.append(", cdAdd2Val=").append(cdAdd2Val);
        sb.append(", cdAdd3Val=").append(cdAdd3Val);
        sb.append(", sord=").append(sord);
        sb.append(", dpYn=").append(dpYn);
        sb.append(", sysCdYn=").append(sysCdYn);
        sb.append(", note=").append(note);
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
        CodeEntity other = (CodeEntity) that;
        return (this.getCd() == null ? other.getCd() == null : this.getCd().equals(other.getCd()))
            && (this.getRefCd() == null ? other.getRefCd() == null : this.getRefCd().equals(other.getRefCd()))
            && (this.getCdNm() == null ? other.getCdNm() == null : this.getCdNm().equals(other.getCdNm()))
            && (this.getCdAdd1Val() == null ? other.getCdAdd1Val() == null : this.getCdAdd1Val().equals(other.getCdAdd1Val()))
            && (this.getCdAdd2Val() == null ? other.getCdAdd2Val() == null : this.getCdAdd2Val().equals(other.getCdAdd2Val()))
            && (this.getCdAdd3Val() == null ? other.getCdAdd3Val() == null : this.getCdAdd3Val().equals(other.getCdAdd3Val()))
            && (this.getSord() == null ? other.getSord() == null : this.getSord().equals(other.getSord()))
            && (this.getDpYn() == null ? other.getDpYn() == null : this.getDpYn().equals(other.getDpYn()))
            && (this.getSysCdYn() == null ? other.getSysCdYn() == null : this.getSysCdYn().equals(other.getSysCdYn()))
            && (this.getNote() == null ? other.getNote() == null : this.getNote().equals(other.getNote()))
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
        result = prime * result + ((getCd() == null) ? 0 : getCd().hashCode());
        result = prime * result + ((getRefCd() == null) ? 0 : getRefCd().hashCode());
        result = prime * result + ((getCdNm() == null) ? 0 : getCdNm().hashCode());
        result = prime * result + ((getCdAdd1Val() == null) ? 0 : getCdAdd1Val().hashCode());
        result = prime * result + ((getCdAdd2Val() == null) ? 0 : getCdAdd2Val().hashCode());
        result = prime * result + ((getCdAdd3Val() == null) ? 0 : getCdAdd3Val().hashCode());
        result = prime * result + ((getSord() == null) ? 0 : getSord().hashCode());
        result = prime * result + ((getDpYn() == null) ? 0 : getDpYn().hashCode());
        result = prime * result + ((getSysCdYn() == null) ? 0 : getSysCdYn().hashCode());
        result = prime * result + ((getNote() == null) ? 0 : getNote().hashCode());
        result = prime * result + ((getRegDt() == null) ? 0 : getRegDt().hashCode());
        result = prime * result + ((getRegId() == null) ? 0 : getRegId().hashCode());
        result = prime * result + ((getModDt() == null) ? 0 : getModDt().hashCode());
        result = prime * result + ((getModId() == null) ? 0 : getModId().hashCode());
        result = prime * result + ((getUseYn() == null) ? 0 : getUseYn().hashCode());
        return result;
    }
}