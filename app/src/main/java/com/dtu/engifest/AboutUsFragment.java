package com.dtu.engifest;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.hanks.htextview.HTextView;
import com.hanks.htextview.HTextViewType;

/**
 * Created by chhavi on 24/1/16.
 */
public class AboutUsFragment extends Fragment {

    private HTextView headingText;
    private HTextView contentText;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.about_us_fragment, container, false);
        headingText = (HTextView)view.findViewById(R.id.headingText);
        contentText = (HTextView)view.findViewById(R.id.contentText);
        final String[] headings = new String[]{"ABOUT DTU", "ENGIFEST"};
        final String[] content = new String[]{
                "Delhi Technological University (formerly Delhi College of Engineering and Delhi Polytechnic) has been a premier engineering institute in the country since it came into existence in 1941, and has always striven to mould students into skilled technical experts by creating an atmosphere wherein they are consistently exposed to erudite and practical knowledge and experience. ",
                "Thrill, joy and ecstasy are words that are synonymous with ENGIFEST, the Annual Cultural Fest of Delhi Technological University (formerly Delhi College of Engineering). Engifest is one of the oldest college cultural fests of the country. It was started way back in 1974 by a bunch of enthusiastic DCEians. In February 2016, the fest will throw open its doors and welcome more than 30,000 enthusiastic students and professionals from all walks of life. ENGIFEST is a four day extravaganza; a celebration of sorts; a dense, fun-filled embodiment of the energy and conviviality which characterizes college life,  a festival oozing with fun, vibrancy and entertainment. It is a product of dreams ambition and tireless hard work, a true testimony to the indomitable spirit, liveliness and sheer energy of the youth. "};
        headingText.setAnimateType(HTextViewType.TYPER);
        headingText.animateText(headings[0]);
        contentText.setAnimateType(HTextViewType.SPARKLE);
        contentText.animateText(headings[0]);
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
}
