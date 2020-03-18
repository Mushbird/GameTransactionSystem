package com.mushbird.sinsege.base.module.item.model.entity.criteria;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ItemInfoNoticeEntityCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    public ItemInfoNoticeEntityCriteria() {
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

        public Criteria andItemInfoNotiIdIsNull() {
            addCriterion("TIIN.ITEM_INFO_NOTI_ID is null");
            return (Criteria) this;
        }

        public Criteria andItemInfoNotiIdIsNotNull() {
            addCriterion("TIIN.ITEM_INFO_NOTI_ID is not null");
            return (Criteria) this;
        }

        public Criteria andItemInfoNotiIdEqualTo(Integer value) {
            addCriterion("TIIN.ITEM_INFO_NOTI_ID =", value, "itemInfoNotiId");
            return (Criteria) this;
        }

        public Criteria andItemInfoNotiIdNotEqualTo(Integer value) {
            addCriterion("TIIN.ITEM_INFO_NOTI_ID <>", value, "itemInfoNotiId");
            return (Criteria) this;
        }

        public Criteria andItemInfoNotiIdGreaterThan(Integer value) {
            addCriterion("TIIN.ITEM_INFO_NOTI_ID >", value, "itemInfoNotiId");
            return (Criteria) this;
        }

        public Criteria andItemInfoNotiIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("TIIN.ITEM_INFO_NOTI_ID >=", value, "itemInfoNotiId");
            return (Criteria) this;
        }

        public Criteria andItemInfoNotiIdLessThan(Integer value) {
            addCriterion("TIIN.ITEM_INFO_NOTI_ID <", value, "itemInfoNotiId");
            return (Criteria) this;
        }

        public Criteria andItemInfoNotiIdLessThanOrEqualTo(Integer value) {
            addCriterion("TIIN.ITEM_INFO_NOTI_ID <=", value, "itemInfoNotiId");
            return (Criteria) this;
        }

        public Criteria andItemInfoNotiIdIn(List<Integer> values) {
            addCriterion("TIIN.ITEM_INFO_NOTI_ID in", values, "itemInfoNotiId");
            return (Criteria) this;
        }

        public Criteria andItemInfoNotiIdNotIn(List<Integer> values) {
            addCriterion("TIIN.ITEM_INFO_NOTI_ID not in", values, "itemInfoNotiId");
            return (Criteria) this;
        }

        public Criteria andItemInfoNotiIdBetween(Integer value1, Integer value2) {
            addCriterion("TIIN.ITEM_INFO_NOTI_ID between", value1, value2, "itemInfoNotiId");
            return (Criteria) this;
        }

        public Criteria andItemInfoNotiIdNotBetween(Integer value1, Integer value2) {
            addCriterion("TIIN.ITEM_INFO_NOTI_ID not between", value1, value2, "itemInfoNotiId");
            return (Criteria) this;
        }

        public Criteria andItemIdIsNull() {
            addCriterion("TIIN.ITEM_ID is null");
            return (Criteria) this;
        }

        public Criteria andItemIdIsNotNull() {
            addCriterion("TIIN.ITEM_ID is not null");
            return (Criteria) this;
        }

        public Criteria andItemIdEqualTo(Integer value) {
            addCriterion("TIIN.ITEM_ID =", value, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdNotEqualTo(Integer value) {
            addCriterion("TIIN.ITEM_ID <>", value, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdGreaterThan(Integer value) {
            addCriterion("TIIN.ITEM_ID >", value, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("TIIN.ITEM_ID >=", value, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdLessThan(Integer value) {
            addCriterion("TIIN.ITEM_ID <", value, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdLessThanOrEqualTo(Integer value) {
            addCriterion("TIIN.ITEM_ID <=", value, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdIn(List<Integer> values) {
            addCriterion("TIIN.ITEM_ID in", values, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdNotIn(List<Integer> values) {
            addCriterion("TIIN.ITEM_ID not in", values, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdBetween(Integer value1, Integer value2) {
            addCriterion("TIIN.ITEM_ID between", value1, value2, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdNotBetween(Integer value1, Integer value2) {
            addCriterion("TIIN.ITEM_ID not between", value1, value2, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemInfoNotiCateCdIsNull() {
            addCriterion("TIIN.ITEM_INFO_NOTI_CATE_CD is null");
            return (Criteria) this;
        }

        public Criteria andItemInfoNotiCateCdIsNotNull() {
            addCriterion("TIIN.ITEM_INFO_NOTI_CATE_CD is not null");
            return (Criteria) this;
        }

        public Criteria andItemInfoNotiCateCdEqualTo(String value) {
            addCriterion("TIIN.ITEM_INFO_NOTI_CATE_CD =", value, "itemInfoNotiCateCd");
            return (Criteria) this;
        }

        public Criteria andItemInfoNotiCateCdNotEqualTo(String value) {
            addCriterion("TIIN.ITEM_INFO_NOTI_CATE_CD <>", value, "itemInfoNotiCateCd");
            return (Criteria) this;
        }

        public Criteria andItemInfoNotiCateCdGreaterThan(String value) {
            addCriterion("TIIN.ITEM_INFO_NOTI_CATE_CD >", value, "itemInfoNotiCateCd");
            return (Criteria) this;
        }

        public Criteria andItemInfoNotiCateCdGreaterThanOrEqualTo(String value) {
            addCriterion("TIIN.ITEM_INFO_NOTI_CATE_CD >=", value, "itemInfoNotiCateCd");
            return (Criteria) this;
        }

        public Criteria andItemInfoNotiCateCdLessThan(String value) {
            addCriterion("TIIN.ITEM_INFO_NOTI_CATE_CD <", value, "itemInfoNotiCateCd");
            return (Criteria) this;
        }

        public Criteria andItemInfoNotiCateCdLessThanOrEqualTo(String value) {
            addCriterion("TIIN.ITEM_INFO_NOTI_CATE_CD <=", value, "itemInfoNotiCateCd");
            return (Criteria) this;
        }

        public Criteria andItemInfoNotiCateCdLike(String value) {
            addCriterion("TIIN.ITEM_INFO_NOTI_CATE_CD like", value, "itemInfoNotiCateCd");
            return (Criteria) this;
        }

        public Criteria andItemInfoNotiCateCdNotLike(String value) {
            addCriterion("TIIN.ITEM_INFO_NOTI_CATE_CD not like", value, "itemInfoNotiCateCd");
            return (Criteria) this;
        }

        public Criteria andItemInfoNotiCateCdIn(List<String> values) {
            addCriterion("TIIN.ITEM_INFO_NOTI_CATE_CD in", values, "itemInfoNotiCateCd");
            return (Criteria) this;
        }

        public Criteria andItemInfoNotiCateCdNotIn(List<String> values) {
            addCriterion("TIIN.ITEM_INFO_NOTI_CATE_CD not in", values, "itemInfoNotiCateCd");
            return (Criteria) this;
        }

        public Criteria andItemInfoNotiCateCdBetween(String value1, String value2) {
            addCriterion("TIIN.ITEM_INFO_NOTI_CATE_CD between", value1, value2, "itemInfoNotiCateCd");
            return (Criteria) this;
        }

        public Criteria andItemInfoNotiCateCdNotBetween(String value1, String value2) {
            addCriterion("TIIN.ITEM_INFO_NOTI_CATE_CD not between", value1, value2, "itemInfoNotiCateCd");
            return (Criteria) this;
        }

        public Criteria andItemInfoNotiDtlCdIsNull() {
            addCriterion("TIIN.ITEM_INFO_NOTI_DTL_CD is null");
            return (Criteria) this;
        }

        public Criteria andItemInfoNotiDtlCdIsNotNull() {
            addCriterion("TIIN.ITEM_INFO_NOTI_DTL_CD is not null");
            return (Criteria) this;
        }

        public Criteria andItemInfoNotiDtlCdEqualTo(String value) {
            addCriterion("TIIN.ITEM_INFO_NOTI_DTL_CD =", value, "itemInfoNotiDtlCd");
            return (Criteria) this;
        }

        public Criteria andItemInfoNotiDtlCdNotEqualTo(String value) {
            addCriterion("TIIN.ITEM_INFO_NOTI_DTL_CD <>", value, "itemInfoNotiDtlCd");
            return (Criteria) this;
        }

        public Criteria andItemInfoNotiDtlCdGreaterThan(String value) {
            addCriterion("TIIN.ITEM_INFO_NOTI_DTL_CD >", value, "itemInfoNotiDtlCd");
            return (Criteria) this;
        }

        public Criteria andItemInfoNotiDtlCdGreaterThanOrEqualTo(String value) {
            addCriterion("TIIN.ITEM_INFO_NOTI_DTL_CD >=", value, "itemInfoNotiDtlCd");
            return (Criteria) this;
        }

        public Criteria andItemInfoNotiDtlCdLessThan(String value) {
            addCriterion("TIIN.ITEM_INFO_NOTI_DTL_CD <", value, "itemInfoNotiDtlCd");
            return (Criteria) this;
        }

        public Criteria andItemInfoNotiDtlCdLessThanOrEqualTo(String value) {
            addCriterion("TIIN.ITEM_INFO_NOTI_DTL_CD <=", value, "itemInfoNotiDtlCd");
            return (Criteria) this;
        }

        public Criteria andItemInfoNotiDtlCdLike(String value) {
            addCriterion("TIIN.ITEM_INFO_NOTI_DTL_CD like", value, "itemInfoNotiDtlCd");
            return (Criteria) this;
        }

        public Criteria andItemInfoNotiDtlCdNotLike(String value) {
            addCriterion("TIIN.ITEM_INFO_NOTI_DTL_CD not like", value, "itemInfoNotiDtlCd");
            return (Criteria) this;
        }

        public Criteria andItemInfoNotiDtlCdIn(List<String> values) {
            addCriterion("TIIN.ITEM_INFO_NOTI_DTL_CD in", values, "itemInfoNotiDtlCd");
            return (Criteria) this;
        }

        public Criteria andItemInfoNotiDtlCdNotIn(List<String> values) {
            addCriterion("TIIN.ITEM_INFO_NOTI_DTL_CD not in", values, "itemInfoNotiDtlCd");
            return (Criteria) this;
        }

        public Criteria andItemInfoNotiDtlCdBetween(String value1, String value2) {
            addCriterion("TIIN.ITEM_INFO_NOTI_DTL_CD between", value1, value2, "itemInfoNotiDtlCd");
            return (Criteria) this;
        }

        public Criteria andItemInfoNotiDtlCdNotBetween(String value1, String value2) {
            addCriterion("TIIN.ITEM_INFO_NOTI_DTL_CD not between", value1, value2, "itemInfoNotiDtlCd");
            return (Criteria) this;
        }

        public Criteria andContIsNull() {
            addCriterion("TIIN.CONT is null");
            return (Criteria) this;
        }

        public Criteria andContIsNotNull() {
            addCriterion("TIIN.CONT is not null");
            return (Criteria) this;
        }

        public Criteria andContEqualTo(String value) {
            addCriterion("TIIN.CONT =", value, "cont");
            return (Criteria) this;
        }

        public Criteria andContNotEqualTo(String value) {
            addCriterion("TIIN.CONT <>", value, "cont");
            return (Criteria) this;
        }

        public Criteria andContGreaterThan(String value) {
            addCriterion("TIIN.CONT >", value, "cont");
            return (Criteria) this;
        }

        public Criteria andContGreaterThanOrEqualTo(String value) {
            addCriterion("TIIN.CONT >=", value, "cont");
            return (Criteria) this;
        }

        public Criteria andContLessThan(String value) {
            addCriterion("TIIN.CONT <", value, "cont");
            return (Criteria) this;
        }

        public Criteria andContLessThanOrEqualTo(String value) {
            addCriterion("TIIN.CONT <=", value, "cont");
            return (Criteria) this;
        }

        public Criteria andContLike(String value) {
            addCriterion("TIIN.CONT like", value, "cont");
            return (Criteria) this;
        }

        public Criteria andContNotLike(String value) {
            addCriterion("TIIN.CONT not like", value, "cont");
            return (Criteria) this;
        }

        public Criteria andContIn(List<String> values) {
            addCriterion("TIIN.CONT in", values, "cont");
            return (Criteria) this;
        }

        public Criteria andContNotIn(List<String> values) {
            addCriterion("TIIN.CONT not in", values, "cont");
            return (Criteria) this;
        }

        public Criteria andContBetween(String value1, String value2) {
            addCriterion("TIIN.CONT between", value1, value2, "cont");
            return (Criteria) this;
        }

        public Criteria andContNotBetween(String value1, String value2) {
            addCriterion("TIIN.CONT not between", value1, value2, "cont");
            return (Criteria) this;
        }

        public Criteria andDpYnIsNull() {
            addCriterion("TIIN.DP_YN is null");
            return (Criteria) this;
        }

        public Criteria andDpYnIsNotNull() {
            addCriterion("TIIN.DP_YN is not null");
            return (Criteria) this;
        }

        public Criteria andDpYnEqualTo(String value) {
            addCriterion("TIIN.DP_YN =", value, "dpYn");
            return (Criteria) this;
        }

        public Criteria andDpYnNotEqualTo(String value) {
            addCriterion("TIIN.DP_YN <>", value, "dpYn");
            return (Criteria) this;
        }

        public Criteria andDpYnGreaterThan(String value) {
            addCriterion("TIIN.DP_YN >", value, "dpYn");
            return (Criteria) this;
        }

        public Criteria andDpYnGreaterThanOrEqualTo(String value) {
            addCriterion("TIIN.DP_YN >=", value, "dpYn");
            return (Criteria) this;
        }

        public Criteria andDpYnLessThan(String value) {
            addCriterion("TIIN.DP_YN <", value, "dpYn");
            return (Criteria) this;
        }

        public Criteria andDpYnLessThanOrEqualTo(String value) {
            addCriterion("TIIN.DP_YN <=", value, "dpYn");
            return (Criteria) this;
        }

        public Criteria andDpYnLike(String value) {
            addCriterion("TIIN.DP_YN like", value, "dpYn");
            return (Criteria) this;
        }

        public Criteria andDpYnNotLike(String value) {
            addCriterion("TIIN.DP_YN not like", value, "dpYn");
            return (Criteria) this;
        }

        public Criteria andDpYnIn(List<String> values) {
            addCriterion("TIIN.DP_YN in", values, "dpYn");
            return (Criteria) this;
        }

        public Criteria andDpYnNotIn(List<String> values) {
            addCriterion("TIIN.DP_YN not in", values, "dpYn");
            return (Criteria) this;
        }

        public Criteria andDpYnBetween(String value1, String value2) {
            addCriterion("TIIN.DP_YN between", value1, value2, "dpYn");
            return (Criteria) this;
        }

        public Criteria andDpYnNotBetween(String value1, String value2) {
            addCriterion("TIIN.DP_YN not between", value1, value2, "dpYn");
            return (Criteria) this;
        }

        public Criteria andRegDtIsNull() {
            addCriterion("TIIN.REG_DT is null");
            return (Criteria) this;
        }

        public Criteria andRegDtIsNotNull() {
            addCriterion("TIIN.REG_DT is not null");
            return (Criteria) this;
        }

        public Criteria andRegDtEqualTo(Date value) {
            addCriterion("TIIN.REG_DT =", value, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtNotEqualTo(Date value) {
            addCriterion("TIIN.REG_DT <>", value, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtGreaterThan(Date value) {
            addCriterion("TIIN.REG_DT >", value, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtGreaterThanOrEqualTo(Date value) {
            addCriterion("TIIN.REG_DT >=", value, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtLessThan(Date value) {
            addCriterion("TIIN.REG_DT <", value, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtLessThanOrEqualTo(Date value) {
            addCriterion("TIIN.REG_DT <=", value, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtIn(List<Date> values) {
            addCriterion("TIIN.REG_DT in", values, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtNotIn(List<Date> values) {
            addCriterion("TIIN.REG_DT not in", values, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtBetween(Date value1, Date value2) {
            addCriterion("TIIN.REG_DT between", value1, value2, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtNotBetween(Date value1, Date value2) {
            addCriterion("TIIN.REG_DT not between", value1, value2, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegIdIsNull() {
            addCriterion("TIIN.REG_ID is null");
            return (Criteria) this;
        }

        public Criteria andRegIdIsNotNull() {
            addCriterion("TIIN.REG_ID is not null");
            return (Criteria) this;
        }

        public Criteria andRegIdEqualTo(String value) {
            addCriterion("TIIN.REG_ID =", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdNotEqualTo(String value) {
            addCriterion("TIIN.REG_ID <>", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdGreaterThan(String value) {
            addCriterion("TIIN.REG_ID >", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdGreaterThanOrEqualTo(String value) {
            addCriterion("TIIN.REG_ID >=", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdLessThan(String value) {
            addCriterion("TIIN.REG_ID <", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdLessThanOrEqualTo(String value) {
            addCriterion("TIIN.REG_ID <=", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdLike(String value) {
            addCriterion("TIIN.REG_ID like", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdNotLike(String value) {
            addCriterion("TIIN.REG_ID not like", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdIn(List<String> values) {
            addCriterion("TIIN.REG_ID in", values, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdNotIn(List<String> values) {
            addCriterion("TIIN.REG_ID not in", values, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdBetween(String value1, String value2) {
            addCriterion("TIIN.REG_ID between", value1, value2, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdNotBetween(String value1, String value2) {
            addCriterion("TIIN.REG_ID not between", value1, value2, "regId");
            return (Criteria) this;
        }

        public Criteria andModDtIsNull() {
            addCriterion("TIIN.MOD_DT is null");
            return (Criteria) this;
        }

        public Criteria andModDtIsNotNull() {
            addCriterion("TIIN.MOD_DT is not null");
            return (Criteria) this;
        }

        public Criteria andModDtEqualTo(Date value) {
            addCriterion("TIIN.MOD_DT =", value, "modDt");
            return (Criteria) this;
        }

        public Criteria andModDtNotEqualTo(Date value) {
            addCriterion("TIIN.MOD_DT <>", value, "modDt");
            return (Criteria) this;
        }

        public Criteria andModDtGreaterThan(Date value) {
            addCriterion("TIIN.MOD_DT >", value, "modDt");
            return (Criteria) this;
        }

        public Criteria andModDtGreaterThanOrEqualTo(Date value) {
            addCriterion("TIIN.MOD_DT >=", value, "modDt");
            return (Criteria) this;
        }

        public Criteria andModDtLessThan(Date value) {
            addCriterion("TIIN.MOD_DT <", value, "modDt");
            return (Criteria) this;
        }

        public Criteria andModDtLessThanOrEqualTo(Date value) {
            addCriterion("TIIN.MOD_DT <=", value, "modDt");
            return (Criteria) this;
        }

        public Criteria andModDtIn(List<Date> values) {
            addCriterion("TIIN.MOD_DT in", values, "modDt");
            return (Criteria) this;
        }

        public Criteria andModDtNotIn(List<Date> values) {
            addCriterion("TIIN.MOD_DT not in", values, "modDt");
            return (Criteria) this;
        }

        public Criteria andModDtBetween(Date value1, Date value2) {
            addCriterion("TIIN.MOD_DT between", value1, value2, "modDt");
            return (Criteria) this;
        }

        public Criteria andModDtNotBetween(Date value1, Date value2) {
            addCriterion("TIIN.MOD_DT not between", value1, value2, "modDt");
            return (Criteria) this;
        }

        public Criteria andModIdIsNull() {
            addCriterion("TIIN.MOD_ID is null");
            return (Criteria) this;
        }

        public Criteria andModIdIsNotNull() {
            addCriterion("TIIN.MOD_ID is not null");
            return (Criteria) this;
        }

        public Criteria andModIdEqualTo(String value) {
            addCriterion("TIIN.MOD_ID =", value, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdNotEqualTo(String value) {
            addCriterion("TIIN.MOD_ID <>", value, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdGreaterThan(String value) {
            addCriterion("TIIN.MOD_ID >", value, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdGreaterThanOrEqualTo(String value) {
            addCriterion("TIIN.MOD_ID >=", value, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdLessThan(String value) {
            addCriterion("TIIN.MOD_ID <", value, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdLessThanOrEqualTo(String value) {
            addCriterion("TIIN.MOD_ID <=", value, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdLike(String value) {
            addCriterion("TIIN.MOD_ID like", value, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdNotLike(String value) {
            addCriterion("TIIN.MOD_ID not like", value, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdIn(List<String> values) {
            addCriterion("TIIN.MOD_ID in", values, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdNotIn(List<String> values) {
            addCriterion("TIIN.MOD_ID not in", values, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdBetween(String value1, String value2) {
            addCriterion("TIIN.MOD_ID between", value1, value2, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdNotBetween(String value1, String value2) {
            addCriterion("TIIN.MOD_ID not between", value1, value2, "modId");
            return (Criteria) this;
        }

        public Criteria andUseYnIsNull() {
            addCriterion("TIIN.USE_YN is null");
            return (Criteria) this;
        }

        public Criteria andUseYnIsNotNull() {
            addCriterion("TIIN.USE_YN is not null");
            return (Criteria) this;
        }

        public Criteria andUseYnEqualTo(String value) {
            addCriterion("TIIN.USE_YN =", value, "useYn");
            return (Criteria) this;
        }

        public Criteria andUseYnNotEqualTo(String value) {
            addCriterion("TIIN.USE_YN <>", value, "useYn");
            return (Criteria) this;
        }

        public Criteria andUseYnGreaterThan(String value) {
            addCriterion("TIIN.USE_YN >", value, "useYn");
            return (Criteria) this;
        }

        public Criteria andUseYnGreaterThanOrEqualTo(String value) {
            addCriterion("TIIN.USE_YN >=", value, "useYn");
            return (Criteria) this;
        }

        public Criteria andUseYnLessThan(String value) {
            addCriterion("TIIN.USE_YN <", value, "useYn");
            return (Criteria) this;
        }

        public Criteria andUseYnLessThanOrEqualTo(String value) {
            addCriterion("TIIN.USE_YN <=", value, "useYn");
            return (Criteria) this;
        }

        public Criteria andUseYnLike(String value) {
            addCriterion("TIIN.USE_YN like", value, "useYn");
            return (Criteria) this;
        }

        public Criteria andUseYnNotLike(String value) {
            addCriterion("TIIN.USE_YN not like", value, "useYn");
            return (Criteria) this;
        }

        public Criteria andUseYnIn(List<String> values) {
            addCriterion("TIIN.USE_YN in", values, "useYn");
            return (Criteria) this;
        }

        public Criteria andUseYnNotIn(List<String> values) {
            addCriterion("TIIN.USE_YN not in", values, "useYn");
            return (Criteria) this;
        }

        public Criteria andUseYnBetween(String value1, String value2) {
            addCriterion("TIIN.USE_YN between", value1, value2, "useYn");
            return (Criteria) this;
        }

        public Criteria andUseYnNotBetween(String value1, String value2) {
            addCriterion("TIIN.USE_YN not between", value1, value2, "useYn");
            return (Criteria) this;
        }

        public Criteria andItemInfoNotiCateCdLikeInsensitive(String value) {
            addCriterion("upper(TIIN.ITEM_INFO_NOTI_CATE_CD) like", value.toUpperCase(), "itemInfoNotiCateCd");
            return (Criteria) this;
        }

        public Criteria andItemInfoNotiDtlCdLikeInsensitive(String value) {
            addCriterion("upper(TIIN.ITEM_INFO_NOTI_DTL_CD) like", value.toUpperCase(), "itemInfoNotiDtlCd");
            return (Criteria) this;
        }

        public Criteria andContLikeInsensitive(String value) {
            addCriterion("upper(TIIN.CONT) like", value.toUpperCase(), "cont");
            return (Criteria) this;
        }

        public Criteria andDpYnLikeInsensitive(String value) {
            addCriterion("upper(TIIN.DP_YN) like", value.toUpperCase(), "dpYn");
            return (Criteria) this;
        }

        public Criteria andRegIdLikeInsensitive(String value) {
            addCriterion("upper(TIIN.REG_ID) like", value.toUpperCase(), "regId");
            return (Criteria) this;
        }

        public Criteria andModIdLikeInsensitive(String value) {
            addCriterion("upper(TIIN.MOD_ID) like", value.toUpperCase(), "modId");
            return (Criteria) this;
        }

        public Criteria andUseYnLikeInsensitive(String value) {
            addCriterion("upper(TIIN.USE_YN) like", value.toUpperCase(), "useYn");
            return (Criteria) this;
        }

        public Criteria andItemInfoNotiCateCdLikeLeft(String value) {
            addCriterion("TIIN.ITEM_INFO_NOTI_CATE_CD like ", "%" + value, "itemInfoNotiCateCd");
            return (Criteria) this;
        }

        public Criteria andItemInfoNotiCateCdLikeRight(String value) {
            addCriterion("TIIN.ITEM_INFO_NOTI_CATE_CD like ", value + "%", "itemInfoNotiCateCd");
            return (Criteria) this;
        }

        public Criteria andItemInfoNotiCateCdLikeBoth(String value) {
            addCriterion("TIIN.ITEM_INFO_NOTI_CATE_CD like ", "%" + value + "%", "itemInfoNotiCateCd");
            return (Criteria) this;
        }

        public Criteria andItemInfoNotiDtlCdLikeLeft(String value) {
            addCriterion("TIIN.ITEM_INFO_NOTI_DTL_CD like ", "%" + value, "itemInfoNotiDtlCd");
            return (Criteria) this;
        }

        public Criteria andItemInfoNotiDtlCdLikeRight(String value) {
            addCriterion("TIIN.ITEM_INFO_NOTI_DTL_CD like ", value + "%", "itemInfoNotiDtlCd");
            return (Criteria) this;
        }

        public Criteria andItemInfoNotiDtlCdLikeBoth(String value) {
            addCriterion("TIIN.ITEM_INFO_NOTI_DTL_CD like ", "%" + value + "%", "itemInfoNotiDtlCd");
            return (Criteria) this;
        }

        public Criteria andContLikeLeft(String value) {
            addCriterion("TIIN.CONT like ", "%" + value, "cont");
            return (Criteria) this;
        }

        public Criteria andContLikeRight(String value) {
            addCriterion("TIIN.CONT like ", value + "%", "cont");
            return (Criteria) this;
        }

        public Criteria andContLikeBoth(String value) {
            addCriterion("TIIN.CONT like ", "%" + value + "%", "cont");
            return (Criteria) this;
        }

        public Criteria andDpYnLikeLeft(String value) {
            addCriterion("TIIN.DP_YN like ", "%" + value, "dpYn");
            return (Criteria) this;
        }

        public Criteria andDpYnLikeRight(String value) {
            addCriterion("TIIN.DP_YN like ", value + "%", "dpYn");
            return (Criteria) this;
        }

        public Criteria andDpYnLikeBoth(String value) {
            addCriterion("TIIN.DP_YN like ", "%" + value + "%", "dpYn");
            return (Criteria) this;
        }

        public Criteria andRegIdLikeLeft(String value) {
            addCriterion("TIIN.REG_ID like ", "%" + value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdLikeRight(String value) {
            addCriterion("TIIN.REG_ID like ", value + "%", "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdLikeBoth(String value) {
            addCriterion("TIIN.REG_ID like ", "%" + value + "%", "regId");
            return (Criteria) this;
        }

        public Criteria andModIdLikeLeft(String value) {
            addCriterion("TIIN.MOD_ID like ", "%" + value, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdLikeRight(String value) {
            addCriterion("TIIN.MOD_ID like ", value + "%", "modId");
            return (Criteria) this;
        }

        public Criteria andModIdLikeBoth(String value) {
            addCriterion("TIIN.MOD_ID like ", "%" + value + "%", "modId");
            return (Criteria) this;
        }

        public Criteria andUseYnLikeLeft(String value) {
            addCriterion("TIIN.USE_YN like ", "%" + value, "useYn");
            return (Criteria) this;
        }

        public Criteria andUseYnLikeRight(String value) {
            addCriterion("TIIN.USE_YN like ", value + "%", "useYn");
            return (Criteria) this;
        }

        public Criteria andUseYnLikeBoth(String value) {
            addCriterion("TIIN.USE_YN like ", "%" + value + "%", "useYn");
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