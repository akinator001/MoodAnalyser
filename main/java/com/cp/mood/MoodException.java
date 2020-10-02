package com.cp.mood;

public class MoodException extends Exception{

	enum ExceptionType{
		ENTERED_NULL, ENTERED_EMPTY
	}

	ExceptionType type;

	public MoodException(ExceptionType type, String message) {
		super(message);
		this.type = type;
		System.out.println(this.type);
	}

}