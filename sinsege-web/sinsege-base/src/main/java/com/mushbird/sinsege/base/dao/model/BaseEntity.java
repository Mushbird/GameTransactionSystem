package com.mushbird.sinsege.base.dao.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.mushbird.sinsege.base.constant.AppConst;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public abstract class BaseEntity implements Serializable {
    private static final long serialVersionUID = AppConst.UID;

    /** 등록아이디 */
    @JsonIgnore
    private String regId;

    /** 등록일시 */
    @JsonIgnore
    private Date regDt;

    /** 수정아이디 */
    @JsonIgnore
    private String modId;

    /** 수정일시 */
    @JsonIgnore
    private Date modDt;

    /** 사용여부 */
    @JsonIgnore
    private String useYn;
}
