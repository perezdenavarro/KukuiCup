package com.ub.tfg.kukuicup.vista;

import com.ub.tfg.kukuicup.R;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class LoginActivity extends Activity {
    /** Called when the activity is first created. */
	private Context ctxt;
	
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);
        
        ctxt = getApplicationContext();
        
        Button enterBtn = (Button)findViewById(R.id.enterBtn);
        
        enterBtn.setOnClickListener(new OnClickListener() {
        	public void onClick(View v) {
        		Intent intent = new Intent(ctxt, VideoActivity.class);
        		startActivity(intent);
        	}
        });
    }
}