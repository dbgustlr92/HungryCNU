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

public class China_1 extends Activity {
	ExpandableListAdapter listAdapter;
	ExpandableListView expListView;
	List<String> listDataHeader;
	HashMap<String, List<String>> listDataChild;

	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.china_1);

		ImageButton a = (ImageButton) findViewById(R.id.call_chinese1);

		a.setOnClickListener(new ImageButton.OnClickListener() {
			@Override
			public void onClick(View v) {
				startActivity(new Intent("android.intent.action.CALL", Uri
						.parse("tel:042-826-1363")));
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
		listDataHeader.add("¿ä¸®·ù");
		listDataHeader.add("¹İ¹İ¸Ş´º");
		listDataHeader.add("¿ä¸®¼¼Æ®");
		listDataHeader.add("¿äÀÏ¹ä");
		listDataHeader.add("½Å¸Ş´º");
		listDataHeader.add("Àï¹İÄÚ½º");
		listDataHeader.add("½Ì±ÛÄÚ½º");
		listDataHeader.add("¾Ë¶ã¼¼Æ®");
		listDataHeader.add("ÄÚ½º1");
		listDataHeader.add("ÄÚ½º2");
		listDataHeader.add("ÄÚ½º3");
		listDataHeader.add("ÄÚ½º4");
		listDataHeader.add("¶Ò¹è±â¸Ş´º");
		listDataHeader.add("½Å´«¹°½Ã¸®Áî");
		listDataHeader.add("±âÅ¸¼¼Æ®");

		// Adding child data
		List<String> menu1 = new ArrayList<String>();
		menu1.add("Â¥Àå¸é 4,500¿ø");
		menu1.add("Â«»Í 5,000¿ø");
		menu1.add("°£Â¥Àå 5,000¿ø");
		menu1.add("¿ìµ¿ 5,500¿ø");
		menu1.add("¿ï¸é 5,500¿ø");
		menu1.add("Àï¹İÂ¥Àå 6,000¿ø");
		menu1.add("¾ß³¢Â«»Í 6,000¿ø");
		menu1.add("»ê¼±°£Â¥Àå 6,500¿ø");
		menu1.add("»ï¼±¿ìµ¿ 7,000¿ø");
		menu1.add("»ï¼±¿ï¸é 7,000¿ø");
		menu1.add("±â½º¸é 7,000¿ø");
		menu1.add("»õ¼ÛÀÌ¹ö¼¸Â«»Í 7,000¿ø");

		List<String> menu2 = new ArrayList<String>();
		menu2.add("ººÀ½¹ä 5,500¿ø");
		menu2.add("Á¦À°µ¤¹ä 6,000¿ø");
		menu2.add("¿ÀÂ¡¾îµ¤¹ä 6,000¿ø");
		menu2.add("±èÄ¡ººÀ½¹ä 6,000¿ø");
		menu2.add("±èÄ¡µ¤¹ä 6,000¿ø");
		menu2.add("ÀâÃ¤¹ä 6,000¿ø");
		menu2.add("µÅÁö±¹¹ä 6,000¿ø");
		menu2.add("»ï¼±ººÀ½¹ä 7,000¿ø");
		menu2.add("»õ¿ìººÀ½¹ä 7,000¿ø");
		menu2.add("¼ÛÀÌµ¤¹ä 7,000¿ø");
		menu2.add("°íÃßÀâÃ¤¹ä 9,000¿ø");
		menu2.add("ÀâÅÁ¹ä 9,000¿ø");
		menu2.add("À¯»ê½½¹ä 9,000¿ø");

		List<String> menu3 = new ArrayList<String>();
		menu3.add("ÅÁ¼öÀ° 14,000¿ø");
		menu3.add("ÀâÃ¤ 15,000¿ø");
		menu3.add("¸¶ÆÄµÎºÎ 15,000¿ø");
		menu3.add("»çÃµÅÁ¼öÀ° 16,000¿ø");
		menu3.add("ºÒÅ¸´ÂÅÁ¼öÀ° 16,000¿ø");
		menu3.add("¶óÁ¶±â 25,000¿ø");
		menu3.add("¶óÁ¶À° 25,000¿ø");
		menu3.add("±ñÇ³±â 25,000¿ø");
		menu3.add("±ñÇ³À° 25,000¿ø");
		menu3.add("ÆÈº¸Ã¤ 25,000¿ø");
		menu3.add("À¯»ê½½ 25,000¿ø");
		menu3.add("¾çÀåÇÇ 25,000¿ø");
		menu3.add("°íÃßÀâÃ¤ 25,000¿ø");
		menu3.add("´ÑÀÚ¿Ï½º 25,000¿ø");
		menu3.add("±ñÇ³»õ¿ì 25,000¿ø");
		menu3.add("±ñ¼î»õ¿ì 25,000¿ø");		
		
		List<String> menu4 = new ArrayList<String>();
		menu4.add("Â«Â¥¸é 5,500¿ø");
		menu4.add("ººÂ¥¸é 6,000¿ø");
		menu4.add("ººÂ«¸é 6,000¿ø");
		menu4.add("ÅÁÂ¥¸é 6,500¿ø");
		menu4.add("ÅÁÂ«¸é 6,500¿ø");
		menu4.add("ÅÁºº¹ä 7,000¿ø");
		
		List<String> menu5 = new ArrayList<String>();
		menu5.add("¿ä¸®¼±ÅÃ(ÆÈº¸Ã¤/¾çÀåÇÇ/±ñ¼î»õ¿ì ÅÃ1)+Â¥ÀåorÂ«»Í2+¸¸µÎ 25,000¿ø");
		menu5.add("¿ä¸®¼±ÅÃ(ÆÈº¸Ã¤/¾çÀåÇÇ/±ñ¼î»õ¿ì ÅÃ1)+Â¥ÀåorÂ«»Í3+¸¸µÎ 28,000¿ø");
		menu5.add("¿ä¸®¼±ÅÃ(ÆÈº¸Ã¤/¾çÀåÇÇ/±ñ¼î»õ¿ì ÅÃ1)+Àï¹İÂ¥Àåor¾ß³¢Â«»Í2ÀÎ+¸¸µÎ 29,000¿ø");
		
		List<String> menu6 = new ArrayList<String>();
		menu6.add("(¿ù)À°°³Àå 5,500¿ø");
		menu6.add("(È­)»ï¼±ÇØ¹°µ¤¹ä 5,500¿ø");
		menu6.add("(¼ö)»ï¼±ººÀ½¹ä 5,500¿ø");
		menu6.add("(¸ñ)°í±âµ¤¹ä 5,500¿ø");
		menu6.add("(±İ)ÀâÃ¤¹ä 5,500¿ø");
		
		List<String> menu7 = new ArrayList<String>();
		menu7.add("½¡ºÒººÀ½¹ä 7,000¿ø");
		menu7.add("½¡ºÒµ¤¹ä 7,000¿ø");
		menu7.add("½¡ºÒÀâÃ¤¹ä 7,000¿ø");
		
		List<String> menu8 = new ArrayList<String>();
		menu8.add("µî½ÉÅÁ¼öÀ°+Àï¹İÂ¥Àåor¾ß³¢Â«»Í2ÀÎ 19,000¿ø");
		menu8.add("»çÃµÅÁ¼öÀ°+Àï¹İÂ¥Àåor¾ß³¢Â«»Í2ÀÎ 21,000¿ø");	
		
		List<String> menu9 = new ArrayList<String>();
		menu9.add("µî½ÉÅÁ¼öÀ°+Â¥Àå¸éorÂ«»Í 10,000¿ø");
		menu9.add("µî½ÉÅÁ¼öÀ°+ººÀ½¹äorÂ«»Í¹ä 11,000¿ø");
		menu9.add("µî½ÉÅÁ¼öÀ°+Àï¹İÂ¥Àåor¾ß³¢Â«»Í1 12,000¿ø");
		menu9.add("µî½ÉÅÁ¼öÀ°+¶Ò¹è±â¸Ş´º ÅÃ1 13,000¿ø");
		
		List<String> menu10 = new ArrayList<String>();
		menu10.add("µî½ÉÅÁ¼öÀ°+Â¥Àå2orÂ«»Í2 14,000¿ø");
		
		List<String> menu11 = new ArrayList<String>();
		menu11.add("(µî½É/»çÃµ)ÅÁ¼öÀ°or±ñÇ³±â+Â¥ÀåorÂ«»Í2 16,000¿ø");
		
		List<String> menu12 = new ArrayList<String>();
		menu12.add("(µî½É/»çÃµ)ÅÁ¼öÀ°or±ñÇ³±â+Â¥ÀåorÂ«»Í3 20,000¿ø");
		
		List<String> menu13 = new ArrayList<String>();
		menu13.add("µî½ÉÅÁ¼öÀ°+¾çÀåÇÇorÆÈº¸Ã¤ 30,000¿ø");
		
		List<String> menu14 = new ArrayList<String>();
		menu14.add("µî½ÉÅÁ¼öÀ°+¿ä¸®·ù 2°³¼±ÅÃ(µî½ÉÅÁ¼öÀ°/±ñÇ³±â/¾çÀåÇÇ/»çÃµÅÁ¼öÀ°/ÆÈº¸Ã¤) 45,000¿ø");
		
		List<String> menu15 = new ArrayList<String>();
		menu15.add("¶Ò¹è±âÂ¥Àå 5,500¿ø");
		menu15.add("¶Ò¹è±âÂ«»Í 6,000¿ø");
		menu15.add("¶Ò¹è±âÀ°°³Àå 6,000¿ø");
		menu15.add("¶Ò¹è±â¼ø´ë±¹ 6,000¿ø");
		menu15.add("¶Ò¹è±â°¥ºñÅÁ 6,000¿ø");
		menu15.add("¶Ò¹è±â³»ÀåÅÁ 6,000¿ø");
		menu15.add("¶Ò¹è±â±¹¹ä 6,000¿ø");
		menu15.add("¶Ò¹è±âÁ¦À°µ¤¹ä 6,000¿ø");
		menu15.add("¶Ò¹è±â¿ÀÂ¡¾îˆ¬¹ä 6,000¿ø");
		menu15.add("¶Ò¹è±â¼öÁ¦ºñ 7,000¿ø");
		menu15.add("¶Ò¹è±â°íÃßÂ«»Í 7,000¿ø");
		menu15.add("¶Ò¹è±âÈ«±¼ÀÌ 7,000¿ø");
		menu15.add("¶Ò¹è±â±¼Â«»Í 7,000¿ø");
		menu15.add("¶Ò¹è±âºÒ°í±â 7,000¿ø");
		menu15.add("¶Ò¹è±âÇØ¹°µ¤¹ä 7,000¿ø");
		
		List<String> menu16 = new ArrayList<String>();
		menu16.add("½Å´«¹°Â¥Àå 7,000¿ø");
		menu16.add("½Å´«¹°Â«»Í 7,000¿ø");
		menu16.add("½Å´«¹°¼öÁ¦ºñ 7,000¿ø");
		menu16.add("½Å´«¹°±¼Â«»Í 7,000¿ø");
		menu16.add("½Å´«¹°È«ÇÕÂ«»Í 7,000¿ø");
		
		List<String> menu17 = new ArrayList<String>();
		menu17.add("¿ÀÂ¡¾îµÎ·çÄ¡±â+°ø±â¹ä2+Â«»Í±¹¹° 13,000¿ø");
		menu17.add("µÅÁöµÎ·çÄ¡±â+°ø±â¹ä2+Â«»Í±¹¹° 13,000¿ø");
		menu17.add("¸Å¿îÇØ¹°ººÀ½+Â«»Í±¹¹° 13,000¿ø");
		

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
	}

	

}
