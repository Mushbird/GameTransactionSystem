package com.mushbird.sinsege.base.module.member.model.entity.criteria;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class MemberAgreeEntityCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    public MemberAgreeEntityCriteria() {
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
            addCriterion("TMAG.MBR_ID is null");
            return (Criteria) this;
        }

        public Criteria andMbrIdIsNotNull() {
            addCriterion("TMAG.MBR_ID is not null");
            return (Criteria) this;
        }

        public Criteria andMbrIdEqualTo(String value) {
            addCriterion("TMAG.MBR_ID =", value, "mbrId");
            return (Criteria) this;
        }

        public Criteria andMbrIdNotEqualTo(String value) {
            addCriterion("TMAG.MBR_ID <>", value, "mbrId");
            return (Criteria) this;
        }

        public Criteria andMbrIdGreaterThan(String value) {
            addCriterion("TMAG.MBR_ID >", value, "mbrId");
            return (Criteria) this;
        }

        public Criteria andMbrIdGreaterThanOrEqualTo(String value) {
            addCriterion("TMAG.MBR_ID >=", value, "mbrId");
            return (Criteria) this;
        }

        public Criteria andMbrIdLessThan(String value) {
            addCriterion("TMAG.MBR_ID <", value, "mbrId");
            return (Criteria) this;
        }

        public Criteria andMbrIdLessThanOrEqualTo(String value) {
            addCriterion("TMAG.MBR_ID <=", value, "mbrId");
            return (Criteria) this;
        }

        public Criteria andMbrIdLike(String value) {
            addCriterion("TMAG.MBR_ID like", value, "mbrId");
            return (Criteria) this;
        }

        public Criteria andMbrIdNotLike(String value) {
            addCriterion("TMAG.MBR_ID not like", value, "mbrId");
            return (Criteria) this;
        }

        public Criteria andMbrIdIn(List<String> values) {
            addCriterion("TMAG.MBR_ID in", values, "mbrId");
            return (Criteria) this;
        }

        public Criteria andMbrIdNotIn(List<String> values) {
            addCriterion("TMAG.MBR_ID not in", values, "mbrId");
            return (Criteria) this;
        }

        public Criteria andMbrIdBetween(String value1, String value2) {
            addCriterion("TMAG.MBR_ID between", value1, value2, "mbrId");
            return (Criteria) this;
        }

        public Criteria andMbrIdNotBetween(String value1, String value2) {
            addCriterion("TMAG.MBR_ID not between", value1, value2, "mbrId");
            return (Criteria) this;
        }

        public Criteria andAgrCdIsNull() {
            addCriterion("TMAG.AGR_CD is null");
            return (Criteria) this;
        }

        public Criteria andAgrCdIsNotNull() {
            addCriterion("TMAG.AGR_CD is not null");
            return (Criteria) this;
        }

        public Criteria andAgrCdEqualTo(String value) {
            addCriterion("TMAG.AGR_CD =", value, "agrCd");
            return (Criteria) this;
        }

        public Criteria andAgrCdNotEqualTo(String value) {
            addCriterion("TMAG.AGR_CD <>", value, "agrCd");
            return (Criteria) this;
        }

        public Criteria andAgrCdGreaterThan(String value) {
            addCriterion("TMAG.AGR_CD >", value, "agrCd");
            return (Criteria) this;
        }

        public Criteria andAgrCdGreaterThanOrEqualTo(String value) {
            addCriterion("TMAG.AGR_CD >=", value, "agrCd");
            return (Criteria) this;
        }

        public Criteria andAgrCdLessThan(String value) {
            addCriterion("TMAG.AGR_CD <", value, "agrCd");
            return (Criteria) this;
        }

        public Criteria andAgrCdLessThanOrEqualTo(String value) {
            addCriterion("TMAG.AGR_CD <=", value, "agrCd");
            return (Criteria) this;
        }

        public Criteria andAgrCdLike(String value) {
            addCriterion("TMAG.AGR_CD like", value, "agrCd");
            return (Criteria) this;
        }

        public Criteria andAgrCdNotLike(String value) {
            addCriterion("TMAG.AGR_CD not like", value, "agrCd");
            return (Criteria) this;
        }

        public Criteria andAgrCdIn(List<String> values) {
            addCriterion("TMAG.AGR_CD in", values, "agrCd");
            return (Criteria) this;
        }

        public Criteria andAgrCdNotIn(List<String> values) {
            addCriterion("TMAG.AGR_CD not in", values, "agrCd");
            return (Criteria) this;
        }

        public Criteria andAgrCdBetween(String value1, String value2) {
            addCriterion("TMAG.AGR_CD between", value1, value2, "agrCd");
            return (Criteria) this;
        }

        public Criteria andAgrCdNotBetween(String value1, String value2) {
            addCriterion("TMAG.AGR_CD not between", value1, value2, "agrCd");
            return (Criteria) this;
        }

        public Criteria andAgrYnIsNull() {
            addCriterion("TMAG.AGR_YN is null");
            return (Criteria) this;
        }

        public Criteria andAgrYnIsNotNull() {
            addCriterion("TMAG.AGR_YN is not null");
            return (Criteria) this;
        }

        public Criteria andAgrYnEqualTo(String value) {
            addCriterion("TMAG.AGR_YN =", value, "agrYn");
            return (Criteria) this;
        }

        public Criteria andAgrYnNotEqualTo(String value) {
            addCriterion("TMAG.AGR_YN <>", value, "agrYn");
            return (Criteria) this;
        }

        public Criteria andAgrYnGreaterThan(String value) {
            addCriterion("TMAG.AGR_YN >", value, "agrYn");
            return (Criteria) this;
        }

        public Criteria andAgrYnGreaterThanOrEqualTo(String value) {
            addCriterion("TMAG.AGR_YN >=", value, "agrYn");
            return (Criteria) this;
        }

        public Criteria andAgrYnLessThan(String value) {
            addCriterion("TMAG.AGR_YN <", value, "agrYn");
            return (Criteria) this;
        }

        public Criteria andAgrYnLessThanOrEqualTo(String value) {
            addCriterion("TMAG.AGR_YN <=", value, "agrYn");
            return (Criteria) this;
        }

        public Criteria andAgrYnLike(String value) {
            addCriterion("TMAG.AGR_YN like", value, "agrYn");
            return (Criteria) this;
        }

        public Criteria andAgrYnNotLike(String value) {
            addCriterion("TMAG.AGR_YN not like", value, "agrYn");
            return (Criteria) this;
        }

        public Criteria andAgrYnIn(List<String> values) {
            addCriterion("TMAG.AGR_YN in", values, "agrYn");
            return (Criteria) this;
        }

        public Criteria andAgrYnNotIn(List<String> values) {
            addCriterion("TMAG.AGR_YN not in", values, "agrYn");
            return (Criteria) this;
        }

        public Criteria andAgrYnBetween(String value1, String value2) {
            addCriterion("TMAG.AGR_YN between", value1, value2, "agrYn");
            return (Criteria) this;
        }

        public Criteria andAgrYnNotBetween(String value1, String value2) {
            addCriterion("TMAG.AGR_YN not between", value1, value2, "agrYn");
            return (Criteria) this;
        }

        public Criteria andAgrChgDtIsNull() {
            addCriterion("TMAG.AGR_CHG_DT is null");
            return (Criteria) this;
        }

        public Criteria andAgrChgDtIsNotNull() {
            addCriterion("TMAG.AGR_CHG_DT is not null");
            return (Criteria) this;
        }

        public Criteria andAgrChgDtEqualTo(Date value) {
            addCriterionForJDBCDate("TMAG.AGR_CHG_DT =", value, "agrChgDt");
            return (Criteria) this;
        }

        public Criteria andAgrChgDtNotEqualTo(Date value) {
            addCriterionForJDBCDate("TMAG.AGR_CHG_DT <>", value, "agrChgDt");
            return (Criteria) this;
        }

        public Criteria andAgrChgDtGreaterThan(Date value) {
            addCriterionForJDBCDate("TMAG.AGR_CHG_DT >", value, "agrChgDt");
            return (Criteria) this;
        }

        public Criteria andAgrChgDtGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("TMAG.AGR_CHG_DT >=", value, "agrChgDt");
            return (Criteria) this;
        }

        public Criteria andAgrChgDtLessThan(Date value) {
            addCriterionForJDBCDate("TMAG.AGR_CHG_DT <", value, "agrChgDt");
            return (Criteria) this;
        }

        public Criteria andAgrChgDtLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("TMAG.AGR_CHG_DT <=", value, "agrChgDt");
            return (Criteria) this;
        }

        public Criteria andAgrChgDtIn(List<Date> values) {
            addCriterionForJDBCDate("TMAG.AGR_CHG_DT in", values, "agrChgDt");
            return (Criteria) this;
        }

        public Criteria andAgrChgDtNotIn(List<Date> values) {
            addCriterionForJDBCDate("TMAG.AGR_CHG_DT not in", values, "agrChgDt");
            return (Criteria) this;
        }

        public Criteria andAgrChgDtBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("TMAG.AGR_CHG_DT between", value1, value2, "agrChgDt");
            return (Criteria) this;
        }

        public Criteria andAgrChgDtNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("TMAG.AGR_CHG_DT not between", value1, value2, "agrChgDt");
            return (Criteria) this;
        }

        public Criteria andRetntUsePdNoyIsNull() {
            addCriterion("TMAG.RETNT_USE_PD_NOY is null");
            return (Criteria) this;
        }

        public Criteria andRetntUsePdNoyIsNotNull() {
            addCriterion("TMAG.RETNT_USE_PD_NOY is not null");
            return (Criteria) this;
        }

        public Criteria andRetntUsePdNoyEqualTo(Integer value) {
            addCriterion("TMAG.RETNT_USE_PD_NOY =", value, "retntUsePdNoy");
            return (Criteria) this;
        }

        public Criteria andRetntUsePdNoyNotEqualTo(Integer value) {
            addCriterion("TMAG.RETNT_USE_PD_NOY <>", value, "retntUsePdNoy");
            return (Criteria) this;
        }

        public Criteria andRetntUsePdNoyGreaterThan(Integer value) {
            addCriterion("TMAG.RETNT_USE_PD_NOY >", value, "retntUsePdNoy");
            return (Criteria) this;
        }

        public Criteria andRetntUsePdNoyGreaterThanOrEqualTo(Integer value) {
            addCriterion("TMAG.RETNT_USE_PD_NOY >=", value, "retntUsePdNoy");
            return (Criteria) this;
        }

        public Criteria andRetntUsePdNoyLessThan(Integer value) {
            addCriterion("TMAG.RETNT_USE_PD_NOY <", value, "retntUsePdNoy");
            return (Criteria) this;
        }

        public Criteria andRetntUsePdNoyLessThanOrEqualTo(Integer value) {
            addCriterion("TMAG.RETNT_USE_PD_NOY <=", value, "retntUsePdNoy");
            return (Criteria) this;
        }

        public Criteria andRetntUsePdNoyIn(List<Integer> values) {
            addCriterion("TMAG.RETNT_USE_PD_NOY in", values, "retntUsePdNoy");
            return (Criteria) this;
        }

        public Criteria andRetntUsePdNoyNotIn(List<Integer> values) {
            addCriterion("TMAG.RETNT_USE_PD_NOY not in", values, "retntUsePdNoy");
            return (Criteria) this;
        }

        public Criteria andRetntUsePdNoyBetween(Integer value1, Integer value2) {
            addCriterion("TMAG.RETNT_USE_PD_NOY between", value1, value2, "retntUsePdNoy");
            return (Criteria) this;
        }

        public Criteria andRetntUsePdNoyNotBetween(Integer value1, Integer value2) {
            addCriterion("TMAG.RETNT_USE_PD_NOY not between", value1, value2, "retntUsePdNoy");
            return (Criteria) this;
        }

        public Criteria andRegDtIsNull() {
            addCriterion("TMAG.REG_DT is null");
            return (Criteria) this;
        }

        public Criteria andRegDtIsNotNull() {
            addCriterion("TMAG.REG_DT is not null");
            return (Criteria) this;
        }

        public Criteria andRegDtEqualTo(Date value) {
            addCriterion("TMAG.REG_DT =", value, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtNotEqualTo(Date value) {
            addCriterion("TMAG.REG_DT <>", value, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtGreaterThan(Date value) {
            addCriterion("TMAG.REG_DT >", value, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtGreaterThanOrEqualTo(Date value) {
            addCriterion("TMAG.REG_DT >=", value, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtLessThan(Date value) {
            addCriterion("TMAG.REG_DT <", value, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtLessThanOrEqualTo(Date value) {
            addCriterion("TMAG.REG_DT <=", value, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtIn(List<Date> values) {
            addCriterion("TMAG.REG_DT in", values, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtNotIn(List<Date> values) {
            addCriterion("TMAG.REG_DT not in", values, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtBetween(Date value1, Date value2) {
            addCriterion("TMAG.REG_DT between", value1, value2, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtNotBetween(Date value1, Date value2) {
            addCriterion("TMAG.REG_DT not between", value1, value2, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegIdIsNull() {
            addCriterion("TMAG.REG_ID is null");
            return (Criteria) this;
        }

        public Criteria andRegIdIsNotNull() {
            addCriterion("TMAG.REG_ID is not null");
            return (Criteria) this;
        }

        public Criteria andRegIdEqualTo(String value) {
            addCriterion("TMAG.REG_ID =", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdNotEqualTo(String value) {
            addCriterion("TMAG.REG_ID <>", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdGreaterThan(String value) {
            addCriterion("TMAG.REG_ID >", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdGreaterThanOrEqualTo(String value) {
            addCriterion("TMAG.REG_ID >=", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdLessThan(String value) {
            addCriterion("TMAG.REG_ID <", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdLessThanOrEqualTo(String value) {
            addCriterion("TMAG.REG_ID <=", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdLike(String value) {
            addCriterion("TMAG.REG_ID like", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdNotLike(String value) {
            addCriterion("TMAG.REG_ID not like", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdIn(List<String> values) {
            addCriterion("TMAG.REG_ID in", values, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdNotIn(List<String> values) {
            addCriterion("TMAG.REG_ID not in", values, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdBetween(String value1, String value2) {
            addCriterion("TMAG.REG_ID between", value1, value2, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdNotBetween(String value1, String value2) {
            addCriterion("TMAG.REG_ID not between", value1, value2, "regId");
            return (Criteria) this;
        }

        public Criteria andModDtIsNull() {
            addCriterion("TMAG.MOD_DT is null");
            return (Criteria) this;
        }

        public Criteria andModDtIsNotNull() {
            addCriterion("TMAG.MOD_DT is not null");
            return (Criteria) this;
        }

        public Criteria andModDtEqualTo(Date value) {
            addCriterion("TMAG.MOD_DT =", value, "modDt");
            return (Criteria) this;
        }

        public Criteria andModDtNotEqualTo(Date value) {
            addCriterion("TMAG.MOD_DT <>", value, "modDt");
            return (Criteria) this;
        }

        public Criteria andModDtGreaterThan(Date value) {
            addCriterion("TMAG.MOD_DT >", value, "modDt");
            return (Criteria) this;
        }

        public Criteria andModDtGreaterThanOrEqualTo(Date value) {
            addCriterion("TMAG.MOD_DT >=", value, "modDt");
            return (Criteria) this;
        }

        public Criteria andModDtLessThan(Date value) {
            addCriterion("TMAG.MOD_DT <", value, "modDt");
            return (Criteria) this;
        }

        public Criteria andModDtLessThanOrEqualTo(Date value) {
            addCriterion("TMAG.MOD_DT <=", value, "modDt");
            return (Criteria) this;
        }

        public Criteria andModDtIn(List<Date> values) {
            addCriterion("TMAG.MOD_DT in", values, "modDt");
            return (Criteria) this;
        }

        public Criteria andModDtNotIn(List<Date> values) {
            addCriterion("TMAG.MOD_DT not in", values, "modDt");
            return (Criteria) this;
        }

        public Criteria andModDtBetween(Date value1, Date value2) {
            addCriterion("TMAG.MOD_DT between", value1, value2, "modDt");
            return (Criteria) this;
        }

        public Criteria andModDtNotBetween(Date value1, Date value2) {
            addCriterion("TMAG.MOD_DT not between", value1, value2, "modDt");
            return (Criteria) this;
        }

        public Criteria andModIdIsNull() {
            addCriterion("TMAG.MOD_ID is null");
            return (Criteria) this;
        }

        public Criteria andModIdIsNotNull() {
            addCriterion("TMAG.MOD_ID is not null");
            return (Criteria) this;
        }

        public Criteria andModIdEqualTo(String value) {
            addCriterion("TMAG.MOD_ID =", value, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdNotEqualTo(String value) {
            addCriterion("TMAG.MOD_ID <>", value, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdGreaterThan(String value) {
            addCriterion("TMAG.MOD_ID >", value, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdGreaterThanOrEqualTo(String value) {
            addCriterion("TMAG.MOD_ID >=", value, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdLessThan(String value) {
            addCriterion("TMAG.MOD_ID <", value, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdLessThanOrEqualTo(String value) {
            addCriterion("TMAG.MOD_ID <=", value, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdLike(String value) {
            addCriterion("TMAG.MOD_ID like", value, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdNotLike(String value) {
            addCriterion("TMAG.MOD_ID not like", value, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdIn(List<String> values) {
            addCriterion("TMAG.MOD_ID in", values, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdNotIn(List<String> values) {
            addCriterion("TMAG.MOD_ID not in", values, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdBetween(String value1, String value2) {
            addCriterion("TMAG.MOD_ID between", value1, value2, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdNotBetween(String value1, String value2) {
            addCriterion("TMAG.MOD_ID not between", value1, value2, "modId");
            return (Criteria) this;
        }

        public Criteria andMbrIdLikeInsensitive(String value) {
            addCriterion("upper(TMAG.MBR_ID) like", value.toUpperCase(), "mbrId");
            return (Criteria) this;
        }

        public Criteria andAgrCdLikeInsensitive(String value) {
            addCriterion("upper(TMAG.AGR_CD) like", value.toUpperCase(), "agrCd");
            return (Criteria) this;
        }

        public Criteria andAgrYnLikeInsensitive(String value) {
            addCriterion("upper(TMAG.AGR_YN) like", value.toUpperCase(), "agrYn");
            return (Criteria) this;
        }

        public Criteria andRegIdLikeInsensitive(String value) {
            addCriterion("upper(TMAG.REG_ID) like", value.toUpperCase(), "regId");
            return (Criteria) this;
        }

        public Criteria andModIdLikeInsensitive(String value) {
            addCriterion("upper(TMAG.MOD_ID) like", value.toUpperCase(), "modId");
            return (Criteria) this;
        }

        public Criteria andMbrIdLikeLeft(String value) {
            addCriterion("TMAG.MBR_ID like ", "%" + value, "mbrId");
            return (Criteria) this;
        }

        public Criteria andMbrIdLikeRight(String value) {
            addCriterion("TMAG.MBR_ID like ", value + "%", "mbrId");
            return (Criteria) this;
        }

        public Criteria andMbrIdLikeBoth(String value) {
            addCriterion("TMAG.MBR_ID like ", "%" + value + "%", "mbrId");
            return (Criteria) this;
        }

        public Criteria andAgrCdLikeLeft(String value) {
            addCriterion("TMAG.AGR_CD like ", "%" + value, "agrCd");
            return (Criteria) this;
        }

        public Criteria andAgrCdLikeRight(String value) {
            addCriterion("TMAG.AGR_CD like ", value + "%", "agrCd");
            return (Criteria) this;
        }

        public Criteria andAgrCdLikeBoth(String value) {
            addCriterion("TMAG.AGR_CD like ", "%" + value + "%", "agrCd");
            return (Criteria) this;
        }

        public Criteria andAgrYnLikeLeft(String value) {
            addCriterion("TMAG.AGR_YN like ", "%" + value, "agrYn");
            return (Criteria) this;
        }

        public Criteria andAgrYnLikeRight(String value) {
            addCriterion("TMAG.AGR_YN like ", value + "%", "agrYn");
            return (Criteria) this;
        }

        public Criteria andAgrYnLikeBoth(String value) {
            addCriterion("TMAG.AGR_YN like ", "%" + value + "%", "agrYn");
            return (Criteria) this;
        }

        public Criteria andRegIdLikeLeft(String value) {
            addCriterion("TMAG.REG_ID like ", "%" + value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdLikeRight(String value) {
            addCriterion("TMAG.REG_ID like ", value + "%", "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdLikeBoth(String value) {
            addCriterion("TMAG.REG_ID like ", "%" + value + "%", "regId");
            return (Criteria) this;
        }

        public Criteria andModIdLikeLeft(String value) {
            addCriterion("TMAG.MOD_ID like ", "%" + value, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdLikeRight(String value) {
            addCriterion("TMAG.MOD_ID like ", value + "%", "modId");
            return (Criteria) this;
        }

        public Criteria andModIdLikeBoth(String value) {
            addCriterion("TMAG.MOD_ID like ", "%" + value + "%", "modId");
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