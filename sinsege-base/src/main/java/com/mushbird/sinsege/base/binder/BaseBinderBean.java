package com.mushbird.sinsege.base.binder;

import com.mushbird.sinsege.base.module.system.model.Code;
import com.mushbird.sinsege.base.module.system.service.BaseCodeService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.MessageSource;

public class BaseBinderBean implements ApplicationContextAware {

    private static BaseCodeService baseCodeService;
    private static MessageSource messageSource;
    
    public static String getCodeName(String cd) {
    	Code code = getCode(cd);

    	if(code == null) {
    		return "";
    	} else {
    		return code.getCdNm();
    	}

    }

    public static Code getCode(String cd) {
    	if(StringUtils.isEmpty(cd)) {
    	    return null;
        }

    	return baseCodeService.getCode(cd);
    }

    public static String getCdAdd1Val(String cd) {
    	Code code = getCode(cd);

    	if(code == null) {
    		return "";
    	} else {
    		return code.getCdAdd1Val();
    	}
    }

    public static MessageSource getMessageSource() {
    	return messageSource;
	}

    @Override
    public void setApplicationContext(ApplicationContext context) throws BeansException {
    	baseCodeService = context.getBean(BaseCodeService.class);
    	messageSource = context.getBean(MessageSource.class);
    }

	/**
	 * 신세계 코드 조회 1
	 * <pre>
	 * com.zen9.capelion.base.binder
	 * BaseBinderBean.java
	 * </pre>
	 * @date    : 2020. 02. 21.
	 * @version : 0.01 ver
	 * @author  : mushbird
	 */
	public static String getCodeNameWithType(String cd, String type) {
		Code code = getCodeWithType(cd, type);
		return code==null?"":code.getCdNm();
	}

	/**
	 * 신세계 코드 조회 2
	 * <pre>
	 * com.zen9.capelion.base.binder
	 * BaseBinderBean.java
	 * </pre>
	 * @date    : 2020. 02. 21.
	 * @version : 0.01 ver
	 * @author  : mushbird
	 */
	public static Code getCodeWithType(String cd, String type) {
		if(StringUtils.isEmpty(cd)) {
			return null;
		}
		return baseCodeService.getCodeWithType(cd, type);
	}

}
