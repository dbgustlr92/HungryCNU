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

public class Chicken_18 extends Activity {

	ExpandableListAdapter listAdapter;
	ExpandableListView expListView;
	List<String> listDataHeader;
	HashMap<String, List<String>> listDataChild;

	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.chicken_18);
		ImageButton a = (ImageButton) findViewById(R.id.call_chicken18);

		a.setOnClickListener(new ImageButton.OnClickListener() {

			@Override
			public void onClick(View v) {
				startActivity(new Intent("android.intent.action.CALL", Uri
						.parse("tel:042-861-4479")));

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

		// Adding child data
		List<String> top250 = new ArrayList<String>();
		
		top250.add("�������  14,000��");
		top250.add("�Ķ��̵�(���ϵ�+��) 15,000��");
		top250.add("���ġŲ 16,000��");
		top250.add("����/�Ķ��̵�� 16,000��");
		top250.add("�Ĵ�(�ſ��/���Ѹ�) 16,000��");
		top250.add("���� 17,000��");
		top250.add("��ŷ�־��ġŲ/���� 17,000��");
		top250.add("������Ż�Ĵ�/��帵���Ĵ� 17,000��");
		top250.add("�ߴٸ�/�ٸ���+������/�߳��� 17,000��");
		top250.add("�׳׸���ġŲ/������(ġ��/��ä) 17,000��");
		top250.add("�׳׼���߰��� 18,000��");
		top250.add("��������+���� 18,000��");
		top250.add("�������ݹ�(��ä+ġ��) 18,000��");
		top250.add("�Ĵ�����(�ſ��/���Ѹ�) 18,000��");
		top250.add("��������+��ŷ�ֹ� 19,000��");
		top250.add("�׳�������ġŲ 20,000��");

		listDataChild.put(listDataHeader.get(0), top250); // Header, Child data

	}

}
