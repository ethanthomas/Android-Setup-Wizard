package com.startup.student;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import com.startup.R;

public class StudentFragment1 extends Fragment {
	Button next;
	RadioButton rb1, rb2;
	RadioGroup rg;
	

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			final Bundle b) {
		View v = inflater.inflate(R.layout.student_fragment_1, container, false);

		
		rb1 = (RadioButton) v.findViewById(R.id.studentplaceradioButton1);
		rb2 = (RadioButton) v.findViewById(R.id.studentplaceradioButton2);
		next = (Button) v.findViewById(R.id.next_button);
		rg = (RadioGroup) v.findViewById(R.id.typegroup);
		
		
		rb1.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				
				
				
				SharedPreferences preferences = PreferenceManager
						.getDefaultSharedPreferences(getActivity());
				SharedPreferences.Editor editor = preferences.edit();
				int i = preferences.getInt("stf1click", 0);

				i++;
				editor.putInt("stf1click", i);
				editor.commit();
				
				

				
			}
		});

		
		return v;
	}

}
