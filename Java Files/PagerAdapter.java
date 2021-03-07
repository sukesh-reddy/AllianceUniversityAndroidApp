package in.edu.alliance.alliance;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

/**
 * Created by Sujay Puvvadi on 21-04-2018.
 */

public class PagerAdapter extends FragmentStatePagerAdapter {

    int mNumberOfTabs;

    public PagerAdapter(FragmentManager fm, int numberOfTabs) {
        super(fm);
        this.mNumberOfTabs=numberOfTabs;
    }

    @Override
    public Fragment getItem(int position) {

        switch(position)
        {
            case 0: Home home=new Home();
                    return home;
            case 1: Events events=new Events();
                    return events;
            case 2: TimeTable timetable=new TimeTable();
                    return timetable;
            case 3: ContactUs contactus=new ContactUs();
                    return contactus;
            default: return null;
        }
    }

    @Override
    public int getCount() {
        return mNumberOfTabs;
    }
}
