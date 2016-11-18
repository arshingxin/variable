package com.variable.utility;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.inputmethod.InputMethodManager;

/**
 * @author Star
 */
public class KeyboardUtility {
    /**
     * 手動關閉鍵盤,如果鍵盤已經關閉就不動作
     * @param activity
     * @param v
     */
    public static void hiddenKeyboard(Activity activity,View v) {
        // 取得輸入鍵盤狀態
        InputMethodManager inputMethodManager = (InputMethodManager) activity.getSystemService(Context.INPUT_METHOD_SERVICE);
        if(null != v){
            inputMethodManager.hideSoftInputFromWindow(v.getWindowToken(), 0);
        }
    }

    /**
     * 手動開啟鍵盤,如果鍵盤已經開啟就不動作
     * @param activity
     * @param v
     */
    public static void showKeyboard(Activity activity,View v) {
        // 取得輸入鍵盤狀態
        InputMethodManager inputMethodManager = (InputMethodManager) activity.getSystemService(Context.INPUT_METHOD_SERVICE);
        if(null != v){
            inputMethodManager.showSoftInputFromInputMethod(v.getWindowToken(), 0);
        }
    }
}
