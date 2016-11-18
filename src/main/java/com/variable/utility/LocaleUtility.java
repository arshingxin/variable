package com.variable.utility;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;

import com.log.Logger;

import java.util.Locale;

/**
 * 語言選擇工具
 * @author Star
 * PS:
 * 1. AndroidManifest加入android.permission.CHANGE_CONFIGURATION
 * 2. Application onCreate加入LocaleUtility.onCreate
 * */
public class LocaleUtility {
    private static final String TAG = LocaleUtility.class.getSimpleName();
    private static final String SELECTED_LANGUAGE = "LocaleUtility.Selected.Language";

    public static final String TW = "zh";
    public static final String ENGLISH = "en";

    /**
     * 採用使用者系統設定
     * @param context
     */
    public static void onCreate(Context context) {
        String lang = getUserSelect(context, context.getResources().getConfiguration().locale.getLanguage());
        setLocale(context, lang);
    }

    /**
     * 指定預設APP語言
     * @param context
     * @param defaultLanguage
     */
    public static void onCreate(Context context, String defaultLanguage) {
        String lang = getUserSelect(context, defaultLanguage);
        setLocale(context, lang);
    }

    /**
     * 取得使用者系統設定語言
     * @param context
     * @return
     */
    public static String getLanguage(Context context) {
        return getUserSelect(context, context.getResources().getConfiguration().locale.getLanguage());
    }

    /**
     * 設定語言
     * @param context
     * @param language
     */
    public static void setLocale(Context context, String language) {
        setUserSelect(context, language);
        updateResources(context);
    }

    /**
     * 取得使用者前一次選取的語言
     * @param context
     * @param defaultLanguage
     * @return
     */
    private static String getUserSelect(Context context, String defaultLanguage) {
        return CommonUtility.getSharedPreferences(context).getString(SELECTED_LANGUAGE, defaultLanguage);
    }

    /**
     * 記錄使用者選取的語言
     * @param context
     * @param language
     */
    private static void setUserSelect(Context context, String language) {
        CommonUtility.getSharedPreferences(context).edit().putString(SELECTED_LANGUAGE, language).commit();
    }

    /**
     * 更新要取用的res
     * @param context
     */
    private static void updateResources(Context context) {
        Locale locale = context.getResources().getConfiguration().locale;
        Logger.d("updateResources locale=" + locale);
        Locale.setDefault(locale);
        Resources resources = context.getResources();
        Configuration configuration = resources.getConfiguration();
        configuration.locale = locale;
        resources.updateConfiguration(configuration, resources.getDisplayMetrics());
    }
}
