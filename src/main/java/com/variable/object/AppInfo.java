package com.variable.object;

import android.os.Bundle;
import android.os.Parcelable;

import com.log.Logger;

/**
 * 20150722[Star] created.
 */
public class AppInfo {
    public static final String TAG = AppInfo.class.getSimpleName();

    public static String packageName;
    public static String productId;
    public static String appName;
    /**
     * app環境1:Product, 2:QA
     */
    public static int appEvn;
    /**
     * app 最新版號
     */
    public static String versionName;
    /**
     * app 上架到Google的版號
     */
    public static String versionCode;
    /**
     * app 當前版號
     */
    public static String preVersionName;
    public static String ADID;
    /**
     * GCM Sender Id
     */
    public static String GCMSenderId;
    /**
     * serverIP
     */
    public static String serverIP;
    /**
     * serviceQueue
     */
    public static String serviceQueue;
    public static String QNAME_IMG;
    public static String QNAME_REG;
    public static String drsUrl;
    public static String drsASMX;
    public static String drsPort;
    /**
     * serverPort
     */
    public static String serverPort;
    /**
     * registerID
     */
    public static String registerID;
    /**
     * 系統代碼A:android, I:IOS
     */
    public static String osType;
    /**
     * userName
     */
    public static String userName;
    /**
     * userNo
     */
    public static String userNo;
    /**
     * userId version1
     */
    public static String userId;
    /**
     * userEmail
     */
    public static String userEmail;
    /**
     * userLocalName
     */
    public static String userLocalName;
    /**
     * userNote
     */
    public static String userNote;
    /**
     * hasRegister
     */
    public static boolean hasRegister;
    /**
     * 網路是否連線
     */
    public static boolean isNetworkConnected = true;
    /**
     * 傳圖
     */
    public static String uploadImagUrl;
    /**
     * 取圖
     */
    public static String getImagUrl;
    /**
     * 資料庫版本
     */
    public static int dbVersion;
    /**
     * 公司統一編號
     */
    public static String companyTaxId;
    /**
     * 是否為大陸版本
     */
    public static boolean isCNVersion;
    /**
     * 判斷app是否在背景
     */
    public static boolean isAppBackground;
    /**
     * 系統碼
     */
    public static String systemCode;
    /**
     * 設備名稱
     */
    public static String deviceName;
    /**
     * 螢幕直式的寬
     */
    public static int WIDTH;
    /**
     * 螢幕直式的高
     */
    public static int HEIGHT;
    /**
     * CircleStar版本
     * 1: CircleStar 1.0
     * 2: CircleStar 2.0
     */
    public static String productVersion;
    /**
     * 延遲傳送TX的時間
     * define: res/string.xml/R.integer.delay_tx_time
     */
    public static int delayTXTime;
    /**
     * DB資料是否完整
     */
    public static boolean dbHasCompleted;
    /**
     * 預設列表顯示個數
     */
    public static int defautShowLimit;
    /**
     * 背景同步延遲時間
     */
    public static int backgroundSyncDelayTime;
    /**
     * Event / Message 文字最多顯示行數
     */
    public static int maxLineNumber;
    /**
     * 記錄使用者離開app日期
     */
    public static String recordUserExitTime;
    /**
     * 連按2下back的延遲時間(關閉app)
     */
    public static int backKeyDelayTime;
    /**
     * 暫存Event/Reply/BigImage長度, 注意: 太長會存不進DB
     */
    public static int dbTmpLength;
    /**
     * 點選Reply image的位置
     */
    public static int clickReplyPostion;
    /**
     * 預設載入X天前的資料
     */
    public static int defaultLoadDataBeforeDays;
    /**
     * 暫存Event/Reply天數
     */
    public static int dbTmpDays;
    /**
     * Event / Reply 最小輸入字數
     */
    public static int minTextLength;
    /**
     * Event / Reply 最輸入字數
     */
    public static int maxTextLength;
    /**
     * 小圖顯示長/寬
     */
    public static int smallWidth;

