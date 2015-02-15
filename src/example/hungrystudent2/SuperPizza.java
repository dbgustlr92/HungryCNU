package example.hungrystudent2;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class SuperPizza extends Activity{
	private String[] Names = { // ������ �̸� ������ ��
			"�ٻ��ġŲ����","���ڳ���ġŲ����","��Ÿ����","���ڸ���","���ڴ���" };
	
	private AdapterView.OnItemClickListener mItemClickListener = new AdapterView.OnItemClickListener() {
		@Override
		public void onItemClick(AdapterView<?> parent, View v, int position,
				long id) {
			String name = (String) parent.getItemAtPosition(position);

			if (name.equals("�ٻ��ġŲ����")) {
				Intent intent = new Intent(SuperPizza.this, Pizza_1.class);
				startActivity(intent);
			}
			else if(name.equals("���ڳ���ġŲ����")) {
				Intent intent = new Intent(SuperPizza.this, Pizza_2.class);
				startActivity(intent);
			}
			else if(name.equals("��Ÿ����")) {
				Intent intent = new Intent(SuperPizza.this, Pizza_3.class);
				startActivity(intent);
			}
			else if(name.equals("���ڸ���")) {
				Intent intent = new Intent(SuperPizza.this, Pizza_4.class);
				startActivity(intent);
			}
			else if(name.equals("���ڴ���")) {
				Intent intent = new Intent(SuperPizza.this, Pizza_5.class);
				startActivity(intent);
			}
		};
	};
	protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.superpizza);
        
        ListView list = (ListView) findViewById(R.id.NameListOfPizza); // ����Ʈ��

		ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(
				getApplicationContext(), R.layout.listviewlayout, Names);
		list.setAdapter(arrayAdapter);// ����Ϳ� ����Ʈ�� ����!
		list.setOnItemClickListener(mItemClickListener);// ����Ϳ� Ŭ�������� ����
	}
}