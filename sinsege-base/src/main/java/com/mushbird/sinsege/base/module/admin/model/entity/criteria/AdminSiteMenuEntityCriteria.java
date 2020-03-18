package com.mushbird.sinsege.base.module.admin.model.entity.criteria;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AdminSiteMenuEntityCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    public AdminSiteMenuEntityCriteria() {
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

        public Criteria andAdmSiteMenuIdIsNull() {
            addCriterion("TASM.ADM_SITE_MENU_ID is null");
            return (Criteria) this;
        }

        public Criteria andAdmSiteMenuIdIsNotNull() {
            addCriterion("TASM.ADM_SITE_MENU_ID is not null");
            return (Criteria) this;
        }

        public Criteria andAdmSiteMenuIdEqualTo(Integer value) {
            addCriterion("TASM.ADM_SITE_MENU_ID =", value, "admSiteMenuId");
            return (Criteria) this;
        }

        public Criteria andAdmSiteMenuIdNotEqualTo(Integer value) {
            addCriterion("TASM.ADM_SITE_MENU_ID <>", value, "admSiteMenuId");
            return (Criteria) this;
        }

        public Criteria andAdmSiteMenuIdGreaterThan(Integer value) {
            addCriterion("TASM.ADM_SITE_MENU_ID >", value, "admSiteMenuId");
            return (Criteria) this;
        }

        public Criteria andAdmSiteMenuIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("TASM.ADM_SITE_MENU_ID >=", value, "admSiteMenuId");
            return (Criteria) this;
        }

        public Criteria andAdmSiteMenuIdLessThan(Integer value) {
            addCriterion("TASM.ADM_SITE_MENU_ID <", value, "admSiteMenuId");
            return (Criteria) this;
        }

        public Criteria andAdmSiteMenuIdLessThanOrEqualTo(Integer value) {
            addCriterion("TASM.ADM_SITE_MENU_ID <=", value, "admSiteMenuId");
            return (Criteria) this;
        }

        public Criteria andAdmSiteMenuIdIn(List<Integer> values) {
            addCriterion("TASM.ADM_SITE_MENU_ID in", values, "admSiteMenuId");
            return (Criteria) this;
        }

        public Criteria andAdmSiteMenuIdNotIn(List<Integer> values) {
            addCriterion("TASM.ADM_SITE_MENU_ID not in", values, "admSiteMenuId");
            return (Criteria) this;
        }

        public Criteria andAdmSiteMenuIdBetween(Integer value1, Integer value2) {
            addCriterion("TASM.ADM_SITE_MENU_ID between", value1, value2, "admSiteMenuId");
            return (Criteria) this;
        }

        public Criteria andAdmSiteMenuIdNotBetween(Integer value1, Integer value2) {
            addCriterion("TASM.ADM_SITE_MENU_ID not between", value1, value2, "admSiteMenuId");
            return (Criteria) this;
        }

        public Criteria andRefAdmSiteMenuIdIsNull() {
            addCriterion("TASM.REF_ADM_SITE_MENU_ID is null");
            return (Criteria) this;
        }

        public Criteria andRefAdmSiteMenuIdIsNotNull() {
            addCriterion("TASM.REF_ADM_SITE_MENU_ID is not null");
            return (Criteria) this;
        }

        public Criteria andRefAdmSiteMenuIdEqualTo(Integer value) {
            addCriterion("TASM.REF_ADM_SITE_MENU_ID =", value, "refAdmSiteMenuId");
            return (Criteria) this;
        }

        public Criteria andRefAdmSiteMenuIdNotEqualTo(Integer value) {
            addCriterion("TASM.REF_ADM_SITE_MENU_ID <>", value, "refAdmSiteMenuId");
            return (Criteria) this;
        }

        public Criteria andRefAdmSiteMenuIdGreaterThan(Integer value) {
            addCriterion("TASM.REF_ADM_SITE_MENU_ID >", value, "refAdmSiteMenuId");
            return (Criteria) this;
        }

        public Criteria andRefAdmSiteMenuIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("TASM.REF_ADM_SITE_MENU_ID >=", value, "refAdmSiteMenuId");
            return (Criteria) this;
        }

        public Criteria andRefAdmSiteMenuIdLessThan(Integer value) {
            addCriterion("TASM.REF_ADM_SITE_MENU_ID <", value, "refAdmSiteMenuId");
            return (Criteria) this;
        }

        public Criteria andRefAdmSiteMenuIdLessThanOrEqualTo(Integer value) {
            addCriterion("TASM.REF_ADM_SITE_MENU_ID <=", value, "refAdmSiteMenuId");
            return (Criteria) this;
        }

        public Criteria andRefAdmSiteMenuIdIn(List<Integer> values) {
            addCriterion("TASM.REF_ADM_SITE_MENU_ID in", values, "refAdmSiteMenuId");
            return (Criteria) this;
        }

        public Criteria andRefAdmSiteMenuIdNotIn(List<Integer> values) {
            addCriterion("TASM.REF_ADM_SITE_MENU_ID not in", values, "refAdmSiteMenuId");
            return (Criteria) this;
        }

        public Criteria andRefAdmSiteMenuIdBetween(Integer value1, Integer value2) {
            addCriterion("TASM.REF_ADM_SITE_MENU_ID between", value1, value2, "refAdmSiteMenuId");
            return (Criteria) this;
        }

        public Criteria andRefAdmSiteMenuIdNotBetween(Integer value1, Integer value2) {
            addCriterion("TASM.REF_ADM_SITE_MENU_ID not between", value1, value2, "refAdmSiteMenuId");
            return (Criteria) this;
        }

        public Criteria andMenuNmIsNull() {
            addCriterion("TASM.MENU_NM is null");
            return (Criteria) this;
        }

        public Criteria andMenuNmIsNotNull() {
            addCriterion("TASM.MENU_NM is not null");
            return (Criteria) this;
        }

        public Criteria andMenuNmEqualTo(String value) {
            addCriterion("TASM.MENU_NM =", value, "menuNm");
            return (Criteria) this;
        }

        public Criteria andMenuNmNotEqualTo(String value) {
            addCriterion("TASM.MENU_NM <>", value, "menuNm");
            return (Criteria) this;
        }

        public Criteria andMenuNmGreaterThan(String value) {
            addCriterion("TASM.MENU_NM >", value, "menuNm");
            return (Criteria) this;
        }

        public Criteria andMenuNmGreaterThanOrEqualTo(String value) {
            addCriterion("TASM.MENU_NM >=", value, "menuNm");
            return (Criteria) this;
        }

        public Criteria andMenuNmLessThan(String value) {
            addCriterion("TASM.MENU_NM <", value, "menuNm");
            return (Criteria) this;
        }

        public Criteria andMenuNmLessThanOrEqualTo(String value) {
            addCriterion("TASM.MENU_NM <=", value, "menuNm");
            return (Criteria) this;
        }

        public Criteria andMenuNmLike(String value) {
            addCriterion("TASM.MENU_NM like", value, "menuNm");
            return (Criteria) this;
        }

        public Criteria andMenuNmNotLike(String value) {
            addCriterion("TASM.MENU_NM not like", value, "menuNm");
            return (Criteria) this;
        }

        public Criteria andMenuNmIn(List<String> values) {
            addCriterion("TASM.MENU_NM in", values, "menuNm");
            return (Criteria) this;
        }

        public Criteria andMenuNmNotIn(List<String> values) {
            addCriterion("TASM.MENU_NM not in", values, "menuNm");
            return (Criteria) this;
        }

        public Criteria andMenuNmBetween(String value1, String value2) {
            addCriterion("TASM.MENU_NM between", value1, value2, "menuNm");
            return (Criteria) this;
        }

        public Criteria andMenuNmNotBetween(String value1, String value2) {
            addCriterion("TASM.MENU_NM not between", value1, value2, "menuNm");
            return (Criteria) this;
        }

        public Criteria andUrlAddrIsNull() {
            addCriterion("TASM.URL_ADDR is null");
            return (Criteria) this;
        }

        public Criteria andUrlAddrIsNotNull() {
            addCriterion("TASM.URL_ADDR is not null");
            return (Criteria) this;
        }

        public Criteria andUrlAddrEqualTo(String value) {
            addCriterion("TASM.URL_ADDR =", value, "urlAddr");
            return (Criteria) this;
        }

        public Criteria andUrlAddrNotEqualTo(String value) {
            addCriterion("TASM.URL_ADDR <>", value, "urlAddr");
            return (Criteria) this;
        }

        public Criteria andUrlAddrGreaterThan(String value) {
            addCriterion("TASM.URL_ADDR >", value, "urlAddr");
            return (Criteria) this;
        }

        public Criteria andUrlAddrGreaterThanOrEqualTo(String value) {
            addCriterion("TASM.URL_ADDR >=", value, "urlAddr");
            return (Criteria) this;
        }

        public Criteria andUrlAddrLessThan(String value) {
            addCriterion("TASM.URL_ADDR <", value, "urlAddr");
            return (Criteria) this;
        }

        public Criteria andUrlAddrLessThanOrEqualTo(String value) {
            addCriterion("TASM.URL_ADDR <=", value, "urlAddr");
            return (Criteria) this;
        }

        public Criteria andUrlAddrLike(String value) {
            addCriterion("TASM.URL_ADDR like", value, "urlAddr");
            return (Criteria) this;
        }

        public Criteria andUrlAddrNotLike(String value) {
            addCriterion("TASM.URL_ADDR not like", value, "urlAddr");
            return (Criteria) this;
        }

        public Criteria andUrlAddrIn(List<String> values) {
            addCriterion("TASM.URL_ADDR in", values, "urlAddr");
            return (Criteria) this;
        }

        public Criteria andUrlAddrNotIn(List<String> values) {
            addCriterion("TASM.URL_ADDR not in", values, "urlAddr");
            return (Criteria) this;
        }

        public Criteria andUrlAddrBetween(String value1, String value2) {
            addCriterion("TASM.URL_ADDR between", value1, value2, "urlAddr");
            return (Criteria) this;
        }

        public Criteria andUrlAddrNotBetween(String value1, String value2) {
            addCriterion("TASM.URL_ADDR not between", value1, value2, "urlAddr");
            return (Criteria) this;
        }

        public Criteria andSordIsNull() {
            addCriterion("TASM.SORD is null");
            return (Criteria) this;
        }

        public Criteria andSordIsNotNull() {
            addCriterion("TASM.SORD is not null");
            return (Criteria) this;
        }

        public Criteria andSordEqualTo(Integer value) {
            addCriterion("TASM.SORD =", value, "sord");
            return (Criteria) this;
        }

        public Criteria andSordNotEqualTo(Integer value) {
            addCriterion("TASM.SORD <>", value, "sord");
            return (Criteria) this;
        }

        public Criteria andSordGreaterThan(Integer value) {
            addCriterion("TASM.SORD >", value, "sord");
            return (Criteria) this;
        }

        public Criteria andSordGreaterThanOrEqualTo(Integer value) {
            addCriterion("TASM.SORD >=", value, "sord");
            return (Criteria) this;
        }

        public Criteria andSordLessThan(Integer value) {
            addCriterion("TASM.SORD <", value, "sord");
            return (Criteria) this;
        }

        public Criteria andSordLessThanOrEqualTo(Integer value) {
            addCriterion("TASM.SORD <=", value, "sord");
            return (Criteria) this;
        }

        public Criteria andSordIn(List<Integer> values) {
            addCriterion("TASM.SORD in", values, "sord");
            return (Criteria) this;
        }

        public Criteria andSordNotIn(List<Integer> values) {
            addCriterion("TASM.SORD not in", values, "sord");
            return (Criteria) this;
        }

        public Criteria andSordBetween(Integer value1, Integer value2) {
            addCriterion("TASM.SORD between", value1, value2, "sord");
            return (Criteria) this;
        }

        public Criteria andSordNotBetween(Integer value1, Integer value2) {
            addCriterion("TASM.SORD not between", value1, value2, "sord");
            return (Criteria) this;
        }

        public Criteria andDpYnIsNull() {
            addCriterion("TASM.DP_YN is null");
            return (Criteria) this;
        }

        public Criteria andDpYnIsNotNull() {
            addCriterion("TASM.DP_YN is not null");
            return (Criteria) this;
        }

        public Criteria andDpYnEqualTo(String value) {
            addCriterion("TASM.DP_YN =", value, "dpYn");
            return (Criteria) this;
        }

        public Criteria andDpYnNotEqualTo(String value) {
            addCriterion("TASM.DP_YN <>", value, "dpYn");
            return (Criteria) this;
        }

        public Criteria andDpYnGreaterThan(String value) {
            addCriterion("TASM.DP_YN >", value, "dpYn");
            return (Criteria) this;
        }

        public Criteria andDpYnGreaterThanOrEqualTo(String value) {
            addCriterion("TASM.DP_YN >=", value, "dpYn");
            return (Criteria) this;
        }

        public Criteria andDpYnLessThan(String value) {
            addCriterion("TASM.DP_YN <", value, "dpYn");
            return (Criteria) this;
        }

        public Criteria andDpYnLessThanOrEqualTo(String value) {
            addCriterion("TASM.DP_YN <=", value, "dpYn");
            return (Criteria) this;
        }

        public Criteria andDpYnLike(String value) {
            addCriterion("TASM.DP_YN like", value, "dpYn");
            return (Criteria) this;
        }

        public Criteria andDpYnNotLike(String value) {
            addCriterion("TASM.DP_YN not like", value, "dpYn");
            return (Criteria) this;
        }

        public Criteria andDpYnIn(List<String> values) {
            addCriterion("TASM.DP_YN in", values, "dpYn");
            return (Criteria) this;
        }

        public Criteria andDpYnNotIn(List<String> values) {
            addCriterion("TASM.DP_YN not in", values, "dpYn");
            return (Criteria) this;
        }

        public Criteria andDpYnBetween(String value1, String value2) {
            addCriterion("TASM.DP_YN between", value1, value2, "dpYn");
            return (Criteria) this;
        }

        public Criteria andDpYnNotBetween(String value1, String value2) {
            addCriterion("TASM.DP_YN not between", value1, value2, "dpYn");
            return (Criteria) this;
        }

        public Criteria andRegDtIsNull() {
            addCriterion("TASM.REG_DT is null");
            return (Criteria) this;
        }

        public Criteria andRegDtIsNotNull() {
            addCriterion("TASM.REG_DT is not null");
            return (Criteria) this;
        }

        public Criteria andRegDtEqualTo(Date value) {
            addCriterion("TASM.REG_DT =", value, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtNotEqualTo(Date value) {
            addCriterion("TASM.REG_DT <>", value, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtGreaterThan(Date value) {
            addCriterion("TASM.REG_DT >", value, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtGreaterThanOrEqualTo(Date value) {
            addCriterion("TASM.REG_DT >=", value, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtLessThan(Date value) {
            addCriterion("TASM.REG_DT <", value, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtLessThanOrEqualTo(Date value) {
            addCriterion("TASM.REG_DT <=", value, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtIn(List<Date> values) {
            addCriterion("TASM.REG_DT in", values, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtNotIn(List<Date> values) {
            addCriterion("TASM.REG_DT not in", values, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtBetween(Date value1, Date value2) {
            addCriterion("TASM.REG_DT between", value1, value2, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtNotBetween(Date value1, Date value2) {
            addCriterion("TASM.REG_DT not between", value1, value2, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegIdIsNull() {
            addCriterion("TASM.REG_ID is null");
            return (Criteria) this;
        }

        public Criteria andRegIdIsNotNull() {
            addCriterion("TASM.REG_ID is not null");
            return (Criteria) this;
        }

        public Criteria andRegIdEqualTo(String value) {
            addCriterion("TASM.REG_ID =", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdNotEqualTo(String value) {
            addCriterion("TASM.REG_ID <>", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdGreaterThan(String value) {
            addCriterion("TASM.REG_ID >", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdGreaterThanOrEqualTo(String value) {
            addCriterion("TASM.REG_ID >=", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdLessThan(String value) {
            addCriterion("TASM.REG_ID <", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdLessThanOrEqualTo(String value) {
            addCriterion("TASM.REG_ID <=", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdLike(String value) {
            addCriterion("TASM.REG_ID like", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdNotLike(String value) {
            addCriterion("TASM.REG_ID not like", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdIn(List<String> values) {
            addCriterion("TASM.REG_ID in", values, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdNotIn(List<String> values) {
            addCriterion("TASM.REG_ID not in", values, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdBetween(String value1, String value2) {
            addCriterion("TASM.REG_ID between", value1, value2, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdNotBetween(String value1, String value2) {
            addCriterion("TASM.REG_ID not between", value1, value2, "regId");
            return (Criteria) this;
        }

        public Criteria andModDtIsNull() {
            addCriterion("TASM.MOD_DT is null");
            return (Criteria) this;
        }

        public Criteria andModDtIsNotNull() {
            addCriterion("TASM.MOD_DT is not null");
            return (Criteria) this;
        }

        public Criteria andModDtEqualTo(Date value) {
            addCriterion("TASM.MOD_DT =", value, "modDt");
            return (Criteria) this;
        }

        public Criteria andModDtNotEqualTo(Date value) {
            addCriterion("TASM.MOD_DT <>", value, "modDt");
            return (Criteria) this;
        }

        public Criteria andModDtGreaterThan(Date value) {
            addCriterion("TASM.MOD_DT >", value, "modDt");
            return (Criteria) this;
        }

        public Criteria andModDtGreaterThanOrEqualTo(Date value) {
            addCriterion("TASM.MOD_DT >=", value, "modDt");
            return (Criteria) this;
        }

        public Criteria andModDtLessThan(Date value) {
            addCriterion("TASM.MOD_DT <", value, "modDt");
            return (Criteria) this;
        }

        public Criteria andModDtLessThanOrEqualTo(Date value) {
            addCriterion("TASM.MOD_DT <=", value, "modDt");
            return (Criteria) this;
        }

        public Criteria andModDtIn(List<Date> values) {
            addCriterion("TASM.MOD_DT in", values, "modDt");
            return (Criteria) this;
        }

        public Criteria andModDtNotIn(List<Date> values) {
            addCriterion("TASM.MOD_DT not in", values, "modDt");
            return (Criteria) this;
        }

        public Criteria andModDtBetween(Date value1, Date value2) {
            addCriterion("TASM.MOD_DT between", value1, value2, "modDt");
            return (Criteria) this;
        }

        public Criteria andModDtNotBetween(Date value1, Date value2) {
            addCriterion("TASM.MOD_DT not between", value1, value2, "modDt");
            return (Criteria) this;
        }

        public Criteria andModIdIsNull() {
            addCriterion("TASM.MOD_ID is null");
            return (Criteria) this;
        }

        public Criteria andModIdIsNotNull() {
            addCriterion("TASM.MOD_ID is not null");
            return (Criteria) this;
        }

        public Criteria andModIdEqualTo(String value) {
            addCriterion("TASM.MOD_ID =", value, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdNotEqualTo(String value) {
            addCriterion("TASM.MOD_ID <>", value, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdGreaterThan(String value) {
            addCriterion("TASM.MOD_ID >", value, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdGreaterThanOrEqualTo(String value) {
            addCriterion("TASM.MOD_ID >=", value, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdLessThan(String value) {
            addCriterion("TASM.MOD_ID <", value, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdLessThanOrEqualTo(String value) {
            addCriterion("TASM.MOD_ID <=", value, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdLike(String value) {
            addCriterion("TASM.MOD_ID like", value, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdNotLike(String value) {
            addCriterion("TASM.MOD_ID not like", value, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdIn(List<String> values) {
            addCriterion("TASM.MOD_ID in", values, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdNotIn(List<String> values) {
            addCriterion("TASM.MOD_ID not in", values, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdBetween(String value1, String value2) {
            addCriterion("TASM.MOD_ID between", value1, value2, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdNotBetween(String value1, String value2) {
            addCriterion("TASM.MOD_ID not between", value1, value2, "modId");
            return (Criteria) this;
        }

        public Criteria andUseYnIsNull() {
            addCriterion("TASM.USE_YN is null");
            return (Criteria) this;
        }

        public Criteria andUseYnIsNotNull() {
            addCriterion("TASM.USE_YN is not null");
            return (Criteria) this;
        }

        public Criteria andUseYnEqualTo(String value) {
            addCriterion("TASM.USE_YN =", value, "useYn");
            return (Criteria) this;
        }

        public Criteria andUseYnNotEqualTo(String value) {
            addCriterion("TASM.USE_YN <>", value, "useYn");
            return (Criteria) this;
        }

        public Criteria andUseYnGreaterThan(String value) {
            addCriterion("TASM.USE_YN >", value, "useYn");
            return (Criteria) this;
        }

        public Criteria andUseYnGreaterThanOrEqualTo(String value) {
            addCriterion("TASM.USE_YN >=", value, "useYn");
            return (Criteria) this;
        }

        public Criteria andUseYnLessThan(String value) {
            addCriterion("TASM.USE_YN <", value, "useYn");
            return (Criteria) this;
        }

        public Criteria andUseYnLessThanOrEqualTo(String value) {
            addCriterion("TASM.USE_YN <=", value, "useYn");
            return (Criteria) this;
        }

        public Criteria andUseYnLike(String value) {
            addCriterion("TASM.USE_YN like", value, "useYn");
            return (Criteria) this;
        }

        public Criteria andUseYnNotLike(String value) {
            addCriterion("TASM.USE_YN not like", value, "useYn");
            return (Criteria) this;
        }

        public Criteria andUseYnIn(List<String> values) {
            addCriterion("TASM.USE_YN in", values, "useYn");
            return (Criteria) this;
        }

        public Criteria andUseYnNotIn(List<String> values) {
            addCriterion("TASM.USE_YN not in", values, "useYn");
            return (Criteria) this;
        }

        public Criteria andUseYnBetween(String value1, String value2) {
            addCriterion("TASM.USE_YN between", value1, value2, "useYn");
            return (Criteria) this;
        }

        public Criteria andUseYnNotBetween(String value1, String value2) {
            addCriterion("TASM.USE_YN not between", value1, value2, "useYn");
            return (Criteria) this;
        }

        public Criteria andMenuNmLikeInsensitive(String value) {
            addCriterion("upper(TASM.MENU_NM) like", value.toUpperCase(), "menuNm");
            return (Criteria) this;
        }

        public Criteria andUrlAddrLikeInsensitive(String value) {
            addCriterion("upper(TASM.URL_ADDR) like", value.toUpperCase(), "urlAddr");
            return (Criteria) this;
        }

        public Criteria andDpYnLikeInsensitive(String value) {
            addCriterion("upper(TASM.DP_YN) like", value.toUpperCase(), "dpYn");
            return (Criteria) this;
        }

        public Criteria andRegIdLikeInsensitive(String value) {
            addCriterion("upper(TASM.REG_ID) like", value.toUpperCase(), "regId");
            return (Criteria) this;
        }

        public Criteria andModIdLikeInsensitive(String value) {
            addCriterion("upper(TASM.MOD_ID) like", value.toUpperCase(), "modId");
            return (Criteria) this;
        }

        public Criteria andUseYnLikeInsensitive(String value) {
            addCriterion("upper(TASM.USE_YN) like", value.toUpperCase(), "useYn");
            return (Criteria) this;
        }

        public Criteria andMenuNmLikeLeft(String value) {
            addCriterion("TASM.MENU_NM like ", "%" + value, "menuNm");
            return (Criteria) this;
        }

        public Criteria andMenuNmLikeRight(String value) {
            addCriterion("TASM.MENU_NM like ", value + "%", "menuNm");
            return (Criteria) this;
        }

        public Criteria andMenuNmLikeBoth(String value) {
            addCriterion("TASM.MENU_NM like ", "%" + value + "%", "menuNm");
            return (Criteria) this;
        }

        public Criteria andUrlAddrLikeLeft(String value) {
            addCriterion("TASM.URL_ADDR like ", "%" + value, "urlAddr");
            return (Criteria) this;
        }

        public Criteria andUrlAddrLikeRight(String value) {
            addCriterion("TASM.URL_ADDR like ", value + "%", "urlAddr");
            return (Criteria) this;
        }

        public Criteria andUrlAddrLikeBoth(String value) {
            addCriterion("TASM.URL_ADDR like ", "%" + value + "%", "urlAddr");
            return (Criteria) this;
        }

        public Criteria andDpYnLikeLeft(String value) {
            addCriterion("TASM.DP_YN like ", "%" + value, "dpYn");
            return (Criteria) this;
        }

        public Criteria andDpYnLikeRight(String value) {
            addCriterion("TASM.DP_YN like ", value + "%", "dpYn");
            return (Criteria) this;
        }

        public Criteria andDpYnLikeBoth(String value) {
            addCriterion("TASM.DP_YN like ", "%" + value + "%", "dpYn");
            return (Criteria) this;
        }

        public Criteria andRegIdLikeLeft(String value) {
            addCriterion("TASM.REG_ID like ", "%" + value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdLikeRight(String value) {
            addCriterion("TASM.REG_ID like ", value + "%", "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdLikeBoth(String value) {
            addCriterion("TASM.REG_ID like ", "%" + value + "%", "regId");
            return (Criteria) this;
        }

        public Criteria andModIdLikeLeft(String value) {
            addCriterion("TASM.MOD_ID like ", "%" + value, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdLikeRight(String value) {
            addCriterion("TASM.MOD_ID like ", value + "%", "modId");
            return (Criteria) this;
        }

        public Criteria andModIdLikeBoth(String value) {
            addCriterion("TASM.MOD_ID like ", "%" + value + "%", "modId");
            return (Criteria) this;
        }

        public Criteria andUseYnLikeLeft(String value) {
            addCriterion("TASM.USE_YN like ", "%" + value, "useYn");
            return (Criteria) this;
        }

        public Criteria andUseYnLikeRight(String value) {
            addCriterion("TASM.USE_YN like ", value + "%", "useYn");
            return (Criteria) this;
        }

        public Criteria andUseYnLikeBoth(String value) {
            addCriterion("TASM.USE_YN like ", "%" + value + "%", "useYn");
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