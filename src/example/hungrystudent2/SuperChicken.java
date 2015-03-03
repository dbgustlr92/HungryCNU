package example.hungrystudent2;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class SuperChicken extends Activity {

	private String[] Names = { // 피자집 이름 넣으면 됨
	"BHC치킨", "페리카나", "미스터파닭", "돈치킨", "소풍가는닭", "상상치킨", "강정이기가막혀", "디디치킨",
			"티바두마리치킨", "치코파닭", "강호동치킨", "굽네치킨", "훌랄라치킨", "BBQ치킨", "에꿍이치킨",
			"호식이두마리치킨", "대학생치킨", "네네치킨" ,"교원파닭"};

	private AdapterView.OnItemClickListener mItemClickListener = new AdapterView.OnItemClickListener() {
		@Override
		public void onItemClick(AdapterView<?> parent, View v, int position,
				long id) {
			String name = (String) parent.getItemAtPosition(position);

			if (name.equals("BHC치킨")) {
				Intent intent = new Intent(SuperChicken.this, Chicken_1.class);
				startActivity(intent);
			} else if (name.equals("페리카나")) {
				Intent intent = new Intent(SuperChicken.this, Chicken_2.class);
				startActivity(intent);
			} else if (name.equals("미스터파닭")) {
				Intent intent = new Intent(SuperChicken.this, Chicken_3.class);
				startActivity(intent);
			} else if (name.equals("돈치킨")) {
				Intent intent = new Intent(SuperChicken.this, Chicken_4.class);
				startActivity(intent);
			} else if (name.equals("소풍가는닭")) {
				Intent intent = new Intent(SuperChicken.this, Chicken_5.class);
				startActivity(intent);
			} else if (name.equals("상상치킨")) {
				Intent intent = new Intent(SuperChicken.this, Chicken_6.class);
				startActivity(intent);
			} else if (name.equals("강정이기가막혀")) {
				Intent intent = new Intent(SuperChicken.this, Chicken_7.class);
				startActivity(intent);
			} else if (name.equals("디디치킨")) {
				Intent intent = new Intent(SuperChicken.this, Chicken_8.class);
				startActivity(intent);
			} else if (name.equals("티바두마리치킨")) {
				Intent intent = new Intent(SuperChicken.this, Chicken_9.class);
				startActivity(intent);
			} else if (name.equals("치코파닭")) {
				Intent intent = new Intent(SuperChicken.this, Chicken_10.class);
				startActivity(intent);
			} else if (name.equals("강호동치킨")) {
				Intent intent = new Intent(SuperChicken.this, Chicken_11.class);
				startActivity(intent);
			} else if (name.equals("굽네치킨")) {
				Intent intent = new Intent(SuperChicken.this, Chicken_12.class);
				startActivity(intent);
			} else if (name.equals("훌랄라치킨")) {
				Intent intent = new Intent(SuperChicken.this, Chicken_13.class);
				startActivity(intent);
			} else if (name.equals("BBQ치킨")) {
				Intent intent = new Intent(SuperChicken.this, Chicken_14.class);
				startActivity(intent);
			} else if (name.equals("에꿍이치킨")) {
				Intent intent = new Intent(SuperChicken.this, Chicken_15.class);
				startActivity(intent);
			} else if (name.equals("호식이두마리치킨")) {
				Intent intent = new Intent(SuperChicken.this, Chicken_16.class);
				startActivity(intent);
			} else if (name.equals("대학생치킨")) {
				Intent intent = new Intent(SuperChicken.this, Chicken_17.class);
				startActivity(intent);
			} else if (name.equals("네네치킨")) {
				Intent intent = new Intent(SuperChicken.this, Chicken_18.class);
				startActivity(intent);
			}else if (name.equals("교원파닭")) {
				Intent intent = new Intent(SuperChicken.this, Chicken_19.class);
				startActivity(intent);
			}
		};

	};

	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.superchicken);

		ListView list = (ListView) findViewById(R.id.NameListOfchicken); // 리스트뷰

		ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(
				getApplicationContext(), R.layout.listviewlayout, Names);
		list.setAdapter(arrayAdapter);// 어댑터와 리스트뷰 연결!
		list.setOnItemClickListener(mItemClickListener);// 어댑터에 클릭리스너 투입

	}
}
