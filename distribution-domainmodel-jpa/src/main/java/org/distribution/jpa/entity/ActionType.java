package org.distribution.jpa.entity;

public enum ActionType {
	CONFIGURE (1),
	INSTALL (2);
	
	private Integer shortName;

	ActionType(Integer shortName) {
		this.shortName = shortName;
	}

	public Integer getShortName() {
		return this.shortName;
	}

	public static ActionType fromShortName(Integer shortName) {
		for (ActionType v : ActionType.values()) {
			if (v.getShortName().equals(shortName)) {
				return v;
			}
		}

		throw new IllegalArgumentException("No ActionType with shortName ["
				+ shortName + "] found.");
	}


}
