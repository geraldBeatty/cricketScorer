package com.example.rebeccaandgerald.cricketscorer;

import android.support.v4.view.ViewPager;

public class DetailOnPageChangeListener extends ViewPager.SimpleOnPageChangeListener
{
    private int currentPage;

    @Override
    public void onPageSelected(int position) {
        currentPage = position;
    }

    public final int getCurrentPage() {
        return currentPage;
    }
}
