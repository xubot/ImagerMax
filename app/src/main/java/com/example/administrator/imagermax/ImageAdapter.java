package com.example.administrator.imagermax;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

import org.json.JSONArray;
import org.json.JSONException;

import java.util.ArrayList;

/**
 * Created by Administrator on 2017/3/22.
 */

public class ImageAdapter extends BaseAdapter {
    private final Context context;
    private final ArrayList<String> images;

    public ImageAdapter(Context context,  ArrayList<String> images) {
        this.context = context;
        this.images = images;
    }

    @Override
    public int getCount() {
        return images.size();
    }

    @Override
    public Object getItem(int position) {
        return position;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        convertView = View.inflate(context, R.layout.gridview, null);
        ImageView iv = (ImageView) convertView.findViewById(R.id.iv);
        Picasso.with(context).load(images.get(position)).placeholder(R.mipmap.ic_launcher).into(iv);
       /* try {
            String image_url = data.getJSONObject(position).getString("image_url");
            Picasso.with(context).load(image_url).placeholder(R.mipmap.ic_launcher).into(iv);

        } catch (JSONException e) {
            e.printStackTrace();
        }*/
        return convertView;
    }
}
