package com.variable.object;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;

import com.log.Logger;
import com.variable.utility.CommonUtility;

/**
 * @author Star
 */
public class SettingInfo {
    public static final String TAG = AppInfo.class.getSimpleName();

    /**
     * 開/關推撥通知
     */
    public static boolean switchNotification;
    /**
     * 開/關訊息內容
     */
    public static boolean switchReplyContent;
    /**
     * 決定push要不要發出通知聲音
     * true:發出
     * false:不發出
     */
    public static boolean isPushSound;

    public static Bundle createBundle(){
        Logger.d("createBundle switchNotification=" + switchNotification);
        Logger.d("createBundle switchReplyContent=" + switchReplyContent);
        Logger.d("createBundle isPushSound=" + isPushSound);

        Bundle bundle = new Bundle();
        bundle.putBoolean("switchNotification", switchNotification);
        bundle.putBoolean("switchReplyContent", switchReplyContent);
        bundle.putBoolean("isPushSound", isPushSound);
        return bundle;
    }

    public static void restoreBundle(Bundle bundle){
        switchNotification = bundle.getBoolean("switchNotification");
        switchReplyContent = bundle.getBoolean("switchReplyContent");
        isPushSound = bundle.getBoolean("isPushSound");

        Logger.d("restoreBundle switchNotification=" + switchNotification);
        Logger.d("restoreBundle switchReplyContent=" + switchReplyContent);
        Logger.d("restoreBundle isPushSound=" + isPushSound);
    }

    public static void init(Context context) {
        SharedPreferences sharedPreferences = CommonUtility.getSharedPreferences(context);

    }
}
