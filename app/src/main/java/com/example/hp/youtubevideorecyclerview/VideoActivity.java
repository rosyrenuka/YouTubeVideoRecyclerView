package com.example.hp.youtubevideorecyclerview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.android.youtube.player.YouTubeBaseActivity;
import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayerView;

public class VideoActivity extends YouTubeBaseActivity {

    TextView text1;
    TextView text2;
    Intent intent;

    public static final String API_KEY="AIzaSyDLVBdKXGSirHldyUKdSGO55sayavaBs_w";
    public static final String VIDEO_ID="qKX8ncb7Z9g";

    YouTubePlayerView youTubePlayerView;
    YouTubePlayer.OnInitializedListener onInitializedListener;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video);

        intent=getIntent();

        text1=findViewById(R.id.videotext1);
        text2=findViewById(R.id.videotext2);

        text1.setText("Manali is a year-round magnet for tourists over a few years increasing");
        text2.setText("Manali is a year-round magnet for tourists over a few years increasing Manali is a year-round magnet for tourists over a few years increasing Manali is a year-round magnet for tourists over a few years increasing Manali is a year-round magnet for tourists over a few years increasing Manali is a year-round magnet for tourists over a few years increasing Manali is a year-round magnet for tourists over a few years increasing Manali is a year-round magnet for tourists over a few years increasing Manali is a year-round magnet for tourists over a few years increasing rapidly.");


        youTubePlayerView = (YouTubePlayerView) findViewById(R.id.youtube_player);


        onInitializedListener = new YouTubePlayer.OnInitializedListener() {
            @Override
            public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer youTubePlayer, boolean b) {

                youTubePlayer.loadVideo("qKX8ncb7Z9g");
            }

            @Override
            public void onInitializationFailure(YouTubePlayer.Provider provider, YouTubeInitializationResult youTubeInitializationResult) {

            }
        };
//AIzaSyDLVBdKXGSirHldyUKdSGO55sayavaBs_w
        youTubePlayerView.initialize(PlayerConfig.API_KEY,onInitializedListener);
    }
}
