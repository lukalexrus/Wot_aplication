package com.example.wot;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.ActionBarActivity;
import android.view.Window;


public class SplashActivity extends ActionBarActivity implements Runnable {

	private static final int DELAY=3000;
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_splash);
   
        Handler handler=new Handler();
        handler.postDelayed(this,DELAY);
       }

    @Override
	public void run() {
		// TODO Auto-generated method stub
		Intent intent= new Intent(this,MainActivity.class);
		startActivity(intent);
		finish();
    }
    
    /*
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
    */
}
