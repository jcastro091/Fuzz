package com.example.fuzz;



import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TabHost;
import android.widget.TabHost.TabSpec;

public class MainActivity extends Activity {

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		TabHost tabHost=(TabHost)findViewById(R.id.tabHost);
		tabHost.setup();

		TabSpec spec1=tabHost.newTabSpec("Tab 1");
		spec1.setContent(R.id.tab1);
		spec1.setIndicator("All");

		TabSpec spec2=tabHost.newTabSpec("Tab 2");
		spec2.setIndicator("Text");
		spec2.setContent(R.id.tab2);

		TabSpec spec3=tabHost.newTabSpec("Tab 3");
		spec3.setIndicator("Image");
		spec3.setContent(R.id.tab3);

		tabHost.addTab(spec1);
		tabHost.addTab(spec2);
		tabHost.addTab(spec3);
		
	ImageButton b1 = (ImageButton)findViewById(R.id.t5465465);
	b1.setOnClickListener(new OnClickListener() {

		public void onClick(View arg0) {
			// TODO Auto-generated method stub
			Intent newIntent = new Intent(MainActivity.this, Website.class);
			startActivity(newIntent);
		}});
	ImageButton b2 = (ImageButton)findViewById(R.id.t100);
	b2.setOnClickListener(new OnClickListener() {

		public void onClick(View arg0) {
			// TODO Auto-generated method stub
			Intent newIntent = new Intent(MainActivity.this, Website.class);
			startActivity(newIntent);
		}});
	ImageButton b3 = (ImageButton)findViewById(R.id.t12123);
	b3.setOnClickListener(new OnClickListener() {

		public void onClick(View arg0) {
			// TODO Auto-generated method stub
			Intent newIntent = new Intent(MainActivity.this, Website.class);
			startActivity(newIntent);
		}});
	ImageButton b4 = (ImageButton)findViewById(R.id.t312313);
	b4.setOnClickListener(new OnClickListener() {

		public void onClick(View arg0) {
			// TODO Auto-generated method stub
			Intent newIntent = new Intent(MainActivity.this, Website.class);
			startActivity(newIntent);
		}});
	ImageButton b5 = (ImageButton)findViewById(R.id.t568567347);
	b5.setOnClickListener(new OnClickListener() {

		public void onClick(View arg0) {
			// TODO Auto-generated method stub
			Intent newIntent = new Intent(MainActivity.this, Website.class);
			startActivity(newIntent);
		}});
	ImageButton b6 = (ImageButton)findViewById(R.id.t352352352351241534645856856846856753467456745684679578096780678967893547);
	b6.setOnClickListener(new OnClickListener() {

		public void onClick(View arg0) {
			// TODO Auto-generated method stub
			Intent newIntent = new Intent(MainActivity.this, Website.class);
			startActivity(newIntent);
		}});
	ImageButton b7 = (ImageButton)findViewById(R.id.t5465466);
	b6.setOnClickListener(new OnClickListener() {

		public void onClick(View arg0) {
			// TODO Auto-generated method stub
			Intent newIntent = new Intent(MainActivity.this, Website.class);
			startActivity(newIntent);
		}});
	ImageButton b8 = (ImageButton)findViewById(R.id.t101);
	b8.setOnClickListener(new OnClickListener() {

		public void onClick(View arg0) {
			// TODO Auto-generated method stub
			Intent newIntent = new Intent(MainActivity.this, Website.class);
			startActivity(newIntent);
		}});
	ImageButton b9 = (ImageButton)findViewById(R.id.t12123);
	b9.setOnClickListener(new OnClickListener() {

		public void onClick(View arg0) {
			// TODO Auto-generated method stub
			Intent newIntent = new Intent(MainActivity.this, Website.class);
			startActivity(newIntent);
		}});
	ImageButton b10 = (ImageButton)findViewById(R.id.t312312);
	b10.setOnClickListener(new OnClickListener() {

		public void onClick(View arg0) {
			// TODO Auto-generated method stub
			Intent newIntent = new Intent(MainActivity.this, Website.class);
			startActivity(newIntent);
		}});
	ImageButton b11 = (ImageButton)findViewById(R.id.t568567346);
	b11.setOnClickListener(new OnClickListener() {

		public void onClick(View arg0) {
			// TODO Auto-generated method stub
			Intent newIntent = new Intent(MainActivity.this, Website.class);
			startActivity(newIntent);
		}});
	ImageButton b12 = (ImageButton)findViewById(R.id.t352352352351241534645856856846856753467456745684679578096780678967893546);
	b12.setOnClickListener(new OnClickListener() {

		public void onClick(View arg0) {
			// TODO Auto-generated method stub
			Intent newIntent = new Intent(MainActivity.this, Website.class);
			startActivity(newIntent);
		}});
	
	
}}