package com.mushbird.sinsege.base.model;

import java.io.Serializable;

import com.mushbird.sinsege.base.constant.AppConst;

import lombok.Data;

@Data
public abstract class BaseSearch implements Serializable {
	private static final long serialVersionUID = AppConst.UID;

    /**
     * 현재 페이지 번호
     */
    private int pageNo = 1;
    /**
     * 페이지 갯수
     */
    private int pageSize = 10;
    /**
     * 리스트 게시수
     */
    private int rowsPerPage = 20;
    
    /**
     * 페이지 사용 유무
     */
    private boolean page = true;
}
