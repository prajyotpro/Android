package com.example.xo1120;


import java.util.ArrayList;
import android.os.Bundle;
import android.app.Activity;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import android.view.View.OnKeyListener;

public class MainActivity extends Activity {

	EditText t1, t2, t3 ,t4, t5, t6, t7, t8, t9;
	TextView tv;
	Button p1, p2;
	
	//Checking for matrix if any player won
	public void matCheck(String mat[][]){
		if(((mat[0][0]  == "1")&&(mat[0][1]  == "1")&&(mat[0][2]  == "1"))||
		   ((mat[1][0]  == "1")&&(mat[1][1]  == "1")&&(mat[1][2]  == "1"))||
		   ((mat[2][0]  == "1")&&(mat[2][1]  == "1")&&(mat[2][2]  == "1"))||
		   ((mat[0][0]  == "1")&&(mat[1][0]  == "1")&&(mat[2][0]  == "1"))||
		   ((mat[0][1]  == "1")&&(mat[1][1]  == "1")&&(mat[2][1]  == "1"))||
		   ((mat[0][2]  == "1")&&(mat[1][2]  == "1")&&(mat[2][2]  == "1"))||
		   ((mat[0][0]  == "1")&&(mat[1][1]  == "1")&&(mat[2][2]  == "1"))||
		   ((mat[0][2]  == "1")&&(mat[1][1]  == "1")&&(mat[2][0]  == "1"))
		  ){
				Toast msg = Toast.makeText(getBaseContext(),"Player 1 Won", 2);
				msg.show();
		}else if(((mat[0][0]  == "0")&&(mat[0][1]  == "0")&&(mat[0][2]  == "0"))||
			     ((mat[1][0]  == "0")&&(mat[1][1]  == "0")&&(mat[1][2]  == "0"))||
			     ((mat[2][0]  == "0")&&(mat[2][1]  == "0")&&(mat[2][2]  == "0"))||
			     ((mat[0][0]  == "0")&&(mat[1][0]  == "0")&&(mat[2][0]  == "0"))||
				 ((mat[0][1]  == "0")&&(mat[1][1]  == "0")&&(mat[2][1]  == "0"))||
				 ((mat[0][2]  == "0")&&(mat[1][2]  == "0")&&(mat[2][2]  == "0"))||
				 ((mat[0][0]  == "0")&&(mat[1][1]  == "0")&&(mat[2][2]  == "0"))||
				 ((mat[0][2]  == "0")&&(mat[1][1]  == "0")&&(mat[2][0]  == "0"))
				){
				Toast msg = Toast.makeText(getBaseContext(),"Player 2 Won", 2);
				msg.show();	
		}
	}
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		t1 = (EditText)findViewById(R.id.editText1);
		t2 = (EditText)findViewById(R.id.EditText01);
		t3 = (EditText)findViewById(R.id.EditText02);
		t4 = (EditText)findViewById(R.id.EditText03);
		t5 = (EditText)findViewById(R.id.EditText04);
		t6 = (EditText)findViewById(R.id.EditText05);
		t7 = (EditText)findViewById(R.id.EditText06);
		t8 = (EditText)findViewById(R.id.EditText07);
		t9 = (EditText)findViewById(R.id.EditText08);
		
		tv = (TextView)findViewById(R.id.textView2);
		
		p1 = (Button)findViewById(R.id.button1);
		p2 = (Button)findViewById(R.id.button2);
		
		//Declaration of 3x3 matrix
		final String mat[][] = new String[3][3];
		
		//for text 1 and mat[0][0]
		t1.setOnKeyListener(new OnKeyListener(){
			@Override
			public boolean onKey(View v, int keyCode, KeyEvent event) {
				// TODO Auto-generated method stub
				if(p1.isEnabled() == false){
					if((event.getAction() == KeyEvent.ACTION_UP)&&(keyCode == KeyEvent.KEYCODE_1)){
						mat[0][0] = "1";
						t1.setText("1");
						t1.setEnabled(false);
						p1.setEnabled(true);
						p2.setEnabled(false);	
						matCheck(mat);
						tv.setText("Play On");
					}else{
						tv.setText("Enter 1");
					}
				}else{
					if((event.getAction() == KeyEvent.ACTION_UP)&&(keyCode == KeyEvent.KEYCODE_0)){
						mat[0][0] = "0";
						t1.setText("0");
						t1.setEnabled(false);
						p2.setEnabled(true);
						p1.setEnabled(false);
						matCheck(mat);
						tv.setText("Play On");
					}
					else{
						tv.setText("Enter 0");
					}
				}
				return false;
			}
		});
		
