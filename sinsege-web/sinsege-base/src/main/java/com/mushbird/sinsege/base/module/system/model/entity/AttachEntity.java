package com.mushbird.sinsege.base.module.system.model.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.mushbird.sinsege.base.model.BaseEntity;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public abstract class AttachEntity extends BaseEntity implements Serializable {
    private Integer atchId;

    private Integer atchGid;

    private String mbrId;

    private String admId;

    private String atchClCd;

    private String fileNm;

    private String filePath;

    private String fileExt;

    private String fileTpVal;

    private String oriFileNm;

    private BigDecimal fileSize;

    private Integer imgWdthSize;

    private Integer imgHghtSize;

    private Integer sord;

    private String tempFileYn;

    @JsonIgnore
    private Date regDt;

    @JsonIgnore
    private String regId;

    @JsonIgnore
    private String useYn;

    private static final long serialVersionUID = com.mushbird.sinsege.base.constant.AppConst.UID;

    public Integer getAtchId() {
        return atchId;
    }

    public void setAtchId(Integer atchId) {
        this.atchId = atchId;
    }

    public Integer getAtchGid() {
        return atchGid;
    }

    public void setAtchGid(Integer atchGid) {
        this.atchGid = atchGid;
    }

    public String getMbrId() {
        return mbrId;
    }

    public void setMbrId(String mbrId) {
        this.mbrId = mbrId == null ? null : mbrId.trim();
    }

    public String getAdmId() {
        return admId;
    }

    public void setAdmId(String admId) {
        this.admId = admId == null ? null : admId.trim();
    }

    public String getAtchClCd() {
        return atchClCd;
    }

    public void setAtchClCd(String atchClCd) {
        this.atchClCd = atchClCd == null ? null : atchClCd.trim();
    }

    public String getFileNm() {
        return fileNm;
    }

    public void setFileNm(String fileNm) {
        this.fileNm = fileNm == null ? null : fileNm.trim();
    }

    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath == null ? null : filePath.trim();
    }

    public String getFileExt() {
        return fileExt;
    }

    public void setFileExt(String fileExt) {
        this.fileExt = fileExt == null ? null : fileExt.trim();
    }

    public String getFileTpVal() {
        return fileTpVal;
    }

    public void setFileTpVal(String fileTpVal) {
        this.fileTpVal = fileTpVal == null ? null : fileTpVal.trim();
    }

    public String getOriFileNm() {
        return oriFileNm;
    }

    public void setOriFileNm(String oriFileNm) {
        this.oriFileNm = oriFileNm == null ? null : oriFileNm.trim();
    }

    public BigDecimal getFileSize() {
        return fileSize;
    }

    public void setFileSize(BigDecimal fileSize) {
        this.fileSize = fileSize;
    }

    public Integer getImgWdthSize() {
        return imgWdthSize;
    }

    public void setImgWdthSize(Integer imgWdthSize) {
        this.imgWdthSize = imgWdthSize;
    }

    public Integer getImgHghtSize() {
        return imgHghtSize;
    }

    public void setImgHghtSize(Integer imgHghtSize) {
        this.imgHghtSize = imgHghtSize;
    }

    public Integer getSord() {
        return sord;
    }

    public void setSord(Integer sord) {
        this.sord = sord;
    }

    public String getTempFileYn() {
        return tempFileYn;
    }

    public void setTempFileYn(String tempFileYn) {
        this.tempFileYn = tempFileYn == null ? null : tempFileYn.trim();
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
        sb.append(", atchId=").append(atchId);
        sb.append(", atchGid=").append(atchGid);
        sb.append(", mbrId=").append(mbrId);
        sb.append(", admId=").append(admId);
        sb.append(", atchClCd=").append(atchClCd);
        sb.append(", fileNm=").append(fileNm);
        sb.append(", filePath=").append(filePath);
        sb.append(", fileExt=").append(fileExt);
        sb.append(", fileTpVal=").append(fileTpVal);
        sb.append(", oriFileNm=").append(oriFileNm);
        sb.append(", fileSize=").append(fileSize);
        sb.append(", imgWdthSize=").append(imgWdthSize);
        sb.append(", imgHghtSize=").append(imgHghtSize);
        sb.append(", sord=").append(sord);
        sb.append(", tempFileYn=").append(tempFileYn);
        sb.append(", regDt=").append(regDt);
        sb.append(", regId=").append(regId);
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
        AttachEntity other = (AttachEntity) that;
        return (this.getAtchId() == null ? other.getAtchId() == null : this.getAtchId().equals(other.getAtchId()))
            && (this.getAtchGid() == null ? other.getAtchGid() == null : this.getAtchGid().equals(other.getAtchGid()))
            && (this.getMbrId() == null ? other.getMbrId() == null : this.getMbrId().equals(other.getMbrId()))
            && (this.getAdmId() == null ? other.getAdmId() == null : this.getAdmId().equals(other.getAdmId()))
            && (this.getAtchClCd() == null ? other.getAtchClCd() == null : this.getAtchClCd().equals(other.getAtchClCd()))
            && (this.getFileNm() == null ? other.getFileNm() == null : this.getFileNm().equals(other.getFileNm()))
            && (this.getFilePath() == null ? other.getFilePath() == null : this.getFilePath().equals(other.getFilePath()))
            && (this.getFileExt() == null ? other.getFileExt() == null : this.getFileExt().equals(other.getFileExt()))
            && (this.getFileTpVal() == null ? other.getFileTpVal() == null : this.getFileTpVal().equals(other.getFileTpVal()))
            && (this.getOriFileNm() == null ? other.getOriFileNm() == null : this.getOriFileNm().equals(other.getOriFileNm()))
            && (this.getFileSize() == null ? other.getFileSize() == null : this.getFileSize().equals(other.getFileSize()))
            && (this.getImgWdthSize() == null ? other.getImgWdthSize() == null : this.getImgWdthSize().equals(other.getImgWdthSize()))
            && (this.getImgHghtSize() == null ? other.getImgHghtSize() == null : this.getImgHghtSize().equals(other.getImgHghtSize()))
            && (this.getSord() == null ? other.getSord() == null : this.getSord().equals(other.getSord()))
            && (this.getTempFileYn() == null ? other.getTempFileYn() == null : this.getTempFileYn().equals(other.getTempFileYn()))
            && (this.getRegDt() == null ? other.getRegDt() == null : this.getRegDt().equals(other.getRegDt()))
            && (this.getRegId() == null ? other.getRegId() == null : this.getRegId().equals(other.getRegId()))
            && (this.getUseYn() == null ? other.getUseYn() == null : this.getUseYn().equals(other.getUseYn()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getAtchId() == null) ? 0 : getAtchId().hashCode());
        result = prime * result + ((getAtchGid() == null) ? 0 : getAtchGid().hashCode());
        result = prime * result + ((getMbrId() == null) ? 0 : getMbrId().hashCode());
        result = prime * result + ((getAdmId() == null) ? 0 : getAdmId().hashCode());
        result = prime * result + ((getAtchClCd() == null) ? 0 : getAtchClCd().hashCode());
        result = prime * result + ((getFileNm() == null) ? 0 : getFileNm().hashCode());
        result = prime * result + ((getFilePath() == null) ? 0 : getFilePath().hashCode());
        result = prime * result + ((getFileExt() == null) ? 0 : getFileExt().hashCode());
        result = prime * result + ((getFileTpVal() == null) ? 0 : getFileTpVal().hashCode());
        result = prime * result + ((getOriFileNm() == null) ? 0 : getOriFileNm().hashCode());
        result = prime * result + ((getFileSize() == null) ? 0 : getFileSize().hashCode());
        result = prime * result + ((getImgWdthSize() == null) ? 0 : getImgWdthSize().hashCode());
        result = prime * result + ((getImgHghtSize() == null) ? 0 : getImgHghtSize().hashCode());
        result = prime * result + ((getSord() == null) ? 0 : getSord().hashCode());
        result = prime * result + ((getTempFileYn() == null) ? 0 : getTempFileYn().hashCode());
        result = prime * result + ((getRegDt() == null) ? 0 : getRegDt().hashCode());
        result = prime * result + ((getRegId() == null) ? 0 : getRegId().hashCode());
        result = prime * result + ((getUseYn() == null) ? 0 : getUseYn().hashCode());
        return result;
    }
}