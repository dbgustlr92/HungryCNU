package example.hungrystudent2;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class SuperKorean extends Activity{
	private String[] Names = { // ÇÇÀÚÁý ÀÌ¸§ ³ÖÀ¸¸é µÊ
			"±è¹ä³ª¶ó(ºÀ¸íÁ¡)","24½Ã¹ä¼¥","¶óÀÌ½º½ºÅä¸®","µµ±úºñ±è¹ä"};
	
	private AdapterView.OnItemClickListener mItemClickListener = new AdapterView.OnItemClickListener() {
		@Override
		public void onItemClick(AdapterView<?> parent, View v, int position,
				long id) {
			String name = (String) parent.getItemAtPosition(position);

			if (name.equals("±è¹ä³ª¶ó(ºÀ¸íÁ¡)")) {
				Intent intent = new Intent(SuperKorean.this, Korean_1.class);
				startActivity(intent);
			}
			else if(name.equals("24½Ã¹ä¼¥")) {
				Intent intent = new Intent(SuperKorean.this, Korean_2.class);
				startActivity(intent);
			}
			else if(name.equals("¶óÀÌ½º½ºÅä¸®")) {
				Intent intent = new Intent(SuperKorean.this, Korean_3.class);
				startActivity(intent);
			}
			else if(name.equals("µµ±úºñ±è¹ä")) {
				Intent intent = new Intent(SuperKorean.this, Korean_4.class);
				startActivity(intent);
			}
		};
	};
	protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.superkorean);
        
        
        ListView list = (ListView) findViewById(R.id.NameListOfKorean); // ¸®½ºÆ®ºä

		ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(
				getApplicationContext(), R.layout.listviewlayout, Names);
		list.setAdapter(arrayAdapter);// ¾î´ðÅÍ¿Í ¸®½ºÆ®ºä ¿¬°á!
		list.setOnItemClickListener(mItemClickListener);// ¾î´ðÅÍ¿¡ Å¬¸¯¸®½º³Ê ÅõÀÔ
	}
}