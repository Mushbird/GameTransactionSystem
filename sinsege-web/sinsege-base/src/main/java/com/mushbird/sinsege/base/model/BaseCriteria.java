package com.mushbird.sinsege.base.model;

import com.mushbird.sinsege.base.constant.AppConst;
import lombok.Data;

import java.io.Serializable;

@Data
public abstract class BaseCriteria implements Serializable {
	private static final long serialVersionUID = AppConst.UID;

    private int pageNo = 1;
    private int rowsPerPage = 10;
    private String orderType;
    private boolean page = true;
}