    public static Bundle createBundle(){
        Logger.d("createBundle packageName="+packageName);
        Logger.d("createBundle productId="+productId);
        Logger.d("createBundle appName="+appName);
        Logger.d("createBundle appEvn="+appEvn);
        Logger.d("createBundle versionName="+versionName);
        Logger.d("createBundle versionCode="+versionCode);
        Logger.d("createBundle preVersionName="+preVersionName);
        Logger.d("createBundle ADID=" + ADID);
        Logger.d("createBundle serverIP="+serverIP);
        Logger.d("createBundle serviceQueue="+serviceQueue);
        Logger.d("createBundle QNAME_IMG=" + QNAME_IMG);
        Logger.d("createBundle QNAME_REG="+QNAME_REG);
        Logger.d("createBundle drsUrl="+drsUrl);
        Logger.d("createBundle drsASMX="+drsASMX);
        Logger.d("createBundle drsPort="+drsPort);
        Logger.d("createBundle serverPort=" + serverPort);
        Logger.d("createBundle registerID=" + registerID);
        Logger.d("createBundle osType=" + osType);
        Logger.d("createBundle userName=" + userName);
        Logger.d("createBundle userNo=" + userNo);
        Logger.d("createBundle userId=" + userId);
        Logger.d("createBundle userEmail=" + userEmail);
        Logger.d("createBundle userLocalName=" + userLocalName);
        Logger.d("createBundle userNote=" + userNote);
        Logger.d("createBundle hasRegister=" + hasRegister);
        Logger.d("createBundle isNetworkConnected=" + isNetworkConnected);
        Logger.d("createBundle uploadImagUrl=" + uploadImagUrl);
        Logger.d("createBundle getImagUrl=" + getImagUrl);
        Logger.d("createBundle dbVersion=" + dbVersion);
        Logger.d("createBundle companyTaxId=" + companyTaxId);
        Logger.d("createBundle isCNVersion=" + isCNVersion);
        Logger.d("createBundle isAppBackground=" + isAppBackground);
        Logger.d("createBundle systemCode=" + systemCode);
        Logger.d("createBundle deviceName=" + deviceName);
        Logger.d("createBundle WIDTH=" + WIDTH);
        Logger.d("createBundle HEIGHT=" + HEIGHT);
        Logger.d("createBundle productVersion=" + productVersion);
        Logger.d("createBundle delayTXTime=" + delayTXTime);
        Logger.d("createBundle dbHasCompleted=" + dbHasCompleted);
        Logger.d("createBundle defautShowLimit=" + defautShowLimit);
        Logger.d("createBundle backgroundSyncDelayTime=" + backgroundSyncDelayTime);
        Logger.d("createBundle maxLineNumber=" + maxLineNumber);
        Logger.d("createBundle recordUserExitTime=" + recordUserExitTime);
        Logger.d("createBundle backKeyDelayTime=" + backKeyDelayTime);
        Logger.d("createBundle dbTmpLength=" + dbTmpLength);
        Logger.d("createBundle clickReplyPostion=" + clickReplyPostion);
        Logger.d("createBundle defaultLoadDataBeforeDays=" + defaultLoadDataBeforeDays);
        Logger.d("createBundle dbTmpDays=" + dbTmpDays);
        Logger.d("createBundle minTextLength=" + minTextLength);
        Logger.d("createBundle maxTextLength=" + maxTextLength);
        Logger.d("createBundle smallWidth=" + smallWidth);

        Bundle bundle = new Bundle();
        bundle.putString("packageName", packageName);
        bundle.putString("productId", productId);
        bundle.putString("appName", appName);
        bundle.putInt("appEvn", appEvn);
        bundle.putString("versionName", versionName);
        bundle.putString("versionCode", versionCode);
        bundle.putString("preVersionName", preVersionName);
        bundle.putString("ADID", ADID);
        bundle.putString("serverIP", serverIP);
        bundle.putString("serviceQueue", serviceQueue);
        bundle.putString("QNAME_IMG", QNAME_IMG);
        bundle.putString("QNAME_REG", QNAME_REG);
        bundle.putString("drsUrl", drsUrl);
        bundle.putString("drsASMX", drsASMX);
        bundle.putString("drsPort", drsPort);
        bundle.putString("serverPort", serverPort);
        bundle.putString("registerID", registerID);
        bundle.putString("osType", osType);
        bundle.putString("userName", userName);
        bundle.putString("userNo", userNo);
        bundle.putString("userId", userId);
        bundle.putString("userId", userEmail);
        bundle.putString("userId", userLocalName);
        bundle.putString("userId", userNote);
        bundle.putBoolean("hasRegister", hasRegister);
        bundle.putBoolean("isNetworkConnected", isNetworkConnected);
        bundle.putString("uploadImagUrl", uploadImagUrl);
        bundle.putString("getImagUrl", getImagUrl);
        bundle.putInt("dbVersion", dbVersion);
        bundle.putString("companyTaxId", companyTaxId);
        bundle.putBoolean("isCNVersion", isCNVersion);
        bundle.putBoolean("isAppBackground", isAppBackground);
        bundle.putString("systemCode", systemCode);
        bundle.putString("deviceName", deviceName);
        bundle.putInt("WIDTH", WIDTH);
        bundle.putInt("HEIGHT", HEIGHT);
        bundle.putString("productVersion", productVersion);
        bundle.putInt("delayTXTime", delayTXTime);
        bundle.putBoolean("dbHasCompleted", dbHasCompleted);
        bundle.putInt("defautShowLimit", defautShowLimit);
        bundle.putInt("backgroundSyncDelayTime", backgroundSyncDelayTime);
        bundle.putInt("maxLineNumber", maxLineNumber);
        bundle.putString("recordUserExitTime", recordUserExitTime);
        bundle.putInt("backKeyDelayTime", backKeyDelayTime);
        bundle.putInt("dbTmpLength", dbTmpLength);
        bundle.putInt("clickReplyPostion", clickReplyPostion);
        bundle.putInt("defaultLoadDataBeforeDays", defaultLoadDataBeforeDays);
        bundle.putInt("dbTmpDays", dbTmpDays);
        bundle.putInt("minTextLength", minTextLength);
        bundle.putInt("maxTextLength", maxTextLength);
        bundle.putInt("smallWidth", smallWidth);
        return bundle;
    }

