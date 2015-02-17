package example.hungrystudent2;

import java.util.*;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.*;


public class Pizza_4 extends Activity {
	ExpandableListAdapter listAdapter;
	ExpandableListView expListView;
	List<String> listDataHeader;
	HashMap<String, List<String>> listDataChild;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.pizza_4);
		
		ImageButton a = (ImageButton)findViewById(R.id.call_pizza4);

        a.setOnClickListener(new ImageButton.OnClickListener(){

			@Override
			public void onClick(View v) {
				startActivity(new Intent("android.intent.action.CALL",Uri.parse("tel:042-824-8210")));
				
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
		listDataHeader.add("스크린 피자");
		listDataHeader.add("프리미엄 레귤러");
		listDataHeader.add("프리미엄 피자");
		listDataHeader.add("바이트 피자");
		listDataHeader.add("씬 피자");
		listDataHeader.add("골드 피자");
		listDataHeader.add("점보 피자");
		listDataHeader.add("마루 세트");
		listDataHeader.add("스파게티");
		listDataHeader.add("사이드메뉴");

		// Adding child data
		List<String> menu1 = new ArrayList<String>();	//스크린피자
		menu1.add("마루콤비네이션피자   10,000원");
		menu1.add("이탈리안치즈피자   9,000원");
		menu1.add("야채피자   9,000원");
		menu1.add("페파로니피자   10,000원");
		menu1.add("불고기피자   11,000원");
		menu1.add("고구마피자   11,000원");
		menu1.add("포테이토피자   11,000원");
		
		
		List<String> menu2 = new ArrayList<String>();	//프리미엄 레귤러
		menu2.add("리오 카니발 피자+콜라(500ml)   R:17,000원");
		menu2.add("골드 스테이크 불갈비 피자+콜라(500ml)   R:17,000원");
		menu2.add("몽뻬르 피자+콜라(500ml)   R:17,000원");
		menu2.add("크레이지 불새 피자+콜라(500ml)   R:17,000원");


		List<String> menu3 = new ArrayList<String>();	//프리미엄 피자
		menu3.add("스테이크 불갈비 피자   13,000원");
		menu3.add("데리 치킨 피자   13,000원");
		menu3.add("스위트 칠리 쉬림프 피자   14,000원");
		menu3.add("크레이지 불새 피자+콜라500ml   18,000원");
		menu3.add("몽뻬르피자+콜라(500ml)   18,000원");

		List<String> menu4 = new ArrayList<String>();	//바이트 피자
		menu4.add("[콜라 500ml 증정]");
		menu4.add("리치 바이트 피자   15,000원");
		menu4.add("불고기 바이트 피자   16,000원");
		menu4.add("고구마 바이트 피자   16,000원");
		menu4.add("포테이토 바이트 피자   16,000원");
		menu4.add("스테이크 불갈비 바이트 피자   18,000원");


		List<String> menu5 = new ArrayList<String>();	//씬 피자
		menu5.add("씬 수제 소세지 피자   13,000원");
		menu5.add("씬 크림 쉬림프 피자   14,000원");
		menu5.add("씬 이탈리안 베이컨 피자   14,000원");
	
		List<String> menu6 = new ArrayList<String>();	//골드 피자
		menu6.add("[콜라 500ml 증정]");
		menu6.add("골드 콤비네이션 피자   15,000원");
		menu6.add("골드 고구마 피자   16,000원");
		menu6.add("골드 포테이토 피자   16,000원");
		menu6.add("골드 텐더치킨 피자   16,000원");
		menu6.add("골드 스테이크 불갈비 피자   18,000원");
		menu6.add("골드 칠리쉬림프 피자   19,000원");
		

		List<String> menu7 = new ArrayList<String>();	//점보 피자
		menu7.add("[콜라 大 증정]");
		menu7.add("점보 콤비네이션 피자   45cm:20,000원");
		menu7.add("점보 불고기 피자   45cm:22,000원");
		menu7.add("점보 고구마 피자   45cm:22,000원");
		menu7.add("점보 포테이토 피자   45cm:22,000원");
		menu7.add("점보 불갈비 피자   45cm:26,000원");


		List<String> menu8 = new ArrayList<String>();	//마루 세트
		menu8.add("마루1(콤비네이션피자+치즈오븐스파게티+콜라大)   16,000원");
		menu8.add("마루2(포테이토/불고기/고구마 피자 택1+치즈오븐스파게티+버팔로윙+콜라大   23,000원");
		menu8.add("마루3(스테이크불갈비피자+치즈오븐스파게티+버팔ㄹ로윙+콜라大)   25,000원");
		menu8.add("마루4(포테이토/불고기/고구마 골드,바이트 피자 택1+치즈오븐스파게티+윙+콜라大)   28,000원");
		menu8.add("점보 포테이토 피자   45cm:22,000원");
		menu8.add("점보 불갈비 피자   45cm:26,000원");

		List<String> menu9 = new ArrayList<String>();	//점보 피자
		menu9.add("치즈오븐 스파게티   5,000원");
		menu9.add("케이준치킨 스파게티  5,500원");
		menu9.add("고구마 스파게티   5,500원");


		List<String> menu10 = new ArrayList<String>();	//사이드메뉴
		menu10.add("로스트윙(6EA)   6,000원");
		menu10.add("로스트윙(10EA)   9,000원");

	
	

		listDataChild.put(listDataHeader.get(0), menu1); // Header, Child data
		listDataChild.put(listDataHeader.get(1), menu2);
		listDataChild.put(listDataHeader.get(2), menu3);
		listDataChild.put(listDataHeader.get(3), menu4);
		listDataChild.put(listDataHeader.get(4), menu5);
		listDataChild.put(listDataHeader.get(5), menu6);
		listDataChild.put(listDataHeader.get(6), menu7);
		listDataChild.put(listDataHeader.get(7), menu8);
		listDataChild.put(listDataHeader.get(8), menu9);
		listDataChild.put(listDataHeader.get(9), menu10);

}
}
