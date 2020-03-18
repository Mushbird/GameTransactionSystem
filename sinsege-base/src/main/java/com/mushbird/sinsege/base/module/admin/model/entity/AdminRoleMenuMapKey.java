package com.mushbird.sinsege.base.module.admin.model.entity;

import com.mushbird.sinsege.base.model.BaseEntity;
import java.io.Serializable;

public class AdminRoleMenuMapKey extends BaseEntity implements Serializable {
    private Integer admRoleId;

    private Integer admSiteMenuId;

    private static final long serialVersionUID = com.mushbird.sinsege.base.constant.AppConst.UID;

    public Integer getAdmRoleId() {
        return admRoleId;
    }

    public void setAdmRoleId(Integer admRoleId) {
        this.admRoleId = admRoleId;
    }

    public Integer getAdmSiteMenuId() {
        return admSiteMenuId;
    }

    public void setAdmSiteMenuId(Integer admSiteMenuId) {
        this.admSiteMenuId = admSiteMenuId;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", admRoleId=").append(admRoleId);
        sb.append(", admSiteMenuId=").append(admSiteMenuId);
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
        AdminRoleMenuMapKey other = (AdminRoleMenuMapKey) that;
        return (this.getAdmRoleId() == null ? other.getAdmRoleId() == null : this.getAdmRoleId().equals(other.getAdmRoleId()))
            && (this.getAdmSiteMenuId() == null ? other.getAdmSiteMenuId() == null : this.getAdmSiteMenuId().equals(other.getAdmSiteMenuId()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getAdmRoleId() == null) ? 0 : getAdmRoleId().hashCode());
        result = prime * result + ((getAdmSiteMenuId() == null) ? 0 : getAdmSiteMenuId().hashCode());
        return result;
    }

    public AdminRoleMenuMapKey(Integer admRoleId, Integer admSiteMenuId) {
        this.admRoleId = admRoleId;
        this.admSiteMenuId = admSiteMenuId;
    }

    public AdminRoleMenuMapKey() {
        super();
    }
}