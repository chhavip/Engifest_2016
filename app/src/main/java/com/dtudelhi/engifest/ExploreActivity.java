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
        eventCategoryList.add(new Sponsors("OAT", R.drawable.capmus));
        eventCategoryList.add(new Sponsors("Sports Complex", R.drawable.capmus));
        eventCategoryList.add(new Sponsors("Auditorium", "https://scontent.fbom1-1.fna.fbcdn.net/hphotos-xtl1/v/t1.0-9/12193603_830764367049278_8140470311146019482_n.jpg?oh=5b3b2f0c3304b9468ab7787cf90f636d&oe=5724FA24"));



    }

}
