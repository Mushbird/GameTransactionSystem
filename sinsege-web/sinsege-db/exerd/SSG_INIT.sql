-- 관리자
CREATE TABLE `ADM` (
	`ADM_ID`           VARCHAR(20)       NOT NULL COMMENT '관리자식별번호', -- 관리자식별번호
	`VEN_ID`           INTEGER           NULL     COMMENT '업체식별번호', -- 업체식별번호
	`ADM_TP_CD`        VARCHAR(100)      NOT NULL COMMENT '관리자유형코드', -- 관리자유형코드
	`ADM_STAT_CD`      VARCHAR(100)      NOT NULL COMMENT '관리자상태코드', -- 관리자상태코드
	`ADM_LGN_ID`       VARCHAR(255)      NULL     COMMENT '관리자로그인아이디', -- 관리자로그인아이디
	`PW`               BINARY(255)       NULL     COMMENT '비밀번호', -- 비밀번호
	`ADM_NM`           VARCHAR(200)      NOT NULL COMMENT '관리자명', -- 관리자명
	`EMAIL`            VARCHAR(40)       NULL     COMMENT '이메일', -- 이메일
	`CP_CARR_CD`       VARCHAR(100)      NULL     COMMENT '휴대폰통신사코드', -- 휴대폰통신사코드
	`CP_NO`            VARCHAR(30)       NULL     COMMENT '휴대폰번호', -- 휴대폰번호
	`ADM_SITE_CD`      VARCHAR(100)      NOT NULL DEFAULT 'admin.site.mall' COMMENT '관리자사이트코드', -- 관리자사이트코드
	`ADM_ROLE_ID`      INTEGER           NULL     COMMENT '관리자역할식별번호', -- 관리자역할식별번호
	`APRV_GRD_CD`      VARCHAR(100)      NULL     COMMENT '승인등급코드', -- 승인등급코드
	`SUP_DT`           DATE              NULL     COMMENT '가입일시', -- 가입일시
	`PW_MOD_DT`        DATE              NULL     COMMENT '비밀번호수정일시', -- 비밀번호수정일시
	`LAST_LGN_DT`      DATE              NULL     COMMENT '최근로그인일시', -- 최근로그인일시
	`LAST_INFO_MOD_DT` DATE              NULL     COMMENT '최근정보수정일시', -- 최근정보수정일시
	`LGN_RTRY_CNT`     NUMERIC(9)        NOT NULL DEFAULT 0 COMMENT '로그인재시도횟수', -- 로그인재시도횟수
	`REG_DT`           TIMESTAMP         NOT NULL COMMENT '등록일시', -- 등록일시
	`REG_ID`           VARCHAR(20)       NULL     COMMENT '등록아이디', -- 등록아이디
	`MOD_DT`           TIMESTAMP         NOT NULL COMMENT '수정일시', -- 수정일시
	`MOD_ID`           VARCHAR(20)       NULL     COMMENT '수정아이디', -- 수정아이디
	`USE_YN`           VARCHAR(1)        NOT NULL COMMENT '사용여부' -- 사용여부
)
COMMENT '관리자';


-- 첨부
CREATE TABLE ATCH (
	ATCH_ID       INTEGER      NOT NULL COMMENT '첨부식별번호', -- 첨부식별번호
	ATCH_GID      INTEGER      NOT NULL COMMENT '첨부그룹식별번호', -- 첨부그룹식별번호
	MBR_ID        VARCHAR(20)  NULL     COMMENT '회원식별번호', -- 회원식별번호
	ADM_ID        VARCHAR(20)  NULL     COMMENT '관리자식별번호', -- 관리자식별번호
	ATCH_CL_CD    VARCHAR(100) NULL     COMMENT '첨부구분코드', -- 첨부구분코드
	FILE_NM       VARCHAR(200) NOT NULL COMMENT '파일명', -- 파일명
	FILE_PATH     VARCHAR(200) NOT NULL COMMENT '파일경로', -- 파일경로
	FILE_EXT      VARCHAR(10)  NULL     COMMENT '파일확장자', -- 파일확장자
	FILE_TP_VAL   VARCHAR(100) NULL     COMMENT '파일유형값', -- 파일유형값
	ORI_FILE_NM   VARCHAR(200) NOT NULL COMMENT '원본파일명', -- 원본파일명
	FILE_SIZE     NUMERIC(20)   NULL     COMMENT '파일사이즈', -- 파일사이즈
	IMG_WDTH_SIZE NUMERIC(9)    NULL     COMMENT '이미지가로사이즈', -- 이미지가로사이즈
	IMG_HGHT_SIZE NUMERIC(9)    NULL     COMMENT '이미지세로사이즈', -- 이미지세로사이즈
	SORD          NUMERIC(5)    NULL     COMMENT '정렬순서', -- 정렬순서
	TEMP_FILE_YN  VARCHAR(1)   NULL     COMMENT '임시파일여부', -- 임시파일여부
	REG_DT        TIMESTAMP    NOT NULL COMMENT '등록일시', -- 등록일시
	REG_ID        VARCHAR(20)  NULL     COMMENT '등록아이디', -- 등록아이디
	USE_YN        VARCHAR(1)   NOT NULL COMMENT '사용여부' -- 사용여부
)
COMMENT '첨부';

-- 첨부
ALTER TABLE ATCH
	ADD CONSTRAINT PK_ATCH -- 첨부 기본키
		PRIMARY KEY (
			ATCH_ID -- 첨부식별번호
		);

-- 첨부 인덱스
CREATE INDEX IX_ATCH
	ON ATCH( -- 첨부
		ATCH_GID ASC -- 첨부그룹식별번호
	);

-- 시스템저장프로시저로그
CREATE TABLE SYS_SP_LOG (
	SYS_SP_LOG_ID INTEGER      NOT NULL COMMENT '시스템저장프로시저로그식별번호', -- 시스템저장프로시저로그식별번호
	SP_NM         VARCHAR(500) NOT NULL COMMENT '저장프로시저명', -- 저장프로시저명
	RSLT_CD       VARCHAR(100) NOT NULL COMMENT '결과코드', -- 결과코드
	MSG           VARCHAR(1000)NULL     COMMENT '메시지', -- 메시지
	ERR_NO        VARCHAR(8)   NULL     COMMENT '에러번호', -- 에러번호
	ERR_LINE      INTEGER      NULL     COMMENT '에러라인', -- 에러라인
	EXE_DT        DATE         NOT NULL COMMENT '실행일시', -- 실행일시
	ED_DT         DATE         NULL     COMMENT '종료일시', -- 종료일시
	HOST_NM       VARCHAR(200) NULL     COMMENT '호스트명' -- 호스트명
)
COMMENT '시스템저장프로시저로그';

-- 시스템저장프로시저로그
ALTER TABLE SYS_SP_LOG
	ADD CONSTRAINT PK_SYS_SP_LOG -- 시스템저장프로시저로그 기본키
		PRIMARY KEY (
			SYS_SP_LOG_ID -- 시스템저장프로시저로그식별번호
		);

-- 사이트
CREATE TABLE SITE (
	SITE_ID         VARCHAR(20)  NOT NULL COMMENT '사이트식별번호', -- 사이트식별번호
	BIZ_NM          VARCHAR(200) NULL     COMMENT '사업자명', -- 사업자명
	REP_NM          VARCHAR(200) NULL     COMMENT '대표자명', -- 대표자명
	REP_TEL         VARCHAR(30)  NULL     COMMENT '대표전화', -- 대표전화
	FAX_NO          VARCHAR(30)  NULL     COMMENT '팩스번호', -- 팩스번호
	BIZ_NO          VARCHAR(20)  NULL     COMMENT '사업자번호', -- 사업자번호
	BIZ_LOC_ADDR    VARCHAR(255) NULL     COMMENT '사업장주소', -- 사업장주소
	CISO_NM         VARCHAR(200) NULL     COMMENT '정보보호최고책임자명', -- 정보보호최고책임자명
	EMAIL           VARCHAR(40)  NULL     COMMENT '이메일', -- 이메일
	CSO_TEL_NO      VARCHAR(30)  NULL     COMMENT '고객상담실전화번호', -- 고객상담실전화번호
	SEO_TIT         VARCHAR(200) NULL     COMMENT 'SEO_제목', -- SEO_제목
	SEO_DESC        VARCHAR(500) NULL     COMMENT 'SEO_설명', -- SEO_설명
	SEO_KWD         VARCHAR(500) NULL     COMMENT 'SEO_키워드', -- SEO_키워드
	SEO_OG_ATCH_GID INTEGER      NULL     COMMENT 'SEO_OG첨부그룹식별번호', -- SEO_OG첨부그룹식별번호
	REG_DT          TIMESTAMP    NOT NULL COMMENT '등록일시', -- 등록일시
	REG_ID          VARCHAR(20)  NULL     COMMENT '등록아이디', -- 등록아이디
	MOD_DT          TIMESTAMP    NOT NULL COMMENT '수정일시', -- 수정일시
	MOD_ID          VARCHAR(20)  NULL     COMMENT '수정아이디' -- 수정아이디
)
COMMENT '사이트';

-- 사이트
ALTER TABLE SITE
	ADD CONSTRAINT PK_SITE -- 사이트 기본키
		PRIMARY KEY (
			SITE_ID -- 사이트식별번호
		);

-- 사이트정책
CREATE TABLE SITE_PCY (
	SITE_ID         VARCHAR(20)  NOT NULL COMMENT '사이트식별번호', -- 사이트식별번호
	SITE_PCY_TP_CD  VARCHAR(100) NOT NULL COMMENT '사이트정책유형코드', -- 사이트정책유형코드
	SITE_PCY_ENV_CD VARCHAR(100) NOT NULL COMMENT '사이트정책환경코드', -- 사이트정책환경코드
	CONT            VARCHAR(1000)NOT NULL COMMENT '내용', -- 내용
	REG_DT          TIMESTAMP    NOT NULL COMMENT '등록일시', -- 등록일시
	REG_ID          VARCHAR(20)  NULL     COMMENT '등록아이디', -- 등록아이디
	MOD_DT          TIMESTAMP    NOT NULL COMMENT '수정일시', -- 수정일시
	MOD_ID          VARCHAR(20)  NULL     COMMENT '수정아이디' -- 수정아이디
)
COMMENT '사이트정책';

-- 사이트정책
ALTER TABLE SITE_PCY
	ADD CONSTRAINT PK_SITE_PCY -- 사이트정책 기본키
		PRIMARY KEY (
			SITE_ID,         -- 사이트식별번호
			SITE_PCY_TP_CD,  -- 사이트정책유형코드
			SITE_PCY_ENV_CD  -- 사이트정책환경코드
		);

-- 코드
CREATE TABLE CD (
	CD           VARCHAR(100)  NOT NULL COMMENT '코드', -- 코드
	REF_CD       VARCHAR(100)  NULL     COMMENT '참조코드', -- 참조코드
	CD_NM        VARCHAR(200)  NOT NULL COMMENT '코드명', -- 코드명
	CD_ADD_1_VAL VARCHAR(1000) NULL     COMMENT '코드추가1값', -- 코드추가1값
	CD_ADD_2_VAL VARCHAR(1000) NULL     COMMENT '코드추가2값', -- 코드추가2값
	CD_ADD_3_VAL VARCHAR(1000) NULL     COMMENT '코드추가3값', -- 코드추가3값
	SORD         NUMERIC(5)     NULL     COMMENT '정렬순서', -- 정렬순서
	DP_YN        VARCHAR(1)    NOT NULL DEFAULT 'Y' COMMENT '전시여부', -- 전시여부
	SYS_CD_YN    VARCHAR(1)    NOT NULL DEFAULT 'Y' COMMENT '시스템코드여부', -- 시스템코드여부
	NOTE         VARCHAR(1000) NULL     COMMENT '비고', -- 비고
	REG_DT       TIMESTAMP     NOT NULL COMMENT '등록일시', -- 등록일시
	REG_ID       VARCHAR(20)   NULL     COMMENT '등록아이디', -- 등록아이디
	MOD_DT       TIMESTAMP     NOT NULL COMMENT '수정일시', -- 수정일시
	MOD_ID       VARCHAR(20)   NULL     COMMENT '수정아이디', -- 수정아이디
	USE_YN       VARCHAR(1)    NOT NULL COMMENT '사용여부' -- 사용여부
)
COMMENT '코드';

-- 코드
ALTER TABLE CD
	ADD CONSTRAINT PK_CD -- 코드 기본키
		PRIMARY KEY (
			CD -- 코드
		);

-- 사이트혜택
CREATE TABLE SITE_BENF (
	SITE_ID          VARCHAR(20)  NOT NULL COMMENT '사이트식별번호', -- 사이트식별번호
	SITE_BENF_TP_CD  VARCHAR(100) NOT NULL COMMENT '사이트혜택유형코드', -- 사이트혜택유형코드
	BENF_NM          VARCHAR(200) NOT NULL COMMENT '혜택명', -- 혜택명
	IMG_ATCH_GID_PC  INTEGER      NULL     COMMENT '이미지첨부그룹아이디PC', -- 이미지첨부그룹아이디PC
	IMG_ATCH_GID_MOB INTEGER      NULL     COMMENT '이미지첨부그룹아이디모바일', -- 이미지첨부그룹아이디모바일
	REG_DT           TIMESTAMP    NOT NULL COMMENT '등록일시', -- 등록일시
	REG_ID           VARCHAR(20)  NULL     COMMENT '등록아이디', -- 등록아이디
	MOD_DT           TIMESTAMP    NOT NULL COMMENT '수정일시', -- 수정일시
	MOD_ID           VARCHAR(20)  NULL     COMMENT '수정아이디', -- 수정아이디
	USE_YN           VARCHAR(1)   NOT NULL COMMENT '사용여부' -- 사용여부
)
COMMENT '사이트혜택';

-- 사이트혜택
ALTER TABLE SITE_BENF
	ADD CONSTRAINT PK_SITE_BENF -- 사이트혜택 기본키
		PRIMARY KEY (
			SITE_ID,         -- 사이트식별번호
			SITE_BENF_TP_CD  -- 사이트혜택유형코드
		);

-- 관리자역할
CREATE TABLE ADM_ROLE (
	ADM_ROLE_ID       INTEGER      NOT NULL COMMENT '관리자역할식별번호', -- 관리자역할식별번호
	ADM_ROLE_CD       VARCHAR(100) NOT NULL COMMENT '관리자역할코드', -- 관리자역할코드
	ADM_ROLE_NM       VARCHAR(200) NOT NULL COMMENT '관리자역할명', -- 관리자역할명
	PSNL_INFO_HNDL_YN VARCHAR(1)   NOT NULL COMMENT '개인정보취급여부', -- 개인정보취급여부
	DASHBD_TP_CD      VARCHAR(100) NOT NULL COMMENT '대시보드유형코드', -- 대시보드유형코드
	DP_YN             VARCHAR(1)   NOT NULL COMMENT '전시여부', -- 전시여부
	FIX_GRP_YN        VARCHAR(1)   NOT NULL COMMENT '고정그룹여부', -- 고정그룹여부
	REG_DT            TIMESTAMP    NOT NULL COMMENT '등록일시', -- 등록일시
	REG_ID            VARCHAR(20)  NULL     COMMENT '등록아이디', -- 등록아이디
	MOD_DT            TIMESTAMP    NOT NULL COMMENT '수정일시', -- 수정일시
	MOD_ID            VARCHAR(20)  NULL     COMMENT '수정아이디', -- 수정아이디
	USE_YN            VARCHAR(1)   NOT NULL COMMENT '사용여부' -- 사용여부
)
COMMENT '관리자역할';

-- 관리자역할
ALTER TABLE ADM_ROLE
	ADD CONSTRAINT PK_ADM_ROLE -- 관리자역할 기본키
		PRIMARY KEY (
			ADM_ROLE_ID -- 관리자역할식별번호
		);

-- 관리자기록
CREATE TABLE ADM_HIST (
	ADM_HIST_ID    INTEGER       NOT NULL COMMENT '관리자기록식별번호', -- 관리자기록식별번호
	ADM_ID         VARCHAR(20)   NOT NULL COMMENT '관리자식별번호', -- 관리자식별번호
	ADM_ROLE_ID    INTEGER       NULL     COMMENT '관리자역할식별번호', -- 관리자역할식별번호
	ADM_ROLE_CD    VARCHAR(100)  NULL     COMMENT '관리자역할코드', -- 관리자역할코드
	APRV_GRD_CD    VARCHAR(100)  NULL     COMMENT '승인등급코드', -- 승인등급코드
	ADM_HIST_TP_CD VARCHAR(100)  NOT NULL COMMENT '관리자기록유형코드', -- 관리자기록유형코드
	URL_ADDR       VARCHAR(500)  NOT NULL COMMENT 'URL주소', -- URL주소
	CONT           VARCHAR(1000) NOT NULL COMMENT '내용', -- 내용
	ADM_HIST_DT    DATE          NOT NULL COMMENT '관리자기록일시' -- 관리자기록일시
)
COMMENT '관리자기록';

-- 관리자기록
ALTER TABLE ADM_HIST
	ADD CONSTRAINT PK_ADM_HIST -- 관리자기록 기본키
		PRIMARY KEY (
			ADM_HIST_ID -- 관리자기록식별번호
		);

-- 업체
CREATE TABLE VEN (
	VEN_ID                   INTEGER      NOT NULL COMMENT '업체식별번호', -- 업체식별번호
	VEN_TP_CD                VARCHAR(100) NOT NULL COMMENT '업체유형코드', -- 업체유형코드
	ETR_VEN_CL_CD            VARCHAR(100) NULL     COMMENT '입점업체구분코드', -- 입점업체구분코드
	VEN_STAT_CD              VARCHAR(100) NOT NULL COMMENT '업체상태코드', -- 업체상태코드
	VEN_CD                   VARCHAR(20)  NOT NULL COMMENT '업체코드', -- 업체코드
	VEN_NM                   VARCHAR(200) NOT NULL COMMENT '업체명', -- 업체명
	REP_NM                   VARCHAR(200) NULL     COMMENT '대표자명', -- 대표자명
	TEL_NO                   VARCHAR(30)  NULL     COMMENT '전화번호', -- 전화번호
	CP_NO                    VARCHAR(30)  NULL     COMMENT '휴대폰번호', -- 휴대폰번호
	FAX_NO                   VARCHAR(30)  NULL     COMMENT '팩스번호', -- 팩스번호
	EMAIL                    VARCHAR(40)  NULL     COMMENT '이메일', -- 이메일
	ZIPCD                    VARCHAR(10)  NULL     COMMENT '우편번호', -- 우편번호
	ADDR                     VARCHAR(255) NULL     COMMENT '주소', -- 주소
	BIZ_CL_CD                VARCHAR(100) NULL     COMMENT '사업자구분코드', -- 사업자구분코드
	BIZ_NO                   VARCHAR(20)  NULL     COMMENT '사업자번호', -- 사업자번호
	INC_NO                   VARCHAR(14)  NULL     COMMENT '법인번호', -- 법인번호
	BIZ_COND                 VARCHAR(200) NULL     COMMENT '업태', -- 업태
	BIZ_TP                   VARCHAR(200) NULL     COMMENT '업종', -- 업종
	TAX_CL_CD                VARCHAR(100) NULL     COMMENT '과세구분코드', -- 과세구분코드
	AFF_VEN_CD_USE_PD_LIM_YN VARCHAR(1)   NULL     COMMENT '제휴업체코드사용기간한정여부', -- 제휴업체코드사용기간한정여부
	AFF_VEN_CD_USE_PD_ST_DAY VARCHAR(8)   NULL     COMMENT '제휴업체코드사용기간시작일', -- 제휴업체코드사용기간시작일
	AFF_VEN_CD_USE_PD_ED_DAY VARCHAR(8)   NULL     COMMENT '제휴업체코드사용기간종료일', -- 제휴업체코드사용기간종료일
	ETR_DT                   TIMESTAMP    NULL     COMMENT '입점일시', -- 입점일시
	REP_VEN_YN               VARCHAR(1)   NOT NULL COMMENT '대표업체여부', -- 대표업체여부
	REG_DT                   TIMESTAMP    NOT NULL COMMENT '등록일시', -- 등록일시
	REG_ID                   VARCHAR(20)  NULL     COMMENT '등록아이디', -- 등록아이디
	MOD_DT                   TIMESTAMP    NOT NULL COMMENT '수정일시', -- 수정일시
	MOD_ID                   VARCHAR(20)  NULL     COMMENT '수정아이디', -- 수정아이디
	USE_YN                   VARCHAR(1)   NOT NULL COMMENT '사용여부' -- 사용여부
)
COMMENT '업체';

-- 업체
ALTER TABLE VEN
	ADD CONSTRAINT PK_VEN -- 업체 Primary key
		PRIMARY KEY (
			VEN_ID -- 업체식별번호
		);

-- 업체 유니크 인덱스
CREATE UNIQUE INDEX UIX_VEN
	ON VEN ( -- 업체
		VEN_CD ASC -- 업체코드
	);

-- 관리자역할메뉴매핑
CREATE TABLE ADM_ROLE_MENU_MAP (
	ADM_ROLE_ID      INTEGER     NOT NULL COMMENT '관리자역할식별번호', -- 관리자역할식별번호
	ADM_SITE_MENU_ID INTEGER     NOT NULL COMMENT '관리사이트메뉴식별번호', -- 관리사이트메뉴식별번호
	ATHR_REG         VARCHAR(1)  NOT NULL COMMENT '권한등록', -- 권한등록
	ATHR_READ        VARCHAR(1)  NOT NULL COMMENT '권한조회', -- 권한조회
	ATHR_MOD         VARCHAR(1)  NOT NULL COMMENT '권한수정', -- 권한수정
	ATHR_DEL         VARCHAR(1)  NOT NULL COMMENT '권한삭제', -- 권한삭제
	ATHR_EXCEL       VARCHAR(1)  NULL     COMMENT '권한엑셀', -- 권한엑셀
	REG_DT           TIMESTAMP   NOT NULL COMMENT '등록일시', -- 등록일시
	REG_ID           VARCHAR(20) NULL     COMMENT '등록아이디' -- 등록아이디
)
COMMENT '관리자역할메뉴매핑';

-- 관리자역할메뉴매핑
ALTER TABLE ADM_ROLE_MENU_MAP
	ADD CONSTRAINT PK_ADM_ROLE_MENU_MAP -- 관리자역할메뉴매핑 기본키
		PRIMARY KEY (
			ADM_ROLE_ID,      -- 관리자역할식별번호
			ADM_SITE_MENU_ID  -- 관리사이트메뉴식별번호
		);

-- 관리사이트메뉴
CREATE TABLE ADM_SITE_MENU (
	ADM_SITE_MENU_ID     INTEGER      NOT NULL COMMENT '관리사이트메뉴식별번호', -- 관리사이트메뉴식별번호
	REF_ADM_SITE_MENU_ID INTEGER      NULL     COMMENT '참조관리사이트메뉴식별번호', -- 참조관리사이트메뉴식별번호
	MENU_NM              VARCHAR(200) NOT NULL COMMENT '메뉴명', -- 메뉴명
	URL_ADDR             VARCHAR(500) NULL     COMMENT 'URL주소', -- URL주소
	SORD                 NUMERIC(5)    NULL     COMMENT '정렬순서', -- 정렬순서
	DP_YN                VARCHAR(1)   NULL     COMMENT '전시여부', -- 전시여부
	REG_DT               TIMESTAMP    NOT NULL COMMENT '등록일시', -- 등록일시
	REG_ID               VARCHAR(20)  NULL     COMMENT '등록아이디', -- 등록아이디
	MOD_DT               TIMESTAMP    NOT NULL COMMENT '수정일시', -- 수정일시
	MOD_ID               VARCHAR(20)  NULL     COMMENT '수정아이디', -- 수정아이디
	USE_YN               VARCHAR(1)   NOT NULL COMMENT '사용여부' -- 사용여부
)
COMMENT '관리사이트메뉴';

-- 관리사이트메뉴
ALTER TABLE ADM_SITE_MENU
	ADD CONSTRAINT PK_ADM_SITE_MENU -- 관리사이트메뉴 기본키
		PRIMARY KEY (
			ADM_SITE_MENU_ID -- 관리사이트메뉴식별번호
		);

-- 관리자
CREATE TABLE ADM (
	ADM_ID           VARCHAR(20)       NOT NULL COMMENT '관리자식별번호', -- 관리자식별번호
	VEN_ID           INTEGER           NULL     COMMENT '업체식별번호', -- 업체식별번호
	ADM_TP_CD        VARCHAR(100)      NOT NULL COMMENT '관리자유형코드', -- 관리자유형코드
	ADM_STAT_CD      VARCHAR(100)      NOT NULL COMMENT '관리자상태코드', -- 관리자상태코드
	ADM_LGN_ID       VARCHAR(255)      NULL     COMMENT '관리자로그인아이디', -- 관리자로그인아이디
	PW               BINARY(256)       NULL     COMMENT '비밀번호', -- 비밀번호
	ADM_NM           VARCHAR(200)      NOT NULL COMMENT '관리자명', -- 관리자명
	EMAIL            VARCHAR(40)       NULL     COMMENT '이메일', -- 이메일
	CP_CARR_CD       VARCHAR(100)      NULL     COMMENT '휴대폰통신사코드', -- 휴대폰통신사코드
	CP_NO            VARCHAR(30)       NULL     COMMENT '휴대폰번호', -- 휴대폰번호
	ADM_SITE_CD      VARCHAR(100)      NOT NULL DEFAULT 'admin.site.mall' COMMENT '관리자사이트코드', -- 관리자사이트코드
	ADM_ROLE_ID      INTEGER           NULL     COMMENT '관리자역할식별번호', -- 관리자역할식별번호
	APRV_GRD_CD      VARCHAR(100)      NULL     COMMENT '승인등급코드', -- 승인등급코드
	SUP_DT           DATE              NULL     COMMENT '가입일시', -- 가입일시
	PW_MOD_DT        DATE              NULL     COMMENT '비밀번호수정일시', -- 비밀번호수정일시
	LAST_LGN_DT      DATE              NULL     COMMENT '최근로그인일시', -- 최근로그인일시
	LAST_INFO_MOD_DT DATE              NULL     COMMENT '최근정보수정일시', -- 최근정보수정일시
	LGN_RTRY_CNT     NUMERIC(9)         NOT NULL DEFAULT 0 COMMENT '로그인재시도횟수', -- 로그인재시도횟수
	REG_DT           TIMESTAMP         NOT NULL COMMENT '등록일시', -- 등록일시
	REG_ID           VARCHAR(20)       NULL     COMMENT '등록아이디', -- 등록아이디
	MOD_DT           TIMESTAMP         NOT NULL COMMENT '수정일시', -- 수정일시
	MOD_ID           VARCHAR(20)       NULL     COMMENT '수정아이디', -- 수정아이디
	USE_YN           VARCHAR(1)        NOT NULL COMMENT '사용여부' -- 사용여부
)
COMMENT '관리자';

-- 관리자
ALTER TABLE ADM
	ADD CONSTRAINT PK_ADM -- 관리자 기본키
		PRIMARY KEY (
			ADM_ID -- 관리자식별번호
		);

-- 관리자 인덱스
CREATE INDEX IX_ADM
	ON ADM( -- 관리자
		ADM_LGN_ID ASC -- 관리자로그인아이디
	);

-- 회원본인인증
CREATE TABLE MBR_IDVRF (
	MBR_IDVRF_ID INTEGER      NOT NULL COMMENT '회원본인인증식별번호', -- 회원본인인증식별번호
	MBR_ID       VARCHAR(20)  NULL     COMMENT '회원식별번호', -- 회원식별번호
	IDVRF_TP_CD  VARCHAR(100) NOT NULL COMMENT '본인인증유형코드', -- 본인인증유형코드
	LNM_NM       VARCHAR(500) NULL     COMMENT '성명', -- 성명
	BRTH_YMD     VARCHAR(8)   NULL     COMMENT '출생년월일', -- 출생년월일
	GNDR_CL      VARCHAR(100) NULL     COMMENT '성별구분', -- 성별구분
	LFRNR_CL     VARCHAR(100) NULL     COMMENT '내외국인구분', -- 내외국인구분
	REQ_NO       VARCHAR(100) NULL     COMMENT '요청번호', -- 요청번호
	CP_CARR      VARCHAR(3)   NULL     COMMENT '휴대폰통신사', -- 휴대폰통신사
	CP_NO        VARCHAR(200) NULL     COMMENT '휴대폰번호', -- 휴대폰번호
	AUTH_DT      TIMESTAMP    NOT NULL COMMENT '인증일시', -- 인증일시
	CI_VAL       VARCHAR(500) NULL     COMMENT '연계정보값', -- 연계정보값
	DI_VAL       VARCHAR(500) NULL     COMMENT '중복정보값', -- 중복정보값
	RSLT_CD_VAL  VARCHAR(4)   NULL     COMMENT '결과코드값', -- 결과코드값
	RSLT_MSG     VARCHAR(500) NULL     COMMENT '결과메시지', -- 결과메시지
	ADD_VAR      VARCHAR(500) NULL     COMMENT '추가파라미터', -- 추가파라미터
	REG_DT       TIMESTAMP    NOT NULL COMMENT '등록일시', -- 등록일시
	REG_ID       VARCHAR(20)  NULL     COMMENT '등록아이디' -- 등록아이디
)
COMMENT '회원본인인증';

-- 회원본인인증
ALTER TABLE MBR_IDVRF
	ADD CONSTRAINT PK_MBR_IDVRF -- 회원본인인증 기본키
		PRIMARY KEY (
			MBR_IDVRF_ID -- 회원본인인증식별번호
		);

-- 회원본인인증 인덱스
CREATE INDEX IX_MBR_IDVRF
	ON MBR_IDVRF( -- 회원본인인증
		DI_VAL ASC -- 중복정보값
	);

-- 회원
CREATE TABLE MBR (
	MBR_ID           VARCHAR(20)       NOT NULL COMMENT '회원식별번호', -- 회원식별번호
	MBR_STAT_CD      VARCHAR(100)      NOT NULL COMMENT '회원상태코드', -- 회원상태코드
	MBR_GRD_CD       VARCHAR(100)      NOT NULL COMMENT '회원등급코드', -- 회원등급코드
	MBR_LGN_ID       VARCHAR(255)      NOT NULL COMMENT '회원로그인아이디', -- 회원로그인아이디
	PW               BINARY(255)       NULL     COMMENT '비밀번호', -- 비밀번호
	MBR_NM           VARCHAR(500)      NULL     COMMENT '회원명', -- 회원명
	EMAIL            VARCHAR(500)      NULL     COMMENT '이메일', -- 이메일
	BRTH_YMD         VARCHAR(8)        NULL     COMMENT '출생년월일', -- 출생년월일
	GNDR_CD          VARCHAR(100)      NULL     COMMENT '성별코드', -- 성별코드
	TEL_NO           VARCHAR(200)      NULL     COMMENT '전화번호', -- 전화번호
	CP_CARR_CD       VARCHAR(100)      NULL     COMMENT '휴대폰통신사코드', -- 휴대폰통신사코드
	CP_NO            VARCHAR(200)      NULL     COMMENT '휴대폰번호', -- 휴대폰번호
	IDVRF_YN         VARCHAR(1)        NULL     COMMENT '본인인증여부', -- 본인인증여부
	IDVRF_TP_CD      VARCHAR(100)      NULL     COMMENT '본인인증유형코드', -- 본인인증유형코드
	IDVRF_DT         TIMESTAMP         NULL     COMMENT '본인인증일시', -- 본인인증일시
	CI_VAL           VARCHAR(500)      NULL     COMMENT '연계정보값', -- 연계정보값
	DI_VAL           VARCHAR(500)      NULL     COMMENT '중복정보값', -- 중복정보값
	BAD_MBR_YN       VARCHAR(1)        NULL     COMMENT '블랙회원여부', -- 블랙회원여부
	RCMNDE_CD        VARCHAR(100)      NULL     COMMENT '피추천인코드', -- 피추천인코드
	SUP_PATH_CL_CD   VARCHAR(100)      NULL     COMMENT '가입경로구분코드', -- 가입경로구분코드
	SUP_PATH_CD      VARCHAR(100)      NULL     COMMENT '가입경로코드', -- 가입경로코드
	SUP_PATH_NM      VARCHAR(200)      NULL     COMMENT '가입경로명', -- 가입경로명
	SUP_DT           DATE              NULL     COMMENT '가입일시', -- 가입일시
	MBR_GRD_CHG_DT   DATE              NULL     COMMENT '회원등급변경일시', -- 회원등급변경일시
	PW_MOD_DT        DATE              NULL     COMMENT '비밀번호수정일시', -- 비밀번호수정일시
	PW_MOD_GDE_DT    DATE              NULL     COMMENT '비밀번호수정안내일시', -- 비밀번호수정안내일시
	LAST_LGN_DT      DATE              NULL     COMMENT '최근로그인일시', -- 최근로그인일시
	LAST_INFO_MOD_DT DATE              NULL     COMMENT '최근정보수정일시', -- 최근정보수정일시
	LGN_RTRY_CNT     NUMERIC(9)         NOT NULL DEFAULT 0 COMMENT '로그인재시도횟수', -- 로그인재시도횟수
	ADM_ID           VARCHAR(20)       NULL     COMMENT '관리자식별번호', -- 관리자식별번호
	REG_DT           TIMESTAMP         NOT NULL COMMENT '등록일시', -- 등록일시
	REG_ID           VARCHAR(20)       NULL     COMMENT '등록아이디', -- 등록아이디
	MOD_DT           TIMESTAMP         NOT NULL COMMENT '수정일시', -- 수정일시
	MOD_ID           VARCHAR(20)       NULL     COMMENT '수정아이디', -- 수정아이디
	USE_YN           VARCHAR(1)        NOT NULL COMMENT '사용여부' -- 사용여부
)
COMMENT '회원';

-- 회원
ALTER TABLE MBR
	ADD CONSTRAINT PK_MBR -- 회원 기본키
		PRIMARY KEY (
			MBR_ID -- 회원식별번호
		);

-- 회원 유니크 인덱스
CREATE UNIQUE INDEX UK_MBR
	ON MBR ( -- 회원
		MBR_LGN_ID ASC -- 회원로그인아이디
	);

-- 회원 인덱스
CREATE INDEX IX_MBR
	ON MBR( -- 회원
		MBR_NM ASC -- 회원명
	);

-- 회원변경기록
CREATE TABLE MBR_CHIST (
	MBR_CHIST_ID     INTEGER       NOT NULL COMMENT '회원변경기록식별번호', -- 회원변경기록식별번호
	MBR_ID           VARCHAR(20)   NOT NULL COMMENT '회원식별번호', -- 회원식별번호
	MBR_GRD_CD       VARCHAR(100)  NOT NULL COMMENT '회원등급코드', -- 회원등급코드
	MBR_NM           VARCHAR(500)  NULL     COMMENT '회원명', -- 회원명
	CP_NO            VARCHAR(200)  NULL     COMMENT '휴대폰번호', -- 휴대폰번호
	EMAIL            VARCHAR(500)  NULL     COMMENT '이메일', -- 이메일
	BAD_MBR_YN       VARCHAR(1)    NULL     COMMENT '블랙회원여부', -- 블랙회원여부
	BAD_MBR_RSN      VARCHAR(1000) NULL     COMMENT '블랙회원사유', -- 블랙회원사유
	MKT_RCV_AGR_YN_1 VARCHAR(1)    NULL     COMMENT '마케팅수신동의여부_1', -- 마케팅수신동의여부_1
	MKT_RCV_AGR_YN_2 VARCHAR(1)    NULL     COMMENT '마케팅수신동의여부_2', -- 마케팅수신동의여부_2
	REG_DT           TIMESTAMP     NOT NULL COMMENT '등록일시', -- 등록일시
	REG_ID           VARCHAR(20)   NULL     COMMENT '등록아이디' -- 등록아이디
)
COMMENT '회원변경기록';

-- 회원변경기록
ALTER TABLE MBR_CHIST
	ADD CONSTRAINT PK_MBR_CHIST -- 회원변경기록 기본키
		PRIMARY KEY (
			MBR_CHIST_ID -- 회원변경기록식별번호
		);

-- 회원유형
CREATE TABLE MBR_TP (
	MBR_ID      VARCHAR(20)  NOT NULL COMMENT '회원식별번호', -- 회원식별번호
	MBR_TP_CD   VARCHAR(100) NOT NULL COMMENT '회원유형코드', -- 회원유형코드
	AUTH_REF_ID INTEGER      NULL     COMMENT '인증참조식별번호', -- 인증참조식별번호
	AUTH_DT     DATE         NULL     COMMENT '인증일시', -- 인증일시
	ADM_ID      VARCHAR(20)  NULL     COMMENT '관리자식별번호', -- 관리자식별번호
	REG_DT      TIMESTAMP    NOT NULL COMMENT '등록일시', -- 등록일시
	REG_ID      VARCHAR(20)  NULL     COMMENT '등록아이디', -- 등록아이디
	MOD_DT      TIMESTAMP    NOT NULL COMMENT '수정일시', -- 수정일시
	MOD_ID      VARCHAR(20)  NULL     COMMENT '수정아이디' -- 수정아이디
)
COMMENT '회원유형';

