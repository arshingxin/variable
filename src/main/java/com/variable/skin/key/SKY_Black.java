package com.variable.skin.key;


import com.variable.skin.object.CommonSkin;
import com.variable.skin.object.SkinKey;

/**
 * 黑色主題/皮膚色碼
 * @author star
 */
public class SKY_Black {
	public static int A00= CommonSkin.Z11;
	public static int A01=CommonSkin.Z12;
	public static int A02=CommonSkin.COLOR_WHITE;
	public static int A03=0xFF111416;
	public static int A04=0xFF777E81;
	public static int A05=0xFF090A0B;
	public static int A06=CommonSkin.Z12;
	public static int A07=CommonSkin.Z11;
	public static int A08=CommonSkin.Z13;
	public static int A09=0xFF22282C;
	public static int A10=0xFF004200;
	public static int A11=0xFF580000;
	public static int A12=0xFF0B0E0F;
	public static int A13=0xFF181F22;
	public static int A14=0xFFE50012;
	public static int A15=0xFF1A2125;
	public static int A16=0xFF0C8BCF;
	public static int A17=0xFF00993E;
	public static int A18=CommonSkin.Z20;
	public static int A19=0xFF040505;
	public static int A20=0xFF6AB82D;
	public static int A21=0xFF064668;
	public static int A22=0xFF400000;
	public static int A23=0xFF004000;
	public static int A24=0xFF910782;
	public static int A25=0xFF3E4649;
	public static int A26=0xFF376FA9;
	public static int A27=0xFF0791D0;
	public static int A28=0xFFD25A07;
	public static int A29=0xFF090A0B;
	public static int A30=0xFF35323E;
	public static int A31=0xFFE84D3D;
	/** 三階分價量表柱狀圖基本藍色*/
	public static int MinutePriceBarDefault = 0xFF006F92;
	/** 三階分價量表柱狀圖現價黃色*/
	public static int MinutePriceBarNowPrice = 0xFFffb600;
	/** 三階分價量表柱狀圖壓力紅色*/
	public static int MinutePriceBarPressure = 0xFFaf0000;
	/** 三階分價量表柱狀圖支撐綠色*/
	public static int MinutePriceBarSupport = 0xFF008400;

	/** 三階分價量表壓力文字背景色紅色*/
	public static int MP04 = 0xFF410e0f;
	/** 三階分價量表現價文字背景色黃色*/
	public static int MP05 = 0xFF59450f;
	/** 三階分價量表支撐文字背景色綠色*/
	public static int MP06 = 0xFF0c360f;


	//Button
	//深灰
	public static int W00=CommonSkin.W00;
	//淺灰
	public static int W01=CommonSkin.W01;
	//紅
	public static int W02=CommonSkin.W02;
	//藍
	public static int W03=CommonSkin.W03;
	//綠
	public static int W04=CommonSkin.W04;
	//亮灰
	public static int W05=CommonSkin.W05;
	//紫色
	public static int W06=CommonSkin.W06;

	//其他額外新增按鈕
	//白灰
	public static int X00=CommonSkin.X00;
	//其他
	//內外盤-灰色
	public static int Z00=CommonSkin.Z00;
	//漲停
	public static int Z01=CommonSkin.Z01;
	//跌停
	public static int Z02=CommonSkin.Z02;
	//國際金融-title文字顏色
	public static int Z03=CommonSkin.Z03;
	//透明色
	public static int Z04=CommonSkin.Z04;
	//黑色
	public static int Z05=CommonSkin.COLOR_WHITE;
	//白色
	public static int Z06=CommonSkin.COLOR_WHITE;
	//TAB背景色
	public static int Z07=CommonSkin.Z07;
	//三階綜合報價上方自選區塊背景
	public static int Z08=CommonSkin.Z08;
	//快捷功能圖案背景
	public static int Z09=CommonSkin.Z09;
	//新股神贏家-3階-單數行背景色
	public static int Z10=CommonSkin.Z10;
	/**
	 * 紅0xFFFF0000
	 */
	public static int Z11=CommonSkin.Z11;
	/**
	 * 綠0xFF00FF00
	 */
	public static int Z12=CommonSkin.Z12;
	/**
	 * 黃0xFFFFFF00
	 */
	public static int Z13=CommonSkin.Z13;
	/**
	 * 藍-EX:國際金融名稱文字顏色0xFF00CAFF
	 */
	public static int Z14=CommonSkin.Z14;
	/**
	 * 灰0xFF737373
	 */
	public static int Z15=CommonSkin.Z15;
	/**
	 * 閃爍底線顏色0xFFFF23FF
	 */
	public static int Z16=CommonSkin.Z16;
	/**
     * 申購專區-開始日-未開始文字顏色0xFF34213e
     */
	public static int Z17=CommonSkin.Z17;
	/**
     * 申購專區-截止日-可申購文字顏色0xFFe84d3c
     */
	public static int Z18=CommonSkin.Z18;
	/**
     * 申購專區-截止日-已截止文字顏色0xFF192024
     */
	public static int Z19=CommonSkin.Z19;
	//TAB背景色
	public static int Z21=CommonSkin.Z21;

