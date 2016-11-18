package com.variable.utility;

import com.log.Logger;
import com.variable.object.AppInfo;
import com.variable.skin.key.CircleStar_Purple;
import com.variable.skin.key.EventPlus_Orange;
import com.variable.skin.key.EventPlus_Orange_TDV;
import com.variable.skin.key.SKY_Black;
import com.variable.skin.key.SKY_White;
import com.variable.skin.object.ProductID;
import com.variable.skin.object.SkinMode;

/**
 * 換主體/換膚工具
 * <li> 注意:
 * 沒有主題/黑色主題/皮膚
 * @author star
 */
public class SkinUtility {
	private static String TAG = SkinUtility.class.getSimpleName();
	private static boolean DEBUG = false;
	private static SkinMode skinMode = SkinMode.CIRCLE_STAR_PURPLE;

	/**
	 * 取得皮膚
	 * @return
	 */
	public static SkinMode getSkinMode(){
		return skinMode;
	}

	/**
	 * 設定皮膚
	 * 預設: SkinMode.CIRCLE_STAR_PURPLE
	 * @param mode
	 */
	public static void setSkinMode(SkinMode mode){
		skinMode = mode;
	}

	/**
	 * 取得顏色
	 * @param skinKey
	 * @return
	 */
	public static int getColor(String skinKey){
		Logger.d(getSkinMode() + "=" + AppInfo.productId + "=skinKey=" + skinKey);

		String pId = AppInfo.productId;

		if(pId==null){ //沒有設定pId就使用黑色主題
			return SKY_Black.getColor(skinKey);
		}else{
			if(true==pId.equals(ProductID.CircleStar)){ //CircleStar
				if(getSkinMode() == SkinMode.CIRCLE_STAR_PURPLE) {
					return CircleStar_Purple.getColor(skinKey);
				}else{
					return CircleStar_Purple.getColor(skinKey);
				}
			}else if(true==pId.equals(ProductID.EventPlus)){ //EventPlus
				if(getSkinMode() == SkinMode.EVENT_PLUS_ORANGE){
					return EventPlus_Orange.getColor(skinKey);
				}else if(getSkinMode() == SkinMode.EVENT_PLUS_ORANGE_TDV){
					return EventPlus_Orange_TDV.getColor(skinKey);
				}else{
					return EventPlus_Orange.getColor(skinKey);
				}
			}else if(true==pId.equals(ProductID.SKY)){
				if(getSkinMode() == SkinMode.SKY_BLACK) {
					return SKY_Black.getColor(skinKey);
				}else if(getSkinMode() == SkinMode.SKY_WHITE){
					return SKY_White.getColor(skinKey);
				}else{
					return SKY_Black.getColor(skinKey);
				}
			}else {
				return CircleStar_Purple.getColor(skinKey);
			}
		}
	}
}
