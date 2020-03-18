package com.mushbird.sinsege.base.constant;

import lombok.Getter;

/**
 * 달력 값을 상수로 선언
 * <pre>
 * com.mushbird.sinsege.base.constant
 * CalendarEnum.java
 * </pre>
 * @date    : 2020. 02. 21
 * @version : 0.0.1 ver
 * @author  : mushbird
 */
@Getter
public enum CalendarEnum {
	SUNDAY("SUNDAY", 1), MONDAY("MONDAY", 2), TUESDAY("TUESDAY", 3), WEDNESDAY("WEDNESDAY", 4), THURSDAY("THURSDAY", 5), FRIDAY("FRIDAY", 6), SATURDAY("SATURDAY", 7);

    private String name;
    private int code;
    
    CalendarEnum(String name, int code) {
        this.name = name;
        this.code = code;
    }
    

	@Getter
	public enum DayEnum {
		monday("월요일", 1)
        , tueday("화요일", 2)
		, wedday("수요일", 3)
		, thusday("목요일", 4)
		, friday("금요일", 5);

        private String name;
        private int sord;
        DayEnum(String name, int sord) {
            this.name = name;
            this.sord = sord;
        }
	}
}
