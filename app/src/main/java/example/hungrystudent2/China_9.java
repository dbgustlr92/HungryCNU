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

public class China_9 extends Activity {
	ExpandableListAdapter listAdapter;
	ExpandableListView expListView;
	List<String> listDataHeader;
	HashMap<String, List<String>> listDataChild;

	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.china_9);

		ImageButton a = (ImageButton) findViewById(R.id.call_chinese9);

		a.setOnClickListener(new ImageButton.OnClickListener() {
			@Override
			public void onClick(View v) {
				startActivity(new Intent("android.intent.action.CALL", Uri
						.parse("tel:042-862-9292")));
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
		listDataHeader.add("�պ񼺿丮");
								
		// Adding child data
		List<String> menu1 = new ArrayList<String>();
		menu1.add("¥��� 4,000��");
		menu1.add("«�� 4,500��");
		menu1.add("��¥�� 4,500��");
		menu1.add("�쵿 4,500��");
		menu1.add("��� 4,500��");
		menu1.add("�⽺�� 6,000��");
		menu1.add("�Ｑ¥�� 6,500��");
		menu1.add("�Ｑ�쵿 6,500��");
		menu1.add("�Ｑ«�� 6,500��");
		menu1.add("�Ｑ��� 6,500��");
		menu1.add("����¥�� 6,500��");
		menu1.add("���¥�� 5,500��");
		menu1.add("�߳�«�� 6,500��");
						
		List<String> menu2 = new ArrayList<String>();
		menu2.add("������ 5,000��");
		menu2.add("¥��� 5,000��");
		menu2.add("«�͹� 5,000��");
		menu2.add("��ä�� 6,000��");
		menu2.add("�Ｑ������ 6,500��");
		menu2.add("���캺���� 6,500��");
		menu2.add("���̵��� 6,500��");
		menu2.add("���꽽�� 11,000��");
		menu2.add("������ä�� 11,000��");
		menu2.add("������ 11,000��");		
		menu2.add("������ 3,000��");
		menu2.add("������ 4,000��");		
				
		List<String> menu3 = new ArrayList<String>();
		menu3.add("������ 14,000��");
		menu3.add("���Ѷ� 14,000��");
		menu3.add("��ä 14,000��");
		menu3.add("���ĵκ� 14,000��");
		menu3.add("��õ������ 20,000��");
		menu3.add("���������� 22,000��");
		menu3.add("������ 22,000��");
		menu3.add("��ǳ�� 22,000��");
		menu3.add("���� 22,000��");
		menu3.add("������ 22,000��");
		menu3.add("���ڿϽ� 22,000��");
		menu3.add("������ 22,000��");
		menu3.add("����Ƣ�� 22,000��");
		menu3.add("������ä 25,000��");
		menu3.add("�Ⱥ�ä 25,000��");
		menu3.add("���꽽 25,000��");
		menu3.add("������ 25,000��");
		menu3.add("��ǳ���� 25,000��");
		menu3.add("�ҷ��Ͻ� 30,000��");
		menu3.add("��ǰ�Ͻ� 35,000��");
		menu3.add("�Ի켡���� 35,000��");
		menu3.add("���������� 35,000��");
		menu3.add("�ػ��꽺 35,000��");
		menu3.add("�ػﰥ�� 35,000��");
		menu3.add("�߰����̺��� 50,000��");
		menu3.add("ū���츶�üҽ� 8��������:50,000��");
		menu3.add("������ 55,000��");
						
		listDataChild.put(listDataHeader.get(0), menu1); // Header, Child data
		listDataChild.put(listDataHeader.get(1), menu2);
		listDataChild.put(listDataHeader.get(2), menu3);		
	}

	

}
