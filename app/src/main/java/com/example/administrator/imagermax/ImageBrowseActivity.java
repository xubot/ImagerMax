package com.example.administrator.imagermax;

import android.content.Intent;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;

public class ImageBrowseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image_browse);
        ViewPager vp = (ViewPager) findViewById(R.id.vp);
        //获取数据
        Intent intent = getIntent();
        int position = intent.getIntExtra("position", 0);
        ArrayList<String> images = intent.getStringArrayListExtra("images");
        ImageBrowseAdapter adapter = new ImageBrowseAdapter(getSupportFragmentManager(), images);
        vp.setAdapter(adapter);
    }
}
