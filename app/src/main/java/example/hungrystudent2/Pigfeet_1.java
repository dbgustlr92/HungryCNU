package example.hungrystudent2;

import java.util.*;

import android.app.*;
import android.content.*;
import android.net.*;
import android.os.*;
import android.view.*;
import android.widget.*;

public class Pigfeet_1 extends Activity{
/*	ExpandableListAdapter listAdapter;
	ExpandableListView expListView;
	List<String> listDataHeader;
	HashMap<String, List<String>> listDataChild;

	protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pigfeet_1);
        ImageButton a = (ImageButton)findViewById(R.id.call_pigfeet1);

        a.setOnClickListener(new ImageButton.OnClickListener(){

			@Override
			public void onClick(View v) {
				startActivity(new Intent("android.intent.action.CALL",Uri.parse("tel:042-824-1688")));
				
			}
        	
        });
        expListView = (ExpandableListView) findViewById(R.id.lvExp);

		// preparing list data
		prepareListData();

		listAdapter = new ExpandableListAdapter(this, listDataHeader,listDataChild);

		// setting list adapter
		expListView.setAdapter(listAdapter);
		
	}*/
	ExpandableListAdapter listAdapter;
	ExpandableListView expListView;
	List<String> listDataHeader;
	HashMap<String, List<String>> listDataChild;

	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.pigfeet_1);

		ImageButton a = (ImageButton) findViewById(R.id.call_pigfeet1);

		a.setOnClickListener(new ImageButton.OnClickListener() {
			@Override
			public void onClick(View v) {
				startActivity(new Intent("android.intent.action.CALL", Uri
						.parse("tel:042-824-1688")));
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
		listDataHeader.add("����");
		listDataHeader.add("����");
		listDataHeader.add("����� ��뼼Ʈ(���� �ݶ���)");
		listDataHeader.add("�߰��޴�");

		// Adding child data
		List<String> top250 = new ArrayList<String>();
		top250.add("�������� �˶㼼Ʈ �           21,000��");
		top250.add("�������� �˶㼼Ʈ ��           26,000��");
		top250.add("�������� �˶㼼Ʈ ��           31,000��");
		top250.add("�������� �˶㼼Ʈ Ư��        36,000��");
		top250.add("�������� �                24,000��");
		top250.add("�������� ��                28,000��");
		top250.add("�������� ��                34,000��");
		top250.add("�������� Ư��             39,000��");
		top250.add("��������    34,000��");
		top250.add("��ä����    34,000��");

		List<String> nowShowing = new ArrayList<String>();
		nowShowing.add("���ٺ��� �                24,000��");
		nowShowing.add("���ٺ��� ��                29,000��");
		nowShowing.add("���ٺ��� ��                34,000��");
		nowShowing.add("���ٺ��� Ư��             39,000��");

		List<String> comingSoon = new ArrayList<String>();
		comingSoon.add("����� ��Ҽ�Ʈ �(����� + �����)   46,000��");
		comingSoon.add("����� ��Ҽ�Ʈ ��(������ + ������)   56,000��");
		comingSoon.add("����� ��Ҽ�Ʈ ��(������ + ������)   66,000��");
		comingSoon.add("Ŀ�ü�Ʈ 	34,000��");

		
		List<String> lastMenu = new ArrayList<String>();
		lastMenu.add("��ݱ�����           13,000��");
		lastMenu.add("��ݱ�����           10,000��");
		lastMenu.add("��ݱ���	1��       4,000��");
		lastMenu.add("�����ڿ���  3,000��");
		lastMenu.add("�ݶ��   1,000��");
		lastMenu.add("�ݶ���   2,000��");
		lastMenu.add("�����   1,000��");
		lastMenu.add("�ӱ�ġ   2,000��");
		
		
		listDataChild.put(listDataHeader.get(0), top250); // Header, Child data
		listDataChild.put(listDataHeader.get(1), nowShowing);
		listDataChild.put(listDataHeader.get(2), comingSoon);
		listDataChild.put(listDataHeader.get(3), lastMenu);
	}

}
