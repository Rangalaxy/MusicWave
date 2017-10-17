package com.example.sydridgm.musicwave;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;

/**
 * Created by sydridgm on 10/15/17.
 */

public class AudioWaveView extends LinearLayout {

    LineView line1;
    LineView line2;
    LineView line3;
    LineView line4;

    public AudioWaveView(Context context) {
        super(context);
        init(context, null, 0);
    }

    public AudioWaveView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(context, attrs, 0);
    }

    public AudioWaveView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        init(context, attrs, 0);
    }

    private void init(Context context, AttributeSet attrs, int defStyle) {
        View view = View.inflate(context, R.layout.audio_wave_widget, this);

        line1 = (LineView) view.findViewById(R.id.line1);
        line2 = (LineView) view.findViewById(R.id.line2);
        line3 = (LineView) view.findViewById(R.id.line3);
        line4 = (LineView) view.findViewById(R.id.line4);
    }

    public void startAnim() {
        line1.anim1();
        line2.anim2();
        line3.anim3();
        line4.anim4();
    }

    public void stopAnim() {
        line1.stopAnim1();
        line2.stopAnim2();
        line3.stopAnim3();
        line4.stopAnim4();
    }

    private void setLineViewPivots() {
        line1.setPivots(getMeasuredHeight());
        line2.setPivots(getMeasuredHeight());
        line3.setPivots(getMeasuredHeight());
        line4.setPivots(getMeasuredHeight());
    }

    private void setBottomHeight() {
        line1.setBottomHeight(getMeasuredHeight());
        line2.setBottomHeight(getMeasuredHeight());
        line3.setBottomHeight(getMeasuredHeight());
        line4.setBottomHeight(getMeasuredHeight());
    }

    @Override
    public void onWindowFocusChanged(boolean hasWindowFocus) {
        super.onWindowFocusChanged(hasWindowFocus);

        line1.setHeight(getMeasuredHeight() * 0.3f);
        line2.setHeight(getMeasuredHeight() * .9f);
        line3.setHeight(getMeasuredHeight() * .5f);
        line4.setHeight(getMeasuredHeight() * .7f);

        setLineViewPivots();

        setBottomHeight();

//        startAnim();
    }
}
