package example.hungrystudent2;

import java.util.*;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.*;

public class Japan_3 extends Activity {
	ExpandableListAdapter listAdapter;
	ExpandableListView expListView;
	List<String> listDataHeader;
	HashMap<String, List<String>> listDataChild;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.japan_3);

		ImageButton a = (ImageButton) findViewById(R.id.call_japanese3);

		a.setOnClickListener(new ImageButton.OnClickListener() {

			@Override
			public void onClick(View v) {
				startActivity(new Intent("android.intent.action.CALL", Uri
						.parse("tel:042-825-2545")));

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
		listDataHeader.add("���̽� ���ö�");
		listDataHeader.add("��� ���ö�");
		listDataHeader.add("�쵿/�޹� ���ö�");
		listDataHeader.add("��Ʈ�޴�");
		

		// Adding child data
		List<String> menu1 = new ArrayList<String>(); // ���̽� ���ö�
		menu1.add("�丶����Ƕ��̽�  6,000��");
		menu1.add("�̱��¡���  6,000��");
		menu1.add("������������  6,000��");
		menu1.add("�ҺҰ�ⵤ��  6,000��");
		menu1.add("�̱��¡����������  6,500��");
		menu1.add("���쳯ġ�˺����  6,500��");
		menu1.add("���޴߰����ä����  7,500��");
		menu1.add("��Ͼ𶱰�����Ƕ��̽�  8,000��");

		List<String> menu2 = new ArrayList<String>(); // ��� ���ö�
		menu2.add("���������(4��)   5,000��");
		menu2.add("������ɵ��   7,000��");
		menu2.add("ġŲ�(���Ѹ�/�ſ��)   7,500��");
		menu2.add("���޵��   7,500��");
		menu2.add("�Թڽ�����ũ(���Ѹ�/�ſ��)   8,000��");
		menu2.add("��¥����ġ��   8,000��");
		menu2.add("����ġ��   8,000��");
		menu2.add("��ȣ��ġ���   8,000��");
		menu2.add("���ڵ��   8,000��");
		menu2.add("��ġġ��   8,500��");
		




		
		List<String> menu3 = new ArrayList<String>(); // �쵿/�޹� ���ö�
		menu3.add("���ο쵿   4,500��");
		menu3.add("������쵿   5,000��");
		menu3.add("��ū��ġ�쵿   5,000��");
		menu3.add("��ġ��쵿   5,500��");
		menu3.add("��ä������   6,000��");
		menu3.add("�Ͻ��Ǹ��   6,000��");
		menu3.add("���޴߰���ö�Ǻ����쵿   7,000��");
		
		List<String> menu4 = new ArrayList<String>(); // ��Ʈ�޴�
		menu4.add("�Ϳ�set1(��ɵ��+������������)   12,500��");
		menu4.add("�Ϳ�set2(��ɵ��+�̱��¡���)   12,500��");
		menu4.add("�Ϳ�set3(��ɵ��+�ҺҰ�⺺��)   12,500��");
		menu4.add("�˶�set1(��ɵ��+���ο쵿+���������)   16,000��");
		menu4.add("�˶�set2(ġ��+��ġ��쵿+���������)   18,000��");
		menu4.add("����set1(��ɵ��+����ġ��+��ū��ġ�쵿+���������)   24,500��");
		menu4.add("����set2(��ɵ��+�Թڽ�����ũ+��ġ��쵿+�丶����Ƕ��̽�)   26,000��");
		menu4.add("����set3(��ɵ��+ġ��+��ū��ġ�쵿+���޴߰����ä����)   27,000��");


		listDataChild.put(listDataHeader.get(0), menu1); // Header, Child data
		listDataChild.put(listDataHeader.get(1), menu2);
		listDataChild.put(listDataHeader.get(2), menu3);
		listDataChild.put(listDataHeader.get(3), menu4);
		
	}
}
