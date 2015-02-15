package example.hungrystudent2;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class SuperJapan extends Activity{
	private String[] Names = { // ������ �̸� ������ ��
			"����","�����","������","��ڵ��","���þ�"};
	
	private AdapterView.OnItemClickListener mItemClickListener = new AdapterView.OnItemClickListener() {
		@Override
		public void onItemClick(AdapterView<?> parent, View v, int position,
				long id) {
			String name = (String) parent.getItemAtPosition(position);

			if (name.equals("����")) {
				Intent intent = new Intent(SuperJapan.this, Japan_1.class);
				startActivity(intent);
			}
			else if(name.equals("�����")) {
				Intent intent = new Intent(SuperJapan.this, Japan_2.class);
				startActivity(intent);
			}
			else if(name.equals("������")) {
				Intent intent = new Intent(SuperJapan.this, Japan_3.class);
				startActivity(intent);
			}
			else if(name.equals("��ڵ��")) {
				Intent intent = new Intent(SuperJapan.this, Japan_4.class);
				startActivity(intent);
			}
			else if(name.equals("���þ�")) {
				Intent intent = new Intent(SuperJapan.this, Japan_5.class);
				startActivity(intent);
			}
		};
	};
	protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.superjapan);
        
        ListView list = (ListView) findViewById(R.id.NameListOfJapanese); // ����Ʈ��

		ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(
				getApplicationContext(), R.layout.listviewlayout, Names);
		list.setAdapter(arrayAdapter);// ����Ϳ� ����Ʈ�� ����!
		list.setOnItemClickListener(mItemClickListener);// ����Ϳ� Ŭ�������� ����
	}
}