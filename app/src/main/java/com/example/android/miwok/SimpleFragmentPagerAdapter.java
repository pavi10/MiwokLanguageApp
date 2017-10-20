package com.example.android.miwok;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

/**
 * Created by Hp on 21-10-2017.
 */

public class SimpleFragmentPagerAdapter extends FragmentStatePagerAdapter {

    String tabTitles[]={"Numbers","Colors","Family","Phrases"};

    public SimpleFragmentPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new NumbersFragments();
        } else if (position == 1){
            return new ColorsFragments();
        } else if (position == 2) {
            return new FamilyFragments();
        }
        else
            return  new PhrasesFragments();
    }

    @Override
    public int getCount() {
        return 4;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return tabTitles[position];
    }
}
