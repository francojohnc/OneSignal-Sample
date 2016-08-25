package com.apkmarvel.onesignalsample;

import android.app.Application;
import android.util.Log;

import com.apkmarvel.onesignalsample.onesignal.OneSignalNotification;
import com.apkmarvel.onesignalsample.onesignal.UtilOneSignal;

/*https://documentation.onesignal.com/v2.0/docs/android-studio-sdk-installation*/
public class BaseApplication extends Application {
    public static final String TAG = BaseApplication.class.getSimpleName();

    @Override
    public void onCreate() {
        super.onCreate();
        Log.e(TAG, "onCreate");
        UtilOneSignal.init(this,new OneSignalNotification());
        UtilOneSignal.sendTag("SampleKey","new data");
    }
}