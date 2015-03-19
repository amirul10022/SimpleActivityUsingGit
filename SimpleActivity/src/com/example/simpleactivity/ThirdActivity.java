package com.example.simpleactivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
/*import android.view.Menu;
import android.view.MenuItem;*/
import android.view.View;

public class ThirdActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_third);
	}
	
	 public void onClick(View view){
	    	
	    	Intent intent2= new Intent(this, FourthActivity.class);
	    	intent2.putExtra("URL", "http://www.vogella.com");
	    	startActivity(intent2);
	    	
	    }
}
