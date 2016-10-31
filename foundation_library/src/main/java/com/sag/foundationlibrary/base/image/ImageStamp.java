package com.sag.foundationlibrary.base.image;

import android.widget.ImageView;

/**
 * Created by SAG on 2016/10/31 0031.
 */

public interface ImageStamp<T extends ImageView> {

    void loadImage(T view, String url, float aspectRatio);

}
