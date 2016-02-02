package com.dtudelhi.engifest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.dtudelhi.engifest.models.Events;

import java.util.ArrayList;

public class ContacttUsActivity extends AppCompatActivity {

    private RecyclerView contactRecycler;
    private ArrayList<Events> contactList;
    EventListAdapter myAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contactt_us);
        contactList = new ArrayList<>();
        addContacts();

        contactRecycler = (RecyclerView) findViewById(R.id.event_category_recycler_view);
        myAdapter = new EventListAdapter(this, contactList);
        contactRecycler.setHasFixedSize(true);
        contactRecycler.setLayoutManager(new LinearLayoutManager(this));
        contactRecycler.setAdapter(myAdapter);

    }

    private void addContacts() {

    }
}
