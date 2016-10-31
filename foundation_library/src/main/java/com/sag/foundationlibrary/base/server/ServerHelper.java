package com.sag.foundationlibrary.base.server;

import com.sag.foundationlibrary.base.model.ModelStamp;

/**
 * Created by SAG on 2016/10/31 0031.
 */

public class ServerHelper {

    private static ServerStamp mStamp;

    public static void initialize(ServerStamp stamp) {
        mStamp = stamp;
    }

    public static void request(ModelStamp model) {
        mStamp.request(model);
    }

    public static void fixedMethod(String method) {
        mStamp.fixedMethod(method);
    }
}
