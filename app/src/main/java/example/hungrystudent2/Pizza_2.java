package example.hungrystudent2;


import java.util.*;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.*;

public class Pizza_2 extends Activity{
	ExpandableListAdapter listAdapter;
	ExpandableListView expListView;
	List<String> listDataHeader;
	HashMap<String, List<String>> listDataChild;

	
	protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pizza_2);
        ImageButton a = (ImageButton)findViewById(R.id.call_pizza2);

        a.setOnClickListener(new ImageButton.OnClickListener(){

			@Override
			public void onClick(View v) {
				startActivity(new Intent("android.intent.action.CALL",Uri.parse("tel:042-823-9297")));
				
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
		listDataHeader.add("세트메뉴");
		listDataHeader.add("치킨");
		listDataHeader.add("피자");

		
		// Adding child data
		List<String> menu1 = new ArrayList<String>();	//세트메뉴
		menu1.add("피치세트(콤비네이션피자+후라이드치킨)M  14,900원");
		menu1.add("피치세트(콤비네이션피자+후라이드치킨)L  17,900원");
		menu1.add("치즈피치세트(치즈피자+후라이드)M  14,900원");
		menu1.add("치즈피치세트(치즈피자+후라이드)L  17,900원");
		menu1.add("크리미어니언피치세트(크리미어니언피자+후라이드+콜라)M  17,900원");
		menu1.add("크리미어니언피치세트(크리미어니언피자+후라이드+콜라)L  20,900원");
		menu1.add("스위트불고기피치세트(스위트불고기피자+후라이드+콜라)M  17,000원");
		menu1.add("스위트불고기피치세트(스위트불고기피자+후라이드+콜라)L  20,900원");
		menu1.add("더블포테이토피치세트(더블포테이토피자+후라이드+콜라)M  17,900원");
		menu1.add("더블포테이토피치세트(더블포테이토피자+후라이드+콜라)L  20,900원");		
		menu1.add("고구마피치세트(고구마피자+후라이드+콜라)M  17,900원");
		menu1.add("고구마피치세트(고구마피자+후라이드+콜라)L  20,900원");
		menu1.add("치즈크리스피피치세트(콤비네이션+치즈크리스피+콜라)M  17,900원");
		menu1.add("치즈크리스피피치세트(콤비네이션+치즈크리스피+콜라)L  20,900원");	
		menu1.add("순살피치세트(순살치킨+콤비네이션+칠리소스+콜라)M  17,900원");
		menu1.add("순살피치세트(순살치킨+콤비네이션+칠리소스+콜라)L  20,900원");
		menu1.add("베리베리피치세트(베리베리피자+후라이드+콜라)L  21,900원");
		menu1.add("갈릭엔갈릭피치세트(갈릭엔갈릭피자+후라이드+콜라)M  18,900원");
		menu1.add("갈릭엔갈릭피치세트(갈릭엔갈릭피자+후라이드+콜라)L  21,900원");	
		menu1.add("허니갈릭피치세트(허니갈릭치킨+콤비네이션+콜라)M  18,900원");
		menu1.add("허니갈릭피치세트(허니갈릭치킨+콤비네이션+콜라)L  21,900원");		
		menu1.add("순살쉬림프골드피치세트(순살쉬림프골드+콤비네이션+콜라)M  18,900원");
		menu1.add("순살쉬림프골드피치세트(순살쉬림프골드+콤비네이션+콜라)L  21,900원");		
		menu1.add("쉬림프고르곤졸라피치세트(쉬림프고르곤졸라피자+후라이드+콜라)M  19,900원");
		menu1.add("쉬림프고르곤졸라피치세트(쉬림프고르곤졸라피자+후라이드+콜라)L  22,900원");		
		
		List<String> menu2 = new ArrayList<String>();	//치킨
		menu2.add("후라이드치킨+콜라   11,000원");
		menu2.add("양념치킨+콜라   12,000원");
		menu2.add("훈제치킨+콜라   12,000원");
		menu2.add("허니갈릭치킨+콜라   14,000원");
		menu2.add("순살쉬림프골드치킨+콜라   14,000원");
		menu2.add("순살닭다리치킨+콜라   14,000원");

		List<String> menu3 = new ArrayList<String>();	//피자
		menu3.add("콤비네이션피자M+콜라   10,900원");
		menu3.add("콤비네이션피자L+콜라   13,900원");
		menu3.add("페퍼로니피자M+콜라   10,900원");
		menu3.add("페퍼로니피자L+콜라   13,900원");
		menu3.add("치즈피자M+콜라   10,900원");
		menu3.add("치즈피자L+콜라   13,900원");
		menu3.add("크리미어니언피자M+콜라   13,900원");
		menu3.add("크리미어니언피자L+콜라   16,900원");
		menu3.add("스위트불고기피자M+콜라   13,900원");
		menu3.add("스위트불고기피자L+콜라   16,900원");
		menu3.add("더블포테이토피자M+콜라   13,900원");
		menu3.add("더블포테이토피자L+콜라   16,900원");
		menu3.add("핫리치피자M+콜라   13,900원");
		menu3.add("핫리치피자L+콜라   16,900원");
		menu3.add("고구마피자M+콜라   13,900원");
		menu3.add("고구마피자L+콜라   16,900원");
		menu3.add("갈릭엔갈릭피자M+콜라   14,900원");
		menu3.add("갈릭엔갈릭피자L+콜라   17,9000원");
		menu3.add("쉬림프고르곤졸라피자M+콜라   14,900원");
		menu3.add("쉬림프고르곤졸라피자L+콜라   17,900원");
		menu3.add("베리베리피자L+콜라   17,900원");
		
		
		
		listDataChild.put(listDataHeader.get(0), menu1); // Header, Child data
		listDataChild.put(listDataHeader.get(1), menu2);
		listDataChild.put(listDataHeader.get(2), menu3);
	
	}

}
