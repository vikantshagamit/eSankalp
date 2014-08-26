package com.example.esankalp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.webkit.WebView;
import android.widget.ImageView;

public class EduWeb extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.edu_activity);
		
		WebView w;
		w=(WebView)findViewById(R.id.webView1);
		w.loadUrl("file:///android_asset/sankalp/edu.html");
		
ImageView btnpage1;
		
		btnpage1 = (ImageView) findViewById(R.id.imageView1);
		btnpage1.setOnClickListener(new OnClickListener() {

			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(EduWeb.this,
						EduVideo.class);
				startActivity(intent);
			}
		});
		
	}

	
	
	
	
	
}
