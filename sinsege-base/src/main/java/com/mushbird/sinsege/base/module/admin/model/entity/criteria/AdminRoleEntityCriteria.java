package com.mushbird.sinsege.base.module.admin.model.entity.criteria;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AdminRoleEntityCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    public AdminRoleEntityCriteria() {
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
            addCriterion("TAR.ADM_ROLE_ID is null");
            return (Criteria) this;
        }

        public Criteria andAdmRoleIdIsNotNull() {
            addCriterion("TAR.ADM_ROLE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andAdmRoleIdEqualTo(Integer value) {
            addCriterion("TAR.ADM_ROLE_ID =", value, "admRoleId");
            return (Criteria) this;
        }

        public Criteria andAdmRoleIdNotEqualTo(Integer value) {
            addCriterion("TAR.ADM_ROLE_ID <>", value, "admRoleId");
            return (Criteria) this;
        }

        public Criteria andAdmRoleIdGreaterThan(Integer value) {
            addCriterion("TAR.ADM_ROLE_ID >", value, "admRoleId");
            return (Criteria) this;
        }

        public Criteria andAdmRoleIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("TAR.ADM_ROLE_ID >=", value, "admRoleId");
            return (Criteria) this;
        }

        public Criteria andAdmRoleIdLessThan(Integer value) {
            addCriterion("TAR.ADM_ROLE_ID <", value, "admRoleId");
            return (Criteria) this;
        }

        public Criteria andAdmRoleIdLessThanOrEqualTo(Integer value) {
            addCriterion("TAR.ADM_ROLE_ID <=", value, "admRoleId");
            return (Criteria) this;
        }

        public Criteria andAdmRoleIdIn(List<Integer> values) {
            addCriterion("TAR.ADM_ROLE_ID in", values, "admRoleId");
            return (Criteria) this;
        }

        public Criteria andAdmRoleIdNotIn(List<Integer> values) {
            addCriterion("TAR.ADM_ROLE_ID not in", values, "admRoleId");
            return (Criteria) this;
        }

        public Criteria andAdmRoleIdBetween(Integer value1, Integer value2) {
            addCriterion("TAR.ADM_ROLE_ID between", value1, value2, "admRoleId");
            return (Criteria) this;
        }

        public Criteria andAdmRoleIdNotBetween(Integer value1, Integer value2) {
            addCriterion("TAR.ADM_ROLE_ID not between", value1, value2, "admRoleId");
            return (Criteria) this;
        }

        public Criteria andAdmRoleCdIsNull() {
            addCriterion("TAR.ADM_ROLE_CD is null");
            return (Criteria) this;
        }

        public Criteria andAdmRoleCdIsNotNull() {
            addCriterion("TAR.ADM_ROLE_CD is not null");
            return (Criteria) this;
        }

        public Criteria andAdmRoleCdEqualTo(String value) {
            addCriterion("TAR.ADM_ROLE_CD =", value, "admRoleCd");
            return (Criteria) this;
        }

        public Criteria andAdmRoleCdNotEqualTo(String value) {
            addCriterion("TAR.ADM_ROLE_CD <>", value, "admRoleCd");
            return (Criteria) this;
        }

        public Criteria andAdmRoleCdGreaterThan(String value) {
            addCriterion("TAR.ADM_ROLE_CD >", value, "admRoleCd");
            return (Criteria) this;
        }

        public Criteria andAdmRoleCdGreaterThanOrEqualTo(String value) {
            addCriterion("TAR.ADM_ROLE_CD >=", value, "admRoleCd");
            return (Criteria) this;
        }

        public Criteria andAdmRoleCdLessThan(String value) {
            addCriterion("TAR.ADM_ROLE_CD <", value, "admRoleCd");
            return (Criteria) this;
        }

        public Criteria andAdmRoleCdLessThanOrEqualTo(String value) {
            addCriterion("TAR.ADM_ROLE_CD <=", value, "admRoleCd");
            return (Criteria) this;
        }

        public Criteria andAdmRoleCdLike(String value) {
            addCriterion("TAR.ADM_ROLE_CD like", value, "admRoleCd");
            return (Criteria) this;
        }

        public Criteria andAdmRoleCdNotLike(String value) {
            addCriterion("TAR.ADM_ROLE_CD not like", value, "admRoleCd");
            return (Criteria) this;
        }

        public Criteria andAdmRoleCdIn(List<String> values) {
            addCriterion("TAR.ADM_ROLE_CD in", values, "admRoleCd");
            return (Criteria) this;
        }

        public Criteria andAdmRoleCdNotIn(List<String> values) {
            addCriterion("TAR.ADM_ROLE_CD not in", values, "admRoleCd");
            return (Criteria) this;
        }

        public Criteria andAdmRoleCdBetween(String value1, String value2) {
            addCriterion("TAR.ADM_ROLE_CD between", value1, value2, "admRoleCd");
            return (Criteria) this;
        }

        public Criteria andAdmRoleCdNotBetween(String value1, String value2) {
            addCriterion("TAR.ADM_ROLE_CD not between", value1, value2, "admRoleCd");
            return (Criteria) this;
        }

        public Criteria andAdmRoleNmIsNull() {
            addCriterion("TAR.ADM_ROLE_NM is null");
            return (Criteria) this;
        }

        public Criteria andAdmRoleNmIsNotNull() {
            addCriterion("TAR.ADM_ROLE_NM is not null");
            return (Criteria) this;
        }

        public Criteria andAdmRoleNmEqualTo(String value) {
            addCriterion("TAR.ADM_ROLE_NM =", value, "admRoleNm");
            return (Criteria) this;
        }

        public Criteria andAdmRoleNmNotEqualTo(String value) {
            addCriterion("TAR.ADM_ROLE_NM <>", value, "admRoleNm");
            return (Criteria) this;
        }

        public Criteria andAdmRoleNmGreaterThan(String value) {
            addCriterion("TAR.ADM_ROLE_NM >", value, "admRoleNm");
            return (Criteria) this;
        }

        public Criteria andAdmRoleNmGreaterThanOrEqualTo(String value) {
            addCriterion("TAR.ADM_ROLE_NM >=", value, "admRoleNm");
            return (Criteria) this;
        }

        public Criteria andAdmRoleNmLessThan(String value) {
            addCriterion("TAR.ADM_ROLE_NM <", value, "admRoleNm");
            return (Criteria) this;
        }

        public Criteria andAdmRoleNmLessThanOrEqualTo(String value) {
            addCriterion("TAR.ADM_ROLE_NM <=", value, "admRoleNm");
            return (Criteria) this;
        }

        public Criteria andAdmRoleNmLike(String value) {
            addCriterion("TAR.ADM_ROLE_NM like", value, "admRoleNm");
            return (Criteria) this;
        }

        public Criteria andAdmRoleNmNotLike(String value) {
            addCriterion("TAR.ADM_ROLE_NM not like", value, "admRoleNm");
            return (Criteria) this;
        }

        public Criteria andAdmRoleNmIn(List<String> values) {
            addCriterion("TAR.ADM_ROLE_NM in", values, "admRoleNm");
            return (Criteria) this;
        }

        public Criteria andAdmRoleNmNotIn(List<String> values) {
            addCriterion("TAR.ADM_ROLE_NM not in", values, "admRoleNm");
            return (Criteria) this;
        }

        public Criteria andAdmRoleNmBetween(String value1, String value2) {
            addCriterion("TAR.ADM_ROLE_NM between", value1, value2, "admRoleNm");
            return (Criteria) this;
        }

        public Criteria andAdmRoleNmNotBetween(String value1, String value2) {
            addCriterion("TAR.ADM_ROLE_NM not between", value1, value2, "admRoleNm");
            return (Criteria) this;
        }

        public Criteria andPsnlInfoHndlYnIsNull() {
            addCriterion("TAR.PSNL_INFO_HNDL_YN is null");
            return (Criteria) this;
        }

        public Criteria andPsnlInfoHndlYnIsNotNull() {
            addCriterion("TAR.PSNL_INFO_HNDL_YN is not null");
            return (Criteria) this;
        }

        public Criteria andPsnlInfoHndlYnEqualTo(String value) {
            addCriterion("TAR.PSNL_INFO_HNDL_YN =", value, "psnlInfoHndlYn");
            return (Criteria) this;
        }

        public Criteria andPsnlInfoHndlYnNotEqualTo(String value) {
            addCriterion("TAR.PSNL_INFO_HNDL_YN <>", value, "psnlInfoHndlYn");
            return (Criteria) this;
        }

        public Criteria andPsnlInfoHndlYnGreaterThan(String value) {
            addCriterion("TAR.PSNL_INFO_HNDL_YN >", value, "psnlInfoHndlYn");
            return (Criteria) this;
        }

        public Criteria andPsnlInfoHndlYnGreaterThanOrEqualTo(String value) {
            addCriterion("TAR.PSNL_INFO_HNDL_YN >=", value, "psnlInfoHndlYn");
            return (Criteria) this;
        }

        public Criteria andPsnlInfoHndlYnLessThan(String value) {
            addCriterion("TAR.PSNL_INFO_HNDL_YN <", value, "psnlInfoHndlYn");
            return (Criteria) this;
        }

        public Criteria andPsnlInfoHndlYnLessThanOrEqualTo(String value) {
            addCriterion("TAR.PSNL_INFO_HNDL_YN <=", value, "psnlInfoHndlYn");
            return (Criteria) this;
        }

        public Criteria andPsnlInfoHndlYnLike(String value) {
            addCriterion("TAR.PSNL_INFO_HNDL_YN like", value, "psnlInfoHndlYn");
            return (Criteria) this;
        }

        public Criteria andPsnlInfoHndlYnNotLike(String value) {
            addCriterion("TAR.PSNL_INFO_HNDL_YN not like", value, "psnlInfoHndlYn");
            return (Criteria) this;
        }

        public Criteria andPsnlInfoHndlYnIn(List<String> values) {
            addCriterion("TAR.PSNL_INFO_HNDL_YN in", values, "psnlInfoHndlYn");
            return (Criteria) this;
        }

        public Criteria andPsnlInfoHndlYnNotIn(List<String> values) {
            addCriterion("TAR.PSNL_INFO_HNDL_YN not in", values, "psnlInfoHndlYn");
            return (Criteria) this;
        }

        public Criteria andPsnlInfoHndlYnBetween(String value1, String value2) {
            addCriterion("TAR.PSNL_INFO_HNDL_YN between", value1, value2, "psnlInfoHndlYn");
            return (Criteria) this;
        }

        public Criteria andPsnlInfoHndlYnNotBetween(String value1, String value2) {
            addCriterion("TAR.PSNL_INFO_HNDL_YN not between", value1, value2, "psnlInfoHndlYn");
            return (Criteria) this;
        }

        public Criteria andDashbdTpCdIsNull() {
            addCriterion("TAR.DASHBD_TP_CD is null");
            return (Criteria) this;
        }

        public Criteria andDashbdTpCdIsNotNull() {
            addCriterion("TAR.DASHBD_TP_CD is not null");
            return (Criteria) this;
        }

        public Criteria andDashbdTpCdEqualTo(String value) {
            addCriterion("TAR.DASHBD_TP_CD =", value, "dashbdTpCd");
            return (Criteria) this;
        }

        public Criteria andDashbdTpCdNotEqualTo(String value) {
            addCriterion("TAR.DASHBD_TP_CD <>", value, "dashbdTpCd");
            return (Criteria) this;
        }

        public Criteria andDashbdTpCdGreaterThan(String value) {
            addCriterion("TAR.DASHBD_TP_CD >", value, "dashbdTpCd");
            return (Criteria) this;
        }

        public Criteria andDashbdTpCdGreaterThanOrEqualTo(String value) {
            addCriterion("TAR.DASHBD_TP_CD >=", value, "dashbdTpCd");
            return (Criteria) this;
        }

        public Criteria andDashbdTpCdLessThan(String value) {
            addCriterion("TAR.DASHBD_TP_CD <", value, "dashbdTpCd");
            return (Criteria) this;
        }

        public Criteria andDashbdTpCdLessThanOrEqualTo(String value) {
            addCriterion("TAR.DASHBD_TP_CD <=", value, "dashbdTpCd");
            return (Criteria) this;
        }

        public Criteria andDashbdTpCdLike(String value) {
            addCriterion("TAR.DASHBD_TP_CD like", value, "dashbdTpCd");
            return (Criteria) this;
        }

        public Criteria andDashbdTpCdNotLike(String value) {
            addCriterion("TAR.DASHBD_TP_CD not like", value, "dashbdTpCd");
            return (Criteria) this;
        }

        public Criteria andDashbdTpCdIn(List<String> values) {
            addCriterion("TAR.DASHBD_TP_CD in", values, "dashbdTpCd");
            return (Criteria) this;
        }

        public Criteria andDashbdTpCdNotIn(List<String> values) {
            addCriterion("TAR.DASHBD_TP_CD not in", values, "dashbdTpCd");
            return (Criteria) this;
        }

        public Criteria andDashbdTpCdBetween(String value1, String value2) {
            addCriterion("TAR.DASHBD_TP_CD between", value1, value2, "dashbdTpCd");
            return (Criteria) this;
        }

        public Criteria andDashbdTpCdNotBetween(String value1, String value2) {
            addCriterion("TAR.DASHBD_TP_CD not between", value1, value2, "dashbdTpCd");
            return (Criteria) this;
        }

        public Criteria andDpYnIsNull() {
            addCriterion("TAR.DP_YN is null");
            return (Criteria) this;
        }

        public Criteria andDpYnIsNotNull() {
            addCriterion("TAR.DP_YN is not null");
            return (Criteria) this;
        }

        public Criteria andDpYnEqualTo(String value) {
            addCriterion("TAR.DP_YN =", value, "dpYn");
            return (Criteria) this;
        }

        public Criteria andDpYnNotEqualTo(String value) {
            addCriterion("TAR.DP_YN <>", value, "dpYn");
            return (Criteria) this;
        }

        public Criteria andDpYnGreaterThan(String value) {
            addCriterion("TAR.DP_YN >", value, "dpYn");
            return (Criteria) this;
        }

        public Criteria andDpYnGreaterThanOrEqualTo(String value) {
            addCriterion("TAR.DP_YN >=", value, "dpYn");
            return (Criteria) this;
        }

        public Criteria andDpYnLessThan(String value) {
            addCriterion("TAR.DP_YN <", value, "dpYn");
            return (Criteria) this;
        }

        public Criteria andDpYnLessThanOrEqualTo(String value) {
            addCriterion("TAR.DP_YN <=", value, "dpYn");
            return (Criteria) this;
        }

        public Criteria andDpYnLike(String value) {
            addCriterion("TAR.DP_YN like", value, "dpYn");
            return (Criteria) this;
        }

        public Criteria andDpYnNotLike(String value) {
            addCriterion("TAR.DP_YN not like", value, "dpYn");
            return (Criteria) this;
        }

        public Criteria andDpYnIn(List<String> values) {
            addCriterion("TAR.DP_YN in", values, "dpYn");
            return (Criteria) this;
        }

        public Criteria andDpYnNotIn(List<String> values) {
            addCriterion("TAR.DP_YN not in", values, "dpYn");
            return (Criteria) this;
        }

        public Criteria andDpYnBetween(String value1, String value2) {
            addCriterion("TAR.DP_YN between", value1, value2, "dpYn");
            return (Criteria) this;
        }

        public Criteria andDpYnNotBetween(String value1, String value2) {
            addCriterion("TAR.DP_YN not between", value1, value2, "dpYn");
            return (Criteria) this;
        }

        public Criteria andFixGrpYnIsNull() {
            addCriterion("TAR.FIX_GRP_YN is null");
            return (Criteria) this;
        }

        public Criteria andFixGrpYnIsNotNull() {
            addCriterion("TAR.FIX_GRP_YN is not null");
            return (Criteria) this;
        }

        public Criteria andFixGrpYnEqualTo(String value) {
            addCriterion("TAR.FIX_GRP_YN =", value, "fixGrpYn");
            return (Criteria) this;
        }

        public Criteria andFixGrpYnNotEqualTo(String value) {
            addCriterion("TAR.FIX_GRP_YN <>", value, "fixGrpYn");
            return (Criteria) this;
        }

        public Criteria andFixGrpYnGreaterThan(String value) {
            addCriterion("TAR.FIX_GRP_YN >", value, "fixGrpYn");
            return (Criteria) this;
        }

        public Criteria andFixGrpYnGreaterThanOrEqualTo(String value) {
            addCriterion("TAR.FIX_GRP_YN >=", value, "fixGrpYn");
            return (Criteria) this;
        }

        public Criteria andFixGrpYnLessThan(String value) {
            addCriterion("TAR.FIX_GRP_YN <", value, "fixGrpYn");
            return (Criteria) this;
        }

        public Criteria andFixGrpYnLessThanOrEqualTo(String value) {
            addCriterion("TAR.FIX_GRP_YN <=", value, "fixGrpYn");
            return (Criteria) this;
        }

        public Criteria andFixGrpYnLike(String value) {
            addCriterion("TAR.FIX_GRP_YN like", value, "fixGrpYn");
            return (Criteria) this;
        }

        public Criteria andFixGrpYnNotLike(String value) {
            addCriterion("TAR.FIX_GRP_YN not like", value, "fixGrpYn");
            return (Criteria) this;
        }

        public Criteria andFixGrpYnIn(List<String> values) {
            addCriterion("TAR.FIX_GRP_YN in", values, "fixGrpYn");
            return (Criteria) this;
        }

        public Criteria andFixGrpYnNotIn(List<String> values) {
            addCriterion("TAR.FIX_GRP_YN not in", values, "fixGrpYn");
            return (Criteria) this;
        }

        public Criteria andFixGrpYnBetween(String value1, String value2) {
            addCriterion("TAR.FIX_GRP_YN between", value1, value2, "fixGrpYn");
            return (Criteria) this;
        }

        public Criteria andFixGrpYnNotBetween(String value1, String value2) {
            addCriterion("TAR.FIX_GRP_YN not between", value1, value2, "fixGrpYn");
            return (Criteria) this;
        }

        public Criteria andRegDtIsNull() {
            addCriterion("TAR.REG_DT is null");
            return (Criteria) this;
        }

        public Criteria andRegDtIsNotNull() {
            addCriterion("TAR.REG_DT is not null");
            return (Criteria) this;
        }

        public Criteria andRegDtEqualTo(Date value) {
            addCriterion("TAR.REG_DT =", value, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtNotEqualTo(Date value) {
            addCriterion("TAR.REG_DT <>", value, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtGreaterThan(Date value) {
            addCriterion("TAR.REG_DT >", value, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtGreaterThanOrEqualTo(Date value) {
            addCriterion("TAR.REG_DT >=", value, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtLessThan(Date value) {
            addCriterion("TAR.REG_DT <", value, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtLessThanOrEqualTo(Date value) {
            addCriterion("TAR.REG_DT <=", value, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtIn(List<Date> values) {
            addCriterion("TAR.REG_DT in", values, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtNotIn(List<Date> values) {
            addCriterion("TAR.REG_DT not in", values, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtBetween(Date value1, Date value2) {
            addCriterion("TAR.REG_DT between", value1, value2, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtNotBetween(Date value1, Date value2) {
            addCriterion("TAR.REG_DT not between", value1, value2, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegIdIsNull() {
            addCriterion("TAR.REG_ID is null");
            return (Criteria) this;
        }

        public Criteria andRegIdIsNotNull() {
            addCriterion("TAR.REG_ID is not null");
            return (Criteria) this;
        }

        public Criteria andRegIdEqualTo(String value) {
            addCriterion("TAR.REG_ID =", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdNotEqualTo(String value) {
            addCriterion("TAR.REG_ID <>", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdGreaterThan(String value) {
            addCriterion("TAR.REG_ID >", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdGreaterThanOrEqualTo(String value) {
            addCriterion("TAR.REG_ID >=", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdLessThan(String value) {
            addCriterion("TAR.REG_ID <", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdLessThanOrEqualTo(String value) {
            addCriterion("TAR.REG_ID <=", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdLike(String value) {
            addCriterion("TAR.REG_ID like", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdNotLike(String value) {
            addCriterion("TAR.REG_ID not like", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdIn(List<String> values) {
            addCriterion("TAR.REG_ID in", values, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdNotIn(List<String> values) {
            addCriterion("TAR.REG_ID not in", values, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdBetween(String value1, String value2) {
            addCriterion("TAR.REG_ID between", value1, value2, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdNotBetween(String value1, String value2) {
            addCriterion("TAR.REG_ID not between", value1, value2, "regId");
            return (Criteria) this;
        }

        public Criteria andModDtIsNull() {
            addCriterion("TAR.MOD_DT is null");
            return (Criteria) this;
        }

        public Criteria andModDtIsNotNull() {
            addCriterion("TAR.MOD_DT is not null");
            return (Criteria) this;
        }

        public Criteria andModDtEqualTo(Date value) {
            addCriterion("TAR.MOD_DT =", value, "modDt");
            return (Criteria) this;
        }

        public Criteria andModDtNotEqualTo(Date value) {
            addCriterion("TAR.MOD_DT <>", value, "modDt");
            return (Criteria) this;
        }

        public Criteria andModDtGreaterThan(Date value) {
            addCriterion("TAR.MOD_DT >", value, "modDt");
            return (Criteria) this;
        }

        public Criteria andModDtGreaterThanOrEqualTo(Date value) {
            addCriterion("TAR.MOD_DT >=", value, "modDt");
            return (Criteria) this;
        }

        public Criteria andModDtLessThan(Date value) {
            addCriterion("TAR.MOD_DT <", value, "modDt");
            return (Criteria) this;
        }

        public Criteria andModDtLessThanOrEqualTo(Date value) {
            addCriterion("TAR.MOD_DT <=", value, "modDt");
            return (Criteria) this;
        }

        public Criteria andModDtIn(List<Date> values) {
            addCriterion("TAR.MOD_DT in", values, "modDt");
            return (Criteria) this;
        }

        public Criteria andModDtNotIn(List<Date> values) {
            addCriterion("TAR.MOD_DT not in", values, "modDt");
            return (Criteria) this;
        }

        public Criteria andModDtBetween(Date value1, Date value2) {
            addCriterion("TAR.MOD_DT between", value1, value2, "modDt");
            return (Criteria) this;
        }

        public Criteria andModDtNotBetween(Date value1, Date value2) {
            addCriterion("TAR.MOD_DT not between", value1, value2, "modDt");
            return (Criteria) this;
        }

        public Criteria andModIdIsNull() {
            addCriterion("TAR.MOD_ID is null");
            return (Criteria) this;
        }

        public Criteria andModIdIsNotNull() {
            addCriterion("TAR.MOD_ID is not null");
            return (Criteria) this;
        }

        public Criteria andModIdEqualTo(String value) {
            addCriterion("TAR.MOD_ID =", value, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdNotEqualTo(String value) {
            addCriterion("TAR.MOD_ID <>", value, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdGreaterThan(String value) {
            addCriterion("TAR.MOD_ID >", value, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdGreaterThanOrEqualTo(String value) {
            addCriterion("TAR.MOD_ID >=", value, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdLessThan(String value) {
            addCriterion("TAR.MOD_ID <", value, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdLessThanOrEqualTo(String value) {
            addCriterion("TAR.MOD_ID <=", value, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdLike(String value) {
            addCriterion("TAR.MOD_ID like", value, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdNotLike(String value) {
            addCriterion("TAR.MOD_ID not like", value, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdIn(List<String> values) {
            addCriterion("TAR.MOD_ID in", values, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdNotIn(List<String> values) {
            addCriterion("TAR.MOD_ID not in", values, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdBetween(String value1, String value2) {
            addCriterion("TAR.MOD_ID between", value1, value2, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdNotBetween(String value1, String value2) {
            addCriterion("TAR.MOD_ID not between", value1, value2, "modId");
            return (Criteria) this;
        }

        public Criteria andUseYnIsNull() {
            addCriterion("TAR.USE_YN is null");
            return (Criteria) this;
        }

        public Criteria andUseYnIsNotNull() {
            addCriterion("TAR.USE_YN is not null");
            return (Criteria) this;
        }

        public Criteria andUseYnEqualTo(String value) {
            addCriterion("TAR.USE_YN =", value, "useYn");
            return (Criteria) this;
        }

        public Criteria andUseYnNotEqualTo(String value) {
            addCriterion("TAR.USE_YN <>", value, "useYn");
            return (Criteria) this;
        }

        public Criteria andUseYnGreaterThan(String value) {
            addCriterion("TAR.USE_YN >", value, "useYn");
            return (Criteria) this;
        }

        public Criteria andUseYnGreaterThanOrEqualTo(String value) {
            addCriterion("TAR.USE_YN >=", value, "useYn");
            return (Criteria) this;
        }

        public Criteria andUseYnLessThan(String value) {
            addCriterion("TAR.USE_YN <", value, "useYn");
            return (Criteria) this;
        }

        public Criteria andUseYnLessThanOrEqualTo(String value) {
            addCriterion("TAR.USE_YN <=", value, "useYn");
            return (Criteria) this;
        }

        public Criteria andUseYnLike(String value) {
            addCriterion("TAR.USE_YN like", value, "useYn");
            return (Criteria) this;
        }

        public Criteria andUseYnNotLike(String value) {
            addCriterion("TAR.USE_YN not like", value, "useYn");
            return (Criteria) this;
        }

        public Criteria andUseYnIn(List<String> values) {
            addCriterion("TAR.USE_YN in", values, "useYn");
            return (Criteria) this;
        }

        public Criteria andUseYnNotIn(List<String> values) {
            addCriterion("TAR.USE_YN not in", values, "useYn");
            return (Criteria) this;
        }

        public Criteria andUseYnBetween(String value1, String value2) {
            addCriterion("TAR.USE_YN between", value1, value2, "useYn");
            return (Criteria) this;
        }

        public Criteria andUseYnNotBetween(String value1, String value2) {
            addCriterion("TAR.USE_YN not between", value1, value2, "useYn");
            return (Criteria) this;
        }

        public Criteria andAdmRoleCdLikeInsensitive(String value) {
            addCriterion("upper(TAR.ADM_ROLE_CD) like", value.toUpperCase(), "admRoleCd");
            return (Criteria) this;
        }

        public Criteria andAdmRoleNmLikeInsensitive(String value) {
            addCriterion("upper(TAR.ADM_ROLE_NM) like", value.toUpperCase(), "admRoleNm");
            return (Criteria) this;
        }

        public Criteria andPsnlInfoHndlYnLikeInsensitive(String value) {
            addCriterion("upper(TAR.PSNL_INFO_HNDL_YN) like", value.toUpperCase(), "psnlInfoHndlYn");
            return (Criteria) this;
        }

        public Criteria andDashbdTpCdLikeInsensitive(String value) {
            addCriterion("upper(TAR.DASHBD_TP_CD) like", value.toUpperCase(), "dashbdTpCd");
            return (Criteria) this;
        }

        public Criteria andDpYnLikeInsensitive(String value) {
            addCriterion("upper(TAR.DP_YN) like", value.toUpperCase(), "dpYn");
            return (Criteria) this;
        }

        public Criteria andFixGrpYnLikeInsensitive(String value) {
            addCriterion("upper(TAR.FIX_GRP_YN) like", value.toUpperCase(), "fixGrpYn");
            return (Criteria) this;
        }

        public Criteria andRegIdLikeInsensitive(String value) {
            addCriterion("upper(TAR.REG_ID) like", value.toUpperCase(), "regId");
            return (Criteria) this;
        }

        public Criteria andModIdLikeInsensitive(String value) {
            addCriterion("upper(TAR.MOD_ID) like", value.toUpperCase(), "modId");
            return (Criteria) this;
        }

        public Criteria andUseYnLikeInsensitive(String value) {
            addCriterion("upper(TAR.USE_YN) like", value.toUpperCase(), "useYn");
            return (Criteria) this;
        }

        public Criteria andAdmRoleCdLikeLeft(String value) {
            addCriterion("TAR.ADM_ROLE_CD like ", "%" + value, "admRoleCd");
            return (Criteria) this;
        }

        public Criteria andAdmRoleCdLikeRight(String value) {
            addCriterion("TAR.ADM_ROLE_CD like ", value + "%", "admRoleCd");
            return (Criteria) this;
        }

        public Criteria andAdmRoleCdLikeBoth(String value) {
            addCriterion("TAR.ADM_ROLE_CD like ", "%" + value + "%", "admRoleCd");
            return (Criteria) this;
        }

        public Criteria andAdmRoleNmLikeLeft(String value) {
            addCriterion("TAR.ADM_ROLE_NM like ", "%" + value, "admRoleNm");
            return (Criteria) this;
        }

        public Criteria andAdmRoleNmLikeRight(String value) {
            addCriterion("TAR.ADM_ROLE_NM like ", value + "%", "admRoleNm");
            return (Criteria) this;
        }

        public Criteria andAdmRoleNmLikeBoth(String value) {
            addCriterion("TAR.ADM_ROLE_NM like ", "%" + value + "%", "admRoleNm");
            return (Criteria) this;
        }

        public Criteria andPsnlInfoHndlYnLikeLeft(String value) {
            addCriterion("TAR.PSNL_INFO_HNDL_YN like ", "%" + value, "psnlInfoHndlYn");
            return (Criteria) this;
        }

        public Criteria andPsnlInfoHndlYnLikeRight(String value) {
            addCriterion("TAR.PSNL_INFO_HNDL_YN like ", value + "%", "psnlInfoHndlYn");
            return (Criteria) this;
        }

        public Criteria andPsnlInfoHndlYnLikeBoth(String value) {
            addCriterion("TAR.PSNL_INFO_HNDL_YN like ", "%" + value + "%", "psnlInfoHndlYn");
            return (Criteria) this;
        }

        public Criteria andDashbdTpCdLikeLeft(String value) {
            addCriterion("TAR.DASHBD_TP_CD like ", "%" + value, "dashbdTpCd");
            return (Criteria) this;
        }

        public Criteria andDashbdTpCdLikeRight(String value) {
            addCriterion("TAR.DASHBD_TP_CD like ", value + "%", "dashbdTpCd");
            return (Criteria) this;
        }

        public Criteria andDashbdTpCdLikeBoth(String value) {
            addCriterion("TAR.DASHBD_TP_CD like ", "%" + value + "%", "dashbdTpCd");
            return (Criteria) this;
        }

        public Criteria andDpYnLikeLeft(String value) {
            addCriterion("TAR.DP_YN like ", "%" + value, "dpYn");
            return (Criteria) this;
        }

        public Criteria andDpYnLikeRight(String value) {
            addCriterion("TAR.DP_YN like ", value + "%", "dpYn");
            return (Criteria) this;
        }

        public Criteria andDpYnLikeBoth(String value) {
            addCriterion("TAR.DP_YN like ", "%" + value + "%", "dpYn");
            return (Criteria) this;
        }

        public Criteria andFixGrpYnLikeLeft(String value) {
            addCriterion("TAR.FIX_GRP_YN like ", "%" + value, "fixGrpYn");
            return (Criteria) this;
        }

        public Criteria andFixGrpYnLikeRight(String value) {
            addCriterion("TAR.FIX_GRP_YN like ", value + "%", "fixGrpYn");
            return (Criteria) this;
        }

        public Criteria andFixGrpYnLikeBoth(String value) {
            addCriterion("TAR.FIX_GRP_YN like ", "%" + value + "%", "fixGrpYn");
            return (Criteria) this;
        }

        public Criteria andRegIdLikeLeft(String value) {
            addCriterion("TAR.REG_ID like ", "%" + value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdLikeRight(String value) {
            addCriterion("TAR.REG_ID like ", value + "%", "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdLikeBoth(String value) {
            addCriterion("TAR.REG_ID like ", "%" + value + "%", "regId");
            return (Criteria) this;
        }

        public Criteria andModIdLikeLeft(String value) {
            addCriterion("TAR.MOD_ID like ", "%" + value, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdLikeRight(String value) {
            addCriterion("TAR.MOD_ID like ", value + "%", "modId");
            return (Criteria) this;
        }

        public Criteria andModIdLikeBoth(String value) {
            addCriterion("TAR.MOD_ID like ", "%" + value + "%", "modId");
            return (Criteria) this;
        }

        public Criteria andUseYnLikeLeft(String value) {
            addCriterion("TAR.USE_YN like ", "%" + value, "useYn");
            return (Criteria) this;
        }

        public Criteria andUseYnLikeRight(String value) {
            addCriterion("TAR.USE_YN like ", value + "%", "useYn");
            return (Criteria) this;
        }

        public Criteria andUseYnLikeBoth(String value) {
            addCriterion("TAR.USE_YN like ", "%" + value + "%", "useYn");
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