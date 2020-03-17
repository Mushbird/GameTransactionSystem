package com.mushbird.sinsege.base.module.member.model.entity.criteria;

import java.util.ArrayList;
import java.util.List;

public class MemberCloseReasonEntityCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    public MemberCloseReasonEntityCriteria() {
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

        public Criteria andMbrCloseRsnIdIsNull() {
            addCriterion("MCLOR.MBR_CLOSE_RSN_ID is null");
            return (Criteria) this;
        }

        public Criteria andMbrCloseRsnIdIsNotNull() {
            addCriterion("MCLOR.MBR_CLOSE_RSN_ID is not null");
            return (Criteria) this;
        }

        public Criteria andMbrCloseRsnIdEqualTo(Integer value) {
            addCriterion("MCLOR.MBR_CLOSE_RSN_ID =", value, "mbrCloseRsnId");
            return (Criteria) this;
        }

        public Criteria andMbrCloseRsnIdNotEqualTo(Integer value) {
            addCriterion("MCLOR.MBR_CLOSE_RSN_ID <>", value, "mbrCloseRsnId");
            return (Criteria) this;
        }

        public Criteria andMbrCloseRsnIdGreaterThan(Integer value) {
            addCriterion("MCLOR.MBR_CLOSE_RSN_ID >", value, "mbrCloseRsnId");
            return (Criteria) this;
        }

