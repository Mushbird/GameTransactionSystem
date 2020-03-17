package com.mushbird.sinsege.base.module.display.model.entity.criteria;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class DpPopEntityCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    public DpPopEntityCriteria() {
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

        public Criteria andDpPopIdIsNull() {
            addCriterion("TDPOP.DP_POP_ID is null");
            return (Criteria) this;
        }

        public Criteria andDpPopIdIsNotNull() {
            addCriterion("TDPOP.DP_POP_ID is not null");
            return (Criteria) this;
        }

        public Criteria andDpPopIdEqualTo(Integer value) {
            addCriterion("TDPOP.DP_POP_ID =", value, "dpPopId");
            return (Criteria) this;
        }

        public Criteria andDpPopIdNotEqualTo(Integer value) {
            addCriterion("TDPOP.DP_POP_ID <>", value, "dpPopId");
            return (Criteria) this;
        }

        public Criteria andDpPopIdGreaterThan(Integer value) {
            addCriterion("TDPOP.DP_POP_ID >", value, "dpPopId");
            return (Criteria) this;
        }

        public Criteria andDpPopIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("TDPOP.DP_POP_ID >=", value, "dpPopId");
            return (Criteria) this;
        }

        public Criteria andDpPopIdLessThan(Integer value) {
            addCriterion("TDPOP.DP_POP_ID <", value, "dpPopId");
            return (Criteria) this;
        }

        public Criteria andDpPopIdLessThanOrEqualTo(Integer value) {
            addCriterion("TDPOP.DP_POP_ID <=", value, "dpPopId");
            return (Criteria) this;
        }

        public Criteria andDpPopIdIn(List<Integer> values) {
            addCriterion("TDPOP.DP_POP_ID in", values, "dpPopId");
            return (Criteria) this;
        }

        public Criteria andDpPopIdNotIn(List<Integer> values) {
            addCriterion("TDPOP.DP_POP_ID not in", values, "dpPopId");
            return (Criteria) this;
        }

        public Criteria andDpPopIdBetween(Integer value1, Integer value2) {
            addCriterion("TDPOP.DP_POP_ID between", value1, value2, "dpPopId");
            return (Criteria) this;
        }

        public Criteria andDpPopIdNotBetween(Integer value1, Integer value2) {
            addCriterion("TDPOP.DP_POP_ID not between", value1, value2, "dpPopId");
            return (Criteria) this;
        }

        public Criteria andPopDpEnvCdIsNull() {
            addCriterion("TDPOP.POP_DP_ENV_CD is null");
            return (Criteria) this;
        }

        public Criteria andPopDpEnvCdIsNotNull() {
            addCriterion("TDPOP.POP_DP_ENV_CD is not null");
            return (Criteria) this;
        }

        public Criteria andPopDpEnvCdEqualTo(String value) {
            addCriterion("TDPOP.POP_DP_ENV_CD =", value, "popDpEnvCd");
            return (Criteria) this;
        }

        public Criteria andPopDpEnvCdNotEqualTo(String value) {
            addCriterion("TDPOP.POP_DP_ENV_CD <>", value, "popDpEnvCd");
            return (Criteria) this;
        }

        public Criteria andPopDpEnvCdGreaterThan(String value) {
            addCriterion("TDPOP.POP_DP_ENV_CD >", value, "popDpEnvCd");
            return (Criteria) this;
        }

        public Criteria andPopDpEnvCdGreaterThanOrEqualTo(String value) {
            addCriterion("TDPOP.POP_DP_ENV_CD >=", value, "popDpEnvCd");
            return (Criteria) this;
        }

        public Criteria andPopDpEnvCdLessThan(String value) {
            addCriterion("TDPOP.POP_DP_ENV_CD <", value, "popDpEnvCd");
            return (Criteria) this;
        }

        public Criteria andPopDpEnvCdLessThanOrEqualTo(String value) {
            addCriterion("TDPOP.POP_DP_ENV_CD <=", value, "popDpEnvCd");
            return (Criteria) this;
        }

        public Criteria andPopDpEnvCdLike(String value) {
            addCriterion("TDPOP.POP_DP_ENV_CD like", value, "popDpEnvCd");
            return (Criteria) this;
        }

        public Criteria andPopDpEnvCdNotLike(String value) {
            addCriterion("TDPOP.POP_DP_ENV_CD not like", value, "popDpEnvCd");
            return (Criteria) this;
        }

        public Criteria andPopDpEnvCdIn(List<String> values) {
            addCriterion("TDPOP.POP_DP_ENV_CD in", values, "popDpEnvCd");
            return (Criteria) this;
        }

        public Criteria andPopDpEnvCdNotIn(List<String> values) {
            addCriterion("TDPOP.POP_DP_ENV_CD not in", values, "popDpEnvCd");
            return (Criteria) this;
        }

        public Criteria andPopDpEnvCdBetween(String value1, String value2) {
            addCriterion("TDPOP.POP_DP_ENV_CD between", value1, value2, "popDpEnvCd");
            return (Criteria) this;
        }

        public Criteria andPopDpEnvCdNotBetween(String value1, String value2) {
            addCriterion("TDPOP.POP_DP_ENV_CD not between", value1, value2, "popDpEnvCd");
            return (Criteria) this;
        }

        public Criteria andPopTitIsNull() {
            addCriterion("TDPOP.POP_TIT is null");
            return (Criteria) this;
        }

        public Criteria andPopTitIsNotNull() {
            addCriterion("TDPOP.POP_TIT is not null");
            return (Criteria) this;
        }

        public Criteria andPopTitEqualTo(String value) {
            addCriterion("TDPOP.POP_TIT =", value, "popTit");
            return (Criteria) this;
        }

        public Criteria andPopTitNotEqualTo(String value) {
            addCriterion("TDPOP.POP_TIT <>", value, "popTit");
            return (Criteria) this;
        }

        public Criteria andPopTitGreaterThan(String value) {
            addCriterion("TDPOP.POP_TIT >", value, "popTit");
            return (Criteria) this;
        }

        public Criteria andPopTitGreaterThanOrEqualTo(String value) {
            addCriterion("TDPOP.POP_TIT >=", value, "popTit");
            return (Criteria) this;
        }

        public Criteria andPopTitLessThan(String value) {
            addCriterion("TDPOP.POP_TIT <", value, "popTit");
            return (Criteria) this;
        }

        public Criteria andPopTitLessThanOrEqualTo(String value) {
            addCriterion("TDPOP.POP_TIT <=", value, "popTit");
            return (Criteria) this;
        }

        public Criteria andPopTitLike(String value) {
            addCriterion("TDPOP.POP_TIT like", value, "popTit");
            return (Criteria) this;
        }

        public Criteria andPopTitNotLike(String value) {
            addCriterion("TDPOP.POP_TIT not like", value, "popTit");
            return (Criteria) this;
        }

        public Criteria andPopTitIn(List<String> values) {
            addCriterion("TDPOP.POP_TIT in", values, "popTit");
            return (Criteria) this;
        }

        public Criteria andPopTitNotIn(List<String> values) {
            addCriterion("TDPOP.POP_TIT not in", values, "popTit");
            return (Criteria) this;
        }

        public Criteria andPopTitBetween(String value1, String value2) {
            addCriterion("TDPOP.POP_TIT between", value1, value2, "popTit");
            return (Criteria) this;
        }

        public Criteria andPopTitNotBetween(String value1, String value2) {
            addCriterion("TDPOP.POP_TIT not between", value1, value2, "popTit");
            return (Criteria) this;
        }

        public Criteria andAtchGidIsNull() {
            addCriterion("TDPOP.ATCH_GID is null");
            return (Criteria) this;
        }

        public Criteria andAtchGidIsNotNull() {
            addCriterion("TDPOP.ATCH_GID is not null");
            return (Criteria) this;
        }

        public Criteria andAtchGidEqualTo(Integer value) {
            addCriterion("TDPOP.ATCH_GID =", value, "atchGid");
            return (Criteria) this;
        }

        public Criteria andAtchGidNotEqualTo(Integer value) {
            addCriterion("TDPOP.ATCH_GID <>", value, "atchGid");
            return (Criteria) this;
        }

        public Criteria andAtchGidGreaterThan(Integer value) {
            addCriterion("TDPOP.ATCH_GID >", value, "atchGid");
            return (Criteria) this;
        }

        public Criteria andAtchGidGreaterThanOrEqualTo(Integer value) {
            addCriterion("TDPOP.ATCH_GID >=", value, "atchGid");
            return (Criteria) this;
        }

        public Criteria andAtchGidLessThan(Integer value) {
            addCriterion("TDPOP.ATCH_GID <", value, "atchGid");
            return (Criteria) this;
        }

        public Criteria andAtchGidLessThanOrEqualTo(Integer value) {
            addCriterion("TDPOP.ATCH_GID <=", value, "atchGid");
            return (Criteria) this;
        }

        public Criteria andAtchGidIn(List<Integer> values) {
            addCriterion("TDPOP.ATCH_GID in", values, "atchGid");
            return (Criteria) this;
        }

        public Criteria andAtchGidNotIn(List<Integer> values) {
            addCriterion("TDPOP.ATCH_GID not in", values, "atchGid");
            return (Criteria) this;
        }

        public Criteria andAtchGidBetween(Integer value1, Integer value2) {
            addCriterion("TDPOP.ATCH_GID between", value1, value2, "atchGid");
            return (Criteria) this;
        }

        public Criteria andAtchGidNotBetween(Integer value1, Integer value2) {
            addCriterion("TDPOP.ATCH_GID not between", value1, value2, "atchGid");
            return (Criteria) this;
        }

        public Criteria andPopLocXaIsNull() {
            addCriterion("TDPOP.POP_LOC_XA is null");
            return (Criteria) this;
        }

        public Criteria andPopLocXaIsNotNull() {
            addCriterion("TDPOP.POP_LOC_XA is not null");
            return (Criteria) this;
        }

        public Criteria andPopLocXaEqualTo(Short value) {
            addCriterion("TDPOP.POP_LOC_XA =", value, "popLocXa");
            return (Criteria) this;
        }

        public Criteria andPopLocXaNotEqualTo(Short value) {
            addCriterion("TDPOP.POP_LOC_XA <>", value, "popLocXa");
            return (Criteria) this;
        }

        public Criteria andPopLocXaGreaterThan(Short value) {
            addCriterion("TDPOP.POP_LOC_XA >", value, "popLocXa");
            return (Criteria) this;
        }

        public Criteria andPopLocXaGreaterThanOrEqualTo(Short value) {
            addCriterion("TDPOP.POP_LOC_XA >=", value, "popLocXa");
            return (Criteria) this;
        }

        public Criteria andPopLocXaLessThan(Short value) {
            addCriterion("TDPOP.POP_LOC_XA <", value, "popLocXa");
            return (Criteria) this;
        }

        public Criteria andPopLocXaLessThanOrEqualTo(Short value) {
            addCriterion("TDPOP.POP_LOC_XA <=", value, "popLocXa");
            return (Criteria) this;
        }

        public Criteria andPopLocXaIn(List<Short> values) {
            addCriterion("TDPOP.POP_LOC_XA in", values, "popLocXa");
            return (Criteria) this;
        }

        public Criteria andPopLocXaNotIn(List<Short> values) {
            addCriterion("TDPOP.POP_LOC_XA not in", values, "popLocXa");
            return (Criteria) this;
        }

        public Criteria andPopLocXaBetween(Short value1, Short value2) {
            addCriterion("TDPOP.POP_LOC_XA between", value1, value2, "popLocXa");
            return (Criteria) this;
        }

        public Criteria andPopLocXaNotBetween(Short value1, Short value2) {
            addCriterion("TDPOP.POP_LOC_XA not between", value1, value2, "popLocXa");
            return (Criteria) this;
        }

        public Criteria andPopLocYaIsNull() {
            addCriterion("TDPOP.POP_LOC_YA is null");
            return (Criteria) this;
        }

        public Criteria andPopLocYaIsNotNull() {
            addCriterion("TDPOP.POP_LOC_YA is not null");
            return (Criteria) this;
        }

        public Criteria andPopLocYaEqualTo(Short value) {
            addCriterion("TDPOP.POP_LOC_YA =", value, "popLocYa");
            return (Criteria) this;
        }

        public Criteria andPopLocYaNotEqualTo(Short value) {
            addCriterion("TDPOP.POP_LOC_YA <>", value, "popLocYa");
            return (Criteria) this;
        }

        public Criteria andPopLocYaGreaterThan(Short value) {
            addCriterion("TDPOP.POP_LOC_YA >", value, "popLocYa");
            return (Criteria) this;
        }

        public Criteria andPopLocYaGreaterThanOrEqualTo(Short value) {
            addCriterion("TDPOP.POP_LOC_YA >=", value, "popLocYa");
            return (Criteria) this;
        }

        public Criteria andPopLocYaLessThan(Short value) {
            addCriterion("TDPOP.POP_LOC_YA <", value, "popLocYa");
            return (Criteria) this;
        }

        public Criteria andPopLocYaLessThanOrEqualTo(Short value) {
            addCriterion("TDPOP.POP_LOC_YA <=", value, "popLocYa");
            return (Criteria) this;
        }

        public Criteria andPopLocYaIn(List<Short> values) {
            addCriterion("TDPOP.POP_LOC_YA in", values, "popLocYa");
            return (Criteria) this;
        }

        public Criteria andPopLocYaNotIn(List<Short> values) {
            addCriterion("TDPOP.POP_LOC_YA not in", values, "popLocYa");
            return (Criteria) this;
        }

        public Criteria andPopLocYaBetween(Short value1, Short value2) {
            addCriterion("TDPOP.POP_LOC_YA between", value1, value2, "popLocYa");
            return (Criteria) this;
        }

        public Criteria andPopLocYaNotBetween(Short value1, Short value2) {
            addCriterion("TDPOP.POP_LOC_YA not between", value1, value2, "popLocYa");
            return (Criteria) this;
        }

        public Criteria andLinkUrlAddrIsNull() {
            addCriterion("TDPOP.LINK_URL_ADDR is null");
            return (Criteria) this;
        }

        public Criteria andLinkUrlAddrIsNotNull() {
            addCriterion("TDPOP.LINK_URL_ADDR is not null");
            return (Criteria) this;
        }

        public Criteria andLinkUrlAddrEqualTo(String value) {
            addCriterion("TDPOP.LINK_URL_ADDR =", value, "linkUrlAddr");
            return (Criteria) this;
        }

        public Criteria andLinkUrlAddrNotEqualTo(String value) {
            addCriterion("TDPOP.LINK_URL_ADDR <>", value, "linkUrlAddr");
            return (Criteria) this;
        }

        public Criteria andLinkUrlAddrGreaterThan(String value) {
            addCriterion("TDPOP.LINK_URL_ADDR >", value, "linkUrlAddr");
            return (Criteria) this;
        }

        public Criteria andLinkUrlAddrGreaterThanOrEqualTo(String value) {
            addCriterion("TDPOP.LINK_URL_ADDR >=", value, "linkUrlAddr");
            return (Criteria) this;
        }

        public Criteria andLinkUrlAddrLessThan(String value) {
            addCriterion("TDPOP.LINK_URL_ADDR <", value, "linkUrlAddr");
            return (Criteria) this;
        }

        public Criteria andLinkUrlAddrLessThanOrEqualTo(String value) {
            addCriterion("TDPOP.LINK_URL_ADDR <=", value, "linkUrlAddr");
            return (Criteria) this;
        }

        public Criteria andLinkUrlAddrLike(String value) {
            addCriterion("TDPOP.LINK_URL_ADDR like", value, "linkUrlAddr");
            return (Criteria) this;
        }

        public Criteria andLinkUrlAddrNotLike(String value) {
            addCriterion("TDPOP.LINK_URL_ADDR not like", value, "linkUrlAddr");
            return (Criteria) this;
        }

        public Criteria andLinkUrlAddrIn(List<String> values) {
            addCriterion("TDPOP.LINK_URL_ADDR in", values, "linkUrlAddr");
            return (Criteria) this;
        }

        public Criteria andLinkUrlAddrNotIn(List<String> values) {
            addCriterion("TDPOP.LINK_URL_ADDR not in", values, "linkUrlAddr");
            return (Criteria) this;
        }

        public Criteria andLinkUrlAddrBetween(String value1, String value2) {
            addCriterion("TDPOP.LINK_URL_ADDR between", value1, value2, "linkUrlAddr");
            return (Criteria) this;
        }

        public Criteria andLinkUrlAddrNotBetween(String value1, String value2) {
            addCriterion("TDPOP.LINK_URL_ADDR not between", value1, value2, "linkUrlAddr");
            return (Criteria) this;
        }

        public Criteria andLinkNwinYnIsNull() {
            addCriterion("TDPOP.LINK_NWIN_YN is null");
            return (Criteria) this;
        }

        public Criteria andLinkNwinYnIsNotNull() {
            addCriterion("TDPOP.LINK_NWIN_YN is not null");
            return (Criteria) this;
        }

        public Criteria andLinkNwinYnEqualTo(String value) {
            addCriterion("TDPOP.LINK_NWIN_YN =", value, "linkNwinYn");
            return (Criteria) this;
        }

        public Criteria andLinkNwinYnNotEqualTo(String value) {
            addCriterion("TDPOP.LINK_NWIN_YN <>", value, "linkNwinYn");
            return (Criteria) this;
        }

        public Criteria andLinkNwinYnGreaterThan(String value) {
            addCriterion("TDPOP.LINK_NWIN_YN >", value, "linkNwinYn");
            return (Criteria) this;
        }

        public Criteria andLinkNwinYnGreaterThanOrEqualTo(String value) {
            addCriterion("TDPOP.LINK_NWIN_YN >=", value, "linkNwinYn");
            return (Criteria) this;
        }

        public Criteria andLinkNwinYnLessThan(String value) {
            addCriterion("TDPOP.LINK_NWIN_YN <", value, "linkNwinYn");
            return (Criteria) this;
        }

        public Criteria andLinkNwinYnLessThanOrEqualTo(String value) {
            addCriterion("TDPOP.LINK_NWIN_YN <=", value, "linkNwinYn");
            return (Criteria) this;
        }

        public Criteria andLinkNwinYnLike(String value) {
            addCriterion("TDPOP.LINK_NWIN_YN like", value, "linkNwinYn");
            return (Criteria) this;
        }

        public Criteria andLinkNwinYnNotLike(String value) {
            addCriterion("TDPOP.LINK_NWIN_YN not like", value, "linkNwinYn");
            return (Criteria) this;
        }

        public Criteria andLinkNwinYnIn(List<String> values) {
            addCriterion("TDPOP.LINK_NWIN_YN in", values, "linkNwinYn");
            return (Criteria) this;
        }

        public Criteria andLinkNwinYnNotIn(List<String> values) {
            addCriterion("TDPOP.LINK_NWIN_YN not in", values, "linkNwinYn");
            return (Criteria) this;
        }

        public Criteria andLinkNwinYnBetween(String value1, String value2) {
            addCriterion("TDPOP.LINK_NWIN_YN between", value1, value2, "linkNwinYn");
            return (Criteria) this;
        }

        public Criteria andLinkNwinYnNotBetween(String value1, String value2) {
            addCriterion("TDPOP.LINK_NWIN_YN not between", value1, value2, "linkNwinYn");
            return (Criteria) this;
        }

        public Criteria andDpStDtIsNull() {
            addCriterion("TDPOP.DP_ST_DT is null");
            return (Criteria) this;
        }

        public Criteria andDpStDtIsNotNull() {
            addCriterion("TDPOP.DP_ST_DT is not null");
            return (Criteria) this;
        }

        public Criteria andDpStDtEqualTo(Date value) {
            addCriterionForJDBCDate("TDPOP.DP_ST_DT =", value, "dpStDt");
            return (Criteria) this;
        }

        public Criteria andDpStDtNotEqualTo(Date value) {
            addCriterionForJDBCDate("TDPOP.DP_ST_DT <>", value, "dpStDt");
            return (Criteria) this;
        }

        public Criteria andDpStDtGreaterThan(Date value) {
            addCriterionForJDBCDate("TDPOP.DP_ST_DT >", value, "dpStDt");
            return (Criteria) this;
        }

        public Criteria andDpStDtGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("TDPOP.DP_ST_DT >=", value, "dpStDt");
            return (Criteria) this;
        }

        public Criteria andDpStDtLessThan(Date value) {
            addCriterionForJDBCDate("TDPOP.DP_ST_DT <", value, "dpStDt");
            return (Criteria) this;
        }

        public Criteria andDpStDtLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("TDPOP.DP_ST_DT <=", value, "dpStDt");
            return (Criteria) this;
        }

        public Criteria andDpStDtIn(List<Date> values) {
            addCriterionForJDBCDate("TDPOP.DP_ST_DT in", values, "dpStDt");
            return (Criteria) this;
        }

        public Criteria andDpStDtNotIn(List<Date> values) {
            addCriterionForJDBCDate("TDPOP.DP_ST_DT not in", values, "dpStDt");
            return (Criteria) this;
        }

        public Criteria andDpStDtBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("TDPOP.DP_ST_DT between", value1, value2, "dpStDt");
            return (Criteria) this;
        }

        public Criteria andDpStDtNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("TDPOP.DP_ST_DT not between", value1, value2, "dpStDt");
            return (Criteria) this;
        }

        public Criteria andDpEdDtIsNull() {
            addCriterion("TDPOP.DP_ED_DT is null");
            return (Criteria) this;
        }

        public Criteria andDpEdDtIsNotNull() {
            addCriterion("TDPOP.DP_ED_DT is not null");
            return (Criteria) this;
        }

        public Criteria andDpEdDtEqualTo(Date value) {
            addCriterionForJDBCDate("TDPOP.DP_ED_DT =", value, "dpEdDt");
            return (Criteria) this;
        }

        public Criteria andDpEdDtNotEqualTo(Date value) {
            addCriterionForJDBCDate("TDPOP.DP_ED_DT <>", value, "dpEdDt");
            return (Criteria) this;
        }

        public Criteria andDpEdDtGreaterThan(Date value) {
            addCriterionForJDBCDate("TDPOP.DP_ED_DT >", value, "dpEdDt");
            return (Criteria) this;
        }

        public Criteria andDpEdDtGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("TDPOP.DP_ED_DT >=", value, "dpEdDt");
            return (Criteria) this;
        }

        public Criteria andDpEdDtLessThan(Date value) {
            addCriterionForJDBCDate("TDPOP.DP_ED_DT <", value, "dpEdDt");
            return (Criteria) this;
        }

        public Criteria andDpEdDtLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("TDPOP.DP_ED_DT <=", value, "dpEdDt");
            return (Criteria) this;
        }

        public Criteria andDpEdDtIn(List<Date> values) {
            addCriterionForJDBCDate("TDPOP.DP_ED_DT in", values, "dpEdDt");
            return (Criteria) this;
        }

        public Criteria andDpEdDtNotIn(List<Date> values) {
            addCriterionForJDBCDate("TDPOP.DP_ED_DT not in", values, "dpEdDt");
            return (Criteria) this;
        }

        public Criteria andDpEdDtBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("TDPOP.DP_ED_DT between", value1, value2, "dpEdDt");
            return (Criteria) this;
        }

        public Criteria andDpEdDtNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("TDPOP.DP_ED_DT not between", value1, value2, "dpEdDt");
            return (Criteria) this;
        }

        public Criteria andDpYnIsNull() {
            addCriterion("TDPOP.DP_YN is null");
            return (Criteria) this;
        }

        public Criteria andDpYnIsNotNull() {
            addCriterion("TDPOP.DP_YN is not null");
            return (Criteria) this;
        }

        public Criteria andDpYnEqualTo(String value) {
            addCriterion("TDPOP.DP_YN =", value, "dpYn");
            return (Criteria) this;
        }

        public Criteria andDpYnNotEqualTo(String value) {
            addCriterion("TDPOP.DP_YN <>", value, "dpYn");
            return (Criteria) this;
        }

        public Criteria andDpYnGreaterThan(String value) {
            addCriterion("TDPOP.DP_YN >", value, "dpYn");
            return (Criteria) this;
        }

        public Criteria andDpYnGreaterThanOrEqualTo(String value) {
            addCriterion("TDPOP.DP_YN >=", value, "dpYn");
            return (Criteria) this;
        }

        public Criteria andDpYnLessThan(String value) {
            addCriterion("TDPOP.DP_YN <", value, "dpYn");
            return (Criteria) this;
        }

        public Criteria andDpYnLessThanOrEqualTo(String value) {
            addCriterion("TDPOP.DP_YN <=", value, "dpYn");
            return (Criteria) this;
        }

        public Criteria andDpYnLike(String value) {
            addCriterion("TDPOP.DP_YN like", value, "dpYn");
            return (Criteria) this;
        }

        public Criteria andDpYnNotLike(String value) {
            addCriterion("TDPOP.DP_YN not like", value, "dpYn");
            return (Criteria) this;
        }

        public Criteria andDpYnIn(List<String> values) {
            addCriterion("TDPOP.DP_YN in", values, "dpYn");
            return (Criteria) this;
        }

        public Criteria andDpYnNotIn(List<String> values) {
            addCriterion("TDPOP.DP_YN not in", values, "dpYn");
            return (Criteria) this;
        }

        public Criteria andDpYnBetween(String value1, String value2) {
            addCriterion("TDPOP.DP_YN between", value1, value2, "dpYn");
            return (Criteria) this;
        }

        public Criteria andDpYnNotBetween(String value1, String value2) {
            addCriterion("TDPOP.DP_YN not between", value1, value2, "dpYn");
            return (Criteria) this;
        }

        public Criteria andRegDtIsNull() {
            addCriterion("TDPOP.REG_DT is null");
            return (Criteria) this;
        }

        public Criteria andRegDtIsNotNull() {
            addCriterion("TDPOP.REG_DT is not null");
            return (Criteria) this;
        }

        public Criteria andRegDtEqualTo(Date value) {
            addCriterion("TDPOP.REG_DT =", value, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtNotEqualTo(Date value) {
            addCriterion("TDPOP.REG_DT <>", value, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtGreaterThan(Date value) {
            addCriterion("TDPOP.REG_DT >", value, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtGreaterThanOrEqualTo(Date value) {
            addCriterion("TDPOP.REG_DT >=", value, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtLessThan(Date value) {
            addCriterion("TDPOP.REG_DT <", value, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtLessThanOrEqualTo(Date value) {
            addCriterion("TDPOP.REG_DT <=", value, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtIn(List<Date> values) {
            addCriterion("TDPOP.REG_DT in", values, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtNotIn(List<Date> values) {
            addCriterion("TDPOP.REG_DT not in", values, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtBetween(Date value1, Date value2) {
            addCriterion("TDPOP.REG_DT between", value1, value2, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtNotBetween(Date value1, Date value2) {
            addCriterion("TDPOP.REG_DT not between", value1, value2, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegIdIsNull() {
            addCriterion("TDPOP.REG_ID is null");
            return (Criteria) this;
        }

        public Criteria andRegIdIsNotNull() {
            addCriterion("TDPOP.REG_ID is not null");
            return (Criteria) this;
        }

        public Criteria andRegIdEqualTo(String value) {
            addCriterion("TDPOP.REG_ID =", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdNotEqualTo(String value) {
            addCriterion("TDPOP.REG_ID <>", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdGreaterThan(String value) {
            addCriterion("TDPOP.REG_ID >", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdGreaterThanOrEqualTo(String value) {
            addCriterion("TDPOP.REG_ID >=", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdLessThan(String value) {
            addCriterion("TDPOP.REG_ID <", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdLessThanOrEqualTo(String value) {
            addCriterion("TDPOP.REG_ID <=", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdLike(String value) {
            addCriterion("TDPOP.REG_ID like", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdNotLike(String value) {
            addCriterion("TDPOP.REG_ID not like", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdIn(List<String> values) {
            addCriterion("TDPOP.REG_ID in", values, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdNotIn(List<String> values) {
            addCriterion("TDPOP.REG_ID not in", values, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdBetween(String value1, String value2) {
            addCriterion("TDPOP.REG_ID between", value1, value2, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdNotBetween(String value1, String value2) {
            addCriterion("TDPOP.REG_ID not between", value1, value2, "regId");
            return (Criteria) this;
        }

        public Criteria andModDtIsNull() {
            addCriterion("TDPOP.MOD_DT is null");
            return (Criteria) this;
        }

        public Criteria andModDtIsNotNull() {
            addCriterion("TDPOP.MOD_DT is not null");
            return (Criteria) this;
        }

        public Criteria andModDtEqualTo(Date value) {
            addCriterion("TDPOP.MOD_DT =", value, "modDt");
            return (Criteria) this;
        }

        public Criteria andModDtNotEqualTo(Date value) {
            addCriterion("TDPOP.MOD_DT <>", value, "modDt");
            return (Criteria) this;
        }

        public Criteria andModDtGreaterThan(Date value) {
            addCriterion("TDPOP.MOD_DT >", value, "modDt");
            return (Criteria) this;
        }

        public Criteria andModDtGreaterThanOrEqualTo(Date value) {
            addCriterion("TDPOP.MOD_DT >=", value, "modDt");
            return (Criteria) this;
        }

        public Criteria andModDtLessThan(Date value) {
            addCriterion("TDPOP.MOD_DT <", value, "modDt");
            return (Criteria) this;
        }

        public Criteria andModDtLessThanOrEqualTo(Date value) {
            addCriterion("TDPOP.MOD_DT <=", value, "modDt");
            return (Criteria) this;
        }

        public Criteria andModDtIn(List<Date> values) {
            addCriterion("TDPOP.MOD_DT in", values, "modDt");
            return (Criteria) this;
        }

        public Criteria andModDtNotIn(List<Date> values) {
            addCriterion("TDPOP.MOD_DT not in", values, "modDt");
            return (Criteria) this;
        }

        public Criteria andModDtBetween(Date value1, Date value2) {
            addCriterion("TDPOP.MOD_DT between", value1, value2, "modDt");
            return (Criteria) this;
        }

        public Criteria andModDtNotBetween(Date value1, Date value2) {
            addCriterion("TDPOP.MOD_DT not between", value1, value2, "modDt");
            return (Criteria) this;
        }

        public Criteria andModIdIsNull() {
            addCriterion("TDPOP.MOD_ID is null");
            return (Criteria) this;
        }

        public Criteria andModIdIsNotNull() {
            addCriterion("TDPOP.MOD_ID is not null");
            return (Criteria) this;
        }

        public Criteria andModIdEqualTo(String value) {
            addCriterion("TDPOP.MOD_ID =", value, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdNotEqualTo(String value) {
            addCriterion("TDPOP.MOD_ID <>", value, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdGreaterThan(String value) {
            addCriterion("TDPOP.MOD_ID >", value, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdGreaterThanOrEqualTo(String value) {
            addCriterion("TDPOP.MOD_ID >=", value, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdLessThan(String value) {
            addCriterion("TDPOP.MOD_ID <", value, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdLessThanOrEqualTo(String value) {
            addCriterion("TDPOP.MOD_ID <=", value, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdLike(String value) {
            addCriterion("TDPOP.MOD_ID like", value, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdNotLike(String value) {
            addCriterion("TDPOP.MOD_ID not like", value, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdIn(List<String> values) {
            addCriterion("TDPOP.MOD_ID in", values, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdNotIn(List<String> values) {
            addCriterion("TDPOP.MOD_ID not in", values, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdBetween(String value1, String value2) {
            addCriterion("TDPOP.MOD_ID between", value1, value2, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdNotBetween(String value1, String value2) {
            addCriterion("TDPOP.MOD_ID not between", value1, value2, "modId");
            return (Criteria) this;
        }

        public Criteria andUseYnIsNull() {
            addCriterion("TDPOP.USE_YN is null");
            return (Criteria) this;
        }

        public Criteria andUseYnIsNotNull() {
            addCriterion("TDPOP.USE_YN is not null");
            return (Criteria) this;
        }

        public Criteria andUseYnEqualTo(String value) {
            addCriterion("TDPOP.USE_YN =", value, "useYn");
            return (Criteria) this;
        }

        public Criteria andUseYnNotEqualTo(String value) {
            addCriterion("TDPOP.USE_YN <>", value, "useYn");
            return (Criteria) this;
        }

        public Criteria andUseYnGreaterThan(String value) {
            addCriterion("TDPOP.USE_YN >", value, "useYn");
            return (Criteria) this;
        }

        public Criteria andUseYnGreaterThanOrEqualTo(String value) {
            addCriterion("TDPOP.USE_YN >=", value, "useYn");
            return (Criteria) this;
        }

        public Criteria andUseYnLessThan(String value) {
            addCriterion("TDPOP.USE_YN <", value, "useYn");
            return (Criteria) this;
        }

        public Criteria andUseYnLessThanOrEqualTo(String value) {
            addCriterion("TDPOP.USE_YN <=", value, "useYn");
            return (Criteria) this;
        }

        public Criteria andUseYnLike(String value) {
            addCriterion("TDPOP.USE_YN like", value, "useYn");
            return (Criteria) this;
        }

        public Criteria andUseYnNotLike(String value) {
            addCriterion("TDPOP.USE_YN not like", value, "useYn");
            return (Criteria) this;
        }

        public Criteria andUseYnIn(List<String> values) {
            addCriterion("TDPOP.USE_YN in", values, "useYn");
            return (Criteria) this;
        }

        public Criteria andUseYnNotIn(List<String> values) {
            addCriterion("TDPOP.USE_YN not in", values, "useYn");
            return (Criteria) this;
        }

        public Criteria andUseYnBetween(String value1, String value2) {
            addCriterion("TDPOP.USE_YN between", value1, value2, "useYn");
            return (Criteria) this;
        }

        public Criteria andUseYnNotBetween(String value1, String value2) {
            addCriterion("TDPOP.USE_YN not between", value1, value2, "useYn");
            return (Criteria) this;
        }

        public Criteria andPopDpEnvCdLikeInsensitive(String value) {
            addCriterion("upper(TDPOP.POP_DP_ENV_CD) like", value.toUpperCase(), "popDpEnvCd");
            return (Criteria) this;
        }

        public Criteria andPopTitLikeInsensitive(String value) {
            addCriterion("upper(TDPOP.POP_TIT) like", value.toUpperCase(), "popTit");
            return (Criteria) this;
        }

        public Criteria andLinkUrlAddrLikeInsensitive(String value) {
            addCriterion("upper(TDPOP.LINK_URL_ADDR) like", value.toUpperCase(), "linkUrlAddr");
            return (Criteria) this;
        }

        public Criteria andLinkNwinYnLikeInsensitive(String value) {
            addCriterion("upper(TDPOP.LINK_NWIN_YN) like", value.toUpperCase(), "linkNwinYn");
            return (Criteria) this;
        }

        public Criteria andDpYnLikeInsensitive(String value) {
            addCriterion("upper(TDPOP.DP_YN) like", value.toUpperCase(), "dpYn");
            return (Criteria) this;
        }

        public Criteria andRegIdLikeInsensitive(String value) {
            addCriterion("upper(TDPOP.REG_ID) like", value.toUpperCase(), "regId");
            return (Criteria) this;
        }

        public Criteria andModIdLikeInsensitive(String value) {
            addCriterion("upper(TDPOP.MOD_ID) like", value.toUpperCase(), "modId");
            return (Criteria) this;
        }

        public Criteria andUseYnLikeInsensitive(String value) {
            addCriterion("upper(TDPOP.USE_YN) like", value.toUpperCase(), "useYn");
            return (Criteria) this;
        }

        public Criteria andPopDpEnvCdLikeLeft(String value) {
            addCriterion("TDPOP.POP_DP_ENV_CD like ", "%" + value, "popDpEnvCd");
            return (Criteria) this;
        }

        public Criteria andPopDpEnvCdLikeRight(String value) {
            addCriterion("TDPOP.POP_DP_ENV_CD like ", value + "%", "popDpEnvCd");
            return (Criteria) this;
        }

        public Criteria andPopDpEnvCdLikeBoth(String value) {
            addCriterion("TDPOP.POP_DP_ENV_CD like ", "%" + value + "%", "popDpEnvCd");
            return (Criteria) this;
        }

        public Criteria andPopTitLikeLeft(String value) {
            addCriterion("TDPOP.POP_TIT like ", "%" + value, "popTit");
            return (Criteria) this;
        }

        public Criteria andPopTitLikeRight(String value) {
            addCriterion("TDPOP.POP_TIT like ", value + "%", "popTit");
            return (Criteria) this;
        }

        public Criteria andPopTitLikeBoth(String value) {
            addCriterion("TDPOP.POP_TIT like ", "%" + value + "%", "popTit");
            return (Criteria) this;
        }

        public Criteria andLinkUrlAddrLikeLeft(String value) {
            addCriterion("TDPOP.LINK_URL_ADDR like ", "%" + value, "linkUrlAddr");
            return (Criteria) this;
        }

        public Criteria andLinkUrlAddrLikeRight(String value) {
            addCriterion("TDPOP.LINK_URL_ADDR like ", value + "%", "linkUrlAddr");
            return (Criteria) this;
        }

        public Criteria andLinkUrlAddrLikeBoth(String value) {
            addCriterion("TDPOP.LINK_URL_ADDR like ", "%" + value + "%", "linkUrlAddr");
            return (Criteria) this;
        }

        public Criteria andLinkNwinYnLikeLeft(String value) {
            addCriterion("TDPOP.LINK_NWIN_YN like ", "%" + value, "linkNwinYn");
            return (Criteria) this;
        }

        public Criteria andLinkNwinYnLikeRight(String value) {
            addCriterion("TDPOP.LINK_NWIN_YN like ", value + "%", "linkNwinYn");
            return (Criteria) this;
        }

        public Criteria andLinkNwinYnLikeBoth(String value) {
            addCriterion("TDPOP.LINK_NWIN_YN like ", "%" + value + "%", "linkNwinYn");
            return (Criteria) this;
        }

        public Criteria andDpYnLikeLeft(String value) {
            addCriterion("TDPOP.DP_YN like ", "%" + value, "dpYn");
            return (Criteria) this;
        }

        public Criteria andDpYnLikeRight(String value) {
            addCriterion("TDPOP.DP_YN like ", value + "%", "dpYn");
            return (Criteria) this;
        }

        public Criteria andDpYnLikeBoth(String value) {
            addCriterion("TDPOP.DP_YN like ", "%" + value + "%", "dpYn");
            return (Criteria) this;
        }

        public Criteria andRegIdLikeLeft(String value) {
            addCriterion("TDPOP.REG_ID like ", "%" + value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdLikeRight(String value) {
            addCriterion("TDPOP.REG_ID like ", value + "%", "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdLikeBoth(String value) {
            addCriterion("TDPOP.REG_ID like ", "%" + value + "%", "regId");
            return (Criteria) this;
        }

        public Criteria andModIdLikeLeft(String value) {
            addCriterion("TDPOP.MOD_ID like ", "%" + value, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdLikeRight(String value) {
            addCriterion("TDPOP.MOD_ID like ", value + "%", "modId");
            return (Criteria) this;
        }

        public Criteria andModIdLikeBoth(String value) {
            addCriterion("TDPOP.MOD_ID like ", "%" + value + "%", "modId");
            return (Criteria) this;
        }

        public Criteria andUseYnLikeLeft(String value) {
            addCriterion("TDPOP.USE_YN like ", "%" + value, "useYn");
            return (Criteria) this;
        }

        public Criteria andUseYnLikeRight(String value) {
            addCriterion("TDPOP.USE_YN like ", value + "%", "useYn");
            return (Criteria) this;
        }

        public Criteria andUseYnLikeBoth(String value) {
            addCriterion("TDPOP.USE_YN like ", "%" + value + "%", "useYn");
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