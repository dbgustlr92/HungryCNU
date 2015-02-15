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

public class Chicken_1 extends Activity {
	ExpandableListAdapter listAdapter;
	ExpandableListView expListView;
	List<String> listDataHeader;
	HashMap<String, List<String>> listDataChild;

	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.chicken_1);

		ImageButton a = (ImageButton) findViewById(R.id.call_chicken1);

		a.setOnClickListener(new ImageButton.OnClickListener() {
			@Override
			public void onClick(View v) {
				startActivity(new Intent("android.intent.action.CALL", Uri
						.parse("tel:042-825-0617")));
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
		listDataHeader.add("���");
		listDataHeader.add("�丮");
		listDataHeader.add("��");

		// Adding child data
		List<String> top250 = new ArrayList<String>();
		top250.add("¥���1");
		top250.add("¥���2");
		top250.add("¥���3");
		top250.add("¥���4");
		top250.add("¥���5");
		top250.add("¥���6");
		top250.add("¥���7");

		List<String> nowShowing = new ArrayList<String>();
		nowShowing.add("������");
		nowShowing.add("��ǳ��");
		nowShowing.add("������2");
		nowShowing.add("������3");
		nowShowing.add("������4");
		nowShowing.add("������5");

		List<String> comingSoon = new ArrayList<String>();
		comingSoon.add("����");
		comingSoon.add("����");
		comingSoon.add("����");
		comingSoon.add("��ľľ");
		comingSoon.add("�Ϲ�");

		listDataChild.put(listDataHeader.get(0), top250); // Header, Child data
		listDataChild.put(listDataHeader.get(1), nowShowing);
		listDataChild.put(listDataHeader.get(2), comingSoon);
	}

	

}
