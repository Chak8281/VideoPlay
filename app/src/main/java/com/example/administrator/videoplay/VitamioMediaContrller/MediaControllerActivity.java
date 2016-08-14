package com.example.administrator.videoplay.VitamioMediaContrller;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.administrator.videoplay.R;
import com.example.administrator.videoplay.VideoUrlRes;

import io.vov.vitamio.widget.MediaController;
import io.vov.vitamio.widget.VideoView;

public class MediaControllerActivity extends AppCompatActivity {


    private VideoView videoView;
    private MediaController controller;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vitamio_video_view);
        videoView = (VideoView) findViewById(R.id.vitamio_videoView);
        PlayVideoView();
    }

    private void PlayVideoView() {


        //设置播放路径，支持本地和URl
        videoView.setVideoPath(VideoUrlRes.getTextVideo1());
//        videoView.start();

        //设置管理器
        controller = new MediaController(this);
        videoView.setMediaController(controller);
    }
}
