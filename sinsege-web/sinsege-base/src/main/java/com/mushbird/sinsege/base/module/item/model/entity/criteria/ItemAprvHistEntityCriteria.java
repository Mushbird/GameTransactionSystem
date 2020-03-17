package com.mushbird.sinsege.base.module.item.model.entity.criteria;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class ItemAprvHistEntityCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    public ItemAprvHistEntityCriteria() {
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

        public Criteria andItemAprvHistIdIsNull() {
            addCriterion("TIAH.ITEM_APRV_HIST_ID is null");
            return (Criteria) this;
        }

        public Criteria andItemAprvHistIdIsNotNull() {
            addCriterion("TIAH.ITEM_APRV_HIST_ID is not null");
            return (Criteria) this;
        }

        public Criteria andItemAprvHistIdEqualTo(Integer value) {
            addCriterion("TIAH.ITEM_APRV_HIST_ID =", value, "itemAprvHistId");
            return (Criteria) this;
        }

        public Criteria andItemAprvHistIdNotEqualTo(Integer value) {
            addCriterion("TIAH.ITEM_APRV_HIST_ID <>", value, "itemAprvHistId");
            return (Criteria) this;
        }

        public Criteria andItemAprvHistIdGreaterThan(Integer value) {
            addCriterion("TIAH.ITEM_APRV_HIST_ID >", value, "itemAprvHistId");
            return (Criteria) this;
        }

        public Criteria andItemAprvHistIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("TIAH.ITEM_APRV_HIST_ID >=", value, "itemAprvHistId");
            return (Criteria) this;
        }

        public Criteria andItemAprvHistIdLessThan(Integer value) {
            addCriterion("TIAH.ITEM_APRV_HIST_ID <", value, "itemAprvHistId");
            return (Criteria) this;
        }

        public Criteria andItemAprvHistIdLessThanOrEqualTo(Integer value) {
            addCriterion("TIAH.ITEM_APRV_HIST_ID <=", value, "itemAprvHistId");
            return (Criteria) this;
        }

        public Criteria andItemAprvHistIdIn(List<Integer> values) {
            addCriterion("TIAH.ITEM_APRV_HIST_ID in", values, "itemAprvHistId");
            return (Criteria) this;
        }

        public Criteria andItemAprvHistIdNotIn(List<Integer> values) {
            addCriterion("TIAH.ITEM_APRV_HIST_ID not in", values, "itemAprvHistId");
            return (Criteria) this;
        }

        public Criteria andItemAprvHistIdBetween(Integer value1, Integer value2) {
            addCriterion("TIAH.ITEM_APRV_HIST_ID between", value1, value2, "itemAprvHistId");
            return (Criteria) this;
        }

        public Criteria andItemAprvHistIdNotBetween(Integer value1, Integer value2) {
            addCriterion("TIAH.ITEM_APRV_HIST_ID not between", value1, value2, "itemAprvHistId");
            return (Criteria) this;
        }

        public Criteria andItemIdIsNull() {
            addCriterion("TIAH.ITEM_ID is null");
            return (Criteria) this;
        }

        public Criteria andItemIdIsNotNull() {
            addCriterion("TIAH.ITEM_ID is not null");
            return (Criteria) this;
        }

        public Criteria andItemIdEqualTo(Integer value) {
            addCriterion("TIAH.ITEM_ID =", value, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdNotEqualTo(Integer value) {
            addCriterion("TIAH.ITEM_ID <>", value, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdGreaterThan(Integer value) {
            addCriterion("TIAH.ITEM_ID >", value, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("TIAH.ITEM_ID >=", value, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdLessThan(Integer value) {
            addCriterion("TIAH.ITEM_ID <", value, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdLessThanOrEqualTo(Integer value) {
            addCriterion("TIAH.ITEM_ID <=", value, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdIn(List<Integer> values) {
            addCriterion("TIAH.ITEM_ID in", values, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdNotIn(List<Integer> values) {
            addCriterion("TIAH.ITEM_ID not in", values, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdBetween(Integer value1, Integer value2) {
            addCriterion("TIAH.ITEM_ID between", value1, value2, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdNotBetween(Integer value1, Integer value2) {
            addCriterion("TIAH.ITEM_ID not between", value1, value2, "itemId");
            return (Criteria) this;
        }

        public Criteria andAprvReqCdIsNull() {
            addCriterion("TIAH.APRV_REQ_CD is null");
            return (Criteria) this;
        }

        public Criteria andAprvReqCdIsNotNull() {
            addCriterion("TIAH.APRV_REQ_CD is not null");
            return (Criteria) this;
        }

        public Criteria andAprvReqCdEqualTo(String value) {
            addCriterion("TIAH.APRV_REQ_CD =", value, "aprvReqCd");
            return (Criteria) this;
        }

        public Criteria andAprvReqCdNotEqualTo(String value) {
            addCriterion("TIAH.APRV_REQ_CD <>", value, "aprvReqCd");
            return (Criteria) this;
        }

        public Criteria andAprvReqCdGreaterThan(String value) {
            addCriterion("TIAH.APRV_REQ_CD >", value, "aprvReqCd");
            return (Criteria) this;
        }

        public Criteria andAprvReqCdGreaterThanOrEqualTo(String value) {
            addCriterion("TIAH.APRV_REQ_CD >=", value, "aprvReqCd");
            return (Criteria) this;
        }

        public Criteria andAprvReqCdLessThan(String value) {
            addCriterion("TIAH.APRV_REQ_CD <", value, "aprvReqCd");
            return (Criteria) this;
        }

        public Criteria andAprvReqCdLessThanOrEqualTo(String value) {
            addCriterion("TIAH.APRV_REQ_CD <=", value, "aprvReqCd");
            return (Criteria) this;
        }

        public Criteria andAprvReqCdLike(String value) {
            addCriterion("TIAH.APRV_REQ_CD like", value, "aprvReqCd");
            return (Criteria) this;
        }

        public Criteria andAprvReqCdNotLike(String value) {
            addCriterion("TIAH.APRV_REQ_CD not like", value, "aprvReqCd");
            return (Criteria) this;
        }

        public Criteria andAprvReqCdIn(List<String> values) {
            addCriterion("TIAH.APRV_REQ_CD in", values, "aprvReqCd");
            return (Criteria) this;
        }

        public Criteria andAprvReqCdNotIn(List<String> values) {
            addCriterion("TIAH.APRV_REQ_CD not in", values, "aprvReqCd");
            return (Criteria) this;
        }

        public Criteria andAprvReqCdBetween(String value1, String value2) {
            addCriterion("TIAH.APRV_REQ_CD between", value1, value2, "aprvReqCd");
            return (Criteria) this;
        }

        public Criteria andAprvReqCdNotBetween(String value1, String value2) {
            addCriterion("TIAH.APRV_REQ_CD not between", value1, value2, "aprvReqCd");
            return (Criteria) this;
        }

        public Criteria andAprvStatCdIsNull() {
            addCriterion("TIAH.APRV_STAT_CD is null");
            return (Criteria) this;
        }

        public Criteria andAprvStatCdIsNotNull() {
            addCriterion("TIAH.APRV_STAT_CD is not null");
            return (Criteria) this;
        }

        public Criteria andAprvStatCdEqualTo(String value) {
            addCriterion("TIAH.APRV_STAT_CD =", value, "aprvStatCd");
            return (Criteria) this;
        }

        public Criteria andAprvStatCdNotEqualTo(String value) {
            addCriterion("TIAH.APRV_STAT_CD <>", value, "aprvStatCd");
            return (Criteria) this;
        }

        public Criteria andAprvStatCdGreaterThan(String value) {
            addCriterion("TIAH.APRV_STAT_CD >", value, "aprvStatCd");
            return (Criteria) this;
        }

        public Criteria andAprvStatCdGreaterThanOrEqualTo(String value) {
            addCriterion("TIAH.APRV_STAT_CD >=", value, "aprvStatCd");
            return (Criteria) this;
        }

        public Criteria andAprvStatCdLessThan(String value) {
            addCriterion("TIAH.APRV_STAT_CD <", value, "aprvStatCd");
            return (Criteria) this;
        }

        public Criteria andAprvStatCdLessThanOrEqualTo(String value) {
            addCriterion("TIAH.APRV_STAT_CD <=", value, "aprvStatCd");
            return (Criteria) this;
        }

        public Criteria andAprvStatCdLike(String value) {
            addCriterion("TIAH.APRV_STAT_CD like", value, "aprvStatCd");
            return (Criteria) this;
        }

        public Criteria andAprvStatCdNotLike(String value) {
            addCriterion("TIAH.APRV_STAT_CD not like", value, "aprvStatCd");
            return (Criteria) this;
        }

        public Criteria andAprvStatCdIn(List<String> values) {
            addCriterion("TIAH.APRV_STAT_CD in", values, "aprvStatCd");
            return (Criteria) this;
        }

        public Criteria andAprvStatCdNotIn(List<String> values) {
            addCriterion("TIAH.APRV_STAT_CD not in", values, "aprvStatCd");
            return (Criteria) this;
        }

        public Criteria andAprvStatCdBetween(String value1, String value2) {
            addCriterion("TIAH.APRV_STAT_CD between", value1, value2, "aprvStatCd");
            return (Criteria) this;
        }

        public Criteria andAprvStatCdNotBetween(String value1, String value2) {
            addCriterion("TIAH.APRV_STAT_CD not between", value1, value2, "aprvStatCd");
            return (Criteria) this;
        }

        public Criteria andAprvReqDtIsNull() {
            addCriterion("TIAH.APRV_REQ_DT is null");
            return (Criteria) this;
        }

        public Criteria andAprvReqDtIsNotNull() {
            addCriterion("TIAH.APRV_REQ_DT is not null");
            return (Criteria) this;
        }

        public Criteria andAprvReqDtEqualTo(Date value) {
            addCriterionForJDBCDate("TIAH.APRV_REQ_DT =", value, "aprvReqDt");
            return (Criteria) this;
        }

        public Criteria andAprvReqDtNotEqualTo(Date value) {
            addCriterionForJDBCDate("TIAH.APRV_REQ_DT <>", value, "aprvReqDt");
            return (Criteria) this;
        }

        public Criteria andAprvReqDtGreaterThan(Date value) {
            addCriterionForJDBCDate("TIAH.APRV_REQ_DT >", value, "aprvReqDt");
            return (Criteria) this;
        }

        public Criteria andAprvReqDtGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("TIAH.APRV_REQ_DT >=", value, "aprvReqDt");
            return (Criteria) this;
        }

        public Criteria andAprvReqDtLessThan(Date value) {
            addCriterionForJDBCDate("TIAH.APRV_REQ_DT <", value, "aprvReqDt");
            return (Criteria) this;
        }

        public Criteria andAprvReqDtLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("TIAH.APRV_REQ_DT <=", value, "aprvReqDt");
            return (Criteria) this;
        }

        public Criteria andAprvReqDtIn(List<Date> values) {
            addCriterionForJDBCDate("TIAH.APRV_REQ_DT in", values, "aprvReqDt");
            return (Criteria) this;
        }

        public Criteria andAprvReqDtNotIn(List<Date> values) {
            addCriterionForJDBCDate("TIAH.APRV_REQ_DT not in", values, "aprvReqDt");
            return (Criteria) this;
        }

        public Criteria andAprvReqDtBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("TIAH.APRV_REQ_DT between", value1, value2, "aprvReqDt");
            return (Criteria) this;
        }

        public Criteria andAprvReqDtNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("TIAH.APRV_REQ_DT not between", value1, value2, "aprvReqDt");
            return (Criteria) this;
        }

        public Criteria andAprvProcDtIsNull() {
            addCriterion("TIAH.APRV_PROC_DT is null");
            return (Criteria) this;
        }

        public Criteria andAprvProcDtIsNotNull() {
            addCriterion("TIAH.APRV_PROC_DT is not null");
            return (Criteria) this;
        }

        public Criteria andAprvProcDtEqualTo(Date value) {
            addCriterionForJDBCDate("TIAH.APRV_PROC_DT =", value, "aprvProcDt");
            return (Criteria) this;
        }

        public Criteria andAprvProcDtNotEqualTo(Date value) {
            addCriterionForJDBCDate("TIAH.APRV_PROC_DT <>", value, "aprvProcDt");
            return (Criteria) this;
        }

        public Criteria andAprvProcDtGreaterThan(Date value) {
            addCriterionForJDBCDate("TIAH.APRV_PROC_DT >", value, "aprvProcDt");
            return (Criteria) this;
        }

        public Criteria andAprvProcDtGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("TIAH.APRV_PROC_DT >=", value, "aprvProcDt");
            return (Criteria) this;
        }

        public Criteria andAprvProcDtLessThan(Date value) {
            addCriterionForJDBCDate("TIAH.APRV_PROC_DT <", value, "aprvProcDt");
            return (Criteria) this;
        }

        public Criteria andAprvProcDtLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("TIAH.APRV_PROC_DT <=", value, "aprvProcDt");
            return (Criteria) this;
        }

        public Criteria andAprvProcDtIn(List<Date> values) {
            addCriterionForJDBCDate("TIAH.APRV_PROC_DT in", values, "aprvProcDt");
            return (Criteria) this;
        }

        public Criteria andAprvProcDtNotIn(List<Date> values) {
            addCriterionForJDBCDate("TIAH.APRV_PROC_DT not in", values, "aprvProcDt");
            return (Criteria) this;
        }

        public Criteria andAprvProcDtBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("TIAH.APRV_PROC_DT between", value1, value2, "aprvProcDt");
            return (Criteria) this;
        }

        public Criteria andAprvProcDtNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("TIAH.APRV_PROC_DT not between", value1, value2, "aprvProcDt");
            return (Criteria) this;
        }

        public Criteria andAprvAdmIdIsNull() {
            addCriterion("TIAH.APRV_ADM_ID is null");
            return (Criteria) this;
        }

        public Criteria andAprvAdmIdIsNotNull() {
            addCriterion("TIAH.APRV_ADM_ID is not null");
            return (Criteria) this;
        }

        public Criteria andAprvAdmIdEqualTo(String value) {
            addCriterion("TIAH.APRV_ADM_ID =", value, "aprvAdmId");
            return (Criteria) this;
        }

        public Criteria andAprvAdmIdNotEqualTo(String value) {
            addCriterion("TIAH.APRV_ADM_ID <>", value, "aprvAdmId");
            return (Criteria) this;
        }

        public Criteria andAprvAdmIdGreaterThan(String value) {
            addCriterion("TIAH.APRV_ADM_ID >", value, "aprvAdmId");
            return (Criteria) this;
        }

        public Criteria andAprvAdmIdGreaterThanOrEqualTo(String value) {
            addCriterion("TIAH.APRV_ADM_ID >=", value, "aprvAdmId");
            return (Criteria) this;
        }

        public Criteria andAprvAdmIdLessThan(String value) {
            addCriterion("TIAH.APRV_ADM_ID <", value, "aprvAdmId");
            return (Criteria) this;
        }

        public Criteria andAprvAdmIdLessThanOrEqualTo(String value) {
            addCriterion("TIAH.APRV_ADM_ID <=", value, "aprvAdmId");
            return (Criteria) this;
        }

        public Criteria andAprvAdmIdLike(String value) {
            addCriterion("TIAH.APRV_ADM_ID like", value, "aprvAdmId");
            return (Criteria) this;
        }

        public Criteria andAprvAdmIdNotLike(String value) {
            addCriterion("TIAH.APRV_ADM_ID not like", value, "aprvAdmId");
            return (Criteria) this;
        }

        public Criteria andAprvAdmIdIn(List<String> values) {
            addCriterion("TIAH.APRV_ADM_ID in", values, "aprvAdmId");
            return (Criteria) this;
        }

        public Criteria andAprvAdmIdNotIn(List<String> values) {
            addCriterion("TIAH.APRV_ADM_ID not in", values, "aprvAdmId");
            return (Criteria) this;
        }

        public Criteria andAprvAdmIdBetween(String value1, String value2) {
            addCriterion("TIAH.APRV_ADM_ID between", value1, value2, "aprvAdmId");
            return (Criteria) this;
        }

        public Criteria andAprvAdmIdNotBetween(String value1, String value2) {
            addCriterion("TIAH.APRV_ADM_ID not between", value1, value2, "aprvAdmId");
            return (Criteria) this;
        }

        public Criteria andRtnRsnIsNull() {
            addCriterion("TIAH.RTN_RSN is null");
            return (Criteria) this;
        }

        public Criteria andRtnRsnIsNotNull() {
            addCriterion("TIAH.RTN_RSN is not null");
            return (Criteria) this;
        }

        public Criteria andRtnRsnEqualTo(String value) {
            addCriterion("TIAH.RTN_RSN =", value, "rtnRsn");
            return (Criteria) this;
        }

        public Criteria andRtnRsnNotEqualTo(String value) {
            addCriterion("TIAH.RTN_RSN <>", value, "rtnRsn");
            return (Criteria) this;
        }

        public Criteria andRtnRsnGreaterThan(String value) {
            addCriterion("TIAH.RTN_RSN >", value, "rtnRsn");
            return (Criteria) this;
        }

        public Criteria andRtnRsnGreaterThanOrEqualTo(String value) {
            addCriterion("TIAH.RTN_RSN >=", value, "rtnRsn");
            return (Criteria) this;
        }

        public Criteria andRtnRsnLessThan(String value) {
            addCriterion("TIAH.RTN_RSN <", value, "rtnRsn");
            return (Criteria) this;
        }

        public Criteria andRtnRsnLessThanOrEqualTo(String value) {
            addCriterion("TIAH.RTN_RSN <=", value, "rtnRsn");
            return (Criteria) this;
        }

        public Criteria andRtnRsnLike(String value) {
            addCriterion("TIAH.RTN_RSN like", value, "rtnRsn");
            return (Criteria) this;
        }

        public Criteria andRtnRsnNotLike(String value) {
            addCriterion("TIAH.RTN_RSN not like", value, "rtnRsn");
            return (Criteria) this;
        }

        public Criteria andRtnRsnIn(List<String> values) {
            addCriterion("TIAH.RTN_RSN in", values, "rtnRsn");
            return (Criteria) this;
        }

        public Criteria andRtnRsnNotIn(List<String> values) {
            addCriterion("TIAH.RTN_RSN not in", values, "rtnRsn");
            return (Criteria) this;
        }

        public Criteria andRtnRsnBetween(String value1, String value2) {
            addCriterion("TIAH.RTN_RSN between", value1, value2, "rtnRsn");
            return (Criteria) this;
        }

        public Criteria andRtnRsnNotBetween(String value1, String value2) {
            addCriterion("TIAH.RTN_RSN not between", value1, value2, "rtnRsn");
            return (Criteria) this;
        }

        public Criteria andRegDtIsNull() {
            addCriterion("TIAH.REG_DT is null");
            return (Criteria) this;
        }

        public Criteria andRegDtIsNotNull() {
            addCriterion("TIAH.REG_DT is not null");
            return (Criteria) this;
        }

        public Criteria andRegDtEqualTo(Date value) {
            addCriterion("TIAH.REG_DT =", value, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtNotEqualTo(Date value) {
            addCriterion("TIAH.REG_DT <>", value, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtGreaterThan(Date value) {
            addCriterion("TIAH.REG_DT >", value, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtGreaterThanOrEqualTo(Date value) {
            addCriterion("TIAH.REG_DT >=", value, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtLessThan(Date value) {
            addCriterion("TIAH.REG_DT <", value, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtLessThanOrEqualTo(Date value) {
            addCriterion("TIAH.REG_DT <=", value, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtIn(List<Date> values) {
            addCriterion("TIAH.REG_DT in", values, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtNotIn(List<Date> values) {
            addCriterion("TIAH.REG_DT not in", values, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtBetween(Date value1, Date value2) {
            addCriterion("TIAH.REG_DT between", value1, value2, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtNotBetween(Date value1, Date value2) {
            addCriterion("TIAH.REG_DT not between", value1, value2, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegIdIsNull() {
            addCriterion("TIAH.REG_ID is null");
            return (Criteria) this;
        }

        public Criteria andRegIdIsNotNull() {
            addCriterion("TIAH.REG_ID is not null");
            return (Criteria) this;
        }

        public Criteria andRegIdEqualTo(String value) {
            addCriterion("TIAH.REG_ID =", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdNotEqualTo(String value) {
            addCriterion("TIAH.REG_ID <>", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdGreaterThan(String value) {
            addCriterion("TIAH.REG_ID >", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdGreaterThanOrEqualTo(String value) {
            addCriterion("TIAH.REG_ID >=", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdLessThan(String value) {
            addCriterion("TIAH.REG_ID <", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdLessThanOrEqualTo(String value) {
            addCriterion("TIAH.REG_ID <=", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdLike(String value) {
            addCriterion("TIAH.REG_ID like", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdNotLike(String value) {
            addCriterion("TIAH.REG_ID not like", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdIn(List<String> values) {
            addCriterion("TIAH.REG_ID in", values, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdNotIn(List<String> values) {
            addCriterion("TIAH.REG_ID not in", values, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdBetween(String value1, String value2) {
            addCriterion("TIAH.REG_ID between", value1, value2, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdNotBetween(String value1, String value2) {
            addCriterion("TIAH.REG_ID not between", value1, value2, "regId");
            return (Criteria) this;
        }

        public Criteria andModDtIsNull() {
            addCriterion("TIAH.MOD_DT is null");
            return (Criteria) this;
        }

        public Criteria andModDtIsNotNull() {
            addCriterion("TIAH.MOD_DT is not null");
            return (Criteria) this;
        }

        public Criteria andModDtEqualTo(Date value) {
            addCriterion("TIAH.MOD_DT =", value, "modDt");
            return (Criteria) this;
        }

        public Criteria andModDtNotEqualTo(Date value) {
            addCriterion("TIAH.MOD_DT <>", value, "modDt");
            return (Criteria) this;
        }

        public Criteria andModDtGreaterThan(Date value) {
            addCriterion("TIAH.MOD_DT >", value, "modDt");
            return (Criteria) this;
        }

        public Criteria andModDtGreaterThanOrEqualTo(Date value) {
            addCriterion("TIAH.MOD_DT >=", value, "modDt");
            return (Criteria) this;
        }

        public Criteria andModDtLessThan(Date value) {
            addCriterion("TIAH.MOD_DT <", value, "modDt");
            return (Criteria) this;
        }

        public Criteria andModDtLessThanOrEqualTo(Date value) {
            addCriterion("TIAH.MOD_DT <=", value, "modDt");
            return (Criteria) this;
        }

        public Criteria andModDtIn(List<Date> values) {
            addCriterion("TIAH.MOD_DT in", values, "modDt");
            return (Criteria) this;
        }

        public Criteria andModDtNotIn(List<Date> values) {
            addCriterion("TIAH.MOD_DT not in", values, "modDt");
            return (Criteria) this;
        }

        public Criteria andModDtBetween(Date value1, Date value2) {
            addCriterion("TIAH.MOD_DT between", value1, value2, "modDt");
            return (Criteria) this;
        }

        public Criteria andModDtNotBetween(Date value1, Date value2) {
            addCriterion("TIAH.MOD_DT not between", value1, value2, "modDt");
            return (Criteria) this;
        }

        public Criteria andModIdIsNull() {
            addCriterion("TIAH.MOD_ID is null");
            return (Criteria) this;
        }

        public Criteria andModIdIsNotNull() {
            addCriterion("TIAH.MOD_ID is not null");
            return (Criteria) this;
        }

        public Criteria andModIdEqualTo(String value) {
            addCriterion("TIAH.MOD_ID =", value, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdNotEqualTo(String value) {
            addCriterion("TIAH.MOD_ID <>", value, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdGreaterThan(String value) {
            addCriterion("TIAH.MOD_ID >", value, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdGreaterThanOrEqualTo(String value) {
            addCriterion("TIAH.MOD_ID >=", value, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdLessThan(String value) {
            addCriterion("TIAH.MOD_ID <", value, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdLessThanOrEqualTo(String value) {
            addCriterion("TIAH.MOD_ID <=", value, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdLike(String value) {
            addCriterion("TIAH.MOD_ID like", value, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdNotLike(String value) {
            addCriterion("TIAH.MOD_ID not like", value, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdIn(List<String> values) {
            addCriterion("TIAH.MOD_ID in", values, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdNotIn(List<String> values) {
            addCriterion("TIAH.MOD_ID not in", values, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdBetween(String value1, String value2) {
            addCriterion("TIAH.MOD_ID between", value1, value2, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdNotBetween(String value1, String value2) {
            addCriterion("TIAH.MOD_ID not between", value1, value2, "modId");
            return (Criteria) this;
        }

        public Criteria andAprvReqCdLikeInsensitive(String value) {
            addCriterion("upper(TIAH.APRV_REQ_CD) like", value.toUpperCase(), "aprvReqCd");
            return (Criteria) this;
        }

        public Criteria andAprvStatCdLikeInsensitive(String value) {
            addCriterion("upper(TIAH.APRV_STAT_CD) like", value.toUpperCase(), "aprvStatCd");
            return (Criteria) this;
        }

        public Criteria andAprvAdmIdLikeInsensitive(String value) {
            addCriterion("upper(TIAH.APRV_ADM_ID) like", value.toUpperCase(), "aprvAdmId");
            return (Criteria) this;
        }

        public Criteria andRtnRsnLikeInsensitive(String value) {
            addCriterion("upper(TIAH.RTN_RSN) like", value.toUpperCase(), "rtnRsn");
            return (Criteria) this;
        }

        public Criteria andRegIdLikeInsensitive(String value) {
            addCriterion("upper(TIAH.REG_ID) like", value.toUpperCase(), "regId");
            return (Criteria) this;
        }

        public Criteria andModIdLikeInsensitive(String value) {
            addCriterion("upper(TIAH.MOD_ID) like", value.toUpperCase(), "modId");
            return (Criteria) this;
        }

        public Criteria andAprvReqCdLikeLeft(String value) {
            addCriterion("TIAH.APRV_REQ_CD like ", "%" + value, "aprvReqCd");
            return (Criteria) this;
        }

        public Criteria andAprvReqCdLikeRight(String value) {
            addCriterion("TIAH.APRV_REQ_CD like ", value + "%", "aprvReqCd");
            return (Criteria) this;
        }

        public Criteria andAprvReqCdLikeBoth(String value) {
            addCriterion("TIAH.APRV_REQ_CD like ", "%" + value + "%", "aprvReqCd");
            return (Criteria) this;
        }

        public Criteria andAprvStatCdLikeLeft(String value) {
            addCriterion("TIAH.APRV_STAT_CD like ", "%" + value, "aprvStatCd");
            return (Criteria) this;
        }

        public Criteria andAprvStatCdLikeRight(String value) {
            addCriterion("TIAH.APRV_STAT_CD like ", value + "%", "aprvStatCd");
            return (Criteria) this;
        }

        public Criteria andAprvStatCdLikeBoth(String value) {
            addCriterion("TIAH.APRV_STAT_CD like ", "%" + value + "%", "aprvStatCd");
            return (Criteria) this;
        }

        public Criteria andAprvAdmIdLikeLeft(String value) {
            addCriterion("TIAH.APRV_ADM_ID like ", "%" + value, "aprvAdmId");
            return (Criteria) this;
        }

        public Criteria andAprvAdmIdLikeRight(String value) {
            addCriterion("TIAH.APRV_ADM_ID like ", value + "%", "aprvAdmId");
            return (Criteria) this;
        }

        public Criteria andAprvAdmIdLikeBoth(String value) {
            addCriterion("TIAH.APRV_ADM_ID like ", "%" + value + "%", "aprvAdmId");
            return (Criteria) this;
        }

        public Criteria andRtnRsnLikeLeft(String value) {
            addCriterion("TIAH.RTN_RSN like ", "%" + value, "rtnRsn");
            return (Criteria) this;
        }

        public Criteria andRtnRsnLikeRight(String value) {
            addCriterion("TIAH.RTN_RSN like ", value + "%", "rtnRsn");
            return (Criteria) this;
        }

        public Criteria andRtnRsnLikeBoth(String value) {
            addCriterion("TIAH.RTN_RSN like ", "%" + value + "%", "rtnRsn");
            return (Criteria) this;
        }

        public Criteria andRegIdLikeLeft(String value) {
            addCriterion("TIAH.REG_ID like ", "%" + value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdLikeRight(String value) {
            addCriterion("TIAH.REG_ID like ", value + "%", "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdLikeBoth(String value) {
            addCriterion("TIAH.REG_ID like ", "%" + value + "%", "regId");
            return (Criteria) this;
        }

        public Criteria andModIdLikeLeft(String value) {
            addCriterion("TIAH.MOD_ID like ", "%" + value, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdLikeRight(String value) {
            addCriterion("TIAH.MOD_ID like ", value + "%", "modId");
            return (Criteria) this;
        }

        public Criteria andModIdLikeBoth(String value) {
            addCriterion("TIAH.MOD_ID like ", "%" + value + "%", "modId");
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