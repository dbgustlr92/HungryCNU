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

public class Chicken_4 extends Activity {

	ExpandableListAdapter listAdapter;
	ExpandableListView expListView;
	List<String> listDataHeader;
	HashMap<String, List<String>> listDataChild;

	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.chicken_4);
		ImageButton a = (ImageButton) findViewById(R.id.call_chicken4);

		a.setOnClickListener(new ImageButton.OnClickListener() {

			@Override
			public void onClick(View v) {
				startActivity(new Intent("android.intent.action.CALL", Uri
						.parse("tel:042-822-7717")));

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
		listDataHeader.add("����");
		listDataHeader.add("ġŲ + ���� ��Ʈ");

		// Adding child data
		List<String> top250 = new ArrayList<String>();

		top250.add("���� ġŲ 16,000��");
		top250.add("���� �� ġŲ/���� ���� ġŲ 16,000��");		
		top250.add("�� ����ũ ġŲ/�� ����ũ ġŲ 16,000��");
		top250.add("���� �����߳� ġŲ/�ٺ�ť ġŲ 16,000��");
		top250.add("���� �� ����/���� �� �ٸ� 17,000��");
		top250.add("���� ��ٸ�(��)+�볯��(��) 17,000��");
		top250.add("���� ��ٸ�(��)+���� ����(��) 17,000��");
		top250.add("���� �볯��(��)+���� ����(��) 17,000��");
		top250.add("���� �Ĵ�/���� ���� ġ�� ġŲ 18,000��");
		List<String> nowShowing = new ArrayList<String>();
		
		nowShowing.add("��������/���� ���� 15,000��");
		nowShowing.add("�޺���̼�/�Ұ�� ���� 15,000��");
		nowShowing.add("����δ�/��ġŲ/������ ���� 15,000��");
		nowShowing.add("ġ�� ����Ʈ ���� 18,000��");
		nowShowing.add("���� �Ķ��̵� + ���� ġŲ 18,000��");
		nowShowing.add("���� ī�� ġŲ 19,000��");

		List<String> comingSoon = new ArrayList<String>();

		comingSoon.add("����ġŲ(��)+�޺���̼�����(R) 20,000��");
		comingSoon.add("����ġŲ�Ѹ���+���ǳ��̼�����(R) 26,000��");
		comingSoon.add("�����볯��ġŲ(1����)+��������(R) 28,000��");
		comingSoon.add("������ٸ�ġŲ(1����)+��������(R) 29,000��");
		comingSoon.add("�θ���ġŲ+�޺���̼�����(R) 30,000��");

		listDataChild.put(listDataHeader.get(0), top250); // Header, Child data
		listDataChild.put(listDataHeader.get(1), nowShowing);
		listDataChild.put(listDataHeader.get(2), comingSoon);
	}

}
