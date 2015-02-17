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

public class China_5 extends Activity {
	ExpandableListAdapter listAdapter;
	ExpandableListView expListView;
	List<String> listDataHeader;
	HashMap<String, List<String>> listDataChild;

	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.china_5);

		ImageButton a = (ImageButton) findViewById(R.id.call_chinese5);

		a.setOnClickListener(new ImageButton.OnClickListener() {
			@Override
			public void onClick(View v) {
				startActivity(new Intent("android.intent.action.CALL", Uri
						.parse("tel:042-825-0999")));
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
		listDataHeader.add("�ҹ��޴�");
		listDataHeader.add("�ΰ����޴�");
		listDataHeader.add("��ݸ޴�");
		listDataHeader.add("�԰��� ��������");
		listDataHeader.add("�԰��� �η�ġ��");
		listDataHeader.add("NEW �ſ�޴�");
		listDataHeader.add("Ŀ���ڽ�");
		listDataHeader.add("�Ǽ��ڽ�");
		listDataHeader.add("�丮�ڽ�");
		listDataHeader.add("���ڽ�");
		listDataHeader.add("�̱��ڽ�");
		listDataHeader.add("������Ʈ�޴�");
		listDataHeader.add("���Ϻ� ���θ޴�");
				
		// Adding child data
		List<String> menu1 = new ArrayList<String>();
		menu1.add("�ҹ��¥�� 5,500��");
		menu1.add("�ҹ��«�� 5,500��");
		menu1.add("�ҹ�����«�� 6,000��");
		menu1.add("�ҹ�ⱼ«�� 6,500��");
		menu1.add("�ҹ���ع����� 6,500��");
		menu1.add("�ҹ�⼳���� 6,000��");
		menu1.add("�ҹ������Ұ�ⵤ�� 6,500��");
		menu1.add("�ҹ���ع����� 6,500��");
		menu1.add("�ҹ����� 6,000��");
		menu1.add("�ҹ�⳻���� 6,000��");
		menu1.add("�ҹ�Ⱕ���� 6,000��");
		menu1.add("�ҹ���¡��� 5,500��");
		menu1.add("�ҹ���������� 5,500��");
		menu1.add("�ҹ�������� 5,500��");
				
		List<String> menu2 = new ArrayList<String>();
		menu2.add("«¥�� 5,000��");
		menu2.add("��¥�� 5,500��");
		menu2.add("��«�� 5,500��");
		menu2.add("��¥�� 6,000��");
		menu2.add("��«�� 6,000��");
		menu2.add("������ 6,500��");
				
		List<String> menu3 = new ArrayList<String>();
		menu3.add("���¥��(2��)+����� 12,000��");
		menu3.add("�߳�«��(2��)+����� 12,000��");
						
		List<String> menu4 = new ArrayList<String>();
		menu4.add("���ø� 4,500��");
		menu4.add("����ø� 5,000��");
		menu4.add("�ᱹ�� 4,500��");
		menu4.add("�ո���(4��) 4,000��");
						
		List<String> menu5 = new ArrayList<String>();
		menu5.add("��¡��η�ġ��+�����2+���� 12,000��");
		menu5.add("�����η�ġ��+�����2+���� 12,000��");
						
		List<String> menu6 = new ArrayList<String>();
		menu6.add("�ſ�¥�� 5,500��");
		menu6.add("�ſ�«�� 6,000��");
		menu6.add("�ſ���� 6,500��");
		menu6.add("�ſ���ä�� 7,000��");
		menu6.add("�ſ�쵿 6,000��");
		menu6.add("�ſ��� 6,000��");
		menu6.add("�ſ¥�� 6,000��");
		menu6.add("�ſ�Ｑ¥�� 7,000��");
		menu6.add("�ſ�Ｑ«�� 7,000��");
		menu6.add("�ſ����¥��(2��) 13,000��");
		menu6.add("�ſ����«��(2��) 13,000��");
				
		List<String> menu7 = new ArrayList<String>();
		menu7.add("C1.����������+¥��2(«��2)+���� 13,000��");
		menu7.add("C2.�ſ���������(ĥ��������)+¥��2(«��2)+���� 15,000��");
		menu7.add("C3.����������+������2(«�͹�2)+���� 16,000��");
		menu7.add("C5.����������+���¥��2(�߳�«��2)+���� 16,000��");
						
		List<String> menu8 = new ArrayList<String>();
		menu8.add("1.����������+¥��3(«��3)+���� 17,000��");
		menu8.add("2-A.�ſ���������(ĥ��������)+¥��3(«��3) 18,000��");
		menu8.add("3.����������+������3(«�͹�3)+���� 22,000��");
		menu8.add("4.����������+¥��4(«��4)+���� 22,000��");
						
		List<String> menu9 = new ArrayList<String>();
		menu9.add("A.��ǳ��+¥��2(«��2) 20,000��");
		menu9.add("B.������+¥��2(«��2) 20,000��");
		menu9.add("C.��ǳ����+¥��2(«��2) 20,000��");
		menu9.add("B.ĥ������+¥��2(«��2) 20,000��");
		menu9.add("B.���꽽+¥��2(«��2) 20,000��");
						
		List<String> menu10 = new ArrayList<String>();
		menu10.add("��1.������2��+¥��5+���� 32,000��");
		menu10.add("��2.������2��+¥��6+���� 35,000��");
						
		List<String> menu11 = new ArrayList<String>();
		menu11.add("����������+¥��(«��) 9,000��");
		menu11.add("����������+������ 11,000��");
		menu11.add("����������+���¥��1(�߳�«��1) 11,000��");
						
		List<String> menu12 = new ArrayList<String>();
		menu12.add("��ƮA.���ø�2+�ո���(4��) 11,000��");
		menu12.add("��ƮB.���ø�1+����ø�1+�ո���(4��) 12,000��");
		menu12.add("��ƮC.����ø�2+�ո���(4��) 13,000��");
				
		List<String> menu13 = new ArrayList<String>();
		menu13.add("��.��ä�� 5,000��");
		menu13.add("ȭ.�ع������� 5,000��");
		menu13.add("��.���¥�� 5,000��");
		menu13.add("��.���캺���� 5,000��");
		menu13.add("��.�߳�«�� 5,000��");
		menu13.add("��.��¡��� 5,000��");
		menu13.add("��.�������� 5,000��");
					
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
