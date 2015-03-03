package example.hungrystudent2;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
public class Loading extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.loading);
		
		Handler handler = new Handler(){
			public void handleMessage(Message msg){
				Intent intent = new Intent(getApplicationContext(),MainActivity.class);
				startActivity(intent);
				finish();
			}
		};
		handler.sendEmptyMessageDelayed(0, 3000);
	}
}
