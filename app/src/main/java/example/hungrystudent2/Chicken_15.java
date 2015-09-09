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
		listDataHeader.add("ġŲ");
		listDataHeader.add("���� ��Ʈ");
		listDataHeader.add("�� ġŲ ��Ʈ");

		// Adding child data
		List<String> top250 = new ArrayList<String>();

		top250.add("�Ѹ���ġŲ/�����Ķ��̵� 14,000��");
		top250.add("ġ��ġŲ 15,000��");
		top250.add("��/���� �Ѹ��� �ﱹ�� 15,000��");
		top250.add("���� �θ��� �ﱹ�� 18,000��");
		top250.add("���� ������ �ﱹ��  24,000��");
		top250.add("���� �׸��� �ﱹ��  31,000��");
		top250.add("�� �θ��� �ﱹ�� 22,000��");
		
		List<String> nowShowing = new ArrayList<String>();

		nowShowing.add("����SET1 �Ķ��̵�+�Ķ��̵� 16,000��");
		nowShowing.add("����SET2 �Ķ��̵�+��� 17,000��");
		nowShowing.add("����SET3 �Ķ��̵�+���� 17,000��");
		nowShowing.add("����SET4 ���+���� 18,000��");
		nowShowing.add("����SET5 �����Ķ��̵�+��� 17,000��");
		nowShowing.add("����SET6 �����Ķ��̵�+���� 17,000��");

		List<String> comingSoon = new ArrayList<String>();

		comingSoon.add("��SET1 �Ķ��̵�+�Ķ��̵� 20,000��");
		comingSoon.add("��SET2 �Ķ��̵�+��� 21,000��");
		comingSoon.add("��SET3 �Ķ��̵�+���� 21,000��");
		comingSoon.add("��SET4 ����+��� 22,000��");

		listDataChild.put(listDataHeader.get(0), top250); // Header, Child data
		listDataChild.put(listDataHeader.get(1), nowShowing);
		listDataChild.put(listDataHeader.get(2), comingSoon);
	}

}
