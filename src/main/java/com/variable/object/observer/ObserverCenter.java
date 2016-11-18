package com.variable.object.observer;

import android.os.Bundle;

import java.util.ArrayList;

/**
 * @author Star
 */
public class ObserverCenter implements IObserbable{
    private ArrayList<IObserver> updateData = new ArrayList<IObserver>();

    @Override
    public void registerObserver(IObserver o, ObserverType type) {
        switch (type) {
            case UPDATE_DATA:
                if(false==updateData.contains(o)){
                    updateData.add(o);
                }
                break;
        }
    }

    @Override
    public void removeObserver(IObserver o, ObserverType type) {
        switch (type) {
            case UPDATE_DATA:
                if(true==updateData.contains(o)){
                    updateData.remove(o);
                }
                break;
        }
    }

    @Override
    public void notifyObserver(ObserverType type, Bundle data) {
        switch (type) {
            case UPDATE_DATA:
//                int count = getObserverSize(ObserverType.UPDATE_DATA);
//                for (int i=0;i<count;i++){
//                    updateData.get(i).updateChange(type, data);
//                }
                for (IObserver o : updateData) {
                    o.updateChange(type, data);
                }
                break;
        }
    }

    @Override
    public int getObserverSize(ObserverType type) {
        switch (type) {
            case UPDATE_DATA:
                return updateData.size();
        }
        return 0;
    }
}
