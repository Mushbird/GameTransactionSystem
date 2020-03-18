package com.mushbird.sinsege.base.mybatis.generator.plugin;

import java.util.List;

import org.mybatis.generator.api.IntrospectedColumn;
import org.mybatis.generator.api.IntrospectedTable;
import org.mybatis.generator.api.PluginAdapter;
import org.mybatis.generator.api.dom.java.FullyQualifiedJavaType;
import org.mybatis.generator.api.dom.java.InnerClass;
import org.mybatis.generator.api.dom.java.JavaVisibility;
import org.mybatis.generator.api.dom.java.Method;
import org.mybatis.generator.api.dom.java.Parameter;
import org.mybatis.generator.api.dom.java.TopLevelClass;
import org.mybatis.generator.codegen.ibatis2.Ibatis2FormattingUtilities;

/**
 * MyBatis Generator 의 like 확장플러그인
 * MyBatis Generator Example 클래스의 like 메소드는 {column} like {value} 만 지원한다.
 * {@link ExtendedLikePlugin} 은 like 외 like both, like left, like right 지원한다.
 * <p/>
 * like both: {column} like %{value}%
 * like left: {column} like %{value}
 * like right: {column} like {value}%
 *
 * @author 100SH
 */
public class ExtendedLikePlugin extends PluginAdapter {

    public ExtendedLikePlugin() {
        super();
    }

    public boolean validate(List<String> warnings) {
        return true;
    }

    @Override
    public boolean modelExampleClassGenerated(TopLevelClass topLevelClass,
                                              IntrospectedTable introspectedTable) {

        InnerClass criteria = null;
        // first, find the Criteria inner class
        for (InnerClass innerClass : topLevelClass.getInnerClasses()) {
            if ("GeneratedCriteria".equals(innerClass.getType().getShortName())) { //$NON-NLS-1$
                criteria = innerClass;
                break;
            }
        }

        if (criteria == null) {
            // can't find the inner class for some reason, bail out.
            return true;
        }

        for (IntrospectedColumn introspectedColumn : introspectedTable
                .getNonBLOBColumns()) {
            if (!introspectedColumn.isJdbcCharacterColumn()
                    || !introspectedColumn.isStringColumn()) {
                continue;
            }

            criteria.addMethod(this.createLikeLeftMethod(introspectedColumn));
            criteria.addMethod(this.createLikeRightMethod(introspectedColumn));
            criteria.addMethod(this.createLikeBothMethod(introspectedColumn));
        }

        return true;
    }

    /**
     * like both: {column} like %{value}% 메서드 생성
     *
     * @param introspectedColumn
     * @return
     */
    protected Method createLikeBothMethod(IntrospectedColumn introspectedColumn) {
        Method method = new Method();
        method.setVisibility(JavaVisibility.PUBLIC);
        method.addParameter(new Parameter(introspectedColumn
                .getFullyQualifiedJavaType(), "value")); //$NON-NLS-1$

        StringBuilder sb = new StringBuilder();
        sb.append(introspectedColumn.getJavaProperty());
        sb.setCharAt(0, Character.toUpperCase(sb.charAt(0)));
        sb.insert(0, "and"); //$NON-NLS-1$
        sb.append("LikeBoth"); //$NON-NLS-1$
        method.setName(sb.toString());
        method.setReturnType(FullyQualifiedJavaType.getCriteriaInstance());

        sb.setLength(0);
        sb.append("addCriterion(\""); //$NON-NLS-1$
        sb.append(Ibatis2FormattingUtilities
                .getAliasedActualColumnName(introspectedColumn));
        sb.append(" like \", \"%\" + value + \"%\", \""); //$NON-NLS-1$
        sb.append(introspectedColumn.getJavaProperty());
        sb.append("\");"); //$NON-NLS-1$
        method.addBodyLine(sb.toString());
        method.addBodyLine("return (Criteria) this;"); //$NON-NLS-1$

        return method;
    }

    /**
     * like left: {column} like %{value} 메서드 생성
     *
     * @param introspectedColumn
     * @return
     */
    protected Method createLikeLeftMethod(IntrospectedColumn introspectedColumn) {
        Method method = new Method();
        method.setVisibility(JavaVisibility.PUBLIC);
        method.addParameter(new Parameter(introspectedColumn
                .getFullyQualifiedJavaType(), "value")); //$NON-NLS-1$

        StringBuilder sb = new StringBuilder();
        sb.append(introspectedColumn.getJavaProperty());
        sb.setCharAt(0, Character.toUpperCase(sb.charAt(0)));
        sb.insert(0, "and"); //$NON-NLS-1$
        sb.append("LikeLeft"); //$NON-NLS-1$
        method.setName(sb.toString());
        method.setReturnType(FullyQualifiedJavaType.getCriteriaInstance());

        sb.setLength(0);
        sb.append("addCriterion(\""); //$NON-NLS-1$
        sb.append(Ibatis2FormattingUtilities
                .getAliasedActualColumnName(introspectedColumn));
        sb.append(" like \", \"%\" + value, \""); //$NON-NLS-1$
        sb.append(introspectedColumn.getJavaProperty());
        sb.append("\");"); //$NON-NLS-1$
        method.addBodyLine(sb.toString());
        method.addBodyLine("return (Criteria) this;"); //$NON-NLS-1$

        return method;
    }

    /**
     * like right: {column} like {value}% 메서드 생성
     *
     * @param introspectedColumn
     * @return
     */
    protected Method createLikeRightMethod(IntrospectedColumn introspectedColumn) {
        Method method = new Method();
        method.setVisibility(JavaVisibility.PUBLIC);
        method.addParameter(new Parameter(introspectedColumn
                .getFullyQualifiedJavaType(), "value")); //$NON-NLS-1$

        StringBuilder sb = new StringBuilder();
        sb.append(introspectedColumn.getJavaProperty());
        sb.setCharAt(0, Character.toUpperCase(sb.charAt(0)));
        sb.insert(0, "and"); //$NON-NLS-1$
        sb.append("LikeRight"); //$NON-NLS-1$
        method.setName(sb.toString());
        method.setReturnType(FullyQualifiedJavaType.getCriteriaInstance());

        sb.setLength(0);
        sb.append("addCriterion(\""); //$NON-NLS-1$
        sb.append(Ibatis2FormattingUtilities
                .getAliasedActualColumnName(introspectedColumn));
        sb.append(" like \", value + \"%\", \""); //$NON-NLS-1$
        sb.append(introspectedColumn.getJavaProperty());
        sb.append("\");"); //$NON-NLS-1$
        method.addBodyLine(sb.toString());
        method.addBodyLine("return (Criteria) this;"); //$NON-NLS-1$

        return method;
    }

}
