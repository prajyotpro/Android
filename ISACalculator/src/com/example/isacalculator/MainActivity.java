package com.example.isacalculator;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View.OnClickListener;
import android.widget.*;
import android.view.View;

public class MainActivity extends Activity {
	
	
	EditText text;
	Button b1;
	Button b2;
	Button b3;
	Button b4;
	Button b5;
	Button b6;
	Button b7;
	Button b8;
	Button b9;
	Button b0;
	Button div;
	Button add;
	Button sub;
	Button mul;
	Button clear;
	

	String val = "";
	//String val2;
	String op = "";
	String tot = "";
	int num = 0;
	
	
	public void check(){
		if(this.op.equals("+")){
			this.num = Integer.parseInt(this.tot) + Integer.parseInt(this.val);
			this.tot = Integer.toString(this.num);
			this.op = "";
		}else if(this.op.equals("-")){
			this.num = Integer.parseInt(this.tot) - Integer.parseInt(this.val);
			this.tot = Integer.toString(this.num);
			this.op = "";
		}else if(this.op.equals("*")){
			this.num = Integer.parseInt(this.tot) * Integer.parseInt(this.val);
			this.tot = Integer.toString(this.num);
			this.op = "";
		}else if(this.op.equals("/")){
			this.num = Integer.parseInt(this.tot) / Integer.parseInt(this.val);
			this.tot = Integer.toString(this.num);
			this.op = "";
		}else{
			this.tot = this.val;
			this.op = "";
		}
	}
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		text = (EditText)findViewById(R.id.editText1);
		b1 = (Button)findViewById(R.id.button7);
		b2 = (Button)findViewById(R.id.button8);
		b3 = (Button)findViewById(R.id.button9);
		b4 = (Button)findViewById(R.id.button4);
		b5 = (Button)findViewById(R.id.button5);
		b6 = (Button)findViewById(R.id.button6);
		b7 = (Button)findViewById(R.id.button3);
		b8 = (Button)findViewById(R.id.button2);
		b9 = (Button)findViewById(R.id.button1);
		b0 = (Button)findViewById(R.id.button10);
		div = (Button)findViewById(R.id.button12);
		add = (Button)findViewById(R.id.button15);
		sub = (Button)findViewById(R.id.button14);
		mul = (Button)findViewById(R.id.button13);
		clear = (Button)findViewById(R.id.button11);
		
		b1.setOnClickListener(new OnClickListener(){
		public void onClick(View w){
				val = b1.getText().toString();
				check();
				text.setText(tot);
			}
		});
		
		b2.setOnClickListener(new OnClickListener(){
			public void onClick(View w){
				val = b2.getText().toString();
				check();
				text.setText(tot);
			}
		});
		
		b3.setOnClickListener(new OnClickListener(){
			public void onClick(View w){
				val = b3.getText().toString();
				check();
				text.setText(tot);
			}
		});
		
		b4.setOnClickListener(new OnClickListener(){
			public void onClick(View w){
				val = b4.getText().toString();
				check();
				text.setText(tot);
			}
		});
		
		b5.setOnClickListener(new OnClickListener(){
			public void onClick(View w){
				val = b5.getText().toString();
				check();
				text.setText(tot);
			}
		});
		
		b6.setOnClickListener(new OnClickListener(){
			public void onClick(View w){
				val = b6.getText().toString();
				check();
				text.setText(tot);
			}
		});
		
		b7.setOnClickListener(new OnClickListener(){
			public void onClick(View w){
				val = b7.getText().toString();
				check();
				text.setText(tot);
			}
		});
		
		b8.setOnClickListener(new OnClickListener(){
			public void onClick(View w){
				val = b8.getText().toString();
				check();
				text.setText(tot);
			}
		});
		
		b9.setOnClickListener(new OnClickListener(){
			public void onClick(View w){
				val = b9.getText().toString();
				check();
				text.setText(tot);
			}
		});
		
		b0.setOnClickListener(new OnClickListener(){
			public void onClick(View w){
				val = b0.getText().toString();
				check();
				text.setText(tot);
			}
		});
		
		add.setOnClickListener(new OnClickListener(){
			public void onClick(View w){
				if((val == "")&&(tot == "")){
					Toast msg = Toast.makeText(getBaseContext(),"Enter Number!", 2);
					msg.show();
				}else{
					op = add.getText().toString();
				}
			}
		});
		
		sub.setOnClickListener(new OnClickListener(){
			public void onClick(View w){
				if((val == "")&&(tot == "")){
					Toast msg = Toast.makeText(getBaseContext(),"Enter Number!", 2);
					msg.show();
				}else{
					op = sub.getText().toString();
				}
			}
		});
		
		mul.setOnClickListener(new OnClickListener(){
			public void onClick(View w){
				if((val == "")&&(tot == "")){
					Toast msg = Toast.makeText(getBaseContext(),"Enter Number!", 2);
					msg.show();
				}else{
					op = mul.getText().toString();
				}
			}
		});
		
		div.setOnClickListener(new OnClickListener(){
			public void onClick(View w){
				if((val == "")&&(tot == "")){
					Toast msg = Toast.makeText(getBaseContext(),"Enter Number!", 2);
					msg.show();
				}else{
					op = div.getText().toString(); 
				}
			}
		});
			
		clear.setOnClickListener(new OnClickListener(){
			public void onClick(View w){
				op = "";
				val = "";
				tot = "";
				num = 0;
				text.setText(tot);
			}
		});
			
			
		
		
	}
	
	

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
