package com.mushbird.sinsege.base.module.member.model.entity;

import com.mushbird.sinsege.base.model.BaseEntity;
import java.io.Serializable;

public abstract class MemberCloseReasonEntity extends BaseEntity implements Serializable {
    private Integer mbrCloseRsnId;

    private Integer mbrCloseId;

    private String closeRsnCd;

    private String closeRsnCont;

    private static final long serialVersionUID = com.mushbird.sinsege.base.constant.AppConst.UID;

    public Integer getMbrCloseRsnId() {
        return mbrCloseRsnId;
    }

    public void setMbrCloseRsnId(Integer mbrCloseRsnId) {
        this.mbrCloseRsnId = mbrCloseRsnId;
    }

    public Integer getMbrCloseId() {
        return mbrCloseId;
    }

    public void setMbrCloseId(Integer mbrCloseId) {
        this.mbrCloseId = mbrCloseId;
    }

    public String getCloseRsnCd() {
        return closeRsnCd;
    }

    public void setCloseRsnCd(String closeRsnCd) {
        this.closeRsnCd = closeRsnCd == null ? null : closeRsnCd.trim();
    }

    public String getCloseRsnCont() {
        return closeRsnCont;
    }

    public void setCloseRsnCont(String closeRsnCont) {
        this.closeRsnCont = closeRsnCont == null ? null : closeRsnCont.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", mbrCloseRsnId=").append(mbrCloseRsnId);
        sb.append(", mbrCloseId=").append(mbrCloseId);
        sb.append(", closeRsnCd=").append(closeRsnCd);
        sb.append(", closeRsnCont=").append(closeRsnCont);
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
        MemberCloseReasonEntity other = (MemberCloseReasonEntity) that;
        return (this.getMbrCloseRsnId() == null ? other.getMbrCloseRsnId() == null : this.getMbrCloseRsnId().equals(other.getMbrCloseRsnId()))
            && (this.getMbrCloseId() == null ? other.getMbrCloseId() == null : this.getMbrCloseId().equals(other.getMbrCloseId()))
            && (this.getCloseRsnCd() == null ? other.getCloseRsnCd() == null : this.getCloseRsnCd().equals(other.getCloseRsnCd()))
            && (this.getCloseRsnCont() == null ? other.getCloseRsnCont() == null : this.getCloseRsnCont().equals(other.getCloseRsnCont()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getMbrCloseRsnId() == null) ? 0 : getMbrCloseRsnId().hashCode());
        result = prime * result + ((getMbrCloseId() == null) ? 0 : getMbrCloseId().hashCode());
        result = prime * result + ((getCloseRsnCd() == null) ? 0 : getCloseRsnCd().hashCode());
        result = prime * result + ((getCloseRsnCont() == null) ? 0 : getCloseRsnCont().hashCode());
        return result;
    }
}