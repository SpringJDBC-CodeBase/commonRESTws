package com.telappoint.commonrestws.support.utils;

/**
 * @author Murali
 */

public enum EmailContants {
									
	SUPPORT_EMAIL_TEMPLATE_TYPE_NEW_TICKET("NEW_TICKET"),
	
	SUPPORT_EMAIL_TEMPLATE_TYPE_STATUS_UPDATED_BY_ITFD("STATUS_UPDATED_BY_ITFD"),
	SUPPORT_EMAIL_TEMPLATE_TYPE_STATUS_UPDATED_TO_FIXED_BY_ITFD("STATUS_UPDATED_TO_FIXED_BY_ITFD"),
	
	SUPPORT_EMAIL_TEMPLATE_TYPE_CLIENT_ESCALATED_TICKET("CLIENT_ESCALATED_TICKET"),
	SUPPORT_EMAIL_TEMPLATE_TYPE_CLIENT_CLOSED_TICKET("CLIENT_CLOSED_TICKET"),
	SUPPORT_EMAIL_TEMPLATE_TYPE_CLIENT_UPDATED_RESPONSE("CLIENT_UPDATED_RESPONSE");
	
	private String value;

	private EmailContants(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}
}
