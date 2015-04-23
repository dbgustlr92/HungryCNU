package example.hungrystudent2;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class SuperFastFood extends Activity{
	private String[] Names = { "������ġ"
	};
	
	private AdapterView.OnItemClickListener mItemClickListener = new AdapterView.OnItemClickListener() {
		@Override
		public void onItemClick(AdapterView<?> parent, View v, int position,
				long id) {
			String name = (String) parent.getItemAtPosition(position);
			
			if (name.equals("������ġ")) {
				Intent intent = new Intent(SuperFastFood.this, Fastfood_1.class);
				startActivity(intent);
			}
			}
		};
	protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.superfastfood);
        
        ListView list = (ListView) findViewById(R.id.NameListOfFastfood); // ����Ʈ��

		ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(
				getApplicationContext(), R.layout.listviewlayout, Names);
		list.setAdapter(arrayAdapter);// ����Ϳ� ����Ʈ�� ����!
		list.setOnItemClickListener(mItemClickListener);// ����Ϳ� Ŭ�������� ����
	}
}