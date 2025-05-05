package com.gryfindor.identity.util;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public enum ExceptionMessage {

	USER_FOUND("user found");

	private String description;

}
