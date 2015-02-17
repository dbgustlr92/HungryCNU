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
		listDataHeader.add("ġŲ");

		// Adding child data
		List<String> top250 = new ArrayList<String>();

		top250.add("��������ٺ�ť 16,000��");
		top250.add("Į������Ķ��̵�ġŲ 16,000��");
		top250.add("�Ķ��̵�/�����Ķ��̵�ġŲ  16,000��");
		top250.add("�������Ķ��̵�ġŲ/�����Ķ��̵�ġŲ 16,000��");
		top250.add("ũ������ġŲ  17,000��");
		top250.add("����/���� �ٺ�ť  17,000��");
		top250.add("��������/����Ʈ/�� 17,000��");
		top250.add("����ũ������ġŲ 18,000��");
		top250.add("����ũ������ũ�� 18,000��");
		top250.add("������ũ������ũ�� 18,000��");
		top250.add("Į�����ũ������ġŲ 18,000��");
		top250.add("���� ���� �ٺ�ť 21,000��");
		top250.add("���� ġ� �ٺ�ť 21,000��");

		listDataChild.put(listDataHeader.get(0), top250); // Header, Child data

	}

}
