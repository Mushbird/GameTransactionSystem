package com.mushbird.sinsege.base.module.ven.model.entity.criteria;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class VenEntityCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    public VenEntityCriteria() {
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

        public Criteria andVenIdIsNull() {
            addCriterion("TV.VEN_ID is null");
            return (Criteria) this;
        }

        public Criteria andVenIdIsNotNull() {
            addCriterion("TV.VEN_ID is not null");
            return (Criteria) this;
        }

        public Criteria andVenIdEqualTo(Integer value) {
            addCriterion("TV.VEN_ID =", value, "venId");
            return (Criteria) this;
        }

        public Criteria andVenIdNotEqualTo(Integer value) {
            addCriterion("TV.VEN_ID <>", value, "venId");
            return (Criteria) this;
        }

        public Criteria andVenIdGreaterThan(Integer value) {
            addCriterion("TV.VEN_ID >", value, "venId");
            return (Criteria) this;
        }

        public Criteria andVenIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("TV.VEN_ID >=", value, "venId");
            return (Criteria) this;
        }

        public Criteria andVenIdLessThan(Integer value) {
            addCriterion("TV.VEN_ID <", value, "venId");
            return (Criteria) this;
        }

        public Criteria andVenIdLessThanOrEqualTo(Integer value) {
            addCriterion("TV.VEN_ID <=", value, "venId");
            return (Criteria) this;
        }

        public Criteria andVenIdIn(List<Integer> values) {
            addCriterion("TV.VEN_ID in", values, "venId");
            return (Criteria) this;
        }

        public Criteria andVenIdNotIn(List<Integer> values) {
            addCriterion("TV.VEN_ID not in", values, "venId");
            return (Criteria) this;
        }

        public Criteria andVenIdBetween(Integer value1, Integer value2) {
            addCriterion("TV.VEN_ID between", value1, value2, "venId");
            return (Criteria) this;
        }

        public Criteria andVenIdNotBetween(Integer value1, Integer value2) {
            addCriterion("TV.VEN_ID not between", value1, value2, "venId");
            return (Criteria) this;
        }

        public Criteria andVenTpCdIsNull() {
            addCriterion("TV.VEN_TP_CD is null");
            return (Criteria) this;
        }

        public Criteria andVenTpCdIsNotNull() {
            addCriterion("TV.VEN_TP_CD is not null");
            return (Criteria) this;
        }

        public Criteria andVenTpCdEqualTo(String value) {
            addCriterion("TV.VEN_TP_CD =", value, "venTpCd");
            return (Criteria) this;
        }

        public Criteria andVenTpCdNotEqualTo(String value) {
            addCriterion("TV.VEN_TP_CD <>", value, "venTpCd");
            return (Criteria) this;
        }

        public Criteria andVenTpCdGreaterThan(String value) {
            addCriterion("TV.VEN_TP_CD >", value, "venTpCd");
            return (Criteria) this;
        }

        public Criteria andVenTpCdGreaterThanOrEqualTo(String value) {
            addCriterion("TV.VEN_TP_CD >=", value, "venTpCd");
            return (Criteria) this;
        }

        public Criteria andVenTpCdLessThan(String value) {
            addCriterion("TV.VEN_TP_CD <", value, "venTpCd");
            return (Criteria) this;
        }

        public Criteria andVenTpCdLessThanOrEqualTo(String value) {
            addCriterion("TV.VEN_TP_CD <=", value, "venTpCd");
            return (Criteria) this;
        }

        public Criteria andVenTpCdLike(String value) {
            addCriterion("TV.VEN_TP_CD like", value, "venTpCd");
            return (Criteria) this;
        }

        public Criteria andVenTpCdNotLike(String value) {
            addCriterion("TV.VEN_TP_CD not like", value, "venTpCd");
            return (Criteria) this;
        }

        public Criteria andVenTpCdIn(List<String> values) {
            addCriterion("TV.VEN_TP_CD in", values, "venTpCd");
            return (Criteria) this;
        }

        public Criteria andVenTpCdNotIn(List<String> values) {
            addCriterion("TV.VEN_TP_CD not in", values, "venTpCd");
            return (Criteria) this;
        }

        public Criteria andVenTpCdBetween(String value1, String value2) {
            addCriterion("TV.VEN_TP_CD between", value1, value2, "venTpCd");
            return (Criteria) this;
        }

        public Criteria andVenTpCdNotBetween(String value1, String value2) {
            addCriterion("TV.VEN_TP_CD not between", value1, value2, "venTpCd");
            return (Criteria) this;
        }

        public Criteria andEtrVenClCdIsNull() {
            addCriterion("TV.ETR_VEN_CL_CD is null");
            return (Criteria) this;
        }

        public Criteria andEtrVenClCdIsNotNull() {
            addCriterion("TV.ETR_VEN_CL_CD is not null");
            return (Criteria) this;
        }

        public Criteria andEtrVenClCdEqualTo(String value) {
            addCriterion("TV.ETR_VEN_CL_CD =", value, "etrVenClCd");
            return (Criteria) this;
        }

        public Criteria andEtrVenClCdNotEqualTo(String value) {
            addCriterion("TV.ETR_VEN_CL_CD <>", value, "etrVenClCd");
            return (Criteria) this;
        }

        public Criteria andEtrVenClCdGreaterThan(String value) {
            addCriterion("TV.ETR_VEN_CL_CD >", value, "etrVenClCd");
            return (Criteria) this;
        }

        public Criteria andEtrVenClCdGreaterThanOrEqualTo(String value) {
            addCriterion("TV.ETR_VEN_CL_CD >=", value, "etrVenClCd");
            return (Criteria) this;
        }

        public Criteria andEtrVenClCdLessThan(String value) {
            addCriterion("TV.ETR_VEN_CL_CD <", value, "etrVenClCd");
            return (Criteria) this;
        }

        public Criteria andEtrVenClCdLessThanOrEqualTo(String value) {
            addCriterion("TV.ETR_VEN_CL_CD <=", value, "etrVenClCd");
            return (Criteria) this;
        }

        public Criteria andEtrVenClCdLike(String value) {
            addCriterion("TV.ETR_VEN_CL_CD like", value, "etrVenClCd");
            return (Criteria) this;
        }

        public Criteria andEtrVenClCdNotLike(String value) {
            addCriterion("TV.ETR_VEN_CL_CD not like", value, "etrVenClCd");
            return (Criteria) this;
        }

        public Criteria andEtrVenClCdIn(List<String> values) {
            addCriterion("TV.ETR_VEN_CL_CD in", values, "etrVenClCd");
            return (Criteria) this;
        }

        public Criteria andEtrVenClCdNotIn(List<String> values) {
            addCriterion("TV.ETR_VEN_CL_CD not in", values, "etrVenClCd");
            return (Criteria) this;
        }

        public Criteria andEtrVenClCdBetween(String value1, String value2) {
            addCriterion("TV.ETR_VEN_CL_CD between", value1, value2, "etrVenClCd");
            return (Criteria) this;
        }

        public Criteria andEtrVenClCdNotBetween(String value1, String value2) {
            addCriterion("TV.ETR_VEN_CL_CD not between", value1, value2, "etrVenClCd");
            return (Criteria) this;
        }

        public Criteria andVenStatCdIsNull() {
            addCriterion("TV.VEN_STAT_CD is null");
            return (Criteria) this;
        }

        public Criteria andVenStatCdIsNotNull() {
            addCriterion("TV.VEN_STAT_CD is not null");
            return (Criteria) this;
        }

        public Criteria andVenStatCdEqualTo(String value) {
            addCriterion("TV.VEN_STAT_CD =", value, "venStatCd");
            return (Criteria) this;
        }

        public Criteria andVenStatCdNotEqualTo(String value) {
            addCriterion("TV.VEN_STAT_CD <>", value, "venStatCd");
            return (Criteria) this;
        }

        public Criteria andVenStatCdGreaterThan(String value) {
            addCriterion("TV.VEN_STAT_CD >", value, "venStatCd");
            return (Criteria) this;
        }

        public Criteria andVenStatCdGreaterThanOrEqualTo(String value) {
            addCriterion("TV.VEN_STAT_CD >=", value, "venStatCd");
            return (Criteria) this;
        }

        public Criteria andVenStatCdLessThan(String value) {
            addCriterion("TV.VEN_STAT_CD <", value, "venStatCd");
            return (Criteria) this;
        }

        public Criteria andVenStatCdLessThanOrEqualTo(String value) {
            addCriterion("TV.VEN_STAT_CD <=", value, "venStatCd");
            return (Criteria) this;
        }

        public Criteria andVenStatCdLike(String value) {
            addCriterion("TV.VEN_STAT_CD like", value, "venStatCd");
            return (Criteria) this;
        }

        public Criteria andVenStatCdNotLike(String value) {
            addCriterion("TV.VEN_STAT_CD not like", value, "venStatCd");
            return (Criteria) this;
        }

        public Criteria andVenStatCdIn(List<String> values) {
            addCriterion("TV.VEN_STAT_CD in", values, "venStatCd");
            return (Criteria) this;
        }

        public Criteria andVenStatCdNotIn(List<String> values) {
            addCriterion("TV.VEN_STAT_CD not in", values, "venStatCd");
            return (Criteria) this;
        }

        public Criteria andVenStatCdBetween(String value1, String value2) {
            addCriterion("TV.VEN_STAT_CD between", value1, value2, "venStatCd");
            return (Criteria) this;
        }

        public Criteria andVenStatCdNotBetween(String value1, String value2) {
            addCriterion("TV.VEN_STAT_CD not between", value1, value2, "venStatCd");
            return (Criteria) this;
        }

        public Criteria andVenCdIsNull() {
            addCriterion("TV.VEN_CD is null");
            return (Criteria) this;
        }

        public Criteria andVenCdIsNotNull() {
            addCriterion("TV.VEN_CD is not null");
            return (Criteria) this;
        }

        public Criteria andVenCdEqualTo(String value) {
            addCriterion("TV.VEN_CD =", value, "venCd");
            return (Criteria) this;
        }

        public Criteria andVenCdNotEqualTo(String value) {
            addCriterion("TV.VEN_CD <>", value, "venCd");
            return (Criteria) this;
        }

        public Criteria andVenCdGreaterThan(String value) {
            addCriterion("TV.VEN_CD >", value, "venCd");
            return (Criteria) this;
        }

        public Criteria andVenCdGreaterThanOrEqualTo(String value) {
            addCriterion("TV.VEN_CD >=", value, "venCd");
            return (Criteria) this;
        }

        public Criteria andVenCdLessThan(String value) {
            addCriterion("TV.VEN_CD <", value, "venCd");
            return (Criteria) this;
        }

        public Criteria andVenCdLessThanOrEqualTo(String value) {
            addCriterion("TV.VEN_CD <=", value, "venCd");
            return (Criteria) this;
        }

        public Criteria andVenCdLike(String value) {
            addCriterion("TV.VEN_CD like", value, "venCd");
            return (Criteria) this;
        }

        public Criteria andVenCdNotLike(String value) {
            addCriterion("TV.VEN_CD not like", value, "venCd");
            return (Criteria) this;
        }

        public Criteria andVenCdIn(List<String> values) {
            addCriterion("TV.VEN_CD in", values, "venCd");
            return (Criteria) this;
        }

        public Criteria andVenCdNotIn(List<String> values) {
            addCriterion("TV.VEN_CD not in", values, "venCd");
            return (Criteria) this;
        }

        public Criteria andVenCdBetween(String value1, String value2) {
            addCriterion("TV.VEN_CD between", value1, value2, "venCd");
            return (Criteria) this;
        }

        public Criteria andVenCdNotBetween(String value1, String value2) {
            addCriterion("TV.VEN_CD not between", value1, value2, "venCd");
            return (Criteria) this;
        }

        public Criteria andVenNmIsNull() {
            addCriterion("TV.VEN_NM is null");
            return (Criteria) this;
        }

        public Criteria andVenNmIsNotNull() {
            addCriterion("TV.VEN_NM is not null");
            return (Criteria) this;
        }

        public Criteria andVenNmEqualTo(String value) {
            addCriterion("TV.VEN_NM =", value, "venNm");
            return (Criteria) this;
        }

        public Criteria andVenNmNotEqualTo(String value) {
            addCriterion("TV.VEN_NM <>", value, "venNm");
            return (Criteria) this;
        }

        public Criteria andVenNmGreaterThan(String value) {
            addCriterion("TV.VEN_NM >", value, "venNm");
            return (Criteria) this;
        }

        public Criteria andVenNmGreaterThanOrEqualTo(String value) {
            addCriterion("TV.VEN_NM >=", value, "venNm");
            return (Criteria) this;
        }

        public Criteria andVenNmLessThan(String value) {
            addCriterion("TV.VEN_NM <", value, "venNm");
            return (Criteria) this;
        }

        public Criteria andVenNmLessThanOrEqualTo(String value) {
            addCriterion("TV.VEN_NM <=", value, "venNm");
            return (Criteria) this;
        }

        public Criteria andVenNmLike(String value) {
            addCriterion("TV.VEN_NM like", value, "venNm");
            return (Criteria) this;
        }

        public Criteria andVenNmNotLike(String value) {
            addCriterion("TV.VEN_NM not like", value, "venNm");
            return (Criteria) this;
        }

        public Criteria andVenNmIn(List<String> values) {
            addCriterion("TV.VEN_NM in", values, "venNm");
            return (Criteria) this;
        }

        public Criteria andVenNmNotIn(List<String> values) {
            addCriterion("TV.VEN_NM not in", values, "venNm");
            return (Criteria) this;
        }

        public Criteria andVenNmBetween(String value1, String value2) {
            addCriterion("TV.VEN_NM between", value1, value2, "venNm");
            return (Criteria) this;
        }

        public Criteria andVenNmNotBetween(String value1, String value2) {
            addCriterion("TV.VEN_NM not between", value1, value2, "venNm");
            return (Criteria) this;
        }

        public Criteria andRepNmIsNull() {
            addCriterion("TV.REP_NM is null");
            return (Criteria) this;
        }

        public Criteria andRepNmIsNotNull() {
            addCriterion("TV.REP_NM is not null");
            return (Criteria) this;
        }

        public Criteria andRepNmEqualTo(String value) {
            addCriterion("TV.REP_NM =", value, "repNm");
            return (Criteria) this;
        }

        public Criteria andRepNmNotEqualTo(String value) {
            addCriterion("TV.REP_NM <>", value, "repNm");
            return (Criteria) this;
        }

        public Criteria andRepNmGreaterThan(String value) {
            addCriterion("TV.REP_NM >", value, "repNm");
            return (Criteria) this;
        }

        public Criteria andRepNmGreaterThanOrEqualTo(String value) {
            addCriterion("TV.REP_NM >=", value, "repNm");
            return (Criteria) this;
        }

        public Criteria andRepNmLessThan(String value) {
            addCriterion("TV.REP_NM <", value, "repNm");
            return (Criteria) this;
        }

        public Criteria andRepNmLessThanOrEqualTo(String value) {
            addCriterion("TV.REP_NM <=", value, "repNm");
            return (Criteria) this;
        }

        public Criteria andRepNmLike(String value) {
            addCriterion("TV.REP_NM like", value, "repNm");
            return (Criteria) this;
        }

        public Criteria andRepNmNotLike(String value) {
            addCriterion("TV.REP_NM not like", value, "repNm");
            return (Criteria) this;
        }

        public Criteria andRepNmIn(List<String> values) {
            addCriterion("TV.REP_NM in", values, "repNm");
            return (Criteria) this;
        }

        public Criteria andRepNmNotIn(List<String> values) {
            addCriterion("TV.REP_NM not in", values, "repNm");
            return (Criteria) this;
        }

        public Criteria andRepNmBetween(String value1, String value2) {
            addCriterion("TV.REP_NM between", value1, value2, "repNm");
            return (Criteria) this;
        }

        public Criteria andRepNmNotBetween(String value1, String value2) {
            addCriterion("TV.REP_NM not between", value1, value2, "repNm");
            return (Criteria) this;
        }

        public Criteria andTelNoIsNull() {
            addCriterion("TV.TEL_NO is null");
            return (Criteria) this;
        }

        public Criteria andTelNoIsNotNull() {
            addCriterion("TV.TEL_NO is not null");
            return (Criteria) this;
        }

        public Criteria andTelNoEqualTo(String value) {
            addCriterion("TV.TEL_NO =", value, "telNo");
            return (Criteria) this;
        }

        public Criteria andTelNoNotEqualTo(String value) {
            addCriterion("TV.TEL_NO <>", value, "telNo");
            return (Criteria) this;
        }

        public Criteria andTelNoGreaterThan(String value) {
            addCriterion("TV.TEL_NO >", value, "telNo");
            return (Criteria) this;
        }

        public Criteria andTelNoGreaterThanOrEqualTo(String value) {
            addCriterion("TV.TEL_NO >=", value, "telNo");
            return (Criteria) this;
        }

        public Criteria andTelNoLessThan(String value) {
            addCriterion("TV.TEL_NO <", value, "telNo");
            return (Criteria) this;
        }

        public Criteria andTelNoLessThanOrEqualTo(String value) {
            addCriterion("TV.TEL_NO <=", value, "telNo");
            return (Criteria) this;
        }

        public Criteria andTelNoLike(String value) {
            addCriterion("TV.TEL_NO like", value, "telNo");
            return (Criteria) this;
        }

        public Criteria andTelNoNotLike(String value) {
            addCriterion("TV.TEL_NO not like", value, "telNo");
            return (Criteria) this;
        }

        public Criteria andTelNoIn(List<String> values) {
            addCriterion("TV.TEL_NO in", values, "telNo");
            return (Criteria) this;
        }

        public Criteria andTelNoNotIn(List<String> values) {
            addCriterion("TV.TEL_NO not in", values, "telNo");
            return (Criteria) this;
        }

        public Criteria andTelNoBetween(String value1, String value2) {
            addCriterion("TV.TEL_NO between", value1, value2, "telNo");
            return (Criteria) this;
        }

        public Criteria andTelNoNotBetween(String value1, String value2) {
            addCriterion("TV.TEL_NO not between", value1, value2, "telNo");
            return (Criteria) this;
        }

        public Criteria andCpNoIsNull() {
            addCriterion("TV.CP_NO is null");
            return (Criteria) this;
        }

        public Criteria andCpNoIsNotNull() {
            addCriterion("TV.CP_NO is not null");
            return (Criteria) this;
        }

        public Criteria andCpNoEqualTo(String value) {
            addCriterion("TV.CP_NO =", value, "cpNo");
            return (Criteria) this;
        }

        public Criteria andCpNoNotEqualTo(String value) {
            addCriterion("TV.CP_NO <>", value, "cpNo");
            return (Criteria) this;
        }

        public Criteria andCpNoGreaterThan(String value) {
            addCriterion("TV.CP_NO >", value, "cpNo");
            return (Criteria) this;
        }

        public Criteria andCpNoGreaterThanOrEqualTo(String value) {
            addCriterion("TV.CP_NO >=", value, "cpNo");
            return (Criteria) this;
        }

        public Criteria andCpNoLessThan(String value) {
            addCriterion("TV.CP_NO <", value, "cpNo");
            return (Criteria) this;
        }

        public Criteria andCpNoLessThanOrEqualTo(String value) {
            addCriterion("TV.CP_NO <=", value, "cpNo");
            return (Criteria) this;
        }

        public Criteria andCpNoLike(String value) {
            addCriterion("TV.CP_NO like", value, "cpNo");
            return (Criteria) this;
        }

        public Criteria andCpNoNotLike(String value) {
            addCriterion("TV.CP_NO not like", value, "cpNo");
            return (Criteria) this;
        }

        public Criteria andCpNoIn(List<String> values) {
            addCriterion("TV.CP_NO in", values, "cpNo");
            return (Criteria) this;
        }

        public Criteria andCpNoNotIn(List<String> values) {
            addCriterion("TV.CP_NO not in", values, "cpNo");
            return (Criteria) this;
        }

        public Criteria andCpNoBetween(String value1, String value2) {
            addCriterion("TV.CP_NO between", value1, value2, "cpNo");
            return (Criteria) this;
        }

        public Criteria andCpNoNotBetween(String value1, String value2) {
            addCriterion("TV.CP_NO not between", value1, value2, "cpNo");
            return (Criteria) this;
        }

        public Criteria andFaxNoIsNull() {
            addCriterion("TV.FAX_NO is null");
            return (Criteria) this;
        }

        public Criteria andFaxNoIsNotNull() {
            addCriterion("TV.FAX_NO is not null");
            return (Criteria) this;
        }

        public Criteria andFaxNoEqualTo(String value) {
            addCriterion("TV.FAX_NO =", value, "faxNo");
            return (Criteria) this;
        }

        public Criteria andFaxNoNotEqualTo(String value) {
            addCriterion("TV.FAX_NO <>", value, "faxNo");
            return (Criteria) this;
        }

        public Criteria andFaxNoGreaterThan(String value) {
            addCriterion("TV.FAX_NO >", value, "faxNo");
            return (Criteria) this;
        }

        public Criteria andFaxNoGreaterThanOrEqualTo(String value) {
            addCriterion("TV.FAX_NO >=", value, "faxNo");
            return (Criteria) this;
        }

        public Criteria andFaxNoLessThan(String value) {
            addCriterion("TV.FAX_NO <", value, "faxNo");
            return (Criteria) this;
        }

        public Criteria andFaxNoLessThanOrEqualTo(String value) {
            addCriterion("TV.FAX_NO <=", value, "faxNo");
            return (Criteria) this;
        }

        public Criteria andFaxNoLike(String value) {
            addCriterion("TV.FAX_NO like", value, "faxNo");
            return (Criteria) this;
        }

        public Criteria andFaxNoNotLike(String value) {
            addCriterion("TV.FAX_NO not like", value, "faxNo");
            return (Criteria) this;
        }

        public Criteria andFaxNoIn(List<String> values) {
            addCriterion("TV.FAX_NO in", values, "faxNo");
            return (Criteria) this;
        }

        public Criteria andFaxNoNotIn(List<String> values) {
            addCriterion("TV.FAX_NO not in", values, "faxNo");
            return (Criteria) this;
        }

        public Criteria andFaxNoBetween(String value1, String value2) {
            addCriterion("TV.FAX_NO between", value1, value2, "faxNo");
            return (Criteria) this;
        }

        public Criteria andFaxNoNotBetween(String value1, String value2) {
            addCriterion("TV.FAX_NO not between", value1, value2, "faxNo");
            return (Criteria) this;
        }

        public Criteria andEmailIsNull() {
            addCriterion("TV.EMAIL is null");
            return (Criteria) this;
        }

        public Criteria andEmailIsNotNull() {
            addCriterion("TV.EMAIL is not null");
            return (Criteria) this;
        }

        public Criteria andEmailEqualTo(String value) {
            addCriterion("TV.EMAIL =", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotEqualTo(String value) {
            addCriterion("TV.EMAIL <>", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThan(String value) {
            addCriterion("TV.EMAIL >", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThanOrEqualTo(String value) {
            addCriterion("TV.EMAIL >=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThan(String value) {
            addCriterion("TV.EMAIL <", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThanOrEqualTo(String value) {
            addCriterion("TV.EMAIL <=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLike(String value) {
            addCriterion("TV.EMAIL like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotLike(String value) {
            addCriterion("TV.EMAIL not like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailIn(List<String> values) {
            addCriterion("TV.EMAIL in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotIn(List<String> values) {
            addCriterion("TV.EMAIL not in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailBetween(String value1, String value2) {
            addCriterion("TV.EMAIL between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotBetween(String value1, String value2) {
            addCriterion("TV.EMAIL not between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andZipcdIsNull() {
            addCriterion("TV.ZIPCD is null");
            return (Criteria) this;
        }

        public Criteria andZipcdIsNotNull() {
            addCriterion("TV.ZIPCD is not null");
            return (Criteria) this;
        }

        public Criteria andZipcdEqualTo(String value) {
            addCriterion("TV.ZIPCD =", value, "zipcd");
            return (Criteria) this;
        }

        public Criteria andZipcdNotEqualTo(String value) {
            addCriterion("TV.ZIPCD <>", value, "zipcd");
            return (Criteria) this;
        }

        public Criteria andZipcdGreaterThan(String value) {
            addCriterion("TV.ZIPCD >", value, "zipcd");
            return (Criteria) this;
        }

        public Criteria andZipcdGreaterThanOrEqualTo(String value) {
            addCriterion("TV.ZIPCD >=", value, "zipcd");
            return (Criteria) this;
        }

        public Criteria andZipcdLessThan(String value) {
            addCriterion("TV.ZIPCD <", value, "zipcd");
            return (Criteria) this;
        }

        public Criteria andZipcdLessThanOrEqualTo(String value) {
            addCriterion("TV.ZIPCD <=", value, "zipcd");
            return (Criteria) this;
        }

        public Criteria andZipcdLike(String value) {
            addCriterion("TV.ZIPCD like", value, "zipcd");
            return (Criteria) this;
        }

        public Criteria andZipcdNotLike(String value) {
            addCriterion("TV.ZIPCD not like", value, "zipcd");
            return (Criteria) this;
        }

        public Criteria andZipcdIn(List<String> values) {
            addCriterion("TV.ZIPCD in", values, "zipcd");
            return (Criteria) this;
        }

        public Criteria andZipcdNotIn(List<String> values) {
            addCriterion("TV.ZIPCD not in", values, "zipcd");
            return (Criteria) this;
        }

        public Criteria andZipcdBetween(String value1, String value2) {
            addCriterion("TV.ZIPCD between", value1, value2, "zipcd");
            return (Criteria) this;
        }

        public Criteria andZipcdNotBetween(String value1, String value2) {
            addCriterion("TV.ZIPCD not between", value1, value2, "zipcd");
            return (Criteria) this;
        }

        public Criteria andAddrIsNull() {
            addCriterion("TV.ADDR is null");
            return (Criteria) this;
        }

        public Criteria andAddrIsNotNull() {
            addCriterion("TV.ADDR is not null");
            return (Criteria) this;
        }

        public Criteria andAddrEqualTo(String value) {
            addCriterion("TV.ADDR =", value, "addr");
            return (Criteria) this;
        }

        public Criteria andAddrNotEqualTo(String value) {
            addCriterion("TV.ADDR <>", value, "addr");
            return (Criteria) this;
        }

        public Criteria andAddrGreaterThan(String value) {
            addCriterion("TV.ADDR >", value, "addr");
            return (Criteria) this;
        }

        public Criteria andAddrGreaterThanOrEqualTo(String value) {
            addCriterion("TV.ADDR >=", value, "addr");
            return (Criteria) this;
        }

        public Criteria andAddrLessThan(String value) {
            addCriterion("TV.ADDR <", value, "addr");
            return (Criteria) this;
        }

        public Criteria andAddrLessThanOrEqualTo(String value) {
            addCriterion("TV.ADDR <=", value, "addr");
            return (Criteria) this;
        }

        public Criteria andAddrLike(String value) {
            addCriterion("TV.ADDR like", value, "addr");
            return (Criteria) this;
        }

        public Criteria andAddrNotLike(String value) {
            addCriterion("TV.ADDR not like", value, "addr");
            return (Criteria) this;
        }

        public Criteria andAddrIn(List<String> values) {
            addCriterion("TV.ADDR in", values, "addr");
            return (Criteria) this;
        }

        public Criteria andAddrNotIn(List<String> values) {
            addCriterion("TV.ADDR not in", values, "addr");
            return (Criteria) this;
        }

        public Criteria andAddrBetween(String value1, String value2) {
            addCriterion("TV.ADDR between", value1, value2, "addr");
            return (Criteria) this;
        }

        public Criteria andAddrNotBetween(String value1, String value2) {
            addCriterion("TV.ADDR not between", value1, value2, "addr");
            return (Criteria) this;
        }

        public Criteria andBizClCdIsNull() {
            addCriterion("TV.BIZ_CL_CD is null");
            return (Criteria) this;
        }

        public Criteria andBizClCdIsNotNull() {
            addCriterion("TV.BIZ_CL_CD is not null");
            return (Criteria) this;
        }

        public Criteria andBizClCdEqualTo(String value) {
            addCriterion("TV.BIZ_CL_CD =", value, "bizClCd");
            return (Criteria) this;
        }

        public Criteria andBizClCdNotEqualTo(String value) {
            addCriterion("TV.BIZ_CL_CD <>", value, "bizClCd");
            return (Criteria) this;
        }

        public Criteria andBizClCdGreaterThan(String value) {
            addCriterion("TV.BIZ_CL_CD >", value, "bizClCd");
            return (Criteria) this;
        }

        public Criteria andBizClCdGreaterThanOrEqualTo(String value) {
            addCriterion("TV.BIZ_CL_CD >=", value, "bizClCd");
            return (Criteria) this;
        }

        public Criteria andBizClCdLessThan(String value) {
            addCriterion("TV.BIZ_CL_CD <", value, "bizClCd");
            return (Criteria) this;
        }

        public Criteria andBizClCdLessThanOrEqualTo(String value) {
            addCriterion("TV.BIZ_CL_CD <=", value, "bizClCd");
            return (Criteria) this;
        }

        public Criteria andBizClCdLike(String value) {
            addCriterion("TV.BIZ_CL_CD like", value, "bizClCd");
            return (Criteria) this;
        }

        public Criteria andBizClCdNotLike(String value) {
            addCriterion("TV.BIZ_CL_CD not like", value, "bizClCd");
            return (Criteria) this;
        }

        public Criteria andBizClCdIn(List<String> values) {
            addCriterion("TV.BIZ_CL_CD in", values, "bizClCd");
            return (Criteria) this;
        }

        public Criteria andBizClCdNotIn(List<String> values) {
            addCriterion("TV.BIZ_CL_CD not in", values, "bizClCd");
            return (Criteria) this;
        }

        public Criteria andBizClCdBetween(String value1, String value2) {
            addCriterion("TV.BIZ_CL_CD between", value1, value2, "bizClCd");
            return (Criteria) this;
        }

        public Criteria andBizClCdNotBetween(String value1, String value2) {
            addCriterion("TV.BIZ_CL_CD not between", value1, value2, "bizClCd");
            return (Criteria) this;
        }

        public Criteria andBizNoIsNull() {
            addCriterion("TV.BIZ_NO is null");
            return (Criteria) this;
        }

        public Criteria andBizNoIsNotNull() {
            addCriterion("TV.BIZ_NO is not null");
            return (Criteria) this;
        }

        public Criteria andBizNoEqualTo(String value) {
            addCriterion("TV.BIZ_NO =", value, "bizNo");
            return (Criteria) this;
        }

        public Criteria andBizNoNotEqualTo(String value) {
            addCriterion("TV.BIZ_NO <>", value, "bizNo");
            return (Criteria) this;
        }

        public Criteria andBizNoGreaterThan(String value) {
            addCriterion("TV.BIZ_NO >", value, "bizNo");
            return (Criteria) this;
        }

        public Criteria andBizNoGreaterThanOrEqualTo(String value) {
            addCriterion("TV.BIZ_NO >=", value, "bizNo");
            return (Criteria) this;
        }

        public Criteria andBizNoLessThan(String value) {
            addCriterion("TV.BIZ_NO <", value, "bizNo");
            return (Criteria) this;
        }

        public Criteria andBizNoLessThanOrEqualTo(String value) {
            addCriterion("TV.BIZ_NO <=", value, "bizNo");
            return (Criteria) this;
        }

        public Criteria andBizNoLike(String value) {
            addCriterion("TV.BIZ_NO like", value, "bizNo");
            return (Criteria) this;
        }

        public Criteria andBizNoNotLike(String value) {
            addCriterion("TV.BIZ_NO not like", value, "bizNo");
            return (Criteria) this;
        }

        public Criteria andBizNoIn(List<String> values) {
            addCriterion("TV.BIZ_NO in", values, "bizNo");
            return (Criteria) this;
        }

        public Criteria andBizNoNotIn(List<String> values) {
            addCriterion("TV.BIZ_NO not in", values, "bizNo");
            return (Criteria) this;
        }

        public Criteria andBizNoBetween(String value1, String value2) {
            addCriterion("TV.BIZ_NO between", value1, value2, "bizNo");
            return (Criteria) this;
        }

        public Criteria andBizNoNotBetween(String value1, String value2) {
            addCriterion("TV.BIZ_NO not between", value1, value2, "bizNo");
            return (Criteria) this;
        }

        public Criteria andIncNoIsNull() {
            addCriterion("TV.INC_NO is null");
            return (Criteria) this;
        }

        public Criteria andIncNoIsNotNull() {
            addCriterion("TV.INC_NO is not null");
            return (Criteria) this;
        }

        public Criteria andIncNoEqualTo(String value) {
            addCriterion("TV.INC_NO =", value, "incNo");
            return (Criteria) this;
        }

        public Criteria andIncNoNotEqualTo(String value) {
            addCriterion("TV.INC_NO <>", value, "incNo");
            return (Criteria) this;
        }

        public Criteria andIncNoGreaterThan(String value) {
            addCriterion("TV.INC_NO >", value, "incNo");
            return (Criteria) this;
        }

        public Criteria andIncNoGreaterThanOrEqualTo(String value) {
            addCriterion("TV.INC_NO >=", value, "incNo");
            return (Criteria) this;
        }

        public Criteria andIncNoLessThan(String value) {
            addCriterion("TV.INC_NO <", value, "incNo");
            return (Criteria) this;
        }

        public Criteria andIncNoLessThanOrEqualTo(String value) {
            addCriterion("TV.INC_NO <=", value, "incNo");
            return (Criteria) this;
        }

        public Criteria andIncNoLike(String value) {
            addCriterion("TV.INC_NO like", value, "incNo");
            return (Criteria) this;
        }

        public Criteria andIncNoNotLike(String value) {
            addCriterion("TV.INC_NO not like", value, "incNo");
            return (Criteria) this;
        }

        public Criteria andIncNoIn(List<String> values) {
            addCriterion("TV.INC_NO in", values, "incNo");
            return (Criteria) this;
        }

        public Criteria andIncNoNotIn(List<String> values) {
            addCriterion("TV.INC_NO not in", values, "incNo");
            return (Criteria) this;
        }

        public Criteria andIncNoBetween(String value1, String value2) {
            addCriterion("TV.INC_NO between", value1, value2, "incNo");
            return (Criteria) this;
        }

        public Criteria andIncNoNotBetween(String value1, String value2) {
            addCriterion("TV.INC_NO not between", value1, value2, "incNo");
            return (Criteria) this;
        }

        public Criteria andBizCondIsNull() {
            addCriterion("TV.BIZ_COND is null");
            return (Criteria) this;
        }

        public Criteria andBizCondIsNotNull() {
            addCriterion("TV.BIZ_COND is not null");
            return (Criteria) this;
        }

        public Criteria andBizCondEqualTo(String value) {
            addCriterion("TV.BIZ_COND =", value, "bizCond");
            return (Criteria) this;
        }

        public Criteria andBizCondNotEqualTo(String value) {
            addCriterion("TV.BIZ_COND <>", value, "bizCond");
            return (Criteria) this;
        }

        public Criteria andBizCondGreaterThan(String value) {
            addCriterion("TV.BIZ_COND >", value, "bizCond");
            return (Criteria) this;
        }

        public Criteria andBizCondGreaterThanOrEqualTo(String value) {
            addCriterion("TV.BIZ_COND >=", value, "bizCond");
            return (Criteria) this;
        }

        public Criteria andBizCondLessThan(String value) {
            addCriterion("TV.BIZ_COND <", value, "bizCond");
            return (Criteria) this;
        }

        public Criteria andBizCondLessThanOrEqualTo(String value) {
            addCriterion("TV.BIZ_COND <=", value, "bizCond");
            return (Criteria) this;
        }

        public Criteria andBizCondLike(String value) {
            addCriterion("TV.BIZ_COND like", value, "bizCond");
            return (Criteria) this;
        }

        public Criteria andBizCondNotLike(String value) {
            addCriterion("TV.BIZ_COND not like", value, "bizCond");
            return (Criteria) this;
        }

        public Criteria andBizCondIn(List<String> values) {
            addCriterion("TV.BIZ_COND in", values, "bizCond");
            return (Criteria) this;
        }

        public Criteria andBizCondNotIn(List<String> values) {
            addCriterion("TV.BIZ_COND not in", values, "bizCond");
            return (Criteria) this;
        }

        public Criteria andBizCondBetween(String value1, String value2) {
            addCriterion("TV.BIZ_COND between", value1, value2, "bizCond");
            return (Criteria) this;
        }

        public Criteria andBizCondNotBetween(String value1, String value2) {
            addCriterion("TV.BIZ_COND not between", value1, value2, "bizCond");
            return (Criteria) this;
        }

        public Criteria andBizTpIsNull() {
            addCriterion("TV.BIZ_TP is null");
            return (Criteria) this;
        }

        public Criteria andBizTpIsNotNull() {
            addCriterion("TV.BIZ_TP is not null");
            return (Criteria) this;
        }

        public Criteria andBizTpEqualTo(String value) {
            addCriterion("TV.BIZ_TP =", value, "bizTp");
            return (Criteria) this;
        }

        public Criteria andBizTpNotEqualTo(String value) {
            addCriterion("TV.BIZ_TP <>", value, "bizTp");
            return (Criteria) this;
        }

        public Criteria andBizTpGreaterThan(String value) {
            addCriterion("TV.BIZ_TP >", value, "bizTp");
            return (Criteria) this;
        }

        public Criteria andBizTpGreaterThanOrEqualTo(String value) {
            addCriterion("TV.BIZ_TP >=", value, "bizTp");
            return (Criteria) this;
        }

        public Criteria andBizTpLessThan(String value) {
            addCriterion("TV.BIZ_TP <", value, "bizTp");
            return (Criteria) this;
        }

        public Criteria andBizTpLessThanOrEqualTo(String value) {
            addCriterion("TV.BIZ_TP <=", value, "bizTp");
            return (Criteria) this;
        }

        public Criteria andBizTpLike(String value) {
            addCriterion("TV.BIZ_TP like", value, "bizTp");
            return (Criteria) this;
        }

        public Criteria andBizTpNotLike(String value) {
            addCriterion("TV.BIZ_TP not like", value, "bizTp");
            return (Criteria) this;
        }

        public Criteria andBizTpIn(List<String> values) {
            addCriterion("TV.BIZ_TP in", values, "bizTp");
            return (Criteria) this;
        }

        public Criteria andBizTpNotIn(List<String> values) {
            addCriterion("TV.BIZ_TP not in", values, "bizTp");
            return (Criteria) this;
        }

        public Criteria andBizTpBetween(String value1, String value2) {
            addCriterion("TV.BIZ_TP between", value1, value2, "bizTp");
            return (Criteria) this;
        }

        public Criteria andBizTpNotBetween(String value1, String value2) {
            addCriterion("TV.BIZ_TP not between", value1, value2, "bizTp");
            return (Criteria) this;
        }

        public Criteria andTaxClCdIsNull() {
            addCriterion("TV.TAX_CL_CD is null");
            return (Criteria) this;
        }

        public Criteria andTaxClCdIsNotNull() {
            addCriterion("TV.TAX_CL_CD is not null");
            return (Criteria) this;
        }

        public Criteria andTaxClCdEqualTo(String value) {
            addCriterion("TV.TAX_CL_CD =", value, "taxClCd");
            return (Criteria) this;
        }

        public Criteria andTaxClCdNotEqualTo(String value) {
            addCriterion("TV.TAX_CL_CD <>", value, "taxClCd");
            return (Criteria) this;
        }

        public Criteria andTaxClCdGreaterThan(String value) {
            addCriterion("TV.TAX_CL_CD >", value, "taxClCd");
            return (Criteria) this;
        }

        public Criteria andTaxClCdGreaterThanOrEqualTo(String value) {
            addCriterion("TV.TAX_CL_CD >=", value, "taxClCd");
            return (Criteria) this;
        }

        public Criteria andTaxClCdLessThan(String value) {
            addCriterion("TV.TAX_CL_CD <", value, "taxClCd");
            return (Criteria) this;
        }

        public Criteria andTaxClCdLessThanOrEqualTo(String value) {
            addCriterion("TV.TAX_CL_CD <=", value, "taxClCd");
            return (Criteria) this;
        }

        public Criteria andTaxClCdLike(String value) {
            addCriterion("TV.TAX_CL_CD like", value, "taxClCd");
            return (Criteria) this;
        }

        public Criteria andTaxClCdNotLike(String value) {
            addCriterion("TV.TAX_CL_CD not like", value, "taxClCd");
            return (Criteria) this;
        }

        public Criteria andTaxClCdIn(List<String> values) {
            addCriterion("TV.TAX_CL_CD in", values, "taxClCd");
            return (Criteria) this;
        }

        public Criteria andTaxClCdNotIn(List<String> values) {
            addCriterion("TV.TAX_CL_CD not in", values, "taxClCd");
            return (Criteria) this;
        }

        public Criteria andTaxClCdBetween(String value1, String value2) {
            addCriterion("TV.TAX_CL_CD between", value1, value2, "taxClCd");
            return (Criteria) this;
        }

        public Criteria andTaxClCdNotBetween(String value1, String value2) {
            addCriterion("TV.TAX_CL_CD not between", value1, value2, "taxClCd");
            return (Criteria) this;
        }

        public Criteria andAffVenCdUsePdLimYnIsNull() {
            addCriterion("TV.AFF_VEN_CD_USE_PD_LIM_YN is null");
            return (Criteria) this;
        }

        public Criteria andAffVenCdUsePdLimYnIsNotNull() {
            addCriterion("TV.AFF_VEN_CD_USE_PD_LIM_YN is not null");
            return (Criteria) this;
        }

        public Criteria andAffVenCdUsePdLimYnEqualTo(String value) {
            addCriterion("TV.AFF_VEN_CD_USE_PD_LIM_YN =", value, "affVenCdUsePdLimYn");
            return (Criteria) this;
        }

        public Criteria andAffVenCdUsePdLimYnNotEqualTo(String value) {
            addCriterion("TV.AFF_VEN_CD_USE_PD_LIM_YN <>", value, "affVenCdUsePdLimYn");
            return (Criteria) this;
        }

        public Criteria andAffVenCdUsePdLimYnGreaterThan(String value) {
            addCriterion("TV.AFF_VEN_CD_USE_PD_LIM_YN >", value, "affVenCdUsePdLimYn");
            return (Criteria) this;
        }

        public Criteria andAffVenCdUsePdLimYnGreaterThanOrEqualTo(String value) {
            addCriterion("TV.AFF_VEN_CD_USE_PD_LIM_YN >=", value, "affVenCdUsePdLimYn");
            return (Criteria) this;
        }

        public Criteria andAffVenCdUsePdLimYnLessThan(String value) {
            addCriterion("TV.AFF_VEN_CD_USE_PD_LIM_YN <", value, "affVenCdUsePdLimYn");
            return (Criteria) this;
        }

        public Criteria andAffVenCdUsePdLimYnLessThanOrEqualTo(String value) {
            addCriterion("TV.AFF_VEN_CD_USE_PD_LIM_YN <=", value, "affVenCdUsePdLimYn");
            return (Criteria) this;
        }

        public Criteria andAffVenCdUsePdLimYnLike(String value) {
            addCriterion("TV.AFF_VEN_CD_USE_PD_LIM_YN like", value, "affVenCdUsePdLimYn");
            return (Criteria) this;
        }

        public Criteria andAffVenCdUsePdLimYnNotLike(String value) {
            addCriterion("TV.AFF_VEN_CD_USE_PD_LIM_YN not like", value, "affVenCdUsePdLimYn");
            return (Criteria) this;
        }

        public Criteria andAffVenCdUsePdLimYnIn(List<String> values) {
            addCriterion("TV.AFF_VEN_CD_USE_PD_LIM_YN in", values, "affVenCdUsePdLimYn");
            return (Criteria) this;
        }

        public Criteria andAffVenCdUsePdLimYnNotIn(List<String> values) {
            addCriterion("TV.AFF_VEN_CD_USE_PD_LIM_YN not in", values, "affVenCdUsePdLimYn");
            return (Criteria) this;
        }

        public Criteria andAffVenCdUsePdLimYnBetween(String value1, String value2) {
            addCriterion("TV.AFF_VEN_CD_USE_PD_LIM_YN between", value1, value2, "affVenCdUsePdLimYn");
            return (Criteria) this;
        }

        public Criteria andAffVenCdUsePdLimYnNotBetween(String value1, String value2) {
            addCriterion("TV.AFF_VEN_CD_USE_PD_LIM_YN not between", value1, value2, "affVenCdUsePdLimYn");
            return (Criteria) this;
        }

        public Criteria andAffVenCdUsePdStDayIsNull() {
            addCriterion("TV.AFF_VEN_CD_USE_PD_ST_DAY is null");
            return (Criteria) this;
        }

        public Criteria andAffVenCdUsePdStDayIsNotNull() {
            addCriterion("TV.AFF_VEN_CD_USE_PD_ST_DAY is not null");
            return (Criteria) this;
        }

        public Criteria andAffVenCdUsePdStDayEqualTo(String value) {
            addCriterion("TV.AFF_VEN_CD_USE_PD_ST_DAY =", value, "affVenCdUsePdStDay");
            return (Criteria) this;
        }

        public Criteria andAffVenCdUsePdStDayNotEqualTo(String value) {
            addCriterion("TV.AFF_VEN_CD_USE_PD_ST_DAY <>", value, "affVenCdUsePdStDay");
            return (Criteria) this;
        }

        public Criteria andAffVenCdUsePdStDayGreaterThan(String value) {
            addCriterion("TV.AFF_VEN_CD_USE_PD_ST_DAY >", value, "affVenCdUsePdStDay");
            return (Criteria) this;
        }

        public Criteria andAffVenCdUsePdStDayGreaterThanOrEqualTo(String value) {
            addCriterion("TV.AFF_VEN_CD_USE_PD_ST_DAY >=", value, "affVenCdUsePdStDay");
            return (Criteria) this;
        }

        public Criteria andAffVenCdUsePdStDayLessThan(String value) {
            addCriterion("TV.AFF_VEN_CD_USE_PD_ST_DAY <", value, "affVenCdUsePdStDay");
            return (Criteria) this;
        }

        public Criteria andAffVenCdUsePdStDayLessThanOrEqualTo(String value) {
            addCriterion("TV.AFF_VEN_CD_USE_PD_ST_DAY <=", value, "affVenCdUsePdStDay");
            return (Criteria) this;
        }

        public Criteria andAffVenCdUsePdStDayLike(String value) {
            addCriterion("TV.AFF_VEN_CD_USE_PD_ST_DAY like", value, "affVenCdUsePdStDay");
            return (Criteria) this;
        }

        public Criteria andAffVenCdUsePdStDayNotLike(String value) {
            addCriterion("TV.AFF_VEN_CD_USE_PD_ST_DAY not like", value, "affVenCdUsePdStDay");
            return (Criteria) this;
        }

        public Criteria andAffVenCdUsePdStDayIn(List<String> values) {
            addCriterion("TV.AFF_VEN_CD_USE_PD_ST_DAY in", values, "affVenCdUsePdStDay");
            return (Criteria) this;
        }

        public Criteria andAffVenCdUsePdStDayNotIn(List<String> values) {
            addCriterion("TV.AFF_VEN_CD_USE_PD_ST_DAY not in", values, "affVenCdUsePdStDay");
            return (Criteria) this;
        }

        public Criteria andAffVenCdUsePdStDayBetween(String value1, String value2) {
            addCriterion("TV.AFF_VEN_CD_USE_PD_ST_DAY between", value1, value2, "affVenCdUsePdStDay");
            return (Criteria) this;
        }

        public Criteria andAffVenCdUsePdStDayNotBetween(String value1, String value2) {
            addCriterion("TV.AFF_VEN_CD_USE_PD_ST_DAY not between", value1, value2, "affVenCdUsePdStDay");
            return (Criteria) this;
        }

        public Criteria andAffVenCdUsePdEdDayIsNull() {
            addCriterion("TV.AFF_VEN_CD_USE_PD_ED_DAY is null");
            return (Criteria) this;
        }

        public Criteria andAffVenCdUsePdEdDayIsNotNull() {
            addCriterion("TV.AFF_VEN_CD_USE_PD_ED_DAY is not null");
            return (Criteria) this;
        }

        public Criteria andAffVenCdUsePdEdDayEqualTo(String value) {
            addCriterion("TV.AFF_VEN_CD_USE_PD_ED_DAY =", value, "affVenCdUsePdEdDay");
            return (Criteria) this;
        }

        public Criteria andAffVenCdUsePdEdDayNotEqualTo(String value) {
            addCriterion("TV.AFF_VEN_CD_USE_PD_ED_DAY <>", value, "affVenCdUsePdEdDay");
            return (Criteria) this;
        }

        public Criteria andAffVenCdUsePdEdDayGreaterThan(String value) {
            addCriterion("TV.AFF_VEN_CD_USE_PD_ED_DAY >", value, "affVenCdUsePdEdDay");
            return (Criteria) this;
        }

        public Criteria andAffVenCdUsePdEdDayGreaterThanOrEqualTo(String value) {
            addCriterion("TV.AFF_VEN_CD_USE_PD_ED_DAY >=", value, "affVenCdUsePdEdDay");
            return (Criteria) this;
        }

        public Criteria andAffVenCdUsePdEdDayLessThan(String value) {
            addCriterion("TV.AFF_VEN_CD_USE_PD_ED_DAY <", value, "affVenCdUsePdEdDay");
            return (Criteria) this;
        }

        public Criteria andAffVenCdUsePdEdDayLessThanOrEqualTo(String value) {
            addCriterion("TV.AFF_VEN_CD_USE_PD_ED_DAY <=", value, "affVenCdUsePdEdDay");
            return (Criteria) this;
        }

        public Criteria andAffVenCdUsePdEdDayLike(String value) {
            addCriterion("TV.AFF_VEN_CD_USE_PD_ED_DAY like", value, "affVenCdUsePdEdDay");
            return (Criteria) this;
        }

        public Criteria andAffVenCdUsePdEdDayNotLike(String value) {
            addCriterion("TV.AFF_VEN_CD_USE_PD_ED_DAY not like", value, "affVenCdUsePdEdDay");
            return (Criteria) this;
        }

        public Criteria andAffVenCdUsePdEdDayIn(List<String> values) {
            addCriterion("TV.AFF_VEN_CD_USE_PD_ED_DAY in", values, "affVenCdUsePdEdDay");
            return (Criteria) this;
        }

        public Criteria andAffVenCdUsePdEdDayNotIn(List<String> values) {
            addCriterion("TV.AFF_VEN_CD_USE_PD_ED_DAY not in", values, "affVenCdUsePdEdDay");
            return (Criteria) this;
        }

        public Criteria andAffVenCdUsePdEdDayBetween(String value1, String value2) {
            addCriterion("TV.AFF_VEN_CD_USE_PD_ED_DAY between", value1, value2, "affVenCdUsePdEdDay");
            return (Criteria) this;
        }

        public Criteria andAffVenCdUsePdEdDayNotBetween(String value1, String value2) {
            addCriterion("TV.AFF_VEN_CD_USE_PD_ED_DAY not between", value1, value2, "affVenCdUsePdEdDay");
            return (Criteria) this;
        }

        public Criteria andEtrDtIsNull() {
            addCriterion("TV.ETR_DT is null");
            return (Criteria) this;
        }

        public Criteria andEtrDtIsNotNull() {
            addCriterion("TV.ETR_DT is not null");
            return (Criteria) this;
        }

        public Criteria andEtrDtEqualTo(Date value) {
            addCriterion("TV.ETR_DT =", value, "etrDt");
            return (Criteria) this;
        }

        public Criteria andEtrDtNotEqualTo(Date value) {
            addCriterion("TV.ETR_DT <>", value, "etrDt");
            return (Criteria) this;
        }

        public Criteria andEtrDtGreaterThan(Date value) {
            addCriterion("TV.ETR_DT >", value, "etrDt");
            return (Criteria) this;
        }

        public Criteria andEtrDtGreaterThanOrEqualTo(Date value) {
            addCriterion("TV.ETR_DT >=", value, "etrDt");
            return (Criteria) this;
        }

        public Criteria andEtrDtLessThan(Date value) {
            addCriterion("TV.ETR_DT <", value, "etrDt");
            return (Criteria) this;
        }

        public Criteria andEtrDtLessThanOrEqualTo(Date value) {
            addCriterion("TV.ETR_DT <=", value, "etrDt");
            return (Criteria) this;
        }

        public Criteria andEtrDtIn(List<Date> values) {
            addCriterion("TV.ETR_DT in", values, "etrDt");
            return (Criteria) this;
        }

        public Criteria andEtrDtNotIn(List<Date> values) {
            addCriterion("TV.ETR_DT not in", values, "etrDt");
            return (Criteria) this;
        }

        public Criteria andEtrDtBetween(Date value1, Date value2) {
            addCriterion("TV.ETR_DT between", value1, value2, "etrDt");
            return (Criteria) this;
        }

        public Criteria andEtrDtNotBetween(Date value1, Date value2) {
            addCriterion("TV.ETR_DT not between", value1, value2, "etrDt");
            return (Criteria) this;
        }

        public Criteria andRepVenYnIsNull() {
            addCriterion("TV.REP_VEN_YN is null");
            return (Criteria) this;
        }

        public Criteria andRepVenYnIsNotNull() {
            addCriterion("TV.REP_VEN_YN is not null");
            return (Criteria) this;
        }

        public Criteria andRepVenYnEqualTo(String value) {
            addCriterion("TV.REP_VEN_YN =", value, "repVenYn");
            return (Criteria) this;
        }

        public Criteria andRepVenYnNotEqualTo(String value) {
            addCriterion("TV.REP_VEN_YN <>", value, "repVenYn");
            return (Criteria) this;
        }

        public Criteria andRepVenYnGreaterThan(String value) {
            addCriterion("TV.REP_VEN_YN >", value, "repVenYn");
            return (Criteria) this;
        }

        public Criteria andRepVenYnGreaterThanOrEqualTo(String value) {
            addCriterion("TV.REP_VEN_YN >=", value, "repVenYn");
            return (Criteria) this;
        }

        public Criteria andRepVenYnLessThan(String value) {
            addCriterion("TV.REP_VEN_YN <", value, "repVenYn");
            return (Criteria) this;
        }

        public Criteria andRepVenYnLessThanOrEqualTo(String value) {
            addCriterion("TV.REP_VEN_YN <=", value, "repVenYn");
            return (Criteria) this;
        }

        public Criteria andRepVenYnLike(String value) {
            addCriterion("TV.REP_VEN_YN like", value, "repVenYn");
            return (Criteria) this;
        }

        public Criteria andRepVenYnNotLike(String value) {
            addCriterion("TV.REP_VEN_YN not like", value, "repVenYn");
            return (Criteria) this;
        }

        public Criteria andRepVenYnIn(List<String> values) {
            addCriterion("TV.REP_VEN_YN in", values, "repVenYn");
            return (Criteria) this;
        }

        public Criteria andRepVenYnNotIn(List<String> values) {
            addCriterion("TV.REP_VEN_YN not in", values, "repVenYn");
            return (Criteria) this;
        }

        public Criteria andRepVenYnBetween(String value1, String value2) {
            addCriterion("TV.REP_VEN_YN between", value1, value2, "repVenYn");
            return (Criteria) this;
        }

        public Criteria andRepVenYnNotBetween(String value1, String value2) {
            addCriterion("TV.REP_VEN_YN not between", value1, value2, "repVenYn");
            return (Criteria) this;
        }

        public Criteria andRegDtIsNull() {
            addCriterion("TV.REG_DT is null");
            return (Criteria) this;
        }

        public Criteria andRegDtIsNotNull() {
            addCriterion("TV.REG_DT is not null");
            return (Criteria) this;
        }

        public Criteria andRegDtEqualTo(Date value) {
            addCriterion("TV.REG_DT =", value, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtNotEqualTo(Date value) {
            addCriterion("TV.REG_DT <>", value, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtGreaterThan(Date value) {
            addCriterion("TV.REG_DT >", value, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtGreaterThanOrEqualTo(Date value) {
            addCriterion("TV.REG_DT >=", value, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtLessThan(Date value) {
            addCriterion("TV.REG_DT <", value, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtLessThanOrEqualTo(Date value) {
            addCriterion("TV.REG_DT <=", value, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtIn(List<Date> values) {
            addCriterion("TV.REG_DT in", values, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtNotIn(List<Date> values) {
            addCriterion("TV.REG_DT not in", values, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtBetween(Date value1, Date value2) {
            addCriterion("TV.REG_DT between", value1, value2, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtNotBetween(Date value1, Date value2) {
            addCriterion("TV.REG_DT not between", value1, value2, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegIdIsNull() {
            addCriterion("TV.REG_ID is null");
            return (Criteria) this;
        }

        public Criteria andRegIdIsNotNull() {
            addCriterion("TV.REG_ID is not null");
            return (Criteria) this;
        }

        public Criteria andRegIdEqualTo(String value) {
            addCriterion("TV.REG_ID =", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdNotEqualTo(String value) {
            addCriterion("TV.REG_ID <>", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdGreaterThan(String value) {
            addCriterion("TV.REG_ID >", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdGreaterThanOrEqualTo(String value) {
            addCriterion("TV.REG_ID >=", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdLessThan(String value) {
            addCriterion("TV.REG_ID <", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdLessThanOrEqualTo(String value) {
            addCriterion("TV.REG_ID <=", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdLike(String value) {
            addCriterion("TV.REG_ID like", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdNotLike(String value) {
            addCriterion("TV.REG_ID not like", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdIn(List<String> values) {
            addCriterion("TV.REG_ID in", values, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdNotIn(List<String> values) {
            addCriterion("TV.REG_ID not in", values, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdBetween(String value1, String value2) {
            addCriterion("TV.REG_ID between", value1, value2, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdNotBetween(String value1, String value2) {
            addCriterion("TV.REG_ID not between", value1, value2, "regId");
            return (Criteria) this;
        }

        public Criteria andModDtIsNull() {
            addCriterion("TV.MOD_DT is null");
            return (Criteria) this;
        }

        public Criteria andModDtIsNotNull() {
            addCriterion("TV.MOD_DT is not null");
            return (Criteria) this;
        }

        public Criteria andModDtEqualTo(Date value) {
            addCriterion("TV.MOD_DT =", value, "modDt");
            return (Criteria) this;
        }

        public Criteria andModDtNotEqualTo(Date value) {
            addCriterion("TV.MOD_DT <>", value, "modDt");
            return (Criteria) this;
        }

        public Criteria andModDtGreaterThan(Date value) {
            addCriterion("TV.MOD_DT >", value, "modDt");
            return (Criteria) this;
        }

        public Criteria andModDtGreaterThanOrEqualTo(Date value) {
            addCriterion("TV.MOD_DT >=", value, "modDt");
            return (Criteria) this;
        }

        public Criteria andModDtLessThan(Date value) {
            addCriterion("TV.MOD_DT <", value, "modDt");
            return (Criteria) this;
        }

        public Criteria andModDtLessThanOrEqualTo(Date value) {
            addCriterion("TV.MOD_DT <=", value, "modDt");
            return (Criteria) this;
        }

        public Criteria andModDtIn(List<Date> values) {
            addCriterion("TV.MOD_DT in", values, "modDt");
            return (Criteria) this;
        }

        public Criteria andModDtNotIn(List<Date> values) {
            addCriterion("TV.MOD_DT not in", values, "modDt");
            return (Criteria) this;
        }

        public Criteria andModDtBetween(Date value1, Date value2) {
            addCriterion("TV.MOD_DT between", value1, value2, "modDt");
            return (Criteria) this;
        }

        public Criteria andModDtNotBetween(Date value1, Date value2) {
            addCriterion("TV.MOD_DT not between", value1, value2, "modDt");
            return (Criteria) this;
        }

        public Criteria andModIdIsNull() {
            addCriterion("TV.MOD_ID is null");
            return (Criteria) this;
        }

        public Criteria andModIdIsNotNull() {
            addCriterion("TV.MOD_ID is not null");
            return (Criteria) this;
        }

        public Criteria andModIdEqualTo(String value) {
            addCriterion("TV.MOD_ID =", value, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdNotEqualTo(String value) {
            addCriterion("TV.MOD_ID <>", value, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdGreaterThan(String value) {
            addCriterion("TV.MOD_ID >", value, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdGreaterThanOrEqualTo(String value) {
            addCriterion("TV.MOD_ID >=", value, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdLessThan(String value) {
            addCriterion("TV.MOD_ID <", value, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdLessThanOrEqualTo(String value) {
            addCriterion("TV.MOD_ID <=", value, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdLike(String value) {
            addCriterion("TV.MOD_ID like", value, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdNotLike(String value) {
            addCriterion("TV.MOD_ID not like", value, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdIn(List<String> values) {
            addCriterion("TV.MOD_ID in", values, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdNotIn(List<String> values) {
            addCriterion("TV.MOD_ID not in", values, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdBetween(String value1, String value2) {
            addCriterion("TV.MOD_ID between", value1, value2, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdNotBetween(String value1, String value2) {
            addCriterion("TV.MOD_ID not between", value1, value2, "modId");
            return (Criteria) this;
        }

        public Criteria andUseYnIsNull() {
            addCriterion("TV.USE_YN is null");
            return (Criteria) this;
        }

        public Criteria andUseYnIsNotNull() {
            addCriterion("TV.USE_YN is not null");
            return (Criteria) this;
        }

        public Criteria andUseYnEqualTo(String value) {
            addCriterion("TV.USE_YN =", value, "useYn");
            return (Criteria) this;
        }

        public Criteria andUseYnNotEqualTo(String value) {
            addCriterion("TV.USE_YN <>", value, "useYn");
            return (Criteria) this;
        }

        public Criteria andUseYnGreaterThan(String value) {
            addCriterion("TV.USE_YN >", value, "useYn");
            return (Criteria) this;
        }

        public Criteria andUseYnGreaterThanOrEqualTo(String value) {
            addCriterion("TV.USE_YN >=", value, "useYn");
            return (Criteria) this;
        }

        public Criteria andUseYnLessThan(String value) {
            addCriterion("TV.USE_YN <", value, "useYn");
            return (Criteria) this;
        }

        public Criteria andUseYnLessThanOrEqualTo(String value) {
            addCriterion("TV.USE_YN <=", value, "useYn");
            return (Criteria) this;
        }

        public Criteria andUseYnLike(String value) {
            addCriterion("TV.USE_YN like", value, "useYn");
            return (Criteria) this;
        }

        public Criteria andUseYnNotLike(String value) {
            addCriterion("TV.USE_YN not like", value, "useYn");
            return (Criteria) this;
        }

        public Criteria andUseYnIn(List<String> values) {
            addCriterion("TV.USE_YN in", values, "useYn");
            return (Criteria) this;
        }

        public Criteria andUseYnNotIn(List<String> values) {
            addCriterion("TV.USE_YN not in", values, "useYn");
            return (Criteria) this;
        }

        public Criteria andUseYnBetween(String value1, String value2) {
            addCriterion("TV.USE_YN between", value1, value2, "useYn");
            return (Criteria) this;
        }

        public Criteria andUseYnNotBetween(String value1, String value2) {
            addCriterion("TV.USE_YN not between", value1, value2, "useYn");
            return (Criteria) this;
        }

        public Criteria andVenTpCdLikeInsensitive(String value) {
            addCriterion("upper(TV.VEN_TP_CD) like", value.toUpperCase(), "venTpCd");
            return (Criteria) this;
        }

        public Criteria andEtrVenClCdLikeInsensitive(String value) {
            addCriterion("upper(TV.ETR_VEN_CL_CD) like", value.toUpperCase(), "etrVenClCd");
            return (Criteria) this;
        }

        public Criteria andVenStatCdLikeInsensitive(String value) {
            addCriterion("upper(TV.VEN_STAT_CD) like", value.toUpperCase(), "venStatCd");
            return (Criteria) this;
        }

        public Criteria andVenCdLikeInsensitive(String value) {
            addCriterion("upper(TV.VEN_CD) like", value.toUpperCase(), "venCd");
            return (Criteria) this;
        }

        public Criteria andVenNmLikeInsensitive(String value) {
            addCriterion("upper(TV.VEN_NM) like", value.toUpperCase(), "venNm");
            return (Criteria) this;
        }

        public Criteria andRepNmLikeInsensitive(String value) {
            addCriterion("upper(TV.REP_NM) like", value.toUpperCase(), "repNm");
            return (Criteria) this;
        }

        public Criteria andTelNoLikeInsensitive(String value) {
            addCriterion("upper(TV.TEL_NO) like", value.toUpperCase(), "telNo");
            return (Criteria) this;
        }

        public Criteria andCpNoLikeInsensitive(String value) {
            addCriterion("upper(TV.CP_NO) like", value.toUpperCase(), "cpNo");
            return (Criteria) this;
        }

        public Criteria andFaxNoLikeInsensitive(String value) {
            addCriterion("upper(TV.FAX_NO) like", value.toUpperCase(), "faxNo");
            return (Criteria) this;
        }

        public Criteria andEmailLikeInsensitive(String value) {
            addCriterion("upper(TV.EMAIL) like", value.toUpperCase(), "email");
            return (Criteria) this;
        }

        public Criteria andZipcdLikeInsensitive(String value) {
            addCriterion("upper(TV.ZIPCD) like", value.toUpperCase(), "zipcd");
            return (Criteria) this;
        }

        public Criteria andAddrLikeInsensitive(String value) {
            addCriterion("upper(TV.ADDR) like", value.toUpperCase(), "addr");
            return (Criteria) this;
        }

        public Criteria andBizClCdLikeInsensitive(String value) {
            addCriterion("upper(TV.BIZ_CL_CD) like", value.toUpperCase(), "bizClCd");
            return (Criteria) this;
        }

        public Criteria andBizNoLikeInsensitive(String value) {
            addCriterion("upper(TV.BIZ_NO) like", value.toUpperCase(), "bizNo");
            return (Criteria) this;
        }

        public Criteria andIncNoLikeInsensitive(String value) {
            addCriterion("upper(TV.INC_NO) like", value.toUpperCase(), "incNo");
            return (Criteria) this;
        }

        public Criteria andBizCondLikeInsensitive(String value) {
            addCriterion("upper(TV.BIZ_COND) like", value.toUpperCase(), "bizCond");
            return (Criteria) this;
        }

        public Criteria andBizTpLikeInsensitive(String value) {
            addCriterion("upper(TV.BIZ_TP) like", value.toUpperCase(), "bizTp");
            return (Criteria) this;
        }

        public Criteria andTaxClCdLikeInsensitive(String value) {
            addCriterion("upper(TV.TAX_CL_CD) like", value.toUpperCase(), "taxClCd");
            return (Criteria) this;
        }

        public Criteria andAffVenCdUsePdLimYnLikeInsensitive(String value) {
            addCriterion("upper(TV.AFF_VEN_CD_USE_PD_LIM_YN) like", value.toUpperCase(), "affVenCdUsePdLimYn");
            return (Criteria) this;
        }

        public Criteria andAffVenCdUsePdStDayLikeInsensitive(String value) {
            addCriterion("upper(TV.AFF_VEN_CD_USE_PD_ST_DAY) like", value.toUpperCase(), "affVenCdUsePdStDay");
            return (Criteria) this;
        }

        public Criteria andAffVenCdUsePdEdDayLikeInsensitive(String value) {
            addCriterion("upper(TV.AFF_VEN_CD_USE_PD_ED_DAY) like", value.toUpperCase(), "affVenCdUsePdEdDay");
            return (Criteria) this;
        }

        public Criteria andRepVenYnLikeInsensitive(String value) {
            addCriterion("upper(TV.REP_VEN_YN) like", value.toUpperCase(), "repVenYn");
            return (Criteria) this;
        }

        public Criteria andRegIdLikeInsensitive(String value) {
            addCriterion("upper(TV.REG_ID) like", value.toUpperCase(), "regId");
            return (Criteria) this;
        }

        public Criteria andModIdLikeInsensitive(String value) {
            addCriterion("upper(TV.MOD_ID) like", value.toUpperCase(), "modId");
            return (Criteria) this;
        }

        public Criteria andUseYnLikeInsensitive(String value) {
            addCriterion("upper(TV.USE_YN) like", value.toUpperCase(), "useYn");
            return (Criteria) this;
        }

        public Criteria andVenTpCdLikeLeft(String value) {
            addCriterion("TV.VEN_TP_CD like ", "%" + value, "venTpCd");
            return (Criteria) this;
        }

        public Criteria andVenTpCdLikeRight(String value) {
            addCriterion("TV.VEN_TP_CD like ", value + "%", "venTpCd");
            return (Criteria) this;
        }

        public Criteria andVenTpCdLikeBoth(String value) {
            addCriterion("TV.VEN_TP_CD like ", "%" + value + "%", "venTpCd");
            return (Criteria) this;
        }

        public Criteria andEtrVenClCdLikeLeft(String value) {
            addCriterion("TV.ETR_VEN_CL_CD like ", "%" + value, "etrVenClCd");
            return (Criteria) this;
        }

        public Criteria andEtrVenClCdLikeRight(String value) {
            addCriterion("TV.ETR_VEN_CL_CD like ", value + "%", "etrVenClCd");
            return (Criteria) this;
        }

        public Criteria andEtrVenClCdLikeBoth(String value) {
            addCriterion("TV.ETR_VEN_CL_CD like ", "%" + value + "%", "etrVenClCd");
            return (Criteria) this;
        }

        public Criteria andVenStatCdLikeLeft(String value) {
            addCriterion("TV.VEN_STAT_CD like ", "%" + value, "venStatCd");
            return (Criteria) this;
        }

        public Criteria andVenStatCdLikeRight(String value) {
            addCriterion("TV.VEN_STAT_CD like ", value + "%", "venStatCd");
            return (Criteria) this;
        }

        public Criteria andVenStatCdLikeBoth(String value) {
            addCriterion("TV.VEN_STAT_CD like ", "%" + value + "%", "venStatCd");
            return (Criteria) this;
        }

        public Criteria andVenCdLikeLeft(String value) {
            addCriterion("TV.VEN_CD like ", "%" + value, "venCd");
            return (Criteria) this;
        }

        public Criteria andVenCdLikeRight(String value) {
            addCriterion("TV.VEN_CD like ", value + "%", "venCd");
            return (Criteria) this;
        }

        public Criteria andVenCdLikeBoth(String value) {
            addCriterion("TV.VEN_CD like ", "%" + value + "%", "venCd");
            return (Criteria) this;
        }

        public Criteria andVenNmLikeLeft(String value) {
            addCriterion("TV.VEN_NM like ", "%" + value, "venNm");
            return (Criteria) this;
        }

        public Criteria andVenNmLikeRight(String value) {
            addCriterion("TV.VEN_NM like ", value + "%", "venNm");
            return (Criteria) this;
        }

        public Criteria andVenNmLikeBoth(String value) {
            addCriterion("TV.VEN_NM like ", "%" + value + "%", "venNm");
            return (Criteria) this;
        }

        public Criteria andRepNmLikeLeft(String value) {
            addCriterion("TV.REP_NM like ", "%" + value, "repNm");
            return (Criteria) this;
        }

        public Criteria andRepNmLikeRight(String value) {
            addCriterion("TV.REP_NM like ", value + "%", "repNm");
            return (Criteria) this;
        }

        public Criteria andRepNmLikeBoth(String value) {
            addCriterion("TV.REP_NM like ", "%" + value + "%", "repNm");
            return (Criteria) this;
        }

        public Criteria andTelNoLikeLeft(String value) {
            addCriterion("TV.TEL_NO like ", "%" + value, "telNo");
            return (Criteria) this;
        }

        public Criteria andTelNoLikeRight(String value) {
            addCriterion("TV.TEL_NO like ", value + "%", "telNo");
            return (Criteria) this;
        }

        public Criteria andTelNoLikeBoth(String value) {
            addCriterion("TV.TEL_NO like ", "%" + value + "%", "telNo");
            return (Criteria) this;
        }

        public Criteria andCpNoLikeLeft(String value) {
            addCriterion("TV.CP_NO like ", "%" + value, "cpNo");
            return (Criteria) this;
        }

        public Criteria andCpNoLikeRight(String value) {
            addCriterion("TV.CP_NO like ", value + "%", "cpNo");
            return (Criteria) this;
        }

        public Criteria andCpNoLikeBoth(String value) {
            addCriterion("TV.CP_NO like ", "%" + value + "%", "cpNo");
            return (Criteria) this;
        }

        public Criteria andFaxNoLikeLeft(String value) {
            addCriterion("TV.FAX_NO like ", "%" + value, "faxNo");
            return (Criteria) this;
        }

        public Criteria andFaxNoLikeRight(String value) {
            addCriterion("TV.FAX_NO like ", value + "%", "faxNo");
            return (Criteria) this;
        }

        public Criteria andFaxNoLikeBoth(String value) {
            addCriterion("TV.FAX_NO like ", "%" + value + "%", "faxNo");
            return (Criteria) this;
        }

        public Criteria andEmailLikeLeft(String value) {
            addCriterion("TV.EMAIL like ", "%" + value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLikeRight(String value) {
            addCriterion("TV.EMAIL like ", value + "%", "email");
            return (Criteria) this;
        }

        public Criteria andEmailLikeBoth(String value) {
            addCriterion("TV.EMAIL like ", "%" + value + "%", "email");
            return (Criteria) this;
        }

        public Criteria andZipcdLikeLeft(String value) {
            addCriterion("TV.ZIPCD like ", "%" + value, "zipcd");
            return (Criteria) this;
        }

        public Criteria andZipcdLikeRight(String value) {
            addCriterion("TV.ZIPCD like ", value + "%", "zipcd");
            return (Criteria) this;
        }

        public Criteria andZipcdLikeBoth(String value) {
            addCriterion("TV.ZIPCD like ", "%" + value + "%", "zipcd");
            return (Criteria) this;
        }

        public Criteria andAddrLikeLeft(String value) {
            addCriterion("TV.ADDR like ", "%" + value, "addr");
            return (Criteria) this;
        }

        public Criteria andAddrLikeRight(String value) {
            addCriterion("TV.ADDR like ", value + "%", "addr");
            return (Criteria) this;
        }

        public Criteria andAddrLikeBoth(String value) {
            addCriterion("TV.ADDR like ", "%" + value + "%", "addr");
            return (Criteria) this;
        }

        public Criteria andBizClCdLikeLeft(String value) {
            addCriterion("TV.BIZ_CL_CD like ", "%" + value, "bizClCd");
            return (Criteria) this;
        }

        public Criteria andBizClCdLikeRight(String value) {
            addCriterion("TV.BIZ_CL_CD like ", value + "%", "bizClCd");
            return (Criteria) this;
        }

        public Criteria andBizClCdLikeBoth(String value) {
            addCriterion("TV.BIZ_CL_CD like ", "%" + value + "%", "bizClCd");
            return (Criteria) this;
        }

        public Criteria andBizNoLikeLeft(String value) {
            addCriterion("TV.BIZ_NO like ", "%" + value, "bizNo");
            return (Criteria) this;
        }

        public Criteria andBizNoLikeRight(String value) {
            addCriterion("TV.BIZ_NO like ", value + "%", "bizNo");
            return (Criteria) this;
        }

        public Criteria andBizNoLikeBoth(String value) {
            addCriterion("TV.BIZ_NO like ", "%" + value + "%", "bizNo");
            return (Criteria) this;
        }

        public Criteria andIncNoLikeLeft(String value) {
            addCriterion("TV.INC_NO like ", "%" + value, "incNo");
            return (Criteria) this;
        }

        public Criteria andIncNoLikeRight(String value) {
            addCriterion("TV.INC_NO like ", value + "%", "incNo");
            return (Criteria) this;
        }

        public Criteria andIncNoLikeBoth(String value) {
            addCriterion("TV.INC_NO like ", "%" + value + "%", "incNo");
            return (Criteria) this;
        }

        public Criteria andBizCondLikeLeft(String value) {
            addCriterion("TV.BIZ_COND like ", "%" + value, "bizCond");
            return (Criteria) this;
        }

        public Criteria andBizCondLikeRight(String value) {
            addCriterion("TV.BIZ_COND like ", value + "%", "bizCond");
            return (Criteria) this;
        }

        public Criteria andBizCondLikeBoth(String value) {
            addCriterion("TV.BIZ_COND like ", "%" + value + "%", "bizCond");
            return (Criteria) this;
        }

        public Criteria andBizTpLikeLeft(String value) {
            addCriterion("TV.BIZ_TP like ", "%" + value, "bizTp");
            return (Criteria) this;
        }

        public Criteria andBizTpLikeRight(String value) {
            addCriterion("TV.BIZ_TP like ", value + "%", "bizTp");
            return (Criteria) this;
        }

        public Criteria andBizTpLikeBoth(String value) {
            addCriterion("TV.BIZ_TP like ", "%" + value + "%", "bizTp");
            return (Criteria) this;
        }

        public Criteria andTaxClCdLikeLeft(String value) {
            addCriterion("TV.TAX_CL_CD like ", "%" + value, "taxClCd");
            return (Criteria) this;
        }

        public Criteria andTaxClCdLikeRight(String value) {
            addCriterion("TV.TAX_CL_CD like ", value + "%", "taxClCd");
            return (Criteria) this;
        }

        public Criteria andTaxClCdLikeBoth(String value) {
            addCriterion("TV.TAX_CL_CD like ", "%" + value + "%", "taxClCd");
            return (Criteria) this;
        }

        public Criteria andAffVenCdUsePdLimYnLikeLeft(String value) {
            addCriterion("TV.AFF_VEN_CD_USE_PD_LIM_YN like ", "%" + value, "affVenCdUsePdLimYn");
            return (Criteria) this;
        }

        public Criteria andAffVenCdUsePdLimYnLikeRight(String value) {
            addCriterion("TV.AFF_VEN_CD_USE_PD_LIM_YN like ", value + "%", "affVenCdUsePdLimYn");
            return (Criteria) this;
        }

        public Criteria andAffVenCdUsePdLimYnLikeBoth(String value) {
            addCriterion("TV.AFF_VEN_CD_USE_PD_LIM_YN like ", "%" + value + "%", "affVenCdUsePdLimYn");
            return (Criteria) this;
        }

        public Criteria andAffVenCdUsePdStDayLikeLeft(String value) {
            addCriterion("TV.AFF_VEN_CD_USE_PD_ST_DAY like ", "%" + value, "affVenCdUsePdStDay");
            return (Criteria) this;
        }

        public Criteria andAffVenCdUsePdStDayLikeRight(String value) {
            addCriterion("TV.AFF_VEN_CD_USE_PD_ST_DAY like ", value + "%", "affVenCdUsePdStDay");
            return (Criteria) this;
        }

        public Criteria andAffVenCdUsePdStDayLikeBoth(String value) {
            addCriterion("TV.AFF_VEN_CD_USE_PD_ST_DAY like ", "%" + value + "%", "affVenCdUsePdStDay");
            return (Criteria) this;
        }

        public Criteria andAffVenCdUsePdEdDayLikeLeft(String value) {
            addCriterion("TV.AFF_VEN_CD_USE_PD_ED_DAY like ", "%" + value, "affVenCdUsePdEdDay");
            return (Criteria) this;
        }

        public Criteria andAffVenCdUsePdEdDayLikeRight(String value) {
            addCriterion("TV.AFF_VEN_CD_USE_PD_ED_DAY like ", value + "%", "affVenCdUsePdEdDay");
            return (Criteria) this;
        }

        public Criteria andAffVenCdUsePdEdDayLikeBoth(String value) {
            addCriterion("TV.AFF_VEN_CD_USE_PD_ED_DAY like ", "%" + value + "%", "affVenCdUsePdEdDay");
            return (Criteria) this;
        }

        public Criteria andRepVenYnLikeLeft(String value) {
            addCriterion("TV.REP_VEN_YN like ", "%" + value, "repVenYn");
            return (Criteria) this;
        }

        public Criteria andRepVenYnLikeRight(String value) {
            addCriterion("TV.REP_VEN_YN like ", value + "%", "repVenYn");
            return (Criteria) this;
        }

        public Criteria andRepVenYnLikeBoth(String value) {
            addCriterion("TV.REP_VEN_YN like ", "%" + value + "%", "repVenYn");
            return (Criteria) this;
        }

        public Criteria andRegIdLikeLeft(String value) {
            addCriterion("TV.REG_ID like ", "%" + value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdLikeRight(String value) {
            addCriterion("TV.REG_ID like ", value + "%", "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdLikeBoth(String value) {
            addCriterion("TV.REG_ID like ", "%" + value + "%", "regId");
            return (Criteria) this;
        }

        public Criteria andModIdLikeLeft(String value) {
            addCriterion("TV.MOD_ID like ", "%" + value, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdLikeRight(String value) {
            addCriterion("TV.MOD_ID like ", value + "%", "modId");
            return (Criteria) this;
        }

        public Criteria andModIdLikeBoth(String value) {
            addCriterion("TV.MOD_ID like ", "%" + value + "%", "modId");
            return (Criteria) this;
        }

        public Criteria andUseYnLikeLeft(String value) {
            addCriterion("TV.USE_YN like ", "%" + value, "useYn");
            return (Criteria) this;
        }

        public Criteria andUseYnLikeRight(String value) {
            addCriterion("TV.USE_YN like ", value + "%", "useYn");
            return (Criteria) this;
        }

        public Criteria andUseYnLikeBoth(String value) {
            addCriterion("TV.USE_YN like ", "%" + value + "%", "useYn");
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