package com.mushbird.sinsege.base.module.order.model.entity;

import com.mushbird.sinsege.base.model.BaseEntity;
import java.io.Serializable;
import java.util.Date;

public abstract class OrderClaimItemChangeHistoryEntity extends BaseEntity implements Serializable {
    private Integer ordClmItemChistId;

    private Integer ordClmItemId;

    private Integer ordClmId;

    private Integer ordItemId;

    private Integer clmItemSeq;

    private String clmItemNo;

    private String clmTpCd;

    private String clmItemStatCd;

    private Date clmItemStatChgDt;

    private String clmTimeOrdItemStatCd;

    private Date clmChckDt;

    private Date clmAprvDt;

    private Date clmHoldDt;

    private String clmHoldRsn;

    private Date clmRejDt;

    private String clmRejRsn;

    private Date clmCpltDt;

    private Integer cpnDcRtnAmt;

    private Integer ptUseRtnAmt;

    private Integer clmQty;

    private Integer clmAmt;

    private Integer payAddAmt;

    private Integer ptSaveCnclAmt;

    private String settlStatCd;

    private String settlYmd;

    private String settlPgYmd;

    private Date regDt;

    private String regId;

    private Date modDt;

    private String modId;

    private static final long serialVersionUID = com.mushbird.sinsege.base.constant.AppConst.UID;

    public Integer getOrdClmItemChistId() {
        return ordClmItemChistId;
    }

    public void setOrdClmItemChistId(Integer ordClmItemChistId) {
        this.ordClmItemChistId = ordClmItemChistId;
    }

    public Integer getOrdClmItemId() {
        return ordClmItemId;
    }

    public void setOrdClmItemId(Integer ordClmItemId) {
        this.ordClmItemId = ordClmItemId;
    }

    public Integer getOrdClmId() {
        return ordClmId;
    }

    public void setOrdClmId(Integer ordClmId) {
        this.ordClmId = ordClmId;
    }

    public Integer getOrdItemId() {
        return ordItemId;
    }

    public void setOrdItemId(Integer ordItemId) {
        this.ordItemId = ordItemId;
    }

    public Integer getClmItemSeq() {
        return clmItemSeq;
    }

    public void setClmItemSeq(Integer clmItemSeq) {
        this.clmItemSeq = clmItemSeq;
    }

    public String getClmItemNo() {
        return clmItemNo;
    }

    public void setClmItemNo(String clmItemNo) {
        this.clmItemNo = clmItemNo == null ? null : clmItemNo.trim();
    }

    public String getClmTpCd() {
        return clmTpCd;
    }

    public void setClmTpCd(String clmTpCd) {
        this.clmTpCd = clmTpCd == null ? null : clmTpCd.trim();
    }

    public String getClmItemStatCd() {
        return clmItemStatCd;
    }

    public void setClmItemStatCd(String clmItemStatCd) {
        this.clmItemStatCd = clmItemStatCd == null ? null : clmItemStatCd.trim();
    }

    public Date getClmItemStatChgDt() {
        return clmItemStatChgDt;
    }

    public void setClmItemStatChgDt(Date clmItemStatChgDt) {
        this.clmItemStatChgDt = clmItemStatChgDt;
    }

    public String getClmTimeOrdItemStatCd() {
        return clmTimeOrdItemStatCd;
    }

    public void setClmTimeOrdItemStatCd(String clmTimeOrdItemStatCd) {
        this.clmTimeOrdItemStatCd = clmTimeOrdItemStatCd == null ? null : clmTimeOrdItemStatCd.trim();
    }

    public Date getClmChckDt() {
        return clmChckDt;
    }

    public void setClmChckDt(Date clmChckDt) {
        this.clmChckDt = clmChckDt;
    }

    public Date getClmAprvDt() {
        return clmAprvDt;
    }

    public void setClmAprvDt(Date clmAprvDt) {
        this.clmAprvDt = clmAprvDt;
    }

    public Date getClmHoldDt() {
        return clmHoldDt;
    }

