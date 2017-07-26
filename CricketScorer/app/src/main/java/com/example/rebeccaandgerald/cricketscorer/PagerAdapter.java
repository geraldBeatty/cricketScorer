package com.example.rebeccaandgerald.cricketscorer;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.view.View;

public class PagerAdapter extends FragmentPagerAdapter
{

    private Context mContext;

    public PagerAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    @Override
    public Fragment getItem(int position)
    {

        if(position == 0)
        {
            return new FirstTeamFragment();
        }
        else
        {return new SecondTeamFragment();}
    }

    @Override
    public CharSequence getPageTitle(int position)
    {
        if(position == 0)
        {
            return "Team One";
        }
        else
        {
            return "Team Two";
        }

    }

    @Override
    public int getCount() {
        return 2;
    }
}
