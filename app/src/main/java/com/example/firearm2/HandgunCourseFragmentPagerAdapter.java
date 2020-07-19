package com.example.firearm2;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class HandgunCourseFragmentPagerAdapter extends FragmentPagerAdapter {
    //Context of the app
    Context mContext;

    public HandgunCourseFragmentPagerAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
       if (position == 0) {
           return new FiftyDayFragment();
       } else if (position == 1){
           return new FiftyNightFragment();
       } else if (position == 2){
           return new ThirtyDayFragment();
       } else {
           return new ThirtyNightFragment();
        }
    }

    @Override
    public int getCount() {
        return 4;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return mContext.getString(R.string.fifty_day);
        } else if (position == 1){
            return mContext.getString(R.string.fifty_night);
        } else if (position == 2){
            return mContext.getString(R.string.thirty_day);
        } else {
            return mContext.getString(R.string.thirty_night);
        }
    }
}