-- 회원유형
ALTER TABLE MBR_TP
	ADD CONSTRAINT PK_MBR_TP -- 회원유형 기본키
		PRIMARY KEY (
			MBR_ID,    -- 회원식별번호
			MBR_TP_CD  -- 회원유형코드
		);

-- 회원인증토큰
CREATE TABLE MBR_AUTH_TKN (
	MBR_ID       VARCHAR(20)  NOT NULL COMMENT '회원식별번호', -- 회원식별번호
	MBR_AUTH_TKN VARCHAR(250) NOT NULL COMMENT '회원인증토큰', -- 회원인증토큰
	XPR_DT       DATE         NULL     COMMENT '만료일시', -- 만료일시
	AUTH_USE_YN  VARCHAR(1)   NULL     COMMENT '인증사용여부', -- 인증사용여부
	REG_DT       TIMESTAMP    NOT NULL COMMENT '등록일시', -- 등록일시
	REG_ID       VARCHAR(20)  NULL     COMMENT '등록아이디', -- 등록아이디
	MOD_DT       TIMESTAMP    NOT NULL COMMENT '수정일시', -- 수정일시
	MOD_ID       VARCHAR(20)  NULL     COMMENT '수정아이디', -- 수정아이디
	USE_YN       VARCHAR(1)   NOT NULL COMMENT '사용여부' -- 사용여부
)
COMMENT '회원인증토큰';

-- 회원인증토큰
ALTER TABLE MBR_AUTH_TKN
	ADD CONSTRAINT PK_MBR_AUTH_TKN -- 회원인증토큰 기본키
		PRIMARY KEY (
			MBR_ID,       -- 회원식별번호
			MBR_AUTH_TKN  -- 회원인증토큰
		);

-- 회원관리자메모
CREATE TABLE MBR_ADM_MEMO (
	MBR_ADM_MEMO_ID INTEGER       NOT NULL COMMENT '회원관리자메모식별번호', -- 회원관리자메모식별번호
	MBR_ID          VARCHAR(20)   NOT NULL COMMENT '회원식별번호', -- 회원식별번호
	ADM_ID          VARCHAR(20)   NOT NULL COMMENT '관리자식별번호', -- 관리자식별번호
	ADM_MEMO_TP_CD  VARCHAR(100)  NOT NULL COMMENT '관리자메모유형코드', -- 관리자메모유형코드
	CONT            VARCHAR(1000) NULL     COMMENT '내용', -- 내용
	REG_DT          TIMESTAMP     NOT NULL COMMENT '등록일시', -- 등록일시
	REG_ID          VARCHAR(20)   NULL     COMMENT '등록아이디', -- 등록아이디
	MOD_DT          TIMESTAMP     NOT NULL COMMENT '수정일시', -- 수정일시
	MOD_ID          VARCHAR(20)   NULL     COMMENT '수정아이디' -- 수정아이디
)
COMMENT '회원관리자메모';

-- 회원관리자메모
ALTER TABLE MBR_ADM_MEMO
	ADD CONSTRAINT PK_MBR_ADM_MEMO -- 회원관리자메모 기본키
		PRIMARY KEY (
			MBR_ADM_MEMO_ID -- 회원관리자메모식별번호
		);

-- 회원로그인토큰
CREATE TABLE MBR_LGN_TKN (
	MBR_LGN_TKN VARCHAR(250) NOT NULL COMMENT '회원로그인토큰', -- 회원로그인토큰
	MBR_ID      VARCHAR(20)  NOT NULL COMMENT '회원식별번호', -- 회원식별번호
	XPR_DT      DATE         NULL     COMMENT '만료일시', -- 만료일시
	REG_DT      TIMESTAMP    NULL     COMMENT '등록일시' -- 등록일시
)
COMMENT '회원로그인토큰';

-- 회원로그인토큰
ALTER TABLE MBR_LGN_TKN
	ADD CONSTRAINT PK_MBR_LGN_TKN -- 회원로그인토큰 기본키
		PRIMARY KEY (
			MBR_LGN_TKN -- 회원로그인토큰
		);

-- 회원탈퇴
CREATE TABLE MBR_CLOSE (
	MBR_CLOSE_ID  INTEGER      NOT NULL COMMENT '회원탈퇴식별번호', -- 회원탈퇴식별번호
	MBR_ID        VARCHAR(20)  NULL     COMMENT '회원식별번호', -- 회원식별번호
	MBR_LGN_ID    VARCHAR(255) NOT NULL COMMENT '회원로그인아이디', -- 회원로그인아이디
	CLOSE_PATH_CD VARCHAR(100) NOT NULL COMMENT '탈퇴경로코드', -- 탈퇴경로코드
	CLOSE_AGR_YN  VARCHAR(1)   NULL     COMMENT '탈퇴동의여부', -- 탈퇴동의여부
	CLOSE_AGR_DT  DATE         NULL     COMMENT '탈퇴동의일시', -- 탈퇴동의일시
	CLOSE_DT      DATE         NULL     COMMENT '탈퇴일시', -- 탈퇴일시
	CLOSE_IP_ADDR VARCHAR(200) NULL     COMMENT '탈퇴아이피주소', -- 탈퇴아이피주소
	REG_DT        TIMESTAMP    NULL     COMMENT '등록일시', -- 등록일시
	REG_ID        VARCHAR(20)  NULL     COMMENT '등록아이디' -- 등록아이디
)
COMMENT '회원탈퇴';

-- 회원탈퇴
ALTER TABLE MBR_CLOSE
	ADD CONSTRAINT PK_MBR_CLOSE -- 회원탈퇴 기본키
		PRIMARY KEY (
			MBR_CLOSE_ID -- 회원탈퇴식별번호
		);

-- 회원로그인기록
CREATE TABLE MBR_LGN_HIST (
	MBR_LGN_HIST_ID INTEGER      NOT NULL COMMENT '회원로그인기록식별번호', -- 회원로그인기록식별번호
	MBR_ID          VARCHAR(20)  NOT NULL COMMENT '회원식별번호', -- 회원식별번호
	LGN_DT          DATE         NOT NULL COMMENT '로그인일시', -- 로그인일시
	IP_ADDR         VARCHAR(200) NOT NULL COMMENT '아이피주소', -- 아이피주소
	USER_ENV_CD     VARCHAR(100) NOT NULL COMMENT '사용자환경코드', -- 사용자환경코드
	UA_VAL          VARCHAR(300) NULL     COMMENT '사용자에이전트값' -- 사용자에이전트값
)
COMMENT '회원로그인기록';

-- 회원로그인기록
ALTER TABLE MBR_LGN_HIST
	ADD CONSTRAINT PK_MBR_LGN_HIST -- 회원로그인기록 기본키
		PRIMARY KEY (
			MBR_LGN_HIST_ID -- 회원로그인기록식별번호
		);

-- 회원쿠폰
CREATE TABLE MBR_CPN (
	MBR_CPN_ID        INTEGER      NOT NULL COMMENT '회원쿠폰식별번호', -- 회원쿠폰식별번호
	MBR_ID            VARCHAR(20)  NOT NULL COMMENT '회원식별번호', -- 회원식별번호
	CPN_ID            INTEGER      NOT NULL COMMENT '쿠폰식별번호', -- 쿠폰식별번호
	MBR_CPN_NO        VARCHAR(20)  NOT NULL COMMENT '회원쿠폰번호', -- 회원쿠폰번호
	CPN_ISU_METH_CD   VARCHAR(100) NOT NULL COMMENT '쿠폰발급방식코드', -- 쿠폰발급방식코드
	CPN_ISU_RSN_CONT  VARCHAR(500) NULL     COMMENT '쿠폰발급사유내용', -- 쿠폰발급사유내용
	CPN_ISU_DT        DATE         NOT NULL COMMENT '쿠폰발급일시', -- 쿠폰발급일시
	CPN_USE_VLD_ST_DT DATE         NOT NULL COMMENT '쿠폰사용유효시작일시', -- 쿠폰사용유효시작일시
	CPN_USE_VLD_ED_DT DATE         NOT NULL COMMENT '쿠폰사용유효종료일시', -- 쿠폰사용유효종료일시
	CPN_USE_YN        VARCHAR(1)   NOT NULL COMMENT '쿠폰사용여부', -- 쿠폰사용여부
	CPN_USE_DT        DATE         NULL     COMMENT '쿠폰사용일시', -- 쿠폰사용일시
	REG_DT            TIMESTAMP    NOT NULL COMMENT '등록일시', -- 등록일시
	REG_ID            VARCHAR(20)  NULL     COMMENT '등록아이디', -- 등록아이디
	MOD_DT            TIMESTAMP    NOT NULL COMMENT '수정일시', -- 수정일시
	MOD_ID            VARCHAR(20)  NULL     COMMENT '수정아이디', -- 수정아이디
	USE_YN            VARCHAR(1)   NOT NULL COMMENT '사용여부' -- 사용여부
)
COMMENT '회원쿠폰';

-- 회원쿠폰
ALTER TABLE MBR_CPN
	ADD CONSTRAINT PK_MBR_CPN -- 회원쿠폰 기본키
		PRIMARY KEY (
			MBR_CPN_ID -- 회원쿠폰식별번호
		);

-- 회원쿠폰 인덱스
CREATE INDEX IX_MBR_CPN
	ON MBR_CPN( -- 회원쿠폰
		MBR_ID ASC -- 회원식별번호
	);

-- 회원탈퇴사유
CREATE TABLE MBR_CLOSE_RSN (
	MBR_CLOSE_RSN_ID INTEGER      NOT NULL COMMENT '회원탈퇴사유식별번호', -- 회원탈퇴사유식별번호
	MBR_CLOSE_ID     INTEGER      NOT NULL COMMENT '회원탈퇴식별번호', -- 회원탈퇴식별번호
	CLOSE_RSN_CD     VARCHAR(100) NOT NULL COMMENT '탈퇴사유코드', -- 탈퇴사유코드
	CLOSE_RSN_CONT   VARCHAR(1000)NULL     COMMENT '탈퇴사유내용' -- 탈퇴사유내용
)
COMMENT '회원탈퇴사유';

-- 회원탈퇴사유
ALTER TABLE MBR_CLOSE_RSN
	ADD CONSTRAINT PK_MBR_CLOSE_RSN -- 회원탈퇴사유 기본키
		PRIMARY KEY (
			MBR_CLOSE_RSN_ID -- 회원탈퇴사유식별번호
		);

-- 회원동의
CREATE TABLE MBR_AGR (
	MBR_ID           VARCHAR(20)  NOT NULL COMMENT '회원식별번호', -- 회원식별번호
	AGR_CD           VARCHAR(100) NOT NULL COMMENT '동의코드', -- 동의코드
	AGR_YN           VARCHAR(1)   NOT NULL COMMENT '동의여부', -- 동의여부
	AGR_CHG_DT       DATE         NOT NULL COMMENT '동의변경일시', -- 동의변경일시
	RETNT_USE_PD_NOY NUMERIC(5)    NULL     COMMENT '보유이용기간년수', -- 보유이용기간년수
	REG_DT           TIMESTAMP    NOT NULL COMMENT '등록일시', -- 등록일시
	REG_ID           VARCHAR(20)  NULL     COMMENT '등록아이디', -- 등록아이디
	MOD_DT           TIMESTAMP    NOT NULL COMMENT '수정일시', -- 수정일시
	MOD_ID           VARCHAR(20)  NULL     COMMENT '수정아이디' -- 수정아이디
)
COMMENT '회원동의';

-- 회원동의
ALTER TABLE MBR_AGR
	ADD CONSTRAINT PK_MBR_AGR -- 회원동의 기본키
		PRIMARY KEY (
			MBR_ID, -- 회원식별번호
			AGR_CD  -- 동의코드
		);

-- 회원기록
CREATE TABLE MBR_HIST (
	MBR_HIST_ID    INTEGER       NOT NULL COMMENT '회원기록식별번호', -- 회원기록식별번호
	MBR_ID         VARCHAR(20)   NOT NULL COMMENT '회원식별번호', -- 회원식별번호
	ADM_ID         VARCHAR(20)   NULL     COMMENT '관리자식별번호', -- 관리자식별번호
	MBR_HIST_TP_CD VARCHAR(100)  NOT NULL COMMENT '회원기록유형코드', -- 회원기록유형코드
	MBR_HIST_DT    DATE          NULL     COMMENT '회원기록일시', -- 회원기록일시
	CONT           VARCHAR(1000) NULL     COMMENT '내용', -- 내용
	REG_DT         TIMESTAMP     NOT NULL COMMENT '등록일시', -- 등록일시
	REG_ID         VARCHAR(20)   NULL     COMMENT '등록아이디' -- 등록아이디
)
COMMENT '회원기록';

-- 회원기록
ALTER TABLE MBR_HIST
	ADD CONSTRAINT PK_MBR_HIST -- 회원기록 기본키
		PRIMARY KEY (
			MBR_HIST_ID -- 회원기록식별번호
		);

-- 상품평
CREATE TABLE ITEM_CMT (
	ITEM_CMT_ID    INTEGER      NOT NULL COMMENT '상품평식별번호', -- 상품평식별번호
	ITEM_ID        INTEGER      NOT NULL COMMENT '상품식별번호', -- 상품식별번호
	MBR_ID         VARCHAR(20)  NOT NULL COMMENT '회원식별번호', -- 회원식별번호
	ORD_ITEM_ID    INTEGER      NULL     COMMENT '주문상품식별번호', -- 주문상품식별번호
	ITEM_CMT_TP_CD VARCHAR(100) NOT NULL COMMENT '상품평유형코드', -- 상품평유형코드
	TIT            VARCHAR(200) NULL     COMMENT '제목', -- 제목
	CONT           VARCHAR(1000)NOT NULL COMMENT '내용', -- 내용
	STAR_PT        NUMERIC(2,1) NULL     COMMENT '별점수', -- 별점수
	REG_ENV_CD     VARCHAR(100) NULL     COMMENT '등록환경코드', -- 등록환경코드
	DP_YN          VARCHAR(1)   NULL     COMMENT '전시여부', -- 전시여부
	ATCH_GID       INTEGER      NULL     COMMENT '첨부그룹식별번호', -- 첨부그룹식별번호
	REG_DT         TIMESTAMP    NOT NULL COMMENT '등록일시', -- 등록일시
	REG_ID         VARCHAR(20)  NULL     COMMENT '등록아이디', -- 등록아이디
	MOD_DT         TIMESTAMP    NOT NULL COMMENT '수정일시', -- 수정일시
	MOD_ID         VARCHAR(20)  NULL     COMMENT '수정아이디', -- 수정아이디
	USE_YN         VARCHAR(1)   NOT NULL COMMENT '사용여부' -- 사용여부
)
COMMENT '상품평';

-- 상품평
ALTER TABLE ITEM_CMT
	ADD CONSTRAINT PK_ITEM_CMT -- 상품평 기본키2
		PRIMARY KEY (
			ITEM_CMT_ID -- 상품평식별번호
		);

-- 상품평 인덱스
CREATE INDEX IX_ITEM_CMT
	ON ITEM_CMT( -- 상품평
		MBR_ID ASC -- 회원식별번호
	);

-- 상품
CREATE TABLE ITEM (
	ITEM_ID                     INTEGER       NOT NULL COMMENT '상품식별번호', -- 상품식별번호
	VEN_ID                      INTEGER       NOT NULL COMMENT '업체식별번호', -- 업체식별번호
	ITEM_TP_CD                  VARCHAR(100)  NOT NULL COMMENT '상품유형코드', -- 상품유형코드
	ITEM_STAT_CD                VARCHAR(100)  NOT NULL COMMENT '상품상태코드', -- 상품상태코드
	ITEM_APRV_STAT_CD           VARCHAR(100)  NOT NULL COMMENT '상품승인상태코드', -- 상품승인상태코드
	ITEM_CD                     VARCHAR(200)  NOT NULL COMMENT '상품코드', -- 상품코드
	ITEM_NM                     VARCHAR(300)  NOT NULL COMMENT '상품명', -- 상품명
	ITEM_SUB_NM                 VARCHAR(500)  NULL     COMMENT '상품부명', -- 상품부명
	MANU                        VARCHAR(200)  NULL     COMMENT '제조사', -- 제조사
	DP_BRND_ID                  INTEGER       NULL     DEFAULT 0 COMMENT '전시브랜드식별번호', -- 전시브랜드식별번호
	ITEM_CMT_REG_YN             VARCHAR(1)    NOT NULL COMMENT '상품평등록여부', -- 상품평등록여부
	INQ_REG_YN                  VARCHAR(1)    NOT NULL COMMENT '문의등록여부', -- 문의등록여부
	OPT_STT_YN                  VARCHAR(1)    NOT NULL COMMENT '옵션설정여부', -- 옵션설정여부
	FRGT_YN                     VARCHAR(1)    NOT NULL COMMENT '사은품여부', -- 사은품여부
	DP_YN                       VARCHAR(1)    NOT NULL COMMENT '전시여부', -- 전시여부
	DP_ENV_CD                   VARCHAR(100)  NOT NULL COMMENT '전시환경코드', -- 전시환경코드
	CSTMD_YN                    VARCHAR(1)    NULL     COMMENT '주문제작여부', -- 주문제작여부
	TAX_CL_CD                   VARCHAR(100)  NOT NULL COMMENT '과세구분코드', -- 과세구분코드
	SELL_UNIT_QTY               NUMERIC(9)     NOT NULL COMMENT '판매단위수량', -- 판매단위수량
	SELL_PERD_LIM_YN            VARCHAR(1)    NOT NULL COMMENT '판매기간한정여부', -- 판매기간한정여부
	SELL_PERD_LIM_ST_DT         DATE          NULL     COMMENT '판매기간한정시작일시', -- 판매기간한정시작일시
	SELL_PERD_LIM_ED_DT         DATE          NULL     COMMENT '판매기간한정종료일시', -- 판매기간한정종료일시
	CPN_USE_PSBL_YN             VARCHAR(1)    NOT NULL COMMENT '쿠폰사용가능여부', -- 쿠폰사용가능여부
	PT_SAVE_TP_CD               VARCHAR(100)  NOT NULL COMMENT '포인트적립유형코드', -- 포인트적립유형코드
	PT_SAVE_METH_CD             VARCHAR(100)  NULL     COMMENT '포인트적립방식코드', -- 포인트적립방식코드
	PT_SAVE_RATE                NUMERIC(5,2)   NULL     COMMENT '포인트적립율', -- 포인트적립율
	PT_SAVE_AMT                 INTEGER       NULL     COMMENT '포인트적립금액', -- 포인트적립금액
	ORD_RES_MAX_QTY             NUMERIC(9)     NULL     COMMENT '주문제한최대수량', -- 주문제한최대수량
	WAHS_NOTI_YN                VARCHAR(1)    NOT NULL COMMENT '입고알림여부', -- 입고알림여부
	ITEM_INFO_NOTI_INPT_METH_CD VARCHAR(100)  NOT NULL COMMENT '상품정보고시입력방법코드', -- 상품정보고시입력방법코드
	ITEM_INFO_NOTI_REG_DT       TIMESTAMP     NULL     COMMENT '상품정보고시등록일시', -- 상품정보고시등록일시
	MEMO                        VARCHAR(4000) NULL     COMMENT '메모', -- 메모
	REG_DT                      TIMESTAMP     NOT NULL COMMENT '등록일시', -- 등록일시
	REG_ID                      VARCHAR(20)   NULL     COMMENT '등록아이디', -- 등록아이디
	MOD_DT                      TIMESTAMP     NOT NULL COMMENT '수정일시', -- 수정일시
	MOD_ID                      VARCHAR(20)   NULL     COMMENT '수정아이디', -- 수정아이디
	USE_YN                      VARCHAR(1)    NOT NULL COMMENT '사용여부' -- 사용여부
)
COMMENT '상품';

-- 상품
ALTER TABLE ITEM
	ADD CONSTRAINT PK_ITEM -- 상품 기본키
		PRIMARY KEY (
			ITEM_ID -- 상품식별번호
		);

-- 상품 유니크 인덱스
CREATE UNIQUE INDEX UIX_ITEM
	ON ITEM ( -- 상품
		ITEM_CD ASC -- 상품코드
	);

-- 상품 인덱스
CREATE INDEX IX_ITEM
	ON ITEM( -- 상품
		ITEM_NM ASC -- 상품명
	);

-- 상품속성
CREATE TABLE ITEM_ATTR (
	ITEM_ID         INTEGER      NOT NULL COMMENT '상품식별번호', -- 상품식별번호
	ITEM_ATTR_TP_CD VARCHAR(100) NOT NULL COMMENT '상품속성유형코드', -- 상품속성유형코드
	REG_DT          TIMESTAMP    NOT NULL COMMENT '등록일시', -- 등록일시
	REG_ID          VARCHAR(20)  NULL     COMMENT '등록아이디', -- 등록아이디
	MOD_DT          TIMESTAMP    NOT NULL COMMENT '수정일시', -- 수정일시
	MOD_ID          VARCHAR(20)  NULL     COMMENT '수정아이디' -- 수정아이디
)
COMMENT '상품속성';

-- 상품속성
ALTER TABLE ITEM_ATTR
	ADD CONSTRAINT PK_ITEM_ATTR -- 상품속성 기본키
		PRIMARY KEY (
			ITEM_ID,         -- 상품식별번호
			ITEM_ATTR_TP_CD  -- 상품속성유형코드
		);

-- 상품속성 인덱스
CREATE INDEX IX_ITEM_ATTR
	ON ITEM_ATTR( -- 상품속성
		ITEM_ATTR_TP_CD ASC -- 상품속성유형코드
	);

-- 상품키워드
CREATE TABLE ITEM_KWD (
	ITEM_ID INTEGER       NOT NULL COMMENT '상품식별번호', -- 상품식별번호
	KWD_VAL VARCHAR(1000) NULL     COMMENT '키워드값', -- 키워드값
	REG_DT  TIMESTAMP     NOT NULL COMMENT '등록일시', -- 등록일시
	REG_ID  VARCHAR(20)   NULL     COMMENT '등록아이디', -- 등록아이디
	MOD_DT  TIMESTAMP     NOT NULL COMMENT '수정일시', -- 수정일시
	MOD_ID  VARCHAR(20)   NULL     COMMENT '수정아이디' -- 수정아이디
)
COMMENT '상품키워드';

-- 상품키워드
ALTER TABLE ITEM_KWD
	ADD CONSTRAINT PK_ITEM_KWD -- 상품키워드 기본키
		PRIMARY KEY (
			ITEM_ID -- 상품식별번호
		);

-- 상품가격
CREATE TABLE ITEM_PRC (
	ITEM_PRC_ID    INTEGER      NOT NULL COMMENT '상품가격식별번호', -- 상품가격식별번호
	ITEM_ID        INTEGER      NOT NULL COMMENT '상품식별번호', -- 상품식별번호
	ITEM_SET_ID    INTEGER      NULL     COMMENT '상품세트식별번호', -- 상품세트식별번호
	DP_CH_ID       INTEGER      NULL     COMMENT '전시채널식별번호', -- 전시채널식별번호
	ITEM_PRC_TP_CD VARCHAR(100) NOT NULL COMMENT '상품가격유형코드', -- 상품가격유형코드
	SPLY_UPRC      INTEGER      NULL     COMMENT '공급단가', -- 공급단가
	SPLY_PRC       INTEGER      NULL     COMMENT '공급가', -- 공급가
	SELL_PRC       INTEGER      NULL     COMMENT '판매가', -- 판매가
	DC_RATE        NUMERIC(7,2)  NULL     COMMENT '할인률', -- 할인률
	COMS_RATE      NUMERIC(7,2)  NULL     COMMENT '수수료률', -- 수수료률
	COMS_AMT       INTEGER      NULL     COMMENT '수수료금액', -- 수수료금액
	APLY_YN        VARCHAR(1)   NOT NULL COMMENT '적용여부', -- 적용여부
	REG_DT         TIMESTAMP    NOT NULL COMMENT '등록일시', -- 등록일시
	REG_ID         VARCHAR(20)  NULL     COMMENT '등록아이디', -- 등록아이디
	MOD_DT         TIMESTAMP    NOT NULL COMMENT '수정일시', -- 수정일시
	MOD_ID         VARCHAR(20)  NULL     COMMENT '수정아이디', -- 수정아이디
	USE_YN         VARCHAR(1)   NOT NULL COMMENT '사용여부' -- 사용여부
)
COMMENT '상품가격';

-- 상품가격
ALTER TABLE ITEM_PRC
	ADD CONSTRAINT PK_ITEM_PRC -- 상품가격 기본키
		PRIMARY KEY (
			ITEM_PRC_ID -- 상품가격식별번호
		);

-- 상품가격 유니크 인덱스
CREATE UNIQUE INDEX UK_ITEM_PRC
	ON ITEM_PRC ( -- 상품가격
		ITEM_ID ASC,        -- 상품식별번호
		ITEM_SET_ID ASC,    -- 상품세트식별번호
		DP_CH_ID ASC,       -- 전시채널식별번호
		ITEM_PRC_TP_CD ASC  -- 상품가격유형코드
	);

-- 상품가격 인덱스
CREATE INDEX IX_ITEM_PRC
	ON ITEM_PRC( -- 상품가격
		ITEM_ID ASC, -- 상품식별번호
		APLY_YN ASC, -- 적용여부
		USE_YN ASC   -- 사용여부
	);

-- 상품판매채널
CREATE TABLE ITEM_SELL_CH (
	ITEM_ID  INTEGER     NOT NULL COMMENT '상품식별번호', -- 상품식별번호
	DP_CH_ID INTEGER     NOT NULL COMMENT '전시채널식별번호', -- 전시채널식별번호
	REG_DT   TIMESTAMP   NOT NULL COMMENT '등록일시', -- 등록일시
	REG_ID   VARCHAR(20) NULL     COMMENT '등록아이디' -- 등록아이디
)
COMMENT '상품판매채널';

-- 상품판매채널
ALTER TABLE ITEM_SELL_CH
	ADD CONSTRAINT PK_ITEM_SELL_CH -- 상품판매채널 기본키
		PRIMARY KEY (
			ITEM_ID,  -- 상품식별번호
			DP_CH_ID  -- 전시채널식별번호
		);

-- 상품사은품매핑
CREATE TABLE ITEM_FRGT_MAP (
	ITEM_FRGT_MAP_ID INTEGER     NOT NULL COMMENT '상품사은품매핑식별번호', -- 상품사은품매핑식별번호
	ITEM_ID          INTEGER     NOT NULL COMMENT '상품식별번호', -- 상품식별번호
	ITEM_FRGT_ID     INTEGER     NOT NULL COMMENT '상품사은품식별번호', -- 상품사은품식별번호
	REG_DT           TIMESTAMP   NOT NULL COMMENT '등록일시', -- 등록일시
	REG_ID           VARCHAR(20) NULL     COMMENT '등록아이디' -- 등록아이디
)
COMMENT '상품사은품매핑';

-- 상품사은품매핑
ALTER TABLE ITEM_FRGT_MAP
	ADD CONSTRAINT PK_ITEM_FRGT_MAP -- 상품사은품매핑 기본키
		PRIMARY KEY (
			ITEM_FRGT_MAP_ID -- 상품사은품매핑식별번호
		);

-- 상품설명
CREATE TABLE ITEM_DESC (
	ITEM_ID   INTEGER      NOT NULL COMMENT '상품식별번호', -- 상품식별번호
	CONT_PC   VARCHAR(1000)NULL     COMMENT '내용_PC', -- 내용_PC
	CONT_MOB  VARCHAR(1000)NULL     COMMENT '내용_모바일', -- 내용_모바일
	VIDEO_URL VARCHAR(500) NULL     COMMENT '동영상URL', -- 동영상URL
	ATCH_GID  INTEGER      NULL     COMMENT '첨부그룹식별번호', -- 첨부그룹식별번호
	DP_YN     VARCHAR(1)   NULL     COMMENT '전시여부', -- 전시여부
	REG_DT    TIMESTAMP    NOT NULL COMMENT '등록일시', -- 등록일시
	REG_ID    VARCHAR(20)  NULL     COMMENT '등록아이디', -- 등록아이디
	MOD_DT    TIMESTAMP    NOT NULL COMMENT '수정일시', -- 수정일시
	MOD_ID    VARCHAR(20)  NULL     COMMENT '수정아이디' -- 수정아이디
)
COMMENT '상품설명';

-- 상품설명
ALTER TABLE ITEM_DESC
	ADD CONSTRAINT PK_ITEM_DESC -- 상품설명 기본키
		PRIMARY KEY (
			ITEM_ID -- 상품식별번호
		);

-- 상품사은품
CREATE TABLE ITEM_FRGT (
	ITEM_FRGT_ID INTEGER      NOT NULL COMMENT '상품사은품식별번호', -- 상품사은품식별번호
	VEN_ID       INTEGER      NOT NULL COMMENT '업체식별번호', -- 업체식별번호
	FRGT_TP_CD   VARCHAR(100) NOT NULL COMMENT '사은품유형코드', -- 사은품유형코드
	ITEM_NM      VARCHAR(300) NOT NULL COMMENT '상품명', -- 상품명
	STK_QTY      NUMERIC(9)    NULL     COMMENT '재고수량', -- 재고수량
	ATCH_GID     INTEGER      NULL     COMMENT '첨부그룹식별번호', -- 첨부그룹식별번호
	REG_DT       TIMESTAMP    NOT NULL COMMENT '등록일시', -- 등록일시
	REG_ID       VARCHAR(20)  NULL     COMMENT '등록아이디', -- 등록아이디
	MOD_DT       TIMESTAMP    NOT NULL COMMENT '수정일시', -- 수정일시
	MOD_ID       VARCHAR(20)  NULL     COMMENT '수정아이디', -- 수정아이디
	USE_YN       VARCHAR(1)   NOT NULL COMMENT '사용여부' -- 사용여부
)
COMMENT '상품사은품';

-- 상품사은품
ALTER TABLE ITEM_FRGT
	ADD CONSTRAINT PK_ITEM_FRGT -- 상품사은품 기본키
		PRIMARY KEY (
			ITEM_FRGT_ID -- 상품사은품식별번호
		);

-- 상품옵션
CREATE TABLE ITEM_OPT (
	ITEM_OPT_ID      INTEGER      NOT NULL COMMENT '상품옵션식별번호', -- 상품옵션식별번호
	ITEM_ID          INTEGER      NOT NULL COMMENT '상품식별번호', -- 상품식별번호
	OPT_SELL_STAT_CD VARCHAR(100) NOT NULL COMMENT '옵션판매상태코드', -- 옵션판매상태코드
	OPT_NM           VARCHAR(200) NOT NULL COMMENT '옵션명', -- 옵션명
	SORD             NUMERIC(5)    NULL     COMMENT '정렬순서', -- 정렬순서
	REG_DT           TIMESTAMP    NOT NULL COMMENT '등록일시', -- 등록일시
	REG_ID           VARCHAR(20)  NULL     COMMENT '등록아이디', -- 등록아이디
	MOD_DT           TIMESTAMP    NOT NULL COMMENT '수정일시', -- 수정일시
	MOD_ID           VARCHAR(20)  NULL     COMMENT '수정아이디', -- 수정아이디
	USE_YN           VARCHAR(1)   NOT NULL COMMENT '사용여부' -- 사용여부
)
COMMENT '상품옵션';

-- 상품옵션
ALTER TABLE ITEM_OPT
	ADD CONSTRAINT PK_ITEM_OPT -- 상품옵션 기본키
		PRIMARY KEY (
			ITEM_OPT_ID -- 상품옵션식별번호
		);

-- 상품세트
CREATE TABLE ITEM_SET (
	ITEM_SET_ID INTEGER     NOT NULL COMMENT '상품세트식별번호', -- 상품세트식별번호
	ITEM_ID     INTEGER     NOT NULL COMMENT '상품식별번호', -- 상품식별번호
	REF_ITEM_ID INTEGER     NOT NULL COMMENT '참조상품식별번호', -- 참조상품식별번호
	REG_DT      TIMESTAMP   NOT NULL COMMENT '등록일시', -- 등록일시
	REG_ID      VARCHAR(20) NULL     COMMENT '등록아이디', -- 등록아이디
	MOD_DT      TIMESTAMP   NOT NULL COMMENT '수정일시', -- 수정일시
	MOD_ID      VARCHAR(20) NULL     COMMENT '수정아이디' -- 수정아이디
)
COMMENT '상품세트';

-- 상품세트
ALTER TABLE ITEM_SET
	ADD CONSTRAINT PK_ITEM_SET -- 상품세트 기본키
		PRIMARY KEY (
			ITEM_SET_ID -- 상품세트식별번호
		);

-- 상품세트 유니크 인덱스
CREATE UNIQUE INDEX UIX_ITEM_SET
	ON ITEM_SET ( -- 상품세트
		ITEM_ID ASC,     -- 상품식별번호
		REF_ITEM_ID ASC  -- 참조상품식별번호
	);

-- 상품변경기록
CREATE TABLE ITEM_CHIST (
	ITEM_CHIST_ID        INTEGER       NOT NULL COMMENT '상품변경기록식별번호', -- 상품변경기록식별번호
	ITEM_ID              INTEGER       NOT NULL COMMENT '상품식별번호', -- 상품식별번호
	ITEM_STAT_CD         VARCHAR(100)  NOT NULL COMMENT '상품상태코드', -- 상품상태코드
	ITEM_NM              VARCHAR(300)  NOT NULL COMMENT '상품명', -- 상품명
	ITEM_SUB_NM          VARCHAR(500)  NULL     COMMENT '상품부명', -- 상품부명
	ITEM_ATTR_NM         VARCHAR(1000) NULL     COMMENT '상품속성명', -- 상품속성명
	ITEM_ATTR_HMDELV_NM  VARCHAR(1000) NULL     COMMENT '상품속성가정배달명', -- 상품속성가정배달명
	SELL_CH_ID_VAL       VARCHAR(1000) NOT NULL COMMENT '판매채널식별번호값', -- 판매채널식별번호값
	SELL_CH_NM           VARCHAR(1000) NOT NULL COMMENT '판매채널명', -- 판매채널명
	DP_BRND_ID           INTEGER       NULL     COMMENT '전시브랜드식별번호', -- 전시브랜드식별번호
	DP_BRND_NM           VARCHAR(200)  NULL     COMMENT '전시브랜드명', -- 전시브랜드명
	ITEM_KWD_VAL         VARCHAR(1000) NULL     COMMENT '상품키워드값', -- 상품키워드값
	DP_YN                VARCHAR(1)    NOT NULL COMMENT '전시여부', -- 전시여부
	DP_CATE_ID_VAL       VARCHAR(1000) NULL     COMMENT '전시카테고리식별번호값', -- 전시카테고리식별번호값
	DP_CATE_NM           VARCHAR(1000) NULL     COMMENT '전시카테고리명', -- 전시카테고리명
	SELL_UNIT_QTY        NUMERIC(9)     NOT NULL COMMENT '판매단위수량', -- 판매단위수량
	SELL_PERD_LIM_YN     VARCHAR(1)    NOT NULL COMMENT '판매기간한정여부', -- 판매기간한정여부
	SELL_PERD_LIM_ST_DT  DATE          NULL     COMMENT '판매기간한정시작일시', -- 판매기간한정시작일시
	SELL_PERD_LIM_ED_DT  DATE          NULL     COMMENT '판매기간한정종료일시', -- 판매기간한정종료일시
	CPN_USE_PSBL_YN      VARCHAR(1)    NOT NULL COMMENT '쿠폰사용가능여부', -- 쿠폰사용가능여부
	PT_SAVE_TP_CD        VARCHAR(100)  NOT NULL COMMENT '포인트적립유형코드', -- 포인트적립유형코드
	PT_SAVE_METH_CD      VARCHAR(100)  NULL     COMMENT '포인트적립방식코드', -- 포인트적립방식코드
	PT_SAVE_RATE         NUMERIC(5,2)   NULL     COMMENT '포인트적립율', -- 포인트적립율
	PT_SAVE_AMT          INTEGER       NULL     COMMENT '포인트적립금액', -- 포인트적립금액
	ITEM_PRC_ID_VAL      VARCHAR(1000) NULL     COMMENT '상품가격식별번호값', -- 상품가격식별번호값
	ITEM_PRC_SELL_PRC_NM VARCHAR(1000) NULL     COMMENT '상품가격판매가명', -- 상품가격판매가명
	ITEM_PRC_SELL_PRC    VARCHAR(1000) NULL     COMMENT '상품가격판매가', -- 상품가격판매가
	ITEM_OPT_ID_VAL      VARCHAR(1000) NULL     COMMENT '상품옵션식별번호값', -- 상품옵션식별번호값
	ITEM_OPT_NM          VARCHAR(1000) NULL     COMMENT '상품옵션명', -- 상품옵션명
	ITEM_FRGT_ID_VAL     VARCHAR(1000) NULL     COMMENT '상품사은품식별번호값', -- 상품사은품식별번호값
	FRGT_NM              VARCHAR(1000) NULL     COMMENT '사은품명', -- 사은품명
	CLM_DELV_PRC         INTEGER       NULL     COMMENT '클레임배송비', -- 클레임배송비
	REG_DT               TIMESTAMP     NOT NULL COMMENT '등록일시', -- 등록일시
	REG_ID               VARCHAR(20)   NULL     COMMENT '등록아이디' -- 등록아이디
)
COMMENT '상품변경기록';

