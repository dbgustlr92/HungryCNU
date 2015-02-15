package example.hungrystudent2;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Pizza_4 extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.pizza_4);
		
		ImageButton a = (ImageButton)findViewById(R.id.call_pizza4);

        a.setOnClickListener(new ImageButton.OnClickListener(){

			@Override
			public void onClick(View v) {
				startActivity(new Intent("android.intent.action.CALL",Uri.parse("tel:042-824-8210")));
				
			}
        	
        });
	}
}
