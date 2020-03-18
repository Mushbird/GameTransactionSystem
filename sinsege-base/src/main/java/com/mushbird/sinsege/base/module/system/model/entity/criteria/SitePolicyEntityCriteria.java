package com.mushbird.sinsege.base.module.system.model.entity.criteria;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SitePolicyEntityCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    public SitePolicyEntityCriteria() {
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

        public Criteria andSiteIdIsNull() {
            addCriterion("TSP.SITE_ID is null");
            return (Criteria) this;
        }

        public Criteria andSiteIdIsNotNull() {
            addCriterion("TSP.SITE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andSiteIdEqualTo(String value) {
            addCriterion("TSP.SITE_ID =", value, "siteId");
            return (Criteria) this;
        }

        public Criteria andSiteIdNotEqualTo(String value) {
            addCriterion("TSP.SITE_ID <>", value, "siteId");
            return (Criteria) this;
        }

        public Criteria andSiteIdGreaterThan(String value) {
            addCriterion("TSP.SITE_ID >", value, "siteId");
            return (Criteria) this;
        }

        public Criteria andSiteIdGreaterThanOrEqualTo(String value) {
            addCriterion("TSP.SITE_ID >=", value, "siteId");
            return (Criteria) this;
        }

        public Criteria andSiteIdLessThan(String value) {
            addCriterion("TSP.SITE_ID <", value, "siteId");
            return (Criteria) this;
        }

        public Criteria andSiteIdLessThanOrEqualTo(String value) {
            addCriterion("TSP.SITE_ID <=", value, "siteId");
            return (Criteria) this;
        }

        public Criteria andSiteIdLike(String value) {
            addCriterion("TSP.SITE_ID like", value, "siteId");
            return (Criteria) this;
        }

        public Criteria andSiteIdNotLike(String value) {
            addCriterion("TSP.SITE_ID not like", value, "siteId");
            return (Criteria) this;
        }

        public Criteria andSiteIdIn(List<String> values) {
            addCriterion("TSP.SITE_ID in", values, "siteId");
            return (Criteria) this;
        }

        public Criteria andSiteIdNotIn(List<String> values) {
            addCriterion("TSP.SITE_ID not in", values, "siteId");
            return (Criteria) this;
        }

        public Criteria andSiteIdBetween(String value1, String value2) {
            addCriterion("TSP.SITE_ID between", value1, value2, "siteId");
            return (Criteria) this;
        }

        public Criteria andSiteIdNotBetween(String value1, String value2) {
            addCriterion("TSP.SITE_ID not between", value1, value2, "siteId");
            return (Criteria) this;
        }

        public Criteria andSitePcyTpCdIsNull() {
            addCriterion("TSP.SITE_PCY_TP_CD is null");
            return (Criteria) this;
        }

        public Criteria andSitePcyTpCdIsNotNull() {
            addCriterion("TSP.SITE_PCY_TP_CD is not null");
            return (Criteria) this;
        }

        public Criteria andSitePcyTpCdEqualTo(String value) {
            addCriterion("TSP.SITE_PCY_TP_CD =", value, "sitePcyTpCd");
            return (Criteria) this;
        }

        public Criteria andSitePcyTpCdNotEqualTo(String value) {
            addCriterion("TSP.SITE_PCY_TP_CD <>", value, "sitePcyTpCd");
            return (Criteria) this;
        }

        public Criteria andSitePcyTpCdGreaterThan(String value) {
            addCriterion("TSP.SITE_PCY_TP_CD >", value, "sitePcyTpCd");
            return (Criteria) this;
        }

        public Criteria andSitePcyTpCdGreaterThanOrEqualTo(String value) {
            addCriterion("TSP.SITE_PCY_TP_CD >=", value, "sitePcyTpCd");
            return (Criteria) this;
        }

        public Criteria andSitePcyTpCdLessThan(String value) {
            addCriterion("TSP.SITE_PCY_TP_CD <", value, "sitePcyTpCd");
            return (Criteria) this;
        }

        public Criteria andSitePcyTpCdLessThanOrEqualTo(String value) {
            addCriterion("TSP.SITE_PCY_TP_CD <=", value, "sitePcyTpCd");
            return (Criteria) this;
        }

        public Criteria andSitePcyTpCdLike(String value) {
            addCriterion("TSP.SITE_PCY_TP_CD like", value, "sitePcyTpCd");
            return (Criteria) this;
        }

        public Criteria andSitePcyTpCdNotLike(String value) {
            addCriterion("TSP.SITE_PCY_TP_CD not like", value, "sitePcyTpCd");
            return (Criteria) this;
        }

        public Criteria andSitePcyTpCdIn(List<String> values) {
            addCriterion("TSP.SITE_PCY_TP_CD in", values, "sitePcyTpCd");
            return (Criteria) this;
        }

        public Criteria andSitePcyTpCdNotIn(List<String> values) {
            addCriterion("TSP.SITE_PCY_TP_CD not in", values, "sitePcyTpCd");
            return (Criteria) this;
        }

        public Criteria andSitePcyTpCdBetween(String value1, String value2) {
            addCriterion("TSP.SITE_PCY_TP_CD between", value1, value2, "sitePcyTpCd");
            return (Criteria) this;
        }

        public Criteria andSitePcyTpCdNotBetween(String value1, String value2) {
            addCriterion("TSP.SITE_PCY_TP_CD not between", value1, value2, "sitePcyTpCd");
            return (Criteria) this;
        }

        public Criteria andSitePcyEnvCdIsNull() {
            addCriterion("TSP.SITE_PCY_ENV_CD is null");
            return (Criteria) this;
        }

        public Criteria andSitePcyEnvCdIsNotNull() {
            addCriterion("TSP.SITE_PCY_ENV_CD is not null");
            return (Criteria) this;
        }

        public Criteria andSitePcyEnvCdEqualTo(String value) {
            addCriterion("TSP.SITE_PCY_ENV_CD =", value, "sitePcyEnvCd");
            return (Criteria) this;
        }

        public Criteria andSitePcyEnvCdNotEqualTo(String value) {
            addCriterion("TSP.SITE_PCY_ENV_CD <>", value, "sitePcyEnvCd");
            return (Criteria) this;
        }

        public Criteria andSitePcyEnvCdGreaterThan(String value) {
            addCriterion("TSP.SITE_PCY_ENV_CD >", value, "sitePcyEnvCd");
            return (Criteria) this;
        }

        public Criteria andSitePcyEnvCdGreaterThanOrEqualTo(String value) {
            addCriterion("TSP.SITE_PCY_ENV_CD >=", value, "sitePcyEnvCd");
            return (Criteria) this;
        }

        public Criteria andSitePcyEnvCdLessThan(String value) {
            addCriterion("TSP.SITE_PCY_ENV_CD <", value, "sitePcyEnvCd");
            return (Criteria) this;
        }

        public Criteria andSitePcyEnvCdLessThanOrEqualTo(String value) {
            addCriterion("TSP.SITE_PCY_ENV_CD <=", value, "sitePcyEnvCd");
            return (Criteria) this;
        }

        public Criteria andSitePcyEnvCdLike(String value) {
            addCriterion("TSP.SITE_PCY_ENV_CD like", value, "sitePcyEnvCd");
            return (Criteria) this;
        }

        public Criteria andSitePcyEnvCdNotLike(String value) {
            addCriterion("TSP.SITE_PCY_ENV_CD not like", value, "sitePcyEnvCd");
            return (Criteria) this;
        }

        public Criteria andSitePcyEnvCdIn(List<String> values) {
            addCriterion("TSP.SITE_PCY_ENV_CD in", values, "sitePcyEnvCd");
            return (Criteria) this;
        }

        public Criteria andSitePcyEnvCdNotIn(List<String> values) {
            addCriterion("TSP.SITE_PCY_ENV_CD not in", values, "sitePcyEnvCd");
            return (Criteria) this;
        }

        public Criteria andSitePcyEnvCdBetween(String value1, String value2) {
            addCriterion("TSP.SITE_PCY_ENV_CD between", value1, value2, "sitePcyEnvCd");
            return (Criteria) this;
        }

        public Criteria andSitePcyEnvCdNotBetween(String value1, String value2) {
            addCriterion("TSP.SITE_PCY_ENV_CD not between", value1, value2, "sitePcyEnvCd");
            return (Criteria) this;
        }

        public Criteria andContIsNull() {
            addCriterion("TSP.CONT is null");
            return (Criteria) this;
        }

        public Criteria andContIsNotNull() {
            addCriterion("TSP.CONT is not null");
            return (Criteria) this;
        }

        public Criteria andContEqualTo(String value) {
            addCriterion("TSP.CONT =", value, "cont");
            return (Criteria) this;
        }

        public Criteria andContNotEqualTo(String value) {
            addCriterion("TSP.CONT <>", value, "cont");
            return (Criteria) this;
        }

        public Criteria andContGreaterThan(String value) {
            addCriterion("TSP.CONT >", value, "cont");
            return (Criteria) this;
        }

        public Criteria andContGreaterThanOrEqualTo(String value) {
            addCriterion("TSP.CONT >=", value, "cont");
            return (Criteria) this;
        }

        public Criteria andContLessThan(String value) {
            addCriterion("TSP.CONT <", value, "cont");
            return (Criteria) this;
        }

        public Criteria andContLessThanOrEqualTo(String value) {
            addCriterion("TSP.CONT <=", value, "cont");
            return (Criteria) this;
        }

        public Criteria andContLike(String value) {
            addCriterion("TSP.CONT like", value, "cont");
            return (Criteria) this;
        }

        public Criteria andContNotLike(String value) {
            addCriterion("TSP.CONT not like", value, "cont");
            return (Criteria) this;
        }

        public Criteria andContIn(List<String> values) {
            addCriterion("TSP.CONT in", values, "cont");
            return (Criteria) this;
        }

        public Criteria andContNotIn(List<String> values) {
            addCriterion("TSP.CONT not in", values, "cont");
            return (Criteria) this;
        }

        public Criteria andContBetween(String value1, String value2) {
            addCriterion("TSP.CONT between", value1, value2, "cont");
            return (Criteria) this;
        }

        public Criteria andContNotBetween(String value1, String value2) {
            addCriterion("TSP.CONT not between", value1, value2, "cont");
            return (Criteria) this;
        }

        public Criteria andRegDtIsNull() {
            addCriterion("TSP.REG_DT is null");
            return (Criteria) this;
        }

        public Criteria andRegDtIsNotNull() {
            addCriterion("TSP.REG_DT is not null");
            return (Criteria) this;
        }

        public Criteria andRegDtEqualTo(Date value) {
            addCriterion("TSP.REG_DT =", value, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtNotEqualTo(Date value) {
            addCriterion("TSP.REG_DT <>", value, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtGreaterThan(Date value) {
            addCriterion("TSP.REG_DT >", value, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtGreaterThanOrEqualTo(Date value) {
            addCriterion("TSP.REG_DT >=", value, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtLessThan(Date value) {
            addCriterion("TSP.REG_DT <", value, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtLessThanOrEqualTo(Date value) {
            addCriterion("TSP.REG_DT <=", value, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtIn(List<Date> values) {
            addCriterion("TSP.REG_DT in", values, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtNotIn(List<Date> values) {
            addCriterion("TSP.REG_DT not in", values, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtBetween(Date value1, Date value2) {
            addCriterion("TSP.REG_DT between", value1, value2, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtNotBetween(Date value1, Date value2) {
            addCriterion("TSP.REG_DT not between", value1, value2, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegIdIsNull() {
            addCriterion("TSP.REG_ID is null");
            return (Criteria) this;
        }

        public Criteria andRegIdIsNotNull() {
            addCriterion("TSP.REG_ID is not null");
            return (Criteria) this;
        }

        public Criteria andRegIdEqualTo(String value) {
            addCriterion("TSP.REG_ID =", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdNotEqualTo(String value) {
            addCriterion("TSP.REG_ID <>", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdGreaterThan(String value) {
            addCriterion("TSP.REG_ID >", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdGreaterThanOrEqualTo(String value) {
            addCriterion("TSP.REG_ID >=", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdLessThan(String value) {
            addCriterion("TSP.REG_ID <", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdLessThanOrEqualTo(String value) {
            addCriterion("TSP.REG_ID <=", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdLike(String value) {
            addCriterion("TSP.REG_ID like", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdNotLike(String value) {
            addCriterion("TSP.REG_ID not like", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdIn(List<String> values) {
            addCriterion("TSP.REG_ID in", values, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdNotIn(List<String> values) {
            addCriterion("TSP.REG_ID not in", values, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdBetween(String value1, String value2) {
            addCriterion("TSP.REG_ID between", value1, value2, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdNotBetween(String value1, String value2) {
            addCriterion("TSP.REG_ID not between", value1, value2, "regId");
            return (Criteria) this;
        }

        public Criteria andModDtIsNull() {
            addCriterion("TSP.MOD_DT is null");
            return (Criteria) this;
        }

        public Criteria andModDtIsNotNull() {
            addCriterion("TSP.MOD_DT is not null");
            return (Criteria) this;
        }

        public Criteria andModDtEqualTo(Date value) {
            addCriterion("TSP.MOD_DT =", value, "modDt");
            return (Criteria) this;
        }

        public Criteria andModDtNotEqualTo(Date value) {
            addCriterion("TSP.MOD_DT <>", value, "modDt");
            return (Criteria) this;
        }

        public Criteria andModDtGreaterThan(Date value) {
            addCriterion("TSP.MOD_DT >", value, "modDt");
            return (Criteria) this;
        }

        public Criteria andModDtGreaterThanOrEqualTo(Date value) {
            addCriterion("TSP.MOD_DT >=", value, "modDt");
            return (Criteria) this;
        }

        public Criteria andModDtLessThan(Date value) {
            addCriterion("TSP.MOD_DT <", value, "modDt");
            return (Criteria) this;
        }

        public Criteria andModDtLessThanOrEqualTo(Date value) {
            addCriterion("TSP.MOD_DT <=", value, "modDt");
            return (Criteria) this;
        }

        public Criteria andModDtIn(List<Date> values) {
            addCriterion("TSP.MOD_DT in", values, "modDt");
            return (Criteria) this;
        }

        public Criteria andModDtNotIn(List<Date> values) {
            addCriterion("TSP.MOD_DT not in", values, "modDt");
            return (Criteria) this;
        }

        public Criteria andModDtBetween(Date value1, Date value2) {
            addCriterion("TSP.MOD_DT between", value1, value2, "modDt");
            return (Criteria) this;
        }

        public Criteria andModDtNotBetween(Date value1, Date value2) {
            addCriterion("TSP.MOD_DT not between", value1, value2, "modDt");
            return (Criteria) this;
        }

        public Criteria andModIdIsNull() {
            addCriterion("TSP.MOD_ID is null");
            return (Criteria) this;
        }

        public Criteria andModIdIsNotNull() {
            addCriterion("TSP.MOD_ID is not null");
            return (Criteria) this;
        }

        public Criteria andModIdEqualTo(String value) {
            addCriterion("TSP.MOD_ID =", value, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdNotEqualTo(String value) {
            addCriterion("TSP.MOD_ID <>", value, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdGreaterThan(String value) {
            addCriterion("TSP.MOD_ID >", value, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdGreaterThanOrEqualTo(String value) {
            addCriterion("TSP.MOD_ID >=", value, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdLessThan(String value) {
            addCriterion("TSP.MOD_ID <", value, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdLessThanOrEqualTo(String value) {
            addCriterion("TSP.MOD_ID <=", value, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdLike(String value) {
            addCriterion("TSP.MOD_ID like", value, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdNotLike(String value) {
            addCriterion("TSP.MOD_ID not like", value, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdIn(List<String> values) {
            addCriterion("TSP.MOD_ID in", values, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdNotIn(List<String> values) {
            addCriterion("TSP.MOD_ID not in", values, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdBetween(String value1, String value2) {
            addCriterion("TSP.MOD_ID between", value1, value2, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdNotBetween(String value1, String value2) {
            addCriterion("TSP.MOD_ID not between", value1, value2, "modId");
            return (Criteria) this;
        }

        public Criteria andSiteIdLikeInsensitive(String value) {
            addCriterion("upper(TSP.SITE_ID) like", value.toUpperCase(), "siteId");
            return (Criteria) this;
        }

        public Criteria andSitePcyTpCdLikeInsensitive(String value) {
            addCriterion("upper(TSP.SITE_PCY_TP_CD) like", value.toUpperCase(), "sitePcyTpCd");
            return (Criteria) this;
        }

        public Criteria andSitePcyEnvCdLikeInsensitive(String value) {
            addCriterion("upper(TSP.SITE_PCY_ENV_CD) like", value.toUpperCase(), "sitePcyEnvCd");
            return (Criteria) this;
        }

        public Criteria andContLikeInsensitive(String value) {
            addCriterion("upper(TSP.CONT) like", value.toUpperCase(), "cont");
            return (Criteria) this;
        }

        public Criteria andRegIdLikeInsensitive(String value) {
            addCriterion("upper(TSP.REG_ID) like", value.toUpperCase(), "regId");
            return (Criteria) this;
        }

        public Criteria andModIdLikeInsensitive(String value) {
            addCriterion("upper(TSP.MOD_ID) like", value.toUpperCase(), "modId");
            return (Criteria) this;
        }

        public Criteria andSiteIdLikeLeft(String value) {
            addCriterion("TSP.SITE_ID like ", "%" + value, "siteId");
            return (Criteria) this;
        }

        public Criteria andSiteIdLikeRight(String value) {
            addCriterion("TSP.SITE_ID like ", value + "%", "siteId");
            return (Criteria) this;
        }

        public Criteria andSiteIdLikeBoth(String value) {
            addCriterion("TSP.SITE_ID like ", "%" + value + "%", "siteId");
            return (Criteria) this;
        }

        public Criteria andSitePcyTpCdLikeLeft(String value) {
            addCriterion("TSP.SITE_PCY_TP_CD like ", "%" + value, "sitePcyTpCd");
            return (Criteria) this;
        }

        public Criteria andSitePcyTpCdLikeRight(String value) {
            addCriterion("TSP.SITE_PCY_TP_CD like ", value + "%", "sitePcyTpCd");
            return (Criteria) this;
        }

        public Criteria andSitePcyTpCdLikeBoth(String value) {
            addCriterion("TSP.SITE_PCY_TP_CD like ", "%" + value + "%", "sitePcyTpCd");
            return (Criteria) this;
        }

        public Criteria andSitePcyEnvCdLikeLeft(String value) {
            addCriterion("TSP.SITE_PCY_ENV_CD like ", "%" + value, "sitePcyEnvCd");
            return (Criteria) this;
        }

        public Criteria andSitePcyEnvCdLikeRight(String value) {
            addCriterion("TSP.SITE_PCY_ENV_CD like ", value + "%", "sitePcyEnvCd");
            return (Criteria) this;
        }

        public Criteria andSitePcyEnvCdLikeBoth(String value) {
            addCriterion("TSP.SITE_PCY_ENV_CD like ", "%" + value + "%", "sitePcyEnvCd");
            return (Criteria) this;
        }

        public Criteria andContLikeLeft(String value) {
            addCriterion("TSP.CONT like ", "%" + value, "cont");
            return (Criteria) this;
        }

        public Criteria andContLikeRight(String value) {
            addCriterion("TSP.CONT like ", value + "%", "cont");
            return (Criteria) this;
        }

        public Criteria andContLikeBoth(String value) {
            addCriterion("TSP.CONT like ", "%" + value + "%", "cont");
            return (Criteria) this;
        }

        public Criteria andRegIdLikeLeft(String value) {
            addCriterion("TSP.REG_ID like ", "%" + value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdLikeRight(String value) {
            addCriterion("TSP.REG_ID like ", value + "%", "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdLikeBoth(String value) {
            addCriterion("TSP.REG_ID like ", "%" + value + "%", "regId");
            return (Criteria) this;
        }

        public Criteria andModIdLikeLeft(String value) {
            addCriterion("TSP.MOD_ID like ", "%" + value, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdLikeRight(String value) {
            addCriterion("TSP.MOD_ID like ", value + "%", "modId");
            return (Criteria) this;
        }

        public Criteria andModIdLikeBoth(String value) {
            addCriterion("TSP.MOD_ID like ", "%" + value + "%", "modId");
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