package com.variable.EventBus;

/**
 * @author Star
 */
public class RefreshProcateEventBus {
    private boolean isUpdate;

    public RefreshProcateEventBus(boolean isUpdate) {
        this.isUpdate = isUpdate;
    }

    public boolean getIsUpdate(){
        return isUpdate;
    }
}
