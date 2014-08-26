package com.example.esankalp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;

public class MenuActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.actvity_menu);
		
		
		ImageView agri,edu,ig,health,ns;
		
		agri = (ImageView) findViewById(R.id.imageView2);
		agri.setOnClickListener(new OnClickListener() {

			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(MenuActivity.this,
						AgriWeb.class);
				startActivity(intent);
			}
		});
		
		edu = (ImageView) findViewById(R.id.imageView3);
		edu.setOnClickListener(new OnClickListener() {

			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(MenuActivity.this,
						EduWeb.class);
				startActivity(intent);
			}
		});
		
		ig = (ImageView) findViewById(R.id.imageView5);
		ig.setOnClickListener(new OnClickListener() {

			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(MenuActivity.this,
						IgWeb.class);
				startActivity(intent);
			}
		});
		
		health = (ImageView) findViewById(R.id.imageView4);
		health.setOnClickListener(new OnClickListener() {

			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(MenuActivity.this,
						HealthWeb.class);
				startActivity(intent);
			}
		});
		
		ns = (ImageView) findViewById(R.id.imageView6);
		ns.setOnClickListener(new OnClickListener() {

			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(MenuActivity.this,
						NsWeb.class);
				startActivity(intent);
			}
		});
	}

}
