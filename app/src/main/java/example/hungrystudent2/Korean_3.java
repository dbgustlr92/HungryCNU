package example.hungrystudent2;

import java.util.*;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.*;

public class Korean_3 extends Activity {	//도깨비 김밥
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
		listDataHeader.add("김밥류");
		listDataHeader.add("찌개류");
		listDataHeader.add("분식류");
		listDataHeader.add("식사류");
		listDataHeader.add("돌솥류");
		listDataHeader.add("돈까스");

		// Adding child data
		List<String> menu1 = new ArrayList<String>(); // 김밥류
		menu1.add("웰빙김밥 1,500원");
		menu1.add("원조김밥 2,000원");
		menu1.add("참치김밥 2,500원");
		menu1.add("치즈김밥 2,500원");
		menu1.add("참치김치김밥 3,000원");

		List<String> menu2 = new ArrayList<String>(); // 찌개류
		menu2.add("김치찌개 4,000원");
		menu2.add("된장찌개 4,000원");
		menu2.add("순두부찌개 4,000원");
		menu2.add("참치찌개 4,500원");
		menu2.add("햄찌개 4,500원");

		List<String> menu3 = new ArrayList<String>(); // 분식류
		menu3.add("라면 2,500원");
		menu3.add("라면(밥) 3,000원");
		menu3.add("떡라면 3,000원");
		menu3.add("치즈라면 3,000원");
		menu3.add("만두라면 3,000원");
		menu3.add("순두부라면 3,500원");
		menu3.add("짬뽕라면 3,5000원");
		menu3.add("라볶이 3,5000원");
		menu3.add("떡볶이 3,500원");
		menu3.add("치즈라볶이 4,000원");
		menu3.add("참치라볶이 4,000원");
		menu3.add("떡만두 4,000원");
		menu3.add("떡국 4,000원");
		menu3.add("쫄면 4,000원");
		menu3.add("물냉면 4,000원");
		menu3.add("비빔냉면 4,000원");

		List<String> menu4 = new ArrayList<String>(); // 식사류
		menu4.add("도깨비도시락 4,000원");
		menu4.add("오므라이스 4,000원");
		menu4.add("오징어덮밥 4,000원");
		menu4.add("제육덮밥 4,000원");
		menu4.add("햄야채볶음밥 4,000원");
		menu4.add("김치볶음밥 4,000원");
		menu4.add("야채비빔밥 4,000원");
		menu4.add("참치비빔밥 4,000원");
		menu4.add("참치김치덮밥 4,500원");
		menu4.add("치킨덮밥 4,500원");
		menu4.add("오불덮밥 4,500원");
		menu4.add("참치볶음밥 4,500원");
		menu4.add("참치김치볶음밥 4,500원");
		menu4.add("해물볶음밥 4,500원");
		menu4.add("꼬꼬볶음밥 4,500원");
		menu4.add("쇠고기덮밥 5,000원");

		List<String> menu5 = new ArrayList<String>(); //돌솥류
		menu5.add("육개장 5,000원");
		menu5.add("돌솥비빔밥 5,000원");
		menu5.add("오불돌솥 5,000원");
		menu5.add("치킨돌솥 5,000원");
		menu5.add("낙지돌솥 5,000원");
		menu5.add("알밥 5,000원");
		menu5.add("김치알밥 5,000원");
		menu5.add("치즈알밥 5,000원");
		menu5.add("참치알밥 5,500원");
		menu5.add("뚝배기불고기 5,500원");

		List<String> menu6 = new ArrayList<String>(); // 돈까스
		menu6.add("순살돈까스 4,500원");
		menu6.add("치즈돈까스 5,000원");
		menu6.add("고구마돈까스 5,000원");
		menu6.add("피자돈까스 5,000원");
		menu6.add("단호박돈까스 5,000원");

		listDataChild.put(listDataHeader.get(0), menu1); // Header, Child data
		listDataChild.put(listDataHeader.get(1), menu2);
		listDataChild.put(listDataHeader.get(2), menu3);
		listDataChild.put(listDataHeader.get(3), menu4);
		listDataChild.put(listDataHeader.get(4), menu5);
		listDataChild.put(listDataHeader.get(5), menu6);

	}
}
