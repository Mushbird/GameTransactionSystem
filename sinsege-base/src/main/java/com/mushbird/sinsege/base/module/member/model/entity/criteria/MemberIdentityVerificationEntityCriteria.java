package com.mushbird.sinsege.base.module.member.model.entity.criteria;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MemberIdentityVerificationEntityCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    public MemberIdentityVerificationEntityCriteria() {
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

        public Criteria andMbrIdvrfIdIsNull() {
            addCriterion("TMIV.MBR_IDVRF_ID is null");
            return (Criteria) this;
        }

        public Criteria andMbrIdvrfIdIsNotNull() {
            addCriterion("TMIV.MBR_IDVRF_ID is not null");
            return (Criteria) this;
        }

        public Criteria andMbrIdvrfIdEqualTo(Integer value) {
            addCriterion("TMIV.MBR_IDVRF_ID =", value, "mbrIdvrfId");
            return (Criteria) this;
        }

        public Criteria andMbrIdvrfIdNotEqualTo(Integer value) {
            addCriterion("TMIV.MBR_IDVRF_ID <>", value, "mbrIdvrfId");
            return (Criteria) this;
        }

        public Criteria andMbrIdvrfIdGreaterThan(Integer value) {
            addCriterion("TMIV.MBR_IDVRF_ID >", value, "mbrIdvrfId");
            return (Criteria) this;
        }

        public Criteria andMbrIdvrfIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("TMIV.MBR_IDVRF_ID >=", value, "mbrIdvrfId");
            return (Criteria) this;
        }

        public Criteria andMbrIdvrfIdLessThan(Integer value) {
            addCriterion("TMIV.MBR_IDVRF_ID <", value, "mbrIdvrfId");
            return (Criteria) this;
        }

        public Criteria andMbrIdvrfIdLessThanOrEqualTo(Integer value) {
            addCriterion("TMIV.MBR_IDVRF_ID <=", value, "mbrIdvrfId");
            return (Criteria) this;
        }

        public Criteria andMbrIdvrfIdIn(List<Integer> values) {
            addCriterion("TMIV.MBR_IDVRF_ID in", values, "mbrIdvrfId");
            return (Criteria) this;
        }

        public Criteria andMbrIdvrfIdNotIn(List<Integer> values) {
            addCriterion("TMIV.MBR_IDVRF_ID not in", values, "mbrIdvrfId");
            return (Criteria) this;
        }

        public Criteria andMbrIdvrfIdBetween(Integer value1, Integer value2) {
            addCriterion("TMIV.MBR_IDVRF_ID between", value1, value2, "mbrIdvrfId");
            return (Criteria) this;
        }

        public Criteria andMbrIdvrfIdNotBetween(Integer value1, Integer value2) {
            addCriterion("TMIV.MBR_IDVRF_ID not between", value1, value2, "mbrIdvrfId");
            return (Criteria) this;
        }

        public Criteria andMbrIdIsNull() {
            addCriterion("TMIV.MBR_ID is null");
            return (Criteria) this;
        }

        public Criteria andMbrIdIsNotNull() {
            addCriterion("TMIV.MBR_ID is not null");
            return (Criteria) this;
        }

        public Criteria andMbrIdEqualTo(String value) {
            addCriterion("TMIV.MBR_ID =", value, "mbrId");
            return (Criteria) this;
        }

        public Criteria andMbrIdNotEqualTo(String value) {
            addCriterion("TMIV.MBR_ID <>", value, "mbrId");
            return (Criteria) this;
        }

        public Criteria andMbrIdGreaterThan(String value) {
            addCriterion("TMIV.MBR_ID >", value, "mbrId");
            return (Criteria) this;
        }

        public Criteria andMbrIdGreaterThanOrEqualTo(String value) {
            addCriterion("TMIV.MBR_ID >=", value, "mbrId");
            return (Criteria) this;
        }

        public Criteria andMbrIdLessThan(String value) {
            addCriterion("TMIV.MBR_ID <", value, "mbrId");
            return (Criteria) this;
        }

        public Criteria andMbrIdLessThanOrEqualTo(String value) {
            addCriterion("TMIV.MBR_ID <=", value, "mbrId");
            return (Criteria) this;
        }

        public Criteria andMbrIdLike(String value) {
            addCriterion("TMIV.MBR_ID like", value, "mbrId");
            return (Criteria) this;
        }

        public Criteria andMbrIdNotLike(String value) {
            addCriterion("TMIV.MBR_ID not like", value, "mbrId");
            return (Criteria) this;
        }

        public Criteria andMbrIdIn(List<String> values) {
            addCriterion("TMIV.MBR_ID in", values, "mbrId");
            return (Criteria) this;
        }

        public Criteria andMbrIdNotIn(List<String> values) {
            addCriterion("TMIV.MBR_ID not in", values, "mbrId");
            return (Criteria) this;
        }

        public Criteria andMbrIdBetween(String value1, String value2) {
            addCriterion("TMIV.MBR_ID between", value1, value2, "mbrId");
            return (Criteria) this;
        }

        public Criteria andMbrIdNotBetween(String value1, String value2) {
            addCriterion("TMIV.MBR_ID not between", value1, value2, "mbrId");
            return (Criteria) this;
        }

        public Criteria andIdvrfTpCdIsNull() {
            addCriterion("TMIV.IDVRF_TP_CD is null");
            return (Criteria) this;
        }

        public Criteria andIdvrfTpCdIsNotNull() {
            addCriterion("TMIV.IDVRF_TP_CD is not null");
            return (Criteria) this;
        }

        public Criteria andIdvrfTpCdEqualTo(String value) {
            addCriterion("TMIV.IDVRF_TP_CD =", value, "idvrfTpCd");
            return (Criteria) this;
        }

        public Criteria andIdvrfTpCdNotEqualTo(String value) {
            addCriterion("TMIV.IDVRF_TP_CD <>", value, "idvrfTpCd");
            return (Criteria) this;
        }

        public Criteria andIdvrfTpCdGreaterThan(String value) {
            addCriterion("TMIV.IDVRF_TP_CD >", value, "idvrfTpCd");
            return (Criteria) this;
        }

        public Criteria andIdvrfTpCdGreaterThanOrEqualTo(String value) {
            addCriterion("TMIV.IDVRF_TP_CD >=", value, "idvrfTpCd");
            return (Criteria) this;
        }

        public Criteria andIdvrfTpCdLessThan(String value) {
            addCriterion("TMIV.IDVRF_TP_CD <", value, "idvrfTpCd");
            return (Criteria) this;
        }

        public Criteria andIdvrfTpCdLessThanOrEqualTo(String value) {
            addCriterion("TMIV.IDVRF_TP_CD <=", value, "idvrfTpCd");
            return (Criteria) this;
        }

        public Criteria andIdvrfTpCdLike(String value) {
            addCriterion("TMIV.IDVRF_TP_CD like", value, "idvrfTpCd");
            return (Criteria) this;
        }

        public Criteria andIdvrfTpCdNotLike(String value) {
            addCriterion("TMIV.IDVRF_TP_CD not like", value, "idvrfTpCd");
            return (Criteria) this;
        }

        public Criteria andIdvrfTpCdIn(List<String> values) {
            addCriterion("TMIV.IDVRF_TP_CD in", values, "idvrfTpCd");
            return (Criteria) this;
        }

        public Criteria andIdvrfTpCdNotIn(List<String> values) {
            addCriterion("TMIV.IDVRF_TP_CD not in", values, "idvrfTpCd");
            return (Criteria) this;
        }

        public Criteria andIdvrfTpCdBetween(String value1, String value2) {
            addCriterion("TMIV.IDVRF_TP_CD between", value1, value2, "idvrfTpCd");
            return (Criteria) this;
        }

        public Criteria andIdvrfTpCdNotBetween(String value1, String value2) {
            addCriterion("TMIV.IDVRF_TP_CD not between", value1, value2, "idvrfTpCd");
            return (Criteria) this;
        }

        public Criteria andLnmNmIsNull() {
            addCriterion("TMIV.LNM_NM is null");
            return (Criteria) this;
        }

        public Criteria andLnmNmIsNotNull() {
            addCriterion("TMIV.LNM_NM is not null");
            return (Criteria) this;
        }

        public Criteria andLnmNmEqualTo(String value) {
            addCriterion("TMIV.LNM_NM =", value, "lnmNm");
            return (Criteria) this;
        }

        public Criteria andLnmNmNotEqualTo(String value) {
            addCriterion("TMIV.LNM_NM <>", value, "lnmNm");
            return (Criteria) this;
        }

        public Criteria andLnmNmGreaterThan(String value) {
            addCriterion("TMIV.LNM_NM >", value, "lnmNm");
            return (Criteria) this;
        }

        public Criteria andLnmNmGreaterThanOrEqualTo(String value) {
            addCriterion("TMIV.LNM_NM >=", value, "lnmNm");
            return (Criteria) this;
        }

        public Criteria andLnmNmLessThan(String value) {
            addCriterion("TMIV.LNM_NM <", value, "lnmNm");
            return (Criteria) this;
        }

        public Criteria andLnmNmLessThanOrEqualTo(String value) {
            addCriterion("TMIV.LNM_NM <=", value, "lnmNm");
            return (Criteria) this;
        }

        public Criteria andLnmNmLike(String value) {
            addCriterion("TMIV.LNM_NM like", value, "lnmNm");
            return (Criteria) this;
        }

        public Criteria andLnmNmNotLike(String value) {
            addCriterion("TMIV.LNM_NM not like", value, "lnmNm");
            return (Criteria) this;
        }

        public Criteria andLnmNmIn(List<String> values) {
            addCriterion("TMIV.LNM_NM in", values, "lnmNm");
            return (Criteria) this;
        }

        public Criteria andLnmNmNotIn(List<String> values) {
            addCriterion("TMIV.LNM_NM not in", values, "lnmNm");
            return (Criteria) this;
        }

        public Criteria andLnmNmBetween(String value1, String value2) {
            addCriterion("TMIV.LNM_NM between", value1, value2, "lnmNm");
            return (Criteria) this;
        }

        public Criteria andLnmNmNotBetween(String value1, String value2) {
            addCriterion("TMIV.LNM_NM not between", value1, value2, "lnmNm");
            return (Criteria) this;
        }

        public Criteria andBrthYmdIsNull() {
            addCriterion("TMIV.BRTH_YMD is null");
            return (Criteria) this;
        }

        public Criteria andBrthYmdIsNotNull() {
            addCriterion("TMIV.BRTH_YMD is not null");
            return (Criteria) this;
        }

        public Criteria andBrthYmdEqualTo(String value) {
            addCriterion("TMIV.BRTH_YMD =", value, "brthYmd");
            return (Criteria) this;
        }

        public Criteria andBrthYmdNotEqualTo(String value) {
            addCriterion("TMIV.BRTH_YMD <>", value, "brthYmd");
            return (Criteria) this;
        }

        public Criteria andBrthYmdGreaterThan(String value) {
            addCriterion("TMIV.BRTH_YMD >", value, "brthYmd");
            return (Criteria) this;
        }

        public Criteria andBrthYmdGreaterThanOrEqualTo(String value) {
            addCriterion("TMIV.BRTH_YMD >=", value, "brthYmd");
            return (Criteria) this;
        }

        public Criteria andBrthYmdLessThan(String value) {
            addCriterion("TMIV.BRTH_YMD <", value, "brthYmd");
            return (Criteria) this;
        }

        public Criteria andBrthYmdLessThanOrEqualTo(String value) {
            addCriterion("TMIV.BRTH_YMD <=", value, "brthYmd");
            return (Criteria) this;
        }

        public Criteria andBrthYmdLike(String value) {
            addCriterion("TMIV.BRTH_YMD like", value, "brthYmd");
            return (Criteria) this;
        }

        public Criteria andBrthYmdNotLike(String value) {
            addCriterion("TMIV.BRTH_YMD not like", value, "brthYmd");
            return (Criteria) this;
        }

        public Criteria andBrthYmdIn(List<String> values) {
            addCriterion("TMIV.BRTH_YMD in", values, "brthYmd");
            return (Criteria) this;
        }

        public Criteria andBrthYmdNotIn(List<String> values) {
            addCriterion("TMIV.BRTH_YMD not in", values, "brthYmd");
            return (Criteria) this;
        }

        public Criteria andBrthYmdBetween(String value1, String value2) {
            addCriterion("TMIV.BRTH_YMD between", value1, value2, "brthYmd");
            return (Criteria) this;
        }

        public Criteria andBrthYmdNotBetween(String value1, String value2) {
            addCriterion("TMIV.BRTH_YMD not between", value1, value2, "brthYmd");
            return (Criteria) this;
        }

        public Criteria andGndrClIsNull() {
            addCriterion("TMIV.GNDR_CL is null");
            return (Criteria) this;
        }

        public Criteria andGndrClIsNotNull() {
            addCriterion("TMIV.GNDR_CL is not null");
            return (Criteria) this;
        }

        public Criteria andGndrClEqualTo(String value) {
            addCriterion("TMIV.GNDR_CL =", value, "gndrCl");
            return (Criteria) this;
        }

        public Criteria andGndrClNotEqualTo(String value) {
            addCriterion("TMIV.GNDR_CL <>", value, "gndrCl");
            return (Criteria) this;
        }

        public Criteria andGndrClGreaterThan(String value) {
            addCriterion("TMIV.GNDR_CL >", value, "gndrCl");
            return (Criteria) this;
        }

        public Criteria andGndrClGreaterThanOrEqualTo(String value) {
            addCriterion("TMIV.GNDR_CL >=", value, "gndrCl");
            return (Criteria) this;
        }

        public Criteria andGndrClLessThan(String value) {
            addCriterion("TMIV.GNDR_CL <", value, "gndrCl");
            return (Criteria) this;
        }

        public Criteria andGndrClLessThanOrEqualTo(String value) {
            addCriterion("TMIV.GNDR_CL <=", value, "gndrCl");
            return (Criteria) this;
        }

        public Criteria andGndrClLike(String value) {
            addCriterion("TMIV.GNDR_CL like", value, "gndrCl");
            return (Criteria) this;
        }

        public Criteria andGndrClNotLike(String value) {
            addCriterion("TMIV.GNDR_CL not like", value, "gndrCl");
            return (Criteria) this;
        }

        public Criteria andGndrClIn(List<String> values) {
            addCriterion("TMIV.GNDR_CL in", values, "gndrCl");
            return (Criteria) this;
        }

        public Criteria andGndrClNotIn(List<String> values) {
            addCriterion("TMIV.GNDR_CL not in", values, "gndrCl");
            return (Criteria) this;
        }

        public Criteria andGndrClBetween(String value1, String value2) {
            addCriterion("TMIV.GNDR_CL between", value1, value2, "gndrCl");
            return (Criteria) this;
        }

        public Criteria andGndrClNotBetween(String value1, String value2) {
            addCriterion("TMIV.GNDR_CL not between", value1, value2, "gndrCl");
            return (Criteria) this;
        }

        public Criteria andLfrnrClIsNull() {
            addCriterion("TMIV.LFRNR_CL is null");
            return (Criteria) this;
        }

        public Criteria andLfrnrClIsNotNull() {
            addCriterion("TMIV.LFRNR_CL is not null");
            return (Criteria) this;
        }

        public Criteria andLfrnrClEqualTo(String value) {
            addCriterion("TMIV.LFRNR_CL =", value, "lfrnrCl");
            return (Criteria) this;
        }

        public Criteria andLfrnrClNotEqualTo(String value) {
            addCriterion("TMIV.LFRNR_CL <>", value, "lfrnrCl");
            return (Criteria) this;
        }

        public Criteria andLfrnrClGreaterThan(String value) {
            addCriterion("TMIV.LFRNR_CL >", value, "lfrnrCl");
            return (Criteria) this;
        }

        public Criteria andLfrnrClGreaterThanOrEqualTo(String value) {
            addCriterion("TMIV.LFRNR_CL >=", value, "lfrnrCl");
            return (Criteria) this;
        }

        public Criteria andLfrnrClLessThan(String value) {
            addCriterion("TMIV.LFRNR_CL <", value, "lfrnrCl");
            return (Criteria) this;
        }

        public Criteria andLfrnrClLessThanOrEqualTo(String value) {
            addCriterion("TMIV.LFRNR_CL <=", value, "lfrnrCl");
            return (Criteria) this;
        }

        public Criteria andLfrnrClLike(String value) {
            addCriterion("TMIV.LFRNR_CL like", value, "lfrnrCl");
            return (Criteria) this;
        }

        public Criteria andLfrnrClNotLike(String value) {
            addCriterion("TMIV.LFRNR_CL not like", value, "lfrnrCl");
            return (Criteria) this;
        }

        public Criteria andLfrnrClIn(List<String> values) {
            addCriterion("TMIV.LFRNR_CL in", values, "lfrnrCl");
            return (Criteria) this;
        }

        public Criteria andLfrnrClNotIn(List<String> values) {
            addCriterion("TMIV.LFRNR_CL not in", values, "lfrnrCl");
            return (Criteria) this;
        }

        public Criteria andLfrnrClBetween(String value1, String value2) {
            addCriterion("TMIV.LFRNR_CL between", value1, value2, "lfrnrCl");
            return (Criteria) this;
        }

        public Criteria andLfrnrClNotBetween(String value1, String value2) {
            addCriterion("TMIV.LFRNR_CL not between", value1, value2, "lfrnrCl");
            return (Criteria) this;
        }

        public Criteria andReqNoIsNull() {
            addCriterion("TMIV.REQ_NO is null");
            return (Criteria) this;
        }

        public Criteria andReqNoIsNotNull() {
            addCriterion("TMIV.REQ_NO is not null");
            return (Criteria) this;
        }

        public Criteria andReqNoEqualTo(String value) {
            addCriterion("TMIV.REQ_NO =", value, "reqNo");
            return (Criteria) this;
        }

        public Criteria andReqNoNotEqualTo(String value) {
            addCriterion("TMIV.REQ_NO <>", value, "reqNo");
            return (Criteria) this;
        }

        public Criteria andReqNoGreaterThan(String value) {
            addCriterion("TMIV.REQ_NO >", value, "reqNo");
            return (Criteria) this;
        }

        public Criteria andReqNoGreaterThanOrEqualTo(String value) {
            addCriterion("TMIV.REQ_NO >=", value, "reqNo");
            return (Criteria) this;
        }

        public Criteria andReqNoLessThan(String value) {
            addCriterion("TMIV.REQ_NO <", value, "reqNo");
            return (Criteria) this;
        }

        public Criteria andReqNoLessThanOrEqualTo(String value) {
            addCriterion("TMIV.REQ_NO <=", value, "reqNo");
            return (Criteria) this;
        }

        public Criteria andReqNoLike(String value) {
            addCriterion("TMIV.REQ_NO like", value, "reqNo");
            return (Criteria) this;
        }

        public Criteria andReqNoNotLike(String value) {
            addCriterion("TMIV.REQ_NO not like", value, "reqNo");
            return (Criteria) this;
        }

        public Criteria andReqNoIn(List<String> values) {
            addCriterion("TMIV.REQ_NO in", values, "reqNo");
            return (Criteria) this;
        }

        public Criteria andReqNoNotIn(List<String> values) {
            addCriterion("TMIV.REQ_NO not in", values, "reqNo");
            return (Criteria) this;
        }

        public Criteria andReqNoBetween(String value1, String value2) {
            addCriterion("TMIV.REQ_NO between", value1, value2, "reqNo");
            return (Criteria) this;
        }

        public Criteria andReqNoNotBetween(String value1, String value2) {
            addCriterion("TMIV.REQ_NO not between", value1, value2, "reqNo");
            return (Criteria) this;
        }

        public Criteria andCpCarrIsNull() {
            addCriterion("TMIV.CP_CARR is null");
            return (Criteria) this;
        }

        public Criteria andCpCarrIsNotNull() {
            addCriterion("TMIV.CP_CARR is not null");
            return (Criteria) this;
        }

        public Criteria andCpCarrEqualTo(String value) {
            addCriterion("TMIV.CP_CARR =", value, "cpCarr");
            return (Criteria) this;
        }

        public Criteria andCpCarrNotEqualTo(String value) {
            addCriterion("TMIV.CP_CARR <>", value, "cpCarr");
            return (Criteria) this;
        }

        public Criteria andCpCarrGreaterThan(String value) {
            addCriterion("TMIV.CP_CARR >", value, "cpCarr");
            return (Criteria) this;
        }

        public Criteria andCpCarrGreaterThanOrEqualTo(String value) {
            addCriterion("TMIV.CP_CARR >=", value, "cpCarr");
            return (Criteria) this;
        }

        public Criteria andCpCarrLessThan(String value) {
            addCriterion("TMIV.CP_CARR <", value, "cpCarr");
            return (Criteria) this;
        }

        public Criteria andCpCarrLessThanOrEqualTo(String value) {
            addCriterion("TMIV.CP_CARR <=", value, "cpCarr");
            return (Criteria) this;
        }

        public Criteria andCpCarrLike(String value) {
            addCriterion("TMIV.CP_CARR like", value, "cpCarr");
            return (Criteria) this;
        }

        public Criteria andCpCarrNotLike(String value) {
            addCriterion("TMIV.CP_CARR not like", value, "cpCarr");
            return (Criteria) this;
        }

        public Criteria andCpCarrIn(List<String> values) {
            addCriterion("TMIV.CP_CARR in", values, "cpCarr");
            return (Criteria) this;
        }

        public Criteria andCpCarrNotIn(List<String> values) {
            addCriterion("TMIV.CP_CARR not in", values, "cpCarr");
            return (Criteria) this;
        }

        public Criteria andCpCarrBetween(String value1, String value2) {
            addCriterion("TMIV.CP_CARR between", value1, value2, "cpCarr");
            return (Criteria) this;
        }

        public Criteria andCpCarrNotBetween(String value1, String value2) {
            addCriterion("TMIV.CP_CARR not between", value1, value2, "cpCarr");
            return (Criteria) this;
        }

        public Criteria andCpNoIsNull() {
            addCriterion("TMIV.CP_NO is null");
            return (Criteria) this;
        }

        public Criteria andCpNoIsNotNull() {
            addCriterion("TMIV.CP_NO is not null");
            return (Criteria) this;
        }

        public Criteria andCpNoEqualTo(String value) {
            addCriterion("TMIV.CP_NO =", value, "cpNo");
            return (Criteria) this;
        }

        public Criteria andCpNoNotEqualTo(String value) {
            addCriterion("TMIV.CP_NO <>", value, "cpNo");
            return (Criteria) this;
        }

        public Criteria andCpNoGreaterThan(String value) {
            addCriterion("TMIV.CP_NO >", value, "cpNo");
            return (Criteria) this;
        }

        public Criteria andCpNoGreaterThanOrEqualTo(String value) {
            addCriterion("TMIV.CP_NO >=", value, "cpNo");
            return (Criteria) this;
        }

        public Criteria andCpNoLessThan(String value) {
            addCriterion("TMIV.CP_NO <", value, "cpNo");
            return (Criteria) this;
        }

        public Criteria andCpNoLessThanOrEqualTo(String value) {
            addCriterion("TMIV.CP_NO <=", value, "cpNo");
            return (Criteria) this;
        }

        public Criteria andCpNoLike(String value) {
            addCriterion("TMIV.CP_NO like", value, "cpNo");
            return (Criteria) this;
        }

        public Criteria andCpNoNotLike(String value) {
            addCriterion("TMIV.CP_NO not like", value, "cpNo");
            return (Criteria) this;
        }

        public Criteria andCpNoIn(List<String> values) {
            addCriterion("TMIV.CP_NO in", values, "cpNo");
            return (Criteria) this;
        }

        public Criteria andCpNoNotIn(List<String> values) {
            addCriterion("TMIV.CP_NO not in", values, "cpNo");
            return (Criteria) this;
        }

        public Criteria andCpNoBetween(String value1, String value2) {
            addCriterion("TMIV.CP_NO between", value1, value2, "cpNo");
            return (Criteria) this;
        }

        public Criteria andCpNoNotBetween(String value1, String value2) {
            addCriterion("TMIV.CP_NO not between", value1, value2, "cpNo");
            return (Criteria) this;
        }

        public Criteria andAuthDtIsNull() {
            addCriterion("TMIV.AUTH_DT is null");
            return (Criteria) this;
        }

        public Criteria andAuthDtIsNotNull() {
            addCriterion("TMIV.AUTH_DT is not null");
            return (Criteria) this;
        }

        public Criteria andAuthDtEqualTo(Date value) {
            addCriterion("TMIV.AUTH_DT =", value, "authDt");
            return (Criteria) this;
        }

        public Criteria andAuthDtNotEqualTo(Date value) {
            addCriterion("TMIV.AUTH_DT <>", value, "authDt");
            return (Criteria) this;
        }

        public Criteria andAuthDtGreaterThan(Date value) {
            addCriterion("TMIV.AUTH_DT >", value, "authDt");
            return (Criteria) this;
        }

        public Criteria andAuthDtGreaterThanOrEqualTo(Date value) {
            addCriterion("TMIV.AUTH_DT >=", value, "authDt");
            return (Criteria) this;
        }

        public Criteria andAuthDtLessThan(Date value) {
            addCriterion("TMIV.AUTH_DT <", value, "authDt");
            return (Criteria) this;
        }

        public Criteria andAuthDtLessThanOrEqualTo(Date value) {
            addCriterion("TMIV.AUTH_DT <=", value, "authDt");
            return (Criteria) this;
        }

        public Criteria andAuthDtIn(List<Date> values) {
            addCriterion("TMIV.AUTH_DT in", values, "authDt");
            return (Criteria) this;
        }

        public Criteria andAuthDtNotIn(List<Date> values) {
            addCriterion("TMIV.AUTH_DT not in", values, "authDt");
            return (Criteria) this;
        }

        public Criteria andAuthDtBetween(Date value1, Date value2) {
            addCriterion("TMIV.AUTH_DT between", value1, value2, "authDt");
            return (Criteria) this;
        }

        public Criteria andAuthDtNotBetween(Date value1, Date value2) {
            addCriterion("TMIV.AUTH_DT not between", value1, value2, "authDt");
            return (Criteria) this;
        }

        public Criteria andCiValIsNull() {
            addCriterion("TMIV.CI_VAL is null");
            return (Criteria) this;
        }

        public Criteria andCiValIsNotNull() {
            addCriterion("TMIV.CI_VAL is not null");
            return (Criteria) this;
        }

        public Criteria andCiValEqualTo(String value) {
            addCriterion("TMIV.CI_VAL =", value, "ciVal");
            return (Criteria) this;
        }

        public Criteria andCiValNotEqualTo(String value) {
            addCriterion("TMIV.CI_VAL <>", value, "ciVal");
            return (Criteria) this;
        }

        public Criteria andCiValGreaterThan(String value) {
            addCriterion("TMIV.CI_VAL >", value, "ciVal");
            return (Criteria) this;
        }

        public Criteria andCiValGreaterThanOrEqualTo(String value) {
            addCriterion("TMIV.CI_VAL >=", value, "ciVal");
            return (Criteria) this;
        }

        public Criteria andCiValLessThan(String value) {
            addCriterion("TMIV.CI_VAL <", value, "ciVal");
            return (Criteria) this;
        }

        public Criteria andCiValLessThanOrEqualTo(String value) {
            addCriterion("TMIV.CI_VAL <=", value, "ciVal");
            return (Criteria) this;
        }

        public Criteria andCiValLike(String value) {
            addCriterion("TMIV.CI_VAL like", value, "ciVal");
            return (Criteria) this;
        }

        public Criteria andCiValNotLike(String value) {
            addCriterion("TMIV.CI_VAL not like", value, "ciVal");
            return (Criteria) this;
        }

        public Criteria andCiValIn(List<String> values) {
            addCriterion("TMIV.CI_VAL in", values, "ciVal");
            return (Criteria) this;
        }

        public Criteria andCiValNotIn(List<String> values) {
            addCriterion("TMIV.CI_VAL not in", values, "ciVal");
            return (Criteria) this;
        }

        public Criteria andCiValBetween(String value1, String value2) {
            addCriterion("TMIV.CI_VAL between", value1, value2, "ciVal");
            return (Criteria) this;
        }

        public Criteria andCiValNotBetween(String value1, String value2) {
            addCriterion("TMIV.CI_VAL not between", value1, value2, "ciVal");
            return (Criteria) this;
        }

        public Criteria andDiValIsNull() {
            addCriterion("TMIV.DI_VAL is null");
            return (Criteria) this;
        }

        public Criteria andDiValIsNotNull() {
            addCriterion("TMIV.DI_VAL is not null");
            return (Criteria) this;
        }

        public Criteria andDiValEqualTo(String value) {
            addCriterion("TMIV.DI_VAL =", value, "diVal");
            return (Criteria) this;
        }

        public Criteria andDiValNotEqualTo(String value) {
            addCriterion("TMIV.DI_VAL <>", value, "diVal");
            return (Criteria) this;
        }

        public Criteria andDiValGreaterThan(String value) {
            addCriterion("TMIV.DI_VAL >", value, "diVal");
            return (Criteria) this;
        }

        public Criteria andDiValGreaterThanOrEqualTo(String value) {
            addCriterion("TMIV.DI_VAL >=", value, "diVal");
            return (Criteria) this;
        }

        public Criteria andDiValLessThan(String value) {
            addCriterion("TMIV.DI_VAL <", value, "diVal");
            return (Criteria) this;
        }

        public Criteria andDiValLessThanOrEqualTo(String value) {
            addCriterion("TMIV.DI_VAL <=", value, "diVal");
            return (Criteria) this;
        }

        public Criteria andDiValLike(String value) {
            addCriterion("TMIV.DI_VAL like", value, "diVal");
            return (Criteria) this;
        }

        public Criteria andDiValNotLike(String value) {
            addCriterion("TMIV.DI_VAL not like", value, "diVal");
            return (Criteria) this;
        }

        public Criteria andDiValIn(List<String> values) {
            addCriterion("TMIV.DI_VAL in", values, "diVal");
            return (Criteria) this;
        }

        public Criteria andDiValNotIn(List<String> values) {
            addCriterion("TMIV.DI_VAL not in", values, "diVal");
            return (Criteria) this;
        }

        public Criteria andDiValBetween(String value1, String value2) {
            addCriterion("TMIV.DI_VAL between", value1, value2, "diVal");
            return (Criteria) this;
        }

        public Criteria andDiValNotBetween(String value1, String value2) {
            addCriterion("TMIV.DI_VAL not between", value1, value2, "diVal");
            return (Criteria) this;
        }

        public Criteria andRsltCdValIsNull() {
            addCriterion("TMIV.RSLT_CD_VAL is null");
            return (Criteria) this;
        }

        public Criteria andRsltCdValIsNotNull() {
            addCriterion("TMIV.RSLT_CD_VAL is not null");
            return (Criteria) this;
        }

        public Criteria andRsltCdValEqualTo(String value) {
            addCriterion("TMIV.RSLT_CD_VAL =", value, "rsltCdVal");
            return (Criteria) this;
        }

        public Criteria andRsltCdValNotEqualTo(String value) {
            addCriterion("TMIV.RSLT_CD_VAL <>", value, "rsltCdVal");
            return (Criteria) this;
        }

        public Criteria andRsltCdValGreaterThan(String value) {
            addCriterion("TMIV.RSLT_CD_VAL >", value, "rsltCdVal");
            return (Criteria) this;
        }

        public Criteria andRsltCdValGreaterThanOrEqualTo(String value) {
            addCriterion("TMIV.RSLT_CD_VAL >=", value, "rsltCdVal");
            return (Criteria) this;
        }

        public Criteria andRsltCdValLessThan(String value) {
            addCriterion("TMIV.RSLT_CD_VAL <", value, "rsltCdVal");
            return (Criteria) this;
        }

        public Criteria andRsltCdValLessThanOrEqualTo(String value) {
            addCriterion("TMIV.RSLT_CD_VAL <=", value, "rsltCdVal");
            return (Criteria) this;
        }

        public Criteria andRsltCdValLike(String value) {
            addCriterion("TMIV.RSLT_CD_VAL like", value, "rsltCdVal");
            return (Criteria) this;
        }

        public Criteria andRsltCdValNotLike(String value) {
            addCriterion("TMIV.RSLT_CD_VAL not like", value, "rsltCdVal");
            return (Criteria) this;
        }

        public Criteria andRsltCdValIn(List<String> values) {
            addCriterion("TMIV.RSLT_CD_VAL in", values, "rsltCdVal");
            return (Criteria) this;
        }

        public Criteria andRsltCdValNotIn(List<String> values) {
            addCriterion("TMIV.RSLT_CD_VAL not in", values, "rsltCdVal");
            return (Criteria) this;
        }

        public Criteria andRsltCdValBetween(String value1, String value2) {
            addCriterion("TMIV.RSLT_CD_VAL between", value1, value2, "rsltCdVal");
            return (Criteria) this;
        }

        public Criteria andRsltCdValNotBetween(String value1, String value2) {
            addCriterion("TMIV.RSLT_CD_VAL not between", value1, value2, "rsltCdVal");
            return (Criteria) this;
        }

        public Criteria andRsltMsgIsNull() {
            addCriterion("TMIV.RSLT_MSG is null");
            return (Criteria) this;
        }

        public Criteria andRsltMsgIsNotNull() {
            addCriterion("TMIV.RSLT_MSG is not null");
            return (Criteria) this;
        }

        public Criteria andRsltMsgEqualTo(String value) {
            addCriterion("TMIV.RSLT_MSG =", value, "rsltMsg");
            return (Criteria) this;
        }

        public Criteria andRsltMsgNotEqualTo(String value) {
            addCriterion("TMIV.RSLT_MSG <>", value, "rsltMsg");
            return (Criteria) this;
        }

        public Criteria andRsltMsgGreaterThan(String value) {
            addCriterion("TMIV.RSLT_MSG >", value, "rsltMsg");
            return (Criteria) this;
        }

        public Criteria andRsltMsgGreaterThanOrEqualTo(String value) {
            addCriterion("TMIV.RSLT_MSG >=", value, "rsltMsg");
            return (Criteria) this;
        }

        public Criteria andRsltMsgLessThan(String value) {
            addCriterion("TMIV.RSLT_MSG <", value, "rsltMsg");
            return (Criteria) this;
        }

        public Criteria andRsltMsgLessThanOrEqualTo(String value) {
            addCriterion("TMIV.RSLT_MSG <=", value, "rsltMsg");
            return (Criteria) this;
        }

        public Criteria andRsltMsgLike(String value) {
            addCriterion("TMIV.RSLT_MSG like", value, "rsltMsg");
            return (Criteria) this;
        }

        public Criteria andRsltMsgNotLike(String value) {
            addCriterion("TMIV.RSLT_MSG not like", value, "rsltMsg");
            return (Criteria) this;
        }

        public Criteria andRsltMsgIn(List<String> values) {
            addCriterion("TMIV.RSLT_MSG in", values, "rsltMsg");
            return (Criteria) this;
        }

        public Criteria andRsltMsgNotIn(List<String> values) {
            addCriterion("TMIV.RSLT_MSG not in", values, "rsltMsg");
            return (Criteria) this;
        }

        public Criteria andRsltMsgBetween(String value1, String value2) {
            addCriterion("TMIV.RSLT_MSG between", value1, value2, "rsltMsg");
            return (Criteria) this;
        }

        public Criteria andRsltMsgNotBetween(String value1, String value2) {
            addCriterion("TMIV.RSLT_MSG not between", value1, value2, "rsltMsg");
            return (Criteria) this;
        }

        public Criteria andAddVarIsNull() {
            addCriterion("TMIV.ADD_VAR is null");
            return (Criteria) this;
        }

        public Criteria andAddVarIsNotNull() {
            addCriterion("TMIV.ADD_VAR is not null");
            return (Criteria) this;
        }

        public Criteria andAddVarEqualTo(String value) {
            addCriterion("TMIV.ADD_VAR =", value, "addVar");
            return (Criteria) this;
        }

        public Criteria andAddVarNotEqualTo(String value) {
            addCriterion("TMIV.ADD_VAR <>", value, "addVar");
            return (Criteria) this;
        }

        public Criteria andAddVarGreaterThan(String value) {
            addCriterion("TMIV.ADD_VAR >", value, "addVar");
            return (Criteria) this;
        }

        public Criteria andAddVarGreaterThanOrEqualTo(String value) {
            addCriterion("TMIV.ADD_VAR >=", value, "addVar");
            return (Criteria) this;
        }

        public Criteria andAddVarLessThan(String value) {
            addCriterion("TMIV.ADD_VAR <", value, "addVar");
            return (Criteria) this;
        }

        public Criteria andAddVarLessThanOrEqualTo(String value) {
            addCriterion("TMIV.ADD_VAR <=", value, "addVar");
            return (Criteria) this;
        }

        public Criteria andAddVarLike(String value) {
            addCriterion("TMIV.ADD_VAR like", value, "addVar");
            return (Criteria) this;
        }

        public Criteria andAddVarNotLike(String value) {
            addCriterion("TMIV.ADD_VAR not like", value, "addVar");
            return (Criteria) this;
        }

        public Criteria andAddVarIn(List<String> values) {
            addCriterion("TMIV.ADD_VAR in", values, "addVar");
            return (Criteria) this;
        }

        public Criteria andAddVarNotIn(List<String> values) {
            addCriterion("TMIV.ADD_VAR not in", values, "addVar");
            return (Criteria) this;
        }

        public Criteria andAddVarBetween(String value1, String value2) {
            addCriterion("TMIV.ADD_VAR between", value1, value2, "addVar");
            return (Criteria) this;
        }

        public Criteria andAddVarNotBetween(String value1, String value2) {
            addCriterion("TMIV.ADD_VAR not between", value1, value2, "addVar");
            return (Criteria) this;
        }

        public Criteria andRegDtIsNull() {
            addCriterion("TMIV.REG_DT is null");
            return (Criteria) this;
        }

        public Criteria andRegDtIsNotNull() {
            addCriterion("TMIV.REG_DT is not null");
            return (Criteria) this;
        }

        public Criteria andRegDtEqualTo(Date value) {
            addCriterion("TMIV.REG_DT =", value, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtNotEqualTo(Date value) {
            addCriterion("TMIV.REG_DT <>", value, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtGreaterThan(Date value) {
            addCriterion("TMIV.REG_DT >", value, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtGreaterThanOrEqualTo(Date value) {
            addCriterion("TMIV.REG_DT >=", value, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtLessThan(Date value) {
            addCriterion("TMIV.REG_DT <", value, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtLessThanOrEqualTo(Date value) {
            addCriterion("TMIV.REG_DT <=", value, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtIn(List<Date> values) {
            addCriterion("TMIV.REG_DT in", values, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtNotIn(List<Date> values) {
            addCriterion("TMIV.REG_DT not in", values, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtBetween(Date value1, Date value2) {
            addCriterion("TMIV.REG_DT between", value1, value2, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtNotBetween(Date value1, Date value2) {
            addCriterion("TMIV.REG_DT not between", value1, value2, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegIdIsNull() {
            addCriterion("TMIV.REG_ID is null");
            return (Criteria) this;
        }

        public Criteria andRegIdIsNotNull() {
            addCriterion("TMIV.REG_ID is not null");
            return (Criteria) this;
        }

        public Criteria andRegIdEqualTo(String value) {
            addCriterion("TMIV.REG_ID =", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdNotEqualTo(String value) {
            addCriterion("TMIV.REG_ID <>", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdGreaterThan(String value) {
            addCriterion("TMIV.REG_ID >", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdGreaterThanOrEqualTo(String value) {
            addCriterion("TMIV.REG_ID >=", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdLessThan(String value) {
            addCriterion("TMIV.REG_ID <", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdLessThanOrEqualTo(String value) {
            addCriterion("TMIV.REG_ID <=", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdLike(String value) {
            addCriterion("TMIV.REG_ID like", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdNotLike(String value) {
            addCriterion("TMIV.REG_ID not like", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdIn(List<String> values) {
            addCriterion("TMIV.REG_ID in", values, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdNotIn(List<String> values) {
            addCriterion("TMIV.REG_ID not in", values, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdBetween(String value1, String value2) {
            addCriterion("TMIV.REG_ID between", value1, value2, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdNotBetween(String value1, String value2) {
            addCriterion("TMIV.REG_ID not between", value1, value2, "regId");
            return (Criteria) this;
        }

        public Criteria andMbrIdLikeInsensitive(String value) {
            addCriterion("upper(TMIV.MBR_ID) like", value.toUpperCase(), "mbrId");
            return (Criteria) this;
        }

        public Criteria andIdvrfTpCdLikeInsensitive(String value) {
            addCriterion("upper(TMIV.IDVRF_TP_CD) like", value.toUpperCase(), "idvrfTpCd");
            return (Criteria) this;
        }

        public Criteria andLnmNmLikeInsensitive(String value) {
            addCriterion("upper(TMIV.LNM_NM) like", value.toUpperCase(), "lnmNm");
            return (Criteria) this;
        }

        public Criteria andBrthYmdLikeInsensitive(String value) {
            addCriterion("upper(TMIV.BRTH_YMD) like", value.toUpperCase(), "brthYmd");
            return (Criteria) this;
        }

        public Criteria andGndrClLikeInsensitive(String value) {
            addCriterion("upper(TMIV.GNDR_CL) like", value.toUpperCase(), "gndrCl");
            return (Criteria) this;
        }

        public Criteria andLfrnrClLikeInsensitive(String value) {
            addCriterion("upper(TMIV.LFRNR_CL) like", value.toUpperCase(), "lfrnrCl");
            return (Criteria) this;
        }

        public Criteria andReqNoLikeInsensitive(String value) {
            addCriterion("upper(TMIV.REQ_NO) like", value.toUpperCase(), "reqNo");
            return (Criteria) this;
        }

        public Criteria andCpCarrLikeInsensitive(String value) {
            addCriterion("upper(TMIV.CP_CARR) like", value.toUpperCase(), "cpCarr");
            return (Criteria) this;
        }

        public Criteria andCpNoLikeInsensitive(String value) {
            addCriterion("upper(TMIV.CP_NO) like", value.toUpperCase(), "cpNo");
            return (Criteria) this;
        }

        public Criteria andCiValLikeInsensitive(String value) {
            addCriterion("upper(TMIV.CI_VAL) like", value.toUpperCase(), "ciVal");
            return (Criteria) this;
        }

        public Criteria andDiValLikeInsensitive(String value) {
            addCriterion("upper(TMIV.DI_VAL) like", value.toUpperCase(), "diVal");
            return (Criteria) this;
        }

        public Criteria andRsltCdValLikeInsensitive(String value) {
            addCriterion("upper(TMIV.RSLT_CD_VAL) like", value.toUpperCase(), "rsltCdVal");
            return (Criteria) this;
        }

        public Criteria andRsltMsgLikeInsensitive(String value) {
            addCriterion("upper(TMIV.RSLT_MSG) like", value.toUpperCase(), "rsltMsg");
            return (Criteria) this;
        }

        public Criteria andAddVarLikeInsensitive(String value) {
            addCriterion("upper(TMIV.ADD_VAR) like", value.toUpperCase(), "addVar");
            return (Criteria) this;
        }

        public Criteria andRegIdLikeInsensitive(String value) {
            addCriterion("upper(TMIV.REG_ID) like", value.toUpperCase(), "regId");
            return (Criteria) this;
        }

        public Criteria andMbrIdLikeLeft(String value) {
            addCriterion("TMIV.MBR_ID like ", "%" + value, "mbrId");
            return (Criteria) this;
        }

        public Criteria andMbrIdLikeRight(String value) {
            addCriterion("TMIV.MBR_ID like ", value + "%", "mbrId");
            return (Criteria) this;
        }

        public Criteria andMbrIdLikeBoth(String value) {
            addCriterion("TMIV.MBR_ID like ", "%" + value + "%", "mbrId");
            return (Criteria) this;
        }

        public Criteria andIdvrfTpCdLikeLeft(String value) {
            addCriterion("TMIV.IDVRF_TP_CD like ", "%" + value, "idvrfTpCd");
            return (Criteria) this;
        }

        public Criteria andIdvrfTpCdLikeRight(String value) {
            addCriterion("TMIV.IDVRF_TP_CD like ", value + "%", "idvrfTpCd");
            return (Criteria) this;
        }

        public Criteria andIdvrfTpCdLikeBoth(String value) {
            addCriterion("TMIV.IDVRF_TP_CD like ", "%" + value + "%", "idvrfTpCd");
            return (Criteria) this;
        }

        public Criteria andLnmNmLikeLeft(String value) {
            addCriterion("TMIV.LNM_NM like ", "%" + value, "lnmNm");
            return (Criteria) this;
        }

        public Criteria andLnmNmLikeRight(String value) {
            addCriterion("TMIV.LNM_NM like ", value + "%", "lnmNm");
            return (Criteria) this;
        }

        public Criteria andLnmNmLikeBoth(String value) {
            addCriterion("TMIV.LNM_NM like ", "%" + value + "%", "lnmNm");
            return (Criteria) this;
        }

        public Criteria andBrthYmdLikeLeft(String value) {
            addCriterion("TMIV.BRTH_YMD like ", "%" + value, "brthYmd");
            return (Criteria) this;
        }

        public Criteria andBrthYmdLikeRight(String value) {
            addCriterion("TMIV.BRTH_YMD like ", value + "%", "brthYmd");
            return (Criteria) this;
        }

        public Criteria andBrthYmdLikeBoth(String value) {
            addCriterion("TMIV.BRTH_YMD like ", "%" + value + "%", "brthYmd");
            return (Criteria) this;
        }

        public Criteria andGndrClLikeLeft(String value) {
            addCriterion("TMIV.GNDR_CL like ", "%" + value, "gndrCl");
            return (Criteria) this;
        }

        public Criteria andGndrClLikeRight(String value) {
            addCriterion("TMIV.GNDR_CL like ", value + "%", "gndrCl");
            return (Criteria) this;
        }

        public Criteria andGndrClLikeBoth(String value) {
            addCriterion("TMIV.GNDR_CL like ", "%" + value + "%", "gndrCl");
            return (Criteria) this;
        }

        public Criteria andLfrnrClLikeLeft(String value) {
            addCriterion("TMIV.LFRNR_CL like ", "%" + value, "lfrnrCl");
            return (Criteria) this;
        }

        public Criteria andLfrnrClLikeRight(String value) {
            addCriterion("TMIV.LFRNR_CL like ", value + "%", "lfrnrCl");
            return (Criteria) this;
        }

        public Criteria andLfrnrClLikeBoth(String value) {
            addCriterion("TMIV.LFRNR_CL like ", "%" + value + "%", "lfrnrCl");
            return (Criteria) this;
        }

        public Criteria andReqNoLikeLeft(String value) {
            addCriterion("TMIV.REQ_NO like ", "%" + value, "reqNo");
            return (Criteria) this;
        }

        public Criteria andReqNoLikeRight(String value) {
            addCriterion("TMIV.REQ_NO like ", value + "%", "reqNo");
            return (Criteria) this;
        }

        public Criteria andReqNoLikeBoth(String value) {
            addCriterion("TMIV.REQ_NO like ", "%" + value + "%", "reqNo");
            return (Criteria) this;
        }

        public Criteria andCpCarrLikeLeft(String value) {
            addCriterion("TMIV.CP_CARR like ", "%" + value, "cpCarr");
            return (Criteria) this;
        }

        public Criteria andCpCarrLikeRight(String value) {
            addCriterion("TMIV.CP_CARR like ", value + "%", "cpCarr");
            return (Criteria) this;
        }

        public Criteria andCpCarrLikeBoth(String value) {
            addCriterion("TMIV.CP_CARR like ", "%" + value + "%", "cpCarr");
            return (Criteria) this;
        }

        public Criteria andCpNoLikeLeft(String value) {
            addCriterion("TMIV.CP_NO like ", "%" + value, "cpNo");
            return (Criteria) this;
        }

        public Criteria andCpNoLikeRight(String value) {
            addCriterion("TMIV.CP_NO like ", value + "%", "cpNo");
            return (Criteria) this;
        }

        public Criteria andCpNoLikeBoth(String value) {
            addCriterion("TMIV.CP_NO like ", "%" + value + "%", "cpNo");
            return (Criteria) this;
        }

        public Criteria andCiValLikeLeft(String value) {
            addCriterion("TMIV.CI_VAL like ", "%" + value, "ciVal");
            return (Criteria) this;
        }

        public Criteria andCiValLikeRight(String value) {
            addCriterion("TMIV.CI_VAL like ", value + "%", "ciVal");
            return (Criteria) this;
        }

        public Criteria andCiValLikeBoth(String value) {
            addCriterion("TMIV.CI_VAL like ", "%" + value + "%", "ciVal");
            return (Criteria) this;
        }

        public Criteria andDiValLikeLeft(String value) {
            addCriterion("TMIV.DI_VAL like ", "%" + value, "diVal");
            return (Criteria) this;
        }

        public Criteria andDiValLikeRight(String value) {
            addCriterion("TMIV.DI_VAL like ", value + "%", "diVal");
            return (Criteria) this;
        }

        public Criteria andDiValLikeBoth(String value) {
            addCriterion("TMIV.DI_VAL like ", "%" + value + "%", "diVal");
            return (Criteria) this;
        }

        public Criteria andRsltCdValLikeLeft(String value) {
            addCriterion("TMIV.RSLT_CD_VAL like ", "%" + value, "rsltCdVal");
            return (Criteria) this;
        }

        public Criteria andRsltCdValLikeRight(String value) {
            addCriterion("TMIV.RSLT_CD_VAL like ", value + "%", "rsltCdVal");
            return (Criteria) this;
        }

        public Criteria andRsltCdValLikeBoth(String value) {
            addCriterion("TMIV.RSLT_CD_VAL like ", "%" + value + "%", "rsltCdVal");
            return (Criteria) this;
        }

        public Criteria andRsltMsgLikeLeft(String value) {
            addCriterion("TMIV.RSLT_MSG like ", "%" + value, "rsltMsg");
            return (Criteria) this;
        }

        public Criteria andRsltMsgLikeRight(String value) {
            addCriterion("TMIV.RSLT_MSG like ", value + "%", "rsltMsg");
            return (Criteria) this;
        }

        public Criteria andRsltMsgLikeBoth(String value) {
            addCriterion("TMIV.RSLT_MSG like ", "%" + value + "%", "rsltMsg");
            return (Criteria) this;
        }

        public Criteria andAddVarLikeLeft(String value) {
            addCriterion("TMIV.ADD_VAR like ", "%" + value, "addVar");
            return (Criteria) this;
        }

        public Criteria andAddVarLikeRight(String value) {
            addCriterion("TMIV.ADD_VAR like ", value + "%", "addVar");
            return (Criteria) this;
        }

        public Criteria andAddVarLikeBoth(String value) {
            addCriterion("TMIV.ADD_VAR like ", "%" + value + "%", "addVar");
            return (Criteria) this;
        }

        public Criteria andRegIdLikeLeft(String value) {
            addCriterion("TMIV.REG_ID like ", "%" + value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdLikeRight(String value) {
            addCriterion("TMIV.REG_ID like ", value + "%", "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdLikeBoth(String value) {
            addCriterion("TMIV.REG_ID like ", "%" + value + "%", "regId");
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