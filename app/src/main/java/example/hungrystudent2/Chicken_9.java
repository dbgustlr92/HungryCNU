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
		listDataHeader.add("ġŲ");
		listDataHeader.add("���� ġŲ");
		listDataHeader.add("ġŲ ��Ʈ");

		// Adding child data
		List<String> top250 = new ArrayList<String>();

		top250.add("���������Ķ��̵� 12,000��");
		top250.add("�����̽�/���ϵ�ġŲ 13,000��");
		top250.add("�����������/����ġŲ 13,000��");
		top250.add("EQ���/���ð���ġŲ 14,000��");
		top250.add("�ſ�EQ���ġŲ 15,000��");
		top250.add("�Ҵ߹ٺ�ť/���ʰ���/ġ����ŷ 16,000��");
		top250.add("�Ķ��̵�+��� 17,000��");
		top250.add("�Ķ��̵�+���� 17,000��");
		top250.add("���+����  18,000��");

		List<String> nowShowing = new ArrayList<String>();

		nowShowing.add("�����Ĵ� 13,500��");
		nowShowing.add("�����Ĵ߾��/����  14,500��");
		nowShowing.add("�����Ĵ߸ſ���  15,500��");
		nowShowing.add("����A(�����Ĵ�+���)/����B(�����Ĵ�+����) 18,000��");
		nowShowing.add("����C(���+����) 19,000��");
		nowShowing.add("����D(���+����) 20,000��");

		List<String> comingSoon = new ArrayList<String>();

		comingSoon.add("SET 1 �����̽�+EQ��� 18,000��");
		comingSoon.add("SET 2 �����̽�+���ð��� 18,000��");
		comingSoon.add("SET 3 �����̽�+�Ҵ߹ٺ�ť 22,000��");
		comingSoon.add("SET 4 EQ���+���ð���  19,000��");
		comingSoon.add("SET 5 �ſ�EQ���+���ð���  20,000��");

		listDataChild.put(listDataHeader.get(0), top250); // Header, Child data
		listDataChild.put(listDataHeader.get(1), nowShowing);
		listDataChild.put(listDataHeader.get(2), comingSoon);

	}

}
