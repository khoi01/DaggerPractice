package com.khoi.daggarpractice.di;

import android.app.Application;

import dagger.Module;
import dagger.Provides;

//module that does not related to activity


@Module
public class AppModule {

    @Provides
    static String someString(){
        return "this is a test string";
    }

    @Provides
    static boolean getApp(Application application){
        return application == null;
    }

}