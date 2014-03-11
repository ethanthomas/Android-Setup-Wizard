package com.startup.core;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.RadioButton;

import com.startup.R;
import com.startup.student.StudentFirstRun_A;
import com.startup.supervisor.SupervisorFirstRun_A;

public class FirstRunActivity_A extends Activity {

	Button cb;
	RadioButton rb1, rb2;

	@Override
	public void onCreate(Bundle b) {
		super.onCreate(b);
		setContentView(R.layout.first_run_activity);

		SharedPreferences preferences = PreferenceManager
				.getDefaultSharedPreferences(this);
		SharedPreferences.Editor editor = preferences.edit();

		cb = (Button) findViewById(R.id.confirmButton);
		rb1 = (RadioButton) findViewById(R.id.radioButton1);
		rb2 = (RadioButton) findViewById(R.id.radioButton2);

		rb1.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {

				cb.setEnabled(true);

			}
		});
		rb2.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {

				cb.setEnabled(true);

			}
		});

		cb.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {

				if (rb1.isChecked()) {

					AlertDialog.Builder builder = new AlertDialog.Builder(
							FirstRunActivity_A.this);

					builder.setTitle("Are you sure?");

					// Set an Icon for this Alert Dialog

					// Set Alert Dialog Message
					builder.setMessage(
							"This setting will be permanent and cannot be changed")
							.setPositiveButton("Confirm",
									new DialogInterface.OnClickListener() {

										public void onClick(
												DialogInterface dialog, int arg0) {
											Intent i = new Intent(
													FirstRunActivity_A.this,
													StudentFirstRun_A.class);
											startActivity(i);

										}
									})

							// Neautral button functionality
							.setNegativeButton("Cancel",
									new DialogInterface.OnClickListener() {
										public void onClick(
												DialogInterface dialog, int arg0) {

										}
									});

					// Create the Alert Dialog
					AlertDialog alertdialog = builder.create();

					// Show Alert Dialog
					alertdialog.show();

				} else if (rb2.isChecked()) {

					AlertDialog.Builder builder = new AlertDialog.Builder(
							FirstRunActivity_A.this);

					builder.setTitle("Are you sure?");

					// Set an Icon for this Alert Dialog

					// Set Alert Dialog Message
					builder.setMessage(
							"This setting will be permanent and cannot be changed")
							.setPositiveButton("Confirm",
									new DialogInterface.OnClickListener() {

										public void onClick(
												DialogInterface dialog, int arg0) {
											Intent i2 = new Intent(
													FirstRunActivity_A.this,
													SupervisorFirstRun_A.class);
											startActivity(i2);

										}
									})

							// Neautral button functionality
							.setNegativeButton("Cancel",
									new DialogInterface.OnClickListener() {
										public void onClick(
												DialogInterface dialog, int arg0) {

										}
									});

					// Create the Alert Dialog
					AlertDialog alertdialog = builder.create();

					// Show Alert Dialog
					alertdialog.show();

				}
				;

			};

		});
	}

}
