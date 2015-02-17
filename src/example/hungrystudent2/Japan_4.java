package example.hungrystudent2;

import java.util.*;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.*;

public class Japan_4 extends Activity {
	ExpandableListAdapter listAdapter;
	ExpandableListView expListView;
	List<String> listDataHeader;
	HashMap<String, List<String>> listDataChild;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.japan_4);

		ImageButton a = (ImageButton) findViewById(R.id.call_japanese4);

		a.setOnClickListener(new ImageButton.OnClickListener() {

			@Override
			public void onClick(View v) {
				startActivity(new Intent("android.intent.action.CALL", Uri
						.parse("tel:042-826-4446")));

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
		listDataHeader.add("���");
		listDataHeader.add("����");
		listDataHeader.add("����");
		listDataHeader.add("���");
		listDataHeader.add("��Ʈ�޴�");
		listDataHeader.add("���ַ�");

		// Adding child data
		List<String> menu1 = new ArrayList<String>(); // ���
		menu1.add("�ջ���   7,000��");
		menu1.add("�յ��   7,000��");
		menu1.add("�����   7,000��");
		menu1.add("�ع��   7,000��");
		menu1.add("�Թڽ�����ũ  8,000��");
		menu1.add("���ڵ��   8,000��");
		menu1.add("��뵷�   8,000��");
		menu1.add("ġ��   8,000��");
		menu1.add("��ġ���   8,000��");

		List<String> menu2 = new ArrayList<String>(); // ����
		menu2.add("��ġ������   6,000��");
		menu2.add("���̺�����   6,000��");
		menu2.add("��¡���   6,000��");
		menu2.add("��������   6,000��");
		menu2.add("��������   6,000��");
		menu2.add("�ع�������   7,000��");

		List<String> menu3 = new ArrayList<String>(); // ����
		menu3.add("����A(�Թڽ�����ũ+�յ��+ġ��+�����)   9,000��");
		menu3.add("����B(�Թڽ�����ũ+���ڵ��+ġ��+��ġ���+�����+�ջ���Ƣ��)   12,000��");

		List<String> menu4 = new ArrayList<String>(); // ���( ���A���� ) ����뿡�� ������
		menu4.add("���B(���ڵ��+ġ��+�����)   9,000��");
		menu4.add("���C(���ڵ��+��ġ���+�ջ����Ķ���)   9,000��");
		menu4.add("���D(�Թڽ�����ũ+���ڵ��+ġ��+�����)   10,000��");

		List<String> menu5 = new ArrayList<String>(); // ��Ʈ�޴�
		menu5.add("�յ��+��ġ������   9,000��");
		menu5.add("�Թڽ�����ũ+��ġ������   10,000��");
		menu5.add("���ڵ��+��ġ������   10,000��");
		menu5.add("ġ��+��ġ������   10,000��");
		menu5.add("��ġ���+��ġ������   10,000��");

		List<String> menu6 = new ArrayList<String>(); // ���ַ�
		menu6.add("����̹�ħ�Ҹ�   15,000��");
		menu6.add("���������Ҹ�   15,000��");
		menu6.add("���������   15,000��");
		menu6.add("�������   15,000��");
		menu6.add("�ջ������   15,000��");
		menu6.add("����Ⱦ���   20,000��");
		menu6.add("�Թھ���   15,000��");

		listDataChild.put(listDataHeader.get(0), menu1); // Header, Child data
		listDataChild.put(listDataHeader.get(1), menu2);
		listDataChild.put(listDataHeader.get(2), menu3);
		listDataChild.put(listDataHeader.get(3), menu4);
		listDataChild.put(listDataHeader.get(4), menu5);
		listDataChild.put(listDataHeader.get(5), menu6);

	}

}
