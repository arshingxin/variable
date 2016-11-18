package com.variable.EventBus;

/**
 * @author Star
 */
public class CMEEError {
    public final static String RETURN_GET_NO_DATA = "RETURN_GET_NO_DATA";
    public final static String RETURN_RETRY_TEN = "RETURN_RETRY_TEN";
    public final static String RETURN_NETWORK_DISCONNECT = "RETURN_NETWORK_DISCONNECT";
    public final static String RETURN_DO_NOT_KNOW_ERROR = "RETURN_DO_NOT_KNOW_ERROR";

    private String returnCode;

    public CMEEError(String returnCode){
     this.returnCode = returnCode;
    }

    public String getReturnCode(){
        return returnCode;
    }
}
