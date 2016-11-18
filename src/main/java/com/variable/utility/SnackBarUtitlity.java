package com.variable.utility;

import android.app.Activity;
import android.support.design.widget.Snackbar;
import android.view.View;

/**
 * Created by star on 2016/11/7.
 */
public class SnackBarUtitlity {
    /**
     * 顯示SnackBar訊息
     * @param layout
     * @param message
     * @return Snackbar
     */
    public static Snackbar showMessage(View layout, String message){
        return showMessage(layout, message, Snackbar.LENGTH_SHORT);
    }

    /**
     * 顯示SnackBar訊息
     * @param layout
     * @param message
     * @param showTime
     * {@link Snackbar#LENGTH_SHORT}
     * {@link Snackbar#LENGTH_LONG}
     * @return Snackbar
     */
    public static Snackbar showMessage(View layout, String message, int showTime){
        Snackbar snackbar = Snackbar.make(layout, message, showTime);
        return snackbar;
    }



}
