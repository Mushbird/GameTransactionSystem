package com.mushbird.sinsege.base.constant;

/**
 * 사이트 공통코드
 */
public class SiteCode {

	private SiteCode() {}
	
	/** 관리자 */ public static final String admin = "admin";
	/** 일반회원 */ public static final String member_type_normal = "member.type.normal";
	/** 임직원 */ public static final String member_type_Admin = "member.type.Admin";
	/** bronze회원 */ public static final String member_grade_bronze = "member.grade.bronze";
	/** silver회원 */ public static final String member_grade_silver = "member.grade.silver";
	/** Gold회원 */ public static final String member_grade_gold = "member.grade.gold";
	/** 가입 */ public static final String member_premium_status_signup = "member.premium.status.signup";
	/** 탈퇴 */ public static final String member_premium_status_close = "member.premium.status.close";
	/** 회원가입 시 제공 */ public static final String coupon_autoClass_memberSignup = "coupon.autoClass.memberSignup";
	/** 첫 구매 시 제공 */ public static final String coupon_autoClass_firstPurchase = "coupon.autoClass.firstPurchase";
	/** 기념일 제공 */ public static final String coupon_autoClass_anniversary = "coupon.autoClass.anniversary";
	/** 출석체크 시 제공 */ public static final String coupon_autoClass_attendance = "coupon.autoClass.attendance";

}
