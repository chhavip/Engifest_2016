package com.dtu.engifest;

import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.CoordinatorLayout;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.graphics.Palette;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.afollestad.materialdialogs.MaterialDialog;
import com.dtu.engifest.models.Events;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.Target;

import java.util.List;

public class EventDetail extends AppCompatActivity {

    private TextView title;
    private TextView date;
    private TextView venue;
    private TextView time;
    private TextView description;
    private TextView fees;
    private TextView fees_text;
    private ImageView image;
    private Button contacts;
    private LinearLayout linearLayout;
    private CoordinatorLayout coordinatorLayout;
//    ImageView background;
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
        fees = (TextView)findViewById(R.id.fees_text);
        fees_text = (TextView)findViewById(R.id.fees);
        description = (TextView)findViewById(R.id.movie_synopsis);
        venue = (TextView)findViewById(R.id.time);
        image = (ImageView)findViewById(R.id.movie_poster);
        linearLayout = (LinearLayout)findViewById(R.id.immgB);
        coordinatorLayout = (CoordinatorLayout)findViewById(R.id.cordinator_layout);
//        background = (ImageView)findViewById(R.id.imageBg);

        rules = (Button)findViewById(R.id.rules_button);
        contacts = (Button)findViewById(R.id.contacts_button);
        register = (Button)findViewById(R.id.register_button);

        populateEvent(events.get(0));



    }

    public void populateEvent(final Events event){
        title.setText(event.getName());
        date.setText(event.getDate());
        time.setText(event.getTime());
        if(event.getInformation()!=null) {
            description.setText(event.getInformation());
        }else{
            description.setVisibility(View.GONE);
        }
        venue.setText(event.getVenue());
        Picasso.with(this)
                .load(event.getImageUrl())
                .into(new Target() {
                    @Override
                    public void onBitmapLoaded(final Bitmap bitmap, Picasso.LoadedFrom from) {
            /* Save the bitmap or do something with it here */

                        //Set it in the ImageView
                        image.setImageBitmap(bitmap);
                        coordinatorLayout.setBackgroundColor(getVibrantColor(bitmap));
                    }

                    @Override
                    public void onBitmapFailed(Drawable errorDrawable) {

                    }

                    @Override
                    public void onPrepareLoad(Drawable placeHolderDrawable) {

                    }
                });
/*
        Picasso.with(this).load("url").into(target);
        Picasso.with(EventDetail.this).load(event.getImageUrl()).into(image);
        ;*/
//        Picasso.with(EventDetail.this).load(event.getImageUrl()).into(background);
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
                    } catch (ActivityNotFoundException e) {
                        // Chrome is not installed
                        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                        startActivity(i);
                    }
                }
            });

        }else{
            register.setVisibility(View.GONE);
        }
        if(event.getContacts()!=null){
            contacts.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    new MaterialDialog.Builder(EventDetail.this)
                            .title("Contact")
                            .content(event.getContacts())
                            .positiveText("OK")
                            .show();

                }
            });
        }else{
            contacts.setVisibility(View.GONE);
        }

        if(event.getFees()!=null){
            fees.setText(event.getFees());
        }else{
            fees.setVisibility(View.GONE);
            fees_text.setVisibility(View.GONE);
        }



    }

    public int getVibrantColor(Bitmap bitmap) {

       /* BitmapDrawable drawable = (BitmapDrawable) imageView.getDrawable();
        Bitmap bitmap = drawable.getBitmap();*/

        Palette p = Palette.generate(bitmap);

        int color = p.getLightVibrantColor(EventDetail.this.getResources().getColor(R.color.colorPrimaryDark));
        setButtonBackground(p.getLightMutedColor(getResources().getColor(R.color.button_colour)));


        return color;
    }
    public void setButtonBackground(int color){
        register.setBackgroundColor(color);
        contacts.setBackgroundColor(color);
        rules.setBackgroundColor(color);
    }

}
