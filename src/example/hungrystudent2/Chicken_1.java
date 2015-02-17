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
		listDataHeader.add("ġŲ");
		listDataHeader.add("���� ġŲ");
		listDataHeader.add("���� �� ��Ÿ");

		// Adding child data
		List<String> top250 = new ArrayList<String>();

		top250.add("��� ġŲ 15,000��");
		top250.add("�ٻ�Ŭ ġŲ 15,000��");
		top250.add("�Ķ��̵�+���� ġŲ 15,000��");
		top250.add("�ſ��� ġŲ 16,000��");
		top250.add("�Ѹ�Ŭ ġŲ 17,000��");
		top250.add("�����̾� �ٴ� �䷹�䷹ ġŲ 17,000��");
		top250.add("�Ѹ�Ŭ�� ġŲ 18,000��");
		top250.add("������ 1���� 18,000��");
		top250.add("������ �� �ڽ� ġŲ 18,000��");
		top250.add("�عٶ�� �Ķ��̵� ġŲ 19,000��");

		List<String> nowShowing = new ArrayList<String>();

		nowShowing.add("�츮�� ���� ġŲ 17,000��");
		nowShowing.add("�����Ķ��̵�+���� ġŲ 18,000��");
		nowShowing.add("���� �Ĵ� ġŲ 18,500��");

		List<String> comingSoon = new ArrayList<String>();

		comingSoon.add("��꽺��ũ(5��) 16,000��");
		comingSoon.add("ġŲ ���� 17,000��");
		comingSoon.add("����ġŲ/���� 18,000��");

		listDataChild.put(listDataHeader.get(0), top250); // Header, Child data
		listDataChild.put(listDataHeader.get(1), nowShowing);
		listDataChild.put(listDataHeader.get(2), comingSoon);
	}

}
