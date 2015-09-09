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

public class Chicken_17 extends Activity {

	ExpandableListAdapter listAdapter;
	ExpandableListView expListView;
	List<String> listDataHeader;
	HashMap<String, List<String>> listDataChild;

	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.chicken_17);
		ImageButton a = (ImageButton) findViewById(R.id.call_chicken17);

		a.setOnClickListener(new ImageButton.OnClickListener() {

			@Override
			public void onClick(View v) {
				startActivity(new Intent("android.intent.action.CALL", Uri
						.parse("tel:042-825-9993")));

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
		listDataHeader.add("��Ʈ �޴�");

		// Adding child data
		List<String> top250 = new ArrayList<String>();

		top250.add("���Ϳ��챸��(����1����) 13,000��");
		top250.add("���Ϳ��챸��(����2����) 18,000��");
		top250.add("���Ϳ��챸��(����3����) 24,000��");
		top250.add("�����ŷ�Ҵ�/������ĥ��/���츶�ð��� 15,000��");
		top250.add("�����úҴ�/����ĥ��/�����ð��� 16,000��");
		top250.add("���Ϳ��챸��+��ĥ�� 20,000��");
		top250.add("���Ϳ��챸��+��ŷ�Ҵ� 20,000��");
		top250.add("���Ϳ��챸��+���ð���ġŲ 20,000��");

		List<String> nowShowing = new ArrayList<String>();

		nowShowing.add("�����Ĵ� 2������ 18,000��");
		nowShowing.add("�����Ĵ� 3�������� 25,000��");
		nowShowing.add("���ִ�ġŲ 1�������� 14,000��");
		nowShowing.add("���ִ�ġŲ 2������ 20,000��");

		listDataChild.put(listDataHeader.get(0), top250); // Header, Child data
		listDataChild.put(listDataHeader.get(1), nowShowing);

	}

}
