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

public class Chicken_14 extends Activity{
	
	ExpandableListAdapter listAdapter;
	ExpandableListView expListView;
	List<String> listDataHeader;
	HashMap<String, List<String>> listDataChild;
	
	protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.chicken_14);
        ImageButton a = (ImageButton)findViewById(R.id.call_chicken14);

        a.setOnClickListener(new ImageButton.OnClickListener(){

			@Override
			public void onClick(View v) {
				startActivity(new Intent("android.intent.action.CALL",Uri.parse("tel:042-867-9292")));
				
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
		listDataHeader.add("ġŲ(����)");
		listDataHeader.add("���̵� �޴�");

		// Adding child data
		List<String> top250 = new ArrayList<String>();
		
		
		top250.add("�ٻ�ĭġŲ 16,000��");
		top250.add("Ȳ�ݿø���ġŲ 16,000��");
		top250.add("����ũġŲ  17,000��");
		top250.add("����ӾȽ��ٴ� 17,000��");		
		top250.add("(�ݹ�)���� + �ٻ�ĭ 17,000��");
		top250.add("���ð���߳��� 17,500��");
		top250.add("Ȳ�ݿø���ߴٸ� 17,500��");
		top250.add("�ڸ���ī��ٸ����� 17,500��");	
		top250.add("ġŲ���� 18,000��");
		top250.add("(�ݹ�)���� + ũ��Ŀ 18,000��");
		top250.add("����ġŲ 19,000��");
		top250.add("�̽�ź��ġŲ 19,500��");		

		List<String> nowShowing = new ArrayList<String>();

		nowShowing.add("(����)�Ĵ��ǲ� 19,000��");
		nowShowing.add("(����)�ʴ�119 19,000��");
		nowShowing.add("(����)������û�� 19,000��");
		

		List<String> comingSoon = new ArrayList<String>();

		comingSoon.add("(���̵�)�ܼ�����  1,000��");
		comingSoon.add("(���̵�)��¡�/������ƽ  2,000��");
		comingSoon.add("(���̵�)������  2,500��");
		comingSoon.add("(���̵�)��������/ġ�ƽ 3,000��");

		listDataChild.put(listDataHeader.get(0), top250); // Header, Child data
		listDataChild.put(listDataHeader.get(1), nowShowing);
		listDataChild.put(listDataHeader.get(2), comingSoon);
	}

}
