package com.dtu.engifest;

import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.afollestad.materialdialogs.MaterialDialog;
import com.dtu.engifest.models.Events;

import java.util.List;

public class EventDetail extends AppCompatActivity {

    private TextView title;
    private TextView date;
    private TextView venue;
    private TextView time;
    private TextView description;
    private Button contacts;
    private Button rules;
    private Button register;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_event_detail);

        String name = getIntent().getExtras().getString("name");
        List<Events> events = Events.find(Events.class, "name = ?", name);

        Log.e("asfa", events.get(0).getName());

        title = (TextView)findViewById(R.id.movie_title);
        date = (TextView)findViewById(R.id.release_date_text);
        time = (TextView)findViewById(R.id.release_date);
        description = (TextView)findViewById(R.id.movie_synopsis);
        venue = (TextView)findViewById(R.id.time);

        rules = (Button)findViewById(R.id.rules_button);
        contacts = (Button)findViewById(R.id.contacts_button);
        register = (Button)findViewById(R.id.register_button);

        populateEvent(events.get(0));



    }

    public void populateEvent(final Events event){
        title.setText(event.getName());
        date.setText(event.getDate());
        time.setText(event.getTime());
        description.setText(event.getInformation());
        venue.setText(event.getVenue());
        if(event.isComingSoon()){
            description.setText("Coming Soon!");
        }

        if(event.getRules()!=null){
            rules.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    new MaterialDialog.Builder(EventDetail.this)
                            .title("Rules")
                            .content(event.getRules())
                            .positiveText("OK")
                            .show();
                }
            });
        }else{
            rules.setVisibility(View.GONE);
        }
        if(event.getRegisterLink()!=null){
            register.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    String url = event.getRegisterLink();
                    try {
                        Intent i = new Intent("android.intent.action.MAIN");
                        i.setComponent(ComponentName.unflattenFromString("com.android.chrome/com.android.chrome.Main"));
                        i.addCategory("android.intent.category.LAUNCHER");
                        i.setData(Uri.parse(url));
                        startActivity(i);
                    }
                    catch(ActivityNotFoundException e) {
                        // Chrome is not installed
                        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                        startActivity(i);
                    }
                }
            });

        }else{
            register.setVisibility(View.GONE);
        }

    }

}
