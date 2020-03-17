package com.mushbird.sinsege.base.module.payment.model.entity.criteria;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PaymentRefundBatchQueueEntityCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    public PaymentRefundBatchQueueEntityCriteria() {
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

        public Criteria andPayRfdBatchQueIdIsNull() {
            addCriterion("TPRBQ.PAY_RFD_BATCH_QUE_ID is null");
            return (Criteria) this;
        }

        public Criteria andPayRfdBatchQueIdIsNotNull() {
            addCriterion("TPRBQ.PAY_RFD_BATCH_QUE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andPayRfdBatchQueIdEqualTo(Integer value) {
            addCriterion("TPRBQ.PAY_RFD_BATCH_QUE_ID =", value, "payRfdBatchQueId");
            return (Criteria) this;
        }

        public Criteria andPayRfdBatchQueIdNotEqualTo(Integer value) {
            addCriterion("TPRBQ.PAY_RFD_BATCH_QUE_ID <>", value, "payRfdBatchQueId");
            return (Criteria) this;
        }

        public Criteria andPayRfdBatchQueIdGreaterThan(Integer value) {
            addCriterion("TPRBQ.PAY_RFD_BATCH_QUE_ID >", value, "payRfdBatchQueId");
            return (Criteria) this;
        }

        public Criteria andPayRfdBatchQueIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("TPRBQ.PAY_RFD_BATCH_QUE_ID >=", value, "payRfdBatchQueId");
            return (Criteria) this;
        }

        public Criteria andPayRfdBatchQueIdLessThan(Integer value) {
            addCriterion("TPRBQ.PAY_RFD_BATCH_QUE_ID <", value, "payRfdBatchQueId");
            return (Criteria) this;
        }

        public Criteria andPayRfdBatchQueIdLessThanOrEqualTo(Integer value) {
            addCriterion("TPRBQ.PAY_RFD_BATCH_QUE_ID <=", value, "payRfdBatchQueId");
            return (Criteria) this;
        }

        public Criteria andPayRfdBatchQueIdIn(List<Integer> values) {
            addCriterion("TPRBQ.PAY_RFD_BATCH_QUE_ID in", values, "payRfdBatchQueId");
            return (Criteria) this;
        }

        public Criteria andPayRfdBatchQueIdNotIn(List<Integer> values) {
            addCriterion("TPRBQ.PAY_RFD_BATCH_QUE_ID not in", values, "payRfdBatchQueId");
            return (Criteria) this;
        }

        public Criteria andPayRfdBatchQueIdBetween(Integer value1, Integer value2) {
            addCriterion("TPRBQ.PAY_RFD_BATCH_QUE_ID between", value1, value2, "payRfdBatchQueId");
            return (Criteria) this;
        }

        public Criteria andPayRfdBatchQueIdNotBetween(Integer value1, Integer value2) {
            addCriterion("TPRBQ.PAY_RFD_BATCH_QUE_ID not between", value1, value2, "payRfdBatchQueId");
            return (Criteria) this;
        }

        public Criteria andPayIdIsNull() {
            addCriterion("TPRBQ.PAY_ID is null");
            return (Criteria) this;
        }

        public Criteria andPayIdIsNotNull() {
            addCriterion("TPRBQ.PAY_ID is not null");
            return (Criteria) this;
        }

        public Criteria andPayIdEqualTo(Integer value) {
            addCriterion("TPRBQ.PAY_ID =", value, "payId");
            return (Criteria) this;
        }

        public Criteria andPayIdNotEqualTo(Integer value) {
            addCriterion("TPRBQ.PAY_ID <>", value, "payId");
            return (Criteria) this;
        }

        public Criteria andPayIdGreaterThan(Integer value) {
            addCriterion("TPRBQ.PAY_ID >", value, "payId");
            return (Criteria) this;
        }

        public Criteria andPayIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("TPRBQ.PAY_ID >=", value, "payId");
            return (Criteria) this;
        }

        public Criteria andPayIdLessThan(Integer value) {
            addCriterion("TPRBQ.PAY_ID <", value, "payId");
            return (Criteria) this;
        }

        public Criteria andPayIdLessThanOrEqualTo(Integer value) {
            addCriterion("TPRBQ.PAY_ID <=", value, "payId");
            return (Criteria) this;
        }

        public Criteria andPayIdIn(List<Integer> values) {
            addCriterion("TPRBQ.PAY_ID in", values, "payId");
            return (Criteria) this;
        }

        public Criteria andPayIdNotIn(List<Integer> values) {
            addCriterion("TPRBQ.PAY_ID not in", values, "payId");
            return (Criteria) this;
        }

        public Criteria andPayIdBetween(Integer value1, Integer value2) {
            addCriterion("TPRBQ.PAY_ID between", value1, value2, "payId");
            return (Criteria) this;
        }

        public Criteria andPayIdNotBetween(Integer value1, Integer value2) {
            addCriterion("TPRBQ.PAY_ID not between", value1, value2, "payId");
            return (Criteria) this;
        }

        public Criteria andPayPgCdIsNull() {
            addCriterion("TPRBQ.PAY_PG_CD is null");
            return (Criteria) this;
        }

        public Criteria andPayPgCdIsNotNull() {
            addCriterion("TPRBQ.PAY_PG_CD is not null");
            return (Criteria) this;
        }

        public Criteria andPayPgCdEqualTo(String value) {
            addCriterion("TPRBQ.PAY_PG_CD =", value, "payPgCd");
            return (Criteria) this;
        }

        public Criteria andPayPgCdNotEqualTo(String value) {
            addCriterion("TPRBQ.PAY_PG_CD <>", value, "payPgCd");
            return (Criteria) this;
        }

        public Criteria andPayPgCdGreaterThan(String value) {
            addCriterion("TPRBQ.PAY_PG_CD >", value, "payPgCd");
            return (Criteria) this;
        }

        public Criteria andPayPgCdGreaterThanOrEqualTo(String value) {
            addCriterion("TPRBQ.PAY_PG_CD >=", value, "payPgCd");
            return (Criteria) this;
        }

        public Criteria andPayPgCdLessThan(String value) {
            addCriterion("TPRBQ.PAY_PG_CD <", value, "payPgCd");
            return (Criteria) this;
        }

        public Criteria andPayPgCdLessThanOrEqualTo(String value) {
            addCriterion("TPRBQ.PAY_PG_CD <=", value, "payPgCd");
            return (Criteria) this;
        }

        public Criteria andPayPgCdLike(String value) {
            addCriterion("TPRBQ.PAY_PG_CD like", value, "payPgCd");
            return (Criteria) this;
        }

        public Criteria andPayPgCdNotLike(String value) {
            addCriterion("TPRBQ.PAY_PG_CD not like", value, "payPgCd");
            return (Criteria) this;
        }

        public Criteria andPayPgCdIn(List<String> values) {
            addCriterion("TPRBQ.PAY_PG_CD in", values, "payPgCd");
            return (Criteria) this;
        }

        public Criteria andPayPgCdNotIn(List<String> values) {
            addCriterion("TPRBQ.PAY_PG_CD not in", values, "payPgCd");
            return (Criteria) this;
        }

        public Criteria andPayPgCdBetween(String value1, String value2) {
            addCriterion("TPRBQ.PAY_PG_CD between", value1, value2, "payPgCd");
            return (Criteria) this;
        }

        public Criteria andPayPgCdNotBetween(String value1, String value2) {
            addCriterion("TPRBQ.PAY_PG_CD not between", value1, value2, "payPgCd");
            return (Criteria) this;
        }

        public Criteria andTranNoValIsNull() {
            addCriterion("TPRBQ.TRAN_NO_VAL is null");
            return (Criteria) this;
        }

        public Criteria andTranNoValIsNotNull() {
            addCriterion("TPRBQ.TRAN_NO_VAL is not null");
            return (Criteria) this;
        }

        public Criteria andTranNoValEqualTo(String value) {
            addCriterion("TPRBQ.TRAN_NO_VAL =", value, "tranNoVal");
            return (Criteria) this;
        }

        public Criteria andTranNoValNotEqualTo(String value) {
            addCriterion("TPRBQ.TRAN_NO_VAL <>", value, "tranNoVal");
            return (Criteria) this;
        }

        public Criteria andTranNoValGreaterThan(String value) {
            addCriterion("TPRBQ.TRAN_NO_VAL >", value, "tranNoVal");
            return (Criteria) this;
        }

        public Criteria andTranNoValGreaterThanOrEqualTo(String value) {
            addCriterion("TPRBQ.TRAN_NO_VAL >=", value, "tranNoVal");
            return (Criteria) this;
        }

        public Criteria andTranNoValLessThan(String value) {
            addCriterion("TPRBQ.TRAN_NO_VAL <", value, "tranNoVal");
            return (Criteria) this;
        }

        public Criteria andTranNoValLessThanOrEqualTo(String value) {
            addCriterion("TPRBQ.TRAN_NO_VAL <=", value, "tranNoVal");
            return (Criteria) this;
        }

        public Criteria andTranNoValLike(String value) {
            addCriterion("TPRBQ.TRAN_NO_VAL like", value, "tranNoVal");
            return (Criteria) this;
        }

        public Criteria andTranNoValNotLike(String value) {
            addCriterion("TPRBQ.TRAN_NO_VAL not like", value, "tranNoVal");
            return (Criteria) this;
        }

        public Criteria andTranNoValIn(List<String> values) {
            addCriterion("TPRBQ.TRAN_NO_VAL in", values, "tranNoVal");
            return (Criteria) this;
        }

        public Criteria andTranNoValNotIn(List<String> values) {
            addCriterion("TPRBQ.TRAN_NO_VAL not in", values, "tranNoVal");
            return (Criteria) this;
        }

        public Criteria andTranNoValBetween(String value1, String value2) {
            addCriterion("TPRBQ.TRAN_NO_VAL between", value1, value2, "tranNoVal");
            return (Criteria) this;
        }

        public Criteria andTranNoValNotBetween(String value1, String value2) {
            addCriterion("TPRBQ.TRAN_NO_VAL not between", value1, value2, "tranNoVal");
            return (Criteria) this;
        }

        public Criteria andPartCnclClValIsNull() {
            addCriterion("TPRBQ.PART_CNCL_CL_VAL is null");
            return (Criteria) this;
        }

        public Criteria andPartCnclClValIsNotNull() {
            addCriterion("TPRBQ.PART_CNCL_CL_VAL is not null");
            return (Criteria) this;
        }

        public Criteria andPartCnclClValEqualTo(String value) {
            addCriterion("TPRBQ.PART_CNCL_CL_VAL =", value, "partCnclClVal");
            return (Criteria) this;
        }

        public Criteria andPartCnclClValNotEqualTo(String value) {
            addCriterion("TPRBQ.PART_CNCL_CL_VAL <>", value, "partCnclClVal");
            return (Criteria) this;
        }

        public Criteria andPartCnclClValGreaterThan(String value) {
            addCriterion("TPRBQ.PART_CNCL_CL_VAL >", value, "partCnclClVal");
            return (Criteria) this;
        }

        public Criteria andPartCnclClValGreaterThanOrEqualTo(String value) {
            addCriterion("TPRBQ.PART_CNCL_CL_VAL >=", value, "partCnclClVal");
            return (Criteria) this;
        }

        public Criteria andPartCnclClValLessThan(String value) {
            addCriterion("TPRBQ.PART_CNCL_CL_VAL <", value, "partCnclClVal");
            return (Criteria) this;
        }

        public Criteria andPartCnclClValLessThanOrEqualTo(String value) {
            addCriterion("TPRBQ.PART_CNCL_CL_VAL <=", value, "partCnclClVal");
            return (Criteria) this;
        }

        public Criteria andPartCnclClValLike(String value) {
            addCriterion("TPRBQ.PART_CNCL_CL_VAL like", value, "partCnclClVal");
            return (Criteria) this;
        }

        public Criteria andPartCnclClValNotLike(String value) {
            addCriterion("TPRBQ.PART_CNCL_CL_VAL not like", value, "partCnclClVal");
            return (Criteria) this;
        }

        public Criteria andPartCnclClValIn(List<String> values) {
            addCriterion("TPRBQ.PART_CNCL_CL_VAL in", values, "partCnclClVal");
            return (Criteria) this;
        }

        public Criteria andPartCnclClValNotIn(List<String> values) {
            addCriterion("TPRBQ.PART_CNCL_CL_VAL not in", values, "partCnclClVal");
            return (Criteria) this;
        }

        public Criteria andPartCnclClValBetween(String value1, String value2) {
            addCriterion("TPRBQ.PART_CNCL_CL_VAL between", value1, value2, "partCnclClVal");
            return (Criteria) this;
        }

        public Criteria andPartCnclClValNotBetween(String value1, String value2) {
            addCriterion("TPRBQ.PART_CNCL_CL_VAL not between", value1, value2, "partCnclClVal");
            return (Criteria) this;
        }

        public Criteria andMidIsNull() {
            addCriterion("TPRBQ.MID is null");
            return (Criteria) this;
        }

        public Criteria andMidIsNotNull() {
            addCriterion("TPRBQ.MID is not null");
            return (Criteria) this;
        }

        public Criteria andMidEqualTo(String value) {
            addCriterion("TPRBQ.MID =", value, "mid");
            return (Criteria) this;
        }

        public Criteria andMidNotEqualTo(String value) {
            addCriterion("TPRBQ.MID <>", value, "mid");
            return (Criteria) this;
        }

        public Criteria andMidGreaterThan(String value) {
            addCriterion("TPRBQ.MID >", value, "mid");
            return (Criteria) this;
        }

        public Criteria andMidGreaterThanOrEqualTo(String value) {
            addCriterion("TPRBQ.MID >=", value, "mid");
            return (Criteria) this;
        }

        public Criteria andMidLessThan(String value) {
            addCriterion("TPRBQ.MID <", value, "mid");
            return (Criteria) this;
        }

        public Criteria andMidLessThanOrEqualTo(String value) {
            addCriterion("TPRBQ.MID <=", value, "mid");
            return (Criteria) this;
        }

        public Criteria andMidLike(String value) {
            addCriterion("TPRBQ.MID like", value, "mid");
            return (Criteria) this;
        }

        public Criteria andMidNotLike(String value) {
            addCriterion("TPRBQ.MID not like", value, "mid");
            return (Criteria) this;
        }

        public Criteria andMidIn(List<String> values) {
            addCriterion("TPRBQ.MID in", values, "mid");
            return (Criteria) this;
        }

        public Criteria andMidNotIn(List<String> values) {
            addCriterion("TPRBQ.MID not in", values, "mid");
            return (Criteria) this;
        }

        public Criteria andMidBetween(String value1, String value2) {
            addCriterion("TPRBQ.MID between", value1, value2, "mid");
            return (Criteria) this;
        }

        public Criteria andMidNotBetween(String value1, String value2) {
            addCriterion("TPRBQ.MID not between", value1, value2, "mid");
            return (Criteria) this;
        }

        public Criteria andOriPayAmtIsNull() {
            addCriterion("TPRBQ.ORI_PAY_AMT is null");
            return (Criteria) this;
        }

        public Criteria andOriPayAmtIsNotNull() {
            addCriterion("TPRBQ.ORI_PAY_AMT is not null");
            return (Criteria) this;
        }

        public Criteria andOriPayAmtEqualTo(Integer value) {
            addCriterion("TPRBQ.ORI_PAY_AMT =", value, "oriPayAmt");
            return (Criteria) this;
        }

        public Criteria andOriPayAmtNotEqualTo(Integer value) {
            addCriterion("TPRBQ.ORI_PAY_AMT <>", value, "oriPayAmt");
            return (Criteria) this;
        }

        public Criteria andOriPayAmtGreaterThan(Integer value) {
            addCriterion("TPRBQ.ORI_PAY_AMT >", value, "oriPayAmt");
            return (Criteria) this;
        }

        public Criteria andOriPayAmtGreaterThanOrEqualTo(Integer value) {
            addCriterion("TPRBQ.ORI_PAY_AMT >=", value, "oriPayAmt");
            return (Criteria) this;
        }

        public Criteria andOriPayAmtLessThan(Integer value) {
            addCriterion("TPRBQ.ORI_PAY_AMT <", value, "oriPayAmt");
            return (Criteria) this;
        }

        public Criteria andOriPayAmtLessThanOrEqualTo(Integer value) {
            addCriterion("TPRBQ.ORI_PAY_AMT <=", value, "oriPayAmt");
            return (Criteria) this;
        }

        public Criteria andOriPayAmtIn(List<Integer> values) {
            addCriterion("TPRBQ.ORI_PAY_AMT in", values, "oriPayAmt");
            return (Criteria) this;
        }

        public Criteria andOriPayAmtNotIn(List<Integer> values) {
            addCriterion("TPRBQ.ORI_PAY_AMT not in", values, "oriPayAmt");
            return (Criteria) this;
        }

        public Criteria andOriPayAmtBetween(Integer value1, Integer value2) {
            addCriterion("TPRBQ.ORI_PAY_AMT between", value1, value2, "oriPayAmt");
            return (Criteria) this;
        }

        public Criteria andOriPayAmtNotBetween(Integer value1, Integer value2) {
            addCriterion("TPRBQ.ORI_PAY_AMT not between", value1, value2, "oriPayAmt");
            return (Criteria) this;
        }

        public Criteria andRfdAmtIsNull() {
            addCriterion("TPRBQ.RFD_AMT is null");
            return (Criteria) this;
        }

        public Criteria andRfdAmtIsNotNull() {
            addCriterion("TPRBQ.RFD_AMT is not null");
            return (Criteria) this;
        }

        public Criteria andRfdAmtEqualTo(Integer value) {
            addCriterion("TPRBQ.RFD_AMT =", value, "rfdAmt");
            return (Criteria) this;
        }

        public Criteria andRfdAmtNotEqualTo(Integer value) {
            addCriterion("TPRBQ.RFD_AMT <>", value, "rfdAmt");
            return (Criteria) this;
        }

        public Criteria andRfdAmtGreaterThan(Integer value) {
            addCriterion("TPRBQ.RFD_AMT >", value, "rfdAmt");
            return (Criteria) this;
        }

        public Criteria andRfdAmtGreaterThanOrEqualTo(Integer value) {
            addCriterion("TPRBQ.RFD_AMT >=", value, "rfdAmt");
            return (Criteria) this;
        }

        public Criteria andRfdAmtLessThan(Integer value) {
            addCriterion("TPRBQ.RFD_AMT <", value, "rfdAmt");
            return (Criteria) this;
        }

        public Criteria andRfdAmtLessThanOrEqualTo(Integer value) {
            addCriterion("TPRBQ.RFD_AMT <=", value, "rfdAmt");
            return (Criteria) this;
        }

        public Criteria andRfdAmtIn(List<Integer> values) {
            addCriterion("TPRBQ.RFD_AMT in", values, "rfdAmt");
            return (Criteria) this;
        }

        public Criteria andRfdAmtNotIn(List<Integer> values) {
            addCriterion("TPRBQ.RFD_AMT not in", values, "rfdAmt");
            return (Criteria) this;
        }

        public Criteria andRfdAmtBetween(Integer value1, Integer value2) {
            addCriterion("TPRBQ.RFD_AMT between", value1, value2, "rfdAmt");
            return (Criteria) this;
        }

        public Criteria andRfdAmtNotBetween(Integer value1, Integer value2) {
            addCriterion("TPRBQ.RFD_AMT not between", value1, value2, "rfdAmt");
            return (Criteria) this;
        }

        public Criteria andPgSplyAmtIsNull() {
            addCriterion("TPRBQ.PG_SPLY_AMT is null");
            return (Criteria) this;
        }

        public Criteria andPgSplyAmtIsNotNull() {
            addCriterion("TPRBQ.PG_SPLY_AMT is not null");
            return (Criteria) this;
        }

        public Criteria andPgSplyAmtEqualTo(Integer value) {
            addCriterion("TPRBQ.PG_SPLY_AMT =", value, "pgSplyAmt");
            return (Criteria) this;
        }

        public Criteria andPgSplyAmtNotEqualTo(Integer value) {
            addCriterion("TPRBQ.PG_SPLY_AMT <>", value, "pgSplyAmt");
            return (Criteria) this;
        }

        public Criteria andPgSplyAmtGreaterThan(Integer value) {
            addCriterion("TPRBQ.PG_SPLY_AMT >", value, "pgSplyAmt");
            return (Criteria) this;
        }

        public Criteria andPgSplyAmtGreaterThanOrEqualTo(Integer value) {
            addCriterion("TPRBQ.PG_SPLY_AMT >=", value, "pgSplyAmt");
            return (Criteria) this;
        }

        public Criteria andPgSplyAmtLessThan(Integer value) {
            addCriterion("TPRBQ.PG_SPLY_AMT <", value, "pgSplyAmt");
            return (Criteria) this;
        }

        public Criteria andPgSplyAmtLessThanOrEqualTo(Integer value) {
            addCriterion("TPRBQ.PG_SPLY_AMT <=", value, "pgSplyAmt");
            return (Criteria) this;
        }

        public Criteria andPgSplyAmtIn(List<Integer> values) {
            addCriterion("TPRBQ.PG_SPLY_AMT in", values, "pgSplyAmt");
            return (Criteria) this;
        }

        public Criteria andPgSplyAmtNotIn(List<Integer> values) {
            addCriterion("TPRBQ.PG_SPLY_AMT not in", values, "pgSplyAmt");
            return (Criteria) this;
        }

        public Criteria andPgSplyAmtBetween(Integer value1, Integer value2) {
            addCriterion("TPRBQ.PG_SPLY_AMT between", value1, value2, "pgSplyAmt");
            return (Criteria) this;
        }

        public Criteria andPgSplyAmtNotBetween(Integer value1, Integer value2) {
            addCriterion("TPRBQ.PG_SPLY_AMT not between", value1, value2, "pgSplyAmt");
            return (Criteria) this;
        }

        public Criteria andPgVatAmtIsNull() {
            addCriterion("TPRBQ.PG_VAT_AMT is null");
            return (Criteria) this;
        }

        public Criteria andPgVatAmtIsNotNull() {
            addCriterion("TPRBQ.PG_VAT_AMT is not null");
            return (Criteria) this;
        }

        public Criteria andPgVatAmtEqualTo(Integer value) {
            addCriterion("TPRBQ.PG_VAT_AMT =", value, "pgVatAmt");
            return (Criteria) this;
        }

        public Criteria andPgVatAmtNotEqualTo(Integer value) {
            addCriterion("TPRBQ.PG_VAT_AMT <>", value, "pgVatAmt");
            return (Criteria) this;
        }

        public Criteria andPgVatAmtGreaterThan(Integer value) {
            addCriterion("TPRBQ.PG_VAT_AMT >", value, "pgVatAmt");
            return (Criteria) this;
        }

        public Criteria andPgVatAmtGreaterThanOrEqualTo(Integer value) {
            addCriterion("TPRBQ.PG_VAT_AMT >=", value, "pgVatAmt");
            return (Criteria) this;
        }

        public Criteria andPgVatAmtLessThan(Integer value) {
            addCriterion("TPRBQ.PG_VAT_AMT <", value, "pgVatAmt");
            return (Criteria) this;
        }

        public Criteria andPgVatAmtLessThanOrEqualTo(Integer value) {
            addCriterion("TPRBQ.PG_VAT_AMT <=", value, "pgVatAmt");
            return (Criteria) this;
        }

        public Criteria andPgVatAmtIn(List<Integer> values) {
            addCriterion("TPRBQ.PG_VAT_AMT in", values, "pgVatAmt");
            return (Criteria) this;
        }

        public Criteria andPgVatAmtNotIn(List<Integer> values) {
            addCriterion("TPRBQ.PG_VAT_AMT not in", values, "pgVatAmt");
            return (Criteria) this;
        }

        public Criteria andPgVatAmtBetween(Integer value1, Integer value2) {
            addCriterion("TPRBQ.PG_VAT_AMT between", value1, value2, "pgVatAmt");
            return (Criteria) this;
        }

        public Criteria andPgVatAmtNotBetween(Integer value1, Integer value2) {
            addCriterion("TPRBQ.PG_VAT_AMT not between", value1, value2, "pgVatAmt");
            return (Criteria) this;
        }

        public Criteria andPgTaxfreeAmtIsNull() {
            addCriterion("TPRBQ.PG_TAXFREE_AMT is null");
            return (Criteria) this;
        }

        public Criteria andPgTaxfreeAmtIsNotNull() {
            addCriterion("TPRBQ.PG_TAXFREE_AMT is not null");
            return (Criteria) this;
        }

        public Criteria andPgTaxfreeAmtEqualTo(Integer value) {
            addCriterion("TPRBQ.PG_TAXFREE_AMT =", value, "pgTaxfreeAmt");
            return (Criteria) this;
        }

        public Criteria andPgTaxfreeAmtNotEqualTo(Integer value) {
            addCriterion("TPRBQ.PG_TAXFREE_AMT <>", value, "pgTaxfreeAmt");
            return (Criteria) this;
        }

        public Criteria andPgTaxfreeAmtGreaterThan(Integer value) {
            addCriterion("TPRBQ.PG_TAXFREE_AMT >", value, "pgTaxfreeAmt");
            return (Criteria) this;
        }

        public Criteria andPgTaxfreeAmtGreaterThanOrEqualTo(Integer value) {
            addCriterion("TPRBQ.PG_TAXFREE_AMT >=", value, "pgTaxfreeAmt");
            return (Criteria) this;
        }

        public Criteria andPgTaxfreeAmtLessThan(Integer value) {
            addCriterion("TPRBQ.PG_TAXFREE_AMT <", value, "pgTaxfreeAmt");
            return (Criteria) this;
        }

        public Criteria andPgTaxfreeAmtLessThanOrEqualTo(Integer value) {
            addCriterion("TPRBQ.PG_TAXFREE_AMT <=", value, "pgTaxfreeAmt");
            return (Criteria) this;
        }

        public Criteria andPgTaxfreeAmtIn(List<Integer> values) {
            addCriterion("TPRBQ.PG_TAXFREE_AMT in", values, "pgTaxfreeAmt");
            return (Criteria) this;
        }

        public Criteria andPgTaxfreeAmtNotIn(List<Integer> values) {
            addCriterion("TPRBQ.PG_TAXFREE_AMT not in", values, "pgTaxfreeAmt");
            return (Criteria) this;
        }

        public Criteria andPgTaxfreeAmtBetween(Integer value1, Integer value2) {
            addCriterion("TPRBQ.PG_TAXFREE_AMT between", value1, value2, "pgTaxfreeAmt");
            return (Criteria) this;
        }

        public Criteria andPgTaxfreeAmtNotBetween(Integer value1, Integer value2) {
            addCriterion("TPRBQ.PG_TAXFREE_AMT not between", value1, value2, "pgTaxfreeAmt");
            return (Criteria) this;
        }

        public Criteria andErrCntIsNull() {
            addCriterion("TPRBQ.ERR_CNT is null");
            return (Criteria) this;
        }

        public Criteria andErrCntIsNotNull() {
            addCriterion("TPRBQ.ERR_CNT is not null");
            return (Criteria) this;
        }

        public Criteria andErrCntEqualTo(Integer value) {
            addCriterion("TPRBQ.ERR_CNT =", value, "errCnt");
            return (Criteria) this;
        }

        public Criteria andErrCntNotEqualTo(Integer value) {
            addCriterion("TPRBQ.ERR_CNT <>", value, "errCnt");
            return (Criteria) this;
        }

        public Criteria andErrCntGreaterThan(Integer value) {
            addCriterion("TPRBQ.ERR_CNT >", value, "errCnt");
            return (Criteria) this;
        }

        public Criteria andErrCntGreaterThanOrEqualTo(Integer value) {
            addCriterion("TPRBQ.ERR_CNT >=", value, "errCnt");
            return (Criteria) this;
        }

        public Criteria andErrCntLessThan(Integer value) {
            addCriterion("TPRBQ.ERR_CNT <", value, "errCnt");
            return (Criteria) this;
        }

        public Criteria andErrCntLessThanOrEqualTo(Integer value) {
            addCriterion("TPRBQ.ERR_CNT <=", value, "errCnt");
            return (Criteria) this;
        }

        public Criteria andErrCntIn(List<Integer> values) {
            addCriterion("TPRBQ.ERR_CNT in", values, "errCnt");
            return (Criteria) this;
        }

        public Criteria andErrCntNotIn(List<Integer> values) {
            addCriterion("TPRBQ.ERR_CNT not in", values, "errCnt");
            return (Criteria) this;
        }

        public Criteria andErrCntBetween(Integer value1, Integer value2) {
            addCriterion("TPRBQ.ERR_CNT between", value1, value2, "errCnt");
            return (Criteria) this;
        }

        public Criteria andErrCntNotBetween(Integer value1, Integer value2) {
            addCriterion("TPRBQ.ERR_CNT not between", value1, value2, "errCnt");
            return (Criteria) this;
        }

        public Criteria andRsltMsgIsNull() {
            addCriterion("TPRBQ.RSLT_MSG is null");
            return (Criteria) this;
        }

        public Criteria andRsltMsgIsNotNull() {
            addCriterion("TPRBQ.RSLT_MSG is not null");
            return (Criteria) this;
        }

        public Criteria andRsltMsgEqualTo(String value) {
            addCriterion("TPRBQ.RSLT_MSG =", value, "rsltMsg");
            return (Criteria) this;
        }

        public Criteria andRsltMsgNotEqualTo(String value) {
            addCriterion("TPRBQ.RSLT_MSG <>", value, "rsltMsg");
            return (Criteria) this;
        }

        public Criteria andRsltMsgGreaterThan(String value) {
            addCriterion("TPRBQ.RSLT_MSG >", value, "rsltMsg");
            return (Criteria) this;
        }

        public Criteria andRsltMsgGreaterThanOrEqualTo(String value) {
            addCriterion("TPRBQ.RSLT_MSG >=", value, "rsltMsg");
            return (Criteria) this;
        }

        public Criteria andRsltMsgLessThan(String value) {
            addCriterion("TPRBQ.RSLT_MSG <", value, "rsltMsg");
            return (Criteria) this;
        }

        public Criteria andRsltMsgLessThanOrEqualTo(String value) {
            addCriterion("TPRBQ.RSLT_MSG <=", value, "rsltMsg");
            return (Criteria) this;
        }

        public Criteria andRsltMsgLike(String value) {
            addCriterion("TPRBQ.RSLT_MSG like", value, "rsltMsg");
            return (Criteria) this;
        }

        public Criteria andRsltMsgNotLike(String value) {
            addCriterion("TPRBQ.RSLT_MSG not like", value, "rsltMsg");
            return (Criteria) this;
        }

        public Criteria andRsltMsgIn(List<String> values) {
            addCriterion("TPRBQ.RSLT_MSG in", values, "rsltMsg");
            return (Criteria) this;
        }

        public Criteria andRsltMsgNotIn(List<String> values) {
            addCriterion("TPRBQ.RSLT_MSG not in", values, "rsltMsg");
            return (Criteria) this;
        }

        public Criteria andRsltMsgBetween(String value1, String value2) {
            addCriterion("TPRBQ.RSLT_MSG between", value1, value2, "rsltMsg");
            return (Criteria) this;
        }

        public Criteria andRsltMsgNotBetween(String value1, String value2) {
            addCriterion("TPRBQ.RSLT_MSG not between", value1, value2, "rsltMsg");
            return (Criteria) this;
        }

        public Criteria andRegDtIsNull() {
            addCriterion("TPRBQ.REG_DT is null");
            return (Criteria) this;
        }

        public Criteria andRegDtIsNotNull() {
            addCriterion("TPRBQ.REG_DT is not null");
            return (Criteria) this;
        }

        public Criteria andRegDtEqualTo(Date value) {
            addCriterion("TPRBQ.REG_DT =", value, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtNotEqualTo(Date value) {
            addCriterion("TPRBQ.REG_DT <>", value, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtGreaterThan(Date value) {
            addCriterion("TPRBQ.REG_DT >", value, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtGreaterThanOrEqualTo(Date value) {
            addCriterion("TPRBQ.REG_DT >=", value, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtLessThan(Date value) {
            addCriterion("TPRBQ.REG_DT <", value, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtLessThanOrEqualTo(Date value) {
            addCriterion("TPRBQ.REG_DT <=", value, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtIn(List<Date> values) {
            addCriterion("TPRBQ.REG_DT in", values, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtNotIn(List<Date> values) {
            addCriterion("TPRBQ.REG_DT not in", values, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtBetween(Date value1, Date value2) {
            addCriterion("TPRBQ.REG_DT between", value1, value2, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtNotBetween(Date value1, Date value2) {
            addCriterion("TPRBQ.REG_DT not between", value1, value2, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegIdIsNull() {
            addCriterion("TPRBQ.REG_ID is null");
            return (Criteria) this;
        }

        public Criteria andRegIdIsNotNull() {
            addCriterion("TPRBQ.REG_ID is not null");
            return (Criteria) this;
        }

        public Criteria andRegIdEqualTo(String value) {
            addCriterion("TPRBQ.REG_ID =", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdNotEqualTo(String value) {
            addCriterion("TPRBQ.REG_ID <>", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdGreaterThan(String value) {
            addCriterion("TPRBQ.REG_ID >", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdGreaterThanOrEqualTo(String value) {
            addCriterion("TPRBQ.REG_ID >=", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdLessThan(String value) {
            addCriterion("TPRBQ.REG_ID <", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdLessThanOrEqualTo(String value) {
            addCriterion("TPRBQ.REG_ID <=", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdLike(String value) {
            addCriterion("TPRBQ.REG_ID like", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdNotLike(String value) {
            addCriterion("TPRBQ.REG_ID not like", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdIn(List<String> values) {
            addCriterion("TPRBQ.REG_ID in", values, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdNotIn(List<String> values) {
            addCriterion("TPRBQ.REG_ID not in", values, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdBetween(String value1, String value2) {
            addCriterion("TPRBQ.REG_ID between", value1, value2, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdNotBetween(String value1, String value2) {
            addCriterion("TPRBQ.REG_ID not between", value1, value2, "regId");
            return (Criteria) this;
        }

        public Criteria andModDtIsNull() {
            addCriterion("TPRBQ.MOD_DT is null");
            return (Criteria) this;
        }

        public Criteria andModDtIsNotNull() {
            addCriterion("TPRBQ.MOD_DT is not null");
            return (Criteria) this;
        }

        public Criteria andModDtEqualTo(Date value) {
            addCriterion("TPRBQ.MOD_DT =", value, "modDt");
            return (Criteria) this;
        }

        public Criteria andModDtNotEqualTo(Date value) {
            addCriterion("TPRBQ.MOD_DT <>", value, "modDt");
            return (Criteria) this;
        }

        public Criteria andModDtGreaterThan(Date value) {
            addCriterion("TPRBQ.MOD_DT >", value, "modDt");
            return (Criteria) this;
        }

        public Criteria andModDtGreaterThanOrEqualTo(Date value) {
            addCriterion("TPRBQ.MOD_DT >=", value, "modDt");
            return (Criteria) this;
        }

        public Criteria andModDtLessThan(Date value) {
            addCriterion("TPRBQ.MOD_DT <", value, "modDt");
            return (Criteria) this;
        }

        public Criteria andModDtLessThanOrEqualTo(Date value) {
            addCriterion("TPRBQ.MOD_DT <=", value, "modDt");
            return (Criteria) this;
        }

        public Criteria andModDtIn(List<Date> values) {
            addCriterion("TPRBQ.MOD_DT in", values, "modDt");
            return (Criteria) this;
        }

        public Criteria andModDtNotIn(List<Date> values) {
            addCriterion("TPRBQ.MOD_DT not in", values, "modDt");
            return (Criteria) this;
        }

        public Criteria andModDtBetween(Date value1, Date value2) {
            addCriterion("TPRBQ.MOD_DT between", value1, value2, "modDt");
            return (Criteria) this;
        }

        public Criteria andModDtNotBetween(Date value1, Date value2) {
            addCriterion("TPRBQ.MOD_DT not between", value1, value2, "modDt");
            return (Criteria) this;
        }

        public Criteria andModIdIsNull() {
            addCriterion("TPRBQ.MOD_ID is null");
            return (Criteria) this;
        }

        public Criteria andModIdIsNotNull() {
            addCriterion("TPRBQ.MOD_ID is not null");
            return (Criteria) this;
        }

        public Criteria andModIdEqualTo(String value) {
            addCriterion("TPRBQ.MOD_ID =", value, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdNotEqualTo(String value) {
            addCriterion("TPRBQ.MOD_ID <>", value, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdGreaterThan(String value) {
            addCriterion("TPRBQ.MOD_ID >", value, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdGreaterThanOrEqualTo(String value) {
            addCriterion("TPRBQ.MOD_ID >=", value, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdLessThan(String value) {
            addCriterion("TPRBQ.MOD_ID <", value, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdLessThanOrEqualTo(String value) {
            addCriterion("TPRBQ.MOD_ID <=", value, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdLike(String value) {
            addCriterion("TPRBQ.MOD_ID like", value, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdNotLike(String value) {
            addCriterion("TPRBQ.MOD_ID not like", value, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdIn(List<String> values) {
            addCriterion("TPRBQ.MOD_ID in", values, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdNotIn(List<String> values) {
            addCriterion("TPRBQ.MOD_ID not in", values, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdBetween(String value1, String value2) {
            addCriterion("TPRBQ.MOD_ID between", value1, value2, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdNotBetween(String value1, String value2) {
            addCriterion("TPRBQ.MOD_ID not between", value1, value2, "modId");
            return (Criteria) this;
        }

        public Criteria andPayPgCdLikeInsensitive(String value) {
            addCriterion("upper(TPRBQ.PAY_PG_CD) like", value.toUpperCase(), "payPgCd");
            return (Criteria) this;
        }

        public Criteria andTranNoValLikeInsensitive(String value) {
            addCriterion("upper(TPRBQ.TRAN_NO_VAL) like", value.toUpperCase(), "tranNoVal");
            return (Criteria) this;
        }

        public Criteria andPartCnclClValLikeInsensitive(String value) {
            addCriterion("upper(TPRBQ.PART_CNCL_CL_VAL) like", value.toUpperCase(), "partCnclClVal");
            return (Criteria) this;
        }

        public Criteria andMidLikeInsensitive(String value) {
            addCriterion("upper(TPRBQ.MID) like", value.toUpperCase(), "mid");
            return (Criteria) this;
        }

        public Criteria andRsltMsgLikeInsensitive(String value) {
            addCriterion("upper(TPRBQ.RSLT_MSG) like", value.toUpperCase(), "rsltMsg");
            return (Criteria) this;
        }

        public Criteria andRegIdLikeInsensitive(String value) {
            addCriterion("upper(TPRBQ.REG_ID) like", value.toUpperCase(), "regId");
            return (Criteria) this;
        }

        public Criteria andModIdLikeInsensitive(String value) {
            addCriterion("upper(TPRBQ.MOD_ID) like", value.toUpperCase(), "modId");
            return (Criteria) this;
        }

        public Criteria andPayPgCdLikeLeft(String value) {
            addCriterion("TPRBQ.PAY_PG_CD like ", "%" + value, "payPgCd");
            return (Criteria) this;
        }

        public Criteria andPayPgCdLikeRight(String value) {
            addCriterion("TPRBQ.PAY_PG_CD like ", value + "%", "payPgCd");
            return (Criteria) this;
        }

        public Criteria andPayPgCdLikeBoth(String value) {
            addCriterion("TPRBQ.PAY_PG_CD like ", "%" + value + "%", "payPgCd");
            return (Criteria) this;
        }

        public Criteria andTranNoValLikeLeft(String value) {
            addCriterion("TPRBQ.TRAN_NO_VAL like ", "%" + value, "tranNoVal");
            return (Criteria) this;
        }

        public Criteria andTranNoValLikeRight(String value) {
            addCriterion("TPRBQ.TRAN_NO_VAL like ", value + "%", "tranNoVal");
            return (Criteria) this;
        }

        public Criteria andTranNoValLikeBoth(String value) {
            addCriterion("TPRBQ.TRAN_NO_VAL like ", "%" + value + "%", "tranNoVal");
            return (Criteria) this;
        }

        public Criteria andPartCnclClValLikeLeft(String value) {
            addCriterion("TPRBQ.PART_CNCL_CL_VAL like ", "%" + value, "partCnclClVal");
            return (Criteria) this;
        }

        public Criteria andPartCnclClValLikeRight(String value) {
            addCriterion("TPRBQ.PART_CNCL_CL_VAL like ", value + "%", "partCnclClVal");
            return (Criteria) this;
        }

        public Criteria andPartCnclClValLikeBoth(String value) {
            addCriterion("TPRBQ.PART_CNCL_CL_VAL like ", "%" + value + "%", "partCnclClVal");
            return (Criteria) this;
        }

        public Criteria andMidLikeLeft(String value) {
            addCriterion("TPRBQ.MID like ", "%" + value, "mid");
            return (Criteria) this;
        }

        public Criteria andMidLikeRight(String value) {
            addCriterion("TPRBQ.MID like ", value + "%", "mid");
            return (Criteria) this;
        }

        public Criteria andMidLikeBoth(String value) {
            addCriterion("TPRBQ.MID like ", "%" + value + "%", "mid");
            return (Criteria) this;
        }

        public Criteria andRsltMsgLikeLeft(String value) {
            addCriterion("TPRBQ.RSLT_MSG like ", "%" + value, "rsltMsg");
            return (Criteria) this;
        }

        public Criteria andRsltMsgLikeRight(String value) {
            addCriterion("TPRBQ.RSLT_MSG like ", value + "%", "rsltMsg");
            return (Criteria) this;
        }

        public Criteria andRsltMsgLikeBoth(String value) {
            addCriterion("TPRBQ.RSLT_MSG like ", "%" + value + "%", "rsltMsg");
            return (Criteria) this;
        }

        public Criteria andRegIdLikeLeft(String value) {
            addCriterion("TPRBQ.REG_ID like ", "%" + value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdLikeRight(String value) {
            addCriterion("TPRBQ.REG_ID like ", value + "%", "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdLikeBoth(String value) {
            addCriterion("TPRBQ.REG_ID like ", "%" + value + "%", "regId");
            return (Criteria) this;
        }

        public Criteria andModIdLikeLeft(String value) {
            addCriterion("TPRBQ.MOD_ID like ", "%" + value, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdLikeRight(String value) {
            addCriterion("TPRBQ.MOD_ID like ", value + "%", "modId");
            return (Criteria) this;
        }

        public Criteria andModIdLikeBoth(String value) {
            addCriterion("TPRBQ.MOD_ID like ", "%" + value + "%", "modId");
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