        public Criteria andMbrCloseRsnIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("MCLOR.MBR_CLOSE_RSN_ID >=", value, "mbrCloseRsnId");
            return (Criteria) this;
        }

        public Criteria andMbrCloseRsnIdLessThan(Integer value) {
            addCriterion("MCLOR.MBR_CLOSE_RSN_ID <", value, "mbrCloseRsnId");
            return (Criteria) this;
        }

        public Criteria andMbrCloseRsnIdLessThanOrEqualTo(Integer value) {
            addCriterion("MCLOR.MBR_CLOSE_RSN_ID <=", value, "mbrCloseRsnId");
            return (Criteria) this;
        }

        public Criteria andMbrCloseRsnIdIn(List<Integer> values) {
            addCriterion("MCLOR.MBR_CLOSE_RSN_ID in", values, "mbrCloseRsnId");
            return (Criteria) this;
        }

        public Criteria andMbrCloseRsnIdNotIn(List<Integer> values) {
            addCriterion("MCLOR.MBR_CLOSE_RSN_ID not in", values, "mbrCloseRsnId");
            return (Criteria) this;
        }

        public Criteria andMbrCloseRsnIdBetween(Integer value1, Integer value2) {
            addCriterion("MCLOR.MBR_CLOSE_RSN_ID between", value1, value2, "mbrCloseRsnId");
            return (Criteria) this;
        }

        public Criteria andMbrCloseRsnIdNotBetween(Integer value1, Integer value2) {
            addCriterion("MCLOR.MBR_CLOSE_RSN_ID not between", value1, value2, "mbrCloseRsnId");
            return (Criteria) this;
        }

        public Criteria andMbrCloseIdIsNull() {
            addCriterion("MCLOR.MBR_CLOSE_ID is null");
            return (Criteria) this;
        }

        public Criteria andMbrCloseIdIsNotNull() {
            addCriterion("MCLOR.MBR_CLOSE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andMbrCloseIdEqualTo(Integer value) {
            addCriterion("MCLOR.MBR_CLOSE_ID =", value, "mbrCloseId");
            return (Criteria) this;
        }

        public Criteria andMbrCloseIdNotEqualTo(Integer value) {
            addCriterion("MCLOR.MBR_CLOSE_ID <>", value, "mbrCloseId");
            return (Criteria) this;
        }

        public Criteria andMbrCloseIdGreaterThan(Integer value) {
            addCriterion("MCLOR.MBR_CLOSE_ID >", value, "mbrCloseId");
            return (Criteria) this;
        }

        public Criteria andMbrCloseIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("MCLOR.MBR_CLOSE_ID >=", value, "mbrCloseId");
            return (Criteria) this;
        }

        public Criteria andMbrCloseIdLessThan(Integer value) {
            addCriterion("MCLOR.MBR_CLOSE_ID <", value, "mbrCloseId");
            return (Criteria) this;
        }

        public Criteria andMbrCloseIdLessThanOrEqualTo(Integer value) {
            addCriterion("MCLOR.MBR_CLOSE_ID <=", value, "mbrCloseId");
            return (Criteria) this;
        }

        public Criteria andMbrCloseIdIn(List<Integer> values) {
            addCriterion("MCLOR.MBR_CLOSE_ID in", values, "mbrCloseId");
            return (Criteria) this;
        }

        public Criteria andMbrCloseIdNotIn(List<Integer> values) {
            addCriterion("MCLOR.MBR_CLOSE_ID not in", values, "mbrCloseId");
            return (Criteria) this;
        }

        public Criteria andMbrCloseIdBetween(Integer value1, Integer value2) {
            addCriterion("MCLOR.MBR_CLOSE_ID between", value1, value2, "mbrCloseId");
            return (Criteria) this;
        }

        public Criteria andMbrCloseIdNotBetween(Integer value1, Integer value2) {
            addCriterion("MCLOR.MBR_CLOSE_ID not between", value1, value2, "mbrCloseId");
            return (Criteria) this;
        }

        public Criteria andCloseRsnCdIsNull() {
            addCriterion("MCLOR.CLOSE_RSN_CD is null");
            return (Criteria) this;
        }

        public Criteria andCloseRsnCdIsNotNull() {
            addCriterion("MCLOR.CLOSE_RSN_CD is not null");
            return (Criteria) this;
        }

        public Criteria andCloseRsnCdEqualTo(String value) {
            addCriterion("MCLOR.CLOSE_RSN_CD =", value, "closeRsnCd");
            return (Criteria) this;
        }

        public Criteria andCloseRsnCdNotEqualTo(String value) {
            addCriterion("MCLOR.CLOSE_RSN_CD <>", value, "closeRsnCd");
            return (Criteria) this;
        }

        public Criteria andCloseRsnCdGreaterThan(String value) {
            addCriterion("MCLOR.CLOSE_RSN_CD >", value, "closeRsnCd");
            return (Criteria) this;
        }

        public Criteria andCloseRsnCdGreaterThanOrEqualTo(String value) {
            addCriterion("MCLOR.CLOSE_RSN_CD >=", value, "closeRsnCd");
            return (Criteria) this;
        }

        public Criteria andCloseRsnCdLessThan(String value) {
            addCriterion("MCLOR.CLOSE_RSN_CD <", value, "closeRsnCd");
            return (Criteria) this;
        }

        public Criteria andCloseRsnCdLessThanOrEqualTo(String value) {
            addCriterion("MCLOR.CLOSE_RSN_CD <=", value, "closeRsnCd");
            return (Criteria) this;
        }

        public Criteria andCloseRsnCdLike(String value) {
            addCriterion("MCLOR.CLOSE_RSN_CD like", value, "closeRsnCd");
            return (Criteria) this;
        }

        public Criteria andCloseRsnCdNotLike(String value) {
            addCriterion("MCLOR.CLOSE_RSN_CD not like", value, "closeRsnCd");
            return (Criteria) this;
        }

        public Criteria andCloseRsnCdIn(List<String> values) {
            addCriterion("MCLOR.CLOSE_RSN_CD in", values, "closeRsnCd");
            return (Criteria) this;
        }

        public Criteria andCloseRsnCdNotIn(List<String> values) {
            addCriterion("MCLOR.CLOSE_RSN_CD not in", values, "closeRsnCd");
            return (Criteria) this;
        }

        public Criteria andCloseRsnCdBetween(String value1, String value2) {
            addCriterion("MCLOR.CLOSE_RSN_CD between", value1, value2, "closeRsnCd");
            return (Criteria) this;
        }

        public Criteria andCloseRsnCdNotBetween(String value1, String value2) {
            addCriterion("MCLOR.CLOSE_RSN_CD not between", value1, value2, "closeRsnCd");
            return (Criteria) this;
        }

        public Criteria andCloseRsnContIsNull() {
            addCriterion("MCLOR.CLOSE_RSN_CONT is null");
            return (Criteria) this;
        }

        public Criteria andCloseRsnContIsNotNull() {
            addCriterion("MCLOR.CLOSE_RSN_CONT is not null");
            return (Criteria) this;
        }

        public Criteria andCloseRsnContEqualTo(String value) {
            addCriterion("MCLOR.CLOSE_RSN_CONT =", value, "closeRsnCont");
            return (Criteria) this;
        }

        public Criteria andCloseRsnContNotEqualTo(String value) {
            addCriterion("MCLOR.CLOSE_RSN_CONT <>", value, "closeRsnCont");
            return (Criteria) this;
        }

        public Criteria andCloseRsnContGreaterThan(String value) {
            addCriterion("MCLOR.CLOSE_RSN_CONT >", value, "closeRsnCont");
            return (Criteria) this;
        }

        public Criteria andCloseRsnContGreaterThanOrEqualTo(String value) {
            addCriterion("MCLOR.CLOSE_RSN_CONT >=", value, "closeRsnCont");
            return (Criteria) this;
        }

        public Criteria andCloseRsnContLessThan(String value) {
            addCriterion("MCLOR.CLOSE_RSN_CONT <", value, "closeRsnCont");
            return (Criteria) this;
        }

        public Criteria andCloseRsnContLessThanOrEqualTo(String value) {
            addCriterion("MCLOR.CLOSE_RSN_CONT <=", value, "closeRsnCont");
            return (Criteria) this;
        }

        public Criteria andCloseRsnContLike(String value) {
            addCriterion("MCLOR.CLOSE_RSN_CONT like", value, "closeRsnCont");
            return (Criteria) this;
        }

        public Criteria andCloseRsnContNotLike(String value) {
            addCriterion("MCLOR.CLOSE_RSN_CONT not like", value, "closeRsnCont");
            return (Criteria) this;
        }

        public Criteria andCloseRsnContIn(List<String> values) {
            addCriterion("MCLOR.CLOSE_RSN_CONT in", values, "closeRsnCont");
            return (Criteria) this;
        }

        public Criteria andCloseRsnContNotIn(List<String> values) {
            addCriterion("MCLOR.CLOSE_RSN_CONT not in", values, "closeRsnCont");
            return (Criteria) this;
        }

        public Criteria andCloseRsnContBetween(String value1, String value2) {
            addCriterion("MCLOR.CLOSE_RSN_CONT between", value1, value2, "closeRsnCont");
            return (Criteria) this;
        }

        public Criteria andCloseRsnContNotBetween(String value1, String value2) {
            addCriterion("MCLOR.CLOSE_RSN_CONT not between", value1, value2, "closeRsnCont");
            return (Criteria) this;
        }

        public Criteria andCloseRsnCdLikeInsensitive(String value) {
            addCriterion("upper(MCLOR.CLOSE_RSN_CD) like", value.toUpperCase(), "closeRsnCd");
            return (Criteria) this;
        }

        public Criteria andCloseRsnContLikeInsensitive(String value) {
            addCriterion("upper(MCLOR.CLOSE_RSN_CONT) like", value.toUpperCase(), "closeRsnCont");
            return (Criteria) this;
        }

        public Criteria andCloseRsnCdLikeLeft(String value) {
            addCriterion("MCLOR.CLOSE_RSN_CD like ", "%" + value, "closeRsnCd");
            return (Criteria) this;
        }

        public Criteria andCloseRsnCdLikeRight(String value) {
            addCriterion("MCLOR.CLOSE_RSN_CD like ", value + "%", "closeRsnCd");
            return (Criteria) this;
        }

        public Criteria andCloseRsnCdLikeBoth(String value) {
            addCriterion("MCLOR.CLOSE_RSN_CD like ", "%" + value + "%", "closeRsnCd");
            return (Criteria) this;
        }

        public Criteria andCloseRsnContLikeLeft(String value) {
            addCriterion("MCLOR.CLOSE_RSN_CONT like ", "%" + value, "closeRsnCont");
            return (Criteria) this;
        }

        public Criteria andCloseRsnContLikeRight(String value) {
            addCriterion("MCLOR.CLOSE_RSN_CONT like ", value + "%", "closeRsnCont");
            return (Criteria) this;
        }

        public Criteria andCloseRsnContLikeBoth(String value) {
            addCriterion("MCLOR.CLOSE_RSN_CONT like ", "%" + value + "%", "closeRsnCont");
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