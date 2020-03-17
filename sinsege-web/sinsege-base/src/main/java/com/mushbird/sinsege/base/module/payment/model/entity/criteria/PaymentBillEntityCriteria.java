package com.mushbird.sinsege.base.module.payment.model.entity.criteria;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PaymentBillEntityCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    public PaymentBillEntityCriteria() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public Integer getOffset() {
        return offset;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andPayBillIdIsNull() {
            addCriterion("TPAYB.PAY_BILL_ID is null");
            return (Criteria) this;
        }

        public Criteria andPayBillIdIsNotNull() {
            addCriterion("TPAYB.PAY_BILL_ID is not null");
            return (Criteria) this;
        }

        public Criteria andPayBillIdEqualTo(Integer value) {
            addCriterion("TPAYB.PAY_BILL_ID =", value, "payBillId");
            return (Criteria) this;
        }

        public Criteria andPayBillIdNotEqualTo(Integer value) {
            addCriterion("TPAYB.PAY_BILL_ID <>", value, "payBillId");
            return (Criteria) this;
        }

        public Criteria andPayBillIdGreaterThan(Integer value) {
            addCriterion("TPAYB.PAY_BILL_ID >", value, "payBillId");
            return (Criteria) this;
        }

        public Criteria andPayBillIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("TPAYB.PAY_BILL_ID >=", value, "payBillId");
            return (Criteria) this;
        }

        public Criteria andPayBillIdLessThan(Integer value) {
            addCriterion("TPAYB.PAY_BILL_ID <", value, "payBillId");
            return (Criteria) this;
        }

        public Criteria andPayBillIdLessThanOrEqualTo(Integer value) {
            addCriterion("TPAYB.PAY_BILL_ID <=", value, "payBillId");
            return (Criteria) this;
        }

        public Criteria andPayBillIdIn(List<Integer> values) {
            addCriterion("TPAYB.PAY_BILL_ID in", values, "payBillId");
            return (Criteria) this;
        }

        public Criteria andPayBillIdNotIn(List<Integer> values) {
            addCriterion("TPAYB.PAY_BILL_ID not in", values, "payBillId");
            return (Criteria) this;
        }

        public Criteria andPayBillIdBetween(Integer value1, Integer value2) {
            addCriterion("TPAYB.PAY_BILL_ID between", value1, value2, "payBillId");
            return (Criteria) this;
        }

        public Criteria andPayBillIdNotBetween(Integer value1, Integer value2) {
            addCriterion("TPAYB.PAY_BILL_ID not between", value1, value2, "payBillId");
            return (Criteria) this;
        }

        public Criteria andMbrIdIsNull() {
            addCriterion("TPAYB.MBR_ID is null");
            return (Criteria) this;
        }

        public Criteria andMbrIdIsNotNull() {
            addCriterion("TPAYB.MBR_ID is not null");
            return (Criteria) this;
        }

        public Criteria andMbrIdEqualTo(String value) {
            addCriterion("TPAYB.MBR_ID =", value, "mbrId");
            return (Criteria) this;
        }

        public Criteria andMbrIdNotEqualTo(String value) {
            addCriterion("TPAYB.MBR_ID <>", value, "mbrId");
            return (Criteria) this;
        }

        public Criteria andMbrIdGreaterThan(String value) {
            addCriterion("TPAYB.MBR_ID >", value, "mbrId");
            return (Criteria) this;
        }

        public Criteria andMbrIdGreaterThanOrEqualTo(String value) {
            addCriterion("TPAYB.MBR_ID >=", value, "mbrId");
            return (Criteria) this;
        }

        public Criteria andMbrIdLessThan(String value) {
            addCriterion("TPAYB.MBR_ID <", value, "mbrId");
            return (Criteria) this;
        }

        public Criteria andMbrIdLessThanOrEqualTo(String value) {
            addCriterion("TPAYB.MBR_ID <=", value, "mbrId");
            return (Criteria) this;
        }

        public Criteria andMbrIdLike(String value) {
            addCriterion("TPAYB.MBR_ID like", value, "mbrId");
            return (Criteria) this;
        }

        public Criteria andMbrIdNotLike(String value) {
            addCriterion("TPAYB.MBR_ID not like", value, "mbrId");
            return (Criteria) this;
        }

        public Criteria andMbrIdIn(List<String> values) {
            addCriterion("TPAYB.MBR_ID in", values, "mbrId");
            return (Criteria) this;
        }

        public Criteria andMbrIdNotIn(List<String> values) {
            addCriterion("TPAYB.MBR_ID not in", values, "mbrId");
            return (Criteria) this;
        }

        public Criteria andMbrIdBetween(String value1, String value2) {
            addCriterion("TPAYB.MBR_ID between", value1, value2, "mbrId");
            return (Criteria) this;
        }

        public Criteria andMbrIdNotBetween(String value1, String value2) {
            addCriterion("TPAYB.MBR_ID not between", value1, value2, "mbrId");
            return (Criteria) this;
        }

        public Criteria andBillkeyIsNull() {
            addCriterion("TPAYB.BILLKEY is null");
            return (Criteria) this;
        }

        public Criteria andBillkeyIsNotNull() {
            addCriterion("TPAYB.BILLKEY is not null");
            return (Criteria) this;
        }

        public Criteria andBillkeyEqualTo(String value) {
            addCriterion("TPAYB.BILLKEY =", value, "billkey");
            return (Criteria) this;
        }

        public Criteria andBillkeyNotEqualTo(String value) {
            addCriterion("TPAYB.BILLKEY <>", value, "billkey");
            return (Criteria) this;
        }

        public Criteria andBillkeyGreaterThan(String value) {
            addCriterion("TPAYB.BILLKEY >", value, "billkey");
            return (Criteria) this;
        }

        public Criteria andBillkeyGreaterThanOrEqualTo(String value) {
            addCriterion("TPAYB.BILLKEY >=", value, "billkey");
            return (Criteria) this;
        }

        public Criteria andBillkeyLessThan(String value) {
            addCriterion("TPAYB.BILLKEY <", value, "billkey");
            return (Criteria) this;
        }

        public Criteria andBillkeyLessThanOrEqualTo(String value) {
            addCriterion("TPAYB.BILLKEY <=", value, "billkey");
            return (Criteria) this;
        }

        public Criteria andBillkeyLike(String value) {
            addCriterion("TPAYB.BILLKEY like", value, "billkey");
            return (Criteria) this;
        }

        public Criteria andBillkeyNotLike(String value) {
            addCriterion("TPAYB.BILLKEY not like", value, "billkey");
            return (Criteria) this;
        }

        public Criteria andBillkeyIn(List<String> values) {
            addCriterion("TPAYB.BILLKEY in", values, "billkey");
            return (Criteria) this;
        }

        public Criteria andBillkeyNotIn(List<String> values) {
            addCriterion("TPAYB.BILLKEY not in", values, "billkey");
            return (Criteria) this;
        }

        public Criteria andBillkeyBetween(String value1, String value2) {
            addCriterion("TPAYB.BILLKEY between", value1, value2, "billkey");
            return (Criteria) this;
        }

        public Criteria andBillkeyNotBetween(String value1, String value2) {
            addCriterion("TPAYB.BILLKEY not between", value1, value2, "billkey");
            return (Criteria) this;
        }

        public Criteria andCcrdHglNmIsNull() {
            addCriterion("TPAYB.CCRD_HGL_NM is null");
            return (Criteria) this;
        }

        public Criteria andCcrdHglNmIsNotNull() {
            addCriterion("TPAYB.CCRD_HGL_NM is not null");
            return (Criteria) this;
        }

        public Criteria andCcrdHglNmEqualTo(String value) {
            addCriterion("TPAYB.CCRD_HGL_NM =", value, "ccrdHglNm");
            return (Criteria) this;
        }

        public Criteria andCcrdHglNmNotEqualTo(String value) {
            addCriterion("TPAYB.CCRD_HGL_NM <>", value, "ccrdHglNm");
            return (Criteria) this;
        }

        public Criteria andCcrdHglNmGreaterThan(String value) {
            addCriterion("TPAYB.CCRD_HGL_NM >", value, "ccrdHglNm");
            return (Criteria) this;
        }

        public Criteria andCcrdHglNmGreaterThanOrEqualTo(String value) {
            addCriterion("TPAYB.CCRD_HGL_NM >=", value, "ccrdHglNm");
            return (Criteria) this;
        }

        public Criteria andCcrdHglNmLessThan(String value) {
            addCriterion("TPAYB.CCRD_HGL_NM <", value, "ccrdHglNm");
            return (Criteria) this;
        }

        public Criteria andCcrdHglNmLessThanOrEqualTo(String value) {
            addCriterion("TPAYB.CCRD_HGL_NM <=", value, "ccrdHglNm");
            return (Criteria) this;
        }

        public Criteria andCcrdHglNmLike(String value) {
            addCriterion("TPAYB.CCRD_HGL_NM like", value, "ccrdHglNm");
            return (Criteria) this;
        }

        public Criteria andCcrdHglNmNotLike(String value) {
            addCriterion("TPAYB.CCRD_HGL_NM not like", value, "ccrdHglNm");
            return (Criteria) this;
        }

        public Criteria andCcrdHglNmIn(List<String> values) {
            addCriterion("TPAYB.CCRD_HGL_NM in", values, "ccrdHglNm");
            return (Criteria) this;
        }

        public Criteria andCcrdHglNmNotIn(List<String> values) {
            addCriterion("TPAYB.CCRD_HGL_NM not in", values, "ccrdHglNm");
            return (Criteria) this;
        }

        public Criteria andCcrdHglNmBetween(String value1, String value2) {
            addCriterion("TPAYB.CCRD_HGL_NM between", value1, value2, "ccrdHglNm");
            return (Criteria) this;
        }

        public Criteria andCcrdHglNmNotBetween(String value1, String value2) {
            addCriterion("TPAYB.CCRD_HGL_NM not between", value1, value2, "ccrdHglNm");
            return (Criteria) this;
        }

        public Criteria andChkCardYnValIsNull() {
            addCriterion("TPAYB.CHK_CARD_YN_VAL is null");
            return (Criteria) this;
        }

        public Criteria andChkCardYnValIsNotNull() {
            addCriterion("TPAYB.CHK_CARD_YN_VAL is not null");
            return (Criteria) this;
        }

        public Criteria andChkCardYnValEqualTo(String value) {
            addCriterion("TPAYB.CHK_CARD_YN_VAL =", value, "chkCardYnVal");
            return (Criteria) this;
        }

        public Criteria andChkCardYnValNotEqualTo(String value) {
            addCriterion("TPAYB.CHK_CARD_YN_VAL <>", value, "chkCardYnVal");
            return (Criteria) this;
        }

        public Criteria andChkCardYnValGreaterThan(String value) {
            addCriterion("TPAYB.CHK_CARD_YN_VAL >", value, "chkCardYnVal");
            return (Criteria) this;
        }

        public Criteria andChkCardYnValGreaterThanOrEqualTo(String value) {
            addCriterion("TPAYB.CHK_CARD_YN_VAL >=", value, "chkCardYnVal");
            return (Criteria) this;
        }

        public Criteria andChkCardYnValLessThan(String value) {
            addCriterion("TPAYB.CHK_CARD_YN_VAL <", value, "chkCardYnVal");
            return (Criteria) this;
        }

        public Criteria andChkCardYnValLessThanOrEqualTo(String value) {
            addCriterion("TPAYB.CHK_CARD_YN_VAL <=", value, "chkCardYnVal");
            return (Criteria) this;
        }

        public Criteria andChkCardYnValLike(String value) {
            addCriterion("TPAYB.CHK_CARD_YN_VAL like", value, "chkCardYnVal");
            return (Criteria) this;
        }

        public Criteria andChkCardYnValNotLike(String value) {
            addCriterion("TPAYB.CHK_CARD_YN_VAL not like", value, "chkCardYnVal");
            return (Criteria) this;
        }

        public Criteria andChkCardYnValIn(List<String> values) {
            addCriterion("TPAYB.CHK_CARD_YN_VAL in", values, "chkCardYnVal");
            return (Criteria) this;
        }

        public Criteria andChkCardYnValNotIn(List<String> values) {
            addCriterion("TPAYB.CHK_CARD_YN_VAL not in", values, "chkCardYnVal");
            return (Criteria) this;
        }

        public Criteria andChkCardYnValBetween(String value1, String value2) {
            addCriterion("TPAYB.CHK_CARD_YN_VAL between", value1, value2, "chkCardYnVal");
            return (Criteria) this;
        }

        public Criteria andChkCardYnValNotBetween(String value1, String value2) {
            addCriterion("TPAYB.CHK_CARD_YN_VAL not between", value1, value2, "chkCardYnVal");
            return (Criteria) this;
        }

        public Criteria andRawDataContIsNull() {
            addCriterion("TPAYB.RAW_DATA_CONT is null");
            return (Criteria) this;
        }

        public Criteria andRawDataContIsNotNull() {
            addCriterion("TPAYB.RAW_DATA_CONT is not null");
            return (Criteria) this;
        }

        public Criteria andRawDataContEqualTo(String value) {
            addCriterion("TPAYB.RAW_DATA_CONT =", value, "rawDataCont");
            return (Criteria) this;
        }

        public Criteria andRawDataContNotEqualTo(String value) {
            addCriterion("TPAYB.RAW_DATA_CONT <>", value, "rawDataCont");
            return (Criteria) this;
        }

        public Criteria andRawDataContGreaterThan(String value) {
            addCriterion("TPAYB.RAW_DATA_CONT >", value, "rawDataCont");
            return (Criteria) this;
        }

        public Criteria andRawDataContGreaterThanOrEqualTo(String value) {
            addCriterion("TPAYB.RAW_DATA_CONT >=", value, "rawDataCont");
            return (Criteria) this;
        }

        public Criteria andRawDataContLessThan(String value) {
            addCriterion("TPAYB.RAW_DATA_CONT <", value, "rawDataCont");
            return (Criteria) this;
        }

        public Criteria andRawDataContLessThanOrEqualTo(String value) {
            addCriterion("TPAYB.RAW_DATA_CONT <=", value, "rawDataCont");
            return (Criteria) this;
        }

        public Criteria andRawDataContLike(String value) {
            addCriterion("TPAYB.RAW_DATA_CONT like", value, "rawDataCont");
            return (Criteria) this;
        }

        public Criteria andRawDataContNotLike(String value) {
            addCriterion("TPAYB.RAW_DATA_CONT not like", value, "rawDataCont");
            return (Criteria) this;
        }

        public Criteria andRawDataContIn(List<String> values) {
            addCriterion("TPAYB.RAW_DATA_CONT in", values, "rawDataCont");
            return (Criteria) this;
        }

        public Criteria andRawDataContNotIn(List<String> values) {
            addCriterion("TPAYB.RAW_DATA_CONT not in", values, "rawDataCont");
            return (Criteria) this;
        }

        public Criteria andRawDataContBetween(String value1, String value2) {
            addCriterion("TPAYB.RAW_DATA_CONT between", value1, value2, "rawDataCont");
            return (Criteria) this;
        }

        public Criteria andRawDataContNotBetween(String value1, String value2) {
            addCriterion("TPAYB.RAW_DATA_CONT not between", value1, value2, "rawDataCont");
            return (Criteria) this;
        }

        public Criteria andRcvRawDataContIsNull() {
            addCriterion("TPAYB.RCV_RAW_DATA_CONT is null");
            return (Criteria) this;
        }

        public Criteria andRcvRawDataContIsNotNull() {
            addCriterion("TPAYB.RCV_RAW_DATA_CONT is not null");
            return (Criteria) this;
        }

        public Criteria andRcvRawDataContEqualTo(String value) {
            addCriterion("TPAYB.RCV_RAW_DATA_CONT =", value, "rcvRawDataCont");
            return (Criteria) this;
        }

        public Criteria andRcvRawDataContNotEqualTo(String value) {
            addCriterion("TPAYB.RCV_RAW_DATA_CONT <>", value, "rcvRawDataCont");
            return (Criteria) this;
        }

        public Criteria andRcvRawDataContGreaterThan(String value) {
            addCriterion("TPAYB.RCV_RAW_DATA_CONT >", value, "rcvRawDataCont");
            return (Criteria) this;
        }

        public Criteria andRcvRawDataContGreaterThanOrEqualTo(String value) {
            addCriterion("TPAYB.RCV_RAW_DATA_CONT >=", value, "rcvRawDataCont");
            return (Criteria) this;
        }

        public Criteria andRcvRawDataContLessThan(String value) {
            addCriterion("TPAYB.RCV_RAW_DATA_CONT <", value, "rcvRawDataCont");
            return (Criteria) this;
        }

        public Criteria andRcvRawDataContLessThanOrEqualTo(String value) {
            addCriterion("TPAYB.RCV_RAW_DATA_CONT <=", value, "rcvRawDataCont");
            return (Criteria) this;
        }

        public Criteria andRcvRawDataContLike(String value) {
            addCriterion("TPAYB.RCV_RAW_DATA_CONT like", value, "rcvRawDataCont");
            return (Criteria) this;
        }

        public Criteria andRcvRawDataContNotLike(String value) {
            addCriterion("TPAYB.RCV_RAW_DATA_CONT not like", value, "rcvRawDataCont");
            return (Criteria) this;
        }

        public Criteria andRcvRawDataContIn(List<String> values) {
            addCriterion("TPAYB.RCV_RAW_DATA_CONT in", values, "rcvRawDataCont");
            return (Criteria) this;
        }

        public Criteria andRcvRawDataContNotIn(List<String> values) {
            addCriterion("TPAYB.RCV_RAW_DATA_CONT not in", values, "rcvRawDataCont");
            return (Criteria) this;
        }

        public Criteria andRcvRawDataContBetween(String value1, String value2) {
            addCriterion("TPAYB.RCV_RAW_DATA_CONT between", value1, value2, "rcvRawDataCont");
            return (Criteria) this;
        }

        public Criteria andRcvRawDataContNotBetween(String value1, String value2) {
            addCriterion("TPAYB.RCV_RAW_DATA_CONT not between", value1, value2, "rcvRawDataCont");
            return (Criteria) this;
        }

        public Criteria andRegDtIsNull() {
            addCriterion("TPAYB.REG_DT is null");
            return (Criteria) this;
        }

        public Criteria andRegDtIsNotNull() {
            addCriterion("TPAYB.REG_DT is not null");
            return (Criteria) this;
        }

        public Criteria andRegDtEqualTo(Date value) {
            addCriterion("TPAYB.REG_DT =", value, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtNotEqualTo(Date value) {
            addCriterion("TPAYB.REG_DT <>", value, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtGreaterThan(Date value) {
            addCriterion("TPAYB.REG_DT >", value, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtGreaterThanOrEqualTo(Date value) {
            addCriterion("TPAYB.REG_DT >=", value, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtLessThan(Date value) {
            addCriterion("TPAYB.REG_DT <", value, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtLessThanOrEqualTo(Date value) {
            addCriterion("TPAYB.REG_DT <=", value, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtIn(List<Date> values) {
            addCriterion("TPAYB.REG_DT in", values, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtNotIn(List<Date> values) {
            addCriterion("TPAYB.REG_DT not in", values, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtBetween(Date value1, Date value2) {
            addCriterion("TPAYB.REG_DT between", value1, value2, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtNotBetween(Date value1, Date value2) {
            addCriterion("TPAYB.REG_DT not between", value1, value2, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegIdIsNull() {
            addCriterion("TPAYB.REG_ID is null");
            return (Criteria) this;
        }

        public Criteria andRegIdIsNotNull() {
            addCriterion("TPAYB.REG_ID is not null");
            return (Criteria) this;
        }

        public Criteria andRegIdEqualTo(String value) {
            addCriterion("TPAYB.REG_ID =", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdNotEqualTo(String value) {
            addCriterion("TPAYB.REG_ID <>", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdGreaterThan(String value) {
            addCriterion("TPAYB.REG_ID >", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdGreaterThanOrEqualTo(String value) {
            addCriterion("TPAYB.REG_ID >=", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdLessThan(String value) {
            addCriterion("TPAYB.REG_ID <", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdLessThanOrEqualTo(String value) {
            addCriterion("TPAYB.REG_ID <=", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdLike(String value) {
            addCriterion("TPAYB.REG_ID like", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdNotLike(String value) {
            addCriterion("TPAYB.REG_ID not like", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdIn(List<String> values) {
            addCriterion("TPAYB.REG_ID in", values, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdNotIn(List<String> values) {
            addCriterion("TPAYB.REG_ID not in", values, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdBetween(String value1, String value2) {
            addCriterion("TPAYB.REG_ID between", value1, value2, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdNotBetween(String value1, String value2) {
            addCriterion("TPAYB.REG_ID not between", value1, value2, "regId");
            return (Criteria) this;
        }

        public Criteria andMbrIdLikeInsensitive(String value) {
            addCriterion("upper(TPAYB.MBR_ID) like", value.toUpperCase(), "mbrId");
            return (Criteria) this;
        }

        public Criteria andBillkeyLikeInsensitive(String value) {
            addCriterion("upper(TPAYB.BILLKEY) like", value.toUpperCase(), "billkey");
            return (Criteria) this;
        }

        public Criteria andCcrdHglNmLikeInsensitive(String value) {
            addCriterion("upper(TPAYB.CCRD_HGL_NM) like", value.toUpperCase(), "ccrdHglNm");
            return (Criteria) this;
        }

        public Criteria andChkCardYnValLikeInsensitive(String value) {
            addCriterion("upper(TPAYB.CHK_CARD_YN_VAL) like", value.toUpperCase(), "chkCardYnVal");
            return (Criteria) this;
        }

        public Criteria andRawDataContLikeInsensitive(String value) {
            addCriterion("upper(TPAYB.RAW_DATA_CONT) like", value.toUpperCase(), "rawDataCont");
            return (Criteria) this;
        }

        public Criteria andRcvRawDataContLikeInsensitive(String value) {
            addCriterion("upper(TPAYB.RCV_RAW_DATA_CONT) like", value.toUpperCase(), "rcvRawDataCont");
            return (Criteria) this;
        }

        public Criteria andRegIdLikeInsensitive(String value) {
            addCriterion("upper(TPAYB.REG_ID) like", value.toUpperCase(), "regId");
            return (Criteria) this;
        }

        public Criteria andMbrIdLikeLeft(String value) {
            addCriterion("TPAYB.MBR_ID like ", "%" + value, "mbrId");
            return (Criteria) this;
        }

        public Criteria andMbrIdLikeRight(String value) {
            addCriterion("TPAYB.MBR_ID like ", value + "%", "mbrId");
            return (Criteria) this;
        }

        public Criteria andMbrIdLikeBoth(String value) {
            addCriterion("TPAYB.MBR_ID like ", "%" + value + "%", "mbrId");
            return (Criteria) this;
        }

        public Criteria andBillkeyLikeLeft(String value) {
            addCriterion("TPAYB.BILLKEY like ", "%" + value, "billkey");
            return (Criteria) this;
        }

        public Criteria andBillkeyLikeRight(String value) {
            addCriterion("TPAYB.BILLKEY like ", value + "%", "billkey");
            return (Criteria) this;
        }

        public Criteria andBillkeyLikeBoth(String value) {
            addCriterion("TPAYB.BILLKEY like ", "%" + value + "%", "billkey");
            return (Criteria) this;
        }

        public Criteria andCcrdHglNmLikeLeft(String value) {
            addCriterion("TPAYB.CCRD_HGL_NM like ", "%" + value, "ccrdHglNm");
            return (Criteria) this;
        }

        public Criteria andCcrdHglNmLikeRight(String value) {
            addCriterion("TPAYB.CCRD_HGL_NM like ", value + "%", "ccrdHglNm");
            return (Criteria) this;
        }

        public Criteria andCcrdHglNmLikeBoth(String value) {
            addCriterion("TPAYB.CCRD_HGL_NM like ", "%" + value + "%", "ccrdHglNm");
            return (Criteria) this;
        }

        public Criteria andChkCardYnValLikeLeft(String value) {
            addCriterion("TPAYB.CHK_CARD_YN_VAL like ", "%" + value, "chkCardYnVal");
            return (Criteria) this;
        }

        public Criteria andChkCardYnValLikeRight(String value) {
            addCriterion("TPAYB.CHK_CARD_YN_VAL like ", value + "%", "chkCardYnVal");
            return (Criteria) this;
        }

        public Criteria andChkCardYnValLikeBoth(String value) {
            addCriterion("TPAYB.CHK_CARD_YN_VAL like ", "%" + value + "%", "chkCardYnVal");
            return (Criteria) this;
        }

        public Criteria andRawDataContLikeLeft(String value) {
            addCriterion("TPAYB.RAW_DATA_CONT like ", "%" + value, "rawDataCont");
            return (Criteria) this;
        }

        public Criteria andRawDataContLikeRight(String value) {
            addCriterion("TPAYB.RAW_DATA_CONT like ", value + "%", "rawDataCont");
            return (Criteria) this;
        }

        public Criteria andRawDataContLikeBoth(String value) {
            addCriterion("TPAYB.RAW_DATA_CONT like ", "%" + value + "%", "rawDataCont");
            return (Criteria) this;
        }

        public Criteria andRcvRawDataContLikeLeft(String value) {
            addCriterion("TPAYB.RCV_RAW_DATA_CONT like ", "%" + value, "rcvRawDataCont");
            return (Criteria) this;
        }

        public Criteria andRcvRawDataContLikeRight(String value) {
            addCriterion("TPAYB.RCV_RAW_DATA_CONT like ", value + "%", "rcvRawDataCont");
            return (Criteria) this;
        }

        public Criteria andRcvRawDataContLikeBoth(String value) {
            addCriterion("TPAYB.RCV_RAW_DATA_CONT like ", "%" + value + "%", "rcvRawDataCont");
            return (Criteria) this;
        }

        public Criteria andRegIdLikeLeft(String value) {
            addCriterion("TPAYB.REG_ID like ", "%" + value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdLikeRight(String value) {
            addCriterion("TPAYB.REG_ID like ", value + "%", "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdLikeBoth(String value) {
            addCriterion("TPAYB.REG_ID like ", "%" + value + "%", "regId");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}