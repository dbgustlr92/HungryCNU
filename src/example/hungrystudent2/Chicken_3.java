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

public class Chicken_3 extends Activity{
	
	ExpandableListAdapter listAdapter;
	ExpandableListView expListView;
	List<String> listDataHeader;
	HashMap<String, List<String>> listDataChild;
	
	protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.chicken_3);
        ImageButton a = (ImageButton)findViewById(R.id.call_chicken3);

        a.setOnClickListener(new ImageButton.OnClickListener(){

			@Override
			public void onClick(View v) {
				startActivity(new Intent("android.intent.action.CALL",Uri.parse("tel:042-824-8589")));
				
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
		listDataHeader.add("���� ġŲ");
		// listDataHeader.add("��");

		// Adding child data
		List<String> top250 = new ArrayList<String>();

		
		top250.add("���� ��� ġŲ 12,000��");
		top250.add("���� ���� ġŲ 12,000��");
		top250.add("���� ���� ġŲ 12,000��");
		top250.add("���� �Ķ��̵� ġŲ 12,000��");		
		top250.add("���� ���� ġŲ 13,000��");
		top250.add("���� ġ�� ġŲ 13,000��");
		top250.add("���� ��ä ġŲ 13,000��");
		top250.add("���� ī�� ġŲ 13,000��");
		top250.add("���� �ſ� ��� ġŲ 13,000��");
		top250.add("��Ʈ �޴� �θ��� ġŲ 18,000��");
		top250.add("��Ʈ �޴� ������ ġŲ 24,000��");

		/*List<String> nowShowing = new ArrayList<String>();

		nowShowing.add("���� ġŲ 17,000��");
		nowShowing.add("���� �Ķ��̵� �θ��� ġŲ 17,000��");
		nowShowing.add("���� ���� + ��� ġŲ 18,000��");
		nowShowing.add("���� �Ķ��̵� + ��� ġŲ 18,000��");
		nowShowing.add("���� �Ķ��̵� + ���� ġŲ 18,000��");
		nowShowing.add("���� ī�� ġŲ 19,000��");*/

		// List<String> comingSoon = new ArrayList<String>();
		/*
		 * comingSoon.add("����"); comingSoon.add("����"); comingSoon.add("����");
		 * comingSoon.add("��ľľ"); comingSoon.add("�Ϲ�");
		 */

		listDataChild.put(listDataHeader.get(0), top250); // Header, Child data
		//listDataChild.put(listDataHeader.get(1), nowShowing);
		// listDataChild.put(listDataHeader.get(2), comingSoon);
	}


}
