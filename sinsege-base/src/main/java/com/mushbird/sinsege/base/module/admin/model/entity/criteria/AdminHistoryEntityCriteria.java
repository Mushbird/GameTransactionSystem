package com.mushbird.sinsege.base.module.admin.model.entity.criteria;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class AdminHistoryEntityCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    public AdminHistoryEntityCriteria() {
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

        public Criteria andAdmHistIdIsNull() {
            addCriterion("TADMH.ADM_HIST_ID is null");
            return (Criteria) this;
        }

        public Criteria andAdmHistIdIsNotNull() {
            addCriterion("TADMH.ADM_HIST_ID is not null");
            return (Criteria) this;
        }

        public Criteria andAdmHistIdEqualTo(Integer value) {
            addCriterion("TADMH.ADM_HIST_ID =", value, "admHistId");
            return (Criteria) this;
        }

        public Criteria andAdmHistIdNotEqualTo(Integer value) {
            addCriterion("TADMH.ADM_HIST_ID <>", value, "admHistId");
            return (Criteria) this;
        }

        public Criteria andAdmHistIdGreaterThan(Integer value) {
            addCriterion("TADMH.ADM_HIST_ID >", value, "admHistId");
            return (Criteria) this;
        }

        public Criteria andAdmHistIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("TADMH.ADM_HIST_ID >=", value, "admHistId");
            return (Criteria) this;
        }

        public Criteria andAdmHistIdLessThan(Integer value) {
            addCriterion("TADMH.ADM_HIST_ID <", value, "admHistId");
            return (Criteria) this;
        }

        public Criteria andAdmHistIdLessThanOrEqualTo(Integer value) {
            addCriterion("TADMH.ADM_HIST_ID <=", value, "admHistId");
            return (Criteria) this;
        }

        public Criteria andAdmHistIdIn(List<Integer> values) {
            addCriterion("TADMH.ADM_HIST_ID in", values, "admHistId");
            return (Criteria) this;
        }

        public Criteria andAdmHistIdNotIn(List<Integer> values) {
            addCriterion("TADMH.ADM_HIST_ID not in", values, "admHistId");
            return (Criteria) this;
        }

        public Criteria andAdmHistIdBetween(Integer value1, Integer value2) {
            addCriterion("TADMH.ADM_HIST_ID between", value1, value2, "admHistId");
            return (Criteria) this;
        }

        public Criteria andAdmHistIdNotBetween(Integer value1, Integer value2) {
            addCriterion("TADMH.ADM_HIST_ID not between", value1, value2, "admHistId");
            return (Criteria) this;
        }

        public Criteria andAdmIdIsNull() {
            addCriterion("TADMH.ADM_ID is null");
            return (Criteria) this;
        }

        public Criteria andAdmIdIsNotNull() {
            addCriterion("TADMH.ADM_ID is not null");
            return (Criteria) this;
        }

        public Criteria andAdmIdEqualTo(String value) {
            addCriterion("TADMH.ADM_ID =", value, "admId");
            return (Criteria) this;
        }

        public Criteria andAdmIdNotEqualTo(String value) {
            addCriterion("TADMH.ADM_ID <>", value, "admId");
            return (Criteria) this;
        }

        public Criteria andAdmIdGreaterThan(String value) {
            addCriterion("TADMH.ADM_ID >", value, "admId");
            return (Criteria) this;
        }

        public Criteria andAdmIdGreaterThanOrEqualTo(String value) {
            addCriterion("TADMH.ADM_ID >=", value, "admId");
            return (Criteria) this;
        }

        public Criteria andAdmIdLessThan(String value) {
            addCriterion("TADMH.ADM_ID <", value, "admId");
            return (Criteria) this;
        }

        public Criteria andAdmIdLessThanOrEqualTo(String value) {
            addCriterion("TADMH.ADM_ID <=", value, "admId");
            return (Criteria) this;
        }

        public Criteria andAdmIdLike(String value) {
            addCriterion("TADMH.ADM_ID like", value, "admId");
            return (Criteria) this;
        }

        public Criteria andAdmIdNotLike(String value) {
            addCriterion("TADMH.ADM_ID not like", value, "admId");
            return (Criteria) this;
        }

        public Criteria andAdmIdIn(List<String> values) {
            addCriterion("TADMH.ADM_ID in", values, "admId");
            return (Criteria) this;
        }

        public Criteria andAdmIdNotIn(List<String> values) {
            addCriterion("TADMH.ADM_ID not in", values, "admId");
            return (Criteria) this;
        }

        public Criteria andAdmIdBetween(String value1, String value2) {
            addCriterion("TADMH.ADM_ID between", value1, value2, "admId");
            return (Criteria) this;
        }

        public Criteria andAdmIdNotBetween(String value1, String value2) {
            addCriterion("TADMH.ADM_ID not between", value1, value2, "admId");
            return (Criteria) this;
        }

        public Criteria andAdmRoleIdIsNull() {
            addCriterion("TADMH.ADM_ROLE_ID is null");
            return (Criteria) this;
        }

        public Criteria andAdmRoleIdIsNotNull() {
            addCriterion("TADMH.ADM_ROLE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andAdmRoleIdEqualTo(Integer value) {
            addCriterion("TADMH.ADM_ROLE_ID =", value, "admRoleId");
            return (Criteria) this;
        }

        public Criteria andAdmRoleIdNotEqualTo(Integer value) {
            addCriterion("TADMH.ADM_ROLE_ID <>", value, "admRoleId");
            return (Criteria) this;
        }

        public Criteria andAdmRoleIdGreaterThan(Integer value) {
            addCriterion("TADMH.ADM_ROLE_ID >", value, "admRoleId");
            return (Criteria) this;
        }

        public Criteria andAdmRoleIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("TADMH.ADM_ROLE_ID >=", value, "admRoleId");
            return (Criteria) this;
        }

        public Criteria andAdmRoleIdLessThan(Integer value) {
            addCriterion("TADMH.ADM_ROLE_ID <", value, "admRoleId");
            return (Criteria) this;
        }

        public Criteria andAdmRoleIdLessThanOrEqualTo(Integer value) {
            addCriterion("TADMH.ADM_ROLE_ID <=", value, "admRoleId");
            return (Criteria) this;
        }

        public Criteria andAdmRoleIdIn(List<Integer> values) {
            addCriterion("TADMH.ADM_ROLE_ID in", values, "admRoleId");
            return (Criteria) this;
        }

        public Criteria andAdmRoleIdNotIn(List<Integer> values) {
            addCriterion("TADMH.ADM_ROLE_ID not in", values, "admRoleId");
            return (Criteria) this;
        }

        public Criteria andAdmRoleIdBetween(Integer value1, Integer value2) {
            addCriterion("TADMH.ADM_ROLE_ID between", value1, value2, "admRoleId");
            return (Criteria) this;
        }

        public Criteria andAdmRoleIdNotBetween(Integer value1, Integer value2) {
            addCriterion("TADMH.ADM_ROLE_ID not between", value1, value2, "admRoleId");
            return (Criteria) this;
        }

        public Criteria andAdmRoleCdIsNull() {
            addCriterion("TADMH.ADM_ROLE_CD is null");
            return (Criteria) this;
        }

        public Criteria andAdmRoleCdIsNotNull() {
            addCriterion("TADMH.ADM_ROLE_CD is not null");
            return (Criteria) this;
        }

        public Criteria andAdmRoleCdEqualTo(String value) {
            addCriterion("TADMH.ADM_ROLE_CD =", value, "admRoleCd");
            return (Criteria) this;
        }

        public Criteria andAdmRoleCdNotEqualTo(String value) {
            addCriterion("TADMH.ADM_ROLE_CD <>", value, "admRoleCd");
            return (Criteria) this;
        }

        public Criteria andAdmRoleCdGreaterThan(String value) {
            addCriterion("TADMH.ADM_ROLE_CD >", value, "admRoleCd");
            return (Criteria) this;
        }

        public Criteria andAdmRoleCdGreaterThanOrEqualTo(String value) {
            addCriterion("TADMH.ADM_ROLE_CD >=", value, "admRoleCd");
            return (Criteria) this;
        }

        public Criteria andAdmRoleCdLessThan(String value) {
            addCriterion("TADMH.ADM_ROLE_CD <", value, "admRoleCd");
            return (Criteria) this;
        }

        public Criteria andAdmRoleCdLessThanOrEqualTo(String value) {
            addCriterion("TADMH.ADM_ROLE_CD <=", value, "admRoleCd");
            return (Criteria) this;
        }

        public Criteria andAdmRoleCdLike(String value) {
            addCriterion("TADMH.ADM_ROLE_CD like", value, "admRoleCd");
            return (Criteria) this;
        }

        public Criteria andAdmRoleCdNotLike(String value) {
            addCriterion("TADMH.ADM_ROLE_CD not like", value, "admRoleCd");
            return (Criteria) this;
        }

        public Criteria andAdmRoleCdIn(List<String> values) {
            addCriterion("TADMH.ADM_ROLE_CD in", values, "admRoleCd");
            return (Criteria) this;
        }

        public Criteria andAdmRoleCdNotIn(List<String> values) {
            addCriterion("TADMH.ADM_ROLE_CD not in", values, "admRoleCd");
            return (Criteria) this;
        }

        public Criteria andAdmRoleCdBetween(String value1, String value2) {
            addCriterion("TADMH.ADM_ROLE_CD between", value1, value2, "admRoleCd");
            return (Criteria) this;
        }

        public Criteria andAdmRoleCdNotBetween(String value1, String value2) {
            addCriterion("TADMH.ADM_ROLE_CD not between", value1, value2, "admRoleCd");
            return (Criteria) this;
        }

        public Criteria andAprvGrdCdIsNull() {
            addCriterion("TADMH.APRV_GRD_CD is null");
            return (Criteria) this;
        }

        public Criteria andAprvGrdCdIsNotNull() {
            addCriterion("TADMH.APRV_GRD_CD is not null");
            return (Criteria) this;
        }

        public Criteria andAprvGrdCdEqualTo(String value) {
            addCriterion("TADMH.APRV_GRD_CD =", value, "aprvGrdCd");
            return (Criteria) this;
        }

        public Criteria andAprvGrdCdNotEqualTo(String value) {
            addCriterion("TADMH.APRV_GRD_CD <>", value, "aprvGrdCd");
            return (Criteria) this;
        }

        public Criteria andAprvGrdCdGreaterThan(String value) {
            addCriterion("TADMH.APRV_GRD_CD >", value, "aprvGrdCd");
            return (Criteria) this;
        }

        public Criteria andAprvGrdCdGreaterThanOrEqualTo(String value) {
            addCriterion("TADMH.APRV_GRD_CD >=", value, "aprvGrdCd");
            return (Criteria) this;
        }

        public Criteria andAprvGrdCdLessThan(String value) {
            addCriterion("TADMH.APRV_GRD_CD <", value, "aprvGrdCd");
            return (Criteria) this;
        }

        public Criteria andAprvGrdCdLessThanOrEqualTo(String value) {
            addCriterion("TADMH.APRV_GRD_CD <=", value, "aprvGrdCd");
            return (Criteria) this;
        }

        public Criteria andAprvGrdCdLike(String value) {
            addCriterion("TADMH.APRV_GRD_CD like", value, "aprvGrdCd");
            return (Criteria) this;
        }

        public Criteria andAprvGrdCdNotLike(String value) {
            addCriterion("TADMH.APRV_GRD_CD not like", value, "aprvGrdCd");
            return (Criteria) this;
        }

        public Criteria andAprvGrdCdIn(List<String> values) {
            addCriterion("TADMH.APRV_GRD_CD in", values, "aprvGrdCd");
            return (Criteria) this;
        }

        public Criteria andAprvGrdCdNotIn(List<String> values) {
            addCriterion("TADMH.APRV_GRD_CD not in", values, "aprvGrdCd");
            return (Criteria) this;
        }

        public Criteria andAprvGrdCdBetween(String value1, String value2) {
            addCriterion("TADMH.APRV_GRD_CD between", value1, value2, "aprvGrdCd");
            return (Criteria) this;
        }

        public Criteria andAprvGrdCdNotBetween(String value1, String value2) {
            addCriterion("TADMH.APRV_GRD_CD not between", value1, value2, "aprvGrdCd");
            return (Criteria) this;
        }

        public Criteria andAdmHistTpCdIsNull() {
            addCriterion("TADMH.ADM_HIST_TP_CD is null");
            return (Criteria) this;
        }

        public Criteria andAdmHistTpCdIsNotNull() {
            addCriterion("TADMH.ADM_HIST_TP_CD is not null");
            return (Criteria) this;
        }

        public Criteria andAdmHistTpCdEqualTo(String value) {
            addCriterion("TADMH.ADM_HIST_TP_CD =", value, "admHistTpCd");
            return (Criteria) this;
        }

        public Criteria andAdmHistTpCdNotEqualTo(String value) {
            addCriterion("TADMH.ADM_HIST_TP_CD <>", value, "admHistTpCd");
            return (Criteria) this;
        }

        public Criteria andAdmHistTpCdGreaterThan(String value) {
            addCriterion("TADMH.ADM_HIST_TP_CD >", value, "admHistTpCd");
            return (Criteria) this;
        }

        public Criteria andAdmHistTpCdGreaterThanOrEqualTo(String value) {
            addCriterion("TADMH.ADM_HIST_TP_CD >=", value, "admHistTpCd");
            return (Criteria) this;
        }

        public Criteria andAdmHistTpCdLessThan(String value) {
            addCriterion("TADMH.ADM_HIST_TP_CD <", value, "admHistTpCd");
            return (Criteria) this;
        }

        public Criteria andAdmHistTpCdLessThanOrEqualTo(String value) {
            addCriterion("TADMH.ADM_HIST_TP_CD <=", value, "admHistTpCd");
            return (Criteria) this;
        }

        public Criteria andAdmHistTpCdLike(String value) {
            addCriterion("TADMH.ADM_HIST_TP_CD like", value, "admHistTpCd");
            return (Criteria) this;
        }

        public Criteria andAdmHistTpCdNotLike(String value) {
            addCriterion("TADMH.ADM_HIST_TP_CD not like", value, "admHistTpCd");
            return (Criteria) this;
        }

        public Criteria andAdmHistTpCdIn(List<String> values) {
            addCriterion("TADMH.ADM_HIST_TP_CD in", values, "admHistTpCd");
            return (Criteria) this;
        }

        public Criteria andAdmHistTpCdNotIn(List<String> values) {
            addCriterion("TADMH.ADM_HIST_TP_CD not in", values, "admHistTpCd");
            return (Criteria) this;
        }

        public Criteria andAdmHistTpCdBetween(String value1, String value2) {
            addCriterion("TADMH.ADM_HIST_TP_CD between", value1, value2, "admHistTpCd");
            return (Criteria) this;
        }

        public Criteria andAdmHistTpCdNotBetween(String value1, String value2) {
            addCriterion("TADMH.ADM_HIST_TP_CD not between", value1, value2, "admHistTpCd");
            return (Criteria) this;
        }

        public Criteria andUrlAddrIsNull() {
            addCriterion("TADMH.URL_ADDR is null");
            return (Criteria) this;
        }

        public Criteria andUrlAddrIsNotNull() {
            addCriterion("TADMH.URL_ADDR is not null");
            return (Criteria) this;
        }

        public Criteria andUrlAddrEqualTo(String value) {
            addCriterion("TADMH.URL_ADDR =", value, "urlAddr");
            return (Criteria) this;
        }

        public Criteria andUrlAddrNotEqualTo(String value) {
            addCriterion("TADMH.URL_ADDR <>", value, "urlAddr");
            return (Criteria) this;
        }

        public Criteria andUrlAddrGreaterThan(String value) {
            addCriterion("TADMH.URL_ADDR >", value, "urlAddr");
            return (Criteria) this;
        }

        public Criteria andUrlAddrGreaterThanOrEqualTo(String value) {
            addCriterion("TADMH.URL_ADDR >=", value, "urlAddr");
            return (Criteria) this;
        }

        public Criteria andUrlAddrLessThan(String value) {
            addCriterion("TADMH.URL_ADDR <", value, "urlAddr");
            return (Criteria) this;
        }

        public Criteria andUrlAddrLessThanOrEqualTo(String value) {
            addCriterion("TADMH.URL_ADDR <=", value, "urlAddr");
            return (Criteria) this;
        }

        public Criteria andUrlAddrLike(String value) {
            addCriterion("TADMH.URL_ADDR like", value, "urlAddr");
            return (Criteria) this;
        }

        public Criteria andUrlAddrNotLike(String value) {
            addCriterion("TADMH.URL_ADDR not like", value, "urlAddr");
            return (Criteria) this;
        }

        public Criteria andUrlAddrIn(List<String> values) {
            addCriterion("TADMH.URL_ADDR in", values, "urlAddr");
            return (Criteria) this;
        }

        public Criteria andUrlAddrNotIn(List<String> values) {
            addCriterion("TADMH.URL_ADDR not in", values, "urlAddr");
            return (Criteria) this;
        }

        public Criteria andUrlAddrBetween(String value1, String value2) {
            addCriterion("TADMH.URL_ADDR between", value1, value2, "urlAddr");
            return (Criteria) this;
        }

        public Criteria andUrlAddrNotBetween(String value1, String value2) {
            addCriterion("TADMH.URL_ADDR not between", value1, value2, "urlAddr");
            return (Criteria) this;
        }

        public Criteria andContIsNull() {
            addCriterion("TADMH.CONT is null");
            return (Criteria) this;
        }

        public Criteria andContIsNotNull() {
            addCriterion("TADMH.CONT is not null");
            return (Criteria) this;
        }

        public Criteria andContEqualTo(String value) {
            addCriterion("TADMH.CONT =", value, "cont");
            return (Criteria) this;
        }

        public Criteria andContNotEqualTo(String value) {
            addCriterion("TADMH.CONT <>", value, "cont");
            return (Criteria) this;
        }

        public Criteria andContGreaterThan(String value) {
            addCriterion("TADMH.CONT >", value, "cont");
            return (Criteria) this;
        }

        public Criteria andContGreaterThanOrEqualTo(String value) {
            addCriterion("TADMH.CONT >=", value, "cont");
            return (Criteria) this;
        }

        public Criteria andContLessThan(String value) {
            addCriterion("TADMH.CONT <", value, "cont");
            return (Criteria) this;
        }

        public Criteria andContLessThanOrEqualTo(String value) {
            addCriterion("TADMH.CONT <=", value, "cont");
            return (Criteria) this;
        }

        public Criteria andContLike(String value) {
            addCriterion("TADMH.CONT like", value, "cont");
            return (Criteria) this;
        }

        public Criteria andContNotLike(String value) {
            addCriterion("TADMH.CONT not like", value, "cont");
            return (Criteria) this;
        }

        public Criteria andContIn(List<String> values) {
            addCriterion("TADMH.CONT in", values, "cont");
            return (Criteria) this;
        }

        public Criteria andContNotIn(List<String> values) {
            addCriterion("TADMH.CONT not in", values, "cont");
            return (Criteria) this;
        }

        public Criteria andContBetween(String value1, String value2) {
            addCriterion("TADMH.CONT between", value1, value2, "cont");
            return (Criteria) this;
        }

        public Criteria andContNotBetween(String value1, String value2) {
            addCriterion("TADMH.CONT not between", value1, value2, "cont");
            return (Criteria) this;
        }

        public Criteria andAdmHistDtIsNull() {
            addCriterion("TADMH.ADM_HIST_DT is null");
            return (Criteria) this;
        }

        public Criteria andAdmHistDtIsNotNull() {
            addCriterion("TADMH.ADM_HIST_DT is not null");
            return (Criteria) this;
        }

        public Criteria andAdmHistDtEqualTo(Date value) {
            addCriterionForJDBCDate("TADMH.ADM_HIST_DT =", value, "admHistDt");
            return (Criteria) this;
        }

        public Criteria andAdmHistDtNotEqualTo(Date value) {
            addCriterionForJDBCDate("TADMH.ADM_HIST_DT <>", value, "admHistDt");
            return (Criteria) this;
        }

        public Criteria andAdmHistDtGreaterThan(Date value) {
            addCriterionForJDBCDate("TADMH.ADM_HIST_DT >", value, "admHistDt");
            return (Criteria) this;
        }

        public Criteria andAdmHistDtGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("TADMH.ADM_HIST_DT >=", value, "admHistDt");
            return (Criteria) this;
        }

        public Criteria andAdmHistDtLessThan(Date value) {
            addCriterionForJDBCDate("TADMH.ADM_HIST_DT <", value, "admHistDt");
            return (Criteria) this;
        }

        public Criteria andAdmHistDtLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("TADMH.ADM_HIST_DT <=", value, "admHistDt");
            return (Criteria) this;
        }

        public Criteria andAdmHistDtIn(List<Date> values) {
            addCriterionForJDBCDate("TADMH.ADM_HIST_DT in", values, "admHistDt");
            return (Criteria) this;
        }

        public Criteria andAdmHistDtNotIn(List<Date> values) {
            addCriterionForJDBCDate("TADMH.ADM_HIST_DT not in", values, "admHistDt");
            return (Criteria) this;
        }

        public Criteria andAdmHistDtBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("TADMH.ADM_HIST_DT between", value1, value2, "admHistDt");
            return (Criteria) this;
        }

        public Criteria andAdmHistDtNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("TADMH.ADM_HIST_DT not between", value1, value2, "admHistDt");
            return (Criteria) this;
        }

        public Criteria andAdmIdLikeInsensitive(String value) {
            addCriterion("upper(TADMH.ADM_ID) like", value.toUpperCase(), "admId");
            return (Criteria) this;
        }

        public Criteria andAdmRoleCdLikeInsensitive(String value) {
            addCriterion("upper(TADMH.ADM_ROLE_CD) like", value.toUpperCase(), "admRoleCd");
            return (Criteria) this;
        }

        public Criteria andAprvGrdCdLikeInsensitive(String value) {
            addCriterion("upper(TADMH.APRV_GRD_CD) like", value.toUpperCase(), "aprvGrdCd");
            return (Criteria) this;
        }

        public Criteria andAdmHistTpCdLikeInsensitive(String value) {
            addCriterion("upper(TADMH.ADM_HIST_TP_CD) like", value.toUpperCase(), "admHistTpCd");
            return (Criteria) this;
        }

        public Criteria andUrlAddrLikeInsensitive(String value) {
            addCriterion("upper(TADMH.URL_ADDR) like", value.toUpperCase(), "urlAddr");
            return (Criteria) this;
        }

        public Criteria andContLikeInsensitive(String value) {
            addCriterion("upper(TADMH.CONT) like", value.toUpperCase(), "cont");
            return (Criteria) this;
        }

        public Criteria andAdmIdLikeLeft(String value) {
            addCriterion("TADMH.ADM_ID like ", "%" + value, "admId");
            return (Criteria) this;
        }

        public Criteria andAdmIdLikeRight(String value) {
            addCriterion("TADMH.ADM_ID like ", value + "%", "admId");
            return (Criteria) this;
        }

        public Criteria andAdmIdLikeBoth(String value) {
            addCriterion("TADMH.ADM_ID like ", "%" + value + "%", "admId");
            return (Criteria) this;
        }

        public Criteria andAdmRoleCdLikeLeft(String value) {
            addCriterion("TADMH.ADM_ROLE_CD like ", "%" + value, "admRoleCd");
            return (Criteria) this;
        }

        public Criteria andAdmRoleCdLikeRight(String value) {
            addCriterion("TADMH.ADM_ROLE_CD like ", value + "%", "admRoleCd");
            return (Criteria) this;
        }

        public Criteria andAdmRoleCdLikeBoth(String value) {
            addCriterion("TADMH.ADM_ROLE_CD like ", "%" + value + "%", "admRoleCd");
            return (Criteria) this;
        }

        public Criteria andAprvGrdCdLikeLeft(String value) {
            addCriterion("TADMH.APRV_GRD_CD like ", "%" + value, "aprvGrdCd");
            return (Criteria) this;
        }

        public Criteria andAprvGrdCdLikeRight(String value) {
            addCriterion("TADMH.APRV_GRD_CD like ", value + "%", "aprvGrdCd");
            return (Criteria) this;
        }

        public Criteria andAprvGrdCdLikeBoth(String value) {
            addCriterion("TADMH.APRV_GRD_CD like ", "%" + value + "%", "aprvGrdCd");
            return (Criteria) this;
        }

        public Criteria andAdmHistTpCdLikeLeft(String value) {
            addCriterion("TADMH.ADM_HIST_TP_CD like ", "%" + value, "admHistTpCd");
            return (Criteria) this;
        }

        public Criteria andAdmHistTpCdLikeRight(String value) {
            addCriterion("TADMH.ADM_HIST_TP_CD like ", value + "%", "admHistTpCd");
            return (Criteria) this;
        }

        public Criteria andAdmHistTpCdLikeBoth(String value) {
            addCriterion("TADMH.ADM_HIST_TP_CD like ", "%" + value + "%", "admHistTpCd");
            return (Criteria) this;
        }

        public Criteria andUrlAddrLikeLeft(String value) {
            addCriterion("TADMH.URL_ADDR like ", "%" + value, "urlAddr");
            return (Criteria) this;
        }

        public Criteria andUrlAddrLikeRight(String value) {
            addCriterion("TADMH.URL_ADDR like ", value + "%", "urlAddr");
            return (Criteria) this;
        }

        public Criteria andUrlAddrLikeBoth(String value) {
            addCriterion("TADMH.URL_ADDR like ", "%" + value + "%", "urlAddr");
            return (Criteria) this;
        }

        public Criteria andContLikeLeft(String value) {
            addCriterion("TADMH.CONT like ", "%" + value, "cont");
            return (Criteria) this;
        }

        public Criteria andContLikeRight(String value) {
            addCriterion("TADMH.CONT like ", value + "%", "cont");
            return (Criteria) this;
        }

        public Criteria andContLikeBoth(String value) {
            addCriterion("TADMH.CONT like ", "%" + value + "%", "cont");
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