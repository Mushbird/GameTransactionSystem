package com.mushbird.sinsege.base.module.cart.model.entity.criteria;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CartEntityCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    public CartEntityCriteria() {
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

        public Criteria andCartIdIsNull() {
            addCriterion("TCRT.CART_ID is null");
            return (Criteria) this;
        }

        public Criteria andCartIdIsNotNull() {
            addCriterion("TCRT.CART_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCartIdEqualTo(Integer value) {
            addCriterion("TCRT.CART_ID =", value, "cartId");
            return (Criteria) this;
        }

        public Criteria andCartIdNotEqualTo(Integer value) {
            addCriterion("TCRT.CART_ID <>", value, "cartId");
            return (Criteria) this;
        }

        public Criteria andCartIdGreaterThan(Integer value) {
            addCriterion("TCRT.CART_ID >", value, "cartId");
            return (Criteria) this;
        }

        public Criteria andCartIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("TCRT.CART_ID >=", value, "cartId");
            return (Criteria) this;
        }

        public Criteria andCartIdLessThan(Integer value) {
            addCriterion("TCRT.CART_ID <", value, "cartId");
            return (Criteria) this;
        }

        public Criteria andCartIdLessThanOrEqualTo(Integer value) {
            addCriterion("TCRT.CART_ID <=", value, "cartId");
            return (Criteria) this;
        }

        public Criteria andCartIdIn(List<Integer> values) {
            addCriterion("TCRT.CART_ID in", values, "cartId");
            return (Criteria) this;
        }

        public Criteria andCartIdNotIn(List<Integer> values) {
            addCriterion("TCRT.CART_ID not in", values, "cartId");
            return (Criteria) this;
        }

        public Criteria andCartIdBetween(Integer value1, Integer value2) {
            addCriterion("TCRT.CART_ID between", value1, value2, "cartId");
            return (Criteria) this;
        }

        public Criteria andCartIdNotBetween(Integer value1, Integer value2) {
            addCriterion("TCRT.CART_ID not between", value1, value2, "cartId");
            return (Criteria) this;
        }

        public Criteria andCartTpCdIsNull() {
            addCriterion("TCRT.CART_TP_CD is null");
            return (Criteria) this;
        }

        public Criteria andCartTpCdIsNotNull() {
            addCriterion("TCRT.CART_TP_CD is not null");
            return (Criteria) this;
        }

        public Criteria andCartTpCdEqualTo(String value) {
            addCriterion("TCRT.CART_TP_CD =", value, "cartTpCd");
            return (Criteria) this;
        }

        public Criteria andCartTpCdNotEqualTo(String value) {
            addCriterion("TCRT.CART_TP_CD <>", value, "cartTpCd");
            return (Criteria) this;
        }

        public Criteria andCartTpCdGreaterThan(String value) {
            addCriterion("TCRT.CART_TP_CD >", value, "cartTpCd");
            return (Criteria) this;
        }

        public Criteria andCartTpCdGreaterThanOrEqualTo(String value) {
            addCriterion("TCRT.CART_TP_CD >=", value, "cartTpCd");
            return (Criteria) this;
        }

        public Criteria andCartTpCdLessThan(String value) {
            addCriterion("TCRT.CART_TP_CD <", value, "cartTpCd");
            return (Criteria) this;
        }

        public Criteria andCartTpCdLessThanOrEqualTo(String value) {
            addCriterion("TCRT.CART_TP_CD <=", value, "cartTpCd");
            return (Criteria) this;
        }

        public Criteria andCartTpCdLike(String value) {
            addCriterion("TCRT.CART_TP_CD like", value, "cartTpCd");
            return (Criteria) this;
        }

        public Criteria andCartTpCdNotLike(String value) {
            addCriterion("TCRT.CART_TP_CD not like", value, "cartTpCd");
            return (Criteria) this;
        }

        public Criteria andCartTpCdIn(List<String> values) {
            addCriterion("TCRT.CART_TP_CD in", values, "cartTpCd");
            return (Criteria) this;
        }

        public Criteria andCartTpCdNotIn(List<String> values) {
            addCriterion("TCRT.CART_TP_CD not in", values, "cartTpCd");
            return (Criteria) this;
        }

        public Criteria andCartTpCdBetween(String value1, String value2) {
            addCriterion("TCRT.CART_TP_CD between", value1, value2, "cartTpCd");
            return (Criteria) this;
        }

        public Criteria andCartTpCdNotBetween(String value1, String value2) {
            addCriterion("TCRT.CART_TP_CD not between", value1, value2, "cartTpCd");
            return (Criteria) this;
        }

        public Criteria andDpChIdIsNull() {
            addCriterion("TCRT.DP_CH_ID is null");
            return (Criteria) this;
        }

        public Criteria andDpChIdIsNotNull() {
            addCriterion("TCRT.DP_CH_ID is not null");
            return (Criteria) this;
        }

        public Criteria andDpChIdEqualTo(Integer value) {
            addCriterion("TCRT.DP_CH_ID =", value, "dpChId");
            return (Criteria) this;
        }

        public Criteria andDpChIdNotEqualTo(Integer value) {
            addCriterion("TCRT.DP_CH_ID <>", value, "dpChId");
            return (Criteria) this;
        }

        public Criteria andDpChIdGreaterThan(Integer value) {
            addCriterion("TCRT.DP_CH_ID >", value, "dpChId");
            return (Criteria) this;
        }

        public Criteria andDpChIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("TCRT.DP_CH_ID >=", value, "dpChId");
            return (Criteria) this;
        }

        public Criteria andDpChIdLessThan(Integer value) {
            addCriterion("TCRT.DP_CH_ID <", value, "dpChId");
            return (Criteria) this;
        }

        public Criteria andDpChIdLessThanOrEqualTo(Integer value) {
            addCriterion("TCRT.DP_CH_ID <=", value, "dpChId");
            return (Criteria) this;
        }

        public Criteria andDpChIdIn(List<Integer> values) {
            addCriterion("TCRT.DP_CH_ID in", values, "dpChId");
            return (Criteria) this;
        }

        public Criteria andDpChIdNotIn(List<Integer> values) {
            addCriterion("TCRT.DP_CH_ID not in", values, "dpChId");
            return (Criteria) this;
        }

        public Criteria andDpChIdBetween(Integer value1, Integer value2) {
            addCriterion("TCRT.DP_CH_ID between", value1, value2, "dpChId");
            return (Criteria) this;
        }

        public Criteria andDpChIdNotBetween(Integer value1, Integer value2) {
            addCriterion("TCRT.DP_CH_ID not between", value1, value2, "dpChId");
            return (Criteria) this;
        }

        public Criteria andItemIdIsNull() {
            addCriterion("TCRT.ITEM_ID is null");
            return (Criteria) this;
        }

        public Criteria andItemIdIsNotNull() {
            addCriterion("TCRT.ITEM_ID is not null");
            return (Criteria) this;
        }

        public Criteria andItemIdEqualTo(Integer value) {
            addCriterion("TCRT.ITEM_ID =", value, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdNotEqualTo(Integer value) {
            addCriterion("TCRT.ITEM_ID <>", value, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdGreaterThan(Integer value) {
            addCriterion("TCRT.ITEM_ID >", value, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("TCRT.ITEM_ID >=", value, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdLessThan(Integer value) {
            addCriterion("TCRT.ITEM_ID <", value, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdLessThanOrEqualTo(Integer value) {
            addCriterion("TCRT.ITEM_ID <=", value, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdIn(List<Integer> values) {
            addCriterion("TCRT.ITEM_ID in", values, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdNotIn(List<Integer> values) {
            addCriterion("TCRT.ITEM_ID not in", values, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdBetween(Integer value1, Integer value2) {
            addCriterion("TCRT.ITEM_ID between", value1, value2, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdNotBetween(Integer value1, Integer value2) {
            addCriterion("TCRT.ITEM_ID not between", value1, value2, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemOptIdIsNull() {
            addCriterion("TCRT.ITEM_OPT_ID is null");
            return (Criteria) this;
        }

        public Criteria andItemOptIdIsNotNull() {
            addCriterion("TCRT.ITEM_OPT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andItemOptIdEqualTo(Integer value) {
            addCriterion("TCRT.ITEM_OPT_ID =", value, "itemOptId");
            return (Criteria) this;
        }

        public Criteria andItemOptIdNotEqualTo(Integer value) {
            addCriterion("TCRT.ITEM_OPT_ID <>", value, "itemOptId");
            return (Criteria) this;
        }

        public Criteria andItemOptIdGreaterThan(Integer value) {
            addCriterion("TCRT.ITEM_OPT_ID >", value, "itemOptId");
            return (Criteria) this;
        }

        public Criteria andItemOptIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("TCRT.ITEM_OPT_ID >=", value, "itemOptId");
            return (Criteria) this;
        }

        public Criteria andItemOptIdLessThan(Integer value) {
            addCriterion("TCRT.ITEM_OPT_ID <", value, "itemOptId");
            return (Criteria) this;
        }

        public Criteria andItemOptIdLessThanOrEqualTo(Integer value) {
            addCriterion("TCRT.ITEM_OPT_ID <=", value, "itemOptId");
            return (Criteria) this;
        }

        public Criteria andItemOptIdIn(List<Integer> values) {
            addCriterion("TCRT.ITEM_OPT_ID in", values, "itemOptId");
            return (Criteria) this;
        }

        public Criteria andItemOptIdNotIn(List<Integer> values) {
            addCriterion("TCRT.ITEM_OPT_ID not in", values, "itemOptId");
            return (Criteria) this;
        }

        public Criteria andItemOptIdBetween(Integer value1, Integer value2) {
            addCriterion("TCRT.ITEM_OPT_ID between", value1, value2, "itemOptId");
            return (Criteria) this;
        }

        public Criteria andItemOptIdNotBetween(Integer value1, Integer value2) {
            addCriterion("TCRT.ITEM_OPT_ID not between", value1, value2, "itemOptId");
            return (Criteria) this;
        }

        public Criteria andItemQtyIsNull() {
            addCriterion("TCRT.ITEM_QTY is null");
            return (Criteria) this;
        }

        public Criteria andItemQtyIsNotNull() {
            addCriterion("TCRT.ITEM_QTY is not null");
            return (Criteria) this;
        }

        public Criteria andItemQtyEqualTo(Integer value) {
            addCriterion("TCRT.ITEM_QTY =", value, "itemQty");
            return (Criteria) this;
        }

        public Criteria andItemQtyNotEqualTo(Integer value) {
            addCriterion("TCRT.ITEM_QTY <>", value, "itemQty");
            return (Criteria) this;
        }

        public Criteria andItemQtyGreaterThan(Integer value) {
            addCriterion("TCRT.ITEM_QTY >", value, "itemQty");
            return (Criteria) this;
        }

        public Criteria andItemQtyGreaterThanOrEqualTo(Integer value) {
            addCriterion("TCRT.ITEM_QTY >=", value, "itemQty");
            return (Criteria) this;
        }

        public Criteria andItemQtyLessThan(Integer value) {
            addCriterion("TCRT.ITEM_QTY <", value, "itemQty");
            return (Criteria) this;
        }

        public Criteria andItemQtyLessThanOrEqualTo(Integer value) {
            addCriterion("TCRT.ITEM_QTY <=", value, "itemQty");
            return (Criteria) this;
        }

        public Criteria andItemQtyIn(List<Integer> values) {
            addCriterion("TCRT.ITEM_QTY in", values, "itemQty");
            return (Criteria) this;
        }

        public Criteria andItemQtyNotIn(List<Integer> values) {
            addCriterion("TCRT.ITEM_QTY not in", values, "itemQty");
            return (Criteria) this;
        }

        public Criteria andItemQtyBetween(Integer value1, Integer value2) {
            addCriterion("TCRT.ITEM_QTY between", value1, value2, "itemQty");
            return (Criteria) this;
        }

        public Criteria andItemQtyNotBetween(Integer value1, Integer value2) {
            addCriterion("TCRT.ITEM_QTY not between", value1, value2, "itemQty");
            return (Criteria) this;
        }

        public Criteria andMbrIdIsNull() {
            addCriterion("TCRT.MBR_ID is null");
            return (Criteria) this;
        }

        public Criteria andMbrIdIsNotNull() {
            addCriterion("TCRT.MBR_ID is not null");
            return (Criteria) this;
        }

        public Criteria andMbrIdEqualTo(String value) {
            addCriterion("TCRT.MBR_ID =", value, "mbrId");
            return (Criteria) this;
        }

        public Criteria andMbrIdNotEqualTo(String value) {
            addCriterion("TCRT.MBR_ID <>", value, "mbrId");
            return (Criteria) this;
        }

        public Criteria andMbrIdGreaterThan(String value) {
            addCriterion("TCRT.MBR_ID >", value, "mbrId");
            return (Criteria) this;
        }

        public Criteria andMbrIdGreaterThanOrEqualTo(String value) {
            addCriterion("TCRT.MBR_ID >=", value, "mbrId");
            return (Criteria) this;
        }

        public Criteria andMbrIdLessThan(String value) {
            addCriterion("TCRT.MBR_ID <", value, "mbrId");
            return (Criteria) this;
        }

        public Criteria andMbrIdLessThanOrEqualTo(String value) {
            addCriterion("TCRT.MBR_ID <=", value, "mbrId");
            return (Criteria) this;
        }

        public Criteria andMbrIdLike(String value) {
            addCriterion("TCRT.MBR_ID like", value, "mbrId");
            return (Criteria) this;
        }

        public Criteria andMbrIdNotLike(String value) {
            addCriterion("TCRT.MBR_ID not like", value, "mbrId");
            return (Criteria) this;
        }

        public Criteria andMbrIdIn(List<String> values) {
            addCriterion("TCRT.MBR_ID in", values, "mbrId");
            return (Criteria) this;
        }

        public Criteria andMbrIdNotIn(List<String> values) {
            addCriterion("TCRT.MBR_ID not in", values, "mbrId");
            return (Criteria) this;
        }

        public Criteria andMbrIdBetween(String value1, String value2) {
            addCriterion("TCRT.MBR_ID between", value1, value2, "mbrId");
            return (Criteria) this;
        }

        public Criteria andMbrIdNotBetween(String value1, String value2) {
            addCriterion("TCRT.MBR_ID not between", value1, value2, "mbrId");
            return (Criteria) this;
        }

        public Criteria andRegDtIsNull() {
            addCriterion("TCRT.REG_DT is null");
            return (Criteria) this;
        }

        public Criteria andRegDtIsNotNull() {
            addCriterion("TCRT.REG_DT is not null");
            return (Criteria) this;
        }

        public Criteria andRegDtEqualTo(Date value) {
            addCriterion("TCRT.REG_DT =", value, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtNotEqualTo(Date value) {
            addCriterion("TCRT.REG_DT <>", value, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtGreaterThan(Date value) {
            addCriterion("TCRT.REG_DT >", value, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtGreaterThanOrEqualTo(Date value) {
            addCriterion("TCRT.REG_DT >=", value, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtLessThan(Date value) {
            addCriterion("TCRT.REG_DT <", value, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtLessThanOrEqualTo(Date value) {
            addCriterion("TCRT.REG_DT <=", value, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtIn(List<Date> values) {
            addCriterion("TCRT.REG_DT in", values, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtNotIn(List<Date> values) {
            addCriterion("TCRT.REG_DT not in", values, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtBetween(Date value1, Date value2) {
            addCriterion("TCRT.REG_DT between", value1, value2, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtNotBetween(Date value1, Date value2) {
            addCriterion("TCRT.REG_DT not between", value1, value2, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegIdIsNull() {
            addCriterion("TCRT.REG_ID is null");
            return (Criteria) this;
        }

        public Criteria andRegIdIsNotNull() {
            addCriterion("TCRT.REG_ID is not null");
            return (Criteria) this;
        }

        public Criteria andRegIdEqualTo(String value) {
            addCriterion("TCRT.REG_ID =", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdNotEqualTo(String value) {
            addCriterion("TCRT.REG_ID <>", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdGreaterThan(String value) {
            addCriterion("TCRT.REG_ID >", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdGreaterThanOrEqualTo(String value) {
            addCriterion("TCRT.REG_ID >=", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdLessThan(String value) {
            addCriterion("TCRT.REG_ID <", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdLessThanOrEqualTo(String value) {
            addCriterion("TCRT.REG_ID <=", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdLike(String value) {
            addCriterion("TCRT.REG_ID like", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdNotLike(String value) {
            addCriterion("TCRT.REG_ID not like", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdIn(List<String> values) {
            addCriterion("TCRT.REG_ID in", values, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdNotIn(List<String> values) {
            addCriterion("TCRT.REG_ID not in", values, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdBetween(String value1, String value2) {
            addCriterion("TCRT.REG_ID between", value1, value2, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdNotBetween(String value1, String value2) {
            addCriterion("TCRT.REG_ID not between", value1, value2, "regId");
            return (Criteria) this;
        }

        public Criteria andModDtIsNull() {
            addCriterion("TCRT.MOD_DT is null");
            return (Criteria) this;
        }

        public Criteria andModDtIsNotNull() {
            addCriterion("TCRT.MOD_DT is not null");
            return (Criteria) this;
        }

        public Criteria andModDtEqualTo(Date value) {
            addCriterion("TCRT.MOD_DT =", value, "modDt");
            return (Criteria) this;
        }

        public Criteria andModDtNotEqualTo(Date value) {
            addCriterion("TCRT.MOD_DT <>", value, "modDt");
            return (Criteria) this;
        }

        public Criteria andModDtGreaterThan(Date value) {
            addCriterion("TCRT.MOD_DT >", value, "modDt");
            return (Criteria) this;
        }

        public Criteria andModDtGreaterThanOrEqualTo(Date value) {
            addCriterion("TCRT.MOD_DT >=", value, "modDt");
            return (Criteria) this;
        }

        public Criteria andModDtLessThan(Date value) {
            addCriterion("TCRT.MOD_DT <", value, "modDt");
            return (Criteria) this;
        }

        public Criteria andModDtLessThanOrEqualTo(Date value) {
            addCriterion("TCRT.MOD_DT <=", value, "modDt");
            return (Criteria) this;
        }

        public Criteria andModDtIn(List<Date> values) {
            addCriterion("TCRT.MOD_DT in", values, "modDt");
            return (Criteria) this;
        }

        public Criteria andModDtNotIn(List<Date> values) {
            addCriterion("TCRT.MOD_DT not in", values, "modDt");
            return (Criteria) this;
        }

        public Criteria andModDtBetween(Date value1, Date value2) {
            addCriterion("TCRT.MOD_DT between", value1, value2, "modDt");
            return (Criteria) this;
        }

        public Criteria andModDtNotBetween(Date value1, Date value2) {
            addCriterion("TCRT.MOD_DT not between", value1, value2, "modDt");
            return (Criteria) this;
        }

        public Criteria andModIdIsNull() {
            addCriterion("TCRT.MOD_ID is null");
            return (Criteria) this;
        }

        public Criteria andModIdIsNotNull() {
            addCriterion("TCRT.MOD_ID is not null");
            return (Criteria) this;
        }

        public Criteria andModIdEqualTo(String value) {
            addCriterion("TCRT.MOD_ID =", value, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdNotEqualTo(String value) {
            addCriterion("TCRT.MOD_ID <>", value, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdGreaterThan(String value) {
            addCriterion("TCRT.MOD_ID >", value, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdGreaterThanOrEqualTo(String value) {
            addCriterion("TCRT.MOD_ID >=", value, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdLessThan(String value) {
            addCriterion("TCRT.MOD_ID <", value, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdLessThanOrEqualTo(String value) {
            addCriterion("TCRT.MOD_ID <=", value, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdLike(String value) {
            addCriterion("TCRT.MOD_ID like", value, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdNotLike(String value) {
            addCriterion("TCRT.MOD_ID not like", value, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdIn(List<String> values) {
            addCriterion("TCRT.MOD_ID in", values, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdNotIn(List<String> values) {
            addCriterion("TCRT.MOD_ID not in", values, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdBetween(String value1, String value2) {
            addCriterion("TCRT.MOD_ID between", value1, value2, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdNotBetween(String value1, String value2) {
            addCriterion("TCRT.MOD_ID not between", value1, value2, "modId");
            return (Criteria) this;
        }

        public Criteria andCartTpCdLikeInsensitive(String value) {
            addCriterion("upper(TCRT.CART_TP_CD) like", value.toUpperCase(), "cartTpCd");
            return (Criteria) this;
        }

        public Criteria andMbrIdLikeInsensitive(String value) {
            addCriterion("upper(TCRT.MBR_ID) like", value.toUpperCase(), "mbrId");
            return (Criteria) this;
        }

        public Criteria andRegIdLikeInsensitive(String value) {
            addCriterion("upper(TCRT.REG_ID) like", value.toUpperCase(), "regId");
            return (Criteria) this;
        }

        public Criteria andModIdLikeInsensitive(String value) {
            addCriterion("upper(TCRT.MOD_ID) like", value.toUpperCase(), "modId");
            return (Criteria) this;
        }

        public Criteria andCartTpCdLikeLeft(String value) {
            addCriterion("TCRT.CART_TP_CD like ", "%" + value, "cartTpCd");
            return (Criteria) this;
        }

        public Criteria andCartTpCdLikeRight(String value) {
            addCriterion("TCRT.CART_TP_CD like ", value + "%", "cartTpCd");
            return (Criteria) this;
        }

        public Criteria andCartTpCdLikeBoth(String value) {
            addCriterion("TCRT.CART_TP_CD like ", "%" + value + "%", "cartTpCd");
            return (Criteria) this;
        }

        public Criteria andMbrIdLikeLeft(String value) {
            addCriterion("TCRT.MBR_ID like ", "%" + value, "mbrId");
            return (Criteria) this;
        }

        public Criteria andMbrIdLikeRight(String value) {
            addCriterion("TCRT.MBR_ID like ", value + "%", "mbrId");
            return (Criteria) this;
        }

        public Criteria andMbrIdLikeBoth(String value) {
            addCriterion("TCRT.MBR_ID like ", "%" + value + "%", "mbrId");
            return (Criteria) this;
        }

        public Criteria andRegIdLikeLeft(String value) {
            addCriterion("TCRT.REG_ID like ", "%" + value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdLikeRight(String value) {
            addCriterion("TCRT.REG_ID like ", value + "%", "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdLikeBoth(String value) {
            addCriterion("TCRT.REG_ID like ", "%" + value + "%", "regId");
            return (Criteria) this;
        }

        public Criteria andModIdLikeLeft(String value) {
            addCriterion("TCRT.MOD_ID like ", "%" + value, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdLikeRight(String value) {
            addCriterion("TCRT.MOD_ID like ", value + "%", "modId");
            return (Criteria) this;
        }

        public Criteria andModIdLikeBoth(String value) {
            addCriterion("TCRT.MOD_ID like ", "%" + value + "%", "modId");
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