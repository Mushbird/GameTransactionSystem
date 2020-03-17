package com.mushbird.sinsege.base.module.item.model.entity.criteria;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class ItemWahsNotiEntityCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    public ItemWahsNotiEntityCriteria() {
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

        public Criteria andItemWahsNotiIdIsNull() {
            addCriterion("TIWN.ITEM_WAHS_NOTI_ID is null");
            return (Criteria) this;
        }

        public Criteria andItemWahsNotiIdIsNotNull() {
            addCriterion("TIWN.ITEM_WAHS_NOTI_ID is not null");
            return (Criteria) this;
        }

        public Criteria andItemWahsNotiIdEqualTo(Integer value) {
            addCriterion("TIWN.ITEM_WAHS_NOTI_ID =", value, "itemWahsNotiId");
            return (Criteria) this;
        }

        public Criteria andItemWahsNotiIdNotEqualTo(Integer value) {
            addCriterion("TIWN.ITEM_WAHS_NOTI_ID <>", value, "itemWahsNotiId");
            return (Criteria) this;
        }

        public Criteria andItemWahsNotiIdGreaterThan(Integer value) {
            addCriterion("TIWN.ITEM_WAHS_NOTI_ID >", value, "itemWahsNotiId");
            return (Criteria) this;
        }

        public Criteria andItemWahsNotiIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("TIWN.ITEM_WAHS_NOTI_ID >=", value, "itemWahsNotiId");
            return (Criteria) this;
        }

        public Criteria andItemWahsNotiIdLessThan(Integer value) {
            addCriterion("TIWN.ITEM_WAHS_NOTI_ID <", value, "itemWahsNotiId");
            return (Criteria) this;
        }

        public Criteria andItemWahsNotiIdLessThanOrEqualTo(Integer value) {
            addCriterion("TIWN.ITEM_WAHS_NOTI_ID <=", value, "itemWahsNotiId");
            return (Criteria) this;
        }

        public Criteria andItemWahsNotiIdIn(List<Integer> values) {
            addCriterion("TIWN.ITEM_WAHS_NOTI_ID in", values, "itemWahsNotiId");
            return (Criteria) this;
        }

        public Criteria andItemWahsNotiIdNotIn(List<Integer> values) {
            addCriterion("TIWN.ITEM_WAHS_NOTI_ID not in", values, "itemWahsNotiId");
            return (Criteria) this;
        }

        public Criteria andItemWahsNotiIdBetween(Integer value1, Integer value2) {
            addCriterion("TIWN.ITEM_WAHS_NOTI_ID between", value1, value2, "itemWahsNotiId");
            return (Criteria) this;
        }

        public Criteria andItemWahsNotiIdNotBetween(Integer value1, Integer value2) {
            addCriterion("TIWN.ITEM_WAHS_NOTI_ID not between", value1, value2, "itemWahsNotiId");
            return (Criteria) this;
        }

        public Criteria andItemIdIsNull() {
            addCriterion("TIWN.ITEM_ID is null");
            return (Criteria) this;
        }

        public Criteria andItemIdIsNotNull() {
            addCriterion("TIWN.ITEM_ID is not null");
            return (Criteria) this;
        }

        public Criteria andItemIdEqualTo(Integer value) {
            addCriterion("TIWN.ITEM_ID =", value, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdNotEqualTo(Integer value) {
            addCriterion("TIWN.ITEM_ID <>", value, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdGreaterThan(Integer value) {
            addCriterion("TIWN.ITEM_ID >", value, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("TIWN.ITEM_ID >=", value, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdLessThan(Integer value) {
            addCriterion("TIWN.ITEM_ID <", value, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdLessThanOrEqualTo(Integer value) {
            addCriterion("TIWN.ITEM_ID <=", value, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdIn(List<Integer> values) {
            addCriterion("TIWN.ITEM_ID in", values, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdNotIn(List<Integer> values) {
            addCriterion("TIWN.ITEM_ID not in", values, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdBetween(Integer value1, Integer value2) {
            addCriterion("TIWN.ITEM_ID between", value1, value2, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdNotBetween(Integer value1, Integer value2) {
            addCriterion("TIWN.ITEM_ID not between", value1, value2, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemOptIdIsNull() {
            addCriterion("TIWN.ITEM_OPT_ID is null");
            return (Criteria) this;
        }

        public Criteria andItemOptIdIsNotNull() {
            addCriterion("TIWN.ITEM_OPT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andItemOptIdEqualTo(Integer value) {
            addCriterion("TIWN.ITEM_OPT_ID =", value, "itemOptId");
            return (Criteria) this;
        }

        public Criteria andItemOptIdNotEqualTo(Integer value) {
            addCriterion("TIWN.ITEM_OPT_ID <>", value, "itemOptId");
            return (Criteria) this;
        }

        public Criteria andItemOptIdGreaterThan(Integer value) {
            addCriterion("TIWN.ITEM_OPT_ID >", value, "itemOptId");
            return (Criteria) this;
        }

        public Criteria andItemOptIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("TIWN.ITEM_OPT_ID >=", value, "itemOptId");
            return (Criteria) this;
        }

        public Criteria andItemOptIdLessThan(Integer value) {
            addCriterion("TIWN.ITEM_OPT_ID <", value, "itemOptId");
            return (Criteria) this;
        }

        public Criteria andItemOptIdLessThanOrEqualTo(Integer value) {
            addCriterion("TIWN.ITEM_OPT_ID <=", value, "itemOptId");
            return (Criteria) this;
        }

        public Criteria andItemOptIdIn(List<Integer> values) {
            addCriterion("TIWN.ITEM_OPT_ID in", values, "itemOptId");
            return (Criteria) this;
        }

        public Criteria andItemOptIdNotIn(List<Integer> values) {
            addCriterion("TIWN.ITEM_OPT_ID not in", values, "itemOptId");
            return (Criteria) this;
        }

        public Criteria andItemOptIdBetween(Integer value1, Integer value2) {
            addCriterion("TIWN.ITEM_OPT_ID between", value1, value2, "itemOptId");
            return (Criteria) this;
        }

        public Criteria andItemOptIdNotBetween(Integer value1, Integer value2) {
            addCriterion("TIWN.ITEM_OPT_ID not between", value1, value2, "itemOptId");
            return (Criteria) this;
        }

        public Criteria andMbrIdIsNull() {
            addCriterion("TIWN.MBR_ID is null");
            return (Criteria) this;
        }

        public Criteria andMbrIdIsNotNull() {
            addCriterion("TIWN.MBR_ID is not null");
            return (Criteria) this;
        }

        public Criteria andMbrIdEqualTo(String value) {
            addCriterion("TIWN.MBR_ID =", value, "mbrId");
            return (Criteria) this;
        }

        public Criteria andMbrIdNotEqualTo(String value) {
            addCriterion("TIWN.MBR_ID <>", value, "mbrId");
            return (Criteria) this;
        }

        public Criteria andMbrIdGreaterThan(String value) {
            addCriterion("TIWN.MBR_ID >", value, "mbrId");
            return (Criteria) this;
        }

        public Criteria andMbrIdGreaterThanOrEqualTo(String value) {
            addCriterion("TIWN.MBR_ID >=", value, "mbrId");
            return (Criteria) this;
        }

        public Criteria andMbrIdLessThan(String value) {
            addCriterion("TIWN.MBR_ID <", value, "mbrId");
            return (Criteria) this;
        }

        public Criteria andMbrIdLessThanOrEqualTo(String value) {
            addCriterion("TIWN.MBR_ID <=", value, "mbrId");
            return (Criteria) this;
        }

        public Criteria andMbrIdLike(String value) {
            addCriterion("TIWN.MBR_ID like", value, "mbrId");
            return (Criteria) this;
        }

        public Criteria andMbrIdNotLike(String value) {
            addCriterion("TIWN.MBR_ID not like", value, "mbrId");
            return (Criteria) this;
        }

        public Criteria andMbrIdIn(List<String> values) {
            addCriterion("TIWN.MBR_ID in", values, "mbrId");
            return (Criteria) this;
        }

        public Criteria andMbrIdNotIn(List<String> values) {
            addCriterion("TIWN.MBR_ID not in", values, "mbrId");
            return (Criteria) this;
        }

        public Criteria andMbrIdBetween(String value1, String value2) {
            addCriterion("TIWN.MBR_ID between", value1, value2, "mbrId");
            return (Criteria) this;
        }

        public Criteria andMbrIdNotBetween(String value1, String value2) {
            addCriterion("TIWN.MBR_ID not between", value1, value2, "mbrId");
            return (Criteria) this;
        }

        public Criteria andItemWahsNotiStatCdIsNull() {
            addCriterion("TIWN.ITEM_WAHS_NOTI_STAT_CD is null");
            return (Criteria) this;
        }

        public Criteria andItemWahsNotiStatCdIsNotNull() {
            addCriterion("TIWN.ITEM_WAHS_NOTI_STAT_CD is not null");
            return (Criteria) this;
        }

        public Criteria andItemWahsNotiStatCdEqualTo(String value) {
            addCriterion("TIWN.ITEM_WAHS_NOTI_STAT_CD =", value, "itemWahsNotiStatCd");
            return (Criteria) this;
        }

        public Criteria andItemWahsNotiStatCdNotEqualTo(String value) {
            addCriterion("TIWN.ITEM_WAHS_NOTI_STAT_CD <>", value, "itemWahsNotiStatCd");
            return (Criteria) this;
        }

        public Criteria andItemWahsNotiStatCdGreaterThan(String value) {
            addCriterion("TIWN.ITEM_WAHS_NOTI_STAT_CD >", value, "itemWahsNotiStatCd");
            return (Criteria) this;
        }

        public Criteria andItemWahsNotiStatCdGreaterThanOrEqualTo(String value) {
            addCriterion("TIWN.ITEM_WAHS_NOTI_STAT_CD >=", value, "itemWahsNotiStatCd");
            return (Criteria) this;
        }

        public Criteria andItemWahsNotiStatCdLessThan(String value) {
            addCriterion("TIWN.ITEM_WAHS_NOTI_STAT_CD <", value, "itemWahsNotiStatCd");
            return (Criteria) this;
        }

        public Criteria andItemWahsNotiStatCdLessThanOrEqualTo(String value) {
            addCriterion("TIWN.ITEM_WAHS_NOTI_STAT_CD <=", value, "itemWahsNotiStatCd");
            return (Criteria) this;
        }

        public Criteria andItemWahsNotiStatCdLike(String value) {
            addCriterion("TIWN.ITEM_WAHS_NOTI_STAT_CD like", value, "itemWahsNotiStatCd");
            return (Criteria) this;
        }

        public Criteria andItemWahsNotiStatCdNotLike(String value) {
            addCriterion("TIWN.ITEM_WAHS_NOTI_STAT_CD not like", value, "itemWahsNotiStatCd");
            return (Criteria) this;
        }

        public Criteria andItemWahsNotiStatCdIn(List<String> values) {
            addCriterion("TIWN.ITEM_WAHS_NOTI_STAT_CD in", values, "itemWahsNotiStatCd");
            return (Criteria) this;
        }

        public Criteria andItemWahsNotiStatCdNotIn(List<String> values) {
            addCriterion("TIWN.ITEM_WAHS_NOTI_STAT_CD not in", values, "itemWahsNotiStatCd");
            return (Criteria) this;
        }

        public Criteria andItemWahsNotiStatCdBetween(String value1, String value2) {
            addCriterion("TIWN.ITEM_WAHS_NOTI_STAT_CD between", value1, value2, "itemWahsNotiStatCd");
            return (Criteria) this;
        }

        public Criteria andItemWahsNotiStatCdNotBetween(String value1, String value2) {
            addCriterion("TIWN.ITEM_WAHS_NOTI_STAT_CD not between", value1, value2, "itemWahsNotiStatCd");
            return (Criteria) this;
        }

        public Criteria andCpNoIsNull() {
            addCriterion("TIWN.CP_NO is null");
            return (Criteria) this;
        }

        public Criteria andCpNoIsNotNull() {
            addCriterion("TIWN.CP_NO is not null");
            return (Criteria) this;
        }

        public Criteria andCpNoEqualTo(String value) {
            addCriterion("TIWN.CP_NO =", value, "cpNo");
            return (Criteria) this;
        }

        public Criteria andCpNoNotEqualTo(String value) {
            addCriterion("TIWN.CP_NO <>", value, "cpNo");
            return (Criteria) this;
        }

        public Criteria andCpNoGreaterThan(String value) {
            addCriterion("TIWN.CP_NO >", value, "cpNo");
            return (Criteria) this;
        }

        public Criteria andCpNoGreaterThanOrEqualTo(String value) {
            addCriterion("TIWN.CP_NO >=", value, "cpNo");
            return (Criteria) this;
        }

        public Criteria andCpNoLessThan(String value) {
            addCriterion("TIWN.CP_NO <", value, "cpNo");
            return (Criteria) this;
        }

        public Criteria andCpNoLessThanOrEqualTo(String value) {
            addCriterion("TIWN.CP_NO <=", value, "cpNo");
            return (Criteria) this;
        }

        public Criteria andCpNoLike(String value) {
            addCriterion("TIWN.CP_NO like", value, "cpNo");
            return (Criteria) this;
        }

        public Criteria andCpNoNotLike(String value) {
            addCriterion("TIWN.CP_NO not like", value, "cpNo");
            return (Criteria) this;
        }

        public Criteria andCpNoIn(List<String> values) {
            addCriterion("TIWN.CP_NO in", values, "cpNo");
            return (Criteria) this;
        }

        public Criteria andCpNoNotIn(List<String> values) {
            addCriterion("TIWN.CP_NO not in", values, "cpNo");
            return (Criteria) this;
        }

        public Criteria andCpNoBetween(String value1, String value2) {
            addCriterion("TIWN.CP_NO between", value1, value2, "cpNo");
            return (Criteria) this;
        }

        public Criteria andCpNoNotBetween(String value1, String value2) {
            addCriterion("TIWN.CP_NO not between", value1, value2, "cpNo");
            return (Criteria) this;
        }

        public Criteria andPsnlInfoHndlPcyAgrYnIsNull() {
            addCriterion("TIWN.PSNL_INFO_HNDL_PCY_AGR_YN is null");
            return (Criteria) this;
        }

        public Criteria andPsnlInfoHndlPcyAgrYnIsNotNull() {
            addCriterion("TIWN.PSNL_INFO_HNDL_PCY_AGR_YN is not null");
            return (Criteria) this;
        }

        public Criteria andPsnlInfoHndlPcyAgrYnEqualTo(String value) {
            addCriterion("TIWN.PSNL_INFO_HNDL_PCY_AGR_YN =", value, "psnlInfoHndlPcyAgrYn");
            return (Criteria) this;
        }

        public Criteria andPsnlInfoHndlPcyAgrYnNotEqualTo(String value) {
            addCriterion("TIWN.PSNL_INFO_HNDL_PCY_AGR_YN <>", value, "psnlInfoHndlPcyAgrYn");
            return (Criteria) this;
        }

        public Criteria andPsnlInfoHndlPcyAgrYnGreaterThan(String value) {
            addCriterion("TIWN.PSNL_INFO_HNDL_PCY_AGR_YN >", value, "psnlInfoHndlPcyAgrYn");
            return (Criteria) this;
        }

        public Criteria andPsnlInfoHndlPcyAgrYnGreaterThanOrEqualTo(String value) {
            addCriterion("TIWN.PSNL_INFO_HNDL_PCY_AGR_YN >=", value, "psnlInfoHndlPcyAgrYn");
            return (Criteria) this;
        }

        public Criteria andPsnlInfoHndlPcyAgrYnLessThan(String value) {
            addCriterion("TIWN.PSNL_INFO_HNDL_PCY_AGR_YN <", value, "psnlInfoHndlPcyAgrYn");
            return (Criteria) this;
        }

        public Criteria andPsnlInfoHndlPcyAgrYnLessThanOrEqualTo(String value) {
            addCriterion("TIWN.PSNL_INFO_HNDL_PCY_AGR_YN <=", value, "psnlInfoHndlPcyAgrYn");
            return (Criteria) this;
        }

        public Criteria andPsnlInfoHndlPcyAgrYnLike(String value) {
            addCriterion("TIWN.PSNL_INFO_HNDL_PCY_AGR_YN like", value, "psnlInfoHndlPcyAgrYn");
            return (Criteria) this;
        }

        public Criteria andPsnlInfoHndlPcyAgrYnNotLike(String value) {
            addCriterion("TIWN.PSNL_INFO_HNDL_PCY_AGR_YN not like", value, "psnlInfoHndlPcyAgrYn");
            return (Criteria) this;
        }

        public Criteria andPsnlInfoHndlPcyAgrYnIn(List<String> values) {
            addCriterion("TIWN.PSNL_INFO_HNDL_PCY_AGR_YN in", values, "psnlInfoHndlPcyAgrYn");
            return (Criteria) this;
        }

        public Criteria andPsnlInfoHndlPcyAgrYnNotIn(List<String> values) {
            addCriterion("TIWN.PSNL_INFO_HNDL_PCY_AGR_YN not in", values, "psnlInfoHndlPcyAgrYn");
            return (Criteria) this;
        }

        public Criteria andPsnlInfoHndlPcyAgrYnBetween(String value1, String value2) {
            addCriterion("TIWN.PSNL_INFO_HNDL_PCY_AGR_YN between", value1, value2, "psnlInfoHndlPcyAgrYn");
            return (Criteria) this;
        }

        public Criteria andPsnlInfoHndlPcyAgrYnNotBetween(String value1, String value2) {
            addCriterion("TIWN.PSNL_INFO_HNDL_PCY_AGR_YN not between", value1, value2, "psnlInfoHndlPcyAgrYn");
            return (Criteria) this;
        }

        public Criteria andNotiReqDtIsNull() {
            addCriterion("TIWN.NOTI_REQ_DT is null");
            return (Criteria) this;
        }

        public Criteria andNotiReqDtIsNotNull() {
            addCriterion("TIWN.NOTI_REQ_DT is not null");
            return (Criteria) this;
        }

        public Criteria andNotiReqDtEqualTo(Date value) {
            addCriterionForJDBCDate("TIWN.NOTI_REQ_DT =", value, "notiReqDt");
            return (Criteria) this;
        }

        public Criteria andNotiReqDtNotEqualTo(Date value) {
            addCriterionForJDBCDate("TIWN.NOTI_REQ_DT <>", value, "notiReqDt");
            return (Criteria) this;
        }

        public Criteria andNotiReqDtGreaterThan(Date value) {
            addCriterionForJDBCDate("TIWN.NOTI_REQ_DT >", value, "notiReqDt");
            return (Criteria) this;
        }

        public Criteria andNotiReqDtGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("TIWN.NOTI_REQ_DT >=", value, "notiReqDt");
            return (Criteria) this;
        }

        public Criteria andNotiReqDtLessThan(Date value) {
            addCriterionForJDBCDate("TIWN.NOTI_REQ_DT <", value, "notiReqDt");
            return (Criteria) this;
        }

        public Criteria andNotiReqDtLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("TIWN.NOTI_REQ_DT <=", value, "notiReqDt");
            return (Criteria) this;
        }

        public Criteria andNotiReqDtIn(List<Date> values) {
            addCriterionForJDBCDate("TIWN.NOTI_REQ_DT in", values, "notiReqDt");
            return (Criteria) this;
        }

        public Criteria andNotiReqDtNotIn(List<Date> values) {
            addCriterionForJDBCDate("TIWN.NOTI_REQ_DT not in", values, "notiReqDt");
            return (Criteria) this;
        }

        public Criteria andNotiReqDtBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("TIWN.NOTI_REQ_DT between", value1, value2, "notiReqDt");
            return (Criteria) this;
        }

        public Criteria andNotiReqDtNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("TIWN.NOTI_REQ_DT not between", value1, value2, "notiReqDt");
            return (Criteria) this;
        }

        public Criteria andNotiPerdStYmdIsNull() {
            addCriterion("TIWN.NOTI_PERD_ST_YMD is null");
            return (Criteria) this;
        }

        public Criteria andNotiPerdStYmdIsNotNull() {
            addCriterion("TIWN.NOTI_PERD_ST_YMD is not null");
            return (Criteria) this;
        }

        public Criteria andNotiPerdStYmdEqualTo(String value) {
            addCriterion("TIWN.NOTI_PERD_ST_YMD =", value, "notiPerdStYmd");
            return (Criteria) this;
        }

        public Criteria andNotiPerdStYmdNotEqualTo(String value) {
            addCriterion("TIWN.NOTI_PERD_ST_YMD <>", value, "notiPerdStYmd");
            return (Criteria) this;
        }

        public Criteria andNotiPerdStYmdGreaterThan(String value) {
            addCriterion("TIWN.NOTI_PERD_ST_YMD >", value, "notiPerdStYmd");
            return (Criteria) this;
        }

        public Criteria andNotiPerdStYmdGreaterThanOrEqualTo(String value) {
            addCriterion("TIWN.NOTI_PERD_ST_YMD >=", value, "notiPerdStYmd");
            return (Criteria) this;
        }

        public Criteria andNotiPerdStYmdLessThan(String value) {
            addCriterion("TIWN.NOTI_PERD_ST_YMD <", value, "notiPerdStYmd");
            return (Criteria) this;
        }

        public Criteria andNotiPerdStYmdLessThanOrEqualTo(String value) {
            addCriterion("TIWN.NOTI_PERD_ST_YMD <=", value, "notiPerdStYmd");
            return (Criteria) this;
        }

        public Criteria andNotiPerdStYmdLike(String value) {
            addCriterion("TIWN.NOTI_PERD_ST_YMD like", value, "notiPerdStYmd");
            return (Criteria) this;
        }

        public Criteria andNotiPerdStYmdNotLike(String value) {
            addCriterion("TIWN.NOTI_PERD_ST_YMD not like", value, "notiPerdStYmd");
            return (Criteria) this;
        }

        public Criteria andNotiPerdStYmdIn(List<String> values) {
            addCriterion("TIWN.NOTI_PERD_ST_YMD in", values, "notiPerdStYmd");
            return (Criteria) this;
        }

        public Criteria andNotiPerdStYmdNotIn(List<String> values) {
            addCriterion("TIWN.NOTI_PERD_ST_YMD not in", values, "notiPerdStYmd");
            return (Criteria) this;
        }

        public Criteria andNotiPerdStYmdBetween(String value1, String value2) {
            addCriterion("TIWN.NOTI_PERD_ST_YMD between", value1, value2, "notiPerdStYmd");
            return (Criteria) this;
        }

        public Criteria andNotiPerdStYmdNotBetween(String value1, String value2) {
            addCriterion("TIWN.NOTI_PERD_ST_YMD not between", value1, value2, "notiPerdStYmd");
            return (Criteria) this;
        }

        public Criteria andNotiPerdEdYmdIsNull() {
            addCriterion("TIWN.NOTI_PERD_ED_YMD is null");
            return (Criteria) this;
        }

        public Criteria andNotiPerdEdYmdIsNotNull() {
            addCriterion("TIWN.NOTI_PERD_ED_YMD is not null");
            return (Criteria) this;
        }

        public Criteria andNotiPerdEdYmdEqualTo(String value) {
            addCriterion("TIWN.NOTI_PERD_ED_YMD =", value, "notiPerdEdYmd");
            return (Criteria) this;
        }

        public Criteria andNotiPerdEdYmdNotEqualTo(String value) {
            addCriterion("TIWN.NOTI_PERD_ED_YMD <>", value, "notiPerdEdYmd");
            return (Criteria) this;
        }

        public Criteria andNotiPerdEdYmdGreaterThan(String value) {
            addCriterion("TIWN.NOTI_PERD_ED_YMD >", value, "notiPerdEdYmd");
            return (Criteria) this;
        }

        public Criteria andNotiPerdEdYmdGreaterThanOrEqualTo(String value) {
            addCriterion("TIWN.NOTI_PERD_ED_YMD >=", value, "notiPerdEdYmd");
            return (Criteria) this;
        }

        public Criteria andNotiPerdEdYmdLessThan(String value) {
            addCriterion("TIWN.NOTI_PERD_ED_YMD <", value, "notiPerdEdYmd");
            return (Criteria) this;
        }

        public Criteria andNotiPerdEdYmdLessThanOrEqualTo(String value) {
            addCriterion("TIWN.NOTI_PERD_ED_YMD <=", value, "notiPerdEdYmd");
            return (Criteria) this;
        }

        public Criteria andNotiPerdEdYmdLike(String value) {
            addCriterion("TIWN.NOTI_PERD_ED_YMD like", value, "notiPerdEdYmd");
            return (Criteria) this;
        }

        public Criteria andNotiPerdEdYmdNotLike(String value) {
            addCriterion("TIWN.NOTI_PERD_ED_YMD not like", value, "notiPerdEdYmd");
            return (Criteria) this;
        }

        public Criteria andNotiPerdEdYmdIn(List<String> values) {
            addCriterion("TIWN.NOTI_PERD_ED_YMD in", values, "notiPerdEdYmd");
            return (Criteria) this;
        }

        public Criteria andNotiPerdEdYmdNotIn(List<String> values) {
            addCriterion("TIWN.NOTI_PERD_ED_YMD not in", values, "notiPerdEdYmd");
            return (Criteria) this;
        }

        public Criteria andNotiPerdEdYmdBetween(String value1, String value2) {
            addCriterion("TIWN.NOTI_PERD_ED_YMD between", value1, value2, "notiPerdEdYmd");
            return (Criteria) this;
        }

        public Criteria andNotiPerdEdYmdNotBetween(String value1, String value2) {
            addCriterion("TIWN.NOTI_PERD_ED_YMD not between", value1, value2, "notiPerdEdYmd");
            return (Criteria) this;
        }

        public Criteria andNotiSndDtIsNull() {
            addCriterion("TIWN.NOTI_SND_DT is null");
            return (Criteria) this;
        }

        public Criteria andNotiSndDtIsNotNull() {
            addCriterion("TIWN.NOTI_SND_DT is not null");
            return (Criteria) this;
        }

        public Criteria andNotiSndDtEqualTo(Date value) {
            addCriterionForJDBCDate("TIWN.NOTI_SND_DT =", value, "notiSndDt");
            return (Criteria) this;
        }

        public Criteria andNotiSndDtNotEqualTo(Date value) {
            addCriterionForJDBCDate("TIWN.NOTI_SND_DT <>", value, "notiSndDt");
            return (Criteria) this;
        }

        public Criteria andNotiSndDtGreaterThan(Date value) {
            addCriterionForJDBCDate("TIWN.NOTI_SND_DT >", value, "notiSndDt");
            return (Criteria) this;
        }

        public Criteria andNotiSndDtGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("TIWN.NOTI_SND_DT >=", value, "notiSndDt");
            return (Criteria) this;
        }

        public Criteria andNotiSndDtLessThan(Date value) {
            addCriterionForJDBCDate("TIWN.NOTI_SND_DT <", value, "notiSndDt");
            return (Criteria) this;
        }

        public Criteria andNotiSndDtLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("TIWN.NOTI_SND_DT <=", value, "notiSndDt");
            return (Criteria) this;
        }

        public Criteria andNotiSndDtIn(List<Date> values) {
            addCriterionForJDBCDate("TIWN.NOTI_SND_DT in", values, "notiSndDt");
            return (Criteria) this;
        }

        public Criteria andNotiSndDtNotIn(List<Date> values) {
            addCriterionForJDBCDate("TIWN.NOTI_SND_DT not in", values, "notiSndDt");
            return (Criteria) this;
        }

        public Criteria andNotiSndDtBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("TIWN.NOTI_SND_DT between", value1, value2, "notiSndDt");
            return (Criteria) this;
        }

        public Criteria andNotiSndDtNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("TIWN.NOTI_SND_DT not between", value1, value2, "notiSndDt");
            return (Criteria) this;
        }

        public Criteria andRegDtIsNull() {
            addCriterion("TIWN.REG_DT is null");
            return (Criteria) this;
        }

        public Criteria andRegDtIsNotNull() {
            addCriterion("TIWN.REG_DT is not null");
            return (Criteria) this;
        }

        public Criteria andRegDtEqualTo(Date value) {
            addCriterion("TIWN.REG_DT =", value, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtNotEqualTo(Date value) {
            addCriterion("TIWN.REG_DT <>", value, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtGreaterThan(Date value) {
            addCriterion("TIWN.REG_DT >", value, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtGreaterThanOrEqualTo(Date value) {
            addCriterion("TIWN.REG_DT >=", value, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtLessThan(Date value) {
            addCriterion("TIWN.REG_DT <", value, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtLessThanOrEqualTo(Date value) {
            addCriterion("TIWN.REG_DT <=", value, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtIn(List<Date> values) {
            addCriterion("TIWN.REG_DT in", values, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtNotIn(List<Date> values) {
            addCriterion("TIWN.REG_DT not in", values, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtBetween(Date value1, Date value2) {
            addCriterion("TIWN.REG_DT between", value1, value2, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtNotBetween(Date value1, Date value2) {
            addCriterion("TIWN.REG_DT not between", value1, value2, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegIdIsNull() {
            addCriterion("TIWN.REG_ID is null");
            return (Criteria) this;
        }

        public Criteria andRegIdIsNotNull() {
            addCriterion("TIWN.REG_ID is not null");
            return (Criteria) this;
        }

        public Criteria andRegIdEqualTo(String value) {
            addCriterion("TIWN.REG_ID =", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdNotEqualTo(String value) {
            addCriterion("TIWN.REG_ID <>", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdGreaterThan(String value) {
            addCriterion("TIWN.REG_ID >", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdGreaterThanOrEqualTo(String value) {
            addCriterion("TIWN.REG_ID >=", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdLessThan(String value) {
            addCriterion("TIWN.REG_ID <", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdLessThanOrEqualTo(String value) {
            addCriterion("TIWN.REG_ID <=", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdLike(String value) {
            addCriterion("TIWN.REG_ID like", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdNotLike(String value) {
            addCriterion("TIWN.REG_ID not like", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdIn(List<String> values) {
            addCriterion("TIWN.REG_ID in", values, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdNotIn(List<String> values) {
            addCriterion("TIWN.REG_ID not in", values, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdBetween(String value1, String value2) {
            addCriterion("TIWN.REG_ID between", value1, value2, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdNotBetween(String value1, String value2) {
            addCriterion("TIWN.REG_ID not between", value1, value2, "regId");
            return (Criteria) this;
        }

        public Criteria andUseYnIsNull() {
            addCriterion("TIWN.USE_YN is null");
            return (Criteria) this;
        }

        public Criteria andUseYnIsNotNull() {
            addCriterion("TIWN.USE_YN is not null");
            return (Criteria) this;
        }

        public Criteria andUseYnEqualTo(String value) {
            addCriterion("TIWN.USE_YN =", value, "useYn");
            return (Criteria) this;
        }

        public Criteria andUseYnNotEqualTo(String value) {
            addCriterion("TIWN.USE_YN <>", value, "useYn");
            return (Criteria) this;
        }

        public Criteria andUseYnGreaterThan(String value) {
            addCriterion("TIWN.USE_YN >", value, "useYn");
            return (Criteria) this;
        }

        public Criteria andUseYnGreaterThanOrEqualTo(String value) {
            addCriterion("TIWN.USE_YN >=", value, "useYn");
            return (Criteria) this;
        }

        public Criteria andUseYnLessThan(String value) {
            addCriterion("TIWN.USE_YN <", value, "useYn");
            return (Criteria) this;
        }

        public Criteria andUseYnLessThanOrEqualTo(String value) {
            addCriterion("TIWN.USE_YN <=", value, "useYn");
            return (Criteria) this;
        }

        public Criteria andUseYnLike(String value) {
            addCriterion("TIWN.USE_YN like", value, "useYn");
            return (Criteria) this;
        }

        public Criteria andUseYnNotLike(String value) {
            addCriterion("TIWN.USE_YN not like", value, "useYn");
            return (Criteria) this;
        }

        public Criteria andUseYnIn(List<String> values) {
            addCriterion("TIWN.USE_YN in", values, "useYn");
            return (Criteria) this;
        }

        public Criteria andUseYnNotIn(List<String> values) {
            addCriterion("TIWN.USE_YN not in", values, "useYn");
            return (Criteria) this;
        }

        public Criteria andUseYnBetween(String value1, String value2) {
            addCriterion("TIWN.USE_YN between", value1, value2, "useYn");
            return (Criteria) this;
        }

        public Criteria andUseYnNotBetween(String value1, String value2) {
            addCriterion("TIWN.USE_YN not between", value1, value2, "useYn");
            return (Criteria) this;
        }

        public Criteria andMbrIdLikeInsensitive(String value) {
            addCriterion("upper(TIWN.MBR_ID) like", value.toUpperCase(), "mbrId");
            return (Criteria) this;
        }

        public Criteria andItemWahsNotiStatCdLikeInsensitive(String value) {
            addCriterion("upper(TIWN.ITEM_WAHS_NOTI_STAT_CD) like", value.toUpperCase(), "itemWahsNotiStatCd");
            return (Criteria) this;
        }

        public Criteria andCpNoLikeInsensitive(String value) {
            addCriterion("upper(TIWN.CP_NO) like", value.toUpperCase(), "cpNo");
            return (Criteria) this;
        }

        public Criteria andPsnlInfoHndlPcyAgrYnLikeInsensitive(String value) {
            addCriterion("upper(TIWN.PSNL_INFO_HNDL_PCY_AGR_YN) like", value.toUpperCase(), "psnlInfoHndlPcyAgrYn");
            return (Criteria) this;
        }

        public Criteria andNotiPerdStYmdLikeInsensitive(String value) {
            addCriterion("upper(TIWN.NOTI_PERD_ST_YMD) like", value.toUpperCase(), "notiPerdStYmd");
            return (Criteria) this;
        }

        public Criteria andNotiPerdEdYmdLikeInsensitive(String value) {
            addCriterion("upper(TIWN.NOTI_PERD_ED_YMD) like", value.toUpperCase(), "notiPerdEdYmd");
            return (Criteria) this;
        }

        public Criteria andRegIdLikeInsensitive(String value) {
            addCriterion("upper(TIWN.REG_ID) like", value.toUpperCase(), "regId");
            return (Criteria) this;
        }

        public Criteria andUseYnLikeInsensitive(String value) {
            addCriterion("upper(TIWN.USE_YN) like", value.toUpperCase(), "useYn");
            return (Criteria) this;
        }

        public Criteria andMbrIdLikeLeft(String value) {
            addCriterion("TIWN.MBR_ID like ", "%" + value, "mbrId");
            return (Criteria) this;
        }

        public Criteria andMbrIdLikeRight(String value) {
            addCriterion("TIWN.MBR_ID like ", value + "%", "mbrId");
            return (Criteria) this;
        }

        public Criteria andMbrIdLikeBoth(String value) {
            addCriterion("TIWN.MBR_ID like ", "%" + value + "%", "mbrId");
            return (Criteria) this;
        }

        public Criteria andItemWahsNotiStatCdLikeLeft(String value) {
            addCriterion("TIWN.ITEM_WAHS_NOTI_STAT_CD like ", "%" + value, "itemWahsNotiStatCd");
            return (Criteria) this;
        }

        public Criteria andItemWahsNotiStatCdLikeRight(String value) {
            addCriterion("TIWN.ITEM_WAHS_NOTI_STAT_CD like ", value + "%", "itemWahsNotiStatCd");
            return (Criteria) this;
        }

        public Criteria andItemWahsNotiStatCdLikeBoth(String value) {
            addCriterion("TIWN.ITEM_WAHS_NOTI_STAT_CD like ", "%" + value + "%", "itemWahsNotiStatCd");
            return (Criteria) this;
        }

        public Criteria andCpNoLikeLeft(String value) {
            addCriterion("TIWN.CP_NO like ", "%" + value, "cpNo");
            return (Criteria) this;
        }

        public Criteria andCpNoLikeRight(String value) {
            addCriterion("TIWN.CP_NO like ", value + "%", "cpNo");
            return (Criteria) this;
        }

        public Criteria andCpNoLikeBoth(String value) {
            addCriterion("TIWN.CP_NO like ", "%" + value + "%", "cpNo");
            return (Criteria) this;
        }

        public Criteria andPsnlInfoHndlPcyAgrYnLikeLeft(String value) {
            addCriterion("TIWN.PSNL_INFO_HNDL_PCY_AGR_YN like ", "%" + value, "psnlInfoHndlPcyAgrYn");
            return (Criteria) this;
        }

        public Criteria andPsnlInfoHndlPcyAgrYnLikeRight(String value) {
            addCriterion("TIWN.PSNL_INFO_HNDL_PCY_AGR_YN like ", value + "%", "psnlInfoHndlPcyAgrYn");
            return (Criteria) this;
        }

        public Criteria andPsnlInfoHndlPcyAgrYnLikeBoth(String value) {
            addCriterion("TIWN.PSNL_INFO_HNDL_PCY_AGR_YN like ", "%" + value + "%", "psnlInfoHndlPcyAgrYn");
            return (Criteria) this;
        }

        public Criteria andNotiPerdStYmdLikeLeft(String value) {
            addCriterion("TIWN.NOTI_PERD_ST_YMD like ", "%" + value, "notiPerdStYmd");
            return (Criteria) this;
        }

        public Criteria andNotiPerdStYmdLikeRight(String value) {
            addCriterion("TIWN.NOTI_PERD_ST_YMD like ", value + "%", "notiPerdStYmd");
            return (Criteria) this;
        }

        public Criteria andNotiPerdStYmdLikeBoth(String value) {
            addCriterion("TIWN.NOTI_PERD_ST_YMD like ", "%" + value + "%", "notiPerdStYmd");
            return (Criteria) this;
        }

        public Criteria andNotiPerdEdYmdLikeLeft(String value) {
            addCriterion("TIWN.NOTI_PERD_ED_YMD like ", "%" + value, "notiPerdEdYmd");
            return (Criteria) this;
        }

        public Criteria andNotiPerdEdYmdLikeRight(String value) {
            addCriterion("TIWN.NOTI_PERD_ED_YMD like ", value + "%", "notiPerdEdYmd");
            return (Criteria) this;
        }

        public Criteria andNotiPerdEdYmdLikeBoth(String value) {
            addCriterion("TIWN.NOTI_PERD_ED_YMD like ", "%" + value + "%", "notiPerdEdYmd");
            return (Criteria) this;
        }

        public Criteria andRegIdLikeLeft(String value) {
            addCriterion("TIWN.REG_ID like ", "%" + value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdLikeRight(String value) {
            addCriterion("TIWN.REG_ID like ", value + "%", "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdLikeBoth(String value) {
            addCriterion("TIWN.REG_ID like ", "%" + value + "%", "regId");
            return (Criteria) this;
        }

        public Criteria andUseYnLikeLeft(String value) {
            addCriterion("TIWN.USE_YN like ", "%" + value, "useYn");
            return (Criteria) this;
        }

        public Criteria andUseYnLikeRight(String value) {
            addCriterion("TIWN.USE_YN like ", value + "%", "useYn");
            return (Criteria) this;
        }

        public Criteria andUseYnLikeBoth(String value) {
            addCriterion("TIWN.USE_YN like ", "%" + value + "%", "useYn");
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