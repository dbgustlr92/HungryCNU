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

public class China_3 extends Activity {
	ExpandableListAdapter listAdapter;
	ExpandableListView expListView;
	List<String> listDataHeader;
	HashMap<String, List<String>> listDataChild;

	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.china_3);

		ImageButton a = (ImageButton) findViewById(R.id.call_chinese3);

		a.setOnClickListener(new ImageButton.OnClickListener() {
			@Override
			public void onClick(View v) {
				startActivity(new Intent("android.intent.action.CALL", Uri
						.parse("tel:042-824-5671")));
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
		listDataHeader.add("�ֹ��� ��õ����");
		listDataHeader.add("��õ����");
		listDataHeader.add("�����ڽ�");
		listDataHeader.add("�̱��ڽ�");
		listDataHeader.add("��������");
		listDataHeader.add("������Ʈ�޴�");
		listDataHeader.add("�ΰ����޴��� ���ÿ�");
		listDataHeader.add("���ϸ޴�");
		listDataHeader.add("�ҹ�� ���伣");
		listDataHeader.add("�丮�ڽ�");
		listDataHeader.add("���");
		listDataHeader.add("���");
		listDataHeader.add("�丮��");
		
		// Adding child data
		List<String> menu1 = new ArrayList<String>();
		menu1.add("�Ｑ�ع����¥�� 2��:13,000��");
		menu1.add("�Ｑ�ع��߳�«�� 2��:13,000��");
				
		List<String> menu2 = new ArrayList<String>();
		menu2.add("ȫ����«�� 7,000��");
		menu2.add("�ᳪ��������«�� 7,000��");
		menu2.add("�ع���ū��«�� 7,000��");
		menu2.add("û�����«�� 7,000��");
		
		List<String> menu3 = new ArrayList<String>();
		menu3.add("1.������+¥��2(«������ �ֹ��� 1,000�� �߰�) 14,000��");
		menu3.add("2.������+������2or«�͹�2 16,000��");
		menu3.add("3.������+¥��3or«��3+���� 20,000��");
		menu3.add("4.������+�ع����¥��2��or�ع��߳�«��2�� 20,000��");
		menu3.add("5.������+¥��4or«��4+���� 23,000��");
		menu3.add("6.������+¥��5or«��5+���� 27,000��");
				
		List<String> menu4 = new ArrayList<String>();
		menu4.add("1.������+¥��1or«��1 10,000��");
		menu4.add("2.������+������1or«�͹�1 11,000��");
		menu4.add("3.������+�Ｑ���¥��1��or�Ｑ�߳�«��1�� 12,000��");
				
		List<String> menu5 = new ArrayList<String>();
		menu5.add("����+����� 5,500��");
		menu5.add("���α�+����� 5,500��");
		menu5.add("�����α�+����� 5,500��");
				
		List<String> menu6 = new ArrayList<String>();
		menu6.add("��������+�����2+����+����5�� 13,000��");
		menu6.add("��¡���+�����2+����+����5�� 13,000��");
		menu6.add("���ĵκ�+�����2+����+����5�� 13,000��");
				
		List<String> menu7 = new ArrayList<String>();
		menu7.add("«¥�� 5,500��");
		menu7.add("��¥�� 6,000��");
		menu7.add("��«�� 6,000��");
		menu7.add("��¥�� 6,500��");
		menu7.add("��«�� 6,500��");
		menu7.add("������ 7,000��");
		
		List<String> menu8 = new ArrayList<String>();
		menu8.add("(��)û�ط�Ư�� 5,500��");
		menu8.add("(ȭ)�Ｑ������ 5,500��");
		menu8.add("(��)������ 5,500��");
		menu8.add("(��)��ä�� 5,500��");
		menu8.add("(��)�������� 5,500��");
				
		List<String> menu9 = new ArrayList<String>();
		menu9.add("�ҹ���ع�¥�� 5,500��");
		menu9.add("�ҹ���ع�«�� 6,000��");
		menu9.add("�ҹ�����«�� 7,000��");
		menu9.add("�ҹ�ⱼ«�� 7,000��");
		menu9.add("�ҹ�������� 6,000��");
		menu9.add("�ҹ�Ⱕ���� 6,000��");
		menu9.add("�ҹ�⳻���� 6,000��");
		menu9.add("�ҹ�⼳���� 6,000��");
		menu9.add("�ҹ���������� 6,000��");
		menu9.add("�ҹ���¡��� 6,000��");
		menu9.add("�ҹ��Ұ�ⵤ�� 7,000��");
				
		List<String> menu10 = new ArrayList<String>();
		menu10.add("1.������+¥��2or«��2 25,000��");
		menu10.add("2.�Ⱥ�ä+���¥��2or�߳�«��2 28,000��");
		menu10.add("3.�丮��2����+¥��3or«��3 50,000��");
				
		List<String> menu11 = new ArrayList<String>();
		menu11.add("¥��� 4,500��");
		menu11.add("�ع�ȫ��«�� 5,000��");
		menu11.add("��¥�� 5,000��");
		menu11.add("�쵿 5,000��");
		menu11.add("��� 5,000��");
		menu11.add("û�����«�� 7,000��");
		menu11.add("��õ���� 7,000��");
		menu11.add("�Ｑ¥�� 6,000��");
		menu11.add("�Ｑ«�� 7,000��");
		menu11.add("�Ｑ��� 7,000��");
		menu11.add("�Ｑ�쵿 7,000��");
		menu11.add("�Ｑ���������� 9,000��");
		menu11.add("�Ｑ�������� 9,000��");
		
		List<String> menu12 = new ArrayList<String>();
		menu12.add("¥��� 5,500��");
		menu12.add("«�͹� 5,500��");
		menu12.add("������ 5,500��");
		menu12.add("���Ƕ��̽� 6,000��");
		menu12.add("��ä�� 6,000��");
		menu12.add("���̵��� 7,000��");
		menu12.add("���캺���� 6,500��");
		menu12.add("�Ｑ������ 6,500��");
		menu12.add("�߳��� 6,500��");
		menu12.add("û�ط�Ư�� 9,000��");
		menu12.add("���꽽�� 9,000��");
		menu12.add("������ä�� 9,000��");
		menu12.add("������ 9,000��");
		menu12.add("�Ұ����̵��� 9,000��");
		
		List<String> menu13 = new ArrayList<String>();
		menu13.add("������ ��:15,000��/��:18,000��/��:21,000��");
		menu13.add("��õ������ ��:17,000��/��:21,000��/��:24,000��");
		menu13.add("������ 25,000��");
		menu13.add("���꽽 25,000��");
		menu13.add("�Ⱥ�ä 25,000��");
		menu13.add("���� 25,000��");
		menu13.add("��ǳ�� 25,000��");
		menu13.add("��ǳ�� 25,000��");
		menu13.add("������ 25,000��");
		menu13.add("������ 25,000��");
		menu13.add("������ 25,000��");
		menu13.add("��ǳ���� 25,000��");
		menu13.add("���ڿϽ� 25,000��");
		menu13.add("������ä 25,000��");
		
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
	}

	

}
