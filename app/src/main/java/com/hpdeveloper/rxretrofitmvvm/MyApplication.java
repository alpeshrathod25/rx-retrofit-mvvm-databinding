package com.hpdeveloper.rxretrofitmvvm;

import android.app.Application;

import com.hpdeveloper.rxretrofitmvvm.di.components.AppComponent;
import com.hpdeveloper.rxretrofitmvvm.di.components.DaggerAppComponent;

/**
 * Created by hirenpatel on 10/10/17.
 */

public class MyApplication extends Application {

    private static AppComponent appComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        appComponent = DaggerAppComponent.builder()
                .build();
    }

    public static AppComponent getAppComponent() {
        return appComponent;
    }
}
