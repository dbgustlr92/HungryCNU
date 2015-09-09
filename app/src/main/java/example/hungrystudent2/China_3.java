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

public class China_3 extends Activity {
	ExpandableListAdapter listAdapter;
	ExpandableListView expListView;
	List<String> listDataHeader;
	HashMap<String, List<String>> listDataChild;

	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.china_3);

		ImageButton a = (ImageButton) findViewById(R.id.call_chinese3);

		a.setOnClickListener(new ImageButton.OnClickListener() {
			@Override
			public void onClick(View v) {
				startActivity(new Intent("android.intent.action.CALL", Uri
						.parse("tel:042-824-5671")));
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
		listDataHeader.add("ÁÖ¹æÀå ÃßÃµº°¹Ì");
		listDataHeader.add("ÃßÃµº°¹Ì");
		listDataHeader.add("°¡Á·ÄÚ½º");
		listDataHeader.add("½Ì±ÛÄÚ½º");
		listDataHeader.add("°èÀıº°¹Ì");
		listDataHeader.add("ººÀ½¼¼Æ®¸Ş´º");
		listDataHeader.add("µÎ°¡Áö¸Ş´º¸¦ µ¿½Ã¿¡");
		listDataHeader.add("¿äÀÏ¸Ş´º");
		listDataHeader.add("¶Ò¹è±â ½ºÆä¼£");
		listDataHeader.add("¿ä¸®ÄÚ½º");
		listDataHeader.add("¸é·ù");
		listDataHeader.add("¹ä·ù");
		listDataHeader.add("¿ä¸®·ù");
		
		// Adding child data
		List<String> menu1 = new ArrayList<String>();
		menu1.add("»ï¼±ÇØ¹°Àï¹İÂ¥Àå 2ÀÎ:13,000¿ø");
		menu1.add("»ï¼±ÇØ¹°¾ß³¢Â«»Í 2ÀÎ:13,000¿ø");
				
		List<String> menu2 = new ArrayList<String>();
		menu2.add("È«±¼ÀÌÂ«»Í 7,000¿ø");
		menu2.add("Äá³ª¹°¼öÁ¦ºñÂ«»Í 7,000¿ø");
		menu2.add("ÇØ¹°¾óÅ«ÀÌÂ«»Í 7,000¿ø");
		menu2.add("Ã»¾ç°íÃßÂ«»Í 7,000¿ø");
		
		List<String> menu3 = new ArrayList<String>();
		menu3.add("1.ÅÁ¼öÀ°+Â¥Àå2(Â«»ÍÀ¸·Î ÁÖ¹®½Ã 1,000¿ø Ãß°¡) 14,000¿ø");
		menu3.add("2.ÅÁ¼öÀ°+ººÀ½¹ä2orÂ«»Í¹ä2 16,000¿ø");
		menu3.add("3.ÅÁ¼öÀ°+Â¥Àå3orÂ«»Í3+¸¸µÎ 20,000¿ø");
		menu3.add("4.ÅÁ¼öÀ°+ÇØ¹°Àï¹İÂ¥Àå2ÀÎorÇØ¹°¾ß³¢Â«»Í2ÀÎ 20,000¿ø");
		menu3.add("5.ÅÁ¼öÀ°+Â¥Àå4orÂ«»Í4+¸¸µÎ 23,000¿ø");
		menu3.add("6.ÅÁ¼öÀ°+Â¥Àå5orÂ«»Í5+¸¸µÎ 27,000¿ø");
				
		List<String> menu4 = new ArrayList<String>();
		menu4.add("1.ÅÁ¼öÀ°+Â¥Àå1orÂ«»Í1 10,000¿ø");
		menu4.add("2.ÅÁ¼öÀ°+ººÀ½¹ä1orÂ«»Í¹ä1 11,000¿ø");
		menu4.add("3.ÅÁ¼öÀ°+»ï¼±Àï¹İÂ¥Àå1ÀÎor»ï¼±¾ß³¢Â«»Í1ÀÎ 12,000¿ø");
				
		List<String> menu5 = new ArrayList<String>();
		menu5.add("¶±±¹+°ø±â¹ä 5,500¿ø");
		menu5.add("¸¸µÎ±¹+°ø±â¹ä 5,500¿ø");
		menu5.add("¶±¸¸µÎ±¹+°ø±â¹ä 5,500¿ø");
				
		List<String> menu6 = new ArrayList<String>();
		menu6.add("Á¦À°ººÀ½+°ø±â¹ä2+±¹¹°+¸¸µÎ5°³ 13,000¿ø");
		menu6.add("¿ÀÂ¡¾îººÀ½+°ø±â¹ä2+±¹¹°+¸¸µÎ5°³ 13,000¿ø");
		menu6.add("¸¶ÆÄµÎºÎ+°ø±â¹ä2+±¹¹°+¸¸µÎ5°³ 13,000¿ø");
				
		List<String> menu7 = new ArrayList<String>();
		menu7.add("Â«Â¥¸é 5,500¿ø");
		menu7.add("ººÂ¥¸é 6,000¿ø");
		menu7.add("ººÂ«¸é 6,000¿ø");
		menu7.add("ÅÁÂ¥¸é 6,500¿ø");
		menu7.add("ÅÁÂ«¸é 6,500¿ø");
		menu7.add("ÅÁºº¹ä 7,000¿ø");
		
		List<String> menu8 = new ArrayList<String>();
		menu8.add("(¿ù)Ã»ÇØ·çÆ¯¹ä 5,500¿ø");
		menu8.add("(È­)»ï¼±ººÀ½¹ä 5,500¿ø");
		menu8.add("(¼ö)À°°³Àå 5,500¿ø");
		menu8.add("(¸ñ)ÀâÃ¤¹ä 5,500¿ø");
		menu8.add("(±İ)Á¦À°µ¤¹ä 5,500¿ø");
				
		List<String> menu9 = new ArrayList<String>();
		menu9.add("¶Ò¹è±âÇØ¹°Â¥Àå 5,500¿ø");
		menu9.add("¶Ò¹è±âÇØ¹°Â«»Í 6,000¿ø");
		menu9.add("¶Ò¹è±â°íÃßÂ«»Í 7,000¿ø");
		menu9.add("¶Ò¹è±â±¼Â«»Í 7,000¿ø");
		menu9.add("¶Ò¹è±âÀ°°³Àå 6,000¿ø");
		menu9.add("¶Ò¹è±â°¥ºñÅÁ 6,000¿ø");
		menu9.add("¶Ò¹è±â³»ÀåÅÁ 6,000¿ø");
		menu9.add("¶Ò¹è±â¼³··ÅÁ 6,000¿ø");
		menu9.add("¶Ò¹è±âÁ¦À°µ¤¹ä 6,000¿ø");
		menu9.add("¶Ò¹è±â¿ÀÂ¡¾îµ¤¹ä 6,000¿ø");
		menu9.add("¶Ò¹è±â¼Ò°í±âµ¤¹ä 7,000¿ø");
				
		List<String> menu10 = new ArrayList<String>();
		menu10.add("1.¾çÀåÇÇ+Â¥Àå2orÂ«»Í2 25,000¿ø");
		menu10.add("2.ÆÈº¸Ã¤+Àï¹İÂ¥Àå2or¾ß³¢Â«»Í2 28,000¿ø");
		menu10.add("3.¿ä¸®·ù2°¡Áö+Â¥Àå3orÂ«»Í3 50,000¿ø");
				
		List<String> menu11 = new ArrayList<String>();
		menu11.add("Â¥Àå¸é 4,500¿ø");
		menu11.add("ÇØ¹°È«ÇÕÂ«»Í 5,000¿ø");
		menu11.add("°£Â¥Àå 5,000¿ø");
		menu11.add("¿ìµ¿ 5,000¿ø");
		menu11.add("¿ï¸é 5,000¿ø");
		menu11.add("Ã»¾ç°íÃßÂ«»Í 7,000¿ø");
		menu11.add("»çÃµÅÁ¸é 7,000¿ø");
		menu11.add("»ï¼±Â¥Àå 6,000¿ø");
		menu11.add("»ï¼±Â«»Í 7,000¿ø");
		menu11.add("»ï¼±¿ï¸é 7,000¿ø");
		menu11.add("»ï¼±¿ìµ¿ 7,000¿ø");
		menu11.add("»ï¼±´©·îÁöÅÁ¸é 9,000¿ø");
		menu11.add("»ï¼±´©·îÁöÅÁ 9,000¿ø");
		
		List<String> menu12 = new ArrayList<String>();
		menu12.add("Â¥Àå¹ä 5,500¿ø");
		menu12.add("Â«»Í¹ä 5,500¿ø");
		menu12.add("ººÀ½¹ä 5,500¿ø");
		menu12.add("¿À¹Ç¶óÀÌ½º 6,000¿ø");
		menu12.add("ÀâÃ¤¹ä 6,000¿ø");
		menu12.add("¼ÛÀÌµ¤¹ä 7,000¿ø");
		menu12.add("»õ¿ìººÀ½¹ä 6,500¿ø");
		menu12.add("»ï¼±ººÀ½¹ä 6,500¿ø");
		menu12.add("¾ß³¢¹ä 6,500¿ø");
		menu12.add("Ã»ÇØ·çÆ¯¹ä 9,000¿ø");
		menu12.add("À¯»ê½½¹ä 9,000¿ø");
		menu12.add("°íÃßÀâÃ¤¹ä 9,000¿ø");
		menu12.add("ÀâÅÁ¹ä 9,000¿ø");
		menu12.add("¼Ò°í±â¼ÛÀÌµ¤¹ä 9,000¿ø");
		
		List<String> menu13 = new ArrayList<String>();
		menu13.add("ÅÁ¼öÀ° ¼Ò:15,000¿ø/Áß:18,000¿ø/´ë:21,000¿ø");
		menu13.add("»çÃµÅÁ¼öÀ° ¼Ò:17,000¿ø/Áß:21,000¿ø/´ë:24,000¿ø");
		menu13.add("¾çÀåÇÇ 25,000¿ø");
		menu13.add("À¯»ê½½ 25,000¿ø");
		menu13.add("ÆÈº¸Ã¤ 25,000¿ø");
		menu13.add("ÀâÅÁ 25,000¿ø");
		menu13.add("±ñÇ³±â 25,000¿ø");
		menu13.add("±ñÇ³À° 25,000¿ø");
		menu13.add("¶óÁ¶±â 25,000¿ø");
		menu13.add("¶óÁ¶À° 25,000¿ø");
		menu13.add("±ñ¼î»õ¿ì 25,000¿ø");
		menu13.add("±ñÇ³»õ¿ì 25,000¿ø");
		menu13.add("´ÑÀÚ¿Ï½º 25,000¿ø");
		menu13.add("°íÃßÀâÃ¤ 25,000¿ø");
		
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
	}

	

}
