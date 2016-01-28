package com.dtu.engifest;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.daimajia.slider.library.SliderLayout;
import com.daimajia.slider.library.SliderTypes.BaseSliderView;
import com.daimajia.slider.library.SliderTypes.TextSliderView;
import com.github.jorgecastillo.FillableLoader;

import java.util.HashMap;

/**
 * Created by chhavi on 24/1/16.
 */
public class HomeFragment extends Fragment {
    protected   SliderLayout sliderShow;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.home_fragment_layout, container, false);

        sliderShow = (SliderLayout) view.findViewById(R.id.slider);

        HashMap<String, Integer> file_maps = new HashMap<String, Integer>();
        file_maps.put("Our campus", R.drawable.capmus);
        file_maps.put("Love Nature", R.drawable.campus_grass);
        file_maps.put("Fun Times", R.drawable.dance);
        file_maps.put("Home", R.drawable.dtu);

        for (String name : file_maps.keySet()) {
            TextSliderView textSliderView = new TextSliderView(getActivity());
            // initialize a SliderLayout
            textSliderView
                    .description(name)
                    .image(file_maps.get(name))
                    .setScaleType(BaseSliderView.ScaleType.Fit);


            sliderShow.addSlider(textSliderView);
        }
            sliderShow.setPresetTransformer(SliderLayout.Transformer.Accordion);
            sliderShow.setPresetIndicator(SliderLayout.PresetIndicators.Right_Bottom);

        FloatingActionButton fab = (FloatingActionButton) view.findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(isGoogleMapsInstalled()) {
                    Intent intent = new Intent(android.content.Intent.ACTION_VIEW,
                            Uri.parse("http://maps.google.com/maps?daddr=28.749947,77.117028"));
                    startActivity(intent);


                }
                else{
                    Snackbar.make(view, "Google Maps not installed", Snackbar.LENGTH_LONG).show();

                }
            }
        });
        return view;
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
    }


    public boolean isGoogleMapsInstalled()
    {
        try
        {
            ApplicationInfo info = getActivity().getPackageManager().getApplicationInfo("com.google.android.apps.maps", 0);
            return true;
        }
        catch(PackageManager.NameNotFoundException e)
        {
            return false;
        }
    }
    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
    }

    @Override
    public void onStop() {
        sliderShow.stopAutoCycle();
        super.onStop();
    }
}
