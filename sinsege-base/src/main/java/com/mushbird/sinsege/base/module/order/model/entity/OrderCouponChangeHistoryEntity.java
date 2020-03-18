package com.mushbird.sinsege.base.module.order.model.entity;

import com.mushbird.sinsege.base.model.BaseEntity;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public abstract class OrderCouponChangeHistoryEntity extends BaseEntity implements Serializable {
    private Integer ordCpnChistId;

    private Integer ordCpnId;

    private Integer mbrCpnId;

    private Integer ordId;

    private String ordCpnAplyCd;

    private String cpnTpCd;

    private String cpnAutoClCd;

    private String cpnNo;

    private String cpnNm;

    private String mbrCpnNo;

    private String dcMethCd;

    private Integer dcAmt;

    private BigDecimal dcRate;

    private Integer dcRateMaxAmt;

    private String dcMinUseAmtResYn;

    private Integer dcMinUseAmt;

    private String dcAddDcCpnYn;

    private Integer realDcAmt;

    private Date regDt;

    private String regId;

    private Date modDt;

    private String modId;

    private static final long serialVersionUID = com.mushbird.sinsege.base.constant.AppConst.UID;

    public Integer getOrdCpnChistId() {
        return ordCpnChistId;
    }

    public void setOrdCpnChistId(Integer ordCpnChistId) {
        this.ordCpnChistId = ordCpnChistId;
    }

    public Integer getOrdCpnId() {
        return ordCpnId;
    }

    public void setOrdCpnId(Integer ordCpnId) {
        this.ordCpnId = ordCpnId;
    }

    public Integer getMbrCpnId() {
        return mbrCpnId;
    }

    public void setMbrCpnId(Integer mbrCpnId) {
        this.mbrCpnId = mbrCpnId;
    }

    public Integer getOrdId() {
        return ordId;
    }

    public void setOrdId(Integer ordId) {
        this.ordId = ordId;
    }

    public String getOrdCpnAplyCd() {
        return ordCpnAplyCd;
    }

    public void setOrdCpnAplyCd(String ordCpnAplyCd) {
        this.ordCpnAplyCd = ordCpnAplyCd == null ? null : ordCpnAplyCd.trim();
    }

    public String getCpnTpCd() {
        return cpnTpCd;
    }

    public void setCpnTpCd(String cpnTpCd) {
        this.cpnTpCd = cpnTpCd == null ? null : cpnTpCd.trim();
    }

    public String getCpnAutoClCd() {
        return cpnAutoClCd;
    }

    public void setCpnAutoClCd(String cpnAutoClCd) {
        this.cpnAutoClCd = cpnAutoClCd == null ? null : cpnAutoClCd.trim();
    }

    public String getCpnNo() {
        return cpnNo;
    }

    public void setCpnNo(String cpnNo) {
        this.cpnNo = cpnNo == null ? null : cpnNo.trim();
    }

    public String getCpnNm() {
        return cpnNm;
    }

    public void setCpnNm(String cpnNm) {
        this.cpnNm = cpnNm == null ? null : cpnNm.trim();
    }

    public String getMbrCpnNo() {
        return mbrCpnNo;
    }

    public void setMbrCpnNo(String mbrCpnNo) {
        this.mbrCpnNo = mbrCpnNo == null ? null : mbrCpnNo.trim();
    }

    public String getDcMethCd() {
        return dcMethCd;
    }

    public void setDcMethCd(String dcMethCd) {
        this.dcMethCd = dcMethCd == null ? null : dcMethCd.trim();
    }

    public Integer getDcAmt() {
        return dcAmt;
    }

    public void setDcAmt(Integer dcAmt) {
        this.dcAmt = dcAmt;
    }

    public BigDecimal getDcRate() {
        return dcRate;
    }

    public void setDcRate(BigDecimal dcRate) {
        this.dcRate = dcRate;
    }

    public Integer getDcRateMaxAmt() {
        return dcRateMaxAmt;
    }

    public void setDcRateMaxAmt(Integer dcRateMaxAmt) {
        this.dcRateMaxAmt = dcRateMaxAmt;
    }

    public String getDcMinUseAmtResYn() {
        return dcMinUseAmtResYn;
    }

    public void setDcMinUseAmtResYn(String dcMinUseAmtResYn) {
        this.dcMinUseAmtResYn = dcMinUseAmtResYn == null ? null : dcMinUseAmtResYn.trim();
    }

    public Integer getDcMinUseAmt() {
        return dcMinUseAmt;
    }

    public void setDcMinUseAmt(Integer dcMinUseAmt) {
        this.dcMinUseAmt = dcMinUseAmt;
    }

    public String getDcAddDcCpnYn() {
        return dcAddDcCpnYn;
    }

    public void setDcAddDcCpnYn(String dcAddDcCpnYn) {
        this.dcAddDcCpnYn = dcAddDcCpnYn == null ? null : dcAddDcCpnYn.trim();
    }

    public Integer getRealDcAmt() {
        return realDcAmt;
    }

    public void setRealDcAmt(Integer realDcAmt) {
        this.realDcAmt = realDcAmt;
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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", ordCpnChistId=").append(ordCpnChistId);
        sb.append(", ordCpnId=").append(ordCpnId);
        sb.append(", mbrCpnId=").append(mbrCpnId);
        sb.append(", ordId=").append(ordId);
        sb.append(", ordCpnAplyCd=").append(ordCpnAplyCd);
        sb.append(", cpnTpCd=").append(cpnTpCd);
        sb.append(", cpnAutoClCd=").append(cpnAutoClCd);
        sb.append(", cpnNo=").append(cpnNo);
        sb.append(", cpnNm=").append(cpnNm);
        sb.append(", mbrCpnNo=").append(mbrCpnNo);
        sb.append(", dcMethCd=").append(dcMethCd);
        sb.append(", dcAmt=").append(dcAmt);
        sb.append(", dcRate=").append(dcRate);
        sb.append(", dcRateMaxAmt=").append(dcRateMaxAmt);
        sb.append(", dcMinUseAmtResYn=").append(dcMinUseAmtResYn);
        sb.append(", dcMinUseAmt=").append(dcMinUseAmt);
        sb.append(", dcAddDcCpnYn=").append(dcAddDcCpnYn);
        sb.append(", realDcAmt=").append(realDcAmt);
        sb.append(", regDt=").append(regDt);
        sb.append(", regId=").append(regId);
        sb.append(", modDt=").append(modDt);
        sb.append(", modId=").append(modId);
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
        OrderCouponChangeHistoryEntity other = (OrderCouponChangeHistoryEntity) that;
        return (this.getOrdCpnChistId() == null ? other.getOrdCpnChistId() == null : this.getOrdCpnChistId().equals(other.getOrdCpnChistId()))
            && (this.getOrdCpnId() == null ? other.getOrdCpnId() == null : this.getOrdCpnId().equals(other.getOrdCpnId()))
            && (this.getMbrCpnId() == null ? other.getMbrCpnId() == null : this.getMbrCpnId().equals(other.getMbrCpnId()))
            && (this.getOrdId() == null ? other.getOrdId() == null : this.getOrdId().equals(other.getOrdId()))
            && (this.getOrdCpnAplyCd() == null ? other.getOrdCpnAplyCd() == null : this.getOrdCpnAplyCd().equals(other.getOrdCpnAplyCd()))
            && (this.getCpnTpCd() == null ? other.getCpnTpCd() == null : this.getCpnTpCd().equals(other.getCpnTpCd()))
            && (this.getCpnAutoClCd() == null ? other.getCpnAutoClCd() == null : this.getCpnAutoClCd().equals(other.getCpnAutoClCd()))
            && (this.getCpnNo() == null ? other.getCpnNo() == null : this.getCpnNo().equals(other.getCpnNo()))
            && (this.getCpnNm() == null ? other.getCpnNm() == null : this.getCpnNm().equals(other.getCpnNm()))
            && (this.getMbrCpnNo() == null ? other.getMbrCpnNo() == null : this.getMbrCpnNo().equals(other.getMbrCpnNo()))
            && (this.getDcMethCd() == null ? other.getDcMethCd() == null : this.getDcMethCd().equals(other.getDcMethCd()))
            && (this.getDcAmt() == null ? other.getDcAmt() == null : this.getDcAmt().equals(other.getDcAmt()))
            && (this.getDcRate() == null ? other.getDcRate() == null : this.getDcRate().equals(other.getDcRate()))
            && (this.getDcRateMaxAmt() == null ? other.getDcRateMaxAmt() == null : this.getDcRateMaxAmt().equals(other.getDcRateMaxAmt()))
            && (this.getDcMinUseAmtResYn() == null ? other.getDcMinUseAmtResYn() == null : this.getDcMinUseAmtResYn().equals(other.getDcMinUseAmtResYn()))
            && (this.getDcMinUseAmt() == null ? other.getDcMinUseAmt() == null : this.getDcMinUseAmt().equals(other.getDcMinUseAmt()))
            && (this.getDcAddDcCpnYn() == null ? other.getDcAddDcCpnYn() == null : this.getDcAddDcCpnYn().equals(other.getDcAddDcCpnYn()))
            && (this.getRealDcAmt() == null ? other.getRealDcAmt() == null : this.getRealDcAmt().equals(other.getRealDcAmt()))
            && (this.getRegDt() == null ? other.getRegDt() == null : this.getRegDt().equals(other.getRegDt()))
            && (this.getRegId() == null ? other.getRegId() == null : this.getRegId().equals(other.getRegId()))
            && (this.getModDt() == null ? other.getModDt() == null : this.getModDt().equals(other.getModDt()))
            && (this.getModId() == null ? other.getModId() == null : this.getModId().equals(other.getModId()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getOrdCpnChistId() == null) ? 0 : getOrdCpnChistId().hashCode());
        result = prime * result + ((getOrdCpnId() == null) ? 0 : getOrdCpnId().hashCode());
        result = prime * result + ((getMbrCpnId() == null) ? 0 : getMbrCpnId().hashCode());
        result = prime * result + ((getOrdId() == null) ? 0 : getOrdId().hashCode());
        result = prime * result + ((getOrdCpnAplyCd() == null) ? 0 : getOrdCpnAplyCd().hashCode());
        result = prime * result + ((getCpnTpCd() == null) ? 0 : getCpnTpCd().hashCode());
        result = prime * result + ((getCpnAutoClCd() == null) ? 0 : getCpnAutoClCd().hashCode());
        result = prime * result + ((getCpnNo() == null) ? 0 : getCpnNo().hashCode());
        result = prime * result + ((getCpnNm() == null) ? 0 : getCpnNm().hashCode());
        result = prime * result + ((getMbrCpnNo() == null) ? 0 : getMbrCpnNo().hashCode());
        result = prime * result + ((getDcMethCd() == null) ? 0 : getDcMethCd().hashCode());
        result = prime * result + ((getDcAmt() == null) ? 0 : getDcAmt().hashCode());
        result = prime * result + ((getDcRate() == null) ? 0 : getDcRate().hashCode());
        result = prime * result + ((getDcRateMaxAmt() == null) ? 0 : getDcRateMaxAmt().hashCode());
        result = prime * result + ((getDcMinUseAmtResYn() == null) ? 0 : getDcMinUseAmtResYn().hashCode());
        result = prime * result + ((getDcMinUseAmt() == null) ? 0 : getDcMinUseAmt().hashCode());
        result = prime * result + ((getDcAddDcCpnYn() == null) ? 0 : getDcAddDcCpnYn().hashCode());
        result = prime * result + ((getRealDcAmt() == null) ? 0 : getRealDcAmt().hashCode());
        result = prime * result + ((getRegDt() == null) ? 0 : getRegDt().hashCode());
        result = prime * result + ((getRegId() == null) ? 0 : getRegId().hashCode());
        result = prime * result + ((getModDt() == null) ? 0 : getModDt().hashCode());
        result = prime * result + ((getModId() == null) ? 0 : getModId().hashCode());
        return result;
    }
}