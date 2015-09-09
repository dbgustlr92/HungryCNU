package example.hungrystudent2;

import java.util.*;

import android.app.*;
import android.content.*;
import android.net.*;
import android.os.*;
import android.view.*;
import android.widget.*;

public class Fastfood_1 extends Activity{
	ExpandableListAdapter listAdapter;
	ExpandableListView expListView;
	List<String> listDataHeader;
	HashMap<String, List<String>> listDataChild;

	protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fastfood_1);
        ImageButton a = (ImageButton)findViewById(R.id.call_fastfood1);

        a.setOnClickListener(new ImageButton.OnClickListener(){

			@Override
			public void onClick(View v) {
				startActivity(new Intent("android.intent.action.CALL",Uri.parse("tel:042-825-9259")));
				
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
		listDataHeader.add("버거메뉴");
		listDataHeader.add("사이드메뉴");
		listDataHeader.add("치킨");
		listDataHeader.add("홈배달 세트메뉴");


		
		// Adding child data
		List<String> menu1 = new ArrayList<String>();
		menu1.add("1,5000원 이상 구매시 배달가능합니다.");
		menu1.add("싸이버거 단품 3,200원");
		menu1.add("싸이버거 세트 5,400원");
		menu1.add("핫플러스 통살버거 단품 4,000원");
		menu1.add("핫플러스 통살버거 세트 6,200원");
		menu1.add("핫플러스 통가슴살버거 단품 4,000원");
		menu1.add("핫플러스 통가슴살버거 세트 6,200원");
		menu1.add("케이준말고 통살버거 단품 3,700원");
		menu1.add("케이준말고 통살버거 세트 5,900원");
		menu1.add("케이준말고 통가슴살버거 단품 3,700원");
		menu1.add("케이준말고 통가슴살버거 세트 5,900원");
		menu1.add("불고기버거 단품 2,800원");
		menu1.add("불고기버거 세트 5,000원");
		menu1.add("할라피뇨 통살버거 단품 3,700원");
		menu1.add("할라피뇨 통살버거 세트 5,900원");
		menu1.add("할라피뇨 통가슴살버거 단품 3,700원");
		menu1.add("할라피뇨 통가슴살버거 세트 5,900원");
		menu1.add("햄치즈 휠렛버거 단품 3,700원");
		menu1.add("햄치즈 휠렛버거 세트 5,900원");
		menu1.add("휠렛버거 단품 3,400원");
		menu1.add("휠렛버거 세트 5,600원");
		menu1.add("통새우버거 단품 2,700원");
		menu1.add("통새우버거 세트 4,900원");
		menu1.add("치킨치즈버거 단품 2,500원");
		menu1.add("치킨치즈버거 세트 4,700원");
		menu1.add("치킨버거 단품 2,200원");
		menu1.add("치킨버거 세트 4,400원");
		
		
		
		List<String> menu2 = new ArrayList<String>();
		menu2.add("맘스고구마치즈볼 2,500원");
		menu2.add("맘스후렌치콜 2,000원");
		menu2.add("맘스팝콘볼 2,500원");
		menu2.add("맘스치즈볼 2,500원");
		menu2.add("케이준양념감자 1,700원");
		menu2.add("치즈스틱(2조각) 1,600원");
		menu2.add("치킨샐러드 2,500원");
		menu2.add("텐더로인(2조각) 2,00원");
		menu2.add("새우 후라이드(2조각) 2,500원, 1set 11,000원");
		menu2.add("고구마/단오박/콘 샐러드 1,500원");
		menu2.add("휠랩 2,500원");

		List<String> menu3 = new ArrayList<String>();
		menu3.add("후라이드치킨 15,000원");
		menu3.add("후라이드반/양념반 16,000원");
		menu3.add("핫후라이드치킨 16,000원");
		menu3.add("핫후라이드반/양념반 17,000원");
		menu3.add("맘스양념치킨 16,000원");
		menu3.add("매운양념치킨 17,000원");
		menu3.add("순살치킨(안심) 15,000원");
		menu3.add("순살양념치킨 16,000원");
		menu3.add("데리야끼치킨 16,000원");
		menu3.add("순살데리야끼 16,000원(고소한맛,매운맛 선택)");
		menu3.add("케이준강정(팩) 16,000원");
		menu3.add("케이준강정(싱글) 3,000원");
		menu3.add("케이준강정(커플) 6,000원");
		
		
		List<String> menu4 = new ArrayList<String>();
		menu4.add("홈세트A: 순살치킨반마리(8조각)+싸이버거+케이준양념감자+콜라 500ml 13,000원");
		menu4.add("홈세트B: 순살치킨반마리+싸이버거+불고기버거+양념감자+콜라 500ml 15,000원");
		menu4.add("홈세트C: 순살치킨반마리+싸이버거+핫플러스통살버거+양념감자+콜라 500ml 17,000원");
		menu4.add("홈세트D: 순살치킨한마리(16조각)+싸이버거+양념감자+콜라 500ml 20,000원");
		menu4.add("홈세트E: 치킨한마리+싸이버거+통새우버거+양념감자+콜라 500ml 23,000원");
		menu4.add("홈세트F: 치킨한마리+통새우버거+불고기버거+양념감자+샐러드 택1+콜라 500ml 24,000원");
		menu4.add("홈세트G: 케이준강정(팩)+싸이버거+핫플레이스통살버거+치즈스틱+샐러드 택1+콜라 500ml 26,500원");
		
		
		
		listDataChild.put(listDataHeader.get(0), menu1); // Header, Child data
		listDataChild.put(listDataHeader.get(1), menu2);
		listDataChild.put(listDataHeader.get(2), menu3);
		listDataChild.put(listDataHeader.get(3), menu4);
	}

}
