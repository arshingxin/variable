package com.variable.utility;

import android.app.Activity;
import android.content.Context;
import android.graphics.Paint;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.widget.TextView;

/**
 * 用於畫面處理
 * @author star
 *
 */
public class UICalculator {
	private static final String TAG = UICalculator.class.getSimpleName();
	private static final boolean DEBUG = false;

	private static final int BASE_PX = 320;
	/**
	 * 取得螢幕寬度
	 * @param activity
	 * @return
	 */
	public static int getWidth(Activity activity)
	{
		DisplayMetrics dm = new DisplayMetrics();
		activity.getWindowManager().getDefaultDisplay().getMetrics(dm);
		return dm.widthPixels;
	}
	
	/**
	 * 取得比例寬
	 * @param activity
	 * @param size 文字大小
	 * @return 比例寬
	 */
	public static float getRatioWidth(Activity activity,int size){
		return getRatioWidth(activity,size, true);
	}
	
	/**
	 * 取得比例寬，以BASE_PX為基準
	 * @param activity
	 * @param size 文字大小
	 * @param b 是否決定取長、寬最小值
	 * @return 比例寬
	 */
	public static float getRatioWidth(Activity activity,int size, boolean b){
		if(b)
			return size*Math.min(getWidth(activity), getHeight(activity))/BASE_PX;
		else
			return size*getWidth(activity)/BASE_PX;
	}

	/**
	 * 取得螢幕高度
	 * @param activity
	 * @return
	 */
	public static int getHeight(Activity activity)
	{
		DisplayMetrics dm = new DisplayMetrics();
		activity.getWindowManager().getDefaultDisplay().getMetrics(dm);
		return dm.heightPixels;
	}

    /**
     * 取得狀態列高度
     * @param context
     * @return
     */
    public static int getStatusBarHeight(Context context) {
        int result = 0;
        int resourceId = context.getResources().getIdentifier("status_bar_height", "dimen", "android");
        if (resourceId > 0) {
            result = context.getResources().getDimensionPixelSize(resourceId);
        }
        return result;
    }

	/**
	 * 取得字串寬度
	 * @param s
	 * @param textSize
	 * @return
	 */
	public static int getTextWidth(final String s, final float textSize)
	{
	    if(s == null || s.length() == 0)
	    {
	    	return 0;
	    }
	    float[] textLength = new float[s.length()];
	    Paint p = new Paint();
	    p.setTextSize(textSize);
	    p.getTextWidths(s, textLength);
		int width = 0;
		for(int j = 0 ; j < textLength.length ;j++)
		{
			width += textLength[j];
		}
	    return width;
	}

	/**
     * 自動計算字串長度
     * @param text textview
     * @param str 字串
     * @param maxWidth 寬度
     * @param normalSize 給予textview原本標準文字大小(PX)
     */
    public static void setAutoText(TextView text,String str, float maxWidth,float normalSize) {
		setAutoText(text, str, maxWidth, normalSize, -99);
    }

	/**
     * 自動計算字串長度
     * @param text textview
     * @param str 字串
     * @param maxWidth 寬度
     * @param normalSize 給予textview原本標準文字大小(PX)
     * @param color 文字顏色
     */
    public static void setAutoText(TextView text,String str,float maxWidth,float normalSize, int color) {
		if(str==null){
			str = "-";
		}else{
			if(str.length() > 0 && maxWidth > 0) {
				float [] textLength = new float[str.length()];
				Paint paint = new Paint();
				paint.setTextSize(normalSize);
				paint.getTextWidths(str, textLength);
				for(int i = 1 ; i < textLength.length ; i++) {
					textLength[0] += textLength[i];
				}
				while (textLength[0] > maxWidth) {
					normalSize -= 2;
					paint.setTextSize(normalSize);
					paint.getTextWidths(str, textLength);
					for(int i = 1 ; i < textLength.length ; i++) {
						textLength[0] += textLength[i];
					}
				}
				text.setTextSize(TypedValue.COMPLEX_UNIT_PX,normalSize);
			} else {
				text.setTextSize(TypedValue.COMPLEX_UNIT_PX,normalSize);
			}
		}
        text.setText(str);
		if(color!=-99){
			text.setTextColor(color);
		}
	}
}
