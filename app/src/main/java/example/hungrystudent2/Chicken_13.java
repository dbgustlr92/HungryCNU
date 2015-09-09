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

public class Chicken_13 extends Activity {

	ExpandableListAdapter listAdapter;
	ExpandableListView expListView;
	List<String> listDataHeader;
	HashMap<String, List<String>> listDataChild;

	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.chicken_13);
		ImageButton a = (ImageButton) findViewById(R.id.call_chicken13);

		a.setOnClickListener(new ImageButton.OnClickListener() {

			@Override
			public void onClick(View v) {
				startActivity(new Intent("android.intent.action.CALL", Uri
						.parse("tel:042-863-5577")));

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

		top250.add("참숯누드바베큐 16,000원");
		top250.add("칼슘양념후라이드치킨 16,000원");
		top250.add("후라이드/갈릭후라이드치킨  16,000원");
		top250.add("레드핫후라이드치킨/간장후라이드치킨 16,000원");
		top250.add("크리스피치킨  17,000원");
		top250.add("데리/갈릭 바베큐  17,000원");
		top250.add("참숯간장/스위트/핫 17,000원");
		top250.add("갈릭크리스피치킨 18,000원");
		top250.add("간장크리스피크림 18,000원");
		top250.add("레드핫크리스피크림 18,000원");
		top250.add("칼슘양념크리스피치킨 18,000원");
		top250.add("참숯 고구마 바베큐 21,000원");
		top250.add("참숯 치즈떡 바베큐 21,000원");

		listDataChild.put(listDataHeader.get(0), top250); // Header, Child data

	}

}
