package com.variable.object;

import android.Manifest;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.wifi.ScanResult;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.os.Bundle;
import android.telephony.TelephonyManager;

import com.karumi.dexter.Dexter;
import com.karumi.dexter.MultiplePermissionsReport;
import com.karumi.dexter.PermissionToken;
import com.karumi.dexter.listener.PermissionDeniedResponse;
import com.karumi.dexter.listener.PermissionGrantedResponse;
import com.karumi.dexter.listener.PermissionRequest;
import com.karumi.dexter.listener.multi.MultiplePermissionsListener;
import com.karumi.dexter.listener.single.PermissionListener;
import com.log.Logger;
import com.variable.key.SharePreferenceKey;
import com.variable.utility.CommonUtility;
import com.variable.utility.LocaleUtility;

import java.util.List;
import java.util.UUID;

/**
 * 20150714[star] create
 */
public class PhoneInfo {
    public static final String TAG = PhoneInfo.class.getSimpleName();
    /**
     * 記錄版本
     */
    public static int SDK_VERSION;
    /**
     * 記錄手機的UniqueID
     */
    public static String UniqueID;
    /**
     * 記錄手機的語言
     */
    public static String LANGUAGE;

    /**
     * 初始化PhonInfo
     * @param context
     */
    public static void init(Context context){
        SDK_VERSION = Build.VERSION.SDK_INT;

        SharedPreferences sharedPreferences = CommonUtility.getSharedPreferences(context);
        UniqueID = sharedPreferences.getString(SharePreferenceKey.UNIQUE_ID, "");
        if(UniqueID.equals("")){
            UniqueID = UUID.randomUUID().toString();
            sharedPreferences.edit().putString(SharePreferenceKey.UNIQUE_ID, UniqueID).commit();
        }
        LANGUAGE = LocaleUtility.getLanguage(context);

        Logger.d("init SDK_VERSION=" + SDK_VERSION);
        Logger.d("init UNIQUE_ID=" + UniqueID);
        Logger.d("init LANGUAGE=" + LANGUAGE);
    }

    public static Bundle createBundle(){
        Logger.d("createBundle SDK_VERSION=" + SDK_VERSION);
        Logger.d("createBundle UNIQUE_ID=" + UniqueID);
        Logger.d("createBundle LANGUAGE=" + LANGUAGE);

        Bundle bundle = new Bundle();
        bundle.putInt("SDK_VERSION", SDK_VERSION);
        bundle.putString("UNIQUE_ID", UniqueID);
        bundle.putString("LANGUAGE", LANGUAGE);
        return bundle;
    }

    public static void restoreBundle(Bundle bundle){
        SDK_VERSION = bundle.getInt("SDK_VERSION");
        UniqueID = bundle.getString("UNIQUE_ID");
        LANGUAGE = bundle.getString("LANGUAGE");

        Logger.d("restoreBundle SDK_VERSION="+SDK_VERSION);
        Logger.d("restoreBundle UNIQUE_ID="+UniqueID);
        Logger.d("restoreBundle LANGUAGE="+LANGUAGE);
    }
}
