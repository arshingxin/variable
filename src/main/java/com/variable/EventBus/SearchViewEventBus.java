package com.variable.EventBus;

/**
 * @author Star
 */
public class SearchViewEventBus {
    private String searchKeyWord;

    public SearchViewEventBus(String searchKeyWord) {
        this.searchKeyWord = searchKeyWord;
    }

    public String getSearchKeyWord(){
        return searchKeyWord;
    }
}
