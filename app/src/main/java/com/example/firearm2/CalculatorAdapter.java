package com.example.firearm2;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class CalculatorAdapter extends FragmentPagerAdapter {
    //Context of the app
    private Context mContext;

    public CalculatorAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new ThirtyCalFragment();
        } else if (position == 1) {
            return new FiftyCalFragment();
        } else {
            return new ShotgunCalFragment();
        }
    }

    @Override
    public int getCount() {
        return 3;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return mContext.getString(R.string.thirty_rounds);
        } else if (position == 1) {
            return mContext.getString(R.string.fifty_rounds);
        } else {
            return mContext.getString(R.string.shotgun);
        }
    }
}