		//for text 2 and mat[0][1]
		t2.setOnKeyListener(new OnKeyListener(){
			@Override
			public boolean onKey(View v, int keyCode, KeyEvent event) {
				// TODO Auto-generated method stub
				if(p1.isEnabled() == false){
					if((event.getAction() == KeyEvent.ACTION_UP)&&(keyCode == KeyEvent.KEYCODE_1)){
						mat[0][1] = "1";
						t2.setText("1");
						t2.setEnabled(false);
						p1.setEnabled(true);
						p2.setEnabled(false);	
						matCheck(mat);
						tv.setText("Play On");
					}else{
						tv.setText("Enter 1");
					}
				}else{
					if((event.getAction() == KeyEvent.ACTION_UP)&&(keyCode == KeyEvent.KEYCODE_0)){
						mat[0][1] = "0";
						t2.setText("0");
						t2.setEnabled(false);
						p2.setEnabled(true);
						p1.setEnabled(false);
						matCheck(mat);
						tv.setText("Play On");
					}
					else{
						tv.setText("Enter 0");
					}
				}
				return false;
			}
		});
		
		//for text 3 and mat[0][2]
		t3.setOnKeyListener(new OnKeyListener(){
			@Override
			public boolean onKey(View v, int keyCode, KeyEvent event) {
				// TODO Auto-generated method stub
				if(p1.isEnabled() == false){
					if((event.getAction() == KeyEvent.ACTION_UP)&&(keyCode == KeyEvent.KEYCODE_1)){
						mat[0][2] = "1";
						t3.setText("1");
						t3.setEnabled(false);
						p1.setEnabled(true);
						p2.setEnabled(false);	
						matCheck(mat);
						tv.setText("Play On");
					}else{
						tv.setText("Enter 1");
					}
				}else{
					if((event.getAction() == KeyEvent.ACTION_UP)&&(keyCode == KeyEvent.KEYCODE_0)){
						mat[0][2] = "0";
						t3.setText("0");
						t3.setEnabled(false);
						p2.setEnabled(true);
						p1.setEnabled(false);
						matCheck(mat);
						tv.setText("Play On");
					}
					else{
						tv.setText("Enter 0");
					}
				}
				return false;
			}
		});
		
		//for text 4 and mat[1][0]
		t4.setOnKeyListener(new OnKeyListener(){
			@Override
			public boolean onKey(View v, int keyCode, KeyEvent event) {
				// TODO Auto-generated method stub
				if(p1.isEnabled() == false){
					if((event.getAction() == KeyEvent.ACTION_UP)&&(keyCode == KeyEvent.KEYCODE_1)){
						mat[1][0] = "1";
						t4.setText("1");
						t4.setEnabled(false);
						p1.setEnabled(true);
						p2.setEnabled(false);	
						matCheck(mat);
						tv.setText("Play On");
					}else{
						tv.setText("Enter 1");
					}
				}else{
					if((event.getAction() == KeyEvent.ACTION_UP)&&(keyCode == KeyEvent.KEYCODE_0)){
						mat[1][0] = "0";
						t4.setText("0");
						t4.setEnabled(false);
						p2.setEnabled(true);
						p1.setEnabled(false);
						matCheck(mat);
						tv.setText("Play On");
					}
					else{
						tv.setText("Enter 0");
					}
				}
				return false;
			}
		});
		
		//for text 5 and mat[1][1]
		t5.setOnKeyListener(new OnKeyListener(){
			@Override
			public boolean onKey(View v, int keyCode, KeyEvent event) {
				// TODO Auto-generated method stub
				if(p1.isEnabled() == false){
					if((event.getAction() == KeyEvent.ACTION_UP)&&(keyCode == KeyEvent.KEYCODE_1)){
						mat[1][1] = "1";
						t5.setText("1");
						t5.setEnabled(false);
						p1.setEnabled(true);
						p2.setEnabled(false);	
						matCheck(mat);
						tv.setText("Play On");
					}else{
						tv.setText("Enter 1");
					}
				}else{
					if((event.getAction() == KeyEvent.ACTION_UP)&&(keyCode == KeyEvent.KEYCODE_0)){
						mat[1][1] = "0";
						t5.setText("0");
						t5.setEnabled(false);
						p2.setEnabled(true);
						p1.setEnabled(false);
						matCheck(mat);
						tv.setText("Play On");
					}
					else{
						tv.setText("Enter 0");
					}
				}
				return false;
			}
		});
		
