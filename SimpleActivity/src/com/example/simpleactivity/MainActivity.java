package com.example.simpleactivity;

import android.app.Activity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
/*import android.view.Menu;
import android.view.MenuItem;*/

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        
         
    }
    public void onClick(View view){
    	
    	Intent intent= new Intent(this, SecondActivity.class);
    	intent.putExtra("URL", "http://www.vogella.com");
    	startActivity(intent);
    	
    }
}
