package com.variable.skin.key;

import com.variable.R;
import com.variable.skin.object.CommonSkin;
import com.variable.skin.object.SkinKey;

/**
 * EventPlus 紫色主題
 * @author Star
 */
public class CircleStar_Purple {
    //黑色
    public static int COLOR_BLACK=CommonSkin.COLOR_BLACK;
    //深灰色
    public static int COLOR_DARK_GRAY=CommonSkin.COLOR_DARK_GRAY;
    //淺灰色
    public static int COLOR_LIGHT_GRAY=CommonSkin.COLOR_LIGHT_GRAY;
    //半透明黑色
    public static int COLOR_SEMI_BLACK=CommonSkin.COLOR_SEMI_BLACK;
    //白色
    public static int COLOR_WHITE=CommonSkin.COLOR_WHITE;
    //紅色
    public static int COLOR_RED=CommonSkin.COLOR_RED;
    //半透明紅色
    public static int SEMI_COLOR_RED=CommonSkin.SEMI_COLOR_RED;
    //半透明綠色
    public static int SEMI_COLOR_GREEN=CommonSkin.SEMI_COLOR_GREEN;
    public static int DEFAULT_BG_COLOR=0xffffffff;
    public static int EVENT_EXPAND_BG_COLOR=0x33ffffff;
    public static int DEFAULT_BG_DRAWABLE=R.drawable.bg_white;
    public static int BG_GRARY_FRAME_WHITE_DRAWABLE=R.drawable.bg_gray_frame_white;
    public static int SEMI_DEFAULT_BG_COLOR = 0xccbebebe;
    public static int DEFAULT_COLOR=0xff91479e;
    public static int SEND_MESSAGE_TITLE_BG=0xff91479e;
    public static int CIRCLE_GREEN=0xff09b709;
    public static int TOOLBAR_TEXT_COLOR=CommonSkin.COLOR_WHITE;
    public static int EVENT_PROCATE_CIRCLE_TEXT_COLOR=CommonSkin.EVENT_PROCATE_CIRCLE_TEXT_COLOR;
    public static int EVENT_FLOATING_ACTION_BUTTON_NORMAL=0xFFDA4336;
    public static int EVENT_FLOATING_ACTION_BUTTON_PRESSED=0xFFE75043;
    public static int EVENT_FLOATING_ACTION_BUTTON_SHADOW=0x66000000;
    public static int EVENT_CREATE_SEND_MESSAGE_BG=0xffe5e5e5;
    public static int EVENT_ACTION_BUTTON_TEXT_COLOR=0xff656565;
    public static int REPLY_HEADER_BG = 0xff8e34a1;
    public static int REPLY_BOTTOM_BG = 0xff91479e;
    public static int LOADING_LAYOUT_BG = 0xcc91479e;
    public static int LOADING_TEXT_COLOR = 0xffffffff;
    public static int SETTING_HEAD_BG = 0xff8e34a1;
    public static int SETTING_CAT_TITLE_TEXT_COLOR = 0xff337df7;
    public static int SETTING_BG_SWITCH_ON = R.drawable.bg_purple_switch_on;
    public static int SETTING_BG_SWITCH_OFF = R.drawable.bg_purple_switch_off;
    public static int SETTING_THUMB_SWITCH = R.drawable.icon_white_solid_circle;
    public static int CUSTOM_TOAST_BG = 0xcc595959;
    public static int CUSTOM_TOAST_ICON = R.drawable.csicon;
    public static int CREATE_VOTE_VOTE_BUTTON = R.drawable.button_purple_frame_white_normal;
    public static int BG_WHITE_PURPLE_FRAME = R.drawable.bg_white_dialogfragment_purple_frame;
    public static int COMMON_CAMERA = CommonSkin.COMMON_CAMERA;
    public static int COMMON_GALLERY = CommonSkin.COMMON_GALLERY;
    public static int COMMON_EDIT = CommonSkin.COMMON_EDIT;
    public static int COMMON_REDO = CommonSkin.COMMON_REDO;
    public static int COMMON_SEND = CommonSkin.COMMON_SEND;
    public static int COMMON_SEND_GRAY = CommonSkin.COMMON_SEND_GRAY;
    public static int COMMON_SEND_BLUE = CommonSkin.COMMON_SEND_BLUE;
    public static int COMMON_REFRESH = CommonSkin.COMMON_REFRESH;
    //Button
    //深灰按鈕
    public static int W00=CommonSkin.W00;
    //淺灰按鈕
    public static int W01=CommonSkin.W01;
    //紅色按鈕
    public static int W02=CommonSkin.W02;
    //紫色按鈕
    public static int W03= R.drawable.button_purple;
    //綠按鈕
    public static int W04=CommonSkin.W04;
    //亮灰按鈕
    public static int W05=CommonSkin.W05;
    //紫色按鈕
    public static int W06=CommonSkin.W06;
    //藍色按鈕、黑色框
    public static int W07=R.drawable.button_blue_frame_black;
    //白色按鈕、紫色框
    public static int W08=R.drawable.button_purple_frame_white;
    //白色按鈕、藍色框
    public static int W09=R.drawable.button_blue_frame_white;
    //白色按鈕、綠色框
    public static int W10=R.drawable.button_green_frame_white;
    //白色按鈕、灰色框
    public static int W11=R.drawable.button_light_gray_frame_white;
    //藍色按鈕
    public static int W12=R.drawable.button_blue;
    //綠色按鈕
    public static int W13=R.drawable.button_green;

