package com.mushbird.sinsege.base.constant;

import com.mushbird.sinsege.base.binder.BaseBinderBean;

import lombok.Getter;

/**
 * 회원 유형, 등급 상수 설정
 * <pre>
 * com.mushbird.sinsege.base.constant
 * UserEnum.java
 * </pre>
 * @date    : 2020. 02. 21.
 * @version : 0.01 ver
 * @author  : mushbird
 */
public enum UserEnum {
    it;

    @Getter
    public enum Grade {
        Bronze("bronze회원", SiteCode.member_grade_bronze)
        , Silver("silver회원", SiteCode.member_grade_silver)
        , Gold("Gold회원", SiteCode.member_grade_gold);

        private String name;
        private String code;
        Grade(String name, String code) {
            this.name = name;
            this.code = code;
        }
    }

    @Getter
    public enum Type {
        normal("일반회원", SiteCode.member_type_normal)
        , Admin("임직원", SiteCode.member_type_Admin);

        private String name;
        private String code;
        Type(String name, String code) {
            this.name = name;
            this.code = code;
        }
    }

    /** 맴버쉽 */
    @Getter
    public enum Prm {
        it;

        @Getter
        public enum Status {
            signup("가입", SiteCode.member_premium_status_signup)
            , close("탈회", SiteCode.member_premium_status_close);

            private String name;
            private String code;
            Status(String name, String code) {
                this.name = name;
                this.code = code;
            }
        }
    }

    @Getter
    public enum Models {
        Mbr
        , MbrTp
        , MbrPrms
        , MbrPrmsSub
        , MbrGrld
    }
}
