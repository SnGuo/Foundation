package com.sag.foundationlibrary.base.util;

import com.google.gson.Gson;

/**
 * Gson单例工具
 * <p>
 * Created by SAG on 2016/10/11 0011.
 */

public class GsonUtil {

    private static final Gson gson = new Gson();

    private GsonUtil() {
    }

    public static Gson getGson() {
        return gson;
    }

}
