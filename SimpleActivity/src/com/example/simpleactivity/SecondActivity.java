/**
 * 
 */
package com.example.simpleactivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

/**
 * @author AmirulHaque
 *
 */
public class SecondActivity extends Activity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.layout_second_activity);
	}
	
	 public void onClick(View view){
	    	
	    	Intent intent1= new Intent(this, ThirdActivity.class);
	    	//intent.putExtra("URL", "http://www.vogella.com");
	    	startActivity(intent1);
	    	
	    }

}
