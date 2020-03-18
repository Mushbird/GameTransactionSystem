package com.mushbird.sinsege.base.module.order.model.entity;

import com.mushbird.sinsege.base.model.BaseEntity;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public abstract class OrderItemChangeHistoryEntity extends BaseEntity implements Serializable {
    private Integer ordItemChistId;

    private Integer ordItemId;

    private Integer ordId;

    private Integer ordDelvId;

    private Integer ordItemSeq;

    private String ordItemNo;

    private String ordItemStatCd;

    private Date ordItemStatChgDt;

    private String nowOrdItemStatCd;

    private Integer dpChId;

    private Integer itemId;

    private String itemTpCd;

    private String itemCd;

    private String ssgCd;

    private String itemNm;

    private Integer itemOptId;

    private String itemOptNm;

    private Integer itemSetId;

    private Integer setItemId;

    private String setItemNm;

    private String itemAttrTpCd;

    private String itemTaxClCd;

    private String itemCpnUsePsblYn;

    private String itemPtSaveTpCd;

    private String itemPtSaveMethCd;

    private BigDecimal itemPtSaveRate;

    private Integer itemPtSaveAmt;

    private Integer itemOrdResMaxQty;

    private String itemCstmdYn;

    private Integer itemRgurPrc;

    private Integer itemPrcId;

    private String itemPrcTpCd;

    private Integer itemSplyUprc;

    private Integer itemSellUnitQty;

    private Integer itemSplyPrc;

    private BigDecimal itemSellDcRate;

    private Integer itemSellPrc;

    private BigDecimal itemComsRate;

    private Integer itemComsAmt;

    private Integer realSellPrc;

    private BigDecimal itemVatRate;

    private Integer ordQty;

    private Integer cnclQty;

    private Integer fstOrdAmt;

    private Integer fstCpnDcAmt;

    private Integer fstPtUseAmt;

    private Integer fstRealOrdAmt;

    private Integer fstRealPayAmt;

    private Integer fstPtSaveAmt;

    private Integer ordAmt;

    private Integer cpnDcAmt;

    private Integer ptUseAmt;

    private Integer realOrdAmt;

    private Integer realPayAmt;

    private String ptTpCd;

    private String ptSaveYn;

    private BigDecimal ptSaveRate;

    private Integer ptSaveAmt;

    private Integer pgSplyAmt;

    private Integer pgVatAmt;

    private Integer pgTaxfreeAmt;

    private Date ordCfmSkdDt;

    private Date ordCfmDt;

    private String ordCfmId;

    private String ordCfmSndYn;

    private String settlStatCd;

    private String settlYmd;

    private String settlPgYmd;

    private Date regDt;

    private String regId;

    private Date modDt;

    private String modId;

    private static final long serialVersionUID = com.mushbird.sinsege.base.constant.AppConst.UID;

    public Integer getOrdItemChistId() {
        return ordItemChistId;
    }

    public void setOrdItemChistId(Integer ordItemChistId) {
        this.ordItemChistId = ordItemChistId;
    }

    public Integer getOrdItemId() {
        return ordItemId;
    }

    public void setOrdItemId(Integer ordItemId) {
        this.ordItemId = ordItemId;
    }

    public Integer getOrdId() {
        return ordId;
    }

    public void setOrdId(Integer ordId) {
        this.ordId = ordId;
    }

    public Integer getOrdDelvId() {
        return ordDelvId;
    }

    public void setOrdDelvId(Integer ordDelvId) {
        this.ordDelvId = ordDelvId;
    }

    public Integer getOrdItemSeq() {
        return ordItemSeq;
    }

    public void setOrdItemSeq(Integer ordItemSeq) {
        this.ordItemSeq = ordItemSeq;
    }

    public String getOrdItemNo() {
        return ordItemNo;
    }

    public void setOrdItemNo(String ordItemNo) {
        this.ordItemNo = ordItemNo == null ? null : ordItemNo.trim();
    }

    public String getOrdItemStatCd() {
        return ordItemStatCd;
    }

    public void setOrdItemStatCd(String ordItemStatCd) {
        this.ordItemStatCd = ordItemStatCd == null ? null : ordItemStatCd.trim();
    }

    public Date getOrdItemStatChgDt() {
        return ordItemStatChgDt;
    }

    public void setOrdItemStatChgDt(Date ordItemStatChgDt) {
        this.ordItemStatChgDt = ordItemStatChgDt;
    }

    public String getNowOrdItemStatCd() {
        return nowOrdItemStatCd;
    }

    public void setNowOrdItemStatCd(String nowOrdItemStatCd) {
        this.nowOrdItemStatCd = nowOrdItemStatCd == null ? null : nowOrdItemStatCd.trim();
    }

    public Integer getDpChId() {
        return dpChId;
    }

    public void setDpChId(Integer dpChId) {
        this.dpChId = dpChId;
    }

    public Integer getItemId() {
        return itemId;
    }

    public void setItemId(Integer itemId) {
        this.itemId = itemId;
    }

    public String getItemTpCd() {
        return itemTpCd;
    }

    public void setItemTpCd(String itemTpCd) {
        this.itemTpCd = itemTpCd == null ? null : itemTpCd.trim();
    }

    public String getItemCd() {
        return itemCd;
    }

    public void setItemCd(String itemCd) {
        this.itemCd = itemCd == null ? null : itemCd.trim();
    }

    public String getSsgCd() {
        return ssgCd;
    }

    public void setSsgCd(String ssgCd) {
        this.ssgCd = ssgCd == null ? null : ssgCd.trim();
    }

    public String getItemNm() {
        return itemNm;
    }

    public void setItemNm(String itemNm) {
        this.itemNm = itemNm == null ? null : itemNm.trim();
    }

    public Integer getItemOptId() {
        return itemOptId;
    }

    public void setItemOptId(Integer itemOptId) {
        this.itemOptId = itemOptId;
    }

    public String getItemOptNm() {
        return itemOptNm;
    }

    public void setItemOptNm(String itemOptNm) {
        this.itemOptNm = itemOptNm == null ? null : itemOptNm.trim();
    }

    public Integer getItemSetId() {
        return itemSetId;
    }

    public void setItemSetId(Integer itemSetId) {
        this.itemSetId = itemSetId;
    }

    public Integer getSetItemId() {
        return setItemId;
    }

    public void setSetItemId(Integer setItemId) {
        this.setItemId = setItemId;
    }

    public String getSetItemNm() {
        return setItemNm;
    }

    public void setSetItemNm(String setItemNm) {
        this.setItemNm = setItemNm == null ? null : setItemNm.trim();
    }

    public String getItemAttrTpCd() {
        return itemAttrTpCd;
    }

    public void setItemAttrTpCd(String itemAttrTpCd) {
        this.itemAttrTpCd = itemAttrTpCd == null ? null : itemAttrTpCd.trim();
    }

    public String getItemTaxClCd() {
        return itemTaxClCd;
    }

    public void setItemTaxClCd(String itemTaxClCd) {
        this.itemTaxClCd = itemTaxClCd == null ? null : itemTaxClCd.trim();
    }

    public String getItemCpnUsePsblYn() {
        return itemCpnUsePsblYn;
    }

    public void setItemCpnUsePsblYn(String itemCpnUsePsblYn) {
        this.itemCpnUsePsblYn = itemCpnUsePsblYn == null ? null : itemCpnUsePsblYn.trim();
    }

    public String getItemPtSaveTpCd() {
        return itemPtSaveTpCd;
    }

    public void setItemPtSaveTpCd(String itemPtSaveTpCd) {
        this.itemPtSaveTpCd = itemPtSaveTpCd == null ? null : itemPtSaveTpCd.trim();
    }

    public String getItemPtSaveMethCd() {
        return itemPtSaveMethCd;
    }

    public void setItemPtSaveMethCd(String itemPtSaveMethCd) {
        this.itemPtSaveMethCd = itemPtSaveMethCd == null ? null : itemPtSaveMethCd.trim();
    }

    public BigDecimal getItemPtSaveRate() {
        return itemPtSaveRate;
    }

    public void setItemPtSaveRate(BigDecimal itemPtSaveRate) {
        this.itemPtSaveRate = itemPtSaveRate;
    }

    public Integer getItemPtSaveAmt() {
        return itemPtSaveAmt;
    }

    public void setItemPtSaveAmt(Integer itemPtSaveAmt) {
        this.itemPtSaveAmt = itemPtSaveAmt;
    }

    public Integer getItemOrdResMaxQty() {
        return itemOrdResMaxQty;
    }

    public void setItemOrdResMaxQty(Integer itemOrdResMaxQty) {
        this.itemOrdResMaxQty = itemOrdResMaxQty;
    }

    public String getItemCstmdYn() {
        return itemCstmdYn;
    }

    public void setItemCstmdYn(String itemCstmdYn) {
        this.itemCstmdYn = itemCstmdYn == null ? null : itemCstmdYn.trim();
    }

    public Integer getItemRgurPrc() {
        return itemRgurPrc;
    }

    public void setItemRgurPrc(Integer itemRgurPrc) {
        this.itemRgurPrc = itemRgurPrc;
    }

    public Integer getItemPrcId() {
        return itemPrcId;
    }

    public void setItemPrcId(Integer itemPrcId) {
        this.itemPrcId = itemPrcId;
    }

    public String getItemPrcTpCd() {
        return itemPrcTpCd;
    }

    public void setItemPrcTpCd(String itemPrcTpCd) {
        this.itemPrcTpCd = itemPrcTpCd == null ? null : itemPrcTpCd.trim();
    }

    public Integer getItemSplyUprc() {
        return itemSplyUprc;
    }

    public void setItemSplyUprc(Integer itemSplyUprc) {
        this.itemSplyUprc = itemSplyUprc;
    }

    public Integer getItemSellUnitQty() {
        return itemSellUnitQty;
    }

    public void setItemSellUnitQty(Integer itemSellUnitQty) {
        this.itemSellUnitQty = itemSellUnitQty;
    }

    public Integer getItemSplyPrc() {
        return itemSplyPrc;
    }

    public void setItemSplyPrc(Integer itemSplyPrc) {
        this.itemSplyPrc = itemSplyPrc;
    }

    public BigDecimal getItemSellDcRate() {
        return itemSellDcRate;
    }

    public void setItemSellDcRate(BigDecimal itemSellDcRate) {
        this.itemSellDcRate = itemSellDcRate;
    }

    public Integer getItemSellPrc() {
        return itemSellPrc;
    }

    public void setItemSellPrc(Integer itemSellPrc) {
        this.itemSellPrc = itemSellPrc;
    }

    public BigDecimal getItemComsRate() {
        return itemComsRate;
    }

    public void setItemComsRate(BigDecimal itemComsRate) {
        this.itemComsRate = itemComsRate;
    }

    public Integer getItemComsAmt() {
        return itemComsAmt;
    }

    public void setItemComsAmt(Integer itemComsAmt) {
        this.itemComsAmt = itemComsAmt;
    }

    public Integer getRealSellPrc() {
        return realSellPrc;
    }

    public void setRealSellPrc(Integer realSellPrc) {
        this.realSellPrc = realSellPrc;
    }

    public BigDecimal getItemVatRate() {
        return itemVatRate;
    }

    public void setItemVatRate(BigDecimal itemVatRate) {
        this.itemVatRate = itemVatRate;
    }

    public Integer getOrdQty() {
        return ordQty;
    }

    public void setOrdQty(Integer ordQty) {
        this.ordQty = ordQty;
    }

    public Integer getCnclQty() {
        return cnclQty;
    }

    public void setCnclQty(Integer cnclQty) {
        this.cnclQty = cnclQty;
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

    public Integer getFstPtSaveAmt() {
        return fstPtSaveAmt;
    }

    public void setFstPtSaveAmt(Integer fstPtSaveAmt) {
        this.fstPtSaveAmt = fstPtSaveAmt;
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

    public String getPtTpCd() {
        return ptTpCd;
    }

    public void setPtTpCd(String ptTpCd) {
        this.ptTpCd = ptTpCd == null ? null : ptTpCd.trim();
    }

    public String getPtSaveYn() {
        return ptSaveYn;
    }

    public void setPtSaveYn(String ptSaveYn) {
        this.ptSaveYn = ptSaveYn == null ? null : ptSaveYn.trim();
    }

    public BigDecimal getPtSaveRate() {
        return ptSaveRate;
    }

    public void setPtSaveRate(BigDecimal ptSaveRate) {
        this.ptSaveRate = ptSaveRate;
    }

    public Integer getPtSaveAmt() {
        return ptSaveAmt;
    }

    public void setPtSaveAmt(Integer ptSaveAmt) {
        this.ptSaveAmt = ptSaveAmt;
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

    public Date getOrdCfmSkdDt() {
        return ordCfmSkdDt;
    }

    public void setOrdCfmSkdDt(Date ordCfmSkdDt) {
        this.ordCfmSkdDt = ordCfmSkdDt;
    }

    public Date getOrdCfmDt() {
        return ordCfmDt;
    }

    public void setOrdCfmDt(Date ordCfmDt) {
        this.ordCfmDt = ordCfmDt;
    }

    public String getOrdCfmId() {
        return ordCfmId;
    }

    public void setOrdCfmId(String ordCfmId) {
        this.ordCfmId = ordCfmId == null ? null : ordCfmId.trim();
    }

    public String getOrdCfmSndYn() {
        return ordCfmSndYn;
    }

    public void setOrdCfmSndYn(String ordCfmSndYn) {
        this.ordCfmSndYn = ordCfmSndYn == null ? null : ordCfmSndYn.trim();
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
        sb.append(", ordItemChistId=").append(ordItemChistId);
        sb.append(", ordItemId=").append(ordItemId);
        sb.append(", ordId=").append(ordId);
        sb.append(", ordDelvId=").append(ordDelvId);
        sb.append(", ordItemSeq=").append(ordItemSeq);
        sb.append(", ordItemNo=").append(ordItemNo);
        sb.append(", ordItemStatCd=").append(ordItemStatCd);
        sb.append(", ordItemStatChgDt=").append(ordItemStatChgDt);
        sb.append(", nowOrdItemStatCd=").append(nowOrdItemStatCd);
        sb.append(", dpChId=").append(dpChId);
        sb.append(", itemId=").append(itemId);
        sb.append(", itemTpCd=").append(itemTpCd);
        sb.append(", itemCd=").append(itemCd);
        sb.append(", ssgCd=").append(ssgCd);
        sb.append(", itemNm=").append(itemNm);
        sb.append(", itemOptId=").append(itemOptId);
        sb.append(", itemOptNm=").append(itemOptNm);
        sb.append(", itemSetId=").append(itemSetId);
        sb.append(", setItemId=").append(setItemId);
        sb.append(", setItemNm=").append(setItemNm);
        sb.append(", itemAttrTpCd=").append(itemAttrTpCd);
        sb.append(", itemTaxClCd=").append(itemTaxClCd);
        sb.append(", itemCpnUsePsblYn=").append(itemCpnUsePsblYn);
        sb.append(", itemPtSaveTpCd=").append(itemPtSaveTpCd);
        sb.append(", itemPtSaveMethCd=").append(itemPtSaveMethCd);
        sb.append(", itemPtSaveRate=").append(itemPtSaveRate);
        sb.append(", itemPtSaveAmt=").append(itemPtSaveAmt);
        sb.append(", itemOrdResMaxQty=").append(itemOrdResMaxQty);
        sb.append(", itemCstmdYn=").append(itemCstmdYn);
        sb.append(", itemRgurPrc=").append(itemRgurPrc);
        sb.append(", itemPrcId=").append(itemPrcId);
        sb.append(", itemPrcTpCd=").append(itemPrcTpCd);
        sb.append(", itemSplyUprc=").append(itemSplyUprc);
        sb.append(", itemSellUnitQty=").append(itemSellUnitQty);
        sb.append(", itemSplyPrc=").append(itemSplyPrc);
        sb.append(", itemSellDcRate=").append(itemSellDcRate);
        sb.append(", itemSellPrc=").append(itemSellPrc);
        sb.append(", itemComsRate=").append(itemComsRate);
        sb.append(", itemComsAmt=").append(itemComsAmt);
        sb.append(", realSellPrc=").append(realSellPrc);
        sb.append(", itemVatRate=").append(itemVatRate);
        sb.append(", ordQty=").append(ordQty);
        sb.append(", cnclQty=").append(cnclQty);
        sb.append(", fstOrdAmt=").append(fstOrdAmt);
        sb.append(", fstCpnDcAmt=").append(fstCpnDcAmt);
        sb.append(", fstPtUseAmt=").append(fstPtUseAmt);
        sb.append(", fstRealOrdAmt=").append(fstRealOrdAmt);
        sb.append(", fstRealPayAmt=").append(fstRealPayAmt);
        sb.append(", fstPtSaveAmt=").append(fstPtSaveAmt);
        sb.append(", ordAmt=").append(ordAmt);
        sb.append(", cpnDcAmt=").append(cpnDcAmt);
        sb.append(", ptUseAmt=").append(ptUseAmt);
        sb.append(", realOrdAmt=").append(realOrdAmt);
        sb.append(", realPayAmt=").append(realPayAmt);
        sb.append(", ptTpCd=").append(ptTpCd);
        sb.append(", ptSaveYn=").append(ptSaveYn);
        sb.append(", ptSaveRate=").append(ptSaveRate);
        sb.append(", ptSaveAmt=").append(ptSaveAmt);
        sb.append(", pgSplyAmt=").append(pgSplyAmt);
        sb.append(", pgVatAmt=").append(pgVatAmt);
        sb.append(", pgTaxfreeAmt=").append(pgTaxfreeAmt);
        sb.append(", ordCfmSkdDt=").append(ordCfmSkdDt);
        sb.append(", ordCfmDt=").append(ordCfmDt);
        sb.append(", ordCfmId=").append(ordCfmId);
        sb.append(", ordCfmSndYn=").append(ordCfmSndYn);
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
        OrderItemChangeHistoryEntity other = (OrderItemChangeHistoryEntity) that;
        return (this.getOrdItemChistId() == null ? other.getOrdItemChistId() == null : this.getOrdItemChistId().equals(other.getOrdItemChistId()))
            && (this.getOrdItemId() == null ? other.getOrdItemId() == null : this.getOrdItemId().equals(other.getOrdItemId()))
            && (this.getOrdId() == null ? other.getOrdId() == null : this.getOrdId().equals(other.getOrdId()))
            && (this.getOrdDelvId() == null ? other.getOrdDelvId() == null : this.getOrdDelvId().equals(other.getOrdDelvId()))
            && (this.getOrdItemSeq() == null ? other.getOrdItemSeq() == null : this.getOrdItemSeq().equals(other.getOrdItemSeq()))
            && (this.getOrdItemNo() == null ? other.getOrdItemNo() == null : this.getOrdItemNo().equals(other.getOrdItemNo()))
            && (this.getOrdItemStatCd() == null ? other.getOrdItemStatCd() == null : this.getOrdItemStatCd().equals(other.getOrdItemStatCd()))
            && (this.getOrdItemStatChgDt() == null ? other.getOrdItemStatChgDt() == null : this.getOrdItemStatChgDt().equals(other.getOrdItemStatChgDt()))
            && (this.getNowOrdItemStatCd() == null ? other.getNowOrdItemStatCd() == null : this.getNowOrdItemStatCd().equals(other.getNowOrdItemStatCd()))
            && (this.getDpChId() == null ? other.getDpChId() == null : this.getDpChId().equals(other.getDpChId()))
            && (this.getItemId() == null ? other.getItemId() == null : this.getItemId().equals(other.getItemId()))
            && (this.getItemTpCd() == null ? other.getItemTpCd() == null : this.getItemTpCd().equals(other.getItemTpCd()))
            && (this.getItemCd() == null ? other.getItemCd() == null : this.getItemCd().equals(other.getItemCd()))
            && (this.getSsgCd() == null ? other.getSsgCd() == null : this.getSsgCd().equals(other.getSsgCd()))
            && (this.getItemNm() == null ? other.getItemNm() == null : this.getItemNm().equals(other.getItemNm()))
            && (this.getItemOptId() == null ? other.getItemOptId() == null : this.getItemOptId().equals(other.getItemOptId()))
            && (this.getItemOptNm() == null ? other.getItemOptNm() == null : this.getItemOptNm().equals(other.getItemOptNm()))
            && (this.getItemSetId() == null ? other.getItemSetId() == null : this.getItemSetId().equals(other.getItemSetId()))
            && (this.getSetItemId() == null ? other.getSetItemId() == null : this.getSetItemId().equals(other.getSetItemId()))
            && (this.getSetItemNm() == null ? other.getSetItemNm() == null : this.getSetItemNm().equals(other.getSetItemNm()))
            && (this.getItemAttrTpCd() == null ? other.getItemAttrTpCd() == null : this.getItemAttrTpCd().equals(other.getItemAttrTpCd()))
            && (this.getItemTaxClCd() == null ? other.getItemTaxClCd() == null : this.getItemTaxClCd().equals(other.getItemTaxClCd()))
            && (this.getItemCpnUsePsblYn() == null ? other.getItemCpnUsePsblYn() == null : this.getItemCpnUsePsblYn().equals(other.getItemCpnUsePsblYn()))
            && (this.getItemPtSaveTpCd() == null ? other.getItemPtSaveTpCd() == null : this.getItemPtSaveTpCd().equals(other.getItemPtSaveTpCd()))
            && (this.getItemPtSaveMethCd() == null ? other.getItemPtSaveMethCd() == null : this.getItemPtSaveMethCd().equals(other.getItemPtSaveMethCd()))
            && (this.getItemPtSaveRate() == null ? other.getItemPtSaveRate() == null : this.getItemPtSaveRate().equals(other.getItemPtSaveRate()))
            && (this.getItemPtSaveAmt() == null ? other.getItemPtSaveAmt() == null : this.getItemPtSaveAmt().equals(other.getItemPtSaveAmt()))
            && (this.getItemOrdResMaxQty() == null ? other.getItemOrdResMaxQty() == null : this.getItemOrdResMaxQty().equals(other.getItemOrdResMaxQty()))
            && (this.getItemCstmdYn() == null ? other.getItemCstmdYn() == null : this.getItemCstmdYn().equals(other.getItemCstmdYn()))
            && (this.getItemRgurPrc() == null ? other.getItemRgurPrc() == null : this.getItemRgurPrc().equals(other.getItemRgurPrc()))
            && (this.getItemPrcId() == null ? other.getItemPrcId() == null : this.getItemPrcId().equals(other.getItemPrcId()))
            && (this.getItemPrcTpCd() == null ? other.getItemPrcTpCd() == null : this.getItemPrcTpCd().equals(other.getItemPrcTpCd()))
            && (this.getItemSplyUprc() == null ? other.getItemSplyUprc() == null : this.getItemSplyUprc().equals(other.getItemSplyUprc()))
            && (this.getItemSellUnitQty() == null ? other.getItemSellUnitQty() == null : this.getItemSellUnitQty().equals(other.getItemSellUnitQty()))
            && (this.getItemSplyPrc() == null ? other.getItemSplyPrc() == null : this.getItemSplyPrc().equals(other.getItemSplyPrc()))
            && (this.getItemSellDcRate() == null ? other.getItemSellDcRate() == null : this.getItemSellDcRate().equals(other.getItemSellDcRate()))
            && (this.getItemSellPrc() == null ? other.getItemSellPrc() == null : this.getItemSellPrc().equals(other.getItemSellPrc()))
            && (this.getItemComsRate() == null ? other.getItemComsRate() == null : this.getItemComsRate().equals(other.getItemComsRate()))
            && (this.getItemComsAmt() == null ? other.getItemComsAmt() == null : this.getItemComsAmt().equals(other.getItemComsAmt()))
            && (this.getRealSellPrc() == null ? other.getRealSellPrc() == null : this.getRealSellPrc().equals(other.getRealSellPrc()))
            && (this.getItemVatRate() == null ? other.getItemVatRate() == null : this.getItemVatRate().equals(other.getItemVatRate()))
            && (this.getOrdQty() == null ? other.getOrdQty() == null : this.getOrdQty().equals(other.getOrdQty()))
            && (this.getCnclQty() == null ? other.getCnclQty() == null : this.getCnclQty().equals(other.getCnclQty()))
            && (this.getFstOrdAmt() == null ? other.getFstOrdAmt() == null : this.getFstOrdAmt().equals(other.getFstOrdAmt()))
            && (this.getFstCpnDcAmt() == null ? other.getFstCpnDcAmt() == null : this.getFstCpnDcAmt().equals(other.getFstCpnDcAmt()))
            && (this.getFstPtUseAmt() == null ? other.getFstPtUseAmt() == null : this.getFstPtUseAmt().equals(other.getFstPtUseAmt()))
            && (this.getFstRealOrdAmt() == null ? other.getFstRealOrdAmt() == null : this.getFstRealOrdAmt().equals(other.getFstRealOrdAmt()))
            && (this.getFstRealPayAmt() == null ? other.getFstRealPayAmt() == null : this.getFstRealPayAmt().equals(other.getFstRealPayAmt()))
            && (this.getFstPtSaveAmt() == null ? other.getFstPtSaveAmt() == null : this.getFstPtSaveAmt().equals(other.getFstPtSaveAmt()))
            && (this.getOrdAmt() == null ? other.getOrdAmt() == null : this.getOrdAmt().equals(other.getOrdAmt()))
            && (this.getCpnDcAmt() == null ? other.getCpnDcAmt() == null : this.getCpnDcAmt().equals(other.getCpnDcAmt()))
            && (this.getPtUseAmt() == null ? other.getPtUseAmt() == null : this.getPtUseAmt().equals(other.getPtUseAmt()))
            && (this.getRealOrdAmt() == null ? other.getRealOrdAmt() == null : this.getRealOrdAmt().equals(other.getRealOrdAmt()))
            && (this.getRealPayAmt() == null ? other.getRealPayAmt() == null : this.getRealPayAmt().equals(other.getRealPayAmt()))
            && (this.getPtTpCd() == null ? other.getPtTpCd() == null : this.getPtTpCd().equals(other.getPtTpCd()))
            && (this.getPtSaveYn() == null ? other.getPtSaveYn() == null : this.getPtSaveYn().equals(other.getPtSaveYn()))
            && (this.getPtSaveRate() == null ? other.getPtSaveRate() == null : this.getPtSaveRate().equals(other.getPtSaveRate()))
            && (this.getPtSaveAmt() == null ? other.getPtSaveAmt() == null : this.getPtSaveAmt().equals(other.getPtSaveAmt()))
            && (this.getPgSplyAmt() == null ? other.getPgSplyAmt() == null : this.getPgSplyAmt().equals(other.getPgSplyAmt()))
            && (this.getPgVatAmt() == null ? other.getPgVatAmt() == null : this.getPgVatAmt().equals(other.getPgVatAmt()))
            && (this.getPgTaxfreeAmt() == null ? other.getPgTaxfreeAmt() == null : this.getPgTaxfreeAmt().equals(other.getPgTaxfreeAmt()))
            && (this.getOrdCfmSkdDt() == null ? other.getOrdCfmSkdDt() == null : this.getOrdCfmSkdDt().equals(other.getOrdCfmSkdDt()))
            && (this.getOrdCfmDt() == null ? other.getOrdCfmDt() == null : this.getOrdCfmDt().equals(other.getOrdCfmDt()))
            && (this.getOrdCfmId() == null ? other.getOrdCfmId() == null : this.getOrdCfmId().equals(other.getOrdCfmId()))
            && (this.getOrdCfmSndYn() == null ? other.getOrdCfmSndYn() == null : this.getOrdCfmSndYn().equals(other.getOrdCfmSndYn()))
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
        result = prime * result + ((getOrdItemChistId() == null) ? 0 : getOrdItemChistId().hashCode());
        result = prime * result + ((getOrdItemId() == null) ? 0 : getOrdItemId().hashCode());
        result = prime * result + ((getOrdId() == null) ? 0 : getOrdId().hashCode());
        result = prime * result + ((getOrdDelvId() == null) ? 0 : getOrdDelvId().hashCode());
        result = prime * result + ((getOrdItemSeq() == null) ? 0 : getOrdItemSeq().hashCode());
        result = prime * result + ((getOrdItemNo() == null) ? 0 : getOrdItemNo().hashCode());
        result = prime * result + ((getOrdItemStatCd() == null) ? 0 : getOrdItemStatCd().hashCode());
        result = prime * result + ((getOrdItemStatChgDt() == null) ? 0 : getOrdItemStatChgDt().hashCode());
        result = prime * result + ((getNowOrdItemStatCd() == null) ? 0 : getNowOrdItemStatCd().hashCode());
        result = prime * result + ((getDpChId() == null) ? 0 : getDpChId().hashCode());
        result = prime * result + ((getItemId() == null) ? 0 : getItemId().hashCode());
        result = prime * result + ((getItemTpCd() == null) ? 0 : getItemTpCd().hashCode());
        result = prime * result + ((getItemCd() == null) ? 0 : getItemCd().hashCode());
        result = prime * result + ((getSsgCd() == null) ? 0 : getSsgCd().hashCode());
        result = prime * result + ((getItemNm() == null) ? 0 : getItemNm().hashCode());
        result = prime * result + ((getItemOptId() == null) ? 0 : getItemOptId().hashCode());
        result = prime * result + ((getItemOptNm() == null) ? 0 : getItemOptNm().hashCode());
        result = prime * result + ((getItemSetId() == null) ? 0 : getItemSetId().hashCode());
        result = prime * result + ((getSetItemId() == null) ? 0 : getSetItemId().hashCode());
        result = prime * result + ((getSetItemNm() == null) ? 0 : getSetItemNm().hashCode());
        result = prime * result + ((getItemAttrTpCd() == null) ? 0 : getItemAttrTpCd().hashCode());
        result = prime * result + ((getItemTaxClCd() == null) ? 0 : getItemTaxClCd().hashCode());
        result = prime * result + ((getItemCpnUsePsblYn() == null) ? 0 : getItemCpnUsePsblYn().hashCode());
        result = prime * result + ((getItemPtSaveTpCd() == null) ? 0 : getItemPtSaveTpCd().hashCode());
        result = prime * result + ((getItemPtSaveMethCd() == null) ? 0 : getItemPtSaveMethCd().hashCode());
        result = prime * result + ((getItemPtSaveRate() == null) ? 0 : getItemPtSaveRate().hashCode());
        result = prime * result + ((getItemPtSaveAmt() == null) ? 0 : getItemPtSaveAmt().hashCode());
        result = prime * result + ((getItemOrdResMaxQty() == null) ? 0 : getItemOrdResMaxQty().hashCode());
        result = prime * result + ((getItemCstmdYn() == null) ? 0 : getItemCstmdYn().hashCode());
        result = prime * result + ((getItemRgurPrc() == null) ? 0 : getItemRgurPrc().hashCode());
        result = prime * result + ((getItemPrcId() == null) ? 0 : getItemPrcId().hashCode());
        result = prime * result + ((getItemPrcTpCd() == null) ? 0 : getItemPrcTpCd().hashCode());
        result = prime * result + ((getItemSplyUprc() == null) ? 0 : getItemSplyUprc().hashCode());
        result = prime * result + ((getItemSellUnitQty() == null) ? 0 : getItemSellUnitQty().hashCode());
        result = prime * result + ((getItemSplyPrc() == null) ? 0 : getItemSplyPrc().hashCode());
        result = prime * result + ((getItemSellDcRate() == null) ? 0 : getItemSellDcRate().hashCode());
        result = prime * result + ((getItemSellPrc() == null) ? 0 : getItemSellPrc().hashCode());
        result = prime * result + ((getItemComsRate() == null) ? 0 : getItemComsRate().hashCode());
        result = prime * result + ((getItemComsAmt() == null) ? 0 : getItemComsAmt().hashCode());
        result = prime * result + ((getRealSellPrc() == null) ? 0 : getRealSellPrc().hashCode());
        result = prime * result + ((getItemVatRate() == null) ? 0 : getItemVatRate().hashCode());
        result = prime * result + ((getOrdQty() == null) ? 0 : getOrdQty().hashCode());
        result = prime * result + ((getCnclQty() == null) ? 0 : getCnclQty().hashCode());
        result = prime * result + ((getFstOrdAmt() == null) ? 0 : getFstOrdAmt().hashCode());
        result = prime * result + ((getFstCpnDcAmt() == null) ? 0 : getFstCpnDcAmt().hashCode());
        result = prime * result + ((getFstPtUseAmt() == null) ? 0 : getFstPtUseAmt().hashCode());
        result = prime * result + ((getFstRealOrdAmt() == null) ? 0 : getFstRealOrdAmt().hashCode());
        result = prime * result + ((getFstRealPayAmt() == null) ? 0 : getFstRealPayAmt().hashCode());
        result = prime * result + ((getFstPtSaveAmt() == null) ? 0 : getFstPtSaveAmt().hashCode());
        result = prime * result + ((getOrdAmt() == null) ? 0 : getOrdAmt().hashCode());
        result = prime * result + ((getCpnDcAmt() == null) ? 0 : getCpnDcAmt().hashCode());
        result = prime * result + ((getPtUseAmt() == null) ? 0 : getPtUseAmt().hashCode());
        result = prime * result + ((getRealOrdAmt() == null) ? 0 : getRealOrdAmt().hashCode());
        result = prime * result + ((getRealPayAmt() == null) ? 0 : getRealPayAmt().hashCode());
        result = prime * result + ((getPtTpCd() == null) ? 0 : getPtTpCd().hashCode());
        result = prime * result + ((getPtSaveYn() == null) ? 0 : getPtSaveYn().hashCode());
        result = prime * result + ((getPtSaveRate() == null) ? 0 : getPtSaveRate().hashCode());
        result = prime * result + ((getPtSaveAmt() == null) ? 0 : getPtSaveAmt().hashCode());
        result = prime * result + ((getPgSplyAmt() == null) ? 0 : getPgSplyAmt().hashCode());
        result = prime * result + ((getPgVatAmt() == null) ? 0 : getPgVatAmt().hashCode());
        result = prime * result + ((getPgTaxfreeAmt() == null) ? 0 : getPgTaxfreeAmt().hashCode());
        result = prime * result + ((getOrdCfmSkdDt() == null) ? 0 : getOrdCfmSkdDt().hashCode());
        result = prime * result + ((getOrdCfmDt() == null) ? 0 : getOrdCfmDt().hashCode());
        result = prime * result + ((getOrdCfmId() == null) ? 0 : getOrdCfmId().hashCode());
        result = prime * result + ((getOrdCfmSndYn() == null) ? 0 : getOrdCfmSndYn().hashCode());
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