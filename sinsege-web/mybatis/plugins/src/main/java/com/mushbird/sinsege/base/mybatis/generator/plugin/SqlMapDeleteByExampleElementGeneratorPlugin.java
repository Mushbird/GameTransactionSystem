package com..mushbird.sinsege.base.mybatis.generator.plugin;

import org.mybatis.generator.api.IntrospectedTable;
import org.mybatis.generator.api.PluginAdapter;
import org.mybatis.generator.api.dom.xml.TextElement;
import org.mybatis.generator.api.dom.xml.XmlElement;

import java.util.List;

/**
 * Delete Table alias 세팅 플러그인
 */
public class SqlMapDeleteByExampleElementGeneratorPlugin extends PluginAdapter {

    @Override
    public boolean validate(List<String> warnings) {
        return true;
    }

    @Override
    public boolean sqlMapDeleteByExampleElementGenerated(XmlElement element, IntrospectedTable introspectedTable) {
        String alias = introspectedTable.getTableConfiguration().getAlias();

        if(alias == null || alias.equals("")) {
            return super.sqlMapDeleteByExampleElementGenerated(element, introspectedTable);
        }

        StringBuilder sb = new StringBuilder();

        sb.append("delete ");
        sb.append(alias);
        sb.append(" from ");
        sb.append(introspectedTable.getAliasedFullyQualifiedTableNameAtRuntime());

        element.getElements().set(0, new TextElement(sb.toString()));

        return super.sqlMapDeleteByExampleElementGenerated(element, introspectedTable);
    }
}
