package com.mushbird.sinsege.base.module.system.model.entity.criteria;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AttachEntityCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    public AttachEntityCriteria() {
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

        public Criteria andAtchIdIsNull() {
            addCriterion("TATC.ATCH_ID is null");
            return (Criteria) this;
        }

        public Criteria andAtchIdIsNotNull() {
            addCriterion("TATC.ATCH_ID is not null");
            return (Criteria) this;
        }

        public Criteria andAtchIdEqualTo(Integer value) {
            addCriterion("TATC.ATCH_ID =", value, "atchId");
            return (Criteria) this;
        }

        public Criteria andAtchIdNotEqualTo(Integer value) {
            addCriterion("TATC.ATCH_ID <>", value, "atchId");
            return (Criteria) this;
        }

        public Criteria andAtchIdGreaterThan(Integer value) {
            addCriterion("TATC.ATCH_ID >", value, "atchId");
            return (Criteria) this;
        }

        public Criteria andAtchIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("TATC.ATCH_ID >=", value, "atchId");
            return (Criteria) this;
        }

        public Criteria andAtchIdLessThan(Integer value) {
            addCriterion("TATC.ATCH_ID <", value, "atchId");
            return (Criteria) this;
        }

        public Criteria andAtchIdLessThanOrEqualTo(Integer value) {
            addCriterion("TATC.ATCH_ID <=", value, "atchId");
            return (Criteria) this;
        }

        public Criteria andAtchIdIn(List<Integer> values) {
            addCriterion("TATC.ATCH_ID in", values, "atchId");
            return (Criteria) this;
        }

        public Criteria andAtchIdNotIn(List<Integer> values) {
            addCriterion("TATC.ATCH_ID not in", values, "atchId");
            return (Criteria) this;
        }

        public Criteria andAtchIdBetween(Integer value1, Integer value2) {
            addCriterion("TATC.ATCH_ID between", value1, value2, "atchId");
            return (Criteria) this;
        }

        public Criteria andAtchIdNotBetween(Integer value1, Integer value2) {
            addCriterion("TATC.ATCH_ID not between", value1, value2, "atchId");
            return (Criteria) this;
        }

        public Criteria andAtchGidIsNull() {
            addCriterion("TATC.ATCH_GID is null");
            return (Criteria) this;
        }

        public Criteria andAtchGidIsNotNull() {
            addCriterion("TATC.ATCH_GID is not null");
            return (Criteria) this;
        }

        public Criteria andAtchGidEqualTo(Integer value) {
            addCriterion("TATC.ATCH_GID =", value, "atchGid");
            return (Criteria) this;
        }

        public Criteria andAtchGidNotEqualTo(Integer value) {
            addCriterion("TATC.ATCH_GID <>", value, "atchGid");
            return (Criteria) this;
        }

        public Criteria andAtchGidGreaterThan(Integer value) {
            addCriterion("TATC.ATCH_GID >", value, "atchGid");
            return (Criteria) this;
        }

        public Criteria andAtchGidGreaterThanOrEqualTo(Integer value) {
            addCriterion("TATC.ATCH_GID >=", value, "atchGid");
            return (Criteria) this;
        }

        public Criteria andAtchGidLessThan(Integer value) {
            addCriterion("TATC.ATCH_GID <", value, "atchGid");
            return (Criteria) this;
        }

        public Criteria andAtchGidLessThanOrEqualTo(Integer value) {
            addCriterion("TATC.ATCH_GID <=", value, "atchGid");
            return (Criteria) this;
        }

        public Criteria andAtchGidIn(List<Integer> values) {
            addCriterion("TATC.ATCH_GID in", values, "atchGid");
            return (Criteria) this;
        }

        public Criteria andAtchGidNotIn(List<Integer> values) {
            addCriterion("TATC.ATCH_GID not in", values, "atchGid");
            return (Criteria) this;
        }

        public Criteria andAtchGidBetween(Integer value1, Integer value2) {
            addCriterion("TATC.ATCH_GID between", value1, value2, "atchGid");
            return (Criteria) this;
        }

        public Criteria andAtchGidNotBetween(Integer value1, Integer value2) {
            addCriterion("TATC.ATCH_GID not between", value1, value2, "atchGid");
            return (Criteria) this;
        }

        public Criteria andMbrIdIsNull() {
            addCriterion("TATC.MBR_ID is null");
            return (Criteria) this;
        }

        public Criteria andMbrIdIsNotNull() {
            addCriterion("TATC.MBR_ID is not null");
            return (Criteria) this;
        }

        public Criteria andMbrIdEqualTo(String value) {
            addCriterion("TATC.MBR_ID =", value, "mbrId");
            return (Criteria) this;
        }

        public Criteria andMbrIdNotEqualTo(String value) {
            addCriterion("TATC.MBR_ID <>", value, "mbrId");
            return (Criteria) this;
        }

        public Criteria andMbrIdGreaterThan(String value) {
            addCriterion("TATC.MBR_ID >", value, "mbrId");
            return (Criteria) this;
        }

        public Criteria andMbrIdGreaterThanOrEqualTo(String value) {
            addCriterion("TATC.MBR_ID >=", value, "mbrId");
            return (Criteria) this;
        }

        public Criteria andMbrIdLessThan(String value) {
            addCriterion("TATC.MBR_ID <", value, "mbrId");
            return (Criteria) this;
        }

        public Criteria andMbrIdLessThanOrEqualTo(String value) {
            addCriterion("TATC.MBR_ID <=", value, "mbrId");
            return (Criteria) this;
        }

        public Criteria andMbrIdLike(String value) {
            addCriterion("TATC.MBR_ID like", value, "mbrId");
            return (Criteria) this;
        }

        public Criteria andMbrIdNotLike(String value) {
            addCriterion("TATC.MBR_ID not like", value, "mbrId");
            return (Criteria) this;
        }

        public Criteria andMbrIdIn(List<String> values) {
            addCriterion("TATC.MBR_ID in", values, "mbrId");
            return (Criteria) this;
        }

        public Criteria andMbrIdNotIn(List<String> values) {
            addCriterion("TATC.MBR_ID not in", values, "mbrId");
            return (Criteria) this;
        }

        public Criteria andMbrIdBetween(String value1, String value2) {
            addCriterion("TATC.MBR_ID between", value1, value2, "mbrId");
            return (Criteria) this;
        }

        public Criteria andMbrIdNotBetween(String value1, String value2) {
            addCriterion("TATC.MBR_ID not between", value1, value2, "mbrId");
            return (Criteria) this;
        }

        public Criteria andAdmIdIsNull() {
            addCriterion("TATC.ADM_ID is null");
            return (Criteria) this;
        }

        public Criteria andAdmIdIsNotNull() {
            addCriterion("TATC.ADM_ID is not null");
            return (Criteria) this;
        }

        public Criteria andAdmIdEqualTo(String value) {
            addCriterion("TATC.ADM_ID =", value, "admId");
            return (Criteria) this;
        }

        public Criteria andAdmIdNotEqualTo(String value) {
            addCriterion("TATC.ADM_ID <>", value, "admId");
            return (Criteria) this;
        }

        public Criteria andAdmIdGreaterThan(String value) {
            addCriterion("TATC.ADM_ID >", value, "admId");
            return (Criteria) this;
        }

        public Criteria andAdmIdGreaterThanOrEqualTo(String value) {
            addCriterion("TATC.ADM_ID >=", value, "admId");
            return (Criteria) this;
        }

        public Criteria andAdmIdLessThan(String value) {
            addCriterion("TATC.ADM_ID <", value, "admId");
            return (Criteria) this;
        }

        public Criteria andAdmIdLessThanOrEqualTo(String value) {
            addCriterion("TATC.ADM_ID <=", value, "admId");
            return (Criteria) this;
        }

        public Criteria andAdmIdLike(String value) {
            addCriterion("TATC.ADM_ID like", value, "admId");
            return (Criteria) this;
        }

        public Criteria andAdmIdNotLike(String value) {
            addCriterion("TATC.ADM_ID not like", value, "admId");
            return (Criteria) this;
        }

        public Criteria andAdmIdIn(List<String> values) {
            addCriterion("TATC.ADM_ID in", values, "admId");
            return (Criteria) this;
        }

        public Criteria andAdmIdNotIn(List<String> values) {
            addCriterion("TATC.ADM_ID not in", values, "admId");
            return (Criteria) this;
        }

        public Criteria andAdmIdBetween(String value1, String value2) {
            addCriterion("TATC.ADM_ID between", value1, value2, "admId");
            return (Criteria) this;
        }

        public Criteria andAdmIdNotBetween(String value1, String value2) {
            addCriterion("TATC.ADM_ID not between", value1, value2, "admId");
            return (Criteria) this;
        }

        public Criteria andAtchClCdIsNull() {
            addCriterion("TATC.ATCH_CL_CD is null");
            return (Criteria) this;
        }

        public Criteria andAtchClCdIsNotNull() {
            addCriterion("TATC.ATCH_CL_CD is not null");
            return (Criteria) this;
        }

        public Criteria andAtchClCdEqualTo(String value) {
            addCriterion("TATC.ATCH_CL_CD =", value, "atchClCd");
            return (Criteria) this;
        }

        public Criteria andAtchClCdNotEqualTo(String value) {
            addCriterion("TATC.ATCH_CL_CD <>", value, "atchClCd");
            return (Criteria) this;
        }

        public Criteria andAtchClCdGreaterThan(String value) {
            addCriterion("TATC.ATCH_CL_CD >", value, "atchClCd");
            return (Criteria) this;
        }

        public Criteria andAtchClCdGreaterThanOrEqualTo(String value) {
            addCriterion("TATC.ATCH_CL_CD >=", value, "atchClCd");
            return (Criteria) this;
        }

        public Criteria andAtchClCdLessThan(String value) {
            addCriterion("TATC.ATCH_CL_CD <", value, "atchClCd");
            return (Criteria) this;
        }

        public Criteria andAtchClCdLessThanOrEqualTo(String value) {
            addCriterion("TATC.ATCH_CL_CD <=", value, "atchClCd");
            return (Criteria) this;
        }

        public Criteria andAtchClCdLike(String value) {
            addCriterion("TATC.ATCH_CL_CD like", value, "atchClCd");
            return (Criteria) this;
        }

        public Criteria andAtchClCdNotLike(String value) {
            addCriterion("TATC.ATCH_CL_CD not like", value, "atchClCd");
            return (Criteria) this;
        }

        public Criteria andAtchClCdIn(List<String> values) {
            addCriterion("TATC.ATCH_CL_CD in", values, "atchClCd");
            return (Criteria) this;
        }

        public Criteria andAtchClCdNotIn(List<String> values) {
            addCriterion("TATC.ATCH_CL_CD not in", values, "atchClCd");
            return (Criteria) this;
        }

        public Criteria andAtchClCdBetween(String value1, String value2) {
            addCriterion("TATC.ATCH_CL_CD between", value1, value2, "atchClCd");
            return (Criteria) this;
        }

        public Criteria andAtchClCdNotBetween(String value1, String value2) {
            addCriterion("TATC.ATCH_CL_CD not between", value1, value2, "atchClCd");
            return (Criteria) this;
        }

        public Criteria andFileNmIsNull() {
            addCriterion("TATC.FILE_NM is null");
            return (Criteria) this;
        }

        public Criteria andFileNmIsNotNull() {
            addCriterion("TATC.FILE_NM is not null");
            return (Criteria) this;
        }

        public Criteria andFileNmEqualTo(String value) {
            addCriterion("TATC.FILE_NM =", value, "fileNm");
            return (Criteria) this;
        }

        public Criteria andFileNmNotEqualTo(String value) {
            addCriterion("TATC.FILE_NM <>", value, "fileNm");
            return (Criteria) this;
        }

        public Criteria andFileNmGreaterThan(String value) {
            addCriterion("TATC.FILE_NM >", value, "fileNm");
            return (Criteria) this;
        }

        public Criteria andFileNmGreaterThanOrEqualTo(String value) {
            addCriterion("TATC.FILE_NM >=", value, "fileNm");
            return (Criteria) this;
        }

        public Criteria andFileNmLessThan(String value) {
            addCriterion("TATC.FILE_NM <", value, "fileNm");
            return (Criteria) this;
        }

        public Criteria andFileNmLessThanOrEqualTo(String value) {
            addCriterion("TATC.FILE_NM <=", value, "fileNm");
            return (Criteria) this;
        }

        public Criteria andFileNmLike(String value) {
            addCriterion("TATC.FILE_NM like", value, "fileNm");
            return (Criteria) this;
        }

        public Criteria andFileNmNotLike(String value) {
            addCriterion("TATC.FILE_NM not like", value, "fileNm");
            return (Criteria) this;
        }

        public Criteria andFileNmIn(List<String> values) {
            addCriterion("TATC.FILE_NM in", values, "fileNm");
            return (Criteria) this;
        }

        public Criteria andFileNmNotIn(List<String> values) {
            addCriterion("TATC.FILE_NM not in", values, "fileNm");
            return (Criteria) this;
        }

        public Criteria andFileNmBetween(String value1, String value2) {
            addCriterion("TATC.FILE_NM between", value1, value2, "fileNm");
            return (Criteria) this;
        }

        public Criteria andFileNmNotBetween(String value1, String value2) {
            addCriterion("TATC.FILE_NM not between", value1, value2, "fileNm");
            return (Criteria) this;
        }

        public Criteria andFilePathIsNull() {
            addCriterion("TATC.FILE_PATH is null");
            return (Criteria) this;
        }

        public Criteria andFilePathIsNotNull() {
            addCriterion("TATC.FILE_PATH is not null");
            return (Criteria) this;
        }

        public Criteria andFilePathEqualTo(String value) {
            addCriterion("TATC.FILE_PATH =", value, "filePath");
            return (Criteria) this;
        }

        public Criteria andFilePathNotEqualTo(String value) {
            addCriterion("TATC.FILE_PATH <>", value, "filePath");
            return (Criteria) this;
        }

        public Criteria andFilePathGreaterThan(String value) {
            addCriterion("TATC.FILE_PATH >", value, "filePath");
            return (Criteria) this;
        }

        public Criteria andFilePathGreaterThanOrEqualTo(String value) {
            addCriterion("TATC.FILE_PATH >=", value, "filePath");
            return (Criteria) this;
        }

        public Criteria andFilePathLessThan(String value) {
            addCriterion("TATC.FILE_PATH <", value, "filePath");
            return (Criteria) this;
        }

        public Criteria andFilePathLessThanOrEqualTo(String value) {
            addCriterion("TATC.FILE_PATH <=", value, "filePath");
            return (Criteria) this;
        }

        public Criteria andFilePathLike(String value) {
            addCriterion("TATC.FILE_PATH like", value, "filePath");
            return (Criteria) this;
        }

        public Criteria andFilePathNotLike(String value) {
            addCriterion("TATC.FILE_PATH not like", value, "filePath");
            return (Criteria) this;
        }

        public Criteria andFilePathIn(List<String> values) {
            addCriterion("TATC.FILE_PATH in", values, "filePath");
            return (Criteria) this;
        }

        public Criteria andFilePathNotIn(List<String> values) {
            addCriterion("TATC.FILE_PATH not in", values, "filePath");
            return (Criteria) this;
        }

        public Criteria andFilePathBetween(String value1, String value2) {
            addCriterion("TATC.FILE_PATH between", value1, value2, "filePath");
            return (Criteria) this;
        }

        public Criteria andFilePathNotBetween(String value1, String value2) {
            addCriterion("TATC.FILE_PATH not between", value1, value2, "filePath");
            return (Criteria) this;
        }

        public Criteria andFileExtIsNull() {
            addCriterion("TATC.FILE_EXT is null");
            return (Criteria) this;
        }

        public Criteria andFileExtIsNotNull() {
            addCriterion("TATC.FILE_EXT is not null");
            return (Criteria) this;
        }

        public Criteria andFileExtEqualTo(String value) {
            addCriterion("TATC.FILE_EXT =", value, "fileExt");
            return (Criteria) this;
        }

        public Criteria andFileExtNotEqualTo(String value) {
            addCriterion("TATC.FILE_EXT <>", value, "fileExt");
            return (Criteria) this;
        }

        public Criteria andFileExtGreaterThan(String value) {
            addCriterion("TATC.FILE_EXT >", value, "fileExt");
            return (Criteria) this;
        }

        public Criteria andFileExtGreaterThanOrEqualTo(String value) {
            addCriterion("TATC.FILE_EXT >=", value, "fileExt");
            return (Criteria) this;
        }

        public Criteria andFileExtLessThan(String value) {
            addCriterion("TATC.FILE_EXT <", value, "fileExt");
            return (Criteria) this;
        }

        public Criteria andFileExtLessThanOrEqualTo(String value) {
            addCriterion("TATC.FILE_EXT <=", value, "fileExt");
            return (Criteria) this;
        }

        public Criteria andFileExtLike(String value) {
            addCriterion("TATC.FILE_EXT like", value, "fileExt");
            return (Criteria) this;
        }

        public Criteria andFileExtNotLike(String value) {
            addCriterion("TATC.FILE_EXT not like", value, "fileExt");
            return (Criteria) this;
        }

        public Criteria andFileExtIn(List<String> values) {
            addCriterion("TATC.FILE_EXT in", values, "fileExt");
            return (Criteria) this;
        }

        public Criteria andFileExtNotIn(List<String> values) {
            addCriterion("TATC.FILE_EXT not in", values, "fileExt");
            return (Criteria) this;
        }

        public Criteria andFileExtBetween(String value1, String value2) {
            addCriterion("TATC.FILE_EXT between", value1, value2, "fileExt");
            return (Criteria) this;
        }

        public Criteria andFileExtNotBetween(String value1, String value2) {
            addCriterion("TATC.FILE_EXT not between", value1, value2, "fileExt");
            return (Criteria) this;
        }

        public Criteria andFileTpValIsNull() {
            addCriterion("TATC.FILE_TP_VAL is null");
            return (Criteria) this;
        }

        public Criteria andFileTpValIsNotNull() {
            addCriterion("TATC.FILE_TP_VAL is not null");
            return (Criteria) this;
        }

        public Criteria andFileTpValEqualTo(String value) {
            addCriterion("TATC.FILE_TP_VAL =", value, "fileTpVal");
            return (Criteria) this;
        }

        public Criteria andFileTpValNotEqualTo(String value) {
            addCriterion("TATC.FILE_TP_VAL <>", value, "fileTpVal");
            return (Criteria) this;
        }

        public Criteria andFileTpValGreaterThan(String value) {
            addCriterion("TATC.FILE_TP_VAL >", value, "fileTpVal");
            return (Criteria) this;
        }

        public Criteria andFileTpValGreaterThanOrEqualTo(String value) {
            addCriterion("TATC.FILE_TP_VAL >=", value, "fileTpVal");
            return (Criteria) this;
        }

        public Criteria andFileTpValLessThan(String value) {
            addCriterion("TATC.FILE_TP_VAL <", value, "fileTpVal");
            return (Criteria) this;
        }

        public Criteria andFileTpValLessThanOrEqualTo(String value) {
            addCriterion("TATC.FILE_TP_VAL <=", value, "fileTpVal");
            return (Criteria) this;
        }

        public Criteria andFileTpValLike(String value) {
            addCriterion("TATC.FILE_TP_VAL like", value, "fileTpVal");
            return (Criteria) this;
        }

        public Criteria andFileTpValNotLike(String value) {
            addCriterion("TATC.FILE_TP_VAL not like", value, "fileTpVal");
            return (Criteria) this;
        }

        public Criteria andFileTpValIn(List<String> values) {
            addCriterion("TATC.FILE_TP_VAL in", values, "fileTpVal");
            return (Criteria) this;
        }

        public Criteria andFileTpValNotIn(List<String> values) {
            addCriterion("TATC.FILE_TP_VAL not in", values, "fileTpVal");
            return (Criteria) this;
        }

        public Criteria andFileTpValBetween(String value1, String value2) {
            addCriterion("TATC.FILE_TP_VAL between", value1, value2, "fileTpVal");
            return (Criteria) this;
        }

        public Criteria andFileTpValNotBetween(String value1, String value2) {
            addCriterion("TATC.FILE_TP_VAL not between", value1, value2, "fileTpVal");
            return (Criteria) this;
        }

        public Criteria andOriFileNmIsNull() {
            addCriterion("TATC.ORI_FILE_NM is null");
            return (Criteria) this;
        }

        public Criteria andOriFileNmIsNotNull() {
            addCriterion("TATC.ORI_FILE_NM is not null");
            return (Criteria) this;
        }

        public Criteria andOriFileNmEqualTo(String value) {
            addCriterion("TATC.ORI_FILE_NM =", value, "oriFileNm");
            return (Criteria) this;
        }

        public Criteria andOriFileNmNotEqualTo(String value) {
            addCriterion("TATC.ORI_FILE_NM <>", value, "oriFileNm");
            return (Criteria) this;
        }

        public Criteria andOriFileNmGreaterThan(String value) {
            addCriterion("TATC.ORI_FILE_NM >", value, "oriFileNm");
            return (Criteria) this;
        }

        public Criteria andOriFileNmGreaterThanOrEqualTo(String value) {
            addCriterion("TATC.ORI_FILE_NM >=", value, "oriFileNm");
            return (Criteria) this;
        }

        public Criteria andOriFileNmLessThan(String value) {
            addCriterion("TATC.ORI_FILE_NM <", value, "oriFileNm");
            return (Criteria) this;
        }

        public Criteria andOriFileNmLessThanOrEqualTo(String value) {
            addCriterion("TATC.ORI_FILE_NM <=", value, "oriFileNm");
            return (Criteria) this;
        }

        public Criteria andOriFileNmLike(String value) {
            addCriterion("TATC.ORI_FILE_NM like", value, "oriFileNm");
            return (Criteria) this;
        }

        public Criteria andOriFileNmNotLike(String value) {
            addCriterion("TATC.ORI_FILE_NM not like", value, "oriFileNm");
            return (Criteria) this;
        }

        public Criteria andOriFileNmIn(List<String> values) {
            addCriterion("TATC.ORI_FILE_NM in", values, "oriFileNm");
            return (Criteria) this;
        }

        public Criteria andOriFileNmNotIn(List<String> values) {
            addCriterion("TATC.ORI_FILE_NM not in", values, "oriFileNm");
            return (Criteria) this;
        }

        public Criteria andOriFileNmBetween(String value1, String value2) {
            addCriterion("TATC.ORI_FILE_NM between", value1, value2, "oriFileNm");
            return (Criteria) this;
        }

        public Criteria andOriFileNmNotBetween(String value1, String value2) {
            addCriterion("TATC.ORI_FILE_NM not between", value1, value2, "oriFileNm");
            return (Criteria) this;
        }

        public Criteria andFileSizeIsNull() {
            addCriterion("TATC.FILE_SIZE is null");
            return (Criteria) this;
        }

        public Criteria andFileSizeIsNotNull() {
            addCriterion("TATC.FILE_SIZE is not null");
            return (Criteria) this;
        }

        public Criteria andFileSizeEqualTo(BigDecimal value) {
            addCriterion("TATC.FILE_SIZE =", value, "fileSize");
            return (Criteria) this;
        }

        public Criteria andFileSizeNotEqualTo(BigDecimal value) {
            addCriterion("TATC.FILE_SIZE <>", value, "fileSize");
            return (Criteria) this;
        }

        public Criteria andFileSizeGreaterThan(BigDecimal value) {
            addCriterion("TATC.FILE_SIZE >", value, "fileSize");
            return (Criteria) this;
        }

        public Criteria andFileSizeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("TATC.FILE_SIZE >=", value, "fileSize");
            return (Criteria) this;
        }

        public Criteria andFileSizeLessThan(BigDecimal value) {
            addCriterion("TATC.FILE_SIZE <", value, "fileSize");
            return (Criteria) this;
        }

        public Criteria andFileSizeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("TATC.FILE_SIZE <=", value, "fileSize");
            return (Criteria) this;
        }

        public Criteria andFileSizeIn(List<BigDecimal> values) {
            addCriterion("TATC.FILE_SIZE in", values, "fileSize");
            return (Criteria) this;
        }

        public Criteria andFileSizeNotIn(List<BigDecimal> values) {
            addCriterion("TATC.FILE_SIZE not in", values, "fileSize");
            return (Criteria) this;
        }

        public Criteria andFileSizeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TATC.FILE_SIZE between", value1, value2, "fileSize");
            return (Criteria) this;
        }

        public Criteria andFileSizeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TATC.FILE_SIZE not between", value1, value2, "fileSize");
            return (Criteria) this;
        }

        public Criteria andImgWdthSizeIsNull() {
            addCriterion("TATC.IMG_WDTH_SIZE is null");
            return (Criteria) this;
        }

        public Criteria andImgWdthSizeIsNotNull() {
            addCriterion("TATC.IMG_WDTH_SIZE is not null");
            return (Criteria) this;
        }

        public Criteria andImgWdthSizeEqualTo(Integer value) {
            addCriterion("TATC.IMG_WDTH_SIZE =", value, "imgWdthSize");
            return (Criteria) this;
        }

        public Criteria andImgWdthSizeNotEqualTo(Integer value) {
            addCriterion("TATC.IMG_WDTH_SIZE <>", value, "imgWdthSize");
            return (Criteria) this;
        }

        public Criteria andImgWdthSizeGreaterThan(Integer value) {
            addCriterion("TATC.IMG_WDTH_SIZE >", value, "imgWdthSize");
            return (Criteria) this;
        }

        public Criteria andImgWdthSizeGreaterThanOrEqualTo(Integer value) {
            addCriterion("TATC.IMG_WDTH_SIZE >=", value, "imgWdthSize");
            return (Criteria) this;
        }

        public Criteria andImgWdthSizeLessThan(Integer value) {
            addCriterion("TATC.IMG_WDTH_SIZE <", value, "imgWdthSize");
            return (Criteria) this;
        }

        public Criteria andImgWdthSizeLessThanOrEqualTo(Integer value) {
            addCriterion("TATC.IMG_WDTH_SIZE <=", value, "imgWdthSize");
            return (Criteria) this;
        }

        public Criteria andImgWdthSizeIn(List<Integer> values) {
            addCriterion("TATC.IMG_WDTH_SIZE in", values, "imgWdthSize");
            return (Criteria) this;
        }

        public Criteria andImgWdthSizeNotIn(List<Integer> values) {
            addCriterion("TATC.IMG_WDTH_SIZE not in", values, "imgWdthSize");
            return (Criteria) this;
        }

        public Criteria andImgWdthSizeBetween(Integer value1, Integer value2) {
            addCriterion("TATC.IMG_WDTH_SIZE between", value1, value2, "imgWdthSize");
            return (Criteria) this;
        }

        public Criteria andImgWdthSizeNotBetween(Integer value1, Integer value2) {
            addCriterion("TATC.IMG_WDTH_SIZE not between", value1, value2, "imgWdthSize");
            return (Criteria) this;
        }

        public Criteria andImgHghtSizeIsNull() {
            addCriterion("TATC.IMG_HGHT_SIZE is null");
            return (Criteria) this;
        }

        public Criteria andImgHghtSizeIsNotNull() {
            addCriterion("TATC.IMG_HGHT_SIZE is not null");
            return (Criteria) this;
        }

        public Criteria andImgHghtSizeEqualTo(Integer value) {
            addCriterion("TATC.IMG_HGHT_SIZE =", value, "imgHghtSize");
            return (Criteria) this;
        }

        public Criteria andImgHghtSizeNotEqualTo(Integer value) {
            addCriterion("TATC.IMG_HGHT_SIZE <>", value, "imgHghtSize");
            return (Criteria) this;
        }

        public Criteria andImgHghtSizeGreaterThan(Integer value) {
            addCriterion("TATC.IMG_HGHT_SIZE >", value, "imgHghtSize");
            return (Criteria) this;
        }

        public Criteria andImgHghtSizeGreaterThanOrEqualTo(Integer value) {
            addCriterion("TATC.IMG_HGHT_SIZE >=", value, "imgHghtSize");
            return (Criteria) this;
        }

        public Criteria andImgHghtSizeLessThan(Integer value) {
            addCriterion("TATC.IMG_HGHT_SIZE <", value, "imgHghtSize");
            return (Criteria) this;
        }

        public Criteria andImgHghtSizeLessThanOrEqualTo(Integer value) {
            addCriterion("TATC.IMG_HGHT_SIZE <=", value, "imgHghtSize");
            return (Criteria) this;
        }

        public Criteria andImgHghtSizeIn(List<Integer> values) {
            addCriterion("TATC.IMG_HGHT_SIZE in", values, "imgHghtSize");
            return (Criteria) this;
        }

        public Criteria andImgHghtSizeNotIn(List<Integer> values) {
            addCriterion("TATC.IMG_HGHT_SIZE not in", values, "imgHghtSize");
            return (Criteria) this;
        }

        public Criteria andImgHghtSizeBetween(Integer value1, Integer value2) {
            addCriterion("TATC.IMG_HGHT_SIZE between", value1, value2, "imgHghtSize");
            return (Criteria) this;
        }

        public Criteria andImgHghtSizeNotBetween(Integer value1, Integer value2) {
            addCriterion("TATC.IMG_HGHT_SIZE not between", value1, value2, "imgHghtSize");
            return (Criteria) this;
        }

        public Criteria andSordIsNull() {
            addCriterion("TATC.SORD is null");
            return (Criteria) this;
        }

        public Criteria andSordIsNotNull() {
            addCriterion("TATC.SORD is not null");
            return (Criteria) this;
        }

        public Criteria andSordEqualTo(Integer value) {
            addCriterion("TATC.SORD =", value, "sord");
            return (Criteria) this;
        }

        public Criteria andSordNotEqualTo(Integer value) {
            addCriterion("TATC.SORD <>", value, "sord");
            return (Criteria) this;
        }

        public Criteria andSordGreaterThan(Integer value) {
            addCriterion("TATC.SORD >", value, "sord");
            return (Criteria) this;
        }

        public Criteria andSordGreaterThanOrEqualTo(Integer value) {
            addCriterion("TATC.SORD >=", value, "sord");
            return (Criteria) this;
        }

        public Criteria andSordLessThan(Integer value) {
            addCriterion("TATC.SORD <", value, "sord");
            return (Criteria) this;
        }

        public Criteria andSordLessThanOrEqualTo(Integer value) {
            addCriterion("TATC.SORD <=", value, "sord");
            return (Criteria) this;
        }

        public Criteria andSordIn(List<Integer> values) {
            addCriterion("TATC.SORD in", values, "sord");
            return (Criteria) this;
        }

        public Criteria andSordNotIn(List<Integer> values) {
            addCriterion("TATC.SORD not in", values, "sord");
            return (Criteria) this;
        }

        public Criteria andSordBetween(Integer value1, Integer value2) {
            addCriterion("TATC.SORD between", value1, value2, "sord");
            return (Criteria) this;
        }

        public Criteria andSordNotBetween(Integer value1, Integer value2) {
            addCriterion("TATC.SORD not between", value1, value2, "sord");
            return (Criteria) this;
        }

        public Criteria andTempFileYnIsNull() {
            addCriterion("TATC.TEMP_FILE_YN is null");
            return (Criteria) this;
        }

        public Criteria andTempFileYnIsNotNull() {
            addCriterion("TATC.TEMP_FILE_YN is not null");
            return (Criteria) this;
        }

        public Criteria andTempFileYnEqualTo(String value) {
            addCriterion("TATC.TEMP_FILE_YN =", value, "tempFileYn");
            return (Criteria) this;
        }

        public Criteria andTempFileYnNotEqualTo(String value) {
            addCriterion("TATC.TEMP_FILE_YN <>", value, "tempFileYn");
            return (Criteria) this;
        }

        public Criteria andTempFileYnGreaterThan(String value) {
            addCriterion("TATC.TEMP_FILE_YN >", value, "tempFileYn");
            return (Criteria) this;
        }

        public Criteria andTempFileYnGreaterThanOrEqualTo(String value) {
            addCriterion("TATC.TEMP_FILE_YN >=", value, "tempFileYn");
            return (Criteria) this;
        }

        public Criteria andTempFileYnLessThan(String value) {
            addCriterion("TATC.TEMP_FILE_YN <", value, "tempFileYn");
            return (Criteria) this;
        }

        public Criteria andTempFileYnLessThanOrEqualTo(String value) {
            addCriterion("TATC.TEMP_FILE_YN <=", value, "tempFileYn");
            return (Criteria) this;
        }

        public Criteria andTempFileYnLike(String value) {
            addCriterion("TATC.TEMP_FILE_YN like", value, "tempFileYn");
            return (Criteria) this;
        }

        public Criteria andTempFileYnNotLike(String value) {
            addCriterion("TATC.TEMP_FILE_YN not like", value, "tempFileYn");
            return (Criteria) this;
        }

        public Criteria andTempFileYnIn(List<String> values) {
            addCriterion("TATC.TEMP_FILE_YN in", values, "tempFileYn");
            return (Criteria) this;
        }

        public Criteria andTempFileYnNotIn(List<String> values) {
            addCriterion("TATC.TEMP_FILE_YN not in", values, "tempFileYn");
            return (Criteria) this;
        }

        public Criteria andTempFileYnBetween(String value1, String value2) {
            addCriterion("TATC.TEMP_FILE_YN between", value1, value2, "tempFileYn");
            return (Criteria) this;
        }

        public Criteria andTempFileYnNotBetween(String value1, String value2) {
            addCriterion("TATC.TEMP_FILE_YN not between", value1, value2, "tempFileYn");
            return (Criteria) this;
        }

        public Criteria andRegDtIsNull() {
            addCriterion("TATC.REG_DT is null");
            return (Criteria) this;
        }

        public Criteria andRegDtIsNotNull() {
            addCriterion("TATC.REG_DT is not null");
            return (Criteria) this;
        }

        public Criteria andRegDtEqualTo(Date value) {
            addCriterion("TATC.REG_DT =", value, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtNotEqualTo(Date value) {
            addCriterion("TATC.REG_DT <>", value, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtGreaterThan(Date value) {
            addCriterion("TATC.REG_DT >", value, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtGreaterThanOrEqualTo(Date value) {
            addCriterion("TATC.REG_DT >=", value, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtLessThan(Date value) {
            addCriterion("TATC.REG_DT <", value, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtLessThanOrEqualTo(Date value) {
            addCriterion("TATC.REG_DT <=", value, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtIn(List<Date> values) {
            addCriterion("TATC.REG_DT in", values, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtNotIn(List<Date> values) {
            addCriterion("TATC.REG_DT not in", values, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtBetween(Date value1, Date value2) {
            addCriterion("TATC.REG_DT between", value1, value2, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtNotBetween(Date value1, Date value2) {
            addCriterion("TATC.REG_DT not between", value1, value2, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegIdIsNull() {
            addCriterion("TATC.REG_ID is null");
            return (Criteria) this;
        }

        public Criteria andRegIdIsNotNull() {
            addCriterion("TATC.REG_ID is not null");
            return (Criteria) this;
        }

        public Criteria andRegIdEqualTo(String value) {
            addCriterion("TATC.REG_ID =", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdNotEqualTo(String value) {
            addCriterion("TATC.REG_ID <>", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdGreaterThan(String value) {
            addCriterion("TATC.REG_ID >", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdGreaterThanOrEqualTo(String value) {
            addCriterion("TATC.REG_ID >=", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdLessThan(String value) {
            addCriterion("TATC.REG_ID <", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdLessThanOrEqualTo(String value) {
            addCriterion("TATC.REG_ID <=", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdLike(String value) {
            addCriterion("TATC.REG_ID like", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdNotLike(String value) {
            addCriterion("TATC.REG_ID not like", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdIn(List<String> values) {
            addCriterion("TATC.REG_ID in", values, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdNotIn(List<String> values) {
            addCriterion("TATC.REG_ID not in", values, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdBetween(String value1, String value2) {
            addCriterion("TATC.REG_ID between", value1, value2, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdNotBetween(String value1, String value2) {
            addCriterion("TATC.REG_ID not between", value1, value2, "regId");
            return (Criteria) this;
        }

        public Criteria andUseYnIsNull() {
            addCriterion("TATC.USE_YN is null");
            return (Criteria) this;
        }

        public Criteria andUseYnIsNotNull() {
            addCriterion("TATC.USE_YN is not null");
            return (Criteria) this;
        }

        public Criteria andUseYnEqualTo(String value) {
            addCriterion("TATC.USE_YN =", value, "useYn");
            return (Criteria) this;
        }

        public Criteria andUseYnNotEqualTo(String value) {
            addCriterion("TATC.USE_YN <>", value, "useYn");
            return (Criteria) this;
        }

        public Criteria andUseYnGreaterThan(String value) {
            addCriterion("TATC.USE_YN >", value, "useYn");
            return (Criteria) this;
        }

        public Criteria andUseYnGreaterThanOrEqualTo(String value) {
            addCriterion("TATC.USE_YN >=", value, "useYn");
            return (Criteria) this;
        }

        public Criteria andUseYnLessThan(String value) {
            addCriterion("TATC.USE_YN <", value, "useYn");
            return (Criteria) this;
        }

        public Criteria andUseYnLessThanOrEqualTo(String value) {
            addCriterion("TATC.USE_YN <=", value, "useYn");
            return (Criteria) this;
        }

        public Criteria andUseYnLike(String value) {
            addCriterion("TATC.USE_YN like", value, "useYn");
            return (Criteria) this;
        }

        public Criteria andUseYnNotLike(String value) {
            addCriterion("TATC.USE_YN not like", value, "useYn");
            return (Criteria) this;
        }

        public Criteria andUseYnIn(List<String> values) {
            addCriterion("TATC.USE_YN in", values, "useYn");
            return (Criteria) this;
        }

        public Criteria andUseYnNotIn(List<String> values) {
            addCriterion("TATC.USE_YN not in", values, "useYn");
            return (Criteria) this;
        }

        public Criteria andUseYnBetween(String value1, String value2) {
            addCriterion("TATC.USE_YN between", value1, value2, "useYn");
            return (Criteria) this;
        }

        public Criteria andUseYnNotBetween(String value1, String value2) {
            addCriterion("TATC.USE_YN not between", value1, value2, "useYn");
            return (Criteria) this;
        }

        public Criteria andMbrIdLikeInsensitive(String value) {
            addCriterion("upper(TATC.MBR_ID) like", value.toUpperCase(), "mbrId");
            return (Criteria) this;
        }

        public Criteria andAdmIdLikeInsensitive(String value) {
            addCriterion("upper(TATC.ADM_ID) like", value.toUpperCase(), "admId");
            return (Criteria) this;
        }

        public Criteria andAtchClCdLikeInsensitive(String value) {
            addCriterion("upper(TATC.ATCH_CL_CD) like", value.toUpperCase(), "atchClCd");
            return (Criteria) this;
        }

        public Criteria andFileNmLikeInsensitive(String value) {
            addCriterion("upper(TATC.FILE_NM) like", value.toUpperCase(), "fileNm");
            return (Criteria) this;
        }

        public Criteria andFilePathLikeInsensitive(String value) {
            addCriterion("upper(TATC.FILE_PATH) like", value.toUpperCase(), "filePath");
            return (Criteria) this;
        }

        public Criteria andFileExtLikeInsensitive(String value) {
            addCriterion("upper(TATC.FILE_EXT) like", value.toUpperCase(), "fileExt");
            return (Criteria) this;
        }

        public Criteria andFileTpValLikeInsensitive(String value) {
            addCriterion("upper(TATC.FILE_TP_VAL) like", value.toUpperCase(), "fileTpVal");
            return (Criteria) this;
        }

        public Criteria andOriFileNmLikeInsensitive(String value) {
            addCriterion("upper(TATC.ORI_FILE_NM) like", value.toUpperCase(), "oriFileNm");
            return (Criteria) this;
        }

        public Criteria andTempFileYnLikeInsensitive(String value) {
            addCriterion("upper(TATC.TEMP_FILE_YN) like", value.toUpperCase(), "tempFileYn");
            return (Criteria) this;
        }

        public Criteria andRegIdLikeInsensitive(String value) {
            addCriterion("upper(TATC.REG_ID) like", value.toUpperCase(), "regId");
            return (Criteria) this;
        }

        public Criteria andUseYnLikeInsensitive(String value) {
            addCriterion("upper(TATC.USE_YN) like", value.toUpperCase(), "useYn");
            return (Criteria) this;
        }

        public Criteria andMbrIdLikeLeft(String value) {
            addCriterion("TATC.MBR_ID like ", "%" + value, "mbrId");
            return (Criteria) this;
        }

        public Criteria andMbrIdLikeRight(String value) {
            addCriterion("TATC.MBR_ID like ", value + "%", "mbrId");
            return (Criteria) this;
        }

        public Criteria andMbrIdLikeBoth(String value) {
            addCriterion("TATC.MBR_ID like ", "%" + value + "%", "mbrId");
            return (Criteria) this;
        }

        public Criteria andAdmIdLikeLeft(String value) {
            addCriterion("TATC.ADM_ID like ", "%" + value, "admId");
            return (Criteria) this;
        }

        public Criteria andAdmIdLikeRight(String value) {
            addCriterion("TATC.ADM_ID like ", value + "%", "admId");
            return (Criteria) this;
        }

        public Criteria andAdmIdLikeBoth(String value) {
            addCriterion("TATC.ADM_ID like ", "%" + value + "%", "admId");
            return (Criteria) this;
        }

        public Criteria andAtchClCdLikeLeft(String value) {
            addCriterion("TATC.ATCH_CL_CD like ", "%" + value, "atchClCd");
            return (Criteria) this;
        }

        public Criteria andAtchClCdLikeRight(String value) {
            addCriterion("TATC.ATCH_CL_CD like ", value + "%", "atchClCd");
            return (Criteria) this;
        }

        public Criteria andAtchClCdLikeBoth(String value) {
            addCriterion("TATC.ATCH_CL_CD like ", "%" + value + "%", "atchClCd");
            return (Criteria) this;
        }

        public Criteria andFileNmLikeLeft(String value) {
            addCriterion("TATC.FILE_NM like ", "%" + value, "fileNm");
            return (Criteria) this;
        }

        public Criteria andFileNmLikeRight(String value) {
            addCriterion("TATC.FILE_NM like ", value + "%", "fileNm");
            return (Criteria) this;
        }

        public Criteria andFileNmLikeBoth(String value) {
            addCriterion("TATC.FILE_NM like ", "%" + value + "%", "fileNm");
            return (Criteria) this;
        }

        public Criteria andFilePathLikeLeft(String value) {
            addCriterion("TATC.FILE_PATH like ", "%" + value, "filePath");
            return (Criteria) this;
        }

        public Criteria andFilePathLikeRight(String value) {
            addCriterion("TATC.FILE_PATH like ", value + "%", "filePath");
            return (Criteria) this;
        }

        public Criteria andFilePathLikeBoth(String value) {
            addCriterion("TATC.FILE_PATH like ", "%" + value + "%", "filePath");
            return (Criteria) this;
        }

        public Criteria andFileExtLikeLeft(String value) {
            addCriterion("TATC.FILE_EXT like ", "%" + value, "fileExt");
            return (Criteria) this;
        }

        public Criteria andFileExtLikeRight(String value) {
            addCriterion("TATC.FILE_EXT like ", value + "%", "fileExt");
            return (Criteria) this;
        }

        public Criteria andFileExtLikeBoth(String value) {
            addCriterion("TATC.FILE_EXT like ", "%" + value + "%", "fileExt");
            return (Criteria) this;
        }

        public Criteria andFileTpValLikeLeft(String value) {
            addCriterion("TATC.FILE_TP_VAL like ", "%" + value, "fileTpVal");
            return (Criteria) this;
        }

        public Criteria andFileTpValLikeRight(String value) {
            addCriterion("TATC.FILE_TP_VAL like ", value + "%", "fileTpVal");
            return (Criteria) this;
        }

        public Criteria andFileTpValLikeBoth(String value) {
            addCriterion("TATC.FILE_TP_VAL like ", "%" + value + "%", "fileTpVal");
            return (Criteria) this;
        }

        public Criteria andOriFileNmLikeLeft(String value) {
            addCriterion("TATC.ORI_FILE_NM like ", "%" + value, "oriFileNm");
            return (Criteria) this;
        }

        public Criteria andOriFileNmLikeRight(String value) {
            addCriterion("TATC.ORI_FILE_NM like ", value + "%", "oriFileNm");
            return (Criteria) this;
        }

        public Criteria andOriFileNmLikeBoth(String value) {
            addCriterion("TATC.ORI_FILE_NM like ", "%" + value + "%", "oriFileNm");
            return (Criteria) this;
        }

        public Criteria andTempFileYnLikeLeft(String value) {
            addCriterion("TATC.TEMP_FILE_YN like ", "%" + value, "tempFileYn");
            return (Criteria) this;
        }

        public Criteria andTempFileYnLikeRight(String value) {
            addCriterion("TATC.TEMP_FILE_YN like ", value + "%", "tempFileYn");
            return (Criteria) this;
        }

        public Criteria andTempFileYnLikeBoth(String value) {
            addCriterion("TATC.TEMP_FILE_YN like ", "%" + value + "%", "tempFileYn");
            return (Criteria) this;
        }

        public Criteria andRegIdLikeLeft(String value) {
            addCriterion("TATC.REG_ID like ", "%" + value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdLikeRight(String value) {
            addCriterion("TATC.REG_ID like ", value + "%", "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdLikeBoth(String value) {
            addCriterion("TATC.REG_ID like ", "%" + value + "%", "regId");
            return (Criteria) this;
        }

        public Criteria andUseYnLikeLeft(String value) {
            addCriterion("TATC.USE_YN like ", "%" + value, "useYn");
            return (Criteria) this;
        }

        public Criteria andUseYnLikeRight(String value) {
            addCriterion("TATC.USE_YN like ", value + "%", "useYn");
            return (Criteria) this;
        }

        public Criteria andUseYnLikeBoth(String value) {
            addCriterion("TATC.USE_YN like ", "%" + value + "%", "useYn");
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