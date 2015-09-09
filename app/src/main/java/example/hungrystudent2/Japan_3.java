package example.hungrystudent2;

import java.util.*;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.*;

public class Japan_3 extends Activity {
	ExpandableListAdapter listAdapter;
	ExpandableListView expListView;
	List<String> listDataHeader;
	HashMap<String, List<String>> listDataChild;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.japan_3);

		ImageButton a = (ImageButton) findViewById(R.id.call_japanese3);

		a.setOnClickListener(new ImageButton.OnClickListener() {

			@Override
			public void onClick(View v) {
				startActivity(new Intent("android.intent.action.CALL", Uri
						.parse("tel:042-825-2545")));

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
		listDataHeader.add("라이스 도시락");
		listDataHeader.add("돈까스 도시락");
		listDataHeader.add("우동/메밀 도시락");
		listDataHeader.add("세트메뉴");
		

		// Adding child data
		List<String> menu1 = new ArrayList<String>(); // 라이스 도시락
		menu1.add("토마토오므라이스  6,000원");
		menu1.add("쫄깃오징어덮밥  6,000원");
		menu1.add("매콤제육덮밥  6,000원");
		menu1.add("소불고기덮밥  6,000원");
		menu1.add("쫄깃오징어제육볶음  6,500원");
		menu1.add("새우날치알비빔밥  6,500원");
		menu1.add("매콤닭갈비야채덮밥  7,500원");
		menu1.add("어니언떡갈비오므라이스  8,000원");

		List<String> menu2 = new ArrayList<String>(); // 돈까스 도시락
		menu2.add("수제고로케(4개)   5,000원");
		menu2.add("수제등심돈까스   7,000원");
		menu2.add("치킨까스(순한맛/매운맛)   7,500원");
		menu2.add("매콤돈까스   7,500원");
		menu2.add("함박스테이크(순한맛/매운맛)   8,000원");
		menu2.add("모짜렐라치즈돈까스   8,000원");
		menu2.add("고구마치즈돈까스   8,000원");
		menu2.add("단호박치즈롤   8,000원");
		menu2.add("피자돈까스   8,000원");
		menu2.add("김치치즈돈까스   8,500원");
		




		
		List<String> menu3 = new ArrayList<String>(); // 우동/메밀 도시락
		menu3.add("유부우동   4,500원");
		menu3.add("생생어묵우동   5,000원");
		menu3.add("얼큰김치우동   5,000원");
		menu3.add("김치어묵우동   5,500원");
		menu3.add("야채비빔모밀   6,000원");
		menu3.add("일식판모밀   6,000원");
		menu3.add("매콤닭갈비철판볶음우동   7,000원");
		
		List<String> menu4 = new ArrayList<String>(); // 세트메뉴
		menu4.add("와우set1(등심돈까스+매콤제육볶음)   12,500원");
		menu4.add("와우set2(등심돈까스+쫄깃오징어볶음)   12,500원");
		menu4.add("와우set3(등심돈까스+소불고기볶음)   12,500원");
		menu4.add("알뜰set1(등심돈까스+유부우동+수제고로케)   16,000원");
		menu4.add("알뜰set2(치즈돈까스+김치어묵우동+수제고로케)   18,000원");
		menu4.add("가족set1(등심돈까스+고구마치즈돈까스+얼큰김치우동+수제고로케)   24,500원");
		menu4.add("가족set2(등심돈까스+함박스테이크+김치어묵우동+토마토오므라이스)   26,000원");
		menu4.add("가족set3(등심돈까스+치즈돈까스+얼큰김치우동+매콤닭갈비야채덮밥)   27,000원");


		listDataChild.put(listDataHeader.get(0), menu1); // Header, Child data
		listDataChild.put(listDataHeader.get(1), menu2);
		listDataChild.put(listDataHeader.get(2), menu3);
		listDataChild.put(listDataHeader.get(3), menu4);
		
	}
}
