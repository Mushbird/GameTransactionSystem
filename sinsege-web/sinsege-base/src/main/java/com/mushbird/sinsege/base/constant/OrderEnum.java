package com.mushbird.sinsege.base.constant;

import lombok.Getter;

/**
 * 주문 타입 선언
 * <pre>
 * com.zen9.capelion.base.constant
 * PaymentEnum.java
 * </pre>
 * @date    : 2020. 02. 21.
 * @version : 0.01 ver
 * @author  : mushbird
 */
public enum OrderEnum {
	it;
	
	@Getter
	public enum Type {
		ORDER("order", "일반배송", "", "order.type.normal", "", "/cart/cartView");

	    private String orderType;
	    private String orderName;
	    private String cartTypeCd;
	    private String orderTypeCd;
	    private String orderFormAction;
	    private String cartUrl;
	    Type(String orderType, String orderName, String cartTypeCd, String orderTypeCd, String orderFormAction, String cartUrl) {
	        this.orderType = orderType;
	        this.orderName = orderName;
	        this.cartTypeCd = cartTypeCd;
	        this.orderTypeCd = orderTypeCd;
	        this.orderFormAction = orderFormAction;
	        this.cartUrl = cartUrl;
	    }
	}
	public String returnCartTypeCd(String orderType) {
    	return Type.valueOf(orderType.toUpperCase()).getCartTypeCd();
    }
	public String returnOrderFormAction(String orderType) {
		return Type.valueOf(orderType.toUpperCase()).getOrderFormAction();
	}
	public String returnCartUrl(String orderType) {
		return Type.valueOf(orderType.toUpperCase()).getCartUrl();
	}
	public String returnOrderType(String orderTypeCd) {
		String orderType = null;
		switch (orderTypeCd) {
		case "order.type.normal":
			orderType = "order";
			break;
		default:
			break;
		}
    	return orderType;
    }
}
