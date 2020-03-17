package com.mushbird.sinsege.base.module.order.model.entity.criteria;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OrderCouponItemMappingEntityCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    public OrderCouponItemMappingEntityCriteria() {
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

        public Criteria andOrdCpnItemMapIdIsNull() {
            addCriterion("TOCIM.ORD_CPN_ITEM_MAP_ID is null");
            return (Criteria) this;
        }

        public Criteria andOrdCpnItemMapIdIsNotNull() {
            addCriterion("TOCIM.ORD_CPN_ITEM_MAP_ID is not null");
            return (Criteria) this;
        }

        public Criteria andOrdCpnItemMapIdEqualTo(Integer value) {
            addCriterion("TOCIM.ORD_CPN_ITEM_MAP_ID =", value, "ordCpnItemMapId");
            return (Criteria) this;
        }

        public Criteria andOrdCpnItemMapIdNotEqualTo(Integer value) {
            addCriterion("TOCIM.ORD_CPN_ITEM_MAP_ID <>", value, "ordCpnItemMapId");
            return (Criteria) this;
        }

        public Criteria andOrdCpnItemMapIdGreaterThan(Integer value) {
            addCriterion("TOCIM.ORD_CPN_ITEM_MAP_ID >", value, "ordCpnItemMapId");
            return (Criteria) this;
        }

        public Criteria andOrdCpnItemMapIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("TOCIM.ORD_CPN_ITEM_MAP_ID >=", value, "ordCpnItemMapId");
            return (Criteria) this;
        }

        public Criteria andOrdCpnItemMapIdLessThan(Integer value) {
            addCriterion("TOCIM.ORD_CPN_ITEM_MAP_ID <", value, "ordCpnItemMapId");
            return (Criteria) this;
        }

        public Criteria andOrdCpnItemMapIdLessThanOrEqualTo(Integer value) {
            addCriterion("TOCIM.ORD_CPN_ITEM_MAP_ID <=", value, "ordCpnItemMapId");
            return (Criteria) this;
        }

        public Criteria andOrdCpnItemMapIdIn(List<Integer> values) {
            addCriterion("TOCIM.ORD_CPN_ITEM_MAP_ID in", values, "ordCpnItemMapId");
            return (Criteria) this;
        }

        public Criteria andOrdCpnItemMapIdNotIn(List<Integer> values) {
            addCriterion("TOCIM.ORD_CPN_ITEM_MAP_ID not in", values, "ordCpnItemMapId");
            return (Criteria) this;
        }

        public Criteria andOrdCpnItemMapIdBetween(Integer value1, Integer value2) {
            addCriterion("TOCIM.ORD_CPN_ITEM_MAP_ID between", value1, value2, "ordCpnItemMapId");
            return (Criteria) this;
        }

        public Criteria andOrdCpnItemMapIdNotBetween(Integer value1, Integer value2) {
            addCriterion("TOCIM.ORD_CPN_ITEM_MAP_ID not between", value1, value2, "ordCpnItemMapId");
            return (Criteria) this;
        }

        public Criteria andOrdCpnIdIsNull() {
            addCriterion("TOCIM.ORD_CPN_ID is null");
            return (Criteria) this;
        }

        public Criteria andOrdCpnIdIsNotNull() {
            addCriterion("TOCIM.ORD_CPN_ID is not null");
            return (Criteria) this;
        }

        public Criteria andOrdCpnIdEqualTo(Integer value) {
            addCriterion("TOCIM.ORD_CPN_ID =", value, "ordCpnId");
            return (Criteria) this;
        }

        public Criteria andOrdCpnIdNotEqualTo(Integer value) {
            addCriterion("TOCIM.ORD_CPN_ID <>", value, "ordCpnId");
            return (Criteria) this;
        }

        public Criteria andOrdCpnIdGreaterThan(Integer value) {
            addCriterion("TOCIM.ORD_CPN_ID >", value, "ordCpnId");
            return (Criteria) this;
        }

        public Criteria andOrdCpnIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("TOCIM.ORD_CPN_ID >=", value, "ordCpnId");
            return (Criteria) this;
        }

        public Criteria andOrdCpnIdLessThan(Integer value) {
            addCriterion("TOCIM.ORD_CPN_ID <", value, "ordCpnId");
            return (Criteria) this;
        }

        public Criteria andOrdCpnIdLessThanOrEqualTo(Integer value) {
            addCriterion("TOCIM.ORD_CPN_ID <=", value, "ordCpnId");
            return (Criteria) this;
        }

        public Criteria andOrdCpnIdIn(List<Integer> values) {
            addCriterion("TOCIM.ORD_CPN_ID in", values, "ordCpnId");
            return (Criteria) this;
        }

        public Criteria andOrdCpnIdNotIn(List<Integer> values) {
            addCriterion("TOCIM.ORD_CPN_ID not in", values, "ordCpnId");
            return (Criteria) this;
        }

        public Criteria andOrdCpnIdBetween(Integer value1, Integer value2) {
            addCriterion("TOCIM.ORD_CPN_ID between", value1, value2, "ordCpnId");
            return (Criteria) this;
        }

        public Criteria andOrdCpnIdNotBetween(Integer value1, Integer value2) {
            addCriterion("TOCIM.ORD_CPN_ID not between", value1, value2, "ordCpnId");
            return (Criteria) this;
        }

        public Criteria andOrdItemIdIsNull() {
            addCriterion("TOCIM.ORD_ITEM_ID is null");
            return (Criteria) this;
        }

        public Criteria andOrdItemIdIsNotNull() {
            addCriterion("TOCIM.ORD_ITEM_ID is not null");
            return (Criteria) this;
        }

        public Criteria andOrdItemIdEqualTo(Integer value) {
            addCriterion("TOCIM.ORD_ITEM_ID =", value, "ordItemId");
            return (Criteria) this;
        }

        public Criteria andOrdItemIdNotEqualTo(Integer value) {
            addCriterion("TOCIM.ORD_ITEM_ID <>", value, "ordItemId");
            return (Criteria) this;
        }

        public Criteria andOrdItemIdGreaterThan(Integer value) {
            addCriterion("TOCIM.ORD_ITEM_ID >", value, "ordItemId");
            return (Criteria) this;
        }

        public Criteria andOrdItemIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("TOCIM.ORD_ITEM_ID >=", value, "ordItemId");
            return (Criteria) this;
        }

        public Criteria andOrdItemIdLessThan(Integer value) {
            addCriterion("TOCIM.ORD_ITEM_ID <", value, "ordItemId");
            return (Criteria) this;
        }

        public Criteria andOrdItemIdLessThanOrEqualTo(Integer value) {
            addCriterion("TOCIM.ORD_ITEM_ID <=", value, "ordItemId");
            return (Criteria) this;
        }

        public Criteria andOrdItemIdIn(List<Integer> values) {
            addCriterion("TOCIM.ORD_ITEM_ID in", values, "ordItemId");
            return (Criteria) this;
        }

        public Criteria andOrdItemIdNotIn(List<Integer> values) {
            addCriterion("TOCIM.ORD_ITEM_ID not in", values, "ordItemId");
            return (Criteria) this;
        }

        public Criteria andOrdItemIdBetween(Integer value1, Integer value2) {
            addCriterion("TOCIM.ORD_ITEM_ID between", value1, value2, "ordItemId");
            return (Criteria) this;
        }

        public Criteria andOrdItemIdNotBetween(Integer value1, Integer value2) {
            addCriterion("TOCIM.ORD_ITEM_ID not between", value1, value2, "ordItemId");
            return (Criteria) this;
        }

        public Criteria andOrdClmIdIsNull() {
            addCriterion("TOCIM.ORD_CLM_ID is null");
            return (Criteria) this;
        }

        public Criteria andOrdClmIdIsNotNull() {
            addCriterion("TOCIM.ORD_CLM_ID is not null");
            return (Criteria) this;
        }

        public Criteria andOrdClmIdEqualTo(Integer value) {
            addCriterion("TOCIM.ORD_CLM_ID =", value, "ordClmId");
            return (Criteria) this;
        }

        public Criteria andOrdClmIdNotEqualTo(Integer value) {
            addCriterion("TOCIM.ORD_CLM_ID <>", value, "ordClmId");
            return (Criteria) this;
        }

        public Criteria andOrdClmIdGreaterThan(Integer value) {
            addCriterion("TOCIM.ORD_CLM_ID >", value, "ordClmId");
            return (Criteria) this;
        }

        public Criteria andOrdClmIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("TOCIM.ORD_CLM_ID >=", value, "ordClmId");
            return (Criteria) this;
        }

        public Criteria andOrdClmIdLessThan(Integer value) {
            addCriterion("TOCIM.ORD_CLM_ID <", value, "ordClmId");
            return (Criteria) this;
        }

        public Criteria andOrdClmIdLessThanOrEqualTo(Integer value) {
            addCriterion("TOCIM.ORD_CLM_ID <=", value, "ordClmId");
            return (Criteria) this;
        }

        public Criteria andOrdClmIdIn(List<Integer> values) {
            addCriterion("TOCIM.ORD_CLM_ID in", values, "ordClmId");
            return (Criteria) this;
        }

        public Criteria andOrdClmIdNotIn(List<Integer> values) {
            addCriterion("TOCIM.ORD_CLM_ID not in", values, "ordClmId");
            return (Criteria) this;
        }

        public Criteria andOrdClmIdBetween(Integer value1, Integer value2) {
            addCriterion("TOCIM.ORD_CLM_ID between", value1, value2, "ordClmId");
            return (Criteria) this;
        }

        public Criteria andOrdClmIdNotBetween(Integer value1, Integer value2) {
            addCriterion("TOCIM.ORD_CLM_ID not between", value1, value2, "ordClmId");
            return (Criteria) this;
        }

        public Criteria andOrdCpnAplyCdIsNull() {
            addCriterion("TOCIM.ORD_CPN_APLY_CD is null");
            return (Criteria) this;
        }

        public Criteria andOrdCpnAplyCdIsNotNull() {
            addCriterion("TOCIM.ORD_CPN_APLY_CD is not null");
            return (Criteria) this;
        }

        public Criteria andOrdCpnAplyCdEqualTo(String value) {
            addCriterion("TOCIM.ORD_CPN_APLY_CD =", value, "ordCpnAplyCd");
            return (Criteria) this;
        }

        public Criteria andOrdCpnAplyCdNotEqualTo(String value) {
            addCriterion("TOCIM.ORD_CPN_APLY_CD <>", value, "ordCpnAplyCd");
            return (Criteria) this;
        }

        public Criteria andOrdCpnAplyCdGreaterThan(String value) {
            addCriterion("TOCIM.ORD_CPN_APLY_CD >", value, "ordCpnAplyCd");
            return (Criteria) this;
        }

        public Criteria andOrdCpnAplyCdGreaterThanOrEqualTo(String value) {
            addCriterion("TOCIM.ORD_CPN_APLY_CD >=", value, "ordCpnAplyCd");
            return (Criteria) this;
        }

        public Criteria andOrdCpnAplyCdLessThan(String value) {
            addCriterion("TOCIM.ORD_CPN_APLY_CD <", value, "ordCpnAplyCd");
            return (Criteria) this;
        }

        public Criteria andOrdCpnAplyCdLessThanOrEqualTo(String value) {
            addCriterion("TOCIM.ORD_CPN_APLY_CD <=", value, "ordCpnAplyCd");
            return (Criteria) this;
        }

        public Criteria andOrdCpnAplyCdLike(String value) {
            addCriterion("TOCIM.ORD_CPN_APLY_CD like", value, "ordCpnAplyCd");
            return (Criteria) this;
        }

        public Criteria andOrdCpnAplyCdNotLike(String value) {
            addCriterion("TOCIM.ORD_CPN_APLY_CD not like", value, "ordCpnAplyCd");
            return (Criteria) this;
        }

        public Criteria andOrdCpnAplyCdIn(List<String> values) {
            addCriterion("TOCIM.ORD_CPN_APLY_CD in", values, "ordCpnAplyCd");
            return (Criteria) this;
        }

        public Criteria andOrdCpnAplyCdNotIn(List<String> values) {
            addCriterion("TOCIM.ORD_CPN_APLY_CD not in", values, "ordCpnAplyCd");
            return (Criteria) this;
        }

        public Criteria andOrdCpnAplyCdBetween(String value1, String value2) {
            addCriterion("TOCIM.ORD_CPN_APLY_CD between", value1, value2, "ordCpnAplyCd");
            return (Criteria) this;
        }

        public Criteria andOrdCpnAplyCdNotBetween(String value1, String value2) {
            addCriterion("TOCIM.ORD_CPN_APLY_CD not between", value1, value2, "ordCpnAplyCd");
            return (Criteria) this;
        }

        public Criteria andFstCpnDcAmtIsNull() {
            addCriterion("TOCIM.FST_CPN_DC_AMT is null");
            return (Criteria) this;
        }

        public Criteria andFstCpnDcAmtIsNotNull() {
            addCriterion("TOCIM.FST_CPN_DC_AMT is not null");
            return (Criteria) this;
        }

        public Criteria andFstCpnDcAmtEqualTo(Integer value) {
            addCriterion("TOCIM.FST_CPN_DC_AMT =", value, "fstCpnDcAmt");
            return (Criteria) this;
        }

        public Criteria andFstCpnDcAmtNotEqualTo(Integer value) {
            addCriterion("TOCIM.FST_CPN_DC_AMT <>", value, "fstCpnDcAmt");
            return (Criteria) this;
        }

        public Criteria andFstCpnDcAmtGreaterThan(Integer value) {
            addCriterion("TOCIM.FST_CPN_DC_AMT >", value, "fstCpnDcAmt");
            return (Criteria) this;
        }

        public Criteria andFstCpnDcAmtGreaterThanOrEqualTo(Integer value) {
            addCriterion("TOCIM.FST_CPN_DC_AMT >=", value, "fstCpnDcAmt");
            return (Criteria) this;
        }

        public Criteria andFstCpnDcAmtLessThan(Integer value) {
            addCriterion("TOCIM.FST_CPN_DC_AMT <", value, "fstCpnDcAmt");
            return (Criteria) this;
        }

        public Criteria andFstCpnDcAmtLessThanOrEqualTo(Integer value) {
            addCriterion("TOCIM.FST_CPN_DC_AMT <=", value, "fstCpnDcAmt");
            return (Criteria) this;
        }

        public Criteria andFstCpnDcAmtIn(List<Integer> values) {
            addCriterion("TOCIM.FST_CPN_DC_AMT in", values, "fstCpnDcAmt");
            return (Criteria) this;
        }

        public Criteria andFstCpnDcAmtNotIn(List<Integer> values) {
            addCriterion("TOCIM.FST_CPN_DC_AMT not in", values, "fstCpnDcAmt");
            return (Criteria) this;
        }

        public Criteria andFstCpnDcAmtBetween(Integer value1, Integer value2) {
            addCriterion("TOCIM.FST_CPN_DC_AMT between", value1, value2, "fstCpnDcAmt");
            return (Criteria) this;
        }

        public Criteria andFstCpnDcAmtNotBetween(Integer value1, Integer value2) {
            addCriterion("TOCIM.FST_CPN_DC_AMT not between", value1, value2, "fstCpnDcAmt");
            return (Criteria) this;
        }

        public Criteria andCpnDcAmtIsNull() {
            addCriterion("TOCIM.CPN_DC_AMT is null");
            return (Criteria) this;
        }

        public Criteria andCpnDcAmtIsNotNull() {
            addCriterion("TOCIM.CPN_DC_AMT is not null");
            return (Criteria) this;
        }

        public Criteria andCpnDcAmtEqualTo(Integer value) {
            addCriterion("TOCIM.CPN_DC_AMT =", value, "cpnDcAmt");
            return (Criteria) this;
        }

        public Criteria andCpnDcAmtNotEqualTo(Integer value) {
            addCriterion("TOCIM.CPN_DC_AMT <>", value, "cpnDcAmt");
            return (Criteria) this;
        }

        public Criteria andCpnDcAmtGreaterThan(Integer value) {
            addCriterion("TOCIM.CPN_DC_AMT >", value, "cpnDcAmt");
            return (Criteria) this;
        }

        public Criteria andCpnDcAmtGreaterThanOrEqualTo(Integer value) {
            addCriterion("TOCIM.CPN_DC_AMT >=", value, "cpnDcAmt");
            return (Criteria) this;
        }

        public Criteria andCpnDcAmtLessThan(Integer value) {
            addCriterion("TOCIM.CPN_DC_AMT <", value, "cpnDcAmt");
            return (Criteria) this;
        }

        public Criteria andCpnDcAmtLessThanOrEqualTo(Integer value) {
            addCriterion("TOCIM.CPN_DC_AMT <=", value, "cpnDcAmt");
            return (Criteria) this;
        }

        public Criteria andCpnDcAmtIn(List<Integer> values) {
            addCriterion("TOCIM.CPN_DC_AMT in", values, "cpnDcAmt");
            return (Criteria) this;
        }

        public Criteria andCpnDcAmtNotIn(List<Integer> values) {
            addCriterion("TOCIM.CPN_DC_AMT not in", values, "cpnDcAmt");
            return (Criteria) this;
        }

        public Criteria andCpnDcAmtBetween(Integer value1, Integer value2) {
            addCriterion("TOCIM.CPN_DC_AMT between", value1, value2, "cpnDcAmt");
            return (Criteria) this;
        }

        public Criteria andCpnDcAmtNotBetween(Integer value1, Integer value2) {
            addCriterion("TOCIM.CPN_DC_AMT not between", value1, value2, "cpnDcAmt");
            return (Criteria) this;
        }

        public Criteria andCpnRtnAmtIsNull() {
            addCriterion("TOCIM.CPN_RTN_AMT is null");
            return (Criteria) this;
        }

        public Criteria andCpnRtnAmtIsNotNull() {
            addCriterion("TOCIM.CPN_RTN_AMT is not null");
            return (Criteria) this;
        }

        public Criteria andCpnRtnAmtEqualTo(Integer value) {
            addCriterion("TOCIM.CPN_RTN_AMT =", value, "cpnRtnAmt");
            return (Criteria) this;
        }

        public Criteria andCpnRtnAmtNotEqualTo(Integer value) {
            addCriterion("TOCIM.CPN_RTN_AMT <>", value, "cpnRtnAmt");
            return (Criteria) this;
        }

        public Criteria andCpnRtnAmtGreaterThan(Integer value) {
            addCriterion("TOCIM.CPN_RTN_AMT >", value, "cpnRtnAmt");
            return (Criteria) this;
        }

        public Criteria andCpnRtnAmtGreaterThanOrEqualTo(Integer value) {
            addCriterion("TOCIM.CPN_RTN_AMT >=", value, "cpnRtnAmt");
            return (Criteria) this;
        }

        public Criteria andCpnRtnAmtLessThan(Integer value) {
            addCriterion("TOCIM.CPN_RTN_AMT <", value, "cpnRtnAmt");
            return (Criteria) this;
        }

        public Criteria andCpnRtnAmtLessThanOrEqualTo(Integer value) {
            addCriterion("TOCIM.CPN_RTN_AMT <=", value, "cpnRtnAmt");
            return (Criteria) this;
        }

        public Criteria andCpnRtnAmtIn(List<Integer> values) {
            addCriterion("TOCIM.CPN_RTN_AMT in", values, "cpnRtnAmt");
            return (Criteria) this;
        }

        public Criteria andCpnRtnAmtNotIn(List<Integer> values) {
            addCriterion("TOCIM.CPN_RTN_AMT not in", values, "cpnRtnAmt");
            return (Criteria) this;
        }

        public Criteria andCpnRtnAmtBetween(Integer value1, Integer value2) {
            addCriterion("TOCIM.CPN_RTN_AMT between", value1, value2, "cpnRtnAmt");
            return (Criteria) this;
        }

        public Criteria andCpnRtnAmtNotBetween(Integer value1, Integer value2) {
            addCriterion("TOCIM.CPN_RTN_AMT not between", value1, value2, "cpnRtnAmt");
            return (Criteria) this;
        }

        public Criteria andRegDtIsNull() {
            addCriterion("TOCIM.REG_DT is null");
            return (Criteria) this;
        }

        public Criteria andRegDtIsNotNull() {
            addCriterion("TOCIM.REG_DT is not null");
            return (Criteria) this;
        }

        public Criteria andRegDtEqualTo(Date value) {
            addCriterion("TOCIM.REG_DT =", value, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtNotEqualTo(Date value) {
            addCriterion("TOCIM.REG_DT <>", value, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtGreaterThan(Date value) {
            addCriterion("TOCIM.REG_DT >", value, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtGreaterThanOrEqualTo(Date value) {
            addCriterion("TOCIM.REG_DT >=", value, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtLessThan(Date value) {
            addCriterion("TOCIM.REG_DT <", value, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtLessThanOrEqualTo(Date value) {
            addCriterion("TOCIM.REG_DT <=", value, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtIn(List<Date> values) {
            addCriterion("TOCIM.REG_DT in", values, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtNotIn(List<Date> values) {
            addCriterion("TOCIM.REG_DT not in", values, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtBetween(Date value1, Date value2) {
            addCriterion("TOCIM.REG_DT between", value1, value2, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtNotBetween(Date value1, Date value2) {
            addCriterion("TOCIM.REG_DT not between", value1, value2, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegIdIsNull() {
            addCriterion("TOCIM.REG_ID is null");
            return (Criteria) this;
        }

        public Criteria andRegIdIsNotNull() {
            addCriterion("TOCIM.REG_ID is not null");
            return (Criteria) this;
        }

        public Criteria andRegIdEqualTo(String value) {
            addCriterion("TOCIM.REG_ID =", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdNotEqualTo(String value) {
            addCriterion("TOCIM.REG_ID <>", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdGreaterThan(String value) {
            addCriterion("TOCIM.REG_ID >", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdGreaterThanOrEqualTo(String value) {
            addCriterion("TOCIM.REG_ID >=", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdLessThan(String value) {
            addCriterion("TOCIM.REG_ID <", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdLessThanOrEqualTo(String value) {
            addCriterion("TOCIM.REG_ID <=", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdLike(String value) {
            addCriterion("TOCIM.REG_ID like", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdNotLike(String value) {
            addCriterion("TOCIM.REG_ID not like", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdIn(List<String> values) {
            addCriterion("TOCIM.REG_ID in", values, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdNotIn(List<String> values) {
            addCriterion("TOCIM.REG_ID not in", values, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdBetween(String value1, String value2) {
            addCriterion("TOCIM.REG_ID between", value1, value2, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdNotBetween(String value1, String value2) {
            addCriterion("TOCIM.REG_ID not between", value1, value2, "regId");
            return (Criteria) this;
        }

        public Criteria andModDtIsNull() {
            addCriterion("TOCIM.MOD_DT is null");
            return (Criteria) this;
        }

        public Criteria andModDtIsNotNull() {
            addCriterion("TOCIM.MOD_DT is not null");
            return (Criteria) this;
        }

        public Criteria andModDtEqualTo(Date value) {
            addCriterion("TOCIM.MOD_DT =", value, "modDt");
            return (Criteria) this;
        }

        public Criteria andModDtNotEqualTo(Date value) {
            addCriterion("TOCIM.MOD_DT <>", value, "modDt");
            return (Criteria) this;
        }

        public Criteria andModDtGreaterThan(Date value) {
            addCriterion("TOCIM.MOD_DT >", value, "modDt");
            return (Criteria) this;
        }

        public Criteria andModDtGreaterThanOrEqualTo(Date value) {
            addCriterion("TOCIM.MOD_DT >=", value, "modDt");
            return (Criteria) this;
        }

        public Criteria andModDtLessThan(Date value) {
            addCriterion("TOCIM.MOD_DT <", value, "modDt");
            return (Criteria) this;
        }

        public Criteria andModDtLessThanOrEqualTo(Date value) {
            addCriterion("TOCIM.MOD_DT <=", value, "modDt");
            return (Criteria) this;
        }

        public Criteria andModDtIn(List<Date> values) {
            addCriterion("TOCIM.MOD_DT in", values, "modDt");
            return (Criteria) this;
        }

        public Criteria andModDtNotIn(List<Date> values) {
            addCriterion("TOCIM.MOD_DT not in", values, "modDt");
            return (Criteria) this;
        }

        public Criteria andModDtBetween(Date value1, Date value2) {
            addCriterion("TOCIM.MOD_DT between", value1, value2, "modDt");
            return (Criteria) this;
        }

        public Criteria andModDtNotBetween(Date value1, Date value2) {
            addCriterion("TOCIM.MOD_DT not between", value1, value2, "modDt");
            return (Criteria) this;
        }

        public Criteria andModIdIsNull() {
            addCriterion("TOCIM.MOD_ID is null");
            return (Criteria) this;
        }

        public Criteria andModIdIsNotNull() {
            addCriterion("TOCIM.MOD_ID is not null");
            return (Criteria) this;
        }

        public Criteria andModIdEqualTo(String value) {
            addCriterion("TOCIM.MOD_ID =", value, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdNotEqualTo(String value) {
            addCriterion("TOCIM.MOD_ID <>", value, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdGreaterThan(String value) {
            addCriterion("TOCIM.MOD_ID >", value, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdGreaterThanOrEqualTo(String value) {
            addCriterion("TOCIM.MOD_ID >=", value, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdLessThan(String value) {
            addCriterion("TOCIM.MOD_ID <", value, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdLessThanOrEqualTo(String value) {
            addCriterion("TOCIM.MOD_ID <=", value, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdLike(String value) {
            addCriterion("TOCIM.MOD_ID like", value, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdNotLike(String value) {
            addCriterion("TOCIM.MOD_ID not like", value, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdIn(List<String> values) {
            addCriterion("TOCIM.MOD_ID in", values, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdNotIn(List<String> values) {
            addCriterion("TOCIM.MOD_ID not in", values, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdBetween(String value1, String value2) {
            addCriterion("TOCIM.MOD_ID between", value1, value2, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdNotBetween(String value1, String value2) {
            addCriterion("TOCIM.MOD_ID not between", value1, value2, "modId");
            return (Criteria) this;
        }

        public Criteria andOrdCpnAplyCdLikeInsensitive(String value) {
            addCriterion("upper(TOCIM.ORD_CPN_APLY_CD) like", value.toUpperCase(), "ordCpnAplyCd");
            return (Criteria) this;
        }

        public Criteria andRegIdLikeInsensitive(String value) {
            addCriterion("upper(TOCIM.REG_ID) like", value.toUpperCase(), "regId");
            return (Criteria) this;
        }

        public Criteria andModIdLikeInsensitive(String value) {
            addCriterion("upper(TOCIM.MOD_ID) like", value.toUpperCase(), "modId");
            return (Criteria) this;
        }

        public Criteria andOrdCpnAplyCdLikeLeft(String value) {
            addCriterion("TOCIM.ORD_CPN_APLY_CD like ", "%" + value, "ordCpnAplyCd");
            return (Criteria) this;
        }

        public Criteria andOrdCpnAplyCdLikeRight(String value) {
            addCriterion("TOCIM.ORD_CPN_APLY_CD like ", value + "%", "ordCpnAplyCd");
            return (Criteria) this;
        }

        public Criteria andOrdCpnAplyCdLikeBoth(String value) {
            addCriterion("TOCIM.ORD_CPN_APLY_CD like ", "%" + value + "%", "ordCpnAplyCd");
            return (Criteria) this;
        }

        public Criteria andRegIdLikeLeft(String value) {
            addCriterion("TOCIM.REG_ID like ", "%" + value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdLikeRight(String value) {
            addCriterion("TOCIM.REG_ID like ", value + "%", "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdLikeBoth(String value) {
            addCriterion("TOCIM.REG_ID like ", "%" + value + "%", "regId");
            return (Criteria) this;
        }

        public Criteria andModIdLikeLeft(String value) {
            addCriterion("TOCIM.MOD_ID like ", "%" + value, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdLikeRight(String value) {
            addCriterion("TOCIM.MOD_ID like ", value + "%", "modId");
            return (Criteria) this;
        }

        public Criteria andModIdLikeBoth(String value) {
            addCriterion("TOCIM.MOD_ID like ", "%" + value + "%", "modId");
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