package com.mushbird.sinsege.base.module.order.model.entity.criteria;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class OrderHistoryEntityCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    public OrderHistoryEntityCriteria() {
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

        public Criteria andOrdHistIdIsNull() {
            addCriterion("TOH.ORD_HIST_ID is null");
            return (Criteria) this;
        }

        public Criteria andOrdHistIdIsNotNull() {
            addCriterion("TOH.ORD_HIST_ID is not null");
            return (Criteria) this;
        }

        public Criteria andOrdHistIdEqualTo(Integer value) {
            addCriterion("TOH.ORD_HIST_ID =", value, "ordHistId");
            return (Criteria) this;
        }

        public Criteria andOrdHistIdNotEqualTo(Integer value) {
            addCriterion("TOH.ORD_HIST_ID <>", value, "ordHistId");
            return (Criteria) this;
        }

        public Criteria andOrdHistIdGreaterThan(Integer value) {
            addCriterion("TOH.ORD_HIST_ID >", value, "ordHistId");
            return (Criteria) this;
        }

        public Criteria andOrdHistIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("TOH.ORD_HIST_ID >=", value, "ordHistId");
            return (Criteria) this;
        }

        public Criteria andOrdHistIdLessThan(Integer value) {
            addCriterion("TOH.ORD_HIST_ID <", value, "ordHistId");
            return (Criteria) this;
        }

        public Criteria andOrdHistIdLessThanOrEqualTo(Integer value) {
            addCriterion("TOH.ORD_HIST_ID <=", value, "ordHistId");
            return (Criteria) this;
        }

        public Criteria andOrdHistIdIn(List<Integer> values) {
            addCriterion("TOH.ORD_HIST_ID in", values, "ordHistId");
            return (Criteria) this;
        }

        public Criteria andOrdHistIdNotIn(List<Integer> values) {
            addCriterion("TOH.ORD_HIST_ID not in", values, "ordHistId");
            return (Criteria) this;
        }

        public Criteria andOrdHistIdBetween(Integer value1, Integer value2) {
            addCriterion("TOH.ORD_HIST_ID between", value1, value2, "ordHistId");
            return (Criteria) this;
        }

        public Criteria andOrdHistIdNotBetween(Integer value1, Integer value2) {
            addCriterion("TOH.ORD_HIST_ID not between", value1, value2, "ordHistId");
            return (Criteria) this;
        }

        public Criteria andOrdIdIsNull() {
            addCriterion("TOH.ORD_ID is null");
            return (Criteria) this;
        }

        public Criteria andOrdIdIsNotNull() {
            addCriterion("TOH.ORD_ID is not null");
            return (Criteria) this;
        }

        public Criteria andOrdIdEqualTo(Integer value) {
            addCriterion("TOH.ORD_ID =", value, "ordId");
            return (Criteria) this;
        }

        public Criteria andOrdIdNotEqualTo(Integer value) {
            addCriterion("TOH.ORD_ID <>", value, "ordId");
            return (Criteria) this;
        }

        public Criteria andOrdIdGreaterThan(Integer value) {
            addCriterion("TOH.ORD_ID >", value, "ordId");
            return (Criteria) this;
        }

        public Criteria andOrdIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("TOH.ORD_ID >=", value, "ordId");
            return (Criteria) this;
        }

        public Criteria andOrdIdLessThan(Integer value) {
            addCriterion("TOH.ORD_ID <", value, "ordId");
            return (Criteria) this;
        }

        public Criteria andOrdIdLessThanOrEqualTo(Integer value) {
            addCriterion("TOH.ORD_ID <=", value, "ordId");
            return (Criteria) this;
        }

        public Criteria andOrdIdIn(List<Integer> values) {
            addCriterion("TOH.ORD_ID in", values, "ordId");
            return (Criteria) this;
        }

        public Criteria andOrdIdNotIn(List<Integer> values) {
            addCriterion("TOH.ORD_ID not in", values, "ordId");
            return (Criteria) this;
        }

        public Criteria andOrdIdBetween(Integer value1, Integer value2) {
            addCriterion("TOH.ORD_ID between", value1, value2, "ordId");
            return (Criteria) this;
        }

        public Criteria andOrdIdNotBetween(Integer value1, Integer value2) {
            addCriterion("TOH.ORD_ID not between", value1, value2, "ordId");
            return (Criteria) this;
        }

        public Criteria andOrdItemIdIsNull() {
            addCriterion("TOH.ORD_ITEM_ID is null");
            return (Criteria) this;
        }

        public Criteria andOrdItemIdIsNotNull() {
            addCriterion("TOH.ORD_ITEM_ID is not null");
            return (Criteria) this;
        }

        public Criteria andOrdItemIdEqualTo(Integer value) {
            addCriterion("TOH.ORD_ITEM_ID =", value, "ordItemId");
            return (Criteria) this;
        }

        public Criteria andOrdItemIdNotEqualTo(Integer value) {
            addCriterion("TOH.ORD_ITEM_ID <>", value, "ordItemId");
            return (Criteria) this;
        }

        public Criteria andOrdItemIdGreaterThan(Integer value) {
            addCriterion("TOH.ORD_ITEM_ID >", value, "ordItemId");
            return (Criteria) this;
        }

        public Criteria andOrdItemIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("TOH.ORD_ITEM_ID >=", value, "ordItemId");
            return (Criteria) this;
        }

        public Criteria andOrdItemIdLessThan(Integer value) {
            addCriterion("TOH.ORD_ITEM_ID <", value, "ordItemId");
            return (Criteria) this;
        }

        public Criteria andOrdItemIdLessThanOrEqualTo(Integer value) {
            addCriterion("TOH.ORD_ITEM_ID <=", value, "ordItemId");
            return (Criteria) this;
        }

        public Criteria andOrdItemIdIn(List<Integer> values) {
            addCriterion("TOH.ORD_ITEM_ID in", values, "ordItemId");
            return (Criteria) this;
        }

        public Criteria andOrdItemIdNotIn(List<Integer> values) {
            addCriterion("TOH.ORD_ITEM_ID not in", values, "ordItemId");
            return (Criteria) this;
        }

        public Criteria andOrdItemIdBetween(Integer value1, Integer value2) {
            addCriterion("TOH.ORD_ITEM_ID between", value1, value2, "ordItemId");
            return (Criteria) this;
        }

        public Criteria andOrdItemIdNotBetween(Integer value1, Integer value2) {
            addCriterion("TOH.ORD_ITEM_ID not between", value1, value2, "ordItemId");
            return (Criteria) this;
        }

        public Criteria andOrdClmItemIdIsNull() {
            addCriterion("TOH.ORD_CLM_ITEM_ID is null");
            return (Criteria) this;
        }

        public Criteria andOrdClmItemIdIsNotNull() {
            addCriterion("TOH.ORD_CLM_ITEM_ID is not null");
            return (Criteria) this;
        }

        public Criteria andOrdClmItemIdEqualTo(Integer value) {
            addCriterion("TOH.ORD_CLM_ITEM_ID =", value, "ordClmItemId");
            return (Criteria) this;
        }

        public Criteria andOrdClmItemIdNotEqualTo(Integer value) {
            addCriterion("TOH.ORD_CLM_ITEM_ID <>", value, "ordClmItemId");
            return (Criteria) this;
        }

        public Criteria andOrdClmItemIdGreaterThan(Integer value) {
            addCriterion("TOH.ORD_CLM_ITEM_ID >", value, "ordClmItemId");
            return (Criteria) this;
        }

        public Criteria andOrdClmItemIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("TOH.ORD_CLM_ITEM_ID >=", value, "ordClmItemId");
            return (Criteria) this;
        }

        public Criteria andOrdClmItemIdLessThan(Integer value) {
            addCriterion("TOH.ORD_CLM_ITEM_ID <", value, "ordClmItemId");
            return (Criteria) this;
        }

        public Criteria andOrdClmItemIdLessThanOrEqualTo(Integer value) {
            addCriterion("TOH.ORD_CLM_ITEM_ID <=", value, "ordClmItemId");
            return (Criteria) this;
        }

        public Criteria andOrdClmItemIdIn(List<Integer> values) {
            addCriterion("TOH.ORD_CLM_ITEM_ID in", values, "ordClmItemId");
            return (Criteria) this;
        }

        public Criteria andOrdClmItemIdNotIn(List<Integer> values) {
            addCriterion("TOH.ORD_CLM_ITEM_ID not in", values, "ordClmItemId");
            return (Criteria) this;
        }

        public Criteria andOrdClmItemIdBetween(Integer value1, Integer value2) {
            addCriterion("TOH.ORD_CLM_ITEM_ID between", value1, value2, "ordClmItemId");
            return (Criteria) this;
        }

        public Criteria andOrdClmItemIdNotBetween(Integer value1, Integer value2) {
            addCriterion("TOH.ORD_CLM_ITEM_ID not between", value1, value2, "ordClmItemId");
            return (Criteria) this;
        }

        public Criteria andMbrIdIsNull() {
            addCriterion("TOH.MBR_ID is null");
            return (Criteria) this;
        }

        public Criteria andMbrIdIsNotNull() {
            addCriterion("TOH.MBR_ID is not null");
            return (Criteria) this;
        }

        public Criteria andMbrIdEqualTo(String value) {
            addCriterion("TOH.MBR_ID =", value, "mbrId");
            return (Criteria) this;
        }

        public Criteria andMbrIdNotEqualTo(String value) {
            addCriterion("TOH.MBR_ID <>", value, "mbrId");
            return (Criteria) this;
        }

        public Criteria andMbrIdGreaterThan(String value) {
            addCriterion("TOH.MBR_ID >", value, "mbrId");
            return (Criteria) this;
        }

        public Criteria andMbrIdGreaterThanOrEqualTo(String value) {
            addCriterion("TOH.MBR_ID >=", value, "mbrId");
            return (Criteria) this;
        }

        public Criteria andMbrIdLessThan(String value) {
            addCriterion("TOH.MBR_ID <", value, "mbrId");
            return (Criteria) this;
        }

        public Criteria andMbrIdLessThanOrEqualTo(String value) {
            addCriterion("TOH.MBR_ID <=", value, "mbrId");
            return (Criteria) this;
        }

        public Criteria andMbrIdLike(String value) {
            addCriterion("TOH.MBR_ID like", value, "mbrId");
            return (Criteria) this;
        }

        public Criteria andMbrIdNotLike(String value) {
            addCriterion("TOH.MBR_ID not like", value, "mbrId");
            return (Criteria) this;
        }

        public Criteria andMbrIdIn(List<String> values) {
            addCriterion("TOH.MBR_ID in", values, "mbrId");
            return (Criteria) this;
        }

        public Criteria andMbrIdNotIn(List<String> values) {
            addCriterion("TOH.MBR_ID not in", values, "mbrId");
            return (Criteria) this;
        }

        public Criteria andMbrIdBetween(String value1, String value2) {
            addCriterion("TOH.MBR_ID between", value1, value2, "mbrId");
            return (Criteria) this;
        }

        public Criteria andMbrIdNotBetween(String value1, String value2) {
            addCriterion("TOH.MBR_ID not between", value1, value2, "mbrId");
            return (Criteria) this;
        }

        public Criteria andAdmIdIsNull() {
            addCriterion("TOH.ADM_ID is null");
            return (Criteria) this;
        }

        public Criteria andAdmIdIsNotNull() {
            addCriterion("TOH.ADM_ID is not null");
            return (Criteria) this;
        }

        public Criteria andAdmIdEqualTo(String value) {
            addCriterion("TOH.ADM_ID =", value, "admId");
            return (Criteria) this;
        }

        public Criteria andAdmIdNotEqualTo(String value) {
            addCriterion("TOH.ADM_ID <>", value, "admId");
            return (Criteria) this;
        }

        public Criteria andAdmIdGreaterThan(String value) {
            addCriterion("TOH.ADM_ID >", value, "admId");
            return (Criteria) this;
        }

        public Criteria andAdmIdGreaterThanOrEqualTo(String value) {
            addCriterion("TOH.ADM_ID >=", value, "admId");
            return (Criteria) this;
        }

        public Criteria andAdmIdLessThan(String value) {
            addCriterion("TOH.ADM_ID <", value, "admId");
            return (Criteria) this;
        }

        public Criteria andAdmIdLessThanOrEqualTo(String value) {
            addCriterion("TOH.ADM_ID <=", value, "admId");
            return (Criteria) this;
        }

        public Criteria andAdmIdLike(String value) {
            addCriterion("TOH.ADM_ID like", value, "admId");
            return (Criteria) this;
        }

        public Criteria andAdmIdNotLike(String value) {
            addCriterion("TOH.ADM_ID not like", value, "admId");
            return (Criteria) this;
        }

        public Criteria andAdmIdIn(List<String> values) {
            addCriterion("TOH.ADM_ID in", values, "admId");
            return (Criteria) this;
        }

        public Criteria andAdmIdNotIn(List<String> values) {
            addCriterion("TOH.ADM_ID not in", values, "admId");
            return (Criteria) this;
        }

        public Criteria andAdmIdBetween(String value1, String value2) {
            addCriterion("TOH.ADM_ID between", value1, value2, "admId");
            return (Criteria) this;
        }

        public Criteria andAdmIdNotBetween(String value1, String value2) {
            addCriterion("TOH.ADM_ID not between", value1, value2, "admId");
            return (Criteria) this;
        }

        public Criteria andOrdHistTpCdIsNull() {
            addCriterion("TOH.ORD_HIST_TP_CD is null");
            return (Criteria) this;
        }

        public Criteria andOrdHistTpCdIsNotNull() {
            addCriterion("TOH.ORD_HIST_TP_CD is not null");
            return (Criteria) this;
        }

        public Criteria andOrdHistTpCdEqualTo(String value) {
            addCriterion("TOH.ORD_HIST_TP_CD =", value, "ordHistTpCd");
            return (Criteria) this;
        }

        public Criteria andOrdHistTpCdNotEqualTo(String value) {
            addCriterion("TOH.ORD_HIST_TP_CD <>", value, "ordHistTpCd");
            return (Criteria) this;
        }

        public Criteria andOrdHistTpCdGreaterThan(String value) {
            addCriterion("TOH.ORD_HIST_TP_CD >", value, "ordHistTpCd");
            return (Criteria) this;
        }

        public Criteria andOrdHistTpCdGreaterThanOrEqualTo(String value) {
            addCriterion("TOH.ORD_HIST_TP_CD >=", value, "ordHistTpCd");
            return (Criteria) this;
        }

        public Criteria andOrdHistTpCdLessThan(String value) {
            addCriterion("TOH.ORD_HIST_TP_CD <", value, "ordHistTpCd");
            return (Criteria) this;
        }

        public Criteria andOrdHistTpCdLessThanOrEqualTo(String value) {
            addCriterion("TOH.ORD_HIST_TP_CD <=", value, "ordHistTpCd");
            return (Criteria) this;
        }

        public Criteria andOrdHistTpCdLike(String value) {
            addCriterion("TOH.ORD_HIST_TP_CD like", value, "ordHistTpCd");
            return (Criteria) this;
        }

        public Criteria andOrdHistTpCdNotLike(String value) {
            addCriterion("TOH.ORD_HIST_TP_CD not like", value, "ordHistTpCd");
            return (Criteria) this;
        }

        public Criteria andOrdHistTpCdIn(List<String> values) {
            addCriterion("TOH.ORD_HIST_TP_CD in", values, "ordHistTpCd");
            return (Criteria) this;
        }

        public Criteria andOrdHistTpCdNotIn(List<String> values) {
            addCriterion("TOH.ORD_HIST_TP_CD not in", values, "ordHistTpCd");
            return (Criteria) this;
        }

        public Criteria andOrdHistTpCdBetween(String value1, String value2) {
            addCriterion("TOH.ORD_HIST_TP_CD between", value1, value2, "ordHistTpCd");
            return (Criteria) this;
        }

        public Criteria andOrdHistTpCdNotBetween(String value1, String value2) {
            addCriterion("TOH.ORD_HIST_TP_CD not between", value1, value2, "ordHistTpCd");
            return (Criteria) this;
        }

        public Criteria andOrdHistCdIsNull() {
            addCriterion("TOH.ORD_HIST_CD is null");
            return (Criteria) this;
        }

        public Criteria andOrdHistCdIsNotNull() {
            addCriterion("TOH.ORD_HIST_CD is not null");
            return (Criteria) this;
        }

        public Criteria andOrdHistCdEqualTo(String value) {
            addCriterion("TOH.ORD_HIST_CD =", value, "ordHistCd");
            return (Criteria) this;
        }

        public Criteria andOrdHistCdNotEqualTo(String value) {
            addCriterion("TOH.ORD_HIST_CD <>", value, "ordHistCd");
            return (Criteria) this;
        }

        public Criteria andOrdHistCdGreaterThan(String value) {
            addCriterion("TOH.ORD_HIST_CD >", value, "ordHistCd");
            return (Criteria) this;
        }

        public Criteria andOrdHistCdGreaterThanOrEqualTo(String value) {
            addCriterion("TOH.ORD_HIST_CD >=", value, "ordHistCd");
            return (Criteria) this;
        }

        public Criteria andOrdHistCdLessThan(String value) {
            addCriterion("TOH.ORD_HIST_CD <", value, "ordHistCd");
            return (Criteria) this;
        }

        public Criteria andOrdHistCdLessThanOrEqualTo(String value) {
            addCriterion("TOH.ORD_HIST_CD <=", value, "ordHistCd");
            return (Criteria) this;
        }

        public Criteria andOrdHistCdLike(String value) {
            addCriterion("TOH.ORD_HIST_CD like", value, "ordHistCd");
            return (Criteria) this;
        }

        public Criteria andOrdHistCdNotLike(String value) {
            addCriterion("TOH.ORD_HIST_CD not like", value, "ordHistCd");
            return (Criteria) this;
        }

        public Criteria andOrdHistCdIn(List<String> values) {
            addCriterion("TOH.ORD_HIST_CD in", values, "ordHistCd");
            return (Criteria) this;
        }

        public Criteria andOrdHistCdNotIn(List<String> values) {
            addCriterion("TOH.ORD_HIST_CD not in", values, "ordHistCd");
            return (Criteria) this;
        }

        public Criteria andOrdHistCdBetween(String value1, String value2) {
            addCriterion("TOH.ORD_HIST_CD between", value1, value2, "ordHistCd");
            return (Criteria) this;
        }

        public Criteria andOrdHistCdNotBetween(String value1, String value2) {
            addCriterion("TOH.ORD_HIST_CD not between", value1, value2, "ordHistCd");
            return (Criteria) this;
        }

        public Criteria andOrdHistDtIsNull() {
            addCriterion("TOH.ORD_HIST_DT is null");
            return (Criteria) this;
        }

        public Criteria andOrdHistDtIsNotNull() {
            addCriterion("TOH.ORD_HIST_DT is not null");
            return (Criteria) this;
        }

        public Criteria andOrdHistDtEqualTo(Date value) {
            addCriterionForJDBCDate("TOH.ORD_HIST_DT =", value, "ordHistDt");
            return (Criteria) this;
        }

        public Criteria andOrdHistDtNotEqualTo(Date value) {
            addCriterionForJDBCDate("TOH.ORD_HIST_DT <>", value, "ordHistDt");
            return (Criteria) this;
        }

        public Criteria andOrdHistDtGreaterThan(Date value) {
            addCriterionForJDBCDate("TOH.ORD_HIST_DT >", value, "ordHistDt");
            return (Criteria) this;
        }

        public Criteria andOrdHistDtGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("TOH.ORD_HIST_DT >=", value, "ordHistDt");
            return (Criteria) this;
        }

        public Criteria andOrdHistDtLessThan(Date value) {
            addCriterionForJDBCDate("TOH.ORD_HIST_DT <", value, "ordHistDt");
            return (Criteria) this;
        }

        public Criteria andOrdHistDtLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("TOH.ORD_HIST_DT <=", value, "ordHistDt");
            return (Criteria) this;
        }

        public Criteria andOrdHistDtIn(List<Date> values) {
            addCriterionForJDBCDate("TOH.ORD_HIST_DT in", values, "ordHistDt");
            return (Criteria) this;
        }

        public Criteria andOrdHistDtNotIn(List<Date> values) {
            addCriterionForJDBCDate("TOH.ORD_HIST_DT not in", values, "ordHistDt");
            return (Criteria) this;
        }

        public Criteria andOrdHistDtBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("TOH.ORD_HIST_DT between", value1, value2, "ordHistDt");
            return (Criteria) this;
        }

        public Criteria andOrdHistDtNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("TOH.ORD_HIST_DT not between", value1, value2, "ordHistDt");
            return (Criteria) this;
        }

        public Criteria andOrdHistIpIsNull() {
            addCriterion("TOH.ORD_HIST_IP is null");
            return (Criteria) this;
        }

        public Criteria andOrdHistIpIsNotNull() {
            addCriterion("TOH.ORD_HIST_IP is not null");
            return (Criteria) this;
        }

        public Criteria andOrdHistIpEqualTo(String value) {
            addCriterion("TOH.ORD_HIST_IP =", value, "ordHistIp");
            return (Criteria) this;
        }

        public Criteria andOrdHistIpNotEqualTo(String value) {
            addCriterion("TOH.ORD_HIST_IP <>", value, "ordHistIp");
            return (Criteria) this;
        }

        public Criteria andOrdHistIpGreaterThan(String value) {
            addCriterion("TOH.ORD_HIST_IP >", value, "ordHistIp");
            return (Criteria) this;
        }

        public Criteria andOrdHistIpGreaterThanOrEqualTo(String value) {
            addCriterion("TOH.ORD_HIST_IP >=", value, "ordHistIp");
            return (Criteria) this;
        }

        public Criteria andOrdHistIpLessThan(String value) {
            addCriterion("TOH.ORD_HIST_IP <", value, "ordHistIp");
            return (Criteria) this;
        }

        public Criteria andOrdHistIpLessThanOrEqualTo(String value) {
            addCriterion("TOH.ORD_HIST_IP <=", value, "ordHistIp");
            return (Criteria) this;
        }

        public Criteria andOrdHistIpLike(String value) {
            addCriterion("TOH.ORD_HIST_IP like", value, "ordHistIp");
            return (Criteria) this;
        }

        public Criteria andOrdHistIpNotLike(String value) {
            addCriterion("TOH.ORD_HIST_IP not like", value, "ordHistIp");
            return (Criteria) this;
        }

        public Criteria andOrdHistIpIn(List<String> values) {
            addCriterion("TOH.ORD_HIST_IP in", values, "ordHistIp");
            return (Criteria) this;
        }

        public Criteria andOrdHistIpNotIn(List<String> values) {
            addCriterion("TOH.ORD_HIST_IP not in", values, "ordHistIp");
            return (Criteria) this;
        }

        public Criteria andOrdHistIpBetween(String value1, String value2) {
            addCriterion("TOH.ORD_HIST_IP between", value1, value2, "ordHistIp");
            return (Criteria) this;
        }

        public Criteria andOrdHistIpNotBetween(String value1, String value2) {
            addCriterion("TOH.ORD_HIST_IP not between", value1, value2, "ordHistIp");
            return (Criteria) this;
        }

        public Criteria andContIsNull() {
            addCriterion("TOH.CONT is null");
            return (Criteria) this;
        }

        public Criteria andContIsNotNull() {
            addCriterion("TOH.CONT is not null");
            return (Criteria) this;
        }

        public Criteria andContEqualTo(String value) {
            addCriterion("TOH.CONT =", value, "cont");
            return (Criteria) this;
        }

        public Criteria andContNotEqualTo(String value) {
            addCriterion("TOH.CONT <>", value, "cont");
            return (Criteria) this;
        }

        public Criteria andContGreaterThan(String value) {
            addCriterion("TOH.CONT >", value, "cont");
            return (Criteria) this;
        }

        public Criteria andContGreaterThanOrEqualTo(String value) {
            addCriterion("TOH.CONT >=", value, "cont");
            return (Criteria) this;
        }

        public Criteria andContLessThan(String value) {
            addCriterion("TOH.CONT <", value, "cont");
            return (Criteria) this;
        }

        public Criteria andContLessThanOrEqualTo(String value) {
            addCriterion("TOH.CONT <=", value, "cont");
            return (Criteria) this;
        }

        public Criteria andContLike(String value) {
            addCriterion("TOH.CONT like", value, "cont");
            return (Criteria) this;
        }

        public Criteria andContNotLike(String value) {
            addCriterion("TOH.CONT not like", value, "cont");
            return (Criteria) this;
        }

        public Criteria andContIn(List<String> values) {
            addCriterion("TOH.CONT in", values, "cont");
            return (Criteria) this;
        }

        public Criteria andContNotIn(List<String> values) {
            addCriterion("TOH.CONT not in", values, "cont");
            return (Criteria) this;
        }

        public Criteria andContBetween(String value1, String value2) {
            addCriterion("TOH.CONT between", value1, value2, "cont");
            return (Criteria) this;
        }

        public Criteria andContNotBetween(String value1, String value2) {
            addCriterion("TOH.CONT not between", value1, value2, "cont");
            return (Criteria) this;
        }

        public Criteria andRegDtIsNull() {
            addCriterion("TOH.REG_DT is null");
            return (Criteria) this;
        }

        public Criteria andRegDtIsNotNull() {
            addCriterion("TOH.REG_DT is not null");
            return (Criteria) this;
        }

        public Criteria andRegDtEqualTo(Date value) {
            addCriterion("TOH.REG_DT =", value, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtNotEqualTo(Date value) {
            addCriterion("TOH.REG_DT <>", value, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtGreaterThan(Date value) {
            addCriterion("TOH.REG_DT >", value, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtGreaterThanOrEqualTo(Date value) {
            addCriterion("TOH.REG_DT >=", value, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtLessThan(Date value) {
            addCriterion("TOH.REG_DT <", value, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtLessThanOrEqualTo(Date value) {
            addCriterion("TOH.REG_DT <=", value, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtIn(List<Date> values) {
            addCriterion("TOH.REG_DT in", values, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtNotIn(List<Date> values) {
            addCriterion("TOH.REG_DT not in", values, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtBetween(Date value1, Date value2) {
            addCriterion("TOH.REG_DT between", value1, value2, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtNotBetween(Date value1, Date value2) {
            addCriterion("TOH.REG_DT not between", value1, value2, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegIdIsNull() {
            addCriterion("TOH.REG_ID is null");
            return (Criteria) this;
        }

        public Criteria andRegIdIsNotNull() {
            addCriterion("TOH.REG_ID is not null");
            return (Criteria) this;
        }

        public Criteria andRegIdEqualTo(String value) {
            addCriterion("TOH.REG_ID =", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdNotEqualTo(String value) {
            addCriterion("TOH.REG_ID <>", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdGreaterThan(String value) {
            addCriterion("TOH.REG_ID >", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdGreaterThanOrEqualTo(String value) {
            addCriterion("TOH.REG_ID >=", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdLessThan(String value) {
            addCriterion("TOH.REG_ID <", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdLessThanOrEqualTo(String value) {
            addCriterion("TOH.REG_ID <=", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdLike(String value) {
            addCriterion("TOH.REG_ID like", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdNotLike(String value) {
            addCriterion("TOH.REG_ID not like", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdIn(List<String> values) {
            addCriterion("TOH.REG_ID in", values, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdNotIn(List<String> values) {
            addCriterion("TOH.REG_ID not in", values, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdBetween(String value1, String value2) {
            addCriterion("TOH.REG_ID between", value1, value2, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdNotBetween(String value1, String value2) {
            addCriterion("TOH.REG_ID not between", value1, value2, "regId");
            return (Criteria) this;
        }

        public Criteria andMbrIdLikeInsensitive(String value) {
            addCriterion("upper(TOH.MBR_ID) like", value.toUpperCase(), "mbrId");
            return (Criteria) this;
        }

        public Criteria andAdmIdLikeInsensitive(String value) {
            addCriterion("upper(TOH.ADM_ID) like", value.toUpperCase(), "admId");
            return (Criteria) this;
        }

        public Criteria andOrdHistTpCdLikeInsensitive(String value) {
            addCriterion("upper(TOH.ORD_HIST_TP_CD) like", value.toUpperCase(), "ordHistTpCd");
            return (Criteria) this;
        }

        public Criteria andOrdHistCdLikeInsensitive(String value) {
            addCriterion("upper(TOH.ORD_HIST_CD) like", value.toUpperCase(), "ordHistCd");
            return (Criteria) this;
        }

        public Criteria andOrdHistIpLikeInsensitive(String value) {
            addCriterion("upper(TOH.ORD_HIST_IP) like", value.toUpperCase(), "ordHistIp");
            return (Criteria) this;
        }

        public Criteria andContLikeInsensitive(String value) {
            addCriterion("upper(TOH.CONT) like", value.toUpperCase(), "cont");
            return (Criteria) this;
        }

        public Criteria andRegIdLikeInsensitive(String value) {
            addCriterion("upper(TOH.REG_ID) like", value.toUpperCase(), "regId");
            return (Criteria) this;
        }

        public Criteria andMbrIdLikeLeft(String value) {
            addCriterion("TOH.MBR_ID like ", "%" + value, "mbrId");
            return (Criteria) this;
        }

        public Criteria andMbrIdLikeRight(String value) {
            addCriterion("TOH.MBR_ID like ", value + "%", "mbrId");
            return (Criteria) this;
        }

        public Criteria andMbrIdLikeBoth(String value) {
            addCriterion("TOH.MBR_ID like ", "%" + value + "%", "mbrId");
            return (Criteria) this;
        }

        public Criteria andAdmIdLikeLeft(String value) {
            addCriterion("TOH.ADM_ID like ", "%" + value, "admId");
            return (Criteria) this;
        }

        public Criteria andAdmIdLikeRight(String value) {
            addCriterion("TOH.ADM_ID like ", value + "%", "admId");
            return (Criteria) this;
        }

        public Criteria andAdmIdLikeBoth(String value) {
            addCriterion("TOH.ADM_ID like ", "%" + value + "%", "admId");
            return (Criteria) this;
        }

        public Criteria andOrdHistTpCdLikeLeft(String value) {
            addCriterion("TOH.ORD_HIST_TP_CD like ", "%" + value, "ordHistTpCd");
            return (Criteria) this;
        }

        public Criteria andOrdHistTpCdLikeRight(String value) {
            addCriterion("TOH.ORD_HIST_TP_CD like ", value + "%", "ordHistTpCd");
            return (Criteria) this;
        }

        public Criteria andOrdHistTpCdLikeBoth(String value) {
            addCriterion("TOH.ORD_HIST_TP_CD like ", "%" + value + "%", "ordHistTpCd");
            return (Criteria) this;
        }

        public Criteria andOrdHistCdLikeLeft(String value) {
            addCriterion("TOH.ORD_HIST_CD like ", "%" + value, "ordHistCd");
            return (Criteria) this;
        }

        public Criteria andOrdHistCdLikeRight(String value) {
            addCriterion("TOH.ORD_HIST_CD like ", value + "%", "ordHistCd");
            return (Criteria) this;
        }

        public Criteria andOrdHistCdLikeBoth(String value) {
            addCriterion("TOH.ORD_HIST_CD like ", "%" + value + "%", "ordHistCd");
            return (Criteria) this;
        }

        public Criteria andOrdHistIpLikeLeft(String value) {
            addCriterion("TOH.ORD_HIST_IP like ", "%" + value, "ordHistIp");
            return (Criteria) this;
        }

        public Criteria andOrdHistIpLikeRight(String value) {
            addCriterion("TOH.ORD_HIST_IP like ", value + "%", "ordHistIp");
            return (Criteria) this;
        }

        public Criteria andOrdHistIpLikeBoth(String value) {
            addCriterion("TOH.ORD_HIST_IP like ", "%" + value + "%", "ordHistIp");
            return (Criteria) this;
        }

        public Criteria andContLikeLeft(String value) {
            addCriterion("TOH.CONT like ", "%" + value, "cont");
            return (Criteria) this;
        }

        public Criteria andContLikeRight(String value) {
            addCriterion("TOH.CONT like ", value + "%", "cont");
            return (Criteria) this;
        }

        public Criteria andContLikeBoth(String value) {
            addCriterion("TOH.CONT like ", "%" + value + "%", "cont");
            return (Criteria) this;
        }

        public Criteria andRegIdLikeLeft(String value) {
            addCriterion("TOH.REG_ID like ", "%" + value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdLikeRight(String value) {
            addCriterion("TOH.REG_ID like ", value + "%", "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdLikeBoth(String value) {
            addCriterion("TOH.REG_ID like ", "%" + value + "%", "regId");
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