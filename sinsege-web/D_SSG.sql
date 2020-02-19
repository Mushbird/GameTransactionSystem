--------------------------------------------------------
--  파일이 생성됨 - 일요일-1월-20-2019   
--------------------------------------------------------
--------------------------------------------------------
--  DDL for Table D_SSG_ASSESSMENT
--------------------------------------------------------

  CREATE TABLE "DEV30ID"."D_SSG_ASSESSMENT" 
   (	"A_CODE" VARCHAR2(200 BYTE), 
	"A_GOODS" VARCHAR2(200 BYTE), 
	"A_TITLE" VARCHAR2(500 BYTE), 
	"A_TEXT" VARCHAR2(1500 BYTE), 
	"A_ID" VARCHAR2(200 BYTE), 
	"A_SCORE" NUMBER(*,0), 
	"A_DATE" DATE, 
	"A_UPDATE" DATE, 
	"A_CATE" VARCHAR2(200 BYTE)
   ) SEGMENT CREATION IMMEDIATE 
  PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 NOCOMPRESS LOGGING
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "SYSTEM" ;
--------------------------------------------------------
--  DDL for Table D_SSG_GOODS
--------------------------------------------------------

  CREATE TABLE "DEV30ID"."D_SSG_GOODS" 
   (	"G_CODE" VARCHAR2(200 BYTE), 
	"GL_NAME" VARCHAR2(200 BYTE), 
	"G_CATE" VARCHAR2(200 BYTE), 
	"G_NAME" VARCHAR2(200 BYTE), 
	"G_ID" VARCHAR2(200 BYTE), 
	"G_PRICE" NUMBER(*,0), 
	"G_DETAIL" VARCHAR2(200 BYTE), 
	"G_STATE" VARCHAR2(200 BYTE), 
	"G_DATE" DATE, 
	"G_UPDATE" DATE
   ) SEGMENT CREATION IMMEDIATE 
  PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 NOCOMPRESS LOGGING
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "SYSTEM" ;
--------------------------------------------------------
--  DDL for Table D_SSG_GOODS_LEVEL
--------------------------------------------------------

  CREATE TABLE "DEV30ID"."D_SSG_GOODS_LEVEL" 
   (	"G_GRADE" VARCHAR2(200 BYTE), 
	"GL_NAME" VARCHAR2(200 BYTE), 
	"GL_PRICE" NUMBER(*,0), 
	"GL_ID" VARCHAR2(200 BYTE), 
	"GL_DATE" DATE
   ) SEGMENT CREATION IMMEDIATE 
  PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 NOCOMPRESS LOGGING
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "SYSTEM" ;
--------------------------------------------------------
--  DDL for Table D_SSG_MEMBER
--------------------------------------------------------

  CREATE TABLE "DEV30ID"."D_SSG_MEMBER" 
   (	"M_CODE" VARCHAR2(200 BYTE), 
	"B_NAME" VARCHAR2(200 BYTE), 
	"GL_NAME" VARCHAR2(200 BYTE), 
	"M_ID" VARCHAR2(200 BYTE), 
	"M_PW" VARCHAR2(200 BYTE), 
	"M_LEVEL" VARCHAR2(200 BYTE), 
	"M_NAME" VARCHAR2(200 BYTE), 
	"M_GOLD" NUMBER, 
	"M_POINT" NUMBER, 
	"M_COUNT" NUMBER, 
	"M_IN" DATE, 
	"M_DATE" DATE
   ) SEGMENT CREATION IMMEDIATE 
  PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 NOCOMPRESS LOGGING
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "SYSTEM" ;
--------------------------------------------------------
--  DDL for Table D_SSG_MEMBER_LEVEL
--------------------------------------------------------

  CREATE TABLE "DEV30ID"."D_SSG_MEMBER_LEVEL" 
   (	"B_GRADE" VARCHAR2(200 BYTE), 
	"B_NAME" VARCHAR2(200 BYTE), 
	"B_COUNT" NUMBER(*,0), 
	"B_PER" NUMBER(*,0), 
	"B_ID" VARCHAR2(200 BYTE), 
	"B_DATE" DATE
   ) SEGMENT CREATION IMMEDIATE 
  PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 NOCOMPRESS LOGGING
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "SYSTEM" ;
--------------------------------------------------------
--  DDL for Table D_SSG_ORDER
--------------------------------------------------------

  CREATE TABLE "DEV30ID"."D_SSG_ORDER" 
   (	"O_CODE" VARCHAR2(200 BYTE), 
	"G_CODE" VARCHAR2(200 BYTE), 
	"M_ID" VARCHAR2(200 BYTE), 
	"G_STATE" VARCHAR2(200 BYTE), 
	"O_TOTAL" NUMBER, 
	"O_DATE" DATE, 
	"G_NAME" VARCHAR2(200 BYTE)
   ) SEGMENT CREATION IMMEDIATE 
  PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 NOCOMPRESS LOGGING
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "SYSTEM" ;
REM INSERTING into DEV30ID.D_SSG_ASSESSMENT
SET DEFINE OFF;
Insert into DEV30ID.D_SSG_ASSESSMENT (A_CODE,A_GOODS,A_TITLE,A_TEXT,A_ID,A_SCORE,A_DATE,A_UPDATE,A_CATE) values ('2','몰락한 왕의 검','몰락한 왕의 검 후기 남깁니다.','베인 선템으로 가기 너무 좋네요 버프도 기대해 봅니다.','id002',5,to_date('19/01/14','RR/MM/DD'),to_date('19/01/14','RR/MM/DD'),'무기');
Insert into DEV30ID.D_SSG_ASSESSMENT (A_CODE,A_GOODS,A_TITLE,A_TEXT,A_ID,A_SCORE,A_DATE,A_UPDATE,A_CATE) values ('3','워모그의 갑옷','워모그 후기 남겨요^^...','탱커 유저로서 정말 잘 쓰고 있습니다. 근데 쓰다보니 보조 옵션이 너무 부실하지 않나 싶네요ㅠㅠ 좀 더 버프가 있어야 한다고 생각합니다 많이 파세요!','id001',4,to_date('19/01/14','RR/MM/DD'),to_date('19/01/14','RR/MM/DD'),'갑옷');
Insert into DEV30ID.D_SSG_ASSESSMENT (A_CODE,A_GOODS,A_TITLE,A_TEXT,A_ID,A_SCORE,A_DATE,A_UPDATE,A_CATE) values ('6','히히','메롱','ㅋㅋㅋㅋ','id001',5,to_date('19/01/17','RR/MM/DD'),to_date('19/01/17','RR/MM/DD'),'무기');
Insert into DEV30ID.D_SSG_ASSESSMENT (A_CODE,A_GOODS,A_TITLE,A_TEXT,A_ID,A_SCORE,A_DATE,A_UPDATE,A_CATE) values ('4','123','123','124124124','id002',5,to_date('19/01/16','RR/MM/DD'),to_date('19/01/16','RR/MM/DD'),'무기');
Insert into DEV30ID.D_SSG_ASSESSMENT (A_CODE,A_GOODS,A_TITLE,A_TEXT,A_ID,A_SCORE,A_DATE,A_UPDATE,A_CATE) values ('5','안녕','안녕하세요','ㅎㅇㅎㅇ','id001',4,to_date('19/01/17','RR/MM/DD'),to_date('19/01/17','RR/MM/DD'),'무기');
Insert into DEV30ID.D_SSG_ASSESSMENT (A_CODE,A_GOODS,A_TITLE,A_TEXT,A_ID,A_SCORE,A_DATE,A_UPDATE,A_CATE) values ('7','정령의형상','가격이 쫌 ..','너무 비싼것 같아요. 저렴하게 해주세요.','id003',5,to_date('19/01/17','RR/MM/DD'),to_date('19/01/17','RR/MM/DD'),'방어구');
Insert into DEV30ID.D_SSG_ASSESSMENT (A_CODE,A_GOODS,A_TITLE,A_TEXT,A_ID,A_SCORE,A_DATE,A_UPDATE,A_CATE) values ('8','각이 너무 안나와요','각이 너무 안나오는데요?','ㅋㅋㅋ','id003',2,to_date('19/01/17','RR/MM/DD'),to_date('19/01/18','RR/MM/DD'),'무기');
Insert into DEV30ID.D_SSG_ASSESSMENT (A_CODE,A_GOODS,A_TITLE,A_TEXT,A_ID,A_SCORE,A_DATE,A_UPDATE,A_CATE) values ('9','주인턴님 정말 이러기에요 ?','주인턴님 ','전래동화','id004',4,to_date('19/01/17','RR/MM/DD'),to_date('19/01/17','RR/MM/DD'),'무기');
Insert into DEV30ID.D_SSG_ASSESSMENT (A_CODE,A_GOODS,A_TITLE,A_TEXT,A_ID,A_SCORE,A_DATE,A_UPDATE,A_CATE) values ('10','메롱','메롱','페이징','id004',4,to_date('19/01/17','RR/MM/DD'),to_date('19/01/17','RR/MM/DD'),'갑옷');
Insert into DEV30ID.D_SSG_ASSESSMENT (A_CODE,A_GOODS,A_TITLE,A_TEXT,A_ID,A_SCORE,A_DATE,A_UPDATE,A_CATE) values ('12','파일 못넣어요 아직','헐 ...','^^','id001',3,to_date('19/01/17','RR/MM/DD'),to_date('19/01/17','RR/MM/DD'),'갑옷');
Insert into DEV30ID.D_SSG_ASSESSMENT (A_CODE,A_GOODS,A_TITLE,A_TEXT,A_ID,A_SCORE,A_DATE,A_UPDATE,A_CATE) values ('13','완료했습니다.','리스트 페이징','^^','id001',3,to_date('19/01/17','RR/MM/DD'),to_date('19/01/17','RR/MM/DD'),'갑옷');
REM INSERTING into DEV30ID.D_SSG_GOODS
SET DEFINE OFF;
Insert into DEV30ID.D_SSG_GOODS (G_CODE,GL_NAME,G_CATE,G_NAME,G_ID,G_PRICE,G_DETAIL,G_STATE,G_DATE,G_UPDATE) values ('goods_1','전설','무기','삼위일체','id004',3900,'모든능력치증가','판매완료',to_date('19/01/15','RR/MM/DD'),to_date('19/01/20','RR/MM/DD'));
Insert into DEV30ID.D_SSG_GOODS (G_CODE,GL_NAME,G_CATE,G_NAME,G_ID,G_PRICE,G_DETAIL,G_STATE,G_DATE,G_UPDATE) values ('goods_2','전설','무기(공격력)','무한의대검','id004',3700,'치명타2배증가','판매중',to_date('19/01/15','RR/MM/DD'),to_date('19/01/18','RR/MM/DD'));
Insert into DEV30ID.D_SSG_GOODS (G_CODE,GL_NAME,G_CATE,G_NAME,G_ID,G_PRICE,G_DETAIL,G_STATE,G_DATE,G_UPDATE) values ('goods_3','전설','무기(주문력)','라바돈의죽음모자','id004',3800,'주문력증폭','판매중',to_date('19/01/03','RR/MM/DD'),to_date('19/01/18','RR/MM/DD'));
Insert into DEV30ID.D_SSG_GOODS (G_CODE,GL_NAME,G_CATE,G_NAME,G_ID,G_PRICE,G_DETAIL,G_STATE,G_DATE,G_UPDATE) values ('goods_4','전설','무기(공격력,체력흡수)','몰락한왕의검','id005',3500,'체력흡수','판매완료',to_date('19/01/14','RR/MM/DD'),to_date('19/01/20','RR/MM/DD'));
Insert into DEV30ID.D_SSG_GOODS (G_CODE,GL_NAME,G_CATE,G_NAME,G_ID,G_PRICE,G_DETAIL,G_STATE,G_DATE,G_UPDATE) values ('goods_5','전설','무기(공격력,체력흡수)','죽음의무도','id005',3750,'체력흡수','판매중',to_date('19/01/15','RR/MM/DD'),to_date('19/01/20','RR/MM/DD'));
Insert into DEV30ID.D_SSG_GOODS (G_CODE,GL_NAME,G_CATE,G_NAME,G_ID,G_PRICE,G_DETAIL,G_STATE,G_DATE,G_UPDATE) values ('goods_6','희귀','무기(공격력,방관)','칠흑의양날도끼','id006',3750,'방어구관통력','판매중',to_date('19/01/04','RR/MM/DD'),to_date('19/01/15','RR/MM/DD'));
Insert into DEV30ID.D_SSG_GOODS (G_CODE,GL_NAME,G_CATE,G_NAME,G_ID,G_PRICE,G_DETAIL,G_STATE,G_DATE,G_UPDATE) values ('goods_7','노멀','체력회복(물약)','체력포션','id006',50,'체력회복','판매중',to_date('19/01/15','RR/MM/DD'),to_date('19/01/20','RR/MM/DD'));
Insert into DEV30ID.D_SSG_GOODS (G_CODE,GL_NAME,G_CATE,G_NAME,G_ID,G_PRICE,G_DETAIL,G_STATE,G_DATE,G_UPDATE) values ('goods_8','에픽','신발(공격속도)','광전사의신발','id007',1700,'공격속도증가','판매완료',to_date('19/01/08','RR/MM/DD'),to_date('19/01/20','RR/MM/DD'));
Insert into DEV30ID.D_SSG_GOODS (G_CODE,GL_NAME,G_CATE,G_NAME,G_ID,G_PRICE,G_DETAIL,G_STATE,G_DATE,G_UPDATE) values ('goods_9','에픽','신발(방어력증가)','닌자의신발','id007',1700,'방어력증가','판매중',to_date('19/01/01','RR/MM/DD'),to_date('19/01/15','RR/MM/DD'));
Insert into DEV30ID.D_SSG_GOODS (G_CODE,GL_NAME,G_CATE,G_NAME,G_ID,G_PRICE,G_DETAIL,G_STATE,G_DATE,G_UPDATE) values ('goods_10','노멀','갑옷(방어력)','천갑옷','id008',300,'방어력증가','판매완료',to_date('19/01/03','RR/MM/DD'),to_date('19/01/20','RR/MM/DD'));
Insert into DEV30ID.D_SSG_GOODS (G_CODE,GL_NAME,G_CATE,G_NAME,G_ID,G_PRICE,G_DETAIL,G_STATE,G_DATE,G_UPDATE) values ('goods_11','희귀','갑옷(방어력증가)','가시갑옷','id008',2200,'방어력증가','판매중',to_date('19/01/02','RR/MM/DD'),to_date('19/01/15','RR/MM/DD'));
Insert into DEV30ID.D_SSG_GOODS (G_CODE,GL_NAME,G_CATE,G_NAME,G_ID,G_PRICE,G_DETAIL,G_STATE,G_DATE,G_UPDATE) values ('goods_12','전설','갑옷(체력증가)','워모그갑옷','id009',3000,'체력대폭증가','판매중',to_date('19/01/04','RR/MM/DD'),to_date('19/01/15','RR/MM/DD'));
Insert into DEV30ID.D_SSG_GOODS (G_CODE,GL_NAME,G_CATE,G_NAME,G_ID,G_PRICE,G_DETAIL,G_STATE,G_DATE,G_UPDATE) values ('goods_13','전설','무기(공격속도)','스태틱단검','id004',2600,'치명타증가','판매중',to_date('19/01/07','RR/MM/DD'),to_date('19/01/15','RR/MM/DD'));
Insert into DEV30ID.D_SSG_GOODS (G_CODE,GL_NAME,G_CATE,G_NAME,G_ID,G_PRICE,G_DETAIL,G_STATE,G_DATE,G_UPDATE) values ('goods_14','전설','무기(주문력)','루덴의메아리','id004',3100,'주문력증가','판매중',to_date('19/01/02','RR/MM/DD'),to_date('19/01/15','RR/MM/DD'));
Insert into DEV30ID.D_SSG_GOODS (G_CODE,GL_NAME,G_CATE,G_NAME,G_ID,G_PRICE,G_DETAIL,G_STATE,G_DATE,G_UPDATE) values ('goods_15','전설','갑옷(방어력)','존야의모레시계','id004',3150,'주문력증가','판매중',to_date('19/01/15','RR/MM/DD'),to_date('19/01/15','RR/MM/DD'));
Insert into DEV30ID.D_SSG_GOODS (G_CODE,GL_NAME,G_CATE,G_NAME,G_ID,G_PRICE,G_DETAIL,G_STATE,G_DATE,G_UPDATE) values ('goods_16','전설','무기(공격력)','롱소드','id005',350,'공격력증가','판매중',to_date('19/01/03','RR/MM/DD'),to_date('19/01/15','RR/MM/DD'));
Insert into DEV30ID.D_SSG_GOODS (G_CODE,GL_NAME,G_CATE,G_NAME,G_ID,G_PRICE,G_DETAIL,G_STATE,G_DATE,G_UPDATE) values ('goods_17','전설','무기(체력흡수)','피바라기','id005',3200,'체력흡수','판매중',to_date('19/01/15','RR/MM/DD'),to_date('19/01/15','RR/MM/DD'));
Insert into DEV30ID.D_SSG_GOODS (G_CODE,GL_NAME,G_CATE,G_NAME,G_ID,G_PRICE,G_DETAIL,G_STATE,G_DATE,G_UPDATE) values ('goods_18','노멀','신발(이동속도)','신속의장화','id005',1700,'이동속도증가','판매중',to_date('19/01/16','RR/MM/DD'),to_date('19/01/16','RR/MM/DD'));
Insert into DEV30ID.D_SSG_GOODS (G_CODE,GL_NAME,G_CATE,G_NAME,G_ID,G_PRICE,G_DETAIL,G_STATE,G_DATE,G_UPDATE) values ('goods_19','노멀','신발(이동속도)','기동력의장화','id006',1700,'이동속도증가','판매중',to_date('19/01/16','RR/MM/DD'),to_date('19/01/16','RR/MM/DD'));
Insert into DEV30ID.D_SSG_GOODS (G_CODE,GL_NAME,G_CATE,G_NAME,G_ID,G_PRICE,G_DETAIL,G_STATE,G_DATE,G_UPDATE) values ('goods_20','노멀','신발(마법저항력)','헤르메스의발걸음','id006',1800,'마법저항력증가','판매중',to_date('19/01/07','RR/MM/DD'),to_date('19/01/16','RR/MM/DD'));
Insert into DEV30ID.D_SSG_GOODS (G_CODE,GL_NAME,G_CATE,G_NAME,G_ID,G_PRICE,G_DETAIL,G_STATE,G_DATE,G_UPDATE) values ('goods_21','노멀','장신구(서포터)','고대주화','id006',350,'돈획득량증가','판매중',to_date('19/01/07','RR/MM/DD'),to_date('19/01/16','RR/MM/DD'));
Insert into DEV30ID.D_SSG_GOODS (G_CODE,GL_NAME,G_CATE,G_NAME,G_ID,G_PRICE,G_DETAIL,G_STATE,G_DATE,G_UPDATE) values ('goods_22','노멀','장신구(주문력)','주문도둑검','id006',350,'주문력증가','판매완료',to_date('19/01/16','RR/MM/DD'),to_date('19/01/20','RR/MM/DD'));
Insert into DEV30ID.D_SSG_GOODS (G_CODE,GL_NAME,G_CATE,G_NAME,G_ID,G_PRICE,G_DETAIL,G_STATE,G_DATE,G_UPDATE) values ('goods_23','노멀','장신구(체력)','고대유물방패','id007',350,'방어력증가','판매중',to_date('19/01/16','RR/MM/DD'),to_date('19/01/16','RR/MM/DD'));
Insert into DEV30ID.D_SSG_GOODS (G_CODE,GL_NAME,G_CATE,G_NAME,G_ID,G_PRICE,G_DETAIL,G_STATE,G_DATE,G_UPDATE) values ('goods_24','유니크','장신구(주문력)','수호자의유물','id007',2200,'주문력증가','판매완료',to_date('19/01/08','RR/MM/DD'),to_date('19/01/20','RR/MM/DD'));
Insert into DEV30ID.D_SSG_GOODS (G_CODE,GL_NAME,G_CATE,G_NAME,G_ID,G_PRICE,G_DETAIL,G_STATE,G_DATE,G_UPDATE) values ('goods_25','유니크','장신구(서포터)','승천의눈','id007',1900,'초당돈증가','판매중',to_date('19/01/16','RR/MM/DD'),to_date('19/01/16','RR/MM/DD'));
Insert into DEV30ID.D_SSG_GOODS (G_CODE,GL_NAME,G_CATE,G_NAME,G_ID,G_PRICE,G_DETAIL,G_STATE,G_DATE,G_UPDATE) values ('goods_26','유니크','무기(스플래쉬)','굶주린히드라','id007',3000,'스플래쉬데미지','판매중',to_date('19/01/16','RR/MM/DD'),to_date('19/01/16','RR/MM/DD'));
Insert into DEV30ID.D_SSG_GOODS (G_CODE,GL_NAME,G_CATE,G_NAME,G_ID,G_PRICE,G_DETAIL,G_STATE,G_DATE,G_UPDATE) values ('goods_27','유니크','무기(부활)','수호천사','id008',2700,'1회부활가능','판매중',to_date('19/01/09','RR/MM/DD'),to_date('19/01/16','RR/MM/DD'));
Insert into DEV30ID.D_SSG_GOODS (G_CODE,GL_NAME,G_CATE,G_NAME,G_ID,G_PRICE,G_DETAIL,G_STATE,G_DATE,G_UPDATE) values ('goods_28','에픽','무기(공격력)','B.F대검','id008',1350,'공격력증가','판매중',to_date('19/01/16','RR/MM/DD'),to_date('19/01/16','RR/MM/DD'));
Insert into DEV30ID.D_SSG_GOODS (G_CODE,GL_NAME,G_CATE,G_NAME,G_ID,G_PRICE,G_DETAIL,G_STATE,G_DATE,G_UPDATE) values ('goods_29','희귀','무기(공격력)','정수약탈자','id008',3100,'공격력증가','판매중',to_date('19/01/16','RR/MM/DD'),to_date('19/01/16','RR/MM/DD'));
Insert into DEV30ID.D_SSG_GOODS (G_CODE,GL_NAME,G_CATE,G_NAME,G_ID,G_PRICE,G_DETAIL,G_STATE,G_DATE,G_UPDATE) values ('goods_30','희귀','무기(방어구관통)','밤의끝자락','id008',3100,'방어구관통','판매중',to_date('19/01/16','RR/MM/DD'),to_date('19/01/16','RR/MM/DD'));
Insert into DEV30ID.D_SSG_GOODS (G_CODE,GL_NAME,G_CATE,G_NAME,G_ID,G_PRICE,G_DETAIL,G_STATE,G_DATE,G_UPDATE) values ('goods_31','에픽','무기(마법저항력)','주문포식자','id009',1700,'마법저항력증가','판매중',to_date('19/01/03','RR/MM/DD'),to_date('19/01/16','RR/MM/DD'));
Insert into DEV30ID.D_SSG_GOODS (G_CODE,GL_NAME,G_CATE,G_NAME,G_ID,G_PRICE,G_DETAIL,G_STATE,G_DATE,G_UPDATE) values ('goods_33','희귀','무기(치명타)','폭풍갈퀴','id009',2900,'치명타증가','판매중',to_date('19/01/16','RR/MM/DD'),to_date('19/01/16','RR/MM/DD'));
Insert into DEV30ID.D_SSG_GOODS (G_CODE,GL_NAME,G_CATE,G_NAME,G_ID,G_PRICE,G_DETAIL,G_STATE,G_DATE,G_UPDATE) values ('goods_34','유니크','방어구(방어력)','얼어붙은심장','id009',2800,'방어력증가','판매중',to_date('19/01/16','RR/MM/DD'),to_date('19/01/16','RR/MM/DD'));
Insert into DEV30ID.D_SSG_GOODS (G_CODE,GL_NAME,G_CATE,G_NAME,G_ID,G_PRICE,G_DETAIL,G_STATE,G_DATE,G_UPDATE) values ('goods_32','에픽','무기(공격속도)','쐐기검','id010',1100,'공격속도증가','판매중',to_date('19/01/04','RR/MM/DD'),to_date('19/01/16','RR/MM/DD'));
Insert into DEV30ID.D_SSG_GOODS (G_CODE,GL_NAME,G_CATE,G_NAME,G_ID,G_PRICE,G_DETAIL,G_STATE,G_DATE,G_UPDATE) values ('goods_35','유니크','방어구(방어력)','가고일돌갑옷','id010',2500,'방어력증가','판매중',to_date('19/01/16','RR/MM/DD'),to_date('19/01/16','RR/MM/DD'));
Insert into DEV30ID.D_SSG_GOODS (G_CODE,GL_NAME,G_CATE,G_NAME,G_ID,G_PRICE,G_DETAIL,G_STATE,G_DATE,G_UPDATE) values ('goods_36','희귀','방어구(이속증가)','정당한영광','id010',3000,'이동속도증가','판매중',to_date('19/01/16','RR/MM/DD'),to_date('19/01/16','RR/MM/DD'));
Insert into DEV30ID.D_SSG_GOODS (G_CODE,GL_NAME,G_CATE,G_NAME,G_ID,G_PRICE,G_DETAIL,G_STATE,G_DATE,G_UPDATE) values ('goods_37','전설','방어구(치명타감소)','란두인의예언','id010',3200,'치명타감소','판매중',to_date('19/01/08','RR/MM/DD'),to_date('19/01/16','RR/MM/DD'));
Insert into DEV30ID.D_SSG_GOODS (G_CODE,GL_NAME,G_CATE,G_NAME,G_ID,G_PRICE,G_DETAIL,G_STATE,G_DATE,G_UPDATE) values ('goods_38','희귀','방어구(소환)','즈롯차원문','id011',2900,'자폭맨소환','판매중',to_date('19/01/16','RR/MM/DD'),to_date('19/01/16','RR/MM/DD'));
Insert into DEV30ID.D_SSG_GOODS (G_CODE,GL_NAME,G_CATE,G_NAME,G_ID,G_PRICE,G_DETAIL,G_STATE,G_DATE,G_UPDATE) values ('goods_39','전설','방어구(마법저항력)','망령의두건','id011',1700,'마법저항력','판매중',to_date('19/01/08','RR/MM/DD'),to_date('19/01/17','RR/MM/DD'));
Insert into DEV30ID.D_SSG_GOODS (G_CODE,GL_NAME,G_CATE,G_NAME,G_ID,G_PRICE,G_DETAIL,G_STATE,G_DATE,G_UPDATE) values ('goods_40','전설','방어구(마법저항력)','정령의형상','id011',2800,'마법저항력증가','판매중',to_date('19/01/16','RR/MM/DD'),to_date('19/01/16','RR/MM/DD'));
Insert into DEV30ID.D_SSG_GOODS (G_CODE,GL_NAME,G_CATE,G_NAME,G_ID,G_PRICE,G_DETAIL,G_STATE,G_DATE,G_UPDATE) values ('goods_41','유니크','소모품','체력포션','id011',500,'체력 증가','판매중',to_date('19/01/18','RR/MM/DD'),to_date('19/01/18','RR/MM/DD'));
REM INSERTING into DEV30ID.D_SSG_GOODS_LEVEL
SET DEFINE OFF;
Insert into DEV30ID.D_SSG_GOODS_LEVEL (G_GRADE,GL_NAME,GL_PRICE,GL_ID,GL_DATE) values ('g_grade_1','전설',400,'id001',to_date('19/01/16','RR/MM/DD'));
Insert into DEV30ID.D_SSG_GOODS_LEVEL (G_GRADE,GL_NAME,GL_PRICE,GL_ID,GL_DATE) values ('g_grade_2','희귀',300,'id001',to_date('19/01/15','RR/MM/DD'));
Insert into DEV30ID.D_SSG_GOODS_LEVEL (G_GRADE,GL_NAME,GL_PRICE,GL_ID,GL_DATE) values ('g_grade_3','유니크',200,'id001',to_date('19/01/15','RR/MM/DD'));
Insert into DEV30ID.D_SSG_GOODS_LEVEL (G_GRADE,GL_NAME,GL_PRICE,GL_ID,GL_DATE) values ('g_grade_4','에픽',100,'id001',to_date('19/01/15','RR/MM/DD'));
Insert into DEV30ID.D_SSG_GOODS_LEVEL (G_GRADE,GL_NAME,GL_PRICE,GL_ID,GL_DATE) values ('g_grade_5','노멀',0,'id001',to_date('19/01/15','RR/MM/DD'));
REM INSERTING into DEV30ID.D_SSG_MEMBER
SET DEFINE OFF;
Insert into DEV30ID.D_SSG_MEMBER (M_CODE,B_NAME,GL_NAME,M_ID,M_PW,M_LEVEL,M_NAME,M_GOLD,M_POINT,M_COUNT,M_IN,M_DATE) values ('mem_1','브론즈','전설','id001','pw001','관리자','슬기',17400,30700,0,to_date('19/01/02','RR/MM/DD'),to_date('19/01/20','RR/MM/DD'));
Insert into DEV30ID.D_SSG_MEMBER (M_CODE,B_NAME,GL_NAME,M_ID,M_PW,M_LEVEL,M_NAME,M_GOLD,M_POINT,M_COUNT,M_IN,M_DATE) values ('mem_2','브론즈','희귀','id002','pw002','관리자','조이',21700,2050,0,to_date('19/01/03','RR/MM/DD'),to_date('19/01/16','RR/MM/DD'));
Insert into DEV30ID.D_SSG_MEMBER (M_CODE,B_NAME,GL_NAME,M_ID,M_PW,M_LEVEL,M_NAME,M_GOLD,M_POINT,M_COUNT,M_IN,M_DATE) values ('mem_7','브론즈','유니크','id007','pw007','관리자','아이유',32200,1500,0,to_date('19/01/17','RR/MM/DD'),to_date('19/01/17','RR/MM/DD'));
Insert into DEV30ID.D_SSG_MEMBER (M_CODE,B_NAME,GL_NAME,M_ID,M_PW,M_LEVEL,M_NAME,M_GOLD,M_POINT,M_COUNT,M_IN,M_DATE) values ('mem_4','실버','유니크','id004','pw004','회원','아이린',68000,5030,14,to_date('19/01/07','RR/MM/DD'),to_date('19/01/17','RR/MM/DD'));
Insert into DEV30ID.D_SSG_MEMBER (M_CODE,B_NAME,GL_NAME,M_ID,M_PW,M_LEVEL,M_NAME,M_GOLD,M_POINT,M_COUNT,M_IN,M_DATE) values ('mem_5','실버','에픽','id005','pw005','회원','예리',19285,2030,20,to_date('19/01/09','RR/MM/DD'),to_date('19/01/07','RR/MM/DD'));
Insert into DEV30ID.D_SSG_MEMBER (M_CODE,B_NAME,GL_NAME,M_ID,M_PW,M_LEVEL,M_NAME,M_GOLD,M_POINT,M_COUNT,M_IN,M_DATE) values ('mem_6','다이아','노멀','id006','pw006','회원','사랑',10350,5000,85,to_date('19/01/09','RR/MM/DD'),to_date('19/01/11','RR/MM/DD'));
Insert into DEV30ID.D_SSG_MEMBER (M_CODE,B_NAME,GL_NAME,M_ID,M_PW,M_LEVEL,M_NAME,M_GOLD,M_POINT,M_COUNT,M_IN,M_DATE) values ('mem_3','플래티넘','유니크','id003','pw003','회원','웬디',12610,1000,43,to_date('19/01/05','RR/MM/DD'),to_date('19/01/17','RR/MM/DD'));
Insert into DEV30ID.D_SSG_MEMBER (M_CODE,B_NAME,GL_NAME,M_ID,M_PW,M_LEVEL,M_NAME,M_GOLD,M_POINT,M_COUNT,M_IN,M_DATE) values ('mem_8','골드','희귀','id008','pw008','회원','RM',10020,3500,22,to_date('19/01/02','RR/MM/DD'),to_date('19/01/17','RR/MM/DD'));
Insert into DEV30ID.D_SSG_MEMBER (M_CODE,B_NAME,GL_NAME,M_ID,M_PW,M_LEVEL,M_NAME,M_GOLD,M_POINT,M_COUNT,M_IN,M_DATE) values ('mem_9','플래티넘','에픽','id009','pw009','회원','지민',12990,2500,45,to_date('19/01/05','RR/MM/DD'),to_date('19/01/17','RR/MM/DD'));
Insert into DEV30ID.D_SSG_MEMBER (M_CODE,B_NAME,GL_NAME,M_ID,M_PW,M_LEVEL,M_NAME,M_GOLD,M_POINT,M_COUNT,M_IN,M_DATE) values ('mem_10','실버','전설','id010','pw010','회원','정국',2700,5510,15,to_date('19/01/02','RR/MM/DD'),to_date('19/01/17','RR/MM/DD'));
Insert into DEV30ID.D_SSG_MEMBER (M_CODE,B_NAME,GL_NAME,M_ID,M_PW,M_LEVEL,M_NAME,M_GOLD,M_POINT,M_COUNT,M_IN,M_DATE) values ('mem_11','골드','노멀','id011','pw011','회원','슈가',5000,2600,20,to_date('19/01/05','RR/MM/DD'),to_date('19/01/17','RR/MM/DD'));
REM INSERTING into DEV30ID.D_SSG_MEMBER_LEVEL
SET DEFINE OFF;
Insert into DEV30ID.D_SSG_MEMBER_LEVEL (B_GRADE,B_NAME,B_COUNT,B_PER,B_ID,B_DATE) values ('b_grade_1','다이아',80,25,'id001',to_date('19/01/15','RR/MM/DD'));
Insert into DEV30ID.D_SSG_MEMBER_LEVEL (B_GRADE,B_NAME,B_COUNT,B_PER,B_ID,B_DATE) values ('b_grade_2','플래티넘',40,20,'id001',to_date('19/01/15','RR/MM/DD'));
Insert into DEV30ID.D_SSG_MEMBER_LEVEL (B_GRADE,B_NAME,B_COUNT,B_PER,B_ID,B_DATE) values ('b_grade_3','골드',20,15,'id001',to_date('19/01/15','RR/MM/DD'));
Insert into DEV30ID.D_SSG_MEMBER_LEVEL (B_GRADE,B_NAME,B_COUNT,B_PER,B_ID,B_DATE) values ('b_grade_4','실버',10,10,'id001',to_date('19/01/15','RR/MM/DD'));
Insert into DEV30ID.D_SSG_MEMBER_LEVEL (B_GRADE,B_NAME,B_COUNT,B_PER,B_ID,B_DATE) values ('b_grade_5','브론즈',5,5,'id001',to_date('19/01/16','RR/MM/DD'));
REM INSERTING into DEV30ID.D_SSG_ORDER
SET DEFINE OFF;
Insert into DEV30ID.D_SSG_ORDER (O_CODE,G_CODE,M_ID,G_STATE,O_TOTAL,O_DATE,G_NAME) values ('o_code','goods_8','id004','보유중',1620,to_date('19/01/20','RR/MM/DD'),'광전사의신발');
Insert into DEV30ID.D_SSG_ORDER (O_CODE,G_CODE,M_ID,G_STATE,O_TOTAL,O_DATE,G_NAME) values ('o_code','goods_1','id004','보유중',3870,to_date('19/01/20','RR/MM/DD'),'삼위일체');
Insert into DEV30ID.D_SSG_ORDER (O_CODE,G_CODE,M_ID,G_STATE,O_TOTAL,O_DATE,G_NAME) values ('o_code','goods_4','id004','보유중',3510,to_date('19/01/20','RR/MM/DD'),'몰락한왕의검');
Insert into DEV30ID.D_SSG_ORDER (O_CODE,G_CODE,M_ID,G_STATE,O_TOTAL,O_DATE,G_NAME) values ('o_code','goods_10','id005','보유중',270,to_date('19/01/20','RR/MM/DD'),'천갑옷');
Insert into DEV30ID.D_SSG_ORDER (O_CODE,G_CODE,M_ID,G_STATE,O_TOTAL,O_DATE,G_NAME) values ('o_code','goods_24','id005','보유중',2340,to_date('19/01/20','RR/MM/DD'),'수호자의유물');
Insert into DEV30ID.D_SSG_ORDER (O_CODE,G_CODE,M_ID,G_STATE,O_TOTAL,O_DATE,G_NAME) values ('o_code','goods_22','id005','보유중',675,to_date('19/01/20','RR/MM/DD'),'주문도둑검');
--------------------------------------------------------
--  DDL for Index SYS_C007034
--------------------------------------------------------

  CREATE UNIQUE INDEX "DEV30ID"."SYS_C007034" ON "DEV30ID"."D_SSG_ASSESSMENT" ("A_CODE") 
  PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "SYSTEM" ;
