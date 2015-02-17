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

public class Chicken_10 extends Activity {

	ExpandableListAdapter listAdapter;
	ExpandableListView expListView;
	List<String> listDataHeader;
	HashMap<String, List<String>> listDataChild;

	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.chicken_10);
		ImageButton a = (ImageButton) findViewById(R.id.call_chicken10);

		a.setOnClickListener(new ImageButton.OnClickListener() {

			@Override
			public void onClick(View v) {
				startActivity(new Intent("android.intent.action.CALL", Uri
						.parse("tel:042-825-7289")));

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
		listDataHeader.add("�Ѹ��� ġŲ");
		listDataHeader.add("�θ��� ġŲ");
		listDataHeader.add("������ ġŲ");

		// Adding child data
		List<String> top250 = new ArrayList<String>();

		top250.add("�������/Ŀ���� 13,000��");
		top250.add("�Ұ��ҽ�/ġ��ӽ�/������ 13,000��");
		top250.add("��ū���/ũ���ӽ�/�ֵ����ҽ� 13,000��");
		top250.add("�����Ķ��̵�/���޾��/���ð��� 13,000��");

		List<String> nowShowing = new ArrayList<String>();

		nowShowing.add("ġ��ӽ�+�ֵ����ҽ�/����+ũ���ӽ� 17,000��");
		nowShowing.add("ũ���ӽ�+�ֵ���/���޾��+ġ��ӽ� 17,000��");
		nowShowing.add("���޾��+���ð���/���޾��+ũ���ӽ� 17,000��");

		List<String> comingSoon = new ArrayList<String>();

		comingSoon.add("���+����+ġ�� 24,000��");
		comingSoon.add("���+ġ��+�ֵ��� 24,000��");
		comingSoon.add("���޾��+����+ũ�� 24,000��");
		comingSoon.add("���+�Ķ��̵�+ũ��  24,000��");

		listDataChild.put(listDataHeader.get(0), top250); // Header, Child data
		listDataChild.put(listDataHeader.get(1), nowShowing);
		listDataChild.put(listDataHeader.get(2), comingSoon);
	}

}
