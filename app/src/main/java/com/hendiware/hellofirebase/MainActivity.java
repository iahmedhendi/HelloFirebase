package com.hendiware.hellofirebase;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

/*****************************************************************************************************
 *   This Project for testing only
 *
 *   replace your google-service.json with your file !
 *
 *   © Hendiware
 *   www.hendiware.com
 *
 ****************************************************************************************************/
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // start FCM Service
        startService(new Intent(this,FCMRegistrationService.class));
    }
}
