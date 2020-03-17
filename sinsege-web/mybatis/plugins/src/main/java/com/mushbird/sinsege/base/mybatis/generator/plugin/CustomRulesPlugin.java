package com.mushbird.sinsege.base.mybatis.generator.plugin;

import com.mushbird.sinsege.base.mybatis.generator.rules.CustomModelRules;
import org.mybatis.generator.api.IntrospectedTable;
import org.mybatis.generator.api.PluginAdapter;

import java.util.List;

/**
 * Custom Generator Rule 정의
 *
 * @author 100SH
 */
public class CustomRulesPlugin extends PluginAdapter {

    @Override
    public void initialized(IntrospectedTable introspectedTable) {

        // 1. PK 필드만 있는 테이블이면 Key Class 만 생성되는 이슈가 있어 무조건 Entity 를 생성하도록 설정
        // 2. Mapper Class 들은 생성하지 않도록 설정
        introspectedTable.setRules(new CustomModelRules(introspectedTable));
    }

    @Override
    public boolean validate(List<String> warnings) {
        return true;
    }
}
