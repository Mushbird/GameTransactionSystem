package com.mushbird.sinsege.base.module.display.model.entity.criteria;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DpCornerMapEntityCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    public DpCornerMapEntityCriteria() {
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

        public Criteria andDpConrMapIdIsNull() {
            addCriterion("TDCM.DP_CONR_MAP_ID is null");
            return (Criteria) this;
        }

        public Criteria andDpConrMapIdIsNotNull() {
            addCriterion("TDCM.DP_CONR_MAP_ID is not null");
            return (Criteria) this;
        }

        public Criteria andDpConrMapIdEqualTo(Integer value) {
            addCriterion("TDCM.DP_CONR_MAP_ID =", value, "dpConrMapId");
            return (Criteria) this;
        }

        public Criteria andDpConrMapIdNotEqualTo(Integer value) {
            addCriterion("TDCM.DP_CONR_MAP_ID <>", value, "dpConrMapId");
            return (Criteria) this;
        }

        public Criteria andDpConrMapIdGreaterThan(Integer value) {
            addCriterion("TDCM.DP_CONR_MAP_ID >", value, "dpConrMapId");
            return (Criteria) this;
        }

        public Criteria andDpConrMapIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("TDCM.DP_CONR_MAP_ID >=", value, "dpConrMapId");
            return (Criteria) this;
        }

        public Criteria andDpConrMapIdLessThan(Integer value) {
            addCriterion("TDCM.DP_CONR_MAP_ID <", value, "dpConrMapId");
            return (Criteria) this;
        }

        public Criteria andDpConrMapIdLessThanOrEqualTo(Integer value) {
            addCriterion("TDCM.DP_CONR_MAP_ID <=", value, "dpConrMapId");
            return (Criteria) this;
        }

        public Criteria andDpConrMapIdIn(List<Integer> values) {
            addCriterion("TDCM.DP_CONR_MAP_ID in", values, "dpConrMapId");
            return (Criteria) this;
        }

        public Criteria andDpConrMapIdNotIn(List<Integer> values) {
            addCriterion("TDCM.DP_CONR_MAP_ID not in", values, "dpConrMapId");
            return (Criteria) this;
        }

        public Criteria andDpConrMapIdBetween(Integer value1, Integer value2) {
            addCriterion("TDCM.DP_CONR_MAP_ID between", value1, value2, "dpConrMapId");
            return (Criteria) this;
        }

        public Criteria andDpConrMapIdNotBetween(Integer value1, Integer value2) {
            addCriterion("TDCM.DP_CONR_MAP_ID not between", value1, value2, "dpConrMapId");
            return (Criteria) this;
        }

        public Criteria andDpConrCdIsNull() {
            addCriterion("TDCM.DP_CONR_CD is null");
            return (Criteria) this;
        }

        public Criteria andDpConrCdIsNotNull() {
            addCriterion("TDCM.DP_CONR_CD is not null");
            return (Criteria) this;
        }

        public Criteria andDpConrCdEqualTo(String value) {
            addCriterion("TDCM.DP_CONR_CD =", value, "dpConrCd");
            return (Criteria) this;
        }

        public Criteria andDpConrCdNotEqualTo(String value) {
            addCriterion("TDCM.DP_CONR_CD <>", value, "dpConrCd");
            return (Criteria) this;
        }

        public Criteria andDpConrCdGreaterThan(String value) {
            addCriterion("TDCM.DP_CONR_CD >", value, "dpConrCd");
            return (Criteria) this;
        }

        public Criteria andDpConrCdGreaterThanOrEqualTo(String value) {
            addCriterion("TDCM.DP_CONR_CD >=", value, "dpConrCd");
            return (Criteria) this;
        }

        public Criteria andDpConrCdLessThan(String value) {
            addCriterion("TDCM.DP_CONR_CD <", value, "dpConrCd");
            return (Criteria) this;
        }

        public Criteria andDpConrCdLessThanOrEqualTo(String value) {
            addCriterion("TDCM.DP_CONR_CD <=", value, "dpConrCd");
            return (Criteria) this;
        }

        public Criteria andDpConrCdLike(String value) {
            addCriterion("TDCM.DP_CONR_CD like", value, "dpConrCd");
            return (Criteria) this;
        }

        public Criteria andDpConrCdNotLike(String value) {
            addCriterion("TDCM.DP_CONR_CD not like", value, "dpConrCd");
            return (Criteria) this;
        }

        public Criteria andDpConrCdIn(List<String> values) {
            addCriterion("TDCM.DP_CONR_CD in", values, "dpConrCd");
            return (Criteria) this;
        }

        public Criteria andDpConrCdNotIn(List<String> values) {
            addCriterion("TDCM.DP_CONR_CD not in", values, "dpConrCd");
            return (Criteria) this;
        }

        public Criteria andDpConrCdBetween(String value1, String value2) {
            addCriterion("TDCM.DP_CONR_CD between", value1, value2, "dpConrCd");
            return (Criteria) this;
        }

        public Criteria andDpConrCdNotBetween(String value1, String value2) {
            addCriterion("TDCM.DP_CONR_CD not between", value1, value2, "dpConrCd");
            return (Criteria) this;
        }

        public Criteria andMapIdIsNull() {
            addCriterion("TDCM.MAP_ID is null");
            return (Criteria) this;
        }

        public Criteria andMapIdIsNotNull() {
            addCriterion("TDCM.MAP_ID is not null");
            return (Criteria) this;
        }

        public Criteria andMapIdEqualTo(Integer value) {
            addCriterion("TDCM.MAP_ID =", value, "mapId");
            return (Criteria) this;
        }

        public Criteria andMapIdNotEqualTo(Integer value) {
            addCriterion("TDCM.MAP_ID <>", value, "mapId");
            return (Criteria) this;
        }

        public Criteria andMapIdGreaterThan(Integer value) {
            addCriterion("TDCM.MAP_ID >", value, "mapId");
            return (Criteria) this;
        }

        public Criteria andMapIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("TDCM.MAP_ID >=", value, "mapId");
            return (Criteria) this;
        }

        public Criteria andMapIdLessThan(Integer value) {
            addCriterion("TDCM.MAP_ID <", value, "mapId");
            return (Criteria) this;
        }

        public Criteria andMapIdLessThanOrEqualTo(Integer value) {
            addCriterion("TDCM.MAP_ID <=", value, "mapId");
            return (Criteria) this;
        }

        public Criteria andMapIdIn(List<Integer> values) {
            addCriterion("TDCM.MAP_ID in", values, "mapId");
            return (Criteria) this;
        }

        public Criteria andMapIdNotIn(List<Integer> values) {
            addCriterion("TDCM.MAP_ID not in", values, "mapId");
            return (Criteria) this;
        }

        public Criteria andMapIdBetween(Integer value1, Integer value2) {
            addCriterion("TDCM.MAP_ID between", value1, value2, "mapId");
            return (Criteria) this;
        }

        public Criteria andMapIdNotBetween(Integer value1, Integer value2) {
            addCriterion("TDCM.MAP_ID not between", value1, value2, "mapId");
            return (Criteria) this;
        }

        public Criteria andMapClIsNull() {
            addCriterion("TDCM.MAP_CL is null");
            return (Criteria) this;
        }

        public Criteria andMapClIsNotNull() {
            addCriterion("TDCM.MAP_CL is not null");
            return (Criteria) this;
        }

        public Criteria andMapClEqualTo(String value) {
            addCriterion("TDCM.MAP_CL =", value, "mapCl");
            return (Criteria) this;
        }

        public Criteria andMapClNotEqualTo(String value) {
            addCriterion("TDCM.MAP_CL <>", value, "mapCl");
            return (Criteria) this;
        }

        public Criteria andMapClGreaterThan(String value) {
            addCriterion("TDCM.MAP_CL >", value, "mapCl");
            return (Criteria) this;
        }

        public Criteria andMapClGreaterThanOrEqualTo(String value) {
            addCriterion("TDCM.MAP_CL >=", value, "mapCl");
            return (Criteria) this;
        }

        public Criteria andMapClLessThan(String value) {
            addCriterion("TDCM.MAP_CL <", value, "mapCl");
            return (Criteria) this;
        }

        public Criteria andMapClLessThanOrEqualTo(String value) {
            addCriterion("TDCM.MAP_CL <=", value, "mapCl");
            return (Criteria) this;
        }

        public Criteria andMapClLike(String value) {
            addCriterion("TDCM.MAP_CL like", value, "mapCl");
            return (Criteria) this;
        }

        public Criteria andMapClNotLike(String value) {
            addCriterion("TDCM.MAP_CL not like", value, "mapCl");
            return (Criteria) this;
        }

        public Criteria andMapClIn(List<String> values) {
            addCriterion("TDCM.MAP_CL in", values, "mapCl");
            return (Criteria) this;
        }

        public Criteria andMapClNotIn(List<String> values) {
            addCriterion("TDCM.MAP_CL not in", values, "mapCl");
            return (Criteria) this;
        }

        public Criteria andMapClBetween(String value1, String value2) {
            addCriterion("TDCM.MAP_CL between", value1, value2, "mapCl");
            return (Criteria) this;
        }

        public Criteria andMapClNotBetween(String value1, String value2) {
            addCriterion("TDCM.MAP_CL not between", value1, value2, "mapCl");
            return (Criteria) this;
        }

        public Criteria andDpConrMapGidIsNull() {
            addCriterion("TDCM.DP_CONR_MAP_GID is null");
            return (Criteria) this;
        }

        public Criteria andDpConrMapGidIsNotNull() {
            addCriterion("TDCM.DP_CONR_MAP_GID is not null");
            return (Criteria) this;
        }

        public Criteria andDpConrMapGidEqualTo(Integer value) {
            addCriterion("TDCM.DP_CONR_MAP_GID =", value, "dpConrMapGid");
            return (Criteria) this;
        }

        public Criteria andDpConrMapGidNotEqualTo(Integer value) {
            addCriterion("TDCM.DP_CONR_MAP_GID <>", value, "dpConrMapGid");
            return (Criteria) this;
        }

        public Criteria andDpConrMapGidGreaterThan(Integer value) {
            addCriterion("TDCM.DP_CONR_MAP_GID >", value, "dpConrMapGid");
            return (Criteria) this;
        }

        public Criteria andDpConrMapGidGreaterThanOrEqualTo(Integer value) {
            addCriterion("TDCM.DP_CONR_MAP_GID >=", value, "dpConrMapGid");
            return (Criteria) this;
        }

        public Criteria andDpConrMapGidLessThan(Integer value) {
            addCriterion("TDCM.DP_CONR_MAP_GID <", value, "dpConrMapGid");
            return (Criteria) this;
        }

        public Criteria andDpConrMapGidLessThanOrEqualTo(Integer value) {
            addCriterion("TDCM.DP_CONR_MAP_GID <=", value, "dpConrMapGid");
            return (Criteria) this;
        }

        public Criteria andDpConrMapGidIn(List<Integer> values) {
            addCriterion("TDCM.DP_CONR_MAP_GID in", values, "dpConrMapGid");
            return (Criteria) this;
        }

        public Criteria andDpConrMapGidNotIn(List<Integer> values) {
            addCriterion("TDCM.DP_CONR_MAP_GID not in", values, "dpConrMapGid");
            return (Criteria) this;
        }

        public Criteria andDpConrMapGidBetween(Integer value1, Integer value2) {
            addCriterion("TDCM.DP_CONR_MAP_GID between", value1, value2, "dpConrMapGid");
            return (Criteria) this;
        }

        public Criteria andDpConrMapGidNotBetween(Integer value1, Integer value2) {
            addCriterion("TDCM.DP_CONR_MAP_GID not between", value1, value2, "dpConrMapGid");
            return (Criteria) this;
        }

        public Criteria andDpYnIsNull() {
            addCriterion("TDCM.DP_YN is null");
            return (Criteria) this;
        }

        public Criteria andDpYnIsNotNull() {
            addCriterion("TDCM.DP_YN is not null");
            return (Criteria) this;
        }

        public Criteria andDpYnEqualTo(String value) {
            addCriterion("TDCM.DP_YN =", value, "dpYn");
            return (Criteria) this;
        }

        public Criteria andDpYnNotEqualTo(String value) {
            addCriterion("TDCM.DP_YN <>", value, "dpYn");
            return (Criteria) this;
        }

        public Criteria andDpYnGreaterThan(String value) {
            addCriterion("TDCM.DP_YN >", value, "dpYn");
            return (Criteria) this;
        }

        public Criteria andDpYnGreaterThanOrEqualTo(String value) {
            addCriterion("TDCM.DP_YN >=", value, "dpYn");
            return (Criteria) this;
        }

        public Criteria andDpYnLessThan(String value) {
            addCriterion("TDCM.DP_YN <", value, "dpYn");
            return (Criteria) this;
        }

        public Criteria andDpYnLessThanOrEqualTo(String value) {
            addCriterion("TDCM.DP_YN <=", value, "dpYn");
            return (Criteria) this;
        }

        public Criteria andDpYnLike(String value) {
            addCriterion("TDCM.DP_YN like", value, "dpYn");
            return (Criteria) this;
        }

        public Criteria andDpYnNotLike(String value) {
            addCriterion("TDCM.DP_YN not like", value, "dpYn");
            return (Criteria) this;
        }

        public Criteria andDpYnIn(List<String> values) {
            addCriterion("TDCM.DP_YN in", values, "dpYn");
            return (Criteria) this;
        }

        public Criteria andDpYnNotIn(List<String> values) {
            addCriterion("TDCM.DP_YN not in", values, "dpYn");
            return (Criteria) this;
        }

        public Criteria andDpYnBetween(String value1, String value2) {
            addCriterion("TDCM.DP_YN between", value1, value2, "dpYn");
            return (Criteria) this;
        }

        public Criteria andDpYnNotBetween(String value1, String value2) {
            addCriterion("TDCM.DP_YN not between", value1, value2, "dpYn");
            return (Criteria) this;
        }

        public Criteria andSordIsNull() {
            addCriterion("TDCM.SORD is null");
            return (Criteria) this;
        }

        public Criteria andSordIsNotNull() {
            addCriterion("TDCM.SORD is not null");
            return (Criteria) this;
        }

        public Criteria andSordEqualTo(Integer value) {
            addCriterion("TDCM.SORD =", value, "sord");
            return (Criteria) this;
        }

        public Criteria andSordNotEqualTo(Integer value) {
            addCriterion("TDCM.SORD <>", value, "sord");
            return (Criteria) this;
        }

        public Criteria andSordGreaterThan(Integer value) {
            addCriterion("TDCM.SORD >", value, "sord");
            return (Criteria) this;
        }

        public Criteria andSordGreaterThanOrEqualTo(Integer value) {
            addCriterion("TDCM.SORD >=", value, "sord");
            return (Criteria) this;
        }

        public Criteria andSordLessThan(Integer value) {
            addCriterion("TDCM.SORD <", value, "sord");
            return (Criteria) this;
        }

        public Criteria andSordLessThanOrEqualTo(Integer value) {
            addCriterion("TDCM.SORD <=", value, "sord");
            return (Criteria) this;
        }

        public Criteria andSordIn(List<Integer> values) {
            addCriterion("TDCM.SORD in", values, "sord");
            return (Criteria) this;
        }

        public Criteria andSordNotIn(List<Integer> values) {
            addCriterion("TDCM.SORD not in", values, "sord");
            return (Criteria) this;
        }

        public Criteria andSordBetween(Integer value1, Integer value2) {
            addCriterion("TDCM.SORD between", value1, value2, "sord");
            return (Criteria) this;
        }

        public Criteria andSordNotBetween(Integer value1, Integer value2) {
            addCriterion("TDCM.SORD not between", value1, value2, "sord");
            return (Criteria) this;
        }

        public Criteria andRegDtIsNull() {
            addCriterion("TDCM.REG_DT is null");
            return (Criteria) this;
        }

        public Criteria andRegDtIsNotNull() {
            addCriterion("TDCM.REG_DT is not null");
            return (Criteria) this;
        }

        public Criteria andRegDtEqualTo(Date value) {
            addCriterion("TDCM.REG_DT =", value, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtNotEqualTo(Date value) {
            addCriterion("TDCM.REG_DT <>", value, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtGreaterThan(Date value) {
            addCriterion("TDCM.REG_DT >", value, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtGreaterThanOrEqualTo(Date value) {
            addCriterion("TDCM.REG_DT >=", value, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtLessThan(Date value) {
            addCriterion("TDCM.REG_DT <", value, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtLessThanOrEqualTo(Date value) {
            addCriterion("TDCM.REG_DT <=", value, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtIn(List<Date> values) {
            addCriterion("TDCM.REG_DT in", values, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtNotIn(List<Date> values) {
            addCriterion("TDCM.REG_DT not in", values, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtBetween(Date value1, Date value2) {
            addCriterion("TDCM.REG_DT between", value1, value2, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtNotBetween(Date value1, Date value2) {
            addCriterion("TDCM.REG_DT not between", value1, value2, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegIdIsNull() {
            addCriterion("TDCM.REG_ID is null");
            return (Criteria) this;
        }

        public Criteria andRegIdIsNotNull() {
            addCriterion("TDCM.REG_ID is not null");
            return (Criteria) this;
        }

        public Criteria andRegIdEqualTo(String value) {
            addCriterion("TDCM.REG_ID =", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdNotEqualTo(String value) {
            addCriterion("TDCM.REG_ID <>", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdGreaterThan(String value) {
            addCriterion("TDCM.REG_ID >", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdGreaterThanOrEqualTo(String value) {
            addCriterion("TDCM.REG_ID >=", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdLessThan(String value) {
            addCriterion("TDCM.REG_ID <", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdLessThanOrEqualTo(String value) {
            addCriterion("TDCM.REG_ID <=", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdLike(String value) {
            addCriterion("TDCM.REG_ID like", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdNotLike(String value) {
            addCriterion("TDCM.REG_ID not like", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdIn(List<String> values) {
            addCriterion("TDCM.REG_ID in", values, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdNotIn(List<String> values) {
            addCriterion("TDCM.REG_ID not in", values, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdBetween(String value1, String value2) {
            addCriterion("TDCM.REG_ID between", value1, value2, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdNotBetween(String value1, String value2) {
            addCriterion("TDCM.REG_ID not between", value1, value2, "regId");
            return (Criteria) this;
        }

        public Criteria andDpConrCdLikeInsensitive(String value) {
            addCriterion("upper(TDCM.DP_CONR_CD) like", value.toUpperCase(), "dpConrCd");
            return (Criteria) this;
        }

        public Criteria andMapClLikeInsensitive(String value) {
            addCriterion("upper(TDCM.MAP_CL) like", value.toUpperCase(), "mapCl");
            return (Criteria) this;
        }

        public Criteria andDpYnLikeInsensitive(String value) {
            addCriterion("upper(TDCM.DP_YN) like", value.toUpperCase(), "dpYn");
            return (Criteria) this;
        }

        public Criteria andRegIdLikeInsensitive(String value) {
            addCriterion("upper(TDCM.REG_ID) like", value.toUpperCase(), "regId");
            return (Criteria) this;
        }

        public Criteria andDpConrCdLikeLeft(String value) {
            addCriterion("TDCM.DP_CONR_CD like ", "%" + value, "dpConrCd");
            return (Criteria) this;
        }

        public Criteria andDpConrCdLikeRight(String value) {
            addCriterion("TDCM.DP_CONR_CD like ", value + "%", "dpConrCd");
            return (Criteria) this;
        }

        public Criteria andDpConrCdLikeBoth(String value) {
            addCriterion("TDCM.DP_CONR_CD like ", "%" + value + "%", "dpConrCd");
            return (Criteria) this;
        }

        public Criteria andMapClLikeLeft(String value) {
            addCriterion("TDCM.MAP_CL like ", "%" + value, "mapCl");
            return (Criteria) this;
        }

        public Criteria andMapClLikeRight(String value) {
            addCriterion("TDCM.MAP_CL like ", value + "%", "mapCl");
            return (Criteria) this;
        }

        public Criteria andMapClLikeBoth(String value) {
            addCriterion("TDCM.MAP_CL like ", "%" + value + "%", "mapCl");
            return (Criteria) this;
        }

        public Criteria andDpYnLikeLeft(String value) {
            addCriterion("TDCM.DP_YN like ", "%" + value, "dpYn");
            return (Criteria) this;
        }

        public Criteria andDpYnLikeRight(String value) {
            addCriterion("TDCM.DP_YN like ", value + "%", "dpYn");
            return (Criteria) this;
        }

        public Criteria andDpYnLikeBoth(String value) {
            addCriterion("TDCM.DP_YN like ", "%" + value + "%", "dpYn");
            return (Criteria) this;
        }

        public Criteria andRegIdLikeLeft(String value) {
            addCriterion("TDCM.REG_ID like ", "%" + value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdLikeRight(String value) {
            addCriterion("TDCM.REG_ID like ", value + "%", "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdLikeBoth(String value) {
            addCriterion("TDCM.REG_ID like ", "%" + value + "%", "regId");
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