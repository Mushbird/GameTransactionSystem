package com.mushbird.sinsege.base.module.board.model.entity.criteria;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BoardArticleReplyEntityCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    public BoardArticleReplyEntityCriteria() {
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

        public Criteria andBbsArtRplyIdIsNull() {
            addCriterion("TBAR.BBS_ART_RPLY_ID is null");
            return (Criteria) this;
        }

        public Criteria andBbsArtRplyIdIsNotNull() {
            addCriterion("TBAR.BBS_ART_RPLY_ID is not null");
            return (Criteria) this;
        }

        public Criteria andBbsArtRplyIdEqualTo(Integer value) {
            addCriterion("TBAR.BBS_ART_RPLY_ID =", value, "bbsArtRplyId");
            return (Criteria) this;
        }

        public Criteria andBbsArtRplyIdNotEqualTo(Integer value) {
            addCriterion("TBAR.BBS_ART_RPLY_ID <>", value, "bbsArtRplyId");
            return (Criteria) this;
        }

        public Criteria andBbsArtRplyIdGreaterThan(Integer value) {
            addCriterion("TBAR.BBS_ART_RPLY_ID >", value, "bbsArtRplyId");
            return (Criteria) this;
        }

        public Criteria andBbsArtRplyIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("TBAR.BBS_ART_RPLY_ID >=", value, "bbsArtRplyId");
            return (Criteria) this;
        }

        public Criteria andBbsArtRplyIdLessThan(Integer value) {
            addCriterion("TBAR.BBS_ART_RPLY_ID <", value, "bbsArtRplyId");
            return (Criteria) this;
        }

        public Criteria andBbsArtRplyIdLessThanOrEqualTo(Integer value) {
            addCriterion("TBAR.BBS_ART_RPLY_ID <=", value, "bbsArtRplyId");
            return (Criteria) this;
        }

        public Criteria andBbsArtRplyIdIn(List<Integer> values) {
            addCriterion("TBAR.BBS_ART_RPLY_ID in", values, "bbsArtRplyId");
            return (Criteria) this;
        }

        public Criteria andBbsArtRplyIdNotIn(List<Integer> values) {
            addCriterion("TBAR.BBS_ART_RPLY_ID not in", values, "bbsArtRplyId");
            return (Criteria) this;
        }

        public Criteria andBbsArtRplyIdBetween(Integer value1, Integer value2) {
            addCriterion("TBAR.BBS_ART_RPLY_ID between", value1, value2, "bbsArtRplyId");
            return (Criteria) this;
        }

        public Criteria andBbsArtRplyIdNotBetween(Integer value1, Integer value2) {
            addCriterion("TBAR.BBS_ART_RPLY_ID not between", value1, value2, "bbsArtRplyId");
            return (Criteria) this;
        }

        public Criteria andBbsArtIdIsNull() {
            addCriterion("TBAR.BBS_ART_ID is null");
            return (Criteria) this;
        }

        public Criteria andBbsArtIdIsNotNull() {
            addCriterion("TBAR.BBS_ART_ID is not null");
            return (Criteria) this;
        }

        public Criteria andBbsArtIdEqualTo(Integer value) {
            addCriterion("TBAR.BBS_ART_ID =", value, "bbsArtId");
            return (Criteria) this;
        }

        public Criteria andBbsArtIdNotEqualTo(Integer value) {
            addCriterion("TBAR.BBS_ART_ID <>", value, "bbsArtId");
            return (Criteria) this;
        }

        public Criteria andBbsArtIdGreaterThan(Integer value) {
            addCriterion("TBAR.BBS_ART_ID >", value, "bbsArtId");
            return (Criteria) this;
        }

        public Criteria andBbsArtIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("TBAR.BBS_ART_ID >=", value, "bbsArtId");
            return (Criteria) this;
        }

        public Criteria andBbsArtIdLessThan(Integer value) {
            addCriterion("TBAR.BBS_ART_ID <", value, "bbsArtId");
            return (Criteria) this;
        }

        public Criteria andBbsArtIdLessThanOrEqualTo(Integer value) {
            addCriterion("TBAR.BBS_ART_ID <=", value, "bbsArtId");
            return (Criteria) this;
        }

        public Criteria andBbsArtIdIn(List<Integer> values) {
            addCriterion("TBAR.BBS_ART_ID in", values, "bbsArtId");
            return (Criteria) this;
        }

        public Criteria andBbsArtIdNotIn(List<Integer> values) {
            addCriterion("TBAR.BBS_ART_ID not in", values, "bbsArtId");
            return (Criteria) this;
        }

        public Criteria andBbsArtIdBetween(Integer value1, Integer value2) {
            addCriterion("TBAR.BBS_ART_ID between", value1, value2, "bbsArtId");
            return (Criteria) this;
        }

        public Criteria andBbsArtIdNotBetween(Integer value1, Integer value2) {
            addCriterion("TBAR.BBS_ART_ID not between", value1, value2, "bbsArtId");
            return (Criteria) this;
        }

        public Criteria andMbrIdIsNull() {
            addCriterion("TBAR.MBR_ID is null");
            return (Criteria) this;
        }

        public Criteria andMbrIdIsNotNull() {
            addCriterion("TBAR.MBR_ID is not null");
            return (Criteria) this;
        }

        public Criteria andMbrIdEqualTo(String value) {
            addCriterion("TBAR.MBR_ID =", value, "mbrId");
            return (Criteria) this;
        }

        public Criteria andMbrIdNotEqualTo(String value) {
            addCriterion("TBAR.MBR_ID <>", value, "mbrId");
            return (Criteria) this;
        }

        public Criteria andMbrIdGreaterThan(String value) {
            addCriterion("TBAR.MBR_ID >", value, "mbrId");
            return (Criteria) this;
        }

        public Criteria andMbrIdGreaterThanOrEqualTo(String value) {
            addCriterion("TBAR.MBR_ID >=", value, "mbrId");
            return (Criteria) this;
        }

        public Criteria andMbrIdLessThan(String value) {
            addCriterion("TBAR.MBR_ID <", value, "mbrId");
            return (Criteria) this;
        }

        public Criteria andMbrIdLessThanOrEqualTo(String value) {
            addCriterion("TBAR.MBR_ID <=", value, "mbrId");
            return (Criteria) this;
        }

        public Criteria andMbrIdLike(String value) {
            addCriterion("TBAR.MBR_ID like", value, "mbrId");
            return (Criteria) this;
        }

        public Criteria andMbrIdNotLike(String value) {
            addCriterion("TBAR.MBR_ID not like", value, "mbrId");
            return (Criteria) this;
        }

        public Criteria andMbrIdIn(List<String> values) {
            addCriterion("TBAR.MBR_ID in", values, "mbrId");
            return (Criteria) this;
        }

        public Criteria andMbrIdNotIn(List<String> values) {
            addCriterion("TBAR.MBR_ID not in", values, "mbrId");
            return (Criteria) this;
        }

        public Criteria andMbrIdBetween(String value1, String value2) {
            addCriterion("TBAR.MBR_ID between", value1, value2, "mbrId");
            return (Criteria) this;
        }

        public Criteria andMbrIdNotBetween(String value1, String value2) {
            addCriterion("TBAR.MBR_ID not between", value1, value2, "mbrId");
            return (Criteria) this;
        }

        public Criteria andAdmIdIsNull() {
            addCriterion("TBAR.ADM_ID is null");
            return (Criteria) this;
        }

        public Criteria andAdmIdIsNotNull() {
            addCriterion("TBAR.ADM_ID is not null");
            return (Criteria) this;
        }

        public Criteria andAdmIdEqualTo(String value) {
            addCriterion("TBAR.ADM_ID =", value, "admId");
            return (Criteria) this;
        }

        public Criteria andAdmIdNotEqualTo(String value) {
            addCriterion("TBAR.ADM_ID <>", value, "admId");
            return (Criteria) this;
        }

        public Criteria andAdmIdGreaterThan(String value) {
            addCriterion("TBAR.ADM_ID >", value, "admId");
            return (Criteria) this;
        }

        public Criteria andAdmIdGreaterThanOrEqualTo(String value) {
            addCriterion("TBAR.ADM_ID >=", value, "admId");
            return (Criteria) this;
        }

        public Criteria andAdmIdLessThan(String value) {
            addCriterion("TBAR.ADM_ID <", value, "admId");
            return (Criteria) this;
        }

        public Criteria andAdmIdLessThanOrEqualTo(String value) {
            addCriterion("TBAR.ADM_ID <=", value, "admId");
            return (Criteria) this;
        }

        public Criteria andAdmIdLike(String value) {
            addCriterion("TBAR.ADM_ID like", value, "admId");
            return (Criteria) this;
        }

        public Criteria andAdmIdNotLike(String value) {
            addCriterion("TBAR.ADM_ID not like", value, "admId");
            return (Criteria) this;
        }

        public Criteria andAdmIdIn(List<String> values) {
            addCriterion("TBAR.ADM_ID in", values, "admId");
            return (Criteria) this;
        }

        public Criteria andAdmIdNotIn(List<String> values) {
            addCriterion("TBAR.ADM_ID not in", values, "admId");
            return (Criteria) this;
        }

        public Criteria andAdmIdBetween(String value1, String value2) {
            addCriterion("TBAR.ADM_ID between", value1, value2, "admId");
            return (Criteria) this;
        }

        public Criteria andAdmIdNotBetween(String value1, String value2) {
            addCriterion("TBAR.ADM_ID not between", value1, value2, "admId");
            return (Criteria) this;
        }

        public Criteria andRplyContIsNull() {
            addCriterion("TBAR.RPLY_CONT is null");
            return (Criteria) this;
        }

        public Criteria andRplyContIsNotNull() {
            addCriterion("TBAR.RPLY_CONT is not null");
            return (Criteria) this;
        }

        public Criteria andRplyContEqualTo(String value) {
            addCriterion("TBAR.RPLY_CONT =", value, "rplyCont");
            return (Criteria) this;
        }

        public Criteria andRplyContNotEqualTo(String value) {
            addCriterion("TBAR.RPLY_CONT <>", value, "rplyCont");
            return (Criteria) this;
        }

        public Criteria andRplyContGreaterThan(String value) {
            addCriterion("TBAR.RPLY_CONT >", value, "rplyCont");
            return (Criteria) this;
        }

        public Criteria andRplyContGreaterThanOrEqualTo(String value) {
            addCriterion("TBAR.RPLY_CONT >=", value, "rplyCont");
            return (Criteria) this;
        }

        public Criteria andRplyContLessThan(String value) {
            addCriterion("TBAR.RPLY_CONT <", value, "rplyCont");
            return (Criteria) this;
        }

        public Criteria andRplyContLessThanOrEqualTo(String value) {
            addCriterion("TBAR.RPLY_CONT <=", value, "rplyCont");
            return (Criteria) this;
        }

        public Criteria andRplyContLike(String value) {
            addCriterion("TBAR.RPLY_CONT like", value, "rplyCont");
            return (Criteria) this;
        }

        public Criteria andRplyContNotLike(String value) {
            addCriterion("TBAR.RPLY_CONT not like", value, "rplyCont");
            return (Criteria) this;
        }

        public Criteria andRplyContIn(List<String> values) {
            addCriterion("TBAR.RPLY_CONT in", values, "rplyCont");
            return (Criteria) this;
        }

        public Criteria andRplyContNotIn(List<String> values) {
            addCriterion("TBAR.RPLY_CONT not in", values, "rplyCont");
            return (Criteria) this;
        }

        public Criteria andRplyContBetween(String value1, String value2) {
            addCriterion("TBAR.RPLY_CONT between", value1, value2, "rplyCont");
            return (Criteria) this;
        }

        public Criteria andRplyContNotBetween(String value1, String value2) {
            addCriterion("TBAR.RPLY_CONT not between", value1, value2, "rplyCont");
            return (Criteria) this;
        }

        public Criteria andRplyStatCdIsNull() {
            addCriterion("TBAR.RPLY_STAT_CD is null");
            return (Criteria) this;
        }

        public Criteria andRplyStatCdIsNotNull() {
            addCriterion("TBAR.RPLY_STAT_CD is not null");
            return (Criteria) this;
        }

        public Criteria andRplyStatCdEqualTo(String value) {
            addCriterion("TBAR.RPLY_STAT_CD =", value, "rplyStatCd");
            return (Criteria) this;
        }

        public Criteria andRplyStatCdNotEqualTo(String value) {
            addCriterion("TBAR.RPLY_STAT_CD <>", value, "rplyStatCd");
            return (Criteria) this;
        }

        public Criteria andRplyStatCdGreaterThan(String value) {
            addCriterion("TBAR.RPLY_STAT_CD >", value, "rplyStatCd");
            return (Criteria) this;
        }

        public Criteria andRplyStatCdGreaterThanOrEqualTo(String value) {
            addCriterion("TBAR.RPLY_STAT_CD >=", value, "rplyStatCd");
            return (Criteria) this;
        }

        public Criteria andRplyStatCdLessThan(String value) {
            addCriterion("TBAR.RPLY_STAT_CD <", value, "rplyStatCd");
            return (Criteria) this;
        }

        public Criteria andRplyStatCdLessThanOrEqualTo(String value) {
            addCriterion("TBAR.RPLY_STAT_CD <=", value, "rplyStatCd");
            return (Criteria) this;
        }

        public Criteria andRplyStatCdLike(String value) {
            addCriterion("TBAR.RPLY_STAT_CD like", value, "rplyStatCd");
            return (Criteria) this;
        }

        public Criteria andRplyStatCdNotLike(String value) {
            addCriterion("TBAR.RPLY_STAT_CD not like", value, "rplyStatCd");
            return (Criteria) this;
        }

        public Criteria andRplyStatCdIn(List<String> values) {
            addCriterion("TBAR.RPLY_STAT_CD in", values, "rplyStatCd");
            return (Criteria) this;
        }

        public Criteria andRplyStatCdNotIn(List<String> values) {
            addCriterion("TBAR.RPLY_STAT_CD not in", values, "rplyStatCd");
            return (Criteria) this;
        }

        public Criteria andRplyStatCdBetween(String value1, String value2) {
            addCriterion("TBAR.RPLY_STAT_CD between", value1, value2, "rplyStatCd");
            return (Criteria) this;
        }

        public Criteria andRplyStatCdNotBetween(String value1, String value2) {
            addCriterion("TBAR.RPLY_STAT_CD not between", value1, value2, "rplyStatCd");
            return (Criteria) this;
        }

        public Criteria andAtchGidIsNull() {
            addCriterion("TBAR.ATCH_GID is null");
            return (Criteria) this;
        }

        public Criteria andAtchGidIsNotNull() {
            addCriterion("TBAR.ATCH_GID is not null");
            return (Criteria) this;
        }

        public Criteria andAtchGidEqualTo(Integer value) {
            addCriterion("TBAR.ATCH_GID =", value, "atchGid");
            return (Criteria) this;
        }

        public Criteria andAtchGidNotEqualTo(Integer value) {
            addCriterion("TBAR.ATCH_GID <>", value, "atchGid");
            return (Criteria) this;
        }

        public Criteria andAtchGidGreaterThan(Integer value) {
            addCriterion("TBAR.ATCH_GID >", value, "atchGid");
            return (Criteria) this;
        }

        public Criteria andAtchGidGreaterThanOrEqualTo(Integer value) {
            addCriterion("TBAR.ATCH_GID >=", value, "atchGid");
            return (Criteria) this;
        }

        public Criteria andAtchGidLessThan(Integer value) {
            addCriterion("TBAR.ATCH_GID <", value, "atchGid");
            return (Criteria) this;
        }

        public Criteria andAtchGidLessThanOrEqualTo(Integer value) {
            addCriterion("TBAR.ATCH_GID <=", value, "atchGid");
            return (Criteria) this;
        }

        public Criteria andAtchGidIn(List<Integer> values) {
            addCriterion("TBAR.ATCH_GID in", values, "atchGid");
            return (Criteria) this;
        }

        public Criteria andAtchGidNotIn(List<Integer> values) {
            addCriterion("TBAR.ATCH_GID not in", values, "atchGid");
            return (Criteria) this;
        }

        public Criteria andAtchGidBetween(Integer value1, Integer value2) {
            addCriterion("TBAR.ATCH_GID between", value1, value2, "atchGid");
            return (Criteria) this;
        }

        public Criteria andAtchGidNotBetween(Integer value1, Integer value2) {
            addCriterion("TBAR.ATCH_GID not between", value1, value2, "atchGid");
            return (Criteria) this;
        }

        public Criteria andRegDtIsNull() {
            addCriterion("TBAR.REG_DT is null");
            return (Criteria) this;
        }

        public Criteria andRegDtIsNotNull() {
            addCriterion("TBAR.REG_DT is not null");
            return (Criteria) this;
        }

        public Criteria andRegDtEqualTo(Date value) {
            addCriterion("TBAR.REG_DT =", value, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtNotEqualTo(Date value) {
            addCriterion("TBAR.REG_DT <>", value, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtGreaterThan(Date value) {
            addCriterion("TBAR.REG_DT >", value, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtGreaterThanOrEqualTo(Date value) {
            addCriterion("TBAR.REG_DT >=", value, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtLessThan(Date value) {
            addCriterion("TBAR.REG_DT <", value, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtLessThanOrEqualTo(Date value) {
            addCriterion("TBAR.REG_DT <=", value, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtIn(List<Date> values) {
            addCriterion("TBAR.REG_DT in", values, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtNotIn(List<Date> values) {
            addCriterion("TBAR.REG_DT not in", values, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtBetween(Date value1, Date value2) {
            addCriterion("TBAR.REG_DT between", value1, value2, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtNotBetween(Date value1, Date value2) {
            addCriterion("TBAR.REG_DT not between", value1, value2, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegIdIsNull() {
            addCriterion("TBAR.REG_ID is null");
            return (Criteria) this;
        }

        public Criteria andRegIdIsNotNull() {
            addCriterion("TBAR.REG_ID is not null");
            return (Criteria) this;
        }

        public Criteria andRegIdEqualTo(String value) {
            addCriterion("TBAR.REG_ID =", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdNotEqualTo(String value) {
            addCriterion("TBAR.REG_ID <>", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdGreaterThan(String value) {
            addCriterion("TBAR.REG_ID >", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdGreaterThanOrEqualTo(String value) {
            addCriterion("TBAR.REG_ID >=", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdLessThan(String value) {
            addCriterion("TBAR.REG_ID <", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdLessThanOrEqualTo(String value) {
            addCriterion("TBAR.REG_ID <=", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdLike(String value) {
            addCriterion("TBAR.REG_ID like", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdNotLike(String value) {
            addCriterion("TBAR.REG_ID not like", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdIn(List<String> values) {
            addCriterion("TBAR.REG_ID in", values, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdNotIn(List<String> values) {
            addCriterion("TBAR.REG_ID not in", values, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdBetween(String value1, String value2) {
            addCriterion("TBAR.REG_ID between", value1, value2, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdNotBetween(String value1, String value2) {
            addCriterion("TBAR.REG_ID not between", value1, value2, "regId");
            return (Criteria) this;
        }

        public Criteria andModDtIsNull() {
            addCriterion("TBAR.MOD_DT is null");
            return (Criteria) this;
        }

        public Criteria andModDtIsNotNull() {
            addCriterion("TBAR.MOD_DT is not null");
            return (Criteria) this;
        }

        public Criteria andModDtEqualTo(Date value) {
            addCriterion("TBAR.MOD_DT =", value, "modDt");
            return (Criteria) this;
        }

        public Criteria andModDtNotEqualTo(Date value) {
            addCriterion("TBAR.MOD_DT <>", value, "modDt");
            return (Criteria) this;
        }

        public Criteria andModDtGreaterThan(Date value) {
            addCriterion("TBAR.MOD_DT >", value, "modDt");
            return (Criteria) this;
        }

        public Criteria andModDtGreaterThanOrEqualTo(Date value) {
            addCriterion("TBAR.MOD_DT >=", value, "modDt");
            return (Criteria) this;
        }

        public Criteria andModDtLessThan(Date value) {
            addCriterion("TBAR.MOD_DT <", value, "modDt");
            return (Criteria) this;
        }

        public Criteria andModDtLessThanOrEqualTo(Date value) {
            addCriterion("TBAR.MOD_DT <=", value, "modDt");
            return (Criteria) this;
        }

        public Criteria andModDtIn(List<Date> values) {
            addCriterion("TBAR.MOD_DT in", values, "modDt");
            return (Criteria) this;
        }

        public Criteria andModDtNotIn(List<Date> values) {
            addCriterion("TBAR.MOD_DT not in", values, "modDt");
            return (Criteria) this;
        }

        public Criteria andModDtBetween(Date value1, Date value2) {
            addCriterion("TBAR.MOD_DT between", value1, value2, "modDt");
            return (Criteria) this;
        }

        public Criteria andModDtNotBetween(Date value1, Date value2) {
            addCriterion("TBAR.MOD_DT not between", value1, value2, "modDt");
            return (Criteria) this;
        }

        public Criteria andModIdIsNull() {
            addCriterion("TBAR.MOD_ID is null");
            return (Criteria) this;
        }

        public Criteria andModIdIsNotNull() {
            addCriterion("TBAR.MOD_ID is not null");
            return (Criteria) this;
        }

        public Criteria andModIdEqualTo(String value) {
            addCriterion("TBAR.MOD_ID =", value, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdNotEqualTo(String value) {
            addCriterion("TBAR.MOD_ID <>", value, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdGreaterThan(String value) {
            addCriterion("TBAR.MOD_ID >", value, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdGreaterThanOrEqualTo(String value) {
            addCriterion("TBAR.MOD_ID >=", value, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdLessThan(String value) {
            addCriterion("TBAR.MOD_ID <", value, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdLessThanOrEqualTo(String value) {
            addCriterion("TBAR.MOD_ID <=", value, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdLike(String value) {
            addCriterion("TBAR.MOD_ID like", value, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdNotLike(String value) {
            addCriterion("TBAR.MOD_ID not like", value, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdIn(List<String> values) {
            addCriterion("TBAR.MOD_ID in", values, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdNotIn(List<String> values) {
            addCriterion("TBAR.MOD_ID not in", values, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdBetween(String value1, String value2) {
            addCriterion("TBAR.MOD_ID between", value1, value2, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdNotBetween(String value1, String value2) {
            addCriterion("TBAR.MOD_ID not between", value1, value2, "modId");
            return (Criteria) this;
        }

        public Criteria andUseYnIsNull() {
            addCriterion("TBAR.USE_YN is null");
            return (Criteria) this;
        }

        public Criteria andUseYnIsNotNull() {
            addCriterion("TBAR.USE_YN is not null");
            return (Criteria) this;
        }

        public Criteria andUseYnEqualTo(String value) {
            addCriterion("TBAR.USE_YN =", value, "useYn");
            return (Criteria) this;
        }

        public Criteria andUseYnNotEqualTo(String value) {
            addCriterion("TBAR.USE_YN <>", value, "useYn");
            return (Criteria) this;
        }

        public Criteria andUseYnGreaterThan(String value) {
            addCriterion("TBAR.USE_YN >", value, "useYn");
            return (Criteria) this;
        }

        public Criteria andUseYnGreaterThanOrEqualTo(String value) {
            addCriterion("TBAR.USE_YN >=", value, "useYn");
            return (Criteria) this;
        }

        public Criteria andUseYnLessThan(String value) {
            addCriterion("TBAR.USE_YN <", value, "useYn");
            return (Criteria) this;
        }

        public Criteria andUseYnLessThanOrEqualTo(String value) {
            addCriterion("TBAR.USE_YN <=", value, "useYn");
            return (Criteria) this;
        }

        public Criteria andUseYnLike(String value) {
            addCriterion("TBAR.USE_YN like", value, "useYn");
            return (Criteria) this;
        }

        public Criteria andUseYnNotLike(String value) {
            addCriterion("TBAR.USE_YN not like", value, "useYn");
            return (Criteria) this;
        }

        public Criteria andUseYnIn(List<String> values) {
            addCriterion("TBAR.USE_YN in", values, "useYn");
            return (Criteria) this;
        }

        public Criteria andUseYnNotIn(List<String> values) {
            addCriterion("TBAR.USE_YN not in", values, "useYn");
            return (Criteria) this;
        }

        public Criteria andUseYnBetween(String value1, String value2) {
            addCriterion("TBAR.USE_YN between", value1, value2, "useYn");
            return (Criteria) this;
        }

        public Criteria andUseYnNotBetween(String value1, String value2) {
            addCriterion("TBAR.USE_YN not between", value1, value2, "useYn");
            return (Criteria) this;
        }

        public Criteria andMbrIdLikeInsensitive(String value) {
            addCriterion("upper(TBAR.MBR_ID) like", value.toUpperCase(), "mbrId");
            return (Criteria) this;
        }

        public Criteria andAdmIdLikeInsensitive(String value) {
            addCriterion("upper(TBAR.ADM_ID) like", value.toUpperCase(), "admId");
            return (Criteria) this;
        }

        public Criteria andRplyContLikeInsensitive(String value) {
            addCriterion("upper(TBAR.RPLY_CONT) like", value.toUpperCase(), "rplyCont");
            return (Criteria) this;
        }

        public Criteria andRplyStatCdLikeInsensitive(String value) {
            addCriterion("upper(TBAR.RPLY_STAT_CD) like", value.toUpperCase(), "rplyStatCd");
            return (Criteria) this;
        }

        public Criteria andRegIdLikeInsensitive(String value) {
            addCriterion("upper(TBAR.REG_ID) like", value.toUpperCase(), "regId");
            return (Criteria) this;
        }

        public Criteria andModIdLikeInsensitive(String value) {
            addCriterion("upper(TBAR.MOD_ID) like", value.toUpperCase(), "modId");
            return (Criteria) this;
        }

        public Criteria andUseYnLikeInsensitive(String value) {
            addCriterion("upper(TBAR.USE_YN) like", value.toUpperCase(), "useYn");
            return (Criteria) this;
        }

        public Criteria andMbrIdLikeLeft(String value) {
            addCriterion("TBAR.MBR_ID like ", "%" + value, "mbrId");
            return (Criteria) this;
        }

        public Criteria andMbrIdLikeRight(String value) {
            addCriterion("TBAR.MBR_ID like ", value + "%", "mbrId");
            return (Criteria) this;
        }

        public Criteria andMbrIdLikeBoth(String value) {
            addCriterion("TBAR.MBR_ID like ", "%" + value + "%", "mbrId");
            return (Criteria) this;
        }

        public Criteria andAdmIdLikeLeft(String value) {
            addCriterion("TBAR.ADM_ID like ", "%" + value, "admId");
            return (Criteria) this;
        }

        public Criteria andAdmIdLikeRight(String value) {
            addCriterion("TBAR.ADM_ID like ", value + "%", "admId");
            return (Criteria) this;
        }

        public Criteria andAdmIdLikeBoth(String value) {
            addCriterion("TBAR.ADM_ID like ", "%" + value + "%", "admId");
            return (Criteria) this;
        }

        public Criteria andRplyContLikeLeft(String value) {
            addCriterion("TBAR.RPLY_CONT like ", "%" + value, "rplyCont");
            return (Criteria) this;
        }

        public Criteria andRplyContLikeRight(String value) {
            addCriterion("TBAR.RPLY_CONT like ", value + "%", "rplyCont");
            return (Criteria) this;
        }

        public Criteria andRplyContLikeBoth(String value) {
            addCriterion("TBAR.RPLY_CONT like ", "%" + value + "%", "rplyCont");
            return (Criteria) this;
        }

        public Criteria andRplyStatCdLikeLeft(String value) {
            addCriterion("TBAR.RPLY_STAT_CD like ", "%" + value, "rplyStatCd");
            return (Criteria) this;
        }

        public Criteria andRplyStatCdLikeRight(String value) {
            addCriterion("TBAR.RPLY_STAT_CD like ", value + "%", "rplyStatCd");
            return (Criteria) this;
        }

        public Criteria andRplyStatCdLikeBoth(String value) {
            addCriterion("TBAR.RPLY_STAT_CD like ", "%" + value + "%", "rplyStatCd");
            return (Criteria) this;
        }

        public Criteria andRegIdLikeLeft(String value) {
            addCriterion("TBAR.REG_ID like ", "%" + value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdLikeRight(String value) {
            addCriterion("TBAR.REG_ID like ", value + "%", "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdLikeBoth(String value) {
            addCriterion("TBAR.REG_ID like ", "%" + value + "%", "regId");
            return (Criteria) this;
        }

        public Criteria andModIdLikeLeft(String value) {
            addCriterion("TBAR.MOD_ID like ", "%" + value, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdLikeRight(String value) {
            addCriterion("TBAR.MOD_ID like ", value + "%", "modId");
            return (Criteria) this;
        }

        public Criteria andModIdLikeBoth(String value) {
            addCriterion("TBAR.MOD_ID like ", "%" + value + "%", "modId");
            return (Criteria) this;
        }

        public Criteria andUseYnLikeLeft(String value) {
            addCriterion("TBAR.USE_YN like ", "%" + value, "useYn");
            return (Criteria) this;
        }

        public Criteria andUseYnLikeRight(String value) {
            addCriterion("TBAR.USE_YN like ", value + "%", "useYn");
            return (Criteria) this;
        }

        public Criteria andUseYnLikeBoth(String value) {
            addCriterion("TBAR.USE_YN like ", "%" + value + "%", "useYn");
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