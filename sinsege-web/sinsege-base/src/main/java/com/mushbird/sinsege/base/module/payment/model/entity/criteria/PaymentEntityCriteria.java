package com.mushbird.sinsege.base.module.payment.model.entity.criteria;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class PaymentEntityCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    public PaymentEntityCriteria() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andPayIdIsNull() {
            addCriterion("TPAY.PAY_ID is null");
            return (Criteria) this;
        }

        public Criteria andPayIdIsNotNull() {
            addCriterion("TPAY.PAY_ID is not null");
            return (Criteria) this;
        }

        public Criteria andPayIdEqualTo(Integer value) {
            addCriterion("TPAY.PAY_ID =", value, "payId");
            return (Criteria) this;
        }

        public Criteria andPayIdNotEqualTo(Integer value) {
            addCriterion("TPAY.PAY_ID <>", value, "payId");
            return (Criteria) this;
        }

        public Criteria andPayIdGreaterThan(Integer value) {
            addCriterion("TPAY.PAY_ID >", value, "payId");
            return (Criteria) this;
        }

        public Criteria andPayIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("TPAY.PAY_ID >=", value, "payId");
            return (Criteria) this;
        }

        public Criteria andPayIdLessThan(Integer value) {
            addCriterion("TPAY.PAY_ID <", value, "payId");
            return (Criteria) this;
        }

        public Criteria andPayIdLessThanOrEqualTo(Integer value) {
            addCriterion("TPAY.PAY_ID <=", value, "payId");
            return (Criteria) this;
        }

        public Criteria andPayIdIn(List<Integer> values) {
            addCriterion("TPAY.PAY_ID in", values, "payId");
            return (Criteria) this;
        }

        public Criteria andPayIdNotIn(List<Integer> values) {
            addCriterion("TPAY.PAY_ID not in", values, "payId");
            return (Criteria) this;
        }

        public Criteria andPayIdBetween(Integer value1, Integer value2) {
            addCriterion("TPAY.PAY_ID between", value1, value2, "payId");
            return (Criteria) this;
        }

        public Criteria andPayIdNotBetween(Integer value1, Integer value2) {
            addCriterion("TPAY.PAY_ID not between", value1, value2, "payId");
            return (Criteria) this;
        }

        public Criteria andOriPayIdIsNull() {
            addCriterion("TPAY.ORI_PAY_ID is null");
            return (Criteria) this;
        }

        public Criteria andOriPayIdIsNotNull() {
            addCriterion("TPAY.ORI_PAY_ID is not null");
            return (Criteria) this;
        }

        public Criteria andOriPayIdEqualTo(Integer value) {
            addCriterion("TPAY.ORI_PAY_ID =", value, "oriPayId");
            return (Criteria) this;
        }

        public Criteria andOriPayIdNotEqualTo(Integer value) {
            addCriterion("TPAY.ORI_PAY_ID <>", value, "oriPayId");
            return (Criteria) this;
        }

        public Criteria andOriPayIdGreaterThan(Integer value) {
            addCriterion("TPAY.ORI_PAY_ID >", value, "oriPayId");
            return (Criteria) this;
        }

        public Criteria andOriPayIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("TPAY.ORI_PAY_ID >=", value, "oriPayId");
            return (Criteria) this;
        }

        public Criteria andOriPayIdLessThan(Integer value) {
            addCriterion("TPAY.ORI_PAY_ID <", value, "oriPayId");
            return (Criteria) this;
        }

        public Criteria andOriPayIdLessThanOrEqualTo(Integer value) {
            addCriterion("TPAY.ORI_PAY_ID <=", value, "oriPayId");
            return (Criteria) this;
        }

        public Criteria andOriPayIdIn(List<Integer> values) {
            addCriterion("TPAY.ORI_PAY_ID in", values, "oriPayId");
            return (Criteria) this;
        }

        public Criteria andOriPayIdNotIn(List<Integer> values) {
            addCriterion("TPAY.ORI_PAY_ID not in", values, "oriPayId");
            return (Criteria) this;
        }

        public Criteria andOriPayIdBetween(Integer value1, Integer value2) {
            addCriterion("TPAY.ORI_PAY_ID between", value1, value2, "oriPayId");
            return (Criteria) this;
        }

        public Criteria andOriPayIdNotBetween(Integer value1, Integer value2) {
            addCriterion("TPAY.ORI_PAY_ID not between", value1, value2, "oriPayId");
            return (Criteria) this;
        }

        public Criteria andOrdIdIsNull() {
            addCriterion("TPAY.ORD_ID is null");
            return (Criteria) this;
        }

        public Criteria andOrdIdIsNotNull() {
            addCriterion("TPAY.ORD_ID is not null");
            return (Criteria) this;
        }

        public Criteria andOrdIdEqualTo(Integer value) {
            addCriterion("TPAY.ORD_ID =", value, "ordId");
            return (Criteria) this;
        }

        public Criteria andOrdIdNotEqualTo(Integer value) {
            addCriterion("TPAY.ORD_ID <>", value, "ordId");
            return (Criteria) this;
        }

        public Criteria andOrdIdGreaterThan(Integer value) {
            addCriterion("TPAY.ORD_ID >", value, "ordId");
            return (Criteria) this;
        }

        public Criteria andOrdIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("TPAY.ORD_ID >=", value, "ordId");
            return (Criteria) this;
        }

        public Criteria andOrdIdLessThan(Integer value) {
            addCriterion("TPAY.ORD_ID <", value, "ordId");
            return (Criteria) this;
        }

        public Criteria andOrdIdLessThanOrEqualTo(Integer value) {
            addCriterion("TPAY.ORD_ID <=", value, "ordId");
            return (Criteria) this;
        }

        public Criteria andOrdIdIn(List<Integer> values) {
            addCriterion("TPAY.ORD_ID in", values, "ordId");
            return (Criteria) this;
        }

        public Criteria andOrdIdNotIn(List<Integer> values) {
            addCriterion("TPAY.ORD_ID not in", values, "ordId");
            return (Criteria) this;
        }

        public Criteria andOrdIdBetween(Integer value1, Integer value2) {
            addCriterion("TPAY.ORD_ID between", value1, value2, "ordId");
            return (Criteria) this;
        }

        public Criteria andOrdIdNotBetween(Integer value1, Integer value2) {
            addCriterion("TPAY.ORD_ID not between", value1, value2, "ordId");
            return (Criteria) this;
        }

        public Criteria andOrdClmIdIsNull() {
            addCriterion("TPAY.ORD_CLM_ID is null");
            return (Criteria) this;
        }

        public Criteria andOrdClmIdIsNotNull() {
            addCriterion("TPAY.ORD_CLM_ID is not null");
            return (Criteria) this;
        }

        public Criteria andOrdClmIdEqualTo(Integer value) {
            addCriterion("TPAY.ORD_CLM_ID =", value, "ordClmId");
            return (Criteria) this;
        }

        public Criteria andOrdClmIdNotEqualTo(Integer value) {
            addCriterion("TPAY.ORD_CLM_ID <>", value, "ordClmId");
            return (Criteria) this;
        }

        public Criteria andOrdClmIdGreaterThan(Integer value) {
            addCriterion("TPAY.ORD_CLM_ID >", value, "ordClmId");
            return (Criteria) this;
        }

        public Criteria andOrdClmIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("TPAY.ORD_CLM_ID >=", value, "ordClmId");
            return (Criteria) this;
        }

        public Criteria andOrdClmIdLessThan(Integer value) {
            addCriterion("TPAY.ORD_CLM_ID <", value, "ordClmId");
            return (Criteria) this;
        }

        public Criteria andOrdClmIdLessThanOrEqualTo(Integer value) {
            addCriterion("TPAY.ORD_CLM_ID <=", value, "ordClmId");
            return (Criteria) this;
        }

        public Criteria andOrdClmIdIn(List<Integer> values) {
            addCriterion("TPAY.ORD_CLM_ID in", values, "ordClmId");
            return (Criteria) this;
        }

        public Criteria andOrdClmIdNotIn(List<Integer> values) {
            addCriterion("TPAY.ORD_CLM_ID not in", values, "ordClmId");
            return (Criteria) this;
        }

        public Criteria andOrdClmIdBetween(Integer value1, Integer value2) {
            addCriterion("TPAY.ORD_CLM_ID between", value1, value2, "ordClmId");
            return (Criteria) this;
        }

        public Criteria andOrdClmIdNotBetween(Integer value1, Integer value2) {
            addCriterion("TPAY.ORD_CLM_ID not between", value1, value2, "ordClmId");
            return (Criteria) this;
        }

        public Criteria andPayTpCdIsNull() {
            addCriterion("TPAY.PAY_TP_CD is null");
            return (Criteria) this;
        }

        public Criteria andPayTpCdIsNotNull() {
            addCriterion("TPAY.PAY_TP_CD is not null");
            return (Criteria) this;
        }

        public Criteria andPayTpCdEqualTo(String value) {
            addCriterion("TPAY.PAY_TP_CD =", value, "payTpCd");
            return (Criteria) this;
        }

        public Criteria andPayTpCdNotEqualTo(String value) {
            addCriterion("TPAY.PAY_TP_CD <>", value, "payTpCd");
            return (Criteria) this;
        }

        public Criteria andPayTpCdGreaterThan(String value) {
            addCriterion("TPAY.PAY_TP_CD >", value, "payTpCd");
            return (Criteria) this;
        }

        public Criteria andPayTpCdGreaterThanOrEqualTo(String value) {
            addCriterion("TPAY.PAY_TP_CD >=", value, "payTpCd");
            return (Criteria) this;
        }

        public Criteria andPayTpCdLessThan(String value) {
            addCriterion("TPAY.PAY_TP_CD <", value, "payTpCd");
            return (Criteria) this;
        }

        public Criteria andPayTpCdLessThanOrEqualTo(String value) {
            addCriterion("TPAY.PAY_TP_CD <=", value, "payTpCd");
            return (Criteria) this;
        }

        public Criteria andPayTpCdLike(String value) {
            addCriterion("TPAY.PAY_TP_CD like", value, "payTpCd");
            return (Criteria) this;
        }

        public Criteria andPayTpCdNotLike(String value) {
            addCriterion("TPAY.PAY_TP_CD not like", value, "payTpCd");
            return (Criteria) this;
        }

        public Criteria andPayTpCdIn(List<String> values) {
            addCriterion("TPAY.PAY_TP_CD in", values, "payTpCd");
            return (Criteria) this;
        }

        public Criteria andPayTpCdNotIn(List<String> values) {
            addCriterion("TPAY.PAY_TP_CD not in", values, "payTpCd");
            return (Criteria) this;
        }

        public Criteria andPayTpCdBetween(String value1, String value2) {
            addCriterion("TPAY.PAY_TP_CD between", value1, value2, "payTpCd");
            return (Criteria) this;
        }

        public Criteria andPayTpCdNotBetween(String value1, String value2) {
            addCriterion("TPAY.PAY_TP_CD not between", value1, value2, "payTpCd");
            return (Criteria) this;
        }

        public Criteria andPayStatCdIsNull() {
            addCriterion("TPAY.PAY_STAT_CD is null");
            return (Criteria) this;
        }

        public Criteria andPayStatCdIsNotNull() {
            addCriterion("TPAY.PAY_STAT_CD is not null");
            return (Criteria) this;
        }

        public Criteria andPayStatCdEqualTo(String value) {
            addCriterion("TPAY.PAY_STAT_CD =", value, "payStatCd");
            return (Criteria) this;
        }

        public Criteria andPayStatCdNotEqualTo(String value) {
            addCriterion("TPAY.PAY_STAT_CD <>", value, "payStatCd");
            return (Criteria) this;
        }

        public Criteria andPayStatCdGreaterThan(String value) {
            addCriterion("TPAY.PAY_STAT_CD >", value, "payStatCd");
            return (Criteria) this;
        }

        public Criteria andPayStatCdGreaterThanOrEqualTo(String value) {
            addCriterion("TPAY.PAY_STAT_CD >=", value, "payStatCd");
            return (Criteria) this;
        }

        public Criteria andPayStatCdLessThan(String value) {
            addCriterion("TPAY.PAY_STAT_CD <", value, "payStatCd");
            return (Criteria) this;
        }

        public Criteria andPayStatCdLessThanOrEqualTo(String value) {
            addCriterion("TPAY.PAY_STAT_CD <=", value, "payStatCd");
            return (Criteria) this;
        }

        public Criteria andPayStatCdLike(String value) {
            addCriterion("TPAY.PAY_STAT_CD like", value, "payStatCd");
            return (Criteria) this;
        }

        public Criteria andPayStatCdNotLike(String value) {
            addCriterion("TPAY.PAY_STAT_CD not like", value, "payStatCd");
            return (Criteria) this;
        }

        public Criteria andPayStatCdIn(List<String> values) {
            addCriterion("TPAY.PAY_STAT_CD in", values, "payStatCd");
            return (Criteria) this;
        }

        public Criteria andPayStatCdNotIn(List<String> values) {
            addCriterion("TPAY.PAY_STAT_CD not in", values, "payStatCd");
            return (Criteria) this;
        }

        public Criteria andPayStatCdBetween(String value1, String value2) {
            addCriterion("TPAY.PAY_STAT_CD between", value1, value2, "payStatCd");
            return (Criteria) this;
        }

        public Criteria andPayStatCdNotBetween(String value1, String value2) {
            addCriterion("TPAY.PAY_STAT_CD not between", value1, value2, "payStatCd");
            return (Criteria) this;
        }

        public Criteria andPayPgCdIsNull() {
            addCriterion("TPAY.PAY_PG_CD is null");
            return (Criteria) this;
        }

        public Criteria andPayPgCdIsNotNull() {
            addCriterion("TPAY.PAY_PG_CD is not null");
            return (Criteria) this;
        }

        public Criteria andPayPgCdEqualTo(String value) {
            addCriterion("TPAY.PAY_PG_CD =", value, "payPgCd");
            return (Criteria) this;
        }

        public Criteria andPayPgCdNotEqualTo(String value) {
            addCriterion("TPAY.PAY_PG_CD <>", value, "payPgCd");
            return (Criteria) this;
        }

        public Criteria andPayPgCdGreaterThan(String value) {
            addCriterion("TPAY.PAY_PG_CD >", value, "payPgCd");
            return (Criteria) this;
        }

        public Criteria andPayPgCdGreaterThanOrEqualTo(String value) {
            addCriterion("TPAY.PAY_PG_CD >=", value, "payPgCd");
            return (Criteria) this;
        }

        public Criteria andPayPgCdLessThan(String value) {
            addCriterion("TPAY.PAY_PG_CD <", value, "payPgCd");
            return (Criteria) this;
        }

        public Criteria andPayPgCdLessThanOrEqualTo(String value) {
            addCriterion("TPAY.PAY_PG_CD <=", value, "payPgCd");
            return (Criteria) this;
        }

        public Criteria andPayPgCdLike(String value) {
            addCriterion("TPAY.PAY_PG_CD like", value, "payPgCd");
            return (Criteria) this;
        }

        public Criteria andPayPgCdNotLike(String value) {
            addCriterion("TPAY.PAY_PG_CD not like", value, "payPgCd");
            return (Criteria) this;
        }

        public Criteria andPayPgCdIn(List<String> values) {
            addCriterion("TPAY.PAY_PG_CD in", values, "payPgCd");
            return (Criteria) this;
        }

        public Criteria andPayPgCdNotIn(List<String> values) {
            addCriterion("TPAY.PAY_PG_CD not in", values, "payPgCd");
            return (Criteria) this;
        }

        public Criteria andPayPgCdBetween(String value1, String value2) {
            addCriterion("TPAY.PAY_PG_CD between", value1, value2, "payPgCd");
            return (Criteria) this;
        }

        public Criteria andPayPgCdNotBetween(String value1, String value2) {
            addCriterion("TPAY.PAY_PG_CD not between", value1, value2, "payPgCd");
            return (Criteria) this;
        }

        public Criteria andMidIsNull() {
            addCriterion("TPAY.MID is null");
            return (Criteria) this;
        }

        public Criteria andMidIsNotNull() {
            addCriterion("TPAY.MID is not null");
            return (Criteria) this;
        }

        public Criteria andMidEqualTo(String value) {
            addCriterion("TPAY.MID =", value, "mid");
            return (Criteria) this;
        }

        public Criteria andMidNotEqualTo(String value) {
            addCriterion("TPAY.MID <>", value, "mid");
            return (Criteria) this;
        }

        public Criteria andMidGreaterThan(String value) {
            addCriterion("TPAY.MID >", value, "mid");
            return (Criteria) this;
        }

        public Criteria andMidGreaterThanOrEqualTo(String value) {
            addCriterion("TPAY.MID >=", value, "mid");
            return (Criteria) this;
        }

        public Criteria andMidLessThan(String value) {
            addCriterion("TPAY.MID <", value, "mid");
            return (Criteria) this;
        }

        public Criteria andMidLessThanOrEqualTo(String value) {
            addCriterion("TPAY.MID <=", value, "mid");
            return (Criteria) this;
        }

        public Criteria andMidLike(String value) {
            addCriterion("TPAY.MID like", value, "mid");
            return (Criteria) this;
        }

        public Criteria andMidNotLike(String value) {
            addCriterion("TPAY.MID not like", value, "mid");
            return (Criteria) this;
        }

        public Criteria andMidIn(List<String> values) {
            addCriterion("TPAY.MID in", values, "mid");
            return (Criteria) this;
        }

        public Criteria andMidNotIn(List<String> values) {
            addCriterion("TPAY.MID not in", values, "mid");
            return (Criteria) this;
        }

        public Criteria andMidBetween(String value1, String value2) {
            addCriterion("TPAY.MID between", value1, value2, "mid");
            return (Criteria) this;
        }

        public Criteria andMidNotBetween(String value1, String value2) {
            addCriterion("TPAY.MID not between", value1, value2, "mid");
            return (Criteria) this;
        }

        public Criteria andPayMthdCdIsNull() {
            addCriterion("TPAY.PAY_MTHD_CD is null");
            return (Criteria) this;
        }

        public Criteria andPayMthdCdIsNotNull() {
            addCriterion("TPAY.PAY_MTHD_CD is not null");
            return (Criteria) this;
        }

        public Criteria andPayMthdCdEqualTo(String value) {
            addCriterion("TPAY.PAY_MTHD_CD =", value, "payMthdCd");
            return (Criteria) this;
        }

        public Criteria andPayMthdCdNotEqualTo(String value) {
            addCriterion("TPAY.PAY_MTHD_CD <>", value, "payMthdCd");
            return (Criteria) this;
        }

        public Criteria andPayMthdCdGreaterThan(String value) {
            addCriterion("TPAY.PAY_MTHD_CD >", value, "payMthdCd");
            return (Criteria) this;
        }

        public Criteria andPayMthdCdGreaterThanOrEqualTo(String value) {
            addCriterion("TPAY.PAY_MTHD_CD >=", value, "payMthdCd");
            return (Criteria) this;
        }

        public Criteria andPayMthdCdLessThan(String value) {
            addCriterion("TPAY.PAY_MTHD_CD <", value, "payMthdCd");
            return (Criteria) this;
        }

        public Criteria andPayMthdCdLessThanOrEqualTo(String value) {
            addCriterion("TPAY.PAY_MTHD_CD <=", value, "payMthdCd");
            return (Criteria) this;
        }

        public Criteria andPayMthdCdLike(String value) {
            addCriterion("TPAY.PAY_MTHD_CD like", value, "payMthdCd");
            return (Criteria) this;
        }

        public Criteria andPayMthdCdNotLike(String value) {
            addCriterion("TPAY.PAY_MTHD_CD not like", value, "payMthdCd");
            return (Criteria) this;
        }

        public Criteria andPayMthdCdIn(List<String> values) {
            addCriterion("TPAY.PAY_MTHD_CD in", values, "payMthdCd");
            return (Criteria) this;
        }

        public Criteria andPayMthdCdNotIn(List<String> values) {
            addCriterion("TPAY.PAY_MTHD_CD not in", values, "payMthdCd");
            return (Criteria) this;
        }

        public Criteria andPayMthdCdBetween(String value1, String value2) {
            addCriterion("TPAY.PAY_MTHD_CD between", value1, value2, "payMthdCd");
            return (Criteria) this;
        }

        public Criteria andPayMthdCdNotBetween(String value1, String value2) {
            addCriterion("TPAY.PAY_MTHD_CD not between", value1, value2, "payMthdCd");
            return (Criteria) this;
        }

        public Criteria andPayAmtIsNull() {
            addCriterion("TPAY.PAY_AMT is null");
            return (Criteria) this;
        }

        public Criteria andPayAmtIsNotNull() {
            addCriterion("TPAY.PAY_AMT is not null");
            return (Criteria) this;
        }

        public Criteria andPayAmtEqualTo(Integer value) {
            addCriterion("TPAY.PAY_AMT =", value, "payAmt");
            return (Criteria) this;
        }

        public Criteria andPayAmtNotEqualTo(Integer value) {
            addCriterion("TPAY.PAY_AMT <>", value, "payAmt");
            return (Criteria) this;
        }

        public Criteria andPayAmtGreaterThan(Integer value) {
            addCriterion("TPAY.PAY_AMT >", value, "payAmt");
            return (Criteria) this;
        }

        public Criteria andPayAmtGreaterThanOrEqualTo(Integer value) {
            addCriterion("TPAY.PAY_AMT >=", value, "payAmt");
            return (Criteria) this;
        }

        public Criteria andPayAmtLessThan(Integer value) {
            addCriterion("TPAY.PAY_AMT <", value, "payAmt");
            return (Criteria) this;
        }

        public Criteria andPayAmtLessThanOrEqualTo(Integer value) {
            addCriterion("TPAY.PAY_AMT <=", value, "payAmt");
            return (Criteria) this;
        }

        public Criteria andPayAmtIn(List<Integer> values) {
            addCriterion("TPAY.PAY_AMT in", values, "payAmt");
            return (Criteria) this;
        }

        public Criteria andPayAmtNotIn(List<Integer> values) {
            addCriterion("TPAY.PAY_AMT not in", values, "payAmt");
            return (Criteria) this;
        }

        public Criteria andPayAmtBetween(Integer value1, Integer value2) {
            addCriterion("TPAY.PAY_AMT between", value1, value2, "payAmt");
            return (Criteria) this;
        }

        public Criteria andPayAmtNotBetween(Integer value1, Integer value2) {
            addCriterion("TPAY.PAY_AMT not between", value1, value2, "payAmt");
            return (Criteria) this;
        }

        public Criteria andRfdAmtIsNull() {
            addCriterion("TPAY.RFD_AMT is null");
            return (Criteria) this;
        }

        public Criteria andRfdAmtIsNotNull() {
            addCriterion("TPAY.RFD_AMT is not null");
            return (Criteria) this;
        }

        public Criteria andRfdAmtEqualTo(Integer value) {
            addCriterion("TPAY.RFD_AMT =", value, "rfdAmt");
            return (Criteria) this;
        }

        public Criteria andRfdAmtNotEqualTo(Integer value) {
            addCriterion("TPAY.RFD_AMT <>", value, "rfdAmt");
            return (Criteria) this;
        }

        public Criteria andRfdAmtGreaterThan(Integer value) {
            addCriterion("TPAY.RFD_AMT >", value, "rfdAmt");
            return (Criteria) this;
        }

        public Criteria andRfdAmtGreaterThanOrEqualTo(Integer value) {
            addCriterion("TPAY.RFD_AMT >=", value, "rfdAmt");
            return (Criteria) this;
        }

        public Criteria andRfdAmtLessThan(Integer value) {
            addCriterion("TPAY.RFD_AMT <", value, "rfdAmt");
            return (Criteria) this;
        }

        public Criteria andRfdAmtLessThanOrEqualTo(Integer value) {
            addCriterion("TPAY.RFD_AMT <=", value, "rfdAmt");
            return (Criteria) this;
        }

        public Criteria andRfdAmtIn(List<Integer> values) {
            addCriterion("TPAY.RFD_AMT in", values, "rfdAmt");
            return (Criteria) this;
        }

        public Criteria andRfdAmtNotIn(List<Integer> values) {
            addCriterion("TPAY.RFD_AMT not in", values, "rfdAmt");
            return (Criteria) this;
        }

        public Criteria andRfdAmtBetween(Integer value1, Integer value2) {
            addCriterion("TPAY.RFD_AMT between", value1, value2, "rfdAmt");
            return (Criteria) this;
        }

        public Criteria andRfdAmtNotBetween(Integer value1, Integer value2) {
            addCriterion("TPAY.RFD_AMT not between", value1, value2, "rfdAmt");
            return (Criteria) this;
        }

        public Criteria andRealPayAmtIsNull() {
            addCriterion("TPAY.REAL_PAY_AMT is null");
            return (Criteria) this;
        }

        public Criteria andRealPayAmtIsNotNull() {
            addCriterion("TPAY.REAL_PAY_AMT is not null");
            return (Criteria) this;
        }

        public Criteria andRealPayAmtEqualTo(Integer value) {
            addCriterion("TPAY.REAL_PAY_AMT =", value, "realPayAmt");
            return (Criteria) this;
        }

        public Criteria andRealPayAmtNotEqualTo(Integer value) {
            addCriterion("TPAY.REAL_PAY_AMT <>", value, "realPayAmt");
            return (Criteria) this;
        }

        public Criteria andRealPayAmtGreaterThan(Integer value) {
            addCriterion("TPAY.REAL_PAY_AMT >", value, "realPayAmt");
            return (Criteria) this;
        }

        public Criteria andRealPayAmtGreaterThanOrEqualTo(Integer value) {
            addCriterion("TPAY.REAL_PAY_AMT >=", value, "realPayAmt");
            return (Criteria) this;
        }

        public Criteria andRealPayAmtLessThan(Integer value) {
            addCriterion("TPAY.REAL_PAY_AMT <", value, "realPayAmt");
            return (Criteria) this;
        }

        public Criteria andRealPayAmtLessThanOrEqualTo(Integer value) {
            addCriterion("TPAY.REAL_PAY_AMT <=", value, "realPayAmt");
            return (Criteria) this;
        }

        public Criteria andRealPayAmtIn(List<Integer> values) {
            addCriterion("TPAY.REAL_PAY_AMT in", values, "realPayAmt");
            return (Criteria) this;
        }

        public Criteria andRealPayAmtNotIn(List<Integer> values) {
            addCriterion("TPAY.REAL_PAY_AMT not in", values, "realPayAmt");
            return (Criteria) this;
        }

        public Criteria andRealPayAmtBetween(Integer value1, Integer value2) {
            addCriterion("TPAY.REAL_PAY_AMT between", value1, value2, "realPayAmt");
            return (Criteria) this;
        }

        public Criteria andRealPayAmtNotBetween(Integer value1, Integer value2) {
            addCriterion("TPAY.REAL_PAY_AMT not between", value1, value2, "realPayAmt");
            return (Criteria) this;
        }

        public Criteria andPgSplyAmtIsNull() {
            addCriterion("TPAY.PG_SPLY_AMT is null");
            return (Criteria) this;
        }

        public Criteria andPgSplyAmtIsNotNull() {
            addCriterion("TPAY.PG_SPLY_AMT is not null");
            return (Criteria) this;
        }

        public Criteria andPgSplyAmtEqualTo(Integer value) {
            addCriterion("TPAY.PG_SPLY_AMT =", value, "pgSplyAmt");
            return (Criteria) this;
        }

        public Criteria andPgSplyAmtNotEqualTo(Integer value) {
            addCriterion("TPAY.PG_SPLY_AMT <>", value, "pgSplyAmt");
            return (Criteria) this;
        }

        public Criteria andPgSplyAmtGreaterThan(Integer value) {
            addCriterion("TPAY.PG_SPLY_AMT >", value, "pgSplyAmt");
            return (Criteria) this;
        }

        public Criteria andPgSplyAmtGreaterThanOrEqualTo(Integer value) {
            addCriterion("TPAY.PG_SPLY_AMT >=", value, "pgSplyAmt");
            return (Criteria) this;
        }

        public Criteria andPgSplyAmtLessThan(Integer value) {
            addCriterion("TPAY.PG_SPLY_AMT <", value, "pgSplyAmt");
            return (Criteria) this;
        }

        public Criteria andPgSplyAmtLessThanOrEqualTo(Integer value) {
            addCriterion("TPAY.PG_SPLY_AMT <=", value, "pgSplyAmt");
            return (Criteria) this;
        }

        public Criteria andPgSplyAmtIn(List<Integer> values) {
            addCriterion("TPAY.PG_SPLY_AMT in", values, "pgSplyAmt");
            return (Criteria) this;
        }

        public Criteria andPgSplyAmtNotIn(List<Integer> values) {
            addCriterion("TPAY.PG_SPLY_AMT not in", values, "pgSplyAmt");
            return (Criteria) this;
        }

        public Criteria andPgSplyAmtBetween(Integer value1, Integer value2) {
            addCriterion("TPAY.PG_SPLY_AMT between", value1, value2, "pgSplyAmt");
            return (Criteria) this;
        }

        public Criteria andPgSplyAmtNotBetween(Integer value1, Integer value2) {
            addCriterion("TPAY.PG_SPLY_AMT not between", value1, value2, "pgSplyAmt");
            return (Criteria) this;
        }

        public Criteria andPgVatAmtIsNull() {
            addCriterion("TPAY.PG_VAT_AMT is null");
            return (Criteria) this;
        }

        public Criteria andPgVatAmtIsNotNull() {
            addCriterion("TPAY.PG_VAT_AMT is not null");
            return (Criteria) this;
        }

        public Criteria andPgVatAmtEqualTo(Integer value) {
            addCriterion("TPAY.PG_VAT_AMT =", value, "pgVatAmt");
            return (Criteria) this;
        }

        public Criteria andPgVatAmtNotEqualTo(Integer value) {
            addCriterion("TPAY.PG_VAT_AMT <>", value, "pgVatAmt");
            return (Criteria) this;
        }

        public Criteria andPgVatAmtGreaterThan(Integer value) {
            addCriterion("TPAY.PG_VAT_AMT >", value, "pgVatAmt");
            return (Criteria) this;
        }

        public Criteria andPgVatAmtGreaterThanOrEqualTo(Integer value) {
            addCriterion("TPAY.PG_VAT_AMT >=", value, "pgVatAmt");
            return (Criteria) this;
        }

        public Criteria andPgVatAmtLessThan(Integer value) {
            addCriterion("TPAY.PG_VAT_AMT <", value, "pgVatAmt");
            return (Criteria) this;
        }

        public Criteria andPgVatAmtLessThanOrEqualTo(Integer value) {
            addCriterion("TPAY.PG_VAT_AMT <=", value, "pgVatAmt");
            return (Criteria) this;
        }

        public Criteria andPgVatAmtIn(List<Integer> values) {
            addCriterion("TPAY.PG_VAT_AMT in", values, "pgVatAmt");
            return (Criteria) this;
        }

        public Criteria andPgVatAmtNotIn(List<Integer> values) {
            addCriterion("TPAY.PG_VAT_AMT not in", values, "pgVatAmt");
            return (Criteria) this;
        }

        public Criteria andPgVatAmtBetween(Integer value1, Integer value2) {
            addCriterion("TPAY.PG_VAT_AMT between", value1, value2, "pgVatAmt");
            return (Criteria) this;
        }

        public Criteria andPgVatAmtNotBetween(Integer value1, Integer value2) {
            addCriterion("TPAY.PG_VAT_AMT not between", value1, value2, "pgVatAmt");
            return (Criteria) this;
        }

        public Criteria andPgTaxfreeAmtIsNull() {
            addCriterion("TPAY.PG_TAXFREE_AMT is null");
            return (Criteria) this;
        }

        public Criteria andPgTaxfreeAmtIsNotNull() {
            addCriterion("TPAY.PG_TAXFREE_AMT is not null");
            return (Criteria) this;
        }

        public Criteria andPgTaxfreeAmtEqualTo(Integer value) {
            addCriterion("TPAY.PG_TAXFREE_AMT =", value, "pgTaxfreeAmt");
            return (Criteria) this;
        }

        public Criteria andPgTaxfreeAmtNotEqualTo(Integer value) {
            addCriterion("TPAY.PG_TAXFREE_AMT <>", value, "pgTaxfreeAmt");
            return (Criteria) this;
        }

        public Criteria andPgTaxfreeAmtGreaterThan(Integer value) {
            addCriterion("TPAY.PG_TAXFREE_AMT >", value, "pgTaxfreeAmt");
            return (Criteria) this;
        }

        public Criteria andPgTaxfreeAmtGreaterThanOrEqualTo(Integer value) {
            addCriterion("TPAY.PG_TAXFREE_AMT >=", value, "pgTaxfreeAmt");
            return (Criteria) this;
        }

        public Criteria andPgTaxfreeAmtLessThan(Integer value) {
            addCriterion("TPAY.PG_TAXFREE_AMT <", value, "pgTaxfreeAmt");
            return (Criteria) this;
        }

        public Criteria andPgTaxfreeAmtLessThanOrEqualTo(Integer value) {
            addCriterion("TPAY.PG_TAXFREE_AMT <=", value, "pgTaxfreeAmt");
            return (Criteria) this;
        }

        public Criteria andPgTaxfreeAmtIn(List<Integer> values) {
            addCriterion("TPAY.PG_TAXFREE_AMT in", values, "pgTaxfreeAmt");
            return (Criteria) this;
        }

        public Criteria andPgTaxfreeAmtNotIn(List<Integer> values) {
            addCriterion("TPAY.PG_TAXFREE_AMT not in", values, "pgTaxfreeAmt");
            return (Criteria) this;
        }

        public Criteria andPgTaxfreeAmtBetween(Integer value1, Integer value2) {
            addCriterion("TPAY.PG_TAXFREE_AMT between", value1, value2, "pgTaxfreeAmt");
            return (Criteria) this;
        }

        public Criteria andPgTaxfreeAmtNotBetween(Integer value1, Integer value2) {
            addCriterion("TPAY.PG_TAXFREE_AMT not between", value1, value2, "pgTaxfreeAmt");
            return (Criteria) this;
        }

        public Criteria andCashRctTgtAmtIsNull() {
            addCriterion("TPAY.CASH_RCT_TGT_AMT is null");
            return (Criteria) this;
        }

        public Criteria andCashRctTgtAmtIsNotNull() {
            addCriterion("TPAY.CASH_RCT_TGT_AMT is not null");
            return (Criteria) this;
        }

        public Criteria andCashRctTgtAmtEqualTo(Integer value) {
            addCriterion("TPAY.CASH_RCT_TGT_AMT =", value, "cashRctTgtAmt");
            return (Criteria) this;
        }

        public Criteria andCashRctTgtAmtNotEqualTo(Integer value) {
            addCriterion("TPAY.CASH_RCT_TGT_AMT <>", value, "cashRctTgtAmt");
            return (Criteria) this;
        }

        public Criteria andCashRctTgtAmtGreaterThan(Integer value) {
            addCriterion("TPAY.CASH_RCT_TGT_AMT >", value, "cashRctTgtAmt");
            return (Criteria) this;
        }

        public Criteria andCashRctTgtAmtGreaterThanOrEqualTo(Integer value) {
            addCriterion("TPAY.CASH_RCT_TGT_AMT >=", value, "cashRctTgtAmt");
            return (Criteria) this;
        }

        public Criteria andCashRctTgtAmtLessThan(Integer value) {
            addCriterion("TPAY.CASH_RCT_TGT_AMT <", value, "cashRctTgtAmt");
            return (Criteria) this;
        }

        public Criteria andCashRctTgtAmtLessThanOrEqualTo(Integer value) {
            addCriterion("TPAY.CASH_RCT_TGT_AMT <=", value, "cashRctTgtAmt");
            return (Criteria) this;
        }

        public Criteria andCashRctTgtAmtIn(List<Integer> values) {
            addCriterion("TPAY.CASH_RCT_TGT_AMT in", values, "cashRctTgtAmt");
            return (Criteria) this;
        }

        public Criteria andCashRctTgtAmtNotIn(List<Integer> values) {
            addCriterion("TPAY.CASH_RCT_TGT_AMT not in", values, "cashRctTgtAmt");
            return (Criteria) this;
        }

        public Criteria andCashRctTgtAmtBetween(Integer value1, Integer value2) {
            addCriterion("TPAY.CASH_RCT_TGT_AMT between", value1, value2, "cashRctTgtAmt");
            return (Criteria) this;
        }

        public Criteria andCashRctTgtAmtNotBetween(Integer value1, Integer value2) {
            addCriterion("TPAY.CASH_RCT_TGT_AMT not between", value1, value2, "cashRctTgtAmt");
            return (Criteria) this;
        }

        public Criteria andEscrBuyYnIsNull() {
            addCriterion("TPAY.ESCR_BUY_YN is null");
            return (Criteria) this;
        }

        public Criteria andEscrBuyYnIsNotNull() {
            addCriterion("TPAY.ESCR_BUY_YN is not null");
            return (Criteria) this;
        }

        public Criteria andEscrBuyYnEqualTo(String value) {
            addCriterion("TPAY.ESCR_BUY_YN =", value, "escrBuyYn");
            return (Criteria) this;
        }

        public Criteria andEscrBuyYnNotEqualTo(String value) {
            addCriterion("TPAY.ESCR_BUY_YN <>", value, "escrBuyYn");
            return (Criteria) this;
        }

        public Criteria andEscrBuyYnGreaterThan(String value) {
            addCriterion("TPAY.ESCR_BUY_YN >", value, "escrBuyYn");
            return (Criteria) this;
        }

        public Criteria andEscrBuyYnGreaterThanOrEqualTo(String value) {
            addCriterion("TPAY.ESCR_BUY_YN >=", value, "escrBuyYn");
            return (Criteria) this;
        }

        public Criteria andEscrBuyYnLessThan(String value) {
            addCriterion("TPAY.ESCR_BUY_YN <", value, "escrBuyYn");
            return (Criteria) this;
        }

        public Criteria andEscrBuyYnLessThanOrEqualTo(String value) {
            addCriterion("TPAY.ESCR_BUY_YN <=", value, "escrBuyYn");
            return (Criteria) this;
        }

        public Criteria andEscrBuyYnLike(String value) {
            addCriterion("TPAY.ESCR_BUY_YN like", value, "escrBuyYn");
            return (Criteria) this;
        }

        public Criteria andEscrBuyYnNotLike(String value) {
            addCriterion("TPAY.ESCR_BUY_YN not like", value, "escrBuyYn");
            return (Criteria) this;
        }

        public Criteria andEscrBuyYnIn(List<String> values) {
            addCriterion("TPAY.ESCR_BUY_YN in", values, "escrBuyYn");
            return (Criteria) this;
        }

        public Criteria andEscrBuyYnNotIn(List<String> values) {
            addCriterion("TPAY.ESCR_BUY_YN not in", values, "escrBuyYn");
            return (Criteria) this;
        }

        public Criteria andEscrBuyYnBetween(String value1, String value2) {
            addCriterion("TPAY.ESCR_BUY_YN between", value1, value2, "escrBuyYn");
            return (Criteria) this;
        }

        public Criteria andEscrBuyYnNotBetween(String value1, String value2) {
            addCriterion("TPAY.ESCR_BUY_YN not between", value1, value2, "escrBuyYn");
            return (Criteria) this;
        }

        public Criteria andPayDtIsNull() {
            addCriterion("TPAY.PAY_DT is null");
            return (Criteria) this;
        }

        public Criteria andPayDtIsNotNull() {
            addCriterion("TPAY.PAY_DT is not null");
            return (Criteria) this;
        }

        public Criteria andPayDtEqualTo(Date value) {
            addCriterionForJDBCDate("TPAY.PAY_DT =", value, "payDt");
            return (Criteria) this;
        }

        public Criteria andPayDtNotEqualTo(Date value) {
            addCriterionForJDBCDate("TPAY.PAY_DT <>", value, "payDt");
            return (Criteria) this;
        }

        public Criteria andPayDtGreaterThan(Date value) {
            addCriterionForJDBCDate("TPAY.PAY_DT >", value, "payDt");
            return (Criteria) this;
        }

        public Criteria andPayDtGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("TPAY.PAY_DT >=", value, "payDt");
            return (Criteria) this;
        }

        public Criteria andPayDtLessThan(Date value) {
            addCriterionForJDBCDate("TPAY.PAY_DT <", value, "payDt");
            return (Criteria) this;
        }

        public Criteria andPayDtLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("TPAY.PAY_DT <=", value, "payDt");
            return (Criteria) this;
        }

        public Criteria andPayDtIn(List<Date> values) {
            addCriterionForJDBCDate("TPAY.PAY_DT in", values, "payDt");
            return (Criteria) this;
        }

        public Criteria andPayDtNotIn(List<Date> values) {
            addCriterionForJDBCDate("TPAY.PAY_DT not in", values, "payDt");
            return (Criteria) this;
        }

        public Criteria andPayDtBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("TPAY.PAY_DT between", value1, value2, "payDt");
            return (Criteria) this;
        }

        public Criteria andPayDtNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("TPAY.PAY_DT not between", value1, value2, "payDt");
            return (Criteria) this;
        }

        public Criteria andPayCpltDtIsNull() {
            addCriterion("TPAY.PAY_CPLT_DT is null");
            return (Criteria) this;
        }

        public Criteria andPayCpltDtIsNotNull() {
            addCriterion("TPAY.PAY_CPLT_DT is not null");
            return (Criteria) this;
        }

        public Criteria andPayCpltDtEqualTo(Date value) {
            addCriterionForJDBCDate("TPAY.PAY_CPLT_DT =", value, "payCpltDt");
            return (Criteria) this;
        }

        public Criteria andPayCpltDtNotEqualTo(Date value) {
            addCriterionForJDBCDate("TPAY.PAY_CPLT_DT <>", value, "payCpltDt");
            return (Criteria) this;
        }

        public Criteria andPayCpltDtGreaterThan(Date value) {
            addCriterionForJDBCDate("TPAY.PAY_CPLT_DT >", value, "payCpltDt");
            return (Criteria) this;
        }

        public Criteria andPayCpltDtGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("TPAY.PAY_CPLT_DT >=", value, "payCpltDt");
            return (Criteria) this;
        }

        public Criteria andPayCpltDtLessThan(Date value) {
            addCriterionForJDBCDate("TPAY.PAY_CPLT_DT <", value, "payCpltDt");
            return (Criteria) this;
        }

        public Criteria andPayCpltDtLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("TPAY.PAY_CPLT_DT <=", value, "payCpltDt");
            return (Criteria) this;
        }

        public Criteria andPayCpltDtIn(List<Date> values) {
            addCriterionForJDBCDate("TPAY.PAY_CPLT_DT in", values, "payCpltDt");
            return (Criteria) this;
        }

        public Criteria andPayCpltDtNotIn(List<Date> values) {
            addCriterionForJDBCDate("TPAY.PAY_CPLT_DT not in", values, "payCpltDt");
            return (Criteria) this;
        }

        public Criteria andPayCpltDtBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("TPAY.PAY_CPLT_DT between", value1, value2, "payCpltDt");
            return (Criteria) this;
        }

        public Criteria andPayCpltDtNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("TPAY.PAY_CPLT_DT not between", value1, value2, "payCpltDt");
            return (Criteria) this;
        }

        public Criteria andRegDtIsNull() {
            addCriterion("TPAY.REG_DT is null");
            return (Criteria) this;
        }

        public Criteria andRegDtIsNotNull() {
            addCriterion("TPAY.REG_DT is not null");
            return (Criteria) this;
        }

        public Criteria andRegDtEqualTo(Date value) {
            addCriterion("TPAY.REG_DT =", value, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtNotEqualTo(Date value) {
            addCriterion("TPAY.REG_DT <>", value, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtGreaterThan(Date value) {
            addCriterion("TPAY.REG_DT >", value, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtGreaterThanOrEqualTo(Date value) {
            addCriterion("TPAY.REG_DT >=", value, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtLessThan(Date value) {
            addCriterion("TPAY.REG_DT <", value, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtLessThanOrEqualTo(Date value) {
            addCriterion("TPAY.REG_DT <=", value, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtIn(List<Date> values) {
            addCriterion("TPAY.REG_DT in", values, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtNotIn(List<Date> values) {
            addCriterion("TPAY.REG_DT not in", values, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtBetween(Date value1, Date value2) {
            addCriterion("TPAY.REG_DT between", value1, value2, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtNotBetween(Date value1, Date value2) {
            addCriterion("TPAY.REG_DT not between", value1, value2, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegIdIsNull() {
            addCriterion("TPAY.REG_ID is null");
            return (Criteria) this;
        }

        public Criteria andRegIdIsNotNull() {
            addCriterion("TPAY.REG_ID is not null");
            return (Criteria) this;
        }

        public Criteria andRegIdEqualTo(String value) {
            addCriterion("TPAY.REG_ID =", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdNotEqualTo(String value) {
            addCriterion("TPAY.REG_ID <>", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdGreaterThan(String value) {
            addCriterion("TPAY.REG_ID >", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdGreaterThanOrEqualTo(String value) {
            addCriterion("TPAY.REG_ID >=", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdLessThan(String value) {
            addCriterion("TPAY.REG_ID <", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdLessThanOrEqualTo(String value) {
            addCriterion("TPAY.REG_ID <=", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdLike(String value) {
            addCriterion("TPAY.REG_ID like", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdNotLike(String value) {
            addCriterion("TPAY.REG_ID not like", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdIn(List<String> values) {
            addCriterion("TPAY.REG_ID in", values, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdNotIn(List<String> values) {
            addCriterion("TPAY.REG_ID not in", values, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdBetween(String value1, String value2) {
            addCriterion("TPAY.REG_ID between", value1, value2, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdNotBetween(String value1, String value2) {
            addCriterion("TPAY.REG_ID not between", value1, value2, "regId");
            return (Criteria) this;
        }

        public Criteria andModDtIsNull() {
            addCriterion("TPAY.MOD_DT is null");
            return (Criteria) this;
        }

        public Criteria andModDtIsNotNull() {
            addCriterion("TPAY.MOD_DT is not null");
            return (Criteria) this;
        }

        public Criteria andModDtEqualTo(Date value) {
            addCriterion("TPAY.MOD_DT =", value, "modDt");
            return (Criteria) this;
        }

        public Criteria andModDtNotEqualTo(Date value) {
            addCriterion("TPAY.MOD_DT <>", value, "modDt");
            return (Criteria) this;
        }

        public Criteria andModDtGreaterThan(Date value) {
            addCriterion("TPAY.MOD_DT >", value, "modDt");
            return (Criteria) this;
        }

        public Criteria andModDtGreaterThanOrEqualTo(Date value) {
            addCriterion("TPAY.MOD_DT >=", value, "modDt");
            return (Criteria) this;
        }

        public Criteria andModDtLessThan(Date value) {
            addCriterion("TPAY.MOD_DT <", value, "modDt");
            return (Criteria) this;
        }

        public Criteria andModDtLessThanOrEqualTo(Date value) {
            addCriterion("TPAY.MOD_DT <=", value, "modDt");
            return (Criteria) this;
        }

        public Criteria andModDtIn(List<Date> values) {
            addCriterion("TPAY.MOD_DT in", values, "modDt");
            return (Criteria) this;
        }

        public Criteria andModDtNotIn(List<Date> values) {
            addCriterion("TPAY.MOD_DT not in", values, "modDt");
            return (Criteria) this;
        }

        public Criteria andModDtBetween(Date value1, Date value2) {
            addCriterion("TPAY.MOD_DT between", value1, value2, "modDt");
            return (Criteria) this;
        }

        public Criteria andModDtNotBetween(Date value1, Date value2) {
            addCriterion("TPAY.MOD_DT not between", value1, value2, "modDt");
            return (Criteria) this;
        }

        public Criteria andModIdIsNull() {
            addCriterion("TPAY.MOD_ID is null");
            return (Criteria) this;
        }

        public Criteria andModIdIsNotNull() {
            addCriterion("TPAY.MOD_ID is not null");
            return (Criteria) this;
        }

        public Criteria andModIdEqualTo(String value) {
            addCriterion("TPAY.MOD_ID =", value, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdNotEqualTo(String value) {
            addCriterion("TPAY.MOD_ID <>", value, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdGreaterThan(String value) {
            addCriterion("TPAY.MOD_ID >", value, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdGreaterThanOrEqualTo(String value) {
            addCriterion("TPAY.MOD_ID >=", value, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdLessThan(String value) {
            addCriterion("TPAY.MOD_ID <", value, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdLessThanOrEqualTo(String value) {
            addCriterion("TPAY.MOD_ID <=", value, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdLike(String value) {
            addCriterion("TPAY.MOD_ID like", value, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdNotLike(String value) {
            addCriterion("TPAY.MOD_ID not like", value, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdIn(List<String> values) {
            addCriterion("TPAY.MOD_ID in", values, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdNotIn(List<String> values) {
            addCriterion("TPAY.MOD_ID not in", values, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdBetween(String value1, String value2) {
            addCriterion("TPAY.MOD_ID between", value1, value2, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdNotBetween(String value1, String value2) {
            addCriterion("TPAY.MOD_ID not between", value1, value2, "modId");
            return (Criteria) this;
        }

        public Criteria andPayTpCdLikeInsensitive(String value) {
            addCriterion("upper(TPAY.PAY_TP_CD) like", value.toUpperCase(), "payTpCd");
            return (Criteria) this;
        }

        public Criteria andPayStatCdLikeInsensitive(String value) {
            addCriterion("upper(TPAY.PAY_STAT_CD) like", value.toUpperCase(), "payStatCd");
            return (Criteria) this;
        }

        public Criteria andPayPgCdLikeInsensitive(String value) {
            addCriterion("upper(TPAY.PAY_PG_CD) like", value.toUpperCase(), "payPgCd");
            return (Criteria) this;
        }

        public Criteria andMidLikeInsensitive(String value) {
            addCriterion("upper(TPAY.MID) like", value.toUpperCase(), "mid");
            return (Criteria) this;
        }

        public Criteria andPayMthdCdLikeInsensitive(String value) {
            addCriterion("upper(TPAY.PAY_MTHD_CD) like", value.toUpperCase(), "payMthdCd");
            return (Criteria) this;
        }

        public Criteria andEscrBuyYnLikeInsensitive(String value) {
            addCriterion("upper(TPAY.ESCR_BUY_YN) like", value.toUpperCase(), "escrBuyYn");
            return (Criteria) this;
        }

        public Criteria andRegIdLikeInsensitive(String value) {
            addCriterion("upper(TPAY.REG_ID) like", value.toUpperCase(), "regId");
            return (Criteria) this;
        }

        public Criteria andModIdLikeInsensitive(String value) {
            addCriterion("upper(TPAY.MOD_ID) like", value.toUpperCase(), "modId");
            return (Criteria) this;
        }

        public Criteria andPayTpCdLikeLeft(String value) {
            addCriterion("TPAY.PAY_TP_CD like ", "%" + value, "payTpCd");
            return (Criteria) this;
        }

        public Criteria andPayTpCdLikeRight(String value) {
            addCriterion("TPAY.PAY_TP_CD like ", value + "%", "payTpCd");
            return (Criteria) this;
        }

        public Criteria andPayTpCdLikeBoth(String value) {
            addCriterion("TPAY.PAY_TP_CD like ", "%" + value + "%", "payTpCd");
            return (Criteria) this;
        }

        public Criteria andPayStatCdLikeLeft(String value) {
            addCriterion("TPAY.PAY_STAT_CD like ", "%" + value, "payStatCd");
            return (Criteria) this;
        }

        public Criteria andPayStatCdLikeRight(String value) {
            addCriterion("TPAY.PAY_STAT_CD like ", value + "%", "payStatCd");
            return (Criteria) this;
        }

        public Criteria andPayStatCdLikeBoth(String value) {
            addCriterion("TPAY.PAY_STAT_CD like ", "%" + value + "%", "payStatCd");
            return (Criteria) this;
        }

        public Criteria andPayPgCdLikeLeft(String value) {
            addCriterion("TPAY.PAY_PG_CD like ", "%" + value, "payPgCd");
            return (Criteria) this;
        }

        public Criteria andPayPgCdLikeRight(String value) {
            addCriterion("TPAY.PAY_PG_CD like ", value + "%", "payPgCd");
            return (Criteria) this;
        }

        public Criteria andPayPgCdLikeBoth(String value) {
            addCriterion("TPAY.PAY_PG_CD like ", "%" + value + "%", "payPgCd");
            return (Criteria) this;
        }

        public Criteria andMidLikeLeft(String value) {
            addCriterion("TPAY.MID like ", "%" + value, "mid");
            return (Criteria) this;
        }

        public Criteria andMidLikeRight(String value) {
            addCriterion("TPAY.MID like ", value + "%", "mid");
            return (Criteria) this;
        }

        public Criteria andMidLikeBoth(String value) {
            addCriterion("TPAY.MID like ", "%" + value + "%", "mid");
            return (Criteria) this;
        }

        public Criteria andPayMthdCdLikeLeft(String value) {
            addCriterion("TPAY.PAY_MTHD_CD like ", "%" + value, "payMthdCd");
            return (Criteria) this;
        }

        public Criteria andPayMthdCdLikeRight(String value) {
            addCriterion("TPAY.PAY_MTHD_CD like ", value + "%", "payMthdCd");
            return (Criteria) this;
        }

        public Criteria andPayMthdCdLikeBoth(String value) {
            addCriterion("TPAY.PAY_MTHD_CD like ", "%" + value + "%", "payMthdCd");
            return (Criteria) this;
        }

        public Criteria andEscrBuyYnLikeLeft(String value) {
            addCriterion("TPAY.ESCR_BUY_YN like ", "%" + value, "escrBuyYn");
            return (Criteria) this;
        }

        public Criteria andEscrBuyYnLikeRight(String value) {
            addCriterion("TPAY.ESCR_BUY_YN like ", value + "%", "escrBuyYn");
            return (Criteria) this;
        }

        public Criteria andEscrBuyYnLikeBoth(String value) {
            addCriterion("TPAY.ESCR_BUY_YN like ", "%" + value + "%", "escrBuyYn");
            return (Criteria) this;
        }

        public Criteria andRegIdLikeLeft(String value) {
            addCriterion("TPAY.REG_ID like ", "%" + value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdLikeRight(String value) {
            addCriterion("TPAY.REG_ID like ", value + "%", "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdLikeBoth(String value) {
            addCriterion("TPAY.REG_ID like ", "%" + value + "%", "regId");
            return (Criteria) this;
        }

        public Criteria andModIdLikeLeft(String value) {
            addCriterion("TPAY.MOD_ID like ", "%" + value, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdLikeRight(String value) {
            addCriterion("TPAY.MOD_ID like ", value + "%", "modId");
            return (Criteria) this;
        }

        public Criteria andModIdLikeBoth(String value) {
            addCriterion("TPAY.MOD_ID like ", "%" + value + "%", "modId");
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