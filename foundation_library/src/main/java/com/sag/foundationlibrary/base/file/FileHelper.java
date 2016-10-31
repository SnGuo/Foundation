package com.sag.foundationlibrary.base.file;

import com.sag.foundationlibrary.base.model.ModelStamp;

/**
 * Created by SAG on 2016/10/31 0031.
 */

public class FileHelper {

    private static FileStamp mStamp;

    public static void initialize(FileStamp stamp) {
        mStamp = stamp;
    }

    public static void read(ModelStamp target) {
        mStamp.read(target);
    }

    public static void write(String method, String message) {
        mStamp.write(method, message);
    }
}
