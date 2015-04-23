package example.hungrystudent2;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class SuperSnack extends Activity{
	private String[] Names = { 
			"½Å¶±(Ãæ³²´ëÁ¡)","µ¿´ë¹®¿±±â¶±ººÀÌ","½Å°¡³×¸Å¿î¶±ººÀÌ"};
	
	private AdapterView.OnItemClickListener mItemClickListener = new AdapterView.OnItemClickListener() {
		@Override
		public void onItemClick(AdapterView<?> parent, View v, int position,
				long id) {
			String name = (String) parent.getItemAtPosition(position);

			if (name.equals("½Å¶±(Ãæ³²´ëÁ¡)")) {
				Intent intent = new Intent(SuperSnack.this, Snack_1.class);
				startActivity(intent);
			}
			else if(name.equals("µ¿´ë¹®¿±±â¶±ººÀÌ")) {
				Intent intent = new Intent(SuperSnack.this, Snack_2.class);
				startActivity(intent);
			}
			else if(name.equals("½Å°¡³×¸Å¿î¶±ººÀÌ")) {
				Intent intent = new Intent(SuperSnack.this, Snack_3.class);
				startActivity(intent);
			}
		};
	};
	protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.supersnack);
        
        ListView list = (ListView) findViewById(R.id.NameListOfSnack); // ¸®½ºÆ®ºä

		ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(
				getApplicationContext(), R.layout.listviewlayout, Names);
		list.setAdapter(arrayAdapter);// ¾î´ðÅÍ¿Í ¸®½ºÆ®ºä ¿¬°á!
		list.setOnItemClickListener(mItemClickListener);// ¾î´ðÅÍ¿¡ Å¬¸¯¸®½º³Ê ÅõÀÔ
	}
}