	/**
	 * 取得顏色
	 * 注意：每加入一個key就要修改此方法
	 * @param skinKey
	 * @return
	 */
	public static int getColor(String skinKey){
		if(skinKey.equals(SkinKey.A00))
		{
			return A00;
		}
		else if(skinKey.equals(SkinKey.A01))
		{
			return A01;
		}
		else if(skinKey.equals(SkinKey.A02))
		{
			return A02;
		}
		else if(skinKey.equals(SkinKey.A03))
		{
			return A03;
		}
		else if(skinKey.equals(SkinKey.A04))
		{
			return A04;
		}
		else if(skinKey.equals(SkinKey.A05))
		{
			return A05;
		}
		else if(skinKey.equals(SkinKey.A06))
		{
			return A06;
		}
		else if(skinKey.equals(SkinKey.A07))
		{
			return A07;
		}
		else if(skinKey.equals(SkinKey.A08))
		{
			return A08;
		}
		else if(skinKey.equals(SkinKey.A09))
		{
			return A09;
		}
		else if(skinKey.equals(SkinKey.A10))
		{
			return A10;
		}
		else if(skinKey.equals(SkinKey.A11))
		{
			return A11;
		}
		else if(skinKey.equals(SkinKey.A12))
		{
			return A12;
		}
		else if(skinKey.equals(SkinKey.A13))
		{
			return A13;
		}
		else if(skinKey.equals(SkinKey.A14))
		{
			return A14;
		}
		else if(skinKey.equals(SkinKey.A15))
		{
			return A15;
		}
		else if(skinKey.equals(SkinKey.A16))
		{
			return A16;
		}
		else if(skinKey.equals(SkinKey.A17))
		{
			return A17;
		}
		else if(skinKey.equals(SkinKey.A18))
		{
			return A18;
		}
		else if(skinKey.equals(SkinKey.A19))
		{
			return A19;
		}
		else if(skinKey.equals(SkinKey.A20))
		{
			return A20;
		}
		else if(skinKey.equals(SkinKey.A21))
		{
			return A21;
		}
		else if(skinKey.equals(SkinKey.A22))
		{
			return A22;
		}
		else if(skinKey.equals(SkinKey.A23))
		{
			return A23;
		}
		else if(skinKey.equals(SkinKey.A24))
		{
			return A24;
		}
		else if(skinKey.equals(SkinKey.A25))
		{
			return A25;
		}
		else if(skinKey.equals(SkinKey.A26))
		{
			return A26;
		}
		else if(skinKey.equals(SkinKey.A27))
		{
			return A27;
		}
		else if(skinKey.equals(SkinKey.A28))
		{
			return A28;
		}
		else if(skinKey.equals(SkinKey.A29))
		{
			return A29;
		}
		else if(skinKey.equals(SkinKey.A30))
		{
			return A30;
		}
		else if(skinKey.equals(SkinKey.A31))
		{
			return A31;
		}
		else if(skinKey.equals(SkinKey.MP00))
		{
			return MinutePriceBarDefault;
		}
		else if(skinKey.equals(SkinKey.MP01))
		{
			return MinutePriceBarNowPrice;
		}
		else if(skinKey.equals(SkinKey.MP02))
		{
			return MinutePriceBarPressure;
		}
		else if(skinKey.equals(SkinKey.MP03))
		{
			return MinutePriceBarSupport;
		}
		else if(skinKey.equals(SkinKey.MP04))
		{
			return MP04;
		}
		else if(skinKey.equals(SkinKey.MP05))
		{
			return MP05;
		}
		else if(skinKey.equals(SkinKey.MP06))
		{
			return MP06;
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
		else if(skinKey.equals(SkinKey.X00))
		{
			return X00;
		}
		else if(skinKey.equals(SkinKey.Z00))
		{
			return Z00;
		}
		else if(skinKey.equals(SkinKey.Z01))
		{
			return Z01;
		}
		else if(skinKey.equals(SkinKey.Z02))
		{
			return Z02;
		}
		else if(skinKey.equals(SkinKey.Z03))
		{
			return Z03;
		}
		else if(skinKey.equals(SkinKey.Z04))
		{
			return Z04;
		}
		else if(skinKey.equals(SkinKey.COLOR_BLACK))
		{
			return Z05;
		}
		else if(skinKey.equals(SkinKey.COLOR_WHITE))
		{
			return Z06;
		}
		else if(skinKey.equals(SkinKey.Z07))
		{
			return Z07;
		}
		else if(skinKey.equals(SkinKey.Z08))
		{
			return Z08;
		}
		else if(skinKey.equals(SkinKey.Z09))
		{
			return Z09;
		}
		else if(skinKey.equals(SkinKey.Z10))
		{
			return Z10;
		}
		else if(skinKey.equals(SkinKey.Z11))
		{
			return Z11;
		}
		else if(skinKey.equals(SkinKey.Z12))
		{
			return Z12;
		}
		else if(skinKey.equals(SkinKey.Z13))
		{
			return Z13;
		}
		else if(skinKey.equals(SkinKey.Z14))
		{
			return Z14;
		}
		else if(skinKey.equals(SkinKey.Z15))
		{
			return Z15;
		}
		else if(skinKey.equals(SkinKey.Z16))
		{
			return Z16;
		}
		else if(skinKey.equals(SkinKey.Z17))
		{
			return Z17;
		}
		else if(skinKey.equals(SkinKey.Z18))
		{
			return Z18;
		}
		else if(skinKey.equals(SkinKey.Z19))
		{
			return Z19;
		}
		else if(skinKey.equals(SkinKey.Z21))
		{
			return Z21;
		}
		else
		{
			return 0xFF000000; // 預設回傳黑色
		}
	}
}
