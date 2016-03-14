package com.bob.androidnative;


import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends Activity {

	
	EditText etValue1;
	EditText etValue2;
	EditText etResult;
	
	
	
	
	private native int add(int a, int b);
	private native int sub(int a, int b);
	private native int mul(int a, int b);
	private native int div(int a, int b);
	
	static {
		System.loadLibrary("calc");
	}
	
	int toInt(String strInfo) {
		return Integer.parseInt(strInfo);
	}
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		int result = add(1, 2);
		System.out.println("Muruga: " +result);
		
		etValue1 = (EditText) findViewById(R.id.etVal1);
		etValue2 = (EditText) findViewById(R.id.etVal2);
		etResult = (EditText) findViewById(R.id.etResult);
		
		Button add = (Button)findViewById(R.id.btnAdd);
		add.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				int value1 =  toInt(etValue1.getText().toString());
				int value2  = toInt(etValue2.getText().toString());
				int result = add(value1, value2);
				etResult.setText(Integer.toString(result));
			}
		});
		
		findViewById(R.id.btnSub).setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				int value1 =  toInt(etValue1.getText().toString());
				int value2  = toInt(etValue2.getText().toString());
				int result = sub(value1, value2);
				etResult.setText(Integer.toString(result));
			}
		});
		
findViewById(R.id.btnMul).setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				int value1 =  toInt(etValue1.getText().toString());
				int value2  = toInt(etValue2.getText().toString());
				int result = mul(value1, value2);
				etResult.setText(Integer.toString(result));
			}
		});

findViewById(R.id.btnDiv).setOnClickListener(new OnClickListener() {
	
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		int value1 =  toInt(etValue1.getText().toString());
		int value2  = toInt(etValue2.getText().toString());
		int result =div(value1, value2);
		etResult.setText(Integer.toString(result));
	}
});

	}

	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}
