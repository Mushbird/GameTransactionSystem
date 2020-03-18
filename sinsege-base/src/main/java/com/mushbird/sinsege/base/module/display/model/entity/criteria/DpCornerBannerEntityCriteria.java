package com.mushbird.sinsege.base.module.display.model.entity.criteria;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class DpCornerBannerEntityCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    public DpCornerBannerEntityCriteria() {
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

        public Criteria andDpConrBanrIdIsNull() {
            addCriterion("TDCB.DP_CONR_BANR_ID is null");
            return (Criteria) this;
        }

        public Criteria andDpConrBanrIdIsNotNull() {
            addCriterion("TDCB.DP_CONR_BANR_ID is not null");
            return (Criteria) this;
        }

        public Criteria andDpConrBanrIdEqualTo(Integer value) {
            addCriterion("TDCB.DP_CONR_BANR_ID =", value, "dpConrBanrId");
            return (Criteria) this;
        }

        public Criteria andDpConrBanrIdNotEqualTo(Integer value) {
            addCriterion("TDCB.DP_CONR_BANR_ID <>", value, "dpConrBanrId");
            return (Criteria) this;
        }

        public Criteria andDpConrBanrIdGreaterThan(Integer value) {
            addCriterion("TDCB.DP_CONR_BANR_ID >", value, "dpConrBanrId");
            return (Criteria) this;
        }

        public Criteria andDpConrBanrIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("TDCB.DP_CONR_BANR_ID >=", value, "dpConrBanrId");
            return (Criteria) this;
        }

        public Criteria andDpConrBanrIdLessThan(Integer value) {
            addCriterion("TDCB.DP_CONR_BANR_ID <", value, "dpConrBanrId");
            return (Criteria) this;
        }

        public Criteria andDpConrBanrIdLessThanOrEqualTo(Integer value) {
            addCriterion("TDCB.DP_CONR_BANR_ID <=", value, "dpConrBanrId");
            return (Criteria) this;
        }

        public Criteria andDpConrBanrIdIn(List<Integer> values) {
            addCriterion("TDCB.DP_CONR_BANR_ID in", values, "dpConrBanrId");
            return (Criteria) this;
        }

        public Criteria andDpConrBanrIdNotIn(List<Integer> values) {
            addCriterion("TDCB.DP_CONR_BANR_ID not in", values, "dpConrBanrId");
            return (Criteria) this;
        }

        public Criteria andDpConrBanrIdBetween(Integer value1, Integer value2) {
            addCriterion("TDCB.DP_CONR_BANR_ID between", value1, value2, "dpConrBanrId");
            return (Criteria) this;
        }

        public Criteria andDpConrBanrIdNotBetween(Integer value1, Integer value2) {
            addCriterion("TDCB.DP_CONR_BANR_ID not between", value1, value2, "dpConrBanrId");
            return (Criteria) this;
        }

        public Criteria andDpConrCdIsNull() {
            addCriterion("TDCB.DP_CONR_CD is null");
            return (Criteria) this;
        }

        public Criteria andDpConrCdIsNotNull() {
            addCriterion("TDCB.DP_CONR_CD is not null");
            return (Criteria) this;
        }

        public Criteria andDpConrCdEqualTo(String value) {
            addCriterion("TDCB.DP_CONR_CD =", value, "dpConrCd");
            return (Criteria) this;
        }

        public Criteria andDpConrCdNotEqualTo(String value) {
            addCriterion("TDCB.DP_CONR_CD <>", value, "dpConrCd");
            return (Criteria) this;
        }

        public Criteria andDpConrCdGreaterThan(String value) {
            addCriterion("TDCB.DP_CONR_CD >", value, "dpConrCd");
            return (Criteria) this;
        }

        public Criteria andDpConrCdGreaterThanOrEqualTo(String value) {
            addCriterion("TDCB.DP_CONR_CD >=", value, "dpConrCd");
            return (Criteria) this;
        }

        public Criteria andDpConrCdLessThan(String value) {
            addCriterion("TDCB.DP_CONR_CD <", value, "dpConrCd");
            return (Criteria) this;
        }

        public Criteria andDpConrCdLessThanOrEqualTo(String value) {
            addCriterion("TDCB.DP_CONR_CD <=", value, "dpConrCd");
            return (Criteria) this;
        }

        public Criteria andDpConrCdLike(String value) {
            addCriterion("TDCB.DP_CONR_CD like", value, "dpConrCd");
            return (Criteria) this;
        }

        public Criteria andDpConrCdNotLike(String value) {
            addCriterion("TDCB.DP_CONR_CD not like", value, "dpConrCd");
            return (Criteria) this;
        }

        public Criteria andDpConrCdIn(List<String> values) {
            addCriterion("TDCB.DP_CONR_CD in", values, "dpConrCd");
            return (Criteria) this;
        }

        public Criteria andDpConrCdNotIn(List<String> values) {
            addCriterion("TDCB.DP_CONR_CD not in", values, "dpConrCd");
            return (Criteria) this;
        }

        public Criteria andDpConrCdBetween(String value1, String value2) {
            addCriterion("TDCB.DP_CONR_CD between", value1, value2, "dpConrCd");
            return (Criteria) this;
        }

        public Criteria andDpConrCdNotBetween(String value1, String value2) {
            addCriterion("TDCB.DP_CONR_CD not between", value1, value2, "dpConrCd");
            return (Criteria) this;
        }

        public Criteria andDpEnvCdIsNull() {
            addCriterion("TDCB.DP_ENV_CD is null");
            return (Criteria) this;
        }

        public Criteria andDpEnvCdIsNotNull() {
            addCriterion("TDCB.DP_ENV_CD is not null");
            return (Criteria) this;
        }

        public Criteria andDpEnvCdEqualTo(String value) {
            addCriterion("TDCB.DP_ENV_CD =", value, "dpEnvCd");
            return (Criteria) this;
        }

        public Criteria andDpEnvCdNotEqualTo(String value) {
            addCriterion("TDCB.DP_ENV_CD <>", value, "dpEnvCd");
            return (Criteria) this;
        }

        public Criteria andDpEnvCdGreaterThan(String value) {
            addCriterion("TDCB.DP_ENV_CD >", value, "dpEnvCd");
            return (Criteria) this;
        }

        public Criteria andDpEnvCdGreaterThanOrEqualTo(String value) {
            addCriterion("TDCB.DP_ENV_CD >=", value, "dpEnvCd");
            return (Criteria) this;
        }

        public Criteria andDpEnvCdLessThan(String value) {
            addCriterion("TDCB.DP_ENV_CD <", value, "dpEnvCd");
            return (Criteria) this;
        }

        public Criteria andDpEnvCdLessThanOrEqualTo(String value) {
            addCriterion("TDCB.DP_ENV_CD <=", value, "dpEnvCd");
            return (Criteria) this;
        }

        public Criteria andDpEnvCdLike(String value) {
            addCriterion("TDCB.DP_ENV_CD like", value, "dpEnvCd");
            return (Criteria) this;
        }

        public Criteria andDpEnvCdNotLike(String value) {
            addCriterion("TDCB.DP_ENV_CD not like", value, "dpEnvCd");
            return (Criteria) this;
        }

        public Criteria andDpEnvCdIn(List<String> values) {
            addCriterion("TDCB.DP_ENV_CD in", values, "dpEnvCd");
            return (Criteria) this;
        }

        public Criteria andDpEnvCdNotIn(List<String> values) {
            addCriterion("TDCB.DP_ENV_CD not in", values, "dpEnvCd");
            return (Criteria) this;
        }

        public Criteria andDpEnvCdBetween(String value1, String value2) {
            addCriterion("TDCB.DP_ENV_CD between", value1, value2, "dpEnvCd");
            return (Criteria) this;
        }

        public Criteria andDpEnvCdNotBetween(String value1, String value2) {
            addCriterion("TDCB.DP_ENV_CD not between", value1, value2, "dpEnvCd");
            return (Criteria) this;
        }

        public Criteria andBanrNmIsNull() {
            addCriterion("TDCB.BANR_NM is null");
            return (Criteria) this;
        }

        public Criteria andBanrNmIsNotNull() {
            addCriterion("TDCB.BANR_NM is not null");
            return (Criteria) this;
        }

        public Criteria andBanrNmEqualTo(String value) {
            addCriterion("TDCB.BANR_NM =", value, "banrNm");
            return (Criteria) this;
        }

        public Criteria andBanrNmNotEqualTo(String value) {
            addCriterion("TDCB.BANR_NM <>", value, "banrNm");
            return (Criteria) this;
        }

        public Criteria andBanrNmGreaterThan(String value) {
            addCriterion("TDCB.BANR_NM >", value, "banrNm");
            return (Criteria) this;
        }

        public Criteria andBanrNmGreaterThanOrEqualTo(String value) {
            addCriterion("TDCB.BANR_NM >=", value, "banrNm");
            return (Criteria) this;
        }

        public Criteria andBanrNmLessThan(String value) {
            addCriterion("TDCB.BANR_NM <", value, "banrNm");
            return (Criteria) this;
        }

        public Criteria andBanrNmLessThanOrEqualTo(String value) {
            addCriterion("TDCB.BANR_NM <=", value, "banrNm");
            return (Criteria) this;
        }

        public Criteria andBanrNmLike(String value) {
            addCriterion("TDCB.BANR_NM like", value, "banrNm");
            return (Criteria) this;
        }

        public Criteria andBanrNmNotLike(String value) {
            addCriterion("TDCB.BANR_NM not like", value, "banrNm");
            return (Criteria) this;
        }

        public Criteria andBanrNmIn(List<String> values) {
            addCriterion("TDCB.BANR_NM in", values, "banrNm");
            return (Criteria) this;
        }

        public Criteria andBanrNmNotIn(List<String> values) {
            addCriterion("TDCB.BANR_NM not in", values, "banrNm");
            return (Criteria) this;
        }

        public Criteria andBanrNmBetween(String value1, String value2) {
            addCriterion("TDCB.BANR_NM between", value1, value2, "banrNm");
            return (Criteria) this;
        }

        public Criteria andBanrNmNotBetween(String value1, String value2) {
            addCriterion("TDCB.BANR_NM not between", value1, value2, "banrNm");
            return (Criteria) this;
        }

        public Criteria andBanrTitPcIsNull() {
            addCriterion("TDCB.BANR_TIT_PC is null");
            return (Criteria) this;
        }

        public Criteria andBanrTitPcIsNotNull() {
            addCriterion("TDCB.BANR_TIT_PC is not null");
            return (Criteria) this;
        }

        public Criteria andBanrTitPcEqualTo(String value) {
            addCriterion("TDCB.BANR_TIT_PC =", value, "banrTitPc");
            return (Criteria) this;
        }

        public Criteria andBanrTitPcNotEqualTo(String value) {
            addCriterion("TDCB.BANR_TIT_PC <>", value, "banrTitPc");
            return (Criteria) this;
        }

        public Criteria andBanrTitPcGreaterThan(String value) {
            addCriterion("TDCB.BANR_TIT_PC >", value, "banrTitPc");
            return (Criteria) this;
        }

        public Criteria andBanrTitPcGreaterThanOrEqualTo(String value) {
            addCriterion("TDCB.BANR_TIT_PC >=", value, "banrTitPc");
            return (Criteria) this;
        }

        public Criteria andBanrTitPcLessThan(String value) {
            addCriterion("TDCB.BANR_TIT_PC <", value, "banrTitPc");
            return (Criteria) this;
        }

        public Criteria andBanrTitPcLessThanOrEqualTo(String value) {
            addCriterion("TDCB.BANR_TIT_PC <=", value, "banrTitPc");
            return (Criteria) this;
        }

        public Criteria andBanrTitPcLike(String value) {
            addCriterion("TDCB.BANR_TIT_PC like", value, "banrTitPc");
            return (Criteria) this;
        }

        public Criteria andBanrTitPcNotLike(String value) {
            addCriterion("TDCB.BANR_TIT_PC not like", value, "banrTitPc");
            return (Criteria) this;
        }

        public Criteria andBanrTitPcIn(List<String> values) {
            addCriterion("TDCB.BANR_TIT_PC in", values, "banrTitPc");
            return (Criteria) this;
        }

        public Criteria andBanrTitPcNotIn(List<String> values) {
            addCriterion("TDCB.BANR_TIT_PC not in", values, "banrTitPc");
            return (Criteria) this;
        }

        public Criteria andBanrTitPcBetween(String value1, String value2) {
            addCriterion("TDCB.BANR_TIT_PC between", value1, value2, "banrTitPc");
            return (Criteria) this;
        }

        public Criteria andBanrTitPcNotBetween(String value1, String value2) {
            addCriterion("TDCB.BANR_TIT_PC not between", value1, value2, "banrTitPc");
            return (Criteria) this;
        }

        public Criteria andBanrTitMobIsNull() {
            addCriterion("TDCB.BANR_TIT_MOB is null");
            return (Criteria) this;
        }

        public Criteria andBanrTitMobIsNotNull() {
            addCriterion("TDCB.BANR_TIT_MOB is not null");
            return (Criteria) this;
        }

        public Criteria andBanrTitMobEqualTo(String value) {
            addCriterion("TDCB.BANR_TIT_MOB =", value, "banrTitMob");
            return (Criteria) this;
        }

        public Criteria andBanrTitMobNotEqualTo(String value) {
            addCriterion("TDCB.BANR_TIT_MOB <>", value, "banrTitMob");
            return (Criteria) this;
        }

        public Criteria andBanrTitMobGreaterThan(String value) {
            addCriterion("TDCB.BANR_TIT_MOB >", value, "banrTitMob");
            return (Criteria) this;
        }

        public Criteria andBanrTitMobGreaterThanOrEqualTo(String value) {
            addCriterion("TDCB.BANR_TIT_MOB >=", value, "banrTitMob");
            return (Criteria) this;
        }

        public Criteria andBanrTitMobLessThan(String value) {
            addCriterion("TDCB.BANR_TIT_MOB <", value, "banrTitMob");
            return (Criteria) this;
        }

        public Criteria andBanrTitMobLessThanOrEqualTo(String value) {
            addCriterion("TDCB.BANR_TIT_MOB <=", value, "banrTitMob");
            return (Criteria) this;
        }

        public Criteria andBanrTitMobLike(String value) {
            addCriterion("TDCB.BANR_TIT_MOB like", value, "banrTitMob");
            return (Criteria) this;
        }

        public Criteria andBanrTitMobNotLike(String value) {
            addCriterion("TDCB.BANR_TIT_MOB not like", value, "banrTitMob");
            return (Criteria) this;
        }

        public Criteria andBanrTitMobIn(List<String> values) {
            addCriterion("TDCB.BANR_TIT_MOB in", values, "banrTitMob");
            return (Criteria) this;
        }

        public Criteria andBanrTitMobNotIn(List<String> values) {
            addCriterion("TDCB.BANR_TIT_MOB not in", values, "banrTitMob");
            return (Criteria) this;
        }

        public Criteria andBanrTitMobBetween(String value1, String value2) {
            addCriterion("TDCB.BANR_TIT_MOB between", value1, value2, "banrTitMob");
            return (Criteria) this;
        }

        public Criteria andBanrTitMobNotBetween(String value1, String value2) {
            addCriterion("TDCB.BANR_TIT_MOB not between", value1, value2, "banrTitMob");
            return (Criteria) this;
        }

        public Criteria andBanrAtchGidPcIsNull() {
            addCriterion("TDCB.BANR_ATCH_GID_PC is null");
            return (Criteria) this;
        }

        public Criteria andBanrAtchGidPcIsNotNull() {
            addCriterion("TDCB.BANR_ATCH_GID_PC is not null");
            return (Criteria) this;
        }

        public Criteria andBanrAtchGidPcEqualTo(Integer value) {
            addCriterion("TDCB.BANR_ATCH_GID_PC =", value, "banrAtchGidPc");
            return (Criteria) this;
        }

        public Criteria andBanrAtchGidPcNotEqualTo(Integer value) {
            addCriterion("TDCB.BANR_ATCH_GID_PC <>", value, "banrAtchGidPc");
            return (Criteria) this;
        }

        public Criteria andBanrAtchGidPcGreaterThan(Integer value) {
            addCriterion("TDCB.BANR_ATCH_GID_PC >", value, "banrAtchGidPc");
            return (Criteria) this;
        }

        public Criteria andBanrAtchGidPcGreaterThanOrEqualTo(Integer value) {
            addCriterion("TDCB.BANR_ATCH_GID_PC >=", value, "banrAtchGidPc");
            return (Criteria) this;
        }

        public Criteria andBanrAtchGidPcLessThan(Integer value) {
            addCriterion("TDCB.BANR_ATCH_GID_PC <", value, "banrAtchGidPc");
            return (Criteria) this;
        }

        public Criteria andBanrAtchGidPcLessThanOrEqualTo(Integer value) {
            addCriterion("TDCB.BANR_ATCH_GID_PC <=", value, "banrAtchGidPc");
            return (Criteria) this;
        }

        public Criteria andBanrAtchGidPcIn(List<Integer> values) {
            addCriterion("TDCB.BANR_ATCH_GID_PC in", values, "banrAtchGidPc");
            return (Criteria) this;
        }

        public Criteria andBanrAtchGidPcNotIn(List<Integer> values) {
            addCriterion("TDCB.BANR_ATCH_GID_PC not in", values, "banrAtchGidPc");
            return (Criteria) this;
        }

        public Criteria andBanrAtchGidPcBetween(Integer value1, Integer value2) {
            addCriterion("TDCB.BANR_ATCH_GID_PC between", value1, value2, "banrAtchGidPc");
            return (Criteria) this;
        }

        public Criteria andBanrAtchGidPcNotBetween(Integer value1, Integer value2) {
            addCriterion("TDCB.BANR_ATCH_GID_PC not between", value1, value2, "banrAtchGidPc");
            return (Criteria) this;
        }

        public Criteria andBanrAtchGidMobIsNull() {
            addCriterion("TDCB.BANR_ATCH_GID_MOB is null");
            return (Criteria) this;
        }

        public Criteria andBanrAtchGidMobIsNotNull() {
            addCriterion("TDCB.BANR_ATCH_GID_MOB is not null");
            return (Criteria) this;
        }

        public Criteria andBanrAtchGidMobEqualTo(Integer value) {
            addCriterion("TDCB.BANR_ATCH_GID_MOB =", value, "banrAtchGidMob");
            return (Criteria) this;
        }

        public Criteria andBanrAtchGidMobNotEqualTo(Integer value) {
            addCriterion("TDCB.BANR_ATCH_GID_MOB <>", value, "banrAtchGidMob");
            return (Criteria) this;
        }

        public Criteria andBanrAtchGidMobGreaterThan(Integer value) {
            addCriterion("TDCB.BANR_ATCH_GID_MOB >", value, "banrAtchGidMob");
            return (Criteria) this;
        }

        public Criteria andBanrAtchGidMobGreaterThanOrEqualTo(Integer value) {
            addCriterion("TDCB.BANR_ATCH_GID_MOB >=", value, "banrAtchGidMob");
            return (Criteria) this;
        }

        public Criteria andBanrAtchGidMobLessThan(Integer value) {
            addCriterion("TDCB.BANR_ATCH_GID_MOB <", value, "banrAtchGidMob");
            return (Criteria) this;
        }

        public Criteria andBanrAtchGidMobLessThanOrEqualTo(Integer value) {
            addCriterion("TDCB.BANR_ATCH_GID_MOB <=", value, "banrAtchGidMob");
            return (Criteria) this;
        }

        public Criteria andBanrAtchGidMobIn(List<Integer> values) {
            addCriterion("TDCB.BANR_ATCH_GID_MOB in", values, "banrAtchGidMob");
            return (Criteria) this;
        }

        public Criteria andBanrAtchGidMobNotIn(List<Integer> values) {
            addCriterion("TDCB.BANR_ATCH_GID_MOB not in", values, "banrAtchGidMob");
            return (Criteria) this;
        }

        public Criteria andBanrAtchGidMobBetween(Integer value1, Integer value2) {
            addCriterion("TDCB.BANR_ATCH_GID_MOB between", value1, value2, "banrAtchGidMob");
            return (Criteria) this;
        }

        public Criteria andBanrAtchGidMobNotBetween(Integer value1, Integer value2) {
            addCriterion("TDCB.BANR_ATCH_GID_MOB not between", value1, value2, "banrAtchGidMob");
            return (Criteria) this;
        }

        public Criteria andBgColorValIsNull() {
            addCriterion("TDCB.BG_COLOR_VAL is null");
            return (Criteria) this;
        }

        public Criteria andBgColorValIsNotNull() {
            addCriterion("TDCB.BG_COLOR_VAL is not null");
            return (Criteria) this;
        }

        public Criteria andBgColorValEqualTo(String value) {
            addCriterion("TDCB.BG_COLOR_VAL =", value, "bgColorVal");
            return (Criteria) this;
        }

        public Criteria andBgColorValNotEqualTo(String value) {
            addCriterion("TDCB.BG_COLOR_VAL <>", value, "bgColorVal");
            return (Criteria) this;
        }

        public Criteria andBgColorValGreaterThan(String value) {
            addCriterion("TDCB.BG_COLOR_VAL >", value, "bgColorVal");
            return (Criteria) this;
        }

        public Criteria andBgColorValGreaterThanOrEqualTo(String value) {
            addCriterion("TDCB.BG_COLOR_VAL >=", value, "bgColorVal");
            return (Criteria) this;
        }

        public Criteria andBgColorValLessThan(String value) {
            addCriterion("TDCB.BG_COLOR_VAL <", value, "bgColorVal");
            return (Criteria) this;
        }

        public Criteria andBgColorValLessThanOrEqualTo(String value) {
            addCriterion("TDCB.BG_COLOR_VAL <=", value, "bgColorVal");
            return (Criteria) this;
        }

        public Criteria andBgColorValLike(String value) {
            addCriterion("TDCB.BG_COLOR_VAL like", value, "bgColorVal");
            return (Criteria) this;
        }

        public Criteria andBgColorValNotLike(String value) {
            addCriterion("TDCB.BG_COLOR_VAL not like", value, "bgColorVal");
            return (Criteria) this;
        }

        public Criteria andBgColorValIn(List<String> values) {
            addCriterion("TDCB.BG_COLOR_VAL in", values, "bgColorVal");
            return (Criteria) this;
        }

        public Criteria andBgColorValNotIn(List<String> values) {
            addCriterion("TDCB.BG_COLOR_VAL not in", values, "bgColorVal");
            return (Criteria) this;
        }

        public Criteria andBgColorValBetween(String value1, String value2) {
            addCriterion("TDCB.BG_COLOR_VAL between", value1, value2, "bgColorVal");
            return (Criteria) this;
        }

        public Criteria andBgColorValNotBetween(String value1, String value2) {
            addCriterion("TDCB.BG_COLOR_VAL not between", value1, value2, "bgColorVal");
            return (Criteria) this;
        }

        public Criteria andLinkUrlAddrIsNull() {
            addCriterion("TDCB.LINK_URL_ADDR is null");
            return (Criteria) this;
        }

        public Criteria andLinkUrlAddrIsNotNull() {
            addCriterion("TDCB.LINK_URL_ADDR is not null");
            return (Criteria) this;
        }

        public Criteria andLinkUrlAddrEqualTo(String value) {
            addCriterion("TDCB.LINK_URL_ADDR =", value, "linkUrlAddr");
            return (Criteria) this;
        }

        public Criteria andLinkUrlAddrNotEqualTo(String value) {
            addCriterion("TDCB.LINK_URL_ADDR <>", value, "linkUrlAddr");
            return (Criteria) this;
        }

        public Criteria andLinkUrlAddrGreaterThan(String value) {
            addCriterion("TDCB.LINK_URL_ADDR >", value, "linkUrlAddr");
            return (Criteria) this;
        }

        public Criteria andLinkUrlAddrGreaterThanOrEqualTo(String value) {
            addCriterion("TDCB.LINK_URL_ADDR >=", value, "linkUrlAddr");
            return (Criteria) this;
        }

        public Criteria andLinkUrlAddrLessThan(String value) {
            addCriterion("TDCB.LINK_URL_ADDR <", value, "linkUrlAddr");
            return (Criteria) this;
        }

        public Criteria andLinkUrlAddrLessThanOrEqualTo(String value) {
            addCriterion("TDCB.LINK_URL_ADDR <=", value, "linkUrlAddr");
            return (Criteria) this;
        }

        public Criteria andLinkUrlAddrLike(String value) {
            addCriterion("TDCB.LINK_URL_ADDR like", value, "linkUrlAddr");
            return (Criteria) this;
        }

        public Criteria andLinkUrlAddrNotLike(String value) {
            addCriterion("TDCB.LINK_URL_ADDR not like", value, "linkUrlAddr");
            return (Criteria) this;
        }

        public Criteria andLinkUrlAddrIn(List<String> values) {
            addCriterion("TDCB.LINK_URL_ADDR in", values, "linkUrlAddr");
            return (Criteria) this;
        }

        public Criteria andLinkUrlAddrNotIn(List<String> values) {
            addCriterion("TDCB.LINK_URL_ADDR not in", values, "linkUrlAddr");
            return (Criteria) this;
        }

        public Criteria andLinkUrlAddrBetween(String value1, String value2) {
            addCriterion("TDCB.LINK_URL_ADDR between", value1, value2, "linkUrlAddr");
            return (Criteria) this;
        }

        public Criteria andLinkUrlAddrNotBetween(String value1, String value2) {
            addCriterion("TDCB.LINK_URL_ADDR not between", value1, value2, "linkUrlAddr");
            return (Criteria) this;
        }

        public Criteria andLinkNwinYnIsNull() {
            addCriterion("TDCB.LINK_NWIN_YN is null");
            return (Criteria) this;
        }

        public Criteria andLinkNwinYnIsNotNull() {
            addCriterion("TDCB.LINK_NWIN_YN is not null");
            return (Criteria) this;
        }

        public Criteria andLinkNwinYnEqualTo(String value) {
            addCriterion("TDCB.LINK_NWIN_YN =", value, "linkNwinYn");
            return (Criteria) this;
        }

        public Criteria andLinkNwinYnNotEqualTo(String value) {
            addCriterion("TDCB.LINK_NWIN_YN <>", value, "linkNwinYn");
            return (Criteria) this;
        }

        public Criteria andLinkNwinYnGreaterThan(String value) {
            addCriterion("TDCB.LINK_NWIN_YN >", value, "linkNwinYn");
            return (Criteria) this;
        }

        public Criteria andLinkNwinYnGreaterThanOrEqualTo(String value) {
            addCriterion("TDCB.LINK_NWIN_YN >=", value, "linkNwinYn");
            return (Criteria) this;
        }

        public Criteria andLinkNwinYnLessThan(String value) {
            addCriterion("TDCB.LINK_NWIN_YN <", value, "linkNwinYn");
            return (Criteria) this;
        }

        public Criteria andLinkNwinYnLessThanOrEqualTo(String value) {
            addCriterion("TDCB.LINK_NWIN_YN <=", value, "linkNwinYn");
            return (Criteria) this;
        }

        public Criteria andLinkNwinYnLike(String value) {
            addCriterion("TDCB.LINK_NWIN_YN like", value, "linkNwinYn");
            return (Criteria) this;
        }

        public Criteria andLinkNwinYnNotLike(String value) {
            addCriterion("TDCB.LINK_NWIN_YN not like", value, "linkNwinYn");
            return (Criteria) this;
        }

        public Criteria andLinkNwinYnIn(List<String> values) {
            addCriterion("TDCB.LINK_NWIN_YN in", values, "linkNwinYn");
            return (Criteria) this;
        }

        public Criteria andLinkNwinYnNotIn(List<String> values) {
            addCriterion("TDCB.LINK_NWIN_YN not in", values, "linkNwinYn");
            return (Criteria) this;
        }

        public Criteria andLinkNwinYnBetween(String value1, String value2) {
            addCriterion("TDCB.LINK_NWIN_YN between", value1, value2, "linkNwinYn");
            return (Criteria) this;
        }

        public Criteria andLinkNwinYnNotBetween(String value1, String value2) {
            addCriterion("TDCB.LINK_NWIN_YN not between", value1, value2, "linkNwinYn");
            return (Criteria) this;
        }

        public Criteria andKwdValIsNull() {
            addCriterion("TDCB.KWD_VAL is null");
            return (Criteria) this;
        }

        public Criteria andKwdValIsNotNull() {
            addCriterion("TDCB.KWD_VAL is not null");
            return (Criteria) this;
        }

        public Criteria andKwdValEqualTo(String value) {
            addCriterion("TDCB.KWD_VAL =", value, "kwdVal");
            return (Criteria) this;
        }

        public Criteria andKwdValNotEqualTo(String value) {
            addCriterion("TDCB.KWD_VAL <>", value, "kwdVal");
            return (Criteria) this;
        }

        public Criteria andKwdValGreaterThan(String value) {
            addCriterion("TDCB.KWD_VAL >", value, "kwdVal");
            return (Criteria) this;
        }

        public Criteria andKwdValGreaterThanOrEqualTo(String value) {
            addCriterion("TDCB.KWD_VAL >=", value, "kwdVal");
            return (Criteria) this;
        }

        public Criteria andKwdValLessThan(String value) {
            addCriterion("TDCB.KWD_VAL <", value, "kwdVal");
            return (Criteria) this;
        }

        public Criteria andKwdValLessThanOrEqualTo(String value) {
            addCriterion("TDCB.KWD_VAL <=", value, "kwdVal");
            return (Criteria) this;
        }

        public Criteria andKwdValLike(String value) {
            addCriterion("TDCB.KWD_VAL like", value, "kwdVal");
            return (Criteria) this;
        }

        public Criteria andKwdValNotLike(String value) {
            addCriterion("TDCB.KWD_VAL not like", value, "kwdVal");
            return (Criteria) this;
        }

        public Criteria andKwdValIn(List<String> values) {
            addCriterion("TDCB.KWD_VAL in", values, "kwdVal");
            return (Criteria) this;
        }

        public Criteria andKwdValNotIn(List<String> values) {
            addCriterion("TDCB.KWD_VAL not in", values, "kwdVal");
            return (Criteria) this;
        }

        public Criteria andKwdValBetween(String value1, String value2) {
            addCriterion("TDCB.KWD_VAL between", value1, value2, "kwdVal");
            return (Criteria) this;
        }

        public Criteria andKwdValNotBetween(String value1, String value2) {
            addCriterion("TDCB.KWD_VAL not between", value1, value2, "kwdVal");
            return (Criteria) this;
        }

        public Criteria andDpStDtIsNull() {
            addCriterion("TDCB.DP_ST_DT is null");
            return (Criteria) this;
        }

        public Criteria andDpStDtIsNotNull() {
            addCriterion("TDCB.DP_ST_DT is not null");
            return (Criteria) this;
        }

        public Criteria andDpStDtEqualTo(Date value) {
            addCriterionForJDBCDate("TDCB.DP_ST_DT =", value, "dpStDt");
            return (Criteria) this;
        }

        public Criteria andDpStDtNotEqualTo(Date value) {
            addCriterionForJDBCDate("TDCB.DP_ST_DT <>", value, "dpStDt");
            return (Criteria) this;
        }

        public Criteria andDpStDtGreaterThan(Date value) {
            addCriterionForJDBCDate("TDCB.DP_ST_DT >", value, "dpStDt");
            return (Criteria) this;
        }

        public Criteria andDpStDtGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("TDCB.DP_ST_DT >=", value, "dpStDt");
            return (Criteria) this;
        }

        public Criteria andDpStDtLessThan(Date value) {
            addCriterionForJDBCDate("TDCB.DP_ST_DT <", value, "dpStDt");
            return (Criteria) this;
        }

        public Criteria andDpStDtLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("TDCB.DP_ST_DT <=", value, "dpStDt");
            return (Criteria) this;
        }

        public Criteria andDpStDtIn(List<Date> values) {
            addCriterionForJDBCDate("TDCB.DP_ST_DT in", values, "dpStDt");
            return (Criteria) this;
        }

        public Criteria andDpStDtNotIn(List<Date> values) {
            addCriterionForJDBCDate("TDCB.DP_ST_DT not in", values, "dpStDt");
            return (Criteria) this;
        }

        public Criteria andDpStDtBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("TDCB.DP_ST_DT between", value1, value2, "dpStDt");
            return (Criteria) this;
        }

        public Criteria andDpStDtNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("TDCB.DP_ST_DT not between", value1, value2, "dpStDt");
            return (Criteria) this;
        }

        public Criteria andDpEdDtIsNull() {
            addCriterion("TDCB.DP_ED_DT is null");
            return (Criteria) this;
        }

        public Criteria andDpEdDtIsNotNull() {
            addCriterion("TDCB.DP_ED_DT is not null");
            return (Criteria) this;
        }

        public Criteria andDpEdDtEqualTo(Date value) {
            addCriterionForJDBCDate("TDCB.DP_ED_DT =", value, "dpEdDt");
            return (Criteria) this;
        }

        public Criteria andDpEdDtNotEqualTo(Date value) {
            addCriterionForJDBCDate("TDCB.DP_ED_DT <>", value, "dpEdDt");
            return (Criteria) this;
        }

        public Criteria andDpEdDtGreaterThan(Date value) {
            addCriterionForJDBCDate("TDCB.DP_ED_DT >", value, "dpEdDt");
            return (Criteria) this;
        }

        public Criteria andDpEdDtGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("TDCB.DP_ED_DT >=", value, "dpEdDt");
            return (Criteria) this;
        }

        public Criteria andDpEdDtLessThan(Date value) {
            addCriterionForJDBCDate("TDCB.DP_ED_DT <", value, "dpEdDt");
            return (Criteria) this;
        }

        public Criteria andDpEdDtLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("TDCB.DP_ED_DT <=", value, "dpEdDt");
            return (Criteria) this;
        }

        public Criteria andDpEdDtIn(List<Date> values) {
            addCriterionForJDBCDate("TDCB.DP_ED_DT in", values, "dpEdDt");
            return (Criteria) this;
        }

        public Criteria andDpEdDtNotIn(List<Date> values) {
            addCriterionForJDBCDate("TDCB.DP_ED_DT not in", values, "dpEdDt");
            return (Criteria) this;
        }

        public Criteria andDpEdDtBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("TDCB.DP_ED_DT between", value1, value2, "dpEdDt");
            return (Criteria) this;
        }

        public Criteria andDpEdDtNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("TDCB.DP_ED_DT not between", value1, value2, "dpEdDt");
            return (Criteria) this;
        }

        public Criteria andDpYnIsNull() {
            addCriterion("TDCB.DP_YN is null");
            return (Criteria) this;
        }

        public Criteria andDpYnIsNotNull() {
            addCriterion("TDCB.DP_YN is not null");
            return (Criteria) this;
        }

        public Criteria andDpYnEqualTo(String value) {
            addCriterion("TDCB.DP_YN =", value, "dpYn");
            return (Criteria) this;
        }

        public Criteria andDpYnNotEqualTo(String value) {
            addCriterion("TDCB.DP_YN <>", value, "dpYn");
            return (Criteria) this;
        }

        public Criteria andDpYnGreaterThan(String value) {
            addCriterion("TDCB.DP_YN >", value, "dpYn");
            return (Criteria) this;
        }

        public Criteria andDpYnGreaterThanOrEqualTo(String value) {
            addCriterion("TDCB.DP_YN >=", value, "dpYn");
            return (Criteria) this;
        }

        public Criteria andDpYnLessThan(String value) {
            addCriterion("TDCB.DP_YN <", value, "dpYn");
            return (Criteria) this;
        }

        public Criteria andDpYnLessThanOrEqualTo(String value) {
            addCriterion("TDCB.DP_YN <=", value, "dpYn");
            return (Criteria) this;
        }

        public Criteria andDpYnLike(String value) {
            addCriterion("TDCB.DP_YN like", value, "dpYn");
            return (Criteria) this;
        }

        public Criteria andDpYnNotLike(String value) {
            addCriterion("TDCB.DP_YN not like", value, "dpYn");
            return (Criteria) this;
        }

        public Criteria andDpYnIn(List<String> values) {
            addCriterion("TDCB.DP_YN in", values, "dpYn");
            return (Criteria) this;
        }

        public Criteria andDpYnNotIn(List<String> values) {
            addCriterion("TDCB.DP_YN not in", values, "dpYn");
            return (Criteria) this;
        }

        public Criteria andDpYnBetween(String value1, String value2) {
            addCriterion("TDCB.DP_YN between", value1, value2, "dpYn");
            return (Criteria) this;
        }

        public Criteria andDpYnNotBetween(String value1, String value2) {
            addCriterion("TDCB.DP_YN not between", value1, value2, "dpYn");
            return (Criteria) this;
        }

        public Criteria andSordIsNull() {
            addCriterion("TDCB.SORD is null");
            return (Criteria) this;
        }

        public Criteria andSordIsNotNull() {
            addCriterion("TDCB.SORD is not null");
            return (Criteria) this;
        }

        public Criteria andSordEqualTo(Integer value) {
            addCriterion("TDCB.SORD =", value, "sord");
            return (Criteria) this;
        }

        public Criteria andSordNotEqualTo(Integer value) {
            addCriterion("TDCB.SORD <>", value, "sord");
            return (Criteria) this;
        }

        public Criteria andSordGreaterThan(Integer value) {
            addCriterion("TDCB.SORD >", value, "sord");
            return (Criteria) this;
        }

        public Criteria andSordGreaterThanOrEqualTo(Integer value) {
            addCriterion("TDCB.SORD >=", value, "sord");
            return (Criteria) this;
        }

        public Criteria andSordLessThan(Integer value) {
            addCriterion("TDCB.SORD <", value, "sord");
            return (Criteria) this;
        }

        public Criteria andSordLessThanOrEqualTo(Integer value) {
            addCriterion("TDCB.SORD <=", value, "sord");
            return (Criteria) this;
        }

        public Criteria andSordIn(List<Integer> values) {
            addCriterion("TDCB.SORD in", values, "sord");
            return (Criteria) this;
        }

        public Criteria andSordNotIn(List<Integer> values) {
            addCriterion("TDCB.SORD not in", values, "sord");
            return (Criteria) this;
        }

        public Criteria andSordBetween(Integer value1, Integer value2) {
            addCriterion("TDCB.SORD between", value1, value2, "sord");
            return (Criteria) this;
        }

        public Criteria andSordNotBetween(Integer value1, Integer value2) {
            addCriterion("TDCB.SORD not between", value1, value2, "sord");
            return (Criteria) this;
        }

        public Criteria andRegDtIsNull() {
            addCriterion("TDCB.REG_DT is null");
            return (Criteria) this;
        }

        public Criteria andRegDtIsNotNull() {
            addCriterion("TDCB.REG_DT is not null");
            return (Criteria) this;
        }

        public Criteria andRegDtEqualTo(Date value) {
            addCriterion("TDCB.REG_DT =", value, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtNotEqualTo(Date value) {
            addCriterion("TDCB.REG_DT <>", value, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtGreaterThan(Date value) {
            addCriterion("TDCB.REG_DT >", value, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtGreaterThanOrEqualTo(Date value) {
            addCriterion("TDCB.REG_DT >=", value, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtLessThan(Date value) {
            addCriterion("TDCB.REG_DT <", value, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtLessThanOrEqualTo(Date value) {
            addCriterion("TDCB.REG_DT <=", value, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtIn(List<Date> values) {
            addCriterion("TDCB.REG_DT in", values, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtNotIn(List<Date> values) {
            addCriterion("TDCB.REG_DT not in", values, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtBetween(Date value1, Date value2) {
            addCriterion("TDCB.REG_DT between", value1, value2, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtNotBetween(Date value1, Date value2) {
            addCriterion("TDCB.REG_DT not between", value1, value2, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegIdIsNull() {
            addCriterion("TDCB.REG_ID is null");
            return (Criteria) this;
        }

        public Criteria andRegIdIsNotNull() {
            addCriterion("TDCB.REG_ID is not null");
            return (Criteria) this;
        }

        public Criteria andRegIdEqualTo(String value) {
            addCriterion("TDCB.REG_ID =", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdNotEqualTo(String value) {
            addCriterion("TDCB.REG_ID <>", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdGreaterThan(String value) {
            addCriterion("TDCB.REG_ID >", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdGreaterThanOrEqualTo(String value) {
            addCriterion("TDCB.REG_ID >=", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdLessThan(String value) {
            addCriterion("TDCB.REG_ID <", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdLessThanOrEqualTo(String value) {
            addCriterion("TDCB.REG_ID <=", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdLike(String value) {
            addCriterion("TDCB.REG_ID like", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdNotLike(String value) {
            addCriterion("TDCB.REG_ID not like", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdIn(List<String> values) {
            addCriterion("TDCB.REG_ID in", values, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdNotIn(List<String> values) {
            addCriterion("TDCB.REG_ID not in", values, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdBetween(String value1, String value2) {
            addCriterion("TDCB.REG_ID between", value1, value2, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdNotBetween(String value1, String value2) {
            addCriterion("TDCB.REG_ID not between", value1, value2, "regId");
            return (Criteria) this;
        }

        public Criteria andModDtIsNull() {
            addCriterion("TDCB.MOD_DT is null");
            return (Criteria) this;
        }

        public Criteria andModDtIsNotNull() {
            addCriterion("TDCB.MOD_DT is not null");
            return (Criteria) this;
        }

        public Criteria andModDtEqualTo(Date value) {
            addCriterion("TDCB.MOD_DT =", value, "modDt");
            return (Criteria) this;
        }

        public Criteria andModDtNotEqualTo(Date value) {
            addCriterion("TDCB.MOD_DT <>", value, "modDt");
            return (Criteria) this;
        }

        public Criteria andModDtGreaterThan(Date value) {
            addCriterion("TDCB.MOD_DT >", value, "modDt");
            return (Criteria) this;
        }

        public Criteria andModDtGreaterThanOrEqualTo(Date value) {
            addCriterion("TDCB.MOD_DT >=", value, "modDt");
            return (Criteria) this;
        }

        public Criteria andModDtLessThan(Date value) {
            addCriterion("TDCB.MOD_DT <", value, "modDt");
            return (Criteria) this;
        }

        public Criteria andModDtLessThanOrEqualTo(Date value) {
            addCriterion("TDCB.MOD_DT <=", value, "modDt");
            return (Criteria) this;
        }

        public Criteria andModDtIn(List<Date> values) {
            addCriterion("TDCB.MOD_DT in", values, "modDt");
            return (Criteria) this;
        }

        public Criteria andModDtNotIn(List<Date> values) {
            addCriterion("TDCB.MOD_DT not in", values, "modDt");
            return (Criteria) this;
        }

        public Criteria andModDtBetween(Date value1, Date value2) {
            addCriterion("TDCB.MOD_DT between", value1, value2, "modDt");
            return (Criteria) this;
        }

        public Criteria andModDtNotBetween(Date value1, Date value2) {
            addCriterion("TDCB.MOD_DT not between", value1, value2, "modDt");
            return (Criteria) this;
        }

        public Criteria andModIdIsNull() {
            addCriterion("TDCB.MOD_ID is null");
            return (Criteria) this;
        }

        public Criteria andModIdIsNotNull() {
            addCriterion("TDCB.MOD_ID is not null");
            return (Criteria) this;
        }

        public Criteria andModIdEqualTo(String value) {
            addCriterion("TDCB.MOD_ID =", value, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdNotEqualTo(String value) {
            addCriterion("TDCB.MOD_ID <>", value, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdGreaterThan(String value) {
            addCriterion("TDCB.MOD_ID >", value, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdGreaterThanOrEqualTo(String value) {
            addCriterion("TDCB.MOD_ID >=", value, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdLessThan(String value) {
            addCriterion("TDCB.MOD_ID <", value, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdLessThanOrEqualTo(String value) {
            addCriterion("TDCB.MOD_ID <=", value, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdLike(String value) {
            addCriterion("TDCB.MOD_ID like", value, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdNotLike(String value) {
            addCriterion("TDCB.MOD_ID not like", value, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdIn(List<String> values) {
            addCriterion("TDCB.MOD_ID in", values, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdNotIn(List<String> values) {
            addCriterion("TDCB.MOD_ID not in", values, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdBetween(String value1, String value2) {
            addCriterion("TDCB.MOD_ID between", value1, value2, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdNotBetween(String value1, String value2) {
            addCriterion("TDCB.MOD_ID not between", value1, value2, "modId");
            return (Criteria) this;
        }

        public Criteria andUseYnIsNull() {
            addCriterion("TDCB.USE_YN is null");
            return (Criteria) this;
        }

        public Criteria andUseYnIsNotNull() {
            addCriterion("TDCB.USE_YN is not null");
            return (Criteria) this;
        }

        public Criteria andUseYnEqualTo(String value) {
            addCriterion("TDCB.USE_YN =", value, "useYn");
            return (Criteria) this;
        }

        public Criteria andUseYnNotEqualTo(String value) {
            addCriterion("TDCB.USE_YN <>", value, "useYn");
            return (Criteria) this;
        }

        public Criteria andUseYnGreaterThan(String value) {
            addCriterion("TDCB.USE_YN >", value, "useYn");
            return (Criteria) this;
        }

        public Criteria andUseYnGreaterThanOrEqualTo(String value) {
            addCriterion("TDCB.USE_YN >=", value, "useYn");
            return (Criteria) this;
        }

        public Criteria andUseYnLessThan(String value) {
            addCriterion("TDCB.USE_YN <", value, "useYn");
            return (Criteria) this;
        }

        public Criteria andUseYnLessThanOrEqualTo(String value) {
            addCriterion("TDCB.USE_YN <=", value, "useYn");
            return (Criteria) this;
        }

        public Criteria andUseYnLike(String value) {
            addCriterion("TDCB.USE_YN like", value, "useYn");
            return (Criteria) this;
        }

        public Criteria andUseYnNotLike(String value) {
            addCriterion("TDCB.USE_YN not like", value, "useYn");
            return (Criteria) this;
        }

        public Criteria andUseYnIn(List<String> values) {
            addCriterion("TDCB.USE_YN in", values, "useYn");
            return (Criteria) this;
        }

        public Criteria andUseYnNotIn(List<String> values) {
            addCriterion("TDCB.USE_YN not in", values, "useYn");
            return (Criteria) this;
        }

        public Criteria andUseYnBetween(String value1, String value2) {
            addCriterion("TDCB.USE_YN between", value1, value2, "useYn");
            return (Criteria) this;
        }

        public Criteria andUseYnNotBetween(String value1, String value2) {
            addCriterion("TDCB.USE_YN not between", value1, value2, "useYn");
            return (Criteria) this;
        }

        public Criteria andDpConrCdLikeInsensitive(String value) {
            addCriterion("upper(TDCB.DP_CONR_CD) like", value.toUpperCase(), "dpConrCd");
            return (Criteria) this;
        }

        public Criteria andDpEnvCdLikeInsensitive(String value) {
            addCriterion("upper(TDCB.DP_ENV_CD) like", value.toUpperCase(), "dpEnvCd");
            return (Criteria) this;
        }

        public Criteria andBanrNmLikeInsensitive(String value) {
            addCriterion("upper(TDCB.BANR_NM) like", value.toUpperCase(), "banrNm");
            return (Criteria) this;
        }

        public Criteria andBanrTitPcLikeInsensitive(String value) {
            addCriterion("upper(TDCB.BANR_TIT_PC) like", value.toUpperCase(), "banrTitPc");
            return (Criteria) this;
        }

        public Criteria andBanrTitMobLikeInsensitive(String value) {
            addCriterion("upper(TDCB.BANR_TIT_MOB) like", value.toUpperCase(), "banrTitMob");
            return (Criteria) this;
        }

        public Criteria andBgColorValLikeInsensitive(String value) {
            addCriterion("upper(TDCB.BG_COLOR_VAL) like", value.toUpperCase(), "bgColorVal");
            return (Criteria) this;
        }

        public Criteria andLinkUrlAddrLikeInsensitive(String value) {
            addCriterion("upper(TDCB.LINK_URL_ADDR) like", value.toUpperCase(), "linkUrlAddr");
            return (Criteria) this;
        }

        public Criteria andLinkNwinYnLikeInsensitive(String value) {
            addCriterion("upper(TDCB.LINK_NWIN_YN) like", value.toUpperCase(), "linkNwinYn");
            return (Criteria) this;
        }

        public Criteria andKwdValLikeInsensitive(String value) {
            addCriterion("upper(TDCB.KWD_VAL) like", value.toUpperCase(), "kwdVal");
            return (Criteria) this;
        }

        public Criteria andDpYnLikeInsensitive(String value) {
            addCriterion("upper(TDCB.DP_YN) like", value.toUpperCase(), "dpYn");
            return (Criteria) this;
        }

        public Criteria andRegIdLikeInsensitive(String value) {
            addCriterion("upper(TDCB.REG_ID) like", value.toUpperCase(), "regId");
            return (Criteria) this;
        }

        public Criteria andModIdLikeInsensitive(String value) {
            addCriterion("upper(TDCB.MOD_ID) like", value.toUpperCase(), "modId");
            return (Criteria) this;
        }

        public Criteria andUseYnLikeInsensitive(String value) {
            addCriterion("upper(TDCB.USE_YN) like", value.toUpperCase(), "useYn");
            return (Criteria) this;
        }

        public Criteria andDpConrCdLikeLeft(String value) {
            addCriterion("TDCB.DP_CONR_CD like ", "%" + value, "dpConrCd");
            return (Criteria) this;
        }

        public Criteria andDpConrCdLikeRight(String value) {
            addCriterion("TDCB.DP_CONR_CD like ", value + "%", "dpConrCd");
            return (Criteria) this;
        }

        public Criteria andDpConrCdLikeBoth(String value) {
            addCriterion("TDCB.DP_CONR_CD like ", "%" + value + "%", "dpConrCd");
            return (Criteria) this;
        }

        public Criteria andDpEnvCdLikeLeft(String value) {
            addCriterion("TDCB.DP_ENV_CD like ", "%" + value, "dpEnvCd");
            return (Criteria) this;
        }

        public Criteria andDpEnvCdLikeRight(String value) {
            addCriterion("TDCB.DP_ENV_CD like ", value + "%", "dpEnvCd");
            return (Criteria) this;
        }

        public Criteria andDpEnvCdLikeBoth(String value) {
            addCriterion("TDCB.DP_ENV_CD like ", "%" + value + "%", "dpEnvCd");
            return (Criteria) this;
        }

        public Criteria andBanrNmLikeLeft(String value) {
            addCriterion("TDCB.BANR_NM like ", "%" + value, "banrNm");
            return (Criteria) this;
        }

        public Criteria andBanrNmLikeRight(String value) {
            addCriterion("TDCB.BANR_NM like ", value + "%", "banrNm");
            return (Criteria) this;
        }

        public Criteria andBanrNmLikeBoth(String value) {
            addCriterion("TDCB.BANR_NM like ", "%" + value + "%", "banrNm");
            return (Criteria) this;
        }

        public Criteria andBanrTitPcLikeLeft(String value) {
            addCriterion("TDCB.BANR_TIT_PC like ", "%" + value, "banrTitPc");
            return (Criteria) this;
        }

        public Criteria andBanrTitPcLikeRight(String value) {
            addCriterion("TDCB.BANR_TIT_PC like ", value + "%", "banrTitPc");
            return (Criteria) this;
        }

        public Criteria andBanrTitPcLikeBoth(String value) {
            addCriterion("TDCB.BANR_TIT_PC like ", "%" + value + "%", "banrTitPc");
            return (Criteria) this;
        }

        public Criteria andBanrTitMobLikeLeft(String value) {
            addCriterion("TDCB.BANR_TIT_MOB like ", "%" + value, "banrTitMob");
            return (Criteria) this;
        }

        public Criteria andBanrTitMobLikeRight(String value) {
            addCriterion("TDCB.BANR_TIT_MOB like ", value + "%", "banrTitMob");
            return (Criteria) this;
        }

        public Criteria andBanrTitMobLikeBoth(String value) {
            addCriterion("TDCB.BANR_TIT_MOB like ", "%" + value + "%", "banrTitMob");
            return (Criteria) this;
        }

        public Criteria andBgColorValLikeLeft(String value) {
            addCriterion("TDCB.BG_COLOR_VAL like ", "%" + value, "bgColorVal");
            return (Criteria) this;
        }

        public Criteria andBgColorValLikeRight(String value) {
            addCriterion("TDCB.BG_COLOR_VAL like ", value + "%", "bgColorVal");
            return (Criteria) this;
        }

        public Criteria andBgColorValLikeBoth(String value) {
            addCriterion("TDCB.BG_COLOR_VAL like ", "%" + value + "%", "bgColorVal");
            return (Criteria) this;
        }

        public Criteria andLinkUrlAddrLikeLeft(String value) {
            addCriterion("TDCB.LINK_URL_ADDR like ", "%" + value, "linkUrlAddr");
            return (Criteria) this;
        }

        public Criteria andLinkUrlAddrLikeRight(String value) {
            addCriterion("TDCB.LINK_URL_ADDR like ", value + "%", "linkUrlAddr");
            return (Criteria) this;
        }

        public Criteria andLinkUrlAddrLikeBoth(String value) {
            addCriterion("TDCB.LINK_URL_ADDR like ", "%" + value + "%", "linkUrlAddr");
            return (Criteria) this;
        }

        public Criteria andLinkNwinYnLikeLeft(String value) {
            addCriterion("TDCB.LINK_NWIN_YN like ", "%" + value, "linkNwinYn");
            return (Criteria) this;
        }

        public Criteria andLinkNwinYnLikeRight(String value) {
            addCriterion("TDCB.LINK_NWIN_YN like ", value + "%", "linkNwinYn");
            return (Criteria) this;
        }

        public Criteria andLinkNwinYnLikeBoth(String value) {
            addCriterion("TDCB.LINK_NWIN_YN like ", "%" + value + "%", "linkNwinYn");
            return (Criteria) this;
        }

        public Criteria andKwdValLikeLeft(String value) {
            addCriterion("TDCB.KWD_VAL like ", "%" + value, "kwdVal");
            return (Criteria) this;
        }

        public Criteria andKwdValLikeRight(String value) {
            addCriterion("TDCB.KWD_VAL like ", value + "%", "kwdVal");
            return (Criteria) this;
        }

        public Criteria andKwdValLikeBoth(String value) {
            addCriterion("TDCB.KWD_VAL like ", "%" + value + "%", "kwdVal");
            return (Criteria) this;
        }

        public Criteria andDpYnLikeLeft(String value) {
            addCriterion("TDCB.DP_YN like ", "%" + value, "dpYn");
            return (Criteria) this;
        }

        public Criteria andDpYnLikeRight(String value) {
            addCriterion("TDCB.DP_YN like ", value + "%", "dpYn");
            return (Criteria) this;
        }

        public Criteria andDpYnLikeBoth(String value) {
            addCriterion("TDCB.DP_YN like ", "%" + value + "%", "dpYn");
            return (Criteria) this;
        }

        public Criteria andRegIdLikeLeft(String value) {
            addCriterion("TDCB.REG_ID like ", "%" + value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdLikeRight(String value) {
            addCriterion("TDCB.REG_ID like ", value + "%", "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdLikeBoth(String value) {
            addCriterion("TDCB.REG_ID like ", "%" + value + "%", "regId");
            return (Criteria) this;
        }

        public Criteria andModIdLikeLeft(String value) {
            addCriterion("TDCB.MOD_ID like ", "%" + value, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdLikeRight(String value) {
            addCriterion("TDCB.MOD_ID like ", value + "%", "modId");
            return (Criteria) this;
        }

        public Criteria andModIdLikeBoth(String value) {
            addCriterion("TDCB.MOD_ID like ", "%" + value + "%", "modId");
            return (Criteria) this;
        }

        public Criteria andUseYnLikeLeft(String value) {
            addCriterion("TDCB.USE_YN like ", "%" + value, "useYn");
            return (Criteria) this;
        }

        public Criteria andUseYnLikeRight(String value) {
            addCriterion("TDCB.USE_YN like ", value + "%", "useYn");
            return (Criteria) this;
        }

        public Criteria andUseYnLikeBoth(String value) {
            addCriterion("TDCB.USE_YN like ", "%" + value + "%", "useYn");
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