		//for text 6 and mat[1][2]
		t6.setOnKeyListener(new OnKeyListener(){
			@Override
			public boolean onKey(View v, int keyCode, KeyEvent event) {
				// TODO Auto-generated method stub
				if(p1.isEnabled() == false){
					if((event.getAction() == KeyEvent.ACTION_UP)&&(keyCode == KeyEvent.KEYCODE_1)){
						mat[1][2] = "1";
						t6.setText("1");
						t6.setEnabled(false);
						p1.setEnabled(true);
						p2.setEnabled(false);	
						matCheck(mat);
						tv.setText("Play On");
					}else{
						tv.setText("Enter 1");
					}
				}else{
					if((event.getAction() == KeyEvent.ACTION_UP)&&(keyCode == KeyEvent.KEYCODE_0)){
						mat[1][2] = "0";
						t6.setText("0");
						t6.setEnabled(false);
						p2.setEnabled(true);
						p1.setEnabled(false);
						matCheck(mat);
						tv.setText("Play On");
					}
					else{
						tv.setText("Enter 0");
					}
				}
				return false;
			}
		});
		
		//for text 7 and mat[2][0]
		t7.setOnKeyListener(new OnKeyListener(){
			@Override
			public boolean onKey(View v, int keyCode, KeyEvent event) {
				// TODO Auto-generated method stub
				if(p1.isEnabled() == false){
					if((event.getAction() == KeyEvent.ACTION_UP)&&(keyCode == KeyEvent.KEYCODE_1)){
						mat[2][0] = "1";
						t7.setText("1");
						t7.setEnabled(false);
						p1.setEnabled(true);
						p2.setEnabled(false);	
						matCheck(mat);
						tv.setText("Play On");
					}else{
						tv.setText("Enter 1");
					}
				}else{
					if((event.getAction() == KeyEvent.ACTION_UP)&&(keyCode == KeyEvent.KEYCODE_0)){
						mat[2][0] = "0";
						t7.setText("0");
						t7.setEnabled(false);
						p2.setEnabled(true);
						p1.setEnabled(false);
						matCheck(mat);
						tv.setText("Play On");
					}
					else{
						tv.setText("Enter 0");
					}
				}
				return false;
			}
		});
		
		//for text 8 and mat[2][1]
		t8.setOnKeyListener(new OnKeyListener(){
			@Override
			public boolean onKey(View v, int keyCode, KeyEvent event) {
				// TODO Auto-generated method stub
				if(p1.isEnabled() == false){
					if((event.getAction() == KeyEvent.ACTION_UP)&&(keyCode == KeyEvent.KEYCODE_1)){
						mat[2][1] = "1";
						t8.setText("1");
						t8.setEnabled(false);
						p1.setEnabled(true);
						p2.setEnabled(false);	
						matCheck(mat);
						tv.setText("Play On");
					}else{
						tv.setText("Enter 1");
					}
				}else{
					if((event.getAction() == KeyEvent.ACTION_UP)&&(keyCode == KeyEvent.KEYCODE_0)){
						mat[2][1] = "0";
						t8.setText("0");
						t8.setEnabled(false);
						p2.setEnabled(true);
						p1.setEnabled(false);
						matCheck(mat);
						tv.setText("Play On");
					}
					else{
						tv.setText("Enter 0");
					}
				}
				return false;
			}
		});
		
		//for text 9 and mat[2][2]
		t9.setOnKeyListener(new OnKeyListener(){
			@Override
			public boolean onKey(View v, int keyCode, KeyEvent event) {
				// TODO Auto-generated method stub
				if(p1.isEnabled() == false){
					if((event.getAction() == KeyEvent.ACTION_UP)&&(keyCode == KeyEvent.KEYCODE_1)){
						mat[2][2] = "1";
						t9.setText("1");
						t9.setEnabled(false);
						p1.setEnabled(true);
						p2.setEnabled(false);	
						matCheck(mat);
						tv.setText("Play On");
					}else{
						tv.setText("Enter 1");
					}
				}else{
					if((event.getAction() == KeyEvent.ACTION_UP)&&(keyCode == KeyEvent.KEYCODE_0)){
						mat[2][2] = "0";
						t9.setText("0");
						t9.setEnabled(false);
						p2.setEnabled(true);
						p1.setEnabled(false);
						matCheck(mat);
						tv.setText("Play On");
					}
					else{
						tv.setText("Enter 0");
					}
				}
				return false;
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
