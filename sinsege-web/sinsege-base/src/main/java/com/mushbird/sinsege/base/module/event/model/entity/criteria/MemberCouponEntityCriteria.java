package com.mushbird.sinsege.base.module.event.model.entity.criteria;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class MemberCouponEntityCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    public MemberCouponEntityCriteria() {
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

        public Criteria andMbrCpnIdIsNull() {
            addCriterion("TMC.MBR_CPN_ID is null");
            return (Criteria) this;
        }

        public Criteria andMbrCpnIdIsNotNull() {
            addCriterion("TMC.MBR_CPN_ID is not null");
            return (Criteria) this;
        }

        public Criteria andMbrCpnIdEqualTo(Integer value) {
            addCriterion("TMC.MBR_CPN_ID =", value, "mbrCpnId");
            return (Criteria) this;
        }

        public Criteria andMbrCpnIdNotEqualTo(Integer value) {
            addCriterion("TMC.MBR_CPN_ID <>", value, "mbrCpnId");
            return (Criteria) this;
        }

        public Criteria andMbrCpnIdGreaterThan(Integer value) {
            addCriterion("TMC.MBR_CPN_ID >", value, "mbrCpnId");
            return (Criteria) this;
        }

        public Criteria andMbrCpnIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("TMC.MBR_CPN_ID >=", value, "mbrCpnId");
            return (Criteria) this;
        }

        public Criteria andMbrCpnIdLessThan(Integer value) {
            addCriterion("TMC.MBR_CPN_ID <", value, "mbrCpnId");
            return (Criteria) this;
        }

        public Criteria andMbrCpnIdLessThanOrEqualTo(Integer value) {
            addCriterion("TMC.MBR_CPN_ID <=", value, "mbrCpnId");
            return (Criteria) this;
        }

        public Criteria andMbrCpnIdIn(List<Integer> values) {
            addCriterion("TMC.MBR_CPN_ID in", values, "mbrCpnId");
            return (Criteria) this;
        }

        public Criteria andMbrCpnIdNotIn(List<Integer> values) {
            addCriterion("TMC.MBR_CPN_ID not in", values, "mbrCpnId");
            return (Criteria) this;
        }

        public Criteria andMbrCpnIdBetween(Integer value1, Integer value2) {
            addCriterion("TMC.MBR_CPN_ID between", value1, value2, "mbrCpnId");
            return (Criteria) this;
        }

        public Criteria andMbrCpnIdNotBetween(Integer value1, Integer value2) {
            addCriterion("TMC.MBR_CPN_ID not between", value1, value2, "mbrCpnId");
            return (Criteria) this;
        }

        public Criteria andMbrIdIsNull() {
            addCriterion("TMC.MBR_ID is null");
            return (Criteria) this;
        }

        public Criteria andMbrIdIsNotNull() {
            addCriterion("TMC.MBR_ID is not null");
            return (Criteria) this;
        }

        public Criteria andMbrIdEqualTo(String value) {
            addCriterion("TMC.MBR_ID =", value, "mbrId");
            return (Criteria) this;
        }

        public Criteria andMbrIdNotEqualTo(String value) {
            addCriterion("TMC.MBR_ID <>", value, "mbrId");
            return (Criteria) this;
        }

        public Criteria andMbrIdGreaterThan(String value) {
            addCriterion("TMC.MBR_ID >", value, "mbrId");
            return (Criteria) this;
        }

        public Criteria andMbrIdGreaterThanOrEqualTo(String value) {
            addCriterion("TMC.MBR_ID >=", value, "mbrId");
            return (Criteria) this;
        }

        public Criteria andMbrIdLessThan(String value) {
            addCriterion("TMC.MBR_ID <", value, "mbrId");
            return (Criteria) this;
        }

        public Criteria andMbrIdLessThanOrEqualTo(String value) {
            addCriterion("TMC.MBR_ID <=", value, "mbrId");
            return (Criteria) this;
        }

        public Criteria andMbrIdLike(String value) {
            addCriterion("TMC.MBR_ID like", value, "mbrId");
            return (Criteria) this;
        }

        public Criteria andMbrIdNotLike(String value) {
            addCriterion("TMC.MBR_ID not like", value, "mbrId");
            return (Criteria) this;
        }

        public Criteria andMbrIdIn(List<String> values) {
            addCriterion("TMC.MBR_ID in", values, "mbrId");
            return (Criteria) this;
        }

        public Criteria andMbrIdNotIn(List<String> values) {
            addCriterion("TMC.MBR_ID not in", values, "mbrId");
            return (Criteria) this;
        }

        public Criteria andMbrIdBetween(String value1, String value2) {
            addCriterion("TMC.MBR_ID between", value1, value2, "mbrId");
            return (Criteria) this;
        }

        public Criteria andMbrIdNotBetween(String value1, String value2) {
            addCriterion("TMC.MBR_ID not between", value1, value2, "mbrId");
            return (Criteria) this;
        }

        public Criteria andCpnIdIsNull() {
            addCriterion("TMC.CPN_ID is null");
            return (Criteria) this;
        }

        public Criteria andCpnIdIsNotNull() {
            addCriterion("TMC.CPN_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCpnIdEqualTo(Integer value) {
            addCriterion("TMC.CPN_ID =", value, "cpnId");
            return (Criteria) this;
        }

        public Criteria andCpnIdNotEqualTo(Integer value) {
            addCriterion("TMC.CPN_ID <>", value, "cpnId");
            return (Criteria) this;
        }

        public Criteria andCpnIdGreaterThan(Integer value) {
            addCriterion("TMC.CPN_ID >", value, "cpnId");
            return (Criteria) this;
        }

        public Criteria andCpnIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("TMC.CPN_ID >=", value, "cpnId");
            return (Criteria) this;
        }

        public Criteria andCpnIdLessThan(Integer value) {
            addCriterion("TMC.CPN_ID <", value, "cpnId");
            return (Criteria) this;
        }

        public Criteria andCpnIdLessThanOrEqualTo(Integer value) {
            addCriterion("TMC.CPN_ID <=", value, "cpnId");
            return (Criteria) this;
        }

        public Criteria andCpnIdIn(List<Integer> values) {
            addCriterion("TMC.CPN_ID in", values, "cpnId");
            return (Criteria) this;
        }

        public Criteria andCpnIdNotIn(List<Integer> values) {
            addCriterion("TMC.CPN_ID not in", values, "cpnId");
            return (Criteria) this;
        }

        public Criteria andCpnIdBetween(Integer value1, Integer value2) {
            addCriterion("TMC.CPN_ID between", value1, value2, "cpnId");
            return (Criteria) this;
        }

        public Criteria andCpnIdNotBetween(Integer value1, Integer value2) {
            addCriterion("TMC.CPN_ID not between", value1, value2, "cpnId");
            return (Criteria) this;
        }

        public Criteria andMbrCpnNoIsNull() {
            addCriterion("TMC.MBR_CPN_NO is null");
            return (Criteria) this;
        }

        public Criteria andMbrCpnNoIsNotNull() {
            addCriterion("TMC.MBR_CPN_NO is not null");
            return (Criteria) this;
        }

        public Criteria andMbrCpnNoEqualTo(String value) {
            addCriterion("TMC.MBR_CPN_NO =", value, "mbrCpnNo");
            return (Criteria) this;
        }

        public Criteria andMbrCpnNoNotEqualTo(String value) {
            addCriterion("TMC.MBR_CPN_NO <>", value, "mbrCpnNo");
            return (Criteria) this;
        }

        public Criteria andMbrCpnNoGreaterThan(String value) {
            addCriterion("TMC.MBR_CPN_NO >", value, "mbrCpnNo");
            return (Criteria) this;
        }

        public Criteria andMbrCpnNoGreaterThanOrEqualTo(String value) {
            addCriterion("TMC.MBR_CPN_NO >=", value, "mbrCpnNo");
            return (Criteria) this;
        }

        public Criteria andMbrCpnNoLessThan(String value) {
            addCriterion("TMC.MBR_CPN_NO <", value, "mbrCpnNo");
            return (Criteria) this;
        }

        public Criteria andMbrCpnNoLessThanOrEqualTo(String value) {
            addCriterion("TMC.MBR_CPN_NO <=", value, "mbrCpnNo");
            return (Criteria) this;
        }

        public Criteria andMbrCpnNoLike(String value) {
            addCriterion("TMC.MBR_CPN_NO like", value, "mbrCpnNo");
            return (Criteria) this;
        }

        public Criteria andMbrCpnNoNotLike(String value) {
            addCriterion("TMC.MBR_CPN_NO not like", value, "mbrCpnNo");
            return (Criteria) this;
        }

        public Criteria andMbrCpnNoIn(List<String> values) {
            addCriterion("TMC.MBR_CPN_NO in", values, "mbrCpnNo");
            return (Criteria) this;
        }

        public Criteria andMbrCpnNoNotIn(List<String> values) {
            addCriterion("TMC.MBR_CPN_NO not in", values, "mbrCpnNo");
            return (Criteria) this;
        }

        public Criteria andMbrCpnNoBetween(String value1, String value2) {
            addCriterion("TMC.MBR_CPN_NO between", value1, value2, "mbrCpnNo");
            return (Criteria) this;
        }

        public Criteria andMbrCpnNoNotBetween(String value1, String value2) {
            addCriterion("TMC.MBR_CPN_NO not between", value1, value2, "mbrCpnNo");
            return (Criteria) this;
        }

        public Criteria andCpnIsuMethCdIsNull() {
            addCriterion("TMC.CPN_ISU_METH_CD is null");
            return (Criteria) this;
        }

        public Criteria andCpnIsuMethCdIsNotNull() {
            addCriterion("TMC.CPN_ISU_METH_CD is not null");
            return (Criteria) this;
        }

        public Criteria andCpnIsuMethCdEqualTo(String value) {
            addCriterion("TMC.CPN_ISU_METH_CD =", value, "cpnIsuMethCd");
            return (Criteria) this;
        }

        public Criteria andCpnIsuMethCdNotEqualTo(String value) {
            addCriterion("TMC.CPN_ISU_METH_CD <>", value, "cpnIsuMethCd");
            return (Criteria) this;
        }

        public Criteria andCpnIsuMethCdGreaterThan(String value) {
            addCriterion("TMC.CPN_ISU_METH_CD >", value, "cpnIsuMethCd");
            return (Criteria) this;
        }

        public Criteria andCpnIsuMethCdGreaterThanOrEqualTo(String value) {
            addCriterion("TMC.CPN_ISU_METH_CD >=", value, "cpnIsuMethCd");
            return (Criteria) this;
        }

        public Criteria andCpnIsuMethCdLessThan(String value) {
            addCriterion("TMC.CPN_ISU_METH_CD <", value, "cpnIsuMethCd");
            return (Criteria) this;
        }

        public Criteria andCpnIsuMethCdLessThanOrEqualTo(String value) {
            addCriterion("TMC.CPN_ISU_METH_CD <=", value, "cpnIsuMethCd");
            return (Criteria) this;
        }

        public Criteria andCpnIsuMethCdLike(String value) {
            addCriterion("TMC.CPN_ISU_METH_CD like", value, "cpnIsuMethCd");
            return (Criteria) this;
        }

        public Criteria andCpnIsuMethCdNotLike(String value) {
            addCriterion("TMC.CPN_ISU_METH_CD not like", value, "cpnIsuMethCd");
            return (Criteria) this;
        }

        public Criteria andCpnIsuMethCdIn(List<String> values) {
            addCriterion("TMC.CPN_ISU_METH_CD in", values, "cpnIsuMethCd");
            return (Criteria) this;
        }

        public Criteria andCpnIsuMethCdNotIn(List<String> values) {
            addCriterion("TMC.CPN_ISU_METH_CD not in", values, "cpnIsuMethCd");
            return (Criteria) this;
        }

        public Criteria andCpnIsuMethCdBetween(String value1, String value2) {
            addCriterion("TMC.CPN_ISU_METH_CD between", value1, value2, "cpnIsuMethCd");
            return (Criteria) this;
        }

        public Criteria andCpnIsuMethCdNotBetween(String value1, String value2) {
            addCriterion("TMC.CPN_ISU_METH_CD not between", value1, value2, "cpnIsuMethCd");
            return (Criteria) this;
        }

        public Criteria andCpnIsuRsnContIsNull() {
            addCriterion("TMC.CPN_ISU_RSN_CONT is null");
            return (Criteria) this;
        }

        public Criteria andCpnIsuRsnContIsNotNull() {
            addCriterion("TMC.CPN_ISU_RSN_CONT is not null");
            return (Criteria) this;
        }

        public Criteria andCpnIsuRsnContEqualTo(String value) {
            addCriterion("TMC.CPN_ISU_RSN_CONT =", value, "cpnIsuRsnCont");
            return (Criteria) this;
        }

        public Criteria andCpnIsuRsnContNotEqualTo(String value) {
            addCriterion("TMC.CPN_ISU_RSN_CONT <>", value, "cpnIsuRsnCont");
            return (Criteria) this;
        }

        public Criteria andCpnIsuRsnContGreaterThan(String value) {
            addCriterion("TMC.CPN_ISU_RSN_CONT >", value, "cpnIsuRsnCont");
            return (Criteria) this;
        }

        public Criteria andCpnIsuRsnContGreaterThanOrEqualTo(String value) {
            addCriterion("TMC.CPN_ISU_RSN_CONT >=", value, "cpnIsuRsnCont");
            return (Criteria) this;
        }

        public Criteria andCpnIsuRsnContLessThan(String value) {
            addCriterion("TMC.CPN_ISU_RSN_CONT <", value, "cpnIsuRsnCont");
            return (Criteria) this;
        }

        public Criteria andCpnIsuRsnContLessThanOrEqualTo(String value) {
            addCriterion("TMC.CPN_ISU_RSN_CONT <=", value, "cpnIsuRsnCont");
            return (Criteria) this;
        }

        public Criteria andCpnIsuRsnContLike(String value) {
            addCriterion("TMC.CPN_ISU_RSN_CONT like", value, "cpnIsuRsnCont");
            return (Criteria) this;
        }

        public Criteria andCpnIsuRsnContNotLike(String value) {
            addCriterion("TMC.CPN_ISU_RSN_CONT not like", value, "cpnIsuRsnCont");
            return (Criteria) this;
        }

        public Criteria andCpnIsuRsnContIn(List<String> values) {
            addCriterion("TMC.CPN_ISU_RSN_CONT in", values, "cpnIsuRsnCont");
            return (Criteria) this;
        }

        public Criteria andCpnIsuRsnContNotIn(List<String> values) {
            addCriterion("TMC.CPN_ISU_RSN_CONT not in", values, "cpnIsuRsnCont");
            return (Criteria) this;
        }

        public Criteria andCpnIsuRsnContBetween(String value1, String value2) {
            addCriterion("TMC.CPN_ISU_RSN_CONT between", value1, value2, "cpnIsuRsnCont");
            return (Criteria) this;
        }

        public Criteria andCpnIsuRsnContNotBetween(String value1, String value2) {
            addCriterion("TMC.CPN_ISU_RSN_CONT not between", value1, value2, "cpnIsuRsnCont");
            return (Criteria) this;
        }

        public Criteria andCpnIsuDtIsNull() {
            addCriterion("TMC.CPN_ISU_DT is null");
            return (Criteria) this;
        }

        public Criteria andCpnIsuDtIsNotNull() {
            addCriterion("TMC.CPN_ISU_DT is not null");
            return (Criteria) this;
        }

        public Criteria andCpnIsuDtEqualTo(Date value) {
            addCriterionForJDBCDate("TMC.CPN_ISU_DT =", value, "cpnIsuDt");
            return (Criteria) this;
        }

        public Criteria andCpnIsuDtNotEqualTo(Date value) {
            addCriterionForJDBCDate("TMC.CPN_ISU_DT <>", value, "cpnIsuDt");
            return (Criteria) this;
        }

        public Criteria andCpnIsuDtGreaterThan(Date value) {
            addCriterionForJDBCDate("TMC.CPN_ISU_DT >", value, "cpnIsuDt");
            return (Criteria) this;
        }

        public Criteria andCpnIsuDtGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("TMC.CPN_ISU_DT >=", value, "cpnIsuDt");
            return (Criteria) this;
        }

        public Criteria andCpnIsuDtLessThan(Date value) {
            addCriterionForJDBCDate("TMC.CPN_ISU_DT <", value, "cpnIsuDt");
            return (Criteria) this;
        }

        public Criteria andCpnIsuDtLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("TMC.CPN_ISU_DT <=", value, "cpnIsuDt");
            return (Criteria) this;
        }

        public Criteria andCpnIsuDtIn(List<Date> values) {
            addCriterionForJDBCDate("TMC.CPN_ISU_DT in", values, "cpnIsuDt");
            return (Criteria) this;
        }

        public Criteria andCpnIsuDtNotIn(List<Date> values) {
            addCriterionForJDBCDate("TMC.CPN_ISU_DT not in", values, "cpnIsuDt");
            return (Criteria) this;
        }

        public Criteria andCpnIsuDtBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("TMC.CPN_ISU_DT between", value1, value2, "cpnIsuDt");
            return (Criteria) this;
        }

        public Criteria andCpnIsuDtNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("TMC.CPN_ISU_DT not between", value1, value2, "cpnIsuDt");
            return (Criteria) this;
        }

        public Criteria andCpnUseVldStDtIsNull() {
            addCriterion("TMC.CPN_USE_VLD_ST_DT is null");
            return (Criteria) this;
        }

        public Criteria andCpnUseVldStDtIsNotNull() {
            addCriterion("TMC.CPN_USE_VLD_ST_DT is not null");
            return (Criteria) this;
        }

        public Criteria andCpnUseVldStDtEqualTo(Date value) {
            addCriterionForJDBCDate("TMC.CPN_USE_VLD_ST_DT =", value, "cpnUseVldStDt");
            return (Criteria) this;
        }

        public Criteria andCpnUseVldStDtNotEqualTo(Date value) {
            addCriterionForJDBCDate("TMC.CPN_USE_VLD_ST_DT <>", value, "cpnUseVldStDt");
            return (Criteria) this;
        }

        public Criteria andCpnUseVldStDtGreaterThan(Date value) {
            addCriterionForJDBCDate("TMC.CPN_USE_VLD_ST_DT >", value, "cpnUseVldStDt");
            return (Criteria) this;
        }

        public Criteria andCpnUseVldStDtGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("TMC.CPN_USE_VLD_ST_DT >=", value, "cpnUseVldStDt");
            return (Criteria) this;
        }

        public Criteria andCpnUseVldStDtLessThan(Date value) {
            addCriterionForJDBCDate("TMC.CPN_USE_VLD_ST_DT <", value, "cpnUseVldStDt");
            return (Criteria) this;
        }

        public Criteria andCpnUseVldStDtLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("TMC.CPN_USE_VLD_ST_DT <=", value, "cpnUseVldStDt");
            return (Criteria) this;
        }

        public Criteria andCpnUseVldStDtIn(List<Date> values) {
            addCriterionForJDBCDate("TMC.CPN_USE_VLD_ST_DT in", values, "cpnUseVldStDt");
            return (Criteria) this;
        }

        public Criteria andCpnUseVldStDtNotIn(List<Date> values) {
            addCriterionForJDBCDate("TMC.CPN_USE_VLD_ST_DT not in", values, "cpnUseVldStDt");
            return (Criteria) this;
        }

        public Criteria andCpnUseVldStDtBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("TMC.CPN_USE_VLD_ST_DT between", value1, value2, "cpnUseVldStDt");
            return (Criteria) this;
        }

        public Criteria andCpnUseVldStDtNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("TMC.CPN_USE_VLD_ST_DT not between", value1, value2, "cpnUseVldStDt");
            return (Criteria) this;
        }

        public Criteria andCpnUseVldEdDtIsNull() {
            addCriterion("TMC.CPN_USE_VLD_ED_DT is null");
            return (Criteria) this;
        }

        public Criteria andCpnUseVldEdDtIsNotNull() {
            addCriterion("TMC.CPN_USE_VLD_ED_DT is not null");
            return (Criteria) this;
        }

        public Criteria andCpnUseVldEdDtEqualTo(Date value) {
            addCriterionForJDBCDate("TMC.CPN_USE_VLD_ED_DT =", value, "cpnUseVldEdDt");
            return (Criteria) this;
        }

        public Criteria andCpnUseVldEdDtNotEqualTo(Date value) {
            addCriterionForJDBCDate("TMC.CPN_USE_VLD_ED_DT <>", value, "cpnUseVldEdDt");
            return (Criteria) this;
        }

        public Criteria andCpnUseVldEdDtGreaterThan(Date value) {
            addCriterionForJDBCDate("TMC.CPN_USE_VLD_ED_DT >", value, "cpnUseVldEdDt");
            return (Criteria) this;
        }

        public Criteria andCpnUseVldEdDtGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("TMC.CPN_USE_VLD_ED_DT >=", value, "cpnUseVldEdDt");
            return (Criteria) this;
        }

        public Criteria andCpnUseVldEdDtLessThan(Date value) {
            addCriterionForJDBCDate("TMC.CPN_USE_VLD_ED_DT <", value, "cpnUseVldEdDt");
            return (Criteria) this;
        }

        public Criteria andCpnUseVldEdDtLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("TMC.CPN_USE_VLD_ED_DT <=", value, "cpnUseVldEdDt");
            return (Criteria) this;
        }

        public Criteria andCpnUseVldEdDtIn(List<Date> values) {
            addCriterionForJDBCDate("TMC.CPN_USE_VLD_ED_DT in", values, "cpnUseVldEdDt");
            return (Criteria) this;
        }

        public Criteria andCpnUseVldEdDtNotIn(List<Date> values) {
            addCriterionForJDBCDate("TMC.CPN_USE_VLD_ED_DT not in", values, "cpnUseVldEdDt");
            return (Criteria) this;
        }

        public Criteria andCpnUseVldEdDtBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("TMC.CPN_USE_VLD_ED_DT between", value1, value2, "cpnUseVldEdDt");
            return (Criteria) this;
        }

        public Criteria andCpnUseVldEdDtNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("TMC.CPN_USE_VLD_ED_DT not between", value1, value2, "cpnUseVldEdDt");
            return (Criteria) this;
        }

        public Criteria andCpnUseYnIsNull() {
            addCriterion("TMC.CPN_USE_YN is null");
            return (Criteria) this;
        }

        public Criteria andCpnUseYnIsNotNull() {
            addCriterion("TMC.CPN_USE_YN is not null");
            return (Criteria) this;
        }

        public Criteria andCpnUseYnEqualTo(String value) {
            addCriterion("TMC.CPN_USE_YN =", value, "cpnUseYn");
            return (Criteria) this;
        }

        public Criteria andCpnUseYnNotEqualTo(String value) {
            addCriterion("TMC.CPN_USE_YN <>", value, "cpnUseYn");
            return (Criteria) this;
        }

        public Criteria andCpnUseYnGreaterThan(String value) {
            addCriterion("TMC.CPN_USE_YN >", value, "cpnUseYn");
            return (Criteria) this;
        }

        public Criteria andCpnUseYnGreaterThanOrEqualTo(String value) {
            addCriterion("TMC.CPN_USE_YN >=", value, "cpnUseYn");
            return (Criteria) this;
        }

        public Criteria andCpnUseYnLessThan(String value) {
            addCriterion("TMC.CPN_USE_YN <", value, "cpnUseYn");
            return (Criteria) this;
        }

        public Criteria andCpnUseYnLessThanOrEqualTo(String value) {
            addCriterion("TMC.CPN_USE_YN <=", value, "cpnUseYn");
            return (Criteria) this;
        }

        public Criteria andCpnUseYnLike(String value) {
            addCriterion("TMC.CPN_USE_YN like", value, "cpnUseYn");
            return (Criteria) this;
        }

        public Criteria andCpnUseYnNotLike(String value) {
            addCriterion("TMC.CPN_USE_YN not like", value, "cpnUseYn");
            return (Criteria) this;
        }

        public Criteria andCpnUseYnIn(List<String> values) {
            addCriterion("TMC.CPN_USE_YN in", values, "cpnUseYn");
            return (Criteria) this;
        }

        public Criteria andCpnUseYnNotIn(List<String> values) {
            addCriterion("TMC.CPN_USE_YN not in", values, "cpnUseYn");
            return (Criteria) this;
        }

        public Criteria andCpnUseYnBetween(String value1, String value2) {
            addCriterion("TMC.CPN_USE_YN between", value1, value2, "cpnUseYn");
            return (Criteria) this;
        }

        public Criteria andCpnUseYnNotBetween(String value1, String value2) {
            addCriterion("TMC.CPN_USE_YN not between", value1, value2, "cpnUseYn");
            return (Criteria) this;
        }

        public Criteria andCpnUseDtIsNull() {
            addCriterion("TMC.CPN_USE_DT is null");
            return (Criteria) this;
        }

        public Criteria andCpnUseDtIsNotNull() {
            addCriterion("TMC.CPN_USE_DT is not null");
            return (Criteria) this;
        }

        public Criteria andCpnUseDtEqualTo(Date value) {
            addCriterionForJDBCDate("TMC.CPN_USE_DT =", value, "cpnUseDt");
            return (Criteria) this;
        }

        public Criteria andCpnUseDtNotEqualTo(Date value) {
            addCriterionForJDBCDate("TMC.CPN_USE_DT <>", value, "cpnUseDt");
            return (Criteria) this;
        }

        public Criteria andCpnUseDtGreaterThan(Date value) {
            addCriterionForJDBCDate("TMC.CPN_USE_DT >", value, "cpnUseDt");
            return (Criteria) this;
        }

        public Criteria andCpnUseDtGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("TMC.CPN_USE_DT >=", value, "cpnUseDt");
            return (Criteria) this;
        }

        public Criteria andCpnUseDtLessThan(Date value) {
            addCriterionForJDBCDate("TMC.CPN_USE_DT <", value, "cpnUseDt");
            return (Criteria) this;
        }

        public Criteria andCpnUseDtLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("TMC.CPN_USE_DT <=", value, "cpnUseDt");
            return (Criteria) this;
        }

        public Criteria andCpnUseDtIn(List<Date> values) {
            addCriterionForJDBCDate("TMC.CPN_USE_DT in", values, "cpnUseDt");
            return (Criteria) this;
        }

        public Criteria andCpnUseDtNotIn(List<Date> values) {
            addCriterionForJDBCDate("TMC.CPN_USE_DT not in", values, "cpnUseDt");
            return (Criteria) this;
        }

        public Criteria andCpnUseDtBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("TMC.CPN_USE_DT between", value1, value2, "cpnUseDt");
            return (Criteria) this;
        }

        public Criteria andCpnUseDtNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("TMC.CPN_USE_DT not between", value1, value2, "cpnUseDt");
            return (Criteria) this;
        }

        public Criteria andRegDtIsNull() {
            addCriterion("TMC.REG_DT is null");
            return (Criteria) this;
        }

        public Criteria andRegDtIsNotNull() {
            addCriterion("TMC.REG_DT is not null");
            return (Criteria) this;
        }

        public Criteria andRegDtEqualTo(Date value) {
            addCriterion("TMC.REG_DT =", value, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtNotEqualTo(Date value) {
            addCriterion("TMC.REG_DT <>", value, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtGreaterThan(Date value) {
            addCriterion("TMC.REG_DT >", value, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtGreaterThanOrEqualTo(Date value) {
            addCriterion("TMC.REG_DT >=", value, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtLessThan(Date value) {
            addCriterion("TMC.REG_DT <", value, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtLessThanOrEqualTo(Date value) {
            addCriterion("TMC.REG_DT <=", value, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtIn(List<Date> values) {
            addCriterion("TMC.REG_DT in", values, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtNotIn(List<Date> values) {
            addCriterion("TMC.REG_DT not in", values, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtBetween(Date value1, Date value2) {
            addCriterion("TMC.REG_DT between", value1, value2, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtNotBetween(Date value1, Date value2) {
            addCriterion("TMC.REG_DT not between", value1, value2, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegIdIsNull() {
            addCriterion("TMC.REG_ID is null");
            return (Criteria) this;
        }

        public Criteria andRegIdIsNotNull() {
            addCriterion("TMC.REG_ID is not null");
            return (Criteria) this;
        }

        public Criteria andRegIdEqualTo(String value) {
            addCriterion("TMC.REG_ID =", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdNotEqualTo(String value) {
            addCriterion("TMC.REG_ID <>", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdGreaterThan(String value) {
            addCriterion("TMC.REG_ID >", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdGreaterThanOrEqualTo(String value) {
            addCriterion("TMC.REG_ID >=", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdLessThan(String value) {
            addCriterion("TMC.REG_ID <", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdLessThanOrEqualTo(String value) {
            addCriterion("TMC.REG_ID <=", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdLike(String value) {
            addCriterion("TMC.REG_ID like", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdNotLike(String value) {
            addCriterion("TMC.REG_ID not like", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdIn(List<String> values) {
            addCriterion("TMC.REG_ID in", values, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdNotIn(List<String> values) {
            addCriterion("TMC.REG_ID not in", values, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdBetween(String value1, String value2) {
            addCriterion("TMC.REG_ID between", value1, value2, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdNotBetween(String value1, String value2) {
            addCriterion("TMC.REG_ID not between", value1, value2, "regId");
            return (Criteria) this;
        }

        public Criteria andModDtIsNull() {
            addCriterion("TMC.MOD_DT is null");
            return (Criteria) this;
        }

        public Criteria andModDtIsNotNull() {
            addCriterion("TMC.MOD_DT is not null");
            return (Criteria) this;
        }

        public Criteria andModDtEqualTo(Date value) {
            addCriterion("TMC.MOD_DT =", value, "modDt");
            return (Criteria) this;
        }

        public Criteria andModDtNotEqualTo(Date value) {
            addCriterion("TMC.MOD_DT <>", value, "modDt");
            return (Criteria) this;
        }

        public Criteria andModDtGreaterThan(Date value) {
            addCriterion("TMC.MOD_DT >", value, "modDt");
            return (Criteria) this;
        }

        public Criteria andModDtGreaterThanOrEqualTo(Date value) {
            addCriterion("TMC.MOD_DT >=", value, "modDt");
            return (Criteria) this;
        }

        public Criteria andModDtLessThan(Date value) {
            addCriterion("TMC.MOD_DT <", value, "modDt");
            return (Criteria) this;
        }

        public Criteria andModDtLessThanOrEqualTo(Date value) {
            addCriterion("TMC.MOD_DT <=", value, "modDt");
            return (Criteria) this;
        }

        public Criteria andModDtIn(List<Date> values) {
            addCriterion("TMC.MOD_DT in", values, "modDt");
            return (Criteria) this;
        }

        public Criteria andModDtNotIn(List<Date> values) {
            addCriterion("TMC.MOD_DT not in", values, "modDt");
            return (Criteria) this;
        }

        public Criteria andModDtBetween(Date value1, Date value2) {
            addCriterion("TMC.MOD_DT between", value1, value2, "modDt");
            return (Criteria) this;
        }

        public Criteria andModDtNotBetween(Date value1, Date value2) {
            addCriterion("TMC.MOD_DT not between", value1, value2, "modDt");
            return (Criteria) this;
        }

        public Criteria andModIdIsNull() {
            addCriterion("TMC.MOD_ID is null");
            return (Criteria) this;
        }

        public Criteria andModIdIsNotNull() {
            addCriterion("TMC.MOD_ID is not null");
            return (Criteria) this;
        }

        public Criteria andModIdEqualTo(String value) {
            addCriterion("TMC.MOD_ID =", value, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdNotEqualTo(String value) {
            addCriterion("TMC.MOD_ID <>", value, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdGreaterThan(String value) {
            addCriterion("TMC.MOD_ID >", value, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdGreaterThanOrEqualTo(String value) {
            addCriterion("TMC.MOD_ID >=", value, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdLessThan(String value) {
            addCriterion("TMC.MOD_ID <", value, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdLessThanOrEqualTo(String value) {
            addCriterion("TMC.MOD_ID <=", value, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdLike(String value) {
            addCriterion("TMC.MOD_ID like", value, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdNotLike(String value) {
            addCriterion("TMC.MOD_ID not like", value, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdIn(List<String> values) {
            addCriterion("TMC.MOD_ID in", values, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdNotIn(List<String> values) {
            addCriterion("TMC.MOD_ID not in", values, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdBetween(String value1, String value2) {
            addCriterion("TMC.MOD_ID between", value1, value2, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdNotBetween(String value1, String value2) {
            addCriterion("TMC.MOD_ID not between", value1, value2, "modId");
            return (Criteria) this;
        }

        public Criteria andUseYnIsNull() {
            addCriterion("TMC.USE_YN is null");
            return (Criteria) this;
        }

        public Criteria andUseYnIsNotNull() {
            addCriterion("TMC.USE_YN is not null");
            return (Criteria) this;
        }

        public Criteria andUseYnEqualTo(String value) {
            addCriterion("TMC.USE_YN =", value, "useYn");
            return (Criteria) this;
        }

        public Criteria andUseYnNotEqualTo(String value) {
            addCriterion("TMC.USE_YN <>", value, "useYn");
            return (Criteria) this;
        }

        public Criteria andUseYnGreaterThan(String value) {
            addCriterion("TMC.USE_YN >", value, "useYn");
            return (Criteria) this;
        }

        public Criteria andUseYnGreaterThanOrEqualTo(String value) {
            addCriterion("TMC.USE_YN >=", value, "useYn");
            return (Criteria) this;
        }

        public Criteria andUseYnLessThan(String value) {
            addCriterion("TMC.USE_YN <", value, "useYn");
            return (Criteria) this;
        }

        public Criteria andUseYnLessThanOrEqualTo(String value) {
            addCriterion("TMC.USE_YN <=", value, "useYn");
            return (Criteria) this;
        }

        public Criteria andUseYnLike(String value) {
            addCriterion("TMC.USE_YN like", value, "useYn");
            return (Criteria) this;
        }

        public Criteria andUseYnNotLike(String value) {
            addCriterion("TMC.USE_YN not like", value, "useYn");
            return (Criteria) this;
        }

        public Criteria andUseYnIn(List<String> values) {
            addCriterion("TMC.USE_YN in", values, "useYn");
            return (Criteria) this;
        }

        public Criteria andUseYnNotIn(List<String> values) {
            addCriterion("TMC.USE_YN not in", values, "useYn");
            return (Criteria) this;
        }

        public Criteria andUseYnBetween(String value1, String value2) {
            addCriterion("TMC.USE_YN between", value1, value2, "useYn");
            return (Criteria) this;
        }

        public Criteria andUseYnNotBetween(String value1, String value2) {
            addCriterion("TMC.USE_YN not between", value1, value2, "useYn");
            return (Criteria) this;
        }

        public Criteria andMbrIdLikeInsensitive(String value) {
            addCriterion("upper(TMC.MBR_ID) like", value.toUpperCase(), "mbrId");
            return (Criteria) this;
        }

        public Criteria andMbrCpnNoLikeInsensitive(String value) {
            addCriterion("upper(TMC.MBR_CPN_NO) like", value.toUpperCase(), "mbrCpnNo");
            return (Criteria) this;
        }

        public Criteria andCpnIsuMethCdLikeInsensitive(String value) {
            addCriterion("upper(TMC.CPN_ISU_METH_CD) like", value.toUpperCase(), "cpnIsuMethCd");
            return (Criteria) this;
        }

        public Criteria andCpnIsuRsnContLikeInsensitive(String value) {
            addCriterion("upper(TMC.CPN_ISU_RSN_CONT) like", value.toUpperCase(), "cpnIsuRsnCont");
            return (Criteria) this;
        }

        public Criteria andCpnUseYnLikeInsensitive(String value) {
            addCriterion("upper(TMC.CPN_USE_YN) like", value.toUpperCase(), "cpnUseYn");
            return (Criteria) this;
        }

        public Criteria andRegIdLikeInsensitive(String value) {
            addCriterion("upper(TMC.REG_ID) like", value.toUpperCase(), "regId");
            return (Criteria) this;
        }

        public Criteria andModIdLikeInsensitive(String value) {
            addCriterion("upper(TMC.MOD_ID) like", value.toUpperCase(), "modId");
            return (Criteria) this;
        }

        public Criteria andUseYnLikeInsensitive(String value) {
            addCriterion("upper(TMC.USE_YN) like", value.toUpperCase(), "useYn");
            return (Criteria) this;
        }

        public Criteria andMbrIdLikeLeft(String value) {
            addCriterion("TMC.MBR_ID like ", "%" + value, "mbrId");
            return (Criteria) this;
        }

        public Criteria andMbrIdLikeRight(String value) {
            addCriterion("TMC.MBR_ID like ", value + "%", "mbrId");
            return (Criteria) this;
        }

        public Criteria andMbrIdLikeBoth(String value) {
            addCriterion("TMC.MBR_ID like ", "%" + value + "%", "mbrId");
            return (Criteria) this;
        }

        public Criteria andMbrCpnNoLikeLeft(String value) {
            addCriterion("TMC.MBR_CPN_NO like ", "%" + value, "mbrCpnNo");
            return (Criteria) this;
        }

        public Criteria andMbrCpnNoLikeRight(String value) {
            addCriterion("TMC.MBR_CPN_NO like ", value + "%", "mbrCpnNo");
            return (Criteria) this;
        }

        public Criteria andMbrCpnNoLikeBoth(String value) {
            addCriterion("TMC.MBR_CPN_NO like ", "%" + value + "%", "mbrCpnNo");
            return (Criteria) this;
        }

        public Criteria andCpnIsuMethCdLikeLeft(String value) {
            addCriterion("TMC.CPN_ISU_METH_CD like ", "%" + value, "cpnIsuMethCd");
            return (Criteria) this;
        }

        public Criteria andCpnIsuMethCdLikeRight(String value) {
            addCriterion("TMC.CPN_ISU_METH_CD like ", value + "%", "cpnIsuMethCd");
            return (Criteria) this;
        }

        public Criteria andCpnIsuMethCdLikeBoth(String value) {
            addCriterion("TMC.CPN_ISU_METH_CD like ", "%" + value + "%", "cpnIsuMethCd");
            return (Criteria) this;
        }

        public Criteria andCpnIsuRsnContLikeLeft(String value) {
            addCriterion("TMC.CPN_ISU_RSN_CONT like ", "%" + value, "cpnIsuRsnCont");
            return (Criteria) this;
        }

        public Criteria andCpnIsuRsnContLikeRight(String value) {
            addCriterion("TMC.CPN_ISU_RSN_CONT like ", value + "%", "cpnIsuRsnCont");
            return (Criteria) this;
        }

        public Criteria andCpnIsuRsnContLikeBoth(String value) {
            addCriterion("TMC.CPN_ISU_RSN_CONT like ", "%" + value + "%", "cpnIsuRsnCont");
            return (Criteria) this;
        }

        public Criteria andCpnUseYnLikeLeft(String value) {
            addCriterion("TMC.CPN_USE_YN like ", "%" + value, "cpnUseYn");
            return (Criteria) this;
        }

        public Criteria andCpnUseYnLikeRight(String value) {
            addCriterion("TMC.CPN_USE_YN like ", value + "%", "cpnUseYn");
            return (Criteria) this;
        }

        public Criteria andCpnUseYnLikeBoth(String value) {
            addCriterion("TMC.CPN_USE_YN like ", "%" + value + "%", "cpnUseYn");
            return (Criteria) this;
        }

        public Criteria andRegIdLikeLeft(String value) {
            addCriterion("TMC.REG_ID like ", "%" + value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdLikeRight(String value) {
            addCriterion("TMC.REG_ID like ", value + "%", "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdLikeBoth(String value) {
            addCriterion("TMC.REG_ID like ", "%" + value + "%", "regId");
            return (Criteria) this;
        }

        public Criteria andModIdLikeLeft(String value) {
            addCriterion("TMC.MOD_ID like ", "%" + value, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdLikeRight(String value) {
            addCriterion("TMC.MOD_ID like ", value + "%", "modId");
            return (Criteria) this;
        }

        public Criteria andModIdLikeBoth(String value) {
            addCriterion("TMC.MOD_ID like ", "%" + value + "%", "modId");
            return (Criteria) this;
        }

        public Criteria andUseYnLikeLeft(String value) {
            addCriterion("TMC.USE_YN like ", "%" + value, "useYn");
            return (Criteria) this;
        }

        public Criteria andUseYnLikeRight(String value) {
            addCriterion("TMC.USE_YN like ", value + "%", "useYn");
            return (Criteria) this;
        }

        public Criteria andUseYnLikeBoth(String value) {
            addCriterion("TMC.USE_YN like ", "%" + value + "%", "useYn");
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