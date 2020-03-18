package com.mushbird.sinsege.base.mybatis.generator.plugin;

import org.mybatis.generator.api.IntrospectedTable;
import org.mybatis.generator.api.PluginAdapter;
import org.mybatis.generator.api.dom.xml.Element;
import org.mybatis.generator.api.dom.xml.TextElement;
import org.mybatis.generator.api.dom.xml.XmlElement;

import java.util.List;

/**
 * Maria-DB Select With Nolock 세팅 플러그인
 */
public class SqlMapMssqlSelectWithNolockPlugin extends PluginAdapter {

    @Override
    public boolean validate(List<String> warnings) {
        return true;
    }

    @Override
    public boolean sqlMapCountByExampleElementGenerated(XmlElement element, IntrospectedTable introspectedTable) {
        String content = element.getElements().get(0).getFormattedContent(0) + " WITH (NOLOCK)";
        element.getElements().set(0, new TextElement(content));

        return super.sqlMapCountByExampleElementGenerated(element, introspectedTable);
    }

    @Override
    public boolean sqlMapSelectByExampleWithBLOBsElementGenerated(XmlElement element, IntrospectedTable introspectedTable) {
        List<Element> elementList = element.getElements();

        for(int i = 0; i < elementList.size(); i++) {
            Element el = elementList.get(i);

            if(el.getFormattedContent(0).startsWith("from ")) {
                String content = el.getFormattedContent(0) + " WITH (NOLOCK)";
                element.getElements().set(i, new TextElement(content));
            }
        }

        return super.sqlMapSelectByExampleWithBLOBsElementGenerated(element, introspectedTable);
    }

    @Override
    public boolean sqlMapSelectByExampleWithoutBLOBsElementGenerated(XmlElement element, IntrospectedTable introspectedTable) {
        List<Element> elementList = element.getElements();

        for(int i = 0; i < elementList.size(); i++) {
            Element el = elementList.get(i);

            if(el.getFormattedContent(0).startsWith("from ")) {
                String content = el.getFormattedContent(0) + " WITH (NOLOCK)";
                element.getElements().set(i, new TextElement(content));
            }
        }

        return super.sqlMapSelectByExampleWithoutBLOBsElementGenerated(element, introspectedTable);
    }

    @Override
    public boolean sqlMapSelectByPrimaryKeyElementGenerated(XmlElement element, IntrospectedTable introspectedTable) {
        List<Element> elementList = element.getElements();

        for(int i = 0; i < elementList.size(); i++) {
            Element el = elementList.get(i);

            if(el.getFormattedContent(0).startsWith("from ")) {
                String content = el.getFormattedContent(0) + " WITH (NOLOCK)";
                element.getElements().set(i, new TextElement(content));
            }
        }

        return super.sqlMapSelectByPrimaryKeyElementGenerated(element, introspectedTable);
    }
}
