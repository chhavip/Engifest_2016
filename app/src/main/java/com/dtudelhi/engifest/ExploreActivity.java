package com.dtudelhi.engifest;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.dtudelhi.engifest.models.Sponsors;

import java.util.ArrayList;

public class ExploreActivity extends AppCompatActivity {
    RecyclerView eventCategoryRecycler;
    ArrayList<Sponsors> eventCategoryList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.explore_activity_layout);
        eventCategoryList = new ArrayList<>();
        addEventCategories();
        eventCategoryRecycler = (RecyclerView)findViewById(R.id.event_category_recycler_view);
        TextWithImageAdapter myAdapter = new TextWithImageAdapter(eventCategoryList, R.layout.event_category_item, this, true);
        eventCategoryRecycler.setAdapter(myAdapter);
        eventCategoryRecycler.setLayoutManager(new LinearLayoutManager(this));
    }

    private void addEventCategories() {

        eventCategoryList.add(new Sponsors("Food City", "https://scontent.fbom1-1.fna.fbcdn.net/hphotos-xtl1/v/t1.0-9/12193603_830764367049278_8140470311146019482_n.jpg?oh=5b3b2f0c3304b9468ab7787cf90f636d&oe=5724FA24"));
        eventCategoryList.add(new Sponsors("OAT", "https://scontent.fdel1-2.fna.fbcdn.net/hphotos-xlf1/v/t1.0-9/10009795_906053742791282_4230488487473731514_n.jpg?oh=0b6d83d913b57d1e46aff7cdebafb312&oe=573753A0"));
        eventCategoryList.add(new Sponsors("Sports Complex", "https://scontent.fdel1-2.fna.fbcdn.net/hphotos-xtp1/v/t1.0-9/10537418_906026392794017_1949871127911035687_n.jpg?oh=787ea1bfc7c2ff126530f4b6cc1fb216&oe=5737271F"));
        eventCategoryList.add(new Sponsors("BR Ambedkar Auditorium", "https://scontent.fdel1-2.fna.fbcdn.net/hphotos-xlp1/v/t1.0-9/11889527_945382678858388_534353024709046755_n.jpg?oh=c84c4edf3046c777a91aa939918c14c0&oe=573B0E87"));


    }

}
