package com.dtu.engifest;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v7.app.AppCompatActivity;

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

    List<String> titleList = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.menu_main_activity);
        coolMenuFrameLayout = (CoolMenuFrameLayout)findViewById(R.id.rl_main);

            String[] titles = {"ABOUT US", "SPONSORS", "SCHEDULE", "EVENTS", "HOME"};
        titleList = Arrays.asList(titles);
        coolMenuFrameLayout.setTitles(titleList);

        fragments.add(new Fragment1());
        fragments.add(new Fragment2());
        fragments.add(new Fragment3());
        fragments.add(new Fragment4());
        fragments.add(new Fragment5());

        FragmentPagerAdapter adapter = new FragmentPagerAdapter(getSupportFragmentManager()) {
            @Override
            public Fragment getItem(int position) {
                return fragments.get(position);

            }

            @Override
            public int getCount() {
                return fragments.size();
            }
        };
        coolMenuFrameLayout.setAdapter(adapter);

    }
}
