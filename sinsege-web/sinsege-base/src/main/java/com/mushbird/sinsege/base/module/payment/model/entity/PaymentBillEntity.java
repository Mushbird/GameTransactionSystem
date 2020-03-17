package com.mushbird.sinsege.base.module.payment.model.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.mushbird.sinsege.base.model.BaseEntity;
import java.io.Serializable;
import java.util.Date;

public abstract class PaymentBillEntity extends BaseEntity implements Serializable {
    private Integer payBillId;

    private String mbrId;

    private String billkey;

    private String ccrdHglNm;

    private String chkCardYnVal;

    private String rawDataCont;

    private String rcvRawDataCont;

    @JsonIgnore
    private Date regDt;

    @JsonIgnore
    private String regId;

    private static final long serialVersionUID = com.mushbird.sinsege.base.constant.AppConst.UID;

    public Integer getPayBillId() {
        return payBillId;
    }

    public void setPayBillId(Integer payBillId) {
        this.payBillId = payBillId;
    }

    public String getMbrId() {
        return mbrId;
    }

    public void setMbrId(String mbrId) {
        this.mbrId = mbrId == null ? null : mbrId.trim();
    }

    public String getBillkey() {
        return billkey;
    }

    public void setBillkey(String billkey) {
        this.billkey = billkey == null ? null : billkey.trim();
    }

    public String getCcrdHglNm() {
        return ccrdHglNm;
    }

    public void setCcrdHglNm(String ccrdHglNm) {
        this.ccrdHglNm = ccrdHglNm == null ? null : ccrdHglNm.trim();
    }

    public String getChkCardYnVal() {
        return chkCardYnVal;
    }

    public void setChkCardYnVal(String chkCardYnVal) {
        this.chkCardYnVal = chkCardYnVal == null ? null : chkCardYnVal.trim();
    }

    public String getRawDataCont() {
        return rawDataCont;
    }

    public void setRawDataCont(String rawDataCont) {
        this.rawDataCont = rawDataCont == null ? null : rawDataCont.trim();
    }

    public String getRcvRawDataCont() {
        return rcvRawDataCont;
    }

    public void setRcvRawDataCont(String rcvRawDataCont) {
        this.rcvRawDataCont = rcvRawDataCont == null ? null : rcvRawDataCont.trim();
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
        sb.append(", payBillId=").append(payBillId);
        sb.append(", mbrId=").append(mbrId);
        sb.append(", billkey=").append(billkey);
        sb.append(", ccrdHglNm=").append(ccrdHglNm);
        sb.append(", chkCardYnVal=").append(chkCardYnVal);
        sb.append(", rawDataCont=").append(rawDataCont);
        sb.append(", rcvRawDataCont=").append(rcvRawDataCont);
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
        PaymentBillEntity other = (PaymentBillEntity) that;
        return (this.getPayBillId() == null ? other.getPayBillId() == null : this.getPayBillId().equals(other.getPayBillId()))
            && (this.getMbrId() == null ? other.getMbrId() == null : this.getMbrId().equals(other.getMbrId()))
            && (this.getBillkey() == null ? other.getBillkey() == null : this.getBillkey().equals(other.getBillkey()))
            && (this.getCcrdHglNm() == null ? other.getCcrdHglNm() == null : this.getCcrdHglNm().equals(other.getCcrdHglNm()))
            && (this.getChkCardYnVal() == null ? other.getChkCardYnVal() == null : this.getChkCardYnVal().equals(other.getChkCardYnVal()))
            && (this.getRawDataCont() == null ? other.getRawDataCont() == null : this.getRawDataCont().equals(other.getRawDataCont()))
            && (this.getRcvRawDataCont() == null ? other.getRcvRawDataCont() == null : this.getRcvRawDataCont().equals(other.getRcvRawDataCont()))
            && (this.getRegDt() == null ? other.getRegDt() == null : this.getRegDt().equals(other.getRegDt()))
            && (this.getRegId() == null ? other.getRegId() == null : this.getRegId().equals(other.getRegId()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getPayBillId() == null) ? 0 : getPayBillId().hashCode());
        result = prime * result + ((getMbrId() == null) ? 0 : getMbrId().hashCode());
        result = prime * result + ((getBillkey() == null) ? 0 : getBillkey().hashCode());
        result = prime * result + ((getCcrdHglNm() == null) ? 0 : getCcrdHglNm().hashCode());
        result = prime * result + ((getChkCardYnVal() == null) ? 0 : getChkCardYnVal().hashCode());
        result = prime * result + ((getRawDataCont() == null) ? 0 : getRawDataCont().hashCode());
        result = prime * result + ((getRcvRawDataCont() == null) ? 0 : getRcvRawDataCont().hashCode());
        result = prime * result + ((getRegDt() == null) ? 0 : getRegDt().hashCode());
        result = prime * result + ((getRegId() == null) ? 0 : getRegId().hashCode());
        return result;
    }
}