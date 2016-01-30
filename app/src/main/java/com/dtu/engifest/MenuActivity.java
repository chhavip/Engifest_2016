package com.dtu.engifest;

import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.dxtt.coolmenu.CoolMenuFrameLayout;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by chhavi on 24/1/16.
 */
public class MenuActivity extends AppCompatActivity {
    CoolMenuFrameLayout coolMenuFrameLayout;

    List<Fragment> fragments = new ArrayList<>();
    FloatingActionButton fab;
    List<String> titleList = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.menu_main_activity);
        coolMenuFrameLayout = (CoolMenuFrameLayout)findViewById(R.id.rl_main);

        String[] titles = {"SPONSORS", "ABOUT US", "SCHEDULE", "EVENTS", "HOME"};
        titleList = Arrays.asList(titles);
        coolMenuFrameLayout.setTitles(titleList);

        fragments.add(new SponsorsFragment());
        fragments.add(new AboutUsFragment());
        fragments.add(new ScheduleFragment());
        fragments.add(new EventsFragment());
        fragments.add(new HomeFragment());

        fab = (FloatingActionButton)findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isGoogleMapsInstalled()) {
                    Intent intent = new Intent(android.content.Intent.ACTION_VIEW,
                            Uri.parse("http://maps.google.com/maps?daddr=28.749947,77.117028"));
                    startActivity(intent);


                } else {
                    Snackbar.make(view, "Google Maps not installed", Snackbar.LENGTH_LONG).show();

                }
            }
        });
        FragmentPagerAdapter adapter = new FragmentPagerAdapter(getSupportFragmentManager()) {
            @Override
            public Fragment getItem(int position) {

                if(position == 1)
                    fab.setVisibility(View.GONE);
                else
                    fab.setVisibility(View.VISIBLE);
                return fragments.get(position);

            }

            @Override
            public int getCount() {
                return fragments.size();
            }
        };
        coolMenuFrameLayout.setAdapter(adapter);




    }
    public boolean isGoogleMapsInstalled()
    {
        try
        {
            ApplicationInfo info = getPackageManager().getApplicationInfo("com.google.android.apps.maps", 0);
            return true;
        }
        catch(PackageManager.NameNotFoundException e)
        {
            return false;
        }
    }
}
