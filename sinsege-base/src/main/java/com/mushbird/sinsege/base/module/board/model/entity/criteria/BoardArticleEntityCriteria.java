package com.mushbird.sinsege.base.module.board.model.entity.criteria;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class BoardArticleEntityCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    public BoardArticleEntityCriteria() {
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

        public Criteria andBbsArtIdIsNull() {
            addCriterion("TBA.BBS_ART_ID is null");
            return (Criteria) this;
        }

        public Criteria andBbsArtIdIsNotNull() {
            addCriterion("TBA.BBS_ART_ID is not null");
            return (Criteria) this;
        }

        public Criteria andBbsArtIdEqualTo(Integer value) {
            addCriterion("TBA.BBS_ART_ID =", value, "bbsArtId");
            return (Criteria) this;
        }

        public Criteria andBbsArtIdNotEqualTo(Integer value) {
            addCriterion("TBA.BBS_ART_ID <>", value, "bbsArtId");
            return (Criteria) this;
        }

        public Criteria andBbsArtIdGreaterThan(Integer value) {
            addCriterion("TBA.BBS_ART_ID >", value, "bbsArtId");
            return (Criteria) this;
        }

        public Criteria andBbsArtIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("TBA.BBS_ART_ID >=", value, "bbsArtId");
            return (Criteria) this;
        }

        public Criteria andBbsArtIdLessThan(Integer value) {
            addCriterion("TBA.BBS_ART_ID <", value, "bbsArtId");
            return (Criteria) this;
        }

        public Criteria andBbsArtIdLessThanOrEqualTo(Integer value) {
            addCriterion("TBA.BBS_ART_ID <=", value, "bbsArtId");
            return (Criteria) this;
        }

        public Criteria andBbsArtIdIn(List<Integer> values) {
            addCriterion("TBA.BBS_ART_ID in", values, "bbsArtId");
            return (Criteria) this;
        }

        public Criteria andBbsArtIdNotIn(List<Integer> values) {
            addCriterion("TBA.BBS_ART_ID not in", values, "bbsArtId");
            return (Criteria) this;
        }

        public Criteria andBbsArtIdBetween(Integer value1, Integer value2) {
            addCriterion("TBA.BBS_ART_ID between", value1, value2, "bbsArtId");
            return (Criteria) this;
        }

        public Criteria andBbsArtIdNotBetween(Integer value1, Integer value2) {
            addCriterion("TBA.BBS_ART_ID not between", value1, value2, "bbsArtId");
            return (Criteria) this;
        }

        public Criteria andBbsCdIsNull() {
            addCriterion("TBA.BBS_CD is null");
            return (Criteria) this;
        }

        public Criteria andBbsCdIsNotNull() {
            addCriterion("TBA.BBS_CD is not null");
            return (Criteria) this;
        }

        public Criteria andBbsCdEqualTo(String value) {
            addCriterion("TBA.BBS_CD =", value, "bbsCd");
            return (Criteria) this;
        }

        public Criteria andBbsCdNotEqualTo(String value) {
            addCriterion("TBA.BBS_CD <>", value, "bbsCd");
            return (Criteria) this;
        }

        public Criteria andBbsCdGreaterThan(String value) {
            addCriterion("TBA.BBS_CD >", value, "bbsCd");
            return (Criteria) this;
        }

        public Criteria andBbsCdGreaterThanOrEqualTo(String value) {
            addCriterion("TBA.BBS_CD >=", value, "bbsCd");
            return (Criteria) this;
        }

        public Criteria andBbsCdLessThan(String value) {
            addCriterion("TBA.BBS_CD <", value, "bbsCd");
            return (Criteria) this;
        }

        public Criteria andBbsCdLessThanOrEqualTo(String value) {
            addCriterion("TBA.BBS_CD <=", value, "bbsCd");
            return (Criteria) this;
        }

        public Criteria andBbsCdLike(String value) {
            addCriterion("TBA.BBS_CD like", value, "bbsCd");
            return (Criteria) this;
        }

        public Criteria andBbsCdNotLike(String value) {
            addCriterion("TBA.BBS_CD not like", value, "bbsCd");
            return (Criteria) this;
        }

        public Criteria andBbsCdIn(List<String> values) {
            addCriterion("TBA.BBS_CD in", values, "bbsCd");
            return (Criteria) this;
        }

        public Criteria andBbsCdNotIn(List<String> values) {
            addCriterion("TBA.BBS_CD not in", values, "bbsCd");
            return (Criteria) this;
        }

        public Criteria andBbsCdBetween(String value1, String value2) {
            addCriterion("TBA.BBS_CD between", value1, value2, "bbsCd");
            return (Criteria) this;
        }

        public Criteria andBbsCdNotBetween(String value1, String value2) {
            addCriterion("TBA.BBS_CD not between", value1, value2, "bbsCd");
            return (Criteria) this;
        }

        public Criteria andMbrIdIsNull() {
            addCriterion("TBA.MBR_ID is null");
            return (Criteria) this;
        }

        public Criteria andMbrIdIsNotNull() {
            addCriterion("TBA.MBR_ID is not null");
            return (Criteria) this;
        }

        public Criteria andMbrIdEqualTo(String value) {
            addCriterion("TBA.MBR_ID =", value, "mbrId");
            return (Criteria) this;
        }

        public Criteria andMbrIdNotEqualTo(String value) {
            addCriterion("TBA.MBR_ID <>", value, "mbrId");
            return (Criteria) this;
        }

        public Criteria andMbrIdGreaterThan(String value) {
            addCriterion("TBA.MBR_ID >", value, "mbrId");
            return (Criteria) this;
        }

        public Criteria andMbrIdGreaterThanOrEqualTo(String value) {
            addCriterion("TBA.MBR_ID >=", value, "mbrId");
            return (Criteria) this;
        }

        public Criteria andMbrIdLessThan(String value) {
            addCriterion("TBA.MBR_ID <", value, "mbrId");
            return (Criteria) this;
        }

        public Criteria andMbrIdLessThanOrEqualTo(String value) {
            addCriterion("TBA.MBR_ID <=", value, "mbrId");
            return (Criteria) this;
        }

        public Criteria andMbrIdLike(String value) {
            addCriterion("TBA.MBR_ID like", value, "mbrId");
            return (Criteria) this;
        }

        public Criteria andMbrIdNotLike(String value) {
            addCriterion("TBA.MBR_ID not like", value, "mbrId");
            return (Criteria) this;
        }

        public Criteria andMbrIdIn(List<String> values) {
            addCriterion("TBA.MBR_ID in", values, "mbrId");
            return (Criteria) this;
        }

        public Criteria andMbrIdNotIn(List<String> values) {
            addCriterion("TBA.MBR_ID not in", values, "mbrId");
            return (Criteria) this;
        }

        public Criteria andMbrIdBetween(String value1, String value2) {
            addCriterion("TBA.MBR_ID between", value1, value2, "mbrId");
            return (Criteria) this;
        }

        public Criteria andMbrIdNotBetween(String value1, String value2) {
            addCriterion("TBA.MBR_ID not between", value1, value2, "mbrId");
            return (Criteria) this;
        }

        public Criteria andAdmIdIsNull() {
            addCriterion("TBA.ADM_ID is null");
            return (Criteria) this;
        }

        public Criteria andAdmIdIsNotNull() {
            addCriterion("TBA.ADM_ID is not null");
            return (Criteria) this;
        }

        public Criteria andAdmIdEqualTo(String value) {
            addCriterion("TBA.ADM_ID =", value, "admId");
            return (Criteria) this;
        }

        public Criteria andAdmIdNotEqualTo(String value) {
            addCriterion("TBA.ADM_ID <>", value, "admId");
            return (Criteria) this;
        }

        public Criteria andAdmIdGreaterThan(String value) {
            addCriterion("TBA.ADM_ID >", value, "admId");
            return (Criteria) this;
        }

        public Criteria andAdmIdGreaterThanOrEqualTo(String value) {
            addCriterion("TBA.ADM_ID >=", value, "admId");
            return (Criteria) this;
        }

        public Criteria andAdmIdLessThan(String value) {
            addCriterion("TBA.ADM_ID <", value, "admId");
            return (Criteria) this;
        }

        public Criteria andAdmIdLessThanOrEqualTo(String value) {
            addCriterion("TBA.ADM_ID <=", value, "admId");
            return (Criteria) this;
        }

        public Criteria andAdmIdLike(String value) {
            addCriterion("TBA.ADM_ID like", value, "admId");
            return (Criteria) this;
        }

        public Criteria andAdmIdNotLike(String value) {
            addCriterion("TBA.ADM_ID not like", value, "admId");
            return (Criteria) this;
        }

        public Criteria andAdmIdIn(List<String> values) {
            addCriterion("TBA.ADM_ID in", values, "admId");
            return (Criteria) this;
        }

        public Criteria andAdmIdNotIn(List<String> values) {
            addCriterion("TBA.ADM_ID not in", values, "admId");
            return (Criteria) this;
        }

        public Criteria andAdmIdBetween(String value1, String value2) {
            addCriterion("TBA.ADM_ID between", value1, value2, "admId");
            return (Criteria) this;
        }

        public Criteria andAdmIdNotBetween(String value1, String value2) {
            addCriterion("TBA.ADM_ID not between", value1, value2, "admId");
            return (Criteria) this;
        }

        public Criteria andRmkIdIsNull() {
            addCriterion("TBA.RMK_ID is null");
            return (Criteria) this;
        }

        public Criteria andRmkIdIsNotNull() {
            addCriterion("TBA.RMK_ID is not null");
            return (Criteria) this;
        }

        public Criteria andRmkIdEqualTo(Integer value) {
            addCriterion("TBA.RMK_ID =", value, "rmkId");
            return (Criteria) this;
        }

        public Criteria andRmkIdNotEqualTo(Integer value) {
            addCriterion("TBA.RMK_ID <>", value, "rmkId");
            return (Criteria) this;
        }

        public Criteria andRmkIdGreaterThan(Integer value) {
            addCriterion("TBA.RMK_ID >", value, "rmkId");
            return (Criteria) this;
        }

        public Criteria andRmkIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("TBA.RMK_ID >=", value, "rmkId");
            return (Criteria) this;
        }

        public Criteria andRmkIdLessThan(Integer value) {
            addCriterion("TBA.RMK_ID <", value, "rmkId");
            return (Criteria) this;
        }

        public Criteria andRmkIdLessThanOrEqualTo(Integer value) {
            addCriterion("TBA.RMK_ID <=", value, "rmkId");
            return (Criteria) this;
        }

        public Criteria andRmkIdIn(List<Integer> values) {
            addCriterion("TBA.RMK_ID in", values, "rmkId");
            return (Criteria) this;
        }

        public Criteria andRmkIdNotIn(List<Integer> values) {
            addCriterion("TBA.RMK_ID not in", values, "rmkId");
            return (Criteria) this;
        }

        public Criteria andRmkIdBetween(Integer value1, Integer value2) {
            addCriterion("TBA.RMK_ID between", value1, value2, "rmkId");
            return (Criteria) this;
        }

        public Criteria andRmkIdNotBetween(Integer value1, Integer value2) {
            addCriterion("TBA.RMK_ID not between", value1, value2, "rmkId");
            return (Criteria) this;
        }

        public Criteria andWrtrNmIsNull() {
            addCriterion("TBA.WRTR_NM is null");
            return (Criteria) this;
        }

        public Criteria andWrtrNmIsNotNull() {
            addCriterion("TBA.WRTR_NM is not null");
            return (Criteria) this;
        }

        public Criteria andWrtrNmEqualTo(String value) {
            addCriterion("TBA.WRTR_NM =", value, "wrtrNm");
            return (Criteria) this;
        }

        public Criteria andWrtrNmNotEqualTo(String value) {
            addCriterion("TBA.WRTR_NM <>", value, "wrtrNm");
            return (Criteria) this;
        }

        public Criteria andWrtrNmGreaterThan(String value) {
            addCriterion("TBA.WRTR_NM >", value, "wrtrNm");
            return (Criteria) this;
        }

        public Criteria andWrtrNmGreaterThanOrEqualTo(String value) {
            addCriterion("TBA.WRTR_NM >=", value, "wrtrNm");
            return (Criteria) this;
        }

        public Criteria andWrtrNmLessThan(String value) {
            addCriterion("TBA.WRTR_NM <", value, "wrtrNm");
            return (Criteria) this;
        }

        public Criteria andWrtrNmLessThanOrEqualTo(String value) {
            addCriterion("TBA.WRTR_NM <=", value, "wrtrNm");
            return (Criteria) this;
        }

        public Criteria andWrtrNmLike(String value) {
            addCriterion("TBA.WRTR_NM like", value, "wrtrNm");
            return (Criteria) this;
        }

        public Criteria andWrtrNmNotLike(String value) {
            addCriterion("TBA.WRTR_NM not like", value, "wrtrNm");
            return (Criteria) this;
        }

        public Criteria andWrtrNmIn(List<String> values) {
            addCriterion("TBA.WRTR_NM in", values, "wrtrNm");
            return (Criteria) this;
        }

        public Criteria andWrtrNmNotIn(List<String> values) {
            addCriterion("TBA.WRTR_NM not in", values, "wrtrNm");
            return (Criteria) this;
        }

        public Criteria andWrtrNmBetween(String value1, String value2) {
            addCriterion("TBA.WRTR_NM between", value1, value2, "wrtrNm");
            return (Criteria) this;
        }

        public Criteria andWrtrNmNotBetween(String value1, String value2) {
            addCriterion("TBA.WRTR_NM not between", value1, value2, "wrtrNm");
            return (Criteria) this;
        }

        public Criteria andArtTitIsNull() {
            addCriterion("TBA.ART_TIT is null");
            return (Criteria) this;
        }

        public Criteria andArtTitIsNotNull() {
            addCriterion("TBA.ART_TIT is not null");
            return (Criteria) this;
        }

        public Criteria andArtTitEqualTo(String value) {
            addCriterion("TBA.ART_TIT =", value, "artTit");
            return (Criteria) this;
        }

        public Criteria andArtTitNotEqualTo(String value) {
            addCriterion("TBA.ART_TIT <>", value, "artTit");
            return (Criteria) this;
        }

        public Criteria andArtTitGreaterThan(String value) {
            addCriterion("TBA.ART_TIT >", value, "artTit");
            return (Criteria) this;
        }

        public Criteria andArtTitGreaterThanOrEqualTo(String value) {
            addCriterion("TBA.ART_TIT >=", value, "artTit");
            return (Criteria) this;
        }

        public Criteria andArtTitLessThan(String value) {
            addCriterion("TBA.ART_TIT <", value, "artTit");
            return (Criteria) this;
        }

        public Criteria andArtTitLessThanOrEqualTo(String value) {
            addCriterion("TBA.ART_TIT <=", value, "artTit");
            return (Criteria) this;
        }

        public Criteria andArtTitLike(String value) {
            addCriterion("TBA.ART_TIT like", value, "artTit");
            return (Criteria) this;
        }

        public Criteria andArtTitNotLike(String value) {
            addCriterion("TBA.ART_TIT not like", value, "artTit");
            return (Criteria) this;
        }

        public Criteria andArtTitIn(List<String> values) {
            addCriterion("TBA.ART_TIT in", values, "artTit");
            return (Criteria) this;
        }

        public Criteria andArtTitNotIn(List<String> values) {
            addCriterion("TBA.ART_TIT not in", values, "artTit");
            return (Criteria) this;
        }

        public Criteria andArtTitBetween(String value1, String value2) {
            addCriterion("TBA.ART_TIT between", value1, value2, "artTit");
            return (Criteria) this;
        }

        public Criteria andArtTitNotBetween(String value1, String value2) {
            addCriterion("TBA.ART_TIT not between", value1, value2, "artTit");
            return (Criteria) this;
        }

        public Criteria andArtContIsNull() {
            addCriterion("TBA.ART_CONT is null");
            return (Criteria) this;
        }

        public Criteria andArtContIsNotNull() {
            addCriterion("TBA.ART_CONT is not null");
            return (Criteria) this;
        }

        public Criteria andArtContEqualTo(String value) {
            addCriterion("TBA.ART_CONT =", value, "artCont");
            return (Criteria) this;
        }

        public Criteria andArtContNotEqualTo(String value) {
            addCriterion("TBA.ART_CONT <>", value, "artCont");
            return (Criteria) this;
        }

        public Criteria andArtContGreaterThan(String value) {
            addCriterion("TBA.ART_CONT >", value, "artCont");
            return (Criteria) this;
        }

        public Criteria andArtContGreaterThanOrEqualTo(String value) {
            addCriterion("TBA.ART_CONT >=", value, "artCont");
            return (Criteria) this;
        }

        public Criteria andArtContLessThan(String value) {
            addCriterion("TBA.ART_CONT <", value, "artCont");
            return (Criteria) this;
        }

        public Criteria andArtContLessThanOrEqualTo(String value) {
            addCriterion("TBA.ART_CONT <=", value, "artCont");
            return (Criteria) this;
        }

        public Criteria andArtContLike(String value) {
            addCriterion("TBA.ART_CONT like", value, "artCont");
            return (Criteria) this;
        }

        public Criteria andArtContNotLike(String value) {
            addCriterion("TBA.ART_CONT not like", value, "artCont");
            return (Criteria) this;
        }

        public Criteria andArtContIn(List<String> values) {
            addCriterion("TBA.ART_CONT in", values, "artCont");
            return (Criteria) this;
        }

        public Criteria andArtContNotIn(List<String> values) {
            addCriterion("TBA.ART_CONT not in", values, "artCont");
            return (Criteria) this;
        }

        public Criteria andArtContBetween(String value1, String value2) {
            addCriterion("TBA.ART_CONT between", value1, value2, "artCont");
            return (Criteria) this;
        }

        public Criteria andArtContNotBetween(String value1, String value2) {
            addCriterion("TBA.ART_CONT not between", value1, value2, "artCont");
            return (Criteria) this;
        }

        public Criteria andLinkUrlAddrIsNull() {
            addCriterion("TBA.LINK_URL_ADDR is null");
            return (Criteria) this;
        }

        public Criteria andLinkUrlAddrIsNotNull() {
            addCriterion("TBA.LINK_URL_ADDR is not null");
            return (Criteria) this;
        }

        public Criteria andLinkUrlAddrEqualTo(String value) {
            addCriterion("TBA.LINK_URL_ADDR =", value, "linkUrlAddr");
            return (Criteria) this;
        }

        public Criteria andLinkUrlAddrNotEqualTo(String value) {
            addCriterion("TBA.LINK_URL_ADDR <>", value, "linkUrlAddr");
            return (Criteria) this;
        }

        public Criteria andLinkUrlAddrGreaterThan(String value) {
            addCriterion("TBA.LINK_URL_ADDR >", value, "linkUrlAddr");
            return (Criteria) this;
        }

        public Criteria andLinkUrlAddrGreaterThanOrEqualTo(String value) {
            addCriterion("TBA.LINK_URL_ADDR >=", value, "linkUrlAddr");
            return (Criteria) this;
        }

        public Criteria andLinkUrlAddrLessThan(String value) {
            addCriterion("TBA.LINK_URL_ADDR <", value, "linkUrlAddr");
            return (Criteria) this;
        }

        public Criteria andLinkUrlAddrLessThanOrEqualTo(String value) {
            addCriterion("TBA.LINK_URL_ADDR <=", value, "linkUrlAddr");
            return (Criteria) this;
        }

        public Criteria andLinkUrlAddrLike(String value) {
            addCriterion("TBA.LINK_URL_ADDR like", value, "linkUrlAddr");
            return (Criteria) this;
        }

        public Criteria andLinkUrlAddrNotLike(String value) {
            addCriterion("TBA.LINK_URL_ADDR not like", value, "linkUrlAddr");
            return (Criteria) this;
        }

        public Criteria andLinkUrlAddrIn(List<String> values) {
            addCriterion("TBA.LINK_URL_ADDR in", values, "linkUrlAddr");
            return (Criteria) this;
        }

        public Criteria andLinkUrlAddrNotIn(List<String> values) {
            addCriterion("TBA.LINK_URL_ADDR not in", values, "linkUrlAddr");
            return (Criteria) this;
        }

        public Criteria andLinkUrlAddrBetween(String value1, String value2) {
            addCriterion("TBA.LINK_URL_ADDR between", value1, value2, "linkUrlAddr");
            return (Criteria) this;
        }

        public Criteria andLinkUrlAddrNotBetween(String value1, String value2) {
            addCriterion("TBA.LINK_URL_ADDR not between", value1, value2, "linkUrlAddr");
            return (Criteria) this;
        }

        public Criteria andCate1CdIsNull() {
            addCriterion("TBA.CATE_1_CD is null");
            return (Criteria) this;
        }

        public Criteria andCate1CdIsNotNull() {
            addCriterion("TBA.CATE_1_CD is not null");
            return (Criteria) this;
        }

        public Criteria andCate1CdEqualTo(String value) {
            addCriterion("TBA.CATE_1_CD =", value, "cate1Cd");
            return (Criteria) this;
        }

        public Criteria andCate1CdNotEqualTo(String value) {
            addCriterion("TBA.CATE_1_CD <>", value, "cate1Cd");
            return (Criteria) this;
        }

        public Criteria andCate1CdGreaterThan(String value) {
            addCriterion("TBA.CATE_1_CD >", value, "cate1Cd");
            return (Criteria) this;
        }

        public Criteria andCate1CdGreaterThanOrEqualTo(String value) {
            addCriterion("TBA.CATE_1_CD >=", value, "cate1Cd");
            return (Criteria) this;
        }

        public Criteria andCate1CdLessThan(String value) {
            addCriterion("TBA.CATE_1_CD <", value, "cate1Cd");
            return (Criteria) this;
        }

        public Criteria andCate1CdLessThanOrEqualTo(String value) {
            addCriterion("TBA.CATE_1_CD <=", value, "cate1Cd");
            return (Criteria) this;
        }

        public Criteria andCate1CdLike(String value) {
            addCriterion("TBA.CATE_1_CD like", value, "cate1Cd");
            return (Criteria) this;
        }

        public Criteria andCate1CdNotLike(String value) {
            addCriterion("TBA.CATE_1_CD not like", value, "cate1Cd");
            return (Criteria) this;
        }

        public Criteria andCate1CdIn(List<String> values) {
            addCriterion("TBA.CATE_1_CD in", values, "cate1Cd");
            return (Criteria) this;
        }

        public Criteria andCate1CdNotIn(List<String> values) {
            addCriterion("TBA.CATE_1_CD not in", values, "cate1Cd");
            return (Criteria) this;
        }

        public Criteria andCate1CdBetween(String value1, String value2) {
            addCriterion("TBA.CATE_1_CD between", value1, value2, "cate1Cd");
            return (Criteria) this;
        }

        public Criteria andCate1CdNotBetween(String value1, String value2) {
            addCriterion("TBA.CATE_1_CD not between", value1, value2, "cate1Cd");
            return (Criteria) this;
        }

        public Criteria andCate2CdIsNull() {
            addCriterion("TBA.CATE_2_CD is null");
            return (Criteria) this;
        }

        public Criteria andCate2CdIsNotNull() {
            addCriterion("TBA.CATE_2_CD is not null");
            return (Criteria) this;
        }

        public Criteria andCate2CdEqualTo(String value) {
            addCriterion("TBA.CATE_2_CD =", value, "cate2Cd");
            return (Criteria) this;
        }

        public Criteria andCate2CdNotEqualTo(String value) {
            addCriterion("TBA.CATE_2_CD <>", value, "cate2Cd");
            return (Criteria) this;
        }

        public Criteria andCate2CdGreaterThan(String value) {
            addCriterion("TBA.CATE_2_CD >", value, "cate2Cd");
            return (Criteria) this;
        }

        public Criteria andCate2CdGreaterThanOrEqualTo(String value) {
            addCriterion("TBA.CATE_2_CD >=", value, "cate2Cd");
            return (Criteria) this;
        }

        public Criteria andCate2CdLessThan(String value) {
            addCriterion("TBA.CATE_2_CD <", value, "cate2Cd");
            return (Criteria) this;
        }

        public Criteria andCate2CdLessThanOrEqualTo(String value) {
            addCriterion("TBA.CATE_2_CD <=", value, "cate2Cd");
            return (Criteria) this;
        }

        public Criteria andCate2CdLike(String value) {
            addCriterion("TBA.CATE_2_CD like", value, "cate2Cd");
            return (Criteria) this;
        }

        public Criteria andCate2CdNotLike(String value) {
            addCriterion("TBA.CATE_2_CD not like", value, "cate2Cd");
            return (Criteria) this;
        }

        public Criteria andCate2CdIn(List<String> values) {
            addCriterion("TBA.CATE_2_CD in", values, "cate2Cd");
            return (Criteria) this;
        }

        public Criteria andCate2CdNotIn(List<String> values) {
            addCriterion("TBA.CATE_2_CD not in", values, "cate2Cd");
            return (Criteria) this;
        }

        public Criteria andCate2CdBetween(String value1, String value2) {
            addCriterion("TBA.CATE_2_CD between", value1, value2, "cate2Cd");
            return (Criteria) this;
        }

        public Criteria andCate2CdNotBetween(String value1, String value2) {
            addCriterion("TBA.CATE_2_CD not between", value1, value2, "cate2Cd");
            return (Criteria) this;
        }

        public Criteria andAtchGidIsNull() {
            addCriterion("TBA.ATCH_GID is null");
            return (Criteria) this;
        }

        public Criteria andAtchGidIsNotNull() {
            addCriterion("TBA.ATCH_GID is not null");
            return (Criteria) this;
        }

        public Criteria andAtchGidEqualTo(Integer value) {
            addCriterion("TBA.ATCH_GID =", value, "atchGid");
            return (Criteria) this;
        }

        public Criteria andAtchGidNotEqualTo(Integer value) {
            addCriterion("TBA.ATCH_GID <>", value, "atchGid");
            return (Criteria) this;
        }

        public Criteria andAtchGidGreaterThan(Integer value) {
            addCriterion("TBA.ATCH_GID >", value, "atchGid");
            return (Criteria) this;
        }

        public Criteria andAtchGidGreaterThanOrEqualTo(Integer value) {
            addCriterion("TBA.ATCH_GID >=", value, "atchGid");
            return (Criteria) this;
        }

        public Criteria andAtchGidLessThan(Integer value) {
            addCriterion("TBA.ATCH_GID <", value, "atchGid");
            return (Criteria) this;
        }

        public Criteria andAtchGidLessThanOrEqualTo(Integer value) {
            addCriterion("TBA.ATCH_GID <=", value, "atchGid");
            return (Criteria) this;
        }

        public Criteria andAtchGidIn(List<Integer> values) {
            addCriterion("TBA.ATCH_GID in", values, "atchGid");
            return (Criteria) this;
        }

        public Criteria andAtchGidNotIn(List<Integer> values) {
            addCriterion("TBA.ATCH_GID not in", values, "atchGid");
            return (Criteria) this;
        }

        public Criteria andAtchGidBetween(Integer value1, Integer value2) {
            addCriterion("TBA.ATCH_GID between", value1, value2, "atchGid");
            return (Criteria) this;
        }

        public Criteria andAtchGidNotBetween(Integer value1, Integer value2) {
            addCriterion("TBA.ATCH_GID not between", value1, value2, "atchGid");
            return (Criteria) this;
        }

        public Criteria andDpYnIsNull() {
            addCriterion("TBA.DP_YN is null");
            return (Criteria) this;
        }

        public Criteria andDpYnIsNotNull() {
            addCriterion("TBA.DP_YN is not null");
            return (Criteria) this;
        }

        public Criteria andDpYnEqualTo(String value) {
            addCriterion("TBA.DP_YN =", value, "dpYn");
            return (Criteria) this;
        }

        public Criteria andDpYnNotEqualTo(String value) {
            addCriterion("TBA.DP_YN <>", value, "dpYn");
            return (Criteria) this;
        }

        public Criteria andDpYnGreaterThan(String value) {
            addCriterion("TBA.DP_YN >", value, "dpYn");
            return (Criteria) this;
        }

        public Criteria andDpYnGreaterThanOrEqualTo(String value) {
            addCriterion("TBA.DP_YN >=", value, "dpYn");
            return (Criteria) this;
        }

        public Criteria andDpYnLessThan(String value) {
            addCriterion("TBA.DP_YN <", value, "dpYn");
            return (Criteria) this;
        }

        public Criteria andDpYnLessThanOrEqualTo(String value) {
            addCriterion("TBA.DP_YN <=", value, "dpYn");
            return (Criteria) this;
        }

        public Criteria andDpYnLike(String value) {
            addCriterion("TBA.DP_YN like", value, "dpYn");
            return (Criteria) this;
        }

        public Criteria andDpYnNotLike(String value) {
            addCriterion("TBA.DP_YN not like", value, "dpYn");
            return (Criteria) this;
        }

        public Criteria andDpYnIn(List<String> values) {
            addCriterion("TBA.DP_YN in", values, "dpYn");
            return (Criteria) this;
        }

        public Criteria andDpYnNotIn(List<String> values) {
            addCriterion("TBA.DP_YN not in", values, "dpYn");
            return (Criteria) this;
        }

        public Criteria andDpYnBetween(String value1, String value2) {
            addCriterion("TBA.DP_YN between", value1, value2, "dpYn");
            return (Criteria) this;
        }

        public Criteria andDpYnNotBetween(String value1, String value2) {
            addCriterion("TBA.DP_YN not between", value1, value2, "dpYn");
            return (Criteria) this;
        }

        public Criteria andDpStDtIsNull() {
            addCriterion("TBA.DP_ST_DT is null");
            return (Criteria) this;
        }

        public Criteria andDpStDtIsNotNull() {
            addCriterion("TBA.DP_ST_DT is not null");
            return (Criteria) this;
        }

        public Criteria andDpStDtEqualTo(Date value) {
            addCriterionForJDBCDate("TBA.DP_ST_DT =", value, "dpStDt");
            return (Criteria) this;
        }

        public Criteria andDpStDtNotEqualTo(Date value) {
            addCriterionForJDBCDate("TBA.DP_ST_DT <>", value, "dpStDt");
            return (Criteria) this;
        }

        public Criteria andDpStDtGreaterThan(Date value) {
            addCriterionForJDBCDate("TBA.DP_ST_DT >", value, "dpStDt");
            return (Criteria) this;
        }

        public Criteria andDpStDtGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("TBA.DP_ST_DT >=", value, "dpStDt");
            return (Criteria) this;
        }

        public Criteria andDpStDtLessThan(Date value) {
            addCriterionForJDBCDate("TBA.DP_ST_DT <", value, "dpStDt");
            return (Criteria) this;
        }

        public Criteria andDpStDtLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("TBA.DP_ST_DT <=", value, "dpStDt");
            return (Criteria) this;
        }

        public Criteria andDpStDtIn(List<Date> values) {
            addCriterionForJDBCDate("TBA.DP_ST_DT in", values, "dpStDt");
            return (Criteria) this;
        }

        public Criteria andDpStDtNotIn(List<Date> values) {
            addCriterionForJDBCDate("TBA.DP_ST_DT not in", values, "dpStDt");
            return (Criteria) this;
        }

        public Criteria andDpStDtBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("TBA.DP_ST_DT between", value1, value2, "dpStDt");
            return (Criteria) this;
        }

        public Criteria andDpStDtNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("TBA.DP_ST_DT not between", value1, value2, "dpStDt");
            return (Criteria) this;
        }

        public Criteria andDpEdDtIsNull() {
            addCriterion("TBA.DP_ED_DT is null");
            return (Criteria) this;
        }

        public Criteria andDpEdDtIsNotNull() {
            addCriterion("TBA.DP_ED_DT is not null");
            return (Criteria) this;
        }

        public Criteria andDpEdDtEqualTo(Date value) {
            addCriterionForJDBCDate("TBA.DP_ED_DT =", value, "dpEdDt");
            return (Criteria) this;
        }

        public Criteria andDpEdDtNotEqualTo(Date value) {
            addCriterionForJDBCDate("TBA.DP_ED_DT <>", value, "dpEdDt");
            return (Criteria) this;
        }

        public Criteria andDpEdDtGreaterThan(Date value) {
            addCriterionForJDBCDate("TBA.DP_ED_DT >", value, "dpEdDt");
            return (Criteria) this;
        }

        public Criteria andDpEdDtGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("TBA.DP_ED_DT >=", value, "dpEdDt");
            return (Criteria) this;
        }

        public Criteria andDpEdDtLessThan(Date value) {
            addCriterionForJDBCDate("TBA.DP_ED_DT <", value, "dpEdDt");
            return (Criteria) this;
        }

        public Criteria andDpEdDtLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("TBA.DP_ED_DT <=", value, "dpEdDt");
            return (Criteria) this;
        }

        public Criteria andDpEdDtIn(List<Date> values) {
            addCriterionForJDBCDate("TBA.DP_ED_DT in", values, "dpEdDt");
            return (Criteria) this;
        }

        public Criteria andDpEdDtNotIn(List<Date> values) {
            addCriterionForJDBCDate("TBA.DP_ED_DT not in", values, "dpEdDt");
            return (Criteria) this;
        }

        public Criteria andDpEdDtBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("TBA.DP_ED_DT between", value1, value2, "dpEdDt");
            return (Criteria) this;
        }

        public Criteria andDpEdDtNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("TBA.DP_ED_DT not between", value1, value2, "dpEdDt");
            return (Criteria) this;
        }

        public Criteria andReadCntIsNull() {
            addCriterion("TBA.READ_CNT is null");
            return (Criteria) this;
        }

        public Criteria andReadCntIsNotNull() {
            addCriterion("TBA.READ_CNT is not null");
            return (Criteria) this;
        }

        public Criteria andReadCntEqualTo(Integer value) {
            addCriterion("TBA.READ_CNT =", value, "readCnt");
            return (Criteria) this;
        }

        public Criteria andReadCntNotEqualTo(Integer value) {
            addCriterion("TBA.READ_CNT <>", value, "readCnt");
            return (Criteria) this;
        }

        public Criteria andReadCntGreaterThan(Integer value) {
            addCriterion("TBA.READ_CNT >", value, "readCnt");
            return (Criteria) this;
        }

        public Criteria andReadCntGreaterThanOrEqualTo(Integer value) {
            addCriterion("TBA.READ_CNT >=", value, "readCnt");
            return (Criteria) this;
        }

        public Criteria andReadCntLessThan(Integer value) {
            addCriterion("TBA.READ_CNT <", value, "readCnt");
            return (Criteria) this;
        }

        public Criteria andReadCntLessThanOrEqualTo(Integer value) {
            addCriterion("TBA.READ_CNT <=", value, "readCnt");
            return (Criteria) this;
        }

        public Criteria andReadCntIn(List<Integer> values) {
            addCriterion("TBA.READ_CNT in", values, "readCnt");
            return (Criteria) this;
        }

        public Criteria andReadCntNotIn(List<Integer> values) {
            addCriterion("TBA.READ_CNT not in", values, "readCnt");
            return (Criteria) this;
        }

        public Criteria andReadCntBetween(Integer value1, Integer value2) {
            addCriterion("TBA.READ_CNT between", value1, value2, "readCnt");
            return (Criteria) this;
        }

        public Criteria andReadCntNotBetween(Integer value1, Integer value2) {
            addCriterion("TBA.READ_CNT not between", value1, value2, "readCnt");
            return (Criteria) this;
        }

        public Criteria andSordIsNull() {
            addCriterion("TBA.SORD is null");
            return (Criteria) this;
        }

        public Criteria andSordIsNotNull() {
            addCriterion("TBA.SORD is not null");
            return (Criteria) this;
        }

        public Criteria andSordEqualTo(Integer value) {
            addCriterion("TBA.SORD =", value, "sord");
            return (Criteria) this;
        }

        public Criteria andSordNotEqualTo(Integer value) {
            addCriterion("TBA.SORD <>", value, "sord");
            return (Criteria) this;
        }

        public Criteria andSordGreaterThan(Integer value) {
            addCriterion("TBA.SORD >", value, "sord");
            return (Criteria) this;
        }

        public Criteria andSordGreaterThanOrEqualTo(Integer value) {
            addCriterion("TBA.SORD >=", value, "sord");
            return (Criteria) this;
        }

        public Criteria andSordLessThan(Integer value) {
            addCriterion("TBA.SORD <", value, "sord");
            return (Criteria) this;
        }

        public Criteria andSordLessThanOrEqualTo(Integer value) {
            addCriterion("TBA.SORD <=", value, "sord");
            return (Criteria) this;
        }

        public Criteria andSordIn(List<Integer> values) {
            addCriterion("TBA.SORD in", values, "sord");
            return (Criteria) this;
        }

        public Criteria andSordNotIn(List<Integer> values) {
            addCriterion("TBA.SORD not in", values, "sord");
            return (Criteria) this;
        }

        public Criteria andSordBetween(Integer value1, Integer value2) {
            addCriterion("TBA.SORD between", value1, value2, "sord");
            return (Criteria) this;
        }

        public Criteria andSordNotBetween(Integer value1, Integer value2) {
            addCriterion("TBA.SORD not between", value1, value2, "sord");
            return (Criteria) this;
        }

        public Criteria andRegDtIsNull() {
            addCriterion("TBA.REG_DT is null");
            return (Criteria) this;
        }

        public Criteria andRegDtIsNotNull() {
            addCriterion("TBA.REG_DT is not null");
            return (Criteria) this;
        }

        public Criteria andRegDtEqualTo(Date value) {
            addCriterion("TBA.REG_DT =", value, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtNotEqualTo(Date value) {
            addCriterion("TBA.REG_DT <>", value, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtGreaterThan(Date value) {
            addCriterion("TBA.REG_DT >", value, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtGreaterThanOrEqualTo(Date value) {
            addCriterion("TBA.REG_DT >=", value, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtLessThan(Date value) {
            addCriterion("TBA.REG_DT <", value, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtLessThanOrEqualTo(Date value) {
            addCriterion("TBA.REG_DT <=", value, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtIn(List<Date> values) {
            addCriterion("TBA.REG_DT in", values, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtNotIn(List<Date> values) {
            addCriterion("TBA.REG_DT not in", values, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtBetween(Date value1, Date value2) {
            addCriterion("TBA.REG_DT between", value1, value2, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtNotBetween(Date value1, Date value2) {
            addCriterion("TBA.REG_DT not between", value1, value2, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegIdIsNull() {
            addCriterion("TBA.REG_ID is null");
            return (Criteria) this;
        }

        public Criteria andRegIdIsNotNull() {
            addCriterion("TBA.REG_ID is not null");
            return (Criteria) this;
        }

        public Criteria andRegIdEqualTo(String value) {
            addCriterion("TBA.REG_ID =", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdNotEqualTo(String value) {
            addCriterion("TBA.REG_ID <>", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdGreaterThan(String value) {
            addCriterion("TBA.REG_ID >", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdGreaterThanOrEqualTo(String value) {
            addCriterion("TBA.REG_ID >=", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdLessThan(String value) {
            addCriterion("TBA.REG_ID <", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdLessThanOrEqualTo(String value) {
            addCriterion("TBA.REG_ID <=", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdLike(String value) {
            addCriterion("TBA.REG_ID like", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdNotLike(String value) {
            addCriterion("TBA.REG_ID not like", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdIn(List<String> values) {
            addCriterion("TBA.REG_ID in", values, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdNotIn(List<String> values) {
            addCriterion("TBA.REG_ID not in", values, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdBetween(String value1, String value2) {
            addCriterion("TBA.REG_ID between", value1, value2, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdNotBetween(String value1, String value2) {
            addCriterion("TBA.REG_ID not between", value1, value2, "regId");
            return (Criteria) this;
        }

        public Criteria andModDtIsNull() {
            addCriterion("TBA.MOD_DT is null");
            return (Criteria) this;
        }

        public Criteria andModDtIsNotNull() {
            addCriterion("TBA.MOD_DT is not null");
            return (Criteria) this;
        }

        public Criteria andModDtEqualTo(Date value) {
            addCriterion("TBA.MOD_DT =", value, "modDt");
            return (Criteria) this;
        }

        public Criteria andModDtNotEqualTo(Date value) {
            addCriterion("TBA.MOD_DT <>", value, "modDt");
            return (Criteria) this;
        }

        public Criteria andModDtGreaterThan(Date value) {
            addCriterion("TBA.MOD_DT >", value, "modDt");
            return (Criteria) this;
        }

        public Criteria andModDtGreaterThanOrEqualTo(Date value) {
            addCriterion("TBA.MOD_DT >=", value, "modDt");
            return (Criteria) this;
        }

        public Criteria andModDtLessThan(Date value) {
            addCriterion("TBA.MOD_DT <", value, "modDt");
            return (Criteria) this;
        }

        public Criteria andModDtLessThanOrEqualTo(Date value) {
            addCriterion("TBA.MOD_DT <=", value, "modDt");
            return (Criteria) this;
        }

        public Criteria andModDtIn(List<Date> values) {
            addCriterion("TBA.MOD_DT in", values, "modDt");
            return (Criteria) this;
        }

        public Criteria andModDtNotIn(List<Date> values) {
            addCriterion("TBA.MOD_DT not in", values, "modDt");
            return (Criteria) this;
        }

        public Criteria andModDtBetween(Date value1, Date value2) {
            addCriterion("TBA.MOD_DT between", value1, value2, "modDt");
            return (Criteria) this;
        }

        public Criteria andModDtNotBetween(Date value1, Date value2) {
            addCriterion("TBA.MOD_DT not between", value1, value2, "modDt");
            return (Criteria) this;
        }

        public Criteria andModIdIsNull() {
            addCriterion("TBA.MOD_ID is null");
            return (Criteria) this;
        }

        public Criteria andModIdIsNotNull() {
            addCriterion("TBA.MOD_ID is not null");
            return (Criteria) this;
        }

        public Criteria andModIdEqualTo(String value) {
            addCriterion("TBA.MOD_ID =", value, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdNotEqualTo(String value) {
            addCriterion("TBA.MOD_ID <>", value, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdGreaterThan(String value) {
            addCriterion("TBA.MOD_ID >", value, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdGreaterThanOrEqualTo(String value) {
            addCriterion("TBA.MOD_ID >=", value, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdLessThan(String value) {
            addCriterion("TBA.MOD_ID <", value, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdLessThanOrEqualTo(String value) {
            addCriterion("TBA.MOD_ID <=", value, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdLike(String value) {
            addCriterion("TBA.MOD_ID like", value, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdNotLike(String value) {
            addCriterion("TBA.MOD_ID not like", value, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdIn(List<String> values) {
            addCriterion("TBA.MOD_ID in", values, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdNotIn(List<String> values) {
            addCriterion("TBA.MOD_ID not in", values, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdBetween(String value1, String value2) {
            addCriterion("TBA.MOD_ID between", value1, value2, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdNotBetween(String value1, String value2) {
            addCriterion("TBA.MOD_ID not between", value1, value2, "modId");
            return (Criteria) this;
        }

        public Criteria andUseYnIsNull() {
            addCriterion("TBA.USE_YN is null");
            return (Criteria) this;
        }

        public Criteria andUseYnIsNotNull() {
            addCriterion("TBA.USE_YN is not null");
            return (Criteria) this;
        }

        public Criteria andUseYnEqualTo(String value) {
            addCriterion("TBA.USE_YN =", value, "useYn");
            return (Criteria) this;
        }

        public Criteria andUseYnNotEqualTo(String value) {
            addCriterion("TBA.USE_YN <>", value, "useYn");
            return (Criteria) this;
        }

        public Criteria andUseYnGreaterThan(String value) {
            addCriterion("TBA.USE_YN >", value, "useYn");
            return (Criteria) this;
        }

        public Criteria andUseYnGreaterThanOrEqualTo(String value) {
            addCriterion("TBA.USE_YN >=", value, "useYn");
            return (Criteria) this;
        }

        public Criteria andUseYnLessThan(String value) {
            addCriterion("TBA.USE_YN <", value, "useYn");
            return (Criteria) this;
        }

        public Criteria andUseYnLessThanOrEqualTo(String value) {
            addCriterion("TBA.USE_YN <=", value, "useYn");
            return (Criteria) this;
        }

        public Criteria andUseYnLike(String value) {
            addCriterion("TBA.USE_YN like", value, "useYn");
            return (Criteria) this;
        }

        public Criteria andUseYnNotLike(String value) {
            addCriterion("TBA.USE_YN not like", value, "useYn");
            return (Criteria) this;
        }

        public Criteria andUseYnIn(List<String> values) {
            addCriterion("TBA.USE_YN in", values, "useYn");
            return (Criteria) this;
        }

        public Criteria andUseYnNotIn(List<String> values) {
            addCriterion("TBA.USE_YN not in", values, "useYn");
            return (Criteria) this;
        }

        public Criteria andUseYnBetween(String value1, String value2) {
            addCriterion("TBA.USE_YN between", value1, value2, "useYn");
            return (Criteria) this;
        }

        public Criteria andUseYnNotBetween(String value1, String value2) {
            addCriterion("TBA.USE_YN not between", value1, value2, "useYn");
            return (Criteria) this;
        }

        public Criteria andBbsCdLikeInsensitive(String value) {
            addCriterion("upper(TBA.BBS_CD) like", value.toUpperCase(), "bbsCd");
            return (Criteria) this;
        }

        public Criteria andMbrIdLikeInsensitive(String value) {
            addCriterion("upper(TBA.MBR_ID) like", value.toUpperCase(), "mbrId");
            return (Criteria) this;
        }

        public Criteria andAdmIdLikeInsensitive(String value) {
            addCriterion("upper(TBA.ADM_ID) like", value.toUpperCase(), "admId");
            return (Criteria) this;
        }

        public Criteria andWrtrNmLikeInsensitive(String value) {
            addCriterion("upper(TBA.WRTR_NM) like", value.toUpperCase(), "wrtrNm");
            return (Criteria) this;
        }

        public Criteria andArtTitLikeInsensitive(String value) {
            addCriterion("upper(TBA.ART_TIT) like", value.toUpperCase(), "artTit");
            return (Criteria) this;
        }

        public Criteria andArtContLikeInsensitive(String value) {
            addCriterion("upper(TBA.ART_CONT) like", value.toUpperCase(), "artCont");
            return (Criteria) this;
        }

        public Criteria andLinkUrlAddrLikeInsensitive(String value) {
            addCriterion("upper(TBA.LINK_URL_ADDR) like", value.toUpperCase(), "linkUrlAddr");
            return (Criteria) this;
        }

        public Criteria andCate1CdLikeInsensitive(String value) {
            addCriterion("upper(TBA.CATE_1_CD) like", value.toUpperCase(), "cate1Cd");
            return (Criteria) this;
        }

        public Criteria andCate2CdLikeInsensitive(String value) {
            addCriterion("upper(TBA.CATE_2_CD) like", value.toUpperCase(), "cate2Cd");
            return (Criteria) this;
        }

        public Criteria andDpYnLikeInsensitive(String value) {
            addCriterion("upper(TBA.DP_YN) like", value.toUpperCase(), "dpYn");
            return (Criteria) this;
        }

        public Criteria andRegIdLikeInsensitive(String value) {
            addCriterion("upper(TBA.REG_ID) like", value.toUpperCase(), "regId");
            return (Criteria) this;
        }

        public Criteria andModIdLikeInsensitive(String value) {
            addCriterion("upper(TBA.MOD_ID) like", value.toUpperCase(), "modId");
            return (Criteria) this;
        }

        public Criteria andUseYnLikeInsensitive(String value) {
            addCriterion("upper(TBA.USE_YN) like", value.toUpperCase(), "useYn");
            return (Criteria) this;
        }

        public Criteria andBbsCdLikeLeft(String value) {
            addCriterion("TBA.BBS_CD like ", "%" + value, "bbsCd");
            return (Criteria) this;
        }

        public Criteria andBbsCdLikeRight(String value) {
            addCriterion("TBA.BBS_CD like ", value + "%", "bbsCd");
            return (Criteria) this;
        }

        public Criteria andBbsCdLikeBoth(String value) {
            addCriterion("TBA.BBS_CD like ", "%" + value + "%", "bbsCd");
            return (Criteria) this;
        }

        public Criteria andMbrIdLikeLeft(String value) {
            addCriterion("TBA.MBR_ID like ", "%" + value, "mbrId");
            return (Criteria) this;
        }

        public Criteria andMbrIdLikeRight(String value) {
            addCriterion("TBA.MBR_ID like ", value + "%", "mbrId");
            return (Criteria) this;
        }

        public Criteria andMbrIdLikeBoth(String value) {
            addCriterion("TBA.MBR_ID like ", "%" + value + "%", "mbrId");
            return (Criteria) this;
        }

        public Criteria andAdmIdLikeLeft(String value) {
            addCriterion("TBA.ADM_ID like ", "%" + value, "admId");
            return (Criteria) this;
        }

        public Criteria andAdmIdLikeRight(String value) {
            addCriterion("TBA.ADM_ID like ", value + "%", "admId");
            return (Criteria) this;
        }

        public Criteria andAdmIdLikeBoth(String value) {
            addCriterion("TBA.ADM_ID like ", "%" + value + "%", "admId");
            return (Criteria) this;
        }

        public Criteria andWrtrNmLikeLeft(String value) {
            addCriterion("TBA.WRTR_NM like ", "%" + value, "wrtrNm");
            return (Criteria) this;
        }

        public Criteria andWrtrNmLikeRight(String value) {
            addCriterion("TBA.WRTR_NM like ", value + "%", "wrtrNm");
            return (Criteria) this;
        }

        public Criteria andWrtrNmLikeBoth(String value) {
            addCriterion("TBA.WRTR_NM like ", "%" + value + "%", "wrtrNm");
            return (Criteria) this;
        }

        public Criteria andArtTitLikeLeft(String value) {
            addCriterion("TBA.ART_TIT like ", "%" + value, "artTit");
            return (Criteria) this;
        }

        public Criteria andArtTitLikeRight(String value) {
            addCriterion("TBA.ART_TIT like ", value + "%", "artTit");
            return (Criteria) this;
        }

        public Criteria andArtTitLikeBoth(String value) {
            addCriterion("TBA.ART_TIT like ", "%" + value + "%", "artTit");
            return (Criteria) this;
        }

        public Criteria andArtContLikeLeft(String value) {
            addCriterion("TBA.ART_CONT like ", "%" + value, "artCont");
            return (Criteria) this;
        }

        public Criteria andArtContLikeRight(String value) {
            addCriterion("TBA.ART_CONT like ", value + "%", "artCont");
            return (Criteria) this;
        }

        public Criteria andArtContLikeBoth(String value) {
            addCriterion("TBA.ART_CONT like ", "%" + value + "%", "artCont");
            return (Criteria) this;
        }

        public Criteria andLinkUrlAddrLikeLeft(String value) {
            addCriterion("TBA.LINK_URL_ADDR like ", "%" + value, "linkUrlAddr");
            return (Criteria) this;
        }

        public Criteria andLinkUrlAddrLikeRight(String value) {
            addCriterion("TBA.LINK_URL_ADDR like ", value + "%", "linkUrlAddr");
            return (Criteria) this;
        }

        public Criteria andLinkUrlAddrLikeBoth(String value) {
            addCriterion("TBA.LINK_URL_ADDR like ", "%" + value + "%", "linkUrlAddr");
            return (Criteria) this;
        }

        public Criteria andCate1CdLikeLeft(String value) {
            addCriterion("TBA.CATE_1_CD like ", "%" + value, "cate1Cd");
            return (Criteria) this;
        }

        public Criteria andCate1CdLikeRight(String value) {
            addCriterion("TBA.CATE_1_CD like ", value + "%", "cate1Cd");
            return (Criteria) this;
        }

        public Criteria andCate1CdLikeBoth(String value) {
            addCriterion("TBA.CATE_1_CD like ", "%" + value + "%", "cate1Cd");
            return (Criteria) this;
        }

        public Criteria andCate2CdLikeLeft(String value) {
            addCriterion("TBA.CATE_2_CD like ", "%" + value, "cate2Cd");
            return (Criteria) this;
        }

        public Criteria andCate2CdLikeRight(String value) {
            addCriterion("TBA.CATE_2_CD like ", value + "%", "cate2Cd");
            return (Criteria) this;
        }

        public Criteria andCate2CdLikeBoth(String value) {
            addCriterion("TBA.CATE_2_CD like ", "%" + value + "%", "cate2Cd");
            return (Criteria) this;
        }

        public Criteria andDpYnLikeLeft(String value) {
            addCriterion("TBA.DP_YN like ", "%" + value, "dpYn");
            return (Criteria) this;
        }

        public Criteria andDpYnLikeRight(String value) {
            addCriterion("TBA.DP_YN like ", value + "%", "dpYn");
            return (Criteria) this;
        }

        public Criteria andDpYnLikeBoth(String value) {
            addCriterion("TBA.DP_YN like ", "%" + value + "%", "dpYn");
            return (Criteria) this;
        }

        public Criteria andRegIdLikeLeft(String value) {
            addCriterion("TBA.REG_ID like ", "%" + value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdLikeRight(String value) {
            addCriterion("TBA.REG_ID like ", value + "%", "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdLikeBoth(String value) {
            addCriterion("TBA.REG_ID like ", "%" + value + "%", "regId");
            return (Criteria) this;
        }

        public Criteria andModIdLikeLeft(String value) {
            addCriterion("TBA.MOD_ID like ", "%" + value, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdLikeRight(String value) {
            addCriterion("TBA.MOD_ID like ", value + "%", "modId");
            return (Criteria) this;
        }

        public Criteria andModIdLikeBoth(String value) {
            addCriterion("TBA.MOD_ID like ", "%" + value + "%", "modId");
            return (Criteria) this;
        }

        public Criteria andUseYnLikeLeft(String value) {
            addCriterion("TBA.USE_YN like ", "%" + value, "useYn");
            return (Criteria) this;
        }

        public Criteria andUseYnLikeRight(String value) {
            addCriterion("TBA.USE_YN like ", value + "%", "useYn");
            return (Criteria) this;
        }

        public Criteria andUseYnLikeBoth(String value) {
            addCriterion("TBA.USE_YN like ", "%" + value + "%", "useYn");
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