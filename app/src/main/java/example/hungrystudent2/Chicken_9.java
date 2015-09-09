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

public class Chicken_9 extends Activity {

	ExpandableListAdapter listAdapter;
	ExpandableListView expListView;
	List<String> listDataHeader;
	HashMap<String, List<String>> listDataChild;

	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.chicken_9);
		ImageButton a = (ImageButton) findViewById(R.id.call_chicken9);

		a.setOnClickListener(new ImageButton.OnClickListener() {

			@Override
			public void onClick(View v) {
				startActivity(new Intent("android.intent.action.CALL", Uri
						.parse("tel:042-825-5259")));

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
		listDataHeader.add("치킨 세트");

		// Adding child data
		List<String> top250 = new ArrayList<String>();

		top250.add("원조옛날후라이드 12,000원");
		top250.add("스파이시/마일드치킨 13,000원");
		top250.add("원조옛날양념/간장치킨 13,000원");
		top250.add("EQ양념/마늘간장치킨 14,000원");
		top250.add("매운EQ양념치킨 15,000원");
		top250.add("불닭바베큐/땡초갈릭/치즈스노우킹 16,000원");
		top250.add("후라이드+양념 17,000원");
		top250.add("후라이드+간장 17,000원");
		top250.add("양념+간장  18,000원");

		List<String> nowShowing = new ArrayList<String>();

		nowShowing.add("순살파닭 13,500원");
		nowShowing.add("순살파닭양념/간장  14,500원");
		nowShowing.add("순살파닭매운양념  15,500원");
		nowShowing.add("순살A(순살파닭+양념)/순살B(순살파닭+간장) 18,000원");
		nowShowing.add("순살C(양념+간장) 19,000원");
		nowShowing.add("순살D(양념+간장) 20,000원");

		List<String> comingSoon = new ArrayList<String>();

		comingSoon.add("SET 1 스파이시+EQ양념 18,000원");
		comingSoon.add("SET 2 스파이시+마늘간장 18,000원");
		comingSoon.add("SET 3 스파이시+불닭바베큐 22,000원");
		comingSoon.add("SET 4 EQ양념+마늘간장  19,000원");
		comingSoon.add("SET 5 매운EQ양념+마늘간장  20,000원");

		listDataChild.put(listDataHeader.get(0), top250); // Header, Child data
		listDataChild.put(listDataHeader.get(1), nowShowing);
		listDataChild.put(listDataHeader.get(2), comingSoon);

	}

}
