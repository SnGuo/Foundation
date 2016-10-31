package com.sag.foundationlibrary.base.util;

import android.content.Context;
import android.content.res.Resources;

/**
 * UI视图工具，
 * <p>
 * Created by SAG on 2016/10/11 0011.
 */

public class ContextUtil {

    private static Context mContext;

    private static Resources mResources;

    public static void initialize(Context context) {
        mContext = context;
    }

    public static float getDimen(int id) {
        return mContext.getResources().getDimension(id);
    }

    //获取Application的Context
    public static Context getContext() {
        return mContext;
    }

    public static Resources getResources() {
        return mResources != null ? mResources : (mResources = mContext.getResources());
    }

    //获取字符串资源
    public static String getString(int id) {
        return (mResources != null ? mResources : (mResources = mContext.getResources())).getString(id);
    }

    //获取整形数据资源
    public static int getInteger(int id) {
        return (mResources != null ? mResources : (mResources = mContext.getResources())).getInteger(id);
    }

    //获取布尔型数据资源
    public static boolean getBoolean(int id) {
        return (mResources != null ? mResources : (mResources = mContext.getResources())).getBoolean(id);
    }

}
