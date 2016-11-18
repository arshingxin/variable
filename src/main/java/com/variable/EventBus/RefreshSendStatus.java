package com.variable.EventBus;

import com.variable.object.DBTableObject;

/**
 * Created by star on 2016/8/12.
 */
public class RefreshSendStatus {
    private String key;
    private String imageId;
    private int sendStatus;

    /**
     * {@link com.variable.object.DBTableObject.Status}
     * @param sendStatus
     */
    public RefreshSendStatus(String key, String imageId, int sendStatus){
        this.key = key;
        this.imageId = imageId;
        this.sendStatus = sendStatus;
    }

    public String getKey(){
        return key;
    }

    public String getImageId(){
        return imageId;
    }

    public int getSendStatus(){
        return sendStatus;
    }
}
