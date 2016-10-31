package com.sag.foundationlibrary.base.file;

import com.sag.foundationlibrary.base.model.ModelStamp;

/**
 * Created by SAG on 2016/10/31 0031.
 */

public interface FileStamp {

    void read(ModelStamp target);

    void write(String method, String message);
}
