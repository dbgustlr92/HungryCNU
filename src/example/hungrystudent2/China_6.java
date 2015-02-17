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

public class China_6 extends Activity {
	ExpandableListAdapter listAdapter;
	ExpandableListView expListView;
	List<String> listDataHeader;
	HashMap<String, List<String>> listDataChild;

	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.china_6);

		ImageButton a = (ImageButton) findViewById(R.id.call_chinese6);

		a.setOnClickListener(new ImageButton.OnClickListener() {
			@Override
			public void onClick(View v) {
				startActivity(new Intent("android.intent.action.CALL", Uri
						.parse("tel:042-825-8715")));
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
		listDataHeader.add("�޴��Ұ�");
		listDataHeader.add("������ ��������Ʈ");
		listDataHeader.add("�ҹ��޴�");
		listDataHeader.add("�޴��Ұ�");
		listDataHeader.add("�ݹݸ޴�");
		listDataHeader.add("�丮������� ���μ�Ʈ");
		listDataHeader.add("������ �ٸ� ������ �ڽ�");
		listDataHeader.add("��Ǯ�̸޴�");
		listDataHeader.add("�����̺���");
		listDataHeader.add("���");
		listDataHeader.add("���");
		listDataHeader.add("�丮��");
						
		// Adding child data
		List<String> menu1 = new ArrayList<String>();
		menu1.add("��«��(����«��) 7,000��");
		menu1.add("ȫ��«�� 6,500��");
				
		List<String> menu2 = new ArrayList<String>();
		menu2.add("�ַ�.������+(«��1or¥��1) 10,000��");
		menu2.add("A.������+¥��2+���� 14,000��");
		menu2.add("A-1.������+«��2+���� 15,000��");
		menu2.add("B.������+(«��3or¥��3) 19,000��");
		menu2.add("C.(��õ������or�ſ�������)+(«��2or¥��2)+���� 17,000��");
		menu2.add("D.(��õ������or�ſ�������)+(«��3or¥��3)+���� 21,000��");
		menu2.add("E.������+(�Ｑ�ع����«��2��or�Ｑ�ع����¥��2��)+���� 20,000��");
		menu2.add("F.������+(������2or«�͹�2or¥���2)+���� 18,000��");
		menu2.add("E.������(��)+(«��5or¥��5)+���� 30,000��");
				
		List<String> menu3 = new ArrayList<String>();
		menu3.add("�ҹ�⵷«�� 6,500��");
		menu3.add("�ҹ�������«�� 7,000��");
		menu3.add("�ҹ��Ұ�� 6,500��");
		menu3.add("�ҹ���ġ�������� 7,000��");
		menu3.add("�ҹ��¥�� 5,500��");
		menu3.add("�ҹ��«�� 6,000��");
		menu3.add("�ҹ�ⱼ«�� 7,000��");
		menu3.add("�ҹ�����«�� 7,000��");
		menu3.add("�ҹ�������� 6,000��");
		menu3.add("�ҹ����α��� 6,000��");
		menu3.add("�ҹ�Ⱕ���� 6,000��");
		menu3.add("�ҹ����� 6,000��");
		menu3.add("�ҹ�⳻���� 6,000��");
		menu3.add("�ҹ���ع����� 7,000��");
		menu3.add("�ҹ���¡��� 6,500��");
						
		List<String> menu4 = new ArrayList<String>();
		menu4.add("�ַι似Ʈ(������+������1or¥���1or«�͹�1or������1or����1) 11,500��");
		menu4.add("�Ｑ�ع����¥�� 1��:6,500��");
		menu4.add("�Ｑ�ع����«�� 1��:6,500��");
								
		List<String> menu5 = new ArrayList<String>();
		menu5.add("«¥�� 5,5000��");
		menu5.add("��¥�� 6,000��");
		menu5.add("��«�� 6,000��");
		menu5.add("��¥�� 6,500��");
		menu5.add("��«�� 6,500��");
		menu5.add("������ 7,000��");
						
		List<String> menu6 = new ArrayList<String>();
		menu6.add("�丮(������/�Ⱥ�ä/��ǳ��/���꽽/������ä/������/��ǳ���� ��1)+(¥��2or«��2or������2or¥���2or«�͹�2) 25,000��(��� ���ý� 3,000���߰�)");
						
		List<String> menu7 = new ArrayList<String>();
		menu7.add("������A.������+���꽽+������+�Ļ�3��(¥��,«�� ����) 50,000��");
		menu7.add("������A.����+������+������ä+�Ļ�4��(¥��,«�� ����) 80,000��");
		menu7.add("������A.2������ä+���꽽+������+�Ļ�5��(¥��,«�� ����) 80,000��");
		menu7.add("������A.3������ä+������+��ǳ��+������ä+�Ļ�6��(¥��,«�� ����) 110,000��");
						
		List<String> menu8 = new ArrayList<String>();
		menu8.add("����«�� 7,000��");
		menu8.add("����«�� 7,000��");
		menu8.add("����¥�� 7,000��");
								
		List<String> menu9 = new ArrayList<String>();
		menu9.add("ȫ����«�� 7,000��");
		menu9.add("ȫ��«�� 6,500��");
		menu9.add("�ſ��ع������� 7,000��");
								
		List<String> menu10 = new ArrayList<String>();
		menu10.add("¥��� 4,500��");
		menu10.add("«�� 5,000��");
		menu10.add("�쵿 5,500��");
		menu10.add("��¥�� 5,500��");
		menu10.add("��� 5,500��");
		menu10.add("�Ｑ¥�� 6,500��");
		menu10.add("�Ｑ«�� 7,000��");
		menu10.add("�Ｑ�쵿 7,000��");
		menu10.add("�Ｑ��� 7,000��");
		menu10.add("����¥�� 7,000��");
		menu10.add("��õ¥�� 7,000��");
		menu10.add("�Ｑ���������� 8,000��");
		menu10.add("�Ｑ���¥�� 2��:12,000��");
		menu10.add("�Ｑ���«�� 2��:12,000��");
		menu10.add("������ 4,000��");
		menu10.add("������ 4,000��");
						
		List<String> menu11 = new ArrayList<String>();
		menu11.add("������ 5,500��");
		menu11.add("¥��� 6,000��");
		menu11.add("«�͹� 6,000��");
		menu11.add("��ä�� 6,000��");
		menu11.add("����̵��� 7,000��");
		menu11.add("�Ｑ������ 7,000��");
		menu11.add("���캺���� 7,000��");
		menu11.add("������Ư�� 7,000��");
		menu11.add("���꽽�� 9,000��");
		menu11.add("������ä�� 9,000��");
		menu11.add("������ 9,000��");
		menu11.add("�ո��� 5��:5,000��");
		menu11.add("�ҹ�⸸�α�(��������) 6,000��");
						
		List<String> menu12 = new ArrayList<String>();
		menu12.add("������ ��:14,000��/��:17,000��/��:20,000��");
		menu12.add("��õ������ ��:17,000��/��:19,000��/��:22,000��");
		menu12.add("�ſ������� ��:17,000��/��:19,000��/��:22,000��");
		menu12.add("������ ��:25,000��/��:30,000��");
		menu12.add("���ڿϽ� ��:25,000��/��:30,000��");
		menu12.add("�Ⱥ�ä ��:25,000��/��:30,000��");
		menu12.add("���꽽 ��:25,000��/��:30,000��");
		menu12.add("��ǳ�� ��:25,000��/��:30,000��");
		menu12.add("������ ��:25,000��/��:30,000��");
		menu12.add("��ǳ���� ��:25,000��/��:30,000��");
		menu12.add("������ ��:25,000��/��:30,000��");
		menu12.add("������ ��:25,000��/��:30,000��");
				
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
	}

	

}
