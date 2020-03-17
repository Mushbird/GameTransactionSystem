package com.mushbird.sinsege.base.module.payment.model.entity;

import com.mushbird.sinsege.base.model.BaseEntity;
import java.io.Serializable;
import java.util.Date;

public abstract class PaymentRefundBatchQueueEntity extends BaseEntity implements Serializable {
    private Integer payRfdBatchQueId;

    private Integer payId;

    private String payPgCd;

    private String tranNoVal;

    private String partCnclClVal;

    private String mid;

    private Integer oriPayAmt;

    private Integer rfdAmt;

    private Integer pgSplyAmt;

    private Integer pgVatAmt;

    private Integer pgTaxfreeAmt;

    private Integer errCnt;

    private String rsltMsg;

    private Date regDt;

    private String regId;

    private Date modDt;

    private String modId;

    private static final long serialVersionUID = com.mushbird.sinsege.base.constant.AppConst.UID;

    public Integer getPayRfdBatchQueId() {
        return payRfdBatchQueId;
    }

    public void setPayRfdBatchQueId(Integer payRfdBatchQueId) {
        this.payRfdBatchQueId = payRfdBatchQueId;
    }

    public Integer getPayId() {
        return payId;
    }

    public void setPayId(Integer payId) {
        this.payId = payId;
    }

    public String getPayPgCd() {
        return payPgCd;
    }

    public void setPayPgCd(String payPgCd) {
        this.payPgCd = payPgCd == null ? null : payPgCd.trim();
    }

    public String getTranNoVal() {
        return tranNoVal;
    }

    public void setTranNoVal(String tranNoVal) {
        this.tranNoVal = tranNoVal == null ? null : tranNoVal.trim();
    }

    public String getPartCnclClVal() {
        return partCnclClVal;
    }

    public void setPartCnclClVal(String partCnclClVal) {
        this.partCnclClVal = partCnclClVal == null ? null : partCnclClVal.trim();
    }

    public String getMid() {
        return mid;
    }

    public void setMid(String mid) {
        this.mid = mid == null ? null : mid.trim();
    }

    public Integer getOriPayAmt() {
        return oriPayAmt;
    }

    public void setOriPayAmt(Integer oriPayAmt) {
        this.oriPayAmt = oriPayAmt;
    }

    public Integer getRfdAmt() {
        return rfdAmt;
    }

    public void setRfdAmt(Integer rfdAmt) {
        this.rfdAmt = rfdAmt;
    }

    public Integer getPgSplyAmt() {
        return pgSplyAmt;
    }

    public void setPgSplyAmt(Integer pgSplyAmt) {
        this.pgSplyAmt = pgSplyAmt;
    }

    public Integer getPgVatAmt() {
        return pgVatAmt;
    }

    public void setPgVatAmt(Integer pgVatAmt) {
        this.pgVatAmt = pgVatAmt;
    }

    public Integer getPgTaxfreeAmt() {
        return pgTaxfreeAmt;
    }

    public void setPgTaxfreeAmt(Integer pgTaxfreeAmt) {
        this.pgTaxfreeAmt = pgTaxfreeAmt;
    }

    public Integer getErrCnt() {
        return errCnt;
    }

    public void setErrCnt(Integer errCnt) {
        this.errCnt = errCnt;
    }

    public String getRsltMsg() {
        return rsltMsg;
    }

