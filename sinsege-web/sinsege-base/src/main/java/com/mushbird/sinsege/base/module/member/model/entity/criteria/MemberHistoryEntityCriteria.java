package com.mushbird.sinsege.base.module.member.model.entity.criteria;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class MemberHistoryEntityCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    public MemberHistoryEntityCriteria() {
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

        public Criteria andMbrHistIdIsNull() {
            addCriterion("TMH.MBR_HIST_ID is null");
            return (Criteria) this;
        }

        public Criteria andMbrHistIdIsNotNull() {
            addCriterion("TMH.MBR_HIST_ID is not null");
            return (Criteria) this;
        }

        public Criteria andMbrHistIdEqualTo(Integer value) {
            addCriterion("TMH.MBR_HIST_ID =", value, "mbrHistId");
            return (Criteria) this;
        }

        public Criteria andMbrHistIdNotEqualTo(Integer value) {
            addCriterion("TMH.MBR_HIST_ID <>", value, "mbrHistId");
            return (Criteria) this;
        }

        public Criteria andMbrHistIdGreaterThan(Integer value) {
            addCriterion("TMH.MBR_HIST_ID >", value, "mbrHistId");
            return (Criteria) this;
        }

        public Criteria andMbrHistIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("TMH.MBR_HIST_ID >=", value, "mbrHistId");
            return (Criteria) this;
        }

        public Criteria andMbrHistIdLessThan(Integer value) {
            addCriterion("TMH.MBR_HIST_ID <", value, "mbrHistId");
            return (Criteria) this;
        }

        public Criteria andMbrHistIdLessThanOrEqualTo(Integer value) {
            addCriterion("TMH.MBR_HIST_ID <=", value, "mbrHistId");
            return (Criteria) this;
        }

        public Criteria andMbrHistIdIn(List<Integer> values) {
            addCriterion("TMH.MBR_HIST_ID in", values, "mbrHistId");
            return (Criteria) this;
        }

        public Criteria andMbrHistIdNotIn(List<Integer> values) {
            addCriterion("TMH.MBR_HIST_ID not in", values, "mbrHistId");
            return (Criteria) this;
        }

        public Criteria andMbrHistIdBetween(Integer value1, Integer value2) {
            addCriterion("TMH.MBR_HIST_ID between", value1, value2, "mbrHistId");
            return (Criteria) this;
        }

        public Criteria andMbrHistIdNotBetween(Integer value1, Integer value2) {
            addCriterion("TMH.MBR_HIST_ID not between", value1, value2, "mbrHistId");
            return (Criteria) this;
        }

        public Criteria andMbrIdIsNull() {
            addCriterion("TMH.MBR_ID is null");
            return (Criteria) this;
        }

        public Criteria andMbrIdIsNotNull() {
            addCriterion("TMH.MBR_ID is not null");
            return (Criteria) this;
        }

        public Criteria andMbrIdEqualTo(String value) {
            addCriterion("TMH.MBR_ID =", value, "mbrId");
            return (Criteria) this;
        }

        public Criteria andMbrIdNotEqualTo(String value) {
            addCriterion("TMH.MBR_ID <>", value, "mbrId");
            return (Criteria) this;
        }

        public Criteria andMbrIdGreaterThan(String value) {
            addCriterion("TMH.MBR_ID >", value, "mbrId");
            return (Criteria) this;
        }

        public Criteria andMbrIdGreaterThanOrEqualTo(String value) {
            addCriterion("TMH.MBR_ID >=", value, "mbrId");
            return (Criteria) this;
        }

        public Criteria andMbrIdLessThan(String value) {
            addCriterion("TMH.MBR_ID <", value, "mbrId");
            return (Criteria) this;
        }

        public Criteria andMbrIdLessThanOrEqualTo(String value) {
            addCriterion("TMH.MBR_ID <=", value, "mbrId");
            return (Criteria) this;
        }

        public Criteria andMbrIdLike(String value) {
            addCriterion("TMH.MBR_ID like", value, "mbrId");
            return (Criteria) this;
        }

        public Criteria andMbrIdNotLike(String value) {
            addCriterion("TMH.MBR_ID not like", value, "mbrId");
            return (Criteria) this;
        }

        public Criteria andMbrIdIn(List<String> values) {
            addCriterion("TMH.MBR_ID in", values, "mbrId");
            return (Criteria) this;
        }

        public Criteria andMbrIdNotIn(List<String> values) {
            addCriterion("TMH.MBR_ID not in", values, "mbrId");
            return (Criteria) this;
        }

        public Criteria andMbrIdBetween(String value1, String value2) {
            addCriterion("TMH.MBR_ID between", value1, value2, "mbrId");
            return (Criteria) this;
        }

        public Criteria andMbrIdNotBetween(String value1, String value2) {
            addCriterion("TMH.MBR_ID not between", value1, value2, "mbrId");
            return (Criteria) this;
        }

        public Criteria andAdmIdIsNull() {
            addCriterion("TMH.ADM_ID is null");
            return (Criteria) this;
        }

        public Criteria andAdmIdIsNotNull() {
            addCriterion("TMH.ADM_ID is not null");
            return (Criteria) this;
        }

        public Criteria andAdmIdEqualTo(String value) {
            addCriterion("TMH.ADM_ID =", value, "admId");
            return (Criteria) this;
        }

        public Criteria andAdmIdNotEqualTo(String value) {
            addCriterion("TMH.ADM_ID <>", value, "admId");
            return (Criteria) this;
        }

        public Criteria andAdmIdGreaterThan(String value) {
            addCriterion("TMH.ADM_ID >", value, "admId");
            return (Criteria) this;
        }

        public Criteria andAdmIdGreaterThanOrEqualTo(String value) {
            addCriterion("TMH.ADM_ID >=", value, "admId");
            return (Criteria) this;
        }

        public Criteria andAdmIdLessThan(String value) {
            addCriterion("TMH.ADM_ID <", value, "admId");
            return (Criteria) this;
        }

        public Criteria andAdmIdLessThanOrEqualTo(String value) {
            addCriterion("TMH.ADM_ID <=", value, "admId");
            return (Criteria) this;
        }

        public Criteria andAdmIdLike(String value) {
            addCriterion("TMH.ADM_ID like", value, "admId");
            return (Criteria) this;
        }

        public Criteria andAdmIdNotLike(String value) {
            addCriterion("TMH.ADM_ID not like", value, "admId");
            return (Criteria) this;
        }

        public Criteria andAdmIdIn(List<String> values) {
            addCriterion("TMH.ADM_ID in", values, "admId");
            return (Criteria) this;
        }

        public Criteria andAdmIdNotIn(List<String> values) {
            addCriterion("TMH.ADM_ID not in", values, "admId");
            return (Criteria) this;
        }

        public Criteria andAdmIdBetween(String value1, String value2) {
            addCriterion("TMH.ADM_ID between", value1, value2, "admId");
            return (Criteria) this;
        }

        public Criteria andAdmIdNotBetween(String value1, String value2) {
            addCriterion("TMH.ADM_ID not between", value1, value2, "admId");
            return (Criteria) this;
        }

        public Criteria andMbrHistTpCdIsNull() {
            addCriterion("TMH.MBR_HIST_TP_CD is null");
            return (Criteria) this;
        }

        public Criteria andMbrHistTpCdIsNotNull() {
            addCriterion("TMH.MBR_HIST_TP_CD is not null");
            return (Criteria) this;
        }

        public Criteria andMbrHistTpCdEqualTo(String value) {
            addCriterion("TMH.MBR_HIST_TP_CD =", value, "mbrHistTpCd");
            return (Criteria) this;
        }

        public Criteria andMbrHistTpCdNotEqualTo(String value) {
            addCriterion("TMH.MBR_HIST_TP_CD <>", value, "mbrHistTpCd");
            return (Criteria) this;
        }

        public Criteria andMbrHistTpCdGreaterThan(String value) {
            addCriterion("TMH.MBR_HIST_TP_CD >", value, "mbrHistTpCd");
            return (Criteria) this;
        }

        public Criteria andMbrHistTpCdGreaterThanOrEqualTo(String value) {
            addCriterion("TMH.MBR_HIST_TP_CD >=", value, "mbrHistTpCd");
            return (Criteria) this;
        }

        public Criteria andMbrHistTpCdLessThan(String value) {
            addCriterion("TMH.MBR_HIST_TP_CD <", value, "mbrHistTpCd");
            return (Criteria) this;
        }

        public Criteria andMbrHistTpCdLessThanOrEqualTo(String value) {
            addCriterion("TMH.MBR_HIST_TP_CD <=", value, "mbrHistTpCd");
            return (Criteria) this;
        }

        public Criteria andMbrHistTpCdLike(String value) {
            addCriterion("TMH.MBR_HIST_TP_CD like", value, "mbrHistTpCd");
            return (Criteria) this;
        }

        public Criteria andMbrHistTpCdNotLike(String value) {
            addCriterion("TMH.MBR_HIST_TP_CD not like", value, "mbrHistTpCd");
            return (Criteria) this;
        }

        public Criteria andMbrHistTpCdIn(List<String> values) {
            addCriterion("TMH.MBR_HIST_TP_CD in", values, "mbrHistTpCd");
            return (Criteria) this;
        }

        public Criteria andMbrHistTpCdNotIn(List<String> values) {
            addCriterion("TMH.MBR_HIST_TP_CD not in", values, "mbrHistTpCd");
            return (Criteria) this;
        }

        public Criteria andMbrHistTpCdBetween(String value1, String value2) {
            addCriterion("TMH.MBR_HIST_TP_CD between", value1, value2, "mbrHistTpCd");
            return (Criteria) this;
        }

        public Criteria andMbrHistTpCdNotBetween(String value1, String value2) {
            addCriterion("TMH.MBR_HIST_TP_CD not between", value1, value2, "mbrHistTpCd");
            return (Criteria) this;
        }

        public Criteria andMbrHistDtIsNull() {
            addCriterion("TMH.MBR_HIST_DT is null");
            return (Criteria) this;
        }

        public Criteria andMbrHistDtIsNotNull() {
            addCriterion("TMH.MBR_HIST_DT is not null");
            return (Criteria) this;
        }

        public Criteria andMbrHistDtEqualTo(Date value) {
            addCriterionForJDBCDate("TMH.MBR_HIST_DT =", value, "mbrHistDt");
            return (Criteria) this;
        }

        public Criteria andMbrHistDtNotEqualTo(Date value) {
            addCriterionForJDBCDate("TMH.MBR_HIST_DT <>", value, "mbrHistDt");
            return (Criteria) this;
        }

        public Criteria andMbrHistDtGreaterThan(Date value) {
            addCriterionForJDBCDate("TMH.MBR_HIST_DT >", value, "mbrHistDt");
            return (Criteria) this;
        }

        public Criteria andMbrHistDtGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("TMH.MBR_HIST_DT >=", value, "mbrHistDt");
            return (Criteria) this;
        }

        public Criteria andMbrHistDtLessThan(Date value) {
            addCriterionForJDBCDate("TMH.MBR_HIST_DT <", value, "mbrHistDt");
            return (Criteria) this;
        }

        public Criteria andMbrHistDtLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("TMH.MBR_HIST_DT <=", value, "mbrHistDt");
            return (Criteria) this;
        }

        public Criteria andMbrHistDtIn(List<Date> values) {
            addCriterionForJDBCDate("TMH.MBR_HIST_DT in", values, "mbrHistDt");
            return (Criteria) this;
        }

        public Criteria andMbrHistDtNotIn(List<Date> values) {
            addCriterionForJDBCDate("TMH.MBR_HIST_DT not in", values, "mbrHistDt");
            return (Criteria) this;
        }

        public Criteria andMbrHistDtBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("TMH.MBR_HIST_DT between", value1, value2, "mbrHistDt");
            return (Criteria) this;
        }

        public Criteria andMbrHistDtNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("TMH.MBR_HIST_DT not between", value1, value2, "mbrHistDt");
            return (Criteria) this;
        }

        public Criteria andContIsNull() {
            addCriterion("TMH.CONT is null");
            return (Criteria) this;
        }

        public Criteria andContIsNotNull() {
            addCriterion("TMH.CONT is not null");
            return (Criteria) this;
        }

        public Criteria andContEqualTo(String value) {
            addCriterion("TMH.CONT =", value, "cont");
            return (Criteria) this;
        }

        public Criteria andContNotEqualTo(String value) {
            addCriterion("TMH.CONT <>", value, "cont");
            return (Criteria) this;
        }

        public Criteria andContGreaterThan(String value) {
            addCriterion("TMH.CONT >", value, "cont");
            return (Criteria) this;
        }

        public Criteria andContGreaterThanOrEqualTo(String value) {
            addCriterion("TMH.CONT >=", value, "cont");
            return (Criteria) this;
        }

        public Criteria andContLessThan(String value) {
            addCriterion("TMH.CONT <", value, "cont");
            return (Criteria) this;
        }

        public Criteria andContLessThanOrEqualTo(String value) {
            addCriterion("TMH.CONT <=", value, "cont");
            return (Criteria) this;
        }

        public Criteria andContLike(String value) {
            addCriterion("TMH.CONT like", value, "cont");
            return (Criteria) this;
        }

        public Criteria andContNotLike(String value) {
            addCriterion("TMH.CONT not like", value, "cont");
            return (Criteria) this;
        }

        public Criteria andContIn(List<String> values) {
            addCriterion("TMH.CONT in", values, "cont");
            return (Criteria) this;
        }

        public Criteria andContNotIn(List<String> values) {
            addCriterion("TMH.CONT not in", values, "cont");
            return (Criteria) this;
        }

        public Criteria andContBetween(String value1, String value2) {
            addCriterion("TMH.CONT between", value1, value2, "cont");
            return (Criteria) this;
        }

        public Criteria andContNotBetween(String value1, String value2) {
            addCriterion("TMH.CONT not between", value1, value2, "cont");
            return (Criteria) this;
        }

        public Criteria andRegDtIsNull() {
            addCriterion("TMH.REG_DT is null");
            return (Criteria) this;
        }

        public Criteria andRegDtIsNotNull() {
            addCriterion("TMH.REG_DT is not null");
            return (Criteria) this;
        }

        public Criteria andRegDtEqualTo(Date value) {
            addCriterion("TMH.REG_DT =", value, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtNotEqualTo(Date value) {
            addCriterion("TMH.REG_DT <>", value, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtGreaterThan(Date value) {
            addCriterion("TMH.REG_DT >", value, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtGreaterThanOrEqualTo(Date value) {
            addCriterion("TMH.REG_DT >=", value, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtLessThan(Date value) {
            addCriterion("TMH.REG_DT <", value, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtLessThanOrEqualTo(Date value) {
            addCriterion("TMH.REG_DT <=", value, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtIn(List<Date> values) {
            addCriterion("TMH.REG_DT in", values, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtNotIn(List<Date> values) {
            addCriterion("TMH.REG_DT not in", values, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtBetween(Date value1, Date value2) {
            addCriterion("TMH.REG_DT between", value1, value2, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtNotBetween(Date value1, Date value2) {
            addCriterion("TMH.REG_DT not between", value1, value2, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegIdIsNull() {
            addCriterion("TMH.REG_ID is null");
            return (Criteria) this;
        }

        public Criteria andRegIdIsNotNull() {
            addCriterion("TMH.REG_ID is not null");
            return (Criteria) this;
        }

        public Criteria andRegIdEqualTo(String value) {
            addCriterion("TMH.REG_ID =", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdNotEqualTo(String value) {
            addCriterion("TMH.REG_ID <>", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdGreaterThan(String value) {
            addCriterion("TMH.REG_ID >", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdGreaterThanOrEqualTo(String value) {
            addCriterion("TMH.REG_ID >=", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdLessThan(String value) {
            addCriterion("TMH.REG_ID <", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdLessThanOrEqualTo(String value) {
            addCriterion("TMH.REG_ID <=", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdLike(String value) {
            addCriterion("TMH.REG_ID like", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdNotLike(String value) {
            addCriterion("TMH.REG_ID not like", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdIn(List<String> values) {
            addCriterion("TMH.REG_ID in", values, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdNotIn(List<String> values) {
            addCriterion("TMH.REG_ID not in", values, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdBetween(String value1, String value2) {
            addCriterion("TMH.REG_ID between", value1, value2, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdNotBetween(String value1, String value2) {
            addCriterion("TMH.REG_ID not between", value1, value2, "regId");
            return (Criteria) this;
        }

        public Criteria andMbrIdLikeInsensitive(String value) {
            addCriterion("upper(TMH.MBR_ID) like", value.toUpperCase(), "mbrId");
            return (Criteria) this;
        }

        public Criteria andAdmIdLikeInsensitive(String value) {
            addCriterion("upper(TMH.ADM_ID) like", value.toUpperCase(), "admId");
            return (Criteria) this;
        }

        public Criteria andMbrHistTpCdLikeInsensitive(String value) {
            addCriterion("upper(TMH.MBR_HIST_TP_CD) like", value.toUpperCase(), "mbrHistTpCd");
            return (Criteria) this;
        }

        public Criteria andContLikeInsensitive(String value) {
            addCriterion("upper(TMH.CONT) like", value.toUpperCase(), "cont");
            return (Criteria) this;
        }

        public Criteria andRegIdLikeInsensitive(String value) {
            addCriterion("upper(TMH.REG_ID) like", value.toUpperCase(), "regId");
            return (Criteria) this;
        }

        public Criteria andMbrIdLikeLeft(String value) {
            addCriterion("TMH.MBR_ID like ", "%" + value, "mbrId");
            return (Criteria) this;
        }

        public Criteria andMbrIdLikeRight(String value) {
            addCriterion("TMH.MBR_ID like ", value + "%", "mbrId");
            return (Criteria) this;
        }

        public Criteria andMbrIdLikeBoth(String value) {
            addCriterion("TMH.MBR_ID like ", "%" + value + "%", "mbrId");
            return (Criteria) this;
        }

        public Criteria andAdmIdLikeLeft(String value) {
            addCriterion("TMH.ADM_ID like ", "%" + value, "admId");
            return (Criteria) this;
        }

        public Criteria andAdmIdLikeRight(String value) {
            addCriterion("TMH.ADM_ID like ", value + "%", "admId");
            return (Criteria) this;
        }

        public Criteria andAdmIdLikeBoth(String value) {
            addCriterion("TMH.ADM_ID like ", "%" + value + "%", "admId");
            return (Criteria) this;
        }

        public Criteria andMbrHistTpCdLikeLeft(String value) {
            addCriterion("TMH.MBR_HIST_TP_CD like ", "%" + value, "mbrHistTpCd");
            return (Criteria) this;
        }

        public Criteria andMbrHistTpCdLikeRight(String value) {
            addCriterion("TMH.MBR_HIST_TP_CD like ", value + "%", "mbrHistTpCd");
            return (Criteria) this;
        }

        public Criteria andMbrHistTpCdLikeBoth(String value) {
            addCriterion("TMH.MBR_HIST_TP_CD like ", "%" + value + "%", "mbrHistTpCd");
            return (Criteria) this;
        }

        public Criteria andContLikeLeft(String value) {
            addCriterion("TMH.CONT like ", "%" + value, "cont");
            return (Criteria) this;
        }

        public Criteria andContLikeRight(String value) {
            addCriterion("TMH.CONT like ", value + "%", "cont");
            return (Criteria) this;
        }

        public Criteria andContLikeBoth(String value) {
            addCriterion("TMH.CONT like ", "%" + value + "%", "cont");
            return (Criteria) this;
        }

        public Criteria andRegIdLikeLeft(String value) {
            addCriterion("TMH.REG_ID like ", "%" + value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdLikeRight(String value) {
            addCriterion("TMH.REG_ID like ", value + "%", "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdLikeBoth(String value) {
            addCriterion("TMH.REG_ID like ", "%" + value + "%", "regId");
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