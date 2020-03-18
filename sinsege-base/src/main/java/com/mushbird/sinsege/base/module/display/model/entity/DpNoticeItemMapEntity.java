package com.mushbird.sinsege.base.module.display.model.entity;

import java.io.Serializable;

public abstract class DpNoticeItemMapEntity extends DpNoticeItemMapKey implements Serializable {
    private static final long serialVersionUID = com.mushbird.sinsege.base.constant.AppConst.UID;

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
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
        DpNoticeItemMapEntity other = (DpNoticeItemMapEntity) that;
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
}