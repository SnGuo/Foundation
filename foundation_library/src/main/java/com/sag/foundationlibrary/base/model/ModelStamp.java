package com.sag.foundationlibrary.base.model;

import com.sag.foundationlibrary.base.file.FileHelper;
import com.sag.foundationlibrary.base.server.ServerHelper;
import com.sag.foundationlibrary.base.view.ResponseStamp;

import java.util.HashMap;
import java.util.List;
import java.util.Objects;

import rx.Subscription;

/**
 * Created by SAG on 2016/10/28 0028.
 */

public abstract class ModelStamp<T> {

    private ResponseStamp mResponseTarget;
    private HashMap<String, Object> mParameterLists;//参数列表
    private Subscription requestSubscription;//网络访问监视器
    private Subscription monitorSubscription;//缓存读取监视器

    public void setParameter(String key, Object value) {
        if (mParameterLists != null) {
            mParameterLists.put(key, value);
        } else {
            mParameterLists = new HashMap<>();
            mParameterLists.put(key, value);
        }
    }

    public HashMap<String, Object> getParameter() {
        return mParameterLists != null ? mParameterLists : new HashMap<String, Object>();
    }

    public ModelStamp setCallBackTarget(ResponseStamp stamp) {
        mResponseTarget = stamp;
        return this;
    }

    public void callBack(int type, ModelStamp<T> info) {
        mResponseTarget.onResponse(type, info);
    }

    public void receiveRequestSubscription(Subscription subscription) {
        requestSubscription = subscription;
    }

    public void receiveMonitorSubscription(Subscription subscription) {
        monitorSubscription = subscription;
    }

    public void unSubscribeRequest() {
        if (requestSubscription != null && !requestSubscription.isUnsubscribed()) {
            requestSubscription.unsubscribe();
        }
    }

    public void unSubscribeMonitor() {
        if (monitorSubscription != null && !monitorSubscription.isUnsubscribed()) {
            monitorSubscription.unsubscribe();
        }
    }

    public void clear() {
        mResponseTarget = null;
        unSubscribeRequest();
        unSubscribeMonitor();
    }

    public void transmit() {
        ServerHelper.request(this);
    }

    public void storage(String message) {
        FileHelper.write(getMethod(), message);
    }

    public ModelStamp fixedDebug() {
        ServerHelper.fixedMethod(getMethod());
        return this;
    }

    public abstract boolean isOk();

    public abstract boolean isEmpty();

    public abstract String getMessage();

    public abstract List<T> getData();

    public abstract String getMethod();

}
