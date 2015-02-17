package example.hungrystudent2;


import java.util.*;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.*;


public class Pizza_3 extends Activity{
	ExpandableListAdapter listAdapter;
	ExpandableListView expListView;
	List<String> listDataHeader;
	HashMap<String, List<String>> listDataChild;

	protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pizza_3);
        ImageButton a = (ImageButton)findViewById(R.id.call_pizza3);

        a.setOnClickListener(new ImageButton.OnClickListener(){

			@Override
			public void onClick(View v) {
				startActivity(new Intent("android.intent.action.CALL",Uri.parse("tel:042-355-7440")));
				
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
		listDataHeader.add("피자");
		listDataHeader.add("콤보");
		listDataHeader.add("기타");

		
		// Adding child data
		List<String> menu1 = new ArrayList<String>();	//피자
		menu1.add("차슈차슈피자   22,900원");
		menu1.add("로얄BBQ피자   22,900원");
		menu1.add("갈릭떡갈비피자   18,900원");
		menu1.add("콤비네이션피자   14,900원");
		menu1.add("체다치즈피자   14,900원");
		menu1.add("불고기피자   14,900원");
		menu1.add("포테이토피자   14,900원");
		menu1.add("페퍼로니피자   14,900원");
		menu1.add("고구마피자   14,900원");
		menu1.add("소세지피자   14,900원");
		menu1.add("멕시칸피자   14,900원");
		menu1.add("파인에플피자   14,900원");
		menu1.add("매운불닭피자   16,900원");
		menu1.add("베이컨체다치즈피자   16,900원");
		menu1.add("불갈비피자   18,900원");
		menu1.add("고르곤졸라피자   18,900원");
		menu1.add("불새피자   18,900원");
		menu1.add("쉬림프골드피자   20,900원");
		menu1.add("치즈킹피자   20,900원");
		menu1.add("콰드로피자(4가지맛 체다치즈+페퍼로니+불고기+콤비)   18,900원");
		
		
		List<String> menu2 = new ArrayList<String>();	//콤보
		menu2.add("BigStart 콤보(12인치피자+립+바베큐윙+웨지감자)   23,000원");
		menu2.add("BigStart 콤보(18인치피자+립+바베큐윙+웨지감자)   27,000원");


		List<String> menu3 = new ArrayList<String>();	//기타
		menu3.add("콜라/사이다   1,200원");
		menu3.add("웨지후라이   3,500원");
		menu3.add("버팔로윙   3,500원");
		menu3.add("치킨텐더   3,500원");
		menu3.add("치즈스틱   3,500원");

		
		
		
		
		listDataChild.put(listDataHeader.get(0), menu1); // Header, Child data
		listDataChild.put(listDataHeader.get(1), menu2);
		listDataChild.put(listDataHeader.get(2), menu3);

}
}
