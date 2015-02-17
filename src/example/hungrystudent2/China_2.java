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

public class China_2 extends Activity {
	ExpandableListAdapter listAdapter;
	ExpandableListView expListView;
	List<String> listDataHeader;
	HashMap<String, List<String>> listDataChild;

	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.china_2);

		ImageButton a = (ImageButton) findViewById(R.id.call_chinese2);

		a.setOnClickListener(new ImageButton.OnClickListener() {
			@Override
			public void onClick(View v) {
				startActivity(new Intent("android.intent.action.CALL", Uri
						.parse("tel:042-822-4193")));
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
		listDataHeader.add("�Ÿ޴�");
		listDataHeader.add("��õ�޴�");
		listDataHeader.add("��������");
		listDataHeader.add("�޴��Ұ�1");
		listDataHeader.add("��Ʈ�޴�");
		listDataHeader.add("�̱۸޴�");
		listDataHeader.add("�޴��Ұ�2");
		listDataHeader.add("���");
		listDataHeader.add("���");
		listDataHeader.add("�丮��");
		listDataHeader.add("�ݹݸ޴�");
		
		// Adding child data
		List<String> menu1 = new ArrayList<String>();
		menu1.add("������«�� 7,000��");
		menu1.add("�Ｑ����«�� 10,000��");
		menu1.add("��ġ������ 6,500��");
		menu1.add("�ɽ������� 7,000��");
		menu1.add("�Ｑ�ع����� 8,000��");
		
		List<String> menu2 = new ArrayList<String>();
		menu2.add("������ 25,000��");
		menu2.add("���Ҽ���¥�� 7,000��");
		menu2.add("���Ҽ���«�� 8,000��");
		menu2.add("���Ҽ������Ƕ��̽� 8,000��");
		menu2.add("���Ҽ�����ä�� 8,000��");
		menu2.add("���Ҽ������¥�� 1��:8,000��/2��:16,000��");
		menu2.add("���Ҽ������«�� 1��:8,000��/2��:16,000��");
		menu2.add("������ä�� 8,000��");
		menu2.add("���Һ����� 8,000��");
		menu2.add("�������¥�� 1��:8,000��/2��:16,000��");
		menu2.add("�������«�� 2��:16,000��");
		menu2.add("��ȭ����� 7,000��");
		menu2.add("���«�� 8,000��");
		menu2.add("Ƣ��쵿 8,000��");

		List<String> menu3 = new ArrayList<String>();
		menu3.add("������ 9,000��");
		menu3.add("���쵿 9,000��");
		menu3.add("��«�� 9,000��");
		menu3.add("���ſ��� 9,000��");
				
		List<String> menu4 = new ArrayList<String>();
		menu4.add("�ҹ���ᳪ��«�� 8,000��");
		menu4.add("�ҹ��ȫ���� 8,000��");
		menu4.add("�ҹ����«�� 8,000��");
		menu4.add("�ҹ�����«�� 8,000��");
		menu4.add("�ҹ�������«�� 8,000��");
		menu4.add("�ҹ��ȫ����«�� 8,000��");
		menu4.add("�ҹ��ȫ��«�� 8,000��");
		menu4.add("�ҹ��¥�� 6,000��");
		menu4.add("�ҹ����¥�� 7,000��");
		menu4.add("��õ¥�� 7,000��");
		menu4.add("����¥�� 7,000��");
		menu4.add("����¥�� 7,000��");
		menu4.add("�ո��α� 6,000��");
		menu4.add("���α� 6,000��");
		menu4.add("���� 6,000��");
		menu4.add("�����α� 6,000��");
		menu4.add("�ո��� 6��:5,000��");
		menu4.add("�ҹ��«�� 6,500��");
		menu4.add("�ҹ��ſ����� 8,000��");
		menu4.add("�ҹ���ع��� 8,000��");
		menu4.add("�ҹ�ⱼ«�� 8,000��");
		menu4.add("�ҹ���ġ���� 7,500��");
		menu4.add("�ҹ���ع����� 8,000��");
		menu4.add("�ҹ���������� 7,000��");
		menu4.add("�ҹ���¡��� 7,000��");
		menu4.add("�ҹ����̵��� 7,000��");
		menu4.add("�ҹ��ҺҰ�ⵤ�� 7,000��");
		menu4.add("�ҹ�ⱹ�� 7,000��");
		menu4.add("�ҹ�������� 7,000��");
		menu4.add("�ҹ�Ⱕ���� 7,000��");
		menu4.add("�ҹ�⳻���� 7,000��");
		menu4.add("�ҹ����� 7,000��");
		
		List<String> menu5 = new ArrayList<String>();
		menu5.add("��ƮA(������+¥��2+����) 15,000��");
		menu5.add("��ƮA-1(������+¥��1+«��1+����) 16,000��");
		menu5.add("��ƮA-2(������+«��2+����) 17,000��");
		menu5.add("��ƮA-3(������+������2or«�͹�2+����) 19,000��");
		menu5.add("��ƮB(������+¥��3+����) 20,000��");
		menu5.add("��ƮB-1(������+¥��2+«��1+����) 21,000��");
		menu5.add("��ƮB-2(������+¥��1+«��2+����) 22,000��");
		menu5.add("��ƮB-3(������+«��3+����) 23,000��");
		menu5.add("��ƮC(������+���¥��2��or���«��2��+����) 20,000��");
		menu5.add("��ƮC-1(��õ������+���¥��2��or���«��2��+����) 22,000��");
		menu5.add("��ƮD(��������+¥��or«�� ����4+����) 35,000��");
		menu5.add("��ƮD-1(��������+������or«�͹�or¥��or«�� ����5+����) 40,000��");
		
		List<String> menu6 = new ArrayList<String>();
		menu6.add("��.������+¥��1 10,000��");
		menu6.add("��.������+«��1 11,000��");
		menu6.add("��.������+������1or«�͹�1 12,000��");
		menu6.add("��.������+���¥��1��or���«��1�� 13,000��");
		menu6.add("��.������+�ҹ��¥��1��or�ҹ��«��1�� 13,000��");
		
		List<String> menu7 = new ArrayList<String>();
		menu7.add("1.�����η�ġ��+�����2+���� 14,000��");
		menu7.add("2.��¡��η�ġ��+�����2+���� 14,000��");
		menu7.add("3.��ä����+�����2+���� 14,000��");
		menu7.add("4.���ĵκ�+�����2+���� 14,000��");
		
		List<String> menu8 = new ArrayList<String>();
		menu8.add("¥��� 4,500��");
		menu8.add("«�� 5,000��");
		menu8.add("��¥�� 5,000��");
		menu8.add("�쵿 5,500��");
		menu8.add("��� 5,500��");
		menu8.add("�Ｑ¥�� 7,000��");
		menu8.add("�Ｑ«�� 8,000��");
		menu8.add("�Ｑ�쵿 8,000��");
		menu8.add("�⽺�� 8,000��");
		menu8.add("��¥�� 7,000��");
		menu8.add("��«�� 8,000��");
		menu8.add("�ع����¥�� 1��:7,000��/2��:14,000��");
		menu8.add("�ع����«�� 1��:7,000��/2��:14,000��");
		
		List<String> menu9 = new ArrayList<String>();
		menu9.add("������ 5,500��");
		menu9.add("¥��� 5,500��");
		menu9.add("«�͹� 6,000��");
		menu9.add("��¥��� 6,000��");
		menu9.add("���Ƕ��̽� 6,000��");
		menu9.add("��ä�� 6,500��");
		menu9.add("�Ｑ������ 7,000��");
		menu9.add("���캺���� 7,000��");
		menu9.add("���ĵκι� 7,000��");
		menu9.add("�߳�«�͹� 7,000��");
		menu9.add("�Ｑ«�͹� 8,000��");
		menu9.add("����«�͹� 8,000��");
		menu9.add("��«�͹� 8,000��");
		menu9.add("���꽽�� 10,000��");
		menu9.add("������ä�� 10,000��");
		menu9.add("������ 10,000��");
		
		List<String> menu10 = new ArrayList<String>();
		menu10.add("������ ��:15,000��/��:18,000��/��:21,000��");
		menu10.add("��õ������ 18,000��");
		menu10.add("����� 10,000��");
		menu10.add("�Ｑ�� 10,000��");
		menu10.add("��ä 14,000��");
		menu10.add("������ ��:25,000��/��:30,000��");
		menu10.add("���꽽 ��:25,000��/��:30,000��");
		menu10.add("�Ⱥ�ä ��:25,000��/��:30,000��");
		menu10.add("��ǳ�� ��:25,000��/��:30,000��");
		menu10.add("��ǳ�� ��:25,000��/��:30,000��");
		menu10.add("������ ��:25,000��/��:30,000��");
		menu10.add("������ä ��:25,000��/��:30,000��");
		menu10.add("��ǳ���� ��:25,000��/��:30,000��");
		menu10.add("������ ��:25,000��/��:30,000��");
		menu10.add("ĥ������ ��:25,000��/��:30,000��");
		menu10.add("�ػ��� 40,000��");
		menu10.add("������ 40,000��");
		
		List<String> menu11 = new ArrayList<String>();
		menu11.add("«¥�� 6,000��");
		menu11.add("��¥�� 6,500��");
		menu11.add("��«�� 6,500��");
		menu11.add("��¥�� 7,000��");
		menu11.add("��«�� 7,000��");
		menu11.add("������ 7,000��");
		
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
	}

	

}
