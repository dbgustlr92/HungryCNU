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

public class China_8 extends Activity {
	ExpandableListAdapter listAdapter;
	ExpandableListView expListView;
	List<String> listDataHeader;
	HashMap<String, List<String>> listDataChild;

	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.china_8);

		ImageButton a = (ImageButton) findViewById(R.id.call_chinese8);

		a.setOnClickListener(new ImageButton.OnClickListener() {
			@Override
			public void onClick(View v) {
				startActivity(new Intent("android.intent.action.CALL", Uri
						.parse("tel:042-825-2033")));
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
		listDataHeader.add("°èÀıº°¹Ì");
		listDataHeader.add("¸Ş´º¼Ò°³1");
		listDataHeader.add("Â¥¿À½ºÆä¼È");
		listDataHeader.add("½Ì±Û¼¼Æ®");
		listDataHeader.add("°£Â¥Àå¼¼Æ®");
		listDataHeader.add("ÅÁ¼öÀ°¼¼Æ®");
		listDataHeader.add("ººÀ½¹ä¼¼Æ®");
		listDataHeader.add("°¡Á·ÄÚ½º");
		listDataHeader.add("¹İ¹İ¸Ş´º");
		listDataHeader.add("¿ä¸®¼¼Æ®");
		listDataHeader.add("¸Ş´º¼Ò°³2");
		listDataHeader.add("¸é·ù");
		listDataHeader.add("¹ä·ù");
		listDataHeader.add("¿ä¸®·ù");
						
		// Adding child data
		List<String> menu1 = new ArrayList<String>();
		menu1.add("¿Õ¸¸µÎ 5°³:5,000¿ø");
						
		List<String> menu2 = new ArrayList<String>();
		menu2.add("¶Ò¹è±â¼öÁ¦ºñÂ«»Í 7,000¿ø");
		menu2.add("¶Ò¹è±âÂ¥Àå 5,500¿ø");
		menu2.add("¶Ò¹è±âÂ«»Í 6,000¿ø");
		menu2.add("¶Ò¹è±âÀ°°³Àå 6,500¿ø");
		menu2.add("¶Ò¹è±â°¥ºñÅÁ 6,500¿ø");
		menu2.add("¶Ò¹è±â¼³··ÅÁ 6,500¿ø");
		menu2.add("¶Ò¹è±â³»ÀåÅÁ 6,500¿ø");
		menu2.add("³«Áö»ï¼±¸Å¿îÂ«»Í 8,000¿ø");
		menu2.add("119ºÒÂ«»Í 7,000¿ø");
		menu2.add("°íÃßÂ«»Í 7,000¿ø");		
		menu2.add("»ï¼±Â«»Í 7,000¿ø");
		menu2.add("ÈË±¼ÀÌÂ«»Í 7,000¿ø");		
		menu2.add("±¼Â«»Í 7,000¿ø");
		menu2.add("È«ÇÕÂ«»Í 7,000¿ø");
				
		List<String> menu3 = new ArrayList<String>();
		menu3.add("ÇØ¹°Àï¹İÂ¥Àå 1ÀÎ:7,000¿ø/2ÀÎ:13,000¿ø/3ÀÎ:19,000¿ø");
		menu3.add("ÇØ¹°¾ß³¢Â«»Í 1ÀÎ:7,000¿ø/2ÀÎ:13,000¿ø/3ÀÎ:19,000¿ø");
						
		List<String> menu4 = new ArrayList<String>();
		menu4.add("1.ÅÁ¼öÀ°+Â¥Àå1orÂ«»Í1+¸¸µÎ 10,000¿ø");
		menu4.add("2.ÅÁ¼öÀ°+ººÀ½¹ä1orÂ«»Í¹ä1+¸¸µÎ 11,000¿ø");
		menu4.add("3.ÅÁ¼öÀ°+¶Ò¹è±âÂ¥Àå1or¶Ò¹è±âÂ«»Í1+¸¸µÎ 12,000¿ø");
										
		List<String> menu5 = new ArrayList<String>();
		menu5.add("A.ÅÁ¼öÀ°+°£Â¥Àå2+¸¸µÎ 17,000¿ø");
		menu5.add("B.ÅÁ¼öÀ°(Áß)+°£Â¥Àå3+¸¸µÎ 22,000¿ø");
		menu5.add("C.ÅÁ¼öÀ°(Áß)+°£Â¥Àå4+¸¸µÎ 27,000¿ø");
						
		List<String> menu6 = new ArrayList<String>();
		menu6.add("A.ÅÁ¼öÀ°+Â¥Àå2+¸¸µÎ 15,000¿ø");
		menu6.add("B.ÅÁ¼öÀ°+Â¥Àå1+Â«»Í1+¸¸µÎ 16,000¿ø");
		menu6.add("C.ÅÁ¼öÀ°+Â«»Í2+¸¸µÎ 17,000¿ø");
		menu6.add("D.ÅÁ¼öÀ°(Áß)+Â¥Àå3orÂ«»Í3+¸¸µÎ 21,000¿ø");
		menu6.add("E.¾çÀåÇÇorÆÈº¸Ã¤+ÅÁ¼öÀ°+¸¸µÎ 33,000¿ø");
								
		List<String> menu7 = new ArrayList<String>();
		menu7.add("A.ÅÁ¼öÀ°+ººÀ½¹ä2+¸¸µÎ 19,000¿ø");
		menu7.add("B.ÅÁ¼öÀ°(Áß)+ººÀ½¹ä3+¸¸µÎ 24,000¿ø");
		menu7.add("C.ÅÁ¼öÀ°(Áß)+ººÀ½¹ä4+¸¸µÎ 29,000¿ø");
								
		List<String> menu8 = new ArrayList<String>();
		menu8.add("1.»çÃµÅÁ¼öÀ°+»ï¼±Àï¹İÂ¥Àå(2ÀÎ)+Â«»Í±¹¹° 25,000¿ø");
		menu8.add("2.¾çÀåÇÇ+»ï¼±Àï¹İÂ¥Àå(2ÀÎ)+Â«»Í±¹¹° 27,000¿ø");
		menu8.add("3.ÆÈº¸Ã¤+»ï¼±Àï¹İÂ¥Àå(2ÀÎ)+Â«»Í±¹¹° 27,000¿ø");
		menu8.add("4.±ñ¼î»õ¿ì+»ï¼±Àï¹İÂ¥Àå(2ÀÎ)+Â«»Í±¹¹° 27,000¿ø");
		menu8.add("5.±ñÇ³±â+»ï¼±Àï¹İÂ¥Àå(2ÀÎ)+Â«»Í±¹¹° 27,000¿ø");
		menu8.add("6.À¯»ê½½+»ï¼±Àï¹İÂ¥Àå(2ÀÎ)+Â«»Í±¹¹° 27,000¿ø");
		
		List<String> menu9 = new ArrayList<String>();
		menu9.add("Â«Â¥¸é 5,500¿ø");
		menu9.add("ººÂ¥¸é 6,000¿ø");
		menu9.add("ººÂ«¸é 6,000¿ø");
		menu9.add("ÅÁÂ¥¸é 6,500¿ø");
		menu9.add("ÅÁÂ«¸é 6,500¿ø");
		menu9.add("ÅÁºº¹ä 7,000¿ø");
		
		List<String> menu10 = new ArrayList<String>();
		menu10.add("A.¾çÀåÇÇ+ÆÈº¸Ã¤+ÅÁ¼öÀ° 55,500¿ø");
		menu10.add("B.À¯»ê½½+¾çÀåÇÇ+±øÇ³±â 55,500¿ø");
		menu10.add("C.À¯»ê½½+±ñ¼î»õ¿ì+°íÃßÀâÃ¤ 55,500¿ø");
		menu10.add("D.À¯»ê½½+ÆÈº¸Ã¤+°íÃßÀâÃ¤ 55,500¿ø");
		
		List<String> menu11 = new ArrayList<String>();
		menu11.add("Á¦À°ººÀ½+°ø±â¹ä2+±¹¹° 14,000¿ø");
		menu11.add("¿ÀÂ¡¾îººÀ½+°ø±â¹ä2+±¹¹° 14,000¿ø");
		menu11.add("³«ÁöººÀ½+°ø±â¹ä2+±¹¹° 14,000¿ø");
		menu11.add("¼Ò°í±âººÀ½+°ø±â¹ä2+±¹¹° 14,000¿ø");
		
		List<String> menu12 = new ArrayList<String>();
		menu12.add("Â¥Àå¸é 4,500¿ø");
		menu12.add("Â«»Í 5,000¿ø");
		menu12.add("¿ìµ¿ 5,500¿ø");
		menu12.add("°£Â¥Àå 5,000¿ø");
		menu12.add("¿ï¸é 5,500¿ø");
		menu12.add("»ï¼±Â¥Àå 6,500¿ø");
		menu12.add("À¯´ÏÂ¥Àå 6,500¿ø");
		menu12.add("»çÃµÂ¥Àå 6,500¿ø");
		menu12.add("±¼Â«»Í 7,000¿ø");
		menu12.add("°íÃßÂ«»Í 7,000¿ø");
		menu12.add("»ï¼±Â«»Í 7,000¿ø");
		menu12.add("»ï¼±¿ìµ¿ 7,000¿ø");
		menu12.add("»ï¼±¿ï¸é 7,000¿ø");
		menu12.add("±â½º¸é(2ÀÎÀÌ»ó) 7,000¿ø");
		menu12.add("±º¸¸µÎ 4,000¿ø");
		menu12.add("¹°¸¸µÎ 4,000¿ø");
		
		List<String> menu13 = new ArrayList<String>();
		menu13.add("ººÀ½¹ä 5,500¿ø");
		menu13.add("Â¥Àå¹ä 5,500¿ø");
		menu13.add("Â«»Í¹ä 5,500¿ø");
		menu13.add("ÀâÃ¤¹ä 6,500¿ø");
		menu13.add("¿À¹Ç¶óÀÌ½º 6,500¿ø");
		menu13.add("Á¦À°µ¤¹ä 6,500¿ø");
		menu13.add("¿ÀÂ¡¾îµ¤¹ä 6,500¿ø");
		menu13.add("¼ÛÀÌµ¤¹ä 7,000¿ø");
		menu13.add("¼è°í±âµ¤¹ä 6,500¿ø");
		menu13.add("»ï¼±ººÀ½¹ä 7,000¿ø");
		menu13.add("»õ¿ìººÀ½¹ä 7,000¿ø");
		menu13.add("»ï¼±Â«»Í¹ä 7,500¿ø");
		menu13.add("°íÃßÀâÃ¤¹ä 10,000¿ø");
		menu13.add("ÀâÅÁ¹ä 10,000¿ø");
		menu13.add("À¯»ê½½¹ä 10,000¿ø");
		
		List<String> menu14 = new ArrayList<String>();
		menu14.add("ÅÁ¼öÀ° ¼Ò:15,000¿ø/Áß:18,000¿ø/´ë:22,000¿ø");
		menu14.add("»çÃµÅÁ¼öÀ° 20,000¿ø");
		menu14.add("»ï¼±Â«»Í±¹¹° 10,000¿ø");
		menu14.add("°è¶õÅÁ 15,000¿ø");
		menu14.add("ÀâÃ¤ 15,000¿ø");
		menu14.add("µ­»Ñ¶ó 15,000¿ø");
		menu14.add("¸¶ÆÄµÎºÎ 15,000¿ø");
		menu14.add("¾çÀåÇÇ ¼Ò:20,000¿ø/Áß:25,000¿ø/´ë:30,000¿ø");
		menu14.add("ÆÈº¸Ã¤ ¼Ò:20,000¿ø/Áß:25,000¿ø/´ë:30,000¿ø");
		menu14.add("±ñÇ³±â ¼Ò:20,000¿ø/Áß:25,000¿ø/´ë:30,000¿ø");
		menu14.add("±ñÇ³À° ¼Ò:20,000¿ø/Áß:25,000¿ø/´ë:30,000¿ø");
		menu14.add("¶óÁ¶±â ¼Ò:20,000¿ø/Áß:25,000¿ø/´ë:30,000¿ø");
		menu14.add("¶óÁ¶À° ¼Ò:20,000¿ø/Áß:25,000¿ø/´ë:30,000¿ø");
		menu14.add("³­ÀÚ¿Ï½º ¼Ò:20,000¿ø/Áß:25,000¿ø/´ë:30,000¿ø");
		menu14.add("ÀâÅÁ ¼Ò:20,000¿ø/Áß:25,000¿ø/´ë:30,000¿ø");
		menu14.add("°íÃßÀâÃ¤ ¼Ò:20,000¿ø/Áß:25,000¿ø/´ë:30,000¿ø");
		menu14.add("À¯»ê½½ ¼Ò:20,000¿ø/Áß:25,000¿ø/´ë:30,000¿ø");
		menu14.add("±ñÇ³»õ¿ì ¼Ò:20,000¿ø/Áß:25,000¿ø/´ë:30,000¿ø");
		menu14.add("±ñ¼î»õ¿ì Áß:25,000¿ø/´ë:30,000¿ø");
		menu14.add("ÇØ»ïÅÁ 40,000¿ø");
								
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
		
	}

	

}
