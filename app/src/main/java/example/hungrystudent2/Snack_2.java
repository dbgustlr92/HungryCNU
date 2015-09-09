package example.hungrystudent2;

import java.util.*;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.*;

public class Snack_2 extends Activity {
	ExpandableListAdapter listAdapter;
	ExpandableListView expListView;
	List<String> listDataHeader;
	HashMap<String, List<String>> listDataChild;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.snack_2);
		
		  ImageButton a = (ImageButton)findViewById(R.id.call_snack2);

	        a.setOnClickListener(new ImageButton.OnClickListener(){

				@Override
				public void onClick(View v) {
					startActivity(new Intent("android.intent.action.CALL",Uri.parse("tel:042-826-9266")));
					
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
		listDataHeader.add("����޴�");
		listDataHeader.add("���⼼Ʈ");
		listDataHeader.add("�����޴�");
		listDataHeader.add("������Ʈ");
		listDataHeader.add("����");
		listDataHeader.add("���̵�޴�");

		
		// Adding child data
		List<String> menu1 = new ArrayList<String>();	//����޴�
		menu1.add("���ⶱ����  14,000��");
		menu1.add("�������  14,000��");
		menu1.add("����ߵ���  24,000��");		
		
		
		List<String> menu2 = new ArrayList<String>();	//���⼼Ʈ
		menu2.add("A.����+�����+�ָԹ�+���ǽ���  17,000��");
		menu2.add("B.����+�����+�ָԹ�+����2+���2+���ǽ���   19,000��");
		menu2.add("C.����+�����+�ָԹ�+ġ������+���ǽ���   20,000��");
		

		List<String> menu3 = new ArrayList<String>();	//�����޴�
		menu3.add("������߹�   14,000��");
		menu3.add("�����߳���   14,000��");
		menu3.add("������   14,000��");
		menu3.add("���������´߹�   15,000��");
		menu3.add("�����߹�   15,000��");
		
	
		
		List<String> menu4 = new ArrayList<String>();	//������Ʈ
		menu4.add("1.������+�����+�ָԹ�+���ǽ���   17,000��");
		menu4.add("2.�����´߹�+�����+�ָԹ�+���ǽ���   18,000��");
		menu4.add("3.�����߹�+�����+�ָԹ�+���+���ǽ���   20,000��");
		menu4.add("4.�ߵ�����+�����+�ָԹ�+���ǽ���   27,000��");
		
		List<String> menu5 = new ArrayList<String>(); //����
		menu5.add("����/���߰�   1,000��");
		menu5.add("���߸���   1,000��");
		menu5.add("���   1,000��");
		menu5.add("��   1,000��");
		menu5.add("�߳�����   2,000��");
		menu5.add("���縮   2,000��");
		menu5.add("���   2,000��");
		menu5.add("ġ��   3,000��");
		
		
		List<String> menu6 = new ArrayList<String>();	//���̵�޴�
		menu6.add("������߰�   2,000��");
		menu6.add("�ָԱ��   2,000��");
		menu6.add("�����ä��   5,000��");
		menu6.add("��������   5,000��");
		menu6.add("������   10,000��");
		
		
		
		
		
		
		listDataChild.put(listDataHeader.get(0), menu1); // Header, Child data
		listDataChild.put(listDataHeader.get(1), menu2);
		listDataChild.put(listDataHeader.get(2), menu3);
		listDataChild.put(listDataHeader.get(3), menu4);
		listDataChild.put(listDataHeader.get(4), menu5);
		listDataChild.put(listDataHeader.get(5), menu6);
	}
}
