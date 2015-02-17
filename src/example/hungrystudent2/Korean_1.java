package example.hungrystudent2;

import java.util.*;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.*;

public class Korean_1 extends Activity {
	ExpandableListAdapter listAdapter;
	ExpandableListView expListView;
	List<String> listDataHeader;
	HashMap<String, List<String>> listDataChild;

	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.korean_1);
		ImageButton a = (ImageButton) findViewById(R.id.call_korean1);

		a.setOnClickListener(new ImageButton.OnClickListener() {

			@Override
			public void onClick(View v) {
				startActivity(new Intent("android.intent.action.CALL", Uri
						.parse("tel:042-822-5442")));

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
		listDataHeader.add("���");
		listDataHeader.add("���");
		listDataHeader.add("�Ļ�");
		listDataHeader.add("�ʹ�");
		listDataHeader.add("��");
		listDataHeader.add("�н�");
		listDataHeader.add("��Ÿ");
		
		
		// Adding child data
		List<String> menu1 = new ArrayList<String>(); // ���
		menu1.add("�������   1,500��");
		menu1.add("��ġ���   2,500��");
		menu1.add("ġ����   3,000��");
		menu1.add("��ġ���   3,000��");
		menu1.add("�Ұ����   3,000��");
		menu1.add("������߱��   3,000��");
		menu1.add("���ʱ��   3,000��");
		menu1.add("������   3,000��");
		menu1.add("��ġġ����   3,500��");
		menu1.add("������̱��   3,500��");
		menu1.add("��ġ���ʱ��   3,500��");
		menu1.add("��ä��������   3,500��");
		menu1.add("��ġ�˱��   3,500��");
		menu1.add("��ġ������̱��   4,00��");
		menu1.add("��ġ�˱�ġ���   4,000��");
		
		
		
		List<String> menu2 = new ArrayList<String>(); // ���
		menu2.add("���   6,000��");
		menu2.add("�����   6,000��");
		menu2.add("�����ϵ��   6,500��");
		menu2.add("ġŲ���   6,500��");
		menu2.add("ī�����   6,500��");
		menu2.add("���ڵ��������ũ   7,000��");
		menu2.add("����ġ�����ũ   7,000��");
		menu2.add("ġ�����ũ   7,000��");
		menu2.add("�Թڽ�����ũ   7,000��");
		menu2.add("�Ƚɵ��   7,500��");
		menu2.add("ġ��ġŲ�   7,500��");
		menu2.add("ī��ġ��   7,500��");
		menu2.add("������ġ��   7,500��");
		menu2.add("���伣Ư����(���+�̸�+���+�����+�ʹ�)   8,500��");
		
		List<String> menu3 = new ArrayList<String>();	//�Ļ�
		menu3.add("�����   1,000��");
		menu3.add("��ġ����   5,500��");
		menu3.add("��������   5,500��");
		menu3.add("��ġ��ġ����   5,500��");
		menu3.add("�����   5,500��");
		menu3.add("ī������   5,500��");
		menu3.add("��ä��   5,500��");
		menu3.add("�����   5,500��");
		menu3.add("��ġ�   5,500��");
		menu3.add("��ġ�   5,500��");
		menu3.add("���κ��   5,500��");
		menu3.add("������ġ�   5,500��");
		menu3.add("û����   5,500��");
		menu3.add("�ᳪ����   5,500��");
		menu3.add("�̿���   5,500��");
		menu3.add("��ġ��   5,500��");
		menu3.add("��������   5,500��");
		menu3.add("��¡���   6,000��");
		menu3.add("���Ƕ��̽�   6,000��");
		menu3.add("��ġ������   6,000��");
		menu3.add("�ޱ��̵���   6,000��");
		menu3.add("�ҺҰ�ⵤ��   6,000��");
		menu3.add("��ġ��ġ������   6,000��");
		menu3.add("���캺����   6,000��");
		menu3.add("�ع�������   6,000��");
		menu3.add("�����ġ������   6,000��");
		menu3.add("������(���屹����)   6,000��");
		menu3.add("�ᳪ�������   6,000��");
		menu3.add("���ܺ����   6,000��");
		menu3.add("�ƿ�   6,000��");
		menu3.add("�ñ�ġ���屹   6,000��");
		menu3.add("�ð������屹   6,000��");
		menu3.add("�������̿���   6,000��");
		menu3.add("������   6,000��");
		menu3.add("��������   6,500��");
		menu3.add("�޻ﺺ����   6,500��");
		menu3.add("ġ��ܺ����   6,500��");
		menu3.add("�췷�����   6,500��");
		menu3.add("�����ġ����   6,500��");
		menu3.add("�һ����屹   6,500��");
		menu3.add("������   6,500��");
		menu3.add("Ȳ����   6,500��");
		menu3.add("������   6,500��");
		menu3.add("���ο�����   6,500��");
		menu3.add("���ܱ�ġġ�����   7,000��");
		menu3.add("�ѹ�ݰ���(���������)   7,000��");
		menu3.add("�̵����(2���̻���)   7,000��");
		menu3.add("�δ��   7,500��");
		menu3.add("������ġ��ġġ�����   7,500��");
		menu3.add("�����ӹ�����(2���̻���)   7,500��");
		menu3.add("�˹�   7,500��");
		menu3.add("�ҹ�⵿���   7,500��");
		menu3.add("�ҹ��ҺҰ��   7,500��");
		menu3.add("������  8,000��");
		menu3.add("�ҹ�Ⱘ����  8,000��");
		menu3.add("�ҹ�Ⱕ����  9,000��");
		menu3.add("�ѹ�����  11,000��");
		
		List<String> menu4 = new ArrayList<String>();	//�ʹ�
		menu4.add("�����ʹ�  6,000��");
		menu4.add("�����ʹ�  7,000��");
		menu4.add("��������ʹ�  7,000��");
		menu4.add("��ġ�ʹ�  7,000��");
		menu4.add("��ġȸ�ʹ�  7,000��");
		menu4.add("���칮���ʹ�  7,000��");
		menu4.add("Ư����ʹ�  12,000��");
		
		
		List<String> menu5 = new ArrayList<String>();	//��
		menu5.add("ȣ����   6,000��");
		menu5.add("������   6,000��");
		menu5.add("�Ұ���ä��   6,000��");
		menu5.add("������   8,000��");
		
		List<String> menu6 = new ArrayList<String>();	//�н�
		menu6.add("��⸸��   3,500��");
		menu6.add("��ġ����   3,500��");
		menu6.add("���   3,500��");
		menu6.add("����   4,000��");
		menu6.add("�쵿   4,000��");
		menu6.add("������   4,000��");	
		menu6.add("���ζ��   4,000��");
		menu6.add("ġ����   4,000��");
		menu6.add("��ġ���   4,000��");
		menu6.add("���ڶ��   4,000��");
		menu6.add("���(��ġ)�ո���   4,000��");
		menu6.add("��ġ�쵿   4,500��");
		menu6.add("���ο쵿   4,500��");
		menu6.add("�����ζ��   4,500��");
		menu6.add("������   4,500��");
		menu6.add("«�Ͷ��   5,000��");
		menu6.add("������   5,000��");
		menu6.add("�̸�   5,000��");
		menu6.add("ġ�����   5,000��");
		menu6.add("����   5,000��");
		menu6.add("¥�嶱����   5,000��");
		menu6.add("��ġ����   5,000��");
		menu6.add("ġ�����   5,500��");
		menu6.add("�ſ�¥�嶱����   5,500��");
		menu6.add("����   5,500��");
		menu6.add("���α�   5,500��");
		menu6.add("�����α�   5,500��");
		menu6.add("Į����   5,500��");
		menu6.add("��ġĮ����   5,500��");
		menu6.add("��ū��Į����  5,500��");
		menu6.add("�ع�Į����   5,500��");
		menu6.add("�ռ�����   5,500��");
		menu6.add("��ġ������   5,500��");
		menu6.add("��ū(�ع�)������   5,500��");
		menu6.add("���ڼ�����   5,500��");
		menu6.add("���(����)����   5,500��");
		menu6.add("����(��ġ)�������   5,500��");
		menu6.add("���ø�   5,500��");
		menu6.add("����ø�   5,500��");
		menu6.add("�����ø�   5,500��");
		menu6.add("�޹мҹ�   5,500��");
		menu6.add("�ع������쵿   6,000��");
		menu6.add("�������(�̸�+����)   6,000��");
		menu6.add("��ä�������   6,000��");
		menu6.add("�䵹�ᱹ��   6,000��");
		menu6.add("��������ø�   6,000��");
		menu6.add("�ع����İ�Ƽ   6,000��");
		menu6.add("ġ����콺�İ�Ƽ   6,000��");
		menu6.add("��ӳø�   7,000��");
		menu6.add("��Ӻ���ø�   7,500��");
		menu6.add("��Ӱ���߰�   2,500��");
		menu6.add("�ع�ũ�����İ�Ƽ   7,000��");
		
		
		
		List<String> menu7 = new ArrayList<String>();	//��Ÿ
		menu7.add("������������(2��)   20,000��");
		menu7.add("������������(3��)   25,000��");
		menu7.add("�ҳ������(2��)   19,000��");
		menu7.add("�ҳ�������(3��)   24,000��");
		menu7.add("�ҳ�������(4��)   30,000��");
		menu7.add("���������(2��)   19,000��");
		menu7.add("����������(3��)   24,000��");
		menu7.add("����������(4��)   30,000��");
		menu7.add("�����(2��)   19,000��");
		menu7.add("������(3��)   24,000��");
		menu7.add("������(4��)   30,000��");
		menu7.add("�δ���(2��)   16,000��");
		menu7.add("�δ����(3��)   22,000��");
		menu7.add("�δ����(4��)   27,000��");
		menu7.add("������(2��)   16,000��");
		menu7.add("�������(3��)   22,000��");
		menu7.add("�������(4��)   27,000��");
		menu7.add("�κε����η�ġ���(2��)   14,000��");
		menu7.add("�κε����η�ġ����(3��)   19,000��");
		menu7.add("�κε����η�ġ����(4��)   25,000��");
		menu7.add("�����������η�ġ���(2��)   17,000��");
		menu7.add("�����������η�ġ����(3��)   22,000��");
		menu7.add("�����������η�ġ����(4��)   27,000��");
		menu7.add("��¡��η�ġ���(2��)   16,000��");
		menu7.add("��¡��η�ġ����(3��)   21,000��");
		menu7.add("��¡��η�ġ����(4��)   25,000��");
		menu7.add("�����η�ġ���(2��)   18,000��");
		menu7.add("�����η�ġ����(3��)   23,000��");
		menu7.add("�����η�ġ����(4��)   27,000��");
		menu7.add("�޻�η�ġ����(3��)   20,000��");
		menu7.add("�޻�η�ġ����(4��)   25,000��");
		menu7.add("�ߵ������(2��)   22,000��");
		menu7.add("�ߵ�������(3��)   27,000��");
		menu7.add("�ߵ�������(4��)   31,000��");
		menu7.add("�������(2��)   20,000��");
		menu7.add("��������(3��)   27,000��");
		menu7.add("��������(4��)   32,000��");
		menu7.add("�ع����(2��)   22,000��");
		menu7.add("�ع�����(3��)   27,000��");
		menu7.add("�ع�����(4��)   32,000��");
		menu7.add("�������   12,000��");
		menu7.add("�κα�ġ   13,000��");
		menu7.add("�����´߹�   15,000��");
		menu7.add("����̻縮   15,000��");
		menu7.add("��������似Ʈ   6,000��");
		menu7.add("���α�����似Ʈ   6,000��");
		menu7.add("�����α�����似Ʈ   6,000��");


		
		listDataChild.put(listDataHeader.get(0), menu1); // Header, Child data
		listDataChild.put(listDataHeader.get(1), menu2);
		listDataChild.put(listDataHeader.get(2), menu3);
		listDataChild.put(listDataHeader.get(3), menu4);
		listDataChild.put(listDataHeader.get(4), menu5);
		listDataChild.put(listDataHeader.get(5), menu6);
		listDataChild.put(listDataHeader.get(6), menu7);

	}

}
