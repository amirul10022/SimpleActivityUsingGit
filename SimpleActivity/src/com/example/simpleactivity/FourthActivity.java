package com.example.simpleactivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

import android.view.View;

public class FourthActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_fourth);
		
	}
	
	public void onClick(View view){
    	
    	Intent intent3= new Intent(this, FifthActivity.class);
    	intent3.putExtra("URL", "http://www.vogella.com");
    	startActivity(intent3);
	}
}
