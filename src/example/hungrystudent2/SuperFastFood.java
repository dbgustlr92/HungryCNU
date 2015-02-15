package example.hungrystudent2;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class SuperFastFood extends Activity{
	private String[] Names = { // 피자집 이름 넣으면 됨
	};
	
	private AdapterView.OnItemClickListener mItemClickListener = new AdapterView.OnItemClickListener() {
		@Override
		public void onItemClick(AdapterView<?> parent, View v, int position,
				long id) {
			String name = (String) parent.getItemAtPosition(position);
			}
		};
	protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.superfastfood);
        
        ListView list = (ListView) findViewById(R.id.NameListOfFastfood); // 리스트뷰

		ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(
				getApplicationContext(), R.layout.listviewlayout, Names);
		list.setAdapter(arrayAdapter);// 어댑터와 리스트뷰 연결!
		list.setOnItemClickListener(mItemClickListener);// 어댑터에 클릭리스너 투입
	}
}