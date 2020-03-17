package com.mushbird.sinsege.base.module.display.model.entity;

import com.mushbird.sinsege.base.model.BaseEntity;
import java.io.Serializable;

public class DpNoticeItemMapKey extends BaseEntity implements Serializable {
    private Integer dpNotiId;

    private Integer itemId;

    private static final long serialVersionUID = com.mushbird.sinsege.base.constant.AppConst.UID;

    public Integer getDpNotiId() {
        return dpNotiId;
    }

    public void setDpNotiId(Integer dpNotiId) {
        this.dpNotiId = dpNotiId;
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
        sb.append(", dpNotiId=").append(dpNotiId);
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
        DpNoticeItemMapKey other = (DpNoticeItemMapKey) that;
        return (this.getDpNotiId() == null ? other.getDpNotiId() == null : this.getDpNotiId().equals(other.getDpNotiId()))
            && (this.getItemId() == null ? other.getItemId() == null : this.getItemId().equals(other.getItemId()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getDpNotiId() == null) ? 0 : getDpNotiId().hashCode());
        result = prime * result + ((getItemId() == null) ? 0 : getItemId().hashCode());
        return result;
    }

    public DpNoticeItemMapKey(Integer dpNotiId, Integer itemId) {
        this.dpNotiId = dpNotiId;
        this.itemId = itemId;
    }

    public DpNoticeItemMapKey() {
        super();
    }
}