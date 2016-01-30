package com.dtu.engifest;

import android.app.Application;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.util.Log;

import com.dtu.engifest.models.Category;
import com.dtu.engifest.models.Contact;
import com.dtu.engifest.models.Events;
import com.orm.SugarApp;
import com.orm.SugarRecord;
import com.parse.Parse;
import com.parse.ParseException;
import com.parse.ParseInstallation;
import com.parse.ParsePush;
import com.parse.ParseUser;
import com.parse.SaveCallback;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by chhavi on 28/1/16.
 */
public class EngifestApplication extends SugarApp {

    @Override
    public void onCreate() {
        super.onCreate();
        Parse.setLogLevel(Parse.LOG_LEVEL_VERBOSE);
        Parse.enableLocalDatastore(getApplicationContext());
        Parse.initialize(getApplicationContext());
        ParseInstallation.getCurrentInstallation().saveInBackground(new SaveCallback() {
            @Override
            public void done(ParseException e) {
                String deviceToken = (String) ParseInstallation.getCurrentInstallation().get("deviceToken");

                Log.d("my_app","DEVICE TOKEN: " + deviceToken);
            }
        });
        ParsePush.subscribeInBackground("everyone", new SaveCallback() {
            @Override
            public void done(ParseException e) {
                if (e == null) {
                    Log.d("com.parse.push", "successfully subscribed to the broadcast channel.");
                } else {
                    Log.e("com.parse.push", "failed to subscribe for push", e);
                }
            }
        });




       /* ParsePush.subscribeInBackground(, new SaveCallback() {
            @Override
            public void done(ParseException e) {
                if (e == null) {
                    Log.d("com.parse.push", "Successfully subscribed to Parse!");
                } else {
                    Log.e("com.parse.push", "failed to subscribe for push", e);
                }
            }
        });*/
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
/*    public static void updateParseInstallation(ParseUser user) {
        ParseInstallation installation = ParseInstallation.getCurrentInstallation();
        installation.put("userId", user.getObjectId());
        installation.saveInBackground();
    }*/

    //This is the user that will be inserted in "Installation class"
    public static void subscribeWithUser(String user) {
        ParseInstallation installation = ParseInstallation.getCurrentInstallation();

        installation.put("user", user);

        installation.saveInBackground(new SaveCallback() {
            @Override
            public void done(ParseException e) {
                if (e == null) {
                    Log.e("subscribeWithUser", "User subscribed successfully!!", e);
                } else {
                    e.printStackTrace();
                    Log.e("subscribeWithUser", "Error to save user", e);
                }
            }
        });
    }



    }


