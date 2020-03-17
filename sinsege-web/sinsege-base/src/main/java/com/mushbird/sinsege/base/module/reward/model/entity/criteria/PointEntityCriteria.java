package com.mushbird.sinsege.base.module.reward.model.entity.criteria;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PointEntityCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    public PointEntityCriteria() {
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

        public Criteria andPtIdIsNull() {
            addCriterion("TP.PT_ID is null");
            return (Criteria) this;
        }

        public Criteria andPtIdIsNotNull() {
            addCriterion("TP.PT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andPtIdEqualTo(Integer value) {
            addCriterion("TP.PT_ID =", value, "ptId");
            return (Criteria) this;
        }

        public Criteria andPtIdNotEqualTo(Integer value) {
            addCriterion("TP.PT_ID <>", value, "ptId");
            return (Criteria) this;
        }

        public Criteria andPtIdGreaterThan(Integer value) {
            addCriterion("TP.PT_ID >", value, "ptId");
            return (Criteria) this;
        }

        public Criteria andPtIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("TP.PT_ID >=", value, "ptId");
            return (Criteria) this;
        }

        public Criteria andPtIdLessThan(Integer value) {
            addCriterion("TP.PT_ID <", value, "ptId");
            return (Criteria) this;
        }

        public Criteria andPtIdLessThanOrEqualTo(Integer value) {
            addCriterion("TP.PT_ID <=", value, "ptId");
            return (Criteria) this;
        }

        public Criteria andPtIdIn(List<Integer> values) {
            addCriterion("TP.PT_ID in", values, "ptId");
            return (Criteria) this;
        }

        public Criteria andPtIdNotIn(List<Integer> values) {
            addCriterion("TP.PT_ID not in", values, "ptId");
            return (Criteria) this;
        }

        public Criteria andPtIdBetween(Integer value1, Integer value2) {
            addCriterion("TP.PT_ID between", value1, value2, "ptId");
            return (Criteria) this;
        }

        public Criteria andPtIdNotBetween(Integer value1, Integer value2) {
            addCriterion("TP.PT_ID not between", value1, value2, "ptId");
            return (Criteria) this;
        }

        public Criteria andMbrIdIsNull() {
            addCriterion("TP.MBR_ID is null");
            return (Criteria) this;
        }

        public Criteria andMbrIdIsNotNull() {
            addCriterion("TP.MBR_ID is not null");
            return (Criteria) this;
        }

        public Criteria andMbrIdEqualTo(String value) {
            addCriterion("TP.MBR_ID =", value, "mbrId");
            return (Criteria) this;
        }

        public Criteria andMbrIdNotEqualTo(String value) {
            addCriterion("TP.MBR_ID <>", value, "mbrId");
            return (Criteria) this;
        }

        public Criteria andMbrIdGreaterThan(String value) {
            addCriterion("TP.MBR_ID >", value, "mbrId");
            return (Criteria) this;
        }

        public Criteria andMbrIdGreaterThanOrEqualTo(String value) {
            addCriterion("TP.MBR_ID >=", value, "mbrId");
            return (Criteria) this;
        }

        public Criteria andMbrIdLessThan(String value) {
            addCriterion("TP.MBR_ID <", value, "mbrId");
            return (Criteria) this;
        }

        public Criteria andMbrIdLessThanOrEqualTo(String value) {
            addCriterion("TP.MBR_ID <=", value, "mbrId");
            return (Criteria) this;
        }

        public Criteria andMbrIdLike(String value) {
            addCriterion("TP.MBR_ID like", value, "mbrId");
            return (Criteria) this;
        }

        public Criteria andMbrIdNotLike(String value) {
            addCriterion("TP.MBR_ID not like", value, "mbrId");
            return (Criteria) this;
        }

        public Criteria andMbrIdIn(List<String> values) {
            addCriterion("TP.MBR_ID in", values, "mbrId");
            return (Criteria) this;
        }

        public Criteria andMbrIdNotIn(List<String> values) {
            addCriterion("TP.MBR_ID not in", values, "mbrId");
            return (Criteria) this;
        }

        public Criteria andMbrIdBetween(String value1, String value2) {
            addCriterion("TP.MBR_ID between", value1, value2, "mbrId");
            return (Criteria) this;
        }

        public Criteria andMbrIdNotBetween(String value1, String value2) {
            addCriterion("TP.MBR_ID not between", value1, value2, "mbrId");
            return (Criteria) this;
        }

        public Criteria andPtTpCdIsNull() {
            addCriterion("TP.PT_TP_CD is null");
            return (Criteria) this;
        }

        public Criteria andPtTpCdIsNotNull() {
            addCriterion("TP.PT_TP_CD is not null");
            return (Criteria) this;
        }

        public Criteria andPtTpCdEqualTo(String value) {
            addCriterion("TP.PT_TP_CD =", value, "ptTpCd");
            return (Criteria) this;
        }

        public Criteria andPtTpCdNotEqualTo(String value) {
            addCriterion("TP.PT_TP_CD <>", value, "ptTpCd");
            return (Criteria) this;
        }

        public Criteria andPtTpCdGreaterThan(String value) {
            addCriterion("TP.PT_TP_CD >", value, "ptTpCd");
            return (Criteria) this;
        }

        public Criteria andPtTpCdGreaterThanOrEqualTo(String value) {
            addCriterion("TP.PT_TP_CD >=", value, "ptTpCd");
            return (Criteria) this;
        }

        public Criteria andPtTpCdLessThan(String value) {
            addCriterion("TP.PT_TP_CD <", value, "ptTpCd");
            return (Criteria) this;
        }

        public Criteria andPtTpCdLessThanOrEqualTo(String value) {
            addCriterion("TP.PT_TP_CD <=", value, "ptTpCd");
            return (Criteria) this;
        }

        public Criteria andPtTpCdLike(String value) {
            addCriterion("TP.PT_TP_CD like", value, "ptTpCd");
            return (Criteria) this;
        }

        public Criteria andPtTpCdNotLike(String value) {
            addCriterion("TP.PT_TP_CD not like", value, "ptTpCd");
            return (Criteria) this;
        }

        public Criteria andPtTpCdIn(List<String> values) {
            addCriterion("TP.PT_TP_CD in", values, "ptTpCd");
            return (Criteria) this;
        }

        public Criteria andPtTpCdNotIn(List<String> values) {
            addCriterion("TP.PT_TP_CD not in", values, "ptTpCd");
            return (Criteria) this;
        }

        public Criteria andPtTpCdBetween(String value1, String value2) {
            addCriterion("TP.PT_TP_CD between", value1, value2, "ptTpCd");
            return (Criteria) this;
        }

        public Criteria andPtTpCdNotBetween(String value1, String value2) {
            addCriterion("TP.PT_TP_CD not between", value1, value2, "ptTpCd");
            return (Criteria) this;
        }

        public Criteria andPtProcTpCdIsNull() {
            addCriterion("TP.PT_PROC_TP_CD is null");
            return (Criteria) this;
        }

        public Criteria andPtProcTpCdIsNotNull() {
            addCriterion("TP.PT_PROC_TP_CD is not null");
            return (Criteria) this;
        }

        public Criteria andPtProcTpCdEqualTo(String value) {
            addCriterion("TP.PT_PROC_TP_CD =", value, "ptProcTpCd");
            return (Criteria) this;
        }

        public Criteria andPtProcTpCdNotEqualTo(String value) {
            addCriterion("TP.PT_PROC_TP_CD <>", value, "ptProcTpCd");
            return (Criteria) this;
        }

        public Criteria andPtProcTpCdGreaterThan(String value) {
            addCriterion("TP.PT_PROC_TP_CD >", value, "ptProcTpCd");
            return (Criteria) this;
        }

        public Criteria andPtProcTpCdGreaterThanOrEqualTo(String value) {
            addCriterion("TP.PT_PROC_TP_CD >=", value, "ptProcTpCd");
            return (Criteria) this;
        }

        public Criteria andPtProcTpCdLessThan(String value) {
            addCriterion("TP.PT_PROC_TP_CD <", value, "ptProcTpCd");
            return (Criteria) this;
        }

        public Criteria andPtProcTpCdLessThanOrEqualTo(String value) {
            addCriterion("TP.PT_PROC_TP_CD <=", value, "ptProcTpCd");
            return (Criteria) this;
        }

        public Criteria andPtProcTpCdLike(String value) {
            addCriterion("TP.PT_PROC_TP_CD like", value, "ptProcTpCd");
            return (Criteria) this;
        }

        public Criteria andPtProcTpCdNotLike(String value) {
            addCriterion("TP.PT_PROC_TP_CD not like", value, "ptProcTpCd");
            return (Criteria) this;
        }

        public Criteria andPtProcTpCdIn(List<String> values) {
            addCriterion("TP.PT_PROC_TP_CD in", values, "ptProcTpCd");
            return (Criteria) this;
        }

        public Criteria andPtProcTpCdNotIn(List<String> values) {
            addCriterion("TP.PT_PROC_TP_CD not in", values, "ptProcTpCd");
            return (Criteria) this;
        }

        public Criteria andPtProcTpCdBetween(String value1, String value2) {
            addCriterion("TP.PT_PROC_TP_CD between", value1, value2, "ptProcTpCd");
            return (Criteria) this;
        }

        public Criteria andPtProcTpCdNotBetween(String value1, String value2) {
            addCriterion("TP.PT_PROC_TP_CD not between", value1, value2, "ptProcTpCd");
            return (Criteria) this;
        }

        public Criteria andPtRsnTpCdIsNull() {
            addCriterion("TP.PT_RSN_TP_CD is null");
            return (Criteria) this;
        }

        public Criteria andPtRsnTpCdIsNotNull() {
            addCriterion("TP.PT_RSN_TP_CD is not null");
            return (Criteria) this;
        }

        public Criteria andPtRsnTpCdEqualTo(String value) {
            addCriterion("TP.PT_RSN_TP_CD =", value, "ptRsnTpCd");
            return (Criteria) this;
        }

        public Criteria andPtRsnTpCdNotEqualTo(String value) {
            addCriterion("TP.PT_RSN_TP_CD <>", value, "ptRsnTpCd");
            return (Criteria) this;
        }

        public Criteria andPtRsnTpCdGreaterThan(String value) {
            addCriterion("TP.PT_RSN_TP_CD >", value, "ptRsnTpCd");
            return (Criteria) this;
        }

        public Criteria andPtRsnTpCdGreaterThanOrEqualTo(String value) {
            addCriterion("TP.PT_RSN_TP_CD >=", value, "ptRsnTpCd");
            return (Criteria) this;
        }

        public Criteria andPtRsnTpCdLessThan(String value) {
            addCriterion("TP.PT_RSN_TP_CD <", value, "ptRsnTpCd");
            return (Criteria) this;
        }

        public Criteria andPtRsnTpCdLessThanOrEqualTo(String value) {
            addCriterion("TP.PT_RSN_TP_CD <=", value, "ptRsnTpCd");
            return (Criteria) this;
        }

        public Criteria andPtRsnTpCdLike(String value) {
            addCriterion("TP.PT_RSN_TP_CD like", value, "ptRsnTpCd");
            return (Criteria) this;
        }

        public Criteria andPtRsnTpCdNotLike(String value) {
            addCriterion("TP.PT_RSN_TP_CD not like", value, "ptRsnTpCd");
            return (Criteria) this;
        }

        public Criteria andPtRsnTpCdIn(List<String> values) {
            addCriterion("TP.PT_RSN_TP_CD in", values, "ptRsnTpCd");
            return (Criteria) this;
        }

        public Criteria andPtRsnTpCdNotIn(List<String> values) {
            addCriterion("TP.PT_RSN_TP_CD not in", values, "ptRsnTpCd");
            return (Criteria) this;
        }

        public Criteria andPtRsnTpCdBetween(String value1, String value2) {
            addCriterion("TP.PT_RSN_TP_CD between", value1, value2, "ptRsnTpCd");
            return (Criteria) this;
        }

        public Criteria andPtRsnTpCdNotBetween(String value1, String value2) {
            addCriterion("TP.PT_RSN_TP_CD not between", value1, value2, "ptRsnTpCd");
            return (Criteria) this;
        }

        public Criteria andPtRsnIsNull() {
            addCriterion("TP.PT_RSN is null");
            return (Criteria) this;
        }

        public Criteria andPtRsnIsNotNull() {
            addCriterion("TP.PT_RSN is not null");
            return (Criteria) this;
        }

        public Criteria andPtRsnEqualTo(String value) {
            addCriterion("TP.PT_RSN =", value, "ptRsn");
            return (Criteria) this;
        }

        public Criteria andPtRsnNotEqualTo(String value) {
            addCriterion("TP.PT_RSN <>", value, "ptRsn");
            return (Criteria) this;
        }

        public Criteria andPtRsnGreaterThan(String value) {
            addCriterion("TP.PT_RSN >", value, "ptRsn");
            return (Criteria) this;
        }

        public Criteria andPtRsnGreaterThanOrEqualTo(String value) {
            addCriterion("TP.PT_RSN >=", value, "ptRsn");
            return (Criteria) this;
        }

        public Criteria andPtRsnLessThan(String value) {
            addCriterion("TP.PT_RSN <", value, "ptRsn");
            return (Criteria) this;
        }

        public Criteria andPtRsnLessThanOrEqualTo(String value) {
            addCriterion("TP.PT_RSN <=", value, "ptRsn");
            return (Criteria) this;
        }

        public Criteria andPtRsnLike(String value) {
            addCriterion("TP.PT_RSN like", value, "ptRsn");
            return (Criteria) this;
        }

        public Criteria andPtRsnNotLike(String value) {
            addCriterion("TP.PT_RSN not like", value, "ptRsn");
            return (Criteria) this;
        }

        public Criteria andPtRsnIn(List<String> values) {
            addCriterion("TP.PT_RSN in", values, "ptRsn");
            return (Criteria) this;
        }

        public Criteria andPtRsnNotIn(List<String> values) {
            addCriterion("TP.PT_RSN not in", values, "ptRsn");
            return (Criteria) this;
        }

        public Criteria andPtRsnBetween(String value1, String value2) {
            addCriterion("TP.PT_RSN between", value1, value2, "ptRsn");
            return (Criteria) this;
        }

        public Criteria andPtRsnNotBetween(String value1, String value2) {
            addCriterion("TP.PT_RSN not between", value1, value2, "ptRsn");
            return (Criteria) this;
        }

        public Criteria andPtAmtIsNull() {
            addCriterion("TP.PT_AMT is null");
            return (Criteria) this;
        }

        public Criteria andPtAmtIsNotNull() {
            addCriterion("TP.PT_AMT is not null");
            return (Criteria) this;
        }

        public Criteria andPtAmtEqualTo(Integer value) {
            addCriterion("TP.PT_AMT =", value, "ptAmt");
            return (Criteria) this;
        }

        public Criteria andPtAmtNotEqualTo(Integer value) {
            addCriterion("TP.PT_AMT <>", value, "ptAmt");
            return (Criteria) this;
        }

        public Criteria andPtAmtGreaterThan(Integer value) {
            addCriterion("TP.PT_AMT >", value, "ptAmt");
            return (Criteria) this;
        }

        public Criteria andPtAmtGreaterThanOrEqualTo(Integer value) {
            addCriterion("TP.PT_AMT >=", value, "ptAmt");
            return (Criteria) this;
        }

        public Criteria andPtAmtLessThan(Integer value) {
            addCriterion("TP.PT_AMT <", value, "ptAmt");
            return (Criteria) this;
        }

        public Criteria andPtAmtLessThanOrEqualTo(Integer value) {
            addCriterion("TP.PT_AMT <=", value, "ptAmt");
            return (Criteria) this;
        }

        public Criteria andPtAmtIn(List<Integer> values) {
            addCriterion("TP.PT_AMT in", values, "ptAmt");
            return (Criteria) this;
        }

        public Criteria andPtAmtNotIn(List<Integer> values) {
            addCriterion("TP.PT_AMT not in", values, "ptAmt");
            return (Criteria) this;
        }

        public Criteria andPtAmtBetween(Integer value1, Integer value2) {
            addCriterion("TP.PT_AMT between", value1, value2, "ptAmt");
            return (Criteria) this;
        }

        public Criteria andPtAmtNotBetween(Integer value1, Integer value2) {
            addCriterion("TP.PT_AMT not between", value1, value2, "ptAmt");
            return (Criteria) this;
        }

        public Criteria andPtVldEdDtIsNull() {
            addCriterion("TP.PT_VLD_ED_DT is null");
            return (Criteria) this;
        }

        public Criteria andPtVldEdDtIsNotNull() {
            addCriterion("TP.PT_VLD_ED_DT is not null");
            return (Criteria) this;
        }

        public Criteria andPtVldEdDtEqualTo(Date value) {
            addCriterion("TP.PT_VLD_ED_DT =", value, "ptVldEdDt");
            return (Criteria) this;
        }

        public Criteria andPtVldEdDtNotEqualTo(Date value) {
            addCriterion("TP.PT_VLD_ED_DT <>", value, "ptVldEdDt");
            return (Criteria) this;
        }

        public Criteria andPtVldEdDtGreaterThan(Date value) {
            addCriterion("TP.PT_VLD_ED_DT >", value, "ptVldEdDt");
            return (Criteria) this;
        }

        public Criteria andPtVldEdDtGreaterThanOrEqualTo(Date value) {
            addCriterion("TP.PT_VLD_ED_DT >=", value, "ptVldEdDt");
            return (Criteria) this;
        }

        public Criteria andPtVldEdDtLessThan(Date value) {
            addCriterion("TP.PT_VLD_ED_DT <", value, "ptVldEdDt");
            return (Criteria) this;
        }

        public Criteria andPtVldEdDtLessThanOrEqualTo(Date value) {
            addCriterion("TP.PT_VLD_ED_DT <=", value, "ptVldEdDt");
            return (Criteria) this;
        }

        public Criteria andPtVldEdDtIn(List<Date> values) {
            addCriterion("TP.PT_VLD_ED_DT in", values, "ptVldEdDt");
            return (Criteria) this;
        }

        public Criteria andPtVldEdDtNotIn(List<Date> values) {
            addCriterion("TP.PT_VLD_ED_DT not in", values, "ptVldEdDt");
            return (Criteria) this;
        }

        public Criteria andPtVldEdDtBetween(Date value1, Date value2) {
            addCriterion("TP.PT_VLD_ED_DT between", value1, value2, "ptVldEdDt");
            return (Criteria) this;
        }

        public Criteria andPtVldEdDtNotBetween(Date value1, Date value2) {
            addCriterion("TP.PT_VLD_ED_DT not between", value1, value2, "ptVldEdDt");
            return (Criteria) this;
        }

        public Criteria andPtUsePsblAmtIsNull() {
            addCriterion("TP.PT_USE_PSBL_AMT is null");
            return (Criteria) this;
        }

        public Criteria andPtUsePsblAmtIsNotNull() {
            addCriterion("TP.PT_USE_PSBL_AMT is not null");
            return (Criteria) this;
        }

        public Criteria andPtUsePsblAmtEqualTo(Integer value) {
            addCriterion("TP.PT_USE_PSBL_AMT =", value, "ptUsePsblAmt");
            return (Criteria) this;
        }

        public Criteria andPtUsePsblAmtNotEqualTo(Integer value) {
            addCriterion("TP.PT_USE_PSBL_AMT <>", value, "ptUsePsblAmt");
            return (Criteria) this;
        }

        public Criteria andPtUsePsblAmtGreaterThan(Integer value) {
            addCriterion("TP.PT_USE_PSBL_AMT >", value, "ptUsePsblAmt");
            return (Criteria) this;
        }

        public Criteria andPtUsePsblAmtGreaterThanOrEqualTo(Integer value) {
            addCriterion("TP.PT_USE_PSBL_AMT >=", value, "ptUsePsblAmt");
            return (Criteria) this;
        }

        public Criteria andPtUsePsblAmtLessThan(Integer value) {
            addCriterion("TP.PT_USE_PSBL_AMT <", value, "ptUsePsblAmt");
            return (Criteria) this;
        }

        public Criteria andPtUsePsblAmtLessThanOrEqualTo(Integer value) {
            addCriterion("TP.PT_USE_PSBL_AMT <=", value, "ptUsePsblAmt");
            return (Criteria) this;
        }

        public Criteria andPtUsePsblAmtIn(List<Integer> values) {
            addCriterion("TP.PT_USE_PSBL_AMT in", values, "ptUsePsblAmt");
            return (Criteria) this;
        }

        public Criteria andPtUsePsblAmtNotIn(List<Integer> values) {
            addCriterion("TP.PT_USE_PSBL_AMT not in", values, "ptUsePsblAmt");
            return (Criteria) this;
        }

        public Criteria andPtUsePsblAmtBetween(Integer value1, Integer value2) {
            addCriterion("TP.PT_USE_PSBL_AMT between", value1, value2, "ptUsePsblAmt");
            return (Criteria) this;
        }

        public Criteria andPtUsePsblAmtNotBetween(Integer value1, Integer value2) {
            addCriterion("TP.PT_USE_PSBL_AMT not between", value1, value2, "ptUsePsblAmt");
            return (Criteria) this;
        }

        public Criteria andVenIdIsNull() {
            addCriterion("TP.VEN_ID is null");
            return (Criteria) this;
        }

        public Criteria andVenIdIsNotNull() {
            addCriterion("TP.VEN_ID is not null");
            return (Criteria) this;
        }

        public Criteria andVenIdEqualTo(Integer value) {
            addCriterion("TP.VEN_ID =", value, "venId");
            return (Criteria) this;
        }

        public Criteria andVenIdNotEqualTo(Integer value) {
            addCriterion("TP.VEN_ID <>", value, "venId");
            return (Criteria) this;
        }

        public Criteria andVenIdGreaterThan(Integer value) {
            addCriterion("TP.VEN_ID >", value, "venId");
            return (Criteria) this;
        }

        public Criteria andVenIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("TP.VEN_ID >=", value, "venId");
            return (Criteria) this;
        }

        public Criteria andVenIdLessThan(Integer value) {
            addCriterion("TP.VEN_ID <", value, "venId");
            return (Criteria) this;
        }

        public Criteria andVenIdLessThanOrEqualTo(Integer value) {
            addCriterion("TP.VEN_ID <=", value, "venId");
            return (Criteria) this;
        }

        public Criteria andVenIdIn(List<Integer> values) {
            addCriterion("TP.VEN_ID in", values, "venId");
            return (Criteria) this;
        }

        public Criteria andVenIdNotIn(List<Integer> values) {
            addCriterion("TP.VEN_ID not in", values, "venId");
            return (Criteria) this;
        }

        public Criteria andVenIdBetween(Integer value1, Integer value2) {
            addCriterion("TP.VEN_ID between", value1, value2, "venId");
            return (Criteria) this;
        }

        public Criteria andVenIdNotBetween(Integer value1, Integer value2) {
            addCriterion("TP.VEN_ID not between", value1, value2, "venId");
            return (Criteria) this;
        }

        public Criteria andOrdItemIdIsNull() {
            addCriterion("TP.ORD_ITEM_ID is null");
            return (Criteria) this;
        }

        public Criteria andOrdItemIdIsNotNull() {
            addCriterion("TP.ORD_ITEM_ID is not null");
            return (Criteria) this;
        }

        public Criteria andOrdItemIdEqualTo(Integer value) {
            addCriterion("TP.ORD_ITEM_ID =", value, "ordItemId");
            return (Criteria) this;
        }

        public Criteria andOrdItemIdNotEqualTo(Integer value) {
            addCriterion("TP.ORD_ITEM_ID <>", value, "ordItemId");
            return (Criteria) this;
        }

        public Criteria andOrdItemIdGreaterThan(Integer value) {
            addCriterion("TP.ORD_ITEM_ID >", value, "ordItemId");
            return (Criteria) this;
        }

        public Criteria andOrdItemIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("TP.ORD_ITEM_ID >=", value, "ordItemId");
            return (Criteria) this;
        }

        public Criteria andOrdItemIdLessThan(Integer value) {
            addCriterion("TP.ORD_ITEM_ID <", value, "ordItemId");
            return (Criteria) this;
        }

        public Criteria andOrdItemIdLessThanOrEqualTo(Integer value) {
            addCriterion("TP.ORD_ITEM_ID <=", value, "ordItemId");
            return (Criteria) this;
        }

        public Criteria andOrdItemIdIn(List<Integer> values) {
            addCriterion("TP.ORD_ITEM_ID in", values, "ordItemId");
            return (Criteria) this;
        }

        public Criteria andOrdItemIdNotIn(List<Integer> values) {
            addCriterion("TP.ORD_ITEM_ID not in", values, "ordItemId");
            return (Criteria) this;
        }

        public Criteria andOrdItemIdBetween(Integer value1, Integer value2) {
            addCriterion("TP.ORD_ITEM_ID between", value1, value2, "ordItemId");
            return (Criteria) this;
        }

        public Criteria andOrdItemIdNotBetween(Integer value1, Integer value2) {
            addCriterion("TP.ORD_ITEM_ID not between", value1, value2, "ordItemId");
            return (Criteria) this;
        }

        public Criteria andItemIdIsNull() {
            addCriterion("TP.ITEM_ID is null");
            return (Criteria) this;
        }

        public Criteria andItemIdIsNotNull() {
            addCriterion("TP.ITEM_ID is not null");
            return (Criteria) this;
        }

        public Criteria andItemIdEqualTo(Integer value) {
            addCriterion("TP.ITEM_ID =", value, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdNotEqualTo(Integer value) {
            addCriterion("TP.ITEM_ID <>", value, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdGreaterThan(Integer value) {
            addCriterion("TP.ITEM_ID >", value, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("TP.ITEM_ID >=", value, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdLessThan(Integer value) {
            addCriterion("TP.ITEM_ID <", value, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdLessThanOrEqualTo(Integer value) {
            addCriterion("TP.ITEM_ID <=", value, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdIn(List<Integer> values) {
            addCriterion("TP.ITEM_ID in", values, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdNotIn(List<Integer> values) {
            addCriterion("TP.ITEM_ID not in", values, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdBetween(Integer value1, Integer value2) {
            addCriterion("TP.ITEM_ID between", value1, value2, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdNotBetween(Integer value1, Integer value2) {
            addCriterion("TP.ITEM_ID not between", value1, value2, "itemId");
            return (Criteria) this;
        }

        public Criteria andPtAdmProcIdIsNull() {
            addCriterion("TP.PT_ADM_PROC_ID is null");
            return (Criteria) this;
        }

        public Criteria andPtAdmProcIdIsNotNull() {
            addCriterion("TP.PT_ADM_PROC_ID is not null");
            return (Criteria) this;
        }

        public Criteria andPtAdmProcIdEqualTo(Integer value) {
            addCriterion("TP.PT_ADM_PROC_ID =", value, "ptAdmProcId");
            return (Criteria) this;
        }

        public Criteria andPtAdmProcIdNotEqualTo(Integer value) {
            addCriterion("TP.PT_ADM_PROC_ID <>", value, "ptAdmProcId");
            return (Criteria) this;
        }

        public Criteria andPtAdmProcIdGreaterThan(Integer value) {
            addCriterion("TP.PT_ADM_PROC_ID >", value, "ptAdmProcId");
            return (Criteria) this;
        }

        public Criteria andPtAdmProcIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("TP.PT_ADM_PROC_ID >=", value, "ptAdmProcId");
            return (Criteria) this;
        }

        public Criteria andPtAdmProcIdLessThan(Integer value) {
            addCriterion("TP.PT_ADM_PROC_ID <", value, "ptAdmProcId");
            return (Criteria) this;
        }

        public Criteria andPtAdmProcIdLessThanOrEqualTo(Integer value) {
            addCriterion("TP.PT_ADM_PROC_ID <=", value, "ptAdmProcId");
            return (Criteria) this;
        }

        public Criteria andPtAdmProcIdIn(List<Integer> values) {
            addCriterion("TP.PT_ADM_PROC_ID in", values, "ptAdmProcId");
            return (Criteria) this;
        }

        public Criteria andPtAdmProcIdNotIn(List<Integer> values) {
            addCriterion("TP.PT_ADM_PROC_ID not in", values, "ptAdmProcId");
            return (Criteria) this;
        }

        public Criteria andPtAdmProcIdBetween(Integer value1, Integer value2) {
            addCriterion("TP.PT_ADM_PROC_ID between", value1, value2, "ptAdmProcId");
            return (Criteria) this;
        }

        public Criteria andPtAdmProcIdNotBetween(Integer value1, Integer value2) {
            addCriterion("TP.PT_ADM_PROC_ID not between", value1, value2, "ptAdmProcId");
            return (Criteria) this;
        }

        public Criteria andEvntAtndIdIsNull() {
            addCriterion("TP.EVNT_ATND_ID is null");
            return (Criteria) this;
        }

        public Criteria andEvntAtndIdIsNotNull() {
            addCriterion("TP.EVNT_ATND_ID is not null");
            return (Criteria) this;
        }

        public Criteria andEvntAtndIdEqualTo(Integer value) {
            addCriterion("TP.EVNT_ATND_ID =", value, "evntAtndId");
            return (Criteria) this;
        }

        public Criteria andEvntAtndIdNotEqualTo(Integer value) {
            addCriterion("TP.EVNT_ATND_ID <>", value, "evntAtndId");
            return (Criteria) this;
        }

        public Criteria andEvntAtndIdGreaterThan(Integer value) {
            addCriterion("TP.EVNT_ATND_ID >", value, "evntAtndId");
            return (Criteria) this;
        }

        public Criteria andEvntAtndIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("TP.EVNT_ATND_ID >=", value, "evntAtndId");
            return (Criteria) this;
        }

        public Criteria andEvntAtndIdLessThan(Integer value) {
            addCriterion("TP.EVNT_ATND_ID <", value, "evntAtndId");
            return (Criteria) this;
        }

        public Criteria andEvntAtndIdLessThanOrEqualTo(Integer value) {
            addCriterion("TP.EVNT_ATND_ID <=", value, "evntAtndId");
            return (Criteria) this;
        }

        public Criteria andEvntAtndIdIn(List<Integer> values) {
            addCriterion("TP.EVNT_ATND_ID in", values, "evntAtndId");
            return (Criteria) this;
        }

        public Criteria andEvntAtndIdNotIn(List<Integer> values) {
            addCriterion("TP.EVNT_ATND_ID not in", values, "evntAtndId");
            return (Criteria) this;
        }

        public Criteria andEvntAtndIdBetween(Integer value1, Integer value2) {
            addCriterion("TP.EVNT_ATND_ID between", value1, value2, "evntAtndId");
            return (Criteria) this;
        }

        public Criteria andEvntAtndIdNotBetween(Integer value1, Integer value2) {
            addCriterion("TP.EVNT_ATND_ID not between", value1, value2, "evntAtndId");
            return (Criteria) this;
        }

        public Criteria andRegDtIsNull() {
            addCriterion("TP.REG_DT is null");
            return (Criteria) this;
        }

        public Criteria andRegDtIsNotNull() {
            addCriterion("TP.REG_DT is not null");
            return (Criteria) this;
        }

        public Criteria andRegDtEqualTo(Date value) {
            addCriterion("TP.REG_DT =", value, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtNotEqualTo(Date value) {
            addCriterion("TP.REG_DT <>", value, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtGreaterThan(Date value) {
            addCriterion("TP.REG_DT >", value, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtGreaterThanOrEqualTo(Date value) {
            addCriterion("TP.REG_DT >=", value, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtLessThan(Date value) {
            addCriterion("TP.REG_DT <", value, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtLessThanOrEqualTo(Date value) {
            addCriterion("TP.REG_DT <=", value, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtIn(List<Date> values) {
            addCriterion("TP.REG_DT in", values, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtNotIn(List<Date> values) {
            addCriterion("TP.REG_DT not in", values, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtBetween(Date value1, Date value2) {
            addCriterion("TP.REG_DT between", value1, value2, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtNotBetween(Date value1, Date value2) {
            addCriterion("TP.REG_DT not between", value1, value2, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegIdIsNull() {
            addCriterion("TP.REG_ID is null");
            return (Criteria) this;
        }

        public Criteria andRegIdIsNotNull() {
            addCriterion("TP.REG_ID is not null");
            return (Criteria) this;
        }

        public Criteria andRegIdEqualTo(String value) {
            addCriterion("TP.REG_ID =", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdNotEqualTo(String value) {
            addCriterion("TP.REG_ID <>", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdGreaterThan(String value) {
            addCriterion("TP.REG_ID >", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdGreaterThanOrEqualTo(String value) {
            addCriterion("TP.REG_ID >=", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdLessThan(String value) {
            addCriterion("TP.REG_ID <", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdLessThanOrEqualTo(String value) {
            addCriterion("TP.REG_ID <=", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdLike(String value) {
            addCriterion("TP.REG_ID like", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdNotLike(String value) {
            addCriterion("TP.REG_ID not like", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdIn(List<String> values) {
            addCriterion("TP.REG_ID in", values, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdNotIn(List<String> values) {
            addCriterion("TP.REG_ID not in", values, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdBetween(String value1, String value2) {
            addCriterion("TP.REG_ID between", value1, value2, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdNotBetween(String value1, String value2) {
            addCriterion("TP.REG_ID not between", value1, value2, "regId");
            return (Criteria) this;
        }

        public Criteria andModDtIsNull() {
            addCriterion("TP.MOD_DT is null");
            return (Criteria) this;
        }

        public Criteria andModDtIsNotNull() {
            addCriterion("TP.MOD_DT is not null");
            return (Criteria) this;
        }

        public Criteria andModDtEqualTo(Date value) {
            addCriterion("TP.MOD_DT =", value, "modDt");
            return (Criteria) this;
        }

        public Criteria andModDtNotEqualTo(Date value) {
            addCriterion("TP.MOD_DT <>", value, "modDt");
            return (Criteria) this;
        }

        public Criteria andModDtGreaterThan(Date value) {
            addCriterion("TP.MOD_DT >", value, "modDt");
            return (Criteria) this;
        }

        public Criteria andModDtGreaterThanOrEqualTo(Date value) {
            addCriterion("TP.MOD_DT >=", value, "modDt");
            return (Criteria) this;
        }

        public Criteria andModDtLessThan(Date value) {
            addCriterion("TP.MOD_DT <", value, "modDt");
            return (Criteria) this;
        }

        public Criteria andModDtLessThanOrEqualTo(Date value) {
            addCriterion("TP.MOD_DT <=", value, "modDt");
            return (Criteria) this;
        }

        public Criteria andModDtIn(List<Date> values) {
            addCriterion("TP.MOD_DT in", values, "modDt");
            return (Criteria) this;
        }

        public Criteria andModDtNotIn(List<Date> values) {
            addCriterion("TP.MOD_DT not in", values, "modDt");
            return (Criteria) this;
        }

        public Criteria andModDtBetween(Date value1, Date value2) {
            addCriterion("TP.MOD_DT between", value1, value2, "modDt");
            return (Criteria) this;
        }

        public Criteria andModDtNotBetween(Date value1, Date value2) {
            addCriterion("TP.MOD_DT not between", value1, value2, "modDt");
            return (Criteria) this;
        }

        public Criteria andModIdIsNull() {
            addCriterion("TP.MOD_ID is null");
            return (Criteria) this;
        }

        public Criteria andModIdIsNotNull() {
            addCriterion("TP.MOD_ID is not null");
            return (Criteria) this;
        }

        public Criteria andModIdEqualTo(String value) {
            addCriterion("TP.MOD_ID =", value, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdNotEqualTo(String value) {
            addCriterion("TP.MOD_ID <>", value, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdGreaterThan(String value) {
            addCriterion("TP.MOD_ID >", value, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdGreaterThanOrEqualTo(String value) {
            addCriterion("TP.MOD_ID >=", value, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdLessThan(String value) {
            addCriterion("TP.MOD_ID <", value, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdLessThanOrEqualTo(String value) {
            addCriterion("TP.MOD_ID <=", value, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdLike(String value) {
            addCriterion("TP.MOD_ID like", value, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdNotLike(String value) {
            addCriterion("TP.MOD_ID not like", value, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdIn(List<String> values) {
            addCriterion("TP.MOD_ID in", values, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdNotIn(List<String> values) {
            addCriterion("TP.MOD_ID not in", values, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdBetween(String value1, String value2) {
            addCriterion("TP.MOD_ID between", value1, value2, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdNotBetween(String value1, String value2) {
            addCriterion("TP.MOD_ID not between", value1, value2, "modId");
            return (Criteria) this;
        }

        public Criteria andMbrIdLikeInsensitive(String value) {
            addCriterion("upper(TP.MBR_ID) like", value.toUpperCase(), "mbrId");
            return (Criteria) this;
        }

        public Criteria andPtTpCdLikeInsensitive(String value) {
            addCriterion("upper(TP.PT_TP_CD) like", value.toUpperCase(), "ptTpCd");
            return (Criteria) this;
        }

        public Criteria andPtProcTpCdLikeInsensitive(String value) {
            addCriterion("upper(TP.PT_PROC_TP_CD) like", value.toUpperCase(), "ptProcTpCd");
            return (Criteria) this;
        }

        public Criteria andPtRsnTpCdLikeInsensitive(String value) {
            addCriterion("upper(TP.PT_RSN_TP_CD) like", value.toUpperCase(), "ptRsnTpCd");
            return (Criteria) this;
        }

        public Criteria andPtRsnLikeInsensitive(String value) {
            addCriterion("upper(TP.PT_RSN) like", value.toUpperCase(), "ptRsn");
            return (Criteria) this;
        }

        public Criteria andRegIdLikeInsensitive(String value) {
            addCriterion("upper(TP.REG_ID) like", value.toUpperCase(), "regId");
            return (Criteria) this;
        }

        public Criteria andModIdLikeInsensitive(String value) {
            addCriterion("upper(TP.MOD_ID) like", value.toUpperCase(), "modId");
            return (Criteria) this;
        }

        public Criteria andMbrIdLikeLeft(String value) {
            addCriterion("TP.MBR_ID like ", "%" + value, "mbrId");
            return (Criteria) this;
        }

        public Criteria andMbrIdLikeRight(String value) {
            addCriterion("TP.MBR_ID like ", value + "%", "mbrId");
            return (Criteria) this;
        }

        public Criteria andMbrIdLikeBoth(String value) {
            addCriterion("TP.MBR_ID like ", "%" + value + "%", "mbrId");
            return (Criteria) this;
        }

        public Criteria andPtTpCdLikeLeft(String value) {
            addCriterion("TP.PT_TP_CD like ", "%" + value, "ptTpCd");
            return (Criteria) this;
        }

        public Criteria andPtTpCdLikeRight(String value) {
            addCriterion("TP.PT_TP_CD like ", value + "%", "ptTpCd");
            return (Criteria) this;
        }

        public Criteria andPtTpCdLikeBoth(String value) {
            addCriterion("TP.PT_TP_CD like ", "%" + value + "%", "ptTpCd");
            return (Criteria) this;
        }

        public Criteria andPtProcTpCdLikeLeft(String value) {
            addCriterion("TP.PT_PROC_TP_CD like ", "%" + value, "ptProcTpCd");
            return (Criteria) this;
        }

        public Criteria andPtProcTpCdLikeRight(String value) {
            addCriterion("TP.PT_PROC_TP_CD like ", value + "%", "ptProcTpCd");
            return (Criteria) this;
        }

        public Criteria andPtProcTpCdLikeBoth(String value) {
            addCriterion("TP.PT_PROC_TP_CD like ", "%" + value + "%", "ptProcTpCd");
            return (Criteria) this;
        }

        public Criteria andPtRsnTpCdLikeLeft(String value) {
            addCriterion("TP.PT_RSN_TP_CD like ", "%" + value, "ptRsnTpCd");
            return (Criteria) this;
        }

        public Criteria andPtRsnTpCdLikeRight(String value) {
            addCriterion("TP.PT_RSN_TP_CD like ", value + "%", "ptRsnTpCd");
            return (Criteria) this;
        }

        public Criteria andPtRsnTpCdLikeBoth(String value) {
            addCriterion("TP.PT_RSN_TP_CD like ", "%" + value + "%", "ptRsnTpCd");
            return (Criteria) this;
        }

        public Criteria andPtRsnLikeLeft(String value) {
            addCriterion("TP.PT_RSN like ", "%" + value, "ptRsn");
            return (Criteria) this;
        }

        public Criteria andPtRsnLikeRight(String value) {
            addCriterion("TP.PT_RSN like ", value + "%", "ptRsn");
            return (Criteria) this;
        }

        public Criteria andPtRsnLikeBoth(String value) {
            addCriterion("TP.PT_RSN like ", "%" + value + "%", "ptRsn");
            return (Criteria) this;
        }

        public Criteria andRegIdLikeLeft(String value) {
            addCriterion("TP.REG_ID like ", "%" + value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdLikeRight(String value) {
            addCriterion("TP.REG_ID like ", value + "%", "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdLikeBoth(String value) {
            addCriterion("TP.REG_ID like ", "%" + value + "%", "regId");
            return (Criteria) this;
        }

        public Criteria andModIdLikeLeft(String value) {
            addCriterion("TP.MOD_ID like ", "%" + value, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdLikeRight(String value) {
            addCriterion("TP.MOD_ID like ", value + "%", "modId");
            return (Criteria) this;
        }

        public Criteria andModIdLikeBoth(String value) {
            addCriterion("TP.MOD_ID like ", "%" + value + "%", "modId");
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