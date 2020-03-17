package com.mushbird.sinsege.base.module.item.model.entity.criteria;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ItemOptionEntityCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    public ItemOptionEntityCriteria() {
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

        public Criteria andItemOptIdIsNull() {
            addCriterion("TIO.ITEM_OPT_ID is null");
            return (Criteria) this;
        }

        public Criteria andItemOptIdIsNotNull() {
            addCriterion("TIO.ITEM_OPT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andItemOptIdEqualTo(Integer value) {
            addCriterion("TIO.ITEM_OPT_ID =", value, "itemOptId");
            return (Criteria) this;
        }

        public Criteria andItemOptIdNotEqualTo(Integer value) {
            addCriterion("TIO.ITEM_OPT_ID <>", value, "itemOptId");
            return (Criteria) this;
        }

        public Criteria andItemOptIdGreaterThan(Integer value) {
            addCriterion("TIO.ITEM_OPT_ID >", value, "itemOptId");
            return (Criteria) this;
        }

        public Criteria andItemOptIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("TIO.ITEM_OPT_ID >=", value, "itemOptId");
            return (Criteria) this;
        }

        public Criteria andItemOptIdLessThan(Integer value) {
            addCriterion("TIO.ITEM_OPT_ID <", value, "itemOptId");
            return (Criteria) this;
        }

        public Criteria andItemOptIdLessThanOrEqualTo(Integer value) {
            addCriterion("TIO.ITEM_OPT_ID <=", value, "itemOptId");
            return (Criteria) this;
        }

        public Criteria andItemOptIdIn(List<Integer> values) {
            addCriterion("TIO.ITEM_OPT_ID in", values, "itemOptId");
            return (Criteria) this;
        }

        public Criteria andItemOptIdNotIn(List<Integer> values) {
            addCriterion("TIO.ITEM_OPT_ID not in", values, "itemOptId");
            return (Criteria) this;
        }

        public Criteria andItemOptIdBetween(Integer value1, Integer value2) {
            addCriterion("TIO.ITEM_OPT_ID between", value1, value2, "itemOptId");
            return (Criteria) this;
        }

        public Criteria andItemOptIdNotBetween(Integer value1, Integer value2) {
            addCriterion("TIO.ITEM_OPT_ID not between", value1, value2, "itemOptId");
            return (Criteria) this;
        }

        public Criteria andItemIdIsNull() {
            addCriterion("TIO.ITEM_ID is null");
            return (Criteria) this;
        }

        public Criteria andItemIdIsNotNull() {
            addCriterion("TIO.ITEM_ID is not null");
            return (Criteria) this;
        }

        public Criteria andItemIdEqualTo(Integer value) {
            addCriterion("TIO.ITEM_ID =", value, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdNotEqualTo(Integer value) {
            addCriterion("TIO.ITEM_ID <>", value, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdGreaterThan(Integer value) {
            addCriterion("TIO.ITEM_ID >", value, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("TIO.ITEM_ID >=", value, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdLessThan(Integer value) {
            addCriterion("TIO.ITEM_ID <", value, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdLessThanOrEqualTo(Integer value) {
            addCriterion("TIO.ITEM_ID <=", value, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdIn(List<Integer> values) {
            addCriterion("TIO.ITEM_ID in", values, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdNotIn(List<Integer> values) {
            addCriterion("TIO.ITEM_ID not in", values, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdBetween(Integer value1, Integer value2) {
            addCriterion("TIO.ITEM_ID between", value1, value2, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdNotBetween(Integer value1, Integer value2) {
            addCriterion("TIO.ITEM_ID not between", value1, value2, "itemId");
            return (Criteria) this;
        }

        public Criteria andOptSellStatCdIsNull() {
            addCriterion("TIO.OPT_SELL_STAT_CD is null");
            return (Criteria) this;
        }

        public Criteria andOptSellStatCdIsNotNull() {
            addCriterion("TIO.OPT_SELL_STAT_CD is not null");
            return (Criteria) this;
        }

        public Criteria andOptSellStatCdEqualTo(String value) {
            addCriterion("TIO.OPT_SELL_STAT_CD =", value, "optSellStatCd");
            return (Criteria) this;
        }

        public Criteria andOptSellStatCdNotEqualTo(String value) {
            addCriterion("TIO.OPT_SELL_STAT_CD <>", value, "optSellStatCd");
            return (Criteria) this;
        }

        public Criteria andOptSellStatCdGreaterThan(String value) {
            addCriterion("TIO.OPT_SELL_STAT_CD >", value, "optSellStatCd");
            return (Criteria) this;
        }

        public Criteria andOptSellStatCdGreaterThanOrEqualTo(String value) {
            addCriterion("TIO.OPT_SELL_STAT_CD >=", value, "optSellStatCd");
            return (Criteria) this;
        }

        public Criteria andOptSellStatCdLessThan(String value) {
            addCriterion("TIO.OPT_SELL_STAT_CD <", value, "optSellStatCd");
            return (Criteria) this;
        }

        public Criteria andOptSellStatCdLessThanOrEqualTo(String value) {
            addCriterion("TIO.OPT_SELL_STAT_CD <=", value, "optSellStatCd");
            return (Criteria) this;
        }

        public Criteria andOptSellStatCdLike(String value) {
            addCriterion("TIO.OPT_SELL_STAT_CD like", value, "optSellStatCd");
            return (Criteria) this;
        }

        public Criteria andOptSellStatCdNotLike(String value) {
            addCriterion("TIO.OPT_SELL_STAT_CD not like", value, "optSellStatCd");
            return (Criteria) this;
        }

        public Criteria andOptSellStatCdIn(List<String> values) {
            addCriterion("TIO.OPT_SELL_STAT_CD in", values, "optSellStatCd");
            return (Criteria) this;
        }

        public Criteria andOptSellStatCdNotIn(List<String> values) {
            addCriterion("TIO.OPT_SELL_STAT_CD not in", values, "optSellStatCd");
            return (Criteria) this;
        }

        public Criteria andOptSellStatCdBetween(String value1, String value2) {
            addCriterion("TIO.OPT_SELL_STAT_CD between", value1, value2, "optSellStatCd");
            return (Criteria) this;
        }

        public Criteria andOptSellStatCdNotBetween(String value1, String value2) {
            addCriterion("TIO.OPT_SELL_STAT_CD not between", value1, value2, "optSellStatCd");
            return (Criteria) this;
        }

        public Criteria andOptNmIsNull() {
            addCriterion("TIO.OPT_NM is null");
            return (Criteria) this;
        }

        public Criteria andOptNmIsNotNull() {
            addCriterion("TIO.OPT_NM is not null");
            return (Criteria) this;
        }

        public Criteria andOptNmEqualTo(String value) {
            addCriterion("TIO.OPT_NM =", value, "optNm");
            return (Criteria) this;
        }

        public Criteria andOptNmNotEqualTo(String value) {
            addCriterion("TIO.OPT_NM <>", value, "optNm");
            return (Criteria) this;
        }

        public Criteria andOptNmGreaterThan(String value) {
            addCriterion("TIO.OPT_NM >", value, "optNm");
            return (Criteria) this;
        }

        public Criteria andOptNmGreaterThanOrEqualTo(String value) {
            addCriterion("TIO.OPT_NM >=", value, "optNm");
            return (Criteria) this;
        }

        public Criteria andOptNmLessThan(String value) {
            addCriterion("TIO.OPT_NM <", value, "optNm");
            return (Criteria) this;
        }

        public Criteria andOptNmLessThanOrEqualTo(String value) {
            addCriterion("TIO.OPT_NM <=", value, "optNm");
            return (Criteria) this;
        }

        public Criteria andOptNmLike(String value) {
            addCriterion("TIO.OPT_NM like", value, "optNm");
            return (Criteria) this;
        }

        public Criteria andOptNmNotLike(String value) {
            addCriterion("TIO.OPT_NM not like", value, "optNm");
            return (Criteria) this;
        }

        public Criteria andOptNmIn(List<String> values) {
            addCriterion("TIO.OPT_NM in", values, "optNm");
            return (Criteria) this;
        }

        public Criteria andOptNmNotIn(List<String> values) {
            addCriterion("TIO.OPT_NM not in", values, "optNm");
            return (Criteria) this;
        }

        public Criteria andOptNmBetween(String value1, String value2) {
            addCriterion("TIO.OPT_NM between", value1, value2, "optNm");
            return (Criteria) this;
        }

        public Criteria andOptNmNotBetween(String value1, String value2) {
            addCriterion("TIO.OPT_NM not between", value1, value2, "optNm");
            return (Criteria) this;
        }

        public Criteria andSordIsNull() {
            addCriterion("TIO.SORD is null");
            return (Criteria) this;
        }

        public Criteria andSordIsNotNull() {
            addCriterion("TIO.SORD is not null");
            return (Criteria) this;
        }

        public Criteria andSordEqualTo(Integer value) {
            addCriterion("TIO.SORD =", value, "sord");
            return (Criteria) this;
        }

        public Criteria andSordNotEqualTo(Integer value) {
            addCriterion("TIO.SORD <>", value, "sord");
            return (Criteria) this;
        }

        public Criteria andSordGreaterThan(Integer value) {
            addCriterion("TIO.SORD >", value, "sord");
            return (Criteria) this;
        }

        public Criteria andSordGreaterThanOrEqualTo(Integer value) {
            addCriterion("TIO.SORD >=", value, "sord");
            return (Criteria) this;
        }

        public Criteria andSordLessThan(Integer value) {
            addCriterion("TIO.SORD <", value, "sord");
            return (Criteria) this;
        }

        public Criteria andSordLessThanOrEqualTo(Integer value) {
            addCriterion("TIO.SORD <=", value, "sord");
            return (Criteria) this;
        }

        public Criteria andSordIn(List<Integer> values) {
            addCriterion("TIO.SORD in", values, "sord");
            return (Criteria) this;
        }

        public Criteria andSordNotIn(List<Integer> values) {
            addCriterion("TIO.SORD not in", values, "sord");
            return (Criteria) this;
        }

        public Criteria andSordBetween(Integer value1, Integer value2) {
            addCriterion("TIO.SORD between", value1, value2, "sord");
            return (Criteria) this;
        }

        public Criteria andSordNotBetween(Integer value1, Integer value2) {
            addCriterion("TIO.SORD not between", value1, value2, "sord");
            return (Criteria) this;
        }

        public Criteria andRegDtIsNull() {
            addCriterion("TIO.REG_DT is null");
            return (Criteria) this;
        }

        public Criteria andRegDtIsNotNull() {
            addCriterion("TIO.REG_DT is not null");
            return (Criteria) this;
        }

        public Criteria andRegDtEqualTo(Date value) {
            addCriterion("TIO.REG_DT =", value, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtNotEqualTo(Date value) {
            addCriterion("TIO.REG_DT <>", value, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtGreaterThan(Date value) {
            addCriterion("TIO.REG_DT >", value, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtGreaterThanOrEqualTo(Date value) {
            addCriterion("TIO.REG_DT >=", value, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtLessThan(Date value) {
            addCriterion("TIO.REG_DT <", value, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtLessThanOrEqualTo(Date value) {
            addCriterion("TIO.REG_DT <=", value, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtIn(List<Date> values) {
            addCriterion("TIO.REG_DT in", values, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtNotIn(List<Date> values) {
            addCriterion("TIO.REG_DT not in", values, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtBetween(Date value1, Date value2) {
            addCriterion("TIO.REG_DT between", value1, value2, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtNotBetween(Date value1, Date value2) {
            addCriterion("TIO.REG_DT not between", value1, value2, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegIdIsNull() {
            addCriterion("TIO.REG_ID is null");
            return (Criteria) this;
        }

        public Criteria andRegIdIsNotNull() {
            addCriterion("TIO.REG_ID is not null");
            return (Criteria) this;
        }

        public Criteria andRegIdEqualTo(String value) {
            addCriterion("TIO.REG_ID =", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdNotEqualTo(String value) {
            addCriterion("TIO.REG_ID <>", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdGreaterThan(String value) {
            addCriterion("TIO.REG_ID >", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdGreaterThanOrEqualTo(String value) {
            addCriterion("TIO.REG_ID >=", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdLessThan(String value) {
            addCriterion("TIO.REG_ID <", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdLessThanOrEqualTo(String value) {
            addCriterion("TIO.REG_ID <=", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdLike(String value) {
            addCriterion("TIO.REG_ID like", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdNotLike(String value) {
            addCriterion("TIO.REG_ID not like", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdIn(List<String> values) {
            addCriterion("TIO.REG_ID in", values, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdNotIn(List<String> values) {
            addCriterion("TIO.REG_ID not in", values, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdBetween(String value1, String value2) {
            addCriterion("TIO.REG_ID between", value1, value2, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdNotBetween(String value1, String value2) {
            addCriterion("TIO.REG_ID not between", value1, value2, "regId");
            return (Criteria) this;
        }

        public Criteria andModDtIsNull() {
            addCriterion("TIO.MOD_DT is null");
            return (Criteria) this;
        }

        public Criteria andModDtIsNotNull() {
            addCriterion("TIO.MOD_DT is not null");
            return (Criteria) this;
        }

        public Criteria andModDtEqualTo(Date value) {
            addCriterion("TIO.MOD_DT =", value, "modDt");
            return (Criteria) this;
        }

        public Criteria andModDtNotEqualTo(Date value) {
            addCriterion("TIO.MOD_DT <>", value, "modDt");
            return (Criteria) this;
        }

        public Criteria andModDtGreaterThan(Date value) {
            addCriterion("TIO.MOD_DT >", value, "modDt");
            return (Criteria) this;
        }

        public Criteria andModDtGreaterThanOrEqualTo(Date value) {
            addCriterion("TIO.MOD_DT >=", value, "modDt");
            return (Criteria) this;
        }

        public Criteria andModDtLessThan(Date value) {
            addCriterion("TIO.MOD_DT <", value, "modDt");
            return (Criteria) this;
        }

        public Criteria andModDtLessThanOrEqualTo(Date value) {
            addCriterion("TIO.MOD_DT <=", value, "modDt");
            return (Criteria) this;
        }

        public Criteria andModDtIn(List<Date> values) {
            addCriterion("TIO.MOD_DT in", values, "modDt");
            return (Criteria) this;
        }

        public Criteria andModDtNotIn(List<Date> values) {
            addCriterion("TIO.MOD_DT not in", values, "modDt");
            return (Criteria) this;
        }

        public Criteria andModDtBetween(Date value1, Date value2) {
            addCriterion("TIO.MOD_DT between", value1, value2, "modDt");
            return (Criteria) this;
        }

        public Criteria andModDtNotBetween(Date value1, Date value2) {
            addCriterion("TIO.MOD_DT not between", value1, value2, "modDt");
            return (Criteria) this;
        }

        public Criteria andModIdIsNull() {
            addCriterion("TIO.MOD_ID is null");
            return (Criteria) this;
        }

        public Criteria andModIdIsNotNull() {
            addCriterion("TIO.MOD_ID is not null");
            return (Criteria) this;
        }

        public Criteria andModIdEqualTo(String value) {
            addCriterion("TIO.MOD_ID =", value, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdNotEqualTo(String value) {
            addCriterion("TIO.MOD_ID <>", value, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdGreaterThan(String value) {
            addCriterion("TIO.MOD_ID >", value, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdGreaterThanOrEqualTo(String value) {
            addCriterion("TIO.MOD_ID >=", value, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdLessThan(String value) {
            addCriterion("TIO.MOD_ID <", value, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdLessThanOrEqualTo(String value) {
            addCriterion("TIO.MOD_ID <=", value, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdLike(String value) {
            addCriterion("TIO.MOD_ID like", value, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdNotLike(String value) {
            addCriterion("TIO.MOD_ID not like", value, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdIn(List<String> values) {
            addCriterion("TIO.MOD_ID in", values, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdNotIn(List<String> values) {
            addCriterion("TIO.MOD_ID not in", values, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdBetween(String value1, String value2) {
            addCriterion("TIO.MOD_ID between", value1, value2, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdNotBetween(String value1, String value2) {
            addCriterion("TIO.MOD_ID not between", value1, value2, "modId");
            return (Criteria) this;
        }

        public Criteria andUseYnIsNull() {
            addCriterion("TIO.USE_YN is null");
            return (Criteria) this;
        }

        public Criteria andUseYnIsNotNull() {
            addCriterion("TIO.USE_YN is not null");
            return (Criteria) this;
        }

        public Criteria andUseYnEqualTo(String value) {
            addCriterion("TIO.USE_YN =", value, "useYn");
            return (Criteria) this;
        }

        public Criteria andUseYnNotEqualTo(String value) {
            addCriterion("TIO.USE_YN <>", value, "useYn");
            return (Criteria) this;
        }

        public Criteria andUseYnGreaterThan(String value) {
            addCriterion("TIO.USE_YN >", value, "useYn");
            return (Criteria) this;
        }

        public Criteria andUseYnGreaterThanOrEqualTo(String value) {
            addCriterion("TIO.USE_YN >=", value, "useYn");
            return (Criteria) this;
        }

        public Criteria andUseYnLessThan(String value) {
            addCriterion("TIO.USE_YN <", value, "useYn");
            return (Criteria) this;
        }

        public Criteria andUseYnLessThanOrEqualTo(String value) {
            addCriterion("TIO.USE_YN <=", value, "useYn");
            return (Criteria) this;
        }

        public Criteria andUseYnLike(String value) {
            addCriterion("TIO.USE_YN like", value, "useYn");
            return (Criteria) this;
        }

        public Criteria andUseYnNotLike(String value) {
            addCriterion("TIO.USE_YN not like", value, "useYn");
            return (Criteria) this;
        }

        public Criteria andUseYnIn(List<String> values) {
            addCriterion("TIO.USE_YN in", values, "useYn");
            return (Criteria) this;
        }

        public Criteria andUseYnNotIn(List<String> values) {
            addCriterion("TIO.USE_YN not in", values, "useYn");
            return (Criteria) this;
        }

        public Criteria andUseYnBetween(String value1, String value2) {
            addCriterion("TIO.USE_YN between", value1, value2, "useYn");
            return (Criteria) this;
        }

        public Criteria andUseYnNotBetween(String value1, String value2) {
            addCriterion("TIO.USE_YN not between", value1, value2, "useYn");
            return (Criteria) this;
        }

        public Criteria andOptSellStatCdLikeInsensitive(String value) {
            addCriterion("upper(TIO.OPT_SELL_STAT_CD) like", value.toUpperCase(), "optSellStatCd");
            return (Criteria) this;
        }

        public Criteria andOptNmLikeInsensitive(String value) {
            addCriterion("upper(TIO.OPT_NM) like", value.toUpperCase(), "optNm");
            return (Criteria) this;
        }

        public Criteria andRegIdLikeInsensitive(String value) {
            addCriterion("upper(TIO.REG_ID) like", value.toUpperCase(), "regId");
            return (Criteria) this;
        }

        public Criteria andModIdLikeInsensitive(String value) {
            addCriterion("upper(TIO.MOD_ID) like", value.toUpperCase(), "modId");
            return (Criteria) this;
        }

        public Criteria andUseYnLikeInsensitive(String value) {
            addCriterion("upper(TIO.USE_YN) like", value.toUpperCase(), "useYn");
            return (Criteria) this;
        }

        public Criteria andOptSellStatCdLikeLeft(String value) {
            addCriterion("TIO.OPT_SELL_STAT_CD like ", "%" + value, "optSellStatCd");
            return (Criteria) this;
        }

        public Criteria andOptSellStatCdLikeRight(String value) {
            addCriterion("TIO.OPT_SELL_STAT_CD like ", value + "%", "optSellStatCd");
            return (Criteria) this;
        }

        public Criteria andOptSellStatCdLikeBoth(String value) {
            addCriterion("TIO.OPT_SELL_STAT_CD like ", "%" + value + "%", "optSellStatCd");
            return (Criteria) this;
        }

        public Criteria andOptNmLikeLeft(String value) {
            addCriterion("TIO.OPT_NM like ", "%" + value, "optNm");
            return (Criteria) this;
        }

        public Criteria andOptNmLikeRight(String value) {
            addCriterion("TIO.OPT_NM like ", value + "%", "optNm");
            return (Criteria) this;
        }

        public Criteria andOptNmLikeBoth(String value) {
            addCriterion("TIO.OPT_NM like ", "%" + value + "%", "optNm");
            return (Criteria) this;
        }

        public Criteria andRegIdLikeLeft(String value) {
            addCriterion("TIO.REG_ID like ", "%" + value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdLikeRight(String value) {
            addCriterion("TIO.REG_ID like ", value + "%", "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdLikeBoth(String value) {
            addCriterion("TIO.REG_ID like ", "%" + value + "%", "regId");
            return (Criteria) this;
        }

        public Criteria andModIdLikeLeft(String value) {
            addCriterion("TIO.MOD_ID like ", "%" + value, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdLikeRight(String value) {
            addCriterion("TIO.MOD_ID like ", value + "%", "modId");
            return (Criteria) this;
        }

        public Criteria andModIdLikeBoth(String value) {
            addCriterion("TIO.MOD_ID like ", "%" + value + "%", "modId");
            return (Criteria) this;
        }

        public Criteria andUseYnLikeLeft(String value) {
            addCriterion("TIO.USE_YN like ", "%" + value, "useYn");
            return (Criteria) this;
        }

        public Criteria andUseYnLikeRight(String value) {
            addCriterion("TIO.USE_YN like ", value + "%", "useYn");
            return (Criteria) this;
        }

        public Criteria andUseYnLikeBoth(String value) {
            addCriterion("TIO.USE_YN like ", "%" + value + "%", "useYn");
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