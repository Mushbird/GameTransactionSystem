package com.mushbird.sinsege.base.module.cs.model.entity.criteria;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class InquiryEntityCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    public InquiryEntityCriteria() {
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

        public Criteria andInqIdIsNull() {
            addCriterion("TQ.INQ_ID is null");
            return (Criteria) this;
        }

        public Criteria andInqIdIsNotNull() {
            addCriterion("TQ.INQ_ID is not null");
            return (Criteria) this;
        }

        public Criteria andInqIdEqualTo(Integer value) {
            addCriterion("TQ.INQ_ID =", value, "inqId");
            return (Criteria) this;
        }

        public Criteria andInqIdNotEqualTo(Integer value) {
            addCriterion("TQ.INQ_ID <>", value, "inqId");
            return (Criteria) this;
        }

        public Criteria andInqIdGreaterThan(Integer value) {
            addCriterion("TQ.INQ_ID >", value, "inqId");
            return (Criteria) this;
        }

        public Criteria andInqIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("TQ.INQ_ID >=", value, "inqId");
            return (Criteria) this;
        }

        public Criteria andInqIdLessThan(Integer value) {
            addCriterion("TQ.INQ_ID <", value, "inqId");
            return (Criteria) this;
        }

        public Criteria andInqIdLessThanOrEqualTo(Integer value) {
            addCriterion("TQ.INQ_ID <=", value, "inqId");
            return (Criteria) this;
        }

        public Criteria andInqIdIn(List<Integer> values) {
            addCriterion("TQ.INQ_ID in", values, "inqId");
            return (Criteria) this;
        }

        public Criteria andInqIdNotIn(List<Integer> values) {
            addCriterion("TQ.INQ_ID not in", values, "inqId");
            return (Criteria) this;
        }

        public Criteria andInqIdBetween(Integer value1, Integer value2) {
            addCriterion("TQ.INQ_ID between", value1, value2, "inqId");
            return (Criteria) this;
        }

        public Criteria andInqIdNotBetween(Integer value1, Integer value2) {
            addCriterion("TQ.INQ_ID not between", value1, value2, "inqId");
            return (Criteria) this;
        }

        public Criteria andInqTpCdIsNull() {
            addCriterion("TQ.INQ_TP_CD is null");
            return (Criteria) this;
        }

        public Criteria andInqTpCdIsNotNull() {
            addCriterion("TQ.INQ_TP_CD is not null");
            return (Criteria) this;
        }

        public Criteria andInqTpCdEqualTo(String value) {
            addCriterion("TQ.INQ_TP_CD =", value, "inqTpCd");
            return (Criteria) this;
        }

        public Criteria andInqTpCdNotEqualTo(String value) {
            addCriterion("TQ.INQ_TP_CD <>", value, "inqTpCd");
            return (Criteria) this;
        }

        public Criteria andInqTpCdGreaterThan(String value) {
            addCriterion("TQ.INQ_TP_CD >", value, "inqTpCd");
            return (Criteria) this;
        }

        public Criteria andInqTpCdGreaterThanOrEqualTo(String value) {
            addCriterion("TQ.INQ_TP_CD >=", value, "inqTpCd");
            return (Criteria) this;
        }

        public Criteria andInqTpCdLessThan(String value) {
            addCriterion("TQ.INQ_TP_CD <", value, "inqTpCd");
            return (Criteria) this;
        }

        public Criteria andInqTpCdLessThanOrEqualTo(String value) {
            addCriterion("TQ.INQ_TP_CD <=", value, "inqTpCd");
            return (Criteria) this;
        }

        public Criteria andInqTpCdLike(String value) {
            addCriterion("TQ.INQ_TP_CD like", value, "inqTpCd");
            return (Criteria) this;
        }

        public Criteria andInqTpCdNotLike(String value) {
            addCriterion("TQ.INQ_TP_CD not like", value, "inqTpCd");
            return (Criteria) this;
        }

        public Criteria andInqTpCdIn(List<String> values) {
            addCriterion("TQ.INQ_TP_CD in", values, "inqTpCd");
            return (Criteria) this;
        }

        public Criteria andInqTpCdNotIn(List<String> values) {
            addCriterion("TQ.INQ_TP_CD not in", values, "inqTpCd");
            return (Criteria) this;
        }

        public Criteria andInqTpCdBetween(String value1, String value2) {
            addCriterion("TQ.INQ_TP_CD between", value1, value2, "inqTpCd");
            return (Criteria) this;
        }

        public Criteria andInqTpCdNotBetween(String value1, String value2) {
            addCriterion("TQ.INQ_TP_CD not between", value1, value2, "inqTpCd");
            return (Criteria) this;
        }

        public Criteria andInqStatCdIsNull() {
            addCriterion("TQ.INQ_STAT_CD is null");
            return (Criteria) this;
        }

        public Criteria andInqStatCdIsNotNull() {
            addCriterion("TQ.INQ_STAT_CD is not null");
            return (Criteria) this;
        }

        public Criteria andInqStatCdEqualTo(String value) {
            addCriterion("TQ.INQ_STAT_CD =", value, "inqStatCd");
            return (Criteria) this;
        }

        public Criteria andInqStatCdNotEqualTo(String value) {
            addCriterion("TQ.INQ_STAT_CD <>", value, "inqStatCd");
            return (Criteria) this;
        }

        public Criteria andInqStatCdGreaterThan(String value) {
            addCriterion("TQ.INQ_STAT_CD >", value, "inqStatCd");
            return (Criteria) this;
        }

        public Criteria andInqStatCdGreaterThanOrEqualTo(String value) {
            addCriterion("TQ.INQ_STAT_CD >=", value, "inqStatCd");
            return (Criteria) this;
        }

        public Criteria andInqStatCdLessThan(String value) {
            addCriterion("TQ.INQ_STAT_CD <", value, "inqStatCd");
            return (Criteria) this;
        }

        public Criteria andInqStatCdLessThanOrEqualTo(String value) {
            addCriterion("TQ.INQ_STAT_CD <=", value, "inqStatCd");
            return (Criteria) this;
        }

        public Criteria andInqStatCdLike(String value) {
            addCriterion("TQ.INQ_STAT_CD like", value, "inqStatCd");
            return (Criteria) this;
        }

        public Criteria andInqStatCdNotLike(String value) {
            addCriterion("TQ.INQ_STAT_CD not like", value, "inqStatCd");
            return (Criteria) this;
        }

        public Criteria andInqStatCdIn(List<String> values) {
            addCriterion("TQ.INQ_STAT_CD in", values, "inqStatCd");
            return (Criteria) this;
        }

        public Criteria andInqStatCdNotIn(List<String> values) {
            addCriterion("TQ.INQ_STAT_CD not in", values, "inqStatCd");
            return (Criteria) this;
        }

        public Criteria andInqStatCdBetween(String value1, String value2) {
            addCriterion("TQ.INQ_STAT_CD between", value1, value2, "inqStatCd");
            return (Criteria) this;
        }

        public Criteria andInqStatCdNotBetween(String value1, String value2) {
            addCriterion("TQ.INQ_STAT_CD not between", value1, value2, "inqStatCd");
            return (Criteria) this;
        }

        public Criteria andInqClCdIsNull() {
            addCriterion("TQ.INQ_CL_CD is null");
            return (Criteria) this;
        }

        public Criteria andInqClCdIsNotNull() {
            addCriterion("TQ.INQ_CL_CD is not null");
            return (Criteria) this;
        }

        public Criteria andInqClCdEqualTo(String value) {
            addCriterion("TQ.INQ_CL_CD =", value, "inqClCd");
            return (Criteria) this;
        }

        public Criteria andInqClCdNotEqualTo(String value) {
            addCriterion("TQ.INQ_CL_CD <>", value, "inqClCd");
            return (Criteria) this;
        }

        public Criteria andInqClCdGreaterThan(String value) {
            addCriterion("TQ.INQ_CL_CD >", value, "inqClCd");
            return (Criteria) this;
        }

        public Criteria andInqClCdGreaterThanOrEqualTo(String value) {
            addCriterion("TQ.INQ_CL_CD >=", value, "inqClCd");
            return (Criteria) this;
        }

        public Criteria andInqClCdLessThan(String value) {
            addCriterion("TQ.INQ_CL_CD <", value, "inqClCd");
            return (Criteria) this;
        }

        public Criteria andInqClCdLessThanOrEqualTo(String value) {
            addCriterion("TQ.INQ_CL_CD <=", value, "inqClCd");
            return (Criteria) this;
        }

        public Criteria andInqClCdLike(String value) {
            addCriterion("TQ.INQ_CL_CD like", value, "inqClCd");
            return (Criteria) this;
        }

        public Criteria andInqClCdNotLike(String value) {
            addCriterion("TQ.INQ_CL_CD not like", value, "inqClCd");
            return (Criteria) this;
        }

        public Criteria andInqClCdIn(List<String> values) {
            addCriterion("TQ.INQ_CL_CD in", values, "inqClCd");
            return (Criteria) this;
        }

        public Criteria andInqClCdNotIn(List<String> values) {
            addCriterion("TQ.INQ_CL_CD not in", values, "inqClCd");
            return (Criteria) this;
        }

        public Criteria andInqClCdBetween(String value1, String value2) {
            addCriterion("TQ.INQ_CL_CD between", value1, value2, "inqClCd");
            return (Criteria) this;
        }

        public Criteria andInqClCdNotBetween(String value1, String value2) {
            addCriterion("TQ.INQ_CL_CD not between", value1, value2, "inqClCd");
            return (Criteria) this;
        }

        public Criteria andInqClDtlCdIsNull() {
            addCriterion("TQ.INQ_CL_DTL_CD is null");
            return (Criteria) this;
        }

        public Criteria andInqClDtlCdIsNotNull() {
            addCriterion("TQ.INQ_CL_DTL_CD is not null");
            return (Criteria) this;
        }

        public Criteria andInqClDtlCdEqualTo(String value) {
            addCriterion("TQ.INQ_CL_DTL_CD =", value, "inqClDtlCd");
            return (Criteria) this;
        }

        public Criteria andInqClDtlCdNotEqualTo(String value) {
            addCriterion("TQ.INQ_CL_DTL_CD <>", value, "inqClDtlCd");
            return (Criteria) this;
        }

        public Criteria andInqClDtlCdGreaterThan(String value) {
            addCriterion("TQ.INQ_CL_DTL_CD >", value, "inqClDtlCd");
            return (Criteria) this;
        }

        public Criteria andInqClDtlCdGreaterThanOrEqualTo(String value) {
            addCriterion("TQ.INQ_CL_DTL_CD >=", value, "inqClDtlCd");
            return (Criteria) this;
        }

        public Criteria andInqClDtlCdLessThan(String value) {
            addCriterion("TQ.INQ_CL_DTL_CD <", value, "inqClDtlCd");
            return (Criteria) this;
        }

        public Criteria andInqClDtlCdLessThanOrEqualTo(String value) {
            addCriterion("TQ.INQ_CL_DTL_CD <=", value, "inqClDtlCd");
            return (Criteria) this;
        }

        public Criteria andInqClDtlCdLike(String value) {
            addCriterion("TQ.INQ_CL_DTL_CD like", value, "inqClDtlCd");
            return (Criteria) this;
        }

        public Criteria andInqClDtlCdNotLike(String value) {
            addCriterion("TQ.INQ_CL_DTL_CD not like", value, "inqClDtlCd");
            return (Criteria) this;
        }

        public Criteria andInqClDtlCdIn(List<String> values) {
            addCriterion("TQ.INQ_CL_DTL_CD in", values, "inqClDtlCd");
            return (Criteria) this;
        }

        public Criteria andInqClDtlCdNotIn(List<String> values) {
            addCriterion("TQ.INQ_CL_DTL_CD not in", values, "inqClDtlCd");
            return (Criteria) this;
        }

        public Criteria andInqClDtlCdBetween(String value1, String value2) {
            addCriterion("TQ.INQ_CL_DTL_CD between", value1, value2, "inqClDtlCd");
            return (Criteria) this;
        }

        public Criteria andInqClDtlCdNotBetween(String value1, String value2) {
            addCriterion("TQ.INQ_CL_DTL_CD not between", value1, value2, "inqClDtlCd");
            return (Criteria) this;
        }

        public Criteria andRmkIdIsNull() {
            addCriterion("TQ.RMK_ID is null");
            return (Criteria) this;
        }

        public Criteria andRmkIdIsNotNull() {
            addCriterion("TQ.RMK_ID is not null");
            return (Criteria) this;
        }

        public Criteria andRmkIdEqualTo(Integer value) {
            addCriterion("TQ.RMK_ID =", value, "rmkId");
            return (Criteria) this;
        }

        public Criteria andRmkIdNotEqualTo(Integer value) {
            addCriterion("TQ.RMK_ID <>", value, "rmkId");
            return (Criteria) this;
        }

        public Criteria andRmkIdGreaterThan(Integer value) {
            addCriterion("TQ.RMK_ID >", value, "rmkId");
            return (Criteria) this;
        }

        public Criteria andRmkIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("TQ.RMK_ID >=", value, "rmkId");
            return (Criteria) this;
        }

        public Criteria andRmkIdLessThan(Integer value) {
            addCriterion("TQ.RMK_ID <", value, "rmkId");
            return (Criteria) this;
        }

        public Criteria andRmkIdLessThanOrEqualTo(Integer value) {
            addCriterion("TQ.RMK_ID <=", value, "rmkId");
            return (Criteria) this;
        }

        public Criteria andRmkIdIn(List<Integer> values) {
            addCriterion("TQ.RMK_ID in", values, "rmkId");
            return (Criteria) this;
        }

        public Criteria andRmkIdNotIn(List<Integer> values) {
            addCriterion("TQ.RMK_ID not in", values, "rmkId");
            return (Criteria) this;
        }

        public Criteria andRmkIdBetween(Integer value1, Integer value2) {
            addCriterion("TQ.RMK_ID between", value1, value2, "rmkId");
            return (Criteria) this;
        }

        public Criteria andRmkIdNotBetween(Integer value1, Integer value2) {
            addCriterion("TQ.RMK_ID not between", value1, value2, "rmkId");
            return (Criteria) this;
        }

        public Criteria andMbrYnIsNull() {
            addCriterion("TQ.MBR_YN is null");
            return (Criteria) this;
        }

        public Criteria andMbrYnIsNotNull() {
            addCriterion("TQ.MBR_YN is not null");
            return (Criteria) this;
        }

        public Criteria andMbrYnEqualTo(String value) {
            addCriterion("TQ.MBR_YN =", value, "mbrYn");
            return (Criteria) this;
        }

        public Criteria andMbrYnNotEqualTo(String value) {
            addCriterion("TQ.MBR_YN <>", value, "mbrYn");
            return (Criteria) this;
        }

        public Criteria andMbrYnGreaterThan(String value) {
            addCriterion("TQ.MBR_YN >", value, "mbrYn");
            return (Criteria) this;
        }

        public Criteria andMbrYnGreaterThanOrEqualTo(String value) {
            addCriterion("TQ.MBR_YN >=", value, "mbrYn");
            return (Criteria) this;
        }

        public Criteria andMbrYnLessThan(String value) {
            addCriterion("TQ.MBR_YN <", value, "mbrYn");
            return (Criteria) this;
        }

        public Criteria andMbrYnLessThanOrEqualTo(String value) {
            addCriterion("TQ.MBR_YN <=", value, "mbrYn");
            return (Criteria) this;
        }

        public Criteria andMbrYnLike(String value) {
            addCriterion("TQ.MBR_YN like", value, "mbrYn");
            return (Criteria) this;
        }

        public Criteria andMbrYnNotLike(String value) {
            addCriterion("TQ.MBR_YN not like", value, "mbrYn");
            return (Criteria) this;
        }

        public Criteria andMbrYnIn(List<String> values) {
            addCriterion("TQ.MBR_YN in", values, "mbrYn");
            return (Criteria) this;
        }

        public Criteria andMbrYnNotIn(List<String> values) {
            addCriterion("TQ.MBR_YN not in", values, "mbrYn");
            return (Criteria) this;
        }

        public Criteria andMbrYnBetween(String value1, String value2) {
            addCriterion("TQ.MBR_YN between", value1, value2, "mbrYn");
            return (Criteria) this;
        }

        public Criteria andMbrYnNotBetween(String value1, String value2) {
            addCriterion("TQ.MBR_YN not between", value1, value2, "mbrYn");
            return (Criteria) this;
        }

        public Criteria andMbrIdIsNull() {
            addCriterion("TQ.MBR_ID is null");
            return (Criteria) this;
        }

        public Criteria andMbrIdIsNotNull() {
            addCriterion("TQ.MBR_ID is not null");
            return (Criteria) this;
        }

        public Criteria andMbrIdEqualTo(String value) {
            addCriterion("TQ.MBR_ID =", value, "mbrId");
            return (Criteria) this;
        }

        public Criteria andMbrIdNotEqualTo(String value) {
            addCriterion("TQ.MBR_ID <>", value, "mbrId");
            return (Criteria) this;
        }

        public Criteria andMbrIdGreaterThan(String value) {
            addCriterion("TQ.MBR_ID >", value, "mbrId");
            return (Criteria) this;
        }

        public Criteria andMbrIdGreaterThanOrEqualTo(String value) {
            addCriterion("TQ.MBR_ID >=", value, "mbrId");
            return (Criteria) this;
        }

        public Criteria andMbrIdLessThan(String value) {
            addCriterion("TQ.MBR_ID <", value, "mbrId");
            return (Criteria) this;
        }

        public Criteria andMbrIdLessThanOrEqualTo(String value) {
            addCriterion("TQ.MBR_ID <=", value, "mbrId");
            return (Criteria) this;
        }

        public Criteria andMbrIdLike(String value) {
            addCriterion("TQ.MBR_ID like", value, "mbrId");
            return (Criteria) this;
        }

        public Criteria andMbrIdNotLike(String value) {
            addCriterion("TQ.MBR_ID not like", value, "mbrId");
            return (Criteria) this;
        }

        public Criteria andMbrIdIn(List<String> values) {
            addCriterion("TQ.MBR_ID in", values, "mbrId");
            return (Criteria) this;
        }

        public Criteria andMbrIdNotIn(List<String> values) {
            addCriterion("TQ.MBR_ID not in", values, "mbrId");
            return (Criteria) this;
        }

        public Criteria andMbrIdBetween(String value1, String value2) {
            addCriterion("TQ.MBR_ID between", value1, value2, "mbrId");
            return (Criteria) this;
        }

        public Criteria andMbrIdNotBetween(String value1, String value2) {
            addCriterion("TQ.MBR_ID not between", value1, value2, "mbrId");
            return (Criteria) this;
        }

        public Criteria andWrtrIdValIsNull() {
            addCriterion("TQ.WRTR_ID_VAL is null");
            return (Criteria) this;
        }

        public Criteria andWrtrIdValIsNotNull() {
            addCriterion("TQ.WRTR_ID_VAL is not null");
            return (Criteria) this;
        }

        public Criteria andWrtrIdValEqualTo(String value) {
            addCriterion("TQ.WRTR_ID_VAL =", value, "wrtrIdVal");
            return (Criteria) this;
        }

        public Criteria andWrtrIdValNotEqualTo(String value) {
            addCriterion("TQ.WRTR_ID_VAL <>", value, "wrtrIdVal");
            return (Criteria) this;
        }

        public Criteria andWrtrIdValGreaterThan(String value) {
            addCriterion("TQ.WRTR_ID_VAL >", value, "wrtrIdVal");
            return (Criteria) this;
        }

        public Criteria andWrtrIdValGreaterThanOrEqualTo(String value) {
            addCriterion("TQ.WRTR_ID_VAL >=", value, "wrtrIdVal");
            return (Criteria) this;
        }

        public Criteria andWrtrIdValLessThan(String value) {
            addCriterion("TQ.WRTR_ID_VAL <", value, "wrtrIdVal");
            return (Criteria) this;
        }

        public Criteria andWrtrIdValLessThanOrEqualTo(String value) {
            addCriterion("TQ.WRTR_ID_VAL <=", value, "wrtrIdVal");
            return (Criteria) this;
        }

        public Criteria andWrtrIdValLike(String value) {
            addCriterion("TQ.WRTR_ID_VAL like", value, "wrtrIdVal");
            return (Criteria) this;
        }

        public Criteria andWrtrIdValNotLike(String value) {
            addCriterion("TQ.WRTR_ID_VAL not like", value, "wrtrIdVal");
            return (Criteria) this;
        }

        public Criteria andWrtrIdValIn(List<String> values) {
            addCriterion("TQ.WRTR_ID_VAL in", values, "wrtrIdVal");
            return (Criteria) this;
        }

        public Criteria andWrtrIdValNotIn(List<String> values) {
            addCriterion("TQ.WRTR_ID_VAL not in", values, "wrtrIdVal");
            return (Criteria) this;
        }

        public Criteria andWrtrIdValBetween(String value1, String value2) {
            addCriterion("TQ.WRTR_ID_VAL between", value1, value2, "wrtrIdVal");
            return (Criteria) this;
        }

        public Criteria andWrtrIdValNotBetween(String value1, String value2) {
            addCriterion("TQ.WRTR_ID_VAL not between", value1, value2, "wrtrIdVal");
            return (Criteria) this;
        }

        public Criteria andWrtrNmIsNull() {
            addCriterion("TQ.WRTR_NM is null");
            return (Criteria) this;
        }

        public Criteria andWrtrNmIsNotNull() {
            addCriterion("TQ.WRTR_NM is not null");
            return (Criteria) this;
        }

        public Criteria andWrtrNmEqualTo(String value) {
            addCriterion("TQ.WRTR_NM =", value, "wrtrNm");
            return (Criteria) this;
        }

        public Criteria andWrtrNmNotEqualTo(String value) {
            addCriterion("TQ.WRTR_NM <>", value, "wrtrNm");
            return (Criteria) this;
        }

        public Criteria andWrtrNmGreaterThan(String value) {
            addCriterion("TQ.WRTR_NM >", value, "wrtrNm");
            return (Criteria) this;
        }

        public Criteria andWrtrNmGreaterThanOrEqualTo(String value) {
            addCriterion("TQ.WRTR_NM >=", value, "wrtrNm");
            return (Criteria) this;
        }

        public Criteria andWrtrNmLessThan(String value) {
            addCriterion("TQ.WRTR_NM <", value, "wrtrNm");
            return (Criteria) this;
        }

        public Criteria andWrtrNmLessThanOrEqualTo(String value) {
            addCriterion("TQ.WRTR_NM <=", value, "wrtrNm");
            return (Criteria) this;
        }

        public Criteria andWrtrNmLike(String value) {
            addCriterion("TQ.WRTR_NM like", value, "wrtrNm");
            return (Criteria) this;
        }

        public Criteria andWrtrNmNotLike(String value) {
            addCriterion("TQ.WRTR_NM not like", value, "wrtrNm");
            return (Criteria) this;
        }

        public Criteria andWrtrNmIn(List<String> values) {
            addCriterion("TQ.WRTR_NM in", values, "wrtrNm");
            return (Criteria) this;
        }

        public Criteria andWrtrNmNotIn(List<String> values) {
            addCriterion("TQ.WRTR_NM not in", values, "wrtrNm");
            return (Criteria) this;
        }

        public Criteria andWrtrNmBetween(String value1, String value2) {
            addCriterion("TQ.WRTR_NM between", value1, value2, "wrtrNm");
            return (Criteria) this;
        }

        public Criteria andWrtrNmNotBetween(String value1, String value2) {
            addCriterion("TQ.WRTR_NM not between", value1, value2, "wrtrNm");
            return (Criteria) this;
        }

        public Criteria andCpCarrCdIsNull() {
            addCriterion("TQ.CP_CARR_CD is null");
            return (Criteria) this;
        }

        public Criteria andCpCarrCdIsNotNull() {
            addCriterion("TQ.CP_CARR_CD is not null");
            return (Criteria) this;
        }

        public Criteria andCpCarrCdEqualTo(String value) {
            addCriterion("TQ.CP_CARR_CD =", value, "cpCarrCd");
            return (Criteria) this;
        }

        public Criteria andCpCarrCdNotEqualTo(String value) {
            addCriterion("TQ.CP_CARR_CD <>", value, "cpCarrCd");
            return (Criteria) this;
        }

        public Criteria andCpCarrCdGreaterThan(String value) {
            addCriterion("TQ.CP_CARR_CD >", value, "cpCarrCd");
            return (Criteria) this;
        }

        public Criteria andCpCarrCdGreaterThanOrEqualTo(String value) {
            addCriterion("TQ.CP_CARR_CD >=", value, "cpCarrCd");
            return (Criteria) this;
        }

        public Criteria andCpCarrCdLessThan(String value) {
            addCriterion("TQ.CP_CARR_CD <", value, "cpCarrCd");
            return (Criteria) this;
        }

        public Criteria andCpCarrCdLessThanOrEqualTo(String value) {
            addCriterion("TQ.CP_CARR_CD <=", value, "cpCarrCd");
            return (Criteria) this;
        }

        public Criteria andCpCarrCdLike(String value) {
            addCriterion("TQ.CP_CARR_CD like", value, "cpCarrCd");
            return (Criteria) this;
        }

        public Criteria andCpCarrCdNotLike(String value) {
            addCriterion("TQ.CP_CARR_CD not like", value, "cpCarrCd");
            return (Criteria) this;
        }

        public Criteria andCpCarrCdIn(List<String> values) {
            addCriterion("TQ.CP_CARR_CD in", values, "cpCarrCd");
            return (Criteria) this;
        }

        public Criteria andCpCarrCdNotIn(List<String> values) {
            addCriterion("TQ.CP_CARR_CD not in", values, "cpCarrCd");
            return (Criteria) this;
        }

        public Criteria andCpCarrCdBetween(String value1, String value2) {
            addCriterion("TQ.CP_CARR_CD between", value1, value2, "cpCarrCd");
            return (Criteria) this;
        }

        public Criteria andCpCarrCdNotBetween(String value1, String value2) {
            addCriterion("TQ.CP_CARR_CD not between", value1, value2, "cpCarrCd");
            return (Criteria) this;
        }

        public Criteria andCpNoIsNull() {
            addCriterion("TQ.CP_NO is null");
            return (Criteria) this;
        }

        public Criteria andCpNoIsNotNull() {
            addCriterion("TQ.CP_NO is not null");
            return (Criteria) this;
        }

        public Criteria andCpNoEqualTo(String value) {
            addCriterion("TQ.CP_NO =", value, "cpNo");
            return (Criteria) this;
        }

        public Criteria andCpNoNotEqualTo(String value) {
            addCriterion("TQ.CP_NO <>", value, "cpNo");
            return (Criteria) this;
        }

        public Criteria andCpNoGreaterThan(String value) {
            addCriterion("TQ.CP_NO >", value, "cpNo");
            return (Criteria) this;
        }

        public Criteria andCpNoGreaterThanOrEqualTo(String value) {
            addCriterion("TQ.CP_NO >=", value, "cpNo");
            return (Criteria) this;
        }

        public Criteria andCpNoLessThan(String value) {
            addCriterion("TQ.CP_NO <", value, "cpNo");
            return (Criteria) this;
        }

        public Criteria andCpNoLessThanOrEqualTo(String value) {
            addCriterion("TQ.CP_NO <=", value, "cpNo");
            return (Criteria) this;
        }

        public Criteria andCpNoLike(String value) {
            addCriterion("TQ.CP_NO like", value, "cpNo");
            return (Criteria) this;
        }

        public Criteria andCpNoNotLike(String value) {
            addCriterion("TQ.CP_NO not like", value, "cpNo");
            return (Criteria) this;
        }

        public Criteria andCpNoIn(List<String> values) {
            addCriterion("TQ.CP_NO in", values, "cpNo");
            return (Criteria) this;
        }

        public Criteria andCpNoNotIn(List<String> values) {
            addCriterion("TQ.CP_NO not in", values, "cpNo");
            return (Criteria) this;
        }

        public Criteria andCpNoBetween(String value1, String value2) {
            addCriterion("TQ.CP_NO between", value1, value2, "cpNo");
            return (Criteria) this;
        }

        public Criteria andCpNoNotBetween(String value1, String value2) {
            addCriterion("TQ.CP_NO not between", value1, value2, "cpNo");
            return (Criteria) this;
        }

        public Criteria andEmailIsNull() {
            addCriterion("TQ.EMAIL is null");
            return (Criteria) this;
        }

        public Criteria andEmailIsNotNull() {
            addCriterion("TQ.EMAIL is not null");
            return (Criteria) this;
        }

        public Criteria andEmailEqualTo(String value) {
            addCriterion("TQ.EMAIL =", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotEqualTo(String value) {
            addCriterion("TQ.EMAIL <>", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThan(String value) {
            addCriterion("TQ.EMAIL >", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThanOrEqualTo(String value) {
            addCriterion("TQ.EMAIL >=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThan(String value) {
            addCriterion("TQ.EMAIL <", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThanOrEqualTo(String value) {
            addCriterion("TQ.EMAIL <=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLike(String value) {
            addCriterion("TQ.EMAIL like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotLike(String value) {
            addCriterion("TQ.EMAIL not like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailIn(List<String> values) {
            addCriterion("TQ.EMAIL in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotIn(List<String> values) {
            addCriterion("TQ.EMAIL not in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailBetween(String value1, String value2) {
            addCriterion("TQ.EMAIL between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotBetween(String value1, String value2) {
            addCriterion("TQ.EMAIL not between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andTitIsNull() {
            addCriterion("TQ.TIT is null");
            return (Criteria) this;
        }

        public Criteria andTitIsNotNull() {
            addCriterion("TQ.TIT is not null");
            return (Criteria) this;
        }

        public Criteria andTitEqualTo(String value) {
            addCriterion("TQ.TIT =", value, "tit");
            return (Criteria) this;
        }

        public Criteria andTitNotEqualTo(String value) {
            addCriterion("TQ.TIT <>", value, "tit");
            return (Criteria) this;
        }

        public Criteria andTitGreaterThan(String value) {
            addCriterion("TQ.TIT >", value, "tit");
            return (Criteria) this;
        }

        public Criteria andTitGreaterThanOrEqualTo(String value) {
            addCriterion("TQ.TIT >=", value, "tit");
            return (Criteria) this;
        }

        public Criteria andTitLessThan(String value) {
            addCriterion("TQ.TIT <", value, "tit");
            return (Criteria) this;
        }

        public Criteria andTitLessThanOrEqualTo(String value) {
            addCriterion("TQ.TIT <=", value, "tit");
            return (Criteria) this;
        }

        public Criteria andTitLike(String value) {
            addCriterion("TQ.TIT like", value, "tit");
            return (Criteria) this;
        }

        public Criteria andTitNotLike(String value) {
            addCriterion("TQ.TIT not like", value, "tit");
            return (Criteria) this;
        }

        public Criteria andTitIn(List<String> values) {
            addCriterion("TQ.TIT in", values, "tit");
            return (Criteria) this;
        }

        public Criteria andTitNotIn(List<String> values) {
            addCriterion("TQ.TIT not in", values, "tit");
            return (Criteria) this;
        }

        public Criteria andTitBetween(String value1, String value2) {
            addCriterion("TQ.TIT between", value1, value2, "tit");
            return (Criteria) this;
        }

        public Criteria andTitNotBetween(String value1, String value2) {
            addCriterion("TQ.TIT not between", value1, value2, "tit");
            return (Criteria) this;
        }

        public Criteria andContIsNull() {
            addCriterion("TQ.CONT is null");
            return (Criteria) this;
        }

        public Criteria andContIsNotNull() {
            addCriterion("TQ.CONT is not null");
            return (Criteria) this;
        }

        public Criteria andContEqualTo(String value) {
            addCriterion("TQ.CONT =", value, "cont");
            return (Criteria) this;
        }

        public Criteria andContNotEqualTo(String value) {
            addCriterion("TQ.CONT <>", value, "cont");
            return (Criteria) this;
        }

        public Criteria andContGreaterThan(String value) {
            addCriterion("TQ.CONT >", value, "cont");
            return (Criteria) this;
        }

        public Criteria andContGreaterThanOrEqualTo(String value) {
            addCriterion("TQ.CONT >=", value, "cont");
            return (Criteria) this;
        }

        public Criteria andContLessThan(String value) {
            addCriterion("TQ.CONT <", value, "cont");
            return (Criteria) this;
        }

        public Criteria andContLessThanOrEqualTo(String value) {
            addCriterion("TQ.CONT <=", value, "cont");
            return (Criteria) this;
        }

        public Criteria andContLike(String value) {
            addCriterion("TQ.CONT like", value, "cont");
            return (Criteria) this;
        }

        public Criteria andContNotLike(String value) {
            addCriterion("TQ.CONT not like", value, "cont");
            return (Criteria) this;
        }

        public Criteria andContIn(List<String> values) {
            addCriterion("TQ.CONT in", values, "cont");
            return (Criteria) this;
        }

        public Criteria andContNotIn(List<String> values) {
            addCriterion("TQ.CONT not in", values, "cont");
            return (Criteria) this;
        }

        public Criteria andContBetween(String value1, String value2) {
            addCriterion("TQ.CONT between", value1, value2, "cont");
            return (Criteria) this;
        }

        public Criteria andContNotBetween(String value1, String value2) {
            addCriterion("TQ.CONT not between", value1, value2, "cont");
            return (Criteria) this;
        }

        public Criteria andRplyNotiYnIsNull() {
            addCriterion("TQ.RPLY_NOTI_YN is null");
            return (Criteria) this;
        }

        public Criteria andRplyNotiYnIsNotNull() {
            addCriterion("TQ.RPLY_NOTI_YN is not null");
            return (Criteria) this;
        }

        public Criteria andRplyNotiYnEqualTo(String value) {
            addCriterion("TQ.RPLY_NOTI_YN =", value, "rplyNotiYn");
            return (Criteria) this;
        }

        public Criteria andRplyNotiYnNotEqualTo(String value) {
            addCriterion("TQ.RPLY_NOTI_YN <>", value, "rplyNotiYn");
            return (Criteria) this;
        }

        public Criteria andRplyNotiYnGreaterThan(String value) {
            addCriterion("TQ.RPLY_NOTI_YN >", value, "rplyNotiYn");
            return (Criteria) this;
        }

        public Criteria andRplyNotiYnGreaterThanOrEqualTo(String value) {
            addCriterion("TQ.RPLY_NOTI_YN >=", value, "rplyNotiYn");
            return (Criteria) this;
        }

        public Criteria andRplyNotiYnLessThan(String value) {
            addCriterion("TQ.RPLY_NOTI_YN <", value, "rplyNotiYn");
            return (Criteria) this;
        }

        public Criteria andRplyNotiYnLessThanOrEqualTo(String value) {
            addCriterion("TQ.RPLY_NOTI_YN <=", value, "rplyNotiYn");
            return (Criteria) this;
        }

        public Criteria andRplyNotiYnLike(String value) {
            addCriterion("TQ.RPLY_NOTI_YN like", value, "rplyNotiYn");
            return (Criteria) this;
        }

        public Criteria andRplyNotiYnNotLike(String value) {
            addCriterion("TQ.RPLY_NOTI_YN not like", value, "rplyNotiYn");
            return (Criteria) this;
        }

        public Criteria andRplyNotiYnIn(List<String> values) {
            addCriterion("TQ.RPLY_NOTI_YN in", values, "rplyNotiYn");
            return (Criteria) this;
        }

        public Criteria andRplyNotiYnNotIn(List<String> values) {
            addCriterion("TQ.RPLY_NOTI_YN not in", values, "rplyNotiYn");
            return (Criteria) this;
        }

        public Criteria andRplyNotiYnBetween(String value1, String value2) {
            addCriterion("TQ.RPLY_NOTI_YN between", value1, value2, "rplyNotiYn");
            return (Criteria) this;
        }

        public Criteria andRplyNotiYnNotBetween(String value1, String value2) {
            addCriterion("TQ.RPLY_NOTI_YN not between", value1, value2, "rplyNotiYn");
            return (Criteria) this;
        }

        public Criteria andPubYnIsNull() {
            addCriterion("TQ.PUB_YN is null");
            return (Criteria) this;
        }

        public Criteria andPubYnIsNotNull() {
            addCriterion("TQ.PUB_YN is not null");
            return (Criteria) this;
        }

        public Criteria andPubYnEqualTo(String value) {
            addCriterion("TQ.PUB_YN =", value, "pubYn");
            return (Criteria) this;
        }

        public Criteria andPubYnNotEqualTo(String value) {
            addCriterion("TQ.PUB_YN <>", value, "pubYn");
            return (Criteria) this;
        }

        public Criteria andPubYnGreaterThan(String value) {
            addCriterion("TQ.PUB_YN >", value, "pubYn");
            return (Criteria) this;
        }

        public Criteria andPubYnGreaterThanOrEqualTo(String value) {
            addCriterion("TQ.PUB_YN >=", value, "pubYn");
            return (Criteria) this;
        }

        public Criteria andPubYnLessThan(String value) {
            addCriterion("TQ.PUB_YN <", value, "pubYn");
            return (Criteria) this;
        }

        public Criteria andPubYnLessThanOrEqualTo(String value) {
            addCriterion("TQ.PUB_YN <=", value, "pubYn");
            return (Criteria) this;
        }

        public Criteria andPubYnLike(String value) {
            addCriterion("TQ.PUB_YN like", value, "pubYn");
            return (Criteria) this;
        }

        public Criteria andPubYnNotLike(String value) {
            addCriterion("TQ.PUB_YN not like", value, "pubYn");
            return (Criteria) this;
        }

        public Criteria andPubYnIn(List<String> values) {
            addCriterion("TQ.PUB_YN in", values, "pubYn");
            return (Criteria) this;
        }

        public Criteria andPubYnNotIn(List<String> values) {
            addCriterion("TQ.PUB_YN not in", values, "pubYn");
            return (Criteria) this;
        }

        public Criteria andPubYnBetween(String value1, String value2) {
            addCriterion("TQ.PUB_YN between", value1, value2, "pubYn");
            return (Criteria) this;
        }

        public Criteria andPubYnNotBetween(String value1, String value2) {
            addCriterion("TQ.PUB_YN not between", value1, value2, "pubYn");
            return (Criteria) this;
        }

        public Criteria andDpYnIsNull() {
            addCriterion("TQ.DP_YN is null");
            return (Criteria) this;
        }

        public Criteria andDpYnIsNotNull() {
            addCriterion("TQ.DP_YN is not null");
            return (Criteria) this;
        }

        public Criteria andDpYnEqualTo(String value) {
            addCriterion("TQ.DP_YN =", value, "dpYn");
            return (Criteria) this;
        }

        public Criteria andDpYnNotEqualTo(String value) {
            addCriterion("TQ.DP_YN <>", value, "dpYn");
            return (Criteria) this;
        }

        public Criteria andDpYnGreaterThan(String value) {
            addCriterion("TQ.DP_YN >", value, "dpYn");
            return (Criteria) this;
        }

        public Criteria andDpYnGreaterThanOrEqualTo(String value) {
            addCriterion("TQ.DP_YN >=", value, "dpYn");
            return (Criteria) this;
        }

        public Criteria andDpYnLessThan(String value) {
            addCriterion("TQ.DP_YN <", value, "dpYn");
            return (Criteria) this;
        }

        public Criteria andDpYnLessThanOrEqualTo(String value) {
            addCriterion("TQ.DP_YN <=", value, "dpYn");
            return (Criteria) this;
        }

        public Criteria andDpYnLike(String value) {
            addCriterion("TQ.DP_YN like", value, "dpYn");
            return (Criteria) this;
        }

        public Criteria andDpYnNotLike(String value) {
            addCriterion("TQ.DP_YN not like", value, "dpYn");
            return (Criteria) this;
        }

        public Criteria andDpYnIn(List<String> values) {
            addCriterion("TQ.DP_YN in", values, "dpYn");
            return (Criteria) this;
        }

        public Criteria andDpYnNotIn(List<String> values) {
            addCriterion("TQ.DP_YN not in", values, "dpYn");
            return (Criteria) this;
        }

        public Criteria andDpYnBetween(String value1, String value2) {
            addCriterion("TQ.DP_YN between", value1, value2, "dpYn");
            return (Criteria) this;
        }

        public Criteria andDpYnNotBetween(String value1, String value2) {
            addCriterion("TQ.DP_YN not between", value1, value2, "dpYn");
            return (Criteria) this;
        }

        public Criteria andRegEnvCdIsNull() {
            addCriterion("TQ.REG_ENV_CD is null");
            return (Criteria) this;
        }

        public Criteria andRegEnvCdIsNotNull() {
            addCriterion("TQ.REG_ENV_CD is not null");
            return (Criteria) this;
        }

        public Criteria andRegEnvCdEqualTo(String value) {
            addCriterion("TQ.REG_ENV_CD =", value, "regEnvCd");
            return (Criteria) this;
        }

        public Criteria andRegEnvCdNotEqualTo(String value) {
            addCriterion("TQ.REG_ENV_CD <>", value, "regEnvCd");
            return (Criteria) this;
        }

        public Criteria andRegEnvCdGreaterThan(String value) {
            addCriterion("TQ.REG_ENV_CD >", value, "regEnvCd");
            return (Criteria) this;
        }

        public Criteria andRegEnvCdGreaterThanOrEqualTo(String value) {
            addCriterion("TQ.REG_ENV_CD >=", value, "regEnvCd");
            return (Criteria) this;
        }

        public Criteria andRegEnvCdLessThan(String value) {
            addCriterion("TQ.REG_ENV_CD <", value, "regEnvCd");
            return (Criteria) this;
        }

        public Criteria andRegEnvCdLessThanOrEqualTo(String value) {
            addCriterion("TQ.REG_ENV_CD <=", value, "regEnvCd");
            return (Criteria) this;
        }

        public Criteria andRegEnvCdLike(String value) {
            addCriterion("TQ.REG_ENV_CD like", value, "regEnvCd");
            return (Criteria) this;
        }

        public Criteria andRegEnvCdNotLike(String value) {
            addCriterion("TQ.REG_ENV_CD not like", value, "regEnvCd");
            return (Criteria) this;
        }

        public Criteria andRegEnvCdIn(List<String> values) {
            addCriterion("TQ.REG_ENV_CD in", values, "regEnvCd");
            return (Criteria) this;
        }

        public Criteria andRegEnvCdNotIn(List<String> values) {
            addCriterion("TQ.REG_ENV_CD not in", values, "regEnvCd");
            return (Criteria) this;
        }

        public Criteria andRegEnvCdBetween(String value1, String value2) {
            addCriterion("TQ.REG_ENV_CD between", value1, value2, "regEnvCd");
            return (Criteria) this;
        }

        public Criteria andRegEnvCdNotBetween(String value1, String value2) {
            addCriterion("TQ.REG_ENV_CD not between", value1, value2, "regEnvCd");
            return (Criteria) this;
        }

        public Criteria andAtchGidIsNull() {
            addCriterion("TQ.ATCH_GID is null");
            return (Criteria) this;
        }

        public Criteria andAtchGidIsNotNull() {
            addCriterion("TQ.ATCH_GID is not null");
            return (Criteria) this;
        }

        public Criteria andAtchGidEqualTo(Integer value) {
            addCriterion("TQ.ATCH_GID =", value, "atchGid");
            return (Criteria) this;
        }

        public Criteria andAtchGidNotEqualTo(Integer value) {
            addCriterion("TQ.ATCH_GID <>", value, "atchGid");
            return (Criteria) this;
        }

        public Criteria andAtchGidGreaterThan(Integer value) {
            addCriterion("TQ.ATCH_GID >", value, "atchGid");
            return (Criteria) this;
        }

        public Criteria andAtchGidGreaterThanOrEqualTo(Integer value) {
            addCriterion("TQ.ATCH_GID >=", value, "atchGid");
            return (Criteria) this;
        }

        public Criteria andAtchGidLessThan(Integer value) {
            addCriterion("TQ.ATCH_GID <", value, "atchGid");
            return (Criteria) this;
        }

        public Criteria andAtchGidLessThanOrEqualTo(Integer value) {
            addCriterion("TQ.ATCH_GID <=", value, "atchGid");
            return (Criteria) this;
        }

        public Criteria andAtchGidIn(List<Integer> values) {
            addCriterion("TQ.ATCH_GID in", values, "atchGid");
            return (Criteria) this;
        }

        public Criteria andAtchGidNotIn(List<Integer> values) {
            addCriterion("TQ.ATCH_GID not in", values, "atchGid");
            return (Criteria) this;
        }

        public Criteria andAtchGidBetween(Integer value1, Integer value2) {
            addCriterion("TQ.ATCH_GID between", value1, value2, "atchGid");
            return (Criteria) this;
        }

        public Criteria andAtchGidNotBetween(Integer value1, Integer value2) {
            addCriterion("TQ.ATCH_GID not between", value1, value2, "atchGid");
            return (Criteria) this;
        }

        public Criteria andRegDtIsNull() {
            addCriterion("TQ.REG_DT is null");
            return (Criteria) this;
        }

        public Criteria andRegDtIsNotNull() {
            addCriterion("TQ.REG_DT is not null");
            return (Criteria) this;
        }

        public Criteria andRegDtEqualTo(Date value) {
            addCriterion("TQ.REG_DT =", value, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtNotEqualTo(Date value) {
            addCriterion("TQ.REG_DT <>", value, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtGreaterThan(Date value) {
            addCriterion("TQ.REG_DT >", value, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtGreaterThanOrEqualTo(Date value) {
            addCriterion("TQ.REG_DT >=", value, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtLessThan(Date value) {
            addCriterion("TQ.REG_DT <", value, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtLessThanOrEqualTo(Date value) {
            addCriterion("TQ.REG_DT <=", value, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtIn(List<Date> values) {
            addCriterion("TQ.REG_DT in", values, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtNotIn(List<Date> values) {
            addCriterion("TQ.REG_DT not in", values, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtBetween(Date value1, Date value2) {
            addCriterion("TQ.REG_DT between", value1, value2, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtNotBetween(Date value1, Date value2) {
            addCriterion("TQ.REG_DT not between", value1, value2, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegIdIsNull() {
            addCriterion("TQ.REG_ID is null");
            return (Criteria) this;
        }

        public Criteria andRegIdIsNotNull() {
            addCriterion("TQ.REG_ID is not null");
            return (Criteria) this;
        }

        public Criteria andRegIdEqualTo(String value) {
            addCriterion("TQ.REG_ID =", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdNotEqualTo(String value) {
            addCriterion("TQ.REG_ID <>", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdGreaterThan(String value) {
            addCriterion("TQ.REG_ID >", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdGreaterThanOrEqualTo(String value) {
            addCriterion("TQ.REG_ID >=", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdLessThan(String value) {
            addCriterion("TQ.REG_ID <", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdLessThanOrEqualTo(String value) {
            addCriterion("TQ.REG_ID <=", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdLike(String value) {
            addCriterion("TQ.REG_ID like", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdNotLike(String value) {
            addCriterion("TQ.REG_ID not like", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdIn(List<String> values) {
            addCriterion("TQ.REG_ID in", values, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdNotIn(List<String> values) {
            addCriterion("TQ.REG_ID not in", values, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdBetween(String value1, String value2) {
            addCriterion("TQ.REG_ID between", value1, value2, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdNotBetween(String value1, String value2) {
            addCriterion("TQ.REG_ID not between", value1, value2, "regId");
            return (Criteria) this;
        }

        public Criteria andModDtIsNull() {
            addCriterion("TQ.MOD_DT is null");
            return (Criteria) this;
        }

        public Criteria andModDtIsNotNull() {
            addCriterion("TQ.MOD_DT is not null");
            return (Criteria) this;
        }

        public Criteria andModDtEqualTo(Date value) {
            addCriterion("TQ.MOD_DT =", value, "modDt");
            return (Criteria) this;
        }

        public Criteria andModDtNotEqualTo(Date value) {
            addCriterion("TQ.MOD_DT <>", value, "modDt");
            return (Criteria) this;
        }

        public Criteria andModDtGreaterThan(Date value) {
            addCriterion("TQ.MOD_DT >", value, "modDt");
            return (Criteria) this;
        }

        public Criteria andModDtGreaterThanOrEqualTo(Date value) {
            addCriterion("TQ.MOD_DT >=", value, "modDt");
            return (Criteria) this;
        }

        public Criteria andModDtLessThan(Date value) {
            addCriterion("TQ.MOD_DT <", value, "modDt");
            return (Criteria) this;
        }

        public Criteria andModDtLessThanOrEqualTo(Date value) {
            addCriterion("TQ.MOD_DT <=", value, "modDt");
            return (Criteria) this;
        }

        public Criteria andModDtIn(List<Date> values) {
            addCriterion("TQ.MOD_DT in", values, "modDt");
            return (Criteria) this;
        }

        public Criteria andModDtNotIn(List<Date> values) {
            addCriterion("TQ.MOD_DT not in", values, "modDt");
            return (Criteria) this;
        }

        public Criteria andModDtBetween(Date value1, Date value2) {
            addCriterion("TQ.MOD_DT between", value1, value2, "modDt");
            return (Criteria) this;
        }

        public Criteria andModDtNotBetween(Date value1, Date value2) {
            addCriterion("TQ.MOD_DT not between", value1, value2, "modDt");
            return (Criteria) this;
        }

        public Criteria andModIdIsNull() {
            addCriterion("TQ.MOD_ID is null");
            return (Criteria) this;
        }

        public Criteria andModIdIsNotNull() {
            addCriterion("TQ.MOD_ID is not null");
            return (Criteria) this;
        }

        public Criteria andModIdEqualTo(String value) {
            addCriterion("TQ.MOD_ID =", value, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdNotEqualTo(String value) {
            addCriterion("TQ.MOD_ID <>", value, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdGreaterThan(String value) {
            addCriterion("TQ.MOD_ID >", value, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdGreaterThanOrEqualTo(String value) {
            addCriterion("TQ.MOD_ID >=", value, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdLessThan(String value) {
            addCriterion("TQ.MOD_ID <", value, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdLessThanOrEqualTo(String value) {
            addCriterion("TQ.MOD_ID <=", value, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdLike(String value) {
            addCriterion("TQ.MOD_ID like", value, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdNotLike(String value) {
            addCriterion("TQ.MOD_ID not like", value, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdIn(List<String> values) {
            addCriterion("TQ.MOD_ID in", values, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdNotIn(List<String> values) {
            addCriterion("TQ.MOD_ID not in", values, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdBetween(String value1, String value2) {
            addCriterion("TQ.MOD_ID between", value1, value2, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdNotBetween(String value1, String value2) {
            addCriterion("TQ.MOD_ID not between", value1, value2, "modId");
            return (Criteria) this;
        }

        public Criteria andUseYnIsNull() {
            addCriterion("TQ.USE_YN is null");
            return (Criteria) this;
        }

        public Criteria andUseYnIsNotNull() {
            addCriterion("TQ.USE_YN is not null");
            return (Criteria) this;
        }

        public Criteria andUseYnEqualTo(String value) {
            addCriterion("TQ.USE_YN =", value, "useYn");
            return (Criteria) this;
        }

        public Criteria andUseYnNotEqualTo(String value) {
            addCriterion("TQ.USE_YN <>", value, "useYn");
            return (Criteria) this;
        }

        public Criteria andUseYnGreaterThan(String value) {
            addCriterion("TQ.USE_YN >", value, "useYn");
            return (Criteria) this;
        }

        public Criteria andUseYnGreaterThanOrEqualTo(String value) {
            addCriterion("TQ.USE_YN >=", value, "useYn");
            return (Criteria) this;
        }

        public Criteria andUseYnLessThan(String value) {
            addCriterion("TQ.USE_YN <", value, "useYn");
            return (Criteria) this;
        }

        public Criteria andUseYnLessThanOrEqualTo(String value) {
            addCriterion("TQ.USE_YN <=", value, "useYn");
            return (Criteria) this;
        }

        public Criteria andUseYnLike(String value) {
            addCriterion("TQ.USE_YN like", value, "useYn");
            return (Criteria) this;
        }

        public Criteria andUseYnNotLike(String value) {
            addCriterion("TQ.USE_YN not like", value, "useYn");
            return (Criteria) this;
        }

        public Criteria andUseYnIn(List<String> values) {
            addCriterion("TQ.USE_YN in", values, "useYn");
            return (Criteria) this;
        }

        public Criteria andUseYnNotIn(List<String> values) {
            addCriterion("TQ.USE_YN not in", values, "useYn");
            return (Criteria) this;
        }

        public Criteria andUseYnBetween(String value1, String value2) {
            addCriterion("TQ.USE_YN between", value1, value2, "useYn");
            return (Criteria) this;
        }

        public Criteria andUseYnNotBetween(String value1, String value2) {
            addCriterion("TQ.USE_YN not between", value1, value2, "useYn");
            return (Criteria) this;
        }

        public Criteria andInqTpCdLikeInsensitive(String value) {
            addCriterion("upper(TQ.INQ_TP_CD) like", value.toUpperCase(), "inqTpCd");
            return (Criteria) this;
        }

        public Criteria andInqStatCdLikeInsensitive(String value) {
            addCriterion("upper(TQ.INQ_STAT_CD) like", value.toUpperCase(), "inqStatCd");
            return (Criteria) this;
        }

        public Criteria andInqClCdLikeInsensitive(String value) {
            addCriterion("upper(TQ.INQ_CL_CD) like", value.toUpperCase(), "inqClCd");
            return (Criteria) this;
        }

        public Criteria andInqClDtlCdLikeInsensitive(String value) {
            addCriterion("upper(TQ.INQ_CL_DTL_CD) like", value.toUpperCase(), "inqClDtlCd");
            return (Criteria) this;
        }

        public Criteria andMbrYnLikeInsensitive(String value) {
            addCriterion("upper(TQ.MBR_YN) like", value.toUpperCase(), "mbrYn");
            return (Criteria) this;
        }

        public Criteria andMbrIdLikeInsensitive(String value) {
            addCriterion("upper(TQ.MBR_ID) like", value.toUpperCase(), "mbrId");
            return (Criteria) this;
        }

        public Criteria andWrtrIdValLikeInsensitive(String value) {
            addCriterion("upper(TQ.WRTR_ID_VAL) like", value.toUpperCase(), "wrtrIdVal");
            return (Criteria) this;
        }

        public Criteria andWrtrNmLikeInsensitive(String value) {
            addCriterion("upper(TQ.WRTR_NM) like", value.toUpperCase(), "wrtrNm");
            return (Criteria) this;
        }

        public Criteria andCpCarrCdLikeInsensitive(String value) {
            addCriterion("upper(TQ.CP_CARR_CD) like", value.toUpperCase(), "cpCarrCd");
            return (Criteria) this;
        }

        public Criteria andCpNoLikeInsensitive(String value) {
            addCriterion("upper(TQ.CP_NO) like", value.toUpperCase(), "cpNo");
            return (Criteria) this;
        }

        public Criteria andEmailLikeInsensitive(String value) {
            addCriterion("upper(TQ.EMAIL) like", value.toUpperCase(), "email");
            return (Criteria) this;
        }

        public Criteria andTitLikeInsensitive(String value) {
            addCriterion("upper(TQ.TIT) like", value.toUpperCase(), "tit");
            return (Criteria) this;
        }

        public Criteria andContLikeInsensitive(String value) {
            addCriterion("upper(TQ.CONT) like", value.toUpperCase(), "cont");
            return (Criteria) this;
        }

        public Criteria andRplyNotiYnLikeInsensitive(String value) {
            addCriterion("upper(TQ.RPLY_NOTI_YN) like", value.toUpperCase(), "rplyNotiYn");
            return (Criteria) this;
        }

        public Criteria andPubYnLikeInsensitive(String value) {
            addCriterion("upper(TQ.PUB_YN) like", value.toUpperCase(), "pubYn");
            return (Criteria) this;
        }

        public Criteria andDpYnLikeInsensitive(String value) {
            addCriterion("upper(TQ.DP_YN) like", value.toUpperCase(), "dpYn");
            return (Criteria) this;
        }

        public Criteria andRegEnvCdLikeInsensitive(String value) {
            addCriterion("upper(TQ.REG_ENV_CD) like", value.toUpperCase(), "regEnvCd");
            return (Criteria) this;
        }

        public Criteria andRegIdLikeInsensitive(String value) {
            addCriterion("upper(TQ.REG_ID) like", value.toUpperCase(), "regId");
            return (Criteria) this;
        }

        public Criteria andModIdLikeInsensitive(String value) {
            addCriterion("upper(TQ.MOD_ID) like", value.toUpperCase(), "modId");
            return (Criteria) this;
        }

        public Criteria andUseYnLikeInsensitive(String value) {
            addCriterion("upper(TQ.USE_YN) like", value.toUpperCase(), "useYn");
            return (Criteria) this;
        }

        public Criteria andInqTpCdLikeLeft(String value) {
            addCriterion("TQ.INQ_TP_CD like ", "%" + value, "inqTpCd");
            return (Criteria) this;
        }

        public Criteria andInqTpCdLikeRight(String value) {
            addCriterion("TQ.INQ_TP_CD like ", value + "%", "inqTpCd");
            return (Criteria) this;
        }

        public Criteria andInqTpCdLikeBoth(String value) {
            addCriterion("TQ.INQ_TP_CD like ", "%" + value + "%", "inqTpCd");
            return (Criteria) this;
        }

        public Criteria andInqStatCdLikeLeft(String value) {
            addCriterion("TQ.INQ_STAT_CD like ", "%" + value, "inqStatCd");
            return (Criteria) this;
        }

        public Criteria andInqStatCdLikeRight(String value) {
            addCriterion("TQ.INQ_STAT_CD like ", value + "%", "inqStatCd");
            return (Criteria) this;
        }

        public Criteria andInqStatCdLikeBoth(String value) {
            addCriterion("TQ.INQ_STAT_CD like ", "%" + value + "%", "inqStatCd");
            return (Criteria) this;
        }

        public Criteria andInqClCdLikeLeft(String value) {
            addCriterion("TQ.INQ_CL_CD like ", "%" + value, "inqClCd");
            return (Criteria) this;
        }

        public Criteria andInqClCdLikeRight(String value) {
            addCriterion("TQ.INQ_CL_CD like ", value + "%", "inqClCd");
            return (Criteria) this;
        }

        public Criteria andInqClCdLikeBoth(String value) {
            addCriterion("TQ.INQ_CL_CD like ", "%" + value + "%", "inqClCd");
            return (Criteria) this;
        }

        public Criteria andInqClDtlCdLikeLeft(String value) {
            addCriterion("TQ.INQ_CL_DTL_CD like ", "%" + value, "inqClDtlCd");
            return (Criteria) this;
        }

        public Criteria andInqClDtlCdLikeRight(String value) {
            addCriterion("TQ.INQ_CL_DTL_CD like ", value + "%", "inqClDtlCd");
            return (Criteria) this;
        }

        public Criteria andInqClDtlCdLikeBoth(String value) {
            addCriterion("TQ.INQ_CL_DTL_CD like ", "%" + value + "%", "inqClDtlCd");
            return (Criteria) this;
        }

        public Criteria andMbrYnLikeLeft(String value) {
            addCriterion("TQ.MBR_YN like ", "%" + value, "mbrYn");
            return (Criteria) this;
        }

        public Criteria andMbrYnLikeRight(String value) {
            addCriterion("TQ.MBR_YN like ", value + "%", "mbrYn");
            return (Criteria) this;
        }

        public Criteria andMbrYnLikeBoth(String value) {
            addCriterion("TQ.MBR_YN like ", "%" + value + "%", "mbrYn");
            return (Criteria) this;
        }

        public Criteria andMbrIdLikeLeft(String value) {
            addCriterion("TQ.MBR_ID like ", "%" + value, "mbrId");
            return (Criteria) this;
        }

        public Criteria andMbrIdLikeRight(String value) {
            addCriterion("TQ.MBR_ID like ", value + "%", "mbrId");
            return (Criteria) this;
        }

        public Criteria andMbrIdLikeBoth(String value) {
            addCriterion("TQ.MBR_ID like ", "%" + value + "%", "mbrId");
            return (Criteria) this;
        }

        public Criteria andWrtrIdValLikeLeft(String value) {
            addCriterion("TQ.WRTR_ID_VAL like ", "%" + value, "wrtrIdVal");
            return (Criteria) this;
        }

        public Criteria andWrtrIdValLikeRight(String value) {
            addCriterion("TQ.WRTR_ID_VAL like ", value + "%", "wrtrIdVal");
            return (Criteria) this;
        }

        public Criteria andWrtrIdValLikeBoth(String value) {
            addCriterion("TQ.WRTR_ID_VAL like ", "%" + value + "%", "wrtrIdVal");
            return (Criteria) this;
        }

        public Criteria andWrtrNmLikeLeft(String value) {
            addCriterion("TQ.WRTR_NM like ", "%" + value, "wrtrNm");
            return (Criteria) this;
        }

        public Criteria andWrtrNmLikeRight(String value) {
            addCriterion("TQ.WRTR_NM like ", value + "%", "wrtrNm");
            return (Criteria) this;
        }

        public Criteria andWrtrNmLikeBoth(String value) {
            addCriterion("TQ.WRTR_NM like ", "%" + value + "%", "wrtrNm");
            return (Criteria) this;
        }

        public Criteria andCpCarrCdLikeLeft(String value) {
            addCriterion("TQ.CP_CARR_CD like ", "%" + value, "cpCarrCd");
            return (Criteria) this;
        }

        public Criteria andCpCarrCdLikeRight(String value) {
            addCriterion("TQ.CP_CARR_CD like ", value + "%", "cpCarrCd");
            return (Criteria) this;
        }

        public Criteria andCpCarrCdLikeBoth(String value) {
            addCriterion("TQ.CP_CARR_CD like ", "%" + value + "%", "cpCarrCd");
            return (Criteria) this;
        }

        public Criteria andCpNoLikeLeft(String value) {
            addCriterion("TQ.CP_NO like ", "%" + value, "cpNo");
            return (Criteria) this;
        }

        public Criteria andCpNoLikeRight(String value) {
            addCriterion("TQ.CP_NO like ", value + "%", "cpNo");
            return (Criteria) this;
        }

        public Criteria andCpNoLikeBoth(String value) {
            addCriterion("TQ.CP_NO like ", "%" + value + "%", "cpNo");
            return (Criteria) this;
        }

        public Criteria andEmailLikeLeft(String value) {
            addCriterion("TQ.EMAIL like ", "%" + value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLikeRight(String value) {
            addCriterion("TQ.EMAIL like ", value + "%", "email");
            return (Criteria) this;
        }

        public Criteria andEmailLikeBoth(String value) {
            addCriterion("TQ.EMAIL like ", "%" + value + "%", "email");
            return (Criteria) this;
        }

        public Criteria andTitLikeLeft(String value) {
            addCriterion("TQ.TIT like ", "%" + value, "tit");
            return (Criteria) this;
        }

        public Criteria andTitLikeRight(String value) {
            addCriterion("TQ.TIT like ", value + "%", "tit");
            return (Criteria) this;
        }

        public Criteria andTitLikeBoth(String value) {
            addCriterion("TQ.TIT like ", "%" + value + "%", "tit");
            return (Criteria) this;
        }

        public Criteria andContLikeLeft(String value) {
            addCriterion("TQ.CONT like ", "%" + value, "cont");
            return (Criteria) this;
        }

        public Criteria andContLikeRight(String value) {
            addCriterion("TQ.CONT like ", value + "%", "cont");
            return (Criteria) this;
        }

        public Criteria andContLikeBoth(String value) {
            addCriterion("TQ.CONT like ", "%" + value + "%", "cont");
            return (Criteria) this;
        }

        public Criteria andRplyNotiYnLikeLeft(String value) {
            addCriterion("TQ.RPLY_NOTI_YN like ", "%" + value, "rplyNotiYn");
            return (Criteria) this;
        }

        public Criteria andRplyNotiYnLikeRight(String value) {
            addCriterion("TQ.RPLY_NOTI_YN like ", value + "%", "rplyNotiYn");
            return (Criteria) this;
        }

        public Criteria andRplyNotiYnLikeBoth(String value) {
            addCriterion("TQ.RPLY_NOTI_YN like ", "%" + value + "%", "rplyNotiYn");
            return (Criteria) this;
        }

        public Criteria andPubYnLikeLeft(String value) {
            addCriterion("TQ.PUB_YN like ", "%" + value, "pubYn");
            return (Criteria) this;
        }

        public Criteria andPubYnLikeRight(String value) {
            addCriterion("TQ.PUB_YN like ", value + "%", "pubYn");
            return (Criteria) this;
        }

        public Criteria andPubYnLikeBoth(String value) {
            addCriterion("TQ.PUB_YN like ", "%" + value + "%", "pubYn");
            return (Criteria) this;
        }

        public Criteria andDpYnLikeLeft(String value) {
            addCriterion("TQ.DP_YN like ", "%" + value, "dpYn");
            return (Criteria) this;
        }

        public Criteria andDpYnLikeRight(String value) {
            addCriterion("TQ.DP_YN like ", value + "%", "dpYn");
            return (Criteria) this;
        }

        public Criteria andDpYnLikeBoth(String value) {
            addCriterion("TQ.DP_YN like ", "%" + value + "%", "dpYn");
            return (Criteria) this;
        }

        public Criteria andRegEnvCdLikeLeft(String value) {
            addCriterion("TQ.REG_ENV_CD like ", "%" + value, "regEnvCd");
            return (Criteria) this;
        }

        public Criteria andRegEnvCdLikeRight(String value) {
            addCriterion("TQ.REG_ENV_CD like ", value + "%", "regEnvCd");
            return (Criteria) this;
        }

        public Criteria andRegEnvCdLikeBoth(String value) {
            addCriterion("TQ.REG_ENV_CD like ", "%" + value + "%", "regEnvCd");
            return (Criteria) this;
        }

        public Criteria andRegIdLikeLeft(String value) {
            addCriterion("TQ.REG_ID like ", "%" + value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdLikeRight(String value) {
            addCriterion("TQ.REG_ID like ", value + "%", "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdLikeBoth(String value) {
            addCriterion("TQ.REG_ID like ", "%" + value + "%", "regId");
            return (Criteria) this;
        }

        public Criteria andModIdLikeLeft(String value) {
            addCriterion("TQ.MOD_ID like ", "%" + value, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdLikeRight(String value) {
            addCriterion("TQ.MOD_ID like ", value + "%", "modId");
            return (Criteria) this;
        }

        public Criteria andModIdLikeBoth(String value) {
            addCriterion("TQ.MOD_ID like ", "%" + value + "%", "modId");
            return (Criteria) this;
        }

        public Criteria andUseYnLikeLeft(String value) {
            addCriterion("TQ.USE_YN like ", "%" + value, "useYn");
            return (Criteria) this;
        }

        public Criteria andUseYnLikeRight(String value) {
            addCriterion("TQ.USE_YN like ", value + "%", "useYn");
            return (Criteria) this;
        }

        public Criteria andUseYnLikeBoth(String value) {
            addCriterion("TQ.USE_YN like ", "%" + value + "%", "useYn");
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