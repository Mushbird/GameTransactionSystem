package com.mushbird.sinsege.base.module.item.model.entity.criteria;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ItemPriceEntityCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    public ItemPriceEntityCriteria() {
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

        public Criteria andItemPrcIdIsNull() {
            addCriterion("TIP.ITEM_PRC_ID is null");
            return (Criteria) this;
        }

        public Criteria andItemPrcIdIsNotNull() {
            addCriterion("TIP.ITEM_PRC_ID is not null");
            return (Criteria) this;
        }

        public Criteria andItemPrcIdEqualTo(Integer value) {
            addCriterion("TIP.ITEM_PRC_ID =", value, "itemPrcId");
            return (Criteria) this;
        }

        public Criteria andItemPrcIdNotEqualTo(Integer value) {
            addCriterion("TIP.ITEM_PRC_ID <>", value, "itemPrcId");
            return (Criteria) this;
        }

        public Criteria andItemPrcIdGreaterThan(Integer value) {
            addCriterion("TIP.ITEM_PRC_ID >", value, "itemPrcId");
            return (Criteria) this;
        }

        public Criteria andItemPrcIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("TIP.ITEM_PRC_ID >=", value, "itemPrcId");
            return (Criteria) this;
        }

        public Criteria andItemPrcIdLessThan(Integer value) {
            addCriterion("TIP.ITEM_PRC_ID <", value, "itemPrcId");
            return (Criteria) this;
        }

        public Criteria andItemPrcIdLessThanOrEqualTo(Integer value) {
            addCriterion("TIP.ITEM_PRC_ID <=", value, "itemPrcId");
            return (Criteria) this;
        }

        public Criteria andItemPrcIdIn(List<Integer> values) {
            addCriterion("TIP.ITEM_PRC_ID in", values, "itemPrcId");
            return (Criteria) this;
        }

        public Criteria andItemPrcIdNotIn(List<Integer> values) {
            addCriterion("TIP.ITEM_PRC_ID not in", values, "itemPrcId");
            return (Criteria) this;
        }

        public Criteria andItemPrcIdBetween(Integer value1, Integer value2) {
            addCriterion("TIP.ITEM_PRC_ID between", value1, value2, "itemPrcId");
            return (Criteria) this;
        }

        public Criteria andItemPrcIdNotBetween(Integer value1, Integer value2) {
            addCriterion("TIP.ITEM_PRC_ID not between", value1, value2, "itemPrcId");
            return (Criteria) this;
        }

        public Criteria andItemIdIsNull() {
            addCriterion("TIP.ITEM_ID is null");
            return (Criteria) this;
        }

        public Criteria andItemIdIsNotNull() {
            addCriterion("TIP.ITEM_ID is not null");
            return (Criteria) this;
        }

        public Criteria andItemIdEqualTo(Integer value) {
            addCriterion("TIP.ITEM_ID =", value, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdNotEqualTo(Integer value) {
            addCriterion("TIP.ITEM_ID <>", value, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdGreaterThan(Integer value) {
            addCriterion("TIP.ITEM_ID >", value, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("TIP.ITEM_ID >=", value, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdLessThan(Integer value) {
            addCriterion("TIP.ITEM_ID <", value, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdLessThanOrEqualTo(Integer value) {
            addCriterion("TIP.ITEM_ID <=", value, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdIn(List<Integer> values) {
            addCriterion("TIP.ITEM_ID in", values, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdNotIn(List<Integer> values) {
            addCriterion("TIP.ITEM_ID not in", values, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdBetween(Integer value1, Integer value2) {
            addCriterion("TIP.ITEM_ID between", value1, value2, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdNotBetween(Integer value1, Integer value2) {
            addCriterion("TIP.ITEM_ID not between", value1, value2, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemSetIdIsNull() {
            addCriterion("TIP.ITEM_SET_ID is null");
            return (Criteria) this;
        }

        public Criteria andItemSetIdIsNotNull() {
            addCriterion("TIP.ITEM_SET_ID is not null");
            return (Criteria) this;
        }

        public Criteria andItemSetIdEqualTo(Integer value) {
            addCriterion("TIP.ITEM_SET_ID =", value, "itemSetId");
            return (Criteria) this;
        }

        public Criteria andItemSetIdNotEqualTo(Integer value) {
            addCriterion("TIP.ITEM_SET_ID <>", value, "itemSetId");
            return (Criteria) this;
        }

        public Criteria andItemSetIdGreaterThan(Integer value) {
            addCriterion("TIP.ITEM_SET_ID >", value, "itemSetId");
            return (Criteria) this;
        }

        public Criteria andItemSetIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("TIP.ITEM_SET_ID >=", value, "itemSetId");
            return (Criteria) this;
        }

        public Criteria andItemSetIdLessThan(Integer value) {
            addCriterion("TIP.ITEM_SET_ID <", value, "itemSetId");
            return (Criteria) this;
        }

        public Criteria andItemSetIdLessThanOrEqualTo(Integer value) {
            addCriterion("TIP.ITEM_SET_ID <=", value, "itemSetId");
            return (Criteria) this;
        }

        public Criteria andItemSetIdIn(List<Integer> values) {
            addCriterion("TIP.ITEM_SET_ID in", values, "itemSetId");
            return (Criteria) this;
        }

        public Criteria andItemSetIdNotIn(List<Integer> values) {
            addCriterion("TIP.ITEM_SET_ID not in", values, "itemSetId");
            return (Criteria) this;
        }

        public Criteria andItemSetIdBetween(Integer value1, Integer value2) {
            addCriterion("TIP.ITEM_SET_ID between", value1, value2, "itemSetId");
            return (Criteria) this;
        }

        public Criteria andItemSetIdNotBetween(Integer value1, Integer value2) {
            addCriterion("TIP.ITEM_SET_ID not between", value1, value2, "itemSetId");
            return (Criteria) this;
        }

        public Criteria andDpChIdIsNull() {
            addCriterion("TIP.DP_CH_ID is null");
            return (Criteria) this;
        }

        public Criteria andDpChIdIsNotNull() {
            addCriterion("TIP.DP_CH_ID is not null");
            return (Criteria) this;
        }

        public Criteria andDpChIdEqualTo(Integer value) {
            addCriterion("TIP.DP_CH_ID =", value, "dpChId");
            return (Criteria) this;
        }

        public Criteria andDpChIdNotEqualTo(Integer value) {
            addCriterion("TIP.DP_CH_ID <>", value, "dpChId");
            return (Criteria) this;
        }

        public Criteria andDpChIdGreaterThan(Integer value) {
            addCriterion("TIP.DP_CH_ID >", value, "dpChId");
            return (Criteria) this;
        }

        public Criteria andDpChIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("TIP.DP_CH_ID >=", value, "dpChId");
            return (Criteria) this;
        }

        public Criteria andDpChIdLessThan(Integer value) {
            addCriterion("TIP.DP_CH_ID <", value, "dpChId");
            return (Criteria) this;
        }

        public Criteria andDpChIdLessThanOrEqualTo(Integer value) {
            addCriterion("TIP.DP_CH_ID <=", value, "dpChId");
            return (Criteria) this;
        }

        public Criteria andDpChIdIn(List<Integer> values) {
            addCriterion("TIP.DP_CH_ID in", values, "dpChId");
            return (Criteria) this;
        }

        public Criteria andDpChIdNotIn(List<Integer> values) {
            addCriterion("TIP.DP_CH_ID not in", values, "dpChId");
            return (Criteria) this;
        }

        public Criteria andDpChIdBetween(Integer value1, Integer value2) {
            addCriterion("TIP.DP_CH_ID between", value1, value2, "dpChId");
            return (Criteria) this;
        }

        public Criteria andDpChIdNotBetween(Integer value1, Integer value2) {
            addCriterion("TIP.DP_CH_ID not between", value1, value2, "dpChId");
            return (Criteria) this;
        }

        public Criteria andItemPrcTpCdIsNull() {
            addCriterion("TIP.ITEM_PRC_TP_CD is null");
            return (Criteria) this;
        }

        public Criteria andItemPrcTpCdIsNotNull() {
            addCriterion("TIP.ITEM_PRC_TP_CD is not null");
            return (Criteria) this;
        }

        public Criteria andItemPrcTpCdEqualTo(String value) {
            addCriterion("TIP.ITEM_PRC_TP_CD =", value, "itemPrcTpCd");
            return (Criteria) this;
        }

        public Criteria andItemPrcTpCdNotEqualTo(String value) {
            addCriterion("TIP.ITEM_PRC_TP_CD <>", value, "itemPrcTpCd");
            return (Criteria) this;
        }

        public Criteria andItemPrcTpCdGreaterThan(String value) {
            addCriterion("TIP.ITEM_PRC_TP_CD >", value, "itemPrcTpCd");
            return (Criteria) this;
        }

        public Criteria andItemPrcTpCdGreaterThanOrEqualTo(String value) {
            addCriterion("TIP.ITEM_PRC_TP_CD >=", value, "itemPrcTpCd");
            return (Criteria) this;
        }

        public Criteria andItemPrcTpCdLessThan(String value) {
            addCriterion("TIP.ITEM_PRC_TP_CD <", value, "itemPrcTpCd");
            return (Criteria) this;
        }

        public Criteria andItemPrcTpCdLessThanOrEqualTo(String value) {
            addCriterion("TIP.ITEM_PRC_TP_CD <=", value, "itemPrcTpCd");
            return (Criteria) this;
        }

        public Criteria andItemPrcTpCdLike(String value) {
            addCriterion("TIP.ITEM_PRC_TP_CD like", value, "itemPrcTpCd");
            return (Criteria) this;
        }

        public Criteria andItemPrcTpCdNotLike(String value) {
            addCriterion("TIP.ITEM_PRC_TP_CD not like", value, "itemPrcTpCd");
            return (Criteria) this;
        }

        public Criteria andItemPrcTpCdIn(List<String> values) {
            addCriterion("TIP.ITEM_PRC_TP_CD in", values, "itemPrcTpCd");
            return (Criteria) this;
        }

        public Criteria andItemPrcTpCdNotIn(List<String> values) {
            addCriterion("TIP.ITEM_PRC_TP_CD not in", values, "itemPrcTpCd");
            return (Criteria) this;
        }

        public Criteria andItemPrcTpCdBetween(String value1, String value2) {
            addCriterion("TIP.ITEM_PRC_TP_CD between", value1, value2, "itemPrcTpCd");
            return (Criteria) this;
        }

        public Criteria andItemPrcTpCdNotBetween(String value1, String value2) {
            addCriterion("TIP.ITEM_PRC_TP_CD not between", value1, value2, "itemPrcTpCd");
            return (Criteria) this;
        }

        public Criteria andSplyUprcIsNull() {
            addCriterion("TIP.SPLY_UPRC is null");
            return (Criteria) this;
        }

        public Criteria andSplyUprcIsNotNull() {
            addCriterion("TIP.SPLY_UPRC is not null");
            return (Criteria) this;
        }

        public Criteria andSplyUprcEqualTo(Integer value) {
            addCriterion("TIP.SPLY_UPRC =", value, "splyUprc");
            return (Criteria) this;
        }

        public Criteria andSplyUprcNotEqualTo(Integer value) {
            addCriterion("TIP.SPLY_UPRC <>", value, "splyUprc");
            return (Criteria) this;
        }

        public Criteria andSplyUprcGreaterThan(Integer value) {
            addCriterion("TIP.SPLY_UPRC >", value, "splyUprc");
            return (Criteria) this;
        }

        public Criteria andSplyUprcGreaterThanOrEqualTo(Integer value) {
            addCriterion("TIP.SPLY_UPRC >=", value, "splyUprc");
            return (Criteria) this;
        }

        public Criteria andSplyUprcLessThan(Integer value) {
            addCriterion("TIP.SPLY_UPRC <", value, "splyUprc");
            return (Criteria) this;
        }

        public Criteria andSplyUprcLessThanOrEqualTo(Integer value) {
            addCriterion("TIP.SPLY_UPRC <=", value, "splyUprc");
            return (Criteria) this;
        }

        public Criteria andSplyUprcIn(List<Integer> values) {
            addCriterion("TIP.SPLY_UPRC in", values, "splyUprc");
            return (Criteria) this;
        }

        public Criteria andSplyUprcNotIn(List<Integer> values) {
            addCriterion("TIP.SPLY_UPRC not in", values, "splyUprc");
            return (Criteria) this;
        }

        public Criteria andSplyUprcBetween(Integer value1, Integer value2) {
            addCriterion("TIP.SPLY_UPRC between", value1, value2, "splyUprc");
            return (Criteria) this;
        }

        public Criteria andSplyUprcNotBetween(Integer value1, Integer value2) {
            addCriterion("TIP.SPLY_UPRC not between", value1, value2, "splyUprc");
            return (Criteria) this;
        }

        public Criteria andSplyPrcIsNull() {
            addCriterion("TIP.SPLY_PRC is null");
            return (Criteria) this;
        }

        public Criteria andSplyPrcIsNotNull() {
            addCriterion("TIP.SPLY_PRC is not null");
            return (Criteria) this;
        }

        public Criteria andSplyPrcEqualTo(Integer value) {
            addCriterion("TIP.SPLY_PRC =", value, "splyPrc");
            return (Criteria) this;
        }

        public Criteria andSplyPrcNotEqualTo(Integer value) {
            addCriterion("TIP.SPLY_PRC <>", value, "splyPrc");
            return (Criteria) this;
        }

        public Criteria andSplyPrcGreaterThan(Integer value) {
            addCriterion("TIP.SPLY_PRC >", value, "splyPrc");
            return (Criteria) this;
        }

        public Criteria andSplyPrcGreaterThanOrEqualTo(Integer value) {
            addCriterion("TIP.SPLY_PRC >=", value, "splyPrc");
            return (Criteria) this;
        }

        public Criteria andSplyPrcLessThan(Integer value) {
            addCriterion("TIP.SPLY_PRC <", value, "splyPrc");
            return (Criteria) this;
        }

        public Criteria andSplyPrcLessThanOrEqualTo(Integer value) {
            addCriterion("TIP.SPLY_PRC <=", value, "splyPrc");
            return (Criteria) this;
        }

        public Criteria andSplyPrcIn(List<Integer> values) {
            addCriterion("TIP.SPLY_PRC in", values, "splyPrc");
            return (Criteria) this;
        }

        public Criteria andSplyPrcNotIn(List<Integer> values) {
            addCriterion("TIP.SPLY_PRC not in", values, "splyPrc");
            return (Criteria) this;
        }

        public Criteria andSplyPrcBetween(Integer value1, Integer value2) {
            addCriterion("TIP.SPLY_PRC between", value1, value2, "splyPrc");
            return (Criteria) this;
        }

        public Criteria andSplyPrcNotBetween(Integer value1, Integer value2) {
            addCriterion("TIP.SPLY_PRC not between", value1, value2, "splyPrc");
            return (Criteria) this;
        }

        public Criteria andSellPrcIsNull() {
            addCriterion("TIP.SELL_PRC is null");
            return (Criteria) this;
        }

        public Criteria andSellPrcIsNotNull() {
            addCriterion("TIP.SELL_PRC is not null");
            return (Criteria) this;
        }

        public Criteria andSellPrcEqualTo(Integer value) {
            addCriterion("TIP.SELL_PRC =", value, "sellPrc");
            return (Criteria) this;
        }

        public Criteria andSellPrcNotEqualTo(Integer value) {
            addCriterion("TIP.SELL_PRC <>", value, "sellPrc");
            return (Criteria) this;
        }

        public Criteria andSellPrcGreaterThan(Integer value) {
            addCriterion("TIP.SELL_PRC >", value, "sellPrc");
            return (Criteria) this;
        }

        public Criteria andSellPrcGreaterThanOrEqualTo(Integer value) {
            addCriterion("TIP.SELL_PRC >=", value, "sellPrc");
            return (Criteria) this;
        }

        public Criteria andSellPrcLessThan(Integer value) {
            addCriterion("TIP.SELL_PRC <", value, "sellPrc");
            return (Criteria) this;
        }

        public Criteria andSellPrcLessThanOrEqualTo(Integer value) {
            addCriterion("TIP.SELL_PRC <=", value, "sellPrc");
            return (Criteria) this;
        }

        public Criteria andSellPrcIn(List<Integer> values) {
            addCriterion("TIP.SELL_PRC in", values, "sellPrc");
            return (Criteria) this;
        }

        public Criteria andSellPrcNotIn(List<Integer> values) {
            addCriterion("TIP.SELL_PRC not in", values, "sellPrc");
            return (Criteria) this;
        }

        public Criteria andSellPrcBetween(Integer value1, Integer value2) {
            addCriterion("TIP.SELL_PRC between", value1, value2, "sellPrc");
            return (Criteria) this;
        }

        public Criteria andSellPrcNotBetween(Integer value1, Integer value2) {
            addCriterion("TIP.SELL_PRC not between", value1, value2, "sellPrc");
            return (Criteria) this;
        }

        public Criteria andDcRateIsNull() {
            addCriterion("TIP.DC_RATE is null");
            return (Criteria) this;
        }

        public Criteria andDcRateIsNotNull() {
            addCriterion("TIP.DC_RATE is not null");
            return (Criteria) this;
        }

        public Criteria andDcRateEqualTo(BigDecimal value) {
            addCriterion("TIP.DC_RATE =", value, "dcRate");
            return (Criteria) this;
        }

        public Criteria andDcRateNotEqualTo(BigDecimal value) {
            addCriterion("TIP.DC_RATE <>", value, "dcRate");
            return (Criteria) this;
        }

        public Criteria andDcRateGreaterThan(BigDecimal value) {
            addCriterion("TIP.DC_RATE >", value, "dcRate");
            return (Criteria) this;
        }

        public Criteria andDcRateGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("TIP.DC_RATE >=", value, "dcRate");
            return (Criteria) this;
        }

        public Criteria andDcRateLessThan(BigDecimal value) {
            addCriterion("TIP.DC_RATE <", value, "dcRate");
            return (Criteria) this;
        }

        public Criteria andDcRateLessThanOrEqualTo(BigDecimal value) {
            addCriterion("TIP.DC_RATE <=", value, "dcRate");
            return (Criteria) this;
        }

        public Criteria andDcRateIn(List<BigDecimal> values) {
            addCriterion("TIP.DC_RATE in", values, "dcRate");
            return (Criteria) this;
        }

        public Criteria andDcRateNotIn(List<BigDecimal> values) {
            addCriterion("TIP.DC_RATE not in", values, "dcRate");
            return (Criteria) this;
        }

        public Criteria andDcRateBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TIP.DC_RATE between", value1, value2, "dcRate");
            return (Criteria) this;
        }

        public Criteria andDcRateNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TIP.DC_RATE not between", value1, value2, "dcRate");
            return (Criteria) this;
        }

        public Criteria andComsRateIsNull() {
            addCriterion("TIP.COMS_RATE is null");
            return (Criteria) this;
        }

        public Criteria andComsRateIsNotNull() {
            addCriterion("TIP.COMS_RATE is not null");
            return (Criteria) this;
        }

        public Criteria andComsRateEqualTo(BigDecimal value) {
            addCriterion("TIP.COMS_RATE =", value, "comsRate");
            return (Criteria) this;
        }

        public Criteria andComsRateNotEqualTo(BigDecimal value) {
            addCriterion("TIP.COMS_RATE <>", value, "comsRate");
            return (Criteria) this;
        }

        public Criteria andComsRateGreaterThan(BigDecimal value) {
            addCriterion("TIP.COMS_RATE >", value, "comsRate");
            return (Criteria) this;
        }

        public Criteria andComsRateGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("TIP.COMS_RATE >=", value, "comsRate");
            return (Criteria) this;
        }

        public Criteria andComsRateLessThan(BigDecimal value) {
            addCriterion("TIP.COMS_RATE <", value, "comsRate");
            return (Criteria) this;
        }

        public Criteria andComsRateLessThanOrEqualTo(BigDecimal value) {
            addCriterion("TIP.COMS_RATE <=", value, "comsRate");
            return (Criteria) this;
        }

        public Criteria andComsRateIn(List<BigDecimal> values) {
            addCriterion("TIP.COMS_RATE in", values, "comsRate");
            return (Criteria) this;
        }

        public Criteria andComsRateNotIn(List<BigDecimal> values) {
            addCriterion("TIP.COMS_RATE not in", values, "comsRate");
            return (Criteria) this;
        }

        public Criteria andComsRateBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TIP.COMS_RATE between", value1, value2, "comsRate");
            return (Criteria) this;
        }

        public Criteria andComsRateNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TIP.COMS_RATE not between", value1, value2, "comsRate");
            return (Criteria) this;
        }

        public Criteria andComsAmtIsNull() {
            addCriterion("TIP.COMS_AMT is null");
            return (Criteria) this;
        }

        public Criteria andComsAmtIsNotNull() {
            addCriterion("TIP.COMS_AMT is not null");
            return (Criteria) this;
        }

        public Criteria andComsAmtEqualTo(Integer value) {
            addCriterion("TIP.COMS_AMT =", value, "comsAmt");
            return (Criteria) this;
        }

        public Criteria andComsAmtNotEqualTo(Integer value) {
            addCriterion("TIP.COMS_AMT <>", value, "comsAmt");
            return (Criteria) this;
        }

        public Criteria andComsAmtGreaterThan(Integer value) {
            addCriterion("TIP.COMS_AMT >", value, "comsAmt");
            return (Criteria) this;
        }

        public Criteria andComsAmtGreaterThanOrEqualTo(Integer value) {
            addCriterion("TIP.COMS_AMT >=", value, "comsAmt");
            return (Criteria) this;
        }

        public Criteria andComsAmtLessThan(Integer value) {
            addCriterion("TIP.COMS_AMT <", value, "comsAmt");
            return (Criteria) this;
        }

        public Criteria andComsAmtLessThanOrEqualTo(Integer value) {
            addCriterion("TIP.COMS_AMT <=", value, "comsAmt");
            return (Criteria) this;
        }

        public Criteria andComsAmtIn(List<Integer> values) {
            addCriterion("TIP.COMS_AMT in", values, "comsAmt");
            return (Criteria) this;
        }

        public Criteria andComsAmtNotIn(List<Integer> values) {
            addCriterion("TIP.COMS_AMT not in", values, "comsAmt");
            return (Criteria) this;
        }

        public Criteria andComsAmtBetween(Integer value1, Integer value2) {
            addCriterion("TIP.COMS_AMT between", value1, value2, "comsAmt");
            return (Criteria) this;
        }

        public Criteria andComsAmtNotBetween(Integer value1, Integer value2) {
            addCriterion("TIP.COMS_AMT not between", value1, value2, "comsAmt");
            return (Criteria) this;
        }

        public Criteria andAplyYnIsNull() {
            addCriterion("TIP.APLY_YN is null");
            return (Criteria) this;
        }

        public Criteria andAplyYnIsNotNull() {
            addCriterion("TIP.APLY_YN is not null");
            return (Criteria) this;
        }

        public Criteria andAplyYnEqualTo(String value) {
            addCriterion("TIP.APLY_YN =", value, "aplyYn");
            return (Criteria) this;
        }

        public Criteria andAplyYnNotEqualTo(String value) {
            addCriterion("TIP.APLY_YN <>", value, "aplyYn");
            return (Criteria) this;
        }

        public Criteria andAplyYnGreaterThan(String value) {
            addCriterion("TIP.APLY_YN >", value, "aplyYn");
            return (Criteria) this;
        }

        public Criteria andAplyYnGreaterThanOrEqualTo(String value) {
            addCriterion("TIP.APLY_YN >=", value, "aplyYn");
            return (Criteria) this;
        }

        public Criteria andAplyYnLessThan(String value) {
            addCriterion("TIP.APLY_YN <", value, "aplyYn");
            return (Criteria) this;
        }

        public Criteria andAplyYnLessThanOrEqualTo(String value) {
            addCriterion("TIP.APLY_YN <=", value, "aplyYn");
            return (Criteria) this;
        }

        public Criteria andAplyYnLike(String value) {
            addCriterion("TIP.APLY_YN like", value, "aplyYn");
            return (Criteria) this;
        }

        public Criteria andAplyYnNotLike(String value) {
            addCriterion("TIP.APLY_YN not like", value, "aplyYn");
            return (Criteria) this;
        }

        public Criteria andAplyYnIn(List<String> values) {
            addCriterion("TIP.APLY_YN in", values, "aplyYn");
            return (Criteria) this;
        }

        public Criteria andAplyYnNotIn(List<String> values) {
            addCriterion("TIP.APLY_YN not in", values, "aplyYn");
            return (Criteria) this;
        }

        public Criteria andAplyYnBetween(String value1, String value2) {
            addCriterion("TIP.APLY_YN between", value1, value2, "aplyYn");
            return (Criteria) this;
        }

        public Criteria andAplyYnNotBetween(String value1, String value2) {
            addCriterion("TIP.APLY_YN not between", value1, value2, "aplyYn");
            return (Criteria) this;
        }

        public Criteria andRegDtIsNull() {
            addCriterion("TIP.REG_DT is null");
            return (Criteria) this;
        }

        public Criteria andRegDtIsNotNull() {
            addCriterion("TIP.REG_DT is not null");
            return (Criteria) this;
        }

        public Criteria andRegDtEqualTo(Date value) {
            addCriterion("TIP.REG_DT =", value, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtNotEqualTo(Date value) {
            addCriterion("TIP.REG_DT <>", value, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtGreaterThan(Date value) {
            addCriterion("TIP.REG_DT >", value, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtGreaterThanOrEqualTo(Date value) {
            addCriterion("TIP.REG_DT >=", value, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtLessThan(Date value) {
            addCriterion("TIP.REG_DT <", value, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtLessThanOrEqualTo(Date value) {
            addCriterion("TIP.REG_DT <=", value, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtIn(List<Date> values) {
            addCriterion("TIP.REG_DT in", values, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtNotIn(List<Date> values) {
            addCriterion("TIP.REG_DT not in", values, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtBetween(Date value1, Date value2) {
            addCriterion("TIP.REG_DT between", value1, value2, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtNotBetween(Date value1, Date value2) {
            addCriterion("TIP.REG_DT not between", value1, value2, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegIdIsNull() {
            addCriterion("TIP.REG_ID is null");
            return (Criteria) this;
        }

        public Criteria andRegIdIsNotNull() {
            addCriterion("TIP.REG_ID is not null");
            return (Criteria) this;
        }

        public Criteria andRegIdEqualTo(String value) {
            addCriterion("TIP.REG_ID =", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdNotEqualTo(String value) {
            addCriterion("TIP.REG_ID <>", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdGreaterThan(String value) {
            addCriterion("TIP.REG_ID >", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdGreaterThanOrEqualTo(String value) {
            addCriterion("TIP.REG_ID >=", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdLessThan(String value) {
            addCriterion("TIP.REG_ID <", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdLessThanOrEqualTo(String value) {
            addCriterion("TIP.REG_ID <=", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdLike(String value) {
            addCriterion("TIP.REG_ID like", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdNotLike(String value) {
            addCriterion("TIP.REG_ID not like", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdIn(List<String> values) {
            addCriterion("TIP.REG_ID in", values, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdNotIn(List<String> values) {
            addCriterion("TIP.REG_ID not in", values, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdBetween(String value1, String value2) {
            addCriterion("TIP.REG_ID between", value1, value2, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdNotBetween(String value1, String value2) {
            addCriterion("TIP.REG_ID not between", value1, value2, "regId");
            return (Criteria) this;
        }

        public Criteria andModDtIsNull() {
            addCriterion("TIP.MOD_DT is null");
            return (Criteria) this;
        }

        public Criteria andModDtIsNotNull() {
            addCriterion("TIP.MOD_DT is not null");
            return (Criteria) this;
        }

        public Criteria andModDtEqualTo(Date value) {
            addCriterion("TIP.MOD_DT =", value, "modDt");
            return (Criteria) this;
        }

        public Criteria andModDtNotEqualTo(Date value) {
            addCriterion("TIP.MOD_DT <>", value, "modDt");
            return (Criteria) this;
        }

        public Criteria andModDtGreaterThan(Date value) {
            addCriterion("TIP.MOD_DT >", value, "modDt");
            return (Criteria) this;
        }

        public Criteria andModDtGreaterThanOrEqualTo(Date value) {
            addCriterion("TIP.MOD_DT >=", value, "modDt");
            return (Criteria) this;
        }

        public Criteria andModDtLessThan(Date value) {
            addCriterion("TIP.MOD_DT <", value, "modDt");
            return (Criteria) this;
        }

        public Criteria andModDtLessThanOrEqualTo(Date value) {
            addCriterion("TIP.MOD_DT <=", value, "modDt");
            return (Criteria) this;
        }

        public Criteria andModDtIn(List<Date> values) {
            addCriterion("TIP.MOD_DT in", values, "modDt");
            return (Criteria) this;
        }

        public Criteria andModDtNotIn(List<Date> values) {
            addCriterion("TIP.MOD_DT not in", values, "modDt");
            return (Criteria) this;
        }

        public Criteria andModDtBetween(Date value1, Date value2) {
            addCriterion("TIP.MOD_DT between", value1, value2, "modDt");
            return (Criteria) this;
        }

        public Criteria andModDtNotBetween(Date value1, Date value2) {
            addCriterion("TIP.MOD_DT not between", value1, value2, "modDt");
            return (Criteria) this;
        }

        public Criteria andModIdIsNull() {
            addCriterion("TIP.MOD_ID is null");
            return (Criteria) this;
        }

        public Criteria andModIdIsNotNull() {
            addCriterion("TIP.MOD_ID is not null");
            return (Criteria) this;
        }

        public Criteria andModIdEqualTo(String value) {
            addCriterion("TIP.MOD_ID =", value, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdNotEqualTo(String value) {
            addCriterion("TIP.MOD_ID <>", value, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdGreaterThan(String value) {
            addCriterion("TIP.MOD_ID >", value, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdGreaterThanOrEqualTo(String value) {
            addCriterion("TIP.MOD_ID >=", value, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdLessThan(String value) {
            addCriterion("TIP.MOD_ID <", value, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdLessThanOrEqualTo(String value) {
            addCriterion("TIP.MOD_ID <=", value, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdLike(String value) {
            addCriterion("TIP.MOD_ID like", value, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdNotLike(String value) {
            addCriterion("TIP.MOD_ID not like", value, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdIn(List<String> values) {
            addCriterion("TIP.MOD_ID in", values, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdNotIn(List<String> values) {
            addCriterion("TIP.MOD_ID not in", values, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdBetween(String value1, String value2) {
            addCriterion("TIP.MOD_ID between", value1, value2, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdNotBetween(String value1, String value2) {
            addCriterion("TIP.MOD_ID not between", value1, value2, "modId");
            return (Criteria) this;
        }

        public Criteria andUseYnIsNull() {
            addCriterion("TIP.USE_YN is null");
            return (Criteria) this;
        }

        public Criteria andUseYnIsNotNull() {
            addCriterion("TIP.USE_YN is not null");
            return (Criteria) this;
        }

        public Criteria andUseYnEqualTo(String value) {
            addCriterion("TIP.USE_YN =", value, "useYn");
            return (Criteria) this;
        }

        public Criteria andUseYnNotEqualTo(String value) {
            addCriterion("TIP.USE_YN <>", value, "useYn");
            return (Criteria) this;
        }

        public Criteria andUseYnGreaterThan(String value) {
            addCriterion("TIP.USE_YN >", value, "useYn");
            return (Criteria) this;
        }

        public Criteria andUseYnGreaterThanOrEqualTo(String value) {
            addCriterion("TIP.USE_YN >=", value, "useYn");
            return (Criteria) this;
        }

        public Criteria andUseYnLessThan(String value) {
            addCriterion("TIP.USE_YN <", value, "useYn");
            return (Criteria) this;
        }

        public Criteria andUseYnLessThanOrEqualTo(String value) {
            addCriterion("TIP.USE_YN <=", value, "useYn");
            return (Criteria) this;
        }

        public Criteria andUseYnLike(String value) {
            addCriterion("TIP.USE_YN like", value, "useYn");
            return (Criteria) this;
        }

        public Criteria andUseYnNotLike(String value) {
            addCriterion("TIP.USE_YN not like", value, "useYn");
            return (Criteria) this;
        }

        public Criteria andUseYnIn(List<String> values) {
            addCriterion("TIP.USE_YN in", values, "useYn");
            return (Criteria) this;
        }

        public Criteria andUseYnNotIn(List<String> values) {
            addCriterion("TIP.USE_YN not in", values, "useYn");
            return (Criteria) this;
        }

        public Criteria andUseYnBetween(String value1, String value2) {
            addCriterion("TIP.USE_YN between", value1, value2, "useYn");
            return (Criteria) this;
        }

        public Criteria andUseYnNotBetween(String value1, String value2) {
            addCriterion("TIP.USE_YN not between", value1, value2, "useYn");
            return (Criteria) this;
        }

        public Criteria andItemPrcTpCdLikeInsensitive(String value) {
            addCriterion("upper(TIP.ITEM_PRC_TP_CD) like", value.toUpperCase(), "itemPrcTpCd");
            return (Criteria) this;
        }

        public Criteria andAplyYnLikeInsensitive(String value) {
            addCriterion("upper(TIP.APLY_YN) like", value.toUpperCase(), "aplyYn");
            return (Criteria) this;
        }

        public Criteria andRegIdLikeInsensitive(String value) {
            addCriterion("upper(TIP.REG_ID) like", value.toUpperCase(), "regId");
            return (Criteria) this;
        }

        public Criteria andModIdLikeInsensitive(String value) {
            addCriterion("upper(TIP.MOD_ID) like", value.toUpperCase(), "modId");
            return (Criteria) this;
        }

        public Criteria andUseYnLikeInsensitive(String value) {
            addCriterion("upper(TIP.USE_YN) like", value.toUpperCase(), "useYn");
            return (Criteria) this;
        }

        public Criteria andItemPrcTpCdLikeLeft(String value) {
            addCriterion("TIP.ITEM_PRC_TP_CD like ", "%" + value, "itemPrcTpCd");
            return (Criteria) this;
        }

        public Criteria andItemPrcTpCdLikeRight(String value) {
            addCriterion("TIP.ITEM_PRC_TP_CD like ", value + "%", "itemPrcTpCd");
            return (Criteria) this;
        }

        public Criteria andItemPrcTpCdLikeBoth(String value) {
            addCriterion("TIP.ITEM_PRC_TP_CD like ", "%" + value + "%", "itemPrcTpCd");
            return (Criteria) this;
        }

        public Criteria andAplyYnLikeLeft(String value) {
            addCriterion("TIP.APLY_YN like ", "%" + value, "aplyYn");
            return (Criteria) this;
        }

        public Criteria andAplyYnLikeRight(String value) {
            addCriterion("TIP.APLY_YN like ", value + "%", "aplyYn");
            return (Criteria) this;
        }

        public Criteria andAplyYnLikeBoth(String value) {
            addCriterion("TIP.APLY_YN like ", "%" + value + "%", "aplyYn");
            return (Criteria) this;
        }

        public Criteria andRegIdLikeLeft(String value) {
            addCriterion("TIP.REG_ID like ", "%" + value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdLikeRight(String value) {
            addCriterion("TIP.REG_ID like ", value + "%", "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdLikeBoth(String value) {
            addCriterion("TIP.REG_ID like ", "%" + value + "%", "regId");
            return (Criteria) this;
        }

        public Criteria andModIdLikeLeft(String value) {
            addCriterion("TIP.MOD_ID like ", "%" + value, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdLikeRight(String value) {
            addCriterion("TIP.MOD_ID like ", value + "%", "modId");
            return (Criteria) this;
        }

        public Criteria andModIdLikeBoth(String value) {
            addCriterion("TIP.MOD_ID like ", "%" + value + "%", "modId");
            return (Criteria) this;
        }

        public Criteria andUseYnLikeLeft(String value) {
            addCriterion("TIP.USE_YN like ", "%" + value, "useYn");
            return (Criteria) this;
        }

        public Criteria andUseYnLikeRight(String value) {
            addCriterion("TIP.USE_YN like ", value + "%", "useYn");
            return (Criteria) this;
        }

        public Criteria andUseYnLikeBoth(String value) {
            addCriterion("TIP.USE_YN like ", "%" + value + "%", "useYn");
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