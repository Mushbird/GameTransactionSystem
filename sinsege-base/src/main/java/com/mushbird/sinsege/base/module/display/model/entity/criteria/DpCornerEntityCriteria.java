package com.mushbird.sinsege.base.module.display.model.entity.criteria;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DpCornerEntityCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    public DpCornerEntityCriteria() {
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

        public Criteria andDpConrCdIsNull() {
            addCriterion("TDC.DP_CONR_CD is null");
            return (Criteria) this;
        }

        public Criteria andDpConrCdIsNotNull() {
            addCriterion("TDC.DP_CONR_CD is not null");
            return (Criteria) this;
        }

        public Criteria andDpConrCdEqualTo(String value) {
            addCriterion("TDC.DP_CONR_CD =", value, "dpConrCd");
            return (Criteria) this;
        }

        public Criteria andDpConrCdNotEqualTo(String value) {
            addCriterion("TDC.DP_CONR_CD <>", value, "dpConrCd");
            return (Criteria) this;
        }

        public Criteria andDpConrCdGreaterThan(String value) {
            addCriterion("TDC.DP_CONR_CD >", value, "dpConrCd");
            return (Criteria) this;
        }

        public Criteria andDpConrCdGreaterThanOrEqualTo(String value) {
            addCriterion("TDC.DP_CONR_CD >=", value, "dpConrCd");
            return (Criteria) this;
        }

        public Criteria andDpConrCdLessThan(String value) {
            addCriterion("TDC.DP_CONR_CD <", value, "dpConrCd");
            return (Criteria) this;
        }

        public Criteria andDpConrCdLessThanOrEqualTo(String value) {
            addCriterion("TDC.DP_CONR_CD <=", value, "dpConrCd");
            return (Criteria) this;
        }

        public Criteria andDpConrCdLike(String value) {
            addCriterion("TDC.DP_CONR_CD like", value, "dpConrCd");
            return (Criteria) this;
        }

        public Criteria andDpConrCdNotLike(String value) {
            addCriterion("TDC.DP_CONR_CD not like", value, "dpConrCd");
            return (Criteria) this;
        }

        public Criteria andDpConrCdIn(List<String> values) {
            addCriterion("TDC.DP_CONR_CD in", values, "dpConrCd");
            return (Criteria) this;
        }

        public Criteria andDpConrCdNotIn(List<String> values) {
            addCriterion("TDC.DP_CONR_CD not in", values, "dpConrCd");
            return (Criteria) this;
        }

        public Criteria andDpConrCdBetween(String value1, String value2) {
            addCriterion("TDC.DP_CONR_CD between", value1, value2, "dpConrCd");
            return (Criteria) this;
        }

        public Criteria andDpConrCdNotBetween(String value1, String value2) {
            addCriterion("TDC.DP_CONR_CD not between", value1, value2, "dpConrCd");
            return (Criteria) this;
        }

        public Criteria andDpChIdIsNull() {
            addCriterion("TDC.DP_CH_ID is null");
            return (Criteria) this;
        }

        public Criteria andDpChIdIsNotNull() {
            addCriterion("TDC.DP_CH_ID is not null");
            return (Criteria) this;
        }

        public Criteria andDpChIdEqualTo(Integer value) {
            addCriterion("TDC.DP_CH_ID =", value, "dpChId");
            return (Criteria) this;
        }

        public Criteria andDpChIdNotEqualTo(Integer value) {
            addCriterion("TDC.DP_CH_ID <>", value, "dpChId");
            return (Criteria) this;
        }

        public Criteria andDpChIdGreaterThan(Integer value) {
            addCriterion("TDC.DP_CH_ID >", value, "dpChId");
            return (Criteria) this;
        }

        public Criteria andDpChIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("TDC.DP_CH_ID >=", value, "dpChId");
            return (Criteria) this;
        }

        public Criteria andDpChIdLessThan(Integer value) {
            addCriterion("TDC.DP_CH_ID <", value, "dpChId");
            return (Criteria) this;
        }

        public Criteria andDpChIdLessThanOrEqualTo(Integer value) {
            addCriterion("TDC.DP_CH_ID <=", value, "dpChId");
            return (Criteria) this;
        }

        public Criteria andDpChIdIn(List<Integer> values) {
            addCriterion("TDC.DP_CH_ID in", values, "dpChId");
            return (Criteria) this;
        }

        public Criteria andDpChIdNotIn(List<Integer> values) {
            addCriterion("TDC.DP_CH_ID not in", values, "dpChId");
            return (Criteria) this;
        }

        public Criteria andDpChIdBetween(Integer value1, Integer value2) {
            addCriterion("TDC.DP_CH_ID between", value1, value2, "dpChId");
            return (Criteria) this;
        }

        public Criteria andDpChIdNotBetween(Integer value1, Integer value2) {
            addCriterion("TDC.DP_CH_ID not between", value1, value2, "dpChId");
            return (Criteria) this;
        }

        public Criteria andConrNmIsNull() {
            addCriterion("TDC.CONR_NM is null");
            return (Criteria) this;
        }

        public Criteria andConrNmIsNotNull() {
            addCriterion("TDC.CONR_NM is not null");
            return (Criteria) this;
        }

        public Criteria andConrNmEqualTo(String value) {
            addCriterion("TDC.CONR_NM =", value, "conrNm");
            return (Criteria) this;
        }

        public Criteria andConrNmNotEqualTo(String value) {
            addCriterion("TDC.CONR_NM <>", value, "conrNm");
            return (Criteria) this;
        }

        public Criteria andConrNmGreaterThan(String value) {
            addCriterion("TDC.CONR_NM >", value, "conrNm");
            return (Criteria) this;
        }

        public Criteria andConrNmGreaterThanOrEqualTo(String value) {
            addCriterion("TDC.CONR_NM >=", value, "conrNm");
            return (Criteria) this;
        }

        public Criteria andConrNmLessThan(String value) {
            addCriterion("TDC.CONR_NM <", value, "conrNm");
            return (Criteria) this;
        }

        public Criteria andConrNmLessThanOrEqualTo(String value) {
            addCriterion("TDC.CONR_NM <=", value, "conrNm");
            return (Criteria) this;
        }

        public Criteria andConrNmLike(String value) {
            addCriterion("TDC.CONR_NM like", value, "conrNm");
            return (Criteria) this;
        }

        public Criteria andConrNmNotLike(String value) {
            addCriterion("TDC.CONR_NM not like", value, "conrNm");
            return (Criteria) this;
        }

        public Criteria andConrNmIn(List<String> values) {
            addCriterion("TDC.CONR_NM in", values, "conrNm");
            return (Criteria) this;
        }

        public Criteria andConrNmNotIn(List<String> values) {
            addCriterion("TDC.CONR_NM not in", values, "conrNm");
            return (Criteria) this;
        }

        public Criteria andConrNmBetween(String value1, String value2) {
            addCriterion("TDC.CONR_NM between", value1, value2, "conrNm");
            return (Criteria) this;
        }

        public Criteria andConrNmNotBetween(String value1, String value2) {
            addCriterion("TDC.CONR_NM not between", value1, value2, "conrNm");
            return (Criteria) this;
        }

        public Criteria andConrGrpClCdIsNull() {
            addCriterion("TDC.CONR_GRP_CL_CD is null");
            return (Criteria) this;
        }

        public Criteria andConrGrpClCdIsNotNull() {
            addCriterion("TDC.CONR_GRP_CL_CD is not null");
            return (Criteria) this;
        }

        public Criteria andConrGrpClCdEqualTo(String value) {
            addCriterion("TDC.CONR_GRP_CL_CD =", value, "conrGrpClCd");
            return (Criteria) this;
        }

        public Criteria andConrGrpClCdNotEqualTo(String value) {
            addCriterion("TDC.CONR_GRP_CL_CD <>", value, "conrGrpClCd");
            return (Criteria) this;
        }

        public Criteria andConrGrpClCdGreaterThan(String value) {
            addCriterion("TDC.CONR_GRP_CL_CD >", value, "conrGrpClCd");
            return (Criteria) this;
        }

        public Criteria andConrGrpClCdGreaterThanOrEqualTo(String value) {
            addCriterion("TDC.CONR_GRP_CL_CD >=", value, "conrGrpClCd");
            return (Criteria) this;
        }

        public Criteria andConrGrpClCdLessThan(String value) {
            addCriterion("TDC.CONR_GRP_CL_CD <", value, "conrGrpClCd");
            return (Criteria) this;
        }

        public Criteria andConrGrpClCdLessThanOrEqualTo(String value) {
            addCriterion("TDC.CONR_GRP_CL_CD <=", value, "conrGrpClCd");
            return (Criteria) this;
        }

        public Criteria andConrGrpClCdLike(String value) {
            addCriterion("TDC.CONR_GRP_CL_CD like", value, "conrGrpClCd");
            return (Criteria) this;
        }

        public Criteria andConrGrpClCdNotLike(String value) {
            addCriterion("TDC.CONR_GRP_CL_CD not like", value, "conrGrpClCd");
            return (Criteria) this;
        }

        public Criteria andConrGrpClCdIn(List<String> values) {
            addCriterion("TDC.CONR_GRP_CL_CD in", values, "conrGrpClCd");
            return (Criteria) this;
        }

        public Criteria andConrGrpClCdNotIn(List<String> values) {
            addCriterion("TDC.CONR_GRP_CL_CD not in", values, "conrGrpClCd");
            return (Criteria) this;
        }

        public Criteria andConrGrpClCdBetween(String value1, String value2) {
            addCriterion("TDC.CONR_GRP_CL_CD between", value1, value2, "conrGrpClCd");
            return (Criteria) this;
        }

        public Criteria andConrGrpClCdNotBetween(String value1, String value2) {
            addCriterion("TDC.CONR_GRP_CL_CD not between", value1, value2, "conrGrpClCd");
            return (Criteria) this;
        }

        public Criteria andConrNmDpYnIsNull() {
            addCriterion("TDC.CONR_NM_DP_YN is null");
            return (Criteria) this;
        }

        public Criteria andConrNmDpYnIsNotNull() {
            addCriterion("TDC.CONR_NM_DP_YN is not null");
            return (Criteria) this;
        }

        public Criteria andConrNmDpYnEqualTo(String value) {
            addCriterion("TDC.CONR_NM_DP_YN =", value, "conrNmDpYn");
            return (Criteria) this;
        }

        public Criteria andConrNmDpYnNotEqualTo(String value) {
            addCriterion("TDC.CONR_NM_DP_YN <>", value, "conrNmDpYn");
            return (Criteria) this;
        }

        public Criteria andConrNmDpYnGreaterThan(String value) {
            addCriterion("TDC.CONR_NM_DP_YN >", value, "conrNmDpYn");
            return (Criteria) this;
        }

        public Criteria andConrNmDpYnGreaterThanOrEqualTo(String value) {
            addCriterion("TDC.CONR_NM_DP_YN >=", value, "conrNmDpYn");
            return (Criteria) this;
        }

        public Criteria andConrNmDpYnLessThan(String value) {
            addCriterion("TDC.CONR_NM_DP_YN <", value, "conrNmDpYn");
            return (Criteria) this;
        }

        public Criteria andConrNmDpYnLessThanOrEqualTo(String value) {
            addCriterion("TDC.CONR_NM_DP_YN <=", value, "conrNmDpYn");
            return (Criteria) this;
        }

        public Criteria andConrNmDpYnLike(String value) {
            addCriterion("TDC.CONR_NM_DP_YN like", value, "conrNmDpYn");
            return (Criteria) this;
        }

        public Criteria andConrNmDpYnNotLike(String value) {
            addCriterion("TDC.CONR_NM_DP_YN not like", value, "conrNmDpYn");
            return (Criteria) this;
        }

        public Criteria andConrNmDpYnIn(List<String> values) {
            addCriterion("TDC.CONR_NM_DP_YN in", values, "conrNmDpYn");
            return (Criteria) this;
        }

        public Criteria andConrNmDpYnNotIn(List<String> values) {
            addCriterion("TDC.CONR_NM_DP_YN not in", values, "conrNmDpYn");
            return (Criteria) this;
        }

        public Criteria andConrNmDpYnBetween(String value1, String value2) {
            addCriterion("TDC.CONR_NM_DP_YN between", value1, value2, "conrNmDpYn");
            return (Criteria) this;
        }

        public Criteria andConrNmDpYnNotBetween(String value1, String value2) {
            addCriterion("TDC.CONR_NM_DP_YN not between", value1, value2, "conrNmDpYn");
            return (Criteria) this;
        }

        public Criteria andConrDescIsNull() {
            addCriterion("TDC.CONR_DESC is null");
            return (Criteria) this;
        }

        public Criteria andConrDescIsNotNull() {
            addCriterion("TDC.CONR_DESC is not null");
            return (Criteria) this;
        }

        public Criteria andConrDescEqualTo(String value) {
            addCriterion("TDC.CONR_DESC =", value, "conrDesc");
            return (Criteria) this;
        }

        public Criteria andConrDescNotEqualTo(String value) {
            addCriterion("TDC.CONR_DESC <>", value, "conrDesc");
            return (Criteria) this;
        }

        public Criteria andConrDescGreaterThan(String value) {
            addCriterion("TDC.CONR_DESC >", value, "conrDesc");
            return (Criteria) this;
        }

        public Criteria andConrDescGreaterThanOrEqualTo(String value) {
            addCriterion("TDC.CONR_DESC >=", value, "conrDesc");
            return (Criteria) this;
        }

        public Criteria andConrDescLessThan(String value) {
            addCriterion("TDC.CONR_DESC <", value, "conrDesc");
            return (Criteria) this;
        }

        public Criteria andConrDescLessThanOrEqualTo(String value) {
            addCriterion("TDC.CONR_DESC <=", value, "conrDesc");
            return (Criteria) this;
        }

        public Criteria andConrDescLike(String value) {
            addCriterion("TDC.CONR_DESC like", value, "conrDesc");
            return (Criteria) this;
        }

        public Criteria andConrDescNotLike(String value) {
            addCriterion("TDC.CONR_DESC not like", value, "conrDesc");
            return (Criteria) this;
        }

        public Criteria andConrDescIn(List<String> values) {
            addCriterion("TDC.CONR_DESC in", values, "conrDesc");
            return (Criteria) this;
        }

        public Criteria andConrDescNotIn(List<String> values) {
            addCriterion("TDC.CONR_DESC not in", values, "conrDesc");
            return (Criteria) this;
        }

        public Criteria andConrDescBetween(String value1, String value2) {
            addCriterion("TDC.CONR_DESC between", value1, value2, "conrDesc");
            return (Criteria) this;
        }

        public Criteria andConrDescNotBetween(String value1, String value2) {
            addCriterion("TDC.CONR_DESC not between", value1, value2, "conrDesc");
            return (Criteria) this;
        }

        public Criteria andConrContPcIsNull() {
            addCriterion("TDC.CONR_CONT_PC is null");
            return (Criteria) this;
        }

        public Criteria andConrContPcIsNotNull() {
            addCriterion("TDC.CONR_CONT_PC is not null");
            return (Criteria) this;
        }

        public Criteria andConrContPcEqualTo(String value) {
            addCriterion("TDC.CONR_CONT_PC =", value, "conrContPc");
            return (Criteria) this;
        }

        public Criteria andConrContPcNotEqualTo(String value) {
            addCriterion("TDC.CONR_CONT_PC <>", value, "conrContPc");
            return (Criteria) this;
        }

        public Criteria andConrContPcGreaterThan(String value) {
            addCriterion("TDC.CONR_CONT_PC >", value, "conrContPc");
            return (Criteria) this;
        }

        public Criteria andConrContPcGreaterThanOrEqualTo(String value) {
            addCriterion("TDC.CONR_CONT_PC >=", value, "conrContPc");
            return (Criteria) this;
        }

        public Criteria andConrContPcLessThan(String value) {
            addCriterion("TDC.CONR_CONT_PC <", value, "conrContPc");
            return (Criteria) this;
        }

        public Criteria andConrContPcLessThanOrEqualTo(String value) {
            addCriterion("TDC.CONR_CONT_PC <=", value, "conrContPc");
            return (Criteria) this;
        }

        public Criteria andConrContPcLike(String value) {
            addCriterion("TDC.CONR_CONT_PC like", value, "conrContPc");
            return (Criteria) this;
        }

        public Criteria andConrContPcNotLike(String value) {
            addCriterion("TDC.CONR_CONT_PC not like", value, "conrContPc");
            return (Criteria) this;
        }

        public Criteria andConrContPcIn(List<String> values) {
            addCriterion("TDC.CONR_CONT_PC in", values, "conrContPc");
            return (Criteria) this;
        }

        public Criteria andConrContPcNotIn(List<String> values) {
            addCriterion("TDC.CONR_CONT_PC not in", values, "conrContPc");
            return (Criteria) this;
        }

        public Criteria andConrContPcBetween(String value1, String value2) {
            addCriterion("TDC.CONR_CONT_PC between", value1, value2, "conrContPc");
            return (Criteria) this;
        }

        public Criteria andConrContPcNotBetween(String value1, String value2) {
            addCriterion("TDC.CONR_CONT_PC not between", value1, value2, "conrContPc");
            return (Criteria) this;
        }

        public Criteria andConrContMobIsNull() {
            addCriterion("TDC.CONR_CONT_MOB is null");
            return (Criteria) this;
        }

        public Criteria andConrContMobIsNotNull() {
            addCriterion("TDC.CONR_CONT_MOB is not null");
            return (Criteria) this;
        }

        public Criteria andConrContMobEqualTo(String value) {
            addCriterion("TDC.CONR_CONT_MOB =", value, "conrContMob");
            return (Criteria) this;
        }

        public Criteria andConrContMobNotEqualTo(String value) {
            addCriterion("TDC.CONR_CONT_MOB <>", value, "conrContMob");
            return (Criteria) this;
        }

        public Criteria andConrContMobGreaterThan(String value) {
            addCriterion("TDC.CONR_CONT_MOB >", value, "conrContMob");
            return (Criteria) this;
        }

        public Criteria andConrContMobGreaterThanOrEqualTo(String value) {
            addCriterion("TDC.CONR_CONT_MOB >=", value, "conrContMob");
            return (Criteria) this;
        }

        public Criteria andConrContMobLessThan(String value) {
            addCriterion("TDC.CONR_CONT_MOB <", value, "conrContMob");
            return (Criteria) this;
        }

        public Criteria andConrContMobLessThanOrEqualTo(String value) {
            addCriterion("TDC.CONR_CONT_MOB <=", value, "conrContMob");
            return (Criteria) this;
        }

        public Criteria andConrContMobLike(String value) {
            addCriterion("TDC.CONR_CONT_MOB like", value, "conrContMob");
            return (Criteria) this;
        }

        public Criteria andConrContMobNotLike(String value) {
            addCriterion("TDC.CONR_CONT_MOB not like", value, "conrContMob");
            return (Criteria) this;
        }

        public Criteria andConrContMobIn(List<String> values) {
            addCriterion("TDC.CONR_CONT_MOB in", values, "conrContMob");
            return (Criteria) this;
        }

        public Criteria andConrContMobNotIn(List<String> values) {
            addCriterion("TDC.CONR_CONT_MOB not in", values, "conrContMob");
            return (Criteria) this;
        }

        public Criteria andConrContMobBetween(String value1, String value2) {
            addCriterion("TDC.CONR_CONT_MOB between", value1, value2, "conrContMob");
            return (Criteria) this;
        }

        public Criteria andConrContMobNotBetween(String value1, String value2) {
            addCriterion("TDC.CONR_CONT_MOB not between", value1, value2, "conrContMob");
            return (Criteria) this;
        }

        public Criteria andLinkUrlAddrIsNull() {
            addCriterion("TDC.LINK_URL_ADDR is null");
            return (Criteria) this;
        }

        public Criteria andLinkUrlAddrIsNotNull() {
            addCriterion("TDC.LINK_URL_ADDR is not null");
            return (Criteria) this;
        }

        public Criteria andLinkUrlAddrEqualTo(String value) {
            addCriterion("TDC.LINK_URL_ADDR =", value, "linkUrlAddr");
            return (Criteria) this;
        }

        public Criteria andLinkUrlAddrNotEqualTo(String value) {
            addCriterion("TDC.LINK_URL_ADDR <>", value, "linkUrlAddr");
            return (Criteria) this;
        }

        public Criteria andLinkUrlAddrGreaterThan(String value) {
            addCriterion("TDC.LINK_URL_ADDR >", value, "linkUrlAddr");
            return (Criteria) this;
        }

        public Criteria andLinkUrlAddrGreaterThanOrEqualTo(String value) {
            addCriterion("TDC.LINK_URL_ADDR >=", value, "linkUrlAddr");
            return (Criteria) this;
        }

        public Criteria andLinkUrlAddrLessThan(String value) {
            addCriterion("TDC.LINK_URL_ADDR <", value, "linkUrlAddr");
            return (Criteria) this;
        }

        public Criteria andLinkUrlAddrLessThanOrEqualTo(String value) {
            addCriterion("TDC.LINK_URL_ADDR <=", value, "linkUrlAddr");
            return (Criteria) this;
        }

        public Criteria andLinkUrlAddrLike(String value) {
            addCriterion("TDC.LINK_URL_ADDR like", value, "linkUrlAddr");
            return (Criteria) this;
        }

        public Criteria andLinkUrlAddrNotLike(String value) {
            addCriterion("TDC.LINK_URL_ADDR not like", value, "linkUrlAddr");
            return (Criteria) this;
        }

        public Criteria andLinkUrlAddrIn(List<String> values) {
            addCriterion("TDC.LINK_URL_ADDR in", values, "linkUrlAddr");
            return (Criteria) this;
        }

        public Criteria andLinkUrlAddrNotIn(List<String> values) {
            addCriterion("TDC.LINK_URL_ADDR not in", values, "linkUrlAddr");
            return (Criteria) this;
        }

        public Criteria andLinkUrlAddrBetween(String value1, String value2) {
            addCriterion("TDC.LINK_URL_ADDR between", value1, value2, "linkUrlAddr");
            return (Criteria) this;
        }

        public Criteria andLinkUrlAddrNotBetween(String value1, String value2) {
            addCriterion("TDC.LINK_URL_ADDR not between", value1, value2, "linkUrlAddr");
            return (Criteria) this;
        }

        public Criteria andLinkNwinYnIsNull() {
            addCriterion("TDC.LINK_NWIN_YN is null");
            return (Criteria) this;
        }

        public Criteria andLinkNwinYnIsNotNull() {
            addCriterion("TDC.LINK_NWIN_YN is not null");
            return (Criteria) this;
        }

        public Criteria andLinkNwinYnEqualTo(String value) {
            addCriterion("TDC.LINK_NWIN_YN =", value, "linkNwinYn");
            return (Criteria) this;
        }

        public Criteria andLinkNwinYnNotEqualTo(String value) {
            addCriterion("TDC.LINK_NWIN_YN <>", value, "linkNwinYn");
            return (Criteria) this;
        }

        public Criteria andLinkNwinYnGreaterThan(String value) {
            addCriterion("TDC.LINK_NWIN_YN >", value, "linkNwinYn");
            return (Criteria) this;
        }

        public Criteria andLinkNwinYnGreaterThanOrEqualTo(String value) {
            addCriterion("TDC.LINK_NWIN_YN >=", value, "linkNwinYn");
            return (Criteria) this;
        }

        public Criteria andLinkNwinYnLessThan(String value) {
            addCriterion("TDC.LINK_NWIN_YN <", value, "linkNwinYn");
            return (Criteria) this;
        }

        public Criteria andLinkNwinYnLessThanOrEqualTo(String value) {
            addCriterion("TDC.LINK_NWIN_YN <=", value, "linkNwinYn");
            return (Criteria) this;
        }

        public Criteria andLinkNwinYnLike(String value) {
            addCriterion("TDC.LINK_NWIN_YN like", value, "linkNwinYn");
            return (Criteria) this;
        }

        public Criteria andLinkNwinYnNotLike(String value) {
            addCriterion("TDC.LINK_NWIN_YN not like", value, "linkNwinYn");
            return (Criteria) this;
        }

        public Criteria andLinkNwinYnIn(List<String> values) {
            addCriterion("TDC.LINK_NWIN_YN in", values, "linkNwinYn");
            return (Criteria) this;
        }

        public Criteria andLinkNwinYnNotIn(List<String> values) {
            addCriterion("TDC.LINK_NWIN_YN not in", values, "linkNwinYn");
            return (Criteria) this;
        }

        public Criteria andLinkNwinYnBetween(String value1, String value2) {
            addCriterion("TDC.LINK_NWIN_YN between", value1, value2, "linkNwinYn");
            return (Criteria) this;
        }

        public Criteria andLinkNwinYnNotBetween(String value1, String value2) {
            addCriterion("TDC.LINK_NWIN_YN not between", value1, value2, "linkNwinYn");
            return (Criteria) this;
        }

        public Criteria andDpYnIsNull() {
            addCriterion("TDC.DP_YN is null");
            return (Criteria) this;
        }

        public Criteria andDpYnIsNotNull() {
            addCriterion("TDC.DP_YN is not null");
            return (Criteria) this;
        }

        public Criteria andDpYnEqualTo(String value) {
            addCriterion("TDC.DP_YN =", value, "dpYn");
            return (Criteria) this;
        }

        public Criteria andDpYnNotEqualTo(String value) {
            addCriterion("TDC.DP_YN <>", value, "dpYn");
            return (Criteria) this;
        }

        public Criteria andDpYnGreaterThan(String value) {
            addCriterion("TDC.DP_YN >", value, "dpYn");
            return (Criteria) this;
        }

        public Criteria andDpYnGreaterThanOrEqualTo(String value) {
            addCriterion("TDC.DP_YN >=", value, "dpYn");
            return (Criteria) this;
        }

        public Criteria andDpYnLessThan(String value) {
            addCriterion("TDC.DP_YN <", value, "dpYn");
            return (Criteria) this;
        }

        public Criteria andDpYnLessThanOrEqualTo(String value) {
            addCriterion("TDC.DP_YN <=", value, "dpYn");
            return (Criteria) this;
        }

        public Criteria andDpYnLike(String value) {
            addCriterion("TDC.DP_YN like", value, "dpYn");
            return (Criteria) this;
        }

        public Criteria andDpYnNotLike(String value) {
            addCriterion("TDC.DP_YN not like", value, "dpYn");
            return (Criteria) this;
        }

        public Criteria andDpYnIn(List<String> values) {
            addCriterion("TDC.DP_YN in", values, "dpYn");
            return (Criteria) this;
        }

        public Criteria andDpYnNotIn(List<String> values) {
            addCriterion("TDC.DP_YN not in", values, "dpYn");
            return (Criteria) this;
        }

        public Criteria andDpYnBetween(String value1, String value2) {
            addCriterion("TDC.DP_YN between", value1, value2, "dpYn");
            return (Criteria) this;
        }

        public Criteria andDpYnNotBetween(String value1, String value2) {
            addCriterion("TDC.DP_YN not between", value1, value2, "dpYn");
            return (Criteria) this;
        }

        public Criteria andRegDtIsNull() {
            addCriterion("TDC.REG_DT is null");
            return (Criteria) this;
        }

        public Criteria andRegDtIsNotNull() {
            addCriterion("TDC.REG_DT is not null");
            return (Criteria) this;
        }

        public Criteria andRegDtEqualTo(Date value) {
            addCriterion("TDC.REG_DT =", value, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtNotEqualTo(Date value) {
            addCriterion("TDC.REG_DT <>", value, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtGreaterThan(Date value) {
            addCriterion("TDC.REG_DT >", value, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtGreaterThanOrEqualTo(Date value) {
            addCriterion("TDC.REG_DT >=", value, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtLessThan(Date value) {
            addCriterion("TDC.REG_DT <", value, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtLessThanOrEqualTo(Date value) {
            addCriterion("TDC.REG_DT <=", value, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtIn(List<Date> values) {
            addCriterion("TDC.REG_DT in", values, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtNotIn(List<Date> values) {
            addCriterion("TDC.REG_DT not in", values, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtBetween(Date value1, Date value2) {
            addCriterion("TDC.REG_DT between", value1, value2, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtNotBetween(Date value1, Date value2) {
            addCriterion("TDC.REG_DT not between", value1, value2, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegIdIsNull() {
            addCriterion("TDC.REG_ID is null");
            return (Criteria) this;
        }

        public Criteria andRegIdIsNotNull() {
            addCriterion("TDC.REG_ID is not null");
            return (Criteria) this;
        }

        public Criteria andRegIdEqualTo(String value) {
            addCriterion("TDC.REG_ID =", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdNotEqualTo(String value) {
            addCriterion("TDC.REG_ID <>", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdGreaterThan(String value) {
            addCriterion("TDC.REG_ID >", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdGreaterThanOrEqualTo(String value) {
            addCriterion("TDC.REG_ID >=", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdLessThan(String value) {
            addCriterion("TDC.REG_ID <", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdLessThanOrEqualTo(String value) {
            addCriterion("TDC.REG_ID <=", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdLike(String value) {
            addCriterion("TDC.REG_ID like", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdNotLike(String value) {
            addCriterion("TDC.REG_ID not like", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdIn(List<String> values) {
            addCriterion("TDC.REG_ID in", values, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdNotIn(List<String> values) {
            addCriterion("TDC.REG_ID not in", values, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdBetween(String value1, String value2) {
            addCriterion("TDC.REG_ID between", value1, value2, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdNotBetween(String value1, String value2) {
            addCriterion("TDC.REG_ID not between", value1, value2, "regId");
            return (Criteria) this;
        }

        public Criteria andModDtIsNull() {
            addCriterion("TDC.MOD_DT is null");
            return (Criteria) this;
        }

        public Criteria andModDtIsNotNull() {
            addCriterion("TDC.MOD_DT is not null");
            return (Criteria) this;
        }

        public Criteria andModDtEqualTo(Date value) {
            addCriterion("TDC.MOD_DT =", value, "modDt");
            return (Criteria) this;
        }

        public Criteria andModDtNotEqualTo(Date value) {
            addCriterion("TDC.MOD_DT <>", value, "modDt");
            return (Criteria) this;
        }

        public Criteria andModDtGreaterThan(Date value) {
            addCriterion("TDC.MOD_DT >", value, "modDt");
            return (Criteria) this;
        }

        public Criteria andModDtGreaterThanOrEqualTo(Date value) {
            addCriterion("TDC.MOD_DT >=", value, "modDt");
            return (Criteria) this;
        }

        public Criteria andModDtLessThan(Date value) {
            addCriterion("TDC.MOD_DT <", value, "modDt");
            return (Criteria) this;
        }

        public Criteria andModDtLessThanOrEqualTo(Date value) {
            addCriterion("TDC.MOD_DT <=", value, "modDt");
            return (Criteria) this;
        }

        public Criteria andModDtIn(List<Date> values) {
            addCriterion("TDC.MOD_DT in", values, "modDt");
            return (Criteria) this;
        }

        public Criteria andModDtNotIn(List<Date> values) {
            addCriterion("TDC.MOD_DT not in", values, "modDt");
            return (Criteria) this;
        }

        public Criteria andModDtBetween(Date value1, Date value2) {
            addCriterion("TDC.MOD_DT between", value1, value2, "modDt");
            return (Criteria) this;
        }

        public Criteria andModDtNotBetween(Date value1, Date value2) {
            addCriterion("TDC.MOD_DT not between", value1, value2, "modDt");
            return (Criteria) this;
        }

        public Criteria andModIdIsNull() {
            addCriterion("TDC.MOD_ID is null");
            return (Criteria) this;
        }

        public Criteria andModIdIsNotNull() {
            addCriterion("TDC.MOD_ID is not null");
            return (Criteria) this;
        }

        public Criteria andModIdEqualTo(String value) {
            addCriterion("TDC.MOD_ID =", value, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdNotEqualTo(String value) {
            addCriterion("TDC.MOD_ID <>", value, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdGreaterThan(String value) {
            addCriterion("TDC.MOD_ID >", value, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdGreaterThanOrEqualTo(String value) {
            addCriterion("TDC.MOD_ID >=", value, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdLessThan(String value) {
            addCriterion("TDC.MOD_ID <", value, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdLessThanOrEqualTo(String value) {
            addCriterion("TDC.MOD_ID <=", value, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdLike(String value) {
            addCriterion("TDC.MOD_ID like", value, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdNotLike(String value) {
            addCriterion("TDC.MOD_ID not like", value, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdIn(List<String> values) {
            addCriterion("TDC.MOD_ID in", values, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdNotIn(List<String> values) {
            addCriterion("TDC.MOD_ID not in", values, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdBetween(String value1, String value2) {
            addCriterion("TDC.MOD_ID between", value1, value2, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdNotBetween(String value1, String value2) {
            addCriterion("TDC.MOD_ID not between", value1, value2, "modId");
            return (Criteria) this;
        }

        public Criteria andUseYnIsNull() {
            addCriterion("TDC.USE_YN is null");
            return (Criteria) this;
        }

        public Criteria andUseYnIsNotNull() {
            addCriterion("TDC.USE_YN is not null");
            return (Criteria) this;
        }

        public Criteria andUseYnEqualTo(String value) {
            addCriterion("TDC.USE_YN =", value, "useYn");
            return (Criteria) this;
        }

        public Criteria andUseYnNotEqualTo(String value) {
            addCriterion("TDC.USE_YN <>", value, "useYn");
            return (Criteria) this;
        }

        public Criteria andUseYnGreaterThan(String value) {
            addCriterion("TDC.USE_YN >", value, "useYn");
            return (Criteria) this;
        }

        public Criteria andUseYnGreaterThanOrEqualTo(String value) {
            addCriterion("TDC.USE_YN >=", value, "useYn");
            return (Criteria) this;
        }

        public Criteria andUseYnLessThan(String value) {
            addCriterion("TDC.USE_YN <", value, "useYn");
            return (Criteria) this;
        }

        public Criteria andUseYnLessThanOrEqualTo(String value) {
            addCriterion("TDC.USE_YN <=", value, "useYn");
            return (Criteria) this;
        }

        public Criteria andUseYnLike(String value) {
            addCriterion("TDC.USE_YN like", value, "useYn");
            return (Criteria) this;
        }

        public Criteria andUseYnNotLike(String value) {
            addCriterion("TDC.USE_YN not like", value, "useYn");
            return (Criteria) this;
        }

        public Criteria andUseYnIn(List<String> values) {
            addCriterion("TDC.USE_YN in", values, "useYn");
            return (Criteria) this;
        }

        public Criteria andUseYnNotIn(List<String> values) {
            addCriterion("TDC.USE_YN not in", values, "useYn");
            return (Criteria) this;
        }

        public Criteria andUseYnBetween(String value1, String value2) {
            addCriterion("TDC.USE_YN between", value1, value2, "useYn");
            return (Criteria) this;
        }

        public Criteria andUseYnNotBetween(String value1, String value2) {
            addCriterion("TDC.USE_YN not between", value1, value2, "useYn");
            return (Criteria) this;
        }

        public Criteria andDpConrCdLikeInsensitive(String value) {
            addCriterion("upper(TDC.DP_CONR_CD) like", value.toUpperCase(), "dpConrCd");
            return (Criteria) this;
        }

        public Criteria andConrNmLikeInsensitive(String value) {
            addCriterion("upper(TDC.CONR_NM) like", value.toUpperCase(), "conrNm");
            return (Criteria) this;
        }

        public Criteria andConrGrpClCdLikeInsensitive(String value) {
            addCriterion("upper(TDC.CONR_GRP_CL_CD) like", value.toUpperCase(), "conrGrpClCd");
            return (Criteria) this;
        }

        public Criteria andConrNmDpYnLikeInsensitive(String value) {
            addCriterion("upper(TDC.CONR_NM_DP_YN) like", value.toUpperCase(), "conrNmDpYn");
            return (Criteria) this;
        }

        public Criteria andConrDescLikeInsensitive(String value) {
            addCriterion("upper(TDC.CONR_DESC) like", value.toUpperCase(), "conrDesc");
            return (Criteria) this;
        }

        public Criteria andConrContPcLikeInsensitive(String value) {
            addCriterion("upper(TDC.CONR_CONT_PC) like", value.toUpperCase(), "conrContPc");
            return (Criteria) this;
        }

        public Criteria andConrContMobLikeInsensitive(String value) {
            addCriterion("upper(TDC.CONR_CONT_MOB) like", value.toUpperCase(), "conrContMob");
            return (Criteria) this;
        }

        public Criteria andLinkUrlAddrLikeInsensitive(String value) {
            addCriterion("upper(TDC.LINK_URL_ADDR) like", value.toUpperCase(), "linkUrlAddr");
            return (Criteria) this;
        }

        public Criteria andLinkNwinYnLikeInsensitive(String value) {
            addCriterion("upper(TDC.LINK_NWIN_YN) like", value.toUpperCase(), "linkNwinYn");
            return (Criteria) this;
        }

        public Criteria andDpYnLikeInsensitive(String value) {
            addCriterion("upper(TDC.DP_YN) like", value.toUpperCase(), "dpYn");
            return (Criteria) this;
        }

        public Criteria andRegIdLikeInsensitive(String value) {
            addCriterion("upper(TDC.REG_ID) like", value.toUpperCase(), "regId");
            return (Criteria) this;
        }

        public Criteria andModIdLikeInsensitive(String value) {
            addCriterion("upper(TDC.MOD_ID) like", value.toUpperCase(), "modId");
            return (Criteria) this;
        }

        public Criteria andUseYnLikeInsensitive(String value) {
            addCriterion("upper(TDC.USE_YN) like", value.toUpperCase(), "useYn");
            return (Criteria) this;
        }

        public Criteria andDpConrCdLikeLeft(String value) {
            addCriterion("TDC.DP_CONR_CD like ", "%" + value, "dpConrCd");
            return (Criteria) this;
        }

        public Criteria andDpConrCdLikeRight(String value) {
            addCriterion("TDC.DP_CONR_CD like ", value + "%", "dpConrCd");
            return (Criteria) this;
        }

        public Criteria andDpConrCdLikeBoth(String value) {
            addCriterion("TDC.DP_CONR_CD like ", "%" + value + "%", "dpConrCd");
            return (Criteria) this;
        }

        public Criteria andConrNmLikeLeft(String value) {
            addCriterion("TDC.CONR_NM like ", "%" + value, "conrNm");
            return (Criteria) this;
        }

        public Criteria andConrNmLikeRight(String value) {
            addCriterion("TDC.CONR_NM like ", value + "%", "conrNm");
            return (Criteria) this;
        }

        public Criteria andConrNmLikeBoth(String value) {
            addCriterion("TDC.CONR_NM like ", "%" + value + "%", "conrNm");
            return (Criteria) this;
        }

        public Criteria andConrGrpClCdLikeLeft(String value) {
            addCriterion("TDC.CONR_GRP_CL_CD like ", "%" + value, "conrGrpClCd");
            return (Criteria) this;
        }

        public Criteria andConrGrpClCdLikeRight(String value) {
            addCriterion("TDC.CONR_GRP_CL_CD like ", value + "%", "conrGrpClCd");
            return (Criteria) this;
        }

        public Criteria andConrGrpClCdLikeBoth(String value) {
            addCriterion("TDC.CONR_GRP_CL_CD like ", "%" + value + "%", "conrGrpClCd");
            return (Criteria) this;
        }

        public Criteria andConrNmDpYnLikeLeft(String value) {
            addCriterion("TDC.CONR_NM_DP_YN like ", "%" + value, "conrNmDpYn");
            return (Criteria) this;
        }

        public Criteria andConrNmDpYnLikeRight(String value) {
            addCriterion("TDC.CONR_NM_DP_YN like ", value + "%", "conrNmDpYn");
            return (Criteria) this;
        }

        public Criteria andConrNmDpYnLikeBoth(String value) {
            addCriterion("TDC.CONR_NM_DP_YN like ", "%" + value + "%", "conrNmDpYn");
            return (Criteria) this;
        }

        public Criteria andConrDescLikeLeft(String value) {
            addCriterion("TDC.CONR_DESC like ", "%" + value, "conrDesc");
            return (Criteria) this;
        }

        public Criteria andConrDescLikeRight(String value) {
            addCriterion("TDC.CONR_DESC like ", value + "%", "conrDesc");
            return (Criteria) this;
        }

        public Criteria andConrDescLikeBoth(String value) {
            addCriterion("TDC.CONR_DESC like ", "%" + value + "%", "conrDesc");
            return (Criteria) this;
        }

        public Criteria andConrContPcLikeLeft(String value) {
            addCriterion("TDC.CONR_CONT_PC like ", "%" + value, "conrContPc");
            return (Criteria) this;
        }

        public Criteria andConrContPcLikeRight(String value) {
            addCriterion("TDC.CONR_CONT_PC like ", value + "%", "conrContPc");
            return (Criteria) this;
        }

        public Criteria andConrContPcLikeBoth(String value) {
            addCriterion("TDC.CONR_CONT_PC like ", "%" + value + "%", "conrContPc");
            return (Criteria) this;
        }

        public Criteria andConrContMobLikeLeft(String value) {
            addCriterion("TDC.CONR_CONT_MOB like ", "%" + value, "conrContMob");
            return (Criteria) this;
        }

        public Criteria andConrContMobLikeRight(String value) {
            addCriterion("TDC.CONR_CONT_MOB like ", value + "%", "conrContMob");
            return (Criteria) this;
        }

        public Criteria andConrContMobLikeBoth(String value) {
            addCriterion("TDC.CONR_CONT_MOB like ", "%" + value + "%", "conrContMob");
            return (Criteria) this;
        }

        public Criteria andLinkUrlAddrLikeLeft(String value) {
            addCriterion("TDC.LINK_URL_ADDR like ", "%" + value, "linkUrlAddr");
            return (Criteria) this;
        }

        public Criteria andLinkUrlAddrLikeRight(String value) {
            addCriterion("TDC.LINK_URL_ADDR like ", value + "%", "linkUrlAddr");
            return (Criteria) this;
        }

        public Criteria andLinkUrlAddrLikeBoth(String value) {
            addCriterion("TDC.LINK_URL_ADDR like ", "%" + value + "%", "linkUrlAddr");
            return (Criteria) this;
        }

        public Criteria andLinkNwinYnLikeLeft(String value) {
            addCriterion("TDC.LINK_NWIN_YN like ", "%" + value, "linkNwinYn");
            return (Criteria) this;
        }

        public Criteria andLinkNwinYnLikeRight(String value) {
            addCriterion("TDC.LINK_NWIN_YN like ", value + "%", "linkNwinYn");
            return (Criteria) this;
        }

        public Criteria andLinkNwinYnLikeBoth(String value) {
            addCriterion("TDC.LINK_NWIN_YN like ", "%" + value + "%", "linkNwinYn");
            return (Criteria) this;
        }

        public Criteria andDpYnLikeLeft(String value) {
            addCriterion("TDC.DP_YN like ", "%" + value, "dpYn");
            return (Criteria) this;
        }

        public Criteria andDpYnLikeRight(String value) {
            addCriterion("TDC.DP_YN like ", value + "%", "dpYn");
            return (Criteria) this;
        }

        public Criteria andDpYnLikeBoth(String value) {
            addCriterion("TDC.DP_YN like ", "%" + value + "%", "dpYn");
            return (Criteria) this;
        }

        public Criteria andRegIdLikeLeft(String value) {
            addCriterion("TDC.REG_ID like ", "%" + value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdLikeRight(String value) {
            addCriterion("TDC.REG_ID like ", value + "%", "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdLikeBoth(String value) {
            addCriterion("TDC.REG_ID like ", "%" + value + "%", "regId");
            return (Criteria) this;
        }

        public Criteria andModIdLikeLeft(String value) {
            addCriterion("TDC.MOD_ID like ", "%" + value, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdLikeRight(String value) {
            addCriterion("TDC.MOD_ID like ", value + "%", "modId");
            return (Criteria) this;
        }

        public Criteria andModIdLikeBoth(String value) {
            addCriterion("TDC.MOD_ID like ", "%" + value + "%", "modId");
            return (Criteria) this;
        }

        public Criteria andUseYnLikeLeft(String value) {
            addCriterion("TDC.USE_YN like ", "%" + value, "useYn");
            return (Criteria) this;
        }

        public Criteria andUseYnLikeRight(String value) {
            addCriterion("TDC.USE_YN like ", value + "%", "useYn");
            return (Criteria) this;
        }

        public Criteria andUseYnLikeBoth(String value) {
            addCriterion("TDC.USE_YN like ", "%" + value + "%", "useYn");
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