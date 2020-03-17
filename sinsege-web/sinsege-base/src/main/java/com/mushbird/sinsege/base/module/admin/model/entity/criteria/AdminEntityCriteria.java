package com.mushbird.sinsege.base.module.admin.model.entity.criteria;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class AdminEntityCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    public AdminEntityCriteria() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andAdmIdIsNull() {
            addCriterion("TA.ADM_ID is null");
            return (Criteria) this;
        }

        public Criteria andAdmIdIsNotNull() {
            addCriterion("TA.ADM_ID is not null");
            return (Criteria) this;
        }

        public Criteria andAdmIdEqualTo(String value) {
            addCriterion("TA.ADM_ID =", value, "admId");
            return (Criteria) this;
        }

        public Criteria andAdmIdNotEqualTo(String value) {
            addCriterion("TA.ADM_ID <>", value, "admId");
            return (Criteria) this;
        }

        public Criteria andAdmIdGreaterThan(String value) {
            addCriterion("TA.ADM_ID >", value, "admId");
            return (Criteria) this;
        }

        public Criteria andAdmIdGreaterThanOrEqualTo(String value) {
            addCriterion("TA.ADM_ID >=", value, "admId");
            return (Criteria) this;
        }

        public Criteria andAdmIdLessThan(String value) {
            addCriterion("TA.ADM_ID <", value, "admId");
            return (Criteria) this;
        }

        public Criteria andAdmIdLessThanOrEqualTo(String value) {
            addCriterion("TA.ADM_ID <=", value, "admId");
            return (Criteria) this;
        }

        public Criteria andAdmIdLike(String value) {
            addCriterion("TA.ADM_ID like", value, "admId");
            return (Criteria) this;
        }

        public Criteria andAdmIdNotLike(String value) {
            addCriterion("TA.ADM_ID not like", value, "admId");
            return (Criteria) this;
        }

        public Criteria andAdmIdIn(List<String> values) {
            addCriterion("TA.ADM_ID in", values, "admId");
            return (Criteria) this;
        }

        public Criteria andAdmIdNotIn(List<String> values) {
            addCriterion("TA.ADM_ID not in", values, "admId");
            return (Criteria) this;
        }

        public Criteria andAdmIdBetween(String value1, String value2) {
            addCriterion("TA.ADM_ID between", value1, value2, "admId");
            return (Criteria) this;
        }

        public Criteria andAdmIdNotBetween(String value1, String value2) {
            addCriterion("TA.ADM_ID not between", value1, value2, "admId");
            return (Criteria) this;
        }

        public Criteria andVenIdIsNull() {
            addCriterion("TA.VEN_ID is null");
            return (Criteria) this;
        }

        public Criteria andVenIdIsNotNull() {
            addCriterion("TA.VEN_ID is not null");
            return (Criteria) this;
        }

        public Criteria andVenIdEqualTo(Integer value) {
            addCriterion("TA.VEN_ID =", value, "venId");
            return (Criteria) this;
        }

        public Criteria andVenIdNotEqualTo(Integer value) {
            addCriterion("TA.VEN_ID <>", value, "venId");
            return (Criteria) this;
        }

        public Criteria andVenIdGreaterThan(Integer value) {
            addCriterion("TA.VEN_ID >", value, "venId");
            return (Criteria) this;
        }

        public Criteria andVenIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("TA.VEN_ID >=", value, "venId");
            return (Criteria) this;
        }

        public Criteria andVenIdLessThan(Integer value) {
            addCriterion("TA.VEN_ID <", value, "venId");
            return (Criteria) this;
        }

        public Criteria andVenIdLessThanOrEqualTo(Integer value) {
            addCriterion("TA.VEN_ID <=", value, "venId");
            return (Criteria) this;
        }

        public Criteria andVenIdIn(List<Integer> values) {
            addCriterion("TA.VEN_ID in", values, "venId");
            return (Criteria) this;
        }

        public Criteria andVenIdNotIn(List<Integer> values) {
            addCriterion("TA.VEN_ID not in", values, "venId");
            return (Criteria) this;
        }

        public Criteria andVenIdBetween(Integer value1, Integer value2) {
            addCriterion("TA.VEN_ID between", value1, value2, "venId");
            return (Criteria) this;
        }

        public Criteria andVenIdNotBetween(Integer value1, Integer value2) {
            addCriterion("TA.VEN_ID not between", value1, value2, "venId");
            return (Criteria) this;
        }

        public Criteria andAdmTpCdIsNull() {
            addCriterion("TA.ADM_TP_CD is null");
            return (Criteria) this;
        }

        public Criteria andAdmTpCdIsNotNull() {
            addCriterion("TA.ADM_TP_CD is not null");
            return (Criteria) this;
        }

        public Criteria andAdmTpCdEqualTo(String value) {
            addCriterion("TA.ADM_TP_CD =", value, "admTpCd");
            return (Criteria) this;
        }

        public Criteria andAdmTpCdNotEqualTo(String value) {
            addCriterion("TA.ADM_TP_CD <>", value, "admTpCd");
            return (Criteria) this;
        }

        public Criteria andAdmTpCdGreaterThan(String value) {
            addCriterion("TA.ADM_TP_CD >", value, "admTpCd");
            return (Criteria) this;
        }

        public Criteria andAdmTpCdGreaterThanOrEqualTo(String value) {
            addCriterion("TA.ADM_TP_CD >=", value, "admTpCd");
            return (Criteria) this;
        }

        public Criteria andAdmTpCdLessThan(String value) {
            addCriterion("TA.ADM_TP_CD <", value, "admTpCd");
            return (Criteria) this;
        }

        public Criteria andAdmTpCdLessThanOrEqualTo(String value) {
            addCriterion("TA.ADM_TP_CD <=", value, "admTpCd");
            return (Criteria) this;
        }

        public Criteria andAdmTpCdLike(String value) {
            addCriterion("TA.ADM_TP_CD like", value, "admTpCd");
            return (Criteria) this;
        }

        public Criteria andAdmTpCdNotLike(String value) {
            addCriterion("TA.ADM_TP_CD not like", value, "admTpCd");
            return (Criteria) this;
        }

        public Criteria andAdmTpCdIn(List<String> values) {
            addCriterion("TA.ADM_TP_CD in", values, "admTpCd");
            return (Criteria) this;
        }

        public Criteria andAdmTpCdNotIn(List<String> values) {
            addCriterion("TA.ADM_TP_CD not in", values, "admTpCd");
            return (Criteria) this;
        }

        public Criteria andAdmTpCdBetween(String value1, String value2) {
            addCriterion("TA.ADM_TP_CD between", value1, value2, "admTpCd");
            return (Criteria) this;
        }

        public Criteria andAdmTpCdNotBetween(String value1, String value2) {
            addCriterion("TA.ADM_TP_CD not between", value1, value2, "admTpCd");
            return (Criteria) this;
        }

        public Criteria andAdmStatCdIsNull() {
            addCriterion("TA.ADM_STAT_CD is null");
            return (Criteria) this;
        }

        public Criteria andAdmStatCdIsNotNull() {
            addCriterion("TA.ADM_STAT_CD is not null");
            return (Criteria) this;
        }

        public Criteria andAdmStatCdEqualTo(String value) {
            addCriterion("TA.ADM_STAT_CD =", value, "admStatCd");
            return (Criteria) this;
        }

        public Criteria andAdmStatCdNotEqualTo(String value) {
            addCriterion("TA.ADM_STAT_CD <>", value, "admStatCd");
            return (Criteria) this;
        }

        public Criteria andAdmStatCdGreaterThan(String value) {
            addCriterion("TA.ADM_STAT_CD >", value, "admStatCd");
            return (Criteria) this;
        }

        public Criteria andAdmStatCdGreaterThanOrEqualTo(String value) {
            addCriterion("TA.ADM_STAT_CD >=", value, "admStatCd");
            return (Criteria) this;
        }

        public Criteria andAdmStatCdLessThan(String value) {
            addCriterion("TA.ADM_STAT_CD <", value, "admStatCd");
            return (Criteria) this;
        }

        public Criteria andAdmStatCdLessThanOrEqualTo(String value) {
            addCriterion("TA.ADM_STAT_CD <=", value, "admStatCd");
            return (Criteria) this;
        }

        public Criteria andAdmStatCdLike(String value) {
            addCriterion("TA.ADM_STAT_CD like", value, "admStatCd");
            return (Criteria) this;
        }

        public Criteria andAdmStatCdNotLike(String value) {
            addCriterion("TA.ADM_STAT_CD not like", value, "admStatCd");
            return (Criteria) this;
        }

        public Criteria andAdmStatCdIn(List<String> values) {
            addCriterion("TA.ADM_STAT_CD in", values, "admStatCd");
            return (Criteria) this;
        }

        public Criteria andAdmStatCdNotIn(List<String> values) {
            addCriterion("TA.ADM_STAT_CD not in", values, "admStatCd");
            return (Criteria) this;
        }

        public Criteria andAdmStatCdBetween(String value1, String value2) {
            addCriterion("TA.ADM_STAT_CD between", value1, value2, "admStatCd");
            return (Criteria) this;
        }

        public Criteria andAdmStatCdNotBetween(String value1, String value2) {
            addCriterion("TA.ADM_STAT_CD not between", value1, value2, "admStatCd");
            return (Criteria) this;
        }

        public Criteria andAdmLgnIdIsNull() {
            addCriterion("TA.ADM_LGN_ID is null");
            return (Criteria) this;
        }

        public Criteria andAdmLgnIdIsNotNull() {
            addCriterion("TA.ADM_LGN_ID is not null");
            return (Criteria) this;
        }

        public Criteria andAdmLgnIdEqualTo(String value) {
            addCriterion("TA.ADM_LGN_ID =", value, "admLgnId");
            return (Criteria) this;
        }

        public Criteria andAdmLgnIdNotEqualTo(String value) {
            addCriterion("TA.ADM_LGN_ID <>", value, "admLgnId");
            return (Criteria) this;
        }

        public Criteria andAdmLgnIdGreaterThan(String value) {
            addCriterion("TA.ADM_LGN_ID >", value, "admLgnId");
            return (Criteria) this;
        }

        public Criteria andAdmLgnIdGreaterThanOrEqualTo(String value) {
            addCriterion("TA.ADM_LGN_ID >=", value, "admLgnId");
            return (Criteria) this;
        }

        public Criteria andAdmLgnIdLessThan(String value) {
            addCriterion("TA.ADM_LGN_ID <", value, "admLgnId");
            return (Criteria) this;
        }

        public Criteria andAdmLgnIdLessThanOrEqualTo(String value) {
            addCriterion("TA.ADM_LGN_ID <=", value, "admLgnId");
            return (Criteria) this;
        }

        public Criteria andAdmLgnIdLike(String value) {
            addCriterion("TA.ADM_LGN_ID like", value, "admLgnId");
            return (Criteria) this;
        }

        public Criteria andAdmLgnIdNotLike(String value) {
            addCriterion("TA.ADM_LGN_ID not like", value, "admLgnId");
            return (Criteria) this;
        }

        public Criteria andAdmLgnIdIn(List<String> values) {
            addCriterion("TA.ADM_LGN_ID in", values, "admLgnId");
            return (Criteria) this;
        }

        public Criteria andAdmLgnIdNotIn(List<String> values) {
            addCriterion("TA.ADM_LGN_ID not in", values, "admLgnId");
            return (Criteria) this;
        }

        public Criteria andAdmLgnIdBetween(String value1, String value2) {
            addCriterion("TA.ADM_LGN_ID between", value1, value2, "admLgnId");
            return (Criteria) this;
        }

        public Criteria andAdmLgnIdNotBetween(String value1, String value2) {
            addCriterion("TA.ADM_LGN_ID not between", value1, value2, "admLgnId");
            return (Criteria) this;
        }

        public Criteria andAdmNmIsNull() {
            addCriterion("TA.ADM_NM is null");
            return (Criteria) this;
        }

        public Criteria andAdmNmIsNotNull() {
            addCriterion("TA.ADM_NM is not null");
            return (Criteria) this;
        }

        public Criteria andAdmNmEqualTo(String value) {
            addCriterion("TA.ADM_NM =", value, "admNm");
            return (Criteria) this;
        }

        public Criteria andAdmNmNotEqualTo(String value) {
            addCriterion("TA.ADM_NM <>", value, "admNm");
            return (Criteria) this;
        }

        public Criteria andAdmNmGreaterThan(String value) {
            addCriterion("TA.ADM_NM >", value, "admNm");
            return (Criteria) this;
        }

        public Criteria andAdmNmGreaterThanOrEqualTo(String value) {
            addCriterion("TA.ADM_NM >=", value, "admNm");
            return (Criteria) this;
        }

        public Criteria andAdmNmLessThan(String value) {
            addCriterion("TA.ADM_NM <", value, "admNm");
            return (Criteria) this;
        }

        public Criteria andAdmNmLessThanOrEqualTo(String value) {
            addCriterion("TA.ADM_NM <=", value, "admNm");
            return (Criteria) this;
        }

        public Criteria andAdmNmLike(String value) {
            addCriterion("TA.ADM_NM like", value, "admNm");
            return (Criteria) this;
        }

        public Criteria andAdmNmNotLike(String value) {
            addCriterion("TA.ADM_NM not like", value, "admNm");
            return (Criteria) this;
        }

        public Criteria andAdmNmIn(List<String> values) {
            addCriterion("TA.ADM_NM in", values, "admNm");
            return (Criteria) this;
        }

        public Criteria andAdmNmNotIn(List<String> values) {
            addCriterion("TA.ADM_NM not in", values, "admNm");
            return (Criteria) this;
        }

        public Criteria andAdmNmBetween(String value1, String value2) {
            addCriterion("TA.ADM_NM between", value1, value2, "admNm");
            return (Criteria) this;
        }

        public Criteria andAdmNmNotBetween(String value1, String value2) {
            addCriterion("TA.ADM_NM not between", value1, value2, "admNm");
            return (Criteria) this;
        }

        public Criteria andEmailIsNull() {
            addCriterion("TA.EMAIL is null");
            return (Criteria) this;
        }

        public Criteria andEmailIsNotNull() {
            addCriterion("TA.EMAIL is not null");
            return (Criteria) this;
        }

        public Criteria andEmailEqualTo(String value) {
            addCriterion("TA.EMAIL =", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotEqualTo(String value) {
            addCriterion("TA.EMAIL <>", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThan(String value) {
            addCriterion("TA.EMAIL >", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThanOrEqualTo(String value) {
            addCriterion("TA.EMAIL >=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThan(String value) {
            addCriterion("TA.EMAIL <", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThanOrEqualTo(String value) {
            addCriterion("TA.EMAIL <=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLike(String value) {
            addCriterion("TA.EMAIL like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotLike(String value) {
            addCriterion("TA.EMAIL not like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailIn(List<String> values) {
            addCriterion("TA.EMAIL in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotIn(List<String> values) {
            addCriterion("TA.EMAIL not in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailBetween(String value1, String value2) {
            addCriterion("TA.EMAIL between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotBetween(String value1, String value2) {
            addCriterion("TA.EMAIL not between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andCpCarrCdIsNull() {
            addCriterion("TA.CP_CARR_CD is null");
            return (Criteria) this;
        }

        public Criteria andCpCarrCdIsNotNull() {
            addCriterion("TA.CP_CARR_CD is not null");
            return (Criteria) this;
        }

        public Criteria andCpCarrCdEqualTo(String value) {
            addCriterion("TA.CP_CARR_CD =", value, "cpCarrCd");
            return (Criteria) this;
        }

        public Criteria andCpCarrCdNotEqualTo(String value) {
            addCriterion("TA.CP_CARR_CD <>", value, "cpCarrCd");
            return (Criteria) this;
        }

        public Criteria andCpCarrCdGreaterThan(String value) {
            addCriterion("TA.CP_CARR_CD >", value, "cpCarrCd");
            return (Criteria) this;
        }

        public Criteria andCpCarrCdGreaterThanOrEqualTo(String value) {
            addCriterion("TA.CP_CARR_CD >=", value, "cpCarrCd");
            return (Criteria) this;
        }

        public Criteria andCpCarrCdLessThan(String value) {
            addCriterion("TA.CP_CARR_CD <", value, "cpCarrCd");
            return (Criteria) this;
        }

        public Criteria andCpCarrCdLessThanOrEqualTo(String value) {
            addCriterion("TA.CP_CARR_CD <=", value, "cpCarrCd");
            return (Criteria) this;
        }

        public Criteria andCpCarrCdLike(String value) {
            addCriterion("TA.CP_CARR_CD like", value, "cpCarrCd");
            return (Criteria) this;
        }

        public Criteria andCpCarrCdNotLike(String value) {
            addCriterion("TA.CP_CARR_CD not like", value, "cpCarrCd");
            return (Criteria) this;
        }

        public Criteria andCpCarrCdIn(List<String> values) {
            addCriterion("TA.CP_CARR_CD in", values, "cpCarrCd");
            return (Criteria) this;
        }

        public Criteria andCpCarrCdNotIn(List<String> values) {
            addCriterion("TA.CP_CARR_CD not in", values, "cpCarrCd");
            return (Criteria) this;
        }

        public Criteria andCpCarrCdBetween(String value1, String value2) {
            addCriterion("TA.CP_CARR_CD between", value1, value2, "cpCarrCd");
            return (Criteria) this;
        }

        public Criteria andCpCarrCdNotBetween(String value1, String value2) {
            addCriterion("TA.CP_CARR_CD not between", value1, value2, "cpCarrCd");
            return (Criteria) this;
        }

        public Criteria andCpNoIsNull() {
            addCriterion("TA.CP_NO is null");
            return (Criteria) this;
        }

        public Criteria andCpNoIsNotNull() {
            addCriterion("TA.CP_NO is not null");
            return (Criteria) this;
        }

        public Criteria andCpNoEqualTo(String value) {
            addCriterion("TA.CP_NO =", value, "cpNo");
            return (Criteria) this;
        }

        public Criteria andCpNoNotEqualTo(String value) {
            addCriterion("TA.CP_NO <>", value, "cpNo");
            return (Criteria) this;
        }

        public Criteria andCpNoGreaterThan(String value) {
            addCriterion("TA.CP_NO >", value, "cpNo");
            return (Criteria) this;
        }

        public Criteria andCpNoGreaterThanOrEqualTo(String value) {
            addCriterion("TA.CP_NO >=", value, "cpNo");
            return (Criteria) this;
        }

        public Criteria andCpNoLessThan(String value) {
            addCriterion("TA.CP_NO <", value, "cpNo");
            return (Criteria) this;
        }

        public Criteria andCpNoLessThanOrEqualTo(String value) {
            addCriterion("TA.CP_NO <=", value, "cpNo");
            return (Criteria) this;
        }

        public Criteria andCpNoLike(String value) {
            addCriterion("TA.CP_NO like", value, "cpNo");
            return (Criteria) this;
        }

        public Criteria andCpNoNotLike(String value) {
            addCriterion("TA.CP_NO not like", value, "cpNo");
            return (Criteria) this;
        }

        public Criteria andCpNoIn(List<String> values) {
            addCriterion("TA.CP_NO in", values, "cpNo");
            return (Criteria) this;
        }

        public Criteria andCpNoNotIn(List<String> values) {
            addCriterion("TA.CP_NO not in", values, "cpNo");
            return (Criteria) this;
        }

        public Criteria andCpNoBetween(String value1, String value2) {
            addCriterion("TA.CP_NO between", value1, value2, "cpNo");
            return (Criteria) this;
        }

        public Criteria andCpNoNotBetween(String value1, String value2) {
            addCriterion("TA.CP_NO not between", value1, value2, "cpNo");
            return (Criteria) this;
        }

        public Criteria andAdmSiteCdIsNull() {
            addCriterion("TA.ADM_SITE_CD is null");
            return (Criteria) this;
        }

        public Criteria andAdmSiteCdIsNotNull() {
            addCriterion("TA.ADM_SITE_CD is not null");
            return (Criteria) this;
        }

        public Criteria andAdmSiteCdEqualTo(String value) {
            addCriterion("TA.ADM_SITE_CD =", value, "admSiteCd");
            return (Criteria) this;
        }

        public Criteria andAdmSiteCdNotEqualTo(String value) {
            addCriterion("TA.ADM_SITE_CD <>", value, "admSiteCd");
            return (Criteria) this;
        }

        public Criteria andAdmSiteCdGreaterThan(String value) {
            addCriterion("TA.ADM_SITE_CD >", value, "admSiteCd");
            return (Criteria) this;
        }

        public Criteria andAdmSiteCdGreaterThanOrEqualTo(String value) {
            addCriterion("TA.ADM_SITE_CD >=", value, "admSiteCd");
            return (Criteria) this;
        }

        public Criteria andAdmSiteCdLessThan(String value) {
            addCriterion("TA.ADM_SITE_CD <", value, "admSiteCd");
            return (Criteria) this;
        }

        public Criteria andAdmSiteCdLessThanOrEqualTo(String value) {
            addCriterion("TA.ADM_SITE_CD <=", value, "admSiteCd");
            return (Criteria) this;
        }

        public Criteria andAdmSiteCdLike(String value) {
            addCriterion("TA.ADM_SITE_CD like", value, "admSiteCd");
            return (Criteria) this;
        }

        public Criteria andAdmSiteCdNotLike(String value) {
            addCriterion("TA.ADM_SITE_CD not like", value, "admSiteCd");
            return (Criteria) this;
        }

        public Criteria andAdmSiteCdIn(List<String> values) {
            addCriterion("TA.ADM_SITE_CD in", values, "admSiteCd");
            return (Criteria) this;
        }

        public Criteria andAdmSiteCdNotIn(List<String> values) {
            addCriterion("TA.ADM_SITE_CD not in", values, "admSiteCd");
            return (Criteria) this;
        }

        public Criteria andAdmSiteCdBetween(String value1, String value2) {
            addCriterion("TA.ADM_SITE_CD between", value1, value2, "admSiteCd");
            return (Criteria) this;
        }

        public Criteria andAdmSiteCdNotBetween(String value1, String value2) {
            addCriterion("TA.ADM_SITE_CD not between", value1, value2, "admSiteCd");
            return (Criteria) this;
        }

        public Criteria andAdmRoleIdIsNull() {
            addCriterion("TA.ADM_ROLE_ID is null");
            return (Criteria) this;
        }

        public Criteria andAdmRoleIdIsNotNull() {
            addCriterion("TA.ADM_ROLE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andAdmRoleIdEqualTo(Integer value) {
            addCriterion("TA.ADM_ROLE_ID =", value, "admRoleId");
            return (Criteria) this;
        }

        public Criteria andAdmRoleIdNotEqualTo(Integer value) {
            addCriterion("TA.ADM_ROLE_ID <>", value, "admRoleId");
            return (Criteria) this;
        }

        public Criteria andAdmRoleIdGreaterThan(Integer value) {
            addCriterion("TA.ADM_ROLE_ID >", value, "admRoleId");
            return (Criteria) this;
        }

        public Criteria andAdmRoleIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("TA.ADM_ROLE_ID >=", value, "admRoleId");
            return (Criteria) this;
        }

        public Criteria andAdmRoleIdLessThan(Integer value) {
            addCriterion("TA.ADM_ROLE_ID <", value, "admRoleId");
            return (Criteria) this;
        }

        public Criteria andAdmRoleIdLessThanOrEqualTo(Integer value) {
            addCriterion("TA.ADM_ROLE_ID <=", value, "admRoleId");
            return (Criteria) this;
        }

        public Criteria andAdmRoleIdIn(List<Integer> values) {
            addCriterion("TA.ADM_ROLE_ID in", values, "admRoleId");
            return (Criteria) this;
        }

        public Criteria andAdmRoleIdNotIn(List<Integer> values) {
            addCriterion("TA.ADM_ROLE_ID not in", values, "admRoleId");
            return (Criteria) this;
        }

        public Criteria andAdmRoleIdBetween(Integer value1, Integer value2) {
            addCriterion("TA.ADM_ROLE_ID between", value1, value2, "admRoleId");
            return (Criteria) this;
        }

        public Criteria andAdmRoleIdNotBetween(Integer value1, Integer value2) {
            addCriterion("TA.ADM_ROLE_ID not between", value1, value2, "admRoleId");
            return (Criteria) this;
        }

        public Criteria andAprvGrdCdIsNull() {
            addCriterion("TA.APRV_GRD_CD is null");
            return (Criteria) this;
        }

        public Criteria andAprvGrdCdIsNotNull() {
            addCriterion("TA.APRV_GRD_CD is not null");
            return (Criteria) this;
        }

        public Criteria andAprvGrdCdEqualTo(String value) {
            addCriterion("TA.APRV_GRD_CD =", value, "aprvGrdCd");
            return (Criteria) this;
        }

        public Criteria andAprvGrdCdNotEqualTo(String value) {
            addCriterion("TA.APRV_GRD_CD <>", value, "aprvGrdCd");
            return (Criteria) this;
        }

        public Criteria andAprvGrdCdGreaterThan(String value) {
            addCriterion("TA.APRV_GRD_CD >", value, "aprvGrdCd");
            return (Criteria) this;
        }

        public Criteria andAprvGrdCdGreaterThanOrEqualTo(String value) {
            addCriterion("TA.APRV_GRD_CD >=", value, "aprvGrdCd");
            return (Criteria) this;
        }

        public Criteria andAprvGrdCdLessThan(String value) {
            addCriterion("TA.APRV_GRD_CD <", value, "aprvGrdCd");
            return (Criteria) this;
        }

        public Criteria andAprvGrdCdLessThanOrEqualTo(String value) {
            addCriterion("TA.APRV_GRD_CD <=", value, "aprvGrdCd");
            return (Criteria) this;
        }

        public Criteria andAprvGrdCdLike(String value) {
            addCriterion("TA.APRV_GRD_CD like", value, "aprvGrdCd");
            return (Criteria) this;
        }

        public Criteria andAprvGrdCdNotLike(String value) {
            addCriterion("TA.APRV_GRD_CD not like", value, "aprvGrdCd");
            return (Criteria) this;
        }

        public Criteria andAprvGrdCdIn(List<String> values) {
            addCriterion("TA.APRV_GRD_CD in", values, "aprvGrdCd");
            return (Criteria) this;
        }

        public Criteria andAprvGrdCdNotIn(List<String> values) {
            addCriterion("TA.APRV_GRD_CD not in", values, "aprvGrdCd");
            return (Criteria) this;
        }

        public Criteria andAprvGrdCdBetween(String value1, String value2) {
            addCriterion("TA.APRV_GRD_CD between", value1, value2, "aprvGrdCd");
            return (Criteria) this;
        }

        public Criteria andAprvGrdCdNotBetween(String value1, String value2) {
            addCriterion("TA.APRV_GRD_CD not between", value1, value2, "aprvGrdCd");
            return (Criteria) this;
        }

        public Criteria andSupDtIsNull() {
            addCriterion("TA.SUP_DT is null");
            return (Criteria) this;
        }

        public Criteria andSupDtIsNotNull() {
            addCriterion("TA.SUP_DT is not null");
            return (Criteria) this;
        }

        public Criteria andSupDtEqualTo(Date value) {
            addCriterionForJDBCDate("TA.SUP_DT =", value, "supDt");
            return (Criteria) this;
        }

        public Criteria andSupDtNotEqualTo(Date value) {
            addCriterionForJDBCDate("TA.SUP_DT <>", value, "supDt");
            return (Criteria) this;
        }

        public Criteria andSupDtGreaterThan(Date value) {
            addCriterionForJDBCDate("TA.SUP_DT >", value, "supDt");
            return (Criteria) this;
        }

        public Criteria andSupDtGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("TA.SUP_DT >=", value, "supDt");
            return (Criteria) this;
        }

        public Criteria andSupDtLessThan(Date value) {
            addCriterionForJDBCDate("TA.SUP_DT <", value, "supDt");
            return (Criteria) this;
        }

        public Criteria andSupDtLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("TA.SUP_DT <=", value, "supDt");
            return (Criteria) this;
        }

        public Criteria andSupDtIn(List<Date> values) {
            addCriterionForJDBCDate("TA.SUP_DT in", values, "supDt");
            return (Criteria) this;
        }

        public Criteria andSupDtNotIn(List<Date> values) {
            addCriterionForJDBCDate("TA.SUP_DT not in", values, "supDt");
            return (Criteria) this;
        }

        public Criteria andSupDtBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("TA.SUP_DT between", value1, value2, "supDt");
            return (Criteria) this;
        }

        public Criteria andSupDtNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("TA.SUP_DT not between", value1, value2, "supDt");
            return (Criteria) this;
        }

        public Criteria andPwModDtIsNull() {
            addCriterion("TA.PW_MOD_DT is null");
            return (Criteria) this;
        }

        public Criteria andPwModDtIsNotNull() {
            addCriterion("TA.PW_MOD_DT is not null");
            return (Criteria) this;
        }

        public Criteria andPwModDtEqualTo(Date value) {
            addCriterionForJDBCDate("TA.PW_MOD_DT =", value, "pwModDt");
            return (Criteria) this;
        }

        public Criteria andPwModDtNotEqualTo(Date value) {
            addCriterionForJDBCDate("TA.PW_MOD_DT <>", value, "pwModDt");
            return (Criteria) this;
        }

        public Criteria andPwModDtGreaterThan(Date value) {
            addCriterionForJDBCDate("TA.PW_MOD_DT >", value, "pwModDt");
            return (Criteria) this;
        }

        public Criteria andPwModDtGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("TA.PW_MOD_DT >=", value, "pwModDt");
            return (Criteria) this;
        }

        public Criteria andPwModDtLessThan(Date value) {
            addCriterionForJDBCDate("TA.PW_MOD_DT <", value, "pwModDt");
            return (Criteria) this;
        }

        public Criteria andPwModDtLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("TA.PW_MOD_DT <=", value, "pwModDt");
            return (Criteria) this;
        }

        public Criteria andPwModDtIn(List<Date> values) {
            addCriterionForJDBCDate("TA.PW_MOD_DT in", values, "pwModDt");
            return (Criteria) this;
        }

        public Criteria andPwModDtNotIn(List<Date> values) {
            addCriterionForJDBCDate("TA.PW_MOD_DT not in", values, "pwModDt");
            return (Criteria) this;
        }

        public Criteria andPwModDtBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("TA.PW_MOD_DT between", value1, value2, "pwModDt");
            return (Criteria) this;
        }

        public Criteria andPwModDtNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("TA.PW_MOD_DT not between", value1, value2, "pwModDt");
            return (Criteria) this;
        }

        public Criteria andLastLgnDtIsNull() {
            addCriterion("TA.LAST_LGN_DT is null");
            return (Criteria) this;
        }

        public Criteria andLastLgnDtIsNotNull() {
            addCriterion("TA.LAST_LGN_DT is not null");
            return (Criteria) this;
        }

        public Criteria andLastLgnDtEqualTo(Date value) {
            addCriterionForJDBCDate("TA.LAST_LGN_DT =", value, "lastLgnDt");
            return (Criteria) this;
        }

        public Criteria andLastLgnDtNotEqualTo(Date value) {
            addCriterionForJDBCDate("TA.LAST_LGN_DT <>", value, "lastLgnDt");
            return (Criteria) this;
        }

        public Criteria andLastLgnDtGreaterThan(Date value) {
            addCriterionForJDBCDate("TA.LAST_LGN_DT >", value, "lastLgnDt");
            return (Criteria) this;
        }

        public Criteria andLastLgnDtGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("TA.LAST_LGN_DT >=", value, "lastLgnDt");
            return (Criteria) this;
        }

        public Criteria andLastLgnDtLessThan(Date value) {
            addCriterionForJDBCDate("TA.LAST_LGN_DT <", value, "lastLgnDt");
            return (Criteria) this;
        }

        public Criteria andLastLgnDtLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("TA.LAST_LGN_DT <=", value, "lastLgnDt");
            return (Criteria) this;
        }

        public Criteria andLastLgnDtIn(List<Date> values) {
            addCriterionForJDBCDate("TA.LAST_LGN_DT in", values, "lastLgnDt");
            return (Criteria) this;
        }

        public Criteria andLastLgnDtNotIn(List<Date> values) {
            addCriterionForJDBCDate("TA.LAST_LGN_DT not in", values, "lastLgnDt");
            return (Criteria) this;
        }

        public Criteria andLastLgnDtBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("TA.LAST_LGN_DT between", value1, value2, "lastLgnDt");
            return (Criteria) this;
        }

        public Criteria andLastLgnDtNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("TA.LAST_LGN_DT not between", value1, value2, "lastLgnDt");
            return (Criteria) this;
        }

        public Criteria andLastInfoModDtIsNull() {
            addCriterion("TA.LAST_INFO_MOD_DT is null");
            return (Criteria) this;
        }

        public Criteria andLastInfoModDtIsNotNull() {
            addCriterion("TA.LAST_INFO_MOD_DT is not null");
            return (Criteria) this;
        }

        public Criteria andLastInfoModDtEqualTo(Date value) {
            addCriterionForJDBCDate("TA.LAST_INFO_MOD_DT =", value, "lastInfoModDt");
            return (Criteria) this;
        }

        public Criteria andLastInfoModDtNotEqualTo(Date value) {
            addCriterionForJDBCDate("TA.LAST_INFO_MOD_DT <>", value, "lastInfoModDt");
            return (Criteria) this;
        }

        public Criteria andLastInfoModDtGreaterThan(Date value) {
            addCriterionForJDBCDate("TA.LAST_INFO_MOD_DT >", value, "lastInfoModDt");
            return (Criteria) this;
        }

        public Criteria andLastInfoModDtGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("TA.LAST_INFO_MOD_DT >=", value, "lastInfoModDt");
            return (Criteria) this;
        }

        public Criteria andLastInfoModDtLessThan(Date value) {
            addCriterionForJDBCDate("TA.LAST_INFO_MOD_DT <", value, "lastInfoModDt");
            return (Criteria) this;
        }

        public Criteria andLastInfoModDtLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("TA.LAST_INFO_MOD_DT <=", value, "lastInfoModDt");
            return (Criteria) this;
        }

        public Criteria andLastInfoModDtIn(List<Date> values) {
            addCriterionForJDBCDate("TA.LAST_INFO_MOD_DT in", values, "lastInfoModDt");
            return (Criteria) this;
        }

        public Criteria andLastInfoModDtNotIn(List<Date> values) {
            addCriterionForJDBCDate("TA.LAST_INFO_MOD_DT not in", values, "lastInfoModDt");
            return (Criteria) this;
        }

        public Criteria andLastInfoModDtBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("TA.LAST_INFO_MOD_DT between", value1, value2, "lastInfoModDt");
            return (Criteria) this;
        }

        public Criteria andLastInfoModDtNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("TA.LAST_INFO_MOD_DT not between", value1, value2, "lastInfoModDt");
            return (Criteria) this;
        }

        public Criteria andLgnRtryCntIsNull() {
            addCriterion("TA.LGN_RTRY_CNT is null");
            return (Criteria) this;
        }

        public Criteria andLgnRtryCntIsNotNull() {
            addCriterion("TA.LGN_RTRY_CNT is not null");
            return (Criteria) this;
        }

        public Criteria andLgnRtryCntEqualTo(Integer value) {
            addCriterion("TA.LGN_RTRY_CNT =", value, "lgnRtryCnt");
            return (Criteria) this;
        }

        public Criteria andLgnRtryCntNotEqualTo(Integer value) {
            addCriterion("TA.LGN_RTRY_CNT <>", value, "lgnRtryCnt");
            return (Criteria) this;
        }

        public Criteria andLgnRtryCntGreaterThan(Integer value) {
            addCriterion("TA.LGN_RTRY_CNT >", value, "lgnRtryCnt");
            return (Criteria) this;
        }

        public Criteria andLgnRtryCntGreaterThanOrEqualTo(Integer value) {
            addCriterion("TA.LGN_RTRY_CNT >=", value, "lgnRtryCnt");
            return (Criteria) this;
        }

        public Criteria andLgnRtryCntLessThan(Integer value) {
            addCriterion("TA.LGN_RTRY_CNT <", value, "lgnRtryCnt");
            return (Criteria) this;
        }

        public Criteria andLgnRtryCntLessThanOrEqualTo(Integer value) {
            addCriterion("TA.LGN_RTRY_CNT <=", value, "lgnRtryCnt");
            return (Criteria) this;
        }

        public Criteria andLgnRtryCntIn(List<Integer> values) {
            addCriterion("TA.LGN_RTRY_CNT in", values, "lgnRtryCnt");
            return (Criteria) this;
        }

        public Criteria andLgnRtryCntNotIn(List<Integer> values) {
            addCriterion("TA.LGN_RTRY_CNT not in", values, "lgnRtryCnt");
            return (Criteria) this;
        }

        public Criteria andLgnRtryCntBetween(Integer value1, Integer value2) {
            addCriterion("TA.LGN_RTRY_CNT between", value1, value2, "lgnRtryCnt");
            return (Criteria) this;
        }

        public Criteria andLgnRtryCntNotBetween(Integer value1, Integer value2) {
            addCriterion("TA.LGN_RTRY_CNT not between", value1, value2, "lgnRtryCnt");
            return (Criteria) this;
        }

        public Criteria andRegDtIsNull() {
            addCriterion("TA.REG_DT is null");
            return (Criteria) this;
        }

        public Criteria andRegDtIsNotNull() {
            addCriterion("TA.REG_DT is not null");
            return (Criteria) this;
        }

        public Criteria andRegDtEqualTo(Date value) {
            addCriterion("TA.REG_DT =", value, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtNotEqualTo(Date value) {
            addCriterion("TA.REG_DT <>", value, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtGreaterThan(Date value) {
            addCriterion("TA.REG_DT >", value, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtGreaterThanOrEqualTo(Date value) {
            addCriterion("TA.REG_DT >=", value, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtLessThan(Date value) {
            addCriterion("TA.REG_DT <", value, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtLessThanOrEqualTo(Date value) {
            addCriterion("TA.REG_DT <=", value, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtIn(List<Date> values) {
            addCriterion("TA.REG_DT in", values, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtNotIn(List<Date> values) {
            addCriterion("TA.REG_DT not in", values, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtBetween(Date value1, Date value2) {
            addCriterion("TA.REG_DT between", value1, value2, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtNotBetween(Date value1, Date value2) {
            addCriterion("TA.REG_DT not between", value1, value2, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegIdIsNull() {
            addCriterion("TA.REG_ID is null");
            return (Criteria) this;
        }

        public Criteria andRegIdIsNotNull() {
            addCriterion("TA.REG_ID is not null");
            return (Criteria) this;
        }

        public Criteria andRegIdEqualTo(String value) {
            addCriterion("TA.REG_ID =", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdNotEqualTo(String value) {
            addCriterion("TA.REG_ID <>", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdGreaterThan(String value) {
            addCriterion("TA.REG_ID >", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdGreaterThanOrEqualTo(String value) {
            addCriterion("TA.REG_ID >=", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdLessThan(String value) {
            addCriterion("TA.REG_ID <", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdLessThanOrEqualTo(String value) {
            addCriterion("TA.REG_ID <=", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdLike(String value) {
            addCriterion("TA.REG_ID like", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdNotLike(String value) {
            addCriterion("TA.REG_ID not like", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdIn(List<String> values) {
            addCriterion("TA.REG_ID in", values, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdNotIn(List<String> values) {
            addCriterion("TA.REG_ID not in", values, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdBetween(String value1, String value2) {
            addCriterion("TA.REG_ID between", value1, value2, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdNotBetween(String value1, String value2) {
            addCriterion("TA.REG_ID not between", value1, value2, "regId");
            return (Criteria) this;
        }

        public Criteria andModDtIsNull() {
            addCriterion("TA.MOD_DT is null");
            return (Criteria) this;
        }

        public Criteria andModDtIsNotNull() {
            addCriterion("TA.MOD_DT is not null");
            return (Criteria) this;
        }

        public Criteria andModDtEqualTo(Date value) {
            addCriterion("TA.MOD_DT =", value, "modDt");
            return (Criteria) this;
        }

        public Criteria andModDtNotEqualTo(Date value) {
            addCriterion("TA.MOD_DT <>", value, "modDt");
            return (Criteria) this;
        }

        public Criteria andModDtGreaterThan(Date value) {
            addCriterion("TA.MOD_DT >", value, "modDt");
            return (Criteria) this;
        }

        public Criteria andModDtGreaterThanOrEqualTo(Date value) {
            addCriterion("TA.MOD_DT >=", value, "modDt");
            return (Criteria) this;
        }

        public Criteria andModDtLessThan(Date value) {
            addCriterion("TA.MOD_DT <", value, "modDt");
            return (Criteria) this;
        }

        public Criteria andModDtLessThanOrEqualTo(Date value) {
            addCriterion("TA.MOD_DT <=", value, "modDt");
            return (Criteria) this;
        }

        public Criteria andModDtIn(List<Date> values) {
            addCriterion("TA.MOD_DT in", values, "modDt");
            return (Criteria) this;
        }

        public Criteria andModDtNotIn(List<Date> values) {
            addCriterion("TA.MOD_DT not in", values, "modDt");
            return (Criteria) this;
        }

        public Criteria andModDtBetween(Date value1, Date value2) {
            addCriterion("TA.MOD_DT between", value1, value2, "modDt");
            return (Criteria) this;
        }

        public Criteria andModDtNotBetween(Date value1, Date value2) {
            addCriterion("TA.MOD_DT not between", value1, value2, "modDt");
            return (Criteria) this;
        }

        public Criteria andModIdIsNull() {
            addCriterion("TA.MOD_ID is null");
            return (Criteria) this;
        }

        public Criteria andModIdIsNotNull() {
            addCriterion("TA.MOD_ID is not null");
            return (Criteria) this;
        }

        public Criteria andModIdEqualTo(String value) {
            addCriterion("TA.MOD_ID =", value, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdNotEqualTo(String value) {
            addCriterion("TA.MOD_ID <>", value, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdGreaterThan(String value) {
            addCriterion("TA.MOD_ID >", value, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdGreaterThanOrEqualTo(String value) {
            addCriterion("TA.MOD_ID >=", value, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdLessThan(String value) {
            addCriterion("TA.MOD_ID <", value, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdLessThanOrEqualTo(String value) {
            addCriterion("TA.MOD_ID <=", value, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdLike(String value) {
            addCriterion("TA.MOD_ID like", value, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdNotLike(String value) {
            addCriterion("TA.MOD_ID not like", value, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdIn(List<String> values) {
            addCriterion("TA.MOD_ID in", values, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdNotIn(List<String> values) {
            addCriterion("TA.MOD_ID not in", values, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdBetween(String value1, String value2) {
            addCriterion("TA.MOD_ID between", value1, value2, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdNotBetween(String value1, String value2) {
            addCriterion("TA.MOD_ID not between", value1, value2, "modId");
            return (Criteria) this;
        }

        public Criteria andUseYnIsNull() {
            addCriterion("TA.USE_YN is null");
            return (Criteria) this;
        }

        public Criteria andUseYnIsNotNull() {
            addCriterion("TA.USE_YN is not null");
            return (Criteria) this;
        }

        public Criteria andUseYnEqualTo(String value) {
            addCriterion("TA.USE_YN =", value, "useYn");
            return (Criteria) this;
        }

        public Criteria andUseYnNotEqualTo(String value) {
            addCriterion("TA.USE_YN <>", value, "useYn");
            return (Criteria) this;
        }

        public Criteria andUseYnGreaterThan(String value) {
            addCriterion("TA.USE_YN >", value, "useYn");
            return (Criteria) this;
        }

        public Criteria andUseYnGreaterThanOrEqualTo(String value) {
            addCriterion("TA.USE_YN >=", value, "useYn");
            return (Criteria) this;
        }

        public Criteria andUseYnLessThan(String value) {
            addCriterion("TA.USE_YN <", value, "useYn");
            return (Criteria) this;
        }

        public Criteria andUseYnLessThanOrEqualTo(String value) {
            addCriterion("TA.USE_YN <=", value, "useYn");
            return (Criteria) this;
        }

        public Criteria andUseYnLike(String value) {
            addCriterion("TA.USE_YN like", value, "useYn");
            return (Criteria) this;
        }

        public Criteria andUseYnNotLike(String value) {
            addCriterion("TA.USE_YN not like", value, "useYn");
            return (Criteria) this;
        }

        public Criteria andUseYnIn(List<String> values) {
            addCriterion("TA.USE_YN in", values, "useYn");
            return (Criteria) this;
        }

        public Criteria andUseYnNotIn(List<String> values) {
            addCriterion("TA.USE_YN not in", values, "useYn");
            return (Criteria) this;
        }

        public Criteria andUseYnBetween(String value1, String value2) {
            addCriterion("TA.USE_YN between", value1, value2, "useYn");
            return (Criteria) this;
        }

        public Criteria andUseYnNotBetween(String value1, String value2) {
            addCriterion("TA.USE_YN not between", value1, value2, "useYn");
            return (Criteria) this;
        }

        public Criteria andAdmIdLikeInsensitive(String value) {
            addCriterion("upper(TA.ADM_ID) like", value.toUpperCase(), "admId");
            return (Criteria) this;
        }

        public Criteria andAdmTpCdLikeInsensitive(String value) {
            addCriterion("upper(TA.ADM_TP_CD) like", value.toUpperCase(), "admTpCd");
            return (Criteria) this;
        }

        public Criteria andAdmStatCdLikeInsensitive(String value) {
            addCriterion("upper(TA.ADM_STAT_CD) like", value.toUpperCase(), "admStatCd");
            return (Criteria) this;
        }

        public Criteria andAdmLgnIdLikeInsensitive(String value) {
            addCriterion("upper(TA.ADM_LGN_ID) like", value.toUpperCase(), "admLgnId");
            return (Criteria) this;
        }

        public Criteria andAdmNmLikeInsensitive(String value) {
            addCriterion("upper(TA.ADM_NM) like", value.toUpperCase(), "admNm");
            return (Criteria) this;
        }

        public Criteria andEmailLikeInsensitive(String value) {
            addCriterion("upper(TA.EMAIL) like", value.toUpperCase(), "email");
            return (Criteria) this;
        }

        public Criteria andCpCarrCdLikeInsensitive(String value) {
            addCriterion("upper(TA.CP_CARR_CD) like", value.toUpperCase(), "cpCarrCd");
            return (Criteria) this;
        }

        public Criteria andCpNoLikeInsensitive(String value) {
            addCriterion("upper(TA.CP_NO) like", value.toUpperCase(), "cpNo");
            return (Criteria) this;
        }

        public Criteria andAdmSiteCdLikeInsensitive(String value) {
            addCriterion("upper(TA.ADM_SITE_CD) like", value.toUpperCase(), "admSiteCd");
            return (Criteria) this;
        }

        public Criteria andAprvGrdCdLikeInsensitive(String value) {
            addCriterion("upper(TA.APRV_GRD_CD) like", value.toUpperCase(), "aprvGrdCd");
            return (Criteria) this;
        }

        public Criteria andRegIdLikeInsensitive(String value) {
            addCriterion("upper(TA.REG_ID) like", value.toUpperCase(), "regId");
            return (Criteria) this;
        }

        public Criteria andModIdLikeInsensitive(String value) {
            addCriterion("upper(TA.MOD_ID) like", value.toUpperCase(), "modId");
            return (Criteria) this;
        }

        public Criteria andUseYnLikeInsensitive(String value) {
            addCriterion("upper(TA.USE_YN) like", value.toUpperCase(), "useYn");
            return (Criteria) this;
        }

        public Criteria andAdmIdLikeLeft(String value) {
            addCriterion("TA.ADM_ID like ", "%" + value, "admId");
            return (Criteria) this;
        }

        public Criteria andAdmIdLikeRight(String value) {
            addCriterion("TA.ADM_ID like ", value + "%", "admId");
            return (Criteria) this;
        }

        public Criteria andAdmIdLikeBoth(String value) {
            addCriterion("TA.ADM_ID like ", "%" + value + "%", "admId");
            return (Criteria) this;
        }

        public Criteria andAdmTpCdLikeLeft(String value) {
            addCriterion("TA.ADM_TP_CD like ", "%" + value, "admTpCd");
            return (Criteria) this;
        }

        public Criteria andAdmTpCdLikeRight(String value) {
            addCriterion("TA.ADM_TP_CD like ", value + "%", "admTpCd");
            return (Criteria) this;
        }

        public Criteria andAdmTpCdLikeBoth(String value) {
            addCriterion("TA.ADM_TP_CD like ", "%" + value + "%", "admTpCd");
            return (Criteria) this;
        }

        public Criteria andAdmStatCdLikeLeft(String value) {
            addCriterion("TA.ADM_STAT_CD like ", "%" + value, "admStatCd");
            return (Criteria) this;
        }

        public Criteria andAdmStatCdLikeRight(String value) {
            addCriterion("TA.ADM_STAT_CD like ", value + "%", "admStatCd");
            return (Criteria) this;
        }

        public Criteria andAdmStatCdLikeBoth(String value) {
            addCriterion("TA.ADM_STAT_CD like ", "%" + value + "%", "admStatCd");
            return (Criteria) this;
        }

        public Criteria andAdmLgnIdLikeLeft(String value) {
            addCriterion("TA.ADM_LGN_ID like ", "%" + value, "admLgnId");
            return (Criteria) this;
        }

        public Criteria andAdmLgnIdLikeRight(String value) {
            addCriterion("TA.ADM_LGN_ID like ", value + "%", "admLgnId");
            return (Criteria) this;
        }

        public Criteria andAdmLgnIdLikeBoth(String value) {
            addCriterion("TA.ADM_LGN_ID like ", "%" + value + "%", "admLgnId");
            return (Criteria) this;
        }

        public Criteria andAdmNmLikeLeft(String value) {
            addCriterion("TA.ADM_NM like ", "%" + value, "admNm");
            return (Criteria) this;
        }

        public Criteria andAdmNmLikeRight(String value) {
            addCriterion("TA.ADM_NM like ", value + "%", "admNm");
            return (Criteria) this;
        }

        public Criteria andAdmNmLikeBoth(String value) {
            addCriterion("TA.ADM_NM like ", "%" + value + "%", "admNm");
            return (Criteria) this;
        }

        public Criteria andEmailLikeLeft(String value) {
            addCriterion("TA.EMAIL like ", "%" + value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLikeRight(String value) {
            addCriterion("TA.EMAIL like ", value + "%", "email");
            return (Criteria) this;
        }

        public Criteria andEmailLikeBoth(String value) {
            addCriterion("TA.EMAIL like ", "%" + value + "%", "email");
            return (Criteria) this;
        }

        public Criteria andCpCarrCdLikeLeft(String value) {
            addCriterion("TA.CP_CARR_CD like ", "%" + value, "cpCarrCd");
            return (Criteria) this;
        }

        public Criteria andCpCarrCdLikeRight(String value) {
            addCriterion("TA.CP_CARR_CD like ", value + "%", "cpCarrCd");
            return (Criteria) this;
        }

        public Criteria andCpCarrCdLikeBoth(String value) {
            addCriterion("TA.CP_CARR_CD like ", "%" + value + "%", "cpCarrCd");
            return (Criteria) this;
        }

        public Criteria andCpNoLikeLeft(String value) {
            addCriterion("TA.CP_NO like ", "%" + value, "cpNo");
            return (Criteria) this;
        }

        public Criteria andCpNoLikeRight(String value) {
            addCriterion("TA.CP_NO like ", value + "%", "cpNo");
            return (Criteria) this;
        }

        public Criteria andCpNoLikeBoth(String value) {
            addCriterion("TA.CP_NO like ", "%" + value + "%", "cpNo");
            return (Criteria) this;
        }

        public Criteria andAdmSiteCdLikeLeft(String value) {
            addCriterion("TA.ADM_SITE_CD like ", "%" + value, "admSiteCd");
            return (Criteria) this;
        }

        public Criteria andAdmSiteCdLikeRight(String value) {
            addCriterion("TA.ADM_SITE_CD like ", value + "%", "admSiteCd");
            return (Criteria) this;
        }

        public Criteria andAdmSiteCdLikeBoth(String value) {
            addCriterion("TA.ADM_SITE_CD like ", "%" + value + "%", "admSiteCd");
            return (Criteria) this;
        }

        public Criteria andAprvGrdCdLikeLeft(String value) {
            addCriterion("TA.APRV_GRD_CD like ", "%" + value, "aprvGrdCd");
            return (Criteria) this;
        }

        public Criteria andAprvGrdCdLikeRight(String value) {
            addCriterion("TA.APRV_GRD_CD like ", value + "%", "aprvGrdCd");
            return (Criteria) this;
        }

        public Criteria andAprvGrdCdLikeBoth(String value) {
            addCriterion("TA.APRV_GRD_CD like ", "%" + value + "%", "aprvGrdCd");
            return (Criteria) this;
        }

        public Criteria andRegIdLikeLeft(String value) {
            addCriterion("TA.REG_ID like ", "%" + value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdLikeRight(String value) {
            addCriterion("TA.REG_ID like ", value + "%", "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdLikeBoth(String value) {
            addCriterion("TA.REG_ID like ", "%" + value + "%", "regId");
            return (Criteria) this;
        }

        public Criteria andModIdLikeLeft(String value) {
            addCriterion("TA.MOD_ID like ", "%" + value, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdLikeRight(String value) {
            addCriterion("TA.MOD_ID like ", value + "%", "modId");
            return (Criteria) this;
        }

        public Criteria andModIdLikeBoth(String value) {
            addCriterion("TA.MOD_ID like ", "%" + value + "%", "modId");
            return (Criteria) this;
        }

        public Criteria andUseYnLikeLeft(String value) {
            addCriterion("TA.USE_YN like ", "%" + value, "useYn");
            return (Criteria) this;
        }

        public Criteria andUseYnLikeRight(String value) {
            addCriterion("TA.USE_YN like ", value + "%", "useYn");
            return (Criteria) this;
        }

        public Criteria andUseYnLikeBoth(String value) {
            addCriterion("TA.USE_YN like ", "%" + value + "%", "useYn");
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