package com.khoi.daggarpractice;


import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

import javax.inject.Inject;

import dagger.android.AndroidInjector;
import dagger.android.HasActivityInjector;
import dagger.android.support.DaggerAppCompatActivity;


public class AuthActivity extends DaggerAppCompatActivity{

    private static final String TAG = "AuthActivity";

    @Inject
    String someString;

    @Inject
    boolean isAppNull;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_auth);

        Log.d(TAG, "onCreate: " + someString);
        Log.d(TAG, "onCreate: is app null? " + isAppNull);
    }

}