--------------------------------------------------------
--  DDL for Index SSG_GOODS_PK
--------------------------------------------------------

  CREATE UNIQUE INDEX "DEV30ID"."SSG_GOODS_PK" ON "DEV30ID"."D_SSG_GOODS" ("G_CODE") 
  PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "SYSTEM" ;
--------------------------------------------------------
--  DDL for Index SYS_C007032
--------------------------------------------------------

  CREATE UNIQUE INDEX "DEV30ID"."SYS_C007032" ON "DEV30ID"."D_SSG_GOODS_LEVEL" ("G_GRADE") 
  PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "SYSTEM" ;
--------------------------------------------------------
--  DDL for Index SYS_C007021
--------------------------------------------------------

  CREATE UNIQUE INDEX "DEV30ID"."SYS_C007021" ON "DEV30ID"."D_SSG_MEMBER" ("M_CODE") 
  PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "SYSTEM" ;
--------------------------------------------------------
--  DDL for Index SYS_C007027
--------------------------------------------------------

  CREATE UNIQUE INDEX "DEV30ID"."SYS_C007027" ON "DEV30ID"."D_SSG_MEMBER_LEVEL" ("B_GRADE") 
  PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "SYSTEM" ;
--------------------------------------------------------
--  Constraints for Table D_SSG_ASSESSMENT
--------------------------------------------------------

  ALTER TABLE "DEV30ID"."D_SSG_ASSESSMENT" ADD PRIMARY KEY ("A_CODE")
  USING INDEX PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "SYSTEM"  ENABLE;
  ALTER TABLE "DEV30ID"."D_SSG_ASSESSMENT" MODIFY ("A_SCORE" NOT NULL ENABLE);
  ALTER TABLE "DEV30ID"."D_SSG_ASSESSMENT" MODIFY ("A_ID" NOT NULL ENABLE);
  ALTER TABLE "DEV30ID"."D_SSG_ASSESSMENT" MODIFY ("A_TEXT" NOT NULL ENABLE);
  ALTER TABLE "DEV30ID"."D_SSG_ASSESSMENT" MODIFY ("A_TITLE" NOT NULL ENABLE);
  ALTER TABLE "DEV30ID"."D_SSG_ASSESSMENT" MODIFY ("A_GOODS" NOT NULL ENABLE);
  ALTER TABLE "DEV30ID"."D_SSG_ASSESSMENT" MODIFY ("A_CODE" NOT NULL ENABLE);
