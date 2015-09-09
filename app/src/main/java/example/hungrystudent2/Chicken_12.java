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

public class Chicken_12 extends Activity {

	ExpandableListAdapter listAdapter;
	ExpandableListView expListView;
	List<String> listDataHeader;
	HashMap<String, List<String>> listDataChild;

	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.chicken_12);
		ImageButton a = (ImageButton) findViewById(R.id.call_chicken12);

		a.setOnClickListener(new ImageButton.OnClickListener() {

			@Override
			public void onClick(View v) {
				startActivity(new Intent("android.intent.action.CALL", Uri
						.parse("tel:042-826-8294")));

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

		top250.add("굽네치킨 15,000원");
		top250.add("굽네핫치킨/바사삭치킨/고추바사삭  16,000원");
		top250.add("통다리/통날개/데리바사삭 17,000원");
		top250.add("양념바사삭/바사삭쌀강정/핫미니족  17,000원");
		top250.add("굽네순살/굽네폭립/반반치킨  18,000원");
		top250.add("한마리 더 세트  26,000원");
		top250.add("파채 2,000원");

		listDataChild.put(listDataHeader.get(0), top250); // Header, Child data

	}

}
