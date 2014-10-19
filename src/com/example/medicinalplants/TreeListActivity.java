package com.example.medicinalplants;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.View;
import android.widget.Button;

public class TreeListActivity extends Activity {

	Button thankuniButton, kalmeghButton, nimButton, tulsiButton;
	Button bellButton, basokButton, durbaButton, boheraButton, noyontaraButton ,
	akondoButton ,anjonButton,kashrajButton,kholkeButton,koloskathiButton,lojjabotiButton,sharpaghandhaButton;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_tree_list);
		
		thankuniButton = (Button) findViewById(R.id.thankuniButton);
		bellButton = (Button) findViewById(R.id.bellButton);
		basokButton = (Button) findViewById(R.id.basokButton);
		durbaButton = (Button) findViewById(R.id.durbaButton);
		boheraButton = (Button) findViewById(R.id.boheraButton);
		kalmeghButton = (Button) findViewById(R.id.kalmeghButton);
		nimButton = (Button) findViewById(R.id.nimButton);
		tulsiButton = (Button) findViewById(R.id.tulsiButton);
		noyontaraButton = (Button) findViewById(R.id.noyontaraButton);
		akondoButton = (Button)findViewById(R.id.akondoButton);
		anjonButton = (Button)findViewById(R.id.anjonButton);
		kashrajButton=(Button)findViewById(R.id.kashrajButton);
		kholkeButton=(Button)findViewById(R.id.kholkeButton);
		koloskathiButton=(Button)findViewById(R.id.koloskathiButton);
		lojjabotiButton=(Button)findViewById(R.id.lojjabotiButton);
		sharpaghandhaButton=(Button)findViewById(R.id.sharpaghandhaButton);
		
		
		sharpaghandhaButton.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				Intent intent =new Intent(TreeListActivity.this,SharpaghandhaActivity.class);
				 startActivity(intent);
				
			}
		});
		
		lojjabotiButton.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				Intent intent =new Intent(TreeListActivity.this,LojjabotiActivity.class);
				 startActivity(intent);
				
			}
		});
		
		koloskathiButton.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				Intent intent =new Intent(TreeListActivity.this,KoloskathiActivity.class);
				 startActivity(intent);
				
			}
		});
		
		
		kholkeButton.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				Intent intent =new Intent(TreeListActivity.this,KholkeActivity.class);
				 startActivity(intent);
				
			}
		});
		
		kashrajButton.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				Intent intent =new Intent(TreeListActivity.this,KashrajActivity.class);
				 startActivity(intent);
				
			}
		});
		
		anjonButton.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				Intent intent =new Intent(TreeListActivity.this,AnjonActivity.class);
				 startActivity(intent);
				
			}
		});
		
		
		akondoButton.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
			 Intent intent =new Intent(TreeListActivity.this,AkondoActivity.class);
			 startActivity(intent);
				
			}
		});
		
		noyontaraButton.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				Intent intent = new Intent(TreeListActivity.this, NoyontaraActivity.class);
				startActivity(intent);	
			}
		});
		
		
		
		tulsiButton.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				Intent intent = new Intent(TreeListActivity.this, TulsiActivity.class);
				startActivity(intent);	
			}
		});
		
		
		nimButton.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				Intent intent = new Intent(TreeListActivity.this, NimActivity.class);
				startActivity(intent);	
			}
		});
		
		
		kalmeghButton.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				Intent intent = new Intent(TreeListActivity.this, KalmeghActivity.class);
				startActivity(intent);	
			}
		});
		
		
		boheraButton.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				Intent intent = new Intent(TreeListActivity.this, BoheraActivity.class);
				startActivity(intent);
			}
		});
		
		durbaButton.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				Intent intent = new Intent(TreeListActivity.this, DurbaActivity.class);
				startActivity(intent);
			}
		});
		
		basokButton.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				Intent intent = new Intent(TreeListActivity.this, BasokActivity.class);
				startActivity(intent);
			}
		});
		
		
		bellButton.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				Intent intent = new Intent(TreeListActivity.this, BellActivity.class);
				startActivity(intent);
			}
		});
		
		thankuniButton.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				Intent intent = new Intent(TreeListActivity.this, ThankuniActivity.class);
				startActivity(intent);
			}
		});
		
		
	}


}
