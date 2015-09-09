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

public class Chicken_17 extends Activity {

	ExpandableListAdapter listAdapter;
	ExpandableListView expListView;
	List<String> listDataHeader;
	HashMap<String, List<String>> listDataChild;

	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.chicken_17);
		ImageButton a = (ImageButton) findViewById(R.id.call_chicken17);

		a.setOnClickListener(new ImageButton.OnClickListener() {

			@Override
			public void onClick(View v) {
				startActivity(new Intent("android.intent.action.CALL", Uri
						.parse("tel:042-825-9993")));

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
		listDataHeader.add("세트 메뉴");

		// Adding child data
		List<String> top250 = new ArrayList<String>();

		top250.add("몬스터오븐구이(순살1마리) 13,000원");
		top250.add("몬스터오븐구이(순살2마리) 18,000원");
		top250.add("몬스터오븐구이(순살3마리) 24,000원");
		top250.add("순살쇼킹불닭/순살핫칠리/순살마늘간장 15,000원");
		top250.add("뼈쇼팅불닭/뼈핫칠리/뼈마늘간장 16,000원");
		top250.add("몬스터오븐구이+핫칠리 20,000원");
		top250.add("몬스터오븐구이+쇼킹불닭 20,000원");
		top250.add("몬스터오븐구이+마늘간장치킨 20,000원");

		List<String> nowShowing = new ArrayList<String>();

		nowShowing.add("순살파닭 2리선택 18,000원");
		nowShowing.add("순살파닭 3마리선택 25,000원");
		nowShowing.add("뼈있는치킨 1마리선택 14,000원");
		nowShowing.add("뼈있는치킨 2리선택 20,000원");

		listDataChild.put(listDataHeader.get(0), top250); // Header, Child data
		listDataChild.put(listDataHeader.get(1), nowShowing);

	}

}
