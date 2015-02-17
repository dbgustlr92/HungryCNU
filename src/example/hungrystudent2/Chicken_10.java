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

public class Chicken_10 extends Activity {

	ExpandableListAdapter listAdapter;
	ExpandableListView expListView;
	List<String> listDataHeader;
	HashMap<String, List<String>> listDataChild;

	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.chicken_10);
		ImageButton a = (ImageButton) findViewById(R.id.call_chicken10);

		a.setOnClickListener(new ImageButton.OnClickListener() {

			@Override
			public void onClick(View v) {
				startActivity(new Intent("android.intent.action.CALL", Uri
						.parse("tel:042-825-7289")));

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
		listDataHeader.add("한마리 치킨");
		listDataHeader.add("두마리 치킨");
		listDataHeader.add("세마리 치킨");

		// Adding child data
		List<String> top250 = new ArrayList<String>();

		top250.add("레몬겨자/커리맛 13,000원");
		top250.add("불고기소스/치즈머스/고추핫 13,000원");
		top250.add("얼큰양념/크림머스/핫데리소스 13,000원");
		top250.add("순살후라이드/매콤양념/마늘간장 13,000원");

		List<String> nowShowing = new ArrayList<String>();

		nowShowing.add("치즈머스+핫데리소스/간장+크림머스 17,000원");
		nowShowing.add("크림머스+핫데리/매콤양념+치즈머스 17,000원");
		nowShowing.add("매콤양념+마늘간장/매콤양념+크림머스 17,000원");

		List<String> comingSoon = new ArrayList<String>();

		comingSoon.add("양념+간장+치즈 24,000원");
		comingSoon.add("양념+치즈+핫데리 24,000원");
		comingSoon.add("매콤양념+간장+크림 24,000원");
		comingSoon.add("양념+후라이드+크림  24,000원");

		listDataChild.put(listDataHeader.get(0), top250); // Header, Child data
		listDataChild.put(listDataHeader.get(1), nowShowing);
		listDataChild.put(listDataHeader.get(2), comingSoon);
	}

}
