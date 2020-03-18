package com.mushbird.sinsege.base.module.system.model.entity;

import com.mushbird.sinsege.base.model.BaseEntity;
import java.io.Serializable;

public class SitePolicyKey extends BaseEntity implements Serializable {
    private String siteId;

    private String sitePcyTpCd;

    private String sitePcyEnvCd;

    private static final long serialVersionUID = com.mushbird.sinsege.base.constant.AppConst.UID;

    public String getSiteId() {
        return siteId;
    }

    public void setSiteId(String siteId) {
        this.siteId = siteId == null ? null : siteId.trim();
    }

    public String getSitePcyTpCd() {
        return sitePcyTpCd;
    }

    public void setSitePcyTpCd(String sitePcyTpCd) {
        this.sitePcyTpCd = sitePcyTpCd == null ? null : sitePcyTpCd.trim();
    }

    public String getSitePcyEnvCd() {
        return sitePcyEnvCd;
    }

    public void setSitePcyEnvCd(String sitePcyEnvCd) {
        this.sitePcyEnvCd = sitePcyEnvCd == null ? null : sitePcyEnvCd.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", siteId=").append(siteId);
        sb.append(", sitePcyTpCd=").append(sitePcyTpCd);
        sb.append(", sitePcyEnvCd=").append(sitePcyEnvCd);
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
        SitePolicyKey other = (SitePolicyKey) that;
        return (this.getSiteId() == null ? other.getSiteId() == null : this.getSiteId().equals(other.getSiteId()))
            && (this.getSitePcyTpCd() == null ? other.getSitePcyTpCd() == null : this.getSitePcyTpCd().equals(other.getSitePcyTpCd()))
            && (this.getSitePcyEnvCd() == null ? other.getSitePcyEnvCd() == null : this.getSitePcyEnvCd().equals(other.getSitePcyEnvCd()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getSiteId() == null) ? 0 : getSiteId().hashCode());
        result = prime * result + ((getSitePcyTpCd() == null) ? 0 : getSitePcyTpCd().hashCode());
        result = prime * result + ((getSitePcyEnvCd() == null) ? 0 : getSitePcyEnvCd().hashCode());
        return result;
    }

    public SitePolicyKey(String siteId, String sitePcyTpCd, String sitePcyEnvCd) {
        this.siteId = siteId;
        this.sitePcyTpCd = sitePcyTpCd;
        this.sitePcyEnvCd = sitePcyEnvCd;
    }

    public SitePolicyKey() {
        super();
    }
}