package com..mushbird.sinsege.base.mybatis.generator.plugin;
import org.mybatis.generator.api.dom.java.FullyQualifiedJavaType;
import org.mybatis.generator.api.dom.xml.Attribute;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter(AccessLevel.PACKAGE)
@Setter(AccessLevel.PACKAGE)
public class RenameProperties {

	private static final String EMPTY = "";

	private static final String DOT = ".";

	private boolean enabled;

	private String subPpackage;
	private String classSuffix;

	private String originalType;
	private String newType;

	public void validate(String theSubPpackage, String theClassSuffix) {
		enabled = theSubPpackage != null || theClassSuffix != null;

		if (enabled) {
			if (theSubPpackage == null) {
				subPpackage = EMPTY;
			} else if (!theSubPpackage.startsWith(DOT)) {
				subPpackage = DOT + theSubPpackage;
			} else {
				subPpackage = theSubPpackage;
			}

			classSuffix = theClassSuffix == null ? EMPTY : theClassSuffix;
		}
	}

	public String setTypes(String theOriginalType) {
		if (enabled) {
			this.originalType = theOriginalType;
			int lastDot = originalType.lastIndexOf(DOT);
			newType = originalType.substring(0, lastDot) + subPpackage + originalType.substring(lastDot) + classSuffix;
			return newType;
		}

		return theOriginalType;
	}

	public FullyQualifiedJavaType renameType(FullyQualifiedJavaType theJavaType) {
		if (theJavaType.getFullyQualifiedName().contains(newType)) {
			return new FullyQualifiedJavaType(theJavaType.getFullyQualifiedName().replace(newType, originalType));
		} else {
			return theJavaType;
		}
	}

	public Attribute renameAttribute(Attribute attribute) {
		if (newType.equals(attribute.getValue())) {
			return new Attribute(attribute.getName(), originalType);
		} else {
			return attribute;
		}
	}
}