-- 상품변경기록
ALTER TABLE ITEM_CHIST
	ADD CONSTRAINT PK_ITEM_CHIST -- 상품변경기록 기본키
		PRIMARY KEY (
			ITEM_CHIST_ID -- 상품변경기록식별번호
		);

-- 상품승인기록
CREATE TABLE ITEM_APRV_HIST (
	ITEM_APRV_HIST_ID INTEGER       NOT NULL COMMENT '상품승인기록식별번호', -- 상품승인기록식별번호
	ITEM_ID           INTEGER       NOT NULL COMMENT '상품식별번호', -- 상품식별번호
	APRV_REQ_CD       VARCHAR(100)  NOT NULL COMMENT '승인요청코드', -- 승인요청코드
	APRV_STAT_CD      VARCHAR(100)  NOT NULL COMMENT '승인상태코드', -- 승인상태코드
	APRV_REQ_DT       DATE          NOT NULL COMMENT '승인요청일시', -- 승인요청일시
	APRV_PROC_DT      DATE          NULL     COMMENT '승인처리일시', -- 승인처리일시
	APRV_ADM_ID       VARCHAR(20)   NULL     COMMENT '승인관리자식별번호', -- 승인관리자식별번호
	RTN_RSN           VARCHAR(1000) NULL     COMMENT '반려사유', -- 반려사유
	REG_DT            TIMESTAMP     NOT NULL COMMENT '등록일시', -- 등록일시
	REG_ID            VARCHAR(20)   NULL     COMMENT '등록아이디', -- 등록아이디
	MOD_DT            TIMESTAMP     NOT NULL COMMENT '수정일시', -- 수정일시
	MOD_ID            VARCHAR(20)   NULL     COMMENT '수정아이디' -- 수정아이디
)
COMMENT '상품승인기록';

-- 상품승인기록
ALTER TABLE ITEM_APRV_HIST
	ADD CONSTRAINT PK_ITEM_APRV_HIST -- 상품승인기록 기본키
		PRIMARY KEY (
			ITEM_APRV_HIST_ID -- 상품승인기록식별번호
		);

-- 상품이미지
CREATE TABLE ITEM_IMG (
	ITEM_IMG_ID    INTEGER      NOT NULL COMMENT '상품이미지식별번호', -- 상품이미지식별번호
	ITEM_ID        INTEGER      NOT NULL COMMENT '상품식별번호', -- 상품식별번호
	ITEM_IMG_TP_CD VARCHAR(100) NOT NULL COMMENT '상품이미지유형코드', -- 상품이미지유형코드
	ATCH_ID        INTEGER      NOT NULL COMMENT '첨부식별번호', -- 첨부식별번호
	REG_DT         TIMESTAMP    NOT NULL COMMENT '등록일시', -- 등록일시
	REG_ID         VARCHAR(20)  NULL     COMMENT '등록아이디', -- 등록아이디
	MOD_DT         TIMESTAMP    NOT NULL COMMENT '수정일시', -- 수정일시
	MOD_ID         VARCHAR(20)  NULL     COMMENT '수정아이디' -- 수정아이디
)
COMMENT '상품이미지';

-- 상품이미지
ALTER TABLE ITEM_IMG
	ADD CONSTRAINT PK_ITEM_IMG -- 상품이미지 기본키
		PRIMARY KEY (
			ITEM_IMG_ID -- 상품이미지식별번호
		);

-- 상품이미지 유니크 인덱스
CREATE UNIQUE INDEX UIX_ITEM_IMG
	ON ITEM_IMG ( -- 상품이미지
		ITEM_ID ASC,        -- 상품식별번호
		ITEM_IMG_TP_CD ASC  -- 상품이미지유형코드
	);

-- 상품입고알림
CREATE TABLE ITEM_WAHS_NOTI (
	ITEM_WAHS_NOTI_ID         INTEGER      NOT NULL COMMENT '상품입고알림식별번호', -- 상품입고알림식별번호
	ITEM_ID                   INTEGER      NOT NULL COMMENT '상품식별번호', -- 상품식별번호
	ITEM_OPT_ID               INTEGER      NULL     COMMENT '상품옵션식별번호', -- 상품옵션식별번호
	MBR_ID                    VARCHAR(20)  NOT NULL COMMENT '회원식별번호', -- 회원식별번호
	ITEM_WAHS_NOTI_STAT_CD    VARCHAR(100) NOT NULL COMMENT '상품입고알림상태코드', -- 상품입고알림상태코드
	CP_NO                     VARCHAR(200) NOT NULL COMMENT '휴대폰번호', -- 휴대폰번호
	PSNL_INFO_HNDL_PCY_AGR_YN VARCHAR(1)   NOT NULL COMMENT '개인정보취급방침동의여부', -- 개인정보취급방침동의여부
	NOTI_REQ_DT               DATE         NULL     COMMENT '알림신청일시', -- 알림신청일시
	NOTI_PERD_ST_YMD          VARCHAR(8)   NULL     COMMENT '알림기간시작일자', -- 알림기간시작일자
	NOTI_PERD_ED_YMD          VARCHAR(8)   NULL     COMMENT '알림기간종료일자', -- 알림기간종료일자
	NOTI_SND_DT               DATE         NULL     COMMENT '알림발송일시', -- 알림발송일시
	REG_DT                    TIMESTAMP    NOT NULL COMMENT '등록일시', -- 등록일시
	REG_ID                    VARCHAR(20)  NULL     COMMENT '등록아이디', -- 등록아이디
	USE_YN                    VARCHAR(1)   NOT NULL COMMENT '사용여부' -- 사용여부
)
COMMENT '상품입고알림';

-- 상품입고알림
ALTER TABLE ITEM_WAHS_NOTI
	ADD CONSTRAINT PK_ITEM_WAHS_NOTI -- 상품입고알림 기본키
		PRIMARY KEY (
			ITEM_WAHS_NOTI_ID -- 상품입고알림식별번호
		);

-- 상품입고알림 인덱스
CREATE INDEX IX_ITEM_WAHS_NOTI
	ON ITEM_WAHS_NOTI( -- 상품입고알림
		MBR_ID ASC, -- 회원식별번호
		USE_YN ASC  -- 사용여부
	);

-- 상품메타
CREATE TABLE ITEM_META (
	ITEM_ID      INTEGER   NOT NULL COMMENT '상품식별번호', -- 상품식별번호
	READ_CNT     NUMERIC(9) NOT NULL COMMENT '조회수', -- 조회수
	ORD_QTY      NUMERIC(9) NOT NULL COMMENT '주문수량', -- 주문수량
	ITEM_CMT_CNT NUMERIC(9) NOT NULL COMMENT '상품평수' -- 상품평수
)
COMMENT '상품메타';

-- 상품메타
ALTER TABLE ITEM_META
	ADD CONSTRAINT PK_ITEM_META -- 상품메타 기본키
		PRIMARY KEY (
			ITEM_ID -- 상품식별번호
		);

-- 상품옵션변경기록
CREATE TABLE ITEM_OPT_CHIST (
	ITEM_OPT_CHIST_ID INTEGER      NOT NULL COMMENT '상품옵션변경기록식별번호', -- 상품옵션변경기록식별번호
	ITEM_OPT_ID       INTEGER      NOT NULL COMMENT '상품옵션식별번호', -- 상품옵션식별번호
	ITEM_ID           INTEGER      NOT NULL COMMENT '상품식별번호', -- 상품식별번호
	OPT_SELL_STAT_CD  VARCHAR(100) NOT NULL COMMENT '옵션판매상태코드', -- 옵션판매상태코드
	SSG_CD            VARCHAR(20)  NULL     COMMENT 'SSG코드', -- SSG코드
	OPT_NM            VARCHAR(200) NOT NULL COMMENT '옵션명', -- 옵션명
	SORD              NUMERIC(5)    NULL     COMMENT '정렬순서', -- 정렬순서
	REG_DT            TIMESTAMP    NOT NULL COMMENT '등록일시', -- 등록일시
	REG_ID            VARCHAR(20)  NULL     COMMENT '등록아이디', -- 등록아이디
	MOD_DT            TIMESTAMP    NOT NULL COMMENT '수정일시', -- 수정일시
	MOD_ID            VARCHAR(20)  NULL     COMMENT '수정아이디', -- 수정아이디
	USE_YN            VARCHAR(1)   NOT NULL COMMENT '사용여부' -- 사용여부
)
COMMENT '상품옵션변경기록';

-- 상품옵션변경기록
ALTER TABLE ITEM_OPT_CHIST
	ADD CONSTRAINT PK_ITEM_OPT_CHIST -- 상품옵션변경기록 기본키
		PRIMARY KEY (
			ITEM_OPT_CHIST_ID -- 상품옵션변경기록식별번호
		);

-- 상품정보고시
CREATE TABLE ITEM_INFO_NOTI (
	ITEM_INFO_NOTI_ID      INTEGER       NOT NULL COMMENT '상품정보고시식별번호', -- 상품정보고시식별번호
	ITEM_ID                INTEGER       NOT NULL COMMENT '상품식별번호', -- 상품식별번호
	ITEM_INFO_NOTI_CATE_CD VARCHAR(100)  NOT NULL COMMENT '상품정보고시분류코드', -- 상품정보고시분류코드
	ITEM_INFO_NOTI_DTL_CD  VARCHAR(100)  NOT NULL COMMENT '상품정보고시상세코드', -- 상품정보고시상세코드
	CONT                   VARCHAR(4000) NULL     COMMENT '내용', -- 내용
	DP_YN                  VARCHAR(1)    NULL     COMMENT '전시여부', -- 전시여부
	REG_DT                 TIMESTAMP     NOT NULL COMMENT '등록일시', -- 등록일시
	REG_ID                 VARCHAR(20)   NULL     COMMENT '등록아이디', -- 등록아이디
	MOD_DT                 TIMESTAMP     NOT NULL COMMENT '수정일시', -- 수정일시
	MOD_ID                 VARCHAR(20)   NULL     COMMENT '수정아이디', -- 수정아이디
	USE_YN                 VARCHAR(1)    NOT NULL COMMENT '사용여부' -- 사용여부
)
COMMENT '상품정보고시';

-- 상품정보고시
ALTER TABLE ITEM_INFO_NOTI
	ADD CONSTRAINT PK_ITEM_INFO_NOTI -- 상품정보고시 기본키
		PRIMARY KEY (
			ITEM_INFO_NOTI_ID -- 상품정보고시식별번호
		);

-- 상품정보고시 유니크 인덱스
CREATE UNIQUE INDEX UK_ITEM_INFO_NOTI
	ON ITEM_INFO_NOTI ( -- 상품정보고시
		ITEM_ID ASC,                -- 상품식별번호
		ITEM_INFO_NOTI_CATE_CD ASC, -- 상품정보고시분류코드
		ITEM_INFO_NOTI_DTL_CD ASC   -- 상품정보고시상세코드
	);

-- 상품재고
CREATE TABLE ITEM_STK (
	ITEM_STK_ID INTEGER     NOT NULL COMMENT '상품재고식별번호', -- 상품재고식별번호
	ITEM_ID     INTEGER     NOT NULL COMMENT '상품식별번호', -- 상품식별번호
	ITEM_OPT_ID INTEGER     NULL     COMMENT '상품옵션식별번호', -- 상품옵션식별번호
	STK_QTY     NUMERIC(9)   NOT NULL COMMENT '재고수량', -- 재고수량
	REG_DT      TIMESTAMP   NOT NULL COMMENT '등록일시', -- 등록일시
	REG_ID      VARCHAR(20) NULL     COMMENT '등록아이디', -- 등록아이디
	MOD_DT      TIMESTAMP   NOT NULL COMMENT '수정일시', -- 수정일시
	MOD_ID      VARCHAR(20) NULL     COMMENT '수정아이디' -- 수정아이디
)
COMMENT '상품재고';

-- 상품재고
ALTER TABLE ITEM_STK
	ADD CONSTRAINT PK_ITEM_STK -- 상품재고 기본키
		PRIMARY KEY (
			ITEM_STK_ID -- 상품재고식별번호
		);

-- 상품재고 유니크 인덱스
CREATE UNIQUE INDEX UIX_ITEM_STK
	ON ITEM_STK ( -- 상품재고
		ITEM_ID ASC,     -- 상품식별번호
		ITEM_OPT_ID ASC  -- 상품옵션식별번호
	);

-- 전시카테고리
CREATE TABLE DP_CATE (
	DP_CATE_ID       INTEGER       NOT NULL COMMENT '전시카테고리식별번호', -- 전시카테고리식별번호
	REF_DP_CATE_ID   INTEGER       NULL     COMMENT '참조전시카테고리식별번호', -- 참조전시카테고리식별번호
	DP_CATE_NM       VARCHAR(200)  NOT NULL COMMENT '전시카테고리명', -- 전시카테고리명
	HRCHY_PATH       VARCHAR(500)  NOT NULL COMMENT '계층경로', -- 계층경로
	HRCHY_PATH_NM    VARCHAR(1000) NOT NULL COMMENT '계층경로명', -- 계층경로명
	DP_CONR_BANR_ID  INTEGER       NULL     COMMENT '전시코너배너식별번호', -- 전시코너배너식별번호
	LWR_CATE_APLY_YN VARCHAR(1)    NULL     COMMENT '하위카테고리적용여부', -- 하위카테고리적용여부
	SORD             NUMERIC(5)     NOT NULL COMMENT '정렬순서', -- 정렬순서
	DP_YN            VARCHAR(1)    NOT NULL COMMENT '전시여부', -- 전시여부
	REG_DT           TIMESTAMP     NOT NULL COMMENT '등록일시', -- 등록일시
	REG_ID           VARCHAR(20)   NULL     COMMENT '등록아이디', -- 등록아이디
	MOD_DT           TIMESTAMP     NOT NULL COMMENT '수정일시', -- 수정일시
	MOD_ID           VARCHAR(20)   NULL     COMMENT '수정아이디', -- 수정아이디
	USE_YN           VARCHAR(1)    NOT NULL COMMENT '사용여부' -- 사용여부
)
COMMENT '전시카테고리';

-- 전시카테고리
ALTER TABLE DP_CATE
	ADD CONSTRAINT PK_DP_CATE -- 전시카테고리 기본키
		PRIMARY KEY (
			DP_CATE_ID -- 전시카테고리식별번호
		);

-- 전시폐쇄페이지회원대상
CREATE TABLE DP_CLOSE_PAGE_MBR_TGT (
	DP_CH_ID   INTEGER      NOT NULL COMMENT '전시채널식별번호', -- 전시채널식별번호
	MBR_TGT_CD VARCHAR(100) NOT NULL COMMENT '회원대상코드', -- 회원대상코드
	REG_DT     TIMESTAMP    NOT NULL COMMENT '등록일시', -- 등록일시
	REG_ID     VARCHAR(20)  NULL     COMMENT '등록아이디', -- 등록아이디
	USE_YN     VARCHAR(1)   NOT NULL COMMENT '사용여부' -- 사용여부
)
COMMENT '전시폐쇄페이지회원대상';

-- 전시폐쇄페이지회원대상
ALTER TABLE DP_CLOSE_PAGE_MBR_TGT
	ADD CONSTRAINT PK_DP_CLOSE_PAGE_MBR_TGT -- 전시폐쇄페이지회원대상 기본키
		PRIMARY KEY (
			DP_CH_ID,   -- 전시채널식별번호
			MBR_TGT_CD  -- 회원대상코드
		);

-- 전시카테고리상품매핑
CREATE TABLE DP_CATE_ITEM_MAP (
	DP_CATE_ID  INTEGER     NOT NULL COMMENT '전시카테고리식별번호', -- 전시카테고리식별번호
	ITEM_ID     INTEGER     NOT NULL COMMENT '상품식별번호', -- 상품식별번호
	REP_CATE_YN VARCHAR(1)  NULL     COMMENT '대표카테고리여부', -- 대표카테고리여부
	SORD        NUMERIC(5)   NULL     COMMENT '정렬순서', -- 정렬순서
	REG_DT      TIMESTAMP   NOT NULL COMMENT '등록일시', -- 등록일시
	REG_ID      VARCHAR(20) NULL     COMMENT '등록아이디', -- 등록아이디
	MOD_DT      TIMESTAMP   NOT NULL COMMENT '수정일시', -- 수정일시
	MOD_ID      VARCHAR(20) NULL     COMMENT '수정아이디' -- 수정아이디
)
COMMENT '전시카테고리상품매핑';

-- 전시카테고리상품매핑
ALTER TABLE DP_CATE_ITEM_MAP
	ADD CONSTRAINT PK_DP_CATE_ITEM_MAP -- 전시카테고리상품매핑 기본키
		PRIMARY KEY (
			DP_CATE_ID, -- 전시카테고리식별번호
			ITEM_ID     -- 상품식별번호
		);

-- 전시카테고리상품매핑 인덱스
CREATE INDEX IX_DP_CATE_ITEM_MAP
	ON DP_CATE_ITEM_MAP( -- 전시카테고리상품매핑
		ITEM_ID ASC,     -- 상품식별번호
		REP_CATE_YN ASC  -- 대표카테고리여부
	);

-- 전시폐쇄페이지
CREATE TABLE DP_CLOSE_PAGE (
	DP_CH_ID      INTEGER      NOT NULL COMMENT '전시채널식별번호', -- 전시채널식별번호
	PAGE_DESC     VARCHAR(500) NULL     COMMENT '페이지설명', -- 페이지설명
	PRGS_ST_DT    DATE         NOT NULL COMMENT '진행시작일시', -- 진행시작일시
	PRGS_ED_DT    DATE         NOT NULL COMMENT '진행종료일시', -- 진행종료일시
	ACCS_CD       VARCHAR(100) NOT NULL COMMENT '접속코드', -- 접속코드
	ACCS_URL      VARCHAR(500) NOT NULL COMMENT '접속URL', -- 접속URL
	ACCS_URL_QRCD VARCHAR(500) NULL     COMMENT '접속URLQR코드', -- 접속URLQR코드
	MBR_TGT_CD    VARCHAR(100) NULL     COMMENT '회원대상코드', -- 회원대상코드
	PAGE_CONT_PC  VARCHAR(1000)NULL     COMMENT '페이지내용_PC', -- 페이지내용_PC
	PAGE_CONT_MOB VARCHAR(1000)NULL     COMMENT '페이지내용_모바일', -- 페이지내용_모바일
	DP_YN         VARCHAR(1)   NULL     COMMENT '전시여부', -- 전시여부
	REG_DT        TIMESTAMP    NOT NULL COMMENT '등록일시', -- 등록일시
	REG_ID        VARCHAR(20)  NULL     COMMENT '등록아이디', -- 등록아이디
	MOD_DT        TIMESTAMP    NOT NULL COMMENT '수정일시', -- 수정일시
	MOD_ID        VARCHAR(20)  NULL     COMMENT '수정아이디' -- 수정아이디
)
COMMENT '전시폐쇄페이지';

-- 전시폐쇄페이지
ALTER TABLE DP_CLOSE_PAGE
	ADD CONSTRAINT PK_DP_CLOSE_PAGE -- 전시폐쇄페이지 기본키
		PRIMARY KEY (
			DP_CH_ID -- 전시채널식별번호
		);

-- 전시공지상품매핑
CREATE TABLE DP_NOTI_ITEM_MAP (
	DP_NOTI_ID INTEGER NOT NULL COMMENT '전시공지식별번호', -- 전시공지식별번호
	ITEM_ID    INTEGER NOT NULL COMMENT '상품식별번호' -- 상품식별번호
)
COMMENT '전시공지상품매핑';

-- 전시공지상품매핑
ALTER TABLE DP_NOTI_ITEM_MAP
	ADD CONSTRAINT PK_DP_NOTI_ITEM_MAP -- 전시공지상품매핑 기본키
		PRIMARY KEY (
			DP_NOTI_ID, -- 전시공지식별번호
			ITEM_ID     -- 상품식별번호
		);

-- 전시코너배너
CREATE TABLE DP_CONR_BANR (
	DP_CONR_BANR_ID   INTEGER       NOT NULL COMMENT '전시코너배너식별번호', -- 전시코너배너식별번호
	DP_CONR_CD        VARCHAR(100)  NOT NULL COMMENT '전시코너코드', -- 전시코너코드
	DP_ENV_CD         VARCHAR(100)  NULL     COMMENT '전시환경코드', -- 전시환경코드
	BANR_NM           VARCHAR(200)  NULL     COMMENT '배너명', -- 배너명
	BANR_TIT_PC       VARCHAR(200)  NULL     COMMENT '배너제목_PC', -- 배너제목_PC
	BANR_TIT_MOB      VARCHAR(200)  NULL     COMMENT '배너제목_모바일', -- 배너제목_모바일
	BANR_ATCH_GID_PC  INTEGER       NULL     COMMENT '배너첨부그룹식별번호_PC', -- 배너첨부그룹식별번호_PC
	BANR_ATCH_GID_MOB INTEGER       NULL     COMMENT '배너첨부그룹식별번호_모바일', -- 배너첨부그룹식별번호_모바일
	BG_COLOR_VAL      VARCHAR(10)   NULL     COMMENT '배경색상값', -- 배경색상값
	LINK_URL_ADDR     VARCHAR(500)  NULL     COMMENT '링크URL주소', -- 링크URL주소
	LINK_NWIN_YN      VARCHAR(1)    NULL     COMMENT '링크새창여부', -- 링크새창여부
	KWD_VAL           VARCHAR(1000) NULL     COMMENT '키워드값', -- 키워드값
	DP_ST_DT          DATE          NULL     COMMENT '전시시작일시', -- 전시시작일시
	DP_ED_DT          DATE          NULL     COMMENT '전시종료일시', -- 전시종료일시
	DP_YN             VARCHAR(1)    NULL     COMMENT '전시여부', -- 전시여부
	SORD              NUMERIC(5)     NULL     COMMENT '정렬순서', -- 정렬순서
	REG_DT            TIMESTAMP     NOT NULL COMMENT '등록일시', -- 등록일시
	REG_ID            VARCHAR(20)   NULL     COMMENT '등록아이디', -- 등록아이디
	MOD_DT            TIMESTAMP     NOT NULL COMMENT '수정일시', -- 수정일시
	MOD_ID            VARCHAR(20)   NULL     COMMENT '수정아이디', -- 수정아이디
	USE_YN            VARCHAR(1)    NOT NULL COMMENT '사용여부' -- 사용여부
)
COMMENT '전시코너배너';

-- 전시코너배너
ALTER TABLE DP_CONR_BANR
	ADD CONSTRAINT PK_DP_CONR_BANR -- 전시코너배너 기본키
		PRIMARY KEY (
			DP_CONR_BANR_ID -- 전시코너배너식별번호
		);

-- 전시코너매핑그룹
CREATE TABLE DP_CONR_MAP_GRP (
	DP_CONR_MAP_GID INTEGER      NOT NULL COMMENT '전시코너매핑그룹식별번호', -- 전시코너매핑그룹식별번호
	DP_CONR_CD      VARCHAR(100) NOT NULL COMMENT '전시코너코드', -- 전시코너코드
	MAP_GRP_NM      VARCHAR(200) NOT NULL COMMENT '매핑그룹명', -- 매핑그룹명
	DP_YN           VARCHAR(1)   NOT NULL COMMENT '전시여부', -- 전시여부
	SORD            NUMERIC(5)    NULL     COMMENT '정렬순서', -- 정렬순서
	REG_DT          TIMESTAMP    NOT NULL COMMENT '등록일시', -- 등록일시
	REG_ID          VARCHAR(20)  NULL     COMMENT '등록아이디' -- 등록아이디
)
COMMENT '전시코너매핑그룹';

-- 전시코너매핑그룹
ALTER TABLE DP_CONR_MAP_GRP
	ADD CONSTRAINT PK_DP_CONR_MAP_GRP -- 전시코너매핑그룹 기본키
		PRIMARY KEY (
			DP_CONR_MAP_GID -- 전시코너매핑그룹식별번호
		);

-- 전시공지
CREATE TABLE DP_NOTI (
	DP_NOTI_ID     INTEGER      NOT NULL COMMENT '전시공지식별번호', -- 전시공지식별번호
	VEN_ID         INTEGER      NULL     COMMENT '업체식별번호', -- 업체식별번호
	DP_NOTI_TGT_CD VARCHAR(100) NOT NULL COMMENT '전시공지대상코드', -- 전시공지대상코드
	NOTI_TIT       VARCHAR(200) NOT NULL COMMENT '공지제목', -- 공지제목
	NOTI_ST_YMD    VARCHAR(8)   NOT NULL COMMENT '공지시작일자', -- 공지시작일자
	NOTI_ED_YMD    VARCHAR(8)   NOT NULL COMMENT '공지종료일자', -- 공지종료일자
	CONT           VARCHAR(4000)NULL     COMMENT '내용', -- 내용
	DP_YN          VARCHAR(1)   NOT NULL COMMENT '전시여부', -- 전시여부
	REG_DT         TIMESTAMP    NOT NULL COMMENT '등록일시', -- 등록일시
	REG_ID         VARCHAR(20)  NULL     COMMENT '등록아이디', -- 등록아이디
	MOD_DT         TIMESTAMP    NOT NULL COMMENT '수정일시', -- 수정일시
	MOD_ID         VARCHAR(20)  NULL     COMMENT '수정아이디', -- 수정아이디
	USE_YN         VARCHAR(1)   NOT NULL COMMENT '사용여부' -- 사용여부
)
COMMENT '전시공지';

-- 전시공지
ALTER TABLE DP_NOTI
	ADD CONSTRAINT PK_DP_NOTI -- 전시공지 기본키
		PRIMARY KEY (
			DP_NOTI_ID -- 전시공지식별번호
		);

-- 전시공지 인덱스
CREATE INDEX IX_DP_NOTI
	ON DP_NOTI( -- 전시공지
		NOTI_ST_YMD ASC, -- 공지시작일자
		NOTI_ED_YMD ASC  -- 공지종료일자
	);

-- 전시채널
CREATE TABLE DP_CH (
	DP_CH_ID    INTEGER      NOT NULL COMMENT '전시채널식별번호', -- 전시채널식별번호
	DP_CH_TP_CD VARCHAR(100) NOT NULL COMMENT '전시채널유형코드', -- 전시채널유형코드
	DP_CH_NM    VARCHAR(200) NOT NULL COMMENT '전시채널명', -- 전시채널명
	REG_DT      TIMESTAMP    NOT NULL COMMENT '등록일시', -- 등록일시
	REG_ID      VARCHAR(20)  NULL     COMMENT '등록아이디', -- 등록아이디
	MOD_DT      TIMESTAMP    NOT NULL COMMENT '수정일시', -- 수정일시
	MOD_ID      VARCHAR(20)  NULL     COMMENT '수정아이디', -- 수정아이디
	USE_YN      VARCHAR(1)   NOT NULL COMMENT '사용여부' -- 사용여부
)
COMMENT '전시채널';

-- 전시채널
ALTER TABLE DP_CH
	ADD CONSTRAINT PK_DP_CH -- 전시채널 기본키
		PRIMARY KEY (
			DP_CH_ID -- 전시채널식별번호
		);

-- 전시코너매핑
CREATE TABLE DP_CONR_MAP (
	DP_CONR_MAP_ID  INTEGER      NOT NULL COMMENT '전시코너매핑식별번호', -- 전시코너매핑식별번호
	DP_CONR_CD      VARCHAR(100) NOT NULL COMMENT '전시코너코드', -- 전시코너코드
	MAP_ID          INTEGER      NOT NULL COMMENT '매핑식별번호', -- 매핑식별번호
	MAP_CL          CHAR(1)      NOT NULL COMMENT '매핑구분', -- 매핑구분
	DP_CONR_MAP_GID INTEGER      NULL     COMMENT '전시코너매핑그룹식별번호', -- 전시코너매핑그룹식별번호
	DP_YN           VARCHAR(1)   NOT NULL COMMENT '전시여부', -- 전시여부
	SORD            NUMERIC(5)    NULL     COMMENT '정렬순서', -- 정렬순서
	REG_DT          TIMESTAMP    NOT NULL COMMENT '등록일시', -- 등록일시
	REG_ID          VARCHAR(20)  NULL     COMMENT '등록아이디' -- 등록아이디
)
COMMENT '전시코너매핑';

-- 전시코너매핑
ALTER TABLE DP_CONR_MAP
	ADD CONSTRAINT PK_DP_CONR_MAP -- 전시코너매핑 기본키
		PRIMARY KEY (
			DP_CONR_MAP_ID -- 전시코너매핑식별번호
		);

-- 전시코너매핑 유니크 인덱스
CREATE UNIQUE INDEX UIX_DP_CONR_MAP
	ON DP_CONR_MAP ( -- 전시코너매핑
		DP_CONR_CD ASC,      -- 전시코너코드
		DP_CONR_MAP_GID ASC, -- 전시코너매핑그룹식별번호
		MAP_ID ASC           -- 매핑식별번호
	);

-- 전시팝업
CREATE TABLE DP_POP (
	DP_POP_ID     INTEGER      NOT NULL COMMENT '전시팝업식별번호', -- 전시팝업식별번호
	POP_DP_ENV_CD VARCHAR(100) NULL     COMMENT '팝업전시환경코드', -- 팝업전시환경코드
	POP_TIT       VARCHAR(200) NOT NULL COMMENT '팝업제목', -- 팝업제목
	ATCH_GID      INTEGER      NULL     COMMENT '첨부그룹식별번호', -- 첨부그룹식별번호
	POP_LOC_XA    NUMERIC(4)    NULL     COMMENT '팝업위치X축', -- 팝업위치X축
	POP_LOC_YA    NUMERIC(4)    NULL     COMMENT '팝업위치Y축', -- 팝업위치Y축
	LINK_URL_ADDR VARCHAR(500) NULL     COMMENT '링크URL주소', -- 링크URL주소
	LINK_NWIN_YN  VARCHAR(1)   NULL     COMMENT '링크새창여부', -- 링크새창여부
	DP_ST_DT      DATE         NOT NULL COMMENT '전시시작일시', -- 전시시작일시
	DP_ED_DT      DATE         NOT NULL COMMENT '전시종료일시', -- 전시종료일시
	DP_YN         VARCHAR(1)   NOT NULL COMMENT '전시여부', -- 전시여부
	REG_DT        TIMESTAMP    NOT NULL COMMENT '등록일시', -- 등록일시
	REG_ID        VARCHAR(20)  NULL     COMMENT '등록아이디', -- 등록아이디
	MOD_DT        TIMESTAMP    NOT NULL COMMENT '수정일시', -- 수정일시
	MOD_ID        VARCHAR(20)  NULL     COMMENT '수정아이디', -- 수정아이디
	USE_YN        VARCHAR(1)   NOT NULL COMMENT '사용여부' -- 사용여부
)
COMMENT '전시팝업';

-- 전시팝업
ALTER TABLE DP_POP
	ADD CONSTRAINT PK_DP_POP -- 전시팝업 기본키
		PRIMARY KEY (
			DP_POP_ID -- 전시팝업식별번호
		);

-- 전시팝업 인덱스
CREATE INDEX IX_DP_POP
	ON DP_POP( -- 전시팝업
		DP_ST_DT ASC, -- 전시시작일시
		DP_ED_DT ASC, -- 전시종료일시
		DP_YN ASC     -- 전시여부
	);

-- 전시브랜드
CREATE TABLE DP_BRND (
	DP_BRND_ID          INTEGER       NOT NULL COMMENT '전시브랜드식별번호', -- 전시브랜드식별번호
	VEN_ID              INTEGER       NOT NULL COMMENT '업체식별번호', -- 업체식별번호
	BRND_NM             VARCHAR(200)  NOT NULL COMMENT '브랜드명', -- 브랜드명
	BRND_NM_GRP_CD      VARCHAR(100)  NOT NULL COMMENT '브랜드명그룹코드', -- 브랜드명그룹코드
	BRND_ENG_NM         VARCHAR(200)  NULL     COMMENT '브랜드영문명', -- 브랜드영문명
	BRND_DESC           VARCHAR(500)  NULL     COMMENT '브랜드설명', -- 브랜드설명
	BRND_DTL_DESC       VARCHAR(2000) NULL     COMMENT '브랜드상세설명', -- 브랜드상세설명
	BRND_STORY_PC       VARCHAR(4000) NULL     COMMENT '브랜드스토리_PC', -- 브랜드스토리_PC
	BRND_STORY_MOB      VARCHAR(4000) NULL     COMMENT '브랜드스토리_모바일', -- 브랜드스토리_모바일
	DP_CATE_ID          INTEGER       NULL     COMMENT '전시카테고리식별번호', -- 전시카테고리식별번호
	BANR_L_ATCH_GID_PC  INTEGER       NULL     COMMENT '배너대첨부그룹식별번호_PC', -- 배너대첨부그룹식별번호_PC
	BANR_L_ATCH_GID_MOB INTEGER       NULL     COMMENT '배너대첨부그룹식별번호_모바일', -- 배너대첨부그룹식별번호_모바일
	BANR_M_ATCH_GID_PC  INTEGER       NULL     COMMENT '배너중첨부그룹식별번호_PC', -- 배너중첨부그룹식별번호_PC
	BANR_M_ATCH_GID_MOB INTEGER       NULL     COMMENT '배너중첨부그룹식별번호_모바일', -- 배너중첨부그룹식별번호_모바일
	LINK_URL_ADDR       VARCHAR(500)  NULL     COMMENT '링크URL주소', -- 링크URL주소
	LINK_NWIN_YN        VARCHAR(1)    NULL     COMMENT '링크새창여부', -- 링크새창여부
	SORD                NUMERIC(5)     NOT NULL COMMENT '정렬순서', -- 정렬순서
	DP_YN               VARCHAR(1)    NOT NULL COMMENT '전시여부', -- 전시여부
	REG_DT              TIMESTAMP     NOT NULL COMMENT '등록일시', -- 등록일시
	REG_ID              VARCHAR(20)   NULL     COMMENT '등록아이디', -- 등록아이디
	MOD_DT              TIMESTAMP     NOT NULL COMMENT '수정일시', -- 수정일시
	MOD_ID              VARCHAR(20)   NULL     COMMENT '수정아이디', -- 수정아이디
	USE_YN              VARCHAR(1)    NOT NULL COMMENT '사용여부' -- 사용여부
)
COMMENT '전시브랜드';

-- 전시브랜드
ALTER TABLE DP_BRND
	ADD CONSTRAINT PK_DP_BRND -- 전시브랜드 기본키
		PRIMARY KEY (
			DP_BRND_ID -- 전시브랜드식별번호
		);

-- 전시코너
CREATE TABLE DP_CONR (
	DP_CONR_CD     VARCHAR(100) NOT NULL COMMENT '전시코너코드', -- 전시코너코드
	DP_CH_ID       INTEGER      NOT NULL COMMENT '전시채널식별번호', -- 전시채널식별번호
	CONR_NM        VARCHAR(200) NOT NULL COMMENT '코너명', -- 코너명
	CONR_GRP_CL_CD VARCHAR(100) NULL     COMMENT '코너그룹구분코드', -- 코너그룹구분코드
	CONR_NM_DP_YN  VARCHAR(1)   NULL     COMMENT '코너명전시여부', -- 코너명전시여부
	CONR_DESC      VARCHAR(500) NULL     COMMENT '코너설명', -- 코너설명
	CONR_CONT_PC   VARCHAR(4000)NULL     COMMENT '코너내용_PC', -- 코너내용_PC
	CONR_CONT_MOB  VARCHAR(4000)NULL     COMMENT '코너내용_모바일', -- 코너내용_모바일
	LINK_URL_ADDR  VARCHAR(500) NULL     COMMENT '링크URL주소', -- 링크URL주소
	LINK_NWIN_YN   VARCHAR(1)   NULL     COMMENT '링크새창여부', -- 링크새창여부
	DP_YN          VARCHAR(1)   NULL     COMMENT '전시여부', -- 전시여부
	REG_DT         TIMESTAMP    NOT NULL COMMENT '등록일시', -- 등록일시
	REG_ID         VARCHAR(20)  NULL     COMMENT '등록아이디', -- 등록아이디
	MOD_DT         TIMESTAMP    NOT NULL COMMENT '수정일시', -- 수정일시
	MOD_ID         VARCHAR(20)  NULL     COMMENT '수정아이디', -- 수정아이디
	USE_YN         VARCHAR(1)   NOT NULL COMMENT '사용여부' -- 사용여부
)
COMMENT '전시코너';

