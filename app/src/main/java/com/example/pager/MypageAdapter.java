package com.example.pager;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class MypageAdapter extends FragmentPagerAdapter {

    private int numoftabs;


    public MypageAdapter(@NonNull FragmentManager fm, int numoftabs) {
        super(fm);
        this.numoftabs = numoftabs;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return new MessageFrag();
            case 1:
                return new StatusFrag();
            case 2:
                return new CallFrag();
            default:
                return null;
        }
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        String title = null;
        if(position == 0){
            title= "Chats";
        }else if(position == 1){
            title = "Status";
        } else if(position==2){
            title = "Calls";
        }
        return title;
    }

    @Override
    public int getCount() {
        return numoftabs;
    }
}
