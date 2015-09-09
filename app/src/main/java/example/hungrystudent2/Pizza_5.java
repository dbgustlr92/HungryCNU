package example.hungrystudent2;

import java.util.*;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.*;


public class Pizza_5 extends Activity {
	ExpandableListAdapter listAdapter;
	ExpandableListView expListView;
	List<String> listDataHeader;
	HashMap<String, List<String>> listDataChild;


	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.pizza_5);
		
		ImageButton a = (ImageButton)findViewById(R.id.call_pizza5);

        a.setOnClickListener(new ImageButton.OnClickListener(){

			@Override
			public void onClick(View v) {
				startActivity(new Intent("android.intent.action.CALL",Uri.parse("tel:042-823-8874")));
				
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
		listDataHeader.add("���۽���������");
		listDataHeader.add("�Ұ������");
		listDataHeader.add("���ķδ�����");
		listDataHeader.add("��ä���̾�Ʈ����");
		listDataHeader.add("��(�ſ�)����");
		listDataHeader.add("�Ͽ��̾�����");
		listDataHeader.add("�Ұ�������");
		listDataHeader.add("�׸��ٺ�ťġŲ");
		listDataHeader.add("�������亣��������");
		listDataHeader.add("�������ӽ�Ÿ������");
		listDataHeader.add("������������");
		listDataHeader.add("�޺�ġ����");
		listDataHeader.add("��ġŲ����");
		listDataHeader.add("��ȣ������");
		listDataHeader.add("������ũ����");
		listDataHeader.add("��Ÿ");
		listDataHeader.add("�˶㼼Ʈ");
		listDataHeader.add("���İ�Ƽ&���̵�޴�");
		listDataHeader.add("�߰��޴�");
		

		// Adding child data
		List<String> menu1 = new ArrayList<String>();	//���۽���������
		menu1.add("ġ�����ƮR   17,000��");
		menu1.add("ġ�����ƮL   22,000��");
		menu1.add("ġ�����ƮF   28,000��");
		menu1.add("������R   11,000��");
		menu1.add("������L   15,000��");
		menu1.add("��ũ������R   11,000��");
		menu1.add("��ũ������L   15,000��");
		menu1.add("�� ����R   11,000��");
		menu1.add("�� ����L   15,000��");
		menu1.add("ġ��ũ����ƮR   14,000��");
		menu1.add("ġ��ũ����ƮL   18,000��");
		menu1.add("ġ��ũ����ƮF   23,000��");
		menu1.add("���� ��� ũ����ƮR   16,000��");
		menu1.add("���� ��� ũ����ƮL   20,000��");
		menu1.add("���� ��� ũ����ƮF   25,000��");
		menu1.add("���� ��ġ ���R   16,000��");
		menu1.add("���� ��ġ ���L   20,000��");
		menu1.add("���� ��ġ ���F   25,000��");				
		
		
		List<String> menu2 = new ArrayList<String>();	//�Ұ������
		menu2.add("ġ�����ƮR   17,000��");
		menu2.add("ġ�����ƮL   22,000��");
		menu2.add("ġ�����ƮF   28,000��");
		menu2.add("������R   11,000��");
		menu2.add("������L   15,000��");
		menu2.add("��ũ������R   11,000��");
		menu2.add("��ũ������L   15,000��");
		menu2.add("��ũ������F   19,000��");
		menu2.add("�� ����R   11,000��");
		menu2.add("�� ����L   15,000��");
		menu2.add("ġ��ũ����ƮR   14,000��");
		menu2.add("ġ��ũ����ƮL   18,000��");
		menu2.add("ġ��ũ����ƮF   23,000��");
		menu2.add("���� ��� ũ����ƮR   16,000��");
		menu2.add("���� ��� ũ����ƮL   20,000��");
		menu2.add("���� ��� ũ����ƮF   25,000��");
		menu2.add("���� ��ġ ���R   16,000��");
		menu2.add("���� ��ġ ���L   20,000��");
		menu2.add("���� ��ġ ���F   25,000��");


		List<String> menu3 = new ArrayList<String>();	//���۷δ� ����
		menu3.add("ġ�����ƮR   17,000��");
		menu3.add("ġ�����ƮL   22,000��");
		menu3.add("ġ�����ƮF   28,000��");
		menu3.add("������R   11,000��");
		menu3.add("������L   15,000��");
		menu3.add("��ũ������R   11,000��");
		menu3.add("��ũ������L   15,000��");
		menu3.add("��ũ������F   19,000��");
		menu3.add("�� ����R   11,000��");
		menu3.add("�� ����L   15,000��");
		menu3.add("ġ��ũ����ƮR   14,000��");
		menu3.add("ġ��ũ����ƮL   18,000��");
		menu3.add("ġ��ũ����ƮF   23,000��");
		menu3.add("���� ��� ũ����ƮR   16,000��");
		menu3.add("���� ��� ũ����ƮL   20,000��");
		menu3.add("���� ��� ũ����ƮF   25,000��");
		menu3.add("���� ��ġ ���R   16,000��");
		menu3.add("���� ��ġ ���L   20,000��");
		menu3.add("���� ��ġ ���F   25,000��");

		List<String> menu4 = new ArrayList<String>();	//��ä���̾�Ʈ ����
		menu4.add("ġ�����ƮR   17,000��");
		menu4.add("ġ�����ƮL   22,000��");
		menu4.add("ġ�����ƮF   28,000��");
		menu4.add("������R   11,000��");
		menu4.add("������L   15,000��");
		menu4.add("��ũ������R   11,000��");
		menu4.add("��ũ������L   15,000��");
		menu4.add("��ũ������F   19,000��");
		menu4.add("�� ����R   11,000��");
		menu4.add("�� ����L   15,000��");
		menu4.add("ġ��ũ����ƮR   14,000��");
		menu4.add("ġ��ũ����ƮL   18,000��");
		menu4.add("ġ��ũ����ƮF   23,000��");
		menu4.add("���� ��� ũ����ƮR   16,000��");
		menu4.add("���� ��� ũ����ƮL   20,000��");
		menu4.add("���� ��� ũ����ƮF   25,000��");
		menu4.add("���� ��ġ ���R   16,000��");
		menu4.add("���� ��ġ ���L   20,000��");
		menu4.add("���� ��ġ ���F   25,000��");


		List<String> menu5 = new ArrayList<String>();	//��(�ſ�) ����
		menu5.add("ġ�����ƮR   18,000��");
		menu5.add("ġ�����ƮL   23,000��");
		menu5.add("ġ�����ƮF   29,000��");
		menu5.add("������R   12,000��");
		menu5.add("������L   16,000��");
		menu5.add("��ũ������R   12,000��");
		menu5.add("��ũ������L   16,000��");
		menu5.add("��ũ������F   21,000��");
		menu5.add("�� ����R   12,000��");
		menu5.add("�� ����L   16,000��");
		menu5.add("ġ��ũ����ƮR   15,000��");
		menu5.add("ġ��ũ����ƮL   19,000��");
		menu5.add("ġ��ũ����ƮF   24,000��");
		menu5.add("���� ��� ũ����ƮR   17,000��");
		menu5.add("���� ��� ũ����ƮL   21,000��");
		menu5.add("���� ��� ũ����ƮF   26,000��");
		menu5.add("���� ��ġ ���R   17,000��");
		menu5.add("���� ��ġ ���L   21,000��");
		menu5.add("���� ��ġ ���F   26,000��");


		List<String> menu6 = new ArrayList<String>();	//�Ͽ��̾� ����
		menu6.add("ġ�����ƮR   17,000��");
		menu6.add("ġ�����ƮL   22,000��");
		menu6.add("ġ�����ƮF   28,000��");
		menu6.add("������R   11,000��");
		menu6.add("������L   15,000��");
		menu6.add("��ũ������R   11,000��");
		menu6.add("��ũ������L   15,000��");
		menu6.add("��ũ������F   19,000��");
		menu6.add("�� ����R   11,000��");
		menu6.add("�� ����L   15,000��");
		menu6.add("ġ��ũ����ƮR   14,000��");
		menu6.add("ġ��ũ����ƮL   18,000��");
		menu6.add("ġ��ũ����ƮF   23,000��");
		menu6.add("���� ��� ũ����ƮR   16,000��");
		menu6.add("���� ��� ũ����ƮL   20,000��");
		menu6.add("���� ��� ũ����ƮF   25,000��");
		menu6.add("���� ��ġ ���R   16,000��");
		menu6.add("���� ��ġ ���L   20,000��");
		menu6.add("���� ��ġ ���F   25,000��");


		List<String> menu7 = new ArrayList<String>();	//�Ұ��� ����
		menu7.add("ġ�����ƮR   18,000��");
		menu7.add("ġ�����ƮL   23,000��");
		menu7.add("ġ�����ƮF   29,000��");
		menu7.add("������R   12,000��");
		menu7.add("������L   16,000��");
		menu7.add("��ũ������R   12,000��");
		menu7.add("��ũ������L   16,000��");
		menu7.add("��ũ������F   21,000��");
		menu7.add("�� ����R   12,000��");
		menu7.add("�� ����L   16,000��");
		menu7.add("ġ��ũ����ƮR   15,000��");
		menu7.add("ġ��ũ����ƮL   19,000��");
		menu7.add("ġ��ũ����ƮF   24,000��");
		menu7.add("���� ��� ũ����ƮR   17,000��");
		menu7.add("���� ��� ũ����ƮL   21,000��");
		menu7.add("���� ��� ũ����ƮF   26,000��");
		menu7.add("���� ��ġ ���R   17,000��");
		menu7.add("���� ��ġ ���L   21,000��");
		menu7.add("���� ��ġ ���F   26,000��");

		List<String> menu8 = new ArrayList<String>();	//�׸��ٺ�ťġŲ ����
		menu8.add("ġ�����ƮR   19,000��");
		menu8.add("ġ�����ƮL   24,000��");
		menu8.add("ġ�����ƮF   30,000��");
		menu8.add("������R   13,000��");
		menu8.add("������L   17,000��");
		menu8.add("��ũ������R   13,000��");
		menu8.add("��ũ������L   17,000��");
		menu8.add("��ũ������F   22,000��");
		menu8.add("�� ����R   12,000��");
		menu8.add("�� ����L   16,000��");
		menu8.add("ġ��ũ����ƮR   16,000��");
		menu8.add("ġ��ũ����ƮL   20,000��");
		menu8.add("ġ��ũ����ƮF   25,000��");
		menu8.add("���� ��� ũ����ƮR   18,000��");
		menu8.add("���� ��� ũ����ƮL   22,000��");
		menu8.add("���� ��� ũ����ƮF   27,000��");
		menu8.add("���� ��ġ ���R   18,000��");
		menu8.add("���� ��ġ ���L   22,000��");
		menu8.add("���� ��ġ ���F   27,000��");

		List<String> menu9 = new ArrayList<String>();	//�������亣�������� ����
		menu9.add("ġ�����ƮR   19,000��");
		menu9.add("ġ�����ƮL   24,000��");
		menu9.add("ġ�����ƮF   30,000��");
		menu9.add("������R   13,000��");
		menu9.add("������L   17,000��");
		menu9.add("��ũ������R   13,000��");
		menu9.add("��ũ������L   17,000��");
		menu9.add("��ũ������F   22,000��");
		menu9.add("�� ����R   12,000��");
		menu9.add("�� ����L   16,000��");
		menu9.add("ġ��ũ����ƮR   16,000��");
		menu9.add("ġ��ũ����ƮL   20,000��");
		menu9.add("ġ��ũ����ƮF   25,000��");
		menu9.add("���� ��� ũ����ƮR   18,000��");
		menu9.add("���� ��� ũ����ƮL   22,000��");
		menu9.add("���� ��� ũ����ƮF   27,000��");
		menu9.add("���� ��ġ ���R   18,000��");
		menu9.add("���� ��ġ ���L   22,000��");
		menu9.add("���� ��ġ ���F   27,000��");

		List<String> menu10 = new ArrayList<String>();	//�������ӽ�Ÿ�� ����
		menu10.add("ġ�����ƮR   19,000��");
		menu10.add("ġ�����ƮL   24,000��");
		menu10.add("ġ�����ƮF   30,000��");
		menu10.add("������R   13,000��");
		menu10.add("������L   17,000��");
		menu10.add("��ũ������R   13,000��");
		menu10.add("��ũ������L   17,000��");
		menu10.add("��ũ������F   22,000��");
		menu10.add("�� ����R   12,000��");
		menu10.add("�� ����L   16,000��");
		menu10.add("ġ��ũ����ƮR   16,000��");
		menu10.add("ġ��ũ����ƮL   20,000��");
		menu10.add("ġ��ũ����ƮF   25,000��");
		menu10.add("���� ��� ũ����ƮR   18,000��");
		menu10.add("���� ��� ũ����ƮL   22,000��");
		menu10.add("���� ��� ũ����ƮF   27,000��");
		menu10.add("���� ��ġ ���R   18,000��");
		menu10.add("���� ��ġ ���L   22,000��");
		menu10.add("���� ��ġ ���F   27,000��");

		List<String> menu11 = new ArrayList<String>();	//�������� ����
		menu11.add("ġ�����ƮR   20,000��");
		menu11.add("ġ�����ƮL   25,000��");
		menu11.add("ġ�����ƮF   31,000��");
		menu11.add("������R   14,000��");
		menu11.add("������L   18,000��");
		menu11.add("��ũ������R   14,000��");
		menu11.add("��ũ������L   18,000��");
		menu11.add("��ũ������F   23,000��");
		menu11.add("�� ����R   13,000��");
		menu11.add("�� ����L   17,000��");
		menu11.add("ġ��ũ����ƮR   17,000��");
		menu11.add("ġ��ũ����ƮL   21,000��");
		menu11.add("ġ��ũ����ƮF   26,000��");
		menu11.add("���� ��� ũ����ƮR   19,000��");
		menu11.add("���� ��� ũ����ƮL   23,000��");
		menu11.add("���� ��� ũ����ƮF   28,000��");
		menu11.add("���� ��ġ ���R   19,000��");
		menu11.add("���� ��ġ ���L   23,000��");
		menu11.add("���� ��ġ ���F   28,000��");

		List<String> menu12 = new ArrayList<String>();	//�޺�ġ ����
		menu12.add("ġ�����ƮR   19,000��");
		menu12.add("ġ�����ƮL   24,000��");
		menu12.add("ġ�����ƮF   30,000��");
		menu12.add("������R   13,000��");
		menu12.add("������L   17,000��");
		menu12.add("��ũ������R   13,000��");
		menu12.add("��ũ������L   17,000��");
		menu12.add("��ũ������F   22,000��");
		menu12.add("�� ����R   12,000��");
		menu12.add("�� ����L   16,000��");
		menu12.add("ġ��ũ����ƮR   16,000��");
		menu12.add("ġ��ũ����ƮL   20,000��");
		menu12.add("ġ��ũ����ƮF   25,000��");
		menu12.add("���� ��� ũ����ƮR   18,000��");
		menu12.add("���� ��� ũ����ƮL   22,000��");
		menu12.add("���� ��� ũ����ƮF   27,000��");
		menu12.add("���� ��ġ ���R   18,000��");
		menu12.add("���� ��ġ ���L   22,000��");
		menu12.add("���� ��ġ ���F   27,000��");

		List<String> menu13 = new ArrayList<String>();	//��ġŲ ����
		menu13.add("ġ�����ƮR   19,000��");
		menu13.add("ġ�����ƮL   24,000��");
		menu13.add("ġ�����ƮF   30,000��");
		menu13.add("������R   13,000��");
		menu13.add("������L   17,000��");
		menu13.add("��ũ������R   13,000��");
		menu13.add("��ũ������L   17,000��");
		menu13.add("��ũ������F   22,000��");
		menu13.add("�� ����R   12,000��");
		menu13.add("�� ����L   16,000��");
		menu13.add("ġ��ũ����ƮR   16,000��");
		menu13.add("ġ��ũ����ƮL   20,000��");
		menu13.add("ġ��ũ����ƮF   25,000��");
		menu13.add("���� ��� ũ����ƮR   18,000��");
		menu13.add("���� ��� ũ����ƮL   22,000��");
		menu13.add("���� ��� ũ����ƮF   27,000��");
		menu13.add("���� ��ġ ���R   18,000��");
		menu13.add("���� ��ġ ���L   22,000��");
		menu13.add("���� ��ġ ���F   27,000��");
		

		List<String> menu14 = new ArrayList<String>();	//��ȣ�� ����
		menu14.add("ġ�����ƮR   19,000��");
		menu14.add("ġ�����ƮL   24,000��");
		menu14.add("ġ�����ƮF   30,000��");
		menu14.add("������R   13,000��");
		menu14.add("������L   17,000��");
		menu14.add("��ũ������R   13,000��");
		menu14.add("��ũ������L   17,000��");
		menu14.add("��ũ������F   22,000��");
		menu14.add("�� ����R   12,000��");
		menu14.add("�� ����L   16,000��");
		menu14.add("ġ��ũ����ƮR   16,000��");
		menu14.add("ġ��ũ����ƮL   20,000��");
		menu14.add("ġ��ũ����ƮF   25,000��");
		menu14.add("���� ��� ũ����ƮR   18,000��");
		menu14.add("���� ��� ũ����ƮL   22,000��");
		menu14.add("���� ��� ũ����ƮF   27,000��");
		menu14.add("���� ��ġ ���R   18,000��");
		menu14.add("���� ��ġ ���L   22,000��");
		menu14.add("���� ��ġ ���F   27,000��");

		List<String> menu15 = new ArrayList<String>();	//������ũ ����
		menu15.add("ġ�����ƮR   20,000��");
		menu15.add("ġ�����ƮL   25,000��");
		menu15.add("ġ�����ƮF   31,000��");
		menu15.add("������R   14,000��");
		menu15.add("������L   18,000��");
		menu15.add("��ũ������R   14,000��");
		menu15.add("��ũ������L   18,000��");
		menu15.add("��ũ������F   23,000��");
		menu15.add("�� ����R   13,000��");
		menu15.add("�� ����L   17,000��");
		menu15.add("ġ��ũ����ƮR   17,000��");
		menu15.add("ġ��ũ����ƮL   21,000��");
		menu15.add("ġ��ũ����ƮF   26,000��");
		menu15.add("���� ��� ũ����ƮR   19,000��");
		menu15.add("���� ��� ũ����ƮL   23,000��");
		menu15.add("���� ��� ũ����ƮF   28,000��");
		menu15.add("���� ��ġ ���R   19,000��");
		menu15.add("���� ��ġ ���L   23,000��");
		menu15.add("���� ��ġ ���F   28,000��");

		List<String> menu16 = new ArrayList<String>();	//��Ÿ
		menu16.add("������������   ��R:14,000��");				
		menu16.add("������������   ��L:18,000��");
		menu16.add("�������������   R:18,000��");
		menu16.add("�������������   L:21,000��");


		List<String> menu17 = new ArrayList<String>();	//�˶㼼Ʈ
		menu17.add("3�μ�Ʈ(������R+ġ����콺�İ�Ƽ+�ݶ�)   15,000��");				
		menu17.add("4�μ�Ʈ(������L+ġ����콺�İ�Ƽ+�ݶ�)   19,000��");
		menu17.add("5�μ�Ʈ(������L+ġ����콺�İ�Ƽ2+�ݶ�)   23,000��");
		menu17.add("B�� ��Ʈ(ġ��ũ����ƮR+ġ����콺�İ�Ƽ+�ݶ�)   18,000��");
		menu17.add("A�� ��Ʈ(ġ��ũ����ƮL+ġ����콺�İ�Ƽ+�ݶ�)   22,000��");


		List<String> menu18 = new ArrayList<String>();	//���İ�Ƽ&���̵�޴�
		menu18.add("ġ����콺�İ�Ƽ   5,000��");
		menu18.add("��Ʈ�����İ�Ƽ   5,000��");
		menu18.add("���ķδϽ��İ�Ƽ   5,500��");
		menu18.add("������ũ�����İ�Ƽ   6,000��");
		menu18.add("�ع�ũ�����İ�Ƽ   6,500��");
		menu18.add("��������İ�Ƽ   6,500��");
		menu18.add("���ȷ���(8EA)   5,500��");
		menu18.add("ġŲ�ٴ�(5EA)   4,000��");
		menu18.add("ġ�ƽ(6EA)   3,500��");
		menu18.add("������ƽ(7EA)   3,500��");
		menu18.add("���������̽�   5,500��");
		menu18.add("��&��ä���̽�   5,000��");
		menu18.add("ġŲ�ٴ�   5,000��");
		menu18.add("�������佺�İ�Ƽ   5,500��");
		menu18.add("�ع����İ�Ƽ   5,500��");
		menu18.add("������ƽ(5EA)   3,000��");
		menu18.add("�������佺ƽ   2,500��");


		List<String> menu19 = new ArrayList<String>();	//�߰��޴�
		menu19.add("�������μҽ� �߰�   1��:300��");
		menu19.add("�ּҽ� �߰�   1��:200��");
		menu19.add("��Ŭ �߰�   1��:300��");
		menu19.add("ġ��� �߰�   1��:200��");
		menu19.add("����ġ��(���)   1,000��");
		menu19.add("��ī�ݶ�(500ml)   1,000��");
		menu19.add("��ī�ݶ�(1.25L)   1,500��");
		menu19.add("��������Ʈ(500ml)   1,000��");
		menu19.add("��������Ʈ(1.25L)   1,500��");

	
		listDataChild.put(listDataHeader.get(0), menu1); // Header, Child data
		listDataChild.put(listDataHeader.get(1), menu2);
		listDataChild.put(listDataHeader.get(2), menu3);
		listDataChild.put(listDataHeader.get(3), menu4);
		listDataChild.put(listDataHeader.get(4), menu5);
		listDataChild.put(listDataHeader.get(5), menu6);
		listDataChild.put(listDataHeader.get(6), menu7);
		listDataChild.put(listDataHeader.get(7), menu8);
		listDataChild.put(listDataHeader.get(8), menu9);
		listDataChild.put(listDataHeader.get(9), menu10);
		listDataChild.put(listDataHeader.get(10), menu11);
		listDataChild.put(listDataHeader.get(11), menu12);
		listDataChild.put(listDataHeader.get(12), menu13);
		listDataChild.put(listDataHeader.get(13), menu14);
		listDataChild.put(listDataHeader.get(14), menu15);
		listDataChild.put(listDataHeader.get(15), menu16);
		listDataChild.put(listDataHeader.get(16), menu17);
		listDataChild.put(listDataHeader.get(17), menu18);
		listDataChild.put(listDataHeader.get(18), menu19);
		

}
}
