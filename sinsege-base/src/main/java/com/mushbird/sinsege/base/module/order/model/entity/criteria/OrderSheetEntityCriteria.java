package com.mushbird.sinsege.base.module.order.model.entity.criteria;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OrderSheetEntityCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    public OrderSheetEntityCriteria() {
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

        public Criteria andOrdIdIsNull() {
            addCriterion("TOS.ORD_ID is null");
            return (Criteria) this;
        }

        public Criteria andOrdIdIsNotNull() {
            addCriterion("TOS.ORD_ID is not null");
            return (Criteria) this;
        }

        public Criteria andOrdIdEqualTo(Integer value) {
            addCriterion("TOS.ORD_ID =", value, "ordId");
            return (Criteria) this;
        }

        public Criteria andOrdIdNotEqualTo(Integer value) {
            addCriterion("TOS.ORD_ID <>", value, "ordId");
            return (Criteria) this;
        }

        public Criteria andOrdIdGreaterThan(Integer value) {
            addCriterion("TOS.ORD_ID >", value, "ordId");
            return (Criteria) this;
        }

        public Criteria andOrdIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("TOS.ORD_ID >=", value, "ordId");
            return (Criteria) this;
        }

        public Criteria andOrdIdLessThan(Integer value) {
            addCriterion("TOS.ORD_ID <", value, "ordId");
            return (Criteria) this;
        }

        public Criteria andOrdIdLessThanOrEqualTo(Integer value) {
            addCriterion("TOS.ORD_ID <=", value, "ordId");
            return (Criteria) this;
        }

        public Criteria andOrdIdIn(List<Integer> values) {
            addCriterion("TOS.ORD_ID in", values, "ordId");
            return (Criteria) this;
        }

        public Criteria andOrdIdNotIn(List<Integer> values) {
            addCriterion("TOS.ORD_ID not in", values, "ordId");
            return (Criteria) this;
        }

        public Criteria andOrdIdBetween(Integer value1, Integer value2) {
            addCriterion("TOS.ORD_ID between", value1, value2, "ordId");
            return (Criteria) this;
        }

        public Criteria andOrdIdNotBetween(Integer value1, Integer value2) {
            addCriterion("TOS.ORD_ID not between", value1, value2, "ordId");
            return (Criteria) this;
        }

        public Criteria andMbrIdIsNull() {
            addCriterion("TOS.MBR_ID is null");
            return (Criteria) this;
        }

        public Criteria andMbrIdIsNotNull() {
            addCriterion("TOS.MBR_ID is not null");
            return (Criteria) this;
        }

        public Criteria andMbrIdEqualTo(String value) {
            addCriterion("TOS.MBR_ID =", value, "mbrId");
            return (Criteria) this;
        }

        public Criteria andMbrIdNotEqualTo(String value) {
            addCriterion("TOS.MBR_ID <>", value, "mbrId");
            return (Criteria) this;
        }

        public Criteria andMbrIdGreaterThan(String value) {
            addCriterion("TOS.MBR_ID >", value, "mbrId");
            return (Criteria) this;
        }

        public Criteria andMbrIdGreaterThanOrEqualTo(String value) {
            addCriterion("TOS.MBR_ID >=", value, "mbrId");
            return (Criteria) this;
        }

        public Criteria andMbrIdLessThan(String value) {
            addCriterion("TOS.MBR_ID <", value, "mbrId");
            return (Criteria) this;
        }

        public Criteria andMbrIdLessThanOrEqualTo(String value) {
            addCriterion("TOS.MBR_ID <=", value, "mbrId");
            return (Criteria) this;
        }

        public Criteria andMbrIdLike(String value) {
            addCriterion("TOS.MBR_ID like", value, "mbrId");
            return (Criteria) this;
        }

        public Criteria andMbrIdNotLike(String value) {
            addCriterion("TOS.MBR_ID not like", value, "mbrId");
            return (Criteria) this;
        }

        public Criteria andMbrIdIn(List<String> values) {
            addCriterion("TOS.MBR_ID in", values, "mbrId");
            return (Criteria) this;
        }

        public Criteria andMbrIdNotIn(List<String> values) {
            addCriterion("TOS.MBR_ID not in", values, "mbrId");
            return (Criteria) this;
        }

        public Criteria andMbrIdBetween(String value1, String value2) {
            addCriterion("TOS.MBR_ID between", value1, value2, "mbrId");
            return (Criteria) this;
        }

        public Criteria andMbrIdNotBetween(String value1, String value2) {
            addCriterion("TOS.MBR_ID not between", value1, value2, "mbrId");
            return (Criteria) this;
        }

        public Criteria andOrdNoIsNull() {
            addCriterion("TOS.ORD_NO is null");
            return (Criteria) this;
        }

        public Criteria andOrdNoIsNotNull() {
            addCriterion("TOS.ORD_NO is not null");
            return (Criteria) this;
        }

        public Criteria andOrdNoEqualTo(String value) {
            addCriterion("TOS.ORD_NO =", value, "ordNo");
            return (Criteria) this;
        }

        public Criteria andOrdNoNotEqualTo(String value) {
            addCriterion("TOS.ORD_NO <>", value, "ordNo");
            return (Criteria) this;
        }

        public Criteria andOrdNoGreaterThan(String value) {
            addCriterion("TOS.ORD_NO >", value, "ordNo");
            return (Criteria) this;
        }

        public Criteria andOrdNoGreaterThanOrEqualTo(String value) {
            addCriterion("TOS.ORD_NO >=", value, "ordNo");
            return (Criteria) this;
        }

        public Criteria andOrdNoLessThan(String value) {
            addCriterion("TOS.ORD_NO <", value, "ordNo");
            return (Criteria) this;
        }

        public Criteria andOrdNoLessThanOrEqualTo(String value) {
            addCriterion("TOS.ORD_NO <=", value, "ordNo");
            return (Criteria) this;
        }

        public Criteria andOrdNoLike(String value) {
            addCriterion("TOS.ORD_NO like", value, "ordNo");
            return (Criteria) this;
        }

        public Criteria andOrdNoNotLike(String value) {
            addCriterion("TOS.ORD_NO not like", value, "ordNo");
            return (Criteria) this;
        }

        public Criteria andOrdNoIn(List<String> values) {
            addCriterion("TOS.ORD_NO in", values, "ordNo");
            return (Criteria) this;
        }

        public Criteria andOrdNoNotIn(List<String> values) {
            addCriterion("TOS.ORD_NO not in", values, "ordNo");
            return (Criteria) this;
        }

        public Criteria andOrdNoBetween(String value1, String value2) {
            addCriterion("TOS.ORD_NO between", value1, value2, "ordNo");
            return (Criteria) this;
        }

        public Criteria andOrdNoNotBetween(String value1, String value2) {
            addCriterion("TOS.ORD_NO not between", value1, value2, "ordNo");
            return (Criteria) this;
        }

        public Criteria andOrdShtContIsNull() {
            addCriterion("TOS.ORD_SHT_CONT is null");
            return (Criteria) this;
        }

        public Criteria andOrdShtContIsNotNull() {
            addCriterion("TOS.ORD_SHT_CONT is not null");
            return (Criteria) this;
        }

        public Criteria andOrdShtContEqualTo(String value) {
            addCriterion("TOS.ORD_SHT_CONT =", value, "ordShtCont");
            return (Criteria) this;
        }

        public Criteria andOrdShtContNotEqualTo(String value) {
            addCriterion("TOS.ORD_SHT_CONT <>", value, "ordShtCont");
            return (Criteria) this;
        }

        public Criteria andOrdShtContGreaterThan(String value) {
            addCriterion("TOS.ORD_SHT_CONT >", value, "ordShtCont");
            return (Criteria) this;
        }

        public Criteria andOrdShtContGreaterThanOrEqualTo(String value) {
            addCriterion("TOS.ORD_SHT_CONT >=", value, "ordShtCont");
            return (Criteria) this;
        }

        public Criteria andOrdShtContLessThan(String value) {
            addCriterion("TOS.ORD_SHT_CONT <", value, "ordShtCont");
            return (Criteria) this;
        }

        public Criteria andOrdShtContLessThanOrEqualTo(String value) {
            addCriterion("TOS.ORD_SHT_CONT <=", value, "ordShtCont");
            return (Criteria) this;
        }

        public Criteria andOrdShtContLike(String value) {
            addCriterion("TOS.ORD_SHT_CONT like", value, "ordShtCont");
            return (Criteria) this;
        }

        public Criteria andOrdShtContNotLike(String value) {
            addCriterion("TOS.ORD_SHT_CONT not like", value, "ordShtCont");
            return (Criteria) this;
        }

        public Criteria andOrdShtContIn(List<String> values) {
            addCriterion("TOS.ORD_SHT_CONT in", values, "ordShtCont");
            return (Criteria) this;
        }

        public Criteria andOrdShtContNotIn(List<String> values) {
            addCriterion("TOS.ORD_SHT_CONT not in", values, "ordShtCont");
            return (Criteria) this;
        }

        public Criteria andOrdShtContBetween(String value1, String value2) {
            addCriterion("TOS.ORD_SHT_CONT between", value1, value2, "ordShtCont");
            return (Criteria) this;
        }

        public Criteria andOrdShtContNotBetween(String value1, String value2) {
            addCriterion("TOS.ORD_SHT_CONT not between", value1, value2, "ordShtCont");
            return (Criteria) this;
        }

        public Criteria andBuyrIpAddrIsNull() {
            addCriterion("TOS.BUYR_IP_ADDR is null");
            return (Criteria) this;
        }

        public Criteria andBuyrIpAddrIsNotNull() {
            addCriterion("TOS.BUYR_IP_ADDR is not null");
            return (Criteria) this;
        }

        public Criteria andBuyrIpAddrEqualTo(String value) {
            addCriterion("TOS.BUYR_IP_ADDR =", value, "buyrIpAddr");
            return (Criteria) this;
        }

        public Criteria andBuyrIpAddrNotEqualTo(String value) {
            addCriterion("TOS.BUYR_IP_ADDR <>", value, "buyrIpAddr");
            return (Criteria) this;
        }

        public Criteria andBuyrIpAddrGreaterThan(String value) {
            addCriterion("TOS.BUYR_IP_ADDR >", value, "buyrIpAddr");
            return (Criteria) this;
        }

        public Criteria andBuyrIpAddrGreaterThanOrEqualTo(String value) {
            addCriterion("TOS.BUYR_IP_ADDR >=", value, "buyrIpAddr");
            return (Criteria) this;
        }

        public Criteria andBuyrIpAddrLessThan(String value) {
            addCriterion("TOS.BUYR_IP_ADDR <", value, "buyrIpAddr");
            return (Criteria) this;
        }

        public Criteria andBuyrIpAddrLessThanOrEqualTo(String value) {
            addCriterion("TOS.BUYR_IP_ADDR <=", value, "buyrIpAddr");
            return (Criteria) this;
        }

        public Criteria andBuyrIpAddrLike(String value) {
            addCriterion("TOS.BUYR_IP_ADDR like", value, "buyrIpAddr");
            return (Criteria) this;
        }

        public Criteria andBuyrIpAddrNotLike(String value) {
            addCriterion("TOS.BUYR_IP_ADDR not like", value, "buyrIpAddr");
            return (Criteria) this;
        }

        public Criteria andBuyrIpAddrIn(List<String> values) {
            addCriterion("TOS.BUYR_IP_ADDR in", values, "buyrIpAddr");
            return (Criteria) this;
        }

        public Criteria andBuyrIpAddrNotIn(List<String> values) {
            addCriterion("TOS.BUYR_IP_ADDR not in", values, "buyrIpAddr");
            return (Criteria) this;
        }

        public Criteria andBuyrIpAddrBetween(String value1, String value2) {
            addCriterion("TOS.BUYR_IP_ADDR between", value1, value2, "buyrIpAddr");
            return (Criteria) this;
        }

        public Criteria andBuyrIpAddrNotBetween(String value1, String value2) {
            addCriterion("TOS.BUYR_IP_ADDR not between", value1, value2, "buyrIpAddr");
            return (Criteria) this;
        }

        public Criteria andOrdRsltCdValIsNull() {
            addCriterion("TOS.ORD_RSLT_CD_VAL is null");
            return (Criteria) this;
        }

        public Criteria andOrdRsltCdValIsNotNull() {
            addCriterion("TOS.ORD_RSLT_CD_VAL is not null");
            return (Criteria) this;
        }

        public Criteria andOrdRsltCdValEqualTo(String value) {
            addCriterion("TOS.ORD_RSLT_CD_VAL =", value, "ordRsltCdVal");
            return (Criteria) this;
        }

        public Criteria andOrdRsltCdValNotEqualTo(String value) {
            addCriterion("TOS.ORD_RSLT_CD_VAL <>", value, "ordRsltCdVal");
            return (Criteria) this;
        }

        public Criteria andOrdRsltCdValGreaterThan(String value) {
            addCriterion("TOS.ORD_RSLT_CD_VAL >", value, "ordRsltCdVal");
            return (Criteria) this;
        }

        public Criteria andOrdRsltCdValGreaterThanOrEqualTo(String value) {
            addCriterion("TOS.ORD_RSLT_CD_VAL >=", value, "ordRsltCdVal");
            return (Criteria) this;
        }

        public Criteria andOrdRsltCdValLessThan(String value) {
            addCriterion("TOS.ORD_RSLT_CD_VAL <", value, "ordRsltCdVal");
            return (Criteria) this;
        }

        public Criteria andOrdRsltCdValLessThanOrEqualTo(String value) {
            addCriterion("TOS.ORD_RSLT_CD_VAL <=", value, "ordRsltCdVal");
            return (Criteria) this;
        }

        public Criteria andOrdRsltCdValLike(String value) {
            addCriterion("TOS.ORD_RSLT_CD_VAL like", value, "ordRsltCdVal");
            return (Criteria) this;
        }

        public Criteria andOrdRsltCdValNotLike(String value) {
            addCriterion("TOS.ORD_RSLT_CD_VAL not like", value, "ordRsltCdVal");
            return (Criteria) this;
        }

        public Criteria andOrdRsltCdValIn(List<String> values) {
            addCriterion("TOS.ORD_RSLT_CD_VAL in", values, "ordRsltCdVal");
            return (Criteria) this;
        }

        public Criteria andOrdRsltCdValNotIn(List<String> values) {
            addCriterion("TOS.ORD_RSLT_CD_VAL not in", values, "ordRsltCdVal");
            return (Criteria) this;
        }

        public Criteria andOrdRsltCdValBetween(String value1, String value2) {
            addCriterion("TOS.ORD_RSLT_CD_VAL between", value1, value2, "ordRsltCdVal");
            return (Criteria) this;
        }

        public Criteria andOrdRsltCdValNotBetween(String value1, String value2) {
            addCriterion("TOS.ORD_RSLT_CD_VAL not between", value1, value2, "ordRsltCdVal");
            return (Criteria) this;
        }

        public Criteria andOrdRsltMsgContIsNull() {
            addCriterion("TOS.ORD_RSLT_MSG_CONT is null");
            return (Criteria) this;
        }

        public Criteria andOrdRsltMsgContIsNotNull() {
            addCriterion("TOS.ORD_RSLT_MSG_CONT is not null");
            return (Criteria) this;
        }

        public Criteria andOrdRsltMsgContEqualTo(String value) {
            addCriterion("TOS.ORD_RSLT_MSG_CONT =", value, "ordRsltMsgCont");
            return (Criteria) this;
        }

        public Criteria andOrdRsltMsgContNotEqualTo(String value) {
            addCriterion("TOS.ORD_RSLT_MSG_CONT <>", value, "ordRsltMsgCont");
            return (Criteria) this;
        }

        public Criteria andOrdRsltMsgContGreaterThan(String value) {
            addCriterion("TOS.ORD_RSLT_MSG_CONT >", value, "ordRsltMsgCont");
            return (Criteria) this;
        }

        public Criteria andOrdRsltMsgContGreaterThanOrEqualTo(String value) {
            addCriterion("TOS.ORD_RSLT_MSG_CONT >=", value, "ordRsltMsgCont");
            return (Criteria) this;
        }

        public Criteria andOrdRsltMsgContLessThan(String value) {
            addCriterion("TOS.ORD_RSLT_MSG_CONT <", value, "ordRsltMsgCont");
            return (Criteria) this;
        }

        public Criteria andOrdRsltMsgContLessThanOrEqualTo(String value) {
            addCriterion("TOS.ORD_RSLT_MSG_CONT <=", value, "ordRsltMsgCont");
            return (Criteria) this;
        }

        public Criteria andOrdRsltMsgContLike(String value) {
            addCriterion("TOS.ORD_RSLT_MSG_CONT like", value, "ordRsltMsgCont");
            return (Criteria) this;
        }

        public Criteria andOrdRsltMsgContNotLike(String value) {
            addCriterion("TOS.ORD_RSLT_MSG_CONT not like", value, "ordRsltMsgCont");
            return (Criteria) this;
        }

        public Criteria andOrdRsltMsgContIn(List<String> values) {
            addCriterion("TOS.ORD_RSLT_MSG_CONT in", values, "ordRsltMsgCont");
            return (Criteria) this;
        }

        public Criteria andOrdRsltMsgContNotIn(List<String> values) {
            addCriterion("TOS.ORD_RSLT_MSG_CONT not in", values, "ordRsltMsgCont");
            return (Criteria) this;
        }

        public Criteria andOrdRsltMsgContBetween(String value1, String value2) {
            addCriterion("TOS.ORD_RSLT_MSG_CONT between", value1, value2, "ordRsltMsgCont");
            return (Criteria) this;
        }

        public Criteria andOrdRsltMsgContNotBetween(String value1, String value2) {
            addCriterion("TOS.ORD_RSLT_MSG_CONT not between", value1, value2, "ordRsltMsgCont");
            return (Criteria) this;
        }

        public Criteria andRegDtIsNull() {
            addCriterion("TOS.REG_DT is null");
            return (Criteria) this;
        }

        public Criteria andRegDtIsNotNull() {
            addCriterion("TOS.REG_DT is not null");
            return (Criteria) this;
        }

        public Criteria andRegDtEqualTo(Date value) {
            addCriterion("TOS.REG_DT =", value, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtNotEqualTo(Date value) {
            addCriterion("TOS.REG_DT <>", value, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtGreaterThan(Date value) {
            addCriterion("TOS.REG_DT >", value, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtGreaterThanOrEqualTo(Date value) {
            addCriterion("TOS.REG_DT >=", value, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtLessThan(Date value) {
            addCriterion("TOS.REG_DT <", value, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtLessThanOrEqualTo(Date value) {
            addCriterion("TOS.REG_DT <=", value, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtIn(List<Date> values) {
            addCriterion("TOS.REG_DT in", values, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtNotIn(List<Date> values) {
            addCriterion("TOS.REG_DT not in", values, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtBetween(Date value1, Date value2) {
            addCriterion("TOS.REG_DT between", value1, value2, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtNotBetween(Date value1, Date value2) {
            addCriterion("TOS.REG_DT not between", value1, value2, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegIdIsNull() {
            addCriterion("TOS.REG_ID is null");
            return (Criteria) this;
        }

        public Criteria andRegIdIsNotNull() {
            addCriterion("TOS.REG_ID is not null");
            return (Criteria) this;
        }

        public Criteria andRegIdEqualTo(String value) {
            addCriterion("TOS.REG_ID =", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdNotEqualTo(String value) {
            addCriterion("TOS.REG_ID <>", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdGreaterThan(String value) {
            addCriterion("TOS.REG_ID >", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdGreaterThanOrEqualTo(String value) {
            addCriterion("TOS.REG_ID >=", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdLessThan(String value) {
            addCriterion("TOS.REG_ID <", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdLessThanOrEqualTo(String value) {
            addCriterion("TOS.REG_ID <=", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdLike(String value) {
            addCriterion("TOS.REG_ID like", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdNotLike(String value) {
            addCriterion("TOS.REG_ID not like", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdIn(List<String> values) {
            addCriterion("TOS.REG_ID in", values, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdNotIn(List<String> values) {
            addCriterion("TOS.REG_ID not in", values, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdBetween(String value1, String value2) {
            addCriterion("TOS.REG_ID between", value1, value2, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdNotBetween(String value1, String value2) {
            addCriterion("TOS.REG_ID not between", value1, value2, "regId");
            return (Criteria) this;
        }

        public Criteria andModDtIsNull() {
            addCriterion("TOS.MOD_DT is null");
            return (Criteria) this;
        }

        public Criteria andModDtIsNotNull() {
            addCriterion("TOS.MOD_DT is not null");
            return (Criteria) this;
        }

        public Criteria andModDtEqualTo(Date value) {
            addCriterion("TOS.MOD_DT =", value, "modDt");
            return (Criteria) this;
        }

        public Criteria andModDtNotEqualTo(Date value) {
            addCriterion("TOS.MOD_DT <>", value, "modDt");
            return (Criteria) this;
        }

        public Criteria andModDtGreaterThan(Date value) {
            addCriterion("TOS.MOD_DT >", value, "modDt");
            return (Criteria) this;
        }

        public Criteria andModDtGreaterThanOrEqualTo(Date value) {
            addCriterion("TOS.MOD_DT >=", value, "modDt");
            return (Criteria) this;
        }

        public Criteria andModDtLessThan(Date value) {
            addCriterion("TOS.MOD_DT <", value, "modDt");
            return (Criteria) this;
        }

        public Criteria andModDtLessThanOrEqualTo(Date value) {
            addCriterion("TOS.MOD_DT <=", value, "modDt");
            return (Criteria) this;
        }

        public Criteria andModDtIn(List<Date> values) {
            addCriterion("TOS.MOD_DT in", values, "modDt");
            return (Criteria) this;
        }

        public Criteria andModDtNotIn(List<Date> values) {
            addCriterion("TOS.MOD_DT not in", values, "modDt");
            return (Criteria) this;
        }

        public Criteria andModDtBetween(Date value1, Date value2) {
            addCriterion("TOS.MOD_DT between", value1, value2, "modDt");
            return (Criteria) this;
        }

        public Criteria andModDtNotBetween(Date value1, Date value2) {
            addCriterion("TOS.MOD_DT not between", value1, value2, "modDt");
            return (Criteria) this;
        }

        public Criteria andModIdIsNull() {
            addCriterion("TOS.MOD_ID is null");
            return (Criteria) this;
        }

        public Criteria andModIdIsNotNull() {
            addCriterion("TOS.MOD_ID is not null");
            return (Criteria) this;
        }

        public Criteria andModIdEqualTo(String value) {
            addCriterion("TOS.MOD_ID =", value, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdNotEqualTo(String value) {
            addCriterion("TOS.MOD_ID <>", value, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdGreaterThan(String value) {
            addCriterion("TOS.MOD_ID >", value, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdGreaterThanOrEqualTo(String value) {
            addCriterion("TOS.MOD_ID >=", value, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdLessThan(String value) {
            addCriterion("TOS.MOD_ID <", value, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdLessThanOrEqualTo(String value) {
            addCriterion("TOS.MOD_ID <=", value, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdLike(String value) {
            addCriterion("TOS.MOD_ID like", value, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdNotLike(String value) {
            addCriterion("TOS.MOD_ID not like", value, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdIn(List<String> values) {
            addCriterion("TOS.MOD_ID in", values, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdNotIn(List<String> values) {
            addCriterion("TOS.MOD_ID not in", values, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdBetween(String value1, String value2) {
            addCriterion("TOS.MOD_ID between", value1, value2, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdNotBetween(String value1, String value2) {
            addCriterion("TOS.MOD_ID not between", value1, value2, "modId");
            return (Criteria) this;
        }

        public Criteria andMbrIdLikeInsensitive(String value) {
            addCriterion("upper(TOS.MBR_ID) like", value.toUpperCase(), "mbrId");
            return (Criteria) this;
        }

        public Criteria andOrdNoLikeInsensitive(String value) {
            addCriterion("upper(TOS.ORD_NO) like", value.toUpperCase(), "ordNo");
            return (Criteria) this;
        }

        public Criteria andOrdShtContLikeInsensitive(String value) {
            addCriterion("upper(TOS.ORD_SHT_CONT) like", value.toUpperCase(), "ordShtCont");
            return (Criteria) this;
        }

        public Criteria andBuyrIpAddrLikeInsensitive(String value) {
            addCriterion("upper(TOS.BUYR_IP_ADDR) like", value.toUpperCase(), "buyrIpAddr");
            return (Criteria) this;
        }

        public Criteria andOrdRsltCdValLikeInsensitive(String value) {
            addCriterion("upper(TOS.ORD_RSLT_CD_VAL) like", value.toUpperCase(), "ordRsltCdVal");
            return (Criteria) this;
        }

        public Criteria andOrdRsltMsgContLikeInsensitive(String value) {
            addCriterion("upper(TOS.ORD_RSLT_MSG_CONT) like", value.toUpperCase(), "ordRsltMsgCont");
            return (Criteria) this;
        }

        public Criteria andRegIdLikeInsensitive(String value) {
            addCriterion("upper(TOS.REG_ID) like", value.toUpperCase(), "regId");
            return (Criteria) this;
        }

        public Criteria andModIdLikeInsensitive(String value) {
            addCriterion("upper(TOS.MOD_ID) like", value.toUpperCase(), "modId");
            return (Criteria) this;
        }

        public Criteria andMbrIdLikeLeft(String value) {
            addCriterion("TOS.MBR_ID like ", "%" + value, "mbrId");
            return (Criteria) this;
        }

        public Criteria andMbrIdLikeRight(String value) {
            addCriterion("TOS.MBR_ID like ", value + "%", "mbrId");
            return (Criteria) this;
        }

        public Criteria andMbrIdLikeBoth(String value) {
            addCriterion("TOS.MBR_ID like ", "%" + value + "%", "mbrId");
            return (Criteria) this;
        }

        public Criteria andOrdNoLikeLeft(String value) {
            addCriterion("TOS.ORD_NO like ", "%" + value, "ordNo");
            return (Criteria) this;
        }

        public Criteria andOrdNoLikeRight(String value) {
            addCriterion("TOS.ORD_NO like ", value + "%", "ordNo");
            return (Criteria) this;
        }

        public Criteria andOrdNoLikeBoth(String value) {
            addCriterion("TOS.ORD_NO like ", "%" + value + "%", "ordNo");
            return (Criteria) this;
        }

        public Criteria andOrdShtContLikeLeft(String value) {
            addCriterion("TOS.ORD_SHT_CONT like ", "%" + value, "ordShtCont");
            return (Criteria) this;
        }

        public Criteria andOrdShtContLikeRight(String value) {
            addCriterion("TOS.ORD_SHT_CONT like ", value + "%", "ordShtCont");
            return (Criteria) this;
        }

        public Criteria andOrdShtContLikeBoth(String value) {
            addCriterion("TOS.ORD_SHT_CONT like ", "%" + value + "%", "ordShtCont");
            return (Criteria) this;
        }

        public Criteria andBuyrIpAddrLikeLeft(String value) {
            addCriterion("TOS.BUYR_IP_ADDR like ", "%" + value, "buyrIpAddr");
            return (Criteria) this;
        }

        public Criteria andBuyrIpAddrLikeRight(String value) {
            addCriterion("TOS.BUYR_IP_ADDR like ", value + "%", "buyrIpAddr");
            return (Criteria) this;
        }

        public Criteria andBuyrIpAddrLikeBoth(String value) {
            addCriterion("TOS.BUYR_IP_ADDR like ", "%" + value + "%", "buyrIpAddr");
            return (Criteria) this;
        }

        public Criteria andOrdRsltCdValLikeLeft(String value) {
            addCriterion("TOS.ORD_RSLT_CD_VAL like ", "%" + value, "ordRsltCdVal");
            return (Criteria) this;
        }

        public Criteria andOrdRsltCdValLikeRight(String value) {
            addCriterion("TOS.ORD_RSLT_CD_VAL like ", value + "%", "ordRsltCdVal");
            return (Criteria) this;
        }

        public Criteria andOrdRsltCdValLikeBoth(String value) {
            addCriterion("TOS.ORD_RSLT_CD_VAL like ", "%" + value + "%", "ordRsltCdVal");
            return (Criteria) this;
        }

        public Criteria andOrdRsltMsgContLikeLeft(String value) {
            addCriterion("TOS.ORD_RSLT_MSG_CONT like ", "%" + value, "ordRsltMsgCont");
            return (Criteria) this;
        }

        public Criteria andOrdRsltMsgContLikeRight(String value) {
            addCriterion("TOS.ORD_RSLT_MSG_CONT like ", value + "%", "ordRsltMsgCont");
            return (Criteria) this;
        }

        public Criteria andOrdRsltMsgContLikeBoth(String value) {
            addCriterion("TOS.ORD_RSLT_MSG_CONT like ", "%" + value + "%", "ordRsltMsgCont");
            return (Criteria) this;
        }

        public Criteria andRegIdLikeLeft(String value) {
            addCriterion("TOS.REG_ID like ", "%" + value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdLikeRight(String value) {
            addCriterion("TOS.REG_ID like ", value + "%", "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdLikeBoth(String value) {
            addCriterion("TOS.REG_ID like ", "%" + value + "%", "regId");
            return (Criteria) this;
        }

        public Criteria andModIdLikeLeft(String value) {
            addCriterion("TOS.MOD_ID like ", "%" + value, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdLikeRight(String value) {
            addCriterion("TOS.MOD_ID like ", value + "%", "modId");
            return (Criteria) this;
        }

        public Criteria andModIdLikeBoth(String value) {
            addCriterion("TOS.MOD_ID like ", "%" + value + "%", "modId");
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