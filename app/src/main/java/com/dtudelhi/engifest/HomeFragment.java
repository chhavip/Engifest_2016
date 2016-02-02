package com.dtudelhi.engifest;

import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.CardView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.daimajia.slider.library.SliderLayout;
import com.daimajia.slider.library.SliderTypes.BaseSliderView;
import com.daimajia.slider.library.SliderTypes.TextSliderView;

import java.util.HashMap;

/**
 * Created by chhavi on 24/1/16.
 */
public class HomeFragment extends Fragment {
    protected   SliderLayout sliderShow;
    CardView explore;
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

                return view;
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
