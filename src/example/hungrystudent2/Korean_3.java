package example.hungrystudent2;

import java.util.*;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.*;

public class Korean_3 extends Activity{
	ExpandableListAdapter listAdapter;
	ExpandableListView expListView;
	List<String> listDataHeader;
	HashMap<String, List<String>> listDataChild;

	protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.korean_3);
        ImageButton a = (ImageButton)findViewById(R.id.call_korean3);

        a.setOnClickListener(new ImageButton.OnClickListener(){

			@Override
			public void onClick(View v) {
				startActivity(new Intent("android.intent.action.CALL",Uri.parse("tel:010-4915-9211")));
				
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
		listDataHeader.add("������");
		listDataHeader.add("����");
		listDataHeader.add("���");
		listDataHeader.add("�����");
		listDataHeader.add("�����޴�");
		listDataHeader.add("�����");

	
		
		
		// Adding child data
		List<String> menu1 = new ArrayList<String>(); // ������
		menu1.add("[���������� 1000�� �߰�]");
		menu1.add("��ġ������   5,500��");
		menu1.add("��õ�ع�������   7,000��");
		menu1.add("�����߳�������   6,000��");
		menu1.add("�ع���ġ������   6,500��");
		menu1.add("������ġ������   6,500��");
		menu1.add("����������  7,000��");
		menu1.add("�ֺ���������   7,000��");
		menu1.add("��������   8,500��");
		menu1.add("�ع��������̽�   8,000��");
		menu1.add("����ġŲ���   7,000��");
		menu1.add("������ɵ��   6,500��");
		menu1.add("�����������   7,000��");
		
		
		
		List<String> menu2 = new ArrayList<String>(); // ����
		menu2.add("���񸮾ȵ�   6,000��");
		menu2.add("������   5,500��");
		menu2.add("��ġ������   6,000��");
		menu2.add("����   7,500��");
		menu2.add("�Ե�   6,000��");
		menu2.add("��ġ�Ե�   6,500��");
		menu2.add("ġŲ�����̾ưԵ�   7,500��");
		menu2.add("Ʈ���õ�   9,000��");
	

		
		
		List<String> menu3 = new ArrayList<String>();	//���
		menu3.add("��Ʈ���ұ���   6,000��");
		menu3.add("�ع�����   6,500��");
		menu3.add("��ū�Ұ������   6,500��");
		menu3.add("ť������(���Ѹ�)   6,500��");
		menu3.add("ť��«��(�ſ��)   7,000��");
		menu3.add("��õ�ع�������   7,000��");
		menu3.add("�������񸮾�   7,500��");
		
		
		
		List<String> menu4 = new ArrayList<String>();	//�����
		menu4.add("��������������ũ  8,500��");
		
		List<String> menu5 = new ArrayList<String>();	//�����޴�
		menu5.add("���������   7,000��");
		menu5.add("������   6,000��");


		List<String> menu6 = new ArrayList<String>();	//�����
		menu6.add("���̴�   1,500��");
		menu6.add("�ݶ�   1,500��");
		menu6.add("��ġ��   2,000��");
		


		
		listDataChild.put(listDataHeader.get(0), menu1); // Header, Child data
		listDataChild.put(listDataHeader.get(1), menu2);
		listDataChild.put(listDataHeader.get(2), menu3);
		listDataChild.put(listDataHeader.get(3), menu4);
		listDataChild.put(listDataHeader.get(4), menu5);
		listDataChild.put(listDataHeader.get(5), menu6);

}
}
