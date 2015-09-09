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

public class China_6 extends Activity {
	ExpandableListAdapter listAdapter;
	ExpandableListView expListView;
	List<String> listDataHeader;
	HashMap<String, List<String>> listDataChild;

	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.china_6);

		ImageButton a = (ImageButton) findViewById(R.id.call_chinese6);

		a.setOnClickListener(new ImageButton.OnClickListener() {
			@Override
			public void onClick(View v) {
				startActivity(new Intent("android.intent.action.CALL", Uri
						.parse("tel:042-825-8715")));
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
		listDataHeader.add("¸Ş´º¼Ò°³");
		listDataHeader.add("»óÇÏÀÌ ÅÁ¼öÀ°¼¼Æ®");
		listDataHeader.add("¶Ò¹è±â¸Ş´º");
		listDataHeader.add("¸Ş´º¼Ò°³");
		listDataHeader.add("¹İ¹İ¸Ş´º");
		listDataHeader.add("¿ä¸®³»¸¾´ë·Î ÇÒÀÎ¼¼Æ®");
		listDataHeader.add("Â÷¿øÀÌ ´Ù¸¥ °¡Á·»ó ÄÚ½º");
		listDataHeader.add("¼ÓÇ®ÀÌ¸Ş´º");
		listDataHeader.add("»óÇÏÀÌº°¹Ì");
		listDataHeader.add("¸é·ù");
		listDataHeader.add("¹ä·ù");
		listDataHeader.add("¿ä¸®·ù");
						
		// Adding child data
		List<String> menu1 = new ArrayList<String>();
		menu1.add("µ·Â«»Í(¿¾³¯Â«»Í) 7,000¿ø");
		menu1.add("È«ÇÕÂ«»Í 6,500¿ø");
				
		List<String> menu2 = new ArrayList<String>();
		menu2.add("¼Ö·Î.ÅÁ¼öÀ°+(Â«»Í1orÂ¥Àå1) 10,000¿ø");
		menu2.add("A.ÅÁ¼öÀ°+Â¥Àå2+¸¸µÎ 14,000¿ø");
		menu2.add("A-1.ÅÁ¼öÀ°+Â«»Í2+¸¸µÎ 15,000¿ø");
		menu2.add("B.ÅÁ¼öÀ°+(Â«»Í3orÂ¥Àå3) 19,000¿ø");
		menu2.add("C.(»çÃµÅÁ¼öÀ°or¸Å¿îÅÁ¼öÀ°)+(Â«»Í2orÂ¥Àå2)+¸¸µÎ 17,000¿ø");
		menu2.add("D.(»çÃµÅÁ¼öÀ°or¸Å¿îÅÁ¼öÀ°)+(Â«»Í3orÂ¥Àå3)+¸¸µÎ 21,000¿ø");
		menu2.add("E.ÅÁ¼öÀ°+(»ï¼±ÇØ¹°Àï¹İÂ«»Í2ÀÎor»ï¼±ÇØ¹°Àï¹İÂ¥Àå2ÀÎ)+¸¸µÎ 20,000¿ø");
		menu2.add("F.ÅÁ¼öÀ°+(ººÀ½¹ä2orÂ«»Í¹ä2orÂ¥Àå¹ä2)+¸¸µÎ 18,000¿ø");
		menu2.add("E.ÅÁ¼öÀ°(Áß)+(Â«»Í5orÂ¥Àå5)+¸¸µÎ 30,000¿ø");
				
		List<String> menu3 = new ArrayList<String>();
		menu3.add("¶Ò¹è±âµ·Â«»Í 6,500¿ø");
		menu3.add("¶Ò¹è±â¼öÁ¦ºñÂ«»Í 7,000¿ø");
		menu3.add("¶Ò¹è±âºÒ°í±â 6,500¿ø");
		menu3.add("¶Ò¹è±â±èÄ¡Á¦À°ººÀ½ 7,000¿ø");
		menu3.add("¶Ò¹è±âÂ¥Àå 5,500¿ø");
		menu3.add("¶Ò¹è±âÂ«»Í 6,000¿ø");
		menu3.add("¶Ò¹è±â±¼Â«»Í 7,000¿ø");
		menu3.add("¶Ò¹è±â°íÃßÂ«»Í 7,000¿ø");
		menu3.add("¶Ò¹è±âÀ°°³Àå 6,000¿ø");
		menu3.add("¶Ò¹è±âµû·Î±¹¹ä 6,000¿ø");
		menu3.add("¶Ò¹è±â°¥ºñÅÁ 6,000¿ø");
		menu3.add("¶Ò¹è±â°õÅÁ 6,000¿ø");
		menu3.add("¶Ò¹è±â³»ÀåÅÁ 6,000¿ø");
		menu3.add("¶Ò¹è±âÇØ¹°µ¤¹ä 7,000¿ø");
		menu3.add("¶Ò¹è±â¿ÀÂ¡¾îµ¤¹ä 6,500¿ø");
						
		List<String> menu4 = new ArrayList<String>();
		menu4.add("¼Ö·Î¹ä¼¼Æ®(ÅÁ¼öÀ°+ººÀ½¹ä1orÂ¥Àå¹ä1orÂ«»Í¹ä1orÀ°°³Àå1or±¹¹ä1) 11,500¿ø");
		menu4.add("»ï¼±ÇØ¹°Àï¹İÂ¥Àå 1ÀÎ:6,500¿ø");
		menu4.add("»ï¼±ÇØ¹°Àï¹İÂ«ºÀ 1ÀÎ:6,500¿ø");
								
		List<String> menu5 = new ArrayList<String>();
		menu5.add("Â«Â¥¸é 5,5000¿ø");
		menu5.add("ººÂ¥¸é 6,000¿ø");
		menu5.add("ººÂ«¸é 6,000¿ø");
		menu5.add("ÅÁÂ¥¸é 6,500¿ø");
		menu5.add("ÅÁÂ«¸é 6,500¿ø");
		menu5.add("ÅÁºº¹ä 7,000¿ø");
						
		List<String> menu6 = new ArrayList<String>();
		menu6.add("¿ä¸®(¾çÀåÇÇ/ÆÈº¸Ã¤/±ñÇ³±â/À¯»ê½½/°íÃßÀâÃ¤/±ñ¼î»õ¿ì/±ñÇ³»õ¿ì ÅÃ1)+(Â¥Àå2orÂ«»Í2orººÀ½¹ä2orÂ¥Àå¹ä2orÂ«»Í¹ä2) 25,000¿ø(¹ä·ù ¼±ÅÃ½Ã 3,000¿øÃß°¡)");
						
		List<String> menu7 = new ArrayList<String>();
		menu7.add("°¡Á·»óA.¾çÀåÇÇ+À¯»ê½½+ÅÁ¼öÀ°+½Ä»ç3ÀÎ(Â¥Àå,Â«»Í ¼±ÅÃ) 50,000¿ø");
		menu7.add("³ªÁ·»óA.ÀâÅÁ+±ñ¼î»õ¿ì+°íÃßÀâÃ¤+½Ä»ç4ÀÎ(Â¥Àå,Â«»Í ¼±ÅÃ) 80,000¿ø");
		menu7.add("´ÙÁ·»óA.2°¡Áö³ÃÃ¤+À¯»ê½½+ÅÁ¼öÀ°+½Ä»ç5ÀÎ(Â¥Àå,Â«»Í ¼±ÅÃ) 80,000¿ø");
		menu7.add("¶óÁ·»óA.3°¡Áö³ÃÃ¤+±ñ¼î»õ¿ì+±ñÇ³±â+°íÃßÀâÃ¤+½Ä»ç6ÀÎ(Â¥Àå,Â«»Í ¼±ÅÃ) 110,000¿ø");
						
		List<String> menu8 = new ArrayList<String>();
		menu8.add("ÇØÀåÂ«»Í 7,000¿ø");
		menu8.add("´«¹°Â«»Í 7,000¿ø");
		menu8.add("´«¹°Â¥Àå 7,000¿ø");
								
		List<String> menu9 = new ArrayList<String>();
		menu9.add("È«±¼ÀÌÂ«»Í 7,000¿ø");
		menu9.add("È«ÇÕÂ«»Í 6,500¿ø");
		menu9.add("¸Å¿îÇØ¹°ººÀ½¹ä 7,000¿ø");
								
		List<String> menu10 = new ArrayList<String>();
		menu10.add("Â¥Àå¸é 4,500¿ø");
		menu10.add("Â«»Í 5,000¿ø");
		menu10.add("¿ìµ¿ 5,500¿ø");
		menu10.add("°£Â¥Àå 5,500¿ø");
		menu10.add("¿ï¸é 5,500¿ø");
		menu10.add("»ï¼±Â¥Àå 6,500¿ø");
		menu10.add("»ï¼±Â«»Í 7,000¿ø");
		menu10.add("»ï¼±¿ìµ¿ 7,000¿ø");
		menu10.add("»ï¼±¿ï¸é 7,000¿ø");
		menu10.add("À¯´ÏÂ¥Àå 7,000¿ø");
		menu10.add("»çÃµÂ¥Àå 7,000¿ø");
		menu10.add("»ï¼±´©·îÁöÅÁ¸é 8,000¿ø");
		menu10.add("»ï¼±Àï¹İÂ¥Àå 2ÀÎ:12,000¿ø");
		menu10.add("»ï¼±Àï¹İÂ«»Í 2ÀÎ:12,000¿ø");
		menu10.add("±º¸¸µÎ 4,000¿ø");
		menu10.add("¹°¸¸µÎ 4,000¿ø");
						
		List<String> menu11 = new ArrayList<String>();
		menu11.add("ººÀ½¹ä 5,500¿ø");
		menu11.add("Â¥Àå¹ä 6,000¿ø");
		menu11.add("Â«»Í¹ä 6,000¿ø");
		menu11.add("ÀâÃ¤¹ä 6,000¿ø");
		menu11.add("¾ç¼ÛÀÌµ¤¹ä 7,000¿ø");
		menu11.add("»ï¼±ººÀ½¹ä 7,000¿ø");
		menu11.add("»õ¿ìººÀ½¹ä 7,000¿ø");
		menu11.add("»óÇÏÀÌÆ¯¹ä 7,000¿ø");
		menu11.add("À¯»ê½½¹ä 9,000¿ø");
		menu11.add("°íÃßÀâÃ¤¹ä 9,000¿ø");
		menu11.add("ÀâÅÁ¹ä 9,000¿ø");
		menu11.add("¿Õ¸¸µÎ 5°³:5,000¿ø");
		menu11.add("¶Ò¹è±â¸¸µÎ±¹(°ø±âÆ÷ÇÔ) 6,000¿ø");
						
		List<String> menu12 = new ArrayList<String>();
		menu12.add("ÅÁ¼öÀ° ¼Ò:14,000¿ø/Áß:17,000¿ø/´ë:20,000¿ø");
		menu12.add("»çÃµÅÁ¼öÀ° ¼Ò:17,000¿ø/Áß:19,000¿ø/´ë:22,000¿ø");
		menu12.add("¸Å¿îÅÁ¼öÀ° ¼Ò:17,000¿ø/Áß:19,000¿ø/´ë:22,000¿ø");
		menu12.add("¾çÀåÇÇ Áß:25,000¿ø/´ë:30,000¿ø");
		menu12.add("³­ÀÚ¿Ï½º Áß:25,000¿ø/´ë:30,000¿ø");
		menu12.add("ÆÈº¸Ã¤ Áß:25,000¿ø/´ë:30,000¿ø");
		menu12.add("À¯»ê½½ Áß:25,000¿ø/´ë:30,000¿ø");
		menu12.add("±ñÇ³±â Áß:25,000¿ø/´ë:30,000¿ø");
		menu12.add("±ñ¼î»õ¿ì Áß:25,000¿ø/´ë:30,000¿ø");
		menu12.add("±ñÇ³»õ¿ì Áß:25,000¿ø/´ë:30,000¿ø");
		menu12.add("¶óÁ¶±â Áß:25,000¿ø/´ë:30,000¿ø");
		menu12.add("¶óÁ¶À° Áß:25,000¿ø/´ë:30,000¿ø");
				
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
	}

	

}
