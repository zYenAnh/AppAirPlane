package com.example.airapp;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

public class ViewPagerFragmentAdapter_Home extends FragmentStatePagerAdapter {

    public ViewPagerFragmentAdapter_Home(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int i) {
        switch(i) {
            case 0:
                return new booktickets_fragment();
            case 1:
                return new managertickets_fragment();
        }
        return new booktickets_fragment();
    }

    @Override
    public int getCount() {
        return 2;
    }
}