-- 전시코너
ALTER TABLE DP_CONR
	ADD CONSTRAINT PK_DP_CONR -- 전시코너 기본키
		PRIMARY KEY (
			DP_CONR_CD -- 전시코너코드
		);

-- 장바구니
CREATE TABLE CART (
	CART_ID     INTEGER      NOT NULL COMMENT '장바구니식별번호', -- 장바구니식별번호
	CART_TP_CD  VARCHAR(100) NOT NULL COMMENT '장바구니유형코드', -- 장바구니유형코드
	DP_CH_ID    INTEGER      NOT NULL COMMENT '전시채널식별번호', -- 전시채널식별번호
	ITEM_ID     INTEGER      NOT NULL COMMENT '상품식별번호', -- 상품식별번호
	ITEM_OPT_ID INTEGER      NULL     COMMENT '상품옵션식별번호', -- 상품옵션식별번호
	ITEM_QTY    NUMERIC(9)    NOT NULL COMMENT '상품수량', -- 상품수량
	MBR_ID      VARCHAR(20)  NULL     COMMENT '회원식별번호', -- 회원식별번호
	REG_DT      TIMESTAMP    NOT NULL COMMENT '등록일시', -- 등록일시
	REG_ID      VARCHAR(20)  NULL     COMMENT '등록아이디', -- 등록아이디
	MOD_DT      TIMESTAMP    NOT NULL COMMENT '수정일시', -- 수정일시
	MOD_ID      VARCHAR(20)  NULL     COMMENT '수정아이디' -- 수정아이디
)
COMMENT '장바구니';

-- 장바구니
ALTER TABLE CART
	ADD CONSTRAINT PK_CART -- 장바구니 기본키
		PRIMARY KEY (
			CART_ID -- 장바구니식별번호
		);

-- 장바구니 인덱스
CREATE INDEX IX_CART
	ON CART( -- 장바구니
		MBR_ID ASC
	);

-- 장바구니 인덱스2
CREATE INDEX IX_CART2
	ON CART( -- 장바구니
		MBR_ID ASC -- 회원식별번호
	);

-- 장바구니바로구매
CREATE TABLE CART_IMME_BUY (
	CART_IMME_BUY_ID INTEGER      NOT NULL COMMENT '장바구니바로구매식별번호', -- 장바구니바로구매식별번호
	CART_TP_CD       VARCHAR(100) NOT NULL COMMENT '장바구니유형코드', -- 장바구니유형코드
	DP_CH_ID         INTEGER      NOT NULL COMMENT '전시채널식별번호', -- 전시채널식별번호
	ITEM_ID          INTEGER      NOT NULL COMMENT '상품식별번호', -- 상품식별번호
	ITEM_OPT_ID      INTEGER      NULL     COMMENT '상품옵션식별번호', -- 상품옵션식별번호
	ITEM_QTY         NUMERIC(9)    NOT NULL COMMENT '상품수량', -- 상품수량
	MBR_ID           VARCHAR(20)  NULL     COMMENT '회원식별번호', -- 회원식별번호
	REG_DT           TIMESTAMP    NOT NULL COMMENT '등록일시', -- 등록일시
	REG_ID           VARCHAR(20)  NULL     COMMENT '등록아이디' -- 등록아이디
)
COMMENT '장바구니바로구매';

-- 장바구니바로구매
ALTER TABLE CART_IMME_BUY
	ADD CONSTRAINT PK_CART_IMME_BUY -- 장바구니바로구매 기본키
		PRIMARY KEY (
			CART_IMME_BUY_ID -- 장바구니바로구매식별번호
		);

-- 장바구니바로구매 인덱스
CREATE INDEX IX_CART_IMME_BUY
	ON CART_IMME_BUY( -- 장바구니바로구매
		MBR_ID ASC
	);

-- 장바구니바로구매 인덱스2
CREATE INDEX IX_CART_IMME_BUY2
	ON CART_IMME_BUY( -- 장바구니바로구매
		MBR_ID ASC -- 회원식별번호
	);

-- 회원위시상품
CREATE TABLE MBR_WISH_ITEM (
	MBR_WISH_ITEM_ID INTEGER     NOT NULL COMMENT '회원위시상품식별번호', -- 회원위시상품식별번호
	MBR_ID           VARCHAR(20) NOT NULL COMMENT '회원식별번호', -- 회원식별번호
	DP_CH_ID         INTEGER     NOT NULL COMMENT '전시채널식별번호', -- 전시채널식별번호
	ITEM_ID          INTEGER     NOT NULL COMMENT '상품식별번호', -- 상품식별번호
	REG_DT           TIMESTAMP   NOT NULL COMMENT '등록일시', -- 등록일시
	REG_ID           VARCHAR(20) NULL     COMMENT '등록아이디', -- 등록아이디
	MOD_DT           TIMESTAMP   NOT NULL COMMENT '수정일시', -- 수정일시
	MOD_ID           VARCHAR(20) NULL     COMMENT '수정아이디', -- 수정아이디
	USE_YN           VARCHAR(1)  NOT NULL COMMENT '사용여부' -- 사용여부
)
COMMENT '회원위시상품';

-- 회원위시상품
ALTER TABLE MBR_WISH_ITEM
	ADD CONSTRAINT PK_MBR_WISH_ITEM -- 회원위시상품 기본키
		PRIMARY KEY (
			MBR_WISH_ITEM_ID -- 회원위시상품식별번호
		);

-- 회원위시상품 인덱스
CREATE INDEX IX_MBR_WISH_ITEM
	ON MBR_WISH_ITEM( -- 회원위시상품
		MBR_ID ASC -- 회원식별번호
	);

-- 주문클레임상품사은품
CREATE TABLE ORD_CLM_ITEM_FRGT (
	ORD_CLM_ITEM_FRGT_ID INTEGER     NOT NULL COMMENT '주문클레임상품사은품식별번호', -- 주문클레임상품사은품식별번호
	ORD_CLM_ITEM_ID      INTEGER     NOT NULL COMMENT '주문클레임상품식별번호', -- 주문클레임상품식별번호
	ORD_ITEM_FRGT_ID     INTEGER     NOT NULL COMMENT '주문상품사은품식별번호', -- 주문상품사은품식별번호
	REG_DT               TIMESTAMP   NOT NULL COMMENT '등록일시', -- 등록일시
	REG_ID               VARCHAR(20) NULL     COMMENT '등록아이디' -- 등록아이디
)
COMMENT '주문클레임상품사은품';

-- 주문클레임상품사은품
ALTER TABLE ORD_CLM_ITEM_FRGT
	ADD CONSTRAINT PK_ORD_CLM_ITEM_FRGT -- 주문클레임상품사은품 기본키
		PRIMARY KEY (
			ORD_CLM_ITEM_FRGT_ID -- 주문클레임상품사은품식별번호
		);

-- 주문환불정보
CREATE TABLE ORD_RFD_INFO (
	ORD_RFD_INFO_ID  INTEGER       NOT NULL COMMENT '주문환불정보식별번호', -- 주문환불정보식별번호
	ORD_ID           INTEGER       NOT NULL COMMENT '주문식별번호', -- 주문식별번호
	ORD_CLM_ID       INTEGER       NULL     COMMENT '주문클레임식별번호', -- 주문클레임식별번호
	RFD_BANK_CD      VARCHAR(100)  NULL     COMMENT '환불은행코드', -- 환불은행코드
	RFD_BANK_NM      VARCHAR(200)  NULL     COMMENT '환불은행명', -- 환불은행명
	RFD_ACCT_NO      VARCHAR(200)  NOT NULL COMMENT '환불계좌번호', -- 환불계좌번호
	RFD_ACCT_DPTR_NM VARCHAR(500)  NOT NULL COMMENT '환불계좌예금주명', -- 환불계좌예금주명
	MEMO_CONT        VARCHAR(1000) NULL     COMMENT '메모내용', -- 메모내용
	REG_DT           TIMESTAMP     NOT NULL COMMENT '등록일시', -- 등록일시
	REG_ID           VARCHAR(20)   NULL     COMMENT '등록아이디', -- 등록아이디
	USE_YN           VARCHAR(1)    NOT NULL COMMENT '사용여부' -- 사용여부
)
COMMENT '주문환불정보';

-- 주문환불정보
ALTER TABLE ORD_RFD_INFO
	ADD CONSTRAINT PK_ORD_RFD_INFO -- 주문환불정보 기본키
		PRIMARY KEY (
			ORD_RFD_INFO_ID -- 주문환불정보식별번호
		);

-- 주문상품
CREATE TABLE ORD_ITEM (
	ORD_ITEM_ID          INTEGER      NOT NULL COMMENT '주문상품식별번호', -- 주문상품식별번호
	ORD_ID               INTEGER      NOT NULL COMMENT '주문식별번호', -- 주문식별번호
	ORD_ITEM_SEQ         NUMERIC(5)    NOT NULL COMMENT '주문상품순번', -- 주문상품순번
	ORD_ITEM_NO          VARCHAR(30)  NOT NULL COMMENT '주문상품번호', -- 주문상품번호
	ORD_ITEM_STAT_CD     VARCHAR(100) NOT NULL COMMENT '주문상품상태코드', -- 주문상품상태코드
	ORD_ITEM_STAT_CHG_DT DATE         NOT NULL COMMENT '주문상품상태변경일시', -- 주문상품상태변경일시
	NOW_ORD_ITEM_STAT_CD VARCHAR(100) NOT NULL COMMENT '현재주문상품상태코드', -- 현재주문상품상태코드
	DP_CH_ID             INTEGER      NOT NULL COMMENT '전시채널식별번호', -- 전시채널식별번호
	ITEM_ID              INTEGER      NOT NULL COMMENT '상품식별번호', -- 상품식별번호
	ITEM_TP_CD           VARCHAR(100) NOT NULL COMMENT '상품유형코드', -- 상품유형코드
	ITEM_CD              VARCHAR(200) NOT NULL COMMENT '상품코드', -- 상품코드
	SSG_CD               VARCHAR(20)  NULL     COMMENT 'SSG코드', -- SSG코드
	ITEM_NM              VARCHAR(300) NOT NULL COMMENT '상품명', -- 상품명
	ITEM_OPT_ID          INTEGER      NULL     COMMENT '상품옵션식별번호', -- 상품옵션식별번호
	ITEM_OPT_NM          VARCHAR(500) NULL     COMMENT '상품옵션명', -- 상품옵션명
	ITEM_SET_ID          INTEGER      NULL     COMMENT '상품세트식별번호', -- 상품세트식별번호
	SET_ITEM_ID          INTEGER      NULL     COMMENT '세트상품식별번호', -- 세트상품식별번호
	SET_ITEM_NM          VARCHAR(300) NULL     COMMENT '세트상품명', -- 세트상품명
	ITEM_ATTR_TP_CD      VARCHAR(100) NOT NULL COMMENT '상품속성유형코드', -- 상품속성유형코드
	ITEM_TAX_CL_CD       VARCHAR(100) NOT NULL COMMENT '상품과세구분코드', -- 상품과세구분코드
	ITEM_CPN_USE_PSBL_YN VARCHAR(1)   NOT NULL COMMENT '상품쿠폰사용가능여부', -- 상품쿠폰사용가능여부
	ITEM_PT_SAVE_TP_CD   VARCHAR(100) NOT NULL COMMENT '상품포인트적립유형코드', -- 상품포인트적립유형코드
	ITEM_PT_SAVE_METH_CD VARCHAR(100) NULL     COMMENT '상품포인트적립방식코드', -- 상품포인트적립방식코드
	ITEM_PT_SAVE_RATE    NUMERIC(5,2)  NULL     COMMENT '상품포인트적립률', -- 상품포인트적립률
	ITEM_PT_SAVE_AMT     INTEGER      NULL     COMMENT '상품포인트적립금액', -- 상품포인트적립금액
	ITEM_ORD_RES_MAX_QTY NUMERIC(9)    NULL     COMMENT '상품주문제한최대수량', -- 상품주문제한최대수량
	ITEM_CSTMD_YN        VARCHAR(1)   NULL     COMMENT '상품주문제작여부', -- 상품주문제작여부
	ITEM_RGUR_PRC        INTEGER      NOT NULL COMMENT '상품정상가격', -- 상품정상가격
	ITEM_PRC_ID          INTEGER      NOT NULL COMMENT '상품가격식별번호', -- 상품가격식별번호
	ITEM_PRC_TP_CD       VARCHAR(100) NOT NULL COMMENT '상품가격유형코드', -- 상품가격유형코드
	ITEM_SPLY_UPRC       INTEGER      NOT NULL COMMENT '상품공급단가', -- 상품공급단가
	ITEM_SELL_UNIT_QTY   NUMERIC(9)    NOT NULL COMMENT '상품판매단위수량', -- 상품판매단위수량
	ITEM_SPLY_PRC        INTEGER      NOT NULL COMMENT '상품공급가격', -- 상품공급가격
	ITEM_SELL_DC_RATE    NUMERIC(7,2)  NOT NULL COMMENT '상품판매할인률', -- 상품판매할인률
	ITEM_SELL_PRC        INTEGER      NOT NULL COMMENT '상품판매가격', -- 상품판매가격
	ITEM_COMS_RATE       NUMERIC(7,2)  NOT NULL COMMENT '상품수수료률', -- 상품수수료률
	ITEM_COMS_AMT        INTEGER      NOT NULL COMMENT '상품수수료금액', -- 상품수수료금액
	REAL_SELL_PRC        INTEGER      NOT NULL COMMENT '실판매가격', -- 실판매가격
	ITEM_VAT_RATE        NUMERIC(5,2)  NULL     COMMENT '상품부가가치세률', -- 상품부가가치세률
	ORD_QTY              NUMERIC(9)    NOT NULL COMMENT '주문수량', -- 주문수량
	CNCL_QTY             NUMERIC(9)    NOT NULL COMMENT '취소수량', -- 취소수량
	FST_ORD_AMT          INTEGER      NOT NULL COMMENT '최초주문금액', -- 최초주문금액
	FST_CPN_DC_AMT       INTEGER      NOT NULL COMMENT '최초쿠폰할인금액', -- 최초쿠폰할인금액
	FST_PT_USE_AMT       INTEGER      NOT NULL COMMENT '최초포인트사용금액', -- 최초포인트사용금액
	FST_REAL_ORD_AMT     INTEGER      NOT NULL COMMENT '최초실주문금액', -- 최초실주문금액
	FST_REAL_PAY_AMT     INTEGER      NOT NULL COMMENT '최초실결제금액', -- 최초실결제금액
	FST_PT_SAVE_AMT      INTEGER      NOT NULL COMMENT '최초포인트적립금액', -- 최초포인트적립금액
	ORD_AMT              INTEGER      NOT NULL COMMENT '주문금액', -- 주문금액
	CPN_DC_AMT           INTEGER      NOT NULL COMMENT '쿠폰할인금액', -- 쿠폰할인금액
	PT_USE_AMT           INTEGER      NOT NULL COMMENT '포인트사용금액', -- 포인트사용금액
	REAL_ORD_AMT         INTEGER      NOT NULL COMMENT '실주문금액', -- 실주문금액
	REAL_PAY_AMT         INTEGER      NOT NULL COMMENT '실결제금액', -- 실결제금액
	PT_TP_CD             VARCHAR(100) NULL     COMMENT '포인트유형코드', -- 포인트유형코드
	PT_SAVE_YN           VARCHAR(1)   NOT NULL COMMENT '포인트적립여부', -- 포인트적립여부
	PT_SAVE_RATE         NUMERIC(5,2)  NOT NULL COMMENT '포인트적립률', -- 포인트적립률
	PT_SAVE_AMT          INTEGER      NOT NULL COMMENT '포인트적립금액', -- 포인트적립금액
	PG_SPLY_AMT          INTEGER      NULL     COMMENT 'PG공급금액', -- PG공급금액
	PG_VAT_AMT           INTEGER      NULL     COMMENT 'PG부가가치세금액', -- PG부가가치세금액
	PG_TAXFREE_AMT       INTEGER      NULL     COMMENT 'PG면세금액', -- PG면세금액
	SETTL_STAT_CD        VARCHAR(100) NOT NULL COMMENT '준비(등록시), 대기(주문: 배송지시시, 클레임: 클레임완료시), 완료(정산완료시)', -- 정산상태코드
	SETTL_YMD            VARCHAR(8)   NULL     COMMENT '정산일자', -- 정산일자
	SETTL_PG_YMD         VARCHAR(8)   NULL     COMMENT '정산PG일자', -- 정산PG일자
	REG_DT               TIMESTAMP    NOT NULL COMMENT '등록일시', -- 등록일시
	REG_ID               VARCHAR(20)  NULL     COMMENT '등록아이디', -- 등록아이디
	MOD_DT               TIMESTAMP    NOT NULL COMMENT '수정일시', -- 수정일시
	MOD_ID               VARCHAR(20)  NULL     COMMENT '수정아이디' -- 수정아이디
)
COMMENT '주문상품';

-- 주문상품
ALTER TABLE ORD_ITEM
	ADD CONSTRAINT PK_ORD_ITEM -- 주문상품 기본키
		PRIMARY KEY (
			ORD_ITEM_ID -- 주문상품식별번호
		);

-- 주문상품 유니크 인덱스
CREATE UNIQUE INDEX UIX_ORD_ITEM
	ON ORD_ITEM ( -- 주문상품
		ORD_ITEM_NO ASC -- 주문상품번호
	);

-- 주문상품 인덱스
CREATE INDEX IX_ORD_ITEM
	ON ORD_ITEM( -- 주문상품
		SETTL_STAT_CD ASC, -- 정산상태코드
		SETTL_YMD ASC      -- 정산일자
	);

-- 주문쿠폰변경기록
CREATE TABLE ORD_CPN_CHIST (
	ORD_CPN_CHIST_ID      INTEGER      NOT NULL COMMENT '주문쿠폰변경기록식별번호', -- 주문쿠폰변경기록식별번호
	ORD_CPN_ID            INTEGER      NOT NULL COMMENT '주문쿠폰식별번호', -- 주문쿠폰식별번호
	MBR_CPN_ID            INTEGER      NOT NULL COMMENT '회원쿠폰식별번호', -- 회원쿠폰식별번호
	ORD_ID                INTEGER      NOT NULL COMMENT '주문식별번호', -- 주문식별번호
	ORD_CPN_APLY_CD       VARCHAR(100) NOT NULL COMMENT '주문쿠폰적용코드', -- 주문쿠폰적용코드
	CPN_TP_CD             VARCHAR(100) NOT NULL COMMENT '쿠폰유형코드', -- 쿠폰유형코드
	CPN_AUTO_CL_CD        VARCHAR(100) NULL     COMMENT '쿠폰자동구분코드', -- 쿠폰자동구분코드
	CPN_NO                VARCHAR(100) NOT NULL COMMENT '쿠폰번호', -- 쿠폰번호
	CPN_NM                VARCHAR(200) NOT NULL COMMENT '쿠폰명', -- 쿠폰명
	MBR_CPN_NO            VARCHAR(20)  NOT NULL COMMENT '회원쿠폰번호', -- 회원쿠폰번호
	DC_METH_CD            VARCHAR(100) NULL     COMMENT '할인방식코드', -- 할인방식코드
	DC_AMT                INTEGER      NULL     COMMENT '할인금액', -- 할인금액
	DC_RATE               NUMERIC(5,2)  NULL     COMMENT '할인율', -- 할인율
	DC_RATE_MAX_AMT       INTEGER      NULL     COMMENT '할인율최대금액', -- 할인율최대금액
	DC_MIN_USE_AMT_RES_YN VARCHAR(1)   NULL     COMMENT '할인최소사용금액제한여부', -- 할인최소사용금액제한여부
	DC_MIN_USE_AMT        INTEGER      NULL     COMMENT '할인최소사용금액', -- 할인최소사용금액
	DC_ADD_DC_CPN_YN      VARCHAR(1)   NULL     COMMENT '할인추가할인쿠폰여부', -- 할인추가할인쿠폰여부
	REAL_DC_AMT           INTEGER      NULL     COMMENT '실할인금액', -- 실할인금액
	REG_DT                TIMESTAMP    NOT NULL COMMENT '등록일시', -- 등록일시
	REG_ID                VARCHAR(20)  NULL     COMMENT '등록아이디', -- 등록아이디
	MOD_DT                TIMESTAMP    NOT NULL COMMENT '수정일시', -- 수정일시
	MOD_ID                VARCHAR(20)  NULL     COMMENT '수정아이디' -- 수정아이디
)
COMMENT '주문쿠폰변경기록';

-- 주문쿠폰변경기록
ALTER TABLE ORD_CPN_CHIST
	ADD CONSTRAINT PK_ORD_CPN_CHIST -- 주문쿠폰변경기록 기본키
		PRIMARY KEY (
			ORD_CPN_CHIST_ID -- 주문쿠폰변경기록식별번호
		);

-- 주문상품변경기록
CREATE TABLE ORD_ITEM_CHIST (
	ORD_ITEM_CHIST_ID    INTEGER      NOT NULL COMMENT '주문상품변경기록식별번호', -- 주문상품변경기록식별번호
	ORD_ITEM_ID          INTEGER      NOT NULL COMMENT '주문상품식별번호', -- 주문상품식별번호
	ORD_ID               INTEGER      NOT NULL COMMENT '주문식별번호', -- 주문식별번호
	ORD_DELV_ID          INTEGER      NOT NULL COMMENT '주문배송식별번호', -- 주문배송식별번호
	ORD_ITEM_SEQ         NUMERIC(5)    NOT NULL COMMENT '주문상품순번', -- 주문상품순번
	ORD_ITEM_NO          VARCHAR(30)  NOT NULL COMMENT '주문상품번호', -- 주문상품번호
	ORD_ITEM_STAT_CD     VARCHAR(100) NOT NULL COMMENT '주문상품상태코드', -- 주문상품상태코드
	ORD_ITEM_STAT_CHG_DT DATE         NOT NULL COMMENT '주문상품상태변경일시', -- 주문상품상태변경일시
	NOW_ORD_ITEM_STAT_CD VARCHAR(100) NOT NULL COMMENT '현재주문상품상태코드', -- 현재주문상품상태코드
	DP_CH_ID             INTEGER      NOT NULL COMMENT '전시채널식별번호', -- 전시채널식별번호
	ITEM_ID              INTEGER      NOT NULL COMMENT '상품식별번호', -- 상품식별번호
	ITEM_TP_CD           VARCHAR(100) NOT NULL COMMENT '상품유형코드', -- 상품유형코드
	ITEM_CD              VARCHAR(200) NOT NULL COMMENT '상품코드', -- 상품코드
	SSG_CD               VARCHAR(20)  NULL     COMMENT 'SSG 코드', -- SSG 코드
	ITEM_NM              VARCHAR(300) NOT NULL COMMENT '상품명', -- 상품명
	ITEM_OPT_ID          INTEGER      NULL     COMMENT '상품옵션식별번호', -- 상품옵션식별번호
	ITEM_OPT_NM          VARCHAR(500) NULL     COMMENT '상품옵션명', -- 상품옵션명
	ITEM_SET_ID          INTEGER      NULL     COMMENT '상품세트식별번호', -- 상품세트식별번호
	SET_ITEM_ID          INTEGER      NULL     COMMENT '세트상품식별번호', -- 세트상품식별번호
	SET_ITEM_NM          VARCHAR(300) NULL     COMMENT '세트상품명', -- 세트상품명
	ITEM_ATTR_TP_CD      VARCHAR(100) NOT NULL COMMENT '상품속성유형코드', -- 상품속성유형코드
	ITEM_TAX_CL_CD       VARCHAR(100) NOT NULL COMMENT '상품과세구분코드', -- 상품과세구분코드
	ITEM_CPN_USE_PSBL_YN VARCHAR(1)   NOT NULL COMMENT '상품쿠폰사용가능여부', -- 상품쿠폰사용가능여부
	ITEM_PT_SAVE_TP_CD   VARCHAR(100) NOT NULL COMMENT '상품포인트적립유형코드', -- 상품포인트적립유형코드
	ITEM_PT_SAVE_METH_CD VARCHAR(100) NULL     COMMENT '상품포인트적립방식코드', -- 상품포인트적립방식코드
	ITEM_PT_SAVE_RATE    NUMERIC(5,2)  NULL     COMMENT '상품포인트적립률', -- 상품포인트적립률
	ITEM_PT_SAVE_AMT     INTEGER      NULL     COMMENT '상품포인트적립금액', -- 상품포인트적립금액
	ITEM_ORD_RES_MAX_QTY NUMERIC(9)    NULL     COMMENT '상품주문제한최대수량', -- 상품주문제한최대수량
	ITEM_CSTMD_YN        VARCHAR(1)   NULL     COMMENT '상품주문제작여부', -- 상품주문제작여부
	ITEM_RGUR_PRC        INTEGER      NOT NULL COMMENT '상품정상가격', -- 상품정상가격
	ITEM_PRC_ID          INTEGER      NOT NULL COMMENT '상품가격식별번호', -- 상품가격식별번호
	ITEM_PRC_TP_CD       VARCHAR(100) NOT NULL COMMENT '상품가격유형코드', -- 상품가격유형코드
	ITEM_SPLY_UPRC       INTEGER      NOT NULL COMMENT '상품공급단가', -- 상품공급단가
	ITEM_SELL_UNIT_QTY   NUMERIC(9)    NOT NULL COMMENT '상품판매단위수량', -- 상품판매단위수량
	ITEM_SPLY_PRC        INTEGER      NOT NULL COMMENT '상품공급가격', -- 상품공급가격
	ITEM_SELL_DC_RATE    NUMERIC(7,2)  NOT NULL COMMENT '상품판매할인률', -- 상품판매할인률
	ITEM_SELL_PRC        INTEGER      NOT NULL COMMENT '상품판매가격', -- 상품판매가격
	ITEM_COMS_RATE       NUMERIC(7,2)  NOT NULL COMMENT '상품수수료률', -- 상품수수료률
	ITEM_COMS_AMT        INTEGER      NOT NULL COMMENT '상품수수료금액', -- 상품수수료금액
	REAL_SELL_PRC        INTEGER      NOT NULL COMMENT '실판매가격', -- 실판매가격
	ITEM_VAT_RATE        NUMERIC(5,2)  NULL     COMMENT '상품부가가치세률', -- 상품부가가치세률
	ORD_QTY              NUMERIC(9)    NOT NULL COMMENT '주문수량', -- 주문수량
	CNCL_QTY             NUMERIC(9)    NOT NULL COMMENT '취소수량', -- 취소수량
	FST_ORD_AMT          INTEGER      NOT NULL COMMENT '최초주문금액', -- 최초주문금액
	FST_CPN_DC_AMT       INTEGER      NOT NULL COMMENT '최초쿠폰할인금액', -- 최초쿠폰할인금액
	FST_PT_USE_AMT       INTEGER      NOT NULL COMMENT '최초포인트사용금액', -- 최초포인트사용금액
	FST_REAL_ORD_AMT     INTEGER      NOT NULL COMMENT '최초실주문금액', -- 최초실주문금액
	FST_REAL_PAY_AMT     INTEGER      NOT NULL COMMENT '최초실결제금액', -- 최초실결제금액
	FST_PT_SAVE_AMT      INTEGER      NOT NULL COMMENT '최초포인트적립금액', -- 최초포인트적립금액
	ORD_AMT              INTEGER      NOT NULL COMMENT '주문금액', -- 주문금액
	CPN_DC_AMT           INTEGER      NOT NULL COMMENT '쿠폰할인금액', -- 쿠폰할인금액
	PT_USE_AMT           INTEGER      NOT NULL COMMENT '포인트사용금액', -- 포인트사용금액
	REAL_ORD_AMT         INTEGER      NOT NULL COMMENT '실주문금액', -- 실주문금액
	REAL_PAY_AMT         INTEGER      NOT NULL COMMENT '실결제금액', -- 실결제금액
	PT_TP_CD             VARCHAR(100) NULL     COMMENT '포인트유형코드', -- 포인트유형코드
	PT_SAVE_YN           VARCHAR(1)   NOT NULL COMMENT '포인트적립여부', -- 포인트적립여부
	PT_SAVE_RATE         NUMERIC(5,2)  NOT NULL COMMENT '포인트적립률', -- 포인트적립률
	PT_SAVE_AMT          INTEGER      NOT NULL COMMENT '포인트적립금액', -- 포인트적립금액
	PG_SPLY_AMT          INTEGER      NULL     COMMENT 'PG공급금액', -- PG공급금액
	PG_VAT_AMT           INTEGER      NULL     COMMENT 'PG부가가치세금액', -- PG부가가치세금액
	PG_TAXFREE_AMT       INTEGER      NULL     COMMENT 'PG면세금액', -- PG면세금액
	ORD_CFM_SKD_DT       DATE         NULL     COMMENT '주문확정예정일시', -- 주문확정예정일시
	ORD_CFM_DT           DATE         NULL     COMMENT '주문확정일시', -- 주문확정일시
	ORD_CFM_ID           VARCHAR(20)  NULL     COMMENT '주문확정아이디', -- 주문확정아이디
	ORD_CFM_SND_YN       VARCHAR(1)   NOT NULL COMMENT '결제완료시 주문확정송신 전송 후 Y로 변경', -- 주문확정송신여부
	SETTL_STAT_CD        VARCHAR(100) NOT NULL COMMENT '준비(등록시), 대기(주문: 배송지시시, 클레임: 클레임완료시), 완료(정산완료시)', -- 정산상태코드
	SETTL_YMD            VARCHAR(8)   NULL     COMMENT '정산일자', -- 정산일자
	SETTL_PG_YMD         VARCHAR(8)   NULL     COMMENT '정산PG일자', -- 정산PG일자
	REG_DT               TIMESTAMP    NOT NULL COMMENT '등록일시', -- 등록일시
	REG_ID               VARCHAR(20)  NULL     COMMENT '등록아이디', -- 등록아이디
	MOD_DT               TIMESTAMP    NOT NULL COMMENT '수정일시', -- 수정일시
	MOD_ID               VARCHAR(20)  NULL     COMMENT '수정아이디' -- 수정아이디
)
COMMENT '주문상품변경기록';

-- 주문상품변경기록
ALTER TABLE ORD_ITEM_CHIST
	ADD CONSTRAINT PK_ORD_ITEM_CHIST -- 주문상품변경기록 기본키
		PRIMARY KEY (
			ORD_ITEM_CHIST_ID -- 주문상품변경기록식별번호
		);

-- 주문서
CREATE TABLE ORD_SHT (
	ORD_ID            INTEGER       NOT NULL COMMENT '주문식별번호', -- 주문식별번호
	MBR_ID            VARCHAR(20)   NULL     COMMENT '회원식별번호', -- 회원식별번호
	ORD_NO            VARCHAR(30)   NOT NULL COMMENT '주문번호', -- 주문번호
	ORD_SHT_CONT      VARCHAR(4000) NOT NULL COMMENT '주문서내용', -- 주문서내용
	BUYR_IP_ADDR      VARCHAR(200)  NOT NULL COMMENT '구매자아이피주소', -- 구매자아이피주소
	ORD_RSLT_CD_VAL   VARCHAR(100)  NULL     COMMENT '주문결과코드값', -- 주문결과코드값
	ORD_RSLT_MSG_CONT VARCHAR(4000) NULL     COMMENT '주문결과메시지내용', -- 주문결과메시지내용
	REG_DT            TIMESTAMP     NOT NULL COMMENT '등록일시', -- 등록일시
	REG_ID            VARCHAR(20)   NULL     COMMENT '등록아이디', -- 등록아이디
	MOD_DT            TIMESTAMP     NOT NULL COMMENT '수정일시', -- 수정일시
	MOD_ID            VARCHAR(20)   NULL     COMMENT '수정아이디' -- 수정아이디
)
COMMENT '주문서';

-- 주문서
ALTER TABLE ORD_SHT
	ADD CONSTRAINT PK_ORD_SHT -- 주문서 기본키
		PRIMARY KEY (
			ORD_ID -- 주문식별번호
		);

-- 주문쿠폰상품매핑
CREATE TABLE ORD_CPN_ITEM_MAP (
	ORD_CPN_ITEM_MAP_ID INTEGER      NOT NULL COMMENT '주문쿠폰상품매핑식별번호', -- 주문쿠폰상품매핑식별번호
	ORD_CPN_ID          INTEGER      NOT NULL COMMENT '주문쿠폰식별번호', -- 주문쿠폰식별번호
	ORD_ITEM_ID         INTEGER      NOT NULL COMMENT '주문상품식별번호', -- 주문상품식별번호
	ORD_CLM_ID          INTEGER      NULL     COMMENT '주문클레임식별번호', -- 주문클레임식별번호
	ORD_CPN_APLY_CD     VARCHAR(100) NOT NULL COMMENT '주문쿠폰적용코드', -- 주문쿠폰적용코드
	FST_CPN_DC_AMT      INTEGER      NOT NULL COMMENT '최초쿠폰할인금액', -- 최초쿠폰할인금액
	CPN_DC_AMT          INTEGER      NOT NULL COMMENT '쿠폰할인금액', -- 쿠폰할인금액
	CPN_RTN_AMT         INTEGER      NOT NULL COMMENT '쿠폰반환금액', -- 쿠폰반환금액
	REG_DT              TIMESTAMP    NOT NULL COMMENT '등록일시', -- 등록일시
	REG_ID              VARCHAR(20)  NULL     COMMENT '등록아이디', -- 등록아이디
	MOD_DT              TIMESTAMP    NOT NULL COMMENT '수정일시', -- 수정일시
	MOD_ID              VARCHAR(20)  NULL     COMMENT '수정아이디' -- 수정아이디
)
COMMENT '주문쿠폰상품매핑';

-- 주문쿠폰상품매핑
ALTER TABLE ORD_CPN_ITEM_MAP
	ADD CONSTRAINT PK_ORD_CPN_ITEM_MAP -- 주문쿠폰상품매핑 기본키
		PRIMARY KEY (
			ORD_CPN_ITEM_MAP_ID -- 주문쿠폰상품매핑식별번호
		);

-- 주문쿠폰
CREATE TABLE ORD_CPN (
	ORD_CPN_ID            INTEGER      NOT NULL COMMENT '주문쿠폰식별번호', -- 주문쿠폰식별번호
	MBR_CPN_ID            INTEGER      NOT NULL COMMENT '회원쿠폰식별번호', -- 회원쿠폰식별번호
	ORD_ID                INTEGER      NOT NULL COMMENT '주문식별번호', -- 주문식별번호
	ORD_CPN_APLY_CD       VARCHAR(100) NOT NULL COMMENT '주문쿠폰적용코드', -- 주문쿠폰적용코드
	CPN_TP_CD             VARCHAR(100) NOT NULL COMMENT '쿠폰유형코드', -- 쿠폰유형코드
	CPN_AUTO_CL_CD        VARCHAR(100) NULL     COMMENT '쿠폰자동구분코드', -- 쿠폰자동구분코드
	CPN_NO                VARCHAR(100) NOT NULL COMMENT '쿠폰번호', -- 쿠폰번호
	CPN_NM                VARCHAR(200) NOT NULL COMMENT '쿠폰명', -- 쿠폰명
	MBR_CPN_NO            VARCHAR(20)  NOT NULL COMMENT '회원쿠폰번호', -- 회원쿠폰번호
	DC_METH_CD            VARCHAR(100) NULL     COMMENT '할인방식코드', -- 할인방식코드
	DC_AMT                INTEGER      NULL     COMMENT '할인금액', -- 할인금액
	DC_RATE               NUMERIC(5,2)  NULL     COMMENT '할인율', -- 할인율
	DC_RATE_MAX_AMT       INTEGER      NULL     COMMENT '할인율최대금액', -- 할인율최대금액
	DC_MIN_USE_AMT_RES_YN VARCHAR(1)   NULL     COMMENT '할인최소사용금액제한여부', -- 할인최소사용금액제한여부
	DC_MIN_USE_AMT        INTEGER      NULL     COMMENT '할인최소사용금액', -- 할인최소사용금액
	DC_ADD_DC_CPN_YN      VARCHAR(1)   NULL     COMMENT '할인추가할인쿠폰여부', -- 할인추가할인쿠폰여부
	REAL_DC_AMT           INTEGER      NULL     COMMENT '실할인금액', -- 실할인금액
	REG_DT                TIMESTAMP    NOT NULL COMMENT '등록일시', -- 등록일시
	REG_ID                VARCHAR(20)  NULL     COMMENT '등록아이디', -- 등록아이디
	MOD_DT                TIMESTAMP    NOT NULL COMMENT '수정일시', -- 수정일시
	MOD_ID                VARCHAR(20)  NULL     COMMENT '수정아이디' -- 수정아이디
)
COMMENT '주문쿠폰';

