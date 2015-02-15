package example.hungrystudent2;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Snack_2 extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.snack_2);
		
		  ImageButton a = (ImageButton)findViewById(R.id.call_snack2);

	        a.setOnClickListener(new ImageButton.OnClickListener(){

				@Override
				public void onClick(View v) {
					startActivity(new Intent("android.intent.action.CALL",Uri.parse("tel:042-826-9266")));
					
				}
	        	
	        });
	}
}
