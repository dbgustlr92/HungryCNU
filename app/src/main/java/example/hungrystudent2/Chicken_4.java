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

public class Chicken_4 extends Activity {

	ExpandableListAdapter listAdapter;
	ExpandableListView expListView;
	List<String> listDataHeader;
	HashMap<String, List<String>> listDataChild;

	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.chicken_4);
		ImageButton a = (ImageButton) findViewById(R.id.call_chicken4);

		a.setOnClickListener(new ImageButton.OnClickListener() {

			@Override
			public void onClick(View v) {
				startActivity(new Intent("android.intent.action.CALL", Uri
						.parse("tel:042-822-7717")));

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
		listDataHeader.add("피자");
		listDataHeader.add("치킨 + 피자 세트");

		// Adding child data
		List<String> top250 = new ArrayList<String>();

		top250.add("구운 치킨 16,000원");
		top250.add("구운 핫 치킨/구운 마늘 치킨 16,000원");		
		top250.add("콘 베이크 치킨/핫 베이크 치킨 16,000원");
		top250.add("구운 데리야끼 치킨/바베큐 치킨 16,000원");
		top250.add("구운 통 날개/구운 통 다리 17,000원");
		top250.add("구운 통다리(반)+통날개(반) 17,000원");
		top250.add("구운 통다리(반)+구운 순살(반) 17,000원");
		top250.add("구운 통날개(반)+구운 순살(반) 17,000원");
		top250.add("순살 파닭/구운 순살 치즈 치킨 18,000원");
		List<String> nowShowing = new ArrayList<String>();
		
		nowShowing.add("포테이토/고구마 피자 15,000원");
		nowShowing.add("콤비네이션/불고기 피자 15,000원");
		nowShowing.add("페페로니/핫치킨/베이컨 피자 15,000원");
		nowShowing.add("치즈 바이트 피자 18,000원");
		nowShowing.add("순살 후라이드 + 간장 치킨 18,000원");
		nowShowing.add("순살 카레 치킨 19,000원");

		List<String> comingSoon = new ArrayList<String>();

		comingSoon.add("구운치킨(반)+콤비네이션피자(R) 20,000원");
		comingSoon.add("구운치킨한마리+콤피네이션피자(R) 26,000원");
		comingSoon.add("구운통날개치킨(1마리)+고구마피자(R) 28,000원");
		comingSoon.add("구운통다리치킨(1마리)+고구마피자(R) 29,000원");
		comingSoon.add("두마리치킨+콤비네이션피자(R) 30,000원");

		listDataChild.put(listDataHeader.get(0), top250); // Header, Child data
		listDataChild.put(listDataHeader.get(1), nowShowing);
		listDataChild.put(listDataHeader.get(2), comingSoon);
	}

}
