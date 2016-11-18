package com.variable.utility;

import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Looper;
import android.util.Base64;
import android.widget.TextView;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.google.android.gms.gcm.GoogleCloudMessaging;
import com.log.Logger;
import com.variable.R;
import com.variable.key.SharePreferenceKey;
import com.variable.network.Object.NetworkStatus;
import com.variable.object.AppInfo;
import com.variable.object.DateBigSmallObject;
import com.variable.object.PhoneInfo;

import org.greenrobot.eventbus.EventBus;

import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Properties;
import java.util.TimeZone;

import static android.content.Context.CLIPBOARD_SERVICE;

/**
 * 共用方法
 * 20150714[star] create
 * 20150801[star] 加入isNetworkConnected
 */
public class CommonUtility {
    private static final String TAG = CommonUtility.class.getSimpleName();
    private static final boolean DEBUG = false;
    private static final long DATE_TIME = 1000L;
    private static final int PLAY_SERVICES_RESOLUTION_REQUEST = 9000;
    private static final int DEFAULT_COMPRESS_RATIO = 50;

    private static Properties messageProperties;
    private static Properties configProperties;

    public static SharedPreferences getSharedPreferences(Context context) {
        return context.getSharedPreferences(context.getPackageName() + "_preferences", Context.MODE_PRIVATE);
    }

    public static synchronized Properties getConfigProperties(Context context)
    {
        return getConfigProperties(context, false);
    }

    public static synchronized Properties getConfigProperties(Context context, boolean reset)
    {
        if(true==reset){
            configProperties = null;
        }

        if(configProperties == null || configProperties.size() <= 0)
        {
            if(configProperties == null)
            {
                configProperties = new Properties();
            }
            if(PhoneInfo.LANGUAGE.equals(LocaleUtility.TW)){
                loadProperties(context, R.raw.config, configProperties);
            }else if(PhoneInfo.LANGUAGE.equals(LocaleUtility.ENGLISH)){
                loadProperties(context, R.raw.config_en, configProperties);
            }else {
                loadProperties(context, R.raw.config, configProperties);
            }
        }

        return configProperties;
    }

    public static synchronized Properties getMessageProperties(Context context)
    {
        return getMessageProperties(context, false);
    }

    public static synchronized Properties getMessageProperties(Context context, boolean reset)
    {
        if(true==reset){
            messageProperties = null;
        }

        if(messageProperties == null || messageProperties.size() <= 0)
        {
            if(messageProperties == null)
            {
                messageProperties = new Properties();
            }
            if(PhoneInfo.LANGUAGE.equals(LocaleUtility.TW)){
                loadProperties(context, R.raw.message, messageProperties);
            }else if(PhoneInfo.LANGUAGE.equals(LocaleUtility.ENGLISH)){
                loadProperties(context, R.raw.message_en, messageProperties);
            }else{
                loadProperties(context, R.raw.message, messageProperties);
            }
        }

        return messageProperties;
    }

