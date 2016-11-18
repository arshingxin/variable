package com.variable.object.observer;

import android.os.Bundle;

/**
 * @author Star
 */
public interface IObserbable {
    void registerObserver(IObserver o,ObserverType type);
    void removeObserver(IObserver o,ObserverType type);
    void notifyObserver(ObserverType type,Bundle data);
    int getObserverSize(ObserverType type);
}
