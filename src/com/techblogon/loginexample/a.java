package com.techblogon.loginexample;

import java.io.*;
import java.nio.MappedByteBuffer;

//import com.techblogon.loginexample.R;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.*;
import android.view.View.OnClickListener;
import android.widget.*;


import com.techblogon.loginexample.*;
public class a extends Activity {

	Button e1,e2,e3;
	
public void onCreate(Bundle savedInstanceState) {
	super.onCreate(savedInstanceState);
	setContentView(R.layout.aboutedupune);
	e1= (Button) findViewById(R.id.b1); //register clg
	e2= (Button) findViewById(R.id.b2); // cet score
	e3= (Button) findViewById(R.id.b3);

	e1.setOnClickListener(new OnClickListener() {
		public void onClick(View v) {
			Intent myIntent = new Intent(v.getContext(), DatabaseDemo.class);
			startActivity(myIntent);
		}
		}); 
	e2.setOnClickListener(new OnClickListener() {
		public void onClick(View v) {
			Intent myIntent = new Intent(a.this, AndroidSpinnerFromSQLiteActivity.class);
			startActivity(myIntent);
		}
		}); 
	
	
	//Intent intentSignIn=new Intent(HomeActivity.this,a.class);
	//+startActivity(intentSignIn);
	
	
	e3.setOnClickListener(new OnClickListener() {
		public void onClick(View v) {
			Intent myIntent = new Intent(a.this, ListMobileActivity.class);
	        startActivity(myIntent);
		}
		}); 
		
}

}