    private static void loadProperties(Context context, int propertiesID, Properties properties)
    {
        InputStream is = context.getResources().openRawResource(propertiesID);

        if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.GINGERBREAD)
        {
            InputStreamReader isr = null;

            try
            {
                isr = new InputStreamReader(is, "UTF-8");
            }
            catch (UnsupportedEncodingException e1)
            {}

            try
            {
                if(isr == null)
                {
                    properties.load(is);
                }
                else
                {
                    properties.load(isr);
                }
            }
            catch (IOException e)
            {}
        }
        else
        {
            try
            {
                ByteArrayOutputStream outStream = new ByteArrayOutputStream();
                byte[] data = new byte[4096];
                int count = -1;

                while((count = is.read(data, 0, 4096)) != -1)
                {
                    outStream.write(data, 0, count);
                }

                convertPropertiesEncode(properties, readString(outStream.toByteArray()));
            }
            catch (IOException e)
            {}
        }
    }

    public static String readString(byte[] b)
    {
        return b == null?null:readString(b, 0, b.length);
    }

    public static String readString(byte[] b, int position, int len)
    {
        try
        {
            return new String(b, position, len, "UTF-8").trim();
        }
        catch(UnsupportedEncodingException ex)
        {
            ex.printStackTrace();
            return "";
        }
        catch(RuntimeException ex)
        {
            ex.printStackTrace();
            return "";
        }
    }

    public static byte[] readBytes(String src)
    {
        try
        {
            return src.getBytes("UTF-8");
        }
        catch(UnsupportedEncodingException ex)
        {
            ex.printStackTrace();
            return null;
        }
    }


    /**
     * 檢查Google Play Service
     * @param activity
     * @return
     */
    public static boolean checkPlayServices(final Activity activity) {
        Logger.d("checkPlayServices");
        final int resultCode = GooglePlayServicesUtil.isGooglePlayServicesAvailable(activity);
        if (resultCode != ConnectionResult.SUCCESS) {
            if (GooglePlayServicesUtil.isUserRecoverableError(resultCode)) {
                Looper.prepare();
                GooglePlayServicesUtil.getErrorDialog(resultCode, activity, PLAY_SERVICES_RESOLUTION_REQUEST).show();
                Looper.loop();
            } else {
                Logger.e("isUserRecoverableError = false");
            }
            return false;
        }
        return true;
    }

    /**
     * 20150801[star] 偵測網路狀態
     * @param act
     * @return
     */
    public static boolean isNetworkConnected(Activity act) {
        return isNetworkConnected(act, false);
    }

    /**
     * 回傳網路狀態
     * @param act
     * @param sendCallBack true: 觸發onEvent回傳, false: 不觸發onEvent
     * @return
     */
    public static boolean isNetworkConnected(Activity act, boolean sendCallBack) {
        return updateNetworkStatus(act, sendCallBack);
    }

    private static void convertPropertiesEncode(Properties properties,String data) {
        String [] temp = data.split("\r\n");
        int index;
        String tmp1;
        String tmp2;
        for(int i=0;i<temp.length;i++) {
            index=temp[i].indexOf("=");
            if(index==-1)
                continue;
            tmp1=temp[i].substring(0, index);
            tmp2=temp[i].substring(index+1, temp[i].length());
            properties.setProperty(tmp1,tmp2);
        }
    }

    /**
     * 轉換long to date (DEFAULT: yyyy/MM/dd HH:mm:ss)
     * @param activity
     * @param timestamp
     * @return
     */
    public static String convertLongToDate(Activity activity, String timestamp){
        return convertLongToDate(activity, null, timestamp);
    }

    /**
     * 轉換long to date (DEFAULT: yyyy/MM/dd HH:mm:ss)
     * @param activity
     * @param newFormat 帶null會跑預設format
     * @param timestamp
     * @return
     */
    public static String convertLongToDate(Activity activity, String newFormat, String timestamp){
        if(timestamp==null){
            return "";
        }
        long dateTime = 0;
        try {
            dateTime = Long.valueOf(timestamp.contains(".")?timestamp.split("\\.")[0]:timestamp);
        }catch (Exception e){
            e.printStackTrace();
        }
        return convertLongToDate(activity, newFormat, dateTime);
    }

    /**
     * 轉換long to date (DEFAULT: yyyy/MM/dd HH:mm:ss)
     * @param activity
     * @param timestamp
     * @return
     */
    public static String convertLongToDate(Activity activity, long timestamp){
        return convertLongToDate(activity, null, timestamp);
    }

    /**
     * 轉換long to date (DEFAULT: yyyy/MM/dd HH:mm:ss)
     * @param activity
     * @param newFormat 帶null會跑預設format
     * @param timestamp
     * @return
     */
    public static String convertLongToDate(Activity activity, String newFormat, long timestamp){
        //本地時區
        Calendar nowCal = Calendar.getInstance();
        TimeZone localZone = nowCal.getTimeZone();
        boolean isToday = false;
        if(newFormat==null){
            String dateFormat = getConfigProperties(activity).getProperty("DATE_FORMAT");
            if(new SimpleDateFormat(dateFormat).format(new Date().getTime())
                    .equals(new SimpleDateFormat(dateFormat).format(timestamp*DATE_TIME))){
                isToday = true;
            }
        }
        String defaultFormat = getConfigProperties(activity).getProperty("DATE_AND_TIME_FORMAT");
        if(isToday){
            defaultFormat = getConfigProperties(activity).getProperty("TIME_TODAY");
        }
        SimpleDateFormat sdf = new SimpleDateFormat(null==newFormat?defaultFormat:newFormat);
        //設定SDF的時區為本地
        sdf.setTimeZone(localZone);
        Logger.d(TAG+"=time zone name="+sdf.getTimeZone().getDisplayName()+"=time zone id="+sdf.getTimeZone().getID());
        return (isToday?getConfigProperties(activity).getProperty("TODAY_TEXT")+" ":"") + sdf.format(new Date(timestamp*DATE_TIME));
    }

    /**
     * 轉換 date to long (DEFAULT: yyyy/MM/dd HH:mm:ss)
     * @param activity
     * @param date
     * @return
     */
    public static String convertDateToTimestamp(Activity activity, String date){
        return convertDateToTimestamp(activity, null, date);
    }

    /**
     * 轉換 date to long (DEFAULT: yyyy/MM/dd HH:mm:ss)
     * @param activity
     * @param newFormat 帶null會跑預設format
     * @param date
     * @return
     */
    public static String convertDateToTimestamp(Context activity, String newFormat, String date){
        DateFormat formatter = new SimpleDateFormat(null==newFormat?getConfigProperties(activity).getProperty("DATE_AND_TIME_FORMAT"):newFormat);
        Date finalDate = null;
        try {
            finalDate = formatter.parse(date);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        if(finalDate==null){
            return "";
        }else{
            return Long.toString(finalDate.getTime()/DATE_TIME);
        }
    }

    /**
     * 轉換 date to long (DEFAULT: yyyy/MM/dd HH:mm:ss)
     * @param activity
     * @param date
     * @return
     */
    public static long convertDateToLongTimestamp(Activity activity, String date){
        return convertDateToLongTimestamp(activity, null, date);
    }

    /**
     * 轉換 date to long (DEFAULT: yyyy/MM/dd HH:mm:ss)
     * @param activity
     * @param newFormat 帶null會跑預設format
     * @param date
     * @return
     */
    public static long convertDateToLongTimestamp(Activity activity, String newFormat, String date){
        DateFormat formatter = new SimpleDateFormat(null==newFormat?getConfigProperties(activity).getProperty("DATE_AND_TIME_FORMAT"):newFormat);
        Date finalDate = null;
        try {
            finalDate = formatter.parse(date);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        if(finalDate==null){
            return 0;
        }else{
            return finalDate.getTime()/DATE_TIME;
        }
    }

    /**
     * 比較date大小
     * {@link com.variable.object.DateBigSmallObject}
     * @param activity
     * @param s1
     * @param s2
     * @param newFormat
     * @return
     */
    public static int compareDate(Activity activity, String s1, String s2, String newFormat){
        DateFormat formatter = new SimpleDateFormat(null==newFormat?getConfigProperties(activity).getProperty("DATE_AND_TIME_FORMAT"):newFormat);
        Date dt1 = null;
        try {
            dt1 = formatter.parse(s1);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        Date dt2 = null;
        try {
            dt2 = formatter.parse(s2);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        if(dt1!=null && dt2!=null){
            if(dt1.getTime()>dt2.getTime()){
                return DateBigSmallObject.BIG;
            }else if(dt1.getTime()<dt2.getTime()){
                return DateBigSmallObject.SMALL;
            }else{
                return DateBigSmallObject.EQUAL;
            }
        }else{
            return DateBigSmallObject.EQUAL;
        }
    }

    /**
     * 取得UTC標準時間
     * @return
     */
    public static String getTimeStamp() {
        Long tsLong = System.currentTimeMillis()/DATE_TIME;
        String ts = tsLong.toString();
        Logger.d("getTimeStamp="+ts);
        return ts;
    }

    /**
     * 取得今天日期
     * 預設Format: yyyy/MM/dd
     * @param activity
     * @return
     */
    public static String getCurrentDate(Context context){
        return getCurrentDate(context, null);
    }

    /**
     * 取得今天日期的timestamp
     * @param activity
     * @param newFormat
     * @return
     */
    public static String getCurrentDate(Context context, String newFormat){
        Calendar calendar = Calendar.getInstance();
        String convertFormat = null==newFormat?getConfigProperties(context).getProperty("DATE_FORMAT"):newFormat;
        DateFormat formatter = new SimpleDateFormat(convertFormat);
        String formattedDate = formatter.format(calendar.getTime());
        return convertDateToTimestamp(context, convertFormat, formattedDate);
    }

    /**
     * 更新網路狀態
     * @param activity
     * @return
     */
    public static boolean updateNetworkStatus(Activity activity){
        Logger.d("updateNetworkStatus");
        return updateNetworkStatus(activity, true);
    }

    /**
     * 更新網路狀態
     * @param activity
     * @param sendCallBack true: 觸發onEvent回傳, false: 不觸發onEvent
     * @return
     */
    public static boolean updateNetworkStatus(Activity activity, boolean sendCallBack){
        Logger.d("updateNetworkStatus");
        ConnectivityManager manager = (ConnectivityManager)activity.getSystemService(activity.CONNECTIVITY_SERVICE);
        Logger.d("updateNetworkStatus PhoneInfo.SDK_VERSION="+PhoneInfo.SDK_VERSION);
        if(PhoneInfo.SDK_VERSION>=Build.VERSION_CODES.LOLLIPOP){
            Network[] networs = manager.getAllNetworks();
            NetworkInfo networkInfo;
            int count = networs.length;
            Logger.d("updateNetworkStatus networs.length="+networs.length);
            if(count==0){
                AppInfo.isNetworkConnected = false;
            }else{
                for (int i=0;i<count;i++){
                    networkInfo = manager.getNetworkInfo(networs[i]);
                    if ((networkInfo.getType()==ConnectivityManager.TYPE_WIFI //屬於WIFI
                            || networkInfo.getType()==ConnectivityManager.TYPE_MOBILE //屬於行動網路
                            || networkInfo.getType()==ConnectivityManager.TYPE_ETHERNET) //屬於有線網路
                            && networkInfo.getState().equals(NetworkInfo.State.CONNECTED)) {
                        AppInfo.isNetworkConnected = true;
                        Logger.d("updateNetworkStatus getType="+networkInfo.getType());
                        Logger.d("updateNetworkStatus getState="+networkInfo.getState());
                        break;
                    }else{
                        AppInfo.isNetworkConnected = false;
                        Logger.d("updateNetworkStatus getState="+networkInfo.getState().equals(NetworkInfo.State.CONNECTED));
                    }
                }
            }
        }else{
            boolean is3g = false;
            boolean isWifi = false;
            boolean isEthernet = false;
            boolean isWiMax = false;
            NetworkInfo mobNetInfoActivity = manager.getActiveNetworkInfo();
            if(mobNetInfoActivity!=null && mobNetInfoActivity.isConnected() && mobNetInfoActivity.isAvailable()){
                int networkType = mobNetInfoActivity.getType();
                switch (networkType){
                    case ConnectivityManager.TYPE_MOBILE:
                        is3g = true;
                        break;
                    case ConnectivityManager.TYPE_WIFI:
                        isWifi = true;
                        break;
                    case ConnectivityManager.TYPE_ETHERNET:
                        isEthernet = true;
                        break;
                    case ConnectivityManager.TYPE_WIMAX:
                        isWiMax = true;
                        break;
                    default:
                        break;
                }
            }
            AppInfo.isNetworkConnected = is3g|isWifi|isEthernet|isWiMax;
        }

        /**
         * 網路斷線, 一律通知
         */
        if(false==AppInfo.isNetworkConnected){
            EventBus.getDefault().post(new NetworkStatus(activity, NetworkStatus.NOT_CONNECTED));
        }else{
            if(sendCallBack){
                if(true==AppInfo.isNetworkConnected){
                    EventBus.getDefault().post(new NetworkStatus(activity, NetworkStatus.IS_OK));
                }else{
                    EventBus.getDefault().post(new NetworkStatus(activity, NetworkStatus.NOT_CONNECTED));
                }
            }
        }

        Logger.d("updateNetworkStatus isNetworkConnected="+AppInfo.isNetworkConnected);
        return AppInfo.isNetworkConnected;
    }

    /**
     * 重新載入新的設定/文字檔
     * @param context
     */
    public static boolean resetLanguage(Context context) {
        String language = context.getResources().getConfiguration().locale.getLanguage();
        /**
         * 如果先前選擇的語系與目前語系不同時
         */
        if(false==PhoneInfo.LANGUAGE.equals(language)){
            /**
             * 將語系設為目前語系
             */
            LocaleUtility.setLocale(context, language);
            PhoneInfo.LANGUAGE = LocaleUtility.getLanguage(context);
            /**
             * 載入新語系設定/文字檔
             */
            messageProperties = CommonUtility.getMessageProperties(context, true);
            configProperties = CommonUtility.getConfigProperties(context, true);
            return true;
        }else{
            Logger.d("No change language!");
            return false;
        }
    }

    /**
     * 註冊 Google GCM
     * @param activity
     * @return true: 重新註冊 false: 沒有重新註冊
     */
    public static boolean registerGoogleGCM(Activity activity){
        Logger.d("registerGoogleGCM");
        /**
         * 沒有註冊 local push token 或版本變更則需要取得新的
         * 24H檢查一次
         */
        if (false==AppInfo.versionName.equals(AppInfo.preVersionName)
                || checkOver24H(getSharedPreferences(activity).getLong(SharePreferenceKey.REGISTER_PUSH_TIME, 0))){
            Logger.d("Reset RegID as null");
            AppInfo.registerID = "";
            if(true==AppInfo.isCNVersion){
                AppInfo.registerID = "";
            }else{
                if(true==CommonUtility.checkPlayServices(activity)){
                    try {
                        GoogleCloudMessaging gcm = GoogleCloudMessaging.getInstance(activity);
                        Logger.d("registerGCM Sender ID="+ AppInfo.GCMSenderId);
                        AppInfo.registerID = gcm.register(AppInfo.GCMSenderId);
                        Logger.d("registerGCM regId = " + AppInfo.registerID);
                    } catch (IOException e) {
                        e.printStackTrace();
                        AppInfo.registerID = "";
                        Logger.e("Get GCM register id ERROR!");
                    }
                }else{
                    Logger.e("Setup Google Play Service & Google Cloud Service ERROR!");
                }
            }
            getSharedPreferences(activity).edit()
                    .putString(SharePreferenceKey.REGISTER_ID, AppInfo.registerID).apply();
            getSharedPreferences(activity).edit()
                    .putString(SharePreferenceKey.PRE_APP_VERSION, AppInfo.versionName).apply();
            AppInfo.preVersionName = AppInfo.versionName;
            return true;
        }else{
            Logger.d("Already has regid=" + AppInfo.registerID);
            return false;
        }
    }

    /**
     * 檢查是否超過24小時
     * true: 超過24小時
     * @param timestamp 以秒為單位
     * @return
     */
    public static boolean checkOver24H(long timestamp) {
        Logger.d("checkOver24H");
        return checkOverDay(timestamp, 1);
    }

    /**
     * 檢查timestamp是否超過指定days日數
     * @param timestamp 以秒為單位
     * @param days 超過天數
     * @return
     */
    public static boolean checkOverDay(long timestamp, int days){
        long currentTime = System.currentTimeMillis()/1000;
        /**
         * 1Day = 24H = 1440分鐘 = 1440x60秒
         */
        long time = currentTime - timestamp;
        return (time>=1440*60*days)?true:false;
    }

    /**
     * 取得days天前的timestamp
     * @param days 往前推算天數
     * @return
     */
    public static String getBeforeDay(Context context, int days){
        long currentTime = Long.parseLong(getCurrentDate(context));
        /**
         * 1Day = 24H = 1440分鐘 = 1440x60秒
         */
        currentTime = currentTime - 1440*60*days;
        return Long.toString(currentTime);
    }

    /**
     * 判斷是否為正確的Email格式
     * @param content
     * @return
     */
    public static boolean isVaildEmailFormat(String content){
        return android.util.Patterns.EMAIL_ADDRESS.matcher(content).matches();
    }

    /**
     * 回收bitmap
     * @param bitmap
     */
    public static void recycleBitmap(Bitmap bitmap){
        if(null!=bitmap && false==bitmap.isRecycled()){
            bitmap.recycle();
            System.gc();
        }else{
            System.gc();
        }
    }

    /**
     * Bitmap to Base64
     * {@value DEFAULT_COMPRESS_RATIO}
     * @param bitmap
     * @return
     */
    public static String bitmapToBase64(Bitmap bitmap){
        return bitmapToBase64(bitmap, DEFAULT_COMPRESS_RATIO);
    }

    /**
     * Bitmap to Base64
     * @param bitmap
     * @param compressRatio 30表示壓縮70%, 70表示壓縮30%, 100為不壓縮, 預設{@value DEFAULT_COMPRESS_RATIO}
     * @return
     */
    public static String bitmapToBase64(Bitmap bitmap, int compressRatio){
        if(bitmap==null){
            return null;
        }
        ByteArrayOutputStream b = null;
        byte[] byteArray = null;
        try {
            b = new ByteArrayOutputStream();
            bitmap.compress(Bitmap.CompressFormat.JPEG, compressRatio, b);
            byteArray = b.toByteArray();
        }finally {
            try {
                if(b != null){
                    b.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            if(bitmap!=null){
                bitmap.recycle();
            }
        }
        return Base64.encodeToString(byteArray, Base64.NO_WRAP);
    }

    /**
     * Base64 to Bitmap
     * @param base64
     * @return
     */
    public static Bitmap base64ToBitmap(String base64){
        return base64ToBitmap(base64, DEFAULT_COMPRESS_RATIO);
    }

    /**
     * Base64 to Bitmap
     * @param base64
     * @param compressRatio 30表示壓縮70%, 70表示壓縮30%, 100為不壓縮, 預設{@value DEFAULT_COMPRESS_RATIO}
     * @return
     */
    public static Bitmap base64ToBitmap(String base64, int compressRatio){
        if(base64==null || base64.length()==0){
            return null;
        }
        byte[] decodedByte = Base64.decode(base64.getBytes(), Base64.NO_WRAP);
        Bitmap bitmap = BitmapFactory.decodeByteArray(decodedByte, 0, decodedByte.length);
        ByteArrayOutputStream b = null;
        try {
            b = new ByteArrayOutputStream();
            bitmap.compress(Bitmap.CompressFormat.JPEG, compressRatio, b);
        }finally {
            try {
                if(b != null){
                    b.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return bitmap;
    }

    public static byte[] base64ToByteArray(String base64){
        if(base64==null || base64.length()==0){
            return null;
        }
        return Base64.decode(base64.getBytes(), Base64.NO_WRAP);
    }
}
