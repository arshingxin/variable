package com.variable.EventBus;

/**
 * Created by star on 2016/8/16.
 */
public class CMEEResponseError {
    private String functionName;
    private String message;

    public CMEEResponseError(String functionName, String message){
        this.functionName = functionName;
        this.message = message;
    }

    public String getFunctionName(){
        return functionName;
    }

    public String getMessage(){
        return message;
    }
}
