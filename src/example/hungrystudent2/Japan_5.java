package example.hungrystudent2;

import java.util.*;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.*;

public class Japan_5 extends Activity {
	ExpandableListAdapter listAdapter;
	ExpandableListView expListView;
	List<String> listDataHeader;
	HashMap<String, List<String>> listDataChild;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.japan_5);

		ImageButton a = (ImageButton) findViewById(R.id.call_japanese5);

		a.setOnClickListener(new ImageButton.OnClickListener() {

			@Override
			public void onClick(View v) {
				startActivity(new Intent("android.intent.action.CALL", Uri
						.parse("tel:042-825-2900")));

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
		listDataHeader.add("�޴�A");
		listDataHeader.add("�޴�B");

		// Adding child data
		List<String> menu1 = new ArrayList<String>(); // ���
		menu1.add("���þ��ֹ��� ��õ�ʹ� 13��+������   15,000��");
		menu1.add("[�ʹ伱�ð���]�������,����,�췰,����,�ѿ�,���,���ٶ���,���ٶ���,������,Ÿ�ڿͻ��,���Ծ�,�Ƹ�����,�����̱�(��տ�¡��),������ġ,����ġ��,������,������,Ű���� ��");

		List<String> menu2 = new ArrayList<String>(); // ����
		menu2.add("���þ��ֹ��� ��õ�ʹ� 14��+������+Ƣ��   20,000��");
		menu2.add("[�ʹ伱�ð���]�������,����,�췰,����,�ѿ�,���,���ٶ���,���ٶ���,������,Ÿ�ڿͻ��,���Ծ�,�Ƹ�����,�����̱�(��տ�¡��),������ġ,����ġ��,������,������,Ű���� ��");

		listDataChild.put(listDataHeader.get(0), menu1); // Header, Child data
		listDataChild.put(listDataHeader.get(1), menu2);

	}

}
