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

		top250.add("??? ?? 15,000??");
		top250.add("???? ?? 15,000??");
		top250.add("??????+???? ?? 15,000??");
		top250.add("????? ?? 16,000??");
		top250.add("???? ?? 17,000??");
		top250.add("??????? ??? ???? ?? 17,000??");
		top250.add("?????? ?? 18,000??");
		top250.add("?????? 1???? 18,000??");
		top250.add("?????? ?? ??? ?? 18,000??");
		top250.add("????? ?????? ?? 19,000??");

		List<String> nowShowing = new ArrayList<String>();

		nowShowing.add("???? ??? ?? 17,000??");
		nowShowing.add("?????????+???? ?? 18,000??");
		nowShowing.add("??? ??? ?? 18,500??");

		List<String> comingSoon = new ArrayList<String>();

		comingSoon.add("??????(5??) 16,000??");
		comingSoon.add("?? ???? 17,000??");
		comingSoon.add("??????/???? 18,000??");

		listDataChild.put(listDataHeader.get(0), top250); // Header, Child data
		listDataChild.put(listDataHeader.get(1), nowShowing);
		listDataChild.put(listDataHeader.get(2), comingSoon);
	}

}