    /**
     * image
     */
    public static int SEARCH_IMAGE=R.drawable.icon_search_white;
    public static int FILTER_IMAGE=R.drawable.icon_filter_white;
    public static int ICON_PLUS=R.drawable.icon_plus;
    public static int ICON_VOTE=R.drawable.icon_vote;
    public static int ICON_FORM=R.drawable.icon_form_white;
    public static int ICON_DELETE = android.R.drawable.ic_menu_delete;
    public static int ICON_REFRESH = R.drawable.icon_refresh;
    public static int ICON_RED_DELETE= android.R.drawable.ic_delete;
    public static int ICON_ARROW_UP = R.drawable.icon_arrow_up;
    public static int ICON_ARROW_DOWN = R.drawable.icon_arrow_down;

    /**
     * 取得顏色
     * 注意：每加入一個key就要修改此方法
     * @param skinKey
     * @return
     */
    public static int getColor(String skinKey){
        if(skinKey.equals(SkinKey.COLOR_BLACK))
        {
            return COLOR_BLACK;
        }
        if(skinKey.equals(SkinKey.COLOR_DARK_GRAY))
        {
            return COLOR_DARK_GRAY;
        }
        if(skinKey.equals(SkinKey.COLOR_LIGHT_GRAY))
        {
            return COLOR_LIGHT_GRAY;
        }
        else if(skinKey.equals(SkinKey.COLOR_SEMI_BLACK))
        {
            return COLOR_SEMI_BLACK;
        }
        else if(skinKey.equals(SkinKey.COLOR_WHITE))
        {
            return COLOR_WHITE;
        }
        else if(skinKey.equals(SkinKey.COLOR_RED))
        {
            return COLOR_RED;
        }
        else if(skinKey.equals(SkinKey.SEMI_COLOR_RED))
        {
            return SEMI_COLOR_RED;
        }
        else if(skinKey.equals(SkinKey.SEMI_COLOR_GREEN))
        {
            return SEMI_COLOR_GREEN;
        }
        else if(skinKey.equals(SkinKey.CIRCLE_GREEN))
        {
            return CIRCLE_GREEN;
        }
        else if(skinKey.equals(SkinKey.SEND_MESSAGE_TITLE_BG))
        {
            return SEND_MESSAGE_TITLE_BG;
        }
        else if(skinKey.equals(SkinKey.SETTING_HEAD_BG))
        {
            return SETTING_HEAD_BG;
        }
        else if(skinKey.equals(SkinKey.LOADING_LAYOUT_BG))
        {
            return LOADING_LAYOUT_BG;
        }
        else if(skinKey.equals(SkinKey.LOADING_TEXT_COLOR))
        {
            return LOADING_TEXT_COLOR;
        }
        else if(skinKey.equals(SkinKey.REPLY_BOTTOM_BG))
        {
            return REPLY_BOTTOM_BG;
        }
        else if(skinKey.equals(SkinKey.REPLY_HEADER_BG))
        {
            return REPLY_HEADER_BG;
        }
        else if(skinKey.equals(SkinKey.TOOLBAR_TEXT_COLOR))
        {
            return TOOLBAR_TEXT_COLOR;
        }
        else if(skinKey.equals(SkinKey.EVENT_PROCATE_CIRCLE_TEXT_COLOR))
        {
            return EVENT_PROCATE_CIRCLE_TEXT_COLOR;
        }
        else if(skinKey.equals(SkinKey.EVENT_FLOATING_ACTION_BUTTON_NORMAL))
        {
            return EVENT_FLOATING_ACTION_BUTTON_NORMAL;
        }
        else if(skinKey.equals(SkinKey.EVENT_FLOATING_ACTION_BUTTON_PRESSED))
        {
            return EVENT_FLOATING_ACTION_BUTTON_PRESSED;
        }
        else if(skinKey.equals(SkinKey.EVENT_FLOATING_ACTION_BUTTON_SHADOW))
        {
            return EVENT_FLOATING_ACTION_BUTTON_SHADOW;
        }
        else if(skinKey.equals(SkinKey.EVENT_CREATE_SEND_MESSAGE_BG))
        {
            return EVENT_CREATE_SEND_MESSAGE_BG;
        }
        else if(skinKey.equals(SkinKey.DEFAULT_BG_COLOR))
        {
            return DEFAULT_BG_COLOR;
        }
        else if(skinKey.equals(SkinKey.EVENT_EXPAND_BG_COLOR))
        {
            return EVENT_EXPAND_BG_COLOR;
        }
        else if(skinKey.equals(SkinKey.SEMI_DEFAULT_BG_COLOR))
        {
            return SEMI_DEFAULT_BG_COLOR;
        }
        else if(skinKey.equals(SkinKey.EVENT_ACTION_BUTTON_TEXT_COLOR))
        {
            return EVENT_ACTION_BUTTON_TEXT_COLOR;
        }
        else if(skinKey.equals(SkinKey.SETTING_CAT_TITLE_TEXT_COLOR))
        {
            return SETTING_CAT_TITLE_TEXT_COLOR;
        }
        else if(skinKey.equals(SkinKey.SETTING_BG_SWITCH_ON))
        {
            return SETTING_BG_SWITCH_ON;
        }
        else if(skinKey.equals(SkinKey.SETTING_BG_SWITCH_OFF))
        {
            return SETTING_BG_SWITCH_OFF;
        }
        else if(skinKey.equals(SkinKey.SETTING_THUMB_SWITCH))
        {
            return SETTING_THUMB_SWITCH;
        }
        else if(skinKey.equals(SkinKey.CUSTOM_TOAST_BG))
        {
            return CUSTOM_TOAST_BG;
        }
        else if(skinKey.equals(SkinKey.CUSTOM_TOAST_ICON))
        {
            return CUSTOM_TOAST_ICON;
        }
        else if(skinKey.equals(SkinKey.DEFAULT_BG_DRAWABLE))
        {
            return DEFAULT_BG_DRAWABLE;
        }
        else if(skinKey.equals(SkinKey.BG_GRARY_FRAME_WHITE_DRAWABLE))
        {
            return BG_GRARY_FRAME_WHITE_DRAWABLE;
        }
        else if(skinKey.equals(SkinKey.CREATE_VOTE_VOTE_BUTTON))
        {
            return CREATE_VOTE_VOTE_BUTTON;
        }
        else if(skinKey.equals(SkinKey.BG_WHITE_PURPLE_FRAME))
        {
            return BG_WHITE_PURPLE_FRAME;
        }
        else if(skinKey.equals(SkinKey.W00))
        {
            return W00;
        }
        else if(skinKey.equals(SkinKey.W01))
        {
            return W01;
        }
        else if(skinKey.equals(SkinKey.W02))
        {
            return W02;
        }
        else if(skinKey.equals(SkinKey.W03))
        {
            return W03;
        }
        else if(skinKey.equals(SkinKey.W04))
        {
            return W04;
        }
        else if(skinKey.equals(SkinKey.W05))
        {
            return W05;
        }
        else if(skinKey.equals(SkinKey.W06))
        {
            return W06;
        }
        else if(skinKey.equals(SkinKey.W07))
        {
            return W07;
        }
        else if(skinKey.equals(SkinKey.W08))
        {
            return W08;
        }
        else if(skinKey.equals(SkinKey.W09))
        {
            return W09;
        }
        else if(skinKey.equals(SkinKey.W10))
        {
            return W10;
        }
        else if(skinKey.equals(SkinKey.W11))
        {
            return W11;
        }
        else if(skinKey.equals(SkinKey.W12))
        {
            return W12;
        }
        else if(skinKey.equals(SkinKey.W13))
        {
            return W13;
        }
        else if(skinKey.equals(SkinKey.SEARCH_IMAGE))
        {
            return SEARCH_IMAGE;
        }
        else if(skinKey.equals(SkinKey.FILTER_IMAGE))
        {
            return FILTER_IMAGE;
        }
        else if(skinKey.equals(SkinKey.ICON_PLUS))
        {
            return ICON_PLUS;
        }
        else if(skinKey.equals(SkinKey.ICON_VOTE))
        {
            return ICON_VOTE;
        }
        else if(skinKey.equals(SkinKey.ICON_FORM))
        {
            return ICON_FORM;
        }
        else if(skinKey.equals(SkinKey.ICON_DELETE))
        {
            return ICON_DELETE;
        }
        else if(skinKey.equals(SkinKey.ICON_REFRESH))
        {
            return ICON_REFRESH;
        }
        else if(skinKey.equals(SkinKey.ICON_RED_DELETE))
        {
            return ICON_RED_DELETE;
        }
        if(skinKey.equals(SkinKey.ICON_ARROW_UP))
        {
            return ICON_ARROW_UP;
        }
        if(skinKey.equals(SkinKey.ICON_ARROW_DOWN))
        {
            return ICON_ARROW_DOWN;
        }
        else if(skinKey.equals(SkinKey.DEFAULT_COLOR))
        {
            return DEFAULT_COLOR;
        }
        else if(skinKey.equals(SkinKey.COMMON_CAMERA))
        {
            return COMMON_CAMERA;
        }
        else if(skinKey.equals(SkinKey.COMMON_GALLERY))
        {
            return COMMON_GALLERY;
        }
        else if(skinKey.equals(SkinKey.COMMON_EDIT))
        {
            return COMMON_EDIT;
        }
        else if(skinKey.equals(SkinKey.COMMON_REDO))
        {
            return COMMON_REDO;
        }
        else if(skinKey.equals(SkinKey.COMMON_SEND))
        {
            return COMMON_SEND;
        }
        else if(skinKey.equals(SkinKey.COMMON_SEND_GRAY))
        {
            return COMMON_SEND_GRAY;
        }
        else if(skinKey.equals(SkinKey.COMMON_SEND_BLUE))
        {
            return COMMON_SEND_BLUE;
        }
        else if(skinKey.equals(SkinKey.COMMON_REFRESH))
        {
            return COMMON_REFRESH;
        }
        else
        {
            return DEFAULT_COLOR; // 預設回紫色
        }
    }
}
