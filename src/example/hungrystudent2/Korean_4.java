package example.hungrystudent2;

import java.util.*;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.*;

public class Korean_4 extends Activity {
	ExpandableListAdapter listAdapter;
	ExpandableListView expListView;
	List<String> listDataHeader;
	HashMap<String, List<String>> listDataChild;

	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.korean_4);
		ImageButton a = (ImageButton) findViewById(R.id.call_korean4);

		a.setOnClickListener(new ImageButton.OnClickListener() {

			@Override
			public void onClick(View v) {
				startActivity(new Intent("android.intent.action.CALL", Uri
						.parse("tel:042-823-5479")));

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
		listDataHeader.add("±è¹ä·ù");
		listDataHeader.add("Âî°³·ù");
		listDataHeader.add("ºĞ½Ä·ù");
		listDataHeader.add("½Ä»ç·ù");
		listDataHeader.add("µ¹¼Ü·ü");
		listDataHeader.add("µ·±î½º");

		// Adding child data
		List<String> menu1 = new ArrayList<String>(); // ººÀ½¹ä
		menu1.add("À£ºù±è¹ä 1,500¿ø");
		menu1.add("¿øÁ¶±è¹ä 2,000¿ø");
		menu1.add("ÂüÄ¡±è¹ä 2,500¿ø");
		menu1.add("Ä¡Áî±è¹ä 2,500¿ø");
		menu1.add("ÂüÄ¡±èÄ¡±è¹ä 3,000¿ø");

		List<String> menu2 = new ArrayList<String>(); // µ¤¹ä
		menu2.add("±èÄ¡Âî°³ 4,000¿ø");
		menu2.add("µÈÀåÂî°³ 4,000¿ø");
		menu2.add("¼øµÎºÎÂî°³ 4,000¿ø");
		menu2.add("ÂüÄ¡Âî°³ 4,500¿ø");
		menu2.add("ÇÜÂî°³ 4,500¿ø");

		List<String> menu3 = new ArrayList<String>(); // ¸é·ù
		menu3.add("¶ó¸é 2,500¿ø");
		menu3.add("¶ó¸é(¹ä) 3,000¿ø");
		menu3.add("¶±¶ó¸é 3,000¿ø");
		menu3.add("Ä¡Áî¶ó¸é 3,000¿ø");
		menu3.add("¸¸µÎ¶ó¸é 3,000¿ø");
		menu3.add("¼øµÎºÎ¶ó¸é 3,500¿ø");
		menu3.add("Â«»Í¶ó¸é 3,500¿ø");
		menu3.add("¶óººÀÌ 3,500¿ø");
		menu3.add("¶±ººÀÌ 3,500¿ø");
		menu3.add("Ä¡Áî¶óººÀÌ 4,000¿ø");
		menu3.add("ÂüÄ¡¶óººÀÌ 4,000¿ø");
		menu3.add("¶±¸¸µÎ 4,000¿ø");
		menu3.add("¶±±¹ 4,000¿ø");
		menu3.add("ÂÌ¸é 4,000¿ø");
		menu3.add("¹°³Ã¸é 4,000¿ø");
		menu3.add("ºñºö³Ã¸é 4,000¿ø");

		List<String> menu4 = new ArrayList<String>(); // ½ºÆä¼È
		menu4.add("µµ±úºñµµ½Ã¶ô 4,000¿ø");
		menu4.add("¿À¹Ç¶óÀÌ½º 4,000¿ø");
		menu4.add("¿ÀÂ¡¾îµ¤¹ä 4,000¿ø");
		menu4.add("Á¦À°µ¤¹ä 4,000¿ø");
		menu4.add("ÇÜ¾ßÃ¤ººÀ½¹ä 4,000¿ø");
		menu4.add("±èÄ¡ººÀ½¹ä 4,000¿ø");
		menu4.add("¾ßÃ¤ºñºö¹ä 4,000¿ø");
		menu4.add("ÂüÄ¡ºñºö¹ä 4,000¿ø");
		menu4.add("ÂüÄ¡±èÄ¡µ¤¹ä 4,500¿ø");
		menu4.add("Ä¡Å²µ¤¹ä 4,500¿ø");
		menu4.add("¿ÀºÒµ¤¹ä 4,500¿ø");
		menu4.add("ÂüÄ¡ººÀ½¹ä 4,500¿ø");
		menu4.add("ÂüÄ¡±èÄ¡ººÀ½¹ä 4,500¿ø");
		menu4.add("ÇØ¹°ººÀ½¹ä 4,500¿ø");
		menu4.add("²¿²¿ººÀ½¹ä 4,500¿ø");
		menu4.add("¼è°í±âµ¤¹ä 5,000¿ø");

		List<String> menu5 = new ArrayList<String>(); // °èÀı¸Ş´º
		menu5.add("À°°³Àå 5,000¿ø");
		menu5.add("µ¹¼Üºñºö¹ä 5,000¿ø");
		menu5.add("¿ÀºÒµ¹¼Ü 5,000¿ø");
		menu5.add("Ä¡Å²µ¹¼Ü 5,000¿ø");
		menu5.add("³«Áöµ¹¼Ü 5,000¿ø");
		menu5.add("¾Ë¹ä 5,000¿ø");
		menu5.add("±èÄ¡¾Ë¹ä 5,000¿ø");
		menu5.add("Ä¡Áî¾Ë¹ä 5,000¿ø");
		menu5.add("ÂüÄ¡¾Ë¹ä 5,500¿ø");
		menu5.add("¶Ò¹è±âºÒ°í±â 5,500¿ø");

		List<String> menu6 = new ArrayList<String>(); // À½·á¼ö
		menu6.add("¼ø»ìµ·±î½º 4,500¿ø");
		menu6.add("Ä¡Áîµ·±î½º 5,000¿ø");
		menu6.add("°í±¸¸¶µ·±î½º 5,000¿ø");
		menu6.add("ÇÇÀÚµ·±î½º 5,000¿ø");
		menu6.add("´ÜÈ£¹Úµ·±î½º 5,000¿ø");

		listDataChild.put(listDataHeader.get(0), menu1); // Header, Child data
		listDataChild.put(listDataHeader.get(1), menu2);
		listDataChild.put(listDataHeader.get(2), menu3);
		listDataChild.put(listDataHeader.get(3), menu4);
		listDataChild.put(listDataHeader.get(4), menu5);
		listDataChild.put(listDataHeader.get(5), menu6);

	}
}
