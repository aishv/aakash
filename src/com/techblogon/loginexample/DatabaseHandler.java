package com.techblogon.loginexample;

import java.util.ArrayList;
import java.util.List;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DatabaseHandler extends SQLiteOpenHelper {
    // Database Version
    private static final int DATABASE_VERSION = 1;
 
    // Database Name
    private static final String DATABASE_NAME = "ADTL.db";
 
    // Labels table name
    private static final String TABLE_LABELS = "branch";
 
    // Labels Table Columns names
    private static final String KEY_ID = "b_id";
    private static final String KEY_NAME = "b_name";
    
    private final String TABLE_LABELS1 = "college";
	static final String c_id="college_id";
	static final String college_name ="College_name";
 
    public DatabaseHandler(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }
 
    // Creating Tables
    @Override
    public void onCreate(SQLiteDatabase db) {
    	// Category table create query
    	String CREATE_CATEGORIES_TABLE = "CREATE TABLE " + TABLE_LABELS + "("
        		+ KEY_ID + " INTEGER PRIMARY KEY," + KEY_NAME + " TEXT)";
    	db.execSQL(CREATE_CATEGORIES_TABLE);
    	
    	String CREATE_CATEGORIES_TABLE1 = "CREATE TABLE " + TABLE_LABELS1 + "("
        		+ c_id + " INTEGER PRIMARY KEY," + college_name + " TEXT)";
    	db.execSQL(CREATE_CATEGORIES_TABLE1);
    }
 
    // Upgrading databas
    
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        // Drop older table if existed
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_LABELS);
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_LABELS1);
 
        // Create tables again
        onCreate(db);
    }
    
    /**
     * Inserting new lable into lables table
     * */
    public void insertLabel(String label){
    	SQLiteDatabase db = this.getWritableDatabase();
    	
    	ContentValues values = new ContentValues();
    	values.put(KEY_NAME, label);
    	 
    	// Inserting Row
        db.insert(TABLE_LABELS, null, values);
        db.close(); // Closing database connection
    }
    
    //this is for inserting branch
    public void insertContact(String cap) {
    	SQLiteDatabase db = this.getWritableDatabase();
		ContentValues newCon = new ContentValues();
	//	newCon.put("id", name);
		newCon.put(KEY_NAME, cap);
		//newCon.put("code", code);
		//open();
		db.insert(TABLE_LABELS, null, newCon);
		db.close();
		}
    
    //this is to enter college in db 
    public void insertContact1(String cap) {
    	SQLiteDatabase db = this.getWritableDatabase();
		ContentValues newCon = new ContentValues();
	//	newCon.put("id", name);
		newCon.put(college_name, cap);
		//newCon.put("code", code);
		//open();
		db.insert(TABLE_LABELS1, null, newCon);
		db.close();
		}
    /**
     * Getting all labels
     * returns list of labels
     * */
    public List<String> getAllLabels(){
    	List<String> labels = new ArrayList<String>();
    	
        // Select All Query
        String selectQuery = "SELECT  * FROM " + TABLE_LABELS;
     
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor = db.rawQuery(selectQuery, null);
     
        // looping through all rows and adding to list
        if (cursor.moveToFirst()) {
            do {
            	labels.add(cursor.getString(1));
            } while (cursor.moveToNext());
        }
        
        // closing connection
        cursor.close();
        db.close();
    	
    	// returning lables
    	return labels;
    }

	

	
}
