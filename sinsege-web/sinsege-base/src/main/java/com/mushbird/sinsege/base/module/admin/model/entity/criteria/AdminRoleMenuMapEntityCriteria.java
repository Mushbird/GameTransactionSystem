package com.mushbird.sinsege.base.module.admin.model.entity.criteria;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AdminRoleMenuMapEntityCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    public AdminRoleMenuMapEntityCriteria() {
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

        public Criteria andAdmRoleIdIsNull() {
            addCriterion("TARMM.ADM_ROLE_ID is null");
            return (Criteria) this;
        }

        public Criteria andAdmRoleIdIsNotNull() {
            addCriterion("TARMM.ADM_ROLE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andAdmRoleIdEqualTo(Integer value) {
            addCriterion("TARMM.ADM_ROLE_ID =", value, "admRoleId");
            return (Criteria) this;
        }

        public Criteria andAdmRoleIdNotEqualTo(Integer value) {
            addCriterion("TARMM.ADM_ROLE_ID <>", value, "admRoleId");
            return (Criteria) this;
        }

        public Criteria andAdmRoleIdGreaterThan(Integer value) {
            addCriterion("TARMM.ADM_ROLE_ID >", value, "admRoleId");
            return (Criteria) this;
        }

        public Criteria andAdmRoleIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("TARMM.ADM_ROLE_ID >=", value, "admRoleId");
            return (Criteria) this;
        }

        public Criteria andAdmRoleIdLessThan(Integer value) {
            addCriterion("TARMM.ADM_ROLE_ID <", value, "admRoleId");
            return (Criteria) this;
        }

        public Criteria andAdmRoleIdLessThanOrEqualTo(Integer value) {
            addCriterion("TARMM.ADM_ROLE_ID <=", value, "admRoleId");
            return (Criteria) this;
        }

        public Criteria andAdmRoleIdIn(List<Integer> values) {
            addCriterion("TARMM.ADM_ROLE_ID in", values, "admRoleId");
            return (Criteria) this;
        }

        public Criteria andAdmRoleIdNotIn(List<Integer> values) {
            addCriterion("TARMM.ADM_ROLE_ID not in", values, "admRoleId");
            return (Criteria) this;
        }

        public Criteria andAdmRoleIdBetween(Integer value1, Integer value2) {
            addCriterion("TARMM.ADM_ROLE_ID between", value1, value2, "admRoleId");
            return (Criteria) this;
        }

        public Criteria andAdmRoleIdNotBetween(Integer value1, Integer value2) {
            addCriterion("TARMM.ADM_ROLE_ID not between", value1, value2, "admRoleId");
            return (Criteria) this;
        }

        public Criteria andAdmSiteMenuIdIsNull() {
            addCriterion("TARMM.ADM_SITE_MENU_ID is null");
            return (Criteria) this;
        }

        public Criteria andAdmSiteMenuIdIsNotNull() {
            addCriterion("TARMM.ADM_SITE_MENU_ID is not null");
            return (Criteria) this;
        }

        public Criteria andAdmSiteMenuIdEqualTo(Integer value) {
            addCriterion("TARMM.ADM_SITE_MENU_ID =", value, "admSiteMenuId");
            return (Criteria) this;
        }

        public Criteria andAdmSiteMenuIdNotEqualTo(Integer value) {
            addCriterion("TARMM.ADM_SITE_MENU_ID <>", value, "admSiteMenuId");
            return (Criteria) this;
        }

        public Criteria andAdmSiteMenuIdGreaterThan(Integer value) {
            addCriterion("TARMM.ADM_SITE_MENU_ID >", value, "admSiteMenuId");
            return (Criteria) this;
        }

        public Criteria andAdmSiteMenuIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("TARMM.ADM_SITE_MENU_ID >=", value, "admSiteMenuId");
            return (Criteria) this;
        }

        public Criteria andAdmSiteMenuIdLessThan(Integer value) {
            addCriterion("TARMM.ADM_SITE_MENU_ID <", value, "admSiteMenuId");
            return (Criteria) this;
        }

        public Criteria andAdmSiteMenuIdLessThanOrEqualTo(Integer value) {
            addCriterion("TARMM.ADM_SITE_MENU_ID <=", value, "admSiteMenuId");
            return (Criteria) this;
        }

        public Criteria andAdmSiteMenuIdIn(List<Integer> values) {
            addCriterion("TARMM.ADM_SITE_MENU_ID in", values, "admSiteMenuId");
            return (Criteria) this;
        }

        public Criteria andAdmSiteMenuIdNotIn(List<Integer> values) {
            addCriterion("TARMM.ADM_SITE_MENU_ID not in", values, "admSiteMenuId");
            return (Criteria) this;
        }

        public Criteria andAdmSiteMenuIdBetween(Integer value1, Integer value2) {
            addCriterion("TARMM.ADM_SITE_MENU_ID between", value1, value2, "admSiteMenuId");
            return (Criteria) this;
        }

        public Criteria andAdmSiteMenuIdNotBetween(Integer value1, Integer value2) {
            addCriterion("TARMM.ADM_SITE_MENU_ID not between", value1, value2, "admSiteMenuId");
            return (Criteria) this;
        }

        public Criteria andAthrRegIsNull() {
            addCriterion("TARMM.ATHR_REG is null");
            return (Criteria) this;
        }

        public Criteria andAthrRegIsNotNull() {
            addCriterion("TARMM.ATHR_REG is not null");
            return (Criteria) this;
        }

        public Criteria andAthrRegEqualTo(String value) {
            addCriterion("TARMM.ATHR_REG =", value, "athrReg");
            return (Criteria) this;
        }

        public Criteria andAthrRegNotEqualTo(String value) {
            addCriterion("TARMM.ATHR_REG <>", value, "athrReg");
            return (Criteria) this;
        }

        public Criteria andAthrRegGreaterThan(String value) {
            addCriterion("TARMM.ATHR_REG >", value, "athrReg");
            return (Criteria) this;
        }

        public Criteria andAthrRegGreaterThanOrEqualTo(String value) {
            addCriterion("TARMM.ATHR_REG >=", value, "athrReg");
            return (Criteria) this;
        }

        public Criteria andAthrRegLessThan(String value) {
            addCriterion("TARMM.ATHR_REG <", value, "athrReg");
            return (Criteria) this;
        }

        public Criteria andAthrRegLessThanOrEqualTo(String value) {
            addCriterion("TARMM.ATHR_REG <=", value, "athrReg");
            return (Criteria) this;
        }

        public Criteria andAthrRegLike(String value) {
            addCriterion("TARMM.ATHR_REG like", value, "athrReg");
            return (Criteria) this;
        }

        public Criteria andAthrRegNotLike(String value) {
            addCriterion("TARMM.ATHR_REG not like", value, "athrReg");
            return (Criteria) this;
        }

        public Criteria andAthrRegIn(List<String> values) {
            addCriterion("TARMM.ATHR_REG in", values, "athrReg");
            return (Criteria) this;
        }

        public Criteria andAthrRegNotIn(List<String> values) {
            addCriterion("TARMM.ATHR_REG not in", values, "athrReg");
            return (Criteria) this;
        }

        public Criteria andAthrRegBetween(String value1, String value2) {
            addCriterion("TARMM.ATHR_REG between", value1, value2, "athrReg");
            return (Criteria) this;
        }

        public Criteria andAthrRegNotBetween(String value1, String value2) {
            addCriterion("TARMM.ATHR_REG not between", value1, value2, "athrReg");
            return (Criteria) this;
        }

        public Criteria andAthrReadIsNull() {
            addCriterion("TARMM.ATHR_READ is null");
            return (Criteria) this;
        }

        public Criteria andAthrReadIsNotNull() {
            addCriterion("TARMM.ATHR_READ is not null");
            return (Criteria) this;
        }

        public Criteria andAthrReadEqualTo(String value) {
            addCriterion("TARMM.ATHR_READ =", value, "athrRead");
            return (Criteria) this;
        }

        public Criteria andAthrReadNotEqualTo(String value) {
            addCriterion("TARMM.ATHR_READ <>", value, "athrRead");
            return (Criteria) this;
        }

        public Criteria andAthrReadGreaterThan(String value) {
            addCriterion("TARMM.ATHR_READ >", value, "athrRead");
            return (Criteria) this;
        }

        public Criteria andAthrReadGreaterThanOrEqualTo(String value) {
            addCriterion("TARMM.ATHR_READ >=", value, "athrRead");
            return (Criteria) this;
        }

        public Criteria andAthrReadLessThan(String value) {
            addCriterion("TARMM.ATHR_READ <", value, "athrRead");
            return (Criteria) this;
        }

        public Criteria andAthrReadLessThanOrEqualTo(String value) {
            addCriterion("TARMM.ATHR_READ <=", value, "athrRead");
            return (Criteria) this;
        }

        public Criteria andAthrReadLike(String value) {
            addCriterion("TARMM.ATHR_READ like", value, "athrRead");
            return (Criteria) this;
        }

        public Criteria andAthrReadNotLike(String value) {
            addCriterion("TARMM.ATHR_READ not like", value, "athrRead");
            return (Criteria) this;
        }

        public Criteria andAthrReadIn(List<String> values) {
            addCriterion("TARMM.ATHR_READ in", values, "athrRead");
            return (Criteria) this;
        }

        public Criteria andAthrReadNotIn(List<String> values) {
            addCriterion("TARMM.ATHR_READ not in", values, "athrRead");
            return (Criteria) this;
        }

        public Criteria andAthrReadBetween(String value1, String value2) {
            addCriterion("TARMM.ATHR_READ between", value1, value2, "athrRead");
            return (Criteria) this;
        }

        public Criteria andAthrReadNotBetween(String value1, String value2) {
            addCriterion("TARMM.ATHR_READ not between", value1, value2, "athrRead");
            return (Criteria) this;
        }

        public Criteria andAthrModIsNull() {
            addCriterion("TARMM.ATHR_MOD is null");
            return (Criteria) this;
        }

        public Criteria andAthrModIsNotNull() {
            addCriterion("TARMM.ATHR_MOD is not null");
            return (Criteria) this;
        }

        public Criteria andAthrModEqualTo(String value) {
            addCriterion("TARMM.ATHR_MOD =", value, "athrMod");
            return (Criteria) this;
        }

        public Criteria andAthrModNotEqualTo(String value) {
            addCriterion("TARMM.ATHR_MOD <>", value, "athrMod");
            return (Criteria) this;
        }

        public Criteria andAthrModGreaterThan(String value) {
            addCriterion("TARMM.ATHR_MOD >", value, "athrMod");
            return (Criteria) this;
        }

        public Criteria andAthrModGreaterThanOrEqualTo(String value) {
            addCriterion("TARMM.ATHR_MOD >=", value, "athrMod");
            return (Criteria) this;
        }

        public Criteria andAthrModLessThan(String value) {
            addCriterion("TARMM.ATHR_MOD <", value, "athrMod");
            return (Criteria) this;
        }

        public Criteria andAthrModLessThanOrEqualTo(String value) {
            addCriterion("TARMM.ATHR_MOD <=", value, "athrMod");
            return (Criteria) this;
        }

        public Criteria andAthrModLike(String value) {
            addCriterion("TARMM.ATHR_MOD like", value, "athrMod");
            return (Criteria) this;
        }

        public Criteria andAthrModNotLike(String value) {
            addCriterion("TARMM.ATHR_MOD not like", value, "athrMod");
            return (Criteria) this;
        }

        public Criteria andAthrModIn(List<String> values) {
            addCriterion("TARMM.ATHR_MOD in", values, "athrMod");
            return (Criteria) this;
        }

        public Criteria andAthrModNotIn(List<String> values) {
            addCriterion("TARMM.ATHR_MOD not in", values, "athrMod");
            return (Criteria) this;
        }

        public Criteria andAthrModBetween(String value1, String value2) {
            addCriterion("TARMM.ATHR_MOD between", value1, value2, "athrMod");
            return (Criteria) this;
        }

        public Criteria andAthrModNotBetween(String value1, String value2) {
            addCriterion("TARMM.ATHR_MOD not between", value1, value2, "athrMod");
            return (Criteria) this;
        }

        public Criteria andAthrDelIsNull() {
            addCriterion("TARMM.ATHR_DEL is null");
            return (Criteria) this;
        }

        public Criteria andAthrDelIsNotNull() {
            addCriterion("TARMM.ATHR_DEL is not null");
            return (Criteria) this;
        }

        public Criteria andAthrDelEqualTo(String value) {
            addCriterion("TARMM.ATHR_DEL =", value, "athrDel");
            return (Criteria) this;
        }

        public Criteria andAthrDelNotEqualTo(String value) {
            addCriterion("TARMM.ATHR_DEL <>", value, "athrDel");
            return (Criteria) this;
        }

        public Criteria andAthrDelGreaterThan(String value) {
            addCriterion("TARMM.ATHR_DEL >", value, "athrDel");
            return (Criteria) this;
        }

        public Criteria andAthrDelGreaterThanOrEqualTo(String value) {
            addCriterion("TARMM.ATHR_DEL >=", value, "athrDel");
            return (Criteria) this;
        }

        public Criteria andAthrDelLessThan(String value) {
            addCriterion("TARMM.ATHR_DEL <", value, "athrDel");
            return (Criteria) this;
        }

        public Criteria andAthrDelLessThanOrEqualTo(String value) {
            addCriterion("TARMM.ATHR_DEL <=", value, "athrDel");
            return (Criteria) this;
        }

        public Criteria andAthrDelLike(String value) {
            addCriterion("TARMM.ATHR_DEL like", value, "athrDel");
            return (Criteria) this;
        }

        public Criteria andAthrDelNotLike(String value) {
            addCriterion("TARMM.ATHR_DEL not like", value, "athrDel");
            return (Criteria) this;
        }

        public Criteria andAthrDelIn(List<String> values) {
            addCriterion("TARMM.ATHR_DEL in", values, "athrDel");
            return (Criteria) this;
        }

        public Criteria andAthrDelNotIn(List<String> values) {
            addCriterion("TARMM.ATHR_DEL not in", values, "athrDel");
            return (Criteria) this;
        }

        public Criteria andAthrDelBetween(String value1, String value2) {
            addCriterion("TARMM.ATHR_DEL between", value1, value2, "athrDel");
            return (Criteria) this;
        }

        public Criteria andAthrDelNotBetween(String value1, String value2) {
            addCriterion("TARMM.ATHR_DEL not between", value1, value2, "athrDel");
            return (Criteria) this;
        }

        public Criteria andAthrExcelIsNull() {
            addCriterion("TARMM.ATHR_EXCEL is null");
            return (Criteria) this;
        }

        public Criteria andAthrExcelIsNotNull() {
            addCriterion("TARMM.ATHR_EXCEL is not null");
            return (Criteria) this;
        }

        public Criteria andAthrExcelEqualTo(String value) {
            addCriterion("TARMM.ATHR_EXCEL =", value, "athrExcel");
            return (Criteria) this;
        }

        public Criteria andAthrExcelNotEqualTo(String value) {
            addCriterion("TARMM.ATHR_EXCEL <>", value, "athrExcel");
            return (Criteria) this;
        }

        public Criteria andAthrExcelGreaterThan(String value) {
            addCriterion("TARMM.ATHR_EXCEL >", value, "athrExcel");
            return (Criteria) this;
        }

        public Criteria andAthrExcelGreaterThanOrEqualTo(String value) {
            addCriterion("TARMM.ATHR_EXCEL >=", value, "athrExcel");
            return (Criteria) this;
        }

        public Criteria andAthrExcelLessThan(String value) {
            addCriterion("TARMM.ATHR_EXCEL <", value, "athrExcel");
            return (Criteria) this;
        }

        public Criteria andAthrExcelLessThanOrEqualTo(String value) {
            addCriterion("TARMM.ATHR_EXCEL <=", value, "athrExcel");
            return (Criteria) this;
        }

        public Criteria andAthrExcelLike(String value) {
            addCriterion("TARMM.ATHR_EXCEL like", value, "athrExcel");
            return (Criteria) this;
        }

        public Criteria andAthrExcelNotLike(String value) {
            addCriterion("TARMM.ATHR_EXCEL not like", value, "athrExcel");
            return (Criteria) this;
        }

        public Criteria andAthrExcelIn(List<String> values) {
            addCriterion("TARMM.ATHR_EXCEL in", values, "athrExcel");
            return (Criteria) this;
        }

        public Criteria andAthrExcelNotIn(List<String> values) {
            addCriterion("TARMM.ATHR_EXCEL not in", values, "athrExcel");
            return (Criteria) this;
        }

        public Criteria andAthrExcelBetween(String value1, String value2) {
            addCriterion("TARMM.ATHR_EXCEL between", value1, value2, "athrExcel");
            return (Criteria) this;
        }

        public Criteria andAthrExcelNotBetween(String value1, String value2) {
            addCriterion("TARMM.ATHR_EXCEL not between", value1, value2, "athrExcel");
            return (Criteria) this;
        }

        public Criteria andRegDtIsNull() {
            addCriterion("TARMM.REG_DT is null");
            return (Criteria) this;
        }

        public Criteria andRegDtIsNotNull() {
            addCriterion("TARMM.REG_DT is not null");
            return (Criteria) this;
        }

        public Criteria andRegDtEqualTo(Date value) {
            addCriterion("TARMM.REG_DT =", value, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtNotEqualTo(Date value) {
            addCriterion("TARMM.REG_DT <>", value, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtGreaterThan(Date value) {
            addCriterion("TARMM.REG_DT >", value, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtGreaterThanOrEqualTo(Date value) {
            addCriterion("TARMM.REG_DT >=", value, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtLessThan(Date value) {
            addCriterion("TARMM.REG_DT <", value, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtLessThanOrEqualTo(Date value) {
            addCriterion("TARMM.REG_DT <=", value, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtIn(List<Date> values) {
            addCriterion("TARMM.REG_DT in", values, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtNotIn(List<Date> values) {
            addCriterion("TARMM.REG_DT not in", values, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtBetween(Date value1, Date value2) {
            addCriterion("TARMM.REG_DT between", value1, value2, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtNotBetween(Date value1, Date value2) {
            addCriterion("TARMM.REG_DT not between", value1, value2, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegIdIsNull() {
            addCriterion("TARMM.REG_ID is null");
            return (Criteria) this;
        }

        public Criteria andRegIdIsNotNull() {
            addCriterion("TARMM.REG_ID is not null");
            return (Criteria) this;
        }

        public Criteria andRegIdEqualTo(String value) {
            addCriterion("TARMM.REG_ID =", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdNotEqualTo(String value) {
            addCriterion("TARMM.REG_ID <>", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdGreaterThan(String value) {
            addCriterion("TARMM.REG_ID >", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdGreaterThanOrEqualTo(String value) {
            addCriterion("TARMM.REG_ID >=", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdLessThan(String value) {
            addCriterion("TARMM.REG_ID <", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdLessThanOrEqualTo(String value) {
            addCriterion("TARMM.REG_ID <=", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdLike(String value) {
            addCriterion("TARMM.REG_ID like", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdNotLike(String value) {
            addCriterion("TARMM.REG_ID not like", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdIn(List<String> values) {
            addCriterion("TARMM.REG_ID in", values, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdNotIn(List<String> values) {
            addCriterion("TARMM.REG_ID not in", values, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdBetween(String value1, String value2) {
            addCriterion("TARMM.REG_ID between", value1, value2, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdNotBetween(String value1, String value2) {
            addCriterion("TARMM.REG_ID not between", value1, value2, "regId");
            return (Criteria) this;
        }

        public Criteria andAthrRegLikeInsensitive(String value) {
            addCriterion("upper(TARMM.ATHR_REG) like", value.toUpperCase(), "athrReg");
            return (Criteria) this;
        }

        public Criteria andAthrReadLikeInsensitive(String value) {
            addCriterion("upper(TARMM.ATHR_READ) like", value.toUpperCase(), "athrRead");
            return (Criteria) this;
        }

        public Criteria andAthrModLikeInsensitive(String value) {
            addCriterion("upper(TARMM.ATHR_MOD) like", value.toUpperCase(), "athrMod");
            return (Criteria) this;
        }

        public Criteria andAthrDelLikeInsensitive(String value) {
            addCriterion("upper(TARMM.ATHR_DEL) like", value.toUpperCase(), "athrDel");
            return (Criteria) this;
        }

        public Criteria andAthrExcelLikeInsensitive(String value) {
            addCriterion("upper(TARMM.ATHR_EXCEL) like", value.toUpperCase(), "athrExcel");
            return (Criteria) this;
        }

        public Criteria andRegIdLikeInsensitive(String value) {
            addCriterion("upper(TARMM.REG_ID) like", value.toUpperCase(), "regId");
            return (Criteria) this;
        }

        public Criteria andAthrRegLikeLeft(String value) {
            addCriterion("TARMM.ATHR_REG like ", "%" + value, "athrReg");
            return (Criteria) this;
        }

        public Criteria andAthrRegLikeRight(String value) {
            addCriterion("TARMM.ATHR_REG like ", value + "%", "athrReg");
            return (Criteria) this;
        }

        public Criteria andAthrRegLikeBoth(String value) {
            addCriterion("TARMM.ATHR_REG like ", "%" + value + "%", "athrReg");
            return (Criteria) this;
        }

        public Criteria andAthrReadLikeLeft(String value) {
            addCriterion("TARMM.ATHR_READ like ", "%" + value, "athrRead");
            return (Criteria) this;
        }

        public Criteria andAthrReadLikeRight(String value) {
            addCriterion("TARMM.ATHR_READ like ", value + "%", "athrRead");
            return (Criteria) this;
        }

        public Criteria andAthrReadLikeBoth(String value) {
            addCriterion("TARMM.ATHR_READ like ", "%" + value + "%", "athrRead");
            return (Criteria) this;
        }

        public Criteria andAthrModLikeLeft(String value) {
            addCriterion("TARMM.ATHR_MOD like ", "%" + value, "athrMod");
            return (Criteria) this;
        }

        public Criteria andAthrModLikeRight(String value) {
            addCriterion("TARMM.ATHR_MOD like ", value + "%", "athrMod");
            return (Criteria) this;
        }

        public Criteria andAthrModLikeBoth(String value) {
            addCriterion("TARMM.ATHR_MOD like ", "%" + value + "%", "athrMod");
            return (Criteria) this;
        }

        public Criteria andAthrDelLikeLeft(String value) {
            addCriterion("TARMM.ATHR_DEL like ", "%" + value, "athrDel");
            return (Criteria) this;
        }

        public Criteria andAthrDelLikeRight(String value) {
            addCriterion("TARMM.ATHR_DEL like ", value + "%", "athrDel");
            return (Criteria) this;
        }

        public Criteria andAthrDelLikeBoth(String value) {
            addCriterion("TARMM.ATHR_DEL like ", "%" + value + "%", "athrDel");
            return (Criteria) this;
        }

        public Criteria andAthrExcelLikeLeft(String value) {
            addCriterion("TARMM.ATHR_EXCEL like ", "%" + value, "athrExcel");
            return (Criteria) this;
        }

        public Criteria andAthrExcelLikeRight(String value) {
            addCriterion("TARMM.ATHR_EXCEL like ", value + "%", "athrExcel");
            return (Criteria) this;
        }

        public Criteria andAthrExcelLikeBoth(String value) {
            addCriterion("TARMM.ATHR_EXCEL like ", "%" + value + "%", "athrExcel");
            return (Criteria) this;
        }

        public Criteria andRegIdLikeLeft(String value) {
            addCriterion("TARMM.REG_ID like ", "%" + value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdLikeRight(String value) {
            addCriterion("TARMM.REG_ID like ", value + "%", "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdLikeBoth(String value) {
            addCriterion("TARMM.REG_ID like ", "%" + value + "%", "regId");
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