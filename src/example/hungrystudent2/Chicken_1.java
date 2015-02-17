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

public class Chicken_1 extends Activity {
	ExpandableListAdapter listAdapter;
	ExpandableListView expListView;
	List<String> listDataHeader;
	HashMap<String, List<String>> listDataChild;

	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.chicken_1);

		ImageButton a = (ImageButton) findViewById(R.id.call_chicken1);

		a.setOnClickListener(new ImageButton.OnClickListener() {
			@Override
			public void onClick(View v) {
				startActivity(new Intent("android.intent.action.CALL", Uri
						.parse("tel:042-825-0617")));
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
		listDataHeader.add("강정 및 기타");

		// Adding child data
		List<String> top250 = new ArrayList<String>();

		top250.add("양념 치킨 15,000원");
		top250.add("바삭클 치킨 15,000원");
		top250.add("후라이드+마늘 치킨 15,000원");
		top250.add("매운양념 치킨 16,000원");
		top250.add("뿌링클 치킨 17,000원");
		top250.add("프리미엄 텐더 요레요레 치킨 17,000원");
		top250.add("뿌링클핫 치킨 18,000원");
		top250.add("간장골드 1마리 18,000원");
		top250.add("별에서 온 코스 치킨 18,000원");
		top250.add("해바라기 후라이드 치킨 19,000원");

		List<String> nowShowing = new ArrayList<String>();

		nowShowing.add("우리쌀 순살 치킨 17,000원");
		nowShowing.add("순살후라이드+간장 치킨 18,000원");
		nowShowing.add("순살 파닭 치킨 18,500원");

		List<String> comingSoon = new ArrayList<String>();

		comingSoon.add("허브스모크(5개) 16,000원");
		comingSoon.add("치킨 강정 17,000원");
		comingSoon.add("루팡치킨/날개 18,000원");

		listDataChild.put(listDataHeader.get(0), top250); // Header, Child data
		listDataChild.put(listDataHeader.get(1), nowShowing);
		listDataChild.put(listDataHeader.get(2), comingSoon);
	}

}
