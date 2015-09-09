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

public class Chicken_15 extends Activity {

	ExpandableListAdapter listAdapter;
	ExpandableListView expListView;
	List<String> listDataHeader;
	HashMap<String, List<String>> listDataChild;

	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.chicken_15);
		ImageButton a = (ImageButton) findViewById(R.id.call_chicken15);

		a.setOnClickListener(new ImageButton.OnClickListener() {

			@Override
			public void onClick(View v) {
				startActivity(new Intent("android.intent.action.CALL", Uri
						.parse("tel:042-867-5003")));

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
		listDataHeader.add("순살 세트");
		listDataHeader.add("뼈 치킨 세트");

		// Adding child data
		List<String> top250 = new ArrayList<String>();

		top250.add("한마리치킨/똥집후라이드 14,000원");
		top250.add("치즈치킨 15,000원");
		top250.add("뼈/순살 한마리 삼국지 15,000원");
		top250.add("순살 두마리 삼국지 18,000원");
		top250.add("순살 세마리 삼국지  24,000원");
		top250.add("순살 네마리 삼국지  31,000원");
		top250.add("뼈 두마리 삼국지 22,000원");
		
		List<String> nowShowing = new ArrayList<String>();

		nowShowing.add("순살SET1 후라이드+후라이드 16,000원");
		nowShowing.add("순살SET2 후라이드+양념 17,000원");
		nowShowing.add("순살SET3 후라이드+간장 17,000원");
		nowShowing.add("순살SET4 양념+간장 18,000원");
		nowShowing.add("순살SET5 똥집후라이드+양념 17,000원");
		nowShowing.add("순살SET6 똥집후라이드+간장 17,000원");

		List<String> comingSoon = new ArrayList<String>();

		comingSoon.add("뼈SET1 후라이드+후라이드 20,000원");
		comingSoon.add("뼈SET2 후라이드+양념 21,000원");
		comingSoon.add("뼈SET3 후라이드+간장 21,000원");
		comingSoon.add("뼈SET4 간장+양념 22,000원");

		listDataChild.put(listDataHeader.get(0), top250); // Header, Child data
		listDataChild.put(listDataHeader.get(1), nowShowing);
		listDataChild.put(listDataHeader.get(2), comingSoon);
	}

}
