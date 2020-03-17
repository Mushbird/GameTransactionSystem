package com.mushbird.sinsege.base.module.order.model.entity.criteria;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OrderRefundInfoEntityCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    public OrderRefundInfoEntityCriteria() {
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

        public Criteria andOrdRfdInfoIdIsNull() {
            addCriterion("TORI.ORD_RFD_INFO_ID is null");
            return (Criteria) this;
        }

        public Criteria andOrdRfdInfoIdIsNotNull() {
            addCriterion("TORI.ORD_RFD_INFO_ID is not null");
            return (Criteria) this;
        }

        public Criteria andOrdRfdInfoIdEqualTo(Integer value) {
            addCriterion("TORI.ORD_RFD_INFO_ID =", value, "ordRfdInfoId");
            return (Criteria) this;
        }

        public Criteria andOrdRfdInfoIdNotEqualTo(Integer value) {
            addCriterion("TORI.ORD_RFD_INFO_ID <>", value, "ordRfdInfoId");
            return (Criteria) this;
        }

        public Criteria andOrdRfdInfoIdGreaterThan(Integer value) {
            addCriterion("TORI.ORD_RFD_INFO_ID >", value, "ordRfdInfoId");
            return (Criteria) this;
        }

        public Criteria andOrdRfdInfoIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("TORI.ORD_RFD_INFO_ID >=", value, "ordRfdInfoId");
            return (Criteria) this;
        }

        public Criteria andOrdRfdInfoIdLessThan(Integer value) {
            addCriterion("TORI.ORD_RFD_INFO_ID <", value, "ordRfdInfoId");
            return (Criteria) this;
        }

        public Criteria andOrdRfdInfoIdLessThanOrEqualTo(Integer value) {
            addCriterion("TORI.ORD_RFD_INFO_ID <=", value, "ordRfdInfoId");
            return (Criteria) this;
        }

        public Criteria andOrdRfdInfoIdIn(List<Integer> values) {
            addCriterion("TORI.ORD_RFD_INFO_ID in", values, "ordRfdInfoId");
            return (Criteria) this;
        }

        public Criteria andOrdRfdInfoIdNotIn(List<Integer> values) {
            addCriterion("TORI.ORD_RFD_INFO_ID not in", values, "ordRfdInfoId");
            return (Criteria) this;
        }

        public Criteria andOrdRfdInfoIdBetween(Integer value1, Integer value2) {
            addCriterion("TORI.ORD_RFD_INFO_ID between", value1, value2, "ordRfdInfoId");
            return (Criteria) this;
        }

        public Criteria andOrdRfdInfoIdNotBetween(Integer value1, Integer value2) {
            addCriterion("TORI.ORD_RFD_INFO_ID not between", value1, value2, "ordRfdInfoId");
            return (Criteria) this;
        }

        public Criteria andOrdIdIsNull() {
            addCriterion("TORI.ORD_ID is null");
            return (Criteria) this;
        }

        public Criteria andOrdIdIsNotNull() {
            addCriterion("TORI.ORD_ID is not null");
            return (Criteria) this;
        }

        public Criteria andOrdIdEqualTo(Integer value) {
            addCriterion("TORI.ORD_ID =", value, "ordId");
            return (Criteria) this;
        }

        public Criteria andOrdIdNotEqualTo(Integer value) {
            addCriterion("TORI.ORD_ID <>", value, "ordId");
            return (Criteria) this;
        }

        public Criteria andOrdIdGreaterThan(Integer value) {
            addCriterion("TORI.ORD_ID >", value, "ordId");
            return (Criteria) this;
        }

        public Criteria andOrdIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("TORI.ORD_ID >=", value, "ordId");
            return (Criteria) this;
        }

        public Criteria andOrdIdLessThan(Integer value) {
            addCriterion("TORI.ORD_ID <", value, "ordId");
            return (Criteria) this;
        }

        public Criteria andOrdIdLessThanOrEqualTo(Integer value) {
            addCriterion("TORI.ORD_ID <=", value, "ordId");
            return (Criteria) this;
        }

        public Criteria andOrdIdIn(List<Integer> values) {
            addCriterion("TORI.ORD_ID in", values, "ordId");
            return (Criteria) this;
        }

        public Criteria andOrdIdNotIn(List<Integer> values) {
            addCriterion("TORI.ORD_ID not in", values, "ordId");
            return (Criteria) this;
        }

        public Criteria andOrdIdBetween(Integer value1, Integer value2) {
            addCriterion("TORI.ORD_ID between", value1, value2, "ordId");
            return (Criteria) this;
        }

        public Criteria andOrdIdNotBetween(Integer value1, Integer value2) {
            addCriterion("TORI.ORD_ID not between", value1, value2, "ordId");
            return (Criteria) this;
        }

        public Criteria andOrdClmIdIsNull() {
            addCriterion("TORI.ORD_CLM_ID is null");
            return (Criteria) this;
        }

        public Criteria andOrdClmIdIsNotNull() {
            addCriterion("TORI.ORD_CLM_ID is not null");
            return (Criteria) this;
        }

        public Criteria andOrdClmIdEqualTo(Integer value) {
            addCriterion("TORI.ORD_CLM_ID =", value, "ordClmId");
            return (Criteria) this;
        }

        public Criteria andOrdClmIdNotEqualTo(Integer value) {
            addCriterion("TORI.ORD_CLM_ID <>", value, "ordClmId");
            return (Criteria) this;
        }

        public Criteria andOrdClmIdGreaterThan(Integer value) {
            addCriterion("TORI.ORD_CLM_ID >", value, "ordClmId");
            return (Criteria) this;
        }

        public Criteria andOrdClmIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("TORI.ORD_CLM_ID >=", value, "ordClmId");
            return (Criteria) this;
        }

        public Criteria andOrdClmIdLessThan(Integer value) {
            addCriterion("TORI.ORD_CLM_ID <", value, "ordClmId");
            return (Criteria) this;
        }

        public Criteria andOrdClmIdLessThanOrEqualTo(Integer value) {
            addCriterion("TORI.ORD_CLM_ID <=", value, "ordClmId");
            return (Criteria) this;
        }

        public Criteria andOrdClmIdIn(List<Integer> values) {
            addCriterion("TORI.ORD_CLM_ID in", values, "ordClmId");
            return (Criteria) this;
        }

        public Criteria andOrdClmIdNotIn(List<Integer> values) {
            addCriterion("TORI.ORD_CLM_ID not in", values, "ordClmId");
            return (Criteria) this;
        }

        public Criteria andOrdClmIdBetween(Integer value1, Integer value2) {
            addCriterion("TORI.ORD_CLM_ID between", value1, value2, "ordClmId");
            return (Criteria) this;
        }

        public Criteria andOrdClmIdNotBetween(Integer value1, Integer value2) {
            addCriterion("TORI.ORD_CLM_ID not between", value1, value2, "ordClmId");
            return (Criteria) this;
        }

        public Criteria andRfdBankCdIsNull() {
            addCriterion("TORI.RFD_BANK_CD is null");
            return (Criteria) this;
        }

        public Criteria andRfdBankCdIsNotNull() {
            addCriterion("TORI.RFD_BANK_CD is not null");
            return (Criteria) this;
        }

        public Criteria andRfdBankCdEqualTo(String value) {
            addCriterion("TORI.RFD_BANK_CD =", value, "rfdBankCd");
            return (Criteria) this;
        }

        public Criteria andRfdBankCdNotEqualTo(String value) {
            addCriterion("TORI.RFD_BANK_CD <>", value, "rfdBankCd");
            return (Criteria) this;
        }

        public Criteria andRfdBankCdGreaterThan(String value) {
            addCriterion("TORI.RFD_BANK_CD >", value, "rfdBankCd");
            return (Criteria) this;
        }

        public Criteria andRfdBankCdGreaterThanOrEqualTo(String value) {
            addCriterion("TORI.RFD_BANK_CD >=", value, "rfdBankCd");
            return (Criteria) this;
        }

        public Criteria andRfdBankCdLessThan(String value) {
            addCriterion("TORI.RFD_BANK_CD <", value, "rfdBankCd");
            return (Criteria) this;
        }

        public Criteria andRfdBankCdLessThanOrEqualTo(String value) {
            addCriterion("TORI.RFD_BANK_CD <=", value, "rfdBankCd");
            return (Criteria) this;
        }

        public Criteria andRfdBankCdLike(String value) {
            addCriterion("TORI.RFD_BANK_CD like", value, "rfdBankCd");
            return (Criteria) this;
        }

        public Criteria andRfdBankCdNotLike(String value) {
            addCriterion("TORI.RFD_BANK_CD not like", value, "rfdBankCd");
            return (Criteria) this;
        }

        public Criteria andRfdBankCdIn(List<String> values) {
            addCriterion("TORI.RFD_BANK_CD in", values, "rfdBankCd");
            return (Criteria) this;
        }

        public Criteria andRfdBankCdNotIn(List<String> values) {
            addCriterion("TORI.RFD_BANK_CD not in", values, "rfdBankCd");
            return (Criteria) this;
        }

        public Criteria andRfdBankCdBetween(String value1, String value2) {
            addCriterion("TORI.RFD_BANK_CD between", value1, value2, "rfdBankCd");
            return (Criteria) this;
        }

        public Criteria andRfdBankCdNotBetween(String value1, String value2) {
            addCriterion("TORI.RFD_BANK_CD not between", value1, value2, "rfdBankCd");
            return (Criteria) this;
        }

        public Criteria andRfdBankNmIsNull() {
            addCriterion("TORI.RFD_BANK_NM is null");
            return (Criteria) this;
        }

        public Criteria andRfdBankNmIsNotNull() {
            addCriterion("TORI.RFD_BANK_NM is not null");
            return (Criteria) this;
        }

        public Criteria andRfdBankNmEqualTo(String value) {
            addCriterion("TORI.RFD_BANK_NM =", value, "rfdBankNm");
            return (Criteria) this;
        }

        public Criteria andRfdBankNmNotEqualTo(String value) {
            addCriterion("TORI.RFD_BANK_NM <>", value, "rfdBankNm");
            return (Criteria) this;
        }

        public Criteria andRfdBankNmGreaterThan(String value) {
            addCriterion("TORI.RFD_BANK_NM >", value, "rfdBankNm");
            return (Criteria) this;
        }

        public Criteria andRfdBankNmGreaterThanOrEqualTo(String value) {
            addCriterion("TORI.RFD_BANK_NM >=", value, "rfdBankNm");
            return (Criteria) this;
        }

        public Criteria andRfdBankNmLessThan(String value) {
            addCriterion("TORI.RFD_BANK_NM <", value, "rfdBankNm");
            return (Criteria) this;
        }

        public Criteria andRfdBankNmLessThanOrEqualTo(String value) {
            addCriterion("TORI.RFD_BANK_NM <=", value, "rfdBankNm");
            return (Criteria) this;
        }

        public Criteria andRfdBankNmLike(String value) {
            addCriterion("TORI.RFD_BANK_NM like", value, "rfdBankNm");
            return (Criteria) this;
        }

        public Criteria andRfdBankNmNotLike(String value) {
            addCriterion("TORI.RFD_BANK_NM not like", value, "rfdBankNm");
            return (Criteria) this;
        }

        public Criteria andRfdBankNmIn(List<String> values) {
            addCriterion("TORI.RFD_BANK_NM in", values, "rfdBankNm");
            return (Criteria) this;
        }

        public Criteria andRfdBankNmNotIn(List<String> values) {
            addCriterion("TORI.RFD_BANK_NM not in", values, "rfdBankNm");
            return (Criteria) this;
        }

        public Criteria andRfdBankNmBetween(String value1, String value2) {
            addCriterion("TORI.RFD_BANK_NM between", value1, value2, "rfdBankNm");
            return (Criteria) this;
        }

        public Criteria andRfdBankNmNotBetween(String value1, String value2) {
            addCriterion("TORI.RFD_BANK_NM not between", value1, value2, "rfdBankNm");
            return (Criteria) this;
        }

        public Criteria andRfdAcctNoIsNull() {
            addCriterion("TORI.RFD_ACCT_NO is null");
            return (Criteria) this;
        }

        public Criteria andRfdAcctNoIsNotNull() {
            addCriterion("TORI.RFD_ACCT_NO is not null");
            return (Criteria) this;
        }

        public Criteria andRfdAcctNoEqualTo(String value) {
            addCriterion("TORI.RFD_ACCT_NO =", value, "rfdAcctNo");
            return (Criteria) this;
        }

        public Criteria andRfdAcctNoNotEqualTo(String value) {
            addCriterion("TORI.RFD_ACCT_NO <>", value, "rfdAcctNo");
            return (Criteria) this;
        }

        public Criteria andRfdAcctNoGreaterThan(String value) {
            addCriterion("TORI.RFD_ACCT_NO >", value, "rfdAcctNo");
            return (Criteria) this;
        }

        public Criteria andRfdAcctNoGreaterThanOrEqualTo(String value) {
            addCriterion("TORI.RFD_ACCT_NO >=", value, "rfdAcctNo");
            return (Criteria) this;
        }

        public Criteria andRfdAcctNoLessThan(String value) {
            addCriterion("TORI.RFD_ACCT_NO <", value, "rfdAcctNo");
            return (Criteria) this;
        }

        public Criteria andRfdAcctNoLessThanOrEqualTo(String value) {
            addCriterion("TORI.RFD_ACCT_NO <=", value, "rfdAcctNo");
            return (Criteria) this;
        }

        public Criteria andRfdAcctNoLike(String value) {
            addCriterion("TORI.RFD_ACCT_NO like", value, "rfdAcctNo");
            return (Criteria) this;
        }

        public Criteria andRfdAcctNoNotLike(String value) {
            addCriterion("TORI.RFD_ACCT_NO not like", value, "rfdAcctNo");
            return (Criteria) this;
        }

        public Criteria andRfdAcctNoIn(List<String> values) {
            addCriterion("TORI.RFD_ACCT_NO in", values, "rfdAcctNo");
            return (Criteria) this;
        }

        public Criteria andRfdAcctNoNotIn(List<String> values) {
            addCriterion("TORI.RFD_ACCT_NO not in", values, "rfdAcctNo");
            return (Criteria) this;
        }

        public Criteria andRfdAcctNoBetween(String value1, String value2) {
            addCriterion("TORI.RFD_ACCT_NO between", value1, value2, "rfdAcctNo");
            return (Criteria) this;
        }

        public Criteria andRfdAcctNoNotBetween(String value1, String value2) {
            addCriterion("TORI.RFD_ACCT_NO not between", value1, value2, "rfdAcctNo");
            return (Criteria) this;
        }

        public Criteria andRfdAcctDptrNmIsNull() {
            addCriterion("TORI.RFD_ACCT_DPTR_NM is null");
            return (Criteria) this;
        }

        public Criteria andRfdAcctDptrNmIsNotNull() {
            addCriterion("TORI.RFD_ACCT_DPTR_NM is not null");
            return (Criteria) this;
        }

        public Criteria andRfdAcctDptrNmEqualTo(String value) {
            addCriterion("TORI.RFD_ACCT_DPTR_NM =", value, "rfdAcctDptrNm");
            return (Criteria) this;
        }

        public Criteria andRfdAcctDptrNmNotEqualTo(String value) {
            addCriterion("TORI.RFD_ACCT_DPTR_NM <>", value, "rfdAcctDptrNm");
            return (Criteria) this;
        }

        public Criteria andRfdAcctDptrNmGreaterThan(String value) {
            addCriterion("TORI.RFD_ACCT_DPTR_NM >", value, "rfdAcctDptrNm");
            return (Criteria) this;
        }

        public Criteria andRfdAcctDptrNmGreaterThanOrEqualTo(String value) {
            addCriterion("TORI.RFD_ACCT_DPTR_NM >=", value, "rfdAcctDptrNm");
            return (Criteria) this;
        }

        public Criteria andRfdAcctDptrNmLessThan(String value) {
            addCriterion("TORI.RFD_ACCT_DPTR_NM <", value, "rfdAcctDptrNm");
            return (Criteria) this;
        }

        public Criteria andRfdAcctDptrNmLessThanOrEqualTo(String value) {
            addCriterion("TORI.RFD_ACCT_DPTR_NM <=", value, "rfdAcctDptrNm");
            return (Criteria) this;
        }

        public Criteria andRfdAcctDptrNmLike(String value) {
            addCriterion("TORI.RFD_ACCT_DPTR_NM like", value, "rfdAcctDptrNm");
            return (Criteria) this;
        }

        public Criteria andRfdAcctDptrNmNotLike(String value) {
            addCriterion("TORI.RFD_ACCT_DPTR_NM not like", value, "rfdAcctDptrNm");
            return (Criteria) this;
        }

        public Criteria andRfdAcctDptrNmIn(List<String> values) {
            addCriterion("TORI.RFD_ACCT_DPTR_NM in", values, "rfdAcctDptrNm");
            return (Criteria) this;
        }

        public Criteria andRfdAcctDptrNmNotIn(List<String> values) {
            addCriterion("TORI.RFD_ACCT_DPTR_NM not in", values, "rfdAcctDptrNm");
            return (Criteria) this;
        }

        public Criteria andRfdAcctDptrNmBetween(String value1, String value2) {
            addCriterion("TORI.RFD_ACCT_DPTR_NM between", value1, value2, "rfdAcctDptrNm");
            return (Criteria) this;
        }

        public Criteria andRfdAcctDptrNmNotBetween(String value1, String value2) {
            addCriterion("TORI.RFD_ACCT_DPTR_NM not between", value1, value2, "rfdAcctDptrNm");
            return (Criteria) this;
        }

        public Criteria andMemoContIsNull() {
            addCriterion("TORI.MEMO_CONT is null");
            return (Criteria) this;
        }

        public Criteria andMemoContIsNotNull() {
            addCriterion("TORI.MEMO_CONT is not null");
            return (Criteria) this;
        }

        public Criteria andMemoContEqualTo(String value) {
            addCriterion("TORI.MEMO_CONT =", value, "memoCont");
            return (Criteria) this;
        }

        public Criteria andMemoContNotEqualTo(String value) {
            addCriterion("TORI.MEMO_CONT <>", value, "memoCont");
            return (Criteria) this;
        }

        public Criteria andMemoContGreaterThan(String value) {
            addCriterion("TORI.MEMO_CONT >", value, "memoCont");
            return (Criteria) this;
        }

        public Criteria andMemoContGreaterThanOrEqualTo(String value) {
            addCriterion("TORI.MEMO_CONT >=", value, "memoCont");
            return (Criteria) this;
        }

        public Criteria andMemoContLessThan(String value) {
            addCriterion("TORI.MEMO_CONT <", value, "memoCont");
            return (Criteria) this;
        }

        public Criteria andMemoContLessThanOrEqualTo(String value) {
            addCriterion("TORI.MEMO_CONT <=", value, "memoCont");
            return (Criteria) this;
        }

        public Criteria andMemoContLike(String value) {
            addCriterion("TORI.MEMO_CONT like", value, "memoCont");
            return (Criteria) this;
        }

        public Criteria andMemoContNotLike(String value) {
            addCriterion("TORI.MEMO_CONT not like", value, "memoCont");
            return (Criteria) this;
        }

        public Criteria andMemoContIn(List<String> values) {
            addCriterion("TORI.MEMO_CONT in", values, "memoCont");
            return (Criteria) this;
        }

        public Criteria andMemoContNotIn(List<String> values) {
            addCriterion("TORI.MEMO_CONT not in", values, "memoCont");
            return (Criteria) this;
        }

        public Criteria andMemoContBetween(String value1, String value2) {
            addCriterion("TORI.MEMO_CONT between", value1, value2, "memoCont");
            return (Criteria) this;
        }

        public Criteria andMemoContNotBetween(String value1, String value2) {
            addCriterion("TORI.MEMO_CONT not between", value1, value2, "memoCont");
            return (Criteria) this;
        }

        public Criteria andRegDtIsNull() {
            addCriterion("TORI.REG_DT is null");
            return (Criteria) this;
        }

        public Criteria andRegDtIsNotNull() {
            addCriterion("TORI.REG_DT is not null");
            return (Criteria) this;
        }

        public Criteria andRegDtEqualTo(Date value) {
            addCriterion("TORI.REG_DT =", value, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtNotEqualTo(Date value) {
            addCriterion("TORI.REG_DT <>", value, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtGreaterThan(Date value) {
            addCriterion("TORI.REG_DT >", value, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtGreaterThanOrEqualTo(Date value) {
            addCriterion("TORI.REG_DT >=", value, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtLessThan(Date value) {
            addCriterion("TORI.REG_DT <", value, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtLessThanOrEqualTo(Date value) {
            addCriterion("TORI.REG_DT <=", value, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtIn(List<Date> values) {
            addCriterion("TORI.REG_DT in", values, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtNotIn(List<Date> values) {
            addCriterion("TORI.REG_DT not in", values, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtBetween(Date value1, Date value2) {
            addCriterion("TORI.REG_DT between", value1, value2, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtNotBetween(Date value1, Date value2) {
            addCriterion("TORI.REG_DT not between", value1, value2, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegIdIsNull() {
            addCriterion("TORI.REG_ID is null");
            return (Criteria) this;
        }

        public Criteria andRegIdIsNotNull() {
            addCriterion("TORI.REG_ID is not null");
            return (Criteria) this;
        }

        public Criteria andRegIdEqualTo(String value) {
            addCriterion("TORI.REG_ID =", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdNotEqualTo(String value) {
            addCriterion("TORI.REG_ID <>", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdGreaterThan(String value) {
            addCriterion("TORI.REG_ID >", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdGreaterThanOrEqualTo(String value) {
            addCriterion("TORI.REG_ID >=", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdLessThan(String value) {
            addCriterion("TORI.REG_ID <", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdLessThanOrEqualTo(String value) {
            addCriterion("TORI.REG_ID <=", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdLike(String value) {
            addCriterion("TORI.REG_ID like", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdNotLike(String value) {
            addCriterion("TORI.REG_ID not like", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdIn(List<String> values) {
            addCriterion("TORI.REG_ID in", values, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdNotIn(List<String> values) {
            addCriterion("TORI.REG_ID not in", values, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdBetween(String value1, String value2) {
            addCriterion("TORI.REG_ID between", value1, value2, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdNotBetween(String value1, String value2) {
            addCriterion("TORI.REG_ID not between", value1, value2, "regId");
            return (Criteria) this;
        }

        public Criteria andUseYnIsNull() {
            addCriterion("TORI.USE_YN is null");
            return (Criteria) this;
        }

        public Criteria andUseYnIsNotNull() {
            addCriterion("TORI.USE_YN is not null");
            return (Criteria) this;
        }

        public Criteria andUseYnEqualTo(String value) {
            addCriterion("TORI.USE_YN =", value, "useYn");
            return (Criteria) this;
        }

        public Criteria andUseYnNotEqualTo(String value) {
            addCriterion("TORI.USE_YN <>", value, "useYn");
            return (Criteria) this;
        }

        public Criteria andUseYnGreaterThan(String value) {
            addCriterion("TORI.USE_YN >", value, "useYn");
            return (Criteria) this;
        }

        public Criteria andUseYnGreaterThanOrEqualTo(String value) {
            addCriterion("TORI.USE_YN >=", value, "useYn");
            return (Criteria) this;
        }

        public Criteria andUseYnLessThan(String value) {
            addCriterion("TORI.USE_YN <", value, "useYn");
            return (Criteria) this;
        }

        public Criteria andUseYnLessThanOrEqualTo(String value) {
            addCriterion("TORI.USE_YN <=", value, "useYn");
            return (Criteria) this;
        }

        public Criteria andUseYnLike(String value) {
            addCriterion("TORI.USE_YN like", value, "useYn");
            return (Criteria) this;
        }

        public Criteria andUseYnNotLike(String value) {
            addCriterion("TORI.USE_YN not like", value, "useYn");
            return (Criteria) this;
        }

        public Criteria andUseYnIn(List<String> values) {
            addCriterion("TORI.USE_YN in", values, "useYn");
            return (Criteria) this;
        }

        public Criteria andUseYnNotIn(List<String> values) {
            addCriterion("TORI.USE_YN not in", values, "useYn");
            return (Criteria) this;
        }

        public Criteria andUseYnBetween(String value1, String value2) {
            addCriterion("TORI.USE_YN between", value1, value2, "useYn");
            return (Criteria) this;
        }

        public Criteria andUseYnNotBetween(String value1, String value2) {
            addCriterion("TORI.USE_YN not between", value1, value2, "useYn");
            return (Criteria) this;
        }

        public Criteria andRfdBankCdLikeInsensitive(String value) {
            addCriterion("upper(TORI.RFD_BANK_CD) like", value.toUpperCase(), "rfdBankCd");
            return (Criteria) this;
        }

        public Criteria andRfdBankNmLikeInsensitive(String value) {
            addCriterion("upper(TORI.RFD_BANK_NM) like", value.toUpperCase(), "rfdBankNm");
            return (Criteria) this;
        }

        public Criteria andRfdAcctNoLikeInsensitive(String value) {
            addCriterion("upper(TORI.RFD_ACCT_NO) like", value.toUpperCase(), "rfdAcctNo");
            return (Criteria) this;
        }

        public Criteria andRfdAcctDptrNmLikeInsensitive(String value) {
            addCriterion("upper(TORI.RFD_ACCT_DPTR_NM) like", value.toUpperCase(), "rfdAcctDptrNm");
            return (Criteria) this;
        }

        public Criteria andMemoContLikeInsensitive(String value) {
            addCriterion("upper(TORI.MEMO_CONT) like", value.toUpperCase(), "memoCont");
            return (Criteria) this;
        }

        public Criteria andRegIdLikeInsensitive(String value) {
            addCriterion("upper(TORI.REG_ID) like", value.toUpperCase(), "regId");
            return (Criteria) this;
        }

        public Criteria andUseYnLikeInsensitive(String value) {
            addCriterion("upper(TORI.USE_YN) like", value.toUpperCase(), "useYn");
            return (Criteria) this;
        }

        public Criteria andRfdBankCdLikeLeft(String value) {
            addCriterion("TORI.RFD_BANK_CD like ", "%" + value, "rfdBankCd");
            return (Criteria) this;
        }

        public Criteria andRfdBankCdLikeRight(String value) {
            addCriterion("TORI.RFD_BANK_CD like ", value + "%", "rfdBankCd");
            return (Criteria) this;
        }

        public Criteria andRfdBankCdLikeBoth(String value) {
            addCriterion("TORI.RFD_BANK_CD like ", "%" + value + "%", "rfdBankCd");
            return (Criteria) this;
        }

        public Criteria andRfdBankNmLikeLeft(String value) {
            addCriterion("TORI.RFD_BANK_NM like ", "%" + value, "rfdBankNm");
            return (Criteria) this;
        }

        public Criteria andRfdBankNmLikeRight(String value) {
            addCriterion("TORI.RFD_BANK_NM like ", value + "%", "rfdBankNm");
            return (Criteria) this;
        }

        public Criteria andRfdBankNmLikeBoth(String value) {
            addCriterion("TORI.RFD_BANK_NM like ", "%" + value + "%", "rfdBankNm");
            return (Criteria) this;
        }

        public Criteria andRfdAcctNoLikeLeft(String value) {
            addCriterion("TORI.RFD_ACCT_NO like ", "%" + value, "rfdAcctNo");
            return (Criteria) this;
        }

        public Criteria andRfdAcctNoLikeRight(String value) {
            addCriterion("TORI.RFD_ACCT_NO like ", value + "%", "rfdAcctNo");
            return (Criteria) this;
        }

        public Criteria andRfdAcctNoLikeBoth(String value) {
            addCriterion("TORI.RFD_ACCT_NO like ", "%" + value + "%", "rfdAcctNo");
            return (Criteria) this;
        }

        public Criteria andRfdAcctDptrNmLikeLeft(String value) {
            addCriterion("TORI.RFD_ACCT_DPTR_NM like ", "%" + value, "rfdAcctDptrNm");
            return (Criteria) this;
        }

        public Criteria andRfdAcctDptrNmLikeRight(String value) {
            addCriterion("TORI.RFD_ACCT_DPTR_NM like ", value + "%", "rfdAcctDptrNm");
            return (Criteria) this;
        }

        public Criteria andRfdAcctDptrNmLikeBoth(String value) {
            addCriterion("TORI.RFD_ACCT_DPTR_NM like ", "%" + value + "%", "rfdAcctDptrNm");
            return (Criteria) this;
        }

        public Criteria andMemoContLikeLeft(String value) {
            addCriterion("TORI.MEMO_CONT like ", "%" + value, "memoCont");
            return (Criteria) this;
        }

        public Criteria andMemoContLikeRight(String value) {
            addCriterion("TORI.MEMO_CONT like ", value + "%", "memoCont");
            return (Criteria) this;
        }

        public Criteria andMemoContLikeBoth(String value) {
            addCriterion("TORI.MEMO_CONT like ", "%" + value + "%", "memoCont");
            return (Criteria) this;
        }

        public Criteria andRegIdLikeLeft(String value) {
            addCriterion("TORI.REG_ID like ", "%" + value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdLikeRight(String value) {
            addCriterion("TORI.REG_ID like ", value + "%", "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdLikeBoth(String value) {
            addCriterion("TORI.REG_ID like ", "%" + value + "%", "regId");
            return (Criteria) this;
        }

        public Criteria andUseYnLikeLeft(String value) {
            addCriterion("TORI.USE_YN like ", "%" + value, "useYn");
            return (Criteria) this;
        }

        public Criteria andUseYnLikeRight(String value) {
            addCriterion("TORI.USE_YN like ", value + "%", "useYn");
            return (Criteria) this;
        }

        public Criteria andUseYnLikeBoth(String value) {
            addCriterion("TORI.USE_YN like ", "%" + value + "%", "useYn");
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