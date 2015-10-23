package example.hungrystudent2;

import java.util.*;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.*;

public class Korean_1 extends Activity {		//김밥나라(봉명점)
	ExpandableListAdapter listAdapter;
	ExpandableListView expListView;
	List<String> listDataHeader;
	HashMap<String, List<String>> listDataChild;




	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.korean_1);
		ImageButton a = (ImageButton) findViewById(R.id.call_korean1);

		a.setOnClickListener(new ImageButton.OnClickListener() {

			@Override
			public void onClick(View v) {
				startActivity(new Intent("android.intent.action.CALL", Uri
						.parse("tel:042-822-5442")));

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
		listDataHeader.add("김밥");
		listDataHeader.add("양식");
		listDataHeader.add("식사");
		listDataHeader.add("초밥");
		listDataHeader.add("죽");
		listDataHeader.add("분식");
		listDataHeader.add("위치보기");
		//listDataHeader.add("기타");
		
		
		// Adding child data
		List<String> menu1 = new ArrayList<String>(); // 김밥
		menu1.add("원조김밥 1,500원");
		menu1.add("참치김밥 2,500원");
		menu1.add("치즈김밥 3,000원");
		menu1.add("김치김밥 3,000원");
		menu1.add("소고기김밥 3,000원");
		menu1.add("간장고추김밥 3,000원");
		menu1.add("땡초김밥 3,000원");
		menu1.add("누드김밥 3,000원");
		menu1.add("참치치즈김밥 3,500원");
		menu1.add("계란말이김밥 3,500원");
		menu1.add("참치땡초김밥 3,500원");
		menu1.add("야채샐러드김밥 3,500원");
		menu1.add("날치알김밥 3,500원");
		menu1.add("참치계란말이김밥 4,000원");
		menu1.add("날치알김치김밥 4,000원");
		
		
		
		List<String> menu2 = new ArrayList<String>(); // 양식
		menu2.add("돈까스 6,000원");
		menu2.add("생선까스 6,000원");
		menu2.add("생과일돈까스 6,000원");
		menu2.add("치킨돈까스 6,500원");
		menu2.add("카레돈까스 6,500원");
		menu2.add("피자돈까스스테이크 7,000원");
		menu2.add("고구마치즈스테이크 7,000원");
		menu2.add("치즈스테이크 7,000원");
		menu2.add("함박스테이크 7,000원");
		menu2.add("안심돈까스 7,500원");
		menu2.add("치즈치킨까스 7,500원");
		menu2.add("카레치즈돈까스 7,500원");
		menu2.add("생과일치즈돈까스 7,500원");
		menu2.add("스페샬 특정식(돈까스+쫄면+김밥+생선까스+초밥) 8,500원");
		
		List<String> menu3 = new ArrayList<String>();	//식사
		menu3.add("공기밥 1,000원");
		menu3.add("김치덮밥 5,500원");
		menu3.add("제육덮밥 5,500원");
		menu3.add("참치김치덮밥 5,500원");
		menu3.add("비빔밥 5,500원");
		menu3.add("카레덮밥 5,500원");
		menu3.add("잡채밥 5,500원");
		menu3.add("된장찌개 5,500원");
		menu3.add("김치찌개 5,500원");
		menu3.add("참치찌개 5,500원");
		menu3.add("순두부찌개 5,500원");
		menu3.add("오뎅김치찌개 5,500원");
		menu3.add("청국장 5,500원");
		menu3.add("콩나물국 5,500원");
		menu3.add("미역국 5,500원");
		menu3.add("김치국 5,500원");
		menu3.add("누룽지탕 5,500원");
		menu3.add("오징어덮밥 6,000원");
		menu3.add("오므라이스 6,000원");
		menu3.add("김치볶음밥 6,000원");
		menu3.add("쭈꾸미덮밥 6,000원");
		menu3.add("소불고기덮밥 6,000원");
		menu3.add("참치김치볶음밥 6,000원");
		menu3.add("새우볶음밥 6,000원");
		menu3.add("해물볶음밥 6,000원");
		menu3.add("오삼김치볶음밥 6,000원");
		menu3.add("보리밥(된장국포함) 6,000원");
		menu3.add("콩나물비빔밥 6,000원");
		menu3.add("돌솥비빔밥 6,000원");
		menu3.add("아욱국 6,000원");
		menu3.add("시금치된장국 6,000원");
		menu3.add("올갱이해장국 6,000원");
		menu3.add("바지락미역국 6,000원");
		menu3.add("육개장 6,000원");
		menu3.add("낙지덮밥 6,500원");
		menu3.add("쭈삼볶음밥 6,500원");
		menu3.add("치즈돌솥비빔밥 6,500원");
		menu3.add("우렁된장찌개 6,500원");
		menu3.add("고등어김치조림 6,500원");
		menu3.add("소뼈해장국 6,500원");
		menu3.add("갈비탕 6,500원");
		menu3.add("황태탕 6,500원");
		menu3.add("설렁탕 6,500원");
		menu3.add("유부오뎅탕 6,500원");
		menu3.add("돌솥김치치즈볶음밥 7,000원");
		menu3.add("한방반계탕(공기밥포함) 7,000원");
		menu3.add("촌돼지찌개(2인이상배달) 7,000원");
		menu3.add("부대찌개 7,500원");
		menu3.add("돌솥참치김치치즈볶음밥 7,500원");
		menu3.add("제육쌈밥정식(2인이상배달) 7,500원");
		menu3.add("알밥 7,500원");
		menu3.add("뚝배기동태찌개 7,500원");
		menu3.add("뚝배기소불고기 7,500원");
		menu3.add("삼계닭죽 8,000원");
		menu3.add("뚝배기감자탕 8,000원");
		menu3.add("뚝배기갈비찜 9,000원");
		menu3.add("한방삼계탕 11,000원");
		
		List<String> menu4 = new ArrayList<String>();	//초밥
		menu4.add("유부초밥 6,000원");
		menu4.add("도미초밥 7,000원");
		menu4.add("연어장어초밥 7,000원");
		menu4.add("한치초밥 7,000원");
		menu4.add("참치회초밥 7,000원");
		menu4.add("새우문어초밥 7,000원");
		menu4.add("특모듬초밥 12,000원");
		
		
		List<String> menu5 = new ArrayList<String>();	//죽
		menu5.add("호박죽 6,000원");
		menu5.add("단팥죽 6,000원");
		menu5.add("소고기야채죽 6,000원");
		menu5.add("전복죽 8,000원");
		
		List<String> menu6 = new ArrayList<String>();	//분
		menu6.add("고기만두 3,500원");
		menu6.add("김치만두 3,500원");
		menu6.add("라면 3,500원");
		menu6.add("오뎅 4,000원");
		menu6.add("우동 4,000원");
		menu6.add("계란라면 4,000원");
		menu6.add("만두라면 4,000원");
		menu6.add("치즈라면 4,000원");
		menu6.add("김치라면 4,000원");
		menu6.add("감자라면 4,000원");
		menu6.add("고기(김치)왕만두 4,000원");
		menu6.add("김치우동 4,500원");
		menu6.add("유부우동 4,500원");
		menu6.add("떡만두라면 4,500원");
		menu6.add("떡볶이 4,500원");
		menu6.add("짬뽕라면 5,000원");
		menu6.add("해장라면 5,000원");
		menu6.add("쫄면 5,000원");
		menu6.add("치즈떡볶이 5,000원");
		menu6.add("라볶이 5,000원");
		menu6.add("짜장떡볶이 5,000원");
		menu6.add("잔치국수 5,000원");
		menu6.add("치즈라볶이 5,500원");
		menu6.add("매운짜장떡볶이 5,500원");
		menu6.add("떡국 5,500원");
		menu6.add("만둣국 5,500원");
		menu6.add("떡만둣국 5,500원");
		menu6.add("칼국수 5,500원");
		menu6.add("김치칼국수 5,500원");
		menu6.add("얼큰이칼국수 5,500원");
		menu6.add("해물칼국수 5,500원");
		menu6.add("손수제비 5,500원");
		menu6.add("김치수제비 5,500원");
		menu6.add("얼큰(해물)수제비 5,500원");
		menu6.add("감자수제비 5,500원");
		menu6.add("비빔(열무)국수 5,500원");
		menu6.add("열무(김치)비빔국수 5,500원");
		menu6.add("물냉면 5,500원");
		menu6.add("비빔냉면 5,500원");
		menu6.add("열무냉면 5,500원");
		menu6.add("메밀소바 5,500원");
		menu6.add("해물볶음우동 6,000원");
		menu6.add("비빔만두(쫄면+만두) 6,000원");
		menu6.add("야채비빔만두 6,000원");
		menu6.add("멧돌콩국수 6,000원");
		menu6.add("열무비빔냉면 6,000원");
		menu6.add("해물스파게티 6,000원");
		menu6.add("치즈오븐스파게티 6,000원");
		menu6.add("길쌈냉면 7,000원");
		menu6.add("길쌈비빔냉면 7,500원");
		menu6.add("길쌈고기추가 2,500원");
		menu6.add("해물크림스파게티 7,000원");
		
		
		
		/*List<String> menu7 = new ArrayList<String>();	//
		menu7.add("������������(2��)   20,000��");
		menu7.add("������������(3��)   25,000��");
		menu7.add("�ҳ�����(2��)   19,000��");
		menu7.add("�ҳ������(3��)   24,000��");
		menu7.add("�ҳ������(4��)   30,000��");
		menu7.add("��������(2��)   19,000��");
		menu7.add("���������(3��)   24,000��");
		menu7.add("���������(4��)   30,000��");
		menu7.add("�����(2��)   19,000��");
		menu7.add("������(3��)   24,000��");
		menu7.add("������(4��)   30,000��");
		menu7.add("�δ���(2��)   16,000��");
		menu7.add("�δ����(3��)   22,000��");
		menu7.add("�δ����(4��)   27,000��");
		menu7.add("������(2��)   16,000��");
		menu7.add("�������(3��)   22,000��");
		menu7.add("�������(4��)   27,000��");
		menu7.add("�κε����η�ġ���(2��)   14,000��");
		menu7.add("�κε����η�ġ����(3��)   19,000��");
		menu7.add("�κε����η�ġ����(4��)   25,000��");
		menu7.add("�����������η�ġ���(2��)   17,000��");
		menu7.add("�����������η�ġ����(3��)   22,000��");
		menu7.add("�����������η�ġ����(4��)   27,000��");
		menu7.add("��¡��η�ġ���(2��)   16,000��");
		menu7.add("��¡��η�ġ����(3��)   21,000��");
		menu7.add("��¡��η�ġ����(4��)   25,000��");
		menu7.add("�����η�ġ���(2��)   18,000��");
		menu7.add("�����η�ġ����(3��)   23,000��");
		menu7.add("�����η�ġ����(4��)   27,000��");
		menu7.add("�޻�η�ġ����(3��)   20,000��");
		menu7.add("�޻�η�ġ����(4��)   25,000��");
		menu7.add("�ߵ������(2��)   22,000��");
		menu7.add("�ߵ�������(3��)   27,000��");
		menu7.add("�ߵ�������(4��)   31,000��");
		menu7.add("�������(2��)   20,000��");
		menu7.add("��������(3��)   27,000��");
		menu7.add("��������(4��)   32,000��");
		menu7.add("�ع����(2��)   22,000��");
		menu7.add("�ع�����(3��)   27,000��");
		menu7.add("�ع�����(4��)   32,000��");
		menu7.add("�������   12,000��");
		menu7.add("�κα�ġ   13,000��");
		menu7.add("����´߹�   15,000��");
		menu7.add("����̻縮   15,000��");
		menu7.add("�������似Ʈ   6,000��");
		menu7.add("���α����似Ʈ   6,000��");
		menu7.add("�����α����似Ʈ   6,000��");*/


		
		listDataChild.put(listDataHeader.get(0), menu1); // Header, Child data
		listDataChild.put(listDataHeader.get(1), menu2);
		listDataChild.put(listDataHeader.get(2), menu3);
		listDataChild.put(listDataHeader.get(3), menu4);
		listDataChild.put(listDataHeader.get(4), menu5);
		listDataChild.put(listDataHeader.get(5), menu6);
		//listDataChild.put(listDataHeader.get(6), menu7);

	}

}
