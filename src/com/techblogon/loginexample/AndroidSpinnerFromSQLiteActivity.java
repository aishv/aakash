package com.techblogon.loginexample;

import java.util.List;

//import com.techblogon.loginexample.a;
//import com.techblogon.loginexample.b;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class AndroidSpinnerFromSQLiteActivity extends Activity implements
		OnItemSelectedListener {

	// Spinner element
	Spinner spinner,spinner1;

	// Add button
	Button btnAdd;

	// Input text
	EditText inputLabel;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.b1);

		// Spinner element
		spinner = (Spinner) findViewById(R.id.spinner);
		spinner1 = (Spinner) findViewById(R.id.spinner1);

		// add button
		//btnAdd = (Button) findViewById(R.id.btn_add);
		View btnAdd1 = (Button) findViewById(R.id.button1);

		// new label input field
		inputLabel = (EditText) findViewById(R.id.input_label);

		// Spinner click listener
		spinner.setOnItemSelectedListener(this);
		spinner1.setOnItemSelectedListener(this);

		
		// Loading spinner data from database
	/*	DatabaseHandler db = new DatabaseHandler(
				getApplicationContext());
		db.insertContact("Mechanical");
		db.insertContact("Civil");
		db.insertContact("Information Technology");
		db.insertContact("Computer Engineering");
		db.insertContact("Electrical Engineering");
		db.insertContact("Electronic and telecomunication");
		db.insertContact("Production Engineering");
		db.insertContact("Instrumentation Engineering");
		loadSpinnerData();

		db.insertContact1("College of Engineering Pune");
		db.insertContact1("Maharashtra Institute of Technology");
		db.insertContact1("VIT, Bibvewadi");
		db.insertContact1("Sinhgad Institute of Technology, Vadgaon");
		db.insertContact1("Cummins Karvenagar");
		db.insertContact1("AISSMS");
		db.insertContact1("DY Patil COE, Akurdi");
		db.insertContact1("PICT");
		db.insertContact1("Indira COE");
		db.insertContact1("PVG COE");*/
	//	loadSpinner1Data();
		
	//	loadSpinner1Data();
		/**
		 * Add new label button click listener
		 * */
		btnAdd1.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View arg0) {
				//DatabaseHandler db = new DatabaseHandler(
					//	getApplicationContext());
				//db.insertContact("MIT");
				String label = inputLabel.getText().toString();
				String label1 = String.valueOf(spinner.getSelectedItem());
				String label2 = String.valueOf(spinner1.getSelectedItem());
				Log.d(label,label1);
				
				
				int score = Integer.parseInt(label);
				
				
				if ((score < 200) && (score >179))
				{
					Intent myIntent = new Intent(AndroidSpinnerFromSQLiteActivity.this, nine.class);
					startActivity(myIntent);
					
				}
				else if ((score < 179) && (score >159))
				{
					Intent myIntent = new Intent(AndroidSpinnerFromSQLiteActivity.this, seven.class);
					startActivity(myIntent);
					
				}
				
				else if ((score < 159) && (score >139))
				{
					Intent myIntent = new Intent(AndroidSpinnerFromSQLiteActivity.this, five.class);
					startActivity(myIntent);
					
				}
				
				else if ((score < 139) && (score >119))
				{
					Intent myIntent = new Intent(AndroidSpinnerFromSQLiteActivity.this, three.class);
					startActivity(myIntent);
					
				}
				
				else if ((score < 119) && (score >80))
				{
					Intent myIntent = new Intent(AndroidSpinnerFromSQLiteActivity.this, one.class);
					startActivity(myIntent);
					
				}
			

			}
		});
		loadSpinnerData();
		loadSpinner1Data();
	}
	

	/**
	 * Function to load the spinner data from SQLite database
	 * */
	private void loadSpinnerData() {
		
		ArrayAdapter <CharSequence> adapter =
				  new ArrayAdapter <CharSequence> (this, android.R.layout.simple_spinner_item );
				adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
				 
		
				adapter.add("Mechanical");
				adapter.add("Civil");
				adapter.add("Electronic and telecomunication");
				adapter.add("Information Technology");
				adapter.add("Computer Engineering");
				adapter.add("Electrical Engineering");
				adapter.add("Production Engineering");
				adapter.add("Instrumentation Engineering");

				Spinner s = (Spinner) findViewById(R.id.spinner);
				s.setAdapter(adapter);
				 
	}
	
	
	private void loadSpinner1Data() {
		
		ArrayAdapter <CharSequence> adapter =
				  new ArrayAdapter <CharSequence> (this, android.R.layout.simple_spinner_item );
				adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
				 
		
				adapter.add("M");
				adapter.add("F");
				
				Spinner s = (Spinner) findViewById(R.id.spinner1);
				s.setAdapter(adapter);
				 
		// attaching data adapter to spinner
		
	}

	@Override
	public void onItemSelected(AdapterView<?> parent, View view, int position,
			long id) {
		// On selecting a spinner item
		String label = parent.getItemAtPosition(position).toString();

		// Showing selected spinner item
		Toast.makeText(parent.getContext(), "You selected: " + label,
				Toast.LENGTH_LONG).show();

	}

	@Override
	public void onNothingSelected(AdapterView<?> arg0) {
		// TODO Auto-generated method stub

	}
}