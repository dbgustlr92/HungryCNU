package example.hungrystudent2;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class SuperChicken extends Activity {

	private String[] Names = { // ������ �̸� ������ ��
	"BHCġŲ", "�丮ī��", "�̽����Ĵ�", "��ġŲ", "��ǳ���´�", "���ġŲ", "�����̱Ⱑ����", "���ġŲ",
			"Ƽ�ٵθ���ġŲ", "ġ���Ĵ�", "��ȣ��ġŲ", "����ġŲ", "�Ƕ���ġŲ", "BBQġŲ", "������ġŲ",
			"ȣ���̵θ���ġŲ", "���л�ġŲ", "�׳�ġŲ" ,"�����Ĵ�"};

	private AdapterView.OnItemClickListener mItemClickListener = new AdapterView.OnItemClickListener() {
		@Override
		public void onItemClick(AdapterView<?> parent, View v, int position,
				long id) {
			String name = (String) parent.getItemAtPosition(position);

			if (name.equals("BHCġŲ")) {
				Intent intent = new Intent(SuperChicken.this, Chicken_1.class);
				startActivity(intent);
			} else if (name.equals("�丮ī��")) {
				Intent intent = new Intent(SuperChicken.this, Chicken_2.class);
				startActivity(intent);
			} else if (name.equals("�̽����Ĵ�")) {
				Intent intent = new Intent(SuperChicken.this, Chicken_3.class);
				startActivity(intent);
			} else if (name.equals("��ġŲ")) {
				Intent intent = new Intent(SuperChicken.this, Chicken_4.class);
				startActivity(intent);
			} else if (name.equals("��ǳ���´�")) {
				Intent intent = new Intent(SuperChicken.this, Chicken_5.class);
				startActivity(intent);
			} else if (name.equals("���ġŲ")) {
				Intent intent = new Intent(SuperChicken.this, Chicken_6.class);
				startActivity(intent);
			} else if (name.equals("�����̱Ⱑ����")) {
				Intent intent = new Intent(SuperChicken.this, Chicken_7.class);
				startActivity(intent);
			} else if (name.equals("���ġŲ")) {
				Intent intent = new Intent(SuperChicken.this, Chicken_8.class);
				startActivity(intent);
			} else if (name.equals("Ƽ�ٵθ���ġŲ")) {
				Intent intent = new Intent(SuperChicken.this, Chicken_9.class);
				startActivity(intent);
			} else if (name.equals("ġ���Ĵ�")) {
				Intent intent = new Intent(SuperChicken.this, Chicken_10.class);
				startActivity(intent);
			} else if (name.equals("��ȣ��ġŲ")) {
				Intent intent = new Intent(SuperChicken.this, Chicken_11.class);
				startActivity(intent);
			} else if (name.equals("����ġŲ")) {
				Intent intent = new Intent(SuperChicken.this, Chicken_12.class);
				startActivity(intent);
			} else if (name.equals("�Ƕ���ġŲ")) {
				Intent intent = new Intent(SuperChicken.this, Chicken_13.class);
				startActivity(intent);
			} else if (name.equals("BBQġŲ")) {
				Intent intent = new Intent(SuperChicken.this, Chicken_14.class);
				startActivity(intent);
			} else if (name.equals("������ġŲ")) {
				Intent intent = new Intent(SuperChicken.this, Chicken_15.class);
				startActivity(intent);
			} else if (name.equals("ȣ���̵θ���ġŲ")) {
				Intent intent = new Intent(SuperChicken.this, Chicken_16.class);
				startActivity(intent);
			} else if (name.equals("���л�ġŲ")) {
				Intent intent = new Intent(SuperChicken.this, Chicken_17.class);
				startActivity(intent);
			} else if (name.equals("�׳�ġŲ")) {
				Intent intent = new Intent(SuperChicken.this, Chicken_18.class);
				startActivity(intent);
			}else if (name.equals("�����Ĵ�")) {
				Intent intent = new Intent(SuperChicken.this, Chicken_19.class);
				startActivity(intent);
			}
		};

	};

	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.superchicken);

		ListView list = (ListView) findViewById(R.id.NameListOfchicken); // ����Ʈ��

		ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(
				getApplicationContext(), R.layout.listviewlayout, Names);
		list.setAdapter(arrayAdapter);// ����Ϳ� ����Ʈ�� ����!
		list.setOnItemClickListener(mItemClickListener);// ����Ϳ� Ŭ�������� ����

	}
}
