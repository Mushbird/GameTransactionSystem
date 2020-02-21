package com.mushbird.sinsege.base.constant;

import com.mushbird.sinsege.base.binder.BaseBinderBean;

import lombok.Getter;

/**
 * 회원 유형, 타입 등의 상수 설정
 * <pre>
 * com.mushbird.sinsege.base.constant
 * UserEnum.java
 * </pre>
 * @date    : 2019. 02. 21.
 * @version : 0.01 ver
 * @author  : musbird
 */
public enum CouponEnum {
    it;

    @Getter
    public enum AutoClass { // 쿠폰자동구분
        memberSignup("회원가입 시 제공", SiteCode.coupon_autoClass_memberSignup)
        , firstPurchase("첫 구매 시 제공", SiteCode.coupon_autoClass_firstPurchase)
        , anniversary("기념일 제공", SiteCode.coupon_autoClass_anniversary)
        , attendance("출석체크 시 제공", SiteCode.coupon_autoClass_attendance);

        private String name;
        private String code;
        AutoClass(String name, String code) {
            this.name = name;
            this.code = code;
        }
        public String getCdAdd1Val() {
            return BaseBinderBean.getCode(this.getCode()).getCdAdd1Val();
        }
    }

    @Getter
    public enum Models {
        CPN // 쿠폰
        , CPN_USE_ENV // 쿠폰사용환경
        , CPN_TGT_ITEM_ATTR_MAP // 쿠폰대상상품속성매핑
        , CPN_TGT_ITEM_MAP // 쿠폰대상상품매핑
        , CPN_RDNB // 쿠폰난수
        , CPN_ISU_COND // 쿠폰발급조건
        , CPN_TGT_MBR_MAP // 쿠폰대상회원매핑
    }
}
