package com.mushbird.sinsege.base.module.member.model.entity.criteria;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class MemberLoginHistoryEntityCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    public MemberLoginHistoryEntityCriteria() {
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

        public Criteria andMbrLgnHistIdIsNull() {
            addCriterion("TMLH.MBR_LGN_HIST_ID is null");
            return (Criteria) this;
        }

        public Criteria andMbrLgnHistIdIsNotNull() {
            addCriterion("TMLH.MBR_LGN_HIST_ID is not null");
            return (Criteria) this;
        }

        public Criteria andMbrLgnHistIdEqualTo(Integer value) {
            addCriterion("TMLH.MBR_LGN_HIST_ID =", value, "mbrLgnHistId");
            return (Criteria) this;
        }

        public Criteria andMbrLgnHistIdNotEqualTo(Integer value) {
            addCriterion("TMLH.MBR_LGN_HIST_ID <>", value, "mbrLgnHistId");
            return (Criteria) this;
        }

        public Criteria andMbrLgnHistIdGreaterThan(Integer value) {
            addCriterion("TMLH.MBR_LGN_HIST_ID >", value, "mbrLgnHistId");
            return (Criteria) this;
        }

        public Criteria andMbrLgnHistIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("TMLH.MBR_LGN_HIST_ID >=", value, "mbrLgnHistId");
            return (Criteria) this;
        }

        public Criteria andMbrLgnHistIdLessThan(Integer value) {
            addCriterion("TMLH.MBR_LGN_HIST_ID <", value, "mbrLgnHistId");
            return (Criteria) this;
        }

        public Criteria andMbrLgnHistIdLessThanOrEqualTo(Integer value) {
            addCriterion("TMLH.MBR_LGN_HIST_ID <=", value, "mbrLgnHistId");
            return (Criteria) this;
        }

        public Criteria andMbrLgnHistIdIn(List<Integer> values) {
            addCriterion("TMLH.MBR_LGN_HIST_ID in", values, "mbrLgnHistId");
            return (Criteria) this;
        }

        public Criteria andMbrLgnHistIdNotIn(List<Integer> values) {
            addCriterion("TMLH.MBR_LGN_HIST_ID not in", values, "mbrLgnHistId");
            return (Criteria) this;
        }

        public Criteria andMbrLgnHistIdBetween(Integer value1, Integer value2) {
            addCriterion("TMLH.MBR_LGN_HIST_ID between", value1, value2, "mbrLgnHistId");
            return (Criteria) this;
        }

        public Criteria andMbrLgnHistIdNotBetween(Integer value1, Integer value2) {
            addCriterion("TMLH.MBR_LGN_HIST_ID not between", value1, value2, "mbrLgnHistId");
            return (Criteria) this;
        }

        public Criteria andMbrIdIsNull() {
            addCriterion("TMLH.MBR_ID is null");
            return (Criteria) this;
        }

        public Criteria andMbrIdIsNotNull() {
            addCriterion("TMLH.MBR_ID is not null");
            return (Criteria) this;
        }

        public Criteria andMbrIdEqualTo(String value) {
            addCriterion("TMLH.MBR_ID =", value, "mbrId");
            return (Criteria) this;
        }

        public Criteria andMbrIdNotEqualTo(String value) {
            addCriterion("TMLH.MBR_ID <>", value, "mbrId");
            return (Criteria) this;
        }

        public Criteria andMbrIdGreaterThan(String value) {
            addCriterion("TMLH.MBR_ID >", value, "mbrId");
            return (Criteria) this;
        }

        public Criteria andMbrIdGreaterThanOrEqualTo(String value) {
            addCriterion("TMLH.MBR_ID >=", value, "mbrId");
            return (Criteria) this;
        }

        public Criteria andMbrIdLessThan(String value) {
            addCriterion("TMLH.MBR_ID <", value, "mbrId");
            return (Criteria) this;
        }

        public Criteria andMbrIdLessThanOrEqualTo(String value) {
            addCriterion("TMLH.MBR_ID <=", value, "mbrId");
            return (Criteria) this;
        }

        public Criteria andMbrIdLike(String value) {
            addCriterion("TMLH.MBR_ID like", value, "mbrId");
            return (Criteria) this;
        }

        public Criteria andMbrIdNotLike(String value) {
            addCriterion("TMLH.MBR_ID not like", value, "mbrId");
            return (Criteria) this;
        }

        public Criteria andMbrIdIn(List<String> values) {
            addCriterion("TMLH.MBR_ID in", values, "mbrId");
            return (Criteria) this;
        }

        public Criteria andMbrIdNotIn(List<String> values) {
            addCriterion("TMLH.MBR_ID not in", values, "mbrId");
            return (Criteria) this;
        }

        public Criteria andMbrIdBetween(String value1, String value2) {
            addCriterion("TMLH.MBR_ID between", value1, value2, "mbrId");
            return (Criteria) this;
        }

        public Criteria andMbrIdNotBetween(String value1, String value2) {
            addCriterion("TMLH.MBR_ID not between", value1, value2, "mbrId");
            return (Criteria) this;
        }

        public Criteria andLgnDtIsNull() {
            addCriterion("TMLH.LGN_DT is null");
            return (Criteria) this;
        }

        public Criteria andLgnDtIsNotNull() {
            addCriterion("TMLH.LGN_DT is not null");
            return (Criteria) this;
        }

        public Criteria andLgnDtEqualTo(Date value) {
            addCriterionForJDBCDate("TMLH.LGN_DT =", value, "lgnDt");
            return (Criteria) this;
        }

        public Criteria andLgnDtNotEqualTo(Date value) {
            addCriterionForJDBCDate("TMLH.LGN_DT <>", value, "lgnDt");
            return (Criteria) this;
        }

        public Criteria andLgnDtGreaterThan(Date value) {
            addCriterionForJDBCDate("TMLH.LGN_DT >", value, "lgnDt");
            return (Criteria) this;
        }

        public Criteria andLgnDtGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("TMLH.LGN_DT >=", value, "lgnDt");
            return (Criteria) this;
        }

        public Criteria andLgnDtLessThan(Date value) {
            addCriterionForJDBCDate("TMLH.LGN_DT <", value, "lgnDt");
            return (Criteria) this;
        }

        public Criteria andLgnDtLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("TMLH.LGN_DT <=", value, "lgnDt");
            return (Criteria) this;
        }

        public Criteria andLgnDtIn(List<Date> values) {
            addCriterionForJDBCDate("TMLH.LGN_DT in", values, "lgnDt");
            return (Criteria) this;
        }

        public Criteria andLgnDtNotIn(List<Date> values) {
            addCriterionForJDBCDate("TMLH.LGN_DT not in", values, "lgnDt");
            return (Criteria) this;
        }

        public Criteria andLgnDtBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("TMLH.LGN_DT between", value1, value2, "lgnDt");
            return (Criteria) this;
        }

        public Criteria andLgnDtNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("TMLH.LGN_DT not between", value1, value2, "lgnDt");
            return (Criteria) this;
        }

        public Criteria andIpAddrIsNull() {
            addCriterion("TMLH.IP_ADDR is null");
            return (Criteria) this;
        }

        public Criteria andIpAddrIsNotNull() {
            addCriterion("TMLH.IP_ADDR is not null");
            return (Criteria) this;
        }

        public Criteria andIpAddrEqualTo(String value) {
            addCriterion("TMLH.IP_ADDR =", value, "ipAddr");
            return (Criteria) this;
        }

        public Criteria andIpAddrNotEqualTo(String value) {
            addCriterion("TMLH.IP_ADDR <>", value, "ipAddr");
            return (Criteria) this;
        }

        public Criteria andIpAddrGreaterThan(String value) {
            addCriterion("TMLH.IP_ADDR >", value, "ipAddr");
            return (Criteria) this;
        }

        public Criteria andIpAddrGreaterThanOrEqualTo(String value) {
            addCriterion("TMLH.IP_ADDR >=", value, "ipAddr");
            return (Criteria) this;
        }

        public Criteria andIpAddrLessThan(String value) {
            addCriterion("TMLH.IP_ADDR <", value, "ipAddr");
            return (Criteria) this;
        }

        public Criteria andIpAddrLessThanOrEqualTo(String value) {
            addCriterion("TMLH.IP_ADDR <=", value, "ipAddr");
            return (Criteria) this;
        }

        public Criteria andIpAddrLike(String value) {
            addCriterion("TMLH.IP_ADDR like", value, "ipAddr");
            return (Criteria) this;
        }

        public Criteria andIpAddrNotLike(String value) {
            addCriterion("TMLH.IP_ADDR not like", value, "ipAddr");
            return (Criteria) this;
        }

        public Criteria andIpAddrIn(List<String> values) {
            addCriterion("TMLH.IP_ADDR in", values, "ipAddr");
            return (Criteria) this;
        }

        public Criteria andIpAddrNotIn(List<String> values) {
            addCriterion("TMLH.IP_ADDR not in", values, "ipAddr");
            return (Criteria) this;
        }

        public Criteria andIpAddrBetween(String value1, String value2) {
            addCriterion("TMLH.IP_ADDR between", value1, value2, "ipAddr");
            return (Criteria) this;
        }

        public Criteria andIpAddrNotBetween(String value1, String value2) {
            addCriterion("TMLH.IP_ADDR not between", value1, value2, "ipAddr");
            return (Criteria) this;
        }

        public Criteria andUserEnvCdIsNull() {
            addCriterion("TMLH.USER_ENV_CD is null");
            return (Criteria) this;
        }

        public Criteria andUserEnvCdIsNotNull() {
            addCriterion("TMLH.USER_ENV_CD is not null");
            return (Criteria) this;
        }

        public Criteria andUserEnvCdEqualTo(String value) {
            addCriterion("TMLH.USER_ENV_CD =", value, "userEnvCd");
            return (Criteria) this;
        }

        public Criteria andUserEnvCdNotEqualTo(String value) {
            addCriterion("TMLH.USER_ENV_CD <>", value, "userEnvCd");
            return (Criteria) this;
        }

        public Criteria andUserEnvCdGreaterThan(String value) {
            addCriterion("TMLH.USER_ENV_CD >", value, "userEnvCd");
            return (Criteria) this;
        }

        public Criteria andUserEnvCdGreaterThanOrEqualTo(String value) {
            addCriterion("TMLH.USER_ENV_CD >=", value, "userEnvCd");
            return (Criteria) this;
        }

        public Criteria andUserEnvCdLessThan(String value) {
            addCriterion("TMLH.USER_ENV_CD <", value, "userEnvCd");
            return (Criteria) this;
        }

        public Criteria andUserEnvCdLessThanOrEqualTo(String value) {
            addCriterion("TMLH.USER_ENV_CD <=", value, "userEnvCd");
            return (Criteria) this;
        }

        public Criteria andUserEnvCdLike(String value) {
            addCriterion("TMLH.USER_ENV_CD like", value, "userEnvCd");
            return (Criteria) this;
        }

        public Criteria andUserEnvCdNotLike(String value) {
            addCriterion("TMLH.USER_ENV_CD not like", value, "userEnvCd");
            return (Criteria) this;
        }

        public Criteria andUserEnvCdIn(List<String> values) {
            addCriterion("TMLH.USER_ENV_CD in", values, "userEnvCd");
            return (Criteria) this;
        }

        public Criteria andUserEnvCdNotIn(List<String> values) {
            addCriterion("TMLH.USER_ENV_CD not in", values, "userEnvCd");
            return (Criteria) this;
        }

        public Criteria andUserEnvCdBetween(String value1, String value2) {
            addCriterion("TMLH.USER_ENV_CD between", value1, value2, "userEnvCd");
            return (Criteria) this;
        }

        public Criteria andUserEnvCdNotBetween(String value1, String value2) {
            addCriterion("TMLH.USER_ENV_CD not between", value1, value2, "userEnvCd");
            return (Criteria) this;
        }

        public Criteria andUaValIsNull() {
            addCriterion("TMLH.UA_VAL is null");
            return (Criteria) this;
        }

        public Criteria andUaValIsNotNull() {
            addCriterion("TMLH.UA_VAL is not null");
            return (Criteria) this;
        }

        public Criteria andUaValEqualTo(String value) {
            addCriterion("TMLH.UA_VAL =", value, "uaVal");
            return (Criteria) this;
        }

        public Criteria andUaValNotEqualTo(String value) {
            addCriterion("TMLH.UA_VAL <>", value, "uaVal");
            return (Criteria) this;
        }

        public Criteria andUaValGreaterThan(String value) {
            addCriterion("TMLH.UA_VAL >", value, "uaVal");
            return (Criteria) this;
        }

        public Criteria andUaValGreaterThanOrEqualTo(String value) {
            addCriterion("TMLH.UA_VAL >=", value, "uaVal");
            return (Criteria) this;
        }

        public Criteria andUaValLessThan(String value) {
            addCriterion("TMLH.UA_VAL <", value, "uaVal");
            return (Criteria) this;
        }

        public Criteria andUaValLessThanOrEqualTo(String value) {
            addCriterion("TMLH.UA_VAL <=", value, "uaVal");
            return (Criteria) this;
        }

        public Criteria andUaValLike(String value) {
            addCriterion("TMLH.UA_VAL like", value, "uaVal");
            return (Criteria) this;
        }

        public Criteria andUaValNotLike(String value) {
            addCriterion("TMLH.UA_VAL not like", value, "uaVal");
            return (Criteria) this;
        }

        public Criteria andUaValIn(List<String> values) {
            addCriterion("TMLH.UA_VAL in", values, "uaVal");
            return (Criteria) this;
        }

        public Criteria andUaValNotIn(List<String> values) {
            addCriterion("TMLH.UA_VAL not in", values, "uaVal");
            return (Criteria) this;
        }

        public Criteria andUaValBetween(String value1, String value2) {
            addCriterion("TMLH.UA_VAL between", value1, value2, "uaVal");
            return (Criteria) this;
        }

        public Criteria andUaValNotBetween(String value1, String value2) {
            addCriterion("TMLH.UA_VAL not between", value1, value2, "uaVal");
            return (Criteria) this;
        }

        public Criteria andMbrIdLikeInsensitive(String value) {
            addCriterion("upper(TMLH.MBR_ID) like", value.toUpperCase(), "mbrId");
            return (Criteria) this;
        }

        public Criteria andIpAddrLikeInsensitive(String value) {
            addCriterion("upper(TMLH.IP_ADDR) like", value.toUpperCase(), "ipAddr");
            return (Criteria) this;
        }

        public Criteria andUserEnvCdLikeInsensitive(String value) {
            addCriterion("upper(TMLH.USER_ENV_CD) like", value.toUpperCase(), "userEnvCd");
            return (Criteria) this;
        }

        public Criteria andUaValLikeInsensitive(String value) {
            addCriterion("upper(TMLH.UA_VAL) like", value.toUpperCase(), "uaVal");
            return (Criteria) this;
        }

        public Criteria andMbrIdLikeLeft(String value) {
            addCriterion("TMLH.MBR_ID like ", "%" + value, "mbrId");
            return (Criteria) this;
        }

        public Criteria andMbrIdLikeRight(String value) {
            addCriterion("TMLH.MBR_ID like ", value + "%", "mbrId");
            return (Criteria) this;
        }

        public Criteria andMbrIdLikeBoth(String value) {
            addCriterion("TMLH.MBR_ID like ", "%" + value + "%", "mbrId");
            return (Criteria) this;
        }

        public Criteria andIpAddrLikeLeft(String value) {
            addCriterion("TMLH.IP_ADDR like ", "%" + value, "ipAddr");
            return (Criteria) this;
        }

        public Criteria andIpAddrLikeRight(String value) {
            addCriterion("TMLH.IP_ADDR like ", value + "%", "ipAddr");
            return (Criteria) this;
        }

        public Criteria andIpAddrLikeBoth(String value) {
            addCriterion("TMLH.IP_ADDR like ", "%" + value + "%", "ipAddr");
            return (Criteria) this;
        }

        public Criteria andUserEnvCdLikeLeft(String value) {
            addCriterion("TMLH.USER_ENV_CD like ", "%" + value, "userEnvCd");
            return (Criteria) this;
        }

        public Criteria andUserEnvCdLikeRight(String value) {
            addCriterion("TMLH.USER_ENV_CD like ", value + "%", "userEnvCd");
            return (Criteria) this;
        }

        public Criteria andUserEnvCdLikeBoth(String value) {
            addCriterion("TMLH.USER_ENV_CD like ", "%" + value + "%", "userEnvCd");
            return (Criteria) this;
        }

        public Criteria andUaValLikeLeft(String value) {
            addCriterion("TMLH.UA_VAL like ", "%" + value, "uaVal");
            return (Criteria) this;
        }

        public Criteria andUaValLikeRight(String value) {
            addCriterion("TMLH.UA_VAL like ", value + "%", "uaVal");
            return (Criteria) this;
        }

        public Criteria andUaValLikeBoth(String value) {
            addCriterion("TMLH.UA_VAL like ", "%" + value + "%", "uaVal");
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