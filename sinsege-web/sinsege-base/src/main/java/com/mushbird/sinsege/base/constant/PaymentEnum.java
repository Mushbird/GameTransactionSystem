package com.mushbird.sinsege.base.constant;

import lombok.Getter;

/**
 * 페이 타입 선언
 * <pre>
 * com.mushbird.sinsege.base.constant
 * PaymentEnum.java
 * </pre>
 * @date    : 2020. 02. 21
 * @version : 0.01 ver
 * @author  : mushbird
 */
public enum PaymentEnum {
	it;
	
	@Getter
	public enum Pay {
		NICEPAY("sinsege", "payment.pg.sinsege", "sinsegePayment");

	    private String typeName;
	    private String code;
	    private String returnObjectName;
	    Pay(String typeName, String code, String returnObjectName) {
	        this.typeName = typeName;
	        this.code = code;
	        this.returnObjectName = returnObjectName;
	    }
	}
	
	@Getter
	public enum PayMethod {
		VBANK("VBANK", "payment.method.virtualAccount"), BILL("BILL", "payment.method.creditcard");

		private String name;
	    private String code;
	    PayMethod(String name, String code) {
	    	this.name = name;
	        this.code = code;
	    }
	}
	
	@Getter
	public enum ErrorUrl {
		//일반 주문
		ORDER("order", "/cart/cartView"),
		//마이페이지 취소
		CANCEL("cancel", "/mypage/shopping/order");
		
		private String errorType;
	    private String url;
	    ErrorUrl(String errorType, String url) {
	    	this.errorType = errorType;
	        this.url = url;
	    }
	}
	public String returnErrorUrl(String type) {
		if (type == null || type.isEmpty()) {
			return "/main";
		}
		return ErrorUrl.valueOf(type.toUpperCase()).getUrl();
	}
}
