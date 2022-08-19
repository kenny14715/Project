package com.example.project;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import androidx.viewpager2.widget.ViewPager2;

public class placeFragment extends Fragment {
    private static final int NUM_page = 3;
    private ViewPager2 viewPager2;
    private FragmentStateAdapter pagerAdapter;

    public placeFragment(){

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        View view = inflater.inflate(R.layout.spot_fragment,container,false);
        //setContentView(R.layout.spot_fragment);
        viewPager2 = view.findViewById(R.id.pager);
        pagerAdapter = new ScreenSlidePageAdapter1(this);
        viewPager2.setAdapter(pagerAdapter);
        return view;
    }

    private class ScreenSlidePageAdapter1 extends FragmentStateAdapter {
        public ScreenSlidePageAdapter1(placeFragment menuFragment) {
            super(menuFragment);
        }

        @NonNull
        @Override
        public Fragment createFragment(int position) {
            switch (position){
                case 0:
                    return new xitunFragment();
                case 1:
                    return new beitunFragment();
                case 2:
                    return new nantunFragment();
                default:
                    return null;
            }
        }

        @Override
        public int getItemCount() {
            return NUM_page;
        }
    }
}
