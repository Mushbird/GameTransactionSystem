package com.mushbird.sinsege.base.module.item.model.entity;

import com.mushbird.sinsege.base.model.BaseEntity;
import java.io.Serializable;
import java.util.Date;

public abstract class ItemOptionChangeHistoryEntity extends BaseEntity implements Serializable {
    private Integer itemOptChistId;

    private Integer itemOptId;

    private Integer itemId;

    private String optSellStatCd;

    private String ssgCd;

    private String optNm;

    private Integer sord;

    private Date regDt;

    private String regId;

    private Date modDt;

    private String modId;

    private String useYn;

    private static final long serialVersionUID = com.mushbird.sinsege.base.constant.AppConst.UID;

    public Integer getItemOptChistId() {
        return itemOptChistId;
    }

    public void setItemOptChistId(Integer itemOptChistId) {
        this.itemOptChistId = itemOptChistId;
    }

    public Integer getItemOptId() {
        return itemOptId;
    }

    public void setItemOptId(Integer itemOptId) {
        this.itemOptId = itemOptId;
    }

    public Integer getItemId() {
        return itemId;
    }

    public void setItemId(Integer itemId) {
        this.itemId = itemId;
    }

    public String getOptSellStatCd() {
        return optSellStatCd;
    }

    public void setOptSellStatCd(String optSellStatCd) {
        this.optSellStatCd = optSellStatCd == null ? null : optSellStatCd.trim();
    }

    public String getSsgCd() {
        return ssgCd;
    }

    public void setSsgCd(String ssgCd) {
        this.ssgCd = ssgCd == null ? null : ssgCd.trim();
    }

    public String getOptNm() {
        return optNm;
    }

    public void setOptNm(String optNm) {
        this.optNm = optNm == null ? null : optNm.trim();
    }

    public Integer getSord() {
        return sord;
    }

    public void setSord(Integer sord) {
        this.sord = sord;
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
        sb.append(", itemOptChistId=").append(itemOptChistId);
        sb.append(", itemOptId=").append(itemOptId);
        sb.append(", itemId=").append(itemId);
        sb.append(", optSellStatCd=").append(optSellStatCd);
        sb.append(", ssgCd=").append(ssgCd);
        sb.append(", optNm=").append(optNm);
        sb.append(", sord=").append(sord);
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
        ItemOptionChangeHistoryEntity other = (ItemOptionChangeHistoryEntity) that;
        return (this.getItemOptChistId() == null ? other.getItemOptChistId() == null : this.getItemOptChistId().equals(other.getItemOptChistId()))
            && (this.getItemOptId() == null ? other.getItemOptId() == null : this.getItemOptId().equals(other.getItemOptId()))
            && (this.getItemId() == null ? other.getItemId() == null : this.getItemId().equals(other.getItemId()))
            && (this.getOptSellStatCd() == null ? other.getOptSellStatCd() == null : this.getOptSellStatCd().equals(other.getOptSellStatCd()))
            && (this.getSsgCd() == null ? other.getSsgCd() == null : this.getSsgCd().equals(other.getSsgCd()))
            && (this.getOptNm() == null ? other.getOptNm() == null : this.getOptNm().equals(other.getOptNm()))
            && (this.getSord() == null ? other.getSord() == null : this.getSord().equals(other.getSord()))
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
        result = prime * result + ((getItemOptChistId() == null) ? 0 : getItemOptChistId().hashCode());
        result = prime * result + ((getItemOptId() == null) ? 0 : getItemOptId().hashCode());
        result = prime * result + ((getItemId() == null) ? 0 : getItemId().hashCode());
        result = prime * result + ((getOptSellStatCd() == null) ? 0 : getOptSellStatCd().hashCode());
        result = prime * result + ((getSsgCd() == null) ? 0 : getSsgCd().hashCode());
        result = prime * result + ((getOptNm() == null) ? 0 : getOptNm().hashCode());
        result = prime * result + ((getSord() == null) ? 0 : getSord().hashCode());
        result = prime * result + ((getRegDt() == null) ? 0 : getRegDt().hashCode());
        result = prime * result + ((getRegId() == null) ? 0 : getRegId().hashCode());
        result = prime * result + ((getModDt() == null) ? 0 : getModDt().hashCode());
        result = prime * result + ((getModId() == null) ? 0 : getModId().hashCode());
        result = prime * result + ((getUseYn() == null) ? 0 : getUseYn().hashCode());
        return result;
    }
}