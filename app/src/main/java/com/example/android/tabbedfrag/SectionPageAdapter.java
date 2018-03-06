package com.example.android.tabbedfrag;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Android on 3/6/2018.
 */

public class SectionPageAdapter extends FragmentPagerAdapter {
    private final List<Fragment> fragmentList=new ArrayList <>();
    private final List<String> stringList=new ArrayList <>();

    public SectionPageAdapter(FragmentManager fm) {
        super(fm);
    }
    public void addFragment(Fragment fragment,String title){
        fragmentList.add(fragment);
        stringList.add(title);
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return stringList.get(position);
    }

    @Override
    public Fragment getItem(int position)
    {

        return fragmentList.get(position);
    }

    @Override
    public int getCount() {
        return fragmentList.size();
    }
}
