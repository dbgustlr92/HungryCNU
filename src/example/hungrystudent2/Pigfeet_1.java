package example.hungrystudent2;

import java.util.*;

import android.app.*;
import android.content.*;
import android.net.*;
import android.os.*;
import android.view.*;
import android.widget.*;

public class Pigfeet_1 extends Activity{
/*	ExpandableListAdapter listAdapter;
	ExpandableListView expListView;
	List<String> listDataHeader;
	HashMap<String, List<String>> listDataChild;

	protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pigfeet_1);
        ImageButton a = (ImageButton)findViewById(R.id.call_pigfeet1);

        a.setOnClickListener(new ImageButton.OnClickListener(){

			@Override
			public void onClick(View v) {
				startActivity(new Intent("android.intent.action.CALL",Uri.parse("tel:042-824-1688")));
				
			}
        	
        });
        expListView = (ExpandableListView) findViewById(R.id.lvExp);

		// preparing list data
		prepareListData();

		listAdapter = new ExpandableListAdapter(this, listDataHeader,listDataChild);

		// setting list adapter
		expListView.setAdapter(listAdapter);
		
	}*/
	ExpandableListAdapter listAdapter;
	ExpandableListView expListView;
	List<String> listDataHeader;
	HashMap<String, List<String>> listDataChild;

	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.pigfeet_1);

		ImageButton a = (ImageButton) findViewById(R.id.call_pigfeet1);

		a.setOnClickListener(new ImageButton.OnClickListener() {
			@Override
			public void onClick(View v) {
				startActivity(new Intent("android.intent.action.CALL", Uri
						.parse("tel:042-824-1688")));
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
		listDataHeader.add("Á·¹ß");
		listDataHeader.add("º¸½Ó");
		listDataHeader.add("½ºÆä¼È ¸ðµë¼¼Æ®(¼­ºñ½º ÄÝ¶óÓÞ)");
		listDataHeader.add("Ãß°¡¸Þ´º");

		// Adding child data
		List<String> top250 = new ArrayList<String>();
		top250.add("¿ÀÇâÁ·¹ß ¾Ë¶ã¼¼Æ® á³           21,000¿ø");
		top250.add("¿ÀÇâÁ·¹ß ¾Ë¶ã¼¼Æ® ñé           26,000¿ø");
		top250.add("¿ÀÇâÁ·¹ß ¾Ë¶ã¼¼Æ® ÓÞ           31,000¿ø");
		top250.add("¿ÀÇâÁ·¹ß ¾Ë¶ã¼¼Æ® Æ¯ÓÞ        36,000¿ø");
		top250.add("¿ÀÇâÁ·¹ß á³                24,000¿ø");
		top250.add("¿ÀÇâÁ·¹ß ñé                28,000¿ø");
		top250.add("¿ÀÇâÁ·¹ß ÓÞ                34,000¿ø");
		top250.add("¿ÀÇâÁ·¹ß Æ¯ÓÞ             39,000¿ø");
		top250.add("¸ÅÄÞÁ·¹ß    34,000¿ø");
		top250.add("³ÃÃ¤Á·¹ß    34,000¿ø");

		List<String> nowShowing = new ArrayList<String>();
		nowShowing.add("¼ÖÀÙº¸½Ó á³                24,000¿ø");
		nowShowing.add("¼ÖÀÙº¸½Ó ñé                29,000¿ø");
		nowShowing.add("¼ÖÀÙº¸½Ó ÓÞ                34,000¿ø");
		nowShowing.add("¼ÖÀÙº¸½Ó Æ¯ÓÞ             39,000¿ø");

		List<String> comingSoon = new ArrayList<String>();
		comingSoon.add("½ºÆä¼È ¸ðµÒ¼¼Æ® á³(Á·¹ßá³ + º¸½Óá³)   46,000¿ø");
		comingSoon.add("½ºÆä¼È ¸ðµÒ¼¼Æ® ñé(Á·¹ßñé + º¸½Óñé)   56,000¿ø");
		comingSoon.add("½ºÆä¼È ¸ðµÒ¼¼Æ® ÓÞ(Á·¹ßÓÞ + º¸½ÓÓÞ)   66,000¿ø");
		comingSoon.add("Ä¿ÇÃ¼¼Æ® 	34,000¿ø");

		
		List<String> lastMenu = new ArrayList<String>();
		lastMenu.add("Àï¹Ý±¹¼öÓÞ           13,000¿ø");
		lastMenu.add("Àï¹Ý±¹¼öñé           10,000¿ø");
		lastMenu.add("Àï¹Ý±¹¼ö	1ìÑ       4,000¿ø");
		lastMenu.add("º¹ºÐÀÚ¿ÍÀÎ  3,000¿ø");
		lastMenu.add("ÄÝ¶óá³   1,000¿ø");
		lastMenu.add("ÄÝ¶óÓÞ   2,000¿ø");
		lastMenu.add("°ø±â¹ä   1,000¿ø");
		lastMenu.add("¼Ó±èÄ¡   2,000¿ø");
		
		
		listDataChild.put(listDataHeader.get(0), top250); // Header, Child data
		listDataChild.put(listDataHeader.get(1), nowShowing);
		listDataChild.put(listDataHeader.get(2), comingSoon);
		listDataChild.put(listDataHeader.get(3), lastMenu);
	}

}
