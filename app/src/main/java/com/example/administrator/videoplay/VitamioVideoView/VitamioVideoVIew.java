
package com.example.administrator.videoplay.VitamioVideoView;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.example.administrator.videoplay.R;
import com.example.administrator.videoplay.VideoUrlRes;

import io.vov.vitamio.Vitamio;
import io.vov.vitamio.widget.VideoView;

public class VitamioVideoVIew extends AppCompatActivity {

    private VideoView videoView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vitamio_video_view);
        PlayVideoView();
    }

    private void PlayVideoView() {
        videoView = (VideoView) findViewById(R.id.vitamio_videoView);
        videoView = new VideoView(this);
        Vitamio.isInitialized(this);
        //设置播放路径，支持本地和URl
        videoView.setVideoPath(VideoUrlRes.getTextVideo2());
        videoView.start();
    }
}
