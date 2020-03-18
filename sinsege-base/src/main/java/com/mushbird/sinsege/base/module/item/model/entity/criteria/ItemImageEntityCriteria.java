package com.mushbird.sinsege.base.module.item.model.entity.criteria;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ItemImageEntityCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    public ItemImageEntityCriteria() {
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

        public Criteria andItemImgIdIsNull() {
            addCriterion("TII.ITEM_IMG_ID is null");
            return (Criteria) this;
        }

        public Criteria andItemImgIdIsNotNull() {
            addCriterion("TII.ITEM_IMG_ID is not null");
            return (Criteria) this;
        }

        public Criteria andItemImgIdEqualTo(Integer value) {
            addCriterion("TII.ITEM_IMG_ID =", value, "itemImgId");
            return (Criteria) this;
        }

        public Criteria andItemImgIdNotEqualTo(Integer value) {
            addCriterion("TII.ITEM_IMG_ID <>", value, "itemImgId");
            return (Criteria) this;
        }

        public Criteria andItemImgIdGreaterThan(Integer value) {
            addCriterion("TII.ITEM_IMG_ID >", value, "itemImgId");
            return (Criteria) this;
        }

        public Criteria andItemImgIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("TII.ITEM_IMG_ID >=", value, "itemImgId");
            return (Criteria) this;
        }

        public Criteria andItemImgIdLessThan(Integer value) {
            addCriterion("TII.ITEM_IMG_ID <", value, "itemImgId");
            return (Criteria) this;
        }

        public Criteria andItemImgIdLessThanOrEqualTo(Integer value) {
            addCriterion("TII.ITEM_IMG_ID <=", value, "itemImgId");
            return (Criteria) this;
        }

        public Criteria andItemImgIdIn(List<Integer> values) {
            addCriterion("TII.ITEM_IMG_ID in", values, "itemImgId");
            return (Criteria) this;
        }

        public Criteria andItemImgIdNotIn(List<Integer> values) {
            addCriterion("TII.ITEM_IMG_ID not in", values, "itemImgId");
            return (Criteria) this;
        }

        public Criteria andItemImgIdBetween(Integer value1, Integer value2) {
            addCriterion("TII.ITEM_IMG_ID between", value1, value2, "itemImgId");
            return (Criteria) this;
        }

        public Criteria andItemImgIdNotBetween(Integer value1, Integer value2) {
            addCriterion("TII.ITEM_IMG_ID not between", value1, value2, "itemImgId");
            return (Criteria) this;
        }

        public Criteria andItemIdIsNull() {
            addCriterion("TII.ITEM_ID is null");
            return (Criteria) this;
        }

        public Criteria andItemIdIsNotNull() {
            addCriterion("TII.ITEM_ID is not null");
            return (Criteria) this;
        }

        public Criteria andItemIdEqualTo(Integer value) {
            addCriterion("TII.ITEM_ID =", value, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdNotEqualTo(Integer value) {
            addCriterion("TII.ITEM_ID <>", value, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdGreaterThan(Integer value) {
            addCriterion("TII.ITEM_ID >", value, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("TII.ITEM_ID >=", value, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdLessThan(Integer value) {
            addCriterion("TII.ITEM_ID <", value, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdLessThanOrEqualTo(Integer value) {
            addCriterion("TII.ITEM_ID <=", value, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdIn(List<Integer> values) {
            addCriterion("TII.ITEM_ID in", values, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdNotIn(List<Integer> values) {
            addCriterion("TII.ITEM_ID not in", values, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdBetween(Integer value1, Integer value2) {
            addCriterion("TII.ITEM_ID between", value1, value2, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdNotBetween(Integer value1, Integer value2) {
            addCriterion("TII.ITEM_ID not between", value1, value2, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemImgTpCdIsNull() {
            addCriterion("TII.ITEM_IMG_TP_CD is null");
            return (Criteria) this;
        }

        public Criteria andItemImgTpCdIsNotNull() {
            addCriterion("TII.ITEM_IMG_TP_CD is not null");
            return (Criteria) this;
        }

        public Criteria andItemImgTpCdEqualTo(String value) {
            addCriterion("TII.ITEM_IMG_TP_CD =", value, "itemImgTpCd");
            return (Criteria) this;
        }

        public Criteria andItemImgTpCdNotEqualTo(String value) {
            addCriterion("TII.ITEM_IMG_TP_CD <>", value, "itemImgTpCd");
            return (Criteria) this;
        }

        public Criteria andItemImgTpCdGreaterThan(String value) {
            addCriterion("TII.ITEM_IMG_TP_CD >", value, "itemImgTpCd");
            return (Criteria) this;
        }

        public Criteria andItemImgTpCdGreaterThanOrEqualTo(String value) {
            addCriterion("TII.ITEM_IMG_TP_CD >=", value, "itemImgTpCd");
            return (Criteria) this;
        }

        public Criteria andItemImgTpCdLessThan(String value) {
            addCriterion("TII.ITEM_IMG_TP_CD <", value, "itemImgTpCd");
            return (Criteria) this;
        }

        public Criteria andItemImgTpCdLessThanOrEqualTo(String value) {
            addCriterion("TII.ITEM_IMG_TP_CD <=", value, "itemImgTpCd");
            return (Criteria) this;
        }

        public Criteria andItemImgTpCdLike(String value) {
            addCriterion("TII.ITEM_IMG_TP_CD like", value, "itemImgTpCd");
            return (Criteria) this;
        }

        public Criteria andItemImgTpCdNotLike(String value) {
            addCriterion("TII.ITEM_IMG_TP_CD not like", value, "itemImgTpCd");
            return (Criteria) this;
        }

        public Criteria andItemImgTpCdIn(List<String> values) {
            addCriterion("TII.ITEM_IMG_TP_CD in", values, "itemImgTpCd");
            return (Criteria) this;
        }

        public Criteria andItemImgTpCdNotIn(List<String> values) {
            addCriterion("TII.ITEM_IMG_TP_CD not in", values, "itemImgTpCd");
            return (Criteria) this;
        }

        public Criteria andItemImgTpCdBetween(String value1, String value2) {
            addCriterion("TII.ITEM_IMG_TP_CD between", value1, value2, "itemImgTpCd");
            return (Criteria) this;
        }

        public Criteria andItemImgTpCdNotBetween(String value1, String value2) {
            addCriterion("TII.ITEM_IMG_TP_CD not between", value1, value2, "itemImgTpCd");
            return (Criteria) this;
        }

        public Criteria andAtchIdIsNull() {
            addCriterion("TII.ATCH_ID is null");
            return (Criteria) this;
        }

        public Criteria andAtchIdIsNotNull() {
            addCriterion("TII.ATCH_ID is not null");
            return (Criteria) this;
        }

        public Criteria andAtchIdEqualTo(Integer value) {
            addCriterion("TII.ATCH_ID =", value, "atchId");
            return (Criteria) this;
        }

        public Criteria andAtchIdNotEqualTo(Integer value) {
            addCriterion("TII.ATCH_ID <>", value, "atchId");
            return (Criteria) this;
        }

        public Criteria andAtchIdGreaterThan(Integer value) {
            addCriterion("TII.ATCH_ID >", value, "atchId");
            return (Criteria) this;
        }

        public Criteria andAtchIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("TII.ATCH_ID >=", value, "atchId");
            return (Criteria) this;
        }

        public Criteria andAtchIdLessThan(Integer value) {
            addCriterion("TII.ATCH_ID <", value, "atchId");
            return (Criteria) this;
        }

        public Criteria andAtchIdLessThanOrEqualTo(Integer value) {
            addCriterion("TII.ATCH_ID <=", value, "atchId");
            return (Criteria) this;
        }

        public Criteria andAtchIdIn(List<Integer> values) {
            addCriterion("TII.ATCH_ID in", values, "atchId");
            return (Criteria) this;
        }

        public Criteria andAtchIdNotIn(List<Integer> values) {
            addCriterion("TII.ATCH_ID not in", values, "atchId");
            return (Criteria) this;
        }

        public Criteria andAtchIdBetween(Integer value1, Integer value2) {
            addCriterion("TII.ATCH_ID between", value1, value2, "atchId");
            return (Criteria) this;
        }

        public Criteria andAtchIdNotBetween(Integer value1, Integer value2) {
            addCriterion("TII.ATCH_ID not between", value1, value2, "atchId");
            return (Criteria) this;
        }

        public Criteria andRegDtIsNull() {
            addCriterion("TII.REG_DT is null");
            return (Criteria) this;
        }

        public Criteria andRegDtIsNotNull() {
            addCriterion("TII.REG_DT is not null");
            return (Criteria) this;
        }

        public Criteria andRegDtEqualTo(Date value) {
            addCriterion("TII.REG_DT =", value, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtNotEqualTo(Date value) {
            addCriterion("TII.REG_DT <>", value, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtGreaterThan(Date value) {
            addCriterion("TII.REG_DT >", value, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtGreaterThanOrEqualTo(Date value) {
            addCriterion("TII.REG_DT >=", value, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtLessThan(Date value) {
            addCriterion("TII.REG_DT <", value, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtLessThanOrEqualTo(Date value) {
            addCriterion("TII.REG_DT <=", value, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtIn(List<Date> values) {
            addCriterion("TII.REG_DT in", values, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtNotIn(List<Date> values) {
            addCriterion("TII.REG_DT not in", values, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtBetween(Date value1, Date value2) {
            addCriterion("TII.REG_DT between", value1, value2, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtNotBetween(Date value1, Date value2) {
            addCriterion("TII.REG_DT not between", value1, value2, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegIdIsNull() {
            addCriterion("TII.REG_ID is null");
            return (Criteria) this;
        }

        public Criteria andRegIdIsNotNull() {
            addCriterion("TII.REG_ID is not null");
            return (Criteria) this;
        }

        public Criteria andRegIdEqualTo(String value) {
            addCriterion("TII.REG_ID =", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdNotEqualTo(String value) {
            addCriterion("TII.REG_ID <>", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdGreaterThan(String value) {
            addCriterion("TII.REG_ID >", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdGreaterThanOrEqualTo(String value) {
            addCriterion("TII.REG_ID >=", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdLessThan(String value) {
            addCriterion("TII.REG_ID <", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdLessThanOrEqualTo(String value) {
            addCriterion("TII.REG_ID <=", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdLike(String value) {
            addCriterion("TII.REG_ID like", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdNotLike(String value) {
            addCriterion("TII.REG_ID not like", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdIn(List<String> values) {
            addCriterion("TII.REG_ID in", values, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdNotIn(List<String> values) {
            addCriterion("TII.REG_ID not in", values, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdBetween(String value1, String value2) {
            addCriterion("TII.REG_ID between", value1, value2, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdNotBetween(String value1, String value2) {
            addCriterion("TII.REG_ID not between", value1, value2, "regId");
            return (Criteria) this;
        }

        public Criteria andModDtIsNull() {
            addCriterion("TII.MOD_DT is null");
            return (Criteria) this;
        }

        public Criteria andModDtIsNotNull() {
            addCriterion("TII.MOD_DT is not null");
            return (Criteria) this;
        }

        public Criteria andModDtEqualTo(Date value) {
            addCriterion("TII.MOD_DT =", value, "modDt");
            return (Criteria) this;
        }

        public Criteria andModDtNotEqualTo(Date value) {
            addCriterion("TII.MOD_DT <>", value, "modDt");
            return (Criteria) this;
        }

        public Criteria andModDtGreaterThan(Date value) {
            addCriterion("TII.MOD_DT >", value, "modDt");
            return (Criteria) this;
        }

        public Criteria andModDtGreaterThanOrEqualTo(Date value) {
            addCriterion("TII.MOD_DT >=", value, "modDt");
            return (Criteria) this;
        }

        public Criteria andModDtLessThan(Date value) {
            addCriterion("TII.MOD_DT <", value, "modDt");
            return (Criteria) this;
        }

        public Criteria andModDtLessThanOrEqualTo(Date value) {
            addCriterion("TII.MOD_DT <=", value, "modDt");
            return (Criteria) this;
        }

        public Criteria andModDtIn(List<Date> values) {
            addCriterion("TII.MOD_DT in", values, "modDt");
            return (Criteria) this;
        }

        public Criteria andModDtNotIn(List<Date> values) {
            addCriterion("TII.MOD_DT not in", values, "modDt");
            return (Criteria) this;
        }

        public Criteria andModDtBetween(Date value1, Date value2) {
            addCriterion("TII.MOD_DT between", value1, value2, "modDt");
            return (Criteria) this;
        }

        public Criteria andModDtNotBetween(Date value1, Date value2) {
            addCriterion("TII.MOD_DT not between", value1, value2, "modDt");
            return (Criteria) this;
        }

        public Criteria andModIdIsNull() {
            addCriterion("TII.MOD_ID is null");
            return (Criteria) this;
        }

        public Criteria andModIdIsNotNull() {
            addCriterion("TII.MOD_ID is not null");
            return (Criteria) this;
        }

        public Criteria andModIdEqualTo(String value) {
            addCriterion("TII.MOD_ID =", value, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdNotEqualTo(String value) {
            addCriterion("TII.MOD_ID <>", value, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdGreaterThan(String value) {
            addCriterion("TII.MOD_ID >", value, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdGreaterThanOrEqualTo(String value) {
            addCriterion("TII.MOD_ID >=", value, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdLessThan(String value) {
            addCriterion("TII.MOD_ID <", value, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdLessThanOrEqualTo(String value) {
            addCriterion("TII.MOD_ID <=", value, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdLike(String value) {
            addCriterion("TII.MOD_ID like", value, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdNotLike(String value) {
            addCriterion("TII.MOD_ID not like", value, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdIn(List<String> values) {
            addCriterion("TII.MOD_ID in", values, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdNotIn(List<String> values) {
            addCriterion("TII.MOD_ID not in", values, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdBetween(String value1, String value2) {
            addCriterion("TII.MOD_ID between", value1, value2, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdNotBetween(String value1, String value2) {
            addCriterion("TII.MOD_ID not between", value1, value2, "modId");
            return (Criteria) this;
        }

        public Criteria andItemImgTpCdLikeInsensitive(String value) {
            addCriterion("upper(TII.ITEM_IMG_TP_CD) like", value.toUpperCase(), "itemImgTpCd");
            return (Criteria) this;
        }

        public Criteria andRegIdLikeInsensitive(String value) {
            addCriterion("upper(TII.REG_ID) like", value.toUpperCase(), "regId");
            return (Criteria) this;
        }

        public Criteria andModIdLikeInsensitive(String value) {
            addCriterion("upper(TII.MOD_ID) like", value.toUpperCase(), "modId");
            return (Criteria) this;
        }

        public Criteria andItemImgTpCdLikeLeft(String value) {
            addCriterion("TII.ITEM_IMG_TP_CD like ", "%" + value, "itemImgTpCd");
            return (Criteria) this;
        }

        public Criteria andItemImgTpCdLikeRight(String value) {
            addCriterion("TII.ITEM_IMG_TP_CD like ", value + "%", "itemImgTpCd");
            return (Criteria) this;
        }

        public Criteria andItemImgTpCdLikeBoth(String value) {
            addCriterion("TII.ITEM_IMG_TP_CD like ", "%" + value + "%", "itemImgTpCd");
            return (Criteria) this;
        }

        public Criteria andRegIdLikeLeft(String value) {
            addCriterion("TII.REG_ID like ", "%" + value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdLikeRight(String value) {
            addCriterion("TII.REG_ID like ", value + "%", "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdLikeBoth(String value) {
            addCriterion("TII.REG_ID like ", "%" + value + "%", "regId");
            return (Criteria) this;
        }

        public Criteria andModIdLikeLeft(String value) {
            addCriterion("TII.MOD_ID like ", "%" + value, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdLikeRight(String value) {
            addCriterion("TII.MOD_ID like ", value + "%", "modId");
            return (Criteria) this;
        }

        public Criteria andModIdLikeBoth(String value) {
            addCriterion("TII.MOD_ID like ", "%" + value + "%", "modId");
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