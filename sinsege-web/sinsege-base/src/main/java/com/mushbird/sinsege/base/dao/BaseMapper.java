package com.mushbird.sinsege.base.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

/**
 * 기본 Mapper
 * @param <T>
 * @param <ID>
 */
public interface BaseMapper<T, ID, C> {

	long countByEntityCriteria(C criteria);

    int deleteByEntityCriteria(C criteria);

    int deleteByPrimaryKey(ID key);

    int insert(T record);

    int insertSelective(T record);
    
    List<T> selectByEntityCriteria(C criteria);
    
    List<T> selectByEntityCriteriaWithBLOBs(C criteria);

    T selectByPrimaryKey(ID key);

    int updateByEntityCriteriaSelective(@Param("record") T record, @Param("example") C criteria);
    
    int updateByEntityCriteriaWithBLOBs(@Param("record") T record, @Param("example") C criteria);

    int updateByEntityCriteria(@Param("record") T record, @Param("example") C criteria);

    int updateNullByPrimaryKeySelective(T record);
    
    int updateByPrimaryKeySelective(T record);

    int updateByPrimaryKey(T record);
}
