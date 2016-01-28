package com.dtu.engifest;

import android.app.Application;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

import com.dtu.engifest.models.Category;
import com.dtu.engifest.models.Contact;
import com.dtu.engifest.models.Events;
import com.orm.SugarApp;
import com.orm.SugarRecord;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by chhavi on 28/1/16.
 */
public class EngifestApplication extends SugarApp {

    @Override
    public void onCreate() {
        super.onCreate();
        Singleton singleton = Singleton.getInstance();

        SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(this);
        if (!prefs.getBoolean("firstTime", false)) {
            // <---- run your one time code here
            singleton.initialiseDb();

            // mark first time has runned.
            SharedPreferences.Editor editor = prefs.edit();
            editor.putBoolean("firstTime", true);
            editor.commit();
        }

    }

}
