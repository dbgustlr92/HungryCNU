package example.hungrystudent2;

import java.util.*;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.*;

public class Korean_4 extends Activity {
	ExpandableListAdapter listAdapter;
	ExpandableListView expListView;
	List<String> listDataHeader;
	HashMap<String, List<String>> listDataChild;

	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.korean_4);
		ImageButton a = (ImageButton) findViewById(R.id.call_korean4);

		a.setOnClickListener(new ImageButton.OnClickListener() {

			@Override
			public void onClick(View v) {
				startActivity(new Intent("android.intent.action.CALL", Uri
						.parse("tel:042-823-5479")));

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
		listDataHeader.add("����");
		listDataHeader.add("���");
		listDataHeader.add("�нķ�");
		listDataHeader.add("�Ļ��");
		listDataHeader.add("���ܷ�");
		listDataHeader.add("���");

		// Adding child data
		List<String> menu1 = new ArrayList<String>(); // ������
		menu1.add("������� 1,500��");
		menu1.add("������� 2,000��");
		menu1.add("��ġ��� 2,500��");
		menu1.add("ġ���� 2,500��");
		menu1.add("��ġ��ġ��� 3,000��");

		List<String> menu2 = new ArrayList<String>(); // ����
		menu2.add("��ġ� 4,000��");
		menu2.add("����� 4,000��");
		menu2.add("���κ�� 4,000��");
		menu2.add("��ġ� 4,500��");
		menu2.add("��� 4,500��");

		List<String> menu3 = new ArrayList<String>(); // ���
		menu3.add("��� 2,500��");
		menu3.add("���(��) 3,000��");
		menu3.add("����� 3,000��");
		menu3.add("ġ���� 3,000��");
		menu3.add("���ζ�� 3,000��");
		menu3.add("���κζ�� 3,500��");
		menu3.add("«�Ͷ�� 3,500��");
		menu3.add("���� 3,500��");
		menu3.add("������ 3,500��");
		menu3.add("ġ����� 4,000��");
		menu3.add("��ġ���� 4,000��");
		menu3.add("������ 4,000��");
		menu3.add("���� 4,000��");
		menu3.add("�̸� 4,000��");
		menu3.add("���ø� 4,000��");
		menu3.add("����ø� 4,000��");

		List<String> menu4 = new ArrayList<String>(); // �����
		menu4.add("�����񵵽ö� 4,000��");
		menu4.add("���Ƕ��̽� 4,000��");
		menu4.add("��¡��� 4,000��");
		menu4.add("�������� 4,000��");
		menu4.add("�ܾ�ä������ 4,000��");
		menu4.add("��ġ������ 4,000��");
		menu4.add("��ä����� 4,000��");
		menu4.add("��ġ����� 4,000��");
		menu4.add("��ġ��ġ���� 4,500��");
		menu4.add("ġŲ���� 4,500��");
		menu4.add("���ҵ��� 4,500��");
		menu4.add("��ġ������ 4,500��");
		menu4.add("��ġ��ġ������ 4,500��");
		menu4.add("�ع������� 4,500��");
		menu4.add("���������� 4,500��");
		menu4.add("���ⵤ�� 5,000��");

		List<String> menu5 = new ArrayList<String>(); // �����޴�
		menu5.add("������ 5,000��");
		menu5.add("���ܺ���� 5,000��");
		menu5.add("���ҵ��� 5,000��");
		menu5.add("ġŲ���� 5,000��");
		menu5.add("�������� 5,000��");
		menu5.add("�˹� 5,000��");
		menu5.add("��ġ�˹� 5,000��");
		menu5.add("ġ��˹� 5,000��");
		menu5.add("��ġ�˹� 5,500��");
		menu5.add("�ҹ��Ұ�� 5,500��");

		List<String> menu6 = new ArrayList<String>(); // �����
		menu6.add("���쵷� 4,500��");
		menu6.add("ġ�� 5,000��");
		menu6.add("������� 5,000��");
		menu6.add("���ڵ�� 5,000��");
		menu6.add("��ȣ�ڵ�� 5,000��");

		listDataChild.put(listDataHeader.get(0), menu1); // Header, Child data
		listDataChild.put(listDataHeader.get(1), menu2);
		listDataChild.put(listDataHeader.get(2), menu3);
		listDataChild.put(listDataHeader.get(3), menu4);
		listDataChild.put(listDataHeader.get(4), menu5);
		listDataChild.put(listDataHeader.get(5), menu6);

	}
}
