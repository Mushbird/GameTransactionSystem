package com.mushbird.sinsege.base.module.order.model.entity.criteria;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class OrderClaimChangeHistoryEntityCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    public OrderClaimChangeHistoryEntityCriteria() {
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

        public Criteria andOrdClmChistIdIsNull() {
            addCriterion("TOCCH.ORD_CLM_CHIST_ID is null");
            return (Criteria) this;
        }

        public Criteria andOrdClmChistIdIsNotNull() {
            addCriterion("TOCCH.ORD_CLM_CHIST_ID is not null");
            return (Criteria) this;
        }

        public Criteria andOrdClmChistIdEqualTo(Integer value) {
            addCriterion("TOCCH.ORD_CLM_CHIST_ID =", value, "ordClmChistId");
            return (Criteria) this;
        }

        public Criteria andOrdClmChistIdNotEqualTo(Integer value) {
            addCriterion("TOCCH.ORD_CLM_CHIST_ID <>", value, "ordClmChistId");
            return (Criteria) this;
        }

        public Criteria andOrdClmChistIdGreaterThan(Integer value) {
            addCriterion("TOCCH.ORD_CLM_CHIST_ID >", value, "ordClmChistId");
            return (Criteria) this;
        }

        public Criteria andOrdClmChistIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("TOCCH.ORD_CLM_CHIST_ID >=", value, "ordClmChistId");
            return (Criteria) this;
        }

        public Criteria andOrdClmChistIdLessThan(Integer value) {
            addCriterion("TOCCH.ORD_CLM_CHIST_ID <", value, "ordClmChistId");
            return (Criteria) this;
        }

        public Criteria andOrdClmChistIdLessThanOrEqualTo(Integer value) {
            addCriterion("TOCCH.ORD_CLM_CHIST_ID <=", value, "ordClmChistId");
            return (Criteria) this;
        }

        public Criteria andOrdClmChistIdIn(List<Integer> values) {
            addCriterion("TOCCH.ORD_CLM_CHIST_ID in", values, "ordClmChistId");
            return (Criteria) this;
        }

        public Criteria andOrdClmChistIdNotIn(List<Integer> values) {
            addCriterion("TOCCH.ORD_CLM_CHIST_ID not in", values, "ordClmChistId");
            return (Criteria) this;
        }

        public Criteria andOrdClmChistIdBetween(Integer value1, Integer value2) {
            addCriterion("TOCCH.ORD_CLM_CHIST_ID between", value1, value2, "ordClmChistId");
            return (Criteria) this;
        }

        public Criteria andOrdClmChistIdNotBetween(Integer value1, Integer value2) {
            addCriterion("TOCCH.ORD_CLM_CHIST_ID not between", value1, value2, "ordClmChistId");
            return (Criteria) this;
        }

        public Criteria andOrdClmIdIsNull() {
            addCriterion("TOCCH.ORD_CLM_ID is null");
            return (Criteria) this;
        }

        public Criteria andOrdClmIdIsNotNull() {
            addCriterion("TOCCH.ORD_CLM_ID is not null");
            return (Criteria) this;
        }

        public Criteria andOrdClmIdEqualTo(Integer value) {
            addCriterion("TOCCH.ORD_CLM_ID =", value, "ordClmId");
            return (Criteria) this;
        }

        public Criteria andOrdClmIdNotEqualTo(Integer value) {
            addCriterion("TOCCH.ORD_CLM_ID <>", value, "ordClmId");
            return (Criteria) this;
        }

        public Criteria andOrdClmIdGreaterThan(Integer value) {
            addCriterion("TOCCH.ORD_CLM_ID >", value, "ordClmId");
            return (Criteria) this;
        }

        public Criteria andOrdClmIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("TOCCH.ORD_CLM_ID >=", value, "ordClmId");
            return (Criteria) this;
        }

        public Criteria andOrdClmIdLessThan(Integer value) {
            addCriterion("TOCCH.ORD_CLM_ID <", value, "ordClmId");
            return (Criteria) this;
        }

        public Criteria andOrdClmIdLessThanOrEqualTo(Integer value) {
            addCriterion("TOCCH.ORD_CLM_ID <=", value, "ordClmId");
            return (Criteria) this;
        }

        public Criteria andOrdClmIdIn(List<Integer> values) {
            addCriterion("TOCCH.ORD_CLM_ID in", values, "ordClmId");
            return (Criteria) this;
        }

        public Criteria andOrdClmIdNotIn(List<Integer> values) {
            addCriterion("TOCCH.ORD_CLM_ID not in", values, "ordClmId");
            return (Criteria) this;
        }

        public Criteria andOrdClmIdBetween(Integer value1, Integer value2) {
            addCriterion("TOCCH.ORD_CLM_ID between", value1, value2, "ordClmId");
            return (Criteria) this;
        }

        public Criteria andOrdClmIdNotBetween(Integer value1, Integer value2) {
            addCriterion("TOCCH.ORD_CLM_ID not between", value1, value2, "ordClmId");
            return (Criteria) this;
        }

        public Criteria andOrdIdIsNull() {
            addCriterion("TOCCH.ORD_ID is null");
            return (Criteria) this;
        }

        public Criteria andOrdIdIsNotNull() {
            addCriterion("TOCCH.ORD_ID is not null");
            return (Criteria) this;
        }

        public Criteria andOrdIdEqualTo(Integer value) {
            addCriterion("TOCCH.ORD_ID =", value, "ordId");
            return (Criteria) this;
        }

        public Criteria andOrdIdNotEqualTo(Integer value) {
            addCriterion("TOCCH.ORD_ID <>", value, "ordId");
            return (Criteria) this;
        }

        public Criteria andOrdIdGreaterThan(Integer value) {
            addCriterion("TOCCH.ORD_ID >", value, "ordId");
            return (Criteria) this;
        }

        public Criteria andOrdIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("TOCCH.ORD_ID >=", value, "ordId");
            return (Criteria) this;
        }

        public Criteria andOrdIdLessThan(Integer value) {
            addCriterion("TOCCH.ORD_ID <", value, "ordId");
            return (Criteria) this;
        }

        public Criteria andOrdIdLessThanOrEqualTo(Integer value) {
            addCriterion("TOCCH.ORD_ID <=", value, "ordId");
            return (Criteria) this;
        }

        public Criteria andOrdIdIn(List<Integer> values) {
            addCriterion("TOCCH.ORD_ID in", values, "ordId");
            return (Criteria) this;
        }

        public Criteria andOrdIdNotIn(List<Integer> values) {
            addCriterion("TOCCH.ORD_ID not in", values, "ordId");
            return (Criteria) this;
        }

        public Criteria andOrdIdBetween(Integer value1, Integer value2) {
            addCriterion("TOCCH.ORD_ID between", value1, value2, "ordId");
            return (Criteria) this;
        }

        public Criteria andOrdIdNotBetween(Integer value1, Integer value2) {
            addCriterion("TOCCH.ORD_ID not between", value1, value2, "ordId");
            return (Criteria) this;
        }

        public Criteria andOrdClmNoIsNull() {
            addCriterion("TOCCH.ORD_CLM_NO is null");
            return (Criteria) this;
        }

        public Criteria andOrdClmNoIsNotNull() {
            addCriterion("TOCCH.ORD_CLM_NO is not null");
            return (Criteria) this;
        }

        public Criteria andOrdClmNoEqualTo(String value) {
            addCriterion("TOCCH.ORD_CLM_NO =", value, "ordClmNo");
            return (Criteria) this;
        }

        public Criteria andOrdClmNoNotEqualTo(String value) {
            addCriterion("TOCCH.ORD_CLM_NO <>", value, "ordClmNo");
            return (Criteria) this;
        }

        public Criteria andOrdClmNoGreaterThan(String value) {
            addCriterion("TOCCH.ORD_CLM_NO >", value, "ordClmNo");
            return (Criteria) this;
        }

        public Criteria andOrdClmNoGreaterThanOrEqualTo(String value) {
            addCriterion("TOCCH.ORD_CLM_NO >=", value, "ordClmNo");
            return (Criteria) this;
        }

        public Criteria andOrdClmNoLessThan(String value) {
            addCriterion("TOCCH.ORD_CLM_NO <", value, "ordClmNo");
            return (Criteria) this;
        }

        public Criteria andOrdClmNoLessThanOrEqualTo(String value) {
            addCriterion("TOCCH.ORD_CLM_NO <=", value, "ordClmNo");
            return (Criteria) this;
        }

        public Criteria andOrdClmNoLike(String value) {
            addCriterion("TOCCH.ORD_CLM_NO like", value, "ordClmNo");
            return (Criteria) this;
        }

        public Criteria andOrdClmNoNotLike(String value) {
            addCriterion("TOCCH.ORD_CLM_NO not like", value, "ordClmNo");
            return (Criteria) this;
        }

        public Criteria andOrdClmNoIn(List<String> values) {
            addCriterion("TOCCH.ORD_CLM_NO in", values, "ordClmNo");
            return (Criteria) this;
        }

        public Criteria andOrdClmNoNotIn(List<String> values) {
            addCriterion("TOCCH.ORD_CLM_NO not in", values, "ordClmNo");
            return (Criteria) this;
        }

        public Criteria andOrdClmNoBetween(String value1, String value2) {
            addCriterion("TOCCH.ORD_CLM_NO between", value1, value2, "ordClmNo");
            return (Criteria) this;
        }

        public Criteria andOrdClmNoNotBetween(String value1, String value2) {
            addCriterion("TOCCH.ORD_CLM_NO not between", value1, value2, "ordClmNo");
            return (Criteria) this;
        }

        public Criteria andClmTpCdIsNull() {
            addCriterion("TOCCH.CLM_TP_CD is null");
            return (Criteria) this;
        }

        public Criteria andClmTpCdIsNotNull() {
            addCriterion("TOCCH.CLM_TP_CD is not null");
            return (Criteria) this;
        }

        public Criteria andClmTpCdEqualTo(String value) {
            addCriterion("TOCCH.CLM_TP_CD =", value, "clmTpCd");
            return (Criteria) this;
        }

        public Criteria andClmTpCdNotEqualTo(String value) {
            addCriterion("TOCCH.CLM_TP_CD <>", value, "clmTpCd");
            return (Criteria) this;
        }

        public Criteria andClmTpCdGreaterThan(String value) {
            addCriterion("TOCCH.CLM_TP_CD >", value, "clmTpCd");
            return (Criteria) this;
        }

        public Criteria andClmTpCdGreaterThanOrEqualTo(String value) {
            addCriterion("TOCCH.CLM_TP_CD >=", value, "clmTpCd");
            return (Criteria) this;
        }

        public Criteria andClmTpCdLessThan(String value) {
            addCriterion("TOCCH.CLM_TP_CD <", value, "clmTpCd");
            return (Criteria) this;
        }

        public Criteria andClmTpCdLessThanOrEqualTo(String value) {
            addCriterion("TOCCH.CLM_TP_CD <=", value, "clmTpCd");
            return (Criteria) this;
        }

        public Criteria andClmTpCdLike(String value) {
            addCriterion("TOCCH.CLM_TP_CD like", value, "clmTpCd");
            return (Criteria) this;
        }

        public Criteria andClmTpCdNotLike(String value) {
            addCriterion("TOCCH.CLM_TP_CD not like", value, "clmTpCd");
            return (Criteria) this;
        }

        public Criteria andClmTpCdIn(List<String> values) {
            addCriterion("TOCCH.CLM_TP_CD in", values, "clmTpCd");
            return (Criteria) this;
        }

        public Criteria andClmTpCdNotIn(List<String> values) {
            addCriterion("TOCCH.CLM_TP_CD not in", values, "clmTpCd");
            return (Criteria) this;
        }

        public Criteria andClmTpCdBetween(String value1, String value2) {
            addCriterion("TOCCH.CLM_TP_CD between", value1, value2, "clmTpCd");
            return (Criteria) this;
        }

        public Criteria andClmTpCdNotBetween(String value1, String value2) {
            addCriterion("TOCCH.CLM_TP_CD not between", value1, value2, "clmTpCd");
            return (Criteria) this;
        }

        public Criteria andClmRcptDtIsNull() {
            addCriterion("TOCCH.CLM_RCPT_DT is null");
            return (Criteria) this;
        }

        public Criteria andClmRcptDtIsNotNull() {
            addCriterion("TOCCH.CLM_RCPT_DT is not null");
            return (Criteria) this;
        }

        public Criteria andClmRcptDtEqualTo(Date value) {
            addCriterionForJDBCDate("TOCCH.CLM_RCPT_DT =", value, "clmRcptDt");
            return (Criteria) this;
        }

        public Criteria andClmRcptDtNotEqualTo(Date value) {
            addCriterionForJDBCDate("TOCCH.CLM_RCPT_DT <>", value, "clmRcptDt");
            return (Criteria) this;
        }

        public Criteria andClmRcptDtGreaterThan(Date value) {
            addCriterionForJDBCDate("TOCCH.CLM_RCPT_DT >", value, "clmRcptDt");
            return (Criteria) this;
        }

        public Criteria andClmRcptDtGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("TOCCH.CLM_RCPT_DT >=", value, "clmRcptDt");
            return (Criteria) this;
        }

        public Criteria andClmRcptDtLessThan(Date value) {
            addCriterionForJDBCDate("TOCCH.CLM_RCPT_DT <", value, "clmRcptDt");
            return (Criteria) this;
        }

        public Criteria andClmRcptDtLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("TOCCH.CLM_RCPT_DT <=", value, "clmRcptDt");
            return (Criteria) this;
        }

        public Criteria andClmRcptDtIn(List<Date> values) {
            addCriterionForJDBCDate("TOCCH.CLM_RCPT_DT in", values, "clmRcptDt");
            return (Criteria) this;
        }

        public Criteria andClmRcptDtNotIn(List<Date> values) {
            addCriterionForJDBCDate("TOCCH.CLM_RCPT_DT not in", values, "clmRcptDt");
            return (Criteria) this;
        }

        public Criteria andClmRcptDtBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("TOCCH.CLM_RCPT_DT between", value1, value2, "clmRcptDt");
            return (Criteria) this;
        }

        public Criteria andClmRcptDtNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("TOCCH.CLM_RCPT_DT not between", value1, value2, "clmRcptDt");
            return (Criteria) this;
        }

        public Criteria andClmAttrCdIsNull() {
            addCriterion("TOCCH.CLM_ATTR_CD is null");
            return (Criteria) this;
        }

        public Criteria andClmAttrCdIsNotNull() {
            addCriterion("TOCCH.CLM_ATTR_CD is not null");
            return (Criteria) this;
        }

        public Criteria andClmAttrCdEqualTo(String value) {
            addCriterion("TOCCH.CLM_ATTR_CD =", value, "clmAttrCd");
            return (Criteria) this;
        }

        public Criteria andClmAttrCdNotEqualTo(String value) {
            addCriterion("TOCCH.CLM_ATTR_CD <>", value, "clmAttrCd");
            return (Criteria) this;
        }

        public Criteria andClmAttrCdGreaterThan(String value) {
            addCriterion("TOCCH.CLM_ATTR_CD >", value, "clmAttrCd");
            return (Criteria) this;
        }

        public Criteria andClmAttrCdGreaterThanOrEqualTo(String value) {
            addCriterion("TOCCH.CLM_ATTR_CD >=", value, "clmAttrCd");
            return (Criteria) this;
        }

        public Criteria andClmAttrCdLessThan(String value) {
            addCriterion("TOCCH.CLM_ATTR_CD <", value, "clmAttrCd");
            return (Criteria) this;
        }

        public Criteria andClmAttrCdLessThanOrEqualTo(String value) {
            addCriterion("TOCCH.CLM_ATTR_CD <=", value, "clmAttrCd");
            return (Criteria) this;
        }

        public Criteria andClmAttrCdLike(String value) {
            addCriterion("TOCCH.CLM_ATTR_CD like", value, "clmAttrCd");
            return (Criteria) this;
        }

        public Criteria andClmAttrCdNotLike(String value) {
            addCriterion("TOCCH.CLM_ATTR_CD not like", value, "clmAttrCd");
            return (Criteria) this;
        }

        public Criteria andClmAttrCdIn(List<String> values) {
            addCriterion("TOCCH.CLM_ATTR_CD in", values, "clmAttrCd");
            return (Criteria) this;
        }

        public Criteria andClmAttrCdNotIn(List<String> values) {
            addCriterion("TOCCH.CLM_ATTR_CD not in", values, "clmAttrCd");
            return (Criteria) this;
        }

        public Criteria andClmAttrCdBetween(String value1, String value2) {
            addCriterion("TOCCH.CLM_ATTR_CD between", value1, value2, "clmAttrCd");
            return (Criteria) this;
        }

        public Criteria andClmAttrCdNotBetween(String value1, String value2) {
            addCriterion("TOCCH.CLM_ATTR_CD not between", value1, value2, "clmAttrCd");
            return (Criteria) this;
        }

        public Criteria andClmRsnCdIsNull() {
            addCriterion("TOCCH.CLM_RSN_CD is null");
            return (Criteria) this;
        }

        public Criteria andClmRsnCdIsNotNull() {
            addCriterion("TOCCH.CLM_RSN_CD is not null");
            return (Criteria) this;
        }

        public Criteria andClmRsnCdEqualTo(String value) {
            addCriterion("TOCCH.CLM_RSN_CD =", value, "clmRsnCd");
            return (Criteria) this;
        }

        public Criteria andClmRsnCdNotEqualTo(String value) {
            addCriterion("TOCCH.CLM_RSN_CD <>", value, "clmRsnCd");
            return (Criteria) this;
        }

        public Criteria andClmRsnCdGreaterThan(String value) {
            addCriterion("TOCCH.CLM_RSN_CD >", value, "clmRsnCd");
            return (Criteria) this;
        }

        public Criteria andClmRsnCdGreaterThanOrEqualTo(String value) {
            addCriterion("TOCCH.CLM_RSN_CD >=", value, "clmRsnCd");
            return (Criteria) this;
        }

        public Criteria andClmRsnCdLessThan(String value) {
            addCriterion("TOCCH.CLM_RSN_CD <", value, "clmRsnCd");
            return (Criteria) this;
        }

        public Criteria andClmRsnCdLessThanOrEqualTo(String value) {
            addCriterion("TOCCH.CLM_RSN_CD <=", value, "clmRsnCd");
            return (Criteria) this;
        }

        public Criteria andClmRsnCdLike(String value) {
            addCriterion("TOCCH.CLM_RSN_CD like", value, "clmRsnCd");
            return (Criteria) this;
        }

        public Criteria andClmRsnCdNotLike(String value) {
            addCriterion("TOCCH.CLM_RSN_CD not like", value, "clmRsnCd");
            return (Criteria) this;
        }

        public Criteria andClmRsnCdIn(List<String> values) {
            addCriterion("TOCCH.CLM_RSN_CD in", values, "clmRsnCd");
            return (Criteria) this;
        }

        public Criteria andClmRsnCdNotIn(List<String> values) {
            addCriterion("TOCCH.CLM_RSN_CD not in", values, "clmRsnCd");
            return (Criteria) this;
        }

        public Criteria andClmRsnCdBetween(String value1, String value2) {
            addCriterion("TOCCH.CLM_RSN_CD between", value1, value2, "clmRsnCd");
            return (Criteria) this;
        }

        public Criteria andClmRsnCdNotBetween(String value1, String value2) {
            addCriterion("TOCCH.CLM_RSN_CD not between", value1, value2, "clmRsnCd");
            return (Criteria) this;
        }

        public Criteria andClmRsnContIsNull() {
            addCriterion("TOCCH.CLM_RSN_CONT is null");
            return (Criteria) this;
        }

        public Criteria andClmRsnContIsNotNull() {
            addCriterion("TOCCH.CLM_RSN_CONT is not null");
            return (Criteria) this;
        }

        public Criteria andClmRsnContEqualTo(String value) {
            addCriterion("TOCCH.CLM_RSN_CONT =", value, "clmRsnCont");
            return (Criteria) this;
        }

        public Criteria andClmRsnContNotEqualTo(String value) {
            addCriterion("TOCCH.CLM_RSN_CONT <>", value, "clmRsnCont");
            return (Criteria) this;
        }

        public Criteria andClmRsnContGreaterThan(String value) {
            addCriterion("TOCCH.CLM_RSN_CONT >", value, "clmRsnCont");
            return (Criteria) this;
        }

        public Criteria andClmRsnContGreaterThanOrEqualTo(String value) {
            addCriterion("TOCCH.CLM_RSN_CONT >=", value, "clmRsnCont");
            return (Criteria) this;
        }

        public Criteria andClmRsnContLessThan(String value) {
            addCriterion("TOCCH.CLM_RSN_CONT <", value, "clmRsnCont");
            return (Criteria) this;
        }

        public Criteria andClmRsnContLessThanOrEqualTo(String value) {
            addCriterion("TOCCH.CLM_RSN_CONT <=", value, "clmRsnCont");
            return (Criteria) this;
        }

        public Criteria andClmRsnContLike(String value) {
            addCriterion("TOCCH.CLM_RSN_CONT like", value, "clmRsnCont");
            return (Criteria) this;
        }

        public Criteria andClmRsnContNotLike(String value) {
            addCriterion("TOCCH.CLM_RSN_CONT not like", value, "clmRsnCont");
            return (Criteria) this;
        }

        public Criteria andClmRsnContIn(List<String> values) {
            addCriterion("TOCCH.CLM_RSN_CONT in", values, "clmRsnCont");
            return (Criteria) this;
        }

        public Criteria andClmRsnContNotIn(List<String> values) {
            addCriterion("TOCCH.CLM_RSN_CONT not in", values, "clmRsnCont");
            return (Criteria) this;
        }

        public Criteria andClmRsnContBetween(String value1, String value2) {
            addCriterion("TOCCH.CLM_RSN_CONT between", value1, value2, "clmRsnCont");
            return (Criteria) this;
        }

        public Criteria andClmRsnContNotBetween(String value1, String value2) {
            addCriterion("TOCCH.CLM_RSN_CONT not between", value1, value2, "clmRsnCont");
            return (Criteria) this;
        }

        public Criteria andRfdMthdIsNull() {
            addCriterion("TOCCH.RFD_MTHD is null");
            return (Criteria) this;
        }

        public Criteria andRfdMthdIsNotNull() {
            addCriterion("TOCCH.RFD_MTHD is not null");
            return (Criteria) this;
        }

        public Criteria andRfdMthdEqualTo(String value) {
            addCriterion("TOCCH.RFD_MTHD =", value, "rfdMthd");
            return (Criteria) this;
        }

        public Criteria andRfdMthdNotEqualTo(String value) {
            addCriterion("TOCCH.RFD_MTHD <>", value, "rfdMthd");
            return (Criteria) this;
        }

        public Criteria andRfdMthdGreaterThan(String value) {
            addCriterion("TOCCH.RFD_MTHD >", value, "rfdMthd");
            return (Criteria) this;
        }

        public Criteria andRfdMthdGreaterThanOrEqualTo(String value) {
            addCriterion("TOCCH.RFD_MTHD >=", value, "rfdMthd");
            return (Criteria) this;
        }

        public Criteria andRfdMthdLessThan(String value) {
            addCriterion("TOCCH.RFD_MTHD <", value, "rfdMthd");
            return (Criteria) this;
        }

        public Criteria andRfdMthdLessThanOrEqualTo(String value) {
            addCriterion("TOCCH.RFD_MTHD <=", value, "rfdMthd");
            return (Criteria) this;
        }

        public Criteria andRfdMthdLike(String value) {
            addCriterion("TOCCH.RFD_MTHD like", value, "rfdMthd");
            return (Criteria) this;
        }

        public Criteria andRfdMthdNotLike(String value) {
            addCriterion("TOCCH.RFD_MTHD not like", value, "rfdMthd");
            return (Criteria) this;
        }

        public Criteria andRfdMthdIn(List<String> values) {
            addCriterion("TOCCH.RFD_MTHD in", values, "rfdMthd");
            return (Criteria) this;
        }

        public Criteria andRfdMthdNotIn(List<String> values) {
            addCriterion("TOCCH.RFD_MTHD not in", values, "rfdMthd");
            return (Criteria) this;
        }

        public Criteria andRfdMthdBetween(String value1, String value2) {
            addCriterion("TOCCH.RFD_MTHD between", value1, value2, "rfdMthd");
            return (Criteria) this;
        }

        public Criteria andRfdMthdNotBetween(String value1, String value2) {
            addCriterion("TOCCH.RFD_MTHD not between", value1, value2, "rfdMthd");
            return (Criteria) this;
        }

        public Criteria andCpnDcRtnAmtIsNull() {
            addCriterion("TOCCH.CPN_DC_RTN_AMT is null");
            return (Criteria) this;
        }

        public Criteria andCpnDcRtnAmtIsNotNull() {
            addCriterion("TOCCH.CPN_DC_RTN_AMT is not null");
            return (Criteria) this;
        }

        public Criteria andCpnDcRtnAmtEqualTo(Integer value) {
            addCriterion("TOCCH.CPN_DC_RTN_AMT =", value, "cpnDcRtnAmt");
            return (Criteria) this;
        }

        public Criteria andCpnDcRtnAmtNotEqualTo(Integer value) {
            addCriterion("TOCCH.CPN_DC_RTN_AMT <>", value, "cpnDcRtnAmt");
            return (Criteria) this;
        }

        public Criteria andCpnDcRtnAmtGreaterThan(Integer value) {
            addCriterion("TOCCH.CPN_DC_RTN_AMT >", value, "cpnDcRtnAmt");
            return (Criteria) this;
        }

        public Criteria andCpnDcRtnAmtGreaterThanOrEqualTo(Integer value) {
            addCriterion("TOCCH.CPN_DC_RTN_AMT >=", value, "cpnDcRtnAmt");
            return (Criteria) this;
        }

        public Criteria andCpnDcRtnAmtLessThan(Integer value) {
            addCriterion("TOCCH.CPN_DC_RTN_AMT <", value, "cpnDcRtnAmt");
            return (Criteria) this;
        }

        public Criteria andCpnDcRtnAmtLessThanOrEqualTo(Integer value) {
            addCriterion("TOCCH.CPN_DC_RTN_AMT <=", value, "cpnDcRtnAmt");
            return (Criteria) this;
        }

        public Criteria andCpnDcRtnAmtIn(List<Integer> values) {
            addCriterion("TOCCH.CPN_DC_RTN_AMT in", values, "cpnDcRtnAmt");
            return (Criteria) this;
        }

        public Criteria andCpnDcRtnAmtNotIn(List<Integer> values) {
            addCriterion("TOCCH.CPN_DC_RTN_AMT not in", values, "cpnDcRtnAmt");
            return (Criteria) this;
        }

        public Criteria andCpnDcRtnAmtBetween(Integer value1, Integer value2) {
            addCriterion("TOCCH.CPN_DC_RTN_AMT between", value1, value2, "cpnDcRtnAmt");
            return (Criteria) this;
        }

        public Criteria andCpnDcRtnAmtNotBetween(Integer value1, Integer value2) {
            addCriterion("TOCCH.CPN_DC_RTN_AMT not between", value1, value2, "cpnDcRtnAmt");
            return (Criteria) this;
        }

        public Criteria andPtUseRtnAmtIsNull() {
            addCriterion("TOCCH.PT_USE_RTN_AMT is null");
            return (Criteria) this;
        }

        public Criteria andPtUseRtnAmtIsNotNull() {
            addCriterion("TOCCH.PT_USE_RTN_AMT is not null");
            return (Criteria) this;
        }

        public Criteria andPtUseRtnAmtEqualTo(Integer value) {
            addCriterion("TOCCH.PT_USE_RTN_AMT =", value, "ptUseRtnAmt");
            return (Criteria) this;
        }

        public Criteria andPtUseRtnAmtNotEqualTo(Integer value) {
            addCriterion("TOCCH.PT_USE_RTN_AMT <>", value, "ptUseRtnAmt");
            return (Criteria) this;
        }

        public Criteria andPtUseRtnAmtGreaterThan(Integer value) {
            addCriterion("TOCCH.PT_USE_RTN_AMT >", value, "ptUseRtnAmt");
            return (Criteria) this;
        }

        public Criteria andPtUseRtnAmtGreaterThanOrEqualTo(Integer value) {
            addCriterion("TOCCH.PT_USE_RTN_AMT >=", value, "ptUseRtnAmt");
            return (Criteria) this;
        }

        public Criteria andPtUseRtnAmtLessThan(Integer value) {
            addCriterion("TOCCH.PT_USE_RTN_AMT <", value, "ptUseRtnAmt");
            return (Criteria) this;
        }

        public Criteria andPtUseRtnAmtLessThanOrEqualTo(Integer value) {
            addCriterion("TOCCH.PT_USE_RTN_AMT <=", value, "ptUseRtnAmt");
            return (Criteria) this;
        }

        public Criteria andPtUseRtnAmtIn(List<Integer> values) {
            addCriterion("TOCCH.PT_USE_RTN_AMT in", values, "ptUseRtnAmt");
            return (Criteria) this;
        }

        public Criteria andPtUseRtnAmtNotIn(List<Integer> values) {
            addCriterion("TOCCH.PT_USE_RTN_AMT not in", values, "ptUseRtnAmt");
            return (Criteria) this;
        }

        public Criteria andPtUseRtnAmtBetween(Integer value1, Integer value2) {
            addCriterion("TOCCH.PT_USE_RTN_AMT between", value1, value2, "ptUseRtnAmt");
            return (Criteria) this;
        }

        public Criteria andPtUseRtnAmtNotBetween(Integer value1, Integer value2) {
            addCriterion("TOCCH.PT_USE_RTN_AMT not between", value1, value2, "ptUseRtnAmt");
            return (Criteria) this;
        }

        public Criteria andClmAmtIsNull() {
            addCriterion("TOCCH.CLM_AMT is null");
            return (Criteria) this;
        }

        public Criteria andClmAmtIsNotNull() {
            addCriterion("TOCCH.CLM_AMT is not null");
            return (Criteria) this;
        }

        public Criteria andClmAmtEqualTo(Integer value) {
            addCriterion("TOCCH.CLM_AMT =", value, "clmAmt");
            return (Criteria) this;
        }

        public Criteria andClmAmtNotEqualTo(Integer value) {
            addCriterion("TOCCH.CLM_AMT <>", value, "clmAmt");
            return (Criteria) this;
        }

        public Criteria andClmAmtGreaterThan(Integer value) {
            addCriterion("TOCCH.CLM_AMT >", value, "clmAmt");
            return (Criteria) this;
        }

        public Criteria andClmAmtGreaterThanOrEqualTo(Integer value) {
            addCriterion("TOCCH.CLM_AMT >=", value, "clmAmt");
            return (Criteria) this;
        }

        public Criteria andClmAmtLessThan(Integer value) {
            addCriterion("TOCCH.CLM_AMT <", value, "clmAmt");
            return (Criteria) this;
        }

        public Criteria andClmAmtLessThanOrEqualTo(Integer value) {
            addCriterion("TOCCH.CLM_AMT <=", value, "clmAmt");
            return (Criteria) this;
        }

        public Criteria andClmAmtIn(List<Integer> values) {
            addCriterion("TOCCH.CLM_AMT in", values, "clmAmt");
            return (Criteria) this;
        }

        public Criteria andClmAmtNotIn(List<Integer> values) {
            addCriterion("TOCCH.CLM_AMT not in", values, "clmAmt");
            return (Criteria) this;
        }

        public Criteria andClmAmtBetween(Integer value1, Integer value2) {
            addCriterion("TOCCH.CLM_AMT between", value1, value2, "clmAmt");
            return (Criteria) this;
        }

        public Criteria andClmAmtNotBetween(Integer value1, Integer value2) {
            addCriterion("TOCCH.CLM_AMT not between", value1, value2, "clmAmt");
            return (Criteria) this;
        }

        public Criteria andRealClmAmtIsNull() {
            addCriterion("TOCCH.REAL_CLM_AMT is null");
            return (Criteria) this;
        }

        public Criteria andRealClmAmtIsNotNull() {
            addCriterion("TOCCH.REAL_CLM_AMT is not null");
            return (Criteria) this;
        }

        public Criteria andRealClmAmtEqualTo(Integer value) {
            addCriterion("TOCCH.REAL_CLM_AMT =", value, "realClmAmt");
            return (Criteria) this;
        }

        public Criteria andRealClmAmtNotEqualTo(Integer value) {
            addCriterion("TOCCH.REAL_CLM_AMT <>", value, "realClmAmt");
            return (Criteria) this;
        }

        public Criteria andRealClmAmtGreaterThan(Integer value) {
            addCriterion("TOCCH.REAL_CLM_AMT >", value, "realClmAmt");
            return (Criteria) this;
        }

        public Criteria andRealClmAmtGreaterThanOrEqualTo(Integer value) {
            addCriterion("TOCCH.REAL_CLM_AMT >=", value, "realClmAmt");
            return (Criteria) this;
        }

        public Criteria andRealClmAmtLessThan(Integer value) {
            addCriterion("TOCCH.REAL_CLM_AMT <", value, "realClmAmt");
            return (Criteria) this;
        }

        public Criteria andRealClmAmtLessThanOrEqualTo(Integer value) {
            addCriterion("TOCCH.REAL_CLM_AMT <=", value, "realClmAmt");
            return (Criteria) this;
        }

        public Criteria andRealClmAmtIn(List<Integer> values) {
            addCriterion("TOCCH.REAL_CLM_AMT in", values, "realClmAmt");
            return (Criteria) this;
        }

        public Criteria andRealClmAmtNotIn(List<Integer> values) {
            addCriterion("TOCCH.REAL_CLM_AMT not in", values, "realClmAmt");
            return (Criteria) this;
        }

        public Criteria andRealClmAmtBetween(Integer value1, Integer value2) {
            addCriterion("TOCCH.REAL_CLM_AMT between", value1, value2, "realClmAmt");
            return (Criteria) this;
        }

        public Criteria andRealClmAmtNotBetween(Integer value1, Integer value2) {
            addCriterion("TOCCH.REAL_CLM_AMT not between", value1, value2, "realClmAmt");
            return (Criteria) this;
        }

        public Criteria andPayCpltDtIsNull() {
            addCriterion("TOCCH.PAY_CPLT_DT is null");
            return (Criteria) this;
        }

        public Criteria andPayCpltDtIsNotNull() {
            addCriterion("TOCCH.PAY_CPLT_DT is not null");
            return (Criteria) this;
        }

        public Criteria andPayCpltDtEqualTo(Date value) {
            addCriterionForJDBCDate("TOCCH.PAY_CPLT_DT =", value, "payCpltDt");
            return (Criteria) this;
        }

        public Criteria andPayCpltDtNotEqualTo(Date value) {
            addCriterionForJDBCDate("TOCCH.PAY_CPLT_DT <>", value, "payCpltDt");
            return (Criteria) this;
        }

        public Criteria andPayCpltDtGreaterThan(Date value) {
            addCriterionForJDBCDate("TOCCH.PAY_CPLT_DT >", value, "payCpltDt");
            return (Criteria) this;
        }

        public Criteria andPayCpltDtGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("TOCCH.PAY_CPLT_DT >=", value, "payCpltDt");
            return (Criteria) this;
        }

        public Criteria andPayCpltDtLessThan(Date value) {
            addCriterionForJDBCDate("TOCCH.PAY_CPLT_DT <", value, "payCpltDt");
            return (Criteria) this;
        }

        public Criteria andPayCpltDtLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("TOCCH.PAY_CPLT_DT <=", value, "payCpltDt");
            return (Criteria) this;
        }

        public Criteria andPayCpltDtIn(List<Date> values) {
            addCriterionForJDBCDate("TOCCH.PAY_CPLT_DT in", values, "payCpltDt");
            return (Criteria) this;
        }

        public Criteria andPayCpltDtNotIn(List<Date> values) {
            addCriterionForJDBCDate("TOCCH.PAY_CPLT_DT not in", values, "payCpltDt");
            return (Criteria) this;
        }

        public Criteria andPayCpltDtBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("TOCCH.PAY_CPLT_DT between", value1, value2, "payCpltDt");
            return (Criteria) this;
        }

        public Criteria andPayCpltDtNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("TOCCH.PAY_CPLT_DT not between", value1, value2, "payCpltDt");
            return (Criteria) this;
        }

        public Criteria andRfdCpltDtIsNull() {
            addCriterion("TOCCH.RFD_CPLT_DT is null");
            return (Criteria) this;
        }

        public Criteria andRfdCpltDtIsNotNull() {
            addCriterion("TOCCH.RFD_CPLT_DT is not null");
            return (Criteria) this;
        }

        public Criteria andRfdCpltDtEqualTo(Date value) {
            addCriterionForJDBCDate("TOCCH.RFD_CPLT_DT =", value, "rfdCpltDt");
            return (Criteria) this;
        }

        public Criteria andRfdCpltDtNotEqualTo(Date value) {
            addCriterionForJDBCDate("TOCCH.RFD_CPLT_DT <>", value, "rfdCpltDt");
            return (Criteria) this;
        }

        public Criteria andRfdCpltDtGreaterThan(Date value) {
            addCriterionForJDBCDate("TOCCH.RFD_CPLT_DT >", value, "rfdCpltDt");
            return (Criteria) this;
        }

        public Criteria andRfdCpltDtGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("TOCCH.RFD_CPLT_DT >=", value, "rfdCpltDt");
            return (Criteria) this;
        }

        public Criteria andRfdCpltDtLessThan(Date value) {
            addCriterionForJDBCDate("TOCCH.RFD_CPLT_DT <", value, "rfdCpltDt");
            return (Criteria) this;
        }

        public Criteria andRfdCpltDtLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("TOCCH.RFD_CPLT_DT <=", value, "rfdCpltDt");
            return (Criteria) this;
        }

        public Criteria andRfdCpltDtIn(List<Date> values) {
            addCriterionForJDBCDate("TOCCH.RFD_CPLT_DT in", values, "rfdCpltDt");
            return (Criteria) this;
        }

        public Criteria andRfdCpltDtNotIn(List<Date> values) {
            addCriterionForJDBCDate("TOCCH.RFD_CPLT_DT not in", values, "rfdCpltDt");
            return (Criteria) this;
        }

        public Criteria andRfdCpltDtBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("TOCCH.RFD_CPLT_DT between", value1, value2, "rfdCpltDt");
            return (Criteria) this;
        }

        public Criteria andRfdCpltDtNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("TOCCH.RFD_CPLT_DT not between", value1, value2, "rfdCpltDt");
            return (Criteria) this;
        }

        public Criteria andRegDtIsNull() {
            addCriterion("TOCCH.REG_DT is null");
            return (Criteria) this;
        }

        public Criteria andRegDtIsNotNull() {
            addCriterion("TOCCH.REG_DT is not null");
            return (Criteria) this;
        }

        public Criteria andRegDtEqualTo(Date value) {
            addCriterion("TOCCH.REG_DT =", value, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtNotEqualTo(Date value) {
            addCriterion("TOCCH.REG_DT <>", value, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtGreaterThan(Date value) {
            addCriterion("TOCCH.REG_DT >", value, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtGreaterThanOrEqualTo(Date value) {
            addCriterion("TOCCH.REG_DT >=", value, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtLessThan(Date value) {
            addCriterion("TOCCH.REG_DT <", value, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtLessThanOrEqualTo(Date value) {
            addCriterion("TOCCH.REG_DT <=", value, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtIn(List<Date> values) {
            addCriterion("TOCCH.REG_DT in", values, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtNotIn(List<Date> values) {
            addCriterion("TOCCH.REG_DT not in", values, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtBetween(Date value1, Date value2) {
            addCriterion("TOCCH.REG_DT between", value1, value2, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtNotBetween(Date value1, Date value2) {
            addCriterion("TOCCH.REG_DT not between", value1, value2, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegIdIsNull() {
            addCriterion("TOCCH.REG_ID is null");
            return (Criteria) this;
        }

        public Criteria andRegIdIsNotNull() {
            addCriterion("TOCCH.REG_ID is not null");
            return (Criteria) this;
        }

        public Criteria andRegIdEqualTo(String value) {
            addCriterion("TOCCH.REG_ID =", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdNotEqualTo(String value) {
            addCriterion("TOCCH.REG_ID <>", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdGreaterThan(String value) {
            addCriterion("TOCCH.REG_ID >", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdGreaterThanOrEqualTo(String value) {
            addCriterion("TOCCH.REG_ID >=", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdLessThan(String value) {
            addCriterion("TOCCH.REG_ID <", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdLessThanOrEqualTo(String value) {
            addCriterion("TOCCH.REG_ID <=", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdLike(String value) {
            addCriterion("TOCCH.REG_ID like", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdNotLike(String value) {
            addCriterion("TOCCH.REG_ID not like", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdIn(List<String> values) {
            addCriterion("TOCCH.REG_ID in", values, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdNotIn(List<String> values) {
            addCriterion("TOCCH.REG_ID not in", values, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdBetween(String value1, String value2) {
            addCriterion("TOCCH.REG_ID between", value1, value2, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdNotBetween(String value1, String value2) {
            addCriterion("TOCCH.REG_ID not between", value1, value2, "regId");
            return (Criteria) this;
        }

        public Criteria andOrdClmNoLikeInsensitive(String value) {
            addCriterion("upper(TOCCH.ORD_CLM_NO) like", value.toUpperCase(), "ordClmNo");
            return (Criteria) this;
        }

        public Criteria andClmTpCdLikeInsensitive(String value) {
            addCriterion("upper(TOCCH.CLM_TP_CD) like", value.toUpperCase(), "clmTpCd");
            return (Criteria) this;
        }

        public Criteria andClmAttrCdLikeInsensitive(String value) {
            addCriterion("upper(TOCCH.CLM_ATTR_CD) like", value.toUpperCase(), "clmAttrCd");
            return (Criteria) this;
        }

        public Criteria andClmRsnCdLikeInsensitive(String value) {
            addCriterion("upper(TOCCH.CLM_RSN_CD) like", value.toUpperCase(), "clmRsnCd");
            return (Criteria) this;
        }

        public Criteria andClmRsnContLikeInsensitive(String value) {
            addCriterion("upper(TOCCH.CLM_RSN_CONT) like", value.toUpperCase(), "clmRsnCont");
            return (Criteria) this;
        }

        public Criteria andRfdMthdLikeInsensitive(String value) {
            addCriterion("upper(TOCCH.RFD_MTHD) like", value.toUpperCase(), "rfdMthd");
            return (Criteria) this;
        }

        public Criteria andRegIdLikeInsensitive(String value) {
            addCriterion("upper(TOCCH.REG_ID) like", value.toUpperCase(), "regId");
            return (Criteria) this;
        }

        public Criteria andOrdClmNoLikeLeft(String value) {
            addCriterion("TOCCH.ORD_CLM_NO like ", "%" + value, "ordClmNo");
            return (Criteria) this;
        }

        public Criteria andOrdClmNoLikeRight(String value) {
            addCriterion("TOCCH.ORD_CLM_NO like ", value + "%", "ordClmNo");
            return (Criteria) this;
        }

        public Criteria andOrdClmNoLikeBoth(String value) {
            addCriterion("TOCCH.ORD_CLM_NO like ", "%" + value + "%", "ordClmNo");
            return (Criteria) this;
        }

        public Criteria andClmTpCdLikeLeft(String value) {
            addCriterion("TOCCH.CLM_TP_CD like ", "%" + value, "clmTpCd");
            return (Criteria) this;
        }

        public Criteria andClmTpCdLikeRight(String value) {
            addCriterion("TOCCH.CLM_TP_CD like ", value + "%", "clmTpCd");
            return (Criteria) this;
        }

        public Criteria andClmTpCdLikeBoth(String value) {
            addCriterion("TOCCH.CLM_TP_CD like ", "%" + value + "%", "clmTpCd");
            return (Criteria) this;
        }

        public Criteria andClmAttrCdLikeLeft(String value) {
            addCriterion("TOCCH.CLM_ATTR_CD like ", "%" + value, "clmAttrCd");
            return (Criteria) this;
        }

        public Criteria andClmAttrCdLikeRight(String value) {
            addCriterion("TOCCH.CLM_ATTR_CD like ", value + "%", "clmAttrCd");
            return (Criteria) this;
        }

        public Criteria andClmAttrCdLikeBoth(String value) {
            addCriterion("TOCCH.CLM_ATTR_CD like ", "%" + value + "%", "clmAttrCd");
            return (Criteria) this;
        }

        public Criteria andClmRsnCdLikeLeft(String value) {
            addCriterion("TOCCH.CLM_RSN_CD like ", "%" + value, "clmRsnCd");
            return (Criteria) this;
        }

        public Criteria andClmRsnCdLikeRight(String value) {
            addCriterion("TOCCH.CLM_RSN_CD like ", value + "%", "clmRsnCd");
            return (Criteria) this;
        }

        public Criteria andClmRsnCdLikeBoth(String value) {
            addCriterion("TOCCH.CLM_RSN_CD like ", "%" + value + "%", "clmRsnCd");
            return (Criteria) this;
        }

        public Criteria andClmRsnContLikeLeft(String value) {
            addCriterion("TOCCH.CLM_RSN_CONT like ", "%" + value, "clmRsnCont");
            return (Criteria) this;
        }

        public Criteria andClmRsnContLikeRight(String value) {
            addCriterion("TOCCH.CLM_RSN_CONT like ", value + "%", "clmRsnCont");
            return (Criteria) this;
        }

        public Criteria andClmRsnContLikeBoth(String value) {
            addCriterion("TOCCH.CLM_RSN_CONT like ", "%" + value + "%", "clmRsnCont");
            return (Criteria) this;
        }

        public Criteria andRfdMthdLikeLeft(String value) {
            addCriterion("TOCCH.RFD_MTHD like ", "%" + value, "rfdMthd");
            return (Criteria) this;
        }

        public Criteria andRfdMthdLikeRight(String value) {
            addCriterion("TOCCH.RFD_MTHD like ", value + "%", "rfdMthd");
            return (Criteria) this;
        }

        public Criteria andRfdMthdLikeBoth(String value) {
            addCriterion("TOCCH.RFD_MTHD like ", "%" + value + "%", "rfdMthd");
            return (Criteria) this;
        }

        public Criteria andRegIdLikeLeft(String value) {
            addCriterion("TOCCH.REG_ID like ", "%" + value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdLikeRight(String value) {
            addCriterion("TOCCH.REG_ID like ", value + "%", "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdLikeBoth(String value) {
            addCriterion("TOCCH.REG_ID like ", "%" + value + "%", "regId");
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