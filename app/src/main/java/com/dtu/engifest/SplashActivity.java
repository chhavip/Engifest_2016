package com.dtu.engifest;

import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextSwitcher;
import android.widget.TextView;
import android.widget.ViewSwitcher;

import com.hanks.htextview.HTextView;
import com.hanks.htextview.HTextViewType;

/**
 * Created by chhavi on 22/1/16.
 */
public class SplashActivity extends AppCompatActivity implements ViewSwitcher.ViewFactory {
    private HTextView hTextView;
    private TextSwitcher textSwitcher;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        final String[] sentences = new String[]{"THE WAIT", "IS OVER", "OVER"};
        setContentView(R.layout.splash_activity);
        hTextView = (HTextView) findViewById(R.id.text2);

        final Handler handler1 = new Handler();
        handler1.postDelayed(new Runnable() {
            @Override
            public void run() {
                hTextView.setAnimateType(HTextViewType.ANVIL);
                hTextView.animateText(sentences[0]);
            }
        }, 1000);

        final Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                hTextView.setAnimateType(HTextViewType.LINE);
                hTextView.animateText(sentences[1]);

            }
        }, 3000);


    }

    @Override
    public View makeView() {

        TextView t = new TextView(this);
        t.setGravity(Gravity.CENTER);
        t.setTextSize(TypedValue.COMPLEX_UNIT_SP, 30);
        return t;
    }
}
