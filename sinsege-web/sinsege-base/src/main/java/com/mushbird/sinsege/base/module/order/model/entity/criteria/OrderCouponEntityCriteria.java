package com.mushbird.sinsege.base.module.order.model.entity.criteria;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OrderCouponEntityCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    public OrderCouponEntityCriteria() {
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

        public Criteria andOrdCpnIdIsNull() {
            addCriterion("TORDC.ORD_CPN_ID is null");
            return (Criteria) this;
        }

        public Criteria andOrdCpnIdIsNotNull() {
            addCriterion("TORDC.ORD_CPN_ID is not null");
            return (Criteria) this;
        }

        public Criteria andOrdCpnIdEqualTo(Integer value) {
            addCriterion("TORDC.ORD_CPN_ID =", value, "ordCpnId");
            return (Criteria) this;
        }

        public Criteria andOrdCpnIdNotEqualTo(Integer value) {
            addCriterion("TORDC.ORD_CPN_ID <>", value, "ordCpnId");
            return (Criteria) this;
        }

        public Criteria andOrdCpnIdGreaterThan(Integer value) {
            addCriterion("TORDC.ORD_CPN_ID >", value, "ordCpnId");
            return (Criteria) this;
        }

        public Criteria andOrdCpnIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("TORDC.ORD_CPN_ID >=", value, "ordCpnId");
            return (Criteria) this;
        }

        public Criteria andOrdCpnIdLessThan(Integer value) {
            addCriterion("TORDC.ORD_CPN_ID <", value, "ordCpnId");
            return (Criteria) this;
        }

        public Criteria andOrdCpnIdLessThanOrEqualTo(Integer value) {
            addCriterion("TORDC.ORD_CPN_ID <=", value, "ordCpnId");
            return (Criteria) this;
        }

        public Criteria andOrdCpnIdIn(List<Integer> values) {
            addCriterion("TORDC.ORD_CPN_ID in", values, "ordCpnId");
            return (Criteria) this;
        }

        public Criteria andOrdCpnIdNotIn(List<Integer> values) {
            addCriterion("TORDC.ORD_CPN_ID not in", values, "ordCpnId");
            return (Criteria) this;
        }

        public Criteria andOrdCpnIdBetween(Integer value1, Integer value2) {
            addCriterion("TORDC.ORD_CPN_ID between", value1, value2, "ordCpnId");
            return (Criteria) this;
        }

        public Criteria andOrdCpnIdNotBetween(Integer value1, Integer value2) {
            addCriterion("TORDC.ORD_CPN_ID not between", value1, value2, "ordCpnId");
            return (Criteria) this;
        }

        public Criteria andMbrCpnIdIsNull() {
            addCriterion("TORDC.MBR_CPN_ID is null");
            return (Criteria) this;
        }

        public Criteria andMbrCpnIdIsNotNull() {
            addCriterion("TORDC.MBR_CPN_ID is not null");
            return (Criteria) this;
        }

        public Criteria andMbrCpnIdEqualTo(Integer value) {
            addCriterion("TORDC.MBR_CPN_ID =", value, "mbrCpnId");
            return (Criteria) this;
        }

        public Criteria andMbrCpnIdNotEqualTo(Integer value) {
            addCriterion("TORDC.MBR_CPN_ID <>", value, "mbrCpnId");
            return (Criteria) this;
        }

        public Criteria andMbrCpnIdGreaterThan(Integer value) {
            addCriterion("TORDC.MBR_CPN_ID >", value, "mbrCpnId");
            return (Criteria) this;
        }

        public Criteria andMbrCpnIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("TORDC.MBR_CPN_ID >=", value, "mbrCpnId");
            return (Criteria) this;
        }

        public Criteria andMbrCpnIdLessThan(Integer value) {
            addCriterion("TORDC.MBR_CPN_ID <", value, "mbrCpnId");
            return (Criteria) this;
        }

        public Criteria andMbrCpnIdLessThanOrEqualTo(Integer value) {
            addCriterion("TORDC.MBR_CPN_ID <=", value, "mbrCpnId");
            return (Criteria) this;
        }

        public Criteria andMbrCpnIdIn(List<Integer> values) {
            addCriterion("TORDC.MBR_CPN_ID in", values, "mbrCpnId");
            return (Criteria) this;
        }

        public Criteria andMbrCpnIdNotIn(List<Integer> values) {
            addCriterion("TORDC.MBR_CPN_ID not in", values, "mbrCpnId");
            return (Criteria) this;
        }

        public Criteria andMbrCpnIdBetween(Integer value1, Integer value2) {
            addCriterion("TORDC.MBR_CPN_ID between", value1, value2, "mbrCpnId");
            return (Criteria) this;
        }

        public Criteria andMbrCpnIdNotBetween(Integer value1, Integer value2) {
            addCriterion("TORDC.MBR_CPN_ID not between", value1, value2, "mbrCpnId");
            return (Criteria) this;
        }

        public Criteria andOrdIdIsNull() {
            addCriterion("TORDC.ORD_ID is null");
            return (Criteria) this;
        }

        public Criteria andOrdIdIsNotNull() {
            addCriterion("TORDC.ORD_ID is not null");
            return (Criteria) this;
        }

        public Criteria andOrdIdEqualTo(Integer value) {
            addCriterion("TORDC.ORD_ID =", value, "ordId");
            return (Criteria) this;
        }

        public Criteria andOrdIdNotEqualTo(Integer value) {
            addCriterion("TORDC.ORD_ID <>", value, "ordId");
            return (Criteria) this;
        }

        public Criteria andOrdIdGreaterThan(Integer value) {
            addCriterion("TORDC.ORD_ID >", value, "ordId");
            return (Criteria) this;
        }

        public Criteria andOrdIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("TORDC.ORD_ID >=", value, "ordId");
            return (Criteria) this;
        }

        public Criteria andOrdIdLessThan(Integer value) {
            addCriterion("TORDC.ORD_ID <", value, "ordId");
            return (Criteria) this;
        }

        public Criteria andOrdIdLessThanOrEqualTo(Integer value) {
            addCriterion("TORDC.ORD_ID <=", value, "ordId");
            return (Criteria) this;
        }

        public Criteria andOrdIdIn(List<Integer> values) {
            addCriterion("TORDC.ORD_ID in", values, "ordId");
            return (Criteria) this;
        }

        public Criteria andOrdIdNotIn(List<Integer> values) {
            addCriterion("TORDC.ORD_ID not in", values, "ordId");
            return (Criteria) this;
        }

        public Criteria andOrdIdBetween(Integer value1, Integer value2) {
            addCriterion("TORDC.ORD_ID between", value1, value2, "ordId");
            return (Criteria) this;
        }

        public Criteria andOrdIdNotBetween(Integer value1, Integer value2) {
            addCriterion("TORDC.ORD_ID not between", value1, value2, "ordId");
            return (Criteria) this;
        }

        public Criteria andOrdCpnAplyCdIsNull() {
            addCriterion("TORDC.ORD_CPN_APLY_CD is null");
            return (Criteria) this;
        }

        public Criteria andOrdCpnAplyCdIsNotNull() {
            addCriterion("TORDC.ORD_CPN_APLY_CD is not null");
            return (Criteria) this;
        }

        public Criteria andOrdCpnAplyCdEqualTo(String value) {
            addCriterion("TORDC.ORD_CPN_APLY_CD =", value, "ordCpnAplyCd");
            return (Criteria) this;
        }

        public Criteria andOrdCpnAplyCdNotEqualTo(String value) {
            addCriterion("TORDC.ORD_CPN_APLY_CD <>", value, "ordCpnAplyCd");
            return (Criteria) this;
        }

        public Criteria andOrdCpnAplyCdGreaterThan(String value) {
            addCriterion("TORDC.ORD_CPN_APLY_CD >", value, "ordCpnAplyCd");
            return (Criteria) this;
        }

        public Criteria andOrdCpnAplyCdGreaterThanOrEqualTo(String value) {
            addCriterion("TORDC.ORD_CPN_APLY_CD >=", value, "ordCpnAplyCd");
            return (Criteria) this;
        }

        public Criteria andOrdCpnAplyCdLessThan(String value) {
            addCriterion("TORDC.ORD_CPN_APLY_CD <", value, "ordCpnAplyCd");
            return (Criteria) this;
        }

        public Criteria andOrdCpnAplyCdLessThanOrEqualTo(String value) {
            addCriterion("TORDC.ORD_CPN_APLY_CD <=", value, "ordCpnAplyCd");
            return (Criteria) this;
        }

        public Criteria andOrdCpnAplyCdLike(String value) {
            addCriterion("TORDC.ORD_CPN_APLY_CD like", value, "ordCpnAplyCd");
            return (Criteria) this;
        }

        public Criteria andOrdCpnAplyCdNotLike(String value) {
            addCriterion("TORDC.ORD_CPN_APLY_CD not like", value, "ordCpnAplyCd");
            return (Criteria) this;
        }

        public Criteria andOrdCpnAplyCdIn(List<String> values) {
            addCriterion("TORDC.ORD_CPN_APLY_CD in", values, "ordCpnAplyCd");
            return (Criteria) this;
        }

        public Criteria andOrdCpnAplyCdNotIn(List<String> values) {
            addCriterion("TORDC.ORD_CPN_APLY_CD not in", values, "ordCpnAplyCd");
            return (Criteria) this;
        }

        public Criteria andOrdCpnAplyCdBetween(String value1, String value2) {
            addCriterion("TORDC.ORD_CPN_APLY_CD between", value1, value2, "ordCpnAplyCd");
            return (Criteria) this;
        }

        public Criteria andOrdCpnAplyCdNotBetween(String value1, String value2) {
            addCriterion("TORDC.ORD_CPN_APLY_CD not between", value1, value2, "ordCpnAplyCd");
            return (Criteria) this;
        }

        public Criteria andCpnTpCdIsNull() {
            addCriterion("TORDC.CPN_TP_CD is null");
            return (Criteria) this;
        }

        public Criteria andCpnTpCdIsNotNull() {
            addCriterion("TORDC.CPN_TP_CD is not null");
            return (Criteria) this;
        }

        public Criteria andCpnTpCdEqualTo(String value) {
            addCriterion("TORDC.CPN_TP_CD =", value, "cpnTpCd");
            return (Criteria) this;
        }

        public Criteria andCpnTpCdNotEqualTo(String value) {
            addCriterion("TORDC.CPN_TP_CD <>", value, "cpnTpCd");
            return (Criteria) this;
        }

        public Criteria andCpnTpCdGreaterThan(String value) {
            addCriterion("TORDC.CPN_TP_CD >", value, "cpnTpCd");
            return (Criteria) this;
        }

        public Criteria andCpnTpCdGreaterThanOrEqualTo(String value) {
            addCriterion("TORDC.CPN_TP_CD >=", value, "cpnTpCd");
            return (Criteria) this;
        }

        public Criteria andCpnTpCdLessThan(String value) {
            addCriterion("TORDC.CPN_TP_CD <", value, "cpnTpCd");
            return (Criteria) this;
        }

        public Criteria andCpnTpCdLessThanOrEqualTo(String value) {
            addCriterion("TORDC.CPN_TP_CD <=", value, "cpnTpCd");
            return (Criteria) this;
        }

        public Criteria andCpnTpCdLike(String value) {
            addCriterion("TORDC.CPN_TP_CD like", value, "cpnTpCd");
            return (Criteria) this;
        }

        public Criteria andCpnTpCdNotLike(String value) {
            addCriterion("TORDC.CPN_TP_CD not like", value, "cpnTpCd");
            return (Criteria) this;
        }

        public Criteria andCpnTpCdIn(List<String> values) {
            addCriterion("TORDC.CPN_TP_CD in", values, "cpnTpCd");
            return (Criteria) this;
        }

        public Criteria andCpnTpCdNotIn(List<String> values) {
            addCriterion("TORDC.CPN_TP_CD not in", values, "cpnTpCd");
            return (Criteria) this;
        }

        public Criteria andCpnTpCdBetween(String value1, String value2) {
            addCriterion("TORDC.CPN_TP_CD between", value1, value2, "cpnTpCd");
            return (Criteria) this;
        }

        public Criteria andCpnTpCdNotBetween(String value1, String value2) {
            addCriterion("TORDC.CPN_TP_CD not between", value1, value2, "cpnTpCd");
            return (Criteria) this;
        }

        public Criteria andCpnAutoClCdIsNull() {
            addCriterion("TORDC.CPN_AUTO_CL_CD is null");
            return (Criteria) this;
        }

        public Criteria andCpnAutoClCdIsNotNull() {
            addCriterion("TORDC.CPN_AUTO_CL_CD is not null");
            return (Criteria) this;
        }

        public Criteria andCpnAutoClCdEqualTo(String value) {
            addCriterion("TORDC.CPN_AUTO_CL_CD =", value, "cpnAutoClCd");
            return (Criteria) this;
        }

        public Criteria andCpnAutoClCdNotEqualTo(String value) {
            addCriterion("TORDC.CPN_AUTO_CL_CD <>", value, "cpnAutoClCd");
            return (Criteria) this;
        }

        public Criteria andCpnAutoClCdGreaterThan(String value) {
            addCriterion("TORDC.CPN_AUTO_CL_CD >", value, "cpnAutoClCd");
            return (Criteria) this;
        }

        public Criteria andCpnAutoClCdGreaterThanOrEqualTo(String value) {
            addCriterion("TORDC.CPN_AUTO_CL_CD >=", value, "cpnAutoClCd");
            return (Criteria) this;
        }

        public Criteria andCpnAutoClCdLessThan(String value) {
            addCriterion("TORDC.CPN_AUTO_CL_CD <", value, "cpnAutoClCd");
            return (Criteria) this;
        }

        public Criteria andCpnAutoClCdLessThanOrEqualTo(String value) {
            addCriterion("TORDC.CPN_AUTO_CL_CD <=", value, "cpnAutoClCd");
            return (Criteria) this;
        }

        public Criteria andCpnAutoClCdLike(String value) {
            addCriterion("TORDC.CPN_AUTO_CL_CD like", value, "cpnAutoClCd");
            return (Criteria) this;
        }

        public Criteria andCpnAutoClCdNotLike(String value) {
            addCriterion("TORDC.CPN_AUTO_CL_CD not like", value, "cpnAutoClCd");
            return (Criteria) this;
        }

        public Criteria andCpnAutoClCdIn(List<String> values) {
            addCriterion("TORDC.CPN_AUTO_CL_CD in", values, "cpnAutoClCd");
            return (Criteria) this;
        }

        public Criteria andCpnAutoClCdNotIn(List<String> values) {
            addCriterion("TORDC.CPN_AUTO_CL_CD not in", values, "cpnAutoClCd");
            return (Criteria) this;
        }

        public Criteria andCpnAutoClCdBetween(String value1, String value2) {
            addCriterion("TORDC.CPN_AUTO_CL_CD between", value1, value2, "cpnAutoClCd");
            return (Criteria) this;
        }

        public Criteria andCpnAutoClCdNotBetween(String value1, String value2) {
            addCriterion("TORDC.CPN_AUTO_CL_CD not between", value1, value2, "cpnAutoClCd");
            return (Criteria) this;
        }

        public Criteria andCpnNoIsNull() {
            addCriterion("TORDC.CPN_NO is null");
            return (Criteria) this;
        }

        public Criteria andCpnNoIsNotNull() {
            addCriterion("TORDC.CPN_NO is not null");
            return (Criteria) this;
        }

        public Criteria andCpnNoEqualTo(String value) {
            addCriterion("TORDC.CPN_NO =", value, "cpnNo");
            return (Criteria) this;
        }

        public Criteria andCpnNoNotEqualTo(String value) {
            addCriterion("TORDC.CPN_NO <>", value, "cpnNo");
            return (Criteria) this;
        }

        public Criteria andCpnNoGreaterThan(String value) {
            addCriterion("TORDC.CPN_NO >", value, "cpnNo");
            return (Criteria) this;
        }

        public Criteria andCpnNoGreaterThanOrEqualTo(String value) {
            addCriterion("TORDC.CPN_NO >=", value, "cpnNo");
            return (Criteria) this;
        }

        public Criteria andCpnNoLessThan(String value) {
            addCriterion("TORDC.CPN_NO <", value, "cpnNo");
            return (Criteria) this;
        }

        public Criteria andCpnNoLessThanOrEqualTo(String value) {
            addCriterion("TORDC.CPN_NO <=", value, "cpnNo");
            return (Criteria) this;
        }

        public Criteria andCpnNoLike(String value) {
            addCriterion("TORDC.CPN_NO like", value, "cpnNo");
            return (Criteria) this;
        }

        public Criteria andCpnNoNotLike(String value) {
            addCriterion("TORDC.CPN_NO not like", value, "cpnNo");
            return (Criteria) this;
        }

        public Criteria andCpnNoIn(List<String> values) {
            addCriterion("TORDC.CPN_NO in", values, "cpnNo");
            return (Criteria) this;
        }

        public Criteria andCpnNoNotIn(List<String> values) {
            addCriterion("TORDC.CPN_NO not in", values, "cpnNo");
            return (Criteria) this;
        }

        public Criteria andCpnNoBetween(String value1, String value2) {
            addCriterion("TORDC.CPN_NO between", value1, value2, "cpnNo");
            return (Criteria) this;
        }

        public Criteria andCpnNoNotBetween(String value1, String value2) {
            addCriterion("TORDC.CPN_NO not between", value1, value2, "cpnNo");
            return (Criteria) this;
        }

        public Criteria andCpnNmIsNull() {
            addCriterion("TORDC.CPN_NM is null");
            return (Criteria) this;
        }

        public Criteria andCpnNmIsNotNull() {
            addCriterion("TORDC.CPN_NM is not null");
            return (Criteria) this;
        }

        public Criteria andCpnNmEqualTo(String value) {
            addCriterion("TORDC.CPN_NM =", value, "cpnNm");
            return (Criteria) this;
        }

        public Criteria andCpnNmNotEqualTo(String value) {
            addCriterion("TORDC.CPN_NM <>", value, "cpnNm");
            return (Criteria) this;
        }

        public Criteria andCpnNmGreaterThan(String value) {
            addCriterion("TORDC.CPN_NM >", value, "cpnNm");
            return (Criteria) this;
        }

        public Criteria andCpnNmGreaterThanOrEqualTo(String value) {
            addCriterion("TORDC.CPN_NM >=", value, "cpnNm");
            return (Criteria) this;
        }

        public Criteria andCpnNmLessThan(String value) {
            addCriterion("TORDC.CPN_NM <", value, "cpnNm");
            return (Criteria) this;
        }

        public Criteria andCpnNmLessThanOrEqualTo(String value) {
            addCriterion("TORDC.CPN_NM <=", value, "cpnNm");
            return (Criteria) this;
        }

        public Criteria andCpnNmLike(String value) {
            addCriterion("TORDC.CPN_NM like", value, "cpnNm");
            return (Criteria) this;
        }

        public Criteria andCpnNmNotLike(String value) {
            addCriterion("TORDC.CPN_NM not like", value, "cpnNm");
            return (Criteria) this;
        }

        public Criteria andCpnNmIn(List<String> values) {
            addCriterion("TORDC.CPN_NM in", values, "cpnNm");
            return (Criteria) this;
        }

        public Criteria andCpnNmNotIn(List<String> values) {
            addCriterion("TORDC.CPN_NM not in", values, "cpnNm");
            return (Criteria) this;
        }

        public Criteria andCpnNmBetween(String value1, String value2) {
            addCriterion("TORDC.CPN_NM between", value1, value2, "cpnNm");
            return (Criteria) this;
        }

        public Criteria andCpnNmNotBetween(String value1, String value2) {
            addCriterion("TORDC.CPN_NM not between", value1, value2, "cpnNm");
            return (Criteria) this;
        }

        public Criteria andMbrCpnNoIsNull() {
            addCriterion("TORDC.MBR_CPN_NO is null");
            return (Criteria) this;
        }

        public Criteria andMbrCpnNoIsNotNull() {
            addCriterion("TORDC.MBR_CPN_NO is not null");
            return (Criteria) this;
        }

        public Criteria andMbrCpnNoEqualTo(String value) {
            addCriterion("TORDC.MBR_CPN_NO =", value, "mbrCpnNo");
            return (Criteria) this;
        }

        public Criteria andMbrCpnNoNotEqualTo(String value) {
            addCriterion("TORDC.MBR_CPN_NO <>", value, "mbrCpnNo");
            return (Criteria) this;
        }

        public Criteria andMbrCpnNoGreaterThan(String value) {
            addCriterion("TORDC.MBR_CPN_NO >", value, "mbrCpnNo");
            return (Criteria) this;
        }

        public Criteria andMbrCpnNoGreaterThanOrEqualTo(String value) {
            addCriterion("TORDC.MBR_CPN_NO >=", value, "mbrCpnNo");
            return (Criteria) this;
        }

        public Criteria andMbrCpnNoLessThan(String value) {
            addCriterion("TORDC.MBR_CPN_NO <", value, "mbrCpnNo");
            return (Criteria) this;
        }

        public Criteria andMbrCpnNoLessThanOrEqualTo(String value) {
            addCriterion("TORDC.MBR_CPN_NO <=", value, "mbrCpnNo");
            return (Criteria) this;
        }

        public Criteria andMbrCpnNoLike(String value) {
            addCriterion("TORDC.MBR_CPN_NO like", value, "mbrCpnNo");
            return (Criteria) this;
        }

        public Criteria andMbrCpnNoNotLike(String value) {
            addCriterion("TORDC.MBR_CPN_NO not like", value, "mbrCpnNo");
            return (Criteria) this;
        }

        public Criteria andMbrCpnNoIn(List<String> values) {
            addCriterion("TORDC.MBR_CPN_NO in", values, "mbrCpnNo");
            return (Criteria) this;
        }

        public Criteria andMbrCpnNoNotIn(List<String> values) {
            addCriterion("TORDC.MBR_CPN_NO not in", values, "mbrCpnNo");
            return (Criteria) this;
        }

        public Criteria andMbrCpnNoBetween(String value1, String value2) {
            addCriterion("TORDC.MBR_CPN_NO between", value1, value2, "mbrCpnNo");
            return (Criteria) this;
        }

        public Criteria andMbrCpnNoNotBetween(String value1, String value2) {
            addCriterion("TORDC.MBR_CPN_NO not between", value1, value2, "mbrCpnNo");
            return (Criteria) this;
        }

        public Criteria andDcMethCdIsNull() {
            addCriterion("TORDC.DC_METH_CD is null");
            return (Criteria) this;
        }

        public Criteria andDcMethCdIsNotNull() {
            addCriterion("TORDC.DC_METH_CD is not null");
            return (Criteria) this;
        }

        public Criteria andDcMethCdEqualTo(String value) {
            addCriterion("TORDC.DC_METH_CD =", value, "dcMethCd");
            return (Criteria) this;
        }

        public Criteria andDcMethCdNotEqualTo(String value) {
            addCriterion("TORDC.DC_METH_CD <>", value, "dcMethCd");
            return (Criteria) this;
        }

        public Criteria andDcMethCdGreaterThan(String value) {
            addCriterion("TORDC.DC_METH_CD >", value, "dcMethCd");
            return (Criteria) this;
        }

        public Criteria andDcMethCdGreaterThanOrEqualTo(String value) {
            addCriterion("TORDC.DC_METH_CD >=", value, "dcMethCd");
            return (Criteria) this;
        }

        public Criteria andDcMethCdLessThan(String value) {
            addCriterion("TORDC.DC_METH_CD <", value, "dcMethCd");
            return (Criteria) this;
        }

        public Criteria andDcMethCdLessThanOrEqualTo(String value) {
            addCriterion("TORDC.DC_METH_CD <=", value, "dcMethCd");
            return (Criteria) this;
        }

        public Criteria andDcMethCdLike(String value) {
            addCriterion("TORDC.DC_METH_CD like", value, "dcMethCd");
            return (Criteria) this;
        }

        public Criteria andDcMethCdNotLike(String value) {
            addCriterion("TORDC.DC_METH_CD not like", value, "dcMethCd");
            return (Criteria) this;
        }

        public Criteria andDcMethCdIn(List<String> values) {
            addCriterion("TORDC.DC_METH_CD in", values, "dcMethCd");
            return (Criteria) this;
        }

        public Criteria andDcMethCdNotIn(List<String> values) {
            addCriterion("TORDC.DC_METH_CD not in", values, "dcMethCd");
            return (Criteria) this;
        }

        public Criteria andDcMethCdBetween(String value1, String value2) {
            addCriterion("TORDC.DC_METH_CD between", value1, value2, "dcMethCd");
            return (Criteria) this;
        }

        public Criteria andDcMethCdNotBetween(String value1, String value2) {
            addCriterion("TORDC.DC_METH_CD not between", value1, value2, "dcMethCd");
            return (Criteria) this;
        }

        public Criteria andDcAmtIsNull() {
            addCriterion("TORDC.DC_AMT is null");
            return (Criteria) this;
        }

        public Criteria andDcAmtIsNotNull() {
            addCriterion("TORDC.DC_AMT is not null");
            return (Criteria) this;
        }

        public Criteria andDcAmtEqualTo(Integer value) {
            addCriterion("TORDC.DC_AMT =", value, "dcAmt");
            return (Criteria) this;
        }

        public Criteria andDcAmtNotEqualTo(Integer value) {
            addCriterion("TORDC.DC_AMT <>", value, "dcAmt");
            return (Criteria) this;
        }

        public Criteria andDcAmtGreaterThan(Integer value) {
            addCriterion("TORDC.DC_AMT >", value, "dcAmt");
            return (Criteria) this;
        }

        public Criteria andDcAmtGreaterThanOrEqualTo(Integer value) {
            addCriterion("TORDC.DC_AMT >=", value, "dcAmt");
            return (Criteria) this;
        }

        public Criteria andDcAmtLessThan(Integer value) {
            addCriterion("TORDC.DC_AMT <", value, "dcAmt");
            return (Criteria) this;
        }

        public Criteria andDcAmtLessThanOrEqualTo(Integer value) {
            addCriterion("TORDC.DC_AMT <=", value, "dcAmt");
            return (Criteria) this;
        }

        public Criteria andDcAmtIn(List<Integer> values) {
            addCriterion("TORDC.DC_AMT in", values, "dcAmt");
            return (Criteria) this;
        }

        public Criteria andDcAmtNotIn(List<Integer> values) {
            addCriterion("TORDC.DC_AMT not in", values, "dcAmt");
            return (Criteria) this;
        }

        public Criteria andDcAmtBetween(Integer value1, Integer value2) {
            addCriterion("TORDC.DC_AMT between", value1, value2, "dcAmt");
            return (Criteria) this;
        }

        public Criteria andDcAmtNotBetween(Integer value1, Integer value2) {
            addCriterion("TORDC.DC_AMT not between", value1, value2, "dcAmt");
            return (Criteria) this;
        }

        public Criteria andDcRateIsNull() {
            addCriterion("TORDC.DC_RATE is null");
            return (Criteria) this;
        }

        public Criteria andDcRateIsNotNull() {
            addCriterion("TORDC.DC_RATE is not null");
            return (Criteria) this;
        }

        public Criteria andDcRateEqualTo(BigDecimal value) {
            addCriterion("TORDC.DC_RATE =", value, "dcRate");
            return (Criteria) this;
        }

        public Criteria andDcRateNotEqualTo(BigDecimal value) {
            addCriterion("TORDC.DC_RATE <>", value, "dcRate");
            return (Criteria) this;
        }

        public Criteria andDcRateGreaterThan(BigDecimal value) {
            addCriterion("TORDC.DC_RATE >", value, "dcRate");
            return (Criteria) this;
        }

        public Criteria andDcRateGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("TORDC.DC_RATE >=", value, "dcRate");
            return (Criteria) this;
        }

        public Criteria andDcRateLessThan(BigDecimal value) {
            addCriterion("TORDC.DC_RATE <", value, "dcRate");
            return (Criteria) this;
        }

        public Criteria andDcRateLessThanOrEqualTo(BigDecimal value) {
            addCriterion("TORDC.DC_RATE <=", value, "dcRate");
            return (Criteria) this;
        }

        public Criteria andDcRateIn(List<BigDecimal> values) {
            addCriterion("TORDC.DC_RATE in", values, "dcRate");
            return (Criteria) this;
        }

        public Criteria andDcRateNotIn(List<BigDecimal> values) {
            addCriterion("TORDC.DC_RATE not in", values, "dcRate");
            return (Criteria) this;
        }

        public Criteria andDcRateBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TORDC.DC_RATE between", value1, value2, "dcRate");
            return (Criteria) this;
        }

        public Criteria andDcRateNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TORDC.DC_RATE not between", value1, value2, "dcRate");
            return (Criteria) this;
        }

        public Criteria andDcRateMaxAmtIsNull() {
            addCriterion("TORDC.DC_RATE_MAX_AMT is null");
            return (Criteria) this;
        }

        public Criteria andDcRateMaxAmtIsNotNull() {
            addCriterion("TORDC.DC_RATE_MAX_AMT is not null");
            return (Criteria) this;
        }

        public Criteria andDcRateMaxAmtEqualTo(Integer value) {
            addCriterion("TORDC.DC_RATE_MAX_AMT =", value, "dcRateMaxAmt");
            return (Criteria) this;
        }

        public Criteria andDcRateMaxAmtNotEqualTo(Integer value) {
            addCriterion("TORDC.DC_RATE_MAX_AMT <>", value, "dcRateMaxAmt");
            return (Criteria) this;
        }

        public Criteria andDcRateMaxAmtGreaterThan(Integer value) {
            addCriterion("TORDC.DC_RATE_MAX_AMT >", value, "dcRateMaxAmt");
            return (Criteria) this;
        }

        public Criteria andDcRateMaxAmtGreaterThanOrEqualTo(Integer value) {
            addCriterion("TORDC.DC_RATE_MAX_AMT >=", value, "dcRateMaxAmt");
            return (Criteria) this;
        }

        public Criteria andDcRateMaxAmtLessThan(Integer value) {
            addCriterion("TORDC.DC_RATE_MAX_AMT <", value, "dcRateMaxAmt");
            return (Criteria) this;
        }

        public Criteria andDcRateMaxAmtLessThanOrEqualTo(Integer value) {
            addCriterion("TORDC.DC_RATE_MAX_AMT <=", value, "dcRateMaxAmt");
            return (Criteria) this;
        }

        public Criteria andDcRateMaxAmtIn(List<Integer> values) {
            addCriterion("TORDC.DC_RATE_MAX_AMT in", values, "dcRateMaxAmt");
            return (Criteria) this;
        }

        public Criteria andDcRateMaxAmtNotIn(List<Integer> values) {
            addCriterion("TORDC.DC_RATE_MAX_AMT not in", values, "dcRateMaxAmt");
            return (Criteria) this;
        }

        public Criteria andDcRateMaxAmtBetween(Integer value1, Integer value2) {
            addCriterion("TORDC.DC_RATE_MAX_AMT between", value1, value2, "dcRateMaxAmt");
            return (Criteria) this;
        }

        public Criteria andDcRateMaxAmtNotBetween(Integer value1, Integer value2) {
            addCriterion("TORDC.DC_RATE_MAX_AMT not between", value1, value2, "dcRateMaxAmt");
            return (Criteria) this;
        }

        public Criteria andDcMinUseAmtResYnIsNull() {
            addCriterion("TORDC.DC_MIN_USE_AMT_RES_YN is null");
            return (Criteria) this;
        }

        public Criteria andDcMinUseAmtResYnIsNotNull() {
            addCriterion("TORDC.DC_MIN_USE_AMT_RES_YN is not null");
            return (Criteria) this;
        }

        public Criteria andDcMinUseAmtResYnEqualTo(String value) {
            addCriterion("TORDC.DC_MIN_USE_AMT_RES_YN =", value, "dcMinUseAmtResYn");
            return (Criteria) this;
        }

        public Criteria andDcMinUseAmtResYnNotEqualTo(String value) {
            addCriterion("TORDC.DC_MIN_USE_AMT_RES_YN <>", value, "dcMinUseAmtResYn");
            return (Criteria) this;
        }

        public Criteria andDcMinUseAmtResYnGreaterThan(String value) {
            addCriterion("TORDC.DC_MIN_USE_AMT_RES_YN >", value, "dcMinUseAmtResYn");
            return (Criteria) this;
        }

        public Criteria andDcMinUseAmtResYnGreaterThanOrEqualTo(String value) {
            addCriterion("TORDC.DC_MIN_USE_AMT_RES_YN >=", value, "dcMinUseAmtResYn");
            return (Criteria) this;
        }

        public Criteria andDcMinUseAmtResYnLessThan(String value) {
            addCriterion("TORDC.DC_MIN_USE_AMT_RES_YN <", value, "dcMinUseAmtResYn");
            return (Criteria) this;
        }

        public Criteria andDcMinUseAmtResYnLessThanOrEqualTo(String value) {
            addCriterion("TORDC.DC_MIN_USE_AMT_RES_YN <=", value, "dcMinUseAmtResYn");
            return (Criteria) this;
        }

        public Criteria andDcMinUseAmtResYnLike(String value) {
            addCriterion("TORDC.DC_MIN_USE_AMT_RES_YN like", value, "dcMinUseAmtResYn");
            return (Criteria) this;
        }

        public Criteria andDcMinUseAmtResYnNotLike(String value) {
            addCriterion("TORDC.DC_MIN_USE_AMT_RES_YN not like", value, "dcMinUseAmtResYn");
            return (Criteria) this;
        }

        public Criteria andDcMinUseAmtResYnIn(List<String> values) {
            addCriterion("TORDC.DC_MIN_USE_AMT_RES_YN in", values, "dcMinUseAmtResYn");
            return (Criteria) this;
        }

        public Criteria andDcMinUseAmtResYnNotIn(List<String> values) {
            addCriterion("TORDC.DC_MIN_USE_AMT_RES_YN not in", values, "dcMinUseAmtResYn");
            return (Criteria) this;
        }

        public Criteria andDcMinUseAmtResYnBetween(String value1, String value2) {
            addCriterion("TORDC.DC_MIN_USE_AMT_RES_YN between", value1, value2, "dcMinUseAmtResYn");
            return (Criteria) this;
        }

        public Criteria andDcMinUseAmtResYnNotBetween(String value1, String value2) {
            addCriterion("TORDC.DC_MIN_USE_AMT_RES_YN not between", value1, value2, "dcMinUseAmtResYn");
            return (Criteria) this;
        }

        public Criteria andDcMinUseAmtIsNull() {
            addCriterion("TORDC.DC_MIN_USE_AMT is null");
            return (Criteria) this;
        }

        public Criteria andDcMinUseAmtIsNotNull() {
            addCriterion("TORDC.DC_MIN_USE_AMT is not null");
            return (Criteria) this;
        }

        public Criteria andDcMinUseAmtEqualTo(Integer value) {
            addCriterion("TORDC.DC_MIN_USE_AMT =", value, "dcMinUseAmt");
            return (Criteria) this;
        }

        public Criteria andDcMinUseAmtNotEqualTo(Integer value) {
            addCriterion("TORDC.DC_MIN_USE_AMT <>", value, "dcMinUseAmt");
            return (Criteria) this;
        }

        public Criteria andDcMinUseAmtGreaterThan(Integer value) {
            addCriterion("TORDC.DC_MIN_USE_AMT >", value, "dcMinUseAmt");
            return (Criteria) this;
        }

        public Criteria andDcMinUseAmtGreaterThanOrEqualTo(Integer value) {
            addCriterion("TORDC.DC_MIN_USE_AMT >=", value, "dcMinUseAmt");
            return (Criteria) this;
        }

        public Criteria andDcMinUseAmtLessThan(Integer value) {
            addCriterion("TORDC.DC_MIN_USE_AMT <", value, "dcMinUseAmt");
            return (Criteria) this;
        }

        public Criteria andDcMinUseAmtLessThanOrEqualTo(Integer value) {
            addCriterion("TORDC.DC_MIN_USE_AMT <=", value, "dcMinUseAmt");
            return (Criteria) this;
        }

        public Criteria andDcMinUseAmtIn(List<Integer> values) {
            addCriterion("TORDC.DC_MIN_USE_AMT in", values, "dcMinUseAmt");
            return (Criteria) this;
        }

        public Criteria andDcMinUseAmtNotIn(List<Integer> values) {
            addCriterion("TORDC.DC_MIN_USE_AMT not in", values, "dcMinUseAmt");
            return (Criteria) this;
        }

        public Criteria andDcMinUseAmtBetween(Integer value1, Integer value2) {
            addCriterion("TORDC.DC_MIN_USE_AMT between", value1, value2, "dcMinUseAmt");
            return (Criteria) this;
        }

        public Criteria andDcMinUseAmtNotBetween(Integer value1, Integer value2) {
            addCriterion("TORDC.DC_MIN_USE_AMT not between", value1, value2, "dcMinUseAmt");
            return (Criteria) this;
        }

        public Criteria andDcAddDcCpnYnIsNull() {
            addCriterion("TORDC.DC_ADD_DC_CPN_YN is null");
            return (Criteria) this;
        }

        public Criteria andDcAddDcCpnYnIsNotNull() {
            addCriterion("TORDC.DC_ADD_DC_CPN_YN is not null");
            return (Criteria) this;
        }

        public Criteria andDcAddDcCpnYnEqualTo(String value) {
            addCriterion("TORDC.DC_ADD_DC_CPN_YN =", value, "dcAddDcCpnYn");
            return (Criteria) this;
        }

        public Criteria andDcAddDcCpnYnNotEqualTo(String value) {
            addCriterion("TORDC.DC_ADD_DC_CPN_YN <>", value, "dcAddDcCpnYn");
            return (Criteria) this;
        }

        public Criteria andDcAddDcCpnYnGreaterThan(String value) {
            addCriterion("TORDC.DC_ADD_DC_CPN_YN >", value, "dcAddDcCpnYn");
            return (Criteria) this;
        }

        public Criteria andDcAddDcCpnYnGreaterThanOrEqualTo(String value) {
            addCriterion("TORDC.DC_ADD_DC_CPN_YN >=", value, "dcAddDcCpnYn");
            return (Criteria) this;
        }

        public Criteria andDcAddDcCpnYnLessThan(String value) {
            addCriterion("TORDC.DC_ADD_DC_CPN_YN <", value, "dcAddDcCpnYn");
            return (Criteria) this;
        }

        public Criteria andDcAddDcCpnYnLessThanOrEqualTo(String value) {
            addCriterion("TORDC.DC_ADD_DC_CPN_YN <=", value, "dcAddDcCpnYn");
            return (Criteria) this;
        }

        public Criteria andDcAddDcCpnYnLike(String value) {
            addCriterion("TORDC.DC_ADD_DC_CPN_YN like", value, "dcAddDcCpnYn");
            return (Criteria) this;
        }

        public Criteria andDcAddDcCpnYnNotLike(String value) {
            addCriterion("TORDC.DC_ADD_DC_CPN_YN not like", value, "dcAddDcCpnYn");
            return (Criteria) this;
        }

        public Criteria andDcAddDcCpnYnIn(List<String> values) {
            addCriterion("TORDC.DC_ADD_DC_CPN_YN in", values, "dcAddDcCpnYn");
            return (Criteria) this;
        }

        public Criteria andDcAddDcCpnYnNotIn(List<String> values) {
            addCriterion("TORDC.DC_ADD_DC_CPN_YN not in", values, "dcAddDcCpnYn");
            return (Criteria) this;
        }

        public Criteria andDcAddDcCpnYnBetween(String value1, String value2) {
            addCriterion("TORDC.DC_ADD_DC_CPN_YN between", value1, value2, "dcAddDcCpnYn");
            return (Criteria) this;
        }

        public Criteria andDcAddDcCpnYnNotBetween(String value1, String value2) {
            addCriterion("TORDC.DC_ADD_DC_CPN_YN not between", value1, value2, "dcAddDcCpnYn");
            return (Criteria) this;
        }

        public Criteria andRealDcAmtIsNull() {
            addCriterion("TORDC.REAL_DC_AMT is null");
            return (Criteria) this;
        }

        public Criteria andRealDcAmtIsNotNull() {
            addCriterion("TORDC.REAL_DC_AMT is not null");
            return (Criteria) this;
        }

        public Criteria andRealDcAmtEqualTo(Integer value) {
            addCriterion("TORDC.REAL_DC_AMT =", value, "realDcAmt");
            return (Criteria) this;
        }

        public Criteria andRealDcAmtNotEqualTo(Integer value) {
            addCriterion("TORDC.REAL_DC_AMT <>", value, "realDcAmt");
            return (Criteria) this;
        }

        public Criteria andRealDcAmtGreaterThan(Integer value) {
            addCriterion("TORDC.REAL_DC_AMT >", value, "realDcAmt");
            return (Criteria) this;
        }

        public Criteria andRealDcAmtGreaterThanOrEqualTo(Integer value) {
            addCriterion("TORDC.REAL_DC_AMT >=", value, "realDcAmt");
            return (Criteria) this;
        }

        public Criteria andRealDcAmtLessThan(Integer value) {
            addCriterion("TORDC.REAL_DC_AMT <", value, "realDcAmt");
            return (Criteria) this;
        }

        public Criteria andRealDcAmtLessThanOrEqualTo(Integer value) {
            addCriterion("TORDC.REAL_DC_AMT <=", value, "realDcAmt");
            return (Criteria) this;
        }

        public Criteria andRealDcAmtIn(List<Integer> values) {
            addCriterion("TORDC.REAL_DC_AMT in", values, "realDcAmt");
            return (Criteria) this;
        }

        public Criteria andRealDcAmtNotIn(List<Integer> values) {
            addCriterion("TORDC.REAL_DC_AMT not in", values, "realDcAmt");
            return (Criteria) this;
        }

        public Criteria andRealDcAmtBetween(Integer value1, Integer value2) {
            addCriterion("TORDC.REAL_DC_AMT between", value1, value2, "realDcAmt");
            return (Criteria) this;
        }

        public Criteria andRealDcAmtNotBetween(Integer value1, Integer value2) {
            addCriterion("TORDC.REAL_DC_AMT not between", value1, value2, "realDcAmt");
            return (Criteria) this;
        }

        public Criteria andRegDtIsNull() {
            addCriterion("TORDC.REG_DT is null");
            return (Criteria) this;
        }

        public Criteria andRegDtIsNotNull() {
            addCriterion("TORDC.REG_DT is not null");
            return (Criteria) this;
        }

        public Criteria andRegDtEqualTo(Date value) {
            addCriterion("TORDC.REG_DT =", value, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtNotEqualTo(Date value) {
            addCriterion("TORDC.REG_DT <>", value, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtGreaterThan(Date value) {
            addCriterion("TORDC.REG_DT >", value, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtGreaterThanOrEqualTo(Date value) {
            addCriterion("TORDC.REG_DT >=", value, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtLessThan(Date value) {
            addCriterion("TORDC.REG_DT <", value, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtLessThanOrEqualTo(Date value) {
            addCriterion("TORDC.REG_DT <=", value, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtIn(List<Date> values) {
            addCriterion("TORDC.REG_DT in", values, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtNotIn(List<Date> values) {
            addCriterion("TORDC.REG_DT not in", values, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtBetween(Date value1, Date value2) {
            addCriterion("TORDC.REG_DT between", value1, value2, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtNotBetween(Date value1, Date value2) {
            addCriterion("TORDC.REG_DT not between", value1, value2, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegIdIsNull() {
            addCriterion("TORDC.REG_ID is null");
            return (Criteria) this;
        }

        public Criteria andRegIdIsNotNull() {
            addCriterion("TORDC.REG_ID is not null");
            return (Criteria) this;
        }

        public Criteria andRegIdEqualTo(String value) {
            addCriterion("TORDC.REG_ID =", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdNotEqualTo(String value) {
            addCriterion("TORDC.REG_ID <>", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdGreaterThan(String value) {
            addCriterion("TORDC.REG_ID >", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdGreaterThanOrEqualTo(String value) {
            addCriterion("TORDC.REG_ID >=", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdLessThan(String value) {
            addCriterion("TORDC.REG_ID <", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdLessThanOrEqualTo(String value) {
            addCriterion("TORDC.REG_ID <=", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdLike(String value) {
            addCriterion("TORDC.REG_ID like", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdNotLike(String value) {
            addCriterion("TORDC.REG_ID not like", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdIn(List<String> values) {
            addCriterion("TORDC.REG_ID in", values, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdNotIn(List<String> values) {
            addCriterion("TORDC.REG_ID not in", values, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdBetween(String value1, String value2) {
            addCriterion("TORDC.REG_ID between", value1, value2, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdNotBetween(String value1, String value2) {
            addCriterion("TORDC.REG_ID not between", value1, value2, "regId");
            return (Criteria) this;
        }

        public Criteria andModDtIsNull() {
            addCriterion("TORDC.MOD_DT is null");
            return (Criteria) this;
        }

        public Criteria andModDtIsNotNull() {
            addCriterion("TORDC.MOD_DT is not null");
            return (Criteria) this;
        }

        public Criteria andModDtEqualTo(Date value) {
            addCriterion("TORDC.MOD_DT =", value, "modDt");
            return (Criteria) this;
        }

        public Criteria andModDtNotEqualTo(Date value) {
            addCriterion("TORDC.MOD_DT <>", value, "modDt");
            return (Criteria) this;
        }

        public Criteria andModDtGreaterThan(Date value) {
            addCriterion("TORDC.MOD_DT >", value, "modDt");
            return (Criteria) this;
        }

        public Criteria andModDtGreaterThanOrEqualTo(Date value) {
            addCriterion("TORDC.MOD_DT >=", value, "modDt");
            return (Criteria) this;
        }

        public Criteria andModDtLessThan(Date value) {
            addCriterion("TORDC.MOD_DT <", value, "modDt");
            return (Criteria) this;
        }

        public Criteria andModDtLessThanOrEqualTo(Date value) {
            addCriterion("TORDC.MOD_DT <=", value, "modDt");
            return (Criteria) this;
        }

        public Criteria andModDtIn(List<Date> values) {
            addCriterion("TORDC.MOD_DT in", values, "modDt");
            return (Criteria) this;
        }

        public Criteria andModDtNotIn(List<Date> values) {
            addCriterion("TORDC.MOD_DT not in", values, "modDt");
            return (Criteria) this;
        }

        public Criteria andModDtBetween(Date value1, Date value2) {
            addCriterion("TORDC.MOD_DT between", value1, value2, "modDt");
            return (Criteria) this;
        }

        public Criteria andModDtNotBetween(Date value1, Date value2) {
            addCriterion("TORDC.MOD_DT not between", value1, value2, "modDt");
            return (Criteria) this;
        }

        public Criteria andModIdIsNull() {
            addCriterion("TORDC.MOD_ID is null");
            return (Criteria) this;
        }

        public Criteria andModIdIsNotNull() {
            addCriterion("TORDC.MOD_ID is not null");
            return (Criteria) this;
        }

        public Criteria andModIdEqualTo(String value) {
            addCriterion("TORDC.MOD_ID =", value, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdNotEqualTo(String value) {
            addCriterion("TORDC.MOD_ID <>", value, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdGreaterThan(String value) {
            addCriterion("TORDC.MOD_ID >", value, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdGreaterThanOrEqualTo(String value) {
            addCriterion("TORDC.MOD_ID >=", value, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdLessThan(String value) {
            addCriterion("TORDC.MOD_ID <", value, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdLessThanOrEqualTo(String value) {
            addCriterion("TORDC.MOD_ID <=", value, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdLike(String value) {
            addCriterion("TORDC.MOD_ID like", value, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdNotLike(String value) {
            addCriterion("TORDC.MOD_ID not like", value, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdIn(List<String> values) {
            addCriterion("TORDC.MOD_ID in", values, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdNotIn(List<String> values) {
            addCriterion("TORDC.MOD_ID not in", values, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdBetween(String value1, String value2) {
            addCriterion("TORDC.MOD_ID between", value1, value2, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdNotBetween(String value1, String value2) {
            addCriterion("TORDC.MOD_ID not between", value1, value2, "modId");
            return (Criteria) this;
        }

        public Criteria andOrdCpnAplyCdLikeInsensitive(String value) {
            addCriterion("upper(TORDC.ORD_CPN_APLY_CD) like", value.toUpperCase(), "ordCpnAplyCd");
            return (Criteria) this;
        }

        public Criteria andCpnTpCdLikeInsensitive(String value) {
            addCriterion("upper(TORDC.CPN_TP_CD) like", value.toUpperCase(), "cpnTpCd");
            return (Criteria) this;
        }

        public Criteria andCpnAutoClCdLikeInsensitive(String value) {
            addCriterion("upper(TORDC.CPN_AUTO_CL_CD) like", value.toUpperCase(), "cpnAutoClCd");
            return (Criteria) this;
        }

        public Criteria andCpnNoLikeInsensitive(String value) {
            addCriterion("upper(TORDC.CPN_NO) like", value.toUpperCase(), "cpnNo");
            return (Criteria) this;
        }

        public Criteria andCpnNmLikeInsensitive(String value) {
            addCriterion("upper(TORDC.CPN_NM) like", value.toUpperCase(), "cpnNm");
            return (Criteria) this;
        }

        public Criteria andMbrCpnNoLikeInsensitive(String value) {
            addCriterion("upper(TORDC.MBR_CPN_NO) like", value.toUpperCase(), "mbrCpnNo");
            return (Criteria) this;
        }

        public Criteria andDcMethCdLikeInsensitive(String value) {
            addCriterion("upper(TORDC.DC_METH_CD) like", value.toUpperCase(), "dcMethCd");
            return (Criteria) this;
        }

        public Criteria andDcMinUseAmtResYnLikeInsensitive(String value) {
            addCriterion("upper(TORDC.DC_MIN_USE_AMT_RES_YN) like", value.toUpperCase(), "dcMinUseAmtResYn");
            return (Criteria) this;
        }

        public Criteria andDcAddDcCpnYnLikeInsensitive(String value) {
            addCriterion("upper(TORDC.DC_ADD_DC_CPN_YN) like", value.toUpperCase(), "dcAddDcCpnYn");
            return (Criteria) this;
        }

        public Criteria andRegIdLikeInsensitive(String value) {
            addCriterion("upper(TORDC.REG_ID) like", value.toUpperCase(), "regId");
            return (Criteria) this;
        }

        public Criteria andModIdLikeInsensitive(String value) {
            addCriterion("upper(TORDC.MOD_ID) like", value.toUpperCase(), "modId");
            return (Criteria) this;
        }

        public Criteria andOrdCpnAplyCdLikeLeft(String value) {
            addCriterion("TORDC.ORD_CPN_APLY_CD like ", "%" + value, "ordCpnAplyCd");
            return (Criteria) this;
        }

        public Criteria andOrdCpnAplyCdLikeRight(String value) {
            addCriterion("TORDC.ORD_CPN_APLY_CD like ", value + "%", "ordCpnAplyCd");
            return (Criteria) this;
        }

        public Criteria andOrdCpnAplyCdLikeBoth(String value) {
            addCriterion("TORDC.ORD_CPN_APLY_CD like ", "%" + value + "%", "ordCpnAplyCd");
            return (Criteria) this;
        }

        public Criteria andCpnTpCdLikeLeft(String value) {
            addCriterion("TORDC.CPN_TP_CD like ", "%" + value, "cpnTpCd");
            return (Criteria) this;
        }

        public Criteria andCpnTpCdLikeRight(String value) {
            addCriterion("TORDC.CPN_TP_CD like ", value + "%", "cpnTpCd");
            return (Criteria) this;
        }

        public Criteria andCpnTpCdLikeBoth(String value) {
            addCriterion("TORDC.CPN_TP_CD like ", "%" + value + "%", "cpnTpCd");
            return (Criteria) this;
        }

        public Criteria andCpnAutoClCdLikeLeft(String value) {
            addCriterion("TORDC.CPN_AUTO_CL_CD like ", "%" + value, "cpnAutoClCd");
            return (Criteria) this;
        }

        public Criteria andCpnAutoClCdLikeRight(String value) {
            addCriterion("TORDC.CPN_AUTO_CL_CD like ", value + "%", "cpnAutoClCd");
            return (Criteria) this;
        }

        public Criteria andCpnAutoClCdLikeBoth(String value) {
            addCriterion("TORDC.CPN_AUTO_CL_CD like ", "%" + value + "%", "cpnAutoClCd");
            return (Criteria) this;
        }

        public Criteria andCpnNoLikeLeft(String value) {
            addCriterion("TORDC.CPN_NO like ", "%" + value, "cpnNo");
            return (Criteria) this;
        }

        public Criteria andCpnNoLikeRight(String value) {
            addCriterion("TORDC.CPN_NO like ", value + "%", "cpnNo");
            return (Criteria) this;
        }

        public Criteria andCpnNoLikeBoth(String value) {
            addCriterion("TORDC.CPN_NO like ", "%" + value + "%", "cpnNo");
            return (Criteria) this;
        }

        public Criteria andCpnNmLikeLeft(String value) {
            addCriterion("TORDC.CPN_NM like ", "%" + value, "cpnNm");
            return (Criteria) this;
        }

        public Criteria andCpnNmLikeRight(String value) {
            addCriterion("TORDC.CPN_NM like ", value + "%", "cpnNm");
            return (Criteria) this;
        }

        public Criteria andCpnNmLikeBoth(String value) {
            addCriterion("TORDC.CPN_NM like ", "%" + value + "%", "cpnNm");
            return (Criteria) this;
        }

        public Criteria andMbrCpnNoLikeLeft(String value) {
            addCriterion("TORDC.MBR_CPN_NO like ", "%" + value, "mbrCpnNo");
            return (Criteria) this;
        }

        public Criteria andMbrCpnNoLikeRight(String value) {
            addCriterion("TORDC.MBR_CPN_NO like ", value + "%", "mbrCpnNo");
            return (Criteria) this;
        }

        public Criteria andMbrCpnNoLikeBoth(String value) {
            addCriterion("TORDC.MBR_CPN_NO like ", "%" + value + "%", "mbrCpnNo");
            return (Criteria) this;
        }

        public Criteria andDcMethCdLikeLeft(String value) {
            addCriterion("TORDC.DC_METH_CD like ", "%" + value, "dcMethCd");
            return (Criteria) this;
        }

        public Criteria andDcMethCdLikeRight(String value) {
            addCriterion("TORDC.DC_METH_CD like ", value + "%", "dcMethCd");
            return (Criteria) this;
        }

        public Criteria andDcMethCdLikeBoth(String value) {
            addCriterion("TORDC.DC_METH_CD like ", "%" + value + "%", "dcMethCd");
            return (Criteria) this;
        }

        public Criteria andDcMinUseAmtResYnLikeLeft(String value) {
            addCriterion("TORDC.DC_MIN_USE_AMT_RES_YN like ", "%" + value, "dcMinUseAmtResYn");
            return (Criteria) this;
        }

        public Criteria andDcMinUseAmtResYnLikeRight(String value) {
            addCriterion("TORDC.DC_MIN_USE_AMT_RES_YN like ", value + "%", "dcMinUseAmtResYn");
            return (Criteria) this;
        }

        public Criteria andDcMinUseAmtResYnLikeBoth(String value) {
            addCriterion("TORDC.DC_MIN_USE_AMT_RES_YN like ", "%" + value + "%", "dcMinUseAmtResYn");
            return (Criteria) this;
        }

        public Criteria andDcAddDcCpnYnLikeLeft(String value) {
            addCriterion("TORDC.DC_ADD_DC_CPN_YN like ", "%" + value, "dcAddDcCpnYn");
            return (Criteria) this;
        }

        public Criteria andDcAddDcCpnYnLikeRight(String value) {
            addCriterion("TORDC.DC_ADD_DC_CPN_YN like ", value + "%", "dcAddDcCpnYn");
            return (Criteria) this;
        }

        public Criteria andDcAddDcCpnYnLikeBoth(String value) {
            addCriterion("TORDC.DC_ADD_DC_CPN_YN like ", "%" + value + "%", "dcAddDcCpnYn");
            return (Criteria) this;
        }

        public Criteria andRegIdLikeLeft(String value) {
            addCriterion("TORDC.REG_ID like ", "%" + value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdLikeRight(String value) {
            addCriterion("TORDC.REG_ID like ", value + "%", "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdLikeBoth(String value) {
            addCriterion("TORDC.REG_ID like ", "%" + value + "%", "regId");
            return (Criteria) this;
        }

        public Criteria andModIdLikeLeft(String value) {
            addCriterion("TORDC.MOD_ID like ", "%" + value, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdLikeRight(String value) {
            addCriterion("TORDC.MOD_ID like ", value + "%", "modId");
            return (Criteria) this;
        }

        public Criteria andModIdLikeBoth(String value) {
            addCriterion("TORDC.MOD_ID like ", "%" + value + "%", "modId");
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