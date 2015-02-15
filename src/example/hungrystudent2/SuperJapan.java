package example.hungrystudent2;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class SuperJapan extends Activity{
	private String[] Names = { // 피자집 이름 넣으면 됨
			"마루","돈까애","돈스락","대박돈까스","스시안"};
	
	private AdapterView.OnItemClickListener mItemClickListener = new AdapterView.OnItemClickListener() {
		@Override
		public void onItemClick(AdapterView<?> parent, View v, int position,
				long id) {
			String name = (String) parent.getItemAtPosition(position);

			if (name.equals("마루")) {
				Intent intent = new Intent(SuperJapan.this, Japan_1.class);
				startActivity(intent);
			}
			else if(name.equals("돈까애")) {
				Intent intent = new Intent(SuperJapan.this, Japan_2.class);
				startActivity(intent);
			}
			else if(name.equals("돈스락")) {
				Intent intent = new Intent(SuperJapan.this, Japan_3.class);
				startActivity(intent);
			}
			else if(name.equals("대박돈까스")) {
				Intent intent = new Intent(SuperJapan.this, Japan_4.class);
				startActivity(intent);
			}
			else if(name.equals("스시안")) {
				Intent intent = new Intent(SuperJapan.this, Japan_5.class);
				startActivity(intent);
			}
		};
	};
	protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.superjapan);
        
        ListView list = (ListView) findViewById(R.id.NameListOfJapanese); // 리스트뷰

		ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(
				getApplicationContext(), R.layout.listviewlayout, Names);
		list.setAdapter(arrayAdapter);// 어댑터와 리스트뷰 연결!
		list.setOnItemClickListener(mItemClickListener);// 어댑터에 클릭리스너 투입
	}
}