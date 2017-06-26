package com.example.d1mys1klapo4ka.broadcastreceiver;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    public static final String NEW_CAT_DETECTED = "ua.dimysiklapo4ka.action.NEW_NOTIFICATION";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


}
