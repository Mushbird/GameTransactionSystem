package com.mushbird.sinsege.base.module.member.model.entity.criteria;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class MemberTypeEntityCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    public MemberTypeEntityCriteria() {
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

        public Criteria andMbrIdIsNull() {
            addCriterion("TMT.MBR_ID is null");
            return (Criteria) this;
        }

        public Criteria andMbrIdIsNotNull() {
            addCriterion("TMT.MBR_ID is not null");
            return (Criteria) this;
        }

        public Criteria andMbrIdEqualTo(String value) {
            addCriterion("TMT.MBR_ID =", value, "mbrId");
            return (Criteria) this;
        }

        public Criteria andMbrIdNotEqualTo(String value) {
            addCriterion("TMT.MBR_ID <>", value, "mbrId");
            return (Criteria) this;
        }

        public Criteria andMbrIdGreaterThan(String value) {
            addCriterion("TMT.MBR_ID >", value, "mbrId");
            return (Criteria) this;
        }

        public Criteria andMbrIdGreaterThanOrEqualTo(String value) {
            addCriterion("TMT.MBR_ID >=", value, "mbrId");
            return (Criteria) this;
        }

        public Criteria andMbrIdLessThan(String value) {
            addCriterion("TMT.MBR_ID <", value, "mbrId");
            return (Criteria) this;
        }

        public Criteria andMbrIdLessThanOrEqualTo(String value) {
            addCriterion("TMT.MBR_ID <=", value, "mbrId");
            return (Criteria) this;
        }

        public Criteria andMbrIdLike(String value) {
            addCriterion("TMT.MBR_ID like", value, "mbrId");
            return (Criteria) this;
        }

        public Criteria andMbrIdNotLike(String value) {
            addCriterion("TMT.MBR_ID not like", value, "mbrId");
            return (Criteria) this;
        }

        public Criteria andMbrIdIn(List<String> values) {
            addCriterion("TMT.MBR_ID in", values, "mbrId");
            return (Criteria) this;
        }

        public Criteria andMbrIdNotIn(List<String> values) {
            addCriterion("TMT.MBR_ID not in", values, "mbrId");
            return (Criteria) this;
        }

        public Criteria andMbrIdBetween(String value1, String value2) {
            addCriterion("TMT.MBR_ID between", value1, value2, "mbrId");
            return (Criteria) this;
        }

        public Criteria andMbrIdNotBetween(String value1, String value2) {
            addCriterion("TMT.MBR_ID not between", value1, value2, "mbrId");
            return (Criteria) this;
        }

        public Criteria andMbrTpCdIsNull() {
            addCriterion("TMT.MBR_TP_CD is null");
            return (Criteria) this;
        }

        public Criteria andMbrTpCdIsNotNull() {
            addCriterion("TMT.MBR_TP_CD is not null");
            return (Criteria) this;
        }

        public Criteria andMbrTpCdEqualTo(String value) {
            addCriterion("TMT.MBR_TP_CD =", value, "mbrTpCd");
            return (Criteria) this;
        }

        public Criteria andMbrTpCdNotEqualTo(String value) {
            addCriterion("TMT.MBR_TP_CD <>", value, "mbrTpCd");
            return (Criteria) this;
        }

        public Criteria andMbrTpCdGreaterThan(String value) {
            addCriterion("TMT.MBR_TP_CD >", value, "mbrTpCd");
            return (Criteria) this;
        }

        public Criteria andMbrTpCdGreaterThanOrEqualTo(String value) {
            addCriterion("TMT.MBR_TP_CD >=", value, "mbrTpCd");
            return (Criteria) this;
        }

        public Criteria andMbrTpCdLessThan(String value) {
            addCriterion("TMT.MBR_TP_CD <", value, "mbrTpCd");
            return (Criteria) this;
        }

        public Criteria andMbrTpCdLessThanOrEqualTo(String value) {
            addCriterion("TMT.MBR_TP_CD <=", value, "mbrTpCd");
            return (Criteria) this;
        }

        public Criteria andMbrTpCdLike(String value) {
            addCriterion("TMT.MBR_TP_CD like", value, "mbrTpCd");
            return (Criteria) this;
        }

        public Criteria andMbrTpCdNotLike(String value) {
            addCriterion("TMT.MBR_TP_CD not like", value, "mbrTpCd");
            return (Criteria) this;
        }

        public Criteria andMbrTpCdIn(List<String> values) {
            addCriterion("TMT.MBR_TP_CD in", values, "mbrTpCd");
            return (Criteria) this;
        }

        public Criteria andMbrTpCdNotIn(List<String> values) {
            addCriterion("TMT.MBR_TP_CD not in", values, "mbrTpCd");
            return (Criteria) this;
        }

        public Criteria andMbrTpCdBetween(String value1, String value2) {
            addCriterion("TMT.MBR_TP_CD between", value1, value2, "mbrTpCd");
            return (Criteria) this;
        }

        public Criteria andMbrTpCdNotBetween(String value1, String value2) {
            addCriterion("TMT.MBR_TP_CD not between", value1, value2, "mbrTpCd");
            return (Criteria) this;
        }

        public Criteria andAuthRefIdIsNull() {
            addCriterion("TMT.AUTH_REF_ID is null");
            return (Criteria) this;
        }

        public Criteria andAuthRefIdIsNotNull() {
            addCriterion("TMT.AUTH_REF_ID is not null");
            return (Criteria) this;
        }

        public Criteria andAuthRefIdEqualTo(Integer value) {
            addCriterion("TMT.AUTH_REF_ID =", value, "authRefId");
            return (Criteria) this;
        }

        public Criteria andAuthRefIdNotEqualTo(Integer value) {
            addCriterion("TMT.AUTH_REF_ID <>", value, "authRefId");
            return (Criteria) this;
        }

        public Criteria andAuthRefIdGreaterThan(Integer value) {
            addCriterion("TMT.AUTH_REF_ID >", value, "authRefId");
            return (Criteria) this;
        }

        public Criteria andAuthRefIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("TMT.AUTH_REF_ID >=", value, "authRefId");
            return (Criteria) this;
        }

        public Criteria andAuthRefIdLessThan(Integer value) {
            addCriterion("TMT.AUTH_REF_ID <", value, "authRefId");
            return (Criteria) this;
        }

        public Criteria andAuthRefIdLessThanOrEqualTo(Integer value) {
            addCriterion("TMT.AUTH_REF_ID <=", value, "authRefId");
            return (Criteria) this;
        }

        public Criteria andAuthRefIdIn(List<Integer> values) {
            addCriterion("TMT.AUTH_REF_ID in", values, "authRefId");
            return (Criteria) this;
        }

        public Criteria andAuthRefIdNotIn(List<Integer> values) {
            addCriterion("TMT.AUTH_REF_ID not in", values, "authRefId");
            return (Criteria) this;
        }

        public Criteria andAuthRefIdBetween(Integer value1, Integer value2) {
            addCriterion("TMT.AUTH_REF_ID between", value1, value2, "authRefId");
            return (Criteria) this;
        }

        public Criteria andAuthRefIdNotBetween(Integer value1, Integer value2) {
            addCriterion("TMT.AUTH_REF_ID not between", value1, value2, "authRefId");
            return (Criteria) this;
        }

        public Criteria andAuthDtIsNull() {
            addCriterion("TMT.AUTH_DT is null");
            return (Criteria) this;
        }

        public Criteria andAuthDtIsNotNull() {
            addCriterion("TMT.AUTH_DT is not null");
            return (Criteria) this;
        }

        public Criteria andAuthDtEqualTo(Date value) {
            addCriterionForJDBCDate("TMT.AUTH_DT =", value, "authDt");
            return (Criteria) this;
        }

        public Criteria andAuthDtNotEqualTo(Date value) {
            addCriterionForJDBCDate("TMT.AUTH_DT <>", value, "authDt");
            return (Criteria) this;
        }

        public Criteria andAuthDtGreaterThan(Date value) {
            addCriterionForJDBCDate("TMT.AUTH_DT >", value, "authDt");
            return (Criteria) this;
        }

        public Criteria andAuthDtGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("TMT.AUTH_DT >=", value, "authDt");
            return (Criteria) this;
        }

        public Criteria andAuthDtLessThan(Date value) {
            addCriterionForJDBCDate("TMT.AUTH_DT <", value, "authDt");
            return (Criteria) this;
        }

        public Criteria andAuthDtLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("TMT.AUTH_DT <=", value, "authDt");
            return (Criteria) this;
        }

        public Criteria andAuthDtIn(List<Date> values) {
            addCriterionForJDBCDate("TMT.AUTH_DT in", values, "authDt");
            return (Criteria) this;
        }

        public Criteria andAuthDtNotIn(List<Date> values) {
            addCriterionForJDBCDate("TMT.AUTH_DT not in", values, "authDt");
            return (Criteria) this;
        }

        public Criteria andAuthDtBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("TMT.AUTH_DT between", value1, value2, "authDt");
            return (Criteria) this;
        }

        public Criteria andAuthDtNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("TMT.AUTH_DT not between", value1, value2, "authDt");
            return (Criteria) this;
        }

        public Criteria andAdmIdIsNull() {
            addCriterion("TMT.ADM_ID is null");
            return (Criteria) this;
        }

        public Criteria andAdmIdIsNotNull() {
            addCriterion("TMT.ADM_ID is not null");
            return (Criteria) this;
        }

        public Criteria andAdmIdEqualTo(String value) {
            addCriterion("TMT.ADM_ID =", value, "admId");
            return (Criteria) this;
        }

        public Criteria andAdmIdNotEqualTo(String value) {
            addCriterion("TMT.ADM_ID <>", value, "admId");
            return (Criteria) this;
        }

        public Criteria andAdmIdGreaterThan(String value) {
            addCriterion("TMT.ADM_ID >", value, "admId");
            return (Criteria) this;
        }

        public Criteria andAdmIdGreaterThanOrEqualTo(String value) {
            addCriterion("TMT.ADM_ID >=", value, "admId");
            return (Criteria) this;
        }

        public Criteria andAdmIdLessThan(String value) {
            addCriterion("TMT.ADM_ID <", value, "admId");
            return (Criteria) this;
        }

        public Criteria andAdmIdLessThanOrEqualTo(String value) {
            addCriterion("TMT.ADM_ID <=", value, "admId");
            return (Criteria) this;
        }

        public Criteria andAdmIdLike(String value) {
            addCriterion("TMT.ADM_ID like", value, "admId");
            return (Criteria) this;
        }

        public Criteria andAdmIdNotLike(String value) {
            addCriterion("TMT.ADM_ID not like", value, "admId");
            return (Criteria) this;
        }

        public Criteria andAdmIdIn(List<String> values) {
            addCriterion("TMT.ADM_ID in", values, "admId");
            return (Criteria) this;
        }

        public Criteria andAdmIdNotIn(List<String> values) {
            addCriterion("TMT.ADM_ID not in", values, "admId");
            return (Criteria) this;
        }

        public Criteria andAdmIdBetween(String value1, String value2) {
            addCriterion("TMT.ADM_ID between", value1, value2, "admId");
            return (Criteria) this;
        }

        public Criteria andAdmIdNotBetween(String value1, String value2) {
            addCriterion("TMT.ADM_ID not between", value1, value2, "admId");
            return (Criteria) this;
        }

        public Criteria andRegDtIsNull() {
            addCriterion("TMT.REG_DT is null");
            return (Criteria) this;
        }

        public Criteria andRegDtIsNotNull() {
            addCriterion("TMT.REG_DT is not null");
            return (Criteria) this;
        }

        public Criteria andRegDtEqualTo(Date value) {
            addCriterion("TMT.REG_DT =", value, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtNotEqualTo(Date value) {
            addCriterion("TMT.REG_DT <>", value, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtGreaterThan(Date value) {
            addCriterion("TMT.REG_DT >", value, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtGreaterThanOrEqualTo(Date value) {
            addCriterion("TMT.REG_DT >=", value, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtLessThan(Date value) {
            addCriterion("TMT.REG_DT <", value, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtLessThanOrEqualTo(Date value) {
            addCriterion("TMT.REG_DT <=", value, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtIn(List<Date> values) {
            addCriterion("TMT.REG_DT in", values, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtNotIn(List<Date> values) {
            addCriterion("TMT.REG_DT not in", values, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtBetween(Date value1, Date value2) {
            addCriterion("TMT.REG_DT between", value1, value2, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtNotBetween(Date value1, Date value2) {
            addCriterion("TMT.REG_DT not between", value1, value2, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegIdIsNull() {
            addCriterion("TMT.REG_ID is null");
            return (Criteria) this;
        }

        public Criteria andRegIdIsNotNull() {
            addCriterion("TMT.REG_ID is not null");
            return (Criteria) this;
        }

        public Criteria andRegIdEqualTo(String value) {
            addCriterion("TMT.REG_ID =", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdNotEqualTo(String value) {
            addCriterion("TMT.REG_ID <>", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdGreaterThan(String value) {
            addCriterion("TMT.REG_ID >", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdGreaterThanOrEqualTo(String value) {
            addCriterion("TMT.REG_ID >=", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdLessThan(String value) {
            addCriterion("TMT.REG_ID <", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdLessThanOrEqualTo(String value) {
            addCriterion("TMT.REG_ID <=", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdLike(String value) {
            addCriterion("TMT.REG_ID like", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdNotLike(String value) {
            addCriterion("TMT.REG_ID not like", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdIn(List<String> values) {
            addCriterion("TMT.REG_ID in", values, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdNotIn(List<String> values) {
            addCriterion("TMT.REG_ID not in", values, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdBetween(String value1, String value2) {
            addCriterion("TMT.REG_ID between", value1, value2, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdNotBetween(String value1, String value2) {
            addCriterion("TMT.REG_ID not between", value1, value2, "regId");
            return (Criteria) this;
        }

        public Criteria andModDtIsNull() {
            addCriterion("TMT.MOD_DT is null");
            return (Criteria) this;
        }

        public Criteria andModDtIsNotNull() {
            addCriterion("TMT.MOD_DT is not null");
            return (Criteria) this;
        }

        public Criteria andModDtEqualTo(Date value) {
            addCriterion("TMT.MOD_DT =", value, "modDt");
            return (Criteria) this;
        }

        public Criteria andModDtNotEqualTo(Date value) {
            addCriterion("TMT.MOD_DT <>", value, "modDt");
            return (Criteria) this;
        }

        public Criteria andModDtGreaterThan(Date value) {
            addCriterion("TMT.MOD_DT >", value, "modDt");
            return (Criteria) this;
        }

        public Criteria andModDtGreaterThanOrEqualTo(Date value) {
            addCriterion("TMT.MOD_DT >=", value, "modDt");
            return (Criteria) this;
        }

        public Criteria andModDtLessThan(Date value) {
            addCriterion("TMT.MOD_DT <", value, "modDt");
            return (Criteria) this;
        }

        public Criteria andModDtLessThanOrEqualTo(Date value) {
            addCriterion("TMT.MOD_DT <=", value, "modDt");
            return (Criteria) this;
        }

        public Criteria andModDtIn(List<Date> values) {
            addCriterion("TMT.MOD_DT in", values, "modDt");
            return (Criteria) this;
        }

        public Criteria andModDtNotIn(List<Date> values) {
            addCriterion("TMT.MOD_DT not in", values, "modDt");
            return (Criteria) this;
        }

        public Criteria andModDtBetween(Date value1, Date value2) {
            addCriterion("TMT.MOD_DT between", value1, value2, "modDt");
            return (Criteria) this;
        }

        public Criteria andModDtNotBetween(Date value1, Date value2) {
            addCriterion("TMT.MOD_DT not between", value1, value2, "modDt");
            return (Criteria) this;
        }

        public Criteria andModIdIsNull() {
            addCriterion("TMT.MOD_ID is null");
            return (Criteria) this;
        }

        public Criteria andModIdIsNotNull() {
            addCriterion("TMT.MOD_ID is not null");
            return (Criteria) this;
        }

        public Criteria andModIdEqualTo(String value) {
            addCriterion("TMT.MOD_ID =", value, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdNotEqualTo(String value) {
            addCriterion("TMT.MOD_ID <>", value, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdGreaterThan(String value) {
            addCriterion("TMT.MOD_ID >", value, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdGreaterThanOrEqualTo(String value) {
            addCriterion("TMT.MOD_ID >=", value, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdLessThan(String value) {
            addCriterion("TMT.MOD_ID <", value, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdLessThanOrEqualTo(String value) {
            addCriterion("TMT.MOD_ID <=", value, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdLike(String value) {
            addCriterion("TMT.MOD_ID like", value, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdNotLike(String value) {
            addCriterion("TMT.MOD_ID not like", value, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdIn(List<String> values) {
            addCriterion("TMT.MOD_ID in", values, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdNotIn(List<String> values) {
            addCriterion("TMT.MOD_ID not in", values, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdBetween(String value1, String value2) {
            addCriterion("TMT.MOD_ID between", value1, value2, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdNotBetween(String value1, String value2) {
            addCriterion("TMT.MOD_ID not between", value1, value2, "modId");
            return (Criteria) this;
        }

        public Criteria andMbrIdLikeInsensitive(String value) {
            addCriterion("upper(TMT.MBR_ID) like", value.toUpperCase(), "mbrId");
            return (Criteria) this;
        }

        public Criteria andMbrTpCdLikeInsensitive(String value) {
            addCriterion("upper(TMT.MBR_TP_CD) like", value.toUpperCase(), "mbrTpCd");
            return (Criteria) this;
        }

        public Criteria andAdmIdLikeInsensitive(String value) {
            addCriterion("upper(TMT.ADM_ID) like", value.toUpperCase(), "admId");
            return (Criteria) this;
        }

        public Criteria andRegIdLikeInsensitive(String value) {
            addCriterion("upper(TMT.REG_ID) like", value.toUpperCase(), "regId");
            return (Criteria) this;
        }

        public Criteria andModIdLikeInsensitive(String value) {
            addCriterion("upper(TMT.MOD_ID) like", value.toUpperCase(), "modId");
            return (Criteria) this;
        }

        public Criteria andMbrIdLikeLeft(String value) {
            addCriterion("TMT.MBR_ID like ", "%" + value, "mbrId");
            return (Criteria) this;
        }

        public Criteria andMbrIdLikeRight(String value) {
            addCriterion("TMT.MBR_ID like ", value + "%", "mbrId");
            return (Criteria) this;
        }

        public Criteria andMbrIdLikeBoth(String value) {
            addCriterion("TMT.MBR_ID like ", "%" + value + "%", "mbrId");
            return (Criteria) this;
        }

        public Criteria andMbrTpCdLikeLeft(String value) {
            addCriterion("TMT.MBR_TP_CD like ", "%" + value, "mbrTpCd");
            return (Criteria) this;
        }

        public Criteria andMbrTpCdLikeRight(String value) {
            addCriterion("TMT.MBR_TP_CD like ", value + "%", "mbrTpCd");
            return (Criteria) this;
        }

        public Criteria andMbrTpCdLikeBoth(String value) {
            addCriterion("TMT.MBR_TP_CD like ", "%" + value + "%", "mbrTpCd");
            return (Criteria) this;
        }

        public Criteria andAdmIdLikeLeft(String value) {
            addCriterion("TMT.ADM_ID like ", "%" + value, "admId");
            return (Criteria) this;
        }

        public Criteria andAdmIdLikeRight(String value) {
            addCriterion("TMT.ADM_ID like ", value + "%", "admId");
            return (Criteria) this;
        }

        public Criteria andAdmIdLikeBoth(String value) {
            addCriterion("TMT.ADM_ID like ", "%" + value + "%", "admId");
            return (Criteria) this;
        }

        public Criteria andRegIdLikeLeft(String value) {
            addCriterion("TMT.REG_ID like ", "%" + value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdLikeRight(String value) {
            addCriterion("TMT.REG_ID like ", value + "%", "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdLikeBoth(String value) {
            addCriterion("TMT.REG_ID like ", "%" + value + "%", "regId");
            return (Criteria) this;
        }

        public Criteria andModIdLikeLeft(String value) {
            addCriterion("TMT.MOD_ID like ", "%" + value, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdLikeRight(String value) {
            addCriterion("TMT.MOD_ID like ", value + "%", "modId");
            return (Criteria) this;
        }

        public Criteria andModIdLikeBoth(String value) {
            addCriterion("TMT.MOD_ID like ", "%" + value + "%", "modId");
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