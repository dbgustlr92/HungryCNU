package example.hungrystudent2;


import java.util.*;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.*;


public class Pizza_3 extends Activity{
	ExpandableListAdapter listAdapter;
	ExpandableListView expListView;
	List<String> listDataHeader;
	HashMap<String, List<String>> listDataChild;

	protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pizza_3);
        ImageButton a = (ImageButton)findViewById(R.id.call_pizza3);

        a.setOnClickListener(new ImageButton.OnClickListener(){

			@Override
			public void onClick(View v) {
				startActivity(new Intent("android.intent.action.CALL",Uri.parse("tel:042-355-7440")));
				
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
		listDataHeader.add("�޺�");
		listDataHeader.add("��Ÿ");

		
		// Adding child data
		List<String> menu1 = new ArrayList<String>();	//����
		menu1.add("������������   22,900��");
		menu1.add("�ξ�BBQ����   22,900��");
		menu1.add("��������������   18,900��");
		menu1.add("�޺���̼�����   14,900��");
		menu1.add("ü��ġ������   14,900��");
		menu1.add("�Ұ������   14,900��");
		menu1.add("������������   14,900��");
		menu1.add("���۷δ�����   14,900��");
		menu1.add("��������   14,900��");
		menu1.add("�Ҽ�������   14,900��");
		menu1.add("�߽�ĭ����   14,900��");
		menu1.add("���ο�������   14,900��");
		menu1.add("�ſ�Ҵ�����   16,900��");
		menu1.add("������ü��ġ������   16,900��");
		menu1.add("�Ұ�������   18,900��");
		menu1.add("������������   18,900��");
		menu1.add("�һ�����   18,900��");
		menu1.add("�������������   20,900��");
		menu1.add("ġ��ŷ����   20,900��");
		menu1.add("��������(4������ ü��ġ��+���۷δ�+�Ұ��+�޺�)   18,900��");
		
		
		List<String> menu2 = new ArrayList<String>();	//�޺�
		menu2.add("BigStart �޺�(12��ġ����+��+�ٺ�ť��+��������)   23,000��");
		menu2.add("BigStart �޺�(18��ġ����+��+�ٺ�ť��+��������)   27,000��");


		List<String> menu3 = new ArrayList<String>();	//��Ÿ
		menu3.add("�ݶ�/���̴�   1,200��");
		menu3.add("�����Ķ���   3,500��");
		menu3.add("���ȷ���   3,500��");
		menu3.add("ġŲ�ٴ�   3,500��");
		menu3.add("ġ�ƽ   3,500��");

		
		
		
		
		listDataChild.put(listDataHeader.get(0), menu1); // Header, Child data
		listDataChild.put(listDataHeader.get(1), menu2);
		listDataChild.put(listDataHeader.get(2), menu3);

}
}
