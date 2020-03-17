package com.mushbird.sinsege.base.module.cs.model.entity.criteria;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class InquiryReplyEntityCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    public InquiryReplyEntityCriteria() {
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

        public Criteria andInqRplyIdIsNull() {
            addCriterion("TQR.INQ_RPLY_ID is null");
            return (Criteria) this;
        }

        public Criteria andInqRplyIdIsNotNull() {
            addCriterion("TQR.INQ_RPLY_ID is not null");
            return (Criteria) this;
        }

        public Criteria andInqRplyIdEqualTo(Integer value) {
            addCriterion("TQR.INQ_RPLY_ID =", value, "inqRplyId");
            return (Criteria) this;
        }

        public Criteria andInqRplyIdNotEqualTo(Integer value) {
            addCriterion("TQR.INQ_RPLY_ID <>", value, "inqRplyId");
            return (Criteria) this;
        }

        public Criteria andInqRplyIdGreaterThan(Integer value) {
            addCriterion("TQR.INQ_RPLY_ID >", value, "inqRplyId");
            return (Criteria) this;
        }

        public Criteria andInqRplyIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("TQR.INQ_RPLY_ID >=", value, "inqRplyId");
            return (Criteria) this;
        }

        public Criteria andInqRplyIdLessThan(Integer value) {
            addCriterion("TQR.INQ_RPLY_ID <", value, "inqRplyId");
            return (Criteria) this;
        }

        public Criteria andInqRplyIdLessThanOrEqualTo(Integer value) {
            addCriterion("TQR.INQ_RPLY_ID <=", value, "inqRplyId");
            return (Criteria) this;
        }

        public Criteria andInqRplyIdIn(List<Integer> values) {
            addCriterion("TQR.INQ_RPLY_ID in", values, "inqRplyId");
            return (Criteria) this;
        }

        public Criteria andInqRplyIdNotIn(List<Integer> values) {
            addCriterion("TQR.INQ_RPLY_ID not in", values, "inqRplyId");
            return (Criteria) this;
        }

        public Criteria andInqRplyIdBetween(Integer value1, Integer value2) {
            addCriterion("TQR.INQ_RPLY_ID between", value1, value2, "inqRplyId");
            return (Criteria) this;
        }

        public Criteria andInqRplyIdNotBetween(Integer value1, Integer value2) {
            addCriterion("TQR.INQ_RPLY_ID not between", value1, value2, "inqRplyId");
            return (Criteria) this;
        }

        public Criteria andInqIdIsNull() {
            addCriterion("TQR.INQ_ID is null");
            return (Criteria) this;
        }

        public Criteria andInqIdIsNotNull() {
            addCriterion("TQR.INQ_ID is not null");
            return (Criteria) this;
        }

        public Criteria andInqIdEqualTo(Integer value) {
            addCriterion("TQR.INQ_ID =", value, "inqId");
            return (Criteria) this;
        }

        public Criteria andInqIdNotEqualTo(Integer value) {
            addCriterion("TQR.INQ_ID <>", value, "inqId");
            return (Criteria) this;
        }

        public Criteria andInqIdGreaterThan(Integer value) {
            addCriterion("TQR.INQ_ID >", value, "inqId");
            return (Criteria) this;
        }

        public Criteria andInqIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("TQR.INQ_ID >=", value, "inqId");
            return (Criteria) this;
        }

        public Criteria andInqIdLessThan(Integer value) {
            addCriterion("TQR.INQ_ID <", value, "inqId");
            return (Criteria) this;
        }

        public Criteria andInqIdLessThanOrEqualTo(Integer value) {
            addCriterion("TQR.INQ_ID <=", value, "inqId");
            return (Criteria) this;
        }

        public Criteria andInqIdIn(List<Integer> values) {
            addCriterion("TQR.INQ_ID in", values, "inqId");
            return (Criteria) this;
        }

        public Criteria andInqIdNotIn(List<Integer> values) {
            addCriterion("TQR.INQ_ID not in", values, "inqId");
            return (Criteria) this;
        }

        public Criteria andInqIdBetween(Integer value1, Integer value2) {
            addCriterion("TQR.INQ_ID between", value1, value2, "inqId");
            return (Criteria) this;
        }

        public Criteria andInqIdNotBetween(Integer value1, Integer value2) {
            addCriterion("TQR.INQ_ID not between", value1, value2, "inqId");
            return (Criteria) this;
        }

        public Criteria andAdmIdIsNull() {
            addCriterion("TQR.ADM_ID is null");
            return (Criteria) this;
        }

        public Criteria andAdmIdIsNotNull() {
            addCriterion("TQR.ADM_ID is not null");
            return (Criteria) this;
        }

        public Criteria andAdmIdEqualTo(String value) {
            addCriterion("TQR.ADM_ID =", value, "admId");
            return (Criteria) this;
        }

        public Criteria andAdmIdNotEqualTo(String value) {
            addCriterion("TQR.ADM_ID <>", value, "admId");
            return (Criteria) this;
        }

        public Criteria andAdmIdGreaterThan(String value) {
            addCriterion("TQR.ADM_ID >", value, "admId");
            return (Criteria) this;
        }

        public Criteria andAdmIdGreaterThanOrEqualTo(String value) {
            addCriterion("TQR.ADM_ID >=", value, "admId");
            return (Criteria) this;
        }

        public Criteria andAdmIdLessThan(String value) {
            addCriterion("TQR.ADM_ID <", value, "admId");
            return (Criteria) this;
        }

        public Criteria andAdmIdLessThanOrEqualTo(String value) {
            addCriterion("TQR.ADM_ID <=", value, "admId");
            return (Criteria) this;
        }

        public Criteria andAdmIdLike(String value) {
            addCriterion("TQR.ADM_ID like", value, "admId");
            return (Criteria) this;
        }

        public Criteria andAdmIdNotLike(String value) {
            addCriterion("TQR.ADM_ID not like", value, "admId");
            return (Criteria) this;
        }

        public Criteria andAdmIdIn(List<String> values) {
            addCriterion("TQR.ADM_ID in", values, "admId");
            return (Criteria) this;
        }

        public Criteria andAdmIdNotIn(List<String> values) {
            addCriterion("TQR.ADM_ID not in", values, "admId");
            return (Criteria) this;
        }

        public Criteria andAdmIdBetween(String value1, String value2) {
            addCriterion("TQR.ADM_ID between", value1, value2, "admId");
            return (Criteria) this;
        }

        public Criteria andAdmIdNotBetween(String value1, String value2) {
            addCriterion("TQR.ADM_ID not between", value1, value2, "admId");
            return (Criteria) this;
        }

        public Criteria andContIsNull() {
            addCriterion("TQR.CONT is null");
            return (Criteria) this;
        }

        public Criteria andContIsNotNull() {
            addCriterion("TQR.CONT is not null");
            return (Criteria) this;
        }

        public Criteria andContEqualTo(String value) {
            addCriterion("TQR.CONT =", value, "cont");
            return (Criteria) this;
        }

        public Criteria andContNotEqualTo(String value) {
            addCriterion("TQR.CONT <>", value, "cont");
            return (Criteria) this;
        }

        public Criteria andContGreaterThan(String value) {
            addCriterion("TQR.CONT >", value, "cont");
            return (Criteria) this;
        }

        public Criteria andContGreaterThanOrEqualTo(String value) {
            addCriterion("TQR.CONT >=", value, "cont");
            return (Criteria) this;
        }

        public Criteria andContLessThan(String value) {
            addCriterion("TQR.CONT <", value, "cont");
            return (Criteria) this;
        }

        public Criteria andContLessThanOrEqualTo(String value) {
            addCriterion("TQR.CONT <=", value, "cont");
            return (Criteria) this;
        }

        public Criteria andContLike(String value) {
            addCriterion("TQR.CONT like", value, "cont");
            return (Criteria) this;
        }

        public Criteria andContNotLike(String value) {
            addCriterion("TQR.CONT not like", value, "cont");
            return (Criteria) this;
        }

        public Criteria andContIn(List<String> values) {
            addCriterion("TQR.CONT in", values, "cont");
            return (Criteria) this;
        }

        public Criteria andContNotIn(List<String> values) {
            addCriterion("TQR.CONT not in", values, "cont");
            return (Criteria) this;
        }

        public Criteria andContBetween(String value1, String value2) {
            addCriterion("TQR.CONT between", value1, value2, "cont");
            return (Criteria) this;
        }

        public Criteria andContNotBetween(String value1, String value2) {
            addCriterion("TQR.CONT not between", value1, value2, "cont");
            return (Criteria) this;
        }

        public Criteria andTempSaveYnIsNull() {
            addCriterion("TQR.TEMP_SAVE_YN is null");
            return (Criteria) this;
        }

        public Criteria andTempSaveYnIsNotNull() {
            addCriterion("TQR.TEMP_SAVE_YN is not null");
            return (Criteria) this;
        }

        public Criteria andTempSaveYnEqualTo(String value) {
            addCriterion("TQR.TEMP_SAVE_YN =", value, "tempSaveYn");
            return (Criteria) this;
        }

        public Criteria andTempSaveYnNotEqualTo(String value) {
            addCriterion("TQR.TEMP_SAVE_YN <>", value, "tempSaveYn");
            return (Criteria) this;
        }

        public Criteria andTempSaveYnGreaterThan(String value) {
            addCriterion("TQR.TEMP_SAVE_YN >", value, "tempSaveYn");
            return (Criteria) this;
        }

        public Criteria andTempSaveYnGreaterThanOrEqualTo(String value) {
            addCriterion("TQR.TEMP_SAVE_YN >=", value, "tempSaveYn");
            return (Criteria) this;
        }

        public Criteria andTempSaveYnLessThan(String value) {
            addCriterion("TQR.TEMP_SAVE_YN <", value, "tempSaveYn");
            return (Criteria) this;
        }

        public Criteria andTempSaveYnLessThanOrEqualTo(String value) {
            addCriterion("TQR.TEMP_SAVE_YN <=", value, "tempSaveYn");
            return (Criteria) this;
        }

        public Criteria andTempSaveYnLike(String value) {
            addCriterion("TQR.TEMP_SAVE_YN like", value, "tempSaveYn");
            return (Criteria) this;
        }

        public Criteria andTempSaveYnNotLike(String value) {
            addCriterion("TQR.TEMP_SAVE_YN not like", value, "tempSaveYn");
            return (Criteria) this;
        }

        public Criteria andTempSaveYnIn(List<String> values) {
            addCriterion("TQR.TEMP_SAVE_YN in", values, "tempSaveYn");
            return (Criteria) this;
        }

        public Criteria andTempSaveYnNotIn(List<String> values) {
            addCriterion("TQR.TEMP_SAVE_YN not in", values, "tempSaveYn");
            return (Criteria) this;
        }

        public Criteria andTempSaveYnBetween(String value1, String value2) {
            addCriterion("TQR.TEMP_SAVE_YN between", value1, value2, "tempSaveYn");
            return (Criteria) this;
        }

        public Criteria andTempSaveYnNotBetween(String value1, String value2) {
            addCriterion("TQR.TEMP_SAVE_YN not between", value1, value2, "tempSaveYn");
            return (Criteria) this;
        }

        public Criteria andAtchGidIsNull() {
            addCriterion("TQR.ATCH_GID is null");
            return (Criteria) this;
        }

        public Criteria andAtchGidIsNotNull() {
            addCriterion("TQR.ATCH_GID is not null");
            return (Criteria) this;
        }

        public Criteria andAtchGidEqualTo(Integer value) {
            addCriterion("TQR.ATCH_GID =", value, "atchGid");
            return (Criteria) this;
        }

        public Criteria andAtchGidNotEqualTo(Integer value) {
            addCriterion("TQR.ATCH_GID <>", value, "atchGid");
            return (Criteria) this;
        }

        public Criteria andAtchGidGreaterThan(Integer value) {
            addCriterion("TQR.ATCH_GID >", value, "atchGid");
            return (Criteria) this;
        }

        public Criteria andAtchGidGreaterThanOrEqualTo(Integer value) {
            addCriterion("TQR.ATCH_GID >=", value, "atchGid");
            return (Criteria) this;
        }

        public Criteria andAtchGidLessThan(Integer value) {
            addCriterion("TQR.ATCH_GID <", value, "atchGid");
            return (Criteria) this;
        }

        public Criteria andAtchGidLessThanOrEqualTo(Integer value) {
            addCriterion("TQR.ATCH_GID <=", value, "atchGid");
            return (Criteria) this;
        }

        public Criteria andAtchGidIn(List<Integer> values) {
            addCriterion("TQR.ATCH_GID in", values, "atchGid");
            return (Criteria) this;
        }

        public Criteria andAtchGidNotIn(List<Integer> values) {
            addCriterion("TQR.ATCH_GID not in", values, "atchGid");
            return (Criteria) this;
        }

        public Criteria andAtchGidBetween(Integer value1, Integer value2) {
            addCriterion("TQR.ATCH_GID between", value1, value2, "atchGid");
            return (Criteria) this;
        }

        public Criteria andAtchGidNotBetween(Integer value1, Integer value2) {
            addCriterion("TQR.ATCH_GID not between", value1, value2, "atchGid");
            return (Criteria) this;
        }

        public Criteria andRegDtIsNull() {
            addCriterion("TQR.REG_DT is null");
            return (Criteria) this;
        }

        public Criteria andRegDtIsNotNull() {
            addCriterion("TQR.REG_DT is not null");
            return (Criteria) this;
        }

        public Criteria andRegDtEqualTo(Date value) {
            addCriterion("TQR.REG_DT =", value, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtNotEqualTo(Date value) {
            addCriterion("TQR.REG_DT <>", value, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtGreaterThan(Date value) {
            addCriterion("TQR.REG_DT >", value, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtGreaterThanOrEqualTo(Date value) {
            addCriterion("TQR.REG_DT >=", value, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtLessThan(Date value) {
            addCriterion("TQR.REG_DT <", value, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtLessThanOrEqualTo(Date value) {
            addCriterion("TQR.REG_DT <=", value, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtIn(List<Date> values) {
            addCriterion("TQR.REG_DT in", values, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtNotIn(List<Date> values) {
            addCriterion("TQR.REG_DT not in", values, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtBetween(Date value1, Date value2) {
            addCriterion("TQR.REG_DT between", value1, value2, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtNotBetween(Date value1, Date value2) {
            addCriterion("TQR.REG_DT not between", value1, value2, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegIdIsNull() {
            addCriterion("TQR.REG_ID is null");
            return (Criteria) this;
        }

        public Criteria andRegIdIsNotNull() {
            addCriterion("TQR.REG_ID is not null");
            return (Criteria) this;
        }

        public Criteria andRegIdEqualTo(String value) {
            addCriterion("TQR.REG_ID =", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdNotEqualTo(String value) {
            addCriterion("TQR.REG_ID <>", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdGreaterThan(String value) {
            addCriterion("TQR.REG_ID >", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdGreaterThanOrEqualTo(String value) {
            addCriterion("TQR.REG_ID >=", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdLessThan(String value) {
            addCriterion("TQR.REG_ID <", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdLessThanOrEqualTo(String value) {
            addCriterion("TQR.REG_ID <=", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdLike(String value) {
            addCriterion("TQR.REG_ID like", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdNotLike(String value) {
            addCriterion("TQR.REG_ID not like", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdIn(List<String> values) {
            addCriterion("TQR.REG_ID in", values, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdNotIn(List<String> values) {
            addCriterion("TQR.REG_ID not in", values, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdBetween(String value1, String value2) {
            addCriterion("TQR.REG_ID between", value1, value2, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdNotBetween(String value1, String value2) {
            addCriterion("TQR.REG_ID not between", value1, value2, "regId");
            return (Criteria) this;
        }

        public Criteria andModDtIsNull() {
            addCriterion("TQR.MOD_DT is null");
            return (Criteria) this;
        }

        public Criteria andModDtIsNotNull() {
            addCriterion("TQR.MOD_DT is not null");
            return (Criteria) this;
        }

        public Criteria andModDtEqualTo(Date value) {
            addCriterion("TQR.MOD_DT =", value, "modDt");
            return (Criteria) this;
        }

        public Criteria andModDtNotEqualTo(Date value) {
            addCriterion("TQR.MOD_DT <>", value, "modDt");
            return (Criteria) this;
        }

        public Criteria andModDtGreaterThan(Date value) {
            addCriterion("TQR.MOD_DT >", value, "modDt");
            return (Criteria) this;
        }

        public Criteria andModDtGreaterThanOrEqualTo(Date value) {
            addCriterion("TQR.MOD_DT >=", value, "modDt");
            return (Criteria) this;
        }

        public Criteria andModDtLessThan(Date value) {
            addCriterion("TQR.MOD_DT <", value, "modDt");
            return (Criteria) this;
        }

        public Criteria andModDtLessThanOrEqualTo(Date value) {
            addCriterion("TQR.MOD_DT <=", value, "modDt");
            return (Criteria) this;
        }

        public Criteria andModDtIn(List<Date> values) {
            addCriterion("TQR.MOD_DT in", values, "modDt");
            return (Criteria) this;
        }

        public Criteria andModDtNotIn(List<Date> values) {
            addCriterion("TQR.MOD_DT not in", values, "modDt");
            return (Criteria) this;
        }

        public Criteria andModDtBetween(Date value1, Date value2) {
            addCriterion("TQR.MOD_DT between", value1, value2, "modDt");
            return (Criteria) this;
        }

        public Criteria andModDtNotBetween(Date value1, Date value2) {
            addCriterion("TQR.MOD_DT not between", value1, value2, "modDt");
            return (Criteria) this;
        }

        public Criteria andModIdIsNull() {
            addCriterion("TQR.MOD_ID is null");
            return (Criteria) this;
        }

        public Criteria andModIdIsNotNull() {
            addCriterion("TQR.MOD_ID is not null");
            return (Criteria) this;
        }

        public Criteria andModIdEqualTo(String value) {
            addCriterion("TQR.MOD_ID =", value, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdNotEqualTo(String value) {
            addCriterion("TQR.MOD_ID <>", value, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdGreaterThan(String value) {
            addCriterion("TQR.MOD_ID >", value, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdGreaterThanOrEqualTo(String value) {
            addCriterion("TQR.MOD_ID >=", value, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdLessThan(String value) {
            addCriterion("TQR.MOD_ID <", value, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdLessThanOrEqualTo(String value) {
            addCriterion("TQR.MOD_ID <=", value, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdLike(String value) {
            addCriterion("TQR.MOD_ID like", value, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdNotLike(String value) {
            addCriterion("TQR.MOD_ID not like", value, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdIn(List<String> values) {
            addCriterion("TQR.MOD_ID in", values, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdNotIn(List<String> values) {
            addCriterion("TQR.MOD_ID not in", values, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdBetween(String value1, String value2) {
            addCriterion("TQR.MOD_ID between", value1, value2, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdNotBetween(String value1, String value2) {
            addCriterion("TQR.MOD_ID not between", value1, value2, "modId");
            return (Criteria) this;
        }

        public Criteria andUseYnIsNull() {
            addCriterion("TQR.USE_YN is null");
            return (Criteria) this;
        }

        public Criteria andUseYnIsNotNull() {
            addCriterion("TQR.USE_YN is not null");
            return (Criteria) this;
        }

        public Criteria andUseYnEqualTo(String value) {
            addCriterion("TQR.USE_YN =", value, "useYn");
            return (Criteria) this;
        }

        public Criteria andUseYnNotEqualTo(String value) {
            addCriterion("TQR.USE_YN <>", value, "useYn");
            return (Criteria) this;
        }

        public Criteria andUseYnGreaterThan(String value) {
            addCriterion("TQR.USE_YN >", value, "useYn");
            return (Criteria) this;
        }

        public Criteria andUseYnGreaterThanOrEqualTo(String value) {
            addCriterion("TQR.USE_YN >=", value, "useYn");
            return (Criteria) this;
        }

        public Criteria andUseYnLessThan(String value) {
            addCriterion("TQR.USE_YN <", value, "useYn");
            return (Criteria) this;
        }

        public Criteria andUseYnLessThanOrEqualTo(String value) {
            addCriterion("TQR.USE_YN <=", value, "useYn");
            return (Criteria) this;
        }

        public Criteria andUseYnLike(String value) {
            addCriterion("TQR.USE_YN like", value, "useYn");
            return (Criteria) this;
        }

        public Criteria andUseYnNotLike(String value) {
            addCriterion("TQR.USE_YN not like", value, "useYn");
            return (Criteria) this;
        }

        public Criteria andUseYnIn(List<String> values) {
            addCriterion("TQR.USE_YN in", values, "useYn");
            return (Criteria) this;
        }

        public Criteria andUseYnNotIn(List<String> values) {
            addCriterion("TQR.USE_YN not in", values, "useYn");
            return (Criteria) this;
        }

        public Criteria andUseYnBetween(String value1, String value2) {
            addCriterion("TQR.USE_YN between", value1, value2, "useYn");
            return (Criteria) this;
        }

        public Criteria andUseYnNotBetween(String value1, String value2) {
            addCriterion("TQR.USE_YN not between", value1, value2, "useYn");
            return (Criteria) this;
        }

        public Criteria andAdmIdLikeInsensitive(String value) {
            addCriterion("upper(TQR.ADM_ID) like", value.toUpperCase(), "admId");
            return (Criteria) this;
        }

        public Criteria andContLikeInsensitive(String value) {
            addCriterion("upper(TQR.CONT) like", value.toUpperCase(), "cont");
            return (Criteria) this;
        }

        public Criteria andTempSaveYnLikeInsensitive(String value) {
            addCriterion("upper(TQR.TEMP_SAVE_YN) like", value.toUpperCase(), "tempSaveYn");
            return (Criteria) this;
        }

        public Criteria andRegIdLikeInsensitive(String value) {
            addCriterion("upper(TQR.REG_ID) like", value.toUpperCase(), "regId");
            return (Criteria) this;
        }

        public Criteria andModIdLikeInsensitive(String value) {
            addCriterion("upper(TQR.MOD_ID) like", value.toUpperCase(), "modId");
            return (Criteria) this;
        }

        public Criteria andUseYnLikeInsensitive(String value) {
            addCriterion("upper(TQR.USE_YN) like", value.toUpperCase(), "useYn");
            return (Criteria) this;
        }

        public Criteria andAdmIdLikeLeft(String value) {
            addCriterion("TQR.ADM_ID like ", "%" + value, "admId");
            return (Criteria) this;
        }

        public Criteria andAdmIdLikeRight(String value) {
            addCriterion("TQR.ADM_ID like ", value + "%", "admId");
            return (Criteria) this;
        }

        public Criteria andAdmIdLikeBoth(String value) {
            addCriterion("TQR.ADM_ID like ", "%" + value + "%", "admId");
            return (Criteria) this;
        }

        public Criteria andContLikeLeft(String value) {
            addCriterion("TQR.CONT like ", "%" + value, "cont");
            return (Criteria) this;
        }

        public Criteria andContLikeRight(String value) {
            addCriterion("TQR.CONT like ", value + "%", "cont");
            return (Criteria) this;
        }

        public Criteria andContLikeBoth(String value) {
            addCriterion("TQR.CONT like ", "%" + value + "%", "cont");
            return (Criteria) this;
        }

        public Criteria andTempSaveYnLikeLeft(String value) {
            addCriterion("TQR.TEMP_SAVE_YN like ", "%" + value, "tempSaveYn");
            return (Criteria) this;
        }

        public Criteria andTempSaveYnLikeRight(String value) {
            addCriterion("TQR.TEMP_SAVE_YN like ", value + "%", "tempSaveYn");
            return (Criteria) this;
        }

        public Criteria andTempSaveYnLikeBoth(String value) {
            addCriterion("TQR.TEMP_SAVE_YN like ", "%" + value + "%", "tempSaveYn");
            return (Criteria) this;
        }

        public Criteria andRegIdLikeLeft(String value) {
            addCriterion("TQR.REG_ID like ", "%" + value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdLikeRight(String value) {
            addCriterion("TQR.REG_ID like ", value + "%", "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdLikeBoth(String value) {
            addCriterion("TQR.REG_ID like ", "%" + value + "%", "regId");
            return (Criteria) this;
        }

        public Criteria andModIdLikeLeft(String value) {
            addCriterion("TQR.MOD_ID like ", "%" + value, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdLikeRight(String value) {
            addCriterion("TQR.MOD_ID like ", value + "%", "modId");
            return (Criteria) this;
        }

        public Criteria andModIdLikeBoth(String value) {
            addCriterion("TQR.MOD_ID like ", "%" + value + "%", "modId");
            return (Criteria) this;
        }

        public Criteria andUseYnLikeLeft(String value) {
            addCriterion("TQR.USE_YN like ", "%" + value, "useYn");
            return (Criteria) this;
        }

        public Criteria andUseYnLikeRight(String value) {
            addCriterion("TQR.USE_YN like ", value + "%", "useYn");
            return (Criteria) this;
        }

        public Criteria andUseYnLikeBoth(String value) {
            addCriterion("TQR.USE_YN like ", "%" + value + "%", "useYn");
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