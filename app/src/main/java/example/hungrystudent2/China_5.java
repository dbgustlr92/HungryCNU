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

public class China_5 extends Activity {
	ExpandableListAdapter listAdapter;
	ExpandableListView expListView;
	List<String> listDataHeader;
	HashMap<String, List<String>> listDataChild;

	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.china_5);

		ImageButton a = (ImageButton) findViewById(R.id.call_chinese5);

		a.setOnClickListener(new ImageButton.OnClickListener() {
			@Override
			public void onClick(View v) {
				startActivity(new Intent("android.intent.action.CALL", Uri
						.parse("tel:042-825-0999")));
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
		listDataHeader.add("¶Ò¹è±â¸Ş´º");
		listDataHeader.add("µÎ°¡Áö¸Ş´º");
		listDataHeader.add("Àï¹İ¸Ş´º");
		listDataHeader.add("ÇÔ°¡³× ¿©¸§º°¹Ì");
		listDataHeader.add("ÇÔ°¡³× µÎ·çÄ¡±â");
		listDataHeader.add("NEW ¸Å¿î¸Ş´º");
		listDataHeader.add("Ä¿ÇÃÄÚ½º");
		listDataHeader.add("½Ç¼ÓÄÚ½º");
		listDataHeader.add("¿ä¸®ÄÚ½º");
		listDataHeader.add("¿ÕÄÚ½º");
		listDataHeader.add("½Ì±ÛÄÚ½º");
		listDataHeader.add("¿©¸§¼¼Æ®¸Ş´º");
		listDataHeader.add("¿äÀÏº° ÇÒÀÎ¸Ş´º");
				
		// Adding child data
		List<String> menu1 = new ArrayList<String>();
		menu1.add("¶Ò¹è±âÂ¥Àå 5,500¿ø");
		menu1.add("¶Ò¹è±âÂ«»Í 5,500¿ø");
		menu1.add("¶Ò¹è±â°íÃßÂ«»Í 6,000¿ø");
		menu1.add("¶Ò¹è±â±¼Â«»Í 6,500¿ø");
		menu1.add("¶Ò¹è±âÇØ¹°±¹¹ä 6,500¿ø");
		menu1.add("¶Ò¹è±â¼³··ÅÁ 6,000¿ø");
		menu1.add("¶Ò¹è±â¹ö¼¸ºÒ°í±âµ¤¹ä 6,500¿ø");
		menu1.add("¶Ò¹è±âÇØ¹°µ¤¹ä 6,500¿ø");
		menu1.add("¶Ò¹è±â°õÅÁ 6,000¿ø");
		menu1.add("¶Ò¹è±â³»ÀåÅÁ 6,000¿ø");
		menu1.add("¶Ò¹è±â°¥ºñÅÁ 6,000¿ø");
		menu1.add("¶Ò¹è±â¿ÀÂ¡¾îµ¤¹ä 5,500¿ø");
		menu1.add("¶Ò¹è±âÁ¦À°µ¤¹ä 5,500¿ø");
		menu1.add("¶Ò¹è±âÀ°°³Àå 5,500¿ø");
				
		List<String> menu2 = new ArrayList<String>();
		menu2.add("Â«Â¥¸é 5,000¿ø");
		menu2.add("ººÂ¥¸é 5,500¿ø");
		menu2.add("ººÂ«¸é 5,500¿ø");
		menu2.add("ÅÁÂ¥¸é 6,000¿ø");
		menu2.add("ÅÁÂ«¸é 6,000¿ø");
		menu2.add("ÅÁºº¹ä 6,500¿ø");
				
		List<String> menu3 = new ArrayList<String>();
		menu3.add("Àï¹İÂ¥Àå(2ÀÎ)+°ø±â¹ä 12,000¿ø");
		menu3.add("¾ß³¢Â«»Í(2ÀÎ)+°ø±â¹ä 12,000¿ø");
						
		List<String> menu4 = new ArrayList<String>();
		menu4.add("¹°³Ã¸é 4,500¿ø");
		menu4.add("ºñºö³Ã¸é 5,000¿ø");
		menu4.add("Äá±¹¼ö 4,500¿ø");
		menu4.add("¿Õ¸¸µÎ(4°³) 4,000¿ø");
						
		List<String> menu5 = new ArrayList<String>();
		menu5.add("¿ÀÂ¡¾îµÎ·çÄ¡±â+°ø±â¹ä2+±¹¹° 12,000¿ø");
		menu5.add("Á¦À°µÎ·çÄ¡±â+°ø±â¹ä2+±¹¹° 12,000¿ø");
						
		List<String> menu6 = new ArrayList<String>();
		menu6.add("¸Å¿îÂ¥Àå 5,500¿ø");
		menu6.add("¸Å¿îÂ«»Í 6,000¿ø");
		menu6.add("¸Å¿îººÀ½¹ä 6,500¿ø");
		menu6.add("¸Å¿îÀâÃ¤¹ä 7,000¿ø");
		menu6.add("¸Å¿î¿ìµ¿ 6,000¿ø");
		menu6.add("¸Å¿î¿ï¸é 6,000¿ø");
		menu6.add("¸Å¿î°£Â¥Àå 6,000¿ø");
		menu6.add("¸Å¿î»ï¼±Â¥Àå 7,000¿ø");
		menu6.add("¸Å¿î»ï¼±Â«»Í 7,000¿ø");
		menu6.add("¸Å¿îÀï¹İÂ¥Àå(2ÀÎ) 13,000¿ø");
		menu6.add("¸Å¿îÀï¹İÂ«»Í(2ÀÎ) 13,000¿ø");
				
		List<String> menu7 = new ArrayList<String>();
		menu7.add("C1.Âı½ÒÅÁ¼öÀ°+Â¥Àå2(Â«»Í2)+¸¸µÎ 13,000¿ø");
		menu7.add("C2.¸Å¿î¾ç³äÅÁ¼öÀ°(Ä¥¸®ÅÁ¼öÀ°)+Â¥Àå2(Â«»Í2)+¸¸µÎ 15,000¿ø");
		menu7.add("C3.Âı½ÒÅÁ¼öÀ°+ººÀ½¹ä2(Â«»Í¹ä2)+¸¸µÎ 16,000¿ø");
		menu7.add("C5.Âı½ÒÅÁ¼öÀ°+Àï¹İÂ¥Àå2(¾ß³¢Â«»Í2)+¸¸µÎ 16,000¿ø");
						
		List<String> menu8 = new ArrayList<String>();
		menu8.add("1.Âı½ÒÅÁ¼öÀ°+Â¥Àå3(Â«»Í3)+¸¸µÎ 17,000¿ø");
		menu8.add("2-A.¸Å¿î¾ç³äÅÁ¼öÀ°(Ä¥¸®ÅÁ¼öÀ°)+Â¥Àå3(Â«»Í3) 18,000¿ø");
		menu8.add("3.Âı½ÒÅÁ¼öÀ°+ººÀ½¹ä3(Â«»Í¹ä3)+¸¸µÎ 22,000¿ø");
		menu8.add("4.Âü½ÒÅÁ¼öÀ°+Â¥Àå4(Â«»Í4)+¸¸µÎ 22,000¿ø");
						
		List<String> menu9 = new ArrayList<String>();
		menu9.add("A.±ñÇ³±â+Â¥Àå2(Â«»Í2) 20,000¿ø");
		menu9.add("B.±ñ¼î»õ¿ì+Â¥Àå2(Â«»Í2) 20,000¿ø");
		menu9.add("C.±ñÇ³»õ¿ì+Â¥Àå2(Â«»Í2) 20,000¿ø");
		menu9.add("B.Ä¥¸®»õ¿ì+Â¥Àå2(Â«»Í2) 20,000¿ø");
		menu9.add("B.À¯»ê½½+Â¥Àå2(Â«»Í2) 20,000¿ø");
						
		List<String> menu10 = new ArrayList<String>();
		menu10.add("¿Õ1.ÅÁ¼öÀ°2°³+Â¥Àå5+¸¸µÎ 32,000¿ø");
		menu10.add("¿Õ2.ÅÁ¼öÀ°2°³+Â¥Àå6+¸¸µÎ 35,000¿ø");
						
		List<String> menu11 = new ArrayList<String>();
		menu11.add("Âı½ÒÅÁ¼öÀ°+Â¥Àå(Â«»Í) 9,000¿ø");
		menu11.add("Âı½ÒÅÁ¼öÀ°+ººÀ½¹ä 11,000¿ø");
		menu11.add("Âı½ÒÅÁ¼öÀ°+Àï¹İÂ¥Àå1(¾ß³¢Â«»Í1) 11,000¿ø");
						
		List<String> menu12 = new ArrayList<String>();
		menu12.add("¼¼Æ®A.¹°³Ã¸é2+¿Õ¸¸µÎ(4°³) 11,000¿ø");
		menu12.add("¼¼Æ®B.¹°³Ã¸é1+ºñºö³Ã¸é1+¿Õ¸¸µÎ(4°³) 12,000¿ø");
		menu12.add("¼¼Æ®C.ºñºö³Ã¸é2+¿Õ¸¸µÎ(4°³) 13,000¿ø");
				
		List<String> menu13 = new ArrayList<String>();
		menu13.add("¿ù.ÀâÃ¤¹ä 5,000¿ø");
		menu13.add("È­.ÇØ¹°ººÀ½¹ä 5,000¿ø");
		menu13.add("¼ö.Àï¹İÂ¥Àå 5,000¿ø");
		menu13.add("¸ñ.»õ¿ìººÀ½¹ä 5,000¿ø");
		menu13.add("±İ.¾ß³¢Â«»Í 5,000¿ø");
		menu13.add("Åä.¿ÀÂ¡¾îµ¤¹ä 5,000¿ø");
		menu13.add("ÀÏ.Á¦À°µ¤¹ä 5,000¿ø");
					
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
