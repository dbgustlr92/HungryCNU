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

public class Chicken_7 extends Activity {

	ExpandableListAdapter listAdapter;
	ExpandableListView expListView;
	List<String> listDataHeader;
	HashMap<String, List<String>> listDataChild;

	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.chicken_7);
		ImageButton a = (ImageButton) findViewById(R.id.call_chicken7);

		a.setOnClickListener(new ImageButton.OnClickListener() {

			@Override
			public void onClick(View v) {
				startActivity(new Intent("android.intent.action.CALL", Uri
						.parse("tel:042-825-9635")));

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
		// listDataHeader.add("���� ġŲ");
		// listDataHeader.add("����");
		// listDataHeader.add("��Ʈ�޴�");

		// Adding child data
		List<String> top250 = new ArrayList<String>();
		top250.add("�Ķ��̵� 14,000��");
		top250.add("����������ġŲ 15,000��");
		top250.add("���� �Ķ��̵� 16,000��");
		top250.add("�ٴ���/����/���/����ġŲ  16,000��");
		top250.add("����(�⸷��/�ſ�/�Ұ��/����/����) 16,000��");
		top250.add("�⸷���Ĵ� Ų 17,000��");
		top250.add("�⸷�� ��ٷο� 17,000��");
		top250.add("�����̰���/��ǳ���� 17,000��");
		top250.add("�����(2������)��Ʈ  18,000��");
		top250.add("���������̾�������Ʈ 23,000��");

		/*
		 * List<String> nowShowing = new ArrayList<String>();
		 * 
		 * nowShowing.add("�����Ѹ��� �����Ĵ�  13,000��");
		 * nowShowing.add("���μ��� �θ���ġŲ  16,000��");
		 * nowShowing.add("����ġŲ  17,000��");
		 * nowShowing.add("����ġ��/�����Ĵ�  18,000��");
		 * 
		 * List<String> comingSoon = new ArrayList<String>();
		 * 
		 * comingSoon.add("��������/�������� 16,000��");
		 * comingSoon.add("ġ�����Ʈ����  18,000��"); List<String> abc = new
		 * ArrayList<String>();
		 * 
		 * abc.add("�ϳ�,���μ����Ķ��̵�+���챸�� 24,000��");
		 * abc.add("��, ���μ���(��伱��)+���챸��(��伱��) 26,000��");
		 * abc.add("��, ��Ͼ�ġŲ+����ġŲ 28,000��"); abc.add("��, ����&ġŲ+����ġŲ 28,000��");
		 */

		listDataChild.put(listDataHeader.get(0), top250); // Header, Child data
		// listDataChild.put(listDataHeader.get(1), nowShowing);
		// listDataChild.put(listDataHeader.get(2), comingSoon);
		// listDataChild.put(listDataHeader.get(3), abc);
	}

}
