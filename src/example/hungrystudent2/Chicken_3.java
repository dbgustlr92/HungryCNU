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

public class Chicken_3 extends Activity{
	
	ExpandableListAdapter listAdapter;
	ExpandableListView expListView;
	List<String> listDataHeader;
	HashMap<String, List<String>> listDataChild;
	
	protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.chicken_3);
        ImageButton a = (ImageButton)findViewById(R.id.call_chicken3);

        a.setOnClickListener(new ImageButton.OnClickListener(){

			@Override
			public void onClick(View v) {
				startActivity(new Intent("android.intent.action.CALL",Uri.parse("tel:042-824-8589")));
				
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
		listDataHeader.add("순살 치킨");
		// listDataHeader.add("술");

		// Adding child data
		List<String> top250 = new ArrayList<String>();

		
		top250.add("순살 양념 치킨 12,000원");
		top250.add("순살 간장 치킨 12,000원");
		top250.add("순살 겨자 치킨 12,000원");
		top250.add("순살 후라이드 치킨 12,000원");		
		top250.add("순살 마늘 치킨 13,000원");
		top250.add("순살 치즈 치킨 13,000원");
		top250.add("순살 야채 치킨 13,000원");
		top250.add("순살 카레 치킨 13,000원");
		top250.add("순살 매운 양념 치킨 13,000원");
		top250.add("세트 메뉴 두마리 치킨 18,000원");
		top250.add("세트 메뉴 세마리 치킨 24,000원");

		/*List<String> nowShowing = new ArrayList<String>();

		nowShowing.add("순살 치킨 17,000원");
		nowShowing.add("순살 후라이드 두마리 치킨 17,000원");
		nowShowing.add("순살 간장 + 양념 치킨 18,000원");
		nowShowing.add("순살 후라이드 + 양념 치킨 18,000원");
		nowShowing.add("순살 후라이드 + 간장 치킨 18,000원");
		nowShowing.add("순살 카레 치킨 19,000원");*/

		// List<String> comingSoon = new ArrayList<String>();
		/*
		 * comingSoon.add("소주"); comingSoon.add("맥주"); comingSoon.add("고량주");
		 * comingSoon.add("으컁컁"); comingSoon.add("겅백");
		 */

		listDataChild.put(listDataHeader.get(0), top250); // Header, Child data
		//listDataChild.put(listDataHeader.get(1), nowShowing);
		// listDataChild.put(listDataHeader.get(2), comingSoon);
	}


}
