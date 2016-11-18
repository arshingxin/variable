package com.variable.utility;


import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;


/**
 * Toast工具，可設定文字大小、icon、顯示位置...等等
 * @author star
 */
public class ToastUtility {
	private final static String TAG = ToastUtility.class.getSimpleName();
	private final static boolean DEBUG = false;
	private final static int NO_SETTING = CustomToast.NO_SETTING;

	public static void showMessage(final Context context
			, final int imageRes
			, final String message
			, final int textSize
			, final int textColor
			, final int gravity
			, final int backgroundColor
			, final int duration)
	{
		new Handler(Looper.getMainLooper(), new Handler.Callback(){
			@Override
			public boolean handleMessage(Message msg){
				CustomToast toast = new CustomToast(context);
				toast.makeText(imageRes, message, textSize, textColor, gravity, backgroundColor, duration).show();
				return true;
			}
		}).sendEmptyMessage(0);
	}

	public static void showMessage(Context context, String message, int textSize, int textColor, int gravity, int backgroundColor, int duration)
	{
		showMessage(context, NO_SETTING, message, textSize, textColor, gravity, backgroundColor, duration);
	}

	public static void showMessage(Context context, String message, int textSize, int textColor, int gravity, int backgroundColor)
	{
		showMessage(context, NO_SETTING, message, textSize, textColor, gravity, backgroundColor, NO_SETTING);
	}

	public static void showMessage(Context context, String message, int textSize, int textColor, int gravity)
	{
		showMessage(context, NO_SETTING, message, textSize, textColor, gravity, NO_SETTING, NO_SETTING);
	}

	public static void showMessage(Context context, String message, int textSize, int textColor)
	{
		showMessage(context, NO_SETTING, message, textSize, textColor, NO_SETTING, NO_SETTING, NO_SETTING);
	}

	public static void showMessage(Context context, String message, int textSize)
	{
		showMessage(context, NO_SETTING, message, textSize, NO_SETTING, NO_SETTING, NO_SETTING, NO_SETTING);
	}

	public static void showMessage(Context context, String message)
	{
		showMessage(context, NO_SETTING, message, NO_SETTING, NO_SETTING, NO_SETTING, NO_SETTING, NO_SETTING);
	}

	public static void showMessage(Context context, int imageRes, String message)
	{
		showMessage(context, imageRes, message, NO_SETTING, NO_SETTING, NO_SETTING, NO_SETTING, NO_SETTING);
	}

	public static void showMessage(Context context, int imageRes, String message, int textSize)
	{
		showMessage(context, imageRes, message, textSize, NO_SETTING, NO_SETTING, NO_SETTING, NO_SETTING);
	}

	public static void showMessage(Context context, int imageRes, String message, int textSize, int textColor)
	{
		showMessage(context, imageRes, message, textSize, textColor, NO_SETTING, NO_SETTING, NO_SETTING);
	}

	public static void showMessage(Context context, int imageRes, String message, int textSize, int textColor, int gravity)
	{
		showMessage(context, imageRes, message, textSize, textColor, gravity, NO_SETTING, NO_SETTING);
	}

	public static void showMessage(Context context, int imageRes, String message, int textSize, int textColor, int gravity, int backgroundColor)
	{
		showMessage(context, imageRes, message, textSize, textColor, gravity, backgroundColor, NO_SETTING);
	}
}
