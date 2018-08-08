package com.example.yashika.bhiwanitravels;

import android.content.Context;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class CategoryAdapter extends FragmentPagerAdapter {

    /**
     * Context of the app
     */
    private Context mContext;

    /**
     * Create a new {@link CategoryAdapter} object.
     *
     * @param context is the context of the app
     * @param fm      is the fragment manager that will keep each fragment's state in the adapter
     *                across swipes.
     */
    public CategoryAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        switch (position){
            case 0:
                return mContext.getString(R.string.tab1);
            case 1:
                return mContext.getString(R.string.tab2);
            case 2:
                return mContext.getString(R.string.tab3);
            default:
                return mContext.getString(R.string.tab4);
        }
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new AttractionsFragment();
            case 1:
                return new ShopFragment();
            case 2:
                return new InstituteFragment();
            default:
                return new OverviewFragment();
        }
    }

    @Override
    public int getCount() {
        return 4;
    }
}
