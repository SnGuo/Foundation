package com.sag.foundationlibrary.base.server;

import com.sag.foundationlibrary.base.model.ModelStamp;

/**
 * Created by SAG on 2016/10/31 0031.
 */

public interface ServerStamp {
    void request(ModelStamp model);

    void fixedMethod(String method);
}
