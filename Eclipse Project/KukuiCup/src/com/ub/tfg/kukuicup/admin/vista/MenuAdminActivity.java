package com.ub.tfg.kukuicup.admin.vista;

import com.ub.tfg.kukuicup.R;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;

public class MenuAdminActivity extends Activity {
	
	private Context ctxt;
	
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.menu_admin);
		
		ctxt = getApplicationContext();
	}

}
