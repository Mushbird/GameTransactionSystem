package com.mushbird.sinsege.base.module.reward.model.entity.criteria;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CouponTargetFreegiftMapEntityCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    public CouponTargetFreegiftMapEntityCriteria() {
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

        public Criteria andCpnIdIsNull() {
            addCriterion("TCTFM.CPN_ID is null");
            return (Criteria) this;
        }

        public Criteria andCpnIdIsNotNull() {
            addCriterion("TCTFM.CPN_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCpnIdEqualTo(Integer value) {
            addCriterion("TCTFM.CPN_ID =", value, "cpnId");
            return (Criteria) this;
        }

        public Criteria andCpnIdNotEqualTo(Integer value) {
            addCriterion("TCTFM.CPN_ID <>", value, "cpnId");
            return (Criteria) this;
        }

        public Criteria andCpnIdGreaterThan(Integer value) {
            addCriterion("TCTFM.CPN_ID >", value, "cpnId");
            return (Criteria) this;
        }

        public Criteria andCpnIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("TCTFM.CPN_ID >=", value, "cpnId");
            return (Criteria) this;
        }

        public Criteria andCpnIdLessThan(Integer value) {
            addCriterion("TCTFM.CPN_ID <", value, "cpnId");
            return (Criteria) this;
        }

        public Criteria andCpnIdLessThanOrEqualTo(Integer value) {
            addCriterion("TCTFM.CPN_ID <=", value, "cpnId");
            return (Criteria) this;
        }

        public Criteria andCpnIdIn(List<Integer> values) {
            addCriterion("TCTFM.CPN_ID in", values, "cpnId");
            return (Criteria) this;
        }

        public Criteria andCpnIdNotIn(List<Integer> values) {
            addCriterion("TCTFM.CPN_ID not in", values, "cpnId");
            return (Criteria) this;
        }

        public Criteria andCpnIdBetween(Integer value1, Integer value2) {
            addCriterion("TCTFM.CPN_ID between", value1, value2, "cpnId");
            return (Criteria) this;
        }

        public Criteria andCpnIdNotBetween(Integer value1, Integer value2) {
            addCriterion("TCTFM.CPN_ID not between", value1, value2, "cpnId");
            return (Criteria) this;
        }

        public Criteria andItemFrgtIdIsNull() {
            addCriterion("TCTFM.ITEM_FRGT_ID is null");
            return (Criteria) this;
        }

        public Criteria andItemFrgtIdIsNotNull() {
            addCriterion("TCTFM.ITEM_FRGT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andItemFrgtIdEqualTo(Integer value) {
            addCriterion("TCTFM.ITEM_FRGT_ID =", value, "itemFrgtId");
            return (Criteria) this;
        }

        public Criteria andItemFrgtIdNotEqualTo(Integer value) {
            addCriterion("TCTFM.ITEM_FRGT_ID <>", value, "itemFrgtId");
            return (Criteria) this;
        }

        public Criteria andItemFrgtIdGreaterThan(Integer value) {
            addCriterion("TCTFM.ITEM_FRGT_ID >", value, "itemFrgtId");
            return (Criteria) this;
        }

        public Criteria andItemFrgtIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("TCTFM.ITEM_FRGT_ID >=", value, "itemFrgtId");
            return (Criteria) this;
        }

        public Criteria andItemFrgtIdLessThan(Integer value) {
            addCriterion("TCTFM.ITEM_FRGT_ID <", value, "itemFrgtId");
            return (Criteria) this;
        }

        public Criteria andItemFrgtIdLessThanOrEqualTo(Integer value) {
            addCriterion("TCTFM.ITEM_FRGT_ID <=", value, "itemFrgtId");
            return (Criteria) this;
        }

        public Criteria andItemFrgtIdIn(List<Integer> values) {
            addCriterion("TCTFM.ITEM_FRGT_ID in", values, "itemFrgtId");
            return (Criteria) this;
        }

        public Criteria andItemFrgtIdNotIn(List<Integer> values) {
            addCriterion("TCTFM.ITEM_FRGT_ID not in", values, "itemFrgtId");
            return (Criteria) this;
        }

        public Criteria andItemFrgtIdBetween(Integer value1, Integer value2) {
            addCriterion("TCTFM.ITEM_FRGT_ID between", value1, value2, "itemFrgtId");
            return (Criteria) this;
        }

        public Criteria andItemFrgtIdNotBetween(Integer value1, Integer value2) {
            addCriterion("TCTFM.ITEM_FRGT_ID not between", value1, value2, "itemFrgtId");
            return (Criteria) this;
        }

        public Criteria andRegDtIsNull() {
            addCriterion("TCTFM.REG_DT is null");
            return (Criteria) this;
        }

        public Criteria andRegDtIsNotNull() {
            addCriterion("TCTFM.REG_DT is not null");
            return (Criteria) this;
        }

        public Criteria andRegDtEqualTo(Date value) {
            addCriterion("TCTFM.REG_DT =", value, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtNotEqualTo(Date value) {
            addCriterion("TCTFM.REG_DT <>", value, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtGreaterThan(Date value) {
            addCriterion("TCTFM.REG_DT >", value, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtGreaterThanOrEqualTo(Date value) {
            addCriterion("TCTFM.REG_DT >=", value, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtLessThan(Date value) {
            addCriterion("TCTFM.REG_DT <", value, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtLessThanOrEqualTo(Date value) {
            addCriterion("TCTFM.REG_DT <=", value, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtIn(List<Date> values) {
            addCriterion("TCTFM.REG_DT in", values, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtNotIn(List<Date> values) {
            addCriterion("TCTFM.REG_DT not in", values, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtBetween(Date value1, Date value2) {
            addCriterion("TCTFM.REG_DT between", value1, value2, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtNotBetween(Date value1, Date value2) {
            addCriterion("TCTFM.REG_DT not between", value1, value2, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegIdIsNull() {
            addCriterion("TCTFM.REG_ID is null");
            return (Criteria) this;
        }

        public Criteria andRegIdIsNotNull() {
            addCriterion("TCTFM.REG_ID is not null");
            return (Criteria) this;
        }

        public Criteria andRegIdEqualTo(String value) {
            addCriterion("TCTFM.REG_ID =", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdNotEqualTo(String value) {
            addCriterion("TCTFM.REG_ID <>", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdGreaterThan(String value) {
            addCriterion("TCTFM.REG_ID >", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdGreaterThanOrEqualTo(String value) {
            addCriterion("TCTFM.REG_ID >=", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdLessThan(String value) {
            addCriterion("TCTFM.REG_ID <", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdLessThanOrEqualTo(String value) {
            addCriterion("TCTFM.REG_ID <=", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdLike(String value) {
            addCriterion("TCTFM.REG_ID like", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdNotLike(String value) {
            addCriterion("TCTFM.REG_ID not like", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdIn(List<String> values) {
            addCriterion("TCTFM.REG_ID in", values, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdNotIn(List<String> values) {
            addCriterion("TCTFM.REG_ID not in", values, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdBetween(String value1, String value2) {
            addCriterion("TCTFM.REG_ID between", value1, value2, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdNotBetween(String value1, String value2) {
            addCriterion("TCTFM.REG_ID not between", value1, value2, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdLikeInsensitive(String value) {
            addCriterion("upper(TCTFM.REG_ID) like", value.toUpperCase(), "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdLikeLeft(String value) {
            addCriterion("TCTFM.REG_ID like ", "%" + value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdLikeRight(String value) {
            addCriterion("TCTFM.REG_ID like ", value + "%", "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdLikeBoth(String value) {
            addCriterion("TCTFM.REG_ID like ", "%" + value + "%", "regId");
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