package com.example.d1mys1klapo4ka.broadcastreceiver;

import android.app.AlarmManager;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.icu.util.TimeUnit;
import android.support.v4.app.NotificationCompat;
import android.support.v4.app.TaskStackBuilder;
import android.support.v4.util.TimeUtils;
import android.widget.Toast;

import java.sql.Time;

public class MyReceiver extends BroadcastReceiver {

    private NotificationManager nm;
    private String massege = " Z nation, Z narion,Z nation,Z nation,Z nation,Z nation,Z nation,";

    private int mId = 101;

    @Override
    public void onReceive(Context context, Intent intent) {
        notification(context, "Ваууууу!!!");
    }

    private void notification (Context context, String contentText){

        NotificationCompat.Builder mBuilder =
                new NotificationCompat.Builder(context)
                        .setSmallIcon(R.mipmap.ic_launcher_round)
                        .setContentTitle(context.getString(R.string.app_name))
                        .setContentText(massege)
                        .setAutoCancel(true)
                        .setTicker(massege)
                        .setWhen(System.currentTimeMillis());

        Intent resultIntent = new Intent(context, MainActivity.class);

        TaskStackBuilder stackBuilder = TaskStackBuilder.create(context);
        stackBuilder.addParentStack(MainActivity.class);
        stackBuilder.addNextIntent(resultIntent);

        PendingIntent resultPendingIntent =
                stackBuilder.getPendingIntent(
                        0,
                        PendingIntent.FLAG_UPDATE_CURRENT
                );

        mBuilder.setContentIntent(resultPendingIntent);

        NotificationManager mNotificationManager =
                (NotificationManager) context.getSystemService(Context.NOTIFICATION_SERVICE);

        mNotificationManager.notify(mId, mBuilder.build());

    }

}
