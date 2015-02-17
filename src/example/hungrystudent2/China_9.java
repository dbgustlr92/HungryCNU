package example.hungrystudent2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ExpandableListView;
import android.widget.ImageButton;

public class China_9 extends Activity {
	ExpandableListAdapter listAdapter;
	ExpandableListView expListView;
	List<String> listDataHeader;
	HashMap<String, List<String>> listDataChild;

	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.china_9);

		ImageButton a = (ImageButton) findViewById(R.id.call_chinese9);

		a.setOnClickListener(new ImageButton.OnClickListener() {
			@Override
			public void onClick(View v) {
				startActivity(new Intent("android.intent.action.CALL", Uri
						.parse("tel:042-862-9292")));
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
		listDataHeader.add("¸é·ù");
		listDataHeader.add("¹ä·ù");
		listDataHeader.add("¿Õºñ¼º¿ä¸®");
								
		// Adding child data
		List<String> menu1 = new ArrayList<String>();
		menu1.add("Â¥Àå¸é 4,000¿ø");
		menu1.add("Â«»Í 4,500¿ø");
		menu1.add("°£Â¥Àå 4,500¿ø");
		menu1.add("¿ìµ¿ 4,500¿ø");
		menu1.add("¿ï¸é 4,500¿ø");
		menu1.add("±â½º¸é 6,000¿ø");
		menu1.add("»ï¼±Â¥Àå 6,500¿ø");
		menu1.add("»ï¼±¿ìµ¿ 6,500¿ø");
		menu1.add("»ï¼±Â«»Í 6,500¿ø");
		menu1.add("»ï¼±¿ï¸é 6,500¿ø");
		menu1.add("À¯´ÏÂ¥Àå 6,500¿ø");
		menu1.add("Àï¹İÂ¥Àå 5,500¿ø");
		menu1.add("¾ß³¢Â«»Í 6,500¿ø");
						
		List<String> menu2 = new ArrayList<String>();
		menu2.add("ººÀ½¹ä 5,000¿ø");
		menu2.add("Â¥Àå¹ä 5,000¿ø");
		menu2.add("Â«»Í¹ä 5,000¿ø");
		menu2.add("ÀâÃ¤¹ä 6,000¿ø");
		menu2.add("»ï¼±ººÀ½¹ä 6,500¿ø");
		menu2.add("»õ¿ìººÀ½¹ä 6,500¿ø");
		menu2.add("¼ÛÀÌµ¤¹ä 6,500¿ø");
		menu2.add("À¯»ê½½¹ä 11,000¿ø");
		menu2.add("°íÃßÀâÃ¤¹ä 11,000¿ø");
		menu2.add("ÀâÅÁ¹ä 11,000¿ø");		
		menu2.add("±º¸¸µÎ 3,000¿ø");
		menu2.add("¹°¸¸µÎ 4,000¿ø");		
				
		List<String> menu3 = new ArrayList<String>();
		menu3.add("ÅÁ¼öÀ° 14,000¿ø");
		menu3.add("µ§»Ñ¶ó 14,000¿ø");
		menu3.add("ÀâÃ¤ 14,000¿ø");
		menu3.add("¸¶ÆÄµÎºÎ 14,000¿ø");
		menu3.add("»çÃµÅÁ¼öÀ° 20,000¿ø");
		menu3.add("»õ¿ìÅÁ¼öÀ° 22,000¿ø");
		menu3.add("¶óÁ¶±â 22,000¿ø");
		menu3.add("±ñÇ³±â 22,000¿ø");
		menu3.add("±ñ¼î±â 22,000¿ø");
		menu3.add("¶óÁ¶À° 22,000¿ø");
		menu3.add("³­ÀÚ¿Ï½º 22,000¿ø");
		menu3.add("¾çÀåÇÇ 22,000¿ø");
		menu3.add("»õ¿ìÆ¢±è 22,000¿ø");
		menu3.add("°íÃßÀâÃ¤ 25,000¿ø");
		menu3.add("ÆÈº¸Ã¤ 25,000¿ø");
		menu3.add("À¯»ê½½ 25,000¿ø");
		menu3.add("±ñ¼î»õ¿ì 25,000¿ø");
		menu3.add("±ñÇ³»õ¿ì 25,000¿ø");
		menu3.add("¼Ò·ù¿Ï½º 30,000¿ø");
		menu3.add("ÀÏÇ°¿Ï½º 35,000¿ø");
		menu3.add("°Ô»ì¼¡½ºÇÉ 35,000¿ø");
		menu3.add("±¤µ¿¼¡½ºÇÉ 35,000¿ø");
		menu3.add("ÇØ»ïÁê½º 35,000¿ø");
		menu3.add("ÇØ»ï°¥ºñ 35,000¿ø");
		menu3.add("´ß°í±â¼ÛÀÌººÀ½ 50,000¿ø");
		menu3.add("Å«»õ¿ì¸¶´Ã¼Ò½º 8¸¶¸®±âÁØ:50,000¿ø");
		menu3.add("Àü°¡º¹ 55,000¿ø");
						
		listDataChild.put(listDataHeader.get(0), menu1); // Header, Child data
		listDataChild.put(listDataHeader.get(1), menu2);
		listDataChild.put(listDataHeader.get(2), menu3);		
	}

	

}
