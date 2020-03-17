package com.mushbird.sinsege.base.module.payment.model.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.mushbird.sinsege.base.model.BaseEntity;
import java.io.Serializable;
import java.util.Date;

public abstract class PaymentEntity extends BaseEntity implements Serializable {
    private Integer payId;

    private Integer oriPayId;

    private Integer ordId;

    private Integer ordClmId;

    private String payTpCd;

    private String payStatCd;

    private String payPgCd;

    private String mid;

    private String payMthdCd;

    private Integer payAmt;

    private Integer rfdAmt;

    private Integer realPayAmt;

    private Integer pgSplyAmt;

    private Integer pgVatAmt;

    private Integer pgTaxfreeAmt;

    private Integer cashRctTgtAmt;

    private String escrBuyYn;

    private Date payDt;

    private Date payCpltDt;

    @JsonIgnore
    private Date regDt;

    @JsonIgnore
    private String regId;

    @JsonIgnore
    private Date modDt;

    @JsonIgnore
    private String modId;

    private static final long serialVersionUID = com.mushbird.sinsege.base.constant.AppConst.UID;

    public Integer getPayId() {
        return payId;
    }

    public void setPayId(Integer payId) {
        this.payId = payId;
    }

    public Integer getOriPayId() {
        return oriPayId;
    }

    public void setOriPayId(Integer oriPayId) {
        this.oriPayId = oriPayId;
    }

    public Integer getOrdId() {
        return ordId;
    }

    public void setOrdId(Integer ordId) {
        this.ordId = ordId;
    }

    public Integer getOrdClmId() {
        return ordClmId;
    }

    public void setOrdClmId(Integer ordClmId) {
        this.ordClmId = ordClmId;
    }

    public String getPayTpCd() {
        return payTpCd;
    }

    public void setPayTpCd(String payTpCd) {
        this.payTpCd = payTpCd == null ? null : payTpCd.trim();
    }

    public String getPayStatCd() {
        return payStatCd;
    }

    public void setPayStatCd(String payStatCd) {
        this.payStatCd = payStatCd == null ? null : payStatCd.trim();
    }

    public String getPayPgCd() {
        return payPgCd;
    }

    public void setPayPgCd(String payPgCd) {
        this.payPgCd = payPgCd == null ? null : payPgCd.trim();
    }

    public String getMid() {
        return mid;
    }

    public void setMid(String mid) {
        this.mid = mid == null ? null : mid.trim();
    }

    public String getPayMthdCd() {
        return payMthdCd;
    }

    public void setPayMthdCd(String payMthdCd) {
        this.payMthdCd = payMthdCd == null ? null : payMthdCd.trim();
    }

    public Integer getPayAmt() {
        return payAmt;
    }

    public void setPayAmt(Integer payAmt) {
        this.payAmt = payAmt;
    }

    public Integer getRfdAmt() {
        return rfdAmt;
    }

    public void setRfdAmt(Integer rfdAmt) {
        this.rfdAmt = rfdAmt;
    }

    public Integer getRealPayAmt() {
        return realPayAmt;
    }

