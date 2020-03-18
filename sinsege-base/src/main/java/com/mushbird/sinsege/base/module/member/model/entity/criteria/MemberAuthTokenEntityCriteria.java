package com.mushbird.sinsege.base.module.member.model.entity.criteria;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class MemberAuthTokenEntityCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    public MemberAuthTokenEntityCriteria() {
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
            addCriterion("TMAT.MBR_ID is null");
            return (Criteria) this;
        }

        public Criteria andMbrIdIsNotNull() {
            addCriterion("TMAT.MBR_ID is not null");
            return (Criteria) this;
        }

        public Criteria andMbrIdEqualTo(String value) {
            addCriterion("TMAT.MBR_ID =", value, "mbrId");
            return (Criteria) this;
        }

        public Criteria andMbrIdNotEqualTo(String value) {
            addCriterion("TMAT.MBR_ID <>", value, "mbrId");
            return (Criteria) this;
        }

        public Criteria andMbrIdGreaterThan(String value) {
            addCriterion("TMAT.MBR_ID >", value, "mbrId");
            return (Criteria) this;
        }

        public Criteria andMbrIdGreaterThanOrEqualTo(String value) {
            addCriterion("TMAT.MBR_ID >=", value, "mbrId");
            return (Criteria) this;
        }

        public Criteria andMbrIdLessThan(String value) {
            addCriterion("TMAT.MBR_ID <", value, "mbrId");
            return (Criteria) this;
        }

        public Criteria andMbrIdLessThanOrEqualTo(String value) {
            addCriterion("TMAT.MBR_ID <=", value, "mbrId");
            return (Criteria) this;
        }

        public Criteria andMbrIdLike(String value) {
            addCriterion("TMAT.MBR_ID like", value, "mbrId");
            return (Criteria) this;
        }

        public Criteria andMbrIdNotLike(String value) {
            addCriterion("TMAT.MBR_ID not like", value, "mbrId");
            return (Criteria) this;
        }

        public Criteria andMbrIdIn(List<String> values) {
            addCriterion("TMAT.MBR_ID in", values, "mbrId");
            return (Criteria) this;
        }

        public Criteria andMbrIdNotIn(List<String> values) {
            addCriterion("TMAT.MBR_ID not in", values, "mbrId");
            return (Criteria) this;
        }

        public Criteria andMbrIdBetween(String value1, String value2) {
            addCriterion("TMAT.MBR_ID between", value1, value2, "mbrId");
            return (Criteria) this;
        }

        public Criteria andMbrIdNotBetween(String value1, String value2) {
            addCriterion("TMAT.MBR_ID not between", value1, value2, "mbrId");
            return (Criteria) this;
        }

        public Criteria andMbrAuthTknIsNull() {
            addCriterion("TMAT.MBR_AUTH_TKN is null");
            return (Criteria) this;
        }

        public Criteria andMbrAuthTknIsNotNull() {
            addCriterion("TMAT.MBR_AUTH_TKN is not null");
            return (Criteria) this;
        }

        public Criteria andMbrAuthTknEqualTo(String value) {
            addCriterion("TMAT.MBR_AUTH_TKN =", value, "mbrAuthTkn");
            return (Criteria) this;
        }

        public Criteria andMbrAuthTknNotEqualTo(String value) {
            addCriterion("TMAT.MBR_AUTH_TKN <>", value, "mbrAuthTkn");
            return (Criteria) this;
        }

        public Criteria andMbrAuthTknGreaterThan(String value) {
            addCriterion("TMAT.MBR_AUTH_TKN >", value, "mbrAuthTkn");
            return (Criteria) this;
        }

        public Criteria andMbrAuthTknGreaterThanOrEqualTo(String value) {
            addCriterion("TMAT.MBR_AUTH_TKN >=", value, "mbrAuthTkn");
            return (Criteria) this;
        }

        public Criteria andMbrAuthTknLessThan(String value) {
            addCriterion("TMAT.MBR_AUTH_TKN <", value, "mbrAuthTkn");
            return (Criteria) this;
        }

        public Criteria andMbrAuthTknLessThanOrEqualTo(String value) {
            addCriterion("TMAT.MBR_AUTH_TKN <=", value, "mbrAuthTkn");
            return (Criteria) this;
        }

        public Criteria andMbrAuthTknLike(String value) {
            addCriterion("TMAT.MBR_AUTH_TKN like", value, "mbrAuthTkn");
            return (Criteria) this;
        }

        public Criteria andMbrAuthTknNotLike(String value) {
            addCriterion("TMAT.MBR_AUTH_TKN not like", value, "mbrAuthTkn");
            return (Criteria) this;
        }

        public Criteria andMbrAuthTknIn(List<String> values) {
            addCriterion("TMAT.MBR_AUTH_TKN in", values, "mbrAuthTkn");
            return (Criteria) this;
        }

        public Criteria andMbrAuthTknNotIn(List<String> values) {
            addCriterion("TMAT.MBR_AUTH_TKN not in", values, "mbrAuthTkn");
            return (Criteria) this;
        }

        public Criteria andMbrAuthTknBetween(String value1, String value2) {
            addCriterion("TMAT.MBR_AUTH_TKN between", value1, value2, "mbrAuthTkn");
            return (Criteria) this;
        }

        public Criteria andMbrAuthTknNotBetween(String value1, String value2) {
            addCriterion("TMAT.MBR_AUTH_TKN not between", value1, value2, "mbrAuthTkn");
            return (Criteria) this;
        }

        public Criteria andXprDtIsNull() {
            addCriterion("TMAT.XPR_DT is null");
            return (Criteria) this;
        }

        public Criteria andXprDtIsNotNull() {
            addCriterion("TMAT.XPR_DT is not null");
            return (Criteria) this;
        }

        public Criteria andXprDtEqualTo(Date value) {
            addCriterionForJDBCDate("TMAT.XPR_DT =", value, "xprDt");
            return (Criteria) this;
        }

        public Criteria andXprDtNotEqualTo(Date value) {
            addCriterionForJDBCDate("TMAT.XPR_DT <>", value, "xprDt");
            return (Criteria) this;
        }

        public Criteria andXprDtGreaterThan(Date value) {
            addCriterionForJDBCDate("TMAT.XPR_DT >", value, "xprDt");
            return (Criteria) this;
        }

        public Criteria andXprDtGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("TMAT.XPR_DT >=", value, "xprDt");
            return (Criteria) this;
        }

        public Criteria andXprDtLessThan(Date value) {
            addCriterionForJDBCDate("TMAT.XPR_DT <", value, "xprDt");
            return (Criteria) this;
        }

        public Criteria andXprDtLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("TMAT.XPR_DT <=", value, "xprDt");
            return (Criteria) this;
        }

        public Criteria andXprDtIn(List<Date> values) {
            addCriterionForJDBCDate("TMAT.XPR_DT in", values, "xprDt");
            return (Criteria) this;
        }

        public Criteria andXprDtNotIn(List<Date> values) {
            addCriterionForJDBCDate("TMAT.XPR_DT not in", values, "xprDt");
            return (Criteria) this;
        }

        public Criteria andXprDtBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("TMAT.XPR_DT between", value1, value2, "xprDt");
            return (Criteria) this;
        }

        public Criteria andXprDtNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("TMAT.XPR_DT not between", value1, value2, "xprDt");
            return (Criteria) this;
        }

        public Criteria andAuthUseYnIsNull() {
            addCriterion("TMAT.AUTH_USE_YN is null");
            return (Criteria) this;
        }

        public Criteria andAuthUseYnIsNotNull() {
            addCriterion("TMAT.AUTH_USE_YN is not null");
            return (Criteria) this;
        }

        public Criteria andAuthUseYnEqualTo(String value) {
            addCriterion("TMAT.AUTH_USE_YN =", value, "authUseYn");
            return (Criteria) this;
        }

        public Criteria andAuthUseYnNotEqualTo(String value) {
            addCriterion("TMAT.AUTH_USE_YN <>", value, "authUseYn");
            return (Criteria) this;
        }

        public Criteria andAuthUseYnGreaterThan(String value) {
            addCriterion("TMAT.AUTH_USE_YN >", value, "authUseYn");
            return (Criteria) this;
        }

        public Criteria andAuthUseYnGreaterThanOrEqualTo(String value) {
            addCriterion("TMAT.AUTH_USE_YN >=", value, "authUseYn");
            return (Criteria) this;
        }

        public Criteria andAuthUseYnLessThan(String value) {
            addCriterion("TMAT.AUTH_USE_YN <", value, "authUseYn");
            return (Criteria) this;
        }

        public Criteria andAuthUseYnLessThanOrEqualTo(String value) {
            addCriterion("TMAT.AUTH_USE_YN <=", value, "authUseYn");
            return (Criteria) this;
        }

        public Criteria andAuthUseYnLike(String value) {
            addCriterion("TMAT.AUTH_USE_YN like", value, "authUseYn");
            return (Criteria) this;
        }

        public Criteria andAuthUseYnNotLike(String value) {
            addCriterion("TMAT.AUTH_USE_YN not like", value, "authUseYn");
            return (Criteria) this;
        }

        public Criteria andAuthUseYnIn(List<String> values) {
            addCriterion("TMAT.AUTH_USE_YN in", values, "authUseYn");
            return (Criteria) this;
        }

        public Criteria andAuthUseYnNotIn(List<String> values) {
            addCriterion("TMAT.AUTH_USE_YN not in", values, "authUseYn");
            return (Criteria) this;
        }

        public Criteria andAuthUseYnBetween(String value1, String value2) {
            addCriterion("TMAT.AUTH_USE_YN between", value1, value2, "authUseYn");
            return (Criteria) this;
        }

        public Criteria andAuthUseYnNotBetween(String value1, String value2) {
            addCriterion("TMAT.AUTH_USE_YN not between", value1, value2, "authUseYn");
            return (Criteria) this;
        }

        public Criteria andRegDtIsNull() {
            addCriterion("TMAT.REG_DT is null");
            return (Criteria) this;
        }

        public Criteria andRegDtIsNotNull() {
            addCriterion("TMAT.REG_DT is not null");
            return (Criteria) this;
        }

        public Criteria andRegDtEqualTo(Date value) {
            addCriterion("TMAT.REG_DT =", value, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtNotEqualTo(Date value) {
            addCriterion("TMAT.REG_DT <>", value, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtGreaterThan(Date value) {
            addCriterion("TMAT.REG_DT >", value, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtGreaterThanOrEqualTo(Date value) {
            addCriterion("TMAT.REG_DT >=", value, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtLessThan(Date value) {
            addCriterion("TMAT.REG_DT <", value, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtLessThanOrEqualTo(Date value) {
            addCriterion("TMAT.REG_DT <=", value, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtIn(List<Date> values) {
            addCriterion("TMAT.REG_DT in", values, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtNotIn(List<Date> values) {
            addCriterion("TMAT.REG_DT not in", values, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtBetween(Date value1, Date value2) {
            addCriterion("TMAT.REG_DT between", value1, value2, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtNotBetween(Date value1, Date value2) {
            addCriterion("TMAT.REG_DT not between", value1, value2, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegIdIsNull() {
            addCriterion("TMAT.REG_ID is null");
            return (Criteria) this;
        }

        public Criteria andRegIdIsNotNull() {
            addCriterion("TMAT.REG_ID is not null");
            return (Criteria) this;
        }

        public Criteria andRegIdEqualTo(String value) {
            addCriterion("TMAT.REG_ID =", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdNotEqualTo(String value) {
            addCriterion("TMAT.REG_ID <>", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdGreaterThan(String value) {
            addCriterion("TMAT.REG_ID >", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdGreaterThanOrEqualTo(String value) {
            addCriterion("TMAT.REG_ID >=", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdLessThan(String value) {
            addCriterion("TMAT.REG_ID <", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdLessThanOrEqualTo(String value) {
            addCriterion("TMAT.REG_ID <=", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdLike(String value) {
            addCriterion("TMAT.REG_ID like", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdNotLike(String value) {
            addCriterion("TMAT.REG_ID not like", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdIn(List<String> values) {
            addCriterion("TMAT.REG_ID in", values, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdNotIn(List<String> values) {
            addCriterion("TMAT.REG_ID not in", values, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdBetween(String value1, String value2) {
            addCriterion("TMAT.REG_ID between", value1, value2, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdNotBetween(String value1, String value2) {
            addCriterion("TMAT.REG_ID not between", value1, value2, "regId");
            return (Criteria) this;
        }

        public Criteria andModDtIsNull() {
            addCriterion("TMAT.MOD_DT is null");
            return (Criteria) this;
        }

        public Criteria andModDtIsNotNull() {
            addCriterion("TMAT.MOD_DT is not null");
            return (Criteria) this;
        }

        public Criteria andModDtEqualTo(Date value) {
            addCriterion("TMAT.MOD_DT =", value, "modDt");
            return (Criteria) this;
        }

        public Criteria andModDtNotEqualTo(Date value) {
            addCriterion("TMAT.MOD_DT <>", value, "modDt");
            return (Criteria) this;
        }

        public Criteria andModDtGreaterThan(Date value) {
            addCriterion("TMAT.MOD_DT >", value, "modDt");
            return (Criteria) this;
        }

        public Criteria andModDtGreaterThanOrEqualTo(Date value) {
            addCriterion("TMAT.MOD_DT >=", value, "modDt");
            return (Criteria) this;
        }

        public Criteria andModDtLessThan(Date value) {
            addCriterion("TMAT.MOD_DT <", value, "modDt");
            return (Criteria) this;
        }

        public Criteria andModDtLessThanOrEqualTo(Date value) {
            addCriterion("TMAT.MOD_DT <=", value, "modDt");
            return (Criteria) this;
        }

        public Criteria andModDtIn(List<Date> values) {
            addCriterion("TMAT.MOD_DT in", values, "modDt");
            return (Criteria) this;
        }

        public Criteria andModDtNotIn(List<Date> values) {
            addCriterion("TMAT.MOD_DT not in", values, "modDt");
            return (Criteria) this;
        }

        public Criteria andModDtBetween(Date value1, Date value2) {
            addCriterion("TMAT.MOD_DT between", value1, value2, "modDt");
            return (Criteria) this;
        }

        public Criteria andModDtNotBetween(Date value1, Date value2) {
            addCriterion("TMAT.MOD_DT not between", value1, value2, "modDt");
            return (Criteria) this;
        }

        public Criteria andModIdIsNull() {
            addCriterion("TMAT.MOD_ID is null");
            return (Criteria) this;
        }

        public Criteria andModIdIsNotNull() {
            addCriterion("TMAT.MOD_ID is not null");
            return (Criteria) this;
        }

        public Criteria andModIdEqualTo(String value) {
            addCriterion("TMAT.MOD_ID =", value, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdNotEqualTo(String value) {
            addCriterion("TMAT.MOD_ID <>", value, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdGreaterThan(String value) {
            addCriterion("TMAT.MOD_ID >", value, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdGreaterThanOrEqualTo(String value) {
            addCriterion("TMAT.MOD_ID >=", value, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdLessThan(String value) {
            addCriterion("TMAT.MOD_ID <", value, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdLessThanOrEqualTo(String value) {
            addCriterion("TMAT.MOD_ID <=", value, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdLike(String value) {
            addCriterion("TMAT.MOD_ID like", value, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdNotLike(String value) {
            addCriterion("TMAT.MOD_ID not like", value, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdIn(List<String> values) {
            addCriterion("TMAT.MOD_ID in", values, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdNotIn(List<String> values) {
            addCriterion("TMAT.MOD_ID not in", values, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdBetween(String value1, String value2) {
            addCriterion("TMAT.MOD_ID between", value1, value2, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdNotBetween(String value1, String value2) {
            addCriterion("TMAT.MOD_ID not between", value1, value2, "modId");
            return (Criteria) this;
        }

        public Criteria andUseYnIsNull() {
            addCriterion("TMAT.USE_YN is null");
            return (Criteria) this;
        }

        public Criteria andUseYnIsNotNull() {
            addCriterion("TMAT.USE_YN is not null");
            return (Criteria) this;
        }

        public Criteria andUseYnEqualTo(String value) {
            addCriterion("TMAT.USE_YN =", value, "useYn");
            return (Criteria) this;
        }

        public Criteria andUseYnNotEqualTo(String value) {
            addCriterion("TMAT.USE_YN <>", value, "useYn");
            return (Criteria) this;
        }

        public Criteria andUseYnGreaterThan(String value) {
            addCriterion("TMAT.USE_YN >", value, "useYn");
            return (Criteria) this;
        }

        public Criteria andUseYnGreaterThanOrEqualTo(String value) {
            addCriterion("TMAT.USE_YN >=", value, "useYn");
            return (Criteria) this;
        }

        public Criteria andUseYnLessThan(String value) {
            addCriterion("TMAT.USE_YN <", value, "useYn");
            return (Criteria) this;
        }

        public Criteria andUseYnLessThanOrEqualTo(String value) {
            addCriterion("TMAT.USE_YN <=", value, "useYn");
            return (Criteria) this;
        }

        public Criteria andUseYnLike(String value) {
            addCriterion("TMAT.USE_YN like", value, "useYn");
            return (Criteria) this;
        }

        public Criteria andUseYnNotLike(String value) {
            addCriterion("TMAT.USE_YN not like", value, "useYn");
            return (Criteria) this;
        }

        public Criteria andUseYnIn(List<String> values) {
            addCriterion("TMAT.USE_YN in", values, "useYn");
            return (Criteria) this;
        }

        public Criteria andUseYnNotIn(List<String> values) {
            addCriterion("TMAT.USE_YN not in", values, "useYn");
            return (Criteria) this;
        }

        public Criteria andUseYnBetween(String value1, String value2) {
            addCriterion("TMAT.USE_YN between", value1, value2, "useYn");
            return (Criteria) this;
        }

        public Criteria andUseYnNotBetween(String value1, String value2) {
            addCriterion("TMAT.USE_YN not between", value1, value2, "useYn");
            return (Criteria) this;
        }

        public Criteria andMbrIdLikeInsensitive(String value) {
            addCriterion("upper(TMAT.MBR_ID) like", value.toUpperCase(), "mbrId");
            return (Criteria) this;
        }

        public Criteria andMbrAuthTknLikeInsensitive(String value) {
            addCriterion("upper(TMAT.MBR_AUTH_TKN) like", value.toUpperCase(), "mbrAuthTkn");
            return (Criteria) this;
        }

        public Criteria andAuthUseYnLikeInsensitive(String value) {
            addCriterion("upper(TMAT.AUTH_USE_YN) like", value.toUpperCase(), "authUseYn");
            return (Criteria) this;
        }

        public Criteria andRegIdLikeInsensitive(String value) {
            addCriterion("upper(TMAT.REG_ID) like", value.toUpperCase(), "regId");
            return (Criteria) this;
        }

        public Criteria andModIdLikeInsensitive(String value) {
            addCriterion("upper(TMAT.MOD_ID) like", value.toUpperCase(), "modId");
            return (Criteria) this;
        }

        public Criteria andUseYnLikeInsensitive(String value) {
            addCriterion("upper(TMAT.USE_YN) like", value.toUpperCase(), "useYn");
            return (Criteria) this;
        }

        public Criteria andMbrIdLikeLeft(String value) {
            addCriterion("TMAT.MBR_ID like ", "%" + value, "mbrId");
            return (Criteria) this;
        }

        public Criteria andMbrIdLikeRight(String value) {
            addCriterion("TMAT.MBR_ID like ", value + "%", "mbrId");
            return (Criteria) this;
        }

        public Criteria andMbrIdLikeBoth(String value) {
            addCriterion("TMAT.MBR_ID like ", "%" + value + "%", "mbrId");
            return (Criteria) this;
        }

        public Criteria andMbrAuthTknLikeLeft(String value) {
            addCriterion("TMAT.MBR_AUTH_TKN like ", "%" + value, "mbrAuthTkn");
            return (Criteria) this;
        }

        public Criteria andMbrAuthTknLikeRight(String value) {
            addCriterion("TMAT.MBR_AUTH_TKN like ", value + "%", "mbrAuthTkn");
            return (Criteria) this;
        }

        public Criteria andMbrAuthTknLikeBoth(String value) {
            addCriterion("TMAT.MBR_AUTH_TKN like ", "%" + value + "%", "mbrAuthTkn");
            return (Criteria) this;
        }

        public Criteria andAuthUseYnLikeLeft(String value) {
            addCriterion("TMAT.AUTH_USE_YN like ", "%" + value, "authUseYn");
            return (Criteria) this;
        }

        public Criteria andAuthUseYnLikeRight(String value) {
            addCriterion("TMAT.AUTH_USE_YN like ", value + "%", "authUseYn");
            return (Criteria) this;
        }

        public Criteria andAuthUseYnLikeBoth(String value) {
            addCriterion("TMAT.AUTH_USE_YN like ", "%" + value + "%", "authUseYn");
            return (Criteria) this;
        }

        public Criteria andRegIdLikeLeft(String value) {
            addCriterion("TMAT.REG_ID like ", "%" + value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdLikeRight(String value) {
            addCriterion("TMAT.REG_ID like ", value + "%", "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdLikeBoth(String value) {
            addCriterion("TMAT.REG_ID like ", "%" + value + "%", "regId");
            return (Criteria) this;
        }

        public Criteria andModIdLikeLeft(String value) {
            addCriterion("TMAT.MOD_ID like ", "%" + value, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdLikeRight(String value) {
            addCriterion("TMAT.MOD_ID like ", value + "%", "modId");
            return (Criteria) this;
        }

        public Criteria andModIdLikeBoth(String value) {
            addCriterion("TMAT.MOD_ID like ", "%" + value + "%", "modId");
            return (Criteria) this;
        }

        public Criteria andUseYnLikeLeft(String value) {
            addCriterion("TMAT.USE_YN like ", "%" + value, "useYn");
            return (Criteria) this;
        }

        public Criteria andUseYnLikeRight(String value) {
            addCriterion("TMAT.USE_YN like ", value + "%", "useYn");
            return (Criteria) this;
        }

        public Criteria andUseYnLikeBoth(String value) {
            addCriterion("TMAT.USE_YN like ", "%" + value + "%", "useYn");
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