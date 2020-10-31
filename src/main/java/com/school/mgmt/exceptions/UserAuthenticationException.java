package com.school.mgmt.exceptions;

public class UserAuthenticationException extends SchoolMgmtGenericException{
	private static final long serialVersionUID = 1L;

	public UserAuthenticationException() {
		
	}
	
	public UserAuthenticationException(String errorCode, String errorMessage) {
		super(errorCode, errorMessage);
	}
}
