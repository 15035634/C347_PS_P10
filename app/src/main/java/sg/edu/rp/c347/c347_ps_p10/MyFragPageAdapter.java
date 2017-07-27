package sg.edu.rp.c347.c347_ps_p10;

/**
 * Created by 15035634 on 27/7/2017.
 */

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import java.util.ArrayList;

public class MyFragPageAdapter extends FragmentPagerAdapter {

    ArrayList<Fragment> fragments;

    public MyFragPageAdapter(FragmentManager fm, ArrayList<Fragment> al) {
        super(fm);
        fragments = al;
    }

    @Override
    public Fragment getItem(int position) {
        return fragments.get(position);
    }

    @Override
    public int getCount() {
        return fragments.size();
    }
}
