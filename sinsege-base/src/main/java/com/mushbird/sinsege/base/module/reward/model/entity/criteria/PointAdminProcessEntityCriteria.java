package com.mushbird.sinsege.base.module.reward.model.entity.criteria;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PointAdminProcessEntityCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    public PointAdminProcessEntityCriteria() {
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

        public Criteria andPtAdmProcIdIsNull() {
            addCriterion("TPAP.PT_ADM_PROC_ID is null");
            return (Criteria) this;
        }

        public Criteria andPtAdmProcIdIsNotNull() {
            addCriterion("TPAP.PT_ADM_PROC_ID is not null");
            return (Criteria) this;
        }

        public Criteria andPtAdmProcIdEqualTo(Integer value) {
            addCriterion("TPAP.PT_ADM_PROC_ID =", value, "ptAdmProcId");
            return (Criteria) this;
        }

        public Criteria andPtAdmProcIdNotEqualTo(Integer value) {
            addCriterion("TPAP.PT_ADM_PROC_ID <>", value, "ptAdmProcId");
            return (Criteria) this;
        }

        public Criteria andPtAdmProcIdGreaterThan(Integer value) {
            addCriterion("TPAP.PT_ADM_PROC_ID >", value, "ptAdmProcId");
            return (Criteria) this;
        }

        public Criteria andPtAdmProcIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("TPAP.PT_ADM_PROC_ID >=", value, "ptAdmProcId");
            return (Criteria) this;
        }

        public Criteria andPtAdmProcIdLessThan(Integer value) {
            addCriterion("TPAP.PT_ADM_PROC_ID <", value, "ptAdmProcId");
            return (Criteria) this;
        }

        public Criteria andPtAdmProcIdLessThanOrEqualTo(Integer value) {
            addCriterion("TPAP.PT_ADM_PROC_ID <=", value, "ptAdmProcId");
            return (Criteria) this;
        }

        public Criteria andPtAdmProcIdIn(List<Integer> values) {
            addCriterion("TPAP.PT_ADM_PROC_ID in", values, "ptAdmProcId");
            return (Criteria) this;
        }

        public Criteria andPtAdmProcIdNotIn(List<Integer> values) {
            addCriterion("TPAP.PT_ADM_PROC_ID not in", values, "ptAdmProcId");
            return (Criteria) this;
        }

        public Criteria andPtAdmProcIdBetween(Integer value1, Integer value2) {
            addCriterion("TPAP.PT_ADM_PROC_ID between", value1, value2, "ptAdmProcId");
            return (Criteria) this;
        }

        public Criteria andPtAdmProcIdNotBetween(Integer value1, Integer value2) {
            addCriterion("TPAP.PT_ADM_PROC_ID not between", value1, value2, "ptAdmProcId");
            return (Criteria) this;
        }

        public Criteria andPtProcTpCdIsNull() {
            addCriterion("TPAP.PT_PROC_TP_CD is null");
            return (Criteria) this;
        }

        public Criteria andPtProcTpCdIsNotNull() {
            addCriterion("TPAP.PT_PROC_TP_CD is not null");
            return (Criteria) this;
        }

        public Criteria andPtProcTpCdEqualTo(String value) {
            addCriterion("TPAP.PT_PROC_TP_CD =", value, "ptProcTpCd");
            return (Criteria) this;
        }

        public Criteria andPtProcTpCdNotEqualTo(String value) {
            addCriterion("TPAP.PT_PROC_TP_CD <>", value, "ptProcTpCd");
            return (Criteria) this;
        }

        public Criteria andPtProcTpCdGreaterThan(String value) {
            addCriterion("TPAP.PT_PROC_TP_CD >", value, "ptProcTpCd");
            return (Criteria) this;
        }

        public Criteria andPtProcTpCdGreaterThanOrEqualTo(String value) {
            addCriterion("TPAP.PT_PROC_TP_CD >=", value, "ptProcTpCd");
            return (Criteria) this;
        }

        public Criteria andPtProcTpCdLessThan(String value) {
            addCriterion("TPAP.PT_PROC_TP_CD <", value, "ptProcTpCd");
            return (Criteria) this;
        }

        public Criteria andPtProcTpCdLessThanOrEqualTo(String value) {
            addCriterion("TPAP.PT_PROC_TP_CD <=", value, "ptProcTpCd");
            return (Criteria) this;
        }

        public Criteria andPtProcTpCdLike(String value) {
            addCriterion("TPAP.PT_PROC_TP_CD like", value, "ptProcTpCd");
            return (Criteria) this;
        }

        public Criteria andPtProcTpCdNotLike(String value) {
            addCriterion("TPAP.PT_PROC_TP_CD not like", value, "ptProcTpCd");
            return (Criteria) this;
        }

        public Criteria andPtProcTpCdIn(List<String> values) {
            addCriterion("TPAP.PT_PROC_TP_CD in", values, "ptProcTpCd");
            return (Criteria) this;
        }

        public Criteria andPtProcTpCdNotIn(List<String> values) {
            addCriterion("TPAP.PT_PROC_TP_CD not in", values, "ptProcTpCd");
            return (Criteria) this;
        }

        public Criteria andPtProcTpCdBetween(String value1, String value2) {
            addCriterion("TPAP.PT_PROC_TP_CD between", value1, value2, "ptProcTpCd");
            return (Criteria) this;
        }

        public Criteria andPtProcTpCdNotBetween(String value1, String value2) {
            addCriterion("TPAP.PT_PROC_TP_CD not between", value1, value2, "ptProcTpCd");
            return (Criteria) this;
        }

        public Criteria andMbrGrdCdIsNull() {
            addCriterion("TPAP.MBR_GRD_CD is null");
            return (Criteria) this;
        }

        public Criteria andMbrGrdCdIsNotNull() {
            addCriterion("TPAP.MBR_GRD_CD is not null");
            return (Criteria) this;
        }

        public Criteria andMbrGrdCdEqualTo(String value) {
            addCriterion("TPAP.MBR_GRD_CD =", value, "mbrGrdCd");
            return (Criteria) this;
        }

        public Criteria andMbrGrdCdNotEqualTo(String value) {
            addCriterion("TPAP.MBR_GRD_CD <>", value, "mbrGrdCd");
            return (Criteria) this;
        }

        public Criteria andMbrGrdCdGreaterThan(String value) {
            addCriterion("TPAP.MBR_GRD_CD >", value, "mbrGrdCd");
            return (Criteria) this;
        }

        public Criteria andMbrGrdCdGreaterThanOrEqualTo(String value) {
            addCriterion("TPAP.MBR_GRD_CD >=", value, "mbrGrdCd");
            return (Criteria) this;
        }

        public Criteria andMbrGrdCdLessThan(String value) {
            addCriterion("TPAP.MBR_GRD_CD <", value, "mbrGrdCd");
            return (Criteria) this;
        }

        public Criteria andMbrGrdCdLessThanOrEqualTo(String value) {
            addCriterion("TPAP.MBR_GRD_CD <=", value, "mbrGrdCd");
            return (Criteria) this;
        }

        public Criteria andMbrGrdCdLike(String value) {
            addCriterion("TPAP.MBR_GRD_CD like", value, "mbrGrdCd");
            return (Criteria) this;
        }

        public Criteria andMbrGrdCdNotLike(String value) {
            addCriterion("TPAP.MBR_GRD_CD not like", value, "mbrGrdCd");
            return (Criteria) this;
        }

        public Criteria andMbrGrdCdIn(List<String> values) {
            addCriterion("TPAP.MBR_GRD_CD in", values, "mbrGrdCd");
            return (Criteria) this;
        }

        public Criteria andMbrGrdCdNotIn(List<String> values) {
            addCriterion("TPAP.MBR_GRD_CD not in", values, "mbrGrdCd");
            return (Criteria) this;
        }

        public Criteria andMbrGrdCdBetween(String value1, String value2) {
            addCriterion("TPAP.MBR_GRD_CD between", value1, value2, "mbrGrdCd");
            return (Criteria) this;
        }

        public Criteria andMbrGrdCdNotBetween(String value1, String value2) {
            addCriterion("TPAP.MBR_GRD_CD not between", value1, value2, "mbrGrdCd");
            return (Criteria) this;
        }

        public Criteria andPtRsnTpCdIsNull() {
            addCriterion("TPAP.PT_RSN_TP_CD is null");
            return (Criteria) this;
        }

        public Criteria andPtRsnTpCdIsNotNull() {
            addCriterion("TPAP.PT_RSN_TP_CD is not null");
            return (Criteria) this;
        }

        public Criteria andPtRsnTpCdEqualTo(String value) {
            addCriterion("TPAP.PT_RSN_TP_CD =", value, "ptRsnTpCd");
            return (Criteria) this;
        }

        public Criteria andPtRsnTpCdNotEqualTo(String value) {
            addCriterion("TPAP.PT_RSN_TP_CD <>", value, "ptRsnTpCd");
            return (Criteria) this;
        }

        public Criteria andPtRsnTpCdGreaterThan(String value) {
            addCriterion("TPAP.PT_RSN_TP_CD >", value, "ptRsnTpCd");
            return (Criteria) this;
        }

        public Criteria andPtRsnTpCdGreaterThanOrEqualTo(String value) {
            addCriterion("TPAP.PT_RSN_TP_CD >=", value, "ptRsnTpCd");
            return (Criteria) this;
        }

        public Criteria andPtRsnTpCdLessThan(String value) {
            addCriterion("TPAP.PT_RSN_TP_CD <", value, "ptRsnTpCd");
            return (Criteria) this;
        }

        public Criteria andPtRsnTpCdLessThanOrEqualTo(String value) {
            addCriterion("TPAP.PT_RSN_TP_CD <=", value, "ptRsnTpCd");
            return (Criteria) this;
        }

        public Criteria andPtRsnTpCdLike(String value) {
            addCriterion("TPAP.PT_RSN_TP_CD like", value, "ptRsnTpCd");
            return (Criteria) this;
        }

        public Criteria andPtRsnTpCdNotLike(String value) {
            addCriterion("TPAP.PT_RSN_TP_CD not like", value, "ptRsnTpCd");
            return (Criteria) this;
        }

        public Criteria andPtRsnTpCdIn(List<String> values) {
            addCriterion("TPAP.PT_RSN_TP_CD in", values, "ptRsnTpCd");
            return (Criteria) this;
        }

        public Criteria andPtRsnTpCdNotIn(List<String> values) {
            addCriterion("TPAP.PT_RSN_TP_CD not in", values, "ptRsnTpCd");
            return (Criteria) this;
        }

        public Criteria andPtRsnTpCdBetween(String value1, String value2) {
            addCriterion("TPAP.PT_RSN_TP_CD between", value1, value2, "ptRsnTpCd");
            return (Criteria) this;
        }

        public Criteria andPtRsnTpCdNotBetween(String value1, String value2) {
            addCriterion("TPAP.PT_RSN_TP_CD not between", value1, value2, "ptRsnTpCd");
            return (Criteria) this;
        }

        public Criteria andPtRsnIsNull() {
            addCriterion("TPAP.PT_RSN is null");
            return (Criteria) this;
        }

        public Criteria andPtRsnIsNotNull() {
            addCriterion("TPAP.PT_RSN is not null");
            return (Criteria) this;
        }

        public Criteria andPtRsnEqualTo(String value) {
            addCriterion("TPAP.PT_RSN =", value, "ptRsn");
            return (Criteria) this;
        }

        public Criteria andPtRsnNotEqualTo(String value) {
            addCriterion("TPAP.PT_RSN <>", value, "ptRsn");
            return (Criteria) this;
        }

        public Criteria andPtRsnGreaterThan(String value) {
            addCriterion("TPAP.PT_RSN >", value, "ptRsn");
            return (Criteria) this;
        }

        public Criteria andPtRsnGreaterThanOrEqualTo(String value) {
            addCriterion("TPAP.PT_RSN >=", value, "ptRsn");
            return (Criteria) this;
        }

        public Criteria andPtRsnLessThan(String value) {
            addCriterion("TPAP.PT_RSN <", value, "ptRsn");
            return (Criteria) this;
        }

        public Criteria andPtRsnLessThanOrEqualTo(String value) {
            addCriterion("TPAP.PT_RSN <=", value, "ptRsn");
            return (Criteria) this;
        }

        public Criteria andPtRsnLike(String value) {
            addCriterion("TPAP.PT_RSN like", value, "ptRsn");
            return (Criteria) this;
        }

        public Criteria andPtRsnNotLike(String value) {
            addCriterion("TPAP.PT_RSN not like", value, "ptRsn");
            return (Criteria) this;
        }

        public Criteria andPtRsnIn(List<String> values) {
            addCriterion("TPAP.PT_RSN in", values, "ptRsn");
            return (Criteria) this;
        }

        public Criteria andPtRsnNotIn(List<String> values) {
            addCriterion("TPAP.PT_RSN not in", values, "ptRsn");
            return (Criteria) this;
        }

        public Criteria andPtRsnBetween(String value1, String value2) {
            addCriterion("TPAP.PT_RSN between", value1, value2, "ptRsn");
            return (Criteria) this;
        }

        public Criteria andPtRsnNotBetween(String value1, String value2) {
            addCriterion("TPAP.PT_RSN not between", value1, value2, "ptRsn");
            return (Criteria) this;
        }

        public Criteria andNoteIsNull() {
            addCriterion("TPAP.NOTE is null");
            return (Criteria) this;
        }

        public Criteria andNoteIsNotNull() {
            addCriterion("TPAP.NOTE is not null");
            return (Criteria) this;
        }

        public Criteria andNoteEqualTo(String value) {
            addCriterion("TPAP.NOTE =", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteNotEqualTo(String value) {
            addCriterion("TPAP.NOTE <>", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteGreaterThan(String value) {
            addCriterion("TPAP.NOTE >", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteGreaterThanOrEqualTo(String value) {
            addCriterion("TPAP.NOTE >=", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteLessThan(String value) {
            addCriterion("TPAP.NOTE <", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteLessThanOrEqualTo(String value) {
            addCriterion("TPAP.NOTE <=", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteLike(String value) {
            addCriterion("TPAP.NOTE like", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteNotLike(String value) {
            addCriterion("TPAP.NOTE not like", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteIn(List<String> values) {
            addCriterion("TPAP.NOTE in", values, "note");
            return (Criteria) this;
        }

        public Criteria andNoteNotIn(List<String> values) {
            addCriterion("TPAP.NOTE not in", values, "note");
            return (Criteria) this;
        }

        public Criteria andNoteBetween(String value1, String value2) {
            addCriterion("TPAP.NOTE between", value1, value2, "note");
            return (Criteria) this;
        }

        public Criteria andNoteNotBetween(String value1, String value2) {
            addCriterion("TPAP.NOTE not between", value1, value2, "note");
            return (Criteria) this;
        }

        public Criteria andPtAmtIsNull() {
            addCriterion("TPAP.PT_AMT is null");
            return (Criteria) this;
        }

        public Criteria andPtAmtIsNotNull() {
            addCriterion("TPAP.PT_AMT is not null");
            return (Criteria) this;
        }

        public Criteria andPtAmtEqualTo(Integer value) {
            addCriterion("TPAP.PT_AMT =", value, "ptAmt");
            return (Criteria) this;
        }

        public Criteria andPtAmtNotEqualTo(Integer value) {
            addCriterion("TPAP.PT_AMT <>", value, "ptAmt");
            return (Criteria) this;
        }

        public Criteria andPtAmtGreaterThan(Integer value) {
            addCriterion("TPAP.PT_AMT >", value, "ptAmt");
            return (Criteria) this;
        }

        public Criteria andPtAmtGreaterThanOrEqualTo(Integer value) {
            addCriterion("TPAP.PT_AMT >=", value, "ptAmt");
            return (Criteria) this;
        }

        public Criteria andPtAmtLessThan(Integer value) {
            addCriterion("TPAP.PT_AMT <", value, "ptAmt");
            return (Criteria) this;
        }

        public Criteria andPtAmtLessThanOrEqualTo(Integer value) {
            addCriterion("TPAP.PT_AMT <=", value, "ptAmt");
            return (Criteria) this;
        }

        public Criteria andPtAmtIn(List<Integer> values) {
            addCriterion("TPAP.PT_AMT in", values, "ptAmt");
            return (Criteria) this;
        }

        public Criteria andPtAmtNotIn(List<Integer> values) {
            addCriterion("TPAP.PT_AMT not in", values, "ptAmt");
            return (Criteria) this;
        }

        public Criteria andPtAmtBetween(Integer value1, Integer value2) {
            addCriterion("TPAP.PT_AMT between", value1, value2, "ptAmt");
            return (Criteria) this;
        }

        public Criteria andPtAmtNotBetween(Integer value1, Integer value2) {
            addCriterion("TPAP.PT_AMT not between", value1, value2, "ptAmt");
            return (Criteria) this;
        }

        public Criteria andRegDtIsNull() {
            addCriterion("TPAP.REG_DT is null");
            return (Criteria) this;
        }

        public Criteria andRegDtIsNotNull() {
            addCriterion("TPAP.REG_DT is not null");
            return (Criteria) this;
        }

        public Criteria andRegDtEqualTo(Date value) {
            addCriterion("TPAP.REG_DT =", value, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtNotEqualTo(Date value) {
            addCriterion("TPAP.REG_DT <>", value, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtGreaterThan(Date value) {
            addCriterion("TPAP.REG_DT >", value, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtGreaterThanOrEqualTo(Date value) {
            addCriterion("TPAP.REG_DT >=", value, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtLessThan(Date value) {
            addCriterion("TPAP.REG_DT <", value, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtLessThanOrEqualTo(Date value) {
            addCriterion("TPAP.REG_DT <=", value, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtIn(List<Date> values) {
            addCriterion("TPAP.REG_DT in", values, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtNotIn(List<Date> values) {
            addCriterion("TPAP.REG_DT not in", values, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtBetween(Date value1, Date value2) {
            addCriterion("TPAP.REG_DT between", value1, value2, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtNotBetween(Date value1, Date value2) {
            addCriterion("TPAP.REG_DT not between", value1, value2, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegIdIsNull() {
            addCriterion("TPAP.REG_ID is null");
            return (Criteria) this;
        }

        public Criteria andRegIdIsNotNull() {
            addCriterion("TPAP.REG_ID is not null");
            return (Criteria) this;
        }

        public Criteria andRegIdEqualTo(String value) {
            addCriterion("TPAP.REG_ID =", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdNotEqualTo(String value) {
            addCriterion("TPAP.REG_ID <>", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdGreaterThan(String value) {
            addCriterion("TPAP.REG_ID >", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdGreaterThanOrEqualTo(String value) {
            addCriterion("TPAP.REG_ID >=", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdLessThan(String value) {
            addCriterion("TPAP.REG_ID <", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdLessThanOrEqualTo(String value) {
            addCriterion("TPAP.REG_ID <=", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdLike(String value) {
            addCriterion("TPAP.REG_ID like", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdNotLike(String value) {
            addCriterion("TPAP.REG_ID not like", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdIn(List<String> values) {
            addCriterion("TPAP.REG_ID in", values, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdNotIn(List<String> values) {
            addCriterion("TPAP.REG_ID not in", values, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdBetween(String value1, String value2) {
            addCriterion("TPAP.REG_ID between", value1, value2, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdNotBetween(String value1, String value2) {
            addCriterion("TPAP.REG_ID not between", value1, value2, "regId");
            return (Criteria) this;
        }

        public Criteria andModDtIsNull() {
            addCriterion("TPAP.MOD_DT is null");
            return (Criteria) this;
        }

        public Criteria andModDtIsNotNull() {
            addCriterion("TPAP.MOD_DT is not null");
            return (Criteria) this;
        }

        public Criteria andModDtEqualTo(Date value) {
            addCriterion("TPAP.MOD_DT =", value, "modDt");
            return (Criteria) this;
        }

        public Criteria andModDtNotEqualTo(Date value) {
            addCriterion("TPAP.MOD_DT <>", value, "modDt");
            return (Criteria) this;
        }

        public Criteria andModDtGreaterThan(Date value) {
            addCriterion("TPAP.MOD_DT >", value, "modDt");
            return (Criteria) this;
        }

        public Criteria andModDtGreaterThanOrEqualTo(Date value) {
            addCriterion("TPAP.MOD_DT >=", value, "modDt");
            return (Criteria) this;
        }

        public Criteria andModDtLessThan(Date value) {
            addCriterion("TPAP.MOD_DT <", value, "modDt");
            return (Criteria) this;
        }

        public Criteria andModDtLessThanOrEqualTo(Date value) {
            addCriterion("TPAP.MOD_DT <=", value, "modDt");
            return (Criteria) this;
        }

        public Criteria andModDtIn(List<Date> values) {
            addCriterion("TPAP.MOD_DT in", values, "modDt");
            return (Criteria) this;
        }

        public Criteria andModDtNotIn(List<Date> values) {
            addCriterion("TPAP.MOD_DT not in", values, "modDt");
            return (Criteria) this;
        }

        public Criteria andModDtBetween(Date value1, Date value2) {
            addCriterion("TPAP.MOD_DT between", value1, value2, "modDt");
            return (Criteria) this;
        }

        public Criteria andModDtNotBetween(Date value1, Date value2) {
            addCriterion("TPAP.MOD_DT not between", value1, value2, "modDt");
            return (Criteria) this;
        }

        public Criteria andModIdIsNull() {
            addCriterion("TPAP.MOD_ID is null");
            return (Criteria) this;
        }

        public Criteria andModIdIsNotNull() {
            addCriterion("TPAP.MOD_ID is not null");
            return (Criteria) this;
        }

        public Criteria andModIdEqualTo(String value) {
            addCriterion("TPAP.MOD_ID =", value, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdNotEqualTo(String value) {
            addCriterion("TPAP.MOD_ID <>", value, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdGreaterThan(String value) {
            addCriterion("TPAP.MOD_ID >", value, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdGreaterThanOrEqualTo(String value) {
            addCriterion("TPAP.MOD_ID >=", value, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdLessThan(String value) {
            addCriterion("TPAP.MOD_ID <", value, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdLessThanOrEqualTo(String value) {
            addCriterion("TPAP.MOD_ID <=", value, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdLike(String value) {
            addCriterion("TPAP.MOD_ID like", value, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdNotLike(String value) {
            addCriterion("TPAP.MOD_ID not like", value, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdIn(List<String> values) {
            addCriterion("TPAP.MOD_ID in", values, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdNotIn(List<String> values) {
            addCriterion("TPAP.MOD_ID not in", values, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdBetween(String value1, String value2) {
            addCriterion("TPAP.MOD_ID between", value1, value2, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdNotBetween(String value1, String value2) {
            addCriterion("TPAP.MOD_ID not between", value1, value2, "modId");
            return (Criteria) this;
        }

        public Criteria andUseYnIsNull() {
            addCriterion("TPAP.USE_YN is null");
            return (Criteria) this;
        }

        public Criteria andUseYnIsNotNull() {
            addCriterion("TPAP.USE_YN is not null");
            return (Criteria) this;
        }

        public Criteria andUseYnEqualTo(String value) {
            addCriterion("TPAP.USE_YN =", value, "useYn");
            return (Criteria) this;
        }

        public Criteria andUseYnNotEqualTo(String value) {
            addCriterion("TPAP.USE_YN <>", value, "useYn");
            return (Criteria) this;
        }

        public Criteria andUseYnGreaterThan(String value) {
            addCriterion("TPAP.USE_YN >", value, "useYn");
            return (Criteria) this;
        }

        public Criteria andUseYnGreaterThanOrEqualTo(String value) {
            addCriterion("TPAP.USE_YN >=", value, "useYn");
            return (Criteria) this;
        }

        public Criteria andUseYnLessThan(String value) {
            addCriterion("TPAP.USE_YN <", value, "useYn");
            return (Criteria) this;
        }

        public Criteria andUseYnLessThanOrEqualTo(String value) {
            addCriterion("TPAP.USE_YN <=", value, "useYn");
            return (Criteria) this;
        }

        public Criteria andUseYnLike(String value) {
            addCriterion("TPAP.USE_YN like", value, "useYn");
            return (Criteria) this;
        }

        public Criteria andUseYnNotLike(String value) {
            addCriterion("TPAP.USE_YN not like", value, "useYn");
            return (Criteria) this;
        }

        public Criteria andUseYnIn(List<String> values) {
            addCriterion("TPAP.USE_YN in", values, "useYn");
            return (Criteria) this;
        }

        public Criteria andUseYnNotIn(List<String> values) {
            addCriterion("TPAP.USE_YN not in", values, "useYn");
            return (Criteria) this;
        }

        public Criteria andUseYnBetween(String value1, String value2) {
            addCriterion("TPAP.USE_YN between", value1, value2, "useYn");
            return (Criteria) this;
        }

        public Criteria andUseYnNotBetween(String value1, String value2) {
            addCriterion("TPAP.USE_YN not between", value1, value2, "useYn");
            return (Criteria) this;
        }

        public Criteria andPtProcTpCdLikeInsensitive(String value) {
            addCriterion("upper(TPAP.PT_PROC_TP_CD) like", value.toUpperCase(), "ptProcTpCd");
            return (Criteria) this;
        }

        public Criteria andMbrGrdCdLikeInsensitive(String value) {
            addCriterion("upper(TPAP.MBR_GRD_CD) like", value.toUpperCase(), "mbrGrdCd");
            return (Criteria) this;
        }

        public Criteria andPtRsnTpCdLikeInsensitive(String value) {
            addCriterion("upper(TPAP.PT_RSN_TP_CD) like", value.toUpperCase(), "ptRsnTpCd");
            return (Criteria) this;
        }

        public Criteria andPtRsnLikeInsensitive(String value) {
            addCriterion("upper(TPAP.PT_RSN) like", value.toUpperCase(), "ptRsn");
            return (Criteria) this;
        }

        public Criteria andNoteLikeInsensitive(String value) {
            addCriterion("upper(TPAP.NOTE) like", value.toUpperCase(), "note");
            return (Criteria) this;
        }

        public Criteria andRegIdLikeInsensitive(String value) {
            addCriterion("upper(TPAP.REG_ID) like", value.toUpperCase(), "regId");
            return (Criteria) this;
        }

        public Criteria andModIdLikeInsensitive(String value) {
            addCriterion("upper(TPAP.MOD_ID) like", value.toUpperCase(), "modId");
            return (Criteria) this;
        }

        public Criteria andUseYnLikeInsensitive(String value) {
            addCriterion("upper(TPAP.USE_YN) like", value.toUpperCase(), "useYn");
            return (Criteria) this;
        }

        public Criteria andPtProcTpCdLikeLeft(String value) {
            addCriterion("TPAP.PT_PROC_TP_CD like ", "%" + value, "ptProcTpCd");
            return (Criteria) this;
        }

        public Criteria andPtProcTpCdLikeRight(String value) {
            addCriterion("TPAP.PT_PROC_TP_CD like ", value + "%", "ptProcTpCd");
            return (Criteria) this;
        }

        public Criteria andPtProcTpCdLikeBoth(String value) {
            addCriterion("TPAP.PT_PROC_TP_CD like ", "%" + value + "%", "ptProcTpCd");
            return (Criteria) this;
        }

        public Criteria andMbrGrdCdLikeLeft(String value) {
            addCriterion("TPAP.MBR_GRD_CD like ", "%" + value, "mbrGrdCd");
            return (Criteria) this;
        }

        public Criteria andMbrGrdCdLikeRight(String value) {
            addCriterion("TPAP.MBR_GRD_CD like ", value + "%", "mbrGrdCd");
            return (Criteria) this;
        }

        public Criteria andMbrGrdCdLikeBoth(String value) {
            addCriterion("TPAP.MBR_GRD_CD like ", "%" + value + "%", "mbrGrdCd");
            return (Criteria) this;
        }

        public Criteria andPtRsnTpCdLikeLeft(String value) {
            addCriterion("TPAP.PT_RSN_TP_CD like ", "%" + value, "ptRsnTpCd");
            return (Criteria) this;
        }

        public Criteria andPtRsnTpCdLikeRight(String value) {
            addCriterion("TPAP.PT_RSN_TP_CD like ", value + "%", "ptRsnTpCd");
            return (Criteria) this;
        }

        public Criteria andPtRsnTpCdLikeBoth(String value) {
            addCriterion("TPAP.PT_RSN_TP_CD like ", "%" + value + "%", "ptRsnTpCd");
            return (Criteria) this;
        }

        public Criteria andPtRsnLikeLeft(String value) {
            addCriterion("TPAP.PT_RSN like ", "%" + value, "ptRsn");
            return (Criteria) this;
        }

        public Criteria andPtRsnLikeRight(String value) {
            addCriterion("TPAP.PT_RSN like ", value + "%", "ptRsn");
            return (Criteria) this;
        }

        public Criteria andPtRsnLikeBoth(String value) {
            addCriterion("TPAP.PT_RSN like ", "%" + value + "%", "ptRsn");
            return (Criteria) this;
        }

        public Criteria andNoteLikeLeft(String value) {
            addCriterion("TPAP.NOTE like ", "%" + value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteLikeRight(String value) {
            addCriterion("TPAP.NOTE like ", value + "%", "note");
            return (Criteria) this;
        }

        public Criteria andNoteLikeBoth(String value) {
            addCriterion("TPAP.NOTE like ", "%" + value + "%", "note");
            return (Criteria) this;
        }

        public Criteria andRegIdLikeLeft(String value) {
            addCriterion("TPAP.REG_ID like ", "%" + value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdLikeRight(String value) {
            addCriterion("TPAP.REG_ID like ", value + "%", "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdLikeBoth(String value) {
            addCriterion("TPAP.REG_ID like ", "%" + value + "%", "regId");
            return (Criteria) this;
        }

        public Criteria andModIdLikeLeft(String value) {
            addCriterion("TPAP.MOD_ID like ", "%" + value, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdLikeRight(String value) {
            addCriterion("TPAP.MOD_ID like ", value + "%", "modId");
            return (Criteria) this;
        }

        public Criteria andModIdLikeBoth(String value) {
            addCriterion("TPAP.MOD_ID like ", "%" + value + "%", "modId");
            return (Criteria) this;
        }

        public Criteria andUseYnLikeLeft(String value) {
            addCriterion("TPAP.USE_YN like ", "%" + value, "useYn");
            return (Criteria) this;
        }

        public Criteria andUseYnLikeRight(String value) {
            addCriterion("TPAP.USE_YN like ", value + "%", "useYn");
            return (Criteria) this;
        }

        public Criteria andUseYnLikeBoth(String value) {
            addCriterion("TPAP.USE_YN like ", "%" + value + "%", "useYn");
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