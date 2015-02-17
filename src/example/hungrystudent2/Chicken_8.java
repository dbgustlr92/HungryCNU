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

public class Chicken_8 extends Activity {

	ExpandableListAdapter listAdapter;
	ExpandableListView expListView;
	List<String> listDataHeader;
	HashMap<String, List<String>> listDataChild;

	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.chicken_8);
		ImageButton a = (ImageButton) findViewById(R.id.call_chicken8);

		a.setOnClickListener(new ImageButton.OnClickListener() {

			@Override
			public void onClick(View v) {
				startActivity(new Intent("android.intent.action.CALL", Uri
						.parse("tel:042-826-9298")));

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
		listDataHeader.add("ġŲ Ȩ��Ʈ");
		listDataHeader.add("���� ġŲ Ȩ��Ʈ");

		// Adding child data
		List<String> top250 = new ArrayList<String>();

		top250.add("���ġŲ(��)/����ġŲ/�ٴ���ƽ  14,000��");
		top250.add("���/����/�ſ���  15,000��");
		top250.add("���Ķ��̵�(��)/�Ķ��̵���/�ߴٸ��Ķ��̵�  15,000��");
		top250.add("��� ġŲ/���� ġŲ 16,000��");
		top250.add("�߰���/�������/������ġŲ/�Ĵ�(��)  16,000��");
		top250.add("�����Ķ��̵�(Ư��) 16,500��");
		top250.add("���� �Ĵ� 17,000��");
		top250.add("���� �Ĵ� ��� 18,000��");

		List<String> nowShowing = new ArrayList<String>();

		nowShowing.add("Ȩ��Ʈ1(�Ķ��̵�+���+����) 19,500��");
		nowShowing.add("Ȩ��Ʈ3(�Ķ��̵�+�Ĵ�+���) 19,500��");
		nowShowing.add("Ȩ��Ʈ2(�Ķ��̵�+�߰���+����) 19,500��");
		nowShowing.add("Ȩ��Ʈ4(�Ķ��̵�+�Ĵ�+�߰���) 19,500��");
		nowShowing.add("�����(�������+������ġŲ+�Ķ��̵�) 19,500��");

		List<String> comingSoon = new ArrayList<String>();

		comingSoon.add("���켼Ʈ1(�߰���+�Ĵ�+�Ķ��̵�) 19,500��");
		comingSoon.add("���켼Ʈ2(�ſ��+�Ĵ�+�Ķ��̵�) 19,500��");
		comingSoon.add("���켼Ʈ3(����Ʈĥ��+�Ĵ�+�Ķ��̵�) 19,500��");
		comingSoon.add("���켼Ʈ4(���������+������+�Ķ��̵�) 19,500��");

		listDataChild.put(listDataHeader.get(0), top250); // Header, Child data
		listDataChild.put(listDataHeader.get(1), nowShowing);
		listDataChild.put(listDataHeader.get(2), comingSoon);

	}

}
