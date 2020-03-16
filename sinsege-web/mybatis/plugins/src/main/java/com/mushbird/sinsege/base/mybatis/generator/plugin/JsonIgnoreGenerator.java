package com..mushbird.sinsege.base.mybatis.generator.plugin;

import java.util.List;

import org.mybatis.generator.api.IntrospectedColumn;
import org.mybatis.generator.api.IntrospectedTable;
import org.mybatis.generator.api.PluginAdapter;
import org.mybatis.generator.api.dom.java.Field;
import org.mybatis.generator.api.dom.java.TopLevelClass;

/**
 * 자바 필드에 @JsonIgnore가 추가됨 사용법 등, 표의 속성 추가 <property name =
 * "jsonIgnoreFields"value = "videoPwd; extraType;"/>
 *
 */
public class JsonIgnoreGenerator extends PluginAdapter {

	private String jsonIgnoreFields;

	@Override
	public boolean validate(List<String> warnings) {
		return true;
	}

	@Override
	public boolean modelFieldGenerated(Field field, TopLevelClass topLevelClass, IntrospectedColumn introspectedColumn,
			IntrospectedTable introspectedTable, ModelClassType modelClassType) {
		
		String jsonIgnoreFields = introspectedTable.getTableConfiguration().getProperty("jsonIgnoreFields");
		
		if (jsonIgnoreFields != null && jsonIgnoreFields.contains(field.getName())) {
			field.addJavaDocLine("@JsonIgnore");
			topLevelClass.addImportedType("com.fasterxml.jackson.annotation.JsonIgnore");
		}
		return super.modelFieldGenerated(field, topLevelClass, introspectedColumn, introspectedTable, modelClassType);
	}
}
