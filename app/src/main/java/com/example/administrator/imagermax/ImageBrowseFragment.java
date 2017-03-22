package com.example.administrator.imagermax;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.bumptech.glide.Glide;

import uk.co.senab.photoview.PhotoView;
import uk.co.senab.photoview.PhotoViewAttacher;

/**
 * 1. 类的用途
 * 2. @author forever
 * 3. @date 2017/3/18 10:54
 */

public class ImageBrowseFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_image_browse, null);
        PhotoView pv = (PhotoView) view.findViewById(R.id.pv);
        Bundle bundle = getArguments();
        String imageUrl = bundle.getString("imageUrl");

        Glide.with(this).load(imageUrl).into(pv);
        
        pv.setOnPhotoTapListener(new PhotoViewAttacher.OnPhotoTapListener() {
            @Override
            public void onPhotoTap(View view, float v, float v1) {
                getActivity().finish();
            }
        });
        return view;
    }
}
