package com.techblogon.loginexample;

//import com.mkyong.android.R;
// btwn 150 and 170
//import com.example.androidhive.R;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class sevenadapt extends ArrayAdapter<String> {
	private final Context context;
	private final String[] values;

	public sevenadapt(Context context, String[] values) {
		super(context, R.layout.nine, values);
		this.context = context;
		this.values = values;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		LayoutInflater inflater = (LayoutInflater) context
				.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
		View rowView = inflater.inflate(R.layout.nine, parent, false);
		TextView textView = (TextView) rowView.findViewById(R.id.label);
		ImageView imageView = (ImageView) rowView.findViewById(R.id.logo);
		textView.setText(values[position]);

		// Change icon based on name
		String s = values[position];

		System.out.println(s);
		
	//	if (s.equals("College of Engineering Pune (COEP) \n BTech (Mechanical Engineering) \n BTech (Electronics & Telecommunication )" )){
	//	imageView.setImageResource(R.drawable.page_19);

		if (s.equals("College of Engineering Pune (COEP) \n BTech (IT) \n BTech (COMPUTER ) \n BTech (ELECTRICAL ) \n BTech (Instru) \n BTECH (PRODUCTION)")){
			imageView.setImageResource(R.drawable.page_19);
		} else if (s.equals("MIT \n BTECH MECHANICAL \n BTECH ELECTRICAL \n BTECH ENTC")) {
			imageView.setImageResource(R.drawable.mit);
		} else if (s.equals("VIT \n BTECH ENTC \n BTECH COMP \n BTECH MECH")) {
			imageView.setImageResource(R.drawable.vit);
		} 
		else if (s.equals(" PICT \n BTECH COMPUTER ")) {
			imageView.setImageResource(R.drawable.pict);
		}
		/*else if (s.equals("  Dr DY Patil College of Engineering 	Pune, India \n Computer Engineering \n Computer Engineering \n Electronics & Telecommunication Engineering \n Information Technology \n Mechanical Engineering")) {
			imageView.setImageResource(R.drawable.dypatil);
		}
		
		else if (s.equals("	Vishwakarma Institute of Technology Pune, India \n B.E (Chemical Engineering) \n B.E (Computer Engineering) \n B.E (Electronics & Telecommunication Engineering) \n B.E (Electronics Engineering) \n B.E (Information Technology) \n B.E (Instrumentation Engineering) \n B.E (Mechanical Engineering)")) {
			imageView.setImageResource(R.drawable.vit);
		}
		else if (s.equals("Cummins college of engineering for women 	Pune, India \n B. Tech Mechanical Engineering \n B.Tech Computer Science and Engineering \n B.Tech ELectronics and Telecommunication \n B.Tech Information Technology \n B.Tech Instrumentation Engineering")) {
			imageView.setImageResource(R.drawable.cumins);
		}
		*/
		else {
			imageView.setImageResource(R.drawable.aissms);
		}

		return rowView;
	}
}
