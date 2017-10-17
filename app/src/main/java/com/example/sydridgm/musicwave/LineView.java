package com.example.sydridgm.musicwave;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;

/**
 * Created by sydridgm on 10/15/17.
 */

public class LineView extends View {

    private Paint paint;

    private float height;

    private float bottomHeight;

    ObjectAnimator objAnim1;
    ObjectAnimator objAnim2;
    ObjectAnimator objAnim3;
    ObjectAnimator objAnim4;

    public LineView(Context context) {
        super(context);
        init();
    }

    public LineView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public LineView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        init();
    }

    private void init() {
        paint = new Paint();
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        paint.setColor(Color.GREEN);
        paint.setStrokeWidth((float) (getWidth()/2));

        // draw first line
        canvas.drawLine(getWidth()/2, bottomHeight, getWidth()/2, bottomHeight-height, paint);
    }

    public void setHeight(float height) {
        this.height = height;
        invalidate();
    }

    public void anim1() {
        if (objAnim1 != null && Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
            objAnim1.resume();
        }else{
            objAnim1 = ObjectAnimator.ofFloat(this, "scaleY", 1f, 2.5f);
            objAnim1.setDuration(888);
            objAnim1.setRepeatCount(ValueAnimator.INFINITE);
            objAnim1.setRepeatMode(ValueAnimator.REVERSE);
            objAnim1.start();
        }
    }

    public void anim2() {
        if (objAnim2 != null && Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
            objAnim2.resume();
        }else{
            objAnim2 = ObjectAnimator.ofFloat(this, "scaleY", 1f, 0.45f);
            objAnim2.setDuration(888);
            objAnim2.setRepeatCount(ValueAnimator.INFINITE);
            objAnim2.setRepeatMode(ValueAnimator.REVERSE);
            objAnim2.start();
        }
    }

    public void anim3() {
        if (objAnim3 != null && Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
            objAnim3.resume();
        }else{
            objAnim3 = ObjectAnimator.ofFloat(this, "scaleY", 1f, 2f);
            objAnim3.setDuration(888);
            objAnim3.setRepeatCount(ValueAnimator.INFINITE);
            objAnim3.setRepeatMode(ValueAnimator.REVERSE);
            objAnim3.start();
        }
    }

    public void anim4() {
        if (objAnim4 != null && Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
            objAnim4.resume();
        }else{
            objAnim4 = ObjectAnimator.ofFloat(this, "scaleY", 1f, 0.25f);
            objAnim4.setDuration(888);
            objAnim4.setRepeatCount(ValueAnimator.INFINITE);
            objAnim4.setRepeatMode(ValueAnimator.REVERSE);
            objAnim4.start();
        }
    }

    public void stopAnim1() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
            objAnim1.pause();
        }else {
            objAnim1.cancel();
        }
    }

    public void stopAnim2() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
            objAnim2.pause();
        }else {
            objAnim2.cancel();
        }
    }

    public void stopAnim3() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
            objAnim3.pause();
        }else {
            objAnim3.cancel();
        }
    }

    public void stopAnim4() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
            objAnim4.pause();
        }else {
            objAnim4.cancel();
        }
    }

    public void setPivots(float parentHeight) {
        this.setPivotX(0f);
        this.setPivotY(parentHeight);
    }

    public void setBottomHeight(float bottomHeight) {
        this.bottomHeight = bottomHeight;
    }
}
