package com.techblogon.loginexample;

//import com.mkyong.android.adaptor.MobileArrayAdapter;

import android.app.ListActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;
import android.view.View;

public class ListMobileActivity extends ListActivity {

	static final String[] MOBILE_OS = new String[] { "College of Engineering Pune (COEP) \n BTech (Civil Engineering) \n BTech (Computer Engineering) \n BTech (Electrical Engineering) \n BTech (Electronics & Telecommunication )\n BTech (Information Technology) \n BTech (Mechanical Engineering) \n BTech (Metallurgy & Material Science)", 
"Maharashtra Institute of Technology (MIT) 	Pune, India \n B.E ( Information Technology) \n B.E ( Polymer Engineering ) \n B.E (Civil Engineering) \n B.E (Computer Engineering ) \n B.E (Electronics & Telecommunication Engineering) \n B.E(Mechanical Engineering)","	Vishwakarma Institute of Technology Pune, India \n B.E (Chemical Engineering) \n B.E (Computer Engineering) \n B.E (Electronics & Telecommunication Engineering) \n B.E (Electronics Engineering) \n B.E (Information Technology) \n B.E (Instrumentation Engineering) \n B.E (Mechanical Engineering)", "	All India Shri Shivaji Memorial Societys Institute of Information Technology Pune, India \n Computer Engineering \n Electrical Engineering \n Electronics & Telecommunication Engineering \n Electronics Engineering \n Information Technology \n Instrumentation engineering", "Cummins college of engineering for women 	Pune, India \n B. Tech Mechanical Engineering \n B.Tech Computer Science and Engineering \n B.Tech ELectronics and Telecommunication \n B.Tech Information Technology \n B.Tech Instrumentation Engineering", "  Dr DY Patil College of Engineering 	Pune, India \n Computer Engineering \n Computer Engineering \n Electronics & Telecommunication Engineering \n Information Technology \n Mechanical Engineering", "  	Pune Institute of Computer Technology (PICT) Pune, India \n B.E (Computer Engineering) \n B.E (Electronics & Telecommunication Engineering ) \n B.E (Information Technology)"};

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		//setListAdapter(new ArrayAdapter<String>(this, R.layout.list_mobile,
		//		R.id.label, MOBILE_OS));
		
		setListAdapter(new MobileArrayAdapter(this, MOBILE_OS));
		

	}

	@Override
	protected void onListItemClick(ListView l, View v, int position, long id) {

		//get selected items
		String selectedValue = (String) getListAdapter().getItem(position);
		Toast.makeText(this, selectedValue, Toast.LENGTH_SHORT).show();

	}

}