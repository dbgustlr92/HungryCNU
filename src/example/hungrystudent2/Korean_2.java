package example.hungrystudent2;

import java.util.*;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.*;

public class Korean_2 extends Activity{
	ExpandableListAdapter listAdapter;
	ExpandableListView expListView;
	List<String> listDataHeader;
	HashMap<String, List<String>> listDataChild;

	protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.korean_2);
        ImageButton a = (ImageButton)findViewById(R.id.call_korean2);

        a.setOnClickListener(new ImageButton.OnClickListener(){

			@Override
			public void onClick(View v) {
				startActivity(new Intent("android.intent.action.CALL",Uri.parse("tel:042-488-0709")));
				
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
		listDataHeader.add("�Ļ��");
		listDataHeader.add("���ַ�");
		listDataHeader.add("��Ÿ�н�");
	
		
		
		// Adding child data
		List<String> menu1 = new ArrayList<String>(); // �Ÿ޴�
		menu1.add("�Ź�   3,000��");
		menu1.add("�Ұ���Ź�   4,000��");
		menu1.add("��ġ���Ź�   4,000��");
		menu1.add("��¡���Ź�   4,000��");
		menu1.add("�����Ź�   4,000��");
		menu1.add("�����Ź�   4,000��");
		
		
		
		
		List<String> menu2 = new ArrayList<String>(); // �Ļ��
		menu2.add("��ġ������   6,000��");
		menu2.add("��ä������   6,000��");
		menu2.add("��������   6,000��");
		menu2.add("��¡���   6,000��");
		menu2.add("��ä��   6,000��");
		menu2.add("���Ƕ��̽�   6,000��");
		menu2.add("���ⵤ��   7,000��");
		menu2.add("�����   7,000��");
		menu2.add("����������   7,000��");
		menu2.add("�ҺҰ����Ϻ����   7,000��");
		menu2.add("��ġ��   5,000��");
		menu2.add("�����   5,000��");
		menu2.add("��ġ�   5,000��");
		menu2.add("�̿���   6,000��");
		menu2.add("�Ͼ   6,000��");
		menu2.add("������   6,000��");
		menu2.add("���ٱ���   7,000��");
		menu2.add("������   7,000��");
		menu2.add("�ߵ�����   7,000��");
		menu2.add("�δ���(2��)   12,000��");
		menu2.add("�δ����(3��)   15,000��");
		menu2.add("�δ����(4��)   20,000��");
		menu2.add("��ġ��(2��)   12,000��");
		menu2.add("��ġ���(3��)   15,000��");
		menu2.add("��ġ���(4��)   20,000��");
		menu2.add("������(2��)   12,000��");
		menu2.add("�������(3��)   15,000��");
		menu2.add("�������(4��)   20,000��");
		menu2.add("���κ���(2��)   12,000��");
		menu2.add("���κ����(3��)   15,000��");
		menu2.add("���κ����(4��)   20,000��");
		menu2.add("���ø�   5,000��");
		menu2.add("����ø�   6,000��");
		menu2.add("�����ø�   6,000��");
		menu2.add("�����   10,000��");
		menu2.add("���������   15,000��");

		
		
		List<String> menu3 = new ArrayList<String>();	//���ַ�
		menu3.add("[����亰��]");
		menu3.add("11��~14�� ����伭��");
		menu3.add("�ߵ������(2��)   15,000��");
		menu3.add("�ߵ�������(3��)   20,000��");
		menu3.add("�ߵ�������(4��)   25,000��");
		menu3.add("�ߵ�����(Ư��)   30,000��");
		menu3.add("�������(2��)   15,000��");
		menu3.add("��������(3��)   20,000��");
		menu3.add("��������(4��)   25,000��");
		menu3.add("������(Ư��)   30,000��");
		menu3.add("�ȵ�����(2��)   15,000��");
		menu3.add("�ȵ������(3��)   20,000��");
		menu3.add("�ȵ������(4��)   25,000��");
		menu3.add("�ȵ����(Ư��)   30,000��");
		menu3.add("����������(2��)   15,000��");
		menu3.add("�����������(3��)   20,000��");
		menu3.add("�����������(4��)   25,000��");
		menu3.add("���������(Ư��)   30,000��");
		menu3.add("[���ֻ縮]��/���   1,000��");
		menu3.add("[���ֻ縮]���   2,000��");
		
		
		List<String> menu4 = new ArrayList<String>();	//��Ÿ�н�
		menu4.add("�ָԹ�  2,000��");
		menu4.add("���  2,000��");
		menu4.add("����Ķ���3��  2,000��");
		menu4.add("������  3,000��");
		menu4.add("���Ƣ��  3,000��");
		menu4.add("�����  5,000��");
		


		
		listDataChild.put(listDataHeader.get(0), menu1); // Header, Child data
		listDataChild.put(listDataHeader.get(1), menu2);
		listDataChild.put(listDataHeader.get(2), menu3);
		listDataChild.put(listDataHeader.get(3), menu4);
		

	}


}
