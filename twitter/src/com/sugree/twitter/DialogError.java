package com.sugree.twitter;

public class DialogError extends Throwable {
    private static final long serialVersionUID = -992704825747001028L;

    private static int mErrorCode;
    private static String mFailingUrl;

    public DialogError(String message, int errorCode, String failingUrl) {
        super(message);
        mErrorCode = errorCode;
        mFailingUrl = failingUrl;
    }

    public int getErrorCode() {
        return mErrorCode;
    }

    public String getFailingUrl() {
        return mFailingUrl;
    }
}
