package com.startup.student;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.Toast;

import com.startup.R;
import com.viewpagerindicator.LinePageIndicator;
import com.viewpagerindicator.PageIndicator;

public class StudentFirstRun_A extends FragmentActivity {
	StudentFragmentPagerAdapter mAdapter;
	ViewPager mPager;
	Button next, prev;
	RadioButton rb1;
	PageIndicator mIndicator;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.student_pager);
		b();

		prev = (Button) findViewById(R.id.prev_button);
		next = (Button) findViewById(R.id.next_button);

		mAdapter = new StudentFragmentPagerAdapter(getSupportFragmentManager());

		mPager = (ViewPager) findViewById(R.id.pager);
		mPager.setAdapter(mAdapter);

		mIndicator = (LinePageIndicator) findViewById(R.id.indicator);
		mIndicator.setViewPager(mPager);

		next.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {

				mPager.setCurrentItem(getItem(+1), true);

			}
		});
		prev.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				mPager.setCurrentItem(getItem(-1), true);

			}
		});

	}

	private int getItem(int i) {
		int a = mPager.getCurrentItem();
		i += a;
		return i;
	}

	boolean b() {

		SharedPreferences prefs = PreferenceManager
				.getDefaultSharedPreferences(getApplicationContext());

		if (prefs.getInt("stf1click", 0) == 1) {

			Toast.makeText(getApplicationContext(), "resId", Toast.LENGTH_SHORT)
					.show();
			next.setEnabled(true);

		}

		return true;

	}

}
