--------------------------------------------------------
--  ������ ������ - �Ͽ���-1��-20-2019   
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
Insert into DEV30ID.D_SSG_ASSESSMENT (A_CODE,A_GOODS,A_TITLE,A_TEXT,A_ID,A_SCORE,A_DATE,A_UPDATE,A_CATE) values ('2','������ ���� ��','������ ���� �� �ı� ����ϴ�.','���� �������� ���� �ʹ� ���׿� ������ ����� ���ϴ�.','id002',5,to_date('19/01/14','RR/MM/DD'),to_date('19/01/14','RR/MM/DD'),'����');
Insert into DEV30ID.D_SSG_ASSESSMENT (A_CODE,A_GOODS,A_TITLE,A_TEXT,A_ID,A_SCORE,A_DATE,A_UPDATE,A_CATE) values ('3','������� ����','����� �ı� ���ܿ�^^...','��Ŀ �����μ� ���� �� ���� �ֽ��ϴ�. �ٵ� ���ٺ��� ���� �ɼ��� �ʹ� �ν����� �ʳ� �ͳ׿�Ф� �� �� ������ �־�� �Ѵٰ� �����մϴ� ���� �ļ���!','id001',4,to_date('19/01/14','RR/MM/DD'),to_date('19/01/14','RR/MM/DD'),'����');
Insert into DEV30ID.D_SSG_ASSESSMENT (A_CODE,A_GOODS,A_TITLE,A_TEXT,A_ID,A_SCORE,A_DATE,A_UPDATE,A_CATE) values ('6','����','�޷�','��������','id001',5,to_date('19/01/17','RR/MM/DD'),to_date('19/01/17','RR/MM/DD'),'����');
Insert into DEV30ID.D_SSG_ASSESSMENT (A_CODE,A_GOODS,A_TITLE,A_TEXT,A_ID,A_SCORE,A_DATE,A_UPDATE,A_CATE) values ('4','123','123','124124124','id002',5,to_date('19/01/16','RR/MM/DD'),to_date('19/01/16','RR/MM/DD'),'����');
Insert into DEV30ID.D_SSG_ASSESSMENT (A_CODE,A_GOODS,A_TITLE,A_TEXT,A_ID,A_SCORE,A_DATE,A_UPDATE,A_CATE) values ('5','�ȳ�','�ȳ��ϼ���','��������','id001',4,to_date('19/01/17','RR/MM/DD'),to_date('19/01/17','RR/MM/DD'),'����');
Insert into DEV30ID.D_SSG_ASSESSMENT (A_CODE,A_GOODS,A_TITLE,A_TEXT,A_ID,A_SCORE,A_DATE,A_UPDATE,A_CATE) values ('7','����������','������ �� ..','�ʹ� ��Ѱ� ���ƿ�. �����ϰ� ���ּ���.','id003',5,to_date('19/01/17','RR/MM/DD'),to_date('19/01/17','RR/MM/DD'),'��');
Insert into DEV30ID.D_SSG_ASSESSMENT (A_CODE,A_GOODS,A_TITLE,A_TEXT,A_ID,A_SCORE,A_DATE,A_UPDATE,A_CATE) values ('8','���� �ʹ� �ȳ��Ϳ�','���� �ʹ� �ȳ����µ���?','������','id003',2,to_date('19/01/17','RR/MM/DD'),to_date('19/01/18','RR/MM/DD'),'����');
Insert into DEV30ID.D_SSG_ASSESSMENT (A_CODE,A_GOODS,A_TITLE,A_TEXT,A_ID,A_SCORE,A_DATE,A_UPDATE,A_CATE) values ('9','�����ϴ� ���� �̷��⿡�� ?','�����ϴ� ','������ȭ','id004',4,to_date('19/01/17','RR/MM/DD'),to_date('19/01/17','RR/MM/DD'),'����');
Insert into DEV30ID.D_SSG_ASSESSMENT (A_CODE,A_GOODS,A_TITLE,A_TEXT,A_ID,A_SCORE,A_DATE,A_UPDATE,A_CATE) values ('10','�޷�','�޷�','����¡','id004',4,to_date('19/01/17','RR/MM/DD'),to_date('19/01/17','RR/MM/DD'),'����');
Insert into DEV30ID.D_SSG_ASSESSMENT (A_CODE,A_GOODS,A_TITLE,A_TEXT,A_ID,A_SCORE,A_DATE,A_UPDATE,A_CATE) values ('12','���� ���־�� ����','�� ...','^^','id001',3,to_date('19/01/17','RR/MM/DD'),to_date('19/01/17','RR/MM/DD'),'����');
Insert into DEV30ID.D_SSG_ASSESSMENT (A_CODE,A_GOODS,A_TITLE,A_TEXT,A_ID,A_SCORE,A_DATE,A_UPDATE,A_CATE) values ('13','�Ϸ��߽��ϴ�.','����Ʈ ����¡','^^','id001',3,to_date('19/01/17','RR/MM/DD'),to_date('19/01/17','RR/MM/DD'),'����');
REM INSERTING into DEV30ID.D_SSG_GOODS
SET DEFINE OFF;
Insert into DEV30ID.D_SSG_GOODS (G_CODE,GL_NAME,G_CATE,G_NAME,G_ID,G_PRICE,G_DETAIL,G_STATE,G_DATE,G_UPDATE) values ('goods_1','����','����','������ü','id004',3900,'���ɷ�ġ����','�ǸſϷ�',to_date('19/01/15','RR/MM/DD'),to_date('19/01/20','RR/MM/DD'));
Insert into DEV30ID.D_SSG_GOODS (G_CODE,GL_NAME,G_CATE,G_NAME,G_ID,G_PRICE,G_DETAIL,G_STATE,G_DATE,G_UPDATE) values ('goods_2','����','����(���ݷ�)','�����Ǵ��','id004',3700,'ġ��Ÿ2������','�Ǹ���',to_date('19/01/15','RR/MM/DD'),to_date('19/01/18','RR/MM/DD'));
Insert into DEV30ID.D_SSG_GOODS (G_CODE,GL_NAME,G_CATE,G_NAME,G_ID,G_PRICE,G_DETAIL,G_STATE,G_DATE,G_UPDATE) values ('goods_3','����','����(�ֹ���)','��ٵ�����������','id004',3800,'�ֹ�������','�Ǹ���',to_date('19/01/03','RR/MM/DD'),to_date('19/01/18','RR/MM/DD'));
Insert into DEV30ID.D_SSG_GOODS (G_CODE,GL_NAME,G_CATE,G_NAME,G_ID,G_PRICE,G_DETAIL,G_STATE,G_DATE,G_UPDATE) values ('goods_4','����','����(���ݷ�,ü�����)','�����ѿ��ǰ�','id005',3500,'ü�����','�ǸſϷ�',to_date('19/01/14','RR/MM/DD'),to_date('19/01/20','RR/MM/DD'));
Insert into DEV30ID.D_SSG_GOODS (G_CODE,GL_NAME,G_CATE,G_NAME,G_ID,G_PRICE,G_DETAIL,G_STATE,G_DATE,G_UPDATE) values ('goods_5','����','����(���ݷ�,ü�����)','�����ǹ���','id005',3750,'ü�����','�Ǹ���',to_date('19/01/15','RR/MM/DD'),to_date('19/01/20','RR/MM/DD'));
Insert into DEV30ID.D_SSG_GOODS (G_CODE,GL_NAME,G_CATE,G_NAME,G_ID,G_PRICE,G_DETAIL,G_STATE,G_DATE,G_UPDATE) values ('goods_6','���','����(���ݷ�,���)','ĥ���Ǿ糯����','id006',3750,'�������','�Ǹ���',to_date('19/01/04','RR/MM/DD'),to_date('19/01/15','RR/MM/DD'));
Insert into DEV30ID.D_SSG_GOODS (G_CODE,GL_NAME,G_CATE,G_NAME,G_ID,G_PRICE,G_DETAIL,G_STATE,G_DATE,G_UPDATE) values ('goods_7','���','ü��ȸ��(����)','ü������','id006',50,'ü��ȸ��','�Ǹ���',to_date('19/01/15','RR/MM/DD'),to_date('19/01/20','RR/MM/DD'));
Insert into DEV30ID.D_SSG_GOODS (G_CODE,GL_NAME,G_CATE,G_NAME,G_ID,G_PRICE,G_DETAIL,G_STATE,G_DATE,G_UPDATE) values ('goods_8','����','�Ź�(���ݼӵ�)','�������ǽŹ�','id007',1700,'���ݼӵ�����','�ǸſϷ�',to_date('19/01/08','RR/MM/DD'),to_date('19/01/20','RR/MM/DD'));
Insert into DEV30ID.D_SSG_GOODS (G_CODE,GL_NAME,G_CATE,G_NAME,G_ID,G_PRICE,G_DETAIL,G_STATE,G_DATE,G_UPDATE) values ('goods_9','����','�Ź�(��������)','�����ǽŹ�','id007',1700,'��������','�Ǹ���',to_date('19/01/01','RR/MM/DD'),to_date('19/01/15','RR/MM/DD'));
Insert into DEV30ID.D_SSG_GOODS (G_CODE,GL_NAME,G_CATE,G_NAME,G_ID,G_PRICE,G_DETAIL,G_STATE,G_DATE,G_UPDATE) values ('goods_10','���','����(����)','õ����','id008',300,'��������','�ǸſϷ�',to_date('19/01/03','RR/MM/DD'),to_date('19/01/20','RR/MM/DD'));
Insert into DEV30ID.D_SSG_GOODS (G_CODE,GL_NAME,G_CATE,G_NAME,G_ID,G_PRICE,G_DETAIL,G_STATE,G_DATE,G_UPDATE) values ('goods_11','���','����(��������)','���ð���','id008',2200,'��������','�Ǹ���',to_date('19/01/02','RR/MM/DD'),to_date('19/01/15','RR/MM/DD'));
Insert into DEV30ID.D_SSG_GOODS (G_CODE,GL_NAME,G_CATE,G_NAME,G_ID,G_PRICE,G_DETAIL,G_STATE,G_DATE,G_UPDATE) values ('goods_12','����','����(ü������)','����װ���','id009',3000,'ü�´�������','�Ǹ���',to_date('19/01/04','RR/MM/DD'),to_date('19/01/15','RR/MM/DD'));
Insert into DEV30ID.D_SSG_GOODS (G_CODE,GL_NAME,G_CATE,G_NAME,G_ID,G_PRICE,G_DETAIL,G_STATE,G_DATE,G_UPDATE) values ('goods_13','����','����(���ݼӵ�)','����ƽ�ܰ�','id004',2600,'ġ��Ÿ����','�Ǹ���',to_date('19/01/07','RR/MM/DD'),to_date('19/01/15','RR/MM/DD'));
Insert into DEV30ID.D_SSG_GOODS (G_CODE,GL_NAME,G_CATE,G_NAME,G_ID,G_PRICE,G_DETAIL,G_STATE,G_DATE,G_UPDATE) values ('goods_14','����','����(�ֹ���)','�絧�Ǹ޾Ƹ�','id004',3100,'�ֹ�������','�Ǹ���',to_date('19/01/02','RR/MM/DD'),to_date('19/01/15','RR/MM/DD'));
Insert into DEV30ID.D_SSG_GOODS (G_CODE,GL_NAME,G_CATE,G_NAME,G_ID,G_PRICE,G_DETAIL,G_STATE,G_DATE,G_UPDATE) values ('goods_15','����','����(����)','�����Ǹ𷹽ð�','id004',3150,'�ֹ�������','�Ǹ���',to_date('19/01/15','RR/MM/DD'),to_date('19/01/15','RR/MM/DD'));
Insert into DEV30ID.D_SSG_GOODS (G_CODE,GL_NAME,G_CATE,G_NAME,G_ID,G_PRICE,G_DETAIL,G_STATE,G_DATE,G_UPDATE) values ('goods_16','����','����(���ݷ�)','�ռҵ�','id005',350,'���ݷ�����','�Ǹ���',to_date('19/01/03','RR/MM/DD'),to_date('19/01/15','RR/MM/DD'));
Insert into DEV30ID.D_SSG_GOODS (G_CODE,GL_NAME,G_CATE,G_NAME,G_ID,G_PRICE,G_DETAIL,G_STATE,G_DATE,G_UPDATE) values ('goods_17','����','����(ü�����)','�ǹٶ��','id005',3200,'ü�����','�Ǹ���',to_date('19/01/15','RR/MM/DD'),to_date('19/01/15','RR/MM/DD'));
Insert into DEV30ID.D_SSG_GOODS (G_CODE,GL_NAME,G_CATE,G_NAME,G_ID,G_PRICE,G_DETAIL,G_STATE,G_DATE,G_UPDATE) values ('goods_18','���','�Ź�(�̵��ӵ�)','�ż�����ȭ','id005',1700,'�̵��ӵ�����','�Ǹ���',to_date('19/01/16','RR/MM/DD'),to_date('19/01/16','RR/MM/DD'));
Insert into DEV30ID.D_SSG_GOODS (G_CODE,GL_NAME,G_CATE,G_NAME,G_ID,G_PRICE,G_DETAIL,G_STATE,G_DATE,G_UPDATE) values ('goods_19','���','�Ź�(�̵��ӵ�)','�⵿������ȭ','id006',1700,'�̵��ӵ�����','�Ǹ���',to_date('19/01/16','RR/MM/DD'),to_date('19/01/16','RR/MM/DD'));
Insert into DEV30ID.D_SSG_GOODS (G_CODE,GL_NAME,G_CATE,G_NAME,G_ID,G_PRICE,G_DETAIL,G_STATE,G_DATE,G_UPDATE) values ('goods_20','���','�Ź�(�������׷�)','�츣�޽��ǹ߰���','id006',1800,'�������׷�����','�Ǹ���',to_date('19/01/07','RR/MM/DD'),to_date('19/01/16','RR/MM/DD'));
Insert into DEV30ID.D_SSG_GOODS (G_CODE,GL_NAME,G_CATE,G_NAME,G_ID,G_PRICE,G_DETAIL,G_STATE,G_DATE,G_UPDATE) values ('goods_21','���','��ű�(������)','�����ȭ','id006',350,'��ȹ�淮����','�Ǹ���',to_date('19/01/07','RR/MM/DD'),to_date('19/01/16','RR/MM/DD'));
Insert into DEV30ID.D_SSG_GOODS (G_CODE,GL_NAME,G_CATE,G_NAME,G_ID,G_PRICE,G_DETAIL,G_STATE,G_DATE,G_UPDATE) values ('goods_22','���','��ű�(�ֹ���)','�ֹ����ϰ�','id006',350,'�ֹ�������','�ǸſϷ�',to_date('19/01/16','RR/MM/DD'),to_date('19/01/20','RR/MM/DD'));
Insert into DEV30ID.D_SSG_GOODS (G_CODE,GL_NAME,G_CATE,G_NAME,G_ID,G_PRICE,G_DETAIL,G_STATE,G_DATE,G_UPDATE) values ('goods_23','���','��ű�(ü��)','�����������','id007',350,'��������','�Ǹ���',to_date('19/01/16','RR/MM/DD'),to_date('19/01/16','RR/MM/DD'));
Insert into DEV30ID.D_SSG_GOODS (G_CODE,GL_NAME,G_CATE,G_NAME,G_ID,G_PRICE,G_DETAIL,G_STATE,G_DATE,G_UPDATE) values ('goods_24','����ũ','��ű�(�ֹ���)','��ȣ��������','id007',2200,'�ֹ�������','�ǸſϷ�',to_date('19/01/08','RR/MM/DD'),to_date('19/01/20','RR/MM/DD'));
Insert into DEV30ID.D_SSG_GOODS (G_CODE,GL_NAME,G_CATE,G_NAME,G_ID,G_PRICE,G_DETAIL,G_STATE,G_DATE,G_UPDATE) values ('goods_25','����ũ','��ű�(������)','��õ�Ǵ�','id007',1900,'�ʴ絷����','�Ǹ���',to_date('19/01/16','RR/MM/DD'),to_date('19/01/16','RR/MM/DD'));
Insert into DEV30ID.D_SSG_GOODS (G_CODE,GL_NAME,G_CATE,G_NAME,G_ID,G_PRICE,G_DETAIL,G_STATE,G_DATE,G_UPDATE) values ('goods_26','����ũ','����(���÷���)','���ָ������','id007',3000,'���÷���������','�Ǹ���',to_date('19/01/16','RR/MM/DD'),to_date('19/01/16','RR/MM/DD'));
Insert into DEV30ID.D_SSG_GOODS (G_CODE,GL_NAME,G_CATE,G_NAME,G_ID,G_PRICE,G_DETAIL,G_STATE,G_DATE,G_UPDATE) values ('goods_27','����ũ','����(��Ȱ)','��ȣõ��','id008',2700,'1ȸ��Ȱ����','�Ǹ���',to_date('19/01/09','RR/MM/DD'),to_date('19/01/16','RR/MM/DD'));
Insert into DEV30ID.D_SSG_GOODS (G_CODE,GL_NAME,G_CATE,G_NAME,G_ID,G_PRICE,G_DETAIL,G_STATE,G_DATE,G_UPDATE) values ('goods_28','����','����(���ݷ�)','B.F���','id008',1350,'���ݷ�����','�Ǹ���',to_date('19/01/16','RR/MM/DD'),to_date('19/01/16','RR/MM/DD'));
Insert into DEV30ID.D_SSG_GOODS (G_CODE,GL_NAME,G_CATE,G_NAME,G_ID,G_PRICE,G_DETAIL,G_STATE,G_DATE,G_UPDATE) values ('goods_29','���','����(���ݷ�)','������Ż��','id008',3100,'���ݷ�����','�Ǹ���',to_date('19/01/16','RR/MM/DD'),to_date('19/01/16','RR/MM/DD'));
Insert into DEV30ID.D_SSG_GOODS (G_CODE,GL_NAME,G_CATE,G_NAME,G_ID,G_PRICE,G_DETAIL,G_STATE,G_DATE,G_UPDATE) values ('goods_30','���','����(������)','���ǳ��ڶ�','id008',3100,'������','�Ǹ���',to_date('19/01/16','RR/MM/DD'),to_date('19/01/16','RR/MM/DD'));
Insert into DEV30ID.D_SSG_GOODS (G_CODE,GL_NAME,G_CATE,G_NAME,G_ID,G_PRICE,G_DETAIL,G_STATE,G_DATE,G_UPDATE) values ('goods_31','����','����(�������׷�)','�ֹ�������','id009',1700,'�������׷�����','�Ǹ���',to_date('19/01/03','RR/MM/DD'),to_date('19/01/16','RR/MM/DD'));
Insert into DEV30ID.D_SSG_GOODS (G_CODE,GL_NAME,G_CATE,G_NAME,G_ID,G_PRICE,G_DETAIL,G_STATE,G_DATE,G_UPDATE) values ('goods_33','���','����(ġ��Ÿ)','��ǳ����','id009',2900,'ġ��Ÿ����','�Ǹ���',to_date('19/01/16','RR/MM/DD'),to_date('19/01/16','RR/MM/DD'));
Insert into DEV30ID.D_SSG_GOODS (G_CODE,GL_NAME,G_CATE,G_NAME,G_ID,G_PRICE,G_DETAIL,G_STATE,G_DATE,G_UPDATE) values ('goods_34','����ũ','��(����)','����������','id009',2800,'��������','�Ǹ���',to_date('19/01/16','RR/MM/DD'),to_date('19/01/16','RR/MM/DD'));
Insert into DEV30ID.D_SSG_GOODS (G_CODE,GL_NAME,G_CATE,G_NAME,G_ID,G_PRICE,G_DETAIL,G_STATE,G_DATE,G_UPDATE) values ('goods_32','����','����(���ݼӵ�)','�����','id010',1100,'���ݼӵ�����','�Ǹ���',to_date('19/01/04','RR/MM/DD'),to_date('19/01/16','RR/MM/DD'));
Insert into DEV30ID.D_SSG_GOODS (G_CODE,GL_NAME,G_CATE,G_NAME,G_ID,G_PRICE,G_DETAIL,G_STATE,G_DATE,G_UPDATE) values ('goods_35','����ũ','��(����)','�����ϵ�����','id010',2500,'��������','�Ǹ���',to_date('19/01/16','RR/MM/DD'),to_date('19/01/16','RR/MM/DD'));
Insert into DEV30ID.D_SSG_GOODS (G_CODE,GL_NAME,G_CATE,G_NAME,G_ID,G_PRICE,G_DETAIL,G_STATE,G_DATE,G_UPDATE) values ('goods_36','���','��(�̼�����)','�����ѿ���','id010',3000,'�̵��ӵ�����','�Ǹ���',to_date('19/01/16','RR/MM/DD'),to_date('19/01/16','RR/MM/DD'));
Insert into DEV30ID.D_SSG_GOODS (G_CODE,GL_NAME,G_CATE,G_NAME,G_ID,G_PRICE,G_DETAIL,G_STATE,G_DATE,G_UPDATE) values ('goods_37','����','��(ġ��Ÿ����)','�������ǿ���','id010',3200,'ġ��Ÿ����','�Ǹ���',to_date('19/01/08','RR/MM/DD'),to_date('19/01/16','RR/MM/DD'));
Insert into DEV30ID.D_SSG_GOODS (G_CODE,GL_NAME,G_CATE,G_NAME,G_ID,G_PRICE,G_DETAIL,G_STATE,G_DATE,G_UPDATE) values ('goods_38','���','��(��ȯ)','���������','id011',2900,'�����Ǽ�ȯ','�Ǹ���',to_date('19/01/16','RR/MM/DD'),to_date('19/01/16','RR/MM/DD'));
Insert into DEV30ID.D_SSG_GOODS (G_CODE,GL_NAME,G_CATE,G_NAME,G_ID,G_PRICE,G_DETAIL,G_STATE,G_DATE,G_UPDATE) values ('goods_39','����','��(�������׷�)','�����ǵΰ�','id011',1700,'�������׷�','�Ǹ���',to_date('19/01/08','RR/MM/DD'),to_date('19/01/17','RR/MM/DD'));
Insert into DEV30ID.D_SSG_GOODS (G_CODE,GL_NAME,G_CATE,G_NAME,G_ID,G_PRICE,G_DETAIL,G_STATE,G_DATE,G_UPDATE) values ('goods_40','����','��(�������׷�)','����������','id011',2800,'�������׷�����','�Ǹ���',to_date('19/01/16','RR/MM/DD'),to_date('19/01/16','RR/MM/DD'));
Insert into DEV30ID.D_SSG_GOODS (G_CODE,GL_NAME,G_CATE,G_NAME,G_ID,G_PRICE,G_DETAIL,G_STATE,G_DATE,G_UPDATE) values ('goods_41','����ũ','�Ҹ�ǰ','ü������','id011',500,'ü�� ����','�Ǹ���',to_date('19/01/18','RR/MM/DD'),to_date('19/01/18','RR/MM/DD'));
REM INSERTING into DEV30ID.D_SSG_GOODS_LEVEL
SET DEFINE OFF;
Insert into DEV30ID.D_SSG_GOODS_LEVEL (G_GRADE,GL_NAME,GL_PRICE,GL_ID,GL_DATE) values ('g_grade_1','����',400,'id001',to_date('19/01/16','RR/MM/DD'));
Insert into DEV30ID.D_SSG_GOODS_LEVEL (G_GRADE,GL_NAME,GL_PRICE,GL_ID,GL_DATE) values ('g_grade_2','���',300,'id001',to_date('19/01/15','RR/MM/DD'));
Insert into DEV30ID.D_SSG_GOODS_LEVEL (G_GRADE,GL_NAME,GL_PRICE,GL_ID,GL_DATE) values ('g_grade_3','����ũ',200,'id001',to_date('19/01/15','RR/MM/DD'));
Insert into DEV30ID.D_SSG_GOODS_LEVEL (G_GRADE,GL_NAME,GL_PRICE,GL_ID,GL_DATE) values ('g_grade_4','����',100,'id001',to_date('19/01/15','RR/MM/DD'));
Insert into DEV30ID.D_SSG_GOODS_LEVEL (G_GRADE,GL_NAME,GL_PRICE,GL_ID,GL_DATE) values ('g_grade_5','���',0,'id001',to_date('19/01/15','RR/MM/DD'));
REM INSERTING into DEV30ID.D_SSG_MEMBER
SET DEFINE OFF;
Insert into DEV30ID.D_SSG_MEMBER (M_CODE,B_NAME,GL_NAME,M_ID,M_PW,M_LEVEL,M_NAME,M_GOLD,M_POINT,M_COUNT,M_IN,M_DATE) values ('mem_1','�����','����','id001','pw001','������','����',17400,30700,0,to_date('19/01/02','RR/MM/DD'),to_date('19/01/20','RR/MM/DD'));
Insert into DEV30ID.D_SSG_MEMBER (M_CODE,B_NAME,GL_NAME,M_ID,M_PW,M_LEVEL,M_NAME,M_GOLD,M_POINT,M_COUNT,M_IN,M_DATE) values ('mem_2','�����','���','id002','pw002','������','����',21700,2050,0,to_date('19/01/03','RR/MM/DD'),to_date('19/01/16','RR/MM/DD'));
Insert into DEV30ID.D_SSG_MEMBER (M_CODE,B_NAME,GL_NAME,M_ID,M_PW,M_LEVEL,M_NAME,M_GOLD,M_POINT,M_COUNT,M_IN,M_DATE) values ('mem_7','�����','����ũ','id007','pw007','������','������',32200,1500,0,to_date('19/01/17','RR/MM/DD'),to_date('19/01/17','RR/MM/DD'));
Insert into DEV30ID.D_SSG_MEMBER (M_CODE,B_NAME,GL_NAME,M_ID,M_PW,M_LEVEL,M_NAME,M_GOLD,M_POINT,M_COUNT,M_IN,M_DATE) values ('mem_4','�ǹ�','����ũ','id004','pw004','ȸ��','���̸�',68000,5030,14,to_date('19/01/07','RR/MM/DD'),to_date('19/01/17','RR/MM/DD'));
Insert into DEV30ID.D_SSG_MEMBER (M_CODE,B_NAME,GL_NAME,M_ID,M_PW,M_LEVEL,M_NAME,M_GOLD,M_POINT,M_COUNT,M_IN,M_DATE) values ('mem_5','�ǹ�','����','id005','pw005','ȸ��','����',19285,2030,20,to_date('19/01/09','RR/MM/DD'),to_date('19/01/07','RR/MM/DD'));
Insert into DEV30ID.D_SSG_MEMBER (M_CODE,B_NAME,GL_NAME,M_ID,M_PW,M_LEVEL,M_NAME,M_GOLD,M_POINT,M_COUNT,M_IN,M_DATE) values ('mem_6','���̾�','���','id006','pw006','ȸ��','���',10350,5000,85,to_date('19/01/09','RR/MM/DD'),to_date('19/01/11','RR/MM/DD'));
Insert into DEV30ID.D_SSG_MEMBER (M_CODE,B_NAME,GL_NAME,M_ID,M_PW,M_LEVEL,M_NAME,M_GOLD,M_POINT,M_COUNT,M_IN,M_DATE) values ('mem_3','�÷�Ƽ��','����ũ','id003','pw003','ȸ��','����',12610,1000,43,to_date('19/01/05','RR/MM/DD'),to_date('19/01/17','RR/MM/DD'));
Insert into DEV30ID.D_SSG_MEMBER (M_CODE,B_NAME,GL_NAME,M_ID,M_PW,M_LEVEL,M_NAME,M_GOLD,M_POINT,M_COUNT,M_IN,M_DATE) values ('mem_8','���','���','id008','pw008','ȸ��','RM',10020,3500,22,to_date('19/01/02','RR/MM/DD'),to_date('19/01/17','RR/MM/DD'));
Insert into DEV30ID.D_SSG_MEMBER (M_CODE,B_NAME,GL_NAME,M_ID,M_PW,M_LEVEL,M_NAME,M_GOLD,M_POINT,M_COUNT,M_IN,M_DATE) values ('mem_9','�÷�Ƽ��','����','id009','pw009','ȸ��','����',12990,2500,45,to_date('19/01/05','RR/MM/DD'),to_date('19/01/17','RR/MM/DD'));
Insert into DEV30ID.D_SSG_MEMBER (M_CODE,B_NAME,GL_NAME,M_ID,M_PW,M_LEVEL,M_NAME,M_GOLD,M_POINT,M_COUNT,M_IN,M_DATE) values ('mem_10','�ǹ�','����','id010','pw010','ȸ��','����',2700,5510,15,to_date('19/01/02','RR/MM/DD'),to_date('19/01/17','RR/MM/DD'));
Insert into DEV30ID.D_SSG_MEMBER (M_CODE,B_NAME,GL_NAME,M_ID,M_PW,M_LEVEL,M_NAME,M_GOLD,M_POINT,M_COUNT,M_IN,M_DATE) values ('mem_11','���','���','id011','pw011','ȸ��','����',5000,2600,20,to_date('19/01/05','RR/MM/DD'),to_date('19/01/17','RR/MM/DD'));
REM INSERTING into DEV30ID.D_SSG_MEMBER_LEVEL
SET DEFINE OFF;
Insert into DEV30ID.D_SSG_MEMBER_LEVEL (B_GRADE,B_NAME,B_COUNT,B_PER,B_ID,B_DATE) values ('b_grade_1','���̾�',80,25,'id001',to_date('19/01/15','RR/MM/DD'));
Insert into DEV30ID.D_SSG_MEMBER_LEVEL (B_GRADE,B_NAME,B_COUNT,B_PER,B_ID,B_DATE) values ('b_grade_2','�÷�Ƽ��',40,20,'id001',to_date('19/01/15','RR/MM/DD'));
Insert into DEV30ID.D_SSG_MEMBER_LEVEL (B_GRADE,B_NAME,B_COUNT,B_PER,B_ID,B_DATE) values ('b_grade_3','���',20,15,'id001',to_date('19/01/15','RR/MM/DD'));
Insert into DEV30ID.D_SSG_MEMBER_LEVEL (B_GRADE,B_NAME,B_COUNT,B_PER,B_ID,B_DATE) values ('b_grade_4','�ǹ�',10,10,'id001',to_date('19/01/15','RR/MM/DD'));
Insert into DEV30ID.D_SSG_MEMBER_LEVEL (B_GRADE,B_NAME,B_COUNT,B_PER,B_ID,B_DATE) values ('b_grade_5','�����',5,5,'id001',to_date('19/01/16','RR/MM/DD'));
REM INSERTING into DEV30ID.D_SSG_ORDER
SET DEFINE OFF;
Insert into DEV30ID.D_SSG_ORDER (O_CODE,G_CODE,M_ID,G_STATE,O_TOTAL,O_DATE,G_NAME) values ('o_code','goods_8','id004','������',1620,to_date('19/01/20','RR/MM/DD'),'�������ǽŹ�');
Insert into DEV30ID.D_SSG_ORDER (O_CODE,G_CODE,M_ID,G_STATE,O_TOTAL,O_DATE,G_NAME) values ('o_code','goods_1','id004','������',3870,to_date('19/01/20','RR/MM/DD'),'������ü');
Insert into DEV30ID.D_SSG_ORDER (O_CODE,G_CODE,M_ID,G_STATE,O_TOTAL,O_DATE,G_NAME) values ('o_code','goods_4','id004','������',3510,to_date('19/01/20','RR/MM/DD'),'�����ѿ��ǰ�');
Insert into DEV30ID.D_SSG_ORDER (O_CODE,G_CODE,M_ID,G_STATE,O_TOTAL,O_DATE,G_NAME) values ('o_code','goods_10','id005','������',270,to_date('19/01/20','RR/MM/DD'),'õ����');
Insert into DEV30ID.D_SSG_ORDER (O_CODE,G_CODE,M_ID,G_STATE,O_TOTAL,O_DATE,G_NAME) values ('o_code','goods_24','id005','������',2340,to_date('19/01/20','RR/MM/DD'),'��ȣ��������');
Insert into DEV30ID.D_SSG_ORDER (O_CODE,G_CODE,M_ID,G_STATE,O_TOTAL,O_DATE,G_NAME) values ('o_code','goods_22','id005','������',675,to_date('19/01/20','RR/MM/DD'),'�ֹ����ϰ�');
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
