package example.hungrystudent2;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class SuperChina extends Activity{
	private String[] Names = { // 피자집 이름 넣으면 됨
			"하오치","심심원","청해루","띵호와","함가네","샹하이","왕금성","신짜오짜장","왕비성" };
	
	private AdapterView.OnItemClickListener mItemClickListener = new AdapterView.OnItemClickListener() {
		@Override
		public void onItemClick(AdapterView<?> parent, View v, int position,
				long id) {
			String name = (String) parent.getItemAtPosition(position);

			if (name.equals("하오치")) {
				Intent intent = new Intent(SuperChina.this, China_1.class);
				startActivity(intent);
			}
			else if(name.equals("심심원")) {
				Intent intent = new Intent(SuperChina.this, China_2.class);
				startActivity(intent);
			}
			else if(name.equals("청해루")) {
				Intent intent = new Intent(SuperChina.this, China_3.class);
				startActivity(intent);
			}
			else if(name.equals("띵호와")) {
				Intent intent = new Intent(SuperChina.this, China_4.class);
				startActivity(intent);
			}
			else if(name.equals("함가네")) {
				Intent intent = new Intent(SuperChina.this, China_5.class);
				startActivity(intent);
			}
			else if(name.equals("샹하이")) {
				Intent intent = new Intent(SuperChina.this, China_6.class);
				startActivity(intent);
			}
			else if(name.equals("왕금성")) {
				Intent intent = new Intent(SuperChina.this, China_7.class);
				startActivity(intent);
			}
			else if(name.equals("신짜오짜장")) {
				Intent intent = new Intent(SuperChina.this, China_8.class);
				startActivity(intent);
			}
			else if(name.equals("왕비성")) {
				Intent intent = new Intent(SuperChina.this, China_9.class);
				startActivity(intent);
			}
		};
	};
	
	protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.superchina);
        
        
        ListView list = (ListView) findViewById(R.id.NameListOfchinese); // 리스트뷰

		ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(
				getApplicationContext(), R.layout.listviewlayout, Names);
		list.setAdapter(arrayAdapter);// 어댑터와 리스트뷰 연결!
		list.setOnItemClickListener(mItemClickListener);// 어댑터에 클릭리스너 투입
	}
}