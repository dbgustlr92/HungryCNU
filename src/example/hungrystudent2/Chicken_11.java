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

public class Chicken_11 extends Activity{
	
	ExpandableListAdapter listAdapter;
	ExpandableListView expListView;
	List<String> listDataHeader;
	HashMap<String, List<String>> listDataChild;
	
	protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.chicken_11);
        ImageButton a = (ImageButton)findViewById(R.id.call_chicken11);

        a.setOnClickListener(new ImageButton.OnClickListener(){

			@Override
			public void onClick(View v) {
				startActivity(new Intent("android.intent.action.CALL",Uri.parse("tel:042-825-6787")));
				
			}
        	
        });
     // get the listview
 		expListView = (ExpandableListView) findViewById(R.id.lvExp);

 		// preparing list data
 		prepareListData();

 		listAdapter = new ExpandableListAdapter(this, listDataHeader,
 				listDataChild);

 		// setting list adapter
 		expListView.setAdapter(listAdapter);
	}
	
	private void prepareListData() {
		listDataHeader = new ArrayList<String>();
		listDataChild = new HashMap<String, List<String>>();

		// Adding child data
		listDataHeader.add("치킨");
		listDataHeader.add("세트 메뉴");
		

		// Adding child data
		List<String> top250 = new ArrayList<String>();

		top250.add("가빠치킨/바사삭치킨 15,000원");
		top250.add("바사삭윙스/라이스순살크러치 15,000원");
		top250.add("아빠치킨/엄마양념치킨 16,000원");
		top250.add("눈물나게맵닭/꿀닭강정 16,000원");
		top250.add("고추장치킨/순살고추장치킨 16,000원");		
		top250.add("애간장윙스/눈물나게매운윙스 16,000원");
		top250.add("불고기갈릭치킨 17,000원");		

		List<String> nowShowing = new ArrayList<String>();

		nowShowing.add("세트메뉴(고추튀김세트) 20,000원");
		nowShowing.add("세트메뉴(고추골뱅이) 28,000원");
	
		


		listDataChild.put(listDataHeader.get(0), top250); // Header, Child data
		listDataChild.put(listDataHeader.get(1), nowShowing);
		
	}

}
