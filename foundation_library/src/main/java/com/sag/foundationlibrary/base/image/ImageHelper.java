package com.sag.foundationlibrary.base.image;

import android.widget.ImageView;

/**
 * Created by SAG on 2016/10/31 0031.
 */

public class ImageHelper {

    private static ImageStamp mStamp;

    public static void initialize(ImageStamp stamp) {
        mStamp = stamp;
    }

    public static <T extends ImageView> void loadImage(T view, String url, float aspectRatio) {
        mStamp.loadImage(view, url, aspectRatio);
    }
}
