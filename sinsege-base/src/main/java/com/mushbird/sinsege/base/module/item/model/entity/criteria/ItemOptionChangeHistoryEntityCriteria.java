package com.mushbird.sinsege.base.module.item.model.entity.criteria;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ItemOptionChangeHistoryEntityCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    public ItemOptionChangeHistoryEntityCriteria() {
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

        public Criteria andItemOptChistIdIsNull() {
            addCriterion("TIOC.ITEM_OPT_CHIST_ID is null");
            return (Criteria) this;
        }

        public Criteria andItemOptChistIdIsNotNull() {
            addCriterion("TIOC.ITEM_OPT_CHIST_ID is not null");
            return (Criteria) this;
        }

        public Criteria andItemOptChistIdEqualTo(Integer value) {
            addCriterion("TIOC.ITEM_OPT_CHIST_ID =", value, "itemOptChistId");
            return (Criteria) this;
        }

        public Criteria andItemOptChistIdNotEqualTo(Integer value) {
            addCriterion("TIOC.ITEM_OPT_CHIST_ID <>", value, "itemOptChistId");
            return (Criteria) this;
        }

        public Criteria andItemOptChistIdGreaterThan(Integer value) {
            addCriterion("TIOC.ITEM_OPT_CHIST_ID >", value, "itemOptChistId");
            return (Criteria) this;
        }

        public Criteria andItemOptChistIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("TIOC.ITEM_OPT_CHIST_ID >=", value, "itemOptChistId");
            return (Criteria) this;
        }

        public Criteria andItemOptChistIdLessThan(Integer value) {
            addCriterion("TIOC.ITEM_OPT_CHIST_ID <", value, "itemOptChistId");
            return (Criteria) this;
        }

        public Criteria andItemOptChistIdLessThanOrEqualTo(Integer value) {
            addCriterion("TIOC.ITEM_OPT_CHIST_ID <=", value, "itemOptChistId");
            return (Criteria) this;
        }

        public Criteria andItemOptChistIdIn(List<Integer> values) {
            addCriterion("TIOC.ITEM_OPT_CHIST_ID in", values, "itemOptChistId");
            return (Criteria) this;
        }

        public Criteria andItemOptChistIdNotIn(List<Integer> values) {
            addCriterion("TIOC.ITEM_OPT_CHIST_ID not in", values, "itemOptChistId");
            return (Criteria) this;
        }

        public Criteria andItemOptChistIdBetween(Integer value1, Integer value2) {
            addCriterion("TIOC.ITEM_OPT_CHIST_ID between", value1, value2, "itemOptChistId");
            return (Criteria) this;
        }

        public Criteria andItemOptChistIdNotBetween(Integer value1, Integer value2) {
            addCriterion("TIOC.ITEM_OPT_CHIST_ID not between", value1, value2, "itemOptChistId");
            return (Criteria) this;
        }

        public Criteria andItemOptIdIsNull() {
            addCriterion("TIOC.ITEM_OPT_ID is null");
            return (Criteria) this;
        }

        public Criteria andItemOptIdIsNotNull() {
            addCriterion("TIOC.ITEM_OPT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andItemOptIdEqualTo(Integer value) {
            addCriterion("TIOC.ITEM_OPT_ID =", value, "itemOptId");
            return (Criteria) this;
        }

        public Criteria andItemOptIdNotEqualTo(Integer value) {
            addCriterion("TIOC.ITEM_OPT_ID <>", value, "itemOptId");
            return (Criteria) this;
        }

        public Criteria andItemOptIdGreaterThan(Integer value) {
            addCriterion("TIOC.ITEM_OPT_ID >", value, "itemOptId");
            return (Criteria) this;
        }

        public Criteria andItemOptIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("TIOC.ITEM_OPT_ID >=", value, "itemOptId");
            return (Criteria) this;
        }

        public Criteria andItemOptIdLessThan(Integer value) {
            addCriterion("TIOC.ITEM_OPT_ID <", value, "itemOptId");
            return (Criteria) this;
        }

        public Criteria andItemOptIdLessThanOrEqualTo(Integer value) {
            addCriterion("TIOC.ITEM_OPT_ID <=", value, "itemOptId");
            return (Criteria) this;
        }

        public Criteria andItemOptIdIn(List<Integer> values) {
            addCriterion("TIOC.ITEM_OPT_ID in", values, "itemOptId");
            return (Criteria) this;
        }

        public Criteria andItemOptIdNotIn(List<Integer> values) {
            addCriterion("TIOC.ITEM_OPT_ID not in", values, "itemOptId");
            return (Criteria) this;
        }

        public Criteria andItemOptIdBetween(Integer value1, Integer value2) {
            addCriterion("TIOC.ITEM_OPT_ID between", value1, value2, "itemOptId");
            return (Criteria) this;
        }

        public Criteria andItemOptIdNotBetween(Integer value1, Integer value2) {
            addCriterion("TIOC.ITEM_OPT_ID not between", value1, value2, "itemOptId");
            return (Criteria) this;
        }

        public Criteria andItemIdIsNull() {
            addCriterion("TIOC.ITEM_ID is null");
            return (Criteria) this;
        }

        public Criteria andItemIdIsNotNull() {
            addCriterion("TIOC.ITEM_ID is not null");
            return (Criteria) this;
        }

        public Criteria andItemIdEqualTo(Integer value) {
            addCriterion("TIOC.ITEM_ID =", value, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdNotEqualTo(Integer value) {
            addCriterion("TIOC.ITEM_ID <>", value, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdGreaterThan(Integer value) {
            addCriterion("TIOC.ITEM_ID >", value, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("TIOC.ITEM_ID >=", value, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdLessThan(Integer value) {
            addCriterion("TIOC.ITEM_ID <", value, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdLessThanOrEqualTo(Integer value) {
            addCriterion("TIOC.ITEM_ID <=", value, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdIn(List<Integer> values) {
            addCriterion("TIOC.ITEM_ID in", values, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdNotIn(List<Integer> values) {
            addCriterion("TIOC.ITEM_ID not in", values, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdBetween(Integer value1, Integer value2) {
            addCriterion("TIOC.ITEM_ID between", value1, value2, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdNotBetween(Integer value1, Integer value2) {
            addCriterion("TIOC.ITEM_ID not between", value1, value2, "itemId");
            return (Criteria) this;
        }

        public Criteria andOptSellStatCdIsNull() {
            addCriterion("TIOC.OPT_SELL_STAT_CD is null");
            return (Criteria) this;
        }

        public Criteria andOptSellStatCdIsNotNull() {
            addCriterion("TIOC.OPT_SELL_STAT_CD is not null");
            return (Criteria) this;
        }

        public Criteria andOptSellStatCdEqualTo(String value) {
            addCriterion("TIOC.OPT_SELL_STAT_CD =", value, "optSellStatCd");
            return (Criteria) this;
        }

        public Criteria andOptSellStatCdNotEqualTo(String value) {
            addCriterion("TIOC.OPT_SELL_STAT_CD <>", value, "optSellStatCd");
            return (Criteria) this;
        }

        public Criteria andOptSellStatCdGreaterThan(String value) {
            addCriterion("TIOC.OPT_SELL_STAT_CD >", value, "optSellStatCd");
            return (Criteria) this;
        }

        public Criteria andOptSellStatCdGreaterThanOrEqualTo(String value) {
            addCriterion("TIOC.OPT_SELL_STAT_CD >=", value, "optSellStatCd");
            return (Criteria) this;
        }

        public Criteria andOptSellStatCdLessThan(String value) {
            addCriterion("TIOC.OPT_SELL_STAT_CD <", value, "optSellStatCd");
            return (Criteria) this;
        }

        public Criteria andOptSellStatCdLessThanOrEqualTo(String value) {
            addCriterion("TIOC.OPT_SELL_STAT_CD <=", value, "optSellStatCd");
            return (Criteria) this;
        }

        public Criteria andOptSellStatCdLike(String value) {
            addCriterion("TIOC.OPT_SELL_STAT_CD like", value, "optSellStatCd");
            return (Criteria) this;
        }

        public Criteria andOptSellStatCdNotLike(String value) {
            addCriterion("TIOC.OPT_SELL_STAT_CD not like", value, "optSellStatCd");
            return (Criteria) this;
        }

        public Criteria andOptSellStatCdIn(List<String> values) {
            addCriterion("TIOC.OPT_SELL_STAT_CD in", values, "optSellStatCd");
            return (Criteria) this;
        }

        public Criteria andOptSellStatCdNotIn(List<String> values) {
            addCriterion("TIOC.OPT_SELL_STAT_CD not in", values, "optSellStatCd");
            return (Criteria) this;
        }

        public Criteria andOptSellStatCdBetween(String value1, String value2) {
            addCriterion("TIOC.OPT_SELL_STAT_CD between", value1, value2, "optSellStatCd");
            return (Criteria) this;
        }

        public Criteria andOptSellStatCdNotBetween(String value1, String value2) {
            addCriterion("TIOC.OPT_SELL_STAT_CD not between", value1, value2, "optSellStatCd");
            return (Criteria) this;
        }

        public Criteria andSsgCdIsNull() {
            addCriterion("TIOC.SSG_CD is null");
            return (Criteria) this;
        }

        public Criteria andSsgCdIsNotNull() {
            addCriterion("TIOC.SSG_CD is not null");
            return (Criteria) this;
        }

        public Criteria andSsgCdEqualTo(String value) {
            addCriterion("TIOC.SSG_CD =", value, "ssgCd");
            return (Criteria) this;
        }

        public Criteria andSsgCdNotEqualTo(String value) {
            addCriterion("TIOC.SSG_CD <>", value, "ssgCd");
            return (Criteria) this;
        }

        public Criteria andSsgCdGreaterThan(String value) {
            addCriterion("TIOC.SSG_CD >", value, "ssgCd");
            return (Criteria) this;
        }

        public Criteria andSsgCdGreaterThanOrEqualTo(String value) {
            addCriterion("TIOC.SSG_CD >=", value, "ssgCd");
            return (Criteria) this;
        }

        public Criteria andSsgCdLessThan(String value) {
            addCriterion("TIOC.SSG_CD <", value, "ssgCd");
            return (Criteria) this;
        }

        public Criteria andSsgCdLessThanOrEqualTo(String value) {
            addCriterion("TIOC.SSG_CD <=", value, "ssgCd");
            return (Criteria) this;
        }

        public Criteria andSsgCdLike(String value) {
            addCriterion("TIOC.SSG_CD like", value, "ssgCd");
            return (Criteria) this;
        }

        public Criteria andSsgCdNotLike(String value) {
            addCriterion("TIOC.SSG_CD not like", value, "ssgCd");
            return (Criteria) this;
        }

        public Criteria andSsgCdIn(List<String> values) {
            addCriterion("TIOC.SSG_CD in", values, "ssgCd");
            return (Criteria) this;
        }

        public Criteria andSsgCdNotIn(List<String> values) {
            addCriterion("TIOC.SSG_CD not in", values, "ssgCd");
            return (Criteria) this;
        }

        public Criteria andSsgCdBetween(String value1, String value2) {
            addCriterion("TIOC.SSG_CD between", value1, value2, "ssgCd");
            return (Criteria) this;
        }

        public Criteria andSsgCdNotBetween(String value1, String value2) {
            addCriterion("TIOC.SSG_CD not between", value1, value2, "ssgCd");
            return (Criteria) this;
        }

        public Criteria andOptNmIsNull() {
            addCriterion("TIOC.OPT_NM is null");
            return (Criteria) this;
        }

        public Criteria andOptNmIsNotNull() {
            addCriterion("TIOC.OPT_NM is not null");
            return (Criteria) this;
        }

        public Criteria andOptNmEqualTo(String value) {
            addCriterion("TIOC.OPT_NM =", value, "optNm");
            return (Criteria) this;
        }

        public Criteria andOptNmNotEqualTo(String value) {
            addCriterion("TIOC.OPT_NM <>", value, "optNm");
            return (Criteria) this;
        }

        public Criteria andOptNmGreaterThan(String value) {
            addCriterion("TIOC.OPT_NM >", value, "optNm");
            return (Criteria) this;
        }

        public Criteria andOptNmGreaterThanOrEqualTo(String value) {
            addCriterion("TIOC.OPT_NM >=", value, "optNm");
            return (Criteria) this;
        }

        public Criteria andOptNmLessThan(String value) {
            addCriterion("TIOC.OPT_NM <", value, "optNm");
            return (Criteria) this;
        }

        public Criteria andOptNmLessThanOrEqualTo(String value) {
            addCriterion("TIOC.OPT_NM <=", value, "optNm");
            return (Criteria) this;
        }

        public Criteria andOptNmLike(String value) {
            addCriterion("TIOC.OPT_NM like", value, "optNm");
            return (Criteria) this;
        }

        public Criteria andOptNmNotLike(String value) {
            addCriterion("TIOC.OPT_NM not like", value, "optNm");
            return (Criteria) this;
        }

        public Criteria andOptNmIn(List<String> values) {
            addCriterion("TIOC.OPT_NM in", values, "optNm");
            return (Criteria) this;
        }

        public Criteria andOptNmNotIn(List<String> values) {
            addCriterion("TIOC.OPT_NM not in", values, "optNm");
            return (Criteria) this;
        }

        public Criteria andOptNmBetween(String value1, String value2) {
            addCriterion("TIOC.OPT_NM between", value1, value2, "optNm");
            return (Criteria) this;
        }

        public Criteria andOptNmNotBetween(String value1, String value2) {
            addCriterion("TIOC.OPT_NM not between", value1, value2, "optNm");
            return (Criteria) this;
        }

        public Criteria andSordIsNull() {
            addCriterion("TIOC.SORD is null");
            return (Criteria) this;
        }

        public Criteria andSordIsNotNull() {
            addCriterion("TIOC.SORD is not null");
            return (Criteria) this;
        }

        public Criteria andSordEqualTo(Integer value) {
            addCriterion("TIOC.SORD =", value, "sord");
            return (Criteria) this;
        }

        public Criteria andSordNotEqualTo(Integer value) {
            addCriterion("TIOC.SORD <>", value, "sord");
            return (Criteria) this;
        }

        public Criteria andSordGreaterThan(Integer value) {
            addCriterion("TIOC.SORD >", value, "sord");
            return (Criteria) this;
        }

        public Criteria andSordGreaterThanOrEqualTo(Integer value) {
            addCriterion("TIOC.SORD >=", value, "sord");
            return (Criteria) this;
        }

        public Criteria andSordLessThan(Integer value) {
            addCriterion("TIOC.SORD <", value, "sord");
            return (Criteria) this;
        }

        public Criteria andSordLessThanOrEqualTo(Integer value) {
            addCriterion("TIOC.SORD <=", value, "sord");
            return (Criteria) this;
        }

        public Criteria andSordIn(List<Integer> values) {
            addCriterion("TIOC.SORD in", values, "sord");
            return (Criteria) this;
        }

        public Criteria andSordNotIn(List<Integer> values) {
            addCriterion("TIOC.SORD not in", values, "sord");
            return (Criteria) this;
        }

        public Criteria andSordBetween(Integer value1, Integer value2) {
            addCriterion("TIOC.SORD between", value1, value2, "sord");
            return (Criteria) this;
        }

        public Criteria andSordNotBetween(Integer value1, Integer value2) {
            addCriterion("TIOC.SORD not between", value1, value2, "sord");
            return (Criteria) this;
        }

        public Criteria andRegDtIsNull() {
            addCriterion("TIOC.REG_DT is null");
            return (Criteria) this;
        }

        public Criteria andRegDtIsNotNull() {
            addCriterion("TIOC.REG_DT is not null");
            return (Criteria) this;
        }

        public Criteria andRegDtEqualTo(Date value) {
            addCriterion("TIOC.REG_DT =", value, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtNotEqualTo(Date value) {
            addCriterion("TIOC.REG_DT <>", value, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtGreaterThan(Date value) {
            addCriterion("TIOC.REG_DT >", value, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtGreaterThanOrEqualTo(Date value) {
            addCriterion("TIOC.REG_DT >=", value, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtLessThan(Date value) {
            addCriterion("TIOC.REG_DT <", value, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtLessThanOrEqualTo(Date value) {
            addCriterion("TIOC.REG_DT <=", value, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtIn(List<Date> values) {
            addCriterion("TIOC.REG_DT in", values, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtNotIn(List<Date> values) {
            addCriterion("TIOC.REG_DT not in", values, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtBetween(Date value1, Date value2) {
            addCriterion("TIOC.REG_DT between", value1, value2, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtNotBetween(Date value1, Date value2) {
            addCriterion("TIOC.REG_DT not between", value1, value2, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegIdIsNull() {
            addCriterion("TIOC.REG_ID is null");
            return (Criteria) this;
        }

        public Criteria andRegIdIsNotNull() {
            addCriterion("TIOC.REG_ID is not null");
            return (Criteria) this;
        }

        public Criteria andRegIdEqualTo(String value) {
            addCriterion("TIOC.REG_ID =", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdNotEqualTo(String value) {
            addCriterion("TIOC.REG_ID <>", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdGreaterThan(String value) {
            addCriterion("TIOC.REG_ID >", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdGreaterThanOrEqualTo(String value) {
            addCriterion("TIOC.REG_ID >=", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdLessThan(String value) {
            addCriterion("TIOC.REG_ID <", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdLessThanOrEqualTo(String value) {
            addCriterion("TIOC.REG_ID <=", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdLike(String value) {
            addCriterion("TIOC.REG_ID like", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdNotLike(String value) {
            addCriterion("TIOC.REG_ID not like", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdIn(List<String> values) {
            addCriterion("TIOC.REG_ID in", values, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdNotIn(List<String> values) {
            addCriterion("TIOC.REG_ID not in", values, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdBetween(String value1, String value2) {
            addCriterion("TIOC.REG_ID between", value1, value2, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdNotBetween(String value1, String value2) {
            addCriterion("TIOC.REG_ID not between", value1, value2, "regId");
            return (Criteria) this;
        }

        public Criteria andModDtIsNull() {
            addCriterion("TIOC.MOD_DT is null");
            return (Criteria) this;
        }

        public Criteria andModDtIsNotNull() {
            addCriterion("TIOC.MOD_DT is not null");
            return (Criteria) this;
        }

        public Criteria andModDtEqualTo(Date value) {
            addCriterion("TIOC.MOD_DT =", value, "modDt");
            return (Criteria) this;
        }

        public Criteria andModDtNotEqualTo(Date value) {
            addCriterion("TIOC.MOD_DT <>", value, "modDt");
            return (Criteria) this;
        }

        public Criteria andModDtGreaterThan(Date value) {
            addCriterion("TIOC.MOD_DT >", value, "modDt");
            return (Criteria) this;
        }

        public Criteria andModDtGreaterThanOrEqualTo(Date value) {
            addCriterion("TIOC.MOD_DT >=", value, "modDt");
            return (Criteria) this;
        }

        public Criteria andModDtLessThan(Date value) {
            addCriterion("TIOC.MOD_DT <", value, "modDt");
            return (Criteria) this;
        }

        public Criteria andModDtLessThanOrEqualTo(Date value) {
            addCriterion("TIOC.MOD_DT <=", value, "modDt");
            return (Criteria) this;
        }

        public Criteria andModDtIn(List<Date> values) {
            addCriterion("TIOC.MOD_DT in", values, "modDt");
            return (Criteria) this;
        }

        public Criteria andModDtNotIn(List<Date> values) {
            addCriterion("TIOC.MOD_DT not in", values, "modDt");
            return (Criteria) this;
        }

        public Criteria andModDtBetween(Date value1, Date value2) {
            addCriterion("TIOC.MOD_DT between", value1, value2, "modDt");
            return (Criteria) this;
        }

        public Criteria andModDtNotBetween(Date value1, Date value2) {
            addCriterion("TIOC.MOD_DT not between", value1, value2, "modDt");
            return (Criteria) this;
        }

        public Criteria andModIdIsNull() {
            addCriterion("TIOC.MOD_ID is null");
            return (Criteria) this;
        }

        public Criteria andModIdIsNotNull() {
            addCriterion("TIOC.MOD_ID is not null");
            return (Criteria) this;
        }

        public Criteria andModIdEqualTo(String value) {
            addCriterion("TIOC.MOD_ID =", value, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdNotEqualTo(String value) {
            addCriterion("TIOC.MOD_ID <>", value, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdGreaterThan(String value) {
            addCriterion("TIOC.MOD_ID >", value, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdGreaterThanOrEqualTo(String value) {
            addCriterion("TIOC.MOD_ID >=", value, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdLessThan(String value) {
            addCriterion("TIOC.MOD_ID <", value, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdLessThanOrEqualTo(String value) {
            addCriterion("TIOC.MOD_ID <=", value, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdLike(String value) {
            addCriterion("TIOC.MOD_ID like", value, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdNotLike(String value) {
            addCriterion("TIOC.MOD_ID not like", value, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdIn(List<String> values) {
            addCriterion("TIOC.MOD_ID in", values, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdNotIn(List<String> values) {
            addCriterion("TIOC.MOD_ID not in", values, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdBetween(String value1, String value2) {
            addCriterion("TIOC.MOD_ID between", value1, value2, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdNotBetween(String value1, String value2) {
            addCriterion("TIOC.MOD_ID not between", value1, value2, "modId");
            return (Criteria) this;
        }

        public Criteria andUseYnIsNull() {
            addCriterion("TIOC.USE_YN is null");
            return (Criteria) this;
        }

        public Criteria andUseYnIsNotNull() {
            addCriterion("TIOC.USE_YN is not null");
            return (Criteria) this;
        }

        public Criteria andUseYnEqualTo(String value) {
            addCriterion("TIOC.USE_YN =", value, "useYn");
            return (Criteria) this;
        }

        public Criteria andUseYnNotEqualTo(String value) {
            addCriterion("TIOC.USE_YN <>", value, "useYn");
            return (Criteria) this;
        }

        public Criteria andUseYnGreaterThan(String value) {
            addCriterion("TIOC.USE_YN >", value, "useYn");
            return (Criteria) this;
        }

        public Criteria andUseYnGreaterThanOrEqualTo(String value) {
            addCriterion("TIOC.USE_YN >=", value, "useYn");
            return (Criteria) this;
        }

        public Criteria andUseYnLessThan(String value) {
            addCriterion("TIOC.USE_YN <", value, "useYn");
            return (Criteria) this;
        }

        public Criteria andUseYnLessThanOrEqualTo(String value) {
            addCriterion("TIOC.USE_YN <=", value, "useYn");
            return (Criteria) this;
        }

        public Criteria andUseYnLike(String value) {
            addCriterion("TIOC.USE_YN like", value, "useYn");
            return (Criteria) this;
        }

        public Criteria andUseYnNotLike(String value) {
            addCriterion("TIOC.USE_YN not like", value, "useYn");
            return (Criteria) this;
        }

        public Criteria andUseYnIn(List<String> values) {
            addCriterion("TIOC.USE_YN in", values, "useYn");
            return (Criteria) this;
        }

        public Criteria andUseYnNotIn(List<String> values) {
            addCriterion("TIOC.USE_YN not in", values, "useYn");
            return (Criteria) this;
        }

        public Criteria andUseYnBetween(String value1, String value2) {
            addCriterion("TIOC.USE_YN between", value1, value2, "useYn");
            return (Criteria) this;
        }

        public Criteria andUseYnNotBetween(String value1, String value2) {
            addCriterion("TIOC.USE_YN not between", value1, value2, "useYn");
            return (Criteria) this;
        }

        public Criteria andOptSellStatCdLikeInsensitive(String value) {
            addCriterion("upper(TIOC.OPT_SELL_STAT_CD) like", value.toUpperCase(), "optSellStatCd");
            return (Criteria) this;
        }

        public Criteria andSsgCdLikeInsensitive(String value) {
            addCriterion("upper(TIOC.SSG_CD) like", value.toUpperCase(), "ssgCd");
            return (Criteria) this;
        }

        public Criteria andOptNmLikeInsensitive(String value) {
            addCriterion("upper(TIOC.OPT_NM) like", value.toUpperCase(), "optNm");
            return (Criteria) this;
        }

        public Criteria andRegIdLikeInsensitive(String value) {
            addCriterion("upper(TIOC.REG_ID) like", value.toUpperCase(), "regId");
            return (Criteria) this;
        }

        public Criteria andModIdLikeInsensitive(String value) {
            addCriterion("upper(TIOC.MOD_ID) like", value.toUpperCase(), "modId");
            return (Criteria) this;
        }

        public Criteria andUseYnLikeInsensitive(String value) {
            addCriterion("upper(TIOC.USE_YN) like", value.toUpperCase(), "useYn");
            return (Criteria) this;
        }

        public Criteria andOptSellStatCdLikeLeft(String value) {
            addCriterion("TIOC.OPT_SELL_STAT_CD like ", "%" + value, "optSellStatCd");
            return (Criteria) this;
        }

        public Criteria andOptSellStatCdLikeRight(String value) {
            addCriterion("TIOC.OPT_SELL_STAT_CD like ", value + "%", "optSellStatCd");
            return (Criteria) this;
        }

        public Criteria andOptSellStatCdLikeBoth(String value) {
            addCriterion("TIOC.OPT_SELL_STAT_CD like ", "%" + value + "%", "optSellStatCd");
            return (Criteria) this;
        }

        public Criteria andSsgCdLikeLeft(String value) {
            addCriterion("TIOC.SSG_CD like ", "%" + value, "ssgCd");
            return (Criteria) this;
        }

        public Criteria andSsgCdLikeRight(String value) {
            addCriterion("TIOC.SSG_CD like ", value + "%", "ssgCd");
            return (Criteria) this;
        }

        public Criteria andSsgCdLikeBoth(String value) {
            addCriterion("TIOC.SSG_CD like ", "%" + value + "%", "ssgCd");
            return (Criteria) this;
        }

        public Criteria andOptNmLikeLeft(String value) {
            addCriterion("TIOC.OPT_NM like ", "%" + value, "optNm");
            return (Criteria) this;
        }

        public Criteria andOptNmLikeRight(String value) {
            addCriterion("TIOC.OPT_NM like ", value + "%", "optNm");
            return (Criteria) this;
        }

        public Criteria andOptNmLikeBoth(String value) {
            addCriterion("TIOC.OPT_NM like ", "%" + value + "%", "optNm");
            return (Criteria) this;
        }

        public Criteria andRegIdLikeLeft(String value) {
            addCriterion("TIOC.REG_ID like ", "%" + value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdLikeRight(String value) {
            addCriterion("TIOC.REG_ID like ", value + "%", "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdLikeBoth(String value) {
            addCriterion("TIOC.REG_ID like ", "%" + value + "%", "regId");
            return (Criteria) this;
        }

        public Criteria andModIdLikeLeft(String value) {
            addCriterion("TIOC.MOD_ID like ", "%" + value, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdLikeRight(String value) {
            addCriterion("TIOC.MOD_ID like ", value + "%", "modId");
            return (Criteria) this;
        }

        public Criteria andModIdLikeBoth(String value) {
            addCriterion("TIOC.MOD_ID like ", "%" + value + "%", "modId");
            return (Criteria) this;
        }

        public Criteria andUseYnLikeLeft(String value) {
            addCriterion("TIOC.USE_YN like ", "%" + value, "useYn");
            return (Criteria) this;
        }

        public Criteria andUseYnLikeRight(String value) {
            addCriterion("TIOC.USE_YN like ", value + "%", "useYn");
            return (Criteria) this;
        }

        public Criteria andUseYnLikeBoth(String value) {
            addCriterion("TIOC.USE_YN like ", "%" + value + "%", "useYn");
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