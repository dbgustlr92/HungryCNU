package example.hungrystudent2;


import java.util.*;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.*;

public class Pizza_2 extends Activity{
	ExpandableListAdapter listAdapter;
	ExpandableListView expListView;
	List<String> listDataHeader;
	HashMap<String, List<String>> listDataChild;

	
	protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pizza_2);
        ImageButton a = (ImageButton)findViewById(R.id.call_pizza2);

        a.setOnClickListener(new ImageButton.OnClickListener(){

			@Override
			public void onClick(View v) {
				startActivity(new Intent("android.intent.action.CALL",Uri.parse("tel:042-823-9297")));
				
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
		listDataHeader.add("ġŲ");
		listDataHeader.add("����");

		
		// Adding child data
		List<String> menu1 = new ArrayList<String>();	//��Ʈ�޴�
		menu1.add("��ġ��Ʈ(�޺���̼�����+�Ķ��̵�ġŲ)M  14,900��");
		menu1.add("��ġ��Ʈ(�޺���̼�����+�Ķ��̵�ġŲ)L  17,900��");
		menu1.add("ġ����ġ��Ʈ(ġ������+�Ķ��̵�)M  14,900��");
		menu1.add("ġ����ġ��Ʈ(ġ������+�Ķ��̵�)L  17,900��");
		menu1.add("ũ���̾�Ͼ���ġ��Ʈ(ũ���̾�Ͼ�����+�Ķ��̵�+�ݶ�)M  17,900��");
		menu1.add("ũ���̾�Ͼ���ġ��Ʈ(ũ���̾�Ͼ�����+�Ķ��̵�+�ݶ�)L  20,900��");
		menu1.add("����Ʈ�Ұ����ġ��Ʈ(����Ʈ�Ұ������+�Ķ��̵�+�ݶ�)M  17,000��");
		menu1.add("����Ʈ�Ұ����ġ��Ʈ(����Ʈ�Ұ������+�Ķ��̵�+�ݶ�)L  20,900��");
		menu1.add("��������������ġ��Ʈ(����������������+�Ķ��̵�+�ݶ�)M  17,900��");
		menu1.add("��������������ġ��Ʈ(����������������+�Ķ��̵�+�ݶ�)L  20,900��");		
		menu1.add("������ġ��Ʈ(��������+�Ķ��̵�+�ݶ�)M  17,900��");
		menu1.add("������ġ��Ʈ(��������+�Ķ��̵�+�ݶ�)L  20,900��");
		menu1.add("ġ��ũ��������ġ��Ʈ(�޺���̼�+ġ��ũ������+�ݶ�)M  17,900��");
		menu1.add("ġ��ũ��������ġ��Ʈ(�޺���̼�+ġ��ũ������+�ݶ�)L  20,900��");	
		menu1.add("������ġ��Ʈ(����ġŲ+�޺���̼�+ĥ���ҽ�+�ݶ�)M  17,900��");
		menu1.add("������ġ��Ʈ(����ġŲ+�޺���̼�+ĥ���ҽ�+�ݶ�)L  20,900��");
		menu1.add("����������ġ��Ʈ(������������+�Ķ��̵�+�ݶ�)L  21,900��");
		menu1.add("������������ġ��Ʈ(��������������+�Ķ��̵�+�ݶ�)M  18,900��");
		menu1.add("������������ġ��Ʈ(��������������+�Ķ��̵�+�ݶ�)L  21,900��");	
		menu1.add("��ϰ�����ġ��Ʈ(��ϰ���ġŲ+�޺���̼�+�ݶ�)M  18,900��");
		menu1.add("��ϰ�����ġ��Ʈ(��ϰ���ġŲ+�޺���̼�+�ݶ�)L  21,900��");		
		menu1.add("���콬���������ġ��Ʈ(���콬�������+�޺���̼�+�ݶ�)M  18,900��");
		menu1.add("���콬���������ġ��Ʈ(���콬�������+�޺���̼�+�ݶ�)L  21,900��");		
		menu1.add("����������������ġ��Ʈ(������������������+�Ķ��̵�+�ݶ�)M  19,900��");
		menu1.add("����������������ġ��Ʈ(������������������+�Ķ��̵�+�ݶ�)L  22,900��");		
		
		List<String> menu2 = new ArrayList<String>();	//ġŲ
		menu2.add("�Ķ��̵�ġŲ+�ݶ�   11,000��");
		menu2.add("���ġŲ+�ݶ�   12,000��");
		menu2.add("����ġŲ+�ݶ�   12,000��");
		menu2.add("��ϰ���ġŲ+�ݶ�   14,000��");
		menu2.add("���콬�������ġŲ+�ݶ�   14,000��");
		menu2.add("����ߴٸ�ġŲ+�ݶ�   14,000��");

		List<String> menu3 = new ArrayList<String>();	//����
		menu3.add("�޺���̼�����M+�ݶ�   10,900��");
		menu3.add("�޺���̼�����L+�ݶ�   13,900��");
		menu3.add("���۷δ�����M+�ݶ�   10,900��");
		menu3.add("���۷δ�����L+�ݶ�   13,900��");
		menu3.add("ġ������M+�ݶ�   10,900��");
		menu3.add("ġ������L+�ݶ�   13,900��");
		menu3.add("ũ���̾�Ͼ�����M+�ݶ�   13,900��");
		menu3.add("ũ���̾�Ͼ�����L+�ݶ�   16,900��");
		menu3.add("����Ʈ�Ұ������M+�ݶ�   13,900��");
		menu3.add("����Ʈ�Ұ������L+�ݶ�   16,900��");
		menu3.add("����������������M+�ݶ�   13,900��");
		menu3.add("����������������L+�ݶ�   16,900��");
		menu3.add("�ָ�ġ����M+�ݶ�   13,900��");
		menu3.add("�ָ�ġ����L+�ݶ�   16,900��");
		menu3.add("��������M+�ݶ�   13,900��");
		menu3.add("��������L+�ݶ�   16,900��");
		menu3.add("��������������M+�ݶ�   14,900��");
		menu3.add("��������������L+�ݶ�   17,9000��");
		menu3.add("������������������M+�ݶ�   14,900��");
		menu3.add("������������������L+�ݶ�   17,900��");
		menu3.add("������������L+�ݶ�   17,900��");
		
		
		
		listDataChild.put(listDataHeader.get(0), menu1); // Header, Child data
		listDataChild.put(listDataHeader.get(1), menu2);
		listDataChild.put(listDataHeader.get(2), menu3);
	
	}

}
