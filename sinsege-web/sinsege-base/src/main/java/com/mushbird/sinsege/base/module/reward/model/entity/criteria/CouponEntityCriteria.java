package com.mushbird.sinsege.base.module.reward.model.entity.criteria;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CouponEntityCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    public CouponEntityCriteria() {
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

        public Criteria andCpnIdIsNull() {
            addCriterion("TCPN.CPN_ID is null");
            return (Criteria) this;
        }

        public Criteria andCpnIdIsNotNull() {
            addCriterion("TCPN.CPN_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCpnIdEqualTo(Integer value) {
            addCriterion("TCPN.CPN_ID =", value, "cpnId");
            return (Criteria) this;
        }

        public Criteria andCpnIdNotEqualTo(Integer value) {
            addCriterion("TCPN.CPN_ID <>", value, "cpnId");
            return (Criteria) this;
        }

        public Criteria andCpnIdGreaterThan(Integer value) {
            addCriterion("TCPN.CPN_ID >", value, "cpnId");
            return (Criteria) this;
        }

        public Criteria andCpnIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("TCPN.CPN_ID >=", value, "cpnId");
            return (Criteria) this;
        }

        public Criteria andCpnIdLessThan(Integer value) {
            addCriterion("TCPN.CPN_ID <", value, "cpnId");
            return (Criteria) this;
        }

        public Criteria andCpnIdLessThanOrEqualTo(Integer value) {
            addCriterion("TCPN.CPN_ID <=", value, "cpnId");
            return (Criteria) this;
        }

        public Criteria andCpnIdIn(List<Integer> values) {
            addCriterion("TCPN.CPN_ID in", values, "cpnId");
            return (Criteria) this;
        }

        public Criteria andCpnIdNotIn(List<Integer> values) {
            addCriterion("TCPN.CPN_ID not in", values, "cpnId");
            return (Criteria) this;
        }

        public Criteria andCpnIdBetween(Integer value1, Integer value2) {
            addCriterion("TCPN.CPN_ID between", value1, value2, "cpnId");
            return (Criteria) this;
        }

        public Criteria andCpnIdNotBetween(Integer value1, Integer value2) {
            addCriterion("TCPN.CPN_ID not between", value1, value2, "cpnId");
            return (Criteria) this;
        }

        public Criteria andVenIdIsNull() {
            addCriterion("TCPN.VEN_ID is null");
            return (Criteria) this;
        }

        public Criteria andVenIdIsNotNull() {
            addCriterion("TCPN.VEN_ID is not null");
            return (Criteria) this;
        }

        public Criteria andVenIdEqualTo(Integer value) {
            addCriterion("TCPN.VEN_ID =", value, "venId");
            return (Criteria) this;
        }

        public Criteria andVenIdNotEqualTo(Integer value) {
            addCriterion("TCPN.VEN_ID <>", value, "venId");
            return (Criteria) this;
        }

        public Criteria andVenIdGreaterThan(Integer value) {
            addCriterion("TCPN.VEN_ID >", value, "venId");
            return (Criteria) this;
        }

        public Criteria andVenIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("TCPN.VEN_ID >=", value, "venId");
            return (Criteria) this;
        }

        public Criteria andVenIdLessThan(Integer value) {
            addCriterion("TCPN.VEN_ID <", value, "venId");
            return (Criteria) this;
        }

        public Criteria andVenIdLessThanOrEqualTo(Integer value) {
            addCriterion("TCPN.VEN_ID <=", value, "venId");
            return (Criteria) this;
        }

        public Criteria andVenIdIn(List<Integer> values) {
            addCriterion("TCPN.VEN_ID in", values, "venId");
            return (Criteria) this;
        }

        public Criteria andVenIdNotIn(List<Integer> values) {
            addCriterion("TCPN.VEN_ID not in", values, "venId");
            return (Criteria) this;
        }

        public Criteria andVenIdBetween(Integer value1, Integer value2) {
            addCriterion("TCPN.VEN_ID between", value1, value2, "venId");
            return (Criteria) this;
        }

        public Criteria andVenIdNotBetween(Integer value1, Integer value2) {
            addCriterion("TCPN.VEN_ID not between", value1, value2, "venId");
            return (Criteria) this;
        }

        public Criteria andCpnTpCdIsNull() {
            addCriterion("TCPN.CPN_TP_CD is null");
            return (Criteria) this;
        }

        public Criteria andCpnTpCdIsNotNull() {
            addCriterion("TCPN.CPN_TP_CD is not null");
            return (Criteria) this;
        }

        public Criteria andCpnTpCdEqualTo(String value) {
            addCriterion("TCPN.CPN_TP_CD =", value, "cpnTpCd");
            return (Criteria) this;
        }

        public Criteria andCpnTpCdNotEqualTo(String value) {
            addCriterion("TCPN.CPN_TP_CD <>", value, "cpnTpCd");
            return (Criteria) this;
        }

        public Criteria andCpnTpCdGreaterThan(String value) {
            addCriterion("TCPN.CPN_TP_CD >", value, "cpnTpCd");
            return (Criteria) this;
        }

        public Criteria andCpnTpCdGreaterThanOrEqualTo(String value) {
            addCriterion("TCPN.CPN_TP_CD >=", value, "cpnTpCd");
            return (Criteria) this;
        }

        public Criteria andCpnTpCdLessThan(String value) {
            addCriterion("TCPN.CPN_TP_CD <", value, "cpnTpCd");
            return (Criteria) this;
        }

        public Criteria andCpnTpCdLessThanOrEqualTo(String value) {
            addCriterion("TCPN.CPN_TP_CD <=", value, "cpnTpCd");
            return (Criteria) this;
        }

        public Criteria andCpnTpCdLike(String value) {
            addCriterion("TCPN.CPN_TP_CD like", value, "cpnTpCd");
            return (Criteria) this;
        }

        public Criteria andCpnTpCdNotLike(String value) {
            addCriterion("TCPN.CPN_TP_CD not like", value, "cpnTpCd");
            return (Criteria) this;
        }

        public Criteria andCpnTpCdIn(List<String> values) {
            addCriterion("TCPN.CPN_TP_CD in", values, "cpnTpCd");
            return (Criteria) this;
        }

        public Criteria andCpnTpCdNotIn(List<String> values) {
            addCriterion("TCPN.CPN_TP_CD not in", values, "cpnTpCd");
            return (Criteria) this;
        }

        public Criteria andCpnTpCdBetween(String value1, String value2) {
            addCriterion("TCPN.CPN_TP_CD between", value1, value2, "cpnTpCd");
            return (Criteria) this;
        }

        public Criteria andCpnTpCdNotBetween(String value1, String value2) {
            addCriterion("TCPN.CPN_TP_CD not between", value1, value2, "cpnTpCd");
            return (Criteria) this;
        }

        public Criteria andCpnClCdIsNull() {
            addCriterion("TCPN.CPN_CL_CD is null");
            return (Criteria) this;
        }

        public Criteria andCpnClCdIsNotNull() {
            addCriterion("TCPN.CPN_CL_CD is not null");
            return (Criteria) this;
        }

        public Criteria andCpnClCdEqualTo(String value) {
            addCriterion("TCPN.CPN_CL_CD =", value, "cpnClCd");
            return (Criteria) this;
        }

        public Criteria andCpnClCdNotEqualTo(String value) {
            addCriterion("TCPN.CPN_CL_CD <>", value, "cpnClCd");
            return (Criteria) this;
        }

        public Criteria andCpnClCdGreaterThan(String value) {
            addCriterion("TCPN.CPN_CL_CD >", value, "cpnClCd");
            return (Criteria) this;
        }

        public Criteria andCpnClCdGreaterThanOrEqualTo(String value) {
            addCriterion("TCPN.CPN_CL_CD >=", value, "cpnClCd");
            return (Criteria) this;
        }

        public Criteria andCpnClCdLessThan(String value) {
            addCriterion("TCPN.CPN_CL_CD <", value, "cpnClCd");
            return (Criteria) this;
        }

        public Criteria andCpnClCdLessThanOrEqualTo(String value) {
            addCriterion("TCPN.CPN_CL_CD <=", value, "cpnClCd");
            return (Criteria) this;
        }

        public Criteria andCpnClCdLike(String value) {
            addCriterion("TCPN.CPN_CL_CD like", value, "cpnClCd");
            return (Criteria) this;
        }

        public Criteria andCpnClCdNotLike(String value) {
            addCriterion("TCPN.CPN_CL_CD not like", value, "cpnClCd");
            return (Criteria) this;
        }

        public Criteria andCpnClCdIn(List<String> values) {
            addCriterion("TCPN.CPN_CL_CD in", values, "cpnClCd");
            return (Criteria) this;
        }

        public Criteria andCpnClCdNotIn(List<String> values) {
            addCriterion("TCPN.CPN_CL_CD not in", values, "cpnClCd");
            return (Criteria) this;
        }

        public Criteria andCpnClCdBetween(String value1, String value2) {
            addCriterion("TCPN.CPN_CL_CD between", value1, value2, "cpnClCd");
            return (Criteria) this;
        }

        public Criteria andCpnClCdNotBetween(String value1, String value2) {
            addCriterion("TCPN.CPN_CL_CD not between", value1, value2, "cpnClCd");
            return (Criteria) this;
        }

        public Criteria andCpnAutoClCdIsNull() {
            addCriterion("TCPN.CPN_AUTO_CL_CD is null");
            return (Criteria) this;
        }

        public Criteria andCpnAutoClCdIsNotNull() {
            addCriterion("TCPN.CPN_AUTO_CL_CD is not null");
            return (Criteria) this;
        }

        public Criteria andCpnAutoClCdEqualTo(String value) {
            addCriterion("TCPN.CPN_AUTO_CL_CD =", value, "cpnAutoClCd");
            return (Criteria) this;
        }

        public Criteria andCpnAutoClCdNotEqualTo(String value) {
            addCriterion("TCPN.CPN_AUTO_CL_CD <>", value, "cpnAutoClCd");
            return (Criteria) this;
        }

        public Criteria andCpnAutoClCdGreaterThan(String value) {
            addCriterion("TCPN.CPN_AUTO_CL_CD >", value, "cpnAutoClCd");
            return (Criteria) this;
        }

        public Criteria andCpnAutoClCdGreaterThanOrEqualTo(String value) {
            addCriterion("TCPN.CPN_AUTO_CL_CD >=", value, "cpnAutoClCd");
            return (Criteria) this;
        }

        public Criteria andCpnAutoClCdLessThan(String value) {
            addCriterion("TCPN.CPN_AUTO_CL_CD <", value, "cpnAutoClCd");
            return (Criteria) this;
        }

        public Criteria andCpnAutoClCdLessThanOrEqualTo(String value) {
            addCriterion("TCPN.CPN_AUTO_CL_CD <=", value, "cpnAutoClCd");
            return (Criteria) this;
        }

        public Criteria andCpnAutoClCdLike(String value) {
            addCriterion("TCPN.CPN_AUTO_CL_CD like", value, "cpnAutoClCd");
            return (Criteria) this;
        }

        public Criteria andCpnAutoClCdNotLike(String value) {
            addCriterion("TCPN.CPN_AUTO_CL_CD not like", value, "cpnAutoClCd");
            return (Criteria) this;
        }

        public Criteria andCpnAutoClCdIn(List<String> values) {
            addCriterion("TCPN.CPN_AUTO_CL_CD in", values, "cpnAutoClCd");
            return (Criteria) this;
        }

        public Criteria andCpnAutoClCdNotIn(List<String> values) {
            addCriterion("TCPN.CPN_AUTO_CL_CD not in", values, "cpnAutoClCd");
            return (Criteria) this;
        }

        public Criteria andCpnAutoClCdBetween(String value1, String value2) {
            addCriterion("TCPN.CPN_AUTO_CL_CD between", value1, value2, "cpnAutoClCd");
            return (Criteria) this;
        }

        public Criteria andCpnAutoClCdNotBetween(String value1, String value2) {
            addCriterion("TCPN.CPN_AUTO_CL_CD not between", value1, value2, "cpnAutoClCd");
            return (Criteria) this;
        }

        public Criteria andCpnStatCdIsNull() {
            addCriterion("TCPN.CPN_STAT_CD is null");
            return (Criteria) this;
        }

        public Criteria andCpnStatCdIsNotNull() {
            addCriterion("TCPN.CPN_STAT_CD is not null");
            return (Criteria) this;
        }

        public Criteria andCpnStatCdEqualTo(String value) {
            addCriterion("TCPN.CPN_STAT_CD =", value, "cpnStatCd");
            return (Criteria) this;
        }

        public Criteria andCpnStatCdNotEqualTo(String value) {
            addCriterion("TCPN.CPN_STAT_CD <>", value, "cpnStatCd");
            return (Criteria) this;
        }

        public Criteria andCpnStatCdGreaterThan(String value) {
            addCriterion("TCPN.CPN_STAT_CD >", value, "cpnStatCd");
            return (Criteria) this;
        }

        public Criteria andCpnStatCdGreaterThanOrEqualTo(String value) {
            addCriterion("TCPN.CPN_STAT_CD >=", value, "cpnStatCd");
            return (Criteria) this;
        }

        public Criteria andCpnStatCdLessThan(String value) {
            addCriterion("TCPN.CPN_STAT_CD <", value, "cpnStatCd");
            return (Criteria) this;
        }

        public Criteria andCpnStatCdLessThanOrEqualTo(String value) {
            addCriterion("TCPN.CPN_STAT_CD <=", value, "cpnStatCd");
            return (Criteria) this;
        }

        public Criteria andCpnStatCdLike(String value) {
            addCriterion("TCPN.CPN_STAT_CD like", value, "cpnStatCd");
            return (Criteria) this;
        }

        public Criteria andCpnStatCdNotLike(String value) {
            addCriterion("TCPN.CPN_STAT_CD not like", value, "cpnStatCd");
            return (Criteria) this;
        }

        public Criteria andCpnStatCdIn(List<String> values) {
            addCriterion("TCPN.CPN_STAT_CD in", values, "cpnStatCd");
            return (Criteria) this;
        }

        public Criteria andCpnStatCdNotIn(List<String> values) {
            addCriterion("TCPN.CPN_STAT_CD not in", values, "cpnStatCd");
            return (Criteria) this;
        }

        public Criteria andCpnStatCdBetween(String value1, String value2) {
            addCriterion("TCPN.CPN_STAT_CD between", value1, value2, "cpnStatCd");
            return (Criteria) this;
        }

        public Criteria andCpnStatCdNotBetween(String value1, String value2) {
            addCriterion("TCPN.CPN_STAT_CD not between", value1, value2, "cpnStatCd");
            return (Criteria) this;
        }

        public Criteria andCpnNoIsNull() {
            addCriterion("TCPN.CPN_NO is null");
            return (Criteria) this;
        }

        public Criteria andCpnNoIsNotNull() {
            addCriterion("TCPN.CPN_NO is not null");
            return (Criteria) this;
        }

        public Criteria andCpnNoEqualTo(String value) {
            addCriterion("TCPN.CPN_NO =", value, "cpnNo");
            return (Criteria) this;
        }

        public Criteria andCpnNoNotEqualTo(String value) {
            addCriterion("TCPN.CPN_NO <>", value, "cpnNo");
            return (Criteria) this;
        }

        public Criteria andCpnNoGreaterThan(String value) {
            addCriterion("TCPN.CPN_NO >", value, "cpnNo");
            return (Criteria) this;
        }

        public Criteria andCpnNoGreaterThanOrEqualTo(String value) {
            addCriterion("TCPN.CPN_NO >=", value, "cpnNo");
            return (Criteria) this;
        }

        public Criteria andCpnNoLessThan(String value) {
            addCriterion("TCPN.CPN_NO <", value, "cpnNo");
            return (Criteria) this;
        }

        public Criteria andCpnNoLessThanOrEqualTo(String value) {
            addCriterion("TCPN.CPN_NO <=", value, "cpnNo");
            return (Criteria) this;
        }

        public Criteria andCpnNoLike(String value) {
            addCriterion("TCPN.CPN_NO like", value, "cpnNo");
            return (Criteria) this;
        }

        public Criteria andCpnNoNotLike(String value) {
            addCriterion("TCPN.CPN_NO not like", value, "cpnNo");
            return (Criteria) this;
        }

        public Criteria andCpnNoIn(List<String> values) {
            addCriterion("TCPN.CPN_NO in", values, "cpnNo");
            return (Criteria) this;
        }

        public Criteria andCpnNoNotIn(List<String> values) {
            addCriterion("TCPN.CPN_NO not in", values, "cpnNo");
            return (Criteria) this;
        }

        public Criteria andCpnNoBetween(String value1, String value2) {
            addCriterion("TCPN.CPN_NO between", value1, value2, "cpnNo");
            return (Criteria) this;
        }

        public Criteria andCpnNoNotBetween(String value1, String value2) {
            addCriterion("TCPN.CPN_NO not between", value1, value2, "cpnNo");
            return (Criteria) this;
        }

        public Criteria andCpnNmIsNull() {
            addCriterion("TCPN.CPN_NM is null");
            return (Criteria) this;
        }

        public Criteria andCpnNmIsNotNull() {
            addCriterion("TCPN.CPN_NM is not null");
            return (Criteria) this;
        }

        public Criteria andCpnNmEqualTo(String value) {
            addCriterion("TCPN.CPN_NM =", value, "cpnNm");
            return (Criteria) this;
        }

        public Criteria andCpnNmNotEqualTo(String value) {
            addCriterion("TCPN.CPN_NM <>", value, "cpnNm");
            return (Criteria) this;
        }

        public Criteria andCpnNmGreaterThan(String value) {
            addCriterion("TCPN.CPN_NM >", value, "cpnNm");
            return (Criteria) this;
        }

        public Criteria andCpnNmGreaterThanOrEqualTo(String value) {
            addCriterion("TCPN.CPN_NM >=", value, "cpnNm");
            return (Criteria) this;
        }

        public Criteria andCpnNmLessThan(String value) {
            addCriterion("TCPN.CPN_NM <", value, "cpnNm");
            return (Criteria) this;
        }

        public Criteria andCpnNmLessThanOrEqualTo(String value) {
            addCriterion("TCPN.CPN_NM <=", value, "cpnNm");
            return (Criteria) this;
        }

        public Criteria andCpnNmLike(String value) {
            addCriterion("TCPN.CPN_NM like", value, "cpnNm");
            return (Criteria) this;
        }

        public Criteria andCpnNmNotLike(String value) {
            addCriterion("TCPN.CPN_NM not like", value, "cpnNm");
            return (Criteria) this;
        }

        public Criteria andCpnNmIn(List<String> values) {
            addCriterion("TCPN.CPN_NM in", values, "cpnNm");
            return (Criteria) this;
        }

        public Criteria andCpnNmNotIn(List<String> values) {
            addCriterion("TCPN.CPN_NM not in", values, "cpnNm");
            return (Criteria) this;
        }

        public Criteria andCpnNmBetween(String value1, String value2) {
            addCriterion("TCPN.CPN_NM between", value1, value2, "cpnNm");
            return (Criteria) this;
        }

        public Criteria andCpnNmNotBetween(String value1, String value2) {
            addCriterion("TCPN.CPN_NM not between", value1, value2, "cpnNm");
            return (Criteria) this;
        }

        public Criteria andIsuTgtTpCdIsNull() {
            addCriterion("TCPN.ISU_TGT_TP_CD is null");
            return (Criteria) this;
        }

        public Criteria andIsuTgtTpCdIsNotNull() {
            addCriterion("TCPN.ISU_TGT_TP_CD is not null");
            return (Criteria) this;
        }

        public Criteria andIsuTgtTpCdEqualTo(String value) {
            addCriterion("TCPN.ISU_TGT_TP_CD =", value, "isuTgtTpCd");
            return (Criteria) this;
        }

        public Criteria andIsuTgtTpCdNotEqualTo(String value) {
            addCriterion("TCPN.ISU_TGT_TP_CD <>", value, "isuTgtTpCd");
            return (Criteria) this;
        }

        public Criteria andIsuTgtTpCdGreaterThan(String value) {
            addCriterion("TCPN.ISU_TGT_TP_CD >", value, "isuTgtTpCd");
            return (Criteria) this;
        }

        public Criteria andIsuTgtTpCdGreaterThanOrEqualTo(String value) {
            addCriterion("TCPN.ISU_TGT_TP_CD >=", value, "isuTgtTpCd");
            return (Criteria) this;
        }

        public Criteria andIsuTgtTpCdLessThan(String value) {
            addCriterion("TCPN.ISU_TGT_TP_CD <", value, "isuTgtTpCd");
            return (Criteria) this;
        }

        public Criteria andIsuTgtTpCdLessThanOrEqualTo(String value) {
            addCriterion("TCPN.ISU_TGT_TP_CD <=", value, "isuTgtTpCd");
            return (Criteria) this;
        }

        public Criteria andIsuTgtTpCdLike(String value) {
            addCriterion("TCPN.ISU_TGT_TP_CD like", value, "isuTgtTpCd");
            return (Criteria) this;
        }

        public Criteria andIsuTgtTpCdNotLike(String value) {
            addCriterion("TCPN.ISU_TGT_TP_CD not like", value, "isuTgtTpCd");
            return (Criteria) this;
        }

        public Criteria andIsuTgtTpCdIn(List<String> values) {
            addCriterion("TCPN.ISU_TGT_TP_CD in", values, "isuTgtTpCd");
            return (Criteria) this;
        }

        public Criteria andIsuTgtTpCdNotIn(List<String> values) {
            addCriterion("TCPN.ISU_TGT_TP_CD not in", values, "isuTgtTpCd");
            return (Criteria) this;
        }

        public Criteria andIsuTgtTpCdBetween(String value1, String value2) {
            addCriterion("TCPN.ISU_TGT_TP_CD between", value1, value2, "isuTgtTpCd");
            return (Criteria) this;
        }

        public Criteria andIsuTgtTpCdNotBetween(String value1, String value2) {
            addCriterion("TCPN.ISU_TGT_TP_CD not between", value1, value2, "isuTgtTpCd");
            return (Criteria) this;
        }

        public Criteria andIsuTgtItemTpCdIsNull() {
            addCriterion("TCPN.ISU_TGT_ITEM_TP_CD is null");
            return (Criteria) this;
        }

        public Criteria andIsuTgtItemTpCdIsNotNull() {
            addCriterion("TCPN.ISU_TGT_ITEM_TP_CD is not null");
            return (Criteria) this;
        }

        public Criteria andIsuTgtItemTpCdEqualTo(String value) {
            addCriterion("TCPN.ISU_TGT_ITEM_TP_CD =", value, "isuTgtItemTpCd");
            return (Criteria) this;
        }

        public Criteria andIsuTgtItemTpCdNotEqualTo(String value) {
            addCriterion("TCPN.ISU_TGT_ITEM_TP_CD <>", value, "isuTgtItemTpCd");
            return (Criteria) this;
        }

        public Criteria andIsuTgtItemTpCdGreaterThan(String value) {
            addCriterion("TCPN.ISU_TGT_ITEM_TP_CD >", value, "isuTgtItemTpCd");
            return (Criteria) this;
        }

        public Criteria andIsuTgtItemTpCdGreaterThanOrEqualTo(String value) {
            addCriterion("TCPN.ISU_TGT_ITEM_TP_CD >=", value, "isuTgtItemTpCd");
            return (Criteria) this;
        }

        public Criteria andIsuTgtItemTpCdLessThan(String value) {
            addCriterion("TCPN.ISU_TGT_ITEM_TP_CD <", value, "isuTgtItemTpCd");
            return (Criteria) this;
        }

        public Criteria andIsuTgtItemTpCdLessThanOrEqualTo(String value) {
            addCriterion("TCPN.ISU_TGT_ITEM_TP_CD <=", value, "isuTgtItemTpCd");
            return (Criteria) this;
        }

        public Criteria andIsuTgtItemTpCdLike(String value) {
            addCriterion("TCPN.ISU_TGT_ITEM_TP_CD like", value, "isuTgtItemTpCd");
            return (Criteria) this;
        }

        public Criteria andIsuTgtItemTpCdNotLike(String value) {
            addCriterion("TCPN.ISU_TGT_ITEM_TP_CD not like", value, "isuTgtItemTpCd");
            return (Criteria) this;
        }

        public Criteria andIsuTgtItemTpCdIn(List<String> values) {
            addCriterion("TCPN.ISU_TGT_ITEM_TP_CD in", values, "isuTgtItemTpCd");
            return (Criteria) this;
        }

        public Criteria andIsuTgtItemTpCdNotIn(List<String> values) {
            addCriterion("TCPN.ISU_TGT_ITEM_TP_CD not in", values, "isuTgtItemTpCd");
            return (Criteria) this;
        }

        public Criteria andIsuTgtItemTpCdBetween(String value1, String value2) {
            addCriterion("TCPN.ISU_TGT_ITEM_TP_CD between", value1, value2, "isuTgtItemTpCd");
            return (Criteria) this;
        }

        public Criteria andIsuTgtItemTpCdNotBetween(String value1, String value2) {
            addCriterion("TCPN.ISU_TGT_ITEM_TP_CD not between", value1, value2, "isuTgtItemTpCd");
            return (Criteria) this;
        }

        public Criteria andIsuTgtMbrGrdCdIsNull() {
            addCriterion("TCPN.ISU_TGT_MBR_GRD_CD is null");
            return (Criteria) this;
        }

        public Criteria andIsuTgtMbrGrdCdIsNotNull() {
            addCriterion("TCPN.ISU_TGT_MBR_GRD_CD is not null");
            return (Criteria) this;
        }

        public Criteria andIsuTgtMbrGrdCdEqualTo(String value) {
            addCriterion("TCPN.ISU_TGT_MBR_GRD_CD =", value, "isuTgtMbrGrdCd");
            return (Criteria) this;
        }

        public Criteria andIsuTgtMbrGrdCdNotEqualTo(String value) {
            addCriterion("TCPN.ISU_TGT_MBR_GRD_CD <>", value, "isuTgtMbrGrdCd");
            return (Criteria) this;
        }

        public Criteria andIsuTgtMbrGrdCdGreaterThan(String value) {
            addCriterion("TCPN.ISU_TGT_MBR_GRD_CD >", value, "isuTgtMbrGrdCd");
            return (Criteria) this;
        }

        public Criteria andIsuTgtMbrGrdCdGreaterThanOrEqualTo(String value) {
            addCriterion("TCPN.ISU_TGT_MBR_GRD_CD >=", value, "isuTgtMbrGrdCd");
            return (Criteria) this;
        }

        public Criteria andIsuTgtMbrGrdCdLessThan(String value) {
            addCriterion("TCPN.ISU_TGT_MBR_GRD_CD <", value, "isuTgtMbrGrdCd");
            return (Criteria) this;
        }

        public Criteria andIsuTgtMbrGrdCdLessThanOrEqualTo(String value) {
            addCriterion("TCPN.ISU_TGT_MBR_GRD_CD <=", value, "isuTgtMbrGrdCd");
            return (Criteria) this;
        }

        public Criteria andIsuTgtMbrGrdCdLike(String value) {
            addCriterion("TCPN.ISU_TGT_MBR_GRD_CD like", value, "isuTgtMbrGrdCd");
            return (Criteria) this;
        }

        public Criteria andIsuTgtMbrGrdCdNotLike(String value) {
            addCriterion("TCPN.ISU_TGT_MBR_GRD_CD not like", value, "isuTgtMbrGrdCd");
            return (Criteria) this;
        }

        public Criteria andIsuTgtMbrGrdCdIn(List<String> values) {
            addCriterion("TCPN.ISU_TGT_MBR_GRD_CD in", values, "isuTgtMbrGrdCd");
            return (Criteria) this;
        }

        public Criteria andIsuTgtMbrGrdCdNotIn(List<String> values) {
            addCriterion("TCPN.ISU_TGT_MBR_GRD_CD not in", values, "isuTgtMbrGrdCd");
            return (Criteria) this;
        }

        public Criteria andIsuTgtMbrGrdCdBetween(String value1, String value2) {
            addCriterion("TCPN.ISU_TGT_MBR_GRD_CD between", value1, value2, "isuTgtMbrGrdCd");
            return (Criteria) this;
        }

        public Criteria andIsuTgtMbrGrdCdNotBetween(String value1, String value2) {
            addCriterion("TCPN.ISU_TGT_MBR_GRD_CD not between", value1, value2, "isuTgtMbrGrdCd");
            return (Criteria) this;
        }

        public Criteria andIsuMethTpCdIsNull() {
            addCriterion("TCPN.ISU_METH_TP_CD is null");
            return (Criteria) this;
        }

        public Criteria andIsuMethTpCdIsNotNull() {
            addCriterion("TCPN.ISU_METH_TP_CD is not null");
            return (Criteria) this;
        }

        public Criteria andIsuMethTpCdEqualTo(String value) {
            addCriterion("TCPN.ISU_METH_TP_CD =", value, "isuMethTpCd");
            return (Criteria) this;
        }

        public Criteria andIsuMethTpCdNotEqualTo(String value) {
            addCriterion("TCPN.ISU_METH_TP_CD <>", value, "isuMethTpCd");
            return (Criteria) this;
        }

        public Criteria andIsuMethTpCdGreaterThan(String value) {
            addCriterion("TCPN.ISU_METH_TP_CD >", value, "isuMethTpCd");
            return (Criteria) this;
        }

        public Criteria andIsuMethTpCdGreaterThanOrEqualTo(String value) {
            addCriterion("TCPN.ISU_METH_TP_CD >=", value, "isuMethTpCd");
            return (Criteria) this;
        }

        public Criteria andIsuMethTpCdLessThan(String value) {
            addCriterion("TCPN.ISU_METH_TP_CD <", value, "isuMethTpCd");
            return (Criteria) this;
        }

        public Criteria andIsuMethTpCdLessThanOrEqualTo(String value) {
            addCriterion("TCPN.ISU_METH_TP_CD <=", value, "isuMethTpCd");
            return (Criteria) this;
        }

        public Criteria andIsuMethTpCdLike(String value) {
            addCriterion("TCPN.ISU_METH_TP_CD like", value, "isuMethTpCd");
            return (Criteria) this;
        }

        public Criteria andIsuMethTpCdNotLike(String value) {
            addCriterion("TCPN.ISU_METH_TP_CD not like", value, "isuMethTpCd");
            return (Criteria) this;
        }

        public Criteria andIsuMethTpCdIn(List<String> values) {
            addCriterion("TCPN.ISU_METH_TP_CD in", values, "isuMethTpCd");
            return (Criteria) this;
        }

        public Criteria andIsuMethTpCdNotIn(List<String> values) {
            addCriterion("TCPN.ISU_METH_TP_CD not in", values, "isuMethTpCd");
            return (Criteria) this;
        }

        public Criteria andIsuMethTpCdBetween(String value1, String value2) {
            addCriterion("TCPN.ISU_METH_TP_CD between", value1, value2, "isuMethTpCd");
            return (Criteria) this;
        }

        public Criteria andIsuMethTpCdNotBetween(String value1, String value2) {
            addCriterion("TCPN.ISU_METH_TP_CD not between", value1, value2, "isuMethTpCd");
            return (Criteria) this;
        }

        public Criteria andIsuMethDlTpCdIsNull() {
            addCriterion("TCPN.ISU_METH_DL_TP_CD is null");
            return (Criteria) this;
        }

        public Criteria andIsuMethDlTpCdIsNotNull() {
            addCriterion("TCPN.ISU_METH_DL_TP_CD is not null");
            return (Criteria) this;
        }

        public Criteria andIsuMethDlTpCdEqualTo(String value) {
            addCriterion("TCPN.ISU_METH_DL_TP_CD =", value, "isuMethDlTpCd");
            return (Criteria) this;
        }

        public Criteria andIsuMethDlTpCdNotEqualTo(String value) {
            addCriterion("TCPN.ISU_METH_DL_TP_CD <>", value, "isuMethDlTpCd");
            return (Criteria) this;
        }

        public Criteria andIsuMethDlTpCdGreaterThan(String value) {
            addCriterion("TCPN.ISU_METH_DL_TP_CD >", value, "isuMethDlTpCd");
            return (Criteria) this;
        }

        public Criteria andIsuMethDlTpCdGreaterThanOrEqualTo(String value) {
            addCriterion("TCPN.ISU_METH_DL_TP_CD >=", value, "isuMethDlTpCd");
            return (Criteria) this;
        }

        public Criteria andIsuMethDlTpCdLessThan(String value) {
            addCriterion("TCPN.ISU_METH_DL_TP_CD <", value, "isuMethDlTpCd");
            return (Criteria) this;
        }

        public Criteria andIsuMethDlTpCdLessThanOrEqualTo(String value) {
            addCriterion("TCPN.ISU_METH_DL_TP_CD <=", value, "isuMethDlTpCd");
            return (Criteria) this;
        }

        public Criteria andIsuMethDlTpCdLike(String value) {
            addCriterion("TCPN.ISU_METH_DL_TP_CD like", value, "isuMethDlTpCd");
            return (Criteria) this;
        }

        public Criteria andIsuMethDlTpCdNotLike(String value) {
            addCriterion("TCPN.ISU_METH_DL_TP_CD not like", value, "isuMethDlTpCd");
            return (Criteria) this;
        }

        public Criteria andIsuMethDlTpCdIn(List<String> values) {
            addCriterion("TCPN.ISU_METH_DL_TP_CD in", values, "isuMethDlTpCd");
            return (Criteria) this;
        }

        public Criteria andIsuMethDlTpCdNotIn(List<String> values) {
            addCriterion("TCPN.ISU_METH_DL_TP_CD not in", values, "isuMethDlTpCd");
            return (Criteria) this;
        }

        public Criteria andIsuMethDlTpCdBetween(String value1, String value2) {
            addCriterion("TCPN.ISU_METH_DL_TP_CD between", value1, value2, "isuMethDlTpCd");
            return (Criteria) this;
        }

        public Criteria andIsuMethDlTpCdNotBetween(String value1, String value2) {
            addCriterion("TCPN.ISU_METH_DL_TP_CD not between", value1, value2, "isuMethDlTpCd");
            return (Criteria) this;
        }

        public Criteria andIsuMethRdnbTpCdIsNull() {
            addCriterion("TCPN.ISU_METH_RDNB_TP_CD is null");
            return (Criteria) this;
        }

        public Criteria andIsuMethRdnbTpCdIsNotNull() {
            addCriterion("TCPN.ISU_METH_RDNB_TP_CD is not null");
            return (Criteria) this;
        }

        public Criteria andIsuMethRdnbTpCdEqualTo(String value) {
            addCriterion("TCPN.ISU_METH_RDNB_TP_CD =", value, "isuMethRdnbTpCd");
            return (Criteria) this;
        }

        public Criteria andIsuMethRdnbTpCdNotEqualTo(String value) {
            addCriterion("TCPN.ISU_METH_RDNB_TP_CD <>", value, "isuMethRdnbTpCd");
            return (Criteria) this;
        }

        public Criteria andIsuMethRdnbTpCdGreaterThan(String value) {
            addCriterion("TCPN.ISU_METH_RDNB_TP_CD >", value, "isuMethRdnbTpCd");
            return (Criteria) this;
        }

        public Criteria andIsuMethRdnbTpCdGreaterThanOrEqualTo(String value) {
            addCriterion("TCPN.ISU_METH_RDNB_TP_CD >=", value, "isuMethRdnbTpCd");
            return (Criteria) this;
        }

        public Criteria andIsuMethRdnbTpCdLessThan(String value) {
            addCriterion("TCPN.ISU_METH_RDNB_TP_CD <", value, "isuMethRdnbTpCd");
            return (Criteria) this;
        }

        public Criteria andIsuMethRdnbTpCdLessThanOrEqualTo(String value) {
            addCriterion("TCPN.ISU_METH_RDNB_TP_CD <=", value, "isuMethRdnbTpCd");
            return (Criteria) this;
        }

        public Criteria andIsuMethRdnbTpCdLike(String value) {
            addCriterion("TCPN.ISU_METH_RDNB_TP_CD like", value, "isuMethRdnbTpCd");
            return (Criteria) this;
        }

        public Criteria andIsuMethRdnbTpCdNotLike(String value) {
            addCriterion("TCPN.ISU_METH_RDNB_TP_CD not like", value, "isuMethRdnbTpCd");
            return (Criteria) this;
        }

        public Criteria andIsuMethRdnbTpCdIn(List<String> values) {
            addCriterion("TCPN.ISU_METH_RDNB_TP_CD in", values, "isuMethRdnbTpCd");
            return (Criteria) this;
        }

        public Criteria andIsuMethRdnbTpCdNotIn(List<String> values) {
            addCriterion("TCPN.ISU_METH_RDNB_TP_CD not in", values, "isuMethRdnbTpCd");
            return (Criteria) this;
        }

        public Criteria andIsuMethRdnbTpCdBetween(String value1, String value2) {
            addCriterion("TCPN.ISU_METH_RDNB_TP_CD between", value1, value2, "isuMethRdnbTpCd");
            return (Criteria) this;
        }

        public Criteria andIsuMethRdnbTpCdNotBetween(String value1, String value2) {
            addCriterion("TCPN.ISU_METH_RDNB_TP_CD not between", value1, value2, "isuMethRdnbTpCd");
            return (Criteria) this;
        }

        public Criteria andIsuUrlIsNull() {
            addCriterion("TCPN.ISU_URL is null");
            return (Criteria) this;
        }

        public Criteria andIsuUrlIsNotNull() {
            addCriterion("TCPN.ISU_URL is not null");
            return (Criteria) this;
        }

        public Criteria andIsuUrlEqualTo(String value) {
            addCriterion("TCPN.ISU_URL =", value, "isuUrl");
            return (Criteria) this;
        }

        public Criteria andIsuUrlNotEqualTo(String value) {
            addCriterion("TCPN.ISU_URL <>", value, "isuUrl");
            return (Criteria) this;
        }

        public Criteria andIsuUrlGreaterThan(String value) {
            addCriterion("TCPN.ISU_URL >", value, "isuUrl");
            return (Criteria) this;
        }

        public Criteria andIsuUrlGreaterThanOrEqualTo(String value) {
            addCriterion("TCPN.ISU_URL >=", value, "isuUrl");
            return (Criteria) this;
        }

        public Criteria andIsuUrlLessThan(String value) {
            addCriterion("TCPN.ISU_URL <", value, "isuUrl");
            return (Criteria) this;
        }

        public Criteria andIsuUrlLessThanOrEqualTo(String value) {
            addCriterion("TCPN.ISU_URL <=", value, "isuUrl");
            return (Criteria) this;
        }

        public Criteria andIsuUrlLike(String value) {
            addCriterion("TCPN.ISU_URL like", value, "isuUrl");
            return (Criteria) this;
        }

        public Criteria andIsuUrlNotLike(String value) {
            addCriterion("TCPN.ISU_URL not like", value, "isuUrl");
            return (Criteria) this;
        }

        public Criteria andIsuUrlIn(List<String> values) {
            addCriterion("TCPN.ISU_URL in", values, "isuUrl");
            return (Criteria) this;
        }

        public Criteria andIsuUrlNotIn(List<String> values) {
            addCriterion("TCPN.ISU_URL not in", values, "isuUrl");
            return (Criteria) this;
        }

        public Criteria andIsuUrlBetween(String value1, String value2) {
            addCriterion("TCPN.ISU_URL between", value1, value2, "isuUrl");
            return (Criteria) this;
        }

        public Criteria andIsuUrlNotBetween(String value1, String value2) {
            addCriterion("TCPN.ISU_URL not between", value1, value2, "isuUrl");
            return (Criteria) this;
        }

        public Criteria andIsuFixRdnbNoIsNull() {
            addCriterion("TCPN.ISU_FIX_RDNB_NO is null");
            return (Criteria) this;
        }

        public Criteria andIsuFixRdnbNoIsNotNull() {
            addCriterion("TCPN.ISU_FIX_RDNB_NO is not null");
            return (Criteria) this;
        }

        public Criteria andIsuFixRdnbNoEqualTo(String value) {
            addCriterion("TCPN.ISU_FIX_RDNB_NO =", value, "isuFixRdnbNo");
            return (Criteria) this;
        }

        public Criteria andIsuFixRdnbNoNotEqualTo(String value) {
            addCriterion("TCPN.ISU_FIX_RDNB_NO <>", value, "isuFixRdnbNo");
            return (Criteria) this;
        }

        public Criteria andIsuFixRdnbNoGreaterThan(String value) {
            addCriterion("TCPN.ISU_FIX_RDNB_NO >", value, "isuFixRdnbNo");
            return (Criteria) this;
        }

        public Criteria andIsuFixRdnbNoGreaterThanOrEqualTo(String value) {
            addCriterion("TCPN.ISU_FIX_RDNB_NO >=", value, "isuFixRdnbNo");
            return (Criteria) this;
        }

        public Criteria andIsuFixRdnbNoLessThan(String value) {
            addCriterion("TCPN.ISU_FIX_RDNB_NO <", value, "isuFixRdnbNo");
            return (Criteria) this;
        }

        public Criteria andIsuFixRdnbNoLessThanOrEqualTo(String value) {
            addCriterion("TCPN.ISU_FIX_RDNB_NO <=", value, "isuFixRdnbNo");
            return (Criteria) this;
        }

        public Criteria andIsuFixRdnbNoLike(String value) {
            addCriterion("TCPN.ISU_FIX_RDNB_NO like", value, "isuFixRdnbNo");
            return (Criteria) this;
        }

        public Criteria andIsuFixRdnbNoNotLike(String value) {
            addCriterion("TCPN.ISU_FIX_RDNB_NO not like", value, "isuFixRdnbNo");
            return (Criteria) this;
        }

        public Criteria andIsuFixRdnbNoIn(List<String> values) {
            addCriterion("TCPN.ISU_FIX_RDNB_NO in", values, "isuFixRdnbNo");
            return (Criteria) this;
        }

        public Criteria andIsuFixRdnbNoNotIn(List<String> values) {
            addCriterion("TCPN.ISU_FIX_RDNB_NO not in", values, "isuFixRdnbNo");
            return (Criteria) this;
        }

        public Criteria andIsuFixRdnbNoBetween(String value1, String value2) {
            addCriterion("TCPN.ISU_FIX_RDNB_NO between", value1, value2, "isuFixRdnbNo");
            return (Criteria) this;
        }

        public Criteria andIsuFixRdnbNoNotBetween(String value1, String value2) {
            addCriterion("TCPN.ISU_FIX_RDNB_NO not between", value1, value2, "isuFixRdnbNo");
            return (Criteria) this;
        }

        public Criteria andIsuResQtyYnIsNull() {
            addCriterion("TCPN.ISU_RES_QTY_YN is null");
            return (Criteria) this;
        }

        public Criteria andIsuResQtyYnIsNotNull() {
            addCriterion("TCPN.ISU_RES_QTY_YN is not null");
            return (Criteria) this;
        }

        public Criteria andIsuResQtyYnEqualTo(String value) {
            addCriterion("TCPN.ISU_RES_QTY_YN =", value, "isuResQtyYn");
            return (Criteria) this;
        }

        public Criteria andIsuResQtyYnNotEqualTo(String value) {
            addCriterion("TCPN.ISU_RES_QTY_YN <>", value, "isuResQtyYn");
            return (Criteria) this;
        }

        public Criteria andIsuResQtyYnGreaterThan(String value) {
            addCriterion("TCPN.ISU_RES_QTY_YN >", value, "isuResQtyYn");
            return (Criteria) this;
        }

        public Criteria andIsuResQtyYnGreaterThanOrEqualTo(String value) {
            addCriterion("TCPN.ISU_RES_QTY_YN >=", value, "isuResQtyYn");
            return (Criteria) this;
        }

        public Criteria andIsuResQtyYnLessThan(String value) {
            addCriterion("TCPN.ISU_RES_QTY_YN <", value, "isuResQtyYn");
            return (Criteria) this;
        }

        public Criteria andIsuResQtyYnLessThanOrEqualTo(String value) {
            addCriterion("TCPN.ISU_RES_QTY_YN <=", value, "isuResQtyYn");
            return (Criteria) this;
        }

        public Criteria andIsuResQtyYnLike(String value) {
            addCriterion("TCPN.ISU_RES_QTY_YN like", value, "isuResQtyYn");
            return (Criteria) this;
        }

        public Criteria andIsuResQtyYnNotLike(String value) {
            addCriterion("TCPN.ISU_RES_QTY_YN not like", value, "isuResQtyYn");
            return (Criteria) this;
        }

        public Criteria andIsuResQtyYnIn(List<String> values) {
            addCriterion("TCPN.ISU_RES_QTY_YN in", values, "isuResQtyYn");
            return (Criteria) this;
        }

        public Criteria andIsuResQtyYnNotIn(List<String> values) {
            addCriterion("TCPN.ISU_RES_QTY_YN not in", values, "isuResQtyYn");
            return (Criteria) this;
        }

        public Criteria andIsuResQtyYnBetween(String value1, String value2) {
            addCriterion("TCPN.ISU_RES_QTY_YN between", value1, value2, "isuResQtyYn");
            return (Criteria) this;
        }

        public Criteria andIsuResQtyYnNotBetween(String value1, String value2) {
            addCriterion("TCPN.ISU_RES_QTY_YN not between", value1, value2, "isuResQtyYn");
            return (Criteria) this;
        }

        public Criteria andIsuResQtyIsNull() {
            addCriterion("TCPN.ISU_RES_QTY is null");
            return (Criteria) this;
        }

        public Criteria andIsuResQtyIsNotNull() {
            addCriterion("TCPN.ISU_RES_QTY is not null");
            return (Criteria) this;
        }

        public Criteria andIsuResQtyEqualTo(Integer value) {
            addCriterion("TCPN.ISU_RES_QTY =", value, "isuResQty");
            return (Criteria) this;
        }

        public Criteria andIsuResQtyNotEqualTo(Integer value) {
            addCriterion("TCPN.ISU_RES_QTY <>", value, "isuResQty");
            return (Criteria) this;
        }

        public Criteria andIsuResQtyGreaterThan(Integer value) {
            addCriterion("TCPN.ISU_RES_QTY >", value, "isuResQty");
            return (Criteria) this;
        }

        public Criteria andIsuResQtyGreaterThanOrEqualTo(Integer value) {
            addCriterion("TCPN.ISU_RES_QTY >=", value, "isuResQty");
            return (Criteria) this;
        }

        public Criteria andIsuResQtyLessThan(Integer value) {
            addCriterion("TCPN.ISU_RES_QTY <", value, "isuResQty");
            return (Criteria) this;
        }

        public Criteria andIsuResQtyLessThanOrEqualTo(Integer value) {
            addCriterion("TCPN.ISU_RES_QTY <=", value, "isuResQty");
            return (Criteria) this;
        }

        public Criteria andIsuResQtyIn(List<Integer> values) {
            addCriterion("TCPN.ISU_RES_QTY in", values, "isuResQty");
            return (Criteria) this;
        }

        public Criteria andIsuResQtyNotIn(List<Integer> values) {
            addCriterion("TCPN.ISU_RES_QTY not in", values, "isuResQty");
            return (Criteria) this;
        }

        public Criteria andIsuResQtyBetween(Integer value1, Integer value2) {
            addCriterion("TCPN.ISU_RES_QTY between", value1, value2, "isuResQty");
            return (Criteria) this;
        }

        public Criteria andIsuResQtyNotBetween(Integer value1, Integer value2) {
            addCriterion("TCPN.ISU_RES_QTY not between", value1, value2, "isuResQty");
            return (Criteria) this;
        }

        public Criteria andVldPerdTpCdIsNull() {
            addCriterion("TCPN.VLD_PERD_TP_CD is null");
            return (Criteria) this;
        }

        public Criteria andVldPerdTpCdIsNotNull() {
            addCriterion("TCPN.VLD_PERD_TP_CD is not null");
            return (Criteria) this;
        }

        public Criteria andVldPerdTpCdEqualTo(String value) {
            addCriterion("TCPN.VLD_PERD_TP_CD =", value, "vldPerdTpCd");
            return (Criteria) this;
        }

        public Criteria andVldPerdTpCdNotEqualTo(String value) {
            addCriterion("TCPN.VLD_PERD_TP_CD <>", value, "vldPerdTpCd");
            return (Criteria) this;
        }

        public Criteria andVldPerdTpCdGreaterThan(String value) {
            addCriterion("TCPN.VLD_PERD_TP_CD >", value, "vldPerdTpCd");
            return (Criteria) this;
        }

        public Criteria andVldPerdTpCdGreaterThanOrEqualTo(String value) {
            addCriterion("TCPN.VLD_PERD_TP_CD >=", value, "vldPerdTpCd");
            return (Criteria) this;
        }

        public Criteria andVldPerdTpCdLessThan(String value) {
            addCriterion("TCPN.VLD_PERD_TP_CD <", value, "vldPerdTpCd");
            return (Criteria) this;
        }

        public Criteria andVldPerdTpCdLessThanOrEqualTo(String value) {
            addCriterion("TCPN.VLD_PERD_TP_CD <=", value, "vldPerdTpCd");
            return (Criteria) this;
        }

        public Criteria andVldPerdTpCdLike(String value) {
            addCriterion("TCPN.VLD_PERD_TP_CD like", value, "vldPerdTpCd");
            return (Criteria) this;
        }

        public Criteria andVldPerdTpCdNotLike(String value) {
            addCriterion("TCPN.VLD_PERD_TP_CD not like", value, "vldPerdTpCd");
            return (Criteria) this;
        }

        public Criteria andVldPerdTpCdIn(List<String> values) {
            addCriterion("TCPN.VLD_PERD_TP_CD in", values, "vldPerdTpCd");
            return (Criteria) this;
        }

        public Criteria andVldPerdTpCdNotIn(List<String> values) {
            addCriterion("TCPN.VLD_PERD_TP_CD not in", values, "vldPerdTpCd");
            return (Criteria) this;
        }

        public Criteria andVldPerdTpCdBetween(String value1, String value2) {
            addCriterion("TCPN.VLD_PERD_TP_CD between", value1, value2, "vldPerdTpCd");
            return (Criteria) this;
        }

        public Criteria andVldPerdTpCdNotBetween(String value1, String value2) {
            addCriterion("TCPN.VLD_PERD_TP_CD not between", value1, value2, "vldPerdTpCd");
            return (Criteria) this;
        }

        public Criteria andVldPerdStYmdIsNull() {
            addCriterion("TCPN.VLD_PERD_ST_YMD is null");
            return (Criteria) this;
        }

        public Criteria andVldPerdStYmdIsNotNull() {
            addCriterion("TCPN.VLD_PERD_ST_YMD is not null");
            return (Criteria) this;
        }

        public Criteria andVldPerdStYmdEqualTo(String value) {
            addCriterion("TCPN.VLD_PERD_ST_YMD =", value, "vldPerdStYmd");
            return (Criteria) this;
        }

        public Criteria andVldPerdStYmdNotEqualTo(String value) {
            addCriterion("TCPN.VLD_PERD_ST_YMD <>", value, "vldPerdStYmd");
            return (Criteria) this;
        }

        public Criteria andVldPerdStYmdGreaterThan(String value) {
            addCriterion("TCPN.VLD_PERD_ST_YMD >", value, "vldPerdStYmd");
            return (Criteria) this;
        }

        public Criteria andVldPerdStYmdGreaterThanOrEqualTo(String value) {
            addCriterion("TCPN.VLD_PERD_ST_YMD >=", value, "vldPerdStYmd");
            return (Criteria) this;
        }

        public Criteria andVldPerdStYmdLessThan(String value) {
            addCriterion("TCPN.VLD_PERD_ST_YMD <", value, "vldPerdStYmd");
            return (Criteria) this;
        }

        public Criteria andVldPerdStYmdLessThanOrEqualTo(String value) {
            addCriterion("TCPN.VLD_PERD_ST_YMD <=", value, "vldPerdStYmd");
            return (Criteria) this;
        }

        public Criteria andVldPerdStYmdLike(String value) {
            addCriterion("TCPN.VLD_PERD_ST_YMD like", value, "vldPerdStYmd");
            return (Criteria) this;
        }

        public Criteria andVldPerdStYmdNotLike(String value) {
            addCriterion("TCPN.VLD_PERD_ST_YMD not like", value, "vldPerdStYmd");
            return (Criteria) this;
        }

        public Criteria andVldPerdStYmdIn(List<String> values) {
            addCriterion("TCPN.VLD_PERD_ST_YMD in", values, "vldPerdStYmd");
            return (Criteria) this;
        }

        public Criteria andVldPerdStYmdNotIn(List<String> values) {
            addCriterion("TCPN.VLD_PERD_ST_YMD not in", values, "vldPerdStYmd");
            return (Criteria) this;
        }

        public Criteria andVldPerdStYmdBetween(String value1, String value2) {
            addCriterion("TCPN.VLD_PERD_ST_YMD between", value1, value2, "vldPerdStYmd");
            return (Criteria) this;
        }

        public Criteria andVldPerdStYmdNotBetween(String value1, String value2) {
            addCriterion("TCPN.VLD_PERD_ST_YMD not between", value1, value2, "vldPerdStYmd");
            return (Criteria) this;
        }

        public Criteria andVldPerdEdYmdIsNull() {
            addCriterion("TCPN.VLD_PERD_ED_YMD is null");
            return (Criteria) this;
        }

        public Criteria andVldPerdEdYmdIsNotNull() {
            addCriterion("TCPN.VLD_PERD_ED_YMD is not null");
            return (Criteria) this;
        }

        public Criteria andVldPerdEdYmdEqualTo(String value) {
            addCriterion("TCPN.VLD_PERD_ED_YMD =", value, "vldPerdEdYmd");
            return (Criteria) this;
        }

        public Criteria andVldPerdEdYmdNotEqualTo(String value) {
            addCriterion("TCPN.VLD_PERD_ED_YMD <>", value, "vldPerdEdYmd");
            return (Criteria) this;
        }

        public Criteria andVldPerdEdYmdGreaterThan(String value) {
            addCriterion("TCPN.VLD_PERD_ED_YMD >", value, "vldPerdEdYmd");
            return (Criteria) this;
        }

        public Criteria andVldPerdEdYmdGreaterThanOrEqualTo(String value) {
            addCriterion("TCPN.VLD_PERD_ED_YMD >=", value, "vldPerdEdYmd");
            return (Criteria) this;
        }

        public Criteria andVldPerdEdYmdLessThan(String value) {
            addCriterion("TCPN.VLD_PERD_ED_YMD <", value, "vldPerdEdYmd");
            return (Criteria) this;
        }

        public Criteria andVldPerdEdYmdLessThanOrEqualTo(String value) {
            addCriterion("TCPN.VLD_PERD_ED_YMD <=", value, "vldPerdEdYmd");
            return (Criteria) this;
        }

        public Criteria andVldPerdEdYmdLike(String value) {
            addCriterion("TCPN.VLD_PERD_ED_YMD like", value, "vldPerdEdYmd");
            return (Criteria) this;
        }

        public Criteria andVldPerdEdYmdNotLike(String value) {
            addCriterion("TCPN.VLD_PERD_ED_YMD not like", value, "vldPerdEdYmd");
            return (Criteria) this;
        }

        public Criteria andVldPerdEdYmdIn(List<String> values) {
            addCriterion("TCPN.VLD_PERD_ED_YMD in", values, "vldPerdEdYmd");
            return (Criteria) this;
        }

        public Criteria andVldPerdEdYmdNotIn(List<String> values) {
            addCriterion("TCPN.VLD_PERD_ED_YMD not in", values, "vldPerdEdYmd");
            return (Criteria) this;
        }

        public Criteria andVldPerdEdYmdBetween(String value1, String value2) {
            addCriterion("TCPN.VLD_PERD_ED_YMD between", value1, value2, "vldPerdEdYmd");
            return (Criteria) this;
        }

        public Criteria andVldPerdEdYmdNotBetween(String value1, String value2) {
            addCriterion("TCPN.VLD_PERD_ED_YMD not between", value1, value2, "vldPerdEdYmd");
            return (Criteria) this;
        }

        public Criteria andVldPerdUseStdCdIsNull() {
            addCriterion("TCPN.VLD_PERD_USE_STD_CD is null");
            return (Criteria) this;
        }

        public Criteria andVldPerdUseStdCdIsNotNull() {
            addCriterion("TCPN.VLD_PERD_USE_STD_CD is not null");
            return (Criteria) this;
        }

        public Criteria andVldPerdUseStdCdEqualTo(String value) {
            addCriterion("TCPN.VLD_PERD_USE_STD_CD =", value, "vldPerdUseStdCd");
            return (Criteria) this;
        }

        public Criteria andVldPerdUseStdCdNotEqualTo(String value) {
            addCriterion("TCPN.VLD_PERD_USE_STD_CD <>", value, "vldPerdUseStdCd");
            return (Criteria) this;
        }

        public Criteria andVldPerdUseStdCdGreaterThan(String value) {
            addCriterion("TCPN.VLD_PERD_USE_STD_CD >", value, "vldPerdUseStdCd");
            return (Criteria) this;
        }

        public Criteria andVldPerdUseStdCdGreaterThanOrEqualTo(String value) {
            addCriterion("TCPN.VLD_PERD_USE_STD_CD >=", value, "vldPerdUseStdCd");
            return (Criteria) this;
        }

        public Criteria andVldPerdUseStdCdLessThan(String value) {
            addCriterion("TCPN.VLD_PERD_USE_STD_CD <", value, "vldPerdUseStdCd");
            return (Criteria) this;
        }

        public Criteria andVldPerdUseStdCdLessThanOrEqualTo(String value) {
            addCriterion("TCPN.VLD_PERD_USE_STD_CD <=", value, "vldPerdUseStdCd");
            return (Criteria) this;
        }

        public Criteria andVldPerdUseStdCdLike(String value) {
            addCriterion("TCPN.VLD_PERD_USE_STD_CD like", value, "vldPerdUseStdCd");
            return (Criteria) this;
        }

        public Criteria andVldPerdUseStdCdNotLike(String value) {
            addCriterion("TCPN.VLD_PERD_USE_STD_CD not like", value, "vldPerdUseStdCd");
            return (Criteria) this;
        }

        public Criteria andVldPerdUseStdCdIn(List<String> values) {
            addCriterion("TCPN.VLD_PERD_USE_STD_CD in", values, "vldPerdUseStdCd");
            return (Criteria) this;
        }

        public Criteria andVldPerdUseStdCdNotIn(List<String> values) {
            addCriterion("TCPN.VLD_PERD_USE_STD_CD not in", values, "vldPerdUseStdCd");
            return (Criteria) this;
        }

        public Criteria andVldPerdUseStdCdBetween(String value1, String value2) {
            addCriterion("TCPN.VLD_PERD_USE_STD_CD between", value1, value2, "vldPerdUseStdCd");
            return (Criteria) this;
        }

        public Criteria andVldPerdUseStdCdNotBetween(String value1, String value2) {
            addCriterion("TCPN.VLD_PERD_USE_STD_CD not between", value1, value2, "vldPerdUseStdCd");
            return (Criteria) this;
        }

        public Criteria andVldPerdUseTpCdIsNull() {
            addCriterion("TCPN.VLD_PERD_USE_TP_CD is null");
            return (Criteria) this;
        }

        public Criteria andVldPerdUseTpCdIsNotNull() {
            addCriterion("TCPN.VLD_PERD_USE_TP_CD is not null");
            return (Criteria) this;
        }

        public Criteria andVldPerdUseTpCdEqualTo(String value) {
            addCriterion("TCPN.VLD_PERD_USE_TP_CD =", value, "vldPerdUseTpCd");
            return (Criteria) this;
        }

        public Criteria andVldPerdUseTpCdNotEqualTo(String value) {
            addCriterion("TCPN.VLD_PERD_USE_TP_CD <>", value, "vldPerdUseTpCd");
            return (Criteria) this;
        }

        public Criteria andVldPerdUseTpCdGreaterThan(String value) {
            addCriterion("TCPN.VLD_PERD_USE_TP_CD >", value, "vldPerdUseTpCd");
            return (Criteria) this;
        }

        public Criteria andVldPerdUseTpCdGreaterThanOrEqualTo(String value) {
            addCriterion("TCPN.VLD_PERD_USE_TP_CD >=", value, "vldPerdUseTpCd");
            return (Criteria) this;
        }

        public Criteria andVldPerdUseTpCdLessThan(String value) {
            addCriterion("TCPN.VLD_PERD_USE_TP_CD <", value, "vldPerdUseTpCd");
            return (Criteria) this;
        }

        public Criteria andVldPerdUseTpCdLessThanOrEqualTo(String value) {
            addCriterion("TCPN.VLD_PERD_USE_TP_CD <=", value, "vldPerdUseTpCd");
            return (Criteria) this;
        }

        public Criteria andVldPerdUseTpCdLike(String value) {
            addCriterion("TCPN.VLD_PERD_USE_TP_CD like", value, "vldPerdUseTpCd");
            return (Criteria) this;
        }

        public Criteria andVldPerdUseTpCdNotLike(String value) {
            addCriterion("TCPN.VLD_PERD_USE_TP_CD not like", value, "vldPerdUseTpCd");
            return (Criteria) this;
        }

        public Criteria andVldPerdUseTpCdIn(List<String> values) {
            addCriterion("TCPN.VLD_PERD_USE_TP_CD in", values, "vldPerdUseTpCd");
            return (Criteria) this;
        }

        public Criteria andVldPerdUseTpCdNotIn(List<String> values) {
            addCriterion("TCPN.VLD_PERD_USE_TP_CD not in", values, "vldPerdUseTpCd");
            return (Criteria) this;
        }

        public Criteria andVldPerdUseTpCdBetween(String value1, String value2) {
            addCriterion("TCPN.VLD_PERD_USE_TP_CD between", value1, value2, "vldPerdUseTpCd");
            return (Criteria) this;
        }

        public Criteria andVldPerdUseTpCdNotBetween(String value1, String value2) {
            addCriterion("TCPN.VLD_PERD_USE_TP_CD not between", value1, value2, "vldPerdUseTpCd");
            return (Criteria) this;
        }

        public Criteria andVldPerdUseDayCntIsNull() {
            addCriterion("TCPN.VLD_PERD_USE_DAY_CNT is null");
            return (Criteria) this;
        }

        public Criteria andVldPerdUseDayCntIsNotNull() {
            addCriterion("TCPN.VLD_PERD_USE_DAY_CNT is not null");
            return (Criteria) this;
        }

        public Criteria andVldPerdUseDayCntEqualTo(Integer value) {
            addCriterion("TCPN.VLD_PERD_USE_DAY_CNT =", value, "vldPerdUseDayCnt");
            return (Criteria) this;
        }

        public Criteria andVldPerdUseDayCntNotEqualTo(Integer value) {
            addCriterion("TCPN.VLD_PERD_USE_DAY_CNT <>", value, "vldPerdUseDayCnt");
            return (Criteria) this;
        }

        public Criteria andVldPerdUseDayCntGreaterThan(Integer value) {
            addCriterion("TCPN.VLD_PERD_USE_DAY_CNT >", value, "vldPerdUseDayCnt");
            return (Criteria) this;
        }

        public Criteria andVldPerdUseDayCntGreaterThanOrEqualTo(Integer value) {
            addCriterion("TCPN.VLD_PERD_USE_DAY_CNT >=", value, "vldPerdUseDayCnt");
            return (Criteria) this;
        }

        public Criteria andVldPerdUseDayCntLessThan(Integer value) {
            addCriterion("TCPN.VLD_PERD_USE_DAY_CNT <", value, "vldPerdUseDayCnt");
            return (Criteria) this;
        }

        public Criteria andVldPerdUseDayCntLessThanOrEqualTo(Integer value) {
            addCriterion("TCPN.VLD_PERD_USE_DAY_CNT <=", value, "vldPerdUseDayCnt");
            return (Criteria) this;
        }

        public Criteria andVldPerdUseDayCntIn(List<Integer> values) {
            addCriterion("TCPN.VLD_PERD_USE_DAY_CNT in", values, "vldPerdUseDayCnt");
            return (Criteria) this;
        }

        public Criteria andVldPerdUseDayCntNotIn(List<Integer> values) {
            addCriterion("TCPN.VLD_PERD_USE_DAY_CNT not in", values, "vldPerdUseDayCnt");
            return (Criteria) this;
        }

        public Criteria andVldPerdUseDayCntBetween(Integer value1, Integer value2) {
            addCriterion("TCPN.VLD_PERD_USE_DAY_CNT between", value1, value2, "vldPerdUseDayCnt");
            return (Criteria) this;
        }

        public Criteria andVldPerdUseDayCntNotBetween(Integer value1, Integer value2) {
            addCriterion("TCPN.VLD_PERD_USE_DAY_CNT not between", value1, value2, "vldPerdUseDayCnt");
            return (Criteria) this;
        }

        public Criteria andDcMethCdIsNull() {
            addCriterion("TCPN.DC_METH_CD is null");
            return (Criteria) this;
        }

        public Criteria andDcMethCdIsNotNull() {
            addCriterion("TCPN.DC_METH_CD is not null");
            return (Criteria) this;
        }

        public Criteria andDcMethCdEqualTo(String value) {
            addCriterion("TCPN.DC_METH_CD =", value, "dcMethCd");
            return (Criteria) this;
        }

        public Criteria andDcMethCdNotEqualTo(String value) {
            addCriterion("TCPN.DC_METH_CD <>", value, "dcMethCd");
            return (Criteria) this;
        }

        public Criteria andDcMethCdGreaterThan(String value) {
            addCriterion("TCPN.DC_METH_CD >", value, "dcMethCd");
            return (Criteria) this;
        }

        public Criteria andDcMethCdGreaterThanOrEqualTo(String value) {
            addCriterion("TCPN.DC_METH_CD >=", value, "dcMethCd");
            return (Criteria) this;
        }

        public Criteria andDcMethCdLessThan(String value) {
            addCriterion("TCPN.DC_METH_CD <", value, "dcMethCd");
            return (Criteria) this;
        }

        public Criteria andDcMethCdLessThanOrEqualTo(String value) {
            addCriterion("TCPN.DC_METH_CD <=", value, "dcMethCd");
            return (Criteria) this;
        }

        public Criteria andDcMethCdLike(String value) {
            addCriterion("TCPN.DC_METH_CD like", value, "dcMethCd");
            return (Criteria) this;
        }

        public Criteria andDcMethCdNotLike(String value) {
            addCriterion("TCPN.DC_METH_CD not like", value, "dcMethCd");
            return (Criteria) this;
        }

        public Criteria andDcMethCdIn(List<String> values) {
            addCriterion("TCPN.DC_METH_CD in", values, "dcMethCd");
            return (Criteria) this;
        }

        public Criteria andDcMethCdNotIn(List<String> values) {
            addCriterion("TCPN.DC_METH_CD not in", values, "dcMethCd");
            return (Criteria) this;
        }

        public Criteria andDcMethCdBetween(String value1, String value2) {
            addCriterion("TCPN.DC_METH_CD between", value1, value2, "dcMethCd");
            return (Criteria) this;
        }

        public Criteria andDcMethCdNotBetween(String value1, String value2) {
            addCriterion("TCPN.DC_METH_CD not between", value1, value2, "dcMethCd");
            return (Criteria) this;
        }

        public Criteria andDcAmtIsNull() {
            addCriterion("TCPN.DC_AMT is null");
            return (Criteria) this;
        }

        public Criteria andDcAmtIsNotNull() {
            addCriterion("TCPN.DC_AMT is not null");
            return (Criteria) this;
        }

        public Criteria andDcAmtEqualTo(Integer value) {
            addCriterion("TCPN.DC_AMT =", value, "dcAmt");
            return (Criteria) this;
        }

        public Criteria andDcAmtNotEqualTo(Integer value) {
            addCriterion("TCPN.DC_AMT <>", value, "dcAmt");
            return (Criteria) this;
        }

        public Criteria andDcAmtGreaterThan(Integer value) {
            addCriterion("TCPN.DC_AMT >", value, "dcAmt");
            return (Criteria) this;
        }

        public Criteria andDcAmtGreaterThanOrEqualTo(Integer value) {
            addCriterion("TCPN.DC_AMT >=", value, "dcAmt");
            return (Criteria) this;
        }

        public Criteria andDcAmtLessThan(Integer value) {
            addCriterion("TCPN.DC_AMT <", value, "dcAmt");
            return (Criteria) this;
        }

        public Criteria andDcAmtLessThanOrEqualTo(Integer value) {
            addCriterion("TCPN.DC_AMT <=", value, "dcAmt");
            return (Criteria) this;
        }

        public Criteria andDcAmtIn(List<Integer> values) {
            addCriterion("TCPN.DC_AMT in", values, "dcAmt");
            return (Criteria) this;
        }

        public Criteria andDcAmtNotIn(List<Integer> values) {
            addCriterion("TCPN.DC_AMT not in", values, "dcAmt");
            return (Criteria) this;
        }

        public Criteria andDcAmtBetween(Integer value1, Integer value2) {
            addCriterion("TCPN.DC_AMT between", value1, value2, "dcAmt");
            return (Criteria) this;
        }

        public Criteria andDcAmtNotBetween(Integer value1, Integer value2) {
            addCriterion("TCPN.DC_AMT not between", value1, value2, "dcAmt");
            return (Criteria) this;
        }

        public Criteria andDcRateIsNull() {
            addCriterion("TCPN.DC_RATE is null");
            return (Criteria) this;
        }

        public Criteria andDcRateIsNotNull() {
            addCriterion("TCPN.DC_RATE is not null");
            return (Criteria) this;
        }

        public Criteria andDcRateEqualTo(BigDecimal value) {
            addCriterion("TCPN.DC_RATE =", value, "dcRate");
            return (Criteria) this;
        }

        public Criteria andDcRateNotEqualTo(BigDecimal value) {
            addCriterion("TCPN.DC_RATE <>", value, "dcRate");
            return (Criteria) this;
        }

        public Criteria andDcRateGreaterThan(BigDecimal value) {
            addCriterion("TCPN.DC_RATE >", value, "dcRate");
            return (Criteria) this;
        }

        public Criteria andDcRateGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("TCPN.DC_RATE >=", value, "dcRate");
            return (Criteria) this;
        }

        public Criteria andDcRateLessThan(BigDecimal value) {
            addCriterion("TCPN.DC_RATE <", value, "dcRate");
            return (Criteria) this;
        }

        public Criteria andDcRateLessThanOrEqualTo(BigDecimal value) {
            addCriterion("TCPN.DC_RATE <=", value, "dcRate");
            return (Criteria) this;
        }

        public Criteria andDcRateIn(List<BigDecimal> values) {
            addCriterion("TCPN.DC_RATE in", values, "dcRate");
            return (Criteria) this;
        }

        public Criteria andDcRateNotIn(List<BigDecimal> values) {
            addCriterion("TCPN.DC_RATE not in", values, "dcRate");
            return (Criteria) this;
        }

        public Criteria andDcRateBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TCPN.DC_RATE between", value1, value2, "dcRate");
            return (Criteria) this;
        }

        public Criteria andDcRateNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TCPN.DC_RATE not between", value1, value2, "dcRate");
            return (Criteria) this;
        }

        public Criteria andDcRateMaxAmtIsNull() {
            addCriterion("TCPN.DC_RATE_MAX_AMT is null");
            return (Criteria) this;
        }

        public Criteria andDcRateMaxAmtIsNotNull() {
            addCriterion("TCPN.DC_RATE_MAX_AMT is not null");
            return (Criteria) this;
        }

        public Criteria andDcRateMaxAmtEqualTo(Integer value) {
            addCriterion("TCPN.DC_RATE_MAX_AMT =", value, "dcRateMaxAmt");
            return (Criteria) this;
        }

        public Criteria andDcRateMaxAmtNotEqualTo(Integer value) {
            addCriterion("TCPN.DC_RATE_MAX_AMT <>", value, "dcRateMaxAmt");
            return (Criteria) this;
        }

        public Criteria andDcRateMaxAmtGreaterThan(Integer value) {
            addCriterion("TCPN.DC_RATE_MAX_AMT >", value, "dcRateMaxAmt");
            return (Criteria) this;
        }

        public Criteria andDcRateMaxAmtGreaterThanOrEqualTo(Integer value) {
            addCriterion("TCPN.DC_RATE_MAX_AMT >=", value, "dcRateMaxAmt");
            return (Criteria) this;
        }

        public Criteria andDcRateMaxAmtLessThan(Integer value) {
            addCriterion("TCPN.DC_RATE_MAX_AMT <", value, "dcRateMaxAmt");
            return (Criteria) this;
        }

        public Criteria andDcRateMaxAmtLessThanOrEqualTo(Integer value) {
            addCriterion("TCPN.DC_RATE_MAX_AMT <=", value, "dcRateMaxAmt");
            return (Criteria) this;
        }

        public Criteria andDcRateMaxAmtIn(List<Integer> values) {
            addCriterion("TCPN.DC_RATE_MAX_AMT in", values, "dcRateMaxAmt");
            return (Criteria) this;
        }

        public Criteria andDcRateMaxAmtNotIn(List<Integer> values) {
            addCriterion("TCPN.DC_RATE_MAX_AMT not in", values, "dcRateMaxAmt");
            return (Criteria) this;
        }

        public Criteria andDcRateMaxAmtBetween(Integer value1, Integer value2) {
            addCriterion("TCPN.DC_RATE_MAX_AMT between", value1, value2, "dcRateMaxAmt");
            return (Criteria) this;
        }

        public Criteria andDcRateMaxAmtNotBetween(Integer value1, Integer value2) {
            addCriterion("TCPN.DC_RATE_MAX_AMT not between", value1, value2, "dcRateMaxAmt");
            return (Criteria) this;
        }

        public Criteria andDcResMinBuyAmtYnIsNull() {
            addCriterion("TCPN.DC_RES_MIN_BUY_AMT_YN is null");
            return (Criteria) this;
        }

        public Criteria andDcResMinBuyAmtYnIsNotNull() {
            addCriterion("TCPN.DC_RES_MIN_BUY_AMT_YN is not null");
            return (Criteria) this;
        }

        public Criteria andDcResMinBuyAmtYnEqualTo(String value) {
            addCriterion("TCPN.DC_RES_MIN_BUY_AMT_YN =", value, "dcResMinBuyAmtYn");
            return (Criteria) this;
        }

        public Criteria andDcResMinBuyAmtYnNotEqualTo(String value) {
            addCriterion("TCPN.DC_RES_MIN_BUY_AMT_YN <>", value, "dcResMinBuyAmtYn");
            return (Criteria) this;
        }

        public Criteria andDcResMinBuyAmtYnGreaterThan(String value) {
            addCriterion("TCPN.DC_RES_MIN_BUY_AMT_YN >", value, "dcResMinBuyAmtYn");
            return (Criteria) this;
        }

        public Criteria andDcResMinBuyAmtYnGreaterThanOrEqualTo(String value) {
            addCriterion("TCPN.DC_RES_MIN_BUY_AMT_YN >=", value, "dcResMinBuyAmtYn");
            return (Criteria) this;
        }

        public Criteria andDcResMinBuyAmtYnLessThan(String value) {
            addCriterion("TCPN.DC_RES_MIN_BUY_AMT_YN <", value, "dcResMinBuyAmtYn");
            return (Criteria) this;
        }

        public Criteria andDcResMinBuyAmtYnLessThanOrEqualTo(String value) {
            addCriterion("TCPN.DC_RES_MIN_BUY_AMT_YN <=", value, "dcResMinBuyAmtYn");
            return (Criteria) this;
        }

        public Criteria andDcResMinBuyAmtYnLike(String value) {
            addCriterion("TCPN.DC_RES_MIN_BUY_AMT_YN like", value, "dcResMinBuyAmtYn");
            return (Criteria) this;
        }

        public Criteria andDcResMinBuyAmtYnNotLike(String value) {
            addCriterion("TCPN.DC_RES_MIN_BUY_AMT_YN not like", value, "dcResMinBuyAmtYn");
            return (Criteria) this;
        }

        public Criteria andDcResMinBuyAmtYnIn(List<String> values) {
            addCriterion("TCPN.DC_RES_MIN_BUY_AMT_YN in", values, "dcResMinBuyAmtYn");
            return (Criteria) this;
        }

        public Criteria andDcResMinBuyAmtYnNotIn(List<String> values) {
            addCriterion("TCPN.DC_RES_MIN_BUY_AMT_YN not in", values, "dcResMinBuyAmtYn");
            return (Criteria) this;
        }

        public Criteria andDcResMinBuyAmtYnBetween(String value1, String value2) {
            addCriterion("TCPN.DC_RES_MIN_BUY_AMT_YN between", value1, value2, "dcResMinBuyAmtYn");
            return (Criteria) this;
        }

        public Criteria andDcResMinBuyAmtYnNotBetween(String value1, String value2) {
            addCriterion("TCPN.DC_RES_MIN_BUY_AMT_YN not between", value1, value2, "dcResMinBuyAmtYn");
            return (Criteria) this;
        }

        public Criteria andDcResMinBuyAmtIsNull() {
            addCriterion("TCPN.DC_RES_MIN_BUY_AMT is null");
            return (Criteria) this;
        }

        public Criteria andDcResMinBuyAmtIsNotNull() {
            addCriterion("TCPN.DC_RES_MIN_BUY_AMT is not null");
            return (Criteria) this;
        }

        public Criteria andDcResMinBuyAmtEqualTo(Integer value) {
            addCriterion("TCPN.DC_RES_MIN_BUY_AMT =", value, "dcResMinBuyAmt");
            return (Criteria) this;
        }

        public Criteria andDcResMinBuyAmtNotEqualTo(Integer value) {
            addCriterion("TCPN.DC_RES_MIN_BUY_AMT <>", value, "dcResMinBuyAmt");
            return (Criteria) this;
        }

        public Criteria andDcResMinBuyAmtGreaterThan(Integer value) {
            addCriterion("TCPN.DC_RES_MIN_BUY_AMT >", value, "dcResMinBuyAmt");
            return (Criteria) this;
        }

        public Criteria andDcResMinBuyAmtGreaterThanOrEqualTo(Integer value) {
            addCriterion("TCPN.DC_RES_MIN_BUY_AMT >=", value, "dcResMinBuyAmt");
            return (Criteria) this;
        }

        public Criteria andDcResMinBuyAmtLessThan(Integer value) {
            addCriterion("TCPN.DC_RES_MIN_BUY_AMT <", value, "dcResMinBuyAmt");
            return (Criteria) this;
        }

        public Criteria andDcResMinBuyAmtLessThanOrEqualTo(Integer value) {
            addCriterion("TCPN.DC_RES_MIN_BUY_AMT <=", value, "dcResMinBuyAmt");
            return (Criteria) this;
        }

        public Criteria andDcResMinBuyAmtIn(List<Integer> values) {
            addCriterion("TCPN.DC_RES_MIN_BUY_AMT in", values, "dcResMinBuyAmt");
            return (Criteria) this;
        }

        public Criteria andDcResMinBuyAmtNotIn(List<Integer> values) {
            addCriterion("TCPN.DC_RES_MIN_BUY_AMT not in", values, "dcResMinBuyAmt");
            return (Criteria) this;
        }

        public Criteria andDcResMinBuyAmtBetween(Integer value1, Integer value2) {
            addCriterion("TCPN.DC_RES_MIN_BUY_AMT between", value1, value2, "dcResMinBuyAmt");
            return (Criteria) this;
        }

        public Criteria andDcResMinBuyAmtNotBetween(Integer value1, Integer value2) {
            addCriterion("TCPN.DC_RES_MIN_BUY_AMT not between", value1, value2, "dcResMinBuyAmt");
            return (Criteria) this;
        }

        public Criteria andDcAddDcCpnYnIsNull() {
            addCriterion("TCPN.DC_ADD_DC_CPN_YN is null");
            return (Criteria) this;
        }

        public Criteria andDcAddDcCpnYnIsNotNull() {
            addCriterion("TCPN.DC_ADD_DC_CPN_YN is not null");
            return (Criteria) this;
        }

        public Criteria andDcAddDcCpnYnEqualTo(String value) {
            addCriterion("TCPN.DC_ADD_DC_CPN_YN =", value, "dcAddDcCpnYn");
            return (Criteria) this;
        }

        public Criteria andDcAddDcCpnYnNotEqualTo(String value) {
            addCriterion("TCPN.DC_ADD_DC_CPN_YN <>", value, "dcAddDcCpnYn");
            return (Criteria) this;
        }

        public Criteria andDcAddDcCpnYnGreaterThan(String value) {
            addCriterion("TCPN.DC_ADD_DC_CPN_YN >", value, "dcAddDcCpnYn");
            return (Criteria) this;
        }

        public Criteria andDcAddDcCpnYnGreaterThanOrEqualTo(String value) {
            addCriterion("TCPN.DC_ADD_DC_CPN_YN >=", value, "dcAddDcCpnYn");
            return (Criteria) this;
        }

        public Criteria andDcAddDcCpnYnLessThan(String value) {
            addCriterion("TCPN.DC_ADD_DC_CPN_YN <", value, "dcAddDcCpnYn");
            return (Criteria) this;
        }

        public Criteria andDcAddDcCpnYnLessThanOrEqualTo(String value) {
            addCriterion("TCPN.DC_ADD_DC_CPN_YN <=", value, "dcAddDcCpnYn");
            return (Criteria) this;
        }

        public Criteria andDcAddDcCpnYnLike(String value) {
            addCriterion("TCPN.DC_ADD_DC_CPN_YN like", value, "dcAddDcCpnYn");
            return (Criteria) this;
        }

        public Criteria andDcAddDcCpnYnNotLike(String value) {
            addCriterion("TCPN.DC_ADD_DC_CPN_YN not like", value, "dcAddDcCpnYn");
            return (Criteria) this;
        }

        public Criteria andDcAddDcCpnYnIn(List<String> values) {
            addCriterion("TCPN.DC_ADD_DC_CPN_YN in", values, "dcAddDcCpnYn");
            return (Criteria) this;
        }

        public Criteria andDcAddDcCpnYnNotIn(List<String> values) {
            addCriterion("TCPN.DC_ADD_DC_CPN_YN not in", values, "dcAddDcCpnYn");
            return (Criteria) this;
        }

        public Criteria andDcAddDcCpnYnBetween(String value1, String value2) {
            addCriterion("TCPN.DC_ADD_DC_CPN_YN between", value1, value2, "dcAddDcCpnYn");
            return (Criteria) this;
        }

        public Criteria andDcAddDcCpnYnNotBetween(String value1, String value2) {
            addCriterion("TCPN.DC_ADD_DC_CPN_YN not between", value1, value2, "dcAddDcCpnYn");
            return (Criteria) this;
        }

        public Criteria andBaseCpnYnIsNull() {
            addCriterion("TCPN.BASE_CPN_YN is null");
            return (Criteria) this;
        }

        public Criteria andBaseCpnYnIsNotNull() {
            addCriterion("TCPN.BASE_CPN_YN is not null");
            return (Criteria) this;
        }

        public Criteria andBaseCpnYnEqualTo(String value) {
            addCriterion("TCPN.BASE_CPN_YN =", value, "baseCpnYn");
            return (Criteria) this;
        }

        public Criteria andBaseCpnYnNotEqualTo(String value) {
            addCriterion("TCPN.BASE_CPN_YN <>", value, "baseCpnYn");
            return (Criteria) this;
        }

        public Criteria andBaseCpnYnGreaterThan(String value) {
            addCriterion("TCPN.BASE_CPN_YN >", value, "baseCpnYn");
            return (Criteria) this;
        }

        public Criteria andBaseCpnYnGreaterThanOrEqualTo(String value) {
            addCriterion("TCPN.BASE_CPN_YN >=", value, "baseCpnYn");
            return (Criteria) this;
        }

        public Criteria andBaseCpnYnLessThan(String value) {
            addCriterion("TCPN.BASE_CPN_YN <", value, "baseCpnYn");
            return (Criteria) this;
        }

        public Criteria andBaseCpnYnLessThanOrEqualTo(String value) {
            addCriterion("TCPN.BASE_CPN_YN <=", value, "baseCpnYn");
            return (Criteria) this;
        }

        public Criteria andBaseCpnYnLike(String value) {
            addCriterion("TCPN.BASE_CPN_YN like", value, "baseCpnYn");
            return (Criteria) this;
        }

        public Criteria andBaseCpnYnNotLike(String value) {
            addCriterion("TCPN.BASE_CPN_YN not like", value, "baseCpnYn");
            return (Criteria) this;
        }

        public Criteria andBaseCpnYnIn(List<String> values) {
            addCriterion("TCPN.BASE_CPN_YN in", values, "baseCpnYn");
            return (Criteria) this;
        }

        public Criteria andBaseCpnYnNotIn(List<String> values) {
            addCriterion("TCPN.BASE_CPN_YN not in", values, "baseCpnYn");
            return (Criteria) this;
        }

        public Criteria andBaseCpnYnBetween(String value1, String value2) {
            addCriterion("TCPN.BASE_CPN_YN between", value1, value2, "baseCpnYn");
            return (Criteria) this;
        }

        public Criteria andBaseCpnYnNotBetween(String value1, String value2) {
            addCriterion("TCPN.BASE_CPN_YN not between", value1, value2, "baseCpnYn");
            return (Criteria) this;
        }

        public Criteria andRegDtIsNull() {
            addCriterion("TCPN.REG_DT is null");
            return (Criteria) this;
        }

        public Criteria andRegDtIsNotNull() {
            addCriterion("TCPN.REG_DT is not null");
            return (Criteria) this;
        }

        public Criteria andRegDtEqualTo(Date value) {
            addCriterion("TCPN.REG_DT =", value, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtNotEqualTo(Date value) {
            addCriterion("TCPN.REG_DT <>", value, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtGreaterThan(Date value) {
            addCriterion("TCPN.REG_DT >", value, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtGreaterThanOrEqualTo(Date value) {
            addCriterion("TCPN.REG_DT >=", value, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtLessThan(Date value) {
            addCriterion("TCPN.REG_DT <", value, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtLessThanOrEqualTo(Date value) {
            addCriterion("TCPN.REG_DT <=", value, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtIn(List<Date> values) {
            addCriterion("TCPN.REG_DT in", values, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtNotIn(List<Date> values) {
            addCriterion("TCPN.REG_DT not in", values, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtBetween(Date value1, Date value2) {
            addCriterion("TCPN.REG_DT between", value1, value2, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtNotBetween(Date value1, Date value2) {
            addCriterion("TCPN.REG_DT not between", value1, value2, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegIdIsNull() {
            addCriterion("TCPN.REG_ID is null");
            return (Criteria) this;
        }

        public Criteria andRegIdIsNotNull() {
            addCriterion("TCPN.REG_ID is not null");
            return (Criteria) this;
        }

        public Criteria andRegIdEqualTo(String value) {
            addCriterion("TCPN.REG_ID =", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdNotEqualTo(String value) {
            addCriterion("TCPN.REG_ID <>", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdGreaterThan(String value) {
            addCriterion("TCPN.REG_ID >", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdGreaterThanOrEqualTo(String value) {
            addCriterion("TCPN.REG_ID >=", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdLessThan(String value) {
            addCriterion("TCPN.REG_ID <", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdLessThanOrEqualTo(String value) {
            addCriterion("TCPN.REG_ID <=", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdLike(String value) {
            addCriterion("TCPN.REG_ID like", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdNotLike(String value) {
            addCriterion("TCPN.REG_ID not like", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdIn(List<String> values) {
            addCriterion("TCPN.REG_ID in", values, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdNotIn(List<String> values) {
            addCriterion("TCPN.REG_ID not in", values, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdBetween(String value1, String value2) {
            addCriterion("TCPN.REG_ID between", value1, value2, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdNotBetween(String value1, String value2) {
            addCriterion("TCPN.REG_ID not between", value1, value2, "regId");
            return (Criteria) this;
        }

        public Criteria andModDtIsNull() {
            addCriterion("TCPN.MOD_DT is null");
            return (Criteria) this;
        }

        public Criteria andModDtIsNotNull() {
            addCriterion("TCPN.MOD_DT is not null");
            return (Criteria) this;
        }

        public Criteria andModDtEqualTo(Date value) {
            addCriterion("TCPN.MOD_DT =", value, "modDt");
            return (Criteria) this;
        }

        public Criteria andModDtNotEqualTo(Date value) {
            addCriterion("TCPN.MOD_DT <>", value, "modDt");
            return (Criteria) this;
        }

        public Criteria andModDtGreaterThan(Date value) {
            addCriterion("TCPN.MOD_DT >", value, "modDt");
            return (Criteria) this;
        }

        public Criteria andModDtGreaterThanOrEqualTo(Date value) {
            addCriterion("TCPN.MOD_DT >=", value, "modDt");
            return (Criteria) this;
        }

        public Criteria andModDtLessThan(Date value) {
            addCriterion("TCPN.MOD_DT <", value, "modDt");
            return (Criteria) this;
        }

        public Criteria andModDtLessThanOrEqualTo(Date value) {
            addCriterion("TCPN.MOD_DT <=", value, "modDt");
            return (Criteria) this;
        }

        public Criteria andModDtIn(List<Date> values) {
            addCriterion("TCPN.MOD_DT in", values, "modDt");
            return (Criteria) this;
        }

        public Criteria andModDtNotIn(List<Date> values) {
            addCriterion("TCPN.MOD_DT not in", values, "modDt");
            return (Criteria) this;
        }

        public Criteria andModDtBetween(Date value1, Date value2) {
            addCriterion("TCPN.MOD_DT between", value1, value2, "modDt");
            return (Criteria) this;
        }

        public Criteria andModDtNotBetween(Date value1, Date value2) {
            addCriterion("TCPN.MOD_DT not between", value1, value2, "modDt");
            return (Criteria) this;
        }

        public Criteria andModIdIsNull() {
            addCriterion("TCPN.MOD_ID is null");
            return (Criteria) this;
        }

        public Criteria andModIdIsNotNull() {
            addCriterion("TCPN.MOD_ID is not null");
            return (Criteria) this;
        }

        public Criteria andModIdEqualTo(String value) {
            addCriterion("TCPN.MOD_ID =", value, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdNotEqualTo(String value) {
            addCriterion("TCPN.MOD_ID <>", value, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdGreaterThan(String value) {
            addCriterion("TCPN.MOD_ID >", value, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdGreaterThanOrEqualTo(String value) {
            addCriterion("TCPN.MOD_ID >=", value, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdLessThan(String value) {
            addCriterion("TCPN.MOD_ID <", value, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdLessThanOrEqualTo(String value) {
            addCriterion("TCPN.MOD_ID <=", value, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdLike(String value) {
            addCriterion("TCPN.MOD_ID like", value, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdNotLike(String value) {
            addCriterion("TCPN.MOD_ID not like", value, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdIn(List<String> values) {
            addCriterion("TCPN.MOD_ID in", values, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdNotIn(List<String> values) {
            addCriterion("TCPN.MOD_ID not in", values, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdBetween(String value1, String value2) {
            addCriterion("TCPN.MOD_ID between", value1, value2, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdNotBetween(String value1, String value2) {
            addCriterion("TCPN.MOD_ID not between", value1, value2, "modId");
            return (Criteria) this;
        }

        public Criteria andUseYnIsNull() {
            addCriterion("TCPN.USE_YN is null");
            return (Criteria) this;
        }

        public Criteria andUseYnIsNotNull() {
            addCriterion("TCPN.USE_YN is not null");
            return (Criteria) this;
        }

        public Criteria andUseYnEqualTo(String value) {
            addCriterion("TCPN.USE_YN =", value, "useYn");
            return (Criteria) this;
        }

        public Criteria andUseYnNotEqualTo(String value) {
            addCriterion("TCPN.USE_YN <>", value, "useYn");
            return (Criteria) this;
        }

        public Criteria andUseYnGreaterThan(String value) {
            addCriterion("TCPN.USE_YN >", value, "useYn");
            return (Criteria) this;
        }

        public Criteria andUseYnGreaterThanOrEqualTo(String value) {
            addCriterion("TCPN.USE_YN >=", value, "useYn");
            return (Criteria) this;
        }

        public Criteria andUseYnLessThan(String value) {
            addCriterion("TCPN.USE_YN <", value, "useYn");
            return (Criteria) this;
        }

        public Criteria andUseYnLessThanOrEqualTo(String value) {
            addCriterion("TCPN.USE_YN <=", value, "useYn");
            return (Criteria) this;
        }

        public Criteria andUseYnLike(String value) {
            addCriterion("TCPN.USE_YN like", value, "useYn");
            return (Criteria) this;
        }

        public Criteria andUseYnNotLike(String value) {
            addCriterion("TCPN.USE_YN not like", value, "useYn");
            return (Criteria) this;
        }

        public Criteria andUseYnIn(List<String> values) {
            addCriterion("TCPN.USE_YN in", values, "useYn");
            return (Criteria) this;
        }

        public Criteria andUseYnNotIn(List<String> values) {
            addCriterion("TCPN.USE_YN not in", values, "useYn");
            return (Criteria) this;
        }

        public Criteria andUseYnBetween(String value1, String value2) {
            addCriterion("TCPN.USE_YN between", value1, value2, "useYn");
            return (Criteria) this;
        }

        public Criteria andUseYnNotBetween(String value1, String value2) {
            addCriterion("TCPN.USE_YN not between", value1, value2, "useYn");
            return (Criteria) this;
        }

        public Criteria andCpnTpCdLikeInsensitive(String value) {
            addCriterion("upper(TCPN.CPN_TP_CD) like", value.toUpperCase(), "cpnTpCd");
            return (Criteria) this;
        }

        public Criteria andCpnClCdLikeInsensitive(String value) {
            addCriterion("upper(TCPN.CPN_CL_CD) like", value.toUpperCase(), "cpnClCd");
            return (Criteria) this;
        }

        public Criteria andCpnAutoClCdLikeInsensitive(String value) {
            addCriterion("upper(TCPN.CPN_AUTO_CL_CD) like", value.toUpperCase(), "cpnAutoClCd");
            return (Criteria) this;
        }

        public Criteria andCpnStatCdLikeInsensitive(String value) {
            addCriterion("upper(TCPN.CPN_STAT_CD) like", value.toUpperCase(), "cpnStatCd");
            return (Criteria) this;
        }

        public Criteria andCpnNoLikeInsensitive(String value) {
            addCriterion("upper(TCPN.CPN_NO) like", value.toUpperCase(), "cpnNo");
            return (Criteria) this;
        }

        public Criteria andCpnNmLikeInsensitive(String value) {
            addCriterion("upper(TCPN.CPN_NM) like", value.toUpperCase(), "cpnNm");
            return (Criteria) this;
        }

        public Criteria andIsuTgtTpCdLikeInsensitive(String value) {
            addCriterion("upper(TCPN.ISU_TGT_TP_CD) like", value.toUpperCase(), "isuTgtTpCd");
            return (Criteria) this;
        }

        public Criteria andIsuTgtItemTpCdLikeInsensitive(String value) {
            addCriterion("upper(TCPN.ISU_TGT_ITEM_TP_CD) like", value.toUpperCase(), "isuTgtItemTpCd");
            return (Criteria) this;
        }

        public Criteria andIsuTgtMbrGrdCdLikeInsensitive(String value) {
            addCriterion("upper(TCPN.ISU_TGT_MBR_GRD_CD) like", value.toUpperCase(), "isuTgtMbrGrdCd");
            return (Criteria) this;
        }

        public Criteria andIsuMethTpCdLikeInsensitive(String value) {
            addCriterion("upper(TCPN.ISU_METH_TP_CD) like", value.toUpperCase(), "isuMethTpCd");
            return (Criteria) this;
        }

        public Criteria andIsuMethDlTpCdLikeInsensitive(String value) {
            addCriterion("upper(TCPN.ISU_METH_DL_TP_CD) like", value.toUpperCase(), "isuMethDlTpCd");
            return (Criteria) this;
        }

        public Criteria andIsuMethRdnbTpCdLikeInsensitive(String value) {
            addCriterion("upper(TCPN.ISU_METH_RDNB_TP_CD) like", value.toUpperCase(), "isuMethRdnbTpCd");
            return (Criteria) this;
        }

        public Criteria andIsuUrlLikeInsensitive(String value) {
            addCriterion("upper(TCPN.ISU_URL) like", value.toUpperCase(), "isuUrl");
            return (Criteria) this;
        }

        public Criteria andIsuFixRdnbNoLikeInsensitive(String value) {
            addCriterion("upper(TCPN.ISU_FIX_RDNB_NO) like", value.toUpperCase(), "isuFixRdnbNo");
            return (Criteria) this;
        }

        public Criteria andIsuResQtyYnLikeInsensitive(String value) {
            addCriterion("upper(TCPN.ISU_RES_QTY_YN) like", value.toUpperCase(), "isuResQtyYn");
            return (Criteria) this;
        }

        public Criteria andVldPerdTpCdLikeInsensitive(String value) {
            addCriterion("upper(TCPN.VLD_PERD_TP_CD) like", value.toUpperCase(), "vldPerdTpCd");
            return (Criteria) this;
        }

        public Criteria andVldPerdStYmdLikeInsensitive(String value) {
            addCriterion("upper(TCPN.VLD_PERD_ST_YMD) like", value.toUpperCase(), "vldPerdStYmd");
            return (Criteria) this;
        }

        public Criteria andVldPerdEdYmdLikeInsensitive(String value) {
            addCriterion("upper(TCPN.VLD_PERD_ED_YMD) like", value.toUpperCase(), "vldPerdEdYmd");
            return (Criteria) this;
        }

        public Criteria andVldPerdUseStdCdLikeInsensitive(String value) {
            addCriterion("upper(TCPN.VLD_PERD_USE_STD_CD) like", value.toUpperCase(), "vldPerdUseStdCd");
            return (Criteria) this;
        }

        public Criteria andVldPerdUseTpCdLikeInsensitive(String value) {
            addCriterion("upper(TCPN.VLD_PERD_USE_TP_CD) like", value.toUpperCase(), "vldPerdUseTpCd");
            return (Criteria) this;
        }

        public Criteria andDcMethCdLikeInsensitive(String value) {
            addCriterion("upper(TCPN.DC_METH_CD) like", value.toUpperCase(), "dcMethCd");
            return (Criteria) this;
        }

        public Criteria andDcResMinBuyAmtYnLikeInsensitive(String value) {
            addCriterion("upper(TCPN.DC_RES_MIN_BUY_AMT_YN) like", value.toUpperCase(), "dcResMinBuyAmtYn");
            return (Criteria) this;
        }

        public Criteria andDcAddDcCpnYnLikeInsensitive(String value) {
            addCriterion("upper(TCPN.DC_ADD_DC_CPN_YN) like", value.toUpperCase(), "dcAddDcCpnYn");
            return (Criteria) this;
        }

        public Criteria andBaseCpnYnLikeInsensitive(String value) {
            addCriterion("upper(TCPN.BASE_CPN_YN) like", value.toUpperCase(), "baseCpnYn");
            return (Criteria) this;
        }

        public Criteria andRegIdLikeInsensitive(String value) {
            addCriterion("upper(TCPN.REG_ID) like", value.toUpperCase(), "regId");
            return (Criteria) this;
        }

        public Criteria andModIdLikeInsensitive(String value) {
            addCriterion("upper(TCPN.MOD_ID) like", value.toUpperCase(), "modId");
            return (Criteria) this;
        }

        public Criteria andUseYnLikeInsensitive(String value) {
            addCriterion("upper(TCPN.USE_YN) like", value.toUpperCase(), "useYn");
            return (Criteria) this;
        }

        public Criteria andCpnTpCdLikeLeft(String value) {
            addCriterion("TCPN.CPN_TP_CD like ", "%" + value, "cpnTpCd");
            return (Criteria) this;
        }

        public Criteria andCpnTpCdLikeRight(String value) {
            addCriterion("TCPN.CPN_TP_CD like ", value + "%", "cpnTpCd");
            return (Criteria) this;
        }

        public Criteria andCpnTpCdLikeBoth(String value) {
            addCriterion("TCPN.CPN_TP_CD like ", "%" + value + "%", "cpnTpCd");
            return (Criteria) this;
        }

        public Criteria andCpnClCdLikeLeft(String value) {
            addCriterion("TCPN.CPN_CL_CD like ", "%" + value, "cpnClCd");
            return (Criteria) this;
        }

        public Criteria andCpnClCdLikeRight(String value) {
            addCriterion("TCPN.CPN_CL_CD like ", value + "%", "cpnClCd");
            return (Criteria) this;
        }

        public Criteria andCpnClCdLikeBoth(String value) {
            addCriterion("TCPN.CPN_CL_CD like ", "%" + value + "%", "cpnClCd");
            return (Criteria) this;
        }

        public Criteria andCpnAutoClCdLikeLeft(String value) {
            addCriterion("TCPN.CPN_AUTO_CL_CD like ", "%" + value, "cpnAutoClCd");
            return (Criteria) this;
        }

        public Criteria andCpnAutoClCdLikeRight(String value) {
            addCriterion("TCPN.CPN_AUTO_CL_CD like ", value + "%", "cpnAutoClCd");
            return (Criteria) this;
        }

        public Criteria andCpnAutoClCdLikeBoth(String value) {
            addCriterion("TCPN.CPN_AUTO_CL_CD like ", "%" + value + "%", "cpnAutoClCd");
            return (Criteria) this;
        }

        public Criteria andCpnStatCdLikeLeft(String value) {
            addCriterion("TCPN.CPN_STAT_CD like ", "%" + value, "cpnStatCd");
            return (Criteria) this;
        }

        public Criteria andCpnStatCdLikeRight(String value) {
            addCriterion("TCPN.CPN_STAT_CD like ", value + "%", "cpnStatCd");
            return (Criteria) this;
        }

        public Criteria andCpnStatCdLikeBoth(String value) {
            addCriterion("TCPN.CPN_STAT_CD like ", "%" + value + "%", "cpnStatCd");
            return (Criteria) this;
        }

        public Criteria andCpnNoLikeLeft(String value) {
            addCriterion("TCPN.CPN_NO like ", "%" + value, "cpnNo");
            return (Criteria) this;
        }

        public Criteria andCpnNoLikeRight(String value) {
            addCriterion("TCPN.CPN_NO like ", value + "%", "cpnNo");
            return (Criteria) this;
        }

        public Criteria andCpnNoLikeBoth(String value) {
            addCriterion("TCPN.CPN_NO like ", "%" + value + "%", "cpnNo");
            return (Criteria) this;
        }

        public Criteria andCpnNmLikeLeft(String value) {
            addCriterion("TCPN.CPN_NM like ", "%" + value, "cpnNm");
            return (Criteria) this;
        }

        public Criteria andCpnNmLikeRight(String value) {
            addCriterion("TCPN.CPN_NM like ", value + "%", "cpnNm");
            return (Criteria) this;
        }

        public Criteria andCpnNmLikeBoth(String value) {
            addCriterion("TCPN.CPN_NM like ", "%" + value + "%", "cpnNm");
            return (Criteria) this;
        }

        public Criteria andIsuTgtTpCdLikeLeft(String value) {
            addCriterion("TCPN.ISU_TGT_TP_CD like ", "%" + value, "isuTgtTpCd");
            return (Criteria) this;
        }

        public Criteria andIsuTgtTpCdLikeRight(String value) {
            addCriterion("TCPN.ISU_TGT_TP_CD like ", value + "%", "isuTgtTpCd");
            return (Criteria) this;
        }

        public Criteria andIsuTgtTpCdLikeBoth(String value) {
            addCriterion("TCPN.ISU_TGT_TP_CD like ", "%" + value + "%", "isuTgtTpCd");
            return (Criteria) this;
        }

        public Criteria andIsuTgtItemTpCdLikeLeft(String value) {
            addCriterion("TCPN.ISU_TGT_ITEM_TP_CD like ", "%" + value, "isuTgtItemTpCd");
            return (Criteria) this;
        }

        public Criteria andIsuTgtItemTpCdLikeRight(String value) {
            addCriterion("TCPN.ISU_TGT_ITEM_TP_CD like ", value + "%", "isuTgtItemTpCd");
            return (Criteria) this;
        }

        public Criteria andIsuTgtItemTpCdLikeBoth(String value) {
            addCriterion("TCPN.ISU_TGT_ITEM_TP_CD like ", "%" + value + "%", "isuTgtItemTpCd");
            return (Criteria) this;
        }

        public Criteria andIsuTgtMbrGrdCdLikeLeft(String value) {
            addCriterion("TCPN.ISU_TGT_MBR_GRD_CD like ", "%" + value, "isuTgtMbrGrdCd");
            return (Criteria) this;
        }

        public Criteria andIsuTgtMbrGrdCdLikeRight(String value) {
            addCriterion("TCPN.ISU_TGT_MBR_GRD_CD like ", value + "%", "isuTgtMbrGrdCd");
            return (Criteria) this;
        }

        public Criteria andIsuTgtMbrGrdCdLikeBoth(String value) {
            addCriterion("TCPN.ISU_TGT_MBR_GRD_CD like ", "%" + value + "%", "isuTgtMbrGrdCd");
            return (Criteria) this;
        }

        public Criteria andIsuMethTpCdLikeLeft(String value) {
            addCriterion("TCPN.ISU_METH_TP_CD like ", "%" + value, "isuMethTpCd");
            return (Criteria) this;
        }

        public Criteria andIsuMethTpCdLikeRight(String value) {
            addCriterion("TCPN.ISU_METH_TP_CD like ", value + "%", "isuMethTpCd");
            return (Criteria) this;
        }

        public Criteria andIsuMethTpCdLikeBoth(String value) {
            addCriterion("TCPN.ISU_METH_TP_CD like ", "%" + value + "%", "isuMethTpCd");
            return (Criteria) this;
        }

        public Criteria andIsuMethDlTpCdLikeLeft(String value) {
            addCriterion("TCPN.ISU_METH_DL_TP_CD like ", "%" + value, "isuMethDlTpCd");
            return (Criteria) this;
        }

        public Criteria andIsuMethDlTpCdLikeRight(String value) {
            addCriterion("TCPN.ISU_METH_DL_TP_CD like ", value + "%", "isuMethDlTpCd");
            return (Criteria) this;
        }

        public Criteria andIsuMethDlTpCdLikeBoth(String value) {
            addCriterion("TCPN.ISU_METH_DL_TP_CD like ", "%" + value + "%", "isuMethDlTpCd");
            return (Criteria) this;
        }

        public Criteria andIsuMethRdnbTpCdLikeLeft(String value) {
            addCriterion("TCPN.ISU_METH_RDNB_TP_CD like ", "%" + value, "isuMethRdnbTpCd");
            return (Criteria) this;
        }

        public Criteria andIsuMethRdnbTpCdLikeRight(String value) {
            addCriterion("TCPN.ISU_METH_RDNB_TP_CD like ", value + "%", "isuMethRdnbTpCd");
            return (Criteria) this;
        }

        public Criteria andIsuMethRdnbTpCdLikeBoth(String value) {
            addCriterion("TCPN.ISU_METH_RDNB_TP_CD like ", "%" + value + "%", "isuMethRdnbTpCd");
            return (Criteria) this;
        }

        public Criteria andIsuUrlLikeLeft(String value) {
            addCriterion("TCPN.ISU_URL like ", "%" + value, "isuUrl");
            return (Criteria) this;
        }

        public Criteria andIsuUrlLikeRight(String value) {
            addCriterion("TCPN.ISU_URL like ", value + "%", "isuUrl");
            return (Criteria) this;
        }

        public Criteria andIsuUrlLikeBoth(String value) {
            addCriterion("TCPN.ISU_URL like ", "%" + value + "%", "isuUrl");
            return (Criteria) this;
        }

        public Criteria andIsuFixRdnbNoLikeLeft(String value) {
            addCriterion("TCPN.ISU_FIX_RDNB_NO like ", "%" + value, "isuFixRdnbNo");
            return (Criteria) this;
        }

        public Criteria andIsuFixRdnbNoLikeRight(String value) {
            addCriterion("TCPN.ISU_FIX_RDNB_NO like ", value + "%", "isuFixRdnbNo");
            return (Criteria) this;
        }

        public Criteria andIsuFixRdnbNoLikeBoth(String value) {
            addCriterion("TCPN.ISU_FIX_RDNB_NO like ", "%" + value + "%", "isuFixRdnbNo");
            return (Criteria) this;
        }

        public Criteria andIsuResQtyYnLikeLeft(String value) {
            addCriterion("TCPN.ISU_RES_QTY_YN like ", "%" + value, "isuResQtyYn");
            return (Criteria) this;
        }

        public Criteria andIsuResQtyYnLikeRight(String value) {
            addCriterion("TCPN.ISU_RES_QTY_YN like ", value + "%", "isuResQtyYn");
            return (Criteria) this;
        }

        public Criteria andIsuResQtyYnLikeBoth(String value) {
            addCriterion("TCPN.ISU_RES_QTY_YN like ", "%" + value + "%", "isuResQtyYn");
            return (Criteria) this;
        }

        public Criteria andVldPerdTpCdLikeLeft(String value) {
            addCriterion("TCPN.VLD_PERD_TP_CD like ", "%" + value, "vldPerdTpCd");
            return (Criteria) this;
        }

        public Criteria andVldPerdTpCdLikeRight(String value) {
            addCriterion("TCPN.VLD_PERD_TP_CD like ", value + "%", "vldPerdTpCd");
            return (Criteria) this;
        }

        public Criteria andVldPerdTpCdLikeBoth(String value) {
            addCriterion("TCPN.VLD_PERD_TP_CD like ", "%" + value + "%", "vldPerdTpCd");
            return (Criteria) this;
        }

        public Criteria andVldPerdStYmdLikeLeft(String value) {
            addCriterion("TCPN.VLD_PERD_ST_YMD like ", "%" + value, "vldPerdStYmd");
            return (Criteria) this;
        }

        public Criteria andVldPerdStYmdLikeRight(String value) {
            addCriterion("TCPN.VLD_PERD_ST_YMD like ", value + "%", "vldPerdStYmd");
            return (Criteria) this;
        }

        public Criteria andVldPerdStYmdLikeBoth(String value) {
            addCriterion("TCPN.VLD_PERD_ST_YMD like ", "%" + value + "%", "vldPerdStYmd");
            return (Criteria) this;
        }

        public Criteria andVldPerdEdYmdLikeLeft(String value) {
            addCriterion("TCPN.VLD_PERD_ED_YMD like ", "%" + value, "vldPerdEdYmd");
            return (Criteria) this;
        }

        public Criteria andVldPerdEdYmdLikeRight(String value) {
            addCriterion("TCPN.VLD_PERD_ED_YMD like ", value + "%", "vldPerdEdYmd");
            return (Criteria) this;
        }

        public Criteria andVldPerdEdYmdLikeBoth(String value) {
            addCriterion("TCPN.VLD_PERD_ED_YMD like ", "%" + value + "%", "vldPerdEdYmd");
            return (Criteria) this;
        }

        public Criteria andVldPerdUseStdCdLikeLeft(String value) {
            addCriterion("TCPN.VLD_PERD_USE_STD_CD like ", "%" + value, "vldPerdUseStdCd");
            return (Criteria) this;
        }

        public Criteria andVldPerdUseStdCdLikeRight(String value) {
            addCriterion("TCPN.VLD_PERD_USE_STD_CD like ", value + "%", "vldPerdUseStdCd");
            return (Criteria) this;
        }

        public Criteria andVldPerdUseStdCdLikeBoth(String value) {
            addCriterion("TCPN.VLD_PERD_USE_STD_CD like ", "%" + value + "%", "vldPerdUseStdCd");
            return (Criteria) this;
        }

        public Criteria andVldPerdUseTpCdLikeLeft(String value) {
            addCriterion("TCPN.VLD_PERD_USE_TP_CD like ", "%" + value, "vldPerdUseTpCd");
            return (Criteria) this;
        }

        public Criteria andVldPerdUseTpCdLikeRight(String value) {
            addCriterion("TCPN.VLD_PERD_USE_TP_CD like ", value + "%", "vldPerdUseTpCd");
            return (Criteria) this;
        }

        public Criteria andVldPerdUseTpCdLikeBoth(String value) {
            addCriterion("TCPN.VLD_PERD_USE_TP_CD like ", "%" + value + "%", "vldPerdUseTpCd");
            return (Criteria) this;
        }

        public Criteria andDcMethCdLikeLeft(String value) {
            addCriterion("TCPN.DC_METH_CD like ", "%" + value, "dcMethCd");
            return (Criteria) this;
        }

        public Criteria andDcMethCdLikeRight(String value) {
            addCriterion("TCPN.DC_METH_CD like ", value + "%", "dcMethCd");
            return (Criteria) this;
        }

        public Criteria andDcMethCdLikeBoth(String value) {
            addCriterion("TCPN.DC_METH_CD like ", "%" + value + "%", "dcMethCd");
            return (Criteria) this;
        }

        public Criteria andDcResMinBuyAmtYnLikeLeft(String value) {
            addCriterion("TCPN.DC_RES_MIN_BUY_AMT_YN like ", "%" + value, "dcResMinBuyAmtYn");
            return (Criteria) this;
        }

        public Criteria andDcResMinBuyAmtYnLikeRight(String value) {
            addCriterion("TCPN.DC_RES_MIN_BUY_AMT_YN like ", value + "%", "dcResMinBuyAmtYn");
            return (Criteria) this;
        }

        public Criteria andDcResMinBuyAmtYnLikeBoth(String value) {
            addCriterion("TCPN.DC_RES_MIN_BUY_AMT_YN like ", "%" + value + "%", "dcResMinBuyAmtYn");
            return (Criteria) this;
        }

        public Criteria andDcAddDcCpnYnLikeLeft(String value) {
            addCriterion("TCPN.DC_ADD_DC_CPN_YN like ", "%" + value, "dcAddDcCpnYn");
            return (Criteria) this;
        }

        public Criteria andDcAddDcCpnYnLikeRight(String value) {
            addCriterion("TCPN.DC_ADD_DC_CPN_YN like ", value + "%", "dcAddDcCpnYn");
            return (Criteria) this;
        }

        public Criteria andDcAddDcCpnYnLikeBoth(String value) {
            addCriterion("TCPN.DC_ADD_DC_CPN_YN like ", "%" + value + "%", "dcAddDcCpnYn");
            return (Criteria) this;
        }

        public Criteria andBaseCpnYnLikeLeft(String value) {
            addCriterion("TCPN.BASE_CPN_YN like ", "%" + value, "baseCpnYn");
            return (Criteria) this;
        }

        public Criteria andBaseCpnYnLikeRight(String value) {
            addCriterion("TCPN.BASE_CPN_YN like ", value + "%", "baseCpnYn");
            return (Criteria) this;
        }

        public Criteria andBaseCpnYnLikeBoth(String value) {
            addCriterion("TCPN.BASE_CPN_YN like ", "%" + value + "%", "baseCpnYn");
            return (Criteria) this;
        }

        public Criteria andRegIdLikeLeft(String value) {
            addCriterion("TCPN.REG_ID like ", "%" + value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdLikeRight(String value) {
            addCriterion("TCPN.REG_ID like ", value + "%", "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdLikeBoth(String value) {
            addCriterion("TCPN.REG_ID like ", "%" + value + "%", "regId");
            return (Criteria) this;
        }

        public Criteria andModIdLikeLeft(String value) {
            addCriterion("TCPN.MOD_ID like ", "%" + value, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdLikeRight(String value) {
            addCriterion("TCPN.MOD_ID like ", value + "%", "modId");
            return (Criteria) this;
        }

        public Criteria andModIdLikeBoth(String value) {
            addCriterion("TCPN.MOD_ID like ", "%" + value + "%", "modId");
            return (Criteria) this;
        }

        public Criteria andUseYnLikeLeft(String value) {
            addCriterion("TCPN.USE_YN like ", "%" + value, "useYn");
            return (Criteria) this;
        }

        public Criteria andUseYnLikeRight(String value) {
            addCriterion("TCPN.USE_YN like ", value + "%", "useYn");
            return (Criteria) this;
        }

        public Criteria andUseYnLikeBoth(String value) {
            addCriterion("TCPN.USE_YN like ", "%" + value + "%", "useYn");
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