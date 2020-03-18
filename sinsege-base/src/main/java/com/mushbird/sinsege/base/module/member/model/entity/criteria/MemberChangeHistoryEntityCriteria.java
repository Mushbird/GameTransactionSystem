package com.mushbird.sinsege.base.module.member.model.entity.criteria;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MemberChangeHistoryEntityCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    public MemberChangeHistoryEntityCriteria() {
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

        public Criteria andMbrChistIdIsNull() {
            addCriterion("TMCH.MBR_CHIST_ID is null");
            return (Criteria) this;
        }

        public Criteria andMbrChistIdIsNotNull() {
            addCriterion("TMCH.MBR_CHIST_ID is not null");
            return (Criteria) this;
        }

        public Criteria andMbrChistIdEqualTo(Integer value) {
            addCriterion("TMCH.MBR_CHIST_ID =", value, "mbrChistId");
            return (Criteria) this;
        }

        public Criteria andMbrChistIdNotEqualTo(Integer value) {
            addCriterion("TMCH.MBR_CHIST_ID <>", value, "mbrChistId");
            return (Criteria) this;
        }

        public Criteria andMbrChistIdGreaterThan(Integer value) {
            addCriterion("TMCH.MBR_CHIST_ID >", value, "mbrChistId");
            return (Criteria) this;
        }

        public Criteria andMbrChistIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("TMCH.MBR_CHIST_ID >=", value, "mbrChistId");
            return (Criteria) this;
        }

        public Criteria andMbrChistIdLessThan(Integer value) {
            addCriterion("TMCH.MBR_CHIST_ID <", value, "mbrChistId");
            return (Criteria) this;
        }

        public Criteria andMbrChistIdLessThanOrEqualTo(Integer value) {
            addCriterion("TMCH.MBR_CHIST_ID <=", value, "mbrChistId");
            return (Criteria) this;
        }

        public Criteria andMbrChistIdIn(List<Integer> values) {
            addCriterion("TMCH.MBR_CHIST_ID in", values, "mbrChistId");
            return (Criteria) this;
        }

        public Criteria andMbrChistIdNotIn(List<Integer> values) {
            addCriterion("TMCH.MBR_CHIST_ID not in", values, "mbrChistId");
            return (Criteria) this;
        }

        public Criteria andMbrChistIdBetween(Integer value1, Integer value2) {
            addCriterion("TMCH.MBR_CHIST_ID between", value1, value2, "mbrChistId");
            return (Criteria) this;
        }

        public Criteria andMbrChistIdNotBetween(Integer value1, Integer value2) {
            addCriterion("TMCH.MBR_CHIST_ID not between", value1, value2, "mbrChistId");
            return (Criteria) this;
        }

        public Criteria andMbrIdIsNull() {
            addCriterion("TMCH.MBR_ID is null");
            return (Criteria) this;
        }

        public Criteria andMbrIdIsNotNull() {
            addCriterion("TMCH.MBR_ID is not null");
            return (Criteria) this;
        }

        public Criteria andMbrIdEqualTo(String value) {
            addCriterion("TMCH.MBR_ID =", value, "mbrId");
            return (Criteria) this;
        }

        public Criteria andMbrIdNotEqualTo(String value) {
            addCriterion("TMCH.MBR_ID <>", value, "mbrId");
            return (Criteria) this;
        }

        public Criteria andMbrIdGreaterThan(String value) {
            addCriterion("TMCH.MBR_ID >", value, "mbrId");
            return (Criteria) this;
        }

        public Criteria andMbrIdGreaterThanOrEqualTo(String value) {
            addCriterion("TMCH.MBR_ID >=", value, "mbrId");
            return (Criteria) this;
        }

        public Criteria andMbrIdLessThan(String value) {
            addCriterion("TMCH.MBR_ID <", value, "mbrId");
            return (Criteria) this;
        }

        public Criteria andMbrIdLessThanOrEqualTo(String value) {
            addCriterion("TMCH.MBR_ID <=", value, "mbrId");
            return (Criteria) this;
        }

        public Criteria andMbrIdLike(String value) {
            addCriterion("TMCH.MBR_ID like", value, "mbrId");
            return (Criteria) this;
        }

        public Criteria andMbrIdNotLike(String value) {
            addCriterion("TMCH.MBR_ID not like", value, "mbrId");
            return (Criteria) this;
        }

        public Criteria andMbrIdIn(List<String> values) {
            addCriterion("TMCH.MBR_ID in", values, "mbrId");
            return (Criteria) this;
        }

        public Criteria andMbrIdNotIn(List<String> values) {
            addCriterion("TMCH.MBR_ID not in", values, "mbrId");
            return (Criteria) this;
        }

        public Criteria andMbrIdBetween(String value1, String value2) {
            addCriterion("TMCH.MBR_ID between", value1, value2, "mbrId");
            return (Criteria) this;
        }

        public Criteria andMbrIdNotBetween(String value1, String value2) {
            addCriterion("TMCH.MBR_ID not between", value1, value2, "mbrId");
            return (Criteria) this;
        }

        public Criteria andMbrGrdCdIsNull() {
            addCriterion("TMCH.MBR_GRD_CD is null");
            return (Criteria) this;
        }

        public Criteria andMbrGrdCdIsNotNull() {
            addCriterion("TMCH.MBR_GRD_CD is not null");
            return (Criteria) this;
        }

        public Criteria andMbrGrdCdEqualTo(String value) {
            addCriterion("TMCH.MBR_GRD_CD =", value, "mbrGrdCd");
            return (Criteria) this;
        }

        public Criteria andMbrGrdCdNotEqualTo(String value) {
            addCriterion("TMCH.MBR_GRD_CD <>", value, "mbrGrdCd");
            return (Criteria) this;
        }

        public Criteria andMbrGrdCdGreaterThan(String value) {
            addCriterion("TMCH.MBR_GRD_CD >", value, "mbrGrdCd");
            return (Criteria) this;
        }

        public Criteria andMbrGrdCdGreaterThanOrEqualTo(String value) {
            addCriterion("TMCH.MBR_GRD_CD >=", value, "mbrGrdCd");
            return (Criteria) this;
        }

        public Criteria andMbrGrdCdLessThan(String value) {
            addCriterion("TMCH.MBR_GRD_CD <", value, "mbrGrdCd");
            return (Criteria) this;
        }

        public Criteria andMbrGrdCdLessThanOrEqualTo(String value) {
            addCriterion("TMCH.MBR_GRD_CD <=", value, "mbrGrdCd");
            return (Criteria) this;
        }

        public Criteria andMbrGrdCdLike(String value) {
            addCriterion("TMCH.MBR_GRD_CD like", value, "mbrGrdCd");
            return (Criteria) this;
        }

        public Criteria andMbrGrdCdNotLike(String value) {
            addCriterion("TMCH.MBR_GRD_CD not like", value, "mbrGrdCd");
            return (Criteria) this;
        }

        public Criteria andMbrGrdCdIn(List<String> values) {
            addCriterion("TMCH.MBR_GRD_CD in", values, "mbrGrdCd");
            return (Criteria) this;
        }

        public Criteria andMbrGrdCdNotIn(List<String> values) {
            addCriterion("TMCH.MBR_GRD_CD not in", values, "mbrGrdCd");
            return (Criteria) this;
        }

        public Criteria andMbrGrdCdBetween(String value1, String value2) {
            addCriterion("TMCH.MBR_GRD_CD between", value1, value2, "mbrGrdCd");
            return (Criteria) this;
        }

        public Criteria andMbrGrdCdNotBetween(String value1, String value2) {
            addCriterion("TMCH.MBR_GRD_CD not between", value1, value2, "mbrGrdCd");
            return (Criteria) this;
        }

        public Criteria andMbrNmIsNull() {
            addCriterion("TMCH.MBR_NM is null");
            return (Criteria) this;
        }

        public Criteria andMbrNmIsNotNull() {
            addCriterion("TMCH.MBR_NM is not null");
            return (Criteria) this;
        }

        public Criteria andMbrNmEqualTo(String value) {
            addCriterion("TMCH.MBR_NM =", value, "mbrNm");
            return (Criteria) this;
        }

        public Criteria andMbrNmNotEqualTo(String value) {
            addCriterion("TMCH.MBR_NM <>", value, "mbrNm");
            return (Criteria) this;
        }

        public Criteria andMbrNmGreaterThan(String value) {
            addCriterion("TMCH.MBR_NM >", value, "mbrNm");
            return (Criteria) this;
        }

        public Criteria andMbrNmGreaterThanOrEqualTo(String value) {
            addCriterion("TMCH.MBR_NM >=", value, "mbrNm");
            return (Criteria) this;
        }

        public Criteria andMbrNmLessThan(String value) {
            addCriterion("TMCH.MBR_NM <", value, "mbrNm");
            return (Criteria) this;
        }

        public Criteria andMbrNmLessThanOrEqualTo(String value) {
            addCriterion("TMCH.MBR_NM <=", value, "mbrNm");
            return (Criteria) this;
        }

        public Criteria andMbrNmLike(String value) {
            addCriterion("TMCH.MBR_NM like", value, "mbrNm");
            return (Criteria) this;
        }

        public Criteria andMbrNmNotLike(String value) {
            addCriterion("TMCH.MBR_NM not like", value, "mbrNm");
            return (Criteria) this;
        }

        public Criteria andMbrNmIn(List<String> values) {
            addCriterion("TMCH.MBR_NM in", values, "mbrNm");
            return (Criteria) this;
        }

        public Criteria andMbrNmNotIn(List<String> values) {
            addCriterion("TMCH.MBR_NM not in", values, "mbrNm");
            return (Criteria) this;
        }

        public Criteria andMbrNmBetween(String value1, String value2) {
            addCriterion("TMCH.MBR_NM between", value1, value2, "mbrNm");
            return (Criteria) this;
        }

        public Criteria andMbrNmNotBetween(String value1, String value2) {
            addCriterion("TMCH.MBR_NM not between", value1, value2, "mbrNm");
            return (Criteria) this;
        }

        public Criteria andCpNoIsNull() {
            addCriterion("TMCH.CP_NO is null");
            return (Criteria) this;
        }

        public Criteria andCpNoIsNotNull() {
            addCriterion("TMCH.CP_NO is not null");
            return (Criteria) this;
        }

        public Criteria andCpNoEqualTo(String value) {
            addCriterion("TMCH.CP_NO =", value, "cpNo");
            return (Criteria) this;
        }

        public Criteria andCpNoNotEqualTo(String value) {
            addCriterion("TMCH.CP_NO <>", value, "cpNo");
            return (Criteria) this;
        }

        public Criteria andCpNoGreaterThan(String value) {
            addCriterion("TMCH.CP_NO >", value, "cpNo");
            return (Criteria) this;
        }

        public Criteria andCpNoGreaterThanOrEqualTo(String value) {
            addCriterion("TMCH.CP_NO >=", value, "cpNo");
            return (Criteria) this;
        }

        public Criteria andCpNoLessThan(String value) {
            addCriterion("TMCH.CP_NO <", value, "cpNo");
            return (Criteria) this;
        }

        public Criteria andCpNoLessThanOrEqualTo(String value) {
            addCriterion("TMCH.CP_NO <=", value, "cpNo");
            return (Criteria) this;
        }

        public Criteria andCpNoLike(String value) {
            addCriterion("TMCH.CP_NO like", value, "cpNo");
            return (Criteria) this;
        }

        public Criteria andCpNoNotLike(String value) {
            addCriterion("TMCH.CP_NO not like", value, "cpNo");
            return (Criteria) this;
        }

        public Criteria andCpNoIn(List<String> values) {
            addCriterion("TMCH.CP_NO in", values, "cpNo");
            return (Criteria) this;
        }

        public Criteria andCpNoNotIn(List<String> values) {
            addCriterion("TMCH.CP_NO not in", values, "cpNo");
            return (Criteria) this;
        }

        public Criteria andCpNoBetween(String value1, String value2) {
            addCriterion("TMCH.CP_NO between", value1, value2, "cpNo");
            return (Criteria) this;
        }

        public Criteria andCpNoNotBetween(String value1, String value2) {
            addCriterion("TMCH.CP_NO not between", value1, value2, "cpNo");
            return (Criteria) this;
        }

        public Criteria andEmailIsNull() {
            addCriterion("TMCH.EMAIL is null");
            return (Criteria) this;
        }

        public Criteria andEmailIsNotNull() {
            addCriterion("TMCH.EMAIL is not null");
            return (Criteria) this;
        }

        public Criteria andEmailEqualTo(String value) {
            addCriterion("TMCH.EMAIL =", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotEqualTo(String value) {
            addCriterion("TMCH.EMAIL <>", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThan(String value) {
            addCriterion("TMCH.EMAIL >", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThanOrEqualTo(String value) {
            addCriterion("TMCH.EMAIL >=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThan(String value) {
            addCriterion("TMCH.EMAIL <", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThanOrEqualTo(String value) {
            addCriterion("TMCH.EMAIL <=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLike(String value) {
            addCriterion("TMCH.EMAIL like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotLike(String value) {
            addCriterion("TMCH.EMAIL not like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailIn(List<String> values) {
            addCriterion("TMCH.EMAIL in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotIn(List<String> values) {
            addCriterion("TMCH.EMAIL not in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailBetween(String value1, String value2) {
            addCriterion("TMCH.EMAIL between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotBetween(String value1, String value2) {
            addCriterion("TMCH.EMAIL not between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andBadMbrYnIsNull() {
            addCriterion("TMCH.BAD_MBR_YN is null");
            return (Criteria) this;
        }

        public Criteria andBadMbrYnIsNotNull() {
            addCriterion("TMCH.BAD_MBR_YN is not null");
            return (Criteria) this;
        }

        public Criteria andBadMbrYnEqualTo(String value) {
            addCriterion("TMCH.BAD_MBR_YN =", value, "badMbrYn");
            return (Criteria) this;
        }

        public Criteria andBadMbrYnNotEqualTo(String value) {
            addCriterion("TMCH.BAD_MBR_YN <>", value, "badMbrYn");
            return (Criteria) this;
        }

        public Criteria andBadMbrYnGreaterThan(String value) {
            addCriterion("TMCH.BAD_MBR_YN >", value, "badMbrYn");
            return (Criteria) this;
        }

        public Criteria andBadMbrYnGreaterThanOrEqualTo(String value) {
            addCriterion("TMCH.BAD_MBR_YN >=", value, "badMbrYn");
            return (Criteria) this;
        }

        public Criteria andBadMbrYnLessThan(String value) {
            addCriterion("TMCH.BAD_MBR_YN <", value, "badMbrYn");
            return (Criteria) this;
        }

        public Criteria andBadMbrYnLessThanOrEqualTo(String value) {
            addCriterion("TMCH.BAD_MBR_YN <=", value, "badMbrYn");
            return (Criteria) this;
        }

        public Criteria andBadMbrYnLike(String value) {
            addCriterion("TMCH.BAD_MBR_YN like", value, "badMbrYn");
            return (Criteria) this;
        }

        public Criteria andBadMbrYnNotLike(String value) {
            addCriterion("TMCH.BAD_MBR_YN not like", value, "badMbrYn");
            return (Criteria) this;
        }

        public Criteria andBadMbrYnIn(List<String> values) {
            addCriterion("TMCH.BAD_MBR_YN in", values, "badMbrYn");
            return (Criteria) this;
        }

        public Criteria andBadMbrYnNotIn(List<String> values) {
            addCriterion("TMCH.BAD_MBR_YN not in", values, "badMbrYn");
            return (Criteria) this;
        }

        public Criteria andBadMbrYnBetween(String value1, String value2) {
            addCriterion("TMCH.BAD_MBR_YN between", value1, value2, "badMbrYn");
            return (Criteria) this;
        }

        public Criteria andBadMbrYnNotBetween(String value1, String value2) {
            addCriterion("TMCH.BAD_MBR_YN not between", value1, value2, "badMbrYn");
            return (Criteria) this;
        }

        public Criteria andBadMbrRsnIsNull() {
            addCriterion("TMCH.BAD_MBR_RSN is null");
            return (Criteria) this;
        }

        public Criteria andBadMbrRsnIsNotNull() {
            addCriterion("TMCH.BAD_MBR_RSN is not null");
            return (Criteria) this;
        }

        public Criteria andBadMbrRsnEqualTo(String value) {
            addCriterion("TMCH.BAD_MBR_RSN =", value, "badMbrRsn");
            return (Criteria) this;
        }

        public Criteria andBadMbrRsnNotEqualTo(String value) {
            addCriterion("TMCH.BAD_MBR_RSN <>", value, "badMbrRsn");
            return (Criteria) this;
        }

        public Criteria andBadMbrRsnGreaterThan(String value) {
            addCriterion("TMCH.BAD_MBR_RSN >", value, "badMbrRsn");
            return (Criteria) this;
        }

        public Criteria andBadMbrRsnGreaterThanOrEqualTo(String value) {
            addCriterion("TMCH.BAD_MBR_RSN >=", value, "badMbrRsn");
            return (Criteria) this;
        }

        public Criteria andBadMbrRsnLessThan(String value) {
            addCriterion("TMCH.BAD_MBR_RSN <", value, "badMbrRsn");
            return (Criteria) this;
        }

        public Criteria andBadMbrRsnLessThanOrEqualTo(String value) {
            addCriterion("TMCH.BAD_MBR_RSN <=", value, "badMbrRsn");
            return (Criteria) this;
        }

        public Criteria andBadMbrRsnLike(String value) {
            addCriterion("TMCH.BAD_MBR_RSN like", value, "badMbrRsn");
            return (Criteria) this;
        }

        public Criteria andBadMbrRsnNotLike(String value) {
            addCriterion("TMCH.BAD_MBR_RSN not like", value, "badMbrRsn");
            return (Criteria) this;
        }

        public Criteria andBadMbrRsnIn(List<String> values) {
            addCriterion("TMCH.BAD_MBR_RSN in", values, "badMbrRsn");
            return (Criteria) this;
        }

        public Criteria andBadMbrRsnNotIn(List<String> values) {
            addCriterion("TMCH.BAD_MBR_RSN not in", values, "badMbrRsn");
            return (Criteria) this;
        }

        public Criteria andBadMbrRsnBetween(String value1, String value2) {
            addCriterion("TMCH.BAD_MBR_RSN between", value1, value2, "badMbrRsn");
            return (Criteria) this;
        }

        public Criteria andBadMbrRsnNotBetween(String value1, String value2) {
            addCriterion("TMCH.BAD_MBR_RSN not between", value1, value2, "badMbrRsn");
            return (Criteria) this;
        }

        public Criteria andMktRcvAgrYn1IsNull() {
            addCriterion("TMCH.MKT_RCV_AGR_YN_1 is null");
            return (Criteria) this;
        }

        public Criteria andMktRcvAgrYn1IsNotNull() {
            addCriterion("TMCH.MKT_RCV_AGR_YN_1 is not null");
            return (Criteria) this;
        }

        public Criteria andMktRcvAgrYn1EqualTo(String value) {
            addCriterion("TMCH.MKT_RCV_AGR_YN_1 =", value, "mktRcvAgrYn1");
            return (Criteria) this;
        }

        public Criteria andMktRcvAgrYn1NotEqualTo(String value) {
            addCriterion("TMCH.MKT_RCV_AGR_YN_1 <>", value, "mktRcvAgrYn1");
            return (Criteria) this;
        }

        public Criteria andMktRcvAgrYn1GreaterThan(String value) {
            addCriterion("TMCH.MKT_RCV_AGR_YN_1 >", value, "mktRcvAgrYn1");
            return (Criteria) this;
        }

        public Criteria andMktRcvAgrYn1GreaterThanOrEqualTo(String value) {
            addCriterion("TMCH.MKT_RCV_AGR_YN_1 >=", value, "mktRcvAgrYn1");
            return (Criteria) this;
        }

        public Criteria andMktRcvAgrYn1LessThan(String value) {
            addCriterion("TMCH.MKT_RCV_AGR_YN_1 <", value, "mktRcvAgrYn1");
            return (Criteria) this;
        }

        public Criteria andMktRcvAgrYn1LessThanOrEqualTo(String value) {
            addCriterion("TMCH.MKT_RCV_AGR_YN_1 <=", value, "mktRcvAgrYn1");
            return (Criteria) this;
        }

        public Criteria andMktRcvAgrYn1Like(String value) {
            addCriterion("TMCH.MKT_RCV_AGR_YN_1 like", value, "mktRcvAgrYn1");
            return (Criteria) this;
        }

        public Criteria andMktRcvAgrYn1NotLike(String value) {
            addCriterion("TMCH.MKT_RCV_AGR_YN_1 not like", value, "mktRcvAgrYn1");
            return (Criteria) this;
        }

        public Criteria andMktRcvAgrYn1In(List<String> values) {
            addCriterion("TMCH.MKT_RCV_AGR_YN_1 in", values, "mktRcvAgrYn1");
            return (Criteria) this;
        }

        public Criteria andMktRcvAgrYn1NotIn(List<String> values) {
            addCriterion("TMCH.MKT_RCV_AGR_YN_1 not in", values, "mktRcvAgrYn1");
            return (Criteria) this;
        }

        public Criteria andMktRcvAgrYn1Between(String value1, String value2) {
            addCriterion("TMCH.MKT_RCV_AGR_YN_1 between", value1, value2, "mktRcvAgrYn1");
            return (Criteria) this;
        }

        public Criteria andMktRcvAgrYn1NotBetween(String value1, String value2) {
            addCriterion("TMCH.MKT_RCV_AGR_YN_1 not between", value1, value2, "mktRcvAgrYn1");
            return (Criteria) this;
        }

        public Criteria andMktRcvAgrYn2IsNull() {
            addCriterion("TMCH.MKT_RCV_AGR_YN_2 is null");
            return (Criteria) this;
        }

        public Criteria andMktRcvAgrYn2IsNotNull() {
            addCriterion("TMCH.MKT_RCV_AGR_YN_2 is not null");
            return (Criteria) this;
        }

        public Criteria andMktRcvAgrYn2EqualTo(String value) {
            addCriterion("TMCH.MKT_RCV_AGR_YN_2 =", value, "mktRcvAgrYn2");
            return (Criteria) this;
        }

        public Criteria andMktRcvAgrYn2NotEqualTo(String value) {
            addCriterion("TMCH.MKT_RCV_AGR_YN_2 <>", value, "mktRcvAgrYn2");
            return (Criteria) this;
        }

        public Criteria andMktRcvAgrYn2GreaterThan(String value) {
            addCriterion("TMCH.MKT_RCV_AGR_YN_2 >", value, "mktRcvAgrYn2");
            return (Criteria) this;
        }

        public Criteria andMktRcvAgrYn2GreaterThanOrEqualTo(String value) {
            addCriterion("TMCH.MKT_RCV_AGR_YN_2 >=", value, "mktRcvAgrYn2");
            return (Criteria) this;
        }

        public Criteria andMktRcvAgrYn2LessThan(String value) {
            addCriterion("TMCH.MKT_RCV_AGR_YN_2 <", value, "mktRcvAgrYn2");
            return (Criteria) this;
        }

        public Criteria andMktRcvAgrYn2LessThanOrEqualTo(String value) {
            addCriterion("TMCH.MKT_RCV_AGR_YN_2 <=", value, "mktRcvAgrYn2");
            return (Criteria) this;
        }

        public Criteria andMktRcvAgrYn2Like(String value) {
            addCriterion("TMCH.MKT_RCV_AGR_YN_2 like", value, "mktRcvAgrYn2");
            return (Criteria) this;
        }

        public Criteria andMktRcvAgrYn2NotLike(String value) {
            addCriterion("TMCH.MKT_RCV_AGR_YN_2 not like", value, "mktRcvAgrYn2");
            return (Criteria) this;
        }

        public Criteria andMktRcvAgrYn2In(List<String> values) {
            addCriterion("TMCH.MKT_RCV_AGR_YN_2 in", values, "mktRcvAgrYn2");
            return (Criteria) this;
        }

        public Criteria andMktRcvAgrYn2NotIn(List<String> values) {
            addCriterion("TMCH.MKT_RCV_AGR_YN_2 not in", values, "mktRcvAgrYn2");
            return (Criteria) this;
        }

        public Criteria andMktRcvAgrYn2Between(String value1, String value2) {
            addCriterion("TMCH.MKT_RCV_AGR_YN_2 between", value1, value2, "mktRcvAgrYn2");
            return (Criteria) this;
        }

        public Criteria andMktRcvAgrYn2NotBetween(String value1, String value2) {
            addCriterion("TMCH.MKT_RCV_AGR_YN_2 not between", value1, value2, "mktRcvAgrYn2");
            return (Criteria) this;
        }

        public Criteria andRegDtIsNull() {
            addCriterion("TMCH.REG_DT is null");
            return (Criteria) this;
        }

        public Criteria andRegDtIsNotNull() {
            addCriterion("TMCH.REG_DT is not null");
            return (Criteria) this;
        }

        public Criteria andRegDtEqualTo(Date value) {
            addCriterion("TMCH.REG_DT =", value, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtNotEqualTo(Date value) {
            addCriterion("TMCH.REG_DT <>", value, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtGreaterThan(Date value) {
            addCriterion("TMCH.REG_DT >", value, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtGreaterThanOrEqualTo(Date value) {
            addCriterion("TMCH.REG_DT >=", value, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtLessThan(Date value) {
            addCriterion("TMCH.REG_DT <", value, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtLessThanOrEqualTo(Date value) {
            addCriterion("TMCH.REG_DT <=", value, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtIn(List<Date> values) {
            addCriterion("TMCH.REG_DT in", values, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtNotIn(List<Date> values) {
            addCriterion("TMCH.REG_DT not in", values, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtBetween(Date value1, Date value2) {
            addCriterion("TMCH.REG_DT between", value1, value2, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtNotBetween(Date value1, Date value2) {
            addCriterion("TMCH.REG_DT not between", value1, value2, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegIdIsNull() {
            addCriterion("TMCH.REG_ID is null");
            return (Criteria) this;
        }

        public Criteria andRegIdIsNotNull() {
            addCriterion("TMCH.REG_ID is not null");
            return (Criteria) this;
        }

        public Criteria andRegIdEqualTo(String value) {
            addCriterion("TMCH.REG_ID =", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdNotEqualTo(String value) {
            addCriterion("TMCH.REG_ID <>", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdGreaterThan(String value) {
            addCriterion("TMCH.REG_ID >", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdGreaterThanOrEqualTo(String value) {
            addCriterion("TMCH.REG_ID >=", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdLessThan(String value) {
            addCriterion("TMCH.REG_ID <", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdLessThanOrEqualTo(String value) {
            addCriterion("TMCH.REG_ID <=", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdLike(String value) {
            addCriterion("TMCH.REG_ID like", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdNotLike(String value) {
            addCriterion("TMCH.REG_ID not like", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdIn(List<String> values) {
            addCriterion("TMCH.REG_ID in", values, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdNotIn(List<String> values) {
            addCriterion("TMCH.REG_ID not in", values, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdBetween(String value1, String value2) {
            addCriterion("TMCH.REG_ID between", value1, value2, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdNotBetween(String value1, String value2) {
            addCriterion("TMCH.REG_ID not between", value1, value2, "regId");
            return (Criteria) this;
        }

        public Criteria andMbrIdLikeInsensitive(String value) {
            addCriterion("upper(TMCH.MBR_ID) like", value.toUpperCase(), "mbrId");
            return (Criteria) this;
        }

        public Criteria andMbrGrdCdLikeInsensitive(String value) {
            addCriterion("upper(TMCH.MBR_GRD_CD) like", value.toUpperCase(), "mbrGrdCd");
            return (Criteria) this;
        }

        public Criteria andMbrNmLikeInsensitive(String value) {
            addCriterion("upper(TMCH.MBR_NM) like", value.toUpperCase(), "mbrNm");
            return (Criteria) this;
        }

        public Criteria andCpNoLikeInsensitive(String value) {
            addCriterion("upper(TMCH.CP_NO) like", value.toUpperCase(), "cpNo");
            return (Criteria) this;
        }

        public Criteria andEmailLikeInsensitive(String value) {
            addCriterion("upper(TMCH.EMAIL) like", value.toUpperCase(), "email");
            return (Criteria) this;
        }

        public Criteria andBadMbrYnLikeInsensitive(String value) {
            addCriterion("upper(TMCH.BAD_MBR_YN) like", value.toUpperCase(), "badMbrYn");
            return (Criteria) this;
        }

        public Criteria andBadMbrRsnLikeInsensitive(String value) {
            addCriterion("upper(TMCH.BAD_MBR_RSN) like", value.toUpperCase(), "badMbrRsn");
            return (Criteria) this;
        }

        public Criteria andMktRcvAgrYn1LikeInsensitive(String value) {
            addCriterion("upper(TMCH.MKT_RCV_AGR_YN_1) like", value.toUpperCase(), "mktRcvAgrYn1");
            return (Criteria) this;
        }

        public Criteria andMktRcvAgrYn2LikeInsensitive(String value) {
            addCriterion("upper(TMCH.MKT_RCV_AGR_YN_2) like", value.toUpperCase(), "mktRcvAgrYn2");
            return (Criteria) this;
        }

        public Criteria andRegIdLikeInsensitive(String value) {
            addCriterion("upper(TMCH.REG_ID) like", value.toUpperCase(), "regId");
            return (Criteria) this;
        }

        public Criteria andMbrIdLikeLeft(String value) {
            addCriterion("TMCH.MBR_ID like ", "%" + value, "mbrId");
            return (Criteria) this;
        }

        public Criteria andMbrIdLikeRight(String value) {
            addCriterion("TMCH.MBR_ID like ", value + "%", "mbrId");
            return (Criteria) this;
        }

        public Criteria andMbrIdLikeBoth(String value) {
            addCriterion("TMCH.MBR_ID like ", "%" + value + "%", "mbrId");
            return (Criteria) this;
        }

        public Criteria andMbrGrdCdLikeLeft(String value) {
            addCriterion("TMCH.MBR_GRD_CD like ", "%" + value, "mbrGrdCd");
            return (Criteria) this;
        }

        public Criteria andMbrGrdCdLikeRight(String value) {
            addCriterion("TMCH.MBR_GRD_CD like ", value + "%", "mbrGrdCd");
            return (Criteria) this;
        }

        public Criteria andMbrGrdCdLikeBoth(String value) {
            addCriterion("TMCH.MBR_GRD_CD like ", "%" + value + "%", "mbrGrdCd");
            return (Criteria) this;
        }

        public Criteria andMbrNmLikeLeft(String value) {
            addCriterion("TMCH.MBR_NM like ", "%" + value, "mbrNm");
            return (Criteria) this;
        }

        public Criteria andMbrNmLikeRight(String value) {
            addCriterion("TMCH.MBR_NM like ", value + "%", "mbrNm");
            return (Criteria) this;
        }

        public Criteria andMbrNmLikeBoth(String value) {
            addCriterion("TMCH.MBR_NM like ", "%" + value + "%", "mbrNm");
            return (Criteria) this;
        }

        public Criteria andCpNoLikeLeft(String value) {
            addCriterion("TMCH.CP_NO like ", "%" + value, "cpNo");
            return (Criteria) this;
        }

        public Criteria andCpNoLikeRight(String value) {
            addCriterion("TMCH.CP_NO like ", value + "%", "cpNo");
            return (Criteria) this;
        }

        public Criteria andCpNoLikeBoth(String value) {
            addCriterion("TMCH.CP_NO like ", "%" + value + "%", "cpNo");
            return (Criteria) this;
        }

        public Criteria andEmailLikeLeft(String value) {
            addCriterion("TMCH.EMAIL like ", "%" + value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLikeRight(String value) {
            addCriterion("TMCH.EMAIL like ", value + "%", "email");
            return (Criteria) this;
        }

        public Criteria andEmailLikeBoth(String value) {
            addCriterion("TMCH.EMAIL like ", "%" + value + "%", "email");
            return (Criteria) this;
        }

        public Criteria andBadMbrYnLikeLeft(String value) {
            addCriterion("TMCH.BAD_MBR_YN like ", "%" + value, "badMbrYn");
            return (Criteria) this;
        }

        public Criteria andBadMbrYnLikeRight(String value) {
            addCriterion("TMCH.BAD_MBR_YN like ", value + "%", "badMbrYn");
            return (Criteria) this;
        }

        public Criteria andBadMbrYnLikeBoth(String value) {
            addCriterion("TMCH.BAD_MBR_YN like ", "%" + value + "%", "badMbrYn");
            return (Criteria) this;
        }

        public Criteria andBadMbrRsnLikeLeft(String value) {
            addCriterion("TMCH.BAD_MBR_RSN like ", "%" + value, "badMbrRsn");
            return (Criteria) this;
        }

        public Criteria andBadMbrRsnLikeRight(String value) {
            addCriterion("TMCH.BAD_MBR_RSN like ", value + "%", "badMbrRsn");
            return (Criteria) this;
        }

        public Criteria andBadMbrRsnLikeBoth(String value) {
            addCriterion("TMCH.BAD_MBR_RSN like ", "%" + value + "%", "badMbrRsn");
            return (Criteria) this;
        }

        public Criteria andMktRcvAgrYn1LikeLeft(String value) {
            addCriterion("TMCH.MKT_RCV_AGR_YN_1 like ", "%" + value, "mktRcvAgrYn1");
            return (Criteria) this;
        }

        public Criteria andMktRcvAgrYn1LikeRight(String value) {
            addCriterion("TMCH.MKT_RCV_AGR_YN_1 like ", value + "%", "mktRcvAgrYn1");
            return (Criteria) this;
        }

        public Criteria andMktRcvAgrYn1LikeBoth(String value) {
            addCriterion("TMCH.MKT_RCV_AGR_YN_1 like ", "%" + value + "%", "mktRcvAgrYn1");
            return (Criteria) this;
        }

        public Criteria andMktRcvAgrYn2LikeLeft(String value) {
            addCriterion("TMCH.MKT_RCV_AGR_YN_2 like ", "%" + value, "mktRcvAgrYn2");
            return (Criteria) this;
        }

        public Criteria andMktRcvAgrYn2LikeRight(String value) {
            addCriterion("TMCH.MKT_RCV_AGR_YN_2 like ", value + "%", "mktRcvAgrYn2");
            return (Criteria) this;
        }

        public Criteria andMktRcvAgrYn2LikeBoth(String value) {
            addCriterion("TMCH.MKT_RCV_AGR_YN_2 like ", "%" + value + "%", "mktRcvAgrYn2");
            return (Criteria) this;
        }

        public Criteria andRegIdLikeLeft(String value) {
            addCriterion("TMCH.REG_ID like ", "%" + value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdLikeRight(String value) {
            addCriterion("TMCH.REG_ID like ", value + "%", "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdLikeBoth(String value) {
            addCriterion("TMCH.REG_ID like ", "%" + value + "%", "regId");
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