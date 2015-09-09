package example.hungrystudent2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ExpandableListView;
import android.widget.ImageButton;

public class Chicken_5 extends Activity{
	ExpandableListAdapter listAdapter;
	ExpandableListView expListView;
	List<String> listDataHeader;
	HashMap<String, List<String>> listDataChild;
	
	protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.chicken_5);
        ImageButton a = (ImageButton)findViewById(R.id.call_chicken5);

        a.setOnClickListener(new ImageButton.OnClickListener(){

			@Override
			public void onClick(View v) {
				startActivity(new Intent("android.intent.action.CALL",Uri.parse("tel:042-824-2448")));
				
			}
        	
        });
  
     		expListView = (ExpandableListView) findViewById(R.id.lvExp);

     	
     		prepareListData();

     		listAdapter = new ExpandableListAdapter(this, listDataHeader,
     				listDataChild);

     		
     		expListView.setAdapter(listAdapter);
	}
	private void prepareListData() {
		listDataHeader = new ArrayList<String>();
		listDataChild = new HashMap<String, List<String>>();

	
		listDataHeader.add("치킨");
		
		List<String> top250 = new ArrayList<String>();
		
		top250.add("닭도리탕  15,000원");
		top250.add("후라이드+콜라500ml 15,000원");
		
	
		listDataChild.put(listDataHeader.get(0), top250);
	}


}
