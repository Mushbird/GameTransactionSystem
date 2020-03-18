package com.mushbird.sinsege.base.module.reward.model.entity.criteria;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class PointPolicyAttendanceEntityCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    public PointPolicyAttendanceEntityCriteria() {
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

        public Criteria andPtTpCdIsNull() {
            addCriterion("TPPA.PT_TP_CD is null");
            return (Criteria) this;
        }

        public Criteria andPtTpCdIsNotNull() {
            addCriterion("TPPA.PT_TP_CD is not null");
            return (Criteria) this;
        }

        public Criteria andPtTpCdEqualTo(String value) {
            addCriterion("TPPA.PT_TP_CD =", value, "ptTpCd");
            return (Criteria) this;
        }

        public Criteria andPtTpCdNotEqualTo(String value) {
            addCriterion("TPPA.PT_TP_CD <>", value, "ptTpCd");
            return (Criteria) this;
        }

        public Criteria andPtTpCdGreaterThan(String value) {
            addCriterion("TPPA.PT_TP_CD >", value, "ptTpCd");
            return (Criteria) this;
        }

        public Criteria andPtTpCdGreaterThanOrEqualTo(String value) {
            addCriterion("TPPA.PT_TP_CD >=", value, "ptTpCd");
            return (Criteria) this;
        }

        public Criteria andPtTpCdLessThan(String value) {
            addCriterion("TPPA.PT_TP_CD <", value, "ptTpCd");
            return (Criteria) this;
        }

        public Criteria andPtTpCdLessThanOrEqualTo(String value) {
            addCriterion("TPPA.PT_TP_CD <=", value, "ptTpCd");
            return (Criteria) this;
        }

        public Criteria andPtTpCdLike(String value) {
            addCriterion("TPPA.PT_TP_CD like", value, "ptTpCd");
            return (Criteria) this;
        }

        public Criteria andPtTpCdNotLike(String value) {
            addCriterion("TPPA.PT_TP_CD not like", value, "ptTpCd");
            return (Criteria) this;
        }

        public Criteria andPtTpCdIn(List<String> values) {
            addCriterion("TPPA.PT_TP_CD in", values, "ptTpCd");
            return (Criteria) this;
        }

        public Criteria andPtTpCdNotIn(List<String> values) {
            addCriterion("TPPA.PT_TP_CD not in", values, "ptTpCd");
            return (Criteria) this;
        }

        public Criteria andPtTpCdBetween(String value1, String value2) {
            addCriterion("TPPA.PT_TP_CD between", value1, value2, "ptTpCd");
            return (Criteria) this;
        }

        public Criteria andPtTpCdNotBetween(String value1, String value2) {
            addCriterion("TPPA.PT_TP_CD not between", value1, value2, "ptTpCd");
            return (Criteria) this;
        }

        public Criteria andPtChgDtIsNull() {
            addCriterion("TPPA.PT_CHG_DT is null");
            return (Criteria) this;
        }

        public Criteria andPtChgDtIsNotNull() {
            addCriterion("TPPA.PT_CHG_DT is not null");
            return (Criteria) this;
        }

        public Criteria andPtChgDtEqualTo(String value) {
            addCriterion("TPPA.PT_CHG_DT =", value, "ptChgDt");
            return (Criteria) this;
        }

        public Criteria andPtChgDtNotEqualTo(String value) {
            addCriterion("TPPA.PT_CHG_DT <>", value, "ptChgDt");
            return (Criteria) this;
        }

        public Criteria andPtChgDtGreaterThan(String value) {
            addCriterion("TPPA.PT_CHG_DT >", value, "ptChgDt");
            return (Criteria) this;
        }

        public Criteria andPtChgDtGreaterThanOrEqualTo(String value) {
            addCriterion("TPPA.PT_CHG_DT >=", value, "ptChgDt");
            return (Criteria) this;
        }

        public Criteria andPtChgDtLessThan(String value) {
            addCriterion("TPPA.PT_CHG_DT <", value, "ptChgDt");
            return (Criteria) this;
        }

        public Criteria andPtChgDtLessThanOrEqualTo(String value) {
            addCriterion("TPPA.PT_CHG_DT <=", value, "ptChgDt");
            return (Criteria) this;
        }

        public Criteria andPtChgDtLike(String value) {
            addCriterion("TPPA.PT_CHG_DT like", value, "ptChgDt");
            return (Criteria) this;
        }

        public Criteria andPtChgDtNotLike(String value) {
            addCriterion("TPPA.PT_CHG_DT not like", value, "ptChgDt");
            return (Criteria) this;
        }

        public Criteria andPtChgDtIn(List<String> values) {
            addCriterion("TPPA.PT_CHG_DT in", values, "ptChgDt");
            return (Criteria) this;
        }

        public Criteria andPtChgDtNotIn(List<String> values) {
            addCriterion("TPPA.PT_CHG_DT not in", values, "ptChgDt");
            return (Criteria) this;
        }

        public Criteria andPtChgDtBetween(String value1, String value2) {
            addCriterion("TPPA.PT_CHG_DT between", value1, value2, "ptChgDt");
            return (Criteria) this;
        }

        public Criteria andPtChgDtNotBetween(String value1, String value2) {
            addCriterion("TPPA.PT_CHG_DT not between", value1, value2, "ptChgDt");
            return (Criteria) this;
        }

        public Criteria andPtChgBfAmtIsNull() {
            addCriterion("TPPA.PT_CHG_BF_AMT is null");
            return (Criteria) this;
        }

        public Criteria andPtChgBfAmtIsNotNull() {
            addCriterion("TPPA.PT_CHG_BF_AMT is not null");
            return (Criteria) this;
        }

        public Criteria andPtChgBfAmtEqualTo(Integer value) {
            addCriterion("TPPA.PT_CHG_BF_AMT =", value, "ptChgBfAmt");
            return (Criteria) this;
        }

        public Criteria andPtChgBfAmtNotEqualTo(Integer value) {
            addCriterion("TPPA.PT_CHG_BF_AMT <>", value, "ptChgBfAmt");
            return (Criteria) this;
        }

        public Criteria andPtChgBfAmtGreaterThan(Integer value) {
            addCriterion("TPPA.PT_CHG_BF_AMT >", value, "ptChgBfAmt");
            return (Criteria) this;
        }

        public Criteria andPtChgBfAmtGreaterThanOrEqualTo(Integer value) {
            addCriterion("TPPA.PT_CHG_BF_AMT >=", value, "ptChgBfAmt");
            return (Criteria) this;
        }

        public Criteria andPtChgBfAmtLessThan(Integer value) {
            addCriterion("TPPA.PT_CHG_BF_AMT <", value, "ptChgBfAmt");
            return (Criteria) this;
        }

        public Criteria andPtChgBfAmtLessThanOrEqualTo(Integer value) {
            addCriterion("TPPA.PT_CHG_BF_AMT <=", value, "ptChgBfAmt");
            return (Criteria) this;
        }

        public Criteria andPtChgBfAmtIn(List<Integer> values) {
            addCriterion("TPPA.PT_CHG_BF_AMT in", values, "ptChgBfAmt");
            return (Criteria) this;
        }

        public Criteria andPtChgBfAmtNotIn(List<Integer> values) {
            addCriterion("TPPA.PT_CHG_BF_AMT not in", values, "ptChgBfAmt");
            return (Criteria) this;
        }

        public Criteria andPtChgBfAmtBetween(Integer value1, Integer value2) {
            addCriterion("TPPA.PT_CHG_BF_AMT between", value1, value2, "ptChgBfAmt");
            return (Criteria) this;
        }

        public Criteria andPtChgBfAmtNotBetween(Integer value1, Integer value2) {
            addCriterion("TPPA.PT_CHG_BF_AMT not between", value1, value2, "ptChgBfAmt");
            return (Criteria) this;
        }

        public Criteria andAtndPrgsYnIsNull() {
            addCriterion("TPPA.ATND_PRGS_YN is null");
            return (Criteria) this;
        }

        public Criteria andAtndPrgsYnIsNotNull() {
            addCriterion("TPPA.ATND_PRGS_YN is not null");
            return (Criteria) this;
        }

        public Criteria andAtndPrgsYnEqualTo(String value) {
            addCriterion("TPPA.ATND_PRGS_YN =", value, "atndPrgsYn");
            return (Criteria) this;
        }

        public Criteria andAtndPrgsYnNotEqualTo(String value) {
            addCriterion("TPPA.ATND_PRGS_YN <>", value, "atndPrgsYn");
            return (Criteria) this;
        }

        public Criteria andAtndPrgsYnGreaterThan(String value) {
            addCriterion("TPPA.ATND_PRGS_YN >", value, "atndPrgsYn");
            return (Criteria) this;
        }

        public Criteria andAtndPrgsYnGreaterThanOrEqualTo(String value) {
            addCriterion("TPPA.ATND_PRGS_YN >=", value, "atndPrgsYn");
            return (Criteria) this;
        }

        public Criteria andAtndPrgsYnLessThan(String value) {
            addCriterion("TPPA.ATND_PRGS_YN <", value, "atndPrgsYn");
            return (Criteria) this;
        }

        public Criteria andAtndPrgsYnLessThanOrEqualTo(String value) {
            addCriterion("TPPA.ATND_PRGS_YN <=", value, "atndPrgsYn");
            return (Criteria) this;
        }

        public Criteria andAtndPrgsYnLike(String value) {
            addCriterion("TPPA.ATND_PRGS_YN like", value, "atndPrgsYn");
            return (Criteria) this;
        }

        public Criteria andAtndPrgsYnNotLike(String value) {
            addCriterion("TPPA.ATND_PRGS_YN not like", value, "atndPrgsYn");
            return (Criteria) this;
        }

        public Criteria andAtndPrgsYnIn(List<String> values) {
            addCriterion("TPPA.ATND_PRGS_YN in", values, "atndPrgsYn");
            return (Criteria) this;
        }

        public Criteria andAtndPrgsYnNotIn(List<String> values) {
            addCriterion("TPPA.ATND_PRGS_YN not in", values, "atndPrgsYn");
            return (Criteria) this;
        }

        public Criteria andAtndPrgsYnBetween(String value1, String value2) {
            addCriterion("TPPA.ATND_PRGS_YN between", value1, value2, "atndPrgsYn");
            return (Criteria) this;
        }

        public Criteria andAtndPrgsYnNotBetween(String value1, String value2) {
            addCriterion("TPPA.ATND_PRGS_YN not between", value1, value2, "atndPrgsYn");
            return (Criteria) this;
        }

        public Criteria andAtndPrgsStopDtIsNull() {
            addCriterion("TPPA.ATND_PRGS_STOP_DT is null");
            return (Criteria) this;
        }

        public Criteria andAtndPrgsStopDtIsNotNull() {
            addCriterion("TPPA.ATND_PRGS_STOP_DT is not null");
            return (Criteria) this;
        }

        public Criteria andAtndPrgsStopDtEqualTo(Date value) {
            addCriterionForJDBCDate("TPPA.ATND_PRGS_STOP_DT =", value, "atndPrgsStopDt");
            return (Criteria) this;
        }

        public Criteria andAtndPrgsStopDtNotEqualTo(Date value) {
            addCriterionForJDBCDate("TPPA.ATND_PRGS_STOP_DT <>", value, "atndPrgsStopDt");
            return (Criteria) this;
        }

        public Criteria andAtndPrgsStopDtGreaterThan(Date value) {
            addCriterionForJDBCDate("TPPA.ATND_PRGS_STOP_DT >", value, "atndPrgsStopDt");
            return (Criteria) this;
        }

        public Criteria andAtndPrgsStopDtGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("TPPA.ATND_PRGS_STOP_DT >=", value, "atndPrgsStopDt");
            return (Criteria) this;
        }

        public Criteria andAtndPrgsStopDtLessThan(Date value) {
            addCriterionForJDBCDate("TPPA.ATND_PRGS_STOP_DT <", value, "atndPrgsStopDt");
            return (Criteria) this;
        }

        public Criteria andAtndPrgsStopDtLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("TPPA.ATND_PRGS_STOP_DT <=", value, "atndPrgsStopDt");
            return (Criteria) this;
        }

        public Criteria andAtndPrgsStopDtIn(List<Date> values) {
            addCriterionForJDBCDate("TPPA.ATND_PRGS_STOP_DT in", values, "atndPrgsStopDt");
            return (Criteria) this;
        }

        public Criteria andAtndPrgsStopDtNotIn(List<Date> values) {
            addCriterionForJDBCDate("TPPA.ATND_PRGS_STOP_DT not in", values, "atndPrgsStopDt");
            return (Criteria) this;
        }

        public Criteria andAtndPrgsStopDtBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("TPPA.ATND_PRGS_STOP_DT between", value1, value2, "atndPrgsStopDt");
            return (Criteria) this;
        }

        public Criteria andAtndPrgsStopDtNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("TPPA.ATND_PRGS_STOP_DT not between", value1, value2, "atndPrgsStopDt");
            return (Criteria) this;
        }

        public Criteria andDpYnIsNull() {
            addCriterion("TPPA.DP_YN is null");
            return (Criteria) this;
        }

        public Criteria andDpYnIsNotNull() {
            addCriterion("TPPA.DP_YN is not null");
            return (Criteria) this;
        }

        public Criteria andDpYnEqualTo(String value) {
            addCriterion("TPPA.DP_YN =", value, "dpYn");
            return (Criteria) this;
        }

        public Criteria andDpYnNotEqualTo(String value) {
            addCriterion("TPPA.DP_YN <>", value, "dpYn");
            return (Criteria) this;
        }

        public Criteria andDpYnGreaterThan(String value) {
            addCriterion("TPPA.DP_YN >", value, "dpYn");
            return (Criteria) this;
        }

        public Criteria andDpYnGreaterThanOrEqualTo(String value) {
            addCriterion("TPPA.DP_YN >=", value, "dpYn");
            return (Criteria) this;
        }

        public Criteria andDpYnLessThan(String value) {
            addCriterion("TPPA.DP_YN <", value, "dpYn");
            return (Criteria) this;
        }

        public Criteria andDpYnLessThanOrEqualTo(String value) {
            addCriterion("TPPA.DP_YN <=", value, "dpYn");
            return (Criteria) this;
        }

        public Criteria andDpYnLike(String value) {
            addCriterion("TPPA.DP_YN like", value, "dpYn");
            return (Criteria) this;
        }

        public Criteria andDpYnNotLike(String value) {
            addCriterion("TPPA.DP_YN not like", value, "dpYn");
            return (Criteria) this;
        }

        public Criteria andDpYnIn(List<String> values) {
            addCriterion("TPPA.DP_YN in", values, "dpYn");
            return (Criteria) this;
        }

        public Criteria andDpYnNotIn(List<String> values) {
            addCriterion("TPPA.DP_YN not in", values, "dpYn");
            return (Criteria) this;
        }

        public Criteria andDpYnBetween(String value1, String value2) {
            addCriterion("TPPA.DP_YN between", value1, value2, "dpYn");
            return (Criteria) this;
        }

        public Criteria andDpYnNotBetween(String value1, String value2) {
            addCriterion("TPPA.DP_YN not between", value1, value2, "dpYn");
            return (Criteria) this;
        }

        public Criteria andRegDtIsNull() {
            addCriterion("TPPA.REG_DT is null");
            return (Criteria) this;
        }

        public Criteria andRegDtIsNotNull() {
            addCriterion("TPPA.REG_DT is not null");
            return (Criteria) this;
        }

        public Criteria andRegDtEqualTo(Date value) {
            addCriterion("TPPA.REG_DT =", value, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtNotEqualTo(Date value) {
            addCriterion("TPPA.REG_DT <>", value, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtGreaterThan(Date value) {
            addCriterion("TPPA.REG_DT >", value, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtGreaterThanOrEqualTo(Date value) {
            addCriterion("TPPA.REG_DT >=", value, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtLessThan(Date value) {
            addCriterion("TPPA.REG_DT <", value, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtLessThanOrEqualTo(Date value) {
            addCriterion("TPPA.REG_DT <=", value, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtIn(List<Date> values) {
            addCriterion("TPPA.REG_DT in", values, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtNotIn(List<Date> values) {
            addCriterion("TPPA.REG_DT not in", values, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtBetween(Date value1, Date value2) {
            addCriterion("TPPA.REG_DT between", value1, value2, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtNotBetween(Date value1, Date value2) {
            addCriterion("TPPA.REG_DT not between", value1, value2, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegIdIsNull() {
            addCriterion("TPPA.REG_ID is null");
            return (Criteria) this;
        }

        public Criteria andRegIdIsNotNull() {
            addCriterion("TPPA.REG_ID is not null");
            return (Criteria) this;
        }

        public Criteria andRegIdEqualTo(String value) {
            addCriterion("TPPA.REG_ID =", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdNotEqualTo(String value) {
            addCriterion("TPPA.REG_ID <>", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdGreaterThan(String value) {
            addCriterion("TPPA.REG_ID >", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdGreaterThanOrEqualTo(String value) {
            addCriterion("TPPA.REG_ID >=", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdLessThan(String value) {
            addCriterion("TPPA.REG_ID <", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdLessThanOrEqualTo(String value) {
            addCriterion("TPPA.REG_ID <=", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdLike(String value) {
            addCriterion("TPPA.REG_ID like", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdNotLike(String value) {
            addCriterion("TPPA.REG_ID not like", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdIn(List<String> values) {
            addCriterion("TPPA.REG_ID in", values, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdNotIn(List<String> values) {
            addCriterion("TPPA.REG_ID not in", values, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdBetween(String value1, String value2) {
            addCriterion("TPPA.REG_ID between", value1, value2, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdNotBetween(String value1, String value2) {
            addCriterion("TPPA.REG_ID not between", value1, value2, "regId");
            return (Criteria) this;
        }

        public Criteria andModDtIsNull() {
            addCriterion("TPPA.MOD_DT is null");
            return (Criteria) this;
        }

        public Criteria andModDtIsNotNull() {
            addCriterion("TPPA.MOD_DT is not null");
            return (Criteria) this;
        }

        public Criteria andModDtEqualTo(Date value) {
            addCriterion("TPPA.MOD_DT =", value, "modDt");
            return (Criteria) this;
        }

        public Criteria andModDtNotEqualTo(Date value) {
            addCriterion("TPPA.MOD_DT <>", value, "modDt");
            return (Criteria) this;
        }

        public Criteria andModDtGreaterThan(Date value) {
            addCriterion("TPPA.MOD_DT >", value, "modDt");
            return (Criteria) this;
        }

        public Criteria andModDtGreaterThanOrEqualTo(Date value) {
            addCriterion("TPPA.MOD_DT >=", value, "modDt");
            return (Criteria) this;
        }

        public Criteria andModDtLessThan(Date value) {
            addCriterion("TPPA.MOD_DT <", value, "modDt");
            return (Criteria) this;
        }

        public Criteria andModDtLessThanOrEqualTo(Date value) {
            addCriterion("TPPA.MOD_DT <=", value, "modDt");
            return (Criteria) this;
        }

        public Criteria andModDtIn(List<Date> values) {
            addCriterion("TPPA.MOD_DT in", values, "modDt");
            return (Criteria) this;
        }

        public Criteria andModDtNotIn(List<Date> values) {
            addCriterion("TPPA.MOD_DT not in", values, "modDt");
            return (Criteria) this;
        }

        public Criteria andModDtBetween(Date value1, Date value2) {
            addCriterion("TPPA.MOD_DT between", value1, value2, "modDt");
            return (Criteria) this;
        }

        public Criteria andModDtNotBetween(Date value1, Date value2) {
            addCriterion("TPPA.MOD_DT not between", value1, value2, "modDt");
            return (Criteria) this;
        }

        public Criteria andModIdIsNull() {
            addCriterion("TPPA.MOD_ID is null");
            return (Criteria) this;
        }

        public Criteria andModIdIsNotNull() {
            addCriterion("TPPA.MOD_ID is not null");
            return (Criteria) this;
        }

        public Criteria andModIdEqualTo(String value) {
            addCriterion("TPPA.MOD_ID =", value, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdNotEqualTo(String value) {
            addCriterion("TPPA.MOD_ID <>", value, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdGreaterThan(String value) {
            addCriterion("TPPA.MOD_ID >", value, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdGreaterThanOrEqualTo(String value) {
            addCriterion("TPPA.MOD_ID >=", value, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdLessThan(String value) {
            addCriterion("TPPA.MOD_ID <", value, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdLessThanOrEqualTo(String value) {
            addCriterion("TPPA.MOD_ID <=", value, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdLike(String value) {
            addCriterion("TPPA.MOD_ID like", value, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdNotLike(String value) {
            addCriterion("TPPA.MOD_ID not like", value, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdIn(List<String> values) {
            addCriterion("TPPA.MOD_ID in", values, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdNotIn(List<String> values) {
            addCriterion("TPPA.MOD_ID not in", values, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdBetween(String value1, String value2) {
            addCriterion("TPPA.MOD_ID between", value1, value2, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdNotBetween(String value1, String value2) {
            addCriterion("TPPA.MOD_ID not between", value1, value2, "modId");
            return (Criteria) this;
        }

        public Criteria andPtTpCdLikeInsensitive(String value) {
            addCriterion("upper(TPPA.PT_TP_CD) like", value.toUpperCase(), "ptTpCd");
            return (Criteria) this;
        }

        public Criteria andPtChgDtLikeInsensitive(String value) {
            addCriterion("upper(TPPA.PT_CHG_DT) like", value.toUpperCase(), "ptChgDt");
            return (Criteria) this;
        }

        public Criteria andAtndPrgsYnLikeInsensitive(String value) {
            addCriterion("upper(TPPA.ATND_PRGS_YN) like", value.toUpperCase(), "atndPrgsYn");
            return (Criteria) this;
        }

        public Criteria andDpYnLikeInsensitive(String value) {
            addCriterion("upper(TPPA.DP_YN) like", value.toUpperCase(), "dpYn");
            return (Criteria) this;
        }

        public Criteria andRegIdLikeInsensitive(String value) {
            addCriterion("upper(TPPA.REG_ID) like", value.toUpperCase(), "regId");
            return (Criteria) this;
        }

        public Criteria andModIdLikeInsensitive(String value) {
            addCriterion("upper(TPPA.MOD_ID) like", value.toUpperCase(), "modId");
            return (Criteria) this;
        }

        public Criteria andPtTpCdLikeLeft(String value) {
            addCriterion("TPPA.PT_TP_CD like ", "%" + value, "ptTpCd");
            return (Criteria) this;
        }

        public Criteria andPtTpCdLikeRight(String value) {
            addCriterion("TPPA.PT_TP_CD like ", value + "%", "ptTpCd");
            return (Criteria) this;
        }

        public Criteria andPtTpCdLikeBoth(String value) {
            addCriterion("TPPA.PT_TP_CD like ", "%" + value + "%", "ptTpCd");
            return (Criteria) this;
        }

        public Criteria andPtChgDtLikeLeft(String value) {
            addCriterion("TPPA.PT_CHG_DT like ", "%" + value, "ptChgDt");
            return (Criteria) this;
        }

        public Criteria andPtChgDtLikeRight(String value) {
            addCriterion("TPPA.PT_CHG_DT like ", value + "%", "ptChgDt");
            return (Criteria) this;
        }

        public Criteria andPtChgDtLikeBoth(String value) {
            addCriterion("TPPA.PT_CHG_DT like ", "%" + value + "%", "ptChgDt");
            return (Criteria) this;
        }

        public Criteria andAtndPrgsYnLikeLeft(String value) {
            addCriterion("TPPA.ATND_PRGS_YN like ", "%" + value, "atndPrgsYn");
            return (Criteria) this;
        }

        public Criteria andAtndPrgsYnLikeRight(String value) {
            addCriterion("TPPA.ATND_PRGS_YN like ", value + "%", "atndPrgsYn");
            return (Criteria) this;
        }

        public Criteria andAtndPrgsYnLikeBoth(String value) {
            addCriterion("TPPA.ATND_PRGS_YN like ", "%" + value + "%", "atndPrgsYn");
            return (Criteria) this;
        }

        public Criteria andDpYnLikeLeft(String value) {
            addCriterion("TPPA.DP_YN like ", "%" + value, "dpYn");
            return (Criteria) this;
        }

        public Criteria andDpYnLikeRight(String value) {
            addCriterion("TPPA.DP_YN like ", value + "%", "dpYn");
            return (Criteria) this;
        }

        public Criteria andDpYnLikeBoth(String value) {
            addCriterion("TPPA.DP_YN like ", "%" + value + "%", "dpYn");
            return (Criteria) this;
        }

        public Criteria andRegIdLikeLeft(String value) {
            addCriterion("TPPA.REG_ID like ", "%" + value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdLikeRight(String value) {
            addCriterion("TPPA.REG_ID like ", value + "%", "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdLikeBoth(String value) {
            addCriterion("TPPA.REG_ID like ", "%" + value + "%", "regId");
            return (Criteria) this;
        }

        public Criteria andModIdLikeLeft(String value) {
            addCriterion("TPPA.MOD_ID like ", "%" + value, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdLikeRight(String value) {
            addCriterion("TPPA.MOD_ID like ", value + "%", "modId");
            return (Criteria) this;
        }

        public Criteria andModIdLikeBoth(String value) {
            addCriterion("TPPA.MOD_ID like ", "%" + value + "%", "modId");
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