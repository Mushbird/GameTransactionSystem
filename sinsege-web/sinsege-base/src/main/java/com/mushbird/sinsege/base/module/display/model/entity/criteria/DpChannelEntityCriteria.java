package com.mushbird.sinsege.base.module.display.model.entity.criteria;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DpChannelEntityCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    public DpChannelEntityCriteria() {
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

        public Criteria andDpChIdIsNull() {
            addCriterion("TDCH.DP_CH_ID is null");
            return (Criteria) this;
        }

        public Criteria andDpChIdIsNotNull() {
            addCriterion("TDCH.DP_CH_ID is not null");
            return (Criteria) this;
        }

        public Criteria andDpChIdEqualTo(Integer value) {
            addCriterion("TDCH.DP_CH_ID =", value, "dpChId");
            return (Criteria) this;
        }

        public Criteria andDpChIdNotEqualTo(Integer value) {
            addCriterion("TDCH.DP_CH_ID <>", value, "dpChId");
            return (Criteria) this;
        }

        public Criteria andDpChIdGreaterThan(Integer value) {
            addCriterion("TDCH.DP_CH_ID >", value, "dpChId");
            return (Criteria) this;
        }

        public Criteria andDpChIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("TDCH.DP_CH_ID >=", value, "dpChId");
            return (Criteria) this;
        }

        public Criteria andDpChIdLessThan(Integer value) {
            addCriterion("TDCH.DP_CH_ID <", value, "dpChId");
            return (Criteria) this;
        }

        public Criteria andDpChIdLessThanOrEqualTo(Integer value) {
            addCriterion("TDCH.DP_CH_ID <=", value, "dpChId");
            return (Criteria) this;
        }

        public Criteria andDpChIdIn(List<Integer> values) {
            addCriterion("TDCH.DP_CH_ID in", values, "dpChId");
            return (Criteria) this;
        }

        public Criteria andDpChIdNotIn(List<Integer> values) {
            addCriterion("TDCH.DP_CH_ID not in", values, "dpChId");
            return (Criteria) this;
        }

        public Criteria andDpChIdBetween(Integer value1, Integer value2) {
            addCriterion("TDCH.DP_CH_ID between", value1, value2, "dpChId");
            return (Criteria) this;
        }

        public Criteria andDpChIdNotBetween(Integer value1, Integer value2) {
            addCriterion("TDCH.DP_CH_ID not between", value1, value2, "dpChId");
            return (Criteria) this;
        }

        public Criteria andDpChTpCdIsNull() {
            addCriterion("TDCH.DP_CH_TP_CD is null");
            return (Criteria) this;
        }

        public Criteria andDpChTpCdIsNotNull() {
            addCriterion("TDCH.DP_CH_TP_CD is not null");
            return (Criteria) this;
        }

        public Criteria andDpChTpCdEqualTo(String value) {
            addCriterion("TDCH.DP_CH_TP_CD =", value, "dpChTpCd");
            return (Criteria) this;
        }

        public Criteria andDpChTpCdNotEqualTo(String value) {
            addCriterion("TDCH.DP_CH_TP_CD <>", value, "dpChTpCd");
            return (Criteria) this;
        }

        public Criteria andDpChTpCdGreaterThan(String value) {
            addCriterion("TDCH.DP_CH_TP_CD >", value, "dpChTpCd");
            return (Criteria) this;
        }

        public Criteria andDpChTpCdGreaterThanOrEqualTo(String value) {
            addCriterion("TDCH.DP_CH_TP_CD >=", value, "dpChTpCd");
            return (Criteria) this;
        }

        public Criteria andDpChTpCdLessThan(String value) {
            addCriterion("TDCH.DP_CH_TP_CD <", value, "dpChTpCd");
            return (Criteria) this;
        }

        public Criteria andDpChTpCdLessThanOrEqualTo(String value) {
            addCriterion("TDCH.DP_CH_TP_CD <=", value, "dpChTpCd");
            return (Criteria) this;
        }

        public Criteria andDpChTpCdLike(String value) {
            addCriterion("TDCH.DP_CH_TP_CD like", value, "dpChTpCd");
            return (Criteria) this;
        }

        public Criteria andDpChTpCdNotLike(String value) {
            addCriterion("TDCH.DP_CH_TP_CD not like", value, "dpChTpCd");
            return (Criteria) this;
        }

        public Criteria andDpChTpCdIn(List<String> values) {
            addCriterion("TDCH.DP_CH_TP_CD in", values, "dpChTpCd");
            return (Criteria) this;
        }

        public Criteria andDpChTpCdNotIn(List<String> values) {
            addCriterion("TDCH.DP_CH_TP_CD not in", values, "dpChTpCd");
            return (Criteria) this;
        }

        public Criteria andDpChTpCdBetween(String value1, String value2) {
            addCriterion("TDCH.DP_CH_TP_CD between", value1, value2, "dpChTpCd");
            return (Criteria) this;
        }

        public Criteria andDpChTpCdNotBetween(String value1, String value2) {
            addCriterion("TDCH.DP_CH_TP_CD not between", value1, value2, "dpChTpCd");
            return (Criteria) this;
        }

        public Criteria andDpChNmIsNull() {
            addCriterion("TDCH.DP_CH_NM is null");
            return (Criteria) this;
        }

        public Criteria andDpChNmIsNotNull() {
            addCriterion("TDCH.DP_CH_NM is not null");
            return (Criteria) this;
        }

        public Criteria andDpChNmEqualTo(String value) {
            addCriterion("TDCH.DP_CH_NM =", value, "dpChNm");
            return (Criteria) this;
        }

        public Criteria andDpChNmNotEqualTo(String value) {
            addCriterion("TDCH.DP_CH_NM <>", value, "dpChNm");
            return (Criteria) this;
        }

        public Criteria andDpChNmGreaterThan(String value) {
            addCriterion("TDCH.DP_CH_NM >", value, "dpChNm");
            return (Criteria) this;
        }

        public Criteria andDpChNmGreaterThanOrEqualTo(String value) {
            addCriterion("TDCH.DP_CH_NM >=", value, "dpChNm");
            return (Criteria) this;
        }

        public Criteria andDpChNmLessThan(String value) {
            addCriterion("TDCH.DP_CH_NM <", value, "dpChNm");
            return (Criteria) this;
        }

        public Criteria andDpChNmLessThanOrEqualTo(String value) {
            addCriterion("TDCH.DP_CH_NM <=", value, "dpChNm");
            return (Criteria) this;
        }

        public Criteria andDpChNmLike(String value) {
            addCriterion("TDCH.DP_CH_NM like", value, "dpChNm");
            return (Criteria) this;
        }

        public Criteria andDpChNmNotLike(String value) {
            addCriterion("TDCH.DP_CH_NM not like", value, "dpChNm");
            return (Criteria) this;
        }

        public Criteria andDpChNmIn(List<String> values) {
            addCriterion("TDCH.DP_CH_NM in", values, "dpChNm");
            return (Criteria) this;
        }

        public Criteria andDpChNmNotIn(List<String> values) {
            addCriterion("TDCH.DP_CH_NM not in", values, "dpChNm");
            return (Criteria) this;
        }

        public Criteria andDpChNmBetween(String value1, String value2) {
            addCriterion("TDCH.DP_CH_NM between", value1, value2, "dpChNm");
            return (Criteria) this;
        }

        public Criteria andDpChNmNotBetween(String value1, String value2) {
            addCriterion("TDCH.DP_CH_NM not between", value1, value2, "dpChNm");
            return (Criteria) this;
        }

        public Criteria andRegDtIsNull() {
            addCriterion("TDCH.REG_DT is null");
            return (Criteria) this;
        }

        public Criteria andRegDtIsNotNull() {
            addCriterion("TDCH.REG_DT is not null");
            return (Criteria) this;
        }

        public Criteria andRegDtEqualTo(Date value) {
            addCriterion("TDCH.REG_DT =", value, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtNotEqualTo(Date value) {
            addCriterion("TDCH.REG_DT <>", value, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtGreaterThan(Date value) {
            addCriterion("TDCH.REG_DT >", value, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtGreaterThanOrEqualTo(Date value) {
            addCriterion("TDCH.REG_DT >=", value, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtLessThan(Date value) {
            addCriterion("TDCH.REG_DT <", value, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtLessThanOrEqualTo(Date value) {
            addCriterion("TDCH.REG_DT <=", value, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtIn(List<Date> values) {
            addCriterion("TDCH.REG_DT in", values, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtNotIn(List<Date> values) {
            addCriterion("TDCH.REG_DT not in", values, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtBetween(Date value1, Date value2) {
            addCriterion("TDCH.REG_DT between", value1, value2, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtNotBetween(Date value1, Date value2) {
            addCriterion("TDCH.REG_DT not between", value1, value2, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegIdIsNull() {
            addCriterion("TDCH.REG_ID is null");
            return (Criteria) this;
        }

        public Criteria andRegIdIsNotNull() {
            addCriterion("TDCH.REG_ID is not null");
            return (Criteria) this;
        }

        public Criteria andRegIdEqualTo(String value) {
            addCriterion("TDCH.REG_ID =", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdNotEqualTo(String value) {
            addCriterion("TDCH.REG_ID <>", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdGreaterThan(String value) {
            addCriterion("TDCH.REG_ID >", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdGreaterThanOrEqualTo(String value) {
            addCriterion("TDCH.REG_ID >=", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdLessThan(String value) {
            addCriterion("TDCH.REG_ID <", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdLessThanOrEqualTo(String value) {
            addCriterion("TDCH.REG_ID <=", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdLike(String value) {
            addCriterion("TDCH.REG_ID like", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdNotLike(String value) {
            addCriterion("TDCH.REG_ID not like", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdIn(List<String> values) {
            addCriterion("TDCH.REG_ID in", values, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdNotIn(List<String> values) {
            addCriterion("TDCH.REG_ID not in", values, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdBetween(String value1, String value2) {
            addCriterion("TDCH.REG_ID between", value1, value2, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdNotBetween(String value1, String value2) {
            addCriterion("TDCH.REG_ID not between", value1, value2, "regId");
            return (Criteria) this;
        }

        public Criteria andModDtIsNull() {
            addCriterion("TDCH.MOD_DT is null");
            return (Criteria) this;
        }

        public Criteria andModDtIsNotNull() {
            addCriterion("TDCH.MOD_DT is not null");
            return (Criteria) this;
        }

        public Criteria andModDtEqualTo(Date value) {
            addCriterion("TDCH.MOD_DT =", value, "modDt");
            return (Criteria) this;
        }

        public Criteria andModDtNotEqualTo(Date value) {
            addCriterion("TDCH.MOD_DT <>", value, "modDt");
            return (Criteria) this;
        }

        public Criteria andModDtGreaterThan(Date value) {
            addCriterion("TDCH.MOD_DT >", value, "modDt");
            return (Criteria) this;
        }

        public Criteria andModDtGreaterThanOrEqualTo(Date value) {
            addCriterion("TDCH.MOD_DT >=", value, "modDt");
            return (Criteria) this;
        }

        public Criteria andModDtLessThan(Date value) {
            addCriterion("TDCH.MOD_DT <", value, "modDt");
            return (Criteria) this;
        }

        public Criteria andModDtLessThanOrEqualTo(Date value) {
            addCriterion("TDCH.MOD_DT <=", value, "modDt");
            return (Criteria) this;
        }

        public Criteria andModDtIn(List<Date> values) {
            addCriterion("TDCH.MOD_DT in", values, "modDt");
            return (Criteria) this;
        }

        public Criteria andModDtNotIn(List<Date> values) {
            addCriterion("TDCH.MOD_DT not in", values, "modDt");
            return (Criteria) this;
        }

        public Criteria andModDtBetween(Date value1, Date value2) {
            addCriterion("TDCH.MOD_DT between", value1, value2, "modDt");
            return (Criteria) this;
        }

        public Criteria andModDtNotBetween(Date value1, Date value2) {
            addCriterion("TDCH.MOD_DT not between", value1, value2, "modDt");
            return (Criteria) this;
        }

        public Criteria andModIdIsNull() {
            addCriterion("TDCH.MOD_ID is null");
            return (Criteria) this;
        }

        public Criteria andModIdIsNotNull() {
            addCriterion("TDCH.MOD_ID is not null");
            return (Criteria) this;
        }

        public Criteria andModIdEqualTo(String value) {
            addCriterion("TDCH.MOD_ID =", value, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdNotEqualTo(String value) {
            addCriterion("TDCH.MOD_ID <>", value, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdGreaterThan(String value) {
            addCriterion("TDCH.MOD_ID >", value, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdGreaterThanOrEqualTo(String value) {
            addCriterion("TDCH.MOD_ID >=", value, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdLessThan(String value) {
            addCriterion("TDCH.MOD_ID <", value, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdLessThanOrEqualTo(String value) {
            addCriterion("TDCH.MOD_ID <=", value, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdLike(String value) {
            addCriterion("TDCH.MOD_ID like", value, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdNotLike(String value) {
            addCriterion("TDCH.MOD_ID not like", value, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdIn(List<String> values) {
            addCriterion("TDCH.MOD_ID in", values, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdNotIn(List<String> values) {
            addCriterion("TDCH.MOD_ID not in", values, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdBetween(String value1, String value2) {
            addCriterion("TDCH.MOD_ID between", value1, value2, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdNotBetween(String value1, String value2) {
            addCriterion("TDCH.MOD_ID not between", value1, value2, "modId");
            return (Criteria) this;
        }

        public Criteria andUseYnIsNull() {
            addCriterion("TDCH.USE_YN is null");
            return (Criteria) this;
        }

        public Criteria andUseYnIsNotNull() {
            addCriterion("TDCH.USE_YN is not null");
            return (Criteria) this;
        }

        public Criteria andUseYnEqualTo(String value) {
            addCriterion("TDCH.USE_YN =", value, "useYn");
            return (Criteria) this;
        }

        public Criteria andUseYnNotEqualTo(String value) {
            addCriterion("TDCH.USE_YN <>", value, "useYn");
            return (Criteria) this;
        }

        public Criteria andUseYnGreaterThan(String value) {
            addCriterion("TDCH.USE_YN >", value, "useYn");
            return (Criteria) this;
        }

        public Criteria andUseYnGreaterThanOrEqualTo(String value) {
            addCriterion("TDCH.USE_YN >=", value, "useYn");
            return (Criteria) this;
        }

        public Criteria andUseYnLessThan(String value) {
            addCriterion("TDCH.USE_YN <", value, "useYn");
            return (Criteria) this;
        }

        public Criteria andUseYnLessThanOrEqualTo(String value) {
            addCriterion("TDCH.USE_YN <=", value, "useYn");
            return (Criteria) this;
        }

        public Criteria andUseYnLike(String value) {
            addCriterion("TDCH.USE_YN like", value, "useYn");
            return (Criteria) this;
        }

        public Criteria andUseYnNotLike(String value) {
            addCriterion("TDCH.USE_YN not like", value, "useYn");
            return (Criteria) this;
        }

        public Criteria andUseYnIn(List<String> values) {
            addCriterion("TDCH.USE_YN in", values, "useYn");
            return (Criteria) this;
        }

        public Criteria andUseYnNotIn(List<String> values) {
            addCriterion("TDCH.USE_YN not in", values, "useYn");
            return (Criteria) this;
        }

        public Criteria andUseYnBetween(String value1, String value2) {
            addCriterion("TDCH.USE_YN between", value1, value2, "useYn");
            return (Criteria) this;
        }

        public Criteria andUseYnNotBetween(String value1, String value2) {
            addCriterion("TDCH.USE_YN not between", value1, value2, "useYn");
            return (Criteria) this;
        }

        public Criteria andDpChTpCdLikeInsensitive(String value) {
            addCriterion("upper(TDCH.DP_CH_TP_CD) like", value.toUpperCase(), "dpChTpCd");
            return (Criteria) this;
        }

        public Criteria andDpChNmLikeInsensitive(String value) {
            addCriterion("upper(TDCH.DP_CH_NM) like", value.toUpperCase(), "dpChNm");
            return (Criteria) this;
        }

        public Criteria andRegIdLikeInsensitive(String value) {
            addCriterion("upper(TDCH.REG_ID) like", value.toUpperCase(), "regId");
            return (Criteria) this;
        }

        public Criteria andModIdLikeInsensitive(String value) {
            addCriterion("upper(TDCH.MOD_ID) like", value.toUpperCase(), "modId");
            return (Criteria) this;
        }

        public Criteria andUseYnLikeInsensitive(String value) {
            addCriterion("upper(TDCH.USE_YN) like", value.toUpperCase(), "useYn");
            return (Criteria) this;
        }

        public Criteria andDpChTpCdLikeLeft(String value) {
            addCriterion("TDCH.DP_CH_TP_CD like ", "%" + value, "dpChTpCd");
            return (Criteria) this;
        }

        public Criteria andDpChTpCdLikeRight(String value) {
            addCriterion("TDCH.DP_CH_TP_CD like ", value + "%", "dpChTpCd");
            return (Criteria) this;
        }

        public Criteria andDpChTpCdLikeBoth(String value) {
            addCriterion("TDCH.DP_CH_TP_CD like ", "%" + value + "%", "dpChTpCd");
            return (Criteria) this;
        }

        public Criteria andDpChNmLikeLeft(String value) {
            addCriterion("TDCH.DP_CH_NM like ", "%" + value, "dpChNm");
            return (Criteria) this;
        }

        public Criteria andDpChNmLikeRight(String value) {
            addCriterion("TDCH.DP_CH_NM like ", value + "%", "dpChNm");
            return (Criteria) this;
        }

        public Criteria andDpChNmLikeBoth(String value) {
            addCriterion("TDCH.DP_CH_NM like ", "%" + value + "%", "dpChNm");
            return (Criteria) this;
        }

        public Criteria andRegIdLikeLeft(String value) {
            addCriterion("TDCH.REG_ID like ", "%" + value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdLikeRight(String value) {
            addCriterion("TDCH.REG_ID like ", value + "%", "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdLikeBoth(String value) {
            addCriterion("TDCH.REG_ID like ", "%" + value + "%", "regId");
            return (Criteria) this;
        }

        public Criteria andModIdLikeLeft(String value) {
            addCriterion("TDCH.MOD_ID like ", "%" + value, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdLikeRight(String value) {
            addCriterion("TDCH.MOD_ID like ", value + "%", "modId");
            return (Criteria) this;
        }

        public Criteria andModIdLikeBoth(String value) {
            addCriterion("TDCH.MOD_ID like ", "%" + value + "%", "modId");
            return (Criteria) this;
        }

        public Criteria andUseYnLikeLeft(String value) {
            addCriterion("TDCH.USE_YN like ", "%" + value, "useYn");
            return (Criteria) this;
        }

        public Criteria andUseYnLikeRight(String value) {
            addCriterion("TDCH.USE_YN like ", value + "%", "useYn");
            return (Criteria) this;
        }

        public Criteria andUseYnLikeBoth(String value) {
            addCriterion("TDCH.USE_YN like ", "%" + value + "%", "useYn");
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