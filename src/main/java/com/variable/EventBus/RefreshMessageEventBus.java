package com.variable.EventBus;

/**
 * @author Star
 */
public class RefreshMessageEventBus {
    private boolean isUpdate;

    public RefreshMessageEventBus(boolean isUpdate) {
        this.isUpdate = isUpdate;
    }

    public boolean getIsUpdate(){
        return isUpdate;
    }
}
