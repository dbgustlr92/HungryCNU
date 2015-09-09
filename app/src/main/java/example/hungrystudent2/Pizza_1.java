package example.hungrystudent2;

import java.util.*;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.*;

public class Pizza_1 extends Activity {
	ExpandableListAdapter listAdapter;
	ExpandableListView expListView;
	List<String> listDataHeader;
	HashMap<String, List<String>> listDataChild;

	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.pizza_1);
		
		ImageButton a = (ImageButton)findViewById(R.id.call_pizza1);

        a.setOnClickListener(new ImageButton.OnClickListener(){

			@Override
			public void onClick(View v) {
				startActivity(new Intent("android.intent.action.CALL",Uri.parse("tel:042-825-0246")));
				
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
		listDataHeader.add("�ٻ��ġŲ");
		listDataHeader.add("�ٻ������");
	

		
		// Adding child data
		List<String> menu1 = new ArrayList<String>();	//�ٻ��ġŲ
		menu1.add("�Ķ��̵�ġŲ  15,000��");
		menu1.add("���ġŲ  16,000��");
		menu1.add("�Ķ��̵�+���  16,000��");
		menu1.add("����ġŲ   15,000��");
		menu1.add("������ġŲ  16,000��");	
		menu1.add("�߰���  16,000��");	
		menu1.add("ȭ��ġŲ  16,000��");	
		menu1.add("�����йи���Ʈ  24,000��");
		menu1.add("ġŲ������  16,000��");
		menu1.add("�����Ĵ�  17,000��");
		menu1.add("���꽺ƽ  17,000��");
		menu1.add("������  17,000��");
		menu1.add("����ƽ  17,000��");		
		
		List<String> menu2 = new ArrayList<String>();	//�ٻ������
		menu2.add("��ũ������Ÿ��M   13,000��");
		menu2.add("��ũ������Ÿ��L   16,000��");
		menu2.add("ġ��ũ����ƮŸ��M   18,000��");
		menu2.add("ġ��ũ����ƮŸ��L   20,000��");
		menu2.add("Ʈ���ùͽ�����M   13,000��");
		menu2.add("Ʈ���ùͽ�����L   15,000��");
		menu2.add("�����̾����Ÿ��M   20,000��");
		menu2.add("�����̾����Ÿ��L   25,000��");
		menu2.add("����ġ��İ�Ƽ   5,000��");
		menu2.add("ġ�ƽ(5��)   3,000��");
	
		
		listDataChild.put(listDataHeader.get(0), menu1); // Header, Child data
		listDataChild.put(listDataHeader.get(1), menu2);
	
	}
}
