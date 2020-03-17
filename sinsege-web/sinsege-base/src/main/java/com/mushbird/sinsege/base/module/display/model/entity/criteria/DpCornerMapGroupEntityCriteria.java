package com.mushbird.sinsege.base.module.display.model.entity.criteria;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DpCornerMapGroupEntityCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    public DpCornerMapGroupEntityCriteria() {
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

        public Criteria andDpConrMapGidIsNull() {
            addCriterion("TDCMG.DP_CONR_MAP_GID is null");
            return (Criteria) this;
        }

        public Criteria andDpConrMapGidIsNotNull() {
            addCriterion("TDCMG.DP_CONR_MAP_GID is not null");
            return (Criteria) this;
        }

        public Criteria andDpConrMapGidEqualTo(Integer value) {
            addCriterion("TDCMG.DP_CONR_MAP_GID =", value, "dpConrMapGid");
            return (Criteria) this;
        }

        public Criteria andDpConrMapGidNotEqualTo(Integer value) {
            addCriterion("TDCMG.DP_CONR_MAP_GID <>", value, "dpConrMapGid");
            return (Criteria) this;
        }

        public Criteria andDpConrMapGidGreaterThan(Integer value) {
            addCriterion("TDCMG.DP_CONR_MAP_GID >", value, "dpConrMapGid");
            return (Criteria) this;
        }

        public Criteria andDpConrMapGidGreaterThanOrEqualTo(Integer value) {
            addCriterion("TDCMG.DP_CONR_MAP_GID >=", value, "dpConrMapGid");
            return (Criteria) this;
        }

        public Criteria andDpConrMapGidLessThan(Integer value) {
            addCriterion("TDCMG.DP_CONR_MAP_GID <", value, "dpConrMapGid");
            return (Criteria) this;
        }

        public Criteria andDpConrMapGidLessThanOrEqualTo(Integer value) {
            addCriterion("TDCMG.DP_CONR_MAP_GID <=", value, "dpConrMapGid");
            return (Criteria) this;
        }

        public Criteria andDpConrMapGidIn(List<Integer> values) {
            addCriterion("TDCMG.DP_CONR_MAP_GID in", values, "dpConrMapGid");
            return (Criteria) this;
        }

        public Criteria andDpConrMapGidNotIn(List<Integer> values) {
            addCriterion("TDCMG.DP_CONR_MAP_GID not in", values, "dpConrMapGid");
            return (Criteria) this;
        }

        public Criteria andDpConrMapGidBetween(Integer value1, Integer value2) {
            addCriterion("TDCMG.DP_CONR_MAP_GID between", value1, value2, "dpConrMapGid");
            return (Criteria) this;
        }

        public Criteria andDpConrMapGidNotBetween(Integer value1, Integer value2) {
            addCriterion("TDCMG.DP_CONR_MAP_GID not between", value1, value2, "dpConrMapGid");
            return (Criteria) this;
        }

        public Criteria andDpConrCdIsNull() {
            addCriterion("TDCMG.DP_CONR_CD is null");
            return (Criteria) this;
        }

        public Criteria andDpConrCdIsNotNull() {
            addCriterion("TDCMG.DP_CONR_CD is not null");
            return (Criteria) this;
        }

        public Criteria andDpConrCdEqualTo(String value) {
            addCriterion("TDCMG.DP_CONR_CD =", value, "dpConrCd");
            return (Criteria) this;
        }

        public Criteria andDpConrCdNotEqualTo(String value) {
            addCriterion("TDCMG.DP_CONR_CD <>", value, "dpConrCd");
            return (Criteria) this;
        }

        public Criteria andDpConrCdGreaterThan(String value) {
            addCriterion("TDCMG.DP_CONR_CD >", value, "dpConrCd");
            return (Criteria) this;
        }

        public Criteria andDpConrCdGreaterThanOrEqualTo(String value) {
            addCriterion("TDCMG.DP_CONR_CD >=", value, "dpConrCd");
            return (Criteria) this;
        }

        public Criteria andDpConrCdLessThan(String value) {
            addCriterion("TDCMG.DP_CONR_CD <", value, "dpConrCd");
            return (Criteria) this;
        }

        public Criteria andDpConrCdLessThanOrEqualTo(String value) {
            addCriterion("TDCMG.DP_CONR_CD <=", value, "dpConrCd");
            return (Criteria) this;
        }

        public Criteria andDpConrCdLike(String value) {
            addCriterion("TDCMG.DP_CONR_CD like", value, "dpConrCd");
            return (Criteria) this;
        }

        public Criteria andDpConrCdNotLike(String value) {
            addCriterion("TDCMG.DP_CONR_CD not like", value, "dpConrCd");
            return (Criteria) this;
        }

        public Criteria andDpConrCdIn(List<String> values) {
            addCriterion("TDCMG.DP_CONR_CD in", values, "dpConrCd");
            return (Criteria) this;
        }

        public Criteria andDpConrCdNotIn(List<String> values) {
            addCriterion("TDCMG.DP_CONR_CD not in", values, "dpConrCd");
            return (Criteria) this;
        }

        public Criteria andDpConrCdBetween(String value1, String value2) {
            addCriterion("TDCMG.DP_CONR_CD between", value1, value2, "dpConrCd");
            return (Criteria) this;
        }

        public Criteria andDpConrCdNotBetween(String value1, String value2) {
            addCriterion("TDCMG.DP_CONR_CD not between", value1, value2, "dpConrCd");
            return (Criteria) this;
        }

        public Criteria andMapGrpNmIsNull() {
            addCriterion("TDCMG.MAP_GRP_NM is null");
            return (Criteria) this;
        }

        public Criteria andMapGrpNmIsNotNull() {
            addCriterion("TDCMG.MAP_GRP_NM is not null");
            return (Criteria) this;
        }

        public Criteria andMapGrpNmEqualTo(String value) {
            addCriterion("TDCMG.MAP_GRP_NM =", value, "mapGrpNm");
            return (Criteria) this;
        }

        public Criteria andMapGrpNmNotEqualTo(String value) {
            addCriterion("TDCMG.MAP_GRP_NM <>", value, "mapGrpNm");
            return (Criteria) this;
        }

        public Criteria andMapGrpNmGreaterThan(String value) {
            addCriterion("TDCMG.MAP_GRP_NM >", value, "mapGrpNm");
            return (Criteria) this;
        }

        public Criteria andMapGrpNmGreaterThanOrEqualTo(String value) {
            addCriterion("TDCMG.MAP_GRP_NM >=", value, "mapGrpNm");
            return (Criteria) this;
        }

        public Criteria andMapGrpNmLessThan(String value) {
            addCriterion("TDCMG.MAP_GRP_NM <", value, "mapGrpNm");
            return (Criteria) this;
        }

        public Criteria andMapGrpNmLessThanOrEqualTo(String value) {
            addCriterion("TDCMG.MAP_GRP_NM <=", value, "mapGrpNm");
            return (Criteria) this;
        }

        public Criteria andMapGrpNmLike(String value) {
            addCriterion("TDCMG.MAP_GRP_NM like", value, "mapGrpNm");
            return (Criteria) this;
        }

        public Criteria andMapGrpNmNotLike(String value) {
            addCriterion("TDCMG.MAP_GRP_NM not like", value, "mapGrpNm");
            return (Criteria) this;
        }

        public Criteria andMapGrpNmIn(List<String> values) {
            addCriterion("TDCMG.MAP_GRP_NM in", values, "mapGrpNm");
            return (Criteria) this;
        }

        public Criteria andMapGrpNmNotIn(List<String> values) {
            addCriterion("TDCMG.MAP_GRP_NM not in", values, "mapGrpNm");
            return (Criteria) this;
        }

        public Criteria andMapGrpNmBetween(String value1, String value2) {
            addCriterion("TDCMG.MAP_GRP_NM between", value1, value2, "mapGrpNm");
            return (Criteria) this;
        }

        public Criteria andMapGrpNmNotBetween(String value1, String value2) {
            addCriterion("TDCMG.MAP_GRP_NM not between", value1, value2, "mapGrpNm");
            return (Criteria) this;
        }

        public Criteria andDpYnIsNull() {
            addCriterion("TDCMG.DP_YN is null");
            return (Criteria) this;
        }

        public Criteria andDpYnIsNotNull() {
            addCriterion("TDCMG.DP_YN is not null");
            return (Criteria) this;
        }

        public Criteria andDpYnEqualTo(String value) {
            addCriterion("TDCMG.DP_YN =", value, "dpYn");
            return (Criteria) this;
        }

        public Criteria andDpYnNotEqualTo(String value) {
            addCriterion("TDCMG.DP_YN <>", value, "dpYn");
            return (Criteria) this;
        }

        public Criteria andDpYnGreaterThan(String value) {
            addCriterion("TDCMG.DP_YN >", value, "dpYn");
            return (Criteria) this;
        }

        public Criteria andDpYnGreaterThanOrEqualTo(String value) {
            addCriterion("TDCMG.DP_YN >=", value, "dpYn");
            return (Criteria) this;
        }

        public Criteria andDpYnLessThan(String value) {
            addCriterion("TDCMG.DP_YN <", value, "dpYn");
            return (Criteria) this;
        }

        public Criteria andDpYnLessThanOrEqualTo(String value) {
            addCriterion("TDCMG.DP_YN <=", value, "dpYn");
            return (Criteria) this;
        }

        public Criteria andDpYnLike(String value) {
            addCriterion("TDCMG.DP_YN like", value, "dpYn");
            return (Criteria) this;
        }

        public Criteria andDpYnNotLike(String value) {
            addCriterion("TDCMG.DP_YN not like", value, "dpYn");
            return (Criteria) this;
        }

        public Criteria andDpYnIn(List<String> values) {
            addCriterion("TDCMG.DP_YN in", values, "dpYn");
            return (Criteria) this;
        }

        public Criteria andDpYnNotIn(List<String> values) {
            addCriterion("TDCMG.DP_YN not in", values, "dpYn");
            return (Criteria) this;
        }

        public Criteria andDpYnBetween(String value1, String value2) {
            addCriterion("TDCMG.DP_YN between", value1, value2, "dpYn");
            return (Criteria) this;
        }

        public Criteria andDpYnNotBetween(String value1, String value2) {
            addCriterion("TDCMG.DP_YN not between", value1, value2, "dpYn");
            return (Criteria) this;
        }

        public Criteria andSordIsNull() {
            addCriterion("TDCMG.SORD is null");
            return (Criteria) this;
        }

        public Criteria andSordIsNotNull() {
            addCriterion("TDCMG.SORD is not null");
            return (Criteria) this;
        }

        public Criteria andSordEqualTo(Integer value) {
            addCriterion("TDCMG.SORD =", value, "sord");
            return (Criteria) this;
        }

        public Criteria andSordNotEqualTo(Integer value) {
            addCriterion("TDCMG.SORD <>", value, "sord");
            return (Criteria) this;
        }

        public Criteria andSordGreaterThan(Integer value) {
            addCriterion("TDCMG.SORD >", value, "sord");
            return (Criteria) this;
        }

        public Criteria andSordGreaterThanOrEqualTo(Integer value) {
            addCriterion("TDCMG.SORD >=", value, "sord");
            return (Criteria) this;
        }

        public Criteria andSordLessThan(Integer value) {
            addCriterion("TDCMG.SORD <", value, "sord");
            return (Criteria) this;
        }

        public Criteria andSordLessThanOrEqualTo(Integer value) {
            addCriterion("TDCMG.SORD <=", value, "sord");
            return (Criteria) this;
        }

        public Criteria andSordIn(List<Integer> values) {
            addCriterion("TDCMG.SORD in", values, "sord");
            return (Criteria) this;
        }

        public Criteria andSordNotIn(List<Integer> values) {
            addCriterion("TDCMG.SORD not in", values, "sord");
            return (Criteria) this;
        }

        public Criteria andSordBetween(Integer value1, Integer value2) {
            addCriterion("TDCMG.SORD between", value1, value2, "sord");
            return (Criteria) this;
        }

        public Criteria andSordNotBetween(Integer value1, Integer value2) {
            addCriterion("TDCMG.SORD not between", value1, value2, "sord");
            return (Criteria) this;
        }

        public Criteria andRegDtIsNull() {
            addCriterion("TDCMG.REG_DT is null");
            return (Criteria) this;
        }

        public Criteria andRegDtIsNotNull() {
            addCriterion("TDCMG.REG_DT is not null");
            return (Criteria) this;
        }

        public Criteria andRegDtEqualTo(Date value) {
            addCriterion("TDCMG.REG_DT =", value, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtNotEqualTo(Date value) {
            addCriterion("TDCMG.REG_DT <>", value, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtGreaterThan(Date value) {
            addCriterion("TDCMG.REG_DT >", value, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtGreaterThanOrEqualTo(Date value) {
            addCriterion("TDCMG.REG_DT >=", value, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtLessThan(Date value) {
            addCriterion("TDCMG.REG_DT <", value, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtLessThanOrEqualTo(Date value) {
            addCriterion("TDCMG.REG_DT <=", value, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtIn(List<Date> values) {
            addCriterion("TDCMG.REG_DT in", values, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtNotIn(List<Date> values) {
            addCriterion("TDCMG.REG_DT not in", values, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtBetween(Date value1, Date value2) {
            addCriterion("TDCMG.REG_DT between", value1, value2, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtNotBetween(Date value1, Date value2) {
            addCriterion("TDCMG.REG_DT not between", value1, value2, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegIdIsNull() {
            addCriterion("TDCMG.REG_ID is null");
            return (Criteria) this;
        }

        public Criteria andRegIdIsNotNull() {
            addCriterion("TDCMG.REG_ID is not null");
            return (Criteria) this;
        }

        public Criteria andRegIdEqualTo(String value) {
            addCriterion("TDCMG.REG_ID =", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdNotEqualTo(String value) {
            addCriterion("TDCMG.REG_ID <>", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdGreaterThan(String value) {
            addCriterion("TDCMG.REG_ID >", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdGreaterThanOrEqualTo(String value) {
            addCriterion("TDCMG.REG_ID >=", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdLessThan(String value) {
            addCriterion("TDCMG.REG_ID <", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdLessThanOrEqualTo(String value) {
            addCriterion("TDCMG.REG_ID <=", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdLike(String value) {
            addCriterion("TDCMG.REG_ID like", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdNotLike(String value) {
            addCriterion("TDCMG.REG_ID not like", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdIn(List<String> values) {
            addCriterion("TDCMG.REG_ID in", values, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdNotIn(List<String> values) {
            addCriterion("TDCMG.REG_ID not in", values, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdBetween(String value1, String value2) {
            addCriterion("TDCMG.REG_ID between", value1, value2, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdNotBetween(String value1, String value2) {
            addCriterion("TDCMG.REG_ID not between", value1, value2, "regId");
            return (Criteria) this;
        }

        public Criteria andDpConrCdLikeInsensitive(String value) {
            addCriterion("upper(TDCMG.DP_CONR_CD) like", value.toUpperCase(), "dpConrCd");
            return (Criteria) this;
        }

        public Criteria andMapGrpNmLikeInsensitive(String value) {
            addCriterion("upper(TDCMG.MAP_GRP_NM) like", value.toUpperCase(), "mapGrpNm");
            return (Criteria) this;
        }

        public Criteria andDpYnLikeInsensitive(String value) {
            addCriterion("upper(TDCMG.DP_YN) like", value.toUpperCase(), "dpYn");
            return (Criteria) this;
        }

        public Criteria andRegIdLikeInsensitive(String value) {
            addCriterion("upper(TDCMG.REG_ID) like", value.toUpperCase(), "regId");
            return (Criteria) this;
        }

        public Criteria andDpConrCdLikeLeft(String value) {
            addCriterion("TDCMG.DP_CONR_CD like ", "%" + value, "dpConrCd");
            return (Criteria) this;
        }

        public Criteria andDpConrCdLikeRight(String value) {
            addCriterion("TDCMG.DP_CONR_CD like ", value + "%", "dpConrCd");
            return (Criteria) this;
        }

        public Criteria andDpConrCdLikeBoth(String value) {
            addCriterion("TDCMG.DP_CONR_CD like ", "%" + value + "%", "dpConrCd");
            return (Criteria) this;
        }

        public Criteria andMapGrpNmLikeLeft(String value) {
            addCriterion("TDCMG.MAP_GRP_NM like ", "%" + value, "mapGrpNm");
            return (Criteria) this;
        }

        public Criteria andMapGrpNmLikeRight(String value) {
            addCriterion("TDCMG.MAP_GRP_NM like ", value + "%", "mapGrpNm");
            return (Criteria) this;
        }

        public Criteria andMapGrpNmLikeBoth(String value) {
            addCriterion("TDCMG.MAP_GRP_NM like ", "%" + value + "%", "mapGrpNm");
            return (Criteria) this;
        }

        public Criteria andDpYnLikeLeft(String value) {
            addCriterion("TDCMG.DP_YN like ", "%" + value, "dpYn");
            return (Criteria) this;
        }

        public Criteria andDpYnLikeRight(String value) {
            addCriterion("TDCMG.DP_YN like ", value + "%", "dpYn");
            return (Criteria) this;
        }

        public Criteria andDpYnLikeBoth(String value) {
            addCriterion("TDCMG.DP_YN like ", "%" + value + "%", "dpYn");
            return (Criteria) this;
        }

        public Criteria andRegIdLikeLeft(String value) {
            addCriterion("TDCMG.REG_ID like ", "%" + value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdLikeRight(String value) {
            addCriterion("TDCMG.REG_ID like ", value + "%", "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdLikeBoth(String value) {
            addCriterion("TDCMG.REG_ID like ", "%" + value + "%", "regId");
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