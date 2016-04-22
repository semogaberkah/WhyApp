package feedit.whyapp;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

/**
 * Created by kundan on 10/16/2015.
 */
public class PagerAdapter  extends FragmentStatePagerAdapter{
    public PagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {

        Fragment frag=null;
        switch (position){
            case 0:
                frag=new CallFragment();
                break;
            case 1:
                frag=new ChatFragment();
                break;
            case 2:
                frag=new ContactFragment();
                break;
        }
        return frag;
    }

    @Override
    public int getCount() {
        return 3;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        String title=" ";
        switch (position){
            case 0:
                title="CALLS";
                break;
            case 1:
                title="CHATS";
                break;
            case 2:
                title="CONTACTS";
                break;
        }

        return title;
    }
}
