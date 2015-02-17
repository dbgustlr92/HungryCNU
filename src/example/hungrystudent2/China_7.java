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

public class China_7 extends Activity {
	ExpandableListAdapter listAdapter;
	ExpandableListView expListView;
	List<String> listDataHeader;
	HashMap<String, List<String>> listDataChild;

	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.china_7);

		ImageButton a = (ImageButton) findViewById(R.id.call_chinese7);

		a.setOnClickListener(new ImageButton.OnClickListener() {
			@Override
			public void onClick(View v) {
				startActivity(new Intent("android.intent.action.CALL", Uri
						.parse("tel:042-384-3838")));
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
		listDataHeader.add("�ƹݼ� ��Ʈ�޴�");
		listDataHeader.add("�Ϲݼ�Ʈ�޴�");
		listDataHeader.add("�ҹ��޴�");
		listDataHeader.add("���");
		listDataHeader.add("���");
		listDataHeader.add("�丮��");
		listDataHeader.add("�ø�޴�");
						
		// Adding child data
		List<String> menu1 = new ArrayList<String>();
		menu1.add("Ȳ�����¥�� 6,500��");
		menu1.add("Ȳ���ع�«�� 7,500��");
		menu1.add("Ȳ��ȭ��Ʈ«�� 7,500��");
		menu1.add("Ȳ�ð�¥�� 7,500��");
		menu1.add("Ȳ�ú����쵿 8,000��");
		menu1.add("Ȳ�ñ�«�� 8,000��");
		menu1.add("Ȳ�ú����� 7,500��");
		menu1.add("Ȳ����ä�� 7,500��");
		menu1.add("Ȳ�ø��Ĺ� 8,000��");
		menu1.add("Ȳ�û��쵤�� 9,000��");
		menu1.add("Ȳ��¥��� 7,000��");
		menu1.add("Ȳ����ݿ��Ƕ��̽� 7,500��");
		menu1.add("Ȳ�ñ��� 6,500��");
		menu1.add("Ȳ�ÿ�¡��� 7,000��");
		menu1.add("Ȳ���������� 7,000��");
		menu1.add("Ȳ�þ���̵��� 7,000��");
		menu1.add("Ȳ�ü��ⵤ�� 7,500��");
		menu1.add("Ȳ���ع����� 10,000��");
		menu1.add("Ȳ�����꽽�� 12,000��");
		menu1.add("Ȳ�������� 13,000��");
		menu1.add("Ȳ�ð�����ä�� 12,000��");
		menu1.add("Ȳ�þ����� 30,000��");
		menu1.add("Ȳ���Ⱥ�ä 30,000��");
		menu1.add("Ȳ�ô����������� 25,000��");
		menu1.add("Ȳ�õ�������� ��:16,000��/��:21,000��/��:26,000��");
		menu1.add("Ȳ���ع���«�� 7,500��");
		menu1.add("Ȳ���ع��ÿ쵿 7,500��");
				
		List<String> menu2 = new ArrayList<String>();
		menu2.add("�̱�A.Ȳ�õ��������+Ȳ�����¥��1�� 14,000��");
		menu2.add("�̱�B.Ȳ�õ��������+Ȳ���ع�«��1�� 15,000��");
		menu2.add("1.Ȳ�õ��������+Ȳ�����¥��2�� 21,000��");
		menu2.add("2.Ȳ�õ��������+Ȳ���ع�«��2�� 22,000��");
		menu2.add("3.Ȳ�õ��������+Ȳ����ݺ�����2�� 22,000��");
		menu2.add("4.Ȳ�õ��������+Ȳ����ݺ����쵿2�� 23,000��");
				
		List<String> menu3 = new ArrayList<String>();
		menu3.add("�ƹݼ���������+�����2+���� 14,000��");
		menu3.add("�ƹݼ��ſ���ä����+�����2+���� 14,000��");
		menu3.add("�ƹݼ���¡��η�ġ��+�����2+���� 14,000��");
		menu3.add("�ƹݼ��ع�����+�����2+���� 14,000��");
						
		List<String> menu4 = new ArrayList<String>();
		menu4.add("�̱�A.���������+¥��1(«��1)����+������ 10,000��");
		menu4.add("�̱�B.���������+������1(«�͹�1)����+������ 11,000��");
		menu4.add("1.���������+¥��2(«��2)����+������ 15,000��");
		menu4.add("2.���������+������2(«�͹�2)����+������ 17,000��");
								
		List<String> menu5 = new ArrayList<String>();
		menu5.add("�ҹ�������� 6,000��");
		menu5.add("�ҹ�Ⱕ���� 6,000��");
		menu5.add("�ҹ����� 6,000��");
		menu5.add("�ҹ�ⶱ�� 6,000��");
		menu5.add("�ҹ�⸸�α� 6,000��");
		menu5.add("�ҹ��ո��α� 6,000��");
						
		List<String> menu6 = new ArrayList<String>();
		menu6.add("¥��� 4,500��");
		menu6.add("«�� 5,000��");
		menu6.add("��¥�� 5,000��");
		menu6.add("�쵿 5,500��");
		menu6.add("��� 6,000��");
		menu6.add("�߳�«�� 1��:7,000��");
		menu6.add("����¥�� 7,000��");
		menu6.add("�Ｑ��¥�� 7,000��");
		menu6.add("�Ｑ«�� 7,000��");
		menu6.add("�Ｑ�쵿 7,000��");
		menu6.add("�Ｑ��� 7,500��");
		menu6.add("��õ¥�� 7,500��");
		menu6.add("��õ���� 7,500��");
		menu6.add("����«�� 7,500��");
		menu6.add("�⽺�� 8,000��");
		menu6.add("������ 4,000��");
		menu6.add("������ 4,000��");
						
		List<String> menu7 = new ArrayList<String>();
		menu7.add("������ 5,500��");
		menu7.add("¥��� 5,500��");
		menu7.add("«�͹� 5,500��");
		menu7.add("��ġ���� 6,500��");
		menu7.add("��ä�� 7,000��");
		menu7.add("���Ƕ��̽� 7,000��");
		menu7.add("�Ｑ������ 7,000��");
		menu7.add("���캺���� 7,000��");
		menu7.add("���ĵκι� 7,500��");
		menu7.add("�Ｑ«�͹� 7,500��");
		menu7.add("����«���� 8,000��");
		menu7.add("���쵤�� 8,000��");
		menu7.add("������ä�� 11,000��");
		menu7.add("���꽽�� 11,000��");
		menu7.add("������ 12,000��");
						
		List<String> menu8 = new ArrayList<String>();
		menu8.add("��������� ��:15,000��/��:18,000��/��:22,000��");
		menu8.add("��õ������ 22,000��");
		menu8.add("������ä 25,000��");
		menu8.add("������ 25,000��");
		menu8.add("���ڿϽ� 25,000��");
		menu8.add("������ 25,000��");
		menu8.add("������ 25,000��");
		menu8.add("��ǳ�� 25,000��");
		menu8.add("��ǳ�� 25,000��");
		menu8.add("������ 25,000��");
		menu8.add("�Ⱥ�ä 30,000��");
		menu8.add("���꽽 30,000��");
		menu8.add("���� 30,000��");
		menu8.add("��ǳ��ä 50,000��");
		menu8.add("�ػ��� 50,000��");
		menu8.add("�ػ��꽺 50,000��");
		menu8.add("�ػﰥ�� 50,000��");
		menu8.add("������ 60,000��");
		menu8.add("������ 60,000��");
								
		List<String> menu9 = new ArrayList<String>();
		menu9.add("�ݹݳø� 7,000��");
		menu9.add("���� 6,000��");
		menu9.add("����ø� 6,500��");
		menu9.add("���ᱹ�� 6,000��");
		menu9.add("�ع����ø� 7,000��");
		menu9.add("�ع�����ø� 7,500��");
		menu9.add("�𸸵� 10��:5,5000��");
		menu9.add("1.���ø�2+�𸸵� 14,000��");
		menu9.add("2.����ø�2+�𸸵� 15,000��");
								
		listDataChild.put(listDataHeader.get(0), menu1); // Header, Child data
		listDataChild.put(listDataHeader.get(1), menu2);
		listDataChild.put(listDataHeader.get(2), menu3);
		listDataChild.put(listDataHeader.get(3), menu4);
		listDataChild.put(listDataHeader.get(4), menu5);
		listDataChild.put(listDataHeader.get(5), menu6);
		listDataChild.put(listDataHeader.get(6), menu7);
		listDataChild.put(listDataHeader.get(7), menu8);
		listDataChild.put(listDataHeader.get(8), menu9);
		
	}

	

}
