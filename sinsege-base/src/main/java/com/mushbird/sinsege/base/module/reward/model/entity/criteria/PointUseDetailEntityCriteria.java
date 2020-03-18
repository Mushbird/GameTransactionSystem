package com.mushbird.sinsege.base.module.reward.model.entity.criteria;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PointUseDetailEntityCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    public PointUseDetailEntityCriteria() {
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

        public Criteria andPtUseDtlIdIsNull() {
            addCriterion("TPUD.PT_USE_DTL_ID is null");
            return (Criteria) this;
        }

        public Criteria andPtUseDtlIdIsNotNull() {
            addCriterion("TPUD.PT_USE_DTL_ID is not null");
            return (Criteria) this;
        }

        public Criteria andPtUseDtlIdEqualTo(Integer value) {
            addCriterion("TPUD.PT_USE_DTL_ID =", value, "ptUseDtlId");
            return (Criteria) this;
        }

        public Criteria andPtUseDtlIdNotEqualTo(Integer value) {
            addCriterion("TPUD.PT_USE_DTL_ID <>", value, "ptUseDtlId");
            return (Criteria) this;
        }

        public Criteria andPtUseDtlIdGreaterThan(Integer value) {
            addCriterion("TPUD.PT_USE_DTL_ID >", value, "ptUseDtlId");
            return (Criteria) this;
        }

        public Criteria andPtUseDtlIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("TPUD.PT_USE_DTL_ID >=", value, "ptUseDtlId");
            return (Criteria) this;
        }

        public Criteria andPtUseDtlIdLessThan(Integer value) {
            addCriterion("TPUD.PT_USE_DTL_ID <", value, "ptUseDtlId");
            return (Criteria) this;
        }

        public Criteria andPtUseDtlIdLessThanOrEqualTo(Integer value) {
            addCriterion("TPUD.PT_USE_DTL_ID <=", value, "ptUseDtlId");
            return (Criteria) this;
        }

        public Criteria andPtUseDtlIdIn(List<Integer> values) {
            addCriterion("TPUD.PT_USE_DTL_ID in", values, "ptUseDtlId");
            return (Criteria) this;
        }

        public Criteria andPtUseDtlIdNotIn(List<Integer> values) {
            addCriterion("TPUD.PT_USE_DTL_ID not in", values, "ptUseDtlId");
            return (Criteria) this;
        }

        public Criteria andPtUseDtlIdBetween(Integer value1, Integer value2) {
            addCriterion("TPUD.PT_USE_DTL_ID between", value1, value2, "ptUseDtlId");
            return (Criteria) this;
        }

        public Criteria andPtUseDtlIdNotBetween(Integer value1, Integer value2) {
            addCriterion("TPUD.PT_USE_DTL_ID not between", value1, value2, "ptUseDtlId");
            return (Criteria) this;
        }

        public Criteria andPtUseIdIsNull() {
            addCriterion("TPUD.PT_USE_ID is null");
            return (Criteria) this;
        }

        public Criteria andPtUseIdIsNotNull() {
            addCriterion("TPUD.PT_USE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andPtUseIdEqualTo(Integer value) {
            addCriterion("TPUD.PT_USE_ID =", value, "ptUseId");
            return (Criteria) this;
        }

        public Criteria andPtUseIdNotEqualTo(Integer value) {
            addCriterion("TPUD.PT_USE_ID <>", value, "ptUseId");
            return (Criteria) this;
        }

        public Criteria andPtUseIdGreaterThan(Integer value) {
            addCriterion("TPUD.PT_USE_ID >", value, "ptUseId");
            return (Criteria) this;
        }

        public Criteria andPtUseIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("TPUD.PT_USE_ID >=", value, "ptUseId");
            return (Criteria) this;
        }

        public Criteria andPtUseIdLessThan(Integer value) {
            addCriterion("TPUD.PT_USE_ID <", value, "ptUseId");
            return (Criteria) this;
        }

        public Criteria andPtUseIdLessThanOrEqualTo(Integer value) {
            addCriterion("TPUD.PT_USE_ID <=", value, "ptUseId");
            return (Criteria) this;
        }

        public Criteria andPtUseIdIn(List<Integer> values) {
            addCriterion("TPUD.PT_USE_ID in", values, "ptUseId");
            return (Criteria) this;
        }

        public Criteria andPtUseIdNotIn(List<Integer> values) {
            addCriterion("TPUD.PT_USE_ID not in", values, "ptUseId");
            return (Criteria) this;
        }

        public Criteria andPtUseIdBetween(Integer value1, Integer value2) {
            addCriterion("TPUD.PT_USE_ID between", value1, value2, "ptUseId");
            return (Criteria) this;
        }

        public Criteria andPtUseIdNotBetween(Integer value1, Integer value2) {
            addCriterion("TPUD.PT_USE_ID not between", value1, value2, "ptUseId");
            return (Criteria) this;
        }

        public Criteria andPtSaveIdIsNull() {
            addCriterion("TPUD.PT_SAVE_ID is null");
            return (Criteria) this;
        }

        public Criteria andPtSaveIdIsNotNull() {
            addCriterion("TPUD.PT_SAVE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andPtSaveIdEqualTo(Integer value) {
            addCriterion("TPUD.PT_SAVE_ID =", value, "ptSaveId");
            return (Criteria) this;
        }

        public Criteria andPtSaveIdNotEqualTo(Integer value) {
            addCriterion("TPUD.PT_SAVE_ID <>", value, "ptSaveId");
            return (Criteria) this;
        }

        public Criteria andPtSaveIdGreaterThan(Integer value) {
            addCriterion("TPUD.PT_SAVE_ID >", value, "ptSaveId");
            return (Criteria) this;
        }

        public Criteria andPtSaveIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("TPUD.PT_SAVE_ID >=", value, "ptSaveId");
            return (Criteria) this;
        }

        public Criteria andPtSaveIdLessThan(Integer value) {
            addCriterion("TPUD.PT_SAVE_ID <", value, "ptSaveId");
            return (Criteria) this;
        }

        public Criteria andPtSaveIdLessThanOrEqualTo(Integer value) {
            addCriterion("TPUD.PT_SAVE_ID <=", value, "ptSaveId");
            return (Criteria) this;
        }

        public Criteria andPtSaveIdIn(List<Integer> values) {
            addCriterion("TPUD.PT_SAVE_ID in", values, "ptSaveId");
            return (Criteria) this;
        }

        public Criteria andPtSaveIdNotIn(List<Integer> values) {
            addCriterion("TPUD.PT_SAVE_ID not in", values, "ptSaveId");
            return (Criteria) this;
        }

        public Criteria andPtSaveIdBetween(Integer value1, Integer value2) {
            addCriterion("TPUD.PT_SAVE_ID between", value1, value2, "ptSaveId");
            return (Criteria) this;
        }

        public Criteria andPtSaveIdNotBetween(Integer value1, Integer value2) {
            addCriterion("TPUD.PT_SAVE_ID not between", value1, value2, "ptSaveId");
            return (Criteria) this;
        }

        public Criteria andFstPtUseAmtIsNull() {
            addCriterion("TPUD.FST_PT_USE_AMT is null");
            return (Criteria) this;
        }

        public Criteria andFstPtUseAmtIsNotNull() {
            addCriterion("TPUD.FST_PT_USE_AMT is not null");
            return (Criteria) this;
        }

        public Criteria andFstPtUseAmtEqualTo(Integer value) {
            addCriterion("TPUD.FST_PT_USE_AMT =", value, "fstPtUseAmt");
            return (Criteria) this;
        }

        public Criteria andFstPtUseAmtNotEqualTo(Integer value) {
            addCriterion("TPUD.FST_PT_USE_AMT <>", value, "fstPtUseAmt");
            return (Criteria) this;
        }

        public Criteria andFstPtUseAmtGreaterThan(Integer value) {
            addCriterion("TPUD.FST_PT_USE_AMT >", value, "fstPtUseAmt");
            return (Criteria) this;
        }

        public Criteria andFstPtUseAmtGreaterThanOrEqualTo(Integer value) {
            addCriterion("TPUD.FST_PT_USE_AMT >=", value, "fstPtUseAmt");
            return (Criteria) this;
        }

        public Criteria andFstPtUseAmtLessThan(Integer value) {
            addCriterion("TPUD.FST_PT_USE_AMT <", value, "fstPtUseAmt");
            return (Criteria) this;
        }

        public Criteria andFstPtUseAmtLessThanOrEqualTo(Integer value) {
            addCriterion("TPUD.FST_PT_USE_AMT <=", value, "fstPtUseAmt");
            return (Criteria) this;
        }

        public Criteria andFstPtUseAmtIn(List<Integer> values) {
            addCriterion("TPUD.FST_PT_USE_AMT in", values, "fstPtUseAmt");
            return (Criteria) this;
        }

        public Criteria andFstPtUseAmtNotIn(List<Integer> values) {
            addCriterion("TPUD.FST_PT_USE_AMT not in", values, "fstPtUseAmt");
            return (Criteria) this;
        }

        public Criteria andFstPtUseAmtBetween(Integer value1, Integer value2) {
            addCriterion("TPUD.FST_PT_USE_AMT between", value1, value2, "fstPtUseAmt");
            return (Criteria) this;
        }

        public Criteria andFstPtUseAmtNotBetween(Integer value1, Integer value2) {
            addCriterion("TPUD.FST_PT_USE_AMT not between", value1, value2, "fstPtUseAmt");
            return (Criteria) this;
        }

        public Criteria andPtUseAmtIsNull() {
            addCriterion("TPUD.PT_USE_AMT is null");
            return (Criteria) this;
        }

        public Criteria andPtUseAmtIsNotNull() {
            addCriterion("TPUD.PT_USE_AMT is not null");
            return (Criteria) this;
        }

        public Criteria andPtUseAmtEqualTo(Integer value) {
            addCriterion("TPUD.PT_USE_AMT =", value, "ptUseAmt");
            return (Criteria) this;
        }

        public Criteria andPtUseAmtNotEqualTo(Integer value) {
            addCriterion("TPUD.PT_USE_AMT <>", value, "ptUseAmt");
            return (Criteria) this;
        }

        public Criteria andPtUseAmtGreaterThan(Integer value) {
            addCriterion("TPUD.PT_USE_AMT >", value, "ptUseAmt");
            return (Criteria) this;
        }

        public Criteria andPtUseAmtGreaterThanOrEqualTo(Integer value) {
            addCriterion("TPUD.PT_USE_AMT >=", value, "ptUseAmt");
            return (Criteria) this;
        }

        public Criteria andPtUseAmtLessThan(Integer value) {
            addCriterion("TPUD.PT_USE_AMT <", value, "ptUseAmt");
            return (Criteria) this;
        }

        public Criteria andPtUseAmtLessThanOrEqualTo(Integer value) {
            addCriterion("TPUD.PT_USE_AMT <=", value, "ptUseAmt");
            return (Criteria) this;
        }

        public Criteria andPtUseAmtIn(List<Integer> values) {
            addCriterion("TPUD.PT_USE_AMT in", values, "ptUseAmt");
            return (Criteria) this;
        }

        public Criteria andPtUseAmtNotIn(List<Integer> values) {
            addCriterion("TPUD.PT_USE_AMT not in", values, "ptUseAmt");
            return (Criteria) this;
        }

        public Criteria andPtUseAmtBetween(Integer value1, Integer value2) {
            addCriterion("TPUD.PT_USE_AMT between", value1, value2, "ptUseAmt");
            return (Criteria) this;
        }

        public Criteria andPtUseAmtNotBetween(Integer value1, Integer value2) {
            addCriterion("TPUD.PT_USE_AMT not between", value1, value2, "ptUseAmt");
            return (Criteria) this;
        }

        public Criteria andRegDtIsNull() {
            addCriterion("TPUD.REG_DT is null");
            return (Criteria) this;
        }

        public Criteria andRegDtIsNotNull() {
            addCriterion("TPUD.REG_DT is not null");
            return (Criteria) this;
        }

        public Criteria andRegDtEqualTo(Date value) {
            addCriterion("TPUD.REG_DT =", value, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtNotEqualTo(Date value) {
            addCriterion("TPUD.REG_DT <>", value, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtGreaterThan(Date value) {
            addCriterion("TPUD.REG_DT >", value, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtGreaterThanOrEqualTo(Date value) {
            addCriterion("TPUD.REG_DT >=", value, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtLessThan(Date value) {
            addCriterion("TPUD.REG_DT <", value, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtLessThanOrEqualTo(Date value) {
            addCriterion("TPUD.REG_DT <=", value, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtIn(List<Date> values) {
            addCriterion("TPUD.REG_DT in", values, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtNotIn(List<Date> values) {
            addCriterion("TPUD.REG_DT not in", values, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtBetween(Date value1, Date value2) {
            addCriterion("TPUD.REG_DT between", value1, value2, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtNotBetween(Date value1, Date value2) {
            addCriterion("TPUD.REG_DT not between", value1, value2, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegIdIsNull() {
            addCriterion("TPUD.REG_ID is null");
            return (Criteria) this;
        }

        public Criteria andRegIdIsNotNull() {
            addCriterion("TPUD.REG_ID is not null");
            return (Criteria) this;
        }

        public Criteria andRegIdEqualTo(String value) {
            addCriterion("TPUD.REG_ID =", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdNotEqualTo(String value) {
            addCriterion("TPUD.REG_ID <>", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdGreaterThan(String value) {
            addCriterion("TPUD.REG_ID >", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdGreaterThanOrEqualTo(String value) {
            addCriterion("TPUD.REG_ID >=", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdLessThan(String value) {
            addCriterion("TPUD.REG_ID <", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdLessThanOrEqualTo(String value) {
            addCriterion("TPUD.REG_ID <=", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdLike(String value) {
            addCriterion("TPUD.REG_ID like", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdNotLike(String value) {
            addCriterion("TPUD.REG_ID not like", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdIn(List<String> values) {
            addCriterion("TPUD.REG_ID in", values, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdNotIn(List<String> values) {
            addCriterion("TPUD.REG_ID not in", values, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdBetween(String value1, String value2) {
            addCriterion("TPUD.REG_ID between", value1, value2, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdNotBetween(String value1, String value2) {
            addCriterion("TPUD.REG_ID not between", value1, value2, "regId");
            return (Criteria) this;
        }

        public Criteria andModDtIsNull() {
            addCriterion("TPUD.MOD_DT is null");
            return (Criteria) this;
        }

        public Criteria andModDtIsNotNull() {
            addCriterion("TPUD.MOD_DT is not null");
            return (Criteria) this;
        }

        public Criteria andModDtEqualTo(Date value) {
            addCriterion("TPUD.MOD_DT =", value, "modDt");
            return (Criteria) this;
        }

        public Criteria andModDtNotEqualTo(Date value) {
            addCriterion("TPUD.MOD_DT <>", value, "modDt");
            return (Criteria) this;
        }

        public Criteria andModDtGreaterThan(Date value) {
            addCriterion("TPUD.MOD_DT >", value, "modDt");
            return (Criteria) this;
        }

        public Criteria andModDtGreaterThanOrEqualTo(Date value) {
            addCriterion("TPUD.MOD_DT >=", value, "modDt");
            return (Criteria) this;
        }

        public Criteria andModDtLessThan(Date value) {
            addCriterion("TPUD.MOD_DT <", value, "modDt");
            return (Criteria) this;
        }

        public Criteria andModDtLessThanOrEqualTo(Date value) {
            addCriterion("TPUD.MOD_DT <=", value, "modDt");
            return (Criteria) this;
        }

        public Criteria andModDtIn(List<Date> values) {
            addCriterion("TPUD.MOD_DT in", values, "modDt");
            return (Criteria) this;
        }

        public Criteria andModDtNotIn(List<Date> values) {
            addCriterion("TPUD.MOD_DT not in", values, "modDt");
            return (Criteria) this;
        }

        public Criteria andModDtBetween(Date value1, Date value2) {
            addCriterion("TPUD.MOD_DT between", value1, value2, "modDt");
            return (Criteria) this;
        }

        public Criteria andModDtNotBetween(Date value1, Date value2) {
            addCriterion("TPUD.MOD_DT not between", value1, value2, "modDt");
            return (Criteria) this;
        }

        public Criteria andModIdIsNull() {
            addCriterion("TPUD.MOD_ID is null");
            return (Criteria) this;
        }

        public Criteria andModIdIsNotNull() {
            addCriterion("TPUD.MOD_ID is not null");
            return (Criteria) this;
        }

        public Criteria andModIdEqualTo(String value) {
            addCriterion("TPUD.MOD_ID =", value, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdNotEqualTo(String value) {
            addCriterion("TPUD.MOD_ID <>", value, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdGreaterThan(String value) {
            addCriterion("TPUD.MOD_ID >", value, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdGreaterThanOrEqualTo(String value) {
            addCriterion("TPUD.MOD_ID >=", value, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdLessThan(String value) {
            addCriterion("TPUD.MOD_ID <", value, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdLessThanOrEqualTo(String value) {
            addCriterion("TPUD.MOD_ID <=", value, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdLike(String value) {
            addCriterion("TPUD.MOD_ID like", value, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdNotLike(String value) {
            addCriterion("TPUD.MOD_ID not like", value, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdIn(List<String> values) {
            addCriterion("TPUD.MOD_ID in", values, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdNotIn(List<String> values) {
            addCriterion("TPUD.MOD_ID not in", values, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdBetween(String value1, String value2) {
            addCriterion("TPUD.MOD_ID between", value1, value2, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdNotBetween(String value1, String value2) {
            addCriterion("TPUD.MOD_ID not between", value1, value2, "modId");
            return (Criteria) this;
        }

        public Criteria andRegIdLikeInsensitive(String value) {
            addCriterion("upper(TPUD.REG_ID) like", value.toUpperCase(), "regId");
            return (Criteria) this;
        }

        public Criteria andModIdLikeInsensitive(String value) {
            addCriterion("upper(TPUD.MOD_ID) like", value.toUpperCase(), "modId");
            return (Criteria) this;
        }

        public Criteria andRegIdLikeLeft(String value) {
            addCriterion("TPUD.REG_ID like ", "%" + value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdLikeRight(String value) {
            addCriterion("TPUD.REG_ID like ", value + "%", "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdLikeBoth(String value) {
            addCriterion("TPUD.REG_ID like ", "%" + value + "%", "regId");
            return (Criteria) this;
        }

        public Criteria andModIdLikeLeft(String value) {
            addCriterion("TPUD.MOD_ID like ", "%" + value, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdLikeRight(String value) {
            addCriterion("TPUD.MOD_ID like ", value + "%", "modId");
            return (Criteria) this;
        }

        public Criteria andModIdLikeBoth(String value) {
            addCriterion("TPUD.MOD_ID like ", "%" + value + "%", "modId");
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