    public void setClmHoldDt(Date clmHoldDt) {
        this.clmHoldDt = clmHoldDt;
    }

    public String getClmHoldRsn() {
        return clmHoldRsn;
    }

    public void setClmHoldRsn(String clmHoldRsn) {
        this.clmHoldRsn = clmHoldRsn == null ? null : clmHoldRsn.trim();
    }

    public Date getClmRejDt() {
        return clmRejDt;
    }

    public void setClmRejDt(Date clmRejDt) {
        this.clmRejDt = clmRejDt;
    }

    public String getClmRejRsn() {
        return clmRejRsn;
    }

    public void setClmRejRsn(String clmRejRsn) {
        this.clmRejRsn = clmRejRsn == null ? null : clmRejRsn.trim();
    }

    public Date getClmCpltDt() {
        return clmCpltDt;
    }

    public void setClmCpltDt(Date clmCpltDt) {
        this.clmCpltDt = clmCpltDt;
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

    public Integer getClmQty() {
        return clmQty;
    }

    public void setClmQty(Integer clmQty) {
        this.clmQty = clmQty;
    }

    public Integer getClmAmt() {
        return clmAmt;
    }

    public void setClmAmt(Integer clmAmt) {
        this.clmAmt = clmAmt;
    }

    public Integer getPayAddAmt() {
        return payAddAmt;
    }

    public void setPayAddAmt(Integer payAddAmt) {
        this.payAddAmt = payAddAmt;
    }

    public Integer getPtSaveCnclAmt() {
        return ptSaveCnclAmt;
    }

    public void setPtSaveCnclAmt(Integer ptSaveCnclAmt) {
        this.ptSaveCnclAmt = ptSaveCnclAmt;
    }

    public String getSettlStatCd() {
        return settlStatCd;
    }

    public void setSettlStatCd(String settlStatCd) {
        this.settlStatCd = settlStatCd == null ? null : settlStatCd.trim();
    }

    public String getSettlYmd() {
        return settlYmd;
    }

    public void setSettlYmd(String settlYmd) {
        this.settlYmd = settlYmd == null ? null : settlYmd.trim();
    }

    public String getSettlPgYmd() {
        return settlPgYmd;
    }

    public void setSettlPgYmd(String settlPgYmd) {
        this.settlPgYmd = settlPgYmd == null ? null : settlPgYmd.trim();
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
        sb.append(", ordClmItemChistId=").append(ordClmItemChistId);
        sb.append(", ordClmItemId=").append(ordClmItemId);
        sb.append(", ordClmId=").append(ordClmId);
        sb.append(", ordItemId=").append(ordItemId);
        sb.append(", clmItemSeq=").append(clmItemSeq);
        sb.append(", clmItemNo=").append(clmItemNo);
        sb.append(", clmTpCd=").append(clmTpCd);
        sb.append(", clmItemStatCd=").append(clmItemStatCd);
        sb.append(", clmItemStatChgDt=").append(clmItemStatChgDt);
        sb.append(", clmTimeOrdItemStatCd=").append(clmTimeOrdItemStatCd);
        sb.append(", clmChckDt=").append(clmChckDt);
        sb.append(", clmAprvDt=").append(clmAprvDt);
        sb.append(", clmHoldDt=").append(clmHoldDt);
        sb.append(", clmHoldRsn=").append(clmHoldRsn);
        sb.append(", clmRejDt=").append(clmRejDt);
        sb.append(", clmRejRsn=").append(clmRejRsn);
        sb.append(", clmCpltDt=").append(clmCpltDt);
        sb.append(", cpnDcRtnAmt=").append(cpnDcRtnAmt);
        sb.append(", ptUseRtnAmt=").append(ptUseRtnAmt);
        sb.append(", clmQty=").append(clmQty);
        sb.append(", clmAmt=").append(clmAmt);
        sb.append(", payAddAmt=").append(payAddAmt);
        sb.append(", ptSaveCnclAmt=").append(ptSaveCnclAmt);
        sb.append(", settlStatCd=").append(settlStatCd);
        sb.append(", settlYmd=").append(settlYmd);
        sb.append(", settlPgYmd=").append(settlPgYmd);
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
        OrderClaimItemChangeHistoryEntity other = (OrderClaimItemChangeHistoryEntity) that;
        return (this.getOrdClmItemChistId() == null ? other.getOrdClmItemChistId() == null : this.getOrdClmItemChistId().equals(other.getOrdClmItemChistId()))
            && (this.getOrdClmItemId() == null ? other.getOrdClmItemId() == null : this.getOrdClmItemId().equals(other.getOrdClmItemId()))
            && (this.getOrdClmId() == null ? other.getOrdClmId() == null : this.getOrdClmId().equals(other.getOrdClmId()))
            && (this.getOrdItemId() == null ? other.getOrdItemId() == null : this.getOrdItemId().equals(other.getOrdItemId()))
            && (this.getClmItemSeq() == null ? other.getClmItemSeq() == null : this.getClmItemSeq().equals(other.getClmItemSeq()))
            && (this.getClmItemNo() == null ? other.getClmItemNo() == null : this.getClmItemNo().equals(other.getClmItemNo()))
            && (this.getClmTpCd() == null ? other.getClmTpCd() == null : this.getClmTpCd().equals(other.getClmTpCd()))
            && (this.getClmItemStatCd() == null ? other.getClmItemStatCd() == null : this.getClmItemStatCd().equals(other.getClmItemStatCd()))
            && (this.getClmItemStatChgDt() == null ? other.getClmItemStatChgDt() == null : this.getClmItemStatChgDt().equals(other.getClmItemStatChgDt()))
            && (this.getClmTimeOrdItemStatCd() == null ? other.getClmTimeOrdItemStatCd() == null : this.getClmTimeOrdItemStatCd().equals(other.getClmTimeOrdItemStatCd()))
            && (this.getClmChckDt() == null ? other.getClmChckDt() == null : this.getClmChckDt().equals(other.getClmChckDt()))
            && (this.getClmAprvDt() == null ? other.getClmAprvDt() == null : this.getClmAprvDt().equals(other.getClmAprvDt()))
            && (this.getClmHoldDt() == null ? other.getClmHoldDt() == null : this.getClmHoldDt().equals(other.getClmHoldDt()))
            && (this.getClmHoldRsn() == null ? other.getClmHoldRsn() == null : this.getClmHoldRsn().equals(other.getClmHoldRsn()))
            && (this.getClmRejDt() == null ? other.getClmRejDt() == null : this.getClmRejDt().equals(other.getClmRejDt()))
            && (this.getClmRejRsn() == null ? other.getClmRejRsn() == null : this.getClmRejRsn().equals(other.getClmRejRsn()))
            && (this.getClmCpltDt() == null ? other.getClmCpltDt() == null : this.getClmCpltDt().equals(other.getClmCpltDt()))
            && (this.getCpnDcRtnAmt() == null ? other.getCpnDcRtnAmt() == null : this.getCpnDcRtnAmt().equals(other.getCpnDcRtnAmt()))
            && (this.getPtUseRtnAmt() == null ? other.getPtUseRtnAmt() == null : this.getPtUseRtnAmt().equals(other.getPtUseRtnAmt()))
            && (this.getClmQty() == null ? other.getClmQty() == null : this.getClmQty().equals(other.getClmQty()))
            && (this.getClmAmt() == null ? other.getClmAmt() == null : this.getClmAmt().equals(other.getClmAmt()))
            && (this.getPayAddAmt() == null ? other.getPayAddAmt() == null : this.getPayAddAmt().equals(other.getPayAddAmt()))
            && (this.getPtSaveCnclAmt() == null ? other.getPtSaveCnclAmt() == null : this.getPtSaveCnclAmt().equals(other.getPtSaveCnclAmt()))
            && (this.getSettlStatCd() == null ? other.getSettlStatCd() == null : this.getSettlStatCd().equals(other.getSettlStatCd()))
            && (this.getSettlYmd() == null ? other.getSettlYmd() == null : this.getSettlYmd().equals(other.getSettlYmd()))
            && (this.getSettlPgYmd() == null ? other.getSettlPgYmd() == null : this.getSettlPgYmd().equals(other.getSettlPgYmd()))
            && (this.getRegDt() == null ? other.getRegDt() == null : this.getRegDt().equals(other.getRegDt()))
            && (this.getRegId() == null ? other.getRegId() == null : this.getRegId().equals(other.getRegId()))
            && (this.getModDt() == null ? other.getModDt() == null : this.getModDt().equals(other.getModDt()))
            && (this.getModId() == null ? other.getModId() == null : this.getModId().equals(other.getModId()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getOrdClmItemChistId() == null) ? 0 : getOrdClmItemChistId().hashCode());
        result = prime * result + ((getOrdClmItemId() == null) ? 0 : getOrdClmItemId().hashCode());
        result = prime * result + ((getOrdClmId() == null) ? 0 : getOrdClmId().hashCode());
        result = prime * result + ((getOrdItemId() == null) ? 0 : getOrdItemId().hashCode());
        result = prime * result + ((getClmItemSeq() == null) ? 0 : getClmItemSeq().hashCode());
        result = prime * result + ((getClmItemNo() == null) ? 0 : getClmItemNo().hashCode());
        result = prime * result + ((getClmTpCd() == null) ? 0 : getClmTpCd().hashCode());
        result = prime * result + ((getClmItemStatCd() == null) ? 0 : getClmItemStatCd().hashCode());
        result = prime * result + ((getClmItemStatChgDt() == null) ? 0 : getClmItemStatChgDt().hashCode());
        result = prime * result + ((getClmTimeOrdItemStatCd() == null) ? 0 : getClmTimeOrdItemStatCd().hashCode());
        result = prime * result + ((getClmChckDt() == null) ? 0 : getClmChckDt().hashCode());
        result = prime * result + ((getClmAprvDt() == null) ? 0 : getClmAprvDt().hashCode());
        result = prime * result + ((getClmHoldDt() == null) ? 0 : getClmHoldDt().hashCode());
        result = prime * result + ((getClmHoldRsn() == null) ? 0 : getClmHoldRsn().hashCode());
        result = prime * result + ((getClmRejDt() == null) ? 0 : getClmRejDt().hashCode());
        result = prime * result + ((getClmRejRsn() == null) ? 0 : getClmRejRsn().hashCode());
        result = prime * result + ((getClmCpltDt() == null) ? 0 : getClmCpltDt().hashCode());
        result = prime * result + ((getCpnDcRtnAmt() == null) ? 0 : getCpnDcRtnAmt().hashCode());
        result = prime * result + ((getPtUseRtnAmt() == null) ? 0 : getPtUseRtnAmt().hashCode());
        result = prime * result + ((getClmQty() == null) ? 0 : getClmQty().hashCode());
        result = prime * result + ((getClmAmt() == null) ? 0 : getClmAmt().hashCode());
        result = prime * result + ((getPayAddAmt() == null) ? 0 : getPayAddAmt().hashCode());
        result = prime * result + ((getPtSaveCnclAmt() == null) ? 0 : getPtSaveCnclAmt().hashCode());
        result = prime * result + ((getSettlStatCd() == null) ? 0 : getSettlStatCd().hashCode());
        result = prime * result + ((getSettlYmd() == null) ? 0 : getSettlYmd().hashCode());
        result = prime * result + ((getSettlPgYmd() == null) ? 0 : getSettlPgYmd().hashCode());
        result = prime * result + ((getRegDt() == null) ? 0 : getRegDt().hashCode());
        result = prime * result + ((getRegId() == null) ? 0 : getRegId().hashCode());
        result = prime * result + ((getModDt() == null) ? 0 : getModDt().hashCode());
        result = prime * result + ((getModId() == null) ? 0 : getModId().hashCode());
        return result;
    }
}