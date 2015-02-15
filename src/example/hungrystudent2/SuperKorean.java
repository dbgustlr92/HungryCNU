package example.hungrystudent2;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class SuperKorean extends Activity{
	private String[] Names = { // 피자집 이름 넣으면 됨
			"김밥나라(봉명점)","24시밥샵","라이스스토리"};
	
	private AdapterView.OnItemClickListener mItemClickListener = new AdapterView.OnItemClickListener() {
		@Override
		public void onItemClick(AdapterView<?> parent, View v, int position,
				long id) {
			String name = (String) parent.getItemAtPosition(position);

			if (name.equals("김밥나라(봉명점)")) {
				Intent intent = new Intent(SuperKorean.this, Korean_1.class);
				startActivity(intent);
			}
			else if(name.equals("24시밥샵")) {
				Intent intent = new Intent(SuperKorean.this, Korean_2.class);
				startActivity(intent);
			}
			else if(name.equals("라이스스토리")) {
				Intent intent = new Intent(SuperKorean.this, Korean_3.class);
				startActivity(intent);
			}
		};
	};
	protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.superkorean);
        
        
        ListView list = (ListView) findViewById(R.id.NameListOfKorean); // 리스트뷰

		ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(
				getApplicationContext(), R.layout.listviewlayout, Names);
		list.setAdapter(arrayAdapter);// 어댑터와 리스트뷰 연결!
		list.setOnItemClickListener(mItemClickListener);// 어댑터에 클릭리스너 투입
	}
}