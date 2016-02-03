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
        contactList.add(new Events("Vishal Rana", "President", "+91-9899033311"));
        contactList.add(new Events("Shubham Tyagi", "Cultural Advisor" ,"+91-8882653317"));

        contactList.add(new Events("Sopandev Tewari", "Student Advisor", "+91-9811537333"));
        contactList.add(new Events("Nalin Choudhary", "Cultural Secretary", "+91-8588001179"));
        contactList.add(new Events("Sheikh Farhan Raza", "Treasurer", "+91-8287883185"));
        contactList.add(new Events("Nithin Vytla", "Vice President", "+91-9650498607"));
        contactList.add(new Events("Aditi Maheshwari", "Joint Cultural Secretary", "+91-9717481156"));
        contactList.add(new Events("Snehal Toppo", "General Secretary", "+91-9718441404"));
        contactList.add(new Events("Nishant Aneja", "Joint Cultural Secretary", "+91-9811991514"));
        contactList.add(new Events("Aseem Bansal", "Joint Secretary", "+91-9582920037"));
        contactList.add(new Events("Jatin Agarwal", "Joint Treasurer", "+91-9910919517\n"));

    }
}
