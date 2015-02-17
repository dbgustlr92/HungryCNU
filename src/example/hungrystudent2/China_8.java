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

public class China_8 extends Activity {
	ExpandableListAdapter listAdapter;
	ExpandableListView expListView;
	List<String> listDataHeader;
	HashMap<String, List<String>> listDataChild;

	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.china_8);

		ImageButton a = (ImageButton) findViewById(R.id.call_chinese8);

		a.setOnClickListener(new ImageButton.OnClickListener() {
			@Override
			public void onClick(View v) {
				startActivity(new Intent("android.intent.action.CALL", Uri
						.parse("tel:042-825-2033")));
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
		listDataHeader.add("��������");
		listDataHeader.add("�޴��Ұ�1");
		listDataHeader.add("¥�������");
		listDataHeader.add("�̱ۼ�Ʈ");
		listDataHeader.add("��¥�弼Ʈ");
		listDataHeader.add("��������Ʈ");
		listDataHeader.add("�����似Ʈ");
		listDataHeader.add("�����ڽ�");
		listDataHeader.add("�ݹݸ޴�");
		listDataHeader.add("�丮��Ʈ");
		listDataHeader.add("�޴��Ұ�2");
		listDataHeader.add("���");
		listDataHeader.add("���");
		listDataHeader.add("�丮��");
						
		// Adding child data
		List<String> menu1 = new ArrayList<String>();
		menu1.add("�ո��� 5��:5,000��");
						
		List<String> menu2 = new ArrayList<String>();
		menu2.add("�ҹ�������«�� 7,000��");
		menu2.add("�ҹ��¥�� 5,500��");
		menu2.add("�ҹ��«�� 6,000��");
		menu2.add("�ҹ�������� 6,500��");
		menu2.add("�ҹ�Ⱕ���� 6,500��");
		menu2.add("�ҹ�⼳���� 6,500��");
		menu2.add("�ҹ�⳻���� 6,500��");
		menu2.add("�����Ｑ�ſ�«�� 8,000��");
		menu2.add("119��«�� 7,000��");
		menu2.add("����«�� 7,000��");		
		menu2.add("�Ｑ«�� 7,000��");
		menu2.add("�˱���«�� 7,000��");		
		menu2.add("��«�� 7,000��");
		menu2.add("ȫ��«�� 7,000��");
				
		List<String> menu3 = new ArrayList<String>();
		menu3.add("�ع����¥�� 1��:7,000��/2��:13,000��/3��:19,000��");
		menu3.add("�ع��߳�«�� 1��:7,000��/2��:13,000��/3��:19,000��");
						
		List<String> menu4 = new ArrayList<String>();
		menu4.add("1.������+¥��1or«��1+���� 10,000��");
		menu4.add("2.������+������1or«�͹�1+���� 11,000��");
		menu4.add("3.������+�ҹ��¥��1or�ҹ��«��1+���� 12,000��");
										
		List<String> menu5 = new ArrayList<String>();
		menu5.add("A.������+��¥��2+���� 17,000��");
		menu5.add("B.������(��)+��¥��3+���� 22,000��");
		menu5.add("C.������(��)+��¥��4+���� 27,000��");
						
		List<String> menu6 = new ArrayList<String>();
		menu6.add("A.������+¥��2+���� 15,000��");
		menu6.add("B.������+¥��1+«��1+���� 16,000��");
		menu6.add("C.������+«��2+���� 17,000��");
		menu6.add("D.������(��)+¥��3or«��3+���� 21,000��");
		menu6.add("E.������or�Ⱥ�ä+������+���� 33,000��");
								
		List<String> menu7 = new ArrayList<String>();
		menu7.add("A.������+������2+���� 19,000��");
		menu7.add("B.������(��)+������3+���� 24,000��");
		menu7.add("C.������(��)+������4+���� 29,000��");
								
		List<String> menu8 = new ArrayList<String>();
		menu8.add("1.��õ������+�Ｑ���¥��(2��)+«�ͱ��� 25,000��");
		menu8.add("2.������+�Ｑ���¥��(2��)+«�ͱ��� 27,000��");
		menu8.add("3.�Ⱥ�ä+�Ｑ���¥��(2��)+«�ͱ��� 27,000��");
		menu8.add("4.������+�Ｑ���¥��(2��)+«�ͱ��� 27,000��");
		menu8.add("5.��ǳ��+�Ｑ���¥��(2��)+«�ͱ��� 27,000��");
		menu8.add("6.���꽽+�Ｑ���¥��(2��)+«�ͱ��� 27,000��");
		
		List<String> menu9 = new ArrayList<String>();
		menu9.add("«¥�� 5,500��");
		menu9.add("��¥�� 6,000��");
		menu9.add("��«�� 6,000��");
		menu9.add("��¥�� 6,500��");
		menu9.add("��«�� 6,500��");
		menu9.add("������ 7,000��");
		
		List<String> menu10 = new ArrayList<String>();
		menu10.add("A.������+�Ⱥ�ä+������ 55,500��");
		menu10.add("B.���꽽+������+��ǳ�� 55,500��");
		menu10.add("C.���꽽+������+������ä 55,500��");
		menu10.add("D.���꽽+�Ⱥ�ä+������ä 55,500��");
		
		List<String> menu11 = new ArrayList<String>();
		menu11.add("��������+�����2+���� 14,000��");
		menu11.add("��¡���+�����2+���� 14,000��");
		menu11.add("��������+�����2+���� 14,000��");
		menu11.add("�Ұ�⺺��+�����2+���� 14,000��");
		
		List<String> menu12 = new ArrayList<String>();
		menu12.add("¥��� 4,500��");
		menu12.add("«�� 5,000��");
		menu12.add("�쵿 5,500��");
		menu12.add("��¥�� 5,000��");
		menu12.add("��� 5,500��");
		menu12.add("�Ｑ¥�� 6,500��");
		menu12.add("����¥�� 6,500��");
		menu12.add("��õ¥�� 6,500��");
		menu12.add("��«�� 7,000��");
		menu12.add("����«�� 7,000��");
		menu12.add("�Ｑ«�� 7,000��");
		menu12.add("�Ｑ�쵿 7,000��");
		menu12.add("�Ｑ��� 7,000��");
		menu12.add("�⽺��(2���̻�) 7,000��");
		menu12.add("������ 4,000��");
		menu12.add("������ 4,000��");
		
		List<String> menu13 = new ArrayList<String>();
		menu13.add("������ 5,500��");
		menu13.add("¥��� 5,500��");
		menu13.add("«�͹� 5,500��");
		menu13.add("��ä�� 6,500��");
		menu13.add("���Ƕ��̽� 6,500��");
		menu13.add("�������� 6,500��");
		menu13.add("��¡��� 6,500��");
		menu13.add("���̵��� 7,000��");
		menu13.add("���ⵤ�� 6,500��");
		menu13.add("�Ｑ������ 7,000��");
		menu13.add("���캺���� 7,000��");
		menu13.add("�Ｑ«�͹� 7,500��");
		menu13.add("������ä�� 10,000��");
		menu13.add("������ 10,000��");
		menu13.add("���꽽�� 10,000��");
		
		List<String> menu14 = new ArrayList<String>();
		menu14.add("������ ��:15,000��/��:18,000��/��:22,000��");
		menu14.add("��õ������ 20,000��");
		menu14.add("�Ｑ«�ͱ��� 10,000��");
		menu14.add("����� 15,000��");
		menu14.add("��ä 15,000��");
		menu14.add("���Ѷ� 15,000��");
		menu14.add("���ĵκ� 15,000��");
		menu14.add("������ ��:20,000��/��:25,000��/��:30,000��");
		menu14.add("�Ⱥ�ä ��:20,000��/��:25,000��/��:30,000��");
		menu14.add("��ǳ�� ��:20,000��/��:25,000��/��:30,000��");
		menu14.add("��ǳ�� ��:20,000��/��:25,000��/��:30,000��");
		menu14.add("������ ��:20,000��/��:25,000��/��:30,000��");
		menu14.add("������ ��:20,000��/��:25,000��/��:30,000��");
		menu14.add("���ڿϽ� ��:20,000��/��:25,000��/��:30,000��");
		menu14.add("���� ��:20,000��/��:25,000��/��:30,000��");
		menu14.add("������ä ��:20,000��/��:25,000��/��:30,000��");
		menu14.add("���꽽 ��:20,000��/��:25,000��/��:30,000��");
		menu14.add("��ǳ���� ��:20,000��/��:25,000��/��:30,000��");
		menu14.add("������ ��:25,000��/��:30,000��");
		menu14.add("�ػ��� 40,000��");
								
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
		
	}

	

}
