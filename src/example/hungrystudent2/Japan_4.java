package example.hungrystudent2;

import java.util.*;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.*;

public class Japan_4 extends Activity {
	ExpandableListAdapter listAdapter;
	ExpandableListView expListView;
	List<String> listDataHeader;
	HashMap<String, List<String>> listDataChild;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.japan_4);

		ImageButton a = (ImageButton) findViewById(R.id.call_japanese4);

		a.setOnClickListener(new ImageButton.OnClickListener() {

			@Override
			public void onClick(View v) {
				startActivity(new Intent("android.intent.action.CALL", Uri
						.parse("tel:042-826-4446")));

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
		listDataHeader.add("µ·±î½º");
		listDataHeader.add("µ¤¹ä");
		listDataHeader.add("Á¤½Ä");
		listDataHeader.add("¸ğµë");
		listDataHeader.add("¼¼Æ®¸Ş´º");
		listDataHeader.add("¾ÈÁÖ·ù");

		// Adding child data
		List<String> menu1 = new ArrayList<String>(); // µ·±î½º
		menu1.add("¿Õ»õ¿ì±î½º   7,000¿ø");
		menu1.add("¿Õµ·±î½º   7,000¿ø");
		menu1.add("»ı¼±±î½º   7,000¿ø");
		menu1.add("ÇØ¹°±î½º   7,000¿ø");
		menu1.add("ÇÔ¹Ú½ºÅ×ÀÌÅ©  8,000¿ø");
		menu1.add("ÇÇÀÚµ·±î½º   8,000¿ø");
		menu1.add("¸ğµëµ·±î½º   8,000¿ø");
		menu1.add("Ä¡Áîµ·±î½º   8,000¿ø");
		menu1.add("±èÄ¡µ·±î½º   8,000¿ø");

		List<String> menu2 = new ArrayList<String>(); // µ¤¹ä
		menu2.add("±èÄ¡ººÀ½¹ä   6,000¿ø");
		menu2.add("¼ÛÀÌººÀ½¹ä   6,000¿ø");
		menu2.add("¿ÀÂ¡¾îµ¤¹ä   6,000¿ø");
		menu2.add("Á¦À°µ¤¹ä   6,000¿ø");
		menu2.add("³«Áöµ¤¹ä   6,000¿ø");
		menu2.add("ÇØ¹°ººÀ½¹ä   7,000¿ø");

		List<String> menu3 = new ArrayList<String>(); // Á¤½Ä
		menu3.add("Á¤½ÄA(ÇÔ¹Ú½ºÅ×ÀÌÅ©+¿Õµ·±î½º+Ä¡Áîµ·±î½º+»ı¼±±î½º)   9,000¿ø");
		menu3.add("Á¤½ÄB(ÇÔ¹Ú½ºÅ×ÀÌÅ©+ÇÇÀÚµ·±î½º+Ä¡Áîµ·±î½º+±èÄ¡µ·±î½º+»ı¼±±î½º+¿Õ»õ¿ìÆ¢±è)   12,000¿ø");

		List<String> menu4 = new ArrayList<String>(); // ¸ğµÒ( ¸ğµëA¾øÀ½ ) ¹è´ŞÅë¿¡¼­ ÂüÁ¶ÇÔ
		menu4.add("¸ğµëB(ÇÇÀÚµ·±î½º+Ä¡Áîµ·±î½º+»ı¼±±î½º)   9,000¿ø");
		menu4.add("¸ğµëC(ÇÇÀÚµ·±î½º+±èÄ¡µ·±î½º+¿Õ»õ¿ìÈÄ¶óÀÌ)   9,000¿ø");
		menu4.add("¸ğµëD(ÇÔ¹Ú½ºÅ×ÀÌÅ©+ÇÇÀÚµ·±î½º+Ä¡Áîµ·±î½º+»ı¼±±î½º)   10,000¿ø");

		List<String> menu5 = new ArrayList<String>(); // ¼¼Æ®¸Ş´º
		menu5.add("¿Õµ·±î½º+±èÄ¡ººÀ½¹ä   9,000¿ø");
		menu5.add("ÇÔ¹Ú½ºÅ×ÀÌÅ©+±èÄ¡ººÀ½¹ä   10,000¿ø");
		menu5.add("ÇÇÀÚµ·±î½º+±èÄ¡ººÀ½¹ä   10,000¿ø");
		menu5.add("Ä¡Áîµ·±î½º+±èÄ¡ººÀ½¹ä   10,000¿ø");
		menu5.add("±èÄ¡µ·±î½º+±èÄ¡ººÀ½¹ä   10,000¿ø");

		List<String> menu6 = new ArrayList<String>(); // ¾ÈÁÖ·ù
		menu6.add("°ñ¹ğÀÌ¹«Ä§¼Ò¸é   15,000¿ø");
		menu6.add("³«ÁöººÀ½¼Ò¸é   15,000¿ø");
		menu6.add("»ı¼±±î½º¾ÈÁÖ   15,000¿ø");
		menu6.add("µ·±î½º¾ÈÁÖ   15,000¿ø");
		menu6.add("¿Õ»õ¿ì¾ÈÁÖ   15,000¿ø");
		menu6.add("½ºÆä¼È¾ÈÁÖ   20,000¿ø");
		menu6.add("ÇÔ¹Ú¾ÈÁÖ   15,000¿ø");

		listDataChild.put(listDataHeader.get(0), menu1); // Header, Child data
		listDataChild.put(listDataHeader.get(1), menu2);
		listDataChild.put(listDataHeader.get(2), menu3);
		listDataChild.put(listDataHeader.get(3), menu4);
		listDataChild.put(listDataHeader.get(4), menu5);
		listDataChild.put(listDataHeader.get(5), menu6);

	}

}
