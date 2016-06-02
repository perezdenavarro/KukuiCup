package com.ub.tfg.kukuicup.vista;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import com.ub.tfg.kukuicup.R;

import android.app.Activity;
//import android.content.Context;
import android.os.Bundle;
import android.widget.ExpandableListView;
import android.widget.ExpandableListView.OnChildClickListener;
import android.view.View;
import android.widget.Toast;

public class MenuActivity extends Activity {
	
	//private Context ctxt;
	ExpandableListAdapter listAdapter;
    ExpandableListView expListView;
    List<String> listDataHeader;
    HashMap<String, List<String>> listDataChild;
	
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.menu);
		
		//ctxt = getApplicationContext();
        
		// get the listview
        expListView = (ExpandableListView) findViewById(R.id.lvExp);
 
        // preparing list data
        prepareListData();
 
        listAdapter = new ExpandableListAdapter(this, listDataHeader, listDataChild);
 
        // setting list adapter
        expListView.setAdapter(listAdapter);

        // Listview on child click listener
        expListView.setOnChildClickListener(new OnChildClickListener() {

            @Override
            public boolean onChildClick(ExpandableListView parent, View v,
                                        int groupPosition, int childPosition, long id) {
                // TODO Auto-generated method stub
                Toast.makeText(
                        getApplicationContext(),
                        listDataHeader.get(groupPosition)
                                + " : "
                                + listDataChild.get(
                                listDataHeader.get(groupPosition)).get(
                                childPosition), Toast.LENGTH_SHORT)
                        .show();
                return false;
            }
        });
	}
    /*
     * Preparing the list data
     */
    private void prepareListData() {
        listDataHeader = new ArrayList<String>();
        listDataChild = new HashMap<String, List<String>>();
 
        // Adding child data
        listDataHeader.add("Saving Actions");
        listDataHeader.add("Energy Challenge");
        listDataHeader.add("Science Video");
 
        // Adding child data
        List<String> action = new ArrayList<String>();
        action.add("Computer responsible");
        action.add("Desk light");
        action.add("Like kukui");

 
        List<String> challenge = new ArrayList<String>();
        challenge.add("Off before sleep");

 
        List<String> video = new ArrayList<String>();
        video.add("Power and energy");

 
        listDataChild.put(listDataHeader.get(0), action); // Header, Child data
        listDataChild.put(listDataHeader.get(1), challenge);
        listDataChild.put(listDataHeader.get(2), video);
    }
}
