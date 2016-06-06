package com.mouks.rosie.cheztoi.conf;

import android.app.Application;
import android.content.Context;

/**
 * Created by Rosie on 2016/06/06.
 */
public class App extends Application {
    private static Context context;
    private static App singleton;

    public void onCreate(){
        super.onCreate();
        App.context = getApplicationContext();
        singleton = this;
    }

    public static Context getAppContext(){
        return App.context;
    }

    public static final String TAG = App.class.getSimpleName();
    public static synchronized App getInstance(){
        return singleton;
    }
}
