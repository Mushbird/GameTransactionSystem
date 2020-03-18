package com.mushbird.sinsege.base.module.item.model.entity;

import com.mushbird.sinsege.base.model.BaseEntity;
import java.io.Serializable;

public class ItemSellChannelKey extends BaseEntity implements Serializable {
    private Integer itemId;

    private Integer dpChId;

    private static final long serialVersionUID = com.mushbird.sinsege.base.constant.AppConst.UID;

    public Integer getItemId() {
        return itemId;
    }

    public void setItemId(Integer itemId) {
        this.itemId = itemId;
    }

    public Integer getDpChId() {
        return dpChId;
    }

    public void setDpChId(Integer dpChId) {
        this.dpChId = dpChId;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", itemId=").append(itemId);
        sb.append(", dpChId=").append(dpChId);
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
        ItemSellChannelKey other = (ItemSellChannelKey) that;
        return (this.getItemId() == null ? other.getItemId() == null : this.getItemId().equals(other.getItemId()))
            && (this.getDpChId() == null ? other.getDpChId() == null : this.getDpChId().equals(other.getDpChId()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getItemId() == null) ? 0 : getItemId().hashCode());
        result = prime * result + ((getDpChId() == null) ? 0 : getDpChId().hashCode());
        return result;
    }

    public ItemSellChannelKey(Integer itemId, Integer dpChId) {
        this.itemId = itemId;
        this.dpChId = dpChId;
    }

    public ItemSellChannelKey() {
        super();
    }
}