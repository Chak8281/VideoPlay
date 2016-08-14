package com.example.administrator.videoplay.AndroidVideoView;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.VideoView;

import com.example.administrator.videoplay.R;
import com.example.administrator.videoplay.VideoUrlRes;

public class AndroidVideoView extends AppCompatActivity {

    private VideoView videoView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_android_video_view);
        videoView = (VideoView) findViewById(R.id.VideoView_Android);
        PlayVideoView();
    }

    private void PlayVideoView() {
        /*j
        videoView 一个已经封装了MediaPlay+ SurFaceView的视频播放控件；
            扩展性稍差
         */

        //设置播放路径，支持本地和URl
        videoView.setVideoPath(VideoUrlRes.getTextVideo2());
        videoView.start();
    }
}
