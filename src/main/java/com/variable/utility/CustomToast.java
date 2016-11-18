package com.variable.utility;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.variable.R;
import com.variable.skin.object.SkinKey;

/**
 * @author Star
 */
public class CustomToast extends Toast{
    public final static String SKIN_KEY = SkinKey.CUSTOM_TOAST_BG;
    public final static int NO_SETTING = -99;
    private final int ICON_WIDTH = 24;
    private final int TEXT_SIZE = 14;
    private Toast result;
    private ImageView image;
    private TextView text;
    private View convertView;
    /**
     * Construct an empty Toast object.  You must call {@link #setView} before you
     * can call {@link #show}.
     *
     * @param context The context to use.  Usually your {@link Application}
     *                or {@link Activity} object.
     */
    public CustomToast(Context context) {
        super(context);
        init(context);
    }

    private void init(Context context) {
        result = new Toast(context);
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        convertView = inflater.inflate(R.layout.custom_toast, null);
        convertView.setBackgroundColor(SkinUtility.getColor(SKIN_KEY));
        image = (ImageView) convertView.findViewById(R.id.image);
        image.getLayoutParams().width = (int) UICalculator.getRatioWidth((Activity) context, ICON_WIDTH);
        image.getLayoutParams().height = (int) UICalculator.getRatioWidth((Activity) context, ICON_WIDTH);
        text = (TextView) convertView.findViewById(R.id.text);
        text.setTextColor(SkinUtility.getColor(SkinKey.COLOR_WHITE));
        text.setTextSize(TypedValue.COMPLEX_UNIT_PX, UICalculator.getRatioWidth((Activity) context, TEXT_SIZE));
        result.setView(convertView);
    }

    private void setBackgroundColor(int color) {
        convertView.setBackgroundColor(color);
    }

    private void setGravity(int gravity){
        setGravity(gravity, 0, 0);
    }

    private void setTextColor(int color){
        text.setTextColor(color);
    }

    private void setTextSize(int size){
        text.setTextSize(size);
    }

    /**
     * @deprecated
     * @param w
     */
    public void setIconSize(int w){
        image.getLayoutParams().width = w;
        image.getLayoutParams().height = w;
    }

    /**
     *
     * @param imgRes
     * @param message
     * @param textSize
     * @param textColor
     * @param duration
     * @return
     */
    public Toast makeText(int imgRes, String message, int textSize, int textColor, int duration){
        return makeText(imgRes, message, textSize, textColor, Gravity.BOTTOM, SkinUtility.getColor(SKIN_KEY), duration);
    }

    /**
     *
     * @param imgRes
     * @param message
     * @param textSize
     * @return
     */
    public Toast makeText(int imgRes, String message, int textSize){
        return makeText(imgRes, message, textSize, NO_SETTING, Gravity.BOTTOM, SkinUtility.getColor(SKIN_KEY), Toast.LENGTH_SHORT);
    }

    /**
     *
     * @param imgRes
     * @param message
     * @param textSize
     * @param textColor
     * @return
     */
    public Toast makeText(int imgRes, String message, int textSize, int textColor){
        return makeText(imgRes, message, textSize, textColor, Gravity.BOTTOM, SkinUtility.getColor(SKIN_KEY), Toast.LENGTH_SHORT);
    }

    /**
     *
     * @param message
     * @param textSize
     * @param textColor
     * @param duration
     * @return
     */
    public Toast makeText(String message, int textSize, int textColor, int duration){
        return makeText(NO_SETTING, message, textSize, textColor, Gravity.BOTTOM, SkinUtility.getColor(SKIN_KEY), duration);
    }

    /**
     *
     * @param message
     * @param textSize
     * @return
     */
    public Toast makeText(String message, int textSize){
        return makeText(NO_SETTING, message, textSize, NO_SETTING, Gravity.BOTTOM, SkinUtility.getColor(SKIN_KEY), Toast.LENGTH_SHORT);
    }

    /**
     *
     * @param message
     * @param textSize
     * @param textColor
     * @return
     */
    public Toast makeText(String message, int textSize, int textColor){
        return makeText(NO_SETTING, message, textSize, textColor, Gravity.BOTTOM, SkinUtility.getColor(SKIN_KEY), Toast.LENGTH_SHORT);
    }

    /**
     *
     * @param imageRes
     * @param message
     * @param textSize
     * @param textColor
     * @param gravity
     * @param backgroundColor
     * @param duration
     * @return
     */
    public Toast makeText(int imageRes, String message, int textSize, int textColor, int gravity, int backgroundColor, int duration) {
        if(imageRes!=NO_SETTING){
            image.setImageResource(imageRes);
        }else{
            image.setVisibility(View.GONE);
        }
        if(false==TextUtils.isEmpty(message)){
            text.setText(message);
        }else{
            text.setText("");
        }
        if(gravity>=0){
            setGravity(gravity);
        }
        if(textSize!=NO_SETTING){
            setTextSize(textSize);
        }
        if(textColor!=NO_SETTING){
            setTextColor(textColor);
        }
        if(backgroundColor!=NO_SETTING){
            setBackgroundColor(backgroundColor);
        }
        setDuration(duration);
        return result;
    }
}
