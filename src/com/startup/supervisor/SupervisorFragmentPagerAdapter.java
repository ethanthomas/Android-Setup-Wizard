package com.startup.supervisor;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.viewpagerindicator.IconPagerAdapter;

public class SupervisorFragmentPagerAdapter extends FragmentPagerAdapter implements IconPagerAdapter{
	
	
	private int mCount = 4;

	public SupervisorFragmentPagerAdapter(FragmentManager fm) {
		super(fm);
	}

	@Override
	public int getIconResId(int index) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Fragment getItem(int position) {
		Fragment fragment = new SupervisorFragment1();
		switch(position){
		case 0:
			fragment = new SupervisorFragment1();
			break;
		case 1:
			fragment = new SupervisorFragment2();
			break;
		case 2:
			fragment = new SupervisorFragment3();
			break;
		case 3:
			fragment = new SupervisorFragment4();
			break;
		}
		return fragment;
	}

	@Override
	public int getCount() {
		return mCount;
	}
	
	@Override
	public CharSequence getPageTitle(int position){
		String title = "";
		switch(position){
		case 0:
			title = "Fragment 1";
			break;
		case 1:
			title = "Fragment 2";
			break;
		case 2:
			title = "Fragment 3";
			break;
		case 3:
			title = "Fragment 4";
			break;
		}
		
		return title;
	}
	
	public void setCount(int count){
		if (count > 0 && count < 10){
			mCount = count;
			notifyDataSetChanged();
		}
	}
	

}
