package com.arrak.exam.controller;

import com.arrak.exam.R;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class Question_Create_Controller extends Activity {
	
	Button btnSave;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.question_create);
		
		btnSave = (Button)findViewById(R.id.btnSave);
		
		btnSave.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View v) {
				View parent = (View)v.getParent();
				
				EditText etQuestion = (EditText)parent.findViewById(R.id.etQuestion);
				
				Log.d("debug", etQuestion.getText().toString());				
			}			
		});
	}
}
