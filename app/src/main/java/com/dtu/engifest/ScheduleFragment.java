package com.dtu.engifest;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;

import com.dtu.engifest.models.Events;
import com.dtu.engifest.models.Sponsors;

import java.util.ArrayList;



/**
 * Created by chhavi on 24/1/16.
 */
public class ScheduleFragment extends Fragment implements View.OnClickListener {

    RecyclerView eventRecycler;
    ArrayList<Events> eventList;
    FrameLayout scheduleButton13;
    FrameLayout scheduleButton14;
    FrameLayout scheduleButton15;
    TextView t13;
    TextView t14;
    TextView t15;
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

        scheduleButton13.setOnClickListener(this);
        scheduleButton14.setOnClickListener(this);
        scheduleButton15.setOnClickListener(this);

        t13 = (TextView) view.findViewById(R.id.t13);
        t14 = (TextView) view.findViewById(R.id.t14);
        t15 = (TextView) view.findViewById(R.id.t15);
        eventList = new ArrayList<>();
        addEventsAccordingToSchedule();

        eventRecycler = (RecyclerView) view.findViewById(R.id.event_category_recycler_view);
        EventListAdapter myAdapter = new EventListAdapter(getActivity(), eventList);
        eventRecycler.setAdapter(myAdapter);
        eventRecycler.setLayoutManager(new LinearLayoutManager(getActivity()));

        return view;
    }

    private void addEventsAccordingToSchedule() {
//        eventList.add(new Events("Dance", "spandan", false));
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
                scheduleButton13.requestFocus();
                t13.setTextColor(getResources().getColor(R.color.c_white));
                t14.setTextColor(getResources().getColor(R.color.colorAccent));
                t15.setTextColor(getResources().getColor(R.color.colorAccent));

                break;
            case R.id.feb_14:
                scheduleButton14.requestFocus();
                t14.setTextColor(getResources().getColor(R.color.c_white));
                t13.setTextColor(getResources().getColor(R.color.colorAccent));
                t15.setTextColor(getResources().getColor(R.color.colorAccent));
                break;
            case R.id.feb_15:
                scheduleButton15.requestFocus();
                t15.setTextColor(getResources().getColor(R.color.c_white));
                t14.setTextColor(getResources().getColor(R.color.colorAccent));
                t13.setTextColor(getResources().getColor(R.color.colorAccent));
                break;
        }
    }
}