    public void setRsltMsg(String rsltMsg) {
        this.rsltMsg = rsltMsg == null ? null : rsltMsg.trim();
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
        sb.append(", payRfdBatchQueId=").append(payRfdBatchQueId);
        sb.append(", payId=").append(payId);
        sb.append(", payPgCd=").append(payPgCd);
        sb.append(", tranNoVal=").append(tranNoVal);
        sb.append(", partCnclClVal=").append(partCnclClVal);
        sb.append(", mid=").append(mid);
        sb.append(", oriPayAmt=").append(oriPayAmt);
        sb.append(", rfdAmt=").append(rfdAmt);
        sb.append(", pgSplyAmt=").append(pgSplyAmt);
        sb.append(", pgVatAmt=").append(pgVatAmt);
        sb.append(", pgTaxfreeAmt=").append(pgTaxfreeAmt);
        sb.append(", errCnt=").append(errCnt);
        sb.append(", rsltMsg=").append(rsltMsg);
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
        PaymentRefundBatchQueueEntity other = (PaymentRefundBatchQueueEntity) that;
        return (this.getPayRfdBatchQueId() == null ? other.getPayRfdBatchQueId() == null : this.getPayRfdBatchQueId().equals(other.getPayRfdBatchQueId()))
            && (this.getPayId() == null ? other.getPayId() == null : this.getPayId().equals(other.getPayId()))
            && (this.getPayPgCd() == null ? other.getPayPgCd() == null : this.getPayPgCd().equals(other.getPayPgCd()))
            && (this.getTranNoVal() == null ? other.getTranNoVal() == null : this.getTranNoVal().equals(other.getTranNoVal()))
            && (this.getPartCnclClVal() == null ? other.getPartCnclClVal() == null : this.getPartCnclClVal().equals(other.getPartCnclClVal()))
            && (this.getMid() == null ? other.getMid() == null : this.getMid().equals(other.getMid()))
            && (this.getOriPayAmt() == null ? other.getOriPayAmt() == null : this.getOriPayAmt().equals(other.getOriPayAmt()))
            && (this.getRfdAmt() == null ? other.getRfdAmt() == null : this.getRfdAmt().equals(other.getRfdAmt()))
            && (this.getPgSplyAmt() == null ? other.getPgSplyAmt() == null : this.getPgSplyAmt().equals(other.getPgSplyAmt()))
            && (this.getPgVatAmt() == null ? other.getPgVatAmt() == null : this.getPgVatAmt().equals(other.getPgVatAmt()))
            && (this.getPgTaxfreeAmt() == null ? other.getPgTaxfreeAmt() == null : this.getPgTaxfreeAmt().equals(other.getPgTaxfreeAmt()))
            && (this.getErrCnt() == null ? other.getErrCnt() == null : this.getErrCnt().equals(other.getErrCnt()))
            && (this.getRsltMsg() == null ? other.getRsltMsg() == null : this.getRsltMsg().equals(other.getRsltMsg()))
            && (this.getRegDt() == null ? other.getRegDt() == null : this.getRegDt().equals(other.getRegDt()))
            && (this.getRegId() == null ? other.getRegId() == null : this.getRegId().equals(other.getRegId()))
            && (this.getModDt() == null ? other.getModDt() == null : this.getModDt().equals(other.getModDt()))
            && (this.getModId() == null ? other.getModId() == null : this.getModId().equals(other.getModId()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getPayRfdBatchQueId() == null) ? 0 : getPayRfdBatchQueId().hashCode());
        result = prime * result + ((getPayId() == null) ? 0 : getPayId().hashCode());
        result = prime * result + ((getPayPgCd() == null) ? 0 : getPayPgCd().hashCode());
        result = prime * result + ((getTranNoVal() == null) ? 0 : getTranNoVal().hashCode());
        result = prime * result + ((getPartCnclClVal() == null) ? 0 : getPartCnclClVal().hashCode());
        result = prime * result + ((getMid() == null) ? 0 : getMid().hashCode());
        result = prime * result + ((getOriPayAmt() == null) ? 0 : getOriPayAmt().hashCode());
        result = prime * result + ((getRfdAmt() == null) ? 0 : getRfdAmt().hashCode());
        result = prime * result + ((getPgSplyAmt() == null) ? 0 : getPgSplyAmt().hashCode());
        result = prime * result + ((getPgVatAmt() == null) ? 0 : getPgVatAmt().hashCode());
        result = prime * result + ((getPgTaxfreeAmt() == null) ? 0 : getPgTaxfreeAmt().hashCode());
        result = prime * result + ((getErrCnt() == null) ? 0 : getErrCnt().hashCode());
        result = prime * result + ((getRsltMsg() == null) ? 0 : getRsltMsg().hashCode());
        result = prime * result + ((getRegDt() == null) ? 0 : getRegDt().hashCode());
        result = prime * result + ((getRegId() == null) ? 0 : getRegId().hashCode());
        result = prime * result + ((getModDt() == null) ? 0 : getModDt().hashCode());
        result = prime * result + ((getModId() == null) ? 0 : getModId().hashCode());
        return result;
    }
}