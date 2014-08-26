package com.example.esankalp;

import android.app.Activity;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class AgriVideo extends Activity {
	VideoView v;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.agrivideo);
		
		
		v=(VideoView)findViewById(R.id.videoView1);
		
		MediaController m=new MediaController(this);
		m.setAnchorView(v);
		v.setMediaController(m);
		
		v.setVideoPath("/sdcard/sankalp/agri.mp4");
		v.start();
		
		
		
	}
	

}