    public void setRealPayAmt(Integer realPayAmt) {
        this.realPayAmt = realPayAmt;
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

    public Integer getCashRctTgtAmt() {
        return cashRctTgtAmt;
    }

    public void setCashRctTgtAmt(Integer cashRctTgtAmt) {
        this.cashRctTgtAmt = cashRctTgtAmt;
    }

    public String getEscrBuyYn() {
        return escrBuyYn;
    }

    public void setEscrBuyYn(String escrBuyYn) {
        this.escrBuyYn = escrBuyYn == null ? null : escrBuyYn.trim();
    }

    public Date getPayDt() {
        return payDt;
    }

    public void setPayDt(Date payDt) {
        this.payDt = payDt;
    }

    public Date getPayCpltDt() {
        return payCpltDt;
    }

    public void setPayCpltDt(Date payCpltDt) {
        this.payCpltDt = payCpltDt;
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
        sb.append(", payId=").append(payId);
        sb.append(", oriPayId=").append(oriPayId);
        sb.append(", ordId=").append(ordId);
        sb.append(", ordClmId=").append(ordClmId);
        sb.append(", payTpCd=").append(payTpCd);
        sb.append(", payStatCd=").append(payStatCd);
        sb.append(", payPgCd=").append(payPgCd);
        sb.append(", mid=").append(mid);
        sb.append(", payMthdCd=").append(payMthdCd);
        sb.append(", payAmt=").append(payAmt);
        sb.append(", rfdAmt=").append(rfdAmt);
        sb.append(", realPayAmt=").append(realPayAmt);
        sb.append(", pgSplyAmt=").append(pgSplyAmt);
        sb.append(", pgVatAmt=").append(pgVatAmt);
        sb.append(", pgTaxfreeAmt=").append(pgTaxfreeAmt);
        sb.append(", cashRctTgtAmt=").append(cashRctTgtAmt);
        sb.append(", escrBuyYn=").append(escrBuyYn);
        sb.append(", payDt=").append(payDt);
        sb.append(", payCpltDt=").append(payCpltDt);
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
        PaymentEntity other = (PaymentEntity) that;
        return (this.getPayId() == null ? other.getPayId() == null : this.getPayId().equals(other.getPayId()))
            && (this.getOriPayId() == null ? other.getOriPayId() == null : this.getOriPayId().equals(other.getOriPayId()))
            && (this.getOrdId() == null ? other.getOrdId() == null : this.getOrdId().equals(other.getOrdId()))
            && (this.getOrdClmId() == null ? other.getOrdClmId() == null : this.getOrdClmId().equals(other.getOrdClmId()))
            && (this.getPayTpCd() == null ? other.getPayTpCd() == null : this.getPayTpCd().equals(other.getPayTpCd()))
            && (this.getPayStatCd() == null ? other.getPayStatCd() == null : this.getPayStatCd().equals(other.getPayStatCd()))
            && (this.getPayPgCd() == null ? other.getPayPgCd() == null : this.getPayPgCd().equals(other.getPayPgCd()))
            && (this.getMid() == null ? other.getMid() == null : this.getMid().equals(other.getMid()))
            && (this.getPayMthdCd() == null ? other.getPayMthdCd() == null : this.getPayMthdCd().equals(other.getPayMthdCd()))
            && (this.getPayAmt() == null ? other.getPayAmt() == null : this.getPayAmt().equals(other.getPayAmt()))
            && (this.getRfdAmt() == null ? other.getRfdAmt() == null : this.getRfdAmt().equals(other.getRfdAmt()))
            && (this.getRealPayAmt() == null ? other.getRealPayAmt() == null : this.getRealPayAmt().equals(other.getRealPayAmt()))
            && (this.getPgSplyAmt() == null ? other.getPgSplyAmt() == null : this.getPgSplyAmt().equals(other.getPgSplyAmt()))
            && (this.getPgVatAmt() == null ? other.getPgVatAmt() == null : this.getPgVatAmt().equals(other.getPgVatAmt()))
            && (this.getPgTaxfreeAmt() == null ? other.getPgTaxfreeAmt() == null : this.getPgTaxfreeAmt().equals(other.getPgTaxfreeAmt()))
            && (this.getCashRctTgtAmt() == null ? other.getCashRctTgtAmt() == null : this.getCashRctTgtAmt().equals(other.getCashRctTgtAmt()))
            && (this.getEscrBuyYn() == null ? other.getEscrBuyYn() == null : this.getEscrBuyYn().equals(other.getEscrBuyYn()))
            && (this.getPayDt() == null ? other.getPayDt() == null : this.getPayDt().equals(other.getPayDt()))
            && (this.getPayCpltDt() == null ? other.getPayCpltDt() == null : this.getPayCpltDt().equals(other.getPayCpltDt()))
            && (this.getRegDt() == null ? other.getRegDt() == null : this.getRegDt().equals(other.getRegDt()))
            && (this.getRegId() == null ? other.getRegId() == null : this.getRegId().equals(other.getRegId()))
            && (this.getModDt() == null ? other.getModDt() == null : this.getModDt().equals(other.getModDt()))
            && (this.getModId() == null ? other.getModId() == null : this.getModId().equals(other.getModId()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getPayId() == null) ? 0 : getPayId().hashCode());
        result = prime * result + ((getOriPayId() == null) ? 0 : getOriPayId().hashCode());
        result = prime * result + ((getOrdId() == null) ? 0 : getOrdId().hashCode());
        result = prime * result + ((getOrdClmId() == null) ? 0 : getOrdClmId().hashCode());
        result = prime * result + ((getPayTpCd() == null) ? 0 : getPayTpCd().hashCode());
        result = prime * result + ((getPayStatCd() == null) ? 0 : getPayStatCd().hashCode());
        result = prime * result + ((getPayPgCd() == null) ? 0 : getPayPgCd().hashCode());
        result = prime * result + ((getMid() == null) ? 0 : getMid().hashCode());
        result = prime * result + ((getPayMthdCd() == null) ? 0 : getPayMthdCd().hashCode());
        result = prime * result + ((getPayAmt() == null) ? 0 : getPayAmt().hashCode());
        result = prime * result + ((getRfdAmt() == null) ? 0 : getRfdAmt().hashCode());
        result = prime * result + ((getRealPayAmt() == null) ? 0 : getRealPayAmt().hashCode());
        result = prime * result + ((getPgSplyAmt() == null) ? 0 : getPgSplyAmt().hashCode());
        result = prime * result + ((getPgVatAmt() == null) ? 0 : getPgVatAmt().hashCode());
        result = prime * result + ((getPgTaxfreeAmt() == null) ? 0 : getPgTaxfreeAmt().hashCode());
        result = prime * result + ((getCashRctTgtAmt() == null) ? 0 : getCashRctTgtAmt().hashCode());
        result = prime * result + ((getEscrBuyYn() == null) ? 0 : getEscrBuyYn().hashCode());
        result = prime * result + ((getPayDt() == null) ? 0 : getPayDt().hashCode());
        result = prime * result + ((getPayCpltDt() == null) ? 0 : getPayCpltDt().hashCode());
        result = prime * result + ((getRegDt() == null) ? 0 : getRegDt().hashCode());
        result = prime * result + ((getRegId() == null) ? 0 : getRegId().hashCode());
        result = prime * result + ((getModDt() == null) ? 0 : getModDt().hashCode());
        result = prime * result + ((getModId() == null) ? 0 : getModId().hashCode());
        return result;
    }
}