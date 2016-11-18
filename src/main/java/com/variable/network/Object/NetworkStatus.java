package com.variable.network.Object;

import android.content.Context;

import com.variable.object.AppInfo;
import com.variable.utility.CommonUtility;

import java.util.Properties;

/**
 * 20150728[Star] created.
 */
public class NetworkStatus {
    public static final int IS_OK = 200;
    public static final int NOT_AVAILABLE = 0;
    public static final int NOT_CONNECTED = 1;

    private final int statusCode;
    private String statusMessage;
    private Properties properties;

    public NetworkStatus(Context context, int statusCode) {
        this.statusCode = statusCode;
        properties = CommonUtility.getMessageProperties(context);
    }

    public int getStatusCode(){
        return statusCode;
    }

    public String getStatusMessage(){
        if(properties==null){
            statusMessage = properties.getProperty("NETWORK_NOT_FIND_PROPERTIES");
            return statusMessage;
        }else {
            switch (statusCode){
                case IS_OK:
                    AppInfo.isNetworkConnected = true;
                    statusMessage = properties.getProperty("NETWORK_IS_OK");
                    return statusMessage;
                case NOT_AVAILABLE:
                    AppInfo.isNetworkConnected = false;
                    statusMessage = properties.getProperty("NETWORK_NOT_AVAILABLE");
                    return statusMessage;
                case NOT_CONNECTED:
                    AppInfo.isNetworkConnected = false;
                    statusMessage = properties.getProperty("NETWORK_NOT_CONNECTED");
                    return statusMessage;
                default:
                    AppInfo.isNetworkConnected = false;
                    return statusMessage;
            }
        }
    }
}
