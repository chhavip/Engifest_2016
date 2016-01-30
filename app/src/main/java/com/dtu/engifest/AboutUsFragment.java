package com.dtu.engifest;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.daimajia.slider.library.SliderLayout;
import com.daimajia.slider.library.SliderTypes.BaseSliderView;
import com.daimajia.slider.library.SliderTypes.TextSliderView;
import com.hanks.htextview.HTextView;
import com.hanks.htextview.HTextViewType;

import java.util.HashMap;

import in.championswimmer.libsocialbuttons.buttons.BtnFacebook;

/**
 * Created by chhavi on 24/1/16.
 */
public class AboutUsFragment extends Fragment {

    protected SliderLayout sliderShow;

    BtnFacebook fb;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.about_us_fragment, container, false);

        sliderShow = (SliderLayout) view.findViewById(R.id.slider);
        HashMap<String, String> file_maps = new HashMap<String, String>();
        file_maps.put("1", "http://engifest.dtu.ac.in/glimpses/2.jpg");
        file_maps.put("2", "http://engifest.dtu.ac.in/glimpses/3.jpg");
        file_maps.put("3", "http://engifest.dtu.ac.in/glimpses/4.jpg");
        file_maps.put("4", "http://engifest.dtu.ac.in/glimpses/5.jpg");
        file_maps.put("5", "http://engifest.dtu.ac.in/glimpses/7.jpg");
        file_maps.put("6", "http://engifest.dtu.ac.in/glimpses/0.jpg");
        file_maps.put("7", "http://engifest.dtu.ac.in/glimpses/1.jpg");



        for (String name : file_maps.keySet()) {
            TextSliderView textSliderView = new TextSliderView(getActivity());
            // initialize a SliderLayout
            textSliderView
                    .image(file_maps.get(name))
                    .setScaleType(BaseSliderView.ScaleType.Fit);


            sliderShow.addSlider(textSliderView);
        }
        sliderShow.setPresetTransformer(SliderLayout.Transformer.CubeIn);
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
