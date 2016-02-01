package com.dtudelhi.engifest;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.dtudelhi.engifest.models.Sponsors;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by chhavi on 24/1/16.
 */
public class EventsFragment extends Fragment {

    RecyclerView eventCategoryRecycler;
    ArrayList<Sponsors> eventCategoryList;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.layout4, container, false);
        eventCategoryList = new ArrayList<>();
        addEventCategories();

        eventCategoryRecycler = (RecyclerView) view.findViewById(R.id.event_category_recycler_view);
        TextWithImageAdapter myAdapter = new TextWithImageAdapter(eventCategoryList, R.layout.event_category_item, getActivity());
        eventCategoryRecycler.setAdapter(myAdapter);
        eventCategoryRecycler.setLayoutManager(new LinearLayoutManager(getActivity()));
        return  view;
    }

    private void addEventCategories() {

        List<Sponsors> categories = Sponsors.listAll(Sponsors.class);
        for(Sponsors category:categories){
            Sponsors eventCategory = new Sponsors();
            eventCategory.setName(category.getName());
            eventCategory.setImageResource(category.getImageResource());
            eventCategoryList.add(eventCategory);
        }

    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
    }
}