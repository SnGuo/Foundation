package com.sag.foundationlibrary.base.initial;

import android.content.Context;

import com.sag.foundationlibrary.base.file.FileHelper;
import com.sag.foundationlibrary.base.file.FileStamp;
import com.sag.foundationlibrary.base.server.ServerHelper;
import com.sag.foundationlibrary.base.server.ServerStamp;
import com.sag.foundationlibrary.base.util.ContextUtil;

/**
 * Created by SAG on 2016/10/31 0031.
 */

public class InitialHelper implements InitialStamp {

    private InitialStamp stamp;

    private static InitialHelper mHelper;

    private InitialHelper(InitialStamp initial) {
        this.stamp = initial;
    }

    public static <T extends InitialStamp, U extends FileStamp, V extends ServerStamp> void initialize(Context context, Class<T> initial, Class<U> file, Class<V> server) {
        ContextUtil.initialize(context);
        try {
            mHelper = new InitialHelper(initial.newInstance());
            FileHelper.initialize(file.newInstance());
            ServerHelper.initialize(server.newInstance());
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }

    public static InitialHelper getInstance() {
        return mHelper;
    }

    @Override
    public int getLayoutEmpty() {
        return stamp.getLayoutEmpty();
    }

    @Override
    public int getLayoutError() {
        return stamp.getLayoutError();
    }

    @Override
    public int getLayoutLoading() {
        return stamp.getLayoutLoading();
    }

    @Override
    public int getToolbarColor() {
        return stamp.getToolbarColor();
    }

    @Override
    public int getBackgroundColor() {
        return stamp.getBackgroundColor();
    }

    @Override
    public int getTimeMine() {
        return stamp.getTimeMine();
    }

    @Override
    public int getTimeOut() {
        return stamp.getTimeOut();
    }

    @Override
    public String getPromptAwait() {
        return stamp.getPromptAwait();
    }

    @Override
    public String getPromptDisconnect() {
        return stamp.getPromptDisconnect();
    }

    @Override
    public String getServiceUrl() {
        return stamp.getServiceUrl();
    }

    @Override
    public String getDesKey() {
        return stamp.getDesKey();
    }

    @Override
    public boolean isDebug() {
        return stamp.isDebug();
    }

    @Override
    public boolean isEncrypt() {
        return stamp.isEncrypt();
    }
}
