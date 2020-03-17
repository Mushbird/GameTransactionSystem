package com.mushbird.sinsege.base.module.display.model.entity.criteria;

import java.util.ArrayList;
import java.util.List;

public class DpNoticeItemMapEntityCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    public DpNoticeItemMapEntityCriteria() {
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

        public Criteria andDpNotiIdIsNull() {
            addCriterion("TDNIM.DP_NOTI_ID is null");
            return (Criteria) this;
        }

        public Criteria andDpNotiIdIsNotNull() {
            addCriterion("TDNIM.DP_NOTI_ID is not null");
            return (Criteria) this;
        }

        public Criteria andDpNotiIdEqualTo(Integer value) {
            addCriterion("TDNIM.DP_NOTI_ID =", value, "dpNotiId");
            return (Criteria) this;
        }

        public Criteria andDpNotiIdNotEqualTo(Integer value) {
            addCriterion("TDNIM.DP_NOTI_ID <>", value, "dpNotiId");
            return (Criteria) this;
        }

        public Criteria andDpNotiIdGreaterThan(Integer value) {
            addCriterion("TDNIM.DP_NOTI_ID >", value, "dpNotiId");
            return (Criteria) this;
        }

        public Criteria andDpNotiIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("TDNIM.DP_NOTI_ID >=", value, "dpNotiId");
            return (Criteria) this;
        }

        public Criteria andDpNotiIdLessThan(Integer value) {
            addCriterion("TDNIM.DP_NOTI_ID <", value, "dpNotiId");
            return (Criteria) this;
        }

        public Criteria andDpNotiIdLessThanOrEqualTo(Integer value) {
            addCriterion("TDNIM.DP_NOTI_ID <=", value, "dpNotiId");
            return (Criteria) this;
        }

        public Criteria andDpNotiIdIn(List<Integer> values) {
            addCriterion("TDNIM.DP_NOTI_ID in", values, "dpNotiId");
            return (Criteria) this;
        }

        public Criteria andDpNotiIdNotIn(List<Integer> values) {
            addCriterion("TDNIM.DP_NOTI_ID not in", values, "dpNotiId");
            return (Criteria) this;
        }

        public Criteria andDpNotiIdBetween(Integer value1, Integer value2) {
            addCriterion("TDNIM.DP_NOTI_ID between", value1, value2, "dpNotiId");
            return (Criteria) this;
        }

        public Criteria andDpNotiIdNotBetween(Integer value1, Integer value2) {
            addCriterion("TDNIM.DP_NOTI_ID not between", value1, value2, "dpNotiId");
            return (Criteria) this;
        }

        public Criteria andItemIdIsNull() {
            addCriterion("TDNIM.ITEM_ID is null");
            return (Criteria) this;
        }

        public Criteria andItemIdIsNotNull() {
            addCriterion("TDNIM.ITEM_ID is not null");
            return (Criteria) this;
        }

        public Criteria andItemIdEqualTo(Integer value) {
            addCriterion("TDNIM.ITEM_ID =", value, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdNotEqualTo(Integer value) {
            addCriterion("TDNIM.ITEM_ID <>", value, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdGreaterThan(Integer value) {
            addCriterion("TDNIM.ITEM_ID >", value, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("TDNIM.ITEM_ID >=", value, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdLessThan(Integer value) {
            addCriterion("TDNIM.ITEM_ID <", value, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdLessThanOrEqualTo(Integer value) {
            addCriterion("TDNIM.ITEM_ID <=", value, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdIn(List<Integer> values) {
            addCriterion("TDNIM.ITEM_ID in", values, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdNotIn(List<Integer> values) {
            addCriterion("TDNIM.ITEM_ID not in", values, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdBetween(Integer value1, Integer value2) {
            addCriterion("TDNIM.ITEM_ID between", value1, value2, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdNotBetween(Integer value1, Integer value2) {
            addCriterion("TDNIM.ITEM_ID not between", value1, value2, "itemId");
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