    public static void restoreBundle(Bundle bundle){
        if(bundle.containsKey("packageName"))
            packageName = bundle.getString("packageName");
        if(bundle.containsKey("productId"))
            productId = bundle.getString("productId");
        if(bundle.containsKey("appName"))
            appName = bundle.getString("appName");
        if(bundle.containsKey("appEvn"))
            appEvn = bundle.getInt("appEvn");
        if(bundle.containsKey("versionName"))
            versionName = bundle.getString("versionName");
        if(bundle.containsKey("versionCode"))
            versionCode = bundle.getString("versionCode");
        if(bundle.containsKey("preVersionName"))
            preVersionName = bundle.getString("preVersionName");
        if(bundle.containsKey("ADID"))
            ADID = bundle.getString("ADID");
        if(bundle.containsKey("serverIP"))
            serverIP = bundle.getString("serverIP");
        if(bundle.containsKey("serviceQueue"))
            serviceQueue = bundle.getString("serviceQueue");
        if(bundle.containsKey("QNAME_IMG"))
            QNAME_IMG = bundle.getString("QNAME_IMG");
        if(bundle.containsKey("QNAME_REG"))
            QNAME_REG = bundle.getString("QNAME_REG");
        if(bundle.containsKey("drsUrl"))
            drsUrl = bundle.getString("drsUrl");
        if(bundle.containsKey("drsASMX"))
            drsASMX = bundle.getString("drsASMX");
        if(bundle.containsKey("drsPort"))
            drsPort = bundle.getString("drsPort");
        if(bundle.containsKey("serverPort"))
            serverPort = bundle.getString("serverPort");
        if(bundle.containsKey("registerID"))
            registerID = bundle.getString("registerID");
        if(bundle.containsKey("osType"))
            osType = bundle.getString("osType");
        if(bundle.containsKey("userName"))
            userName = bundle.getString("userName");
        if(bundle.containsKey("userNo"))
            userNo = bundle.getString("userNo");
        if(bundle.containsKey("userId"))
            userId = bundle.getString("userId");
        if(bundle.containsKey("userEmail"))
            userEmail = bundle.getString("userEmail");
        if(bundle.containsKey("userLocalName"))
            userLocalName = bundle.getString("userLocalName");
        if(bundle.containsKey("userNote"))
            userNote = bundle.getString("userNote");
        if(bundle.containsKey("hasRegister"))
            hasRegister = bundle.getBoolean("hasRegister");
        if(bundle.containsKey("isNetworkConnected"))
            isNetworkConnected = bundle.getBoolean("isNetworkConnected");
        if(bundle.containsKey("uploadImagUrl"))
            uploadImagUrl = bundle.getString("uploadImagUrl");
        if(bundle.containsKey("getImagUrl"))
            getImagUrl = bundle.getString("getImagUrl");
        if(bundle.containsKey("dbVersion"))
            dbVersion = bundle.getInt("dbVersion");
        if(bundle.containsKey("companyTaxId"))
            companyTaxId = bundle.getString("companyTaxId");
        if(bundle.containsKey("isCNVersion"))
            isCNVersion = bundle.getBoolean("isCNVersion");
        if(bundle.containsKey("isCNVersion"))
         isAppBackground = bundle.getBoolean("isAppBackground");
        if(bundle.containsKey("systemCode"))
            systemCode = bundle.getString("systemCode");
        if(bundle.containsKey("deviceName"))
            deviceName = bundle.getString("deviceName");
        if(bundle.containsKey("WIDTH"))
            WIDTH = bundle.getInt("WIDTH");
        if(bundle.containsKey("HEIGHT"))
            HEIGHT = bundle.getInt("HEIGHT");
        if(bundle.containsKey("productVersion"))
            productVersion = bundle.getString("productVersion");
        if(bundle.containsKey("delayTXTime"))
            delayTXTime = bundle.getInt("delayTXTime");
        if(bundle.containsKey("dbHasCompleted"))
            dbHasCompleted = bundle.getBoolean("dbHasCompleted");
        if(bundle.containsKey("defautShowLimit"))
            defautShowLimit = bundle.getInt("defautShowLimit");
        if(bundle.containsKey("backgroundSyncDelayTime"))
            backgroundSyncDelayTime = bundle.getInt("backgroundSyncDelayTime");
        if(bundle.containsKey("maxLineNumber"))
            maxLineNumber = bundle.getInt("maxLineNumber");
        if(bundle.containsKey("recordUserExitTime"))
            recordUserExitTime = bundle.getString("recordUserExitTime");
        if(bundle.containsKey("backKeyDelayTime"))
            backKeyDelayTime = bundle.getInt("backKeyDelayTime");
        if(bundle.containsKey("dbTmpLength"))
            dbTmpLength = bundle.getInt("dbTmpLength");
        if(bundle.containsKey("clickReplyPostion"))
            clickReplyPostion = bundle.getInt("clickReplyPostion");
        if(bundle.containsKey("defaultLoadDataBeforeDays"))
            defaultLoadDataBeforeDays = bundle.getInt("defaultLoadDataBeforeDays");
        if(bundle.containsKey("dbTmpDays"))
            dbTmpDays = bundle.getInt("dbTmpDays");
        if(bundle.containsKey("minTextLength"))
            minTextLength = bundle.getInt("minTextLength");
        if(bundle.containsKey("maxTextLength"))
            maxTextLength = bundle.getInt("maxTextLength");
        if(bundle.containsKey("smallWidth"))
            smallWidth = bundle.getInt("smallWidth");

        Logger.d("restoreBundle packageName="+packageName);
        Logger.d("restoreBundle productId="+productId);
        Logger.d("restoreBundle appName="+appName);
        Logger.d("restoreBundle appEvn="+appEvn);
        Logger.d("restoreBundle versionName="+versionName);
        Logger.d("restoreBundle versionCode="+versionCode);
        Logger.d("restoreBundle preVersionName="+preVersionName);
        Logger.d("restoreBundle ADID="+ADID);
        Logger.d("restoreBundle serverIP="+serverIP);
        Logger.d("restoreBundle serviceQueue="+serviceQueue);
        Logger.d("restoreBundle QNAME_IMG="+QNAME_IMG);
        Logger.d("restoreBundle QNAME_REG="+QNAME_REG);
        Logger.d("restoreBundle drsUrl="+drsUrl);
        Logger.d("restoreBundle drsPort="+drsPort);
        Logger.d("restoreBundle serverPort="+serverPort);
        Logger.d("restoreBundle registerID="+registerID);
        Logger.d("restoreBundle osType="+osType);
        Logger.d("restoreBundle userName="+userName);
        Logger.d("restoreBundle userNo="+userNo);
        Logger.d("restoreBundle userId="+userId);
        Logger.d("restoreBundle userEmail="+userEmail);
        Logger.d("restoreBundle userLocalName="+userLocalName);
        Logger.d("restoreBundle userNote="+userNote);
        Logger.d("restoreBundle hasRegister="+hasRegister);
        Logger.d("restoreBundle isNetworkConnected="+isNetworkConnected);
        Logger.d("restoreBundle uploadImagUrl="+uploadImagUrl);
        Logger.d("restoreBundle getImagUrl="+getImagUrl);
        Logger.d("restoreBundle dbVersion="+dbVersion);
        Logger.d("restoreBundle companyTaxId="+companyTaxId);
        Logger.d("restoreBundle isCNVersion="+isCNVersion);
        Logger.d("restoreBundle isAppBackground="+isAppBackground);
        Logger.d("restoreBundle systemCode="+systemCode);
        Logger.d("restoreBundle deviceName="+deviceName);
        Logger.d("restoreBundle WIDTH="+WIDTH);
        Logger.d("restoreBundle HEIGHT="+HEIGHT);
        Logger.d("restoreBundle productVersion="+productVersion);
        Logger.d("restoreBundle delayTXTime="+delayTXTime);
        Logger.d("restoreBundle dbHasCompleted="+dbHasCompleted);
        Logger.d("restoreBundle defautShowLimit="+defautShowLimit);
        Logger.d("restoreBundle backgroundSyncDelayTime="+backgroundSyncDelayTime);
        Logger.d("restoreBundle maxLineNumber="+maxLineNumber);
        Logger.d("restoreBundle recordUserExitTime="+recordUserExitTime);
        Logger.d("restoreBundle backKeyDelayTime="+backKeyDelayTime);
        Logger.d("restoreBundle dbTmpLength="+dbTmpLength);
        Logger.d("restoreBundle clickReplyPostion="+clickReplyPostion);
        Logger.d("restoreBundle defaultLoadDataBeforeDays="+defaultLoadDataBeforeDays);
        Logger.d("restoreBundle dbTmpDays="+dbTmpDays);
        Logger.d("restoreBundle minTextLength="+minTextLength);
        Logger.d("restoreBundle maxTextLength="+maxTextLength);
        Logger.d("restoreBundle smallWidth="+smallWidth);
    }
}
