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

public class Chicken_14 extends Activity{
	
	ExpandableListAdapter listAdapter;
	ExpandableListView expListView;
	List<String> listDataHeader;
	HashMap<String, List<String>> listDataChild;
	
	protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.chicken_14);
        ImageButton a = (ImageButton)findViewById(R.id.call_chicken14);

        a.setOnClickListener(new ImageButton.OnClickListener(){

			@Override
			public void onClick(View v) {
				startActivity(new Intent("android.intent.action.CALL",Uri.parse("tel:042-867-9292")));
				
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
		listDataHeader.add("치킨(구이)");
		listDataHeader.add("사이드 메뉴");

		// Adding child data
		List<String> top250 = new ArrayList<String>();
		
		
		top250.add("바삭칸치킨 16,000원");
		top250.add("황금올리브치킨 16,000원");
		top250.add("스모크치킨  17,000원");
		top250.add("뉴욕속안심텐더 17,000원");		
		top250.add("(반반)순살 + 바사칸 17,000원");
		top250.add("마늘간장닭날개 17,500원");
		top250.add("황금올리브닭다리 17,500원");
		top250.add("자메이카통다리구이 17,500원");	
		top250.add("치킨강정 18,000원");
		top250.add("(반반)순살 + 크래커 18,000원");
		top250.add("빠리치킨 19,000원");
		top250.add("이스탄불치킨 19,500원");		

		List<String> nowShowing = new ArrayList<String>();

		nowShowing.add("(구이)파닭의꿈 19,000원");
		nowShowing.add("(구이)맵닭119 19,000원");
		nowShowing.add("(구이)양파의청춘 19,000원");
		

		List<String> comingSoon = new ArrayList<String>();

		comingSoon.add("(사이드)콘셀러드  1,000원");
		comingSoon.add("(사이드)오징어링/고구마스틱  2,000원");
		comingSoon.add("(사이드)꼬꼬컵  2,500원");
		comingSoon.add("(사이드)포테이토/치즈스틱 3,000원");

		listDataChild.put(listDataHeader.get(0), top250); // Header, Child data
		listDataChild.put(listDataHeader.get(1), nowShowing);
		listDataChild.put(listDataHeader.get(2), comingSoon);
	}

}
