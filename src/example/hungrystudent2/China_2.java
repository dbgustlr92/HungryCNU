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

public class China_2 extends Activity {
	ExpandableListAdapter listAdapter;
	ExpandableListView expListView;
	List<String> listDataHeader;
	HashMap<String, List<String>> listDataChild;

	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.china_2);

		ImageButton a = (ImageButton) findViewById(R.id.call_chinese2);

		a.setOnClickListener(new ImageButton.OnClickListener() {
			@Override
			public void onClick(View v) {
				startActivity(new Intent("android.intent.action.CALL", Uri
						.parse("tel:042-822-4193")));
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
		listDataHeader.add("½Å¸Ş´º");
		listDataHeader.add("ÃßÃµ¸Ş´º");
		listDataHeader.add("º¹¾îÂù°¡");
		listDataHeader.add("¸Ş´º¼Ò°³1");
		listDataHeader.add("¼¼Æ®¸Ş´º");
		listDataHeader.add("½Ì±Û¸Ş´º");
		listDataHeader.add("¸Ş´º¼Ò°³2");
		listDataHeader.add("¸é·ù");
		listDataHeader.add("¹ä·ù");
		listDataHeader.add("¿ä¸®·ù");
		listDataHeader.add("¹İ¹İ¸Ş´º");
		
		// Adding child data
		List<String> menu1 = new ArrayList<String>();
		menu1.add("ÅÁ¼öÀ°Â«»Í 7,000¿ø");
		menu1.add("»ï¼±Àüº¹Â«»Í 10,000¿ø");
		menu1.add("±èÄ¡ººÀ½¹ä 6,500¿ø");
		menu1.add("½É½ÉÀ°Á¦ºñ 7,000¿ø");
		menu1.add("»ï¼±ÇØ¹°±¹¹ä 8,000¿ø");
		
		List<String> menu2 = new ArrayList<String>();
		menu2.add("À¯¸°±â 25,000¿ø");
		menu2.add("¸ğµë¼Ò¼¼ÁöÂ¥Àå 7,000¿ø");
		menu2.add("¸ğµë¼Ò¼¼ÁöÂ«»Í 8,000¿ø");
		menu2.add("¸ğµë¼Ò¼¼Áö¿À¹Ç¶óÀÌ½º 8,000¿ø");
		menu2.add("¸ğµë¼Ò¼¼ÁöÀâÃ¤¹ä 8,000¿ø");
		menu2.add("¸ğµë¼Ò¼¼ÁöÀï¹İÂ¥Àå 1ÀÎ:8,000¿ø/2ÀÎ:16,000¿ø");
		menu2.add("¸ğµë¼Ò¼¼ÁöÀï¹İÂ«»Í 1ÀÎ:8,000¿ø/2ÀÎ:16,000¿ø");
		menu2.add("½¡ºÒÀâÃ¤¹ä 8,000¿ø");
		menu2.add("½¡ºÒººÀ½¹ä 8,000¿ø");
		menu2.add("½¡ºÒÀï¹İÂ¥Àå 1ÀÎ:8,000¿ø/2ÀÎ:16,000¿ø");
		menu2.add("½¡ºÒÀï¹İÂ«»Í 2ÀÎ:16,000¿ø");
		menu2.add("ÁßÈ­ºñºö¹ä 7,000¿ø");
		menu2.add("¶ó¸éÂ«»Í 8,000¿ø");
		menu2.add("Æ¢±è¿ìµ¿ 8,000¿ø");

		List<String> menu3 = new ArrayList<String>();
		menu3.add("º¹Áö¸® 9,000¿ø");
		menu3.add("º¹¿ìµ¿ 9,000¿ø");
		menu3.add("º¹Â«»Í 9,000¿ø");
		menu3.add("º¹¸Å¿îÅÁ 9,000¿ø");
				
		List<String> menu4 = new ArrayList<String>();
		menu4.add("¶Ò¹è±âÄá³ª¹°Â«»Í 8,000¿ø");
		menu4.add("¶Ò¹è±âÈ«ÇÕÅÁ 8,000¿ø");
		menu4.add("¶Ò¹è±âÇÙÂ«»Í 8,000¿ø");
		menu4.add("¶Ò¹è±â°íÃßÂ«»Í 8,000¿ø");
		menu4.add("¶Ò¹è±â¼öÁ¦ºñÂ«»Í 8,000¿ø");
		menu4.add("¶Ò¹è±âÈ«±¼ÀÌÂ«»Í 8,000¿ø");
		menu4.add("¶Ò¹è±âÈ«ÇÕÂ«»Í 8,000¿ø");
		menu4.add("¶Ò¹è±âÂ¥Àå 6,000¿ø");
		menu4.add("¶Ò¹è±âÇÙÂ¥Àå 7,000¿ø");
		menu4.add("»çÃµÂ¥Àå 7,000¿ø");
		menu4.add("°íÃßÂ¥Àå 7,000¿ø");
		menu4.add("À¯´ÏÂ¥Àå 7,000¿ø");
		menu4.add("¿Õ¸¸µÎ±¹ 6,000¿ø");
		menu4.add("¸¸µÎ±¹ 6,000¿ø");
		menu4.add("¶±±¹ 6,000¿ø");
		menu4.add("¶±¸¸µÎ±¹ 6,000¿ø");
		menu4.add("¿Õ¸¸µÎ 6°³:5,000¿ø");
		menu4.add("¶Ò¹è±âÂ«»Í 6,500¿ø");
		menu4.add("¶Ò¹è±â¸Å¿îÅÁ¸é 8,000¿ø");
		menu4.add("¶Ò¹è±âÇØ¹°ÅÁ 8,000¿ø");
		menu4.add("¶Ò¹è±â±¼Â«»Í 8,000¿ø");
		menu4.add("¶Ò¹è±â±èÄ¡µ¤¹ä 7,500¿ø");
		menu4.add("¶Ò¹è±âÇØ¹°µ¤¹ä 8,000¿ø");
		menu4.add("¶Ò¹è±âÁ¦À°µ¤¹ä 7,000¿ø");
		menu4.add("¶Ò¹è±â¿ÀÂ¡¾îµ¤¹ä 7,000¿ø");
		menu4.add("¶Ò¹è±â¼ÛÀÌµ¤¹ä 7,000¿ø");
		menu4.add("¶Ò¹è±â¼ÒºÒ°í±âµ¤¹ä 7,000¿ø");
		menu4.add("¶Ò¹è±â±¹¹ä 7,000¿ø");
		menu4.add("¶Ò¹è±âÀ°°³Àå 7,000¿ø");
		menu4.add("¶Ò¹è±â°¥ºñÅÁ 7,000¿ø");
		menu4.add("¶Ò¹è±â³»ÀåÅÁ 7,000¿ø");
		menu4.add("¶Ò¹è±â°õÅÁ 7,000¿ø");
		
		List<String> menu5 = new ArrayList<String>();
		menu5.add("¼¼Æ®A(ÅÁ¼öÀ°+Â¥Àå2+¸¸µÎ) 15,000¿ø");
		menu5.add("¼¼Æ®A-1(ÅÁ¼öÀ°+Â¥Àå1+Â«»Í1+¸¸µÎ) 16,000¿ø");
		menu5.add("¼¼Æ®A-2(ÅÁ¼öÀ°+Â«»Í2+¸¸µÎ) 17,000¿ø");
		menu5.add("¼¼Æ®A-3(ÅÁ¼öÀ°+ººÀ½¹ä2orÂ«»Í¹ä2+¸¸µÎ) 19,000¿ø");
		menu5.add("¼¼Æ®B(ÅÁ¼öÀ°+Â¥Àå3+¸¸µÎ) 20,000¿ø");
		menu5.add("¼¼Æ®B-1(ÅÁ¼öÀ°+Â¥Àå2+Â«»Í1+¸¸µÎ) 21,000¿ø");
		menu5.add("¼¼Æ®B-2(ÅÁ¼öÀ°+Â¥Àå1+Â«»Í2+¸¸µÎ) 22,000¿ø");
		menu5.add("¼¼Æ®B-3(ÅÁ¼öÀ°+Â«»Í3+¸¸µÎ) 23,000¿ø");
		menu5.add("¼¼Æ®C(ÅÁ¼öÀ°+Àï¹İÂ¥Àå2ÀÎorÀï¹İÂ«»Í2ÀÎ+¸¸µÎ) 20,000¿ø");
		menu5.add("¼¼Æ®C-1(»çÃµÅÁ¼öÀ°+Àï¹İÂ¥Àå2ÀÎorÀï¹İÂ«»Í2ÀÎ+¸¸µÎ) 22,000¿ø");
		menu5.add("¼¼Æ®D(ÅÁ¼öÀ°ÓŞ+Â¥ÀåorÂ«»Í ¼±ÅÃ4+¸¸µÎ) 35,000¿ø");
		menu5.add("¼¼Æ®D-1(ÅÁ¼öÀ°ÓŞ+ººÀ½¹äorÂ«»Í¹äorÂ¥ÀåorÂ«»Í ¼±ÅÃ5+¸¸µÎ) 40,000¿ø");
		
		List<String> menu6 = new ArrayList<String>();
		menu6.add("°¡.ÅÁ¼öÀ°+Â¥Àå1 10,000¿ø");
		menu6.add("³ª.ÅÁ¼öÀ°+Â«»Í1 11,000¿ø");
		menu6.add("´Ù.ÅÁ¼öÀ°+ººÀ½¹ä1orÂ«»Í¹ä1 12,000¿ø");
		menu6.add("¶ó.ÅÁ¼öÀ°+Àï¹İÂ¥Àå1ÀÎorÀï¹İÂ«»Í1ÀÎ 13,000¿ø");
		menu6.add("¸¶.ÅÁ¼öÀ°+¶Ò¹è±âÂ¥Àå1ÀÎor¶Ò¹è±âÂ«»Í1ÀÎ 13,000¿ø");
		
		List<String> menu7 = new ArrayList<String>();
		menu7.add("1.Á¦À°µÎ·çÄ¡±â+°ø±â¹ä2+±¹¹° 14,000¿ø");
		menu7.add("2.¿ÀÂ¡¾îµÎ·çÄ¡±â+°ø±â¹ä2+±¹¹° 14,000¿ø");
		menu7.add("3.ÀâÃ¤ººÀ½+°ø±â¹ä2+±¹¹° 14,000¿ø");
		menu7.add("4.¸¶ÆÄµÎºÎ+°ø±â¹ä2+±¹¹° 14,000¿ø");
		
		List<String> menu8 = new ArrayList<String>();
		menu8.add("Â¥Àå¸é 4,500¿ø");
		menu8.add("Â«»Í 5,000¿ø");
		menu8.add("°£Â¥Àå 5,000¿ø");
		menu8.add("¿ìµ¿ 5,500¿ø");
		menu8.add("¿ï¸é 5,500¿ø");
		menu8.add("»ï¼±Â¥Àå 7,000¿ø");
		menu8.add("»ï¼±Â«»Í 8,000¿ø");
		menu8.add("»ï¼±¿ìµ¿ 8,000¿ø");
		menu8.add("±â½º¸é 8,000¿ø");
		menu8.add("ÇÙÂ¥Àå 7,000¿ø");
		menu8.add("ÇÙÂ«»Í 8,000¿ø");
		menu8.add("ÇØ¹°Àï¹İÂ¥Àå 1ÀÎ:7,000¿ø/2ÀÎ:14,000¿ø");
		menu8.add("ÇØ¹°Àï¹İÂ«»Í 1ÀÎ:7,000¿ø/2ÀÎ:14,000¿ø");
		
		List<String> menu9 = new ArrayList<String>();
		menu9.add("ººÀ½¹ä 5,500¿ø");
		menu9.add("Â¥Àå¹ä 5,500¿ø");
		menu9.add("Â«»Í¹ä 6,000¿ø");
		menu9.add("°£Â¥Àå¹ä 6,000¿ø");
		menu9.add("¿À¹Ç¶óÀÌ½º 6,000¿ø");
		menu9.add("ÀâÃ¤¹ä 6,500¿ø");
		menu9.add("»ï¼±ººÀ½¹ä 7,000¿ø");
		menu9.add("»õ¿ìººÀ½¹ä 7,000¿ø");
		menu9.add("¸¶ÆÄµÎºÎ¹ä 7,000¿ø");
		menu9.add("¾ß³¢Â«»Í¹ä 7,000¿ø");
		menu9.add("»ï¼±Â«»Í¹ä 8,000¿ø");
		menu9.add("°íÃßÂ«»Í¹ä 8,000¿ø");
		menu9.add("ÇÙÂ«»Í¹ä 8,000¿ø");
		menu9.add("À¯»ê½½¹ä 10,000¿ø");
		menu9.add("°íÃßÀâÃ¤¹ä 10,000¿ø");
		menu9.add("ÀâÅÁ¹ä 10,000¿ø");
		
		List<String> menu10 = new ArrayList<String>();
		menu10.add("ÅÁ¼öÀ° ¼Ò:15,000¿ø/Áß:18,000¿ø/´ë:21,000¿ø");
		menu10.add("»çÃµÅÁ¼öÀ° 18,000¿ø");
		menu10.add("°è¶õÅÁ 10,000¿ø");
		menu10.add("»ï¼±ÅÁ 10,000¿ø");
		menu10.add("ÀâÃ¤ 14,000¿ø");
		menu10.add("¾çÀåÇÇ Áß:25,000¿ø/´ë:30,000¿ø");
		menu10.add("À¯»ê½½ Áß:25,000¿ø/´ë:30,000¿ø");
		menu10.add("ÆÈº¸Ã¤ Áß:25,000¿ø/´ë:30,000¿ø");
		menu10.add("±ñÇ³±â Áß:25,000¿ø/´ë:30,000¿ø");
		menu10.add("±ñÇ³À° Áß:25,000¿ø/´ë:30,000¿ø");
		menu10.add("¶óÁ¶±â Áß:25,000¿ø/´ë:30,000¿ø");
		menu10.add("°íÃßÀâÃ¤ Áß:25,000¿ø/´ë:30,000¿ø");
		menu10.add("±ñÇ³»õ¿ì Áß:25,000¿ø/´ë:30,000¿ø");
		menu10.add("±ñ¼î»õ¿ì Áß:25,000¿ø/´ë:30,000¿ø");
		menu10.add("Ä¥¸®»õ¿ì Áß:25,000¿ø/´ë:30,000¿ø");
		menu10.add("ÇØ»ïÅÁ 40,000¿ø");
		menu10.add("Àü°¡º¹ 40,000¿ø");
		
		List<String> menu11 = new ArrayList<String>();
		menu11.add("Â«Â¥¸é 6,000¿ø");
		menu11.add("ººÂ¥¸é 6,500¿ø");
		menu11.add("ººÂ«¸é 6,500¿ø");
		menu11.add("ÅÁÂ¥¸é 7,000¿ø");
		menu11.add("ÅÁÂ«¸é 7,000¿ø");
		menu11.add("ÅÁºº¹ä 7,000¿ø");
		
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
	}

	

}
