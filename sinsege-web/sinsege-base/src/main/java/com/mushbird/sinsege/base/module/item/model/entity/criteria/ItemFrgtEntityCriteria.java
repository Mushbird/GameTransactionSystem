package com.mushbird.sinsege.base.module.item.model.entity.criteria;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ItemFrgtEntityCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    public ItemFrgtEntityCriteria() {
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

        public Criteria andItemFrgtIdIsNull() {
            addCriterion("TIF.ITEM_FRGT_ID is null");
            return (Criteria) this;
        }

        public Criteria andItemFrgtIdIsNotNull() {
            addCriterion("TIF.ITEM_FRGT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andItemFrgtIdEqualTo(Integer value) {
            addCriterion("TIF.ITEM_FRGT_ID =", value, "itemFrgtId");
            return (Criteria) this;
        }

        public Criteria andItemFrgtIdNotEqualTo(Integer value) {
            addCriterion("TIF.ITEM_FRGT_ID <>", value, "itemFrgtId");
            return (Criteria) this;
        }

        public Criteria andItemFrgtIdGreaterThan(Integer value) {
            addCriterion("TIF.ITEM_FRGT_ID >", value, "itemFrgtId");
            return (Criteria) this;
        }

        public Criteria andItemFrgtIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("TIF.ITEM_FRGT_ID >=", value, "itemFrgtId");
            return (Criteria) this;
        }

        public Criteria andItemFrgtIdLessThan(Integer value) {
            addCriterion("TIF.ITEM_FRGT_ID <", value, "itemFrgtId");
            return (Criteria) this;
        }

        public Criteria andItemFrgtIdLessThanOrEqualTo(Integer value) {
            addCriterion("TIF.ITEM_FRGT_ID <=", value, "itemFrgtId");
            return (Criteria) this;
        }

        public Criteria andItemFrgtIdIn(List<Integer> values) {
            addCriterion("TIF.ITEM_FRGT_ID in", values, "itemFrgtId");
            return (Criteria) this;
        }

        public Criteria andItemFrgtIdNotIn(List<Integer> values) {
            addCriterion("TIF.ITEM_FRGT_ID not in", values, "itemFrgtId");
            return (Criteria) this;
        }

        public Criteria andItemFrgtIdBetween(Integer value1, Integer value2) {
            addCriterion("TIF.ITEM_FRGT_ID between", value1, value2, "itemFrgtId");
            return (Criteria) this;
        }

        public Criteria andItemFrgtIdNotBetween(Integer value1, Integer value2) {
            addCriterion("TIF.ITEM_FRGT_ID not between", value1, value2, "itemFrgtId");
            return (Criteria) this;
        }

        public Criteria andVenIdIsNull() {
            addCriterion("TIF.VEN_ID is null");
            return (Criteria) this;
        }

        public Criteria andVenIdIsNotNull() {
            addCriterion("TIF.VEN_ID is not null");
            return (Criteria) this;
        }

        public Criteria andVenIdEqualTo(Integer value) {
            addCriterion("TIF.VEN_ID =", value, "venId");
            return (Criteria) this;
        }

        public Criteria andVenIdNotEqualTo(Integer value) {
            addCriterion("TIF.VEN_ID <>", value, "venId");
            return (Criteria) this;
        }

        public Criteria andVenIdGreaterThan(Integer value) {
            addCriterion("TIF.VEN_ID >", value, "venId");
            return (Criteria) this;
        }

        public Criteria andVenIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("TIF.VEN_ID >=", value, "venId");
            return (Criteria) this;
        }

        public Criteria andVenIdLessThan(Integer value) {
            addCriterion("TIF.VEN_ID <", value, "venId");
            return (Criteria) this;
        }

        public Criteria andVenIdLessThanOrEqualTo(Integer value) {
            addCriterion("TIF.VEN_ID <=", value, "venId");
            return (Criteria) this;
        }

        public Criteria andVenIdIn(List<Integer> values) {
            addCriterion("TIF.VEN_ID in", values, "venId");
            return (Criteria) this;
        }

        public Criteria andVenIdNotIn(List<Integer> values) {
            addCriterion("TIF.VEN_ID not in", values, "venId");
            return (Criteria) this;
        }

        public Criteria andVenIdBetween(Integer value1, Integer value2) {
            addCriterion("TIF.VEN_ID between", value1, value2, "venId");
            return (Criteria) this;
        }

        public Criteria andVenIdNotBetween(Integer value1, Integer value2) {
            addCriterion("TIF.VEN_ID not between", value1, value2, "venId");
            return (Criteria) this;
        }

        public Criteria andFrgtTpCdIsNull() {
            addCriterion("TIF.FRGT_TP_CD is null");
            return (Criteria) this;
        }

        public Criteria andFrgtTpCdIsNotNull() {
            addCriterion("TIF.FRGT_TP_CD is not null");
            return (Criteria) this;
        }

        public Criteria andFrgtTpCdEqualTo(String value) {
            addCriterion("TIF.FRGT_TP_CD =", value, "frgtTpCd");
            return (Criteria) this;
        }

        public Criteria andFrgtTpCdNotEqualTo(String value) {
            addCriterion("TIF.FRGT_TP_CD <>", value, "frgtTpCd");
            return (Criteria) this;
        }

        public Criteria andFrgtTpCdGreaterThan(String value) {
            addCriterion("TIF.FRGT_TP_CD >", value, "frgtTpCd");
            return (Criteria) this;
        }

        public Criteria andFrgtTpCdGreaterThanOrEqualTo(String value) {
            addCriterion("TIF.FRGT_TP_CD >=", value, "frgtTpCd");
            return (Criteria) this;
        }

        public Criteria andFrgtTpCdLessThan(String value) {
            addCriterion("TIF.FRGT_TP_CD <", value, "frgtTpCd");
            return (Criteria) this;
        }

        public Criteria andFrgtTpCdLessThanOrEqualTo(String value) {
            addCriterion("TIF.FRGT_TP_CD <=", value, "frgtTpCd");
            return (Criteria) this;
        }

        public Criteria andFrgtTpCdLike(String value) {
            addCriterion("TIF.FRGT_TP_CD like", value, "frgtTpCd");
            return (Criteria) this;
        }

        public Criteria andFrgtTpCdNotLike(String value) {
            addCriterion("TIF.FRGT_TP_CD not like", value, "frgtTpCd");
            return (Criteria) this;
        }

        public Criteria andFrgtTpCdIn(List<String> values) {
            addCriterion("TIF.FRGT_TP_CD in", values, "frgtTpCd");
            return (Criteria) this;
        }

        public Criteria andFrgtTpCdNotIn(List<String> values) {
            addCriterion("TIF.FRGT_TP_CD not in", values, "frgtTpCd");
            return (Criteria) this;
        }

        public Criteria andFrgtTpCdBetween(String value1, String value2) {
            addCriterion("TIF.FRGT_TP_CD between", value1, value2, "frgtTpCd");
            return (Criteria) this;
        }

        public Criteria andFrgtTpCdNotBetween(String value1, String value2) {
            addCriterion("TIF.FRGT_TP_CD not between", value1, value2, "frgtTpCd");
            return (Criteria) this;
        }

        public Criteria andItemNmIsNull() {
            addCriterion("TIF.ITEM_NM is null");
            return (Criteria) this;
        }

        public Criteria andItemNmIsNotNull() {
            addCriterion("TIF.ITEM_NM is not null");
            return (Criteria) this;
        }

        public Criteria andItemNmEqualTo(String value) {
            addCriterion("TIF.ITEM_NM =", value, "itemNm");
            return (Criteria) this;
        }

        public Criteria andItemNmNotEqualTo(String value) {
            addCriterion("TIF.ITEM_NM <>", value, "itemNm");
            return (Criteria) this;
        }

        public Criteria andItemNmGreaterThan(String value) {
            addCriterion("TIF.ITEM_NM >", value, "itemNm");
            return (Criteria) this;
        }

        public Criteria andItemNmGreaterThanOrEqualTo(String value) {
            addCriterion("TIF.ITEM_NM >=", value, "itemNm");
            return (Criteria) this;
        }

        public Criteria andItemNmLessThan(String value) {
            addCriterion("TIF.ITEM_NM <", value, "itemNm");
            return (Criteria) this;
        }

        public Criteria andItemNmLessThanOrEqualTo(String value) {
            addCriterion("TIF.ITEM_NM <=", value, "itemNm");
            return (Criteria) this;
        }

        public Criteria andItemNmLike(String value) {
            addCriterion("TIF.ITEM_NM like", value, "itemNm");
            return (Criteria) this;
        }

        public Criteria andItemNmNotLike(String value) {
            addCriterion("TIF.ITEM_NM not like", value, "itemNm");
            return (Criteria) this;
        }

        public Criteria andItemNmIn(List<String> values) {
            addCriterion("TIF.ITEM_NM in", values, "itemNm");
            return (Criteria) this;
        }

        public Criteria andItemNmNotIn(List<String> values) {
            addCriterion("TIF.ITEM_NM not in", values, "itemNm");
            return (Criteria) this;
        }

        public Criteria andItemNmBetween(String value1, String value2) {
            addCriterion("TIF.ITEM_NM between", value1, value2, "itemNm");
            return (Criteria) this;
        }

        public Criteria andItemNmNotBetween(String value1, String value2) {
            addCriterion("TIF.ITEM_NM not between", value1, value2, "itemNm");
            return (Criteria) this;
        }

        public Criteria andStkQtyIsNull() {
            addCriterion("TIF.STK_QTY is null");
            return (Criteria) this;
        }

        public Criteria andStkQtyIsNotNull() {
            addCriterion("TIF.STK_QTY is not null");
            return (Criteria) this;
        }

        public Criteria andStkQtyEqualTo(Integer value) {
            addCriterion("TIF.STK_QTY =", value, "stkQty");
            return (Criteria) this;
        }

        public Criteria andStkQtyNotEqualTo(Integer value) {
            addCriterion("TIF.STK_QTY <>", value, "stkQty");
            return (Criteria) this;
        }

        public Criteria andStkQtyGreaterThan(Integer value) {
            addCriterion("TIF.STK_QTY >", value, "stkQty");
            return (Criteria) this;
        }

        public Criteria andStkQtyGreaterThanOrEqualTo(Integer value) {
            addCriterion("TIF.STK_QTY >=", value, "stkQty");
            return (Criteria) this;
        }

        public Criteria andStkQtyLessThan(Integer value) {
            addCriterion("TIF.STK_QTY <", value, "stkQty");
            return (Criteria) this;
        }

        public Criteria andStkQtyLessThanOrEqualTo(Integer value) {
            addCriterion("TIF.STK_QTY <=", value, "stkQty");
            return (Criteria) this;
        }

        public Criteria andStkQtyIn(List<Integer> values) {
            addCriterion("TIF.STK_QTY in", values, "stkQty");
            return (Criteria) this;
        }

        public Criteria andStkQtyNotIn(List<Integer> values) {
            addCriterion("TIF.STK_QTY not in", values, "stkQty");
            return (Criteria) this;
        }

        public Criteria andStkQtyBetween(Integer value1, Integer value2) {
            addCriterion("TIF.STK_QTY between", value1, value2, "stkQty");
            return (Criteria) this;
        }

        public Criteria andStkQtyNotBetween(Integer value1, Integer value2) {
            addCriterion("TIF.STK_QTY not between", value1, value2, "stkQty");
            return (Criteria) this;
        }

        public Criteria andAtchGidIsNull() {
            addCriterion("TIF.ATCH_GID is null");
            return (Criteria) this;
        }

        public Criteria andAtchGidIsNotNull() {
            addCriterion("TIF.ATCH_GID is not null");
            return (Criteria) this;
        }

        public Criteria andAtchGidEqualTo(Integer value) {
            addCriterion("TIF.ATCH_GID =", value, "atchGid");
            return (Criteria) this;
        }

        public Criteria andAtchGidNotEqualTo(Integer value) {
            addCriterion("TIF.ATCH_GID <>", value, "atchGid");
            return (Criteria) this;
        }

        public Criteria andAtchGidGreaterThan(Integer value) {
            addCriterion("TIF.ATCH_GID >", value, "atchGid");
            return (Criteria) this;
        }

        public Criteria andAtchGidGreaterThanOrEqualTo(Integer value) {
            addCriterion("TIF.ATCH_GID >=", value, "atchGid");
            return (Criteria) this;
        }

        public Criteria andAtchGidLessThan(Integer value) {
            addCriterion("TIF.ATCH_GID <", value, "atchGid");
            return (Criteria) this;
        }

        public Criteria andAtchGidLessThanOrEqualTo(Integer value) {
            addCriterion("TIF.ATCH_GID <=", value, "atchGid");
            return (Criteria) this;
        }

        public Criteria andAtchGidIn(List<Integer> values) {
            addCriterion("TIF.ATCH_GID in", values, "atchGid");
            return (Criteria) this;
        }

        public Criteria andAtchGidNotIn(List<Integer> values) {
            addCriterion("TIF.ATCH_GID not in", values, "atchGid");
            return (Criteria) this;
        }

        public Criteria andAtchGidBetween(Integer value1, Integer value2) {
            addCriterion("TIF.ATCH_GID between", value1, value2, "atchGid");
            return (Criteria) this;
        }

        public Criteria andAtchGidNotBetween(Integer value1, Integer value2) {
            addCriterion("TIF.ATCH_GID not between", value1, value2, "atchGid");
            return (Criteria) this;
        }

        public Criteria andRegDtIsNull() {
            addCriterion("TIF.REG_DT is null");
            return (Criteria) this;
        }

        public Criteria andRegDtIsNotNull() {
            addCriterion("TIF.REG_DT is not null");
            return (Criteria) this;
        }

        public Criteria andRegDtEqualTo(Date value) {
            addCriterion("TIF.REG_DT =", value, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtNotEqualTo(Date value) {
            addCriterion("TIF.REG_DT <>", value, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtGreaterThan(Date value) {
            addCriterion("TIF.REG_DT >", value, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtGreaterThanOrEqualTo(Date value) {
            addCriterion("TIF.REG_DT >=", value, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtLessThan(Date value) {
            addCriterion("TIF.REG_DT <", value, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtLessThanOrEqualTo(Date value) {
            addCriterion("TIF.REG_DT <=", value, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtIn(List<Date> values) {
            addCriterion("TIF.REG_DT in", values, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtNotIn(List<Date> values) {
            addCriterion("TIF.REG_DT not in", values, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtBetween(Date value1, Date value2) {
            addCriterion("TIF.REG_DT between", value1, value2, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtNotBetween(Date value1, Date value2) {
            addCriterion("TIF.REG_DT not between", value1, value2, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegIdIsNull() {
            addCriterion("TIF.REG_ID is null");
            return (Criteria) this;
        }

        public Criteria andRegIdIsNotNull() {
            addCriterion("TIF.REG_ID is not null");
            return (Criteria) this;
        }

        public Criteria andRegIdEqualTo(String value) {
            addCriterion("TIF.REG_ID =", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdNotEqualTo(String value) {
            addCriterion("TIF.REG_ID <>", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdGreaterThan(String value) {
            addCriterion("TIF.REG_ID >", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdGreaterThanOrEqualTo(String value) {
            addCriterion("TIF.REG_ID >=", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdLessThan(String value) {
            addCriterion("TIF.REG_ID <", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdLessThanOrEqualTo(String value) {
            addCriterion("TIF.REG_ID <=", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdLike(String value) {
            addCriterion("TIF.REG_ID like", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdNotLike(String value) {
            addCriterion("TIF.REG_ID not like", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdIn(List<String> values) {
            addCriterion("TIF.REG_ID in", values, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdNotIn(List<String> values) {
            addCriterion("TIF.REG_ID not in", values, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdBetween(String value1, String value2) {
            addCriterion("TIF.REG_ID between", value1, value2, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdNotBetween(String value1, String value2) {
            addCriterion("TIF.REG_ID not between", value1, value2, "regId");
            return (Criteria) this;
        }

        public Criteria andModDtIsNull() {
            addCriterion("TIF.MOD_DT is null");
            return (Criteria) this;
        }

        public Criteria andModDtIsNotNull() {
            addCriterion("TIF.MOD_DT is not null");
            return (Criteria) this;
        }

        public Criteria andModDtEqualTo(Date value) {
            addCriterion("TIF.MOD_DT =", value, "modDt");
            return (Criteria) this;
        }

        public Criteria andModDtNotEqualTo(Date value) {
            addCriterion("TIF.MOD_DT <>", value, "modDt");
            return (Criteria) this;
        }

        public Criteria andModDtGreaterThan(Date value) {
            addCriterion("TIF.MOD_DT >", value, "modDt");
            return (Criteria) this;
        }

        public Criteria andModDtGreaterThanOrEqualTo(Date value) {
            addCriterion("TIF.MOD_DT >=", value, "modDt");
            return (Criteria) this;
        }

        public Criteria andModDtLessThan(Date value) {
            addCriterion("TIF.MOD_DT <", value, "modDt");
            return (Criteria) this;
        }

        public Criteria andModDtLessThanOrEqualTo(Date value) {
            addCriterion("TIF.MOD_DT <=", value, "modDt");
            return (Criteria) this;
        }

        public Criteria andModDtIn(List<Date> values) {
            addCriterion("TIF.MOD_DT in", values, "modDt");
            return (Criteria) this;
        }

        public Criteria andModDtNotIn(List<Date> values) {
            addCriterion("TIF.MOD_DT not in", values, "modDt");
            return (Criteria) this;
        }

        public Criteria andModDtBetween(Date value1, Date value2) {
            addCriterion("TIF.MOD_DT between", value1, value2, "modDt");
            return (Criteria) this;
        }

        public Criteria andModDtNotBetween(Date value1, Date value2) {
            addCriterion("TIF.MOD_DT not between", value1, value2, "modDt");
            return (Criteria) this;
        }

        public Criteria andModIdIsNull() {
            addCriterion("TIF.MOD_ID is null");
            return (Criteria) this;
        }

        public Criteria andModIdIsNotNull() {
            addCriterion("TIF.MOD_ID is not null");
            return (Criteria) this;
        }

        public Criteria andModIdEqualTo(String value) {
            addCriterion("TIF.MOD_ID =", value, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdNotEqualTo(String value) {
            addCriterion("TIF.MOD_ID <>", value, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdGreaterThan(String value) {
            addCriterion("TIF.MOD_ID >", value, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdGreaterThanOrEqualTo(String value) {
            addCriterion("TIF.MOD_ID >=", value, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdLessThan(String value) {
            addCriterion("TIF.MOD_ID <", value, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdLessThanOrEqualTo(String value) {
            addCriterion("TIF.MOD_ID <=", value, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdLike(String value) {
            addCriterion("TIF.MOD_ID like", value, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdNotLike(String value) {
            addCriterion("TIF.MOD_ID not like", value, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdIn(List<String> values) {
            addCriterion("TIF.MOD_ID in", values, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdNotIn(List<String> values) {
            addCriterion("TIF.MOD_ID not in", values, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdBetween(String value1, String value2) {
            addCriterion("TIF.MOD_ID between", value1, value2, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdNotBetween(String value1, String value2) {
            addCriterion("TIF.MOD_ID not between", value1, value2, "modId");
            return (Criteria) this;
        }

        public Criteria andUseYnIsNull() {
            addCriterion("TIF.USE_YN is null");
            return (Criteria) this;
        }

        public Criteria andUseYnIsNotNull() {
            addCriterion("TIF.USE_YN is not null");
            return (Criteria) this;
        }

        public Criteria andUseYnEqualTo(String value) {
            addCriterion("TIF.USE_YN =", value, "useYn");
            return (Criteria) this;
        }

        public Criteria andUseYnNotEqualTo(String value) {
            addCriterion("TIF.USE_YN <>", value, "useYn");
            return (Criteria) this;
        }

        public Criteria andUseYnGreaterThan(String value) {
            addCriterion("TIF.USE_YN >", value, "useYn");
            return (Criteria) this;
        }

        public Criteria andUseYnGreaterThanOrEqualTo(String value) {
            addCriterion("TIF.USE_YN >=", value, "useYn");
            return (Criteria) this;
        }

        public Criteria andUseYnLessThan(String value) {
            addCriterion("TIF.USE_YN <", value, "useYn");
            return (Criteria) this;
        }

        public Criteria andUseYnLessThanOrEqualTo(String value) {
            addCriterion("TIF.USE_YN <=", value, "useYn");
            return (Criteria) this;
        }

        public Criteria andUseYnLike(String value) {
            addCriterion("TIF.USE_YN like", value, "useYn");
            return (Criteria) this;
        }

        public Criteria andUseYnNotLike(String value) {
            addCriterion("TIF.USE_YN not like", value, "useYn");
            return (Criteria) this;
        }

        public Criteria andUseYnIn(List<String> values) {
            addCriterion("TIF.USE_YN in", values, "useYn");
            return (Criteria) this;
        }

        public Criteria andUseYnNotIn(List<String> values) {
            addCriterion("TIF.USE_YN not in", values, "useYn");
            return (Criteria) this;
        }

        public Criteria andUseYnBetween(String value1, String value2) {
            addCriterion("TIF.USE_YN between", value1, value2, "useYn");
            return (Criteria) this;
        }

        public Criteria andUseYnNotBetween(String value1, String value2) {
            addCriterion("TIF.USE_YN not between", value1, value2, "useYn");
            return (Criteria) this;
        }

        public Criteria andFrgtTpCdLikeInsensitive(String value) {
            addCriterion("upper(TIF.FRGT_TP_CD) like", value.toUpperCase(), "frgtTpCd");
            return (Criteria) this;
        }

        public Criteria andItemNmLikeInsensitive(String value) {
            addCriterion("upper(TIF.ITEM_NM) like", value.toUpperCase(), "itemNm");
            return (Criteria) this;
        }

        public Criteria andRegIdLikeInsensitive(String value) {
            addCriterion("upper(TIF.REG_ID) like", value.toUpperCase(), "regId");
            return (Criteria) this;
        }

        public Criteria andModIdLikeInsensitive(String value) {
            addCriterion("upper(TIF.MOD_ID) like", value.toUpperCase(), "modId");
            return (Criteria) this;
        }

        public Criteria andUseYnLikeInsensitive(String value) {
            addCriterion("upper(TIF.USE_YN) like", value.toUpperCase(), "useYn");
            return (Criteria) this;
        }

        public Criteria andFrgtTpCdLikeLeft(String value) {
            addCriterion("TIF.FRGT_TP_CD like ", "%" + value, "frgtTpCd");
            return (Criteria) this;
        }

        public Criteria andFrgtTpCdLikeRight(String value) {
            addCriterion("TIF.FRGT_TP_CD like ", value + "%", "frgtTpCd");
            return (Criteria) this;
        }

        public Criteria andFrgtTpCdLikeBoth(String value) {
            addCriterion("TIF.FRGT_TP_CD like ", "%" + value + "%", "frgtTpCd");
            return (Criteria) this;
        }

        public Criteria andItemNmLikeLeft(String value) {
            addCriterion("TIF.ITEM_NM like ", "%" + value, "itemNm");
            return (Criteria) this;
        }

        public Criteria andItemNmLikeRight(String value) {
            addCriterion("TIF.ITEM_NM like ", value + "%", "itemNm");
            return (Criteria) this;
        }

        public Criteria andItemNmLikeBoth(String value) {
            addCriterion("TIF.ITEM_NM like ", "%" + value + "%", "itemNm");
            return (Criteria) this;
        }

        public Criteria andRegIdLikeLeft(String value) {
            addCriterion("TIF.REG_ID like ", "%" + value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdLikeRight(String value) {
            addCriterion("TIF.REG_ID like ", value + "%", "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdLikeBoth(String value) {
            addCriterion("TIF.REG_ID like ", "%" + value + "%", "regId");
            return (Criteria) this;
        }

        public Criteria andModIdLikeLeft(String value) {
            addCriterion("TIF.MOD_ID like ", "%" + value, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdLikeRight(String value) {
            addCriterion("TIF.MOD_ID like ", value + "%", "modId");
            return (Criteria) this;
        }

        public Criteria andModIdLikeBoth(String value) {
            addCriterion("TIF.MOD_ID like ", "%" + value + "%", "modId");
            return (Criteria) this;
        }

        public Criteria andUseYnLikeLeft(String value) {
            addCriterion("TIF.USE_YN like ", "%" + value, "useYn");
            return (Criteria) this;
        }

        public Criteria andUseYnLikeRight(String value) {
            addCriterion("TIF.USE_YN like ", value + "%", "useYn");
            return (Criteria) this;
        }

        public Criteria andUseYnLikeBoth(String value) {
            addCriterion("TIF.USE_YN like ", "%" + value + "%", "useYn");
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