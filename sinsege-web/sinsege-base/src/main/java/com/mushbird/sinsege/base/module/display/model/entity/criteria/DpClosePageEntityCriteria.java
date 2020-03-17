package com.mushbird.sinsege.base.module.display.model.entity.criteria;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class DpClosePageEntityCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    public DpClosePageEntityCriteria() {
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

        public Criteria andDpChIdIsNull() {
            addCriterion("TDCP.DP_CH_ID is null");
            return (Criteria) this;
        }

        public Criteria andDpChIdIsNotNull() {
            addCriterion("TDCP.DP_CH_ID is not null");
            return (Criteria) this;
        }

        public Criteria andDpChIdEqualTo(Integer value) {
            addCriterion("TDCP.DP_CH_ID =", value, "dpChId");
            return (Criteria) this;
        }

        public Criteria andDpChIdNotEqualTo(Integer value) {
            addCriterion("TDCP.DP_CH_ID <>", value, "dpChId");
            return (Criteria) this;
        }

        public Criteria andDpChIdGreaterThan(Integer value) {
            addCriterion("TDCP.DP_CH_ID >", value, "dpChId");
            return (Criteria) this;
        }

        public Criteria andDpChIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("TDCP.DP_CH_ID >=", value, "dpChId");
            return (Criteria) this;
        }

        public Criteria andDpChIdLessThan(Integer value) {
            addCriterion("TDCP.DP_CH_ID <", value, "dpChId");
            return (Criteria) this;
        }

        public Criteria andDpChIdLessThanOrEqualTo(Integer value) {
            addCriterion("TDCP.DP_CH_ID <=", value, "dpChId");
            return (Criteria) this;
        }

        public Criteria andDpChIdIn(List<Integer> values) {
            addCriterion("TDCP.DP_CH_ID in", values, "dpChId");
            return (Criteria) this;
        }

        public Criteria andDpChIdNotIn(List<Integer> values) {
            addCriterion("TDCP.DP_CH_ID not in", values, "dpChId");
            return (Criteria) this;
        }

        public Criteria andDpChIdBetween(Integer value1, Integer value2) {
            addCriterion("TDCP.DP_CH_ID between", value1, value2, "dpChId");
            return (Criteria) this;
        }

        public Criteria andDpChIdNotBetween(Integer value1, Integer value2) {
            addCriterion("TDCP.DP_CH_ID not between", value1, value2, "dpChId");
            return (Criteria) this;
        }

        public Criteria andPageDescIsNull() {
            addCriterion("TDCP.PAGE_DESC is null");
            return (Criteria) this;
        }

        public Criteria andPageDescIsNotNull() {
            addCriterion("TDCP.PAGE_DESC is not null");
            return (Criteria) this;
        }

        public Criteria andPageDescEqualTo(String value) {
            addCriterion("TDCP.PAGE_DESC =", value, "pageDesc");
            return (Criteria) this;
        }

        public Criteria andPageDescNotEqualTo(String value) {
            addCriterion("TDCP.PAGE_DESC <>", value, "pageDesc");
            return (Criteria) this;
        }

        public Criteria andPageDescGreaterThan(String value) {
            addCriterion("TDCP.PAGE_DESC >", value, "pageDesc");
            return (Criteria) this;
        }

        public Criteria andPageDescGreaterThanOrEqualTo(String value) {
            addCriterion("TDCP.PAGE_DESC >=", value, "pageDesc");
            return (Criteria) this;
        }

        public Criteria andPageDescLessThan(String value) {
            addCriterion("TDCP.PAGE_DESC <", value, "pageDesc");
            return (Criteria) this;
        }

        public Criteria andPageDescLessThanOrEqualTo(String value) {
            addCriterion("TDCP.PAGE_DESC <=", value, "pageDesc");
            return (Criteria) this;
        }

        public Criteria andPageDescLike(String value) {
            addCriterion("TDCP.PAGE_DESC like", value, "pageDesc");
            return (Criteria) this;
        }

        public Criteria andPageDescNotLike(String value) {
            addCriterion("TDCP.PAGE_DESC not like", value, "pageDesc");
            return (Criteria) this;
        }

        public Criteria andPageDescIn(List<String> values) {
            addCriterion("TDCP.PAGE_DESC in", values, "pageDesc");
            return (Criteria) this;
        }

        public Criteria andPageDescNotIn(List<String> values) {
            addCriterion("TDCP.PAGE_DESC not in", values, "pageDesc");
            return (Criteria) this;
        }

        public Criteria andPageDescBetween(String value1, String value2) {
            addCriterion("TDCP.PAGE_DESC between", value1, value2, "pageDesc");
            return (Criteria) this;
        }

        public Criteria andPageDescNotBetween(String value1, String value2) {
            addCriterion("TDCP.PAGE_DESC not between", value1, value2, "pageDesc");
            return (Criteria) this;
        }

        public Criteria andPrgsStDtIsNull() {
            addCriterion("TDCP.PRGS_ST_DT is null");
            return (Criteria) this;
        }

        public Criteria andPrgsStDtIsNotNull() {
            addCriterion("TDCP.PRGS_ST_DT is not null");
            return (Criteria) this;
        }

        public Criteria andPrgsStDtEqualTo(Date value) {
            addCriterionForJDBCDate("TDCP.PRGS_ST_DT =", value, "prgsStDt");
            return (Criteria) this;
        }

        public Criteria andPrgsStDtNotEqualTo(Date value) {
            addCriterionForJDBCDate("TDCP.PRGS_ST_DT <>", value, "prgsStDt");
            return (Criteria) this;
        }

        public Criteria andPrgsStDtGreaterThan(Date value) {
            addCriterionForJDBCDate("TDCP.PRGS_ST_DT >", value, "prgsStDt");
            return (Criteria) this;
        }

        public Criteria andPrgsStDtGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("TDCP.PRGS_ST_DT >=", value, "prgsStDt");
            return (Criteria) this;
        }

        public Criteria andPrgsStDtLessThan(Date value) {
            addCriterionForJDBCDate("TDCP.PRGS_ST_DT <", value, "prgsStDt");
            return (Criteria) this;
        }

        public Criteria andPrgsStDtLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("TDCP.PRGS_ST_DT <=", value, "prgsStDt");
            return (Criteria) this;
        }

        public Criteria andPrgsStDtIn(List<Date> values) {
            addCriterionForJDBCDate("TDCP.PRGS_ST_DT in", values, "prgsStDt");
            return (Criteria) this;
        }

        public Criteria andPrgsStDtNotIn(List<Date> values) {
            addCriterionForJDBCDate("TDCP.PRGS_ST_DT not in", values, "prgsStDt");
            return (Criteria) this;
        }

        public Criteria andPrgsStDtBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("TDCP.PRGS_ST_DT between", value1, value2, "prgsStDt");
            return (Criteria) this;
        }

        public Criteria andPrgsStDtNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("TDCP.PRGS_ST_DT not between", value1, value2, "prgsStDt");
            return (Criteria) this;
        }

        public Criteria andPrgsEdDtIsNull() {
            addCriterion("TDCP.PRGS_ED_DT is null");
            return (Criteria) this;
        }

        public Criteria andPrgsEdDtIsNotNull() {
            addCriterion("TDCP.PRGS_ED_DT is not null");
            return (Criteria) this;
        }

        public Criteria andPrgsEdDtEqualTo(Date value) {
            addCriterionForJDBCDate("TDCP.PRGS_ED_DT =", value, "prgsEdDt");
            return (Criteria) this;
        }

        public Criteria andPrgsEdDtNotEqualTo(Date value) {
            addCriterionForJDBCDate("TDCP.PRGS_ED_DT <>", value, "prgsEdDt");
            return (Criteria) this;
        }

        public Criteria andPrgsEdDtGreaterThan(Date value) {
            addCriterionForJDBCDate("TDCP.PRGS_ED_DT >", value, "prgsEdDt");
            return (Criteria) this;
        }

        public Criteria andPrgsEdDtGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("TDCP.PRGS_ED_DT >=", value, "prgsEdDt");
            return (Criteria) this;
        }

        public Criteria andPrgsEdDtLessThan(Date value) {
            addCriterionForJDBCDate("TDCP.PRGS_ED_DT <", value, "prgsEdDt");
            return (Criteria) this;
        }

        public Criteria andPrgsEdDtLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("TDCP.PRGS_ED_DT <=", value, "prgsEdDt");
            return (Criteria) this;
        }

        public Criteria andPrgsEdDtIn(List<Date> values) {
            addCriterionForJDBCDate("TDCP.PRGS_ED_DT in", values, "prgsEdDt");
            return (Criteria) this;
        }

        public Criteria andPrgsEdDtNotIn(List<Date> values) {
            addCriterionForJDBCDate("TDCP.PRGS_ED_DT not in", values, "prgsEdDt");
            return (Criteria) this;
        }

        public Criteria andPrgsEdDtBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("TDCP.PRGS_ED_DT between", value1, value2, "prgsEdDt");
            return (Criteria) this;
        }

        public Criteria andPrgsEdDtNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("TDCP.PRGS_ED_DT not between", value1, value2, "prgsEdDt");
            return (Criteria) this;
        }

        public Criteria andAccsCdIsNull() {
            addCriterion("TDCP.ACCS_CD is null");
            return (Criteria) this;
        }

        public Criteria andAccsCdIsNotNull() {
            addCriterion("TDCP.ACCS_CD is not null");
            return (Criteria) this;
        }

        public Criteria andAccsCdEqualTo(String value) {
            addCriterion("TDCP.ACCS_CD =", value, "accsCd");
            return (Criteria) this;
        }

        public Criteria andAccsCdNotEqualTo(String value) {
            addCriterion("TDCP.ACCS_CD <>", value, "accsCd");
            return (Criteria) this;
        }

        public Criteria andAccsCdGreaterThan(String value) {
            addCriterion("TDCP.ACCS_CD >", value, "accsCd");
            return (Criteria) this;
        }

        public Criteria andAccsCdGreaterThanOrEqualTo(String value) {
            addCriterion("TDCP.ACCS_CD >=", value, "accsCd");
            return (Criteria) this;
        }

        public Criteria andAccsCdLessThan(String value) {
            addCriterion("TDCP.ACCS_CD <", value, "accsCd");
            return (Criteria) this;
        }

        public Criteria andAccsCdLessThanOrEqualTo(String value) {
            addCriterion("TDCP.ACCS_CD <=", value, "accsCd");
            return (Criteria) this;
        }

        public Criteria andAccsCdLike(String value) {
            addCriterion("TDCP.ACCS_CD like", value, "accsCd");
            return (Criteria) this;
        }

        public Criteria andAccsCdNotLike(String value) {
            addCriterion("TDCP.ACCS_CD not like", value, "accsCd");
            return (Criteria) this;
        }

        public Criteria andAccsCdIn(List<String> values) {
            addCriterion("TDCP.ACCS_CD in", values, "accsCd");
            return (Criteria) this;
        }

        public Criteria andAccsCdNotIn(List<String> values) {
            addCriterion("TDCP.ACCS_CD not in", values, "accsCd");
            return (Criteria) this;
        }

        public Criteria andAccsCdBetween(String value1, String value2) {
            addCriterion("TDCP.ACCS_CD between", value1, value2, "accsCd");
            return (Criteria) this;
        }

        public Criteria andAccsCdNotBetween(String value1, String value2) {
            addCriterion("TDCP.ACCS_CD not between", value1, value2, "accsCd");
            return (Criteria) this;
        }

        public Criteria andAccsUrlIsNull() {
            addCriterion("TDCP.ACCS_URL is null");
            return (Criteria) this;
        }

        public Criteria andAccsUrlIsNotNull() {
            addCriterion("TDCP.ACCS_URL is not null");
            return (Criteria) this;
        }

        public Criteria andAccsUrlEqualTo(String value) {
            addCriterion("TDCP.ACCS_URL =", value, "accsUrl");
            return (Criteria) this;
        }

        public Criteria andAccsUrlNotEqualTo(String value) {
            addCriterion("TDCP.ACCS_URL <>", value, "accsUrl");
            return (Criteria) this;
        }

        public Criteria andAccsUrlGreaterThan(String value) {
            addCriterion("TDCP.ACCS_URL >", value, "accsUrl");
            return (Criteria) this;
        }

        public Criteria andAccsUrlGreaterThanOrEqualTo(String value) {
            addCriterion("TDCP.ACCS_URL >=", value, "accsUrl");
            return (Criteria) this;
        }

        public Criteria andAccsUrlLessThan(String value) {
            addCriterion("TDCP.ACCS_URL <", value, "accsUrl");
            return (Criteria) this;
        }

        public Criteria andAccsUrlLessThanOrEqualTo(String value) {
            addCriterion("TDCP.ACCS_URL <=", value, "accsUrl");
            return (Criteria) this;
        }

        public Criteria andAccsUrlLike(String value) {
            addCriterion("TDCP.ACCS_URL like", value, "accsUrl");
            return (Criteria) this;
        }

        public Criteria andAccsUrlNotLike(String value) {
            addCriterion("TDCP.ACCS_URL not like", value, "accsUrl");
            return (Criteria) this;
        }

        public Criteria andAccsUrlIn(List<String> values) {
            addCriterion("TDCP.ACCS_URL in", values, "accsUrl");
            return (Criteria) this;
        }

        public Criteria andAccsUrlNotIn(List<String> values) {
            addCriterion("TDCP.ACCS_URL not in", values, "accsUrl");
            return (Criteria) this;
        }

        public Criteria andAccsUrlBetween(String value1, String value2) {
            addCriterion("TDCP.ACCS_URL between", value1, value2, "accsUrl");
            return (Criteria) this;
        }

        public Criteria andAccsUrlNotBetween(String value1, String value2) {
            addCriterion("TDCP.ACCS_URL not between", value1, value2, "accsUrl");
            return (Criteria) this;
        }

        public Criteria andAccsUrlQrcdIsNull() {
            addCriterion("TDCP.ACCS_URL_QRCD is null");
            return (Criteria) this;
        }

        public Criteria andAccsUrlQrcdIsNotNull() {
            addCriterion("TDCP.ACCS_URL_QRCD is not null");
            return (Criteria) this;
        }

        public Criteria andAccsUrlQrcdEqualTo(String value) {
            addCriterion("TDCP.ACCS_URL_QRCD =", value, "accsUrlQrcd");
            return (Criteria) this;
        }

        public Criteria andAccsUrlQrcdNotEqualTo(String value) {
            addCriterion("TDCP.ACCS_URL_QRCD <>", value, "accsUrlQrcd");
            return (Criteria) this;
        }

        public Criteria andAccsUrlQrcdGreaterThan(String value) {
            addCriterion("TDCP.ACCS_URL_QRCD >", value, "accsUrlQrcd");
            return (Criteria) this;
        }

        public Criteria andAccsUrlQrcdGreaterThanOrEqualTo(String value) {
            addCriterion("TDCP.ACCS_URL_QRCD >=", value, "accsUrlQrcd");
            return (Criteria) this;
        }

        public Criteria andAccsUrlQrcdLessThan(String value) {
            addCriterion("TDCP.ACCS_URL_QRCD <", value, "accsUrlQrcd");
            return (Criteria) this;
        }

        public Criteria andAccsUrlQrcdLessThanOrEqualTo(String value) {
            addCriterion("TDCP.ACCS_URL_QRCD <=", value, "accsUrlQrcd");
            return (Criteria) this;
        }

        public Criteria andAccsUrlQrcdLike(String value) {
            addCriterion("TDCP.ACCS_URL_QRCD like", value, "accsUrlQrcd");
            return (Criteria) this;
        }

        public Criteria andAccsUrlQrcdNotLike(String value) {
            addCriterion("TDCP.ACCS_URL_QRCD not like", value, "accsUrlQrcd");
            return (Criteria) this;
        }

        public Criteria andAccsUrlQrcdIn(List<String> values) {
            addCriterion("TDCP.ACCS_URL_QRCD in", values, "accsUrlQrcd");
            return (Criteria) this;
        }

        public Criteria andAccsUrlQrcdNotIn(List<String> values) {
            addCriterion("TDCP.ACCS_URL_QRCD not in", values, "accsUrlQrcd");
            return (Criteria) this;
        }

        public Criteria andAccsUrlQrcdBetween(String value1, String value2) {
            addCriterion("TDCP.ACCS_URL_QRCD between", value1, value2, "accsUrlQrcd");
            return (Criteria) this;
        }

        public Criteria andAccsUrlQrcdNotBetween(String value1, String value2) {
            addCriterion("TDCP.ACCS_URL_QRCD not between", value1, value2, "accsUrlQrcd");
            return (Criteria) this;
        }

        public Criteria andMbrTgtCdIsNull() {
            addCriterion("TDCP.MBR_TGT_CD is null");
            return (Criteria) this;
        }

        public Criteria andMbrTgtCdIsNotNull() {
            addCriterion("TDCP.MBR_TGT_CD is not null");
            return (Criteria) this;
        }

        public Criteria andMbrTgtCdEqualTo(String value) {
            addCriterion("TDCP.MBR_TGT_CD =", value, "mbrTgtCd");
            return (Criteria) this;
        }

        public Criteria andMbrTgtCdNotEqualTo(String value) {
            addCriterion("TDCP.MBR_TGT_CD <>", value, "mbrTgtCd");
            return (Criteria) this;
        }

        public Criteria andMbrTgtCdGreaterThan(String value) {
            addCriterion("TDCP.MBR_TGT_CD >", value, "mbrTgtCd");
            return (Criteria) this;
        }

        public Criteria andMbrTgtCdGreaterThanOrEqualTo(String value) {
            addCriterion("TDCP.MBR_TGT_CD >=", value, "mbrTgtCd");
            return (Criteria) this;
        }

        public Criteria andMbrTgtCdLessThan(String value) {
            addCriterion("TDCP.MBR_TGT_CD <", value, "mbrTgtCd");
            return (Criteria) this;
        }

        public Criteria andMbrTgtCdLessThanOrEqualTo(String value) {
            addCriterion("TDCP.MBR_TGT_CD <=", value, "mbrTgtCd");
            return (Criteria) this;
        }

        public Criteria andMbrTgtCdLike(String value) {
            addCriterion("TDCP.MBR_TGT_CD like", value, "mbrTgtCd");
            return (Criteria) this;
        }

        public Criteria andMbrTgtCdNotLike(String value) {
            addCriterion("TDCP.MBR_TGT_CD not like", value, "mbrTgtCd");
            return (Criteria) this;
        }

        public Criteria andMbrTgtCdIn(List<String> values) {
            addCriterion("TDCP.MBR_TGT_CD in", values, "mbrTgtCd");
            return (Criteria) this;
        }

        public Criteria andMbrTgtCdNotIn(List<String> values) {
            addCriterion("TDCP.MBR_TGT_CD not in", values, "mbrTgtCd");
            return (Criteria) this;
        }

        public Criteria andMbrTgtCdBetween(String value1, String value2) {
            addCriterion("TDCP.MBR_TGT_CD between", value1, value2, "mbrTgtCd");
            return (Criteria) this;
        }

        public Criteria andMbrTgtCdNotBetween(String value1, String value2) {
            addCriterion("TDCP.MBR_TGT_CD not between", value1, value2, "mbrTgtCd");
            return (Criteria) this;
        }

        public Criteria andPageContPcIsNull() {
            addCriterion("TDCP.PAGE_CONT_PC is null");
            return (Criteria) this;
        }

        public Criteria andPageContPcIsNotNull() {
            addCriterion("TDCP.PAGE_CONT_PC is not null");
            return (Criteria) this;
        }

        public Criteria andPageContPcEqualTo(String value) {
            addCriterion("TDCP.PAGE_CONT_PC =", value, "pageContPc");
            return (Criteria) this;
        }

        public Criteria andPageContPcNotEqualTo(String value) {
            addCriterion("TDCP.PAGE_CONT_PC <>", value, "pageContPc");
            return (Criteria) this;
        }

        public Criteria andPageContPcGreaterThan(String value) {
            addCriterion("TDCP.PAGE_CONT_PC >", value, "pageContPc");
            return (Criteria) this;
        }

        public Criteria andPageContPcGreaterThanOrEqualTo(String value) {
            addCriterion("TDCP.PAGE_CONT_PC >=", value, "pageContPc");
            return (Criteria) this;
        }

        public Criteria andPageContPcLessThan(String value) {
            addCriterion("TDCP.PAGE_CONT_PC <", value, "pageContPc");
            return (Criteria) this;
        }

        public Criteria andPageContPcLessThanOrEqualTo(String value) {
            addCriterion("TDCP.PAGE_CONT_PC <=", value, "pageContPc");
            return (Criteria) this;
        }

        public Criteria andPageContPcLike(String value) {
            addCriterion("TDCP.PAGE_CONT_PC like", value, "pageContPc");
            return (Criteria) this;
        }

        public Criteria andPageContPcNotLike(String value) {
            addCriterion("TDCP.PAGE_CONT_PC not like", value, "pageContPc");
            return (Criteria) this;
        }

        public Criteria andPageContPcIn(List<String> values) {
            addCriterion("TDCP.PAGE_CONT_PC in", values, "pageContPc");
            return (Criteria) this;
        }

        public Criteria andPageContPcNotIn(List<String> values) {
            addCriterion("TDCP.PAGE_CONT_PC not in", values, "pageContPc");
            return (Criteria) this;
        }

        public Criteria andPageContPcBetween(String value1, String value2) {
            addCriterion("TDCP.PAGE_CONT_PC between", value1, value2, "pageContPc");
            return (Criteria) this;
        }

        public Criteria andPageContPcNotBetween(String value1, String value2) {
            addCriterion("TDCP.PAGE_CONT_PC not between", value1, value2, "pageContPc");
            return (Criteria) this;
        }

        public Criteria andPageContMobIsNull() {
            addCriterion("TDCP.PAGE_CONT_MOB is null");
            return (Criteria) this;
        }

        public Criteria andPageContMobIsNotNull() {
            addCriterion("TDCP.PAGE_CONT_MOB is not null");
            return (Criteria) this;
        }

        public Criteria andPageContMobEqualTo(String value) {
            addCriterion("TDCP.PAGE_CONT_MOB =", value, "pageContMob");
            return (Criteria) this;
        }

        public Criteria andPageContMobNotEqualTo(String value) {
            addCriterion("TDCP.PAGE_CONT_MOB <>", value, "pageContMob");
            return (Criteria) this;
        }

        public Criteria andPageContMobGreaterThan(String value) {
            addCriterion("TDCP.PAGE_CONT_MOB >", value, "pageContMob");
            return (Criteria) this;
        }

        public Criteria andPageContMobGreaterThanOrEqualTo(String value) {
            addCriterion("TDCP.PAGE_CONT_MOB >=", value, "pageContMob");
            return (Criteria) this;
        }

        public Criteria andPageContMobLessThan(String value) {
            addCriterion("TDCP.PAGE_CONT_MOB <", value, "pageContMob");
            return (Criteria) this;
        }

        public Criteria andPageContMobLessThanOrEqualTo(String value) {
            addCriterion("TDCP.PAGE_CONT_MOB <=", value, "pageContMob");
            return (Criteria) this;
        }

        public Criteria andPageContMobLike(String value) {
            addCriterion("TDCP.PAGE_CONT_MOB like", value, "pageContMob");
            return (Criteria) this;
        }

        public Criteria andPageContMobNotLike(String value) {
            addCriterion("TDCP.PAGE_CONT_MOB not like", value, "pageContMob");
            return (Criteria) this;
        }

        public Criteria andPageContMobIn(List<String> values) {
            addCriterion("TDCP.PAGE_CONT_MOB in", values, "pageContMob");
            return (Criteria) this;
        }

        public Criteria andPageContMobNotIn(List<String> values) {
            addCriterion("TDCP.PAGE_CONT_MOB not in", values, "pageContMob");
            return (Criteria) this;
        }

        public Criteria andPageContMobBetween(String value1, String value2) {
            addCriterion("TDCP.PAGE_CONT_MOB between", value1, value2, "pageContMob");
            return (Criteria) this;
        }

        public Criteria andPageContMobNotBetween(String value1, String value2) {
            addCriterion("TDCP.PAGE_CONT_MOB not between", value1, value2, "pageContMob");
            return (Criteria) this;
        }

        public Criteria andDpYnIsNull() {
            addCriterion("TDCP.DP_YN is null");
            return (Criteria) this;
        }

        public Criteria andDpYnIsNotNull() {
            addCriterion("TDCP.DP_YN is not null");
            return (Criteria) this;
        }

        public Criteria andDpYnEqualTo(String value) {
            addCriterion("TDCP.DP_YN =", value, "dpYn");
            return (Criteria) this;
        }

        public Criteria andDpYnNotEqualTo(String value) {
            addCriterion("TDCP.DP_YN <>", value, "dpYn");
            return (Criteria) this;
        }

        public Criteria andDpYnGreaterThan(String value) {
            addCriterion("TDCP.DP_YN >", value, "dpYn");
            return (Criteria) this;
        }

        public Criteria andDpYnGreaterThanOrEqualTo(String value) {
            addCriterion("TDCP.DP_YN >=", value, "dpYn");
            return (Criteria) this;
        }

        public Criteria andDpYnLessThan(String value) {
            addCriterion("TDCP.DP_YN <", value, "dpYn");
            return (Criteria) this;
        }

        public Criteria andDpYnLessThanOrEqualTo(String value) {
            addCriterion("TDCP.DP_YN <=", value, "dpYn");
            return (Criteria) this;
        }

        public Criteria andDpYnLike(String value) {
            addCriterion("TDCP.DP_YN like", value, "dpYn");
            return (Criteria) this;
        }

        public Criteria andDpYnNotLike(String value) {
            addCriterion("TDCP.DP_YN not like", value, "dpYn");
            return (Criteria) this;
        }

        public Criteria andDpYnIn(List<String> values) {
            addCriterion("TDCP.DP_YN in", values, "dpYn");
            return (Criteria) this;
        }

        public Criteria andDpYnNotIn(List<String> values) {
            addCriterion("TDCP.DP_YN not in", values, "dpYn");
            return (Criteria) this;
        }

        public Criteria andDpYnBetween(String value1, String value2) {
            addCriterion("TDCP.DP_YN between", value1, value2, "dpYn");
            return (Criteria) this;
        }

        public Criteria andDpYnNotBetween(String value1, String value2) {
            addCriterion("TDCP.DP_YN not between", value1, value2, "dpYn");
            return (Criteria) this;
        }

        public Criteria andRegDtIsNull() {
            addCriterion("TDCP.REG_DT is null");
            return (Criteria) this;
        }

        public Criteria andRegDtIsNotNull() {
            addCriterion("TDCP.REG_DT is not null");
            return (Criteria) this;
        }

        public Criteria andRegDtEqualTo(Date value) {
            addCriterion("TDCP.REG_DT =", value, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtNotEqualTo(Date value) {
            addCriterion("TDCP.REG_DT <>", value, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtGreaterThan(Date value) {
            addCriterion("TDCP.REG_DT >", value, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtGreaterThanOrEqualTo(Date value) {
            addCriterion("TDCP.REG_DT >=", value, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtLessThan(Date value) {
            addCriterion("TDCP.REG_DT <", value, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtLessThanOrEqualTo(Date value) {
            addCriterion("TDCP.REG_DT <=", value, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtIn(List<Date> values) {
            addCriterion("TDCP.REG_DT in", values, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtNotIn(List<Date> values) {
            addCriterion("TDCP.REG_DT not in", values, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtBetween(Date value1, Date value2) {
            addCriterion("TDCP.REG_DT between", value1, value2, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtNotBetween(Date value1, Date value2) {
            addCriterion("TDCP.REG_DT not between", value1, value2, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegIdIsNull() {
            addCriterion("TDCP.REG_ID is null");
            return (Criteria) this;
        }

        public Criteria andRegIdIsNotNull() {
            addCriterion("TDCP.REG_ID is not null");
            return (Criteria) this;
        }

        public Criteria andRegIdEqualTo(String value) {
            addCriterion("TDCP.REG_ID =", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdNotEqualTo(String value) {
            addCriterion("TDCP.REG_ID <>", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdGreaterThan(String value) {
            addCriterion("TDCP.REG_ID >", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdGreaterThanOrEqualTo(String value) {
            addCriterion("TDCP.REG_ID >=", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdLessThan(String value) {
            addCriterion("TDCP.REG_ID <", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdLessThanOrEqualTo(String value) {
            addCriterion("TDCP.REG_ID <=", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdLike(String value) {
            addCriterion("TDCP.REG_ID like", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdNotLike(String value) {
            addCriterion("TDCP.REG_ID not like", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdIn(List<String> values) {
            addCriterion("TDCP.REG_ID in", values, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdNotIn(List<String> values) {
            addCriterion("TDCP.REG_ID not in", values, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdBetween(String value1, String value2) {
            addCriterion("TDCP.REG_ID between", value1, value2, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdNotBetween(String value1, String value2) {
            addCriterion("TDCP.REG_ID not between", value1, value2, "regId");
            return (Criteria) this;
        }

        public Criteria andModDtIsNull() {
            addCriterion("TDCP.MOD_DT is null");
            return (Criteria) this;
        }

        public Criteria andModDtIsNotNull() {
            addCriterion("TDCP.MOD_DT is not null");
            return (Criteria) this;
        }

        public Criteria andModDtEqualTo(Date value) {
            addCriterion("TDCP.MOD_DT =", value, "modDt");
            return (Criteria) this;
        }

        public Criteria andModDtNotEqualTo(Date value) {
            addCriterion("TDCP.MOD_DT <>", value, "modDt");
            return (Criteria) this;
        }

        public Criteria andModDtGreaterThan(Date value) {
            addCriterion("TDCP.MOD_DT >", value, "modDt");
            return (Criteria) this;
        }

        public Criteria andModDtGreaterThanOrEqualTo(Date value) {
            addCriterion("TDCP.MOD_DT >=", value, "modDt");
            return (Criteria) this;
        }

        public Criteria andModDtLessThan(Date value) {
            addCriterion("TDCP.MOD_DT <", value, "modDt");
            return (Criteria) this;
        }

        public Criteria andModDtLessThanOrEqualTo(Date value) {
            addCriterion("TDCP.MOD_DT <=", value, "modDt");
            return (Criteria) this;
        }

        public Criteria andModDtIn(List<Date> values) {
            addCriterion("TDCP.MOD_DT in", values, "modDt");
            return (Criteria) this;
        }

        public Criteria andModDtNotIn(List<Date> values) {
            addCriterion("TDCP.MOD_DT not in", values, "modDt");
            return (Criteria) this;
        }

        public Criteria andModDtBetween(Date value1, Date value2) {
            addCriterion("TDCP.MOD_DT between", value1, value2, "modDt");
            return (Criteria) this;
        }

        public Criteria andModDtNotBetween(Date value1, Date value2) {
            addCriterion("TDCP.MOD_DT not between", value1, value2, "modDt");
            return (Criteria) this;
        }

        public Criteria andModIdIsNull() {
            addCriterion("TDCP.MOD_ID is null");
            return (Criteria) this;
        }

        public Criteria andModIdIsNotNull() {
            addCriterion("TDCP.MOD_ID is not null");
            return (Criteria) this;
        }

        public Criteria andModIdEqualTo(String value) {
            addCriterion("TDCP.MOD_ID =", value, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdNotEqualTo(String value) {
            addCriterion("TDCP.MOD_ID <>", value, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdGreaterThan(String value) {
            addCriterion("TDCP.MOD_ID >", value, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdGreaterThanOrEqualTo(String value) {
            addCriterion("TDCP.MOD_ID >=", value, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdLessThan(String value) {
            addCriterion("TDCP.MOD_ID <", value, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdLessThanOrEqualTo(String value) {
            addCriterion("TDCP.MOD_ID <=", value, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdLike(String value) {
            addCriterion("TDCP.MOD_ID like", value, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdNotLike(String value) {
            addCriterion("TDCP.MOD_ID not like", value, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdIn(List<String> values) {
            addCriterion("TDCP.MOD_ID in", values, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdNotIn(List<String> values) {
            addCriterion("TDCP.MOD_ID not in", values, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdBetween(String value1, String value2) {
            addCriterion("TDCP.MOD_ID between", value1, value2, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdNotBetween(String value1, String value2) {
            addCriterion("TDCP.MOD_ID not between", value1, value2, "modId");
            return (Criteria) this;
        }

        public Criteria andPageDescLikeInsensitive(String value) {
            addCriterion("upper(TDCP.PAGE_DESC) like", value.toUpperCase(), "pageDesc");
            return (Criteria) this;
        }

        public Criteria andAccsCdLikeInsensitive(String value) {
            addCriterion("upper(TDCP.ACCS_CD) like", value.toUpperCase(), "accsCd");
            return (Criteria) this;
        }

        public Criteria andAccsUrlLikeInsensitive(String value) {
            addCriterion("upper(TDCP.ACCS_URL) like", value.toUpperCase(), "accsUrl");
            return (Criteria) this;
        }

        public Criteria andAccsUrlQrcdLikeInsensitive(String value) {
            addCriterion("upper(TDCP.ACCS_URL_QRCD) like", value.toUpperCase(), "accsUrlQrcd");
            return (Criteria) this;
        }

        public Criteria andMbrTgtCdLikeInsensitive(String value) {
            addCriterion("upper(TDCP.MBR_TGT_CD) like", value.toUpperCase(), "mbrTgtCd");
            return (Criteria) this;
        }

        public Criteria andPageContPcLikeInsensitive(String value) {
            addCriterion("upper(TDCP.PAGE_CONT_PC) like", value.toUpperCase(), "pageContPc");
            return (Criteria) this;
        }

        public Criteria andPageContMobLikeInsensitive(String value) {
            addCriterion("upper(TDCP.PAGE_CONT_MOB) like", value.toUpperCase(), "pageContMob");
            return (Criteria) this;
        }

        public Criteria andDpYnLikeInsensitive(String value) {
            addCriterion("upper(TDCP.DP_YN) like", value.toUpperCase(), "dpYn");
            return (Criteria) this;
        }

        public Criteria andRegIdLikeInsensitive(String value) {
            addCriterion("upper(TDCP.REG_ID) like", value.toUpperCase(), "regId");
            return (Criteria) this;
        }

        public Criteria andModIdLikeInsensitive(String value) {
            addCriterion("upper(TDCP.MOD_ID) like", value.toUpperCase(), "modId");
            return (Criteria) this;
        }

        public Criteria andPageDescLikeLeft(String value) {
            addCriterion("TDCP.PAGE_DESC like ", "%" + value, "pageDesc");
            return (Criteria) this;
        }

        public Criteria andPageDescLikeRight(String value) {
            addCriterion("TDCP.PAGE_DESC like ", value + "%", "pageDesc");
            return (Criteria) this;
        }

        public Criteria andPageDescLikeBoth(String value) {
            addCriterion("TDCP.PAGE_DESC like ", "%" + value + "%", "pageDesc");
            return (Criteria) this;
        }

        public Criteria andAccsCdLikeLeft(String value) {
            addCriterion("TDCP.ACCS_CD like ", "%" + value, "accsCd");
            return (Criteria) this;
        }

        public Criteria andAccsCdLikeRight(String value) {
            addCriterion("TDCP.ACCS_CD like ", value + "%", "accsCd");
            return (Criteria) this;
        }

        public Criteria andAccsCdLikeBoth(String value) {
            addCriterion("TDCP.ACCS_CD like ", "%" + value + "%", "accsCd");
            return (Criteria) this;
        }

        public Criteria andAccsUrlLikeLeft(String value) {
            addCriterion("TDCP.ACCS_URL like ", "%" + value, "accsUrl");
            return (Criteria) this;
        }

        public Criteria andAccsUrlLikeRight(String value) {
            addCriterion("TDCP.ACCS_URL like ", value + "%", "accsUrl");
            return (Criteria) this;
        }

        public Criteria andAccsUrlLikeBoth(String value) {
            addCriterion("TDCP.ACCS_URL like ", "%" + value + "%", "accsUrl");
            return (Criteria) this;
        }

        public Criteria andAccsUrlQrcdLikeLeft(String value) {
            addCriterion("TDCP.ACCS_URL_QRCD like ", "%" + value, "accsUrlQrcd");
            return (Criteria) this;
        }

        public Criteria andAccsUrlQrcdLikeRight(String value) {
            addCriterion("TDCP.ACCS_URL_QRCD like ", value + "%", "accsUrlQrcd");
            return (Criteria) this;
        }

        public Criteria andAccsUrlQrcdLikeBoth(String value) {
            addCriterion("TDCP.ACCS_URL_QRCD like ", "%" + value + "%", "accsUrlQrcd");
            return (Criteria) this;
        }

        public Criteria andMbrTgtCdLikeLeft(String value) {
            addCriterion("TDCP.MBR_TGT_CD like ", "%" + value, "mbrTgtCd");
            return (Criteria) this;
        }

        public Criteria andMbrTgtCdLikeRight(String value) {
            addCriterion("TDCP.MBR_TGT_CD like ", value + "%", "mbrTgtCd");
            return (Criteria) this;
        }

        public Criteria andMbrTgtCdLikeBoth(String value) {
            addCriterion("TDCP.MBR_TGT_CD like ", "%" + value + "%", "mbrTgtCd");
            return (Criteria) this;
        }

        public Criteria andPageContPcLikeLeft(String value) {
            addCriterion("TDCP.PAGE_CONT_PC like ", "%" + value, "pageContPc");
            return (Criteria) this;
        }

        public Criteria andPageContPcLikeRight(String value) {
            addCriterion("TDCP.PAGE_CONT_PC like ", value + "%", "pageContPc");
            return (Criteria) this;
        }

        public Criteria andPageContPcLikeBoth(String value) {
            addCriterion("TDCP.PAGE_CONT_PC like ", "%" + value + "%", "pageContPc");
            return (Criteria) this;
        }

        public Criteria andPageContMobLikeLeft(String value) {
            addCriterion("TDCP.PAGE_CONT_MOB like ", "%" + value, "pageContMob");
            return (Criteria) this;
        }

        public Criteria andPageContMobLikeRight(String value) {
            addCriterion("TDCP.PAGE_CONT_MOB like ", value + "%", "pageContMob");
            return (Criteria) this;
        }

        public Criteria andPageContMobLikeBoth(String value) {
            addCriterion("TDCP.PAGE_CONT_MOB like ", "%" + value + "%", "pageContMob");
            return (Criteria) this;
        }

        public Criteria andDpYnLikeLeft(String value) {
            addCriterion("TDCP.DP_YN like ", "%" + value, "dpYn");
            return (Criteria) this;
        }

        public Criteria andDpYnLikeRight(String value) {
            addCriterion("TDCP.DP_YN like ", value + "%", "dpYn");
            return (Criteria) this;
        }

        public Criteria andDpYnLikeBoth(String value) {
            addCriterion("TDCP.DP_YN like ", "%" + value + "%", "dpYn");
            return (Criteria) this;
        }

        public Criteria andRegIdLikeLeft(String value) {
            addCriterion("TDCP.REG_ID like ", "%" + value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdLikeRight(String value) {
            addCriterion("TDCP.REG_ID like ", value + "%", "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdLikeBoth(String value) {
            addCriterion("TDCP.REG_ID like ", "%" + value + "%", "regId");
            return (Criteria) this;
        }

        public Criteria andModIdLikeLeft(String value) {
            addCriterion("TDCP.MOD_ID like ", "%" + value, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdLikeRight(String value) {
            addCriterion("TDCP.MOD_ID like ", value + "%", "modId");
            return (Criteria) this;
        }

        public Criteria andModIdLikeBoth(String value) {
            addCriterion("TDCP.MOD_ID like ", "%" + value + "%", "modId");
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