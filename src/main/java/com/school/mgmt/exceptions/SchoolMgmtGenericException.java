package com.school.mgmt.exceptions;

public class SchoolMgmtGenericException extends Throwable {

	private static final long serialVersionUID = 1L;

	private String errorCode;
	private String errorMessage;

	public SchoolMgmtGenericException() {
		super();
	}

	public SchoolMgmtGenericException(String errorCode, String errorMessage) {
		super();
		this.errorCode = errorCode;
		this.errorMessage = errorMessage;
	}

	public String getErrorCode() {
		return errorCode;
	}

	public String getErrorMessage() {
		return errorMessage;
	}

}
