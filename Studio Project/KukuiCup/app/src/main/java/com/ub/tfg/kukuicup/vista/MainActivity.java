package com.ub.tfg.kukuicup.vista;

import com.ub.tfg.kukuicup.R;
import com.ub.tfg.kukuicup.admin.vista.MenuAdminActivity;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;
import android.view.View;
import android.view.View.OnClickListener;

public class MainActivity extends Activity {
	
	private Context ctxt;
	private ImageButton level1Btn;
	private ImageButton level2Btn;
	private ImageButton level3Btn;
	private AlertDialog alertDialog;
	
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		
		ctxt = getApplicationContext();
		
		level1Btn = (ImageButton) findViewById(R.id.level1Btn);
		level2Btn = (ImageButton) findViewById(R.id.level2Btn);
		level3Btn = (ImageButton) findViewById(R.id.level3Btn);
		
		alertDialog = new AlertDialog.Builder(MainActivity.this).create();
		
		// Setting Dialog Title
        alertDialog.setTitle("Level blocked");
 
        // Setting Dialog Message
        alertDialog.setMessage("You need to complete the previous level to continue");
 
        // Setting Icon to Dialog
        alertDialog.setIcon(R.drawable.ic_blocked_level);
 
        // Setting OK Button
        alertDialog.setButton2("OK", new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialog, int which) {
                // Write your code here to execute after dialog closed
                Toast.makeText(getApplicationContext(), "You can do it!", Toast.LENGTH_SHORT).show();
                }
        });
		
		level1Btn.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				Intent intent = new Intent(ctxt, MenuActivity.class);
				startActivity(intent);
			}
		});
		
		level2Btn.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				alertDialog.show();
//				Intent intent = new Intent(ctxt, MenuActivity.class);
//				startActivity(intent);
			}
		});
		
		level3Btn.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				alertDialog.show();
//				Intent intent = new Intent(ctxt, MenuAdminActivity.class);
//				startActivity(intent);
			}
		});
	}

}
