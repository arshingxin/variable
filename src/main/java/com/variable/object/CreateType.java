package com.variable.object;

/**
 * 篩選使用
 * 分為顯示全部/表單/投票
 * @author Star
 */
public class CreateType {
    /**
     * 全部
     */
    public final static String SHOW_ALL = "SHOW_ALL";
    /**
     * 表單
     */
    public final static String SHOW_NORMAL = "SHOW_NORMAL";
    /**
     * 投票
     */
    public final static String SHOW_VOTE = "SHOW_VOTE";
    /**
     * 所有KEY
     */
    public final static String[] KEY = new String[]{SHOW_ALL, SHOW_NORMAL, SHOW_VOTE};
}
