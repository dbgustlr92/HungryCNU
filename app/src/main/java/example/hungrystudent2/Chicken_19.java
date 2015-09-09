package example.hungrystudent2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ExpandableListView;
import android.widget.ImageButton;

public class Chicken_19 extends Activity {

	ExpandableListAdapter listAdapter;
	ExpandableListView expListView;
	List<String> listDataHeader;
	HashMap<String, List<String>> listDataChild;

	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.chicken_19);
		ImageButton a = (ImageButton) findViewById(R.id.call_chicken19);

		a.setOnClickListener(new ImageButton.OnClickListener() {

			@Override
			public void onClick(View v) {
				startActivity(new Intent("android.intent.action.CALL", Uri
						.parse("tel:042-822-8871")));

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
		listDataHeader.add("Set메뉴");

		// Adding child data
		List<String> top250 = new ArrayList<String>();
		
		top250.add("순살마늘간장파닭 16,000원");
		top250.add("순살양념파닭 16,000원");
		top250.add("순살후라이드파닭 16,000원");
		top250.add("마늘간장 파닭 16,000원");
		top250.add("양념파닭 16,000원");
		top250.add("후라이드파닭 16,000원 ");

		
		List<String> SetMenu = new ArrayList<String>();
		
		SetMenu.add("순살후라이드파닭 + 순살마늘간장파닭 17,000원");
		SetMenu.add("순살후라이드파닭 + 순살마늘간장파닭 17,000원");
		SetMenu.add("순살마늘간장파닭 + 순살양념파닭 17,000원");
		listDataChild.put(listDataHeader.get(0), top250); // Header, Child data
		listDataChild.put(listDataHeader.get(1), SetMenu);
		

	}
}
