package com.gryfindor.identity.util;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public enum ExceptionName {

	USER_FOUND("User Found");

	private String exceptionName;

}
