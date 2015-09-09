package example.hungrystudent2;

import java.util.*;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.*;


public class Pizza_4 extends Activity {
	ExpandableListAdapter listAdapter;
	ExpandableListView expListView;
	List<String> listDataHeader;
	HashMap<String, List<String>> listDataChild;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.pizza_4);
		
		ImageButton a = (ImageButton)findViewById(R.id.call_pizza4);

        a.setOnClickListener(new ImageButton.OnClickListener(){

			@Override
			public void onClick(View v) {
				startActivity(new Intent("android.intent.action.CALL",Uri.parse("tel:042-824-8210")));
				
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
		listDataHeader.add("��ũ�� ����");
		listDataHeader.add("�����̾� ���ַ�");
		listDataHeader.add("�����̾� ����");
		listDataHeader.add("����Ʈ ����");
		listDataHeader.add("�� ����");
		listDataHeader.add("��� ����");
		listDataHeader.add("���� ����");
		listDataHeader.add("���� ��Ʈ");
		listDataHeader.add("���İ�Ƽ");
		listDataHeader.add("���̵�޴�");

		// Adding child data
		List<String> menu1 = new ArrayList<String>();	//��ũ������
		menu1.add("�����޺���̼�����   10,000��");
		menu1.add("��Ż����ġ������   9,000��");
		menu1.add("��ä����   9,000��");
		menu1.add("���ķδ�����   10,000��");
		menu1.add("�Ұ������   11,000��");
		menu1.add("��������   11,000��");
		menu1.add("������������   11,000��");
		
		
		List<String> menu2 = new ArrayList<String>();	//�����̾� ���ַ�
		menu2.add("���� ī�Ϲ� ����+�ݶ�(500ml)   R:17,000��");
		menu2.add("��� ������ũ �Ұ��� ����+�ݶ�(500ml)   R:17,000��");
		menu2.add("������ ����+�ݶ�(500ml)   R:17,000��");
		menu2.add("ũ������ �һ� ����+�ݶ�(500ml)   R:17,000��");


		List<String> menu3 = new ArrayList<String>();	//�����̾� ����
		menu3.add("������ũ �Ұ��� ����   13,000��");
		menu3.add("���� ġŲ ����   13,000��");
		menu3.add("����Ʈ ĥ�� ������ ����   14,000��");
		menu3.add("ũ������ �һ� ����+�ݶ�500ml   18,000��");
		menu3.add("����������+�ݶ�(500ml)   18,000��");

		List<String> menu4 = new ArrayList<String>();	//����Ʈ ����
		menu4.add("[�ݶ� 500ml ����]");
		menu4.add("��ġ ����Ʈ ����   15,000��");
		menu4.add("�Ұ�� ����Ʈ ����   16,000��");
		menu4.add("���� ����Ʈ ����   16,000��");
		menu4.add("�������� ����Ʈ ����   16,000��");
		menu4.add("������ũ �Ұ��� ����Ʈ ����   18,000��");


		List<String> menu5 = new ArrayList<String>();	//�� ����
		menu5.add("�� ���� �Ҽ��� ����   13,000��");
		menu5.add("�� ũ�� ������ ����   14,000��");
		menu5.add("�� ��Ż���� ������ ����   14,000��");
	
		List<String> menu6 = new ArrayList<String>();	//��� ����
		menu6.add("[�ݶ� 500ml ����]");
		menu6.add("��� �޺���̼� ����   15,000��");
		menu6.add("��� ���� ����   16,000��");
		menu6.add("��� �������� ����   16,000��");
		menu6.add("��� �ٴ�ġŲ ����   16,000��");
		menu6.add("��� ������ũ �Ұ��� ����   18,000��");
		menu6.add("��� ĥ�������� ����   19,000��");
		

		List<String> menu7 = new ArrayList<String>();	//���� ����
		menu7.add("[�ݶ� �� ����]");
		menu7.add("���� �޺���̼� ����   45cm:20,000��");
		menu7.add("���� �Ұ�� ����   45cm:22,000��");
		menu7.add("���� ���� ����   45cm:22,000��");
		menu7.add("���� �������� ����   45cm:22,000��");
		menu7.add("���� �Ұ��� ����   45cm:26,000��");


		List<String> menu8 = new ArrayList<String>();	//���� ��Ʈ
		menu8.add("����1(�޺���̼�����+ġ����콺�İ�Ƽ+�ݶ���)   16,000��");
		menu8.add("����2(��������/�Ұ��/���� ���� ��1+ġ����콺�İ�Ƽ+���ȷ���+�ݶ���   23,000��");
		menu8.add("����3(������ũ�Ұ�������+ġ����콺�İ�Ƽ+���Ȥ�����+�ݶ���)   25,000��");
		menu8.add("����4(��������/�Ұ��/���� ���,����Ʈ ���� ��1+ġ����콺�İ�Ƽ+��+�ݶ���)   28,000��");
		menu8.add("���� �������� ����   45cm:22,000��");
		menu8.add("���� �Ұ��� ����   45cm:26,000��");

		List<String> menu9 = new ArrayList<String>();	//���� ����
		menu9.add("ġ����� ���İ�Ƽ   5,000��");
		menu9.add("������ġŲ ���İ�Ƽ  5,500��");
		menu9.add("���� ���İ�Ƽ   5,500��");


		List<String> menu10 = new ArrayList<String>();	//���̵�޴�
		menu10.add("�ν�Ʈ��(6EA)   6,000��");
		menu10.add("�ν�Ʈ��(10EA)   9,000��");

	
	

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

}
}
