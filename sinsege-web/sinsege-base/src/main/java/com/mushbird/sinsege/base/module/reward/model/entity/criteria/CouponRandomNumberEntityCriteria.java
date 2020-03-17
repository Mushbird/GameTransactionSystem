package com.mushbird.sinsege.base.module.reward.model.entity.criteria;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CouponRandomNumberEntityCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    public CouponRandomNumberEntityCriteria() {
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

        public Criteria andCpnRdnbIdIsNull() {
            addCriterion("TCRN.CPN_RDNB_ID is null");
            return (Criteria) this;
        }

        public Criteria andCpnRdnbIdIsNotNull() {
            addCriterion("TCRN.CPN_RDNB_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCpnRdnbIdEqualTo(Integer value) {
            addCriterion("TCRN.CPN_RDNB_ID =", value, "cpnRdnbId");
            return (Criteria) this;
        }

        public Criteria andCpnRdnbIdNotEqualTo(Integer value) {
            addCriterion("TCRN.CPN_RDNB_ID <>", value, "cpnRdnbId");
            return (Criteria) this;
        }

        public Criteria andCpnRdnbIdGreaterThan(Integer value) {
            addCriterion("TCRN.CPN_RDNB_ID >", value, "cpnRdnbId");
            return (Criteria) this;
        }

        public Criteria andCpnRdnbIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("TCRN.CPN_RDNB_ID >=", value, "cpnRdnbId");
            return (Criteria) this;
        }

        public Criteria andCpnRdnbIdLessThan(Integer value) {
            addCriterion("TCRN.CPN_RDNB_ID <", value, "cpnRdnbId");
            return (Criteria) this;
        }

        public Criteria andCpnRdnbIdLessThanOrEqualTo(Integer value) {
            addCriterion("TCRN.CPN_RDNB_ID <=", value, "cpnRdnbId");
            return (Criteria) this;
        }

        public Criteria andCpnRdnbIdIn(List<Integer> values) {
            addCriterion("TCRN.CPN_RDNB_ID in", values, "cpnRdnbId");
            return (Criteria) this;
        }

        public Criteria andCpnRdnbIdNotIn(List<Integer> values) {
            addCriterion("TCRN.CPN_RDNB_ID not in", values, "cpnRdnbId");
            return (Criteria) this;
        }

        public Criteria andCpnRdnbIdBetween(Integer value1, Integer value2) {
            addCriterion("TCRN.CPN_RDNB_ID between", value1, value2, "cpnRdnbId");
            return (Criteria) this;
        }

        public Criteria andCpnRdnbIdNotBetween(Integer value1, Integer value2) {
            addCriterion("TCRN.CPN_RDNB_ID not between", value1, value2, "cpnRdnbId");
            return (Criteria) this;
        }

        public Criteria andCpnIdIsNull() {
            addCriterion("TCRN.CPN_ID is null");
            return (Criteria) this;
        }

        public Criteria andCpnIdIsNotNull() {
            addCriterion("TCRN.CPN_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCpnIdEqualTo(Integer value) {
            addCriterion("TCRN.CPN_ID =", value, "cpnId");
            return (Criteria) this;
        }

        public Criteria andCpnIdNotEqualTo(Integer value) {
            addCriterion("TCRN.CPN_ID <>", value, "cpnId");
            return (Criteria) this;
        }

        public Criteria andCpnIdGreaterThan(Integer value) {
            addCriterion("TCRN.CPN_ID >", value, "cpnId");
            return (Criteria) this;
        }

        public Criteria andCpnIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("TCRN.CPN_ID >=", value, "cpnId");
            return (Criteria) this;
        }

        public Criteria andCpnIdLessThan(Integer value) {
            addCriterion("TCRN.CPN_ID <", value, "cpnId");
            return (Criteria) this;
        }

        public Criteria andCpnIdLessThanOrEqualTo(Integer value) {
            addCriterion("TCRN.CPN_ID <=", value, "cpnId");
            return (Criteria) this;
        }

        public Criteria andCpnIdIn(List<Integer> values) {
            addCriterion("TCRN.CPN_ID in", values, "cpnId");
            return (Criteria) this;
        }

        public Criteria andCpnIdNotIn(List<Integer> values) {
            addCriterion("TCRN.CPN_ID not in", values, "cpnId");
            return (Criteria) this;
        }

        public Criteria andCpnIdBetween(Integer value1, Integer value2) {
            addCriterion("TCRN.CPN_ID between", value1, value2, "cpnId");
            return (Criteria) this;
        }

        public Criteria andCpnIdNotBetween(Integer value1, Integer value2) {
            addCriterion("TCRN.CPN_ID not between", value1, value2, "cpnId");
            return (Criteria) this;
        }

        public Criteria andMbrCpnIdIsNull() {
            addCriterion("TCRN.MBR_CPN_ID is null");
            return (Criteria) this;
        }

        public Criteria andMbrCpnIdIsNotNull() {
            addCriterion("TCRN.MBR_CPN_ID is not null");
            return (Criteria) this;
        }

        public Criteria andMbrCpnIdEqualTo(Integer value) {
            addCriterion("TCRN.MBR_CPN_ID =", value, "mbrCpnId");
            return (Criteria) this;
        }

        public Criteria andMbrCpnIdNotEqualTo(Integer value) {
            addCriterion("TCRN.MBR_CPN_ID <>", value, "mbrCpnId");
            return (Criteria) this;
        }

        public Criteria andMbrCpnIdGreaterThan(Integer value) {
            addCriterion("TCRN.MBR_CPN_ID >", value, "mbrCpnId");
            return (Criteria) this;
        }

        public Criteria andMbrCpnIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("TCRN.MBR_CPN_ID >=", value, "mbrCpnId");
            return (Criteria) this;
        }

        public Criteria andMbrCpnIdLessThan(Integer value) {
            addCriterion("TCRN.MBR_CPN_ID <", value, "mbrCpnId");
            return (Criteria) this;
        }

        public Criteria andMbrCpnIdLessThanOrEqualTo(Integer value) {
            addCriterion("TCRN.MBR_CPN_ID <=", value, "mbrCpnId");
            return (Criteria) this;
        }

        public Criteria andMbrCpnIdIn(List<Integer> values) {
            addCriterion("TCRN.MBR_CPN_ID in", values, "mbrCpnId");
            return (Criteria) this;
        }

        public Criteria andMbrCpnIdNotIn(List<Integer> values) {
            addCriterion("TCRN.MBR_CPN_ID not in", values, "mbrCpnId");
            return (Criteria) this;
        }

        public Criteria andMbrCpnIdBetween(Integer value1, Integer value2) {
            addCriterion("TCRN.MBR_CPN_ID between", value1, value2, "mbrCpnId");
            return (Criteria) this;
        }

        public Criteria andMbrCpnIdNotBetween(Integer value1, Integer value2) {
            addCriterion("TCRN.MBR_CPN_ID not between", value1, value2, "mbrCpnId");
            return (Criteria) this;
        }

        public Criteria andCpnRdnbIsNull() {
            addCriterion("TCRN.CPN_RDNB is null");
            return (Criteria) this;
        }

        public Criteria andCpnRdnbIsNotNull() {
            addCriterion("TCRN.CPN_RDNB is not null");
            return (Criteria) this;
        }

        public Criteria andCpnRdnbEqualTo(String value) {
            addCriterion("TCRN.CPN_RDNB =", value, "cpnRdnb");
            return (Criteria) this;
        }

        public Criteria andCpnRdnbNotEqualTo(String value) {
            addCriterion("TCRN.CPN_RDNB <>", value, "cpnRdnb");
            return (Criteria) this;
        }

        public Criteria andCpnRdnbGreaterThan(String value) {
            addCriterion("TCRN.CPN_RDNB >", value, "cpnRdnb");
            return (Criteria) this;
        }

        public Criteria andCpnRdnbGreaterThanOrEqualTo(String value) {
            addCriterion("TCRN.CPN_RDNB >=", value, "cpnRdnb");
            return (Criteria) this;
        }

        public Criteria andCpnRdnbLessThan(String value) {
            addCriterion("TCRN.CPN_RDNB <", value, "cpnRdnb");
            return (Criteria) this;
        }

        public Criteria andCpnRdnbLessThanOrEqualTo(String value) {
            addCriterion("TCRN.CPN_RDNB <=", value, "cpnRdnb");
            return (Criteria) this;
        }

        public Criteria andCpnRdnbLike(String value) {
            addCriterion("TCRN.CPN_RDNB like", value, "cpnRdnb");
            return (Criteria) this;
        }

        public Criteria andCpnRdnbNotLike(String value) {
            addCriterion("TCRN.CPN_RDNB not like", value, "cpnRdnb");
            return (Criteria) this;
        }

        public Criteria andCpnRdnbIn(List<String> values) {
            addCriterion("TCRN.CPN_RDNB in", values, "cpnRdnb");
            return (Criteria) this;
        }

        public Criteria andCpnRdnbNotIn(List<String> values) {
            addCriterion("TCRN.CPN_RDNB not in", values, "cpnRdnb");
            return (Criteria) this;
        }

        public Criteria andCpnRdnbBetween(String value1, String value2) {
            addCriterion("TCRN.CPN_RDNB between", value1, value2, "cpnRdnb");
            return (Criteria) this;
        }

        public Criteria andCpnRdnbNotBetween(String value1, String value2) {
            addCriterion("TCRN.CPN_RDNB not between", value1, value2, "cpnRdnb");
            return (Criteria) this;
        }

        public Criteria andAplyYnIsNull() {
            addCriterion("TCRN.APLY_YN is null");
            return (Criteria) this;
        }

        public Criteria andAplyYnIsNotNull() {
            addCriterion("TCRN.APLY_YN is not null");
            return (Criteria) this;
        }

        public Criteria andAplyYnEqualTo(String value) {
            addCriterion("TCRN.APLY_YN =", value, "aplyYn");
            return (Criteria) this;
        }

        public Criteria andAplyYnNotEqualTo(String value) {
            addCriterion("TCRN.APLY_YN <>", value, "aplyYn");
            return (Criteria) this;
        }

        public Criteria andAplyYnGreaterThan(String value) {
            addCriterion("TCRN.APLY_YN >", value, "aplyYn");
            return (Criteria) this;
        }

        public Criteria andAplyYnGreaterThanOrEqualTo(String value) {
            addCriterion("TCRN.APLY_YN >=", value, "aplyYn");
            return (Criteria) this;
        }

        public Criteria andAplyYnLessThan(String value) {
            addCriterion("TCRN.APLY_YN <", value, "aplyYn");
            return (Criteria) this;
        }

        public Criteria andAplyYnLessThanOrEqualTo(String value) {
            addCriterion("TCRN.APLY_YN <=", value, "aplyYn");
            return (Criteria) this;
        }

        public Criteria andAplyYnLike(String value) {
            addCriterion("TCRN.APLY_YN like", value, "aplyYn");
            return (Criteria) this;
        }

        public Criteria andAplyYnNotLike(String value) {
            addCriterion("TCRN.APLY_YN not like", value, "aplyYn");
            return (Criteria) this;
        }

        public Criteria andAplyYnIn(List<String> values) {
            addCriterion("TCRN.APLY_YN in", values, "aplyYn");
            return (Criteria) this;
        }

        public Criteria andAplyYnNotIn(List<String> values) {
            addCriterion("TCRN.APLY_YN not in", values, "aplyYn");
            return (Criteria) this;
        }

        public Criteria andAplyYnBetween(String value1, String value2) {
            addCriterion("TCRN.APLY_YN between", value1, value2, "aplyYn");
            return (Criteria) this;
        }

        public Criteria andAplyYnNotBetween(String value1, String value2) {
            addCriterion("TCRN.APLY_YN not between", value1, value2, "aplyYn");
            return (Criteria) this;
        }

        public Criteria andRegDtIsNull() {
            addCriterion("TCRN.REG_DT is null");
            return (Criteria) this;
        }

        public Criteria andRegDtIsNotNull() {
            addCriterion("TCRN.REG_DT is not null");
            return (Criteria) this;
        }

        public Criteria andRegDtEqualTo(Date value) {
            addCriterion("TCRN.REG_DT =", value, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtNotEqualTo(Date value) {
            addCriterion("TCRN.REG_DT <>", value, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtGreaterThan(Date value) {
            addCriterion("TCRN.REG_DT >", value, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtGreaterThanOrEqualTo(Date value) {
            addCriterion("TCRN.REG_DT >=", value, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtLessThan(Date value) {
            addCriterion("TCRN.REG_DT <", value, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtLessThanOrEqualTo(Date value) {
            addCriterion("TCRN.REG_DT <=", value, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtIn(List<Date> values) {
            addCriterion("TCRN.REG_DT in", values, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtNotIn(List<Date> values) {
            addCriterion("TCRN.REG_DT not in", values, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtBetween(Date value1, Date value2) {
            addCriterion("TCRN.REG_DT between", value1, value2, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtNotBetween(Date value1, Date value2) {
            addCriterion("TCRN.REG_DT not between", value1, value2, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegIdIsNull() {
            addCriterion("TCRN.REG_ID is null");
            return (Criteria) this;
        }

        public Criteria andRegIdIsNotNull() {
            addCriterion("TCRN.REG_ID is not null");
            return (Criteria) this;
        }

        public Criteria andRegIdEqualTo(String value) {
            addCriterion("TCRN.REG_ID =", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdNotEqualTo(String value) {
            addCriterion("TCRN.REG_ID <>", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdGreaterThan(String value) {
            addCriterion("TCRN.REG_ID >", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdGreaterThanOrEqualTo(String value) {
            addCriterion("TCRN.REG_ID >=", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdLessThan(String value) {
            addCriterion("TCRN.REG_ID <", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdLessThanOrEqualTo(String value) {
            addCriterion("TCRN.REG_ID <=", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdLike(String value) {
            addCriterion("TCRN.REG_ID like", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdNotLike(String value) {
            addCriterion("TCRN.REG_ID not like", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdIn(List<String> values) {
            addCriterion("TCRN.REG_ID in", values, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdNotIn(List<String> values) {
            addCriterion("TCRN.REG_ID not in", values, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdBetween(String value1, String value2) {
            addCriterion("TCRN.REG_ID between", value1, value2, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdNotBetween(String value1, String value2) {
            addCriterion("TCRN.REG_ID not between", value1, value2, "regId");
            return (Criteria) this;
        }

        public Criteria andUseYnIsNull() {
            addCriterion("TCRN.USE_YN is null");
            return (Criteria) this;
        }

        public Criteria andUseYnIsNotNull() {
            addCriterion("TCRN.USE_YN is not null");
            return (Criteria) this;
        }

        public Criteria andUseYnEqualTo(String value) {
            addCriterion("TCRN.USE_YN =", value, "useYn");
            return (Criteria) this;
        }

        public Criteria andUseYnNotEqualTo(String value) {
            addCriterion("TCRN.USE_YN <>", value, "useYn");
            return (Criteria) this;
        }

        public Criteria andUseYnGreaterThan(String value) {
            addCriterion("TCRN.USE_YN >", value, "useYn");
            return (Criteria) this;
        }

        public Criteria andUseYnGreaterThanOrEqualTo(String value) {
            addCriterion("TCRN.USE_YN >=", value, "useYn");
            return (Criteria) this;
        }

        public Criteria andUseYnLessThan(String value) {
            addCriterion("TCRN.USE_YN <", value, "useYn");
            return (Criteria) this;
        }

        public Criteria andUseYnLessThanOrEqualTo(String value) {
            addCriterion("TCRN.USE_YN <=", value, "useYn");
            return (Criteria) this;
        }

        public Criteria andUseYnLike(String value) {
            addCriterion("TCRN.USE_YN like", value, "useYn");
            return (Criteria) this;
        }

        public Criteria andUseYnNotLike(String value) {
            addCriterion("TCRN.USE_YN not like", value, "useYn");
            return (Criteria) this;
        }

        public Criteria andUseYnIn(List<String> values) {
            addCriterion("TCRN.USE_YN in", values, "useYn");
            return (Criteria) this;
        }

        public Criteria andUseYnNotIn(List<String> values) {
            addCriterion("TCRN.USE_YN not in", values, "useYn");
            return (Criteria) this;
        }

        public Criteria andUseYnBetween(String value1, String value2) {
            addCriterion("TCRN.USE_YN between", value1, value2, "useYn");
            return (Criteria) this;
        }

        public Criteria andUseYnNotBetween(String value1, String value2) {
            addCriterion("TCRN.USE_YN not between", value1, value2, "useYn");
            return (Criteria) this;
        }

        public Criteria andCpnRdnbLikeInsensitive(String value) {
            addCriterion("upper(TCRN.CPN_RDNB) like", value.toUpperCase(), "cpnRdnb");
            return (Criteria) this;
        }

        public Criteria andAplyYnLikeInsensitive(String value) {
            addCriterion("upper(TCRN.APLY_YN) like", value.toUpperCase(), "aplyYn");
            return (Criteria) this;
        }

        public Criteria andRegIdLikeInsensitive(String value) {
            addCriterion("upper(TCRN.REG_ID) like", value.toUpperCase(), "regId");
            return (Criteria) this;
        }

        public Criteria andUseYnLikeInsensitive(String value) {
            addCriterion("upper(TCRN.USE_YN) like", value.toUpperCase(), "useYn");
            return (Criteria) this;
        }

        public Criteria andCpnRdnbLikeLeft(String value) {
            addCriterion("TCRN.CPN_RDNB like ", "%" + value, "cpnRdnb");
            return (Criteria) this;
        }

        public Criteria andCpnRdnbLikeRight(String value) {
            addCriterion("TCRN.CPN_RDNB like ", value + "%", "cpnRdnb");
            return (Criteria) this;
        }

        public Criteria andCpnRdnbLikeBoth(String value) {
            addCriterion("TCRN.CPN_RDNB like ", "%" + value + "%", "cpnRdnb");
            return (Criteria) this;
        }

        public Criteria andAplyYnLikeLeft(String value) {
            addCriterion("TCRN.APLY_YN like ", "%" + value, "aplyYn");
            return (Criteria) this;
        }

        public Criteria andAplyYnLikeRight(String value) {
            addCriterion("TCRN.APLY_YN like ", value + "%", "aplyYn");
            return (Criteria) this;
        }

        public Criteria andAplyYnLikeBoth(String value) {
            addCriterion("TCRN.APLY_YN like ", "%" + value + "%", "aplyYn");
            return (Criteria) this;
        }

        public Criteria andRegIdLikeLeft(String value) {
            addCriterion("TCRN.REG_ID like ", "%" + value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdLikeRight(String value) {
            addCriterion("TCRN.REG_ID like ", value + "%", "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdLikeBoth(String value) {
            addCriterion("TCRN.REG_ID like ", "%" + value + "%", "regId");
            return (Criteria) this;
        }

        public Criteria andUseYnLikeLeft(String value) {
            addCriterion("TCRN.USE_YN like ", "%" + value, "useYn");
            return (Criteria) this;
        }

        public Criteria andUseYnLikeRight(String value) {
            addCriterion("TCRN.USE_YN like ", value + "%", "useYn");
            return (Criteria) this;
        }

        public Criteria andUseYnLikeBoth(String value) {
            addCriterion("TCRN.USE_YN like ", "%" + value + "%", "useYn");
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