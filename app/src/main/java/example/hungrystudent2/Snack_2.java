package example.hungrystudent2;

import java.util.*;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.*;

public class Snack_2 extends Activity {
	ExpandableListAdapter listAdapter;
	ExpandableListView expListView;
	List<String> listDataHeader;
	HashMap<String, List<String>> listDataChild;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.snack_2);
		
		  ImageButton a = (ImageButton)findViewById(R.id.call_snack2);

	        a.setOnClickListener(new ImageButton.OnClickListener(){

				@Override
				public void onClick(View v) {
					startActivity(new Intent("android.intent.action.CALL",Uri.parse("tel:042-826-9266")));
					
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
		listDataHeader.add("¿±±â¸Ş´º");
		listDataHeader.add("¿±±â¼¼Æ®");
		listDataHeader.add("Âü½¡¸Ş´º");
		listDataHeader.add("Âü½¡¼¼Æ®");
		listDataHeader.add("ÅäÇÎ");
		listDataHeader.add("»çÀÌµå¸Ş´º");

		
		// Adding child data
		List<String> menu1 = new ArrayList<String>();	//¿±±â¸Ş´º
		menu1.add("¿±±â¶±ººÀÌ  14,000¿ø");
		menu1.add("¿±±â¿Àµ­  14,000¿ø");
		menu1.add("¿±±â´ßµµ¸®  24,000¿ø");		
		
		
		List<String> menu2 = new ArrayList<String>();	//¿±±â¼¼Æ®
		menu2.add("A.¿±¶±+°è¶õÂò+ÁÖ¸Ô¹ä+ÄğÇÇ½ºÓŞ  17,000¿ø");
		menu2.add("B.¿±¶±+°è¶õÂò+ÁÖ¸Ô¹ä+¸¸µÎ2+°è¶õ2+ÄğÇÇ½ºÓŞ   19,000¿ø");
		menu2.add("C.¿±¶±+°è¶õÂò+ÁÖ¸Ô¹ä+Ä¡ÁîÅäÇÎ+ÄğÇÇ½ºÓŞ   20,000¿ø");
		

		List<String> menu3 = new ArrayList<String>();	//Âü½¡¸Ş´º
		menu3.add("Âü½¡Åë´ß¹ß   14,000¿ø");
		menu3.add("Âü½¡´ß³¯°³   14,000¿ø");
		menu3.add("¿Àµ¹»À   14,000¿ø");
		menu3.add("Âü½¡»À¾ø´Â´ß¹ß   15,000¿ø");
		menu3.add("±¹¹°´ß¹ß   15,000¿ø");
		
	
		
		List<String> menu4 = new ArrayList<String>();	//Âü½¡¼¼Æ®
		menu4.add("1.¿Àµ¹»À+°è¶õÂò+ÁÖ¸Ô¹ä+ÄğÇÇ½ºÓŞ   17,000¿ø");
		menu4.add("2.»À¾ø´Â´ß¹ß+°è¶õÂò+ÁÖ¸Ô¹ä+ÄğÇÇ½ºÓŞ   18,000¿ø");
		menu4.add("3.±¹¹°´ß¹ß+°è¶õÂò+ÁÖ¸Ô¹ä+´ç¸é+ÄğÇÇ½ºÓŞ   20,000¿ø");
		menu4.add("4.´ßµµ¸®ÅÁ+°è¶õÂò+ÁÖ¸Ô¹ä+ÄğÇÇ½ºÓŞ   27,000¿ø");
		
		List<String> menu5 = new ArrayList<String>(); //ÅäÇÎ
		menu5.add("¿Àµ­/¶±Ãß°¡   1,000¿ø");
		menu5.add("¸ŞÃß¸®¾Ë   1,000¿ø");
		menu5.add("°è¶õ   1,000¿ø");
		menu5.add("ÇÜ   1,000¿ø");
		menu5.add("¾ß³¢¸¸µÎ   2,000¿ø");
		menu5.add("¶ó¸é»ç¸®   2,000¿ø");
		menu5.add("´ç¸é   2,000¿ø");
		menu5.add("Ä¡Áî   3,000¿ø");
		
		
		List<String> menu6 = new ArrayList<String>();	//»çÀÌµå¸Ş´º
		menu6.add("°è¶õÂòÃß°¡   2,000¿ø");
		menu6.add("ÁÖ¸Ô±è¹ä   2,000¿ø");
		menu6.add("°è¶õ¾ßÃ¤Á×   5,000¿ø");
		menu6.add("´©¸ªÁöÅÁ   5,000¿ø");
		menu6.add("¿Àµ­ÅÁ   10,000¿ø");
		
		
		
		
		
		
		listDataChild.put(listDataHeader.get(0), menu1); // Header, Child data
		listDataChild.put(listDataHeader.get(1), menu2);
		listDataChild.put(listDataHeader.get(2), menu3);
		listDataChild.put(listDataHeader.get(3), menu4);
		listDataChild.put(listDataHeader.get(4), menu5);
		listDataChild.put(listDataHeader.get(5), menu6);
	}
}
