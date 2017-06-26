package com.example.d1mys1klapo4ka.broadcastreceiver;
import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    AlarmManager am;
    private EditText mTime;

    public static long time;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mTime = (EditText)findViewById(R.id.et_time);
    }

    private void restartNotify() {

        am = (AlarmManager) getSystemService(Context.ALARM_SERVICE);
        Intent intent = new Intent(MainActivity.this, MyReceiver.class);
        PendingIntent pendingIntent = PendingIntent.getBroadcast(MainActivity.this, 0,
                intent, 0);

// Устанавливаем разовое напоминание
        am.set(AlarmManager.RTC,System.currentTimeMillis() + time * 1000, pendingIntent);
    }

    public void onClick (View view){
        switch (view.getId()){
            case R.id.button3:
                time = Integer.parseInt(mTime.getText().toString());

                restartNotify();
                break;
        }
    }
}
