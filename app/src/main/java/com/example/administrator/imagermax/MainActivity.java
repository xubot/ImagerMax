package com.example.administrator.imagermax;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private GridView gv;
    private ArrayList<String> images = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        //获取数据源
        getData();
    }

    private void initView() {
        //找控件
        gv = (GridView) findViewById(R.id.gv);
        gv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(MainActivity.this, ImageBrowseActivity.class);
                intent.putStringArrayListExtra("images", images);
                intent.putExtra("position", position);
                startActivity(intent);
            }
        });
    }
    private void getData() {
        images.add("http://p0.so.qhmsg.com/t01039ac94bb9225145.jpg");
        images.add("http://p2.so.qhimgs1.com/t010d730f7db43bce3e.jpg");
        images.add("http://p4.so.qhimgs1.com/t01159d64b9304b0144.jpg");
        ImageAdapter adapter = new ImageAdapter(MainActivity.this, images);
        gv.setAdapter(adapter);
    }
}
