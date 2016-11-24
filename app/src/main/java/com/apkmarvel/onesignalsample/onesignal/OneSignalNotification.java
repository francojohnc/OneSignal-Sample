package com.apkmarvel.onesignalsample.onesignal;

import android.util.Log;

import com.onesignal.OSNotificationOpenResult;
import com.onesignal.OneSignal;


/**
 * Created by JCF on 3/30/2016.
 */
public class OneSignalNotification implements OneSignal.NotificationOpenedHandler {
    public static final String TAG = OneSignalNotification.class.getSimpleName();
    public OneSignalNotification(){
    }

//    /*if notification click*/
//    @Override
//    public void notificationOpened(String message, JSONObject additionalData, boolean isActive) {
//        try {
//            Log.e(TAG,"message: "+message);
//            if (additionalData != null) {
//                Log.e(TAG,"additionalData: "+additionalData.toString());
//                if (additionalData.has("actionSelected")){
//                    Log.e(TAG, "OneSignal notification button with id " + additionalData.getString("actionSelected") + " pressed");
//                    Log.e(TAG, "Full additionalData:\n" + additionalData.toString());
//                }
//            }
//        } catch (Throwable t) {
//            t.printStackTrace();
//        }
//    }

    @Override
    public void notificationOpened(OSNotificationOpenResult result) {
        Log.e(TAG,"notificationOpened");
    }
}