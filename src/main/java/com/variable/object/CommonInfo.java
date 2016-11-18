package com.variable.object;

import android.os.Bundle;

import com.log.Logger;

/**
 * 20150714[star] create
 */
public class CommonInfo {
    public static final String TAG = CommonInfo.class.getSimpleName();

    public static int showMode;

    public static Bundle createBundle(){
        Logger.d("createBundle showMode=" + showMode);

        Bundle bundle = new Bundle();
        bundle.putInt("showMode", showMode);
        return bundle;
    }

    public static void restoreBundle(Bundle bundle){
        showMode = bundle.getInt("showMode");

        Logger.d("restoreBundle showMode="+showMode);
    }
}
