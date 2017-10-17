package com.example.sydridgm.musicwave;

import android.animation.AnimatorSet;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.ScaleAnimation;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    boolean playingAnim = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final AudioWaveView audioWaveView = (AudioWaveView) findViewById(R.id.audio_wave_view);

        final Button button = (Button) findViewById(R.id.button);



        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!playingAnim) {
                    playingAnim = true;
                    audioWaveView.startAnim();
                    button.setText("STOP ANIMATION");
                }else{
                    playingAnim = false;
                    audioWaveView.stopAnim();
                    button.setText("START ANIMATION");
                }
            }
        });
    }
}
