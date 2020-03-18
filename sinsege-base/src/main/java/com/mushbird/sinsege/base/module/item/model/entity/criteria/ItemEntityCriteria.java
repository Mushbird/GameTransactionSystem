package com.mushbird.sinsege.base.module.item.model.entity.criteria;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class ItemEntityCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    public ItemEntityCriteria() {
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

        public Criteria andItemIdIsNull() {
            addCriterion("TI.ITEM_ID is null");
            return (Criteria) this;
        }

        public Criteria andItemIdIsNotNull() {
            addCriterion("TI.ITEM_ID is not null");
            return (Criteria) this;
        }

        public Criteria andItemIdEqualTo(Integer value) {
            addCriterion("TI.ITEM_ID =", value, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdNotEqualTo(Integer value) {
            addCriterion("TI.ITEM_ID <>", value, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdGreaterThan(Integer value) {
            addCriterion("TI.ITEM_ID >", value, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("TI.ITEM_ID >=", value, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdLessThan(Integer value) {
            addCriterion("TI.ITEM_ID <", value, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdLessThanOrEqualTo(Integer value) {
            addCriterion("TI.ITEM_ID <=", value, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdIn(List<Integer> values) {
            addCriterion("TI.ITEM_ID in", values, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdNotIn(List<Integer> values) {
            addCriterion("TI.ITEM_ID not in", values, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdBetween(Integer value1, Integer value2) {
            addCriterion("TI.ITEM_ID between", value1, value2, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdNotBetween(Integer value1, Integer value2) {
            addCriterion("TI.ITEM_ID not between", value1, value2, "itemId");
            return (Criteria) this;
        }

        public Criteria andVenIdIsNull() {
            addCriterion("TI.VEN_ID is null");
            return (Criteria) this;
        }

        public Criteria andVenIdIsNotNull() {
            addCriterion("TI.VEN_ID is not null");
            return (Criteria) this;
        }

        public Criteria andVenIdEqualTo(Integer value) {
            addCriterion("TI.VEN_ID =", value, "venId");
            return (Criteria) this;
        }

        public Criteria andVenIdNotEqualTo(Integer value) {
            addCriterion("TI.VEN_ID <>", value, "venId");
            return (Criteria) this;
        }

        public Criteria andVenIdGreaterThan(Integer value) {
            addCriterion("TI.VEN_ID >", value, "venId");
            return (Criteria) this;
        }

        public Criteria andVenIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("TI.VEN_ID >=", value, "venId");
            return (Criteria) this;
        }

        public Criteria andVenIdLessThan(Integer value) {
            addCriterion("TI.VEN_ID <", value, "venId");
            return (Criteria) this;
        }

        public Criteria andVenIdLessThanOrEqualTo(Integer value) {
            addCriterion("TI.VEN_ID <=", value, "venId");
            return (Criteria) this;
        }

        public Criteria andVenIdIn(List<Integer> values) {
            addCriterion("TI.VEN_ID in", values, "venId");
            return (Criteria) this;
        }

        public Criteria andVenIdNotIn(List<Integer> values) {
            addCriterion("TI.VEN_ID not in", values, "venId");
            return (Criteria) this;
        }

        public Criteria andVenIdBetween(Integer value1, Integer value2) {
            addCriterion("TI.VEN_ID between", value1, value2, "venId");
            return (Criteria) this;
        }

        public Criteria andVenIdNotBetween(Integer value1, Integer value2) {
            addCriterion("TI.VEN_ID not between", value1, value2, "venId");
            return (Criteria) this;
        }

        public Criteria andItemTpCdIsNull() {
            addCriterion("TI.ITEM_TP_CD is null");
            return (Criteria) this;
        }

        public Criteria andItemTpCdIsNotNull() {
            addCriterion("TI.ITEM_TP_CD is not null");
            return (Criteria) this;
        }

        public Criteria andItemTpCdEqualTo(String value) {
            addCriterion("TI.ITEM_TP_CD =", value, "itemTpCd");
            return (Criteria) this;
        }

        public Criteria andItemTpCdNotEqualTo(String value) {
            addCriterion("TI.ITEM_TP_CD <>", value, "itemTpCd");
            return (Criteria) this;
        }

        public Criteria andItemTpCdGreaterThan(String value) {
            addCriterion("TI.ITEM_TP_CD >", value, "itemTpCd");
            return (Criteria) this;
        }

        public Criteria andItemTpCdGreaterThanOrEqualTo(String value) {
            addCriterion("TI.ITEM_TP_CD >=", value, "itemTpCd");
            return (Criteria) this;
        }

        public Criteria andItemTpCdLessThan(String value) {
            addCriterion("TI.ITEM_TP_CD <", value, "itemTpCd");
            return (Criteria) this;
        }

        public Criteria andItemTpCdLessThanOrEqualTo(String value) {
            addCriterion("TI.ITEM_TP_CD <=", value, "itemTpCd");
            return (Criteria) this;
        }

        public Criteria andItemTpCdLike(String value) {
            addCriterion("TI.ITEM_TP_CD like", value, "itemTpCd");
            return (Criteria) this;
        }

        public Criteria andItemTpCdNotLike(String value) {
            addCriterion("TI.ITEM_TP_CD not like", value, "itemTpCd");
            return (Criteria) this;
        }

        public Criteria andItemTpCdIn(List<String> values) {
            addCriterion("TI.ITEM_TP_CD in", values, "itemTpCd");
            return (Criteria) this;
        }

        public Criteria andItemTpCdNotIn(List<String> values) {
            addCriterion("TI.ITEM_TP_CD not in", values, "itemTpCd");
            return (Criteria) this;
        }

        public Criteria andItemTpCdBetween(String value1, String value2) {
            addCriterion("TI.ITEM_TP_CD between", value1, value2, "itemTpCd");
            return (Criteria) this;
        }

        public Criteria andItemTpCdNotBetween(String value1, String value2) {
            addCriterion("TI.ITEM_TP_CD not between", value1, value2, "itemTpCd");
            return (Criteria) this;
        }

        public Criteria andItemStatCdIsNull() {
            addCriterion("TI.ITEM_STAT_CD is null");
            return (Criteria) this;
        }

        public Criteria andItemStatCdIsNotNull() {
            addCriterion("TI.ITEM_STAT_CD is not null");
            return (Criteria) this;
        }

        public Criteria andItemStatCdEqualTo(String value) {
            addCriterion("TI.ITEM_STAT_CD =", value, "itemStatCd");
            return (Criteria) this;
        }

        public Criteria andItemStatCdNotEqualTo(String value) {
            addCriterion("TI.ITEM_STAT_CD <>", value, "itemStatCd");
            return (Criteria) this;
        }

        public Criteria andItemStatCdGreaterThan(String value) {
            addCriterion("TI.ITEM_STAT_CD >", value, "itemStatCd");
            return (Criteria) this;
        }

        public Criteria andItemStatCdGreaterThanOrEqualTo(String value) {
            addCriterion("TI.ITEM_STAT_CD >=", value, "itemStatCd");
            return (Criteria) this;
        }

        public Criteria andItemStatCdLessThan(String value) {
            addCriterion("TI.ITEM_STAT_CD <", value, "itemStatCd");
            return (Criteria) this;
        }

        public Criteria andItemStatCdLessThanOrEqualTo(String value) {
            addCriterion("TI.ITEM_STAT_CD <=", value, "itemStatCd");
            return (Criteria) this;
        }

        public Criteria andItemStatCdLike(String value) {
            addCriterion("TI.ITEM_STAT_CD like", value, "itemStatCd");
            return (Criteria) this;
        }

        public Criteria andItemStatCdNotLike(String value) {
            addCriterion("TI.ITEM_STAT_CD not like", value, "itemStatCd");
            return (Criteria) this;
        }

        public Criteria andItemStatCdIn(List<String> values) {
            addCriterion("TI.ITEM_STAT_CD in", values, "itemStatCd");
            return (Criteria) this;
        }

        public Criteria andItemStatCdNotIn(List<String> values) {
            addCriterion("TI.ITEM_STAT_CD not in", values, "itemStatCd");
            return (Criteria) this;
        }

        public Criteria andItemStatCdBetween(String value1, String value2) {
            addCriterion("TI.ITEM_STAT_CD between", value1, value2, "itemStatCd");
            return (Criteria) this;
        }

        public Criteria andItemStatCdNotBetween(String value1, String value2) {
            addCriterion("TI.ITEM_STAT_CD not between", value1, value2, "itemStatCd");
            return (Criteria) this;
        }

        public Criteria andItemAprvStatCdIsNull() {
            addCriterion("TI.ITEM_APRV_STAT_CD is null");
            return (Criteria) this;
        }

        public Criteria andItemAprvStatCdIsNotNull() {
            addCriterion("TI.ITEM_APRV_STAT_CD is not null");
            return (Criteria) this;
        }

        public Criteria andItemAprvStatCdEqualTo(String value) {
            addCriterion("TI.ITEM_APRV_STAT_CD =", value, "itemAprvStatCd");
            return (Criteria) this;
        }

        public Criteria andItemAprvStatCdNotEqualTo(String value) {
            addCriterion("TI.ITEM_APRV_STAT_CD <>", value, "itemAprvStatCd");
            return (Criteria) this;
        }

        public Criteria andItemAprvStatCdGreaterThan(String value) {
            addCriterion("TI.ITEM_APRV_STAT_CD >", value, "itemAprvStatCd");
            return (Criteria) this;
        }

        public Criteria andItemAprvStatCdGreaterThanOrEqualTo(String value) {
            addCriterion("TI.ITEM_APRV_STAT_CD >=", value, "itemAprvStatCd");
            return (Criteria) this;
        }

        public Criteria andItemAprvStatCdLessThan(String value) {
            addCriterion("TI.ITEM_APRV_STAT_CD <", value, "itemAprvStatCd");
            return (Criteria) this;
        }

        public Criteria andItemAprvStatCdLessThanOrEqualTo(String value) {
            addCriterion("TI.ITEM_APRV_STAT_CD <=", value, "itemAprvStatCd");
            return (Criteria) this;
        }

        public Criteria andItemAprvStatCdLike(String value) {
            addCriterion("TI.ITEM_APRV_STAT_CD like", value, "itemAprvStatCd");
            return (Criteria) this;
        }

        public Criteria andItemAprvStatCdNotLike(String value) {
            addCriterion("TI.ITEM_APRV_STAT_CD not like", value, "itemAprvStatCd");
            return (Criteria) this;
        }

        public Criteria andItemAprvStatCdIn(List<String> values) {
            addCriterion("TI.ITEM_APRV_STAT_CD in", values, "itemAprvStatCd");
            return (Criteria) this;
        }

        public Criteria andItemAprvStatCdNotIn(List<String> values) {
            addCriterion("TI.ITEM_APRV_STAT_CD not in", values, "itemAprvStatCd");
            return (Criteria) this;
        }

        public Criteria andItemAprvStatCdBetween(String value1, String value2) {
            addCriterion("TI.ITEM_APRV_STAT_CD between", value1, value2, "itemAprvStatCd");
            return (Criteria) this;
        }

        public Criteria andItemAprvStatCdNotBetween(String value1, String value2) {
            addCriterion("TI.ITEM_APRV_STAT_CD not between", value1, value2, "itemAprvStatCd");
            return (Criteria) this;
        }

        public Criteria andItemCdIsNull() {
            addCriterion("TI.ITEM_CD is null");
            return (Criteria) this;
        }

        public Criteria andItemCdIsNotNull() {
            addCriterion("TI.ITEM_CD is not null");
            return (Criteria) this;
        }

        public Criteria andItemCdEqualTo(String value) {
            addCriterion("TI.ITEM_CD =", value, "itemCd");
            return (Criteria) this;
        }

        public Criteria andItemCdNotEqualTo(String value) {
            addCriterion("TI.ITEM_CD <>", value, "itemCd");
            return (Criteria) this;
        }

        public Criteria andItemCdGreaterThan(String value) {
            addCriterion("TI.ITEM_CD >", value, "itemCd");
            return (Criteria) this;
        }

        public Criteria andItemCdGreaterThanOrEqualTo(String value) {
            addCriterion("TI.ITEM_CD >=", value, "itemCd");
            return (Criteria) this;
        }

        public Criteria andItemCdLessThan(String value) {
            addCriterion("TI.ITEM_CD <", value, "itemCd");
            return (Criteria) this;
        }

        public Criteria andItemCdLessThanOrEqualTo(String value) {
            addCriterion("TI.ITEM_CD <=", value, "itemCd");
            return (Criteria) this;
        }

        public Criteria andItemCdLike(String value) {
            addCriterion("TI.ITEM_CD like", value, "itemCd");
            return (Criteria) this;
        }

        public Criteria andItemCdNotLike(String value) {
            addCriterion("TI.ITEM_CD not like", value, "itemCd");
            return (Criteria) this;
        }

        public Criteria andItemCdIn(List<String> values) {
            addCriterion("TI.ITEM_CD in", values, "itemCd");
            return (Criteria) this;
        }

        public Criteria andItemCdNotIn(List<String> values) {
            addCriterion("TI.ITEM_CD not in", values, "itemCd");
            return (Criteria) this;
        }

        public Criteria andItemCdBetween(String value1, String value2) {
            addCriterion("TI.ITEM_CD between", value1, value2, "itemCd");
            return (Criteria) this;
        }

        public Criteria andItemCdNotBetween(String value1, String value2) {
            addCriterion("TI.ITEM_CD not between", value1, value2, "itemCd");
            return (Criteria) this;
        }

        public Criteria andItemNmIsNull() {
            addCriterion("TI.ITEM_NM is null");
            return (Criteria) this;
        }

        public Criteria andItemNmIsNotNull() {
            addCriterion("TI.ITEM_NM is not null");
            return (Criteria) this;
        }

        public Criteria andItemNmEqualTo(String value) {
            addCriterion("TI.ITEM_NM =", value, "itemNm");
            return (Criteria) this;
        }

        public Criteria andItemNmNotEqualTo(String value) {
            addCriterion("TI.ITEM_NM <>", value, "itemNm");
            return (Criteria) this;
        }

        public Criteria andItemNmGreaterThan(String value) {
            addCriterion("TI.ITEM_NM >", value, "itemNm");
            return (Criteria) this;
        }

        public Criteria andItemNmGreaterThanOrEqualTo(String value) {
            addCriterion("TI.ITEM_NM >=", value, "itemNm");
            return (Criteria) this;
        }

        public Criteria andItemNmLessThan(String value) {
            addCriterion("TI.ITEM_NM <", value, "itemNm");
            return (Criteria) this;
        }

        public Criteria andItemNmLessThanOrEqualTo(String value) {
            addCriterion("TI.ITEM_NM <=", value, "itemNm");
            return (Criteria) this;
        }

        public Criteria andItemNmLike(String value) {
            addCriterion("TI.ITEM_NM like", value, "itemNm");
            return (Criteria) this;
        }

        public Criteria andItemNmNotLike(String value) {
            addCriterion("TI.ITEM_NM not like", value, "itemNm");
            return (Criteria) this;
        }

        public Criteria andItemNmIn(List<String> values) {
            addCriterion("TI.ITEM_NM in", values, "itemNm");
            return (Criteria) this;
        }

        public Criteria andItemNmNotIn(List<String> values) {
            addCriterion("TI.ITEM_NM not in", values, "itemNm");
            return (Criteria) this;
        }

        public Criteria andItemNmBetween(String value1, String value2) {
            addCriterion("TI.ITEM_NM between", value1, value2, "itemNm");
            return (Criteria) this;
        }

        public Criteria andItemNmNotBetween(String value1, String value2) {
            addCriterion("TI.ITEM_NM not between", value1, value2, "itemNm");
            return (Criteria) this;
        }

        public Criteria andItemSubNmIsNull() {
            addCriterion("TI.ITEM_SUB_NM is null");
            return (Criteria) this;
        }

        public Criteria andItemSubNmIsNotNull() {
            addCriterion("TI.ITEM_SUB_NM is not null");
            return (Criteria) this;
        }

        public Criteria andItemSubNmEqualTo(String value) {
            addCriterion("TI.ITEM_SUB_NM =", value, "itemSubNm");
            return (Criteria) this;
        }

        public Criteria andItemSubNmNotEqualTo(String value) {
            addCriterion("TI.ITEM_SUB_NM <>", value, "itemSubNm");
            return (Criteria) this;
        }

        public Criteria andItemSubNmGreaterThan(String value) {
            addCriterion("TI.ITEM_SUB_NM >", value, "itemSubNm");
            return (Criteria) this;
        }

        public Criteria andItemSubNmGreaterThanOrEqualTo(String value) {
            addCriterion("TI.ITEM_SUB_NM >=", value, "itemSubNm");
            return (Criteria) this;
        }

        public Criteria andItemSubNmLessThan(String value) {
            addCriterion("TI.ITEM_SUB_NM <", value, "itemSubNm");
            return (Criteria) this;
        }

        public Criteria andItemSubNmLessThanOrEqualTo(String value) {
            addCriterion("TI.ITEM_SUB_NM <=", value, "itemSubNm");
            return (Criteria) this;
        }

        public Criteria andItemSubNmLike(String value) {
            addCriterion("TI.ITEM_SUB_NM like", value, "itemSubNm");
            return (Criteria) this;
        }

        public Criteria andItemSubNmNotLike(String value) {
            addCriterion("TI.ITEM_SUB_NM not like", value, "itemSubNm");
            return (Criteria) this;
        }

        public Criteria andItemSubNmIn(List<String> values) {
            addCriterion("TI.ITEM_SUB_NM in", values, "itemSubNm");
            return (Criteria) this;
        }

        public Criteria andItemSubNmNotIn(List<String> values) {
            addCriterion("TI.ITEM_SUB_NM not in", values, "itemSubNm");
            return (Criteria) this;
        }

        public Criteria andItemSubNmBetween(String value1, String value2) {
            addCriterion("TI.ITEM_SUB_NM between", value1, value2, "itemSubNm");
            return (Criteria) this;
        }

        public Criteria andItemSubNmNotBetween(String value1, String value2) {
            addCriterion("TI.ITEM_SUB_NM not between", value1, value2, "itemSubNm");
            return (Criteria) this;
        }

        public Criteria andManuIsNull() {
            addCriterion("TI.MANU is null");
            return (Criteria) this;
        }

        public Criteria andManuIsNotNull() {
            addCriterion("TI.MANU is not null");
            return (Criteria) this;
        }

        public Criteria andManuEqualTo(String value) {
            addCriterion("TI.MANU =", value, "manu");
            return (Criteria) this;
        }

        public Criteria andManuNotEqualTo(String value) {
            addCriterion("TI.MANU <>", value, "manu");
            return (Criteria) this;
        }

        public Criteria andManuGreaterThan(String value) {
            addCriterion("TI.MANU >", value, "manu");
            return (Criteria) this;
        }

        public Criteria andManuGreaterThanOrEqualTo(String value) {
            addCriterion("TI.MANU >=", value, "manu");
            return (Criteria) this;
        }

        public Criteria andManuLessThan(String value) {
            addCriterion("TI.MANU <", value, "manu");
            return (Criteria) this;
        }

        public Criteria andManuLessThanOrEqualTo(String value) {
            addCriterion("TI.MANU <=", value, "manu");
            return (Criteria) this;
        }

        public Criteria andManuLike(String value) {
            addCriterion("TI.MANU like", value, "manu");
            return (Criteria) this;
        }

        public Criteria andManuNotLike(String value) {
            addCriterion("TI.MANU not like", value, "manu");
            return (Criteria) this;
        }

        public Criteria andManuIn(List<String> values) {
            addCriterion("TI.MANU in", values, "manu");
            return (Criteria) this;
        }

        public Criteria andManuNotIn(List<String> values) {
            addCriterion("TI.MANU not in", values, "manu");
            return (Criteria) this;
        }

        public Criteria andManuBetween(String value1, String value2) {
            addCriterion("TI.MANU between", value1, value2, "manu");
            return (Criteria) this;
        }

        public Criteria andManuNotBetween(String value1, String value2) {
            addCriterion("TI.MANU not between", value1, value2, "manu");
            return (Criteria) this;
        }

        public Criteria andDpBrndIdIsNull() {
            addCriterion("TI.DP_BRND_ID is null");
            return (Criteria) this;
        }

        public Criteria andDpBrndIdIsNotNull() {
            addCriterion("TI.DP_BRND_ID is not null");
            return (Criteria) this;
        }

        public Criteria andDpBrndIdEqualTo(Integer value) {
            addCriterion("TI.DP_BRND_ID =", value, "dpBrndId");
            return (Criteria) this;
        }

        public Criteria andDpBrndIdNotEqualTo(Integer value) {
            addCriterion("TI.DP_BRND_ID <>", value, "dpBrndId");
            return (Criteria) this;
        }

        public Criteria andDpBrndIdGreaterThan(Integer value) {
            addCriterion("TI.DP_BRND_ID >", value, "dpBrndId");
            return (Criteria) this;
        }

        public Criteria andDpBrndIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("TI.DP_BRND_ID >=", value, "dpBrndId");
            return (Criteria) this;
        }

        public Criteria andDpBrndIdLessThan(Integer value) {
            addCriterion("TI.DP_BRND_ID <", value, "dpBrndId");
            return (Criteria) this;
        }

        public Criteria andDpBrndIdLessThanOrEqualTo(Integer value) {
            addCriterion("TI.DP_BRND_ID <=", value, "dpBrndId");
            return (Criteria) this;
        }

        public Criteria andDpBrndIdIn(List<Integer> values) {
            addCriterion("TI.DP_BRND_ID in", values, "dpBrndId");
            return (Criteria) this;
        }

        public Criteria andDpBrndIdNotIn(List<Integer> values) {
            addCriterion("TI.DP_BRND_ID not in", values, "dpBrndId");
            return (Criteria) this;
        }

        public Criteria andDpBrndIdBetween(Integer value1, Integer value2) {
            addCriterion("TI.DP_BRND_ID between", value1, value2, "dpBrndId");
            return (Criteria) this;
        }

        public Criteria andDpBrndIdNotBetween(Integer value1, Integer value2) {
            addCriterion("TI.DP_BRND_ID not between", value1, value2, "dpBrndId");
            return (Criteria) this;
        }

        public Criteria andItemCmtRegYnIsNull() {
            addCriterion("TI.ITEM_CMT_REG_YN is null");
            return (Criteria) this;
        }

        public Criteria andItemCmtRegYnIsNotNull() {
            addCriterion("TI.ITEM_CMT_REG_YN is not null");
            return (Criteria) this;
        }

        public Criteria andItemCmtRegYnEqualTo(String value) {
            addCriterion("TI.ITEM_CMT_REG_YN =", value, "itemCmtRegYn");
            return (Criteria) this;
        }

        public Criteria andItemCmtRegYnNotEqualTo(String value) {
            addCriterion("TI.ITEM_CMT_REG_YN <>", value, "itemCmtRegYn");
            return (Criteria) this;
        }

        public Criteria andItemCmtRegYnGreaterThan(String value) {
            addCriterion("TI.ITEM_CMT_REG_YN >", value, "itemCmtRegYn");
            return (Criteria) this;
        }

        public Criteria andItemCmtRegYnGreaterThanOrEqualTo(String value) {
            addCriterion("TI.ITEM_CMT_REG_YN >=", value, "itemCmtRegYn");
            return (Criteria) this;
        }

        public Criteria andItemCmtRegYnLessThan(String value) {
            addCriterion("TI.ITEM_CMT_REG_YN <", value, "itemCmtRegYn");
            return (Criteria) this;
        }

        public Criteria andItemCmtRegYnLessThanOrEqualTo(String value) {
            addCriterion("TI.ITEM_CMT_REG_YN <=", value, "itemCmtRegYn");
            return (Criteria) this;
        }

        public Criteria andItemCmtRegYnLike(String value) {
            addCriterion("TI.ITEM_CMT_REG_YN like", value, "itemCmtRegYn");
            return (Criteria) this;
        }

        public Criteria andItemCmtRegYnNotLike(String value) {
            addCriterion("TI.ITEM_CMT_REG_YN not like", value, "itemCmtRegYn");
            return (Criteria) this;
        }

        public Criteria andItemCmtRegYnIn(List<String> values) {
            addCriterion("TI.ITEM_CMT_REG_YN in", values, "itemCmtRegYn");
            return (Criteria) this;
        }

        public Criteria andItemCmtRegYnNotIn(List<String> values) {
            addCriterion("TI.ITEM_CMT_REG_YN not in", values, "itemCmtRegYn");
            return (Criteria) this;
        }

        public Criteria andItemCmtRegYnBetween(String value1, String value2) {
            addCriterion("TI.ITEM_CMT_REG_YN between", value1, value2, "itemCmtRegYn");
            return (Criteria) this;
        }

        public Criteria andItemCmtRegYnNotBetween(String value1, String value2) {
            addCriterion("TI.ITEM_CMT_REG_YN not between", value1, value2, "itemCmtRegYn");
            return (Criteria) this;
        }

        public Criteria andInqRegYnIsNull() {
            addCriterion("TI.INQ_REG_YN is null");
            return (Criteria) this;
        }

        public Criteria andInqRegYnIsNotNull() {
            addCriterion("TI.INQ_REG_YN is not null");
            return (Criteria) this;
        }

        public Criteria andInqRegYnEqualTo(String value) {
            addCriterion("TI.INQ_REG_YN =", value, "inqRegYn");
            return (Criteria) this;
        }

        public Criteria andInqRegYnNotEqualTo(String value) {
            addCriterion("TI.INQ_REG_YN <>", value, "inqRegYn");
            return (Criteria) this;
        }

        public Criteria andInqRegYnGreaterThan(String value) {
            addCriterion("TI.INQ_REG_YN >", value, "inqRegYn");
            return (Criteria) this;
        }

        public Criteria andInqRegYnGreaterThanOrEqualTo(String value) {
            addCriterion("TI.INQ_REG_YN >=", value, "inqRegYn");
            return (Criteria) this;
        }

        public Criteria andInqRegYnLessThan(String value) {
            addCriterion("TI.INQ_REG_YN <", value, "inqRegYn");
            return (Criteria) this;
        }

        public Criteria andInqRegYnLessThanOrEqualTo(String value) {
            addCriterion("TI.INQ_REG_YN <=", value, "inqRegYn");
            return (Criteria) this;
        }

        public Criteria andInqRegYnLike(String value) {
            addCriterion("TI.INQ_REG_YN like", value, "inqRegYn");
            return (Criteria) this;
        }

        public Criteria andInqRegYnNotLike(String value) {
            addCriterion("TI.INQ_REG_YN not like", value, "inqRegYn");
            return (Criteria) this;
        }

        public Criteria andInqRegYnIn(List<String> values) {
            addCriterion("TI.INQ_REG_YN in", values, "inqRegYn");
            return (Criteria) this;
        }

        public Criteria andInqRegYnNotIn(List<String> values) {
            addCriterion("TI.INQ_REG_YN not in", values, "inqRegYn");
            return (Criteria) this;
        }

        public Criteria andInqRegYnBetween(String value1, String value2) {
            addCriterion("TI.INQ_REG_YN between", value1, value2, "inqRegYn");
            return (Criteria) this;
        }

        public Criteria andInqRegYnNotBetween(String value1, String value2) {
            addCriterion("TI.INQ_REG_YN not between", value1, value2, "inqRegYn");
            return (Criteria) this;
        }

        public Criteria andOptSttYnIsNull() {
            addCriterion("TI.OPT_STT_YN is null");
            return (Criteria) this;
        }

        public Criteria andOptSttYnIsNotNull() {
            addCriterion("TI.OPT_STT_YN is not null");
            return (Criteria) this;
        }

        public Criteria andOptSttYnEqualTo(String value) {
            addCriterion("TI.OPT_STT_YN =", value, "optSttYn");
            return (Criteria) this;
        }

        public Criteria andOptSttYnNotEqualTo(String value) {
            addCriterion("TI.OPT_STT_YN <>", value, "optSttYn");
            return (Criteria) this;
        }

        public Criteria andOptSttYnGreaterThan(String value) {
            addCriterion("TI.OPT_STT_YN >", value, "optSttYn");
            return (Criteria) this;
        }

        public Criteria andOptSttYnGreaterThanOrEqualTo(String value) {
            addCriterion("TI.OPT_STT_YN >=", value, "optSttYn");
            return (Criteria) this;
        }

        public Criteria andOptSttYnLessThan(String value) {
            addCriterion("TI.OPT_STT_YN <", value, "optSttYn");
            return (Criteria) this;
        }

        public Criteria andOptSttYnLessThanOrEqualTo(String value) {
            addCriterion("TI.OPT_STT_YN <=", value, "optSttYn");
            return (Criteria) this;
        }

        public Criteria andOptSttYnLike(String value) {
            addCriterion("TI.OPT_STT_YN like", value, "optSttYn");
            return (Criteria) this;
        }

        public Criteria andOptSttYnNotLike(String value) {
            addCriterion("TI.OPT_STT_YN not like", value, "optSttYn");
            return (Criteria) this;
        }

        public Criteria andOptSttYnIn(List<String> values) {
            addCriterion("TI.OPT_STT_YN in", values, "optSttYn");
            return (Criteria) this;
        }

        public Criteria andOptSttYnNotIn(List<String> values) {
            addCriterion("TI.OPT_STT_YN not in", values, "optSttYn");
            return (Criteria) this;
        }

        public Criteria andOptSttYnBetween(String value1, String value2) {
            addCriterion("TI.OPT_STT_YN between", value1, value2, "optSttYn");
            return (Criteria) this;
        }

        public Criteria andOptSttYnNotBetween(String value1, String value2) {
            addCriterion("TI.OPT_STT_YN not between", value1, value2, "optSttYn");
            return (Criteria) this;
        }

        public Criteria andFrgtYnIsNull() {
            addCriterion("TI.FRGT_YN is null");
            return (Criteria) this;
        }

        public Criteria andFrgtYnIsNotNull() {
            addCriterion("TI.FRGT_YN is not null");
            return (Criteria) this;
        }

        public Criteria andFrgtYnEqualTo(String value) {
            addCriterion("TI.FRGT_YN =", value, "frgtYn");
            return (Criteria) this;
        }

        public Criteria andFrgtYnNotEqualTo(String value) {
            addCriterion("TI.FRGT_YN <>", value, "frgtYn");
            return (Criteria) this;
        }

        public Criteria andFrgtYnGreaterThan(String value) {
            addCriterion("TI.FRGT_YN >", value, "frgtYn");
            return (Criteria) this;
        }

        public Criteria andFrgtYnGreaterThanOrEqualTo(String value) {
            addCriterion("TI.FRGT_YN >=", value, "frgtYn");
            return (Criteria) this;
        }

        public Criteria andFrgtYnLessThan(String value) {
            addCriterion("TI.FRGT_YN <", value, "frgtYn");
            return (Criteria) this;
        }

        public Criteria andFrgtYnLessThanOrEqualTo(String value) {
            addCriterion("TI.FRGT_YN <=", value, "frgtYn");
            return (Criteria) this;
        }

        public Criteria andFrgtYnLike(String value) {
            addCriterion("TI.FRGT_YN like", value, "frgtYn");
            return (Criteria) this;
        }

        public Criteria andFrgtYnNotLike(String value) {
            addCriterion("TI.FRGT_YN not like", value, "frgtYn");
            return (Criteria) this;
        }

        public Criteria andFrgtYnIn(List<String> values) {
            addCriterion("TI.FRGT_YN in", values, "frgtYn");
            return (Criteria) this;
        }

        public Criteria andFrgtYnNotIn(List<String> values) {
            addCriterion("TI.FRGT_YN not in", values, "frgtYn");
            return (Criteria) this;
        }

        public Criteria andFrgtYnBetween(String value1, String value2) {
            addCriterion("TI.FRGT_YN between", value1, value2, "frgtYn");
            return (Criteria) this;
        }

        public Criteria andFrgtYnNotBetween(String value1, String value2) {
            addCriterion("TI.FRGT_YN not between", value1, value2, "frgtYn");
            return (Criteria) this;
        }

        public Criteria andDpYnIsNull() {
            addCriterion("TI.DP_YN is null");
            return (Criteria) this;
        }

        public Criteria andDpYnIsNotNull() {
            addCriterion("TI.DP_YN is not null");
            return (Criteria) this;
        }

        public Criteria andDpYnEqualTo(String value) {
            addCriterion("TI.DP_YN =", value, "dpYn");
            return (Criteria) this;
        }

        public Criteria andDpYnNotEqualTo(String value) {
            addCriterion("TI.DP_YN <>", value, "dpYn");
            return (Criteria) this;
        }

        public Criteria andDpYnGreaterThan(String value) {
            addCriterion("TI.DP_YN >", value, "dpYn");
            return (Criteria) this;
        }

        public Criteria andDpYnGreaterThanOrEqualTo(String value) {
            addCriterion("TI.DP_YN >=", value, "dpYn");
            return (Criteria) this;
        }

        public Criteria andDpYnLessThan(String value) {
            addCriterion("TI.DP_YN <", value, "dpYn");
            return (Criteria) this;
        }

        public Criteria andDpYnLessThanOrEqualTo(String value) {
            addCriterion("TI.DP_YN <=", value, "dpYn");
            return (Criteria) this;
        }

        public Criteria andDpYnLike(String value) {
            addCriterion("TI.DP_YN like", value, "dpYn");
            return (Criteria) this;
        }

        public Criteria andDpYnNotLike(String value) {
            addCriterion("TI.DP_YN not like", value, "dpYn");
            return (Criteria) this;
        }

        public Criteria andDpYnIn(List<String> values) {
            addCriterion("TI.DP_YN in", values, "dpYn");
            return (Criteria) this;
        }

        public Criteria andDpYnNotIn(List<String> values) {
            addCriterion("TI.DP_YN not in", values, "dpYn");
            return (Criteria) this;
        }

        public Criteria andDpYnBetween(String value1, String value2) {
            addCriterion("TI.DP_YN between", value1, value2, "dpYn");
            return (Criteria) this;
        }

        public Criteria andDpYnNotBetween(String value1, String value2) {
            addCriterion("TI.DP_YN not between", value1, value2, "dpYn");
            return (Criteria) this;
        }

        public Criteria andDpEnvCdIsNull() {
            addCriterion("TI.DP_ENV_CD is null");
            return (Criteria) this;
        }

        public Criteria andDpEnvCdIsNotNull() {
            addCriterion("TI.DP_ENV_CD is not null");
            return (Criteria) this;
        }

        public Criteria andDpEnvCdEqualTo(String value) {
            addCriterion("TI.DP_ENV_CD =", value, "dpEnvCd");
            return (Criteria) this;
        }

        public Criteria andDpEnvCdNotEqualTo(String value) {
            addCriterion("TI.DP_ENV_CD <>", value, "dpEnvCd");
            return (Criteria) this;
        }

        public Criteria andDpEnvCdGreaterThan(String value) {
            addCriterion("TI.DP_ENV_CD >", value, "dpEnvCd");
            return (Criteria) this;
        }

        public Criteria andDpEnvCdGreaterThanOrEqualTo(String value) {
            addCriterion("TI.DP_ENV_CD >=", value, "dpEnvCd");
            return (Criteria) this;
        }

        public Criteria andDpEnvCdLessThan(String value) {
            addCriterion("TI.DP_ENV_CD <", value, "dpEnvCd");
            return (Criteria) this;
        }

        public Criteria andDpEnvCdLessThanOrEqualTo(String value) {
            addCriterion("TI.DP_ENV_CD <=", value, "dpEnvCd");
            return (Criteria) this;
        }

        public Criteria andDpEnvCdLike(String value) {
            addCriterion("TI.DP_ENV_CD like", value, "dpEnvCd");
            return (Criteria) this;
        }

        public Criteria andDpEnvCdNotLike(String value) {
            addCriterion("TI.DP_ENV_CD not like", value, "dpEnvCd");
            return (Criteria) this;
        }

        public Criteria andDpEnvCdIn(List<String> values) {
            addCriterion("TI.DP_ENV_CD in", values, "dpEnvCd");
            return (Criteria) this;
        }

        public Criteria andDpEnvCdNotIn(List<String> values) {
            addCriterion("TI.DP_ENV_CD not in", values, "dpEnvCd");
            return (Criteria) this;
        }

        public Criteria andDpEnvCdBetween(String value1, String value2) {
            addCriterion("TI.DP_ENV_CD between", value1, value2, "dpEnvCd");
            return (Criteria) this;
        }

        public Criteria andDpEnvCdNotBetween(String value1, String value2) {
            addCriterion("TI.DP_ENV_CD not between", value1, value2, "dpEnvCd");
            return (Criteria) this;
        }

        public Criteria andCstmdYnIsNull() {
            addCriterion("TI.CSTMD_YN is null");
            return (Criteria) this;
        }

        public Criteria andCstmdYnIsNotNull() {
            addCriterion("TI.CSTMD_YN is not null");
            return (Criteria) this;
        }

        public Criteria andCstmdYnEqualTo(String value) {
            addCriterion("TI.CSTMD_YN =", value, "cstmdYn");
            return (Criteria) this;
        }

        public Criteria andCstmdYnNotEqualTo(String value) {
            addCriterion("TI.CSTMD_YN <>", value, "cstmdYn");
            return (Criteria) this;
        }

        public Criteria andCstmdYnGreaterThan(String value) {
            addCriterion("TI.CSTMD_YN >", value, "cstmdYn");
            return (Criteria) this;
        }

        public Criteria andCstmdYnGreaterThanOrEqualTo(String value) {
            addCriterion("TI.CSTMD_YN >=", value, "cstmdYn");
            return (Criteria) this;
        }

        public Criteria andCstmdYnLessThan(String value) {
            addCriterion("TI.CSTMD_YN <", value, "cstmdYn");
            return (Criteria) this;
        }

        public Criteria andCstmdYnLessThanOrEqualTo(String value) {
            addCriterion("TI.CSTMD_YN <=", value, "cstmdYn");
            return (Criteria) this;
        }

        public Criteria andCstmdYnLike(String value) {
            addCriterion("TI.CSTMD_YN like", value, "cstmdYn");
            return (Criteria) this;
        }

        public Criteria andCstmdYnNotLike(String value) {
            addCriterion("TI.CSTMD_YN not like", value, "cstmdYn");
            return (Criteria) this;
        }

        public Criteria andCstmdYnIn(List<String> values) {
            addCriterion("TI.CSTMD_YN in", values, "cstmdYn");
            return (Criteria) this;
        }

        public Criteria andCstmdYnNotIn(List<String> values) {
            addCriterion("TI.CSTMD_YN not in", values, "cstmdYn");
            return (Criteria) this;
        }

        public Criteria andCstmdYnBetween(String value1, String value2) {
            addCriterion("TI.CSTMD_YN between", value1, value2, "cstmdYn");
            return (Criteria) this;
        }

        public Criteria andCstmdYnNotBetween(String value1, String value2) {
            addCriterion("TI.CSTMD_YN not between", value1, value2, "cstmdYn");
            return (Criteria) this;
        }

        public Criteria andTaxClCdIsNull() {
            addCriterion("TI.TAX_CL_CD is null");
            return (Criteria) this;
        }

        public Criteria andTaxClCdIsNotNull() {
            addCriterion("TI.TAX_CL_CD is not null");
            return (Criteria) this;
        }

        public Criteria andTaxClCdEqualTo(String value) {
            addCriterion("TI.TAX_CL_CD =", value, "taxClCd");
            return (Criteria) this;
        }

        public Criteria andTaxClCdNotEqualTo(String value) {
            addCriterion("TI.TAX_CL_CD <>", value, "taxClCd");
            return (Criteria) this;
        }

        public Criteria andTaxClCdGreaterThan(String value) {
            addCriterion("TI.TAX_CL_CD >", value, "taxClCd");
            return (Criteria) this;
        }

        public Criteria andTaxClCdGreaterThanOrEqualTo(String value) {
            addCriterion("TI.TAX_CL_CD >=", value, "taxClCd");
            return (Criteria) this;
        }

        public Criteria andTaxClCdLessThan(String value) {
            addCriterion("TI.TAX_CL_CD <", value, "taxClCd");
            return (Criteria) this;
        }

        public Criteria andTaxClCdLessThanOrEqualTo(String value) {
            addCriterion("TI.TAX_CL_CD <=", value, "taxClCd");
            return (Criteria) this;
        }

        public Criteria andTaxClCdLike(String value) {
            addCriterion("TI.TAX_CL_CD like", value, "taxClCd");
            return (Criteria) this;
        }

        public Criteria andTaxClCdNotLike(String value) {
            addCriterion("TI.TAX_CL_CD not like", value, "taxClCd");
            return (Criteria) this;
        }

        public Criteria andTaxClCdIn(List<String> values) {
            addCriterion("TI.TAX_CL_CD in", values, "taxClCd");
            return (Criteria) this;
        }

        public Criteria andTaxClCdNotIn(List<String> values) {
            addCriterion("TI.TAX_CL_CD not in", values, "taxClCd");
            return (Criteria) this;
        }

        public Criteria andTaxClCdBetween(String value1, String value2) {
            addCriterion("TI.TAX_CL_CD between", value1, value2, "taxClCd");
            return (Criteria) this;
        }

        public Criteria andTaxClCdNotBetween(String value1, String value2) {
            addCriterion("TI.TAX_CL_CD not between", value1, value2, "taxClCd");
            return (Criteria) this;
        }

        public Criteria andSellUnitQtyIsNull() {
            addCriterion("TI.SELL_UNIT_QTY is null");
            return (Criteria) this;
        }

        public Criteria andSellUnitQtyIsNotNull() {
            addCriterion("TI.SELL_UNIT_QTY is not null");
            return (Criteria) this;
        }

        public Criteria andSellUnitQtyEqualTo(Integer value) {
            addCriterion("TI.SELL_UNIT_QTY =", value, "sellUnitQty");
            return (Criteria) this;
        }

        public Criteria andSellUnitQtyNotEqualTo(Integer value) {
            addCriterion("TI.SELL_UNIT_QTY <>", value, "sellUnitQty");
            return (Criteria) this;
        }

        public Criteria andSellUnitQtyGreaterThan(Integer value) {
            addCriterion("TI.SELL_UNIT_QTY >", value, "sellUnitQty");
            return (Criteria) this;
        }

        public Criteria andSellUnitQtyGreaterThanOrEqualTo(Integer value) {
            addCriterion("TI.SELL_UNIT_QTY >=", value, "sellUnitQty");
            return (Criteria) this;
        }

        public Criteria andSellUnitQtyLessThan(Integer value) {
            addCriterion("TI.SELL_UNIT_QTY <", value, "sellUnitQty");
            return (Criteria) this;
        }

        public Criteria andSellUnitQtyLessThanOrEqualTo(Integer value) {
            addCriterion("TI.SELL_UNIT_QTY <=", value, "sellUnitQty");
            return (Criteria) this;
        }

        public Criteria andSellUnitQtyIn(List<Integer> values) {
            addCriterion("TI.SELL_UNIT_QTY in", values, "sellUnitQty");
            return (Criteria) this;
        }

        public Criteria andSellUnitQtyNotIn(List<Integer> values) {
            addCriterion("TI.SELL_UNIT_QTY not in", values, "sellUnitQty");
            return (Criteria) this;
        }

        public Criteria andSellUnitQtyBetween(Integer value1, Integer value2) {
            addCriterion("TI.SELL_UNIT_QTY between", value1, value2, "sellUnitQty");
            return (Criteria) this;
        }

        public Criteria andSellUnitQtyNotBetween(Integer value1, Integer value2) {
            addCriterion("TI.SELL_UNIT_QTY not between", value1, value2, "sellUnitQty");
            return (Criteria) this;
        }

        public Criteria andSellPerdLimYnIsNull() {
            addCriterion("TI.SELL_PERD_LIM_YN is null");
            return (Criteria) this;
        }

        public Criteria andSellPerdLimYnIsNotNull() {
            addCriterion("TI.SELL_PERD_LIM_YN is not null");
            return (Criteria) this;
        }

        public Criteria andSellPerdLimYnEqualTo(String value) {
            addCriterion("TI.SELL_PERD_LIM_YN =", value, "sellPerdLimYn");
            return (Criteria) this;
        }

        public Criteria andSellPerdLimYnNotEqualTo(String value) {
            addCriterion("TI.SELL_PERD_LIM_YN <>", value, "sellPerdLimYn");
            return (Criteria) this;
        }

        public Criteria andSellPerdLimYnGreaterThan(String value) {
            addCriterion("TI.SELL_PERD_LIM_YN >", value, "sellPerdLimYn");
            return (Criteria) this;
        }

        public Criteria andSellPerdLimYnGreaterThanOrEqualTo(String value) {
            addCriterion("TI.SELL_PERD_LIM_YN >=", value, "sellPerdLimYn");
            return (Criteria) this;
        }

        public Criteria andSellPerdLimYnLessThan(String value) {
            addCriterion("TI.SELL_PERD_LIM_YN <", value, "sellPerdLimYn");
            return (Criteria) this;
        }

        public Criteria andSellPerdLimYnLessThanOrEqualTo(String value) {
            addCriterion("TI.SELL_PERD_LIM_YN <=", value, "sellPerdLimYn");
            return (Criteria) this;
        }

        public Criteria andSellPerdLimYnLike(String value) {
            addCriterion("TI.SELL_PERD_LIM_YN like", value, "sellPerdLimYn");
            return (Criteria) this;
        }

        public Criteria andSellPerdLimYnNotLike(String value) {
            addCriterion("TI.SELL_PERD_LIM_YN not like", value, "sellPerdLimYn");
            return (Criteria) this;
        }

        public Criteria andSellPerdLimYnIn(List<String> values) {
            addCriterion("TI.SELL_PERD_LIM_YN in", values, "sellPerdLimYn");
            return (Criteria) this;
        }

        public Criteria andSellPerdLimYnNotIn(List<String> values) {
            addCriterion("TI.SELL_PERD_LIM_YN not in", values, "sellPerdLimYn");
            return (Criteria) this;
        }

        public Criteria andSellPerdLimYnBetween(String value1, String value2) {
            addCriterion("TI.SELL_PERD_LIM_YN between", value1, value2, "sellPerdLimYn");
            return (Criteria) this;
        }

        public Criteria andSellPerdLimYnNotBetween(String value1, String value2) {
            addCriterion("TI.SELL_PERD_LIM_YN not between", value1, value2, "sellPerdLimYn");
            return (Criteria) this;
        }

        public Criteria andSellPerdLimStDtIsNull() {
            addCriterion("TI.SELL_PERD_LIM_ST_DT is null");
            return (Criteria) this;
        }

        public Criteria andSellPerdLimStDtIsNotNull() {
            addCriterion("TI.SELL_PERD_LIM_ST_DT is not null");
            return (Criteria) this;
        }

        public Criteria andSellPerdLimStDtEqualTo(Date value) {
            addCriterionForJDBCDate("TI.SELL_PERD_LIM_ST_DT =", value, "sellPerdLimStDt");
            return (Criteria) this;
        }

        public Criteria andSellPerdLimStDtNotEqualTo(Date value) {
            addCriterionForJDBCDate("TI.SELL_PERD_LIM_ST_DT <>", value, "sellPerdLimStDt");
            return (Criteria) this;
        }

        public Criteria andSellPerdLimStDtGreaterThan(Date value) {
            addCriterionForJDBCDate("TI.SELL_PERD_LIM_ST_DT >", value, "sellPerdLimStDt");
            return (Criteria) this;
        }

        public Criteria andSellPerdLimStDtGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("TI.SELL_PERD_LIM_ST_DT >=", value, "sellPerdLimStDt");
            return (Criteria) this;
        }

        public Criteria andSellPerdLimStDtLessThan(Date value) {
            addCriterionForJDBCDate("TI.SELL_PERD_LIM_ST_DT <", value, "sellPerdLimStDt");
            return (Criteria) this;
        }

        public Criteria andSellPerdLimStDtLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("TI.SELL_PERD_LIM_ST_DT <=", value, "sellPerdLimStDt");
            return (Criteria) this;
        }

        public Criteria andSellPerdLimStDtIn(List<Date> values) {
            addCriterionForJDBCDate("TI.SELL_PERD_LIM_ST_DT in", values, "sellPerdLimStDt");
            return (Criteria) this;
        }

        public Criteria andSellPerdLimStDtNotIn(List<Date> values) {
            addCriterionForJDBCDate("TI.SELL_PERD_LIM_ST_DT not in", values, "sellPerdLimStDt");
            return (Criteria) this;
        }

        public Criteria andSellPerdLimStDtBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("TI.SELL_PERD_LIM_ST_DT between", value1, value2, "sellPerdLimStDt");
            return (Criteria) this;
        }

        public Criteria andSellPerdLimStDtNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("TI.SELL_PERD_LIM_ST_DT not between", value1, value2, "sellPerdLimStDt");
            return (Criteria) this;
        }

        public Criteria andSellPerdLimEdDtIsNull() {
            addCriterion("TI.SELL_PERD_LIM_ED_DT is null");
            return (Criteria) this;
        }

        public Criteria andSellPerdLimEdDtIsNotNull() {
            addCriterion("TI.SELL_PERD_LIM_ED_DT is not null");
            return (Criteria) this;
        }

        public Criteria andSellPerdLimEdDtEqualTo(Date value) {
            addCriterionForJDBCDate("TI.SELL_PERD_LIM_ED_DT =", value, "sellPerdLimEdDt");
            return (Criteria) this;
        }

        public Criteria andSellPerdLimEdDtNotEqualTo(Date value) {
            addCriterionForJDBCDate("TI.SELL_PERD_LIM_ED_DT <>", value, "sellPerdLimEdDt");
            return (Criteria) this;
        }

        public Criteria andSellPerdLimEdDtGreaterThan(Date value) {
            addCriterionForJDBCDate("TI.SELL_PERD_LIM_ED_DT >", value, "sellPerdLimEdDt");
            return (Criteria) this;
        }

        public Criteria andSellPerdLimEdDtGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("TI.SELL_PERD_LIM_ED_DT >=", value, "sellPerdLimEdDt");
            return (Criteria) this;
        }

        public Criteria andSellPerdLimEdDtLessThan(Date value) {
            addCriterionForJDBCDate("TI.SELL_PERD_LIM_ED_DT <", value, "sellPerdLimEdDt");
            return (Criteria) this;
        }

        public Criteria andSellPerdLimEdDtLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("TI.SELL_PERD_LIM_ED_DT <=", value, "sellPerdLimEdDt");
            return (Criteria) this;
        }

        public Criteria andSellPerdLimEdDtIn(List<Date> values) {
            addCriterionForJDBCDate("TI.SELL_PERD_LIM_ED_DT in", values, "sellPerdLimEdDt");
            return (Criteria) this;
        }

        public Criteria andSellPerdLimEdDtNotIn(List<Date> values) {
            addCriterionForJDBCDate("TI.SELL_PERD_LIM_ED_DT not in", values, "sellPerdLimEdDt");
            return (Criteria) this;
        }

        public Criteria andSellPerdLimEdDtBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("TI.SELL_PERD_LIM_ED_DT between", value1, value2, "sellPerdLimEdDt");
            return (Criteria) this;
        }

        public Criteria andSellPerdLimEdDtNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("TI.SELL_PERD_LIM_ED_DT not between", value1, value2, "sellPerdLimEdDt");
            return (Criteria) this;
        }

        public Criteria andCpnUsePsblYnIsNull() {
            addCriterion("TI.CPN_USE_PSBL_YN is null");
            return (Criteria) this;
        }

        public Criteria andCpnUsePsblYnIsNotNull() {
            addCriterion("TI.CPN_USE_PSBL_YN is not null");
            return (Criteria) this;
        }

        public Criteria andCpnUsePsblYnEqualTo(String value) {
            addCriterion("TI.CPN_USE_PSBL_YN =", value, "cpnUsePsblYn");
            return (Criteria) this;
        }

        public Criteria andCpnUsePsblYnNotEqualTo(String value) {
            addCriterion("TI.CPN_USE_PSBL_YN <>", value, "cpnUsePsblYn");
            return (Criteria) this;
        }

        public Criteria andCpnUsePsblYnGreaterThan(String value) {
            addCriterion("TI.CPN_USE_PSBL_YN >", value, "cpnUsePsblYn");
            return (Criteria) this;
        }

        public Criteria andCpnUsePsblYnGreaterThanOrEqualTo(String value) {
            addCriterion("TI.CPN_USE_PSBL_YN >=", value, "cpnUsePsblYn");
            return (Criteria) this;
        }

        public Criteria andCpnUsePsblYnLessThan(String value) {
            addCriterion("TI.CPN_USE_PSBL_YN <", value, "cpnUsePsblYn");
            return (Criteria) this;
        }

        public Criteria andCpnUsePsblYnLessThanOrEqualTo(String value) {
            addCriterion("TI.CPN_USE_PSBL_YN <=", value, "cpnUsePsblYn");
            return (Criteria) this;
        }

        public Criteria andCpnUsePsblYnLike(String value) {
            addCriterion("TI.CPN_USE_PSBL_YN like", value, "cpnUsePsblYn");
            return (Criteria) this;
        }

        public Criteria andCpnUsePsblYnNotLike(String value) {
            addCriterion("TI.CPN_USE_PSBL_YN not like", value, "cpnUsePsblYn");
            return (Criteria) this;
        }

        public Criteria andCpnUsePsblYnIn(List<String> values) {
            addCriterion("TI.CPN_USE_PSBL_YN in", values, "cpnUsePsblYn");
            return (Criteria) this;
        }

        public Criteria andCpnUsePsblYnNotIn(List<String> values) {
            addCriterion("TI.CPN_USE_PSBL_YN not in", values, "cpnUsePsblYn");
            return (Criteria) this;
        }

        public Criteria andCpnUsePsblYnBetween(String value1, String value2) {
            addCriterion("TI.CPN_USE_PSBL_YN between", value1, value2, "cpnUsePsblYn");
            return (Criteria) this;
        }

        public Criteria andCpnUsePsblYnNotBetween(String value1, String value2) {
            addCriterion("TI.CPN_USE_PSBL_YN not between", value1, value2, "cpnUsePsblYn");
            return (Criteria) this;
        }

        public Criteria andPtSaveTpCdIsNull() {
            addCriterion("TI.PT_SAVE_TP_CD is null");
            return (Criteria) this;
        }

        public Criteria andPtSaveTpCdIsNotNull() {
            addCriterion("TI.PT_SAVE_TP_CD is not null");
            return (Criteria) this;
        }

        public Criteria andPtSaveTpCdEqualTo(String value) {
            addCriterion("TI.PT_SAVE_TP_CD =", value, "ptSaveTpCd");
            return (Criteria) this;
        }

        public Criteria andPtSaveTpCdNotEqualTo(String value) {
            addCriterion("TI.PT_SAVE_TP_CD <>", value, "ptSaveTpCd");
            return (Criteria) this;
        }

        public Criteria andPtSaveTpCdGreaterThan(String value) {
            addCriterion("TI.PT_SAVE_TP_CD >", value, "ptSaveTpCd");
            return (Criteria) this;
        }

        public Criteria andPtSaveTpCdGreaterThanOrEqualTo(String value) {
            addCriterion("TI.PT_SAVE_TP_CD >=", value, "ptSaveTpCd");
            return (Criteria) this;
        }

        public Criteria andPtSaveTpCdLessThan(String value) {
            addCriterion("TI.PT_SAVE_TP_CD <", value, "ptSaveTpCd");
            return (Criteria) this;
        }

        public Criteria andPtSaveTpCdLessThanOrEqualTo(String value) {
            addCriterion("TI.PT_SAVE_TP_CD <=", value, "ptSaveTpCd");
            return (Criteria) this;
        }

        public Criteria andPtSaveTpCdLike(String value) {
            addCriterion("TI.PT_SAVE_TP_CD like", value, "ptSaveTpCd");
            return (Criteria) this;
        }

        public Criteria andPtSaveTpCdNotLike(String value) {
            addCriterion("TI.PT_SAVE_TP_CD not like", value, "ptSaveTpCd");
            return (Criteria) this;
        }

        public Criteria andPtSaveTpCdIn(List<String> values) {
            addCriterion("TI.PT_SAVE_TP_CD in", values, "ptSaveTpCd");
            return (Criteria) this;
        }

        public Criteria andPtSaveTpCdNotIn(List<String> values) {
            addCriterion("TI.PT_SAVE_TP_CD not in", values, "ptSaveTpCd");
            return (Criteria) this;
        }

        public Criteria andPtSaveTpCdBetween(String value1, String value2) {
            addCriterion("TI.PT_SAVE_TP_CD between", value1, value2, "ptSaveTpCd");
            return (Criteria) this;
        }

        public Criteria andPtSaveTpCdNotBetween(String value1, String value2) {
            addCriterion("TI.PT_SAVE_TP_CD not between", value1, value2, "ptSaveTpCd");
            return (Criteria) this;
        }

        public Criteria andPtSaveMethCdIsNull() {
            addCriterion("TI.PT_SAVE_METH_CD is null");
            return (Criteria) this;
        }

        public Criteria andPtSaveMethCdIsNotNull() {
            addCriterion("TI.PT_SAVE_METH_CD is not null");
            return (Criteria) this;
        }

        public Criteria andPtSaveMethCdEqualTo(String value) {
            addCriterion("TI.PT_SAVE_METH_CD =", value, "ptSaveMethCd");
            return (Criteria) this;
        }

        public Criteria andPtSaveMethCdNotEqualTo(String value) {
            addCriterion("TI.PT_SAVE_METH_CD <>", value, "ptSaveMethCd");
            return (Criteria) this;
        }

        public Criteria andPtSaveMethCdGreaterThan(String value) {
            addCriterion("TI.PT_SAVE_METH_CD >", value, "ptSaveMethCd");
            return (Criteria) this;
        }

        public Criteria andPtSaveMethCdGreaterThanOrEqualTo(String value) {
            addCriterion("TI.PT_SAVE_METH_CD >=", value, "ptSaveMethCd");
            return (Criteria) this;
        }

        public Criteria andPtSaveMethCdLessThan(String value) {
            addCriterion("TI.PT_SAVE_METH_CD <", value, "ptSaveMethCd");
            return (Criteria) this;
        }

        public Criteria andPtSaveMethCdLessThanOrEqualTo(String value) {
            addCriterion("TI.PT_SAVE_METH_CD <=", value, "ptSaveMethCd");
            return (Criteria) this;
        }

        public Criteria andPtSaveMethCdLike(String value) {
            addCriterion("TI.PT_SAVE_METH_CD like", value, "ptSaveMethCd");
            return (Criteria) this;
        }

        public Criteria andPtSaveMethCdNotLike(String value) {
            addCriterion("TI.PT_SAVE_METH_CD not like", value, "ptSaveMethCd");
            return (Criteria) this;
        }

        public Criteria andPtSaveMethCdIn(List<String> values) {
            addCriterion("TI.PT_SAVE_METH_CD in", values, "ptSaveMethCd");
            return (Criteria) this;
        }

        public Criteria andPtSaveMethCdNotIn(List<String> values) {
            addCriterion("TI.PT_SAVE_METH_CD not in", values, "ptSaveMethCd");
            return (Criteria) this;
        }

        public Criteria andPtSaveMethCdBetween(String value1, String value2) {
            addCriterion("TI.PT_SAVE_METH_CD between", value1, value2, "ptSaveMethCd");
            return (Criteria) this;
        }

        public Criteria andPtSaveMethCdNotBetween(String value1, String value2) {
            addCriterion("TI.PT_SAVE_METH_CD not between", value1, value2, "ptSaveMethCd");
            return (Criteria) this;
        }

        public Criteria andPtSaveRateIsNull() {
            addCriterion("TI.PT_SAVE_RATE is null");
            return (Criteria) this;
        }

        public Criteria andPtSaveRateIsNotNull() {
            addCriterion("TI.PT_SAVE_RATE is not null");
            return (Criteria) this;
        }

        public Criteria andPtSaveRateEqualTo(BigDecimal value) {
            addCriterion("TI.PT_SAVE_RATE =", value, "ptSaveRate");
            return (Criteria) this;
        }

        public Criteria andPtSaveRateNotEqualTo(BigDecimal value) {
            addCriterion("TI.PT_SAVE_RATE <>", value, "ptSaveRate");
            return (Criteria) this;
        }

        public Criteria andPtSaveRateGreaterThan(BigDecimal value) {
            addCriterion("TI.PT_SAVE_RATE >", value, "ptSaveRate");
            return (Criteria) this;
        }

        public Criteria andPtSaveRateGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("TI.PT_SAVE_RATE >=", value, "ptSaveRate");
            return (Criteria) this;
        }

        public Criteria andPtSaveRateLessThan(BigDecimal value) {
            addCriterion("TI.PT_SAVE_RATE <", value, "ptSaveRate");
            return (Criteria) this;
        }

        public Criteria andPtSaveRateLessThanOrEqualTo(BigDecimal value) {
            addCriterion("TI.PT_SAVE_RATE <=", value, "ptSaveRate");
            return (Criteria) this;
        }

        public Criteria andPtSaveRateIn(List<BigDecimal> values) {
            addCriterion("TI.PT_SAVE_RATE in", values, "ptSaveRate");
            return (Criteria) this;
        }

        public Criteria andPtSaveRateNotIn(List<BigDecimal> values) {
            addCriterion("TI.PT_SAVE_RATE not in", values, "ptSaveRate");
            return (Criteria) this;
        }

        public Criteria andPtSaveRateBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TI.PT_SAVE_RATE between", value1, value2, "ptSaveRate");
            return (Criteria) this;
        }

        public Criteria andPtSaveRateNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TI.PT_SAVE_RATE not between", value1, value2, "ptSaveRate");
            return (Criteria) this;
        }

        public Criteria andPtSaveAmtIsNull() {
            addCriterion("TI.PT_SAVE_AMT is null");
            return (Criteria) this;
        }

        public Criteria andPtSaveAmtIsNotNull() {
            addCriterion("TI.PT_SAVE_AMT is not null");
            return (Criteria) this;
        }

        public Criteria andPtSaveAmtEqualTo(Integer value) {
            addCriterion("TI.PT_SAVE_AMT =", value, "ptSaveAmt");
            return (Criteria) this;
        }

        public Criteria andPtSaveAmtNotEqualTo(Integer value) {
            addCriterion("TI.PT_SAVE_AMT <>", value, "ptSaveAmt");
            return (Criteria) this;
        }

        public Criteria andPtSaveAmtGreaterThan(Integer value) {
            addCriterion("TI.PT_SAVE_AMT >", value, "ptSaveAmt");
            return (Criteria) this;
        }

        public Criteria andPtSaveAmtGreaterThanOrEqualTo(Integer value) {
            addCriterion("TI.PT_SAVE_AMT >=", value, "ptSaveAmt");
            return (Criteria) this;
        }

        public Criteria andPtSaveAmtLessThan(Integer value) {
            addCriterion("TI.PT_SAVE_AMT <", value, "ptSaveAmt");
            return (Criteria) this;
        }

        public Criteria andPtSaveAmtLessThanOrEqualTo(Integer value) {
            addCriterion("TI.PT_SAVE_AMT <=", value, "ptSaveAmt");
            return (Criteria) this;
        }

        public Criteria andPtSaveAmtIn(List<Integer> values) {
            addCriterion("TI.PT_SAVE_AMT in", values, "ptSaveAmt");
            return (Criteria) this;
        }

        public Criteria andPtSaveAmtNotIn(List<Integer> values) {
            addCriterion("TI.PT_SAVE_AMT not in", values, "ptSaveAmt");
            return (Criteria) this;
        }

        public Criteria andPtSaveAmtBetween(Integer value1, Integer value2) {
            addCriterion("TI.PT_SAVE_AMT between", value1, value2, "ptSaveAmt");
            return (Criteria) this;
        }

        public Criteria andPtSaveAmtNotBetween(Integer value1, Integer value2) {
            addCriterion("TI.PT_SAVE_AMT not between", value1, value2, "ptSaveAmt");
            return (Criteria) this;
        }

        public Criteria andOrdResMaxQtyIsNull() {
            addCriterion("TI.ORD_RES_MAX_QTY is null");
            return (Criteria) this;
        }

        public Criteria andOrdResMaxQtyIsNotNull() {
            addCriterion("TI.ORD_RES_MAX_QTY is not null");
            return (Criteria) this;
        }

        public Criteria andOrdResMaxQtyEqualTo(Integer value) {
            addCriterion("TI.ORD_RES_MAX_QTY =", value, "ordResMaxQty");
            return (Criteria) this;
        }

        public Criteria andOrdResMaxQtyNotEqualTo(Integer value) {
            addCriterion("TI.ORD_RES_MAX_QTY <>", value, "ordResMaxQty");
            return (Criteria) this;
        }

        public Criteria andOrdResMaxQtyGreaterThan(Integer value) {
            addCriterion("TI.ORD_RES_MAX_QTY >", value, "ordResMaxQty");
            return (Criteria) this;
        }

        public Criteria andOrdResMaxQtyGreaterThanOrEqualTo(Integer value) {
            addCriterion("TI.ORD_RES_MAX_QTY >=", value, "ordResMaxQty");
            return (Criteria) this;
        }

        public Criteria andOrdResMaxQtyLessThan(Integer value) {
            addCriterion("TI.ORD_RES_MAX_QTY <", value, "ordResMaxQty");
            return (Criteria) this;
        }

        public Criteria andOrdResMaxQtyLessThanOrEqualTo(Integer value) {
            addCriterion("TI.ORD_RES_MAX_QTY <=", value, "ordResMaxQty");
            return (Criteria) this;
        }

        public Criteria andOrdResMaxQtyIn(List<Integer> values) {
            addCriterion("TI.ORD_RES_MAX_QTY in", values, "ordResMaxQty");
            return (Criteria) this;
        }

        public Criteria andOrdResMaxQtyNotIn(List<Integer> values) {
            addCriterion("TI.ORD_RES_MAX_QTY not in", values, "ordResMaxQty");
            return (Criteria) this;
        }

        public Criteria andOrdResMaxQtyBetween(Integer value1, Integer value2) {
            addCriterion("TI.ORD_RES_MAX_QTY between", value1, value2, "ordResMaxQty");
            return (Criteria) this;
        }

        public Criteria andOrdResMaxQtyNotBetween(Integer value1, Integer value2) {
            addCriterion("TI.ORD_RES_MAX_QTY not between", value1, value2, "ordResMaxQty");
            return (Criteria) this;
        }

        public Criteria andWahsNotiYnIsNull() {
            addCriterion("TI.WAHS_NOTI_YN is null");
            return (Criteria) this;
        }

        public Criteria andWahsNotiYnIsNotNull() {
            addCriterion("TI.WAHS_NOTI_YN is not null");
            return (Criteria) this;
        }

        public Criteria andWahsNotiYnEqualTo(String value) {
            addCriterion("TI.WAHS_NOTI_YN =", value, "wahsNotiYn");
            return (Criteria) this;
        }

        public Criteria andWahsNotiYnNotEqualTo(String value) {
            addCriterion("TI.WAHS_NOTI_YN <>", value, "wahsNotiYn");
            return (Criteria) this;
        }

        public Criteria andWahsNotiYnGreaterThan(String value) {
            addCriterion("TI.WAHS_NOTI_YN >", value, "wahsNotiYn");
            return (Criteria) this;
        }

        public Criteria andWahsNotiYnGreaterThanOrEqualTo(String value) {
            addCriterion("TI.WAHS_NOTI_YN >=", value, "wahsNotiYn");
            return (Criteria) this;
        }

        public Criteria andWahsNotiYnLessThan(String value) {
            addCriterion("TI.WAHS_NOTI_YN <", value, "wahsNotiYn");
            return (Criteria) this;
        }

        public Criteria andWahsNotiYnLessThanOrEqualTo(String value) {
            addCriterion("TI.WAHS_NOTI_YN <=", value, "wahsNotiYn");
            return (Criteria) this;
        }

        public Criteria andWahsNotiYnLike(String value) {
            addCriterion("TI.WAHS_NOTI_YN like", value, "wahsNotiYn");
            return (Criteria) this;
        }

        public Criteria andWahsNotiYnNotLike(String value) {
            addCriterion("TI.WAHS_NOTI_YN not like", value, "wahsNotiYn");
            return (Criteria) this;
        }

        public Criteria andWahsNotiYnIn(List<String> values) {
            addCriterion("TI.WAHS_NOTI_YN in", values, "wahsNotiYn");
            return (Criteria) this;
        }

        public Criteria andWahsNotiYnNotIn(List<String> values) {
            addCriterion("TI.WAHS_NOTI_YN not in", values, "wahsNotiYn");
            return (Criteria) this;
        }

        public Criteria andWahsNotiYnBetween(String value1, String value2) {
            addCriterion("TI.WAHS_NOTI_YN between", value1, value2, "wahsNotiYn");
            return (Criteria) this;
        }

        public Criteria andWahsNotiYnNotBetween(String value1, String value2) {
            addCriterion("TI.WAHS_NOTI_YN not between", value1, value2, "wahsNotiYn");
            return (Criteria) this;
        }

        public Criteria andItemInfoNotiInptMethCdIsNull() {
            addCriterion("TI.ITEM_INFO_NOTI_INPT_METH_CD is null");
            return (Criteria) this;
        }

        public Criteria andItemInfoNotiInptMethCdIsNotNull() {
            addCriterion("TI.ITEM_INFO_NOTI_INPT_METH_CD is not null");
            return (Criteria) this;
        }

        public Criteria andItemInfoNotiInptMethCdEqualTo(String value) {
            addCriterion("TI.ITEM_INFO_NOTI_INPT_METH_CD =", value, "itemInfoNotiInptMethCd");
            return (Criteria) this;
        }

        public Criteria andItemInfoNotiInptMethCdNotEqualTo(String value) {
            addCriterion("TI.ITEM_INFO_NOTI_INPT_METH_CD <>", value, "itemInfoNotiInptMethCd");
            return (Criteria) this;
        }

        public Criteria andItemInfoNotiInptMethCdGreaterThan(String value) {
            addCriterion("TI.ITEM_INFO_NOTI_INPT_METH_CD >", value, "itemInfoNotiInptMethCd");
            return (Criteria) this;
        }

        public Criteria andItemInfoNotiInptMethCdGreaterThanOrEqualTo(String value) {
            addCriterion("TI.ITEM_INFO_NOTI_INPT_METH_CD >=", value, "itemInfoNotiInptMethCd");
            return (Criteria) this;
        }

        public Criteria andItemInfoNotiInptMethCdLessThan(String value) {
            addCriterion("TI.ITEM_INFO_NOTI_INPT_METH_CD <", value, "itemInfoNotiInptMethCd");
            return (Criteria) this;
        }

        public Criteria andItemInfoNotiInptMethCdLessThanOrEqualTo(String value) {
            addCriterion("TI.ITEM_INFO_NOTI_INPT_METH_CD <=", value, "itemInfoNotiInptMethCd");
            return (Criteria) this;
        }

        public Criteria andItemInfoNotiInptMethCdLike(String value) {
            addCriterion("TI.ITEM_INFO_NOTI_INPT_METH_CD like", value, "itemInfoNotiInptMethCd");
            return (Criteria) this;
        }

        public Criteria andItemInfoNotiInptMethCdNotLike(String value) {
            addCriterion("TI.ITEM_INFO_NOTI_INPT_METH_CD not like", value, "itemInfoNotiInptMethCd");
            return (Criteria) this;
        }

        public Criteria andItemInfoNotiInptMethCdIn(List<String> values) {
            addCriterion("TI.ITEM_INFO_NOTI_INPT_METH_CD in", values, "itemInfoNotiInptMethCd");
            return (Criteria) this;
        }

        public Criteria andItemInfoNotiInptMethCdNotIn(List<String> values) {
            addCriterion("TI.ITEM_INFO_NOTI_INPT_METH_CD not in", values, "itemInfoNotiInptMethCd");
            return (Criteria) this;
        }

        public Criteria andItemInfoNotiInptMethCdBetween(String value1, String value2) {
            addCriterion("TI.ITEM_INFO_NOTI_INPT_METH_CD between", value1, value2, "itemInfoNotiInptMethCd");
            return (Criteria) this;
        }

        public Criteria andItemInfoNotiInptMethCdNotBetween(String value1, String value2) {
            addCriterion("TI.ITEM_INFO_NOTI_INPT_METH_CD not between", value1, value2, "itemInfoNotiInptMethCd");
            return (Criteria) this;
        }

        public Criteria andItemInfoNotiRegDtIsNull() {
            addCriterion("TI.ITEM_INFO_NOTI_REG_DT is null");
            return (Criteria) this;
        }

        public Criteria andItemInfoNotiRegDtIsNotNull() {
            addCriterion("TI.ITEM_INFO_NOTI_REG_DT is not null");
            return (Criteria) this;
        }

        public Criteria andItemInfoNotiRegDtEqualTo(Date value) {
            addCriterion("TI.ITEM_INFO_NOTI_REG_DT =", value, "itemInfoNotiRegDt");
            return (Criteria) this;
        }

        public Criteria andItemInfoNotiRegDtNotEqualTo(Date value) {
            addCriterion("TI.ITEM_INFO_NOTI_REG_DT <>", value, "itemInfoNotiRegDt");
            return (Criteria) this;
        }

        public Criteria andItemInfoNotiRegDtGreaterThan(Date value) {
            addCriterion("TI.ITEM_INFO_NOTI_REG_DT >", value, "itemInfoNotiRegDt");
            return (Criteria) this;
        }

        public Criteria andItemInfoNotiRegDtGreaterThanOrEqualTo(Date value) {
            addCriterion("TI.ITEM_INFO_NOTI_REG_DT >=", value, "itemInfoNotiRegDt");
            return (Criteria) this;
        }

        public Criteria andItemInfoNotiRegDtLessThan(Date value) {
            addCriterion("TI.ITEM_INFO_NOTI_REG_DT <", value, "itemInfoNotiRegDt");
            return (Criteria) this;
        }

        public Criteria andItemInfoNotiRegDtLessThanOrEqualTo(Date value) {
            addCriterion("TI.ITEM_INFO_NOTI_REG_DT <=", value, "itemInfoNotiRegDt");
            return (Criteria) this;
        }

        public Criteria andItemInfoNotiRegDtIn(List<Date> values) {
            addCriterion("TI.ITEM_INFO_NOTI_REG_DT in", values, "itemInfoNotiRegDt");
            return (Criteria) this;
        }

        public Criteria andItemInfoNotiRegDtNotIn(List<Date> values) {
            addCriterion("TI.ITEM_INFO_NOTI_REG_DT not in", values, "itemInfoNotiRegDt");
            return (Criteria) this;
        }

        public Criteria andItemInfoNotiRegDtBetween(Date value1, Date value2) {
            addCriterion("TI.ITEM_INFO_NOTI_REG_DT between", value1, value2, "itemInfoNotiRegDt");
            return (Criteria) this;
        }

        public Criteria andItemInfoNotiRegDtNotBetween(Date value1, Date value2) {
            addCriterion("TI.ITEM_INFO_NOTI_REG_DT not between", value1, value2, "itemInfoNotiRegDt");
            return (Criteria) this;
        }

        public Criteria andMemoIsNull() {
            addCriterion("TI.MEMO is null");
            return (Criteria) this;
        }

        public Criteria andMemoIsNotNull() {
            addCriterion("TI.MEMO is not null");
            return (Criteria) this;
        }

        public Criteria andMemoEqualTo(String value) {
            addCriterion("TI.MEMO =", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoNotEqualTo(String value) {
            addCriterion("TI.MEMO <>", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoGreaterThan(String value) {
            addCriterion("TI.MEMO >", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoGreaterThanOrEqualTo(String value) {
            addCriterion("TI.MEMO >=", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoLessThan(String value) {
            addCriterion("TI.MEMO <", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoLessThanOrEqualTo(String value) {
            addCriterion("TI.MEMO <=", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoLike(String value) {
            addCriterion("TI.MEMO like", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoNotLike(String value) {
            addCriterion("TI.MEMO not like", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoIn(List<String> values) {
            addCriterion("TI.MEMO in", values, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoNotIn(List<String> values) {
            addCriterion("TI.MEMO not in", values, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoBetween(String value1, String value2) {
            addCriterion("TI.MEMO between", value1, value2, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoNotBetween(String value1, String value2) {
            addCriterion("TI.MEMO not between", value1, value2, "memo");
            return (Criteria) this;
        }

        public Criteria andRegDtIsNull() {
            addCriterion("TI.REG_DT is null");
            return (Criteria) this;
        }

        public Criteria andRegDtIsNotNull() {
            addCriterion("TI.REG_DT is not null");
            return (Criteria) this;
        }

        public Criteria andRegDtEqualTo(Date value) {
            addCriterion("TI.REG_DT =", value, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtNotEqualTo(Date value) {
            addCriterion("TI.REG_DT <>", value, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtGreaterThan(Date value) {
            addCriterion("TI.REG_DT >", value, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtGreaterThanOrEqualTo(Date value) {
            addCriterion("TI.REG_DT >=", value, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtLessThan(Date value) {
            addCriterion("TI.REG_DT <", value, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtLessThanOrEqualTo(Date value) {
            addCriterion("TI.REG_DT <=", value, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtIn(List<Date> values) {
            addCriterion("TI.REG_DT in", values, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtNotIn(List<Date> values) {
            addCriterion("TI.REG_DT not in", values, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtBetween(Date value1, Date value2) {
            addCriterion("TI.REG_DT between", value1, value2, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtNotBetween(Date value1, Date value2) {
            addCriterion("TI.REG_DT not between", value1, value2, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegIdIsNull() {
            addCriterion("TI.REG_ID is null");
            return (Criteria) this;
        }

        public Criteria andRegIdIsNotNull() {
            addCriterion("TI.REG_ID is not null");
            return (Criteria) this;
        }

        public Criteria andRegIdEqualTo(String value) {
            addCriterion("TI.REG_ID =", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdNotEqualTo(String value) {
            addCriterion("TI.REG_ID <>", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdGreaterThan(String value) {
            addCriterion("TI.REG_ID >", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdGreaterThanOrEqualTo(String value) {
            addCriterion("TI.REG_ID >=", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdLessThan(String value) {
            addCriterion("TI.REG_ID <", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdLessThanOrEqualTo(String value) {
            addCriterion("TI.REG_ID <=", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdLike(String value) {
            addCriterion("TI.REG_ID like", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdNotLike(String value) {
            addCriterion("TI.REG_ID not like", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdIn(List<String> values) {
            addCriterion("TI.REG_ID in", values, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdNotIn(List<String> values) {
            addCriterion("TI.REG_ID not in", values, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdBetween(String value1, String value2) {
            addCriterion("TI.REG_ID between", value1, value2, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdNotBetween(String value1, String value2) {
            addCriterion("TI.REG_ID not between", value1, value2, "regId");
            return (Criteria) this;
        }

        public Criteria andModDtIsNull() {
            addCriterion("TI.MOD_DT is null");
            return (Criteria) this;
        }

        public Criteria andModDtIsNotNull() {
            addCriterion("TI.MOD_DT is not null");
            return (Criteria) this;
        }

        public Criteria andModDtEqualTo(Date value) {
            addCriterion("TI.MOD_DT =", value, "modDt");
            return (Criteria) this;
        }

        public Criteria andModDtNotEqualTo(Date value) {
            addCriterion("TI.MOD_DT <>", value, "modDt");
            return (Criteria) this;
        }

        public Criteria andModDtGreaterThan(Date value) {
            addCriterion("TI.MOD_DT >", value, "modDt");
            return (Criteria) this;
        }

        public Criteria andModDtGreaterThanOrEqualTo(Date value) {
            addCriterion("TI.MOD_DT >=", value, "modDt");
            return (Criteria) this;
        }

        public Criteria andModDtLessThan(Date value) {
            addCriterion("TI.MOD_DT <", value, "modDt");
            return (Criteria) this;
        }

        public Criteria andModDtLessThanOrEqualTo(Date value) {
            addCriterion("TI.MOD_DT <=", value, "modDt");
            return (Criteria) this;
        }

        public Criteria andModDtIn(List<Date> values) {
            addCriterion("TI.MOD_DT in", values, "modDt");
            return (Criteria) this;
        }

        public Criteria andModDtNotIn(List<Date> values) {
            addCriterion("TI.MOD_DT not in", values, "modDt");
            return (Criteria) this;
        }

        public Criteria andModDtBetween(Date value1, Date value2) {
            addCriterion("TI.MOD_DT between", value1, value2, "modDt");
            return (Criteria) this;
        }

        public Criteria andModDtNotBetween(Date value1, Date value2) {
            addCriterion("TI.MOD_DT not between", value1, value2, "modDt");
            return (Criteria) this;
        }

        public Criteria andModIdIsNull() {
            addCriterion("TI.MOD_ID is null");
            return (Criteria) this;
        }

        public Criteria andModIdIsNotNull() {
            addCriterion("TI.MOD_ID is not null");
            return (Criteria) this;
        }

        public Criteria andModIdEqualTo(String value) {
            addCriterion("TI.MOD_ID =", value, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdNotEqualTo(String value) {
            addCriterion("TI.MOD_ID <>", value, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdGreaterThan(String value) {
            addCriterion("TI.MOD_ID >", value, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdGreaterThanOrEqualTo(String value) {
            addCriterion("TI.MOD_ID >=", value, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdLessThan(String value) {
            addCriterion("TI.MOD_ID <", value, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdLessThanOrEqualTo(String value) {
            addCriterion("TI.MOD_ID <=", value, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdLike(String value) {
            addCriterion("TI.MOD_ID like", value, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdNotLike(String value) {
            addCriterion("TI.MOD_ID not like", value, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdIn(List<String> values) {
            addCriterion("TI.MOD_ID in", values, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdNotIn(List<String> values) {
            addCriterion("TI.MOD_ID not in", values, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdBetween(String value1, String value2) {
            addCriterion("TI.MOD_ID between", value1, value2, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdNotBetween(String value1, String value2) {
            addCriterion("TI.MOD_ID not between", value1, value2, "modId");
            return (Criteria) this;
        }

        public Criteria andUseYnIsNull() {
            addCriterion("TI.USE_YN is null");
            return (Criteria) this;
        }

        public Criteria andUseYnIsNotNull() {
            addCriterion("TI.USE_YN is not null");
            return (Criteria) this;
        }

        public Criteria andUseYnEqualTo(String value) {
            addCriterion("TI.USE_YN =", value, "useYn");
            return (Criteria) this;
        }

        public Criteria andUseYnNotEqualTo(String value) {
            addCriterion("TI.USE_YN <>", value, "useYn");
            return (Criteria) this;
        }

        public Criteria andUseYnGreaterThan(String value) {
            addCriterion("TI.USE_YN >", value, "useYn");
            return (Criteria) this;
        }

        public Criteria andUseYnGreaterThanOrEqualTo(String value) {
            addCriterion("TI.USE_YN >=", value, "useYn");
            return (Criteria) this;
        }

        public Criteria andUseYnLessThan(String value) {
            addCriterion("TI.USE_YN <", value, "useYn");
            return (Criteria) this;
        }

        public Criteria andUseYnLessThanOrEqualTo(String value) {
            addCriterion("TI.USE_YN <=", value, "useYn");
            return (Criteria) this;
        }

        public Criteria andUseYnLike(String value) {
            addCriterion("TI.USE_YN like", value, "useYn");
            return (Criteria) this;
        }

        public Criteria andUseYnNotLike(String value) {
            addCriterion("TI.USE_YN not like", value, "useYn");
            return (Criteria) this;
        }

        public Criteria andUseYnIn(List<String> values) {
            addCriterion("TI.USE_YN in", values, "useYn");
            return (Criteria) this;
        }

        public Criteria andUseYnNotIn(List<String> values) {
            addCriterion("TI.USE_YN not in", values, "useYn");
            return (Criteria) this;
        }

        public Criteria andUseYnBetween(String value1, String value2) {
            addCriterion("TI.USE_YN between", value1, value2, "useYn");
            return (Criteria) this;
        }

        public Criteria andUseYnNotBetween(String value1, String value2) {
            addCriterion("TI.USE_YN not between", value1, value2, "useYn");
            return (Criteria) this;
        }

        public Criteria andItemTpCdLikeInsensitive(String value) {
            addCriterion("upper(TI.ITEM_TP_CD) like", value.toUpperCase(), "itemTpCd");
            return (Criteria) this;
        }

        public Criteria andItemStatCdLikeInsensitive(String value) {
            addCriterion("upper(TI.ITEM_STAT_CD) like", value.toUpperCase(), "itemStatCd");
            return (Criteria) this;
        }

        public Criteria andItemAprvStatCdLikeInsensitive(String value) {
            addCriterion("upper(TI.ITEM_APRV_STAT_CD) like", value.toUpperCase(), "itemAprvStatCd");
            return (Criteria) this;
        }

        public Criteria andItemCdLikeInsensitive(String value) {
            addCriterion("upper(TI.ITEM_CD) like", value.toUpperCase(), "itemCd");
            return (Criteria) this;
        }

        public Criteria andItemNmLikeInsensitive(String value) {
            addCriterion("upper(TI.ITEM_NM) like", value.toUpperCase(), "itemNm");
            return (Criteria) this;
        }

        public Criteria andItemSubNmLikeInsensitive(String value) {
            addCriterion("upper(TI.ITEM_SUB_NM) like", value.toUpperCase(), "itemSubNm");
            return (Criteria) this;
        }

        public Criteria andManuLikeInsensitive(String value) {
            addCriterion("upper(TI.MANU) like", value.toUpperCase(), "manu");
            return (Criteria) this;
        }

        public Criteria andItemCmtRegYnLikeInsensitive(String value) {
            addCriterion("upper(TI.ITEM_CMT_REG_YN) like", value.toUpperCase(), "itemCmtRegYn");
            return (Criteria) this;
        }

        public Criteria andInqRegYnLikeInsensitive(String value) {
            addCriterion("upper(TI.INQ_REG_YN) like", value.toUpperCase(), "inqRegYn");
            return (Criteria) this;
        }

        public Criteria andOptSttYnLikeInsensitive(String value) {
            addCriterion("upper(TI.OPT_STT_YN) like", value.toUpperCase(), "optSttYn");
            return (Criteria) this;
        }

        public Criteria andFrgtYnLikeInsensitive(String value) {
            addCriterion("upper(TI.FRGT_YN) like", value.toUpperCase(), "frgtYn");
            return (Criteria) this;
        }

        public Criteria andDpYnLikeInsensitive(String value) {
            addCriterion("upper(TI.DP_YN) like", value.toUpperCase(), "dpYn");
            return (Criteria) this;
        }

        public Criteria andDpEnvCdLikeInsensitive(String value) {
            addCriterion("upper(TI.DP_ENV_CD) like", value.toUpperCase(), "dpEnvCd");
            return (Criteria) this;
        }

        public Criteria andCstmdYnLikeInsensitive(String value) {
            addCriterion("upper(TI.CSTMD_YN) like", value.toUpperCase(), "cstmdYn");
            return (Criteria) this;
        }

        public Criteria andTaxClCdLikeInsensitive(String value) {
            addCriterion("upper(TI.TAX_CL_CD) like", value.toUpperCase(), "taxClCd");
            return (Criteria) this;
        }

        public Criteria andSellPerdLimYnLikeInsensitive(String value) {
            addCriterion("upper(TI.SELL_PERD_LIM_YN) like", value.toUpperCase(), "sellPerdLimYn");
            return (Criteria) this;
        }

        public Criteria andCpnUsePsblYnLikeInsensitive(String value) {
            addCriterion("upper(TI.CPN_USE_PSBL_YN) like", value.toUpperCase(), "cpnUsePsblYn");
            return (Criteria) this;
        }

        public Criteria andPtSaveTpCdLikeInsensitive(String value) {
            addCriterion("upper(TI.PT_SAVE_TP_CD) like", value.toUpperCase(), "ptSaveTpCd");
            return (Criteria) this;
        }

        public Criteria andPtSaveMethCdLikeInsensitive(String value) {
            addCriterion("upper(TI.PT_SAVE_METH_CD) like", value.toUpperCase(), "ptSaveMethCd");
            return (Criteria) this;
        }

        public Criteria andWahsNotiYnLikeInsensitive(String value) {
            addCriterion("upper(TI.WAHS_NOTI_YN) like", value.toUpperCase(), "wahsNotiYn");
            return (Criteria) this;
        }

        public Criteria andItemInfoNotiInptMethCdLikeInsensitive(String value) {
            addCriterion("upper(TI.ITEM_INFO_NOTI_INPT_METH_CD) like", value.toUpperCase(), "itemInfoNotiInptMethCd");
            return (Criteria) this;
        }

        public Criteria andMemoLikeInsensitive(String value) {
            addCriterion("upper(TI.MEMO) like", value.toUpperCase(), "memo");
            return (Criteria) this;
        }

        public Criteria andRegIdLikeInsensitive(String value) {
            addCriterion("upper(TI.REG_ID) like", value.toUpperCase(), "regId");
            return (Criteria) this;
        }

        public Criteria andModIdLikeInsensitive(String value) {
            addCriterion("upper(TI.MOD_ID) like", value.toUpperCase(), "modId");
            return (Criteria) this;
        }

        public Criteria andUseYnLikeInsensitive(String value) {
            addCriterion("upper(TI.USE_YN) like", value.toUpperCase(), "useYn");
            return (Criteria) this;
        }

        public Criteria andItemTpCdLikeLeft(String value) {
            addCriterion("TI.ITEM_TP_CD like ", "%" + value, "itemTpCd");
            return (Criteria) this;
        }

        public Criteria andItemTpCdLikeRight(String value) {
            addCriterion("TI.ITEM_TP_CD like ", value + "%", "itemTpCd");
            return (Criteria) this;
        }

        public Criteria andItemTpCdLikeBoth(String value) {
            addCriterion("TI.ITEM_TP_CD like ", "%" + value + "%", "itemTpCd");
            return (Criteria) this;
        }

        public Criteria andItemStatCdLikeLeft(String value) {
            addCriterion("TI.ITEM_STAT_CD like ", "%" + value, "itemStatCd");
            return (Criteria) this;
        }

        public Criteria andItemStatCdLikeRight(String value) {
            addCriterion("TI.ITEM_STAT_CD like ", value + "%", "itemStatCd");
            return (Criteria) this;
        }

        public Criteria andItemStatCdLikeBoth(String value) {
            addCriterion("TI.ITEM_STAT_CD like ", "%" + value + "%", "itemStatCd");
            return (Criteria) this;
        }

        public Criteria andItemAprvStatCdLikeLeft(String value) {
            addCriterion("TI.ITEM_APRV_STAT_CD like ", "%" + value, "itemAprvStatCd");
            return (Criteria) this;
        }

        public Criteria andItemAprvStatCdLikeRight(String value) {
            addCriterion("TI.ITEM_APRV_STAT_CD like ", value + "%", "itemAprvStatCd");
            return (Criteria) this;
        }

        public Criteria andItemAprvStatCdLikeBoth(String value) {
            addCriterion("TI.ITEM_APRV_STAT_CD like ", "%" + value + "%", "itemAprvStatCd");
            return (Criteria) this;
        }

        public Criteria andItemCdLikeLeft(String value) {
            addCriterion("TI.ITEM_CD like ", "%" + value, "itemCd");
            return (Criteria) this;
        }

        public Criteria andItemCdLikeRight(String value) {
            addCriterion("TI.ITEM_CD like ", value + "%", "itemCd");
            return (Criteria) this;
        }

        public Criteria andItemCdLikeBoth(String value) {
            addCriterion("TI.ITEM_CD like ", "%" + value + "%", "itemCd");
            return (Criteria) this;
        }

        public Criteria andItemNmLikeLeft(String value) {
            addCriterion("TI.ITEM_NM like ", "%" + value, "itemNm");
            return (Criteria) this;
        }

        public Criteria andItemNmLikeRight(String value) {
            addCriterion("TI.ITEM_NM like ", value + "%", "itemNm");
            return (Criteria) this;
        }

        public Criteria andItemNmLikeBoth(String value) {
            addCriterion("TI.ITEM_NM like ", "%" + value + "%", "itemNm");
            return (Criteria) this;
        }

        public Criteria andItemSubNmLikeLeft(String value) {
            addCriterion("TI.ITEM_SUB_NM like ", "%" + value, "itemSubNm");
            return (Criteria) this;
        }

        public Criteria andItemSubNmLikeRight(String value) {
            addCriterion("TI.ITEM_SUB_NM like ", value + "%", "itemSubNm");
            return (Criteria) this;
        }

        public Criteria andItemSubNmLikeBoth(String value) {
            addCriterion("TI.ITEM_SUB_NM like ", "%" + value + "%", "itemSubNm");
            return (Criteria) this;
        }

        public Criteria andManuLikeLeft(String value) {
            addCriterion("TI.MANU like ", "%" + value, "manu");
            return (Criteria) this;
        }

        public Criteria andManuLikeRight(String value) {
            addCriterion("TI.MANU like ", value + "%", "manu");
            return (Criteria) this;
        }

        public Criteria andManuLikeBoth(String value) {
            addCriterion("TI.MANU like ", "%" + value + "%", "manu");
            return (Criteria) this;
        }

        public Criteria andItemCmtRegYnLikeLeft(String value) {
            addCriterion("TI.ITEM_CMT_REG_YN like ", "%" + value, "itemCmtRegYn");
            return (Criteria) this;
        }

        public Criteria andItemCmtRegYnLikeRight(String value) {
            addCriterion("TI.ITEM_CMT_REG_YN like ", value + "%", "itemCmtRegYn");
            return (Criteria) this;
        }

        public Criteria andItemCmtRegYnLikeBoth(String value) {
            addCriterion("TI.ITEM_CMT_REG_YN like ", "%" + value + "%", "itemCmtRegYn");
            return (Criteria) this;
        }

        public Criteria andInqRegYnLikeLeft(String value) {
            addCriterion("TI.INQ_REG_YN like ", "%" + value, "inqRegYn");
            return (Criteria) this;
        }

        public Criteria andInqRegYnLikeRight(String value) {
            addCriterion("TI.INQ_REG_YN like ", value + "%", "inqRegYn");
            return (Criteria) this;
        }

        public Criteria andInqRegYnLikeBoth(String value) {
            addCriterion("TI.INQ_REG_YN like ", "%" + value + "%", "inqRegYn");
            return (Criteria) this;
        }

        public Criteria andOptSttYnLikeLeft(String value) {
            addCriterion("TI.OPT_STT_YN like ", "%" + value, "optSttYn");
            return (Criteria) this;
        }

        public Criteria andOptSttYnLikeRight(String value) {
            addCriterion("TI.OPT_STT_YN like ", value + "%", "optSttYn");
            return (Criteria) this;
        }

        public Criteria andOptSttYnLikeBoth(String value) {
            addCriterion("TI.OPT_STT_YN like ", "%" + value + "%", "optSttYn");
            return (Criteria) this;
        }

        public Criteria andFrgtYnLikeLeft(String value) {
            addCriterion("TI.FRGT_YN like ", "%" + value, "frgtYn");
            return (Criteria) this;
        }

        public Criteria andFrgtYnLikeRight(String value) {
            addCriterion("TI.FRGT_YN like ", value + "%", "frgtYn");
            return (Criteria) this;
        }

        public Criteria andFrgtYnLikeBoth(String value) {
            addCriterion("TI.FRGT_YN like ", "%" + value + "%", "frgtYn");
            return (Criteria) this;
        }

        public Criteria andDpYnLikeLeft(String value) {
            addCriterion("TI.DP_YN like ", "%" + value, "dpYn");
            return (Criteria) this;
        }

        public Criteria andDpYnLikeRight(String value) {
            addCriterion("TI.DP_YN like ", value + "%", "dpYn");
            return (Criteria) this;
        }

        public Criteria andDpYnLikeBoth(String value) {
            addCriterion("TI.DP_YN like ", "%" + value + "%", "dpYn");
            return (Criteria) this;
        }

        public Criteria andDpEnvCdLikeLeft(String value) {
            addCriterion("TI.DP_ENV_CD like ", "%" + value, "dpEnvCd");
            return (Criteria) this;
        }

        public Criteria andDpEnvCdLikeRight(String value) {
            addCriterion("TI.DP_ENV_CD like ", value + "%", "dpEnvCd");
            return (Criteria) this;
        }

        public Criteria andDpEnvCdLikeBoth(String value) {
            addCriterion("TI.DP_ENV_CD like ", "%" + value + "%", "dpEnvCd");
            return (Criteria) this;
        }

        public Criteria andCstmdYnLikeLeft(String value) {
            addCriterion("TI.CSTMD_YN like ", "%" + value, "cstmdYn");
            return (Criteria) this;
        }

        public Criteria andCstmdYnLikeRight(String value) {
            addCriterion("TI.CSTMD_YN like ", value + "%", "cstmdYn");
            return (Criteria) this;
        }

        public Criteria andCstmdYnLikeBoth(String value) {
            addCriterion("TI.CSTMD_YN like ", "%" + value + "%", "cstmdYn");
            return (Criteria) this;
        }

        public Criteria andTaxClCdLikeLeft(String value) {
            addCriterion("TI.TAX_CL_CD like ", "%" + value, "taxClCd");
            return (Criteria) this;
        }

        public Criteria andTaxClCdLikeRight(String value) {
            addCriterion("TI.TAX_CL_CD like ", value + "%", "taxClCd");
            return (Criteria) this;
        }

        public Criteria andTaxClCdLikeBoth(String value) {
            addCriterion("TI.TAX_CL_CD like ", "%" + value + "%", "taxClCd");
            return (Criteria) this;
        }

        public Criteria andSellPerdLimYnLikeLeft(String value) {
            addCriterion("TI.SELL_PERD_LIM_YN like ", "%" + value, "sellPerdLimYn");
            return (Criteria) this;
        }

        public Criteria andSellPerdLimYnLikeRight(String value) {
            addCriterion("TI.SELL_PERD_LIM_YN like ", value + "%", "sellPerdLimYn");
            return (Criteria) this;
        }

        public Criteria andSellPerdLimYnLikeBoth(String value) {
            addCriterion("TI.SELL_PERD_LIM_YN like ", "%" + value + "%", "sellPerdLimYn");
            return (Criteria) this;
        }

        public Criteria andCpnUsePsblYnLikeLeft(String value) {
            addCriterion("TI.CPN_USE_PSBL_YN like ", "%" + value, "cpnUsePsblYn");
            return (Criteria) this;
        }

        public Criteria andCpnUsePsblYnLikeRight(String value) {
            addCriterion("TI.CPN_USE_PSBL_YN like ", value + "%", "cpnUsePsblYn");
            return (Criteria) this;
        }

        public Criteria andCpnUsePsblYnLikeBoth(String value) {
            addCriterion("TI.CPN_USE_PSBL_YN like ", "%" + value + "%", "cpnUsePsblYn");
            return (Criteria) this;
        }

        public Criteria andPtSaveTpCdLikeLeft(String value) {
            addCriterion("TI.PT_SAVE_TP_CD like ", "%" + value, "ptSaveTpCd");
            return (Criteria) this;
        }

        public Criteria andPtSaveTpCdLikeRight(String value) {
            addCriterion("TI.PT_SAVE_TP_CD like ", value + "%", "ptSaveTpCd");
            return (Criteria) this;
        }

        public Criteria andPtSaveTpCdLikeBoth(String value) {
            addCriterion("TI.PT_SAVE_TP_CD like ", "%" + value + "%", "ptSaveTpCd");
            return (Criteria) this;
        }

        public Criteria andPtSaveMethCdLikeLeft(String value) {
            addCriterion("TI.PT_SAVE_METH_CD like ", "%" + value, "ptSaveMethCd");
            return (Criteria) this;
        }

        public Criteria andPtSaveMethCdLikeRight(String value) {
            addCriterion("TI.PT_SAVE_METH_CD like ", value + "%", "ptSaveMethCd");
            return (Criteria) this;
        }

        public Criteria andPtSaveMethCdLikeBoth(String value) {
            addCriterion("TI.PT_SAVE_METH_CD like ", "%" + value + "%", "ptSaveMethCd");
            return (Criteria) this;
        }

        public Criteria andWahsNotiYnLikeLeft(String value) {
            addCriterion("TI.WAHS_NOTI_YN like ", "%" + value, "wahsNotiYn");
            return (Criteria) this;
        }

        public Criteria andWahsNotiYnLikeRight(String value) {
            addCriterion("TI.WAHS_NOTI_YN like ", value + "%", "wahsNotiYn");
            return (Criteria) this;
        }

        public Criteria andWahsNotiYnLikeBoth(String value) {
            addCriterion("TI.WAHS_NOTI_YN like ", "%" + value + "%", "wahsNotiYn");
            return (Criteria) this;
        }

        public Criteria andItemInfoNotiInptMethCdLikeLeft(String value) {
            addCriterion("TI.ITEM_INFO_NOTI_INPT_METH_CD like ", "%" + value, "itemInfoNotiInptMethCd");
            return (Criteria) this;
        }

        public Criteria andItemInfoNotiInptMethCdLikeRight(String value) {
            addCriterion("TI.ITEM_INFO_NOTI_INPT_METH_CD like ", value + "%", "itemInfoNotiInptMethCd");
            return (Criteria) this;
        }

        public Criteria andItemInfoNotiInptMethCdLikeBoth(String value) {
            addCriterion("TI.ITEM_INFO_NOTI_INPT_METH_CD like ", "%" + value + "%", "itemInfoNotiInptMethCd");
            return (Criteria) this;
        }

        public Criteria andMemoLikeLeft(String value) {
            addCriterion("TI.MEMO like ", "%" + value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoLikeRight(String value) {
            addCriterion("TI.MEMO like ", value + "%", "memo");
            return (Criteria) this;
        }

        public Criteria andMemoLikeBoth(String value) {
            addCriterion("TI.MEMO like ", "%" + value + "%", "memo");
            return (Criteria) this;
        }

        public Criteria andRegIdLikeLeft(String value) {
            addCriterion("TI.REG_ID like ", "%" + value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdLikeRight(String value) {
            addCriterion("TI.REG_ID like ", value + "%", "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdLikeBoth(String value) {
            addCriterion("TI.REG_ID like ", "%" + value + "%", "regId");
            return (Criteria) this;
        }

        public Criteria andModIdLikeLeft(String value) {
            addCriterion("TI.MOD_ID like ", "%" + value, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdLikeRight(String value) {
            addCriterion("TI.MOD_ID like ", value + "%", "modId");
            return (Criteria) this;
        }

        public Criteria andModIdLikeBoth(String value) {
            addCriterion("TI.MOD_ID like ", "%" + value + "%", "modId");
            return (Criteria) this;
        }

        public Criteria andUseYnLikeLeft(String value) {
            addCriterion("TI.USE_YN like ", "%" + value, "useYn");
            return (Criteria) this;
        }

        public Criteria andUseYnLikeRight(String value) {
            addCriterion("TI.USE_YN like ", value + "%", "useYn");
            return (Criteria) this;
        }

        public Criteria andUseYnLikeBoth(String value) {
            addCriterion("TI.USE_YN like ", "%" + value + "%", "useYn");
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