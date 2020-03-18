package com.mushbird.sinsege.base.constant;

import java.util.function.Function;

import lombok.Getter;

/**
 * 상품 가격 정보에 관련된 상수 선언
 * <pre>
 * com.mushbird.sinsege.base.constant
 * ItemPriceEnum.java
 * </pre>
 * @date    : 2019. 02. 21
 * @version : 0.01 ver
 * @author  : mushbird
 */
public enum ItemPriceEnum {
	it;

    @Getter
    public enum PriceType {
        Mall("신세계몰가", "item.priceType.mall", dpChId -> dpChId == 1)
        , General("일반할인가", "item.priceType.generalDc", dpChId -> dpChId < 2);
    	
        private String name;
        private String code;
        private Function<Integer, Boolean> checkDpChId;
        PriceType(String name, String code, Function<Integer, Boolean> checkDpChId) {
            this.name = name;
            this.code = code;
            this.checkDpChId = checkDpChId;
        }
        public boolean checkDpChId(int dpChId) {
            return checkDpChId.apply(dpChId);
        }
    }
    public static String returnName(String param) {
    	String priceName = "";
		for(ItemPriceEnum.PriceType type : ItemPriceEnum.PriceType.values()) {
			if(type.getCode().equals(param)) {
				priceName = type.getName();
			}
		}
		return priceName;
    }
}
