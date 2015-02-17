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

public class China_4 extends Activity {
	ExpandableListAdapter listAdapter;
	ExpandableListView expListView;
	List<String> listDataHeader;
	HashMap<String, List<String>> listDataChild;

	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.china_4);

		ImageButton a = (ImageButton) findViewById(R.id.call_chinese4);

		a.setOnClickListener(new ImageButton.OnClickListener() {
			@Override
			public void onClick(View v) {
				startActivity(new Intent("android.intent.action.CALL", Uri
						.parse("tel:042-822-9588")));
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
		listDataHeader.add("��ȣ�Ͷҹ��޴�");
		listDataHeader.add("������");
		listDataHeader.add("119�޴�");
		listDataHeader.add("�޴��Ұ�");
		listDataHeader.add("�Ÿ޴�");
		listDataHeader.add("���Ұ��+�ø鼼Ʈ");
		listDataHeader.add("���ϸ޴�");
		listDataHeader.add("�̱ۼ�Ʈ");
		listDataHeader.add("����ڽ�");
		listDataHeader.add("�������������Ʈ");
		listDataHeader.add("��õ��������Ʈ");
		listDataHeader.add("���");
		listDataHeader.add("���");
		listDataHeader.add("�丮��");
		listDataHeader.add("�� �׸��� �ΰ��� ��");
		
		// Adding child data
		List<String> menu1 = new ArrayList<String>();
		menu1.add("�Ｑ�ҹ������� 8,000��");
		menu1.add("�ҹ��¥�� 6,000��");
		menu1.add("�ҹ��«�� 6,500��");
		menu1.add("�ҹ�����«�� 8,000��");
		menu1.add("�ҹ���ع����� 8,000��");
		menu1.add("�ҹ���ع����� 8,000��");
		menu1.add("�ҹ�������� 7,000��");
		menu1.add("�ҹ�⼳���� 7,000��");
		menu1.add("�ҹ�Ⱕ���� 7,000��");
		menu1.add("�ҹ�⳻���� 7,000��");
		menu1.add("�ҹ�ⱼ«��(���������) 8,000��");
				
		List<String> menu2 = new ArrayList<String>();
		menu2.add("1.��������+�����2+���� 14,000��");
		menu2.add("2.��¡���+�����2+���� 14,000��");
		menu2.add("3.ȫ���ع�����+�����2+���� 14,000��");
				
		List<String> menu3 = new ArrayList<String>();
		menu3.add("119«�� 8,000��");
		menu3.add("119¥�� 7,500��");
						
		List<String> menu4 = new ArrayList<String>();
		menu4.add("���¥��(�����+����) 1��:7,000��/2��:14,000��");
		menu4.add("�߳�«��(�����+����) 1��:7,000��/2��:14,000��");
		menu4.add("����«�� 8,000��");
		menu4.add("�Ｑ«�� 8,000��");
		menu4.add("ȫ��«�� 8,000��");
		menu4.add("ȫ����«�� 8,000��");
		menu4.add("��«�� 8,000��");
				
		List<String> menu5 = new ArrayList<String>();
		menu5.add("���Һ����� 8,000��");
		menu5.add("������ä�� 8,000��");
		menu5.add("���ҵ��� 8,000��");
				
		List<String> menu6 = new ArrayList<String>();
		menu6.add("���ø�+���Ұ�� 8,000��");
		menu6.add("����ø�+���Ұ�� 8,000��");
		menu6.add("��«��+���Ұ�� 8,000��");
		menu6.add("�ÿ쵿+���Ұ�� 8,000��");
		menu6.add("�и�+���Ұ�� 8,000��");
				
		List<String> menu7 = new ArrayList<String>();
		menu7.add("(��)�ҹ�������� 6,000��");
		menu7.add("(ȭ)�߳�«�� 6,000��");
		menu7.add("(��)�������� 6,000��");
		menu7.add("(��)�ҹ���ع����� 6,000��");
		menu7.add("(��)��ä�� 6,000��");
				
		List<String> menu8 = new ArrayList<String>();
		menu8.add("1.���������+¥��� 10,000��");
		menu8.add("2.���������+«�� 11,000��");
		menu8.add("3.���������+������or«�͹� 12,000��");
		menu8.add("4.���������+���¥��or�߳�«�� 13,000��");
						
		List<String> menu9 = new ArrayList<String>();
		menu9.add("A.���������2��+���¥��2��or�߳�«��2�� 20,000��");
		menu9.add("B.��õ������2��+���¥��2��or�߳�«��2�� 21,000��");
						
		List<String> menu10 = new ArrayList<String>();
		menu10.add("1.���������+¥��+���� 15,000��");
		menu10.add("2.���������+¥��1+«��1+���� 16,000��");
		menu10.add("3.���������+«��2+���� 17,000��");
		menu10.add("4.���������+¥��3 20,000��");
		menu10.add("5.���������+¥��2+«��1 21,000��");
		menu10.add("6.���������+¥��1+«��2 22,000��");
		menu10.add("7.���������+«��3 23,000��");
				
		List<String> menu11 = new ArrayList<String>();
		menu11.add("1.��õ������+¥��2 17,000��");
		menu11.add("2.��õ������+¥��1+«��1 18,000��");
		menu11.add("3.��õ������+«��2 19,000��");
		menu11.add("4.��õ������+¥��3 22,000��");
		menu11.add("5.��õ������+¥��2+«��1 23,000��");
		menu11.add("6.��õ������+¥��1+«��2 24,000��");
		menu11.add("7.��õ������+«��3 25,000��");
				
		List<String> menu12 = new ArrayList<String>();
		menu12.add("¥��� 4,500��");
		menu12.add("«�� 5,000��");
		menu12.add("��¥�� 5,000��");
		menu12.add("�쵿 5,500��");
		menu12.add("��� 5,500��");
		menu12.add("�Ｑ��¥�� 7,500��");
		menu12.add("�Ｑ«�� 8,000��");
		menu12.add("�Ｑ�쵿 8,000��");
		menu12.add("�Ｑ��� 8,000��");
		menu12.add("�⽺�� 8,000��");
				
		List<String> menu13 = new ArrayList<String>();
		menu13.add("������ 5,500��");
		menu13.add("���Ƕ��̽� 6,000��");
		menu13.add("�߳�«�͹� 7,500��");
		menu13.add("�������� 7,000��");
		menu13.add("��¡��� 7,000��");
		menu13.add("��ġ������ 7,000��");
		menu13.add("��ä�� 7,000��");
		menu13.add("�������� 7,000��");
		menu13.add("�Ｑ������ 8,000��");
		menu13.add("���캺���� 8,000��");
		menu13.add("���̵��� 8,000��");
		menu13.add("������ä�� 10,000��");
		menu13.add("������ 10,000��");
		menu13.add("���꽽�� 10,000��");
		
		List<String> menu14 = new ArrayList<String>();
		menu14.add("������ ��:15,000��/��:18,000��/��:23,000��");
		menu14.add("��õ������ ��:17,000��/��:20,000��/��:25,000��");
		menu14.add("��ä 15,000��");
		menu14.add("���ĵκ� 15,000��");
		menu14.add("������ 25,000��");
		menu14.add("������ 25,000��");
		menu14.add("��ǳ�� 25,000��");
		menu14.add("��ǳ�� 25,000��");
		menu14.add("�Ⱥ�ä 25,000��");
		menu14.add("���꽽 25,000��");
		menu14.add("������ 25,000��");
		menu14.add("������ä 25,000��");
		menu14.add("���ڿϽ� 25,000��");
		menu14.add("��ǳ���� 25,000��");
		menu14.add("������ 25,000��");
		
		List<String> menu15 = new ArrayList<String>();
		menu15.add("«¥�� 6,000��");
		menu15.add("��¥�� 6,500��");
		menu15.add("��«�� 6,500��");
		menu15.add("��¥�� 7,000��");
		menu15.add("��«�� 7,000��");
		menu15.add("������ 7,500��");
		
		listDataChild.put(listDataHeader.get(0), menu1); // Header, Child data
		listDataChild.put(listDataHeader.get(1), menu2);
		listDataChild.put(listDataHeader.get(2), menu3);
		listDataChild.put(listDataHeader.get(3), menu4);
		listDataChild.put(listDataHeader.get(4), menu5);
		listDataChild.put(listDataHeader.get(5), menu6);
		listDataChild.put(listDataHeader.get(6), menu7);
		listDataChild.put(listDataHeader.get(7), menu8);
		listDataChild.put(listDataHeader.get(8), menu9);
		listDataChild.put(listDataHeader.get(9), menu10);
		listDataChild.put(listDataHeader.get(10), menu11);
		listDataChild.put(listDataHeader.get(11), menu12);	
		listDataChild.put(listDataHeader.get(12), menu13);
		listDataChild.put(listDataHeader.get(13), menu14);
		listDataChild.put(listDataHeader.get(14), menu15);
	}

	

}
