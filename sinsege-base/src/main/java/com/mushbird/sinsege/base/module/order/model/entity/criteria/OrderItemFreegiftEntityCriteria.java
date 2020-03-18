package com.mushbird.sinsege.base.module.order.model.entity.criteria;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OrderItemFreegiftEntityCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    public OrderItemFreegiftEntityCriteria() {
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

        public Criteria andOrdItemFrgtIdIsNull() {
            addCriterion("TOIF.ORD_ITEM_FRGT_ID is null");
            return (Criteria) this;
        }

        public Criteria andOrdItemFrgtIdIsNotNull() {
            addCriterion("TOIF.ORD_ITEM_FRGT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andOrdItemFrgtIdEqualTo(Integer value) {
            addCriterion("TOIF.ORD_ITEM_FRGT_ID =", value, "ordItemFrgtId");
            return (Criteria) this;
        }

        public Criteria andOrdItemFrgtIdNotEqualTo(Integer value) {
            addCriterion("TOIF.ORD_ITEM_FRGT_ID <>", value, "ordItemFrgtId");
            return (Criteria) this;
        }

        public Criteria andOrdItemFrgtIdGreaterThan(Integer value) {
            addCriterion("TOIF.ORD_ITEM_FRGT_ID >", value, "ordItemFrgtId");
            return (Criteria) this;
        }

        public Criteria andOrdItemFrgtIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("TOIF.ORD_ITEM_FRGT_ID >=", value, "ordItemFrgtId");
            return (Criteria) this;
        }

        public Criteria andOrdItemFrgtIdLessThan(Integer value) {
            addCriterion("TOIF.ORD_ITEM_FRGT_ID <", value, "ordItemFrgtId");
            return (Criteria) this;
        }

        public Criteria andOrdItemFrgtIdLessThanOrEqualTo(Integer value) {
            addCriterion("TOIF.ORD_ITEM_FRGT_ID <=", value, "ordItemFrgtId");
            return (Criteria) this;
        }

        public Criteria andOrdItemFrgtIdIn(List<Integer> values) {
            addCriterion("TOIF.ORD_ITEM_FRGT_ID in", values, "ordItemFrgtId");
            return (Criteria) this;
        }

        public Criteria andOrdItemFrgtIdNotIn(List<Integer> values) {
            addCriterion("TOIF.ORD_ITEM_FRGT_ID not in", values, "ordItemFrgtId");
            return (Criteria) this;
        }

        public Criteria andOrdItemFrgtIdBetween(Integer value1, Integer value2) {
            addCriterion("TOIF.ORD_ITEM_FRGT_ID between", value1, value2, "ordItemFrgtId");
            return (Criteria) this;
        }

        public Criteria andOrdItemFrgtIdNotBetween(Integer value1, Integer value2) {
            addCriterion("TOIF.ORD_ITEM_FRGT_ID not between", value1, value2, "ordItemFrgtId");
            return (Criteria) this;
        }

        public Criteria andOrdItemIdIsNull() {
            addCriterion("TOIF.ORD_ITEM_ID is null");
            return (Criteria) this;
        }

        public Criteria andOrdItemIdIsNotNull() {
            addCriterion("TOIF.ORD_ITEM_ID is not null");
            return (Criteria) this;
        }

        public Criteria andOrdItemIdEqualTo(Integer value) {
            addCriterion("TOIF.ORD_ITEM_ID =", value, "ordItemId");
            return (Criteria) this;
        }

        public Criteria andOrdItemIdNotEqualTo(Integer value) {
            addCriterion("TOIF.ORD_ITEM_ID <>", value, "ordItemId");
            return (Criteria) this;
        }

        public Criteria andOrdItemIdGreaterThan(Integer value) {
            addCriterion("TOIF.ORD_ITEM_ID >", value, "ordItemId");
            return (Criteria) this;
        }

        public Criteria andOrdItemIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("TOIF.ORD_ITEM_ID >=", value, "ordItemId");
            return (Criteria) this;
        }

        public Criteria andOrdItemIdLessThan(Integer value) {
            addCriterion("TOIF.ORD_ITEM_ID <", value, "ordItemId");
            return (Criteria) this;
        }

        public Criteria andOrdItemIdLessThanOrEqualTo(Integer value) {
            addCriterion("TOIF.ORD_ITEM_ID <=", value, "ordItemId");
            return (Criteria) this;
        }

        public Criteria andOrdItemIdIn(List<Integer> values) {
            addCriterion("TOIF.ORD_ITEM_ID in", values, "ordItemId");
            return (Criteria) this;
        }

        public Criteria andOrdItemIdNotIn(List<Integer> values) {
            addCriterion("TOIF.ORD_ITEM_ID not in", values, "ordItemId");
            return (Criteria) this;
        }

        public Criteria andOrdItemIdBetween(Integer value1, Integer value2) {
            addCriterion("TOIF.ORD_ITEM_ID between", value1, value2, "ordItemId");
            return (Criteria) this;
        }

        public Criteria andOrdItemIdNotBetween(Integer value1, Integer value2) {
            addCriterion("TOIF.ORD_ITEM_ID not between", value1, value2, "ordItemId");
            return (Criteria) this;
        }

        public Criteria andItemFrgtIdIsNull() {
            addCriterion("TOIF.ITEM_FRGT_ID is null");
            return (Criteria) this;
        }

        public Criteria andItemFrgtIdIsNotNull() {
            addCriterion("TOIF.ITEM_FRGT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andItemFrgtIdEqualTo(Integer value) {
            addCriterion("TOIF.ITEM_FRGT_ID =", value, "itemFrgtId");
            return (Criteria) this;
        }

        public Criteria andItemFrgtIdNotEqualTo(Integer value) {
            addCriterion("TOIF.ITEM_FRGT_ID <>", value, "itemFrgtId");
            return (Criteria) this;
        }

        public Criteria andItemFrgtIdGreaterThan(Integer value) {
            addCriterion("TOIF.ITEM_FRGT_ID >", value, "itemFrgtId");
            return (Criteria) this;
        }

        public Criteria andItemFrgtIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("TOIF.ITEM_FRGT_ID >=", value, "itemFrgtId");
            return (Criteria) this;
        }

        public Criteria andItemFrgtIdLessThan(Integer value) {
            addCriterion("TOIF.ITEM_FRGT_ID <", value, "itemFrgtId");
            return (Criteria) this;
        }

        public Criteria andItemFrgtIdLessThanOrEqualTo(Integer value) {
            addCriterion("TOIF.ITEM_FRGT_ID <=", value, "itemFrgtId");
            return (Criteria) this;
        }

        public Criteria andItemFrgtIdIn(List<Integer> values) {
            addCriterion("TOIF.ITEM_FRGT_ID in", values, "itemFrgtId");
            return (Criteria) this;
        }

        public Criteria andItemFrgtIdNotIn(List<Integer> values) {
            addCriterion("TOIF.ITEM_FRGT_ID not in", values, "itemFrgtId");
            return (Criteria) this;
        }

        public Criteria andItemFrgtIdBetween(Integer value1, Integer value2) {
            addCriterion("TOIF.ITEM_FRGT_ID between", value1, value2, "itemFrgtId");
            return (Criteria) this;
        }

        public Criteria andItemFrgtIdNotBetween(Integer value1, Integer value2) {
            addCriterion("TOIF.ITEM_FRGT_ID not between", value1, value2, "itemFrgtId");
            return (Criteria) this;
        }

        public Criteria andSsgCdIsNull() {
            addCriterion("TOIF.SSG_CD is null");
            return (Criteria) this;
        }

        public Criteria andSsgCdIsNotNull() {
            addCriterion("TOIF.SSG_CD is not null");
            return (Criteria) this;
        }

        public Criteria andSsgCdEqualTo(String value) {
            addCriterion("TOIF.SSG_CD =", value, "ssgCd");
            return (Criteria) this;
        }

        public Criteria andSsgCdNotEqualTo(String value) {
            addCriterion("TOIF.SSG_CD <>", value, "ssgCd");
            return (Criteria) this;
        }

        public Criteria andSsgCdGreaterThan(String value) {
            addCriterion("TOIF.SSG_CD >", value, "ssgCd");
            return (Criteria) this;
        }

        public Criteria andSsgCdGreaterThanOrEqualTo(String value) {
            addCriterion("TOIF.SSG_CD >=", value, "ssgCd");
            return (Criteria) this;
        }

        public Criteria andSsgCdLessThan(String value) {
            addCriterion("TOIF.SSG_CD <", value, "ssgCd");
            return (Criteria) this;
        }

        public Criteria andSsgCdLessThanOrEqualTo(String value) {
            addCriterion("TOIF.SSG_CD <=", value, "ssgCd");
            return (Criteria) this;
        }

        public Criteria andSsgCdLike(String value) {
            addCriterion("TOIF.SSG_CD like", value, "ssgCd");
            return (Criteria) this;
        }

        public Criteria andSsgCdNotLike(String value) {
            addCriterion("TOIF.SSG_CD not like", value, "ssgCd");
            return (Criteria) this;
        }

        public Criteria andSsgCdIn(List<String> values) {
            addCriterion("TOIF.SSG_CD in", values, "ssgCd");
            return (Criteria) this;
        }

        public Criteria andSsgCdNotIn(List<String> values) {
            addCriterion("TOIF.SSG_CD not in", values, "ssgCd");
            return (Criteria) this;
        }

        public Criteria andSsgCdBetween(String value1, String value2) {
            addCriterion("TOIF.SSG_CD between", value1, value2, "ssgCd");
            return (Criteria) this;
        }

        public Criteria andSsgCdNotBetween(String value1, String value2) {
            addCriterion("TOIF.SSG_CD not between", value1, value2, "ssgCd");
            return (Criteria) this;
        }

        public Criteria andFrgtNmIsNull() {
            addCriterion("TOIF.FRGT_NM is null");
            return (Criteria) this;
        }

        public Criteria andFrgtNmIsNotNull() {
            addCriterion("TOIF.FRGT_NM is not null");
            return (Criteria) this;
        }

        public Criteria andFrgtNmEqualTo(String value) {
            addCriterion("TOIF.FRGT_NM =", value, "frgtNm");
            return (Criteria) this;
        }

        public Criteria andFrgtNmNotEqualTo(String value) {
            addCriterion("TOIF.FRGT_NM <>", value, "frgtNm");
            return (Criteria) this;
        }

        public Criteria andFrgtNmGreaterThan(String value) {
            addCriterion("TOIF.FRGT_NM >", value, "frgtNm");
            return (Criteria) this;
        }

        public Criteria andFrgtNmGreaterThanOrEqualTo(String value) {
            addCriterion("TOIF.FRGT_NM >=", value, "frgtNm");
            return (Criteria) this;
        }

        public Criteria andFrgtNmLessThan(String value) {
            addCriterion("TOIF.FRGT_NM <", value, "frgtNm");
            return (Criteria) this;
        }

        public Criteria andFrgtNmLessThanOrEqualTo(String value) {
            addCriterion("TOIF.FRGT_NM <=", value, "frgtNm");
            return (Criteria) this;
        }

        public Criteria andFrgtNmLike(String value) {
            addCriterion("TOIF.FRGT_NM like", value, "frgtNm");
            return (Criteria) this;
        }

        public Criteria andFrgtNmNotLike(String value) {
            addCriterion("TOIF.FRGT_NM not like", value, "frgtNm");
            return (Criteria) this;
        }

        public Criteria andFrgtNmIn(List<String> values) {
            addCriterion("TOIF.FRGT_NM in", values, "frgtNm");
            return (Criteria) this;
        }

        public Criteria andFrgtNmNotIn(List<String> values) {
            addCriterion("TOIF.FRGT_NM not in", values, "frgtNm");
            return (Criteria) this;
        }

        public Criteria andFrgtNmBetween(String value1, String value2) {
            addCriterion("TOIF.FRGT_NM between", value1, value2, "frgtNm");
            return (Criteria) this;
        }

        public Criteria andFrgtNmNotBetween(String value1, String value2) {
            addCriterion("TOIF.FRGT_NM not between", value1, value2, "frgtNm");
            return (Criteria) this;
        }

        public Criteria andOrdCfmSndYnIsNull() {
            addCriterion("TOIF.ORD_CFM_SND_YN is null");
            return (Criteria) this;
        }

        public Criteria andOrdCfmSndYnIsNotNull() {
            addCriterion("TOIF.ORD_CFM_SND_YN is not null");
            return (Criteria) this;
        }

        public Criteria andOrdCfmSndYnEqualTo(String value) {
            addCriterion("TOIF.ORD_CFM_SND_YN =", value, "ordCfmSndYn");
            return (Criteria) this;
        }

        public Criteria andOrdCfmSndYnNotEqualTo(String value) {
            addCriterion("TOIF.ORD_CFM_SND_YN <>", value, "ordCfmSndYn");
            return (Criteria) this;
        }

        public Criteria andOrdCfmSndYnGreaterThan(String value) {
            addCriterion("TOIF.ORD_CFM_SND_YN >", value, "ordCfmSndYn");
            return (Criteria) this;
        }

        public Criteria andOrdCfmSndYnGreaterThanOrEqualTo(String value) {
            addCriterion("TOIF.ORD_CFM_SND_YN >=", value, "ordCfmSndYn");
            return (Criteria) this;
        }

        public Criteria andOrdCfmSndYnLessThan(String value) {
            addCriterion("TOIF.ORD_CFM_SND_YN <", value, "ordCfmSndYn");
            return (Criteria) this;
        }

        public Criteria andOrdCfmSndYnLessThanOrEqualTo(String value) {
            addCriterion("TOIF.ORD_CFM_SND_YN <=", value, "ordCfmSndYn");
            return (Criteria) this;
        }

        public Criteria andOrdCfmSndYnLike(String value) {
            addCriterion("TOIF.ORD_CFM_SND_YN like", value, "ordCfmSndYn");
            return (Criteria) this;
        }

        public Criteria andOrdCfmSndYnNotLike(String value) {
            addCriterion("TOIF.ORD_CFM_SND_YN not like", value, "ordCfmSndYn");
            return (Criteria) this;
        }

        public Criteria andOrdCfmSndYnIn(List<String> values) {
            addCriterion("TOIF.ORD_CFM_SND_YN in", values, "ordCfmSndYn");
            return (Criteria) this;
        }

        public Criteria andOrdCfmSndYnNotIn(List<String> values) {
            addCriterion("TOIF.ORD_CFM_SND_YN not in", values, "ordCfmSndYn");
            return (Criteria) this;
        }

        public Criteria andOrdCfmSndYnBetween(String value1, String value2) {
            addCriterion("TOIF.ORD_CFM_SND_YN between", value1, value2, "ordCfmSndYn");
            return (Criteria) this;
        }

        public Criteria andOrdCfmSndYnNotBetween(String value1, String value2) {
            addCriterion("TOIF.ORD_CFM_SND_YN not between", value1, value2, "ordCfmSndYn");
            return (Criteria) this;
        }

        public Criteria andRegDtIsNull() {
            addCriterion("TOIF.REG_DT is null");
            return (Criteria) this;
        }

        public Criteria andRegDtIsNotNull() {
            addCriterion("TOIF.REG_DT is not null");
            return (Criteria) this;
        }

        public Criteria andRegDtEqualTo(Date value) {
            addCriterion("TOIF.REG_DT =", value, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtNotEqualTo(Date value) {
            addCriterion("TOIF.REG_DT <>", value, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtGreaterThan(Date value) {
            addCriterion("TOIF.REG_DT >", value, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtGreaterThanOrEqualTo(Date value) {
            addCriterion("TOIF.REG_DT >=", value, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtLessThan(Date value) {
            addCriterion("TOIF.REG_DT <", value, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtLessThanOrEqualTo(Date value) {
            addCriterion("TOIF.REG_DT <=", value, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtIn(List<Date> values) {
            addCriterion("TOIF.REG_DT in", values, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtNotIn(List<Date> values) {
            addCriterion("TOIF.REG_DT not in", values, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtBetween(Date value1, Date value2) {
            addCriterion("TOIF.REG_DT between", value1, value2, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtNotBetween(Date value1, Date value2) {
            addCriterion("TOIF.REG_DT not between", value1, value2, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegIdIsNull() {
            addCriterion("TOIF.REG_ID is null");
            return (Criteria) this;
        }

        public Criteria andRegIdIsNotNull() {
            addCriterion("TOIF.REG_ID is not null");
            return (Criteria) this;
        }

        public Criteria andRegIdEqualTo(String value) {
            addCriterion("TOIF.REG_ID =", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdNotEqualTo(String value) {
            addCriterion("TOIF.REG_ID <>", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdGreaterThan(String value) {
            addCriterion("TOIF.REG_ID >", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdGreaterThanOrEqualTo(String value) {
            addCriterion("TOIF.REG_ID >=", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdLessThan(String value) {
            addCriterion("TOIF.REG_ID <", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdLessThanOrEqualTo(String value) {
            addCriterion("TOIF.REG_ID <=", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdLike(String value) {
            addCriterion("TOIF.REG_ID like", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdNotLike(String value) {
            addCriterion("TOIF.REG_ID not like", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdIn(List<String> values) {
            addCriterion("TOIF.REG_ID in", values, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdNotIn(List<String> values) {
            addCriterion("TOIF.REG_ID not in", values, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdBetween(String value1, String value2) {
            addCriterion("TOIF.REG_ID between", value1, value2, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdNotBetween(String value1, String value2) {
            addCriterion("TOIF.REG_ID not between", value1, value2, "regId");
            return (Criteria) this;
        }

        public Criteria andModDtIsNull() {
            addCriterion("TOIF.MOD_DT is null");
            return (Criteria) this;
        }

        public Criteria andModDtIsNotNull() {
            addCriterion("TOIF.MOD_DT is not null");
            return (Criteria) this;
        }

        public Criteria andModDtEqualTo(Date value) {
            addCriterion("TOIF.MOD_DT =", value, "modDt");
            return (Criteria) this;
        }

        public Criteria andModDtNotEqualTo(Date value) {
            addCriterion("TOIF.MOD_DT <>", value, "modDt");
            return (Criteria) this;
        }

        public Criteria andModDtGreaterThan(Date value) {
            addCriterion("TOIF.MOD_DT >", value, "modDt");
            return (Criteria) this;
        }

        public Criteria andModDtGreaterThanOrEqualTo(Date value) {
            addCriterion("TOIF.MOD_DT >=", value, "modDt");
            return (Criteria) this;
        }

        public Criteria andModDtLessThan(Date value) {
            addCriterion("TOIF.MOD_DT <", value, "modDt");
            return (Criteria) this;
        }

        public Criteria andModDtLessThanOrEqualTo(Date value) {
            addCriterion("TOIF.MOD_DT <=", value, "modDt");
            return (Criteria) this;
        }

        public Criteria andModDtIn(List<Date> values) {
            addCriterion("TOIF.MOD_DT in", values, "modDt");
            return (Criteria) this;
        }

        public Criteria andModDtNotIn(List<Date> values) {
            addCriterion("TOIF.MOD_DT not in", values, "modDt");
            return (Criteria) this;
        }

        public Criteria andModDtBetween(Date value1, Date value2) {
            addCriterion("TOIF.MOD_DT between", value1, value2, "modDt");
            return (Criteria) this;
        }

        public Criteria andModDtNotBetween(Date value1, Date value2) {
            addCriterion("TOIF.MOD_DT not between", value1, value2, "modDt");
            return (Criteria) this;
        }

        public Criteria andModIdIsNull() {
            addCriterion("TOIF.MOD_ID is null");
            return (Criteria) this;
        }

        public Criteria andModIdIsNotNull() {
            addCriterion("TOIF.MOD_ID is not null");
            return (Criteria) this;
        }

        public Criteria andModIdEqualTo(String value) {
            addCriterion("TOIF.MOD_ID =", value, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdNotEqualTo(String value) {
            addCriterion("TOIF.MOD_ID <>", value, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdGreaterThan(String value) {
            addCriterion("TOIF.MOD_ID >", value, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdGreaterThanOrEqualTo(String value) {
            addCriterion("TOIF.MOD_ID >=", value, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdLessThan(String value) {
            addCriterion("TOIF.MOD_ID <", value, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdLessThanOrEqualTo(String value) {
            addCriterion("TOIF.MOD_ID <=", value, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdLike(String value) {
            addCriterion("TOIF.MOD_ID like", value, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdNotLike(String value) {
            addCriterion("TOIF.MOD_ID not like", value, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdIn(List<String> values) {
            addCriterion("TOIF.MOD_ID in", values, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdNotIn(List<String> values) {
            addCriterion("TOIF.MOD_ID not in", values, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdBetween(String value1, String value2) {
            addCriterion("TOIF.MOD_ID between", value1, value2, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdNotBetween(String value1, String value2) {
            addCriterion("TOIF.MOD_ID not between", value1, value2, "modId");
            return (Criteria) this;
        }

        public Criteria andSsgCdLikeInsensitive(String value) {
            addCriterion("upper(TOIF.SSG_CD) like", value.toUpperCase(), "ssgCd");
            return (Criteria) this;
        }

        public Criteria andFrgtNmLikeInsensitive(String value) {
            addCriterion("upper(TOIF.FRGT_NM) like", value.toUpperCase(), "frgtNm");
            return (Criteria) this;
        }

        public Criteria andOrdCfmSndYnLikeInsensitive(String value) {
            addCriterion("upper(TOIF.ORD_CFM_SND_YN) like", value.toUpperCase(), "ordCfmSndYn");
            return (Criteria) this;
        }

        public Criteria andRegIdLikeInsensitive(String value) {
            addCriterion("upper(TOIF.REG_ID) like", value.toUpperCase(), "regId");
            return (Criteria) this;
        }

        public Criteria andModIdLikeInsensitive(String value) {
            addCriterion("upper(TOIF.MOD_ID) like", value.toUpperCase(), "modId");
            return (Criteria) this;
        }

        public Criteria andSsgCdLikeLeft(String value) {
            addCriterion("TOIF.SSG_CD like ", "%" + value, "ssgCd");
            return (Criteria) this;
        }

        public Criteria andSsgCdLikeRight(String value) {
            addCriterion("TOIF.SSG_CD like ", value + "%", "ssgCd");
            return (Criteria) this;
        }

        public Criteria andSsgCdLikeBoth(String value) {
            addCriterion("TOIF.SSG_CD like ", "%" + value + "%", "ssgCd");
            return (Criteria) this;
        }

        public Criteria andFrgtNmLikeLeft(String value) {
            addCriterion("TOIF.FRGT_NM like ", "%" + value, "frgtNm");
            return (Criteria) this;
        }

        public Criteria andFrgtNmLikeRight(String value) {
            addCriterion("TOIF.FRGT_NM like ", value + "%", "frgtNm");
            return (Criteria) this;
        }

        public Criteria andFrgtNmLikeBoth(String value) {
            addCriterion("TOIF.FRGT_NM like ", "%" + value + "%", "frgtNm");
            return (Criteria) this;
        }

        public Criteria andOrdCfmSndYnLikeLeft(String value) {
            addCriterion("TOIF.ORD_CFM_SND_YN like ", "%" + value, "ordCfmSndYn");
            return (Criteria) this;
        }

        public Criteria andOrdCfmSndYnLikeRight(String value) {
            addCriterion("TOIF.ORD_CFM_SND_YN like ", value + "%", "ordCfmSndYn");
            return (Criteria) this;
        }

        public Criteria andOrdCfmSndYnLikeBoth(String value) {
            addCriterion("TOIF.ORD_CFM_SND_YN like ", "%" + value + "%", "ordCfmSndYn");
            return (Criteria) this;
        }

        public Criteria andRegIdLikeLeft(String value) {
            addCriterion("TOIF.REG_ID like ", "%" + value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdLikeRight(String value) {
            addCriterion("TOIF.REG_ID like ", value + "%", "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdLikeBoth(String value) {
            addCriterion("TOIF.REG_ID like ", "%" + value + "%", "regId");
            return (Criteria) this;
        }

        public Criteria andModIdLikeLeft(String value) {
            addCriterion("TOIF.MOD_ID like ", "%" + value, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdLikeRight(String value) {
            addCriterion("TOIF.MOD_ID like ", value + "%", "modId");
            return (Criteria) this;
        }

        public Criteria andModIdLikeBoth(String value) {
            addCriterion("TOIF.MOD_ID like ", "%" + value + "%", "modId");
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