package example.hungrystudent2;

import java.util.*;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.*;

public class Korean_2 extends Activity{
	ExpandableListAdapter listAdapter;
	ExpandableListView expListView;
	List<String> listDataHeader;
	HashMap<String, List<String>> listDataChild;

	protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.korean_2);
        ImageButton a = (ImageButton)findViewById(R.id.call_korean2);

        a.setOnClickListener(new ImageButton.OnClickListener(){

			@Override
			public void onClick(View v) {
				startActivity(new Intent("android.intent.action.CALL",Uri.parse("tel:042-488-0709")));
				
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
		listDataHeader.add("½Ä»ç·ù");
		listDataHeader.add("¾ÈÁÖ·ù");
		listDataHeader.add("±âÅ¸ºĞ½Ä");
	
		
		
		// Adding child data
		List<String> menu1 = new ArrayList<String>(); // ½Å¸Ş´º
		menu1.add("ÄÅ¹ä   3,000¿ø");
		menu1.add("¼Ò°í±âÄÅ¹ä   4,000¿ø");
		menu1.add("³¯Ä¡¾ËÄÅ¹ä   4,000¿ø");
		menu1.add("¿ÀÂ¡¾îÄÅ¹ä   4,000¿ø");
		menu1.add("Á¦À°ÄÅ¹ä   4,000¿ø");
		menu1.add("°íÃßÄÅ¹ä   4,000¿ø");
		
		
		
		
		List<String> menu2 = new ArrayList<String>(); // ½Ä»ç·ù
		menu2.add("±èÄ¡ººÀ½¹ä   6,000¿ø");
		menu2.add("¾ßÃ¤ººÀ½¹ä   6,000¿ø");
		menu2.add("Á¦Ÿ´µ¤¹ä   6,000¿ø");
		menu2.add("¿ÀÂ¡¾îµ¤¹ä   6,000¿ø");
		menu2.add("ÀâÃ¤¹ä   6,000¿ø");
		menu2.add("¿À¹Ç¶óÀÌ½º   6,000¿ø");
		menu2.add("¼è°í±âµ¤¹ä   7,000¿ø");
		menu2.add("»ıµ·±î½º   7,000¿ø");
		menu2.add("¶±°¥ºñÁ¤½Ä   7,000¿ø");
		menu2.add("¼ÒºÒ°í±â»õ½Ïºñºö¹ä   7,000¿ø");
		menu2.add("±èÄ¡±¹   5,000¿ø");
		menu2.add("µÈÀåÂî°³   5,000¿ø");
		menu2.add("±èÄ¡Âî°³   5,000¿ø");
		menu2.add("¹Ì¿ª±¹   6,000¿ø");
		menu2.add("ºÏ¾î±¹   6,000¿ø");
		menu2.add("À°°³Àå   6,000¿ø");
		menu2.add("º­´Ù±ÍÅÁ   7,000¿ø");
		menu2.add("°¥ºñÅÁ   7,000¿ø");
		menu2.add("´ßµµ¸®ÅÁ   7,000¿ø");
		menu2.add("ºÎ´ëÂî°³á³(2ìÑ)   12,000¿ø");
		menu2.add("ºÎ´ëÂî°³ñé(3ìÑ)   15,000¿ø");
		menu2.add("ºÎ´ëÂî°³ÓŞ(4ìÑ)   20,000¿ø");
		menu2.add("ÂüÄ¡Âî°³á³(2ìÑ)   12,000¿ø");
		menu2.add("ÂüÄ¡Âî°³ñé(3ìÑ)   15,000¿ø");
		menu2.add("ÂüÄ¡Âî°³ÓŞ(4ìÑ)   20,000¿ø");
		menu2.add("µ¿ÅÂÂî°³á³(2ìÑ)   12,000¿ø");
		menu2.add("µ¿ÅÂÂî°³ñé(3ìÑ)   15,000¿ø");
		menu2.add("µ¿ÅÂÂî°³ÓŞ(4ìÑ)   20,000¿ø");
		menu2.add("¼øµÎºÎÂî°³á³(2ìÑ)   12,000¿ø");
		menu2.add("¼øµÎºÎÂî°³ñé(3ìÑ)   15,000¿ø");
		menu2.add("¼øµÎºÎÂî°³ÓŞ(4ìÑ)   20,000¿ø");
		menu2.add("¹°³Ã¸é   5,000¿ø");
		menu2.add("ºñºö³Ã¸é   6,000¿ø");
		menu2.add("¿­¹«³Ã¸é   6,000¿ø");
		menu2.add("»ï°èÅÁ   10,000¿ø");
		menu2.add("Àüº¹»ï°èÅÁ   15,000¿ø");

		
		
		List<String> menu3 = new ArrayList<String>();	//¾ÈÁÖ·ù
		menu3.add("[°ø±â¹äº°µµ]");
		menu3.add("11½Ã~14½Ã °ø±â¹ä¼­ºñ½º");
		menu3.add("´ßµµ¸®ÅÁá³(2ìÑ)   15,000¿ø");
		menu3.add("´ßµµ¸®ÅÁñé(3ìÑ)   20,000¿ø");
		menu3.add("´ßµµ¸®ÅÁÓŞ(4ìÑ)   25,000¿ø");
		menu3.add("´ßµµ¸®ÅÁ(Æ¯ÓŞ)   30,000¿ø");
		menu3.add("°¨ÀÚÅÁá³(2ìÑ)   15,000¿ø");
		menu3.add("°¨ÀÚÅÁñé(3ìÑ)   20,000¿ø");
		menu3.add("°¨ÀÚÅÁÓŞ(4ìÑ)   25,000¿ø");
		menu3.add("°¨ÀÚÅÁ(Æ¯ÓŞ)   30,000¿ø");
		menu3.add("¾Èµ¿Âò´ßá³(2ìÑ)   15,000¿ø");
		menu3.add("¾Èµ¿Âò´ßñé(3ìÑ)   20,000¿ø");
		menu3.add("¾Èµ¿Âò´ßÓŞ(4ìÑ)   25,000¿ø");
		menu3.add("¾Èµ¿Âò´ß(Æ¯ÓŞ)   30,000¿ø");
		menu3.add("°íÃßÀåÂò´ßá³(2ìÑ)   15,000¿ø");
		menu3.add("°íÃßÀåÂò´ßñé(3ìÑ)   20,000¿ø");
		menu3.add("°íÃßÀåÂò´ßÓŞ(4ìÑ)   25,000¿ø");
		menu3.add("°íÃßÀåÂò´ß(Æ¯ÓŞ)   30,000¿ø");
		menu3.add("[¾ÈÁÖ»ç¸®]¶±/¶ó¸é   1,000¿ø");
		menu3.add("[¾ÈÁÖ»ç¸®]´ç¸é   2,000¿ø");
		
		
		List<String> menu4 = new ArrayList<String>();	//±âÅ¸ºĞ½Ä
		menu4.add("ÁÖ¸Ô¹ä  2,000¿ø");
		menu4.add("±è¹ä  2,000¿ø");
		menu4.add("°è¶õÈÄ¶óÀÌ3°³  2,000¿ø");
		menu4.add("¶±ººÀÌ  3,000¿ø");
		menu4.add("¸ğµëÆ¢±è  3,000¿ø");
		menu4.add("°è¶õÂò  5,000¿ø");
		


		
		listDataChild.put(listDataHeader.get(0), menu1); // Header, Child data
		listDataChild.put(listDataHeader.get(1), menu2);
		listDataChild.put(listDataHeader.get(2), menu3);
		listDataChild.put(listDataHeader.get(3), menu4);
		

	}


}
