package com.example.esankalp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
/*import android.view.Menu;*/
import android.view.View;
import android.view.View.OnClickListener;
import android.webkit.WebView;
import android.widget.ImageView;

public class AgriWeb extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.agri_activity);
		
		WebView w;
		w=(WebView)findViewById(R.id.webView1);
		w.loadUrl("file:///android_asset/sankalp/agri.html");
		
ImageView btnpage1;
		
		btnpage1 = (ImageView) findViewById(R.id.imageView1);
		btnpage1.setOnClickListener(new OnClickListener() {

			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(AgriWeb.this,
						AgriVideo.class);
				startActivity(intent);
			}
		});
		
	}


	
	
	
	
}
