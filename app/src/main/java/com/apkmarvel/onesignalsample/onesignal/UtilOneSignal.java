package com.apkmarvel.onesignalsample.onesignal;

import android.content.Context;

import com.onesignal.OneSignal;

/**
 * Created by JCF on 5/31/2016.
 */
public class UtilOneSignal {
    public static void init(Context context,OneSignal.NotificationOpenedHandler handler){
        OneSignal.startInit(context).setNotificationOpenedHandler(handler).init();
        OneSignal.enableNotificationsWhenActive(true);
    }
    public static void sendTag(String key, String value){
        OneSignal.sendTag(key, value);
    }
}
