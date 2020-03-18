package com.mushbird.sinsege.base.module.system.model.entity.criteria;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SiteEntityCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    public SiteEntityCriteria() {
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

        public Criteria andSiteIdIsNull() {
            addCriterion("TS.SITE_ID is null");
            return (Criteria) this;
        }

        public Criteria andSiteIdIsNotNull() {
            addCriterion("TS.SITE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andSiteIdEqualTo(String value) {
            addCriterion("TS.SITE_ID =", value, "siteId");
            return (Criteria) this;
        }

        public Criteria andSiteIdNotEqualTo(String value) {
            addCriterion("TS.SITE_ID <>", value, "siteId");
            return (Criteria) this;
        }

        public Criteria andSiteIdGreaterThan(String value) {
            addCriterion("TS.SITE_ID >", value, "siteId");
            return (Criteria) this;
        }

        public Criteria andSiteIdGreaterThanOrEqualTo(String value) {
            addCriterion("TS.SITE_ID >=", value, "siteId");
            return (Criteria) this;
        }

        public Criteria andSiteIdLessThan(String value) {
            addCriterion("TS.SITE_ID <", value, "siteId");
            return (Criteria) this;
        }

        public Criteria andSiteIdLessThanOrEqualTo(String value) {
            addCriterion("TS.SITE_ID <=", value, "siteId");
            return (Criteria) this;
        }

        public Criteria andSiteIdLike(String value) {
            addCriterion("TS.SITE_ID like", value, "siteId");
            return (Criteria) this;
        }

        public Criteria andSiteIdNotLike(String value) {
            addCriterion("TS.SITE_ID not like", value, "siteId");
            return (Criteria) this;
        }

        public Criteria andSiteIdIn(List<String> values) {
            addCriterion("TS.SITE_ID in", values, "siteId");
            return (Criteria) this;
        }

        public Criteria andSiteIdNotIn(List<String> values) {
            addCriterion("TS.SITE_ID not in", values, "siteId");
            return (Criteria) this;
        }

        public Criteria andSiteIdBetween(String value1, String value2) {
            addCriterion("TS.SITE_ID between", value1, value2, "siteId");
            return (Criteria) this;
        }

        public Criteria andSiteIdNotBetween(String value1, String value2) {
            addCriterion("TS.SITE_ID not between", value1, value2, "siteId");
            return (Criteria) this;
        }

        public Criteria andBizNmIsNull() {
            addCriterion("TS.BIZ_NM is null");
            return (Criteria) this;
        }

        public Criteria andBizNmIsNotNull() {
            addCriterion("TS.BIZ_NM is not null");
            return (Criteria) this;
        }

        public Criteria andBizNmEqualTo(String value) {
            addCriterion("TS.BIZ_NM =", value, "bizNm");
            return (Criteria) this;
        }

        public Criteria andBizNmNotEqualTo(String value) {
            addCriterion("TS.BIZ_NM <>", value, "bizNm");
            return (Criteria) this;
        }

        public Criteria andBizNmGreaterThan(String value) {
            addCriterion("TS.BIZ_NM >", value, "bizNm");
            return (Criteria) this;
        }

        public Criteria andBizNmGreaterThanOrEqualTo(String value) {
            addCriterion("TS.BIZ_NM >=", value, "bizNm");
            return (Criteria) this;
        }

        public Criteria andBizNmLessThan(String value) {
            addCriterion("TS.BIZ_NM <", value, "bizNm");
            return (Criteria) this;
        }

        public Criteria andBizNmLessThanOrEqualTo(String value) {
            addCriterion("TS.BIZ_NM <=", value, "bizNm");
            return (Criteria) this;
        }

        public Criteria andBizNmLike(String value) {
            addCriterion("TS.BIZ_NM like", value, "bizNm");
            return (Criteria) this;
        }

        public Criteria andBizNmNotLike(String value) {
            addCriterion("TS.BIZ_NM not like", value, "bizNm");
            return (Criteria) this;
        }

        public Criteria andBizNmIn(List<String> values) {
            addCriterion("TS.BIZ_NM in", values, "bizNm");
            return (Criteria) this;
        }

        public Criteria andBizNmNotIn(List<String> values) {
            addCriterion("TS.BIZ_NM not in", values, "bizNm");
            return (Criteria) this;
        }

        public Criteria andBizNmBetween(String value1, String value2) {
            addCriterion("TS.BIZ_NM between", value1, value2, "bizNm");
            return (Criteria) this;
        }

        public Criteria andBizNmNotBetween(String value1, String value2) {
            addCriterion("TS.BIZ_NM not between", value1, value2, "bizNm");
            return (Criteria) this;
        }

        public Criteria andRepNmIsNull() {
            addCriterion("TS.REP_NM is null");
            return (Criteria) this;
        }

        public Criteria andRepNmIsNotNull() {
            addCriterion("TS.REP_NM is not null");
            return (Criteria) this;
        }

        public Criteria andRepNmEqualTo(String value) {
            addCriterion("TS.REP_NM =", value, "repNm");
            return (Criteria) this;
        }

        public Criteria andRepNmNotEqualTo(String value) {
            addCriterion("TS.REP_NM <>", value, "repNm");
            return (Criteria) this;
        }

        public Criteria andRepNmGreaterThan(String value) {
            addCriterion("TS.REP_NM >", value, "repNm");
            return (Criteria) this;
        }

        public Criteria andRepNmGreaterThanOrEqualTo(String value) {
            addCriterion("TS.REP_NM >=", value, "repNm");
            return (Criteria) this;
        }

        public Criteria andRepNmLessThan(String value) {
            addCriterion("TS.REP_NM <", value, "repNm");
            return (Criteria) this;
        }

        public Criteria andRepNmLessThanOrEqualTo(String value) {
            addCriterion("TS.REP_NM <=", value, "repNm");
            return (Criteria) this;
        }

        public Criteria andRepNmLike(String value) {
            addCriterion("TS.REP_NM like", value, "repNm");
            return (Criteria) this;
        }

        public Criteria andRepNmNotLike(String value) {
            addCriterion("TS.REP_NM not like", value, "repNm");
            return (Criteria) this;
        }

        public Criteria andRepNmIn(List<String> values) {
            addCriterion("TS.REP_NM in", values, "repNm");
            return (Criteria) this;
        }

        public Criteria andRepNmNotIn(List<String> values) {
            addCriterion("TS.REP_NM not in", values, "repNm");
            return (Criteria) this;
        }

        public Criteria andRepNmBetween(String value1, String value2) {
            addCriterion("TS.REP_NM between", value1, value2, "repNm");
            return (Criteria) this;
        }

        public Criteria andRepNmNotBetween(String value1, String value2) {
            addCriterion("TS.REP_NM not between", value1, value2, "repNm");
            return (Criteria) this;
        }

        public Criteria andRepTelIsNull() {
            addCriterion("TS.REP_TEL is null");
            return (Criteria) this;
        }

        public Criteria andRepTelIsNotNull() {
            addCriterion("TS.REP_TEL is not null");
            return (Criteria) this;
        }

        public Criteria andRepTelEqualTo(String value) {
            addCriterion("TS.REP_TEL =", value, "repTel");
            return (Criteria) this;
        }

        public Criteria andRepTelNotEqualTo(String value) {
            addCriterion("TS.REP_TEL <>", value, "repTel");
            return (Criteria) this;
        }

        public Criteria andRepTelGreaterThan(String value) {
            addCriterion("TS.REP_TEL >", value, "repTel");
            return (Criteria) this;
        }

        public Criteria andRepTelGreaterThanOrEqualTo(String value) {
            addCriterion("TS.REP_TEL >=", value, "repTel");
            return (Criteria) this;
        }

        public Criteria andRepTelLessThan(String value) {
            addCriterion("TS.REP_TEL <", value, "repTel");
            return (Criteria) this;
        }

        public Criteria andRepTelLessThanOrEqualTo(String value) {
            addCriterion("TS.REP_TEL <=", value, "repTel");
            return (Criteria) this;
        }

        public Criteria andRepTelLike(String value) {
            addCriterion("TS.REP_TEL like", value, "repTel");
            return (Criteria) this;
        }

        public Criteria andRepTelNotLike(String value) {
            addCriterion("TS.REP_TEL not like", value, "repTel");
            return (Criteria) this;
        }

        public Criteria andRepTelIn(List<String> values) {
            addCriterion("TS.REP_TEL in", values, "repTel");
            return (Criteria) this;
        }

        public Criteria andRepTelNotIn(List<String> values) {
            addCriterion("TS.REP_TEL not in", values, "repTel");
            return (Criteria) this;
        }

        public Criteria andRepTelBetween(String value1, String value2) {
            addCriterion("TS.REP_TEL between", value1, value2, "repTel");
            return (Criteria) this;
        }

        public Criteria andRepTelNotBetween(String value1, String value2) {
            addCriterion("TS.REP_TEL not between", value1, value2, "repTel");
            return (Criteria) this;
        }

        public Criteria andFaxNoIsNull() {
            addCriterion("TS.FAX_NO is null");
            return (Criteria) this;
        }

        public Criteria andFaxNoIsNotNull() {
            addCriterion("TS.FAX_NO is not null");
            return (Criteria) this;
        }

        public Criteria andFaxNoEqualTo(String value) {
            addCriterion("TS.FAX_NO =", value, "faxNo");
            return (Criteria) this;
        }

        public Criteria andFaxNoNotEqualTo(String value) {
            addCriterion("TS.FAX_NO <>", value, "faxNo");
            return (Criteria) this;
        }

        public Criteria andFaxNoGreaterThan(String value) {
            addCriterion("TS.FAX_NO >", value, "faxNo");
            return (Criteria) this;
        }

        public Criteria andFaxNoGreaterThanOrEqualTo(String value) {
            addCriterion("TS.FAX_NO >=", value, "faxNo");
            return (Criteria) this;
        }

        public Criteria andFaxNoLessThan(String value) {
            addCriterion("TS.FAX_NO <", value, "faxNo");
            return (Criteria) this;
        }

        public Criteria andFaxNoLessThanOrEqualTo(String value) {
            addCriterion("TS.FAX_NO <=", value, "faxNo");
            return (Criteria) this;
        }

        public Criteria andFaxNoLike(String value) {
            addCriterion("TS.FAX_NO like", value, "faxNo");
            return (Criteria) this;
        }

        public Criteria andFaxNoNotLike(String value) {
            addCriterion("TS.FAX_NO not like", value, "faxNo");
            return (Criteria) this;
        }

        public Criteria andFaxNoIn(List<String> values) {
            addCriterion("TS.FAX_NO in", values, "faxNo");
            return (Criteria) this;
        }

        public Criteria andFaxNoNotIn(List<String> values) {
            addCriterion("TS.FAX_NO not in", values, "faxNo");
            return (Criteria) this;
        }

        public Criteria andFaxNoBetween(String value1, String value2) {
            addCriterion("TS.FAX_NO between", value1, value2, "faxNo");
            return (Criteria) this;
        }

        public Criteria andFaxNoNotBetween(String value1, String value2) {
            addCriterion("TS.FAX_NO not between", value1, value2, "faxNo");
            return (Criteria) this;
        }

        public Criteria andBizNoIsNull() {
            addCriterion("TS.BIZ_NO is null");
            return (Criteria) this;
        }

        public Criteria andBizNoIsNotNull() {
            addCriterion("TS.BIZ_NO is not null");
            return (Criteria) this;
        }

        public Criteria andBizNoEqualTo(String value) {
            addCriterion("TS.BIZ_NO =", value, "bizNo");
            return (Criteria) this;
        }

        public Criteria andBizNoNotEqualTo(String value) {
            addCriterion("TS.BIZ_NO <>", value, "bizNo");
            return (Criteria) this;
        }

        public Criteria andBizNoGreaterThan(String value) {
            addCriterion("TS.BIZ_NO >", value, "bizNo");
            return (Criteria) this;
        }

        public Criteria andBizNoGreaterThanOrEqualTo(String value) {
            addCriterion("TS.BIZ_NO >=", value, "bizNo");
            return (Criteria) this;
        }

        public Criteria andBizNoLessThan(String value) {
            addCriterion("TS.BIZ_NO <", value, "bizNo");
            return (Criteria) this;
        }

        public Criteria andBizNoLessThanOrEqualTo(String value) {
            addCriterion("TS.BIZ_NO <=", value, "bizNo");
            return (Criteria) this;
        }

        public Criteria andBizNoLike(String value) {
            addCriterion("TS.BIZ_NO like", value, "bizNo");
            return (Criteria) this;
        }

        public Criteria andBizNoNotLike(String value) {
            addCriterion("TS.BIZ_NO not like", value, "bizNo");
            return (Criteria) this;
        }

        public Criteria andBizNoIn(List<String> values) {
            addCriterion("TS.BIZ_NO in", values, "bizNo");
            return (Criteria) this;
        }

        public Criteria andBizNoNotIn(List<String> values) {
            addCriterion("TS.BIZ_NO not in", values, "bizNo");
            return (Criteria) this;
        }

        public Criteria andBizNoBetween(String value1, String value2) {
            addCriterion("TS.BIZ_NO between", value1, value2, "bizNo");
            return (Criteria) this;
        }

        public Criteria andBizNoNotBetween(String value1, String value2) {
            addCriterion("TS.BIZ_NO not between", value1, value2, "bizNo");
            return (Criteria) this;
        }

        public Criteria andBizLocAddrIsNull() {
            addCriterion("TS.BIZ_LOC_ADDR is null");
            return (Criteria) this;
        }

        public Criteria andBizLocAddrIsNotNull() {
            addCriterion("TS.BIZ_LOC_ADDR is not null");
            return (Criteria) this;
        }

        public Criteria andBizLocAddrEqualTo(String value) {
            addCriterion("TS.BIZ_LOC_ADDR =", value, "bizLocAddr");
            return (Criteria) this;
        }

        public Criteria andBizLocAddrNotEqualTo(String value) {
            addCriterion("TS.BIZ_LOC_ADDR <>", value, "bizLocAddr");
            return (Criteria) this;
        }

        public Criteria andBizLocAddrGreaterThan(String value) {
            addCriterion("TS.BIZ_LOC_ADDR >", value, "bizLocAddr");
            return (Criteria) this;
        }

        public Criteria andBizLocAddrGreaterThanOrEqualTo(String value) {
            addCriterion("TS.BIZ_LOC_ADDR >=", value, "bizLocAddr");
            return (Criteria) this;
        }

        public Criteria andBizLocAddrLessThan(String value) {
            addCriterion("TS.BIZ_LOC_ADDR <", value, "bizLocAddr");
            return (Criteria) this;
        }

        public Criteria andBizLocAddrLessThanOrEqualTo(String value) {
            addCriterion("TS.BIZ_LOC_ADDR <=", value, "bizLocAddr");
            return (Criteria) this;
        }

        public Criteria andBizLocAddrLike(String value) {
            addCriterion("TS.BIZ_LOC_ADDR like", value, "bizLocAddr");
            return (Criteria) this;
        }

        public Criteria andBizLocAddrNotLike(String value) {
            addCriterion("TS.BIZ_LOC_ADDR not like", value, "bizLocAddr");
            return (Criteria) this;
        }

        public Criteria andBizLocAddrIn(List<String> values) {
            addCriterion("TS.BIZ_LOC_ADDR in", values, "bizLocAddr");
            return (Criteria) this;
        }

        public Criteria andBizLocAddrNotIn(List<String> values) {
            addCriterion("TS.BIZ_LOC_ADDR not in", values, "bizLocAddr");
            return (Criteria) this;
        }

        public Criteria andBizLocAddrBetween(String value1, String value2) {
            addCriterion("TS.BIZ_LOC_ADDR between", value1, value2, "bizLocAddr");
            return (Criteria) this;
        }

        public Criteria andBizLocAddrNotBetween(String value1, String value2) {
            addCriterion("TS.BIZ_LOC_ADDR not between", value1, value2, "bizLocAddr");
            return (Criteria) this;
        }

        public Criteria andCisoNmIsNull() {
            addCriterion("TS.CISO_NM is null");
            return (Criteria) this;
        }

        public Criteria andCisoNmIsNotNull() {
            addCriterion("TS.CISO_NM is not null");
            return (Criteria) this;
        }

        public Criteria andCisoNmEqualTo(String value) {
            addCriterion("TS.CISO_NM =", value, "cisoNm");
            return (Criteria) this;
        }

        public Criteria andCisoNmNotEqualTo(String value) {
            addCriterion("TS.CISO_NM <>", value, "cisoNm");
            return (Criteria) this;
        }

        public Criteria andCisoNmGreaterThan(String value) {
            addCriterion("TS.CISO_NM >", value, "cisoNm");
            return (Criteria) this;
        }

        public Criteria andCisoNmGreaterThanOrEqualTo(String value) {
            addCriterion("TS.CISO_NM >=", value, "cisoNm");
            return (Criteria) this;
        }

        public Criteria andCisoNmLessThan(String value) {
            addCriterion("TS.CISO_NM <", value, "cisoNm");
            return (Criteria) this;
        }

        public Criteria andCisoNmLessThanOrEqualTo(String value) {
            addCriterion("TS.CISO_NM <=", value, "cisoNm");
            return (Criteria) this;
        }

        public Criteria andCisoNmLike(String value) {
            addCriterion("TS.CISO_NM like", value, "cisoNm");
            return (Criteria) this;
        }

        public Criteria andCisoNmNotLike(String value) {
            addCriterion("TS.CISO_NM not like", value, "cisoNm");
            return (Criteria) this;
        }

        public Criteria andCisoNmIn(List<String> values) {
            addCriterion("TS.CISO_NM in", values, "cisoNm");
            return (Criteria) this;
        }

        public Criteria andCisoNmNotIn(List<String> values) {
            addCriterion("TS.CISO_NM not in", values, "cisoNm");
            return (Criteria) this;
        }

        public Criteria andCisoNmBetween(String value1, String value2) {
            addCriterion("TS.CISO_NM between", value1, value2, "cisoNm");
            return (Criteria) this;
        }

        public Criteria andCisoNmNotBetween(String value1, String value2) {
            addCriterion("TS.CISO_NM not between", value1, value2, "cisoNm");
            return (Criteria) this;
        }

        public Criteria andEmailIsNull() {
            addCriterion("TS.EMAIL is null");
            return (Criteria) this;
        }

        public Criteria andEmailIsNotNull() {
            addCriterion("TS.EMAIL is not null");
            return (Criteria) this;
        }

        public Criteria andEmailEqualTo(String value) {
            addCriterion("TS.EMAIL =", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotEqualTo(String value) {
            addCriterion("TS.EMAIL <>", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThan(String value) {
            addCriterion("TS.EMAIL >", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThanOrEqualTo(String value) {
            addCriterion("TS.EMAIL >=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThan(String value) {
            addCriterion("TS.EMAIL <", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThanOrEqualTo(String value) {
            addCriterion("TS.EMAIL <=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLike(String value) {
            addCriterion("TS.EMAIL like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotLike(String value) {
            addCriterion("TS.EMAIL not like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailIn(List<String> values) {
            addCriterion("TS.EMAIL in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotIn(List<String> values) {
            addCriterion("TS.EMAIL not in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailBetween(String value1, String value2) {
            addCriterion("TS.EMAIL between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotBetween(String value1, String value2) {
            addCriterion("TS.EMAIL not between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andCsoTelNoIsNull() {
            addCriterion("TS.CSO_TEL_NO is null");
            return (Criteria) this;
        }

        public Criteria andCsoTelNoIsNotNull() {
            addCriterion("TS.CSO_TEL_NO is not null");
            return (Criteria) this;
        }

        public Criteria andCsoTelNoEqualTo(String value) {
            addCriterion("TS.CSO_TEL_NO =", value, "csoTelNo");
            return (Criteria) this;
        }

        public Criteria andCsoTelNoNotEqualTo(String value) {
            addCriterion("TS.CSO_TEL_NO <>", value, "csoTelNo");
            return (Criteria) this;
        }

        public Criteria andCsoTelNoGreaterThan(String value) {
            addCriterion("TS.CSO_TEL_NO >", value, "csoTelNo");
            return (Criteria) this;
        }

        public Criteria andCsoTelNoGreaterThanOrEqualTo(String value) {
            addCriterion("TS.CSO_TEL_NO >=", value, "csoTelNo");
            return (Criteria) this;
        }

        public Criteria andCsoTelNoLessThan(String value) {
            addCriterion("TS.CSO_TEL_NO <", value, "csoTelNo");
            return (Criteria) this;
        }

        public Criteria andCsoTelNoLessThanOrEqualTo(String value) {
            addCriterion("TS.CSO_TEL_NO <=", value, "csoTelNo");
            return (Criteria) this;
        }

        public Criteria andCsoTelNoLike(String value) {
            addCriterion("TS.CSO_TEL_NO like", value, "csoTelNo");
            return (Criteria) this;
        }

        public Criteria andCsoTelNoNotLike(String value) {
            addCriterion("TS.CSO_TEL_NO not like", value, "csoTelNo");
            return (Criteria) this;
        }

        public Criteria andCsoTelNoIn(List<String> values) {
            addCriterion("TS.CSO_TEL_NO in", values, "csoTelNo");
            return (Criteria) this;
        }

        public Criteria andCsoTelNoNotIn(List<String> values) {
            addCriterion("TS.CSO_TEL_NO not in", values, "csoTelNo");
            return (Criteria) this;
        }

        public Criteria andCsoTelNoBetween(String value1, String value2) {
            addCriterion("TS.CSO_TEL_NO between", value1, value2, "csoTelNo");
            return (Criteria) this;
        }

        public Criteria andCsoTelNoNotBetween(String value1, String value2) {
            addCriterion("TS.CSO_TEL_NO not between", value1, value2, "csoTelNo");
            return (Criteria) this;
        }

        public Criteria andSeoTitIsNull() {
            addCriterion("TS.SEO_TIT is null");
            return (Criteria) this;
        }

        public Criteria andSeoTitIsNotNull() {
            addCriterion("TS.SEO_TIT is not null");
            return (Criteria) this;
        }

        public Criteria andSeoTitEqualTo(String value) {
            addCriterion("TS.SEO_TIT =", value, "seoTit");
            return (Criteria) this;
        }

        public Criteria andSeoTitNotEqualTo(String value) {
            addCriterion("TS.SEO_TIT <>", value, "seoTit");
            return (Criteria) this;
        }

        public Criteria andSeoTitGreaterThan(String value) {
            addCriterion("TS.SEO_TIT >", value, "seoTit");
            return (Criteria) this;
        }

        public Criteria andSeoTitGreaterThanOrEqualTo(String value) {
            addCriterion("TS.SEO_TIT >=", value, "seoTit");
            return (Criteria) this;
        }

        public Criteria andSeoTitLessThan(String value) {
            addCriterion("TS.SEO_TIT <", value, "seoTit");
            return (Criteria) this;
        }

        public Criteria andSeoTitLessThanOrEqualTo(String value) {
            addCriterion("TS.SEO_TIT <=", value, "seoTit");
            return (Criteria) this;
        }

        public Criteria andSeoTitLike(String value) {
            addCriterion("TS.SEO_TIT like", value, "seoTit");
            return (Criteria) this;
        }

        public Criteria andSeoTitNotLike(String value) {
            addCriterion("TS.SEO_TIT not like", value, "seoTit");
            return (Criteria) this;
        }

        public Criteria andSeoTitIn(List<String> values) {
            addCriterion("TS.SEO_TIT in", values, "seoTit");
            return (Criteria) this;
        }

        public Criteria andSeoTitNotIn(List<String> values) {
            addCriterion("TS.SEO_TIT not in", values, "seoTit");
            return (Criteria) this;
        }

        public Criteria andSeoTitBetween(String value1, String value2) {
            addCriterion("TS.SEO_TIT between", value1, value2, "seoTit");
            return (Criteria) this;
        }

        public Criteria andSeoTitNotBetween(String value1, String value2) {
            addCriterion("TS.SEO_TIT not between", value1, value2, "seoTit");
            return (Criteria) this;
        }

        public Criteria andSeoDescIsNull() {
            addCriterion("TS.SEO_DESC is null");
            return (Criteria) this;
        }

        public Criteria andSeoDescIsNotNull() {
            addCriterion("TS.SEO_DESC is not null");
            return (Criteria) this;
        }

        public Criteria andSeoDescEqualTo(String value) {
            addCriterion("TS.SEO_DESC =", value, "seoDesc");
            return (Criteria) this;
        }

        public Criteria andSeoDescNotEqualTo(String value) {
            addCriterion("TS.SEO_DESC <>", value, "seoDesc");
            return (Criteria) this;
        }

        public Criteria andSeoDescGreaterThan(String value) {
            addCriterion("TS.SEO_DESC >", value, "seoDesc");
            return (Criteria) this;
        }

        public Criteria andSeoDescGreaterThanOrEqualTo(String value) {
            addCriterion("TS.SEO_DESC >=", value, "seoDesc");
            return (Criteria) this;
        }

        public Criteria andSeoDescLessThan(String value) {
            addCriterion("TS.SEO_DESC <", value, "seoDesc");
            return (Criteria) this;
        }

        public Criteria andSeoDescLessThanOrEqualTo(String value) {
            addCriterion("TS.SEO_DESC <=", value, "seoDesc");
            return (Criteria) this;
        }

        public Criteria andSeoDescLike(String value) {
            addCriterion("TS.SEO_DESC like", value, "seoDesc");
            return (Criteria) this;
        }

        public Criteria andSeoDescNotLike(String value) {
            addCriterion("TS.SEO_DESC not like", value, "seoDesc");
            return (Criteria) this;
        }

        public Criteria andSeoDescIn(List<String> values) {
            addCriterion("TS.SEO_DESC in", values, "seoDesc");
            return (Criteria) this;
        }

        public Criteria andSeoDescNotIn(List<String> values) {
            addCriterion("TS.SEO_DESC not in", values, "seoDesc");
            return (Criteria) this;
        }

        public Criteria andSeoDescBetween(String value1, String value2) {
            addCriterion("TS.SEO_DESC between", value1, value2, "seoDesc");
            return (Criteria) this;
        }

        public Criteria andSeoDescNotBetween(String value1, String value2) {
            addCriterion("TS.SEO_DESC not between", value1, value2, "seoDesc");
            return (Criteria) this;
        }

        public Criteria andSeoKwdIsNull() {
            addCriterion("TS.SEO_KWD is null");
            return (Criteria) this;
        }

        public Criteria andSeoKwdIsNotNull() {
            addCriterion("TS.SEO_KWD is not null");
            return (Criteria) this;
        }

        public Criteria andSeoKwdEqualTo(String value) {
            addCriterion("TS.SEO_KWD =", value, "seoKwd");
            return (Criteria) this;
        }

        public Criteria andSeoKwdNotEqualTo(String value) {
            addCriterion("TS.SEO_KWD <>", value, "seoKwd");
            return (Criteria) this;
        }

        public Criteria andSeoKwdGreaterThan(String value) {
            addCriterion("TS.SEO_KWD >", value, "seoKwd");
            return (Criteria) this;
        }

        public Criteria andSeoKwdGreaterThanOrEqualTo(String value) {
            addCriterion("TS.SEO_KWD >=", value, "seoKwd");
            return (Criteria) this;
        }

        public Criteria andSeoKwdLessThan(String value) {
            addCriterion("TS.SEO_KWD <", value, "seoKwd");
            return (Criteria) this;
        }

        public Criteria andSeoKwdLessThanOrEqualTo(String value) {
            addCriterion("TS.SEO_KWD <=", value, "seoKwd");
            return (Criteria) this;
        }

        public Criteria andSeoKwdLike(String value) {
            addCriterion("TS.SEO_KWD like", value, "seoKwd");
            return (Criteria) this;
        }

        public Criteria andSeoKwdNotLike(String value) {
            addCriterion("TS.SEO_KWD not like", value, "seoKwd");
            return (Criteria) this;
        }

        public Criteria andSeoKwdIn(List<String> values) {
            addCriterion("TS.SEO_KWD in", values, "seoKwd");
            return (Criteria) this;
        }

        public Criteria andSeoKwdNotIn(List<String> values) {
            addCriterion("TS.SEO_KWD not in", values, "seoKwd");
            return (Criteria) this;
        }

        public Criteria andSeoKwdBetween(String value1, String value2) {
            addCriterion("TS.SEO_KWD between", value1, value2, "seoKwd");
            return (Criteria) this;
        }

        public Criteria andSeoKwdNotBetween(String value1, String value2) {
            addCriterion("TS.SEO_KWD not between", value1, value2, "seoKwd");
            return (Criteria) this;
        }

        public Criteria andSeoOgAtchGidIsNull() {
            addCriterion("TS.SEO_OG_ATCH_GID is null");
            return (Criteria) this;
        }

        public Criteria andSeoOgAtchGidIsNotNull() {
            addCriterion("TS.SEO_OG_ATCH_GID is not null");
            return (Criteria) this;
        }

        public Criteria andSeoOgAtchGidEqualTo(Integer value) {
            addCriterion("TS.SEO_OG_ATCH_GID =", value, "seoOgAtchGid");
            return (Criteria) this;
        }

        public Criteria andSeoOgAtchGidNotEqualTo(Integer value) {
            addCriterion("TS.SEO_OG_ATCH_GID <>", value, "seoOgAtchGid");
            return (Criteria) this;
        }

        public Criteria andSeoOgAtchGidGreaterThan(Integer value) {
            addCriterion("TS.SEO_OG_ATCH_GID >", value, "seoOgAtchGid");
            return (Criteria) this;
        }

        public Criteria andSeoOgAtchGidGreaterThanOrEqualTo(Integer value) {
            addCriterion("TS.SEO_OG_ATCH_GID >=", value, "seoOgAtchGid");
            return (Criteria) this;
        }

        public Criteria andSeoOgAtchGidLessThan(Integer value) {
            addCriterion("TS.SEO_OG_ATCH_GID <", value, "seoOgAtchGid");
            return (Criteria) this;
        }

        public Criteria andSeoOgAtchGidLessThanOrEqualTo(Integer value) {
            addCriterion("TS.SEO_OG_ATCH_GID <=", value, "seoOgAtchGid");
            return (Criteria) this;
        }

        public Criteria andSeoOgAtchGidIn(List<Integer> values) {
            addCriterion("TS.SEO_OG_ATCH_GID in", values, "seoOgAtchGid");
            return (Criteria) this;
        }

        public Criteria andSeoOgAtchGidNotIn(List<Integer> values) {
            addCriterion("TS.SEO_OG_ATCH_GID not in", values, "seoOgAtchGid");
            return (Criteria) this;
        }

        public Criteria andSeoOgAtchGidBetween(Integer value1, Integer value2) {
            addCriterion("TS.SEO_OG_ATCH_GID between", value1, value2, "seoOgAtchGid");
            return (Criteria) this;
        }

        public Criteria andSeoOgAtchGidNotBetween(Integer value1, Integer value2) {
            addCriterion("TS.SEO_OG_ATCH_GID not between", value1, value2, "seoOgAtchGid");
            return (Criteria) this;
        }

        public Criteria andRegDtIsNull() {
            addCriterion("TS.REG_DT is null");
            return (Criteria) this;
        }

        public Criteria andRegDtIsNotNull() {
            addCriterion("TS.REG_DT is not null");
            return (Criteria) this;
        }

        public Criteria andRegDtEqualTo(Date value) {
            addCriterion("TS.REG_DT =", value, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtNotEqualTo(Date value) {
            addCriterion("TS.REG_DT <>", value, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtGreaterThan(Date value) {
            addCriterion("TS.REG_DT >", value, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtGreaterThanOrEqualTo(Date value) {
            addCriterion("TS.REG_DT >=", value, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtLessThan(Date value) {
            addCriterion("TS.REG_DT <", value, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtLessThanOrEqualTo(Date value) {
            addCriterion("TS.REG_DT <=", value, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtIn(List<Date> values) {
            addCriterion("TS.REG_DT in", values, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtNotIn(List<Date> values) {
            addCriterion("TS.REG_DT not in", values, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtBetween(Date value1, Date value2) {
            addCriterion("TS.REG_DT between", value1, value2, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtNotBetween(Date value1, Date value2) {
            addCriterion("TS.REG_DT not between", value1, value2, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegIdIsNull() {
            addCriterion("TS.REG_ID is null");
            return (Criteria) this;
        }

        public Criteria andRegIdIsNotNull() {
            addCriterion("TS.REG_ID is not null");
            return (Criteria) this;
        }

        public Criteria andRegIdEqualTo(String value) {
            addCriterion("TS.REG_ID =", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdNotEqualTo(String value) {
            addCriterion("TS.REG_ID <>", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdGreaterThan(String value) {
            addCriterion("TS.REG_ID >", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdGreaterThanOrEqualTo(String value) {
            addCriterion("TS.REG_ID >=", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdLessThan(String value) {
            addCriterion("TS.REG_ID <", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdLessThanOrEqualTo(String value) {
            addCriterion("TS.REG_ID <=", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdLike(String value) {
            addCriterion("TS.REG_ID like", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdNotLike(String value) {
            addCriterion("TS.REG_ID not like", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdIn(List<String> values) {
            addCriterion("TS.REG_ID in", values, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdNotIn(List<String> values) {
            addCriterion("TS.REG_ID not in", values, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdBetween(String value1, String value2) {
            addCriterion("TS.REG_ID between", value1, value2, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdNotBetween(String value1, String value2) {
            addCriterion("TS.REG_ID not between", value1, value2, "regId");
            return (Criteria) this;
        }

        public Criteria andModDtIsNull() {
            addCriterion("TS.MOD_DT is null");
            return (Criteria) this;
        }

        public Criteria andModDtIsNotNull() {
            addCriterion("TS.MOD_DT is not null");
            return (Criteria) this;
        }

        public Criteria andModDtEqualTo(Date value) {
            addCriterion("TS.MOD_DT =", value, "modDt");
            return (Criteria) this;
        }

        public Criteria andModDtNotEqualTo(Date value) {
            addCriterion("TS.MOD_DT <>", value, "modDt");
            return (Criteria) this;
        }

        public Criteria andModDtGreaterThan(Date value) {
            addCriterion("TS.MOD_DT >", value, "modDt");
            return (Criteria) this;
        }

        public Criteria andModDtGreaterThanOrEqualTo(Date value) {
            addCriterion("TS.MOD_DT >=", value, "modDt");
            return (Criteria) this;
        }

        public Criteria andModDtLessThan(Date value) {
            addCriterion("TS.MOD_DT <", value, "modDt");
            return (Criteria) this;
        }

        public Criteria andModDtLessThanOrEqualTo(Date value) {
            addCriterion("TS.MOD_DT <=", value, "modDt");
            return (Criteria) this;
        }

        public Criteria andModDtIn(List<Date> values) {
            addCriterion("TS.MOD_DT in", values, "modDt");
            return (Criteria) this;
        }

        public Criteria andModDtNotIn(List<Date> values) {
            addCriterion("TS.MOD_DT not in", values, "modDt");
            return (Criteria) this;
        }

        public Criteria andModDtBetween(Date value1, Date value2) {
            addCriterion("TS.MOD_DT between", value1, value2, "modDt");
            return (Criteria) this;
        }

        public Criteria andModDtNotBetween(Date value1, Date value2) {
            addCriterion("TS.MOD_DT not between", value1, value2, "modDt");
            return (Criteria) this;
        }

        public Criteria andModIdIsNull() {
            addCriterion("TS.MOD_ID is null");
            return (Criteria) this;
        }

        public Criteria andModIdIsNotNull() {
            addCriterion("TS.MOD_ID is not null");
            return (Criteria) this;
        }

        public Criteria andModIdEqualTo(String value) {
            addCriterion("TS.MOD_ID =", value, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdNotEqualTo(String value) {
            addCriterion("TS.MOD_ID <>", value, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdGreaterThan(String value) {
            addCriterion("TS.MOD_ID >", value, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdGreaterThanOrEqualTo(String value) {
            addCriterion("TS.MOD_ID >=", value, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdLessThan(String value) {
            addCriterion("TS.MOD_ID <", value, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdLessThanOrEqualTo(String value) {
            addCriterion("TS.MOD_ID <=", value, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdLike(String value) {
            addCriterion("TS.MOD_ID like", value, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdNotLike(String value) {
            addCriterion("TS.MOD_ID not like", value, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdIn(List<String> values) {
            addCriterion("TS.MOD_ID in", values, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdNotIn(List<String> values) {
            addCriterion("TS.MOD_ID not in", values, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdBetween(String value1, String value2) {
            addCriterion("TS.MOD_ID between", value1, value2, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdNotBetween(String value1, String value2) {
            addCriterion("TS.MOD_ID not between", value1, value2, "modId");
            return (Criteria) this;
        }

        public Criteria andSiteIdLikeInsensitive(String value) {
            addCriterion("upper(TS.SITE_ID) like", value.toUpperCase(), "siteId");
            return (Criteria) this;
        }

        public Criteria andBizNmLikeInsensitive(String value) {
            addCriterion("upper(TS.BIZ_NM) like", value.toUpperCase(), "bizNm");
            return (Criteria) this;
        }

        public Criteria andRepNmLikeInsensitive(String value) {
            addCriterion("upper(TS.REP_NM) like", value.toUpperCase(), "repNm");
            return (Criteria) this;
        }

        public Criteria andRepTelLikeInsensitive(String value) {
            addCriterion("upper(TS.REP_TEL) like", value.toUpperCase(), "repTel");
            return (Criteria) this;
        }

        public Criteria andFaxNoLikeInsensitive(String value) {
            addCriterion("upper(TS.FAX_NO) like", value.toUpperCase(), "faxNo");
            return (Criteria) this;
        }

        public Criteria andBizNoLikeInsensitive(String value) {
            addCriterion("upper(TS.BIZ_NO) like", value.toUpperCase(), "bizNo");
            return (Criteria) this;
        }

        public Criteria andBizLocAddrLikeInsensitive(String value) {
            addCriterion("upper(TS.BIZ_LOC_ADDR) like", value.toUpperCase(), "bizLocAddr");
            return (Criteria) this;
        }

        public Criteria andCisoNmLikeInsensitive(String value) {
            addCriterion("upper(TS.CISO_NM) like", value.toUpperCase(), "cisoNm");
            return (Criteria) this;
        }

        public Criteria andEmailLikeInsensitive(String value) {
            addCriterion("upper(TS.EMAIL) like", value.toUpperCase(), "email");
            return (Criteria) this;
        }

        public Criteria andCsoTelNoLikeInsensitive(String value) {
            addCriterion("upper(TS.CSO_TEL_NO) like", value.toUpperCase(), "csoTelNo");
            return (Criteria) this;
        }

        public Criteria andSeoTitLikeInsensitive(String value) {
            addCriterion("upper(TS.SEO_TIT) like", value.toUpperCase(), "seoTit");
            return (Criteria) this;
        }

        public Criteria andSeoDescLikeInsensitive(String value) {
            addCriterion("upper(TS.SEO_DESC) like", value.toUpperCase(), "seoDesc");
            return (Criteria) this;
        }

        public Criteria andSeoKwdLikeInsensitive(String value) {
            addCriterion("upper(TS.SEO_KWD) like", value.toUpperCase(), "seoKwd");
            return (Criteria) this;
        }

        public Criteria andRegIdLikeInsensitive(String value) {
            addCriterion("upper(TS.REG_ID) like", value.toUpperCase(), "regId");
            return (Criteria) this;
        }

        public Criteria andModIdLikeInsensitive(String value) {
            addCriterion("upper(TS.MOD_ID) like", value.toUpperCase(), "modId");
            return (Criteria) this;
        }

        public Criteria andSiteIdLikeLeft(String value) {
            addCriterion("TS.SITE_ID like ", "%" + value, "siteId");
            return (Criteria) this;
        }

        public Criteria andSiteIdLikeRight(String value) {
            addCriterion("TS.SITE_ID like ", value + "%", "siteId");
            return (Criteria) this;
        }

        public Criteria andSiteIdLikeBoth(String value) {
            addCriterion("TS.SITE_ID like ", "%" + value + "%", "siteId");
            return (Criteria) this;
        }

        public Criteria andBizNmLikeLeft(String value) {
            addCriterion("TS.BIZ_NM like ", "%" + value, "bizNm");
            return (Criteria) this;
        }

        public Criteria andBizNmLikeRight(String value) {
            addCriterion("TS.BIZ_NM like ", value + "%", "bizNm");
            return (Criteria) this;
        }

        public Criteria andBizNmLikeBoth(String value) {
            addCriterion("TS.BIZ_NM like ", "%" + value + "%", "bizNm");
            return (Criteria) this;
        }

        public Criteria andRepNmLikeLeft(String value) {
            addCriterion("TS.REP_NM like ", "%" + value, "repNm");
            return (Criteria) this;
        }

        public Criteria andRepNmLikeRight(String value) {
            addCriterion("TS.REP_NM like ", value + "%", "repNm");
            return (Criteria) this;
        }

        public Criteria andRepNmLikeBoth(String value) {
            addCriterion("TS.REP_NM like ", "%" + value + "%", "repNm");
            return (Criteria) this;
        }

        public Criteria andRepTelLikeLeft(String value) {
            addCriterion("TS.REP_TEL like ", "%" + value, "repTel");
            return (Criteria) this;
        }

        public Criteria andRepTelLikeRight(String value) {
            addCriterion("TS.REP_TEL like ", value + "%", "repTel");
            return (Criteria) this;
        }

        public Criteria andRepTelLikeBoth(String value) {
            addCriterion("TS.REP_TEL like ", "%" + value + "%", "repTel");
            return (Criteria) this;
        }

        public Criteria andFaxNoLikeLeft(String value) {
            addCriterion("TS.FAX_NO like ", "%" + value, "faxNo");
            return (Criteria) this;
        }

        public Criteria andFaxNoLikeRight(String value) {
            addCriterion("TS.FAX_NO like ", value + "%", "faxNo");
            return (Criteria) this;
        }

        public Criteria andFaxNoLikeBoth(String value) {
            addCriterion("TS.FAX_NO like ", "%" + value + "%", "faxNo");
            return (Criteria) this;
        }

        public Criteria andBizNoLikeLeft(String value) {
            addCriterion("TS.BIZ_NO like ", "%" + value, "bizNo");
            return (Criteria) this;
        }

        public Criteria andBizNoLikeRight(String value) {
            addCriterion("TS.BIZ_NO like ", value + "%", "bizNo");
            return (Criteria) this;
        }

        public Criteria andBizNoLikeBoth(String value) {
            addCriterion("TS.BIZ_NO like ", "%" + value + "%", "bizNo");
            return (Criteria) this;
        }

        public Criteria andBizLocAddrLikeLeft(String value) {
            addCriterion("TS.BIZ_LOC_ADDR like ", "%" + value, "bizLocAddr");
            return (Criteria) this;
        }

        public Criteria andBizLocAddrLikeRight(String value) {
            addCriterion("TS.BIZ_LOC_ADDR like ", value + "%", "bizLocAddr");
            return (Criteria) this;
        }

        public Criteria andBizLocAddrLikeBoth(String value) {
            addCriterion("TS.BIZ_LOC_ADDR like ", "%" + value + "%", "bizLocAddr");
            return (Criteria) this;
        }

        public Criteria andCisoNmLikeLeft(String value) {
            addCriterion("TS.CISO_NM like ", "%" + value, "cisoNm");
            return (Criteria) this;
        }

        public Criteria andCisoNmLikeRight(String value) {
            addCriterion("TS.CISO_NM like ", value + "%", "cisoNm");
            return (Criteria) this;
        }

        public Criteria andCisoNmLikeBoth(String value) {
            addCriterion("TS.CISO_NM like ", "%" + value + "%", "cisoNm");
            return (Criteria) this;
        }

        public Criteria andEmailLikeLeft(String value) {
            addCriterion("TS.EMAIL like ", "%" + value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLikeRight(String value) {
            addCriterion("TS.EMAIL like ", value + "%", "email");
            return (Criteria) this;
        }

        public Criteria andEmailLikeBoth(String value) {
            addCriterion("TS.EMAIL like ", "%" + value + "%", "email");
            return (Criteria) this;
        }

        public Criteria andCsoTelNoLikeLeft(String value) {
            addCriterion("TS.CSO_TEL_NO like ", "%" + value, "csoTelNo");
            return (Criteria) this;
        }

        public Criteria andCsoTelNoLikeRight(String value) {
            addCriterion("TS.CSO_TEL_NO like ", value + "%", "csoTelNo");
            return (Criteria) this;
        }

        public Criteria andCsoTelNoLikeBoth(String value) {
            addCriterion("TS.CSO_TEL_NO like ", "%" + value + "%", "csoTelNo");
            return (Criteria) this;
        }

        public Criteria andSeoTitLikeLeft(String value) {
            addCriterion("TS.SEO_TIT like ", "%" + value, "seoTit");
            return (Criteria) this;
        }

        public Criteria andSeoTitLikeRight(String value) {
            addCriterion("TS.SEO_TIT like ", value + "%", "seoTit");
            return (Criteria) this;
        }

        public Criteria andSeoTitLikeBoth(String value) {
            addCriterion("TS.SEO_TIT like ", "%" + value + "%", "seoTit");
            return (Criteria) this;
        }

        public Criteria andSeoDescLikeLeft(String value) {
            addCriterion("TS.SEO_DESC like ", "%" + value, "seoDesc");
            return (Criteria) this;
        }

        public Criteria andSeoDescLikeRight(String value) {
            addCriterion("TS.SEO_DESC like ", value + "%", "seoDesc");
            return (Criteria) this;
        }

        public Criteria andSeoDescLikeBoth(String value) {
            addCriterion("TS.SEO_DESC like ", "%" + value + "%", "seoDesc");
            return (Criteria) this;
        }

        public Criteria andSeoKwdLikeLeft(String value) {
            addCriterion("TS.SEO_KWD like ", "%" + value, "seoKwd");
            return (Criteria) this;
        }

        public Criteria andSeoKwdLikeRight(String value) {
            addCriterion("TS.SEO_KWD like ", value + "%", "seoKwd");
            return (Criteria) this;
        }

        public Criteria andSeoKwdLikeBoth(String value) {
            addCriterion("TS.SEO_KWD like ", "%" + value + "%", "seoKwd");
            return (Criteria) this;
        }

        public Criteria andRegIdLikeLeft(String value) {
            addCriterion("TS.REG_ID like ", "%" + value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdLikeRight(String value) {
            addCriterion("TS.REG_ID like ", value + "%", "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdLikeBoth(String value) {
            addCriterion("TS.REG_ID like ", "%" + value + "%", "regId");
            return (Criteria) this;
        }

        public Criteria andModIdLikeLeft(String value) {
            addCriterion("TS.MOD_ID like ", "%" + value, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdLikeRight(String value) {
            addCriterion("TS.MOD_ID like ", value + "%", "modId");
            return (Criteria) this;
        }

        public Criteria andModIdLikeBoth(String value) {
            addCriterion("TS.MOD_ID like ", "%" + value + "%", "modId");
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