package example.hungrystudent2;

import java.util.*;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.*;

public class Pizza_1 extends Activity {
	ExpandableListAdapter listAdapter;
	ExpandableListView expListView;
	List<String> listDataHeader;
	HashMap<String, List<String>> listDataChild;

	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.pizza_1);
		
		ImageButton a = (ImageButton)findViewById(R.id.call_pizza1);

        a.setOnClickListener(new ImageButton.OnClickListener(){

			@Override
			public void onClick(View v) {
				startActivity(new Intent("android.intent.action.CALL",Uri.parse("tel:042-825-0246")));
				
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
		listDataHeader.add("다사랑치킨");
		listDataHeader.add("다사랑피자");
	

		
		// Adding child data
		List<String> menu1 = new ArrayList<String>();	//다사랑치킨
		menu1.add("후라이드치킨  15,000원");
		menu1.add("양념치킨  16,000원");
		menu1.add("후라이드+양념  16,000원");
		menu1.add("순살치킨   15,000원");
		menu1.add("순살양념치킨  16,000원");	
		menu1.add("닭강정  16,000원");	
		menu1.add("화살치킨  16,000원");	
		menu1.add("순살패밀리세트  24,000원");
		menu1.add("치킨탕수육  16,000원");
		menu1.add("순살파닭  17,000원");
		menu1.add("러브스틱  17,000원");
		menu1.add("러브윙  17,000원");
		menu1.add("윙스틱  17,000원");		
		
		List<String> menu2 = new ArrayList<String>();	//다사랑피자
		menu2.add("스크린피자타입M   13,000원");
		menu2.add("스크린피자타입L   16,000원");
		menu2.add("치즈크러스트타입M   18,000원");
		menu2.add("치즈크러스트타입L   20,000원");
		menu2.add("트리플믹스피자M   13,000원");
		menu2.add("트리플믹스피자L   15,000원");
		menu2.add("프리미엄골드타입M   20,000원");
		menu2.add("프리미엄골드타입L   25,000원");
		menu2.add("오븐치즈스파게티   5,000원");
		menu2.add("치즈스틱(5개)   3,000원");
	
		
		listDataChild.put(listDataHeader.get(0), menu1); // Header, Child data
		listDataChild.put(listDataHeader.get(1), menu2);
	
	}
}
