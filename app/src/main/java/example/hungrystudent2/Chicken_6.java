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

public class Chicken_6 extends Activity{

	ExpandableListAdapter listAdapter;
	ExpandableListView expListView;
	List<String> listDataHeader;
	HashMap<String, List<String>> listDataChild;
	
	protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.chicken_6);
        ImageButton a = (ImageButton)findViewById(R.id.call_chicken6);

        a.setOnClickListener(new ImageButton.OnClickListener(){

			@Override
			public void onClick(View v) {
				startActivity(new Intent("android.intent.action.CALL",Uri.parse("tel:042-362-0563")));
				
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
		listDataHeader.add("순살 치킨");
		listDataHeader.add("피자");
		listDataHeader.add("세트메뉴");

		// Adding child data
		List<String> top250 = new ArrayList<String>();
		
		top250.add("구운 치킨 15,000원");
		top250.add("핫치킨 16,000원");
		top250.add("퐁듀&치킨 16,000원");
		top250.add("어니언치킨 16,000원");
		top250.add("까르보나라치킨 16,000원");
		top250.add("양념 치킨/간장 치킨 16,000원");
		top250.add("장인 파닭 17,000원");
		top250.add("장인 파닭 양념 18,000원");
	
		
	
		
		List<String> nowShowing = new ArrayList<String>();
		
		nowShowing.add("장인한마리 순살파닭  13,000원");
		nowShowing.add("장인순살 두마리치킨  16,000원");
		nowShowing.add("순살치킨  17,000원");
		nowShowing.add("순살치즈/순살파닭  18,000원");
	
	
		List<String> comingSoon = new ArrayList<String>();

		comingSoon.add("포테이토/고구마피자 16,000원");
		comingSoon.add("치즈바이트피자  18,000원");
		List<String> abc = new ArrayList<String>();

		abc.add("하나,장인순살후라이드+오븐구이 24,000원");
		abc.add("둘, 장인순살(양념선택)+오븐구이(양념선택) 26,000원");
		abc.add("셋, 어니언치킨+구운치킨 28,000원");
		abc.add("넷, 퐁듀&치킨+구운치킨 28,000원");
	
		listDataChild.put(listDataHeader.get(0), top250); // Header, Child data
		listDataChild.put(listDataHeader.get(1), nowShowing);
		listDataChild.put(listDataHeader.get(2), comingSoon);
		listDataChild.put(listDataHeader.get(3), abc);
	}

}
