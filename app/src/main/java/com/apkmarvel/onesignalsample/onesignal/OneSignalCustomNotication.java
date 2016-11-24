package com.apkmarvel.onesignalsample.onesignal;

import android.util.Log;
import android.widget.Toast;

import com.onesignal.NotificationExtenderService;
import com.onesignal.OSNotificationPayload;
import com.onesignal.OSNotificationReceivedResult;


public class OneSignalCustomNotication extends NotificationExtenderService {
    public static final String TAG = OneSignalCustomNotication.class.getSimpleName();
    @Override
    protected boolean onNotificationProcessing(OSNotificationReceivedResult notification) {
        OSNotificationPayload osNotificationPayload = notification.payload;
        Log.e(TAG, "onNotificationProcessing");
        Log.e(TAG, "notification :" + osNotificationPayload.title);
        Log.e(TAG, "notification :" + osNotificationPayload.body);
        Log.e(TAG, "notification :" + osNotificationPayload.additionalData);
        Toast.makeText(getApplicationContext(),osNotificationPayload.title,Toast.LENGTH_SHORT).show();
        return true;
    }
}