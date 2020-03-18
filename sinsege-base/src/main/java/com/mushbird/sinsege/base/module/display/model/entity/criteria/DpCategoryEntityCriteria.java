package com.mushbird.sinsege.base.module.display.model.entity.criteria;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DpCategoryEntityCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    public DpCategoryEntityCriteria() {
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

        public Criteria andDpCateIdIsNull() {
            addCriterion("TDCT.DP_CATE_ID is null");
            return (Criteria) this;
        }

        public Criteria andDpCateIdIsNotNull() {
            addCriterion("TDCT.DP_CATE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andDpCateIdEqualTo(Integer value) {
            addCriterion("TDCT.DP_CATE_ID =", value, "dpCateId");
            return (Criteria) this;
        }

        public Criteria andDpCateIdNotEqualTo(Integer value) {
            addCriterion("TDCT.DP_CATE_ID <>", value, "dpCateId");
            return (Criteria) this;
        }

        public Criteria andDpCateIdGreaterThan(Integer value) {
            addCriterion("TDCT.DP_CATE_ID >", value, "dpCateId");
            return (Criteria) this;
        }

        public Criteria andDpCateIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("TDCT.DP_CATE_ID >=", value, "dpCateId");
            return (Criteria) this;
        }

        public Criteria andDpCateIdLessThan(Integer value) {
            addCriterion("TDCT.DP_CATE_ID <", value, "dpCateId");
            return (Criteria) this;
        }

        public Criteria andDpCateIdLessThanOrEqualTo(Integer value) {
            addCriterion("TDCT.DP_CATE_ID <=", value, "dpCateId");
            return (Criteria) this;
        }

        public Criteria andDpCateIdIn(List<Integer> values) {
            addCriterion("TDCT.DP_CATE_ID in", values, "dpCateId");
            return (Criteria) this;
        }

        public Criteria andDpCateIdNotIn(List<Integer> values) {
            addCriterion("TDCT.DP_CATE_ID not in", values, "dpCateId");
            return (Criteria) this;
        }

        public Criteria andDpCateIdBetween(Integer value1, Integer value2) {
            addCriterion("TDCT.DP_CATE_ID between", value1, value2, "dpCateId");
            return (Criteria) this;
        }

        public Criteria andDpCateIdNotBetween(Integer value1, Integer value2) {
            addCriterion("TDCT.DP_CATE_ID not between", value1, value2, "dpCateId");
            return (Criteria) this;
        }

        public Criteria andRefDpCateIdIsNull() {
            addCriterion("TDCT.REF_DP_CATE_ID is null");
            return (Criteria) this;
        }

        public Criteria andRefDpCateIdIsNotNull() {
            addCriterion("TDCT.REF_DP_CATE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andRefDpCateIdEqualTo(Integer value) {
            addCriterion("TDCT.REF_DP_CATE_ID =", value, "refDpCateId");
            return (Criteria) this;
        }

        public Criteria andRefDpCateIdNotEqualTo(Integer value) {
            addCriterion("TDCT.REF_DP_CATE_ID <>", value, "refDpCateId");
            return (Criteria) this;
        }

        public Criteria andRefDpCateIdGreaterThan(Integer value) {
            addCriterion("TDCT.REF_DP_CATE_ID >", value, "refDpCateId");
            return (Criteria) this;
        }

        public Criteria andRefDpCateIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("TDCT.REF_DP_CATE_ID >=", value, "refDpCateId");
            return (Criteria) this;
        }

        public Criteria andRefDpCateIdLessThan(Integer value) {
            addCriterion("TDCT.REF_DP_CATE_ID <", value, "refDpCateId");
            return (Criteria) this;
        }

        public Criteria andRefDpCateIdLessThanOrEqualTo(Integer value) {
            addCriterion("TDCT.REF_DP_CATE_ID <=", value, "refDpCateId");
            return (Criteria) this;
        }

        public Criteria andRefDpCateIdIn(List<Integer> values) {
            addCriterion("TDCT.REF_DP_CATE_ID in", values, "refDpCateId");
            return (Criteria) this;
        }

        public Criteria andRefDpCateIdNotIn(List<Integer> values) {
            addCriterion("TDCT.REF_DP_CATE_ID not in", values, "refDpCateId");
            return (Criteria) this;
        }

        public Criteria andRefDpCateIdBetween(Integer value1, Integer value2) {
            addCriterion("TDCT.REF_DP_CATE_ID between", value1, value2, "refDpCateId");
            return (Criteria) this;
        }

        public Criteria andRefDpCateIdNotBetween(Integer value1, Integer value2) {
            addCriterion("TDCT.REF_DP_CATE_ID not between", value1, value2, "refDpCateId");
            return (Criteria) this;
        }

        public Criteria andDpCateNmIsNull() {
            addCriterion("TDCT.DP_CATE_NM is null");
            return (Criteria) this;
        }

        public Criteria andDpCateNmIsNotNull() {
            addCriterion("TDCT.DP_CATE_NM is not null");
            return (Criteria) this;
        }

        public Criteria andDpCateNmEqualTo(String value) {
            addCriterion("TDCT.DP_CATE_NM =", value, "dpCateNm");
            return (Criteria) this;
        }

        public Criteria andDpCateNmNotEqualTo(String value) {
            addCriterion("TDCT.DP_CATE_NM <>", value, "dpCateNm");
            return (Criteria) this;
        }

        public Criteria andDpCateNmGreaterThan(String value) {
            addCriterion("TDCT.DP_CATE_NM >", value, "dpCateNm");
            return (Criteria) this;
        }

        public Criteria andDpCateNmGreaterThanOrEqualTo(String value) {
            addCriterion("TDCT.DP_CATE_NM >=", value, "dpCateNm");
            return (Criteria) this;
        }

        public Criteria andDpCateNmLessThan(String value) {
            addCriterion("TDCT.DP_CATE_NM <", value, "dpCateNm");
            return (Criteria) this;
        }

        public Criteria andDpCateNmLessThanOrEqualTo(String value) {
            addCriterion("TDCT.DP_CATE_NM <=", value, "dpCateNm");
            return (Criteria) this;
        }

        public Criteria andDpCateNmLike(String value) {
            addCriterion("TDCT.DP_CATE_NM like", value, "dpCateNm");
            return (Criteria) this;
        }

        public Criteria andDpCateNmNotLike(String value) {
            addCriterion("TDCT.DP_CATE_NM not like", value, "dpCateNm");
            return (Criteria) this;
        }

        public Criteria andDpCateNmIn(List<String> values) {
            addCriterion("TDCT.DP_CATE_NM in", values, "dpCateNm");
            return (Criteria) this;
        }

        public Criteria andDpCateNmNotIn(List<String> values) {
            addCriterion("TDCT.DP_CATE_NM not in", values, "dpCateNm");
            return (Criteria) this;
        }

        public Criteria andDpCateNmBetween(String value1, String value2) {
            addCriterion("TDCT.DP_CATE_NM between", value1, value2, "dpCateNm");
            return (Criteria) this;
        }

        public Criteria andDpCateNmNotBetween(String value1, String value2) {
            addCriterion("TDCT.DP_CATE_NM not between", value1, value2, "dpCateNm");
            return (Criteria) this;
        }

        public Criteria andHrchyPathIsNull() {
            addCriterion("TDCT.HRCHY_PATH is null");
            return (Criteria) this;
        }

        public Criteria andHrchyPathIsNotNull() {
            addCriterion("TDCT.HRCHY_PATH is not null");
            return (Criteria) this;
        }

        public Criteria andHrchyPathEqualTo(String value) {
            addCriterion("TDCT.HRCHY_PATH =", value, "hrchyPath");
            return (Criteria) this;
        }

        public Criteria andHrchyPathNotEqualTo(String value) {
            addCriterion("TDCT.HRCHY_PATH <>", value, "hrchyPath");
            return (Criteria) this;
        }

        public Criteria andHrchyPathGreaterThan(String value) {
            addCriterion("TDCT.HRCHY_PATH >", value, "hrchyPath");
            return (Criteria) this;
        }

        public Criteria andHrchyPathGreaterThanOrEqualTo(String value) {
            addCriterion("TDCT.HRCHY_PATH >=", value, "hrchyPath");
            return (Criteria) this;
        }

        public Criteria andHrchyPathLessThan(String value) {
            addCriterion("TDCT.HRCHY_PATH <", value, "hrchyPath");
            return (Criteria) this;
        }

        public Criteria andHrchyPathLessThanOrEqualTo(String value) {
            addCriterion("TDCT.HRCHY_PATH <=", value, "hrchyPath");
            return (Criteria) this;
        }

        public Criteria andHrchyPathLike(String value) {
            addCriterion("TDCT.HRCHY_PATH like", value, "hrchyPath");
            return (Criteria) this;
        }

        public Criteria andHrchyPathNotLike(String value) {
            addCriterion("TDCT.HRCHY_PATH not like", value, "hrchyPath");
            return (Criteria) this;
        }

        public Criteria andHrchyPathIn(List<String> values) {
            addCriterion("TDCT.HRCHY_PATH in", values, "hrchyPath");
            return (Criteria) this;
        }

        public Criteria andHrchyPathNotIn(List<String> values) {
            addCriterion("TDCT.HRCHY_PATH not in", values, "hrchyPath");
            return (Criteria) this;
        }

        public Criteria andHrchyPathBetween(String value1, String value2) {
            addCriterion("TDCT.HRCHY_PATH between", value1, value2, "hrchyPath");
            return (Criteria) this;
        }

        public Criteria andHrchyPathNotBetween(String value1, String value2) {
            addCriterion("TDCT.HRCHY_PATH not between", value1, value2, "hrchyPath");
            return (Criteria) this;
        }

        public Criteria andHrchyPathNmIsNull() {
            addCriterion("TDCT.HRCHY_PATH_NM is null");
            return (Criteria) this;
        }

        public Criteria andHrchyPathNmIsNotNull() {
            addCriterion("TDCT.HRCHY_PATH_NM is not null");
            return (Criteria) this;
        }

        public Criteria andHrchyPathNmEqualTo(String value) {
            addCriterion("TDCT.HRCHY_PATH_NM =", value, "hrchyPathNm");
            return (Criteria) this;
        }

        public Criteria andHrchyPathNmNotEqualTo(String value) {
            addCriterion("TDCT.HRCHY_PATH_NM <>", value, "hrchyPathNm");
            return (Criteria) this;
        }

        public Criteria andHrchyPathNmGreaterThan(String value) {
            addCriterion("TDCT.HRCHY_PATH_NM >", value, "hrchyPathNm");
            return (Criteria) this;
        }

        public Criteria andHrchyPathNmGreaterThanOrEqualTo(String value) {
            addCriterion("TDCT.HRCHY_PATH_NM >=", value, "hrchyPathNm");
            return (Criteria) this;
        }

        public Criteria andHrchyPathNmLessThan(String value) {
            addCriterion("TDCT.HRCHY_PATH_NM <", value, "hrchyPathNm");
            return (Criteria) this;
        }

        public Criteria andHrchyPathNmLessThanOrEqualTo(String value) {
            addCriterion("TDCT.HRCHY_PATH_NM <=", value, "hrchyPathNm");
            return (Criteria) this;
        }

        public Criteria andHrchyPathNmLike(String value) {
            addCriterion("TDCT.HRCHY_PATH_NM like", value, "hrchyPathNm");
            return (Criteria) this;
        }

        public Criteria andHrchyPathNmNotLike(String value) {
            addCriterion("TDCT.HRCHY_PATH_NM not like", value, "hrchyPathNm");
            return (Criteria) this;
        }

        public Criteria andHrchyPathNmIn(List<String> values) {
            addCriterion("TDCT.HRCHY_PATH_NM in", values, "hrchyPathNm");
            return (Criteria) this;
        }

        public Criteria andHrchyPathNmNotIn(List<String> values) {
            addCriterion("TDCT.HRCHY_PATH_NM not in", values, "hrchyPathNm");
            return (Criteria) this;
        }

        public Criteria andHrchyPathNmBetween(String value1, String value2) {
            addCriterion("TDCT.HRCHY_PATH_NM between", value1, value2, "hrchyPathNm");
            return (Criteria) this;
        }

        public Criteria andHrchyPathNmNotBetween(String value1, String value2) {
            addCriterion("TDCT.HRCHY_PATH_NM not between", value1, value2, "hrchyPathNm");
            return (Criteria) this;
        }

        public Criteria andDpConrBanrIdIsNull() {
            addCriterion("TDCT.DP_CONR_BANR_ID is null");
            return (Criteria) this;
        }

        public Criteria andDpConrBanrIdIsNotNull() {
            addCriterion("TDCT.DP_CONR_BANR_ID is not null");
            return (Criteria) this;
        }

        public Criteria andDpConrBanrIdEqualTo(Integer value) {
            addCriterion("TDCT.DP_CONR_BANR_ID =", value, "dpConrBanrId");
            return (Criteria) this;
        }

        public Criteria andDpConrBanrIdNotEqualTo(Integer value) {
            addCriterion("TDCT.DP_CONR_BANR_ID <>", value, "dpConrBanrId");
            return (Criteria) this;
        }

        public Criteria andDpConrBanrIdGreaterThan(Integer value) {
            addCriterion("TDCT.DP_CONR_BANR_ID >", value, "dpConrBanrId");
            return (Criteria) this;
        }

        public Criteria andDpConrBanrIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("TDCT.DP_CONR_BANR_ID >=", value, "dpConrBanrId");
            return (Criteria) this;
        }

        public Criteria andDpConrBanrIdLessThan(Integer value) {
            addCriterion("TDCT.DP_CONR_BANR_ID <", value, "dpConrBanrId");
            return (Criteria) this;
        }

        public Criteria andDpConrBanrIdLessThanOrEqualTo(Integer value) {
            addCriterion("TDCT.DP_CONR_BANR_ID <=", value, "dpConrBanrId");
            return (Criteria) this;
        }

        public Criteria andDpConrBanrIdIn(List<Integer> values) {
            addCriterion("TDCT.DP_CONR_BANR_ID in", values, "dpConrBanrId");
            return (Criteria) this;
        }

        public Criteria andDpConrBanrIdNotIn(List<Integer> values) {
            addCriterion("TDCT.DP_CONR_BANR_ID not in", values, "dpConrBanrId");
            return (Criteria) this;
        }

        public Criteria andDpConrBanrIdBetween(Integer value1, Integer value2) {
            addCriterion("TDCT.DP_CONR_BANR_ID between", value1, value2, "dpConrBanrId");
            return (Criteria) this;
        }

        public Criteria andDpConrBanrIdNotBetween(Integer value1, Integer value2) {
            addCriterion("TDCT.DP_CONR_BANR_ID not between", value1, value2, "dpConrBanrId");
            return (Criteria) this;
        }

        public Criteria andLwrCateAplyYnIsNull() {
            addCriterion("TDCT.LWR_CATE_APLY_YN is null");
            return (Criteria) this;
        }

        public Criteria andLwrCateAplyYnIsNotNull() {
            addCriterion("TDCT.LWR_CATE_APLY_YN is not null");
            return (Criteria) this;
        }

        public Criteria andLwrCateAplyYnEqualTo(String value) {
            addCriterion("TDCT.LWR_CATE_APLY_YN =", value, "lwrCateAplyYn");
            return (Criteria) this;
        }

        public Criteria andLwrCateAplyYnNotEqualTo(String value) {
            addCriterion("TDCT.LWR_CATE_APLY_YN <>", value, "lwrCateAplyYn");
            return (Criteria) this;
        }

        public Criteria andLwrCateAplyYnGreaterThan(String value) {
            addCriterion("TDCT.LWR_CATE_APLY_YN >", value, "lwrCateAplyYn");
            return (Criteria) this;
        }

        public Criteria andLwrCateAplyYnGreaterThanOrEqualTo(String value) {
            addCriterion("TDCT.LWR_CATE_APLY_YN >=", value, "lwrCateAplyYn");
            return (Criteria) this;
        }

        public Criteria andLwrCateAplyYnLessThan(String value) {
            addCriterion("TDCT.LWR_CATE_APLY_YN <", value, "lwrCateAplyYn");
            return (Criteria) this;
        }

        public Criteria andLwrCateAplyYnLessThanOrEqualTo(String value) {
            addCriterion("TDCT.LWR_CATE_APLY_YN <=", value, "lwrCateAplyYn");
            return (Criteria) this;
        }

        public Criteria andLwrCateAplyYnLike(String value) {
            addCriterion("TDCT.LWR_CATE_APLY_YN like", value, "lwrCateAplyYn");
            return (Criteria) this;
        }

        public Criteria andLwrCateAplyYnNotLike(String value) {
            addCriterion("TDCT.LWR_CATE_APLY_YN not like", value, "lwrCateAplyYn");
            return (Criteria) this;
        }

        public Criteria andLwrCateAplyYnIn(List<String> values) {
            addCriterion("TDCT.LWR_CATE_APLY_YN in", values, "lwrCateAplyYn");
            return (Criteria) this;
        }

        public Criteria andLwrCateAplyYnNotIn(List<String> values) {
            addCriterion("TDCT.LWR_CATE_APLY_YN not in", values, "lwrCateAplyYn");
            return (Criteria) this;
        }

        public Criteria andLwrCateAplyYnBetween(String value1, String value2) {
            addCriterion("TDCT.LWR_CATE_APLY_YN between", value1, value2, "lwrCateAplyYn");
            return (Criteria) this;
        }

        public Criteria andLwrCateAplyYnNotBetween(String value1, String value2) {
            addCriterion("TDCT.LWR_CATE_APLY_YN not between", value1, value2, "lwrCateAplyYn");
            return (Criteria) this;
        }

        public Criteria andSordIsNull() {
            addCriterion("TDCT.SORD is null");
            return (Criteria) this;
        }

        public Criteria andSordIsNotNull() {
            addCriterion("TDCT.SORD is not null");
            return (Criteria) this;
        }

        public Criteria andSordEqualTo(Integer value) {
            addCriterion("TDCT.SORD =", value, "sord");
            return (Criteria) this;
        }

        public Criteria andSordNotEqualTo(Integer value) {
            addCriterion("TDCT.SORD <>", value, "sord");
            return (Criteria) this;
        }

        public Criteria andSordGreaterThan(Integer value) {
            addCriterion("TDCT.SORD >", value, "sord");
            return (Criteria) this;
        }

        public Criteria andSordGreaterThanOrEqualTo(Integer value) {
            addCriterion("TDCT.SORD >=", value, "sord");
            return (Criteria) this;
        }

        public Criteria andSordLessThan(Integer value) {
            addCriterion("TDCT.SORD <", value, "sord");
            return (Criteria) this;
        }

        public Criteria andSordLessThanOrEqualTo(Integer value) {
            addCriterion("TDCT.SORD <=", value, "sord");
            return (Criteria) this;
        }

        public Criteria andSordIn(List<Integer> values) {
            addCriterion("TDCT.SORD in", values, "sord");
            return (Criteria) this;
        }

        public Criteria andSordNotIn(List<Integer> values) {
            addCriterion("TDCT.SORD not in", values, "sord");
            return (Criteria) this;
        }

        public Criteria andSordBetween(Integer value1, Integer value2) {
            addCriterion("TDCT.SORD between", value1, value2, "sord");
            return (Criteria) this;
        }

        public Criteria andSordNotBetween(Integer value1, Integer value2) {
            addCriterion("TDCT.SORD not between", value1, value2, "sord");
            return (Criteria) this;
        }

        public Criteria andDpYnIsNull() {
            addCriterion("TDCT.DP_YN is null");
            return (Criteria) this;
        }

        public Criteria andDpYnIsNotNull() {
            addCriterion("TDCT.DP_YN is not null");
            return (Criteria) this;
        }

        public Criteria andDpYnEqualTo(String value) {
            addCriterion("TDCT.DP_YN =", value, "dpYn");
            return (Criteria) this;
        }

        public Criteria andDpYnNotEqualTo(String value) {
            addCriterion("TDCT.DP_YN <>", value, "dpYn");
            return (Criteria) this;
        }

        public Criteria andDpYnGreaterThan(String value) {
            addCriterion("TDCT.DP_YN >", value, "dpYn");
            return (Criteria) this;
        }

        public Criteria andDpYnGreaterThanOrEqualTo(String value) {
            addCriterion("TDCT.DP_YN >=", value, "dpYn");
            return (Criteria) this;
        }

        public Criteria andDpYnLessThan(String value) {
            addCriterion("TDCT.DP_YN <", value, "dpYn");
            return (Criteria) this;
        }

        public Criteria andDpYnLessThanOrEqualTo(String value) {
            addCriterion("TDCT.DP_YN <=", value, "dpYn");
            return (Criteria) this;
        }

        public Criteria andDpYnLike(String value) {
            addCriterion("TDCT.DP_YN like", value, "dpYn");
            return (Criteria) this;
        }

        public Criteria andDpYnNotLike(String value) {
            addCriterion("TDCT.DP_YN not like", value, "dpYn");
            return (Criteria) this;
        }

        public Criteria andDpYnIn(List<String> values) {
            addCriterion("TDCT.DP_YN in", values, "dpYn");
            return (Criteria) this;
        }

        public Criteria andDpYnNotIn(List<String> values) {
            addCriterion("TDCT.DP_YN not in", values, "dpYn");
            return (Criteria) this;
        }

        public Criteria andDpYnBetween(String value1, String value2) {
            addCriterion("TDCT.DP_YN between", value1, value2, "dpYn");
            return (Criteria) this;
        }

        public Criteria andDpYnNotBetween(String value1, String value2) {
            addCriterion("TDCT.DP_YN not between", value1, value2, "dpYn");
            return (Criteria) this;
        }

        public Criteria andRegDtIsNull() {
            addCriterion("TDCT.REG_DT is null");
            return (Criteria) this;
        }

        public Criteria andRegDtIsNotNull() {
            addCriterion("TDCT.REG_DT is not null");
            return (Criteria) this;
        }

        public Criteria andRegDtEqualTo(Date value) {
            addCriterion("TDCT.REG_DT =", value, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtNotEqualTo(Date value) {
            addCriterion("TDCT.REG_DT <>", value, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtGreaterThan(Date value) {
            addCriterion("TDCT.REG_DT >", value, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtGreaterThanOrEqualTo(Date value) {
            addCriterion("TDCT.REG_DT >=", value, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtLessThan(Date value) {
            addCriterion("TDCT.REG_DT <", value, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtLessThanOrEqualTo(Date value) {
            addCriterion("TDCT.REG_DT <=", value, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtIn(List<Date> values) {
            addCriterion("TDCT.REG_DT in", values, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtNotIn(List<Date> values) {
            addCriterion("TDCT.REG_DT not in", values, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtBetween(Date value1, Date value2) {
            addCriterion("TDCT.REG_DT between", value1, value2, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtNotBetween(Date value1, Date value2) {
            addCriterion("TDCT.REG_DT not between", value1, value2, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegIdIsNull() {
            addCriterion("TDCT.REG_ID is null");
            return (Criteria) this;
        }

        public Criteria andRegIdIsNotNull() {
            addCriterion("TDCT.REG_ID is not null");
            return (Criteria) this;
        }

        public Criteria andRegIdEqualTo(String value) {
            addCriterion("TDCT.REG_ID =", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdNotEqualTo(String value) {
            addCriterion("TDCT.REG_ID <>", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdGreaterThan(String value) {
            addCriterion("TDCT.REG_ID >", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdGreaterThanOrEqualTo(String value) {
            addCriterion("TDCT.REG_ID >=", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdLessThan(String value) {
            addCriterion("TDCT.REG_ID <", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdLessThanOrEqualTo(String value) {
            addCriterion("TDCT.REG_ID <=", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdLike(String value) {
            addCriterion("TDCT.REG_ID like", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdNotLike(String value) {
            addCriterion("TDCT.REG_ID not like", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdIn(List<String> values) {
            addCriterion("TDCT.REG_ID in", values, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdNotIn(List<String> values) {
            addCriterion("TDCT.REG_ID not in", values, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdBetween(String value1, String value2) {
            addCriterion("TDCT.REG_ID between", value1, value2, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdNotBetween(String value1, String value2) {
            addCriterion("TDCT.REG_ID not between", value1, value2, "regId");
            return (Criteria) this;
        }

        public Criteria andModDtIsNull() {
            addCriterion("TDCT.MOD_DT is null");
            return (Criteria) this;
        }

        public Criteria andModDtIsNotNull() {
            addCriterion("TDCT.MOD_DT is not null");
            return (Criteria) this;
        }

        public Criteria andModDtEqualTo(Date value) {
            addCriterion("TDCT.MOD_DT =", value, "modDt");
            return (Criteria) this;
        }

        public Criteria andModDtNotEqualTo(Date value) {
            addCriterion("TDCT.MOD_DT <>", value, "modDt");
            return (Criteria) this;
        }

        public Criteria andModDtGreaterThan(Date value) {
            addCriterion("TDCT.MOD_DT >", value, "modDt");
            return (Criteria) this;
        }

        public Criteria andModDtGreaterThanOrEqualTo(Date value) {
            addCriterion("TDCT.MOD_DT >=", value, "modDt");
            return (Criteria) this;
        }

        public Criteria andModDtLessThan(Date value) {
            addCriterion("TDCT.MOD_DT <", value, "modDt");
            return (Criteria) this;
        }

        public Criteria andModDtLessThanOrEqualTo(Date value) {
            addCriterion("TDCT.MOD_DT <=", value, "modDt");
            return (Criteria) this;
        }

        public Criteria andModDtIn(List<Date> values) {
            addCriterion("TDCT.MOD_DT in", values, "modDt");
            return (Criteria) this;
        }

        public Criteria andModDtNotIn(List<Date> values) {
            addCriterion("TDCT.MOD_DT not in", values, "modDt");
            return (Criteria) this;
        }

        public Criteria andModDtBetween(Date value1, Date value2) {
            addCriterion("TDCT.MOD_DT between", value1, value2, "modDt");
            return (Criteria) this;
        }

        public Criteria andModDtNotBetween(Date value1, Date value2) {
            addCriterion("TDCT.MOD_DT not between", value1, value2, "modDt");
            return (Criteria) this;
        }

        public Criteria andModIdIsNull() {
            addCriterion("TDCT.MOD_ID is null");
            return (Criteria) this;
        }

        public Criteria andModIdIsNotNull() {
            addCriterion("TDCT.MOD_ID is not null");
            return (Criteria) this;
        }

        public Criteria andModIdEqualTo(String value) {
            addCriterion("TDCT.MOD_ID =", value, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdNotEqualTo(String value) {
            addCriterion("TDCT.MOD_ID <>", value, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdGreaterThan(String value) {
            addCriterion("TDCT.MOD_ID >", value, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdGreaterThanOrEqualTo(String value) {
            addCriterion("TDCT.MOD_ID >=", value, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdLessThan(String value) {
            addCriterion("TDCT.MOD_ID <", value, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdLessThanOrEqualTo(String value) {
            addCriterion("TDCT.MOD_ID <=", value, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdLike(String value) {
            addCriterion("TDCT.MOD_ID like", value, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdNotLike(String value) {
            addCriterion("TDCT.MOD_ID not like", value, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdIn(List<String> values) {
            addCriterion("TDCT.MOD_ID in", values, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdNotIn(List<String> values) {
            addCriterion("TDCT.MOD_ID not in", values, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdBetween(String value1, String value2) {
            addCriterion("TDCT.MOD_ID between", value1, value2, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdNotBetween(String value1, String value2) {
            addCriterion("TDCT.MOD_ID not between", value1, value2, "modId");
            return (Criteria) this;
        }

        public Criteria andUseYnIsNull() {
            addCriterion("TDCT.USE_YN is null");
            return (Criteria) this;
        }

        public Criteria andUseYnIsNotNull() {
            addCriterion("TDCT.USE_YN is not null");
            return (Criteria) this;
        }

        public Criteria andUseYnEqualTo(String value) {
            addCriterion("TDCT.USE_YN =", value, "useYn");
            return (Criteria) this;
        }

        public Criteria andUseYnNotEqualTo(String value) {
            addCriterion("TDCT.USE_YN <>", value, "useYn");
            return (Criteria) this;
        }

        public Criteria andUseYnGreaterThan(String value) {
            addCriterion("TDCT.USE_YN >", value, "useYn");
            return (Criteria) this;
        }

        public Criteria andUseYnGreaterThanOrEqualTo(String value) {
            addCriterion("TDCT.USE_YN >=", value, "useYn");
            return (Criteria) this;
        }

        public Criteria andUseYnLessThan(String value) {
            addCriterion("TDCT.USE_YN <", value, "useYn");
            return (Criteria) this;
        }

        public Criteria andUseYnLessThanOrEqualTo(String value) {
            addCriterion("TDCT.USE_YN <=", value, "useYn");
            return (Criteria) this;
        }

        public Criteria andUseYnLike(String value) {
            addCriterion("TDCT.USE_YN like", value, "useYn");
            return (Criteria) this;
        }

        public Criteria andUseYnNotLike(String value) {
            addCriterion("TDCT.USE_YN not like", value, "useYn");
            return (Criteria) this;
        }

        public Criteria andUseYnIn(List<String> values) {
            addCriterion("TDCT.USE_YN in", values, "useYn");
            return (Criteria) this;
        }

        public Criteria andUseYnNotIn(List<String> values) {
            addCriterion("TDCT.USE_YN not in", values, "useYn");
            return (Criteria) this;
        }

        public Criteria andUseYnBetween(String value1, String value2) {
            addCriterion("TDCT.USE_YN between", value1, value2, "useYn");
            return (Criteria) this;
        }

        public Criteria andUseYnNotBetween(String value1, String value2) {
            addCriterion("TDCT.USE_YN not between", value1, value2, "useYn");
            return (Criteria) this;
        }

        public Criteria andDpCateNmLikeInsensitive(String value) {
            addCriterion("upper(TDCT.DP_CATE_NM) like", value.toUpperCase(), "dpCateNm");
            return (Criteria) this;
        }

        public Criteria andHrchyPathLikeInsensitive(String value) {
            addCriterion("upper(TDCT.HRCHY_PATH) like", value.toUpperCase(), "hrchyPath");
            return (Criteria) this;
        }

        public Criteria andHrchyPathNmLikeInsensitive(String value) {
            addCriterion("upper(TDCT.HRCHY_PATH_NM) like", value.toUpperCase(), "hrchyPathNm");
            return (Criteria) this;
        }

        public Criteria andLwrCateAplyYnLikeInsensitive(String value) {
            addCriterion("upper(TDCT.LWR_CATE_APLY_YN) like", value.toUpperCase(), "lwrCateAplyYn");
            return (Criteria) this;
        }

        public Criteria andDpYnLikeInsensitive(String value) {
            addCriterion("upper(TDCT.DP_YN) like", value.toUpperCase(), "dpYn");
            return (Criteria) this;
        }

        public Criteria andRegIdLikeInsensitive(String value) {
            addCriterion("upper(TDCT.REG_ID) like", value.toUpperCase(), "regId");
            return (Criteria) this;
        }

        public Criteria andModIdLikeInsensitive(String value) {
            addCriterion("upper(TDCT.MOD_ID) like", value.toUpperCase(), "modId");
            return (Criteria) this;
        }

        public Criteria andUseYnLikeInsensitive(String value) {
            addCriterion("upper(TDCT.USE_YN) like", value.toUpperCase(), "useYn");
            return (Criteria) this;
        }

        public Criteria andDpCateNmLikeLeft(String value) {
            addCriterion("TDCT.DP_CATE_NM like ", "%" + value, "dpCateNm");
            return (Criteria) this;
        }

        public Criteria andDpCateNmLikeRight(String value) {
            addCriterion("TDCT.DP_CATE_NM like ", value + "%", "dpCateNm");
            return (Criteria) this;
        }

        public Criteria andDpCateNmLikeBoth(String value) {
            addCriterion("TDCT.DP_CATE_NM like ", "%" + value + "%", "dpCateNm");
            return (Criteria) this;
        }

        public Criteria andHrchyPathLikeLeft(String value) {
            addCriterion("TDCT.HRCHY_PATH like ", "%" + value, "hrchyPath");
            return (Criteria) this;
        }

        public Criteria andHrchyPathLikeRight(String value) {
            addCriterion("TDCT.HRCHY_PATH like ", value + "%", "hrchyPath");
            return (Criteria) this;
        }

        public Criteria andHrchyPathLikeBoth(String value) {
            addCriterion("TDCT.HRCHY_PATH like ", "%" + value + "%", "hrchyPath");
            return (Criteria) this;
        }

        public Criteria andHrchyPathNmLikeLeft(String value) {
            addCriterion("TDCT.HRCHY_PATH_NM like ", "%" + value, "hrchyPathNm");
            return (Criteria) this;
        }

        public Criteria andHrchyPathNmLikeRight(String value) {
            addCriterion("TDCT.HRCHY_PATH_NM like ", value + "%", "hrchyPathNm");
            return (Criteria) this;
        }

        public Criteria andHrchyPathNmLikeBoth(String value) {
            addCriterion("TDCT.HRCHY_PATH_NM like ", "%" + value + "%", "hrchyPathNm");
            return (Criteria) this;
        }

        public Criteria andLwrCateAplyYnLikeLeft(String value) {
            addCriterion("TDCT.LWR_CATE_APLY_YN like ", "%" + value, "lwrCateAplyYn");
            return (Criteria) this;
        }

        public Criteria andLwrCateAplyYnLikeRight(String value) {
            addCriterion("TDCT.LWR_CATE_APLY_YN like ", value + "%", "lwrCateAplyYn");
            return (Criteria) this;
        }

        public Criteria andLwrCateAplyYnLikeBoth(String value) {
            addCriterion("TDCT.LWR_CATE_APLY_YN like ", "%" + value + "%", "lwrCateAplyYn");
            return (Criteria) this;
        }

        public Criteria andDpYnLikeLeft(String value) {
            addCriterion("TDCT.DP_YN like ", "%" + value, "dpYn");
            return (Criteria) this;
        }

        public Criteria andDpYnLikeRight(String value) {
            addCriterion("TDCT.DP_YN like ", value + "%", "dpYn");
            return (Criteria) this;
        }

        public Criteria andDpYnLikeBoth(String value) {
            addCriterion("TDCT.DP_YN like ", "%" + value + "%", "dpYn");
            return (Criteria) this;
        }

        public Criteria andRegIdLikeLeft(String value) {
            addCriterion("TDCT.REG_ID like ", "%" + value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdLikeRight(String value) {
            addCriterion("TDCT.REG_ID like ", value + "%", "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdLikeBoth(String value) {
            addCriterion("TDCT.REG_ID like ", "%" + value + "%", "regId");
            return (Criteria) this;
        }

        public Criteria andModIdLikeLeft(String value) {
            addCriterion("TDCT.MOD_ID like ", "%" + value, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdLikeRight(String value) {
            addCriterion("TDCT.MOD_ID like ", value + "%", "modId");
            return (Criteria) this;
        }

        public Criteria andModIdLikeBoth(String value) {
            addCriterion("TDCT.MOD_ID like ", "%" + value + "%", "modId");
            return (Criteria) this;
        }

        public Criteria andUseYnLikeLeft(String value) {
            addCriterion("TDCT.USE_YN like ", "%" + value, "useYn");
            return (Criteria) this;
        }

        public Criteria andUseYnLikeRight(String value) {
            addCriterion("TDCT.USE_YN like ", value + "%", "useYn");
            return (Criteria) this;
        }

        public Criteria andUseYnLikeBoth(String value) {
            addCriterion("TDCT.USE_YN like ", "%" + value + "%", "useYn");
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