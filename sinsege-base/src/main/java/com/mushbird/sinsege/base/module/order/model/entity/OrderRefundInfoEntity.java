package com.mushbird.sinsege.base.module.order.model.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.mushbird.sinsege.base.model.BaseEntity;
import java.io.Serializable;
import java.util.Date;

public abstract class OrderRefundInfoEntity extends BaseEntity implements Serializable {
    private Integer ordRfdInfoId;

    private Integer ordId;

    private Integer ordClmId;

    private String rfdBankCd;

    private String rfdBankNm;

    private String rfdAcctNo;

    private String rfdAcctDptrNm;

    private String memoCont;

    @JsonIgnore
    private Date regDt;

    @JsonIgnore
    private String regId;

    @JsonIgnore
    private String useYn;

    private static final long serialVersionUID = com.mushbird.sinsege.base.constant.AppConst.UID;

    public Integer getOrdRfdInfoId() {
        return ordRfdInfoId;
    }

    public void setOrdRfdInfoId(Integer ordRfdInfoId) {
        this.ordRfdInfoId = ordRfdInfoId;
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

    public String getRfdBankCd() {
        return rfdBankCd;
    }

    public void setRfdBankCd(String rfdBankCd) {
        this.rfdBankCd = rfdBankCd == null ? null : rfdBankCd.trim();
    }

    public String getRfdBankNm() {
        return rfdBankNm;
    }

    public void setRfdBankNm(String rfdBankNm) {
        this.rfdBankNm = rfdBankNm == null ? null : rfdBankNm.trim();
    }

    public String getRfdAcctNo() {
        return rfdAcctNo;
    }

    public void setRfdAcctNo(String rfdAcctNo) {
        this.rfdAcctNo = rfdAcctNo == null ? null : rfdAcctNo.trim();
    }

    public String getRfdAcctDptrNm() {
        return rfdAcctDptrNm;
    }

    public void setRfdAcctDptrNm(String rfdAcctDptrNm) {
        this.rfdAcctDptrNm = rfdAcctDptrNm == null ? null : rfdAcctDptrNm.trim();
    }

    public String getMemoCont() {
        return memoCont;
    }

    public void setMemoCont(String memoCont) {
        this.memoCont = memoCont == null ? null : memoCont.trim();
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
        sb.append(", ordRfdInfoId=").append(ordRfdInfoId);
        sb.append(", ordId=").append(ordId);
        sb.append(", ordClmId=").append(ordClmId);
        sb.append(", rfdBankCd=").append(rfdBankCd);
        sb.append(", rfdBankNm=").append(rfdBankNm);
        sb.append(", rfdAcctNo=").append(rfdAcctNo);
        sb.append(", rfdAcctDptrNm=").append(rfdAcctDptrNm);
        sb.append(", memoCont=").append(memoCont);
        sb.append(", regDt=").append(regDt);
        sb.append(", regId=").append(regId);
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
        OrderRefundInfoEntity other = (OrderRefundInfoEntity) that;
        return (this.getOrdRfdInfoId() == null ? other.getOrdRfdInfoId() == null : this.getOrdRfdInfoId().equals(other.getOrdRfdInfoId()))
            && (this.getOrdId() == null ? other.getOrdId() == null : this.getOrdId().equals(other.getOrdId()))
            && (this.getOrdClmId() == null ? other.getOrdClmId() == null : this.getOrdClmId().equals(other.getOrdClmId()))
            && (this.getRfdBankCd() == null ? other.getRfdBankCd() == null : this.getRfdBankCd().equals(other.getRfdBankCd()))
            && (this.getRfdBankNm() == null ? other.getRfdBankNm() == null : this.getRfdBankNm().equals(other.getRfdBankNm()))
            && (this.getRfdAcctNo() == null ? other.getRfdAcctNo() == null : this.getRfdAcctNo().equals(other.getRfdAcctNo()))
            && (this.getRfdAcctDptrNm() == null ? other.getRfdAcctDptrNm() == null : this.getRfdAcctDptrNm().equals(other.getRfdAcctDptrNm()))
            && (this.getMemoCont() == null ? other.getMemoCont() == null : this.getMemoCont().equals(other.getMemoCont()))
            && (this.getRegDt() == null ? other.getRegDt() == null : this.getRegDt().equals(other.getRegDt()))
            && (this.getRegId() == null ? other.getRegId() == null : this.getRegId().equals(other.getRegId()))
            && (this.getUseYn() == null ? other.getUseYn() == null : this.getUseYn().equals(other.getUseYn()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getOrdRfdInfoId() == null) ? 0 : getOrdRfdInfoId().hashCode());
        result = prime * result + ((getOrdId() == null) ? 0 : getOrdId().hashCode());
        result = prime * result + ((getOrdClmId() == null) ? 0 : getOrdClmId().hashCode());
        result = prime * result + ((getRfdBankCd() == null) ? 0 : getRfdBankCd().hashCode());
        result = prime * result + ((getRfdBankNm() == null) ? 0 : getRfdBankNm().hashCode());
        result = prime * result + ((getRfdAcctNo() == null) ? 0 : getRfdAcctNo().hashCode());
        result = prime * result + ((getRfdAcctDptrNm() == null) ? 0 : getRfdAcctDptrNm().hashCode());
        result = prime * result + ((getMemoCont() == null) ? 0 : getMemoCont().hashCode());
        result = prime * result + ((getRegDt() == null) ? 0 : getRegDt().hashCode());
        result = prime * result + ((getRegId() == null) ? 0 : getRegId().hashCode());
        result = prime * result + ((getUseYn() == null) ? 0 : getUseYn().hashCode());
        return result;
    }
}