package com.mushbird.sinsege.base.mybatis.generator.plugin;

import java.util.List;

import org.mybatis.generator.api.IntrospectedTable;
import org.mybatis.generator.api.PluginAdapter;
import org.mybatis.generator.api.dom.xml.Element;
import org.mybatis.generator.api.dom.xml.TextElement;
import org.mybatis.generator.api.dom.xml.XmlElement;

/**
 * update Table 플러그인
 */
public class sqlMapUpdateByExampleSelectiveElementGeneratedPlugin extends PluginAdapter {

    @Override
    public boolean validate(List<String> warnings) {
        return true;
    }
    
    @Override
    public boolean sqlMapUpdateByExampleSelectiveElementGenerated(XmlElement element, 
    		IntrospectedTable introspectedTable) {
    	
    	String alias = introspectedTable.getTableConfiguration().getAlias();

        if(alias == null || alias.equals("")) {
            return super.sqlMapDeleteByExampleElementGenerated(element, introspectedTable);
        }

        StringBuilder sb = new StringBuilder();

        sb.append("update ");
        sb.append(alias);
        element.getElements().set(0, new TextElement(sb.toString()));
        
        Element updateNullElement = element.getElements().get(2);
        
        StringBuilder sb2 = new StringBuilder();
        sb2.append("from ");
        sb2.append(introspectedTable.getAliasedFullyQualifiedTableNameAtRuntime());
        element.getElements().set(2, new TextElement(sb2.toString()));
        
        element.getElements().add(updateNullElement);
        
    	return super.sqlMapUpdateByExampleSelectiveElementGenerated(element, introspectedTable);
    }
}
