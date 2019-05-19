package com.sm.kafka.consumer.constant;

public enum ConsumerConstant {
	EARLIEST("earliest"), LATESST("latest"),NONE("none");

	private String value;

	private ConsumerConstant(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}
	
	

}
