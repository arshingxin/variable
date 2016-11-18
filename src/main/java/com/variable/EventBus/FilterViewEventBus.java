package com.variable.EventBus;


/**
 * @author Star
 */
public class FilterViewEventBus {
    private String showFormType;

    public FilterViewEventBus(String showFormType) {
        this.showFormType = showFormType;
    }

    public String getShowFormType(){
        return showFormType;
    }
}
