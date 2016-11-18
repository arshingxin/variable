package com.variable.EventBus;

/**
 * @author Star
 */
public class RefreshCircleOrderEventBus {
    private boolean isUpdate;
    
    public RefreshCircleOrderEventBus(boolean isUpdate) {
        this.isUpdate = isUpdate;
    }

    public boolean getIsUpdate(){
        return isUpdate;
    }
}
