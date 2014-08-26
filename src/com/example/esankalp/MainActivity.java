package com.example.esankalp;

import java.io.File;

import android.os.Bundle;
import android.os.Environment;
import android.app.Activity;
import android.content.Intent;


public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		
		File nfile=new File(Environment.getExternalStorageDirectory()+"/sankalp");
		if(!nfile.exists()){
			nfile.mkdir();
		}// creating sankalp folder in sdcard on app install
		
		
		
		Thread t = new Thread() {

			public void run() {

				try {

					sleep(4000);
					finish();
					Intent cv = new Intent(MainActivity.this,
							MenuActivity.class);
					startActivity(cv);
				}

				catch (InterruptedException e) {
					e.printStackTrace();
				}
			}

		};
		t.start();
	}

	
}
