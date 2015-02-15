package example.hungrystudent2;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class SuperPizza extends Activity{
	private String[] Names = { // 피자집 이름 넣으면 됨
			"다사랑치킨피자","피자나라치킨공주","빅스타피자","피자마루","피자뉴스" };
	
	private AdapterView.OnItemClickListener mItemClickListener = new AdapterView.OnItemClickListener() {
		@Override
		public void onItemClick(AdapterView<?> parent, View v, int position,
				long id) {
			String name = (String) parent.getItemAtPosition(position);

			if (name.equals("다사랑치킨피자")) {
				Intent intent = new Intent(SuperPizza.this, Pizza_1.class);
				startActivity(intent);
			}
			else if(name.equals("피자나라치킨공주")) {
				Intent intent = new Intent(SuperPizza.this, Pizza_2.class);
				startActivity(intent);
			}
			else if(name.equals("빅스타피자")) {
				Intent intent = new Intent(SuperPizza.this, Pizza_3.class);
				startActivity(intent);
			}
			else if(name.equals("피자마루")) {
				Intent intent = new Intent(SuperPizza.this, Pizza_4.class);
				startActivity(intent);
			}
			else if(name.equals("피자뉴스")) {
				Intent intent = new Intent(SuperPizza.this, Pizza_5.class);
				startActivity(intent);
			}
		};
	};
	protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.superpizza);
        
        ListView list = (ListView) findViewById(R.id.NameListOfPizza); // 리스트뷰

		ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(
				getApplicationContext(), R.layout.listviewlayout, Names);
		list.setAdapter(arrayAdapter);// 어댑터와 리스트뷰 연결!
		list.setOnItemClickListener(mItemClickListener);// 어댑터에 클릭리스너 투입
	}
}