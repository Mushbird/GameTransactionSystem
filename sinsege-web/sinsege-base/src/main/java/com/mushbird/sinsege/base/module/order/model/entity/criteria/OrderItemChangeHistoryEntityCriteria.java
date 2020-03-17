package com.mushbird.sinsege.base.module.order.model.entity.criteria;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class OrderItemChangeHistoryEntityCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    public OrderItemChangeHistoryEntityCriteria() {
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

        public Criteria andOrdItemChistIdIsNull() {
            addCriterion("TOICH.ORD_ITEM_CHIST_ID is null");
            return (Criteria) this;
        }

        public Criteria andOrdItemChistIdIsNotNull() {
            addCriterion("TOICH.ORD_ITEM_CHIST_ID is not null");
            return (Criteria) this;
        }

        public Criteria andOrdItemChistIdEqualTo(Integer value) {
            addCriterion("TOICH.ORD_ITEM_CHIST_ID =", value, "ordItemChistId");
            return (Criteria) this;
        }

        public Criteria andOrdItemChistIdNotEqualTo(Integer value) {
            addCriterion("TOICH.ORD_ITEM_CHIST_ID <>", value, "ordItemChistId");
            return (Criteria) this;
        }

        public Criteria andOrdItemChistIdGreaterThan(Integer value) {
            addCriterion("TOICH.ORD_ITEM_CHIST_ID >", value, "ordItemChistId");
            return (Criteria) this;
        }

        public Criteria andOrdItemChistIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("TOICH.ORD_ITEM_CHIST_ID >=", value, "ordItemChistId");
            return (Criteria) this;
        }

        public Criteria andOrdItemChistIdLessThan(Integer value) {
            addCriterion("TOICH.ORD_ITEM_CHIST_ID <", value, "ordItemChistId");
            return (Criteria) this;
        }

        public Criteria andOrdItemChistIdLessThanOrEqualTo(Integer value) {
            addCriterion("TOICH.ORD_ITEM_CHIST_ID <=", value, "ordItemChistId");
            return (Criteria) this;
        }

        public Criteria andOrdItemChistIdIn(List<Integer> values) {
            addCriterion("TOICH.ORD_ITEM_CHIST_ID in", values, "ordItemChistId");
            return (Criteria) this;
        }

        public Criteria andOrdItemChistIdNotIn(List<Integer> values) {
            addCriterion("TOICH.ORD_ITEM_CHIST_ID not in", values, "ordItemChistId");
            return (Criteria) this;
        }

        public Criteria andOrdItemChistIdBetween(Integer value1, Integer value2) {
            addCriterion("TOICH.ORD_ITEM_CHIST_ID between", value1, value2, "ordItemChistId");
            return (Criteria) this;
        }

        public Criteria andOrdItemChistIdNotBetween(Integer value1, Integer value2) {
            addCriterion("TOICH.ORD_ITEM_CHIST_ID not between", value1, value2, "ordItemChistId");
            return (Criteria) this;
        }

        public Criteria andOrdItemIdIsNull() {
            addCriterion("TOICH.ORD_ITEM_ID is null");
            return (Criteria) this;
        }

        public Criteria andOrdItemIdIsNotNull() {
            addCriterion("TOICH.ORD_ITEM_ID is not null");
            return (Criteria) this;
        }

        public Criteria andOrdItemIdEqualTo(Integer value) {
            addCriterion("TOICH.ORD_ITEM_ID =", value, "ordItemId");
            return (Criteria) this;
        }

        public Criteria andOrdItemIdNotEqualTo(Integer value) {
            addCriterion("TOICH.ORD_ITEM_ID <>", value, "ordItemId");
            return (Criteria) this;
        }

        public Criteria andOrdItemIdGreaterThan(Integer value) {
            addCriterion("TOICH.ORD_ITEM_ID >", value, "ordItemId");
            return (Criteria) this;
        }

        public Criteria andOrdItemIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("TOICH.ORD_ITEM_ID >=", value, "ordItemId");
            return (Criteria) this;
        }

        public Criteria andOrdItemIdLessThan(Integer value) {
            addCriterion("TOICH.ORD_ITEM_ID <", value, "ordItemId");
            return (Criteria) this;
        }

        public Criteria andOrdItemIdLessThanOrEqualTo(Integer value) {
            addCriterion("TOICH.ORD_ITEM_ID <=", value, "ordItemId");
            return (Criteria) this;
        }

        public Criteria andOrdItemIdIn(List<Integer> values) {
            addCriterion("TOICH.ORD_ITEM_ID in", values, "ordItemId");
            return (Criteria) this;
        }

        public Criteria andOrdItemIdNotIn(List<Integer> values) {
            addCriterion("TOICH.ORD_ITEM_ID not in", values, "ordItemId");
            return (Criteria) this;
        }

        public Criteria andOrdItemIdBetween(Integer value1, Integer value2) {
            addCriterion("TOICH.ORD_ITEM_ID between", value1, value2, "ordItemId");
            return (Criteria) this;
        }

        public Criteria andOrdItemIdNotBetween(Integer value1, Integer value2) {
            addCriterion("TOICH.ORD_ITEM_ID not between", value1, value2, "ordItemId");
            return (Criteria) this;
        }

        public Criteria andOrdIdIsNull() {
            addCriterion("TOICH.ORD_ID is null");
            return (Criteria) this;
        }

        public Criteria andOrdIdIsNotNull() {
            addCriterion("TOICH.ORD_ID is not null");
            return (Criteria) this;
        }

        public Criteria andOrdIdEqualTo(Integer value) {
            addCriterion("TOICH.ORD_ID =", value, "ordId");
            return (Criteria) this;
        }

        public Criteria andOrdIdNotEqualTo(Integer value) {
            addCriterion("TOICH.ORD_ID <>", value, "ordId");
            return (Criteria) this;
        }

        public Criteria andOrdIdGreaterThan(Integer value) {
            addCriterion("TOICH.ORD_ID >", value, "ordId");
            return (Criteria) this;
        }

        public Criteria andOrdIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("TOICH.ORD_ID >=", value, "ordId");
            return (Criteria) this;
        }

        public Criteria andOrdIdLessThan(Integer value) {
            addCriterion("TOICH.ORD_ID <", value, "ordId");
            return (Criteria) this;
        }

        public Criteria andOrdIdLessThanOrEqualTo(Integer value) {
            addCriterion("TOICH.ORD_ID <=", value, "ordId");
            return (Criteria) this;
        }

        public Criteria andOrdIdIn(List<Integer> values) {
            addCriterion("TOICH.ORD_ID in", values, "ordId");
            return (Criteria) this;
        }

        public Criteria andOrdIdNotIn(List<Integer> values) {
            addCriterion("TOICH.ORD_ID not in", values, "ordId");
            return (Criteria) this;
        }

        public Criteria andOrdIdBetween(Integer value1, Integer value2) {
            addCriterion("TOICH.ORD_ID between", value1, value2, "ordId");
            return (Criteria) this;
        }

        public Criteria andOrdIdNotBetween(Integer value1, Integer value2) {
            addCriterion("TOICH.ORD_ID not between", value1, value2, "ordId");
            return (Criteria) this;
        }

        public Criteria andOrdDelvIdIsNull() {
            addCriterion("TOICH.ORD_DELV_ID is null");
            return (Criteria) this;
        }

        public Criteria andOrdDelvIdIsNotNull() {
            addCriterion("TOICH.ORD_DELV_ID is not null");
            return (Criteria) this;
        }

        public Criteria andOrdDelvIdEqualTo(Integer value) {
            addCriterion("TOICH.ORD_DELV_ID =", value, "ordDelvId");
            return (Criteria) this;
        }

        public Criteria andOrdDelvIdNotEqualTo(Integer value) {
            addCriterion("TOICH.ORD_DELV_ID <>", value, "ordDelvId");
            return (Criteria) this;
        }

        public Criteria andOrdDelvIdGreaterThan(Integer value) {
            addCriterion("TOICH.ORD_DELV_ID >", value, "ordDelvId");
            return (Criteria) this;
        }

        public Criteria andOrdDelvIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("TOICH.ORD_DELV_ID >=", value, "ordDelvId");
            return (Criteria) this;
        }

        public Criteria andOrdDelvIdLessThan(Integer value) {
            addCriterion("TOICH.ORD_DELV_ID <", value, "ordDelvId");
            return (Criteria) this;
        }

        public Criteria andOrdDelvIdLessThanOrEqualTo(Integer value) {
            addCriterion("TOICH.ORD_DELV_ID <=", value, "ordDelvId");
            return (Criteria) this;
        }

        public Criteria andOrdDelvIdIn(List<Integer> values) {
            addCriterion("TOICH.ORD_DELV_ID in", values, "ordDelvId");
            return (Criteria) this;
        }

        public Criteria andOrdDelvIdNotIn(List<Integer> values) {
            addCriterion("TOICH.ORD_DELV_ID not in", values, "ordDelvId");
            return (Criteria) this;
        }

        public Criteria andOrdDelvIdBetween(Integer value1, Integer value2) {
            addCriterion("TOICH.ORD_DELV_ID between", value1, value2, "ordDelvId");
            return (Criteria) this;
        }

        public Criteria andOrdDelvIdNotBetween(Integer value1, Integer value2) {
            addCriterion("TOICH.ORD_DELV_ID not between", value1, value2, "ordDelvId");
            return (Criteria) this;
        }

        public Criteria andOrdItemSeqIsNull() {
            addCriterion("TOICH.ORD_ITEM_SEQ is null");
            return (Criteria) this;
        }

        public Criteria andOrdItemSeqIsNotNull() {
            addCriterion("TOICH.ORD_ITEM_SEQ is not null");
            return (Criteria) this;
        }

        public Criteria andOrdItemSeqEqualTo(Integer value) {
            addCriterion("TOICH.ORD_ITEM_SEQ =", value, "ordItemSeq");
            return (Criteria) this;
        }

        public Criteria andOrdItemSeqNotEqualTo(Integer value) {
            addCriterion("TOICH.ORD_ITEM_SEQ <>", value, "ordItemSeq");
            return (Criteria) this;
        }

        public Criteria andOrdItemSeqGreaterThan(Integer value) {
            addCriterion("TOICH.ORD_ITEM_SEQ >", value, "ordItemSeq");
            return (Criteria) this;
        }

        public Criteria andOrdItemSeqGreaterThanOrEqualTo(Integer value) {
            addCriterion("TOICH.ORD_ITEM_SEQ >=", value, "ordItemSeq");
            return (Criteria) this;
        }

        public Criteria andOrdItemSeqLessThan(Integer value) {
            addCriterion("TOICH.ORD_ITEM_SEQ <", value, "ordItemSeq");
            return (Criteria) this;
        }

        public Criteria andOrdItemSeqLessThanOrEqualTo(Integer value) {
            addCriterion("TOICH.ORD_ITEM_SEQ <=", value, "ordItemSeq");
            return (Criteria) this;
        }

        public Criteria andOrdItemSeqIn(List<Integer> values) {
            addCriterion("TOICH.ORD_ITEM_SEQ in", values, "ordItemSeq");
            return (Criteria) this;
        }

        public Criteria andOrdItemSeqNotIn(List<Integer> values) {
            addCriterion("TOICH.ORD_ITEM_SEQ not in", values, "ordItemSeq");
            return (Criteria) this;
        }

        public Criteria andOrdItemSeqBetween(Integer value1, Integer value2) {
            addCriterion("TOICH.ORD_ITEM_SEQ between", value1, value2, "ordItemSeq");
            return (Criteria) this;
        }

        public Criteria andOrdItemSeqNotBetween(Integer value1, Integer value2) {
            addCriterion("TOICH.ORD_ITEM_SEQ not between", value1, value2, "ordItemSeq");
            return (Criteria) this;
        }

        public Criteria andOrdItemNoIsNull() {
            addCriterion("TOICH.ORD_ITEM_NO is null");
            return (Criteria) this;
        }

        public Criteria andOrdItemNoIsNotNull() {
            addCriterion("TOICH.ORD_ITEM_NO is not null");
            return (Criteria) this;
        }

        public Criteria andOrdItemNoEqualTo(String value) {
            addCriterion("TOICH.ORD_ITEM_NO =", value, "ordItemNo");
            return (Criteria) this;
        }

        public Criteria andOrdItemNoNotEqualTo(String value) {
            addCriterion("TOICH.ORD_ITEM_NO <>", value, "ordItemNo");
            return (Criteria) this;
        }

        public Criteria andOrdItemNoGreaterThan(String value) {
            addCriterion("TOICH.ORD_ITEM_NO >", value, "ordItemNo");
            return (Criteria) this;
        }

        public Criteria andOrdItemNoGreaterThanOrEqualTo(String value) {
            addCriterion("TOICH.ORD_ITEM_NO >=", value, "ordItemNo");
            return (Criteria) this;
        }

        public Criteria andOrdItemNoLessThan(String value) {
            addCriterion("TOICH.ORD_ITEM_NO <", value, "ordItemNo");
            return (Criteria) this;
        }

        public Criteria andOrdItemNoLessThanOrEqualTo(String value) {
            addCriterion("TOICH.ORD_ITEM_NO <=", value, "ordItemNo");
            return (Criteria) this;
        }

        public Criteria andOrdItemNoLike(String value) {
            addCriterion("TOICH.ORD_ITEM_NO like", value, "ordItemNo");
            return (Criteria) this;
        }

        public Criteria andOrdItemNoNotLike(String value) {
            addCriterion("TOICH.ORD_ITEM_NO not like", value, "ordItemNo");
            return (Criteria) this;
        }

        public Criteria andOrdItemNoIn(List<String> values) {
            addCriterion("TOICH.ORD_ITEM_NO in", values, "ordItemNo");
            return (Criteria) this;
        }

        public Criteria andOrdItemNoNotIn(List<String> values) {
            addCriterion("TOICH.ORD_ITEM_NO not in", values, "ordItemNo");
            return (Criteria) this;
        }

        public Criteria andOrdItemNoBetween(String value1, String value2) {
            addCriterion("TOICH.ORD_ITEM_NO between", value1, value2, "ordItemNo");
            return (Criteria) this;
        }

        public Criteria andOrdItemNoNotBetween(String value1, String value2) {
            addCriterion("TOICH.ORD_ITEM_NO not between", value1, value2, "ordItemNo");
            return (Criteria) this;
        }

        public Criteria andOrdItemStatCdIsNull() {
            addCriterion("TOICH.ORD_ITEM_STAT_CD is null");
            return (Criteria) this;
        }

        public Criteria andOrdItemStatCdIsNotNull() {
            addCriterion("TOICH.ORD_ITEM_STAT_CD is not null");
            return (Criteria) this;
        }

        public Criteria andOrdItemStatCdEqualTo(String value) {
            addCriterion("TOICH.ORD_ITEM_STAT_CD =", value, "ordItemStatCd");
            return (Criteria) this;
        }

        public Criteria andOrdItemStatCdNotEqualTo(String value) {
            addCriterion("TOICH.ORD_ITEM_STAT_CD <>", value, "ordItemStatCd");
            return (Criteria) this;
        }

        public Criteria andOrdItemStatCdGreaterThan(String value) {
            addCriterion("TOICH.ORD_ITEM_STAT_CD >", value, "ordItemStatCd");
            return (Criteria) this;
        }

        public Criteria andOrdItemStatCdGreaterThanOrEqualTo(String value) {
            addCriterion("TOICH.ORD_ITEM_STAT_CD >=", value, "ordItemStatCd");
            return (Criteria) this;
        }

        public Criteria andOrdItemStatCdLessThan(String value) {
            addCriterion("TOICH.ORD_ITEM_STAT_CD <", value, "ordItemStatCd");
            return (Criteria) this;
        }

        public Criteria andOrdItemStatCdLessThanOrEqualTo(String value) {
            addCriterion("TOICH.ORD_ITEM_STAT_CD <=", value, "ordItemStatCd");
            return (Criteria) this;
        }

        public Criteria andOrdItemStatCdLike(String value) {
            addCriterion("TOICH.ORD_ITEM_STAT_CD like", value, "ordItemStatCd");
            return (Criteria) this;
        }

        public Criteria andOrdItemStatCdNotLike(String value) {
            addCriterion("TOICH.ORD_ITEM_STAT_CD not like", value, "ordItemStatCd");
            return (Criteria) this;
        }

        public Criteria andOrdItemStatCdIn(List<String> values) {
            addCriterion("TOICH.ORD_ITEM_STAT_CD in", values, "ordItemStatCd");
            return (Criteria) this;
        }

        public Criteria andOrdItemStatCdNotIn(List<String> values) {
            addCriterion("TOICH.ORD_ITEM_STAT_CD not in", values, "ordItemStatCd");
            return (Criteria) this;
        }

        public Criteria andOrdItemStatCdBetween(String value1, String value2) {
            addCriterion("TOICH.ORD_ITEM_STAT_CD between", value1, value2, "ordItemStatCd");
            return (Criteria) this;
        }

        public Criteria andOrdItemStatCdNotBetween(String value1, String value2) {
            addCriterion("TOICH.ORD_ITEM_STAT_CD not between", value1, value2, "ordItemStatCd");
            return (Criteria) this;
        }

        public Criteria andOrdItemStatChgDtIsNull() {
            addCriterion("TOICH.ORD_ITEM_STAT_CHG_DT is null");
            return (Criteria) this;
        }

        public Criteria andOrdItemStatChgDtIsNotNull() {
            addCriterion("TOICH.ORD_ITEM_STAT_CHG_DT is not null");
            return (Criteria) this;
        }

        public Criteria andOrdItemStatChgDtEqualTo(Date value) {
            addCriterionForJDBCDate("TOICH.ORD_ITEM_STAT_CHG_DT =", value, "ordItemStatChgDt");
            return (Criteria) this;
        }

        public Criteria andOrdItemStatChgDtNotEqualTo(Date value) {
            addCriterionForJDBCDate("TOICH.ORD_ITEM_STAT_CHG_DT <>", value, "ordItemStatChgDt");
            return (Criteria) this;
        }

        public Criteria andOrdItemStatChgDtGreaterThan(Date value) {
            addCriterionForJDBCDate("TOICH.ORD_ITEM_STAT_CHG_DT >", value, "ordItemStatChgDt");
            return (Criteria) this;
        }

        public Criteria andOrdItemStatChgDtGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("TOICH.ORD_ITEM_STAT_CHG_DT >=", value, "ordItemStatChgDt");
            return (Criteria) this;
        }

        public Criteria andOrdItemStatChgDtLessThan(Date value) {
            addCriterionForJDBCDate("TOICH.ORD_ITEM_STAT_CHG_DT <", value, "ordItemStatChgDt");
            return (Criteria) this;
        }

        public Criteria andOrdItemStatChgDtLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("TOICH.ORD_ITEM_STAT_CHG_DT <=", value, "ordItemStatChgDt");
            return (Criteria) this;
        }

        public Criteria andOrdItemStatChgDtIn(List<Date> values) {
            addCriterionForJDBCDate("TOICH.ORD_ITEM_STAT_CHG_DT in", values, "ordItemStatChgDt");
            return (Criteria) this;
        }

        public Criteria andOrdItemStatChgDtNotIn(List<Date> values) {
            addCriterionForJDBCDate("TOICH.ORD_ITEM_STAT_CHG_DT not in", values, "ordItemStatChgDt");
            return (Criteria) this;
        }

        public Criteria andOrdItemStatChgDtBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("TOICH.ORD_ITEM_STAT_CHG_DT between", value1, value2, "ordItemStatChgDt");
            return (Criteria) this;
        }

        public Criteria andOrdItemStatChgDtNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("TOICH.ORD_ITEM_STAT_CHG_DT not between", value1, value2, "ordItemStatChgDt");
            return (Criteria) this;
        }

        public Criteria andNowOrdItemStatCdIsNull() {
            addCriterion("TOICH.NOW_ORD_ITEM_STAT_CD is null");
            return (Criteria) this;
        }

        public Criteria andNowOrdItemStatCdIsNotNull() {
            addCriterion("TOICH.NOW_ORD_ITEM_STAT_CD is not null");
            return (Criteria) this;
        }

        public Criteria andNowOrdItemStatCdEqualTo(String value) {
            addCriterion("TOICH.NOW_ORD_ITEM_STAT_CD =", value, "nowOrdItemStatCd");
            return (Criteria) this;
        }

        public Criteria andNowOrdItemStatCdNotEqualTo(String value) {
            addCriterion("TOICH.NOW_ORD_ITEM_STAT_CD <>", value, "nowOrdItemStatCd");
            return (Criteria) this;
        }

        public Criteria andNowOrdItemStatCdGreaterThan(String value) {
            addCriterion("TOICH.NOW_ORD_ITEM_STAT_CD >", value, "nowOrdItemStatCd");
            return (Criteria) this;
        }

        public Criteria andNowOrdItemStatCdGreaterThanOrEqualTo(String value) {
            addCriterion("TOICH.NOW_ORD_ITEM_STAT_CD >=", value, "nowOrdItemStatCd");
            return (Criteria) this;
        }

        public Criteria andNowOrdItemStatCdLessThan(String value) {
            addCriterion("TOICH.NOW_ORD_ITEM_STAT_CD <", value, "nowOrdItemStatCd");
            return (Criteria) this;
        }

        public Criteria andNowOrdItemStatCdLessThanOrEqualTo(String value) {
            addCriterion("TOICH.NOW_ORD_ITEM_STAT_CD <=", value, "nowOrdItemStatCd");
            return (Criteria) this;
        }

        public Criteria andNowOrdItemStatCdLike(String value) {
            addCriterion("TOICH.NOW_ORD_ITEM_STAT_CD like", value, "nowOrdItemStatCd");
            return (Criteria) this;
        }

        public Criteria andNowOrdItemStatCdNotLike(String value) {
            addCriterion("TOICH.NOW_ORD_ITEM_STAT_CD not like", value, "nowOrdItemStatCd");
            return (Criteria) this;
        }

        public Criteria andNowOrdItemStatCdIn(List<String> values) {
            addCriterion("TOICH.NOW_ORD_ITEM_STAT_CD in", values, "nowOrdItemStatCd");
            return (Criteria) this;
        }

        public Criteria andNowOrdItemStatCdNotIn(List<String> values) {
            addCriterion("TOICH.NOW_ORD_ITEM_STAT_CD not in", values, "nowOrdItemStatCd");
            return (Criteria) this;
        }

        public Criteria andNowOrdItemStatCdBetween(String value1, String value2) {
            addCriterion("TOICH.NOW_ORD_ITEM_STAT_CD between", value1, value2, "nowOrdItemStatCd");
            return (Criteria) this;
        }

        public Criteria andNowOrdItemStatCdNotBetween(String value1, String value2) {
            addCriterion("TOICH.NOW_ORD_ITEM_STAT_CD not between", value1, value2, "nowOrdItemStatCd");
            return (Criteria) this;
        }

        public Criteria andDpChIdIsNull() {
            addCriterion("TOICH.DP_CH_ID is null");
            return (Criteria) this;
        }

        public Criteria andDpChIdIsNotNull() {
            addCriterion("TOICH.DP_CH_ID is not null");
            return (Criteria) this;
        }

        public Criteria andDpChIdEqualTo(Integer value) {
            addCriterion("TOICH.DP_CH_ID =", value, "dpChId");
            return (Criteria) this;
        }

        public Criteria andDpChIdNotEqualTo(Integer value) {
            addCriterion("TOICH.DP_CH_ID <>", value, "dpChId");
            return (Criteria) this;
        }

        public Criteria andDpChIdGreaterThan(Integer value) {
            addCriterion("TOICH.DP_CH_ID >", value, "dpChId");
            return (Criteria) this;
        }

        public Criteria andDpChIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("TOICH.DP_CH_ID >=", value, "dpChId");
            return (Criteria) this;
        }

        public Criteria andDpChIdLessThan(Integer value) {
            addCriterion("TOICH.DP_CH_ID <", value, "dpChId");
            return (Criteria) this;
        }

        public Criteria andDpChIdLessThanOrEqualTo(Integer value) {
            addCriterion("TOICH.DP_CH_ID <=", value, "dpChId");
            return (Criteria) this;
        }

        public Criteria andDpChIdIn(List<Integer> values) {
            addCriterion("TOICH.DP_CH_ID in", values, "dpChId");
            return (Criteria) this;
        }

        public Criteria andDpChIdNotIn(List<Integer> values) {
            addCriterion("TOICH.DP_CH_ID not in", values, "dpChId");
            return (Criteria) this;
        }

        public Criteria andDpChIdBetween(Integer value1, Integer value2) {
            addCriterion("TOICH.DP_CH_ID between", value1, value2, "dpChId");
            return (Criteria) this;
        }

        public Criteria andDpChIdNotBetween(Integer value1, Integer value2) {
            addCriterion("TOICH.DP_CH_ID not between", value1, value2, "dpChId");
            return (Criteria) this;
        }

        public Criteria andItemIdIsNull() {
            addCriterion("TOICH.ITEM_ID is null");
            return (Criteria) this;
        }

        public Criteria andItemIdIsNotNull() {
            addCriterion("TOICH.ITEM_ID is not null");
            return (Criteria) this;
        }

        public Criteria andItemIdEqualTo(Integer value) {
            addCriterion("TOICH.ITEM_ID =", value, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdNotEqualTo(Integer value) {
            addCriterion("TOICH.ITEM_ID <>", value, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdGreaterThan(Integer value) {
            addCriterion("TOICH.ITEM_ID >", value, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("TOICH.ITEM_ID >=", value, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdLessThan(Integer value) {
            addCriterion("TOICH.ITEM_ID <", value, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdLessThanOrEqualTo(Integer value) {
            addCriterion("TOICH.ITEM_ID <=", value, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdIn(List<Integer> values) {
            addCriterion("TOICH.ITEM_ID in", values, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdNotIn(List<Integer> values) {
            addCriterion("TOICH.ITEM_ID not in", values, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdBetween(Integer value1, Integer value2) {
            addCriterion("TOICH.ITEM_ID between", value1, value2, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdNotBetween(Integer value1, Integer value2) {
            addCriterion("TOICH.ITEM_ID not between", value1, value2, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemTpCdIsNull() {
            addCriterion("TOICH.ITEM_TP_CD is null");
            return (Criteria) this;
        }

        public Criteria andItemTpCdIsNotNull() {
            addCriterion("TOICH.ITEM_TP_CD is not null");
            return (Criteria) this;
        }

        public Criteria andItemTpCdEqualTo(String value) {
            addCriterion("TOICH.ITEM_TP_CD =", value, "itemTpCd");
            return (Criteria) this;
        }

        public Criteria andItemTpCdNotEqualTo(String value) {
            addCriterion("TOICH.ITEM_TP_CD <>", value, "itemTpCd");
            return (Criteria) this;
        }

        public Criteria andItemTpCdGreaterThan(String value) {
            addCriterion("TOICH.ITEM_TP_CD >", value, "itemTpCd");
            return (Criteria) this;
        }

        public Criteria andItemTpCdGreaterThanOrEqualTo(String value) {
            addCriterion("TOICH.ITEM_TP_CD >=", value, "itemTpCd");
            return (Criteria) this;
        }

        public Criteria andItemTpCdLessThan(String value) {
            addCriterion("TOICH.ITEM_TP_CD <", value, "itemTpCd");
            return (Criteria) this;
        }

        public Criteria andItemTpCdLessThanOrEqualTo(String value) {
            addCriterion("TOICH.ITEM_TP_CD <=", value, "itemTpCd");
            return (Criteria) this;
        }

        public Criteria andItemTpCdLike(String value) {
            addCriterion("TOICH.ITEM_TP_CD like", value, "itemTpCd");
            return (Criteria) this;
        }

        public Criteria andItemTpCdNotLike(String value) {
            addCriterion("TOICH.ITEM_TP_CD not like", value, "itemTpCd");
            return (Criteria) this;
        }

        public Criteria andItemTpCdIn(List<String> values) {
            addCriterion("TOICH.ITEM_TP_CD in", values, "itemTpCd");
            return (Criteria) this;
        }

        public Criteria andItemTpCdNotIn(List<String> values) {
            addCriterion("TOICH.ITEM_TP_CD not in", values, "itemTpCd");
            return (Criteria) this;
        }

        public Criteria andItemTpCdBetween(String value1, String value2) {
            addCriterion("TOICH.ITEM_TP_CD between", value1, value2, "itemTpCd");
            return (Criteria) this;
        }

        public Criteria andItemTpCdNotBetween(String value1, String value2) {
            addCriterion("TOICH.ITEM_TP_CD not between", value1, value2, "itemTpCd");
            return (Criteria) this;
        }

        public Criteria andItemCdIsNull() {
            addCriterion("TOICH.ITEM_CD is null");
            return (Criteria) this;
        }

        public Criteria andItemCdIsNotNull() {
            addCriterion("TOICH.ITEM_CD is not null");
            return (Criteria) this;
        }

        public Criteria andItemCdEqualTo(String value) {
            addCriterion("TOICH.ITEM_CD =", value, "itemCd");
            return (Criteria) this;
        }

        public Criteria andItemCdNotEqualTo(String value) {
            addCriterion("TOICH.ITEM_CD <>", value, "itemCd");
            return (Criteria) this;
        }

        public Criteria andItemCdGreaterThan(String value) {
            addCriterion("TOICH.ITEM_CD >", value, "itemCd");
            return (Criteria) this;
        }

        public Criteria andItemCdGreaterThanOrEqualTo(String value) {
            addCriterion("TOICH.ITEM_CD >=", value, "itemCd");
            return (Criteria) this;
        }

        public Criteria andItemCdLessThan(String value) {
            addCriterion("TOICH.ITEM_CD <", value, "itemCd");
            return (Criteria) this;
        }

        public Criteria andItemCdLessThanOrEqualTo(String value) {
            addCriterion("TOICH.ITEM_CD <=", value, "itemCd");
            return (Criteria) this;
        }

        public Criteria andItemCdLike(String value) {
            addCriterion("TOICH.ITEM_CD like", value, "itemCd");
            return (Criteria) this;
        }

        public Criteria andItemCdNotLike(String value) {
            addCriterion("TOICH.ITEM_CD not like", value, "itemCd");
            return (Criteria) this;
        }

        public Criteria andItemCdIn(List<String> values) {
            addCriterion("TOICH.ITEM_CD in", values, "itemCd");
            return (Criteria) this;
        }

        public Criteria andItemCdNotIn(List<String> values) {
            addCriterion("TOICH.ITEM_CD not in", values, "itemCd");
            return (Criteria) this;
        }

        public Criteria andItemCdBetween(String value1, String value2) {
            addCriterion("TOICH.ITEM_CD between", value1, value2, "itemCd");
            return (Criteria) this;
        }

        public Criteria andItemCdNotBetween(String value1, String value2) {
            addCriterion("TOICH.ITEM_CD not between", value1, value2, "itemCd");
            return (Criteria) this;
        }

        public Criteria andSsgCdIsNull() {
            addCriterion("TOICH.SSG_CD is null");
            return (Criteria) this;
        }

        public Criteria andSsgCdIsNotNull() {
            addCriterion("TOICH.SSG_CD is not null");
            return (Criteria) this;
        }

        public Criteria andSsgCdEqualTo(String value) {
            addCriterion("TOICH.SSG_CD =", value, "ssgCd");
            return (Criteria) this;
        }

        public Criteria andSsgCdNotEqualTo(String value) {
            addCriterion("TOICH.SSG_CD <>", value, "ssgCd");
            return (Criteria) this;
        }

        public Criteria andSsgCdGreaterThan(String value) {
            addCriterion("TOICH.SSG_CD >", value, "ssgCd");
            return (Criteria) this;
        }

        public Criteria andSsgCdGreaterThanOrEqualTo(String value) {
            addCriterion("TOICH.SSG_CD >=", value, "ssgCd");
            return (Criteria) this;
        }

        public Criteria andSsgCdLessThan(String value) {
            addCriterion("TOICH.SSG_CD <", value, "ssgCd");
            return (Criteria) this;
        }

        public Criteria andSsgCdLessThanOrEqualTo(String value) {
            addCriterion("TOICH.SSG_CD <=", value, "ssgCd");
            return (Criteria) this;
        }

        public Criteria andSsgCdLike(String value) {
            addCriterion("TOICH.SSG_CD like", value, "ssgCd");
            return (Criteria) this;
        }

        public Criteria andSsgCdNotLike(String value) {
            addCriterion("TOICH.SSG_CD not like", value, "ssgCd");
            return (Criteria) this;
        }

        public Criteria andSsgCdIn(List<String> values) {
            addCriterion("TOICH.SSG_CD in", values, "ssgCd");
            return (Criteria) this;
        }

        public Criteria andSsgCdNotIn(List<String> values) {
            addCriterion("TOICH.SSG_CD not in", values, "ssgCd");
            return (Criteria) this;
        }

        public Criteria andSsgCdBetween(String value1, String value2) {
            addCriterion("TOICH.SSG_CD between", value1, value2, "ssgCd");
            return (Criteria) this;
        }

        public Criteria andSsgCdNotBetween(String value1, String value2) {
            addCriterion("TOICH.SSG_CD not between", value1, value2, "ssgCd");
            return (Criteria) this;
        }

        public Criteria andItemNmIsNull() {
            addCriterion("TOICH.ITEM_NM is null");
            return (Criteria) this;
        }

        public Criteria andItemNmIsNotNull() {
            addCriterion("TOICH.ITEM_NM is not null");
            return (Criteria) this;
        }

        public Criteria andItemNmEqualTo(String value) {
            addCriterion("TOICH.ITEM_NM =", value, "itemNm");
            return (Criteria) this;
        }

        public Criteria andItemNmNotEqualTo(String value) {
            addCriterion("TOICH.ITEM_NM <>", value, "itemNm");
            return (Criteria) this;
        }

        public Criteria andItemNmGreaterThan(String value) {
            addCriterion("TOICH.ITEM_NM >", value, "itemNm");
            return (Criteria) this;
        }

        public Criteria andItemNmGreaterThanOrEqualTo(String value) {
            addCriterion("TOICH.ITEM_NM >=", value, "itemNm");
            return (Criteria) this;
        }

        public Criteria andItemNmLessThan(String value) {
            addCriterion("TOICH.ITEM_NM <", value, "itemNm");
            return (Criteria) this;
        }

        public Criteria andItemNmLessThanOrEqualTo(String value) {
            addCriterion("TOICH.ITEM_NM <=", value, "itemNm");
            return (Criteria) this;
        }

        public Criteria andItemNmLike(String value) {
            addCriterion("TOICH.ITEM_NM like", value, "itemNm");
            return (Criteria) this;
        }

        public Criteria andItemNmNotLike(String value) {
            addCriterion("TOICH.ITEM_NM not like", value, "itemNm");
            return (Criteria) this;
        }

        public Criteria andItemNmIn(List<String> values) {
            addCriterion("TOICH.ITEM_NM in", values, "itemNm");
            return (Criteria) this;
        }

        public Criteria andItemNmNotIn(List<String> values) {
            addCriterion("TOICH.ITEM_NM not in", values, "itemNm");
            return (Criteria) this;
        }

        public Criteria andItemNmBetween(String value1, String value2) {
            addCriterion("TOICH.ITEM_NM between", value1, value2, "itemNm");
            return (Criteria) this;
        }

        public Criteria andItemNmNotBetween(String value1, String value2) {
            addCriterion("TOICH.ITEM_NM not between", value1, value2, "itemNm");
            return (Criteria) this;
        }

        public Criteria andItemOptIdIsNull() {
            addCriterion("TOICH.ITEM_OPT_ID is null");
            return (Criteria) this;
        }

        public Criteria andItemOptIdIsNotNull() {
            addCriterion("TOICH.ITEM_OPT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andItemOptIdEqualTo(Integer value) {
            addCriterion("TOICH.ITEM_OPT_ID =", value, "itemOptId");
            return (Criteria) this;
        }

        public Criteria andItemOptIdNotEqualTo(Integer value) {
            addCriterion("TOICH.ITEM_OPT_ID <>", value, "itemOptId");
            return (Criteria) this;
        }

        public Criteria andItemOptIdGreaterThan(Integer value) {
            addCriterion("TOICH.ITEM_OPT_ID >", value, "itemOptId");
            return (Criteria) this;
        }

        public Criteria andItemOptIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("TOICH.ITEM_OPT_ID >=", value, "itemOptId");
            return (Criteria) this;
        }

        public Criteria andItemOptIdLessThan(Integer value) {
            addCriterion("TOICH.ITEM_OPT_ID <", value, "itemOptId");
            return (Criteria) this;
        }

        public Criteria andItemOptIdLessThanOrEqualTo(Integer value) {
            addCriterion("TOICH.ITEM_OPT_ID <=", value, "itemOptId");
            return (Criteria) this;
        }

        public Criteria andItemOptIdIn(List<Integer> values) {
            addCriterion("TOICH.ITEM_OPT_ID in", values, "itemOptId");
            return (Criteria) this;
        }

        public Criteria andItemOptIdNotIn(List<Integer> values) {
            addCriterion("TOICH.ITEM_OPT_ID not in", values, "itemOptId");
            return (Criteria) this;
        }

        public Criteria andItemOptIdBetween(Integer value1, Integer value2) {
            addCriterion("TOICH.ITEM_OPT_ID between", value1, value2, "itemOptId");
            return (Criteria) this;
        }

        public Criteria andItemOptIdNotBetween(Integer value1, Integer value2) {
            addCriterion("TOICH.ITEM_OPT_ID not between", value1, value2, "itemOptId");
            return (Criteria) this;
        }

        public Criteria andItemOptNmIsNull() {
            addCriterion("TOICH.ITEM_OPT_NM is null");
            return (Criteria) this;
        }

        public Criteria andItemOptNmIsNotNull() {
            addCriterion("TOICH.ITEM_OPT_NM is not null");
            return (Criteria) this;
        }

        public Criteria andItemOptNmEqualTo(String value) {
            addCriterion("TOICH.ITEM_OPT_NM =", value, "itemOptNm");
            return (Criteria) this;
        }

        public Criteria andItemOptNmNotEqualTo(String value) {
            addCriterion("TOICH.ITEM_OPT_NM <>", value, "itemOptNm");
            return (Criteria) this;
        }

        public Criteria andItemOptNmGreaterThan(String value) {
            addCriterion("TOICH.ITEM_OPT_NM >", value, "itemOptNm");
            return (Criteria) this;
        }

        public Criteria andItemOptNmGreaterThanOrEqualTo(String value) {
            addCriterion("TOICH.ITEM_OPT_NM >=", value, "itemOptNm");
            return (Criteria) this;
        }

        public Criteria andItemOptNmLessThan(String value) {
            addCriterion("TOICH.ITEM_OPT_NM <", value, "itemOptNm");
            return (Criteria) this;
        }

        public Criteria andItemOptNmLessThanOrEqualTo(String value) {
            addCriterion("TOICH.ITEM_OPT_NM <=", value, "itemOptNm");
            return (Criteria) this;
        }

        public Criteria andItemOptNmLike(String value) {
            addCriterion("TOICH.ITEM_OPT_NM like", value, "itemOptNm");
            return (Criteria) this;
        }

        public Criteria andItemOptNmNotLike(String value) {
            addCriterion("TOICH.ITEM_OPT_NM not like", value, "itemOptNm");
            return (Criteria) this;
        }

        public Criteria andItemOptNmIn(List<String> values) {
            addCriterion("TOICH.ITEM_OPT_NM in", values, "itemOptNm");
            return (Criteria) this;
        }

        public Criteria andItemOptNmNotIn(List<String> values) {
            addCriterion("TOICH.ITEM_OPT_NM not in", values, "itemOptNm");
            return (Criteria) this;
        }

        public Criteria andItemOptNmBetween(String value1, String value2) {
            addCriterion("TOICH.ITEM_OPT_NM between", value1, value2, "itemOptNm");
            return (Criteria) this;
        }

        public Criteria andItemOptNmNotBetween(String value1, String value2) {
            addCriterion("TOICH.ITEM_OPT_NM not between", value1, value2, "itemOptNm");
            return (Criteria) this;
        }

        public Criteria andItemSetIdIsNull() {
            addCriterion("TOICH.ITEM_SET_ID is null");
            return (Criteria) this;
        }

        public Criteria andItemSetIdIsNotNull() {
            addCriterion("TOICH.ITEM_SET_ID is not null");
            return (Criteria) this;
        }

        public Criteria andItemSetIdEqualTo(Integer value) {
            addCriterion("TOICH.ITEM_SET_ID =", value, "itemSetId");
            return (Criteria) this;
        }

        public Criteria andItemSetIdNotEqualTo(Integer value) {
            addCriterion("TOICH.ITEM_SET_ID <>", value, "itemSetId");
            return (Criteria) this;
        }

        public Criteria andItemSetIdGreaterThan(Integer value) {
            addCriterion("TOICH.ITEM_SET_ID >", value, "itemSetId");
            return (Criteria) this;
        }

        public Criteria andItemSetIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("TOICH.ITEM_SET_ID >=", value, "itemSetId");
            return (Criteria) this;
        }

        public Criteria andItemSetIdLessThan(Integer value) {
            addCriterion("TOICH.ITEM_SET_ID <", value, "itemSetId");
            return (Criteria) this;
        }

        public Criteria andItemSetIdLessThanOrEqualTo(Integer value) {
            addCriterion("TOICH.ITEM_SET_ID <=", value, "itemSetId");
            return (Criteria) this;
        }

        public Criteria andItemSetIdIn(List<Integer> values) {
            addCriterion("TOICH.ITEM_SET_ID in", values, "itemSetId");
            return (Criteria) this;
        }

        public Criteria andItemSetIdNotIn(List<Integer> values) {
            addCriterion("TOICH.ITEM_SET_ID not in", values, "itemSetId");
            return (Criteria) this;
        }

        public Criteria andItemSetIdBetween(Integer value1, Integer value2) {
            addCriterion("TOICH.ITEM_SET_ID between", value1, value2, "itemSetId");
            return (Criteria) this;
        }

        public Criteria andItemSetIdNotBetween(Integer value1, Integer value2) {
            addCriterion("TOICH.ITEM_SET_ID not between", value1, value2, "itemSetId");
            return (Criteria) this;
        }

        public Criteria andSetItemIdIsNull() {
            addCriterion("TOICH.SET_ITEM_ID is null");
            return (Criteria) this;
        }

        public Criteria andSetItemIdIsNotNull() {
            addCriterion("TOICH.SET_ITEM_ID is not null");
            return (Criteria) this;
        }

        public Criteria andSetItemIdEqualTo(Integer value) {
            addCriterion("TOICH.SET_ITEM_ID =", value, "setItemId");
            return (Criteria) this;
        }

        public Criteria andSetItemIdNotEqualTo(Integer value) {
            addCriterion("TOICH.SET_ITEM_ID <>", value, "setItemId");
            return (Criteria) this;
        }

        public Criteria andSetItemIdGreaterThan(Integer value) {
            addCriterion("TOICH.SET_ITEM_ID >", value, "setItemId");
            return (Criteria) this;
        }

        public Criteria andSetItemIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("TOICH.SET_ITEM_ID >=", value, "setItemId");
            return (Criteria) this;
        }

        public Criteria andSetItemIdLessThan(Integer value) {
            addCriterion("TOICH.SET_ITEM_ID <", value, "setItemId");
            return (Criteria) this;
        }

        public Criteria andSetItemIdLessThanOrEqualTo(Integer value) {
            addCriterion("TOICH.SET_ITEM_ID <=", value, "setItemId");
            return (Criteria) this;
        }

        public Criteria andSetItemIdIn(List<Integer> values) {
            addCriterion("TOICH.SET_ITEM_ID in", values, "setItemId");
            return (Criteria) this;
        }

        public Criteria andSetItemIdNotIn(List<Integer> values) {
            addCriterion("TOICH.SET_ITEM_ID not in", values, "setItemId");
            return (Criteria) this;
        }

        public Criteria andSetItemIdBetween(Integer value1, Integer value2) {
            addCriterion("TOICH.SET_ITEM_ID between", value1, value2, "setItemId");
            return (Criteria) this;
        }

        public Criteria andSetItemIdNotBetween(Integer value1, Integer value2) {
            addCriterion("TOICH.SET_ITEM_ID not between", value1, value2, "setItemId");
            return (Criteria) this;
        }

        public Criteria andSetItemNmIsNull() {
            addCriterion("TOICH.SET_ITEM_NM is null");
            return (Criteria) this;
        }

        public Criteria andSetItemNmIsNotNull() {
            addCriterion("TOICH.SET_ITEM_NM is not null");
            return (Criteria) this;
        }

        public Criteria andSetItemNmEqualTo(String value) {
            addCriterion("TOICH.SET_ITEM_NM =", value, "setItemNm");
            return (Criteria) this;
        }

        public Criteria andSetItemNmNotEqualTo(String value) {
            addCriterion("TOICH.SET_ITEM_NM <>", value, "setItemNm");
            return (Criteria) this;
        }

        public Criteria andSetItemNmGreaterThan(String value) {
            addCriterion("TOICH.SET_ITEM_NM >", value, "setItemNm");
            return (Criteria) this;
        }

        public Criteria andSetItemNmGreaterThanOrEqualTo(String value) {
            addCriterion("TOICH.SET_ITEM_NM >=", value, "setItemNm");
            return (Criteria) this;
        }

        public Criteria andSetItemNmLessThan(String value) {
            addCriterion("TOICH.SET_ITEM_NM <", value, "setItemNm");
            return (Criteria) this;
        }

        public Criteria andSetItemNmLessThanOrEqualTo(String value) {
            addCriterion("TOICH.SET_ITEM_NM <=", value, "setItemNm");
            return (Criteria) this;
        }

        public Criteria andSetItemNmLike(String value) {
            addCriterion("TOICH.SET_ITEM_NM like", value, "setItemNm");
            return (Criteria) this;
        }

        public Criteria andSetItemNmNotLike(String value) {
            addCriterion("TOICH.SET_ITEM_NM not like", value, "setItemNm");
            return (Criteria) this;
        }

        public Criteria andSetItemNmIn(List<String> values) {
            addCriterion("TOICH.SET_ITEM_NM in", values, "setItemNm");
            return (Criteria) this;
        }

        public Criteria andSetItemNmNotIn(List<String> values) {
            addCriterion("TOICH.SET_ITEM_NM not in", values, "setItemNm");
            return (Criteria) this;
        }

        public Criteria andSetItemNmBetween(String value1, String value2) {
            addCriterion("TOICH.SET_ITEM_NM between", value1, value2, "setItemNm");
            return (Criteria) this;
        }

        public Criteria andSetItemNmNotBetween(String value1, String value2) {
            addCriterion("TOICH.SET_ITEM_NM not between", value1, value2, "setItemNm");
            return (Criteria) this;
        }

        public Criteria andItemAttrTpCdIsNull() {
            addCriterion("TOICH.ITEM_ATTR_TP_CD is null");
            return (Criteria) this;
        }

        public Criteria andItemAttrTpCdIsNotNull() {
            addCriterion("TOICH.ITEM_ATTR_TP_CD is not null");
            return (Criteria) this;
        }

        public Criteria andItemAttrTpCdEqualTo(String value) {
            addCriterion("TOICH.ITEM_ATTR_TP_CD =", value, "itemAttrTpCd");
            return (Criteria) this;
        }

        public Criteria andItemAttrTpCdNotEqualTo(String value) {
            addCriterion("TOICH.ITEM_ATTR_TP_CD <>", value, "itemAttrTpCd");
            return (Criteria) this;
        }

        public Criteria andItemAttrTpCdGreaterThan(String value) {
            addCriterion("TOICH.ITEM_ATTR_TP_CD >", value, "itemAttrTpCd");
            return (Criteria) this;
        }

        public Criteria andItemAttrTpCdGreaterThanOrEqualTo(String value) {
            addCriterion("TOICH.ITEM_ATTR_TP_CD >=", value, "itemAttrTpCd");
            return (Criteria) this;
        }

        public Criteria andItemAttrTpCdLessThan(String value) {
            addCriterion("TOICH.ITEM_ATTR_TP_CD <", value, "itemAttrTpCd");
            return (Criteria) this;
        }

        public Criteria andItemAttrTpCdLessThanOrEqualTo(String value) {
            addCriterion("TOICH.ITEM_ATTR_TP_CD <=", value, "itemAttrTpCd");
            return (Criteria) this;
        }

        public Criteria andItemAttrTpCdLike(String value) {
            addCriterion("TOICH.ITEM_ATTR_TP_CD like", value, "itemAttrTpCd");
            return (Criteria) this;
        }

        public Criteria andItemAttrTpCdNotLike(String value) {
            addCriterion("TOICH.ITEM_ATTR_TP_CD not like", value, "itemAttrTpCd");
            return (Criteria) this;
        }

        public Criteria andItemAttrTpCdIn(List<String> values) {
            addCriterion("TOICH.ITEM_ATTR_TP_CD in", values, "itemAttrTpCd");
            return (Criteria) this;
        }

        public Criteria andItemAttrTpCdNotIn(List<String> values) {
            addCriterion("TOICH.ITEM_ATTR_TP_CD not in", values, "itemAttrTpCd");
            return (Criteria) this;
        }

        public Criteria andItemAttrTpCdBetween(String value1, String value2) {
            addCriterion("TOICH.ITEM_ATTR_TP_CD between", value1, value2, "itemAttrTpCd");
            return (Criteria) this;
        }

        public Criteria andItemAttrTpCdNotBetween(String value1, String value2) {
            addCriterion("TOICH.ITEM_ATTR_TP_CD not between", value1, value2, "itemAttrTpCd");
            return (Criteria) this;
        }

        public Criteria andItemTaxClCdIsNull() {
            addCriterion("TOICH.ITEM_TAX_CL_CD is null");
            return (Criteria) this;
        }

        public Criteria andItemTaxClCdIsNotNull() {
            addCriterion("TOICH.ITEM_TAX_CL_CD is not null");
            return (Criteria) this;
        }

        public Criteria andItemTaxClCdEqualTo(String value) {
            addCriterion("TOICH.ITEM_TAX_CL_CD =", value, "itemTaxClCd");
            return (Criteria) this;
        }

        public Criteria andItemTaxClCdNotEqualTo(String value) {
            addCriterion("TOICH.ITEM_TAX_CL_CD <>", value, "itemTaxClCd");
            return (Criteria) this;
        }

        public Criteria andItemTaxClCdGreaterThan(String value) {
            addCriterion("TOICH.ITEM_TAX_CL_CD >", value, "itemTaxClCd");
            return (Criteria) this;
        }

        public Criteria andItemTaxClCdGreaterThanOrEqualTo(String value) {
            addCriterion("TOICH.ITEM_TAX_CL_CD >=", value, "itemTaxClCd");
            return (Criteria) this;
        }

        public Criteria andItemTaxClCdLessThan(String value) {
            addCriterion("TOICH.ITEM_TAX_CL_CD <", value, "itemTaxClCd");
            return (Criteria) this;
        }

        public Criteria andItemTaxClCdLessThanOrEqualTo(String value) {
            addCriterion("TOICH.ITEM_TAX_CL_CD <=", value, "itemTaxClCd");
            return (Criteria) this;
        }

        public Criteria andItemTaxClCdLike(String value) {
            addCriterion("TOICH.ITEM_TAX_CL_CD like", value, "itemTaxClCd");
            return (Criteria) this;
        }

        public Criteria andItemTaxClCdNotLike(String value) {
            addCriterion("TOICH.ITEM_TAX_CL_CD not like", value, "itemTaxClCd");
            return (Criteria) this;
        }

        public Criteria andItemTaxClCdIn(List<String> values) {
            addCriterion("TOICH.ITEM_TAX_CL_CD in", values, "itemTaxClCd");
            return (Criteria) this;
        }

        public Criteria andItemTaxClCdNotIn(List<String> values) {
            addCriterion("TOICH.ITEM_TAX_CL_CD not in", values, "itemTaxClCd");
            return (Criteria) this;
        }

        public Criteria andItemTaxClCdBetween(String value1, String value2) {
            addCriterion("TOICH.ITEM_TAX_CL_CD between", value1, value2, "itemTaxClCd");
            return (Criteria) this;
        }

        public Criteria andItemTaxClCdNotBetween(String value1, String value2) {
            addCriterion("TOICH.ITEM_TAX_CL_CD not between", value1, value2, "itemTaxClCd");
            return (Criteria) this;
        }

        public Criteria andItemCpnUsePsblYnIsNull() {
            addCriterion("TOICH.ITEM_CPN_USE_PSBL_YN is null");
            return (Criteria) this;
        }

        public Criteria andItemCpnUsePsblYnIsNotNull() {
            addCriterion("TOICH.ITEM_CPN_USE_PSBL_YN is not null");
            return (Criteria) this;
        }

        public Criteria andItemCpnUsePsblYnEqualTo(String value) {
            addCriterion("TOICH.ITEM_CPN_USE_PSBL_YN =", value, "itemCpnUsePsblYn");
            return (Criteria) this;
        }

        public Criteria andItemCpnUsePsblYnNotEqualTo(String value) {
            addCriterion("TOICH.ITEM_CPN_USE_PSBL_YN <>", value, "itemCpnUsePsblYn");
            return (Criteria) this;
        }

        public Criteria andItemCpnUsePsblYnGreaterThan(String value) {
            addCriterion("TOICH.ITEM_CPN_USE_PSBL_YN >", value, "itemCpnUsePsblYn");
            return (Criteria) this;
        }

        public Criteria andItemCpnUsePsblYnGreaterThanOrEqualTo(String value) {
            addCriterion("TOICH.ITEM_CPN_USE_PSBL_YN >=", value, "itemCpnUsePsblYn");
            return (Criteria) this;
        }

        public Criteria andItemCpnUsePsblYnLessThan(String value) {
            addCriterion("TOICH.ITEM_CPN_USE_PSBL_YN <", value, "itemCpnUsePsblYn");
            return (Criteria) this;
        }

        public Criteria andItemCpnUsePsblYnLessThanOrEqualTo(String value) {
            addCriterion("TOICH.ITEM_CPN_USE_PSBL_YN <=", value, "itemCpnUsePsblYn");
            return (Criteria) this;
        }

        public Criteria andItemCpnUsePsblYnLike(String value) {
            addCriterion("TOICH.ITEM_CPN_USE_PSBL_YN like", value, "itemCpnUsePsblYn");
            return (Criteria) this;
        }

        public Criteria andItemCpnUsePsblYnNotLike(String value) {
            addCriterion("TOICH.ITEM_CPN_USE_PSBL_YN not like", value, "itemCpnUsePsblYn");
            return (Criteria) this;
        }

        public Criteria andItemCpnUsePsblYnIn(List<String> values) {
            addCriterion("TOICH.ITEM_CPN_USE_PSBL_YN in", values, "itemCpnUsePsblYn");
            return (Criteria) this;
        }

        public Criteria andItemCpnUsePsblYnNotIn(List<String> values) {
            addCriterion("TOICH.ITEM_CPN_USE_PSBL_YN not in", values, "itemCpnUsePsblYn");
            return (Criteria) this;
        }

        public Criteria andItemCpnUsePsblYnBetween(String value1, String value2) {
            addCriterion("TOICH.ITEM_CPN_USE_PSBL_YN between", value1, value2, "itemCpnUsePsblYn");
            return (Criteria) this;
        }

        public Criteria andItemCpnUsePsblYnNotBetween(String value1, String value2) {
            addCriterion("TOICH.ITEM_CPN_USE_PSBL_YN not between", value1, value2, "itemCpnUsePsblYn");
            return (Criteria) this;
        }

        public Criteria andItemPtSaveTpCdIsNull() {
            addCriterion("TOICH.ITEM_PT_SAVE_TP_CD is null");
            return (Criteria) this;
        }

        public Criteria andItemPtSaveTpCdIsNotNull() {
            addCriterion("TOICH.ITEM_PT_SAVE_TP_CD is not null");
            return (Criteria) this;
        }

        public Criteria andItemPtSaveTpCdEqualTo(String value) {
            addCriterion("TOICH.ITEM_PT_SAVE_TP_CD =", value, "itemPtSaveTpCd");
            return (Criteria) this;
        }

        public Criteria andItemPtSaveTpCdNotEqualTo(String value) {
            addCriterion("TOICH.ITEM_PT_SAVE_TP_CD <>", value, "itemPtSaveTpCd");
            return (Criteria) this;
        }

        public Criteria andItemPtSaveTpCdGreaterThan(String value) {
            addCriterion("TOICH.ITEM_PT_SAVE_TP_CD >", value, "itemPtSaveTpCd");
            return (Criteria) this;
        }

        public Criteria andItemPtSaveTpCdGreaterThanOrEqualTo(String value) {
            addCriterion("TOICH.ITEM_PT_SAVE_TP_CD >=", value, "itemPtSaveTpCd");
            return (Criteria) this;
        }

        public Criteria andItemPtSaveTpCdLessThan(String value) {
            addCriterion("TOICH.ITEM_PT_SAVE_TP_CD <", value, "itemPtSaveTpCd");
            return (Criteria) this;
        }

        public Criteria andItemPtSaveTpCdLessThanOrEqualTo(String value) {
            addCriterion("TOICH.ITEM_PT_SAVE_TP_CD <=", value, "itemPtSaveTpCd");
            return (Criteria) this;
        }

        public Criteria andItemPtSaveTpCdLike(String value) {
            addCriterion("TOICH.ITEM_PT_SAVE_TP_CD like", value, "itemPtSaveTpCd");
            return (Criteria) this;
        }

        public Criteria andItemPtSaveTpCdNotLike(String value) {
            addCriterion("TOICH.ITEM_PT_SAVE_TP_CD not like", value, "itemPtSaveTpCd");
            return (Criteria) this;
        }

        public Criteria andItemPtSaveTpCdIn(List<String> values) {
            addCriterion("TOICH.ITEM_PT_SAVE_TP_CD in", values, "itemPtSaveTpCd");
            return (Criteria) this;
        }

        public Criteria andItemPtSaveTpCdNotIn(List<String> values) {
            addCriterion("TOICH.ITEM_PT_SAVE_TP_CD not in", values, "itemPtSaveTpCd");
            return (Criteria) this;
        }

        public Criteria andItemPtSaveTpCdBetween(String value1, String value2) {
            addCriterion("TOICH.ITEM_PT_SAVE_TP_CD between", value1, value2, "itemPtSaveTpCd");
            return (Criteria) this;
        }

        public Criteria andItemPtSaveTpCdNotBetween(String value1, String value2) {
            addCriterion("TOICH.ITEM_PT_SAVE_TP_CD not between", value1, value2, "itemPtSaveTpCd");
            return (Criteria) this;
        }

        public Criteria andItemPtSaveMethCdIsNull() {
            addCriterion("TOICH.ITEM_PT_SAVE_METH_CD is null");
            return (Criteria) this;
        }

        public Criteria andItemPtSaveMethCdIsNotNull() {
            addCriterion("TOICH.ITEM_PT_SAVE_METH_CD is not null");
            return (Criteria) this;
        }

        public Criteria andItemPtSaveMethCdEqualTo(String value) {
            addCriterion("TOICH.ITEM_PT_SAVE_METH_CD =", value, "itemPtSaveMethCd");
            return (Criteria) this;
        }

        public Criteria andItemPtSaveMethCdNotEqualTo(String value) {
            addCriterion("TOICH.ITEM_PT_SAVE_METH_CD <>", value, "itemPtSaveMethCd");
            return (Criteria) this;
        }

        public Criteria andItemPtSaveMethCdGreaterThan(String value) {
            addCriterion("TOICH.ITEM_PT_SAVE_METH_CD >", value, "itemPtSaveMethCd");
            return (Criteria) this;
        }

        public Criteria andItemPtSaveMethCdGreaterThanOrEqualTo(String value) {
            addCriterion("TOICH.ITEM_PT_SAVE_METH_CD >=", value, "itemPtSaveMethCd");
            return (Criteria) this;
        }

        public Criteria andItemPtSaveMethCdLessThan(String value) {
            addCriterion("TOICH.ITEM_PT_SAVE_METH_CD <", value, "itemPtSaveMethCd");
            return (Criteria) this;
        }

        public Criteria andItemPtSaveMethCdLessThanOrEqualTo(String value) {
            addCriterion("TOICH.ITEM_PT_SAVE_METH_CD <=", value, "itemPtSaveMethCd");
            return (Criteria) this;
        }

        public Criteria andItemPtSaveMethCdLike(String value) {
            addCriterion("TOICH.ITEM_PT_SAVE_METH_CD like", value, "itemPtSaveMethCd");
            return (Criteria) this;
        }

        public Criteria andItemPtSaveMethCdNotLike(String value) {
            addCriterion("TOICH.ITEM_PT_SAVE_METH_CD not like", value, "itemPtSaveMethCd");
            return (Criteria) this;
        }

        public Criteria andItemPtSaveMethCdIn(List<String> values) {
            addCriterion("TOICH.ITEM_PT_SAVE_METH_CD in", values, "itemPtSaveMethCd");
            return (Criteria) this;
        }

        public Criteria andItemPtSaveMethCdNotIn(List<String> values) {
            addCriterion("TOICH.ITEM_PT_SAVE_METH_CD not in", values, "itemPtSaveMethCd");
            return (Criteria) this;
        }

        public Criteria andItemPtSaveMethCdBetween(String value1, String value2) {
            addCriterion("TOICH.ITEM_PT_SAVE_METH_CD between", value1, value2, "itemPtSaveMethCd");
            return (Criteria) this;
        }

        public Criteria andItemPtSaveMethCdNotBetween(String value1, String value2) {
            addCriterion("TOICH.ITEM_PT_SAVE_METH_CD not between", value1, value2, "itemPtSaveMethCd");
            return (Criteria) this;
        }

        public Criteria andItemPtSaveRateIsNull() {
            addCriterion("TOICH.ITEM_PT_SAVE_RATE is null");
            return (Criteria) this;
        }

        public Criteria andItemPtSaveRateIsNotNull() {
            addCriterion("TOICH.ITEM_PT_SAVE_RATE is not null");
            return (Criteria) this;
        }

        public Criteria andItemPtSaveRateEqualTo(BigDecimal value) {
            addCriterion("TOICH.ITEM_PT_SAVE_RATE =", value, "itemPtSaveRate");
            return (Criteria) this;
        }

        public Criteria andItemPtSaveRateNotEqualTo(BigDecimal value) {
            addCriterion("TOICH.ITEM_PT_SAVE_RATE <>", value, "itemPtSaveRate");
            return (Criteria) this;
        }

        public Criteria andItemPtSaveRateGreaterThan(BigDecimal value) {
            addCriterion("TOICH.ITEM_PT_SAVE_RATE >", value, "itemPtSaveRate");
            return (Criteria) this;
        }

        public Criteria andItemPtSaveRateGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("TOICH.ITEM_PT_SAVE_RATE >=", value, "itemPtSaveRate");
            return (Criteria) this;
        }

        public Criteria andItemPtSaveRateLessThan(BigDecimal value) {
            addCriterion("TOICH.ITEM_PT_SAVE_RATE <", value, "itemPtSaveRate");
            return (Criteria) this;
        }

        public Criteria andItemPtSaveRateLessThanOrEqualTo(BigDecimal value) {
            addCriterion("TOICH.ITEM_PT_SAVE_RATE <=", value, "itemPtSaveRate");
            return (Criteria) this;
        }

        public Criteria andItemPtSaveRateIn(List<BigDecimal> values) {
            addCriterion("TOICH.ITEM_PT_SAVE_RATE in", values, "itemPtSaveRate");
            return (Criteria) this;
        }

        public Criteria andItemPtSaveRateNotIn(List<BigDecimal> values) {
            addCriterion("TOICH.ITEM_PT_SAVE_RATE not in", values, "itemPtSaveRate");
            return (Criteria) this;
        }

        public Criteria andItemPtSaveRateBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TOICH.ITEM_PT_SAVE_RATE between", value1, value2, "itemPtSaveRate");
            return (Criteria) this;
        }

        public Criteria andItemPtSaveRateNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TOICH.ITEM_PT_SAVE_RATE not between", value1, value2, "itemPtSaveRate");
            return (Criteria) this;
        }

        public Criteria andItemPtSaveAmtIsNull() {
            addCriterion("TOICH.ITEM_PT_SAVE_AMT is null");
            return (Criteria) this;
        }

        public Criteria andItemPtSaveAmtIsNotNull() {
            addCriterion("TOICH.ITEM_PT_SAVE_AMT is not null");
            return (Criteria) this;
        }

        public Criteria andItemPtSaveAmtEqualTo(Integer value) {
            addCriterion("TOICH.ITEM_PT_SAVE_AMT =", value, "itemPtSaveAmt");
            return (Criteria) this;
        }

        public Criteria andItemPtSaveAmtNotEqualTo(Integer value) {
            addCriterion("TOICH.ITEM_PT_SAVE_AMT <>", value, "itemPtSaveAmt");
            return (Criteria) this;
        }

        public Criteria andItemPtSaveAmtGreaterThan(Integer value) {
            addCriterion("TOICH.ITEM_PT_SAVE_AMT >", value, "itemPtSaveAmt");
            return (Criteria) this;
        }

        public Criteria andItemPtSaveAmtGreaterThanOrEqualTo(Integer value) {
            addCriterion("TOICH.ITEM_PT_SAVE_AMT >=", value, "itemPtSaveAmt");
            return (Criteria) this;
        }

        public Criteria andItemPtSaveAmtLessThan(Integer value) {
            addCriterion("TOICH.ITEM_PT_SAVE_AMT <", value, "itemPtSaveAmt");
            return (Criteria) this;
        }

        public Criteria andItemPtSaveAmtLessThanOrEqualTo(Integer value) {
            addCriterion("TOICH.ITEM_PT_SAVE_AMT <=", value, "itemPtSaveAmt");
            return (Criteria) this;
        }

        public Criteria andItemPtSaveAmtIn(List<Integer> values) {
            addCriterion("TOICH.ITEM_PT_SAVE_AMT in", values, "itemPtSaveAmt");
            return (Criteria) this;
        }

        public Criteria andItemPtSaveAmtNotIn(List<Integer> values) {
            addCriterion("TOICH.ITEM_PT_SAVE_AMT not in", values, "itemPtSaveAmt");
            return (Criteria) this;
        }

        public Criteria andItemPtSaveAmtBetween(Integer value1, Integer value2) {
            addCriterion("TOICH.ITEM_PT_SAVE_AMT between", value1, value2, "itemPtSaveAmt");
            return (Criteria) this;
        }

        public Criteria andItemPtSaveAmtNotBetween(Integer value1, Integer value2) {
            addCriterion("TOICH.ITEM_PT_SAVE_AMT not between", value1, value2, "itemPtSaveAmt");
            return (Criteria) this;
        }

        public Criteria andItemOrdResMaxQtyIsNull() {
            addCriterion("TOICH.ITEM_ORD_RES_MAX_QTY is null");
            return (Criteria) this;
        }

        public Criteria andItemOrdResMaxQtyIsNotNull() {
            addCriterion("TOICH.ITEM_ORD_RES_MAX_QTY is not null");
            return (Criteria) this;
        }

        public Criteria andItemOrdResMaxQtyEqualTo(Integer value) {
            addCriterion("TOICH.ITEM_ORD_RES_MAX_QTY =", value, "itemOrdResMaxQty");
            return (Criteria) this;
        }

        public Criteria andItemOrdResMaxQtyNotEqualTo(Integer value) {
            addCriterion("TOICH.ITEM_ORD_RES_MAX_QTY <>", value, "itemOrdResMaxQty");
            return (Criteria) this;
        }

        public Criteria andItemOrdResMaxQtyGreaterThan(Integer value) {
            addCriterion("TOICH.ITEM_ORD_RES_MAX_QTY >", value, "itemOrdResMaxQty");
            return (Criteria) this;
        }

        public Criteria andItemOrdResMaxQtyGreaterThanOrEqualTo(Integer value) {
            addCriterion("TOICH.ITEM_ORD_RES_MAX_QTY >=", value, "itemOrdResMaxQty");
            return (Criteria) this;
        }

        public Criteria andItemOrdResMaxQtyLessThan(Integer value) {
            addCriterion("TOICH.ITEM_ORD_RES_MAX_QTY <", value, "itemOrdResMaxQty");
            return (Criteria) this;
        }

        public Criteria andItemOrdResMaxQtyLessThanOrEqualTo(Integer value) {
            addCriterion("TOICH.ITEM_ORD_RES_MAX_QTY <=", value, "itemOrdResMaxQty");
            return (Criteria) this;
        }

        public Criteria andItemOrdResMaxQtyIn(List<Integer> values) {
            addCriterion("TOICH.ITEM_ORD_RES_MAX_QTY in", values, "itemOrdResMaxQty");
            return (Criteria) this;
        }

        public Criteria andItemOrdResMaxQtyNotIn(List<Integer> values) {
            addCriterion("TOICH.ITEM_ORD_RES_MAX_QTY not in", values, "itemOrdResMaxQty");
            return (Criteria) this;
        }

        public Criteria andItemOrdResMaxQtyBetween(Integer value1, Integer value2) {
            addCriterion("TOICH.ITEM_ORD_RES_MAX_QTY between", value1, value2, "itemOrdResMaxQty");
            return (Criteria) this;
        }

        public Criteria andItemOrdResMaxQtyNotBetween(Integer value1, Integer value2) {
            addCriterion("TOICH.ITEM_ORD_RES_MAX_QTY not between", value1, value2, "itemOrdResMaxQty");
            return (Criteria) this;
        }

        public Criteria andItemCstmdYnIsNull() {
            addCriterion("TOICH.ITEM_CSTMD_YN is null");
            return (Criteria) this;
        }

        public Criteria andItemCstmdYnIsNotNull() {
            addCriterion("TOICH.ITEM_CSTMD_YN is not null");
            return (Criteria) this;
        }

        public Criteria andItemCstmdYnEqualTo(String value) {
            addCriterion("TOICH.ITEM_CSTMD_YN =", value, "itemCstmdYn");
            return (Criteria) this;
        }

        public Criteria andItemCstmdYnNotEqualTo(String value) {
            addCriterion("TOICH.ITEM_CSTMD_YN <>", value, "itemCstmdYn");
            return (Criteria) this;
        }

        public Criteria andItemCstmdYnGreaterThan(String value) {
            addCriterion("TOICH.ITEM_CSTMD_YN >", value, "itemCstmdYn");
            return (Criteria) this;
        }

        public Criteria andItemCstmdYnGreaterThanOrEqualTo(String value) {
            addCriterion("TOICH.ITEM_CSTMD_YN >=", value, "itemCstmdYn");
            return (Criteria) this;
        }

        public Criteria andItemCstmdYnLessThan(String value) {
            addCriterion("TOICH.ITEM_CSTMD_YN <", value, "itemCstmdYn");
            return (Criteria) this;
        }

        public Criteria andItemCstmdYnLessThanOrEqualTo(String value) {
            addCriterion("TOICH.ITEM_CSTMD_YN <=", value, "itemCstmdYn");
            return (Criteria) this;
        }

        public Criteria andItemCstmdYnLike(String value) {
            addCriterion("TOICH.ITEM_CSTMD_YN like", value, "itemCstmdYn");
            return (Criteria) this;
        }

        public Criteria andItemCstmdYnNotLike(String value) {
            addCriterion("TOICH.ITEM_CSTMD_YN not like", value, "itemCstmdYn");
            return (Criteria) this;
        }

        public Criteria andItemCstmdYnIn(List<String> values) {
            addCriterion("TOICH.ITEM_CSTMD_YN in", values, "itemCstmdYn");
            return (Criteria) this;
        }

        public Criteria andItemCstmdYnNotIn(List<String> values) {
            addCriterion("TOICH.ITEM_CSTMD_YN not in", values, "itemCstmdYn");
            return (Criteria) this;
        }

        public Criteria andItemCstmdYnBetween(String value1, String value2) {
            addCriterion("TOICH.ITEM_CSTMD_YN between", value1, value2, "itemCstmdYn");
            return (Criteria) this;
        }

        public Criteria andItemCstmdYnNotBetween(String value1, String value2) {
            addCriterion("TOICH.ITEM_CSTMD_YN not between", value1, value2, "itemCstmdYn");
            return (Criteria) this;
        }

        public Criteria andItemRgurPrcIsNull() {
            addCriterion("TOICH.ITEM_RGUR_PRC is null");
            return (Criteria) this;
        }

        public Criteria andItemRgurPrcIsNotNull() {
            addCriterion("TOICH.ITEM_RGUR_PRC is not null");
            return (Criteria) this;
        }

        public Criteria andItemRgurPrcEqualTo(Integer value) {
            addCriterion("TOICH.ITEM_RGUR_PRC =", value, "itemRgurPrc");
            return (Criteria) this;
        }

        public Criteria andItemRgurPrcNotEqualTo(Integer value) {
            addCriterion("TOICH.ITEM_RGUR_PRC <>", value, "itemRgurPrc");
            return (Criteria) this;
        }

        public Criteria andItemRgurPrcGreaterThan(Integer value) {
            addCriterion("TOICH.ITEM_RGUR_PRC >", value, "itemRgurPrc");
            return (Criteria) this;
        }

        public Criteria andItemRgurPrcGreaterThanOrEqualTo(Integer value) {
            addCriterion("TOICH.ITEM_RGUR_PRC >=", value, "itemRgurPrc");
            return (Criteria) this;
        }

        public Criteria andItemRgurPrcLessThan(Integer value) {
            addCriterion("TOICH.ITEM_RGUR_PRC <", value, "itemRgurPrc");
            return (Criteria) this;
        }

        public Criteria andItemRgurPrcLessThanOrEqualTo(Integer value) {
            addCriterion("TOICH.ITEM_RGUR_PRC <=", value, "itemRgurPrc");
            return (Criteria) this;
        }

        public Criteria andItemRgurPrcIn(List<Integer> values) {
            addCriterion("TOICH.ITEM_RGUR_PRC in", values, "itemRgurPrc");
            return (Criteria) this;
        }

        public Criteria andItemRgurPrcNotIn(List<Integer> values) {
            addCriterion("TOICH.ITEM_RGUR_PRC not in", values, "itemRgurPrc");
            return (Criteria) this;
        }

        public Criteria andItemRgurPrcBetween(Integer value1, Integer value2) {
            addCriterion("TOICH.ITEM_RGUR_PRC between", value1, value2, "itemRgurPrc");
            return (Criteria) this;
        }

        public Criteria andItemRgurPrcNotBetween(Integer value1, Integer value2) {
            addCriterion("TOICH.ITEM_RGUR_PRC not between", value1, value2, "itemRgurPrc");
            return (Criteria) this;
        }

        public Criteria andItemPrcIdIsNull() {
            addCriterion("TOICH.ITEM_PRC_ID is null");
            return (Criteria) this;
        }

        public Criteria andItemPrcIdIsNotNull() {
            addCriterion("TOICH.ITEM_PRC_ID is not null");
            return (Criteria) this;
        }

        public Criteria andItemPrcIdEqualTo(Integer value) {
            addCriterion("TOICH.ITEM_PRC_ID =", value, "itemPrcId");
            return (Criteria) this;
        }

        public Criteria andItemPrcIdNotEqualTo(Integer value) {
            addCriterion("TOICH.ITEM_PRC_ID <>", value, "itemPrcId");
            return (Criteria) this;
        }

        public Criteria andItemPrcIdGreaterThan(Integer value) {
            addCriterion("TOICH.ITEM_PRC_ID >", value, "itemPrcId");
            return (Criteria) this;
        }

        public Criteria andItemPrcIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("TOICH.ITEM_PRC_ID >=", value, "itemPrcId");
            return (Criteria) this;
        }

        public Criteria andItemPrcIdLessThan(Integer value) {
            addCriterion("TOICH.ITEM_PRC_ID <", value, "itemPrcId");
            return (Criteria) this;
        }

        public Criteria andItemPrcIdLessThanOrEqualTo(Integer value) {
            addCriterion("TOICH.ITEM_PRC_ID <=", value, "itemPrcId");
            return (Criteria) this;
        }

        public Criteria andItemPrcIdIn(List<Integer> values) {
            addCriterion("TOICH.ITEM_PRC_ID in", values, "itemPrcId");
            return (Criteria) this;
        }

        public Criteria andItemPrcIdNotIn(List<Integer> values) {
            addCriterion("TOICH.ITEM_PRC_ID not in", values, "itemPrcId");
            return (Criteria) this;
        }

        public Criteria andItemPrcIdBetween(Integer value1, Integer value2) {
            addCriterion("TOICH.ITEM_PRC_ID between", value1, value2, "itemPrcId");
            return (Criteria) this;
        }

        public Criteria andItemPrcIdNotBetween(Integer value1, Integer value2) {
            addCriterion("TOICH.ITEM_PRC_ID not between", value1, value2, "itemPrcId");
            return (Criteria) this;
        }

        public Criteria andItemPrcTpCdIsNull() {
            addCriterion("TOICH.ITEM_PRC_TP_CD is null");
            return (Criteria) this;
        }

        public Criteria andItemPrcTpCdIsNotNull() {
            addCriterion("TOICH.ITEM_PRC_TP_CD is not null");
            return (Criteria) this;
        }

        public Criteria andItemPrcTpCdEqualTo(String value) {
            addCriterion("TOICH.ITEM_PRC_TP_CD =", value, "itemPrcTpCd");
            return (Criteria) this;
        }

        public Criteria andItemPrcTpCdNotEqualTo(String value) {
            addCriterion("TOICH.ITEM_PRC_TP_CD <>", value, "itemPrcTpCd");
            return (Criteria) this;
        }

        public Criteria andItemPrcTpCdGreaterThan(String value) {
            addCriterion("TOICH.ITEM_PRC_TP_CD >", value, "itemPrcTpCd");
            return (Criteria) this;
        }

        public Criteria andItemPrcTpCdGreaterThanOrEqualTo(String value) {
            addCriterion("TOICH.ITEM_PRC_TP_CD >=", value, "itemPrcTpCd");
            return (Criteria) this;
        }

        public Criteria andItemPrcTpCdLessThan(String value) {
            addCriterion("TOICH.ITEM_PRC_TP_CD <", value, "itemPrcTpCd");
            return (Criteria) this;
        }

        public Criteria andItemPrcTpCdLessThanOrEqualTo(String value) {
            addCriterion("TOICH.ITEM_PRC_TP_CD <=", value, "itemPrcTpCd");
            return (Criteria) this;
        }

        public Criteria andItemPrcTpCdLike(String value) {
            addCriterion("TOICH.ITEM_PRC_TP_CD like", value, "itemPrcTpCd");
            return (Criteria) this;
        }

        public Criteria andItemPrcTpCdNotLike(String value) {
            addCriterion("TOICH.ITEM_PRC_TP_CD not like", value, "itemPrcTpCd");
            return (Criteria) this;
        }

        public Criteria andItemPrcTpCdIn(List<String> values) {
            addCriterion("TOICH.ITEM_PRC_TP_CD in", values, "itemPrcTpCd");
            return (Criteria) this;
        }

        public Criteria andItemPrcTpCdNotIn(List<String> values) {
            addCriterion("TOICH.ITEM_PRC_TP_CD not in", values, "itemPrcTpCd");
            return (Criteria) this;
        }

        public Criteria andItemPrcTpCdBetween(String value1, String value2) {
            addCriterion("TOICH.ITEM_PRC_TP_CD between", value1, value2, "itemPrcTpCd");
            return (Criteria) this;
        }

        public Criteria andItemPrcTpCdNotBetween(String value1, String value2) {
            addCriterion("TOICH.ITEM_PRC_TP_CD not between", value1, value2, "itemPrcTpCd");
            return (Criteria) this;
        }

        public Criteria andItemSplyUprcIsNull() {
            addCriterion("TOICH.ITEM_SPLY_UPRC is null");
            return (Criteria) this;
        }

        public Criteria andItemSplyUprcIsNotNull() {
            addCriterion("TOICH.ITEM_SPLY_UPRC is not null");
            return (Criteria) this;
        }

        public Criteria andItemSplyUprcEqualTo(Integer value) {
            addCriterion("TOICH.ITEM_SPLY_UPRC =", value, "itemSplyUprc");
            return (Criteria) this;
        }

        public Criteria andItemSplyUprcNotEqualTo(Integer value) {
            addCriterion("TOICH.ITEM_SPLY_UPRC <>", value, "itemSplyUprc");
            return (Criteria) this;
        }

        public Criteria andItemSplyUprcGreaterThan(Integer value) {
            addCriterion("TOICH.ITEM_SPLY_UPRC >", value, "itemSplyUprc");
            return (Criteria) this;
        }

        public Criteria andItemSplyUprcGreaterThanOrEqualTo(Integer value) {
            addCriterion("TOICH.ITEM_SPLY_UPRC >=", value, "itemSplyUprc");
            return (Criteria) this;
        }

        public Criteria andItemSplyUprcLessThan(Integer value) {
            addCriterion("TOICH.ITEM_SPLY_UPRC <", value, "itemSplyUprc");
            return (Criteria) this;
        }

        public Criteria andItemSplyUprcLessThanOrEqualTo(Integer value) {
            addCriterion("TOICH.ITEM_SPLY_UPRC <=", value, "itemSplyUprc");
            return (Criteria) this;
        }

        public Criteria andItemSplyUprcIn(List<Integer> values) {
            addCriterion("TOICH.ITEM_SPLY_UPRC in", values, "itemSplyUprc");
            return (Criteria) this;
        }

        public Criteria andItemSplyUprcNotIn(List<Integer> values) {
            addCriterion("TOICH.ITEM_SPLY_UPRC not in", values, "itemSplyUprc");
            return (Criteria) this;
        }

        public Criteria andItemSplyUprcBetween(Integer value1, Integer value2) {
            addCriterion("TOICH.ITEM_SPLY_UPRC between", value1, value2, "itemSplyUprc");
            return (Criteria) this;
        }

        public Criteria andItemSplyUprcNotBetween(Integer value1, Integer value2) {
            addCriterion("TOICH.ITEM_SPLY_UPRC not between", value1, value2, "itemSplyUprc");
            return (Criteria) this;
        }

        public Criteria andItemSellUnitQtyIsNull() {
            addCriterion("TOICH.ITEM_SELL_UNIT_QTY is null");
            return (Criteria) this;
        }

        public Criteria andItemSellUnitQtyIsNotNull() {
            addCriterion("TOICH.ITEM_SELL_UNIT_QTY is not null");
            return (Criteria) this;
        }

        public Criteria andItemSellUnitQtyEqualTo(Integer value) {
            addCriterion("TOICH.ITEM_SELL_UNIT_QTY =", value, "itemSellUnitQty");
            return (Criteria) this;
        }

        public Criteria andItemSellUnitQtyNotEqualTo(Integer value) {
            addCriterion("TOICH.ITEM_SELL_UNIT_QTY <>", value, "itemSellUnitQty");
            return (Criteria) this;
        }

        public Criteria andItemSellUnitQtyGreaterThan(Integer value) {
            addCriterion("TOICH.ITEM_SELL_UNIT_QTY >", value, "itemSellUnitQty");
            return (Criteria) this;
        }

        public Criteria andItemSellUnitQtyGreaterThanOrEqualTo(Integer value) {
            addCriterion("TOICH.ITEM_SELL_UNIT_QTY >=", value, "itemSellUnitQty");
            return (Criteria) this;
        }

        public Criteria andItemSellUnitQtyLessThan(Integer value) {
            addCriterion("TOICH.ITEM_SELL_UNIT_QTY <", value, "itemSellUnitQty");
            return (Criteria) this;
        }

        public Criteria andItemSellUnitQtyLessThanOrEqualTo(Integer value) {
            addCriterion("TOICH.ITEM_SELL_UNIT_QTY <=", value, "itemSellUnitQty");
            return (Criteria) this;
        }

        public Criteria andItemSellUnitQtyIn(List<Integer> values) {
            addCriterion("TOICH.ITEM_SELL_UNIT_QTY in", values, "itemSellUnitQty");
            return (Criteria) this;
        }

        public Criteria andItemSellUnitQtyNotIn(List<Integer> values) {
            addCriterion("TOICH.ITEM_SELL_UNIT_QTY not in", values, "itemSellUnitQty");
            return (Criteria) this;
        }

        public Criteria andItemSellUnitQtyBetween(Integer value1, Integer value2) {
            addCriterion("TOICH.ITEM_SELL_UNIT_QTY between", value1, value2, "itemSellUnitQty");
            return (Criteria) this;
        }

        public Criteria andItemSellUnitQtyNotBetween(Integer value1, Integer value2) {
            addCriterion("TOICH.ITEM_SELL_UNIT_QTY not between", value1, value2, "itemSellUnitQty");
            return (Criteria) this;
        }

        public Criteria andItemSplyPrcIsNull() {
            addCriterion("TOICH.ITEM_SPLY_PRC is null");
            return (Criteria) this;
        }

        public Criteria andItemSplyPrcIsNotNull() {
            addCriterion("TOICH.ITEM_SPLY_PRC is not null");
            return (Criteria) this;
        }

        public Criteria andItemSplyPrcEqualTo(Integer value) {
            addCriterion("TOICH.ITEM_SPLY_PRC =", value, "itemSplyPrc");
            return (Criteria) this;
        }

        public Criteria andItemSplyPrcNotEqualTo(Integer value) {
            addCriterion("TOICH.ITEM_SPLY_PRC <>", value, "itemSplyPrc");
            return (Criteria) this;
        }

        public Criteria andItemSplyPrcGreaterThan(Integer value) {
            addCriterion("TOICH.ITEM_SPLY_PRC >", value, "itemSplyPrc");
            return (Criteria) this;
        }

        public Criteria andItemSplyPrcGreaterThanOrEqualTo(Integer value) {
            addCriterion("TOICH.ITEM_SPLY_PRC >=", value, "itemSplyPrc");
            return (Criteria) this;
        }

        public Criteria andItemSplyPrcLessThan(Integer value) {
            addCriterion("TOICH.ITEM_SPLY_PRC <", value, "itemSplyPrc");
            return (Criteria) this;
        }

        public Criteria andItemSplyPrcLessThanOrEqualTo(Integer value) {
            addCriterion("TOICH.ITEM_SPLY_PRC <=", value, "itemSplyPrc");
            return (Criteria) this;
        }

        public Criteria andItemSplyPrcIn(List<Integer> values) {
            addCriterion("TOICH.ITEM_SPLY_PRC in", values, "itemSplyPrc");
            return (Criteria) this;
        }

        public Criteria andItemSplyPrcNotIn(List<Integer> values) {
            addCriterion("TOICH.ITEM_SPLY_PRC not in", values, "itemSplyPrc");
            return (Criteria) this;
        }

        public Criteria andItemSplyPrcBetween(Integer value1, Integer value2) {
            addCriterion("TOICH.ITEM_SPLY_PRC between", value1, value2, "itemSplyPrc");
            return (Criteria) this;
        }

        public Criteria andItemSplyPrcNotBetween(Integer value1, Integer value2) {
            addCriterion("TOICH.ITEM_SPLY_PRC not between", value1, value2, "itemSplyPrc");
            return (Criteria) this;
        }

        public Criteria andItemSellDcRateIsNull() {
            addCriterion("TOICH.ITEM_SELL_DC_RATE is null");
            return (Criteria) this;
        }

        public Criteria andItemSellDcRateIsNotNull() {
            addCriterion("TOICH.ITEM_SELL_DC_RATE is not null");
            return (Criteria) this;
        }

        public Criteria andItemSellDcRateEqualTo(BigDecimal value) {
            addCriterion("TOICH.ITEM_SELL_DC_RATE =", value, "itemSellDcRate");
            return (Criteria) this;
        }

        public Criteria andItemSellDcRateNotEqualTo(BigDecimal value) {
            addCriterion("TOICH.ITEM_SELL_DC_RATE <>", value, "itemSellDcRate");
            return (Criteria) this;
        }

        public Criteria andItemSellDcRateGreaterThan(BigDecimal value) {
            addCriterion("TOICH.ITEM_SELL_DC_RATE >", value, "itemSellDcRate");
            return (Criteria) this;
        }

        public Criteria andItemSellDcRateGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("TOICH.ITEM_SELL_DC_RATE >=", value, "itemSellDcRate");
            return (Criteria) this;
        }

        public Criteria andItemSellDcRateLessThan(BigDecimal value) {
            addCriterion("TOICH.ITEM_SELL_DC_RATE <", value, "itemSellDcRate");
            return (Criteria) this;
        }

        public Criteria andItemSellDcRateLessThanOrEqualTo(BigDecimal value) {
            addCriterion("TOICH.ITEM_SELL_DC_RATE <=", value, "itemSellDcRate");
            return (Criteria) this;
        }

        public Criteria andItemSellDcRateIn(List<BigDecimal> values) {
            addCriterion("TOICH.ITEM_SELL_DC_RATE in", values, "itemSellDcRate");
            return (Criteria) this;
        }

        public Criteria andItemSellDcRateNotIn(List<BigDecimal> values) {
            addCriterion("TOICH.ITEM_SELL_DC_RATE not in", values, "itemSellDcRate");
            return (Criteria) this;
        }

        public Criteria andItemSellDcRateBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TOICH.ITEM_SELL_DC_RATE between", value1, value2, "itemSellDcRate");
            return (Criteria) this;
        }

        public Criteria andItemSellDcRateNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TOICH.ITEM_SELL_DC_RATE not between", value1, value2, "itemSellDcRate");
            return (Criteria) this;
        }

        public Criteria andItemSellPrcIsNull() {
            addCriterion("TOICH.ITEM_SELL_PRC is null");
            return (Criteria) this;
        }

        public Criteria andItemSellPrcIsNotNull() {
            addCriterion("TOICH.ITEM_SELL_PRC is not null");
            return (Criteria) this;
        }

        public Criteria andItemSellPrcEqualTo(Integer value) {
            addCriterion("TOICH.ITEM_SELL_PRC =", value, "itemSellPrc");
            return (Criteria) this;
        }

        public Criteria andItemSellPrcNotEqualTo(Integer value) {
            addCriterion("TOICH.ITEM_SELL_PRC <>", value, "itemSellPrc");
            return (Criteria) this;
        }

        public Criteria andItemSellPrcGreaterThan(Integer value) {
            addCriterion("TOICH.ITEM_SELL_PRC >", value, "itemSellPrc");
            return (Criteria) this;
        }

        public Criteria andItemSellPrcGreaterThanOrEqualTo(Integer value) {
            addCriterion("TOICH.ITEM_SELL_PRC >=", value, "itemSellPrc");
            return (Criteria) this;
        }

        public Criteria andItemSellPrcLessThan(Integer value) {
            addCriterion("TOICH.ITEM_SELL_PRC <", value, "itemSellPrc");
            return (Criteria) this;
        }

        public Criteria andItemSellPrcLessThanOrEqualTo(Integer value) {
            addCriterion("TOICH.ITEM_SELL_PRC <=", value, "itemSellPrc");
            return (Criteria) this;
        }

        public Criteria andItemSellPrcIn(List<Integer> values) {
            addCriterion("TOICH.ITEM_SELL_PRC in", values, "itemSellPrc");
            return (Criteria) this;
        }

        public Criteria andItemSellPrcNotIn(List<Integer> values) {
            addCriterion("TOICH.ITEM_SELL_PRC not in", values, "itemSellPrc");
            return (Criteria) this;
        }

        public Criteria andItemSellPrcBetween(Integer value1, Integer value2) {
            addCriterion("TOICH.ITEM_SELL_PRC between", value1, value2, "itemSellPrc");
            return (Criteria) this;
        }

        public Criteria andItemSellPrcNotBetween(Integer value1, Integer value2) {
            addCriterion("TOICH.ITEM_SELL_PRC not between", value1, value2, "itemSellPrc");
            return (Criteria) this;
        }

        public Criteria andItemComsRateIsNull() {
            addCriterion("TOICH.ITEM_COMS_RATE is null");
            return (Criteria) this;
        }

        public Criteria andItemComsRateIsNotNull() {
            addCriterion("TOICH.ITEM_COMS_RATE is not null");
            return (Criteria) this;
        }

        public Criteria andItemComsRateEqualTo(BigDecimal value) {
            addCriterion("TOICH.ITEM_COMS_RATE =", value, "itemComsRate");
            return (Criteria) this;
        }

        public Criteria andItemComsRateNotEqualTo(BigDecimal value) {
            addCriterion("TOICH.ITEM_COMS_RATE <>", value, "itemComsRate");
            return (Criteria) this;
        }

        public Criteria andItemComsRateGreaterThan(BigDecimal value) {
            addCriterion("TOICH.ITEM_COMS_RATE >", value, "itemComsRate");
            return (Criteria) this;
        }

        public Criteria andItemComsRateGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("TOICH.ITEM_COMS_RATE >=", value, "itemComsRate");
            return (Criteria) this;
        }

        public Criteria andItemComsRateLessThan(BigDecimal value) {
            addCriterion("TOICH.ITEM_COMS_RATE <", value, "itemComsRate");
            return (Criteria) this;
        }

        public Criteria andItemComsRateLessThanOrEqualTo(BigDecimal value) {
            addCriterion("TOICH.ITEM_COMS_RATE <=", value, "itemComsRate");
            return (Criteria) this;
        }

        public Criteria andItemComsRateIn(List<BigDecimal> values) {
            addCriterion("TOICH.ITEM_COMS_RATE in", values, "itemComsRate");
            return (Criteria) this;
        }

        public Criteria andItemComsRateNotIn(List<BigDecimal> values) {
            addCriterion("TOICH.ITEM_COMS_RATE not in", values, "itemComsRate");
            return (Criteria) this;
        }

        public Criteria andItemComsRateBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TOICH.ITEM_COMS_RATE between", value1, value2, "itemComsRate");
            return (Criteria) this;
        }

        public Criteria andItemComsRateNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TOICH.ITEM_COMS_RATE not between", value1, value2, "itemComsRate");
            return (Criteria) this;
        }

        public Criteria andItemComsAmtIsNull() {
            addCriterion("TOICH.ITEM_COMS_AMT is null");
            return (Criteria) this;
        }

        public Criteria andItemComsAmtIsNotNull() {
            addCriterion("TOICH.ITEM_COMS_AMT is not null");
            return (Criteria) this;
        }

        public Criteria andItemComsAmtEqualTo(Integer value) {
            addCriterion("TOICH.ITEM_COMS_AMT =", value, "itemComsAmt");
            return (Criteria) this;
        }

        public Criteria andItemComsAmtNotEqualTo(Integer value) {
            addCriterion("TOICH.ITEM_COMS_AMT <>", value, "itemComsAmt");
            return (Criteria) this;
        }

        public Criteria andItemComsAmtGreaterThan(Integer value) {
            addCriterion("TOICH.ITEM_COMS_AMT >", value, "itemComsAmt");
            return (Criteria) this;
        }

        public Criteria andItemComsAmtGreaterThanOrEqualTo(Integer value) {
            addCriterion("TOICH.ITEM_COMS_AMT >=", value, "itemComsAmt");
            return (Criteria) this;
        }

        public Criteria andItemComsAmtLessThan(Integer value) {
            addCriterion("TOICH.ITEM_COMS_AMT <", value, "itemComsAmt");
            return (Criteria) this;
        }

        public Criteria andItemComsAmtLessThanOrEqualTo(Integer value) {
            addCriterion("TOICH.ITEM_COMS_AMT <=", value, "itemComsAmt");
            return (Criteria) this;
        }

        public Criteria andItemComsAmtIn(List<Integer> values) {
            addCriterion("TOICH.ITEM_COMS_AMT in", values, "itemComsAmt");
            return (Criteria) this;
        }

        public Criteria andItemComsAmtNotIn(List<Integer> values) {
            addCriterion("TOICH.ITEM_COMS_AMT not in", values, "itemComsAmt");
            return (Criteria) this;
        }

        public Criteria andItemComsAmtBetween(Integer value1, Integer value2) {
            addCriterion("TOICH.ITEM_COMS_AMT between", value1, value2, "itemComsAmt");
            return (Criteria) this;
        }

        public Criteria andItemComsAmtNotBetween(Integer value1, Integer value2) {
            addCriterion("TOICH.ITEM_COMS_AMT not between", value1, value2, "itemComsAmt");
            return (Criteria) this;
        }

        public Criteria andRealSellPrcIsNull() {
            addCriterion("TOICH.REAL_SELL_PRC is null");
            return (Criteria) this;
        }

        public Criteria andRealSellPrcIsNotNull() {
            addCriterion("TOICH.REAL_SELL_PRC is not null");
            return (Criteria) this;
        }

        public Criteria andRealSellPrcEqualTo(Integer value) {
            addCriterion("TOICH.REAL_SELL_PRC =", value, "realSellPrc");
            return (Criteria) this;
        }

        public Criteria andRealSellPrcNotEqualTo(Integer value) {
            addCriterion("TOICH.REAL_SELL_PRC <>", value, "realSellPrc");
            return (Criteria) this;
        }

        public Criteria andRealSellPrcGreaterThan(Integer value) {
            addCriterion("TOICH.REAL_SELL_PRC >", value, "realSellPrc");
            return (Criteria) this;
        }

        public Criteria andRealSellPrcGreaterThanOrEqualTo(Integer value) {
            addCriterion("TOICH.REAL_SELL_PRC >=", value, "realSellPrc");
            return (Criteria) this;
        }

        public Criteria andRealSellPrcLessThan(Integer value) {
            addCriterion("TOICH.REAL_SELL_PRC <", value, "realSellPrc");
            return (Criteria) this;
        }

        public Criteria andRealSellPrcLessThanOrEqualTo(Integer value) {
            addCriterion("TOICH.REAL_SELL_PRC <=", value, "realSellPrc");
            return (Criteria) this;
        }

        public Criteria andRealSellPrcIn(List<Integer> values) {
            addCriterion("TOICH.REAL_SELL_PRC in", values, "realSellPrc");
            return (Criteria) this;
        }

        public Criteria andRealSellPrcNotIn(List<Integer> values) {
            addCriterion("TOICH.REAL_SELL_PRC not in", values, "realSellPrc");
            return (Criteria) this;
        }

        public Criteria andRealSellPrcBetween(Integer value1, Integer value2) {
            addCriterion("TOICH.REAL_SELL_PRC between", value1, value2, "realSellPrc");
            return (Criteria) this;
        }

        public Criteria andRealSellPrcNotBetween(Integer value1, Integer value2) {
            addCriterion("TOICH.REAL_SELL_PRC not between", value1, value2, "realSellPrc");
            return (Criteria) this;
        }

        public Criteria andItemVatRateIsNull() {
            addCriterion("TOICH.ITEM_VAT_RATE is null");
            return (Criteria) this;
        }

        public Criteria andItemVatRateIsNotNull() {
            addCriterion("TOICH.ITEM_VAT_RATE is not null");
            return (Criteria) this;
        }

        public Criteria andItemVatRateEqualTo(BigDecimal value) {
            addCriterion("TOICH.ITEM_VAT_RATE =", value, "itemVatRate");
            return (Criteria) this;
        }

        public Criteria andItemVatRateNotEqualTo(BigDecimal value) {
            addCriterion("TOICH.ITEM_VAT_RATE <>", value, "itemVatRate");
            return (Criteria) this;
        }

        public Criteria andItemVatRateGreaterThan(BigDecimal value) {
            addCriterion("TOICH.ITEM_VAT_RATE >", value, "itemVatRate");
            return (Criteria) this;
        }

        public Criteria andItemVatRateGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("TOICH.ITEM_VAT_RATE >=", value, "itemVatRate");
            return (Criteria) this;
        }

        public Criteria andItemVatRateLessThan(BigDecimal value) {
            addCriterion("TOICH.ITEM_VAT_RATE <", value, "itemVatRate");
            return (Criteria) this;
        }

        public Criteria andItemVatRateLessThanOrEqualTo(BigDecimal value) {
            addCriterion("TOICH.ITEM_VAT_RATE <=", value, "itemVatRate");
            return (Criteria) this;
        }

        public Criteria andItemVatRateIn(List<BigDecimal> values) {
            addCriterion("TOICH.ITEM_VAT_RATE in", values, "itemVatRate");
            return (Criteria) this;
        }

        public Criteria andItemVatRateNotIn(List<BigDecimal> values) {
            addCriterion("TOICH.ITEM_VAT_RATE not in", values, "itemVatRate");
            return (Criteria) this;
        }

        public Criteria andItemVatRateBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TOICH.ITEM_VAT_RATE between", value1, value2, "itemVatRate");
            return (Criteria) this;
        }

        public Criteria andItemVatRateNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TOICH.ITEM_VAT_RATE not between", value1, value2, "itemVatRate");
            return (Criteria) this;
        }

        public Criteria andOrdQtyIsNull() {
            addCriterion("TOICH.ORD_QTY is null");
            return (Criteria) this;
        }

        public Criteria andOrdQtyIsNotNull() {
            addCriterion("TOICH.ORD_QTY is not null");
            return (Criteria) this;
        }

        public Criteria andOrdQtyEqualTo(Integer value) {
            addCriterion("TOICH.ORD_QTY =", value, "ordQty");
            return (Criteria) this;
        }

        public Criteria andOrdQtyNotEqualTo(Integer value) {
            addCriterion("TOICH.ORD_QTY <>", value, "ordQty");
            return (Criteria) this;
        }

        public Criteria andOrdQtyGreaterThan(Integer value) {
            addCriterion("TOICH.ORD_QTY >", value, "ordQty");
            return (Criteria) this;
        }

        public Criteria andOrdQtyGreaterThanOrEqualTo(Integer value) {
            addCriterion("TOICH.ORD_QTY >=", value, "ordQty");
            return (Criteria) this;
        }

        public Criteria andOrdQtyLessThan(Integer value) {
            addCriterion("TOICH.ORD_QTY <", value, "ordQty");
            return (Criteria) this;
        }

        public Criteria andOrdQtyLessThanOrEqualTo(Integer value) {
            addCriterion("TOICH.ORD_QTY <=", value, "ordQty");
            return (Criteria) this;
        }

        public Criteria andOrdQtyIn(List<Integer> values) {
            addCriterion("TOICH.ORD_QTY in", values, "ordQty");
            return (Criteria) this;
        }

        public Criteria andOrdQtyNotIn(List<Integer> values) {
            addCriterion("TOICH.ORD_QTY not in", values, "ordQty");
            return (Criteria) this;
        }

        public Criteria andOrdQtyBetween(Integer value1, Integer value2) {
            addCriterion("TOICH.ORD_QTY between", value1, value2, "ordQty");
            return (Criteria) this;
        }

        public Criteria andOrdQtyNotBetween(Integer value1, Integer value2) {
            addCriterion("TOICH.ORD_QTY not between", value1, value2, "ordQty");
            return (Criteria) this;
        }

        public Criteria andCnclQtyIsNull() {
            addCriterion("TOICH.CNCL_QTY is null");
            return (Criteria) this;
        }

        public Criteria andCnclQtyIsNotNull() {
            addCriterion("TOICH.CNCL_QTY is not null");
            return (Criteria) this;
        }

        public Criteria andCnclQtyEqualTo(Integer value) {
            addCriterion("TOICH.CNCL_QTY =", value, "cnclQty");
            return (Criteria) this;
        }

        public Criteria andCnclQtyNotEqualTo(Integer value) {
            addCriterion("TOICH.CNCL_QTY <>", value, "cnclQty");
            return (Criteria) this;
        }

        public Criteria andCnclQtyGreaterThan(Integer value) {
            addCriterion("TOICH.CNCL_QTY >", value, "cnclQty");
            return (Criteria) this;
        }

        public Criteria andCnclQtyGreaterThanOrEqualTo(Integer value) {
            addCriterion("TOICH.CNCL_QTY >=", value, "cnclQty");
            return (Criteria) this;
        }

        public Criteria andCnclQtyLessThan(Integer value) {
            addCriterion("TOICH.CNCL_QTY <", value, "cnclQty");
            return (Criteria) this;
        }

        public Criteria andCnclQtyLessThanOrEqualTo(Integer value) {
            addCriterion("TOICH.CNCL_QTY <=", value, "cnclQty");
            return (Criteria) this;
        }

        public Criteria andCnclQtyIn(List<Integer> values) {
            addCriterion("TOICH.CNCL_QTY in", values, "cnclQty");
            return (Criteria) this;
        }

        public Criteria andCnclQtyNotIn(List<Integer> values) {
            addCriterion("TOICH.CNCL_QTY not in", values, "cnclQty");
            return (Criteria) this;
        }

        public Criteria andCnclQtyBetween(Integer value1, Integer value2) {
            addCriterion("TOICH.CNCL_QTY between", value1, value2, "cnclQty");
            return (Criteria) this;
        }

        public Criteria andCnclQtyNotBetween(Integer value1, Integer value2) {
            addCriterion("TOICH.CNCL_QTY not between", value1, value2, "cnclQty");
            return (Criteria) this;
        }

        public Criteria andFstOrdAmtIsNull() {
            addCriterion("TOICH.FST_ORD_AMT is null");
            return (Criteria) this;
        }

        public Criteria andFstOrdAmtIsNotNull() {
            addCriterion("TOICH.FST_ORD_AMT is not null");
            return (Criteria) this;
        }

        public Criteria andFstOrdAmtEqualTo(Integer value) {
            addCriterion("TOICH.FST_ORD_AMT =", value, "fstOrdAmt");
            return (Criteria) this;
        }

        public Criteria andFstOrdAmtNotEqualTo(Integer value) {
            addCriterion("TOICH.FST_ORD_AMT <>", value, "fstOrdAmt");
            return (Criteria) this;
        }

        public Criteria andFstOrdAmtGreaterThan(Integer value) {
            addCriterion("TOICH.FST_ORD_AMT >", value, "fstOrdAmt");
            return (Criteria) this;
        }

        public Criteria andFstOrdAmtGreaterThanOrEqualTo(Integer value) {
            addCriterion("TOICH.FST_ORD_AMT >=", value, "fstOrdAmt");
            return (Criteria) this;
        }

        public Criteria andFstOrdAmtLessThan(Integer value) {
            addCriterion("TOICH.FST_ORD_AMT <", value, "fstOrdAmt");
            return (Criteria) this;
        }

        public Criteria andFstOrdAmtLessThanOrEqualTo(Integer value) {
            addCriterion("TOICH.FST_ORD_AMT <=", value, "fstOrdAmt");
            return (Criteria) this;
        }

        public Criteria andFstOrdAmtIn(List<Integer> values) {
            addCriterion("TOICH.FST_ORD_AMT in", values, "fstOrdAmt");
            return (Criteria) this;
        }

        public Criteria andFstOrdAmtNotIn(List<Integer> values) {
            addCriterion("TOICH.FST_ORD_AMT not in", values, "fstOrdAmt");
            return (Criteria) this;
        }

        public Criteria andFstOrdAmtBetween(Integer value1, Integer value2) {
            addCriterion("TOICH.FST_ORD_AMT between", value1, value2, "fstOrdAmt");
            return (Criteria) this;
        }

        public Criteria andFstOrdAmtNotBetween(Integer value1, Integer value2) {
            addCriterion("TOICH.FST_ORD_AMT not between", value1, value2, "fstOrdAmt");
            return (Criteria) this;
        }

        public Criteria andFstCpnDcAmtIsNull() {
            addCriterion("TOICH.FST_CPN_DC_AMT is null");
            return (Criteria) this;
        }

        public Criteria andFstCpnDcAmtIsNotNull() {
            addCriterion("TOICH.FST_CPN_DC_AMT is not null");
            return (Criteria) this;
        }

        public Criteria andFstCpnDcAmtEqualTo(Integer value) {
            addCriterion("TOICH.FST_CPN_DC_AMT =", value, "fstCpnDcAmt");
            return (Criteria) this;
        }

        public Criteria andFstCpnDcAmtNotEqualTo(Integer value) {
            addCriterion("TOICH.FST_CPN_DC_AMT <>", value, "fstCpnDcAmt");
            return (Criteria) this;
        }

        public Criteria andFstCpnDcAmtGreaterThan(Integer value) {
            addCriterion("TOICH.FST_CPN_DC_AMT >", value, "fstCpnDcAmt");
            return (Criteria) this;
        }

        public Criteria andFstCpnDcAmtGreaterThanOrEqualTo(Integer value) {
            addCriterion("TOICH.FST_CPN_DC_AMT >=", value, "fstCpnDcAmt");
            return (Criteria) this;
        }

        public Criteria andFstCpnDcAmtLessThan(Integer value) {
            addCriterion("TOICH.FST_CPN_DC_AMT <", value, "fstCpnDcAmt");
            return (Criteria) this;
        }

        public Criteria andFstCpnDcAmtLessThanOrEqualTo(Integer value) {
            addCriterion("TOICH.FST_CPN_DC_AMT <=", value, "fstCpnDcAmt");
            return (Criteria) this;
        }

        public Criteria andFstCpnDcAmtIn(List<Integer> values) {
            addCriterion("TOICH.FST_CPN_DC_AMT in", values, "fstCpnDcAmt");
            return (Criteria) this;
        }

        public Criteria andFstCpnDcAmtNotIn(List<Integer> values) {
            addCriterion("TOICH.FST_CPN_DC_AMT not in", values, "fstCpnDcAmt");
            return (Criteria) this;
        }

        public Criteria andFstCpnDcAmtBetween(Integer value1, Integer value2) {
            addCriterion("TOICH.FST_CPN_DC_AMT between", value1, value2, "fstCpnDcAmt");
            return (Criteria) this;
        }

        public Criteria andFstCpnDcAmtNotBetween(Integer value1, Integer value2) {
            addCriterion("TOICH.FST_CPN_DC_AMT not between", value1, value2, "fstCpnDcAmt");
            return (Criteria) this;
        }

        public Criteria andFstPtUseAmtIsNull() {
            addCriterion("TOICH.FST_PT_USE_AMT is null");
            return (Criteria) this;
        }

        public Criteria andFstPtUseAmtIsNotNull() {
            addCriterion("TOICH.FST_PT_USE_AMT is not null");
            return (Criteria) this;
        }

        public Criteria andFstPtUseAmtEqualTo(Integer value) {
            addCriterion("TOICH.FST_PT_USE_AMT =", value, "fstPtUseAmt");
            return (Criteria) this;
        }

        public Criteria andFstPtUseAmtNotEqualTo(Integer value) {
            addCriterion("TOICH.FST_PT_USE_AMT <>", value, "fstPtUseAmt");
            return (Criteria) this;
        }

        public Criteria andFstPtUseAmtGreaterThan(Integer value) {
            addCriterion("TOICH.FST_PT_USE_AMT >", value, "fstPtUseAmt");
            return (Criteria) this;
        }

        public Criteria andFstPtUseAmtGreaterThanOrEqualTo(Integer value) {
            addCriterion("TOICH.FST_PT_USE_AMT >=", value, "fstPtUseAmt");
            return (Criteria) this;
        }

        public Criteria andFstPtUseAmtLessThan(Integer value) {
            addCriterion("TOICH.FST_PT_USE_AMT <", value, "fstPtUseAmt");
            return (Criteria) this;
        }

        public Criteria andFstPtUseAmtLessThanOrEqualTo(Integer value) {
            addCriterion("TOICH.FST_PT_USE_AMT <=", value, "fstPtUseAmt");
            return (Criteria) this;
        }

        public Criteria andFstPtUseAmtIn(List<Integer> values) {
            addCriterion("TOICH.FST_PT_USE_AMT in", values, "fstPtUseAmt");
            return (Criteria) this;
        }

        public Criteria andFstPtUseAmtNotIn(List<Integer> values) {
            addCriterion("TOICH.FST_PT_USE_AMT not in", values, "fstPtUseAmt");
            return (Criteria) this;
        }

        public Criteria andFstPtUseAmtBetween(Integer value1, Integer value2) {
            addCriterion("TOICH.FST_PT_USE_AMT between", value1, value2, "fstPtUseAmt");
            return (Criteria) this;
        }

        public Criteria andFstPtUseAmtNotBetween(Integer value1, Integer value2) {
            addCriterion("TOICH.FST_PT_USE_AMT not between", value1, value2, "fstPtUseAmt");
            return (Criteria) this;
        }

        public Criteria andFstRealOrdAmtIsNull() {
            addCriterion("TOICH.FST_REAL_ORD_AMT is null");
            return (Criteria) this;
        }

        public Criteria andFstRealOrdAmtIsNotNull() {
            addCriterion("TOICH.FST_REAL_ORD_AMT is not null");
            return (Criteria) this;
        }

        public Criteria andFstRealOrdAmtEqualTo(Integer value) {
            addCriterion("TOICH.FST_REAL_ORD_AMT =", value, "fstRealOrdAmt");
            return (Criteria) this;
        }

        public Criteria andFstRealOrdAmtNotEqualTo(Integer value) {
            addCriterion("TOICH.FST_REAL_ORD_AMT <>", value, "fstRealOrdAmt");
            return (Criteria) this;
        }

        public Criteria andFstRealOrdAmtGreaterThan(Integer value) {
            addCriterion("TOICH.FST_REAL_ORD_AMT >", value, "fstRealOrdAmt");
            return (Criteria) this;
        }

        public Criteria andFstRealOrdAmtGreaterThanOrEqualTo(Integer value) {
            addCriterion("TOICH.FST_REAL_ORD_AMT >=", value, "fstRealOrdAmt");
            return (Criteria) this;
        }

        public Criteria andFstRealOrdAmtLessThan(Integer value) {
            addCriterion("TOICH.FST_REAL_ORD_AMT <", value, "fstRealOrdAmt");
            return (Criteria) this;
        }

        public Criteria andFstRealOrdAmtLessThanOrEqualTo(Integer value) {
            addCriterion("TOICH.FST_REAL_ORD_AMT <=", value, "fstRealOrdAmt");
            return (Criteria) this;
        }

        public Criteria andFstRealOrdAmtIn(List<Integer> values) {
            addCriterion("TOICH.FST_REAL_ORD_AMT in", values, "fstRealOrdAmt");
            return (Criteria) this;
        }

        public Criteria andFstRealOrdAmtNotIn(List<Integer> values) {
            addCriterion("TOICH.FST_REAL_ORD_AMT not in", values, "fstRealOrdAmt");
            return (Criteria) this;
        }

        public Criteria andFstRealOrdAmtBetween(Integer value1, Integer value2) {
            addCriterion("TOICH.FST_REAL_ORD_AMT between", value1, value2, "fstRealOrdAmt");
            return (Criteria) this;
        }

        public Criteria andFstRealOrdAmtNotBetween(Integer value1, Integer value2) {
            addCriterion("TOICH.FST_REAL_ORD_AMT not between", value1, value2, "fstRealOrdAmt");
            return (Criteria) this;
        }

        public Criteria andFstRealPayAmtIsNull() {
            addCriterion("TOICH.FST_REAL_PAY_AMT is null");
            return (Criteria) this;
        }

        public Criteria andFstRealPayAmtIsNotNull() {
            addCriterion("TOICH.FST_REAL_PAY_AMT is not null");
            return (Criteria) this;
        }

        public Criteria andFstRealPayAmtEqualTo(Integer value) {
            addCriterion("TOICH.FST_REAL_PAY_AMT =", value, "fstRealPayAmt");
            return (Criteria) this;
        }

        public Criteria andFstRealPayAmtNotEqualTo(Integer value) {
            addCriterion("TOICH.FST_REAL_PAY_AMT <>", value, "fstRealPayAmt");
            return (Criteria) this;
        }

        public Criteria andFstRealPayAmtGreaterThan(Integer value) {
            addCriterion("TOICH.FST_REAL_PAY_AMT >", value, "fstRealPayAmt");
            return (Criteria) this;
        }

        public Criteria andFstRealPayAmtGreaterThanOrEqualTo(Integer value) {
            addCriterion("TOICH.FST_REAL_PAY_AMT >=", value, "fstRealPayAmt");
            return (Criteria) this;
        }

        public Criteria andFstRealPayAmtLessThan(Integer value) {
            addCriterion("TOICH.FST_REAL_PAY_AMT <", value, "fstRealPayAmt");
            return (Criteria) this;
        }

        public Criteria andFstRealPayAmtLessThanOrEqualTo(Integer value) {
            addCriterion("TOICH.FST_REAL_PAY_AMT <=", value, "fstRealPayAmt");
            return (Criteria) this;
        }

        public Criteria andFstRealPayAmtIn(List<Integer> values) {
            addCriterion("TOICH.FST_REAL_PAY_AMT in", values, "fstRealPayAmt");
            return (Criteria) this;
        }

        public Criteria andFstRealPayAmtNotIn(List<Integer> values) {
            addCriterion("TOICH.FST_REAL_PAY_AMT not in", values, "fstRealPayAmt");
            return (Criteria) this;
        }

        public Criteria andFstRealPayAmtBetween(Integer value1, Integer value2) {
            addCriterion("TOICH.FST_REAL_PAY_AMT between", value1, value2, "fstRealPayAmt");
            return (Criteria) this;
        }

        public Criteria andFstRealPayAmtNotBetween(Integer value1, Integer value2) {
            addCriterion("TOICH.FST_REAL_PAY_AMT not between", value1, value2, "fstRealPayAmt");
            return (Criteria) this;
        }

        public Criteria andFstPtSaveAmtIsNull() {
            addCriterion("TOICH.FST_PT_SAVE_AMT is null");
            return (Criteria) this;
        }

        public Criteria andFstPtSaveAmtIsNotNull() {
            addCriterion("TOICH.FST_PT_SAVE_AMT is not null");
            return (Criteria) this;
        }

        public Criteria andFstPtSaveAmtEqualTo(Integer value) {
            addCriterion("TOICH.FST_PT_SAVE_AMT =", value, "fstPtSaveAmt");
            return (Criteria) this;
        }

        public Criteria andFstPtSaveAmtNotEqualTo(Integer value) {
            addCriterion("TOICH.FST_PT_SAVE_AMT <>", value, "fstPtSaveAmt");
            return (Criteria) this;
        }

        public Criteria andFstPtSaveAmtGreaterThan(Integer value) {
            addCriterion("TOICH.FST_PT_SAVE_AMT >", value, "fstPtSaveAmt");
            return (Criteria) this;
        }

        public Criteria andFstPtSaveAmtGreaterThanOrEqualTo(Integer value) {
            addCriterion("TOICH.FST_PT_SAVE_AMT >=", value, "fstPtSaveAmt");
            return (Criteria) this;
        }

        public Criteria andFstPtSaveAmtLessThan(Integer value) {
            addCriterion("TOICH.FST_PT_SAVE_AMT <", value, "fstPtSaveAmt");
            return (Criteria) this;
        }

        public Criteria andFstPtSaveAmtLessThanOrEqualTo(Integer value) {
            addCriterion("TOICH.FST_PT_SAVE_AMT <=", value, "fstPtSaveAmt");
            return (Criteria) this;
        }

        public Criteria andFstPtSaveAmtIn(List<Integer> values) {
            addCriterion("TOICH.FST_PT_SAVE_AMT in", values, "fstPtSaveAmt");
            return (Criteria) this;
        }

        public Criteria andFstPtSaveAmtNotIn(List<Integer> values) {
            addCriterion("TOICH.FST_PT_SAVE_AMT not in", values, "fstPtSaveAmt");
            return (Criteria) this;
        }

        public Criteria andFstPtSaveAmtBetween(Integer value1, Integer value2) {
            addCriterion("TOICH.FST_PT_SAVE_AMT between", value1, value2, "fstPtSaveAmt");
            return (Criteria) this;
        }

        public Criteria andFstPtSaveAmtNotBetween(Integer value1, Integer value2) {
            addCriterion("TOICH.FST_PT_SAVE_AMT not between", value1, value2, "fstPtSaveAmt");
            return (Criteria) this;
        }

        public Criteria andOrdAmtIsNull() {
            addCriterion("TOICH.ORD_AMT is null");
            return (Criteria) this;
        }

        public Criteria andOrdAmtIsNotNull() {
            addCriterion("TOICH.ORD_AMT is not null");
            return (Criteria) this;
        }

        public Criteria andOrdAmtEqualTo(Integer value) {
            addCriterion("TOICH.ORD_AMT =", value, "ordAmt");
            return (Criteria) this;
        }

        public Criteria andOrdAmtNotEqualTo(Integer value) {
            addCriterion("TOICH.ORD_AMT <>", value, "ordAmt");
            return (Criteria) this;
        }

        public Criteria andOrdAmtGreaterThan(Integer value) {
            addCriterion("TOICH.ORD_AMT >", value, "ordAmt");
            return (Criteria) this;
        }

        public Criteria andOrdAmtGreaterThanOrEqualTo(Integer value) {
            addCriterion("TOICH.ORD_AMT >=", value, "ordAmt");
            return (Criteria) this;
        }

        public Criteria andOrdAmtLessThan(Integer value) {
            addCriterion("TOICH.ORD_AMT <", value, "ordAmt");
            return (Criteria) this;
        }

        public Criteria andOrdAmtLessThanOrEqualTo(Integer value) {
            addCriterion("TOICH.ORD_AMT <=", value, "ordAmt");
            return (Criteria) this;
        }

        public Criteria andOrdAmtIn(List<Integer> values) {
            addCriterion("TOICH.ORD_AMT in", values, "ordAmt");
            return (Criteria) this;
        }

        public Criteria andOrdAmtNotIn(List<Integer> values) {
            addCriterion("TOICH.ORD_AMT not in", values, "ordAmt");
            return (Criteria) this;
        }

        public Criteria andOrdAmtBetween(Integer value1, Integer value2) {
            addCriterion("TOICH.ORD_AMT between", value1, value2, "ordAmt");
            return (Criteria) this;
        }

        public Criteria andOrdAmtNotBetween(Integer value1, Integer value2) {
            addCriterion("TOICH.ORD_AMT not between", value1, value2, "ordAmt");
            return (Criteria) this;
        }

        public Criteria andCpnDcAmtIsNull() {
            addCriterion("TOICH.CPN_DC_AMT is null");
            return (Criteria) this;
        }

        public Criteria andCpnDcAmtIsNotNull() {
            addCriterion("TOICH.CPN_DC_AMT is not null");
            return (Criteria) this;
        }

        public Criteria andCpnDcAmtEqualTo(Integer value) {
            addCriterion("TOICH.CPN_DC_AMT =", value, "cpnDcAmt");
            return (Criteria) this;
        }

        public Criteria andCpnDcAmtNotEqualTo(Integer value) {
            addCriterion("TOICH.CPN_DC_AMT <>", value, "cpnDcAmt");
            return (Criteria) this;
        }

        public Criteria andCpnDcAmtGreaterThan(Integer value) {
            addCriterion("TOICH.CPN_DC_AMT >", value, "cpnDcAmt");
            return (Criteria) this;
        }

        public Criteria andCpnDcAmtGreaterThanOrEqualTo(Integer value) {
            addCriterion("TOICH.CPN_DC_AMT >=", value, "cpnDcAmt");
            return (Criteria) this;
        }

        public Criteria andCpnDcAmtLessThan(Integer value) {
            addCriterion("TOICH.CPN_DC_AMT <", value, "cpnDcAmt");
            return (Criteria) this;
        }

        public Criteria andCpnDcAmtLessThanOrEqualTo(Integer value) {
            addCriterion("TOICH.CPN_DC_AMT <=", value, "cpnDcAmt");
            return (Criteria) this;
        }

        public Criteria andCpnDcAmtIn(List<Integer> values) {
            addCriterion("TOICH.CPN_DC_AMT in", values, "cpnDcAmt");
            return (Criteria) this;
        }

        public Criteria andCpnDcAmtNotIn(List<Integer> values) {
            addCriterion("TOICH.CPN_DC_AMT not in", values, "cpnDcAmt");
            return (Criteria) this;
        }

        public Criteria andCpnDcAmtBetween(Integer value1, Integer value2) {
            addCriterion("TOICH.CPN_DC_AMT between", value1, value2, "cpnDcAmt");
            return (Criteria) this;
        }

        public Criteria andCpnDcAmtNotBetween(Integer value1, Integer value2) {
            addCriterion("TOICH.CPN_DC_AMT not between", value1, value2, "cpnDcAmt");
            return (Criteria) this;
        }

        public Criteria andPtUseAmtIsNull() {
            addCriterion("TOICH.PT_USE_AMT is null");
            return (Criteria) this;
        }

        public Criteria andPtUseAmtIsNotNull() {
            addCriterion("TOICH.PT_USE_AMT is not null");
            return (Criteria) this;
        }

        public Criteria andPtUseAmtEqualTo(Integer value) {
            addCriterion("TOICH.PT_USE_AMT =", value, "ptUseAmt");
            return (Criteria) this;
        }

        public Criteria andPtUseAmtNotEqualTo(Integer value) {
            addCriterion("TOICH.PT_USE_AMT <>", value, "ptUseAmt");
            return (Criteria) this;
        }

        public Criteria andPtUseAmtGreaterThan(Integer value) {
            addCriterion("TOICH.PT_USE_AMT >", value, "ptUseAmt");
            return (Criteria) this;
        }

        public Criteria andPtUseAmtGreaterThanOrEqualTo(Integer value) {
            addCriterion("TOICH.PT_USE_AMT >=", value, "ptUseAmt");
            return (Criteria) this;
        }

        public Criteria andPtUseAmtLessThan(Integer value) {
            addCriterion("TOICH.PT_USE_AMT <", value, "ptUseAmt");
            return (Criteria) this;
        }

        public Criteria andPtUseAmtLessThanOrEqualTo(Integer value) {
            addCriterion("TOICH.PT_USE_AMT <=", value, "ptUseAmt");
            return (Criteria) this;
        }

        public Criteria andPtUseAmtIn(List<Integer> values) {
            addCriterion("TOICH.PT_USE_AMT in", values, "ptUseAmt");
            return (Criteria) this;
        }

        public Criteria andPtUseAmtNotIn(List<Integer> values) {
            addCriterion("TOICH.PT_USE_AMT not in", values, "ptUseAmt");
            return (Criteria) this;
        }

        public Criteria andPtUseAmtBetween(Integer value1, Integer value2) {
            addCriterion("TOICH.PT_USE_AMT between", value1, value2, "ptUseAmt");
            return (Criteria) this;
        }

        public Criteria andPtUseAmtNotBetween(Integer value1, Integer value2) {
            addCriterion("TOICH.PT_USE_AMT not between", value1, value2, "ptUseAmt");
            return (Criteria) this;
        }

        public Criteria andRealOrdAmtIsNull() {
            addCriterion("TOICH.REAL_ORD_AMT is null");
            return (Criteria) this;
        }

        public Criteria andRealOrdAmtIsNotNull() {
            addCriterion("TOICH.REAL_ORD_AMT is not null");
            return (Criteria) this;
        }

        public Criteria andRealOrdAmtEqualTo(Integer value) {
            addCriterion("TOICH.REAL_ORD_AMT =", value, "realOrdAmt");
            return (Criteria) this;
        }

        public Criteria andRealOrdAmtNotEqualTo(Integer value) {
            addCriterion("TOICH.REAL_ORD_AMT <>", value, "realOrdAmt");
            return (Criteria) this;
        }

        public Criteria andRealOrdAmtGreaterThan(Integer value) {
            addCriterion("TOICH.REAL_ORD_AMT >", value, "realOrdAmt");
            return (Criteria) this;
        }

        public Criteria andRealOrdAmtGreaterThanOrEqualTo(Integer value) {
            addCriterion("TOICH.REAL_ORD_AMT >=", value, "realOrdAmt");
            return (Criteria) this;
        }

        public Criteria andRealOrdAmtLessThan(Integer value) {
            addCriterion("TOICH.REAL_ORD_AMT <", value, "realOrdAmt");
            return (Criteria) this;
        }

        public Criteria andRealOrdAmtLessThanOrEqualTo(Integer value) {
            addCriterion("TOICH.REAL_ORD_AMT <=", value, "realOrdAmt");
            return (Criteria) this;
        }

        public Criteria andRealOrdAmtIn(List<Integer> values) {
            addCriterion("TOICH.REAL_ORD_AMT in", values, "realOrdAmt");
            return (Criteria) this;
        }

        public Criteria andRealOrdAmtNotIn(List<Integer> values) {
            addCriterion("TOICH.REAL_ORD_AMT not in", values, "realOrdAmt");
            return (Criteria) this;
        }

        public Criteria andRealOrdAmtBetween(Integer value1, Integer value2) {
            addCriterion("TOICH.REAL_ORD_AMT between", value1, value2, "realOrdAmt");
            return (Criteria) this;
        }

        public Criteria andRealOrdAmtNotBetween(Integer value1, Integer value2) {
            addCriterion("TOICH.REAL_ORD_AMT not between", value1, value2, "realOrdAmt");
            return (Criteria) this;
        }

        public Criteria andRealPayAmtIsNull() {
            addCriterion("TOICH.REAL_PAY_AMT is null");
            return (Criteria) this;
        }

        public Criteria andRealPayAmtIsNotNull() {
            addCriterion("TOICH.REAL_PAY_AMT is not null");
            return (Criteria) this;
        }

        public Criteria andRealPayAmtEqualTo(Integer value) {
            addCriterion("TOICH.REAL_PAY_AMT =", value, "realPayAmt");
            return (Criteria) this;
        }

        public Criteria andRealPayAmtNotEqualTo(Integer value) {
            addCriterion("TOICH.REAL_PAY_AMT <>", value, "realPayAmt");
            return (Criteria) this;
        }

        public Criteria andRealPayAmtGreaterThan(Integer value) {
            addCriterion("TOICH.REAL_PAY_AMT >", value, "realPayAmt");
            return (Criteria) this;
        }

        public Criteria andRealPayAmtGreaterThanOrEqualTo(Integer value) {
            addCriterion("TOICH.REAL_PAY_AMT >=", value, "realPayAmt");
            return (Criteria) this;
        }

        public Criteria andRealPayAmtLessThan(Integer value) {
            addCriterion("TOICH.REAL_PAY_AMT <", value, "realPayAmt");
            return (Criteria) this;
        }

        public Criteria andRealPayAmtLessThanOrEqualTo(Integer value) {
            addCriterion("TOICH.REAL_PAY_AMT <=", value, "realPayAmt");
            return (Criteria) this;
        }

        public Criteria andRealPayAmtIn(List<Integer> values) {
            addCriterion("TOICH.REAL_PAY_AMT in", values, "realPayAmt");
            return (Criteria) this;
        }

        public Criteria andRealPayAmtNotIn(List<Integer> values) {
            addCriterion("TOICH.REAL_PAY_AMT not in", values, "realPayAmt");
            return (Criteria) this;
        }

        public Criteria andRealPayAmtBetween(Integer value1, Integer value2) {
            addCriterion("TOICH.REAL_PAY_AMT between", value1, value2, "realPayAmt");
            return (Criteria) this;
        }

        public Criteria andRealPayAmtNotBetween(Integer value1, Integer value2) {
            addCriterion("TOICH.REAL_PAY_AMT not between", value1, value2, "realPayAmt");
            return (Criteria) this;
        }

        public Criteria andPtTpCdIsNull() {
            addCriterion("TOICH.PT_TP_CD is null");
            return (Criteria) this;
        }

        public Criteria andPtTpCdIsNotNull() {
            addCriterion("TOICH.PT_TP_CD is not null");
            return (Criteria) this;
        }

        public Criteria andPtTpCdEqualTo(String value) {
            addCriterion("TOICH.PT_TP_CD =", value, "ptTpCd");
            return (Criteria) this;
        }

        public Criteria andPtTpCdNotEqualTo(String value) {
            addCriterion("TOICH.PT_TP_CD <>", value, "ptTpCd");
            return (Criteria) this;
        }

        public Criteria andPtTpCdGreaterThan(String value) {
            addCriterion("TOICH.PT_TP_CD >", value, "ptTpCd");
            return (Criteria) this;
        }

        public Criteria andPtTpCdGreaterThanOrEqualTo(String value) {
            addCriterion("TOICH.PT_TP_CD >=", value, "ptTpCd");
            return (Criteria) this;
        }

        public Criteria andPtTpCdLessThan(String value) {
            addCriterion("TOICH.PT_TP_CD <", value, "ptTpCd");
            return (Criteria) this;
        }

        public Criteria andPtTpCdLessThanOrEqualTo(String value) {
            addCriterion("TOICH.PT_TP_CD <=", value, "ptTpCd");
            return (Criteria) this;
        }

        public Criteria andPtTpCdLike(String value) {
            addCriterion("TOICH.PT_TP_CD like", value, "ptTpCd");
            return (Criteria) this;
        }

        public Criteria andPtTpCdNotLike(String value) {
            addCriterion("TOICH.PT_TP_CD not like", value, "ptTpCd");
            return (Criteria) this;
        }

        public Criteria andPtTpCdIn(List<String> values) {
            addCriterion("TOICH.PT_TP_CD in", values, "ptTpCd");
            return (Criteria) this;
        }

        public Criteria andPtTpCdNotIn(List<String> values) {
            addCriterion("TOICH.PT_TP_CD not in", values, "ptTpCd");
            return (Criteria) this;
        }

        public Criteria andPtTpCdBetween(String value1, String value2) {
            addCriterion("TOICH.PT_TP_CD between", value1, value2, "ptTpCd");
            return (Criteria) this;
        }

        public Criteria andPtTpCdNotBetween(String value1, String value2) {
            addCriterion("TOICH.PT_TP_CD not between", value1, value2, "ptTpCd");
            return (Criteria) this;
        }

        public Criteria andPtSaveYnIsNull() {
            addCriterion("TOICH.PT_SAVE_YN is null");
            return (Criteria) this;
        }

        public Criteria andPtSaveYnIsNotNull() {
            addCriterion("TOICH.PT_SAVE_YN is not null");
            return (Criteria) this;
        }

        public Criteria andPtSaveYnEqualTo(String value) {
            addCriterion("TOICH.PT_SAVE_YN =", value, "ptSaveYn");
            return (Criteria) this;
        }

        public Criteria andPtSaveYnNotEqualTo(String value) {
            addCriterion("TOICH.PT_SAVE_YN <>", value, "ptSaveYn");
            return (Criteria) this;
        }

        public Criteria andPtSaveYnGreaterThan(String value) {
            addCriterion("TOICH.PT_SAVE_YN >", value, "ptSaveYn");
            return (Criteria) this;
        }

        public Criteria andPtSaveYnGreaterThanOrEqualTo(String value) {
            addCriterion("TOICH.PT_SAVE_YN >=", value, "ptSaveYn");
            return (Criteria) this;
        }

        public Criteria andPtSaveYnLessThan(String value) {
            addCriterion("TOICH.PT_SAVE_YN <", value, "ptSaveYn");
            return (Criteria) this;
        }

        public Criteria andPtSaveYnLessThanOrEqualTo(String value) {
            addCriterion("TOICH.PT_SAVE_YN <=", value, "ptSaveYn");
            return (Criteria) this;
        }

        public Criteria andPtSaveYnLike(String value) {
            addCriterion("TOICH.PT_SAVE_YN like", value, "ptSaveYn");
            return (Criteria) this;
        }

        public Criteria andPtSaveYnNotLike(String value) {
            addCriterion("TOICH.PT_SAVE_YN not like", value, "ptSaveYn");
            return (Criteria) this;
        }

        public Criteria andPtSaveYnIn(List<String> values) {
            addCriterion("TOICH.PT_SAVE_YN in", values, "ptSaveYn");
            return (Criteria) this;
        }

        public Criteria andPtSaveYnNotIn(List<String> values) {
            addCriterion("TOICH.PT_SAVE_YN not in", values, "ptSaveYn");
            return (Criteria) this;
        }

        public Criteria andPtSaveYnBetween(String value1, String value2) {
            addCriterion("TOICH.PT_SAVE_YN between", value1, value2, "ptSaveYn");
            return (Criteria) this;
        }

        public Criteria andPtSaveYnNotBetween(String value1, String value2) {
            addCriterion("TOICH.PT_SAVE_YN not between", value1, value2, "ptSaveYn");
            return (Criteria) this;
        }

        public Criteria andPtSaveRateIsNull() {
            addCriterion("TOICH.PT_SAVE_RATE is null");
            return (Criteria) this;
        }

        public Criteria andPtSaveRateIsNotNull() {
            addCriterion("TOICH.PT_SAVE_RATE is not null");
            return (Criteria) this;
        }

        public Criteria andPtSaveRateEqualTo(BigDecimal value) {
            addCriterion("TOICH.PT_SAVE_RATE =", value, "ptSaveRate");
            return (Criteria) this;
        }

        public Criteria andPtSaveRateNotEqualTo(BigDecimal value) {
            addCriterion("TOICH.PT_SAVE_RATE <>", value, "ptSaveRate");
            return (Criteria) this;
        }

        public Criteria andPtSaveRateGreaterThan(BigDecimal value) {
            addCriterion("TOICH.PT_SAVE_RATE >", value, "ptSaveRate");
            return (Criteria) this;
        }

        public Criteria andPtSaveRateGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("TOICH.PT_SAVE_RATE >=", value, "ptSaveRate");
            return (Criteria) this;
        }

        public Criteria andPtSaveRateLessThan(BigDecimal value) {
            addCriterion("TOICH.PT_SAVE_RATE <", value, "ptSaveRate");
            return (Criteria) this;
        }

        public Criteria andPtSaveRateLessThanOrEqualTo(BigDecimal value) {
            addCriterion("TOICH.PT_SAVE_RATE <=", value, "ptSaveRate");
            return (Criteria) this;
        }

        public Criteria andPtSaveRateIn(List<BigDecimal> values) {
            addCriterion("TOICH.PT_SAVE_RATE in", values, "ptSaveRate");
            return (Criteria) this;
        }

        public Criteria andPtSaveRateNotIn(List<BigDecimal> values) {
            addCriterion("TOICH.PT_SAVE_RATE not in", values, "ptSaveRate");
            return (Criteria) this;
        }

        public Criteria andPtSaveRateBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TOICH.PT_SAVE_RATE between", value1, value2, "ptSaveRate");
            return (Criteria) this;
        }

        public Criteria andPtSaveRateNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TOICH.PT_SAVE_RATE not between", value1, value2, "ptSaveRate");
            return (Criteria) this;
        }

        public Criteria andPtSaveAmtIsNull() {
            addCriterion("TOICH.PT_SAVE_AMT is null");
            return (Criteria) this;
        }

        public Criteria andPtSaveAmtIsNotNull() {
            addCriterion("TOICH.PT_SAVE_AMT is not null");
            return (Criteria) this;
        }

        public Criteria andPtSaveAmtEqualTo(Integer value) {
            addCriterion("TOICH.PT_SAVE_AMT =", value, "ptSaveAmt");
            return (Criteria) this;
        }

        public Criteria andPtSaveAmtNotEqualTo(Integer value) {
            addCriterion("TOICH.PT_SAVE_AMT <>", value, "ptSaveAmt");
            return (Criteria) this;
        }

        public Criteria andPtSaveAmtGreaterThan(Integer value) {
            addCriterion("TOICH.PT_SAVE_AMT >", value, "ptSaveAmt");
            return (Criteria) this;
        }

        public Criteria andPtSaveAmtGreaterThanOrEqualTo(Integer value) {
            addCriterion("TOICH.PT_SAVE_AMT >=", value, "ptSaveAmt");
            return (Criteria) this;
        }

        public Criteria andPtSaveAmtLessThan(Integer value) {
            addCriterion("TOICH.PT_SAVE_AMT <", value, "ptSaveAmt");
            return (Criteria) this;
        }

        public Criteria andPtSaveAmtLessThanOrEqualTo(Integer value) {
            addCriterion("TOICH.PT_SAVE_AMT <=", value, "ptSaveAmt");
            return (Criteria) this;
        }

        public Criteria andPtSaveAmtIn(List<Integer> values) {
            addCriterion("TOICH.PT_SAVE_AMT in", values, "ptSaveAmt");
            return (Criteria) this;
        }

        public Criteria andPtSaveAmtNotIn(List<Integer> values) {
            addCriterion("TOICH.PT_SAVE_AMT not in", values, "ptSaveAmt");
            return (Criteria) this;
        }

        public Criteria andPtSaveAmtBetween(Integer value1, Integer value2) {
            addCriterion("TOICH.PT_SAVE_AMT between", value1, value2, "ptSaveAmt");
            return (Criteria) this;
        }

        public Criteria andPtSaveAmtNotBetween(Integer value1, Integer value2) {
            addCriterion("TOICH.PT_SAVE_AMT not between", value1, value2, "ptSaveAmt");
            return (Criteria) this;
        }

        public Criteria andPgSplyAmtIsNull() {
            addCriterion("TOICH.PG_SPLY_AMT is null");
            return (Criteria) this;
        }

        public Criteria andPgSplyAmtIsNotNull() {
            addCriterion("TOICH.PG_SPLY_AMT is not null");
            return (Criteria) this;
        }

        public Criteria andPgSplyAmtEqualTo(Integer value) {
            addCriterion("TOICH.PG_SPLY_AMT =", value, "pgSplyAmt");
            return (Criteria) this;
        }

        public Criteria andPgSplyAmtNotEqualTo(Integer value) {
            addCriterion("TOICH.PG_SPLY_AMT <>", value, "pgSplyAmt");
            return (Criteria) this;
        }

        public Criteria andPgSplyAmtGreaterThan(Integer value) {
            addCriterion("TOICH.PG_SPLY_AMT >", value, "pgSplyAmt");
            return (Criteria) this;
        }

        public Criteria andPgSplyAmtGreaterThanOrEqualTo(Integer value) {
            addCriterion("TOICH.PG_SPLY_AMT >=", value, "pgSplyAmt");
            return (Criteria) this;
        }

        public Criteria andPgSplyAmtLessThan(Integer value) {
            addCriterion("TOICH.PG_SPLY_AMT <", value, "pgSplyAmt");
            return (Criteria) this;
        }

        public Criteria andPgSplyAmtLessThanOrEqualTo(Integer value) {
            addCriterion("TOICH.PG_SPLY_AMT <=", value, "pgSplyAmt");
            return (Criteria) this;
        }

        public Criteria andPgSplyAmtIn(List<Integer> values) {
            addCriterion("TOICH.PG_SPLY_AMT in", values, "pgSplyAmt");
            return (Criteria) this;
        }

        public Criteria andPgSplyAmtNotIn(List<Integer> values) {
            addCriterion("TOICH.PG_SPLY_AMT not in", values, "pgSplyAmt");
            return (Criteria) this;
        }

        public Criteria andPgSplyAmtBetween(Integer value1, Integer value2) {
            addCriterion("TOICH.PG_SPLY_AMT between", value1, value2, "pgSplyAmt");
            return (Criteria) this;
        }

        public Criteria andPgSplyAmtNotBetween(Integer value1, Integer value2) {
            addCriterion("TOICH.PG_SPLY_AMT not between", value1, value2, "pgSplyAmt");
            return (Criteria) this;
        }

        public Criteria andPgVatAmtIsNull() {
            addCriterion("TOICH.PG_VAT_AMT is null");
            return (Criteria) this;
        }

        public Criteria andPgVatAmtIsNotNull() {
            addCriterion("TOICH.PG_VAT_AMT is not null");
            return (Criteria) this;
        }

        public Criteria andPgVatAmtEqualTo(Integer value) {
            addCriterion("TOICH.PG_VAT_AMT =", value, "pgVatAmt");
            return (Criteria) this;
        }

        public Criteria andPgVatAmtNotEqualTo(Integer value) {
            addCriterion("TOICH.PG_VAT_AMT <>", value, "pgVatAmt");
            return (Criteria) this;
        }

        public Criteria andPgVatAmtGreaterThan(Integer value) {
            addCriterion("TOICH.PG_VAT_AMT >", value, "pgVatAmt");
            return (Criteria) this;
        }

        public Criteria andPgVatAmtGreaterThanOrEqualTo(Integer value) {
            addCriterion("TOICH.PG_VAT_AMT >=", value, "pgVatAmt");
            return (Criteria) this;
        }

        public Criteria andPgVatAmtLessThan(Integer value) {
            addCriterion("TOICH.PG_VAT_AMT <", value, "pgVatAmt");
            return (Criteria) this;
        }

        public Criteria andPgVatAmtLessThanOrEqualTo(Integer value) {
            addCriterion("TOICH.PG_VAT_AMT <=", value, "pgVatAmt");
            return (Criteria) this;
        }

        public Criteria andPgVatAmtIn(List<Integer> values) {
            addCriterion("TOICH.PG_VAT_AMT in", values, "pgVatAmt");
            return (Criteria) this;
        }

        public Criteria andPgVatAmtNotIn(List<Integer> values) {
            addCriterion("TOICH.PG_VAT_AMT not in", values, "pgVatAmt");
            return (Criteria) this;
        }

        public Criteria andPgVatAmtBetween(Integer value1, Integer value2) {
            addCriterion("TOICH.PG_VAT_AMT between", value1, value2, "pgVatAmt");
            return (Criteria) this;
        }

        public Criteria andPgVatAmtNotBetween(Integer value1, Integer value2) {
            addCriterion("TOICH.PG_VAT_AMT not between", value1, value2, "pgVatAmt");
            return (Criteria) this;
        }

        public Criteria andPgTaxfreeAmtIsNull() {
            addCriterion("TOICH.PG_TAXFREE_AMT is null");
            return (Criteria) this;
        }

        public Criteria andPgTaxfreeAmtIsNotNull() {
            addCriterion("TOICH.PG_TAXFREE_AMT is not null");
            return (Criteria) this;
        }

        public Criteria andPgTaxfreeAmtEqualTo(Integer value) {
            addCriterion("TOICH.PG_TAXFREE_AMT =", value, "pgTaxfreeAmt");
            return (Criteria) this;
        }

        public Criteria andPgTaxfreeAmtNotEqualTo(Integer value) {
            addCriterion("TOICH.PG_TAXFREE_AMT <>", value, "pgTaxfreeAmt");
            return (Criteria) this;
        }

        public Criteria andPgTaxfreeAmtGreaterThan(Integer value) {
            addCriterion("TOICH.PG_TAXFREE_AMT >", value, "pgTaxfreeAmt");
            return (Criteria) this;
        }

        public Criteria andPgTaxfreeAmtGreaterThanOrEqualTo(Integer value) {
            addCriterion("TOICH.PG_TAXFREE_AMT >=", value, "pgTaxfreeAmt");
            return (Criteria) this;
        }

        public Criteria andPgTaxfreeAmtLessThan(Integer value) {
            addCriterion("TOICH.PG_TAXFREE_AMT <", value, "pgTaxfreeAmt");
            return (Criteria) this;
        }

        public Criteria andPgTaxfreeAmtLessThanOrEqualTo(Integer value) {
            addCriterion("TOICH.PG_TAXFREE_AMT <=", value, "pgTaxfreeAmt");
            return (Criteria) this;
        }

        public Criteria andPgTaxfreeAmtIn(List<Integer> values) {
            addCriterion("TOICH.PG_TAXFREE_AMT in", values, "pgTaxfreeAmt");
            return (Criteria) this;
        }

        public Criteria andPgTaxfreeAmtNotIn(List<Integer> values) {
            addCriterion("TOICH.PG_TAXFREE_AMT not in", values, "pgTaxfreeAmt");
            return (Criteria) this;
        }

        public Criteria andPgTaxfreeAmtBetween(Integer value1, Integer value2) {
            addCriterion("TOICH.PG_TAXFREE_AMT between", value1, value2, "pgTaxfreeAmt");
            return (Criteria) this;
        }

        public Criteria andPgTaxfreeAmtNotBetween(Integer value1, Integer value2) {
            addCriterion("TOICH.PG_TAXFREE_AMT not between", value1, value2, "pgTaxfreeAmt");
            return (Criteria) this;
        }

        public Criteria andOrdCfmSkdDtIsNull() {
            addCriterion("TOICH.ORD_CFM_SKD_DT is null");
            return (Criteria) this;
        }

        public Criteria andOrdCfmSkdDtIsNotNull() {
            addCriterion("TOICH.ORD_CFM_SKD_DT is not null");
            return (Criteria) this;
        }

        public Criteria andOrdCfmSkdDtEqualTo(Date value) {
            addCriterionForJDBCDate("TOICH.ORD_CFM_SKD_DT =", value, "ordCfmSkdDt");
            return (Criteria) this;
        }

        public Criteria andOrdCfmSkdDtNotEqualTo(Date value) {
            addCriterionForJDBCDate("TOICH.ORD_CFM_SKD_DT <>", value, "ordCfmSkdDt");
            return (Criteria) this;
        }

        public Criteria andOrdCfmSkdDtGreaterThan(Date value) {
            addCriterionForJDBCDate("TOICH.ORD_CFM_SKD_DT >", value, "ordCfmSkdDt");
            return (Criteria) this;
        }

        public Criteria andOrdCfmSkdDtGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("TOICH.ORD_CFM_SKD_DT >=", value, "ordCfmSkdDt");
            return (Criteria) this;
        }

        public Criteria andOrdCfmSkdDtLessThan(Date value) {
            addCriterionForJDBCDate("TOICH.ORD_CFM_SKD_DT <", value, "ordCfmSkdDt");
            return (Criteria) this;
        }

        public Criteria andOrdCfmSkdDtLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("TOICH.ORD_CFM_SKD_DT <=", value, "ordCfmSkdDt");
            return (Criteria) this;
        }

        public Criteria andOrdCfmSkdDtIn(List<Date> values) {
            addCriterionForJDBCDate("TOICH.ORD_CFM_SKD_DT in", values, "ordCfmSkdDt");
            return (Criteria) this;
        }

        public Criteria andOrdCfmSkdDtNotIn(List<Date> values) {
            addCriterionForJDBCDate("TOICH.ORD_CFM_SKD_DT not in", values, "ordCfmSkdDt");
            return (Criteria) this;
        }

        public Criteria andOrdCfmSkdDtBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("TOICH.ORD_CFM_SKD_DT between", value1, value2, "ordCfmSkdDt");
            return (Criteria) this;
        }

        public Criteria andOrdCfmSkdDtNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("TOICH.ORD_CFM_SKD_DT not between", value1, value2, "ordCfmSkdDt");
            return (Criteria) this;
        }

        public Criteria andOrdCfmDtIsNull() {
            addCriterion("TOICH.ORD_CFM_DT is null");
            return (Criteria) this;
        }

        public Criteria andOrdCfmDtIsNotNull() {
            addCriterion("TOICH.ORD_CFM_DT is not null");
            return (Criteria) this;
        }

        public Criteria andOrdCfmDtEqualTo(Date value) {
            addCriterionForJDBCDate("TOICH.ORD_CFM_DT =", value, "ordCfmDt");
            return (Criteria) this;
        }

        public Criteria andOrdCfmDtNotEqualTo(Date value) {
            addCriterionForJDBCDate("TOICH.ORD_CFM_DT <>", value, "ordCfmDt");
            return (Criteria) this;
        }

        public Criteria andOrdCfmDtGreaterThan(Date value) {
            addCriterionForJDBCDate("TOICH.ORD_CFM_DT >", value, "ordCfmDt");
            return (Criteria) this;
        }

        public Criteria andOrdCfmDtGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("TOICH.ORD_CFM_DT >=", value, "ordCfmDt");
            return (Criteria) this;
        }

        public Criteria andOrdCfmDtLessThan(Date value) {
            addCriterionForJDBCDate("TOICH.ORD_CFM_DT <", value, "ordCfmDt");
            return (Criteria) this;
        }

        public Criteria andOrdCfmDtLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("TOICH.ORD_CFM_DT <=", value, "ordCfmDt");
            return (Criteria) this;
        }

        public Criteria andOrdCfmDtIn(List<Date> values) {
            addCriterionForJDBCDate("TOICH.ORD_CFM_DT in", values, "ordCfmDt");
            return (Criteria) this;
        }

        public Criteria andOrdCfmDtNotIn(List<Date> values) {
            addCriterionForJDBCDate("TOICH.ORD_CFM_DT not in", values, "ordCfmDt");
            return (Criteria) this;
        }

        public Criteria andOrdCfmDtBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("TOICH.ORD_CFM_DT between", value1, value2, "ordCfmDt");
            return (Criteria) this;
        }

        public Criteria andOrdCfmDtNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("TOICH.ORD_CFM_DT not between", value1, value2, "ordCfmDt");
            return (Criteria) this;
        }

        public Criteria andOrdCfmIdIsNull() {
            addCriterion("TOICH.ORD_CFM_ID is null");
            return (Criteria) this;
        }

        public Criteria andOrdCfmIdIsNotNull() {
            addCriterion("TOICH.ORD_CFM_ID is not null");
            return (Criteria) this;
        }

        public Criteria andOrdCfmIdEqualTo(String value) {
            addCriterion("TOICH.ORD_CFM_ID =", value, "ordCfmId");
            return (Criteria) this;
        }

        public Criteria andOrdCfmIdNotEqualTo(String value) {
            addCriterion("TOICH.ORD_CFM_ID <>", value, "ordCfmId");
            return (Criteria) this;
        }

        public Criteria andOrdCfmIdGreaterThan(String value) {
            addCriterion("TOICH.ORD_CFM_ID >", value, "ordCfmId");
            return (Criteria) this;
        }

        public Criteria andOrdCfmIdGreaterThanOrEqualTo(String value) {
            addCriterion("TOICH.ORD_CFM_ID >=", value, "ordCfmId");
            return (Criteria) this;
        }

        public Criteria andOrdCfmIdLessThan(String value) {
            addCriterion("TOICH.ORD_CFM_ID <", value, "ordCfmId");
            return (Criteria) this;
        }

        public Criteria andOrdCfmIdLessThanOrEqualTo(String value) {
            addCriterion("TOICH.ORD_CFM_ID <=", value, "ordCfmId");
            return (Criteria) this;
        }

        public Criteria andOrdCfmIdLike(String value) {
            addCriterion("TOICH.ORD_CFM_ID like", value, "ordCfmId");
            return (Criteria) this;
        }

        public Criteria andOrdCfmIdNotLike(String value) {
            addCriterion("TOICH.ORD_CFM_ID not like", value, "ordCfmId");
            return (Criteria) this;
        }

        public Criteria andOrdCfmIdIn(List<String> values) {
            addCriterion("TOICH.ORD_CFM_ID in", values, "ordCfmId");
            return (Criteria) this;
        }

        public Criteria andOrdCfmIdNotIn(List<String> values) {
            addCriterion("TOICH.ORD_CFM_ID not in", values, "ordCfmId");
            return (Criteria) this;
        }

        public Criteria andOrdCfmIdBetween(String value1, String value2) {
            addCriterion("TOICH.ORD_CFM_ID between", value1, value2, "ordCfmId");
            return (Criteria) this;
        }

        public Criteria andOrdCfmIdNotBetween(String value1, String value2) {
            addCriterion("TOICH.ORD_CFM_ID not between", value1, value2, "ordCfmId");
            return (Criteria) this;
        }

        public Criteria andOrdCfmSndYnIsNull() {
            addCriterion("TOICH.ORD_CFM_SND_YN is null");
            return (Criteria) this;
        }

        public Criteria andOrdCfmSndYnIsNotNull() {
            addCriterion("TOICH.ORD_CFM_SND_YN is not null");
            return (Criteria) this;
        }

        public Criteria andOrdCfmSndYnEqualTo(String value) {
            addCriterion("TOICH.ORD_CFM_SND_YN =", value, "ordCfmSndYn");
            return (Criteria) this;
        }

        public Criteria andOrdCfmSndYnNotEqualTo(String value) {
            addCriterion("TOICH.ORD_CFM_SND_YN <>", value, "ordCfmSndYn");
            return (Criteria) this;
        }

        public Criteria andOrdCfmSndYnGreaterThan(String value) {
            addCriterion("TOICH.ORD_CFM_SND_YN >", value, "ordCfmSndYn");
            return (Criteria) this;
        }

        public Criteria andOrdCfmSndYnGreaterThanOrEqualTo(String value) {
            addCriterion("TOICH.ORD_CFM_SND_YN >=", value, "ordCfmSndYn");
            return (Criteria) this;
        }

        public Criteria andOrdCfmSndYnLessThan(String value) {
            addCriterion("TOICH.ORD_CFM_SND_YN <", value, "ordCfmSndYn");
            return (Criteria) this;
        }

        public Criteria andOrdCfmSndYnLessThanOrEqualTo(String value) {
            addCriterion("TOICH.ORD_CFM_SND_YN <=", value, "ordCfmSndYn");
            return (Criteria) this;
        }

        public Criteria andOrdCfmSndYnLike(String value) {
            addCriterion("TOICH.ORD_CFM_SND_YN like", value, "ordCfmSndYn");
            return (Criteria) this;
        }

        public Criteria andOrdCfmSndYnNotLike(String value) {
            addCriterion("TOICH.ORD_CFM_SND_YN not like", value, "ordCfmSndYn");
            return (Criteria) this;
        }

        public Criteria andOrdCfmSndYnIn(List<String> values) {
            addCriterion("TOICH.ORD_CFM_SND_YN in", values, "ordCfmSndYn");
            return (Criteria) this;
        }

        public Criteria andOrdCfmSndYnNotIn(List<String> values) {
            addCriterion("TOICH.ORD_CFM_SND_YN not in", values, "ordCfmSndYn");
            return (Criteria) this;
        }

        public Criteria andOrdCfmSndYnBetween(String value1, String value2) {
            addCriterion("TOICH.ORD_CFM_SND_YN between", value1, value2, "ordCfmSndYn");
            return (Criteria) this;
        }

        public Criteria andOrdCfmSndYnNotBetween(String value1, String value2) {
            addCriterion("TOICH.ORD_CFM_SND_YN not between", value1, value2, "ordCfmSndYn");
            return (Criteria) this;
        }

        public Criteria andSettlStatCdIsNull() {
            addCriterion("TOICH.SETTL_STAT_CD is null");
            return (Criteria) this;
        }

        public Criteria andSettlStatCdIsNotNull() {
            addCriterion("TOICH.SETTL_STAT_CD is not null");
            return (Criteria) this;
        }

        public Criteria andSettlStatCdEqualTo(String value) {
            addCriterion("TOICH.SETTL_STAT_CD =", value, "settlStatCd");
            return (Criteria) this;
        }

        public Criteria andSettlStatCdNotEqualTo(String value) {
            addCriterion("TOICH.SETTL_STAT_CD <>", value, "settlStatCd");
            return (Criteria) this;
        }

        public Criteria andSettlStatCdGreaterThan(String value) {
            addCriterion("TOICH.SETTL_STAT_CD >", value, "settlStatCd");
            return (Criteria) this;
        }

        public Criteria andSettlStatCdGreaterThanOrEqualTo(String value) {
            addCriterion("TOICH.SETTL_STAT_CD >=", value, "settlStatCd");
            return (Criteria) this;
        }

        public Criteria andSettlStatCdLessThan(String value) {
            addCriterion("TOICH.SETTL_STAT_CD <", value, "settlStatCd");
            return (Criteria) this;
        }

        public Criteria andSettlStatCdLessThanOrEqualTo(String value) {
            addCriterion("TOICH.SETTL_STAT_CD <=", value, "settlStatCd");
            return (Criteria) this;
        }

        public Criteria andSettlStatCdLike(String value) {
            addCriterion("TOICH.SETTL_STAT_CD like", value, "settlStatCd");
            return (Criteria) this;
        }

        public Criteria andSettlStatCdNotLike(String value) {
            addCriterion("TOICH.SETTL_STAT_CD not like", value, "settlStatCd");
            return (Criteria) this;
        }

        public Criteria andSettlStatCdIn(List<String> values) {
            addCriterion("TOICH.SETTL_STAT_CD in", values, "settlStatCd");
            return (Criteria) this;
        }

        public Criteria andSettlStatCdNotIn(List<String> values) {
            addCriterion("TOICH.SETTL_STAT_CD not in", values, "settlStatCd");
            return (Criteria) this;
        }

        public Criteria andSettlStatCdBetween(String value1, String value2) {
            addCriterion("TOICH.SETTL_STAT_CD between", value1, value2, "settlStatCd");
            return (Criteria) this;
        }

        public Criteria andSettlStatCdNotBetween(String value1, String value2) {
            addCriterion("TOICH.SETTL_STAT_CD not between", value1, value2, "settlStatCd");
            return (Criteria) this;
        }

        public Criteria andSettlYmdIsNull() {
            addCriterion("TOICH.SETTL_YMD is null");
            return (Criteria) this;
        }

        public Criteria andSettlYmdIsNotNull() {
            addCriterion("TOICH.SETTL_YMD is not null");
            return (Criteria) this;
        }

        public Criteria andSettlYmdEqualTo(String value) {
            addCriterion("TOICH.SETTL_YMD =", value, "settlYmd");
            return (Criteria) this;
        }

        public Criteria andSettlYmdNotEqualTo(String value) {
            addCriterion("TOICH.SETTL_YMD <>", value, "settlYmd");
            return (Criteria) this;
        }

        public Criteria andSettlYmdGreaterThan(String value) {
            addCriterion("TOICH.SETTL_YMD >", value, "settlYmd");
            return (Criteria) this;
        }

        public Criteria andSettlYmdGreaterThanOrEqualTo(String value) {
            addCriterion("TOICH.SETTL_YMD >=", value, "settlYmd");
            return (Criteria) this;
        }

        public Criteria andSettlYmdLessThan(String value) {
            addCriterion("TOICH.SETTL_YMD <", value, "settlYmd");
            return (Criteria) this;
        }

        public Criteria andSettlYmdLessThanOrEqualTo(String value) {
            addCriterion("TOICH.SETTL_YMD <=", value, "settlYmd");
            return (Criteria) this;
        }

        public Criteria andSettlYmdLike(String value) {
            addCriterion("TOICH.SETTL_YMD like", value, "settlYmd");
            return (Criteria) this;
        }

        public Criteria andSettlYmdNotLike(String value) {
            addCriterion("TOICH.SETTL_YMD not like", value, "settlYmd");
            return (Criteria) this;
        }

        public Criteria andSettlYmdIn(List<String> values) {
            addCriterion("TOICH.SETTL_YMD in", values, "settlYmd");
            return (Criteria) this;
        }

        public Criteria andSettlYmdNotIn(List<String> values) {
            addCriterion("TOICH.SETTL_YMD not in", values, "settlYmd");
            return (Criteria) this;
        }

        public Criteria andSettlYmdBetween(String value1, String value2) {
            addCriterion("TOICH.SETTL_YMD between", value1, value2, "settlYmd");
            return (Criteria) this;
        }

        public Criteria andSettlYmdNotBetween(String value1, String value2) {
            addCriterion("TOICH.SETTL_YMD not between", value1, value2, "settlYmd");
            return (Criteria) this;
        }

        public Criteria andSettlPgYmdIsNull() {
            addCriterion("TOICH.SETTL_PG_YMD is null");
            return (Criteria) this;
        }

        public Criteria andSettlPgYmdIsNotNull() {
            addCriterion("TOICH.SETTL_PG_YMD is not null");
            return (Criteria) this;
        }

        public Criteria andSettlPgYmdEqualTo(String value) {
            addCriterion("TOICH.SETTL_PG_YMD =", value, "settlPgYmd");
            return (Criteria) this;
        }

        public Criteria andSettlPgYmdNotEqualTo(String value) {
            addCriterion("TOICH.SETTL_PG_YMD <>", value, "settlPgYmd");
            return (Criteria) this;
        }

        public Criteria andSettlPgYmdGreaterThan(String value) {
            addCriterion("TOICH.SETTL_PG_YMD >", value, "settlPgYmd");
            return (Criteria) this;
        }

        public Criteria andSettlPgYmdGreaterThanOrEqualTo(String value) {
            addCriterion("TOICH.SETTL_PG_YMD >=", value, "settlPgYmd");
            return (Criteria) this;
        }

        public Criteria andSettlPgYmdLessThan(String value) {
            addCriterion("TOICH.SETTL_PG_YMD <", value, "settlPgYmd");
            return (Criteria) this;
        }

        public Criteria andSettlPgYmdLessThanOrEqualTo(String value) {
            addCriterion("TOICH.SETTL_PG_YMD <=", value, "settlPgYmd");
            return (Criteria) this;
        }

        public Criteria andSettlPgYmdLike(String value) {
            addCriterion("TOICH.SETTL_PG_YMD like", value, "settlPgYmd");
            return (Criteria) this;
        }

        public Criteria andSettlPgYmdNotLike(String value) {
            addCriterion("TOICH.SETTL_PG_YMD not like", value, "settlPgYmd");
            return (Criteria) this;
        }

        public Criteria andSettlPgYmdIn(List<String> values) {
            addCriterion("TOICH.SETTL_PG_YMD in", values, "settlPgYmd");
            return (Criteria) this;
        }

        public Criteria andSettlPgYmdNotIn(List<String> values) {
            addCriterion("TOICH.SETTL_PG_YMD not in", values, "settlPgYmd");
            return (Criteria) this;
        }

        public Criteria andSettlPgYmdBetween(String value1, String value2) {
            addCriterion("TOICH.SETTL_PG_YMD between", value1, value2, "settlPgYmd");
            return (Criteria) this;
        }

        public Criteria andSettlPgYmdNotBetween(String value1, String value2) {
            addCriterion("TOICH.SETTL_PG_YMD not between", value1, value2, "settlPgYmd");
            return (Criteria) this;
        }

        public Criteria andRegDtIsNull() {
            addCriterion("TOICH.REG_DT is null");
            return (Criteria) this;
        }

        public Criteria andRegDtIsNotNull() {
            addCriterion("TOICH.REG_DT is not null");
            return (Criteria) this;
        }

        public Criteria andRegDtEqualTo(Date value) {
            addCriterion("TOICH.REG_DT =", value, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtNotEqualTo(Date value) {
            addCriterion("TOICH.REG_DT <>", value, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtGreaterThan(Date value) {
            addCriterion("TOICH.REG_DT >", value, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtGreaterThanOrEqualTo(Date value) {
            addCriterion("TOICH.REG_DT >=", value, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtLessThan(Date value) {
            addCriterion("TOICH.REG_DT <", value, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtLessThanOrEqualTo(Date value) {
            addCriterion("TOICH.REG_DT <=", value, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtIn(List<Date> values) {
            addCriterion("TOICH.REG_DT in", values, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtNotIn(List<Date> values) {
            addCriterion("TOICH.REG_DT not in", values, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtBetween(Date value1, Date value2) {
            addCriterion("TOICH.REG_DT between", value1, value2, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtNotBetween(Date value1, Date value2) {
            addCriterion("TOICH.REG_DT not between", value1, value2, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegIdIsNull() {
            addCriterion("TOICH.REG_ID is null");
            return (Criteria) this;
        }

        public Criteria andRegIdIsNotNull() {
            addCriterion("TOICH.REG_ID is not null");
            return (Criteria) this;
        }

        public Criteria andRegIdEqualTo(String value) {
            addCriterion("TOICH.REG_ID =", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdNotEqualTo(String value) {
            addCriterion("TOICH.REG_ID <>", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdGreaterThan(String value) {
            addCriterion("TOICH.REG_ID >", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdGreaterThanOrEqualTo(String value) {
            addCriterion("TOICH.REG_ID >=", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdLessThan(String value) {
            addCriterion("TOICH.REG_ID <", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdLessThanOrEqualTo(String value) {
            addCriterion("TOICH.REG_ID <=", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdLike(String value) {
            addCriterion("TOICH.REG_ID like", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdNotLike(String value) {
            addCriterion("TOICH.REG_ID not like", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdIn(List<String> values) {
            addCriterion("TOICH.REG_ID in", values, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdNotIn(List<String> values) {
            addCriterion("TOICH.REG_ID not in", values, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdBetween(String value1, String value2) {
            addCriterion("TOICH.REG_ID between", value1, value2, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdNotBetween(String value1, String value2) {
            addCriterion("TOICH.REG_ID not between", value1, value2, "regId");
            return (Criteria) this;
        }

        public Criteria andModDtIsNull() {
            addCriterion("TOICH.MOD_DT is null");
            return (Criteria) this;
        }

        public Criteria andModDtIsNotNull() {
            addCriterion("TOICH.MOD_DT is not null");
            return (Criteria) this;
        }

        public Criteria andModDtEqualTo(Date value) {
            addCriterion("TOICH.MOD_DT =", value, "modDt");
            return (Criteria) this;
        }

        public Criteria andModDtNotEqualTo(Date value) {
            addCriterion("TOICH.MOD_DT <>", value, "modDt");
            return (Criteria) this;
        }

        public Criteria andModDtGreaterThan(Date value) {
            addCriterion("TOICH.MOD_DT >", value, "modDt");
            return (Criteria) this;
        }

        public Criteria andModDtGreaterThanOrEqualTo(Date value) {
            addCriterion("TOICH.MOD_DT >=", value, "modDt");
            return (Criteria) this;
        }

        public Criteria andModDtLessThan(Date value) {
            addCriterion("TOICH.MOD_DT <", value, "modDt");
            return (Criteria) this;
        }

        public Criteria andModDtLessThanOrEqualTo(Date value) {
            addCriterion("TOICH.MOD_DT <=", value, "modDt");
            return (Criteria) this;
        }

        public Criteria andModDtIn(List<Date> values) {
            addCriterion("TOICH.MOD_DT in", values, "modDt");
            return (Criteria) this;
        }

        public Criteria andModDtNotIn(List<Date> values) {
            addCriterion("TOICH.MOD_DT not in", values, "modDt");
            return (Criteria) this;
        }

        public Criteria andModDtBetween(Date value1, Date value2) {
            addCriterion("TOICH.MOD_DT between", value1, value2, "modDt");
            return (Criteria) this;
        }

        public Criteria andModDtNotBetween(Date value1, Date value2) {
            addCriterion("TOICH.MOD_DT not between", value1, value2, "modDt");
            return (Criteria) this;
        }

        public Criteria andModIdIsNull() {
            addCriterion("TOICH.MOD_ID is null");
            return (Criteria) this;
        }

        public Criteria andModIdIsNotNull() {
            addCriterion("TOICH.MOD_ID is not null");
            return (Criteria) this;
        }

        public Criteria andModIdEqualTo(String value) {
            addCriterion("TOICH.MOD_ID =", value, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdNotEqualTo(String value) {
            addCriterion("TOICH.MOD_ID <>", value, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdGreaterThan(String value) {
            addCriterion("TOICH.MOD_ID >", value, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdGreaterThanOrEqualTo(String value) {
            addCriterion("TOICH.MOD_ID >=", value, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdLessThan(String value) {
            addCriterion("TOICH.MOD_ID <", value, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdLessThanOrEqualTo(String value) {
            addCriterion("TOICH.MOD_ID <=", value, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdLike(String value) {
            addCriterion("TOICH.MOD_ID like", value, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdNotLike(String value) {
            addCriterion("TOICH.MOD_ID not like", value, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdIn(List<String> values) {
            addCriterion("TOICH.MOD_ID in", values, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdNotIn(List<String> values) {
            addCriterion("TOICH.MOD_ID not in", values, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdBetween(String value1, String value2) {
            addCriterion("TOICH.MOD_ID between", value1, value2, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdNotBetween(String value1, String value2) {
            addCriterion("TOICH.MOD_ID not between", value1, value2, "modId");
            return (Criteria) this;
        }

        public Criteria andOrdItemNoLikeInsensitive(String value) {
            addCriterion("upper(TOICH.ORD_ITEM_NO) like", value.toUpperCase(), "ordItemNo");
            return (Criteria) this;
        }

        public Criteria andOrdItemStatCdLikeInsensitive(String value) {
            addCriterion("upper(TOICH.ORD_ITEM_STAT_CD) like", value.toUpperCase(), "ordItemStatCd");
            return (Criteria) this;
        }

        public Criteria andNowOrdItemStatCdLikeInsensitive(String value) {
            addCriterion("upper(TOICH.NOW_ORD_ITEM_STAT_CD) like", value.toUpperCase(), "nowOrdItemStatCd");
            return (Criteria) this;
        }

        public Criteria andItemTpCdLikeInsensitive(String value) {
            addCriterion("upper(TOICH.ITEM_TP_CD) like", value.toUpperCase(), "itemTpCd");
            return (Criteria) this;
        }

        public Criteria andItemCdLikeInsensitive(String value) {
            addCriterion("upper(TOICH.ITEM_CD) like", value.toUpperCase(), "itemCd");
            return (Criteria) this;
        }

        public Criteria andSsgCdLikeInsensitive(String value) {
            addCriterion("upper(TOICH.SSG_CD) like", value.toUpperCase(), "ssgCd");
            return (Criteria) this;
        }

        public Criteria andItemNmLikeInsensitive(String value) {
            addCriterion("upper(TOICH.ITEM_NM) like", value.toUpperCase(), "itemNm");
            return (Criteria) this;
        }

        public Criteria andItemOptNmLikeInsensitive(String value) {
            addCriterion("upper(TOICH.ITEM_OPT_NM) like", value.toUpperCase(), "itemOptNm");
            return (Criteria) this;
        }

        public Criteria andSetItemNmLikeInsensitive(String value) {
            addCriterion("upper(TOICH.SET_ITEM_NM) like", value.toUpperCase(), "setItemNm");
            return (Criteria) this;
        }

        public Criteria andItemAttrTpCdLikeInsensitive(String value) {
            addCriterion("upper(TOICH.ITEM_ATTR_TP_CD) like", value.toUpperCase(), "itemAttrTpCd");
            return (Criteria) this;
        }

        public Criteria andItemTaxClCdLikeInsensitive(String value) {
            addCriterion("upper(TOICH.ITEM_TAX_CL_CD) like", value.toUpperCase(), "itemTaxClCd");
            return (Criteria) this;
        }

        public Criteria andItemCpnUsePsblYnLikeInsensitive(String value) {
            addCriterion("upper(TOICH.ITEM_CPN_USE_PSBL_YN) like", value.toUpperCase(), "itemCpnUsePsblYn");
            return (Criteria) this;
        }

        public Criteria andItemPtSaveTpCdLikeInsensitive(String value) {
            addCriterion("upper(TOICH.ITEM_PT_SAVE_TP_CD) like", value.toUpperCase(), "itemPtSaveTpCd");
            return (Criteria) this;
        }

        public Criteria andItemPtSaveMethCdLikeInsensitive(String value) {
            addCriterion("upper(TOICH.ITEM_PT_SAVE_METH_CD) like", value.toUpperCase(), "itemPtSaveMethCd");
            return (Criteria) this;
        }

        public Criteria andItemCstmdYnLikeInsensitive(String value) {
            addCriterion("upper(TOICH.ITEM_CSTMD_YN) like", value.toUpperCase(), "itemCstmdYn");
            return (Criteria) this;
        }

        public Criteria andItemPrcTpCdLikeInsensitive(String value) {
            addCriterion("upper(TOICH.ITEM_PRC_TP_CD) like", value.toUpperCase(), "itemPrcTpCd");
            return (Criteria) this;
        }

        public Criteria andPtTpCdLikeInsensitive(String value) {
            addCriterion("upper(TOICH.PT_TP_CD) like", value.toUpperCase(), "ptTpCd");
            return (Criteria) this;
        }

        public Criteria andPtSaveYnLikeInsensitive(String value) {
            addCriterion("upper(TOICH.PT_SAVE_YN) like", value.toUpperCase(), "ptSaveYn");
            return (Criteria) this;
        }

        public Criteria andOrdCfmIdLikeInsensitive(String value) {
            addCriterion("upper(TOICH.ORD_CFM_ID) like", value.toUpperCase(), "ordCfmId");
            return (Criteria) this;
        }

        public Criteria andOrdCfmSndYnLikeInsensitive(String value) {
            addCriterion("upper(TOICH.ORD_CFM_SND_YN) like", value.toUpperCase(), "ordCfmSndYn");
            return (Criteria) this;
        }

        public Criteria andSettlStatCdLikeInsensitive(String value) {
            addCriterion("upper(TOICH.SETTL_STAT_CD) like", value.toUpperCase(), "settlStatCd");
            return (Criteria) this;
        }

        public Criteria andSettlYmdLikeInsensitive(String value) {
            addCriterion("upper(TOICH.SETTL_YMD) like", value.toUpperCase(), "settlYmd");
            return (Criteria) this;
        }

        public Criteria andSettlPgYmdLikeInsensitive(String value) {
            addCriterion("upper(TOICH.SETTL_PG_YMD) like", value.toUpperCase(), "settlPgYmd");
            return (Criteria) this;
        }

        public Criteria andRegIdLikeInsensitive(String value) {
            addCriterion("upper(TOICH.REG_ID) like", value.toUpperCase(), "regId");
            return (Criteria) this;
        }

        public Criteria andModIdLikeInsensitive(String value) {
            addCriterion("upper(TOICH.MOD_ID) like", value.toUpperCase(), "modId");
            return (Criteria) this;
        }

        public Criteria andOrdItemNoLikeLeft(String value) {
            addCriterion("TOICH.ORD_ITEM_NO like ", "%" + value, "ordItemNo");
            return (Criteria) this;
        }

        public Criteria andOrdItemNoLikeRight(String value) {
            addCriterion("TOICH.ORD_ITEM_NO like ", value + "%", "ordItemNo");
            return (Criteria) this;
        }

        public Criteria andOrdItemNoLikeBoth(String value) {
            addCriterion("TOICH.ORD_ITEM_NO like ", "%" + value + "%", "ordItemNo");
            return (Criteria) this;
        }

        public Criteria andOrdItemStatCdLikeLeft(String value) {
            addCriterion("TOICH.ORD_ITEM_STAT_CD like ", "%" + value, "ordItemStatCd");
            return (Criteria) this;
        }

        public Criteria andOrdItemStatCdLikeRight(String value) {
            addCriterion("TOICH.ORD_ITEM_STAT_CD like ", value + "%", "ordItemStatCd");
            return (Criteria) this;
        }

        public Criteria andOrdItemStatCdLikeBoth(String value) {
            addCriterion("TOICH.ORD_ITEM_STAT_CD like ", "%" + value + "%", "ordItemStatCd");
            return (Criteria) this;
        }

        public Criteria andNowOrdItemStatCdLikeLeft(String value) {
            addCriterion("TOICH.NOW_ORD_ITEM_STAT_CD like ", "%" + value, "nowOrdItemStatCd");
            return (Criteria) this;
        }

        public Criteria andNowOrdItemStatCdLikeRight(String value) {
            addCriterion("TOICH.NOW_ORD_ITEM_STAT_CD like ", value + "%", "nowOrdItemStatCd");
            return (Criteria) this;
        }

        public Criteria andNowOrdItemStatCdLikeBoth(String value) {
            addCriterion("TOICH.NOW_ORD_ITEM_STAT_CD like ", "%" + value + "%", "nowOrdItemStatCd");
            return (Criteria) this;
        }

        public Criteria andItemTpCdLikeLeft(String value) {
            addCriterion("TOICH.ITEM_TP_CD like ", "%" + value, "itemTpCd");
            return (Criteria) this;
        }

        public Criteria andItemTpCdLikeRight(String value) {
            addCriterion("TOICH.ITEM_TP_CD like ", value + "%", "itemTpCd");
            return (Criteria) this;
        }

        public Criteria andItemTpCdLikeBoth(String value) {
            addCriterion("TOICH.ITEM_TP_CD like ", "%" + value + "%", "itemTpCd");
            return (Criteria) this;
        }

        public Criteria andItemCdLikeLeft(String value) {
            addCriterion("TOICH.ITEM_CD like ", "%" + value, "itemCd");
            return (Criteria) this;
        }

        public Criteria andItemCdLikeRight(String value) {
            addCriterion("TOICH.ITEM_CD like ", value + "%", "itemCd");
            return (Criteria) this;
        }

        public Criteria andItemCdLikeBoth(String value) {
            addCriterion("TOICH.ITEM_CD like ", "%" + value + "%", "itemCd");
            return (Criteria) this;
        }

        public Criteria andSsgCdLikeLeft(String value) {
            addCriterion("TOICH.SSG_CD like ", "%" + value, "ssgCd");
            return (Criteria) this;
        }

        public Criteria andSsgCdLikeRight(String value) {
            addCriterion("TOICH.SSG_CD like ", value + "%", "ssgCd");
            return (Criteria) this;
        }

        public Criteria andSsgCdLikeBoth(String value) {
            addCriterion("TOICH.SSG_CD like ", "%" + value + "%", "ssgCd");
            return (Criteria) this;
        }

        public Criteria andItemNmLikeLeft(String value) {
            addCriterion("TOICH.ITEM_NM like ", "%" + value, "itemNm");
            return (Criteria) this;
        }

        public Criteria andItemNmLikeRight(String value) {
            addCriterion("TOICH.ITEM_NM like ", value + "%", "itemNm");
            return (Criteria) this;
        }

        public Criteria andItemNmLikeBoth(String value) {
            addCriterion("TOICH.ITEM_NM like ", "%" + value + "%", "itemNm");
            return (Criteria) this;
        }

        public Criteria andItemOptNmLikeLeft(String value) {
            addCriterion("TOICH.ITEM_OPT_NM like ", "%" + value, "itemOptNm");
            return (Criteria) this;
        }

        public Criteria andItemOptNmLikeRight(String value) {
            addCriterion("TOICH.ITEM_OPT_NM like ", value + "%", "itemOptNm");
            return (Criteria) this;
        }

        public Criteria andItemOptNmLikeBoth(String value) {
            addCriterion("TOICH.ITEM_OPT_NM like ", "%" + value + "%", "itemOptNm");
            return (Criteria) this;
        }

        public Criteria andSetItemNmLikeLeft(String value) {
            addCriterion("TOICH.SET_ITEM_NM like ", "%" + value, "setItemNm");
            return (Criteria) this;
        }

        public Criteria andSetItemNmLikeRight(String value) {
            addCriterion("TOICH.SET_ITEM_NM like ", value + "%", "setItemNm");
            return (Criteria) this;
        }

        public Criteria andSetItemNmLikeBoth(String value) {
            addCriterion("TOICH.SET_ITEM_NM like ", "%" + value + "%", "setItemNm");
            return (Criteria) this;
        }

        public Criteria andItemAttrTpCdLikeLeft(String value) {
            addCriterion("TOICH.ITEM_ATTR_TP_CD like ", "%" + value, "itemAttrTpCd");
            return (Criteria) this;
        }

        public Criteria andItemAttrTpCdLikeRight(String value) {
            addCriterion("TOICH.ITEM_ATTR_TP_CD like ", value + "%", "itemAttrTpCd");
            return (Criteria) this;
        }

        public Criteria andItemAttrTpCdLikeBoth(String value) {
            addCriterion("TOICH.ITEM_ATTR_TP_CD like ", "%" + value + "%", "itemAttrTpCd");
            return (Criteria) this;
        }

        public Criteria andItemTaxClCdLikeLeft(String value) {
            addCriterion("TOICH.ITEM_TAX_CL_CD like ", "%" + value, "itemTaxClCd");
            return (Criteria) this;
        }

        public Criteria andItemTaxClCdLikeRight(String value) {
            addCriterion("TOICH.ITEM_TAX_CL_CD like ", value + "%", "itemTaxClCd");
            return (Criteria) this;
        }

        public Criteria andItemTaxClCdLikeBoth(String value) {
            addCriterion("TOICH.ITEM_TAX_CL_CD like ", "%" + value + "%", "itemTaxClCd");
            return (Criteria) this;
        }

        public Criteria andItemCpnUsePsblYnLikeLeft(String value) {
            addCriterion("TOICH.ITEM_CPN_USE_PSBL_YN like ", "%" + value, "itemCpnUsePsblYn");
            return (Criteria) this;
        }

        public Criteria andItemCpnUsePsblYnLikeRight(String value) {
            addCriterion("TOICH.ITEM_CPN_USE_PSBL_YN like ", value + "%", "itemCpnUsePsblYn");
            return (Criteria) this;
        }

        public Criteria andItemCpnUsePsblYnLikeBoth(String value) {
            addCriterion("TOICH.ITEM_CPN_USE_PSBL_YN like ", "%" + value + "%", "itemCpnUsePsblYn");
            return (Criteria) this;
        }

        public Criteria andItemPtSaveTpCdLikeLeft(String value) {
            addCriterion("TOICH.ITEM_PT_SAVE_TP_CD like ", "%" + value, "itemPtSaveTpCd");
            return (Criteria) this;
        }

        public Criteria andItemPtSaveTpCdLikeRight(String value) {
            addCriterion("TOICH.ITEM_PT_SAVE_TP_CD like ", value + "%", "itemPtSaveTpCd");
            return (Criteria) this;
        }

        public Criteria andItemPtSaveTpCdLikeBoth(String value) {
            addCriterion("TOICH.ITEM_PT_SAVE_TP_CD like ", "%" + value + "%", "itemPtSaveTpCd");
            return (Criteria) this;
        }

        public Criteria andItemPtSaveMethCdLikeLeft(String value) {
            addCriterion("TOICH.ITEM_PT_SAVE_METH_CD like ", "%" + value, "itemPtSaveMethCd");
            return (Criteria) this;
        }

        public Criteria andItemPtSaveMethCdLikeRight(String value) {
            addCriterion("TOICH.ITEM_PT_SAVE_METH_CD like ", value + "%", "itemPtSaveMethCd");
            return (Criteria) this;
        }

        public Criteria andItemPtSaveMethCdLikeBoth(String value) {
            addCriterion("TOICH.ITEM_PT_SAVE_METH_CD like ", "%" + value + "%", "itemPtSaveMethCd");
            return (Criteria) this;
        }

        public Criteria andItemCstmdYnLikeLeft(String value) {
            addCriterion("TOICH.ITEM_CSTMD_YN like ", "%" + value, "itemCstmdYn");
            return (Criteria) this;
        }

        public Criteria andItemCstmdYnLikeRight(String value) {
            addCriterion("TOICH.ITEM_CSTMD_YN like ", value + "%", "itemCstmdYn");
            return (Criteria) this;
        }

        public Criteria andItemCstmdYnLikeBoth(String value) {
            addCriterion("TOICH.ITEM_CSTMD_YN like ", "%" + value + "%", "itemCstmdYn");
            return (Criteria) this;
        }

        public Criteria andItemPrcTpCdLikeLeft(String value) {
            addCriterion("TOICH.ITEM_PRC_TP_CD like ", "%" + value, "itemPrcTpCd");
            return (Criteria) this;
        }

        public Criteria andItemPrcTpCdLikeRight(String value) {
            addCriterion("TOICH.ITEM_PRC_TP_CD like ", value + "%", "itemPrcTpCd");
            return (Criteria) this;
        }

        public Criteria andItemPrcTpCdLikeBoth(String value) {
            addCriterion("TOICH.ITEM_PRC_TP_CD like ", "%" + value + "%", "itemPrcTpCd");
            return (Criteria) this;
        }

        public Criteria andPtTpCdLikeLeft(String value) {
            addCriterion("TOICH.PT_TP_CD like ", "%" + value, "ptTpCd");
            return (Criteria) this;
        }

        public Criteria andPtTpCdLikeRight(String value) {
            addCriterion("TOICH.PT_TP_CD like ", value + "%", "ptTpCd");
            return (Criteria) this;
        }

        public Criteria andPtTpCdLikeBoth(String value) {
            addCriterion("TOICH.PT_TP_CD like ", "%" + value + "%", "ptTpCd");
            return (Criteria) this;
        }

        public Criteria andPtSaveYnLikeLeft(String value) {
            addCriterion("TOICH.PT_SAVE_YN like ", "%" + value, "ptSaveYn");
            return (Criteria) this;
        }

        public Criteria andPtSaveYnLikeRight(String value) {
            addCriterion("TOICH.PT_SAVE_YN like ", value + "%", "ptSaveYn");
            return (Criteria) this;
        }

        public Criteria andPtSaveYnLikeBoth(String value) {
            addCriterion("TOICH.PT_SAVE_YN like ", "%" + value + "%", "ptSaveYn");
            return (Criteria) this;
        }

        public Criteria andOrdCfmIdLikeLeft(String value) {
            addCriterion("TOICH.ORD_CFM_ID like ", "%" + value, "ordCfmId");
            return (Criteria) this;
        }

        public Criteria andOrdCfmIdLikeRight(String value) {
            addCriterion("TOICH.ORD_CFM_ID like ", value + "%", "ordCfmId");
            return (Criteria) this;
        }

        public Criteria andOrdCfmIdLikeBoth(String value) {
            addCriterion("TOICH.ORD_CFM_ID like ", "%" + value + "%", "ordCfmId");
            return (Criteria) this;
        }

        public Criteria andOrdCfmSndYnLikeLeft(String value) {
            addCriterion("TOICH.ORD_CFM_SND_YN like ", "%" + value, "ordCfmSndYn");
            return (Criteria) this;
        }

        public Criteria andOrdCfmSndYnLikeRight(String value) {
            addCriterion("TOICH.ORD_CFM_SND_YN like ", value + "%", "ordCfmSndYn");
            return (Criteria) this;
        }

        public Criteria andOrdCfmSndYnLikeBoth(String value) {
            addCriterion("TOICH.ORD_CFM_SND_YN like ", "%" + value + "%", "ordCfmSndYn");
            return (Criteria) this;
        }

        public Criteria andSettlStatCdLikeLeft(String value) {
            addCriterion("TOICH.SETTL_STAT_CD like ", "%" + value, "settlStatCd");
            return (Criteria) this;
        }

        public Criteria andSettlStatCdLikeRight(String value) {
            addCriterion("TOICH.SETTL_STAT_CD like ", value + "%", "settlStatCd");
            return (Criteria) this;
        }

        public Criteria andSettlStatCdLikeBoth(String value) {
            addCriterion("TOICH.SETTL_STAT_CD like ", "%" + value + "%", "settlStatCd");
            return (Criteria) this;
        }

        public Criteria andSettlYmdLikeLeft(String value) {
            addCriterion("TOICH.SETTL_YMD like ", "%" + value, "settlYmd");
            return (Criteria) this;
        }

        public Criteria andSettlYmdLikeRight(String value) {
            addCriterion("TOICH.SETTL_YMD like ", value + "%", "settlYmd");
            return (Criteria) this;
        }

        public Criteria andSettlYmdLikeBoth(String value) {
            addCriterion("TOICH.SETTL_YMD like ", "%" + value + "%", "settlYmd");
            return (Criteria) this;
        }

        public Criteria andSettlPgYmdLikeLeft(String value) {
            addCriterion("TOICH.SETTL_PG_YMD like ", "%" + value, "settlPgYmd");
            return (Criteria) this;
        }

        public Criteria andSettlPgYmdLikeRight(String value) {
            addCriterion("TOICH.SETTL_PG_YMD like ", value + "%", "settlPgYmd");
            return (Criteria) this;
        }

        public Criteria andSettlPgYmdLikeBoth(String value) {
            addCriterion("TOICH.SETTL_PG_YMD like ", "%" + value + "%", "settlPgYmd");
            return (Criteria) this;
        }

        public Criteria andRegIdLikeLeft(String value) {
            addCriterion("TOICH.REG_ID like ", "%" + value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdLikeRight(String value) {
            addCriterion("TOICH.REG_ID like ", value + "%", "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdLikeBoth(String value) {
            addCriterion("TOICH.REG_ID like ", "%" + value + "%", "regId");
            return (Criteria) this;
        }

        public Criteria andModIdLikeLeft(String value) {
            addCriterion("TOICH.MOD_ID like ", "%" + value, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdLikeRight(String value) {
            addCriterion("TOICH.MOD_ID like ", value + "%", "modId");
            return (Criteria) this;
        }

        public Criteria andModIdLikeBoth(String value) {
            addCriterion("TOICH.MOD_ID like ", "%" + value + "%", "modId");
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