--------------------------------------------------------
--  Constraints for Table D_SSG_GOODS
--------------------------------------------------------

  ALTER TABLE "DEV30ID"."D_SSG_GOODS" ADD CONSTRAINT "SSG_GOODS_PK" PRIMARY KEY ("G_CODE")
  USING INDEX PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "SYSTEM"  ENABLE;
--------------------------------------------------------
--  Constraints for Table D_SSG_GOODS_LEVEL
--------------------------------------------------------

  ALTER TABLE "DEV30ID"."D_SSG_GOODS_LEVEL" ADD PRIMARY KEY ("G_GRADE")
  USING INDEX PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "SYSTEM"  ENABLE;
  ALTER TABLE "DEV30ID"."D_SSG_GOODS_LEVEL" MODIFY ("GL_ID" NOT NULL ENABLE);
  ALTER TABLE "DEV30ID"."D_SSG_GOODS_LEVEL" MODIFY ("GL_PRICE" NOT NULL ENABLE);
  ALTER TABLE "DEV30ID"."D_SSG_GOODS_LEVEL" MODIFY ("GL_NAME" NOT NULL ENABLE);
  ALTER TABLE "DEV30ID"."D_SSG_GOODS_LEVEL" MODIFY ("G_GRADE" NOT NULL ENABLE);
--------------------------------------------------------
--  Constraints for Table D_SSG_MEMBER
--------------------------------------------------------

  ALTER TABLE "DEV30ID"."D_SSG_MEMBER" ADD PRIMARY KEY ("M_CODE")
  USING INDEX PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "SYSTEM"  ENABLE;
--------------------------------------------------------
--  Constraints for Table D_SSG_MEMBER_LEVEL
--------------------------------------------------------

  ALTER TABLE "DEV30ID"."D_SSG_MEMBER_LEVEL" ADD PRIMARY KEY ("B_GRADE")
  USING INDEX PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "SYSTEM"  ENABLE;
