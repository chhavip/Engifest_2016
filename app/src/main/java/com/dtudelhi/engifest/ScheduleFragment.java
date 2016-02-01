package com.dtudelhi.engifest;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;

import com.dtudelhi.engifest.models.Events;

import java.util.ArrayList;
import java.util.List;


/**
 * Created by chhavi on 24/1/16.
 */
public class ScheduleFragment extends Fragment implements View.OnClickListener {

   private RecyclerView eventRecycler;
    private  ArrayList<Events> eventList;
    private  FrameLayout scheduleButton13;
    private FrameLayout scheduleButton14;
    private FrameLayout scheduleButton15;
    EventListAdapter myAdapter;
    private TextView t13;
    private TextView t14;
    private TextView t15;
    private  int day;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.schedule_fragment_layout, container, false);
        scheduleButton13 = (FrameLayout) view.findViewById(R.id.feb_13);
        scheduleButton14 = (FrameLayout) view.findViewById(R.id.feb_14);
        scheduleButton15 = (FrameLayout) view.findViewById(R.id.feb_15);

        scheduleButton13.requestFocus();
        scheduleButton13.setBackgroundResource(R.drawable.custombordercircularpressed);
        scheduleButton13.setOnClickListener(this);
        scheduleButton14.setOnClickListener(this);
        scheduleButton15.setOnClickListener(this);

        t13 = (TextView) view.findViewById(R.id.t13);
        t14 = (TextView) view.findViewById(R.id.t14);
        t15 = (TextView) view.findViewById(R.id.t15);
        eventList = new ArrayList<>();
        t13.setTextColor(getResources().getColor(R.color.c_white));
        t14.setTextColor(getResources().getColor(R.color.colorAccent));
        t15.setTextColor(getResources().getColor(R.color.colorAccent));
        day = 1;
        addEventsAccordingToSchedule();

        eventRecycler = (RecyclerView) view.findViewById(R.id.event_category_recycler_view);
         myAdapter = new EventListAdapter(getActivity(), eventList);
        eventRecycler.setHasFixedSize(true);
        eventRecycler.setLayoutManager(new LinearLayoutManager(getActivity()));
        eventRecycler.setAdapter(myAdapter);

        return view;
    }

    private void addEventsAccordingToSchedule() {
//        eventList.add(new Events("Dance", "spandan", false));
        eventList.clear();
        List<Events> events;
        switch (day){
            case 1:
              events = Events.find(Events.class, "date = ?", "13th February");
                for(int i=0;i<events.size();i++){
                    eventList.add(events.get(i));
                }
                break;
            case 2:
              events = Events.find(Events.class, "date = ?", "14th February");
                for(int i=0;i<events.size();i++){
                    eventList.add(events.get(i));
                }
                break;
            case 3:
                 events = Events.find(Events.class, "date = ?", "15th February");
                for(int i=0;i<events.size();i++){
                    eventList.add(events.get(i));
                }
                break;

        }

        Log.e("asd", eventList.get(0).getDate() + " " + eventList.get(0).getName());

    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId())  {
            case R.id.feb_13:
                t13.setTextColor(getResources().getColor(R.color.c_white));
                t14.setTextColor(getResources().getColor(R.color.colorAccent));
                t15.setTextColor(getResources().getColor(R.color.colorAccent));
                scheduleButton13.setBackgroundResource(R.drawable.custombordercircularpressed);
                scheduleButton14.setBackgroundResource(R.drawable.custombordercircular);
                scheduleButton15.setBackgroundResource(R.drawable.custombordercircular);
                day = 1;
                addEventsAccordingToSchedule();
                myAdapter.notifyDataSetChanged();
                scheduleButton13.requestFocus();
                break;
            case R.id.feb_14:
                t14.setTextColor(getResources().getColor(R.color.c_white));
                t13.setTextColor(getResources().getColor(R.color.colorAccent));
                t15.setTextColor(getResources().getColor(R.color.colorAccent));
                scheduleButton14.setBackgroundResource(R.drawable.custombordercircularpressed);
                scheduleButton13.setBackgroundResource(R.drawable.custombordercircular);
                scheduleButton15.setBackgroundResource(R.drawable.custombordercircular);
                day = 2;
                addEventsAccordingToSchedule();
                myAdapter.notifyDataSetChanged();
                scheduleButton14.requestFocus();

                break;
            case R.id.feb_15:
                t15.setTextColor(getResources().getColor(R.color.c_white));
                t14.setTextColor(getResources().getColor(R.color.colorAccent));
                t13.setTextColor(getResources().getColor(R.color.colorAccent));
                scheduleButton15.setBackgroundResource(R.drawable.custombordercircularpressed);
                scheduleButton14.setBackgroundResource(R.drawable.custombordercircular);
                scheduleButton13.setBackgroundResource(R.drawable.custombordercircular);
                day = 3;
                addEventsAccordingToSchedule();
                myAdapter.notifyDataSetChanged();
                scheduleButton15.requestFocus();

                break;
        }
    }
}
