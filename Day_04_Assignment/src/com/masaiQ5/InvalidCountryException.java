package com.masaiQ5;

public class InvalidCountryException extends Exception {
	public InvalidCountryException() {};
	InvalidCountryException(String errorMessage){
		super(errorMessage);
	}
}
