package com.example.administrator.imagermax;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;

/**
 * Created by Administrator on 2017/3/22.
 */

class ImageBrowseAdapter extends FragmentPagerAdapter{
    private final FragmentManager supportFragmentManager;
    private final ArrayList<String> images;

    public ImageBrowseAdapter(FragmentManager supportFragmentManager, ArrayList<String> images) {
        super(supportFragmentManager);
        this.supportFragmentManager = supportFragmentManager;
        this.images = images;
    }

    @Override
    public Fragment getItem(int position) {
        ImageBrowseFragment imageBrowseFragment = new ImageBrowseFragment();
        Bundle bundle = new Bundle();
        bundle.putString("imageUrl", images.get(position));
        imageBrowseFragment.setArguments(bundle);
        return imageBrowseFragment;
    }

    @Override
    public int getCount() {
        return images.size();
    }
}
