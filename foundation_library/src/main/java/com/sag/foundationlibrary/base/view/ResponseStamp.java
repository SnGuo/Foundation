package com.sag.foundationlibrary.base.view;

import android.view.View;

import com.sag.foundationlibrary.base.model.ModelStamp;

/**
 * Created by SAG on 2016/10/25 0025.
 */

public interface ResponseStamp {

    int Target_Request_Error = 0x001;
    int Target_Request_Success = 0x002;
    int Target_Cache_Null = 0x003;
    int Target_CACHE_VALID = 0x004;

    int Target_Click_ErrorView_OR_EmptyView = 0x011;

    void onResponse(int type, ModelStamp info);

    void onRequest(int type, View v);
}
