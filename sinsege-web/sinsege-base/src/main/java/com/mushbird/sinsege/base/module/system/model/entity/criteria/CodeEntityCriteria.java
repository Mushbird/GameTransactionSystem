package com.mushbird.sinsege.base.module.system.model.entity.criteria;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CodeEntityCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    public CodeEntityCriteria() {
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

        public Criteria andCdIsNull() {
            addCriterion("TC.CD is null");
            return (Criteria) this;
        }

        public Criteria andCdIsNotNull() {
            addCriterion("TC.CD is not null");
            return (Criteria) this;
        }

        public Criteria andCdEqualTo(String value) {
            addCriterion("TC.CD =", value, "cd");
            return (Criteria) this;
        }

        public Criteria andCdNotEqualTo(String value) {
            addCriterion("TC.CD <>", value, "cd");
            return (Criteria) this;
        }

        public Criteria andCdGreaterThan(String value) {
            addCriterion("TC.CD >", value, "cd");
            return (Criteria) this;
        }

        public Criteria andCdGreaterThanOrEqualTo(String value) {
            addCriterion("TC.CD >=", value, "cd");
            return (Criteria) this;
        }

        public Criteria andCdLessThan(String value) {
            addCriterion("TC.CD <", value, "cd");
            return (Criteria) this;
        }

        public Criteria andCdLessThanOrEqualTo(String value) {
            addCriterion("TC.CD <=", value, "cd");
            return (Criteria) this;
        }

        public Criteria andCdLike(String value) {
            addCriterion("TC.CD like", value, "cd");
            return (Criteria) this;
        }

        public Criteria andCdNotLike(String value) {
            addCriterion("TC.CD not like", value, "cd");
            return (Criteria) this;
        }

        public Criteria andCdIn(List<String> values) {
            addCriterion("TC.CD in", values, "cd");
            return (Criteria) this;
        }

        public Criteria andCdNotIn(List<String> values) {
            addCriterion("TC.CD not in", values, "cd");
            return (Criteria) this;
        }

        public Criteria andCdBetween(String value1, String value2) {
            addCriterion("TC.CD between", value1, value2, "cd");
            return (Criteria) this;
        }

        public Criteria andCdNotBetween(String value1, String value2) {
            addCriterion("TC.CD not between", value1, value2, "cd");
            return (Criteria) this;
        }

        public Criteria andRefCdIsNull() {
            addCriterion("TC.REF_CD is null");
            return (Criteria) this;
        }

        public Criteria andRefCdIsNotNull() {
            addCriterion("TC.REF_CD is not null");
            return (Criteria) this;
        }

        public Criteria andRefCdEqualTo(String value) {
            addCriterion("TC.REF_CD =", value, "refCd");
            return (Criteria) this;
        }

        public Criteria andRefCdNotEqualTo(String value) {
            addCriterion("TC.REF_CD <>", value, "refCd");
            return (Criteria) this;
        }

        public Criteria andRefCdGreaterThan(String value) {
            addCriterion("TC.REF_CD >", value, "refCd");
            return (Criteria) this;
        }

        public Criteria andRefCdGreaterThanOrEqualTo(String value) {
            addCriterion("TC.REF_CD >=", value, "refCd");
            return (Criteria) this;
        }

        public Criteria andRefCdLessThan(String value) {
            addCriterion("TC.REF_CD <", value, "refCd");
            return (Criteria) this;
        }

        public Criteria andRefCdLessThanOrEqualTo(String value) {
            addCriterion("TC.REF_CD <=", value, "refCd");
            return (Criteria) this;
        }

        public Criteria andRefCdLike(String value) {
            addCriterion("TC.REF_CD like", value, "refCd");
            return (Criteria) this;
        }

        public Criteria andRefCdNotLike(String value) {
            addCriterion("TC.REF_CD not like", value, "refCd");
            return (Criteria) this;
        }

        public Criteria andRefCdIn(List<String> values) {
            addCriterion("TC.REF_CD in", values, "refCd");
            return (Criteria) this;
        }

        public Criteria andRefCdNotIn(List<String> values) {
            addCriterion("TC.REF_CD not in", values, "refCd");
            return (Criteria) this;
        }

        public Criteria andRefCdBetween(String value1, String value2) {
            addCriterion("TC.REF_CD between", value1, value2, "refCd");
            return (Criteria) this;
        }

        public Criteria andRefCdNotBetween(String value1, String value2) {
            addCriterion("TC.REF_CD not between", value1, value2, "refCd");
            return (Criteria) this;
        }

        public Criteria andCdNmIsNull() {
            addCriterion("TC.CD_NM is null");
            return (Criteria) this;
        }

        public Criteria andCdNmIsNotNull() {
            addCriterion("TC.CD_NM is not null");
            return (Criteria) this;
        }

        public Criteria andCdNmEqualTo(String value) {
            addCriterion("TC.CD_NM =", value, "cdNm");
            return (Criteria) this;
        }

        public Criteria andCdNmNotEqualTo(String value) {
            addCriterion("TC.CD_NM <>", value, "cdNm");
            return (Criteria) this;
        }

        public Criteria andCdNmGreaterThan(String value) {
            addCriterion("TC.CD_NM >", value, "cdNm");
            return (Criteria) this;
        }

        public Criteria andCdNmGreaterThanOrEqualTo(String value) {
            addCriterion("TC.CD_NM >=", value, "cdNm");
            return (Criteria) this;
        }

        public Criteria andCdNmLessThan(String value) {
            addCriterion("TC.CD_NM <", value, "cdNm");
            return (Criteria) this;
        }

        public Criteria andCdNmLessThanOrEqualTo(String value) {
            addCriterion("TC.CD_NM <=", value, "cdNm");
            return (Criteria) this;
        }

        public Criteria andCdNmLike(String value) {
            addCriterion("TC.CD_NM like", value, "cdNm");
            return (Criteria) this;
        }

        public Criteria andCdNmNotLike(String value) {
            addCriterion("TC.CD_NM not like", value, "cdNm");
            return (Criteria) this;
        }

        public Criteria andCdNmIn(List<String> values) {
            addCriterion("TC.CD_NM in", values, "cdNm");
            return (Criteria) this;
        }

        public Criteria andCdNmNotIn(List<String> values) {
            addCriterion("TC.CD_NM not in", values, "cdNm");
            return (Criteria) this;
        }

        public Criteria andCdNmBetween(String value1, String value2) {
            addCriterion("TC.CD_NM between", value1, value2, "cdNm");
            return (Criteria) this;
        }

        public Criteria andCdNmNotBetween(String value1, String value2) {
            addCriterion("TC.CD_NM not between", value1, value2, "cdNm");
            return (Criteria) this;
        }

        public Criteria andCdAdd1ValIsNull() {
            addCriterion("TC.CD_ADD_1_VAL is null");
            return (Criteria) this;
        }

        public Criteria andCdAdd1ValIsNotNull() {
            addCriterion("TC.CD_ADD_1_VAL is not null");
            return (Criteria) this;
        }

        public Criteria andCdAdd1ValEqualTo(String value) {
            addCriterion("TC.CD_ADD_1_VAL =", value, "cdAdd1Val");
            return (Criteria) this;
        }

        public Criteria andCdAdd1ValNotEqualTo(String value) {
            addCriterion("TC.CD_ADD_1_VAL <>", value, "cdAdd1Val");
            return (Criteria) this;
        }

        public Criteria andCdAdd1ValGreaterThan(String value) {
            addCriterion("TC.CD_ADD_1_VAL >", value, "cdAdd1Val");
            return (Criteria) this;
        }

        public Criteria andCdAdd1ValGreaterThanOrEqualTo(String value) {
            addCriterion("TC.CD_ADD_1_VAL >=", value, "cdAdd1Val");
            return (Criteria) this;
        }

        public Criteria andCdAdd1ValLessThan(String value) {
            addCriterion("TC.CD_ADD_1_VAL <", value, "cdAdd1Val");
            return (Criteria) this;
        }

        public Criteria andCdAdd1ValLessThanOrEqualTo(String value) {
            addCriterion("TC.CD_ADD_1_VAL <=", value, "cdAdd1Val");
            return (Criteria) this;
        }

        public Criteria andCdAdd1ValLike(String value) {
            addCriterion("TC.CD_ADD_1_VAL like", value, "cdAdd1Val");
            return (Criteria) this;
        }

        public Criteria andCdAdd1ValNotLike(String value) {
            addCriterion("TC.CD_ADD_1_VAL not like", value, "cdAdd1Val");
            return (Criteria) this;
        }

        public Criteria andCdAdd1ValIn(List<String> values) {
            addCriterion("TC.CD_ADD_1_VAL in", values, "cdAdd1Val");
            return (Criteria) this;
        }

        public Criteria andCdAdd1ValNotIn(List<String> values) {
            addCriterion("TC.CD_ADD_1_VAL not in", values, "cdAdd1Val");
            return (Criteria) this;
        }

        public Criteria andCdAdd1ValBetween(String value1, String value2) {
            addCriterion("TC.CD_ADD_1_VAL between", value1, value2, "cdAdd1Val");
            return (Criteria) this;
        }

        public Criteria andCdAdd1ValNotBetween(String value1, String value2) {
            addCriterion("TC.CD_ADD_1_VAL not between", value1, value2, "cdAdd1Val");
            return (Criteria) this;
        }

        public Criteria andCdAdd2ValIsNull() {
            addCriterion("TC.CD_ADD_2_VAL is null");
            return (Criteria) this;
        }

        public Criteria andCdAdd2ValIsNotNull() {
            addCriterion("TC.CD_ADD_2_VAL is not null");
            return (Criteria) this;
        }

        public Criteria andCdAdd2ValEqualTo(String value) {
            addCriterion("TC.CD_ADD_2_VAL =", value, "cdAdd2Val");
            return (Criteria) this;
        }

        public Criteria andCdAdd2ValNotEqualTo(String value) {
            addCriterion("TC.CD_ADD_2_VAL <>", value, "cdAdd2Val");
            return (Criteria) this;
        }

        public Criteria andCdAdd2ValGreaterThan(String value) {
            addCriterion("TC.CD_ADD_2_VAL >", value, "cdAdd2Val");
            return (Criteria) this;
        }

        public Criteria andCdAdd2ValGreaterThanOrEqualTo(String value) {
            addCriterion("TC.CD_ADD_2_VAL >=", value, "cdAdd2Val");
            return (Criteria) this;
        }

        public Criteria andCdAdd2ValLessThan(String value) {
            addCriterion("TC.CD_ADD_2_VAL <", value, "cdAdd2Val");
            return (Criteria) this;
        }

        public Criteria andCdAdd2ValLessThanOrEqualTo(String value) {
            addCriterion("TC.CD_ADD_2_VAL <=", value, "cdAdd2Val");
            return (Criteria) this;
        }

        public Criteria andCdAdd2ValLike(String value) {
            addCriterion("TC.CD_ADD_2_VAL like", value, "cdAdd2Val");
            return (Criteria) this;
        }

        public Criteria andCdAdd2ValNotLike(String value) {
            addCriterion("TC.CD_ADD_2_VAL not like", value, "cdAdd2Val");
            return (Criteria) this;
        }

        public Criteria andCdAdd2ValIn(List<String> values) {
            addCriterion("TC.CD_ADD_2_VAL in", values, "cdAdd2Val");
            return (Criteria) this;
        }

        public Criteria andCdAdd2ValNotIn(List<String> values) {
            addCriterion("TC.CD_ADD_2_VAL not in", values, "cdAdd2Val");
            return (Criteria) this;
        }

        public Criteria andCdAdd2ValBetween(String value1, String value2) {
            addCriterion("TC.CD_ADD_2_VAL between", value1, value2, "cdAdd2Val");
            return (Criteria) this;
        }

        public Criteria andCdAdd2ValNotBetween(String value1, String value2) {
            addCriterion("TC.CD_ADD_2_VAL not between", value1, value2, "cdAdd2Val");
            return (Criteria) this;
        }

        public Criteria andCdAdd3ValIsNull() {
            addCriterion("TC.CD_ADD_3_VAL is null");
            return (Criteria) this;
        }

        public Criteria andCdAdd3ValIsNotNull() {
            addCriterion("TC.CD_ADD_3_VAL is not null");
            return (Criteria) this;
        }

        public Criteria andCdAdd3ValEqualTo(String value) {
            addCriterion("TC.CD_ADD_3_VAL =", value, "cdAdd3Val");
            return (Criteria) this;
        }

        public Criteria andCdAdd3ValNotEqualTo(String value) {
            addCriterion("TC.CD_ADD_3_VAL <>", value, "cdAdd3Val");
            return (Criteria) this;
        }

        public Criteria andCdAdd3ValGreaterThan(String value) {
            addCriterion("TC.CD_ADD_3_VAL >", value, "cdAdd3Val");
            return (Criteria) this;
        }

        public Criteria andCdAdd3ValGreaterThanOrEqualTo(String value) {
            addCriterion("TC.CD_ADD_3_VAL >=", value, "cdAdd3Val");
            return (Criteria) this;
        }

        public Criteria andCdAdd3ValLessThan(String value) {
            addCriterion("TC.CD_ADD_3_VAL <", value, "cdAdd3Val");
            return (Criteria) this;
        }

        public Criteria andCdAdd3ValLessThanOrEqualTo(String value) {
            addCriterion("TC.CD_ADD_3_VAL <=", value, "cdAdd3Val");
            return (Criteria) this;
        }

        public Criteria andCdAdd3ValLike(String value) {
            addCriterion("TC.CD_ADD_3_VAL like", value, "cdAdd3Val");
            return (Criteria) this;
        }

        public Criteria andCdAdd3ValNotLike(String value) {
            addCriterion("TC.CD_ADD_3_VAL not like", value, "cdAdd3Val");
            return (Criteria) this;
        }

        public Criteria andCdAdd3ValIn(List<String> values) {
            addCriterion("TC.CD_ADD_3_VAL in", values, "cdAdd3Val");
            return (Criteria) this;
        }

        public Criteria andCdAdd3ValNotIn(List<String> values) {
            addCriterion("TC.CD_ADD_3_VAL not in", values, "cdAdd3Val");
            return (Criteria) this;
        }

        public Criteria andCdAdd3ValBetween(String value1, String value2) {
            addCriterion("TC.CD_ADD_3_VAL between", value1, value2, "cdAdd3Val");
            return (Criteria) this;
        }

        public Criteria andCdAdd3ValNotBetween(String value1, String value2) {
            addCriterion("TC.CD_ADD_3_VAL not between", value1, value2, "cdAdd3Val");
            return (Criteria) this;
        }

        public Criteria andSordIsNull() {
            addCriterion("TC.SORD is null");
            return (Criteria) this;
        }

        public Criteria andSordIsNotNull() {
            addCriterion("TC.SORD is not null");
            return (Criteria) this;
        }

        public Criteria andSordEqualTo(Integer value) {
            addCriterion("TC.SORD =", value, "sord");
            return (Criteria) this;
        }

        public Criteria andSordNotEqualTo(Integer value) {
            addCriterion("TC.SORD <>", value, "sord");
            return (Criteria) this;
        }

        public Criteria andSordGreaterThan(Integer value) {
            addCriterion("TC.SORD >", value, "sord");
            return (Criteria) this;
        }

        public Criteria andSordGreaterThanOrEqualTo(Integer value) {
            addCriterion("TC.SORD >=", value, "sord");
            return (Criteria) this;
        }

        public Criteria andSordLessThan(Integer value) {
            addCriterion("TC.SORD <", value, "sord");
            return (Criteria) this;
        }

        public Criteria andSordLessThanOrEqualTo(Integer value) {
            addCriterion("TC.SORD <=", value, "sord");
            return (Criteria) this;
        }

        public Criteria andSordIn(List<Integer> values) {
            addCriterion("TC.SORD in", values, "sord");
            return (Criteria) this;
        }

        public Criteria andSordNotIn(List<Integer> values) {
            addCriterion("TC.SORD not in", values, "sord");
            return (Criteria) this;
        }

        public Criteria andSordBetween(Integer value1, Integer value2) {
            addCriterion("TC.SORD between", value1, value2, "sord");
            return (Criteria) this;
        }

        public Criteria andSordNotBetween(Integer value1, Integer value2) {
            addCriterion("TC.SORD not between", value1, value2, "sord");
            return (Criteria) this;
        }

        public Criteria andDpYnIsNull() {
            addCriterion("TC.DP_YN is null");
            return (Criteria) this;
        }

        public Criteria andDpYnIsNotNull() {
            addCriterion("TC.DP_YN is not null");
            return (Criteria) this;
        }

        public Criteria andDpYnEqualTo(String value) {
            addCriterion("TC.DP_YN =", value, "dpYn");
            return (Criteria) this;
        }

        public Criteria andDpYnNotEqualTo(String value) {
            addCriterion("TC.DP_YN <>", value, "dpYn");
            return (Criteria) this;
        }

        public Criteria andDpYnGreaterThan(String value) {
            addCriterion("TC.DP_YN >", value, "dpYn");
            return (Criteria) this;
        }

        public Criteria andDpYnGreaterThanOrEqualTo(String value) {
            addCriterion("TC.DP_YN >=", value, "dpYn");
            return (Criteria) this;
        }

        public Criteria andDpYnLessThan(String value) {
            addCriterion("TC.DP_YN <", value, "dpYn");
            return (Criteria) this;
        }

        public Criteria andDpYnLessThanOrEqualTo(String value) {
            addCriterion("TC.DP_YN <=", value, "dpYn");
            return (Criteria) this;
        }

        public Criteria andDpYnLike(String value) {
            addCriterion("TC.DP_YN like", value, "dpYn");
            return (Criteria) this;
        }

        public Criteria andDpYnNotLike(String value) {
            addCriterion("TC.DP_YN not like", value, "dpYn");
            return (Criteria) this;
        }

        public Criteria andDpYnIn(List<String> values) {
            addCriterion("TC.DP_YN in", values, "dpYn");
            return (Criteria) this;
        }

        public Criteria andDpYnNotIn(List<String> values) {
            addCriterion("TC.DP_YN not in", values, "dpYn");
            return (Criteria) this;
        }

        public Criteria andDpYnBetween(String value1, String value2) {
            addCriterion("TC.DP_YN between", value1, value2, "dpYn");
            return (Criteria) this;
        }

        public Criteria andDpYnNotBetween(String value1, String value2) {
            addCriterion("TC.DP_YN not between", value1, value2, "dpYn");
            return (Criteria) this;
        }

        public Criteria andSysCdYnIsNull() {
            addCriterion("TC.SYS_CD_YN is null");
            return (Criteria) this;
        }

        public Criteria andSysCdYnIsNotNull() {
            addCriterion("TC.SYS_CD_YN is not null");
            return (Criteria) this;
        }

        public Criteria andSysCdYnEqualTo(String value) {
            addCriterion("TC.SYS_CD_YN =", value, "sysCdYn");
            return (Criteria) this;
        }

        public Criteria andSysCdYnNotEqualTo(String value) {
            addCriterion("TC.SYS_CD_YN <>", value, "sysCdYn");
            return (Criteria) this;
        }

        public Criteria andSysCdYnGreaterThan(String value) {
            addCriterion("TC.SYS_CD_YN >", value, "sysCdYn");
            return (Criteria) this;
        }

        public Criteria andSysCdYnGreaterThanOrEqualTo(String value) {
            addCriterion("TC.SYS_CD_YN >=", value, "sysCdYn");
            return (Criteria) this;
        }

        public Criteria andSysCdYnLessThan(String value) {
            addCriterion("TC.SYS_CD_YN <", value, "sysCdYn");
            return (Criteria) this;
        }

        public Criteria andSysCdYnLessThanOrEqualTo(String value) {
            addCriterion("TC.SYS_CD_YN <=", value, "sysCdYn");
            return (Criteria) this;
        }

        public Criteria andSysCdYnLike(String value) {
            addCriterion("TC.SYS_CD_YN like", value, "sysCdYn");
            return (Criteria) this;
        }

        public Criteria andSysCdYnNotLike(String value) {
            addCriterion("TC.SYS_CD_YN not like", value, "sysCdYn");
            return (Criteria) this;
        }

        public Criteria andSysCdYnIn(List<String> values) {
            addCriterion("TC.SYS_CD_YN in", values, "sysCdYn");
            return (Criteria) this;
        }

        public Criteria andSysCdYnNotIn(List<String> values) {
            addCriterion("TC.SYS_CD_YN not in", values, "sysCdYn");
            return (Criteria) this;
        }

        public Criteria andSysCdYnBetween(String value1, String value2) {
            addCriterion("TC.SYS_CD_YN between", value1, value2, "sysCdYn");
            return (Criteria) this;
        }

        public Criteria andSysCdYnNotBetween(String value1, String value2) {
            addCriterion("TC.SYS_CD_YN not between", value1, value2, "sysCdYn");
            return (Criteria) this;
        }

        public Criteria andNoteIsNull() {
            addCriterion("TC.NOTE is null");
            return (Criteria) this;
        }

        public Criteria andNoteIsNotNull() {
            addCriterion("TC.NOTE is not null");
            return (Criteria) this;
        }

        public Criteria andNoteEqualTo(String value) {
            addCriterion("TC.NOTE =", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteNotEqualTo(String value) {
            addCriterion("TC.NOTE <>", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteGreaterThan(String value) {
            addCriterion("TC.NOTE >", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteGreaterThanOrEqualTo(String value) {
            addCriterion("TC.NOTE >=", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteLessThan(String value) {
            addCriterion("TC.NOTE <", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteLessThanOrEqualTo(String value) {
            addCriterion("TC.NOTE <=", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteLike(String value) {
            addCriterion("TC.NOTE like", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteNotLike(String value) {
            addCriterion("TC.NOTE not like", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteIn(List<String> values) {
            addCriterion("TC.NOTE in", values, "note");
            return (Criteria) this;
        }

        public Criteria andNoteNotIn(List<String> values) {
            addCriterion("TC.NOTE not in", values, "note");
            return (Criteria) this;
        }

        public Criteria andNoteBetween(String value1, String value2) {
            addCriterion("TC.NOTE between", value1, value2, "note");
            return (Criteria) this;
        }

        public Criteria andNoteNotBetween(String value1, String value2) {
            addCriterion("TC.NOTE not between", value1, value2, "note");
            return (Criteria) this;
        }

        public Criteria andRegDtIsNull() {
            addCriterion("TC.REG_DT is null");
            return (Criteria) this;
        }

        public Criteria andRegDtIsNotNull() {
            addCriterion("TC.REG_DT is not null");
            return (Criteria) this;
        }

        public Criteria andRegDtEqualTo(Date value) {
            addCriterion("TC.REG_DT =", value, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtNotEqualTo(Date value) {
            addCriterion("TC.REG_DT <>", value, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtGreaterThan(Date value) {
            addCriterion("TC.REG_DT >", value, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtGreaterThanOrEqualTo(Date value) {
            addCriterion("TC.REG_DT >=", value, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtLessThan(Date value) {
            addCriterion("TC.REG_DT <", value, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtLessThanOrEqualTo(Date value) {
            addCriterion("TC.REG_DT <=", value, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtIn(List<Date> values) {
            addCriterion("TC.REG_DT in", values, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtNotIn(List<Date> values) {
            addCriterion("TC.REG_DT not in", values, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtBetween(Date value1, Date value2) {
            addCriterion("TC.REG_DT between", value1, value2, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtNotBetween(Date value1, Date value2) {
            addCriterion("TC.REG_DT not between", value1, value2, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegIdIsNull() {
            addCriterion("TC.REG_ID is null");
            return (Criteria) this;
        }

        public Criteria andRegIdIsNotNull() {
            addCriterion("TC.REG_ID is not null");
            return (Criteria) this;
        }

        public Criteria andRegIdEqualTo(String value) {
            addCriterion("TC.REG_ID =", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdNotEqualTo(String value) {
            addCriterion("TC.REG_ID <>", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdGreaterThan(String value) {
            addCriterion("TC.REG_ID >", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdGreaterThanOrEqualTo(String value) {
            addCriterion("TC.REG_ID >=", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdLessThan(String value) {
            addCriterion("TC.REG_ID <", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdLessThanOrEqualTo(String value) {
            addCriterion("TC.REG_ID <=", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdLike(String value) {
            addCriterion("TC.REG_ID like", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdNotLike(String value) {
            addCriterion("TC.REG_ID not like", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdIn(List<String> values) {
            addCriterion("TC.REG_ID in", values, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdNotIn(List<String> values) {
            addCriterion("TC.REG_ID not in", values, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdBetween(String value1, String value2) {
            addCriterion("TC.REG_ID between", value1, value2, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdNotBetween(String value1, String value2) {
            addCriterion("TC.REG_ID not between", value1, value2, "regId");
            return (Criteria) this;
        }

        public Criteria andModDtIsNull() {
            addCriterion("TC.MOD_DT is null");
            return (Criteria) this;
        }

        public Criteria andModDtIsNotNull() {
            addCriterion("TC.MOD_DT is not null");
            return (Criteria) this;
        }

        public Criteria andModDtEqualTo(Date value) {
            addCriterion("TC.MOD_DT =", value, "modDt");
            return (Criteria) this;
        }

        public Criteria andModDtNotEqualTo(Date value) {
            addCriterion("TC.MOD_DT <>", value, "modDt");
            return (Criteria) this;
        }

        public Criteria andModDtGreaterThan(Date value) {
            addCriterion("TC.MOD_DT >", value, "modDt");
            return (Criteria) this;
        }

        public Criteria andModDtGreaterThanOrEqualTo(Date value) {
            addCriterion("TC.MOD_DT >=", value, "modDt");
            return (Criteria) this;
        }

        public Criteria andModDtLessThan(Date value) {
            addCriterion("TC.MOD_DT <", value, "modDt");
            return (Criteria) this;
        }

        public Criteria andModDtLessThanOrEqualTo(Date value) {
            addCriterion("TC.MOD_DT <=", value, "modDt");
            return (Criteria) this;
        }

        public Criteria andModDtIn(List<Date> values) {
            addCriterion("TC.MOD_DT in", values, "modDt");
            return (Criteria) this;
        }

        public Criteria andModDtNotIn(List<Date> values) {
            addCriterion("TC.MOD_DT not in", values, "modDt");
            return (Criteria) this;
        }

        public Criteria andModDtBetween(Date value1, Date value2) {
            addCriterion("TC.MOD_DT between", value1, value2, "modDt");
            return (Criteria) this;
        }

        public Criteria andModDtNotBetween(Date value1, Date value2) {
            addCriterion("TC.MOD_DT not between", value1, value2, "modDt");
            return (Criteria) this;
        }

        public Criteria andModIdIsNull() {
            addCriterion("TC.MOD_ID is null");
            return (Criteria) this;
        }

        public Criteria andModIdIsNotNull() {
            addCriterion("TC.MOD_ID is not null");
            return (Criteria) this;
        }

        public Criteria andModIdEqualTo(String value) {
            addCriterion("TC.MOD_ID =", value, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdNotEqualTo(String value) {
            addCriterion("TC.MOD_ID <>", value, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdGreaterThan(String value) {
            addCriterion("TC.MOD_ID >", value, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdGreaterThanOrEqualTo(String value) {
            addCriterion("TC.MOD_ID >=", value, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdLessThan(String value) {
            addCriterion("TC.MOD_ID <", value, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdLessThanOrEqualTo(String value) {
            addCriterion("TC.MOD_ID <=", value, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdLike(String value) {
            addCriterion("TC.MOD_ID like", value, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdNotLike(String value) {
            addCriterion("TC.MOD_ID not like", value, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdIn(List<String> values) {
            addCriterion("TC.MOD_ID in", values, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdNotIn(List<String> values) {
            addCriterion("TC.MOD_ID not in", values, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdBetween(String value1, String value2) {
            addCriterion("TC.MOD_ID between", value1, value2, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdNotBetween(String value1, String value2) {
            addCriterion("TC.MOD_ID not between", value1, value2, "modId");
            return (Criteria) this;
        }

        public Criteria andUseYnIsNull() {
            addCriterion("TC.USE_YN is null");
            return (Criteria) this;
        }

        public Criteria andUseYnIsNotNull() {
            addCriterion("TC.USE_YN is not null");
            return (Criteria) this;
        }

        public Criteria andUseYnEqualTo(String value) {
            addCriterion("TC.USE_YN =", value, "useYn");
            return (Criteria) this;
        }

        public Criteria andUseYnNotEqualTo(String value) {
            addCriterion("TC.USE_YN <>", value, "useYn");
            return (Criteria) this;
        }

        public Criteria andUseYnGreaterThan(String value) {
            addCriterion("TC.USE_YN >", value, "useYn");
            return (Criteria) this;
        }

        public Criteria andUseYnGreaterThanOrEqualTo(String value) {
            addCriterion("TC.USE_YN >=", value, "useYn");
            return (Criteria) this;
        }

        public Criteria andUseYnLessThan(String value) {
            addCriterion("TC.USE_YN <", value, "useYn");
            return (Criteria) this;
        }

        public Criteria andUseYnLessThanOrEqualTo(String value) {
            addCriterion("TC.USE_YN <=", value, "useYn");
            return (Criteria) this;
        }

        public Criteria andUseYnLike(String value) {
            addCriterion("TC.USE_YN like", value, "useYn");
            return (Criteria) this;
        }

        public Criteria andUseYnNotLike(String value) {
            addCriterion("TC.USE_YN not like", value, "useYn");
            return (Criteria) this;
        }

        public Criteria andUseYnIn(List<String> values) {
            addCriterion("TC.USE_YN in", values, "useYn");
            return (Criteria) this;
        }

        public Criteria andUseYnNotIn(List<String> values) {
            addCriterion("TC.USE_YN not in", values, "useYn");
            return (Criteria) this;
        }

        public Criteria andUseYnBetween(String value1, String value2) {
            addCriterion("TC.USE_YN between", value1, value2, "useYn");
            return (Criteria) this;
        }

        public Criteria andUseYnNotBetween(String value1, String value2) {
            addCriterion("TC.USE_YN not between", value1, value2, "useYn");
            return (Criteria) this;
        }

        public Criteria andCdLikeInsensitive(String value) {
            addCriterion("upper(TC.CD) like", value.toUpperCase(), "cd");
            return (Criteria) this;
        }

        public Criteria andRefCdLikeInsensitive(String value) {
            addCriterion("upper(TC.REF_CD) like", value.toUpperCase(), "refCd");
            return (Criteria) this;
        }

        public Criteria andCdNmLikeInsensitive(String value) {
            addCriterion("upper(TC.CD_NM) like", value.toUpperCase(), "cdNm");
            return (Criteria) this;
        }

        public Criteria andCdAdd1ValLikeInsensitive(String value) {
            addCriterion("upper(TC.CD_ADD_1_VAL) like", value.toUpperCase(), "cdAdd1Val");
            return (Criteria) this;
        }

        public Criteria andCdAdd2ValLikeInsensitive(String value) {
            addCriterion("upper(TC.CD_ADD_2_VAL) like", value.toUpperCase(), "cdAdd2Val");
            return (Criteria) this;
        }

        public Criteria andCdAdd3ValLikeInsensitive(String value) {
            addCriterion("upper(TC.CD_ADD_3_VAL) like", value.toUpperCase(), "cdAdd3Val");
            return (Criteria) this;
        }

        public Criteria andDpYnLikeInsensitive(String value) {
            addCriterion("upper(TC.DP_YN) like", value.toUpperCase(), "dpYn");
            return (Criteria) this;
        }

        public Criteria andSysCdYnLikeInsensitive(String value) {
            addCriterion("upper(TC.SYS_CD_YN) like", value.toUpperCase(), "sysCdYn");
            return (Criteria) this;
        }

        public Criteria andNoteLikeInsensitive(String value) {
            addCriterion("upper(TC.NOTE) like", value.toUpperCase(), "note");
            return (Criteria) this;
        }

        public Criteria andRegIdLikeInsensitive(String value) {
            addCriterion("upper(TC.REG_ID) like", value.toUpperCase(), "regId");
            return (Criteria) this;
        }

        public Criteria andModIdLikeInsensitive(String value) {
            addCriterion("upper(TC.MOD_ID) like", value.toUpperCase(), "modId");
            return (Criteria) this;
        }

        public Criteria andUseYnLikeInsensitive(String value) {
            addCriterion("upper(TC.USE_YN) like", value.toUpperCase(), "useYn");
            return (Criteria) this;
        }

        public Criteria andCdLikeLeft(String value) {
            addCriterion("TC.CD like ", "%" + value, "cd");
            return (Criteria) this;
        }

        public Criteria andCdLikeRight(String value) {
            addCriterion("TC.CD like ", value + "%", "cd");
            return (Criteria) this;
        }

        public Criteria andCdLikeBoth(String value) {
            addCriterion("TC.CD like ", "%" + value + "%", "cd");
            return (Criteria) this;
        }

        public Criteria andRefCdLikeLeft(String value) {
            addCriterion("TC.REF_CD like ", "%" + value, "refCd");
            return (Criteria) this;
        }

        public Criteria andRefCdLikeRight(String value) {
            addCriterion("TC.REF_CD like ", value + "%", "refCd");
            return (Criteria) this;
        }

        public Criteria andRefCdLikeBoth(String value) {
            addCriterion("TC.REF_CD like ", "%" + value + "%", "refCd");
            return (Criteria) this;
        }

        public Criteria andCdNmLikeLeft(String value) {
            addCriterion("TC.CD_NM like ", "%" + value, "cdNm");
            return (Criteria) this;
        }

        public Criteria andCdNmLikeRight(String value) {
            addCriterion("TC.CD_NM like ", value + "%", "cdNm");
            return (Criteria) this;
        }

        public Criteria andCdNmLikeBoth(String value) {
            addCriterion("TC.CD_NM like ", "%" + value + "%", "cdNm");
            return (Criteria) this;
        }

        public Criteria andCdAdd1ValLikeLeft(String value) {
            addCriterion("TC.CD_ADD_1_VAL like ", "%" + value, "cdAdd1Val");
            return (Criteria) this;
        }

        public Criteria andCdAdd1ValLikeRight(String value) {
            addCriterion("TC.CD_ADD_1_VAL like ", value + "%", "cdAdd1Val");
            return (Criteria) this;
        }

        public Criteria andCdAdd1ValLikeBoth(String value) {
            addCriterion("TC.CD_ADD_1_VAL like ", "%" + value + "%", "cdAdd1Val");
            return (Criteria) this;
        }

        public Criteria andCdAdd2ValLikeLeft(String value) {
            addCriterion("TC.CD_ADD_2_VAL like ", "%" + value, "cdAdd2Val");
            return (Criteria) this;
        }

        public Criteria andCdAdd2ValLikeRight(String value) {
            addCriterion("TC.CD_ADD_2_VAL like ", value + "%", "cdAdd2Val");
            return (Criteria) this;
        }

        public Criteria andCdAdd2ValLikeBoth(String value) {
            addCriterion("TC.CD_ADD_2_VAL like ", "%" + value + "%", "cdAdd2Val");
            return (Criteria) this;
        }

        public Criteria andCdAdd3ValLikeLeft(String value) {
            addCriterion("TC.CD_ADD_3_VAL like ", "%" + value, "cdAdd3Val");
            return (Criteria) this;
        }

        public Criteria andCdAdd3ValLikeRight(String value) {
            addCriterion("TC.CD_ADD_3_VAL like ", value + "%", "cdAdd3Val");
            return (Criteria) this;
        }

        public Criteria andCdAdd3ValLikeBoth(String value) {
            addCriterion("TC.CD_ADD_3_VAL like ", "%" + value + "%", "cdAdd3Val");
            return (Criteria) this;
        }

        public Criteria andDpYnLikeLeft(String value) {
            addCriterion("TC.DP_YN like ", "%" + value, "dpYn");
            return (Criteria) this;
        }

        public Criteria andDpYnLikeRight(String value) {
            addCriterion("TC.DP_YN like ", value + "%", "dpYn");
            return (Criteria) this;
        }

        public Criteria andDpYnLikeBoth(String value) {
            addCriterion("TC.DP_YN like ", "%" + value + "%", "dpYn");
            return (Criteria) this;
        }

        public Criteria andSysCdYnLikeLeft(String value) {
            addCriterion("TC.SYS_CD_YN like ", "%" + value, "sysCdYn");
            return (Criteria) this;
        }

        public Criteria andSysCdYnLikeRight(String value) {
            addCriterion("TC.SYS_CD_YN like ", value + "%", "sysCdYn");
            return (Criteria) this;
        }

        public Criteria andSysCdYnLikeBoth(String value) {
            addCriterion("TC.SYS_CD_YN like ", "%" + value + "%", "sysCdYn");
            return (Criteria) this;
        }

        public Criteria andNoteLikeLeft(String value) {
            addCriterion("TC.NOTE like ", "%" + value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteLikeRight(String value) {
            addCriterion("TC.NOTE like ", value + "%", "note");
            return (Criteria) this;
        }

        public Criteria andNoteLikeBoth(String value) {
            addCriterion("TC.NOTE like ", "%" + value + "%", "note");
            return (Criteria) this;
        }

        public Criteria andRegIdLikeLeft(String value) {
            addCriterion("TC.REG_ID like ", "%" + value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdLikeRight(String value) {
            addCriterion("TC.REG_ID like ", value + "%", "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdLikeBoth(String value) {
            addCriterion("TC.REG_ID like ", "%" + value + "%", "regId");
            return (Criteria) this;
        }

        public Criteria andModIdLikeLeft(String value) {
            addCriterion("TC.MOD_ID like ", "%" + value, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdLikeRight(String value) {
            addCriterion("TC.MOD_ID like ", value + "%", "modId");
            return (Criteria) this;
        }

        public Criteria andModIdLikeBoth(String value) {
            addCriterion("TC.MOD_ID like ", "%" + value + "%", "modId");
            return (Criteria) this;
        }

        public Criteria andUseYnLikeLeft(String value) {
            addCriterion("TC.USE_YN like ", "%" + value, "useYn");
            return (Criteria) this;
        }

        public Criteria andUseYnLikeRight(String value) {
            addCriterion("TC.USE_YN like ", value + "%", "useYn");
            return (Criteria) this;
        }

        public Criteria andUseYnLikeBoth(String value) {
            addCriterion("TC.USE_YN like ", "%" + value + "%", "useYn");
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