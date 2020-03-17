package com.mushbird.sinsege.base.module.member.model.entity.criteria;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class MemberEntityCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    public MemberEntityCriteria() {
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

        public Criteria andMbrIdIsNull() {
            addCriterion("TM.MBR_ID is null");
            return (Criteria) this;
        }

        public Criteria andMbrIdIsNotNull() {
            addCriterion("TM.MBR_ID is not null");
            return (Criteria) this;
        }

        public Criteria andMbrIdEqualTo(String value) {
            addCriterion("TM.MBR_ID =", value, "mbrId");
            return (Criteria) this;
        }

        public Criteria andMbrIdNotEqualTo(String value) {
            addCriterion("TM.MBR_ID <>", value, "mbrId");
            return (Criteria) this;
        }

        public Criteria andMbrIdGreaterThan(String value) {
            addCriterion("TM.MBR_ID >", value, "mbrId");
            return (Criteria) this;
        }

        public Criteria andMbrIdGreaterThanOrEqualTo(String value) {
            addCriterion("TM.MBR_ID >=", value, "mbrId");
            return (Criteria) this;
        }

        public Criteria andMbrIdLessThan(String value) {
            addCriterion("TM.MBR_ID <", value, "mbrId");
            return (Criteria) this;
        }

        public Criteria andMbrIdLessThanOrEqualTo(String value) {
            addCriterion("TM.MBR_ID <=", value, "mbrId");
            return (Criteria) this;
        }

        public Criteria andMbrIdLike(String value) {
            addCriterion("TM.MBR_ID like", value, "mbrId");
            return (Criteria) this;
        }

        public Criteria andMbrIdNotLike(String value) {
            addCriterion("TM.MBR_ID not like", value, "mbrId");
            return (Criteria) this;
        }

        public Criteria andMbrIdIn(List<String> values) {
            addCriterion("TM.MBR_ID in", values, "mbrId");
            return (Criteria) this;
        }

        public Criteria andMbrIdNotIn(List<String> values) {
            addCriterion("TM.MBR_ID not in", values, "mbrId");
            return (Criteria) this;
        }

        public Criteria andMbrIdBetween(String value1, String value2) {
            addCriterion("TM.MBR_ID between", value1, value2, "mbrId");
            return (Criteria) this;
        }

        public Criteria andMbrIdNotBetween(String value1, String value2) {
            addCriterion("TM.MBR_ID not between", value1, value2, "mbrId");
            return (Criteria) this;
        }

        public Criteria andMbrStatCdIsNull() {
            addCriterion("TM.MBR_STAT_CD is null");
            return (Criteria) this;
        }

        public Criteria andMbrStatCdIsNotNull() {
            addCriterion("TM.MBR_STAT_CD is not null");
            return (Criteria) this;
        }

        public Criteria andMbrStatCdEqualTo(String value) {
            addCriterion("TM.MBR_STAT_CD =", value, "mbrStatCd");
            return (Criteria) this;
        }

        public Criteria andMbrStatCdNotEqualTo(String value) {
            addCriterion("TM.MBR_STAT_CD <>", value, "mbrStatCd");
            return (Criteria) this;
        }

        public Criteria andMbrStatCdGreaterThan(String value) {
            addCriterion("TM.MBR_STAT_CD >", value, "mbrStatCd");
            return (Criteria) this;
        }

        public Criteria andMbrStatCdGreaterThanOrEqualTo(String value) {
            addCriterion("TM.MBR_STAT_CD >=", value, "mbrStatCd");
            return (Criteria) this;
        }

        public Criteria andMbrStatCdLessThan(String value) {
            addCriterion("TM.MBR_STAT_CD <", value, "mbrStatCd");
            return (Criteria) this;
        }

        public Criteria andMbrStatCdLessThanOrEqualTo(String value) {
            addCriterion("TM.MBR_STAT_CD <=", value, "mbrStatCd");
            return (Criteria) this;
        }

        public Criteria andMbrStatCdLike(String value) {
            addCriterion("TM.MBR_STAT_CD like", value, "mbrStatCd");
            return (Criteria) this;
        }

        public Criteria andMbrStatCdNotLike(String value) {
            addCriterion("TM.MBR_STAT_CD not like", value, "mbrStatCd");
            return (Criteria) this;
        }

        public Criteria andMbrStatCdIn(List<String> values) {
            addCriterion("TM.MBR_STAT_CD in", values, "mbrStatCd");
            return (Criteria) this;
        }

        public Criteria andMbrStatCdNotIn(List<String> values) {
            addCriterion("TM.MBR_STAT_CD not in", values, "mbrStatCd");
            return (Criteria) this;
        }

        public Criteria andMbrStatCdBetween(String value1, String value2) {
            addCriterion("TM.MBR_STAT_CD between", value1, value2, "mbrStatCd");
            return (Criteria) this;
        }

        public Criteria andMbrStatCdNotBetween(String value1, String value2) {
            addCriterion("TM.MBR_STAT_CD not between", value1, value2, "mbrStatCd");
            return (Criteria) this;
        }

        public Criteria andMbrGrdCdIsNull() {
            addCriterion("TM.MBR_GRD_CD is null");
            return (Criteria) this;
        }

        public Criteria andMbrGrdCdIsNotNull() {
            addCriterion("TM.MBR_GRD_CD is not null");
            return (Criteria) this;
        }

        public Criteria andMbrGrdCdEqualTo(String value) {
            addCriterion("TM.MBR_GRD_CD =", value, "mbrGrdCd");
            return (Criteria) this;
        }

        public Criteria andMbrGrdCdNotEqualTo(String value) {
            addCriterion("TM.MBR_GRD_CD <>", value, "mbrGrdCd");
            return (Criteria) this;
        }

        public Criteria andMbrGrdCdGreaterThan(String value) {
            addCriterion("TM.MBR_GRD_CD >", value, "mbrGrdCd");
            return (Criteria) this;
        }

        public Criteria andMbrGrdCdGreaterThanOrEqualTo(String value) {
            addCriterion("TM.MBR_GRD_CD >=", value, "mbrGrdCd");
            return (Criteria) this;
        }

        public Criteria andMbrGrdCdLessThan(String value) {
            addCriterion("TM.MBR_GRD_CD <", value, "mbrGrdCd");
            return (Criteria) this;
        }

        public Criteria andMbrGrdCdLessThanOrEqualTo(String value) {
            addCriterion("TM.MBR_GRD_CD <=", value, "mbrGrdCd");
            return (Criteria) this;
        }

        public Criteria andMbrGrdCdLike(String value) {
            addCriterion("TM.MBR_GRD_CD like", value, "mbrGrdCd");
            return (Criteria) this;
        }

        public Criteria andMbrGrdCdNotLike(String value) {
            addCriterion("TM.MBR_GRD_CD not like", value, "mbrGrdCd");
            return (Criteria) this;
        }

        public Criteria andMbrGrdCdIn(List<String> values) {
            addCriterion("TM.MBR_GRD_CD in", values, "mbrGrdCd");
            return (Criteria) this;
        }

        public Criteria andMbrGrdCdNotIn(List<String> values) {
            addCriterion("TM.MBR_GRD_CD not in", values, "mbrGrdCd");
            return (Criteria) this;
        }

        public Criteria andMbrGrdCdBetween(String value1, String value2) {
            addCriterion("TM.MBR_GRD_CD between", value1, value2, "mbrGrdCd");
            return (Criteria) this;
        }

        public Criteria andMbrGrdCdNotBetween(String value1, String value2) {
            addCriterion("TM.MBR_GRD_CD not between", value1, value2, "mbrGrdCd");
            return (Criteria) this;
        }

        public Criteria andMbrLgnIdIsNull() {
            addCriterion("TM.MBR_LGN_ID is null");
            return (Criteria) this;
        }

        public Criteria andMbrLgnIdIsNotNull() {
            addCriterion("TM.MBR_LGN_ID is not null");
            return (Criteria) this;
        }

        public Criteria andMbrLgnIdEqualTo(String value) {
            addCriterion("TM.MBR_LGN_ID =", value, "mbrLgnId");
            return (Criteria) this;
        }

        public Criteria andMbrLgnIdNotEqualTo(String value) {
            addCriterion("TM.MBR_LGN_ID <>", value, "mbrLgnId");
            return (Criteria) this;
        }

        public Criteria andMbrLgnIdGreaterThan(String value) {
            addCriterion("TM.MBR_LGN_ID >", value, "mbrLgnId");
            return (Criteria) this;
        }

        public Criteria andMbrLgnIdGreaterThanOrEqualTo(String value) {
            addCriterion("TM.MBR_LGN_ID >=", value, "mbrLgnId");
            return (Criteria) this;
        }

        public Criteria andMbrLgnIdLessThan(String value) {
            addCriterion("TM.MBR_LGN_ID <", value, "mbrLgnId");
            return (Criteria) this;
        }

        public Criteria andMbrLgnIdLessThanOrEqualTo(String value) {
            addCriterion("TM.MBR_LGN_ID <=", value, "mbrLgnId");
            return (Criteria) this;
        }

        public Criteria andMbrLgnIdLike(String value) {
            addCriterion("TM.MBR_LGN_ID like", value, "mbrLgnId");
            return (Criteria) this;
        }

        public Criteria andMbrLgnIdNotLike(String value) {
            addCriterion("TM.MBR_LGN_ID not like", value, "mbrLgnId");
            return (Criteria) this;
        }

        public Criteria andMbrLgnIdIn(List<String> values) {
            addCriterion("TM.MBR_LGN_ID in", values, "mbrLgnId");
            return (Criteria) this;
        }

        public Criteria andMbrLgnIdNotIn(List<String> values) {
            addCriterion("TM.MBR_LGN_ID not in", values, "mbrLgnId");
            return (Criteria) this;
        }

        public Criteria andMbrLgnIdBetween(String value1, String value2) {
            addCriterion("TM.MBR_LGN_ID between", value1, value2, "mbrLgnId");
            return (Criteria) this;
        }

        public Criteria andMbrLgnIdNotBetween(String value1, String value2) {
            addCriterion("TM.MBR_LGN_ID not between", value1, value2, "mbrLgnId");
            return (Criteria) this;
        }

        public Criteria andMbrNmIsNull() {
            addCriterion("TM.MBR_NM is null");
            return (Criteria) this;
        }

        public Criteria andMbrNmIsNotNull() {
            addCriterion("TM.MBR_NM is not null");
            return (Criteria) this;
        }

        public Criteria andMbrNmEqualTo(String value) {
            addCriterion("TM.MBR_NM =", value, "mbrNm");
            return (Criteria) this;
        }

        public Criteria andMbrNmNotEqualTo(String value) {
            addCriterion("TM.MBR_NM <>", value, "mbrNm");
            return (Criteria) this;
        }

        public Criteria andMbrNmGreaterThan(String value) {
            addCriterion("TM.MBR_NM >", value, "mbrNm");
            return (Criteria) this;
        }

        public Criteria andMbrNmGreaterThanOrEqualTo(String value) {
            addCriterion("TM.MBR_NM >=", value, "mbrNm");
            return (Criteria) this;
        }

        public Criteria andMbrNmLessThan(String value) {
            addCriterion("TM.MBR_NM <", value, "mbrNm");
            return (Criteria) this;
        }

        public Criteria andMbrNmLessThanOrEqualTo(String value) {
            addCriterion("TM.MBR_NM <=", value, "mbrNm");
            return (Criteria) this;
        }

        public Criteria andMbrNmLike(String value) {
            addCriterion("TM.MBR_NM like", value, "mbrNm");
            return (Criteria) this;
        }

        public Criteria andMbrNmNotLike(String value) {
            addCriterion("TM.MBR_NM not like", value, "mbrNm");
            return (Criteria) this;
        }

        public Criteria andMbrNmIn(List<String> values) {
            addCriterion("TM.MBR_NM in", values, "mbrNm");
            return (Criteria) this;
        }

        public Criteria andMbrNmNotIn(List<String> values) {
            addCriterion("TM.MBR_NM not in", values, "mbrNm");
            return (Criteria) this;
        }

        public Criteria andMbrNmBetween(String value1, String value2) {
            addCriterion("TM.MBR_NM between", value1, value2, "mbrNm");
            return (Criteria) this;
        }

        public Criteria andMbrNmNotBetween(String value1, String value2) {
            addCriterion("TM.MBR_NM not between", value1, value2, "mbrNm");
            return (Criteria) this;
        }

        public Criteria andEmailIsNull() {
            addCriterion("TM.EMAIL is null");
            return (Criteria) this;
        }

        public Criteria andEmailIsNotNull() {
            addCriterion("TM.EMAIL is not null");
            return (Criteria) this;
        }

        public Criteria andEmailEqualTo(String value) {
            addCriterion("TM.EMAIL =", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotEqualTo(String value) {
            addCriterion("TM.EMAIL <>", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThan(String value) {
            addCriterion("TM.EMAIL >", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThanOrEqualTo(String value) {
            addCriterion("TM.EMAIL >=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThan(String value) {
            addCriterion("TM.EMAIL <", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThanOrEqualTo(String value) {
            addCriterion("TM.EMAIL <=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLike(String value) {
            addCriterion("TM.EMAIL like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotLike(String value) {
            addCriterion("TM.EMAIL not like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailIn(List<String> values) {
            addCriterion("TM.EMAIL in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotIn(List<String> values) {
            addCriterion("TM.EMAIL not in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailBetween(String value1, String value2) {
            addCriterion("TM.EMAIL between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotBetween(String value1, String value2) {
            addCriterion("TM.EMAIL not between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andBrthYmdIsNull() {
            addCriterion("TM.BRTH_YMD is null");
            return (Criteria) this;
        }

        public Criteria andBrthYmdIsNotNull() {
            addCriterion("TM.BRTH_YMD is not null");
            return (Criteria) this;
        }

        public Criteria andBrthYmdEqualTo(String value) {
            addCriterion("TM.BRTH_YMD =", value, "brthYmd");
            return (Criteria) this;
        }

        public Criteria andBrthYmdNotEqualTo(String value) {
            addCriterion("TM.BRTH_YMD <>", value, "brthYmd");
            return (Criteria) this;
        }

        public Criteria andBrthYmdGreaterThan(String value) {
            addCriterion("TM.BRTH_YMD >", value, "brthYmd");
            return (Criteria) this;
        }

        public Criteria andBrthYmdGreaterThanOrEqualTo(String value) {
            addCriterion("TM.BRTH_YMD >=", value, "brthYmd");
            return (Criteria) this;
        }

        public Criteria andBrthYmdLessThan(String value) {
            addCriterion("TM.BRTH_YMD <", value, "brthYmd");
            return (Criteria) this;
        }

        public Criteria andBrthYmdLessThanOrEqualTo(String value) {
            addCriterion("TM.BRTH_YMD <=", value, "brthYmd");
            return (Criteria) this;
        }

        public Criteria andBrthYmdLike(String value) {
            addCriterion("TM.BRTH_YMD like", value, "brthYmd");
            return (Criteria) this;
        }

        public Criteria andBrthYmdNotLike(String value) {
            addCriterion("TM.BRTH_YMD not like", value, "brthYmd");
            return (Criteria) this;
        }

        public Criteria andBrthYmdIn(List<String> values) {
            addCriterion("TM.BRTH_YMD in", values, "brthYmd");
            return (Criteria) this;
        }

        public Criteria andBrthYmdNotIn(List<String> values) {
            addCriterion("TM.BRTH_YMD not in", values, "brthYmd");
            return (Criteria) this;
        }

        public Criteria andBrthYmdBetween(String value1, String value2) {
            addCriterion("TM.BRTH_YMD between", value1, value2, "brthYmd");
            return (Criteria) this;
        }

        public Criteria andBrthYmdNotBetween(String value1, String value2) {
            addCriterion("TM.BRTH_YMD not between", value1, value2, "brthYmd");
            return (Criteria) this;
        }

        public Criteria andGndrCdIsNull() {
            addCriterion("TM.GNDR_CD is null");
            return (Criteria) this;
        }

        public Criteria andGndrCdIsNotNull() {
            addCriterion("TM.GNDR_CD is not null");
            return (Criteria) this;
        }

        public Criteria andGndrCdEqualTo(String value) {
            addCriterion("TM.GNDR_CD =", value, "gndrCd");
            return (Criteria) this;
        }

        public Criteria andGndrCdNotEqualTo(String value) {
            addCriterion("TM.GNDR_CD <>", value, "gndrCd");
            return (Criteria) this;
        }

        public Criteria andGndrCdGreaterThan(String value) {
            addCriterion("TM.GNDR_CD >", value, "gndrCd");
            return (Criteria) this;
        }

        public Criteria andGndrCdGreaterThanOrEqualTo(String value) {
            addCriterion("TM.GNDR_CD >=", value, "gndrCd");
            return (Criteria) this;
        }

        public Criteria andGndrCdLessThan(String value) {
            addCriterion("TM.GNDR_CD <", value, "gndrCd");
            return (Criteria) this;
        }

        public Criteria andGndrCdLessThanOrEqualTo(String value) {
            addCriterion("TM.GNDR_CD <=", value, "gndrCd");
            return (Criteria) this;
        }

        public Criteria andGndrCdLike(String value) {
            addCriterion("TM.GNDR_CD like", value, "gndrCd");
            return (Criteria) this;
        }

        public Criteria andGndrCdNotLike(String value) {
            addCriterion("TM.GNDR_CD not like", value, "gndrCd");
            return (Criteria) this;
        }

        public Criteria andGndrCdIn(List<String> values) {
            addCriterion("TM.GNDR_CD in", values, "gndrCd");
            return (Criteria) this;
        }

        public Criteria andGndrCdNotIn(List<String> values) {
            addCriterion("TM.GNDR_CD not in", values, "gndrCd");
            return (Criteria) this;
        }

        public Criteria andGndrCdBetween(String value1, String value2) {
            addCriterion("TM.GNDR_CD between", value1, value2, "gndrCd");
            return (Criteria) this;
        }

        public Criteria andGndrCdNotBetween(String value1, String value2) {
            addCriterion("TM.GNDR_CD not between", value1, value2, "gndrCd");
            return (Criteria) this;
        }

        public Criteria andTelNoIsNull() {
            addCriterion("TM.TEL_NO is null");
            return (Criteria) this;
        }

        public Criteria andTelNoIsNotNull() {
            addCriterion("TM.TEL_NO is not null");
            return (Criteria) this;
        }

        public Criteria andTelNoEqualTo(String value) {
            addCriterion("TM.TEL_NO =", value, "telNo");
            return (Criteria) this;
        }

        public Criteria andTelNoNotEqualTo(String value) {
            addCriterion("TM.TEL_NO <>", value, "telNo");
            return (Criteria) this;
        }

        public Criteria andTelNoGreaterThan(String value) {
            addCriterion("TM.TEL_NO >", value, "telNo");
            return (Criteria) this;
        }

        public Criteria andTelNoGreaterThanOrEqualTo(String value) {
            addCriterion("TM.TEL_NO >=", value, "telNo");
            return (Criteria) this;
        }

        public Criteria andTelNoLessThan(String value) {
            addCriterion("TM.TEL_NO <", value, "telNo");
            return (Criteria) this;
        }

        public Criteria andTelNoLessThanOrEqualTo(String value) {
            addCriterion("TM.TEL_NO <=", value, "telNo");
            return (Criteria) this;
        }

        public Criteria andTelNoLike(String value) {
            addCriterion("TM.TEL_NO like", value, "telNo");
            return (Criteria) this;
        }

        public Criteria andTelNoNotLike(String value) {
            addCriterion("TM.TEL_NO not like", value, "telNo");
            return (Criteria) this;
        }

        public Criteria andTelNoIn(List<String> values) {
            addCriterion("TM.TEL_NO in", values, "telNo");
            return (Criteria) this;
        }

        public Criteria andTelNoNotIn(List<String> values) {
            addCriterion("TM.TEL_NO not in", values, "telNo");
            return (Criteria) this;
        }

        public Criteria andTelNoBetween(String value1, String value2) {
            addCriterion("TM.TEL_NO between", value1, value2, "telNo");
            return (Criteria) this;
        }

        public Criteria andTelNoNotBetween(String value1, String value2) {
            addCriterion("TM.TEL_NO not between", value1, value2, "telNo");
            return (Criteria) this;
        }

        public Criteria andCpCarrCdIsNull() {
            addCriterion("TM.CP_CARR_CD is null");
            return (Criteria) this;
        }

        public Criteria andCpCarrCdIsNotNull() {
            addCriterion("TM.CP_CARR_CD is not null");
            return (Criteria) this;
        }

        public Criteria andCpCarrCdEqualTo(String value) {
            addCriterion("TM.CP_CARR_CD =", value, "cpCarrCd");
            return (Criteria) this;
        }

        public Criteria andCpCarrCdNotEqualTo(String value) {
            addCriterion("TM.CP_CARR_CD <>", value, "cpCarrCd");
            return (Criteria) this;
        }

        public Criteria andCpCarrCdGreaterThan(String value) {
            addCriterion("TM.CP_CARR_CD >", value, "cpCarrCd");
            return (Criteria) this;
        }

        public Criteria andCpCarrCdGreaterThanOrEqualTo(String value) {
            addCriterion("TM.CP_CARR_CD >=", value, "cpCarrCd");
            return (Criteria) this;
        }

        public Criteria andCpCarrCdLessThan(String value) {
            addCriterion("TM.CP_CARR_CD <", value, "cpCarrCd");
            return (Criteria) this;
        }

        public Criteria andCpCarrCdLessThanOrEqualTo(String value) {
            addCriterion("TM.CP_CARR_CD <=", value, "cpCarrCd");
            return (Criteria) this;
        }

        public Criteria andCpCarrCdLike(String value) {
            addCriterion("TM.CP_CARR_CD like", value, "cpCarrCd");
            return (Criteria) this;
        }

        public Criteria andCpCarrCdNotLike(String value) {
            addCriterion("TM.CP_CARR_CD not like", value, "cpCarrCd");
            return (Criteria) this;
        }

        public Criteria andCpCarrCdIn(List<String> values) {
            addCriterion("TM.CP_CARR_CD in", values, "cpCarrCd");
            return (Criteria) this;
        }

        public Criteria andCpCarrCdNotIn(List<String> values) {
            addCriterion("TM.CP_CARR_CD not in", values, "cpCarrCd");
            return (Criteria) this;
        }

        public Criteria andCpCarrCdBetween(String value1, String value2) {
            addCriterion("TM.CP_CARR_CD between", value1, value2, "cpCarrCd");
            return (Criteria) this;
        }

        public Criteria andCpCarrCdNotBetween(String value1, String value2) {
            addCriterion("TM.CP_CARR_CD not between", value1, value2, "cpCarrCd");
            return (Criteria) this;
        }

        public Criteria andCpNoIsNull() {
            addCriterion("TM.CP_NO is null");
            return (Criteria) this;
        }

        public Criteria andCpNoIsNotNull() {
            addCriterion("TM.CP_NO is not null");
            return (Criteria) this;
        }

        public Criteria andCpNoEqualTo(String value) {
            addCriterion("TM.CP_NO =", value, "cpNo");
            return (Criteria) this;
        }

        public Criteria andCpNoNotEqualTo(String value) {
            addCriterion("TM.CP_NO <>", value, "cpNo");
            return (Criteria) this;
        }

        public Criteria andCpNoGreaterThan(String value) {
            addCriterion("TM.CP_NO >", value, "cpNo");
            return (Criteria) this;
        }

        public Criteria andCpNoGreaterThanOrEqualTo(String value) {
            addCriterion("TM.CP_NO >=", value, "cpNo");
            return (Criteria) this;
        }

        public Criteria andCpNoLessThan(String value) {
            addCriterion("TM.CP_NO <", value, "cpNo");
            return (Criteria) this;
        }

        public Criteria andCpNoLessThanOrEqualTo(String value) {
            addCriterion("TM.CP_NO <=", value, "cpNo");
            return (Criteria) this;
        }

        public Criteria andCpNoLike(String value) {
            addCriterion("TM.CP_NO like", value, "cpNo");
            return (Criteria) this;
        }

        public Criteria andCpNoNotLike(String value) {
            addCriterion("TM.CP_NO not like", value, "cpNo");
            return (Criteria) this;
        }

        public Criteria andCpNoIn(List<String> values) {
            addCriterion("TM.CP_NO in", values, "cpNo");
            return (Criteria) this;
        }

        public Criteria andCpNoNotIn(List<String> values) {
            addCriterion("TM.CP_NO not in", values, "cpNo");
            return (Criteria) this;
        }

        public Criteria andCpNoBetween(String value1, String value2) {
            addCriterion("TM.CP_NO between", value1, value2, "cpNo");
            return (Criteria) this;
        }

        public Criteria andCpNoNotBetween(String value1, String value2) {
            addCriterion("TM.CP_NO not between", value1, value2, "cpNo");
            return (Criteria) this;
        }

        public Criteria andIdvrfYnIsNull() {
            addCriterion("TM.IDVRF_YN is null");
            return (Criteria) this;
        }

        public Criteria andIdvrfYnIsNotNull() {
            addCriterion("TM.IDVRF_YN is not null");
            return (Criteria) this;
        }

        public Criteria andIdvrfYnEqualTo(String value) {
            addCriterion("TM.IDVRF_YN =", value, "idvrfYn");
            return (Criteria) this;
        }

        public Criteria andIdvrfYnNotEqualTo(String value) {
            addCriterion("TM.IDVRF_YN <>", value, "idvrfYn");
            return (Criteria) this;
        }

        public Criteria andIdvrfYnGreaterThan(String value) {
            addCriterion("TM.IDVRF_YN >", value, "idvrfYn");
            return (Criteria) this;
        }

        public Criteria andIdvrfYnGreaterThanOrEqualTo(String value) {
            addCriterion("TM.IDVRF_YN >=", value, "idvrfYn");
            return (Criteria) this;
        }

        public Criteria andIdvrfYnLessThan(String value) {
            addCriterion("TM.IDVRF_YN <", value, "idvrfYn");
            return (Criteria) this;
        }

        public Criteria andIdvrfYnLessThanOrEqualTo(String value) {
            addCriterion("TM.IDVRF_YN <=", value, "idvrfYn");
            return (Criteria) this;
        }

        public Criteria andIdvrfYnLike(String value) {
            addCriterion("TM.IDVRF_YN like", value, "idvrfYn");
            return (Criteria) this;
        }

        public Criteria andIdvrfYnNotLike(String value) {
            addCriterion("TM.IDVRF_YN not like", value, "idvrfYn");
            return (Criteria) this;
        }

        public Criteria andIdvrfYnIn(List<String> values) {
            addCriterion("TM.IDVRF_YN in", values, "idvrfYn");
            return (Criteria) this;
        }

        public Criteria andIdvrfYnNotIn(List<String> values) {
            addCriterion("TM.IDVRF_YN not in", values, "idvrfYn");
            return (Criteria) this;
        }

        public Criteria andIdvrfYnBetween(String value1, String value2) {
            addCriterion("TM.IDVRF_YN between", value1, value2, "idvrfYn");
            return (Criteria) this;
        }

        public Criteria andIdvrfYnNotBetween(String value1, String value2) {
            addCriterion("TM.IDVRF_YN not between", value1, value2, "idvrfYn");
            return (Criteria) this;
        }

        public Criteria andIdvrfTpCdIsNull() {
            addCriterion("TM.IDVRF_TP_CD is null");
            return (Criteria) this;
        }

        public Criteria andIdvrfTpCdIsNotNull() {
            addCriterion("TM.IDVRF_TP_CD is not null");
            return (Criteria) this;
        }

        public Criteria andIdvrfTpCdEqualTo(String value) {
            addCriterion("TM.IDVRF_TP_CD =", value, "idvrfTpCd");
            return (Criteria) this;
        }

        public Criteria andIdvrfTpCdNotEqualTo(String value) {
            addCriterion("TM.IDVRF_TP_CD <>", value, "idvrfTpCd");
            return (Criteria) this;
        }

        public Criteria andIdvrfTpCdGreaterThan(String value) {
            addCriterion("TM.IDVRF_TP_CD >", value, "idvrfTpCd");
            return (Criteria) this;
        }

        public Criteria andIdvrfTpCdGreaterThanOrEqualTo(String value) {
            addCriterion("TM.IDVRF_TP_CD >=", value, "idvrfTpCd");
            return (Criteria) this;
        }

        public Criteria andIdvrfTpCdLessThan(String value) {
            addCriterion("TM.IDVRF_TP_CD <", value, "idvrfTpCd");
            return (Criteria) this;
        }

        public Criteria andIdvrfTpCdLessThanOrEqualTo(String value) {
            addCriterion("TM.IDVRF_TP_CD <=", value, "idvrfTpCd");
            return (Criteria) this;
        }

        public Criteria andIdvrfTpCdLike(String value) {
            addCriterion("TM.IDVRF_TP_CD like", value, "idvrfTpCd");
            return (Criteria) this;
        }

        public Criteria andIdvrfTpCdNotLike(String value) {
            addCriterion("TM.IDVRF_TP_CD not like", value, "idvrfTpCd");
            return (Criteria) this;
        }

        public Criteria andIdvrfTpCdIn(List<String> values) {
            addCriterion("TM.IDVRF_TP_CD in", values, "idvrfTpCd");
            return (Criteria) this;
        }

        public Criteria andIdvrfTpCdNotIn(List<String> values) {
            addCriterion("TM.IDVRF_TP_CD not in", values, "idvrfTpCd");
            return (Criteria) this;
        }

        public Criteria andIdvrfTpCdBetween(String value1, String value2) {
            addCriterion("TM.IDVRF_TP_CD between", value1, value2, "idvrfTpCd");
            return (Criteria) this;
        }

        public Criteria andIdvrfTpCdNotBetween(String value1, String value2) {
            addCriterion("TM.IDVRF_TP_CD not between", value1, value2, "idvrfTpCd");
            return (Criteria) this;
        }

        public Criteria andIdvrfDtIsNull() {
            addCriterion("TM.IDVRF_DT is null");
            return (Criteria) this;
        }

        public Criteria andIdvrfDtIsNotNull() {
            addCriterion("TM.IDVRF_DT is not null");
            return (Criteria) this;
        }

        public Criteria andIdvrfDtEqualTo(Date value) {
            addCriterion("TM.IDVRF_DT =", value, "idvrfDt");
            return (Criteria) this;
        }

        public Criteria andIdvrfDtNotEqualTo(Date value) {
            addCriterion("TM.IDVRF_DT <>", value, "idvrfDt");
            return (Criteria) this;
        }

        public Criteria andIdvrfDtGreaterThan(Date value) {
            addCriterion("TM.IDVRF_DT >", value, "idvrfDt");
            return (Criteria) this;
        }

        public Criteria andIdvrfDtGreaterThanOrEqualTo(Date value) {
            addCriterion("TM.IDVRF_DT >=", value, "idvrfDt");
            return (Criteria) this;
        }

        public Criteria andIdvrfDtLessThan(Date value) {
            addCriterion("TM.IDVRF_DT <", value, "idvrfDt");
            return (Criteria) this;
        }

        public Criteria andIdvrfDtLessThanOrEqualTo(Date value) {
            addCriterion("TM.IDVRF_DT <=", value, "idvrfDt");
            return (Criteria) this;
        }

        public Criteria andIdvrfDtIn(List<Date> values) {
            addCriterion("TM.IDVRF_DT in", values, "idvrfDt");
            return (Criteria) this;
        }

        public Criteria andIdvrfDtNotIn(List<Date> values) {
            addCriterion("TM.IDVRF_DT not in", values, "idvrfDt");
            return (Criteria) this;
        }

        public Criteria andIdvrfDtBetween(Date value1, Date value2) {
            addCriterion("TM.IDVRF_DT between", value1, value2, "idvrfDt");
            return (Criteria) this;
        }

        public Criteria andIdvrfDtNotBetween(Date value1, Date value2) {
            addCriterion("TM.IDVRF_DT not between", value1, value2, "idvrfDt");
            return (Criteria) this;
        }

        public Criteria andCiValIsNull() {
            addCriterion("TM.CI_VAL is null");
            return (Criteria) this;
        }

        public Criteria andCiValIsNotNull() {
            addCriterion("TM.CI_VAL is not null");
            return (Criteria) this;
        }

        public Criteria andCiValEqualTo(String value) {
            addCriterion("TM.CI_VAL =", value, "ciVal");
            return (Criteria) this;
        }

        public Criteria andCiValNotEqualTo(String value) {
            addCriterion("TM.CI_VAL <>", value, "ciVal");
            return (Criteria) this;
        }

        public Criteria andCiValGreaterThan(String value) {
            addCriterion("TM.CI_VAL >", value, "ciVal");
            return (Criteria) this;
        }

        public Criteria andCiValGreaterThanOrEqualTo(String value) {
            addCriterion("TM.CI_VAL >=", value, "ciVal");
            return (Criteria) this;
        }

        public Criteria andCiValLessThan(String value) {
            addCriterion("TM.CI_VAL <", value, "ciVal");
            return (Criteria) this;
        }

        public Criteria andCiValLessThanOrEqualTo(String value) {
            addCriterion("TM.CI_VAL <=", value, "ciVal");
            return (Criteria) this;
        }

        public Criteria andCiValLike(String value) {
            addCriterion("TM.CI_VAL like", value, "ciVal");
            return (Criteria) this;
        }

        public Criteria andCiValNotLike(String value) {
            addCriterion("TM.CI_VAL not like", value, "ciVal");
            return (Criteria) this;
        }

        public Criteria andCiValIn(List<String> values) {
            addCriterion("TM.CI_VAL in", values, "ciVal");
            return (Criteria) this;
        }

        public Criteria andCiValNotIn(List<String> values) {
            addCriterion("TM.CI_VAL not in", values, "ciVal");
            return (Criteria) this;
        }

        public Criteria andCiValBetween(String value1, String value2) {
            addCriterion("TM.CI_VAL between", value1, value2, "ciVal");
            return (Criteria) this;
        }

        public Criteria andCiValNotBetween(String value1, String value2) {
            addCriterion("TM.CI_VAL not between", value1, value2, "ciVal");
            return (Criteria) this;
        }

        public Criteria andDiValIsNull() {
            addCriterion("TM.DI_VAL is null");
            return (Criteria) this;
        }

        public Criteria andDiValIsNotNull() {
            addCriterion("TM.DI_VAL is not null");
            return (Criteria) this;
        }

        public Criteria andDiValEqualTo(String value) {
            addCriterion("TM.DI_VAL =", value, "diVal");
            return (Criteria) this;
        }

        public Criteria andDiValNotEqualTo(String value) {
            addCriterion("TM.DI_VAL <>", value, "diVal");
            return (Criteria) this;
        }

        public Criteria andDiValGreaterThan(String value) {
            addCriterion("TM.DI_VAL >", value, "diVal");
            return (Criteria) this;
        }

        public Criteria andDiValGreaterThanOrEqualTo(String value) {
            addCriterion("TM.DI_VAL >=", value, "diVal");
            return (Criteria) this;
        }

        public Criteria andDiValLessThan(String value) {
            addCriterion("TM.DI_VAL <", value, "diVal");
            return (Criteria) this;
        }

        public Criteria andDiValLessThanOrEqualTo(String value) {
            addCriterion("TM.DI_VAL <=", value, "diVal");
            return (Criteria) this;
        }

        public Criteria andDiValLike(String value) {
            addCriterion("TM.DI_VAL like", value, "diVal");
            return (Criteria) this;
        }

        public Criteria andDiValNotLike(String value) {
            addCriterion("TM.DI_VAL not like", value, "diVal");
            return (Criteria) this;
        }

        public Criteria andDiValIn(List<String> values) {
            addCriterion("TM.DI_VAL in", values, "diVal");
            return (Criteria) this;
        }

        public Criteria andDiValNotIn(List<String> values) {
            addCriterion("TM.DI_VAL not in", values, "diVal");
            return (Criteria) this;
        }

        public Criteria andDiValBetween(String value1, String value2) {
            addCriterion("TM.DI_VAL between", value1, value2, "diVal");
            return (Criteria) this;
        }

        public Criteria andDiValNotBetween(String value1, String value2) {
            addCriterion("TM.DI_VAL not between", value1, value2, "diVal");
            return (Criteria) this;
        }

        public Criteria andBadMbrYnIsNull() {
            addCriterion("TM.BAD_MBR_YN is null");
            return (Criteria) this;
        }

        public Criteria andBadMbrYnIsNotNull() {
            addCriterion("TM.BAD_MBR_YN is not null");
            return (Criteria) this;
        }

        public Criteria andBadMbrYnEqualTo(String value) {
            addCriterion("TM.BAD_MBR_YN =", value, "badMbrYn");
            return (Criteria) this;
        }

        public Criteria andBadMbrYnNotEqualTo(String value) {
            addCriterion("TM.BAD_MBR_YN <>", value, "badMbrYn");
            return (Criteria) this;
        }

        public Criteria andBadMbrYnGreaterThan(String value) {
            addCriterion("TM.BAD_MBR_YN >", value, "badMbrYn");
            return (Criteria) this;
        }

        public Criteria andBadMbrYnGreaterThanOrEqualTo(String value) {
            addCriterion("TM.BAD_MBR_YN >=", value, "badMbrYn");
            return (Criteria) this;
        }

        public Criteria andBadMbrYnLessThan(String value) {
            addCriterion("TM.BAD_MBR_YN <", value, "badMbrYn");
            return (Criteria) this;
        }

        public Criteria andBadMbrYnLessThanOrEqualTo(String value) {
            addCriterion("TM.BAD_MBR_YN <=", value, "badMbrYn");
            return (Criteria) this;
        }

        public Criteria andBadMbrYnLike(String value) {
            addCriterion("TM.BAD_MBR_YN like", value, "badMbrYn");
            return (Criteria) this;
        }

        public Criteria andBadMbrYnNotLike(String value) {
            addCriterion("TM.BAD_MBR_YN not like", value, "badMbrYn");
            return (Criteria) this;
        }

        public Criteria andBadMbrYnIn(List<String> values) {
            addCriterion("TM.BAD_MBR_YN in", values, "badMbrYn");
            return (Criteria) this;
        }

        public Criteria andBadMbrYnNotIn(List<String> values) {
            addCriterion("TM.BAD_MBR_YN not in", values, "badMbrYn");
            return (Criteria) this;
        }

        public Criteria andBadMbrYnBetween(String value1, String value2) {
            addCriterion("TM.BAD_MBR_YN between", value1, value2, "badMbrYn");
            return (Criteria) this;
        }

        public Criteria andBadMbrYnNotBetween(String value1, String value2) {
            addCriterion("TM.BAD_MBR_YN not between", value1, value2, "badMbrYn");
            return (Criteria) this;
        }

        public Criteria andRcmndeCdIsNull() {
            addCriterion("TM.RCMNDE_CD is null");
            return (Criteria) this;
        }

        public Criteria andRcmndeCdIsNotNull() {
            addCriterion("TM.RCMNDE_CD is not null");
            return (Criteria) this;
        }

        public Criteria andRcmndeCdEqualTo(String value) {
            addCriterion("TM.RCMNDE_CD =", value, "rcmndeCd");
            return (Criteria) this;
        }

        public Criteria andRcmndeCdNotEqualTo(String value) {
            addCriterion("TM.RCMNDE_CD <>", value, "rcmndeCd");
            return (Criteria) this;
        }

        public Criteria andRcmndeCdGreaterThan(String value) {
            addCriterion("TM.RCMNDE_CD >", value, "rcmndeCd");
            return (Criteria) this;
        }

        public Criteria andRcmndeCdGreaterThanOrEqualTo(String value) {
            addCriterion("TM.RCMNDE_CD >=", value, "rcmndeCd");
            return (Criteria) this;
        }

        public Criteria andRcmndeCdLessThan(String value) {
            addCriterion("TM.RCMNDE_CD <", value, "rcmndeCd");
            return (Criteria) this;
        }

        public Criteria andRcmndeCdLessThanOrEqualTo(String value) {
            addCriterion("TM.RCMNDE_CD <=", value, "rcmndeCd");
            return (Criteria) this;
        }

        public Criteria andRcmndeCdLike(String value) {
            addCriterion("TM.RCMNDE_CD like", value, "rcmndeCd");
            return (Criteria) this;
        }

        public Criteria andRcmndeCdNotLike(String value) {
            addCriterion("TM.RCMNDE_CD not like", value, "rcmndeCd");
            return (Criteria) this;
        }

        public Criteria andRcmndeCdIn(List<String> values) {
            addCriterion("TM.RCMNDE_CD in", values, "rcmndeCd");
            return (Criteria) this;
        }

        public Criteria andRcmndeCdNotIn(List<String> values) {
            addCriterion("TM.RCMNDE_CD not in", values, "rcmndeCd");
            return (Criteria) this;
        }

        public Criteria andRcmndeCdBetween(String value1, String value2) {
            addCriterion("TM.RCMNDE_CD between", value1, value2, "rcmndeCd");
            return (Criteria) this;
        }

        public Criteria andRcmndeCdNotBetween(String value1, String value2) {
            addCriterion("TM.RCMNDE_CD not between", value1, value2, "rcmndeCd");
            return (Criteria) this;
        }

        public Criteria andSupPathClCdIsNull() {
            addCriterion("TM.SUP_PATH_CL_CD is null");
            return (Criteria) this;
        }

        public Criteria andSupPathClCdIsNotNull() {
            addCriterion("TM.SUP_PATH_CL_CD is not null");
            return (Criteria) this;
        }

        public Criteria andSupPathClCdEqualTo(String value) {
            addCriterion("TM.SUP_PATH_CL_CD =", value, "supPathClCd");
            return (Criteria) this;
        }

        public Criteria andSupPathClCdNotEqualTo(String value) {
            addCriterion("TM.SUP_PATH_CL_CD <>", value, "supPathClCd");
            return (Criteria) this;
        }

        public Criteria andSupPathClCdGreaterThan(String value) {
            addCriterion("TM.SUP_PATH_CL_CD >", value, "supPathClCd");
            return (Criteria) this;
        }

        public Criteria andSupPathClCdGreaterThanOrEqualTo(String value) {
            addCriterion("TM.SUP_PATH_CL_CD >=", value, "supPathClCd");
            return (Criteria) this;
        }

        public Criteria andSupPathClCdLessThan(String value) {
            addCriterion("TM.SUP_PATH_CL_CD <", value, "supPathClCd");
            return (Criteria) this;
        }

        public Criteria andSupPathClCdLessThanOrEqualTo(String value) {
            addCriterion("TM.SUP_PATH_CL_CD <=", value, "supPathClCd");
            return (Criteria) this;
        }

        public Criteria andSupPathClCdLike(String value) {
            addCriterion("TM.SUP_PATH_CL_CD like", value, "supPathClCd");
            return (Criteria) this;
        }

        public Criteria andSupPathClCdNotLike(String value) {
            addCriterion("TM.SUP_PATH_CL_CD not like", value, "supPathClCd");
            return (Criteria) this;
        }

        public Criteria andSupPathClCdIn(List<String> values) {
            addCriterion("TM.SUP_PATH_CL_CD in", values, "supPathClCd");
            return (Criteria) this;
        }

        public Criteria andSupPathClCdNotIn(List<String> values) {
            addCriterion("TM.SUP_PATH_CL_CD not in", values, "supPathClCd");
            return (Criteria) this;
        }

        public Criteria andSupPathClCdBetween(String value1, String value2) {
            addCriterion("TM.SUP_PATH_CL_CD between", value1, value2, "supPathClCd");
            return (Criteria) this;
        }

        public Criteria andSupPathClCdNotBetween(String value1, String value2) {
            addCriterion("TM.SUP_PATH_CL_CD not between", value1, value2, "supPathClCd");
            return (Criteria) this;
        }

        public Criteria andSupPathCdIsNull() {
            addCriterion("TM.SUP_PATH_CD is null");
            return (Criteria) this;
        }

        public Criteria andSupPathCdIsNotNull() {
            addCriterion("TM.SUP_PATH_CD is not null");
            return (Criteria) this;
        }

        public Criteria andSupPathCdEqualTo(String value) {
            addCriterion("TM.SUP_PATH_CD =", value, "supPathCd");
            return (Criteria) this;
        }

        public Criteria andSupPathCdNotEqualTo(String value) {
            addCriterion("TM.SUP_PATH_CD <>", value, "supPathCd");
            return (Criteria) this;
        }

        public Criteria andSupPathCdGreaterThan(String value) {
            addCriterion("TM.SUP_PATH_CD >", value, "supPathCd");
            return (Criteria) this;
        }

        public Criteria andSupPathCdGreaterThanOrEqualTo(String value) {
            addCriterion("TM.SUP_PATH_CD >=", value, "supPathCd");
            return (Criteria) this;
        }

        public Criteria andSupPathCdLessThan(String value) {
            addCriterion("TM.SUP_PATH_CD <", value, "supPathCd");
            return (Criteria) this;
        }

        public Criteria andSupPathCdLessThanOrEqualTo(String value) {
            addCriterion("TM.SUP_PATH_CD <=", value, "supPathCd");
            return (Criteria) this;
        }

        public Criteria andSupPathCdLike(String value) {
            addCriterion("TM.SUP_PATH_CD like", value, "supPathCd");
            return (Criteria) this;
        }

        public Criteria andSupPathCdNotLike(String value) {
            addCriterion("TM.SUP_PATH_CD not like", value, "supPathCd");
            return (Criteria) this;
        }

        public Criteria andSupPathCdIn(List<String> values) {
            addCriterion("TM.SUP_PATH_CD in", values, "supPathCd");
            return (Criteria) this;
        }

        public Criteria andSupPathCdNotIn(List<String> values) {
            addCriterion("TM.SUP_PATH_CD not in", values, "supPathCd");
            return (Criteria) this;
        }

        public Criteria andSupPathCdBetween(String value1, String value2) {
            addCriterion("TM.SUP_PATH_CD between", value1, value2, "supPathCd");
            return (Criteria) this;
        }

        public Criteria andSupPathCdNotBetween(String value1, String value2) {
            addCriterion("TM.SUP_PATH_CD not between", value1, value2, "supPathCd");
            return (Criteria) this;
        }

        public Criteria andSupPathNmIsNull() {
            addCriterion("TM.SUP_PATH_NM is null");
            return (Criteria) this;
        }

        public Criteria andSupPathNmIsNotNull() {
            addCriterion("TM.SUP_PATH_NM is not null");
            return (Criteria) this;
        }

        public Criteria andSupPathNmEqualTo(String value) {
            addCriterion("TM.SUP_PATH_NM =", value, "supPathNm");
            return (Criteria) this;
        }

        public Criteria andSupPathNmNotEqualTo(String value) {
            addCriterion("TM.SUP_PATH_NM <>", value, "supPathNm");
            return (Criteria) this;
        }

        public Criteria andSupPathNmGreaterThan(String value) {
            addCriterion("TM.SUP_PATH_NM >", value, "supPathNm");
            return (Criteria) this;
        }

        public Criteria andSupPathNmGreaterThanOrEqualTo(String value) {
            addCriterion("TM.SUP_PATH_NM >=", value, "supPathNm");
            return (Criteria) this;
        }

        public Criteria andSupPathNmLessThan(String value) {
            addCriterion("TM.SUP_PATH_NM <", value, "supPathNm");
            return (Criteria) this;
        }

        public Criteria andSupPathNmLessThanOrEqualTo(String value) {
            addCriterion("TM.SUP_PATH_NM <=", value, "supPathNm");
            return (Criteria) this;
        }

        public Criteria andSupPathNmLike(String value) {
            addCriterion("TM.SUP_PATH_NM like", value, "supPathNm");
            return (Criteria) this;
        }

        public Criteria andSupPathNmNotLike(String value) {
            addCriterion("TM.SUP_PATH_NM not like", value, "supPathNm");
            return (Criteria) this;
        }

        public Criteria andSupPathNmIn(List<String> values) {
            addCriterion("TM.SUP_PATH_NM in", values, "supPathNm");
            return (Criteria) this;
        }

        public Criteria andSupPathNmNotIn(List<String> values) {
            addCriterion("TM.SUP_PATH_NM not in", values, "supPathNm");
            return (Criteria) this;
        }

        public Criteria andSupPathNmBetween(String value1, String value2) {
            addCriterion("TM.SUP_PATH_NM between", value1, value2, "supPathNm");
            return (Criteria) this;
        }

        public Criteria andSupPathNmNotBetween(String value1, String value2) {
            addCriterion("TM.SUP_PATH_NM not between", value1, value2, "supPathNm");
            return (Criteria) this;
        }

        public Criteria andSupDtIsNull() {
            addCriterion("TM.SUP_DT is null");
            return (Criteria) this;
        }

        public Criteria andSupDtIsNotNull() {
            addCriterion("TM.SUP_DT is not null");
            return (Criteria) this;
        }

        public Criteria andSupDtEqualTo(Date value) {
            addCriterionForJDBCDate("TM.SUP_DT =", value, "supDt");
            return (Criteria) this;
        }

        public Criteria andSupDtNotEqualTo(Date value) {
            addCriterionForJDBCDate("TM.SUP_DT <>", value, "supDt");
            return (Criteria) this;
        }

        public Criteria andSupDtGreaterThan(Date value) {
            addCriterionForJDBCDate("TM.SUP_DT >", value, "supDt");
            return (Criteria) this;
        }

        public Criteria andSupDtGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("TM.SUP_DT >=", value, "supDt");
            return (Criteria) this;
        }

        public Criteria andSupDtLessThan(Date value) {
            addCriterionForJDBCDate("TM.SUP_DT <", value, "supDt");
            return (Criteria) this;
        }

        public Criteria andSupDtLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("TM.SUP_DT <=", value, "supDt");
            return (Criteria) this;
        }

        public Criteria andSupDtIn(List<Date> values) {
            addCriterionForJDBCDate("TM.SUP_DT in", values, "supDt");
            return (Criteria) this;
        }

        public Criteria andSupDtNotIn(List<Date> values) {
            addCriterionForJDBCDate("TM.SUP_DT not in", values, "supDt");
            return (Criteria) this;
        }

        public Criteria andSupDtBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("TM.SUP_DT between", value1, value2, "supDt");
            return (Criteria) this;
        }

        public Criteria andSupDtNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("TM.SUP_DT not between", value1, value2, "supDt");
            return (Criteria) this;
        }

        public Criteria andMbrGrdChgDtIsNull() {
            addCriterion("TM.MBR_GRD_CHG_DT is null");
            return (Criteria) this;
        }

        public Criteria andMbrGrdChgDtIsNotNull() {
            addCriterion("TM.MBR_GRD_CHG_DT is not null");
            return (Criteria) this;
        }

        public Criteria andMbrGrdChgDtEqualTo(Date value) {
            addCriterionForJDBCDate("TM.MBR_GRD_CHG_DT =", value, "mbrGrdChgDt");
            return (Criteria) this;
        }

        public Criteria andMbrGrdChgDtNotEqualTo(Date value) {
            addCriterionForJDBCDate("TM.MBR_GRD_CHG_DT <>", value, "mbrGrdChgDt");
            return (Criteria) this;
        }

        public Criteria andMbrGrdChgDtGreaterThan(Date value) {
            addCriterionForJDBCDate("TM.MBR_GRD_CHG_DT >", value, "mbrGrdChgDt");
            return (Criteria) this;
        }

        public Criteria andMbrGrdChgDtGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("TM.MBR_GRD_CHG_DT >=", value, "mbrGrdChgDt");
            return (Criteria) this;
        }

        public Criteria andMbrGrdChgDtLessThan(Date value) {
            addCriterionForJDBCDate("TM.MBR_GRD_CHG_DT <", value, "mbrGrdChgDt");
            return (Criteria) this;
        }

        public Criteria andMbrGrdChgDtLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("TM.MBR_GRD_CHG_DT <=", value, "mbrGrdChgDt");
            return (Criteria) this;
        }

        public Criteria andMbrGrdChgDtIn(List<Date> values) {
            addCriterionForJDBCDate("TM.MBR_GRD_CHG_DT in", values, "mbrGrdChgDt");
            return (Criteria) this;
        }

        public Criteria andMbrGrdChgDtNotIn(List<Date> values) {
            addCriterionForJDBCDate("TM.MBR_GRD_CHG_DT not in", values, "mbrGrdChgDt");
            return (Criteria) this;
        }

        public Criteria andMbrGrdChgDtBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("TM.MBR_GRD_CHG_DT between", value1, value2, "mbrGrdChgDt");
            return (Criteria) this;
        }

        public Criteria andMbrGrdChgDtNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("TM.MBR_GRD_CHG_DT not between", value1, value2, "mbrGrdChgDt");
            return (Criteria) this;
        }

        public Criteria andPwModDtIsNull() {
            addCriterion("TM.PW_MOD_DT is null");
            return (Criteria) this;
        }

        public Criteria andPwModDtIsNotNull() {
            addCriterion("TM.PW_MOD_DT is not null");
            return (Criteria) this;
        }

        public Criteria andPwModDtEqualTo(Date value) {
            addCriterionForJDBCDate("TM.PW_MOD_DT =", value, "pwModDt");
            return (Criteria) this;
        }

        public Criteria andPwModDtNotEqualTo(Date value) {
            addCriterionForJDBCDate("TM.PW_MOD_DT <>", value, "pwModDt");
            return (Criteria) this;
        }

        public Criteria andPwModDtGreaterThan(Date value) {
            addCriterionForJDBCDate("TM.PW_MOD_DT >", value, "pwModDt");
            return (Criteria) this;
        }

        public Criteria andPwModDtGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("TM.PW_MOD_DT >=", value, "pwModDt");
            return (Criteria) this;
        }

        public Criteria andPwModDtLessThan(Date value) {
            addCriterionForJDBCDate("TM.PW_MOD_DT <", value, "pwModDt");
            return (Criteria) this;
        }

        public Criteria andPwModDtLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("TM.PW_MOD_DT <=", value, "pwModDt");
            return (Criteria) this;
        }

        public Criteria andPwModDtIn(List<Date> values) {
            addCriterionForJDBCDate("TM.PW_MOD_DT in", values, "pwModDt");
            return (Criteria) this;
        }

        public Criteria andPwModDtNotIn(List<Date> values) {
            addCriterionForJDBCDate("TM.PW_MOD_DT not in", values, "pwModDt");
            return (Criteria) this;
        }

        public Criteria andPwModDtBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("TM.PW_MOD_DT between", value1, value2, "pwModDt");
            return (Criteria) this;
        }

        public Criteria andPwModDtNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("TM.PW_MOD_DT not between", value1, value2, "pwModDt");
            return (Criteria) this;
        }

        public Criteria andPwModGdeDtIsNull() {
            addCriterion("TM.PW_MOD_GDE_DT is null");
            return (Criteria) this;
        }

        public Criteria andPwModGdeDtIsNotNull() {
            addCriterion("TM.PW_MOD_GDE_DT is not null");
            return (Criteria) this;
        }

        public Criteria andPwModGdeDtEqualTo(Date value) {
            addCriterionForJDBCDate("TM.PW_MOD_GDE_DT =", value, "pwModGdeDt");
            return (Criteria) this;
        }

        public Criteria andPwModGdeDtNotEqualTo(Date value) {
            addCriterionForJDBCDate("TM.PW_MOD_GDE_DT <>", value, "pwModGdeDt");
            return (Criteria) this;
        }

        public Criteria andPwModGdeDtGreaterThan(Date value) {
            addCriterionForJDBCDate("TM.PW_MOD_GDE_DT >", value, "pwModGdeDt");
            return (Criteria) this;
        }

        public Criteria andPwModGdeDtGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("TM.PW_MOD_GDE_DT >=", value, "pwModGdeDt");
            return (Criteria) this;
        }

        public Criteria andPwModGdeDtLessThan(Date value) {
            addCriterionForJDBCDate("TM.PW_MOD_GDE_DT <", value, "pwModGdeDt");
            return (Criteria) this;
        }

        public Criteria andPwModGdeDtLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("TM.PW_MOD_GDE_DT <=", value, "pwModGdeDt");
            return (Criteria) this;
        }

        public Criteria andPwModGdeDtIn(List<Date> values) {
            addCriterionForJDBCDate("TM.PW_MOD_GDE_DT in", values, "pwModGdeDt");
            return (Criteria) this;
        }

        public Criteria andPwModGdeDtNotIn(List<Date> values) {
            addCriterionForJDBCDate("TM.PW_MOD_GDE_DT not in", values, "pwModGdeDt");
            return (Criteria) this;
        }

        public Criteria andPwModGdeDtBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("TM.PW_MOD_GDE_DT between", value1, value2, "pwModGdeDt");
            return (Criteria) this;
        }

        public Criteria andPwModGdeDtNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("TM.PW_MOD_GDE_DT not between", value1, value2, "pwModGdeDt");
            return (Criteria) this;
        }

        public Criteria andLastLgnDtIsNull() {
            addCriterion("TM.LAST_LGN_DT is null");
            return (Criteria) this;
        }

        public Criteria andLastLgnDtIsNotNull() {
            addCriterion("TM.LAST_LGN_DT is not null");
            return (Criteria) this;
        }

        public Criteria andLastLgnDtEqualTo(Date value) {
            addCriterionForJDBCDate("TM.LAST_LGN_DT =", value, "lastLgnDt");
            return (Criteria) this;
        }

        public Criteria andLastLgnDtNotEqualTo(Date value) {
            addCriterionForJDBCDate("TM.LAST_LGN_DT <>", value, "lastLgnDt");
            return (Criteria) this;
        }

        public Criteria andLastLgnDtGreaterThan(Date value) {
            addCriterionForJDBCDate("TM.LAST_LGN_DT >", value, "lastLgnDt");
            return (Criteria) this;
        }

        public Criteria andLastLgnDtGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("TM.LAST_LGN_DT >=", value, "lastLgnDt");
            return (Criteria) this;
        }

        public Criteria andLastLgnDtLessThan(Date value) {
            addCriterionForJDBCDate("TM.LAST_LGN_DT <", value, "lastLgnDt");
            return (Criteria) this;
        }

        public Criteria andLastLgnDtLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("TM.LAST_LGN_DT <=", value, "lastLgnDt");
            return (Criteria) this;
        }

        public Criteria andLastLgnDtIn(List<Date> values) {
            addCriterionForJDBCDate("TM.LAST_LGN_DT in", values, "lastLgnDt");
            return (Criteria) this;
        }

        public Criteria andLastLgnDtNotIn(List<Date> values) {
            addCriterionForJDBCDate("TM.LAST_LGN_DT not in", values, "lastLgnDt");
            return (Criteria) this;
        }

        public Criteria andLastLgnDtBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("TM.LAST_LGN_DT between", value1, value2, "lastLgnDt");
            return (Criteria) this;
        }

        public Criteria andLastLgnDtNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("TM.LAST_LGN_DT not between", value1, value2, "lastLgnDt");
            return (Criteria) this;
        }

        public Criteria andLastInfoModDtIsNull() {
            addCriterion("TM.LAST_INFO_MOD_DT is null");
            return (Criteria) this;
        }

        public Criteria andLastInfoModDtIsNotNull() {
            addCriterion("TM.LAST_INFO_MOD_DT is not null");
            return (Criteria) this;
        }

        public Criteria andLastInfoModDtEqualTo(Date value) {
            addCriterionForJDBCDate("TM.LAST_INFO_MOD_DT =", value, "lastInfoModDt");
            return (Criteria) this;
        }

        public Criteria andLastInfoModDtNotEqualTo(Date value) {
            addCriterionForJDBCDate("TM.LAST_INFO_MOD_DT <>", value, "lastInfoModDt");
            return (Criteria) this;
        }

        public Criteria andLastInfoModDtGreaterThan(Date value) {
            addCriterionForJDBCDate("TM.LAST_INFO_MOD_DT >", value, "lastInfoModDt");
            return (Criteria) this;
        }

        public Criteria andLastInfoModDtGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("TM.LAST_INFO_MOD_DT >=", value, "lastInfoModDt");
            return (Criteria) this;
        }

        public Criteria andLastInfoModDtLessThan(Date value) {
            addCriterionForJDBCDate("TM.LAST_INFO_MOD_DT <", value, "lastInfoModDt");
            return (Criteria) this;
        }

        public Criteria andLastInfoModDtLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("TM.LAST_INFO_MOD_DT <=", value, "lastInfoModDt");
            return (Criteria) this;
        }

        public Criteria andLastInfoModDtIn(List<Date> values) {
            addCriterionForJDBCDate("TM.LAST_INFO_MOD_DT in", values, "lastInfoModDt");
            return (Criteria) this;
        }

        public Criteria andLastInfoModDtNotIn(List<Date> values) {
            addCriterionForJDBCDate("TM.LAST_INFO_MOD_DT not in", values, "lastInfoModDt");
            return (Criteria) this;
        }

        public Criteria andLastInfoModDtBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("TM.LAST_INFO_MOD_DT between", value1, value2, "lastInfoModDt");
            return (Criteria) this;
        }

        public Criteria andLastInfoModDtNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("TM.LAST_INFO_MOD_DT not between", value1, value2, "lastInfoModDt");
            return (Criteria) this;
        }

        public Criteria andLgnRtryCntIsNull() {
            addCriterion("TM.LGN_RTRY_CNT is null");
            return (Criteria) this;
        }

        public Criteria andLgnRtryCntIsNotNull() {
            addCriterion("TM.LGN_RTRY_CNT is not null");
            return (Criteria) this;
        }

        public Criteria andLgnRtryCntEqualTo(Integer value) {
            addCriterion("TM.LGN_RTRY_CNT =", value, "lgnRtryCnt");
            return (Criteria) this;
        }

        public Criteria andLgnRtryCntNotEqualTo(Integer value) {
            addCriterion("TM.LGN_RTRY_CNT <>", value, "lgnRtryCnt");
            return (Criteria) this;
        }

        public Criteria andLgnRtryCntGreaterThan(Integer value) {
            addCriterion("TM.LGN_RTRY_CNT >", value, "lgnRtryCnt");
            return (Criteria) this;
        }

        public Criteria andLgnRtryCntGreaterThanOrEqualTo(Integer value) {
            addCriterion("TM.LGN_RTRY_CNT >=", value, "lgnRtryCnt");
            return (Criteria) this;
        }

        public Criteria andLgnRtryCntLessThan(Integer value) {
            addCriterion("TM.LGN_RTRY_CNT <", value, "lgnRtryCnt");
            return (Criteria) this;
        }

        public Criteria andLgnRtryCntLessThanOrEqualTo(Integer value) {
            addCriterion("TM.LGN_RTRY_CNT <=", value, "lgnRtryCnt");
            return (Criteria) this;
        }

        public Criteria andLgnRtryCntIn(List<Integer> values) {
            addCriterion("TM.LGN_RTRY_CNT in", values, "lgnRtryCnt");
            return (Criteria) this;
        }

        public Criteria andLgnRtryCntNotIn(List<Integer> values) {
            addCriterion("TM.LGN_RTRY_CNT not in", values, "lgnRtryCnt");
            return (Criteria) this;
        }

        public Criteria andLgnRtryCntBetween(Integer value1, Integer value2) {
            addCriterion("TM.LGN_RTRY_CNT between", value1, value2, "lgnRtryCnt");
            return (Criteria) this;
        }

        public Criteria andLgnRtryCntNotBetween(Integer value1, Integer value2) {
            addCriterion("TM.LGN_RTRY_CNT not between", value1, value2, "lgnRtryCnt");
            return (Criteria) this;
        }

        public Criteria andAdmIdIsNull() {
            addCriterion("TM.ADM_ID is null");
            return (Criteria) this;
        }

        public Criteria andAdmIdIsNotNull() {
            addCriterion("TM.ADM_ID is not null");
            return (Criteria) this;
        }

        public Criteria andAdmIdEqualTo(String value) {
            addCriterion("TM.ADM_ID =", value, "admId");
            return (Criteria) this;
        }

        public Criteria andAdmIdNotEqualTo(String value) {
            addCriterion("TM.ADM_ID <>", value, "admId");
            return (Criteria) this;
        }

        public Criteria andAdmIdGreaterThan(String value) {
            addCriterion("TM.ADM_ID >", value, "admId");
            return (Criteria) this;
        }

        public Criteria andAdmIdGreaterThanOrEqualTo(String value) {
            addCriterion("TM.ADM_ID >=", value, "admId");
            return (Criteria) this;
        }

        public Criteria andAdmIdLessThan(String value) {
            addCriterion("TM.ADM_ID <", value, "admId");
            return (Criteria) this;
        }

        public Criteria andAdmIdLessThanOrEqualTo(String value) {
            addCriterion("TM.ADM_ID <=", value, "admId");
            return (Criteria) this;
        }

        public Criteria andAdmIdLike(String value) {
            addCriterion("TM.ADM_ID like", value, "admId");
            return (Criteria) this;
        }

        public Criteria andAdmIdNotLike(String value) {
            addCriterion("TM.ADM_ID not like", value, "admId");
            return (Criteria) this;
        }

        public Criteria andAdmIdIn(List<String> values) {
            addCriterion("TM.ADM_ID in", values, "admId");
            return (Criteria) this;
        }

        public Criteria andAdmIdNotIn(List<String> values) {
            addCriterion("TM.ADM_ID not in", values, "admId");
            return (Criteria) this;
        }

        public Criteria andAdmIdBetween(String value1, String value2) {
            addCriterion("TM.ADM_ID between", value1, value2, "admId");
            return (Criteria) this;
        }

        public Criteria andAdmIdNotBetween(String value1, String value2) {
            addCriterion("TM.ADM_ID not between", value1, value2, "admId");
            return (Criteria) this;
        }

        public Criteria andRegDtIsNull() {
            addCriterion("TM.REG_DT is null");
            return (Criteria) this;
        }

        public Criteria andRegDtIsNotNull() {
            addCriterion("TM.REG_DT is not null");
            return (Criteria) this;
        }

        public Criteria andRegDtEqualTo(Date value) {
            addCriterion("TM.REG_DT =", value, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtNotEqualTo(Date value) {
            addCriterion("TM.REG_DT <>", value, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtGreaterThan(Date value) {
            addCriterion("TM.REG_DT >", value, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtGreaterThanOrEqualTo(Date value) {
            addCriterion("TM.REG_DT >=", value, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtLessThan(Date value) {
            addCriterion("TM.REG_DT <", value, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtLessThanOrEqualTo(Date value) {
            addCriterion("TM.REG_DT <=", value, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtIn(List<Date> values) {
            addCriterion("TM.REG_DT in", values, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtNotIn(List<Date> values) {
            addCriterion("TM.REG_DT not in", values, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtBetween(Date value1, Date value2) {
            addCriterion("TM.REG_DT between", value1, value2, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtNotBetween(Date value1, Date value2) {
            addCriterion("TM.REG_DT not between", value1, value2, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegIdIsNull() {
            addCriterion("TM.REG_ID is null");
            return (Criteria) this;
        }

        public Criteria andRegIdIsNotNull() {
            addCriterion("TM.REG_ID is not null");
            return (Criteria) this;
        }

        public Criteria andRegIdEqualTo(String value) {
            addCriterion("TM.REG_ID =", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdNotEqualTo(String value) {
            addCriterion("TM.REG_ID <>", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdGreaterThan(String value) {
            addCriterion("TM.REG_ID >", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdGreaterThanOrEqualTo(String value) {
            addCriterion("TM.REG_ID >=", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdLessThan(String value) {
            addCriterion("TM.REG_ID <", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdLessThanOrEqualTo(String value) {
            addCriterion("TM.REG_ID <=", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdLike(String value) {
            addCriterion("TM.REG_ID like", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdNotLike(String value) {
            addCriterion("TM.REG_ID not like", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdIn(List<String> values) {
            addCriterion("TM.REG_ID in", values, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdNotIn(List<String> values) {
            addCriterion("TM.REG_ID not in", values, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdBetween(String value1, String value2) {
            addCriterion("TM.REG_ID between", value1, value2, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdNotBetween(String value1, String value2) {
            addCriterion("TM.REG_ID not between", value1, value2, "regId");
            return (Criteria) this;
        }

        public Criteria andModDtIsNull() {
            addCriterion("TM.MOD_DT is null");
            return (Criteria) this;
        }

        public Criteria andModDtIsNotNull() {
            addCriterion("TM.MOD_DT is not null");
            return (Criteria) this;
        }

        public Criteria andModDtEqualTo(Date value) {
            addCriterion("TM.MOD_DT =", value, "modDt");
            return (Criteria) this;
        }

        public Criteria andModDtNotEqualTo(Date value) {
            addCriterion("TM.MOD_DT <>", value, "modDt");
            return (Criteria) this;
        }

        public Criteria andModDtGreaterThan(Date value) {
            addCriterion("TM.MOD_DT >", value, "modDt");
            return (Criteria) this;
        }

        public Criteria andModDtGreaterThanOrEqualTo(Date value) {
            addCriterion("TM.MOD_DT >=", value, "modDt");
            return (Criteria) this;
        }

        public Criteria andModDtLessThan(Date value) {
            addCriterion("TM.MOD_DT <", value, "modDt");
            return (Criteria) this;
        }

        public Criteria andModDtLessThanOrEqualTo(Date value) {
            addCriterion("TM.MOD_DT <=", value, "modDt");
            return (Criteria) this;
        }

        public Criteria andModDtIn(List<Date> values) {
            addCriterion("TM.MOD_DT in", values, "modDt");
            return (Criteria) this;
        }

        public Criteria andModDtNotIn(List<Date> values) {
            addCriterion("TM.MOD_DT not in", values, "modDt");
            return (Criteria) this;
        }

        public Criteria andModDtBetween(Date value1, Date value2) {
            addCriterion("TM.MOD_DT between", value1, value2, "modDt");
            return (Criteria) this;
        }

        public Criteria andModDtNotBetween(Date value1, Date value2) {
            addCriterion("TM.MOD_DT not between", value1, value2, "modDt");
            return (Criteria) this;
        }

        public Criteria andModIdIsNull() {
            addCriterion("TM.MOD_ID is null");
            return (Criteria) this;
        }

        public Criteria andModIdIsNotNull() {
            addCriterion("TM.MOD_ID is not null");
            return (Criteria) this;
        }

        public Criteria andModIdEqualTo(String value) {
            addCriterion("TM.MOD_ID =", value, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdNotEqualTo(String value) {
            addCriterion("TM.MOD_ID <>", value, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdGreaterThan(String value) {
            addCriterion("TM.MOD_ID >", value, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdGreaterThanOrEqualTo(String value) {
            addCriterion("TM.MOD_ID >=", value, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdLessThan(String value) {
            addCriterion("TM.MOD_ID <", value, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdLessThanOrEqualTo(String value) {
            addCriterion("TM.MOD_ID <=", value, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdLike(String value) {
            addCriterion("TM.MOD_ID like", value, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdNotLike(String value) {
            addCriterion("TM.MOD_ID not like", value, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdIn(List<String> values) {
            addCriterion("TM.MOD_ID in", values, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdNotIn(List<String> values) {
            addCriterion("TM.MOD_ID not in", values, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdBetween(String value1, String value2) {
            addCriterion("TM.MOD_ID between", value1, value2, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdNotBetween(String value1, String value2) {
            addCriterion("TM.MOD_ID not between", value1, value2, "modId");
            return (Criteria) this;
        }

        public Criteria andUseYnIsNull() {
            addCriterion("TM.USE_YN is null");
            return (Criteria) this;
        }

        public Criteria andUseYnIsNotNull() {
            addCriterion("TM.USE_YN is not null");
            return (Criteria) this;
        }

        public Criteria andUseYnEqualTo(String value) {
            addCriterion("TM.USE_YN =", value, "useYn");
            return (Criteria) this;
        }

        public Criteria andUseYnNotEqualTo(String value) {
            addCriterion("TM.USE_YN <>", value, "useYn");
            return (Criteria) this;
        }

        public Criteria andUseYnGreaterThan(String value) {
            addCriterion("TM.USE_YN >", value, "useYn");
            return (Criteria) this;
        }

        public Criteria andUseYnGreaterThanOrEqualTo(String value) {
            addCriterion("TM.USE_YN >=", value, "useYn");
            return (Criteria) this;
        }

        public Criteria andUseYnLessThan(String value) {
            addCriterion("TM.USE_YN <", value, "useYn");
            return (Criteria) this;
        }

        public Criteria andUseYnLessThanOrEqualTo(String value) {
            addCriterion("TM.USE_YN <=", value, "useYn");
            return (Criteria) this;
        }

        public Criteria andUseYnLike(String value) {
            addCriterion("TM.USE_YN like", value, "useYn");
            return (Criteria) this;
        }

        public Criteria andUseYnNotLike(String value) {
            addCriterion("TM.USE_YN not like", value, "useYn");
            return (Criteria) this;
        }

        public Criteria andUseYnIn(List<String> values) {
            addCriterion("TM.USE_YN in", values, "useYn");
            return (Criteria) this;
        }

        public Criteria andUseYnNotIn(List<String> values) {
            addCriterion("TM.USE_YN not in", values, "useYn");
            return (Criteria) this;
        }

        public Criteria andUseYnBetween(String value1, String value2) {
            addCriterion("TM.USE_YN between", value1, value2, "useYn");
            return (Criteria) this;
        }

        public Criteria andUseYnNotBetween(String value1, String value2) {
            addCriterion("TM.USE_YN not between", value1, value2, "useYn");
            return (Criteria) this;
        }

        public Criteria andMbrIdLikeInsensitive(String value) {
            addCriterion("upper(TM.MBR_ID) like", value.toUpperCase(), "mbrId");
            return (Criteria) this;
        }

        public Criteria andMbrStatCdLikeInsensitive(String value) {
            addCriterion("upper(TM.MBR_STAT_CD) like", value.toUpperCase(), "mbrStatCd");
            return (Criteria) this;
        }

        public Criteria andMbrGrdCdLikeInsensitive(String value) {
            addCriterion("upper(TM.MBR_GRD_CD) like", value.toUpperCase(), "mbrGrdCd");
            return (Criteria) this;
        }

        public Criteria andMbrLgnIdLikeInsensitive(String value) {
            addCriterion("upper(TM.MBR_LGN_ID) like", value.toUpperCase(), "mbrLgnId");
            return (Criteria) this;
        }

        public Criteria andMbrNmLikeInsensitive(String value) {
            addCriterion("upper(TM.MBR_NM) like", value.toUpperCase(), "mbrNm");
            return (Criteria) this;
        }

        public Criteria andEmailLikeInsensitive(String value) {
            addCriterion("upper(TM.EMAIL) like", value.toUpperCase(), "email");
            return (Criteria) this;
        }

        public Criteria andBrthYmdLikeInsensitive(String value) {
            addCriterion("upper(TM.BRTH_YMD) like", value.toUpperCase(), "brthYmd");
            return (Criteria) this;
        }

        public Criteria andGndrCdLikeInsensitive(String value) {
            addCriterion("upper(TM.GNDR_CD) like", value.toUpperCase(), "gndrCd");
            return (Criteria) this;
        }

        public Criteria andTelNoLikeInsensitive(String value) {
            addCriterion("upper(TM.TEL_NO) like", value.toUpperCase(), "telNo");
            return (Criteria) this;
        }

        public Criteria andCpCarrCdLikeInsensitive(String value) {
            addCriterion("upper(TM.CP_CARR_CD) like", value.toUpperCase(), "cpCarrCd");
            return (Criteria) this;
        }

        public Criteria andCpNoLikeInsensitive(String value) {
            addCriterion("upper(TM.CP_NO) like", value.toUpperCase(), "cpNo");
            return (Criteria) this;
        }

        public Criteria andIdvrfYnLikeInsensitive(String value) {
            addCriterion("upper(TM.IDVRF_YN) like", value.toUpperCase(), "idvrfYn");
            return (Criteria) this;
        }

        public Criteria andIdvrfTpCdLikeInsensitive(String value) {
            addCriterion("upper(TM.IDVRF_TP_CD) like", value.toUpperCase(), "idvrfTpCd");
            return (Criteria) this;
        }

        public Criteria andCiValLikeInsensitive(String value) {
            addCriterion("upper(TM.CI_VAL) like", value.toUpperCase(), "ciVal");
            return (Criteria) this;
        }

        public Criteria andDiValLikeInsensitive(String value) {
            addCriterion("upper(TM.DI_VAL) like", value.toUpperCase(), "diVal");
            return (Criteria) this;
        }

        public Criteria andBadMbrYnLikeInsensitive(String value) {
            addCriterion("upper(TM.BAD_MBR_YN) like", value.toUpperCase(), "badMbrYn");
            return (Criteria) this;
        }

        public Criteria andRcmndeCdLikeInsensitive(String value) {
            addCriterion("upper(TM.RCMNDE_CD) like", value.toUpperCase(), "rcmndeCd");
            return (Criteria) this;
        }

        public Criteria andSupPathClCdLikeInsensitive(String value) {
            addCriterion("upper(TM.SUP_PATH_CL_CD) like", value.toUpperCase(), "supPathClCd");
            return (Criteria) this;
        }

        public Criteria andSupPathCdLikeInsensitive(String value) {
            addCriterion("upper(TM.SUP_PATH_CD) like", value.toUpperCase(), "supPathCd");
            return (Criteria) this;
        }

        public Criteria andSupPathNmLikeInsensitive(String value) {
            addCriterion("upper(TM.SUP_PATH_NM) like", value.toUpperCase(), "supPathNm");
            return (Criteria) this;
        }

        public Criteria andAdmIdLikeInsensitive(String value) {
            addCriterion("upper(TM.ADM_ID) like", value.toUpperCase(), "admId");
            return (Criteria) this;
        }

        public Criteria andRegIdLikeInsensitive(String value) {
            addCriterion("upper(TM.REG_ID) like", value.toUpperCase(), "regId");
            return (Criteria) this;
        }

        public Criteria andModIdLikeInsensitive(String value) {
            addCriterion("upper(TM.MOD_ID) like", value.toUpperCase(), "modId");
            return (Criteria) this;
        }

        public Criteria andUseYnLikeInsensitive(String value) {
            addCriterion("upper(TM.USE_YN) like", value.toUpperCase(), "useYn");
            return (Criteria) this;
        }

        public Criteria andMbrIdLikeLeft(String value) {
            addCriterion("TM.MBR_ID like ", "%" + value, "mbrId");
            return (Criteria) this;
        }

        public Criteria andMbrIdLikeRight(String value) {
            addCriterion("TM.MBR_ID like ", value + "%", "mbrId");
            return (Criteria) this;
        }

        public Criteria andMbrIdLikeBoth(String value) {
            addCriterion("TM.MBR_ID like ", "%" + value + "%", "mbrId");
            return (Criteria) this;
        }

        public Criteria andMbrStatCdLikeLeft(String value) {
            addCriterion("TM.MBR_STAT_CD like ", "%" + value, "mbrStatCd");
            return (Criteria) this;
        }

        public Criteria andMbrStatCdLikeRight(String value) {
            addCriterion("TM.MBR_STAT_CD like ", value + "%", "mbrStatCd");
            return (Criteria) this;
        }

        public Criteria andMbrStatCdLikeBoth(String value) {
            addCriterion("TM.MBR_STAT_CD like ", "%" + value + "%", "mbrStatCd");
            return (Criteria) this;
        }

        public Criteria andMbrGrdCdLikeLeft(String value) {
            addCriterion("TM.MBR_GRD_CD like ", "%" + value, "mbrGrdCd");
            return (Criteria) this;
        }

        public Criteria andMbrGrdCdLikeRight(String value) {
            addCriterion("TM.MBR_GRD_CD like ", value + "%", "mbrGrdCd");
            return (Criteria) this;
        }

        public Criteria andMbrGrdCdLikeBoth(String value) {
            addCriterion("TM.MBR_GRD_CD like ", "%" + value + "%", "mbrGrdCd");
            return (Criteria) this;
        }

        public Criteria andMbrLgnIdLikeLeft(String value) {
            addCriterion("TM.MBR_LGN_ID like ", "%" + value, "mbrLgnId");
            return (Criteria) this;
        }

        public Criteria andMbrLgnIdLikeRight(String value) {
            addCriterion("TM.MBR_LGN_ID like ", value + "%", "mbrLgnId");
            return (Criteria) this;
        }

        public Criteria andMbrLgnIdLikeBoth(String value) {
            addCriterion("TM.MBR_LGN_ID like ", "%" + value + "%", "mbrLgnId");
            return (Criteria) this;
        }

        public Criteria andMbrNmLikeLeft(String value) {
            addCriterion("TM.MBR_NM like ", "%" + value, "mbrNm");
            return (Criteria) this;
        }

        public Criteria andMbrNmLikeRight(String value) {
            addCriterion("TM.MBR_NM like ", value + "%", "mbrNm");
            return (Criteria) this;
        }

        public Criteria andMbrNmLikeBoth(String value) {
            addCriterion("TM.MBR_NM like ", "%" + value + "%", "mbrNm");
            return (Criteria) this;
        }

        public Criteria andEmailLikeLeft(String value) {
            addCriterion("TM.EMAIL like ", "%" + value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLikeRight(String value) {
            addCriterion("TM.EMAIL like ", value + "%", "email");
            return (Criteria) this;
        }

        public Criteria andEmailLikeBoth(String value) {
            addCriterion("TM.EMAIL like ", "%" + value + "%", "email");
            return (Criteria) this;
        }

        public Criteria andBrthYmdLikeLeft(String value) {
            addCriterion("TM.BRTH_YMD like ", "%" + value, "brthYmd");
            return (Criteria) this;
        }

        public Criteria andBrthYmdLikeRight(String value) {
            addCriterion("TM.BRTH_YMD like ", value + "%", "brthYmd");
            return (Criteria) this;
        }

        public Criteria andBrthYmdLikeBoth(String value) {
            addCriterion("TM.BRTH_YMD like ", "%" + value + "%", "brthYmd");
            return (Criteria) this;
        }

        public Criteria andGndrCdLikeLeft(String value) {
            addCriterion("TM.GNDR_CD like ", "%" + value, "gndrCd");
            return (Criteria) this;
        }

        public Criteria andGndrCdLikeRight(String value) {
            addCriterion("TM.GNDR_CD like ", value + "%", "gndrCd");
            return (Criteria) this;
        }

        public Criteria andGndrCdLikeBoth(String value) {
            addCriterion("TM.GNDR_CD like ", "%" + value + "%", "gndrCd");
            return (Criteria) this;
        }

        public Criteria andTelNoLikeLeft(String value) {
            addCriterion("TM.TEL_NO like ", "%" + value, "telNo");
            return (Criteria) this;
        }

        public Criteria andTelNoLikeRight(String value) {
            addCriterion("TM.TEL_NO like ", value + "%", "telNo");
            return (Criteria) this;
        }

        public Criteria andTelNoLikeBoth(String value) {
            addCriterion("TM.TEL_NO like ", "%" + value + "%", "telNo");
            return (Criteria) this;
        }

        public Criteria andCpCarrCdLikeLeft(String value) {
            addCriterion("TM.CP_CARR_CD like ", "%" + value, "cpCarrCd");
            return (Criteria) this;
        }

        public Criteria andCpCarrCdLikeRight(String value) {
            addCriterion("TM.CP_CARR_CD like ", value + "%", "cpCarrCd");
            return (Criteria) this;
        }

        public Criteria andCpCarrCdLikeBoth(String value) {
            addCriterion("TM.CP_CARR_CD like ", "%" + value + "%", "cpCarrCd");
            return (Criteria) this;
        }

        public Criteria andCpNoLikeLeft(String value) {
            addCriterion("TM.CP_NO like ", "%" + value, "cpNo");
            return (Criteria) this;
        }

        public Criteria andCpNoLikeRight(String value) {
            addCriterion("TM.CP_NO like ", value + "%", "cpNo");
            return (Criteria) this;
        }

        public Criteria andCpNoLikeBoth(String value) {
            addCriterion("TM.CP_NO like ", "%" + value + "%", "cpNo");
            return (Criteria) this;
        }

        public Criteria andIdvrfYnLikeLeft(String value) {
            addCriterion("TM.IDVRF_YN like ", "%" + value, "idvrfYn");
            return (Criteria) this;
        }

        public Criteria andIdvrfYnLikeRight(String value) {
            addCriterion("TM.IDVRF_YN like ", value + "%", "idvrfYn");
            return (Criteria) this;
        }

        public Criteria andIdvrfYnLikeBoth(String value) {
            addCriterion("TM.IDVRF_YN like ", "%" + value + "%", "idvrfYn");
            return (Criteria) this;
        }

        public Criteria andIdvrfTpCdLikeLeft(String value) {
            addCriterion("TM.IDVRF_TP_CD like ", "%" + value, "idvrfTpCd");
            return (Criteria) this;
        }

        public Criteria andIdvrfTpCdLikeRight(String value) {
            addCriterion("TM.IDVRF_TP_CD like ", value + "%", "idvrfTpCd");
            return (Criteria) this;
        }

        public Criteria andIdvrfTpCdLikeBoth(String value) {
            addCriterion("TM.IDVRF_TP_CD like ", "%" + value + "%", "idvrfTpCd");
            return (Criteria) this;
        }

        public Criteria andCiValLikeLeft(String value) {
            addCriterion("TM.CI_VAL like ", "%" + value, "ciVal");
            return (Criteria) this;
        }

        public Criteria andCiValLikeRight(String value) {
            addCriterion("TM.CI_VAL like ", value + "%", "ciVal");
            return (Criteria) this;
        }

        public Criteria andCiValLikeBoth(String value) {
            addCriterion("TM.CI_VAL like ", "%" + value + "%", "ciVal");
            return (Criteria) this;
        }

        public Criteria andDiValLikeLeft(String value) {
            addCriterion("TM.DI_VAL like ", "%" + value, "diVal");
            return (Criteria) this;
        }

        public Criteria andDiValLikeRight(String value) {
            addCriterion("TM.DI_VAL like ", value + "%", "diVal");
            return (Criteria) this;
        }

        public Criteria andDiValLikeBoth(String value) {
            addCriterion("TM.DI_VAL like ", "%" + value + "%", "diVal");
            return (Criteria) this;
        }

        public Criteria andBadMbrYnLikeLeft(String value) {
            addCriterion("TM.BAD_MBR_YN like ", "%" + value, "badMbrYn");
            return (Criteria) this;
        }

        public Criteria andBadMbrYnLikeRight(String value) {
            addCriterion("TM.BAD_MBR_YN like ", value + "%", "badMbrYn");
            return (Criteria) this;
        }

        public Criteria andBadMbrYnLikeBoth(String value) {
            addCriterion("TM.BAD_MBR_YN like ", "%" + value + "%", "badMbrYn");
            return (Criteria) this;
        }

        public Criteria andRcmndeCdLikeLeft(String value) {
            addCriterion("TM.RCMNDE_CD like ", "%" + value, "rcmndeCd");
            return (Criteria) this;
        }

        public Criteria andRcmndeCdLikeRight(String value) {
            addCriterion("TM.RCMNDE_CD like ", value + "%", "rcmndeCd");
            return (Criteria) this;
        }

        public Criteria andRcmndeCdLikeBoth(String value) {
            addCriterion("TM.RCMNDE_CD like ", "%" + value + "%", "rcmndeCd");
            return (Criteria) this;
        }

        public Criteria andSupPathClCdLikeLeft(String value) {
            addCriterion("TM.SUP_PATH_CL_CD like ", "%" + value, "supPathClCd");
            return (Criteria) this;
        }

        public Criteria andSupPathClCdLikeRight(String value) {
            addCriterion("TM.SUP_PATH_CL_CD like ", value + "%", "supPathClCd");
            return (Criteria) this;
        }

        public Criteria andSupPathClCdLikeBoth(String value) {
            addCriterion("TM.SUP_PATH_CL_CD like ", "%" + value + "%", "supPathClCd");
            return (Criteria) this;
        }

        public Criteria andSupPathCdLikeLeft(String value) {
            addCriterion("TM.SUP_PATH_CD like ", "%" + value, "supPathCd");
            return (Criteria) this;
        }

        public Criteria andSupPathCdLikeRight(String value) {
            addCriterion("TM.SUP_PATH_CD like ", value + "%", "supPathCd");
            return (Criteria) this;
        }

        public Criteria andSupPathCdLikeBoth(String value) {
            addCriterion("TM.SUP_PATH_CD like ", "%" + value + "%", "supPathCd");
            return (Criteria) this;
        }

        public Criteria andSupPathNmLikeLeft(String value) {
            addCriterion("TM.SUP_PATH_NM like ", "%" + value, "supPathNm");
            return (Criteria) this;
        }

        public Criteria andSupPathNmLikeRight(String value) {
            addCriterion("TM.SUP_PATH_NM like ", value + "%", "supPathNm");
            return (Criteria) this;
        }

        public Criteria andSupPathNmLikeBoth(String value) {
            addCriterion("TM.SUP_PATH_NM like ", "%" + value + "%", "supPathNm");
            return (Criteria) this;
        }

        public Criteria andAdmIdLikeLeft(String value) {
            addCriterion("TM.ADM_ID like ", "%" + value, "admId");
            return (Criteria) this;
        }

        public Criteria andAdmIdLikeRight(String value) {
            addCriterion("TM.ADM_ID like ", value + "%", "admId");
            return (Criteria) this;
        }

        public Criteria andAdmIdLikeBoth(String value) {
            addCriterion("TM.ADM_ID like ", "%" + value + "%", "admId");
            return (Criteria) this;
        }

        public Criteria andRegIdLikeLeft(String value) {
            addCriterion("TM.REG_ID like ", "%" + value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdLikeRight(String value) {
            addCriterion("TM.REG_ID like ", value + "%", "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdLikeBoth(String value) {
            addCriterion("TM.REG_ID like ", "%" + value + "%", "regId");
            return (Criteria) this;
        }

        public Criteria andModIdLikeLeft(String value) {
            addCriterion("TM.MOD_ID like ", "%" + value, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdLikeRight(String value) {
            addCriterion("TM.MOD_ID like ", value + "%", "modId");
            return (Criteria) this;
        }

        public Criteria andModIdLikeBoth(String value) {
            addCriterion("TM.MOD_ID like ", "%" + value + "%", "modId");
            return (Criteria) this;
        }

        public Criteria andUseYnLikeLeft(String value) {
            addCriterion("TM.USE_YN like ", "%" + value, "useYn");
            return (Criteria) this;
        }

        public Criteria andUseYnLikeRight(String value) {
            addCriterion("TM.USE_YN like ", value + "%", "useYn");
            return (Criteria) this;
        }

        public Criteria andUseYnLikeBoth(String value) {
            addCriterion("TM.USE_YN like ", "%" + value + "%", "useYn");
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