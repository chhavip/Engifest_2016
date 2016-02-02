package com.dtudelhi.engifest;

import android.app.Activity;
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

import com.afollestad.materialdialogs.DialogAction;
import com.afollestad.materialdialogs.MaterialDialog;
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
    CardView register;
    Activity mActivity;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mActivity = getActivity();
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
        register = (CardView) view.findViewById(R.id.register);
        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final String url = "https://play.google.com/store/apps/details?id=com.blackcurrantapps.iamin&referrer=utm_source%3DDelhi%2520Network%26utm_medium%3DWhatsapp%2520Links%26utm_term%3DDTU%252BDelhi%26utm_campaign%3DDelhi%2520Technological%2520University%26anid%3Dadmob";
                new MaterialDialog.Builder(mActivity)
                        .title("Instructions")
                        .content("Step 1: Download and register on IAMIN App\n" +
                                "\n" +
                                "Step 2: Go to Engifest in the App, claim your free gatepass and click on IAMIN\n" +
                                "\n" +
                                "Step 3: Go to Offers section in the App and download the Loudshout App\n" +
                                "\n" +
                                "Step 4: Register on Loudshout App and select DTU as your basecamp\n" +
                                "\n" +
                                "Entry point verification:\n" +
                                "\n" +
                                "a) QR code scan of ticket received in the IAMIN App or Email received from IAMIN\n" +
                                "\n" +
                                "b) Physical verification of Loudshout App download with DTU base camp selection")
                        .positiveText("Download IAMIN App").onPositive(new MaterialDialog.SingleButtonCallback() {
                    @Override
                    public void onClick(MaterialDialog dialog, DialogAction which) {
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
                })
                        .show();
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
