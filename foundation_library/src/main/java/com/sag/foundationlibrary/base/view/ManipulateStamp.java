package com.sag.foundationlibrary.base.view;

import android.view.View;

/**
 * Created by SAG on 2016/10/18 0018.
 */

public interface ManipulateStamp {

    //自定义Toolbar视图
    void setToolbar(View view);

    //自定义Toolbar视图、StatusBar背景颜色
    void setToolbar(View view, int color);

    //隐藏Toolbar
    void hideToolbar();

    //显示Toolbar
    void showToolbar();

    //显示空数据视图
    void promptEmpty();

    //显示错误数据视图
    void promptError();

    //显示加载数据视图(界面被完全覆盖，一般用于初始化界面使用——无缓存)
    void promptLoading();

    //显示等待进度条(界面不会被完全覆盖，一般用于提交数据使用)
    void promptAwaitDialog();

    //移除所有多状态视图
    void removeStatusView();

}
