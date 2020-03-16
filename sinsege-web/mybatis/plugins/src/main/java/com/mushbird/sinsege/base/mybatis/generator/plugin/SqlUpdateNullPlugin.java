package com..mushbird.sinsege.base.mybatis.generator.plugin;

import java.util.List;

import org.mybatis.generator.api.CommentGenerator;
import org.mybatis.generator.api.IntrospectedColumn;
import org.mybatis.generator.api.IntrospectedTable;
import org.mybatis.generator.api.PluginAdapter;
import org.mybatis.generator.api.dom.java.FullyQualifiedJavaType;
import org.mybatis.generator.api.dom.java.Interface;
import org.mybatis.generator.api.dom.java.JavaVisibility;
import org.mybatis.generator.api.dom.java.Method;
import org.mybatis.generator.api.dom.java.Parameter;
import org.mybatis.generator.api.dom.xml.Attribute;
import org.mybatis.generator.api.dom.xml.Document;
import org.mybatis.generator.api.dom.xml.TextElement;
import org.mybatis.generator.api.dom.xml.XmlElement;

public class SqlUpdateNullPlugin extends PluginAdapter {

	@Override
	public boolean validate(List<String> warnings) {
		return true;
	}

	@Override
	public boolean sqlMapDocumentGenerated(Document document, IntrospectedTable introspectedTable) {
		XmlElement parentElement = document.getRootElement();

		XmlElement updateNullElement = new XmlElement("update");
		updateNullElement.addAttribute(new Attribute("id", "updateNullByPrimaryKeySelective"));
		updateNullElement.addAttribute(new Attribute("parameterType", introspectedTable.getBaseRecordType()));
		updateNullElement
				.addElement(new TextElement("update " + introspectedTable.getFullyQualifiedTableNameAtRuntime()));

		XmlElement setElement = new XmlElement("set");

		for (IntrospectedColumn column : introspectedTable.getBaseColumns()) {
			XmlElement nullCheckElement = new XmlElement("if");
			nullCheckElement.addAttribute(new Attribute("test", column.getJavaProperty() + " != null"));
			nullCheckElement.addElement(new TextElement(column.getActualColumnName() + " = null,"));
			setElement.addElement(nullCheckElement);
		}
		updateNullElement.addElement(setElement);

		updateNullElement.addElement(new TextElement("where 1=1"));
		for (IntrospectedColumn key : introspectedTable.getPrimaryKeyColumns()) {
			updateNullElement.addElement(new TextElement("and " + key.getActualColumnName() + " = #{"
					+ key.getJavaProperty() + ",jdbcType=" + key.getJdbcTypeName() + "}"));
		}

		parentElement.addElement(updateNullElement);

		return super.sqlMapDocumentGenerated(document, introspectedTable);
	}

	@Override
	public boolean clientUpdateByPrimaryKeySelectiveMethodGenerated(Method method, Interface interfaze,
			IntrospectedTable introspectedTable) {

		Method newMethod = new Method();
		newMethod.setVisibility(JavaVisibility.PUBLIC);
		newMethod.setReturnType(method.getReturnType());
		newMethod.setName("updateNullByPrimaryKeySelective");

		for (int i = 0; i < method.getParameters().size(); i++) {
			Parameter parameter = method.getParameters().get(i);
			Parameter newParameter = new Parameter(
					new FullyQualifiedJavaType(parameter.getType().getShortName().replace("Entity", "")),
					parameter.getName(), parameter.isVarargs());

			for (String annotation : parameter.getAnnotations()) {
				newParameter.addAnnotation(annotation);
			}
			newMethod.addParameter(newParameter);
		}

		interfaze.addMethod(newMethod);

		return super.clientUpdateByPrimaryKeySelectiveMethodGenerated(method, interfaze, introspectedTable);
	}

}
