package com.example.tipcalculator;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class TipCalculator extends Activity {
	Button btnTip1;
	Button btnTip2;
	Button btnTip3;
	EditText etTotalAmount;
	EditText etTip;
	private float tip;
	private float totalAmount;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_tip_calculator);
		btnTip1 = (Button) findViewById(R.id.btnTip1);
		btnTip2 = (Button) findViewById(R.id.btnTip2);
		btnTip3 = (Button) findViewById(R.id.btnTip3);
		etTotalAmount = (EditText) findViewById(R.id.etTotalAmount);
		etTip = (EditText) findViewById(R.id.etTip);
		btnTip1.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				if (etTotalAmount.getText().toString().isEmpty()) {
					etTip.setText("");
					Context context = getApplicationContext();
					Toast toast = Toast.makeText(context,
							"Please enter Total Amount", Toast.LENGTH_LONG);
					toast.show();

				} else {
					calculateTip(10.0);
				}

			}

		});

		btnTip2.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				if (etTotalAmount.getText().toString().isEmpty()) {
					etTip.setText("");
					Context context = getApplicationContext();
					Toast toast = Toast.makeText(context,
							"Please enter Total Amount", Toast.LENGTH_LONG);
					toast.show();

				} else {
					calculateTip(20.0);
				}

			}
		});

		btnTip3.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				if (etTotalAmount.getText().toString().isEmpty()) {
					etTip.setText("");
					Context context = getApplicationContext();
					Toast toast = Toast.makeText(context,
							"Please enter Total Amount", Toast.LENGTH_LONG);
					toast.show();

				} else {
					calculateTip(30.0);
				}
			}
		});

	}

	private void calculateTip(double d) {
        
		totalAmount = Float.valueOf(etTotalAmount.getText().toString());

		tip = (float) (d / 100 * totalAmount);
		etTip.setText(Float.toString(tip));

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.tip_calculator, menu);
		return true;
	}

}
