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

public class China_1 extends Activity {
	ExpandableListAdapter listAdapter;
	ExpandableListView expListView;
	List<String> listDataHeader;
	HashMap<String, List<String>> listDataChild;

	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.china_1);

		ImageButton a = (ImageButton) findViewById(R.id.call_chinese1);

		a.setOnClickListener(new ImageButton.OnClickListener() {
			@Override
			public void onClick(View v) {
				startActivity(new Intent("android.intent.action.CALL", Uri
						.parse("tel:042-826-1363")));
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
		listDataHeader.add("���");
		listDataHeader.add("���");
		listDataHeader.add("�丮��");
		listDataHeader.add("�ݹݸ޴�");
		listDataHeader.add("�丮��Ʈ");
		listDataHeader.add("���Ϲ�");
		listDataHeader.add("�Ÿ޴�");
		listDataHeader.add("����ڽ�");
		listDataHeader.add("�̱��ڽ�");
		listDataHeader.add("�˶㼼Ʈ");
		listDataHeader.add("�ڽ�1");
		listDataHeader.add("�ڽ�2");
		listDataHeader.add("�ڽ�3");
		listDataHeader.add("�ڽ�4");
		listDataHeader.add("�ҹ��޴�");
		listDataHeader.add("�Ŵ����ø���");
		listDataHeader.add("��Ÿ��Ʈ");

		// Adding child data
		List<String> menu1 = new ArrayList<String>();
		menu1.add("¥��� 4,500��");
		menu1.add("«�� 5,000��");
		menu1.add("��¥�� 5,000��");
		menu1.add("�쵿 5,500��");
		menu1.add("��� 5,500��");
		menu1.add("���¥�� 6,000��");
		menu1.add("�߳�«�� 6,000��");
		menu1.add("�꼱��¥�� 6,500��");
		menu1.add("�Ｑ�쵿 7,000��");
		menu1.add("�Ｑ��� 7,000��");
		menu1.add("�⽺�� 7,000��");
		menu1.add("�����̹���«�� 7,000��");

		List<String> menu2 = new ArrayList<String>();
		menu2.add("������ 5,500��");
		menu2.add("�������� 6,000��");
		menu2.add("��¡��� 6,000��");
		menu2.add("��ġ������ 6,000��");
		menu2.add("��ġ���� 6,000��");
		menu2.add("��ä�� 6,000��");
		menu2.add("�������� 6,000��");
		menu2.add("�Ｑ������ 7,000��");
		menu2.add("���캺���� 7,000��");
		menu2.add("���̵��� 7,000��");
		menu2.add("������ä�� 9,000��");
		menu2.add("������ 9,000��");
		menu2.add("���꽽�� 9,000��");

		List<String> menu3 = new ArrayList<String>();
		menu3.add("������ 14,000��");
		menu3.add("��ä 15,000��");
		menu3.add("���ĵκ� 15,000��");
		menu3.add("��õ������ 16,000��");
		menu3.add("��Ÿ�������� 16,000��");
		menu3.add("������ 25,000��");
		menu3.add("������ 25,000��");
		menu3.add("��ǳ�� 25,000��");
		menu3.add("��ǳ�� 25,000��");
		menu3.add("�Ⱥ�ä 25,000��");
		menu3.add("���꽽 25,000��");
		menu3.add("������ 25,000��");
		menu3.add("������ä 25,000��");
		menu3.add("���ڿϽ� 25,000��");
		menu3.add("��ǳ���� 25,000��");
		menu3.add("������ 25,000��");		
		
		List<String> menu4 = new ArrayList<String>();
		menu4.add("«¥�� 5,500��");
		menu4.add("��¥�� 6,000��");
		menu4.add("��«�� 6,000��");
		menu4.add("��¥�� 6,500��");
		menu4.add("��«�� 6,500��");
		menu4.add("������ 7,000��");
		
		List<String> menu5 = new ArrayList<String>();
		menu5.add("�丮����(�Ⱥ�ä/������/������ ��1)+¥��or«��2+���� 25,000��");
		menu5.add("�丮����(�Ⱥ�ä/������/������ ��1)+¥��or«��3+���� 28,000��");
		menu5.add("�丮����(�Ⱥ�ä/������/������ ��1)+���¥��or�߳�«��2��+���� 29,000��");
		
		List<String> menu6 = new ArrayList<String>();
		menu6.add("(��)������ 5,500��");
		menu6.add("(ȭ)�Ｑ�ع����� 5,500��");
		menu6.add("(��)�Ｑ������ 5,500��");
		menu6.add("(��)��ⵤ�� 5,500��");
		menu6.add("(��)��ä�� 5,500��");
		
		List<String> menu7 = new ArrayList<String>();
		menu7.add("���Һ����� 7,000��");
		menu7.add("���ҵ��� 7,000��");
		menu7.add("������ä�� 7,000��");
		
		List<String> menu8 = new ArrayList<String>();
		menu8.add("���������+���¥��or�߳�«��2�� 19,000��");
		menu8.add("��õ������+���¥��or�߳�«��2�� 21,000��");	
		
		List<String> menu9 = new ArrayList<String>();
		menu9.add("���������+¥���or«�� 10,000��");
		menu9.add("���������+������or«�͹� 11,000��");
		menu9.add("���������+���¥��or�߳�«��1 12,000��");
		menu9.add("���������+�ҹ��޴� ��1 13,000��");
		
		List<String> menu10 = new ArrayList<String>();
		menu10.add("���������+¥��2or«��2 14,000��");
		
		List<String> menu11 = new ArrayList<String>();
		menu11.add("(���/��õ)������or��ǳ��+¥��or«��2 16,000��");
		
		List<String> menu12 = new ArrayList<String>();
		menu12.add("(���/��õ)������or��ǳ��+¥��or«��3 20,000��");
		
		List<String> menu13 = new ArrayList<String>();
		menu13.add("���������+������or�Ⱥ�ä 30,000��");
		
		List<String> menu14 = new ArrayList<String>();
		menu14.add("���������+�丮�� 2������(���������/��ǳ��/������/��õ������/�Ⱥ�ä) 45,000��");
		
		List<String> menu15 = new ArrayList<String>();
		menu15.add("�ҹ��¥�� 5,500��");
		menu15.add("�ҹ��«�� 6,000��");
		menu15.add("�ҹ�������� 6,000��");
		menu15.add("�ҹ����뱹 6,000��");
		menu15.add("�ҹ�Ⱕ���� 6,000��");
		menu15.add("�ҹ�⳻���� 6,000��");
		menu15.add("�ҹ�ⱹ�� 6,000��");
		menu15.add("�ҹ���������� 6,000��");
		menu15.add("�ҹ���¡��� 6,000��");
		menu15.add("�ҹ������� 7,000��");
		menu15.add("�ҹ�����«�� 7,000��");
		menu15.add("�ҹ��ȫ���� 7,000��");
		menu15.add("�ҹ�ⱼ«�� 7,000��");
		menu15.add("�ҹ��Ұ�� 7,000��");
		menu15.add("�ҹ���ع����� 7,000��");
		
		List<String> menu16 = new ArrayList<String>();
		menu16.add("�Ŵ���¥�� 7,000��");
		menu16.add("�Ŵ���«�� 7,000��");
		menu16.add("�Ŵ��������� 7,000��");
		menu16.add("�Ŵ�����«�� 7,000��");
		menu16.add("�Ŵ���ȫ��«�� 7,000��");
		
		List<String> menu17 = new ArrayList<String>();
		menu17.add("��¡��η�ġ��+�����2+«�ͱ��� 13,000��");
		menu17.add("�����η�ġ��+�����2+«�ͱ��� 13,000��");
		menu17.add("�ſ��ع�����+«�ͱ��� 13,000��");
		

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
		listDataChild.put(listDataHeader.get(15), menu16);
		listDataChild.put(listDataHeader.get(16), menu17);		
	}

	

}
