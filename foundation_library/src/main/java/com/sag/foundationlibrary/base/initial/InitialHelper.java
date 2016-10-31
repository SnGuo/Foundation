package com.sag.foundationlibrary.base.initial;

/**
 * Created by SAG on 2016/10/31 0031.
 */

public class InitialHelper {

    private static InitialStamp stamp;

    private InitialHelper(InitialStamp initial) {
    }

    public static void initialize(InitialStamp stamp) {
        InitialHelper.stamp = stamp;
    }

    public static int getLayoutEmpty() {
        return stamp.getLayoutEmpty();
    }

    public static int getLayoutError() {
        return stamp.getLayoutError();
    }

    public static int getLayoutLoading() {
        return stamp.getLayoutLoading();
    }

    public static int getToolbarColor() {
        return stamp.getToolbarColor();
    }

    public static int getBackgroundColor() {
        return stamp.getBackgroundColor();
    }

    public static int getTimeMine() {
        return stamp.getTimeMine();
    }

    public static int getTimeOut() {
        return stamp.getTimeOut();
    }

    public static String getPromptAwait() {
        return stamp.getPromptAwait();
    }

    public static String getPromptDisconnect() {
        return stamp.getPromptDisconnect();
    }

    public static String getServiceUrl() {
        return stamp.getServiceUrl();
    }

    public static String getDesKey() {
        return stamp.getDesKey();
    }

    public static boolean isDebug() {
        return stamp.isDebug();
    }

    public static boolean isEncrypt() {
        return stamp.isEncrypt();
    }
}
