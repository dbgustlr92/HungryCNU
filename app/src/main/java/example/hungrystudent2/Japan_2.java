package example.hungrystudent2;

import java.util.*;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.*;

public class Japan_2 extends Activity {
	ExpandableListAdapter listAdapter;
	ExpandableListView expListView;
	List<String> listDataHeader;
	HashMap<String, List<String>> listDataChild;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.japan_2);
		ImageButton a = (ImageButton) findViewById(R.id.call_japanese2);

		a.setOnClickListener(new ImageButton.OnClickListener() {

			@Override
			public void onClick(View v) {
				startActivity(new Intent("android.intent.action.CALL", Uri
						.parse("tel:042-823-2001")));

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
		listDataHeader.add("세트메뉴");
		listDataHeader.add("실속 하프&하프");
		listDataHeader.add("정통돈까스류");
		listDataHeader.add("퓨전돈까스류");
		listDataHeader.add("볶음밥");
		listDataHeader.add("우동류");
		listDataHeader.add("알밥&덮밥류");
		listDataHeader.add("수바류");
		listDataHeader.add("기타메뉴");

		// Adding child data
		List<String> menu1 = new ArrayList<String>(); // 세트메뉴
		menu1.add("돈까애세트A(안심+치킨+새우+소우동)  10,000원");
		menu1.add("돈까애세트B(안심+생선+새우+소우동)  10,000원");
		menu1.add("돈까애세트C(코돈브르까스+소우동)  11,000원");

		List<String> menu2 = new ArrayList<String>(); // 실속 하프&하프
		menu2.add("히레+치킨까스   7,500원");
		menu2.add("히레+생선까스   7,500원");

		List<String> menu3 = new ArrayList<String>(); // 정통돈까스류
		menu3.add("치킨까스(가슴살)   7,000원");
		menu3.add("생선까스   7,000원");
		menu3.add("킹치킨까스(가슴살)   7,500원");
		menu3.add("히레까스(안심)   8,000원");
		menu3.add("로스까스(등심)   8,000원");
		menu3.add("킹돈까스(안심)   8,000원");

		List<String> menu4 = new ArrayList<String>(); // 퓨전돈까스류
		menu4.add("카라이칠리까스(매운 소스)   8,000원");
		menu4.add("하와이안칠리까스(매운,칠리 소스)   8,500원");
		menu4.add("고구마롤까스   9,000원");
		menu4.add("골든롤까스   10,000원");
		menu4.add("코돈브르까스(모짜렐라치즈)   10,000원");

		List<String> menu5 = new ArrayList<String>(); // 볶음밥
		menu5.add("치킨데리야끼볶음밥   6,000원");
		menu5.add("사천성볶음밥   6,000원");
		menu5.add("햄야채볶음밥   6,000원");
		menu5.add("새우볶음밥   6,000원");
		menu5.add("해물볶음밥   6,000원");
		menu5.add("김치볶음밥   6,000원");
		menu5.add("낙지라이스   6,000원");

		List<String> menu6 = new ArrayList<String>(); // 우동류
		menu6.add("사누끼우동   5,000원");
		menu6.add("만두우동   5,500원");
		menu6.add("어묵우동   5,500원");
		menu6.add("해물나베우동   6,000원");
		menu6.add("해물야끼우동   6,500원");

		List<String> menu7 = new ArrayList<String>(); // 알밥&덮밥류
		menu7.add("콩나물국밥   6,000원");
		menu7.add("크랩알밥   6,000원");
		menu7.add("제육덮밥   6,000원");
		menu7.add("돈부리   6,000원");

		List<String> menu8 = new ArrayList<String>(); // 수바류
		menu8.add("메밀소바   6,000원");
		menu8.add("특모밀소바   7,000원");

		List<String> menu9 = new ArrayList<String>(); // 기타메뉴
		menu9.add("생수   1,500원");
		menu9.add("치즈스틱   2,000원");
		menu9.add("소우동   2,000원");
		menu9.add("소주   2,500원");
		menu9.add("맥주   3,000원");
		menu9.add("콜라/사이다 小   1,500원");
		menu9.add("콜라/사이다 大   2,500원");

		listDataChild.put(listDataHeader.get(0), menu1); // Header, Child data
		listDataChild.put(listDataHeader.get(1), menu2);
		listDataChild.put(listDataHeader.get(2), menu3);
		listDataChild.put(listDataHeader.get(3), menu4);
		listDataChild.put(listDataHeader.get(4), menu5);
		listDataChild.put(listDataHeader.get(5), menu6);
		listDataChild.put(listDataHeader.get(6), menu7);
		listDataChild.put(listDataHeader.get(7), menu8);
		listDataChild.put(listDataHeader.get(8), menu9);
	}
}
