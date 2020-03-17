package com.mushbird.sinsege.base.module.display.model.entity.criteria;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DpBrandEntityCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    public DpBrandEntityCriteria() {
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

        public Criteria andDpBrndIdIsNull() {
            addCriterion("TDB.DP_BRND_ID is null");
            return (Criteria) this;
        }

        public Criteria andDpBrndIdIsNotNull() {
            addCriterion("TDB.DP_BRND_ID is not null");
            return (Criteria) this;
        }

        public Criteria andDpBrndIdEqualTo(Integer value) {
            addCriterion("TDB.DP_BRND_ID =", value, "dpBrndId");
            return (Criteria) this;
        }

        public Criteria andDpBrndIdNotEqualTo(Integer value) {
            addCriterion("TDB.DP_BRND_ID <>", value, "dpBrndId");
            return (Criteria) this;
        }

        public Criteria andDpBrndIdGreaterThan(Integer value) {
            addCriterion("TDB.DP_BRND_ID >", value, "dpBrndId");
            return (Criteria) this;
        }

        public Criteria andDpBrndIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("TDB.DP_BRND_ID >=", value, "dpBrndId");
            return (Criteria) this;
        }

        public Criteria andDpBrndIdLessThan(Integer value) {
            addCriterion("TDB.DP_BRND_ID <", value, "dpBrndId");
            return (Criteria) this;
        }

        public Criteria andDpBrndIdLessThanOrEqualTo(Integer value) {
            addCriterion("TDB.DP_BRND_ID <=", value, "dpBrndId");
            return (Criteria) this;
        }

        public Criteria andDpBrndIdIn(List<Integer> values) {
            addCriterion("TDB.DP_BRND_ID in", values, "dpBrndId");
            return (Criteria) this;
        }

        public Criteria andDpBrndIdNotIn(List<Integer> values) {
            addCriterion("TDB.DP_BRND_ID not in", values, "dpBrndId");
            return (Criteria) this;
        }

        public Criteria andDpBrndIdBetween(Integer value1, Integer value2) {
            addCriterion("TDB.DP_BRND_ID between", value1, value2, "dpBrndId");
            return (Criteria) this;
        }

        public Criteria andDpBrndIdNotBetween(Integer value1, Integer value2) {
            addCriterion("TDB.DP_BRND_ID not between", value1, value2, "dpBrndId");
            return (Criteria) this;
        }

        public Criteria andVenIdIsNull() {
            addCriterion("TDB.VEN_ID is null");
            return (Criteria) this;
        }

        public Criteria andVenIdIsNotNull() {
            addCriterion("TDB.VEN_ID is not null");
            return (Criteria) this;
        }

        public Criteria andVenIdEqualTo(Integer value) {
            addCriterion("TDB.VEN_ID =", value, "venId");
            return (Criteria) this;
        }

        public Criteria andVenIdNotEqualTo(Integer value) {
            addCriterion("TDB.VEN_ID <>", value, "venId");
            return (Criteria) this;
        }

        public Criteria andVenIdGreaterThan(Integer value) {
            addCriterion("TDB.VEN_ID >", value, "venId");
            return (Criteria) this;
        }

        public Criteria andVenIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("TDB.VEN_ID >=", value, "venId");
            return (Criteria) this;
        }

        public Criteria andVenIdLessThan(Integer value) {
            addCriterion("TDB.VEN_ID <", value, "venId");
            return (Criteria) this;
        }

        public Criteria andVenIdLessThanOrEqualTo(Integer value) {
            addCriterion("TDB.VEN_ID <=", value, "venId");
            return (Criteria) this;
        }

        public Criteria andVenIdIn(List<Integer> values) {
            addCriterion("TDB.VEN_ID in", values, "venId");
            return (Criteria) this;
        }

        public Criteria andVenIdNotIn(List<Integer> values) {
            addCriterion("TDB.VEN_ID not in", values, "venId");
            return (Criteria) this;
        }

        public Criteria andVenIdBetween(Integer value1, Integer value2) {
            addCriterion("TDB.VEN_ID between", value1, value2, "venId");
            return (Criteria) this;
        }

        public Criteria andVenIdNotBetween(Integer value1, Integer value2) {
            addCriterion("TDB.VEN_ID not between", value1, value2, "venId");
            return (Criteria) this;
        }

        public Criteria andBrndNmIsNull() {
            addCriterion("TDB.BRND_NM is null");
            return (Criteria) this;
        }

        public Criteria andBrndNmIsNotNull() {
            addCriterion("TDB.BRND_NM is not null");
            return (Criteria) this;
        }

        public Criteria andBrndNmEqualTo(String value) {
            addCriterion("TDB.BRND_NM =", value, "brndNm");
            return (Criteria) this;
        }

        public Criteria andBrndNmNotEqualTo(String value) {
            addCriterion("TDB.BRND_NM <>", value, "brndNm");
            return (Criteria) this;
        }

        public Criteria andBrndNmGreaterThan(String value) {
            addCriterion("TDB.BRND_NM >", value, "brndNm");
            return (Criteria) this;
        }

        public Criteria andBrndNmGreaterThanOrEqualTo(String value) {
            addCriterion("TDB.BRND_NM >=", value, "brndNm");
            return (Criteria) this;
        }

        public Criteria andBrndNmLessThan(String value) {
            addCriterion("TDB.BRND_NM <", value, "brndNm");
            return (Criteria) this;
        }

        public Criteria andBrndNmLessThanOrEqualTo(String value) {
            addCriterion("TDB.BRND_NM <=", value, "brndNm");
            return (Criteria) this;
        }

        public Criteria andBrndNmLike(String value) {
            addCriterion("TDB.BRND_NM like", value, "brndNm");
            return (Criteria) this;
        }

        public Criteria andBrndNmNotLike(String value) {
            addCriterion("TDB.BRND_NM not like", value, "brndNm");
            return (Criteria) this;
        }

        public Criteria andBrndNmIn(List<String> values) {
            addCriterion("TDB.BRND_NM in", values, "brndNm");
            return (Criteria) this;
        }

        public Criteria andBrndNmNotIn(List<String> values) {
            addCriterion("TDB.BRND_NM not in", values, "brndNm");
            return (Criteria) this;
        }

        public Criteria andBrndNmBetween(String value1, String value2) {
            addCriterion("TDB.BRND_NM between", value1, value2, "brndNm");
            return (Criteria) this;
        }

        public Criteria andBrndNmNotBetween(String value1, String value2) {
            addCriterion("TDB.BRND_NM not between", value1, value2, "brndNm");
            return (Criteria) this;
        }

        public Criteria andBrndNmGrpCdIsNull() {
            addCriterion("TDB.BRND_NM_GRP_CD is null");
            return (Criteria) this;
        }

        public Criteria andBrndNmGrpCdIsNotNull() {
            addCriterion("TDB.BRND_NM_GRP_CD is not null");
            return (Criteria) this;
        }

        public Criteria andBrndNmGrpCdEqualTo(String value) {
            addCriterion("TDB.BRND_NM_GRP_CD =", value, "brndNmGrpCd");
            return (Criteria) this;
        }

        public Criteria andBrndNmGrpCdNotEqualTo(String value) {
            addCriterion("TDB.BRND_NM_GRP_CD <>", value, "brndNmGrpCd");
            return (Criteria) this;
        }

        public Criteria andBrndNmGrpCdGreaterThan(String value) {
            addCriterion("TDB.BRND_NM_GRP_CD >", value, "brndNmGrpCd");
            return (Criteria) this;
        }

        public Criteria andBrndNmGrpCdGreaterThanOrEqualTo(String value) {
            addCriterion("TDB.BRND_NM_GRP_CD >=", value, "brndNmGrpCd");
            return (Criteria) this;
        }

        public Criteria andBrndNmGrpCdLessThan(String value) {
            addCriterion("TDB.BRND_NM_GRP_CD <", value, "brndNmGrpCd");
            return (Criteria) this;
        }

        public Criteria andBrndNmGrpCdLessThanOrEqualTo(String value) {
            addCriterion("TDB.BRND_NM_GRP_CD <=", value, "brndNmGrpCd");
            return (Criteria) this;
        }

        public Criteria andBrndNmGrpCdLike(String value) {
            addCriterion("TDB.BRND_NM_GRP_CD like", value, "brndNmGrpCd");
            return (Criteria) this;
        }

        public Criteria andBrndNmGrpCdNotLike(String value) {
            addCriterion("TDB.BRND_NM_GRP_CD not like", value, "brndNmGrpCd");
            return (Criteria) this;
        }

        public Criteria andBrndNmGrpCdIn(List<String> values) {
            addCriterion("TDB.BRND_NM_GRP_CD in", values, "brndNmGrpCd");
            return (Criteria) this;
        }

        public Criteria andBrndNmGrpCdNotIn(List<String> values) {
            addCriterion("TDB.BRND_NM_GRP_CD not in", values, "brndNmGrpCd");
            return (Criteria) this;
        }

        public Criteria andBrndNmGrpCdBetween(String value1, String value2) {
            addCriterion("TDB.BRND_NM_GRP_CD between", value1, value2, "brndNmGrpCd");
            return (Criteria) this;
        }

        public Criteria andBrndNmGrpCdNotBetween(String value1, String value2) {
            addCriterion("TDB.BRND_NM_GRP_CD not between", value1, value2, "brndNmGrpCd");
            return (Criteria) this;
        }

        public Criteria andBrndEngNmIsNull() {
            addCriterion("TDB.BRND_ENG_NM is null");
            return (Criteria) this;
        }

        public Criteria andBrndEngNmIsNotNull() {
            addCriterion("TDB.BRND_ENG_NM is not null");
            return (Criteria) this;
        }

        public Criteria andBrndEngNmEqualTo(String value) {
            addCriterion("TDB.BRND_ENG_NM =", value, "brndEngNm");
            return (Criteria) this;
        }

        public Criteria andBrndEngNmNotEqualTo(String value) {
            addCriterion("TDB.BRND_ENG_NM <>", value, "brndEngNm");
            return (Criteria) this;
        }

        public Criteria andBrndEngNmGreaterThan(String value) {
            addCriterion("TDB.BRND_ENG_NM >", value, "brndEngNm");
            return (Criteria) this;
        }

        public Criteria andBrndEngNmGreaterThanOrEqualTo(String value) {
            addCriterion("TDB.BRND_ENG_NM >=", value, "brndEngNm");
            return (Criteria) this;
        }

        public Criteria andBrndEngNmLessThan(String value) {
            addCriterion("TDB.BRND_ENG_NM <", value, "brndEngNm");
            return (Criteria) this;
        }

        public Criteria andBrndEngNmLessThanOrEqualTo(String value) {
            addCriterion("TDB.BRND_ENG_NM <=", value, "brndEngNm");
            return (Criteria) this;
        }

        public Criteria andBrndEngNmLike(String value) {
            addCriterion("TDB.BRND_ENG_NM like", value, "brndEngNm");
            return (Criteria) this;
        }

        public Criteria andBrndEngNmNotLike(String value) {
            addCriterion("TDB.BRND_ENG_NM not like", value, "brndEngNm");
            return (Criteria) this;
        }

        public Criteria andBrndEngNmIn(List<String> values) {
            addCriterion("TDB.BRND_ENG_NM in", values, "brndEngNm");
            return (Criteria) this;
        }

        public Criteria andBrndEngNmNotIn(List<String> values) {
            addCriterion("TDB.BRND_ENG_NM not in", values, "brndEngNm");
            return (Criteria) this;
        }

        public Criteria andBrndEngNmBetween(String value1, String value2) {
            addCriterion("TDB.BRND_ENG_NM between", value1, value2, "brndEngNm");
            return (Criteria) this;
        }

        public Criteria andBrndEngNmNotBetween(String value1, String value2) {
            addCriterion("TDB.BRND_ENG_NM not between", value1, value2, "brndEngNm");
            return (Criteria) this;
        }

        public Criteria andBrndDescIsNull() {
            addCriterion("TDB.BRND_DESC is null");
            return (Criteria) this;
        }

        public Criteria andBrndDescIsNotNull() {
            addCriterion("TDB.BRND_DESC is not null");
            return (Criteria) this;
        }

        public Criteria andBrndDescEqualTo(String value) {
            addCriterion("TDB.BRND_DESC =", value, "brndDesc");
            return (Criteria) this;
        }

        public Criteria andBrndDescNotEqualTo(String value) {
            addCriterion("TDB.BRND_DESC <>", value, "brndDesc");
            return (Criteria) this;
        }

        public Criteria andBrndDescGreaterThan(String value) {
            addCriterion("TDB.BRND_DESC >", value, "brndDesc");
            return (Criteria) this;
        }

        public Criteria andBrndDescGreaterThanOrEqualTo(String value) {
            addCriterion("TDB.BRND_DESC >=", value, "brndDesc");
            return (Criteria) this;
        }

        public Criteria andBrndDescLessThan(String value) {
            addCriterion("TDB.BRND_DESC <", value, "brndDesc");
            return (Criteria) this;
        }

        public Criteria andBrndDescLessThanOrEqualTo(String value) {
            addCriterion("TDB.BRND_DESC <=", value, "brndDesc");
            return (Criteria) this;
        }

        public Criteria andBrndDescLike(String value) {
            addCriterion("TDB.BRND_DESC like", value, "brndDesc");
            return (Criteria) this;
        }

        public Criteria andBrndDescNotLike(String value) {
            addCriterion("TDB.BRND_DESC not like", value, "brndDesc");
            return (Criteria) this;
        }

        public Criteria andBrndDescIn(List<String> values) {
            addCriterion("TDB.BRND_DESC in", values, "brndDesc");
            return (Criteria) this;
        }

        public Criteria andBrndDescNotIn(List<String> values) {
            addCriterion("TDB.BRND_DESC not in", values, "brndDesc");
            return (Criteria) this;
        }

        public Criteria andBrndDescBetween(String value1, String value2) {
            addCriterion("TDB.BRND_DESC between", value1, value2, "brndDesc");
            return (Criteria) this;
        }

        public Criteria andBrndDescNotBetween(String value1, String value2) {
            addCriterion("TDB.BRND_DESC not between", value1, value2, "brndDesc");
            return (Criteria) this;
        }

        public Criteria andBrndDtlDescIsNull() {
            addCriterion("TDB.BRND_DTL_DESC is null");
            return (Criteria) this;
        }

        public Criteria andBrndDtlDescIsNotNull() {
            addCriterion("TDB.BRND_DTL_DESC is not null");
            return (Criteria) this;
        }

        public Criteria andBrndDtlDescEqualTo(String value) {
            addCriterion("TDB.BRND_DTL_DESC =", value, "brndDtlDesc");
            return (Criteria) this;
        }

        public Criteria andBrndDtlDescNotEqualTo(String value) {
            addCriterion("TDB.BRND_DTL_DESC <>", value, "brndDtlDesc");
            return (Criteria) this;
        }

        public Criteria andBrndDtlDescGreaterThan(String value) {
            addCriterion("TDB.BRND_DTL_DESC >", value, "brndDtlDesc");
            return (Criteria) this;
        }

        public Criteria andBrndDtlDescGreaterThanOrEqualTo(String value) {
            addCriterion("TDB.BRND_DTL_DESC >=", value, "brndDtlDesc");
            return (Criteria) this;
        }

        public Criteria andBrndDtlDescLessThan(String value) {
            addCriterion("TDB.BRND_DTL_DESC <", value, "brndDtlDesc");
            return (Criteria) this;
        }

        public Criteria andBrndDtlDescLessThanOrEqualTo(String value) {
            addCriterion("TDB.BRND_DTL_DESC <=", value, "brndDtlDesc");
            return (Criteria) this;
        }

        public Criteria andBrndDtlDescLike(String value) {
            addCriterion("TDB.BRND_DTL_DESC like", value, "brndDtlDesc");
            return (Criteria) this;
        }

        public Criteria andBrndDtlDescNotLike(String value) {
            addCriterion("TDB.BRND_DTL_DESC not like", value, "brndDtlDesc");
            return (Criteria) this;
        }

        public Criteria andBrndDtlDescIn(List<String> values) {
            addCriterion("TDB.BRND_DTL_DESC in", values, "brndDtlDesc");
            return (Criteria) this;
        }

        public Criteria andBrndDtlDescNotIn(List<String> values) {
            addCriterion("TDB.BRND_DTL_DESC not in", values, "brndDtlDesc");
            return (Criteria) this;
        }

        public Criteria andBrndDtlDescBetween(String value1, String value2) {
            addCriterion("TDB.BRND_DTL_DESC between", value1, value2, "brndDtlDesc");
            return (Criteria) this;
        }

        public Criteria andBrndDtlDescNotBetween(String value1, String value2) {
            addCriterion("TDB.BRND_DTL_DESC not between", value1, value2, "brndDtlDesc");
            return (Criteria) this;
        }

        public Criteria andBrndStoryPcIsNull() {
            addCriterion("TDB.BRND_STORY_PC is null");
            return (Criteria) this;
        }

        public Criteria andBrndStoryPcIsNotNull() {
            addCriterion("TDB.BRND_STORY_PC is not null");
            return (Criteria) this;
        }

        public Criteria andBrndStoryPcEqualTo(String value) {
            addCriterion("TDB.BRND_STORY_PC =", value, "brndStoryPc");
            return (Criteria) this;
        }

        public Criteria andBrndStoryPcNotEqualTo(String value) {
            addCriterion("TDB.BRND_STORY_PC <>", value, "brndStoryPc");
            return (Criteria) this;
        }

        public Criteria andBrndStoryPcGreaterThan(String value) {
            addCriterion("TDB.BRND_STORY_PC >", value, "brndStoryPc");
            return (Criteria) this;
        }

        public Criteria andBrndStoryPcGreaterThanOrEqualTo(String value) {
            addCriterion("TDB.BRND_STORY_PC >=", value, "brndStoryPc");
            return (Criteria) this;
        }

        public Criteria andBrndStoryPcLessThan(String value) {
            addCriterion("TDB.BRND_STORY_PC <", value, "brndStoryPc");
            return (Criteria) this;
        }

        public Criteria andBrndStoryPcLessThanOrEqualTo(String value) {
            addCriterion("TDB.BRND_STORY_PC <=", value, "brndStoryPc");
            return (Criteria) this;
        }

        public Criteria andBrndStoryPcLike(String value) {
            addCriterion("TDB.BRND_STORY_PC like", value, "brndStoryPc");
            return (Criteria) this;
        }

        public Criteria andBrndStoryPcNotLike(String value) {
            addCriterion("TDB.BRND_STORY_PC not like", value, "brndStoryPc");
            return (Criteria) this;
        }

        public Criteria andBrndStoryPcIn(List<String> values) {
            addCriterion("TDB.BRND_STORY_PC in", values, "brndStoryPc");
            return (Criteria) this;
        }

        public Criteria andBrndStoryPcNotIn(List<String> values) {
            addCriterion("TDB.BRND_STORY_PC not in", values, "brndStoryPc");
            return (Criteria) this;
        }

        public Criteria andBrndStoryPcBetween(String value1, String value2) {
            addCriterion("TDB.BRND_STORY_PC between", value1, value2, "brndStoryPc");
            return (Criteria) this;
        }

        public Criteria andBrndStoryPcNotBetween(String value1, String value2) {
            addCriterion("TDB.BRND_STORY_PC not between", value1, value2, "brndStoryPc");
            return (Criteria) this;
        }

        public Criteria andBrndStoryMobIsNull() {
            addCriterion("TDB.BRND_STORY_MOB is null");
            return (Criteria) this;
        }

        public Criteria andBrndStoryMobIsNotNull() {
            addCriterion("TDB.BRND_STORY_MOB is not null");
            return (Criteria) this;
        }

        public Criteria andBrndStoryMobEqualTo(String value) {
            addCriterion("TDB.BRND_STORY_MOB =", value, "brndStoryMob");
            return (Criteria) this;
        }

        public Criteria andBrndStoryMobNotEqualTo(String value) {
            addCriterion("TDB.BRND_STORY_MOB <>", value, "brndStoryMob");
            return (Criteria) this;
        }

        public Criteria andBrndStoryMobGreaterThan(String value) {
            addCriterion("TDB.BRND_STORY_MOB >", value, "brndStoryMob");
            return (Criteria) this;
        }

        public Criteria andBrndStoryMobGreaterThanOrEqualTo(String value) {
            addCriterion("TDB.BRND_STORY_MOB >=", value, "brndStoryMob");
            return (Criteria) this;
        }

        public Criteria andBrndStoryMobLessThan(String value) {
            addCriterion("TDB.BRND_STORY_MOB <", value, "brndStoryMob");
            return (Criteria) this;
        }

        public Criteria andBrndStoryMobLessThanOrEqualTo(String value) {
            addCriterion("TDB.BRND_STORY_MOB <=", value, "brndStoryMob");
            return (Criteria) this;
        }

        public Criteria andBrndStoryMobLike(String value) {
            addCriterion("TDB.BRND_STORY_MOB like", value, "brndStoryMob");
            return (Criteria) this;
        }

        public Criteria andBrndStoryMobNotLike(String value) {
            addCriterion("TDB.BRND_STORY_MOB not like", value, "brndStoryMob");
            return (Criteria) this;
        }

        public Criteria andBrndStoryMobIn(List<String> values) {
            addCriterion("TDB.BRND_STORY_MOB in", values, "brndStoryMob");
            return (Criteria) this;
        }

        public Criteria andBrndStoryMobNotIn(List<String> values) {
            addCriterion("TDB.BRND_STORY_MOB not in", values, "brndStoryMob");
            return (Criteria) this;
        }

        public Criteria andBrndStoryMobBetween(String value1, String value2) {
            addCriterion("TDB.BRND_STORY_MOB between", value1, value2, "brndStoryMob");
            return (Criteria) this;
        }

        public Criteria andBrndStoryMobNotBetween(String value1, String value2) {
            addCriterion("TDB.BRND_STORY_MOB not between", value1, value2, "brndStoryMob");
            return (Criteria) this;
        }

        public Criteria andDpCateIdIsNull() {
            addCriterion("TDB.DP_CATE_ID is null");
            return (Criteria) this;
        }

        public Criteria andDpCateIdIsNotNull() {
            addCriterion("TDB.DP_CATE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andDpCateIdEqualTo(Integer value) {
            addCriterion("TDB.DP_CATE_ID =", value, "dpCateId");
            return (Criteria) this;
        }

        public Criteria andDpCateIdNotEqualTo(Integer value) {
            addCriterion("TDB.DP_CATE_ID <>", value, "dpCateId");
            return (Criteria) this;
        }

        public Criteria andDpCateIdGreaterThan(Integer value) {
            addCriterion("TDB.DP_CATE_ID >", value, "dpCateId");
            return (Criteria) this;
        }

        public Criteria andDpCateIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("TDB.DP_CATE_ID >=", value, "dpCateId");
            return (Criteria) this;
        }

        public Criteria andDpCateIdLessThan(Integer value) {
            addCriterion("TDB.DP_CATE_ID <", value, "dpCateId");
            return (Criteria) this;
        }

        public Criteria andDpCateIdLessThanOrEqualTo(Integer value) {
            addCriterion("TDB.DP_CATE_ID <=", value, "dpCateId");
            return (Criteria) this;
        }

        public Criteria andDpCateIdIn(List<Integer> values) {
            addCriterion("TDB.DP_CATE_ID in", values, "dpCateId");
            return (Criteria) this;
        }

        public Criteria andDpCateIdNotIn(List<Integer> values) {
            addCriterion("TDB.DP_CATE_ID not in", values, "dpCateId");
            return (Criteria) this;
        }

        public Criteria andDpCateIdBetween(Integer value1, Integer value2) {
            addCriterion("TDB.DP_CATE_ID between", value1, value2, "dpCateId");
            return (Criteria) this;
        }

        public Criteria andDpCateIdNotBetween(Integer value1, Integer value2) {
            addCriterion("TDB.DP_CATE_ID not between", value1, value2, "dpCateId");
            return (Criteria) this;
        }

        public Criteria andBanrLAtchGidPcIsNull() {
            addCriterion("TDB.BANR_L_ATCH_GID_PC is null");
            return (Criteria) this;
        }

        public Criteria andBanrLAtchGidPcIsNotNull() {
            addCriterion("TDB.BANR_L_ATCH_GID_PC is not null");
            return (Criteria) this;
        }

        public Criteria andBanrLAtchGidPcEqualTo(Integer value) {
            addCriterion("TDB.BANR_L_ATCH_GID_PC =", value, "banrLAtchGidPc");
            return (Criteria) this;
        }

        public Criteria andBanrLAtchGidPcNotEqualTo(Integer value) {
            addCriterion("TDB.BANR_L_ATCH_GID_PC <>", value, "banrLAtchGidPc");
            return (Criteria) this;
        }

        public Criteria andBanrLAtchGidPcGreaterThan(Integer value) {
            addCriterion("TDB.BANR_L_ATCH_GID_PC >", value, "banrLAtchGidPc");
            return (Criteria) this;
        }

        public Criteria andBanrLAtchGidPcGreaterThanOrEqualTo(Integer value) {
            addCriterion("TDB.BANR_L_ATCH_GID_PC >=", value, "banrLAtchGidPc");
            return (Criteria) this;
        }

        public Criteria andBanrLAtchGidPcLessThan(Integer value) {
            addCriterion("TDB.BANR_L_ATCH_GID_PC <", value, "banrLAtchGidPc");
            return (Criteria) this;
        }

        public Criteria andBanrLAtchGidPcLessThanOrEqualTo(Integer value) {
            addCriterion("TDB.BANR_L_ATCH_GID_PC <=", value, "banrLAtchGidPc");
            return (Criteria) this;
        }

        public Criteria andBanrLAtchGidPcIn(List<Integer> values) {
            addCriterion("TDB.BANR_L_ATCH_GID_PC in", values, "banrLAtchGidPc");
            return (Criteria) this;
        }

        public Criteria andBanrLAtchGidPcNotIn(List<Integer> values) {
            addCriterion("TDB.BANR_L_ATCH_GID_PC not in", values, "banrLAtchGidPc");
            return (Criteria) this;
        }

        public Criteria andBanrLAtchGidPcBetween(Integer value1, Integer value2) {
            addCriterion("TDB.BANR_L_ATCH_GID_PC between", value1, value2, "banrLAtchGidPc");
            return (Criteria) this;
        }

        public Criteria andBanrLAtchGidPcNotBetween(Integer value1, Integer value2) {
            addCriterion("TDB.BANR_L_ATCH_GID_PC not between", value1, value2, "banrLAtchGidPc");
            return (Criteria) this;
        }

        public Criteria andBanrLAtchGidMobIsNull() {
            addCriterion("TDB.BANR_L_ATCH_GID_MOB is null");
            return (Criteria) this;
        }

        public Criteria andBanrLAtchGidMobIsNotNull() {
            addCriterion("TDB.BANR_L_ATCH_GID_MOB is not null");
            return (Criteria) this;
        }

        public Criteria andBanrLAtchGidMobEqualTo(Integer value) {
            addCriterion("TDB.BANR_L_ATCH_GID_MOB =", value, "banrLAtchGidMob");
            return (Criteria) this;
        }

        public Criteria andBanrLAtchGidMobNotEqualTo(Integer value) {
            addCriterion("TDB.BANR_L_ATCH_GID_MOB <>", value, "banrLAtchGidMob");
            return (Criteria) this;
        }

        public Criteria andBanrLAtchGidMobGreaterThan(Integer value) {
            addCriterion("TDB.BANR_L_ATCH_GID_MOB >", value, "banrLAtchGidMob");
            return (Criteria) this;
        }

        public Criteria andBanrLAtchGidMobGreaterThanOrEqualTo(Integer value) {
            addCriterion("TDB.BANR_L_ATCH_GID_MOB >=", value, "banrLAtchGidMob");
            return (Criteria) this;
        }

        public Criteria andBanrLAtchGidMobLessThan(Integer value) {
            addCriterion("TDB.BANR_L_ATCH_GID_MOB <", value, "banrLAtchGidMob");
            return (Criteria) this;
        }

        public Criteria andBanrLAtchGidMobLessThanOrEqualTo(Integer value) {
            addCriterion("TDB.BANR_L_ATCH_GID_MOB <=", value, "banrLAtchGidMob");
            return (Criteria) this;
        }

        public Criteria andBanrLAtchGidMobIn(List<Integer> values) {
            addCriterion("TDB.BANR_L_ATCH_GID_MOB in", values, "banrLAtchGidMob");
            return (Criteria) this;
        }

        public Criteria andBanrLAtchGidMobNotIn(List<Integer> values) {
            addCriterion("TDB.BANR_L_ATCH_GID_MOB not in", values, "banrLAtchGidMob");
            return (Criteria) this;
        }

        public Criteria andBanrLAtchGidMobBetween(Integer value1, Integer value2) {
            addCriterion("TDB.BANR_L_ATCH_GID_MOB between", value1, value2, "banrLAtchGidMob");
            return (Criteria) this;
        }

        public Criteria andBanrLAtchGidMobNotBetween(Integer value1, Integer value2) {
            addCriterion("TDB.BANR_L_ATCH_GID_MOB not between", value1, value2, "banrLAtchGidMob");
            return (Criteria) this;
        }

        public Criteria andBanrMAtchGidPcIsNull() {
            addCriterion("TDB.BANR_M_ATCH_GID_PC is null");
            return (Criteria) this;
        }

        public Criteria andBanrMAtchGidPcIsNotNull() {
            addCriterion("TDB.BANR_M_ATCH_GID_PC is not null");
            return (Criteria) this;
        }

        public Criteria andBanrMAtchGidPcEqualTo(Integer value) {
            addCriterion("TDB.BANR_M_ATCH_GID_PC =", value, "banrMAtchGidPc");
            return (Criteria) this;
        }

        public Criteria andBanrMAtchGidPcNotEqualTo(Integer value) {
            addCriterion("TDB.BANR_M_ATCH_GID_PC <>", value, "banrMAtchGidPc");
            return (Criteria) this;
        }

        public Criteria andBanrMAtchGidPcGreaterThan(Integer value) {
            addCriterion("TDB.BANR_M_ATCH_GID_PC >", value, "banrMAtchGidPc");
            return (Criteria) this;
        }

        public Criteria andBanrMAtchGidPcGreaterThanOrEqualTo(Integer value) {
            addCriterion("TDB.BANR_M_ATCH_GID_PC >=", value, "banrMAtchGidPc");
            return (Criteria) this;
        }

        public Criteria andBanrMAtchGidPcLessThan(Integer value) {
            addCriterion("TDB.BANR_M_ATCH_GID_PC <", value, "banrMAtchGidPc");
            return (Criteria) this;
        }

        public Criteria andBanrMAtchGidPcLessThanOrEqualTo(Integer value) {
            addCriterion("TDB.BANR_M_ATCH_GID_PC <=", value, "banrMAtchGidPc");
            return (Criteria) this;
        }

        public Criteria andBanrMAtchGidPcIn(List<Integer> values) {
            addCriterion("TDB.BANR_M_ATCH_GID_PC in", values, "banrMAtchGidPc");
            return (Criteria) this;
        }

        public Criteria andBanrMAtchGidPcNotIn(List<Integer> values) {
            addCriterion("TDB.BANR_M_ATCH_GID_PC not in", values, "banrMAtchGidPc");
            return (Criteria) this;
        }

        public Criteria andBanrMAtchGidPcBetween(Integer value1, Integer value2) {
            addCriterion("TDB.BANR_M_ATCH_GID_PC between", value1, value2, "banrMAtchGidPc");
            return (Criteria) this;
        }

        public Criteria andBanrMAtchGidPcNotBetween(Integer value1, Integer value2) {
            addCriterion("TDB.BANR_M_ATCH_GID_PC not between", value1, value2, "banrMAtchGidPc");
            return (Criteria) this;
        }

        public Criteria andBanrMAtchGidMobIsNull() {
            addCriterion("TDB.BANR_M_ATCH_GID_MOB is null");
            return (Criteria) this;
        }

        public Criteria andBanrMAtchGidMobIsNotNull() {
            addCriterion("TDB.BANR_M_ATCH_GID_MOB is not null");
            return (Criteria) this;
        }

        public Criteria andBanrMAtchGidMobEqualTo(Integer value) {
            addCriterion("TDB.BANR_M_ATCH_GID_MOB =", value, "banrMAtchGidMob");
            return (Criteria) this;
        }

        public Criteria andBanrMAtchGidMobNotEqualTo(Integer value) {
            addCriterion("TDB.BANR_M_ATCH_GID_MOB <>", value, "banrMAtchGidMob");
            return (Criteria) this;
        }

        public Criteria andBanrMAtchGidMobGreaterThan(Integer value) {
            addCriterion("TDB.BANR_M_ATCH_GID_MOB >", value, "banrMAtchGidMob");
            return (Criteria) this;
        }

        public Criteria andBanrMAtchGidMobGreaterThanOrEqualTo(Integer value) {
            addCriterion("TDB.BANR_M_ATCH_GID_MOB >=", value, "banrMAtchGidMob");
            return (Criteria) this;
        }

        public Criteria andBanrMAtchGidMobLessThan(Integer value) {
            addCriterion("TDB.BANR_M_ATCH_GID_MOB <", value, "banrMAtchGidMob");
            return (Criteria) this;
        }

        public Criteria andBanrMAtchGidMobLessThanOrEqualTo(Integer value) {
            addCriterion("TDB.BANR_M_ATCH_GID_MOB <=", value, "banrMAtchGidMob");
            return (Criteria) this;
        }

        public Criteria andBanrMAtchGidMobIn(List<Integer> values) {
            addCriterion("TDB.BANR_M_ATCH_GID_MOB in", values, "banrMAtchGidMob");
            return (Criteria) this;
        }

        public Criteria andBanrMAtchGidMobNotIn(List<Integer> values) {
            addCriterion("TDB.BANR_M_ATCH_GID_MOB not in", values, "banrMAtchGidMob");
            return (Criteria) this;
        }

        public Criteria andBanrMAtchGidMobBetween(Integer value1, Integer value2) {
            addCriterion("TDB.BANR_M_ATCH_GID_MOB between", value1, value2, "banrMAtchGidMob");
            return (Criteria) this;
        }

        public Criteria andBanrMAtchGidMobNotBetween(Integer value1, Integer value2) {
            addCriterion("TDB.BANR_M_ATCH_GID_MOB not between", value1, value2, "banrMAtchGidMob");
            return (Criteria) this;
        }

        public Criteria andLinkUrlAddrIsNull() {
            addCriterion("TDB.LINK_URL_ADDR is null");
            return (Criteria) this;
        }

        public Criteria andLinkUrlAddrIsNotNull() {
            addCriterion("TDB.LINK_URL_ADDR is not null");
            return (Criteria) this;
        }

        public Criteria andLinkUrlAddrEqualTo(String value) {
            addCriterion("TDB.LINK_URL_ADDR =", value, "linkUrlAddr");
            return (Criteria) this;
        }

        public Criteria andLinkUrlAddrNotEqualTo(String value) {
            addCriterion("TDB.LINK_URL_ADDR <>", value, "linkUrlAddr");
            return (Criteria) this;
        }

        public Criteria andLinkUrlAddrGreaterThan(String value) {
            addCriterion("TDB.LINK_URL_ADDR >", value, "linkUrlAddr");
            return (Criteria) this;
        }

        public Criteria andLinkUrlAddrGreaterThanOrEqualTo(String value) {
            addCriterion("TDB.LINK_URL_ADDR >=", value, "linkUrlAddr");
            return (Criteria) this;
        }

        public Criteria andLinkUrlAddrLessThan(String value) {
            addCriterion("TDB.LINK_URL_ADDR <", value, "linkUrlAddr");
            return (Criteria) this;
        }

        public Criteria andLinkUrlAddrLessThanOrEqualTo(String value) {
            addCriterion("TDB.LINK_URL_ADDR <=", value, "linkUrlAddr");
            return (Criteria) this;
        }

        public Criteria andLinkUrlAddrLike(String value) {
            addCriterion("TDB.LINK_URL_ADDR like", value, "linkUrlAddr");
            return (Criteria) this;
        }

        public Criteria andLinkUrlAddrNotLike(String value) {
            addCriterion("TDB.LINK_URL_ADDR not like", value, "linkUrlAddr");
            return (Criteria) this;
        }

        public Criteria andLinkUrlAddrIn(List<String> values) {
            addCriterion("TDB.LINK_URL_ADDR in", values, "linkUrlAddr");
            return (Criteria) this;
        }

        public Criteria andLinkUrlAddrNotIn(List<String> values) {
            addCriterion("TDB.LINK_URL_ADDR not in", values, "linkUrlAddr");
            return (Criteria) this;
        }

        public Criteria andLinkUrlAddrBetween(String value1, String value2) {
            addCriterion("TDB.LINK_URL_ADDR between", value1, value2, "linkUrlAddr");
            return (Criteria) this;
        }

        public Criteria andLinkUrlAddrNotBetween(String value1, String value2) {
            addCriterion("TDB.LINK_URL_ADDR not between", value1, value2, "linkUrlAddr");
            return (Criteria) this;
        }

        public Criteria andLinkNwinYnIsNull() {
            addCriterion("TDB.LINK_NWIN_YN is null");
            return (Criteria) this;
        }

        public Criteria andLinkNwinYnIsNotNull() {
            addCriterion("TDB.LINK_NWIN_YN is not null");
            return (Criteria) this;
        }

        public Criteria andLinkNwinYnEqualTo(String value) {
            addCriterion("TDB.LINK_NWIN_YN =", value, "linkNwinYn");
            return (Criteria) this;
        }

        public Criteria andLinkNwinYnNotEqualTo(String value) {
            addCriterion("TDB.LINK_NWIN_YN <>", value, "linkNwinYn");
            return (Criteria) this;
        }

        public Criteria andLinkNwinYnGreaterThan(String value) {
            addCriterion("TDB.LINK_NWIN_YN >", value, "linkNwinYn");
            return (Criteria) this;
        }

        public Criteria andLinkNwinYnGreaterThanOrEqualTo(String value) {
            addCriterion("TDB.LINK_NWIN_YN >=", value, "linkNwinYn");
            return (Criteria) this;
        }

        public Criteria andLinkNwinYnLessThan(String value) {
            addCriterion("TDB.LINK_NWIN_YN <", value, "linkNwinYn");
            return (Criteria) this;
        }

        public Criteria andLinkNwinYnLessThanOrEqualTo(String value) {
            addCriterion("TDB.LINK_NWIN_YN <=", value, "linkNwinYn");
            return (Criteria) this;
        }

        public Criteria andLinkNwinYnLike(String value) {
            addCriterion("TDB.LINK_NWIN_YN like", value, "linkNwinYn");
            return (Criteria) this;
        }

        public Criteria andLinkNwinYnNotLike(String value) {
            addCriterion("TDB.LINK_NWIN_YN not like", value, "linkNwinYn");
            return (Criteria) this;
        }

        public Criteria andLinkNwinYnIn(List<String> values) {
            addCriterion("TDB.LINK_NWIN_YN in", values, "linkNwinYn");
            return (Criteria) this;
        }

        public Criteria andLinkNwinYnNotIn(List<String> values) {
            addCriterion("TDB.LINK_NWIN_YN not in", values, "linkNwinYn");
            return (Criteria) this;
        }

        public Criteria andLinkNwinYnBetween(String value1, String value2) {
            addCriterion("TDB.LINK_NWIN_YN between", value1, value2, "linkNwinYn");
            return (Criteria) this;
        }

        public Criteria andLinkNwinYnNotBetween(String value1, String value2) {
            addCriterion("TDB.LINK_NWIN_YN not between", value1, value2, "linkNwinYn");
            return (Criteria) this;
        }

        public Criteria andSordIsNull() {
            addCriterion("TDB.SORD is null");
            return (Criteria) this;
        }

        public Criteria andSordIsNotNull() {
            addCriterion("TDB.SORD is not null");
            return (Criteria) this;
        }

        public Criteria andSordEqualTo(Integer value) {
            addCriterion("TDB.SORD =", value, "sord");
            return (Criteria) this;
        }

        public Criteria andSordNotEqualTo(Integer value) {
            addCriterion("TDB.SORD <>", value, "sord");
            return (Criteria) this;
        }

        public Criteria andSordGreaterThan(Integer value) {
            addCriterion("TDB.SORD >", value, "sord");
            return (Criteria) this;
        }

        public Criteria andSordGreaterThanOrEqualTo(Integer value) {
            addCriterion("TDB.SORD >=", value, "sord");
            return (Criteria) this;
        }

        public Criteria andSordLessThan(Integer value) {
            addCriterion("TDB.SORD <", value, "sord");
            return (Criteria) this;
        }

        public Criteria andSordLessThanOrEqualTo(Integer value) {
            addCriterion("TDB.SORD <=", value, "sord");
            return (Criteria) this;
        }

        public Criteria andSordIn(List<Integer> values) {
            addCriterion("TDB.SORD in", values, "sord");
            return (Criteria) this;
        }

        public Criteria andSordNotIn(List<Integer> values) {
            addCriterion("TDB.SORD not in", values, "sord");
            return (Criteria) this;
        }

        public Criteria andSordBetween(Integer value1, Integer value2) {
            addCriterion("TDB.SORD between", value1, value2, "sord");
            return (Criteria) this;
        }

        public Criteria andSordNotBetween(Integer value1, Integer value2) {
            addCriterion("TDB.SORD not between", value1, value2, "sord");
            return (Criteria) this;
        }

        public Criteria andDpYnIsNull() {
            addCriterion("TDB.DP_YN is null");
            return (Criteria) this;
        }

        public Criteria andDpYnIsNotNull() {
            addCriterion("TDB.DP_YN is not null");
            return (Criteria) this;
        }

        public Criteria andDpYnEqualTo(String value) {
            addCriterion("TDB.DP_YN =", value, "dpYn");
            return (Criteria) this;
        }

        public Criteria andDpYnNotEqualTo(String value) {
            addCriterion("TDB.DP_YN <>", value, "dpYn");
            return (Criteria) this;
        }

        public Criteria andDpYnGreaterThan(String value) {
            addCriterion("TDB.DP_YN >", value, "dpYn");
            return (Criteria) this;
        }

        public Criteria andDpYnGreaterThanOrEqualTo(String value) {
            addCriterion("TDB.DP_YN >=", value, "dpYn");
            return (Criteria) this;
        }

        public Criteria andDpYnLessThan(String value) {
            addCriterion("TDB.DP_YN <", value, "dpYn");
            return (Criteria) this;
        }

        public Criteria andDpYnLessThanOrEqualTo(String value) {
            addCriterion("TDB.DP_YN <=", value, "dpYn");
            return (Criteria) this;
        }

        public Criteria andDpYnLike(String value) {
            addCriterion("TDB.DP_YN like", value, "dpYn");
            return (Criteria) this;
        }

        public Criteria andDpYnNotLike(String value) {
            addCriterion("TDB.DP_YN not like", value, "dpYn");
            return (Criteria) this;
        }

        public Criteria andDpYnIn(List<String> values) {
            addCriterion("TDB.DP_YN in", values, "dpYn");
            return (Criteria) this;
        }

        public Criteria andDpYnNotIn(List<String> values) {
            addCriterion("TDB.DP_YN not in", values, "dpYn");
            return (Criteria) this;
        }

        public Criteria andDpYnBetween(String value1, String value2) {
            addCriterion("TDB.DP_YN between", value1, value2, "dpYn");
            return (Criteria) this;
        }

        public Criteria andDpYnNotBetween(String value1, String value2) {
            addCriterion("TDB.DP_YN not between", value1, value2, "dpYn");
            return (Criteria) this;
        }

        public Criteria andRegDtIsNull() {
            addCriterion("TDB.REG_DT is null");
            return (Criteria) this;
        }

        public Criteria andRegDtIsNotNull() {
            addCriterion("TDB.REG_DT is not null");
            return (Criteria) this;
        }

        public Criteria andRegDtEqualTo(Date value) {
            addCriterion("TDB.REG_DT =", value, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtNotEqualTo(Date value) {
            addCriterion("TDB.REG_DT <>", value, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtGreaterThan(Date value) {
            addCriterion("TDB.REG_DT >", value, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtGreaterThanOrEqualTo(Date value) {
            addCriterion("TDB.REG_DT >=", value, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtLessThan(Date value) {
            addCriterion("TDB.REG_DT <", value, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtLessThanOrEqualTo(Date value) {
            addCriterion("TDB.REG_DT <=", value, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtIn(List<Date> values) {
            addCriterion("TDB.REG_DT in", values, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtNotIn(List<Date> values) {
            addCriterion("TDB.REG_DT not in", values, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtBetween(Date value1, Date value2) {
            addCriterion("TDB.REG_DT between", value1, value2, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtNotBetween(Date value1, Date value2) {
            addCriterion("TDB.REG_DT not between", value1, value2, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegIdIsNull() {
            addCriterion("TDB.REG_ID is null");
            return (Criteria) this;
        }

        public Criteria andRegIdIsNotNull() {
            addCriterion("TDB.REG_ID is not null");
            return (Criteria) this;
        }

        public Criteria andRegIdEqualTo(String value) {
            addCriterion("TDB.REG_ID =", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdNotEqualTo(String value) {
            addCriterion("TDB.REG_ID <>", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdGreaterThan(String value) {
            addCriterion("TDB.REG_ID >", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdGreaterThanOrEqualTo(String value) {
            addCriterion("TDB.REG_ID >=", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdLessThan(String value) {
            addCriterion("TDB.REG_ID <", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdLessThanOrEqualTo(String value) {
            addCriterion("TDB.REG_ID <=", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdLike(String value) {
            addCriterion("TDB.REG_ID like", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdNotLike(String value) {
            addCriterion("TDB.REG_ID not like", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdIn(List<String> values) {
            addCriterion("TDB.REG_ID in", values, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdNotIn(List<String> values) {
            addCriterion("TDB.REG_ID not in", values, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdBetween(String value1, String value2) {
            addCriterion("TDB.REG_ID between", value1, value2, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdNotBetween(String value1, String value2) {
            addCriterion("TDB.REG_ID not between", value1, value2, "regId");
            return (Criteria) this;
        }

        public Criteria andModDtIsNull() {
            addCriterion("TDB.MOD_DT is null");
            return (Criteria) this;
        }

        public Criteria andModDtIsNotNull() {
            addCriterion("TDB.MOD_DT is not null");
            return (Criteria) this;
        }

        public Criteria andModDtEqualTo(Date value) {
            addCriterion("TDB.MOD_DT =", value, "modDt");
            return (Criteria) this;
        }

        public Criteria andModDtNotEqualTo(Date value) {
            addCriterion("TDB.MOD_DT <>", value, "modDt");
            return (Criteria) this;
        }

        public Criteria andModDtGreaterThan(Date value) {
            addCriterion("TDB.MOD_DT >", value, "modDt");
            return (Criteria) this;
        }

        public Criteria andModDtGreaterThanOrEqualTo(Date value) {
            addCriterion("TDB.MOD_DT >=", value, "modDt");
            return (Criteria) this;
        }

        public Criteria andModDtLessThan(Date value) {
            addCriterion("TDB.MOD_DT <", value, "modDt");
            return (Criteria) this;
        }

        public Criteria andModDtLessThanOrEqualTo(Date value) {
            addCriterion("TDB.MOD_DT <=", value, "modDt");
            return (Criteria) this;
        }

        public Criteria andModDtIn(List<Date> values) {
            addCriterion("TDB.MOD_DT in", values, "modDt");
            return (Criteria) this;
        }

        public Criteria andModDtNotIn(List<Date> values) {
            addCriterion("TDB.MOD_DT not in", values, "modDt");
            return (Criteria) this;
        }

        public Criteria andModDtBetween(Date value1, Date value2) {
            addCriterion("TDB.MOD_DT between", value1, value2, "modDt");
            return (Criteria) this;
        }

        public Criteria andModDtNotBetween(Date value1, Date value2) {
            addCriterion("TDB.MOD_DT not between", value1, value2, "modDt");
            return (Criteria) this;
        }

        public Criteria andModIdIsNull() {
            addCriterion("TDB.MOD_ID is null");
            return (Criteria) this;
        }

        public Criteria andModIdIsNotNull() {
            addCriterion("TDB.MOD_ID is not null");
            return (Criteria) this;
        }

        public Criteria andModIdEqualTo(String value) {
            addCriterion("TDB.MOD_ID =", value, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdNotEqualTo(String value) {
            addCriterion("TDB.MOD_ID <>", value, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdGreaterThan(String value) {
            addCriterion("TDB.MOD_ID >", value, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdGreaterThanOrEqualTo(String value) {
            addCriterion("TDB.MOD_ID >=", value, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdLessThan(String value) {
            addCriterion("TDB.MOD_ID <", value, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdLessThanOrEqualTo(String value) {
            addCriterion("TDB.MOD_ID <=", value, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdLike(String value) {
            addCriterion("TDB.MOD_ID like", value, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdNotLike(String value) {
            addCriterion("TDB.MOD_ID not like", value, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdIn(List<String> values) {
            addCriterion("TDB.MOD_ID in", values, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdNotIn(List<String> values) {
            addCriterion("TDB.MOD_ID not in", values, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdBetween(String value1, String value2) {
            addCriterion("TDB.MOD_ID between", value1, value2, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdNotBetween(String value1, String value2) {
            addCriterion("TDB.MOD_ID not between", value1, value2, "modId");
            return (Criteria) this;
        }

        public Criteria andUseYnIsNull() {
            addCriterion("TDB.USE_YN is null");
            return (Criteria) this;
        }

        public Criteria andUseYnIsNotNull() {
            addCriterion("TDB.USE_YN is not null");
            return (Criteria) this;
        }

        public Criteria andUseYnEqualTo(String value) {
            addCriterion("TDB.USE_YN =", value, "useYn");
            return (Criteria) this;
        }

        public Criteria andUseYnNotEqualTo(String value) {
            addCriterion("TDB.USE_YN <>", value, "useYn");
            return (Criteria) this;
        }

        public Criteria andUseYnGreaterThan(String value) {
            addCriterion("TDB.USE_YN >", value, "useYn");
            return (Criteria) this;
        }

        public Criteria andUseYnGreaterThanOrEqualTo(String value) {
            addCriterion("TDB.USE_YN >=", value, "useYn");
            return (Criteria) this;
        }

        public Criteria andUseYnLessThan(String value) {
            addCriterion("TDB.USE_YN <", value, "useYn");
            return (Criteria) this;
        }

        public Criteria andUseYnLessThanOrEqualTo(String value) {
            addCriterion("TDB.USE_YN <=", value, "useYn");
            return (Criteria) this;
        }

        public Criteria andUseYnLike(String value) {
            addCriterion("TDB.USE_YN like", value, "useYn");
            return (Criteria) this;
        }

        public Criteria andUseYnNotLike(String value) {
            addCriterion("TDB.USE_YN not like", value, "useYn");
            return (Criteria) this;
        }

        public Criteria andUseYnIn(List<String> values) {
            addCriterion("TDB.USE_YN in", values, "useYn");
            return (Criteria) this;
        }

        public Criteria andUseYnNotIn(List<String> values) {
            addCriterion("TDB.USE_YN not in", values, "useYn");
            return (Criteria) this;
        }

        public Criteria andUseYnBetween(String value1, String value2) {
            addCriterion("TDB.USE_YN between", value1, value2, "useYn");
            return (Criteria) this;
        }

        public Criteria andUseYnNotBetween(String value1, String value2) {
            addCriterion("TDB.USE_YN not between", value1, value2, "useYn");
            return (Criteria) this;
        }

        public Criteria andBrndNmLikeInsensitive(String value) {
            addCriterion("upper(TDB.BRND_NM) like", value.toUpperCase(), "brndNm");
            return (Criteria) this;
        }

        public Criteria andBrndNmGrpCdLikeInsensitive(String value) {
            addCriterion("upper(TDB.BRND_NM_GRP_CD) like", value.toUpperCase(), "brndNmGrpCd");
            return (Criteria) this;
        }

        public Criteria andBrndEngNmLikeInsensitive(String value) {
            addCriterion("upper(TDB.BRND_ENG_NM) like", value.toUpperCase(), "brndEngNm");
            return (Criteria) this;
        }

        public Criteria andBrndDescLikeInsensitive(String value) {
            addCriterion("upper(TDB.BRND_DESC) like", value.toUpperCase(), "brndDesc");
            return (Criteria) this;
        }

        public Criteria andBrndDtlDescLikeInsensitive(String value) {
            addCriterion("upper(TDB.BRND_DTL_DESC) like", value.toUpperCase(), "brndDtlDesc");
            return (Criteria) this;
        }

        public Criteria andBrndStoryPcLikeInsensitive(String value) {
            addCriterion("upper(TDB.BRND_STORY_PC) like", value.toUpperCase(), "brndStoryPc");
            return (Criteria) this;
        }

        public Criteria andBrndStoryMobLikeInsensitive(String value) {
            addCriterion("upper(TDB.BRND_STORY_MOB) like", value.toUpperCase(), "brndStoryMob");
            return (Criteria) this;
        }

        public Criteria andLinkUrlAddrLikeInsensitive(String value) {
            addCriterion("upper(TDB.LINK_URL_ADDR) like", value.toUpperCase(), "linkUrlAddr");
            return (Criteria) this;
        }

        public Criteria andLinkNwinYnLikeInsensitive(String value) {
            addCriterion("upper(TDB.LINK_NWIN_YN) like", value.toUpperCase(), "linkNwinYn");
            return (Criteria) this;
        }

        public Criteria andDpYnLikeInsensitive(String value) {
            addCriterion("upper(TDB.DP_YN) like", value.toUpperCase(), "dpYn");
            return (Criteria) this;
        }

        public Criteria andRegIdLikeInsensitive(String value) {
            addCriterion("upper(TDB.REG_ID) like", value.toUpperCase(), "regId");
            return (Criteria) this;
        }

        public Criteria andModIdLikeInsensitive(String value) {
            addCriterion("upper(TDB.MOD_ID) like", value.toUpperCase(), "modId");
            return (Criteria) this;
        }

        public Criteria andUseYnLikeInsensitive(String value) {
            addCriterion("upper(TDB.USE_YN) like", value.toUpperCase(), "useYn");
            return (Criteria) this;
        }

        public Criteria andBrndNmLikeLeft(String value) {
            addCriterion("TDB.BRND_NM like ", "%" + value, "brndNm");
            return (Criteria) this;
        }

        public Criteria andBrndNmLikeRight(String value) {
            addCriterion("TDB.BRND_NM like ", value + "%", "brndNm");
            return (Criteria) this;
        }

        public Criteria andBrndNmLikeBoth(String value) {
            addCriterion("TDB.BRND_NM like ", "%" + value + "%", "brndNm");
            return (Criteria) this;
        }

        public Criteria andBrndNmGrpCdLikeLeft(String value) {
            addCriterion("TDB.BRND_NM_GRP_CD like ", "%" + value, "brndNmGrpCd");
            return (Criteria) this;
        }

        public Criteria andBrndNmGrpCdLikeRight(String value) {
            addCriterion("TDB.BRND_NM_GRP_CD like ", value + "%", "brndNmGrpCd");
            return (Criteria) this;
        }

        public Criteria andBrndNmGrpCdLikeBoth(String value) {
            addCriterion("TDB.BRND_NM_GRP_CD like ", "%" + value + "%", "brndNmGrpCd");
            return (Criteria) this;
        }

        public Criteria andBrndEngNmLikeLeft(String value) {
            addCriterion("TDB.BRND_ENG_NM like ", "%" + value, "brndEngNm");
            return (Criteria) this;
        }

        public Criteria andBrndEngNmLikeRight(String value) {
            addCriterion("TDB.BRND_ENG_NM like ", value + "%", "brndEngNm");
            return (Criteria) this;
        }

        public Criteria andBrndEngNmLikeBoth(String value) {
            addCriterion("TDB.BRND_ENG_NM like ", "%" + value + "%", "brndEngNm");
            return (Criteria) this;
        }

        public Criteria andBrndDescLikeLeft(String value) {
            addCriterion("TDB.BRND_DESC like ", "%" + value, "brndDesc");
            return (Criteria) this;
        }

        public Criteria andBrndDescLikeRight(String value) {
            addCriterion("TDB.BRND_DESC like ", value + "%", "brndDesc");
            return (Criteria) this;
        }

        public Criteria andBrndDescLikeBoth(String value) {
            addCriterion("TDB.BRND_DESC like ", "%" + value + "%", "brndDesc");
            return (Criteria) this;
        }

        public Criteria andBrndDtlDescLikeLeft(String value) {
            addCriterion("TDB.BRND_DTL_DESC like ", "%" + value, "brndDtlDesc");
            return (Criteria) this;
        }

        public Criteria andBrndDtlDescLikeRight(String value) {
            addCriterion("TDB.BRND_DTL_DESC like ", value + "%", "brndDtlDesc");
            return (Criteria) this;
        }

        public Criteria andBrndDtlDescLikeBoth(String value) {
            addCriterion("TDB.BRND_DTL_DESC like ", "%" + value + "%", "brndDtlDesc");
            return (Criteria) this;
        }

        public Criteria andBrndStoryPcLikeLeft(String value) {
            addCriterion("TDB.BRND_STORY_PC like ", "%" + value, "brndStoryPc");
            return (Criteria) this;
        }

        public Criteria andBrndStoryPcLikeRight(String value) {
            addCriterion("TDB.BRND_STORY_PC like ", value + "%", "brndStoryPc");
            return (Criteria) this;
        }

        public Criteria andBrndStoryPcLikeBoth(String value) {
            addCriterion("TDB.BRND_STORY_PC like ", "%" + value + "%", "brndStoryPc");
            return (Criteria) this;
        }

        public Criteria andBrndStoryMobLikeLeft(String value) {
            addCriterion("TDB.BRND_STORY_MOB like ", "%" + value, "brndStoryMob");
            return (Criteria) this;
        }

        public Criteria andBrndStoryMobLikeRight(String value) {
            addCriterion("TDB.BRND_STORY_MOB like ", value + "%", "brndStoryMob");
            return (Criteria) this;
        }

        public Criteria andBrndStoryMobLikeBoth(String value) {
            addCriterion("TDB.BRND_STORY_MOB like ", "%" + value + "%", "brndStoryMob");
            return (Criteria) this;
        }

        public Criteria andLinkUrlAddrLikeLeft(String value) {
            addCriterion("TDB.LINK_URL_ADDR like ", "%" + value, "linkUrlAddr");
            return (Criteria) this;
        }

        public Criteria andLinkUrlAddrLikeRight(String value) {
            addCriterion("TDB.LINK_URL_ADDR like ", value + "%", "linkUrlAddr");
            return (Criteria) this;
        }

        public Criteria andLinkUrlAddrLikeBoth(String value) {
            addCriterion("TDB.LINK_URL_ADDR like ", "%" + value + "%", "linkUrlAddr");
            return (Criteria) this;
        }

        public Criteria andLinkNwinYnLikeLeft(String value) {
            addCriterion("TDB.LINK_NWIN_YN like ", "%" + value, "linkNwinYn");
            return (Criteria) this;
        }

        public Criteria andLinkNwinYnLikeRight(String value) {
            addCriterion("TDB.LINK_NWIN_YN like ", value + "%", "linkNwinYn");
            return (Criteria) this;
        }

        public Criteria andLinkNwinYnLikeBoth(String value) {
            addCriterion("TDB.LINK_NWIN_YN like ", "%" + value + "%", "linkNwinYn");
            return (Criteria) this;
        }

        public Criteria andDpYnLikeLeft(String value) {
            addCriterion("TDB.DP_YN like ", "%" + value, "dpYn");
            return (Criteria) this;
        }

        public Criteria andDpYnLikeRight(String value) {
            addCriterion("TDB.DP_YN like ", value + "%", "dpYn");
            return (Criteria) this;
        }

        public Criteria andDpYnLikeBoth(String value) {
            addCriterion("TDB.DP_YN like ", "%" + value + "%", "dpYn");
            return (Criteria) this;
        }

        public Criteria andRegIdLikeLeft(String value) {
            addCriterion("TDB.REG_ID like ", "%" + value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdLikeRight(String value) {
            addCriterion("TDB.REG_ID like ", value + "%", "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdLikeBoth(String value) {
            addCriterion("TDB.REG_ID like ", "%" + value + "%", "regId");
            return (Criteria) this;
        }

        public Criteria andModIdLikeLeft(String value) {
            addCriterion("TDB.MOD_ID like ", "%" + value, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdLikeRight(String value) {
            addCriterion("TDB.MOD_ID like ", value + "%", "modId");
            return (Criteria) this;
        }

        public Criteria andModIdLikeBoth(String value) {
            addCriterion("TDB.MOD_ID like ", "%" + value + "%", "modId");
            return (Criteria) this;
        }

        public Criteria andUseYnLikeLeft(String value) {
            addCriterion("TDB.USE_YN like ", "%" + value, "useYn");
            return (Criteria) this;
        }

        public Criteria andUseYnLikeRight(String value) {
            addCriterion("TDB.USE_YN like ", value + "%", "useYn");
            return (Criteria) this;
        }

        public Criteria andUseYnLikeBoth(String value) {
            addCriterion("TDB.USE_YN like ", "%" + value + "%", "useYn");
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