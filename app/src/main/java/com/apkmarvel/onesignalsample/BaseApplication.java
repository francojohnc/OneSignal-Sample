package com.apkmarvel.onesignalsample;

import android.app.Application;
import android.util.Log;

import com.apkmarvel.onesignalsample.onesignal.OneSignalNotification;
import com.apkmarvel.onesignalsample.onesignal.UtilOneSignal;
import com.onesignal.OneSignal;

import org.json.JSONObject;

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

    // This fires when a notification is opened by tapping on it or one is received while the app is running.
    private class ExampleNotificationOpenedHandler implements OneSignal.NotificationOpenedHandler {
        @Override
        public void notificationOpened(String message, JSONObject additionalData, boolean isActive) {
            try {
                if (additionalData != null) {
                    if (additionalData.has("actionSelected"))
                        Log.e(TAG, "OneSignal notification button with id " + additionalData.getString("actionSelected") + " pressed");
                    Log.e(TAG, "Full additionalData:\n" + additionalData.toString());

                }
            } catch (Throwable t) {
                t.printStackTrace();
            }
        }
    }
}