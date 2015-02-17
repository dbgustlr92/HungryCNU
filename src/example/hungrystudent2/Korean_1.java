package example.hungrystudent2;

import java.util.*;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.*;

public class Korean_1 extends Activity {
	ExpandableListAdapter listAdapter;
	ExpandableListView expListView;
	List<String> listDataHeader;
	HashMap<String, List<String>> listDataChild;

	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.korean_1);
		ImageButton a = (ImageButton) findViewById(R.id.call_korean1);

		a.setOnClickListener(new ImageButton.OnClickListener() {

			@Override
			public void onClick(View v) {
				startActivity(new Intent("android.intent.action.CALL", Uri
						.parse("tel:042-822-5442")));

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
		listDataHeader.add("±è¹ä");
		listDataHeader.add("¾ç½Ä");
		listDataHeader.add("½Ä»ç");
		listDataHeader.add("ÃÊ¹ä");
		listDataHeader.add("Á×");
		listDataHeader.add("ºĞ½Ä");
		listDataHeader.add("±âÅ¸");
		
		
		// Adding child data
		List<String> menu1 = new ArrayList<String>(); // ±è¹ä
		menu1.add("¿øÁ¶±è¹ä   1,500¿ø");
		menu1.add("ÂüÄ¡±è¹ä   2,500¿ø");
		menu1.add("Ä¡Áî±è¹ä   3,000¿ø");
		menu1.add("±èÄ¡±è¹ä   3,000¿ø");
		menu1.add("¼Ò°í±â±è¹ä   3,000¿ø");
		menu1.add("°£Àå°íÃß±è¹ä   3,000¿ø");
		menu1.add("¶¯ÃÊ±è¹ä   3,000¿ø");
		menu1.add("´©µå±è¹ä   3,000¿ø");
		menu1.add("ÂüÄ¡Ä¡Áî±è¹ä   3,500¿ø");
		menu1.add("°è¶õ¸»ÀÌ±è¹ä   3,500¿ø");
		menu1.add("ÂüÄ¡¶¯ÃÊ±è¹ä   3,500¿ø");
		menu1.add("¾ßÃ¤»ø·¯µå±è¹ä   3,500¿ø");
		menu1.add("³¯Ä¡¾Ë±è¹ä   3,500¿ø");
		menu1.add("ÂüÄ¡°è¶õ¸»ÀÌ±è¹ä   4,00¿ø");
		menu1.add("³¯Ä¡¾Ë±èÄ¡±è¹ä   4,000¿ø");
		
		
		
		List<String> menu2 = new ArrayList<String>(); // ¾ç½Ä
		menu2.add("µ·±î½º   6,000¿ø");
		menu2.add("»ı¼±±î½º   6,000¿ø");
		menu2.add("»ı°úÀÏµ·±î½º   6,500¿ø");
		menu2.add("Ä¡Å²µ·±î½º   6,500¿ø");
		menu2.add("Ä«·¹µ·±î½º   6,500¿ø");
		menu2.add("ÇÇÀÚµ·±î½º½ºÅ×ÀÌÅ©   7,000¿ø");
		menu2.add("°í±¸¸¶Ä¡Áî½ºÅ×ÀÌÅ©   7,000¿ø");
		menu2.add("Ä¡Áî½ºÅ×ÀÌÅ©   7,000¿ø");
		menu2.add("ÇÔ¹Ú½ºÅ×ÀÌÅ©   7,000¿ø");
		menu2.add("¾È½Éµ·±î½º   7,500¿ø");
		menu2.add("Ä¡ÁîÄ¡Å²±î½º   7,500¿ø");
		menu2.add("Ä«·¹Ä¡Áîµ·±î½º   7,500¿ø");
		menu2.add("»ı°úÀÏÄ¡Áîµ·±î½º   7,500¿ø");
		menu2.add("½ºÆä¼£Æ¯Á¤½Ä(µ·±î½º+ÂÌ¸é+±è¹ä+»ı¼±±î½º+ÃÊ¹ä)   8,500¿ø");
		
		List<String> menu3 = new ArrayList<String>();	//½Ä»ç
		menu3.add("°ø±â¹ä   1,000¿ø");
		menu3.add("±èÄ¡µ¤¹ä   5,500¿ø");
		menu3.add("Á¦À°µ¤¹ä   5,500¿ø");
		menu3.add("ÂüÄ¡±èÄ¡µ¤¹ä   5,500¿ø");
		menu3.add("ºñºö¹ä   5,500¿ø");
		menu3.add("Ä«·¹µ¤¹ä   5,500¿ø");
		menu3.add("ÀâÃ¤¹ä   5,500¿ø");
		menu3.add("µÈÀåÂî°³   5,500¿ø");
		menu3.add("±èÄ¡Âî°³   5,500¿ø");
		menu3.add("ÂüÄ¡Âî°³   5,500¿ø");
		menu3.add("¼øµÎºÎÂî°³   5,500¿ø");
		menu3.add("¿Àµ­±èÄ¡Âî°³   5,500¿ø");
		menu3.add("Ã»±¹Àå   5,500¿ø");
		menu3.add("Äá³ª¹°±¹   5,500¿ø");
		menu3.add("¹Ì¿ª±¹   5,500¿ø");
		menu3.add("±èÄ¡±¹   5,500¿ø");
		menu3.add("´©·îÁöÅÁ   5,500¿ø");
		menu3.add("¿ÀÂ¡¾îµ¤¹ä   6,000¿ø");
		menu3.add("¿À¹Ç¶óÀÌ½º   6,000¿ø");
		menu3.add("±èÄ¡ººÀ½¹ä   6,000¿ø");
		menu3.add("ÂŞ±¸¹Ìµ¤¹ä   6,000¿ø");
		menu3.add("¼ÒºÒ°í±âµ¤¹ä   6,000¿ø");
		menu3.add("ÂüÄ¡±èÄ¡ººÀ½¹ä   6,000¿ø");
		menu3.add("»õ¿ìººÀ½¹ä   6,000¿ø");
		menu3.add("ÇØ¹°ººÀ½¹ä   6,000¿ø");
		menu3.add("¿À»ï±èÄ¡ººÀ½¹ä   6,000¿ø");
		menu3.add("º¸¸®¹ä(µÈÀå±¹Æ÷ÇÔ)   6,000¿ø");
		menu3.add("Äá³ª¹°ºñºö¹ä   6,000¿ø");
		menu3.add("µ¹¼Üºñºö¹ä   6,000¿ø");
		menu3.add("¾Æ¿í±¹   6,000¿ø");
		menu3.add("½Ã±İÄ¡µÈÀå±¹   6,000¿ø");
		menu3.add("¿Ã°»ÀÌÇØÀå±¹   6,000¿ø");
		menu3.add("¹ÙÁö¶ô¹Ì¿ª±¹   6,000¿ø");
		menu3.add("À°°³Àå   6,000¿ø");
		menu3.add("³«Áöµ¤¹ä   6,500¿ø");
		menu3.add("ÂŞ»ïººÀ½¹ä   6,500¿ø");
		menu3.add("Ä¡Áîµ¹¼Üºñºö¹ä   6,500¿ø");
		menu3.add("¿ì··µÈÀåÂî°³   6,500¿ø");
		menu3.add("°íµî¾î±èÄ¡Á¶¸²   6,500¿ø");
		menu3.add("¼Ò»ÀÇØÀå±¹   6,500¿ø");
		menu3.add("°¥ºñÅÁ   6,500¿ø");
		menu3.add("È²ÅÂÅÁ   6,500¿ø");
		menu3.add("¼³··ÅÁ   6,500¿ø");
		menu3.add("À¯ºÎ¿Àµ­ÅÁ   6,500¿ø");
		menu3.add("µ¹¼Ü±èÄ¡Ä¡ÁîººÀ½¹ä   7,000¿ø");
		menu3.add("ÇÑ¹æ¹İ°èÅÁ(°ø±â¹äÆ÷ÇÔ)   7,000¿ø");
		menu3.add("ÃÌµÅÁöÂî°³(2ÀÎÀÌ»ó¹è´Ş)   7,000¿ø");
		menu3.add("ºÎ´ëÂî°³   7,500¿ø");
		menu3.add("µ¹¼ÜÂüÄ¡±èÄ¡Ä¡ÁîººÀ½¹ä   7,500¿ø");
		menu3.add("Á¦À°½Ó¹äÁ¤½Ä(2ÀÎÀÌ»ó¹è´Ş)   7,500¿ø");
		menu3.add("¾Ë¹ä   7,500¿ø");
		menu3.add("¶Ò¹è±âµ¿ÅÂÂî°³   7,500¿ø");
		menu3.add("¶Ò¹è±â¼ÒºÒ°í±â   7,500¿ø");
		menu3.add("»ï°è´ßÁ×  8,000¿ø");
		menu3.add("¶Ò¹è±â°¨ÀÚÅÁ  8,000¿ø");
		menu3.add("¶Ò¹è±â°¥ºñÂò  9,000¿ø");
		menu3.add("ÇÑ¹æ»ï°èÅÁ  11,000¿ø");
		
		List<String> menu4 = new ArrayList<String>();	//ÃÊ¹ä
		menu4.add("À¯ºÎÃÊ¹ä  6,000¿ø");
		menu4.add("µµ¹ÌÃÊ¹ä  7,000¿ø");
		menu4.add("¿¬¾îÀå¾îÃÊ¹ä  7,000¿ø");
		menu4.add("ÇÑÄ¡ÃÊ¹ä  7,000¿ø");
		menu4.add("ÂüÄ¡È¸ÃÊ¹ä  7,000¿ø");
		menu4.add("»õ¿ì¹®¾îÃÊ¹ä  7,000¿ø");
		menu4.add("Æ¯¸ğµëÃÊ¹ä  12,000¿ø");
		
		
		List<String> menu5 = new ArrayList<String>();	//Á×
		menu5.add("È£¹ÚÁ×   6,000¿ø");
		menu5.add("´ÜÆÏÁ×   6,000¿ø");
		menu5.add("¼Ò°í±â¾ßÃ¤Á×   6,000¿ø");
		menu5.add("Àüº¹Á×   8,000¿ø");
		
		List<String> menu6 = new ArrayList<String>();	//ºĞ½Ä
		menu6.add("°í±â¸¸µÎ   3,500¿ø");
		menu6.add("±èÄ¡¸¸µÎ   3,500¿ø");
		menu6.add("¶ó¸é   3,500¿ø");
		menu6.add("¿Àµ­   4,000¿ø");
		menu6.add("¿ìµ¿   4,000¿ø");
		menu6.add("°è¶õ¶ó¸é   4,000¿ø");	
		menu6.add("¸¸µÎ¶ó¸é   4,000¿ø");
		menu6.add("Ä¡Áî¶ó¸é   4,000¿ø");
		menu6.add("±èÄ¡¶ó¸é   4,000¿ø");
		menu6.add("°¨ÀÚ¶ó¸é   4,000¿ø");
		menu6.add("°í±â(±èÄ¡)¿Õ¸¸µÎ   4,000¿ø");
		menu6.add("±èÄ¡¿ìµ¿   4,500¿ø");
		menu6.add("À¯ºÎ¿ìµ¿   4,500¿ø");
		menu6.add("¶±¸¸µÎ¶ó¸é   4,500¿ø");
		menu6.add("¶±ººÀÌ   4,500¿ø");
		menu6.add("Â«»Í¶ó¸é   5,000¿ø");
		menu6.add("ÇØÀå¶ó¸é   5,000¿ø");
		menu6.add("ÂÌ¸é   5,000¿ø");
		menu6.add("Ä¡Áî¶±ººÀÌ   5,000¿ø");
		menu6.add("¶óººÀÌ   5,000¿ø");
		menu6.add("Â¥Àå¶±ººÀÌ   5,000¿ø");
		menu6.add("ÀÜÄ¡±¹¼ö   5,000¿ø");
		menu6.add("Ä¡Áî¶óººÀÌ   5,500¿ø");
		menu6.add("¸Å¿îÂ¥Àå¶±ººÀÌ   5,500¿ø");
		menu6.add("¶±±¹   5,500¿ø");
		menu6.add("¸¸µÎ±¹   5,500¿ø");
		menu6.add("¶±¸¸µÎ±¹   5,500¿ø");
		menu6.add("Ä®±¹¼ö   5,500¿ø");
		menu6.add("±èÄ¡Ä®±¹¼ö   5,500¿ø");
		menu6.add("¾óÅ«ÀÌÄ®±¹¼ö  5,500¿ø");
		menu6.add("ÇØ¹°Ä®±¹¼ö   5,500¿ø");
		menu6.add("¼Õ¼öÁ¦ºñ   5,500¿ø");
		menu6.add("±èÄ¡¼öÁ¦ºñ   5,500¿ø");
		menu6.add("¾óÅ«(ÇØ¹°)¼öÁ¦ºñ   5,500¿ø");
		menu6.add("°¨ÀÚ¼öÁ¦ºñ   5,500¿ø");
		menu6.add("ºñºö(¿­¹«)±¹¼ö   5,500¿ø");
		menu6.add("¿­¹«(±èÄ¡)ºñºö±¹¼ö   5,500¿ø");
		menu6.add("¹°³Ã¸é   5,500¿ø");
		menu6.add("ºñºö³Ã¸é   5,500¿ø");
		menu6.add("¿­¹«³Ã¸é   5,500¿ø");
		menu6.add("¸Ş¹Ğ¼Ò¹Ù   5,500¿ø");
		menu6.add("ÇØ¹°ººÀ½¿ìµ¿   6,000¿ø");
		menu6.add("ºñºö¸¸µÎ(ÂÌ¸é+¸¸µÎ)   6,000¿ø");
		menu6.add("¾ßÃ¤ºñºö¸¸µÎ   6,000¿ø");
		menu6.add("¸äµ¹Äá±¹¼ö   6,000¿ø");
		menu6.add("¿­¹«ºñºö³Ã¸é   6,000¿ø");
		menu6.add("ÇØ¹°½ºÆÄ°ÔÆ¼   6,000¿ø");
		menu6.add("Ä¡Áî¿Àºì½ºÆÄ°ÔÆ¼   6,000¿ø");
		menu6.add("±æ½Ó³Ã¸é   7,000¿ø");
		menu6.add("±æ½Óºñºö³Ã¸é   7,500¿ø");
		menu6.add("±è½Ó°í±âÃß°¡   2,500¿ø");
		menu6.add("ÇØ¹°Å©¸²½ºÆÄ°ÔÆ¼   7,000¿ø");
		
		
		
		List<String> menu7 = new ArrayList<String>();	//±âÅ¸
		menu7.add("µÅÁö°¥ºñÂòñé(2ìÑ)   20,000¿ø");
		menu7.add("µÅÁö°¥ºñÂòÓŞ(3ìÑ)   25,000¿ø");
		menu7.add("ºÒ³«Àü°ñá³(2ìÑ)   19,000¿ø");
		menu7.add("ºÒ³«Àü°ññé(3ìÑ)   24,000¿ø");
		menu7.add("ºÒ³«Àü°ñÓŞ(4ìÑ)   30,000¿ø");
		menu7.add("¹ö¼¸Àü°ñá³(2ìÑ)   19,000¿ø");
		menu7.add("¹ö¼¸Àü°ññé(3ìÑ)   24,000¿ø");
		menu7.add("¹ö¼¸Àü°ñÓŞ(4ìÑ)   30,000¿ø");
		menu7.add("¾ËÅÁá³(2ìÑ)   19,000¿ø");
		menu7.add("¾ËÅÁñé(3ìÑ)   24,000¿ø");
		menu7.add("¾ËÅÁÓŞ(4ìÑ)   30,000¿ø");
		menu7.add("ºÎ´ëÂî°³á³(2ìÑ)   16,000¿ø");
		menu7.add("ºÎ´ëÂî°³ñé(3ìÑ)   22,000¿ø");
		menu7.add("ºÎ´ëÂî°³ÓŞ(4ìÑ)   27,000¿ø");
		menu7.add("µ¿ÅÂÂî°³á³(2ìÑ)   16,000¿ø");
		menu7.add("µ¿ÅÂÂî°³ñé(3ìÑ)   22,000¿ø");
		menu7.add("µ¿ÅÂÂî°³ÓŞ(4ìÑ)   27,000¿ø");
		menu7.add("µÎºÎµÅÁöµÎ·çÄ¡±âá³(2ìÑ)   14,000¿ø");
		menu7.add("µÎºÎµÅÁöµÎ·çÄ¡±âñé(3ìÑ)   19,000¿ø");
		menu7.add("µÎºÎµÅÁöµÎ·çÄ¡±âÓŞ(4ìÑ)   25,000¿ø");
		menu7.add("¹¬ÀºÁöµÅÁöµÎ·çÄ¡±âá³(2ìÑ)   17,000¿ø");
		menu7.add("¹¬ÀºÁöµÅÁöµÎ·çÄ¡±âñé(3ìÑ)   22,000¿ø");
		menu7.add("¹¬ÀºÁöµÅÁöµÎ·çÄ¡±âÓŞ(4ìÑ)   27,000¿ø");
		menu7.add("¿ÀÂ¡¾îµÎ·çÄ¡±âá³(2ìÑ)   16,000¿ø");
		menu7.add("¿ÀÂ¡¾îµÎ·çÄ¡±âñé(3ìÑ)   21,000¿ø");
		menu7.add("¿ÀÂ¡¾îµÎ·çÄ¡±âÓŞ(4ìÑ)   25,000¿ø");
		menu7.add("³«ÁöµÎ·çÄ¡±âá³(2ìÑ)   18,000¿ø");
		menu7.add("³«ÁöµÎ·çÄ¡±âñé(3ìÑ)   23,000¿ø");
		menu7.add("³«ÁöµÎ·çÄ¡±âÓŞ(4ìÑ)   27,000¿ø");
		menu7.add("ÂŞ»ïµÎ·çÄ¡±âñé(3ìÑ)   20,000¿ø");
		menu7.add("ÂŞ»ïµÎ·çÄ¡±âÓŞ(4ìÑ)   25,000¿ø");
		menu7.add("´ßµµ¸®ÅÁá³(2ìÑ)   22,000¿ø");
		menu7.add("´ßµµ¸®ÅÁñé(3ìÑ)   27,000¿ø");
		menu7.add("´ßµµ¸®ÅÁÓŞ(4ìÑ)   31,000¿ø");
		menu7.add("°¨ÀÚÅÁá³(2ìÑ)   20,000¿ø");
		menu7.add("°¨ÀÚÅÁñé(3ìÑ)   27,000¿ø");
		menu7.add("°¨ÀÚÅÁÓŞ(4ìÑ)   32,000¿ø");
		menu7.add("ÇØ¹°ÅÁá³(2ìÑ)   22,000¿ø");
		menu7.add("ÇØ¹°ÅÁñé(3ìÑ)   27,000¿ø");
		menu7.add("ÇØ¹°ÅÁÓŞ(4ìÑ)   32,000¿ø");
		menu7.add("µ·±î½º¾ÈÁÖ   12,000¿ø");
		menu7.add("µÎºÎ±èÄ¡   13,000¿ø");
		menu7.add("»À¾ø´Â´ß¹ß   15,000¿ø");
		menu7.add("°ñ¹ğÀÌ»ç¸®   15,000¿ø");
		menu7.add("¶±±¹°ø±â¹ä¼¼Æ®   6,000¿ø");
		menu7.add("¸¸µÎ±¹°ø±â¹ä¼¼Æ®   6,000¿ø");
		menu7.add("¶±¸¸µÎ±¹°ø±â¹ä¼¼Æ®   6,000¿ø");


		
		listDataChild.put(listDataHeader.get(0), menu1); // Header, Child data
		listDataChild.put(listDataHeader.get(1), menu2);
		listDataChild.put(listDataHeader.get(2), menu3);
		listDataChild.put(listDataHeader.get(3), menu4);
		listDataChild.put(listDataHeader.get(4), menu5);
		listDataChild.put(listDataHeader.get(5), menu6);
		listDataChild.put(listDataHeader.get(6), menu7);

	}

}
