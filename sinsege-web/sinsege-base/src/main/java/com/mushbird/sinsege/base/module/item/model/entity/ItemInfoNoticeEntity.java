package com.mushbird.sinsege.base.module.item.model.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.mushbird.sinsege.base.model.BaseEntity;
import java.io.Serializable;
import java.util.Date;

public abstract class ItemInfoNoticeEntity extends BaseEntity implements Serializable {
    private Integer itemInfoNotiId;

    private Integer itemId;

    private String itemInfoNotiCateCd;

    private String itemInfoNotiDtlCd;

    private String cont;

    private String dpYn;

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

    public Integer getItemInfoNotiId() {
        return itemInfoNotiId;
    }

    public void setItemInfoNotiId(Integer itemInfoNotiId) {
        this.itemInfoNotiId = itemInfoNotiId;
    }

    public Integer getItemId() {
        return itemId;
    }

    public void setItemId(Integer itemId) {
        this.itemId = itemId;
    }

    public String getItemInfoNotiCateCd() {
        return itemInfoNotiCateCd;
    }

    public void setItemInfoNotiCateCd(String itemInfoNotiCateCd) {
        this.itemInfoNotiCateCd = itemInfoNotiCateCd == null ? null : itemInfoNotiCateCd.trim();
    }

    public String getItemInfoNotiDtlCd() {
        return itemInfoNotiDtlCd;
    }

    public void setItemInfoNotiDtlCd(String itemInfoNotiDtlCd) {
        this.itemInfoNotiDtlCd = itemInfoNotiDtlCd == null ? null : itemInfoNotiDtlCd.trim();
    }

    public String getCont() {
        return cont;
    }

    public void setCont(String cont) {
        this.cont = cont == null ? null : cont.trim();
    }

    public String getDpYn() {
        return dpYn;
    }

    public void setDpYn(String dpYn) {
        this.dpYn = dpYn == null ? null : dpYn.trim();
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
        sb.append(", itemInfoNotiId=").append(itemInfoNotiId);
        sb.append(", itemId=").append(itemId);
        sb.append(", itemInfoNotiCateCd=").append(itemInfoNotiCateCd);
        sb.append(", itemInfoNotiDtlCd=").append(itemInfoNotiDtlCd);
        sb.append(", cont=").append(cont);
        sb.append(", dpYn=").append(dpYn);
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
        ItemInfoNoticeEntity other = (ItemInfoNoticeEntity) that;
        return (this.getItemInfoNotiId() == null ? other.getItemInfoNotiId() == null : this.getItemInfoNotiId().equals(other.getItemInfoNotiId()))
            && (this.getItemId() == null ? other.getItemId() == null : this.getItemId().equals(other.getItemId()))
            && (this.getItemInfoNotiCateCd() == null ? other.getItemInfoNotiCateCd() == null : this.getItemInfoNotiCateCd().equals(other.getItemInfoNotiCateCd()))
            && (this.getItemInfoNotiDtlCd() == null ? other.getItemInfoNotiDtlCd() == null : this.getItemInfoNotiDtlCd().equals(other.getItemInfoNotiDtlCd()))
            && (this.getCont() == null ? other.getCont() == null : this.getCont().equals(other.getCont()))
            && (this.getDpYn() == null ? other.getDpYn() == null : this.getDpYn().equals(other.getDpYn()))
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
        result = prime * result + ((getItemInfoNotiId() == null) ? 0 : getItemInfoNotiId().hashCode());
        result = prime * result + ((getItemId() == null) ? 0 : getItemId().hashCode());
        result = prime * result + ((getItemInfoNotiCateCd() == null) ? 0 : getItemInfoNotiCateCd().hashCode());
        result = prime * result + ((getItemInfoNotiDtlCd() == null) ? 0 : getItemInfoNotiDtlCd().hashCode());
        result = prime * result + ((getCont() == null) ? 0 : getCont().hashCode());
        result = prime * result + ((getDpYn() == null) ? 0 : getDpYn().hashCode());
        result = prime * result + ((getRegDt() == null) ? 0 : getRegDt().hashCode());
        result = prime * result + ((getRegId() == null) ? 0 : getRegId().hashCode());
        result = prime * result + ((getModDt() == null) ? 0 : getModDt().hashCode());
        result = prime * result + ((getModId() == null) ? 0 : getModId().hashCode());
        result = prime * result + ((getUseYn() == null) ? 0 : getUseYn().hashCode());
        return result;
    }
}