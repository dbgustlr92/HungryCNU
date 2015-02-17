package example.hungrystudent2;

import java.util.*;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.*;

public class Korean_3 extends Activity{
	ExpandableListAdapter listAdapter;
	ExpandableListView expListView;
	List<String> listDataHeader;
	HashMap<String, List<String>> listDataChild;

	protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.korean_3);
        ImageButton a = (ImageButton)findViewById(R.id.call_korean3);

        a.setOnClickListener(new ImageButton.OnClickListener(){

			@Override
			public void onClick(View v) {
				startActivity(new Intent("android.intent.action.CALL",Uri.parse("tel:010-4915-9211")));
				
			}
        	
        });
// get the listview
		expListView = (ExpandableListView) findViewById(R.id.lvExp);

		// preparing list data
		prepareListData();

		listAdapter = new ExpandableListAdapter(this, listDataHeader,
				listDataChild);

		// setting list adapter
		expListView.setAdapter(listAdapter);
	}
	private void prepareListData() {
		listDataHeader = new ArrayList<String>();
		listDataChild = new HashMap<String, List<String>>();

		// Adding child data
		listDataHeader.add("볶음밥");
		listDataHeader.add("덮밥");
		listDataHeader.add("면류");
		listDataHeader.add("스폐셜");
		listDataHeader.add("계절메뉴");
		listDataHeader.add("음료수");

	
		
		
		// Adding child data
		List<String> menu1 = new ArrayList<String>(); // 볶음밥
		menu1.add("[라지사이즈 1000원 추가]");
		menu1.add("김치볶음밥   5,500원");
		menu1.add("사천해물볶음밥   7,000원");
		menu1.add("데리야끼볶음밥   6,000원");
		menu1.add("해물김치볶음밥   6,500원");
		menu1.add("비프김치볶음밥   6,500원");
		menu1.add("갈릭볶음밥  7,000원");
		menu1.add("핫비프볶음밥   7,000원");
		menu1.add("오무비프   8,500원");
		menu1.add("해물오무라이스   8,000원");
		menu1.add("수제치킨돈까스   7,000원");
		menu1.add("수제등심돈까스   6,500원");
		menu1.add("수제고구마돈까스   7,000원");
		
		
		
		List<String> menu2 = new ArrayList<String>(); // 덮밥
		menu2.add("몽골리안동   6,000원");
		menu2.add("가츠동   5,500원");
		menu2.add("김치가츠동   6,000원");
		menu2.add("에비동   7,500원");
		menu2.add("규동   6,000원");
		menu2.add("김치규동   6,500원");
		menu2.add("치킨가라이아게동   7,500원");
		menu2.add("트리플동   9,000원");
	

		
		
		List<String> menu3 = new ArrayList<String>();	//면류
		menu3.add("베트남쌀국수   6,000원");
		menu3.add("해물탕면   6,500원");
		menu3.add("얼큰소고기탕면   6,500원");
		menu3.add("큐슈탕면(순한맛)   6,500원");
		menu3.add("큐슈짬뽕(매운맛)   7,000원");
		menu3.add("사천해물볶음면   7,000원");
		menu3.add("비프몽골리안   7,500원");
		
		
		
		List<String> menu4 = new ArrayList<String>();	//스페셜
		menu4.add("갈릭떡갈비스테이크  8,500원");
		
		List<String> menu5 = new ArrayList<String>();	//계절메뉴
		menu5.add("돈고츠라멘   7,000원");
		menu5.add("육개장   6,000원");


		List<String> menu6 = new ArrayList<String>();	//음료수
		menu6.add("사이다   1,500원");
		menu6.add("콜라   1,500원");
		menu6.add("웰치스   2,000원");
		


		
		listDataChild.put(listDataHeader.get(0), menu1); // Header, Child data
		listDataChild.put(listDataHeader.get(1), menu2);
		listDataChild.put(listDataHeader.get(2), menu3);
		listDataChild.put(listDataHeader.get(3), menu4);
		listDataChild.put(listDataHeader.get(4), menu5);
		listDataChild.put(listDataHeader.get(5), menu6);

}
}
