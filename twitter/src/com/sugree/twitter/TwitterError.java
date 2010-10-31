package com.sugree.twitter;

public class TwitterError extends Throwable {

	private static final long serialVersionUID = 6626439442641443626L;

	private int mErrorCode = 0;
	private String mErrorType;
	
	public TwitterError(String message) {
		super(message);
	}

	public TwitterError(String message, String errorType, int errorCode) {
		super(message);
		mErrorType = errorType;
		mErrorCode = errorCode;
	}

	public int getErrorCode() {
		return mErrorCode;
	}

	public String getErrorType() {
		return mErrorType;
	}

}
