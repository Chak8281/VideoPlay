package com.example.administrator.videoplay;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.administrator.videoplay.AndroidVideoView.AndroidVideoView;
import com.example.administrator.videoplay.MyVideoView.CustomVideoViewActivity;
import com.example.administrator.videoplay.VideoBuffer.VideoBufferActivity;
import com.example.administrator.videoplay.VitamioMediaContrller.MediaControllerActivity;
import com.example.administrator.videoplay.VitamioVideoView.VitamioVideoVIew;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {

    private ListView listView;
    private ArrayAdapter<String> adapter;
    private String[] datas = null;

    @Override//在内容更改后触发的方法
    public void onContentChanged() {
        super.onContentChanged();
        datas = new String[]{
                "Android Video",
                "Vitamio Video",
                "Vitamio MediaController",
                "Video Buffer",
                "Custom VideoView"
        };

        listView = (ListView) findViewById(R.id.list_main);
        adapter = new ArrayAdapter<String>(this,R.layout.support_simple_spinner_dropdown_item,datas);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(this);

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //设定的内容，触发时则会调用onContentChanged方法
        setContentView(R.layout.activity_main);

        initData();
    }

    private void initData() {

    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
        Intent intent = new Intent();
        switch (position){

            case 0:
                intent.setClass(this, AndroidVideoView.class);
                break;
            case 1:
                intent.setClass(this, VitamioVideoVIew.class);
                break;

            case 2:
                intent.setClass(this, MediaControllerActivity.class);
                break;

            case 3:
                intent.setClass(this, VideoBufferActivity.class);
                break;

            case 4:
                intent.setClass(this, CustomVideoViewActivity.class);
                        break;
        }
        startActivity(intent);
    }
}
