package com.mushbird.sinsege.base.module.item.model.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.mushbird.sinsege.base.model.BaseEntity;
import java.io.Serializable;
import java.util.Date;

public abstract class ItemImageEntity extends BaseEntity implements Serializable {
    private Integer itemImgId;

    private Integer itemId;

    private String itemImgTpCd;

    private Integer atchId;

    @JsonIgnore
    private Date regDt;

    @JsonIgnore
    private String regId;

    @JsonIgnore
    private Date modDt;

    @JsonIgnore
    private String modId;

    private static final long serialVersionUID = com.mushbird.sinsege.base.constant.AppConst.UID;

    public Integer getItemImgId() {
        return itemImgId;
    }

    public void setItemImgId(Integer itemImgId) {
        this.itemImgId = itemImgId;
    }

    public Integer getItemId() {
        return itemId;
    }

    public void setItemId(Integer itemId) {
        this.itemId = itemId;
    }

    public String getItemImgTpCd() {
        return itemImgTpCd;
    }

    public void setItemImgTpCd(String itemImgTpCd) {
        this.itemImgTpCd = itemImgTpCd == null ? null : itemImgTpCd.trim();
    }

    public Integer getAtchId() {
        return atchId;
    }

    public void setAtchId(Integer atchId) {
        this.atchId = atchId;
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
        sb.append(", itemImgId=").append(itemImgId);
        sb.append(", itemId=").append(itemId);
        sb.append(", itemImgTpCd=").append(itemImgTpCd);
        sb.append(", atchId=").append(atchId);
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
        ItemImageEntity other = (ItemImageEntity) that;
        return (this.getItemImgId() == null ? other.getItemImgId() == null : this.getItemImgId().equals(other.getItemImgId()))
            && (this.getItemId() == null ? other.getItemId() == null : this.getItemId().equals(other.getItemId()))
            && (this.getItemImgTpCd() == null ? other.getItemImgTpCd() == null : this.getItemImgTpCd().equals(other.getItemImgTpCd()))
            && (this.getAtchId() == null ? other.getAtchId() == null : this.getAtchId().equals(other.getAtchId()))
            && (this.getRegDt() == null ? other.getRegDt() == null : this.getRegDt().equals(other.getRegDt()))
            && (this.getRegId() == null ? other.getRegId() == null : this.getRegId().equals(other.getRegId()))
            && (this.getModDt() == null ? other.getModDt() == null : this.getModDt().equals(other.getModDt()))
            && (this.getModId() == null ? other.getModId() == null : this.getModId().equals(other.getModId()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getItemImgId() == null) ? 0 : getItemImgId().hashCode());
        result = prime * result + ((getItemId() == null) ? 0 : getItemId().hashCode());
        result = prime * result + ((getItemImgTpCd() == null) ? 0 : getItemImgTpCd().hashCode());
        result = prime * result + ((getAtchId() == null) ? 0 : getAtchId().hashCode());
        result = prime * result + ((getRegDt() == null) ? 0 : getRegDt().hashCode());
        result = prime * result + ((getRegId() == null) ? 0 : getRegId().hashCode());
        result = prime * result + ((getModDt() == null) ? 0 : getModDt().hashCode());
        result = prime * result + ((getModId() == null) ? 0 : getModId().hashCode());
        return result;
    }
}