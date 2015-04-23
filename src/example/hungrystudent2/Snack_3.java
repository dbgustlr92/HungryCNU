package example.hungrystudent2;

import java.util.*;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.*;

public class Snack_3 extends Activity {
	ExpandableListAdapter listAdapter;
	ExpandableListView expListView;
	List<String> listDataHeader;
	HashMap<String, List<String>> listDataChild;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.snack_3);
		
		  ImageButton a = (ImageButton)findViewById(R.id.call_snack3);

	        a.setOnClickListener(new ImageButton.OnClickListener(){

				@Override
				public void onClick(View v) {
					startActivity(new Intent("android.intent.action.CALL",Uri.parse("tel:042-822-6339")));
					
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
		listDataHeader.add("�޴�");
		listDataHeader.add("��Ʈ�޴�");

		
		// Adding child data
		List<String> menu1 = new ArrayList<String>();	//����޴�
		menu1.add("10,000�� �̻� �ֹ��� ��޵˴ϴ�");
		menu1.add("������ 2,000��");
		menu1.add("ġ����� 3,000��");
		menu1.add("��ġ��� 2,000��");
		menu1.add("ġ���� 2,000��");
		menu1.add("������� 1,500��");
		menu1.add("���ǽ� 1,500��");
		menu1.add("Ƣ���� 1,000��");
		menu1.add("Ƣ���� 1,000��");
		menu1.add("Ƣ��ä���� 1,000��");
		menu1.add("ġ�ƽ 1,000��");
		menu1.add("�踻�� 1,000��");
		menu1.add("������ 1,000��");
		menu1.add("ġŲ�ʰ� 1,000��");
		menu1.add("��������� 1,000��");
		
		
		List<String> menu2 = new ArrayList<String>();	//���⼼Ʈ
		menu2.add("������+Ƣ����+Ƣ���� 4,000��");
		menu2.add("������+Ƣ����2+Ƣ����+���ǽ� 6,500��");
		menu2.add("������2+Ƣ����2+Ƣ����+������� 8,000��");
		menu2.add("������2+Ƣ����2+Ƣ����2+Ƣ��ä����+���ǽ� 10,000��");
		menu2.add("������2+Ƣ����2+Ƣ����2+Ƣ��ä����+������� 10,000��");
		
		
		listDataChild.put(listDataHeader.get(0), menu1); // Header, Child data
		listDataChild.put(listDataHeader.get(1), menu2);
	}
}
