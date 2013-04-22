package com.techblogon.loginexample;

//import com.mkyong.android.R;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class MobileArrayAdapter extends ArrayAdapter<String> {
	private final Context context;
	private final String[] values;

	public MobileArrayAdapter(Context context, String[] values) {
		super(context, R.layout.list_mobile, values);
		this.context = context;
		this.values = values;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		LayoutInflater inflater = (LayoutInflater) context
				.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
		View rowView = inflater.inflate(R.layout.list_mobile, parent, false);
		TextView textView = (TextView) rowView.findViewById(R.id.label);
		ImageView imageView = (ImageView) rowView.findViewById(R.id.logo);
		textView.setText(values[position]);

		// Change icon based on name
		String s = values[position];

		System.out.println(s);

		if (s.equals("College of Engineering Pune (COEP) \n BTech (Civil Engineering) \n BTech (Computer Engineering) \n BTech (Electrical Engineering) \n BTech (Electronics & Telecommunication )\n BTech (Information Technology) \n BTech (Mechanical Engineering) \n BTech (Metallurgy & Material Science)")) {
			imageView.setImageResource(R.drawable.page_19);
		} else if (s.equals("Maharashtra Institute of Technology (MIT) 	Pune, India \n B.E ( Information Technology) \n B.E ( Polymer Engineering ) \n B.E (Civil Engineering) \n B.E (Computer Engineering ) \n B.E (Electronics & Telecommunication Engineering) \n B.E(Mechanical Engineering)")) {
			imageView.setImageResource(R.drawable.mit);
		} else if (s.equals("All India Shri Shivaji Memorial Societys Institute of Information Technology Pune, India \n Computer Engineering \n Electrical Engineering \n Electronics & Telecommunication Engineering \n Electronics Engineering \n Information Technology \n Instrumentation engineering")) {
			imageView.setImageResource(R.drawable.aissms);
		} 
		else if (s.equals("  	Pune Institute of Computer Technology (PICT) Pune, India \n B.E (Computer Engineering) \n B.E (Electronics & Telecommunication Engineering ) \n B.E (Information Technology)")) {
			imageView.setImageResource(R.drawable.pict);
		}
		else if (s.equals("  Dr DY Patil College of Engineering 	Pune, India \n Computer Engineering \n Computer Engineering \n Electronics & Telecommunication Engineering \n Information Technology \n Mechanical Engineering")) {
			imageView.setImageResource(R.drawable.dypatil);
		}
		
		else if (s.equals("	Vishwakarma Institute of Technology Pune, India \n B.E (Chemical Engineering) \n B.E (Computer Engineering) \n B.E (Electronics & Telecommunication Engineering) \n B.E (Electronics Engineering) \n B.E (Information Technology) \n B.E (Instrumentation Engineering) \n B.E (Mechanical Engineering)")) {
			imageView.setImageResource(R.drawable.vit);
		}
		else if (s.equals("Cummins college of engineering for women 	Pune, India \n B. Tech Mechanical Engineering \n B.Tech Computer Science and Engineering \n B.Tech ELectronics and Telecommunication \n B.Tech Information Technology \n B.Tech Instrumentation Engineering")) {
			imageView.setImageResource(R.drawable.cumins);
		}
		
		else {
			imageView.setImageResource(R.drawable.aissms);
		}

		return rowView;
	}
}
