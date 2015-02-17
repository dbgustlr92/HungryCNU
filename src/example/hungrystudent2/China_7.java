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

public class China_7 extends Activity {
	ExpandableListAdapter listAdapter;
	ExpandableListView expListView;
	List<String> listDataHeader;
	HashMap<String, List<String>> listDataChild;

	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.china_7);

		ImageButton a = (ImageButton) findViewById(R.id.call_chinese7);

		a.setOnClickListener(new ImageButton.OnClickListener() {
			@Override
			public void onClick(View v) {
				startActivity(new Intent("android.intent.action.CALL", Uri
						.parse("tel:042-384-3838")));
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
		listDataHeader.add("¸Æ¹İ¼® ¼¼Æ®¸Ş´º");
		listDataHeader.add("ÀÏ¹İ¼ÂÆ®¸Ş´º");
		listDataHeader.add("¶Ò¹è±â¸Ş´º");
		listDataHeader.add("¸é·ù");
		listDataHeader.add("¹ä·ù");
		listDataHeader.add("¿ä¸®·ù");
		listDataHeader.add("³Ã¸é¸Ş´º");
						
		// Adding child data
		List<String> menu1 = new ArrayList<String>();
		menu1.add("È²±ÃÀï¹İÂ¥Àå 6,500¿ø");
		menu1.add("È²±ÃÇØ¹°Â«»Í 7,500¿ø");
		menu1.add("È²±ÃÈ­ÀÌÆ®Â«»Í 7,500¿ø");
		menu1.add("È²±Ã°£Â¥Àå 7,500¿ø");
		menu1.add("È²±ÃººÀ½¿ìµ¿ 8,000¿ø");
		menu1.add("È²±Ã±¼Â«»Í 8,000¿ø");
		menu1.add("È²±ÃººÀ½¹ä 7,500¿ø");
		menu1.add("È²±ÃÀâÃ¤¹ä 7,500¿ø");
		menu1.add("È²±Ã¸¶ÆÄ¹ä 8,000¿ø");
		menu1.add("È²±Ã»õ¿ìµ¤¹ä 9,000¿ø");
		menu1.add("È²±ÃÂ¥Àå¹ä 7,000¿ø");
		menu1.add("È²±ÃÀï¹İ¿À¹Ç¶óÀÌ½º 7,500¿ø");
		menu1.add("È²±Ã±¹¹ä 6,500¿ø");
		menu1.add("È²±Ã¿ÀÂ¡¾îµ¤¹ä 7,000¿ø");
		menu1.add("È²±ÃÁ¦À°µ¤¹ä 7,000¿ø");
		menu1.add("È²±Ã¾ç¼ÛÀÌµ¤¹ä 7,000¿ø");
		menu1.add("È²±Ã¼è°í±âµ¤¹ä 7,500¿ø");
		menu1.add("È²±ÃÇØ¹°µ¤¹ä 10,000¿ø");
		menu1.add("È²±ÃÀ¯»ê½½¹ä 12,000¿ø");
		menu1.add("È²±ÃÀâÅÁ¹ä 13,000¿ø");
		menu1.add("È²±Ã°íÃßÀâÃ¤¹ä 12,000¿ø");
		menu1.add("È²±Ã¾çÀåÇÇ 30,000¿ø");
		menu1.add("È²±ÃÆÈº¸Ã¤ 30,000¿ø");
		menu1.add("È²±Ã´©·îÁöÅÁ¼öÀ° 25,000¿ø");
		menu1.add("È²±Ãµî½ÉÅÁ¼öÀ° ¼Ò:16,000¿ø/Áß:21,000¿ø/´ë:26,000¿ø");
		menu1.add("È²±ÃÇØ¹°³ÃÂ«»Í 7,500¿ø");
		menu1.add("È²±ÃÇØ¹°³Ã¿ìµ¿ 7,500¿ø");
				
		List<String> menu2 = new ArrayList<String>();
		menu2.add("½Ì±ÛA.È²±Ãµî½ÉÅÁ¼öÀ°+È²±ÃÀï¹İÂ¥Àå1ÀÎ 14,000¿ø");
		menu2.add("½Ì±ÛB.È²±Ãµî½ÉÅÁ¼öÀ°+È²±ÃÇØ¹°Â«»Í1ÀÎ 15,000¿ø");
		menu2.add("1.È²±Ãµî½ÉÅÁ¼öÀ°+È²±ÃÀï¹İÂ¥Àå2ÀÎ 21,000¿ø");
		menu2.add("2.È²±Ãµî½ÉÅÁ¼öÀ°+È²±ÃÇØ¹°Â«»Í2ÀÎ 22,000¿ø");
		menu2.add("3.È²±Ãµî½ÉÅÁ¼öÀ°+È²±ÃÀï¹İººÀ½¹ä2ÀÎ 22,000¿ø");
		menu2.add("4.È²±Ãµî½ÉÅÁ¼öÀ°+È²±ÃÀï¹İººÀ½¿ìµ¿2ÀÎ 23,000¿ø");
				
		List<String> menu3 = new ArrayList<String>();
		menu3.add("¸Æ¹İ¼®Á¦À°ººÀ½+°ø±â¹ä2+±¹¹° 14,000¿ø");
		menu3.add("¸Æ¹İ¼®¸Å¿îÀâÃ¤ººÀ½+°ø±â¹ä2+±¹¹° 14,000¿ø");
		menu3.add("¸Æ¹İ¼®¿ÀÂ¡¾îµÎ·çÄ¡±â+°ø±â¹ä2+±¹¹° 14,000¿ø");
		menu3.add("¸Æ¹İ¼®ÇØ¹°ººÀ½+°ø±â¹ä2+±¹¹° 14,000¿ø");
						
		List<String> menu4 = new ArrayList<String>();
		menu4.add("½Ì±ÛA.µî½ÉÅÁ¼öÀ°+Â¥Àå1(Â«»Í1)¼±ÅÃ+±º¸¸µÎ 10,000¿ø");
		menu4.add("½Ì±ÛB.µî½ÉÅÁ¼öÀ°+ººÀ½¹ä1(Â«»Í¹ä1)¼±ÅÃ+±º¸¸µÎ 11,000¿ø");
		menu4.add("1.µî½ÉÅÁ¼öÀ°+Â¥Àå2(Â«»Í2)¼±ÅÃ+±º¸¸µÎ 15,000¿ø");
		menu4.add("2.µî½ÉÅÁ¼öÀ°+ººÀ½¹ä2(Â«»Í¹ä2)¼±ÅÃ+±º¸¸µÎ 17,000¿ø");
								
		List<String> menu5 = new ArrayList<String>();
		menu5.add("¶Ò¹è±âÀ°°³Àå 6,000¿ø");
		menu5.add("¶Ò¹è±â°¥ºñÅÁ 6,000¿ø");
		menu5.add("¶Ò¹è±â°õÅÁ 6,000¿ø");
		menu5.add("¶Ò¹è±â¶±±¹ 6,000¿ø");
		menu5.add("¶Ò¹è±â¸¸µÎ±¹ 6,000¿ø");
		menu5.add("¶Ò¹è±â¿Õ¸¸µÎ±¹ 6,000¿ø");
						
		List<String> menu6 = new ArrayList<String>();
		menu6.add("Â¥Àå¸é 4,500¿ø");
		menu6.add("Â«»Í 5,000¿ø");
		menu6.add("°£Â¥Àå 5,000¿ø");
		menu6.add("¿ìµ¿ 5,500¿ø");
		menu6.add("¿ï¸é 6,000¿ø");
		menu6.add("¾ß³¢Â«»Í 1ÀÎ:7,000¿ø");
		menu6.add("À¯´ÏÂ¥Àå 7,000¿ø");
		menu6.add("»ï¼±°£Â¥Àå 7,000¿ø");
		menu6.add("»ï¼±Â«»Í 7,000¿ø");
		menu6.add("»ï¼±¿ìµ¿ 7,000¿ø");
		menu6.add("»ï¼±¿ï¸é 7,500¿ø");
		menu6.add("»çÃµÂ¥Àå 7,500¿ø");
		menu6.add("»çÃµÅÁ¸é 7,500¿ø");
		menu6.add("°íÃßÂ«»Í 7,500¿ø");
		menu6.add("±â½º¸é 8,000¿ø");
		menu6.add("±º¸¸µÎ 4,000¿ø");
		menu6.add("¹°¸¸µÎ 4,000¿ø");
						
		List<String> menu7 = new ArrayList<String>();
		menu7.add("ººÀ½¹ä 5,500¿ø");
		menu7.add("Â¥Àå¹ä 5,500¿ø");
		menu7.add("Â«»Í¹ä 5,500¿ø");
		menu7.add("±èÄ¡µ¤¹ä 6,500¿ø");
		menu7.add("ÀâÃ¤¹ä 7,000¿ø");
		menu7.add("¿À¹Ç¶óÀÌ½º 7,000¿ø");
		menu7.add("»ï¼±ººÀ½¹ä 7,000¿ø");
		menu7.add("»õ¿ìººÀ½¹ä 7,000¿ø");
		menu7.add("¸¶ÆÄµÎºÎ¹ä 7,500¿ø");
		menu7.add("»ï¼±Â«»Í¹ä 7,500¿ø");
		menu7.add("°íÃßÂ«ºÀ¹ä 8,000¿ø");
		menu7.add("»õ¿ìµ¤¹ä 8,000¿ø");
		menu7.add("°íÃßÀâÃ¤¹ä 11,000¿ø");
		menu7.add("À¯»ê½½¹ä 11,000¿ø");
		menu7.add("ÀâÅÁ¹ä 12,000¿ø");
						
		List<String> menu8 = new ArrayList<String>();
		menu8.add("µî½ÉÅÁ¼öÀ° ¼Ò:15,000¿ø/Áß:18,000¿ø/´ë:22,000¿ø");
		menu8.add("»çÃµÅÁ¼öÀ° 22,000¿ø");
		menu8.add("°íÃßÀâÃ¤ 25,000¿ø");
		menu8.add("¾çÀåÇÇ 25,000¿ø");
		menu8.add("³­ÀÚ¿Ï½º 25,000¿ø");
		menu8.add("¶óÁ¶À° 25,000¿ø");
		menu8.add("¶óÁ¶±â 25,000¿ø");
		menu8.add("±ñÇ³À° 25,000¿ø");
		menu8.add("±ñÇ³±â 25,000¿ø");
		menu8.add("±ñ¼î»õ¿ì 25,000¿ø");
		menu8.add("ÆÈº¸Ã¤ 30,000¿ø");
		menu8.add("À¯»ê½½ 30,000¿ø");
		menu8.add("ÀâÅÁ 30,000¿ø");
		menu8.add("»ïÇ³³ÃÃ¤ 50,000¿ø");
		menu8.add("ÇØ»ïÅÁ 50,000¿ø");
		menu8.add("ÇØ»ïÁê½º 50,000¿ø");
		menu8.add("ÇØ»ï°¥ºñ 50,000¿ø");
		menu8.add("¼¡½ºÇÉ 60,000¿ø");
		menu8.add("Àü°¡º¹ 60,000¿ø");
								
		List<String> menu9 = new ArrayList<String>();
		menu9.add("¹İ¹İ³Ã¸é 7,000¿ø");
		menu9.add("¹°¸é 6,000¿ø");
		menu9.add("ºñºö³Ã¸é 6,500¿ø");
		menu9.add("³ÃÄá±¹¼ö 6,000¿ø");
		menu9.add("ÇØ¹°¹°³Ã¸é 7,000¿ø");
		menu9.add("ÇØ¹°ºñºö³Ã¸é 7,500¿ø");
		menu9.add("Âğ¸¸µÎ 10°³:5,5000¿ø");
		menu9.add("1.¹°³Ã¸é2+Âğ¸¸µÎ 14,000¿ø");
		menu9.add("2.ºñºö³Ã¸é2+Âğ¸¸µÎ 15,000¿ø");
								
		listDataChild.put(listDataHeader.get(0), menu1); // Header, Child data
		listDataChild.put(listDataHeader.get(1), menu2);
		listDataChild.put(listDataHeader.get(2), menu3);
		listDataChild.put(listDataHeader.get(3), menu4);
		listDataChild.put(listDataHeader.get(4), menu5);
		listDataChild.put(listDataHeader.get(5), menu6);
		listDataChild.put(listDataHeader.get(6), menu7);
		listDataChild.put(listDataHeader.get(7), menu8);
		listDataChild.put(listDataHeader.get(8), menu9);
		
	}

	

}
