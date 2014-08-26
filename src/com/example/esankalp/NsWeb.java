package com.example.esankalp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.webkit.WebView;
import android.widget.ImageView;

public class NsWeb extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.ns_activity);
		
		WebView w;
		w=(WebView)findViewById(R.id.webView1);
		w.loadUrl("file:///android_asset/sankalp/ns.html");
		
ImageView btnpage1;
		
		btnpage1 = (ImageView) findViewById(R.id.imageView1);
		btnpage1.setOnClickListener(new OnClickListener() {

			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(NsWeb.this,
						NsVideo.class);
				startActivity(intent);
			}
		});
		
	}

/*	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	
	public void GoAgri(){
		Intent intent = new Intent(NsWeb.this,
				AgriWeb.class);
		startActivity(intent);
	}
	public void GoEdu(){
		Intent intent = new Intent(NsWeb.this,
				EduWeb.class);
		startActivity(intent);
	}
	public void GoHealth(){
		Intent intent = new Intent(NsWeb.this,
				HealthWeb.class);
		startActivity(intent);
	}public void GoIg(){
		Intent intent = new Intent(NsWeb.this,
				IgWeb.class);
		startActivity(intent);
	}
	public void GoNs(){
		Intent intent = new Intent(NsWeb.this,
				NsWeb.class);
		startActivity(intent);
	}*/
	
}
