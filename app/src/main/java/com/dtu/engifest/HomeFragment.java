package com.dtu.engifest;

import android.content.ActivityNotFoundException;
import android.content.ComponentName;
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
import android.support.v7.widget.CardView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.daimajia.slider.library.SliderLayout;
import com.daimajia.slider.library.SliderTypes.BaseSliderView;
import com.daimajia.slider.library.SliderTypes.TextSliderView;
import com.github.jorgecastillo.FillableLoader;
import com.hanks.htextview.HTextView;
import com.hanks.htextview.HTextViewType;

import java.util.HashMap;

/**
 * Created by chhavi on 24/1/16.
 */
public class HomeFragment extends Fragment {
    protected   SliderLayout sliderShow;
    CardView explore;
    CardView accommodation;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.home_fragment_layout, container, false);

        sliderShow = (SliderLayout) view.findViewById(R.id.slider);
        explore = (CardView) view.findViewById(R.id.explore);
        accommodation = (CardView) view.findViewById(R.id.accommodation);
        explore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), ExploreActivity.class));
            }
        });
        /*HTextView about_engifest = (HTextView)view.findViewById(R.id.about_engifest);

        String aboutEngi = "Thrill, joy and ecstasy are words that are synonymous with ENGIFEST";
        about_engifest.setAnimateType(HTextViewType.PIXELATE);
        about_engifest.animateText(aboutEngi);*/

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

        accommodation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://docs.google.com/forms/d/1MajWbBidj5w2RnO1kX6MynJ5ANzkHD2RFcD0AreQ5H0/viewform?c=0&w=1";
                try {
                    Intent i = new Intent("android.intent.action.MAIN");
                    i.setComponent(ComponentName.unflattenFromString("com.android.chrome/com.android.chrome.Main"));
                    i.addCategory("android.intent.category.LAUNCHER");
                    i.setData(Uri.parse(url));
                    startActivity(i);
                } catch (ActivityNotFoundException e) {
                    // Chrome is not installed
                    Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                    startActivity(i);
                }
            }
        });        return view;
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
    public void onStop() {
        sliderShow.stopAutoCycle();
        super.onStop();
    }
}
