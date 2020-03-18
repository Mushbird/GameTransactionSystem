package com.mushbird.sinsege.base.module.order.model.entity;

import com.mushbird.sinsege.base.model.BaseEntity;
import java.io.Serializable;
import java.util.Date;

public abstract class OrderClaimChangeHistoryEntity extends BaseEntity implements Serializable {
    private Integer ordClmChistId;

    private Integer ordClmId;

    private Integer ordId;

    private String ordClmNo;

    private String clmTpCd;

    private Date clmRcptDt;

    private String clmAttrCd;

    private String clmRsnCd;

    private String clmRsnCont;

    private String rfdMthd;

    private Integer cpnDcRtnAmt;

    private Integer ptUseRtnAmt;

    private Integer clmAmt;

    private Integer realClmAmt;

    private Date payCpltDt;

    private Date rfdCpltDt;

    private Date regDt;

    private String regId;

    private static final long serialVersionUID = com.mushbird.sinsege.base.constant.AppConst.UID;

    public Integer getOrdClmChistId() {
        return ordClmChistId;
    }

    public void setOrdClmChistId(Integer ordClmChistId) {
        this.ordClmChistId = ordClmChistId;
    }

    public Integer getOrdClmId() {
        return ordClmId;
    }

    public void setOrdClmId(Integer ordClmId) {
        this.ordClmId = ordClmId;
    }

    public Integer getOrdId() {
        return ordId;
    }

    public void setOrdId(Integer ordId) {
        this.ordId = ordId;
    }

    public String getOrdClmNo() {
        return ordClmNo;
    }

    public void setOrdClmNo(String ordClmNo) {
        this.ordClmNo = ordClmNo == null ? null : ordClmNo.trim();
    }

    public String getClmTpCd() {
        return clmTpCd;
    }

    public void setClmTpCd(String clmTpCd) {
        this.clmTpCd = clmTpCd == null ? null : clmTpCd.trim();
    }

    public Date getClmRcptDt() {
        return clmRcptDt;
    }

    public void setClmRcptDt(Date clmRcptDt) {
        this.clmRcptDt = clmRcptDt;
    }

    public String getClmAttrCd() {
        return clmAttrCd;
    }

    public void setClmAttrCd(String clmAttrCd) {
        this.clmAttrCd = clmAttrCd == null ? null : clmAttrCd.trim();
    }

    public String getClmRsnCd() {
        return clmRsnCd;
    }

    public void setClmRsnCd(String clmRsnCd) {
        this.clmRsnCd = clmRsnCd == null ? null : clmRsnCd.trim();
    }

    public String getClmRsnCont() {
        return clmRsnCont;
    }

    public void setClmRsnCont(String clmRsnCont) {
        this.clmRsnCont = clmRsnCont == null ? null : clmRsnCont.trim();
    }

    public String getRfdMthd() {
        return rfdMthd;
    }

    public void setRfdMthd(String rfdMthd) {
        this.rfdMthd = rfdMthd == null ? null : rfdMthd.trim();
    }

    public Integer getCpnDcRtnAmt() {
        return cpnDcRtnAmt;
    }

    public void setCpnDcRtnAmt(Integer cpnDcRtnAmt) {
        this.cpnDcRtnAmt = cpnDcRtnAmt;
    }

    public Integer getPtUseRtnAmt() {
        return ptUseRtnAmt;
    }

    public void setPtUseRtnAmt(Integer ptUseRtnAmt) {
        this.ptUseRtnAmt = ptUseRtnAmt;
    }

    public Integer getClmAmt() {
        return clmAmt;
    }

    public void setClmAmt(Integer clmAmt) {
        this.clmAmt = clmAmt;
    }

    public Integer getRealClmAmt() {
        return realClmAmt;
    }

    public void setRealClmAmt(Integer realClmAmt) {
        this.realClmAmt = realClmAmt;
    }

    public Date getPayCpltDt() {
        return payCpltDt;
    }

    public void setPayCpltDt(Date payCpltDt) {
        this.payCpltDt = payCpltDt;
    }

    public Date getRfdCpltDt() {
        return rfdCpltDt;
    }