-- 주문쿠폰
ALTER TABLE ORD_CPN
	ADD CONSTRAINT PK_ORD_CPN -- 주문쿠폰 기본키
		PRIMARY KEY (
			ORD_CPN_ID -- 주문쿠폰식별번호
		);

-- 주문클레임변경기록
CREATE TABLE ORD_CLM_CHIST (
	ORD_CLM_CHIST_ID INTEGER       NOT NULL COMMENT '주문클레임변경기록식별번호', -- 주문클레임변경기록식별번호
	ORD_CLM_ID       INTEGER       NOT NULL COMMENT '주문클레임식별번호', -- 주문클레임식별번호
	ORD_ID           INTEGER       NOT NULL COMMENT '주문식별번호', -- 주문식별번호
	ORD_CLM_NO       VARCHAR(30)   NOT NULL COMMENT '주문클레임번호', -- 주문클레임번호
	CLM_TP_CD        VARCHAR(100)  NOT NULL COMMENT '클레임유형코드', -- 클레임유형코드
	CLM_RCPT_DT      DATE          NOT NULL COMMENT '클레임접수일시', -- 클레임접수일시
	CLM_ATTR_CD      VARCHAR(100)  NULL     COMMENT '클레임귀책자코드', -- 클레임귀책자코드
	CLM_RSN_CD       VARCHAR(100)  NULL     COMMENT '클레임사유코드', -- 클레임사유코드
	CLM_RSN_CONT     VARCHAR(1000) NULL     COMMENT '클레임사유내용', -- 클레임사유내용
	RFD_MTHD         VARCHAR(1000) NULL     COMMENT '환불수단', -- 환불수단
	CPN_DC_RTN_AMT   INTEGER       NOT NULL COMMENT '쿠폰할인반환금액', -- 쿠폰할인반환금액
	PT_USE_RTN_AMT   INTEGER       NOT NULL COMMENT '포인트사용반환금액', -- 포인트사용반환금액
	CLM_AMT          INTEGER       NOT NULL COMMENT '클레임금액', -- 클레임금액
	REAL_CLM_AMT     INTEGER       NOT NULL COMMENT '실클레임금액', -- 실클레임금액
	PAY_CPLT_DT      DATE          NULL     COMMENT '결제완료일시', -- 결제완료일시
	RFD_CPLT_DT      DATE          NULL     COMMENT '환불완료일시', -- 환불완료일시
	REG_DT           TIMESTAMP     NOT NULL COMMENT '등록일시', -- 등록일시
	REG_ID           VARCHAR(20)   NULL     COMMENT '등록아이디' -- 등록아이디
)
COMMENT '주문클레임변경기록';

-- 주문클레임변경기록
ALTER TABLE ORD_CLM_CHIST
	ADD CONSTRAINT PK_ORD_CLM_CHIST -- 주문클레임변경기록 기본키
		PRIMARY KEY (
			ORD_CLM_CHIST_ID -- 주문클레임변경기록식별번호
		);

-- 주문상품사은품
CREATE TABLE ORD_ITEM_FRGT (
	ORD_ITEM_FRGT_ID INTEGER      NOT NULL COMMENT '주문상품사은품식별번호', -- 주문상품사은품식별번호
	ORD_ITEM_ID      INTEGER      NOT NULL COMMENT '주문상품식별번호', -- 주문상품식별번호
	ITEM_FRGT_ID     INTEGER      NOT NULL COMMENT '상품사은품식별번호', -- 상품사은품식별번호
	SSG_CD           VARCHAR(20)  NULL     COMMENT 'SSG코드', -- SSG코드
	FRGT_NM          VARCHAR(300) NOT NULL COMMENT '사은품명', -- 사은품명
	ORD_CFM_SND_YN   VARCHAR(1)   NOT NULL COMMENT '결제완료시 주문확정송신 전송 후 Y로 변경', -- 주문확정송신여부
	REG_DT           TIMESTAMP    NOT NULL COMMENT '등록일시', -- 등록일시
	REG_ID           VARCHAR(20)  NULL     COMMENT '등록아이디', -- 등록아이디
	MOD_DT           TIMESTAMP    NOT NULL COMMENT '수정일시', -- 수정일시
	MOD_ID           VARCHAR(20)  NULL     COMMENT '수정아이디' -- 수정아이디
)
COMMENT '주문상품사은품';

-- 주문상품사은품
ALTER TABLE ORD_ITEM_FRGT
	ADD CONSTRAINT PK_ORD_ITEM_FRGT -- 주문상품사은품 기본키
		PRIMARY KEY (
			ORD_ITEM_FRGT_ID -- 주문상품사은품식별번호
		);

-- 주문기록
CREATE TABLE ORD_HIST (
	ORD_HIST_ID     INTEGER       NOT NULL COMMENT '주문기록식별번호', -- 주문기록식별번호
	ORD_ID          INTEGER       NOT NULL COMMENT '주문식별번호', -- 주문식별번호
	ORD_ITEM_ID     INTEGER       NULL     COMMENT '주문상품식별번호', -- 주문상품식별번호
	ORD_CLM_ITEM_ID INTEGER       NULL     COMMENT '주문클레임상품식별번호', -- 주문클레임상품식별번호
	MBR_ID          VARCHAR(20)   NULL     COMMENT '회원식별번호', -- 회원식별번호
	ADM_ID          VARCHAR(20)   NULL     COMMENT '관리자식별번호', -- 관리자식별번호
	ORD_HIST_TP_CD  VARCHAR(100)  NOT NULL COMMENT '주문기록유형코드', -- 주문기록유형코드
	ORD_HIST_CD     VARCHAR(100)  NOT NULL COMMENT '주문기록코드', -- 주문기록코드
	ORD_HIST_DT     DATE          NOT NULL COMMENT '주문기록일시', -- 주문기록일시
	ORD_HIST_IP     VARCHAR(200)  NULL     COMMENT '주문기록아이피', -- 주문기록아이피
	CONT            VARCHAR(1000) NULL     COMMENT '내용', -- 내용
	REG_DT          TIMESTAMP     NOT NULL COMMENT '등록일시', -- 등록일시
	REG_ID          VARCHAR(20)   NULL     COMMENT '등록아이디' -- 등록아이디
)
COMMENT '주문기록';

-- 주문기록
ALTER TABLE ORD_HIST
	ADD CONSTRAINT PK_ORD_HIST -- 주문기록 기본키
		PRIMARY KEY (
			ORD_HIST_ID -- 주문기록식별번호
		);

-- 주문클레임
CREATE TABLE ORD_CLM (
	ORD_CLM_ID      INTEGER       NOT NULL COMMENT '주문클레임식별번호', -- 주문클레임식별번호
	ORD_ID          INTEGER       NOT NULL COMMENT '주문식별번호', -- 주문식별번호
	ORD_CLM_NO      VARCHAR(30)   NOT NULL COMMENT '주문클레임번호', -- 주문클레임번호
	CLM_TP_CD       VARCHAR(100)  NOT NULL COMMENT '클레임유형코드', -- 클레임유형코드
	CLM_RCPT_CH_CD  VARCHAR(100)  NULL     COMMENT '클레임접수채널코드', -- 클레임접수채널코드
	CLM_RCPT_ENV_CD VARCHAR(100)  NULL     COMMENT '클레임접수환경코드', -- 클레임접수환경코드
	CLM_RCPT_DT     DATE          NOT NULL COMMENT '클레임접수일시', -- 클레임접수일시
	CLM_ATTR_CD     VARCHAR(100)  NULL     COMMENT '클레임귀책자코드', -- 클레임귀책자코드
	CLM_RSN_CD      VARCHAR(100)  NULL     COMMENT '클레임사유코드', -- 클레임사유코드
	CLM_RSN_CONT    VARCHAR(1000) NULL     COMMENT '클레임사유내용', -- 클레임사유내용
	RFD_MTHD        VARCHAR(1000) NULL     COMMENT '환불수단', -- 환불수단
	CPN_DC_RTN_AMT  INTEGER       NOT NULL COMMENT '쿠폰할인반환금액', -- 쿠폰할인반환금액
	PT_USE_RTN_AMT  INTEGER       NOT NULL COMMENT '포인트사용반환금액', -- 포인트사용반환금액
	CLM_AMT         INTEGER       NOT NULL COMMENT '클레임금액', -- 클레임금액
	REAL_CLM_AMT    INTEGER       NOT NULL COMMENT '실클레임금액', -- 실클레임금액
	PAY_CPLT_DT     DATE          NULL     COMMENT '결제완료일시', -- 결제완료일시
	RFD_CPLT_DT     DATE          NULL     COMMENT '환불완료일시', -- 환불완료일시
	REG_DT          TIMESTAMP     NOT NULL COMMENT '등록일시', -- 등록일시
	REG_ID          VARCHAR(20)   NULL     COMMENT '등록아이디' -- 등록아이디
)
COMMENT '주문클레임';

-- 주문클레임
ALTER TABLE ORD_CLM
	ADD CONSTRAINT PK_ORD_CLM -- 주문클레임 기본키
		PRIMARY KEY (
			ORD_CLM_ID -- 주문클레임식별번호
		);

-- 주문
CREATE TABLE ORD (
	ORD_ID           INTEGER       NOT NULL COMMENT '주문식별번호', -- 주문식별번호
	ORD_TP_CD        VARCHAR(100)  NOT NULL COMMENT '주문유형코드', -- 주문유형코드
	ORD_NO           VARCHAR(30)   NOT NULL COMMENT '주문번호', -- 주문번호
	ORD_RCPT_CH_CD   VARCHAR(100)  NULL     COMMENT '주문접수채널코드', -- 주문접수채널코드
	ORD_RCPT_ENV_CD  VARCHAR(100)  NULL     COMMENT '주문접수환경코드', -- 주문접수환경코드
	ORD_RCPT_DT      DATE          NULL     COMMENT '주문접수일시', -- 주문접수일시
	ORD_CFM_DT       DATE          NULL     COMMENT '주문확정일시', -- 주문확정일시
	MBR_ID           VARCHAR(20)   NULL     COMMENT '회원식별번호', -- 회원식별번호
	MBR_GRD_CD       VARCHAR(100)  NULL     COMMENT '회원등급코드', -- 회원등급코드
	MBR_PT_SAVE_RATE NUMERIC(5,2)   NULL     COMMENT '회원포인트적립률', -- 회원포인트적립률
	BUYR_NM          VARCHAR(500)  NOT NULL COMMENT '구매자명', -- 구매자명
	BUYR_TEL_NO      VARCHAR(200)  NULL     COMMENT '구매자전화번호', -- 구매자전화번호
	BUYR_CP_NO       VARCHAR(200)  NOT NULL COMMENT '구매자휴대폰번호', -- 구매자휴대폰번호
	BUYR_EMAIL       VARCHAR(500)  NULL     COMMENT '구매자이메일', -- 구매자이메일
	BUYR_IP_ADDR     VARCHAR(200)  NULL     COMMENT '구매자아이피주소', -- 구매자아이피주소
	BUYR_ORD_AGR_YN  VARCHAR(1)    NULL     COMMENT '구매자주문동의여부', -- 구매자주문동의여부
	BUYR_ORD_AGR_DT  DATE          NULL     COMMENT '구매자주문동의일시', -- 구매자주문동의일시
	FST_PAY_MTHD     VARCHAR(1000) NULL     COMMENT '최초결제수단', -- 최초결제수단
	FST_ORD_AMT      INTEGER       NOT NULL COMMENT '최초주문금액', -- 최초주문금액
	FST_CPN_DC_AMT   INTEGER       NOT NULL COMMENT '최초쿠폰할인금액', -- 최초쿠폰할인금액
	FST_PT_USE_AMT   INTEGER       NOT NULL COMMENT '최초포인트사용금액', -- 최초포인트사용금액
	FST_REAL_ORD_AMT INTEGER       NOT NULL COMMENT '최초실주문금액', -- 최초실주문금액
	FST_REAL_PAY_AMT INTEGER       NOT NULL COMMENT '최초실결제금액', -- 최초실결제금액
	PAY_MTHD         VARCHAR(1000) NULL     COMMENT '결제수단', -- 결제수단
	ORD_AMT          INTEGER       NOT NULL COMMENT '주문금액', -- 주문금액
	CPN_DC_AMT       INTEGER       NOT NULL COMMENT '쿠폰할인금액', -- 쿠폰할인금액
	PT_USE_AMT       INTEGER       NOT NULL COMMENT '포인트사용금액', -- 포인트사용금액
	REAL_ORD_AMT     INTEGER       NOT NULL COMMENT '실주문금액', -- 실주문금액
	REAL_PAY_AMT     INTEGER       NOT NULL COMMENT '실결제금액', -- 실결제금액
	PG_SPLY_AMT      INTEGER       NULL     COMMENT 'PG공급금액', -- PG공급금액
	PG_VAT_AMT       INTEGER       NULL     COMMENT 'PG부가가치세금액', -- PG부가가치세금액
	PG_TAXFREE_AMT   INTEGER       NULL     COMMENT 'PG면세금액', -- PG면세금액
	PAY_CPLT_DT      DATE          NULL     COMMENT '결제완료일시', -- 결제완료일시
	REG_DT           TIMESTAMP     NOT NULL COMMENT '등록일시', -- 등록일시
	REG_ID           VARCHAR(20)   NULL     COMMENT '등록아이디', -- 등록아이디
	MOD_DT           TIMESTAMP     NOT NULL COMMENT '수정일시', -- 수정일시
	MOD_ID           VARCHAR(20)   NULL     COMMENT '수정아이디', -- 수정아이디
	OLD_ORD_YN       VARCHAR(1)    NOT NULL COMMENT '예전주문여부' -- 예전주문여부
)
COMMENT '주문';

-- 주문
ALTER TABLE ORD
	ADD CONSTRAINT PK_ORD -- 주문 기본키
		PRIMARY KEY (
			ORD_ID -- 주문식별번호
		);

-- 주문 유니크 인덱스
CREATE UNIQUE INDEX UIX_ORD
	ON ORD ( -- 주문
		ORD_NO ASC -- 주문번호
	);

-- 주문 인덱스
CREATE INDEX IX_ORD
	ON ORD( -- 주문
		ORD_TP_CD ASC -- 주문유형코드
	);

-- 주문 인덱스2
CREATE INDEX IX_ORD2
	ON ORD( -- 주문
		MBR_ID ASC -- 회원식별번호
	);

-- 주문 인덱스3
CREATE INDEX IX_ORD3
	ON ORD( -- 주문
		BUYR_NM ASC,    -- 구매자명
		BUYR_CP_NO ASC  -- 구매자휴대폰번호
	);

-- 주문클레임서
CREATE TABLE ORD_CLM_SHT (
	ORD_CLM_ID            INTEGER       NOT NULL COMMENT '주문클레임식별번호', -- 주문클레임식별번호
	MBR_ID                VARCHAR(20)   NULL     COMMENT '회원식별번호', -- 회원식별번호
	ORD_CLM_NO            VARCHAR(30)   NOT NULL COMMENT '주문클레임번호', -- 주문클레임번호
	ORD_CLM_SHT_CONT      VARCHAR(4000) NULL     COMMENT '주문클레임서내용', -- 주문클레임서내용
	BUYR_IP_ADDR          VARCHAR(200)  NOT NULL COMMENT '구매자아이피주소', -- 구매자아이피주소
	ORD_CLM_RSLT_CD_VAL   VARCHAR(100)  NULL     COMMENT '주문클레임결과코드값', -- 주문클레임결과코드값
	ORD_CLM_RSLT_MSG_CONT VARCHAR(4000) NULL     COMMENT '주문클레임결과메시지내용', -- 주문클레임결과메시지내용
	REG_DT                TIMESTAMP     NOT NULL COMMENT '등록일시', -- 등록일시
	REG_ID                VARCHAR(20)   NULL     COMMENT '등록아이디', -- 등록아이디
	MOD_DT                TIMESTAMP     NOT NULL COMMENT '수정일시', -- 수정일시
	MOD_ID                VARCHAR(20)   NULL     COMMENT '수정아이디' -- 수정아이디
)
COMMENT '주문클레임서';

-- 주문클레임서
ALTER TABLE ORD_CLM_SHT
	ADD CONSTRAINT PK_ORD_CLM_SHT -- 주문클레임서 기본키
		PRIMARY KEY (
			ORD_CLM_ID -- 주문클레임식별번호
		);

-- 주문클레임상품변경기록
CREATE TABLE ORD_CLM_ITEM_CHIST (
	ORD_CLM_ITEM_CHIST_ID     INTEGER       NOT NULL COMMENT '주문클레임상품변경기록식별번호', -- 주문클레임상품변경기록식별번호
	ORD_CLM_ITEM_ID           INTEGER       NOT NULL COMMENT '주문클레임상품식별번호', -- 주문클레임상품식별번호
	ORD_CLM_ID                INTEGER       NOT NULL COMMENT '주문클레임식별번호', -- 주문클레임식별번호
	ORD_ITEM_ID               INTEGER       NOT NULL COMMENT '주문상품식별번호', -- 주문상품식별번호
	CLM_ITEM_SEQ              NUMERIC(5)     NOT NULL COMMENT '클레임상품순번', -- 클레임상품순번
	CLM_ITEM_NO               VARCHAR(30)   NOT NULL COMMENT '클레임상품번호', -- 클레임상품번호
	CLM_TP_CD                 VARCHAR(100)  NOT NULL COMMENT '클레임유형코드', -- 클레임유형코드
	CLM_ITEM_STAT_CD          VARCHAR(100)  NOT NULL COMMENT '클레임상품상태코드', -- 클레임상품상태코드
	CLM_ITEM_STAT_CHG_DT      DATE          NOT NULL COMMENT '클레임상품상태변경일시', -- 클레임상품상태변경일시
	CLM_TIME_ORD_ITEM_STAT_CD VARCHAR(100)  NULL     COMMENT '클레임시점주문상품상태코드', -- 클레임시점주문상품상태코드
	CLM_CHCK_DT               DATE          NULL     COMMENT '클레임확인일시', -- 클레임확인일시
	CLM_APRV_DT               DATE          NULL     COMMENT '클레임승인일시', -- 클레임승인일시
	CLM_HOLD_DT               DATE          NULL     COMMENT '클레임보류일시', -- 클레임보류일시
	CLM_HOLD_RSN              VARCHAR(1000) NULL     COMMENT '클레임보류사유', -- 클레임보류사유
	CLM_REJ_DT                DATE          NULL     COMMENT '클레임거부일시', -- 클레임거부일시
	CLM_REJ_RSN               VARCHAR(1000) NULL     COMMENT '클레임거부사유', -- 클레임거부사유
	CLM_CPLT_DT               DATE          NULL     COMMENT '클레임완료일시', -- 클레임완료일시
	CPN_DC_RTN_AMT            INTEGER       NOT NULL COMMENT '쿠폰할인반환금액', -- 쿠폰할인반환금액
	PT_USE_RTN_AMT            INTEGER       NOT NULL COMMENT '포인트사용반환금액', -- 포인트사용반환금액
	CLM_QTY                   NUMERIC(9)     NOT NULL COMMENT '클레임수량', -- 클레임수량
	CLM_AMT                   INTEGER       NOT NULL COMMENT '클레임금액', -- 클레임금액
	PAY_ADD_AMT               INTEGER       NOT NULL COMMENT '결제추가금액', -- 결제추가금액
	PT_SAVE_CNCL_AMT          INTEGER       NOT NULL COMMENT '포인트적립취소금액', -- 포인트적립취소금액
	SETTL_STAT_CD             VARCHAR(100)  NOT NULL COMMENT '정산상태코드: 준비(등록시), 대기(주문: 배송지시시, 클레임: 클레임완료시), 완료(정산완료시)', -- 정산상태코드
	SETTL_YMD                 VARCHAR(8)    NULL     COMMENT '정산일자', -- 정산일자
	SETTL_PG_YMD              VARCHAR(8)    NULL     COMMENT '정산PG일자', -- 정산PG일자
	REG_DT                    TIMESTAMP     NOT NULL COMMENT '등록일시', -- 등록일시
	REG_ID                    VARCHAR(20)   NULL     COMMENT '등록아이디', -- 등록아이디
	MOD_DT                    TIMESTAMP     NOT NULL COMMENT '수정일시', -- 수정일시
	MOD_ID                    VARCHAR(20)   NULL     COMMENT '수정아이디' -- 수정아이디
)
COMMENT '주문클레임상품변경기록';

-- 주문클레임상품변경기록
ALTER TABLE ORD_CLM_ITEM_CHIST
	ADD CONSTRAINT PK_ORD_CLM_ITEM_CHIST -- 주문클레임상품변경기록 기본키
		PRIMARY KEY (
			ORD_CLM_ITEM_CHIST_ID -- 주문클레임상품변경기록식별번호
		);

-- 주문쿠폰상품매핑변경기록
CREATE TABLE ORD_CPN_ITEM_MAP_CHIST (
	ORD_CPN_ITEM_MAP_CHIST_ID INTEGER      NOT NULL COMMENT '주문쿠폰상품매핑변경기록식별번호', -- 주문쿠폰상품매핑변경기록식별번호
	ORD_CPN_ITEM_MAP_ID       INTEGER      NOT NULL COMMENT '주문쿠폰상품매핑식별번호', -- 주문쿠폰상품매핑식별번호
	ORD_CPN_ID                INTEGER      NOT NULL COMMENT '주문쿠폰식별번호', -- 주문쿠폰식별번호
	ORD_ITEM_ID               INTEGER      NOT NULL COMMENT '주문상품식별번호', -- 주문상품식별번호
	ORD_CLM_ID                INTEGER      NULL     COMMENT '주문클레임식별번호', -- 주문클레임식별번호
	ORD_CPN_APLY_CD           VARCHAR(100) NOT NULL COMMENT '주문쿠폰적용코드', -- 주문쿠폰적용코드
	FST_CPN_DC_AMT            INTEGER      NOT NULL COMMENT '최초쿠폰할인금액', -- 최초쿠폰할인금액
	CPN_DC_AMT                INTEGER      NOT NULL COMMENT '쿠폰할인금액', -- 쿠폰할인금액
	CPN_RTN_AMT               INTEGER      NOT NULL COMMENT '쿠폰반환금액', -- 쿠폰반환금액
	REG_DT                    TIMESTAMP    NOT NULL COMMENT '등록일시', -- 등록일시
	REG_ID                    VARCHAR(20)  NULL     COMMENT '등록아이디', -- 등록아이디
	MOD_DT                    TIMESTAMP    NOT NULL COMMENT '수정일시', -- 수정일시
	MOD_ID                    VARCHAR(20)  NULL     COMMENT '수정아이디' -- 수정아이디
)
COMMENT '주문쿠폰상품매핑변경기록';

-- 주문쿠폰상품매핑변경기록
ALTER TABLE ORD_CPN_ITEM_MAP_CHIST
	ADD CONSTRAINT PK_ORD_CPN_ITEM_MAP_CHIST -- 주문쿠폰상품매핑변경기록 기본키
		PRIMARY KEY (
			ORD_CPN_ITEM_MAP_CHIST_ID -- 주문쿠폰상품매핑변경기록식별번호
		);

-- 주문클레임상품
CREATE TABLE ORD_CLM_ITEM (
	ORD_CLM_ITEM_ID           INTEGER       NOT NULL COMMENT '주문클레임상품식별번호', -- 주문클레임상품식별번호
	ORD_CLM_ID                INTEGER       NOT NULL COMMENT '주문클레임식별번호', -- 주문클레임식별번호
	ORD_ITEM_ID               INTEGER       NOT NULL COMMENT '주문상품식별번호', -- 주문상품식별번호
	CLM_ITEM_SEQ              NUMERIC(5)     NOT NULL COMMENT '클레임상품순번', -- 클레임상품순번
	CLM_ITEM_NO               VARCHAR(30)   NOT NULL COMMENT '클레임상품번호', -- 클레임상품번호
	CLM_TP_CD                 VARCHAR(100)  NOT NULL COMMENT '클레임유형코드', -- 클레임유형코드
	CLM_ITEM_STAT_CD          VARCHAR(100)  NOT NULL COMMENT '클레임상품상태코드', -- 클레임상품상태코드
	CLM_ITEM_STAT_CHG_DT      DATE          NOT NULL COMMENT '클레임상품상태변경일시', -- 클레임상품상태변경일시
	CLM_TIME_ORD_ITEM_STAT_CD VARCHAR(100)  NULL     COMMENT '클레임시점주문상품상태코드', -- 클레임시점주문상품상태코드
	CLM_CHCK_DT               DATE          NULL     COMMENT '클레임확인일시', -- 클레임확인일시
	CLM_APRV_DT               DATE          NULL     COMMENT '클레임승인일시', -- 클레임승인일시
	CLM_HOLD_DT               DATE          NULL     COMMENT '클레임보류일시', -- 클레임보류일시
	CLM_HOLD_RSN              VARCHAR(1000) NULL     COMMENT '클레임보류사유', -- 클레임보류사유
	CLM_REJ_DT                DATE          NULL     COMMENT '클레임거부일시', -- 클레임거부일시
	CLM_REJ_RSN               VARCHAR(1000) NULL     COMMENT '클레임거부사유', -- 클레임거부사유
	CLM_CPLT_DT               DATE          NULL     COMMENT '클레임완료일시', -- 클레임완료일시
	CPN_DC_RTN_AMT            INTEGER       NOT NULL COMMENT '쿠폰할인반환금액', -- 쿠폰할인반환금액
	PT_USE_RTN_AMT            INTEGER       NOT NULL COMMENT '포인트사용반환금액', -- 포인트사용반환금액
	CLM_QTY                   NUMERIC(9)     NOT NULL COMMENT '클레임수량', -- 클레임수량
	CLM_AMT                   INTEGER       NOT NULL COMMENT '클레임금액', -- 클레임금액
	PT_SAVE_CNCL_AMT          INTEGER       NOT NULL COMMENT '포인트적립취소금액', -- 포인트적립취소금액
	SETTL_STAT_CD             VARCHAR(100)  NOT NULL COMMENT '정산상태코드: 준비(등록시), 대기(주문: 배송지시시, 클레임: 클레임완료시), 완료(정산완료시)', -- 정산상태코드
	SETTL_YMD                 VARCHAR(8)    NULL     COMMENT '정산일자', -- 정산일자
	SETTL_PG_YMD              VARCHAR(8)    NULL     COMMENT '정산PG일자', -- 정산PG일자
	REG_DT                    TIMESTAMP     NOT NULL COMMENT '등록일시', -- 등록일시
	REG_ID                    VARCHAR(20)   NULL     COMMENT '등록아이디', -- 등록아이디
	MOD_DT                    TIMESTAMP     NOT NULL COMMENT '수정일시', -- 수정일시
	MOD_ID                    VARCHAR(20)   NULL     COMMENT '수정아이디' -- 수정아이디
)
COMMENT '주문클레임상품';

-- 주문클레임상품
ALTER TABLE ORD_CLM_ITEM
	ADD CONSTRAINT PK_ORD_CLM_ITEM -- 주문클레임상품 기본키
		PRIMARY KEY (
			ORD_CLM_ITEM_ID -- 주문클레임상품식별번호
		);

-- 주문클레임상품 유니크 인덱스
CREATE UNIQUE INDEX UIX_ORD_CLM_ITEM
	ON ORD_CLM_ITEM ( -- 주문클레임상품
		CLM_ITEM_NO ASC -- 클레임상품번호
	);

-- 주문클레임상품 인덱스
CREATE INDEX IX_ORD_CLM_ITEM
	ON ORD_CLM_ITEM( -- 주문클레임상품
		SETTL_STAT_CD ASC, -- 정산상태코드
		SETTL_YMD ASC      -- 정산일자
	);

-- 주문변경기록
CREATE TABLE ORD_CHIST (
	ORD_CHIST_ID     INTEGER       NOT NULL COMMENT '주문변경기록식별번호', -- 주문변경기록식별번호
	ORD_ID           INTEGER       NOT NULL COMMENT '주문식별번호', -- 주문식별번호
	ORD_NO           VARCHAR(30)   NOT NULL COMMENT '주문번호', -- 주문번호
	ORD_TP_CD        VARCHAR(100)  NOT NULL COMMENT '주문유형코드', -- 주문유형코드
	ORD_RCPT_CH_CD   VARCHAR(100)  NULL     COMMENT '주문접수채널코드', -- 주문접수채널코드
	ORD_RCPT_ENV_CD  VARCHAR(100)  NULL     COMMENT '주문접수환경코드', -- 주문접수환경코드
	ORD_DT           DATE          NULL     COMMENT '주문일시', -- 주문일시
	MBR_ID           VARCHAR(20)   NULL     COMMENT '회원식별번호', -- 회원식별번호
	MBR_GRD_CD       VARCHAR(100)  NULL     COMMENT '회원등급코드', -- 회원등급코드
	MBR_PT_SAVE_RATE NUMERIC(5,2)   NULL     COMMENT '회원포인트적립률', -- 회원포인트적립률
	BUYR_NM          VARCHAR(500)  NOT NULL COMMENT '구매자명', -- 구매자명
	BUYR_CP_NO       VARCHAR(200)  NULL     COMMENT '구매자휴대폰번호', -- 구매자휴대폰번호
	BUYR_TEL_NO      VARCHAR(200)  NULL     COMMENT '구매자전화번호', -- 구매자전화번호
	BUYR_EMAIL       VARCHAR(500)  NULL     COMMENT '구매자이메일', -- 구매자이메일
	BUYR_IP_ADDR     VARCHAR(200)  NULL     COMMENT '구매자아이피주소', -- 구매자아이피주소
	BUYR_ORD_AGR_YN  VARCHAR(1)    NULL     COMMENT '구매자주문동의여부', -- 구매자주문동의여부
	BUYR_ORD_AGR_DT  DATE          NULL     COMMENT '구매자주문동의일시', -- 구매자주문동의일시
	FST_PAY_MTHD     VARCHAR(1000) NULL     COMMENT '최초결제수단', -- 최초결제수단
	FST_ORD_AMT      INTEGER       NOT NULL COMMENT '최초주문금액', -- 최초주문금액
	FST_CPN_DC_AMT   INTEGER       NOT NULL COMMENT '최초쿠폰할인금액', -- 최초쿠폰할인금액
	FST_PT_USE_AMT   INTEGER       NOT NULL COMMENT '최초포인트사용금액', -- 최초포인트사용금액
	FST_REAL_ORD_AMT INTEGER       NOT NULL COMMENT '최초실주문금액', -- 최초실주문금액
	FST_REAL_PAY_AMT INTEGER       NOT NULL COMMENT '최초실결제금액', -- 최초실결제금액
	PAY_MTHD         VARCHAR(1000) NULL     COMMENT '결제수단', -- 결제수단
	ORD_AMT          INTEGER       NOT NULL COMMENT '주문금액', -- 주문금액
	CPN_DC_AMT       INTEGER       NOT NULL COMMENT '쿠폰할인금액', -- 쿠폰할인금액
	PT_USE_AMT       INTEGER       NOT NULL COMMENT '포인트사용금액', -- 포인트사용금액
	REAL_ORD_AMT     INTEGER       NOT NULL COMMENT '실주문금액', -- 실주문금액
	REAL_PAY_AMT     INTEGER       NOT NULL COMMENT '실결제금액', -- 실결제금액
	PG_SPLY_AMT      INTEGER       NULL     COMMENT 'PG공급금액', -- PG공급금액
	PG_VAT_AMT       INTEGER       NULL     COMMENT 'PG부가가치세금액', -- PG부가가치세금액
	PG_TAXFREE_AMT   INTEGER       NULL     COMMENT 'PG면세금액', -- PG면세금액
	PAY_CPLT_DT      DATE          NULL     COMMENT '결제완료일시', -- 결제완료일시
	REG_DT           TIMESTAMP     NOT NULL COMMENT '등록일시', -- 등록일시
	REG_ID           VARCHAR(20)   NULL     COMMENT '등록아이디', -- 등록아이디
	MOD_DT           TIMESTAMP     NOT NULL COMMENT '수정일시', -- 수정일시
	MOD_ID           VARCHAR(20)   NULL     COMMENT '수정아이디' -- 수정아이디
)
COMMENT '주문변경기록';

-- 주문변경기록
ALTER TABLE ORD_CHIST
	ADD CONSTRAINT PK_ORD_CHIST -- 주문변경기록 기본키
		PRIMARY KEY (
			ORD_CHIST_ID -- 주문변경기록식별번호
		);

-- 게시판글답변
CREATE TABLE BBS_ART_RPLY (
	BBS_ART_RPLY_ID INTEGER       NOT NULL COMMENT '게시판글답변식별번호', -- 게시판글답변식별번호
	BBS_ART_ID      INTEGER       NOT NULL COMMENT '게시판글식별번호', -- 게시판글식별번호
	MBR_ID          VARCHAR(20)   NULL     COMMENT '회원식별번호', -- 회원식별번호
	ADM_ID          VARCHAR(20)   NULL     COMMENT '관리자식별번호', -- 관리자식별번호
	RPLY_CONT       VARCHAR(4000) NULL     COMMENT '답변내용', -- 답변내용
	RPLY_STAT_CD    VARCHAR(100)  NULL     COMMENT '답변상태코드', -- 답변상태코드
	ATCH_GID        INTEGER       NULL     COMMENT '첨부그룹식별번호', -- 첨부그룹식별번호
	REG_DT          TIMESTAMP     NOT NULL COMMENT '등록일시', -- 등록일시
	REG_ID          VARCHAR(20)   NULL     COMMENT '등록아이디', -- 등록아이디
	MOD_DT          TIMESTAMP     NOT NULL COMMENT '수정일시', -- 수정일시
	MOD_ID          VARCHAR(20)   NULL     COMMENT '수정아이디', -- 수정아이디
	USE_YN          VARCHAR(1)    NOT NULL COMMENT '사용여부' -- 사용여부
)
COMMENT '게시판글답변';

-- 게시판글답변
ALTER TABLE BBS_ART_RPLY
	ADD CONSTRAINT PK_BBS_ART_RPLY -- 게시판글답변 기본키
		PRIMARY KEY (
			BBS_ART_RPLY_ID -- 게시판글답변식별번호
		);

-- 게시판글
CREATE TABLE BBS_ART (
	BBS_ART_ID    INTEGER      NOT NULL COMMENT '게시판글식별번호', -- 게시판글식별번호
	BBS_CD        VARCHAR(100) NOT NULL COMMENT '게시판코드', -- 게시판코드
	MBR_ID        VARCHAR(20)  NULL     COMMENT '회원식별번호', -- 회원식별번호
	ADM_ID        VARCHAR(20)  NULL     COMMENT '관리자식별번호', -- 관리자식별번호
	RMK_ID        INTEGER      NULL     COMMENT '관련식별번호', -- 관련식별번호
	WRTR_NM       VARCHAR(200) NULL     COMMENT '작성자명', -- 작성자명
	ART_TIT       VARCHAR(200) NULL     COMMENT '글제목', -- 글제목
	ART_CONT      VARCHAR(4000)NULL     COMMENT '글내용', -- 글내용
	LINK_URL_ADDR VARCHAR(500) NULL     COMMENT '링크URL주소', -- 링크URL주소
	CATE_1_CD     VARCHAR(100) NULL     COMMENT '카테고리1코드', -- 카테고리1코드
	CATE_2_CD     VARCHAR(100) NULL     COMMENT '카테고리2코드', -- 카테고리2코드
	ATCH_GID      INTEGER      NULL     COMMENT '첨부그룹식별번호', -- 첨부그룹식별번호
	DP_YN         VARCHAR(1)   NULL     COMMENT '전시여부', -- 전시여부
	DP_ST_DT      DATE         NULL     COMMENT '전시시작일시', -- 전시시작일시
	DP_ED_DT      DATE         NULL     COMMENT '전시종료일시', -- 전시종료일시
	READ_CNT      NUMERIC(9)    NULL     COMMENT '조회수', -- 조회수
	SORD          NUMERIC(5)    NULL     COMMENT '정렬순서', -- 정렬순서
	REG_DT        TIMESTAMP    NOT NULL COMMENT '등록일시', -- 등록일시
	REG_ID        VARCHAR(20)  NULL     COMMENT '등록아이디', -- 등록아이디
	MOD_DT        TIMESTAMP    NOT NULL COMMENT '수정일시', -- 수정일시
	MOD_ID        VARCHAR(20)  NULL     COMMENT '수정아이디', -- 수정아이디
	USE_YN        VARCHAR(1)   NOT NULL COMMENT '사용여부' -- 사용여부
)
COMMENT '게시판글';

-- 게시판글
ALTER TABLE BBS_ART
	ADD CONSTRAINT PK_BBS_ART -- 게시판글 기본키
		PRIMARY KEY (
			BBS_ART_ID -- 게시판글식별번호
		);

