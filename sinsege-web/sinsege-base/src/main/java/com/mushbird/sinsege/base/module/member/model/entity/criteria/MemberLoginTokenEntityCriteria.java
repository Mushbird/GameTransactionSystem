package com.mushbird.sinsege.base.module.member.model.entity.criteria;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class MemberLoginTokenEntityCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    public MemberLoginTokenEntityCriteria() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andMbrLgnTknIsNull() {
            addCriterion("TMLK.MBR_LGN_TKN is null");
            return (Criteria) this;
        }

        public Criteria andMbrLgnTknIsNotNull() {
            addCriterion("TMLK.MBR_LGN_TKN is not null");
            return (Criteria) this;
        }

        public Criteria andMbrLgnTknEqualTo(String value) {
            addCriterion("TMLK.MBR_LGN_TKN =", value, "mbrLgnTkn");
            return (Criteria) this;
        }

        public Criteria andMbrLgnTknNotEqualTo(String value) {
            addCriterion("TMLK.MBR_LGN_TKN <>", value, "mbrLgnTkn");
            return (Criteria) this;
        }

        public Criteria andMbrLgnTknGreaterThan(String value) {
            addCriterion("TMLK.MBR_LGN_TKN >", value, "mbrLgnTkn");
            return (Criteria) this;
        }

        public Criteria andMbrLgnTknGreaterThanOrEqualTo(String value) {
            addCriterion("TMLK.MBR_LGN_TKN >=", value, "mbrLgnTkn");
            return (Criteria) this;
        }

        public Criteria andMbrLgnTknLessThan(String value) {
            addCriterion("TMLK.MBR_LGN_TKN <", value, "mbrLgnTkn");
            return (Criteria) this;
        }

        public Criteria andMbrLgnTknLessThanOrEqualTo(String value) {
            addCriterion("TMLK.MBR_LGN_TKN <=", value, "mbrLgnTkn");
            return (Criteria) this;
        }

        public Criteria andMbrLgnTknLike(String value) {
            addCriterion("TMLK.MBR_LGN_TKN like", value, "mbrLgnTkn");
            return (Criteria) this;
        }

        public Criteria andMbrLgnTknNotLike(String value) {
            addCriterion("TMLK.MBR_LGN_TKN not like", value, "mbrLgnTkn");
            return (Criteria) this;
        }

        public Criteria andMbrLgnTknIn(List<String> values) {
            addCriterion("TMLK.MBR_LGN_TKN in", values, "mbrLgnTkn");
            return (Criteria) this;
        }

        public Criteria andMbrLgnTknNotIn(List<String> values) {
            addCriterion("TMLK.MBR_LGN_TKN not in", values, "mbrLgnTkn");
            return (Criteria) this;
        }

        public Criteria andMbrLgnTknBetween(String value1, String value2) {
            addCriterion("TMLK.MBR_LGN_TKN between", value1, value2, "mbrLgnTkn");
            return (Criteria) this;
        }

        public Criteria andMbrLgnTknNotBetween(String value1, String value2) {
            addCriterion("TMLK.MBR_LGN_TKN not between", value1, value2, "mbrLgnTkn");
            return (Criteria) this;
        }

        public Criteria andMbrIdIsNull() {
            addCriterion("TMLK.MBR_ID is null");
            return (Criteria) this;
        }

        public Criteria andMbrIdIsNotNull() {
            addCriterion("TMLK.MBR_ID is not null");
            return (Criteria) this;
        }

        public Criteria andMbrIdEqualTo(String value) {
            addCriterion("TMLK.MBR_ID =", value, "mbrId");
            return (Criteria) this;
        }

        public Criteria andMbrIdNotEqualTo(String value) {
            addCriterion("TMLK.MBR_ID <>", value, "mbrId");
            return (Criteria) this;
        }

        public Criteria andMbrIdGreaterThan(String value) {
            addCriterion("TMLK.MBR_ID >", value, "mbrId");
            return (Criteria) this;
        }

        public Criteria andMbrIdGreaterThanOrEqualTo(String value) {
            addCriterion("TMLK.MBR_ID >=", value, "mbrId");
            return (Criteria) this;
        }

        public Criteria andMbrIdLessThan(String value) {
            addCriterion("TMLK.MBR_ID <", value, "mbrId");
            return (Criteria) this;
        }

        public Criteria andMbrIdLessThanOrEqualTo(String value) {
            addCriterion("TMLK.MBR_ID <=", value, "mbrId");
            return (Criteria) this;
        }

        public Criteria andMbrIdLike(String value) {
            addCriterion("TMLK.MBR_ID like", value, "mbrId");
            return (Criteria) this;
        }

        public Criteria andMbrIdNotLike(String value) {
            addCriterion("TMLK.MBR_ID not like", value, "mbrId");
            return (Criteria) this;
        }

        public Criteria andMbrIdIn(List<String> values) {
            addCriterion("TMLK.MBR_ID in", values, "mbrId");
            return (Criteria) this;
        }

        public Criteria andMbrIdNotIn(List<String> values) {
            addCriterion("TMLK.MBR_ID not in", values, "mbrId");
            return (Criteria) this;
        }

        public Criteria andMbrIdBetween(String value1, String value2) {
            addCriterion("TMLK.MBR_ID between", value1, value2, "mbrId");
            return (Criteria) this;
        }

        public Criteria andMbrIdNotBetween(String value1, String value2) {
            addCriterion("TMLK.MBR_ID not between", value1, value2, "mbrId");
            return (Criteria) this;
        }

        public Criteria andXprDtIsNull() {
            addCriterion("TMLK.XPR_DT is null");
            return (Criteria) this;
        }

        public Criteria andXprDtIsNotNull() {
            addCriterion("TMLK.XPR_DT is not null");
            return (Criteria) this;
        }

        public Criteria andXprDtEqualTo(Date value) {
            addCriterionForJDBCDate("TMLK.XPR_DT =", value, "xprDt");
            return (Criteria) this;
        }

        public Criteria andXprDtNotEqualTo(Date value) {
            addCriterionForJDBCDate("TMLK.XPR_DT <>", value, "xprDt");
            return (Criteria) this;
        }

        public Criteria andXprDtGreaterThan(Date value) {
            addCriterionForJDBCDate("TMLK.XPR_DT >", value, "xprDt");
            return (Criteria) this;
        }

        public Criteria andXprDtGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("TMLK.XPR_DT >=", value, "xprDt");
            return (Criteria) this;
        }

        public Criteria andXprDtLessThan(Date value) {
            addCriterionForJDBCDate("TMLK.XPR_DT <", value, "xprDt");
            return (Criteria) this;
        }

        public Criteria andXprDtLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("TMLK.XPR_DT <=", value, "xprDt");
            return (Criteria) this;
        }

        public Criteria andXprDtIn(List<Date> values) {
            addCriterionForJDBCDate("TMLK.XPR_DT in", values, "xprDt");
            return (Criteria) this;
        }

        public Criteria andXprDtNotIn(List<Date> values) {
            addCriterionForJDBCDate("TMLK.XPR_DT not in", values, "xprDt");
            return (Criteria) this;
        }

        public Criteria andXprDtBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("TMLK.XPR_DT between", value1, value2, "xprDt");
            return (Criteria) this;
        }

        public Criteria andXprDtNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("TMLK.XPR_DT not between", value1, value2, "xprDt");
            return (Criteria) this;
        }

        public Criteria andRegDtIsNull() {
            addCriterion("TMLK.REG_DT is null");
            return (Criteria) this;
        }

        public Criteria andRegDtIsNotNull() {
            addCriterion("TMLK.REG_DT is not null");
            return (Criteria) this;
        }

        public Criteria andRegDtEqualTo(Date value) {
            addCriterion("TMLK.REG_DT =", value, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtNotEqualTo(Date value) {
            addCriterion("TMLK.REG_DT <>", value, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtGreaterThan(Date value) {
            addCriterion("TMLK.REG_DT >", value, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtGreaterThanOrEqualTo(Date value) {
            addCriterion("TMLK.REG_DT >=", value, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtLessThan(Date value) {
            addCriterion("TMLK.REG_DT <", value, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtLessThanOrEqualTo(Date value) {
            addCriterion("TMLK.REG_DT <=", value, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtIn(List<Date> values) {
            addCriterion("TMLK.REG_DT in", values, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtNotIn(List<Date> values) {
            addCriterion("TMLK.REG_DT not in", values, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtBetween(Date value1, Date value2) {
            addCriterion("TMLK.REG_DT between", value1, value2, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtNotBetween(Date value1, Date value2) {
            addCriterion("TMLK.REG_DT not between", value1, value2, "regDt");
            return (Criteria) this;
        }

        public Criteria andMbrLgnTknLikeInsensitive(String value) {
            addCriterion("upper(TMLK.MBR_LGN_TKN) like", value.toUpperCase(), "mbrLgnTkn");
            return (Criteria) this;
        }

        public Criteria andMbrIdLikeInsensitive(String value) {
            addCriterion("upper(TMLK.MBR_ID) like", value.toUpperCase(), "mbrId");
            return (Criteria) this;
        }

        public Criteria andMbrLgnTknLikeLeft(String value) {
            addCriterion("TMLK.MBR_LGN_TKN like ", "%" + value, "mbrLgnTkn");
            return (Criteria) this;
        }

        public Criteria andMbrLgnTknLikeRight(String value) {
            addCriterion("TMLK.MBR_LGN_TKN like ", value + "%", "mbrLgnTkn");
            return (Criteria) this;
        }

        public Criteria andMbrLgnTknLikeBoth(String value) {
            addCriterion("TMLK.MBR_LGN_TKN like ", "%" + value + "%", "mbrLgnTkn");
            return (Criteria) this;
        }

        public Criteria andMbrIdLikeLeft(String value) {
            addCriterion("TMLK.MBR_ID like ", "%" + value, "mbrId");
            return (Criteria) this;
        }

        public Criteria andMbrIdLikeRight(String value) {
            addCriterion("TMLK.MBR_ID like ", value + "%", "mbrId");
            return (Criteria) this;
        }

        public Criteria andMbrIdLikeBoth(String value) {
            addCriterion("TMLK.MBR_ID like ", "%" + value + "%", "mbrId");
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