package com.mushbird.sinsege.base.module.display.model.entity;

import com.mushbird.sinsege.base.model.BaseEntity;
import java.io.Serializable;

public class DpCategoryItemMapKey extends BaseEntity implements Serializable {
    private Integer dpCateId;

    private Integer itemId;

    private static final long serialVersionUID = com.mushbird.sinsege.base.constant.AppConst.UID;

    public Integer getDpCateId() {
        return dpCateId;
    }

    public void setDpCateId(Integer dpCateId) {
        this.dpCateId = dpCateId;
    }

    public Integer getItemId() {
        return itemId;
    }

    public void setItemId(Integer itemId) {
        this.itemId = itemId;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", dpCateId=").append(dpCateId);
        sb.append(", itemId=").append(itemId);
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
        DpCategoryItemMapKey other = (DpCategoryItemMapKey) that;
        return (this.getDpCateId() == null ? other.getDpCateId() == null : this.getDpCateId().equals(other.getDpCateId()))
            && (this.getItemId() == null ? other.getItemId() == null : this.getItemId().equals(other.getItemId()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getDpCateId() == null) ? 0 : getDpCateId().hashCode());
        result = prime * result + ((getItemId() == null) ? 0 : getItemId().hashCode());
        return result;
    }

    public DpCategoryItemMapKey(Integer dpCateId, Integer itemId) {
        this.dpCateId = dpCateId;
        this.itemId = itemId;
    }

    public DpCategoryItemMapKey() {
        super();
    }
}