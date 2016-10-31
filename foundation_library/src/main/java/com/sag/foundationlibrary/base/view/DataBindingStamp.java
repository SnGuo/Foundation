package com.sag.foundationlibrary.base.view;

import android.databinding.ViewDataBinding;
import android.view.LayoutInflater;
import android.view.ViewGroup;

/**
 * 接口下的两个方法还可以进行一些界面的初始化操作，一般onCreateLayout进行界面的初始化，onBindInfo进行数据的初始化
 * <p>
 * Created by SAG on 2016/10/18 0018.
 */

public interface DataBindingStamp<T extends ViewDataBinding> {

    //加载UI视图
    void onCreateLayout(LayoutInflater inflater, ViewGroup parent);

    //加载UI需要的数据，该方法提供的对象必须与xml布局文件中的info对象类型一致
    void onBindInfo(T binding);

    void setLayoutView(int layout);
}
