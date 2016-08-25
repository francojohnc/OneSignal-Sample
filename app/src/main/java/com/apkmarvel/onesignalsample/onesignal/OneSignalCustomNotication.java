package com.apkmarvel.onesignalsample.onesignal;

import android.util.Log;
import android.widget.Toast;

import com.onesignal.NotificationExtenderService;
import com.onesignal.OSNotificationPayload;


public class OneSignalCustomNotication extends NotificationExtenderService {
    public static final String TAG = OneSignalCustomNotication.class.getSimpleName();

    @Override
    protected boolean onNotificationProcessing(OSNotificationPayload notification) {
        // Read properties from notification.
        Log.e(TAG, "onNotificationProcessing");
        Log.e(TAG, "notification :" + notification.message);
        Log.e(TAG, "notification :" + notification.title);
        Log.e(TAG, "notification :" + notification.additionalData);
        Toast.makeText(getApplicationContext(),notification.message,Toast.LENGTH_SHORT).show();
        return true;
    }
}