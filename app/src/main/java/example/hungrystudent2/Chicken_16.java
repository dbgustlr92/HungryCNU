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

public class Chicken_16 extends Activity{
	
	ExpandableListAdapter listAdapter;
	ExpandableListView expListView;
	List<String> listDataHeader;
	HashMap<String, List<String>> listDataChild;
	
	protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.chicken_16);
        ImageButton a = (ImageButton)findViewById(R.id.call_chicken16);

        a.setOnClickListener(new ImageButton.OnClickListener(){

			@Override
			public void onClick(View v) {
				startActivity(new Intent("android.intent.action.CALL",Uri.parse("tel:042-826-5670")));
				
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
		listDataHeader.add("ġŲ");
		

		// Adding child data
		List<String> top250 = new ArrayList<String>();

		top250.add("�Ķ��̵�+�Ķ��̵�+�ݶ� 17,000��");
		top250.add("����+�Ķ��̵�+�ݶ� 18,000��");
		top250.add("���+�Ķ��̵�+�ݶ� 18,000��");
		top250.add("����+���+�ݶ� 19,000��");
		top250.add("�Ѹ���(���/����/�Ķ��̵�)+�ݶ� 13,000��");
		top250.add("(����/�ٸ�/����+�ٸ� )+�ݶ� 17,000��");
		

		listDataChild.put(listDataHeader.get(0), top250); // Header, Child data
		
	}

}