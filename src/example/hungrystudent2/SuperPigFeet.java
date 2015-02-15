package example.hungrystudent2;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class SuperPigFeet extends Activity{
	private String[] Names = { // ������ �̸� ������ ��
			"�ְ��������ߺ���"};
	
	private AdapterView.OnItemClickListener mItemClickListener = new AdapterView.OnItemClickListener() {
		@Override
		public void onItemClick(AdapterView<?> parent, View v, int position,
				long id) {
			String name = (String) parent.getItemAtPosition(position);

			if (name.equals("�ְ��������ߺ���")) {
				Intent intent = new Intent(SuperPigFeet.this, Pigfeet_1.class);
				startActivity(intent);
			}
		};
	};
	protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.superpigfeet);
        
        ListView list = (ListView) findViewById(R.id.NameListOfPigfeet); // ����Ʈ��

		ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(
				getApplicationContext(), R.layout.listviewlayout, Names);
		list.setAdapter(arrayAdapter);// ����Ϳ� ����Ʈ�� ����!
		list.setOnItemClickListener(mItemClickListener);// ����Ϳ� Ŭ�������� ����
	}
}