-- 게시판글 인덱스
CREATE INDEX IX_BBS_ART
	ON BBS_ART( -- 게시판글
		MBR_ID ASC -- 회원식별번호
	);

-- 문의
CREATE TABLE INQ (
	INQ_ID        INTEGER      NOT NULL COMMENT '문의식별번호', -- 문의식별번호
	INQ_TP_CD     VARCHAR(100) NOT NULL COMMENT '문의유형코드', -- 문의유형코드
	INQ_STAT_CD   VARCHAR(100) NOT NULL COMMENT '문의상태코드', -- 문의상태코드
	INQ_CL_CD     VARCHAR(100) NULL     COMMENT '문의구분코드', -- 문의구분코드
	INQ_CL_DTL_CD VARCHAR(100) NULL     COMMENT '문의구분상세코드', -- 문의구분상세코드
	RMK_ID        INTEGER      NULL     COMMENT '관련식별번호', -- 관련식별번호
	MBR_YN        VARCHAR(1)   NULL     COMMENT '회원여부', -- 회원여부
	MBR_ID        VARCHAR(20)  NULL     COMMENT '회원식별번호', -- 회원식별번호
	WRTR_ID_VAL   VARCHAR(100) NULL     COMMENT '작성자아이디값', -- 작성자아이디값
	WRTR_NM       VARCHAR(500) NULL     COMMENT '작성자명', -- 작성자명
	CP_CARR_CD    VARCHAR(100) NULL     COMMENT '휴대폰통신사코드', -- 휴대폰통신사코드
	CP_NO         VARCHAR(200) NULL     COMMENT '휴대폰번호', -- 휴대폰번호
	EMAIL         VARCHAR(500) NULL     COMMENT '이메일', -- 이메일
	TIT           VARCHAR(200) NOT NULL COMMENT '제목', -- 제목
	CONT          VARCHAR(4000)NOT NULL COMMENT '내용', -- 내용
	RPLY_NOTI_YN  VARCHAR(1)   NULL     COMMENT '답변알림여부', -- 답변알림여부
	PUB_YN        VARCHAR(1)   NULL     COMMENT '공개여부', -- 공개여부
	DP_YN         VARCHAR(1)   NULL     COMMENT '전시여부', -- 전시여부
	REG_ENV_CD    VARCHAR(100) NULL     COMMENT '등록환경코드', -- 등록환경코드
	ATCH_GID      INTEGER      NULL     COMMENT '첨부그룹식별번호', -- 첨부그룹식별번호
	REG_DT        TIMESTAMP    NOT NULL COMMENT '등록일시', -- 등록일시
	REG_ID        VARCHAR(20)  NULL     COMMENT '등록아이디', -- 등록아이디
	MOD_DT        TIMESTAMP    NOT NULL COMMENT '수정일시', -- 수정일시
	MOD_ID        VARCHAR(20)  NULL     COMMENT '수정아이디', -- 수정아이디
	USE_YN        VARCHAR(1)   NOT NULL COMMENT '사용여부' -- 사용여부
)
COMMENT '문의';

-- 문의
ALTER TABLE INQ
	ADD CONSTRAINT PK_INQ -- 문의 기본키
		PRIMARY KEY (
			INQ_ID -- 문의식별번호
		);

-- 문의 인덱스
CREATE INDEX IX_INQ
	ON INQ( -- 문의
		MBR_ID ASC -- 회원식별번호
	);

-- 문의답변
CREATE TABLE INQ_RPLY (
	INQ_RPLY_ID  INTEGER     NOT NULL COMMENT '문의답변식별번호', -- 문의답변식별번호
	INQ_ID       INTEGER     NOT NULL COMMENT '문의식별번호', -- 문의식별번호
	ADM_ID       VARCHAR(20) NULL     COMMENT '관리자식별번호', -- 관리자식별번호
	CONT         VARCHAR(4000)NULL     COMMENT '내용', -- 내용
	TEMP_SAVE_YN VARCHAR(1)  NULL     COMMENT '임시저장여부', -- 임시저장여부
	ATCH_GID     INTEGER     NULL     COMMENT '첨부그룹식별번호', -- 첨부그룹식별번호
	REG_DT       TIMESTAMP   NOT NULL COMMENT '등록일시', -- 등록일시
	REG_ID       VARCHAR(20) NULL     COMMENT '등록아이디', -- 등록아이디
	MOD_DT       TIMESTAMP   NOT NULL COMMENT '수정일시', -- 수정일시
	MOD_ID       VARCHAR(20) NULL     COMMENT '수정아이디', -- 수정아이디
	USE_YN       VARCHAR(1)  NOT NULL COMMENT '사용여부' -- 사용여부
)
COMMENT '문의답변';

-- 문의답변
ALTER TABLE INQ_RPLY
	ADD CONSTRAINT PK_INQ_RPLY -- 문의답변 기본키
		PRIMARY KEY (
			INQ_RPLY_ID -- 문의답변식별번호
		);

-- 쿠폰사용환경
CREATE TABLE CPN_USE_ENV (
	CPN_ID         INTEGER      NOT NULL COMMENT '쿠폰식별번호', -- 쿠폰식별번호
	CPN_USE_ENV_CD VARCHAR(100) NOT NULL COMMENT '쿠폰사용환경코드', -- 쿠폰사용환경코드
	REG_DT         TIMESTAMP    NOT NULL COMMENT '등록일시', -- 등록일시
	REG_ID         VARCHAR(20)  NULL     COMMENT '등록아이디' -- 등록아이디
)
COMMENT '쿠폰사용환경';

-- 쿠폰사용환경
ALTER TABLE CPN_USE_ENV
	ADD CONSTRAINT PK_CPN_USE_ENV -- 쿠폰사용환경 기본키
		PRIMARY KEY (
			CPN_ID,         -- 쿠폰식별번호
			CPN_USE_ENV_CD  -- 쿠폰사용환경코드
		);

-- 쿠폰
CREATE TABLE CPN (
	CPN_ID                INTEGER      NOT NULL COMMENT '쿠폰식별번호', -- 쿠폰식별번호
	VEN_ID                INTEGER      NOT NULL COMMENT '업체식별번호', -- 업체식별번호
	CPN_TP_CD             VARCHAR(100) NOT NULL COMMENT '쿠폰유형코드', -- 쿠폰유형코드
	CPN_CL_CD             VARCHAR(100) NOT NULL COMMENT '쿠폰구분코드', -- 쿠폰구분코드
	CPN_AUTO_CL_CD        VARCHAR(100) NULL     COMMENT '쿠폰자동구분코드', -- 쿠폰자동구분코드
	CPN_STAT_CD           VARCHAR(100) NOT NULL COMMENT '쿠폰상태코드', -- 쿠폰상태코드
	CPN_NO                VARCHAR(100) NOT NULL COMMENT '쿠폰번호', -- 쿠폰번호
	CPN_NM                VARCHAR(200) NOT NULL COMMENT '쿠폰명', -- 쿠폰명
	ISU_TGT_TP_CD         VARCHAR(100) NULL     COMMENT '발급대상유형코드', -- 발급대상유형코드
	ISU_TGT_ITEM_TP_CD    VARCHAR(100) NULL     COMMENT '발급대상상품유형코드', -- 발급대상상품유형코드
	ISU_TGT_MBR_GRD_CD    VARCHAR(100) NULL     COMMENT '발급대상회원등급코드', -- 발급대상회원등급코드
	ISU_METH_TP_CD        VARCHAR(100) NOT NULL COMMENT '발급방식유형코드', -- 발급방식유형코드
	ISU_METH_DL_TP_CD     VARCHAR(100) NULL     COMMENT '발급방식다운로드유형코드', -- 발급방식다운로드유형코드
	ISU_METH_RDNB_TP_CD   VARCHAR(100) NULL     COMMENT '발급방식난수유형코드', -- 발급방식난수유형코드
	ISU_URL               VARCHAR(500) NULL     COMMENT '발급URL', -- 발급URL
	ISU_FIX_RDNB_NO       VARCHAR(100) NULL     COMMENT '발급고정난수번호', -- 발급고정난수번호
	ISU_RES_QTY_YN        VARCHAR(1)   NOT NULL DEFAULT 'N' COMMENT '발급제한수량여부', -- 발급제한수량여부
	ISU_RES_QTY           NUMERIC(9)    NULL     COMMENT '발급제한수량', -- 발급제한수량
	VLD_PERD_TP_CD        VARCHAR(100) NOT NULL COMMENT '유효기간유형코드', -- 유효기간유형코드
	VLD_PERD_ST_YMD       VARCHAR(8)   NULL     COMMENT '유효기간시작일자', -- 유효기간시작일자
	VLD_PERD_ED_YMD       VARCHAR(8)   NULL     COMMENT '유효기간종료일자', -- 유효기간종료일자
	VLD_PERD_USE_STD_CD   VARCHAR(100) NULL     COMMENT '유효기간사용기준코드', -- 유효기간사용기준코드
	VLD_PERD_USE_TP_CD    VARCHAR(100) NULL     COMMENT '유효기간사용유형코드', -- 유효기간사용유형코드
	VLD_PERD_USE_DAY_CNT  NUMERIC(5)    NULL     COMMENT '유효기간사용일수', -- 유효기간사용일수
	DC_METH_CD            VARCHAR(100) NULL     COMMENT '할인방식코드', -- 할인방식코드
	DC_AMT                INTEGER      NULL     COMMENT '할인금액', -- 할인금액
	DC_RATE               NUMERIC(5,2)  NULL     COMMENT '할인율', -- 할인율
	DC_RATE_MAX_AMT       INTEGER      NULL     COMMENT '할인율최대금액', -- 할인율최대금액
	DC_RES_MIN_BUY_AMT_YN VARCHAR(1)   NOT NULL DEFAULT 'N' COMMENT '할인제한최소구매금액여부', -- 할인제한최소구매금액여부
	DC_RES_MIN_BUY_AMT    INTEGER      NULL     COMMENT '할인제한최소구매금액', -- 할인제한최소구매금액
	DC_ADD_DC_CPN_YN      VARCHAR(1)   NOT NULL DEFAULT 'N' COMMENT '할인추가할인쿠폰여부', -- 할인추가할인쿠폰여부
	BASE_CPN_YN           VARCHAR(1)   NOT NULL DEFAULT 'N' COMMENT '기본쿠폰여부', -- 기본쿠폰여부
	REG_DT                TIMESTAMP    NOT NULL COMMENT '등록일시', -- 등록일시
	REG_ID                VARCHAR(20)  NULL     COMMENT '등록아이디', -- 등록아이디
	MOD_DT                TIMESTAMP    NOT NULL COMMENT '수정일시', -- 수정일시
	MOD_ID                VARCHAR(20)  NULL     COMMENT '수정아이디', -- 수정아이디
	USE_YN                VARCHAR(1)   NOT NULL COMMENT '사용여부' -- 사용여부
)
COMMENT '쿠폰';

-- 쿠폰
ALTER TABLE CPN
	ADD CONSTRAINT PK_CPN -- 쿠폰 기본키
		PRIMARY KEY (
			CPN_ID -- 쿠폰식별번호
		);

-- 쿠폰대상사은품매핑
CREATE TABLE CPN_TGT_FRGT_MAP (
	CPN_ID       INTEGER     NOT NULL COMMENT '쿠폰식별번호', -- 쿠폰식별번호
	ITEM_FRGT_ID INTEGER     NOT NULL COMMENT '상품사은품식별번호', -- 상품사은품식별번호
	REG_DT       TIMESTAMP   NOT NULL COMMENT '등록일시', -- 등록일시
	REG_ID       VARCHAR(20) NULL     COMMENT '등록아이디' -- 등록아이디
)
COMMENT '쿠폰대상사은품매핑';

-- 쿠폰대상사은품매핑
ALTER TABLE CPN_TGT_FRGT_MAP
	ADD CONSTRAINT PK_CPN_TGT_FRGT_MAP -- 쿠폰대상사은품매핑 기본키
		PRIMARY KEY (
			CPN_ID,       -- 쿠폰식별번호
			ITEM_FRGT_ID  -- 상품사은품식별번호
		);

-- 쿠폰대상제휴협력사매핑
CREATE TABLE CPN_TGT_AFF_PTN_MAP (
	CPN_ID INTEGER     NOT NULL COMMENT '쿠폰식별번호', -- 쿠폰식별번호
	VEN_ID INTEGER     NOT NULL COMMENT '업체식별번호', -- 업체식별번호
	REG_DT TIMESTAMP   NOT NULL COMMENT '등록일시', -- 등록일시
	REG_ID VARCHAR(20) NULL     COMMENT '등록아이디' -- 등록아이디
)
COMMENT '쿠폰대상제휴협력사매핑';

-- 쿠폰대상제휴협력사매핑
ALTER TABLE CPN_TGT_AFF_PTN_MAP
	ADD CONSTRAINT PK_CPN_TGT_AFF_PTN_MAP -- 쿠폰대상제휴협력사매핑 기본키
		PRIMARY KEY (
			CPN_ID, -- 쿠폰식별번호
			VEN_ID  -- 업체식별번호
		);

-- 쿠폰대상상품카테고리매핑
CREATE TABLE CPN_TGT_ITEM_CATE_MAP (
	CPN_ID     INTEGER     NOT NULL COMMENT '쿠폰식별번호', -- 쿠폰식별번호
	DP_CATE_ID INTEGER     NOT NULL COMMENT '전시카테고리식별번호', -- 전시카테고리식별번호
	REG_DT     TIMESTAMP   NOT NULL COMMENT '등록일시', -- 등록일시
	REG_ID     VARCHAR(20) NULL     COMMENT '등록아이디' -- 등록아이디
)
COMMENT '쿠폰대상상품카테고리매핑';

-- 쿠폰대상상품카테고리매핑
ALTER TABLE CPN_TGT_ITEM_CATE_MAP
	ADD CONSTRAINT PK_CPN_TGT_ITEM_CATE_MAP -- 쿠폰대상상품카테고리매핑 기본키
		PRIMARY KEY (
			CPN_ID,     -- 쿠폰식별번호
			DP_CATE_ID  -- 전시카테고리식별번호
		);

-- 쿠폰난수
CREATE TABLE CPN_RDNB (
	CPN_RDNB_ID INTEGER      NOT NULL COMMENT '쿠폰난수식별번호', -- 쿠폰난수식별번호
	CPN_ID      INTEGER      NOT NULL COMMENT '쿠폰식별번호', -- 쿠폰식별번호
	MBR_CPN_ID  INTEGER      NULL     COMMENT '회원쿠폰식별번호', -- 회원쿠폰식별번호
	CPN_RDNB    VARCHAR(100) NOT NULL COMMENT '쿠폰난수', -- 쿠폰난수
	APLY_YN     VARCHAR(1)   NOT NULL COMMENT '적용여부', -- 적용여부
	REG_DT      TIMESTAMP    NOT NULL COMMENT '등록일시', -- 등록일시
	REG_ID      VARCHAR(20)  NULL     COMMENT '등록아이디', -- 등록아이디
	USE_YN      VARCHAR(1)   NOT NULL COMMENT '사용여부' -- 사용여부
)
COMMENT '쿠폰난수';

-- 쿠폰난수
ALTER TABLE CPN_RDNB
	ADD CONSTRAINT PK_CPN_RDNB -- 쿠폰난수 기본키
		PRIMARY KEY (
			CPN_RDNB_ID -- 쿠폰난수식별번호
		);

-- 쿠폰대상회원매핑
CREATE TABLE CPN_TGT_MBR_MAP (
	CPN_ID INTEGER     NOT NULL COMMENT '쿠폰식별번호', -- 쿠폰식별번호
	MBR_ID VARCHAR(20) NOT NULL COMMENT '회원식별번호', -- 회원식별번호
	REG_DT TIMESTAMP   NOT NULL COMMENT '등록일시', -- 등록일시
	REG_ID VARCHAR(20) NULL     COMMENT '등록아이디' -- 등록아이디
)
COMMENT '쿠폰대상회원매핑';

-- 쿠폰대상회원매핑
ALTER TABLE CPN_TGT_MBR_MAP
	ADD CONSTRAINT PK_CPN_TGT_MBR_MAP -- 쿠폰대상회원매핑 기본키
		PRIMARY KEY (
			CPN_ID, -- 쿠폰식별번호
			MBR_ID  -- 회원식별번호
		);

-- 쿠폰대상상품속성매핑
CREATE TABLE CPN_TGT_ITEM_ATTR_MAP (
	CPN_ID          INTEGER      NOT NULL COMMENT '쿠폰식별번호', -- 쿠폰식별번호
	ITEM_ATTR_TP_CD VARCHAR(100) NOT NULL COMMENT '상품속성유형코드', -- 상품속성유형코드
	REG_DT          TIMESTAMP    NOT NULL COMMENT '등록일시', -- 등록일시
	REG_ID          VARCHAR(20)  NULL     COMMENT '등록아이디' -- 등록아이디
)
COMMENT '쿠폰대상상품속성매핑';

-- 쿠폰대상상품속성매핑
ALTER TABLE CPN_TGT_ITEM_ATTR_MAP
	ADD CONSTRAINT PK_CPN_TGT_ITEM_ATTR_MAP -- 쿠폰대상상품속성매핑 기본키
		PRIMARY KEY (
			CPN_ID,          -- 쿠폰식별번호
			ITEM_ATTR_TP_CD  -- 상품속성유형코드
		);

-- 쿠폰대상상품매핑
CREATE TABLE CPN_TGT_ITEM_MAP (
	CPN_ID             INTEGER      NOT NULL COMMENT '쿠폰식별번호', -- 쿠폰식별번호
	ITEM_ID            INTEGER      NOT NULL COMMENT '상품식별번호', -- 상품식별번호
	ISU_TGT_ITEM_CL_CD VARCHAR(100) NOT NULL COMMENT '발급대상상품구분코드', -- 발급대상상품구분코드
	REG_DT             TIMESTAMP    NOT NULL COMMENT '등록일시', -- 등록일시
	REG_ID             VARCHAR(20)  NULL     COMMENT '등록아이디' -- 등록아이디
)
COMMENT '쿠폰대상상품매핑';

-- 쿠폰대상상품매핑
ALTER TABLE CPN_TGT_ITEM_MAP
	ADD CONSTRAINT PK_CPN_TGT_ITEM_MAP -- 쿠폰대상상품매핑 기본키
		PRIMARY KEY (
			CPN_ID,  -- 쿠폰식별번호
			ITEM_ID  -- 상품식별번호
		);

-- 쿠폰대상상품브랜드매핑
CREATE TABLE CPN_TGT_ITEM_BRND_MAP (
	CPN_ID     INTEGER     NOT NULL COMMENT '쿠폰식별번호', -- 쿠폰식별번호
	DP_BRND_ID INTEGER     NOT NULL COMMENT '전시브랜드식별번호', -- 전시브랜드식별번호
	REG_DT     TIMESTAMP   NOT NULL COMMENT '등록일시', -- 등록일시
	REG_ID     VARCHAR(20) NULL     COMMENT '등록아이디' -- 등록아이디
)
COMMENT '쿠폰대상상품브랜드매핑';

-- 쿠폰대상상품브랜드매핑
ALTER TABLE CPN_TGT_ITEM_BRND_MAP
	ADD CONSTRAINT PK_CPN_TGT_ITEM_BRND_MAP -- 쿠폰대상상품브랜드매핑 기본키
		PRIMARY KEY (
			CPN_ID,     -- 쿠폰식별번호
			DP_BRND_ID  -- 전시브랜드식별번호
		);

-- 포인트정책
CREATE TABLE PNT_PCY (
	PT_TP_CD     VARCHAR(100) NOT NULL COMMENT '포인트유형코드', -- 포인트유형코드
	SAVE_UNIT_CD VARCHAR(100) NOT NULL COMMENT '적립단위코드', -- 적립단위코드
	SAVE_RATE    NUMERIC(5,2)  NULL     COMMENT '적립률', -- 적립률
	SAVE_AMT     INTEGER      NULL     COMMENT '적립금액', -- 적립금액
	REG_DT       TIMESTAMP    NOT NULL COMMENT '등록일시', -- 등록일시
	REG_ID       VARCHAR(20)  NULL     COMMENT '등록아이디', -- 등록아이디
	MOD_DT       TIMESTAMP    NOT NULL COMMENT '수정일시', -- 수정일시
	MOD_ID       VARCHAR(20)  NULL     COMMENT '수정아이디', -- 수정아이디
	USE_YN       VARCHAR(1)   NOT NULL COMMENT '사용여부' -- 사용여부
)
COMMENT '포인트정책';

-- 포인트정책
ALTER TABLE PNT_PCY
	ADD CONSTRAINT PK_PNT_PCY -- 포인트정책 기본키
		PRIMARY KEY (
			PT_TP_CD -- 포인트유형코드
		);

-- 포인트정책출석체크
CREATE TABLE PNT_PCY_ATND (
	PT_TP_CD          VARCHAR(100) NOT NULL COMMENT '포인트유형코드', -- 포인트유형코드
	PT_CHG_DT         VARCHAR(8)   NULL     COMMENT '포인트변경일시', -- 포인트변경일시
	PT_CHG_BF_AMT     INTEGER      NULL     COMMENT '포인트변경전금액', -- 포인트변경전금액
	ATND_PRGS_YN      VARCHAR(1)   NOT NULL COMMENT '출석진행여부', -- 출석진행여부
	ATND_PRGS_STOP_DT DATE         NULL     COMMENT '출석진행중지일시', -- 출석진행중지일시
	DP_YN             VARCHAR(1)   NOT NULL COMMENT '전시여부', -- 전시여부
	REG_DT            TIMESTAMP    NOT NULL COMMENT '등록일시', -- 등록일시
	REG_ID            VARCHAR(20)  NULL     COMMENT '등록아이디', -- 등록아이디
	MOD_DT            TIMESTAMP    NOT NULL COMMENT '수정일시', -- 수정일시
	MOD_ID            VARCHAR(20)  NULL     COMMENT '수정아이디' -- 수정아이디
)
COMMENT '포인트정책출석체크';

-- 포인트정책출석체크
ALTER TABLE PNT_PCY_ATND
	ADD CONSTRAINT PK_PNT_PCY_ATND -- 포인트정책출석체크 기본키
		PRIMARY KEY (
			PT_TP_CD -- 포인트유형코드
		);

-- 포인트
CREATE TABLE PNT (
	PT_ID           INTEGER       NOT NULL COMMENT '포인트식별번호', -- 포인트식별번호
	MBR_ID          VARCHAR(20)   NOT NULL COMMENT '회원식별번호', -- 회원식별번호
	PT_TP_CD        VARCHAR(100)  NOT NULL COMMENT '포인트유형코드', -- 포인트유형코드
	PT_PROC_TP_CD   VARCHAR(100)  NOT NULL COMMENT '포인트처리유형코드', -- 포인트처리유형코드
	PT_RSN_TP_CD    VARCHAR(100)  NULL     COMMENT '포인트사유유형코드', -- 포인트사유유형코드
	PT_RSN          VARCHAR(1000) NULL     COMMENT '포인트사유', -- 포인트사유
	PT_AMT          INTEGER       NOT NULL COMMENT '적립/차감 요청한 금액에서 실제로 적용된 금액', -- 포인트금액
	PT_VLD_ED_DT    TIMESTAMP     NOT NULL COMMENT '포인트유효종료일시', -- 포인트유효종료일시
	PT_USE_PSBL_AMT INTEGER       NOT NULL COMMENT '포인트사용가능금액', -- 포인트사용가능금액
	VEN_ID          INTEGER       NULL     COMMENT '업체식별번호', -- 업체식별번호
	ORD_ITEM_ID     INTEGER       NULL     COMMENT '주문상품식별번호', -- 주문상품식별번호
	ITEM_ID         INTEGER       NULL     COMMENT '상품식별번호', -- 상품식별번호
	PT_ADM_PROC_ID  INTEGER       NULL     COMMENT '포인트관리자처리식별번호', -- 포인트관리자처리식별번호
	EVNT_ATND_ID    INTEGER       NULL     COMMENT '이벤트출석식별번호', -- 이벤트출석식별번호
	REG_DT          TIMESTAMP     NOT NULL COMMENT '등록일시', -- 등록일시
	REG_ID          VARCHAR(20)   NULL     COMMENT '등록아이디', -- 등록아이디
	MOD_DT          TIMESTAMP     NOT NULL COMMENT '수정일시', -- 수정일시
	MOD_ID          VARCHAR(20)   NULL     COMMENT '수정아이디' -- 수정아이디
)
COMMENT '포인트';

-- 포인트
ALTER TABLE PNT
	ADD CONSTRAINT PK_PNT -- 포인트 기본키
		PRIMARY KEY (
			PT_ID -- 포인트식별번호
		);

-- 포인트 인덱스
CREATE INDEX IX_PNT
	ON PNT( -- 포인트
		MBR_ID ASC -- 회원식별번호
	);

-- 포인트 인덱스2
CREATE INDEX IX_PNT2
	ON PNT( -- 포인트
		PT_VLD_ED_DT ASC -- 포인트유효종료일시
	);

-- 포인트정책변경이력
CREATE TABLE PNT_PCY_CHIST (
	PT_PCY_CHIST_ID INTEGER      NOT NULL COMMENT '포인트정책변경기록식별번호', -- 포인트정책변경기록식별번호
	PT_TP_CD        VARCHAR(100) NOT NULL COMMENT '포인트유형코드', -- 포인트유형코드
	SAVE_UNIT_CD    VARCHAR(100) NULL     COMMENT '적립단위코드', -- 적립단위코드
	SAVE_RATE       NUMERIC(5,2)  NULL     COMMENT '적립률', -- 적립률
	SAVE_AMT        INTEGER      NULL     COMMENT '적립금액', -- 적립금액
	REG_DT          TIMESTAMP    NOT NULL COMMENT '등록일시', -- 등록일시
	REG_ID          VARCHAR(20)  NULL     COMMENT '등록아이디', -- 등록아이디
	MOD_DT          TIMESTAMP    NOT NULL COMMENT '수정일시', -- 수정일시
	MOD_ID          VARCHAR(20)  NULL     COMMENT '수정아이디', -- 수정아이디
	USE_YN          VARCHAR(1)   NOT NULL COMMENT '사용여부' -- 사용여부
)
COMMENT '포인트정책변경이력';

-- 포인트정책변경이력
ALTER TABLE PNT_PCY_CHIST
	ADD CONSTRAINT PK_PNT_PCY_CHIST -- 포인트정책변경이력 기본키
		PRIMARY KEY (
			PT_PCY_CHIST_ID -- 포인트정책변경기록식별번호
		);

-- 포인트관리자처리
CREATE TABLE PNT_ADM_PROC (
	PT_ADM_PROC_ID INTEGER       NOT NULL COMMENT '포인트관리자처리식별번호', -- 포인트관리자처리식별번호
	PT_PROC_TP_CD  VARCHAR(100)  NOT NULL COMMENT '포인트처리유형코드', -- 포인트처리유형코드
	MBR_GRD_CD     VARCHAR(100)  NULL     COMMENT '회원등급코드', -- 회원등급코드
	PT_RSN_TP_CD   VARCHAR(100)  NOT NULL COMMENT '포인트사유유형코드', -- 포인트사유유형코드
	PT_RSN         VARCHAR(1000) NULL     COMMENT '포인트사유', -- 포인트사유
	NOTE           VARCHAR(2000) NULL     COMMENT '비고', -- 비고
	PT_AMT         INTEGER       NOT NULL COMMENT '적립/차감 요청한 금액에서 실제로 적용된 금액', -- 포인트금액
	REG_DT         TIMESTAMP     NOT NULL COMMENT '등록일시', -- 등록일시
	REG_ID         VARCHAR(20)   NULL     COMMENT '등록아이디', -- 등록아이디
	MOD_DT         TIMESTAMP     NOT NULL COMMENT '수정일시', -- 수정일시
	MOD_ID         VARCHAR(20)   NULL     COMMENT '수정아이디', -- 수정아이디
	USE_YN         VARCHAR(1)    NOT NULL COMMENT '사용여부' -- 사용여부
)
COMMENT '포인트관리자처리';

-- 포인트관리자처리
ALTER TABLE PNT_ADM_PROC
	ADD CONSTRAINT PK_PNT_ADM_PROC -- 포인트관리자처리 기본키
		PRIMARY KEY (
			PT_ADM_PROC_ID -- 포인트관리자처리식별번호
		);

-- 정산사은품
CREATE TABLE SETTL_FRGT (
	SETTL_YMD        VARCHAR(8)   NOT NULL COMMENT '정산일자', -- 정산일자
	SETTL_FRGT_TP_CD VARCHAR(100) NOT NULL COMMENT '정산사은품유형코드', -- 정산사은품유형코드
	SETTL_ORD_TP_CD  VARCHAR(100) NOT NULL COMMENT '정산주문유형코드', -- 정산주문유형코드
	REQ_QTY          NUMERIC(9)    NOT NULL COMMENT '신청수량', -- 신청수량
	ORI_PRC_AMT      INTEGER      NOT NULL COMMENT '원가금액', -- 원가금액
	IF_SND_YN        VARCHAR(1)   NOT NULL COMMENT '인터페이스송신여부', -- 인터페이스송신여부
	IF_SND_DT        DATE         NULL     COMMENT '인터페이스송신일시', -- 인터페이스송신일시
	REG_DT           TIMESTAMP    NOT NULL COMMENT '등록일시', -- 등록일시
	REG_ID           VARCHAR(20)  NULL     COMMENT '등록아이디' -- 등록아이디
)
COMMENT '정산사은품';

-- 정산사은품
ALTER TABLE SETTL_FRGT
	ADD CONSTRAINT PK_SETTL_FRGT -- 정산사은품 기본키
		PRIMARY KEY (
			SETTL_YMD,        -- 정산일자
			SETTL_FRGT_TP_CD, -- 정산사은품유형코드
			SETTL_ORD_TP_CD   -- 정산주문유형코드
		);

-- 정산일반상품
CREATE TABLE SETTL_GNRL_ITEM (
	SETTL_YMD         VARCHAR(8)   NOT NULL COMMENT '정산일자', -- 정산일자
	SEQ               NUMERIC(5)    NOT NULL COMMENT '순번', -- 순번
	SETTL_ORD_TP_CD   VARCHAR(100) NOT NULL COMMENT '정산주문유형코드', -- 정산주문유형코드
	ORD_RSN           VARCHAR(100) NOT NULL COMMENT '오더사유', -- 오더사유
	ORD_TP_CD         VARCHAR(100) NOT NULL COMMENT '주문유형코드', -- 주문유형코드
	SL_RVRS_VEN_ID    INTEGER      NOT NULL COMMENT '매출귀속업체식별번호', -- 매출귀속업체식별번호
	DP_CH_ID          INTEGER      NOT NULL COMMENT '전시채널식별번호', -- 전시채널식별번호
	SSG_CD            VARCHAR(20)  NOT NULL COMMENT 'SSG코드', -- SSG코드
	MID               VARCHAR(20)  NULL     COMMENT '상점아이디', -- 상점아이디
	ITEM_SPLY_PRC     INTEGER      NOT NULL COMMENT '상품공급가격', -- 상품공급가격
	ORD_QTY           NUMERIC(9)    NOT NULL COMMENT '주문수량', -- 주문수량
	SELL_QTY          NUMERIC(9)    NOT NULL COMMENT '판매수량', -- 판매수량
	RGUR_PRC_SELL_AMT INTEGER      NOT NULL COMMENT '정상가격판매금액', -- 정상가격판매금액
	DC_AMT            INTEGER      NOT NULL COMMENT '할인금액', -- 할인금액
	SELL_AMT          INTEGER      NOT NULL COMMENT '판매금액', -- 판매금액
	CPN_DC_AMT        INTEGER      NOT NULL COMMENT '쿠폰할인금액', -- 쿠폰할인금액
	PT_USE_AMT        INTEGER      NOT NULL COMMENT '포인트사용금액', -- 포인트사용금액
	FNL_SELL_AMT      INTEGER      NOT NULL COMMENT '최종판매금액', -- 최종판매금액
	IF_SND_YN         VARCHAR(1)   NOT NULL COMMENT '인터페이스송신여부', -- 인터페이스송신여부
	IF_SND_DT         DATE         NULL     COMMENT '인터페이스송신일시', -- 인터페이스송신일시
	REG_DT            TIMESTAMP    NOT NULL COMMENT '등록일시', -- 등록일시
	REG_ID            VARCHAR(20)  NULL     COMMENT '등록아이디' -- 등록아이디
)
COMMENT '정산일반상품';

-- 정산일반상품
ALTER TABLE SETTL_GNRL_ITEM
	ADD CONSTRAINT PK_SETTL_GNRL_ITEM -- 정산일반상품 기본키
		PRIMARY KEY (
			SETTL_YMD, -- 정산일자
			SEQ        -- 순번
		);

-- 정산일반상품 유니크 인덱스
CREATE UNIQUE INDEX UIX_SETTL_GNRL_ITEM
	ON SETTL_GNRL_ITEM ( -- 정산일반상품
		SETTL_YMD ASC,       -- 정산일자
		SETTL_ORD_TP_CD ASC, -- 정산주문유형코드
		ORD_RSN ASC,         -- 오더사유
		ORD_TP_CD ASC,       -- 주문유형코드
		SL_RVRS_VEN_ID ASC,  -- 매출귀속업체식별번호
		DP_CH_ID ASC,        -- 전시채널식별번호
		SSG_CD ASC,          -- SSG코드
		MID ASC              -- 상점아이디
	);

-- 정산주문확정
CREATE TABLE SETTL_ORD_CFM (
	VEN_CD       VARCHAR(20)  NOT NULL COMMENT '업체코드', -- 업체코드
	SELL_YMD     VARCHAR(8)   NOT NULL COMMENT '판매일자', -- 판매일자
	WORK_SEQ     NUMERIC(5)    NOT NULL COMMENT '작업순번', -- 작업순번
	SEQ          NUMERIC(5)    NOT NULL COMMENT '순번', -- 순번
	ORD_TP       VARCHAR(100) NOT NULL COMMENT '오더유형', -- 오더유형
	ORD_RSN      VARCHAR(100) NOT NULL COMMENT '오더사유', -- 오더사유
	SSG_CD       VARCHAR(20)  NOT NULL COMMENT 'SSG코드', -- SSG코드
	SELL_QTY     NUMERIC(9)    NOT NULL COMMENT '판매수량', -- 판매수량
	SELL_UNIT    VARCHAR(100) NOT NULL COMMENT '판매단위', -- 판매단위
	SELL_AMT     INTEGER      NOT NULL COMMENT '판매금액', -- 판매금액
	PT_USE_AMT   INTEGER      NOT NULL COMMENT '포인트사용금액', -- 포인트사용금액
	FNL_SELL_AMT INTEGER      NOT NULL COMMENT '최종판매금액', -- 최종판매금액
	REG_DT       TIMESTAMP    NOT NULL COMMENT '등록일시', -- 등록일시
	REG_ID       VARCHAR(20)  NULL     COMMENT '등록아이디' -- 등록아이디
)
COMMENT '정산주문확정';

-- 정산주문확정
ALTER TABLE SETTL_ORD_CFM
	ADD CONSTRAINT PK_SETTL_ORD_CFM -- 정산주문확정 기본키
		PRIMARY KEY (
			VEN_CD,   -- 업체코드
			SELL_YMD, -- 판매일자
			WORK_SEQ, -- 작업순번
			SEQ       -- 순번
		);

-- 결제처리배치기록
CREATE TABLE PAY_PROC_BATCH_HIST (
	PAY_PROC_BATCH_HIST_ID VARCHAR(100) NOT NULL COMMENT '결제처리배치기록식별번호', -- 결제처리배치기록식별번호
	PROC_CL_CD             VARCHAR(100)  NOT NULL COMMENT '처리구분코드', -- 처리구분코드
	RSVN_SND_DT            DATE          NOT NULL COMMENT '예약발송일시', -- 예약발송일시
	PAY_ID                 INTEGER       NULL     COMMENT '결제식별번호', -- 결제식별번호
	ORD_TP_CD              VARCHAR(100)  NULL     COMMENT '주문유형코드', -- 주문유형코드
	TRAN_NO_VAL            VARCHAR(100)  NULL     COMMENT '거래번호값', -- 거래번호값
	VAL_1                  VARCHAR(1000) NULL     COMMENT '값1', -- 값1
	VAL_2                  VARCHAR(1000) NULL     COMMENT '값2', -- 값2
	VAL_3                  VARCHAR(1000) NULL     COMMENT '값3', -- 값3
	VAL_4                  VARCHAR(1000) NULL     COMMENT '값4', -- 값4
	VAL_5                  VARCHAR(1000) NULL     COMMENT '값5', -- 값5
	ERR_CNT                NUMERIC(9)     NOT NULL COMMENT '오류횟수', -- 오류횟수
	RSLT_MSG               VARCHAR(4000) NULL     COMMENT '결과메시지', -- 결과메시지
	REG_DT                 TIMESTAMP     NOT NULL COMMENT '등록일시', -- 등록일시
	REG_ID                 VARCHAR(20)   NULL     COMMENT '등록아이디', -- 등록아이디
	MOD_DT                 TIMESTAMP     NOT NULL COMMENT '수정일시', -- 수정일시
	MOD_ID                 VARCHAR(20)   NULL     COMMENT '수정아이디' -- 수정아이디
)
COMMENT '결제처리배치기록';

