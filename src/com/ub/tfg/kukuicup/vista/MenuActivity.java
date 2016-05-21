package com.ub.tfg.kukuicup.vista;

import com.ub.tfg.kukuicup.R;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;

public class MenuActivity extends Activity{
	
	private Context ctxt;
	
	public void OnCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		
		ctxt = getApplicationContext();
	}

}
