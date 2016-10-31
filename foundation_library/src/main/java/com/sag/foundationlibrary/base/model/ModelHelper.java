package com.sag.foundationlibrary.base.model;

import android.support.annotation.Nullable;

import com.sag.foundationlibrary.base.view.ResponseStamp;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

/**
 * Created by SAG on 2016/10/31 0031.
 */

public class ModelHelper {

    private static final HashMap<Class, HashMap<Class, ModelStamp>> ModelRegister = new HashMap<>();

    public static <T extends ModelStamp> ModelStamp getModelInstance(ResponseStamp response, Class<T> model) {
        ModelStamp stamp;
        Class location = response.getClass();
        if (ModelRegister.containsKey(location)) {
            HashMap<Class, ModelStamp> Models = ModelRegister.get(location);
            if (Models.containsKey(model)) {
                stamp = Models.get(model);
            } else {
                Models.put(model, stamp = create(response, model));
            }
        } else {
            HashMap<Class, ModelStamp> Models = new HashMap<>();
            Models.put(model, stamp = create(response, model));
            ModelRegister.put(location, Models);
        }
        return stamp;
    }

    public static void clear(Class location) {
        if (ModelRegister.containsKey(location)) {
            HashMap<Class, ModelStamp> Models = ModelRegister.get(location);
            Set<Class> set = Models.keySet();
            Iterator<Class> iterator = set.iterator();
            while (iterator.hasNext()) {
                Models.get(iterator.next()).clear();
            }
            Models.clear();
            ModelRegister.remove(location);
        }
    }

    @Nullable
    private static <T extends ModelStamp> ModelStamp create(ResponseStamp response, Class<T> model) {
        try {
            ModelStamp stamp = model.newInstance();
            return stamp.setCallBackTarget(response);
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return null;
    }

}
