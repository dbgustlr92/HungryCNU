package example.hungrystudent2;

import java.util.*;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.*;

public class Snack_3 extends Activity {
	ExpandableListAdapter listAdapter;
	ExpandableListView expListView;
	List<String> listDataHeader;
	HashMap<String, List<String>> listDataChild;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.snack_3);
		
		  ImageButton a = (ImageButton)findViewById(R.id.call_snack3);

	        a.setOnClickListener(new ImageButton.OnClickListener(){

				@Override
				public void onClick(View v) {
					startActivity(new Intent("android.intent.action.CALL",Uri.parse("tel:042-822-6339")));
					
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
		listDataHeader.add("¸Ş´º");
		listDataHeader.add("¼¼Æ®¸Ş´º");

		
		// Adding child data
		List<String> menu1 = new ArrayList<String>();	//¿±±â¸Ş´º
		menu1.add("10,000¿ø ÀÌ»ó ÁÖ¹®½Ã ¹è´ŞµË´Ï´Ù");
		menu1.add("¶±ººÀÌ 2,000¿ø");
		menu1.add("Ä¡Áî¶±ººÀÌ 3,000¿ø");
		menu1.add("ÂüÄ¡±è¹ä 2,000¿ø");
		menu1.add("Ä¡Áî±è¹ä 2,000¿ø");
		menu1.add("»¡°£±è¹ä 1,500¿ø");
		menu1.add("ÄğÇÇ½º 1,500¿ø");
		menu1.add("Æ¢¿Àµ­ 1,000¿ø");
		menu1.add("Æ¢¸¸µÎ 1,000¿ø");
		menu1.add("Æ¢ÀâÃ¤¸»ÀÌ 1,000¿ø");
		menu1.add("Ä¡Áî½ºÆ½ 1,000¿ø");
		menu1.add("±è¸»ÀÌ 1,000¿ø");
		menu1.add("¸À°¨ÀÚ 1,000¿ø");
		menu1.add("Ä¡Å²³Ê°Ù 1,000¿ø");
		menu1.add("°í±¸¸¶°í·ÎÄÉ 1,000¿ø");
		
		
		List<String> menu2 = new ArrayList<String>();	//¿±±â¼¼Æ®
		menu2.add("¶±ººÀÌ+Æ¢¿Àµ­+Æ¢¸¸µÎ 4,000¿ø");
		menu2.add("¶±ººÀÌ+Æ¢¿Àµ­2+Æ¢¸¸µÎ+ÄğÇÇ½º 6,500¿ø");
		menu2.add("¶±ººÀÌ2+Æ¢¿Àµ­2+Æ¢¸¸µÎ+»¡°£±è¹ä 8,000¿ø");
		menu2.add("¶±ººÀÌ2+Æ¢¿Àµ­2+Æ¢¸¸µÎ2+Æ¢ÀâÃ¤¸»ÀÌ+ÄğÇÇ½º 10,000¿ø");
		menu2.add("¶±ººÀÌ2+Æ¢¿Àµ­2+Æ¢¸¸µÎ2+Æ¢ÀâÃ¤¸»ÀÌ+»¡°£±è¹ä 10,000¿ø");
		
		
		listDataChild.put(listDataHeader.get(0), menu1); // Header, Child data
		listDataChild.put(listDataHeader.get(1), menu2);
	}
}
