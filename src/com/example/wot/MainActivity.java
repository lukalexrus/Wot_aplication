package com.example.wot;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

public class MainActivity extends Activity {

	private EditText mEditText;
	private Button mButton;
	private ListView mListView;
	
	
	protected void onCreate (Bundle savedInstanceState){
		
	super.onCreate(savedInstanceState);
	requestWindowFeature(Window.FEATURE_NO_TITLE);
	setContentView(R.layout.activity_main);
	
	
	
	mEditText=(EditText)findViewById(R.id.nameEdit);
	mButton=(Button)findViewById(R.id.searchBtn);
	mListView=(ListView)findViewById(R.id.nameList);
	}
	public void search (View view)
	{
	}
	
}
