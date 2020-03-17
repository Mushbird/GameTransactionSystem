package com.mushbird.sinsege.base.module.item.model.entity.criteria;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ItemCommentEntityCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    public ItemCommentEntityCriteria() {
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

        public Criteria andItemCmtIdIsNull() {
            addCriterion("TIC.ITEM_CMT_ID is null");
            return (Criteria) this;
        }

        public Criteria andItemCmtIdIsNotNull() {
            addCriterion("TIC.ITEM_CMT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andItemCmtIdEqualTo(Integer value) {
            addCriterion("TIC.ITEM_CMT_ID =", value, "itemCmtId");
            return (Criteria) this;
        }

        public Criteria andItemCmtIdNotEqualTo(Integer value) {
            addCriterion("TIC.ITEM_CMT_ID <>", value, "itemCmtId");
            return (Criteria) this;
        }

        public Criteria andItemCmtIdGreaterThan(Integer value) {
            addCriterion("TIC.ITEM_CMT_ID >", value, "itemCmtId");
            return (Criteria) this;
        }

        public Criteria andItemCmtIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("TIC.ITEM_CMT_ID >=", value, "itemCmtId");
            return (Criteria) this;
        }

        public Criteria andItemCmtIdLessThan(Integer value) {
            addCriterion("TIC.ITEM_CMT_ID <", value, "itemCmtId");
            return (Criteria) this;
        }

        public Criteria andItemCmtIdLessThanOrEqualTo(Integer value) {
            addCriterion("TIC.ITEM_CMT_ID <=", value, "itemCmtId");
            return (Criteria) this;
        }

        public Criteria andItemCmtIdIn(List<Integer> values) {
            addCriterion("TIC.ITEM_CMT_ID in", values, "itemCmtId");
            return (Criteria) this;
        }

        public Criteria andItemCmtIdNotIn(List<Integer> values) {
            addCriterion("TIC.ITEM_CMT_ID not in", values, "itemCmtId");
            return (Criteria) this;
        }

        public Criteria andItemCmtIdBetween(Integer value1, Integer value2) {
            addCriterion("TIC.ITEM_CMT_ID between", value1, value2, "itemCmtId");
            return (Criteria) this;
        }

        public Criteria andItemCmtIdNotBetween(Integer value1, Integer value2) {
            addCriterion("TIC.ITEM_CMT_ID not between", value1, value2, "itemCmtId");
            return (Criteria) this;
        }

        public Criteria andItemIdIsNull() {
            addCriterion("TIC.ITEM_ID is null");
            return (Criteria) this;
        }

        public Criteria andItemIdIsNotNull() {
            addCriterion("TIC.ITEM_ID is not null");
            return (Criteria) this;
        }

        public Criteria andItemIdEqualTo(Integer value) {
            addCriterion("TIC.ITEM_ID =", value, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdNotEqualTo(Integer value) {
            addCriterion("TIC.ITEM_ID <>", value, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdGreaterThan(Integer value) {
            addCriterion("TIC.ITEM_ID >", value, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("TIC.ITEM_ID >=", value, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdLessThan(Integer value) {
            addCriterion("TIC.ITEM_ID <", value, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdLessThanOrEqualTo(Integer value) {
            addCriterion("TIC.ITEM_ID <=", value, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdIn(List<Integer> values) {
            addCriterion("TIC.ITEM_ID in", values, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdNotIn(List<Integer> values) {
            addCriterion("TIC.ITEM_ID not in", values, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdBetween(Integer value1, Integer value2) {
            addCriterion("TIC.ITEM_ID between", value1, value2, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdNotBetween(Integer value1, Integer value2) {
            addCriterion("TIC.ITEM_ID not between", value1, value2, "itemId");
            return (Criteria) this;
        }

        public Criteria andMbrIdIsNull() {
            addCriterion("TIC.MBR_ID is null");
            return (Criteria) this;
        }

        public Criteria andMbrIdIsNotNull() {
            addCriterion("TIC.MBR_ID is not null");
            return (Criteria) this;
        }

        public Criteria andMbrIdEqualTo(String value) {
            addCriterion("TIC.MBR_ID =", value, "mbrId");
            return (Criteria) this;
        }

        public Criteria andMbrIdNotEqualTo(String value) {
            addCriterion("TIC.MBR_ID <>", value, "mbrId");
            return (Criteria) this;
        }

        public Criteria andMbrIdGreaterThan(String value) {
            addCriterion("TIC.MBR_ID >", value, "mbrId");
            return (Criteria) this;
        }

        public Criteria andMbrIdGreaterThanOrEqualTo(String value) {
            addCriterion("TIC.MBR_ID >=", value, "mbrId");
            return (Criteria) this;
        }

        public Criteria andMbrIdLessThan(String value) {
            addCriterion("TIC.MBR_ID <", value, "mbrId");
            return (Criteria) this;
        }

        public Criteria andMbrIdLessThanOrEqualTo(String value) {
            addCriterion("TIC.MBR_ID <=", value, "mbrId");
            return (Criteria) this;
        }

        public Criteria andMbrIdLike(String value) {
            addCriterion("TIC.MBR_ID like", value, "mbrId");
            return (Criteria) this;
        }

        public Criteria andMbrIdNotLike(String value) {
            addCriterion("TIC.MBR_ID not like", value, "mbrId");
            return (Criteria) this;
        }

        public Criteria andMbrIdIn(List<String> values) {
            addCriterion("TIC.MBR_ID in", values, "mbrId");
            return (Criteria) this;
        }

        public Criteria andMbrIdNotIn(List<String> values) {
            addCriterion("TIC.MBR_ID not in", values, "mbrId");
            return (Criteria) this;
        }

        public Criteria andMbrIdBetween(String value1, String value2) {
            addCriterion("TIC.MBR_ID between", value1, value2, "mbrId");
            return (Criteria) this;
        }

        public Criteria andMbrIdNotBetween(String value1, String value2) {
            addCriterion("TIC.MBR_ID not between", value1, value2, "mbrId");
            return (Criteria) this;
        }

        public Criteria andOrdItemIdIsNull() {
            addCriterion("TIC.ORD_ITEM_ID is null");
            return (Criteria) this;
        }

        public Criteria andOrdItemIdIsNotNull() {
            addCriterion("TIC.ORD_ITEM_ID is not null");
            return (Criteria) this;
        }

        public Criteria andOrdItemIdEqualTo(Integer value) {
            addCriterion("TIC.ORD_ITEM_ID =", value, "ordItemId");
            return (Criteria) this;
        }

        public Criteria andOrdItemIdNotEqualTo(Integer value) {
            addCriterion("TIC.ORD_ITEM_ID <>", value, "ordItemId");
            return (Criteria) this;
        }

        public Criteria andOrdItemIdGreaterThan(Integer value) {
            addCriterion("TIC.ORD_ITEM_ID >", value, "ordItemId");
            return (Criteria) this;
        }

        public Criteria andOrdItemIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("TIC.ORD_ITEM_ID >=", value, "ordItemId");
            return (Criteria) this;
        }

        public Criteria andOrdItemIdLessThan(Integer value) {
            addCriterion("TIC.ORD_ITEM_ID <", value, "ordItemId");
            return (Criteria) this;
        }

        public Criteria andOrdItemIdLessThanOrEqualTo(Integer value) {
            addCriterion("TIC.ORD_ITEM_ID <=", value, "ordItemId");
            return (Criteria) this;
        }

        public Criteria andOrdItemIdIn(List<Integer> values) {
            addCriterion("TIC.ORD_ITEM_ID in", values, "ordItemId");
            return (Criteria) this;
        }

        public Criteria andOrdItemIdNotIn(List<Integer> values) {
            addCriterion("TIC.ORD_ITEM_ID not in", values, "ordItemId");
            return (Criteria) this;
        }

        public Criteria andOrdItemIdBetween(Integer value1, Integer value2) {
            addCriterion("TIC.ORD_ITEM_ID between", value1, value2, "ordItemId");
            return (Criteria) this;
        }

        public Criteria andOrdItemIdNotBetween(Integer value1, Integer value2) {
            addCriterion("TIC.ORD_ITEM_ID not between", value1, value2, "ordItemId");
            return (Criteria) this;
        }

        public Criteria andItemCmtTpCdIsNull() {
            addCriterion("TIC.ITEM_CMT_TP_CD is null");
            return (Criteria) this;
        }

        public Criteria andItemCmtTpCdIsNotNull() {
            addCriterion("TIC.ITEM_CMT_TP_CD is not null");
            return (Criteria) this;
        }

        public Criteria andItemCmtTpCdEqualTo(String value) {
            addCriterion("TIC.ITEM_CMT_TP_CD =", value, "itemCmtTpCd");
            return (Criteria) this;
        }

        public Criteria andItemCmtTpCdNotEqualTo(String value) {
            addCriterion("TIC.ITEM_CMT_TP_CD <>", value, "itemCmtTpCd");
            return (Criteria) this;
        }

        public Criteria andItemCmtTpCdGreaterThan(String value) {
            addCriterion("TIC.ITEM_CMT_TP_CD >", value, "itemCmtTpCd");
            return (Criteria) this;
        }

        public Criteria andItemCmtTpCdGreaterThanOrEqualTo(String value) {
            addCriterion("TIC.ITEM_CMT_TP_CD >=", value, "itemCmtTpCd");
            return (Criteria) this;
        }

        public Criteria andItemCmtTpCdLessThan(String value) {
            addCriterion("TIC.ITEM_CMT_TP_CD <", value, "itemCmtTpCd");
            return (Criteria) this;
        }

        public Criteria andItemCmtTpCdLessThanOrEqualTo(String value) {
            addCriterion("TIC.ITEM_CMT_TP_CD <=", value, "itemCmtTpCd");
            return (Criteria) this;
        }

        public Criteria andItemCmtTpCdLike(String value) {
            addCriterion("TIC.ITEM_CMT_TP_CD like", value, "itemCmtTpCd");
            return (Criteria) this;
        }

        public Criteria andItemCmtTpCdNotLike(String value) {
            addCriterion("TIC.ITEM_CMT_TP_CD not like", value, "itemCmtTpCd");
            return (Criteria) this;
        }

        public Criteria andItemCmtTpCdIn(List<String> values) {
            addCriterion("TIC.ITEM_CMT_TP_CD in", values, "itemCmtTpCd");
            return (Criteria) this;
        }

        public Criteria andItemCmtTpCdNotIn(List<String> values) {
            addCriterion("TIC.ITEM_CMT_TP_CD not in", values, "itemCmtTpCd");
            return (Criteria) this;
        }

        public Criteria andItemCmtTpCdBetween(String value1, String value2) {
            addCriterion("TIC.ITEM_CMT_TP_CD between", value1, value2, "itemCmtTpCd");
            return (Criteria) this;
        }

        public Criteria andItemCmtTpCdNotBetween(String value1, String value2) {
            addCriterion("TIC.ITEM_CMT_TP_CD not between", value1, value2, "itemCmtTpCd");
            return (Criteria) this;
        }

        public Criteria andTitIsNull() {
            addCriterion("TIC.TIT is null");
            return (Criteria) this;
        }

        public Criteria andTitIsNotNull() {
            addCriterion("TIC.TIT is not null");
            return (Criteria) this;
        }

        public Criteria andTitEqualTo(String value) {
            addCriterion("TIC.TIT =", value, "tit");
            return (Criteria) this;
        }

        public Criteria andTitNotEqualTo(String value) {
            addCriterion("TIC.TIT <>", value, "tit");
            return (Criteria) this;
        }

        public Criteria andTitGreaterThan(String value) {
            addCriterion("TIC.TIT >", value, "tit");
            return (Criteria) this;
        }

        public Criteria andTitGreaterThanOrEqualTo(String value) {
            addCriterion("TIC.TIT >=", value, "tit");
            return (Criteria) this;
        }

        public Criteria andTitLessThan(String value) {
            addCriterion("TIC.TIT <", value, "tit");
            return (Criteria) this;
        }

        public Criteria andTitLessThanOrEqualTo(String value) {
            addCriterion("TIC.TIT <=", value, "tit");
            return (Criteria) this;
        }

        public Criteria andTitLike(String value) {
            addCriterion("TIC.TIT like", value, "tit");
            return (Criteria) this;
        }

        public Criteria andTitNotLike(String value) {
            addCriterion("TIC.TIT not like", value, "tit");
            return (Criteria) this;
        }

        public Criteria andTitIn(List<String> values) {
            addCriterion("TIC.TIT in", values, "tit");
            return (Criteria) this;
        }

        public Criteria andTitNotIn(List<String> values) {
            addCriterion("TIC.TIT not in", values, "tit");
            return (Criteria) this;
        }

        public Criteria andTitBetween(String value1, String value2) {
            addCriterion("TIC.TIT between", value1, value2, "tit");
            return (Criteria) this;
        }

        public Criteria andTitNotBetween(String value1, String value2) {
            addCriterion("TIC.TIT not between", value1, value2, "tit");
            return (Criteria) this;
        }

        public Criteria andContIsNull() {
            addCriterion("TIC.CONT is null");
            return (Criteria) this;
        }

        public Criteria andContIsNotNull() {
            addCriterion("TIC.CONT is not null");
            return (Criteria) this;
        }

        public Criteria andContEqualTo(String value) {
            addCriterion("TIC.CONT =", value, "cont");
            return (Criteria) this;
        }

        public Criteria andContNotEqualTo(String value) {
            addCriterion("TIC.CONT <>", value, "cont");
            return (Criteria) this;
        }

        public Criteria andContGreaterThan(String value) {
            addCriterion("TIC.CONT >", value, "cont");
            return (Criteria) this;
        }

        public Criteria andContGreaterThanOrEqualTo(String value) {
            addCriterion("TIC.CONT >=", value, "cont");
            return (Criteria) this;
        }

        public Criteria andContLessThan(String value) {
            addCriterion("TIC.CONT <", value, "cont");
            return (Criteria) this;
        }

        public Criteria andContLessThanOrEqualTo(String value) {
            addCriterion("TIC.CONT <=", value, "cont");
            return (Criteria) this;
        }

        public Criteria andContLike(String value) {
            addCriterion("TIC.CONT like", value, "cont");
            return (Criteria) this;
        }

        public Criteria andContNotLike(String value) {
            addCriterion("TIC.CONT not like", value, "cont");
            return (Criteria) this;
        }

        public Criteria andContIn(List<String> values) {
            addCriterion("TIC.CONT in", values, "cont");
            return (Criteria) this;
        }

        public Criteria andContNotIn(List<String> values) {
            addCriterion("TIC.CONT not in", values, "cont");
            return (Criteria) this;
        }

        public Criteria andContBetween(String value1, String value2) {
            addCriterion("TIC.CONT between", value1, value2, "cont");
            return (Criteria) this;
        }

        public Criteria andContNotBetween(String value1, String value2) {
            addCriterion("TIC.CONT not between", value1, value2, "cont");
            return (Criteria) this;
        }

        public Criteria andStarPtIsNull() {
            addCriterion("TIC.STAR_PT is null");
            return (Criteria) this;
        }

        public Criteria andStarPtIsNotNull() {
            addCriterion("TIC.STAR_PT is not null");
            return (Criteria) this;
        }

        public Criteria andStarPtEqualTo(BigDecimal value) {
            addCriterion("TIC.STAR_PT =", value, "starPt");
            return (Criteria) this;
        }

        public Criteria andStarPtNotEqualTo(BigDecimal value) {
            addCriterion("TIC.STAR_PT <>", value, "starPt");
            return (Criteria) this;
        }

        public Criteria andStarPtGreaterThan(BigDecimal value) {
            addCriterion("TIC.STAR_PT >", value, "starPt");
            return (Criteria) this;
        }

        public Criteria andStarPtGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("TIC.STAR_PT >=", value, "starPt");
            return (Criteria) this;
        }

        public Criteria andStarPtLessThan(BigDecimal value) {
            addCriterion("TIC.STAR_PT <", value, "starPt");
            return (Criteria) this;
        }

        public Criteria andStarPtLessThanOrEqualTo(BigDecimal value) {
            addCriterion("TIC.STAR_PT <=", value, "starPt");
            return (Criteria) this;
        }

        public Criteria andStarPtIn(List<BigDecimal> values) {
            addCriterion("TIC.STAR_PT in", values, "starPt");
            return (Criteria) this;
        }

        public Criteria andStarPtNotIn(List<BigDecimal> values) {
            addCriterion("TIC.STAR_PT not in", values, "starPt");
            return (Criteria) this;
        }

        public Criteria andStarPtBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TIC.STAR_PT between", value1, value2, "starPt");
            return (Criteria) this;
        }

        public Criteria andStarPtNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TIC.STAR_PT not between", value1, value2, "starPt");
            return (Criteria) this;
        }

        public Criteria andRegEnvCdIsNull() {
            addCriterion("TIC.REG_ENV_CD is null");
            return (Criteria) this;
        }

        public Criteria andRegEnvCdIsNotNull() {
            addCriterion("TIC.REG_ENV_CD is not null");
            return (Criteria) this;
        }

        public Criteria andRegEnvCdEqualTo(String value) {
            addCriterion("TIC.REG_ENV_CD =", value, "regEnvCd");
            return (Criteria) this;
        }

        public Criteria andRegEnvCdNotEqualTo(String value) {
            addCriterion("TIC.REG_ENV_CD <>", value, "regEnvCd");
            return (Criteria) this;
        }

        public Criteria andRegEnvCdGreaterThan(String value) {
            addCriterion("TIC.REG_ENV_CD >", value, "regEnvCd");
            return (Criteria) this;
        }

        public Criteria andRegEnvCdGreaterThanOrEqualTo(String value) {
            addCriterion("TIC.REG_ENV_CD >=", value, "regEnvCd");
            return (Criteria) this;
        }

        public Criteria andRegEnvCdLessThan(String value) {
            addCriterion("TIC.REG_ENV_CD <", value, "regEnvCd");
            return (Criteria) this;
        }

        public Criteria andRegEnvCdLessThanOrEqualTo(String value) {
            addCriterion("TIC.REG_ENV_CD <=", value, "regEnvCd");
            return (Criteria) this;
        }

        public Criteria andRegEnvCdLike(String value) {
            addCriterion("TIC.REG_ENV_CD like", value, "regEnvCd");
            return (Criteria) this;
        }

        public Criteria andRegEnvCdNotLike(String value) {
            addCriterion("TIC.REG_ENV_CD not like", value, "regEnvCd");
            return (Criteria) this;
        }

        public Criteria andRegEnvCdIn(List<String> values) {
            addCriterion("TIC.REG_ENV_CD in", values, "regEnvCd");
            return (Criteria) this;
        }

        public Criteria andRegEnvCdNotIn(List<String> values) {
            addCriterion("TIC.REG_ENV_CD not in", values, "regEnvCd");
            return (Criteria) this;
        }

        public Criteria andRegEnvCdBetween(String value1, String value2) {
            addCriterion("TIC.REG_ENV_CD between", value1, value2, "regEnvCd");
            return (Criteria) this;
        }

        public Criteria andRegEnvCdNotBetween(String value1, String value2) {
            addCriterion("TIC.REG_ENV_CD not between", value1, value2, "regEnvCd");
            return (Criteria) this;
        }

        public Criteria andDpYnIsNull() {
            addCriterion("TIC.DP_YN is null");
            return (Criteria) this;
        }

        public Criteria andDpYnIsNotNull() {
            addCriterion("TIC.DP_YN is not null");
            return (Criteria) this;
        }

        public Criteria andDpYnEqualTo(String value) {
            addCriterion("TIC.DP_YN =", value, "dpYn");
            return (Criteria) this;
        }

        public Criteria andDpYnNotEqualTo(String value) {
            addCriterion("TIC.DP_YN <>", value, "dpYn");
            return (Criteria) this;
        }

        public Criteria andDpYnGreaterThan(String value) {
            addCriterion("TIC.DP_YN >", value, "dpYn");
            return (Criteria) this;
        }

        public Criteria andDpYnGreaterThanOrEqualTo(String value) {
            addCriterion("TIC.DP_YN >=", value, "dpYn");
            return (Criteria) this;
        }

        public Criteria andDpYnLessThan(String value) {
            addCriterion("TIC.DP_YN <", value, "dpYn");
            return (Criteria) this;
        }

        public Criteria andDpYnLessThanOrEqualTo(String value) {
            addCriterion("TIC.DP_YN <=", value, "dpYn");
            return (Criteria) this;
        }

        public Criteria andDpYnLike(String value) {
            addCriterion("TIC.DP_YN like", value, "dpYn");
            return (Criteria) this;
        }

        public Criteria andDpYnNotLike(String value) {
            addCriterion("TIC.DP_YN not like", value, "dpYn");
            return (Criteria) this;
        }

        public Criteria andDpYnIn(List<String> values) {
            addCriterion("TIC.DP_YN in", values, "dpYn");
            return (Criteria) this;
        }

        public Criteria andDpYnNotIn(List<String> values) {
            addCriterion("TIC.DP_YN not in", values, "dpYn");
            return (Criteria) this;
        }

        public Criteria andDpYnBetween(String value1, String value2) {
            addCriterion("TIC.DP_YN between", value1, value2, "dpYn");
            return (Criteria) this;
        }

        public Criteria andDpYnNotBetween(String value1, String value2) {
            addCriterion("TIC.DP_YN not between", value1, value2, "dpYn");
            return (Criteria) this;
        }

        public Criteria andAtchGidIsNull() {
            addCriterion("TIC.ATCH_GID is null");
            return (Criteria) this;
        }

        public Criteria andAtchGidIsNotNull() {
            addCriterion("TIC.ATCH_GID is not null");
            return (Criteria) this;
        }

        public Criteria andAtchGidEqualTo(Integer value) {
            addCriterion("TIC.ATCH_GID =", value, "atchGid");
            return (Criteria) this;
        }

        public Criteria andAtchGidNotEqualTo(Integer value) {
            addCriterion("TIC.ATCH_GID <>", value, "atchGid");
            return (Criteria) this;
        }

        public Criteria andAtchGidGreaterThan(Integer value) {
            addCriterion("TIC.ATCH_GID >", value, "atchGid");
            return (Criteria) this;
        }

        public Criteria andAtchGidGreaterThanOrEqualTo(Integer value) {
            addCriterion("TIC.ATCH_GID >=", value, "atchGid");
            return (Criteria) this;
        }

        public Criteria andAtchGidLessThan(Integer value) {
            addCriterion("TIC.ATCH_GID <", value, "atchGid");
            return (Criteria) this;
        }

        public Criteria andAtchGidLessThanOrEqualTo(Integer value) {
            addCriterion("TIC.ATCH_GID <=", value, "atchGid");
            return (Criteria) this;
        }

        public Criteria andAtchGidIn(List<Integer> values) {
            addCriterion("TIC.ATCH_GID in", values, "atchGid");
            return (Criteria) this;
        }

        public Criteria andAtchGidNotIn(List<Integer> values) {
            addCriterion("TIC.ATCH_GID not in", values, "atchGid");
            return (Criteria) this;
        }

        public Criteria andAtchGidBetween(Integer value1, Integer value2) {
            addCriterion("TIC.ATCH_GID between", value1, value2, "atchGid");
            return (Criteria) this;
        }

        public Criteria andAtchGidNotBetween(Integer value1, Integer value2) {
            addCriterion("TIC.ATCH_GID not between", value1, value2, "atchGid");
            return (Criteria) this;
        }

        public Criteria andRegDtIsNull() {
            addCriterion("TIC.REG_DT is null");
            return (Criteria) this;
        }

        public Criteria andRegDtIsNotNull() {
            addCriterion("TIC.REG_DT is not null");
            return (Criteria) this;
        }

        public Criteria andRegDtEqualTo(Date value) {
            addCriterion("TIC.REG_DT =", value, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtNotEqualTo(Date value) {
            addCriterion("TIC.REG_DT <>", value, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtGreaterThan(Date value) {
            addCriterion("TIC.REG_DT >", value, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtGreaterThanOrEqualTo(Date value) {
            addCriterion("TIC.REG_DT >=", value, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtLessThan(Date value) {
            addCriterion("TIC.REG_DT <", value, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtLessThanOrEqualTo(Date value) {
            addCriterion("TIC.REG_DT <=", value, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtIn(List<Date> values) {
            addCriterion("TIC.REG_DT in", values, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtNotIn(List<Date> values) {
            addCriterion("TIC.REG_DT not in", values, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtBetween(Date value1, Date value2) {
            addCriterion("TIC.REG_DT between", value1, value2, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtNotBetween(Date value1, Date value2) {
            addCriterion("TIC.REG_DT not between", value1, value2, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegIdIsNull() {
            addCriterion("TIC.REG_ID is null");
            return (Criteria) this;
        }

        public Criteria andRegIdIsNotNull() {
            addCriterion("TIC.REG_ID is not null");
            return (Criteria) this;
        }

        public Criteria andRegIdEqualTo(String value) {
            addCriterion("TIC.REG_ID =", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdNotEqualTo(String value) {
            addCriterion("TIC.REG_ID <>", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdGreaterThan(String value) {
            addCriterion("TIC.REG_ID >", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdGreaterThanOrEqualTo(String value) {
            addCriterion("TIC.REG_ID >=", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdLessThan(String value) {
            addCriterion("TIC.REG_ID <", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdLessThanOrEqualTo(String value) {
            addCriterion("TIC.REG_ID <=", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdLike(String value) {
            addCriterion("TIC.REG_ID like", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdNotLike(String value) {
            addCriterion("TIC.REG_ID not like", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdIn(List<String> values) {
            addCriterion("TIC.REG_ID in", values, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdNotIn(List<String> values) {
            addCriterion("TIC.REG_ID not in", values, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdBetween(String value1, String value2) {
            addCriterion("TIC.REG_ID between", value1, value2, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdNotBetween(String value1, String value2) {
            addCriterion("TIC.REG_ID not between", value1, value2, "regId");
            return (Criteria) this;
        }

        public Criteria andModDtIsNull() {
            addCriterion("TIC.MOD_DT is null");
            return (Criteria) this;
        }

        public Criteria andModDtIsNotNull() {
            addCriterion("TIC.MOD_DT is not null");
            return (Criteria) this;
        }

        public Criteria andModDtEqualTo(Date value) {
            addCriterion("TIC.MOD_DT =", value, "modDt");
            return (Criteria) this;
        }

        public Criteria andModDtNotEqualTo(Date value) {
            addCriterion("TIC.MOD_DT <>", value, "modDt");
            return (Criteria) this;
        }

        public Criteria andModDtGreaterThan(Date value) {
            addCriterion("TIC.MOD_DT >", value, "modDt");
            return (Criteria) this;
        }

        public Criteria andModDtGreaterThanOrEqualTo(Date value) {
            addCriterion("TIC.MOD_DT >=", value, "modDt");
            return (Criteria) this;
        }

        public Criteria andModDtLessThan(Date value) {
            addCriterion("TIC.MOD_DT <", value, "modDt");
            return (Criteria) this;
        }

        public Criteria andModDtLessThanOrEqualTo(Date value) {
            addCriterion("TIC.MOD_DT <=", value, "modDt");
            return (Criteria) this;
        }

        public Criteria andModDtIn(List<Date> values) {
            addCriterion("TIC.MOD_DT in", values, "modDt");
            return (Criteria) this;
        }

        public Criteria andModDtNotIn(List<Date> values) {
            addCriterion("TIC.MOD_DT not in", values, "modDt");
            return (Criteria) this;
        }

        public Criteria andModDtBetween(Date value1, Date value2) {
            addCriterion("TIC.MOD_DT between", value1, value2, "modDt");
            return (Criteria) this;
        }

        public Criteria andModDtNotBetween(Date value1, Date value2) {
            addCriterion("TIC.MOD_DT not between", value1, value2, "modDt");
            return (Criteria) this;
        }

        public Criteria andModIdIsNull() {
            addCriterion("TIC.MOD_ID is null");
            return (Criteria) this;
        }

        public Criteria andModIdIsNotNull() {
            addCriterion("TIC.MOD_ID is not null");
            return (Criteria) this;
        }

        public Criteria andModIdEqualTo(String value) {
            addCriterion("TIC.MOD_ID =", value, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdNotEqualTo(String value) {
            addCriterion("TIC.MOD_ID <>", value, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdGreaterThan(String value) {
            addCriterion("TIC.MOD_ID >", value, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdGreaterThanOrEqualTo(String value) {
            addCriterion("TIC.MOD_ID >=", value, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdLessThan(String value) {
            addCriterion("TIC.MOD_ID <", value, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdLessThanOrEqualTo(String value) {
            addCriterion("TIC.MOD_ID <=", value, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdLike(String value) {
            addCriterion("TIC.MOD_ID like", value, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdNotLike(String value) {
            addCriterion("TIC.MOD_ID not like", value, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdIn(List<String> values) {
            addCriterion("TIC.MOD_ID in", values, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdNotIn(List<String> values) {
            addCriterion("TIC.MOD_ID not in", values, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdBetween(String value1, String value2) {
            addCriterion("TIC.MOD_ID between", value1, value2, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdNotBetween(String value1, String value2) {
            addCriterion("TIC.MOD_ID not between", value1, value2, "modId");
            return (Criteria) this;
        }

        public Criteria andUseYnIsNull() {
            addCriterion("TIC.USE_YN is null");
            return (Criteria) this;
        }

        public Criteria andUseYnIsNotNull() {
            addCriterion("TIC.USE_YN is not null");
            return (Criteria) this;
        }

        public Criteria andUseYnEqualTo(String value) {
            addCriterion("TIC.USE_YN =", value, "useYn");
            return (Criteria) this;
        }

        public Criteria andUseYnNotEqualTo(String value) {
            addCriterion("TIC.USE_YN <>", value, "useYn");
            return (Criteria) this;
        }

        public Criteria andUseYnGreaterThan(String value) {
            addCriterion("TIC.USE_YN >", value, "useYn");
            return (Criteria) this;
        }

        public Criteria andUseYnGreaterThanOrEqualTo(String value) {
            addCriterion("TIC.USE_YN >=", value, "useYn");
            return (Criteria) this;
        }

        public Criteria andUseYnLessThan(String value) {
            addCriterion("TIC.USE_YN <", value, "useYn");
            return (Criteria) this;
        }

        public Criteria andUseYnLessThanOrEqualTo(String value) {
            addCriterion("TIC.USE_YN <=", value, "useYn");
            return (Criteria) this;
        }

        public Criteria andUseYnLike(String value) {
            addCriterion("TIC.USE_YN like", value, "useYn");
            return (Criteria) this;
        }

        public Criteria andUseYnNotLike(String value) {
            addCriterion("TIC.USE_YN not like", value, "useYn");
            return (Criteria) this;
        }

        public Criteria andUseYnIn(List<String> values) {
            addCriterion("TIC.USE_YN in", values, "useYn");
            return (Criteria) this;
        }

        public Criteria andUseYnNotIn(List<String> values) {
            addCriterion("TIC.USE_YN not in", values, "useYn");
            return (Criteria) this;
        }

        public Criteria andUseYnBetween(String value1, String value2) {
            addCriterion("TIC.USE_YN between", value1, value2, "useYn");
            return (Criteria) this;
        }

        public Criteria andUseYnNotBetween(String value1, String value2) {
            addCriterion("TIC.USE_YN not between", value1, value2, "useYn");
            return (Criteria) this;
        }

        public Criteria andMbrIdLikeInsensitive(String value) {
            addCriterion("upper(TIC.MBR_ID) like", value.toUpperCase(), "mbrId");
            return (Criteria) this;
        }

        public Criteria andItemCmtTpCdLikeInsensitive(String value) {
            addCriterion("upper(TIC.ITEM_CMT_TP_CD) like", value.toUpperCase(), "itemCmtTpCd");
            return (Criteria) this;
        }

        public Criteria andTitLikeInsensitive(String value) {
            addCriterion("upper(TIC.TIT) like", value.toUpperCase(), "tit");
            return (Criteria) this;
        }

        public Criteria andContLikeInsensitive(String value) {
            addCriterion("upper(TIC.CONT) like", value.toUpperCase(), "cont");
            return (Criteria) this;
        }

        public Criteria andRegEnvCdLikeInsensitive(String value) {
            addCriterion("upper(TIC.REG_ENV_CD) like", value.toUpperCase(), "regEnvCd");
            return (Criteria) this;
        }

        public Criteria andDpYnLikeInsensitive(String value) {
            addCriterion("upper(TIC.DP_YN) like", value.toUpperCase(), "dpYn");
            return (Criteria) this;
        }

        public Criteria andRegIdLikeInsensitive(String value) {
            addCriterion("upper(TIC.REG_ID) like", value.toUpperCase(), "regId");
            return (Criteria) this;
        }

        public Criteria andModIdLikeInsensitive(String value) {
            addCriterion("upper(TIC.MOD_ID) like", value.toUpperCase(), "modId");
            return (Criteria) this;
        }

        public Criteria andUseYnLikeInsensitive(String value) {
            addCriterion("upper(TIC.USE_YN) like", value.toUpperCase(), "useYn");
            return (Criteria) this;
        }

        public Criteria andMbrIdLikeLeft(String value) {
            addCriterion("TIC.MBR_ID like ", "%" + value, "mbrId");
            return (Criteria) this;
        }

        public Criteria andMbrIdLikeRight(String value) {
            addCriterion("TIC.MBR_ID like ", value + "%", "mbrId");
            return (Criteria) this;
        }

        public Criteria andMbrIdLikeBoth(String value) {
            addCriterion("TIC.MBR_ID like ", "%" + value + "%", "mbrId");
            return (Criteria) this;
        }

        public Criteria andItemCmtTpCdLikeLeft(String value) {
            addCriterion("TIC.ITEM_CMT_TP_CD like ", "%" + value, "itemCmtTpCd");
            return (Criteria) this;
        }

        public Criteria andItemCmtTpCdLikeRight(String value) {
            addCriterion("TIC.ITEM_CMT_TP_CD like ", value + "%", "itemCmtTpCd");
            return (Criteria) this;
        }

        public Criteria andItemCmtTpCdLikeBoth(String value) {
            addCriterion("TIC.ITEM_CMT_TP_CD like ", "%" + value + "%", "itemCmtTpCd");
            return (Criteria) this;
        }

        public Criteria andTitLikeLeft(String value) {
            addCriterion("TIC.TIT like ", "%" + value, "tit");
            return (Criteria) this;
        }

        public Criteria andTitLikeRight(String value) {
            addCriterion("TIC.TIT like ", value + "%", "tit");
            return (Criteria) this;
        }

        public Criteria andTitLikeBoth(String value) {
            addCriterion("TIC.TIT like ", "%" + value + "%", "tit");
            return (Criteria) this;
        }

        public Criteria andContLikeLeft(String value) {
            addCriterion("TIC.CONT like ", "%" + value, "cont");
            return (Criteria) this;
        }

        public Criteria andContLikeRight(String value) {
            addCriterion("TIC.CONT like ", value + "%", "cont");
            return (Criteria) this;
        }

        public Criteria andContLikeBoth(String value) {
            addCriterion("TIC.CONT like ", "%" + value + "%", "cont");
            return (Criteria) this;
        }

        public Criteria andRegEnvCdLikeLeft(String value) {
            addCriterion("TIC.REG_ENV_CD like ", "%" + value, "regEnvCd");
            return (Criteria) this;
        }

        public Criteria andRegEnvCdLikeRight(String value) {
            addCriterion("TIC.REG_ENV_CD like ", value + "%", "regEnvCd");
            return (Criteria) this;
        }

        public Criteria andRegEnvCdLikeBoth(String value) {
            addCriterion("TIC.REG_ENV_CD like ", "%" + value + "%", "regEnvCd");
            return (Criteria) this;
        }

        public Criteria andDpYnLikeLeft(String value) {
            addCriterion("TIC.DP_YN like ", "%" + value, "dpYn");
            return (Criteria) this;
        }

        public Criteria andDpYnLikeRight(String value) {
            addCriterion("TIC.DP_YN like ", value + "%", "dpYn");
            return (Criteria) this;
        }

        public Criteria andDpYnLikeBoth(String value) {
            addCriterion("TIC.DP_YN like ", "%" + value + "%", "dpYn");
            return (Criteria) this;
        }

        public Criteria andRegIdLikeLeft(String value) {
            addCriterion("TIC.REG_ID like ", "%" + value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdLikeRight(String value) {
            addCriterion("TIC.REG_ID like ", value + "%", "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdLikeBoth(String value) {
            addCriterion("TIC.REG_ID like ", "%" + value + "%", "regId");
            return (Criteria) this;
        }

        public Criteria andModIdLikeLeft(String value) {
            addCriterion("TIC.MOD_ID like ", "%" + value, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdLikeRight(String value) {
            addCriterion("TIC.MOD_ID like ", value + "%", "modId");
            return (Criteria) this;
        }

        public Criteria andModIdLikeBoth(String value) {
            addCriterion("TIC.MOD_ID like ", "%" + value + "%", "modId");
            return (Criteria) this;
        }

        public Criteria andUseYnLikeLeft(String value) {
            addCriterion("TIC.USE_YN like ", "%" + value, "useYn");
            return (Criteria) this;
        }

        public Criteria andUseYnLikeRight(String value) {
            addCriterion("TIC.USE_YN like ", value + "%", "useYn");
            return (Criteria) this;
        }

        public Criteria andUseYnLikeBoth(String value) {
            addCriterion("TIC.USE_YN like ", "%" + value + "%", "useYn");
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