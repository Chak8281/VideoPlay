package com.example.administrator.videoplay.MyVideoView;

import android.content.Context;
import android.media.MediaPlayer;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.widget.RelativeLayout;

import com.example.administrator.videoplay.R;
import com.example.administrator.videoplay.VideoUrlRes;

import java.io.IOException;

public class CustomVideoPlay extends RelativeLayout implements SurfaceHolder.Callback {

    private MediaPlayer mediaPlayer;
    private SurfaceView surfaceView;
    private SurfaceHolder surfaceHolder;

    public CustomVideoPlay(Context context) {
        this(context, null);
    }

    public CustomVideoPlay(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public CustomVideoPlay(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        // 当前视图（其实目前也就是只有一个SurfaceView，后期当然会加上更多的视频相关控制的控件上去）
        LayoutInflater.from(context).inflate(R.layout.activity_custom_video_play, this, true);
        surfaceView = (SurfaceView) findViewById(R.id.surfaceView);
        surfaceHolder = surfaceView.getHolder();
        surfaceHolder.addCallback(this);
        try {
            mediaPlayer = new MediaPlayer();
            mediaPlayer.setDisplay(surfaceHolder);
            mediaPlayer.setDataSource(VideoUrlRes.getTextVideo1());
            mediaPlayer.prepareAsync(); // 异步
            mediaPlayer.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
                @Override public void onPrepared(MediaPlayer mp) {
                    mediaPlayer.start();
                }
            });
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override public void surfaceCreated(SurfaceHolder holder) {

    }

    @Override public void surfaceChanged(SurfaceHolder holder, int format, int width, int height) {

    }

    @Override public void surfaceDestroyed(SurfaceHolder holder) {

    }
}