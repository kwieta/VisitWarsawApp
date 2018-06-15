package com.example.android.visitwarsawapp;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class CategoryAdapter extends FragmentPagerAdapter {

    private Context mContext;

    public CategoryAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new MuseumsFragment();
        } else if (position == 1) {
            return new ArchitectureFragment();
        } else if (position == 2) {
            return new ParksFragment();
        } else if (position == 3) {
            return new TheatersFragment();
        } else if (position == 4) {
            return new FoodFragment();
        }
        return null;
    }

    @Override
    public int getCount() {
        return 5;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return mContext.getString(R.string.category_museums);
        } else if (position == 1) {
            return mContext.getString(R.string.category_architecture);
        } else if (position == 2) {
            return mContext.getString(R.string.category_parks);
        } else if (position == 3) {
            return mContext.getString(R.string.category_theaters);
        } else {
            return mContext.getString(R.string.category_fooddrink);
        }
    }
}