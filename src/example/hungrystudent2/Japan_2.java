package example.hungrystudent2;

import java.util.*;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.*;

public class Japan_2 extends Activity {
	ExpandableListAdapter listAdapter;
	ExpandableListView expListView;
	List<String> listDataHeader;
	HashMap<String, List<String>> listDataChild;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.japan_2);
		ImageButton a = (ImageButton) findViewById(R.id.call_japanese2);

		a.setOnClickListener(new ImageButton.OnClickListener() {

			@Override
			public void onClick(View v) {
				startActivity(new Intent("android.intent.action.CALL", Uri
						.parse("tel:042-823-2001")));

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
		listDataHeader.add("��Ʈ�޴�");
		listDataHeader.add("�Ǽ� ����&����");
		listDataHeader.add("���뵷���");
		listDataHeader.add("ǻ�������");
		listDataHeader.add("������");
		listDataHeader.add("�쵿��");
		listDataHeader.add("�˹�&�����");
		listDataHeader.add("���ٷ�");
		listDataHeader.add("��Ÿ�޴�");

		// Adding child data
		List<String> menu1 = new ArrayList<String>(); // ��Ʈ�޴�
		menu1.add("����ּ�ƮA(�Ƚ�+ġŲ+����+�ҿ쵿)  10,000��");
		menu1.add("����ּ�ƮB(�Ƚ�+����+����+�ҿ쵿)  10,000��");
		menu1.add("����ּ�ƮC(�ڵ��긣�+�ҿ쵿)  11,000��");

		List<String> menu2 = new ArrayList<String>(); // �Ǽ� ����&����
		menu2.add("����+ġŲ�   7,500��");
		menu2.add("����+�����   7,500��");

		List<String> menu3 = new ArrayList<String>(); // ���뵷���
		menu3.add("ġŲ�(������)   7,000��");
		menu3.add("�����   7,000��");
		menu3.add("ŷġŲ�(������)   7,500��");
		menu3.add("�����(�Ƚ�)   8,000��");
		menu3.add("�ν��(���)   8,000��");
		menu3.add("ŷ���(�Ƚ�)   8,000��");

		List<String> menu4 = new ArrayList<String>(); // ǻ�������
		menu4.add("ī����ĥ���(�ſ� �ҽ�)   8,000��");
		menu4.add("�Ͽ��̾�ĥ���(�ſ�,ĥ�� �ҽ�)   8,500��");
		menu4.add("�����ѱ   9,000��");
		menu4.add("���ѱ   10,000��");
		menu4.add("�ڵ��긣�(��¥����ġ��)   10,000��");

		List<String> menu5 = new ArrayList<String>(); // ������
		menu5.add("ġŲ�����߳�������   6,000��");
		menu5.add("��õ��������   6,000��");
		menu5.add("�ܾ�ä������   6,000��");
		menu5.add("���캺����   6,000��");
		menu5.add("�ع�������   6,000��");
		menu5.add("��ġ������   6,000��");
		menu5.add("�������̽�   6,000��");

		List<String> menu6 = new ArrayList<String>(); // �쵿��
		menu6.add("�紩���쵿   5,000��");
		menu6.add("���ο쵿   5,500��");
		menu6.add("��쵿   5,500��");
		menu6.add("�ع������쵿   6,000��");
		menu6.add("�ع��߳��쵿   6,500��");

		List<String> menu7 = new ArrayList<String>(); // �˹�&�����
		menu7.add("�ᳪ������   6,000��");
		menu7.add("ũ���˹�   6,000��");
		menu7.add("��������   6,000��");
		menu7.add("���θ�   6,000��");

		List<String> menu8 = new ArrayList<String>(); // ���ٷ�
		menu8.add("�޹мҹ�   6,000��");
		menu8.add("Ư��мҹ�   7,000��");

		List<String> menu9 = new ArrayList<String>(); // ��Ÿ�޴�
		menu9.add("����   1,500��");
		menu9.add("ġ�ƽ   2,000��");
		menu9.add("�ҿ쵿   2,000��");
		menu9.add("����   2,500��");
		menu9.add("����   3,000��");
		menu9.add("�ݶ�/���̴� �   1,500��");
		menu9.add("�ݶ�/���̴� ��   2,500��");

		listDataChild.put(listDataHeader.get(0), menu1); // Header, Child data
		listDataChild.put(listDataHeader.get(1), menu2);
		listDataChild.put(listDataHeader.get(2), menu3);
		listDataChild.put(listDataHeader.get(3), menu4);
		listDataChild.put(listDataHeader.get(4), menu5);
		listDataChild.put(listDataHeader.get(5), menu6);
		listDataChild.put(listDataHeader.get(6), menu7);
		listDataChild.put(listDataHeader.get(7), menu8);
		listDataChild.put(listDataHeader.get(8), menu9);
	}
}
