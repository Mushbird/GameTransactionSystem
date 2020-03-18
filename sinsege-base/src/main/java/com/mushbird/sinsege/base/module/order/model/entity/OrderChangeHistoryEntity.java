package com.mushbird.sinsege.base.module.order.model.entity;

import com.mushbird.sinsege.base.model.BaseEntity;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public abstract class OrderChangeHistoryEntity extends BaseEntity implements Serializable {
    private Integer ordChistId;

    private Integer ordId;

    private String ordNo;

    private String ordTpCd;

    private String ordRcptChCd;

    private String ordRcptEnvCd;

    private Date ordDt;

    private String mbrId;

    private String mbrGrdCd;

    private BigDecimal mbrPtSaveRate;

    private String buyrNm;

    private String buyrCpNo;

    private String buyrTelNo;

    private String buyrEmail;

    private String buyrIpAddr;

    private String buyrOrdAgrYn;

    private Date buyrOrdAgrDt;

    private String fstPayMthd;

    private Integer fstOrdAmt;

    private Integer fstCpnDcAmt;

    private Integer fstPtUseAmt;

    private Integer fstRealOrdAmt;

    private Integer fstRealPayAmt;

    private String payMthd;

    private Integer ordAmt;

    private Integer cpnDcAmt;

    private Integer ptUseAmt;

    private Integer realOrdAmt;

    private Integer realPayAmt;

    private Integer pgSplyAmt;

    private Integer pgVatAmt;

    private Integer pgTaxfreeAmt;

    private Date payCpltDt;

    private Date regDt;

    private String regId;

    private Date modDt;

    private String modId;

    private static final long serialVersionUID = com.mushbird.sinsege.base.constant.AppConst.UID;

    public Integer getOrdChistId() {
        return ordChistId;
    }

    public void setOrdChistId(Integer ordChistId) {
        this.ordChistId = ordChistId;
    }

    public Integer getOrdId() {
        return ordId;
    }

    public void setOrdId(Integer ordId) {
        this.ordId = ordId;
    }

    public String getOrdNo() {
        return ordNo;
    }

    public void setOrdNo(String ordNo) {
        this.ordNo = ordNo == null ? null : ordNo.trim();
    }

    public String getOrdTpCd() {
        return ordTpCd;
    }

    public void setOrdTpCd(String ordTpCd) {
        this.ordTpCd = ordTpCd == null ? null : ordTpCd.trim();
    }

    public String getOrdRcptChCd() {
        return ordRcptChCd;
    }

    public void setOrdRcptChCd(String ordRcptChCd) {
        this.ordRcptChCd = ordRcptChCd == null ? null : ordRcptChCd.trim();
    }

    public String getOrdRcptEnvCd() {
        return ordRcptEnvCd;
    }

    public void setOrdRcptEnvCd(String ordRcptEnvCd) {
        this.ordRcptEnvCd = ordRcptEnvCd == null ? null : ordRcptEnvCd.trim();
    }

    public Date getOrdDt() {
        return ordDt;
    }

    public void setOrdDt(Date ordDt) {
        this.ordDt = ordDt;
    }

    public String getMbrId() {
        return mbrId;
    }

    public void setMbrId(String mbrId) {
        this.mbrId = mbrId == null ? null : mbrId.trim();
    }

    public String getMbrGrdCd() {
        return mbrGrdCd;
    }

    public void setMbrGrdCd(String mbrGrdCd) {
        this.mbrGrdCd = mbrGrdCd == null ? null : mbrGrdCd.trim();
    }

    public BigDecimal getMbrPtSaveRate() {
        return mbrPtSaveRate;
    }

    public void setMbrPtSaveRate(BigDecimal mbrPtSaveRate) {
        this.mbrPtSaveRate = mbrPtSaveRate;
    }

    public String getBuyrNm() {
        return buyrNm;
    }

    public void setBuyrNm(String buyrNm) {
        this.buyrNm = buyrNm == null ? null : buyrNm.trim();
    }

    public String getBuyrCpNo() {
        return buyrCpNo;
    }

    public void setBuyrCpNo(String buyrCpNo) {
        this.buyrCpNo = buyrCpNo == null ? null : buyrCpNo.trim();
    }

    public String getBuyrTelNo() {
        return buyrTelNo;
    }

    public void setBuyrTelNo(String buyrTelNo) {
        this.buyrTelNo = buyrTelNo == null ? null : buyrTelNo.trim();
    }

    public String getBuyrEmail() {
        return buyrEmail;
    }

    public void setBuyrEmail(String buyrEmail) {
        this.buyrEmail = buyrEmail == null ? null : buyrEmail.trim();
    }

    public String getBuyrIpAddr() {
        return buyrIpAddr;
    }

    public void setBuyrIpAddr(String buyrIpAddr) {
        this.buyrIpAddr = buyrIpAddr == null ? null : buyrIpAddr.trim();
    }

    public String getBuyrOrdAgrYn() {
        return buyrOrdAgrYn;
    }

    public void setBuyrOrdAgrYn(String buyrOrdAgrYn) {
        this.buyrOrdAgrYn = buyrOrdAgrYn == null ? null : buyrOrdAgrYn.trim();
    }

    public Date getBuyrOrdAgrDt() {
        return buyrOrdAgrDt;
    }

    public void setBuyrOrdAgrDt(Date buyrOrdAgrDt) {
        this.buyrOrdAgrDt = buyrOrdAgrDt;
    }

    public String getFstPayMthd() {
        return fstPayMthd;
    }

    public void setFstPayMthd(String fstPayMthd) {
        this.fstPayMthd = fstPayMthd == null ? null : fstPayMthd.trim();
    }

    public Integer getFstOrdAmt() {
        return fstOrdAmt;
    }

    public void setFstOrdAmt(Integer fstOrdAmt) {
        this.fstOrdAmt = fstOrdAmt;
    }

    public Integer getFstCpnDcAmt() {
        return fstCpnDcAmt;
    }

    public void setFstCpnDcAmt(Integer fstCpnDcAmt) {
        this.fstCpnDcAmt = fstCpnDcAmt;
    }

    public Integer getFstPtUseAmt() {
        return fstPtUseAmt;
    }

    public void setFstPtUseAmt(Integer fstPtUseAmt) {
        this.fstPtUseAmt = fstPtUseAmt;
    }

    public Integer getFstRealOrdAmt() {
        return fstRealOrdAmt;
    }

    public void setFstRealOrdAmt(Integer fstRealOrdAmt) {
        this.fstRealOrdAmt = fstRealOrdAmt;
    }

    public Integer getFstRealPayAmt() {
        return fstRealPayAmt;
    }

    public void setFstRealPayAmt(Integer fstRealPayAmt) {
        this.fstRealPayAmt = fstRealPayAmt;
    }

    public String getPayMthd() {
        return payMthd;
    }

    public void setPayMthd(String payMthd) {
        this.payMthd = payMthd == null ? null : payMthd.trim();
    }

    public Integer getOrdAmt() {
        return ordAmt;
    }

    public void setOrdAmt(Integer ordAmt) {
        this.ordAmt = ordAmt;
    }

    public Integer getCpnDcAmt() {
        return cpnDcAmt;
    }

    public void setCpnDcAmt(Integer cpnDcAmt) {
        this.cpnDcAmt = cpnDcAmt;
    }

    public Integer getPtUseAmt() {
        return ptUseAmt;
    }

    public void setPtUseAmt(Integer ptUseAmt) {
        this.ptUseAmt = ptUseAmt;
    }

    public Integer getRealOrdAmt() {
        return realOrdAmt;
    }

    public void setRealOrdAmt(Integer realOrdAmt) {
        this.realOrdAmt = realOrdAmt;
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
        sb.append(", ordChistId=").append(ordChistId);
        sb.append(", ordId=").append(ordId);
        sb.append(", ordNo=").append(ordNo);
        sb.append(", ordTpCd=").append(ordTpCd);
        sb.append(", ordRcptChCd=").append(ordRcptChCd);
        sb.append(", ordRcptEnvCd=").append(ordRcptEnvCd);
        sb.append(", ordDt=").append(ordDt);
        sb.append(", mbrId=").append(mbrId);
        sb.append(", mbrGrdCd=").append(mbrGrdCd);
        sb.append(", mbrPtSaveRate=").append(mbrPtSaveRate);
        sb.append(", buyrNm=").append(buyrNm);
        sb.append(", buyrCpNo=").append(buyrCpNo);
        sb.append(", buyrTelNo=").append(buyrTelNo);
        sb.append(", buyrEmail=").append(buyrEmail);
        sb.append(", buyrIpAddr=").append(buyrIpAddr);
        sb.append(", buyrOrdAgrYn=").append(buyrOrdAgrYn);
        sb.append(", buyrOrdAgrDt=").append(buyrOrdAgrDt);
        sb.append(", fstPayMthd=").append(fstPayMthd);
        sb.append(", fstOrdAmt=").append(fstOrdAmt);
        sb.append(", fstCpnDcAmt=").append(fstCpnDcAmt);
        sb.append(", fstPtUseAmt=").append(fstPtUseAmt);
        sb.append(", fstRealOrdAmt=").append(fstRealOrdAmt);
        sb.append(", fstRealPayAmt=").append(fstRealPayAmt);
        sb.append(", payMthd=").append(payMthd);
        sb.append(", ordAmt=").append(ordAmt);
        sb.append(", cpnDcAmt=").append(cpnDcAmt);
        sb.append(", ptUseAmt=").append(ptUseAmt);
        sb.append(", realOrdAmt=").append(realOrdAmt);
        sb.append(", realPayAmt=").append(realPayAmt);
        sb.append(", pgSplyAmt=").append(pgSplyAmt);
        sb.append(", pgVatAmt=").append(pgVatAmt);
        sb.append(", pgTaxfreeAmt=").append(pgTaxfreeAmt);
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
        OrderChangeHistoryEntity other = (OrderChangeHistoryEntity) that;
        return (this.getOrdChistId() == null ? other.getOrdChistId() == null : this.getOrdChistId().equals(other.getOrdChistId()))
            && (this.getOrdId() == null ? other.getOrdId() == null : this.getOrdId().equals(other.getOrdId()))
            && (this.getOrdNo() == null ? other.getOrdNo() == null : this.getOrdNo().equals(other.getOrdNo()))
            && (this.getOrdTpCd() == null ? other.getOrdTpCd() == null : this.getOrdTpCd().equals(other.getOrdTpCd()))
            && (this.getOrdRcptChCd() == null ? other.getOrdRcptChCd() == null : this.getOrdRcptChCd().equals(other.getOrdRcptChCd()))
            && (this.getOrdRcptEnvCd() == null ? other.getOrdRcptEnvCd() == null : this.getOrdRcptEnvCd().equals(other.getOrdRcptEnvCd()))
            && (this.getOrdDt() == null ? other.getOrdDt() == null : this.getOrdDt().equals(other.getOrdDt()))
            && (this.getMbrId() == null ? other.getMbrId() == null : this.getMbrId().equals(other.getMbrId()))
            && (this.getMbrGrdCd() == null ? other.getMbrGrdCd() == null : this.getMbrGrdCd().equals(other.getMbrGrdCd()))
            && (this.getMbrPtSaveRate() == null ? other.getMbrPtSaveRate() == null : this.getMbrPtSaveRate().equals(other.getMbrPtSaveRate()))
            && (this.getBuyrNm() == null ? other.getBuyrNm() == null : this.getBuyrNm().equals(other.getBuyrNm()))
            && (this.getBuyrCpNo() == null ? other.getBuyrCpNo() == null : this.getBuyrCpNo().equals(other.getBuyrCpNo()))
            && (this.getBuyrTelNo() == null ? other.getBuyrTelNo() == null : this.getBuyrTelNo().equals(other.getBuyrTelNo()))
            && (this.getBuyrEmail() == null ? other.getBuyrEmail() == null : this.getBuyrEmail().equals(other.getBuyrEmail()))
            && (this.getBuyrIpAddr() == null ? other.getBuyrIpAddr() == null : this.getBuyrIpAddr().equals(other.getBuyrIpAddr()))
            && (this.getBuyrOrdAgrYn() == null ? other.getBuyrOrdAgrYn() == null : this.getBuyrOrdAgrYn().equals(other.getBuyrOrdAgrYn()))
            && (this.getBuyrOrdAgrDt() == null ? other.getBuyrOrdAgrDt() == null : this.getBuyrOrdAgrDt().equals(other.getBuyrOrdAgrDt()))
            && (this.getFstPayMthd() == null ? other.getFstPayMthd() == null : this.getFstPayMthd().equals(other.getFstPayMthd()))
            && (this.getFstOrdAmt() == null ? other.getFstOrdAmt() == null : this.getFstOrdAmt().equals(other.getFstOrdAmt()))
            && (this.getFstCpnDcAmt() == null ? other.getFstCpnDcAmt() == null : this.getFstCpnDcAmt().equals(other.getFstCpnDcAmt()))
            && (this.getFstPtUseAmt() == null ? other.getFstPtUseAmt() == null : this.getFstPtUseAmt().equals(other.getFstPtUseAmt()))
            && (this.getFstRealOrdAmt() == null ? other.getFstRealOrdAmt() == null : this.getFstRealOrdAmt().equals(other.getFstRealOrdAmt()))
            && (this.getFstRealPayAmt() == null ? other.getFstRealPayAmt() == null : this.getFstRealPayAmt().equals(other.getFstRealPayAmt()))
            && (this.getPayMthd() == null ? other.getPayMthd() == null : this.getPayMthd().equals(other.getPayMthd()))
            && (this.getOrdAmt() == null ? other.getOrdAmt() == null : this.getOrdAmt().equals(other.getOrdAmt()))
            && (this.getCpnDcAmt() == null ? other.getCpnDcAmt() == null : this.getCpnDcAmt().equals(other.getCpnDcAmt()))
            && (this.getPtUseAmt() == null ? other.getPtUseAmt() == null : this.getPtUseAmt().equals(other.getPtUseAmt()))
            && (this.getRealOrdAmt() == null ? other.getRealOrdAmt() == null : this.getRealOrdAmt().equals(other.getRealOrdAmt()))
            && (this.getRealPayAmt() == null ? other.getRealPayAmt() == null : this.getRealPayAmt().equals(other.getRealPayAmt()))
            && (this.getPgSplyAmt() == null ? other.getPgSplyAmt() == null : this.getPgSplyAmt().equals(other.getPgSplyAmt()))
            && (this.getPgVatAmt() == null ? other.getPgVatAmt() == null : this.getPgVatAmt().equals(other.getPgVatAmt()))
            && (this.getPgTaxfreeAmt() == null ? other.getPgTaxfreeAmt() == null : this.getPgTaxfreeAmt().equals(other.getPgTaxfreeAmt()))
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
        result = prime * result + ((getOrdChistId() == null) ? 0 : getOrdChistId().hashCode());
        result = prime * result + ((getOrdId() == null) ? 0 : getOrdId().hashCode());
        result = prime * result + ((getOrdNo() == null) ? 0 : getOrdNo().hashCode());
        result = prime * result + ((getOrdTpCd() == null) ? 0 : getOrdTpCd().hashCode());
        result = prime * result + ((getOrdRcptChCd() == null) ? 0 : getOrdRcptChCd().hashCode());
        result = prime * result + ((getOrdRcptEnvCd() == null) ? 0 : getOrdRcptEnvCd().hashCode());
        result = prime * result + ((getOrdDt() == null) ? 0 : getOrdDt().hashCode());
        result = prime * result + ((getMbrId() == null) ? 0 : getMbrId().hashCode());
        result = prime * result + ((getMbrGrdCd() == null) ? 0 : getMbrGrdCd().hashCode());
        result = prime * result + ((getMbrPtSaveRate() == null) ? 0 : getMbrPtSaveRate().hashCode());
        result = prime * result + ((getBuyrNm() == null) ? 0 : getBuyrNm().hashCode());
        result = prime * result + ((getBuyrCpNo() == null) ? 0 : getBuyrCpNo().hashCode());
        result = prime * result + ((getBuyrTelNo() == null) ? 0 : getBuyrTelNo().hashCode());
        result = prime * result + ((getBuyrEmail() == null) ? 0 : getBuyrEmail().hashCode());
        result = prime * result + ((getBuyrIpAddr() == null) ? 0 : getBuyrIpAddr().hashCode());
        result = prime * result + ((getBuyrOrdAgrYn() == null) ? 0 : getBuyrOrdAgrYn().hashCode());
        result = prime * result + ((getBuyrOrdAgrDt() == null) ? 0 : getBuyrOrdAgrDt().hashCode());
        result = prime * result + ((getFstPayMthd() == null) ? 0 : getFstPayMthd().hashCode());
        result = prime * result + ((getFstOrdAmt() == null) ? 0 : getFstOrdAmt().hashCode());
        result = prime * result + ((getFstCpnDcAmt() == null) ? 0 : getFstCpnDcAmt().hashCode());
        result = prime * result + ((getFstPtUseAmt() == null) ? 0 : getFstPtUseAmt().hashCode());
        result = prime * result + ((getFstRealOrdAmt() == null) ? 0 : getFstRealOrdAmt().hashCode());
        result = prime * result + ((getFstRealPayAmt() == null) ? 0 : getFstRealPayAmt().hashCode());
        result = prime * result + ((getPayMthd() == null) ? 0 : getPayMthd().hashCode());
        result = prime * result + ((getOrdAmt() == null) ? 0 : getOrdAmt().hashCode());
        result = prime * result + ((getCpnDcAmt() == null) ? 0 : getCpnDcAmt().hashCode());
        result = prime * result + ((getPtUseAmt() == null) ? 0 : getPtUseAmt().hashCode());
        result = prime * result + ((getRealOrdAmt() == null) ? 0 : getRealOrdAmt().hashCode());
        result = prime * result + ((getRealPayAmt() == null) ? 0 : getRealPayAmt().hashCode());
        result = prime * result + ((getPgSplyAmt() == null) ? 0 : getPgSplyAmt().hashCode());
        result = prime * result + ((getPgVatAmt() == null) ? 0 : getPgVatAmt().hashCode());
        result = prime * result + ((getPgTaxfreeAmt() == null) ? 0 : getPgTaxfreeAmt().hashCode());
        result = prime * result + ((getPayCpltDt() == null) ? 0 : getPayCpltDt().hashCode());
        result = prime * result + ((getRegDt() == null) ? 0 : getRegDt().hashCode());
        result = prime * result + ((getRegId() == null) ? 0 : getRegId().hashCode());
        result = prime * result + ((getModDt() == null) ? 0 : getModDt().hashCode());
        result = prime * result + ((getModId() == null) ? 0 : getModId().hashCode());
        return result;
    }
}