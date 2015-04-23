package example.hungrystudent2;

import java.util.*;

import android.app.*;
import android.content.*;
import android.net.*;
import android.os.*;
import android.view.*;
import android.widget.*;

public class Fastfood_1 extends Activity{
	ExpandableListAdapter listAdapter;
	ExpandableListView expListView;
	List<String> listDataHeader;
	HashMap<String, List<String>> listDataChild;

	protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fastfood_1);
        ImageButton a = (ImageButton)findViewById(R.id.call_fastfood1);

        a.setOnClickListener(new ImageButton.OnClickListener(){

			@Override
			public void onClick(View v) {
				startActivity(new Intent("android.intent.action.CALL",Uri.parse("tel:042-825-9259")));
				
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
		listDataHeader.add("���Ÿ޴�");
		listDataHeader.add("���̵�޴�");
		listDataHeader.add("ġŲ");
		listDataHeader.add("Ȩ��� ��Ʈ�޴�");


		
		// Adding child data
		List<String> menu1 = new ArrayList<String>();
		menu1.add("1,5000�� �̻� ���Ž� ��ް����մϴ�.");
		menu1.add("���̹��� ��ǰ 3,200��");
		menu1.add("���̹��� ��Ʈ 5,400��");
		menu1.add("���÷��� ������ ��ǰ 4,000��");
		menu1.add("���÷��� ������ ��Ʈ 6,200��");
		menu1.add("���÷��� �밡������� ��ǰ 4,000��");
		menu1.add("���÷��� �밡������� ��Ʈ 6,200��");
		menu1.add("�����ظ��� ������ ��ǰ 3,700��");
		menu1.add("�����ظ��� ������ ��Ʈ 5,900��");
		menu1.add("�����ظ��� �밡������� ��ǰ 3,700��");
		menu1.add("�����ظ��� �밡������� ��Ʈ 5,900��");
		menu1.add("�Ұ����� ��ǰ 2,800��");
		menu1.add("�Ұ����� ��Ʈ 5,000��");
		menu1.add("�Ҷ��Ǵ� ������ ��ǰ 3,700��");
		menu1.add("�Ҷ��Ǵ� ������ ��Ʈ 5,900��");
		menu1.add("�Ҷ��Ǵ� �밡������� ��ǰ 3,700��");
		menu1.add("�Ҷ��Ǵ� �밡������� ��Ʈ 5,900��");
		menu1.add("��ġ�� �ٷ����� ��ǰ 3,700��");
		menu1.add("��ġ�� �ٷ����� ��Ʈ 5,900��");
		menu1.add("�ٷ����� ��ǰ 3,400��");
		menu1.add("�ٷ����� ��Ʈ 5,600��");
		menu1.add("�������� ��ǰ 2,700��");
		menu1.add("�������� ��Ʈ 4,900��");
		menu1.add("ġŲġ����� ��ǰ 2,500��");
		menu1.add("ġŲġ����� ��Ʈ 4,700��");
		menu1.add("ġŲ���� ��ǰ 2,200��");
		menu1.add("ġŲ���� ��Ʈ 4,400��");
		
		
		
		List<String> menu2 = new ArrayList<String>();
		menu2.add("��������ġ� 2,500��");
		menu2.add("�����ķ�ġ�� 2,000��");
		menu2.add("�������ܺ� 2,500��");
		menu2.add("����ġ� 2,500��");
		menu2.add("�����ؾ�䰨�� 1,700��");
		menu2.add("ġ�ƽ(2����) 1,600��");
		menu2.add("ġŲ������ 2,500��");
		menu2.add("�ٴ�����(2����) 2,00��");
		menu2.add("���� �Ķ��̵�(2����) 2,500��, 1set 11,000��");
		menu2.add("����/�ܿ���/�� ������ 1,500��");
		menu2.add("�ٷ� 2,500��");

		List<String> menu3 = new ArrayList<String>();
		menu3.add("�Ķ��̵�ġŲ 15,000��");
		menu3.add("�Ķ��̵��/���� 16,000��");
		menu3.add("���Ķ��̵�ġŲ 16,000��");
		menu3.add("���Ķ��̵��/���� 17,000��");
		menu3.add("�������ġŲ 16,000��");
		menu3.add("�ſ���ġŲ 17,000��");
		menu3.add("����ġŲ(�Ƚ�) 15,000��");
		menu3.add("������ġŲ 16,000��");
		menu3.add("�����߳�ġŲ 16,000��");
		menu3.add("���쵥���߳� 16,000��(����Ѹ�,�ſ�� ����)");
		menu3.add("�����ذ���(��) 16,000��");
		menu3.add("�����ذ���(�̱�) 3,000��");
		menu3.add("�����ذ���(Ŀ��) 6,000��");
		
		
		List<String> menu4 = new ArrayList<String>();
		menu4.add("Ȩ��ƮA: ����ġŲ�ݸ���(8����)+���̹���+�����ؾ�䰨��+�ݶ� 500ml 13,000��");
		menu4.add("Ȩ��ƮB: ����ġŲ�ݸ���+���̹���+�Ұ�����+��䰨��+�ݶ� 500ml 15,000��");
		menu4.add("Ȩ��ƮC: ����ġŲ�ݸ���+���̹���+���÷���������+��䰨��+�ݶ� 500ml 17,000��");
		menu4.add("Ȩ��ƮD: ����ġŲ�Ѹ���(16����)+���̹���+��䰨��+�ݶ� 500ml 20,000��");
		menu4.add("Ȩ��ƮE: ġŲ�Ѹ���+���̹���+��������+��䰨��+�ݶ� 500ml 23,000��");
		menu4.add("Ȩ��ƮF: ġŲ�Ѹ���+��������+�Ұ�����+��䰨��+������ ��1+�ݶ� 500ml 24,000��");
		menu4.add("Ȩ��ƮG: �����ذ���(��)+���̹���+���÷��̽�������+ġ�ƽ+������ ��1+�ݶ� 500ml 26,500��");
		
		
		
		listDataChild.put(listDataHeader.get(0), menu1); // Header, Child data
		listDataChild.put(listDataHeader.get(1), menu2);
		listDataChild.put(listDataHeader.get(2), menu3);
		listDataChild.put(listDataHeader.get(3), menu4);
	}

}
