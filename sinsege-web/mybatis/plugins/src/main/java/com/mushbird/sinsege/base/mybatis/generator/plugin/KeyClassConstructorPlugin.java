package com..mushbird.sinsege.base.mybatis.generator.plugin;

import java.util.Iterator;
import java.util.List;

import org.mybatis.generator.api.IntrospectedColumn;
import org.mybatis.generator.api.IntrospectedTable;
import org.mybatis.generator.api.PluginAdapter;
import org.mybatis.generator.api.dom.java.JavaVisibility;
import org.mybatis.generator.api.dom.java.Method;
import org.mybatis.generator.api.dom.java.Parameter;
import org.mybatis.generator.api.dom.java.TopLevelClass;

/**
 * Multi Key Class 를 생성할때 Constructor 를 자동으로 생성한다
 * Table attribute modelType="conditional" 가 필요하고 constructor based 는 필요하지 않음
 *
 * @author zune
 */
public class KeyClassConstructorPlugin extends PluginAdapter {

    @Override
    public boolean modelPrimaryKeyClassGenerated(TopLevelClass topLevelClass, IntrospectedTable introspectedTable) {

        super.modelPrimaryKeyClassGenerated(topLevelClass, introspectedTable);

        this.addParameterizedConstructor(topLevelClass, introspectedTable);
        if(! introspectedTable.isImmutable()) {
            this.addDefaultConstructor(topLevelClass, introspectedTable);
        }

        return true;
    }

    @Override
    public boolean validate(List<String> warnings) {
        return true;
    }

    private void addParameterizedConstructor(TopLevelClass topLevelClass, IntrospectedTable introspectedTable) {
        Method method = new Method();
        method.setVisibility(JavaVisibility.PUBLIC);
        method.setConstructor(true);
        method.setName(topLevelClass.getType().getShortName());
        this.context.getCommentGenerator().addGeneralMethodComment(method, introspectedTable);
        StringBuilder sb = new StringBuilder();
        Iterator i$ = introspectedTable.getPrimaryKeyColumns().iterator();

        while(i$.hasNext()) {
            IntrospectedColumn introspectedColumn = (IntrospectedColumn)i$.next();
            method.addParameter(new Parameter(introspectedColumn.getFullyQualifiedJavaType(), introspectedColumn.getJavaProperty()));
            sb.setLength(0);
            sb.append("this.");
            sb.append(introspectedColumn.getJavaProperty());
            sb.append(" = ");
            sb.append(introspectedColumn.getJavaProperty());
            sb.append(';');
            method.addBodyLine(sb.toString());
        }

        topLevelClass.addMethod(method);
    }

    protected void addDefaultConstructor(TopLevelClass topLevelClass, IntrospectedTable introspectedTable) {
        Method method = new Method();
        method.setVisibility(JavaVisibility.PUBLIC);
        method.setConstructor(true);
        method.setName(topLevelClass.getType().getShortName());
        method.addBodyLine("super();");
        this.context.getCommentGenerator().addGeneralMethodComment(method, introspectedTable);
        topLevelClass.addMethod(method);
    }
}
