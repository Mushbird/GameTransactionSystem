package com.mushbird.sinsege.base.constant;

import java.math.BigDecimal;
import java.util.Date;

public class BaseConst {

    protected BaseConst() {

    }

    /** UPDATE NULL 객체 */
    public static class NULL {
        public static final String STRING = new String();
        public static final Date DATE = new Date();
        public static final BigDecimal BIG_DECIMAL = BigDecimal.ZERO;
        public static final Integer INTEGER = new Integer(0);
    }
    
    /** 신세계 ID 
     * TODO mushbird : 추후 수정될 수 있음
     * */
    public static final Integer GTSI = 1;
    
    /** 신세계 DB 명칭 */
    public static final String GTS = "gts";

    /** 한정제한수량 */
    public static final Integer LIMIT_STOCK = 30;
    
    /** Y */
    public static final String Y = "Y";
    
    /** N */
    public static final String N = "N";
      
    /** NULL */
    public static final String NULL = "NULL";

    /** 관리자식별번호 - 시스템 */
    public static final String ADMIN_SYSTEM = "system";

    /** 관리자식별번호 - 배치 시스템 */
    public static final String ADMIN_BATCH = "batch";
       
    /** form 모드 */
    public static final String FORM_MODE = "formMode";
    
    /** form 모드 - 추가 */
    public static final String FORM_MODE_CREATE = "create";
    
    /** form 모드 - 수정 */
    public static final String FORM_MODE_UPDATE = "update";
    
    /** 회원 쿠폰 상태 */
    public static final String MEMBER_COUPON_STATUS = "memberCouponStatus";
    
    /** 회원 쿠폰 상태 - 만료 */
    public static final String MEMBER_COUPON_STATUS_EXPIRED = "expired";
    
    /** 회원 쿠폰 상태 - 미사용 */
    public static final String MEMBER_COUPON_STATUS_WAIT = "wait";
    
    /** 회원 쿠폰 상태 - 사용 */
    public static final String MEMBER_COUPON_STATUS_USE = "use";
    
    /** 시스템에러 */
    public static final String ERROR_SYS000 = "SYS000";
    
    /** 클레임 에러코드 - 이미 처리된 요청 */
    public static final String CLAIM_REQ_ERROR_DONE = "CLM016";
    
    /** 클레임 에러코드 - 종료된 클레임 */
    public static final String CLAIM_REQ_ERROR_END = "CLM017";
    
    /** 주문 에러코드 - 이미 처리된 요청 */
    public static final String ORDER_REQ_ERROR_DONE = "ORD001";
    
    /** 주문 에러코드 - 종료된 클레임 */
    public static final String ORDER_REQ_ERROR_END = "ORD002";
    
    /** 클레임 타입 - 취소 */
    public static final String CLAIM_TYPE_CANCEL = "cancel";
    
    /** 클레임 타입명 - 취소 */
    public static final String CLAIM_TYPE_CANCEL_NAME = "취소";
    
    /** 클레임 - 전체 취소 */
    public static final String CLAIM_PROC_TYPE_ALL = "CLAIM_ALL";
    
    /** 클레임 - 선택 취소 */
    public static final String CLAIM_PROC_TYPE_SELECT = "CLAIM_SELECT";

    /** 회원가입 쿠폰발급 프로모션 코드  */
    public static final String PROMOTION_CODE_SIGNUP = "SIGNUP_COUPON";
    
    /** 포인트 처리구분코드 - 매출 */
    public static final String POINT_PROC_FG_0 = "0";
    
    /** 포인트 처리구분코드 - 반품 */
    public static final String POINT_PROC_FG_1 = "1";
    
    /** 포인트 처리구분코드 - 포인사용 */
    public static final String POINT_PROC_FG_2 = "2";
    
    /** 포인트 처리구분코드 - 가산 */
    public static final String POINT_PROC_FG_3 = "3";
    
    /** 포인트 처리구분코드 - 감산 */
    public static final String POINT_PROC_FG_4 = "4";
    
    /** 포인트 처리구분코드 - 증정 */
    public static final String POINT_PROC_FG_5 = "5";
    
    /** 포인트 처리구분코드 - 교환권포인트 */
    public static final String POINT_PROC_FG_6 = "6";
    
    /** 포인트 처리구분코드 - Cashbag */
    public static final String POINT_PROC_FG_7 = "7";
    
    /** 포인트 처리구분코드 - 제품교환권 */
    public static final String POINT_PROC_FG_8 = "8";

    /** 포인트 처리구분코드 - 사은품 */
    public static final String POINT_PROC_FG_9 = "9";
    
    /** 포인트 처리구분코드 - 포인반품 */
    public static final String POINT_PROC_FG_A = "A";
    
    /** 포인트 처리구분코드 - 증정반품 */
    public static final String POINT_PROC_FG_B = "B";
    
    /** 포인트 처리구분코드 - Cashbag반품 */
    public static final String POINT_PROC_FG_C = "C";
    
    /** 포인트 처리구분코드 - 제품교환권반품 */
    public static final String POINT_PROC_FG_D = "D";
    
    /** 포인트 처리구분코드 - 사은품반품 */
    public static final String POINT_PROC_FG_E = "E";
    
    /** 포인트 처리구분코드 - 교환권포인트반품 */
    public static final String POINT_PROC_FG_F = "F";
    
    /** 포인트 처리구분코드 - 포인트 */
    public static final String POINT_PROC_FG_P = "P";
    
    /** 포인트 처리구분코드 - 포인트반품 */
    public static final String POINT_PROC_FG_R = "R";
    
    /** 포인트 처리구분코드 - 포인트소멸 */
    public static final String POINT_PROC_FG_Z = "Z";
    
    /** 포인트 구분 - 적립예정 */
    public static final String POINT_TYPE_NAME_SCHEDULED = "적립예정";
    
    /** 포인트 구분 - 적립완료 */
    public static final String POINT_TYPE_NAME_COMPLETED = "적립완료";
    
    /** 포인트 구분 - 적립취소 */
    public static final String POINT_TYPE_NAME_CANCELED = "적립취소";
    
    /** 포인트 구분 - 결제 시 사용 */
    public static final String POINT_TYPE_NAME_ORDER_USE = "결제시 사용";

    /** 마이페이지 비밀번호 확인여부 */
    public static final String MYPAGE_CHECKED_PW = "MYPAGE_CHECKED_PW";
}