-- 결제처리배치기록
ALTER TABLE PAY_PROC_BATCH_HIST
	ADD CONSTRAINT PK_PAY_PROC_BATCH_HIST -- 결제처리배치기록 기본키
		PRIMARY KEY (
			PAY_PROC_BATCH_HIST_ID -- 결제처리배치기록식별번호
		);

-- 결제망취소로그
CREATE TABLE PAY_NTW_CNCL_LOG (
	PAY_NTW_CNCL_LOG_ID INTEGER     NOT NULL COMMENT '결제망취소로그식별번호', -- 결제망취소로그식별번호
	LOG_CONT            VARCHAR(4000)NOT NULL COMMENT '로그내용', -- 로그내용
	REG_DT              TIMESTAMP   NOT NULL COMMENT '등록일시', -- 등록일시
	REG_ID              VARCHAR(20) NULL     COMMENT '등록아이디' -- 등록아이디
)
COMMENT '결제망취소로그';

-- 결제망취소로그
ALTER TABLE PAY_NTW_CNCL_LOG
	ADD CONSTRAINT PK_PAY_NTW_CNCL_LOG -- 결제망취소로그 기본키
		PRIMARY KEY (
			PAY_NTW_CNCL_LOG_ID -- 결제망취소로그식별번호
		);

-- 결제처리배치큐
CREATE TABLE PAY_PROC_BATCH_QUE (
	PAY_PROC_BATCH_QUE_ID VARCHAR(100)  NOT NULL COMMENT '결제처리배치큐식별번호', -- 결제처리배치큐식별번호
	PROC_CL_CD            VARCHAR(100)  NOT NULL COMMENT '처리구분코드', -- 처리구분코드
	RSVN_SND_DT           DATE          NOT NULL COMMENT '예약발송일시', -- 예약발송일시
	PAY_ID                INTEGER       NULL     COMMENT '결제식별번호', -- 결제식별번호
	ORD_TP_CD             VARCHAR(100)  NULL     COMMENT '주문유형코드', -- 주문유형코드
	TRAN_NO_VAL           VARCHAR(100)  NULL     COMMENT '거래번호값', -- 거래번호값
	VAL_1                 VARCHAR(1000) NULL     COMMENT '값1', -- 값1
	VAL_2                 VARCHAR(1000) NULL     COMMENT '값2', -- 값2
	VAL_3                 VARCHAR(1000) NULL     COMMENT '값3', -- 값3
	VAL_4                 VARCHAR(1000) NULL     COMMENT '값4', -- 값4
	VAL_5                 VARCHAR(1000) NULL     COMMENT '값5', -- 값5
	ERR_CNT               NUMERIC(9)     NOT NULL COMMENT '오류횟수', -- 오류횟수
	RSLT_MSG              VARCHAR(4000) NULL     COMMENT '결과메시지', -- 결과메시지
	REG_DT                TIMESTAMP     NOT NULL COMMENT '등록일시', -- 등록일시
	REG_ID                VARCHAR(20)   NULL     COMMENT '등록아이디', -- 등록아이디
	MOD_DT                TIMESTAMP     NOT NULL COMMENT '수정일시', -- 수정일시
	MOD_ID                VARCHAR(20)   NULL     COMMENT '수정아이디' -- 수정아이디
)
COMMENT '결제처리배치큐';

-- 결제처리배치큐
ALTER TABLE PAY_PROC_BATCH_QUE
	ADD CONSTRAINT PK_PAY_PROC_BATCH_QUE -- 결제처리배치큐 기본키
		PRIMARY KEY (
			PAY_PROC_BATCH_QUE_ID -- 결제처리배치큐식별번호
		);

-- 결제환불배치기록
CREATE TABLE PAY_RFD_BATCH_HIST (
	PAY_RFD_BATCH_HIST_ID INTEGER       NOT NULL COMMENT '결제환불배치기록식별번호', -- 결제환불배치기록식별번호
	PAY_RFD_BATCH_QUE_ID  INTEGER       NULL     COMMENT '결제환불배치큐식별번호', -- 결제환불배치큐식별번호
	PAY_ID                INTEGER       NOT NULL COMMENT '결제식별번호', -- 결제식별번호
	PAY_PG_CD             VARCHAR(100)  NOT NULL COMMENT '결제PG코드', -- 결제PG코드
	TRAN_NO_VAL           VARCHAR(100)  NOT NULL COMMENT '거래번호값(나이스)', -- 거래번호값
	PART_CNCL_CL_VAL      VARCHAR(30)   NOT NULL COMMENT '부분취소구분값(나이스)', -- 부분취소구분값
	MID                   VARCHAR(20)   NOT NULL COMMENT '상점아이디', -- 상점아이디
	ORI_PAY_AMT           INTEGER       NULL     COMMENT '원결제금액', -- 원결제금액
	RFD_AMT               INTEGER       NOT NULL COMMENT '환불금액', -- 환불금액
	PG_SPLY_AMT           INTEGER       NULL     COMMENT 'PG공급금액', -- PG공급금액
	PG_VAT_AMT            INTEGER       NULL     COMMENT 'PG부가가치세금액', -- PG부가가치세금액
	PG_TAXFREE_AMT        INTEGER       NULL     COMMENT 'PG면세금액', -- PG면세금액
	ERR_CNT               NUMERIC(9)     NOT NULL COMMENT '오류횟수', -- 오류횟수
	RSLT_MSG              VARCHAR(4000) NULL     COMMENT '결과메시지', -- 결과메시지
	REG_DT                TIMESTAMP     NOT NULL COMMENT '등록일시', -- 등록일시
	REG_ID                VARCHAR(20)   NULL     COMMENT '등록아이디', -- 등록아이디
	MOD_DT                TIMESTAMP     NOT NULL COMMENT '수정일시', -- 수정일시
	MOD_ID                VARCHAR(20)   NULL     COMMENT '수정아이디' -- 수정아이디
)
COMMENT '결제환불배치기록';

-- 결제환불배치기록
ALTER TABLE PAY_RFD_BATCH_HIST
	ADD CONSTRAINT PK_PAY_RFD_BATCH_HIST -- 결제환불배치기록 기본키
		PRIMARY KEY (
			PAY_RFD_BATCH_HIST_ID -- 결제환불배치기록식별번호
		);

-- 결제빌링
CREATE TABLE PAY_BILL (
	PAY_BILL_ID       INTEGER      NOT NULL COMMENT '결제빌링식별번호', -- 결제빌링식별번호
	MBR_ID            VARCHAR(20)  NOT NULL COMMENT '회원식별번호', -- 회원식별번호
	BILLKEY           VARCHAR(30)  NOT NULL COMMENT '빌링키', -- 빌링키
	CCRD_HGL_NM       VARCHAR(200) NULL     COMMENT '신용카드한글명', -- 신용카드한글명
	CHK_CARD_YN_VAL   VARCHAR(1)   NULL     COMMENT '체크카드여부값', -- 체크카드여부값
	RAW_DATA_CONT     VARCHAR(4000)NULL     COMMENT '미가공데이터내용', -- 미가공데이터내용
	RCV_RAW_DATA_CONT VARCHAR(4000)NULL     COMMENT '수신미가공데이터내용', -- 수신미가공데이터내용
	REG_DT            TIMESTAMP    NOT NULL COMMENT '등록일시', -- 등록일시
	REG_ID            VARCHAR(20)  NULL     COMMENT '등록아이디' -- 등록아이디
)
COMMENT '결제빌링';

-- 결제빌링
ALTER TABLE PAY_BILL
	ADD CONSTRAINT PK_PAY_BILL -- 결제빌링 기본키
		PRIMARY KEY (
			PAY_BILL_ID -- 결제빌링식별번호
		);

-- 결제빌링 인덱스
CREATE INDEX IX_PAY_BILL
	ON PAY_BILL( -- 결제빌링
		MBR_ID ASC -- 회원식별번호
	);

-- 결제
CREATE TABLE PAY (
	PAY_ID           INTEGER      NOT NULL COMMENT '결제식별번호', -- 결제식별번호
	ORI_PAY_ID       INTEGER      NULL     COMMENT '원결제식별번호', -- 원결제식별번호
	ORD_ID           INTEGER      NOT NULL COMMENT '주문식별번호', -- 주문식별번호
	ORD_CLM_ID       INTEGER      NULL     COMMENT '주문클레임식별번호', -- 주문클레임식별번호
	PAY_TP_CD        VARCHAR(100) NOT NULL COMMENT '결제유형코드', -- 결제유형코드
	PAY_STAT_CD      VARCHAR(100) NOT NULL COMMENT '결제상태코드', -- 결제상태코드
	PAY_PG_CD        VARCHAR(100) NOT NULL COMMENT '결제PG코드', -- 결제PG코드
	MID              VARCHAR(20)  NOT NULL COMMENT '상점아이디', -- 상점아이디
	PAY_MTHD_CD      VARCHAR(100) NOT NULL COMMENT '결제수단코드', -- 결제수단코드
	PAY_AMT          INTEGER      NOT NULL COMMENT '결제금액', -- 결제금액
	RFD_AMT          INTEGER      NOT NULL COMMENT '환불금액', -- 환불금액
	REAL_PAY_AMT     INTEGER      NOT NULL COMMENT '실결제금액', -- 실결제금액
	PG_SPLY_AMT      INTEGER      NULL     COMMENT 'PG공급금액', -- PG공급금액
	PG_VAT_AMT       INTEGER      NULL     COMMENT 'PG부가가치세금액', -- PG부가가치세금액
	PG_TAXFREE_AMT   INTEGER      NULL     COMMENT 'PG면세금액', -- PG면세금액
	CASH_RCT_TGT_AMT INTEGER      NULL     COMMENT '현금영수증대상금액', -- 현금영수증대상금액
	ESCR_BUY_YN      VARCHAR(1)   NULL     COMMENT '에스크로구매여부', -- 에스크로구매여부
	PAY_DT           DATE         NULL     COMMENT '결제일시', -- 결제일시
	PAY_CPLT_DT      DATE         NULL     COMMENT '결제완료일시', -- 결제완료일시
	REG_DT           TIMESTAMP    NOT NULL COMMENT '등록일시', -- 등록일시
	REG_ID           VARCHAR(20)  NULL     COMMENT '등록아이디', -- 등록아이디
	MOD_DT           TIMESTAMP    NOT NULL COMMENT '수정일시', -- 수정일시
	MOD_ID           VARCHAR(20)  NULL     COMMENT '수정아이디' -- 수정아이디
)
COMMENT '결제';

-- 결제
ALTER TABLE PAY
	ADD CONSTRAINT PK_PAY -- 결제 기본키
		PRIMARY KEY (
			PAY_ID -- 결제식별번호
		);

-- 결제환불배치큐
CREATE TABLE PAY_RFD_BATCH_QUE (
	PAY_RFD_BATCH_QUE_ID INTEGER       NOT NULL COMMENT '결제환불배치큐식별번호', -- 결제환불배치큐식별번호
	PAY_ID               INTEGER       NULL     COMMENT '결제식별번호', -- 결제식별번호
	PAY_PG_CD            VARCHAR(100)  NOT NULL COMMENT '결제PG코드', -- 결제PG코드
	TRAN_NO_VAL          VARCHAR(100)  NOT NULL COMMENT '거래번호값(나이스)', -- 거래번호값
	PART_CNCL_CL_VAL     VARCHAR(30)   NOT NULL COMMENT '부분취소구분값(나이스)', -- 부분취소구분값
	MID                  VARCHAR(20)   NOT NULL COMMENT '상점아이디', -- 상점아이디
	ORI_PAY_AMT          INTEGER       NULL     COMMENT '원결제금액', -- 원결제금액
	RFD_AMT              INTEGER       NOT NULL COMMENT '환불금액', -- 환불금액
	PG_SPLY_AMT          INTEGER       NULL     COMMENT 'PG공급금액', -- PG공급금액
	PG_VAT_AMT           INTEGER       NULL     COMMENT 'PG부가가치세금액', -- PG부가가치세금액
	PG_TAXFREE_AMT       INTEGER       NULL     COMMENT 'PG면세금액', -- PG면세금액
	ERR_CNT              NUMERIC(9)     NOT NULL COMMENT '오류횟수', -- 오류횟수
	RSLT_MSG             VARCHAR(4000) NULL     COMMENT '결과메시지', -- 결과메시지
	REG_DT               TIMESTAMP     NOT NULL COMMENT '등록일시', -- 등록일시
	REG_ID               VARCHAR(20)   NULL     COMMENT '등록아이디', -- 등록아이디
	MOD_DT               TIMESTAMP     NOT NULL COMMENT '수정일시', -- 수정일시
	MOD_ID               VARCHAR(20)   NULL     COMMENT '수정아이디' -- 수정아이디
)
COMMENT '결제환불배치큐';

-- 결제환불배치큐
ALTER TABLE PAY_RFD_BATCH_QUE
	ADD CONSTRAINT PK_PAY_RFD_BATCH_QUE -- 결제환불배치큐 기본키
		PRIMARY KEY (
			PAY_RFD_BATCH_QUE_ID -- 결제환불배치큐식별번호
		);

-- 쿠폰발급조건
CREATE TABLE CPN_ISU_COND (
	CPN_ID           INTEGER      NOT NULL COMMENT '쿠폰식별번호', -- 쿠폰식별번호
	CPN_ISU_COND_CD  VARCHAR(100) NOT NULL COMMENT '쿠폰발급조건코드', -- 쿠폰발급조건코드
	CPN_ISU_COND_VAL VARCHAR(10)  NULL     COMMENT '쿠폰발급조건값', -- 쿠폰발급조건값
	REG_DT           TIMESTAMP    NOT NULL COMMENT '등록일시', -- 등록일시
	REG_ID           VARCHAR(20)  NULL     COMMENT '등록아이디' -- 등록아이디
)
COMMENT '쿠폰발급조건';

-- 쿠폰발급조건
ALTER TABLE CPN_ISU_COND
	ADD CONSTRAINT PK_CPN_ISU_COND -- 쿠폰발급조건 기본키
		PRIMARY KEY (
			CPN_ID,          -- 쿠폰식별번호
			CPN_ISU_COND_CD  -- 쿠폰발급조건코드
		);

-- 포인트사용상세
CREATE TABLE PNT_USE_DTL (
	PT_USE_DTL_ID  INTEGER     NOT NULL COMMENT '포인트사용상세식별번호', -- 포인트사용상세식별번호
	PT_USE_ID      INTEGER     NULL     COMMENT '포인트사용식별번호', -- 포인트사용식별번호
	PT_SAVE_ID     INTEGER     NULL     COMMENT '포인트적립식별번호', -- 포인트적립식별번호
	FST_PT_USE_AMT INTEGER     NOT NULL COMMENT '최초포인트사용금액', -- 최초포인트사용금액
	PT_USE_AMT     INTEGER     NOT NULL COMMENT '포인트사용금액', -- 포인트사용금액
	REG_DT         TIMESTAMP   NOT NULL COMMENT '등록일시', -- 등록일시
	REG_ID         VARCHAR(20) NULL     COMMENT '등록아이디', -- 등록아이디
	MOD_DT         TIMESTAMP   NOT NULL COMMENT '수정일시', -- 수정일시
	MOD_ID         VARCHAR(20) NULL     COMMENT '수정아이디' -- 수정아이디
)
COMMENT '포인트사용상세';

-- 포인트사용상세
ALTER TABLE PNT_USE_DTL
	ADD CONSTRAINT PK_PNT_USE_DTL -- 포인트사용상세 기본키
		PRIMARY KEY (
			PT_USE_DTL_ID -- 포인트사용상세식별번호
		);

-- 관리자역할메뉴매핑
ALTER TABLE ADM_ROLE_MENU_MAP
	ADD CONSTRAINT FK_ADM_ROLE_TO_ADM_ROLE_MENU_MAP -- 관리자역할 -> 관리자역할메뉴매핑
		FOREIGN KEY (
			ADM_ROLE_ID -- 관리자역할식별번호
		)
		REFERENCES ADM_ROLE ( -- 관리자역할
			ADM_ROLE_ID -- 관리자역할식별번호
		),
	ADD INDEX FK_ADM_ROLE_TO_ADM_ROLE_MENU_MAP (
		ADM_ROLE_ID ASC -- 관리자역할식별번호
	);

-- 관리자역할메뉴매핑
ALTER TABLE ADM_ROLE_MENU_MAP
	ADD CONSTRAINT FK_ADM_SITE_MENU_TO_ADM_ROLE_MENU_MAP -- 관리사이트메뉴 -> 관리자역할메뉴매핑
		FOREIGN KEY (
			ADM_SITE_MENU_ID -- 관리사이트메뉴식별번호
		)
		REFERENCES ADM_SITE_MENU ( -- 관리사이트메뉴
			ADM_SITE_MENU_ID -- 관리사이트메뉴식별번호
		),
	ADD INDEX FK_ADM_SITE_MENU_TO_ADM_ROLE_MENU_MAP (
		ADM_SITE_MENU_ID ASC -- 관리사이트메뉴식별번호
	);

-- 회원변경기록
ALTER TABLE MBR_CHIST
	ADD CONSTRAINT FK_MBR_TO_MBR_CHIST -- 회원 -> 회원변경기록
		FOREIGN KEY (
			MBR_ID -- 회원식별번호
		)
		REFERENCES MBR ( -- 회원
			MBR_ID -- 회원식별번호
		),
	ADD INDEX FK_MBR_TO_MBR_CHIST (
		MBR_ID ASC -- 회원식별번호
	);

-- 회원관리자메모
ALTER TABLE MBR_ADM_MEMO
	ADD CONSTRAINT FK_MBR_TO_MBR_ADM_MEMO -- 회원 -> 회원관리자메모
		FOREIGN KEY (
			MBR_ID -- 회원식별번호
		)
		REFERENCES MBR ( -- 회원
			MBR_ID -- 회원식별번호
		),
	ADD INDEX FK_MBR_TO_MBR_ADM_MEMO (
		MBR_ID ASC -- 회원식별번호
	);

-- 회원로그인토큰
ALTER TABLE MBR_LGN_TKN
	ADD CONSTRAINT FK_MBR_TO_MBR_LGN_TKN -- 회원 -> 회원로그인토큰
		FOREIGN KEY (
			MBR_ID -- 회원식별번호
		)
		REFERENCES MBR ( -- 회원
			MBR_ID -- 회원식별번호
		),
	ADD INDEX FK_MBR_TO_MBR_LGN_TKN (
		MBR_ID ASC -- 회원식별번호
	);

-- 회원로그인기록
ALTER TABLE MBR_LGN_HIST
	ADD CONSTRAINT FK_MBR_TO_MBR_LGN_HIST -- 회원 -> 회원로그인기록
		FOREIGN KEY (
			MBR_ID -- 회원식별번호
		)
		REFERENCES MBR ( -- 회원
			MBR_ID -- 회원식별번호
		),
	ADD INDEX FK_MBR_TO_MBR_LGN_HIST (
		MBR_ID ASC -- 회원식별번호
	);

-- 회원쿠폰
ALTER TABLE MBR_CPN
	ADD CONSTRAINT FK_CPN_TO_MBR_CPN -- 쿠폰 -> 회원쿠폰
		FOREIGN KEY (
			CPN_ID -- 쿠폰식별번호
		)
		REFERENCES CPN ( -- 쿠폰
			CPN_ID -- 쿠폰식별번호
		),
	ADD INDEX FK_CPN_TO_MBR_CPN (
		CPN_ID ASC -- 쿠폰식별번호
	);

-- 회원기록
ALTER TABLE MBR_HIST
	ADD CONSTRAINT FK_MBR_TO_MBR_HIST -- 회원 -> 회원기록
		FOREIGN KEY (
			MBR_ID -- 회원식별번호
		)
		REFERENCES MBR ( -- 회원
			MBR_ID -- 회원식별번호
		),
	ADD INDEX FK_MBR_TO_MBR_HIST (
		MBR_ID ASC -- 회원식별번호
	);

-- 상품평
ALTER TABLE ITEM_CMT
	ADD CONSTRAINT FK_ITEM_TO_ITEM_CMT -- 상품 -> 상품평
		FOREIGN KEY (
			ITEM_ID -- 상품식별번호
		)
		REFERENCES ITEM ( -- 상품
			ITEM_ID -- 상품식별번호
		),
	ADD INDEX FK_ITEM_TO_ITEM_CMT (
		ITEM_ID ASC -- 상품식별번호
	);

-- 상품
ALTER TABLE ITEM
	ADD CONSTRAINT FK_DP_BRND_TO_ITEM -- 전시브랜드 -> 상품
		FOREIGN KEY (
			DP_BRND_ID -- 전시브랜드식별번호
		)
		REFERENCES DP_BRND ( -- 전시브랜드
			DP_BRND_ID -- 전시브랜드식별번호
		),
	ADD INDEX FK_DP_BRND_TO_ITEM (
		DP_BRND_ID ASC -- 전시브랜드식별번호
	);

-- 상품
ALTER TABLE ITEM
	ADD CONSTRAINT FK_VEN_TO_ITEM -- 업체 -> 상품
		FOREIGN KEY (
			VEN_ID -- 업체식별번호
		)
		REFERENCES VEN ( -- 업체
			VEN_ID -- 업체식별번호
		),
	ADD INDEX FK_VEN_TO_ITEM (
		VEN_ID ASC -- 업체식별번호
	);

-- 상품키워드
ALTER TABLE ITEM_KWD
	ADD CONSTRAINT FK_ITEM_TO_ITEM_KWD -- 상품 -> 상품키워드
		FOREIGN KEY (
			ITEM_ID -- 상품식별번호
		)
		REFERENCES ITEM ( -- 상품
			ITEM_ID -- 상품식별번호
		),
	ADD INDEX FK_ITEM_TO_ITEM_KWD (
		ITEM_ID ASC -- 상품식별번호
	);

-- 상품사은품매핑
ALTER TABLE ITEM_FRGT_MAP
	ADD CONSTRAINT FK_ITEM_TO_ITEM_FRGT_MAP -- 상품 -> 상품사은품매핑
		FOREIGN KEY (
			ITEM_ID -- 상품식별번호
		)
		REFERENCES ITEM ( -- 상품
			ITEM_ID -- 상품식별번호
		),
	ADD INDEX FK_ITEM_TO_ITEM_FRGT_MAP (
		ITEM_ID ASC -- 상품식별번호
	);

-- 상품사은품매핑
ALTER TABLE ITEM_FRGT_MAP
	ADD CONSTRAINT FK_ITEM_FRGT_TO_ITEM_FRGT_MAP -- 상품사은품 -> 상품사은품매핑
		FOREIGN KEY (
			ITEM_FRGT_ID -- 상품사은품식별번호
		)
		REFERENCES ITEM_FRGT ( -- 상품사은품
			ITEM_FRGT_ID -- 상품사은품식별번호
		),
	ADD INDEX FK_ITEM_FRGT_TO_ITEM_FRGT_MAP (
		ITEM_FRGT_ID ASC -- 상품사은품식별번호
	);

-- 상품사은품
ALTER TABLE ITEM_FRGT
	ADD CONSTRAINT FK_VEN_TO_ITEM_FRGT -- 업체 -> 상품사은품
		FOREIGN KEY (
			VEN_ID -- 업체식별번호
		)
		REFERENCES VEN ( -- 업체
			VEN_ID -- 업체식별번호
		),
	ADD INDEX FK_VEN_TO_ITEM_FRGT (
		VEN_ID ASC -- 업체식별번호
	);

-- 상품옵션
ALTER TABLE ITEM_OPT
	ADD CONSTRAINT FK_ITEM_TO_ITEM_OPT -- 상품 -> 상품옵션
		FOREIGN KEY (
			ITEM_ID -- 상품식별번호
		)
		REFERENCES ITEM ( -- 상품
			ITEM_ID -- 상품식별번호
		),
	ADD INDEX FK_ITEM_TO_ITEM_OPT (
		ITEM_ID ASC -- 상품식별번호
	);

-- 상품승인기록
ALTER TABLE ITEM_APRV_HIST
	ADD CONSTRAINT FK_ITEM_TO_ITEM_APRV_HIST -- 상품 -> 상품승인기록
		FOREIGN KEY (
			ITEM_ID -- 상품식별번호
		)
		REFERENCES ITEM ( -- 상품
			ITEM_ID -- 상품식별번호
		),
	ADD INDEX FK_ITEM_TO_ITEM_APRV_HIST (
		ITEM_ID ASC -- 상품식별번호
	);

-- 상품입고알림
ALTER TABLE ITEM_WAHS_NOTI
	ADD CONSTRAINT FK_ITEM_TO_ITEM_WAHS_NOTI -- 상품 -> 상품입고알림
		FOREIGN KEY (
			ITEM_ID -- 상품식별번호
		)
		REFERENCES ITEM ( -- 상품
			ITEM_ID -- 상품식별번호
		),
	ADD INDEX FK_ITEM_TO_ITEM_WAHS_NOTI (
		ITEM_ID ASC -- 상품식별번호
	);

-- 상품정보고시
ALTER TABLE ITEM_INFO_NOTI
	ADD CONSTRAINT FK_ITEM_TO_ITEM_INFO_NOTI -- 상품 -> 상품정보고시
		FOREIGN KEY (
			ITEM_ID -- 상품식별번호
		)
		REFERENCES ITEM ( -- 상품
			ITEM_ID -- 상품식별번호
		),
	ADD INDEX FK_ITEM_TO_ITEM_INFO_NOTI (
		ITEM_ID ASC -- 상품식별번호
	);

-- 전시카테고리
ALTER TABLE DP_CATE
	ADD CONSTRAINT FK_DP_CATE_TO_DP_CATE -- 전시카테고리 -> 전시카테고리
		FOREIGN KEY (
			REF_DP_CATE_ID -- 참조전시카테고리식별번호
		)
		REFERENCES DP_CATE ( -- 전시카테고리
			DP_CATE_ID -- 전시카테고리식별번호
		),
	ADD INDEX FK_DP_CATE_TO_DP_CATE (
		REF_DP_CATE_ID ASC -- 참조전시카테고리식별번호
	);

-- 전시코너배너
ALTER TABLE DP_CONR_BANR
	ADD CONSTRAINT FK_DP_CONR_TO_DP_CONR_BANR -- 전시코너 -> 전시코너배너
		FOREIGN KEY (
			DP_CONR_CD -- 전시코너코드
		)
		REFERENCES DP_CONR ( -- 전시코너
			DP_CONR_CD -- 전시코너코드
		),
	ADD INDEX FK_DP_CONR_TO_DP_CONR_BANR (
		DP_CONR_CD ASC -- 전시코너코드
	);

-- 전시코너매핑그룹
ALTER TABLE DP_CONR_MAP_GRP
	ADD CONSTRAINT FK_DP_CONR_TO_DP_CONR_MAP_GRP -- 전시코너 -> 전시코너매핑그룹
		FOREIGN KEY (
			DP_CONR_CD -- 전시코너코드
		)
		REFERENCES DP_CONR ( -- 전시코너
			DP_CONR_CD -- 전시코너코드
		),
	ADD INDEX FK_DP_CONR_TO_DP_CONR_MAP_GRP (
		DP_CONR_CD ASC -- 전시코너코드
	);

-- 전시공지
ALTER TABLE DP_NOTI
	ADD CONSTRAINT FK_VEN_TO_DP_NOTI -- 업체 -> 전시공지
		FOREIGN KEY (
			VEN_ID -- 업체식별번호
		)
		REFERENCES VEN ( -- 업체
			VEN_ID -- 업체식별번호
		),
	ADD INDEX FK_VEN_TO_DP_NOTI (
		VEN_ID ASC -- 업체식별번호
	);

-- 전시브랜드
ALTER TABLE DP_BRND
	ADD CONSTRAINT FK_VEN_TO_DP_BRND -- 업체 -> 전시브랜드
		FOREIGN KEY (
			VEN_ID -- 업체식별번호
		)
		REFERENCES VEN ( -- 업체
			VEN_ID -- 업체식별번호
		),
	ADD INDEX FK_VEN_TO_DP_BRND (
		VEN_ID ASC -- 업체식별번호
	);

-- 전시코너
ALTER TABLE DP_CONR
	ADD CONSTRAINT FK_DP_CH_TO_DP_CONR -- 전시채널 -> 전시코너
		FOREIGN KEY (
			DP_CH_ID -- 전시채널식별번호
		)
		REFERENCES DP_CH ( -- 전시채널
			DP_CH_ID -- 전시채널식별번호
		),
	ADD INDEX FK_DP_CH_TO_DP_CONR (
		DP_CH_ID ASC -- 전시채널식별번호
	);

-- 주문클레임상품사은품
ALTER TABLE ORD_CLM_ITEM_FRGT
	ADD CONSTRAINT FK_ORD_CLM_ITEM_TO_ORD_CLM_ITEM_FRGT -- 주문클레임상품 -> 주문클레임상품사은품
		FOREIGN KEY (
			ORD_CLM_ITEM_ID -- 주문클레임상품식별번호
		)
		REFERENCES ORD_CLM_ITEM ( -- 주문클레임상품
			ORD_CLM_ITEM_ID -- 주문클레임상품식별번호
		),
	ADD INDEX FK_ORD_CLM_ITEM_TO_ORD_CLM_ITEM_FRGT (
		ORD_CLM_ITEM_ID ASC -- 주문클레임상품식별번호
	);

-- 주문클레임상품사은품
ALTER TABLE ORD_CLM_ITEM_FRGT
	ADD CONSTRAINT FK_ORD_ITEM_FRGT_TO_ORD_CLM_ITEM_FRGT -- 주문상품사은품 -> 주문클레임상품사은품
		FOREIGN KEY (
			ORD_ITEM_FRGT_ID -- 주문상품사은품식별번호
		)
		REFERENCES ORD_ITEM_FRGT ( -- 주문상품사은품
			ORD_ITEM_FRGT_ID -- 주문상품사은품식별번호
		),
	ADD INDEX FK_ORD_ITEM_FRGT_TO_ORD_CLM_ITEM_FRGT (
		ORD_ITEM_FRGT_ID ASC -- 주문상품사은품식별번호
	);

-- 주문환불정보
ALTER TABLE ORD_RFD_INFO
	ADD CONSTRAINT FK_ORD_TO_ORD_RFD_INFO -- 주문 -> 주문환불정보
		FOREIGN KEY (
			ORD_ID -- 주문식별번호
		)
		REFERENCES ORD ( -- 주문
			ORD_ID -- 주문식별번호
		),
	ADD INDEX FK_ORD_TO_ORD_RFD_INFO (
		ORD_ID ASC -- 주문식별번호
	);

-- 주문환불정보
ALTER TABLE ORD_RFD_INFO
	ADD CONSTRAINT FK_ORD_CLM_TO_ORD_RFD_INFO -- 주문클레임 -> 주문환불정보
		FOREIGN KEY (
			ORD_CLM_ID -- 주문클레임식별번호
		)
		REFERENCES ORD_CLM ( -- 주문클레임
			ORD_CLM_ID -- 주문클레임식별번호
		),
	ADD INDEX FK_ORD_CLM_TO_ORD_RFD_INFO (
		ORD_CLM_ID ASC -- 주문클레임식별번호
	);

-- 주문상품
ALTER TABLE ORD_ITEM
	ADD CONSTRAINT FK_ORD_TO_ORD_ITEM -- 주문 -> 주문상품
		FOREIGN KEY (
			ORD_ID -- 주문식별번호
		)
		REFERENCES ORD ( -- 주문
			ORD_ID -- 주문식별번호
		),
	ADD INDEX FK_ORD_TO_ORD_ITEM (
		ORD_ID ASC -- 주문식별번호
	);

-- 주문상품
ALTER TABLE ORD_ITEM
	ADD CONSTRAINT FK_ITEM_TO_ORD_ITEM -- 상품 -> 주문상품
		FOREIGN KEY (
			ITEM_ID -- 상품식별번호
		)
		REFERENCES ITEM ( -- 상품
			ITEM_ID -- 상품식별번호
		),
	ADD INDEX FK_ITEM_TO_ORD_ITEM (
		ITEM_ID ASC -- 상품식별번호
	);

-- 주문쿠폰상품매핑
ALTER TABLE ORD_CPN_ITEM_MAP
	ADD CONSTRAINT FK_ORD_ITEM_TO_ORD_CPN_ITEM_MAP -- 주문상품 -> 주문쿠폰상품매핑
		FOREIGN KEY (
			ORD_ITEM_ID -- 주문상품식별번호
		)
		REFERENCES ORD_ITEM ( -- 주문상품
			ORD_ITEM_ID -- 주문상품식별번호
		),
	ADD INDEX FK_ORD_ITEM_TO_ORD_CPN_ITEM_MAP (
		ORD_ITEM_ID ASC -- 주문상품식별번호
	);

-- 주문쿠폰상품매핑
ALTER TABLE ORD_CPN_ITEM_MAP
	ADD CONSTRAINT FK_ORD_CPN_TO_ORD_CPN_ITEM_MAP -- 주문쿠폰 -> 주문쿠폰상품매핑
		FOREIGN KEY (
			ORD_CPN_ID -- 주문쿠폰식별번호
		)
		REFERENCES ORD_CPN ( -- 주문쿠폰
			ORD_CPN_ID -- 주문쿠폰식별번호
		),
	ADD INDEX FK_ORD_CPN_TO_ORD_CPN_ITEM_MAP (
		ORD_CPN_ID ASC -- 주문쿠폰식별번호
	);

-- 주문쿠폰상품매핑
ALTER TABLE ORD_CPN_ITEM_MAP
	ADD CONSTRAINT FK_ORD_CLM_TO_ORD_CPN_ITEM_MAP -- 주문클레임 -> 주문쿠폰상품매핑
		FOREIGN KEY (
			ORD_CLM_ID -- 주문클레임식별번호
		)
		REFERENCES ORD_CLM ( -- 주문클레임
			ORD_CLM_ID -- 주문클레임식별번호
		),
	ADD INDEX FK_ORD_CLM_TO_ORD_CPN_ITEM_MAP (
		ORD_CLM_ID ASC -- 주문클레임식별번호
	);

-- 주문쿠폰
ALTER TABLE ORD_CPN
	ADD CONSTRAINT FK_ORD_TO_ORD_CPN -- 주문 -> 주문쿠폰
		FOREIGN KEY (
			ORD_ID -- 주문식별번호
		)
		REFERENCES ORD ( -- 주문
			ORD_ID -- 주문식별번호
		),
	ADD INDEX FK_ORD_TO_ORD_CPN (
		ORD_ID ASC -- 주문식별번호
	);

-- 주문쿠폰
ALTER TABLE ORD_CPN
	ADD CONSTRAINT FK_MBR_CPN_TO_ORD_CPN -- 회원쿠폰 -> 주문쿠폰
		FOREIGN KEY (
			MBR_CPN_ID -- 회원쿠폰식별번호
		)
		REFERENCES MBR_CPN ( -- 회원쿠폰
			MBR_CPN_ID -- 회원쿠폰식별번호
		),
	ADD INDEX FK_MBR_CPN_TO_ORD_CPN (
		MBR_CPN_ID ASC -- 회원쿠폰식별번호
	);

-- 주문클레임변경기록
ALTER TABLE ORD_CLM_CHIST
	ADD CONSTRAINT FK_ORD_CLM_TO_ORD_CLM_CHIST -- 주문클레임 -> 주문클레임변경기록
		FOREIGN KEY (
			ORD_CLM_ID -- 주문클레임식별번호
		)
		REFERENCES ORD_CLM ( -- 주문클레임
			ORD_CLM_ID -- 주문클레임식별번호
		),
	ADD INDEX FK_ORD_CLM_TO_ORD_CLM_CHIST (
		ORD_CLM_ID ASC -- 주문클레임식별번호
	);

-- 주문상품사은품
ALTER TABLE ORD_ITEM_FRGT
	ADD CONSTRAINT FK_ORD_ITEM_TO_ORD_ITEM_FRGT -- 주문상품 -> 주문상품사은품
		FOREIGN KEY (
			ORD_ITEM_ID -- 주문상품식별번호
		)
		REFERENCES ORD_ITEM ( -- 주문상품
			ORD_ITEM_ID -- 주문상품식별번호
		),
	ADD INDEX FK_ORD_ITEM_TO_ORD_ITEM_FRGT (
		ORD_ITEM_ID ASC -- 주문상품식별번호
	);

