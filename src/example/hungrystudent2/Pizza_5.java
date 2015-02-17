package example.hungrystudent2;

import java.util.*;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.*;


public class Pizza_5 extends Activity {
	ExpandableListAdapter listAdapter;
	ExpandableListView expListView;
	List<String> listDataHeader;
	HashMap<String, List<String>> listDataChild;


	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.pizza_5);
		
		ImageButton a = (ImageButton)findViewById(R.id.call_pizza5);

        a.setOnClickListener(new ImageButton.OnClickListener(){

			@Override
			public void onClick(View v) {
				startActivity(new Intent("android.intent.action.CALL",Uri.parse("tel:042-823-8874")));
				
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
		listDataHeader.add("슈퍼슈프림피자");
		listDataHeader.add("불고기피자");
		listDataHeader.add("페파로니피자");
		listDataHeader.add("야채다이어트피자");
		listDataHeader.add("핫(매운)피자");
		listDataHeader.add("하와이언피자");
		listDataHeader.add("불갈비피자");
		listDataHeader.add("그릴바베큐치킨");
		listDataHeader.add("포테이토베이컨피자");
		listDataHeader.add("베이컨머스타드피자");
		listDataHeader.add("고구마벌집피자");
		listDataHeader.add("콤비리치피자");
		listDataHeader.add("핫치킨피자");
		listDataHeader.add("단호박피자");
		listDataHeader.add("스테이크피자");
		listDataHeader.add("기타");
		listDataHeader.add("알뜰세트");
		listDataHeader.add("스파게티&사이드메뉴");
		listDataHeader.add("추가메뉴");
		

		// Adding child data
		List<String> menu1 = new ArrayList<String>();	//슈퍼슈프림피자
		menu1.add("치즈바이트R   17,000원");
		menu1.add("치즈바이트L   22,000원");
		menu1.add("치즈바이트F   28,000원");
		menu1.add("팬피자R   11,000원");
		menu1.add("팬피자L   15,000원");
		menu1.add("스크린피자R   11,000원");
		menu1.add("스크린피자L   15,000원");
		menu1.add("씬 피자R   11,000원");
		menu1.add("씬 피자L   15,000원");
		menu1.add("치즈크러스트R   14,000원");
		menu1.add("치즈크러스트L   18,000원");
		menu1.add("치즈크러스트F   23,000원");
		menu1.add("고구마 골드 크러스트R   16,000원");
		menu1.add("고구마 골드 크러스트L   20,000원");
		menu1.add("고구마 골드 크러스트F   25,000원");
		menu1.add("더블 리치 골드R   16,000원");
		menu1.add("더블 리치 골드L   20,000원");
		menu1.add("더블 리치 골드F   25,000원");				
		
		
		List<String> menu2 = new ArrayList<String>();	//불고기피자
		menu2.add("치즈바이트R   17,000원");
		menu2.add("치즈바이트L   22,000원");
		menu2.add("치즈바이트F   28,000원");
		menu2.add("팬피자R   11,000원");
		menu2.add("팬피자L   15,000원");
		menu2.add("스크린피자R   11,000원");
		menu2.add("스크린피자L   15,000원");
		menu2.add("스크린피자F   19,000원");
		menu2.add("씬 피자R   11,000원");
		menu2.add("씬 피자L   15,000원");
		menu2.add("치즈크러스트R   14,000원");
		menu2.add("치즈크러스트L   18,000원");
		menu2.add("치즈크러스트F   23,000원");
		menu2.add("고구마 골드 크러스트R   16,000원");
		menu2.add("고구마 골드 크러스트L   20,000원");
		menu2.add("고구마 골드 크러스트F   25,000원");
		menu2.add("더블 리치 골드R   16,000원");
		menu2.add("더블 리치 골드L   20,000원");
		menu2.add("더블 리치 골드F   25,000원");


		List<String> menu3 = new ArrayList<String>();	//페퍼로니 피자
		menu3.add("치즈바이트R   17,000원");
		menu3.add("치즈바이트L   22,000원");
		menu3.add("치즈바이트F   28,000원");
		menu3.add("팬피자R   11,000원");
		menu3.add("팬피자L   15,000원");
		menu3.add("스크린피자R   11,000원");
		menu3.add("스크린피자L   15,000원");
		menu3.add("스크린피자F   19,000원");
		menu3.add("씬 피자R   11,000원");
		menu3.add("씬 피자L   15,000원");
		menu3.add("치즈크러스트R   14,000원");
		menu3.add("치즈크러스트L   18,000원");
		menu3.add("치즈크러스트F   23,000원");
		menu3.add("고구마 골드 크러스트R   16,000원");
		menu3.add("고구마 골드 크러스트L   20,000원");
		menu3.add("고구마 골드 크러스트F   25,000원");
		menu3.add("더블 리치 골드R   16,000원");
		menu3.add("더블 리치 골드L   20,000원");
		menu3.add("더블 리치 골드F   25,000원");

		List<String> menu4 = new ArrayList<String>();	//야채다이어트 피자
		menu4.add("치즈바이트R   17,000원");
		menu4.add("치즈바이트L   22,000원");
		menu4.add("치즈바이트F   28,000원");
		menu4.add("팬피자R   11,000원");
		menu4.add("팬피자L   15,000원");
		menu4.add("스크린피자R   11,000원");
		menu4.add("스크린피자L   15,000원");
		menu4.add("스크린피자F   19,000원");
		menu4.add("씬 피자R   11,000원");
		menu4.add("씬 피자L   15,000원");
		menu4.add("치즈크러스트R   14,000원");
		menu4.add("치즈크러스트L   18,000원");
		menu4.add("치즈크러스트F   23,000원");
		menu4.add("고구마 골드 크러스트R   16,000원");
		menu4.add("고구마 골드 크러스트L   20,000원");
		menu4.add("고구마 골드 크러스트F   25,000원");
		menu4.add("더블 리치 골드R   16,000원");
		menu4.add("더블 리치 골드L   20,000원");
		menu4.add("더블 리치 골드F   25,000원");


		List<String> menu5 = new ArrayList<String>();	//핫(매운) 피자
		menu5.add("치즈바이트R   18,000원");
		menu5.add("치즈바이트L   23,000원");
		menu5.add("치즈바이트F   29,000원");
		menu5.add("팬피자R   12,000원");
		menu5.add("팬피자L   16,000원");
		menu5.add("스크린피자R   12,000원");
		menu5.add("스크린피자L   16,000원");
		menu5.add("스크린피자F   21,000원");
		menu5.add("씬 피자R   12,000원");
		menu5.add("씬 피자L   16,000원");
		menu5.add("치즈크러스트R   15,000원");
		menu5.add("치즈크러스트L   19,000원");
		menu5.add("치즈크러스트F   24,000원");
		menu5.add("고구마 골드 크러스트R   17,000원");
		menu5.add("고구마 골드 크러스트L   21,000원");
		menu5.add("고구마 골드 크러스트F   26,000원");
		menu5.add("더블 리치 골드R   17,000원");
		menu5.add("더블 리치 골드L   21,000원");
		menu5.add("더블 리치 골드F   26,000원");


		List<String> menu6 = new ArrayList<String>();	//하와이언 피자
		menu6.add("치즈바이트R   17,000원");
		menu6.add("치즈바이트L   22,000원");
		menu6.add("치즈바이트F   28,000원");
		menu6.add("팬피자R   11,000원");
		menu6.add("팬피자L   15,000원");
		menu6.add("스크린피자R   11,000원");
		menu6.add("스크린피자L   15,000원");
		menu6.add("스크린피자F   19,000원");
		menu6.add("씬 피자R   11,000원");
		menu6.add("씬 피자L   15,000원");
		menu6.add("치즈크러스트R   14,000원");
		menu6.add("치즈크러스트L   18,000원");
		menu6.add("치즈크러스트F   23,000원");
		menu6.add("고구마 골드 크러스트R   16,000원");
		menu6.add("고구마 골드 크러스트L   20,000원");
		menu6.add("고구마 골드 크러스트F   25,000원");
		menu6.add("더블 리치 골드R   16,000원");
		menu6.add("더블 리치 골드L   20,000원");
		menu6.add("더블 리치 골드F   25,000원");


		List<String> menu7 = new ArrayList<String>();	//불갈비 피자
		menu7.add("치즈바이트R   18,000원");
		menu7.add("치즈바이트L   23,000원");
		menu7.add("치즈바이트F   29,000원");
		menu7.add("팬피자R   12,000원");
		menu7.add("팬피자L   16,000원");
		menu7.add("스크린피자R   12,000원");
		menu7.add("스크린피자L   16,000원");
		menu7.add("스크린피자F   21,000원");
		menu7.add("씬 피자R   12,000원");
		menu7.add("씬 피자L   16,000원");
		menu7.add("치즈크러스트R   15,000원");
		menu7.add("치즈크러스트L   19,000원");
		menu7.add("치즈크러스트F   24,000원");
		menu7.add("고구마 골드 크러스트R   17,000원");
		menu7.add("고구마 골드 크러스트L   21,000원");
		menu7.add("고구마 골드 크러스트F   26,000원");
		menu7.add("더블 리치 골드R   17,000원");
		menu7.add("더블 리치 골드L   21,000원");
		menu7.add("더블 리치 골드F   26,000원");

		List<String> menu8 = new ArrayList<String>();	//그릴바베큐치킨 피자
		menu8.add("치즈바이트R   19,000원");
		menu8.add("치즈바이트L   24,000원");
		menu8.add("치즈바이트F   30,000원");
		menu8.add("팬피자R   13,000원");
		menu8.add("팬피자L   17,000원");
		menu8.add("스크린피자R   13,000원");
		menu8.add("스크린피자L   17,000원");
		menu8.add("스크린피자F   22,000원");
		menu8.add("씬 피자R   12,000원");
		menu8.add("씬 피자L   16,000원");
		menu8.add("치즈크러스트R   16,000원");
		menu8.add("치즈크러스트L   20,000원");
		menu8.add("치즈크러스트F   25,000원");
		menu8.add("고구마 골드 크러스트R   18,000원");
		menu8.add("고구마 골드 크러스트L   22,000원");
		menu8.add("고구마 골드 크러스트F   27,000원");
		menu8.add("더블 리치 골드R   18,000원");
		menu8.add("더블 리치 골드L   22,000원");
		menu8.add("더블 리치 골드F   27,000원");

		List<String> menu9 = new ArrayList<String>();	//포테이토베이컨피자 피자
		menu9.add("치즈바이트R   19,000원");
		menu9.add("치즈바이트L   24,000원");
		menu9.add("치즈바이트F   30,000원");
		menu9.add("팬피자R   13,000원");
		menu9.add("팬피자L   17,000원");
		menu9.add("스크린피자R   13,000원");
		menu9.add("스크린피자L   17,000원");
		menu9.add("스크린피자F   22,000원");
		menu9.add("씬 피자R   12,000원");
		menu9.add("씬 피자L   16,000원");
		menu9.add("치즈크러스트R   16,000원");
		menu9.add("치즈크러스트L   20,000원");
		menu9.add("치즈크러스트F   25,000원");
		menu9.add("고구마 골드 크러스트R   18,000원");
		menu9.add("고구마 골드 크러스트L   22,000원");
		menu9.add("고구마 골드 크러스트F   27,000원");
		menu9.add("더블 리치 골드R   18,000원");
		menu9.add("더블 리치 골드L   22,000원");
		menu9.add("더블 리치 골드F   27,000원");

		List<String> menu10 = new ArrayList<String>();	//베이컨머스타드 피자
		menu10.add("치즈바이트R   19,000원");
		menu10.add("치즈바이트L   24,000원");
		menu10.add("치즈바이트F   30,000원");
		menu10.add("팬피자R   13,000원");
		menu10.add("팬피자L   17,000원");
		menu10.add("스크린피자R   13,000원");
		menu10.add("스크린피자L   17,000원");
		menu10.add("스크린피자F   22,000원");
		menu10.add("씬 피자R   12,000원");
		menu10.add("씬 피자L   16,000원");
		menu10.add("치즈크러스트R   16,000원");
		menu10.add("치즈크러스트L   20,000원");
		menu10.add("치즈크러스트F   25,000원");
		menu10.add("고구마 골드 크러스트R   18,000원");
		menu10.add("고구마 골드 크러스트L   22,000원");
		menu10.add("고구마 골드 크러스트F   27,000원");
		menu10.add("더블 리치 골드R   18,000원");
		menu10.add("더블 리치 골드L   22,000원");
		menu10.add("더블 리치 골드F   27,000원");

		List<String> menu11 = new ArrayList<String>();	//고구마벌집 피자
		menu11.add("치즈바이트R   20,000원");
		menu11.add("치즈바이트L   25,000원");
		menu11.add("치즈바이트F   31,000원");
		menu11.add("팬피자R   14,000원");
		menu11.add("팬피자L   18,000원");
		menu11.add("스크린피자R   14,000원");
		menu11.add("스크린피자L   18,000원");
		menu11.add("스크린피자F   23,000원");
		menu11.add("씬 피자R   13,000원");
		menu11.add("씬 피자L   17,000원");
		menu11.add("치즈크러스트R   17,000원");
		menu11.add("치즈크러스트L   21,000원");
		menu11.add("치즈크러스트F   26,000원");
		menu11.add("고구마 골드 크러스트R   19,000원");
		menu11.add("고구마 골드 크러스트L   23,000원");
		menu11.add("고구마 골드 크러스트F   28,000원");
		menu11.add("더블 리치 골드R   19,000원");
		menu11.add("더블 리치 골드L   23,000원");
		menu11.add("더블 리치 골드F   28,000원");

		List<String> menu12 = new ArrayList<String>();	//콤비리치 피자
		menu12.add("치즈바이트R   19,000원");
		menu12.add("치즈바이트L   24,000원");
		menu12.add("치즈바이트F   30,000원");
		menu12.add("팬피자R   13,000원");
		menu12.add("팬피자L   17,000원");
		menu12.add("스크린피자R   13,000원");
		menu12.add("스크린피자L   17,000원");
		menu12.add("스크린피자F   22,000원");
		menu12.add("씬 피자R   12,000원");
		menu12.add("씬 피자L   16,000원");
		menu12.add("치즈크러스트R   16,000원");
		menu12.add("치즈크러스트L   20,000원");
		menu12.add("치즈크러스트F   25,000원");
		menu12.add("고구마 골드 크러스트R   18,000원");
		menu12.add("고구마 골드 크러스트L   22,000원");
		menu12.add("고구마 골드 크러스트F   27,000원");
		menu12.add("더블 리치 골드R   18,000원");
		menu12.add("더블 리치 골드L   22,000원");
		menu12.add("더블 리치 골드F   27,000원");

		List<String> menu13 = new ArrayList<String>();	//핫치킨 피자
		menu13.add("치즈바이트R   19,000원");
		menu13.add("치즈바이트L   24,000원");
		menu13.add("치즈바이트F   30,000원");
		menu13.add("팬피자R   13,000원");
		menu13.add("팬피자L   17,000원");
		menu13.add("스크린피자R   13,000원");
		menu13.add("스크린피자L   17,000원");
		menu13.add("스크린피자F   22,000원");
		menu13.add("씬 피자R   12,000원");
		menu13.add("씬 피자L   16,000원");
		menu13.add("치즈크러스트R   16,000원");
		menu13.add("치즈크러스트L   20,000원");
		menu13.add("치즈크러스트F   25,000원");
		menu13.add("고구마 골드 크러스트R   18,000원");
		menu13.add("고구마 골드 크러스트L   22,000원");
		menu13.add("고구마 골드 크러스트F   27,000원");
		menu13.add("더블 리치 골드R   18,000원");
		menu13.add("더블 리치 골드L   22,000원");
		menu13.add("더블 리치 골드F   27,000원");
		

		List<String> menu14 = new ArrayList<String>();	//단호박 피자
		menu14.add("치즈바이트R   19,000원");
		menu14.add("치즈바이트L   24,000원");
		menu14.add("치즈바이트F   30,000원");
		menu14.add("팬피자R   13,000원");
		menu14.add("팬피자L   17,000원");
		menu14.add("스크린피자R   13,000원");
		menu14.add("스크린피자L   17,000원");
		menu14.add("스크린피자F   22,000원");
		menu14.add("씬 피자R   12,000원");
		menu14.add("씬 피자L   16,000원");
		menu14.add("치즈크러스트R   16,000원");
		menu14.add("치즈크러스트L   20,000원");
		menu14.add("치즈크러스트F   25,000원");
		menu14.add("고구마 골드 크러스트R   18,000원");
		menu14.add("고구마 골드 크러스트L   22,000원");
		menu14.add("고구마 골드 크러스트F   27,000원");
		menu14.add("더블 리치 골드R   18,000원");
		menu14.add("더블 리치 골드L   22,000원");
		menu14.add("더블 리치 골드F   27,000원");

		List<String> menu15 = new ArrayList<String>();	//스테이크 피자
		menu15.add("치즈바이트R   20,000원");
		menu15.add("치즈바이트L   25,000원");
		menu15.add("치즈바이트F   31,000원");
		menu15.add("팬피자R   14,000원");
		menu15.add("팬피자L   18,000원");
		menu15.add("스크린피자R   14,000원");
		menu15.add("스크린피자L   18,000원");
		menu15.add("스크린피자F   23,000원");
		menu15.add("씬 피자R   13,000원");
		menu15.add("씬 피자L   17,000원");
		menu15.add("치즈크러스트R   17,000원");
		menu15.add("치즈크러스트L   21,000원");
		menu15.add("치즈크러스트F   26,000원");
		menu15.add("고구마 골드 크러스트R   19,000원");
		menu15.add("고구마 골드 크러스트L   23,000원");
		menu15.add("고구마 골드 크러스트F   28,000원");
		menu15.add("더블 리치 골드R   19,000원");
		menu15.add("더블 리치 골드L   23,000원");
		menu15.add("더블 리치 골드F   28,000원");

		List<String> menu16 = new ArrayList<String>();	//기타
		menu16.add("고르곤졸라피자   씬R:14,000원");				
		menu16.add("고르곤졸라피자   씬L:18,000원");
		menu16.add("쉬림프골드피자   R:18,000원");
		menu16.add("쉬림프골드피자   L:21,000원");


		List<String> menu17 = new ArrayList<String>();	//알뜰세트
		menu17.add("3인세트(팬피자R+치즈오븐스파게티+콜라)   15,000원");				
		menu17.add("4인세트(팬피자L+치즈오븐스파게티+콜라)   19,000원");
		menu17.add("5인세트(팬피자L+치즈오븐스파게티2+콜라)   23,000원");
		menu17.add("B형 세트(치즈크러스트R+치즈오븐스파게티+콜라)   18,000원");
		menu17.add("A형 세트(치즈크러스트L+치즈오븐스파게티+콜라)   22,000원");


		List<String> menu18 = new ArrayList<String>();	//스파게티&사이드메뉴
		menu18.add("치즈오븐스파게티   5,000원");
		menu18.add("미트볼스파게티   5,000원");
		menu18.add("페파로니스파게티   5,500원");
		menu18.add("베이컨크림스파게티   6,000원");
		menu18.add("해물크림스파게티   6,500원");
		menu18.add("까르보나라스파게티   6,500원");
		menu18.add("버팔로윙(8EA)   5,500원");
		menu18.add("치킨텐더(5EA)   4,000원");
		menu18.add("치즈스틱(6EA)   3,500원");
		menu18.add("고구마스틱(7EA)   3,500원");
		menu18.add("새우오븐라이스   5,500원");
		menu18.add("햄&야채라이스   5,000원");
		menu18.add("치킨텐더   5,000원");
		menu18.add("포테이토스파게티   5,500원");
		menu18.add("해물스파게티   5,500원");
		menu18.add("고구마스틱(5EA)   3,000원");
		menu18.add("포테이토스틱   2,500원");


		List<String> menu19 = new ArrayList<String>();	//추가메뉴
		menu19.add("갈릭딥핑소스 추가   1개:300원");
		menu19.add("핫소스 추가   1개:200원");
		menu19.add("피클 추가   1개:300원");
		menu19.add("치즈가루 추가   1개:200원");
		menu19.add("퐁듀치즈(용기)   1,000원");
		menu19.add("코카콜라(500ml)   1,000원");
		menu19.add("코카콜라(1.25L)   1,500원");
		menu19.add("스프라이트(500ml)   1,000원");
		menu19.add("스프라이트(1.25L)   1,500원");

	
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
		listDataChild.put(listDataHeader.get(10), menu11);
		listDataChild.put(listDataHeader.get(11), menu12);
		listDataChild.put(listDataHeader.get(12), menu13);
		listDataChild.put(listDataHeader.get(13), menu14);
		listDataChild.put(listDataHeader.get(14), menu15);
		listDataChild.put(listDataHeader.get(15), menu16);
		listDataChild.put(listDataHeader.get(16), menu17);
		listDataChild.put(listDataHeader.get(17), menu18);
		listDataChild.put(listDataHeader.get(18), menu19);
		

}
}
