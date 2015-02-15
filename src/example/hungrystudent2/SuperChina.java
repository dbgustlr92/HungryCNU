package example.hungrystudent2;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class SuperChina extends Activity{
	private String[] Names = { // ������ �̸� ������ ��
			"�Ͽ�ġ","�ɽɿ�","û�ط�","��ȣ��","�԰���","������","�ձݼ�","��¥��¥��","�պ�" };
	
	private AdapterView.OnItemClickListener mItemClickListener = new AdapterView.OnItemClickListener() {
		@Override
		public void onItemClick(AdapterView<?> parent, View v, int position,
				long id) {
			String name = (String) parent.getItemAtPosition(position);

			if (name.equals("�Ͽ�ġ")) {
				Intent intent = new Intent(SuperChina.this, China_1.class);
				startActivity(intent);
			}
			else if(name.equals("�ɽɿ�")) {
				Intent intent = new Intent(SuperChina.this, China_2.class);
				startActivity(intent);
			}
			else if(name.equals("û�ط�")) {
				Intent intent = new Intent(SuperChina.this, China_3.class);
				startActivity(intent);
			}
			else if(name.equals("��ȣ��")) {
				Intent intent = new Intent(SuperChina.this, China_4.class);
				startActivity(intent);
			}
			else if(name.equals("�԰���")) {
				Intent intent = new Intent(SuperChina.this, China_5.class);
				startActivity(intent);
			}
			else if(name.equals("������")) {
				Intent intent = new Intent(SuperChina.this, China_6.class);
				startActivity(intent);
			}
			else if(name.equals("�ձݼ�")) {
				Intent intent = new Intent(SuperChina.this, China_7.class);
				startActivity(intent);
			}
			else if(name.equals("��¥��¥��")) {
				Intent intent = new Intent(SuperChina.this, China_8.class);
				startActivity(intent);
			}
			else if(name.equals("�պ�")) {
				Intent intent = new Intent(SuperChina.this, China_9.class);
				startActivity(intent);
			}
		};
	};
	
	protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.superchina);
        
        
        ListView list = (ListView) findViewById(R.id.NameListOfchinese); // ����Ʈ��

		ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(
				getApplicationContext(), R.layout.listviewlayout, Names);
		list.setAdapter(arrayAdapter);// ����Ϳ� ����Ʈ�� ����!
		list.setOnItemClickListener(mItemClickListener);// ����Ϳ� Ŭ�������� ����
	}
}