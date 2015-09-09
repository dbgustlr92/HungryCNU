package example.hungrystudent2;

import java.util.*;

import android.app.*;
import android.content.*;
import android.net.*;
import android.os.*;
import android.view.*;
import android.widget.*;

public class Snack_1 extends Activity{
	ExpandableListAdapter listAdapter;
	ExpandableListView expListView;
	List<String> listDataHeader;
	HashMap<String, List<String>> listDataChild;

	protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.snack_1);
        ImageButton a = (ImageButton)findViewById(R.id.call_snack1);

        a.setOnClickListener(new ImageButton.OnClickListener(){

			@Override
			public void onClick(View v) {
				startActivity(new Intent("android.intent.action.CALL",Uri.parse("tel:042-826-7008")));
				
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
		listDataHeader.add("신떡메뉴");
		listDataHeader.add("식사류");
		listDataHeader.add("면류");
		listDataHeader.add("김밥류");
		listDataHeader.add("튀김류");
		listDataHeader.add("음료 / 빙수");
		listDataHeader.add("생과일쥬스");
		listDataHeader.add("토스트");
		listDataHeader.add("세트메뉴");

		
		// Adding child data
		List<String> top250 = new ArrayList<String>();
		top250.add("메추리알  1,000원");
		top250.add("신떡(가장매운맛)  2,500원");
		top250.add("매떡(매콤달콤한맛)  2,500원");
		top250.add("짜떡(매콤짜장맛)  2,500원");
		top250.add("카떡(순한카레맛)  2,500원");
		top250.add("얼큰오뎅  3,500원");
		top250.add("물오뎅  3,500원");
		top250.add("찹쌀순대  4,000원");
		top250.add("치떡(치즈떡볶이)  4,500원");
		top250.add("라볶이  7,000원");
		top250.add("미니쟁반떡볶이  7,000원");
		top250.add("순대쟁반떡볶이  14,000원");
		
		
		
		List<String> nowShowing = new ArrayList<String>();
		nowShowing.add("햄야채라이스   5,500원");
		nowShowing.add("새우라이스   5,500원");
		nowShowing.add("해물라이스   5,500원");
		nowShowing.add("김치라이스   5,500원");
		nowShowing.add("낙지라이스   5,500원");
		nowShowing.add("돈가스   5,500원");
		nowShowing.add("치즈돈까스   6,000원");
		

		List<String> comingSoon = new ArrayList<String>();
		comingSoon.add("계란라면   3,500원");
		comingSoon.add("눈물라면   4,000원");
		comingSoon.add("치즈라면   4,000원");
		comingSoon.add("참치라면   4,000원");
		comingSoon.add("김치라면   4,000원");
		comingSoon.add("냄비우동   4,000원");
		comingSoon.add("떡라면   4,000원");
		comingSoon.add("눈물우동   4,500원");
		comingSoon.add("김치우동   4,500원");
		comingSoon.add("볶음우동   4,500원");
		comingSoon.add("辛볶음우동   4,500원");
		
		
		List<String> gimbab = new ArrayList<String>();
		gimbab.add("고추김밥   2,500원");
		gimbab.add("꼬마김밥   2,500원");
		gimbab.add("참치주먹밥   3,000원");
		gimbab.add("매콤주먹밥   3,000원");
		gimbab.add("불고기김밥   3,000원");
		gimbab.add("참치김치김밥   3,000원");
		gimbab.add("불고기치즈김밥   3,000원");
		gimbab.add("샐러드김밥   3,000원");
		gimbab.add("참치치즈김밥   3,000원");
		gimbab.add("참치김밥   3,000원");
		
		
		List<String> menu4 = new ArrayList<String>(); //튀김
		menu4.add("튀오뎅   1,000원");
		menu4.add("튀만두   1,000원");
		menu4.add("튀말이   1,000원");
		menu4.add("낑구마   1,500원");
		menu4.add("치즈스틱   1,500원");
		menu4.add("오징어링   1,500원");
		menu4.add("김말이   1,500원");
		menu4.add("매콤김말이   1,500원");
		menu4.add("튀순대   1,500원");
		menu4.add("고구마고르켓   1,500원");
		menu4.add("고구마맛탕   4,000원");
		
		List<String> menu5 = new ArrayList<String>();	//음료/빙수
		menu5.add("물大   1,500원");
		menu5.add("쿨피스   1,500원");
		menu5.add("콜라(500ml)   1,500원");
		menu5.add("사이다(500ml)   1,500원");
		menu5.add("웰치스(포도맛)   1,500원");
		menu5.add("소주   2,000원");
		menu5.add("팥빙수   5,000원");
		
		
		
		
		List<String> menu6 = new ArrayList<String>();	//생과일
		menu6.add("딸기쥬스   2,500원");
		menu6.add("바나나쥬스   2,500원");
		menu6.add("키위쥬스   2,500원");
		menu6.add("미숫가루   2,500원");
		
		List<String> menu7 = new ArrayList<String>();	//토스트
		menu7.add("치킨계란토스트   2,500원");
		
		List<String> menu8 = new ArrayList<String>();	//세트메뉴
		menu8.add("기본메뉴(떡+튀오뎅+튀만두)   4,500원");
		menu8.add("튀말이세트(기본+튀말이+쿨피스)   7,000원");
		menu8.add("토스트세트(기본+토스트+쿨피스)   8,000원");
		menu8.add("빙수세트(기본+빙수)   9,000원");
		menu8.add("얼큰오뎅세트(기본+얼큰오뎅+쿨피스)   9,000원");
		menu8.add("볶음우동세트(기본+볶음우동+쿨피스)   10,000원");
		menu8.add("라이스세트(기본+라이스+쿨피스)   11,000원");
		menu8.add("눈물세트(기본+고추김밥+눈물라면+쿨피스)   12,000원");
		menu8.add("순대세트(기본+떡(선택1)+찹쌀순대+쿨피스)   12,000원");
		menu8.add("모듬세트(기본+튀말이+고추김밥+얼큰오뎅+쿨피스)   12,500원");
		menu8.add("쟁반떡볶이세트(순대쟁반떡볶이+고추김밥+쿨피스)   17,000원");
		
		
		
		listDataChild.put(listDataHeader.get(0), top250); // Header, Child data
		listDataChild.put(listDataHeader.get(1), nowShowing);
		listDataChild.put(listDataHeader.get(2), comingSoon);
		listDataChild.put(listDataHeader.get(3), gimbab);
		listDataChild.put(listDataHeader.get(4), menu4);
		listDataChild.put(listDataHeader.get(5), menu5);
		listDataChild.put(listDataHeader.get(6), menu6);
		listDataChild.put(listDataHeader.get(7), menu7);
		listDataChild.put(listDataHeader.get(8), menu8);
	}

}
