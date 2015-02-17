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

public class Chicken_18 extends Activity {

	ExpandableListAdapter listAdapter;
	ExpandableListView expListView;
	List<String> listDataHeader;
	HashMap<String, List<String>> listDataChild;

	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.chicken_18);
		ImageButton a = (ImageButton) findViewById(R.id.call_chicken18);

		a.setOnClickListener(new ImageButton.OnClickListener() {

			@Override
			public void onClick(View v) {
				startActivity(new Intent("android.intent.action.CALL", Uri
						.parse("tel:042-861-4479")));

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

		// Adding child data
		List<String> top250 = new ArrayList<String>();
		
		top250.add("옛날통닭  14,000원");
		top250.add("후라이드(마일드+핫) 15,000원");
		top250.add("양념치킨 16,000원");
		top250.add("양념반/후라이드반 16,000원");
		top250.add("후닭(매운맛/순한맛) 16,000원");
		top250.add("윙봉 17,000원");
		top250.add("쇼킹핫양념치킨/순살 17,000원");
		top250.add("오리엔탈파닭/골드링양파닭 17,000원");
		top250.add("닭다리/다리반+날개반/닭날개 17,000원");
		top250.add("네네마늘치킨/스노윙(치즈/야채) 17,000원");
		top250.add("네네순살닭강정 18,000원");
		top250.add("스노윙반+양념반 18,000원");
		top250.add("스노윙반반(야채+치즈) 18,000원");
		top250.add("후닭윙봉(매운맛/순한맛) 18,000원");
		top250.add("스노윙반+쇼킹핫반 19,000원");
		top250.add("네네흑임자치킨 20,000원");

		listDataChild.put(listDataHeader.get(0), top250); // Header, Child data

	}

}
