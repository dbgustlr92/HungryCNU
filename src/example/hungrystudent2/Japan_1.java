package example.hungrystudent2;

import java.util.*;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.*;

public class Japan_1 extends Activity{
	ExpandableListAdapter listAdapter;
	ExpandableListView expListView;
	List<String> listDataHeader;
	HashMap<String, List<String>> listDataChild;

	
	protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.japan_1);
        ImageButton a = (ImageButton)findViewById(R.id.call_japanese1);

        a.setOnClickListener(new ImageButton.OnClickListener(){

			@Override
			public void onClick(View v) {
				startActivity(new Intent("android.intent.action.CALL",Uri.parse("tel:042-862-8805")));
				
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
		listDataHeader.add("��Ʈ�޴�");
		listDataHeader.add("����");
		listDataHeader.add("���");

		
		// Adding child data
		List<String> menu1 = new ArrayList<String>();	//��Ʈ�޴�
		menu1.add("A.��ġ��Ʈ(��ġ�+�쵿��)  7,000��");
		menu1.add("B.ũ����Ʈ(ũ���+�쵿��)  7,000��");
		menu1.add("C.�ع���Ʈ(�ع��+�쵿��)  7,000��");
		menu1.add("D.���Ʈ(�����+�쵿��)  7,000��");
		menu1.add("E.���̼�Ʈ(�����+�쵿��)  7,000��");	
		menu1.add("F.���켼Ʈ(�����+�쵿��)  7,000��");	
		menu1.add("G.���Ʈ(�����+�쵿��)  9,000��");	
		menu1.add("H.��Ʈ(����+�쵿��)  10,000��");	
		
		List<String> menu2 = new ArrayList<String>();	//����
		menu2.add("��ġȸ����   5,000��");
		menu2.add("��ġȸ������   6,000��");
		menu2.add("ũ������   5,000��");
		menu2.add("ũ��������   7,000��");
		menu2.add("�ع�����   5,000��");
		menu2.add("�ع�������   7,000��");
		menu2.add("����ȸ����   5,000��");
		menu2.add("����ȸ������   7,000��");
		menu2.add("����ȸ����   5,000��");
		menu2.add("����ȸ������   7,000��");
		menu2.add("�˹�/���� ����   7,000��");
		menu2.add("����ȸ����   9,000��");
		menu2.add("����   10,000��");

		List<String> menu3 = new ArrayList<String>();	//���
		menu3.add("�쵿   5,000��");
		menu3.add("�ÿ쵿   6,000��");
		
		
		listDataChild.put(listDataHeader.get(0), menu1); // Header, Child data
		listDataChild.put(listDataHeader.get(1), menu2);
		listDataChild.put(listDataHeader.get(2), menu3);
	
	}

}
