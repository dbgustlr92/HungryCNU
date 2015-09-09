package example.hungrystudent2;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class SuperSnack extends Activity{
	private String[] Names = { 
			"�Ŷ�(�泲����)","���빮���ⶱ����","�Ű��׸ſ����"};
	
	private AdapterView.OnItemClickListener mItemClickListener = new AdapterView.OnItemClickListener() {
		@Override
		public void onItemClick(AdapterView<?> parent, View v, int position,
				long id) {
			String name = (String) parent.getItemAtPosition(position);

			if (name.equals("�Ŷ�(�泲����)")) {
				Intent intent = new Intent(SuperSnack.this, Snack_1.class);
				startActivity(intent);
			}
			else if(name.equals("���빮���ⶱ����")) {
				Intent intent = new Intent(SuperSnack.this, Snack_2.class);
				startActivity(intent);
			}
			else if(name.equals("�Ű��׸ſ����")) {
				Intent intent = new Intent(SuperSnack.this, Snack_3.class);
				startActivity(intent);
			}
		};
	};
	protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.supersnack);
        
        ListView list = (ListView) findViewById(R.id.NameListOfSnack); // ����Ʈ��

		ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(
				getApplicationContext(), R.layout.listviewlayout, Names);
		list.setAdapter(arrayAdapter);// ����Ϳ� ����Ʈ�� ����!
		list.setOnItemClickListener(mItemClickListener);// ����Ϳ� Ŭ�������� ����
	}
}