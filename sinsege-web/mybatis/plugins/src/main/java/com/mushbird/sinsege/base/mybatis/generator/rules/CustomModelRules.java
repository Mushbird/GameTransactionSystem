/*
 *  Copyright 2006 The Apache Software Foundation
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */

package com.mushbird.sinsege.base.mybatis.generator.rules;

import org.mybatis.generator.api.IntrospectedTable;

public class CustomModelRules extends org.mybatis.generator.internal.rules.ConditionalModelRules {

    public CustomModelRules(IntrospectedTable introspectedTable) {
        super(introspectedTable);
    }

    /**
     * 무조건 RecordClass 를 생성하도록 진행
     * @return
     */
    @Override
    public boolean generateBaseRecordClass() {
        return true;
    }

    /**
     * Mapper 클래스는 생성하지 않도록 설정
     * @return
     */
    @Override
    public boolean generateJavaClient() {
        return false;
    }

    /**
     * BLOB 클래스는 생성하지 않도록 설정
     * @return
     */
    @Override
    public boolean generateRecordWithBLOBsClass() {
        return false;
    }
}
