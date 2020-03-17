package com.mushbird.sinsege.base.module.system.model.entity.criteria;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SiteBenefitEntityCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    public SiteBenefitEntityCriteria() {
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

        public Criteria andSiteIdIsNull() {
            addCriterion("TSB.SITE_ID is null");
            return (Criteria) this;
        }

        public Criteria andSiteIdIsNotNull() {
            addCriterion("TSB.SITE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andSiteIdEqualTo(String value) {
            addCriterion("TSB.SITE_ID =", value, "siteId");
            return (Criteria) this;
        }

        public Criteria andSiteIdNotEqualTo(String value) {
            addCriterion("TSB.SITE_ID <>", value, "siteId");
            return (Criteria) this;
        }

        public Criteria andSiteIdGreaterThan(String value) {
            addCriterion("TSB.SITE_ID >", value, "siteId");
            return (Criteria) this;
        }

        public Criteria andSiteIdGreaterThanOrEqualTo(String value) {
            addCriterion("TSB.SITE_ID >=", value, "siteId");
            return (Criteria) this;
        }

        public Criteria andSiteIdLessThan(String value) {
            addCriterion("TSB.SITE_ID <", value, "siteId");
            return (Criteria) this;
        }

        public Criteria andSiteIdLessThanOrEqualTo(String value) {
            addCriterion("TSB.SITE_ID <=", value, "siteId");
            return (Criteria) this;
        }

        public Criteria andSiteIdLike(String value) {
            addCriterion("TSB.SITE_ID like", value, "siteId");
            return (Criteria) this;
        }

        public Criteria andSiteIdNotLike(String value) {
            addCriterion("TSB.SITE_ID not like", value, "siteId");
            return (Criteria) this;
        }

        public Criteria andSiteIdIn(List<String> values) {
            addCriterion("TSB.SITE_ID in", values, "siteId");
            return (Criteria) this;
        }

        public Criteria andSiteIdNotIn(List<String> values) {
            addCriterion("TSB.SITE_ID not in", values, "siteId");
            return (Criteria) this;
        }

        public Criteria andSiteIdBetween(String value1, String value2) {
            addCriterion("TSB.SITE_ID between", value1, value2, "siteId");
            return (Criteria) this;
        }

        public Criteria andSiteIdNotBetween(String value1, String value2) {
            addCriterion("TSB.SITE_ID not between", value1, value2, "siteId");
            return (Criteria) this;
        }

        public Criteria andSiteBenfTpCdIsNull() {
            addCriterion("TSB.SITE_BENF_TP_CD is null");
            return (Criteria) this;
        }

        public Criteria andSiteBenfTpCdIsNotNull() {
            addCriterion("TSB.SITE_BENF_TP_CD is not null");
            return (Criteria) this;
        }

        public Criteria andSiteBenfTpCdEqualTo(String value) {
            addCriterion("TSB.SITE_BENF_TP_CD =", value, "siteBenfTpCd");
            return (Criteria) this;
        }

        public Criteria andSiteBenfTpCdNotEqualTo(String value) {
            addCriterion("TSB.SITE_BENF_TP_CD <>", value, "siteBenfTpCd");
            return (Criteria) this;
        }

        public Criteria andSiteBenfTpCdGreaterThan(String value) {
            addCriterion("TSB.SITE_BENF_TP_CD >", value, "siteBenfTpCd");
            return (Criteria) this;
        }

        public Criteria andSiteBenfTpCdGreaterThanOrEqualTo(String value) {
            addCriterion("TSB.SITE_BENF_TP_CD >=", value, "siteBenfTpCd");
            return (Criteria) this;
        }

        public Criteria andSiteBenfTpCdLessThan(String value) {
            addCriterion("TSB.SITE_BENF_TP_CD <", value, "siteBenfTpCd");
            return (Criteria) this;
        }

        public Criteria andSiteBenfTpCdLessThanOrEqualTo(String value) {
            addCriterion("TSB.SITE_BENF_TP_CD <=", value, "siteBenfTpCd");
            return (Criteria) this;
        }

        public Criteria andSiteBenfTpCdLike(String value) {
            addCriterion("TSB.SITE_BENF_TP_CD like", value, "siteBenfTpCd");
            return (Criteria) this;
        }

        public Criteria andSiteBenfTpCdNotLike(String value) {
            addCriterion("TSB.SITE_BENF_TP_CD not like", value, "siteBenfTpCd");
            return (Criteria) this;
        }

        public Criteria andSiteBenfTpCdIn(List<String> values) {
            addCriterion("TSB.SITE_BENF_TP_CD in", values, "siteBenfTpCd");
            return (Criteria) this;
        }

        public Criteria andSiteBenfTpCdNotIn(List<String> values) {
            addCriterion("TSB.SITE_BENF_TP_CD not in", values, "siteBenfTpCd");
            return (Criteria) this;
        }

        public Criteria andSiteBenfTpCdBetween(String value1, String value2) {
            addCriterion("TSB.SITE_BENF_TP_CD between", value1, value2, "siteBenfTpCd");
            return (Criteria) this;
        }

        public Criteria andSiteBenfTpCdNotBetween(String value1, String value2) {
            addCriterion("TSB.SITE_BENF_TP_CD not between", value1, value2, "siteBenfTpCd");
            return (Criteria) this;
        }

        public Criteria andBenfNmIsNull() {
            addCriterion("TSB.BENF_NM is null");
            return (Criteria) this;
        }

        public Criteria andBenfNmIsNotNull() {
            addCriterion("TSB.BENF_NM is not null");
            return (Criteria) this;
        }

        public Criteria andBenfNmEqualTo(String value) {
            addCriterion("TSB.BENF_NM =", value, "benfNm");
            return (Criteria) this;
        }

        public Criteria andBenfNmNotEqualTo(String value) {
            addCriterion("TSB.BENF_NM <>", value, "benfNm");
            return (Criteria) this;
        }

        public Criteria andBenfNmGreaterThan(String value) {
            addCriterion("TSB.BENF_NM >", value, "benfNm");
            return (Criteria) this;
        }

        public Criteria andBenfNmGreaterThanOrEqualTo(String value) {
            addCriterion("TSB.BENF_NM >=", value, "benfNm");
            return (Criteria) this;
        }

        public Criteria andBenfNmLessThan(String value) {
            addCriterion("TSB.BENF_NM <", value, "benfNm");
            return (Criteria) this;
        }

        public Criteria andBenfNmLessThanOrEqualTo(String value) {
            addCriterion("TSB.BENF_NM <=", value, "benfNm");
            return (Criteria) this;
        }

        public Criteria andBenfNmLike(String value) {
            addCriterion("TSB.BENF_NM like", value, "benfNm");
            return (Criteria) this;
        }

        public Criteria andBenfNmNotLike(String value) {
            addCriterion("TSB.BENF_NM not like", value, "benfNm");
            return (Criteria) this;
        }

        public Criteria andBenfNmIn(List<String> values) {
            addCriterion("TSB.BENF_NM in", values, "benfNm");
            return (Criteria) this;
        }

        public Criteria andBenfNmNotIn(List<String> values) {
            addCriterion("TSB.BENF_NM not in", values, "benfNm");
            return (Criteria) this;
        }

        public Criteria andBenfNmBetween(String value1, String value2) {
            addCriterion("TSB.BENF_NM between", value1, value2, "benfNm");
            return (Criteria) this;
        }

        public Criteria andBenfNmNotBetween(String value1, String value2) {
            addCriterion("TSB.BENF_NM not between", value1, value2, "benfNm");
            return (Criteria) this;
        }

        public Criteria andImgAtchGidPcIsNull() {
            addCriterion("TSB.IMG_ATCH_GID_PC is null");
            return (Criteria) this;
        }

        public Criteria andImgAtchGidPcIsNotNull() {
            addCriterion("TSB.IMG_ATCH_GID_PC is not null");
            return (Criteria) this;
        }

        public Criteria andImgAtchGidPcEqualTo(Integer value) {
            addCriterion("TSB.IMG_ATCH_GID_PC =", value, "imgAtchGidPc");
            return (Criteria) this;
        }

        public Criteria andImgAtchGidPcNotEqualTo(Integer value) {
            addCriterion("TSB.IMG_ATCH_GID_PC <>", value, "imgAtchGidPc");
            return (Criteria) this;
        }

        public Criteria andImgAtchGidPcGreaterThan(Integer value) {
            addCriterion("TSB.IMG_ATCH_GID_PC >", value, "imgAtchGidPc");
            return (Criteria) this;
        }

        public Criteria andImgAtchGidPcGreaterThanOrEqualTo(Integer value) {
            addCriterion("TSB.IMG_ATCH_GID_PC >=", value, "imgAtchGidPc");
            return (Criteria) this;
        }

        public Criteria andImgAtchGidPcLessThan(Integer value) {
            addCriterion("TSB.IMG_ATCH_GID_PC <", value, "imgAtchGidPc");
            return (Criteria) this;
        }

        public Criteria andImgAtchGidPcLessThanOrEqualTo(Integer value) {
            addCriterion("TSB.IMG_ATCH_GID_PC <=", value, "imgAtchGidPc");
            return (Criteria) this;
        }

        public Criteria andImgAtchGidPcIn(List<Integer> values) {
            addCriterion("TSB.IMG_ATCH_GID_PC in", values, "imgAtchGidPc");
            return (Criteria) this;
        }

        public Criteria andImgAtchGidPcNotIn(List<Integer> values) {
            addCriterion("TSB.IMG_ATCH_GID_PC not in", values, "imgAtchGidPc");
            return (Criteria) this;
        }

        public Criteria andImgAtchGidPcBetween(Integer value1, Integer value2) {
            addCriterion("TSB.IMG_ATCH_GID_PC between", value1, value2, "imgAtchGidPc");
            return (Criteria) this;
        }

        public Criteria andImgAtchGidPcNotBetween(Integer value1, Integer value2) {
            addCriterion("TSB.IMG_ATCH_GID_PC not between", value1, value2, "imgAtchGidPc");
            return (Criteria) this;
        }

        public Criteria andImgAtchGidMobIsNull() {
            addCriterion("TSB.IMG_ATCH_GID_MOB is null");
            return (Criteria) this;
        }

        public Criteria andImgAtchGidMobIsNotNull() {
            addCriterion("TSB.IMG_ATCH_GID_MOB is not null");
            return (Criteria) this;
        }

        public Criteria andImgAtchGidMobEqualTo(Integer value) {
            addCriterion("TSB.IMG_ATCH_GID_MOB =", value, "imgAtchGidMob");
            return (Criteria) this;
        }

        public Criteria andImgAtchGidMobNotEqualTo(Integer value) {
            addCriterion("TSB.IMG_ATCH_GID_MOB <>", value, "imgAtchGidMob");
            return (Criteria) this;
        }

        public Criteria andImgAtchGidMobGreaterThan(Integer value) {
            addCriterion("TSB.IMG_ATCH_GID_MOB >", value, "imgAtchGidMob");
            return (Criteria) this;
        }

        public Criteria andImgAtchGidMobGreaterThanOrEqualTo(Integer value) {
            addCriterion("TSB.IMG_ATCH_GID_MOB >=", value, "imgAtchGidMob");
            return (Criteria) this;
        }

        public Criteria andImgAtchGidMobLessThan(Integer value) {
            addCriterion("TSB.IMG_ATCH_GID_MOB <", value, "imgAtchGidMob");
            return (Criteria) this;
        }

        public Criteria andImgAtchGidMobLessThanOrEqualTo(Integer value) {
            addCriterion("TSB.IMG_ATCH_GID_MOB <=", value, "imgAtchGidMob");
            return (Criteria) this;
        }

        public Criteria andImgAtchGidMobIn(List<Integer> values) {
            addCriterion("TSB.IMG_ATCH_GID_MOB in", values, "imgAtchGidMob");
            return (Criteria) this;
        }

        public Criteria andImgAtchGidMobNotIn(List<Integer> values) {
            addCriterion("TSB.IMG_ATCH_GID_MOB not in", values, "imgAtchGidMob");
            return (Criteria) this;
        }

        public Criteria andImgAtchGidMobBetween(Integer value1, Integer value2) {
            addCriterion("TSB.IMG_ATCH_GID_MOB between", value1, value2, "imgAtchGidMob");
            return (Criteria) this;
        }

        public Criteria andImgAtchGidMobNotBetween(Integer value1, Integer value2) {
            addCriterion("TSB.IMG_ATCH_GID_MOB not between", value1, value2, "imgAtchGidMob");
            return (Criteria) this;
        }

        public Criteria andRegDtIsNull() {
            addCriterion("TSB.REG_DT is null");
            return (Criteria) this;
        }

        public Criteria andRegDtIsNotNull() {
            addCriterion("TSB.REG_DT is not null");
            return (Criteria) this;
        }

        public Criteria andRegDtEqualTo(Date value) {
            addCriterion("TSB.REG_DT =", value, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtNotEqualTo(Date value) {
            addCriterion("TSB.REG_DT <>", value, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtGreaterThan(Date value) {
            addCriterion("TSB.REG_DT >", value, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtGreaterThanOrEqualTo(Date value) {
            addCriterion("TSB.REG_DT >=", value, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtLessThan(Date value) {
            addCriterion("TSB.REG_DT <", value, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtLessThanOrEqualTo(Date value) {
            addCriterion("TSB.REG_DT <=", value, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtIn(List<Date> values) {
            addCriterion("TSB.REG_DT in", values, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtNotIn(List<Date> values) {
            addCriterion("TSB.REG_DT not in", values, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtBetween(Date value1, Date value2) {
            addCriterion("TSB.REG_DT between", value1, value2, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtNotBetween(Date value1, Date value2) {
            addCriterion("TSB.REG_DT not between", value1, value2, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegIdIsNull() {
            addCriterion("TSB.REG_ID is null");
            return (Criteria) this;
        }

        public Criteria andRegIdIsNotNull() {
            addCriterion("TSB.REG_ID is not null");
            return (Criteria) this;
        }

        public Criteria andRegIdEqualTo(String value) {
            addCriterion("TSB.REG_ID =", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdNotEqualTo(String value) {
            addCriterion("TSB.REG_ID <>", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdGreaterThan(String value) {
            addCriterion("TSB.REG_ID >", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdGreaterThanOrEqualTo(String value) {
            addCriterion("TSB.REG_ID >=", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdLessThan(String value) {
            addCriterion("TSB.REG_ID <", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdLessThanOrEqualTo(String value) {
            addCriterion("TSB.REG_ID <=", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdLike(String value) {
            addCriterion("TSB.REG_ID like", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdNotLike(String value) {
            addCriterion("TSB.REG_ID not like", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdIn(List<String> values) {
            addCriterion("TSB.REG_ID in", values, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdNotIn(List<String> values) {
            addCriterion("TSB.REG_ID not in", values, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdBetween(String value1, String value2) {
            addCriterion("TSB.REG_ID between", value1, value2, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdNotBetween(String value1, String value2) {
            addCriterion("TSB.REG_ID not between", value1, value2, "regId");
            return (Criteria) this;
        }

        public Criteria andModDtIsNull() {
            addCriterion("TSB.MOD_DT is null");
            return (Criteria) this;
        }

        public Criteria andModDtIsNotNull() {
            addCriterion("TSB.MOD_DT is not null");
            return (Criteria) this;
        }

        public Criteria andModDtEqualTo(Date value) {
            addCriterion("TSB.MOD_DT =", value, "modDt");
            return (Criteria) this;
        }

        public Criteria andModDtNotEqualTo(Date value) {
            addCriterion("TSB.MOD_DT <>", value, "modDt");
            return (Criteria) this;
        }

        public Criteria andModDtGreaterThan(Date value) {
            addCriterion("TSB.MOD_DT >", value, "modDt");
            return (Criteria) this;
        }

        public Criteria andModDtGreaterThanOrEqualTo(Date value) {
            addCriterion("TSB.MOD_DT >=", value, "modDt");
            return (Criteria) this;
        }

        public Criteria andModDtLessThan(Date value) {
            addCriterion("TSB.MOD_DT <", value, "modDt");
            return (Criteria) this;
        }

        public Criteria andModDtLessThanOrEqualTo(Date value) {
            addCriterion("TSB.MOD_DT <=", value, "modDt");
            return (Criteria) this;
        }

        public Criteria andModDtIn(List<Date> values) {
            addCriterion("TSB.MOD_DT in", values, "modDt");
            return (Criteria) this;
        }

        public Criteria andModDtNotIn(List<Date> values) {
            addCriterion("TSB.MOD_DT not in", values, "modDt");
            return (Criteria) this;
        }

        public Criteria andModDtBetween(Date value1, Date value2) {
            addCriterion("TSB.MOD_DT between", value1, value2, "modDt");
            return (Criteria) this;
        }

        public Criteria andModDtNotBetween(Date value1, Date value2) {
            addCriterion("TSB.MOD_DT not between", value1, value2, "modDt");
            return (Criteria) this;
        }

        public Criteria andModIdIsNull() {
            addCriterion("TSB.MOD_ID is null");
            return (Criteria) this;
        }

        public Criteria andModIdIsNotNull() {
            addCriterion("TSB.MOD_ID is not null");
            return (Criteria) this;
        }

        public Criteria andModIdEqualTo(String value) {
            addCriterion("TSB.MOD_ID =", value, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdNotEqualTo(String value) {
            addCriterion("TSB.MOD_ID <>", value, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdGreaterThan(String value) {
            addCriterion("TSB.MOD_ID >", value, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdGreaterThanOrEqualTo(String value) {
            addCriterion("TSB.MOD_ID >=", value, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdLessThan(String value) {
            addCriterion("TSB.MOD_ID <", value, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdLessThanOrEqualTo(String value) {
            addCriterion("TSB.MOD_ID <=", value, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdLike(String value) {
            addCriterion("TSB.MOD_ID like", value, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdNotLike(String value) {
            addCriterion("TSB.MOD_ID not like", value, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdIn(List<String> values) {
            addCriterion("TSB.MOD_ID in", values, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdNotIn(List<String> values) {
            addCriterion("TSB.MOD_ID not in", values, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdBetween(String value1, String value2) {
            addCriterion("TSB.MOD_ID between", value1, value2, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdNotBetween(String value1, String value2) {
            addCriterion("TSB.MOD_ID not between", value1, value2, "modId");
            return (Criteria) this;
        }

        public Criteria andUseYnIsNull() {
            addCriterion("TSB.USE_YN is null");
            return (Criteria) this;
        }

        public Criteria andUseYnIsNotNull() {
            addCriterion("TSB.USE_YN is not null");
            return (Criteria) this;
        }

        public Criteria andUseYnEqualTo(String value) {
            addCriterion("TSB.USE_YN =", value, "useYn");
            return (Criteria) this;
        }

        public Criteria andUseYnNotEqualTo(String value) {
            addCriterion("TSB.USE_YN <>", value, "useYn");
            return (Criteria) this;
        }

        public Criteria andUseYnGreaterThan(String value) {
            addCriterion("TSB.USE_YN >", value, "useYn");
            return (Criteria) this;
        }

        public Criteria andUseYnGreaterThanOrEqualTo(String value) {
            addCriterion("TSB.USE_YN >=", value, "useYn");
            return (Criteria) this;
        }

        public Criteria andUseYnLessThan(String value) {
            addCriterion("TSB.USE_YN <", value, "useYn");
            return (Criteria) this;
        }

        public Criteria andUseYnLessThanOrEqualTo(String value) {
            addCriterion("TSB.USE_YN <=", value, "useYn");
            return (Criteria) this;
        }

        public Criteria andUseYnLike(String value) {
            addCriterion("TSB.USE_YN like", value, "useYn");
            return (Criteria) this;
        }

        public Criteria andUseYnNotLike(String value) {
            addCriterion("TSB.USE_YN not like", value, "useYn");
            return (Criteria) this;
        }

        public Criteria andUseYnIn(List<String> values) {
            addCriterion("TSB.USE_YN in", values, "useYn");
            return (Criteria) this;
        }

        public Criteria andUseYnNotIn(List<String> values) {
            addCriterion("TSB.USE_YN not in", values, "useYn");
            return (Criteria) this;
        }

        public Criteria andUseYnBetween(String value1, String value2) {
            addCriterion("TSB.USE_YN between", value1, value2, "useYn");
            return (Criteria) this;
        }

        public Criteria andUseYnNotBetween(String value1, String value2) {
            addCriterion("TSB.USE_YN not between", value1, value2, "useYn");
            return (Criteria) this;
        }

        public Criteria andSiteIdLikeInsensitive(String value) {
            addCriterion("upper(TSB.SITE_ID) like", value.toUpperCase(), "siteId");
            return (Criteria) this;
        }

        public Criteria andSiteBenfTpCdLikeInsensitive(String value) {
            addCriterion("upper(TSB.SITE_BENF_TP_CD) like", value.toUpperCase(), "siteBenfTpCd");
            return (Criteria) this;
        }

        public Criteria andBenfNmLikeInsensitive(String value) {
            addCriterion("upper(TSB.BENF_NM) like", value.toUpperCase(), "benfNm");
            return (Criteria) this;
        }

        public Criteria andRegIdLikeInsensitive(String value) {
            addCriterion("upper(TSB.REG_ID) like", value.toUpperCase(), "regId");
            return (Criteria) this;
        }

        public Criteria andModIdLikeInsensitive(String value) {
            addCriterion("upper(TSB.MOD_ID) like", value.toUpperCase(), "modId");
            return (Criteria) this;
        }

        public Criteria andUseYnLikeInsensitive(String value) {
            addCriterion("upper(TSB.USE_YN) like", value.toUpperCase(), "useYn");
            return (Criteria) this;
        }

        public Criteria andSiteIdLikeLeft(String value) {
            addCriterion("TSB.SITE_ID like ", "%" + value, "siteId");
            return (Criteria) this;
        }

        public Criteria andSiteIdLikeRight(String value) {
            addCriterion("TSB.SITE_ID like ", value + "%", "siteId");
            return (Criteria) this;
        }

        public Criteria andSiteIdLikeBoth(String value) {
            addCriterion("TSB.SITE_ID like ", "%" + value + "%", "siteId");
            return (Criteria) this;
        }

        public Criteria andSiteBenfTpCdLikeLeft(String value) {
            addCriterion("TSB.SITE_BENF_TP_CD like ", "%" + value, "siteBenfTpCd");
            return (Criteria) this;
        }

        public Criteria andSiteBenfTpCdLikeRight(String value) {
            addCriterion("TSB.SITE_BENF_TP_CD like ", value + "%", "siteBenfTpCd");
            return (Criteria) this;
        }

        public Criteria andSiteBenfTpCdLikeBoth(String value) {
            addCriterion("TSB.SITE_BENF_TP_CD like ", "%" + value + "%", "siteBenfTpCd");
            return (Criteria) this;
        }

        public Criteria andBenfNmLikeLeft(String value) {
            addCriterion("TSB.BENF_NM like ", "%" + value, "benfNm");
            return (Criteria) this;
        }

        public Criteria andBenfNmLikeRight(String value) {
            addCriterion("TSB.BENF_NM like ", value + "%", "benfNm");
            return (Criteria) this;
        }

        public Criteria andBenfNmLikeBoth(String value) {
            addCriterion("TSB.BENF_NM like ", "%" + value + "%", "benfNm");
            return (Criteria) this;
        }

        public Criteria andRegIdLikeLeft(String value) {
            addCriterion("TSB.REG_ID like ", "%" + value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdLikeRight(String value) {
            addCriterion("TSB.REG_ID like ", value + "%", "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdLikeBoth(String value) {
            addCriterion("TSB.REG_ID like ", "%" + value + "%", "regId");
            return (Criteria) this;
        }

        public Criteria andModIdLikeLeft(String value) {
            addCriterion("TSB.MOD_ID like ", "%" + value, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdLikeRight(String value) {
            addCriterion("TSB.MOD_ID like ", value + "%", "modId");
            return (Criteria) this;
        }

        public Criteria andModIdLikeBoth(String value) {
            addCriterion("TSB.MOD_ID like ", "%" + value + "%", "modId");
            return (Criteria) this;
        }

        public Criteria andUseYnLikeLeft(String value) {
            addCriterion("TSB.USE_YN like ", "%" + value, "useYn");
            return (Criteria) this;
        }

        public Criteria andUseYnLikeRight(String value) {
            addCriterion("TSB.USE_YN like ", value + "%", "useYn");
            return (Criteria) this;
        }

        public Criteria andUseYnLikeBoth(String value) {
            addCriterion("TSB.USE_YN like ", "%" + value + "%", "useYn");
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