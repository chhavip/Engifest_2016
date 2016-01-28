package com.dtu.engifest;

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

import com.dtu.engifest.models.Sponsors;
import com.parse.FindCallback;
import com.parse.ParseException;
import com.parse.ParseObject;
import com.parse.ParseQuery;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by chhavi on 24/1/16.
 */
public class SponsorsFragment extends Fragment {

    RecyclerView sponsorsRecycler;
    ArrayList<Sponsors> sponsorsList;
    TextWithImageAdapter myAdapter;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.sponsors_fragment_layout, container, false);
        sponsorsList = new ArrayList<>();
        addSponsors();

        sponsorsRecycler = (RecyclerView) view.findViewById(R.id.cardList);
        myAdapter = new TextWithImageAdapter(sponsorsList, R.layout.card_with_text_and_image, getActivity());
        sponsorsRecycler.setAdapter(myAdapter);
        sponsorsRecycler.setLayoutManager(new LinearLayoutManager(getActivity()));
        return view;
    }

    private void addSponsors() {
        ParseQuery<ParseObject> query = ParseQuery.getQuery("Sponsors");
        query.findInBackground(new FindCallback<ParseObject>() {
            @Override
            public void done(List<ParseObject> objects, ParseException e) {
                if(e == null)   {
                    for (int i = 0; i < objects.size(); i++) {
                        Sponsors sponsors = new Sponsors(objects.get(i).getString("sponsorTitle"), objects.get(i).getString("imageUrl"));
                        sponsorsList.add(sponsors);
                    }
                    myAdapter.notifyDataSetChanged();

                }
                else {
                    Log.d("errorInAddingSponsors", e.toString());
                }
            }
        });
        Sponsors sponsors = new Sponsors();
        sponsors.setName("Pepsi");
        sponsors.setImageUrl("http://vignette2.wikia.nocookie.net/logopedia/images/1/15/Pepsi_2007.png/revision/latest?cb=20140327110444");
        sponsorsList.add(sponsors);
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
