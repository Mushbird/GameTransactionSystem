package com.mushbird.sinsege.base.module.order.model.entity.criteria;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class OrderChangeHistoryEntityCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    public OrderChangeHistoryEntityCriteria() {
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

        public Criteria andOrdChistIdIsNull() {
            addCriterion("TOCH.ORD_CHIST_ID is null");
            return (Criteria) this;
        }

        public Criteria andOrdChistIdIsNotNull() {
            addCriterion("TOCH.ORD_CHIST_ID is not null");
            return (Criteria) this;
        }

        public Criteria andOrdChistIdEqualTo(Integer value) {
            addCriterion("TOCH.ORD_CHIST_ID =", value, "ordChistId");
            return (Criteria) this;
        }

        public Criteria andOrdChistIdNotEqualTo(Integer value) {
            addCriterion("TOCH.ORD_CHIST_ID <>", value, "ordChistId");
            return (Criteria) this;
        }

        public Criteria andOrdChistIdGreaterThan(Integer value) {
            addCriterion("TOCH.ORD_CHIST_ID >", value, "ordChistId");
            return (Criteria) this;
        }

        public Criteria andOrdChistIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("TOCH.ORD_CHIST_ID >=", value, "ordChistId");
            return (Criteria) this;
        }

        public Criteria andOrdChistIdLessThan(Integer value) {
            addCriterion("TOCH.ORD_CHIST_ID <", value, "ordChistId");
            return (Criteria) this;
        }

        public Criteria andOrdChistIdLessThanOrEqualTo(Integer value) {
            addCriterion("TOCH.ORD_CHIST_ID <=", value, "ordChistId");
            return (Criteria) this;
        }

        public Criteria andOrdChistIdIn(List<Integer> values) {
            addCriterion("TOCH.ORD_CHIST_ID in", values, "ordChistId");
            return (Criteria) this;
        }

        public Criteria andOrdChistIdNotIn(List<Integer> values) {
            addCriterion("TOCH.ORD_CHIST_ID not in", values, "ordChistId");
            return (Criteria) this;
        }

        public Criteria andOrdChistIdBetween(Integer value1, Integer value2) {
            addCriterion("TOCH.ORD_CHIST_ID between", value1, value2, "ordChistId");
            return (Criteria) this;
        }

        public Criteria andOrdChistIdNotBetween(Integer value1, Integer value2) {
            addCriterion("TOCH.ORD_CHIST_ID not between", value1, value2, "ordChistId");
            return (Criteria) this;
        }

        public Criteria andOrdIdIsNull() {
            addCriterion("TOCH.ORD_ID is null");
            return (Criteria) this;
        }

        public Criteria andOrdIdIsNotNull() {
            addCriterion("TOCH.ORD_ID is not null");
            return (Criteria) this;
        }

        public Criteria andOrdIdEqualTo(Integer value) {
            addCriterion("TOCH.ORD_ID =", value, "ordId");
            return (Criteria) this;
        }

        public Criteria andOrdIdNotEqualTo(Integer value) {
            addCriterion("TOCH.ORD_ID <>", value, "ordId");
            return (Criteria) this;
        }

        public Criteria andOrdIdGreaterThan(Integer value) {
            addCriterion("TOCH.ORD_ID >", value, "ordId");
            return (Criteria) this;
        }

        public Criteria andOrdIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("TOCH.ORD_ID >=", value, "ordId");
            return (Criteria) this;
        }

        public Criteria andOrdIdLessThan(Integer value) {
            addCriterion("TOCH.ORD_ID <", value, "ordId");
            return (Criteria) this;
        }

        public Criteria andOrdIdLessThanOrEqualTo(Integer value) {
            addCriterion("TOCH.ORD_ID <=", value, "ordId");
            return (Criteria) this;
        }

        public Criteria andOrdIdIn(List<Integer> values) {
            addCriterion("TOCH.ORD_ID in", values, "ordId");
            return (Criteria) this;
        }

        public Criteria andOrdIdNotIn(List<Integer> values) {
            addCriterion("TOCH.ORD_ID not in", values, "ordId");
            return (Criteria) this;
        }

        public Criteria andOrdIdBetween(Integer value1, Integer value2) {
            addCriterion("TOCH.ORD_ID between", value1, value2, "ordId");
            return (Criteria) this;
        }

        public Criteria andOrdIdNotBetween(Integer value1, Integer value2) {
            addCriterion("TOCH.ORD_ID not between", value1, value2, "ordId");
            return (Criteria) this;
        }

        public Criteria andOrdNoIsNull() {
            addCriterion("TOCH.ORD_NO is null");
            return (Criteria) this;
        }

        public Criteria andOrdNoIsNotNull() {
            addCriterion("TOCH.ORD_NO is not null");
            return (Criteria) this;
        }

        public Criteria andOrdNoEqualTo(String value) {
            addCriterion("TOCH.ORD_NO =", value, "ordNo");
            return (Criteria) this;
        }

        public Criteria andOrdNoNotEqualTo(String value) {
            addCriterion("TOCH.ORD_NO <>", value, "ordNo");
            return (Criteria) this;
        }

        public Criteria andOrdNoGreaterThan(String value) {
            addCriterion("TOCH.ORD_NO >", value, "ordNo");
            return (Criteria) this;
        }

        public Criteria andOrdNoGreaterThanOrEqualTo(String value) {
            addCriterion("TOCH.ORD_NO >=", value, "ordNo");
            return (Criteria) this;
        }

        public Criteria andOrdNoLessThan(String value) {
            addCriterion("TOCH.ORD_NO <", value, "ordNo");
            return (Criteria) this;
        }

        public Criteria andOrdNoLessThanOrEqualTo(String value) {
            addCriterion("TOCH.ORD_NO <=", value, "ordNo");
            return (Criteria) this;
        }

        public Criteria andOrdNoLike(String value) {
            addCriterion("TOCH.ORD_NO like", value, "ordNo");
            return (Criteria) this;
        }

        public Criteria andOrdNoNotLike(String value) {
            addCriterion("TOCH.ORD_NO not like", value, "ordNo");
            return (Criteria) this;
        }

        public Criteria andOrdNoIn(List<String> values) {
            addCriterion("TOCH.ORD_NO in", values, "ordNo");
            return (Criteria) this;
        }

        public Criteria andOrdNoNotIn(List<String> values) {
            addCriterion("TOCH.ORD_NO not in", values, "ordNo");
            return (Criteria) this;
        }

        public Criteria andOrdNoBetween(String value1, String value2) {
            addCriterion("TOCH.ORD_NO between", value1, value2, "ordNo");
            return (Criteria) this;
        }

        public Criteria andOrdNoNotBetween(String value1, String value2) {
            addCriterion("TOCH.ORD_NO not between", value1, value2, "ordNo");
            return (Criteria) this;
        }

        public Criteria andOrdTpCdIsNull() {
            addCriterion("TOCH.ORD_TP_CD is null");
            return (Criteria) this;
        }

        public Criteria andOrdTpCdIsNotNull() {
            addCriterion("TOCH.ORD_TP_CD is not null");
            return (Criteria) this;
        }

        public Criteria andOrdTpCdEqualTo(String value) {
            addCriterion("TOCH.ORD_TP_CD =", value, "ordTpCd");
            return (Criteria) this;
        }

        public Criteria andOrdTpCdNotEqualTo(String value) {
            addCriterion("TOCH.ORD_TP_CD <>", value, "ordTpCd");
            return (Criteria) this;
        }

        public Criteria andOrdTpCdGreaterThan(String value) {
            addCriterion("TOCH.ORD_TP_CD >", value, "ordTpCd");
            return (Criteria) this;
        }

        public Criteria andOrdTpCdGreaterThanOrEqualTo(String value) {
            addCriterion("TOCH.ORD_TP_CD >=", value, "ordTpCd");
            return (Criteria) this;
        }

        public Criteria andOrdTpCdLessThan(String value) {
            addCriterion("TOCH.ORD_TP_CD <", value, "ordTpCd");
            return (Criteria) this;
        }

        public Criteria andOrdTpCdLessThanOrEqualTo(String value) {
            addCriterion("TOCH.ORD_TP_CD <=", value, "ordTpCd");
            return (Criteria) this;
        }

        public Criteria andOrdTpCdLike(String value) {
            addCriterion("TOCH.ORD_TP_CD like", value, "ordTpCd");
            return (Criteria) this;
        }

        public Criteria andOrdTpCdNotLike(String value) {
            addCriterion("TOCH.ORD_TP_CD not like", value, "ordTpCd");
            return (Criteria) this;
        }

        public Criteria andOrdTpCdIn(List<String> values) {
            addCriterion("TOCH.ORD_TP_CD in", values, "ordTpCd");
            return (Criteria) this;
        }

        public Criteria andOrdTpCdNotIn(List<String> values) {
            addCriterion("TOCH.ORD_TP_CD not in", values, "ordTpCd");
            return (Criteria) this;
        }

        public Criteria andOrdTpCdBetween(String value1, String value2) {
            addCriterion("TOCH.ORD_TP_CD between", value1, value2, "ordTpCd");
            return (Criteria) this;
        }

        public Criteria andOrdTpCdNotBetween(String value1, String value2) {
            addCriterion("TOCH.ORD_TP_CD not between", value1, value2, "ordTpCd");
            return (Criteria) this;
        }

        public Criteria andOrdRcptChCdIsNull() {
            addCriterion("TOCH.ORD_RCPT_CH_CD is null");
            return (Criteria) this;
        }

        public Criteria andOrdRcptChCdIsNotNull() {
            addCriterion("TOCH.ORD_RCPT_CH_CD is not null");
            return (Criteria) this;
        }

        public Criteria andOrdRcptChCdEqualTo(String value) {
            addCriterion("TOCH.ORD_RCPT_CH_CD =", value, "ordRcptChCd");
            return (Criteria) this;
        }

        public Criteria andOrdRcptChCdNotEqualTo(String value) {
            addCriterion("TOCH.ORD_RCPT_CH_CD <>", value, "ordRcptChCd");
            return (Criteria) this;
        }

        public Criteria andOrdRcptChCdGreaterThan(String value) {
            addCriterion("TOCH.ORD_RCPT_CH_CD >", value, "ordRcptChCd");
            return (Criteria) this;
        }

        public Criteria andOrdRcptChCdGreaterThanOrEqualTo(String value) {
            addCriterion("TOCH.ORD_RCPT_CH_CD >=", value, "ordRcptChCd");
            return (Criteria) this;
        }

        public Criteria andOrdRcptChCdLessThan(String value) {
            addCriterion("TOCH.ORD_RCPT_CH_CD <", value, "ordRcptChCd");
            return (Criteria) this;
        }

        public Criteria andOrdRcptChCdLessThanOrEqualTo(String value) {
            addCriterion("TOCH.ORD_RCPT_CH_CD <=", value, "ordRcptChCd");
            return (Criteria) this;
        }

        public Criteria andOrdRcptChCdLike(String value) {
            addCriterion("TOCH.ORD_RCPT_CH_CD like", value, "ordRcptChCd");
            return (Criteria) this;
        }

        public Criteria andOrdRcptChCdNotLike(String value) {
            addCriterion("TOCH.ORD_RCPT_CH_CD not like", value, "ordRcptChCd");
            return (Criteria) this;
        }

        public Criteria andOrdRcptChCdIn(List<String> values) {
            addCriterion("TOCH.ORD_RCPT_CH_CD in", values, "ordRcptChCd");
            return (Criteria) this;
        }

        public Criteria andOrdRcptChCdNotIn(List<String> values) {
            addCriterion("TOCH.ORD_RCPT_CH_CD not in", values, "ordRcptChCd");
            return (Criteria) this;
        }

        public Criteria andOrdRcptChCdBetween(String value1, String value2) {
            addCriterion("TOCH.ORD_RCPT_CH_CD between", value1, value2, "ordRcptChCd");
            return (Criteria) this;
        }

        public Criteria andOrdRcptChCdNotBetween(String value1, String value2) {
            addCriterion("TOCH.ORD_RCPT_CH_CD not between", value1, value2, "ordRcptChCd");
            return (Criteria) this;
        }

        public Criteria andOrdRcptEnvCdIsNull() {
            addCriterion("TOCH.ORD_RCPT_ENV_CD is null");
            return (Criteria) this;
        }

        public Criteria andOrdRcptEnvCdIsNotNull() {
            addCriterion("TOCH.ORD_RCPT_ENV_CD is not null");
            return (Criteria) this;
        }

        public Criteria andOrdRcptEnvCdEqualTo(String value) {
            addCriterion("TOCH.ORD_RCPT_ENV_CD =", value, "ordRcptEnvCd");
            return (Criteria) this;
        }

        public Criteria andOrdRcptEnvCdNotEqualTo(String value) {
            addCriterion("TOCH.ORD_RCPT_ENV_CD <>", value, "ordRcptEnvCd");
            return (Criteria) this;
        }

        public Criteria andOrdRcptEnvCdGreaterThan(String value) {
            addCriterion("TOCH.ORD_RCPT_ENV_CD >", value, "ordRcptEnvCd");
            return (Criteria) this;
        }

        public Criteria andOrdRcptEnvCdGreaterThanOrEqualTo(String value) {
            addCriterion("TOCH.ORD_RCPT_ENV_CD >=", value, "ordRcptEnvCd");
            return (Criteria) this;
        }

        public Criteria andOrdRcptEnvCdLessThan(String value) {
            addCriterion("TOCH.ORD_RCPT_ENV_CD <", value, "ordRcptEnvCd");
            return (Criteria) this;
        }

        public Criteria andOrdRcptEnvCdLessThanOrEqualTo(String value) {
            addCriterion("TOCH.ORD_RCPT_ENV_CD <=", value, "ordRcptEnvCd");
            return (Criteria) this;
        }

        public Criteria andOrdRcptEnvCdLike(String value) {
            addCriterion("TOCH.ORD_RCPT_ENV_CD like", value, "ordRcptEnvCd");
            return (Criteria) this;
        }

        public Criteria andOrdRcptEnvCdNotLike(String value) {
            addCriterion("TOCH.ORD_RCPT_ENV_CD not like", value, "ordRcptEnvCd");
            return (Criteria) this;
        }

        public Criteria andOrdRcptEnvCdIn(List<String> values) {
            addCriterion("TOCH.ORD_RCPT_ENV_CD in", values, "ordRcptEnvCd");
            return (Criteria) this;
        }

        public Criteria andOrdRcptEnvCdNotIn(List<String> values) {
            addCriterion("TOCH.ORD_RCPT_ENV_CD not in", values, "ordRcptEnvCd");
            return (Criteria) this;
        }

        public Criteria andOrdRcptEnvCdBetween(String value1, String value2) {
            addCriterion("TOCH.ORD_RCPT_ENV_CD between", value1, value2, "ordRcptEnvCd");
            return (Criteria) this;
        }

        public Criteria andOrdRcptEnvCdNotBetween(String value1, String value2) {
            addCriterion("TOCH.ORD_RCPT_ENV_CD not between", value1, value2, "ordRcptEnvCd");
            return (Criteria) this;
        }

        public Criteria andOrdDtIsNull() {
            addCriterion("TOCH.ORD_DT is null");
            return (Criteria) this;
        }

        public Criteria andOrdDtIsNotNull() {
            addCriterion("TOCH.ORD_DT is not null");
            return (Criteria) this;
        }

        public Criteria andOrdDtEqualTo(Date value) {
            addCriterionForJDBCDate("TOCH.ORD_DT =", value, "ordDt");
            return (Criteria) this;
        }

        public Criteria andOrdDtNotEqualTo(Date value) {
            addCriterionForJDBCDate("TOCH.ORD_DT <>", value, "ordDt");
            return (Criteria) this;
        }

        public Criteria andOrdDtGreaterThan(Date value) {
            addCriterionForJDBCDate("TOCH.ORD_DT >", value, "ordDt");
            return (Criteria) this;
        }

        public Criteria andOrdDtGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("TOCH.ORD_DT >=", value, "ordDt");
            return (Criteria) this;
        }

        public Criteria andOrdDtLessThan(Date value) {
            addCriterionForJDBCDate("TOCH.ORD_DT <", value, "ordDt");
            return (Criteria) this;
        }

        public Criteria andOrdDtLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("TOCH.ORD_DT <=", value, "ordDt");
            return (Criteria) this;
        }

        public Criteria andOrdDtIn(List<Date> values) {
            addCriterionForJDBCDate("TOCH.ORD_DT in", values, "ordDt");
            return (Criteria) this;
        }

        public Criteria andOrdDtNotIn(List<Date> values) {
            addCriterionForJDBCDate("TOCH.ORD_DT not in", values, "ordDt");
            return (Criteria) this;
        }

        public Criteria andOrdDtBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("TOCH.ORD_DT between", value1, value2, "ordDt");
            return (Criteria) this;
        }

        public Criteria andOrdDtNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("TOCH.ORD_DT not between", value1, value2, "ordDt");
            return (Criteria) this;
        }

        public Criteria andMbrIdIsNull() {
            addCriterion("TOCH.MBR_ID is null");
            return (Criteria) this;
        }

        public Criteria andMbrIdIsNotNull() {
            addCriterion("TOCH.MBR_ID is not null");
            return (Criteria) this;
        }

        public Criteria andMbrIdEqualTo(String value) {
            addCriterion("TOCH.MBR_ID =", value, "mbrId");
            return (Criteria) this;
        }

        public Criteria andMbrIdNotEqualTo(String value) {
            addCriterion("TOCH.MBR_ID <>", value, "mbrId");
            return (Criteria) this;
        }

        public Criteria andMbrIdGreaterThan(String value) {
            addCriterion("TOCH.MBR_ID >", value, "mbrId");
            return (Criteria) this;
        }

        public Criteria andMbrIdGreaterThanOrEqualTo(String value) {
            addCriterion("TOCH.MBR_ID >=", value, "mbrId");
            return (Criteria) this;
        }

        public Criteria andMbrIdLessThan(String value) {
            addCriterion("TOCH.MBR_ID <", value, "mbrId");
            return (Criteria) this;
        }

        public Criteria andMbrIdLessThanOrEqualTo(String value) {
            addCriterion("TOCH.MBR_ID <=", value, "mbrId");
            return (Criteria) this;
        }

        public Criteria andMbrIdLike(String value) {
            addCriterion("TOCH.MBR_ID like", value, "mbrId");
            return (Criteria) this;
        }

        public Criteria andMbrIdNotLike(String value) {
            addCriterion("TOCH.MBR_ID not like", value, "mbrId");
            return (Criteria) this;
        }

        public Criteria andMbrIdIn(List<String> values) {
            addCriterion("TOCH.MBR_ID in", values, "mbrId");
            return (Criteria) this;
        }

        public Criteria andMbrIdNotIn(List<String> values) {
            addCriterion("TOCH.MBR_ID not in", values, "mbrId");
            return (Criteria) this;
        }

        public Criteria andMbrIdBetween(String value1, String value2) {
            addCriterion("TOCH.MBR_ID between", value1, value2, "mbrId");
            return (Criteria) this;
        }

        public Criteria andMbrIdNotBetween(String value1, String value2) {
            addCriterion("TOCH.MBR_ID not between", value1, value2, "mbrId");
            return (Criteria) this;
        }

        public Criteria andMbrGrdCdIsNull() {
            addCriterion("TOCH.MBR_GRD_CD is null");
            return (Criteria) this;
        }

        public Criteria andMbrGrdCdIsNotNull() {
            addCriterion("TOCH.MBR_GRD_CD is not null");
            return (Criteria) this;
        }

        public Criteria andMbrGrdCdEqualTo(String value) {
            addCriterion("TOCH.MBR_GRD_CD =", value, "mbrGrdCd");
            return (Criteria) this;
        }

        public Criteria andMbrGrdCdNotEqualTo(String value) {
            addCriterion("TOCH.MBR_GRD_CD <>", value, "mbrGrdCd");
            return (Criteria) this;
        }

        public Criteria andMbrGrdCdGreaterThan(String value) {
            addCriterion("TOCH.MBR_GRD_CD >", value, "mbrGrdCd");
            return (Criteria) this;
        }

        public Criteria andMbrGrdCdGreaterThanOrEqualTo(String value) {
            addCriterion("TOCH.MBR_GRD_CD >=", value, "mbrGrdCd");
            return (Criteria) this;
        }

        public Criteria andMbrGrdCdLessThan(String value) {
            addCriterion("TOCH.MBR_GRD_CD <", value, "mbrGrdCd");
            return (Criteria) this;
        }

        public Criteria andMbrGrdCdLessThanOrEqualTo(String value) {
            addCriterion("TOCH.MBR_GRD_CD <=", value, "mbrGrdCd");
            return (Criteria) this;
        }

        public Criteria andMbrGrdCdLike(String value) {
            addCriterion("TOCH.MBR_GRD_CD like", value, "mbrGrdCd");
            return (Criteria) this;
        }

        public Criteria andMbrGrdCdNotLike(String value) {
            addCriterion("TOCH.MBR_GRD_CD not like", value, "mbrGrdCd");
            return (Criteria) this;
        }

        public Criteria andMbrGrdCdIn(List<String> values) {
            addCriterion("TOCH.MBR_GRD_CD in", values, "mbrGrdCd");
            return (Criteria) this;
        }

        public Criteria andMbrGrdCdNotIn(List<String> values) {
            addCriterion("TOCH.MBR_GRD_CD not in", values, "mbrGrdCd");
            return (Criteria) this;
        }

        public Criteria andMbrGrdCdBetween(String value1, String value2) {
            addCriterion("TOCH.MBR_GRD_CD between", value1, value2, "mbrGrdCd");
            return (Criteria) this;
        }

        public Criteria andMbrGrdCdNotBetween(String value1, String value2) {
            addCriterion("TOCH.MBR_GRD_CD not between", value1, value2, "mbrGrdCd");
            return (Criteria) this;
        }

        public Criteria andMbrPtSaveRateIsNull() {
            addCriterion("TOCH.MBR_PT_SAVE_RATE is null");
            return (Criteria) this;
        }

        public Criteria andMbrPtSaveRateIsNotNull() {
            addCriterion("TOCH.MBR_PT_SAVE_RATE is not null");
            return (Criteria) this;
        }

        public Criteria andMbrPtSaveRateEqualTo(BigDecimal value) {
            addCriterion("TOCH.MBR_PT_SAVE_RATE =", value, "mbrPtSaveRate");
            return (Criteria) this;
        }

        public Criteria andMbrPtSaveRateNotEqualTo(BigDecimal value) {
            addCriterion("TOCH.MBR_PT_SAVE_RATE <>", value, "mbrPtSaveRate");
            return (Criteria) this;
        }

        public Criteria andMbrPtSaveRateGreaterThan(BigDecimal value) {
            addCriterion("TOCH.MBR_PT_SAVE_RATE >", value, "mbrPtSaveRate");
            return (Criteria) this;
        }

        public Criteria andMbrPtSaveRateGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("TOCH.MBR_PT_SAVE_RATE >=", value, "mbrPtSaveRate");
            return (Criteria) this;
        }

        public Criteria andMbrPtSaveRateLessThan(BigDecimal value) {
            addCriterion("TOCH.MBR_PT_SAVE_RATE <", value, "mbrPtSaveRate");
            return (Criteria) this;
        }

        public Criteria andMbrPtSaveRateLessThanOrEqualTo(BigDecimal value) {
            addCriterion("TOCH.MBR_PT_SAVE_RATE <=", value, "mbrPtSaveRate");
            return (Criteria) this;
        }

        public Criteria andMbrPtSaveRateIn(List<BigDecimal> values) {
            addCriterion("TOCH.MBR_PT_SAVE_RATE in", values, "mbrPtSaveRate");
            return (Criteria) this;
        }

        public Criteria andMbrPtSaveRateNotIn(List<BigDecimal> values) {
            addCriterion("TOCH.MBR_PT_SAVE_RATE not in", values, "mbrPtSaveRate");
            return (Criteria) this;
        }

        public Criteria andMbrPtSaveRateBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TOCH.MBR_PT_SAVE_RATE between", value1, value2, "mbrPtSaveRate");
            return (Criteria) this;
        }

        public Criteria andMbrPtSaveRateNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TOCH.MBR_PT_SAVE_RATE not between", value1, value2, "mbrPtSaveRate");
            return (Criteria) this;
        }

        public Criteria andBuyrNmIsNull() {
            addCriterion("TOCH.BUYR_NM is null");
            return (Criteria) this;
        }

        public Criteria andBuyrNmIsNotNull() {
            addCriterion("TOCH.BUYR_NM is not null");
            return (Criteria) this;
        }

        public Criteria andBuyrNmEqualTo(String value) {
            addCriterion("TOCH.BUYR_NM =", value, "buyrNm");
            return (Criteria) this;
        }

        public Criteria andBuyrNmNotEqualTo(String value) {
            addCriterion("TOCH.BUYR_NM <>", value, "buyrNm");
            return (Criteria) this;
        }

        public Criteria andBuyrNmGreaterThan(String value) {
            addCriterion("TOCH.BUYR_NM >", value, "buyrNm");
            return (Criteria) this;
        }

        public Criteria andBuyrNmGreaterThanOrEqualTo(String value) {
            addCriterion("TOCH.BUYR_NM >=", value, "buyrNm");
            return (Criteria) this;
        }

        public Criteria andBuyrNmLessThan(String value) {
            addCriterion("TOCH.BUYR_NM <", value, "buyrNm");
            return (Criteria) this;
        }

        public Criteria andBuyrNmLessThanOrEqualTo(String value) {
            addCriterion("TOCH.BUYR_NM <=", value, "buyrNm");
            return (Criteria) this;
        }

        public Criteria andBuyrNmLike(String value) {
            addCriterion("TOCH.BUYR_NM like", value, "buyrNm");
            return (Criteria) this;
        }

        public Criteria andBuyrNmNotLike(String value) {
            addCriterion("TOCH.BUYR_NM not like", value, "buyrNm");
            return (Criteria) this;
        }

        public Criteria andBuyrNmIn(List<String> values) {
            addCriterion("TOCH.BUYR_NM in", values, "buyrNm");
            return (Criteria) this;
        }

        public Criteria andBuyrNmNotIn(List<String> values) {
            addCriterion("TOCH.BUYR_NM not in", values, "buyrNm");
            return (Criteria) this;
        }

        public Criteria andBuyrNmBetween(String value1, String value2) {
            addCriterion("TOCH.BUYR_NM between", value1, value2, "buyrNm");
            return (Criteria) this;
        }

        public Criteria andBuyrNmNotBetween(String value1, String value2) {
            addCriterion("TOCH.BUYR_NM not between", value1, value2, "buyrNm");
            return (Criteria) this;
        }

        public Criteria andBuyrCpNoIsNull() {
            addCriterion("TOCH.BUYR_CP_NO is null");
            return (Criteria) this;
        }

        public Criteria andBuyrCpNoIsNotNull() {
            addCriterion("TOCH.BUYR_CP_NO is not null");
            return (Criteria) this;
        }

        public Criteria andBuyrCpNoEqualTo(String value) {
            addCriterion("TOCH.BUYR_CP_NO =", value, "buyrCpNo");
            return (Criteria) this;
        }

        public Criteria andBuyrCpNoNotEqualTo(String value) {
            addCriterion("TOCH.BUYR_CP_NO <>", value, "buyrCpNo");
            return (Criteria) this;
        }

        public Criteria andBuyrCpNoGreaterThan(String value) {
            addCriterion("TOCH.BUYR_CP_NO >", value, "buyrCpNo");
            return (Criteria) this;
        }

        public Criteria andBuyrCpNoGreaterThanOrEqualTo(String value) {
            addCriterion("TOCH.BUYR_CP_NO >=", value, "buyrCpNo");
            return (Criteria) this;
        }

        public Criteria andBuyrCpNoLessThan(String value) {
            addCriterion("TOCH.BUYR_CP_NO <", value, "buyrCpNo");
            return (Criteria) this;
        }

        public Criteria andBuyrCpNoLessThanOrEqualTo(String value) {
            addCriterion("TOCH.BUYR_CP_NO <=", value, "buyrCpNo");
            return (Criteria) this;
        }

        public Criteria andBuyrCpNoLike(String value) {
            addCriterion("TOCH.BUYR_CP_NO like", value, "buyrCpNo");
            return (Criteria) this;
        }

        public Criteria andBuyrCpNoNotLike(String value) {
            addCriterion("TOCH.BUYR_CP_NO not like", value, "buyrCpNo");
            return (Criteria) this;
        }

        public Criteria andBuyrCpNoIn(List<String> values) {
            addCriterion("TOCH.BUYR_CP_NO in", values, "buyrCpNo");
            return (Criteria) this;
        }

        public Criteria andBuyrCpNoNotIn(List<String> values) {
            addCriterion("TOCH.BUYR_CP_NO not in", values, "buyrCpNo");
            return (Criteria) this;
        }

        public Criteria andBuyrCpNoBetween(String value1, String value2) {
            addCriterion("TOCH.BUYR_CP_NO between", value1, value2, "buyrCpNo");
            return (Criteria) this;
        }

        public Criteria andBuyrCpNoNotBetween(String value1, String value2) {
            addCriterion("TOCH.BUYR_CP_NO not between", value1, value2, "buyrCpNo");
            return (Criteria) this;
        }

        public Criteria andBuyrTelNoIsNull() {
            addCriterion("TOCH.BUYR_TEL_NO is null");
            return (Criteria) this;
        }

        public Criteria andBuyrTelNoIsNotNull() {
            addCriterion("TOCH.BUYR_TEL_NO is not null");
            return (Criteria) this;
        }

        public Criteria andBuyrTelNoEqualTo(String value) {
            addCriterion("TOCH.BUYR_TEL_NO =", value, "buyrTelNo");
            return (Criteria) this;
        }

        public Criteria andBuyrTelNoNotEqualTo(String value) {
            addCriterion("TOCH.BUYR_TEL_NO <>", value, "buyrTelNo");
            return (Criteria) this;
        }

        public Criteria andBuyrTelNoGreaterThan(String value) {
            addCriterion("TOCH.BUYR_TEL_NO >", value, "buyrTelNo");
            return (Criteria) this;
        }

        public Criteria andBuyrTelNoGreaterThanOrEqualTo(String value) {
            addCriterion("TOCH.BUYR_TEL_NO >=", value, "buyrTelNo");
            return (Criteria) this;
        }

        public Criteria andBuyrTelNoLessThan(String value) {
            addCriterion("TOCH.BUYR_TEL_NO <", value, "buyrTelNo");
            return (Criteria) this;
        }

        public Criteria andBuyrTelNoLessThanOrEqualTo(String value) {
            addCriterion("TOCH.BUYR_TEL_NO <=", value, "buyrTelNo");
            return (Criteria) this;
        }

        public Criteria andBuyrTelNoLike(String value) {
            addCriterion("TOCH.BUYR_TEL_NO like", value, "buyrTelNo");
            return (Criteria) this;
        }

        public Criteria andBuyrTelNoNotLike(String value) {
            addCriterion("TOCH.BUYR_TEL_NO not like", value, "buyrTelNo");
            return (Criteria) this;
        }

        public Criteria andBuyrTelNoIn(List<String> values) {
            addCriterion("TOCH.BUYR_TEL_NO in", values, "buyrTelNo");
            return (Criteria) this;
        }

        public Criteria andBuyrTelNoNotIn(List<String> values) {
            addCriterion("TOCH.BUYR_TEL_NO not in", values, "buyrTelNo");
            return (Criteria) this;
        }

        public Criteria andBuyrTelNoBetween(String value1, String value2) {
            addCriterion("TOCH.BUYR_TEL_NO between", value1, value2, "buyrTelNo");
            return (Criteria) this;
        }

        public Criteria andBuyrTelNoNotBetween(String value1, String value2) {
            addCriterion("TOCH.BUYR_TEL_NO not between", value1, value2, "buyrTelNo");
            return (Criteria) this;
        }

        public Criteria andBuyrEmailIsNull() {
            addCriterion("TOCH.BUYR_EMAIL is null");
            return (Criteria) this;
        }

        public Criteria andBuyrEmailIsNotNull() {
            addCriterion("TOCH.BUYR_EMAIL is not null");
            return (Criteria) this;
        }

        public Criteria andBuyrEmailEqualTo(String value) {
            addCriterion("TOCH.BUYR_EMAIL =", value, "buyrEmail");
            return (Criteria) this;
        }

        public Criteria andBuyrEmailNotEqualTo(String value) {
            addCriterion("TOCH.BUYR_EMAIL <>", value, "buyrEmail");
            return (Criteria) this;
        }

        public Criteria andBuyrEmailGreaterThan(String value) {
            addCriterion("TOCH.BUYR_EMAIL >", value, "buyrEmail");
            return (Criteria) this;
        }

        public Criteria andBuyrEmailGreaterThanOrEqualTo(String value) {
            addCriterion("TOCH.BUYR_EMAIL >=", value, "buyrEmail");
            return (Criteria) this;
        }

        public Criteria andBuyrEmailLessThan(String value) {
            addCriterion("TOCH.BUYR_EMAIL <", value, "buyrEmail");
            return (Criteria) this;
        }

        public Criteria andBuyrEmailLessThanOrEqualTo(String value) {
            addCriterion("TOCH.BUYR_EMAIL <=", value, "buyrEmail");
            return (Criteria) this;
        }

        public Criteria andBuyrEmailLike(String value) {
            addCriterion("TOCH.BUYR_EMAIL like", value, "buyrEmail");
            return (Criteria) this;
        }

        public Criteria andBuyrEmailNotLike(String value) {
            addCriterion("TOCH.BUYR_EMAIL not like", value, "buyrEmail");
            return (Criteria) this;
        }

        public Criteria andBuyrEmailIn(List<String> values) {
            addCriterion("TOCH.BUYR_EMAIL in", values, "buyrEmail");
            return (Criteria) this;
        }

        public Criteria andBuyrEmailNotIn(List<String> values) {
            addCriterion("TOCH.BUYR_EMAIL not in", values, "buyrEmail");
            return (Criteria) this;
        }

        public Criteria andBuyrEmailBetween(String value1, String value2) {
            addCriterion("TOCH.BUYR_EMAIL between", value1, value2, "buyrEmail");
            return (Criteria) this;
        }

        public Criteria andBuyrEmailNotBetween(String value1, String value2) {
            addCriterion("TOCH.BUYR_EMAIL not between", value1, value2, "buyrEmail");
            return (Criteria) this;
        }

        public Criteria andBuyrIpAddrIsNull() {
            addCriterion("TOCH.BUYR_IP_ADDR is null");
            return (Criteria) this;
        }

        public Criteria andBuyrIpAddrIsNotNull() {
            addCriterion("TOCH.BUYR_IP_ADDR is not null");
            return (Criteria) this;
        }

        public Criteria andBuyrIpAddrEqualTo(String value) {
            addCriterion("TOCH.BUYR_IP_ADDR =", value, "buyrIpAddr");
            return (Criteria) this;
        }

        public Criteria andBuyrIpAddrNotEqualTo(String value) {
            addCriterion("TOCH.BUYR_IP_ADDR <>", value, "buyrIpAddr");
            return (Criteria) this;
        }

        public Criteria andBuyrIpAddrGreaterThan(String value) {
            addCriterion("TOCH.BUYR_IP_ADDR >", value, "buyrIpAddr");
            return (Criteria) this;
        }

        public Criteria andBuyrIpAddrGreaterThanOrEqualTo(String value) {
            addCriterion("TOCH.BUYR_IP_ADDR >=", value, "buyrIpAddr");
            return (Criteria) this;
        }

        public Criteria andBuyrIpAddrLessThan(String value) {
            addCriterion("TOCH.BUYR_IP_ADDR <", value, "buyrIpAddr");
            return (Criteria) this;
        }

        public Criteria andBuyrIpAddrLessThanOrEqualTo(String value) {
            addCriterion("TOCH.BUYR_IP_ADDR <=", value, "buyrIpAddr");
            return (Criteria) this;
        }

        public Criteria andBuyrIpAddrLike(String value) {
            addCriterion("TOCH.BUYR_IP_ADDR like", value, "buyrIpAddr");
            return (Criteria) this;
        }

        public Criteria andBuyrIpAddrNotLike(String value) {
            addCriterion("TOCH.BUYR_IP_ADDR not like", value, "buyrIpAddr");
            return (Criteria) this;
        }

        public Criteria andBuyrIpAddrIn(List<String> values) {
            addCriterion("TOCH.BUYR_IP_ADDR in", values, "buyrIpAddr");
            return (Criteria) this;
        }

        public Criteria andBuyrIpAddrNotIn(List<String> values) {
            addCriterion("TOCH.BUYR_IP_ADDR not in", values, "buyrIpAddr");
            return (Criteria) this;
        }

        public Criteria andBuyrIpAddrBetween(String value1, String value2) {
            addCriterion("TOCH.BUYR_IP_ADDR between", value1, value2, "buyrIpAddr");
            return (Criteria) this;
        }

        public Criteria andBuyrIpAddrNotBetween(String value1, String value2) {
            addCriterion("TOCH.BUYR_IP_ADDR not between", value1, value2, "buyrIpAddr");
            return (Criteria) this;
        }

        public Criteria andBuyrOrdAgrYnIsNull() {
            addCriterion("TOCH.BUYR_ORD_AGR_YN is null");
            return (Criteria) this;
        }

        public Criteria andBuyrOrdAgrYnIsNotNull() {
            addCriterion("TOCH.BUYR_ORD_AGR_YN is not null");
            return (Criteria) this;
        }

        public Criteria andBuyrOrdAgrYnEqualTo(String value) {
            addCriterion("TOCH.BUYR_ORD_AGR_YN =", value, "buyrOrdAgrYn");
            return (Criteria) this;
        }

        public Criteria andBuyrOrdAgrYnNotEqualTo(String value) {
            addCriterion("TOCH.BUYR_ORD_AGR_YN <>", value, "buyrOrdAgrYn");
            return (Criteria) this;
        }

        public Criteria andBuyrOrdAgrYnGreaterThan(String value) {
            addCriterion("TOCH.BUYR_ORD_AGR_YN >", value, "buyrOrdAgrYn");
            return (Criteria) this;
        }

        public Criteria andBuyrOrdAgrYnGreaterThanOrEqualTo(String value) {
            addCriterion("TOCH.BUYR_ORD_AGR_YN >=", value, "buyrOrdAgrYn");
            return (Criteria) this;
        }

        public Criteria andBuyrOrdAgrYnLessThan(String value) {
            addCriterion("TOCH.BUYR_ORD_AGR_YN <", value, "buyrOrdAgrYn");
            return (Criteria) this;
        }

        public Criteria andBuyrOrdAgrYnLessThanOrEqualTo(String value) {
            addCriterion("TOCH.BUYR_ORD_AGR_YN <=", value, "buyrOrdAgrYn");
            return (Criteria) this;
        }

        public Criteria andBuyrOrdAgrYnLike(String value) {
            addCriterion("TOCH.BUYR_ORD_AGR_YN like", value, "buyrOrdAgrYn");
            return (Criteria) this;
        }

        public Criteria andBuyrOrdAgrYnNotLike(String value) {
            addCriterion("TOCH.BUYR_ORD_AGR_YN not like", value, "buyrOrdAgrYn");
            return (Criteria) this;
        }

        public Criteria andBuyrOrdAgrYnIn(List<String> values) {
            addCriterion("TOCH.BUYR_ORD_AGR_YN in", values, "buyrOrdAgrYn");
            return (Criteria) this;
        }

        public Criteria andBuyrOrdAgrYnNotIn(List<String> values) {
            addCriterion("TOCH.BUYR_ORD_AGR_YN not in", values, "buyrOrdAgrYn");
            return (Criteria) this;
        }

        public Criteria andBuyrOrdAgrYnBetween(String value1, String value2) {
            addCriterion("TOCH.BUYR_ORD_AGR_YN between", value1, value2, "buyrOrdAgrYn");
            return (Criteria) this;
        }

        public Criteria andBuyrOrdAgrYnNotBetween(String value1, String value2) {
            addCriterion("TOCH.BUYR_ORD_AGR_YN not between", value1, value2, "buyrOrdAgrYn");
            return (Criteria) this;
        }

        public Criteria andBuyrOrdAgrDtIsNull() {
            addCriterion("TOCH.BUYR_ORD_AGR_DT is null");
            return (Criteria) this;
        }

        public Criteria andBuyrOrdAgrDtIsNotNull() {
            addCriterion("TOCH.BUYR_ORD_AGR_DT is not null");
            return (Criteria) this;
        }

        public Criteria andBuyrOrdAgrDtEqualTo(Date value) {
            addCriterionForJDBCDate("TOCH.BUYR_ORD_AGR_DT =", value, "buyrOrdAgrDt");
            return (Criteria) this;
        }

        public Criteria andBuyrOrdAgrDtNotEqualTo(Date value) {
            addCriterionForJDBCDate("TOCH.BUYR_ORD_AGR_DT <>", value, "buyrOrdAgrDt");
            return (Criteria) this;
        }

        public Criteria andBuyrOrdAgrDtGreaterThan(Date value) {
            addCriterionForJDBCDate("TOCH.BUYR_ORD_AGR_DT >", value, "buyrOrdAgrDt");
            return (Criteria) this;
        }

        public Criteria andBuyrOrdAgrDtGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("TOCH.BUYR_ORD_AGR_DT >=", value, "buyrOrdAgrDt");
            return (Criteria) this;
        }

        public Criteria andBuyrOrdAgrDtLessThan(Date value) {
            addCriterionForJDBCDate("TOCH.BUYR_ORD_AGR_DT <", value, "buyrOrdAgrDt");
            return (Criteria) this;
        }

        public Criteria andBuyrOrdAgrDtLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("TOCH.BUYR_ORD_AGR_DT <=", value, "buyrOrdAgrDt");
            return (Criteria) this;
        }

        public Criteria andBuyrOrdAgrDtIn(List<Date> values) {
            addCriterionForJDBCDate("TOCH.BUYR_ORD_AGR_DT in", values, "buyrOrdAgrDt");
            return (Criteria) this;
        }

        public Criteria andBuyrOrdAgrDtNotIn(List<Date> values) {
            addCriterionForJDBCDate("TOCH.BUYR_ORD_AGR_DT not in", values, "buyrOrdAgrDt");
            return (Criteria) this;
        }

        public Criteria andBuyrOrdAgrDtBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("TOCH.BUYR_ORD_AGR_DT between", value1, value2, "buyrOrdAgrDt");
            return (Criteria) this;
        }

        public Criteria andBuyrOrdAgrDtNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("TOCH.BUYR_ORD_AGR_DT not between", value1, value2, "buyrOrdAgrDt");
            return (Criteria) this;
        }

        public Criteria andFstPayMthdIsNull() {
            addCriterion("TOCH.FST_PAY_MTHD is null");
            return (Criteria) this;
        }

        public Criteria andFstPayMthdIsNotNull() {
            addCriterion("TOCH.FST_PAY_MTHD is not null");
            return (Criteria) this;
        }

        public Criteria andFstPayMthdEqualTo(String value) {
            addCriterion("TOCH.FST_PAY_MTHD =", value, "fstPayMthd");
            return (Criteria) this;
        }

        public Criteria andFstPayMthdNotEqualTo(String value) {
            addCriterion("TOCH.FST_PAY_MTHD <>", value, "fstPayMthd");
            return (Criteria) this;
        }

        public Criteria andFstPayMthdGreaterThan(String value) {
            addCriterion("TOCH.FST_PAY_MTHD >", value, "fstPayMthd");
            return (Criteria) this;
        }

        public Criteria andFstPayMthdGreaterThanOrEqualTo(String value) {
            addCriterion("TOCH.FST_PAY_MTHD >=", value, "fstPayMthd");
            return (Criteria) this;
        }

        public Criteria andFstPayMthdLessThan(String value) {
            addCriterion("TOCH.FST_PAY_MTHD <", value, "fstPayMthd");
            return (Criteria) this;
        }

        public Criteria andFstPayMthdLessThanOrEqualTo(String value) {
            addCriterion("TOCH.FST_PAY_MTHD <=", value, "fstPayMthd");
            return (Criteria) this;
        }

        public Criteria andFstPayMthdLike(String value) {
            addCriterion("TOCH.FST_PAY_MTHD like", value, "fstPayMthd");
            return (Criteria) this;
        }

        public Criteria andFstPayMthdNotLike(String value) {
            addCriterion("TOCH.FST_PAY_MTHD not like", value, "fstPayMthd");
            return (Criteria) this;
        }

        public Criteria andFstPayMthdIn(List<String> values) {
            addCriterion("TOCH.FST_PAY_MTHD in", values, "fstPayMthd");
            return (Criteria) this;
        }

        public Criteria andFstPayMthdNotIn(List<String> values) {
            addCriterion("TOCH.FST_PAY_MTHD not in", values, "fstPayMthd");
            return (Criteria) this;
        }

        public Criteria andFstPayMthdBetween(String value1, String value2) {
            addCriterion("TOCH.FST_PAY_MTHD between", value1, value2, "fstPayMthd");
            return (Criteria) this;
        }

        public Criteria andFstPayMthdNotBetween(String value1, String value2) {
            addCriterion("TOCH.FST_PAY_MTHD not between", value1, value2, "fstPayMthd");
            return (Criteria) this;
        }

        public Criteria andFstOrdAmtIsNull() {
            addCriterion("TOCH.FST_ORD_AMT is null");
            return (Criteria) this;
        }

        public Criteria andFstOrdAmtIsNotNull() {
            addCriterion("TOCH.FST_ORD_AMT is not null");
            return (Criteria) this;
        }

        public Criteria andFstOrdAmtEqualTo(Integer value) {
            addCriterion("TOCH.FST_ORD_AMT =", value, "fstOrdAmt");
            return (Criteria) this;
        }

        public Criteria andFstOrdAmtNotEqualTo(Integer value) {
            addCriterion("TOCH.FST_ORD_AMT <>", value, "fstOrdAmt");
            return (Criteria) this;
        }

        public Criteria andFstOrdAmtGreaterThan(Integer value) {
            addCriterion("TOCH.FST_ORD_AMT >", value, "fstOrdAmt");
            return (Criteria) this;
        }

        public Criteria andFstOrdAmtGreaterThanOrEqualTo(Integer value) {
            addCriterion("TOCH.FST_ORD_AMT >=", value, "fstOrdAmt");
            return (Criteria) this;
        }

        public Criteria andFstOrdAmtLessThan(Integer value) {
            addCriterion("TOCH.FST_ORD_AMT <", value, "fstOrdAmt");
            return (Criteria) this;
        }

        public Criteria andFstOrdAmtLessThanOrEqualTo(Integer value) {
            addCriterion("TOCH.FST_ORD_AMT <=", value, "fstOrdAmt");
            return (Criteria) this;
        }

        public Criteria andFstOrdAmtIn(List<Integer> values) {
            addCriterion("TOCH.FST_ORD_AMT in", values, "fstOrdAmt");
            return (Criteria) this;
        }

        public Criteria andFstOrdAmtNotIn(List<Integer> values) {
            addCriterion("TOCH.FST_ORD_AMT not in", values, "fstOrdAmt");
            return (Criteria) this;
        }

        public Criteria andFstOrdAmtBetween(Integer value1, Integer value2) {
            addCriterion("TOCH.FST_ORD_AMT between", value1, value2, "fstOrdAmt");
            return (Criteria) this;
        }

        public Criteria andFstOrdAmtNotBetween(Integer value1, Integer value2) {
            addCriterion("TOCH.FST_ORD_AMT not between", value1, value2, "fstOrdAmt");
            return (Criteria) this;
        }

        public Criteria andFstCpnDcAmtIsNull() {
            addCriterion("TOCH.FST_CPN_DC_AMT is null");
            return (Criteria) this;
        }

        public Criteria andFstCpnDcAmtIsNotNull() {
            addCriterion("TOCH.FST_CPN_DC_AMT is not null");
            return (Criteria) this;
        }

        public Criteria andFstCpnDcAmtEqualTo(Integer value) {
            addCriterion("TOCH.FST_CPN_DC_AMT =", value, "fstCpnDcAmt");
            return (Criteria) this;
        }

        public Criteria andFstCpnDcAmtNotEqualTo(Integer value) {
            addCriterion("TOCH.FST_CPN_DC_AMT <>", value, "fstCpnDcAmt");
            return (Criteria) this;
        }

        public Criteria andFstCpnDcAmtGreaterThan(Integer value) {
            addCriterion("TOCH.FST_CPN_DC_AMT >", value, "fstCpnDcAmt");
            return (Criteria) this;
        }

        public Criteria andFstCpnDcAmtGreaterThanOrEqualTo(Integer value) {
            addCriterion("TOCH.FST_CPN_DC_AMT >=", value, "fstCpnDcAmt");
            return (Criteria) this;
        }

        public Criteria andFstCpnDcAmtLessThan(Integer value) {
            addCriterion("TOCH.FST_CPN_DC_AMT <", value, "fstCpnDcAmt");
            return (Criteria) this;
        }

        public Criteria andFstCpnDcAmtLessThanOrEqualTo(Integer value) {
            addCriterion("TOCH.FST_CPN_DC_AMT <=", value, "fstCpnDcAmt");
            return (Criteria) this;
        }

        public Criteria andFstCpnDcAmtIn(List<Integer> values) {
            addCriterion("TOCH.FST_CPN_DC_AMT in", values, "fstCpnDcAmt");
            return (Criteria) this;
        }

        public Criteria andFstCpnDcAmtNotIn(List<Integer> values) {
            addCriterion("TOCH.FST_CPN_DC_AMT not in", values, "fstCpnDcAmt");
            return (Criteria) this;
        }

        public Criteria andFstCpnDcAmtBetween(Integer value1, Integer value2) {
            addCriterion("TOCH.FST_CPN_DC_AMT between", value1, value2, "fstCpnDcAmt");
            return (Criteria) this;
        }

        public Criteria andFstCpnDcAmtNotBetween(Integer value1, Integer value2) {
            addCriterion("TOCH.FST_CPN_DC_AMT not between", value1, value2, "fstCpnDcAmt");
            return (Criteria) this;
        }

        public Criteria andFstPtUseAmtIsNull() {
            addCriterion("TOCH.FST_PT_USE_AMT is null");
            return (Criteria) this;
        }

        public Criteria andFstPtUseAmtIsNotNull() {
            addCriterion("TOCH.FST_PT_USE_AMT is not null");
            return (Criteria) this;
        }

        public Criteria andFstPtUseAmtEqualTo(Integer value) {
            addCriterion("TOCH.FST_PT_USE_AMT =", value, "fstPtUseAmt");
            return (Criteria) this;
        }

        public Criteria andFstPtUseAmtNotEqualTo(Integer value) {
            addCriterion("TOCH.FST_PT_USE_AMT <>", value, "fstPtUseAmt");
            return (Criteria) this;
        }

        public Criteria andFstPtUseAmtGreaterThan(Integer value) {
            addCriterion("TOCH.FST_PT_USE_AMT >", value, "fstPtUseAmt");
            return (Criteria) this;
        }

        public Criteria andFstPtUseAmtGreaterThanOrEqualTo(Integer value) {
            addCriterion("TOCH.FST_PT_USE_AMT >=", value, "fstPtUseAmt");
            return (Criteria) this;
        }

        public Criteria andFstPtUseAmtLessThan(Integer value) {
            addCriterion("TOCH.FST_PT_USE_AMT <", value, "fstPtUseAmt");
            return (Criteria) this;
        }

        public Criteria andFstPtUseAmtLessThanOrEqualTo(Integer value) {
            addCriterion("TOCH.FST_PT_USE_AMT <=", value, "fstPtUseAmt");
            return (Criteria) this;
        }

        public Criteria andFstPtUseAmtIn(List<Integer> values) {
            addCriterion("TOCH.FST_PT_USE_AMT in", values, "fstPtUseAmt");
            return (Criteria) this;
        }

        public Criteria andFstPtUseAmtNotIn(List<Integer> values) {
            addCriterion("TOCH.FST_PT_USE_AMT not in", values, "fstPtUseAmt");
            return (Criteria) this;
        }

        public Criteria andFstPtUseAmtBetween(Integer value1, Integer value2) {
            addCriterion("TOCH.FST_PT_USE_AMT between", value1, value2, "fstPtUseAmt");
            return (Criteria) this;
        }

        public Criteria andFstPtUseAmtNotBetween(Integer value1, Integer value2) {
            addCriterion("TOCH.FST_PT_USE_AMT not between", value1, value2, "fstPtUseAmt");
            return (Criteria) this;
        }

        public Criteria andFstRealOrdAmtIsNull() {
            addCriterion("TOCH.FST_REAL_ORD_AMT is null");
            return (Criteria) this;
        }

        public Criteria andFstRealOrdAmtIsNotNull() {
            addCriterion("TOCH.FST_REAL_ORD_AMT is not null");
            return (Criteria) this;
        }

        public Criteria andFstRealOrdAmtEqualTo(Integer value) {
            addCriterion("TOCH.FST_REAL_ORD_AMT =", value, "fstRealOrdAmt");
            return (Criteria) this;
        }

        public Criteria andFstRealOrdAmtNotEqualTo(Integer value) {
            addCriterion("TOCH.FST_REAL_ORD_AMT <>", value, "fstRealOrdAmt");
            return (Criteria) this;
        }

        public Criteria andFstRealOrdAmtGreaterThan(Integer value) {
            addCriterion("TOCH.FST_REAL_ORD_AMT >", value, "fstRealOrdAmt");
            return (Criteria) this;
        }

        public Criteria andFstRealOrdAmtGreaterThanOrEqualTo(Integer value) {
            addCriterion("TOCH.FST_REAL_ORD_AMT >=", value, "fstRealOrdAmt");
            return (Criteria) this;
        }

        public Criteria andFstRealOrdAmtLessThan(Integer value) {
            addCriterion("TOCH.FST_REAL_ORD_AMT <", value, "fstRealOrdAmt");
            return (Criteria) this;
        }

        public Criteria andFstRealOrdAmtLessThanOrEqualTo(Integer value) {
            addCriterion("TOCH.FST_REAL_ORD_AMT <=", value, "fstRealOrdAmt");
            return (Criteria) this;
        }

        public Criteria andFstRealOrdAmtIn(List<Integer> values) {
            addCriterion("TOCH.FST_REAL_ORD_AMT in", values, "fstRealOrdAmt");
            return (Criteria) this;
        }

        public Criteria andFstRealOrdAmtNotIn(List<Integer> values) {
            addCriterion("TOCH.FST_REAL_ORD_AMT not in", values, "fstRealOrdAmt");
            return (Criteria) this;
        }

        public Criteria andFstRealOrdAmtBetween(Integer value1, Integer value2) {
            addCriterion("TOCH.FST_REAL_ORD_AMT between", value1, value2, "fstRealOrdAmt");
            return (Criteria) this;
        }

        public Criteria andFstRealOrdAmtNotBetween(Integer value1, Integer value2) {
            addCriterion("TOCH.FST_REAL_ORD_AMT not between", value1, value2, "fstRealOrdAmt");
            return (Criteria) this;
        }

        public Criteria andFstRealPayAmtIsNull() {
            addCriterion("TOCH.FST_REAL_PAY_AMT is null");
            return (Criteria) this;
        }

        public Criteria andFstRealPayAmtIsNotNull() {
            addCriterion("TOCH.FST_REAL_PAY_AMT is not null");
            return (Criteria) this;
        }

        public Criteria andFstRealPayAmtEqualTo(Integer value) {
            addCriterion("TOCH.FST_REAL_PAY_AMT =", value, "fstRealPayAmt");
            return (Criteria) this;
        }

        public Criteria andFstRealPayAmtNotEqualTo(Integer value) {
            addCriterion("TOCH.FST_REAL_PAY_AMT <>", value, "fstRealPayAmt");
            return (Criteria) this;
        }

        public Criteria andFstRealPayAmtGreaterThan(Integer value) {
            addCriterion("TOCH.FST_REAL_PAY_AMT >", value, "fstRealPayAmt");
            return (Criteria) this;
        }

        public Criteria andFstRealPayAmtGreaterThanOrEqualTo(Integer value) {
            addCriterion("TOCH.FST_REAL_PAY_AMT >=", value, "fstRealPayAmt");
            return (Criteria) this;
        }

        public Criteria andFstRealPayAmtLessThan(Integer value) {
            addCriterion("TOCH.FST_REAL_PAY_AMT <", value, "fstRealPayAmt");
            return (Criteria) this;
        }

        public Criteria andFstRealPayAmtLessThanOrEqualTo(Integer value) {
            addCriterion("TOCH.FST_REAL_PAY_AMT <=", value, "fstRealPayAmt");
            return (Criteria) this;
        }

        public Criteria andFstRealPayAmtIn(List<Integer> values) {
            addCriterion("TOCH.FST_REAL_PAY_AMT in", values, "fstRealPayAmt");
            return (Criteria) this;
        }

        public Criteria andFstRealPayAmtNotIn(List<Integer> values) {
            addCriterion("TOCH.FST_REAL_PAY_AMT not in", values, "fstRealPayAmt");
            return (Criteria) this;
        }

        public Criteria andFstRealPayAmtBetween(Integer value1, Integer value2) {
            addCriterion("TOCH.FST_REAL_PAY_AMT between", value1, value2, "fstRealPayAmt");
            return (Criteria) this;
        }

        public Criteria andFstRealPayAmtNotBetween(Integer value1, Integer value2) {
            addCriterion("TOCH.FST_REAL_PAY_AMT not between", value1, value2, "fstRealPayAmt");
            return (Criteria) this;
        }

        public Criteria andPayMthdIsNull() {
            addCriterion("TOCH.PAY_MTHD is null");
            return (Criteria) this;
        }

        public Criteria andPayMthdIsNotNull() {
            addCriterion("TOCH.PAY_MTHD is not null");
            return (Criteria) this;
        }

        public Criteria andPayMthdEqualTo(String value) {
            addCriterion("TOCH.PAY_MTHD =", value, "payMthd");
            return (Criteria) this;
        }

        public Criteria andPayMthdNotEqualTo(String value) {
            addCriterion("TOCH.PAY_MTHD <>", value, "payMthd");
            return (Criteria) this;
        }

        public Criteria andPayMthdGreaterThan(String value) {
            addCriterion("TOCH.PAY_MTHD >", value, "payMthd");
            return (Criteria) this;
        }

        public Criteria andPayMthdGreaterThanOrEqualTo(String value) {
            addCriterion("TOCH.PAY_MTHD >=", value, "payMthd");
            return (Criteria) this;
        }

        public Criteria andPayMthdLessThan(String value) {
            addCriterion("TOCH.PAY_MTHD <", value, "payMthd");
            return (Criteria) this;
        }

        public Criteria andPayMthdLessThanOrEqualTo(String value) {
            addCriterion("TOCH.PAY_MTHD <=", value, "payMthd");
            return (Criteria) this;
        }

        public Criteria andPayMthdLike(String value) {
            addCriterion("TOCH.PAY_MTHD like", value, "payMthd");
            return (Criteria) this;
        }

        public Criteria andPayMthdNotLike(String value) {
            addCriterion("TOCH.PAY_MTHD not like", value, "payMthd");
            return (Criteria) this;
        }

        public Criteria andPayMthdIn(List<String> values) {
            addCriterion("TOCH.PAY_MTHD in", values, "payMthd");
            return (Criteria) this;
        }

        public Criteria andPayMthdNotIn(List<String> values) {
            addCriterion("TOCH.PAY_MTHD not in", values, "payMthd");
            return (Criteria) this;
        }

        public Criteria andPayMthdBetween(String value1, String value2) {
            addCriterion("TOCH.PAY_MTHD between", value1, value2, "payMthd");
            return (Criteria) this;
        }

        public Criteria andPayMthdNotBetween(String value1, String value2) {
            addCriterion("TOCH.PAY_MTHD not between", value1, value2, "payMthd");
            return (Criteria) this;
        }

        public Criteria andOrdAmtIsNull() {
            addCriterion("TOCH.ORD_AMT is null");
            return (Criteria) this;
        }

        public Criteria andOrdAmtIsNotNull() {
            addCriterion("TOCH.ORD_AMT is not null");
            return (Criteria) this;
        }

        public Criteria andOrdAmtEqualTo(Integer value) {
            addCriterion("TOCH.ORD_AMT =", value, "ordAmt");
            return (Criteria) this;
        }

        public Criteria andOrdAmtNotEqualTo(Integer value) {
            addCriterion("TOCH.ORD_AMT <>", value, "ordAmt");
            return (Criteria) this;
        }

        public Criteria andOrdAmtGreaterThan(Integer value) {
            addCriterion("TOCH.ORD_AMT >", value, "ordAmt");
            return (Criteria) this;
        }

        public Criteria andOrdAmtGreaterThanOrEqualTo(Integer value) {
            addCriterion("TOCH.ORD_AMT >=", value, "ordAmt");
            return (Criteria) this;
        }

        public Criteria andOrdAmtLessThan(Integer value) {
            addCriterion("TOCH.ORD_AMT <", value, "ordAmt");
            return (Criteria) this;
        }

        public Criteria andOrdAmtLessThanOrEqualTo(Integer value) {
            addCriterion("TOCH.ORD_AMT <=", value, "ordAmt");
            return (Criteria) this;
        }

        public Criteria andOrdAmtIn(List<Integer> values) {
            addCriterion("TOCH.ORD_AMT in", values, "ordAmt");
            return (Criteria) this;
        }

        public Criteria andOrdAmtNotIn(List<Integer> values) {
            addCriterion("TOCH.ORD_AMT not in", values, "ordAmt");
            return (Criteria) this;
        }

        public Criteria andOrdAmtBetween(Integer value1, Integer value2) {
            addCriterion("TOCH.ORD_AMT between", value1, value2, "ordAmt");
            return (Criteria) this;
        }

        public Criteria andOrdAmtNotBetween(Integer value1, Integer value2) {
            addCriterion("TOCH.ORD_AMT not between", value1, value2, "ordAmt");
            return (Criteria) this;
        }

        public Criteria andCpnDcAmtIsNull() {
            addCriterion("TOCH.CPN_DC_AMT is null");
            return (Criteria) this;
        }

        public Criteria andCpnDcAmtIsNotNull() {
            addCriterion("TOCH.CPN_DC_AMT is not null");
            return (Criteria) this;
        }

        public Criteria andCpnDcAmtEqualTo(Integer value) {
            addCriterion("TOCH.CPN_DC_AMT =", value, "cpnDcAmt");
            return (Criteria) this;
        }

        public Criteria andCpnDcAmtNotEqualTo(Integer value) {
            addCriterion("TOCH.CPN_DC_AMT <>", value, "cpnDcAmt");
            return (Criteria) this;
        }

        public Criteria andCpnDcAmtGreaterThan(Integer value) {
            addCriterion("TOCH.CPN_DC_AMT >", value, "cpnDcAmt");
            return (Criteria) this;
        }

        public Criteria andCpnDcAmtGreaterThanOrEqualTo(Integer value) {
            addCriterion("TOCH.CPN_DC_AMT >=", value, "cpnDcAmt");
            return (Criteria) this;
        }

        public Criteria andCpnDcAmtLessThan(Integer value) {
            addCriterion("TOCH.CPN_DC_AMT <", value, "cpnDcAmt");
            return (Criteria) this;
        }

        public Criteria andCpnDcAmtLessThanOrEqualTo(Integer value) {
            addCriterion("TOCH.CPN_DC_AMT <=", value, "cpnDcAmt");
            return (Criteria) this;
        }

        public Criteria andCpnDcAmtIn(List<Integer> values) {
            addCriterion("TOCH.CPN_DC_AMT in", values, "cpnDcAmt");
            return (Criteria) this;
        }

        public Criteria andCpnDcAmtNotIn(List<Integer> values) {
            addCriterion("TOCH.CPN_DC_AMT not in", values, "cpnDcAmt");
            return (Criteria) this;
        }

        public Criteria andCpnDcAmtBetween(Integer value1, Integer value2) {
            addCriterion("TOCH.CPN_DC_AMT between", value1, value2, "cpnDcAmt");
            return (Criteria) this;
        }

        public Criteria andCpnDcAmtNotBetween(Integer value1, Integer value2) {
            addCriterion("TOCH.CPN_DC_AMT not between", value1, value2, "cpnDcAmt");
            return (Criteria) this;
        }

        public Criteria andPtUseAmtIsNull() {
            addCriterion("TOCH.PT_USE_AMT is null");
            return (Criteria) this;
        }

        public Criteria andPtUseAmtIsNotNull() {
            addCriterion("TOCH.PT_USE_AMT is not null");
            return (Criteria) this;
        }

        public Criteria andPtUseAmtEqualTo(Integer value) {
            addCriterion("TOCH.PT_USE_AMT =", value, "ptUseAmt");
            return (Criteria) this;
        }

        public Criteria andPtUseAmtNotEqualTo(Integer value) {
            addCriterion("TOCH.PT_USE_AMT <>", value, "ptUseAmt");
            return (Criteria) this;
        }

        public Criteria andPtUseAmtGreaterThan(Integer value) {
            addCriterion("TOCH.PT_USE_AMT >", value, "ptUseAmt");
            return (Criteria) this;
        }

        public Criteria andPtUseAmtGreaterThanOrEqualTo(Integer value) {
            addCriterion("TOCH.PT_USE_AMT >=", value, "ptUseAmt");
            return (Criteria) this;
        }

        public Criteria andPtUseAmtLessThan(Integer value) {
            addCriterion("TOCH.PT_USE_AMT <", value, "ptUseAmt");
            return (Criteria) this;
        }

        public Criteria andPtUseAmtLessThanOrEqualTo(Integer value) {
            addCriterion("TOCH.PT_USE_AMT <=", value, "ptUseAmt");
            return (Criteria) this;
        }

        public Criteria andPtUseAmtIn(List<Integer> values) {
            addCriterion("TOCH.PT_USE_AMT in", values, "ptUseAmt");
            return (Criteria) this;
        }

        public Criteria andPtUseAmtNotIn(List<Integer> values) {
            addCriterion("TOCH.PT_USE_AMT not in", values, "ptUseAmt");
            return (Criteria) this;
        }

        public Criteria andPtUseAmtBetween(Integer value1, Integer value2) {
            addCriterion("TOCH.PT_USE_AMT between", value1, value2, "ptUseAmt");
            return (Criteria) this;
        }

        public Criteria andPtUseAmtNotBetween(Integer value1, Integer value2) {
            addCriterion("TOCH.PT_USE_AMT not between", value1, value2, "ptUseAmt");
            return (Criteria) this;
        }

        public Criteria andRealOrdAmtIsNull() {
            addCriterion("TOCH.REAL_ORD_AMT is null");
            return (Criteria) this;
        }

        public Criteria andRealOrdAmtIsNotNull() {
            addCriterion("TOCH.REAL_ORD_AMT is not null");
            return (Criteria) this;
        }

        public Criteria andRealOrdAmtEqualTo(Integer value) {
            addCriterion("TOCH.REAL_ORD_AMT =", value, "realOrdAmt");
            return (Criteria) this;
        }

        public Criteria andRealOrdAmtNotEqualTo(Integer value) {
            addCriterion("TOCH.REAL_ORD_AMT <>", value, "realOrdAmt");
            return (Criteria) this;
        }

        public Criteria andRealOrdAmtGreaterThan(Integer value) {
            addCriterion("TOCH.REAL_ORD_AMT >", value, "realOrdAmt");
            return (Criteria) this;
        }

        public Criteria andRealOrdAmtGreaterThanOrEqualTo(Integer value) {
            addCriterion("TOCH.REAL_ORD_AMT >=", value, "realOrdAmt");
            return (Criteria) this;
        }

        public Criteria andRealOrdAmtLessThan(Integer value) {
            addCriterion("TOCH.REAL_ORD_AMT <", value, "realOrdAmt");
            return (Criteria) this;
        }

        public Criteria andRealOrdAmtLessThanOrEqualTo(Integer value) {
            addCriterion("TOCH.REAL_ORD_AMT <=", value, "realOrdAmt");
            return (Criteria) this;
        }

        public Criteria andRealOrdAmtIn(List<Integer> values) {
            addCriterion("TOCH.REAL_ORD_AMT in", values, "realOrdAmt");
            return (Criteria) this;
        }

        public Criteria andRealOrdAmtNotIn(List<Integer> values) {
            addCriterion("TOCH.REAL_ORD_AMT not in", values, "realOrdAmt");
            return (Criteria) this;
        }

        public Criteria andRealOrdAmtBetween(Integer value1, Integer value2) {
            addCriterion("TOCH.REAL_ORD_AMT between", value1, value2, "realOrdAmt");
            return (Criteria) this;
        }

        public Criteria andRealOrdAmtNotBetween(Integer value1, Integer value2) {
            addCriterion("TOCH.REAL_ORD_AMT not between", value1, value2, "realOrdAmt");
            return (Criteria) this;
        }

        public Criteria andRealPayAmtIsNull() {
            addCriterion("TOCH.REAL_PAY_AMT is null");
            return (Criteria) this;
        }

        public Criteria andRealPayAmtIsNotNull() {
            addCriterion("TOCH.REAL_PAY_AMT is not null");
            return (Criteria) this;
        }

        public Criteria andRealPayAmtEqualTo(Integer value) {
            addCriterion("TOCH.REAL_PAY_AMT =", value, "realPayAmt");
            return (Criteria) this;
        }

        public Criteria andRealPayAmtNotEqualTo(Integer value) {
            addCriterion("TOCH.REAL_PAY_AMT <>", value, "realPayAmt");
            return (Criteria) this;
        }

        public Criteria andRealPayAmtGreaterThan(Integer value) {
            addCriterion("TOCH.REAL_PAY_AMT >", value, "realPayAmt");
            return (Criteria) this;
        }

        public Criteria andRealPayAmtGreaterThanOrEqualTo(Integer value) {
            addCriterion("TOCH.REAL_PAY_AMT >=", value, "realPayAmt");
            return (Criteria) this;
        }

        public Criteria andRealPayAmtLessThan(Integer value) {
            addCriterion("TOCH.REAL_PAY_AMT <", value, "realPayAmt");
            return (Criteria) this;
        }

        public Criteria andRealPayAmtLessThanOrEqualTo(Integer value) {
            addCriterion("TOCH.REAL_PAY_AMT <=", value, "realPayAmt");
            return (Criteria) this;
        }

        public Criteria andRealPayAmtIn(List<Integer> values) {
            addCriterion("TOCH.REAL_PAY_AMT in", values, "realPayAmt");
            return (Criteria) this;
        }

        public Criteria andRealPayAmtNotIn(List<Integer> values) {
            addCriterion("TOCH.REAL_PAY_AMT not in", values, "realPayAmt");
            return (Criteria) this;
        }

        public Criteria andRealPayAmtBetween(Integer value1, Integer value2) {
            addCriterion("TOCH.REAL_PAY_AMT between", value1, value2, "realPayAmt");
            return (Criteria) this;
        }

        public Criteria andRealPayAmtNotBetween(Integer value1, Integer value2) {
            addCriterion("TOCH.REAL_PAY_AMT not between", value1, value2, "realPayAmt");
            return (Criteria) this;
        }

        public Criteria andPgSplyAmtIsNull() {
            addCriterion("TOCH.PG_SPLY_AMT is null");
            return (Criteria) this;
        }

        public Criteria andPgSplyAmtIsNotNull() {
            addCriterion("TOCH.PG_SPLY_AMT is not null");
            return (Criteria) this;
        }

        public Criteria andPgSplyAmtEqualTo(Integer value) {
            addCriterion("TOCH.PG_SPLY_AMT =", value, "pgSplyAmt");
            return (Criteria) this;
        }

        public Criteria andPgSplyAmtNotEqualTo(Integer value) {
            addCriterion("TOCH.PG_SPLY_AMT <>", value, "pgSplyAmt");
            return (Criteria) this;
        }

        public Criteria andPgSplyAmtGreaterThan(Integer value) {
            addCriterion("TOCH.PG_SPLY_AMT >", value, "pgSplyAmt");
            return (Criteria) this;
        }

        public Criteria andPgSplyAmtGreaterThanOrEqualTo(Integer value) {
            addCriterion("TOCH.PG_SPLY_AMT >=", value, "pgSplyAmt");
            return (Criteria) this;
        }

        public Criteria andPgSplyAmtLessThan(Integer value) {
            addCriterion("TOCH.PG_SPLY_AMT <", value, "pgSplyAmt");
            return (Criteria) this;
        }

        public Criteria andPgSplyAmtLessThanOrEqualTo(Integer value) {
            addCriterion("TOCH.PG_SPLY_AMT <=", value, "pgSplyAmt");
            return (Criteria) this;
        }

        public Criteria andPgSplyAmtIn(List<Integer> values) {
            addCriterion("TOCH.PG_SPLY_AMT in", values, "pgSplyAmt");
            return (Criteria) this;
        }

        public Criteria andPgSplyAmtNotIn(List<Integer> values) {
            addCriterion("TOCH.PG_SPLY_AMT not in", values, "pgSplyAmt");
            return (Criteria) this;
        }

        public Criteria andPgSplyAmtBetween(Integer value1, Integer value2) {
            addCriterion("TOCH.PG_SPLY_AMT between", value1, value2, "pgSplyAmt");
            return (Criteria) this;
        }

        public Criteria andPgSplyAmtNotBetween(Integer value1, Integer value2) {
            addCriterion("TOCH.PG_SPLY_AMT not between", value1, value2, "pgSplyAmt");
            return (Criteria) this;
        }

        public Criteria andPgVatAmtIsNull() {
            addCriterion("TOCH.PG_VAT_AMT is null");
            return (Criteria) this;
        }

        public Criteria andPgVatAmtIsNotNull() {
            addCriterion("TOCH.PG_VAT_AMT is not null");
            return (Criteria) this;
        }

        public Criteria andPgVatAmtEqualTo(Integer value) {
            addCriterion("TOCH.PG_VAT_AMT =", value, "pgVatAmt");
            return (Criteria) this;
        }

        public Criteria andPgVatAmtNotEqualTo(Integer value) {
            addCriterion("TOCH.PG_VAT_AMT <>", value, "pgVatAmt");
            return (Criteria) this;
        }

        public Criteria andPgVatAmtGreaterThan(Integer value) {
            addCriterion("TOCH.PG_VAT_AMT >", value, "pgVatAmt");
            return (Criteria) this;
        }

        public Criteria andPgVatAmtGreaterThanOrEqualTo(Integer value) {
            addCriterion("TOCH.PG_VAT_AMT >=", value, "pgVatAmt");
            return (Criteria) this;
        }

        public Criteria andPgVatAmtLessThan(Integer value) {
            addCriterion("TOCH.PG_VAT_AMT <", value, "pgVatAmt");
            return (Criteria) this;
        }

        public Criteria andPgVatAmtLessThanOrEqualTo(Integer value) {
            addCriterion("TOCH.PG_VAT_AMT <=", value, "pgVatAmt");
            return (Criteria) this;
        }

        public Criteria andPgVatAmtIn(List<Integer> values) {
            addCriterion("TOCH.PG_VAT_AMT in", values, "pgVatAmt");
            return (Criteria) this;
        }

        public Criteria andPgVatAmtNotIn(List<Integer> values) {
            addCriterion("TOCH.PG_VAT_AMT not in", values, "pgVatAmt");
            return (Criteria) this;
        }

        public Criteria andPgVatAmtBetween(Integer value1, Integer value2) {
            addCriterion("TOCH.PG_VAT_AMT between", value1, value2, "pgVatAmt");
            return (Criteria) this;
        }

        public Criteria andPgVatAmtNotBetween(Integer value1, Integer value2) {
            addCriterion("TOCH.PG_VAT_AMT not between", value1, value2, "pgVatAmt");
            return (Criteria) this;
        }

        public Criteria andPgTaxfreeAmtIsNull() {
            addCriterion("TOCH.PG_TAXFREE_AMT is null");
            return (Criteria) this;
        }

        public Criteria andPgTaxfreeAmtIsNotNull() {
            addCriterion("TOCH.PG_TAXFREE_AMT is not null");
            return (Criteria) this;
        }

        public Criteria andPgTaxfreeAmtEqualTo(Integer value) {
            addCriterion("TOCH.PG_TAXFREE_AMT =", value, "pgTaxfreeAmt");
            return (Criteria) this;
        }

        public Criteria andPgTaxfreeAmtNotEqualTo(Integer value) {
            addCriterion("TOCH.PG_TAXFREE_AMT <>", value, "pgTaxfreeAmt");
            return (Criteria) this;
        }

        public Criteria andPgTaxfreeAmtGreaterThan(Integer value) {
            addCriterion("TOCH.PG_TAXFREE_AMT >", value, "pgTaxfreeAmt");
            return (Criteria) this;
        }

        public Criteria andPgTaxfreeAmtGreaterThanOrEqualTo(Integer value) {
            addCriterion("TOCH.PG_TAXFREE_AMT >=", value, "pgTaxfreeAmt");
            return (Criteria) this;
        }

        public Criteria andPgTaxfreeAmtLessThan(Integer value) {
            addCriterion("TOCH.PG_TAXFREE_AMT <", value, "pgTaxfreeAmt");
            return (Criteria) this;
        }

        public Criteria andPgTaxfreeAmtLessThanOrEqualTo(Integer value) {
            addCriterion("TOCH.PG_TAXFREE_AMT <=", value, "pgTaxfreeAmt");
            return (Criteria) this;
        }

        public Criteria andPgTaxfreeAmtIn(List<Integer> values) {
            addCriterion("TOCH.PG_TAXFREE_AMT in", values, "pgTaxfreeAmt");
            return (Criteria) this;
        }

        public Criteria andPgTaxfreeAmtNotIn(List<Integer> values) {
            addCriterion("TOCH.PG_TAXFREE_AMT not in", values, "pgTaxfreeAmt");
            return (Criteria) this;
        }

        public Criteria andPgTaxfreeAmtBetween(Integer value1, Integer value2) {
            addCriterion("TOCH.PG_TAXFREE_AMT between", value1, value2, "pgTaxfreeAmt");
            return (Criteria) this;
        }

        public Criteria andPgTaxfreeAmtNotBetween(Integer value1, Integer value2) {
            addCriterion("TOCH.PG_TAXFREE_AMT not between", value1, value2, "pgTaxfreeAmt");
            return (Criteria) this;
        }

        public Criteria andPayCpltDtIsNull() {
            addCriterion("TOCH.PAY_CPLT_DT is null");
            return (Criteria) this;
        }

        public Criteria andPayCpltDtIsNotNull() {
            addCriterion("TOCH.PAY_CPLT_DT is not null");
            return (Criteria) this;
        }

        public Criteria andPayCpltDtEqualTo(Date value) {
            addCriterionForJDBCDate("TOCH.PAY_CPLT_DT =", value, "payCpltDt");
            return (Criteria) this;
        }

        public Criteria andPayCpltDtNotEqualTo(Date value) {
            addCriterionForJDBCDate("TOCH.PAY_CPLT_DT <>", value, "payCpltDt");
            return (Criteria) this;
        }

        public Criteria andPayCpltDtGreaterThan(Date value) {
            addCriterionForJDBCDate("TOCH.PAY_CPLT_DT >", value, "payCpltDt");
            return (Criteria) this;
        }

        public Criteria andPayCpltDtGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("TOCH.PAY_CPLT_DT >=", value, "payCpltDt");
            return (Criteria) this;
        }

        public Criteria andPayCpltDtLessThan(Date value) {
            addCriterionForJDBCDate("TOCH.PAY_CPLT_DT <", value, "payCpltDt");
            return (Criteria) this;
        }

        public Criteria andPayCpltDtLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("TOCH.PAY_CPLT_DT <=", value, "payCpltDt");
            return (Criteria) this;
        }

        public Criteria andPayCpltDtIn(List<Date> values) {
            addCriterionForJDBCDate("TOCH.PAY_CPLT_DT in", values, "payCpltDt");
            return (Criteria) this;
        }

        public Criteria andPayCpltDtNotIn(List<Date> values) {
            addCriterionForJDBCDate("TOCH.PAY_CPLT_DT not in", values, "payCpltDt");
            return (Criteria) this;
        }

        public Criteria andPayCpltDtBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("TOCH.PAY_CPLT_DT between", value1, value2, "payCpltDt");
            return (Criteria) this;
        }

        public Criteria andPayCpltDtNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("TOCH.PAY_CPLT_DT not between", value1, value2, "payCpltDt");
            return (Criteria) this;
        }

        public Criteria andRegDtIsNull() {
            addCriterion("TOCH.REG_DT is null");
            return (Criteria) this;
        }

        public Criteria andRegDtIsNotNull() {
            addCriterion("TOCH.REG_DT is not null");
            return (Criteria) this;
        }

        public Criteria andRegDtEqualTo(Date value) {
            addCriterion("TOCH.REG_DT =", value, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtNotEqualTo(Date value) {
            addCriterion("TOCH.REG_DT <>", value, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtGreaterThan(Date value) {
            addCriterion("TOCH.REG_DT >", value, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtGreaterThanOrEqualTo(Date value) {
            addCriterion("TOCH.REG_DT >=", value, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtLessThan(Date value) {
            addCriterion("TOCH.REG_DT <", value, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtLessThanOrEqualTo(Date value) {
            addCriterion("TOCH.REG_DT <=", value, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtIn(List<Date> values) {
            addCriterion("TOCH.REG_DT in", values, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtNotIn(List<Date> values) {
            addCriterion("TOCH.REG_DT not in", values, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtBetween(Date value1, Date value2) {
            addCriterion("TOCH.REG_DT between", value1, value2, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtNotBetween(Date value1, Date value2) {
            addCriterion("TOCH.REG_DT not between", value1, value2, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegIdIsNull() {
            addCriterion("TOCH.REG_ID is null");
            return (Criteria) this;
        }

        public Criteria andRegIdIsNotNull() {
            addCriterion("TOCH.REG_ID is not null");
            return (Criteria) this;
        }

        public Criteria andRegIdEqualTo(String value) {
            addCriterion("TOCH.REG_ID =", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdNotEqualTo(String value) {
            addCriterion("TOCH.REG_ID <>", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdGreaterThan(String value) {
            addCriterion("TOCH.REG_ID >", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdGreaterThanOrEqualTo(String value) {
            addCriterion("TOCH.REG_ID >=", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdLessThan(String value) {
            addCriterion("TOCH.REG_ID <", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdLessThanOrEqualTo(String value) {
            addCriterion("TOCH.REG_ID <=", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdLike(String value) {
            addCriterion("TOCH.REG_ID like", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdNotLike(String value) {
            addCriterion("TOCH.REG_ID not like", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdIn(List<String> values) {
            addCriterion("TOCH.REG_ID in", values, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdNotIn(List<String> values) {
            addCriterion("TOCH.REG_ID not in", values, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdBetween(String value1, String value2) {
            addCriterion("TOCH.REG_ID between", value1, value2, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdNotBetween(String value1, String value2) {
            addCriterion("TOCH.REG_ID not between", value1, value2, "regId");
            return (Criteria) this;
        }

        public Criteria andModDtIsNull() {
            addCriterion("TOCH.MOD_DT is null");
            return (Criteria) this;
        }

        public Criteria andModDtIsNotNull() {
            addCriterion("TOCH.MOD_DT is not null");
            return (Criteria) this;
        }

        public Criteria andModDtEqualTo(Date value) {
            addCriterion("TOCH.MOD_DT =", value, "modDt");
            return (Criteria) this;
        }

        public Criteria andModDtNotEqualTo(Date value) {
            addCriterion("TOCH.MOD_DT <>", value, "modDt");
            return (Criteria) this;
        }

        public Criteria andModDtGreaterThan(Date value) {
            addCriterion("TOCH.MOD_DT >", value, "modDt");
            return (Criteria) this;
        }

        public Criteria andModDtGreaterThanOrEqualTo(Date value) {
            addCriterion("TOCH.MOD_DT >=", value, "modDt");
            return (Criteria) this;
        }

        public Criteria andModDtLessThan(Date value) {
            addCriterion("TOCH.MOD_DT <", value, "modDt");
            return (Criteria) this;
        }

        public Criteria andModDtLessThanOrEqualTo(Date value) {
            addCriterion("TOCH.MOD_DT <=", value, "modDt");
            return (Criteria) this;
        }

        public Criteria andModDtIn(List<Date> values) {
            addCriterion("TOCH.MOD_DT in", values, "modDt");
            return (Criteria) this;
        }

        public Criteria andModDtNotIn(List<Date> values) {
            addCriterion("TOCH.MOD_DT not in", values, "modDt");
            return (Criteria) this;
        }

        public Criteria andModDtBetween(Date value1, Date value2) {
            addCriterion("TOCH.MOD_DT between", value1, value2, "modDt");
            return (Criteria) this;
        }

        public Criteria andModDtNotBetween(Date value1, Date value2) {
            addCriterion("TOCH.MOD_DT not between", value1, value2, "modDt");
            return (Criteria) this;
        }

        public Criteria andModIdIsNull() {
            addCriterion("TOCH.MOD_ID is null");
            return (Criteria) this;
        }

        public Criteria andModIdIsNotNull() {
            addCriterion("TOCH.MOD_ID is not null");
            return (Criteria) this;
        }

        public Criteria andModIdEqualTo(String value) {
            addCriterion("TOCH.MOD_ID =", value, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdNotEqualTo(String value) {
            addCriterion("TOCH.MOD_ID <>", value, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdGreaterThan(String value) {
            addCriterion("TOCH.MOD_ID >", value, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdGreaterThanOrEqualTo(String value) {
            addCriterion("TOCH.MOD_ID >=", value, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdLessThan(String value) {
            addCriterion("TOCH.MOD_ID <", value, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdLessThanOrEqualTo(String value) {
            addCriterion("TOCH.MOD_ID <=", value, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdLike(String value) {
            addCriterion("TOCH.MOD_ID like", value, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdNotLike(String value) {
            addCriterion("TOCH.MOD_ID not like", value, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdIn(List<String> values) {
            addCriterion("TOCH.MOD_ID in", values, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdNotIn(List<String> values) {
            addCriterion("TOCH.MOD_ID not in", values, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdBetween(String value1, String value2) {
            addCriterion("TOCH.MOD_ID between", value1, value2, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdNotBetween(String value1, String value2) {
            addCriterion("TOCH.MOD_ID not between", value1, value2, "modId");
            return (Criteria) this;
        }

        public Criteria andOrdNoLikeInsensitive(String value) {
            addCriterion("upper(TOCH.ORD_NO) like", value.toUpperCase(), "ordNo");
            return (Criteria) this;
        }

        public Criteria andOrdTpCdLikeInsensitive(String value) {
            addCriterion("upper(TOCH.ORD_TP_CD) like", value.toUpperCase(), "ordTpCd");
            return (Criteria) this;
        }

        public Criteria andOrdRcptChCdLikeInsensitive(String value) {
            addCriterion("upper(TOCH.ORD_RCPT_CH_CD) like", value.toUpperCase(), "ordRcptChCd");
            return (Criteria) this;
        }

        public Criteria andOrdRcptEnvCdLikeInsensitive(String value) {
            addCriterion("upper(TOCH.ORD_RCPT_ENV_CD) like", value.toUpperCase(), "ordRcptEnvCd");
            return (Criteria) this;
        }

        public Criteria andMbrIdLikeInsensitive(String value) {
            addCriterion("upper(TOCH.MBR_ID) like", value.toUpperCase(), "mbrId");
            return (Criteria) this;
        }

        public Criteria andMbrGrdCdLikeInsensitive(String value) {
            addCriterion("upper(TOCH.MBR_GRD_CD) like", value.toUpperCase(), "mbrGrdCd");
            return (Criteria) this;
        }

        public Criteria andBuyrNmLikeInsensitive(String value) {
            addCriterion("upper(TOCH.BUYR_NM) like", value.toUpperCase(), "buyrNm");
            return (Criteria) this;
        }

        public Criteria andBuyrCpNoLikeInsensitive(String value) {
            addCriterion("upper(TOCH.BUYR_CP_NO) like", value.toUpperCase(), "buyrCpNo");
            return (Criteria) this;
        }

        public Criteria andBuyrTelNoLikeInsensitive(String value) {
            addCriterion("upper(TOCH.BUYR_TEL_NO) like", value.toUpperCase(), "buyrTelNo");
            return (Criteria) this;
        }

        public Criteria andBuyrEmailLikeInsensitive(String value) {
            addCriterion("upper(TOCH.BUYR_EMAIL) like", value.toUpperCase(), "buyrEmail");
            return (Criteria) this;
        }

        public Criteria andBuyrIpAddrLikeInsensitive(String value) {
            addCriterion("upper(TOCH.BUYR_IP_ADDR) like", value.toUpperCase(), "buyrIpAddr");
            return (Criteria) this;
        }

        public Criteria andBuyrOrdAgrYnLikeInsensitive(String value) {
            addCriterion("upper(TOCH.BUYR_ORD_AGR_YN) like", value.toUpperCase(), "buyrOrdAgrYn");
            return (Criteria) this;
        }

        public Criteria andFstPayMthdLikeInsensitive(String value) {
            addCriterion("upper(TOCH.FST_PAY_MTHD) like", value.toUpperCase(), "fstPayMthd");
            return (Criteria) this;
        }

        public Criteria andPayMthdLikeInsensitive(String value) {
            addCriterion("upper(TOCH.PAY_MTHD) like", value.toUpperCase(), "payMthd");
            return (Criteria) this;
        }

        public Criteria andRegIdLikeInsensitive(String value) {
            addCriterion("upper(TOCH.REG_ID) like", value.toUpperCase(), "regId");
            return (Criteria) this;
        }

        public Criteria andModIdLikeInsensitive(String value) {
            addCriterion("upper(TOCH.MOD_ID) like", value.toUpperCase(), "modId");
            return (Criteria) this;
        }

        public Criteria andOrdNoLikeLeft(String value) {
            addCriterion("TOCH.ORD_NO like ", "%" + value, "ordNo");
            return (Criteria) this;
        }

        public Criteria andOrdNoLikeRight(String value) {
            addCriterion("TOCH.ORD_NO like ", value + "%", "ordNo");
            return (Criteria) this;
        }

        public Criteria andOrdNoLikeBoth(String value) {
            addCriterion("TOCH.ORD_NO like ", "%" + value + "%", "ordNo");
            return (Criteria) this;
        }

        public Criteria andOrdTpCdLikeLeft(String value) {
            addCriterion("TOCH.ORD_TP_CD like ", "%" + value, "ordTpCd");
            return (Criteria) this;
        }

        public Criteria andOrdTpCdLikeRight(String value) {
            addCriterion("TOCH.ORD_TP_CD like ", value + "%", "ordTpCd");
            return (Criteria) this;
        }

        public Criteria andOrdTpCdLikeBoth(String value) {
            addCriterion("TOCH.ORD_TP_CD like ", "%" + value + "%", "ordTpCd");
            return (Criteria) this;
        }

        public Criteria andOrdRcptChCdLikeLeft(String value) {
            addCriterion("TOCH.ORD_RCPT_CH_CD like ", "%" + value, "ordRcptChCd");
            return (Criteria) this;
        }

        public Criteria andOrdRcptChCdLikeRight(String value) {
            addCriterion("TOCH.ORD_RCPT_CH_CD like ", value + "%", "ordRcptChCd");
            return (Criteria) this;
        }

        public Criteria andOrdRcptChCdLikeBoth(String value) {
            addCriterion("TOCH.ORD_RCPT_CH_CD like ", "%" + value + "%", "ordRcptChCd");
            return (Criteria) this;
        }

        public Criteria andOrdRcptEnvCdLikeLeft(String value) {
            addCriterion("TOCH.ORD_RCPT_ENV_CD like ", "%" + value, "ordRcptEnvCd");
            return (Criteria) this;
        }

        public Criteria andOrdRcptEnvCdLikeRight(String value) {
            addCriterion("TOCH.ORD_RCPT_ENV_CD like ", value + "%", "ordRcptEnvCd");
            return (Criteria) this;
        }

        public Criteria andOrdRcptEnvCdLikeBoth(String value) {
            addCriterion("TOCH.ORD_RCPT_ENV_CD like ", "%" + value + "%", "ordRcptEnvCd");
            return (Criteria) this;
        }

        public Criteria andMbrIdLikeLeft(String value) {
            addCriterion("TOCH.MBR_ID like ", "%" + value, "mbrId");
            return (Criteria) this;
        }

        public Criteria andMbrIdLikeRight(String value) {
            addCriterion("TOCH.MBR_ID like ", value + "%", "mbrId");
            return (Criteria) this;
        }

        public Criteria andMbrIdLikeBoth(String value) {
            addCriterion("TOCH.MBR_ID like ", "%" + value + "%", "mbrId");
            return (Criteria) this;
        }

        public Criteria andMbrGrdCdLikeLeft(String value) {
            addCriterion("TOCH.MBR_GRD_CD like ", "%" + value, "mbrGrdCd");
            return (Criteria) this;
        }

        public Criteria andMbrGrdCdLikeRight(String value) {
            addCriterion("TOCH.MBR_GRD_CD like ", value + "%", "mbrGrdCd");
            return (Criteria) this;
        }

        public Criteria andMbrGrdCdLikeBoth(String value) {
            addCriterion("TOCH.MBR_GRD_CD like ", "%" + value + "%", "mbrGrdCd");
            return (Criteria) this;
        }

        public Criteria andBuyrNmLikeLeft(String value) {
            addCriterion("TOCH.BUYR_NM like ", "%" + value, "buyrNm");
            return (Criteria) this;
        }

        public Criteria andBuyrNmLikeRight(String value) {
            addCriterion("TOCH.BUYR_NM like ", value + "%", "buyrNm");
            return (Criteria) this;
        }

        public Criteria andBuyrNmLikeBoth(String value) {
            addCriterion("TOCH.BUYR_NM like ", "%" + value + "%", "buyrNm");
            return (Criteria) this;
        }

        public Criteria andBuyrCpNoLikeLeft(String value) {
            addCriterion("TOCH.BUYR_CP_NO like ", "%" + value, "buyrCpNo");
            return (Criteria) this;
        }

        public Criteria andBuyrCpNoLikeRight(String value) {
            addCriterion("TOCH.BUYR_CP_NO like ", value + "%", "buyrCpNo");
            return (Criteria) this;
        }

        public Criteria andBuyrCpNoLikeBoth(String value) {
            addCriterion("TOCH.BUYR_CP_NO like ", "%" + value + "%", "buyrCpNo");
            return (Criteria) this;
        }

        public Criteria andBuyrTelNoLikeLeft(String value) {
            addCriterion("TOCH.BUYR_TEL_NO like ", "%" + value, "buyrTelNo");
            return (Criteria) this;
        }

        public Criteria andBuyrTelNoLikeRight(String value) {
            addCriterion("TOCH.BUYR_TEL_NO like ", value + "%", "buyrTelNo");
            return (Criteria) this;
        }

        public Criteria andBuyrTelNoLikeBoth(String value) {
            addCriterion("TOCH.BUYR_TEL_NO like ", "%" + value + "%", "buyrTelNo");
            return (Criteria) this;
        }

        public Criteria andBuyrEmailLikeLeft(String value) {
            addCriterion("TOCH.BUYR_EMAIL like ", "%" + value, "buyrEmail");
            return (Criteria) this;
        }

        public Criteria andBuyrEmailLikeRight(String value) {
            addCriterion("TOCH.BUYR_EMAIL like ", value + "%", "buyrEmail");
            return (Criteria) this;
        }

        public Criteria andBuyrEmailLikeBoth(String value) {
            addCriterion("TOCH.BUYR_EMAIL like ", "%" + value + "%", "buyrEmail");
            return (Criteria) this;
        }

        public Criteria andBuyrIpAddrLikeLeft(String value) {
            addCriterion("TOCH.BUYR_IP_ADDR like ", "%" + value, "buyrIpAddr");
            return (Criteria) this;
        }

        public Criteria andBuyrIpAddrLikeRight(String value) {
            addCriterion("TOCH.BUYR_IP_ADDR like ", value + "%", "buyrIpAddr");
            return (Criteria) this;
        }

        public Criteria andBuyrIpAddrLikeBoth(String value) {
            addCriterion("TOCH.BUYR_IP_ADDR like ", "%" + value + "%", "buyrIpAddr");
            return (Criteria) this;
        }

        public Criteria andBuyrOrdAgrYnLikeLeft(String value) {
            addCriterion("TOCH.BUYR_ORD_AGR_YN like ", "%" + value, "buyrOrdAgrYn");
            return (Criteria) this;
        }

        public Criteria andBuyrOrdAgrYnLikeRight(String value) {
            addCriterion("TOCH.BUYR_ORD_AGR_YN like ", value + "%", "buyrOrdAgrYn");
            return (Criteria) this;
        }

        public Criteria andBuyrOrdAgrYnLikeBoth(String value) {
            addCriterion("TOCH.BUYR_ORD_AGR_YN like ", "%" + value + "%", "buyrOrdAgrYn");
            return (Criteria) this;
        }

        public Criteria andFstPayMthdLikeLeft(String value) {
            addCriterion("TOCH.FST_PAY_MTHD like ", "%" + value, "fstPayMthd");
            return (Criteria) this;
        }

        public Criteria andFstPayMthdLikeRight(String value) {
            addCriterion("TOCH.FST_PAY_MTHD like ", value + "%", "fstPayMthd");
            return (Criteria) this;
        }

        public Criteria andFstPayMthdLikeBoth(String value) {
            addCriterion("TOCH.FST_PAY_MTHD like ", "%" + value + "%", "fstPayMthd");
            return (Criteria) this;
        }

        public Criteria andPayMthdLikeLeft(String value) {
            addCriterion("TOCH.PAY_MTHD like ", "%" + value, "payMthd");
            return (Criteria) this;
        }

        public Criteria andPayMthdLikeRight(String value) {
            addCriterion("TOCH.PAY_MTHD like ", value + "%", "payMthd");
            return (Criteria) this;
        }

        public Criteria andPayMthdLikeBoth(String value) {
            addCriterion("TOCH.PAY_MTHD like ", "%" + value + "%", "payMthd");
            return (Criteria) this;
        }

        public Criteria andRegIdLikeLeft(String value) {
            addCriterion("TOCH.REG_ID like ", "%" + value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdLikeRight(String value) {
            addCriterion("TOCH.REG_ID like ", value + "%", "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdLikeBoth(String value) {
            addCriterion("TOCH.REG_ID like ", "%" + value + "%", "regId");
            return (Criteria) this;
        }

        public Criteria andModIdLikeLeft(String value) {
            addCriterion("TOCH.MOD_ID like ", "%" + value, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdLikeRight(String value) {
            addCriterion("TOCH.MOD_ID like ", value + "%", "modId");
            return (Criteria) this;
        }

        public Criteria andModIdLikeBoth(String value) {
            addCriterion("TOCH.MOD_ID like ", "%" + value + "%", "modId");
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