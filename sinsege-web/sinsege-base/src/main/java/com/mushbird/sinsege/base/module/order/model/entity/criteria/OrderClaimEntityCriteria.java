package com.mushbird.sinsege.base.module.order.model.entity.criteria;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class OrderClaimEntityCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    public OrderClaimEntityCriteria() {
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

        public Criteria andOrdClmIdIsNull() {
            addCriterion("TOC.ORD_CLM_ID is null");
            return (Criteria) this;
        }

        public Criteria andOrdClmIdIsNotNull() {
            addCriterion("TOC.ORD_CLM_ID is not null");
            return (Criteria) this;
        }

        public Criteria andOrdClmIdEqualTo(Integer value) {
            addCriterion("TOC.ORD_CLM_ID =", value, "ordClmId");
            return (Criteria) this;
        }

        public Criteria andOrdClmIdNotEqualTo(Integer value) {
            addCriterion("TOC.ORD_CLM_ID <>", value, "ordClmId");
            return (Criteria) this;
        }

        public Criteria andOrdClmIdGreaterThan(Integer value) {
            addCriterion("TOC.ORD_CLM_ID >", value, "ordClmId");
            return (Criteria) this;
        }

        public Criteria andOrdClmIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("TOC.ORD_CLM_ID >=", value, "ordClmId");
            return (Criteria) this;
        }

        public Criteria andOrdClmIdLessThan(Integer value) {
            addCriterion("TOC.ORD_CLM_ID <", value, "ordClmId");
            return (Criteria) this;
        }

        public Criteria andOrdClmIdLessThanOrEqualTo(Integer value) {
            addCriterion("TOC.ORD_CLM_ID <=", value, "ordClmId");
            return (Criteria) this;
        }

        public Criteria andOrdClmIdIn(List<Integer> values) {
            addCriterion("TOC.ORD_CLM_ID in", values, "ordClmId");
            return (Criteria) this;
        }

        public Criteria andOrdClmIdNotIn(List<Integer> values) {
            addCriterion("TOC.ORD_CLM_ID not in", values, "ordClmId");
            return (Criteria) this;
        }

        public Criteria andOrdClmIdBetween(Integer value1, Integer value2) {
            addCriterion("TOC.ORD_CLM_ID between", value1, value2, "ordClmId");
            return (Criteria) this;
        }

        public Criteria andOrdClmIdNotBetween(Integer value1, Integer value2) {
            addCriterion("TOC.ORD_CLM_ID not between", value1, value2, "ordClmId");
            return (Criteria) this;
        }

        public Criteria andOrdIdIsNull() {
            addCriterion("TOC.ORD_ID is null");
            return (Criteria) this;
        }

        public Criteria andOrdIdIsNotNull() {
            addCriterion("TOC.ORD_ID is not null");
            return (Criteria) this;
        }

        public Criteria andOrdIdEqualTo(Integer value) {
            addCriterion("TOC.ORD_ID =", value, "ordId");
            return (Criteria) this;
        }

        public Criteria andOrdIdNotEqualTo(Integer value) {
            addCriterion("TOC.ORD_ID <>", value, "ordId");
            return (Criteria) this;
        }

        public Criteria andOrdIdGreaterThan(Integer value) {
            addCriterion("TOC.ORD_ID >", value, "ordId");
            return (Criteria) this;
        }

        public Criteria andOrdIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("TOC.ORD_ID >=", value, "ordId");
            return (Criteria) this;
        }

        public Criteria andOrdIdLessThan(Integer value) {
            addCriterion("TOC.ORD_ID <", value, "ordId");
            return (Criteria) this;
        }

        public Criteria andOrdIdLessThanOrEqualTo(Integer value) {
            addCriterion("TOC.ORD_ID <=", value, "ordId");
            return (Criteria) this;
        }

        public Criteria andOrdIdIn(List<Integer> values) {
            addCriterion("TOC.ORD_ID in", values, "ordId");
            return (Criteria) this;
        }

        public Criteria andOrdIdNotIn(List<Integer> values) {
            addCriterion("TOC.ORD_ID not in", values, "ordId");
            return (Criteria) this;
        }

        public Criteria andOrdIdBetween(Integer value1, Integer value2) {
            addCriterion("TOC.ORD_ID between", value1, value2, "ordId");
            return (Criteria) this;
        }

        public Criteria andOrdIdNotBetween(Integer value1, Integer value2) {
            addCriterion("TOC.ORD_ID not between", value1, value2, "ordId");
            return (Criteria) this;
        }

        public Criteria andOrdClmNoIsNull() {
            addCriterion("TOC.ORD_CLM_NO is null");
            return (Criteria) this;
        }

        public Criteria andOrdClmNoIsNotNull() {
            addCriterion("TOC.ORD_CLM_NO is not null");
            return (Criteria) this;
        }

        public Criteria andOrdClmNoEqualTo(String value) {
            addCriterion("TOC.ORD_CLM_NO =", value, "ordClmNo");
            return (Criteria) this;
        }

        public Criteria andOrdClmNoNotEqualTo(String value) {
            addCriterion("TOC.ORD_CLM_NO <>", value, "ordClmNo");
            return (Criteria) this;
        }

        public Criteria andOrdClmNoGreaterThan(String value) {
            addCriterion("TOC.ORD_CLM_NO >", value, "ordClmNo");
            return (Criteria) this;
        }

        public Criteria andOrdClmNoGreaterThanOrEqualTo(String value) {
            addCriterion("TOC.ORD_CLM_NO >=", value, "ordClmNo");
            return (Criteria) this;
        }

        public Criteria andOrdClmNoLessThan(String value) {
            addCriterion("TOC.ORD_CLM_NO <", value, "ordClmNo");
            return (Criteria) this;
        }

        public Criteria andOrdClmNoLessThanOrEqualTo(String value) {
            addCriterion("TOC.ORD_CLM_NO <=", value, "ordClmNo");
            return (Criteria) this;
        }

        public Criteria andOrdClmNoLike(String value) {
            addCriterion("TOC.ORD_CLM_NO like", value, "ordClmNo");
            return (Criteria) this;
        }

        public Criteria andOrdClmNoNotLike(String value) {
            addCriterion("TOC.ORD_CLM_NO not like", value, "ordClmNo");
            return (Criteria) this;
        }

        public Criteria andOrdClmNoIn(List<String> values) {
            addCriterion("TOC.ORD_CLM_NO in", values, "ordClmNo");
            return (Criteria) this;
        }

        public Criteria andOrdClmNoNotIn(List<String> values) {
            addCriterion("TOC.ORD_CLM_NO not in", values, "ordClmNo");
            return (Criteria) this;
        }

        public Criteria andOrdClmNoBetween(String value1, String value2) {
            addCriterion("TOC.ORD_CLM_NO between", value1, value2, "ordClmNo");
            return (Criteria) this;
        }

        public Criteria andOrdClmNoNotBetween(String value1, String value2) {
            addCriterion("TOC.ORD_CLM_NO not between", value1, value2, "ordClmNo");
            return (Criteria) this;
        }

        public Criteria andClmTpCdIsNull() {
            addCriterion("TOC.CLM_TP_CD is null");
            return (Criteria) this;
        }

        public Criteria andClmTpCdIsNotNull() {
            addCriterion("TOC.CLM_TP_CD is not null");
            return (Criteria) this;
        }

        public Criteria andClmTpCdEqualTo(String value) {
            addCriterion("TOC.CLM_TP_CD =", value, "clmTpCd");
            return (Criteria) this;
        }

        public Criteria andClmTpCdNotEqualTo(String value) {
            addCriterion("TOC.CLM_TP_CD <>", value, "clmTpCd");
            return (Criteria) this;
        }

        public Criteria andClmTpCdGreaterThan(String value) {
            addCriterion("TOC.CLM_TP_CD >", value, "clmTpCd");
            return (Criteria) this;
        }

        public Criteria andClmTpCdGreaterThanOrEqualTo(String value) {
            addCriterion("TOC.CLM_TP_CD >=", value, "clmTpCd");
            return (Criteria) this;
        }

        public Criteria andClmTpCdLessThan(String value) {
            addCriterion("TOC.CLM_TP_CD <", value, "clmTpCd");
            return (Criteria) this;
        }

        public Criteria andClmTpCdLessThanOrEqualTo(String value) {
            addCriterion("TOC.CLM_TP_CD <=", value, "clmTpCd");
            return (Criteria) this;
        }

        public Criteria andClmTpCdLike(String value) {
            addCriterion("TOC.CLM_TP_CD like", value, "clmTpCd");
            return (Criteria) this;
        }

        public Criteria andClmTpCdNotLike(String value) {
            addCriterion("TOC.CLM_TP_CD not like", value, "clmTpCd");
            return (Criteria) this;
        }

        public Criteria andClmTpCdIn(List<String> values) {
            addCriterion("TOC.CLM_TP_CD in", values, "clmTpCd");
            return (Criteria) this;
        }

        public Criteria andClmTpCdNotIn(List<String> values) {
            addCriterion("TOC.CLM_TP_CD not in", values, "clmTpCd");
            return (Criteria) this;
        }

        public Criteria andClmTpCdBetween(String value1, String value2) {
            addCriterion("TOC.CLM_TP_CD between", value1, value2, "clmTpCd");
            return (Criteria) this;
        }

        public Criteria andClmTpCdNotBetween(String value1, String value2) {
            addCriterion("TOC.CLM_TP_CD not between", value1, value2, "clmTpCd");
            return (Criteria) this;
        }

        public Criteria andClmRcptChCdIsNull() {
            addCriterion("TOC.CLM_RCPT_CH_CD is null");
            return (Criteria) this;
        }

        public Criteria andClmRcptChCdIsNotNull() {
            addCriterion("TOC.CLM_RCPT_CH_CD is not null");
            return (Criteria) this;
        }

        public Criteria andClmRcptChCdEqualTo(String value) {
            addCriterion("TOC.CLM_RCPT_CH_CD =", value, "clmRcptChCd");
            return (Criteria) this;
        }

        public Criteria andClmRcptChCdNotEqualTo(String value) {
            addCriterion("TOC.CLM_RCPT_CH_CD <>", value, "clmRcptChCd");
            return (Criteria) this;
        }

        public Criteria andClmRcptChCdGreaterThan(String value) {
            addCriterion("TOC.CLM_RCPT_CH_CD >", value, "clmRcptChCd");
            return (Criteria) this;
        }

        public Criteria andClmRcptChCdGreaterThanOrEqualTo(String value) {
            addCriterion("TOC.CLM_RCPT_CH_CD >=", value, "clmRcptChCd");
            return (Criteria) this;
        }

        public Criteria andClmRcptChCdLessThan(String value) {
            addCriterion("TOC.CLM_RCPT_CH_CD <", value, "clmRcptChCd");
            return (Criteria) this;
        }

        public Criteria andClmRcptChCdLessThanOrEqualTo(String value) {
            addCriterion("TOC.CLM_RCPT_CH_CD <=", value, "clmRcptChCd");
            return (Criteria) this;
        }

        public Criteria andClmRcptChCdLike(String value) {
            addCriterion("TOC.CLM_RCPT_CH_CD like", value, "clmRcptChCd");
            return (Criteria) this;
        }

        public Criteria andClmRcptChCdNotLike(String value) {
            addCriterion("TOC.CLM_RCPT_CH_CD not like", value, "clmRcptChCd");
            return (Criteria) this;
        }

        public Criteria andClmRcptChCdIn(List<String> values) {
            addCriterion("TOC.CLM_RCPT_CH_CD in", values, "clmRcptChCd");
            return (Criteria) this;
        }

        public Criteria andClmRcptChCdNotIn(List<String> values) {
            addCriterion("TOC.CLM_RCPT_CH_CD not in", values, "clmRcptChCd");
            return (Criteria) this;
        }

        public Criteria andClmRcptChCdBetween(String value1, String value2) {
            addCriterion("TOC.CLM_RCPT_CH_CD between", value1, value2, "clmRcptChCd");
            return (Criteria) this;
        }

        public Criteria andClmRcptChCdNotBetween(String value1, String value2) {
            addCriterion("TOC.CLM_RCPT_CH_CD not between", value1, value2, "clmRcptChCd");
            return (Criteria) this;
        }

        public Criteria andClmRcptEnvCdIsNull() {
            addCriterion("TOC.CLM_RCPT_ENV_CD is null");
            return (Criteria) this;
        }

        public Criteria andClmRcptEnvCdIsNotNull() {
            addCriterion("TOC.CLM_RCPT_ENV_CD is not null");
            return (Criteria) this;
        }

        public Criteria andClmRcptEnvCdEqualTo(String value) {
            addCriterion("TOC.CLM_RCPT_ENV_CD =", value, "clmRcptEnvCd");
            return (Criteria) this;
        }

        public Criteria andClmRcptEnvCdNotEqualTo(String value) {
            addCriterion("TOC.CLM_RCPT_ENV_CD <>", value, "clmRcptEnvCd");
            return (Criteria) this;
        }

        public Criteria andClmRcptEnvCdGreaterThan(String value) {
            addCriterion("TOC.CLM_RCPT_ENV_CD >", value, "clmRcptEnvCd");
            return (Criteria) this;
        }

        public Criteria andClmRcptEnvCdGreaterThanOrEqualTo(String value) {
            addCriterion("TOC.CLM_RCPT_ENV_CD >=", value, "clmRcptEnvCd");
            return (Criteria) this;
        }

        public Criteria andClmRcptEnvCdLessThan(String value) {
            addCriterion("TOC.CLM_RCPT_ENV_CD <", value, "clmRcptEnvCd");
            return (Criteria) this;
        }

        public Criteria andClmRcptEnvCdLessThanOrEqualTo(String value) {
            addCriterion("TOC.CLM_RCPT_ENV_CD <=", value, "clmRcptEnvCd");
            return (Criteria) this;
        }

        public Criteria andClmRcptEnvCdLike(String value) {
            addCriterion("TOC.CLM_RCPT_ENV_CD like", value, "clmRcptEnvCd");
            return (Criteria) this;
        }

        public Criteria andClmRcptEnvCdNotLike(String value) {
            addCriterion("TOC.CLM_RCPT_ENV_CD not like", value, "clmRcptEnvCd");
            return (Criteria) this;
        }

        public Criteria andClmRcptEnvCdIn(List<String> values) {
            addCriterion("TOC.CLM_RCPT_ENV_CD in", values, "clmRcptEnvCd");
            return (Criteria) this;
        }

        public Criteria andClmRcptEnvCdNotIn(List<String> values) {
            addCriterion("TOC.CLM_RCPT_ENV_CD not in", values, "clmRcptEnvCd");
            return (Criteria) this;
        }

        public Criteria andClmRcptEnvCdBetween(String value1, String value2) {
            addCriterion("TOC.CLM_RCPT_ENV_CD between", value1, value2, "clmRcptEnvCd");
            return (Criteria) this;
        }

        public Criteria andClmRcptEnvCdNotBetween(String value1, String value2) {
            addCriterion("TOC.CLM_RCPT_ENV_CD not between", value1, value2, "clmRcptEnvCd");
            return (Criteria) this;
        }

        public Criteria andClmRcptDtIsNull() {
            addCriterion("TOC.CLM_RCPT_DT is null");
            return (Criteria) this;
        }

        public Criteria andClmRcptDtIsNotNull() {
            addCriterion("TOC.CLM_RCPT_DT is not null");
            return (Criteria) this;
        }

        public Criteria andClmRcptDtEqualTo(Date value) {
            addCriterionForJDBCDate("TOC.CLM_RCPT_DT =", value, "clmRcptDt");
            return (Criteria) this;
        }

        public Criteria andClmRcptDtNotEqualTo(Date value) {
            addCriterionForJDBCDate("TOC.CLM_RCPT_DT <>", value, "clmRcptDt");
            return (Criteria) this;
        }

        public Criteria andClmRcptDtGreaterThan(Date value) {
            addCriterionForJDBCDate("TOC.CLM_RCPT_DT >", value, "clmRcptDt");
            return (Criteria) this;
        }

        public Criteria andClmRcptDtGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("TOC.CLM_RCPT_DT >=", value, "clmRcptDt");
            return (Criteria) this;
        }

        public Criteria andClmRcptDtLessThan(Date value) {
            addCriterionForJDBCDate("TOC.CLM_RCPT_DT <", value, "clmRcptDt");
            return (Criteria) this;
        }

        public Criteria andClmRcptDtLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("TOC.CLM_RCPT_DT <=", value, "clmRcptDt");
            return (Criteria) this;
        }

        public Criteria andClmRcptDtIn(List<Date> values) {
            addCriterionForJDBCDate("TOC.CLM_RCPT_DT in", values, "clmRcptDt");
            return (Criteria) this;
        }

        public Criteria andClmRcptDtNotIn(List<Date> values) {
            addCriterionForJDBCDate("TOC.CLM_RCPT_DT not in", values, "clmRcptDt");
            return (Criteria) this;
        }

        public Criteria andClmRcptDtBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("TOC.CLM_RCPT_DT between", value1, value2, "clmRcptDt");
            return (Criteria) this;
        }

        public Criteria andClmRcptDtNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("TOC.CLM_RCPT_DT not between", value1, value2, "clmRcptDt");
            return (Criteria) this;
        }

        public Criteria andClmAttrCdIsNull() {
            addCriterion("TOC.CLM_ATTR_CD is null");
            return (Criteria) this;
        }

        public Criteria andClmAttrCdIsNotNull() {
            addCriterion("TOC.CLM_ATTR_CD is not null");
            return (Criteria) this;
        }

        public Criteria andClmAttrCdEqualTo(String value) {
            addCriterion("TOC.CLM_ATTR_CD =", value, "clmAttrCd");
            return (Criteria) this;
        }

        public Criteria andClmAttrCdNotEqualTo(String value) {
            addCriterion("TOC.CLM_ATTR_CD <>", value, "clmAttrCd");
            return (Criteria) this;
        }

        public Criteria andClmAttrCdGreaterThan(String value) {
            addCriterion("TOC.CLM_ATTR_CD >", value, "clmAttrCd");
            return (Criteria) this;
        }

        public Criteria andClmAttrCdGreaterThanOrEqualTo(String value) {
            addCriterion("TOC.CLM_ATTR_CD >=", value, "clmAttrCd");
            return (Criteria) this;
        }

        public Criteria andClmAttrCdLessThan(String value) {
            addCriterion("TOC.CLM_ATTR_CD <", value, "clmAttrCd");
            return (Criteria) this;
        }

        public Criteria andClmAttrCdLessThanOrEqualTo(String value) {
            addCriterion("TOC.CLM_ATTR_CD <=", value, "clmAttrCd");
            return (Criteria) this;
        }

        public Criteria andClmAttrCdLike(String value) {
            addCriterion("TOC.CLM_ATTR_CD like", value, "clmAttrCd");
            return (Criteria) this;
        }

        public Criteria andClmAttrCdNotLike(String value) {
            addCriterion("TOC.CLM_ATTR_CD not like", value, "clmAttrCd");
            return (Criteria) this;
        }

        public Criteria andClmAttrCdIn(List<String> values) {
            addCriterion("TOC.CLM_ATTR_CD in", values, "clmAttrCd");
            return (Criteria) this;
        }

        public Criteria andClmAttrCdNotIn(List<String> values) {
            addCriterion("TOC.CLM_ATTR_CD not in", values, "clmAttrCd");
            return (Criteria) this;
        }

        public Criteria andClmAttrCdBetween(String value1, String value2) {
            addCriterion("TOC.CLM_ATTR_CD between", value1, value2, "clmAttrCd");
            return (Criteria) this;
        }

        public Criteria andClmAttrCdNotBetween(String value1, String value2) {
            addCriterion("TOC.CLM_ATTR_CD not between", value1, value2, "clmAttrCd");
            return (Criteria) this;
        }

        public Criteria andClmRsnCdIsNull() {
            addCriterion("TOC.CLM_RSN_CD is null");
            return (Criteria) this;
        }

        public Criteria andClmRsnCdIsNotNull() {
            addCriterion("TOC.CLM_RSN_CD is not null");
            return (Criteria) this;
        }

        public Criteria andClmRsnCdEqualTo(String value) {
            addCriterion("TOC.CLM_RSN_CD =", value, "clmRsnCd");
            return (Criteria) this;
        }

        public Criteria andClmRsnCdNotEqualTo(String value) {
            addCriterion("TOC.CLM_RSN_CD <>", value, "clmRsnCd");
            return (Criteria) this;
        }

        public Criteria andClmRsnCdGreaterThan(String value) {
            addCriterion("TOC.CLM_RSN_CD >", value, "clmRsnCd");
            return (Criteria) this;
        }

        public Criteria andClmRsnCdGreaterThanOrEqualTo(String value) {
            addCriterion("TOC.CLM_RSN_CD >=", value, "clmRsnCd");
            return (Criteria) this;
        }

        public Criteria andClmRsnCdLessThan(String value) {
            addCriterion("TOC.CLM_RSN_CD <", value, "clmRsnCd");
            return (Criteria) this;
        }

        public Criteria andClmRsnCdLessThanOrEqualTo(String value) {
            addCriterion("TOC.CLM_RSN_CD <=", value, "clmRsnCd");
            return (Criteria) this;
        }

        public Criteria andClmRsnCdLike(String value) {
            addCriterion("TOC.CLM_RSN_CD like", value, "clmRsnCd");
            return (Criteria) this;
        }

        public Criteria andClmRsnCdNotLike(String value) {
            addCriterion("TOC.CLM_RSN_CD not like", value, "clmRsnCd");
            return (Criteria) this;
        }

        public Criteria andClmRsnCdIn(List<String> values) {
            addCriterion("TOC.CLM_RSN_CD in", values, "clmRsnCd");
            return (Criteria) this;
        }

        public Criteria andClmRsnCdNotIn(List<String> values) {
            addCriterion("TOC.CLM_RSN_CD not in", values, "clmRsnCd");
            return (Criteria) this;
        }

        public Criteria andClmRsnCdBetween(String value1, String value2) {
            addCriterion("TOC.CLM_RSN_CD between", value1, value2, "clmRsnCd");
            return (Criteria) this;
        }

        public Criteria andClmRsnCdNotBetween(String value1, String value2) {
            addCriterion("TOC.CLM_RSN_CD not between", value1, value2, "clmRsnCd");
            return (Criteria) this;
        }

        public Criteria andClmRsnContIsNull() {
            addCriterion("TOC.CLM_RSN_CONT is null");
            return (Criteria) this;
        }

        public Criteria andClmRsnContIsNotNull() {
            addCriterion("TOC.CLM_RSN_CONT is not null");
            return (Criteria) this;
        }

        public Criteria andClmRsnContEqualTo(String value) {
            addCriterion("TOC.CLM_RSN_CONT =", value, "clmRsnCont");
            return (Criteria) this;
        }

        public Criteria andClmRsnContNotEqualTo(String value) {
            addCriterion("TOC.CLM_RSN_CONT <>", value, "clmRsnCont");
            return (Criteria) this;
        }

        public Criteria andClmRsnContGreaterThan(String value) {
            addCriterion("TOC.CLM_RSN_CONT >", value, "clmRsnCont");
            return (Criteria) this;
        }

        public Criteria andClmRsnContGreaterThanOrEqualTo(String value) {
            addCriterion("TOC.CLM_RSN_CONT >=", value, "clmRsnCont");
            return (Criteria) this;
        }

        public Criteria andClmRsnContLessThan(String value) {
            addCriterion("TOC.CLM_RSN_CONT <", value, "clmRsnCont");
            return (Criteria) this;
        }

        public Criteria andClmRsnContLessThanOrEqualTo(String value) {
            addCriterion("TOC.CLM_RSN_CONT <=", value, "clmRsnCont");
            return (Criteria) this;
        }

        public Criteria andClmRsnContLike(String value) {
            addCriterion("TOC.CLM_RSN_CONT like", value, "clmRsnCont");
            return (Criteria) this;
        }

        public Criteria andClmRsnContNotLike(String value) {
            addCriterion("TOC.CLM_RSN_CONT not like", value, "clmRsnCont");
            return (Criteria) this;
        }

        public Criteria andClmRsnContIn(List<String> values) {
            addCriterion("TOC.CLM_RSN_CONT in", values, "clmRsnCont");
            return (Criteria) this;
        }

        public Criteria andClmRsnContNotIn(List<String> values) {
            addCriterion("TOC.CLM_RSN_CONT not in", values, "clmRsnCont");
            return (Criteria) this;
        }

        public Criteria andClmRsnContBetween(String value1, String value2) {
            addCriterion("TOC.CLM_RSN_CONT between", value1, value2, "clmRsnCont");
            return (Criteria) this;
        }

        public Criteria andClmRsnContNotBetween(String value1, String value2) {
            addCriterion("TOC.CLM_RSN_CONT not between", value1, value2, "clmRsnCont");
            return (Criteria) this;
        }

        public Criteria andRfdMthdIsNull() {
            addCriterion("TOC.RFD_MTHD is null");
            return (Criteria) this;
        }

        public Criteria andRfdMthdIsNotNull() {
            addCriterion("TOC.RFD_MTHD is not null");
            return (Criteria) this;
        }

        public Criteria andRfdMthdEqualTo(String value) {
            addCriterion("TOC.RFD_MTHD =", value, "rfdMthd");
            return (Criteria) this;
        }

        public Criteria andRfdMthdNotEqualTo(String value) {
            addCriterion("TOC.RFD_MTHD <>", value, "rfdMthd");
            return (Criteria) this;
        }

        public Criteria andRfdMthdGreaterThan(String value) {
            addCriterion("TOC.RFD_MTHD >", value, "rfdMthd");
            return (Criteria) this;
        }

        public Criteria andRfdMthdGreaterThanOrEqualTo(String value) {
            addCriterion("TOC.RFD_MTHD >=", value, "rfdMthd");
            return (Criteria) this;
        }

        public Criteria andRfdMthdLessThan(String value) {
            addCriterion("TOC.RFD_MTHD <", value, "rfdMthd");
            return (Criteria) this;
        }

        public Criteria andRfdMthdLessThanOrEqualTo(String value) {
            addCriterion("TOC.RFD_MTHD <=", value, "rfdMthd");
            return (Criteria) this;
        }

        public Criteria andRfdMthdLike(String value) {
            addCriterion("TOC.RFD_MTHD like", value, "rfdMthd");
            return (Criteria) this;
        }

        public Criteria andRfdMthdNotLike(String value) {
            addCriterion("TOC.RFD_MTHD not like", value, "rfdMthd");
            return (Criteria) this;
        }

        public Criteria andRfdMthdIn(List<String> values) {
            addCriterion("TOC.RFD_MTHD in", values, "rfdMthd");
            return (Criteria) this;
        }

        public Criteria andRfdMthdNotIn(List<String> values) {
            addCriterion("TOC.RFD_MTHD not in", values, "rfdMthd");
            return (Criteria) this;
        }

        public Criteria andRfdMthdBetween(String value1, String value2) {
            addCriterion("TOC.RFD_MTHD between", value1, value2, "rfdMthd");
            return (Criteria) this;
        }

        public Criteria andRfdMthdNotBetween(String value1, String value2) {
            addCriterion("TOC.RFD_MTHD not between", value1, value2, "rfdMthd");
            return (Criteria) this;
        }

        public Criteria andCpnDcRtnAmtIsNull() {
            addCriterion("TOC.CPN_DC_RTN_AMT is null");
            return (Criteria) this;
        }

        public Criteria andCpnDcRtnAmtIsNotNull() {
            addCriterion("TOC.CPN_DC_RTN_AMT is not null");
            return (Criteria) this;
        }

        public Criteria andCpnDcRtnAmtEqualTo(Integer value) {
            addCriterion("TOC.CPN_DC_RTN_AMT =", value, "cpnDcRtnAmt");
            return (Criteria) this;
        }

        public Criteria andCpnDcRtnAmtNotEqualTo(Integer value) {
            addCriterion("TOC.CPN_DC_RTN_AMT <>", value, "cpnDcRtnAmt");
            return (Criteria) this;
        }

        public Criteria andCpnDcRtnAmtGreaterThan(Integer value) {
            addCriterion("TOC.CPN_DC_RTN_AMT >", value, "cpnDcRtnAmt");
            return (Criteria) this;
        }

        public Criteria andCpnDcRtnAmtGreaterThanOrEqualTo(Integer value) {
            addCriterion("TOC.CPN_DC_RTN_AMT >=", value, "cpnDcRtnAmt");
            return (Criteria) this;
        }

        public Criteria andCpnDcRtnAmtLessThan(Integer value) {
            addCriterion("TOC.CPN_DC_RTN_AMT <", value, "cpnDcRtnAmt");
            return (Criteria) this;
        }

        public Criteria andCpnDcRtnAmtLessThanOrEqualTo(Integer value) {
            addCriterion("TOC.CPN_DC_RTN_AMT <=", value, "cpnDcRtnAmt");
            return (Criteria) this;
        }

        public Criteria andCpnDcRtnAmtIn(List<Integer> values) {
            addCriterion("TOC.CPN_DC_RTN_AMT in", values, "cpnDcRtnAmt");
            return (Criteria) this;
        }

        public Criteria andCpnDcRtnAmtNotIn(List<Integer> values) {
            addCriterion("TOC.CPN_DC_RTN_AMT not in", values, "cpnDcRtnAmt");
            return (Criteria) this;
        }

        public Criteria andCpnDcRtnAmtBetween(Integer value1, Integer value2) {
            addCriterion("TOC.CPN_DC_RTN_AMT between", value1, value2, "cpnDcRtnAmt");
            return (Criteria) this;
        }

        public Criteria andCpnDcRtnAmtNotBetween(Integer value1, Integer value2) {
            addCriterion("TOC.CPN_DC_RTN_AMT not between", value1, value2, "cpnDcRtnAmt");
            return (Criteria) this;
        }

        public Criteria andPtUseRtnAmtIsNull() {
            addCriterion("TOC.PT_USE_RTN_AMT is null");
            return (Criteria) this;
        }

        public Criteria andPtUseRtnAmtIsNotNull() {
            addCriterion("TOC.PT_USE_RTN_AMT is not null");
            return (Criteria) this;
        }

        public Criteria andPtUseRtnAmtEqualTo(Integer value) {
            addCriterion("TOC.PT_USE_RTN_AMT =", value, "ptUseRtnAmt");
            return (Criteria) this;
        }

        public Criteria andPtUseRtnAmtNotEqualTo(Integer value) {
            addCriterion("TOC.PT_USE_RTN_AMT <>", value, "ptUseRtnAmt");
            return (Criteria) this;
        }

        public Criteria andPtUseRtnAmtGreaterThan(Integer value) {
            addCriterion("TOC.PT_USE_RTN_AMT >", value, "ptUseRtnAmt");
            return (Criteria) this;
        }

        public Criteria andPtUseRtnAmtGreaterThanOrEqualTo(Integer value) {
            addCriterion("TOC.PT_USE_RTN_AMT >=", value, "ptUseRtnAmt");
            return (Criteria) this;
        }

        public Criteria andPtUseRtnAmtLessThan(Integer value) {
            addCriterion("TOC.PT_USE_RTN_AMT <", value, "ptUseRtnAmt");
            return (Criteria) this;
        }

        public Criteria andPtUseRtnAmtLessThanOrEqualTo(Integer value) {
            addCriterion("TOC.PT_USE_RTN_AMT <=", value, "ptUseRtnAmt");
            return (Criteria) this;
        }

        public Criteria andPtUseRtnAmtIn(List<Integer> values) {
            addCriterion("TOC.PT_USE_RTN_AMT in", values, "ptUseRtnAmt");
            return (Criteria) this;
        }

        public Criteria andPtUseRtnAmtNotIn(List<Integer> values) {
            addCriterion("TOC.PT_USE_RTN_AMT not in", values, "ptUseRtnAmt");
            return (Criteria) this;
        }

        public Criteria andPtUseRtnAmtBetween(Integer value1, Integer value2) {
            addCriterion("TOC.PT_USE_RTN_AMT between", value1, value2, "ptUseRtnAmt");
            return (Criteria) this;
        }

        public Criteria andPtUseRtnAmtNotBetween(Integer value1, Integer value2) {
            addCriterion("TOC.PT_USE_RTN_AMT not between", value1, value2, "ptUseRtnAmt");
            return (Criteria) this;
        }

        public Criteria andClmAmtIsNull() {
            addCriterion("TOC.CLM_AMT is null");
            return (Criteria) this;
        }

        public Criteria andClmAmtIsNotNull() {
            addCriterion("TOC.CLM_AMT is not null");
            return (Criteria) this;
        }

        public Criteria andClmAmtEqualTo(Integer value) {
            addCriterion("TOC.CLM_AMT =", value, "clmAmt");
            return (Criteria) this;
        }

        public Criteria andClmAmtNotEqualTo(Integer value) {
            addCriterion("TOC.CLM_AMT <>", value, "clmAmt");
            return (Criteria) this;
        }

        public Criteria andClmAmtGreaterThan(Integer value) {
            addCriterion("TOC.CLM_AMT >", value, "clmAmt");
            return (Criteria) this;
        }

        public Criteria andClmAmtGreaterThanOrEqualTo(Integer value) {
            addCriterion("TOC.CLM_AMT >=", value, "clmAmt");
            return (Criteria) this;
        }

        public Criteria andClmAmtLessThan(Integer value) {
            addCriterion("TOC.CLM_AMT <", value, "clmAmt");
            return (Criteria) this;
        }

        public Criteria andClmAmtLessThanOrEqualTo(Integer value) {
            addCriterion("TOC.CLM_AMT <=", value, "clmAmt");
            return (Criteria) this;
        }

        public Criteria andClmAmtIn(List<Integer> values) {
            addCriterion("TOC.CLM_AMT in", values, "clmAmt");
            return (Criteria) this;
        }

        public Criteria andClmAmtNotIn(List<Integer> values) {
            addCriterion("TOC.CLM_AMT not in", values, "clmAmt");
            return (Criteria) this;
        }

        public Criteria andClmAmtBetween(Integer value1, Integer value2) {
            addCriterion("TOC.CLM_AMT between", value1, value2, "clmAmt");
            return (Criteria) this;
        }

        public Criteria andClmAmtNotBetween(Integer value1, Integer value2) {
            addCriterion("TOC.CLM_AMT not between", value1, value2, "clmAmt");
            return (Criteria) this;
        }

        public Criteria andRealClmAmtIsNull() {
            addCriterion("TOC.REAL_CLM_AMT is null");
            return (Criteria) this;
        }

        public Criteria andRealClmAmtIsNotNull() {
            addCriterion("TOC.REAL_CLM_AMT is not null");
            return (Criteria) this;
        }

        public Criteria andRealClmAmtEqualTo(Integer value) {
            addCriterion("TOC.REAL_CLM_AMT =", value, "realClmAmt");
            return (Criteria) this;
        }

        public Criteria andRealClmAmtNotEqualTo(Integer value) {
            addCriterion("TOC.REAL_CLM_AMT <>", value, "realClmAmt");
            return (Criteria) this;
        }

        public Criteria andRealClmAmtGreaterThan(Integer value) {
            addCriterion("TOC.REAL_CLM_AMT >", value, "realClmAmt");
            return (Criteria) this;
        }

        public Criteria andRealClmAmtGreaterThanOrEqualTo(Integer value) {
            addCriterion("TOC.REAL_CLM_AMT >=", value, "realClmAmt");
            return (Criteria) this;
        }

        public Criteria andRealClmAmtLessThan(Integer value) {
            addCriterion("TOC.REAL_CLM_AMT <", value, "realClmAmt");
            return (Criteria) this;
        }

        public Criteria andRealClmAmtLessThanOrEqualTo(Integer value) {
            addCriterion("TOC.REAL_CLM_AMT <=", value, "realClmAmt");
            return (Criteria) this;
        }

        public Criteria andRealClmAmtIn(List<Integer> values) {
            addCriterion("TOC.REAL_CLM_AMT in", values, "realClmAmt");
            return (Criteria) this;
        }

        public Criteria andRealClmAmtNotIn(List<Integer> values) {
            addCriterion("TOC.REAL_CLM_AMT not in", values, "realClmAmt");
            return (Criteria) this;
        }

        public Criteria andRealClmAmtBetween(Integer value1, Integer value2) {
            addCriterion("TOC.REAL_CLM_AMT between", value1, value2, "realClmAmt");
            return (Criteria) this;
        }

        public Criteria andRealClmAmtNotBetween(Integer value1, Integer value2) {
            addCriterion("TOC.REAL_CLM_AMT not between", value1, value2, "realClmAmt");
            return (Criteria) this;
        }

        public Criteria andPayCpltDtIsNull() {
            addCriterion("TOC.PAY_CPLT_DT is null");
            return (Criteria) this;
        }

        public Criteria andPayCpltDtIsNotNull() {
            addCriterion("TOC.PAY_CPLT_DT is not null");
            return (Criteria) this;
        }

        public Criteria andPayCpltDtEqualTo(Date value) {
            addCriterionForJDBCDate("TOC.PAY_CPLT_DT =", value, "payCpltDt");
            return (Criteria) this;
        }

        public Criteria andPayCpltDtNotEqualTo(Date value) {
            addCriterionForJDBCDate("TOC.PAY_CPLT_DT <>", value, "payCpltDt");
            return (Criteria) this;
        }

        public Criteria andPayCpltDtGreaterThan(Date value) {
            addCriterionForJDBCDate("TOC.PAY_CPLT_DT >", value, "payCpltDt");
            return (Criteria) this;
        }

        public Criteria andPayCpltDtGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("TOC.PAY_CPLT_DT >=", value, "payCpltDt");
            return (Criteria) this;
        }

        public Criteria andPayCpltDtLessThan(Date value) {
            addCriterionForJDBCDate("TOC.PAY_CPLT_DT <", value, "payCpltDt");
            return (Criteria) this;
        }

        public Criteria andPayCpltDtLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("TOC.PAY_CPLT_DT <=", value, "payCpltDt");
            return (Criteria) this;
        }

        public Criteria andPayCpltDtIn(List<Date> values) {
            addCriterionForJDBCDate("TOC.PAY_CPLT_DT in", values, "payCpltDt");
            return (Criteria) this;
        }

        public Criteria andPayCpltDtNotIn(List<Date> values) {
            addCriterionForJDBCDate("TOC.PAY_CPLT_DT not in", values, "payCpltDt");
            return (Criteria) this;
        }

        public Criteria andPayCpltDtBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("TOC.PAY_CPLT_DT between", value1, value2, "payCpltDt");
            return (Criteria) this;
        }

        public Criteria andPayCpltDtNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("TOC.PAY_CPLT_DT not between", value1, value2, "payCpltDt");
            return (Criteria) this;
        }

        public Criteria andRfdCpltDtIsNull() {
            addCriterion("TOC.RFD_CPLT_DT is null");
            return (Criteria) this;
        }

        public Criteria andRfdCpltDtIsNotNull() {
            addCriterion("TOC.RFD_CPLT_DT is not null");
            return (Criteria) this;
        }

        public Criteria andRfdCpltDtEqualTo(Date value) {
            addCriterionForJDBCDate("TOC.RFD_CPLT_DT =", value, "rfdCpltDt");
            return (Criteria) this;
        }

        public Criteria andRfdCpltDtNotEqualTo(Date value) {
            addCriterionForJDBCDate("TOC.RFD_CPLT_DT <>", value, "rfdCpltDt");
            return (Criteria) this;
        }

        public Criteria andRfdCpltDtGreaterThan(Date value) {
            addCriterionForJDBCDate("TOC.RFD_CPLT_DT >", value, "rfdCpltDt");
            return (Criteria) this;
        }

        public Criteria andRfdCpltDtGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("TOC.RFD_CPLT_DT >=", value, "rfdCpltDt");
            return (Criteria) this;
        }

        public Criteria andRfdCpltDtLessThan(Date value) {
            addCriterionForJDBCDate("TOC.RFD_CPLT_DT <", value, "rfdCpltDt");
            return (Criteria) this;
        }

        public Criteria andRfdCpltDtLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("TOC.RFD_CPLT_DT <=", value, "rfdCpltDt");
            return (Criteria) this;
        }

        public Criteria andRfdCpltDtIn(List<Date> values) {
            addCriterionForJDBCDate("TOC.RFD_CPLT_DT in", values, "rfdCpltDt");
            return (Criteria) this;
        }

        public Criteria andRfdCpltDtNotIn(List<Date> values) {
            addCriterionForJDBCDate("TOC.RFD_CPLT_DT not in", values, "rfdCpltDt");
            return (Criteria) this;
        }

        public Criteria andRfdCpltDtBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("TOC.RFD_CPLT_DT between", value1, value2, "rfdCpltDt");
            return (Criteria) this;
        }

        public Criteria andRfdCpltDtNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("TOC.RFD_CPLT_DT not between", value1, value2, "rfdCpltDt");
            return (Criteria) this;
        }

        public Criteria andRegDtIsNull() {
            addCriterion("TOC.REG_DT is null");
            return (Criteria) this;
        }

        public Criteria andRegDtIsNotNull() {
            addCriterion("TOC.REG_DT is not null");
            return (Criteria) this;
        }

        public Criteria andRegDtEqualTo(Date value) {
            addCriterion("TOC.REG_DT =", value, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtNotEqualTo(Date value) {
            addCriterion("TOC.REG_DT <>", value, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtGreaterThan(Date value) {
            addCriterion("TOC.REG_DT >", value, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtGreaterThanOrEqualTo(Date value) {
            addCriterion("TOC.REG_DT >=", value, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtLessThan(Date value) {
            addCriterion("TOC.REG_DT <", value, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtLessThanOrEqualTo(Date value) {
            addCriterion("TOC.REG_DT <=", value, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtIn(List<Date> values) {
            addCriterion("TOC.REG_DT in", values, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtNotIn(List<Date> values) {
            addCriterion("TOC.REG_DT not in", values, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtBetween(Date value1, Date value2) {
            addCriterion("TOC.REG_DT between", value1, value2, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtNotBetween(Date value1, Date value2) {
            addCriterion("TOC.REG_DT not between", value1, value2, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegIdIsNull() {
            addCriterion("TOC.REG_ID is null");
            return (Criteria) this;
        }

        public Criteria andRegIdIsNotNull() {
            addCriterion("TOC.REG_ID is not null");
            return (Criteria) this;
        }

        public Criteria andRegIdEqualTo(String value) {
            addCriterion("TOC.REG_ID =", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdNotEqualTo(String value) {
            addCriterion("TOC.REG_ID <>", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdGreaterThan(String value) {
            addCriterion("TOC.REG_ID >", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdGreaterThanOrEqualTo(String value) {
            addCriterion("TOC.REG_ID >=", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdLessThan(String value) {
            addCriterion("TOC.REG_ID <", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdLessThanOrEqualTo(String value) {
            addCriterion("TOC.REG_ID <=", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdLike(String value) {
            addCriterion("TOC.REG_ID like", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdNotLike(String value) {
            addCriterion("TOC.REG_ID not like", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdIn(List<String> values) {
            addCriterion("TOC.REG_ID in", values, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdNotIn(List<String> values) {
            addCriterion("TOC.REG_ID not in", values, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdBetween(String value1, String value2) {
            addCriterion("TOC.REG_ID between", value1, value2, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdNotBetween(String value1, String value2) {
            addCriterion("TOC.REG_ID not between", value1, value2, "regId");
            return (Criteria) this;
        }

        public Criteria andOrdClmNoLikeInsensitive(String value) {
            addCriterion("upper(TOC.ORD_CLM_NO) like", value.toUpperCase(), "ordClmNo");
            return (Criteria) this;
        }

        public Criteria andClmTpCdLikeInsensitive(String value) {
            addCriterion("upper(TOC.CLM_TP_CD) like", value.toUpperCase(), "clmTpCd");
            return (Criteria) this;
        }

        public Criteria andClmRcptChCdLikeInsensitive(String value) {
            addCriterion("upper(TOC.CLM_RCPT_CH_CD) like", value.toUpperCase(), "clmRcptChCd");
            return (Criteria) this;
        }

        public Criteria andClmRcptEnvCdLikeInsensitive(String value) {
            addCriterion("upper(TOC.CLM_RCPT_ENV_CD) like", value.toUpperCase(), "clmRcptEnvCd");
            return (Criteria) this;
        }

        public Criteria andClmAttrCdLikeInsensitive(String value) {
            addCriterion("upper(TOC.CLM_ATTR_CD) like", value.toUpperCase(), "clmAttrCd");
            return (Criteria) this;
        }

        public Criteria andClmRsnCdLikeInsensitive(String value) {
            addCriterion("upper(TOC.CLM_RSN_CD) like", value.toUpperCase(), "clmRsnCd");
            return (Criteria) this;
        }

        public Criteria andClmRsnContLikeInsensitive(String value) {
            addCriterion("upper(TOC.CLM_RSN_CONT) like", value.toUpperCase(), "clmRsnCont");
            return (Criteria) this;
        }

        public Criteria andRfdMthdLikeInsensitive(String value) {
            addCriterion("upper(TOC.RFD_MTHD) like", value.toUpperCase(), "rfdMthd");
            return (Criteria) this;
        }

        public Criteria andRegIdLikeInsensitive(String value) {
            addCriterion("upper(TOC.REG_ID) like", value.toUpperCase(), "regId");
            return (Criteria) this;
        }

        public Criteria andOrdClmNoLikeLeft(String value) {
            addCriterion("TOC.ORD_CLM_NO like ", "%" + value, "ordClmNo");
            return (Criteria) this;
        }

        public Criteria andOrdClmNoLikeRight(String value) {
            addCriterion("TOC.ORD_CLM_NO like ", value + "%", "ordClmNo");
            return (Criteria) this;
        }

        public Criteria andOrdClmNoLikeBoth(String value) {
            addCriterion("TOC.ORD_CLM_NO like ", "%" + value + "%", "ordClmNo");
            return (Criteria) this;
        }

        public Criteria andClmTpCdLikeLeft(String value) {
            addCriterion("TOC.CLM_TP_CD like ", "%" + value, "clmTpCd");
            return (Criteria) this;
        }

        public Criteria andClmTpCdLikeRight(String value) {
            addCriterion("TOC.CLM_TP_CD like ", value + "%", "clmTpCd");
            return (Criteria) this;
        }

        public Criteria andClmTpCdLikeBoth(String value) {
            addCriterion("TOC.CLM_TP_CD like ", "%" + value + "%", "clmTpCd");
            return (Criteria) this;
        }

        public Criteria andClmRcptChCdLikeLeft(String value) {
            addCriterion("TOC.CLM_RCPT_CH_CD like ", "%" + value, "clmRcptChCd");
            return (Criteria) this;
        }

        public Criteria andClmRcptChCdLikeRight(String value) {
            addCriterion("TOC.CLM_RCPT_CH_CD like ", value + "%", "clmRcptChCd");
            return (Criteria) this;
        }

        public Criteria andClmRcptChCdLikeBoth(String value) {
            addCriterion("TOC.CLM_RCPT_CH_CD like ", "%" + value + "%", "clmRcptChCd");
            return (Criteria) this;
        }

        public Criteria andClmRcptEnvCdLikeLeft(String value) {
            addCriterion("TOC.CLM_RCPT_ENV_CD like ", "%" + value, "clmRcptEnvCd");
            return (Criteria) this;
        }

        public Criteria andClmRcptEnvCdLikeRight(String value) {
            addCriterion("TOC.CLM_RCPT_ENV_CD like ", value + "%", "clmRcptEnvCd");
            return (Criteria) this;
        }

        public Criteria andClmRcptEnvCdLikeBoth(String value) {
            addCriterion("TOC.CLM_RCPT_ENV_CD like ", "%" + value + "%", "clmRcptEnvCd");
            return (Criteria) this;
        }

        public Criteria andClmAttrCdLikeLeft(String value) {
            addCriterion("TOC.CLM_ATTR_CD like ", "%" + value, "clmAttrCd");
            return (Criteria) this;
        }

        public Criteria andClmAttrCdLikeRight(String value) {
            addCriterion("TOC.CLM_ATTR_CD like ", value + "%", "clmAttrCd");
            return (Criteria) this;
        }

        public Criteria andClmAttrCdLikeBoth(String value) {
            addCriterion("TOC.CLM_ATTR_CD like ", "%" + value + "%", "clmAttrCd");
            return (Criteria) this;
        }

        public Criteria andClmRsnCdLikeLeft(String value) {
            addCriterion("TOC.CLM_RSN_CD like ", "%" + value, "clmRsnCd");
            return (Criteria) this;
        }

        public Criteria andClmRsnCdLikeRight(String value) {
            addCriterion("TOC.CLM_RSN_CD like ", value + "%", "clmRsnCd");
            return (Criteria) this;
        }

        public Criteria andClmRsnCdLikeBoth(String value) {
            addCriterion("TOC.CLM_RSN_CD like ", "%" + value + "%", "clmRsnCd");
            return (Criteria) this;
        }

        public Criteria andClmRsnContLikeLeft(String value) {
            addCriterion("TOC.CLM_RSN_CONT like ", "%" + value, "clmRsnCont");
            return (Criteria) this;
        }

        public Criteria andClmRsnContLikeRight(String value) {
            addCriterion("TOC.CLM_RSN_CONT like ", value + "%", "clmRsnCont");
            return (Criteria) this;
        }

        public Criteria andClmRsnContLikeBoth(String value) {
            addCriterion("TOC.CLM_RSN_CONT like ", "%" + value + "%", "clmRsnCont");
            return (Criteria) this;
        }

        public Criteria andRfdMthdLikeLeft(String value) {
            addCriterion("TOC.RFD_MTHD like ", "%" + value, "rfdMthd");
            return (Criteria) this;
        }

        public Criteria andRfdMthdLikeRight(String value) {
            addCriterion("TOC.RFD_MTHD like ", value + "%", "rfdMthd");
            return (Criteria) this;
        }

        public Criteria andRfdMthdLikeBoth(String value) {
            addCriterion("TOC.RFD_MTHD like ", "%" + value + "%", "rfdMthd");
            return (Criteria) this;
        }

        public Criteria andRegIdLikeLeft(String value) {
            addCriterion("TOC.REG_ID like ", "%" + value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdLikeRight(String value) {
            addCriterion("TOC.REG_ID like ", value + "%", "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdLikeBoth(String value) {
            addCriterion("TOC.REG_ID like ", "%" + value + "%", "regId");
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