-- 주문기록
ALTER TABLE ORD_HIST
	ADD CONSTRAINT FK_ORD_TO_ORD_HIST -- 주문 -> 주문기록
		FOREIGN KEY (
			ORD_ID -- 주문식별번호
		)
		REFERENCES ORD ( -- 주문
			ORD_ID -- 주문식별번호
		),
	ADD INDEX FK_ORD_TO_ORD_HIST (
		ORD_ID ASC -- 주문식별번호
	);

-- 주문클레임
ALTER TABLE ORD_CLM
	ADD CONSTRAINT FK_ORD_TO_ORD_CLM -- 주문 -> 주문클레임
		FOREIGN KEY (
			ORD_ID -- 주문식별번호
		)
		REFERENCES ORD ( -- 주문
			ORD_ID -- 주문식별번호
		),
	ADD INDEX FK_ORD_TO_ORD_CLM (
		ORD_ID ASC -- 주문식별번호
	);

-- 주문클레임상품
ALTER TABLE ORD_CLM_ITEM
	ADD CONSTRAINT FK_ORD_ITEM_TO_ORD_CLM_ITEM -- 주문상품 -> 주문클레임상품
		FOREIGN KEY (
			ORD_ITEM_ID -- 주문상품식별번호
		)
		REFERENCES ORD_ITEM ( -- 주문상품
			ORD_ITEM_ID -- 주문상품식별번호
		),
	ADD INDEX FK_ORD_ITEM_TO_ORD_CLM_ITEM (
		ORD_ITEM_ID ASC -- 주문상품식별번호
	);

-- 주문클레임상품
ALTER TABLE ORD_CLM_ITEM
	ADD CONSTRAINT FK_ORD_CLM_TO_ORD_CLM_ITEM -- 주문클레임 -> 주문클레임상품
		FOREIGN KEY (
			ORD_CLM_ID -- 주문클레임식별번호
		)
		REFERENCES ORD_CLM ( -- 주문클레임
			ORD_CLM_ID -- 주문클레임식별번호
		),
	ADD INDEX FK_ORD_CLM_TO_ORD_CLM_ITEM (
		ORD_CLM_ID ASC -- 주문클레임식별번호
	);

-- 게시판글답변
ALTER TABLE BBS_ART_RPLY
	ADD CONSTRAINT FK_BBS_ART_TO_BBS_ART_RPLY -- 게시판글 -> 게시판글답변
		FOREIGN KEY (
			BBS_ART_ID -- 게시판글식별번호
		)
		REFERENCES BBS_ART ( -- 게시판글
			BBS_ART_ID -- 게시판글식별번호
		),
	ADD INDEX FK_BBS_ART_TO_BBS_ART_RPLY (
		BBS_ART_ID ASC -- 게시판글식별번호
	);

-- 문의답변
ALTER TABLE INQ_RPLY
	ADD CONSTRAINT FK_INQ_TO_INQ_RPLY -- 문의 -> 문의답변
		FOREIGN KEY (
			INQ_ID -- 문의식별번호
		)
		REFERENCES INQ ( -- 문의
			INQ_ID -- 문의식별번호
		),
	ADD INDEX FK_INQ_TO_INQ_RPLY (
		INQ_ID ASC -- 문의식별번호
	);

-- 쿠폰
ALTER TABLE CPN
	ADD CONSTRAINT FK_VEN_TO_CPN -- 업체 -> 쿠폰
		FOREIGN KEY (
			VEN_ID -- 업체식별번호
		)
		REFERENCES VEN ( -- 업체
			VEN_ID -- 업체식별번호
		),
	ADD INDEX FK_VEN_TO_CPN (
		VEN_ID ASC -- 업체식별번호
	);

-- 쿠폰난수
ALTER TABLE CPN_RDNB
	ADD CONSTRAINT FK_CPN_TO_CPN_RDNB -- 쿠폰 -> 쿠폰난수
		FOREIGN KEY (
			CPN_ID -- 쿠폰식별번호
		)
		REFERENCES CPN ( -- 쿠폰
			CPN_ID -- 쿠폰식별번호
		),
	ADD INDEX FK_CPN_TO_CPN_RDNB (
		CPN_ID ASC -- 쿠폰식별번호
	);

-- 쿠폰난수
ALTER TABLE CPN_RDNB
	ADD CONSTRAINT FK_MBR_CPN_TO_CPN_RDNB -- 회원쿠폰 -> 쿠폰난수
		FOREIGN KEY (
			MBR_CPN_ID -- 회원쿠폰식별번호
		)
		REFERENCES MBR_CPN ( -- 회원쿠폰
			MBR_CPN_ID -- 회원쿠폰식별번호
		),
	ADD INDEX FK_MBR_CPN_TO_CPN_RDNB (
		MBR_CPN_ID ASC -- 회원쿠폰식별번호
	);

-- 쿠폰대상상품매핑
ALTER TABLE CPN_TGT_ITEM_MAP
	ADD CONSTRAINT FK_CPN_TO_CPN_TGT_ITEM_MAP -- 쿠폰 -> 쿠폰대상상품매핑
		FOREIGN KEY (
			CPN_ID -- 쿠폰식별번호
		)
		REFERENCES CPN ( -- 쿠폰
			CPN_ID -- 쿠폰식별번호
		),
	ADD INDEX FK_CPN_TO_CPN_TGT_ITEM_MAP (
		CPN_ID ASC -- 쿠폰식별번호
	);

-- 포인트
ALTER TABLE PNT
	ADD CONSTRAINT FK_PNT_ADM_PROC_TO_PNT -- 포인트관리자처리 -> 포인트
		FOREIGN KEY (
			PT_ADM_PROC_ID -- 포인트관리자처리식별번호
		)
		REFERENCES PNT_ADM_PROC ( -- 포인트관리자처리
			PT_ADM_PROC_ID -- 포인트관리자처리식별번호
		),
	ADD INDEX FK_PNT_ADM_PROC_TO_PNT (
		PT_ADM_PROC_ID ASC -- 포인트관리자처리식별번호
	);

-- 포인트
ALTER TABLE PNT
	ADD CONSTRAINT FK_ITEM_TO_PNT -- 상품 -> 포인트
		FOREIGN KEY (
			ITEM_ID -- 상품식별번호
		)
		REFERENCES ITEM ( -- 상품
			ITEM_ID -- 상품식별번호
		),
	ADD INDEX FK_ITEM_TO_PNT (
		ITEM_ID ASC -- 상품식별번호
	);

-- 포인트
ALTER TABLE PNT
	ADD CONSTRAINT FK_VEN_TO_PNT -- 업체 -> 포인트
		FOREIGN KEY (
			VEN_ID -- 업체식별번호
		)
		REFERENCES VEN ( -- 업체
			VEN_ID -- 업체식별번호
		),
	ADD INDEX FK_VEN_TO_PNT (
		VEN_ID ASC -- 업체식별번호
	);

-- 결제
ALTER TABLE PAY
	ADD CONSTRAINT FK_ORD_TO_PAY -- 주문 -> 결제
		FOREIGN KEY (
			ORD_ID -- 주문식별번호
		)
		REFERENCES ORD ( -- 주문
			ORD_ID -- 주문식별번호
		),
	ADD INDEX FK_ORD_TO_PAY (
		ORD_ID ASC -- 주문식별번호
	);

-- 결제환불배치큐
ALTER TABLE PAY_RFD_BATCH_QUE
	ADD CONSTRAINT FK_PAY_TO_PAY_RFD_BATCH_QUE -- 결제 -> 결제환불배치큐
		FOREIGN KEY (
			PAY_ID -- 결제식별번호
		)
		REFERENCES PAY ( -- 결제
			PAY_ID -- 결제식별번호
		),
	ADD INDEX FK_PAY_TO_PAY_RFD_BATCH_QUE (
		PAY_ID ASC -- 결제식별번호
	);

-- 포인트사용상세
ALTER TABLE PNT_USE_DTL
	ADD CONSTRAINT FK_PNT_USE_ID -- 포인트 -> 포인트사용식별번
		FOREIGN KEY (
			PT_USE_ID -- 포인트사용식별번호
		)
		REFERENCES PNT ( -- 포인트
			PT_ID -- 포인트식별번호
		),
	ADD INDEX FK_PNT_USE_ID (
		PT_USE_ID ASC -- 포인트사용식별번호
	);

-- 사이트정책
ALTER TABLE SITE_PCY
	ADD CONSTRAINT FK_SITE_TO_SITE_PCY -- 사이트 -> 사이트정책
		FOREIGN KEY (
			SITE_ID -- 사이트식별번호
		)
		REFERENCES SITE ( -- 사이트
			SITE_ID -- 사이트식별번호
		);

-- 코드
ALTER TABLE CD
	ADD CONSTRAINT FK_CD_TO_CD -- 코드 -> 코드
		FOREIGN KEY (
			REF_CD -- 참조코드
		)
		REFERENCES CD ( -- 코드
			CD -- 코드
		);

-- 사이트혜택
ALTER TABLE SITE_BENF
	ADD CONSTRAINT FK_SITE_TO_SITE_BENF -- 사이트 -> 사이트혜택
		FOREIGN KEY (
			SITE_ID -- 사이트식별번호
		)
		REFERENCES SITE ( -- 사이트
			SITE_ID -- 사이트식별번호
		);
	
-- 관리자
ALTER TABLE `ADM`
	ADD CONSTRAINT `PK_ADM` -- 관리자 기본키
		PRIMARY KEY (
			`ADM_ID` -- 관리자식별번호
		);

-- 관리자 인덱스
CREATE INDEX `IX_ADM`
	ON `ADM`( -- 관리자
		`ADM_LGN_ID` ASC -- 관리자로그인아이디
	);

-- 관리자
ALTER TABLE `ADM`
	ADD CONSTRAINT `FK_VEN_TO_ADM` -- 업체 -> 관리자
		FOREIGN KEY (
			`VEN_ID` -- 업체식별번호
		)
		REFERENCES `VEN` ( -- 업체
			`VEN_ID` -- 업체식별번호
		);
	
-- 관리자기록
ALTER TABLE ADM_HIST
	ADD CONSTRAINT FK_ADM_TO_ADM_HIST -- 관리자 -> 관리자기록
		FOREIGN KEY (
			ADM_ID -- 관리자식별번호
		)
		REFERENCES ADM ( -- 관리자
			ADM_ID -- 관리자식별번호
		);

-- 관리사이트메뉴
ALTER TABLE ADM_SITE_MENU
	ADD CONSTRAINT FK_ADM_SITE_MENU_TO_ADM_SITE_MENU -- 관리사이트메뉴 -> 관리사이트메뉴
		FOREIGN KEY (
			REF_ADM_SITE_MENU_ID -- 참조관리사이트메뉴식별번호
		)
		REFERENCES ADM_SITE_MENU ( -- 관리사이트메뉴
			ADM_SITE_MENU_ID -- 관리사이트메뉴식별번호
		);

-- 관리자 (TODO)
ALTER TABLE ADM
	ADD CONSTRAINT FK_VEN_TO_ADM -- 업체 -> 관리자
		FOREIGN KEY (
			VEN_ID -- 업체식별번호
		)
		REFERENCES VEN ( -- 업체
			VEN_ID -- 업체식별번호
		);

-- 회원유형
ALTER TABLE MBR_TP
	ADD CONSTRAINT FK_MBR_TO_MBR_TP -- 회원 -> 회원유형
		FOREIGN KEY (
			MBR_ID -- 회원식별번호
		)
		REFERENCES MBR ( -- 회원
			MBR_ID -- 회원식별번호
		);

-- 회원인증토큰
ALTER TABLE MBR_AUTH_TKN
	ADD CONSTRAINT FK_MBR_TO_MBR_AUTH_TKN -- 회원 -> 회원인증토큰
		FOREIGN KEY (
			MBR_ID -- 회원식별번호
		)
		REFERENCES MBR ( -- 회원
			MBR_ID -- 회원식별번호
		);

-- 회원탈퇴사유
ALTER TABLE MBR_CLOSE_RSN
	ADD CONSTRAINT FK_MBR_CLOSE_TO_MBR_CLOSE_RSN -- 회원탈퇴 -> 회원탈퇴사유
		FOREIGN KEY (
			MBR_CLOSE_ID -- 회원탈퇴식별번호
		)
		REFERENCES MBR_CLOSE ( -- 회원탈퇴
			MBR_CLOSE_ID -- 회원탈퇴식별번호
		);

-- 회원동의
ALTER TABLE MBR_AGR
	ADD CONSTRAINT FK_MBR_TO_MBR_AGR -- 회원 -> 회원동의
		FOREIGN KEY (
			MBR_ID -- 회원식별번호
		)
		REFERENCES MBR ( -- 회원
			MBR_ID -- 회원식별번호
		);

-- 상품평
ALTER TABLE ITEM_CMT
	ADD CONSTRAINT FK_ORD_ITEM_TO_ITEM_CMT -- 주문상품 -> 상품평
		FOREIGN KEY (
			ORD_ITEM_ID -- 주문상품식별번호
		)
		REFERENCES ORD_ITEM ( -- 주문상품
			ORD_ITEM_ID -- 주문상품식별번호
		);

-- 상품속성
ALTER TABLE ITEM_ATTR
	ADD CONSTRAINT FK_ITEM_TO_ITEM_ATTR -- 상품 -> 상품속성
		FOREIGN KEY (
			ITEM_ID -- 상품식별번호
		)
		REFERENCES ITEM ( -- 상품
			ITEM_ID -- 상품식별번호
		);

-- 상품가격
ALTER TABLE ITEM_PRC
	ADD CONSTRAINT FK_ITEM_TO_ITEM_PRC -- 상품 -> 상품가격
		FOREIGN KEY (
			ITEM_ID -- 상품식별번호
		)
		REFERENCES ITEM ( -- 상품
			ITEM_ID -- 상품식별번호
		);

-- 상품가격
ALTER TABLE ITEM_PRC
	ADD CONSTRAINT FK_ITEM_SET_TO_ITEM_PRC -- 상품세트 -> 상품가격
		FOREIGN KEY (
			ITEM_SET_ID -- 상품세트식별번호
		)
		REFERENCES ITEM_SET ( -- 상품세트
			ITEM_SET_ID -- 상품세트식별번호
		);

-- 상품가격
ALTER TABLE ITEM_PRC
	ADD CONSTRAINT FK_DP_CH_TO_ITEM_PRC -- 전시채널 -> 상품가격
		FOREIGN KEY (
			DP_CH_ID -- 전시채널식별번호
		)
		REFERENCES DP_CH ( -- 전시채널
			DP_CH_ID -- 전시채널식별번호
		);

-- 상품판매채널
ALTER TABLE ITEM_SELL_CH
	ADD CONSTRAINT FK_ITEM_TO_ITEM_SELL_CH -- 상품 -> 상품판매채널
		FOREIGN KEY (
			ITEM_ID -- 상품식별번호
		)
		REFERENCES ITEM ( -- 상품
			ITEM_ID -- 상품식별번호
		);

-- 상품판매채널
ALTER TABLE ITEM_SELL_CH
	ADD CONSTRAINT FK_DP_CH_TO_ITEM_SELL_CH -- 전시채널 -> 상품판매채널
		FOREIGN KEY (
			DP_CH_ID -- 전시채널식별번호
		)
		REFERENCES DP_CH ( -- 전시채널
			DP_CH_ID -- 전시채널식별번호
		);

-- 상품설명
ALTER TABLE ITEM_DESC
	ADD CONSTRAINT FK_ITEM_TO_ITEM_DESC -- 상품 -> 상품설명
		FOREIGN KEY (
			ITEM_ID -- 상품식별번호
		)
		REFERENCES ITEM ( -- 상품
			ITEM_ID -- 상품식별번호
		);

-- 상품세트
ALTER TABLE ITEM_SET
	ADD CONSTRAINT FK_ITEM_TO_ITEM_SET -- 상품 -> 상품세트
		FOREIGN KEY (
			ITEM_ID -- 상품식별번호
		)
		REFERENCES ITEM ( -- 상품
			ITEM_ID -- 상품식별번호
		);

-- 상품세트
ALTER TABLE ITEM_SET
	ADD CONSTRAINT FK_ITEM_TO_ITEM_SET2 -- 상품 -> 상품세트2
		FOREIGN KEY (
			REF_ITEM_ID -- 참조상품식별번호
		)
		REFERENCES ITEM ( -- 상품
			ITEM_ID -- 상품식별번호
		);

-- 상품변경기록
ALTER TABLE ITEM_CHIST
	ADD CONSTRAINT FK_ITEM_TO_ITEM_CHIST -- 상품 -> 상품변경기록
		FOREIGN KEY (
			ITEM_ID -- 상품식별번호
		)
		REFERENCES ITEM ( -- 상품
			ITEM_ID -- 상품식별번호
		);

-- 상품이미지
ALTER TABLE ITEM_IMG
	ADD CONSTRAINT FK_ITEM_TO_ITEM_IMG -- 상품 -> 상품이미지
		FOREIGN KEY (
			ITEM_ID -- 상품식별번호
		)
		REFERENCES ITEM ( -- 상품
			ITEM_ID -- 상품식별번호
		);

-- 상품입고알림
ALTER TABLE ITEM_WAHS_NOTI
	ADD CONSTRAINT FK_ITEM_OPT_TO_ITEM_WAHS_NOTI -- 상품옵션 -> 상품입고알림
		FOREIGN KEY (
			ITEM_OPT_ID -- 상품옵션식별번호
		)
		REFERENCES ITEM_OPT ( -- 상품옵션
			ITEM_OPT_ID -- 상품옵션식별번호
		);

-- 상품메타
ALTER TABLE ITEM_META
	ADD CONSTRAINT FK_ITEM_TO_ITEM_META -- 상품 -> 상품메타
		FOREIGN KEY (
			ITEM_ID -- 상품식별번호
		)
		REFERENCES ITEM ( -- 상품
			ITEM_ID -- 상품식별번호
		);

-- 상품옵션변경기록
ALTER TABLE ITEM_OPT_CHIST
	ADD CONSTRAINT FK_ITEM_TO_ITEM_OPT_CHIST -- 상품 -> 상품옵션변경기록
		FOREIGN KEY (
			ITEM_ID -- 상품식별번호
		)
		REFERENCES ITEM ( -- 상품
			ITEM_ID -- 상품식별번호
		);

-- 상품재고
ALTER TABLE ITEM_STK
	ADD CONSTRAINT FK_ITEM_TO_ITEM_STK -- 상품 -> 상품재고
		FOREIGN KEY (
			ITEM_ID -- 상품식별번호
		)
		REFERENCES ITEM ( -- 상품
			ITEM_ID -- 상품식별번호
		);

-- 상품재고
ALTER TABLE ITEM_STK
	ADD CONSTRAINT FK_ITEM_OPT_TO_ITEM_STK -- 상품옵션 -> 상품재고
		FOREIGN KEY (
			ITEM_OPT_ID -- 상품옵션식별번호
		)
		REFERENCES ITEM_OPT ( -- 상품옵션
			ITEM_OPT_ID -- 상품옵션식별번호
		);

-- 전시카테고리
ALTER TABLE DP_CATE
	ADD CONSTRAINT FK_DP_CONR_BANR_TO_DP_CATE -- 전시코너배너 -> 전시카테고리
		FOREIGN KEY (
			DP_CONR_BANR_ID -- 전시코너배너식별번호
		)
		REFERENCES DP_CONR_BANR ( -- 전시코너배너
			DP_CONR_BANR_ID -- 전시코너배너식별번호
		);

-- 전시폐쇄페이지회원대상
ALTER TABLE DP_CLOSE_PAGE_MBR_TGT
	ADD CONSTRAINT FK_DP_CLOSE_PAGE_TO_DP_CLOSE_PAGE_MBR_TGT -- 전시폐쇄페이지 -> 전시폐쇄페이지회원대상
		FOREIGN KEY (
			DP_CH_ID -- 전시채널식별번호
		)
		REFERENCES DP_CLOSE_PAGE ( -- 전시폐쇄페이지
			DP_CH_ID -- 전시채널식별번호
		);

-- 전시카테고리상품매핑
ALTER TABLE DP_CATE_ITEM_MAP
	ADD CONSTRAINT FK_DP_CATE_TO_DP_CATE_ITEM_MAP -- 전시카테고리 -> 전시카테고리상품매핑
		FOREIGN KEY (
			DP_CATE_ID -- 전시카테고리식별번호
		)
		REFERENCES DP_CATE ( -- 전시카테고리
			DP_CATE_ID -- 전시카테고리식별번호
		);

-- 전시카테고리상품매핑
ALTER TABLE DP_CATE_ITEM_MAP
	ADD CONSTRAINT FK_ITEM_TO_DP_CATE_ITEM_MAP -- 상품 -> 전시카테고리상품매핑
		FOREIGN KEY (
			ITEM_ID -- 상품식별번호
		)
		REFERENCES ITEM ( -- 상품
			ITEM_ID -- 상품식별번호
		);

-- 전시폐쇄페이지
ALTER TABLE DP_CLOSE_PAGE
	ADD CONSTRAINT FK_DP_CH_TO_DP_CLOSE_PAGE -- 전시채널 -> 전시폐쇄페이지
		FOREIGN KEY (
			DP_CH_ID -- 전시채널식별번호
		)
		REFERENCES DP_CH ( -- 전시채널
			DP_CH_ID -- 전시채널식별번호
		);

-- 전시공지상품매핑
ALTER TABLE DP_NOTI_ITEM_MAP
	ADD CONSTRAINT FK_DP_NOTI_TO_DP_NOTI_ITEM_MAP -- 전시공지 -> 전시공지상품매핑
		FOREIGN KEY (
			DP_NOTI_ID -- 전시공지식별번호
		)
		REFERENCES DP_NOTI ( -- 전시공지
			DP_NOTI_ID -- 전시공지식별번호
		);

-- 전시공지상품매핑
ALTER TABLE DP_NOTI_ITEM_MAP
	ADD CONSTRAINT FK_ITEM_TO_DP_NOTI_ITEM_MAP -- 상품 -> 전시공지상품매핑
		FOREIGN KEY (
			ITEM_ID -- 상품식별번호
		)
		REFERENCES ITEM ( -- 상품
			ITEM_ID -- 상품식별번호
		);

-- 전시코너매핑
ALTER TABLE DP_CONR_MAP
	ADD CONSTRAINT FK_DP_CONR_TO_DP_CONR_MAP -- 전시코너 -> 전시코너매핑
		FOREIGN KEY (
			DP_CONR_CD -- 전시코너코드
		)
		REFERENCES DP_CONR ( -- 전시코너
			DP_CONR_CD -- 전시코너코드
		);

-- 전시코너매핑
ALTER TABLE DP_CONR_MAP
	ADD CONSTRAINT FK_DP_CONR_MAP_GRP_TO_DP_CONR_MAP -- 전시코너매핑그룹 -> 전시코너매핑
		FOREIGN KEY (
			DP_CONR_MAP_GID -- 전시코너매핑그룹식별번호
		)
		REFERENCES DP_CONR_MAP_GRP ( -- 전시코너매핑그룹
			DP_CONR_MAP_GID -- 전시코너매핑그룹식별번호
		);

-- 전시브랜드
ALTER TABLE DP_BRND
	ADD CONSTRAINT FK_DP_CATE_TO_DP_BRND -- 전시카테고리 -> 전시브랜드
		FOREIGN KEY (
			DP_CATE_ID -- 전시카테고리식별번호
		)
		REFERENCES DP_CATE ( -- 전시카테고리
			DP_CATE_ID -- 전시카테고리식별번호
		);

-- 장바구니
ALTER TABLE CART
	ADD CONSTRAINT FK_DP_CH_TO_CART -- 전시채널 -> 장바구니
		FOREIGN KEY (
			DP_CH_ID -- 전시채널식별번호
		)
		REFERENCES DP_CH ( -- 전시채널
			DP_CH_ID -- 전시채널식별번호
		);

-- 장바구니
ALTER TABLE CART
	ADD CONSTRAINT FK_ITEM_TO_CART -- 상품 -> 장바구니
		FOREIGN KEY (
			ITEM_ID -- 상품식별번호
		)
		REFERENCES ITEM ( -- 상품
			ITEM_ID -- 상품식별번호
		);

-- 장바구니바로구매
ALTER TABLE CART_IMME_BUY
	ADD CONSTRAINT FK_DP_CH_TO_CART_IMME_BUY -- 전시채널 -> 장바구니바로구매
		FOREIGN KEY (
			DP_CH_ID -- 전시채널식별번호
		)
		REFERENCES DP_CH ( -- 전시채널
			DP_CH_ID -- 전시채널식별번호
		);

-- 장바구니바로구매
ALTER TABLE CART_IMME_BUY
	ADD CONSTRAINT FK_ITEM_TO_CART_IMME_BUY -- 상품 -> 장바구니바로구매
		FOREIGN KEY (
			ITEM_ID -- 상품식별번호
		)
		REFERENCES ITEM ( -- 상품
			ITEM_ID -- 상품식별번호
		);

-- 회원위시상품
ALTER TABLE MBR_WISH_ITEM
	ADD CONSTRAINT FK_DP_CH_TO_MBR_WISH_ITEM -- 전시채널 -> 회원위시상품
		FOREIGN KEY (
			DP_CH_ID -- 전시채널식별번호
		)
		REFERENCES DP_CH ( -- 전시채널
			DP_CH_ID -- 전시채널식별번호
		);

-- 회원위시상품
ALTER TABLE MBR_WISH_ITEM
	ADD CONSTRAINT FK_ITEM_TO_MBR_WISH_ITEM2 -- 상품 -> 회원위시상품2
		FOREIGN KEY (
			ITEM_ID -- 상품식별번호
		)
		REFERENCES ITEM ( -- 상품
			ITEM_ID -- 상품식별번호
		);

-- 주문쿠폰변경기록
ALTER TABLE ORD_CPN_CHIST
	ADD CONSTRAINT FK_ORD_CPN_TO_ORD_CPN_CHIST -- 주문쿠폰 -> 주문쿠폰변경기록
		FOREIGN KEY (
			ORD_CPN_ID -- 주문쿠폰식별번호
		)
		REFERENCES ORD_CPN ( -- 주문쿠폰
			ORD_CPN_ID -- 주문쿠폰식별번호
		);

-- 주문상품변경기록
ALTER TABLE ORD_ITEM_CHIST
	ADD CONSTRAINT FK_ORD_ITEM_TO_ORD_ITEM_CHIST -- 주문상품 -> 주문상품변경기록
		FOREIGN KEY (
			ORD_ITEM_ID -- 주문상품식별번호
		)
		REFERENCES ORD_ITEM ( -- 주문상품
			ORD_ITEM_ID -- 주문상품식별번호
		);

-- 주문클레임상품변경기록
ALTER TABLE ORD_CLM_ITEM_CHIST
	ADD CONSTRAINT FK_ORD_CLM_ITEM_TO_ORD_CLM_ITEM_CHIST -- 주문클레임상품 -> 주문클레임상품변경기록
		FOREIGN KEY (
			ORD_CLM_ITEM_ID -- 주문클레임상품식별번호
		)
		REFERENCES ORD_CLM_ITEM ( -- 주문클레임상품
			ORD_CLM_ITEM_ID -- 주문클레임상품식별번호
		);

-- 주문쿠폰상품매핑변경기록
ALTER TABLE ORD_CPN_ITEM_MAP_CHIST
	ADD CONSTRAINT FK_ORD_CPN_ITEM_MAP_TO_ORD_CPN_ITEM_MAP_CHIST -- 주문쿠폰상품매핑 -> 주문쿠폰상품매핑변경기록
		FOREIGN KEY (
			ORD_CPN_ITEM_MAP_ID -- 주문쿠폰상품매핑식별번호
		)
		REFERENCES ORD_CPN_ITEM_MAP ( -- 주문쿠폰상품매핑
			ORD_CPN_ITEM_MAP_ID -- 주문쿠폰상품매핑식별번호
		);

-- 주문변경기록
ALTER TABLE ORD_CHIST
	ADD CONSTRAINT FK_ORD_TO_ORD_CHIST -- 주문 -> 주문변경기록
		FOREIGN KEY (
			ORD_ID -- 주문식별번호
		)
		REFERENCES ORD ( -- 주문
			ORD_ID -- 주문식별번호
		);

-- 쿠폰사용환경
ALTER TABLE CPN_USE_ENV
	ADD CONSTRAINT FK_CPN_TO_CPN_USE_ENV -- 쿠폰 -> 쿠폰사용환경
		FOREIGN KEY (
			CPN_ID -- 쿠폰식별번호
		)
		REFERENCES CPN ( -- 쿠폰
			CPN_ID -- 쿠폰식별번호
		);

-- 쿠폰대상사은품매핑
ALTER TABLE CPN_TGT_FRGT_MAP
	ADD CONSTRAINT FK_CPN_TO_CPN_TGT_FRGT_MAP -- 쿠폰 -> 쿠폰대상사은품매핑
		FOREIGN KEY (
			CPN_ID -- 쿠폰식별번호
		)
		REFERENCES CPN ( -- 쿠폰
			CPN_ID -- 쿠폰식별번호
		);

-- 쿠폰대상사은품매핑
ALTER TABLE CPN_TGT_FRGT_MAP
	ADD CONSTRAINT FK_ITEM_FRGT_TO_CPN_TGT_FRGT_MAP -- 상품사은품 -> 쿠폰대상사은품매핑
		FOREIGN KEY (
			ITEM_FRGT_ID -- 상품사은품식별번호
		)
		REFERENCES ITEM_FRGT ( -- 상품사은품
			ITEM_FRGT_ID -- 상품사은품식별번호
		);

-- 쿠폰대상제휴협력사매핑
ALTER TABLE CPN_TGT_AFF_PTN_MAP
	ADD CONSTRAINT FK_CPN_TO_CPN_TGT_AFF_PTN_MAP -- 쿠폰 -> 쿠폰대상제휴협력사매핑
		FOREIGN KEY (
			CPN_ID -- 쿠폰식별번호
		)
		REFERENCES CPN ( -- 쿠폰
			CPN_ID -- 쿠폰식별번호
		);

-- 쿠폰대상제휴협력사매핑
ALTER TABLE CPN_TGT_AFF_PTN_MAP
	ADD CONSTRAINT FK_VEN_TO_CPN_TGT_AFF_PTN_MAP -- 업체 -> 쿠폰대상제휴협력사매핑
		FOREIGN KEY (
			VEN_ID -- 업체식별번호
		)
		REFERENCES VEN ( -- 업체
			VEN_ID -- 업체식별번호
		);

-- 쿠폰대상상품카테고리매핑
ALTER TABLE CPN_TGT_ITEM_CATE_MAP
	ADD CONSTRAINT FK_CPN_TO_CPN_TGT_ITEM_CATE_MAP -- 쿠폰 -> 쿠폰대상상품카테고리매핑
		FOREIGN KEY (
			CPN_ID -- 쿠폰식별번호
		)
		REFERENCES CPN ( -- 쿠폰
			CPN_ID -- 쿠폰식별번호
		);

-- 쿠폰대상상품카테고리매핑
ALTER TABLE CPN_TGT_ITEM_CATE_MAP
	ADD CONSTRAINT FK_DP_CATE_TO_CPN_TGT_ITEM_CATE_MAP -- 전시카테고리 -> 쿠폰대상상품카테고리매핑
		FOREIGN KEY (
			DP_CATE_ID -- 전시카테고리식별번호
		)
		REFERENCES DP_CATE ( -- 전시카테고리
			DP_CATE_ID -- 전시카테고리식별번호
		);

-- 쿠폰대상회원매핑
ALTER TABLE CPN_TGT_MBR_MAP
	ADD CONSTRAINT FK_CPN_TO_CPN_TGT_MBR_MAP -- 쿠폰 -> 쿠폰대상회원매핑
		FOREIGN KEY (
			CPN_ID -- 쿠폰식별번호
		)
		REFERENCES CPN ( -- 쿠폰
			CPN_ID -- 쿠폰식별번호
		);

-- 쿠폰대상상품속성매핑
ALTER TABLE CPN_TGT_ITEM_ATTR_MAP
	ADD CONSTRAINT FK_CPN_TO_CPN_TGT_ITEM_ATTR_MAP -- 쿠폰 -> 쿠폰대상상품속성매핑
		FOREIGN KEY (
			CPN_ID -- 쿠폰식별번호
		)
		REFERENCES CPN ( -- 쿠폰
			CPN_ID -- 쿠폰식별번호
		);

-- 쿠폰대상상품매핑
ALTER TABLE CPN_TGT_ITEM_MAP
	ADD CONSTRAINT FK_ITEM_TO_CPN_TGT_ITEM_MAP -- 상품 -> 쿠폰대상상품매핑
		FOREIGN KEY (
			ITEM_ID -- 상품식별번호
		)
		REFERENCES ITEM ( -- 상품
			ITEM_ID -- 상품식별번호
		);

-- 쿠폰대상상품브랜드매핑
ALTER TABLE CPN_TGT_ITEM_BRND_MAP
	ADD CONSTRAINT FK_CPN_TO_CPN_TGT_ITEM_BRND_MAP -- 쿠폰 -> 쿠폰대상상품브랜드매핑
		FOREIGN KEY (
			CPN_ID -- 쿠폰식별번호
		)
		REFERENCES CPN ( -- 쿠폰
			CPN_ID -- 쿠폰식별번호
		);

-- 쿠폰대상상품브랜드매핑
ALTER TABLE CPN_TGT_ITEM_BRND_MAP
	ADD CONSTRAINT FK_DP_BRND_TO_CPN_TGT_ITEM_BRND_MAP -- 전시브랜드 -> 쿠폰대상상품브랜드매핑
		FOREIGN KEY (
			DP_BRND_ID -- 전시브랜드식별번호
		)
		REFERENCES DP_BRND ( -- 전시브랜드
			DP_BRND_ID -- 전시브랜드식별번호
		);

-- 포인트정책출석체크
ALTER TABLE PNT_PCY_ATND
	ADD CONSTRAINT FK_PNT_PCY_TO_PNT_PCY_ATND -- 포인트정책 -> 포인트정책출석체크
		FOREIGN KEY (
			PT_TP_CD -- 포인트유형코드
		)
		REFERENCES PNT_PCY ( -- 포인트정책
			PT_TP_CD -- 포인트유형코드
		);

-- 포인트
ALTER TABLE PNT
	ADD CONSTRAINT FK_ORD_ITEM_TO_PNT -- 주문상품 -> 포인트
		FOREIGN KEY (
			ORD_ITEM_ID -- 주문상품식별번호
		)
		REFERENCES ORD_ITEM ( -- 주문상품
			ORD_ITEM_ID -- 주문상품식별번호
		);

-- 포인트정책변경이력
ALTER TABLE PNT_PCY_CHIST
	ADD CONSTRAINT FK_PNT_PCY_TO_PNT_PCY_CHIST -- 포인트정책 -> 포인트정책변경이력
		FOREIGN KEY (
			PT_TP_CD -- 포인트유형코드
		)
		REFERENCES PNT_PCY ( -- 포인트정책
			PT_TP_CD -- 포인트유형코드
		);

-- 결제처리배치큐
ALTER TABLE PAY_PROC_BATCH_QUE
	ADD CONSTRAINT FK_PAY_TO_PAY_PROC_BATCH_QUE -- 결제 -> 결제처리배치큐
		FOREIGN KEY (
			PAY_ID -- 결제식별번호
		)
		REFERENCES PAY ( -- 결제
			PAY_ID -- 결제식별번호
		);

-- 결제
ALTER TABLE PAY
	ADD CONSTRAINT FK_PAY_TO_PAY -- 결제 -> 결제
		FOREIGN KEY (
			ORI_PAY_ID -- 원결제식별번호
		)
		REFERENCES PAY ( -- 결제
			PAY_ID -- 결제식별번호
		);

-- 결제
ALTER TABLE PAY
	ADD CONSTRAINT FK_ORD_CLM_TO_PAY -- 주문클레임 -> 결제
		FOREIGN KEY (
			ORD_CLM_ID -- 주문클레임식별번호
		)
		REFERENCES ORD_CLM ( -- 주문클레임
			ORD_CLM_ID -- 주문클레임식별번호
		);

-- 쿠폰발급조건
ALTER TABLE CPN_ISU_COND
	ADD CONSTRAINT FK_CPN_TO_CPN_ISU_COND -- 쿠폰 -> 쿠폰발급조건
		FOREIGN KEY (
			CPN_ID -- 쿠폰식별번호
		)
		REFERENCES CPN ( -- 쿠폰
			CPN_ID -- 쿠폰식별번호
		);

-- 포인트사용상세
ALTER TABLE PNT_USE_DTL
	ADD CONSTRAINT FK_PNT_SAVE_ID -- 포인트 -> 포인트적립식별번
		FOREIGN KEY (
			PT_SAVE_ID -- 포인트적립식별번호
		)
		REFERENCES PNT ( -- 포인트
			PT_ID -- 포인트식별번호
		);