package com.jason.movetasktoback;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;

/**
 * Created by Jason on 2017/12/18.
 */

public class MoveTaskToBackModule extends ReactContextBaseJavaModule {



    public MoveTaskToBackModule(ReactApplicationContext reactContext) {
        super(reactContext);

    }
    @Override
    public String getName() {
        return "RNMoveTaskToBack";
    }

    @ReactMethod
    public void moveToBack() {
        getCurrentActivity().moveTaskToBack(true);
    }
}
