package com.ub.tfg.kukuicup.vista;

import com.ub.tfg.kukuicup.R;
import com.ub.tfg.kukuicup.admin.vista.MenuAdminActivity;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageButton;
import android.view.View;
import android.view.View.OnClickListener;

public class MainActivity extends Activity {
	
	private Context ctxt;
	private ImageButton level1Btn;
	private ImageButton level2Btn;
	private ImageButton level3Btn;
	
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		
		ctxt = getApplicationContext();
		
		level1Btn = (ImageButton) findViewById(R.id.level1Btn);
		level2Btn = (ImageButton) findViewById(R.id.level2Btn);
		level3Btn = (ImageButton) findViewById(R.id.level3Btn);
		
		level1Btn.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				Intent intent = new Intent(ctxt, MenuActivity.class);
				startActivity(intent);
			}
		});
		
		level2Btn.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				Intent intent = new Intent(ctxt, MenuActivity.class);
				startActivity(intent);
			}
		});
		
		level3Btn.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				Intent intent = new Intent(ctxt, MenuAdminActivity.class);
				startActivity(intent);
			}
		});
	}

}
