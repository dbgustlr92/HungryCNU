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

public class Chicken_8 extends Activity {

	ExpandableListAdapter listAdapter;
	ExpandableListView expListView;
	List<String> listDataHeader;
	HashMap<String, List<String>> listDataChild;

	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.chicken_8);
		ImageButton a = (ImageButton) findViewById(R.id.call_chicken8);

		a.setOnClickListener(new ImageButton.OnClickListener() {

			@Override
			public void onClick(View v) {
				startActivity(new Intent("android.intent.action.CALL", Uri
						.parse("tel:042-826-9298")));

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
		listDataHeader.add("치킨 홈세트");
		listDataHeader.add("순살 치킨 홈세트");

		// Adding child data
		List<String> top250 = new ArrayList<String>();

		top250.add("디디치킨(대)/순살치킨/텐더스틱  14,000원");
		top250.add("양념/간장/매운양념  15,000원");
		top250.add("핫후라이드(대)/후라이드윙/닭다리후라이드  15,000원");
		top250.add("양념 치킨/간장 치킨 16,000원");
		top250.add("닭강정/까르보나라/탕수육치킨/파닭(대)  16,000원");
		top250.add("빅디디후라이드(특대) 16,500원");
		top250.add("장인 파닭 17,000원");
		top250.add("장인 파닭 양념 18,000원");

		List<String> nowShowing = new ArrayList<String>();

		nowShowing.add("홈세트1(후라이드+양념+간장) 19,500원");
		nowShowing.add("홈세트3(후라이드+파닭+양념) 19,500원");
		nowShowing.add("홈세트2(후라이드+닭강정+간장) 19,500원");
		nowShowing.add("홈세트4(후라이드+파닭+닭강정) 19,500원");
		nowShowing.add("디디쿡(까르보나라+탕수육치킨+후라이드) 19,500원");

		List<String> comingSoon = new ArrayList<String>();

		comingSoon.add("순살세트1(닭강정+파닭+후라이드) 19,500원");
		comingSoon.add("순살세트2(매운강정+파닭+후라이드) 19,500원");
		comingSoon.add("순살세트3(스위트칠리+파닭+후라이드) 19,500원");
		comingSoon.add("순살세트4(까르보ㅌ나라+탕수육+후라이드) 19,500원");

		listDataChild.put(listDataHeader.get(0), top250); // Header, Child data
		listDataChild.put(listDataHeader.get(1), nowShowing);
		listDataChild.put(listDataHeader.get(2), comingSoon);

	}

}
