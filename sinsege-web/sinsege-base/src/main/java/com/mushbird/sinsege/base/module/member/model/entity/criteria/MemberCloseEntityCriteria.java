package com.mushbird.sinsege.base.module.member.model.entity.criteria;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class MemberCloseEntityCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    public MemberCloseEntityCriteria() {
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

        public Criteria andMbrCloseIdIsNull() {
            addCriterion("MCLO.MBR_CLOSE_ID is null");
            return (Criteria) this;
        }

        public Criteria andMbrCloseIdIsNotNull() {
            addCriterion("MCLO.MBR_CLOSE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andMbrCloseIdEqualTo(Integer value) {
            addCriterion("MCLO.MBR_CLOSE_ID =", value, "mbrCloseId");
            return (Criteria) this;
        }

        public Criteria andMbrCloseIdNotEqualTo(Integer value) {
            addCriterion("MCLO.MBR_CLOSE_ID <>", value, "mbrCloseId");
            return (Criteria) this;
        }

        public Criteria andMbrCloseIdGreaterThan(Integer value) {
            addCriterion("MCLO.MBR_CLOSE_ID >", value, "mbrCloseId");
            return (Criteria) this;
        }

        public Criteria andMbrCloseIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("MCLO.MBR_CLOSE_ID >=", value, "mbrCloseId");
            return (Criteria) this;
        }

        public Criteria andMbrCloseIdLessThan(Integer value) {
            addCriterion("MCLO.MBR_CLOSE_ID <", value, "mbrCloseId");
            return (Criteria) this;
        }

        public Criteria andMbrCloseIdLessThanOrEqualTo(Integer value) {
            addCriterion("MCLO.MBR_CLOSE_ID <=", value, "mbrCloseId");
            return (Criteria) this;
        }

        public Criteria andMbrCloseIdIn(List<Integer> values) {
            addCriterion("MCLO.MBR_CLOSE_ID in", values, "mbrCloseId");
            return (Criteria) this;
        }

        public Criteria andMbrCloseIdNotIn(List<Integer> values) {
            addCriterion("MCLO.MBR_CLOSE_ID not in", values, "mbrCloseId");
            return (Criteria) this;
        }

        public Criteria andMbrCloseIdBetween(Integer value1, Integer value2) {
            addCriterion("MCLO.MBR_CLOSE_ID between", value1, value2, "mbrCloseId");
            return (Criteria) this;
        }

        public Criteria andMbrCloseIdNotBetween(Integer value1, Integer value2) {
            addCriterion("MCLO.MBR_CLOSE_ID not between", value1, value2, "mbrCloseId");
            return (Criteria) this;
        }

        public Criteria andMbrIdIsNull() {
            addCriterion("MCLO.MBR_ID is null");
            return (Criteria) this;
        }

        public Criteria andMbrIdIsNotNull() {
            addCriterion("MCLO.MBR_ID is not null");
            return (Criteria) this;
        }

        public Criteria andMbrIdEqualTo(String value) {
            addCriterion("MCLO.MBR_ID =", value, "mbrId");
            return (Criteria) this;
        }

        public Criteria andMbrIdNotEqualTo(String value) {
            addCriterion("MCLO.MBR_ID <>", value, "mbrId");
            return (Criteria) this;
        }

        public Criteria andMbrIdGreaterThan(String value) {
            addCriterion("MCLO.MBR_ID >", value, "mbrId");
            return (Criteria) this;
        }

        public Criteria andMbrIdGreaterThanOrEqualTo(String value) {
            addCriterion("MCLO.MBR_ID >=", value, "mbrId");
            return (Criteria) this;
        }

        public Criteria andMbrIdLessThan(String value) {
            addCriterion("MCLO.MBR_ID <", value, "mbrId");
            return (Criteria) this;
        }

        public Criteria andMbrIdLessThanOrEqualTo(String value) {
            addCriterion("MCLO.MBR_ID <=", value, "mbrId");
            return (Criteria) this;
        }

        public Criteria andMbrIdLike(String value) {
            addCriterion("MCLO.MBR_ID like", value, "mbrId");
            return (Criteria) this;
        }

        public Criteria andMbrIdNotLike(String value) {
            addCriterion("MCLO.MBR_ID not like", value, "mbrId");
            return (Criteria) this;
        }

        public Criteria andMbrIdIn(List<String> values) {
            addCriterion("MCLO.MBR_ID in", values, "mbrId");
            return (Criteria) this;
        }

        public Criteria andMbrIdNotIn(List<String> values) {
            addCriterion("MCLO.MBR_ID not in", values, "mbrId");
            return (Criteria) this;
        }

        public Criteria andMbrIdBetween(String value1, String value2) {
            addCriterion("MCLO.MBR_ID between", value1, value2, "mbrId");
            return (Criteria) this;
        }

        public Criteria andMbrIdNotBetween(String value1, String value2) {
            addCriterion("MCLO.MBR_ID not between", value1, value2, "mbrId");
            return (Criteria) this;
        }

        public Criteria andMbrLgnIdIsNull() {
            addCriterion("MCLO.MBR_LGN_ID is null");
            return (Criteria) this;
        }

        public Criteria andMbrLgnIdIsNotNull() {
            addCriterion("MCLO.MBR_LGN_ID is not null");
            return (Criteria) this;
        }

        public Criteria andMbrLgnIdEqualTo(String value) {
            addCriterion("MCLO.MBR_LGN_ID =", value, "mbrLgnId");
            return (Criteria) this;
        }

        public Criteria andMbrLgnIdNotEqualTo(String value) {
            addCriterion("MCLO.MBR_LGN_ID <>", value, "mbrLgnId");
            return (Criteria) this;
        }

        public Criteria andMbrLgnIdGreaterThan(String value) {
            addCriterion("MCLO.MBR_LGN_ID >", value, "mbrLgnId");
            return (Criteria) this;
        }

        public Criteria andMbrLgnIdGreaterThanOrEqualTo(String value) {
            addCriterion("MCLO.MBR_LGN_ID >=", value, "mbrLgnId");
            return (Criteria) this;
        }

        public Criteria andMbrLgnIdLessThan(String value) {
            addCriterion("MCLO.MBR_LGN_ID <", value, "mbrLgnId");
            return (Criteria) this;
        }

        public Criteria andMbrLgnIdLessThanOrEqualTo(String value) {
            addCriterion("MCLO.MBR_LGN_ID <=", value, "mbrLgnId");
            return (Criteria) this;
        }

        public Criteria andMbrLgnIdLike(String value) {
            addCriterion("MCLO.MBR_LGN_ID like", value, "mbrLgnId");
            return (Criteria) this;
        }

        public Criteria andMbrLgnIdNotLike(String value) {
            addCriterion("MCLO.MBR_LGN_ID not like", value, "mbrLgnId");
            return (Criteria) this;
        }

        public Criteria andMbrLgnIdIn(List<String> values) {
            addCriterion("MCLO.MBR_LGN_ID in", values, "mbrLgnId");
            return (Criteria) this;
        }

        public Criteria andMbrLgnIdNotIn(List<String> values) {
            addCriterion("MCLO.MBR_LGN_ID not in", values, "mbrLgnId");
            return (Criteria) this;
        }

        public Criteria andMbrLgnIdBetween(String value1, String value2) {
            addCriterion("MCLO.MBR_LGN_ID between", value1, value2, "mbrLgnId");
            return (Criteria) this;
        }

        public Criteria andMbrLgnIdNotBetween(String value1, String value2) {
            addCriterion("MCLO.MBR_LGN_ID not between", value1, value2, "mbrLgnId");
            return (Criteria) this;
        }

        public Criteria andClosePathCdIsNull() {
            addCriterion("MCLO.CLOSE_PATH_CD is null");
            return (Criteria) this;
        }

        public Criteria andClosePathCdIsNotNull() {
            addCriterion("MCLO.CLOSE_PATH_CD is not null");
            return (Criteria) this;
        }

        public Criteria andClosePathCdEqualTo(String value) {
            addCriterion("MCLO.CLOSE_PATH_CD =", value, "closePathCd");
            return (Criteria) this;
        }

        public Criteria andClosePathCdNotEqualTo(String value) {
            addCriterion("MCLO.CLOSE_PATH_CD <>", value, "closePathCd");
            return (Criteria) this;
        }

        public Criteria andClosePathCdGreaterThan(String value) {
            addCriterion("MCLO.CLOSE_PATH_CD >", value, "closePathCd");
            return (Criteria) this;
        }

        public Criteria andClosePathCdGreaterThanOrEqualTo(String value) {
            addCriterion("MCLO.CLOSE_PATH_CD >=", value, "closePathCd");
            return (Criteria) this;
        }

        public Criteria andClosePathCdLessThan(String value) {
            addCriterion("MCLO.CLOSE_PATH_CD <", value, "closePathCd");
            return (Criteria) this;
        }

        public Criteria andClosePathCdLessThanOrEqualTo(String value) {
            addCriterion("MCLO.CLOSE_PATH_CD <=", value, "closePathCd");
            return (Criteria) this;
        }

        public Criteria andClosePathCdLike(String value) {
            addCriterion("MCLO.CLOSE_PATH_CD like", value, "closePathCd");
            return (Criteria) this;
        }

        public Criteria andClosePathCdNotLike(String value) {
            addCriterion("MCLO.CLOSE_PATH_CD not like", value, "closePathCd");
            return (Criteria) this;
        }

        public Criteria andClosePathCdIn(List<String> values) {
            addCriterion("MCLO.CLOSE_PATH_CD in", values, "closePathCd");
            return (Criteria) this;
        }

        public Criteria andClosePathCdNotIn(List<String> values) {
            addCriterion("MCLO.CLOSE_PATH_CD not in", values, "closePathCd");
            return (Criteria) this;
        }

        public Criteria andClosePathCdBetween(String value1, String value2) {
            addCriterion("MCLO.CLOSE_PATH_CD between", value1, value2, "closePathCd");
            return (Criteria) this;
        }

        public Criteria andClosePathCdNotBetween(String value1, String value2) {
            addCriterion("MCLO.CLOSE_PATH_CD not between", value1, value2, "closePathCd");
            return (Criteria) this;
        }

        public Criteria andCloseAgrYnIsNull() {
            addCriterion("MCLO.CLOSE_AGR_YN is null");
            return (Criteria) this;
        }

        public Criteria andCloseAgrYnIsNotNull() {
            addCriterion("MCLO.CLOSE_AGR_YN is not null");
            return (Criteria) this;
        }

        public Criteria andCloseAgrYnEqualTo(String value) {
            addCriterion("MCLO.CLOSE_AGR_YN =", value, "closeAgrYn");
            return (Criteria) this;
        }

        public Criteria andCloseAgrYnNotEqualTo(String value) {
            addCriterion("MCLO.CLOSE_AGR_YN <>", value, "closeAgrYn");
            return (Criteria) this;
        }

        public Criteria andCloseAgrYnGreaterThan(String value) {
            addCriterion("MCLO.CLOSE_AGR_YN >", value, "closeAgrYn");
            return (Criteria) this;
        }

        public Criteria andCloseAgrYnGreaterThanOrEqualTo(String value) {
            addCriterion("MCLO.CLOSE_AGR_YN >=", value, "closeAgrYn");
            return (Criteria) this;
        }

        public Criteria andCloseAgrYnLessThan(String value) {
            addCriterion("MCLO.CLOSE_AGR_YN <", value, "closeAgrYn");
            return (Criteria) this;
        }

        public Criteria andCloseAgrYnLessThanOrEqualTo(String value) {
            addCriterion("MCLO.CLOSE_AGR_YN <=", value, "closeAgrYn");
            return (Criteria) this;
        }

        public Criteria andCloseAgrYnLike(String value) {
            addCriterion("MCLO.CLOSE_AGR_YN like", value, "closeAgrYn");
            return (Criteria) this;
        }

        public Criteria andCloseAgrYnNotLike(String value) {
            addCriterion("MCLO.CLOSE_AGR_YN not like", value, "closeAgrYn");
            return (Criteria) this;
        }

        public Criteria andCloseAgrYnIn(List<String> values) {
            addCriterion("MCLO.CLOSE_AGR_YN in", values, "closeAgrYn");
            return (Criteria) this;
        }

        public Criteria andCloseAgrYnNotIn(List<String> values) {
            addCriterion("MCLO.CLOSE_AGR_YN not in", values, "closeAgrYn");
            return (Criteria) this;
        }

        public Criteria andCloseAgrYnBetween(String value1, String value2) {
            addCriterion("MCLO.CLOSE_AGR_YN between", value1, value2, "closeAgrYn");
            return (Criteria) this;
        }

        public Criteria andCloseAgrYnNotBetween(String value1, String value2) {
            addCriterion("MCLO.CLOSE_AGR_YN not between", value1, value2, "closeAgrYn");
            return (Criteria) this;
        }

        public Criteria andCloseAgrDtIsNull() {
            addCriterion("MCLO.CLOSE_AGR_DT is null");
            return (Criteria) this;
        }

        public Criteria andCloseAgrDtIsNotNull() {
            addCriterion("MCLO.CLOSE_AGR_DT is not null");
            return (Criteria) this;
        }

        public Criteria andCloseAgrDtEqualTo(Date value) {
            addCriterionForJDBCDate("MCLO.CLOSE_AGR_DT =", value, "closeAgrDt");
            return (Criteria) this;
        }

        public Criteria andCloseAgrDtNotEqualTo(Date value) {
            addCriterionForJDBCDate("MCLO.CLOSE_AGR_DT <>", value, "closeAgrDt");
            return (Criteria) this;
        }

        public Criteria andCloseAgrDtGreaterThan(Date value) {
            addCriterionForJDBCDate("MCLO.CLOSE_AGR_DT >", value, "closeAgrDt");
            return (Criteria) this;
        }

        public Criteria andCloseAgrDtGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("MCLO.CLOSE_AGR_DT >=", value, "closeAgrDt");
            return (Criteria) this;
        }

        public Criteria andCloseAgrDtLessThan(Date value) {
            addCriterionForJDBCDate("MCLO.CLOSE_AGR_DT <", value, "closeAgrDt");
            return (Criteria) this;
        }

        public Criteria andCloseAgrDtLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("MCLO.CLOSE_AGR_DT <=", value, "closeAgrDt");
            return (Criteria) this;
        }

        public Criteria andCloseAgrDtIn(List<Date> values) {
            addCriterionForJDBCDate("MCLO.CLOSE_AGR_DT in", values, "closeAgrDt");
            return (Criteria) this;
        }

        public Criteria andCloseAgrDtNotIn(List<Date> values) {
            addCriterionForJDBCDate("MCLO.CLOSE_AGR_DT not in", values, "closeAgrDt");
            return (Criteria) this;
        }

        public Criteria andCloseAgrDtBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("MCLO.CLOSE_AGR_DT between", value1, value2, "closeAgrDt");
            return (Criteria) this;
        }

        public Criteria andCloseAgrDtNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("MCLO.CLOSE_AGR_DT not between", value1, value2, "closeAgrDt");
            return (Criteria) this;
        }

        public Criteria andCloseDtIsNull() {
            addCriterion("MCLO.CLOSE_DT is null");
            return (Criteria) this;
        }

        public Criteria andCloseDtIsNotNull() {
            addCriterion("MCLO.CLOSE_DT is not null");
            return (Criteria) this;
        }

        public Criteria andCloseDtEqualTo(Date value) {
            addCriterionForJDBCDate("MCLO.CLOSE_DT =", value, "closeDt");
            return (Criteria) this;
        }

        public Criteria andCloseDtNotEqualTo(Date value) {
            addCriterionForJDBCDate("MCLO.CLOSE_DT <>", value, "closeDt");
            return (Criteria) this;
        }

        public Criteria andCloseDtGreaterThan(Date value) {
            addCriterionForJDBCDate("MCLO.CLOSE_DT >", value, "closeDt");
            return (Criteria) this;
        }

        public Criteria andCloseDtGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("MCLO.CLOSE_DT >=", value, "closeDt");
            return (Criteria) this;
        }

        public Criteria andCloseDtLessThan(Date value) {
            addCriterionForJDBCDate("MCLO.CLOSE_DT <", value, "closeDt");
            return (Criteria) this;
        }

        public Criteria andCloseDtLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("MCLO.CLOSE_DT <=", value, "closeDt");
            return (Criteria) this;
        }

        public Criteria andCloseDtIn(List<Date> values) {
            addCriterionForJDBCDate("MCLO.CLOSE_DT in", values, "closeDt");
            return (Criteria) this;
        }

        public Criteria andCloseDtNotIn(List<Date> values) {
            addCriterionForJDBCDate("MCLO.CLOSE_DT not in", values, "closeDt");
            return (Criteria) this;
        }

        public Criteria andCloseDtBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("MCLO.CLOSE_DT between", value1, value2, "closeDt");
            return (Criteria) this;
        }

        public Criteria andCloseDtNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("MCLO.CLOSE_DT not between", value1, value2, "closeDt");
            return (Criteria) this;
        }

        public Criteria andCloseIpAddrIsNull() {
            addCriterion("MCLO.CLOSE_IP_ADDR is null");
            return (Criteria) this;
        }

        public Criteria andCloseIpAddrIsNotNull() {
            addCriterion("MCLO.CLOSE_IP_ADDR is not null");
            return (Criteria) this;
        }

        public Criteria andCloseIpAddrEqualTo(String value) {
            addCriterion("MCLO.CLOSE_IP_ADDR =", value, "closeIpAddr");
            return (Criteria) this;
        }

        public Criteria andCloseIpAddrNotEqualTo(String value) {
            addCriterion("MCLO.CLOSE_IP_ADDR <>", value, "closeIpAddr");
            return (Criteria) this;
        }

        public Criteria andCloseIpAddrGreaterThan(String value) {
            addCriterion("MCLO.CLOSE_IP_ADDR >", value, "closeIpAddr");
            return (Criteria) this;
        }

        public Criteria andCloseIpAddrGreaterThanOrEqualTo(String value) {
            addCriterion("MCLO.CLOSE_IP_ADDR >=", value, "closeIpAddr");
            return (Criteria) this;
        }

        public Criteria andCloseIpAddrLessThan(String value) {
            addCriterion("MCLO.CLOSE_IP_ADDR <", value, "closeIpAddr");
            return (Criteria) this;
        }

        public Criteria andCloseIpAddrLessThanOrEqualTo(String value) {
            addCriterion("MCLO.CLOSE_IP_ADDR <=", value, "closeIpAddr");
            return (Criteria) this;
        }

        public Criteria andCloseIpAddrLike(String value) {
            addCriterion("MCLO.CLOSE_IP_ADDR like", value, "closeIpAddr");
            return (Criteria) this;
        }

        public Criteria andCloseIpAddrNotLike(String value) {
            addCriterion("MCLO.CLOSE_IP_ADDR not like", value, "closeIpAddr");
            return (Criteria) this;
        }

        public Criteria andCloseIpAddrIn(List<String> values) {
            addCriterion("MCLO.CLOSE_IP_ADDR in", values, "closeIpAddr");
            return (Criteria) this;
        }

        public Criteria andCloseIpAddrNotIn(List<String> values) {
            addCriterion("MCLO.CLOSE_IP_ADDR not in", values, "closeIpAddr");
            return (Criteria) this;
        }

        public Criteria andCloseIpAddrBetween(String value1, String value2) {
            addCriterion("MCLO.CLOSE_IP_ADDR between", value1, value2, "closeIpAddr");
            return (Criteria) this;
        }

        public Criteria andCloseIpAddrNotBetween(String value1, String value2) {
            addCriterion("MCLO.CLOSE_IP_ADDR not between", value1, value2, "closeIpAddr");
            return (Criteria) this;
        }

        public Criteria andRegDtIsNull() {
            addCriterion("MCLO.REG_DT is null");
            return (Criteria) this;
        }

        public Criteria andRegDtIsNotNull() {
            addCriterion("MCLO.REG_DT is not null");
            return (Criteria) this;
        }

        public Criteria andRegDtEqualTo(Date value) {
            addCriterion("MCLO.REG_DT =", value, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtNotEqualTo(Date value) {
            addCriterion("MCLO.REG_DT <>", value, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtGreaterThan(Date value) {
            addCriterion("MCLO.REG_DT >", value, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtGreaterThanOrEqualTo(Date value) {
            addCriterion("MCLO.REG_DT >=", value, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtLessThan(Date value) {
            addCriterion("MCLO.REG_DT <", value, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtLessThanOrEqualTo(Date value) {
            addCriterion("MCLO.REG_DT <=", value, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtIn(List<Date> values) {
            addCriterion("MCLO.REG_DT in", values, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtNotIn(List<Date> values) {
            addCriterion("MCLO.REG_DT not in", values, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtBetween(Date value1, Date value2) {
            addCriterion("MCLO.REG_DT between", value1, value2, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtNotBetween(Date value1, Date value2) {
            addCriterion("MCLO.REG_DT not between", value1, value2, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegIdIsNull() {
            addCriterion("MCLO.REG_ID is null");
            return (Criteria) this;
        }

        public Criteria andRegIdIsNotNull() {
            addCriterion("MCLO.REG_ID is not null");
            return (Criteria) this;
        }

        public Criteria andRegIdEqualTo(String value) {
            addCriterion("MCLO.REG_ID =", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdNotEqualTo(String value) {
            addCriterion("MCLO.REG_ID <>", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdGreaterThan(String value) {
            addCriterion("MCLO.REG_ID >", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdGreaterThanOrEqualTo(String value) {
            addCriterion("MCLO.REG_ID >=", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdLessThan(String value) {
            addCriterion("MCLO.REG_ID <", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdLessThanOrEqualTo(String value) {
            addCriterion("MCLO.REG_ID <=", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdLike(String value) {
            addCriterion("MCLO.REG_ID like", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdNotLike(String value) {
            addCriterion("MCLO.REG_ID not like", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdIn(List<String> values) {
            addCriterion("MCLO.REG_ID in", values, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdNotIn(List<String> values) {
            addCriterion("MCLO.REG_ID not in", values, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdBetween(String value1, String value2) {
            addCriterion("MCLO.REG_ID between", value1, value2, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdNotBetween(String value1, String value2) {
            addCriterion("MCLO.REG_ID not between", value1, value2, "regId");
            return (Criteria) this;
        }

        public Criteria andMbrIdLikeInsensitive(String value) {
            addCriterion("upper(MCLO.MBR_ID) like", value.toUpperCase(), "mbrId");
            return (Criteria) this;
        }

        public Criteria andMbrLgnIdLikeInsensitive(String value) {
            addCriterion("upper(MCLO.MBR_LGN_ID) like", value.toUpperCase(), "mbrLgnId");
            return (Criteria) this;
        }

        public Criteria andClosePathCdLikeInsensitive(String value) {
            addCriterion("upper(MCLO.CLOSE_PATH_CD) like", value.toUpperCase(), "closePathCd");
            return (Criteria) this;
        }

        public Criteria andCloseAgrYnLikeInsensitive(String value) {
            addCriterion("upper(MCLO.CLOSE_AGR_YN) like", value.toUpperCase(), "closeAgrYn");
            return (Criteria) this;
        }

        public Criteria andCloseIpAddrLikeInsensitive(String value) {
            addCriterion("upper(MCLO.CLOSE_IP_ADDR) like", value.toUpperCase(), "closeIpAddr");
            return (Criteria) this;
        }

        public Criteria andRegIdLikeInsensitive(String value) {
            addCriterion("upper(MCLO.REG_ID) like", value.toUpperCase(), "regId");
            return (Criteria) this;
        }

        public Criteria andMbrIdLikeLeft(String value) {
            addCriterion("MCLO.MBR_ID like ", "%" + value, "mbrId");
            return (Criteria) this;
        }

        public Criteria andMbrIdLikeRight(String value) {
            addCriterion("MCLO.MBR_ID like ", value + "%", "mbrId");
            return (Criteria) this;
        }

        public Criteria andMbrIdLikeBoth(String value) {
            addCriterion("MCLO.MBR_ID like ", "%" + value + "%", "mbrId");
            return (Criteria) this;
        }

        public Criteria andMbrLgnIdLikeLeft(String value) {
            addCriterion("MCLO.MBR_LGN_ID like ", "%" + value, "mbrLgnId");
            return (Criteria) this;
        }

        public Criteria andMbrLgnIdLikeRight(String value) {
            addCriterion("MCLO.MBR_LGN_ID like ", value + "%", "mbrLgnId");
            return (Criteria) this;
        }

        public Criteria andMbrLgnIdLikeBoth(String value) {
            addCriterion("MCLO.MBR_LGN_ID like ", "%" + value + "%", "mbrLgnId");
            return (Criteria) this;
        }

        public Criteria andClosePathCdLikeLeft(String value) {
            addCriterion("MCLO.CLOSE_PATH_CD like ", "%" + value, "closePathCd");
            return (Criteria) this;
        }

        public Criteria andClosePathCdLikeRight(String value) {
            addCriterion("MCLO.CLOSE_PATH_CD like ", value + "%", "closePathCd");
            return (Criteria) this;
        }

        public Criteria andClosePathCdLikeBoth(String value) {
            addCriterion("MCLO.CLOSE_PATH_CD like ", "%" + value + "%", "closePathCd");
            return (Criteria) this;
        }

        public Criteria andCloseAgrYnLikeLeft(String value) {
            addCriterion("MCLO.CLOSE_AGR_YN like ", "%" + value, "closeAgrYn");
            return (Criteria) this;
        }

        public Criteria andCloseAgrYnLikeRight(String value) {
            addCriterion("MCLO.CLOSE_AGR_YN like ", value + "%", "closeAgrYn");
            return (Criteria) this;
        }

        public Criteria andCloseAgrYnLikeBoth(String value) {
            addCriterion("MCLO.CLOSE_AGR_YN like ", "%" + value + "%", "closeAgrYn");
            return (Criteria) this;
        }

        public Criteria andCloseIpAddrLikeLeft(String value) {
            addCriterion("MCLO.CLOSE_IP_ADDR like ", "%" + value, "closeIpAddr");
            return (Criteria) this;
        }

        public Criteria andCloseIpAddrLikeRight(String value) {
            addCriterion("MCLO.CLOSE_IP_ADDR like ", value + "%", "closeIpAddr");
            return (Criteria) this;
        }

        public Criteria andCloseIpAddrLikeBoth(String value) {
            addCriterion("MCLO.CLOSE_IP_ADDR like ", "%" + value + "%", "closeIpAddr");
            return (Criteria) this;
        }

        public Criteria andRegIdLikeLeft(String value) {
            addCriterion("MCLO.REG_ID like ", "%" + value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdLikeRight(String value) {
            addCriterion("MCLO.REG_ID like ", value + "%", "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdLikeBoth(String value) {
            addCriterion("MCLO.REG_ID like ", "%" + value + "%", "regId");
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