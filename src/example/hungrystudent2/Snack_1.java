package example.hungrystudent2;

import java.util.*;

import android.app.*;
import android.content.*;
import android.net.*;
import android.os.*;
import android.view.*;
import android.widget.*;

public class Snack_1 extends Activity{
	ExpandableListAdapter listAdapter;
	ExpandableListView expListView;
	List<String> listDataHeader;
	HashMap<String, List<String>> listDataChild;

	protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.snack_1);
        ImageButton a = (ImageButton)findViewById(R.id.call_snack1);

        a.setOnClickListener(new ImageButton.OnClickListener(){

			@Override
			public void onClick(View v) {
				startActivity(new Intent("android.intent.action.CALL",Uri.parse("tel:042-826-7008")));
				
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
		listDataHeader.add("�Ŷ��޴�");
		listDataHeader.add("�Ļ��");
		listDataHeader.add("���");
		listDataHeader.add("����");
		listDataHeader.add("Ƣ���");
		listDataHeader.add("���� / ����");
		listDataHeader.add("�������꽺");
		listDataHeader.add("�佺Ʈ");
		listDataHeader.add("��Ʈ�޴�");

		
		// Adding child data
		List<String> top250 = new ArrayList<String>();
		top250.add("���߸���  1,000��");
		top250.add("�Ŷ�(����ſ��)  2,500��");
		top250.add("�Ŷ�(���޴����Ѹ�)  2,500��");
		top250.add("¥��(����¥���)  2,500��");
		top250.add("ī��(����ī����)  2,500��");
		top250.add("��ū����  3,500��");
		top250.add("������  3,500��");
		top250.add("���Ҽ���  4,000��");
		top250.add("ġ��(ġ�����)  4,500��");
		top250.add("����  7,000��");
		top250.add("�̴���ݶ�����  7,000��");
		top250.add("������ݶ�����  14,000��");
		
		
		
		List<String> nowShowing = new ArrayList<String>();
		nowShowing.add("�ܾ�ä���̽�   5,500��");
		nowShowing.add("������̽�   5,500��");
		nowShowing.add("�ع����̽�   5,500��");
		nowShowing.add("��ġ���̽�   5,500��");
		nowShowing.add("�������̽�   5,500��");
		nowShowing.add("������   5,500��");
		nowShowing.add("ġ��   6,000��");
		

		List<String> comingSoon = new ArrayList<String>();
		comingSoon.add("������   3,500��");
		comingSoon.add("�������   4,000��");
		comingSoon.add("ġ����   4,000��");
		comingSoon.add("��ġ���   4,000��");
		comingSoon.add("��ġ���   4,000��");
		comingSoon.add("����쵿   4,000��");
		comingSoon.add("�����   4,000��");
		comingSoon.add("�����쵿   4,500��");
		comingSoon.add("��ġ�쵿   4,500��");
		comingSoon.add("�����쵿   4,500��");
		comingSoon.add("�������쵿   4,500��");
		
		
		List<String> gimbab = new ArrayList<String>();
		gimbab.add("���߱��   2,500��");
		gimbab.add("�������   2,500��");
		gimbab.add("��ġ�ָԹ�   3,000��");
		gimbab.add("�����ָԹ�   3,000��");
		gimbab.add("�Ұ����   3,000��");
		gimbab.add("��ġ��ġ���   3,000��");
		gimbab.add("�Ұ��ġ����   3,000��");
		gimbab.add("��������   3,000��");
		gimbab.add("��ġġ����   3,000��");
		gimbab.add("��ġ���   3,000��");
		
		
		List<String> menu4 = new ArrayList<String>(); //Ƣ��
		menu4.add("Ƣ����   1,000��");
		menu4.add("Ƣ����   1,000��");
		menu4.add("Ƣ����   1,000��");
		menu4.add("������   1,500��");
		menu4.add("ġ�ƽ   1,500��");
		menu4.add("��¡�   1,500��");
		menu4.add("�踻��   1,500��");
		menu4.add("���ޱ踻��   1,500��");
		menu4.add("Ƣ����   1,500��");
		menu4.add("��������   1,500��");
		menu4.add("��������   4,000��");
		
		List<String> menu5 = new ArrayList<String>();	//����/����
		menu5.add("����   1,500��");
		menu5.add("���ǽ�   1,500��");
		menu5.add("�ݶ�(500ml)   1,500��");
		menu5.add("���̴�(500ml)   1,500��");
		menu5.add("��ġ��(������)   1,500��");
		menu5.add("����   2,000��");
		menu5.add("�Ϻ���   5,000��");
		
		
		
		
		List<String> menu6 = new ArrayList<String>();	//������
		menu6.add("�����꽺   2,500��");
		menu6.add("�ٳ����꽺   2,500��");
		menu6.add("Ű���꽺   2,500��");
		menu6.add("�̼�����   2,500��");
		
		List<String> menu7 = new ArrayList<String>();	//�佺Ʈ
		menu7.add("ġŲ����佺Ʈ   2,500��");
		
		List<String> menu8 = new ArrayList<String>();	//��Ʈ�޴�
		menu8.add("�⺻�޴�(��+Ƣ����+Ƣ����)   4,500��");
		menu8.add("Ƣ���̼�Ʈ(�⺻+Ƣ����+���ǽ�)   7,000��");
		menu8.add("�佺Ʈ��Ʈ(�⺻+�佺Ʈ+���ǽ�)   8,000��");
		menu8.add("������Ʈ(�⺻+����)   9,000��");
		menu8.add("��ū������Ʈ(�⺻+��ū����+���ǽ�)   9,000��");
		menu8.add("�����쵿��Ʈ(�⺻+�����쵿+���ǽ�)   10,000��");
		menu8.add("���̽���Ʈ(�⺻+���̽�+���ǽ�)   11,000��");
		menu8.add("������Ʈ(�⺻+���߱��+�������+���ǽ�)   12,000��");
		menu8.add("���뼼Ʈ(�⺻+��(����1)+���Ҽ���+���ǽ�)   12,000��");
		menu8.add("��뼼Ʈ(�⺻+Ƣ����+���߱��+��ū����+���ǽ�)   12,500��");
		menu8.add("��ݶ����̼�Ʈ(������ݶ�����+���߱��+���ǽ�)   17,000��");
		
		
		
		listDataChild.put(listDataHeader.get(0), top250); // Header, Child data
		listDataChild.put(listDataHeader.get(1), nowShowing);
		listDataChild.put(listDataHeader.get(2), comingSoon);
		listDataChild.put(listDataHeader.get(3), gimbab);
		listDataChild.put(listDataHeader.get(4), menu4);
		listDataChild.put(listDataHeader.get(5), menu5);
		listDataChild.put(listDataHeader.get(6), menu6);
		listDataChild.put(listDataHeader.get(7), menu7);
		listDataChild.put(listDataHeader.get(8), menu8);
	}

}
