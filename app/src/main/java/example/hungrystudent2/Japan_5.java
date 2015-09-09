package example.hungrystudent2;

import java.util.*;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.*;

public class Japan_5 extends Activity {
	ExpandableListAdapter listAdapter;
	ExpandableListView expListView;
	List<String> listDataHeader;
	HashMap<String, List<String>> listDataChild;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.japan_5);

		ImageButton a = (ImageButton) findViewById(R.id.call_japanese5);

		a.setOnClickListener(new ImageButton.OnClickListener() {

			@Override
			public void onClick(View v) {
				startActivity(new Intent("android.intent.action.CALL", Uri
						.parse("tel:042-825-2900")));

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
		listDataHeader.add("메뉴A");
		listDataHeader.add("메뉴B");

		// Adding child data
		List<String> menu1 = new ArrayList<String>(); // 돈까스
		menu1.add("스시안주방장 추천초밥 13점+샐러드   15,000원");
		menu1.add("[초밥선택가능]계란말이,광어,우럭,도미,한우,장어,참다랑어,눈다랑어,생연어,타코와사비,성게알,아마에비,대포이까(대왕오징어),도마김치,새우치즈,생새우,가리비,키조개 등");

		List<String> menu2 = new ArrayList<String>(); // 덮밥
		menu2.add("스시안주방장 추천초밥 14점+샐러드+튀김   20,000원");
		menu2.add("[초밥선택가능]계란말이,광어,우럭,도미,한우,장어,참다랑어,눈다랑어,생연어,타코와사비,성게알,아마에비,대포이까(대왕오징어),도마김치,새우치즈,생새우,가리비,키조개 등");

		listDataChild.put(listDataHeader.get(0), menu1); // Header, Child data
		listDataChild.put(listDataHeader.get(1), menu2);

	}

}
