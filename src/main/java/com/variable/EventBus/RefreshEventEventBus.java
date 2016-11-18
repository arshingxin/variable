package com.variable.EventBus;

/**
 * @author Star
 */
public class RefreshEventEventBus {
    private boolean isUpdate;

    public RefreshEventEventBus(boolean isUpdate) {
        this.isUpdate = isUpdate;
    }

    public boolean getIsUpdate(){
        return isUpdate;
    }
}
