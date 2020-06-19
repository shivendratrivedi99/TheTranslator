package com.singularity.thetranslator;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MediaPlayerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_media_player);

        final MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.baby_one_more_time);

        final Button buttonPlay = findViewById(R.id.play);

        buttonPlay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (mediaPlayer.isPlaying()) {
                    mediaPlayer.pause();
                    buttonPlay.setText(R.string.play);
                    Toast.makeText(getApplicationContext(), "Paused", Toast.LENGTH_SHORT).show();
                } else {
                    mediaPlayer.start();
                    buttonPlay.setText(R.string.pause);
                    Toast.makeText(getApplicationContext(), "Audio is playing", Toast.LENGTH_SHORT).show();
                }
            }
        });
        final Button buttonVolume = findViewById(R.id.pause);
        buttonVolume.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mediaPlayer.setVolume(995, 5);
                Toast.makeText(getApplicationContext(), "Paused", Toast.LENGTH_LONG).show();
            }
        });
        final Button buttonSkip = findViewById(R.id.skip);
        buttonSkip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(getApplicationContext(), "Skipping Audio to mid position", Toast.LENGTH_LONG).show();
            }
        });
    }


}


