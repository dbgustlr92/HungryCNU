package example.hungrystudent2;

import java.util.*;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.*;

public class Korean_2 extends Activity{		//24시 밥샵
	ExpandableListAdapter listAdapter;
	ExpandableListView expListView;
	List<String> listDataHeader;
	HashMap<String, List<String>> listDataChild;

	protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.korean_2);
        ImageButton a = (ImageButton)findViewById(R.id.call_korean2);

        a.setOnClickListener(new ImageButton.OnClickListener(){

			@Override
			public void onClick(View v) {
				startActivity(new Intent("android.intent.action.CALL",Uri.parse("tel:042-488-0709")));
				
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
		listDataHeader.add("신메뉴");
		listDataHeader.add("식사류");
		listDataHeader.add("안주류");
		listDataHeader.add("기타분식");
	
		
		
		// Adding child data
		List<String> menu1 = new ArrayList<String>(); // 신메뉴
		menu1.add("컵밥 3,000원");
		menu1.add("소고기컵밥 4,000원");
		menu1.add("날치알컵밥 4,000원");
		menu1.add("오징어컵밥 4,000원");
		menu1.add("제육컵밥 4,000원");
		menu1.add("고추컵밥 4,000원");
		
		
		
		
		List<String> menu2 = new ArrayList<String>(); // 식사류
		menu2.add("김치볶음밥 6,000원");
		menu2.add("야채볶음밥 6,000원");
		menu2.add("제육덮밥 6,000원");
		menu2.add("오징어덮밥 6,000원");
		menu2.add("잡채밥 6,000원");
		menu2.add("오므라이스 6,000원");
		menu2.add("쇠고기덮밥 7,000원");
		menu2.add("생돈까스 7,000원");
		menu2.add("떡갈비정식 7,000원");
		menu2.add("소불고기새싹비빔밥 7,000원");
		menu2.add("김치국 5,000원");
		menu2.add("된장찌개 5,000원");
		menu2.add("김치찌개 5,000원");
		menu2.add("미역국 6,000원");
		menu2.add("북어국 6,000원");
		menu2.add("육개장 6,000원");
		menu2.add("뼈다귀탕 7,000원");
		menu2.add("갈비탕 7,000원");
		menu2.add("닭도리탕 7,000원");
		menu2.add("부대찌개小(2人) 12,000원");
		menu2.add("부대찌개中(3人) 15,000원");
		menu2.add("부대찌개大(4人) 20,000원");
		menu2.add("참치찌개小(2人) 12,000원");
		menu2.add("참치찌개中(3人) 15,000원");
		menu2.add("참치찌개大(4人) 20,000원");
		menu2.add("동태찌개小(2人) 12,000원");
		menu2.add("동태찌개中(3人) 15,000원");
		menu2.add("동태찌개大(4人) 20,000원");
		menu2.add("순두부찌개小(2人) 12,000원");
		menu2.add("순두부찌개中(3人) 15,000원");
		menu2.add("순두부찌개大(4人) 20,000원");
		menu2.add("물냉면 5,000원");
		menu2.add("비빔냉면 6,000원");
		menu2.add("열무냉면 6,000원");
		menu2.add("삼계탕 10,000원");
		menu2.add("전복삼계탕 15,000원");

		
		
		List<String> menu3 = new ArrayList<String>();	//안주류
		menu3.add("[공기밥별도]");
		menu3.add("11시~4시 공기밥서비스");
		menu3.add("닭도리탕小(2人) 15,000원");
		menu3.add("닭도리탕中(3人) 20,000원");
		menu3.add("닭도리탕大(4人) 25,000원");
		menu3.add("닭도리탕(특大) 30,000원");
		menu3.add("감자탕小(2人) 15,000원");
		menu3.add("감자탕中(3人) 20,000원");
		menu3.add("감자탕大(4人) 25,000원");
		menu3.add("감자탕(특大) 30,000원");
		menu3.add("안동찜닭小(2人) 15,000원");
		menu3.add("안동찜닭中(3人) 20,000원");
		menu3.add("안동찜닭大(4人) 25,000원");
		menu3.add("안동찜닭(특大) 30,000원");
		menu3.add("고추장찜닭小(2人) 15,000원");
		menu3.add("고추장찜닭中(3人) 20,000원");
		menu3.add("고추장찜닭大(4人) 25,000원");
		menu3.add("고추장찜닭(특大) 30,000원");
		menu3.add("[안주사리]떡/라면 1,000원");
		menu3.add("[안주사리]당면 2,000원");
		
		
		List<String> menu4 = new ArrayList<String>();	//기타분식
		menu4.add("주먹밥 2,000원");
		menu4.add("김밥 2,000원");
		menu4.add("계란후라이3개 2,000원");
		menu4.add("떡볶이 3,000원");
		menu4.add("모듬튀김 3,000원");
		menu4.add("계란찜 5,000원");
		


		
		listDataChild.put(listDataHeader.get(0), menu1); // Header, Child data
		listDataChild.put(listDataHeader.get(1), menu2);
		listDataChild.put(listDataHeader.get(2), menu3);
		listDataChild.put(listDataHeader.get(3), menu4);
		

	}


}
