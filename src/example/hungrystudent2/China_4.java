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

public class China_4 extends Activity {
	ExpandableListAdapter listAdapter;
	ExpandableListView expListView;
	List<String> listDataHeader;
	HashMap<String, List<String>> listDataChild;

	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.china_4);

		ImageButton a = (ImageButton) findViewById(R.id.call_chinese4);

		a.setOnClickListener(new ImageButton.OnClickListener() {
			@Override
			public void onClick(View v) {
				startActivity(new Intent("android.intent.action.CALL", Uri
						.parse("tel:042-822-9588")));
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
		listDataHeader.add("¶òÈ£¿Í¶Ò¹è±â¸Ş´º");
		listDataHeader.add("ººÀ½·ù");
		listDataHeader.add("119¸Ş´º");
		listDataHeader.add("¸Ş´º¼Ò°³");
		listDataHeader.add("½Å¸Ş´º");
		listDataHeader.add("½¡ºÒ°í±â+³Ã¸é¼¼Æ®");
		listDataHeader.add("¿äÀÏ¸Ş´º");
		listDataHeader.add("½Ì±Û¼¼Æ®");
		listDataHeader.add("Àï¹İÄÚ½º");
		listDataHeader.add("»ıµî½ÉÅÁ¼öÀ°¼¼Æ®");
		listDataHeader.add("»çÃµÅÁ¼öÀ°¼¼Æ®");
		listDataHeader.add("¸é·ù");
		listDataHeader.add("¹ä·ù");
		listDataHeader.add("¿ä¸®·ù");
		listDataHeader.add("ÇÑ ±×¸©¿¡ µÎ°¡Áö ¸À");
		
		// Adding child data
		List<String> menu1 = new ArrayList<String>();
		menu1.add("»ï¼±¶Ò¹è±â¼öÁ¦ºñ 8,000¿ø");
		menu1.add("¶Ò¹è±âÂ¥Àå 6,000¿ø");
		menu1.add("¶Ò¹è±âÂ«»Í 6,500¿ø");
		menu1.add("¶Ò¹è±â°íÃßÂ«»Í 8,000¿ø");
		menu1.add("¶Ò¹è±âÇØ¹°µ¤¹ä 8,000¿ø");
		menu1.add("¶Ò¹è±âÇØ¹°±¹¹ä 8,000¿ø");
		menu1.add("¶Ò¹è±âÀ°°³Àå 7,000¿ø");
		menu1.add("¶Ò¹è±â¼³··ÅÁ 7,000¿ø");
		menu1.add("¶Ò¹è±â°¥ºñÅÁ 7,000¿ø");
		menu1.add("¶Ò¹è±â³»ÀåÅÁ 7,000¿ø");
		menu1.add("¶Ò¹è±â±¼Â«»Í(°ø±â¹äÆ÷ÇÔ) 8,000¿ø");
				
		List<String> menu2 = new ArrayList<String>();
		menu2.add("1.Á¦À°ººÀ½+°ø±â¹ä2+±¹¹° 14,000¿ø");
		menu2.add("2.¿ÀÂ¡¾îººÀ½+°ø±â¹ä2+±¹¹° 14,000¿ø");
		menu2.add("3.È«ÇÕÇØ¹°ººÀ½+°ø±â¹ä2+±¹¹° 14,000¿ø");
				
		List<String> menu3 = new ArrayList<String>();
		menu3.add("119Â«»Í 8,000¿ø");
		menu3.add("119Â¥Àå 7,500¿ø");
						
		List<String> menu4 = new ArrayList<String>();
		menu4.add("Àï¹İÂ¥Àå(°ø±â¹ä+±¹¹°) 1ÀÎ:7,000¿ø/2ÀÎ:14,000¿ø");
		menu4.add("¾ß³¢Â«»Í(°ø±â¹ä+±¹¹°) 1ÀÎ:7,000¿ø/2ÀÎ:14,000¿ø");
		menu4.add("°íÃßÂ«»Í 8,000¿ø");
		menu4.add("»ï¼±Â«»Í 8,000¿ø");
		menu4.add("È«ÇÕÂ«»Í 8,000¿ø");
		menu4.add("È«±¼ÀÌÂ«»Í 8,000¿ø");
		menu4.add("±¼Â«»Í 8,000¿ø");
				
		List<String> menu5 = new ArrayList<String>();
		menu5.add("½¡ºÒººÀ½¹ä 8,000¿ø");
		menu5.add("½¡ºÒÀâÃ¤¹ä 8,000¿ø");
		menu5.add("½¡ºÒµ¤¹ä 8,000¿ø");
				
		List<String> menu6 = new ArrayList<String>();
		menu6.add("¹°³Ã¸í+½¡ºÒ°í±â 8,000¿ø");
		menu6.add("ºñºö³Ã¸í+½¡ºÒ°í±â 8,000¿ø");
		menu6.add("³ÃÂ«»Í+½¡ºÒ°í±â 8,000¿ø");
		menu6.add("³Ã¿ìµ¿+½¡ºÒ°í±â 8,000¿ø");
		menu6.add("¹Ğ¸í+½¡ºÒ°í±â 8,000¿ø");
				
		List<String> menu7 = new ArrayList<String>();
		menu7.add("(¿ù)¶Ò¹è±âÀ°°³Àå 6,000¿ø");
		menu7.add("(È­)¾ß³¢Â«»Í 6,000¿ø");
		menu7.add("(¼ö)Á¦À°µ¤¹ä 6,000¿ø");
		menu7.add("(¸ñ)¶Ò¹è±âÇØ¹°±¹¹ä 6,000¿ø");
		menu7.add("(¿ù)ÀâÃ¤¹ä 6,000¿ø");
				
		List<String> menu8 = new ArrayList<String>();
		menu8.add("1.µî½ÉÅÁ¼öÀ°+Â¥Àå¸é 10,000¿ø");
		menu8.add("2.µî½ÉÅÁ¼öÀ°+Â«»Í 11,000¿ø");
		menu8.add("3.µî½ÉÅÁ¼öÀ°+ººÀ½¹äorÂ«»Í¹ä 12,000¿ø");
		menu8.add("4.µî½ÉÅÁ¼öÀ°+Àï¹İÂ¥Àåor¾ß³¢Â«»Í 13,000¿ø");
						
		List<String> menu9 = new ArrayList<String>();
		menu9.add("A.µî½ÉÅÁ¼öÀ°2ÀÎ+Àï¹İÂ¥Àå2ÀÎor¾ß³¢Â«»Í2ÀÎ 20,000¿ø");
		menu9.add("B.»çÃµÅÁ¼öÀ°2ÀÎ+Àï¹İÂ¥Àå2ÀÎor¾ß³¢Â«»Í2ÀÎ 21,000¿ø");
						
		List<String> menu10 = new ArrayList<String>();
		menu10.add("1.µî½ÉÅÁ¼öÀ°+Â¥Àå+¸¸µÎ 15,000¿ø");
		menu10.add("2.µî½ÉÅÁ¼öÀ°+Â¥Àå1+Â«»Í1+¸¸µÎ 16,000¿ø");
		menu10.add("3.µî½ÉÅÁ¼öÀ°+Â«»Í2+¸¸µÎ 17,000¿ø");
		menu10.add("4.µî½ÉÅÁ¼öÀ°+Â¥Àå3 20,000¿ø");
		menu10.add("5.µî½ÉÅÁ¼öÀ°+Â¥Àå2+Â«»Í1 21,000¿ø");
		menu10.add("6.µî½ÉÅÁ¼öÀ°+Â¥Àå1+Â«»Í2 22,000¿ø");
		menu10.add("7.µî½ÉÅÁ¼öÀ°+Â«»Í3 23,000¿ø");
				
		List<String> menu11 = new ArrayList<String>();
		menu11.add("1.»çÃµÅÁ¼öÀ°+Â¥Àå2 17,000¿ø");
		menu11.add("2.»çÃµÅÁ¼öÀ°+Â¥Àå1+Â«»Í1 18,000¿ø");
		menu11.add("3.»çÃµÅÁ¼öÀ°+Â«»Í2 19,000¿ø");
		menu11.add("4.»çÃµÅÁ¼öÀ°+Â¥Àå3 22,000¿ø");
		menu11.add("5.»çÃµÅÁ¼öÀ°+Â¥Àå2+Â«»Í1 23,000¿ø");
		menu11.add("6.»çÃµÅÁ¼öÀ°+Â¥Àå1+Â«»Í2 24,000¿ø");
		menu11.add("7.»çÃµÅÁ¼öÀ°+Â«»Í3 25,000¿ø");
				
		List<String> menu12 = new ArrayList<String>();
		menu12.add("Â¥Àå¸é 4,500¿ø");
		menu12.add("Â«»Í 5,000¿ø");
		menu12.add("°£Â¥Àå 5,000¿ø");
		menu12.add("¿ìµ¿ 5,500¿ø");
		menu12.add("¿ï¸é 5,500¿ø");
		menu12.add("»ï¼±°£Â¥Àå 7,500¿ø");
		menu12.add("»ï¼±Â«»Í 8,000¿ø");
		menu12.add("»ï¼±¿ìµ¿ 8,000¿ø");
		menu12.add("»ï¼±¿ï¸é 8,000¿ø");
		menu12.add("±â½º¸é 8,000¿ø");
				
		List<String> menu13 = new ArrayList<String>();
		menu13.add("ººÀ½¹ä 5,500¿ø");
		menu13.add("¿À¹Ç¶óÀÌ½º 6,000¿ø");
		menu13.add("¾ß³¢Â«»Í¹ä 7,500¿ø");
		menu13.add("Á¦À°µ¤¹ä 7,000¿ø");
		menu13.add("¿ÀÂ¡¾îµ¤¹ä 7,000¿ø");
		menu13.add("±èÄ¡ººÀ½¹ä 7,000¿ø");
		menu13.add("ÀâÃ¤¹ä 7,000¿ø");
		menu13.add("µÅÁö±¹¹ä 7,000¿ø");
		menu13.add("»ï¼±ººÀ½¹ä 8,000¿ø");
		menu13.add("»õ¿ìººÀ½¹ä 8,000¿ø");
		menu13.add("¼ÛÀÌµ¤¹ä 8,000¿ø");
		menu13.add("°íÃßÀâÃ¤¹ä 10,000¿ø");
		menu13.add("ÀâÅÁ¹ä 10,000¿ø");
		menu13.add("À¯»ê½½¹ä 10,000¿ø");
		
		List<String> menu14 = new ArrayList<String>();
		menu14.add("ÅÁ¼öÀ° ¼Ò:15,000¿ø/Áß:18,000¿ø/´ë:23,000¿ø");
		menu14.add("»çÃµÅÁ¼öÀ° ¼Ò:17,000¿ø/Áß:20,000¿ø/´ë:25,000¿ø");
		menu14.add("ÀâÃ¤ 15,000¿ø");
		menu14.add("¸¶ÆÄµÎºÎ 15,000¿ø");
		menu14.add("¶óÁ¶±â 25,000¿ø");
		menu14.add("¶óÁ¶À° 25,000¿ø");
		menu14.add("±ñÇ³±â 25,000¿ø");
		menu14.add("±ñÇ³À° 25,000¿ø");
		menu14.add("ÆÈº¸Ã¤ 25,000¿ø");
		menu14.add("À¯»ê½½ 25,000¿ø");
		menu14.add("¾çÀåÇÇ 25,000¿ø");
		menu14.add("°íÃßÀâÃ¤ 25,000¿ø");
		menu14.add("³­ÀÚ¿Ï½º 25,000¿ø");
		menu14.add("±ñÇ³»õ¿ì 25,000¿ø");
		menu14.add("±ñ¼î»õ¿ì 25,000¿ø");
		
		List<String> menu15 = new ArrayList<String>();
		menu15.add("Â«Â¥¸é 6,000¿ø");
		menu15.add("ººÂ¥¸é 6,500¿ø");
		menu15.add("ººÂ«¸é 6,500¿ø");
		menu15.add("ÅÁÂ¥¸é 7,000¿ø");
		menu15.add("ÅÁÂ«¸é 7,000¿ø");
		menu15.add("ÅÁºº¹ä 7,500¿ø");
		
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
	}

	

}
