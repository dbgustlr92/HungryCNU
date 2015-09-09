package example.hungrystudent2;

import java.util.*;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.*;

public class Japan_1 extends Activity{
	ExpandableListAdapter listAdapter;
	ExpandableListView expListView;
	List<String> listDataHeader;
	HashMap<String, List<String>> listDataChild;

	
	protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.japan_1);
        ImageButton a = (ImageButton)findViewById(R.id.call_japanese1);

        a.setOnClickListener(new ImageButton.OnClickListener(){

			@Override
			public void onClick(View v) {
				startActivity(new Intent("android.intent.action.CALL",Uri.parse("tel:042-862-8805")));
				
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
		listDataHeader.add("¼¼Æ®¸Þ´º");
		listDataHeader.add("µ¤¹ä");
		listDataHeader.add("¸é·ù");

		
		// Adding child data
		List<String> menu1 = new ArrayList<String>();	//¼¼Æ®¸Þ´º
		menu1.add("A.ÂüÄ¡¼¼Æ®(ÂüÄ¡á³+¿ìµ¿ñé)  7,000¿ø");
		menu1.add("B.Å©·¦¼¼Æ®(Å©·¦á³+¿ìµ¿ñé)  7,000¿ø");
		menu1.add("C.ÇØ¹°¼¼Æ®(ÇØ¹°á³+¿ìµ¿ñé)  7,000¿ø");
		menu1.add("D.¿¬¾î¼¼Æ®(¿¬¾îá³+¿ìµ¿ñé)  7,000¿ø");
		menu1.add("E.µµ¹Ì¼¼Æ®(µµ¹Ìá³+¿ìµ¿ñé)  7,000¿ø");	
		menu1.add("F.»õ¿ì¼¼Æ®(»õ¿ìá³+¿ìµ¿ñé)  7,000¿ø");	
		menu1.add("G.±¤¾î¼¼Æ®(±¤¾îá³+¿ìµ¿ñé)  9,000¿ø");	
		menu1.add("H.Àå¾î¼¼Æ®(Àå¾îá³+¿ìµ¿ñé)  10,000¿ø");	
		
		List<String> menu2 = new ArrayList<String>();	//µ¤¹ä
		menu2.add("ÂüÄ¡È¸µ¤¹ä   5,000¿ø");
		menu2.add("ÂüÄ¡È¸µ¤¹äÓÞ   6,000¿ø");
		menu2.add("Å©·¦µ¤¹ä   5,000¿ø");
		menu2.add("Å©·¦µ¤¹äÓÞ   7,000¿ø");
		menu2.add("ÇØ¹°µ¤¹ä   5,000¿ø");
		menu2.add("ÇØ¹°µ¤¹äÓÞ   7,000¿ø");
		menu2.add("¿¬¾îÈ¸µ¤¹ä   5,000¿ø");
		menu2.add("¿¬¾îÈ¸µ¤¹äÓÞ   7,000¿ø");
		menu2.add("µµ¹ÌÈ¸µ¤¹ä   5,000¿ø");
		menu2.add("µµ¹ÌÈ¸µ¤¹äÓÞ   7,000¿ø");
		menu2.add("¾Ë¹ä/»õ¿ì µ¤¹ä   7,000¿ø");
		menu2.add("±¤¾îÈ¸µ¤¹ä   9,000¿ø");
		menu2.add("Àå¾îµ¤¹ä   10,000¿ø");

		List<String> menu3 = new ArrayList<String>();	//¸é·ù
		menu3.add("¿ìµ¿   5,000¿ø");
		menu3.add("³Ã¿ìµ¿   6,000¿ø");
		
		
		listDataChild.put(listDataHeader.get(0), menu1); // Header, Child data
		listDataChild.put(listDataHeader.get(1), menu2);
		listDataChild.put(listDataHeader.get(2), menu3);
	
	}

}
