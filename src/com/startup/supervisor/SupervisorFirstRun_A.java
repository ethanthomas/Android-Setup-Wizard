package com.startup.supervisor;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;


import com.startup.R;
import com.viewpagerindicator.LinePageIndicator;
import com.viewpagerindicator.PageIndicator;

public class SupervisorFirstRun_A extends FragmentActivity {
	SupervisorFragmentPagerAdapter mAdapter;
	ViewPager mPager;
	PageIndicator mIndicator;

	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.supervisor_pager);

		mAdapter = new SupervisorFragmentPagerAdapter(
				getSupportFragmentManager());

		mPager = (ViewPager) findViewById(R.id.pager);
		mPager.setAdapter(mAdapter);

		mIndicator = (LinePageIndicator) findViewById(R.id.indicator);
		mIndicator.setViewPager(mPager);

	}
}
