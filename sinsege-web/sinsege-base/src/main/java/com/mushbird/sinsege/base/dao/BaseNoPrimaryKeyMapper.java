package com.mushbird.sinsege.base.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

/**
 * 키값이 없는 Mapper
 * 
 * @param <T>
 * @param <ID>
 */
public interface BaseNoPrimaryKeyMapper<T, ID, C> {

	long countByEntityCriteria(C criteria);

	int deleteByEntityCriteria(C criteria);

	int insert(T record);

	int insertSelective(T record);

	List<T> selectByEntityCriteria(C criteria);

	int updateByEntityCriteriaSelective(@Param("record") T record, @Param("example") C criteria);

	int updateByEntityCriteria(@Param("record") T record, @Param("example") C criteria);

	int updateNullByPrimaryKeySelective(T record);

}