    public void setRfdCpltDt(Date rfdCpltDt) {
        this.rfdCpltDt = rfdCpltDt;
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
        sb.append(", ordClmChistId=").append(ordClmChistId);
        sb.append(", ordClmId=").append(ordClmId);
        sb.append(", ordId=").append(ordId);
        sb.append(", ordClmNo=").append(ordClmNo);
        sb.append(", clmTpCd=").append(clmTpCd);
        sb.append(", clmRcptDt=").append(clmRcptDt);
        sb.append(", clmAttrCd=").append(clmAttrCd);
        sb.append(", clmRsnCd=").append(clmRsnCd);
        sb.append(", clmRsnCont=").append(clmRsnCont);
        sb.append(", rfdMthd=").append(rfdMthd);
        sb.append(", cpnDcRtnAmt=").append(cpnDcRtnAmt);
        sb.append(", ptUseRtnAmt=").append(ptUseRtnAmt);
        sb.append(", clmAmt=").append(clmAmt);
        sb.append(", realClmAmt=").append(realClmAmt);
        sb.append(", payCpltDt=").append(payCpltDt);
        sb.append(", rfdCpltDt=").append(rfdCpltDt);
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
        OrderClaimChangeHistoryEntity other = (OrderClaimChangeHistoryEntity) that;
        return (this.getOrdClmChistId() == null ? other.getOrdClmChistId() == null : this.getOrdClmChistId().equals(other.getOrdClmChistId()))
            && (this.getOrdClmId() == null ? other.getOrdClmId() == null : this.getOrdClmId().equals(other.getOrdClmId()))
            && (this.getOrdId() == null ? other.getOrdId() == null : this.getOrdId().equals(other.getOrdId()))
            && (this.getOrdClmNo() == null ? other.getOrdClmNo() == null : this.getOrdClmNo().equals(other.getOrdClmNo()))
            && (this.getClmTpCd() == null ? other.getClmTpCd() == null : this.getClmTpCd().equals(other.getClmTpCd()))
            && (this.getClmRcptDt() == null ? other.getClmRcptDt() == null : this.getClmRcptDt().equals(other.getClmRcptDt()))
            && (this.getClmAttrCd() == null ? other.getClmAttrCd() == null : this.getClmAttrCd().equals(other.getClmAttrCd()))
            && (this.getClmRsnCd() == null ? other.getClmRsnCd() == null : this.getClmRsnCd().equals(other.getClmRsnCd()))
            && (this.getClmRsnCont() == null ? other.getClmRsnCont() == null : this.getClmRsnCont().equals(other.getClmRsnCont()))
            && (this.getRfdMthd() == null ? other.getRfdMthd() == null : this.getRfdMthd().equals(other.getRfdMthd()))
            && (this.getCpnDcRtnAmt() == null ? other.getCpnDcRtnAmt() == null : this.getCpnDcRtnAmt().equals(other.getCpnDcRtnAmt()))
            && (this.getPtUseRtnAmt() == null ? other.getPtUseRtnAmt() == null : this.getPtUseRtnAmt().equals(other.getPtUseRtnAmt()))
            && (this.getClmAmt() == null ? other.getClmAmt() == null : this.getClmAmt().equals(other.getClmAmt()))
            && (this.getRealClmAmt() == null ? other.getRealClmAmt() == null : this.getRealClmAmt().equals(other.getRealClmAmt()))
            && (this.getPayCpltDt() == null ? other.getPayCpltDt() == null : this.getPayCpltDt().equals(other.getPayCpltDt()))
            && (this.getRfdCpltDt() == null ? other.getRfdCpltDt() == null : this.getRfdCpltDt().equals(other.getRfdCpltDt()))
            && (this.getRegDt() == null ? other.getRegDt() == null : this.getRegDt().equals(other.getRegDt()))
            && (this.getRegId() == null ? other.getRegId() == null : this.getRegId().equals(other.getRegId()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getOrdClmChistId() == null) ? 0 : getOrdClmChistId().hashCode());
        result = prime * result + ((getOrdClmId() == null) ? 0 : getOrdClmId().hashCode());
        result = prime * result + ((getOrdId() == null) ? 0 : getOrdId().hashCode());
        result = prime * result + ((getOrdClmNo() == null) ? 0 : getOrdClmNo().hashCode());
        result = prime * result + ((getClmTpCd() == null) ? 0 : getClmTpCd().hashCode());
        result = prime * result + ((getClmRcptDt() == null) ? 0 : getClmRcptDt().hashCode());
        result = prime * result + ((getClmAttrCd() == null) ? 0 : getClmAttrCd().hashCode());
        result = prime * result + ((getClmRsnCd() == null) ? 0 : getClmRsnCd().hashCode());
        result = prime * result + ((getClmRsnCont() == null) ? 0 : getClmRsnCont().hashCode());
        result = prime * result + ((getRfdMthd() == null) ? 0 : getRfdMthd().hashCode());
        result = prime * result + ((getCpnDcRtnAmt() == null) ? 0 : getCpnDcRtnAmt().hashCode());
        result = prime * result + ((getPtUseRtnAmt() == null) ? 0 : getPtUseRtnAmt().hashCode());
        result = prime * result + ((getClmAmt() == null) ? 0 : getClmAmt().hashCode());
        result = prime * result + ((getRealClmAmt() == null) ? 0 : getRealClmAmt().hashCode());
        result = prime * result + ((getPayCpltDt() == null) ? 0 : getPayCpltDt().hashCode());
        result = prime * result + ((getRfdCpltDt() == null) ? 0 : getRfdCpltDt().hashCode());
        result = prime * result + ((getRegDt() == null) ? 0 : getRegDt().hashCode());
        result = prime * result + ((getRegId() == null) ? 0 : getRegId().hashCode());
        return result;
    }
}