package com.mushbird.sinsege.base.module.order.model.entity.criteria;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class OrderClaimItemChangeHistoryEntityCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    public OrderClaimItemChangeHistoryEntityCriteria() {
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

        public Criteria andOrdClmItemChistIdIsNull() {
            addCriterion("TOCICH.ORD_CLM_ITEM_CHIST_ID is null");
            return (Criteria) this;
        }

        public Criteria andOrdClmItemChistIdIsNotNull() {
            addCriterion("TOCICH.ORD_CLM_ITEM_CHIST_ID is not null");
            return (Criteria) this;
        }

        public Criteria andOrdClmItemChistIdEqualTo(Integer value) {
            addCriterion("TOCICH.ORD_CLM_ITEM_CHIST_ID =", value, "ordClmItemChistId");
            return (Criteria) this;
        }

        public Criteria andOrdClmItemChistIdNotEqualTo(Integer value) {
            addCriterion("TOCICH.ORD_CLM_ITEM_CHIST_ID <>", value, "ordClmItemChistId");
            return (Criteria) this;
        }

        public Criteria andOrdClmItemChistIdGreaterThan(Integer value) {
            addCriterion("TOCICH.ORD_CLM_ITEM_CHIST_ID >", value, "ordClmItemChistId");
            return (Criteria) this;
        }

        public Criteria andOrdClmItemChistIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("TOCICH.ORD_CLM_ITEM_CHIST_ID >=", value, "ordClmItemChistId");
            return (Criteria) this;
        }

        public Criteria andOrdClmItemChistIdLessThan(Integer value) {
            addCriterion("TOCICH.ORD_CLM_ITEM_CHIST_ID <", value, "ordClmItemChistId");
            return (Criteria) this;
        }

        public Criteria andOrdClmItemChistIdLessThanOrEqualTo(Integer value) {
            addCriterion("TOCICH.ORD_CLM_ITEM_CHIST_ID <=", value, "ordClmItemChistId");
            return (Criteria) this;
        }

        public Criteria andOrdClmItemChistIdIn(List<Integer> values) {
            addCriterion("TOCICH.ORD_CLM_ITEM_CHIST_ID in", values, "ordClmItemChistId");
            return (Criteria) this;
        }

        public Criteria andOrdClmItemChistIdNotIn(List<Integer> values) {
            addCriterion("TOCICH.ORD_CLM_ITEM_CHIST_ID not in", values, "ordClmItemChistId");
            return (Criteria) this;
        }

        public Criteria andOrdClmItemChistIdBetween(Integer value1, Integer value2) {
            addCriterion("TOCICH.ORD_CLM_ITEM_CHIST_ID between", value1, value2, "ordClmItemChistId");
            return (Criteria) this;
        }

        public Criteria andOrdClmItemChistIdNotBetween(Integer value1, Integer value2) {
            addCriterion("TOCICH.ORD_CLM_ITEM_CHIST_ID not between", value1, value2, "ordClmItemChistId");
            return (Criteria) this;
        }

        public Criteria andOrdClmItemIdIsNull() {
            addCriterion("TOCICH.ORD_CLM_ITEM_ID is null");
            return (Criteria) this;
        }

        public Criteria andOrdClmItemIdIsNotNull() {
            addCriterion("TOCICH.ORD_CLM_ITEM_ID is not null");
            return (Criteria) this;
        }

        public Criteria andOrdClmItemIdEqualTo(Integer value) {
            addCriterion("TOCICH.ORD_CLM_ITEM_ID =", value, "ordClmItemId");
            return (Criteria) this;
        }

        public Criteria andOrdClmItemIdNotEqualTo(Integer value) {
            addCriterion("TOCICH.ORD_CLM_ITEM_ID <>", value, "ordClmItemId");
            return (Criteria) this;
        }

        public Criteria andOrdClmItemIdGreaterThan(Integer value) {
            addCriterion("TOCICH.ORD_CLM_ITEM_ID >", value, "ordClmItemId");
            return (Criteria) this;
        }

        public Criteria andOrdClmItemIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("TOCICH.ORD_CLM_ITEM_ID >=", value, "ordClmItemId");
            return (Criteria) this;
        }

        public Criteria andOrdClmItemIdLessThan(Integer value) {
            addCriterion("TOCICH.ORD_CLM_ITEM_ID <", value, "ordClmItemId");
            return (Criteria) this;
        }

        public Criteria andOrdClmItemIdLessThanOrEqualTo(Integer value) {
            addCriterion("TOCICH.ORD_CLM_ITEM_ID <=", value, "ordClmItemId");
            return (Criteria) this;
        }

        public Criteria andOrdClmItemIdIn(List<Integer> values) {
            addCriterion("TOCICH.ORD_CLM_ITEM_ID in", values, "ordClmItemId");
            return (Criteria) this;
        }

        public Criteria andOrdClmItemIdNotIn(List<Integer> values) {
            addCriterion("TOCICH.ORD_CLM_ITEM_ID not in", values, "ordClmItemId");
            return (Criteria) this;
        }

        public Criteria andOrdClmItemIdBetween(Integer value1, Integer value2) {
            addCriterion("TOCICH.ORD_CLM_ITEM_ID between", value1, value2, "ordClmItemId");
            return (Criteria) this;
        }

        public Criteria andOrdClmItemIdNotBetween(Integer value1, Integer value2) {
            addCriterion("TOCICH.ORD_CLM_ITEM_ID not between", value1, value2, "ordClmItemId");
            return (Criteria) this;
        }

        public Criteria andOrdClmIdIsNull() {
            addCriterion("TOCICH.ORD_CLM_ID is null");
            return (Criteria) this;
        }

        public Criteria andOrdClmIdIsNotNull() {
            addCriterion("TOCICH.ORD_CLM_ID is not null");
            return (Criteria) this;
        }

        public Criteria andOrdClmIdEqualTo(Integer value) {
            addCriterion("TOCICH.ORD_CLM_ID =", value, "ordClmId");
            return (Criteria) this;
        }

        public Criteria andOrdClmIdNotEqualTo(Integer value) {
            addCriterion("TOCICH.ORD_CLM_ID <>", value, "ordClmId");
            return (Criteria) this;
        }

        public Criteria andOrdClmIdGreaterThan(Integer value) {
            addCriterion("TOCICH.ORD_CLM_ID >", value, "ordClmId");
            return (Criteria) this;
        }

        public Criteria andOrdClmIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("TOCICH.ORD_CLM_ID >=", value, "ordClmId");
            return (Criteria) this;
        }

        public Criteria andOrdClmIdLessThan(Integer value) {
            addCriterion("TOCICH.ORD_CLM_ID <", value, "ordClmId");
            return (Criteria) this;
        }

        public Criteria andOrdClmIdLessThanOrEqualTo(Integer value) {
            addCriterion("TOCICH.ORD_CLM_ID <=", value, "ordClmId");
            return (Criteria) this;
        }

        public Criteria andOrdClmIdIn(List<Integer> values) {
            addCriterion("TOCICH.ORD_CLM_ID in", values, "ordClmId");
            return (Criteria) this;
        }

        public Criteria andOrdClmIdNotIn(List<Integer> values) {
            addCriterion("TOCICH.ORD_CLM_ID not in", values, "ordClmId");
            return (Criteria) this;
        }

        public Criteria andOrdClmIdBetween(Integer value1, Integer value2) {
            addCriterion("TOCICH.ORD_CLM_ID between", value1, value2, "ordClmId");
            return (Criteria) this;
        }

        public Criteria andOrdClmIdNotBetween(Integer value1, Integer value2) {
            addCriterion("TOCICH.ORD_CLM_ID not between", value1, value2, "ordClmId");
            return (Criteria) this;
        }

        public Criteria andOrdItemIdIsNull() {
            addCriterion("TOCICH.ORD_ITEM_ID is null");
            return (Criteria) this;
        }

        public Criteria andOrdItemIdIsNotNull() {
            addCriterion("TOCICH.ORD_ITEM_ID is not null");
            return (Criteria) this;
        }

        public Criteria andOrdItemIdEqualTo(Integer value) {
            addCriterion("TOCICH.ORD_ITEM_ID =", value, "ordItemId");
            return (Criteria) this;
        }

        public Criteria andOrdItemIdNotEqualTo(Integer value) {
            addCriterion("TOCICH.ORD_ITEM_ID <>", value, "ordItemId");
            return (Criteria) this;
        }

        public Criteria andOrdItemIdGreaterThan(Integer value) {
            addCriterion("TOCICH.ORD_ITEM_ID >", value, "ordItemId");
            return (Criteria) this;
        }

        public Criteria andOrdItemIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("TOCICH.ORD_ITEM_ID >=", value, "ordItemId");
            return (Criteria) this;
        }

        public Criteria andOrdItemIdLessThan(Integer value) {
            addCriterion("TOCICH.ORD_ITEM_ID <", value, "ordItemId");
            return (Criteria) this;
        }

        public Criteria andOrdItemIdLessThanOrEqualTo(Integer value) {
            addCriterion("TOCICH.ORD_ITEM_ID <=", value, "ordItemId");
            return (Criteria) this;
        }

        public Criteria andOrdItemIdIn(List<Integer> values) {
            addCriterion("TOCICH.ORD_ITEM_ID in", values, "ordItemId");
            return (Criteria) this;
        }

        public Criteria andOrdItemIdNotIn(List<Integer> values) {
            addCriterion("TOCICH.ORD_ITEM_ID not in", values, "ordItemId");
            return (Criteria) this;
        }

        public Criteria andOrdItemIdBetween(Integer value1, Integer value2) {
            addCriterion("TOCICH.ORD_ITEM_ID between", value1, value2, "ordItemId");
            return (Criteria) this;
        }

        public Criteria andOrdItemIdNotBetween(Integer value1, Integer value2) {
            addCriterion("TOCICH.ORD_ITEM_ID not between", value1, value2, "ordItemId");
            return (Criteria) this;
        }

        public Criteria andClmItemSeqIsNull() {
            addCriterion("TOCICH.CLM_ITEM_SEQ is null");
            return (Criteria) this;
        }

        public Criteria andClmItemSeqIsNotNull() {
            addCriterion("TOCICH.CLM_ITEM_SEQ is not null");
            return (Criteria) this;
        }

        public Criteria andClmItemSeqEqualTo(Integer value) {
            addCriterion("TOCICH.CLM_ITEM_SEQ =", value, "clmItemSeq");
            return (Criteria) this;
        }

        public Criteria andClmItemSeqNotEqualTo(Integer value) {
            addCriterion("TOCICH.CLM_ITEM_SEQ <>", value, "clmItemSeq");
            return (Criteria) this;
        }

        public Criteria andClmItemSeqGreaterThan(Integer value) {
            addCriterion("TOCICH.CLM_ITEM_SEQ >", value, "clmItemSeq");
            return (Criteria) this;
        }

        public Criteria andClmItemSeqGreaterThanOrEqualTo(Integer value) {
            addCriterion("TOCICH.CLM_ITEM_SEQ >=", value, "clmItemSeq");
            return (Criteria) this;
        }

        public Criteria andClmItemSeqLessThan(Integer value) {
            addCriterion("TOCICH.CLM_ITEM_SEQ <", value, "clmItemSeq");
            return (Criteria) this;
        }

        public Criteria andClmItemSeqLessThanOrEqualTo(Integer value) {
            addCriterion("TOCICH.CLM_ITEM_SEQ <=", value, "clmItemSeq");
            return (Criteria) this;
        }

        public Criteria andClmItemSeqIn(List<Integer> values) {
            addCriterion("TOCICH.CLM_ITEM_SEQ in", values, "clmItemSeq");
            return (Criteria) this;
        }

        public Criteria andClmItemSeqNotIn(List<Integer> values) {
            addCriterion("TOCICH.CLM_ITEM_SEQ not in", values, "clmItemSeq");
            return (Criteria) this;
        }

        public Criteria andClmItemSeqBetween(Integer value1, Integer value2) {
            addCriterion("TOCICH.CLM_ITEM_SEQ between", value1, value2, "clmItemSeq");
            return (Criteria) this;
        }

        public Criteria andClmItemSeqNotBetween(Integer value1, Integer value2) {
            addCriterion("TOCICH.CLM_ITEM_SEQ not between", value1, value2, "clmItemSeq");
            return (Criteria) this;
        }

        public Criteria andClmItemNoIsNull() {
            addCriterion("TOCICH.CLM_ITEM_NO is null");
            return (Criteria) this;
        }

        public Criteria andClmItemNoIsNotNull() {
            addCriterion("TOCICH.CLM_ITEM_NO is not null");
            return (Criteria) this;
        }

        public Criteria andClmItemNoEqualTo(String value) {
            addCriterion("TOCICH.CLM_ITEM_NO =", value, "clmItemNo");
            return (Criteria) this;
        }

        public Criteria andClmItemNoNotEqualTo(String value) {
            addCriterion("TOCICH.CLM_ITEM_NO <>", value, "clmItemNo");
            return (Criteria) this;
        }

        public Criteria andClmItemNoGreaterThan(String value) {
            addCriterion("TOCICH.CLM_ITEM_NO >", value, "clmItemNo");
            return (Criteria) this;
        }

        public Criteria andClmItemNoGreaterThanOrEqualTo(String value) {
            addCriterion("TOCICH.CLM_ITEM_NO >=", value, "clmItemNo");
            return (Criteria) this;
        }

        public Criteria andClmItemNoLessThan(String value) {
            addCriterion("TOCICH.CLM_ITEM_NO <", value, "clmItemNo");
            return (Criteria) this;
        }

        public Criteria andClmItemNoLessThanOrEqualTo(String value) {
            addCriterion("TOCICH.CLM_ITEM_NO <=", value, "clmItemNo");
            return (Criteria) this;
        }

        public Criteria andClmItemNoLike(String value) {
            addCriterion("TOCICH.CLM_ITEM_NO like", value, "clmItemNo");
            return (Criteria) this;
        }

        public Criteria andClmItemNoNotLike(String value) {
            addCriterion("TOCICH.CLM_ITEM_NO not like", value, "clmItemNo");
            return (Criteria) this;
        }

        public Criteria andClmItemNoIn(List<String> values) {
            addCriterion("TOCICH.CLM_ITEM_NO in", values, "clmItemNo");
            return (Criteria) this;
        }

        public Criteria andClmItemNoNotIn(List<String> values) {
            addCriterion("TOCICH.CLM_ITEM_NO not in", values, "clmItemNo");
            return (Criteria) this;
        }

        public Criteria andClmItemNoBetween(String value1, String value2) {
            addCriterion("TOCICH.CLM_ITEM_NO between", value1, value2, "clmItemNo");
            return (Criteria) this;
        }

        public Criteria andClmItemNoNotBetween(String value1, String value2) {
            addCriterion("TOCICH.CLM_ITEM_NO not between", value1, value2, "clmItemNo");
            return (Criteria) this;
        }

        public Criteria andClmTpCdIsNull() {
            addCriterion("TOCICH.CLM_TP_CD is null");
            return (Criteria) this;
        }

        public Criteria andClmTpCdIsNotNull() {
            addCriterion("TOCICH.CLM_TP_CD is not null");
            return (Criteria) this;
        }

        public Criteria andClmTpCdEqualTo(String value) {
            addCriterion("TOCICH.CLM_TP_CD =", value, "clmTpCd");
            return (Criteria) this;
        }

        public Criteria andClmTpCdNotEqualTo(String value) {
            addCriterion("TOCICH.CLM_TP_CD <>", value, "clmTpCd");
            return (Criteria) this;
        }

        public Criteria andClmTpCdGreaterThan(String value) {
            addCriterion("TOCICH.CLM_TP_CD >", value, "clmTpCd");
            return (Criteria) this;
        }

        public Criteria andClmTpCdGreaterThanOrEqualTo(String value) {
            addCriterion("TOCICH.CLM_TP_CD >=", value, "clmTpCd");
            return (Criteria) this;
        }

        public Criteria andClmTpCdLessThan(String value) {
            addCriterion("TOCICH.CLM_TP_CD <", value, "clmTpCd");
            return (Criteria) this;
        }

        public Criteria andClmTpCdLessThanOrEqualTo(String value) {
            addCriterion("TOCICH.CLM_TP_CD <=", value, "clmTpCd");
            return (Criteria) this;
        }

        public Criteria andClmTpCdLike(String value) {
            addCriterion("TOCICH.CLM_TP_CD like", value, "clmTpCd");
            return (Criteria) this;
        }

        public Criteria andClmTpCdNotLike(String value) {
            addCriterion("TOCICH.CLM_TP_CD not like", value, "clmTpCd");
            return (Criteria) this;
        }

        public Criteria andClmTpCdIn(List<String> values) {
            addCriterion("TOCICH.CLM_TP_CD in", values, "clmTpCd");
            return (Criteria) this;
        }

        public Criteria andClmTpCdNotIn(List<String> values) {
            addCriterion("TOCICH.CLM_TP_CD not in", values, "clmTpCd");
            return (Criteria) this;
        }

        public Criteria andClmTpCdBetween(String value1, String value2) {
            addCriterion("TOCICH.CLM_TP_CD between", value1, value2, "clmTpCd");
            return (Criteria) this;
        }

        public Criteria andClmTpCdNotBetween(String value1, String value2) {
            addCriterion("TOCICH.CLM_TP_CD not between", value1, value2, "clmTpCd");
            return (Criteria) this;
        }

        public Criteria andClmItemStatCdIsNull() {
            addCriterion("TOCICH.CLM_ITEM_STAT_CD is null");
            return (Criteria) this;
        }

        public Criteria andClmItemStatCdIsNotNull() {
            addCriterion("TOCICH.CLM_ITEM_STAT_CD is not null");
            return (Criteria) this;
        }

        public Criteria andClmItemStatCdEqualTo(String value) {
            addCriterion("TOCICH.CLM_ITEM_STAT_CD =", value, "clmItemStatCd");
            return (Criteria) this;
        }

        public Criteria andClmItemStatCdNotEqualTo(String value) {
            addCriterion("TOCICH.CLM_ITEM_STAT_CD <>", value, "clmItemStatCd");
            return (Criteria) this;
        }

        public Criteria andClmItemStatCdGreaterThan(String value) {
            addCriterion("TOCICH.CLM_ITEM_STAT_CD >", value, "clmItemStatCd");
            return (Criteria) this;
        }

        public Criteria andClmItemStatCdGreaterThanOrEqualTo(String value) {
            addCriterion("TOCICH.CLM_ITEM_STAT_CD >=", value, "clmItemStatCd");
            return (Criteria) this;
        }

        public Criteria andClmItemStatCdLessThan(String value) {
            addCriterion("TOCICH.CLM_ITEM_STAT_CD <", value, "clmItemStatCd");
            return (Criteria) this;
        }

        public Criteria andClmItemStatCdLessThanOrEqualTo(String value) {
            addCriterion("TOCICH.CLM_ITEM_STAT_CD <=", value, "clmItemStatCd");
            return (Criteria) this;
        }

        public Criteria andClmItemStatCdLike(String value) {
            addCriterion("TOCICH.CLM_ITEM_STAT_CD like", value, "clmItemStatCd");
            return (Criteria) this;
        }

        public Criteria andClmItemStatCdNotLike(String value) {
            addCriterion("TOCICH.CLM_ITEM_STAT_CD not like", value, "clmItemStatCd");
            return (Criteria) this;
        }

        public Criteria andClmItemStatCdIn(List<String> values) {
            addCriterion("TOCICH.CLM_ITEM_STAT_CD in", values, "clmItemStatCd");
            return (Criteria) this;
        }

        public Criteria andClmItemStatCdNotIn(List<String> values) {
            addCriterion("TOCICH.CLM_ITEM_STAT_CD not in", values, "clmItemStatCd");
            return (Criteria) this;
        }

        public Criteria andClmItemStatCdBetween(String value1, String value2) {
            addCriterion("TOCICH.CLM_ITEM_STAT_CD between", value1, value2, "clmItemStatCd");
            return (Criteria) this;
        }

        public Criteria andClmItemStatCdNotBetween(String value1, String value2) {
            addCriterion("TOCICH.CLM_ITEM_STAT_CD not between", value1, value2, "clmItemStatCd");
            return (Criteria) this;
        }

        public Criteria andClmItemStatChgDtIsNull() {
            addCriterion("TOCICH.CLM_ITEM_STAT_CHG_DT is null");
            return (Criteria) this;
        }

        public Criteria andClmItemStatChgDtIsNotNull() {
            addCriterion("TOCICH.CLM_ITEM_STAT_CHG_DT is not null");
            return (Criteria) this;
        }

        public Criteria andClmItemStatChgDtEqualTo(Date value) {
            addCriterionForJDBCDate("TOCICH.CLM_ITEM_STAT_CHG_DT =", value, "clmItemStatChgDt");
            return (Criteria) this;
        }

        public Criteria andClmItemStatChgDtNotEqualTo(Date value) {
            addCriterionForJDBCDate("TOCICH.CLM_ITEM_STAT_CHG_DT <>", value, "clmItemStatChgDt");
            return (Criteria) this;
        }

        public Criteria andClmItemStatChgDtGreaterThan(Date value) {
            addCriterionForJDBCDate("TOCICH.CLM_ITEM_STAT_CHG_DT >", value, "clmItemStatChgDt");
            return (Criteria) this;
        }

        public Criteria andClmItemStatChgDtGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("TOCICH.CLM_ITEM_STAT_CHG_DT >=", value, "clmItemStatChgDt");
            return (Criteria) this;
        }

        public Criteria andClmItemStatChgDtLessThan(Date value) {
            addCriterionForJDBCDate("TOCICH.CLM_ITEM_STAT_CHG_DT <", value, "clmItemStatChgDt");
            return (Criteria) this;
        }

        public Criteria andClmItemStatChgDtLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("TOCICH.CLM_ITEM_STAT_CHG_DT <=", value, "clmItemStatChgDt");
            return (Criteria) this;
        }

        public Criteria andClmItemStatChgDtIn(List<Date> values) {
            addCriterionForJDBCDate("TOCICH.CLM_ITEM_STAT_CHG_DT in", values, "clmItemStatChgDt");
            return (Criteria) this;
        }

        public Criteria andClmItemStatChgDtNotIn(List<Date> values) {
            addCriterionForJDBCDate("TOCICH.CLM_ITEM_STAT_CHG_DT not in", values, "clmItemStatChgDt");
            return (Criteria) this;
        }

        public Criteria andClmItemStatChgDtBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("TOCICH.CLM_ITEM_STAT_CHG_DT between", value1, value2, "clmItemStatChgDt");
            return (Criteria) this;
        }

        public Criteria andClmItemStatChgDtNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("TOCICH.CLM_ITEM_STAT_CHG_DT not between", value1, value2, "clmItemStatChgDt");
            return (Criteria) this;
        }

        public Criteria andClmTimeOrdItemStatCdIsNull() {
            addCriterion("TOCICH.CLM_TIME_ORD_ITEM_STAT_CD is null");
            return (Criteria) this;
        }

        public Criteria andClmTimeOrdItemStatCdIsNotNull() {
            addCriterion("TOCICH.CLM_TIME_ORD_ITEM_STAT_CD is not null");
            return (Criteria) this;
        }

        public Criteria andClmTimeOrdItemStatCdEqualTo(String value) {
            addCriterion("TOCICH.CLM_TIME_ORD_ITEM_STAT_CD =", value, "clmTimeOrdItemStatCd");
            return (Criteria) this;
        }

        public Criteria andClmTimeOrdItemStatCdNotEqualTo(String value) {
            addCriterion("TOCICH.CLM_TIME_ORD_ITEM_STAT_CD <>", value, "clmTimeOrdItemStatCd");
            return (Criteria) this;
        }

        public Criteria andClmTimeOrdItemStatCdGreaterThan(String value) {
            addCriterion("TOCICH.CLM_TIME_ORD_ITEM_STAT_CD >", value, "clmTimeOrdItemStatCd");
            return (Criteria) this;
        }

        public Criteria andClmTimeOrdItemStatCdGreaterThanOrEqualTo(String value) {
            addCriterion("TOCICH.CLM_TIME_ORD_ITEM_STAT_CD >=", value, "clmTimeOrdItemStatCd");
            return (Criteria) this;
        }

        public Criteria andClmTimeOrdItemStatCdLessThan(String value) {
            addCriterion("TOCICH.CLM_TIME_ORD_ITEM_STAT_CD <", value, "clmTimeOrdItemStatCd");
            return (Criteria) this;
        }

        public Criteria andClmTimeOrdItemStatCdLessThanOrEqualTo(String value) {
            addCriterion("TOCICH.CLM_TIME_ORD_ITEM_STAT_CD <=", value, "clmTimeOrdItemStatCd");
            return (Criteria) this;
        }

        public Criteria andClmTimeOrdItemStatCdLike(String value) {
            addCriterion("TOCICH.CLM_TIME_ORD_ITEM_STAT_CD like", value, "clmTimeOrdItemStatCd");
            return (Criteria) this;
        }

        public Criteria andClmTimeOrdItemStatCdNotLike(String value) {
            addCriterion("TOCICH.CLM_TIME_ORD_ITEM_STAT_CD not like", value, "clmTimeOrdItemStatCd");
            return (Criteria) this;
        }

        public Criteria andClmTimeOrdItemStatCdIn(List<String> values) {
            addCriterion("TOCICH.CLM_TIME_ORD_ITEM_STAT_CD in", values, "clmTimeOrdItemStatCd");
            return (Criteria) this;
        }

        public Criteria andClmTimeOrdItemStatCdNotIn(List<String> values) {
            addCriterion("TOCICH.CLM_TIME_ORD_ITEM_STAT_CD not in", values, "clmTimeOrdItemStatCd");
            return (Criteria) this;
        }

        public Criteria andClmTimeOrdItemStatCdBetween(String value1, String value2) {
            addCriterion("TOCICH.CLM_TIME_ORD_ITEM_STAT_CD between", value1, value2, "clmTimeOrdItemStatCd");
            return (Criteria) this;
        }

        public Criteria andClmTimeOrdItemStatCdNotBetween(String value1, String value2) {
            addCriterion("TOCICH.CLM_TIME_ORD_ITEM_STAT_CD not between", value1, value2, "clmTimeOrdItemStatCd");
            return (Criteria) this;
        }

        public Criteria andClmChckDtIsNull() {
            addCriterion("TOCICH.CLM_CHCK_DT is null");
            return (Criteria) this;
        }

        public Criteria andClmChckDtIsNotNull() {
            addCriterion("TOCICH.CLM_CHCK_DT is not null");
            return (Criteria) this;
        }

        public Criteria andClmChckDtEqualTo(Date value) {
            addCriterionForJDBCDate("TOCICH.CLM_CHCK_DT =", value, "clmChckDt");
            return (Criteria) this;
        }

        public Criteria andClmChckDtNotEqualTo(Date value) {
            addCriterionForJDBCDate("TOCICH.CLM_CHCK_DT <>", value, "clmChckDt");
            return (Criteria) this;
        }

        public Criteria andClmChckDtGreaterThan(Date value) {
            addCriterionForJDBCDate("TOCICH.CLM_CHCK_DT >", value, "clmChckDt");
            return (Criteria) this;
        }

        public Criteria andClmChckDtGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("TOCICH.CLM_CHCK_DT >=", value, "clmChckDt");
            return (Criteria) this;
        }

        public Criteria andClmChckDtLessThan(Date value) {
            addCriterionForJDBCDate("TOCICH.CLM_CHCK_DT <", value, "clmChckDt");
            return (Criteria) this;
        }

        public Criteria andClmChckDtLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("TOCICH.CLM_CHCK_DT <=", value, "clmChckDt");
            return (Criteria) this;
        }

        public Criteria andClmChckDtIn(List<Date> values) {
            addCriterionForJDBCDate("TOCICH.CLM_CHCK_DT in", values, "clmChckDt");
            return (Criteria) this;
        }

        public Criteria andClmChckDtNotIn(List<Date> values) {
            addCriterionForJDBCDate("TOCICH.CLM_CHCK_DT not in", values, "clmChckDt");
            return (Criteria) this;
        }

        public Criteria andClmChckDtBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("TOCICH.CLM_CHCK_DT between", value1, value2, "clmChckDt");
            return (Criteria) this;
        }

        public Criteria andClmChckDtNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("TOCICH.CLM_CHCK_DT not between", value1, value2, "clmChckDt");
            return (Criteria) this;
        }

        public Criteria andClmAprvDtIsNull() {
            addCriterion("TOCICH.CLM_APRV_DT is null");
            return (Criteria) this;
        }

        public Criteria andClmAprvDtIsNotNull() {
            addCriterion("TOCICH.CLM_APRV_DT is not null");
            return (Criteria) this;
        }

        public Criteria andClmAprvDtEqualTo(Date value) {
            addCriterionForJDBCDate("TOCICH.CLM_APRV_DT =", value, "clmAprvDt");
            return (Criteria) this;
        }

        public Criteria andClmAprvDtNotEqualTo(Date value) {
            addCriterionForJDBCDate("TOCICH.CLM_APRV_DT <>", value, "clmAprvDt");
            return (Criteria) this;
        }

        public Criteria andClmAprvDtGreaterThan(Date value) {
            addCriterionForJDBCDate("TOCICH.CLM_APRV_DT >", value, "clmAprvDt");
            return (Criteria) this;
        }

        public Criteria andClmAprvDtGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("TOCICH.CLM_APRV_DT >=", value, "clmAprvDt");
            return (Criteria) this;
        }

        public Criteria andClmAprvDtLessThan(Date value) {
            addCriterionForJDBCDate("TOCICH.CLM_APRV_DT <", value, "clmAprvDt");
            return (Criteria) this;
        }

        public Criteria andClmAprvDtLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("TOCICH.CLM_APRV_DT <=", value, "clmAprvDt");
            return (Criteria) this;
        }

        public Criteria andClmAprvDtIn(List<Date> values) {
            addCriterionForJDBCDate("TOCICH.CLM_APRV_DT in", values, "clmAprvDt");
            return (Criteria) this;
        }

        public Criteria andClmAprvDtNotIn(List<Date> values) {
            addCriterionForJDBCDate("TOCICH.CLM_APRV_DT not in", values, "clmAprvDt");
            return (Criteria) this;
        }

        public Criteria andClmAprvDtBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("TOCICH.CLM_APRV_DT between", value1, value2, "clmAprvDt");
            return (Criteria) this;
        }

        public Criteria andClmAprvDtNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("TOCICH.CLM_APRV_DT not between", value1, value2, "clmAprvDt");
            return (Criteria) this;
        }

        public Criteria andClmHoldDtIsNull() {
            addCriterion("TOCICH.CLM_HOLD_DT is null");
            return (Criteria) this;
        }

        public Criteria andClmHoldDtIsNotNull() {
            addCriterion("TOCICH.CLM_HOLD_DT is not null");
            return (Criteria) this;
        }

        public Criteria andClmHoldDtEqualTo(Date value) {
            addCriterionForJDBCDate("TOCICH.CLM_HOLD_DT =", value, "clmHoldDt");
            return (Criteria) this;
        }

        public Criteria andClmHoldDtNotEqualTo(Date value) {
            addCriterionForJDBCDate("TOCICH.CLM_HOLD_DT <>", value, "clmHoldDt");
            return (Criteria) this;
        }

        public Criteria andClmHoldDtGreaterThan(Date value) {
            addCriterionForJDBCDate("TOCICH.CLM_HOLD_DT >", value, "clmHoldDt");
            return (Criteria) this;
        }

        public Criteria andClmHoldDtGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("TOCICH.CLM_HOLD_DT >=", value, "clmHoldDt");
            return (Criteria) this;
        }

        public Criteria andClmHoldDtLessThan(Date value) {
            addCriterionForJDBCDate("TOCICH.CLM_HOLD_DT <", value, "clmHoldDt");
            return (Criteria) this;
        }

        public Criteria andClmHoldDtLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("TOCICH.CLM_HOLD_DT <=", value, "clmHoldDt");
            return (Criteria) this;
        }

        public Criteria andClmHoldDtIn(List<Date> values) {
            addCriterionForJDBCDate("TOCICH.CLM_HOLD_DT in", values, "clmHoldDt");
            return (Criteria) this;
        }

        public Criteria andClmHoldDtNotIn(List<Date> values) {
            addCriterionForJDBCDate("TOCICH.CLM_HOLD_DT not in", values, "clmHoldDt");
            return (Criteria) this;
        }

        public Criteria andClmHoldDtBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("TOCICH.CLM_HOLD_DT between", value1, value2, "clmHoldDt");
            return (Criteria) this;
        }

        public Criteria andClmHoldDtNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("TOCICH.CLM_HOLD_DT not between", value1, value2, "clmHoldDt");
            return (Criteria) this;
        }

        public Criteria andClmHoldRsnIsNull() {
            addCriterion("TOCICH.CLM_HOLD_RSN is null");
            return (Criteria) this;
        }

        public Criteria andClmHoldRsnIsNotNull() {
            addCriterion("TOCICH.CLM_HOLD_RSN is not null");
            return (Criteria) this;
        }

        public Criteria andClmHoldRsnEqualTo(String value) {
            addCriterion("TOCICH.CLM_HOLD_RSN =", value, "clmHoldRsn");
            return (Criteria) this;
        }

        public Criteria andClmHoldRsnNotEqualTo(String value) {
            addCriterion("TOCICH.CLM_HOLD_RSN <>", value, "clmHoldRsn");
            return (Criteria) this;
        }

        public Criteria andClmHoldRsnGreaterThan(String value) {
            addCriterion("TOCICH.CLM_HOLD_RSN >", value, "clmHoldRsn");
            return (Criteria) this;
        }

        public Criteria andClmHoldRsnGreaterThanOrEqualTo(String value) {
            addCriterion("TOCICH.CLM_HOLD_RSN >=", value, "clmHoldRsn");
            return (Criteria) this;
        }

        public Criteria andClmHoldRsnLessThan(String value) {
            addCriterion("TOCICH.CLM_HOLD_RSN <", value, "clmHoldRsn");
            return (Criteria) this;
        }

        public Criteria andClmHoldRsnLessThanOrEqualTo(String value) {
            addCriterion("TOCICH.CLM_HOLD_RSN <=", value, "clmHoldRsn");
            return (Criteria) this;
        }

        public Criteria andClmHoldRsnLike(String value) {
            addCriterion("TOCICH.CLM_HOLD_RSN like", value, "clmHoldRsn");
            return (Criteria) this;
        }

        public Criteria andClmHoldRsnNotLike(String value) {
            addCriterion("TOCICH.CLM_HOLD_RSN not like", value, "clmHoldRsn");
            return (Criteria) this;
        }

        public Criteria andClmHoldRsnIn(List<String> values) {
            addCriterion("TOCICH.CLM_HOLD_RSN in", values, "clmHoldRsn");
            return (Criteria) this;
        }

        public Criteria andClmHoldRsnNotIn(List<String> values) {
            addCriterion("TOCICH.CLM_HOLD_RSN not in", values, "clmHoldRsn");
            return (Criteria) this;
        }

        public Criteria andClmHoldRsnBetween(String value1, String value2) {
            addCriterion("TOCICH.CLM_HOLD_RSN between", value1, value2, "clmHoldRsn");
            return (Criteria) this;
        }

        public Criteria andClmHoldRsnNotBetween(String value1, String value2) {
            addCriterion("TOCICH.CLM_HOLD_RSN not between", value1, value2, "clmHoldRsn");
            return (Criteria) this;
        }

        public Criteria andClmRejDtIsNull() {
            addCriterion("TOCICH.CLM_REJ_DT is null");
            return (Criteria) this;
        }

        public Criteria andClmRejDtIsNotNull() {
            addCriterion("TOCICH.CLM_REJ_DT is not null");
            return (Criteria) this;
        }

        public Criteria andClmRejDtEqualTo(Date value) {
            addCriterionForJDBCDate("TOCICH.CLM_REJ_DT =", value, "clmRejDt");
            return (Criteria) this;
        }

        public Criteria andClmRejDtNotEqualTo(Date value) {
            addCriterionForJDBCDate("TOCICH.CLM_REJ_DT <>", value, "clmRejDt");
            return (Criteria) this;
        }

        public Criteria andClmRejDtGreaterThan(Date value) {
            addCriterionForJDBCDate("TOCICH.CLM_REJ_DT >", value, "clmRejDt");
            return (Criteria) this;
        }

        public Criteria andClmRejDtGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("TOCICH.CLM_REJ_DT >=", value, "clmRejDt");
            return (Criteria) this;
        }

        public Criteria andClmRejDtLessThan(Date value) {
            addCriterionForJDBCDate("TOCICH.CLM_REJ_DT <", value, "clmRejDt");
            return (Criteria) this;
        }

        public Criteria andClmRejDtLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("TOCICH.CLM_REJ_DT <=", value, "clmRejDt");
            return (Criteria) this;
        }

        public Criteria andClmRejDtIn(List<Date> values) {
            addCriterionForJDBCDate("TOCICH.CLM_REJ_DT in", values, "clmRejDt");
            return (Criteria) this;
        }

        public Criteria andClmRejDtNotIn(List<Date> values) {
            addCriterionForJDBCDate("TOCICH.CLM_REJ_DT not in", values, "clmRejDt");
            return (Criteria) this;
        }

        public Criteria andClmRejDtBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("TOCICH.CLM_REJ_DT between", value1, value2, "clmRejDt");
            return (Criteria) this;
        }

        public Criteria andClmRejDtNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("TOCICH.CLM_REJ_DT not between", value1, value2, "clmRejDt");
            return (Criteria) this;
        }

        public Criteria andClmRejRsnIsNull() {
            addCriterion("TOCICH.CLM_REJ_RSN is null");
            return (Criteria) this;
        }

        public Criteria andClmRejRsnIsNotNull() {
            addCriterion("TOCICH.CLM_REJ_RSN is not null");
            return (Criteria) this;
        }

        public Criteria andClmRejRsnEqualTo(String value) {
            addCriterion("TOCICH.CLM_REJ_RSN =", value, "clmRejRsn");
            return (Criteria) this;
        }

        public Criteria andClmRejRsnNotEqualTo(String value) {
            addCriterion("TOCICH.CLM_REJ_RSN <>", value, "clmRejRsn");
            return (Criteria) this;
        }

        public Criteria andClmRejRsnGreaterThan(String value) {
            addCriterion("TOCICH.CLM_REJ_RSN >", value, "clmRejRsn");
            return (Criteria) this;
        }

        public Criteria andClmRejRsnGreaterThanOrEqualTo(String value) {
            addCriterion("TOCICH.CLM_REJ_RSN >=", value, "clmRejRsn");
            return (Criteria) this;
        }

        public Criteria andClmRejRsnLessThan(String value) {
            addCriterion("TOCICH.CLM_REJ_RSN <", value, "clmRejRsn");
            return (Criteria) this;
        }

        public Criteria andClmRejRsnLessThanOrEqualTo(String value) {
            addCriterion("TOCICH.CLM_REJ_RSN <=", value, "clmRejRsn");
            return (Criteria) this;
        }

        public Criteria andClmRejRsnLike(String value) {
            addCriterion("TOCICH.CLM_REJ_RSN like", value, "clmRejRsn");
            return (Criteria) this;
        }

        public Criteria andClmRejRsnNotLike(String value) {
            addCriterion("TOCICH.CLM_REJ_RSN not like", value, "clmRejRsn");
            return (Criteria) this;
        }

        public Criteria andClmRejRsnIn(List<String> values) {
            addCriterion("TOCICH.CLM_REJ_RSN in", values, "clmRejRsn");
            return (Criteria) this;
        }

        public Criteria andClmRejRsnNotIn(List<String> values) {
            addCriterion("TOCICH.CLM_REJ_RSN not in", values, "clmRejRsn");
            return (Criteria) this;
        }

        public Criteria andClmRejRsnBetween(String value1, String value2) {
            addCriterion("TOCICH.CLM_REJ_RSN between", value1, value2, "clmRejRsn");
            return (Criteria) this;
        }

        public Criteria andClmRejRsnNotBetween(String value1, String value2) {
            addCriterion("TOCICH.CLM_REJ_RSN not between", value1, value2, "clmRejRsn");
            return (Criteria) this;
        }

        public Criteria andClmCpltDtIsNull() {
            addCriterion("TOCICH.CLM_CPLT_DT is null");
            return (Criteria) this;
        }

        public Criteria andClmCpltDtIsNotNull() {
            addCriterion("TOCICH.CLM_CPLT_DT is not null");
            return (Criteria) this;
        }

        public Criteria andClmCpltDtEqualTo(Date value) {
            addCriterionForJDBCDate("TOCICH.CLM_CPLT_DT =", value, "clmCpltDt");
            return (Criteria) this;
        }

        public Criteria andClmCpltDtNotEqualTo(Date value) {
            addCriterionForJDBCDate("TOCICH.CLM_CPLT_DT <>", value, "clmCpltDt");
            return (Criteria) this;
        }

        public Criteria andClmCpltDtGreaterThan(Date value) {
            addCriterionForJDBCDate("TOCICH.CLM_CPLT_DT >", value, "clmCpltDt");
            return (Criteria) this;
        }

        public Criteria andClmCpltDtGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("TOCICH.CLM_CPLT_DT >=", value, "clmCpltDt");
            return (Criteria) this;
        }

        public Criteria andClmCpltDtLessThan(Date value) {
            addCriterionForJDBCDate("TOCICH.CLM_CPLT_DT <", value, "clmCpltDt");
            return (Criteria) this;
        }

        public Criteria andClmCpltDtLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("TOCICH.CLM_CPLT_DT <=", value, "clmCpltDt");
            return (Criteria) this;
        }

        public Criteria andClmCpltDtIn(List<Date> values) {
            addCriterionForJDBCDate("TOCICH.CLM_CPLT_DT in", values, "clmCpltDt");
            return (Criteria) this;
        }

        public Criteria andClmCpltDtNotIn(List<Date> values) {
            addCriterionForJDBCDate("TOCICH.CLM_CPLT_DT not in", values, "clmCpltDt");
            return (Criteria) this;
        }

        public Criteria andClmCpltDtBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("TOCICH.CLM_CPLT_DT between", value1, value2, "clmCpltDt");
            return (Criteria) this;
        }

        public Criteria andClmCpltDtNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("TOCICH.CLM_CPLT_DT not between", value1, value2, "clmCpltDt");
            return (Criteria) this;
        }

        public Criteria andCpnDcRtnAmtIsNull() {
            addCriterion("TOCICH.CPN_DC_RTN_AMT is null");
            return (Criteria) this;
        }

        public Criteria andCpnDcRtnAmtIsNotNull() {
            addCriterion("TOCICH.CPN_DC_RTN_AMT is not null");
            return (Criteria) this;
        }

        public Criteria andCpnDcRtnAmtEqualTo(Integer value) {
            addCriterion("TOCICH.CPN_DC_RTN_AMT =", value, "cpnDcRtnAmt");
            return (Criteria) this;
        }

        public Criteria andCpnDcRtnAmtNotEqualTo(Integer value) {
            addCriterion("TOCICH.CPN_DC_RTN_AMT <>", value, "cpnDcRtnAmt");
            return (Criteria) this;
        }

        public Criteria andCpnDcRtnAmtGreaterThan(Integer value) {
            addCriterion("TOCICH.CPN_DC_RTN_AMT >", value, "cpnDcRtnAmt");
            return (Criteria) this;
        }

        public Criteria andCpnDcRtnAmtGreaterThanOrEqualTo(Integer value) {
            addCriterion("TOCICH.CPN_DC_RTN_AMT >=", value, "cpnDcRtnAmt");
            return (Criteria) this;
        }

        public Criteria andCpnDcRtnAmtLessThan(Integer value) {
            addCriterion("TOCICH.CPN_DC_RTN_AMT <", value, "cpnDcRtnAmt");
            return (Criteria) this;
        }

        public Criteria andCpnDcRtnAmtLessThanOrEqualTo(Integer value) {
            addCriterion("TOCICH.CPN_DC_RTN_AMT <=", value, "cpnDcRtnAmt");
            return (Criteria) this;
        }

        public Criteria andCpnDcRtnAmtIn(List<Integer> values) {
            addCriterion("TOCICH.CPN_DC_RTN_AMT in", values, "cpnDcRtnAmt");
            return (Criteria) this;
        }

        public Criteria andCpnDcRtnAmtNotIn(List<Integer> values) {
            addCriterion("TOCICH.CPN_DC_RTN_AMT not in", values, "cpnDcRtnAmt");
            return (Criteria) this;
        }

        public Criteria andCpnDcRtnAmtBetween(Integer value1, Integer value2) {
            addCriterion("TOCICH.CPN_DC_RTN_AMT between", value1, value2, "cpnDcRtnAmt");
            return (Criteria) this;
        }

        public Criteria andCpnDcRtnAmtNotBetween(Integer value1, Integer value2) {
            addCriterion("TOCICH.CPN_DC_RTN_AMT not between", value1, value2, "cpnDcRtnAmt");
            return (Criteria) this;
        }

        public Criteria andPtUseRtnAmtIsNull() {
            addCriterion("TOCICH.PT_USE_RTN_AMT is null");
            return (Criteria) this;
        }

        public Criteria andPtUseRtnAmtIsNotNull() {
            addCriterion("TOCICH.PT_USE_RTN_AMT is not null");
            return (Criteria) this;
        }

        public Criteria andPtUseRtnAmtEqualTo(Integer value) {
            addCriterion("TOCICH.PT_USE_RTN_AMT =", value, "ptUseRtnAmt");
            return (Criteria) this;
        }

        public Criteria andPtUseRtnAmtNotEqualTo(Integer value) {
            addCriterion("TOCICH.PT_USE_RTN_AMT <>", value, "ptUseRtnAmt");
            return (Criteria) this;
        }

        public Criteria andPtUseRtnAmtGreaterThan(Integer value) {
            addCriterion("TOCICH.PT_USE_RTN_AMT >", value, "ptUseRtnAmt");
            return (Criteria) this;
        }

        public Criteria andPtUseRtnAmtGreaterThanOrEqualTo(Integer value) {
            addCriterion("TOCICH.PT_USE_RTN_AMT >=", value, "ptUseRtnAmt");
            return (Criteria) this;
        }

        public Criteria andPtUseRtnAmtLessThan(Integer value) {
            addCriterion("TOCICH.PT_USE_RTN_AMT <", value, "ptUseRtnAmt");
            return (Criteria) this;
        }

        public Criteria andPtUseRtnAmtLessThanOrEqualTo(Integer value) {
            addCriterion("TOCICH.PT_USE_RTN_AMT <=", value, "ptUseRtnAmt");
            return (Criteria) this;
        }

        public Criteria andPtUseRtnAmtIn(List<Integer> values) {
            addCriterion("TOCICH.PT_USE_RTN_AMT in", values, "ptUseRtnAmt");
            return (Criteria) this;
        }

        public Criteria andPtUseRtnAmtNotIn(List<Integer> values) {
            addCriterion("TOCICH.PT_USE_RTN_AMT not in", values, "ptUseRtnAmt");
            return (Criteria) this;
        }

        public Criteria andPtUseRtnAmtBetween(Integer value1, Integer value2) {
            addCriterion("TOCICH.PT_USE_RTN_AMT between", value1, value2, "ptUseRtnAmt");
            return (Criteria) this;
        }

        public Criteria andPtUseRtnAmtNotBetween(Integer value1, Integer value2) {
            addCriterion("TOCICH.PT_USE_RTN_AMT not between", value1, value2, "ptUseRtnAmt");
            return (Criteria) this;
        }

        public Criteria andClmQtyIsNull() {
            addCriterion("TOCICH.CLM_QTY is null");
            return (Criteria) this;
        }

        public Criteria andClmQtyIsNotNull() {
            addCriterion("TOCICH.CLM_QTY is not null");
            return (Criteria) this;
        }

        public Criteria andClmQtyEqualTo(Integer value) {
            addCriterion("TOCICH.CLM_QTY =", value, "clmQty");
            return (Criteria) this;
        }

        public Criteria andClmQtyNotEqualTo(Integer value) {
            addCriterion("TOCICH.CLM_QTY <>", value, "clmQty");
            return (Criteria) this;
        }

        public Criteria andClmQtyGreaterThan(Integer value) {
            addCriterion("TOCICH.CLM_QTY >", value, "clmQty");
            return (Criteria) this;
        }

        public Criteria andClmQtyGreaterThanOrEqualTo(Integer value) {
            addCriterion("TOCICH.CLM_QTY >=", value, "clmQty");
            return (Criteria) this;
        }

        public Criteria andClmQtyLessThan(Integer value) {
            addCriterion("TOCICH.CLM_QTY <", value, "clmQty");
            return (Criteria) this;
        }

        public Criteria andClmQtyLessThanOrEqualTo(Integer value) {
            addCriterion("TOCICH.CLM_QTY <=", value, "clmQty");
            return (Criteria) this;
        }

        public Criteria andClmQtyIn(List<Integer> values) {
            addCriterion("TOCICH.CLM_QTY in", values, "clmQty");
            return (Criteria) this;
        }

        public Criteria andClmQtyNotIn(List<Integer> values) {
            addCriterion("TOCICH.CLM_QTY not in", values, "clmQty");
            return (Criteria) this;
        }

        public Criteria andClmQtyBetween(Integer value1, Integer value2) {
            addCriterion("TOCICH.CLM_QTY between", value1, value2, "clmQty");
            return (Criteria) this;
        }

        public Criteria andClmQtyNotBetween(Integer value1, Integer value2) {
            addCriterion("TOCICH.CLM_QTY not between", value1, value2, "clmQty");
            return (Criteria) this;
        }

        public Criteria andClmAmtIsNull() {
            addCriterion("TOCICH.CLM_AMT is null");
            return (Criteria) this;
        }

        public Criteria andClmAmtIsNotNull() {
            addCriterion("TOCICH.CLM_AMT is not null");
            return (Criteria) this;
        }

        public Criteria andClmAmtEqualTo(Integer value) {
            addCriterion("TOCICH.CLM_AMT =", value, "clmAmt");
            return (Criteria) this;
        }

        public Criteria andClmAmtNotEqualTo(Integer value) {
            addCriterion("TOCICH.CLM_AMT <>", value, "clmAmt");
            return (Criteria) this;
        }

        public Criteria andClmAmtGreaterThan(Integer value) {
            addCriterion("TOCICH.CLM_AMT >", value, "clmAmt");
            return (Criteria) this;
        }

        public Criteria andClmAmtGreaterThanOrEqualTo(Integer value) {
            addCriterion("TOCICH.CLM_AMT >=", value, "clmAmt");
            return (Criteria) this;
        }

        public Criteria andClmAmtLessThan(Integer value) {
            addCriterion("TOCICH.CLM_AMT <", value, "clmAmt");
            return (Criteria) this;
        }

        public Criteria andClmAmtLessThanOrEqualTo(Integer value) {
            addCriterion("TOCICH.CLM_AMT <=", value, "clmAmt");
            return (Criteria) this;
        }

        public Criteria andClmAmtIn(List<Integer> values) {
            addCriterion("TOCICH.CLM_AMT in", values, "clmAmt");
            return (Criteria) this;
        }

        public Criteria andClmAmtNotIn(List<Integer> values) {
            addCriterion("TOCICH.CLM_AMT not in", values, "clmAmt");
            return (Criteria) this;
        }

        public Criteria andClmAmtBetween(Integer value1, Integer value2) {
            addCriterion("TOCICH.CLM_AMT between", value1, value2, "clmAmt");
            return (Criteria) this;
        }

        public Criteria andClmAmtNotBetween(Integer value1, Integer value2) {
            addCriterion("TOCICH.CLM_AMT not between", value1, value2, "clmAmt");
            return (Criteria) this;
        }

        public Criteria andPayAddAmtIsNull() {
            addCriterion("TOCICH.PAY_ADD_AMT is null");
            return (Criteria) this;
        }

        public Criteria andPayAddAmtIsNotNull() {
            addCriterion("TOCICH.PAY_ADD_AMT is not null");
            return (Criteria) this;
        }

        public Criteria andPayAddAmtEqualTo(Integer value) {
            addCriterion("TOCICH.PAY_ADD_AMT =", value, "payAddAmt");
            return (Criteria) this;
        }

        public Criteria andPayAddAmtNotEqualTo(Integer value) {
            addCriterion("TOCICH.PAY_ADD_AMT <>", value, "payAddAmt");
            return (Criteria) this;
        }

        public Criteria andPayAddAmtGreaterThan(Integer value) {
            addCriterion("TOCICH.PAY_ADD_AMT >", value, "payAddAmt");
            return (Criteria) this;
        }

        public Criteria andPayAddAmtGreaterThanOrEqualTo(Integer value) {
            addCriterion("TOCICH.PAY_ADD_AMT >=", value, "payAddAmt");
            return (Criteria) this;
        }

        public Criteria andPayAddAmtLessThan(Integer value) {
            addCriterion("TOCICH.PAY_ADD_AMT <", value, "payAddAmt");
            return (Criteria) this;
        }

        public Criteria andPayAddAmtLessThanOrEqualTo(Integer value) {
            addCriterion("TOCICH.PAY_ADD_AMT <=", value, "payAddAmt");
            return (Criteria) this;
        }

        public Criteria andPayAddAmtIn(List<Integer> values) {
            addCriterion("TOCICH.PAY_ADD_AMT in", values, "payAddAmt");
            return (Criteria) this;
        }

        public Criteria andPayAddAmtNotIn(List<Integer> values) {
            addCriterion("TOCICH.PAY_ADD_AMT not in", values, "payAddAmt");
            return (Criteria) this;
        }

        public Criteria andPayAddAmtBetween(Integer value1, Integer value2) {
            addCriterion("TOCICH.PAY_ADD_AMT between", value1, value2, "payAddAmt");
            return (Criteria) this;
        }

        public Criteria andPayAddAmtNotBetween(Integer value1, Integer value2) {
            addCriterion("TOCICH.PAY_ADD_AMT not between", value1, value2, "payAddAmt");
            return (Criteria) this;
        }

        public Criteria andPtSaveCnclAmtIsNull() {
            addCriterion("TOCICH.PT_SAVE_CNCL_AMT is null");
            return (Criteria) this;
        }

        public Criteria andPtSaveCnclAmtIsNotNull() {
            addCriterion("TOCICH.PT_SAVE_CNCL_AMT is not null");
            return (Criteria) this;
        }

        public Criteria andPtSaveCnclAmtEqualTo(Integer value) {
            addCriterion("TOCICH.PT_SAVE_CNCL_AMT =", value, "ptSaveCnclAmt");
            return (Criteria) this;
        }

        public Criteria andPtSaveCnclAmtNotEqualTo(Integer value) {
            addCriterion("TOCICH.PT_SAVE_CNCL_AMT <>", value, "ptSaveCnclAmt");
            return (Criteria) this;
        }

        public Criteria andPtSaveCnclAmtGreaterThan(Integer value) {
            addCriterion("TOCICH.PT_SAVE_CNCL_AMT >", value, "ptSaveCnclAmt");
            return (Criteria) this;
        }

        public Criteria andPtSaveCnclAmtGreaterThanOrEqualTo(Integer value) {
            addCriterion("TOCICH.PT_SAVE_CNCL_AMT >=", value, "ptSaveCnclAmt");
            return (Criteria) this;
        }

        public Criteria andPtSaveCnclAmtLessThan(Integer value) {
            addCriterion("TOCICH.PT_SAVE_CNCL_AMT <", value, "ptSaveCnclAmt");
            return (Criteria) this;
        }

        public Criteria andPtSaveCnclAmtLessThanOrEqualTo(Integer value) {
            addCriterion("TOCICH.PT_SAVE_CNCL_AMT <=", value, "ptSaveCnclAmt");
            return (Criteria) this;
        }

        public Criteria andPtSaveCnclAmtIn(List<Integer> values) {
            addCriterion("TOCICH.PT_SAVE_CNCL_AMT in", values, "ptSaveCnclAmt");
            return (Criteria) this;
        }

        public Criteria andPtSaveCnclAmtNotIn(List<Integer> values) {
            addCriterion("TOCICH.PT_SAVE_CNCL_AMT not in", values, "ptSaveCnclAmt");
            return (Criteria) this;
        }

        public Criteria andPtSaveCnclAmtBetween(Integer value1, Integer value2) {
            addCriterion("TOCICH.PT_SAVE_CNCL_AMT between", value1, value2, "ptSaveCnclAmt");
            return (Criteria) this;
        }

        public Criteria andPtSaveCnclAmtNotBetween(Integer value1, Integer value2) {
            addCriterion("TOCICH.PT_SAVE_CNCL_AMT not between", value1, value2, "ptSaveCnclAmt");
            return (Criteria) this;
        }

        public Criteria andSettlStatCdIsNull() {
            addCriterion("TOCICH.SETTL_STAT_CD is null");
            return (Criteria) this;
        }

        public Criteria andSettlStatCdIsNotNull() {
            addCriterion("TOCICH.SETTL_STAT_CD is not null");
            return (Criteria) this;
        }

        public Criteria andSettlStatCdEqualTo(String value) {
            addCriterion("TOCICH.SETTL_STAT_CD =", value, "settlStatCd");
            return (Criteria) this;
        }

        public Criteria andSettlStatCdNotEqualTo(String value) {
            addCriterion("TOCICH.SETTL_STAT_CD <>", value, "settlStatCd");
            return (Criteria) this;
        }

        public Criteria andSettlStatCdGreaterThan(String value) {
            addCriterion("TOCICH.SETTL_STAT_CD >", value, "settlStatCd");
            return (Criteria) this;
        }

        public Criteria andSettlStatCdGreaterThanOrEqualTo(String value) {
            addCriterion("TOCICH.SETTL_STAT_CD >=", value, "settlStatCd");
            return (Criteria) this;
        }

        public Criteria andSettlStatCdLessThan(String value) {
            addCriterion("TOCICH.SETTL_STAT_CD <", value, "settlStatCd");
            return (Criteria) this;
        }

        public Criteria andSettlStatCdLessThanOrEqualTo(String value) {
            addCriterion("TOCICH.SETTL_STAT_CD <=", value, "settlStatCd");
            return (Criteria) this;
        }

        public Criteria andSettlStatCdLike(String value) {
            addCriterion("TOCICH.SETTL_STAT_CD like", value, "settlStatCd");
            return (Criteria) this;
        }

        public Criteria andSettlStatCdNotLike(String value) {
            addCriterion("TOCICH.SETTL_STAT_CD not like", value, "settlStatCd");
            return (Criteria) this;
        }

        public Criteria andSettlStatCdIn(List<String> values) {
            addCriterion("TOCICH.SETTL_STAT_CD in", values, "settlStatCd");
            return (Criteria) this;
        }

        public Criteria andSettlStatCdNotIn(List<String> values) {
            addCriterion("TOCICH.SETTL_STAT_CD not in", values, "settlStatCd");
            return (Criteria) this;
        }

        public Criteria andSettlStatCdBetween(String value1, String value2) {
            addCriterion("TOCICH.SETTL_STAT_CD between", value1, value2, "settlStatCd");
            return (Criteria) this;
        }

        public Criteria andSettlStatCdNotBetween(String value1, String value2) {
            addCriterion("TOCICH.SETTL_STAT_CD not between", value1, value2, "settlStatCd");
            return (Criteria) this;
        }

        public Criteria andSettlYmdIsNull() {
            addCriterion("TOCICH.SETTL_YMD is null");
            return (Criteria) this;
        }

        public Criteria andSettlYmdIsNotNull() {
            addCriterion("TOCICH.SETTL_YMD is not null");
            return (Criteria) this;
        }

        public Criteria andSettlYmdEqualTo(String value) {
            addCriterion("TOCICH.SETTL_YMD =", value, "settlYmd");
            return (Criteria) this;
        }

        public Criteria andSettlYmdNotEqualTo(String value) {
            addCriterion("TOCICH.SETTL_YMD <>", value, "settlYmd");
            return (Criteria) this;
        }

        public Criteria andSettlYmdGreaterThan(String value) {
            addCriterion("TOCICH.SETTL_YMD >", value, "settlYmd");
            return (Criteria) this;
        }

        public Criteria andSettlYmdGreaterThanOrEqualTo(String value) {
            addCriterion("TOCICH.SETTL_YMD >=", value, "settlYmd");
            return (Criteria) this;
        }

        public Criteria andSettlYmdLessThan(String value) {
            addCriterion("TOCICH.SETTL_YMD <", value, "settlYmd");
            return (Criteria) this;
        }

        public Criteria andSettlYmdLessThanOrEqualTo(String value) {
            addCriterion("TOCICH.SETTL_YMD <=", value, "settlYmd");
            return (Criteria) this;
        }

        public Criteria andSettlYmdLike(String value) {
            addCriterion("TOCICH.SETTL_YMD like", value, "settlYmd");
            return (Criteria) this;
        }

        public Criteria andSettlYmdNotLike(String value) {
            addCriterion("TOCICH.SETTL_YMD not like", value, "settlYmd");
            return (Criteria) this;
        }

        public Criteria andSettlYmdIn(List<String> values) {
            addCriterion("TOCICH.SETTL_YMD in", values, "settlYmd");
            return (Criteria) this;
        }

        public Criteria andSettlYmdNotIn(List<String> values) {
            addCriterion("TOCICH.SETTL_YMD not in", values, "settlYmd");
            return (Criteria) this;
        }

        public Criteria andSettlYmdBetween(String value1, String value2) {
            addCriterion("TOCICH.SETTL_YMD between", value1, value2, "settlYmd");
            return (Criteria) this;
        }

        public Criteria andSettlYmdNotBetween(String value1, String value2) {
            addCriterion("TOCICH.SETTL_YMD not between", value1, value2, "settlYmd");
            return (Criteria) this;
        }

        public Criteria andSettlPgYmdIsNull() {
            addCriterion("TOCICH.SETTL_PG_YMD is null");
            return (Criteria) this;
        }

        public Criteria andSettlPgYmdIsNotNull() {
            addCriterion("TOCICH.SETTL_PG_YMD is not null");
            return (Criteria) this;
        }

        public Criteria andSettlPgYmdEqualTo(String value) {
            addCriterion("TOCICH.SETTL_PG_YMD =", value, "settlPgYmd");
            return (Criteria) this;
        }

        public Criteria andSettlPgYmdNotEqualTo(String value) {
            addCriterion("TOCICH.SETTL_PG_YMD <>", value, "settlPgYmd");
            return (Criteria) this;
        }

        public Criteria andSettlPgYmdGreaterThan(String value) {
            addCriterion("TOCICH.SETTL_PG_YMD >", value, "settlPgYmd");
            return (Criteria) this;
        }

        public Criteria andSettlPgYmdGreaterThanOrEqualTo(String value) {
            addCriterion("TOCICH.SETTL_PG_YMD >=", value, "settlPgYmd");
            return (Criteria) this;
        }

        public Criteria andSettlPgYmdLessThan(String value) {
            addCriterion("TOCICH.SETTL_PG_YMD <", value, "settlPgYmd");
            return (Criteria) this;
        }

        public Criteria andSettlPgYmdLessThanOrEqualTo(String value) {
            addCriterion("TOCICH.SETTL_PG_YMD <=", value, "settlPgYmd");
            return (Criteria) this;
        }

        public Criteria andSettlPgYmdLike(String value) {
            addCriterion("TOCICH.SETTL_PG_YMD like", value, "settlPgYmd");
            return (Criteria) this;
        }

        public Criteria andSettlPgYmdNotLike(String value) {
            addCriterion("TOCICH.SETTL_PG_YMD not like", value, "settlPgYmd");
            return (Criteria) this;
        }

        public Criteria andSettlPgYmdIn(List<String> values) {
            addCriterion("TOCICH.SETTL_PG_YMD in", values, "settlPgYmd");
            return (Criteria) this;
        }

        public Criteria andSettlPgYmdNotIn(List<String> values) {
            addCriterion("TOCICH.SETTL_PG_YMD not in", values, "settlPgYmd");
            return (Criteria) this;
        }

        public Criteria andSettlPgYmdBetween(String value1, String value2) {
            addCriterion("TOCICH.SETTL_PG_YMD between", value1, value2, "settlPgYmd");
            return (Criteria) this;
        }

        public Criteria andSettlPgYmdNotBetween(String value1, String value2) {
            addCriterion("TOCICH.SETTL_PG_YMD not between", value1, value2, "settlPgYmd");
            return (Criteria) this;
        }

        public Criteria andRegDtIsNull() {
            addCriterion("TOCICH.REG_DT is null");
            return (Criteria) this;
        }

        public Criteria andRegDtIsNotNull() {
            addCriterion("TOCICH.REG_DT is not null");
            return (Criteria) this;
        }

        public Criteria andRegDtEqualTo(Date value) {
            addCriterion("TOCICH.REG_DT =", value, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtNotEqualTo(Date value) {
            addCriterion("TOCICH.REG_DT <>", value, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtGreaterThan(Date value) {
            addCriterion("TOCICH.REG_DT >", value, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtGreaterThanOrEqualTo(Date value) {
            addCriterion("TOCICH.REG_DT >=", value, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtLessThan(Date value) {
            addCriterion("TOCICH.REG_DT <", value, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtLessThanOrEqualTo(Date value) {
            addCriterion("TOCICH.REG_DT <=", value, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtIn(List<Date> values) {
            addCriterion("TOCICH.REG_DT in", values, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtNotIn(List<Date> values) {
            addCriterion("TOCICH.REG_DT not in", values, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtBetween(Date value1, Date value2) {
            addCriterion("TOCICH.REG_DT between", value1, value2, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtNotBetween(Date value1, Date value2) {
            addCriterion("TOCICH.REG_DT not between", value1, value2, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegIdIsNull() {
            addCriterion("TOCICH.REG_ID is null");
            return (Criteria) this;
        }

        public Criteria andRegIdIsNotNull() {
            addCriterion("TOCICH.REG_ID is not null");
            return (Criteria) this;
        }

        public Criteria andRegIdEqualTo(String value) {
            addCriterion("TOCICH.REG_ID =", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdNotEqualTo(String value) {
            addCriterion("TOCICH.REG_ID <>", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdGreaterThan(String value) {
            addCriterion("TOCICH.REG_ID >", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdGreaterThanOrEqualTo(String value) {
            addCriterion("TOCICH.REG_ID >=", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdLessThan(String value) {
            addCriterion("TOCICH.REG_ID <", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdLessThanOrEqualTo(String value) {
            addCriterion("TOCICH.REG_ID <=", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdLike(String value) {
            addCriterion("TOCICH.REG_ID like", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdNotLike(String value) {
            addCriterion("TOCICH.REG_ID not like", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdIn(List<String> values) {
            addCriterion("TOCICH.REG_ID in", values, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdNotIn(List<String> values) {
            addCriterion("TOCICH.REG_ID not in", values, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdBetween(String value1, String value2) {
            addCriterion("TOCICH.REG_ID between", value1, value2, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdNotBetween(String value1, String value2) {
            addCriterion("TOCICH.REG_ID not between", value1, value2, "regId");
            return (Criteria) this;
        }

        public Criteria andModDtIsNull() {
            addCriterion("TOCICH.MOD_DT is null");
            return (Criteria) this;
        }

        public Criteria andModDtIsNotNull() {
            addCriterion("TOCICH.MOD_DT is not null");
            return (Criteria) this;
        }

        public Criteria andModDtEqualTo(Date value) {
            addCriterion("TOCICH.MOD_DT =", value, "modDt");
            return (Criteria) this;
        }

        public Criteria andModDtNotEqualTo(Date value) {
            addCriterion("TOCICH.MOD_DT <>", value, "modDt");
            return (Criteria) this;
        }

        public Criteria andModDtGreaterThan(Date value) {
            addCriterion("TOCICH.MOD_DT >", value, "modDt");
            return (Criteria) this;
        }

        public Criteria andModDtGreaterThanOrEqualTo(Date value) {
            addCriterion("TOCICH.MOD_DT >=", value, "modDt");
            return (Criteria) this;
        }

        public Criteria andModDtLessThan(Date value) {
            addCriterion("TOCICH.MOD_DT <", value, "modDt");
            return (Criteria) this;
        }

        public Criteria andModDtLessThanOrEqualTo(Date value) {
            addCriterion("TOCICH.MOD_DT <=", value, "modDt");
            return (Criteria) this;
        }

        public Criteria andModDtIn(List<Date> values) {
            addCriterion("TOCICH.MOD_DT in", values, "modDt");
            return (Criteria) this;
        }

        public Criteria andModDtNotIn(List<Date> values) {
            addCriterion("TOCICH.MOD_DT not in", values, "modDt");
            return (Criteria) this;
        }

        public Criteria andModDtBetween(Date value1, Date value2) {
            addCriterion("TOCICH.MOD_DT between", value1, value2, "modDt");
            return (Criteria) this;
        }

        public Criteria andModDtNotBetween(Date value1, Date value2) {
            addCriterion("TOCICH.MOD_DT not between", value1, value2, "modDt");
            return (Criteria) this;
        }

        public Criteria andModIdIsNull() {
            addCriterion("TOCICH.MOD_ID is null");
            return (Criteria) this;
        }

        public Criteria andModIdIsNotNull() {
            addCriterion("TOCICH.MOD_ID is not null");
            return (Criteria) this;
        }

        public Criteria andModIdEqualTo(String value) {
            addCriterion("TOCICH.MOD_ID =", value, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdNotEqualTo(String value) {
            addCriterion("TOCICH.MOD_ID <>", value, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdGreaterThan(String value) {
            addCriterion("TOCICH.MOD_ID >", value, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdGreaterThanOrEqualTo(String value) {
            addCriterion("TOCICH.MOD_ID >=", value, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdLessThan(String value) {
            addCriterion("TOCICH.MOD_ID <", value, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdLessThanOrEqualTo(String value) {
            addCriterion("TOCICH.MOD_ID <=", value, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdLike(String value) {
            addCriterion("TOCICH.MOD_ID like", value, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdNotLike(String value) {
            addCriterion("TOCICH.MOD_ID not like", value, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdIn(List<String> values) {
            addCriterion("TOCICH.MOD_ID in", values, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdNotIn(List<String> values) {
            addCriterion("TOCICH.MOD_ID not in", values, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdBetween(String value1, String value2) {
            addCriterion("TOCICH.MOD_ID between", value1, value2, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdNotBetween(String value1, String value2) {
            addCriterion("TOCICH.MOD_ID not between", value1, value2, "modId");
            return (Criteria) this;
        }

        public Criteria andClmItemNoLikeInsensitive(String value) {
            addCriterion("upper(TOCICH.CLM_ITEM_NO) like", value.toUpperCase(), "clmItemNo");
            return (Criteria) this;
        }

        public Criteria andClmTpCdLikeInsensitive(String value) {
            addCriterion("upper(TOCICH.CLM_TP_CD) like", value.toUpperCase(), "clmTpCd");
            return (Criteria) this;
        }

        public Criteria andClmItemStatCdLikeInsensitive(String value) {
            addCriterion("upper(TOCICH.CLM_ITEM_STAT_CD) like", value.toUpperCase(), "clmItemStatCd");
            return (Criteria) this;
        }

        public Criteria andClmTimeOrdItemStatCdLikeInsensitive(String value) {
            addCriterion("upper(TOCICH.CLM_TIME_ORD_ITEM_STAT_CD) like", value.toUpperCase(), "clmTimeOrdItemStatCd");
            return (Criteria) this;
        }

        public Criteria andClmHoldRsnLikeInsensitive(String value) {
            addCriterion("upper(TOCICH.CLM_HOLD_RSN) like", value.toUpperCase(), "clmHoldRsn");
            return (Criteria) this;
        }

        public Criteria andClmRejRsnLikeInsensitive(String value) {
            addCriterion("upper(TOCICH.CLM_REJ_RSN) like", value.toUpperCase(), "clmRejRsn");
            return (Criteria) this;
        }

        public Criteria andSettlStatCdLikeInsensitive(String value) {
            addCriterion("upper(TOCICH.SETTL_STAT_CD) like", value.toUpperCase(), "settlStatCd");
            return (Criteria) this;
        }

        public Criteria andSettlYmdLikeInsensitive(String value) {
            addCriterion("upper(TOCICH.SETTL_YMD) like", value.toUpperCase(), "settlYmd");
            return (Criteria) this;
        }

        public Criteria andSettlPgYmdLikeInsensitive(String value) {
            addCriterion("upper(TOCICH.SETTL_PG_YMD) like", value.toUpperCase(), "settlPgYmd");
            return (Criteria) this;
        }

        public Criteria andRegIdLikeInsensitive(String value) {
            addCriterion("upper(TOCICH.REG_ID) like", value.toUpperCase(), "regId");
            return (Criteria) this;
        }

        public Criteria andModIdLikeInsensitive(String value) {
            addCriterion("upper(TOCICH.MOD_ID) like", value.toUpperCase(), "modId");
            return (Criteria) this;
        }

        public Criteria andClmItemNoLikeLeft(String value) {
            addCriterion("TOCICH.CLM_ITEM_NO like ", "%" + value, "clmItemNo");
            return (Criteria) this;
        }

        public Criteria andClmItemNoLikeRight(String value) {
            addCriterion("TOCICH.CLM_ITEM_NO like ", value + "%", "clmItemNo");
            return (Criteria) this;
        }

        public Criteria andClmItemNoLikeBoth(String value) {
            addCriterion("TOCICH.CLM_ITEM_NO like ", "%" + value + "%", "clmItemNo");
            return (Criteria) this;
        }

        public Criteria andClmTpCdLikeLeft(String value) {
            addCriterion("TOCICH.CLM_TP_CD like ", "%" + value, "clmTpCd");
            return (Criteria) this;
        }

        public Criteria andClmTpCdLikeRight(String value) {
            addCriterion("TOCICH.CLM_TP_CD like ", value + "%", "clmTpCd");
            return (Criteria) this;
        }

        public Criteria andClmTpCdLikeBoth(String value) {
            addCriterion("TOCICH.CLM_TP_CD like ", "%" + value + "%", "clmTpCd");
            return (Criteria) this;
        }

        public Criteria andClmItemStatCdLikeLeft(String value) {
            addCriterion("TOCICH.CLM_ITEM_STAT_CD like ", "%" + value, "clmItemStatCd");
            return (Criteria) this;
        }

        public Criteria andClmItemStatCdLikeRight(String value) {
            addCriterion("TOCICH.CLM_ITEM_STAT_CD like ", value + "%", "clmItemStatCd");
            return (Criteria) this;
        }

        public Criteria andClmItemStatCdLikeBoth(String value) {
            addCriterion("TOCICH.CLM_ITEM_STAT_CD like ", "%" + value + "%", "clmItemStatCd");
            return (Criteria) this;
        }

        public Criteria andClmTimeOrdItemStatCdLikeLeft(String value) {
            addCriterion("TOCICH.CLM_TIME_ORD_ITEM_STAT_CD like ", "%" + value, "clmTimeOrdItemStatCd");
            return (Criteria) this;
        }

        public Criteria andClmTimeOrdItemStatCdLikeRight(String value) {
            addCriterion("TOCICH.CLM_TIME_ORD_ITEM_STAT_CD like ", value + "%", "clmTimeOrdItemStatCd");
            return (Criteria) this;
        }

        public Criteria andClmTimeOrdItemStatCdLikeBoth(String value) {
            addCriterion("TOCICH.CLM_TIME_ORD_ITEM_STAT_CD like ", "%" + value + "%", "clmTimeOrdItemStatCd");
            return (Criteria) this;
        }

        public Criteria andClmHoldRsnLikeLeft(String value) {
            addCriterion("TOCICH.CLM_HOLD_RSN like ", "%" + value, "clmHoldRsn");
            return (Criteria) this;
        }

        public Criteria andClmHoldRsnLikeRight(String value) {
            addCriterion("TOCICH.CLM_HOLD_RSN like ", value + "%", "clmHoldRsn");
            return (Criteria) this;
        }

        public Criteria andClmHoldRsnLikeBoth(String value) {
            addCriterion("TOCICH.CLM_HOLD_RSN like ", "%" + value + "%", "clmHoldRsn");
            return (Criteria) this;
        }

        public Criteria andClmRejRsnLikeLeft(String value) {
            addCriterion("TOCICH.CLM_REJ_RSN like ", "%" + value, "clmRejRsn");
            return (Criteria) this;
        }

        public Criteria andClmRejRsnLikeRight(String value) {
            addCriterion("TOCICH.CLM_REJ_RSN like ", value + "%", "clmRejRsn");
            return (Criteria) this;
        }

        public Criteria andClmRejRsnLikeBoth(String value) {
            addCriterion("TOCICH.CLM_REJ_RSN like ", "%" + value + "%", "clmRejRsn");
            return (Criteria) this;
        }

        public Criteria andSettlStatCdLikeLeft(String value) {
            addCriterion("TOCICH.SETTL_STAT_CD like ", "%" + value, "settlStatCd");
            return (Criteria) this;
        }

        public Criteria andSettlStatCdLikeRight(String value) {
            addCriterion("TOCICH.SETTL_STAT_CD like ", value + "%", "settlStatCd");
            return (Criteria) this;
        }

        public Criteria andSettlStatCdLikeBoth(String value) {
            addCriterion("TOCICH.SETTL_STAT_CD like ", "%" + value + "%", "settlStatCd");
            return (Criteria) this;
        }

        public Criteria andSettlYmdLikeLeft(String value) {
            addCriterion("TOCICH.SETTL_YMD like ", "%" + value, "settlYmd");
            return (Criteria) this;
        }

        public Criteria andSettlYmdLikeRight(String value) {
            addCriterion("TOCICH.SETTL_YMD like ", value + "%", "settlYmd");
            return (Criteria) this;
        }

        public Criteria andSettlYmdLikeBoth(String value) {
            addCriterion("TOCICH.SETTL_YMD like ", "%" + value + "%", "settlYmd");
            return (Criteria) this;
        }

        public Criteria andSettlPgYmdLikeLeft(String value) {
            addCriterion("TOCICH.SETTL_PG_YMD like ", "%" + value, "settlPgYmd");
            return (Criteria) this;
        }

        public Criteria andSettlPgYmdLikeRight(String value) {
            addCriterion("TOCICH.SETTL_PG_YMD like ", value + "%", "settlPgYmd");
            return (Criteria) this;
        }

        public Criteria andSettlPgYmdLikeBoth(String value) {
            addCriterion("TOCICH.SETTL_PG_YMD like ", "%" + value + "%", "settlPgYmd");
            return (Criteria) this;
        }

        public Criteria andRegIdLikeLeft(String value) {
            addCriterion("TOCICH.REG_ID like ", "%" + value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdLikeRight(String value) {
            addCriterion("TOCICH.REG_ID like ", value + "%", "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdLikeBoth(String value) {
            addCriterion("TOCICH.REG_ID like ", "%" + value + "%", "regId");
            return (Criteria) this;
        }

        public Criteria andModIdLikeLeft(String value) {
            addCriterion("TOCICH.MOD_ID like ", "%" + value, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdLikeRight(String value) {
            addCriterion("TOCICH.MOD_ID like ", value + "%", "modId");
            return (Criteria) this;
        }

        public Criteria andModIdLikeBoth(String value) {
            addCriterion("TOCICH.MOD_ID like ", "%" + value + "%", "modId");
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