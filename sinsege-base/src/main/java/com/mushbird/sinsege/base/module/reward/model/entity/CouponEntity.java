package com.mushbird.sinsege.base.module.reward.model.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.mushbird.sinsege.base.model.BaseEntity;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public abstract class CouponEntity extends BaseEntity implements Serializable {
    private Integer cpnId;

    private Integer venId;

    private String cpnTpCd;

    private String cpnClCd;

    private String cpnAutoClCd;

    private String cpnStatCd;

    private String cpnNo;

    private String cpnNm;

    private String isuTgtTpCd;

    private String isuTgtItemTpCd;

    private String isuTgtMbrGrdCd;

    private String isuMethTpCd;

    private String isuMethDlTpCd;

    private String isuMethRdnbTpCd;

    private String isuUrl;

    private String isuFixRdnbNo;

    private String isuResQtyYn;

    private Integer isuResQty;

    private String vldPerdTpCd;

    private String vldPerdStYmd;

    private String vldPerdEdYmd;

    private String vldPerdUseStdCd;

    private String vldPerdUseTpCd;

    private Integer vldPerdUseDayCnt;

    private String dcMethCd;

    private Integer dcAmt;

    private BigDecimal dcRate;

    private Integer dcRateMaxAmt;

    private String dcResMinBuyAmtYn;

    private Integer dcResMinBuyAmt;

    private String dcAddDcCpnYn;

    private String baseCpnYn;

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

    public Integer getCpnId() {
        return cpnId;
    }

    public void setCpnId(Integer cpnId) {
        this.cpnId = cpnId;
    }

    public Integer getVenId() {
        return venId;
    }

    public void setVenId(Integer venId) {
        this.venId = venId;
    }

    public String getCpnTpCd() {
        return cpnTpCd;
    }

    public void setCpnTpCd(String cpnTpCd) {
        this.cpnTpCd = cpnTpCd == null ? null : cpnTpCd.trim();
    }

    public String getCpnClCd() {
        return cpnClCd;
    }

    public void setCpnClCd(String cpnClCd) {
        this.cpnClCd = cpnClCd == null ? null : cpnClCd.trim();
    }

    public String getCpnAutoClCd() {
        return cpnAutoClCd;
    }

    public void setCpnAutoClCd(String cpnAutoClCd) {
        this.cpnAutoClCd = cpnAutoClCd == null ? null : cpnAutoClCd.trim();
    }

    public String getCpnStatCd() {
        return cpnStatCd;
    }

    public void setCpnStatCd(String cpnStatCd) {
        this.cpnStatCd = cpnStatCd == null ? null : cpnStatCd.trim();
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

    public String getIsuTgtTpCd() {
        return isuTgtTpCd;
    }

    public void setIsuTgtTpCd(String isuTgtTpCd) {
        this.isuTgtTpCd = isuTgtTpCd == null ? null : isuTgtTpCd.trim();
    }

    public String getIsuTgtItemTpCd() {
        return isuTgtItemTpCd;
    }

    public void setIsuTgtItemTpCd(String isuTgtItemTpCd) {
        this.isuTgtItemTpCd = isuTgtItemTpCd == null ? null : isuTgtItemTpCd.trim();
    }

    public String getIsuTgtMbrGrdCd() {
        return isuTgtMbrGrdCd;
    }

    public void setIsuTgtMbrGrdCd(String isuTgtMbrGrdCd) {
        this.isuTgtMbrGrdCd = isuTgtMbrGrdCd == null ? null : isuTgtMbrGrdCd.trim();
    }

    public String getIsuMethTpCd() {
        return isuMethTpCd;
    }

    public void setIsuMethTpCd(String isuMethTpCd) {
        this.isuMethTpCd = isuMethTpCd == null ? null : isuMethTpCd.trim();
    }

    public String getIsuMethDlTpCd() {
        return isuMethDlTpCd;
    }

    public void setIsuMethDlTpCd(String isuMethDlTpCd) {
        this.isuMethDlTpCd = isuMethDlTpCd == null ? null : isuMethDlTpCd.trim();
    }

    public String getIsuMethRdnbTpCd() {
        return isuMethRdnbTpCd;
    }

    public void setIsuMethRdnbTpCd(String isuMethRdnbTpCd) {
        this.isuMethRdnbTpCd = isuMethRdnbTpCd == null ? null : isuMethRdnbTpCd.trim();
    }

    public String getIsuUrl() {
        return isuUrl;
    }

    public void setIsuUrl(String isuUrl) {
        this.isuUrl = isuUrl == null ? null : isuUrl.trim();
    }

    public String getIsuFixRdnbNo() {
        return isuFixRdnbNo;
    }

    public void setIsuFixRdnbNo(String isuFixRdnbNo) {
        this.isuFixRdnbNo = isuFixRdnbNo == null ? null : isuFixRdnbNo.trim();
    }

    public String getIsuResQtyYn() {
        return isuResQtyYn;
    }

    public void setIsuResQtyYn(String isuResQtyYn) {
        this.isuResQtyYn = isuResQtyYn == null ? null : isuResQtyYn.trim();
    }

    public Integer getIsuResQty() {
        return isuResQty;
    }

    public void setIsuResQty(Integer isuResQty) {
        this.isuResQty = isuResQty;
    }

    public String getVldPerdTpCd() {
        return vldPerdTpCd;
    }

    public void setVldPerdTpCd(String vldPerdTpCd) {
        this.vldPerdTpCd = vldPerdTpCd == null ? null : vldPerdTpCd.trim();
    }

    public String getVldPerdStYmd() {
        return vldPerdStYmd;
    }

    public void setVldPerdStYmd(String vldPerdStYmd) {
        this.vldPerdStYmd = vldPerdStYmd == null ? null : vldPerdStYmd.trim();
    }

    public String getVldPerdEdYmd() {
        return vldPerdEdYmd;
    }

    public void setVldPerdEdYmd(String vldPerdEdYmd) {
        this.vldPerdEdYmd = vldPerdEdYmd == null ? null : vldPerdEdYmd.trim();
    }

    public String getVldPerdUseStdCd() {
        return vldPerdUseStdCd;
    }

    public void setVldPerdUseStdCd(String vldPerdUseStdCd) {
        this.vldPerdUseStdCd = vldPerdUseStdCd == null ? null : vldPerdUseStdCd.trim();
    }

    public String getVldPerdUseTpCd() {
        return vldPerdUseTpCd;
    }

    public void setVldPerdUseTpCd(String vldPerdUseTpCd) {
        this.vldPerdUseTpCd = vldPerdUseTpCd == null ? null : vldPerdUseTpCd.trim();
    }

    public Integer getVldPerdUseDayCnt() {
        return vldPerdUseDayCnt;
    }

    public void setVldPerdUseDayCnt(Integer vldPerdUseDayCnt) {
        this.vldPerdUseDayCnt = vldPerdUseDayCnt;
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

    public String getDcResMinBuyAmtYn() {
        return dcResMinBuyAmtYn;
    }

    public void setDcResMinBuyAmtYn(String dcResMinBuyAmtYn) {
        this.dcResMinBuyAmtYn = dcResMinBuyAmtYn == null ? null : dcResMinBuyAmtYn.trim();
    }

    public Integer getDcResMinBuyAmt() {
        return dcResMinBuyAmt;
    }

    public void setDcResMinBuyAmt(Integer dcResMinBuyAmt) {
        this.dcResMinBuyAmt = dcResMinBuyAmt;
    }

    public String getDcAddDcCpnYn() {
        return dcAddDcCpnYn;
    }

    public void setDcAddDcCpnYn(String dcAddDcCpnYn) {
        this.dcAddDcCpnYn = dcAddDcCpnYn == null ? null : dcAddDcCpnYn.trim();
    }

    public String getBaseCpnYn() {
        return baseCpnYn;
    }

    public void setBaseCpnYn(String baseCpnYn) {
        this.baseCpnYn = baseCpnYn == null ? null : baseCpnYn.trim();
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
        sb.append(", cpnId=").append(cpnId);
        sb.append(", venId=").append(venId);
        sb.append(", cpnTpCd=").append(cpnTpCd);
        sb.append(", cpnClCd=").append(cpnClCd);
        sb.append(", cpnAutoClCd=").append(cpnAutoClCd);
        sb.append(", cpnStatCd=").append(cpnStatCd);
        sb.append(", cpnNo=").append(cpnNo);
        sb.append(", cpnNm=").append(cpnNm);
        sb.append(", isuTgtTpCd=").append(isuTgtTpCd);
        sb.append(", isuTgtItemTpCd=").append(isuTgtItemTpCd);
        sb.append(", isuTgtMbrGrdCd=").append(isuTgtMbrGrdCd);
        sb.append(", isuMethTpCd=").append(isuMethTpCd);
        sb.append(", isuMethDlTpCd=").append(isuMethDlTpCd);
        sb.append(", isuMethRdnbTpCd=").append(isuMethRdnbTpCd);
        sb.append(", isuUrl=").append(isuUrl);
        sb.append(", isuFixRdnbNo=").append(isuFixRdnbNo);
        sb.append(", isuResQtyYn=").append(isuResQtyYn);
        sb.append(", isuResQty=").append(isuResQty);
        sb.append(", vldPerdTpCd=").append(vldPerdTpCd);
        sb.append(", vldPerdStYmd=").append(vldPerdStYmd);
        sb.append(", vldPerdEdYmd=").append(vldPerdEdYmd);
        sb.append(", vldPerdUseStdCd=").append(vldPerdUseStdCd);
        sb.append(", vldPerdUseTpCd=").append(vldPerdUseTpCd);
        sb.append(", vldPerdUseDayCnt=").append(vldPerdUseDayCnt);
        sb.append(", dcMethCd=").append(dcMethCd);
        sb.append(", dcAmt=").append(dcAmt);
        sb.append(", dcRate=").append(dcRate);
        sb.append(", dcRateMaxAmt=").append(dcRateMaxAmt);
        sb.append(", dcResMinBuyAmtYn=").append(dcResMinBuyAmtYn);
        sb.append(", dcResMinBuyAmt=").append(dcResMinBuyAmt);
        sb.append(", dcAddDcCpnYn=").append(dcAddDcCpnYn);
        sb.append(", baseCpnYn=").append(baseCpnYn);
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
        CouponEntity other = (CouponEntity) that;
        return (this.getCpnId() == null ? other.getCpnId() == null : this.getCpnId().equals(other.getCpnId()))
            && (this.getVenId() == null ? other.getVenId() == null : this.getVenId().equals(other.getVenId()))
            && (this.getCpnTpCd() == null ? other.getCpnTpCd() == null : this.getCpnTpCd().equals(other.getCpnTpCd()))
            && (this.getCpnClCd() == null ? other.getCpnClCd() == null : this.getCpnClCd().equals(other.getCpnClCd()))
            && (this.getCpnAutoClCd() == null ? other.getCpnAutoClCd() == null : this.getCpnAutoClCd().equals(other.getCpnAutoClCd()))
            && (this.getCpnStatCd() == null ? other.getCpnStatCd() == null : this.getCpnStatCd().equals(other.getCpnStatCd()))
            && (this.getCpnNo() == null ? other.getCpnNo() == null : this.getCpnNo().equals(other.getCpnNo()))
            && (this.getCpnNm() == null ? other.getCpnNm() == null : this.getCpnNm().equals(other.getCpnNm()))
            && (this.getIsuTgtTpCd() == null ? other.getIsuTgtTpCd() == null : this.getIsuTgtTpCd().equals(other.getIsuTgtTpCd()))
            && (this.getIsuTgtItemTpCd() == null ? other.getIsuTgtItemTpCd() == null : this.getIsuTgtItemTpCd().equals(other.getIsuTgtItemTpCd()))
            && (this.getIsuTgtMbrGrdCd() == null ? other.getIsuTgtMbrGrdCd() == null : this.getIsuTgtMbrGrdCd().equals(other.getIsuTgtMbrGrdCd()))
            && (this.getIsuMethTpCd() == null ? other.getIsuMethTpCd() == null : this.getIsuMethTpCd().equals(other.getIsuMethTpCd()))
            && (this.getIsuMethDlTpCd() == null ? other.getIsuMethDlTpCd() == null : this.getIsuMethDlTpCd().equals(other.getIsuMethDlTpCd()))
            && (this.getIsuMethRdnbTpCd() == null ? other.getIsuMethRdnbTpCd() == null : this.getIsuMethRdnbTpCd().equals(other.getIsuMethRdnbTpCd()))
            && (this.getIsuUrl() == null ? other.getIsuUrl() == null : this.getIsuUrl().equals(other.getIsuUrl()))
            && (this.getIsuFixRdnbNo() == null ? other.getIsuFixRdnbNo() == null : this.getIsuFixRdnbNo().equals(other.getIsuFixRdnbNo()))
            && (this.getIsuResQtyYn() == null ? other.getIsuResQtyYn() == null : this.getIsuResQtyYn().equals(other.getIsuResQtyYn()))
            && (this.getIsuResQty() == null ? other.getIsuResQty() == null : this.getIsuResQty().equals(other.getIsuResQty()))
            && (this.getVldPerdTpCd() == null ? other.getVldPerdTpCd() == null : this.getVldPerdTpCd().equals(other.getVldPerdTpCd()))
            && (this.getVldPerdStYmd() == null ? other.getVldPerdStYmd() == null : this.getVldPerdStYmd().equals(other.getVldPerdStYmd()))
            && (this.getVldPerdEdYmd() == null ? other.getVldPerdEdYmd() == null : this.getVldPerdEdYmd().equals(other.getVldPerdEdYmd()))
            && (this.getVldPerdUseStdCd() == null ? other.getVldPerdUseStdCd() == null : this.getVldPerdUseStdCd().equals(other.getVldPerdUseStdCd()))
            && (this.getVldPerdUseTpCd() == null ? other.getVldPerdUseTpCd() == null : this.getVldPerdUseTpCd().equals(other.getVldPerdUseTpCd()))
            && (this.getVldPerdUseDayCnt() == null ? other.getVldPerdUseDayCnt() == null : this.getVldPerdUseDayCnt().equals(other.getVldPerdUseDayCnt()))
            && (this.getDcMethCd() == null ? other.getDcMethCd() == null : this.getDcMethCd().equals(other.getDcMethCd()))
            && (this.getDcAmt() == null ? other.getDcAmt() == null : this.getDcAmt().equals(other.getDcAmt()))
            && (this.getDcRate() == null ? other.getDcRate() == null : this.getDcRate().equals(other.getDcRate()))
            && (this.getDcRateMaxAmt() == null ? other.getDcRateMaxAmt() == null : this.getDcRateMaxAmt().equals(other.getDcRateMaxAmt()))
            && (this.getDcResMinBuyAmtYn() == null ? other.getDcResMinBuyAmtYn() == null : this.getDcResMinBuyAmtYn().equals(other.getDcResMinBuyAmtYn()))
            && (this.getDcResMinBuyAmt() == null ? other.getDcResMinBuyAmt() == null : this.getDcResMinBuyAmt().equals(other.getDcResMinBuyAmt()))
            && (this.getDcAddDcCpnYn() == null ? other.getDcAddDcCpnYn() == null : this.getDcAddDcCpnYn().equals(other.getDcAddDcCpnYn()))
            && (this.getBaseCpnYn() == null ? other.getBaseCpnYn() == null : this.getBaseCpnYn().equals(other.getBaseCpnYn()))
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
        result = prime * result + ((getCpnId() == null) ? 0 : getCpnId().hashCode());
        result = prime * result + ((getVenId() == null) ? 0 : getVenId().hashCode());
        result = prime * result + ((getCpnTpCd() == null) ? 0 : getCpnTpCd().hashCode());
        result = prime * result + ((getCpnClCd() == null) ? 0 : getCpnClCd().hashCode());
        result = prime * result + ((getCpnAutoClCd() == null) ? 0 : getCpnAutoClCd().hashCode());
        result = prime * result + ((getCpnStatCd() == null) ? 0 : getCpnStatCd().hashCode());
        result = prime * result + ((getCpnNo() == null) ? 0 : getCpnNo().hashCode());
        result = prime * result + ((getCpnNm() == null) ? 0 : getCpnNm().hashCode());
        result = prime * result + ((getIsuTgtTpCd() == null) ? 0 : getIsuTgtTpCd().hashCode());
        result = prime * result + ((getIsuTgtItemTpCd() == null) ? 0 : getIsuTgtItemTpCd().hashCode());
        result = prime * result + ((getIsuTgtMbrGrdCd() == null) ? 0 : getIsuTgtMbrGrdCd().hashCode());
        result = prime * result + ((getIsuMethTpCd() == null) ? 0 : getIsuMethTpCd().hashCode());
        result = prime * result + ((getIsuMethDlTpCd() == null) ? 0 : getIsuMethDlTpCd().hashCode());
        result = prime * result + ((getIsuMethRdnbTpCd() == null) ? 0 : getIsuMethRdnbTpCd().hashCode());
        result = prime * result + ((getIsuUrl() == null) ? 0 : getIsuUrl().hashCode());
        result = prime * result + ((getIsuFixRdnbNo() == null) ? 0 : getIsuFixRdnbNo().hashCode());
        result = prime * result + ((getIsuResQtyYn() == null) ? 0 : getIsuResQtyYn().hashCode());
        result = prime * result + ((getIsuResQty() == null) ? 0 : getIsuResQty().hashCode());
        result = prime * result + ((getVldPerdTpCd() == null) ? 0 : getVldPerdTpCd().hashCode());
        result = prime * result + ((getVldPerdStYmd() == null) ? 0 : getVldPerdStYmd().hashCode());
        result = prime * result + ((getVldPerdEdYmd() == null) ? 0 : getVldPerdEdYmd().hashCode());
        result = prime * result + ((getVldPerdUseStdCd() == null) ? 0 : getVldPerdUseStdCd().hashCode());
        result = prime * result + ((getVldPerdUseTpCd() == null) ? 0 : getVldPerdUseTpCd().hashCode());
        result = prime * result + ((getVldPerdUseDayCnt() == null) ? 0 : getVldPerdUseDayCnt().hashCode());
        result = prime * result + ((getDcMethCd() == null) ? 0 : getDcMethCd().hashCode());
        result = prime * result + ((getDcAmt() == null) ? 0 : getDcAmt().hashCode());
        result = prime * result + ((getDcRate() == null) ? 0 : getDcRate().hashCode());
        result = prime * result + ((getDcRateMaxAmt() == null) ? 0 : getDcRateMaxAmt().hashCode());
        result = prime * result + ((getDcResMinBuyAmtYn() == null) ? 0 : getDcResMinBuyAmtYn().hashCode());
        result = prime * result + ((getDcResMinBuyAmt() == null) ? 0 : getDcResMinBuyAmt().hashCode());
        result = prime * result + ((getDcAddDcCpnYn() == null) ? 0 : getDcAddDcCpnYn().hashCode());
        result = prime * result + ((getBaseCpnYn() == null) ? 0 : getBaseCpnYn().hashCode());
        result = prime * result + ((getRegDt() == null) ? 0 : getRegDt().hashCode());
        result = prime * result + ((getRegId() == null) ? 0 : getRegId().hashCode());
        result = prime * result + ((getModDt() == null) ? 0 : getModDt().hashCode());
        result = prime * result + ((getModId() == null) ? 0 : getModId().hashCode());
        result = prime * result + ((getUseYn() == null) ? 0 : getUseYn().hashCode());
        return result;
    }
}