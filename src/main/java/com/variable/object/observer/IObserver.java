package com.variable.object.observer;

import android.os.Bundle;

/**
 * @author Star
 */
public interface IObserver {
    /**
     * server回傳資料
     * note: bundle key可以參考variable/object/UpdateChangeObject
     * @param type
     * @param data
     */
    void updateChange(ObserverType type,Bundle data);
}
